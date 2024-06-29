import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class192 {

    @OriginalMember(owner = "client!si", name = "d", descriptor = "I")
    private int field3287 = class53.method349(16);

    @OriginalMember(owner = "client!si", name = "a", descriptor = "I")
    private int field3284 = class53.method349(24);

    @OriginalMember(owner = "client!si", name = "e", descriptor = "I")
    private int field3288 = class53.method349(24);

    @OriginalMember(owner = "client!si", name = "b", descriptor = "I")
    private int field3285 = class53.method349(24) + 1;

    @OriginalMember(owner = "client!si", name = "g", descriptor = "I")
    private int field3290 = class53.method349(6) + 1;

    @OriginalMember(owner = "client!si", name = "f", descriptor = "I")
    private int field3289 = class53.method349(8);

    @OriginalMember(owner = "client!si", name = "c", descriptor = "[I")
    private int[] field3286;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "([FIZ)V")
    public final void method1318(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class53.field916[this.field3289].field4576;
        int var6 = this.field3288 - this.field3284;
        int var7 = var6 / this.field3285;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class53.field916[this.field3289].method1783();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field3290;
                        }
                        var11 /= this.field3290;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field3286[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field3285 * var10 + this.field3284;
                        class257 var17 = class53.field916[var15];
                        if (this.field3287 == 0) {
                            int var18 = this.field3285 / var17.field4576;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1782();
                                for (int var21 = 0; var21 < var17.field4576; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field3285) {
                                float[] var23 = var17.method1782();
                                for (int var24 = 0; var24 < var17.field4576; var24++) {
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

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "()V")
    public class192() {
        int[] var1 = new int[this.field3290];
        for (int var2 = 0; var2 < this.field3290; var2++) {
            int var4 = 0;
            int var5 = class53.method349(3);
            boolean var6 = class53.method354() != 0;
            if (var6) {
                var4 = class53.method349(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field3286 = new int[this.field3290 * 8];
        for (int var3 = 0; var3 < this.field3290 * 8; var3++) {
            this.field3286[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class53.method349(8);
        }
    }
}
