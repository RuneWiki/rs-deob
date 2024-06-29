import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class192 {

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "I")
    private int field3078 = class188.method1185(16);

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "I")
    private int field3075 = class188.method1185(24);

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "I")
    private int field3077 = class188.method1185(24);

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "I")
    private int field3079 = class188.method1185(24) + 1;

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "I")
    private int field3076 = class188.method1185(6) + 1;

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "I")
    private int field3080 = class188.method1185(8);

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "[I")
    private int[] field3081;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "([FIZ)V", line = 6)
    public final void method1238(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class188.field2966[this.field3080].field1259;
        int var6 = this.field3077 - this.field3075;
        int var7 = var6 / this.field3079;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class188.field2966[this.field3080].method566();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field3076;
                        }
                        var11 /= this.field3076;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field3081[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field3079 * var10 + this.field3075;
                        class83 var17 = class188.field2966[var15];
                        if (this.field3078 == 0) {
                            int var18 = this.field3079 / var17.field1259;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method565();
                                for (int var21 = 0; var21 < var17.field1259; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field3079) {
                                float[] var23 = var17.method565();
                                for (int var24 = 0; var24 < var17.field1259; var24++) {
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

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "()V", line = 133)
    public class192() {
        int[] var1 = new int[this.field3076];
        for (int var2 = 0; var2 < this.field3076; var2++) {
            int var3 = 0;
            int var4 = class188.method1185(3);
            boolean var5 = class188.method1188() != 0;
            if (var5) {
                var3 = class188.method1185(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field3081 = new int[this.field3076 * 8];
        for (int var6 = 0; var6 < this.field3076 * 8; var6++) {
            this.field3081[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class188.method1185(8);
        }
    }
}
