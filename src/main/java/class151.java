import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class151 {

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "I")
    private int field2354 = class12.method65(16);

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
    private int field2351 = class12.method65(24);

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "I")
    private int field2348 = class12.method65(24);

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "I")
    private int field2349 = class12.method65(24) + 1;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "I")
    private int field2352 = class12.method65(6) + 1;

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "I")
    private int field2353 = class12.method65(8);

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "[I")
    private int[] field2350;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "([FIZ)V")
    public final void method1039(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class12.field135[this.field2353].field4132;
        int var6 = this.field2348 - this.field2351;
        int var7 = var6 / this.field2349;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class12.field135[this.field2353].method1741();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field2352;
                        }
                        var11 /= this.field2352;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field2350[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field2349 * var10 + this.field2351;
                        class254 var17 = class12.field135[var15];
                        if (this.field2354 == 0) {
                            int var18 = this.field2349 / var17.field4132;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1740();
                                for (int var21 = 0; var21 < var17.field4132; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field2349) {
                                float[] var23 = var17.method1740();
                                for (int var24 = 0; var24 < var17.field4132; var24++) {
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

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "()V")
    public class151() {
        int[] var1 = new int[this.field2352];
        for (int var2 = 0; var2 < this.field2352; var2++) {
            int var4 = 0;
            int var5 = class12.method65(3);
            boolean var6 = class12.method64() != 0;
            if (var6) {
                var4 = class12.method65(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field2350 = new int[this.field2352 * 8];
        for (int var3 = 0; var3 < this.field2352 * 8; var3++) {
            this.field2350[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class12.method65(8);
        }
    }
}
