import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class47 {

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "I")
    private int field868 = class88.method690(16);

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "I")
    private int field863 = class88.method690(24);

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "I")
    private int field864 = class88.method690(24);

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
    private int field865 = class88.method690(24) + 1;

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "I")
    private int field867 = class88.method690(6) + 1;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "I")
    private int field869 = class88.method690(8);

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "[I")
    private int[] field866;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "([FIZ)V")
    public final void method343(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class88.field2000[this.field869].field33;
        int var6 = this.field864 - this.field863;
        int var7 = var6 / this.field865;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class88.field2000[this.field869].method8();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field867;
                        }
                        var11 /= this.field867;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field866[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field865 * var10 + this.field863;
                        class3 var17 = class88.field2000[var15];
                        if (this.field868 == 0) {
                            int var18 = this.field865 / var17.field33;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method9();
                                for (int var21 = 0; var21 < var17.field33; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field865) {
                                float[] var23 = var17.method9();
                                for (int var24 = 0; var24 < var17.field33; var24++) {
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

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "()V")
    public class47() {
        int[] var1 = new int[this.field867];
        for (int var2 = 0; var2 < this.field867; var2++) {
            int var4 = 0;
            int var5 = class88.method690(3);
            boolean var6 = class88.method687() != 0;
            if (var6) {
                var4 = class88.method690(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field866 = new int[this.field867 * 8];
        for (int var3 = 0; var3 < this.field867 * 8; var3++) {
            this.field866[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class88.method690(8);
        }
    }
}
