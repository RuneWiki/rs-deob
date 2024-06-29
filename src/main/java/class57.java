import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class57 {

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "I")
    private int field746 = class155.method1163(16);

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "I")
    private int field743 = class155.method1163(24);

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "I")
    private int field742 = class155.method1163(24);

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "I")
    private int field744 = class155.method1163(24) + 1;

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "I")
    private int field747 = class155.method1163(6) + 1;

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "I")
    private int field745 = class155.method1163(8);

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "[I")
    private int[] field741;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "([FIZ)V", line = 12)
    public final void method407(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class155.field2352[this.field745].field212;
        int var6 = this.field742 - this.field743;
        int var7 = var6 / this.field744;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class155.field2352[this.field745].method139();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field747;
                        }
                        var11 /= this.field747;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field741[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field744 * var10 + this.field743;
                        class18 var17 = class155.field2352[var15];
                        if (this.field746 == 0) {
                            int var18 = this.field744 / var17.field212;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method136();
                                for (int var21 = 0; var21 < var17.field212; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field744) {
                                float[] var23 = var17.method136();
                                for (int var24 = 0; var24 < var17.field212; var24++) {
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

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "()V", line = 133)
    public class57() {
        int[] var1 = new int[this.field747];
        for (int var2 = 0; var2 < this.field747; var2++) {
            int var3 = 0;
            int var4 = class155.method1163(3);
            boolean var5 = class155.method1170() != 0;
            if (var5) {
                var3 = class155.method1163(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field741 = new int[this.field747 * 8];
        for (int var6 = 0; var6 < this.field747 * 8; var6++) {
            this.field741[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class155.method1163(8);
        }
    }
}
