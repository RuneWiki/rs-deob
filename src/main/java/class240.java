import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class240 {

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
    private int field4333 = class105.method715(16);

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "I")
    private int field4336 = class105.method715(24);

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "I")
    private int field4334 = class105.method715(24);

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "I")
    private int field4335 = class105.method715(24) + 1;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "I")
    private int field4339 = class105.method715(6) + 1;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
    private int field4338 = class105.method715(8);

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "[I")
    private int[] field4337;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "([FIZ)V")
    public final void method1660(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class105.field2021[this.field4338].field4478;
        int var6 = this.field4334 - this.field4336;
        int var7 = var6 / this.field4335;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class105.field2021[this.field4338].method1722();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field4339;
                        }
                        var11 /= this.field4339;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field4337[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field4335 * var10 + this.field4336;
                        class248 var17 = class105.field2021[var15];
                        if (this.field4333 == 0) {
                            int var18 = this.field4335 / var17.field4478;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1724();
                                for (int var21 = 0; var21 < var17.field4478; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field4335) {
                                float[] var23 = var17.method1724();
                                for (int var24 = 0; var24 < var17.field4478; var24++) {
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

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "()V")
    public class240() {
        int[] var1 = new int[this.field4339];
        for (int var2 = 0; var2 < this.field4339; var2++) {
            int var4 = 0;
            int var5 = class105.method715(3);
            boolean var6 = class105.method717() != 0;
            if (var6) {
                var4 = class105.method715(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field4337 = new int[this.field4339 * 8];
        for (int var3 = 0; var3 < this.field4339 * 8; var3++) {
            this.field4337[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class105.method715(8);
        }
    }
}
