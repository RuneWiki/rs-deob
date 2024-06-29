import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class242 {

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "I")
    private int field3348 = class17.method96(16);

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "I")
    private int field3352 = class17.method96(24);

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "I")
    private int field3353 = class17.method96(24);

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "I")
    private int field3350 = class17.method96(24) + 1;

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "I")
    private int field3354 = class17.method96(6) + 1;

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "I")
    private int field3349 = class17.method96(8);

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "[I")
    private int[] field3351;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "([FIZ)V")
    public final void method1524(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class17.field212[this.field3349].field2468;
        int var6 = this.field3353 - this.field3352;
        int var7 = var6 / this.field3350;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class17.field212[this.field3349].method1170();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field3354;
                        }
                        var11 /= this.field3354;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field3351[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field3350 * var10 + this.field3352;
                        class174 var17 = class17.field212[var15];
                        if (this.field3348 == 0) {
                            int var18 = this.field3350 / var17.field2468;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1171();
                                for (int var21 = 0; var21 < var17.field2468; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field3350) {
                                float[] var23 = var17.method1171();
                                for (int var24 = 0; var24 < var17.field2468; var24++) {
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

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "()V")
    public class242() {
        int[] var1 = new int[this.field3354];
        for (int var2 = 0; var2 < this.field3354; var2++) {
            int var4 = 0;
            int var5 = class17.method96(3);
            boolean var6 = class17.method103() != 0;
            if (var6) {
                var4 = class17.method96(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field3351 = new int[this.field3354 * 8];
        for (int var3 = 0; var3 < this.field3354 * 8; var3++) {
            this.field3351[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class17.method96(8);
        }
    }
}
