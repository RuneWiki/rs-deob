import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class87 {

    @OriginalMember(owner = "client!i", name = "a", descriptor = "I")
    private int field1523 = class22.method154(16);

    @OriginalMember(owner = "client!i", name = "d", descriptor = "I")
    private int field1526 = class22.method154(24);

    @OriginalMember(owner = "client!i", name = "b", descriptor = "I")
    private int field1524 = class22.method154(24);

    @OriginalMember(owner = "client!i", name = "g", descriptor = "I")
    private int field1529 = class22.method154(24) + 1;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "I")
    private int field1527 = class22.method154(6) + 1;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "I")
    private int field1528 = class22.method154(8);

    @OriginalMember(owner = "client!i", name = "c", descriptor = "[I")
    private int[] field1525;

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "()V")
    public class87() {
        int[] var1 = new int[this.field1527];
        for (int var2 = 0; var2 < this.field1527; var2++) {
            int var4 = 0;
            int var5 = class22.method154(3);
            boolean var6 = class22.method156() != 0;
            if (var6) {
                var4 = class22.method154(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field1525 = new int[this.field1527 * 8];
        for (int var3 = 0; var3 < this.field1527 * 8; var3++) {
            this.field1525[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class22.method154(8);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "([FIZ)V")
    public final void method584(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class22.field375[this.field1528].field3288;
        int var6 = this.field1524 - this.field1526;
        int var7 = var6 / this.field1529;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class22.field375[this.field1528].method1163();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1527;
                        }
                        var11 /= this.field1527;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1525[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1529 * var10 + this.field1526;
                        class172 var17 = class22.field375[var15];
                        if (this.field1523 == 0) {
                            int var18 = this.field1529 / var17.field3288;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1165();
                                for (int var21 = 0; var21 < var17.field3288; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1529) {
                                float[] var23 = var17.method1165();
                                for (int var24 = 0; var24 < var17.field3288; var24++) {
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
}
