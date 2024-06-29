import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tca")
public class class174 {

    @OriginalMember(owner = "client!tca", name = "c", descriptor = "I")
    private int field2152 = class57.method327(16);

    @OriginalMember(owner = "client!tca", name = "e", descriptor = "I")
    private int field2154 = class57.method327(24);

    @OriginalMember(owner = "client!tca", name = "g", descriptor = "I")
    private int field2156 = class57.method327(24);

    @OriginalMember(owner = "client!tca", name = "f", descriptor = "I")
    private int field2155 = class57.method327(24) + 1;

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "I")
    private int field2150 = class57.method327(6) + 1;

    @OriginalMember(owner = "client!tca", name = "b", descriptor = "I")
    private int field2151 = class57.method327(8);

    @OriginalMember(owner = "client!tca", name = "d", descriptor = "[I")
    private int[] field2153;

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "([FIZ)V")
    public final void method1000(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class57.field582[this.field2151].field6877;
        int var6 = this.field2156 - this.field2154;
        int var7 = var6 / this.field2155;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class57.field582[this.field2151].method2825();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field2150;
                        }
                        var11 /= this.field2150;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field2153[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field2155 * var10 + this.field2154;
                        class508 var17 = class57.field582[var15];
                        if (this.field2152 == 0) {
                            int var18 = this.field2155 / var17.field6877;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method2826();
                                for (int var21 = 0; var21 < var17.field6877; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field2155) {
                                float[] var23 = var17.method2826();
                                for (int var24 = 0; var24 < var17.field6877; var24++) {
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

    @OriginalMember(owner = "client!tca", name = "<init>", descriptor = "()V")
    public class174() {
        int[] var1 = new int[this.field2150];
        for (int var2 = 0; var2 < this.field2150; var2++) {
            int var4 = 0;
            int var5 = class57.method327(3);
            boolean var6 = class57.method323() != 0;
            if (var6) {
                var4 = class57.method327(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field2153 = new int[this.field2150 * 8];
        for (int var3 = 0; var3 < this.field2150 * 8; var3++) {
            this.field2153[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class57.method327(8);
        }
    }
}
