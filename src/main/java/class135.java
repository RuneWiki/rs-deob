import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class135 {

    @OriginalMember(owner = "client!d", name = "c", descriptor = "I")
    private int field2341 = class18.method139(16);

    @OriginalMember(owner = "client!d", name = "d", descriptor = "I")
    private int field2342 = class18.method139(24);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "I")
    private int field2339 = class18.method139(24);

    @OriginalMember(owner = "client!d", name = "g", descriptor = "I")
    private int field2345 = class18.method139(24) + 1;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "I")
    private int field2340 = class18.method139(6) + 1;

    @OriginalMember(owner = "client!d", name = "e", descriptor = "I")
    private int field2343 = class18.method139(8);

    @OriginalMember(owner = "client!d", name = "f", descriptor = "[I")
    private int[] field2344;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "([FIZ)V", line = 5)
    public final void method896(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class18.field526[this.field2343].field1475;
        int var6 = this.field2339 - this.field2342;
        int var7 = var6 / this.field2345;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class18.field526[this.field2343].method531();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field2340;
                        }
                        var11 /= this.field2340;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field2344[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field2345 * var10 + this.field2342;
                        class83 var17 = class18.field526[var15];
                        if (this.field2341 == 0) {
                            int var18 = this.field2345 / var17.field1475;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method528();
                                for (int var21 = 0; var21 < var17.field1475; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field2345) {
                                float[] var23 = var17.method528();
                                for (int var24 = 0; var24 < var17.field1475; var24++) {
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

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "()V", line = 133)
    public class135() {
        int[] var1 = new int[this.field2340];
        for (int var2 = 0; var2 < this.field2340; var2++) {
            int var3 = 0;
            int var4 = class18.method139(3);
            boolean var5 = class18.method140() != 0;
            if (var5) {
                var3 = class18.method139(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field2344 = new int[this.field2340 * 8];
        for (int var6 = 0; var6 < this.field2340 * 8; var6++) {
            this.field2344[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class18.method139(8);
        }
    }
}
