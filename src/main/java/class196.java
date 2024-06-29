import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pw")
public class class196 {

    @OriginalMember(owner = "client!pw", name = "d", descriptor = "I")
    private int field2809 = class532.method3005(16);

    @OriginalMember(owner = "client!pw", name = "e", descriptor = "I")
    private int field2810 = class532.method3005(24);

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "I")
    private int field2806 = class532.method3005(24);

    @OriginalMember(owner = "client!pw", name = "f", descriptor = "I")
    private int field2811 = class532.method3005(24) + 1;

    @OriginalMember(owner = "client!pw", name = "c", descriptor = "I")
    private int field2808 = class532.method3005(6) + 1;

    @OriginalMember(owner = "client!pw", name = "b", descriptor = "I")
    private int field2807 = class532.method3005(8);

    @OriginalMember(owner = "client!pw", name = "g", descriptor = "[I")
    private int[] field2812;

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "([FIZ)V", line = 7)
    public final void method1288(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class532.field7407[this.field2807].field3696;
        int var6 = this.field2806 - this.field2810;
        int var7 = var6 / this.field2811;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class532.field7407[this.field2807].method1598();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field2808;
                        }
                        var11 /= this.field2808;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field2812[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field2811 * var10 + this.field2810;
                        class253 var17 = class532.field7407[var15];
                        if (this.field2809 == 0) {
                            int var18 = this.field2811 / var17.field3696;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1597();
                                for (int var21 = 0; var21 < var17.field3696; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field2811) {
                                float[] var23 = var17.method1597();
                                for (int var24 = 0; var24 < var17.field3696; var24++) {
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

    @OriginalMember(owner = "client!pw", name = "<init>", descriptor = "()V", line = 133)
    public class196() {
        int[] var1 = new int[this.field2808];
        for (int var2 = 0; var2 < this.field2808; var2++) {
            int var4 = 0;
            int var5 = class532.method3005(3);
            boolean var6 = class532.method3002() != 0;
            if (var6) {
                var4 = class532.method3005(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field2812 = new int[this.field2808 * 8];
        for (int var3 = 0; var3 < this.field2808 * 8; var3++) {
            this.field2812[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class532.method3005(8);
        }
    }
}
