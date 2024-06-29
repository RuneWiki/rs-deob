import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class464 {

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
    private int field6412 = class82.method513(16);

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    private int field6411 = class82.method513(24);

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
    private int field6415 = class82.method513(24);

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
    private int field6414 = class82.method513(24) + 1;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
    private int field6413 = class82.method513(6) + 1;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    private int field6410 = class82.method513(8);

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "[I")
    private int[] field6416;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "([FIZ)V", line = 12)
    public final void method2644(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class82.field1208[this.field6410].field3718;
        int var6 = this.field6415 - this.field6411;
        int var7 = var6 / this.field6414;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class82.field1208[this.field6410].method1685();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field6413;
                        }
                        var11 /= this.field6413;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field6416[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field6414 * var10 + this.field6411;
                        class284 var17 = class82.field1208[var15];
                        if (this.field6412 == 0) {
                            int var18 = this.field6414 / var17.field3718;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1684();
                                for (int var21 = 0; var21 < var17.field3718; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field6414) {
                                float[] var23 = var17.method1684();
                                for (int var24 = 0; var24 < var17.field3718; var24++) {
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

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V", line = 133)
    public class464() {
        int[] var1 = new int[this.field6413];
        for (int var2 = 0; var2 < this.field6413; var2++) {
            int var4 = 0;
            int var5 = class82.method513(3);
            boolean var6 = class82.method514() != 0;
            if (var6) {
                var4 = class82.method513(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field6416 = new int[this.field6413 * 8];
        for (int var3 = 0; var3 < this.field6413 * 8; var3++) {
            this.field6416[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class82.method513(8);
        }
    }
}
