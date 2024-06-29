import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class34 {

    @OriginalMember(owner = "client!d", name = "f", descriptor = "I")
    private int field616 = class25.method182(16);

    @OriginalMember(owner = "client!d", name = "e", descriptor = "I")
    private int field615 = class25.method182(24);

    @OriginalMember(owner = "client!d", name = "c", descriptor = "I")
    private int field613 = class25.method182(24);

    @OriginalMember(owner = "client!d", name = "g", descriptor = "I")
    private int field617 = class25.method182(24) + 1;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "I")
    private int field612 = class25.method182(6) + 1;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "I")
    private int field611 = class25.method182(8);

    @OriginalMember(owner = "client!d", name = "d", descriptor = "[I")
    private int[] field614;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "([FIZ)V")
    public final void method237(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class25.field433[this.field611].field2521;
        int var6 = this.field613 - this.field615;
        int var7 = var6 / this.field617;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class25.field433[this.field611].method944();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field612;
                        }
                        var11 /= this.field612;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field614[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field617 * var10 + this.field615;
                        class141 var17 = class25.field433[var15];
                        if (this.field616 == 0) {
                            int var18 = this.field617 / var17.field2521;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method943();
                                for (int var21 = 0; var21 < var17.field2521; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field617) {
                                float[] var23 = var17.method943();
                                for (int var24 = 0; var24 < var17.field2521; var24++) {
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

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "()V")
    public class34() {
        int[] var1 = new int[this.field612];
        for (int var2 = 0; var2 < this.field612; var2++) {
            int var4 = 0;
            int var5 = class25.method182(3);
            boolean var6 = class25.method179() != 0;
            if (var6) {
                var4 = class25.method182(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field614 = new int[this.field612 * 8];
        for (int var3 = 0; var3 < this.field612 * 8; var3++) {
            this.field614[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class25.method182(8);
        }
    }
}
