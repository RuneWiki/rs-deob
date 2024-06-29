import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class134 {

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "I")
    private int field2108 = class202.method1355(16);

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "I")
    private int field2107 = class202.method1355(24);

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "I")
    private int field2105 = class202.method1355(24);

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "I")
    private int field2109 = class202.method1355(24) + 1;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "I")
    private int field2106 = class202.method1355(6) + 1;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "I")
    private int field2103 = class202.method1355(8);

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "[I")
    private int[] field2104;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "([FIZ)V", line = 12)
    public final void method911(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class202.field3032[this.field2103].field3;
        int var6 = this.field2105 - this.field2107;
        int var7 = var6 / this.field2109;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class202.field3032[this.field2103].method1();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field2106;
                        }
                        var11 /= this.field2106;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field2104[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field2109 * var10 + this.field2107;
                        class1 var17 = class202.field3032[var15];
                        if (this.field2108 == 0) {
                            int var18 = this.field2109 / var17.field3;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method3();
                                for (int var21 = 0; var21 < var17.field3; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field2109) {
                                float[] var23 = var17.method3();
                                for (int var24 = 0; var24 < var17.field3; var24++) {
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

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "()V", line = 133)
    public class134() {
        int[] var1 = new int[this.field2106];
        for (int var2 = 0; var2 < this.field2106; var2++) {
            int var3 = 0;
            int var4 = class202.method1355(3);
            boolean var5 = class202.method1357() != 0;
            if (var5) {
                var3 = class202.method1355(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field2104 = new int[this.field2106 * 8];
        for (int var6 = 0; var6 < this.field2106 * 8; var6++) {
            this.field2104[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class202.method1355(8);
        }
    }
}
