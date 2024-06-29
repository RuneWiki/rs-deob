import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class165 {

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
    private int field2611 = class315.method2197(16);

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
    private int field2606 = class315.method2197(24);

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
    private int field2608 = class315.method2197(24);

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "I")
    private int field2610 = class315.method2197(24) + 1;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    private int field2607 = class315.method2197(6) + 1;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    private int field2605 = class315.method2197(8);

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "[I")
    private int[] field2609;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "([FIZ)V", line = 5)
    public final void method1101(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class315.field5462[this.field2605].field596;
        int var6 = this.field2608 - this.field2606;
        int var7 = var6 / this.field2610;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class315.field5462[this.field2605].method267();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field2607;
                        }
                        var11 /= this.field2607;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field2609[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field2610 * var10 + this.field2606;
                        class36 var17 = class315.field5462[var15];
                        if (this.field2611 == 0) {
                            int var18 = this.field2610 / var17.field596;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method266();
                                for (int var21 = 0; var21 < var17.field596; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field2610) {
                                float[] var23 = var17.method266();
                                for (int var24 = 0; var24 < var17.field596; var24++) {
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

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V", line = 133)
    public class165() {
        int[] var1 = new int[this.field2607];
        for (int var2 = 0; var2 < this.field2607; var2++) {
            int var3 = 0;
            int var4 = class315.method2197(3);
            boolean var5 = class315.method2204() != 0;
            if (var5) {
                var3 = class315.method2197(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field2609 = new int[this.field2607 * 8];
        for (int var6 = 0; var6 < this.field2607 * 8; var6++) {
            this.field2609[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class315.method2197(8);
        }
    }
}
