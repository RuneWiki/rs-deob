import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class216 {

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "I")
    private int field3179 = class49.method330(16);

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
    private int field3176 = class49.method330(24);

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
    private int field3178 = class49.method330(24);

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
    private int field3180 = class49.method330(24) + 1;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
    private int field3175 = class49.method330(6) + 1;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
    private int field3181 = class49.method330(8);

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "[I")
    private int[] field3177;

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "()V")
    public class216() {
        int[] var1 = new int[this.field3175];
        for (int var2 = 0; var2 < this.field3175; var2++) {
            int var4 = 0;
            int var5 = class49.method330(3);
            boolean var6 = class49.method338() != 0;
            if (var6) {
                var4 = class49.method330(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field3177 = new int[this.field3175 * 8];
        for (int var3 = 0; var3 < this.field3175 * 8; var3++) {
            this.field3177[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class49.method330(8);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "([FIZ)V")
    public final void method1386(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class49.field728[this.field3181].field2653;
        int var6 = this.field3178 - this.field3176;
        int var7 = var6 / this.field3180;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class49.field728[this.field3181].method1205();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field3175;
                        }
                        var11 /= this.field3175;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field3177[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field3180 * var10 + this.field3176;
                        class186 var17 = class49.field728[var15];
                        if (this.field3179 == 0) {
                            int var18 = this.field3180 / var17.field2653;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1206();
                                for (int var21 = 0; var21 < var17.field2653; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field3180) {
                                float[] var23 = var17.method1206();
                                for (int var24 = 0; var24 < var17.field2653; var24++) {
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
