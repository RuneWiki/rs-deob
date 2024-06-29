import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hca")
public class class241 extends class119 {

    @OriginalMember(owner = "client!hca", name = "g", descriptor = "I")
    private int field3898;

    @OriginalMember(owner = "client!hca", name = "p", descriptor = "I")
    private int field3907;

    @OriginalMember(owner = "client!hca", name = "o", descriptor = "I")
    private int field3906;

    @OriginalMember(owner = "client!hca", name = "k", descriptor = "I")
    private int field3902;

    @OriginalMember(owner = "client!hca", name = "h", descriptor = "I")
    public static int field3899 = -1;

    @OriginalMember(owner = "client!hca", name = "n", descriptor = "Lcb;")
    public static class631 field3905 = new class631(42, 3);

    @OriginalMember(owner = "client!hca", name = "i", descriptor = "I")
    public static int field3900;

    @OriginalMember(owner = "client!hca", name = "j", descriptor = "I")
    public static int field3901;

    @OriginalMember(owner = "client!hca", name = "l", descriptor = "I")
    public static int field3903;

    @OriginalMember(owner = "client!hca", name = "m", descriptor = "I")
    public static int field3904;

    @OriginalMember(owner = "client!hca", name = "q", descriptor = "I")
    public static int field3908;

    @OriginalMember(owner = "client!hca", name = "r", descriptor = "I")
    public static int field3909;

    @OriginalMember(owner = "client!hca", name = "<init>", descriptor = "(IIIIII)V", line = 4)
    public class241(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field3898 = arg3;
        this.field3907 = arg1;
        this.field3906 = arg2;
        this.field3902 = arg0;
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(IIZ)V", line = 15)
    public final void method460(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            method1678(true);
        }
        ++field3900;
        int var4 = this.field3902 * arg1 >> 12;
        int var5 = this.field3906 * arg1 >> 12;
        int var6 = this.field3907 * arg0 >> 12;
        int var7 = this.field3898 * arg0 >> 12;
        class3.method6(var5, var4, super.field1832, var7, var6, arg2);
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(IIILgba;Lbfa;)V", line = 37)
    public static final void method1675(int arg0, int arg1, int arg2, class702 arg3, class573 arg4) {
        ++field3908;
        if (~(arg2 & 16384) != -1) {
            arg4.field1608 = arg3.method1983(15575);
            arg4.field1619 = arg3.method1979((byte) 53);
            arg4.field1685 = arg3.method1984(4);
            arg4.field1592 = arg3.method1984(4);
            arg4.field1645 = arg3.method1989((byte) -95) + class199.field3403;
            arg4.field1660 = arg3.method1938(-1) - -class199.field3403;
            arg4.field1666 = arg3.method1988(arg0 + 119);
            if (!arg4.field8122) {
                arg4.field1592 += arg4.field1704[0];
                arg4.field1685 += arg4.field1702[0];
                arg4.field1706 = 1;
                arg4.field1619 += arg4.field1704[0];
                arg4.field1608 += arg4.field1702[0];
            } else {
                arg4.field1685 += arg4.field8120;
                arg4.field1608 += arg4.field8120;
                arg4.field1619 += arg4.field8126;
                arg4.field1706 = 0;
                arg4.field1592 += arg4.field8126;
            }
            arg4.field1707 = 0;
        }
        byte var5 = -1;
        if (~(arg2 & 65536) != -1) {
            int var6 = arg3.method1924(5970);
            int[] var7 = new int[var6];
            int[] var8 = new int[var6];
            for (int var9 = 0; var9 < var6; ++var9) {
                int var10 = arg3.method1961(true);
                if (~(var10 & 49152) == -49153) {
                    int var11 = arg3.method1972(arg0 ^ 127);
                    var7[var9] = class112.method903(var10 << 16, var11);
                } else {
                    var7[var9] = var10;
                }
                var8[var9] = arg3.method1938(class584.method3367(arg0, 0));
            }
            arg4.method880(var7, -126, var8);
        }
        if (~(arg2 & 64) != -1) {
            class397.field5909[arg1] = arg3.method1979((byte) 99);
        }
        if (~(arg2 & 32768) != -1) {
            arg4.field8133 = arg3.method1988(99) == 1;
        }
        if ((256 & arg2) != 0) {
            int var12 = arg3.method1989((byte) -120);
            arg4.field1622 = arg3.method1945(0);
            arg4.field1602 = arg3.method1988(101);
            arg4.field1675 = (var12 & 32768) != 0;
            arg4.field1590 = 32767 & var12;
            arg4.field1621 = class199.field3403 + arg4.field1590 + arg4.field1622;
        }
        if ((512 & arg2) != 0) {
            var5 = arg3.method1983(15575);
        }
        if (~(128 & arg2) != -1) {
            int var13 = arg3.method1989((byte) -128);
            if (~var13 == -65536) {
                var13 = -1;
            }
            int var14 = arg3.method1937(0);
            int var15 = arg3.method1988(109);
            int var16 = var15 & 7;
            int var17 = (var15 & 121) >> 3;
            if (var17 == 15) {
                var17 = -1;
            }
            arg4.method892((byte) 74, var14, var17, var16, var13, false);
        }
        if (~(arg2 & 4096) != -1) {
            int var18 = arg3.method1945(0);
            int[] var19 = new int[var18];
            int[] var20 = new int[var18];
            int[] var21 = new int[var18];
            for (int var22 = 0; ~var18 < ~var22; ++var22) {
                int var23 = arg3.method1938(-1);
                if (~var23 == -65536) {
                    var23 = -1;
                }
                var19[var22] = var23;
                var20[var22] = arg3.method1988(class584.method3367(arg0, -110));
                var21[var22] = arg3.method1961(true);
            }
            class311.method2050(arg4, var21, var20, 123, var19);
        }
        if (~(arg2 & 4) != arg0) {
            arg4.field8139 = arg3.method1938(-1);
            if (~arg4.field1706 == -1) {
                arg4.method897(arg4.field8139, -65);
                arg4.field8139 = -1;
            }
        }
        if (~(arg2 & 2048) != -1) {
            arg4.field1633 = arg3.method1958(-3438);
            if (arg4.field1633.charAt(0) != '~') {
                if (class145.field2251 == arg4) {
                    class157.method1177(arg4.field8137, 0, arg4.field1633, arg4.method3329(false, (byte) 106), arg4.method3326(true, true), arg0 + 2, 2);
                }
            } else {
                arg4.field1633 = arg4.field1633.substring(1);
                class157.method1177(arg4.field8137, 0, arg4.field1633, arg4.method3329(false, (byte) 88), arg4.method3326(true, true), 1, 2);
            }
            arg4.field1665 = 150;
            arg4.field1643 = 0;
            arg4.field1646 = 0;
        }
        if ((arg2 & 2) != 0) {
            int[] var24 = new int[4];
            for (int var25 = 0; var25 < 4; ++var25) {
                var24[var25] = arg3.method1961(true);
                if (~var24[var25] == -65536) {
                    var24[var25] = -1;
                }
            }
            int var26 = arg3.method1987(-112);
            class75.method680(-12503, arg4, var26, var24);
        }
        if ((262144 & arg2) != 0) {
            arg4.field1620 = arg3.method1983(15575);
            arg4.field1651 = arg3.method1930(-268435456);
            arg4.field1652 = arg3.method1979((byte) 66);
            arg4.field1688 = (byte) arg3.method1988(arg0 ^ -119);
            arg4.field1644 = class199.field3403 + arg3.method1938(-1);
            arg4.field1642 = class199.field3403 - -arg3.method1961(true);
        }
        if (~(arg2 & 16) != -1) {
            int var27 = arg3.method1924(arg0 ^ -5971);
            if (~var27 < -1) {
                for (int var28 = 0; var28 < var27; ++var28) {
                    int var29 = -1;
                    int var30 = -1;
                    int var31 = -1;
                    int var32 = arg3.method1968((byte) 68);
                    if (var32 != 32767) {
                        if (var32 == 32766) {
                            var32 = -1;
                        } else {
                            var30 = arg3.method1968((byte) 77);
                        }
                    } else {
                        var32 = arg3.method1968((byte) 80);
                        var30 = arg3.method1968((byte) 93);
                        var29 = arg3.method1968((byte) 34);
                        var31 = arg3.method1968((byte) 26);
                    }
                    int var33 = arg3.method1968((byte) 127);
                    int var34 = arg3.method1988(arg0 + 103);
                    arg4.method893(var32, class199.field3403, var30, var29, var33, var34, var31, -128);
                }
            }
        }
        if ((arg2 & 8192) != 0) {
            int var35 = arg3.method1989((byte) -34);
            if (~var35 == -65536) {
                var35 = -1;
            }
            int var36 = arg3.method1934(-2);
            int var37 = arg3.method1988(117);
            int var38 = var37 & 7;
            int var39 = var37 >> 3 & 15;
            if (var39 == 15) {
                var39 = -1;
            }
            arg4.method892((byte) 82, var36, var39, var38, var35, true);
        }
        if ((arg2 & 32) != 0) {
            int var40 = arg3.method1987(arg0 + -92);
            byte[] var41 = new byte[var40];
            class301 var42 = new class301(var41);
            arg3.method1971(var40, 0, -1, var41);
            class85.field1255[arg1] = var42;
            arg4.method3327(var42, arg0);
        }
        if (~(8 & arg2) != -1) {
            int var43 = arg3.method1961(true);
            if (~var43 == -65536) {
                var43 = -1;
            }
            arg4.field1687 = var43;
        }
        if (arg4.field8122) {
            if (~var5 != -128) {
                byte var44;
                if (var5 == -1) {
                    var44 = class397.field5909[arg1];
                } else {
                    var44 = var5;
                }
                class126.method970((byte) -75, var44, arg4);
                arg4.method3320(-1, arg4.field8126, arg4.field8120, var44);
            } else {
                arg4.method3325(arg4.field8120, arg4.field8126, -52);
            }
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(B)V", line = 376)
    public static void method1676(byte arg0) {
        if (arg0 > -17) {
            method1676((byte) 90);
        }
        field3905 = null;
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(ZII)V", line = 386)
    public final void method463(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            ++field3909;
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(III)V", line = 398)
    public final void method465(int arg0, int arg1, int arg2) {
        if (arg1 != 2) {
            field3899 = -33;
        }
        ++field3904;
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(I)V", line = 410)
    public static final void method1677(int arg0) {
        for (int var1 = arg0; ~var1 > ~class115.field1790; ++var1) {
            class625 var2 = class374.field5649[var1];
            if (~var2.field8758 == -4) {
                if (var2.field8751 != null) {
                    class324.field4793.method2223(var2.field8751);
                } else {
                    var2.field8748 = Integer.MIN_VALUE;
                }
            }
        }
        ++field3903;
    }

    @OriginalMember(owner = "client!hca", name = "b", descriptor = "(Z)Z", line = 438)
    public static final boolean method1678(boolean arg0) {
        if (!arg0) {
            method1678(true);
        }
        ++field3901;
        return !class541.method3169("jaclib", -28) ? false : class541.method3169("hw3d", -107);
    }
}
