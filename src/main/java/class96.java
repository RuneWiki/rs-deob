import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class96 extends class37 {

    @OriginalMember(owner = "client!jg", name = "T", descriptor = "I")
    private int field2112 = 3216;

    @OriginalMember(owner = "client!jg", name = "U", descriptor = "I")
    private int field2113 = 3216;

    @OriginalMember(owner = "client!jg", name = "gb", descriptor = "I")
    private int field2125 = 4096;

    @OriginalMember(owner = "client!jg", name = "X", descriptor = "[I")
    private int[] field2116 = new int[3];

    @OriginalMember(owner = "client!jg", name = "R", descriptor = "Ldd;")
    private static class35 field2110 = class180.method1196((byte) 127, "glow1:");

    @OriginalMember(owner = "client!jg", name = "Q", descriptor = "Ldd;")
    public static class35 field2109 = field2110;

    @OriginalMember(owner = "client!jg", name = "db", descriptor = "Ldd;")
    public static class35 field2122 = field2110;

    @OriginalMember(owner = "client!jg", name = "kb", descriptor = "I")
    public static int field2129 = 0;

    @OriginalMember(owner = "client!jg", name = "V", descriptor = "I")
    public static int field2114 = 0;

    @OriginalMember(owner = "client!jg", name = "jb", descriptor = "Lld;")
    public static class111 field2128 = new class111(64);

    @OriginalMember(owner = "client!jg", name = "P", descriptor = "I")
    public static int field2108;

    @OriginalMember(owner = "client!jg", name = "S", descriptor = "I")
    public static int field2111;

    @OriginalMember(owner = "client!jg", name = "W", descriptor = "I")
    public static int field2115;

    @OriginalMember(owner = "client!jg", name = "Y", descriptor = "I")
    public static int field2117;

    @OriginalMember(owner = "client!jg", name = "Z", descriptor = "I")
    public static int field2118;

    @OriginalMember(owner = "client!jg", name = "ab", descriptor = "I")
    public static int field2119;

    @OriginalMember(owner = "client!jg", name = "cb", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!jg", name = "eb", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!jg", name = "fb", descriptor = "I")
    public static int field2124;

    @OriginalMember(owner = "client!jg", name = "hb", descriptor = "I")
    public static int field2126;

    @OriginalMember(owner = "client!jg", name = "ib", descriptor = "I")
    public static int field2127;

    @OriginalMember(owner = "client!jg", name = "bb", descriptor = "Lqf;")
    public static class158 field2120;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "(B)V")
    public static void method730(byte arg0) {
        if (arg0 != 55) {
            field2114 = -86;
        }
        field2109 = null;
        field2120 = null;
        field2110 = null;
        field2122 = null;
        field2128 = null;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Z)V")
    public final void method11(boolean arg0) {
        if (arg0) {
            this.method734(6);
        }
        this.method734(-7866);
        ++field2119;
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "()V")
    public class96() {
        super(1, true);
    }

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "(I)[Lba;")
    public static final class12[] method731(int arg0) {
        ++field2115;
        class12[] var1 = new class12[class135.field2904];
        int var2 = 19 % ((-34 - arg0) / 35);
        for (int var3 = 0; class135.field2904 > var3; ++var3) {
            class12 var4 = new class12();
            var4.field220 = class57.field1425;
            var4.field218 = class37.field815;
            var4.field219 = class207.field4119[var3];
            var4.field224 = class143.field3003[var3];
            var4.field223 = class15.field269[var3];
            var4.field221 = class118.field2623[var3];
            int var5 = var4.field223 * var4.field221;
            byte[] var6 = class203.field4039[var3];
            var4.field222 = new int[var5];
            for (int var7 = 0; var5 > var7; ++var7) {
                var4.field222[var7] = class116.field2591[class208.method1372(255, var6[var7])];
            }
            var1[var3] = var4;
        }
        class123.method878(-28);
        return var1;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(BIIZ)Ldd;")
    public static final class35 method732(byte arg0, int arg1, int arg2, boolean arg3) {
        ++field2108;
        if (arg1 >= 2 && arg1 <= 36) {
            int var4 = arg2 / arg1;
            int var5 = 1;
            while (~var4 != -1) {
                ++var5;
                var4 /= arg1;
            }
            int var6 = var5;
            int var7 = -19 % ((arg0 - -31) / 32);
            if (arg2 < 0 || arg3) {
                var6 = var5 + 1;
            }
            byte[] var8 = new byte[var6];
            if (arg2 < 0) {
                var8[0] = 45;
            } else if (arg3) {
                var8[0] = 43;
            }
            for (int var9 = 0; ~var5 < ~var9; ++var9) {
                int var11 = arg2 % arg1;
                arg2 /= arg1;
                if (var11 < 0) {
                    var11 = -var11;
                }
                if (~var11 < -10) {
                    var11 += 39;
                }
                var8[var6 + -1 + -var9] = (byte) (var11 + 48);
            }
            class35 var10 = new class35();
            var10.field730 = var8;
            var10.field758 = var6;
            return var10;
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lgi;I)V")
    public static final void method733(class69 arg0, int arg1) {
        arg0.field1656 = false;
        if (arg0.field1658 != -1) {
            class52 var2 = class160.method1070((byte) -82, arg0.field1658);
            if (var2 != null && var2.field1184 != null) {
                ++arg0.field1631;
                if (var2.field1184.length > arg0.field1606 && var2.field1159[arg0.field1606] < arg0.field1631) {
                    ++arg0.field1606;
                    arg0.field1631 = 1;
                    class79.method595(class71.field1704 == arg0, arg0.field1664, arg0.field1606, true, arg0.field1676, var2);
                }
                if (var2.field1184.length <= arg0.field1606) {
                    arg0.field1631 = 0;
                    arg0.field1606 = 0;
                    class79.method595(class71.field1704 == arg0, arg0.field1664, arg0.field1606, true, arg0.field1676, var2);
                }
            } else {
                arg0.field1658 = -1;
            }
        }
        ++field2121;
        if (~arg0.field1671 != 0 && class89.field1988 >= arg0.field1615) {
            if (arg0.field1666 < 0) {
                arg0.field1666 = 0;
            }
            int var3 = class48.method434(47, arg0.field1671).field326;
            if (~var3 == 0) {
                arg0.field1671 = -1;
            } else {
                class52 var4 = class160.method1070((byte) -93, var3);
                if (var4 != null && var4.field1184 != null) {
                    ++arg0.field1624;
                    if (~arg0.field1666 > ~var4.field1184.length && arg0.field1624 > var4.field1159[arg0.field1666]) {
                        arg0.field1624 = 1;
                        ++arg0.field1666;
                        class79.method595(class71.field1704 == arg0, arg0.field1664, arg0.field1666, true, arg0.field1676, var4);
                    }
                    if (var4.field1184.length <= arg0.field1666) {
                        arg0.field1671 = -1;
                    }
                } else {
                    arg0.field1671 = -1;
                }
            }
        }
        if (arg1 < 11) {
            method732((byte) 25, -51, 0, false);
        }
        if (~arg0.field1610 != 0 && ~arg0.field1647 >= -2) {
            class52 var5 = class160.method1070((byte) -43, arg0.field1610);
            if (~var5.field1179 == -2 && ~arg0.field1632 < -1 && arg0.field1650 <= class89.field1988 && ~class89.field1988 < ~arg0.field1634) {
                arg0.field1647 = 1;
                return;
            }
        }
        if (arg0.field1610 != -1 && ~arg0.field1647 == -1) {
            class52 var6 = class160.method1070((byte) -14, arg0.field1610);
            if (var6 != null && var6.field1184 != null) {
                ++arg0.field1608;
                if (arg0.field1654 < var6.field1184.length && var6.field1159[arg0.field1654] < arg0.field1608) {
                    ++arg0.field1654;
                    arg0.field1608 = 1;
                    class79.method595(class71.field1704 == arg0, arg0.field1664, arg0.field1654, true, arg0.field1676, var6);
                }
                if (~arg0.field1654 <= ~var6.field1184.length) {
                    arg0.field1654 -= var6.field1185;
                    ++arg0.field1641;
                    if (~var6.field1171 < ~arg0.field1641) {
                        if (~arg0.field1654 <= -1 && ~arg0.field1654 > ~var6.field1184.length) {
                            class79.method595(class71.field1704 == arg0, arg0.field1664, arg0.field1654, true, arg0.field1676, var6);
                        } else {
                            arg0.field1610 = -1;
                        }
                    } else {
                        arg0.field1610 = -1;
                    }
                }
                arg0.field1656 = var6.field1170;
            } else {
                arg0.field1610 = -1;
            }
        }
        if (~arg0.field1647 < -1) {
            --arg0.field1647;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IILce;)V")
    public final void method1(int arg0, int arg1, class26 arg2) {
        ++field2123;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    this.field2113 = arg2.method256((byte) -78);
                }
            } else {
                this.field2112 = arg2.method256((byte) -78);
            }
        } else {
            this.field2125 = arg2.method256((byte) -78);
        }
        if (arg1 != 1) {
            method731(7);
        }
    }

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "(I)V")
    private final void method734(int arg0) {
        double var2 = Math.cos((double) (this.field2113 / 4096));
        ++field2124;
        this.field2116[0] = (int) (var2 * Math.sin((double) (this.field2112 / 4096)) * 4096.0D);
        this.field2116[1] = (int) (4096.0D * Math.cos((double) (this.field2112 / 4096)) * var2);
        this.field2116[2] = (int) (4096.0D * Math.sin((double) (this.field2113 / 4096)));
        int var4 = this.field2116[0] * this.field2116[0] >> 12;
        if (arg0 != -7866) {
            field2128 = null;
        }
        int var5 = this.field2116[1] * this.field2116[1] >> 12;
        int var6 = this.field2116[2] * this.field2116[2] >> 12;
        int var7 = (int) (Math.sqrt((double) (var5 + var6 + var4 >> 12)) * 4096.0D);
        if (var7 != 0) {
            this.field2116[2] = (this.field2116[2] << 12) / var7;
            this.field2116[0] = (this.field2116[0] << 12) / var7;
            this.field2116[1] = (this.field2116[1] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(BI)[I")
    public final int[] method7(byte arg0, int arg1) {
        int[] var3 = super.field816.method1189((byte) 33, arg1);
        if (super.field816.field3661) {
            int var4 = class35.field718 * this.field2125 >> 12;
            int[] var5 = this.method369(0, class105.field2348 & arg1 + -1, (byte) 126);
            int[] var6 = this.method369(0, arg1, (byte) 126);
            int[] var7 = this.method369(0, class105.field2348 & arg1 + 1, (byte) 122);
            for (int var8 = 0; ~var8 > ~class72.field1719; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * var4;
                int var10 = var9 >> 12;
                int var11 = (var6[class71.field1691 & var8 + 1] + -var6[var8 - 1 & class71.field1691]) * var4;
                int var12 = var11 >> 12;
                int var13 = var12 * var12 >> 12;
                int var14 = var10 * var10 >> 12;
                int var15 = (int) (4096.0D * Math.sqrt((double) ((var13 + var14 + 4096) / 4096)));
                int var16;
                int var17;
                int var18;
                if (~var15 != -1) {
                    var16 = 16777216 / var15;
                    var17 = var9 / var15;
                    var18 = var11 / var15;
                } else {
                    var16 = 0;
                    var17 = 0;
                    var18 = 0;
                }
                int var19 = this.field2116[2] * var16 >> 12;
                int var20 = this.field2116[0] * var18 >> 12;
                int var21 = this.field2116[1] * var17 >> 12;
                var3[var8] = var19 + var20 - -var21;
            }
        }
        if (arg0 != 75) {
            field2120 = null;
        }
        ++field2111;
        return var3;
    }
}
