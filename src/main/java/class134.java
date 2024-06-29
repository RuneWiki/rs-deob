import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class134 {

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "I")
    private int field2123 = class341.method2366(16);

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "I")
    private int field2121 = class341.method2366(24);

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
    private int field2122 = class341.method2366(24);

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "I")
    private int field2124 = class341.method2366(24) + 1;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
    private int field2120 = class341.method2366(6) + 1;

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
    private int field2125 = class341.method2366(8);

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "[I")
    private int[] field2126;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "([FIZ)V", line = 8)
    public final void method1030(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class341.field5270[this.field2125].field3584;
        int var6 = this.field2122 - this.field2121;
        int var7 = var6 / this.field2124;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class341.field5270[this.field2125].method1702();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field2120;
                        }
                        var11 /= this.field2120;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field2126[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field2124 * var10 + this.field2121;
                        class239 var17 = class341.field5270[var15];
                        if (this.field2123 == 0) {
                            int var18 = this.field2124 / var17.field3584;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1701();
                                for (int var21 = 0; var21 < var17.field3584; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field2124) {
                                float[] var23 = var17.method1701();
                                for (int var24 = 0; var24 < var17.field3584; var24++) {
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

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "()V", line = 133)
    public class134() {
        int[] var1 = new int[this.field2120];
        for (int var2 = 0; var2 < this.field2120; var2++) {
            int var3 = 0;
            int var4 = class341.method2366(3);
            boolean var5 = class341.method2363() != 0;
            if (var5) {
                var3 = class341.method2366(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field2126 = new int[this.field2120 * 8];
        for (int var6 = 0; var6 < this.field2120 * 8; var6++) {
            this.field2126[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class341.method2366(8);
        }
    }
}
