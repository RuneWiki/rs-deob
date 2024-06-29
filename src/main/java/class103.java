import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class103 {

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "[Lra;")
    private class38[] field1613 = new class38[10];

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
    private int field1611;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    private int field1612;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "()I")
    public final int method690() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1613[var2] != null && this.field1613[var2].field610 / 20 < var1) {
                var1 = this.field1613[var2].field610 / 20;
            }
        }
        if (this.field1611 < this.field1612 && this.field1611 / 20 < var1) {
            var1 = this.field1611 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1613[var3] != null) {
                this.field1613[var3].field610 -= var1 * 20;
            }
        }
        if (this.field1611 < this.field1612) {
            this.field1611 -= var1 * 20;
            this.field1612 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "()[B")
    private final byte[] method691() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1613[var2] != null && this.field1613[var2].field610 + this.field1613[var2].field603 > var1) {
                var1 = this.field1613[var2].field610 + this.field1613[var2].field603;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1613[var5] != null) {
                int var6 = this.field1613[var5].field603 * 22050 / 1000;
                int var7 = this.field1613[var5].field610 * 22050 / 1000;
                int[] var8 = this.field1613[var5].method266(var6, this.field1613[var5].field603);
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

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "()Lbk;")
    public final class142 method692() {
        byte[] var1 = this.method691();
        return new class142(22050, var1, this.field1611 * 22050 / 1000, this.field1612 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljl;II)Lwd;")
    public static final class103 method693(class101 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method666(arg2, arg1, (byte) -51);
        return var3 == null ? null : new class103(new class187(var3));
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(Lva;)V")
    private class103(class187 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1268(255);
            if (var3 != 0) {
                arg0.field3169--;
                this.field1613[var2] = new class38();
                this.field1613[var2].method267(arg0);
            }
        }
        this.field1611 = arg0.method1244(false);
        this.field1612 = arg0.method1244(false);
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "()V")
    private class103() {
    }
}
