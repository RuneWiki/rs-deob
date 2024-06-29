import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class151 {

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "I")
    private int field2108 = class360.method2156(16);

    @OriginalMember(owner = "client!ro", name = "f", descriptor = "I")
    private int field2113 = class360.method2156(24);

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "I")
    private int field2109 = class360.method2156(24);

    @OriginalMember(owner = "client!ro", name = "e", descriptor = "I")
    private int field2112 = class360.method2156(24) + 1;

    @OriginalMember(owner = "client!ro", name = "d", descriptor = "I")
    private int field2111 = class360.method2156(6) + 1;

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "I")
    private int field2110 = class360.method2156(8);

    @OriginalMember(owner = "client!ro", name = "g", descriptor = "[I")
    private int[] field2114;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "([FIZ)V", line = 8)
    public final void method916(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class360.field5028[this.field2110].field731;
        int var6 = this.field2109 - this.field2113;
        int var7 = var6 / this.field2112;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class360.field5028[this.field2110].method357();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field2111;
                        }
                        var11 /= this.field2111;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field2114[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field2112 * var10 + this.field2113;
                        class45 var17 = class360.field5028[var15];
                        if (this.field2108 == 0) {
                            int var18 = this.field2112 / var17.field731;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method356();
                                for (int var21 = 0; var21 < var17.field731; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field2112) {
                                float[] var23 = var17.method356();
                                for (int var24 = 0; var24 < var17.field731; var24++) {
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

    @OriginalMember(owner = "client!ro", name = "<init>", descriptor = "()V", line = 133)
    public class151() {
        int[] var1 = new int[this.field2111];
        for (int var2 = 0; var2 < this.field2111; var2++) {
            int var4 = 0;
            int var5 = class360.method2156(3);
            boolean var6 = class360.method2159() != 0;
            if (var6) {
                var4 = class360.method2156(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field2114 = new int[this.field2111 * 8];
        for (int var3 = 0; var3 < this.field2111 * 8; var3++) {
            this.field2114[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class360.method2156(8);
        }
    }
}
