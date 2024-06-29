import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class22 {

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    private int field533 = class13.method132(16);

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    private int field536 = class13.method132(24);

    @OriginalMember(owner = "client!da", name = "c", descriptor = "I")
    private int field534 = class13.method132(24);

    @OriginalMember(owner = "client!da", name = "d", descriptor = "I")
    private int field535 = class13.method132(24) + 1;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    private int field532 = class13.method132(6) + 1;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "I")
    private int field538 = class13.method132(8);

    @OriginalMember(owner = "client!da", name = "f", descriptor = "[I")
    private int[] field537;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([FIZ)V")
    public final void method206(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class13.field304[this.field538].field2610;
        int var6 = this.field534 - this.field536;
        int var7 = var6 / this.field535;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class13.field304[this.field538].method911();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field532;
                        }
                        var11 /= this.field532;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field537[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field535 * var10 + this.field536;
                        class106 var17 = class13.field304[var15];
                        if (this.field533 == 0) {
                            int var18 = this.field535 / var17.field2610;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method912();
                                for (int var21 = 0; var21 < var17.field2610; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field535) {
                                float[] var23 = var17.method912();
                                for (int var24 = 0; var24 < var17.field2610; var24++) {
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

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "()V")
    public class22() {
        int[] var1 = new int[this.field532];
        for (int var2 = 0; var2 < this.field532; var2++) {
            int var4 = 0;
            int var5 = class13.method132(3);
            boolean var6 = class13.method139() != 0;
            if (var6) {
                var4 = class13.method132(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field537 = new int[this.field532 * 8];
        for (int var3 = 0; var3 < this.field532 * 8; var3++) {
            this.field537[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class13.method132(8);
        }
    }
}
