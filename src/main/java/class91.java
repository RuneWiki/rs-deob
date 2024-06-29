import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class91 {

    @OriginalMember(owner = "client!be", name = "b", descriptor = "I")
    private int field1474 = class16.method75(16);

    @OriginalMember(owner = "client!be", name = "g", descriptor = "I")
    private int field1479 = class16.method75(24);

    @OriginalMember(owner = "client!be", name = "f", descriptor = "I")
    private int field1478 = class16.method75(24);

    @OriginalMember(owner = "client!be", name = "e", descriptor = "I")
    private int field1477 = class16.method75(24) + 1;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "I")
    private int field1476 = class16.method75(6) + 1;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "I")
    private int field1475 = class16.method75(8);

    @OriginalMember(owner = "client!be", name = "a", descriptor = "[I")
    private int[] field1473;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "([FIZ)V")
    public final void method615(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class16.field192[this.field1475].field961;
        int var6 = this.field1478 - this.field1479;
        int var7 = var6 / this.field1477;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class16.field192[this.field1475].method398();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1476;
                        }
                        var11 /= this.field1476;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1473[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1477 * var10 + this.field1479;
                        class58 var17 = class16.field192[var15];
                        if (this.field1474 == 0) {
                            int var18 = this.field1477 / var17.field961;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method400();
                                for (int var21 = 0; var21 < var17.field961; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1477) {
                                float[] var23 = var17.method400();
                                for (int var24 = 0; var24 < var17.field961; var24++) {
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

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "()V")
    public class91() {
        int[] var1 = new int[this.field1476];
        for (int var2 = 0; var2 < this.field1476; var2++) {
            int var4 = 0;
            int var5 = class16.method75(3);
            boolean var6 = class16.method82() != 0;
            if (var6) {
                var4 = class16.method75(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field1473 = new int[this.field1476 * 8];
        for (int var3 = 0; var3 < this.field1476 * 8; var3++) {
            this.field1473[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class16.method75(8);
        }
    }
}
