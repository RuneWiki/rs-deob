import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class157 {

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "I")
    private int field3009 = class84.method506(16);

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "I")
    private int field3010 = class84.method506(24);

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
    private int field3005 = class84.method506(24);

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "I")
    private int field3004 = class84.method506(24) + 1;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
    private int field3007 = class84.method506(6) + 1;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
    private int field3006 = class84.method506(8);

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "[I")
    private int[] field3008;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "([FIZ)V")
    public final void method1015(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class84.field1545[this.field3006].field890;
        int var6 = this.field3005 - this.field3010;
        int var7 = var6 / this.field3004;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class84.field1545[this.field3006].method312();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field3007;
                        }
                        var11 /= this.field3007;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field3008[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field3004 * var10 + this.field3010;
                        class50 var17 = class84.field1545[var15];
                        if (this.field3009 == 0) {
                            int var18 = this.field3004 / var17.field890;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method315();
                                for (int var21 = 0; var21 < var17.field890; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field3004) {
                                float[] var23 = var17.method315();
                                for (int var24 = 0; var24 < var17.field890; var24++) {
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

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "()V")
    public class157() {
        int[] var1 = new int[this.field3007];
        for (int var2 = 0; var2 < this.field3007; var2++) {
            int var4 = 0;
            int var5 = class84.method506(3);
            boolean var6 = class84.method504() != 0;
            if (var6) {
                var4 = class84.method506(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field3008 = new int[this.field3007 * 8];
        for (int var3 = 0; var3 < this.field3007 * 8; var3++) {
            this.field3008[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class84.method506(8);
        }
    }
}
