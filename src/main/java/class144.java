import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class144 {

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
    private int field3606 = class85.method731(16);

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
    private int field3607 = class85.method731(24);

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "I")
    private int field3608 = class85.method731(24);

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
    private int field3603 = class85.method731(24) + 1;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
    private int field3604 = class85.method731(6) + 1;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
    private int field3605 = class85.method731(8);

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "[I")
    private int[] field3602;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "([FIZ)V", line = 8)
    public final void method1164(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class85.field1895[this.field3605].field1634;
        int var6 = this.field3608 - this.field3607;
        int var7 = var6 / this.field3603;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class85.field1895[this.field3605].method650();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field3604;
                        }
                        var11 /= this.field3604;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field3602[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field3603 * var10 + this.field3607;
                        class69 var17 = class85.field1895[var15];
                        if (this.field3606 == 0) {
                            int var18 = this.field3603 / var17.field1634;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method648();
                                for (int var21 = 0; var21 < var17.field1634; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field3603) {
                                float[] var23 = var17.method648();
                                for (int var24 = 0; var24 < var17.field1634; var24++) {
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

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "()V", line = 133)
    public class144() {
        int[] var1 = new int[this.field3604];
        for (int var2 = 0; var2 < this.field3604; var2++) {
            int var4 = 0;
            int var5 = class85.method731(3);
            boolean var6 = class85.method729() != 0;
            if (var6) {
                var4 = class85.method731(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field3602 = new int[this.field3604 * 8];
        for (int var3 = 0; var3 < this.field3604 * 8; var3++) {
            this.field3602[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class85.method731(8);
        }
    }
}
