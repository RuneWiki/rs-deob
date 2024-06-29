import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class133 {

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "I")
    private int field2313 = class288.method2025(16);

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "I")
    private int field2310 = class288.method2025(24);

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "I")
    private int field2312 = class288.method2025(24);

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "I")
    private int field2311 = class288.method2025(24) + 1;

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "I")
    private int field2314 = class288.method2025(6) + 1;

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "I")
    private int field2315 = class288.method2025(8);

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "[I")
    private int[] field2309;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "([FIZ)V", line = 8)
    public final void method947(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class288.field4966[this.field2315].field389;
        int var6 = this.field2312 - this.field2310;
        int var7 = var6 / this.field2311;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class288.field4966[this.field2315].method236();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field2314;
                        }
                        var11 /= this.field2314;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field2309[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field2311 * var10 + this.field2310;
                        class33 var17 = class288.field4966[var15];
                        if (this.field2313 == 0) {
                            int var18 = this.field2311 / var17.field389;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method237();
                                for (int var21 = 0; var21 < var17.field389; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field2311) {
                                float[] var23 = var17.method237();
                                for (int var24 = 0; var24 < var17.field389; var24++) {
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

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "()V", line = 133)
    public class133() {
        int[] var1 = new int[this.field2314];
        for (int var2 = 0; var2 < this.field2314; var2++) {
            int var3 = 0;
            int var4 = class288.method2025(3);
            boolean var5 = class288.method2033() != 0;
            if (var5) {
                var3 = class288.method2025(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field2309 = new int[this.field2314 * 8];
        for (int var6 = 0; var6 < this.field2314 * 8; var6++) {
            this.field2309[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class288.method2025(8);
        }
    }
}
