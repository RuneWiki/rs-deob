import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class399 {

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "I")
    private int field5303 = class309.method1841(16);

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "I")
    private int field5305 = class309.method1841(24);

    @OriginalMember(owner = "client!tm", name = "g", descriptor = "I")
    private int field5309 = class309.method1841(24);

    @OriginalMember(owner = "client!tm", name = "f", descriptor = "I")
    private int field5308 = class309.method1841(24) + 1;

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "I")
    private int field5306 = class309.method1841(6) + 1;

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "I")
    private int field5304 = class309.method1841(8);

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "[I")
    private int[] field5307;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "([FIZ)V")
    public final void method2374(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class309.field3982[this.field5304].field6982;
        int var6 = this.field5309 - this.field5305;
        int var7 = var6 / this.field5308;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class309.field3982[this.field5304].method2875();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field5306;
                        }
                        var11 /= this.field5306;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field5307[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field5308 * var10 + this.field5305;
                        class479 var17 = class309.field3982[var15];
                        if (this.field5303 == 0) {
                            int var18 = this.field5308 / var17.field6982;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method2873();
                                for (int var21 = 0; var21 < var17.field6982; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field5308) {
                                float[] var23 = var17.method2873();
                                for (int var24 = 0; var24 < var17.field6982; var24++) {
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

    @OriginalMember(owner = "client!tm", name = "<init>", descriptor = "()V")
    public class399() {
        int[] var1 = new int[this.field5306];
        for (int var2 = 0; var2 < this.field5306; var2++) {
            int var4 = 0;
            int var5 = class309.method1841(3);
            boolean var6 = class309.method1846() != 0;
            if (var6) {
                var4 = class309.method1841(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field5307 = new int[this.field5306 * 8];
        for (int var3 = 0; var3 < this.field5306 * 8; var3++) {
            this.field5307[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class309.method1841(8);
        }
    }
}
