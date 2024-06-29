import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class16 {

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
    private int field491 = class192.method1285(16);

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
    private int field492 = class192.method1285(24);

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "I")
    private int field493 = class192.method1285(24);

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
    private int field494 = class192.method1285(24) + 1;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "I")
    private int field496 = class192.method1285(6) + 1;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
    private int field495 = class192.method1285(8);

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "[I")
    private int[] field497;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "([FIZ)V")
    public final void method165(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class192.field3439[this.field495].field2233;
        int var6 = this.field493 - this.field492;
        int var7 = var6 / this.field494;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class192.field3439[this.field495].method830();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field496;
                        }
                        var11 /= this.field496;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field497[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field494 * var10 + this.field492;
                        class118 var17 = class192.field3439[var15];
                        if (this.field491 == 0) {
                            int var18 = this.field494 / var17.field2233;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method829();
                                for (int var21 = 0; var21 < var17.field2233; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field494) {
                                float[] var23 = var17.method829();
                                for (int var24 = 0; var24 < var17.field2233; var24++) {
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

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "()V")
    public class16() {
        int[] var1 = new int[this.field496];
        for (int var2 = 0; var2 < this.field496; var2++) {
            int var4 = 0;
            int var5 = class192.method1285(3);
            boolean var6 = class192.method1289() != 0;
            if (var6) {
                var4 = class192.method1285(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field497 = new int[this.field496 * 8];
        for (int var3 = 0; var3 < this.field496 * 8; var3++) {
            this.field497[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class192.method1285(8);
        }
    }
}
