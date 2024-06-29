import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public class class40 {

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "I")
    private int field1067 = class429.method2612(16);

    @OriginalMember(owner = "client!bt", name = "g", descriptor = "I")
    private int field1071 = class429.method2612(24);

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "I")
    private int field1066 = class429.method2612(24);

    @OriginalMember(owner = "client!bt", name = "d", descriptor = "I")
    private int field1068 = class429.method2612(24) + 1;

    @OriginalMember(owner = "client!bt", name = "f", descriptor = "I")
    private int field1070 = class429.method2612(6) + 1;

    @OriginalMember(owner = "client!bt", name = "e", descriptor = "I")
    private int field1069 = class429.method2612(8);

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "[I")
    private int[] field1065;

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "([FIZ)V")
    public final void method558(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class429.field6190[this.field1069].field1072;
        int var6 = this.field1066 - this.field1071;
        int var7 = var6 / this.field1068;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class429.field6190[this.field1069].method561();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1070;
                        }
                        var11 /= this.field1070;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1065[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1068 * var10 + this.field1071;
                        class41 var17 = class429.field6190[var15];
                        if (this.field1067 == 0) {
                            int var18 = this.field1068 / var17.field1072;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method559();
                                for (int var21 = 0; var21 < var17.field1072; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1068) {
                                float[] var23 = var17.method559();
                                for (int var24 = 0; var24 < var17.field1072; var24++) {
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

    @OriginalMember(owner = "client!bt", name = "<init>", descriptor = "()V")
    public class40() {
        int[] var1 = new int[this.field1070];
        for (int var2 = 0; var2 < this.field1070; var2++) {
            int var4 = 0;
            int var5 = class429.method2612(3);
            boolean var6 = class429.method2614() != 0;
            if (var6) {
                var4 = class429.method2612(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field1065 = new int[this.field1070 * 8];
        for (int var3 = 0; var3 < this.field1070 * 8; var3++) {
            this.field1065[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class429.method2612(8);
        }
    }
}
