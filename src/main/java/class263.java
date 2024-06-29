import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class263 {

    @OriginalMember(owner = "client!bp", name = "e", descriptor = "I")
    private int field3324 = class396.method2363(16);

    @OriginalMember(owner = "client!bp", name = "f", descriptor = "I")
    private int field3325 = class396.method2363(24);

    @OriginalMember(owner = "client!bp", name = "d", descriptor = "I")
    private int field3323 = class396.method2363(24);

    @OriginalMember(owner = "client!bp", name = "c", descriptor = "I")
    private int field3322 = class396.method2363(24) + 1;

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "I")
    private int field3321 = class396.method2363(6) + 1;

    @OriginalMember(owner = "client!bp", name = "g", descriptor = "I")
    private int field3326 = class396.method2363(8);

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "[I")
    private int[] field3320;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "([FIZ)V")
    public final void method1570(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class396.field5665[this.field3326].field7770;
        int var6 = this.field3323 - this.field3325;
        int var7 = var6 / this.field3322;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class396.field5665[this.field3326].method3132();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field3321;
                        }
                        var11 /= this.field3321;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field3320[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field3322 * var10 + this.field3325;
                        class526 var17 = class396.field5665[var15];
                        if (this.field3324 == 0) {
                            int var18 = this.field3322 / var17.field7770;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method3134();
                                for (int var21 = 0; var21 < var17.field7770; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field3322) {
                                float[] var23 = var17.method3134();
                                for (int var24 = 0; var24 < var17.field7770; var24++) {
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

    @OriginalMember(owner = "client!bp", name = "<init>", descriptor = "()V")
    public class263() {
        int[] var1 = new int[this.field3321];
        for (int var2 = 0; var2 < this.field3321; var2++) {
            int var4 = 0;
            int var5 = class396.method2363(3);
            boolean var6 = class396.method2359() != 0;
            if (var6) {
                var4 = class396.method2363(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field3320 = new int[this.field3321 * 8];
        for (int var3 = 0; var3 < this.field3321 * 8; var3++) {
            this.field3320[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class396.method2363(8);
        }
    }
}
