import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class41 {

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "I")
    private int field524 = class3.method20(16);

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "I")
    private int field518 = class3.method20(24);

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "I")
    private int field520 = class3.method20(24);

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
    private int field519 = class3.method20(24) + 1;

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "I")
    private int field523 = class3.method20(6) + 1;

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "I")
    private int field521 = class3.method20(8);

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "[I")
    private int[] field522;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "([FIZ)V", line = 5)
    public final void method211(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class3.field52[this.field521].field2297;
        int var6 = this.field520 - this.field518;
        int var7 = var6 / this.field519;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class3.field52[this.field521].method1086();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field523;
                        }
                        var11 /= this.field523;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field522[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field519 * var10 + this.field518;
                        class148 var17 = class3.field52[var15];
                        if (this.field524 == 0) {
                            int var18 = this.field519 / var17.field2297;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1087();
                                for (int var21 = 0; var21 < var17.field2297; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field519) {
                                float[] var23 = var17.method1087();
                                for (int var24 = 0; var24 < var17.field2297; var24++) {
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

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "()V", line = 133)
    public class41() {
        int[] var1 = new int[this.field523];
        for (int var2 = 0; var2 < this.field523; var2++) {
            int var3 = 0;
            int var4 = class3.method20(3);
            boolean var5 = class3.method22() != 0;
            if (var5) {
                var3 = class3.method20(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field522 = new int[this.field523 * 8];
        for (int var6 = 0; var6 < this.field523 * 8; var6++) {
            this.field522[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class3.method20(8);
        }
    }
}
