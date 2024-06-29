import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public class class429 {

    @OriginalMember(owner = "client!sv", name = "f", descriptor = "I")
    private int field6092 = class253.method1490(16);

    @OriginalMember(owner = "client!sv", name = "c", descriptor = "I")
    private int field6089 = class253.method1490(24);

    @OriginalMember(owner = "client!sv", name = "d", descriptor = "I")
    private int field6090 = class253.method1490(24);

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "I")
    private int field6088 = class253.method1490(24) + 1;

    @OriginalMember(owner = "client!sv", name = "g", descriptor = "I")
    private int field6093 = class253.method1490(6) + 1;

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "I")
    private int field6087 = class253.method1490(8);

    @OriginalMember(owner = "client!sv", name = "e", descriptor = "[I")
    private int[] field6091;

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "([FIZ)V", line = 9)
    public final void method2474(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class253.field3180[this.field6087].field550;
        int var6 = this.field6090 - this.field6089;
        int var7 = var6 / this.field6088;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class253.field3180[this.field6087].method283();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field6093;
                        }
                        var11 /= this.field6093;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field6091[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field6088 * var10 + this.field6089;
                        class54 var17 = class253.field3180[var15];
                        if (this.field6092 == 0) {
                            int var18 = this.field6088 / var17.field550;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method285();
                                for (int var21 = 0; var21 < var17.field550; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field6088) {
                                float[] var23 = var17.method285();
                                for (int var24 = 0; var24 < var17.field550; var24++) {
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

    @OriginalMember(owner = "client!sv", name = "<init>", descriptor = "()V", line = 133)
    public class429() {
        int[] var1 = new int[this.field6093];
        for (int var2 = 0; var2 < this.field6093; var2++) {
            int var4 = 0;
            int var5 = class253.method1490(3);
            boolean var6 = class253.method1488() != 0;
            if (var6) {
                var4 = class253.method1490(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field6091 = new int[this.field6093 * 8];
        for (int var3 = 0; var3 < this.field6093 * 8; var3++) {
            this.field6091[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class253.method1490(8);
        }
    }
}
