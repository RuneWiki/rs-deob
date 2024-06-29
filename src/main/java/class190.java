import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class190 {

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "I")
    private int field2471 = class590.method3324(16);

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "I")
    private int field2468 = class590.method3324(24);

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "I")
    private int field2467 = class590.method3324(24);

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "I")
    private int field2469 = class590.method3324(24) + 1;

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "I")
    private int field2470 = class590.method3324(6) + 1;

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "I")
    private int field2472 = class590.method3324(8);

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "[I")
    private int[] field2473;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "([FIZ)V")
    public final void method1264(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class590.field8048[this.field2472].field9664;
        int var6 = this.field2467 - this.field2468;
        int var7 = var6 / this.field2469;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class590.field8048[this.field2472].method3930();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field2470;
                        }
                        var11 /= this.field2470;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field2473[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field2469 * var10 + this.field2468;
                        class707 var17 = class590.field8048[var15];
                        if (this.field2471 == 0) {
                            int var18 = this.field2469 / var17.field9664;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method3928();
                                for (int var21 = 0; var21 < var17.field9664; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field2469) {
                                float[] var23 = var17.method3928();
                                for (int var24 = 0; var24 < var17.field9664; var24++) {
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

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "()V")
    public class190() {
        int[] var1 = new int[this.field2470];
        for (int var2 = 0; var2 < this.field2470; var2++) {
            int var4 = 0;
            int var5 = class590.method3324(3);
            boolean var6 = class590.method3317() != 0;
            if (var6) {
                var4 = class590.method3324(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field2473 = new int[this.field2470 * 8];
        for (int var3 = 0; var3 < this.field2470 * 8; var3++) {
            this.field2473[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class590.method3324(8);
        }
    }
}
