import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class82 {

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "I")
    private int field2147 = class146.method1178(16);

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "I")
    private int field2149 = class146.method1178(24);

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
    private int field2148 = class146.method1178(24);

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "I")
    private int field2150 = class146.method1178(24) + 1;

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
    private int field2151 = class146.method1178(6) + 1;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
    private int field2146 = class146.method1178(8);

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "[I")
    private int[] field2152;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "([FIZ)V")
    public final void method750(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class146.field3564[this.field2146].field1545;
        int var6 = this.field2148 - this.field2149;
        int var7 = var6 / this.field2150;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class146.field3564[this.field2146].method591();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field2151;
                        }
                        var11 /= this.field2151;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field2152[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field2150 * var10 + this.field2149;
                        class55 var17 = class146.field3564[var15];
                        if (this.field2147 == 0) {
                            int var18 = this.field2150 / var17.field1545;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method592();
                                for (int var21 = 0; var21 < var17.field1545; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field2150) {
                                float[] var23 = var17.method592();
                                for (int var24 = 0; var24 < var17.field1545; var24++) {
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

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "()V")
    public class82() {
        int[] var1 = new int[this.field2151];
        for (int var2 = 0; var2 < this.field2151; var2++) {
            int var4 = 0;
            int var5 = class146.method1178(3);
            boolean var6 = class146.method1179() != 0;
            if (var6) {
                var4 = class146.method1178(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field2152 = new int[this.field2151 * 8];
        for (int var3 = 0; var3 < this.field2151 * 8; var3++) {
            this.field2152[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class146.method1178(8);
        }
    }
}
