import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class338 {

    @OriginalMember(owner = "client!np", name = "e", descriptor = "I")
    private int field5157 = class195.method1327(16);

    @OriginalMember(owner = "client!np", name = "f", descriptor = "I")
    private int field5158 = class195.method1327(24);

    @OriginalMember(owner = "client!np", name = "a", descriptor = "I")
    private int field5153 = class195.method1327(24);

    @OriginalMember(owner = "client!np", name = "c", descriptor = "I")
    private int field5155 = class195.method1327(24) + 1;

    @OriginalMember(owner = "client!np", name = "b", descriptor = "I")
    private int field5154 = class195.method1327(6) + 1;

    @OriginalMember(owner = "client!np", name = "d", descriptor = "I")
    private int field5156 = class195.method1327(8);

    @OriginalMember(owner = "client!np", name = "g", descriptor = "[I")
    private int[] field5159;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "([FIZ)V")
    public final void method2213(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class195.field2863[this.field5156].field57;
        int var6 = this.field5153 - this.field5158;
        int var7 = var6 / this.field5155;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class195.field2863[this.field5156].method36();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field5154;
                        }
                        var11 /= this.field5154;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field5159[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field5155 * var10 + this.field5158;
                        class3 var17 = class195.field2863[var15];
                        if (this.field5157 == 0) {
                            int var18 = this.field5155 / var17.field57;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method33();
                                for (int var21 = 0; var21 < var17.field57; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field5155) {
                                float[] var23 = var17.method33();
                                for (int var24 = 0; var24 < var17.field57; var24++) {
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

    @OriginalMember(owner = "client!np", name = "<init>", descriptor = "()V")
    public class338() {
        int[] var1 = new int[this.field5154];
        for (int var2 = 0; var2 < this.field5154; var2++) {
            int var4 = 0;
            int var5 = class195.method1327(3);
            boolean var6 = class195.method1325() != 0;
            if (var6) {
                var4 = class195.method1327(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field5159 = new int[this.field5154 * 8];
        for (int var3 = 0; var3 < this.field5154 * 8; var3++) {
            this.field5159[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class195.method1327(8);
        }
    }
}
