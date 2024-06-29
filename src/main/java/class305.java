import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class305 {

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "I")
    private int field5213 = class144.method1021(16);

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "I")
    private int field5214 = class144.method1021(24);

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "I")
    private int field5211 = class144.method1021(24);

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "I")
    private int field5210 = class144.method1021(24) + 1;

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "I")
    private int field5212 = class144.method1021(6) + 1;

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "I")
    private int field5215 = class144.method1021(8);

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "[I")
    private int[] field5209;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "([FIZ)V", line = 11)
    public final void method2129(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class144.field2533[this.field5215].field1809;
        int var6 = this.field5211 - this.field5214;
        int var7 = var6 / this.field5210;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class144.field2533[this.field5215].method744();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field5212;
                        }
                        var11 /= this.field5212;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field5209[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field5210 * var10 + this.field5214;
                        class100 var17 = class144.field2533[var15];
                        if (this.field5213 == 0) {
                            int var18 = this.field5210 / var17.field1809;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method742();
                                for (int var21 = 0; var21 < var17.field1809; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field5210) {
                                float[] var23 = var17.method742();
                                for (int var24 = 0; var24 < var17.field1809; var24++) {
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

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "()V", line = 133)
    public class305() {
        int[] var1 = new int[this.field5212];
        for (int var2 = 0; var2 < this.field5212; var2++) {
            int var3 = 0;
            int var4 = class144.method1021(3);
            boolean var5 = class144.method1023() != 0;
            if (var5) {
                var3 = class144.method1021(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field5209 = new int[this.field5212 * 8];
        for (int var6 = 0; var6 < this.field5212 * 8; var6++) {
            this.field5209[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class144.method1021(8);
        }
    }
}
