import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class26 {

    @OriginalMember(owner = "client!u", name = "f", descriptor = "I")
    private int field360 = class327.method2258(16);

    @OriginalMember(owner = "client!u", name = "c", descriptor = "I")
    private int field357 = class327.method2258(24);

    @OriginalMember(owner = "client!u", name = "b", descriptor = "I")
    private int field356 = class327.method2258(24);

    @OriginalMember(owner = "client!u", name = "a", descriptor = "I")
    private int field355 = class327.method2258(24) + 1;

    @OriginalMember(owner = "client!u", name = "e", descriptor = "I")
    private int field359 = class327.method2258(6) + 1;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "I")
    private int field358 = class327.method2258(8);

    @OriginalMember(owner = "client!u", name = "g", descriptor = "[I")
    private int[] field361;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "([FIZ)V", line = 5)
    public final void method163(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class327.field4933[this.field358].field785;
        int var6 = this.field356 - this.field357;
        int var7 = var6 / this.field355;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class327.field4933[this.field358].method441();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field359;
                        }
                        var11 /= this.field359;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field361[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field355 * var10 + this.field357;
                        class53 var17 = class327.field4933[var15];
                        if (this.field360 == 0) {
                            int var18 = this.field355 / var17.field785;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method443();
                                for (int var21 = 0; var21 < var17.field785; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field355) {
                                float[] var23 = var17.method443();
                                for (int var24 = 0; var24 < var17.field785; var24++) {
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

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "()V", line = 133)
    public class26() {
        int[] var1 = new int[this.field359];
        for (int var2 = 0; var2 < this.field359; var2++) {
            int var3 = 0;
            int var4 = class327.method2258(3);
            boolean var5 = class327.method2266() != 0;
            if (var5) {
                var3 = class327.method2258(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field361 = new int[this.field359 * 8];
        for (int var6 = 0; var6 < this.field359 * 8; var6++) {
            this.field361[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class327.method2258(8);
        }
    }
}
