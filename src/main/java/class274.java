import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class274 {

    @OriginalMember(owner = "client!md", name = "c", descriptor = "I")
    private int field4359 = class63.method601(16);

    @OriginalMember(owner = "client!md", name = "b", descriptor = "I")
    private int field4358 = class63.method601(24);

    @OriginalMember(owner = "client!md", name = "e", descriptor = "I")
    private int field4361 = class63.method601(24);

    @OriginalMember(owner = "client!md", name = "d", descriptor = "I")
    private int field4360 = class63.method601(24) + 1;

    @OriginalMember(owner = "client!md", name = "f", descriptor = "I")
    private int field4362 = class63.method601(6) + 1;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "I")
    private int field4357 = class63.method601(8);

    @OriginalMember(owner = "client!md", name = "g", descriptor = "[I")
    private int[] field4363;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "([FIZ)V", line = 5)
    public final void method1880(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class63.field981[this.field4357].field718;
        int var6 = this.field4361 - this.field4358;
        int var7 = var6 / this.field4360;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class63.field981[this.field4357].method397();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field4362;
                        }
                        var11 /= this.field4362;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field4363[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field4360 * var10 + this.field4358;
                        class46 var17 = class63.field981[var15];
                        if (this.field4359 == 0) {
                            int var18 = this.field4360 / var17.field718;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method398();
                                for (int var21 = 0; var21 < var17.field718; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field4360) {
                                float[] var23 = var17.method398();
                                for (int var24 = 0; var24 < var17.field718; var24++) {
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

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "()V", line = 133)
    public class274() {
        int[] var1 = new int[this.field4362];
        for (int var2 = 0; var2 < this.field4362; var2++) {
            int var3 = 0;
            int var4 = class63.method601(3);
            boolean var5 = class63.method597() != 0;
            if (var5) {
                var3 = class63.method601(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field4363 = new int[this.field4362 * 8];
        for (int var6 = 0; var6 < this.field4362 * 8; var6++) {
            this.field4363[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class63.method601(8);
        }
    }
}
