import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class168 {

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
    private int field2945 = class29.method234(16);

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
    private int field2951 = class29.method234(24);

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "I")
    private int field2949 = class29.method234(24);

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
    private int field2947 = class29.method234(24) + 1;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
    private int field2946 = class29.method234(6) + 1;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "I")
    private int field2948 = class29.method234(8);

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "[I")
    private int[] field2950;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "([FIZ)V")
    public final void method1208(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class29.field603[this.field2948].field1846;
        int var6 = this.field2949 - this.field2951;
        int var7 = var6 / this.field2947;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class29.field603[this.field2948].method747();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field2946;
                        }
                        var11 /= this.field2946;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field2950[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field2947 * var10 + this.field2951;
                        class103 var17 = class29.field603[var15];
                        if (this.field2945 == 0) {
                            int var18 = this.field2947 / var17.field1846;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method746();
                                for (int var21 = 0; var21 < var17.field1846; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field2947) {
                                float[] var23 = var17.method746();
                                for (int var24 = 0; var24 < var17.field1846; var24++) {
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

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "()V")
    public class168() {
        int[] var1 = new int[this.field2946];
        for (int var2 = 0; var2 < this.field2946; var2++) {
            int var4 = 0;
            int var5 = class29.method234(3);
            boolean var6 = class29.method229() != 0;
            if (var6) {
                var4 = class29.method234(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field2950 = new int[this.field2946 * 8];
        for (int var3 = 0; var3 < this.field2946 * 8; var3++) {
            this.field2950[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class29.method234(8);
        }
    }
}
