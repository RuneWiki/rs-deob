import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public class class524 {

    @OriginalMember(owner = "client!us", name = "f", descriptor = "I")
    private int field7299 = class572.method3225(16);

    @OriginalMember(owner = "client!us", name = "b", descriptor = "I")
    private int field7295 = class572.method3225(24);

    @OriginalMember(owner = "client!us", name = "c", descriptor = "I")
    private int field7296 = class572.method3225(24);

    @OriginalMember(owner = "client!us", name = "d", descriptor = "I")
    private int field7297 = class572.method3225(24) + 1;

    @OriginalMember(owner = "client!us", name = "g", descriptor = "I")
    private int field7300 = class572.method3225(6) + 1;

    @OriginalMember(owner = "client!us", name = "e", descriptor = "I")
    private int field7298 = class572.method3225(8);

    @OriginalMember(owner = "client!us", name = "a", descriptor = "[I")
    private int[] field7294;

    @OriginalMember(owner = "client!us", name = "a", descriptor = "([FIZ)V")
    public final void method2928(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class572.field7985[this.field7298].field6573;
        int var6 = this.field7296 - this.field7295;
        int var7 = var6 / this.field7297;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class572.field7985[this.field7298].method2669();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field7300;
                        }
                        var11 /= this.field7300;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field7294[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field7297 * var10 + this.field7295;
                        class461 var17 = class572.field7985[var15];
                        if (this.field7299 == 0) {
                            int var18 = this.field7297 / var17.field6573;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method2668();
                                for (int var21 = 0; var21 < var17.field6573; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field7297) {
                                float[] var23 = var17.method2668();
                                for (int var24 = 0; var24 < var17.field6573; var24++) {
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

    @OriginalMember(owner = "client!us", name = "<init>", descriptor = "()V")
    public class524() {
        int[] var1 = new int[this.field7300];
        for (int var2 = 0; var2 < this.field7300; var2++) {
            int var4 = 0;
            int var5 = class572.method3225(3);
            boolean var6 = class572.method3229() != 0;
            if (var6) {
                var4 = class572.method3225(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field7294 = new int[this.field7300 * 8];
        for (int var3 = 0; var3 < this.field7300 * 8; var3++) {
            this.field7294[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class572.method3225(8);
        }
    }
}
