import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public class class202 {

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "I")
    private int field2991 = class475.method2858(16);

    @OriginalMember(owner = "client!dt", name = "c", descriptor = "I")
    private int field2992 = class475.method2858(24);

    @OriginalMember(owner = "client!dt", name = "d", descriptor = "I")
    private int field2993 = class475.method2858(24);

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "I")
    private int field2990 = class475.method2858(24) + 1;

    @OriginalMember(owner = "client!dt", name = "g", descriptor = "I")
    private int field2996 = class475.method2858(6) + 1;

    @OriginalMember(owner = "client!dt", name = "e", descriptor = "I")
    private int field2994 = class475.method2858(8);

    @OriginalMember(owner = "client!dt", name = "f", descriptor = "[I")
    private int[] field2995;

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "([FIZ)V", line = 5)
    public final void method1347(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class475.field6709[this.field2994].field9021;
        int var6 = this.field2993 - this.field2992;
        int var7 = var6 / this.field2990;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class475.field6709[this.field2994].method3576();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field2996;
                        }
                        var11 /= this.field2996;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field2995[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field2990 * var10 + this.field2992;
                        class608 var17 = class475.field6709[var15];
                        if (this.field2991 == 0) {
                            int var18 = this.field2990 / var17.field9021;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method3577();
                                for (int var21 = 0; var21 < var17.field9021; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field2990) {
                                float[] var23 = var17.method3577();
                                for (int var24 = 0; var24 < var17.field9021; var24++) {
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

    @OriginalMember(owner = "client!dt", name = "<init>", descriptor = "()V", line = 133)
    public class202() {
        int[] var1 = new int[this.field2996];
        for (int var2 = 0; var2 < this.field2996; var2++) {
            int var4 = 0;
            int var5 = class475.method2858(3);
            boolean var6 = class475.method2856() != 0;
            if (var6) {
                var4 = class475.method2858(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field2995 = new int[this.field2996 * 8];
        for (int var3 = 0; var3 < this.field2996 * 8; var3++) {
            this.field2995[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class475.method2858(8);
        }
    }
}
