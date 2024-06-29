import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class130 extends class124 {

    @OriginalMember(owner = "client!bc", name = "db", descriptor = "I")
    private int field2172 = -1;

    @OriginalMember(owner = "client!bc", name = "U", descriptor = "Le;")
    public static class191 field2163 = class54.method368("details", 2047);

    @OriginalMember(owner = "client!bc", name = "X", descriptor = "I")
    public static int field2166 = -1;

    @OriginalMember(owner = "client!bc", name = "W", descriptor = "Le;")
    public static class191 field2165 = class54.method368("l", 2047);

    @OriginalMember(owner = "client!bc", name = "ab", descriptor = "Le;")
    public static class191 field2169 = class54.method368("Ladevorgang )2 bitte warten Sie)3", 2047);

    @OriginalMember(owner = "client!bc", name = "eb", descriptor = "Z")
    public static boolean field2173 = false;

    @OriginalMember(owner = "client!bc", name = "P", descriptor = "I")
    public static int field2158;

    @OriginalMember(owner = "client!bc", name = "R", descriptor = "I")
    private int field2160;

    @OriginalMember(owner = "client!bc", name = "S", descriptor = "I")
    public static int field2161;

    @OriginalMember(owner = "client!bc", name = "T", descriptor = "I")
    public static int field2162;

    @OriginalMember(owner = "client!bc", name = "V", descriptor = "I")
    public static int field2164;

    @OriginalMember(owner = "client!bc", name = "Y", descriptor = "I")
    private int field2167;

    @OriginalMember(owner = "client!bc", name = "Z", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!bc", name = "bb", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!bc", name = "cb", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!bc", name = "Q", descriptor = "[I")
    private int[] field2159;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Z)V")
    public static void method879(boolean arg0) {
        field2165 = null;
        if (!arg0) {
            method880(-96, 30, 27, (byte) -95, -113, 39, 10, 121, 99);
        }
        field2169 = null;
        field2163 = null;
    }

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "(I)I")
    public final int method841(int arg0) {
        if (arg0 != 0) {
            this.method137(92, (byte) -48);
        }
        ++field2164;
        return this.field2172;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IB)[[I")
    public final int[][] method137(int arg0, byte arg1) {
        if (arg1 != -7) {
            field2173 = false;
        }
        ++field2162;
        int[][] var3 = super.field2053.method1775((byte) -100, arg0);
        if (super.field2053.field4558 && this.method882(false)) {
            int[] var4 = var3[0];
            int var5 = this.field2160 * (class87.field1423 == this.field2167 ? arg0 : this.field2167 * arg0 / class87.field1423);
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (class64.field1132 != this.field2160) {
                for (int var8 = 0; class64.field1132 > var8; ++var8) {
                    int var9 = this.field2160 * var8 / class64.field1132;
                    int var10 = this.field2159[var5 - -var9];
                    var7[var8] = class167.method1128(var10 << 4, 4080);
                    var6[var8] = class167.method1128(var10 >> 4, 4080);
                    var4[var8] = class167.method1128(var10, 16711680) >> 12;
                }
            } else {
                for (int var11 = 0; ~class64.field1132 < ~var11; ++var11) {
                    int var12 = this.field2159[var5++];
                    var7[var11] = class167.method1128(var12 << 4, 4080);
                    var6[var11] = class167.method1128(65280, var12) >> 4;
                    var4[var11] = class167.method1128(var12, 16711680) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIBIIIII)V")
    public static final void method880(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = -arg2 + arg7;
        ++field2170;
        int var10 = -arg1 + arg0;
        int var11 = (-arg4 + arg5 << 16) / var10;
        int var12 = (-arg8 + arg6 << 16) / var9;
        class43.method279(arg7, 0, arg1, arg8, 0, arg2, var12, -125, arg0, var11, arg4);
        int var13 = -54 % ((arg3 - -40) / 39);
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "()V")
    public class130() {
        super(0, false);
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(IIB)I")
    public static final int method881(int arg0, int arg1, byte arg2) {
        int var3 = -128 + class207.method1422(4, arg0 + 45365, 79, arg1 + 91923) + (-128 + class207.method1422(2, arg0 + 10294, 104, arg1 + 37821) >> 1) - -(-128 + class207.method1422(1, arg0, -106, arg1) >> 2);
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        ++field2161;
        if (~var4 > -11) {
            var4 = 10;
        } else if (~var4 < -61) {
            var4 = 60;
        }
        if (arg2 != -106) {
            field2166 = 74;
        }
        return var4;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILji;Z)V")
    public final void method136(int arg0, class225 arg1, boolean arg2) {
        if (arg2) {
            if (arg0 == 0) {
                this.field2172 = arg1.method1593(arg2);
            }
            ++field2171;
        }
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(Z)Z")
    private final boolean method882(boolean arg0) {
        ++field2168;
        if (this.field2159 != null) {
            return true;
        } else if (this.field2172 >= 0) {
            int var2 = class87.field1423;
            int var3 = class64.field1132;
            int var4 = !class150.field2585.method1364(this.field2172, !arg0) ? 128 : 64;
            this.field2159 = class150.field2585.method1360(90, this.field2172);
            this.field2167 = var4;
            this.field2160 = var4;
            class97.method602(var2, (byte) 44, var3);
            return this.field2159 != null;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "(I)V")
    public final void method849(int arg0) {
        if (arg0 <= 96) {
            field2165 = null;
        }
        ++field2158;
        super.method849(101);
        this.field2159 = null;
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(III)Z")
    public static final boolean method883(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class117.field1932; ++var3) {
            class206 var4 = class126.field2093[var3];
            if (var4.field3668 == 1) {
                int var5 = var4.field3656 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field3655 * var5 >> 8) + var4.field3646;
                    int var7 = (var4.field3672 * var5 >> 8) + var4.field3648;
                    int var8 = (var4.field3664 * var5 >> 8) + var4.field3673;
                    int var9 = (var4.field3654 * var5 >> 8) + var4.field3651;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field3668 == 2) {
                int var10 = arg0 - var4.field3656;
                if (var10 > 0) {
                    int var11 = (var4.field3655 * var10 >> 8) + var4.field3646;
                    int var12 = (var4.field3672 * var10 >> 8) + var4.field3648;
                    int var13 = (var4.field3664 * var10 >> 8) + var4.field3673;
                    int var14 = (var4.field3654 * var10 >> 8) + var4.field3651;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field3668 == 3) {
                int var15 = var4.field3646 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field3665 * var15 >> 8) + var4.field3656;
                    int var17 = (var4.field3658 * var15 >> 8) + var4.field3667;
                    int var18 = (var4.field3664 * var15 >> 8) + var4.field3673;
                    int var19 = (var4.field3654 * var15 >> 8) + var4.field3651;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field3668 == 4) {
                int var20 = arg2 - var4.field3646;
                if (var20 > 0) {
                    int var21 = (var4.field3665 * var20 >> 8) + var4.field3656;
                    int var22 = (var4.field3658 * var20 >> 8) + var4.field3667;
                    int var23 = (var4.field3664 * var20 >> 8) + var4.field3673;
                    int var24 = (var4.field3654 * var20 >> 8) + var4.field3651;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field3668 == 5) {
                int var25 = arg1 - var4.field3673;
                if (var25 > 0) {
                    int var26 = (var4.field3665 * var25 >> 8) + var4.field3656;
                    int var27 = (var4.field3658 * var25 >> 8) + var4.field3667;
                    int var28 = (var4.field3655 * var25 >> 8) + var4.field3646;
                    int var29 = (var4.field3672 * var25 >> 8) + var4.field3648;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
