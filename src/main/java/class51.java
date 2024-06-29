import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class51 {

    @OriginalMember(owner = "client!bq", name = "g", descriptor = "I")
    private int field843 = class146.method1129(16);

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "I")
    private int field837 = class146.method1129(24);

    @OriginalMember(owner = "client!bq", name = "c", descriptor = "I")
    private int field839 = class146.method1129(24);

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "I")
    private int field838 = class146.method1129(24) + 1;

    @OriginalMember(owner = "client!bq", name = "d", descriptor = "I")
    private int field840 = class146.method1129(6) + 1;

    @OriginalMember(owner = "client!bq", name = "f", descriptor = "I")
    private int field842 = class146.method1129(8);

    @OriginalMember(owner = "client!bq", name = "e", descriptor = "[I")
    private int[] field841;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "([FIZ)V")
    public final void method497(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class146.field2226[this.field842].field4824;
        int var6 = this.field839 - this.field837;
        int var7 = var6 / this.field838;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class146.field2226[this.field842].method2231();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field840;
                        }
                        var11 /= this.field840;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field841[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field838 * var10 + this.field837;
                        class354 var17 = class146.field2226[var15];
                        if (this.field843 == 0) {
                            int var18 = this.field838 / var17.field4824;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method2232();
                                for (int var21 = 0; var21 < var17.field4824; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field838) {
                                float[] var23 = var17.method2232();
                                for (int var24 = 0; var24 < var17.field4824; var24++) {
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

    @OriginalMember(owner = "client!bq", name = "<init>", descriptor = "()V")
    public class51() {
        int[] var1 = new int[this.field840];
        for (int var2 = 0; var2 < this.field840; var2++) {
            int var4 = 0;
            int var5 = class146.method1129(3);
            boolean var6 = class146.method1124() != 0;
            if (var6) {
                var4 = class146.method1129(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field841 = new int[this.field840 * 8];
        for (int var3 = 0; var3 < this.field840 * 8; var3++) {
            this.field841[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class146.method1129(8);
        }
    }
}
