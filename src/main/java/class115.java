import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class115 {

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "I")
    private int field2131 = class128.method819(16);

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
    private int field2130 = class128.method819(24);

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "I")
    private int field2132 = class128.method819(24);

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
    private int field2133 = class128.method819(24) + 1;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "I")
    private int field2129 = class128.method819(6) + 1;

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "I")
    private int field2134 = class128.method819(8);

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "[I")
    private int[] field2128;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "([FIZ)V")
    public final void method706(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class128.field2412[this.field2134].field357;
        int var6 = this.field2132 - this.field2130;
        int var7 = var6 / this.field2133;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class128.field2412[this.field2134].method149();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field2129;
                        }
                        var11 /= this.field2129;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field2128[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field2133 * var10 + this.field2130;
                        class16 var17 = class128.field2412[var15];
                        if (this.field2131 == 0) {
                            int var18 = this.field2133 / var17.field357;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method148();
                                for (int var21 = 0; var21 < var17.field357; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field2133) {
                                float[] var23 = var17.method148();
                                for (int var24 = 0; var24 < var17.field357; var24++) {
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

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "()V")
    public class115() {
        int[] var1 = new int[this.field2129];
        for (int var2 = 0; var2 < this.field2129; var2++) {
            int var4 = 0;
            int var5 = class128.method819(3);
            boolean var6 = class128.method818() != 0;
            if (var6) {
                var4 = class128.method819(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field2128 = new int[this.field2129 * 8];
        for (int var3 = 0; var3 < this.field2129 * 8; var3++) {
            this.field2128[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class128.method819(8);
        }
    }
}
