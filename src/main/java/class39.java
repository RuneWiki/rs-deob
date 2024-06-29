import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class39 {

    @OriginalMember(owner = "client!al", name = "a", descriptor = "I")
    private int field471 = class102.method718(16);

    @OriginalMember(owner = "client!al", name = "g", descriptor = "I")
    private int field477 = class102.method718(24);

    @OriginalMember(owner = "client!al", name = "e", descriptor = "I")
    private int field475 = class102.method718(24);

    @OriginalMember(owner = "client!al", name = "f", descriptor = "I")
    private int field476 = class102.method718(24) + 1;

    @OriginalMember(owner = "client!al", name = "c", descriptor = "I")
    private int field473 = class102.method718(6) + 1;

    @OriginalMember(owner = "client!al", name = "b", descriptor = "I")
    private int field472 = class102.method718(8);

    @OriginalMember(owner = "client!al", name = "d", descriptor = "[I")
    private int[] field474;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "([FIZ)V", line = 12)
    public final void method267(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class102.field1620[this.field472].field4746;
        int var6 = this.field475 - this.field477;
        int var7 = var6 / this.field476;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class102.field1620[this.field472].method2154();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field473;
                        }
                        var11 /= this.field473;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field474[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field476 * var10 + this.field477;
                        class312 var17 = class102.field1620[var15];
                        if (this.field471 == 0) {
                            int var18 = this.field476 / var17.field4746;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method2155();
                                for (int var21 = 0; var21 < var17.field4746; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field476) {
                                float[] var23 = var17.method2155();
                                for (int var24 = 0; var24 < var17.field4746; var24++) {
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

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "()V", line = 133)
    public class39() {
        int[] var1 = new int[this.field473];
        for (int var2 = 0; var2 < this.field473; var2++) {
            int var3 = 0;
            int var4 = class102.method718(3);
            boolean var5 = class102.method719() != 0;
            if (var5) {
                var3 = class102.method718(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field474 = new int[this.field473 * 8];
        for (int var6 = 0; var6 < this.field473 * 8; var6++) {
            this.field474[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class102.method718(8);
        }
    }
}
