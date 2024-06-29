import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class149 {

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "I")
    private int field1784 = class568.method3318(16);

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "I")
    private int field1778 = class568.method3318(24);

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "I")
    private int field1779 = class568.method3318(24);

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "I")
    private int field1783 = class568.method3318(24) + 1;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "I")
    private int field1780 = class568.method3318(6) + 1;

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "I")
    private int field1781 = class568.method3318(8);

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "[I")
    private int[] field1782;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "([FIZ)V")
    public final void method819(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class568.field8336[this.field1781].field6701;
        int var6 = this.field1779 - this.field1778;
        int var7 = var6 / this.field1783;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class568.field8336[this.field1781].method2784();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1780;
                        }
                        var11 /= this.field1780;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1782[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1783 * var10 + this.field1778;
                        class477 var17 = class568.field8336[var15];
                        if (this.field1784 == 0) {
                            int var18 = this.field1783 / var17.field6701;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method2783();
                                for (int var21 = 0; var21 < var17.field6701; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1783) {
                                float[] var23 = var17.method2783();
                                for (int var24 = 0; var24 < var17.field6701; var24++) {
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

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "()V")
    public class149() {
        int[] var1 = new int[this.field1780];
        for (int var2 = 0; var2 < this.field1780; var2++) {
            int var4 = 0;
            int var5 = class568.method3318(3);
            boolean var6 = class568.method3309() != 0;
            if (var6) {
                var4 = class568.method3318(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field1782 = new int[this.field1780 * 8];
        for (int var3 = 0; var3 < this.field1780 * 8; var3++) {
            this.field1782[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class568.method3318(8);
        }
    }
}
