import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class14 {

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "I")
    private int field139 = class98.method653(16);

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "I")
    private int field144 = class98.method653(24);

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "I")
    private int field138 = class98.method653(24);

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "I")
    private int field142 = class98.method653(24) + 1;

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "I")
    private int field143 = class98.method653(6) + 1;

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "I")
    private int field140 = class98.method653(8);

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "[I")
    private int[] field141;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "([FIZ)V")
    public final void method85(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class98.field1384[this.field140].field667;
        int var6 = this.field138 - this.field144;
        int var7 = var6 / this.field142;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class98.field1384[this.field140].method300();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field143;
                        }
                        var11 /= this.field143;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field141[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field142 * var10 + this.field144;
                        class45 var17 = class98.field1384[var15];
                        if (this.field139 == 0) {
                            int var18 = this.field142 / var17.field667;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method298();
                                for (int var21 = 0; var21 < var17.field667; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field142) {
                                float[] var23 = var17.method298();
                                for (int var24 = 0; var24 < var17.field667; var24++) {
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

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "()V")
    public class14() {
        int[] var1 = new int[this.field143];
        for (int var2 = 0; var2 < this.field143; var2++) {
            int var4 = 0;
            int var5 = class98.method653(3);
            boolean var6 = class98.method654() != 0;
            if (var6) {
                var4 = class98.method653(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field141 = new int[this.field143 * 8];
        for (int var3 = 0; var3 < this.field143 * 8; var3++) {
            this.field141[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class98.method653(8);
        }
    }
}
