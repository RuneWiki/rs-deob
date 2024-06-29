import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class276 {

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "I")
    private int field4815 = class204.method1446(16);

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "I")
    private int field4811 = class204.method1446(24);

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "I")
    private int field4814 = class204.method1446(24);

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "I")
    private int field4817 = class204.method1446(24) + 1;

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "I")
    private int field4813 = class204.method1446(6) + 1;

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "I")
    private int field4812 = class204.method1446(8);

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "[I")
    private int[] field4816;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "([FIZ)V")
    public final void method1860(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class204.field3655[this.field4812].field2280;
        int var6 = this.field4814 - this.field4811;
        int var7 = var6 / this.field4817;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class204.field3655[this.field4812].method963();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field4813;
                        }
                        var11 /= this.field4813;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field4816[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field4817 * var10 + this.field4811;
                        class123 var17 = class204.field3655[var15];
                        if (this.field4815 == 0) {
                            int var18 = this.field4817 / var17.field2280;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method964();
                                for (int var21 = 0; var21 < var17.field2280; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field4817) {
                                float[] var23 = var17.method964();
                                for (int var24 = 0; var24 < var17.field2280; var24++) {
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

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "()V")
    public class276() {
        int[] var1 = new int[this.field4813];
        for (int var2 = 0; var2 < this.field4813; var2++) {
            int var4 = 0;
            int var5 = class204.method1446(3);
            boolean var6 = class204.method1444() != 0;
            if (var6) {
                var4 = class204.method1446(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field4816 = new int[this.field4813 * 8];
        for (int var3 = 0; var3 < this.field4813 * 8; var3++) {
            this.field4816[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class204.method1446(8);
        }
    }
}
