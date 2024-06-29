import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class489 {

    @OriginalMember(owner = "client!cr", name = "f", descriptor = "I")
    private int field6476 = class416.method2222(16);

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "I")
    private int field6472 = class416.method2222(24);

    @OriginalMember(owner = "client!cr", name = "d", descriptor = "I")
    private int field6474 = class416.method2222(24);

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "I")
    private int field6471 = class416.method2222(24) + 1;

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "I")
    private int field6473 = class416.method2222(6) + 1;

    @OriginalMember(owner = "client!cr", name = "e", descriptor = "I")
    private int field6475 = class416.method2222(8);

    @OriginalMember(owner = "client!cr", name = "g", descriptor = "[I")
    private int[] field6477;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "([FIZ)V", line = 11)
    public final void method2642(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class416.field5204[this.field6475].field2637;
        int var6 = this.field6474 - this.field6472;
        int var7 = var6 / this.field6471;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class416.field5204[this.field6475].method1256();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field6473;
                        }
                        var11 /= this.field6473;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field6477[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field6471 * var10 + this.field6472;
                        class210 var17 = class416.field5204[var15];
                        if (this.field6476 == 0) {
                            int var18 = this.field6471 / var17.field2637;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1254();
                                for (int var21 = 0; var21 < var17.field2637; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field6471) {
                                float[] var23 = var17.method1254();
                                for (int var24 = 0; var24 < var17.field2637; var24++) {
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

    @OriginalMember(owner = "client!cr", name = "<init>", descriptor = "()V", line = 133)
    public class489() {
        int[] var1 = new int[this.field6473];
        for (int var2 = 0; var2 < this.field6473; var2++) {
            int var4 = 0;
            int var5 = class416.method2222(3);
            boolean var6 = class416.method2223() != 0;
            if (var6) {
                var4 = class416.method2222(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field6477 = new int[this.field6473 * 8];
        for (int var3 = 0; var3 < this.field6473 * 8; var3++) {
            this.field6477[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class416.method2222(8);
        }
    }
}
