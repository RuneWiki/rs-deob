import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class159 {

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "I")
    private int field2204 = class74.method635(16);

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "I")
    private int field2202 = class74.method635(24);

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "I")
    private int field2200 = class74.method635(24);

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "I")
    private int field2203 = class74.method635(24) + 1;

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "I")
    private int field2205 = class74.method635(6) + 1;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "I")
    private int field2201 = class74.method635(8);

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "[I")
    private int[] field2206;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "([FIZ)V", line = 9)
    public final void method1083(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class74.field1020[this.field2201].field1994;
        int var6 = this.field2200 - this.field2202;
        int var7 = var6 / this.field2203;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class74.field1020[this.field2201].method964();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field2205;
                        }
                        var11 /= this.field2205;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field2206[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field2203 * var10 + this.field2202;
                        class139 var17 = class74.field1020[var15];
                        if (this.field2204 == 0) {
                            int var18 = this.field2203 / var17.field1994;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method965();
                                for (int var21 = 0; var21 < var17.field1994; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field2203) {
                                float[] var23 = var17.method965();
                                for (int var24 = 0; var24 < var17.field1994; var24++) {
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

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "()V", line = 133)
    public class159() {
        int[] var1 = new int[this.field2205];
        for (int var2 = 0; var2 < this.field2205; var2++) {
            int var4 = 0;
            int var5 = class74.method635(3);
            boolean var6 = class74.method642() != 0;
            if (var6) {
                var4 = class74.method635(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field2206 = new int[this.field2205 * 8];
        for (int var3 = 0; var3 < this.field2205 * 8; var3++) {
            this.field2206[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class74.method635(8);
        }
    }
}
