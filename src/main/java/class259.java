import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class259 {

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "I")
    private int field4613 = class258.method1853(16);

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "I")
    private int field4612 = class258.method1853(24);

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "I")
    private int field4609 = class258.method1853(24);

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "I")
    private int field4615 = class258.method1853(24) + 1;

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "I")
    private int field4610 = class258.method1853(6) + 1;

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "I")
    private int field4614 = class258.method1853(8);

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "[I")
    private int[] field4611;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "([FIZ)V", line = 9)
    public final void method1857(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class258.field4602[this.field4614].field5528;
        int var6 = this.field4609 - this.field4612;
        int var7 = var6 / this.field4615;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class258.field4602[this.field4614].method2219();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field4610;
                        }
                        var11 /= this.field4610;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field4611[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field4615 * var10 + this.field4612;
                        class313 var17 = class258.field4602[var15];
                        if (this.field4613 == 0) {
                            int var18 = this.field4615 / var17.field5528;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method2218();
                                for (int var21 = 0; var21 < var17.field5528; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field4615) {
                                float[] var23 = var17.method2218();
                                for (int var24 = 0; var24 < var17.field5528; var24++) {
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

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "()V", line = 133)
    public class259() {
        int[] var1 = new int[this.field4610];
        for (int var2 = 0; var2 < this.field4610; var2++) {
            int var3 = 0;
            int var4 = class258.method1853(3);
            boolean var5 = class258.method1846() != 0;
            if (var5) {
                var3 = class258.method1853(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field4611 = new int[this.field4610 * 8];
        for (int var6 = 0; var6 < this.field4610 * 8; var6++) {
            this.field4611[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class258.method1853(8);
        }
    }
}
