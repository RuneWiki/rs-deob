import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class339 {

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "I")
    private int field4905 = class11.method64(16);

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "I")
    private int field4911 = class11.method64(24);

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
    private int field4906 = class11.method64(24);

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
    private int field4907 = class11.method64(24) + 1;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "I")
    private int field4909 = class11.method64(6) + 1;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "I")
    private int field4908 = class11.method64(8);

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "[I")
    private int[] field4910;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "([FIZ)V", line = 11)
    public final void method2232(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class11.field157[this.field4908].field2423;
        int var6 = this.field4906 - this.field4911;
        int var7 = var6 / this.field4907;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class11.field157[this.field4908].method1227();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field4909;
                        }
                        var11 /= this.field4909;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field4910[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field4907 * var10 + this.field4911;
                        class172 var17 = class11.field157[var15];
                        if (this.field4905 == 0) {
                            int var18 = this.field4907 / var17.field2423;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1226();
                                for (int var21 = 0; var21 < var17.field2423; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field4907) {
                                float[] var23 = var17.method1226();
                                for (int var24 = 0; var24 < var17.field2423; var24++) {
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

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "()V", line = 133)
    public class339() {
        int[] var1 = new int[this.field4909];
        for (int var2 = 0; var2 < this.field4909; var2++) {
            int var4 = 0;
            int var5 = class11.method64(3);
            boolean var6 = class11.method58() != 0;
            if (var6) {
                var4 = class11.method64(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field4910 = new int[this.field4909 * 8];
        for (int var3 = 0; var3 < this.field4909 * 8; var3++) {
            this.field4910[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class11.method64(8);
        }
    }
}
