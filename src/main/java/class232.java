import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class232 {

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "I")
    private int field3051 = class24.method153(16);

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "I")
    private int field3045 = class24.method153(24);

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "I")
    private int field3050 = class24.method153(24);

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "I")
    private int field3046 = class24.method153(24) + 1;

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "I")
    private int field3048 = class24.method153(6) + 1;

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "I")
    private int field3047 = class24.method153(8);

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "[I")
    private int[] field3049;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "([FIZ)V")
    public final void method1494(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class24.field277[this.field3047].field2073;
        int var6 = this.field3050 - this.field3045;
        int var7 = var6 / this.field3046;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class24.field277[this.field3047].method1118();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field3048;
                        }
                        var11 /= this.field3048;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field3049[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field3046 * var10 + this.field3045;
                        class177 var17 = class24.field277[var15];
                        if (this.field3051 == 0) {
                            int var18 = this.field3046 / var17.field2073;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1116();
                                for (int var21 = 0; var21 < var17.field2073; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field3046) {
                                float[] var23 = var17.method1116();
                                for (int var24 = 0; var24 < var17.field2073; var24++) {
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

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "()V")
    public class232() {
        int[] var1 = new int[this.field3048];
        for (int var2 = 0; var2 < this.field3048; var2++) {
            int var4 = 0;
            int var5 = class24.method153(3);
            boolean var6 = class24.method151() != 0;
            if (var6) {
                var4 = class24.method153(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field3049 = new int[this.field3048 * 8];
        for (int var3 = 0; var3 < this.field3048 * 8; var3++) {
            this.field3049[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class24.method153(8);
        }
    }
}
