import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class59 {

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "I")
    private int field1513 = class53.method422(16);

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
    private int field1507 = class53.method422(24);

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
    private int field1512 = class53.method422(24);

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
    private int field1508 = class53.method422(24) + 1;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
    private int field1510 = class53.method422(6) + 1;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    private int field1509 = class53.method422(8);

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "[I")
    private int[] field1511;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "([FIZ)V")
    public final void method449(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class53.field1392[this.field1509].field3056;
        int var6 = this.field1512 - this.field1507;
        int var7 = var6 / this.field1508;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class53.field1392[this.field1509].method981();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1510;
                        }
                        var11 /= this.field1510;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1511[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1508 * var10 + this.field1507;
                        class129 var17 = class53.field1392[var15];
                        if (this.field1513 == 0) {
                            int var18 = this.field1508 / var17.field3056;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method979();
                                for (int var21 = 0; var21 < var17.field3056; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1508) {
                                float[] var23 = var17.method979();
                                for (int var24 = 0; var24 < var17.field3056; var24++) {
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

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "()V")
    public class59() {
        int[] var1 = new int[this.field1510];
        for (int var2 = 0; var2 < this.field1510; var2++) {
            int var4 = 0;
            int var5 = class53.method422(3);
            boolean var6 = class53.method416() != 0;
            if (var6) {
                var4 = class53.method422(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field1511 = new int[this.field1510 * 8];
        for (int var3 = 0; var3 < this.field1510 * 8; var3++) {
            this.field1511[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class53.method422(8);
        }
    }
}
