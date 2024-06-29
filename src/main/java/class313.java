import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class313 {

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "I")
    private int field5402 = class251.method1805(16);

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "I")
    private int field5405 = class251.method1805(24);

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "I")
    private int field5404 = class251.method1805(24);

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
    private int field5399 = class251.method1805(24) + 1;

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
    private int field5400 = class251.method1805(6) + 1;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "I")
    private int field5401 = class251.method1805(8);

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "[I")
    private int[] field5403;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "([FIZ)V", line = 9)
    public final void method2156(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class251.field4318[this.field5401].field3601;
        int var6 = this.field5404 - this.field5405;
        int var7 = var6 / this.field5399;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class251.field4318[this.field5401].method1476();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field5400;
                        }
                        var11 /= this.field5400;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field5403[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field5399 * var10 + this.field5405;
                        class206 var17 = class251.field4318[var15];
                        if (this.field5402 == 0) {
                            int var18 = this.field5399 / var17.field3601;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1479();
                                for (int var21 = 0; var21 < var17.field3601; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field5399) {
                                float[] var23 = var17.method1479();
                                for (int var24 = 0; var24 < var17.field3601; var24++) {
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

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "()V", line = 133)
    public class313() {
        int[] var1 = new int[this.field5400];
        for (int var2 = 0; var2 < this.field5400; var2++) {
            int var3 = 0;
            int var4 = class251.method1805(3);
            boolean var5 = class251.method1807() != 0;
            if (var5) {
                var3 = class251.method1805(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field5403 = new int[this.field5400 * 8];
        for (int var6 = 0; var6 < this.field5400 * 8; var6++) {
            this.field5403[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class251.method1805(8);
        }
    }
}
