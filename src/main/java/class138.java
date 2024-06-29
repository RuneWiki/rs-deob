import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class138 {

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "I")
    private int field3203 = class93.method740(16);

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "I")
    private int field3199 = class93.method740(24);

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "I")
    private int field3197 = class93.method740(24);

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "I")
    private int field3201 = class93.method740(24) + 1;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "I")
    private int field3202 = class93.method740(6) + 1;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "I")
    private int field3200 = class93.method740(8);

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "[I")
    private int[] field3198;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "([FIZ)V")
    public final void method1044(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class93.field2150[this.field3200].field734;
        int var6 = this.field3197 - this.field3199;
        int var7 = var6 / this.field3201;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class93.field2150[this.field3200].method298();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field3202;
                        }
                        var11 /= this.field3202;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field3198[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field3201 * var10 + this.field3199;
                        class35 var17 = class93.field2150[var15];
                        if (this.field3203 == 0) {
                            int var18 = this.field3201 / var17.field734;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method296();
                                for (int var21 = 0; var21 < var17.field734; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field3201) {
                                float[] var23 = var17.method296();
                                for (int var24 = 0; var24 < var17.field734; var24++) {
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

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "()V")
    public class138() {
        int[] var1 = new int[this.field3202];
        for (int var2 = 0; var2 < this.field3202; var2++) {
            int var4 = 0;
            int var5 = class93.method740(3);
            boolean var6 = class93.method733() != 0;
            if (var6) {
                var4 = class93.method740(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field3198 = new int[this.field3202 * 8];
        for (int var3 = 0; var3 < this.field3202 * 8; var3++) {
            this.field3198[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class93.method740(8);
        }
    }
}
