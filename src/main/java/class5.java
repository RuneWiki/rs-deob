import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class5 {

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
    private int field67 = class195.method1355(16);

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    private int field65 = class195.method1355(24);

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
    private int field66 = class195.method1355(24);

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "I")
    private int field69 = class195.method1355(24) + 1;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
    private int field68 = class195.method1355(6) + 1;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    private int field64 = class195.method1355(8);

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "[I")
    private int[] field70;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "([FIZ)V")
    public final void method25(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class195.field3726[this.field64].field308;
        int var6 = this.field66 - this.field65;
        int var7 = var6 / this.field69;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class195.field3726[this.field64].method95();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field68;
                        }
                        var11 /= this.field68;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field70[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field69 * var10 + this.field65;
                        class19 var17 = class195.field3726[var15];
                        if (this.field67 == 0) {
                            int var18 = this.field69 / var17.field308;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method94();
                                for (int var21 = 0; var21 < var17.field308; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field69) {
                                float[] var23 = var17.method94();
                                for (int var24 = 0; var24 < var17.field308; var24++) {
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

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "()V")
    public class5() {
        int[] var1 = new int[this.field68];
        for (int var2 = 0; var2 < this.field68; var2++) {
            int var4 = 0;
            int var5 = class195.method1355(3);
            boolean var6 = class195.method1350() != 0;
            if (var6) {
                var4 = class195.method1355(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field70 = new int[this.field68 * 8];
        for (int var3 = 0; var3 < this.field68 * 8; var3++) {
            this.field70[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class195.method1355(8);
        }
    }
}
