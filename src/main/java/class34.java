import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class34 {

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
    private int field515 = class267.method1889(16);

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    private int field511 = class267.method1889(24);

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
    private int field514 = class267.method1889(24);

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
    private int field513 = class267.method1889(24) + 1;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "I")
    private int field516 = class267.method1889(6) + 1;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
    private int field512 = class267.method1889(8);

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "[I")
    private int[] field517;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "([FIZ)V", line = 9)
    public final void method232(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class267.field4252[this.field512].field3171;
        int var6 = this.field514 - this.field511;
        int var7 = var6 / this.field513;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class267.field4252[this.field512].method1406();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field516;
                        }
                        var11 /= this.field516;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field517[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field513 * var10 + this.field511;
                        class197 var17 = class267.field4252[var15];
                        if (this.field515 == 0) {
                            int var18 = this.field513 / var17.field3171;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1407();
                                for (int var21 = 0; var21 < var17.field3171; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field513) {
                                float[] var23 = var17.method1407();
                                for (int var24 = 0; var24 < var17.field3171; var24++) {
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

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "()V", line = 133)
    public class34() {
        int[] var1 = new int[this.field516];
        for (int var2 = 0; var2 < this.field516; var2++) {
            int var3 = 0;
            int var4 = class267.method1889(3);
            boolean var5 = class267.method1898() != 0;
            if (var5) {
                var3 = class267.method1889(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field517 = new int[this.field516 * 8];
        for (int var6 = 0; var6 < this.field516 * 8; var6++) {
            this.field517[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class267.method1889(8);
        }
    }
}
