import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class3 {

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
    private int field21 = class108.method803(16);

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
    private int field18 = class108.method803(24);

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
    private int field17 = class108.method803(24);

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "I")
    private int field22 = class108.method803(24) + 1;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
    private int field20 = class108.method803(6) + 1;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
    private int field16 = class108.method803(8);

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "[I")
    private int[] field19;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "([FIZ)V", line = 8)
    public final void method8(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class108.field1678[this.field16].field3319;
        int var6 = this.field17 - this.field18;
        int var7 = var6 / this.field22;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class108.field1678[this.field16].method1415();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field20;
                        }
                        var11 /= this.field20;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field19[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field22 * var10 + this.field18;
                        class202 var17 = class108.field1678[var15];
                        if (this.field21 == 0) {
                            int var18 = this.field22 / var17.field3319;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1413();
                                for (int var21 = 0; var21 < var17.field3319; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field22) {
                                float[] var23 = var17.method1413();
                                for (int var24 = 0; var24 < var17.field3319; var24++) {
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

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "()V", line = 133)
    public class3() {
        int[] var1 = new int[this.field20];
        for (int var2 = 0; var2 < this.field20; var2++) {
            int var3 = 0;
            int var4 = class108.method803(3);
            boolean var5 = class108.method794() != 0;
            if (var5) {
                var3 = class108.method803(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field19 = new int[this.field20 * 8];
        for (int var6 = 0; var6 < this.field20 * 8; var6++) {
            this.field19[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class108.method803(8);
        }
    }
}
