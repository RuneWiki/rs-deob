import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class8 {

    @OriginalMember(owner = "client!b", name = "c", descriptor = "[Lha;")
    private class47[] field185 = new class47[10];

    @OriginalMember(owner = "client!b", name = "a", descriptor = "I")
    private int field183;

    @OriginalMember(owner = "client!b", name = "b", descriptor = "I")
    private int field184;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lac;II)Lb;", line = 7)
    public static final class8 method73(class4 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method27(arg2, true, arg1);
        return var3 == null ? null : new class8(new class140(var3));
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "()I", line = 15)
    public final int method74() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field185[var2] != null && this.field185[var2].field1142 / 20 < var1) {
                var1 = this.field185[var2].field1142 / 20;
            }
        }
        if (this.field183 < this.field184 && this.field183 / 20 < var1) {
            var1 = this.field183 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field185[var3] != null) {
                this.field185[var3].field1142 -= var1 * 20;
            }
        }
        if (this.field183 < this.field184) {
            this.field183 -= var1 * 20;
            this.field184 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "()Lca;", line = 59)
    public final class16 method75() {
        byte[] var1 = this.method76();
        return new class16(22050, var1, this.field183 * 22050 / 1000, this.field184 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lwd;)V", line = 69)
    private class8(class140 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1105(255);
            if (var3 != 0) {
                arg0.field3347--;
                this.field185[var2] = new class47();
                this.field185[var2].method393(arg0);
            }
        }
        this.field183 = arg0.method1072(91);
        this.field184 = arg0.method1072(28);
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "()V", line = 89)
    private class8() {
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "()[B", line = 94)
    private final byte[] method76() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field185[var2] != null && this.field185[var2].field1142 + this.field185[var2].field1128 > var1) {
                var1 = this.field185[var2].field1142 + this.field185[var2].field1128;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field185[var5] != null) {
                int var6 = this.field185[var5].field1128 * 22050 / 1000;
                int var7 = this.field185[var5].field1142 * 22050 / 1000;
                int[] var8 = this.field185[var5].method394(var6, this.field185[var5].field1128);
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
