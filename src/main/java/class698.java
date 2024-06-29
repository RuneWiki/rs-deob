import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class698 {

    @OriginalMember(owner = "client!lr", name = "e", descriptor = "I")
    private int field9879 = class359.method2186(16);

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "I")
    private int field9877 = class359.method2186(24);

    @OriginalMember(owner = "client!lr", name = "f", descriptor = "I")
    private int field9880 = class359.method2186(24);

    @OriginalMember(owner = "client!lr", name = "g", descriptor = "I")
    private int field9881 = class359.method2186(24) + 1;

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "I")
    private int field9876 = class359.method2186(6) + 1;

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "I")
    private int field9878 = class359.method2186(8);

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "[I")
    private int[] field9875;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "([FIZ)V", line = 7)
    public final void method3895(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class359.field5142[this.field9878].field5880;
        int var6 = this.field9880 - this.field9877;
        int var7 = var6 / this.field9881;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class359.field5142[this.field9878].method2438();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field9876;
                        }
                        var11 /= this.field9876;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field9875[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field9881 * var10 + this.field9877;
                        class397 var17 = class359.field5142[var15];
                        if (this.field9879 == 0) {
                            int var18 = this.field9881 / var17.field5880;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method2440();
                                for (int var21 = 0; var21 < var17.field5880; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field9881) {
                                float[] var23 = var17.method2440();
                                for (int var24 = 0; var24 < var17.field5880; var24++) {
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

    @OriginalMember(owner = "client!lr", name = "<init>", descriptor = "()V", line = 133)
    public class698() {
        int[] var1 = new int[this.field9876];
        for (int var2 = 0; var2 < this.field9876; var2++) {
            int var4 = 0;
            int var5 = class359.method2186(3);
            boolean var6 = class359.method2196() != 0;
            if (var6) {
                var4 = class359.method2186(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field9875 = new int[this.field9876 * 8];
        for (int var3 = 0; var3 < this.field9876 * 8; var3++) {
            this.field9875[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class359.method2186(8);
        }
    }
}
