import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class357 {

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "I")
    private int field5685 = class307.method2242(16);

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "I")
    private int field5679 = class307.method2242(24);

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "I")
    private int field5683 = class307.method2242(24);

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "I")
    private int field5682 = class307.method2242(24) + 1;

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "I")
    private int field5684 = class307.method2242(6) + 1;

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "I")
    private int field5680 = class307.method2242(8);

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "[I")
    private int[] field5681;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "([FIZ)V", line = 6)
    public final void method2528(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class307.field4991[this.field5680].field4708;
        int var6 = this.field5683 - this.field5679;
        int var7 = var6 / this.field5682;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class307.field4991[this.field5680].method2060();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field5684;
                        }
                        var11 /= this.field5684;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field5681[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field5682 * var10 + this.field5679;
                        class290 var17 = class307.field4991[var15];
                        if (this.field5685 == 0) {
                            int var18 = this.field5682 / var17.field4708;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method2062();
                                for (int var21 = 0; var21 < var17.field4708; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field5682) {
                                float[] var23 = var17.method2062();
                                for (int var24 = 0; var24 < var17.field4708; var24++) {
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

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "()V", line = 133)
    public class357() {
        int[] var1 = new int[this.field5684];
        for (int var2 = 0; var2 < this.field5684; var2++) {
            int var3 = 0;
            int var4 = class307.method2242(3);
            boolean var5 = class307.method2238() != 0;
            if (var5) {
                var3 = class307.method2242(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field5681 = new int[this.field5684 * 8];
        for (int var6 = 0; var6 < this.field5684 * 8; var6++) {
            this.field5681[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class307.method2242(8);
        }
    }
}
