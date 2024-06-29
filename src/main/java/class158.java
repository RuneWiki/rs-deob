import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class158 {

    @OriginalMember(owner = "client!of", name = "g", descriptor = "I")
    private int field2859 = class20.method142(16);

    @OriginalMember(owner = "client!of", name = "a", descriptor = "I")
    private int field2853 = class20.method142(24);

    @OriginalMember(owner = "client!of", name = "f", descriptor = "I")
    private int field2858 = class20.method142(24);

    @OriginalMember(owner = "client!of", name = "c", descriptor = "I")
    private int field2855 = class20.method142(24) + 1;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "I")
    private int field2856 = class20.method142(6) + 1;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "I")
    private int field2857 = class20.method142(8);

    @OriginalMember(owner = "client!of", name = "b", descriptor = "[I")
    private int[] field2854;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "([FIZ)V")
    public final void method1025(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class20.field519[this.field2857].field776;
        int var6 = this.field2858 - this.field2853;
        int var7 = var6 / this.field2855;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class20.field519[this.field2857].method226();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field2856;
                        }
                        var11 /= this.field2856;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field2854[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field2855 * var10 + this.field2853;
                        class35 var17 = class20.field519[var15];
                        if (this.field2859 == 0) {
                            int var18 = this.field2855 / var17.field776;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method227();
                                for (int var21 = 0; var21 < var17.field776; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field2855) {
                                float[] var23 = var17.method227();
                                for (int var24 = 0; var24 < var17.field776; var24++) {
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

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "()V")
    public class158() {
        int[] var1 = new int[this.field2856];
        for (int var2 = 0; var2 < this.field2856; var2++) {
            int var4 = 0;
            int var5 = class20.method142(3);
            boolean var6 = class20.method144() != 0;
            if (var6) {
                var4 = class20.method142(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field2854 = new int[this.field2856 * 8];
        for (int var3 = 0; var3 < this.field2856 * 8; var3++) {
            this.field2854[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class20.method142(8);
        }
    }
}
