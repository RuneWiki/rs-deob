import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class137 extends class300 {

    @OriginalMember(owner = "client!nc", name = "H", descriptor = "Lfe;")
    public static class231 field1969 = null;

    @OriginalMember(owner = "client!nc", name = "F", descriptor = "I")
    public static int field1967;

    @OriginalMember(owner = "client!nc", name = "G", descriptor = "I")
    public static int field1968;

    @OriginalMember(owner = "client!nc", name = "I", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!nc", name = "J", descriptor = "I")
    public static int field1971;

    @OriginalMember(owner = "client!nc", name = "K", descriptor = "I")
    public static int field1972;

    @OriginalMember(owner = "client!nc", name = "M", descriptor = "I")
    public static int field1974;

    @OriginalMember(owner = "client!nc", name = "O", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!nc", name = "L", descriptor = "Lvl;")
    public static class73 field1973;

    @OriginalMember(owner = "client!nc", name = "N", descriptor = "[Lhd;")
    private class114[] field1975;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)[I")
    public final int[] method99(int arg0, int arg1) {
        ++field1968;
        if (arg1 != -957953300) {
            return null;
        } else {
            int[] var3 = super.field4797.method217(arg0, true);
            if (super.field4797.field470) {
                this.method868(super.field4797.method214(0), (byte) -104);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IILnj;ILfe;II)V")
    public static final void method867(int arg0, int arg1, class215 arg2, int arg3, class231 arg4, int arg5, int arg6) {
        ++field1972;
        if (arg2 != null) {
            if (arg1 < 46) {
                field1969 = null;
            }
            int var7 = (int) class144.field2145 + class146.field2173 & 2047;
            int var8 = arg6 * arg6 - -(arg3 * arg3);
            int var9 = Math.max(arg4.field3730 / 2, arg4.field3686 / 2) + 10;
            if (var8 <= var9 * var9) {
                int var10 = class221.field3468[var7];
                int var11 = var10 * 256 / (class60.field876 + 256);
                int var12 = class221.field3465[var7];
                int var13 = var12 * 256 / (class60.field876 + 256);
                int var14 = arg3 * var11 - -(arg6 * var13) >> 16;
                int var15 = arg3 * var13 - arg6 * var11 >> 16;
                ((class48) arg2).method276(arg5 - -(arg4.field3730 / 2) + -(arg2.field3352 / 2) + var14, arg4.field3686 / 2 + -(arg2.field3355 / 2) + -var15 + arg0, arg4.field3637, arg4.field3687);
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "()V")
    public class137() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(II)[[I")
    public final int[][] method36(int arg0, int arg1) {
        int[][] var3 = super.field4786.method538(arg1, (byte) 104);
        int var4 = -25 / (-arg0 / 47);
        if (super.field4786.field1200) {
            int var5 = class180.field2826;
            int var6 = class4.field61;
            int[][] var7 = new int[var6][var5];
            int[][][] var8 = super.field4786.method536(50);
            this.method868(var7, (byte) 82);
            for (int var9 = 0; class4.field61 > var9; ++var9) {
                int[] var10 = var7[var9];
                int[][] var11 = var8[var9];
                int[] var12 = var11[1];
                int[] var13 = var11[2];
                int[] var14 = var11[0];
                for (int var15 = 0; ~var15 > ~class180.field2826; ++var15) {
                    int var16 = var10[var15];
                    var13[var15] = class205.method1411(4080, var16 << 4);
                    var12[var15] = class205.method1411(var16 >> 4, 4080);
                    var14[var15] = class205.method1411(var16, 16711680) >> 12;
                }
            }
        }
        ++field1976;
        return var3;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "([[IB)V")
    private final void method868(int[][] arg0, byte arg1) {
        ++field1971;
        int var3 = 116 % ((-26 - arg1) / 44);
        int var4 = class180.field2826;
        int var5 = class4.field61;
        class83.method561(-25851, arg0);
        class15.method94(1, 0, class277.field4503, class285.field4611, 0);
        if (this.field1975 != null) {
            for (int var6 = 0; ~this.field1975.length < ~var6; ++var6) {
                class114 var7 = this.field1975[var6];
                int var8 = var7.field1662;
                int var9 = var7.field1661;
                if (var8 >= 0) {
                    if (var9 < 0) {
                        var7.method105(var4, -8132, var5);
                    } else {
                        var7.method106(32768, var5, var4);
                    }
                } else if (~var9 <= -1) {
                    var7.method103(var4, var5, -29715);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lim;BI)V")
    public final void method35(class170 arg0, byte arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 == 1) {
                super.field4784 = ~arg0.method1218(-34) == -2;
            }
        } else {
            this.field1975 = new class114[arg0.method1218(-120)];
            for (int var4 = 0; this.field1975.length > var4; ++var4) {
                int var5 = arg0.method1218(100);
                if (~var5 != -1) {
                    if (var5 != 1) {
                        if (var5 != 2) {
                            if (~var5 == -4) {
                                this.field1975[var4] = class102.method687(arg0, true);
                            }
                        } else {
                            this.field1975[var4] = class73.method486(arg0, 10392);
                        }
                    } else {
                        this.field1975[var4] = class233.method1641((byte) -102, arg0);
                    }
                } else {
                    this.field1975[var4] = class200.method1391(arg0, (byte) 26);
                }
            }
        }
        if (arg1 >= -43) {
            this.method35((class170) null, (byte) 113, -11);
        }
        ++field1967;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Z)V")
    public static void method869(boolean arg0) {
        if (!arg0) {
            field1973 = null;
        }
        field1973 = null;
        field1969 = null;
    }

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "(I)V")
    public static final void method870(int arg0) {
        class62.field895.method1510(10283);
        if (arg0 != 2) {
            method870(12);
        }
        ++field1974;
        class281.field4572.method1510(10283);
    }
}
