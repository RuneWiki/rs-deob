import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class145 {

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
    private int field2130 = class135.method983(16);

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
    private int field2129 = class135.method983(24);

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
    private int field2127 = class135.method983(24);

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "I")
    private int field2131 = class135.method983(24) + 1;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
    private int field2133 = class135.method983(6) + 1;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
    private int field2128 = class135.method983(8);

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "[I")
    private int[] field2132;

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "()V")
    public class145() {
        int[] var1 = new int[this.field2133];
        for (int var2 = 0; var2 < this.field2133; var2++) {
            int var4 = 0;
            int var5 = class135.method983(3);
            boolean var6 = class135.method986() != 0;
            if (var6) {
                var4 = class135.method983(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field2132 = new int[this.field2133 * 8];
        for (int var3 = 0; var3 < this.field2133 * 8; var3++) {
            this.field2132[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class135.method983(8);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "([FIZ)V")
    public final void method1033(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class135.field2042[this.field2128].field7033;
        int var6 = this.field2127 - this.field2129;
        int var7 = var6 / this.field2131;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class135.field2042[this.field2128].method2894();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field2133;
                        }
                        var11 /= this.field2133;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field2132[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field2131 * var10 + this.field2129;
                        class479 var17 = class135.field2042[var15];
                        if (this.field2130 == 0) {
                            int var18 = this.field2131 / var17.field7033;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method2895();
                                for (int var21 = 0; var21 < var17.field7033; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field2131) {
                                float[] var23 = var17.method2895();
                                for (int var24 = 0; var24 < var17.field7033; var24++) {
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
}
