import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class54 {

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
    private int field865 = class296.method2087(16);

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
    private int field864 = class296.method2087(24);

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
    private int field866 = class296.method2087(24);

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
    private int field867 = class296.method2087(24) + 1;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "I")
    private int field869 = class296.method2087(6) + 1;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
    private int field863 = class296.method2087(8);

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "[I")
    private int[] field868;

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "()V", line = 9)
    public class54() {
        int[] var1 = new int[this.field869];
        for (int var2 = 0; var2 < this.field869; var2++) {
            int var3 = 0;
            int var4 = class296.method2087(3);
            boolean var5 = class296.method2083() != 0;
            if (var5) {
                var3 = class296.method2087(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field868 = new int[this.field869 * 8];
        for (int var6 = 0; var6 < this.field869 * 8; var6++) {
            this.field868[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class296.method2087(8);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "([FIZ)V", line = 48)
    public final void method400(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class296.field4939[this.field863].field1675;
        int var6 = this.field866 - this.field864;
        int var7 = var6 / this.field867;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class296.field4939[this.field863].method757();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field869;
                        }
                        var11 /= this.field869;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field868[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field867 * var10 + this.field864;
                        class106 var17 = class296.field4939[var15];
                        if (this.field865 == 0) {
                            int var18 = this.field867 / var17.field1675;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method755();
                                for (int var21 = 0; var21 < var17.field1675; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field867) {
                                float[] var23 = var17.method755();
                                for (int var24 = 0; var24 < var17.field1675; var24++) {
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
}
