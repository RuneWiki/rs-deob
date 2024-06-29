import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class156 {

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "I")
    private int field3021 = class138.method944(16);

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "I")
    private int field3015 = class138.method944(24);

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "I")
    private int field3020 = class138.method944(24);

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
    private int field3017 = class138.method944(24) + 1;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "I")
    private int field3019 = class138.method944(6) + 1;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
    private int field3018 = class138.method944(8);

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "[I")
    private int[] field3016;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "([FIZ)V")
    public final void method1054(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class138.field2586[this.field3018].field1531;
        int var6 = this.field3020 - this.field3015;
        int var7 = var6 / this.field3017;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class138.field2586[this.field3018].method526();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field3019;
                        }
                        var11 /= this.field3019;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field3016[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field3017 * var10 + this.field3015;
                        class86 var17 = class138.field2586[var15];
                        if (this.field3021 == 0) {
                            int var18 = this.field3017 / var17.field1531;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method527();
                                for (int var21 = 0; var21 < var17.field1531; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field3017) {
                                float[] var23 = var17.method527();
                                for (int var24 = 0; var24 < var17.field1531; var24++) {
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

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V")
    public class156() {
        int[] var1 = new int[this.field3019];
        for (int var2 = 0; var2 < this.field3019; var2++) {
            int var4 = 0;
            int var5 = class138.method944(3);
            boolean var6 = class138.method938() != 0;
            if (var6) {
                var4 = class138.method944(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field3016 = new int[this.field3019 * 8];
        for (int var3 = 0; var3 < this.field3019 * 8; var3++) {
            this.field3016[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class138.method944(8);
        }
    }
}
