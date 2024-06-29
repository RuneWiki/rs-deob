import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class242 {

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "I")
    private int field3997 = class150.method1091(16);

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "I")
    private int field3998 = class150.method1091(24);

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "I")
    private int field3994 = class150.method1091(24);

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "I")
    private int field3996 = class150.method1091(24) + 1;

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "I")
    private int field3999 = class150.method1091(6) + 1;

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "I")
    private int field3995 = class150.method1091(8);

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "[I")
    private int[] field4000;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "([FIZ)V", line = 9)
    public final void method1695(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class150.field2448[this.field3995].field1773;
        int var6 = this.field3994 - this.field3998;
        int var7 = var6 / this.field3996;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class150.field2448[this.field3995].method798();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field3999;
                        }
                        var11 /= this.field3999;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field4000[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field3996 * var10 + this.field3998;
                        class104 var17 = class150.field2448[var15];
                        if (this.field3997 == 0) {
                            int var18 = this.field3996 / var17.field1773;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method799();
                                for (int var21 = 0; var21 < var17.field1773; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field3996) {
                                float[] var23 = var17.method799();
                                for (int var24 = 0; var24 < var17.field1773; var24++) {
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

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "()V", line = 133)
    public class242() {
        int[] var1 = new int[this.field3999];
        for (int var2 = 0; var2 < this.field3999; var2++) {
            int var3 = 0;
            int var4 = class150.method1091(3);
            boolean var5 = class150.method1098() != 0;
            if (var5) {
                var3 = class150.method1091(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field4000 = new int[this.field3999 * 8];
        for (int var6 = 0; var6 < this.field3999 * 8; var6++) {
            this.field4000[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class150.method1091(8);
        }
    }
}
