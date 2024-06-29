import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class596 {

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "I")
    private int field8440 = class249.method1774(16);

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "I")
    private int field8444 = class249.method1774(24);

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "I")
    private int field8441 = class249.method1774(24);

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "I")
    private int field8443 = class249.method1774(24) + 1;

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "I")
    private int field8442 = class249.method1774(6) + 1;

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "I")
    private int field8446 = class249.method1774(8);

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "[I")
    private int[] field8445;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "([FIZ)V", line = 9)
    public final void method3478(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class249.field3962[this.field8446].field9903;
        int var6 = this.field8441 - this.field8444;
        int var7 = var6 / this.field8443;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class249.field3962[this.field8446].method3969();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field8442;
                        }
                        var11 /= this.field8442;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field8445[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field8443 * var10 + this.field8444;
                        class704 var17 = class249.field3962[var15];
                        if (this.field8440 == 0) {
                            int var18 = this.field8443 / var17.field9903;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method3970();
                                for (int var21 = 0; var21 < var17.field9903; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field8443) {
                                float[] var23 = var17.method3970();
                                for (int var24 = 0; var24 < var17.field9903; var24++) {
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

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "()V", line = 133)
    public class596() {
        int[] var1 = new int[this.field8442];
        for (int var2 = 0; var2 < this.field8442; var2++) {
            int var4 = 0;
            int var5 = class249.method1774(3);
            boolean var6 = class249.method1766() != 0;
            if (var6) {
                var4 = class249.method1774(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field8445 = new int[this.field8442 * 8];
        for (int var3 = 0; var3 < this.field8442 * 8; var3++) {
            this.field8445[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class249.method1774(8);
        }
    }
}
