import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class225 {

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "I")
    private int field3795 = class310.method2118(16);

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "I")
    private int field3796 = class310.method2118(24);

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "I")
    private int field3794 = class310.method2118(24);

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "I")
    private int field3793 = class310.method2118(24) + 1;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "I")
    private int field3790 = class310.method2118(6) + 1;

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "I")
    private int field3791 = class310.method2118(8);

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "[I")
    private int[] field3792;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "([FIZ)V", line = 7)
    public final void method1539(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class310.field5265[this.field3791].field3557;
        int var6 = this.field3794 - this.field3796;
        int var7 = var6 / this.field3793;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class310.field5265[this.field3791].method1454();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field3790;
                        }
                        var11 /= this.field3790;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field3792[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field3793 * var10 + this.field3796;
                        class208 var17 = class310.field5265[var15];
                        if (this.field3795 == 0) {
                            int var18 = this.field3793 / var17.field3557;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1456();
                                for (int var21 = 0; var21 < var17.field3557; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field3793) {
                                float[] var23 = var17.method1456();
                                for (int var24 = 0; var24 < var17.field3557; var24++) {
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

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "()V", line = 133)
    public class225() {
        int[] var1 = new int[this.field3790];
        for (int var2 = 0; var2 < this.field3790; var2++) {
            int var3 = 0;
            int var4 = class310.method2118(3);
            boolean var5 = class310.method2123() != 0;
            if (var5) {
                var3 = class310.method2118(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field3792 = new int[this.field3790 * 8];
        for (int var6 = 0; var6 < this.field3790 * 8; var6++) {
            this.field3792[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class310.method2118(8);
        }
    }
}
