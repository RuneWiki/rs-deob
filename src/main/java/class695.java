import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class695 {

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "I")
    private int field9879 = class172.method1219(16);

    @OriginalMember(owner = "client!mo", name = "g", descriptor = "I")
    private int field9885 = class172.method1219(24);

    @OriginalMember(owner = "client!mo", name = "e", descriptor = "I")
    private int field9883 = class172.method1219(24);

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "I")
    private int field9882 = class172.method1219(24) + 1;

    @OriginalMember(owner = "client!mo", name = "f", descriptor = "I")
    private int field9884 = class172.method1219(6) + 1;

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "I")
    private int field9881 = class172.method1219(8);

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "[I")
    private int[] field9880;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "([FIZ)V")
    public final void method3907(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class172.field2502[this.field9881].field3515;
        int var6 = this.field9883 - this.field9885;
        int var7 = var6 / this.field9882;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class172.field2502[this.field9881].method1582();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field9884;
                        }
                        var11 /= this.field9884;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field9880[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field9882 * var10 + this.field9885;
                        class258 var17 = class172.field2502[var15];
                        if (this.field9879 == 0) {
                            int var18 = this.field9882 / var17.field3515;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1584();
                                for (int var21 = 0; var21 < var17.field3515; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field9882) {
                                float[] var23 = var17.method1584();
                                for (int var24 = 0; var24 < var17.field3515; var24++) {
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

    @OriginalMember(owner = "client!mo", name = "<init>", descriptor = "()V")
    public class695() {
        int[] var1 = new int[this.field9884];
        for (int var2 = 0; var2 < this.field9884; var2++) {
            int var4 = 0;
            int var5 = class172.method1219(3);
            boolean var6 = class172.method1212() != 0;
            if (var6) {
                var4 = class172.method1219(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field9880 = new int[this.field9884 * 8];
        for (int var3 = 0; var3 < this.field9884 * 8; var3++) {
            this.field9880[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class172.method1219(8);
        }
    }
}
