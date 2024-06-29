import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ufa")
public class class682 {

    @OriginalMember(owner = "client!ufa", name = "e", descriptor = "I")
    private int field9455 = class552.method3227(16);

    @OriginalMember(owner = "client!ufa", name = "b", descriptor = "I")
    private int field9452 = class552.method3227(24);

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "I")
    private int field9451 = class552.method3227(24);

    @OriginalMember(owner = "client!ufa", name = "d", descriptor = "I")
    private int field9454 = class552.method3227(24) + 1;

    @OriginalMember(owner = "client!ufa", name = "g", descriptor = "I")
    private int field9457 = class552.method3227(6) + 1;

    @OriginalMember(owner = "client!ufa", name = "c", descriptor = "I")
    private int field9453 = class552.method3227(8);

    @OriginalMember(owner = "client!ufa", name = "f", descriptor = "[I")
    private int[] field9456;

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "([FIZ)V")
    public final void method3902(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class552.field7874[this.field9453].field10450;
        int var6 = this.field9451 - this.field9452;
        int var7 = var6 / this.field9454;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class552.field7874[this.field9453].method4168();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field9457;
                        }
                        var11 /= this.field9457;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field9456[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field9454 * var10 + this.field9452;
                        class746 var17 = class552.field7874[var15];
                        if (this.field9455 == 0) {
                            int var18 = this.field9454 / var17.field10450;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method4171();
                                for (int var21 = 0; var21 < var17.field10450; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field9454) {
                                float[] var23 = var17.method4171();
                                for (int var24 = 0; var24 < var17.field10450; var24++) {
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

    @OriginalMember(owner = "client!ufa", name = "<init>", descriptor = "()V")
    public class682() {
        int[] var1 = new int[this.field9457];
        for (int var2 = 0; var2 < this.field9457; var2++) {
            int var4 = 0;
            int var5 = class552.method3227(3);
            boolean var6 = class552.method3220() != 0;
            if (var6) {
                var4 = class552.method3227(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field9456 = new int[this.field9457 * 8];
        for (int var3 = 0; var3 < this.field9457 * 8; var3++) {
            this.field9456[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class552.method3227(8);
        }
    }
}
