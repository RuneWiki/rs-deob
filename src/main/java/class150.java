import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class150 {

    @OriginalMember(owner = "client!v", name = "c", descriptor = "I")
    private int field2234 = class259.method1777(16);

    @OriginalMember(owner = "client!v", name = "e", descriptor = "I")
    private int field2236 = class259.method1777(24);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "I")
    private int field2232 = class259.method1777(24);

    @OriginalMember(owner = "client!v", name = "f", descriptor = "I")
    private int field2237 = class259.method1777(24) + 1;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "I")
    private int field2233 = class259.method1777(6) + 1;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "I")
    private int field2235 = class259.method1777(8);

    @OriginalMember(owner = "client!v", name = "g", descriptor = "[I")
    private int[] field2238;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "([FIZ)V")
    public final void method1003(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class259.field4190[this.field2235].field1690;
        int var6 = this.field2232 - this.field2236;
        int var7 = var6 / this.field2237;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class259.field4190[this.field2235].method728();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field2233;
                        }
                        var11 /= this.field2233;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field2238[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field2237 * var10 + this.field2236;
                        class112 var17 = class259.field4190[var15];
                        if (this.field2234 == 0) {
                            int var18 = this.field2237 / var17.field1690;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method729();
                                for (int var21 = 0; var21 < var17.field1690; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field2237) {
                                float[] var23 = var17.method729();
                                for (int var24 = 0; var24 < var17.field1690; var24++) {
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

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "()V")
    public class150() {
        int[] var1 = new int[this.field2233];
        for (int var2 = 0; var2 < this.field2233; var2++) {
            int var4 = 0;
            int var5 = class259.method1777(3);
            boolean var6 = class259.method1781() != 0;
            if (var6) {
                var4 = class259.method1777(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field2238 = new int[this.field2233 * 8];
        for (int var3 = 0; var3 < this.field2233 * 8; var3++) {
            this.field2238[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class259.method1777(8);
        }
    }
}
