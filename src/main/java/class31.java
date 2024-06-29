import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class31 {

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "I")
    private int field721 = class114.method940(16);

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
    private int field720 = class114.method940(24);

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "I")
    private int field717 = class114.method940(24);

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "I")
    private int field716 = class114.method940(24) + 1;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "I")
    private int field718 = class114.method940(6) + 1;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
    private int field719 = class114.method940(8);

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "[I")
    private int[] field715;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "([FIZ)V")
    public final void method229(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class114.field2720[this.field719].field61;
        int var6 = this.field717 - this.field720;
        int var7 = var6 / this.field716;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class114.field2720[this.field719].method23();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field718;
                        }
                        var11 /= this.field718;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field715[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field716 * var10 + this.field720;
                        class3 var17 = class114.field2720[var15];
                        if (this.field721 == 0) {
                            int var18 = this.field716 / var17.field61;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method22();
                                for (int var21 = 0; var21 < var17.field61; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field716) {
                                float[] var23 = var17.method22();
                                for (int var24 = 0; var24 < var17.field61; var24++) {
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

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "()V")
    public class31() {
        int[] var1 = new int[this.field718];
        for (int var2 = 0; var2 < this.field718; var2++) {
            int var4 = 0;
            int var5 = class114.method940(3);
            boolean var6 = class114.method932() != 0;
            if (var6) {
                var4 = class114.method940(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field715 = new int[this.field718 * 8];
        for (int var3 = 0; var3 < this.field718 * 8; var3++) {
            this.field715[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class114.method940(8);
        }
    }
}
