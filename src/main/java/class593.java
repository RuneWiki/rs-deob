import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class593 extends class371 {

    @OriginalMember(owner = "client!rj", name = "J", descriptor = "I")
    private int field8756 = 4;

    @OriginalMember(owner = "client!rj", name = "Q", descriptor = "I")
    private int field8763 = 4;

    @OriginalMember(owner = "client!rj", name = "O", descriptor = "Lqp;")
    public static class586 field8761 = new class586(92, -1);

    @OriginalMember(owner = "client!rj", name = "I", descriptor = "I")
    public static int field8755;

    @OriginalMember(owner = "client!rj", name = "K", descriptor = "I")
    public static int field8757;

    @OriginalMember(owner = "client!rj", name = "L", descriptor = "I")
    public static int field8758;

    @OriginalMember(owner = "client!rj", name = "M", descriptor = "I")
    public static int field8759;

    @OriginalMember(owner = "client!rj", name = "N", descriptor = "I")
    public static int field8760;

    @OriginalMember(owner = "client!rj", name = "P", descriptor = "I")
    public static int field8762;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method3450(String arg0, byte arg1) {
        ++field8760;
        if (class625.field9168 != null) {
            class165.method1046(-3466, class126.field1663);
            if (arg1 != -66) {
                field8761 = null;
            }
            ++class187.field2850;
            class221.field3268.method2563(arg1 ^ 12957, class83.method488(arg1 + -59, arg0));
            class221.field3268.method2580(arg0, arg1 ^ -30191);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(BI)[[I")
    public final int[][] method78(byte arg0, int arg1) {
        if (arg0 != 36) {
            return null;
        } else {
            ++field8759;
            int[][] var3 = super.field5364.method3064(1, arg1);
            if (super.field5364.field7632) {
                int var4 = class41.field455 / this.field8763;
                int var5 = class23.field201 / this.field8756;
                int[][] var7;
                if (~var5 < -1) {
                    int var6 = arg1 % var5;
                    var7 = this.method2263((byte) -99, 0, class23.field201 * var6 / var5);
                } else {
                    var7 = this.method2263((byte) -103, 0, 0);
                }
                int[] var8 = var7[0];
                int[] var9 = var7[1];
                int[] var10 = var7[2];
                int[] var11 = var3[0];
                int[] var12 = var3[1];
                int[] var13 = var3[2];
                for (int var14 = 0; class41.field455 > var14; ++var14) {
                    int var16;
                    if (~var4 < -1) {
                        int var15 = var14 % var4;
                        var16 = class41.field455 * var15 / var4;
                    } else {
                        var16 = 0;
                    }
                    var11[var14] = var8[var16];
                    var12[var14] = var9[var16];
                    var13[var14] = var10[var16];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(BI)[I")
    public final int[] method79(byte arg0, int arg1) {
        ++field8758;
        int[] var3 = super.field5378.method1451(-115, arg1);
        if (super.field5378.field3254) {
            int var4 = class41.field455 / this.field8763;
            int var5 = class23.field201 / this.field8756;
            int[] var6;
            if (~var5 >= -1) {
                var6 = this.method2260((byte) -74, 0, 0);
            } else {
                int var7 = arg1 % var5;
                var6 = this.method2260((byte) -71, class23.field201 * var7 / var5, 0);
            }
            for (int var8 = 0; ~class41.field455 < ~var8; ++var8) {
                if (var4 > 0) {
                    int var9 = var8 % var4;
                    var3[var8] = var6[class41.field455 * var9 / var4];
                } else {
                    var3[var8] = var6[0];
                }
            }
        }
        if (arg0 >= -80) {
            this.method78((byte) 48, -57);
        }
        return var3;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIII)I")
    public static final int method3451(int arg0, int arg1, int arg2, int arg3) {
        ++field8755;
        if (~arg0 >= -244) {
            if (~arg0 >= -218) {
                if (~arg0 < -193) {
                    arg2 >>= 2;
                } else if (~arg0 < -180) {
                    arg2 >>= 1;
                }
            } else {
                arg2 >>= 3;
            }
        } else {
            arg2 >>= 4;
        }
        return arg3 != 0 ? 17 : (arg0 >> 1) + (((arg1 >> 2 & 63) << 10) - -(arg2 >> 5 << 7));
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IBLps;)V")
    public final void method81(int arg0, byte arg1, class428 arg2) {
        ++field8757;
        if (~arg0 != -1) {
            if (arg0 == 1) {
                this.field8756 = arg2.method2561((byte) 108);
            }
        } else {
            this.field8763 = arg2.method2561((byte) -90);
        }
        int var5 = -5 % ((arg1 - -15) / 39);
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "()V")
    public class593() {
        super(1, false);
    }

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "(I)V")
    public static void method3452(int arg0) {
        if (arg0 == 26986) {
            field8761 = null;
        }
    }
}
