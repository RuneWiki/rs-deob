import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class132 extends class107 {

    @OriginalMember(owner = "client!gf", name = "K", descriptor = "I")
    private int field2122 = 1024;

    @OriginalMember(owner = "client!gf", name = "F", descriptor = "I")
    private int field2118 = 3072;

    @OriginalMember(owner = "client!gf", name = "N", descriptor = "I")
    private int field2125 = 2048;

    @OriginalMember(owner = "client!gf", name = "G", descriptor = "I")
    public static int field2119 = -1;

    @OriginalMember(owner = "client!gf", name = "J", descriptor = "I")
    public static int field2121 = 0;

    @OriginalMember(owner = "client!gf", name = "D", descriptor = "I")
    public static int field2116;

    @OriginalMember(owner = "client!gf", name = "I", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!gf", name = "L", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!gf", name = "M", descriptor = "I")
    public static int field2124;

    @OriginalMember(owner = "client!gf", name = "O", descriptor = "I")
    public static int field2126;

    @OriginalMember(owner = "client!gf", name = "P", descriptor = "I")
    public static int field2127;

    @OriginalMember(owner = "client!gf", name = "Q", descriptor = "I")
    public static int field2128;

    @OriginalMember(owner = "client!gf", name = "E", descriptor = "Lrg;")
    public static class248 field2117;

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "(B)V")
    public static void method895(byte arg0) {
        if (arg0 != -27) {
            field2124 = -127;
        }
        field2117 = null;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILfj;B)V")
    public final void method195(int arg0, class274 arg1, byte arg2) {
        ++field2126;
        if (arg2 != 28) {
            field2121 = -58;
        }
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    super.field1660 = ~arg1.method1849(255) == -2;
                }
            } else {
                this.field2118 = arg1.method1837(252);
            }
        } else {
            this.field2122 = arg1.method1837(arg2 + 224);
        }
    }

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "(B)V")
    public final void method300(byte arg0) {
        if (arg0 == 35) {
            this.field2125 = this.field2118 - this.field2122;
            ++field2128;
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(II)[I")
    public final int[] method189(int arg0, int arg1) {
        int var3 = 7 % ((-34 - arg0) / 49);
        ++field2120;
        int[] var4 = super.field1661.method894(118, arg1);
        if (super.field1661.field2115) {
            int[] var5 = this.method756(0, arg1, -29053);
            for (int var6 = 0; ~class24.field443 < ~var6; ++var6) {
                var4[var6] = (var5[var6] * this.field2125 >> 12) + this.field2122;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIIIIIB)V")
    public static final void method896(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        ++field2123;
        if (arg6 >= 1 && arg5 >= 1 && arg6 <= 102 && ~arg5 >= -103) {
            if (!class143.method981(22351) && ~(class214.field3386[0][arg6][arg5] & 2) == -1) {
                int var8 = arg1;
                if ((class214.field3386[arg1][arg6][arg5] & 8) != 0) {
                    var8 = 0;
                }
                if (~class87.field1367 != ~var8) {
                    return;
                }
            }
            int var9 = arg1;
            if (arg1 < 3 && (2 & class214.field3386[1][arg6][arg5]) == 2) {
                var9 = arg1 + 1;
            }
            class170.method1203(arg0, (byte) 109, var9, arg1, class310.field5021[arg1], arg5, arg6);
            if (arg4 >= 0) {
                boolean var10 = class296.field4835;
                class296.field4835 = true;
                class263.method1775(arg1, arg4, false, 85, var9, arg5, false, arg2, arg3, class310.field5021[arg1], arg6);
                class296.field4835 = var10;
            }
        }
        if (arg7 <= 60) {
            method897((byte) -75, -39);
        }
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "()V")
    public class132() {
        super(1, false);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IB)[[I")
    public final int[][] method190(int arg0, byte arg1) {
        if (arg1 != -117) {
            this.field2122 = -61;
        }
        int[][] var3 = super.field1662.method1302(arg0, (byte) 26);
        if (super.field1662.field3063) {
            int[][] var4 = this.method759(0, -128, arg0);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var4[2];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class24.field443; ++var11) {
                var7[var11] = (var6[var11] * this.field2125 >> 12) + this.field2122;
                var8[var11] = (var5[var11] * this.field2125 >> 12) + this.field2122;
                var10[var11] = (var9[var11] * this.field2125 >> 12) + this.field2122;
            }
        }
        ++field2127;
        return var3;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(BI)I")
    public static final int method897(byte arg0, int arg1) {
        ++field2116;
        if (~arg1 < -1) {
            return 1;
        } else if (arg0 < 17) {
            return 77;
        } else {
            return arg1 < 0 ? -1 : 0;
        }
    }
}
