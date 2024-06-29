import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class224 {

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "I")
    private int field3386 = class221.method1541(16);

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "I")
    private int field3391 = class221.method1541(24);

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "I")
    private int field3385 = class221.method1541(24);

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "I")
    private int field3390 = class221.method1541(24) + 1;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "I")
    private int field3389 = class221.method1541(6) + 1;

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
    private int field3387 = class221.method1541(8);

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "[I")
    private int[] field3388;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "([FIZ)V", line = 6)
    public final void method1561(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class221.field3339[this.field3387].field5292;
        int var6 = this.field3385 - this.field3391;
        int var7 = var6 / this.field3390;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class221.field3339[this.field3387].method2291();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field3389;
                        }
                        var11 /= this.field3389;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field3388[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field3390 * var10 + this.field3391;
                        class330 var17 = class221.field3339[var15];
                        if (this.field3386 == 0) {
                            int var18 = this.field3390 / var17.field5292;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method2290();
                                for (int var21 = 0; var21 < var17.field5292; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field3390) {
                                float[] var23 = var17.method2290();
                                for (int var24 = 0; var24 < var17.field5292; var24++) {
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

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "()V", line = 133)
    public class224() {
        int[] var1 = new int[this.field3389];
        for (int var2 = 0; var2 < this.field3389; var2++) {
            int var3 = 0;
            int var4 = class221.method1541(3);
            boolean var5 = class221.method1543() != 0;
            if (var5) {
                var3 = class221.method1541(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field3388 = new int[this.field3389 * 8];
        for (int var6 = 0; var6 < this.field3389 * 8; var6++) {
            this.field3388[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class221.method1541(8);
        }
    }
}
