import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class466 {

    @OriginalMember(owner = "client!ur", name = "d", descriptor = "I")
    private int field6921 = class654.method3729(16);

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "I")
    private int field6919 = class654.method3729(24);

    @OriginalMember(owner = "client!ur", name = "g", descriptor = "I")
    private int field6924 = class654.method3729(24);

    @OriginalMember(owner = "client!ur", name = "e", descriptor = "I")
    private int field6922 = class654.method3729(24) + 1;

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "I")
    private int field6920 = class654.method3729(6) + 1;

    @OriginalMember(owner = "client!ur", name = "f", descriptor = "I")
    private int field6923 = class654.method3729(8);

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "[I")
    private int[] field6918;

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "([FIZ)V")
    public final void method2850(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class654.field9412[this.field6923].field1698;
        int var6 = this.field6924 - this.field6919;
        int var7 = var6 / this.field6922;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class654.field9412[this.field6923].method832();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field6920;
                        }
                        var11 /= this.field6920;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field6918[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field6922 * var10 + this.field6919;
                        class138 var17 = class654.field9412[var15];
                        if (this.field6921 == 0) {
                            int var18 = this.field6922 / var17.field1698;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method831();
                                for (int var21 = 0; var21 < var17.field1698; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field6922) {
                                float[] var23 = var17.method831();
                                for (int var24 = 0; var24 < var17.field1698; var24++) {
                                    arg0[var16 + var22] += var23[var24];
                                    var22++;
                                }
                            }
                        }
                    }
                    var10++;
                    if (var10 >= var7) {
                        break;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ur", name = "<init>", descriptor = "()V")
    public class466() {
        int[] var1 = new int[this.field6920];
        for (int var2 = 0; var2 < this.field6920; var2++) {
            int var4 = 0;
            int var5 = class654.method3729(3);
            boolean var6 = class654.method3726() != 0;
            if (var6) {
                var4 = class654.method3729(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field6918 = new int[this.field6920 * 8];
        for (int var3 = 0; var3 < this.field6920 * 8; var3++) {
            this.field6918[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class654.method3729(8);
        }
    }
}
