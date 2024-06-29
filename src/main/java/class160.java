import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class160 {

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "I")
    private int field2892 = class61.method337(16);

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
    private int field2890 = class61.method337(24);

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
    private int field2891 = class61.method337(24);

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "I")
    private int field2893 = class61.method337(24) + 1;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
    private int field2888 = class61.method337(6) + 1;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "I")
    private int field2887 = class61.method337(8);

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "[I")
    private int[] field2889;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "([FIZ)V")
    public final void method969(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class61.field1151[this.field2887].field481;
        int var6 = this.field2891 - this.field2890;
        int var7 = var6 / this.field2893;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class61.field1151[this.field2887].method174();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field2888;
                        }
                        var11 /= this.field2888;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field2889[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field2893 * var10 + this.field2890;
                        class27 var17 = class61.field1151[var15];
                        if (this.field2892 == 0) {
                            int var18 = this.field2893 / var17.field481;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method175();
                                for (int var21 = 0; var21 < var17.field481; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field2893) {
                                float[] var23 = var17.method175();
                                for (int var24 = 0; var24 < var17.field481; var24++) {
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

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "()V")
    public class160() {
        int[] var1 = new int[this.field2888];
        for (int var2 = 0; var2 < this.field2888; var2++) {
            int var4 = 0;
            int var5 = class61.method337(3);
            boolean var6 = class61.method347() != 0;
            if (var6) {
                var4 = class61.method337(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field2889 = new int[this.field2888 * 8];
        for (int var3 = 0; var3 < this.field2888 * 8; var3++) {
            this.field2889[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class61.method337(8);
        }
    }
}
