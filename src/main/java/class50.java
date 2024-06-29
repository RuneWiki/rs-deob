import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class50 {

    @OriginalMember(owner = "client!g", name = "f", descriptor = "I")
    private int field826 = class40.method327(16);

    @OriginalMember(owner = "client!g", name = "g", descriptor = "I")
    private int field827 = class40.method327(24);

    @OriginalMember(owner = "client!g", name = "c", descriptor = "I")
    private int field823 = class40.method327(24);

    @OriginalMember(owner = "client!g", name = "b", descriptor = "I")
    private int field822 = class40.method327(24) + 1;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "I")
    private int field821 = class40.method327(6) + 1;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "I")
    private int field825 = class40.method327(8);

    @OriginalMember(owner = "client!g", name = "d", descriptor = "[I")
    private int[] field824;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "([FIZ)V")
    public final void method388(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class40.field661[this.field825].field3376;
        int var6 = this.field823 - this.field827;
        int var7 = var6 / this.field822;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class40.field661[this.field825].method1344();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field821;
                        }
                        var11 /= this.field821;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field824[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field822 * var10 + this.field827;
                        class195 var17 = class40.field661[var15];
                        if (this.field826 == 0) {
                            int var18 = this.field822 / var17.field3376;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1341();
                                for (int var21 = 0; var21 < var17.field3376; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field822) {
                                float[] var23 = var17.method1341();
                                for (int var24 = 0; var24 < var17.field3376; var24++) {
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

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "()V")
    public class50() {
        int[] var1 = new int[this.field821];
        for (int var2 = 0; var2 < this.field821; var2++) {
            int var4 = 0;
            int var5 = class40.method327(3);
            boolean var6 = class40.method328() != 0;
            if (var6) {
                var4 = class40.method327(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field824 = new int[this.field821 * 8];
        for (int var3 = 0; var3 < this.field821 * 8; var3++) {
            this.field824[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class40.method327(8);
        }
    }
}
