import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class84 {

    @OriginalMember(owner = "client!p", name = "c", descriptor = "I")
    private int field1467 = class244.method1629(16);

    @OriginalMember(owner = "client!p", name = "f", descriptor = "I")
    private int field1470 = class244.method1629(24);

    @OriginalMember(owner = "client!p", name = "b", descriptor = "I")
    private int field1466 = class244.method1629(24);

    @OriginalMember(owner = "client!p", name = "g", descriptor = "I")
    private int field1471 = class244.method1629(24) + 1;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "I")
    private int field1468 = class244.method1629(6) + 1;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "I")
    private int field1465 = class244.method1629(8);

    @OriginalMember(owner = "client!p", name = "e", descriptor = "[I")
    private int[] field1469;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "([FIZ)V")
    public final void method509(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class244.field4245[this.field1465].field4518;
        int var6 = this.field1466 - this.field1470;
        int var7 = var6 / this.field1471;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class244.field4245[this.field1465].method1751();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1468;
                        }
                        var11 /= this.field1468;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1469[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1471 * var10 + this.field1470;
                        class259 var17 = class244.field4245[var15];
                        if (this.field1467 == 0) {
                            int var18 = this.field1471 / var17.field4518;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1753();
                                for (int var21 = 0; var21 < var17.field4518; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1471) {
                                float[] var23 = var17.method1753();
                                for (int var24 = 0; var24 < var17.field4518; var24++) {
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

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "()V")
    public class84() {
        int[] var1 = new int[this.field1468];
        for (int var2 = 0; var2 < this.field1468; var2++) {
            int var4 = 0;
            int var5 = class244.method1629(3);
            boolean var6 = class244.method1632() != 0;
            if (var6) {
                var4 = class244.method1629(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field1469 = new int[this.field1468 * 8];
        for (int var3 = 0; var3 < this.field1468 * 8; var3++) {
            this.field1469[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class244.method1629(8);
        }
    }
}
