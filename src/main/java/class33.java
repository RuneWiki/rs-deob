import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class33 {

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
    private int field837 = class55.method429(16);

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    private int field840 = class55.method429(24);

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    private int field841 = class55.method429(24);

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
    private int field838 = class55.method429(24) + 1;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
    private int field836 = class55.method429(6) + 1;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
    private int field835 = class55.method429(8);

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "[I")
    private int[] field839;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "([FIZ)V")
    public final void method251(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class55.field1376[this.field835].field2821;
        int var6 = this.field841 - this.field840;
        int var7 = var6 / this.field838;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class55.field1376[this.field835].method942();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field836;
                        }
                        var11 /= this.field836;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field839[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field838 * var10 + this.field840;
                        class122 var17 = class55.field1376[var15];
                        if (this.field837 == 0) {
                            int var18 = this.field838 / var17.field2821;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method940();
                                for (int var21 = 0; var21 < var17.field2821; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field838) {
                                float[] var23 = var17.method940();
                                for (int var24 = 0; var24 < var17.field2821; var24++) {
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

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "()V")
    public class33() {
        int[] var1 = new int[this.field836];
        for (int var2 = 0; var2 < this.field836; var2++) {
            int var4 = 0;
            int var5 = class55.method429(3);
            boolean var6 = class55.method432() != 0;
            if (var6) {
                var4 = class55.method429(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field839 = new int[this.field836 * 8];
        for (int var3 = 0; var3 < this.field836 * 8; var3++) {
            this.field839[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class55.method429(8);
        }
    }
}
