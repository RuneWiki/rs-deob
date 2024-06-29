import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class85 {

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "[Lph;")
    private class361[] field1437 = new class361[10];

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "I")
    private int field1436;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "I")
    private int field1435;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "()Lh;", line = 6)
    public final class110 method677() {
        byte[] var1 = this.method678();
        return new class110(22050, var1, this.field1436 * 22050 / 1000, this.field1435 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "()[B", line = 12)
    private final byte[] method678() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1437[var2] != null && this.field1437[var2].field5720 + this.field1437[var2].field5715 > var1) {
                var1 = this.field1437[var2].field5720 + this.field1437[var2].field5715;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1437[var5] != null) {
                int var6 = this.field1437[var5].field5720 * 22050 / 1000;
                int var7 = this.field1437[var5].field5715 * 22050 / 1000;
                int[] var8 = this.field1437[var5].method2535(var6, this.field1437[var5].field5720);
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

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "()I", line = 75)
    public final int method679() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1437[var2] != null && this.field1437[var2].field5715 / 20 < var1) {
                var1 = this.field1437[var2].field5715 / 20;
            }
        }
        if (this.field1436 < this.field1435 && this.field1436 / 20 < var1) {
            var1 = this.field1436 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1437[var3] != null) {
                this.field1437[var3].field5715 -= var1 * 20;
            }
        }
        if (this.field1436 < this.field1435) {
            this.field1436 -= var1 * 20;
            this.field1435 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lth;II)Ltn;", line = 118)
    public static final class85 method680(class57 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method472(arg2, 49, arg1);
        return var3 == null ? null : new class85(new class227(var3));
    }

    @OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(Lqm;)V", line = 129)
    private class85(class227 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1720((byte) -36);
            if (var3 != 0) {
                arg0.field3760--;
                this.field1437[var2] = new class361();
                this.field1437[var2].method2533(arg0);
            }
        }
        this.field1436 = arg0.method1765(true);
        this.field1435 = arg0.method1765(true);
    }

    @OriginalMember(owner = "client!tn", name = "<init>", descriptor = "()V", line = 149)
    private class85() {
    }
}
