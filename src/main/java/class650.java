import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class650 {

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "I")
    private int field8797 = class211.method1347(16);

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "I")
    private int field8795 = class211.method1347(24);

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "I")
    private int field8794 = class211.method1347(24);

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "I")
    private int field8796 = class211.method1347(24) + 1;

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "I")
    private int field8799 = class211.method1347(6) + 1;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "I")
    private int field8793 = class211.method1347(8);

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "[I")
    private int[] field8798;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "([FIZ)V", line = 10)
    public final void method3563(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class211.field3015[this.field8793].field2751;
        int var6 = this.field8794 - this.field8795;
        int var7 = var6 / this.field8796;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class211.field3015[this.field8793].method1207();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field8799;
                        }
                        var11 /= this.field8799;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field8798[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field8796 * var10 + this.field8795;
                        class181 var17 = class211.field3015[var15];
                        if (this.field8797 == 0) {
                            int var18 = this.field8796 / var17.field2751;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1205();
                                for (int var21 = 0; var21 < var17.field2751; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field8796) {
                                float[] var23 = var17.method1205();
                                for (int var24 = 0; var24 < var17.field2751; var24++) {
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
    public class650() {
        int[] var1 = new int[this.field8799];
        for (int var2 = 0; var2 < this.field8799; var2++) {
            int var4 = 0;
            int var5 = class211.method1347(3);
            boolean var6 = class211.method1355() != 0;
            if (var6) {
                var4 = class211.method1347(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field8798 = new int[this.field8799 * 8];
        for (int var3 = 0; var3 < this.field8799 * 8; var3++) {
            this.field8798[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class211.method1347(8);
        }
    }
}
