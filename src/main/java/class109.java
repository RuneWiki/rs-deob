import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class109 {

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
    private int field1914 = class151.method1039(16);

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
    private int field1911 = class151.method1039(24);

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
    private int field1910 = class151.method1039(24);

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
    private int field1912 = class151.method1039(24) + 1;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "I")
    private int field1913 = class151.method1039(6) + 1;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    private int field1908 = class151.method1039(8);

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "[I")
    private int[] field1909;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "([FIZ)V")
    public final void method722(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class151.field2799[this.field1908].field1202;
        int var6 = this.field1910 - this.field1911;
        int var7 = var6 / this.field1912;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class151.field2799[this.field1908].method446();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1913;
                        }
                        var11 /= this.field1913;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1909[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1912 * var10 + this.field1911;
                        class60 var17 = class151.field2799[var15];
                        if (this.field1914 == 0) {
                            int var18 = this.field1912 / var17.field1202;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method449();
                                for (int var21 = 0; var21 < var17.field1202; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1912) {
                                float[] var23 = var17.method449();
                                for (int var24 = 0; var24 < var17.field1202; var24++) {
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

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "()V")
    public class109() {
        int[] var1 = new int[this.field1913];
        for (int var2 = 0; var2 < this.field1913; var2++) {
            int var4 = 0;
            int var5 = class151.method1039(3);
            boolean var6 = class151.method1029() != 0;
            if (var6) {
                var4 = class151.method1039(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field1909 = new int[this.field1913 * 8];
        for (int var3 = 0; var3 < this.field1913 * 8; var3++) {
            this.field1909[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class151.method1039(8);
        }
    }
}
