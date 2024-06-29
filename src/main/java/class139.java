import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class139 {

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "I")
    private int field2238 = class302.method2070(16);

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "I")
    private int field2240 = class302.method2070(24);

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "I")
    private int field2242 = class302.method2070(24);

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "I")
    private int field2241 = class302.method2070(24) + 1;

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "I")
    private int field2243 = class302.method2070(6) + 1;

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "I")
    private int field2239 = class302.method2070(8);

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "[I")
    private int[] field2237;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "([FIZ)V", line = 12)
    public final void method1044(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class302.field5195[this.field2239].field1402;
        int var6 = this.field2242 - this.field2240;
        int var7 = var6 / this.field2241;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class302.field5195[this.field2239].method656();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field2243;
                        }
                        var11 /= this.field2243;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field2237[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field2241 * var10 + this.field2240;
                        class88 var17 = class302.field5195[var15];
                        if (this.field2238 == 0) {
                            int var18 = this.field2241 / var17.field1402;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method654();
                                for (int var21 = 0; var21 < var17.field1402; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field2241) {
                                float[] var23 = var17.method654();
                                for (int var24 = 0; var24 < var17.field1402; var24++) {
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

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "()V", line = 133)
    public class139() {
        int[] var1 = new int[this.field2243];
        for (int var2 = 0; var2 < this.field2243; var2++) {
            int var3 = 0;
            int var4 = class302.method2070(3);
            boolean var5 = class302.method2067() != 0;
            if (var5) {
                var3 = class302.method2070(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field2237 = new int[this.field2243 * 8];
        for (int var6 = 0; var6 < this.field2243 * 8; var6++) {
            this.field2237[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class302.method2070(8);
        }
    }
}
