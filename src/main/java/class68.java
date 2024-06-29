import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class68 {

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "[Lab;")
    private class3[] field1623 = new class3[10];

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
    private int field1622;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "I")
    private int field1621;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "()Loc;", line = 6)
    public final class87 method479() {
        byte[] var1 = this.method482();
        return new class87(22050, var1, this.field1622 * 22050 / 1000, this.field1621 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "()I", line = 11)
    public final int method480() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1623[var2] != null && this.field1623[var2].field30 / 20 < var1) {
                var1 = this.field1623[var2].field30 / 20;
            }
        }
        if (this.field1622 < this.field1621 && this.field1622 / 20 < var1) {
            var1 = this.field1622 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1623[var3] != null) {
                this.field1623[var3].field30 -= var1 * 20;
            }
        }
        if (this.field1622 < this.field1621) {
            this.field1622 -= var1 * 20;
            this.field1621 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Ltc;)V", line = 126)
    private class68(class113 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method821(true);
            if (var3 != 0) {
                arg0.field2507--;
                this.field1623[var2] = new class3();
                this.field1623[var2].method23(arg0);
            }
        }
        this.field1622 = arg0.method870(-1);
        this.field1621 = arg0.method870(-1);
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "()V", line = 146)
    private class68() {
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lhe;II)Llb;", line = 61)
    public static final class68 method481(class47 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method315(arg1, true, arg2);
        return var3 == null ? null : new class68(new class113(var3));
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "()[B", line = 69)
    private final byte[] method482() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1623[var2] != null && this.field1623[var2].field38 + this.field1623[var2].field30 > var1) {
                var1 = this.field1623[var2].field38 + this.field1623[var2].field30;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1623[var5] != null) {
                int var6 = this.field1623[var5].field38 * 22050 / 1000;
                int var7 = this.field1623[var5].field30 * 22050 / 1000;
                int[] var8 = this.field1623[var5].method25(var6, this.field1623[var5].field38);
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = (var8[var9] >> 8) + var4[var7 + var9];
                    if ((var10 + 128 & 0xFFFFFF00) != 0) {
                        var10 = var10 >> 31 ^ 0x7F;
                    }
                    var4[var7 + var9] = (byte) var10;
                }
            }
        }
        return var4;
    }
}
