import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class167 extends class129 {

    @OriginalMember(owner = "client!se", name = "Gc", descriptor = "I")
    public int field2466 = -1;

    @OriginalMember(owner = "client!se", name = "Fc", descriptor = "I")
    public int field2465 = -1;

    @OriginalMember(owner = "client!se", name = "Ic", descriptor = "[S")
    public static short[] field2468 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!se", name = "yc", descriptor = "J")
    public static long field2458 = 0L;

    @OriginalMember(owner = "client!se", name = "wc", descriptor = "I")
    public static int field2456;

    @OriginalMember(owner = "client!se", name = "xc", descriptor = "I")
    public static int field2457;

    @OriginalMember(owner = "client!se", name = "zc", descriptor = "I")
    public static int field2459;

    @OriginalMember(owner = "client!se", name = "Ac", descriptor = "I")
    public static int field2460;

    @OriginalMember(owner = "client!se", name = "Bc", descriptor = "I")
    public static int field2461;

    @OriginalMember(owner = "client!se", name = "Cc", descriptor = "I")
    public static int field2462;

    @OriginalMember(owner = "client!se", name = "Dc", descriptor = "I")
    public static int field2463;

    @OriginalMember(owner = "client!se", name = "Ec", descriptor = "I")
    public static int field2464;

    @OriginalMember(owner = "client!se", name = "Hc", descriptor = "I")
    public static int field2467;

    @OriginalMember(owner = "client!se", name = "Jc", descriptor = "I")
    public static int field2469;

    @OriginalMember(owner = "client!se", name = "Kc", descriptor = "I")
    public static int field2470;

    @OriginalMember(owner = "client!se", name = "Lc", descriptor = "I")
    public static int field2471;

    @OriginalMember(owner = "client!se", name = "Nc", descriptor = "I")
    public static int field2473;

    @OriginalMember(owner = "client!se", name = "Oc", descriptor = "I")
    public static int field2474;

    @OriginalMember(owner = "client!se", name = "Pc", descriptor = "I")
    public static int field2475;

    @OriginalMember(owner = "client!se", name = "Rc", descriptor = "I")
    public static int field2477;

    @OriginalMember(owner = "client!se", name = "Sc", descriptor = "I")
    public static int field2478;

    @OriginalMember(owner = "client!se", name = "Mc", descriptor = "Lva;")
    public class342 field2472;

    @OriginalMember(owner = "client!se", name = "Qc", descriptor = "[Lf;")
    public static class529[] field2476;

    @OriginalMember(owner = "client!se", name = "i", descriptor = "(I)Z", line = 5)
    public final boolean method1158(int arg0) {
        if (arg0 != -1) {
            this.method12(-127, (class162) null);
        }
        ++field2461;
        return this.field2472 != null;
    }

    @OriginalMember(owner = "client!se", name = "d", descriptor = "(B)V", line = 20)
    public final void method13(byte arg0) {
        ++field2462;
        if (arg0 != -89) {
            this.field2465 = 30;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B)I", line = 31)
    public final int method852(byte arg0) {
        if (arg0 != 75) {
            this.method10((byte) 86, (class162) null);
        }
        ++field2470;
        if (this.field2472.field4938 != null) {
            class342 var2 = this.field2472.method2094(-123, class49.field796);
            if (var2 != null && ~var2.field4897 != 0) {
                return var2.field4897;
            }
        }
        return this.field2472.field4897;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lqa;IB)Z", line = 53)
    private final boolean method1159(class162 arg0, int arg1, byte arg2) {
        ++field2457;
        if (arg2 < 17) {
            field2476 = null;
        }
        int var4 = arg1;
        class82 var5 = this.method845(0);
        class329 var6 = ~super.field1950 != 0 && super.field1936 == 0 ? class84.field1295.method1182(super.field1950, 8) : null;
        class329 var7 = super.field1931 == -1 || super.field1963 && var6 != null ? null : class84.field1295.method1182(super.field1931, 8);
        int var8 = var5.field1243;
        int var9 = var5.field1271;
        if (var8 != 0 || var9 != 0 || ~var5.field1234 != -1 || var5.field1240 != 0) {
            arg1 |= 7;
        }
        boolean var10 = ~super.field1957 != -1 && ~class317.field4559 <= ~super.field1917 && ~super.field1954 < ~class317.field4559;
        if (var10) {
            arg1 |= 524288;
        }
        class121 var11 = super.field1994[0] = this.field2472.method2084(super.field1987, super.field1935, 63, arg1, var6, class49.field796, super.field1905, super.field1940, super.field1968, class45.field717, class84.field1295, super.field1915, arg0, var7, super.field1972);
        if (var11 == null) {
            return false;
        } else {
            super.field1910 = var11.method709();
            this.method850(var11, (byte) -122);
            int var12 = super.field1945.method757(37);
            if (~var8 == -1 && ~var9 == -1) {
                this.method859(this.method847(-1) << 7, var12, this.method847(-1) << 7, (byte) -50, 0, 0);
            } else {
                this.method859(var9, var12, var8, (byte) -50, var5.field1263, var5.field1237);
                if (super.field1956 != 0) {
                    super.field1994[0].method735(super.field1956);
                }
                if (~super.field1967 != -1) {
                    super.field1994[0].method700(super.field1967);
                }
                if (~super.field1976 != -1) {
                    super.field1994[0].method739(0, super.field1976, 0);
                }
            }
            if (var10) {
                var11.method742(super.field1989, super.field1901, super.field1960, 255 & super.field1957);
            }
            if (~super.field1906 != 0 && super.field1937 != -1) {
                class104 var13 = class512.field7494.method2732(98, super.field1906);
                boolean var14 = var13.field1508 == 3 && (var8 != 0 || var9 != 0);
                int var15 = var4;
                if (!var14) {
                    if (super.field1922 != 0) {
                        var15 = var4 | 5;
                    }
                    if (~super.field1949 != -1) {
                        var15 |= 2;
                    }
                } else {
                    var15 = var4 | 7;
                }
                class121 var16 = super.field1994[1] = var13.method641(super.field1937, arg0, super.field1973, super.field1924, class84.field1295, var15, (byte) 90);
                if (var16 != null) {
                    if (~super.field1949 != -1) {
                        var16.method739(0, -super.field1949 << 0, 0);
                    }
                    if (super.field1922 != 0) {
                        var16.method685(super.field1922 * 2048);
                    }
                    if (var14) {
                        if (~super.field1956 != -1) {
                            var16.method735(super.field1956);
                        }
                        if (super.field1967 != 0) {
                            var16.method700(super.field1967);
                        }
                        if (~super.field1976 != -1) {
                            var16.method739(0, super.field1976, 0);
                        }
                    }
                }
            } else {
                super.field1994[1] = null;
            }
            if (~super.field1912 != 0 && ~super.field1975 != 0) {
                class104 var17 = class512.field7494.method2732(121, super.field1912);
                boolean var18 = var17.field1508 == 3 && (~var8 != -1 || var9 != 0);
                int var19 = var4;
                if (var18) {
                    var19 = var4 | 7;
                } else {
                    if (~super.field1970 != -1) {
                        var19 = var4 | 5;
                    }
                    if (super.field1903 != 0) {
                        var19 |= 2;
                    }
                }
                class121 var20 = super.field1994[3] = var17.method649(super.field1977, super.field1929, class84.field1295, arg0, var19, super.field1975, 0);
                if (var20 != null) {
                    if (~super.field1903 != -1) {
                        var20.method739(0, -super.field1903 << 0, 0);
                    }
                    if (super.field1970 != 0) {
                        var20.method685(super.field1970 * 2048);
                    }
                    if (var18) {
                        if (~super.field1956 != -1) {
                            var20.method735(super.field1956);
                        }
                        if (~super.field1967 != -1) {
                            var20.method700(super.field1967);
                        }
                        if (super.field1976 != 0) {
                            var20.method739(0, super.field1976, 0);
                        }
                    }
                }
            } else {
                super.field1994[3] = null;
            }
            super.field1994[2] = null;
            if (super.field1993 != null) {
                if (~class317.field4559 <= ~super.field1993.field2406) {
                    super.field1993 = null;
                } else if (~class317.field4559 <= ~super.field1993.field2416) {
                    class121 var21 = super.field1993.method1144(7, var4 | 7, arg0);
                    if (var21 != null) {
                        var21.method739(-super.field1763 + super.field1993.field2402, -super.field1766 + super.field1993.field2412, -super.field1769 + super.field1993.field2421);
                        if (var12 != 0) {
                            var21.method685(var12);
                        }
                        super.field1994[2] = var21;
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lva;I)V", line = 246)
    public final void method1160(class342 arg0, int arg1) {
        ++field2475;
        this.field2472 = arg0;
        if (super.field2002 != null) {
            super.field2002.method1364();
        }
        if (arg1 <= 55) {
            field2468 = null;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lmq;I)Z", line = 261)
    public static final boolean method1161(class351 arg0, int arg1) {
        ++field2478;
        class519 var2 = class252.field3743.method2686(arg0.method20(-30685), (byte) 107);
        if (arg1 != -31794) {
            field2468 = null;
        }
        if (var2.field7611 == -1) {
            return true;
        } else {
            class464 var3 = class57.field872.method1202(true, var2.field7611);
            return ~var3.field6877 == 0 ? true : var3.method2791(0);
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(ILqa;)Lnf;", line = 287)
    public final class405 method12(int arg0, class162 arg1) {
        ++field2463;
        if (this.field2472 != null && this.method1159(arg1, 2048, (byte) 46)) {
            class414 var3 = arg1.method1115();
            int var4 = super.field1945.method757(66);
            var3.method914(var4);
            var3.method901(super.field1763, super.field1766, super.field1769);
            class82 var5 = this.method845(0);
            class342 var6 = this.field2472.field4938 == null ? this.field2472 : this.field2472.method2094(-113, class49.field796);
            if (class426.field6401.field1017 && var6.field4900 && var5.field1266) {
                class329 var7 = super.field1950 != -1 && super.field1936 == 0 ? class84.field1295.method1182(super.field1950, 8) : null;
                class329 var8 = ~super.field1931 == 0 || super.field1963 && var7 != null ? null : class84.field1295.method1182(super.field1931, 8);
                class121 var9 = class412.method2481(var8 != null ? var8 : var7, arg1, super.field1976, this.field2472.field4881, super.field1994[0], super.field1962, 65535 & this.field2472.field4878, (byte) -25, var4, var8 != null ? super.field1905 : super.field1940, super.field1967, this.field2472.field4935 & 65535, 255 & this.field2472.field4932, super.field1956, 255 & this.field2472.field4937);
                if (var9 != null) {
                    float var10 = arg1.method1026();
                    float var11 = arg1.method1020();
                    arg1.method1110(false);
                    arg1.method1039(var10, var11 - 150.0F);
                    var9.method720(var3, (class247) null, 0);
                    arg1.method1039(var10, var11);
                    arg1.method1110(true);
                }
            }
            class405 var12 = null;
            if (this.method1165(20267)) {
                var12 = class75.method427(super.field1994.length, 0);
            }
            if (super.field2002 == null) {
                arg1.method1031(super.field1994, var3, var12 != null ? var12.field6108 : null, 0);
            } else {
                class389 var13 = super.field2002.method1369();
                arg1.method1038(super.field1994, var13, var3, var12 != null ? var12.field6108 : null, 0);
            }
            this.method849(false, arg1, super.field1994, 90);
            if (super.field1994[2] != null) {
                if (var4 != 0) {
                    super.field1994[2].method685(var4);
                }
                super.field1994[2].method739(-super.field1993.field2402 + super.field1763, -super.field1993.field2412 + super.field1766, super.field1769 - super.field1993.field2421);
            }
            super.field1964 = class465.field6883;
            if (arg0 < 120) {
                field2458 = -26L;
            }
            super.field1994[0] = super.field1994[1] = super.field1994[2] = super.field1994[3] = null;
            return var12;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(B)I", line = 365)
    public final int method853(byte arg0) {
        ++field2464;
        if (this.field2472.field4938 != null) {
            class342 var2 = this.field2472.method2094(-126, class49.field796);
            if (var2 != null && var2.field4910 != -1) {
                return var2.field4910;
            }
        }
        if (arg0 > -92) {
            return -30;
        } else {
            return this.field2472.field4910 == -1 ? super.method853((byte) -95) : this.field2472.field4910;
        }
    }

    @OriginalMember(owner = "client!se", name = "g", descriptor = "(I)I", line = 390)
    public final int method851(int arg0) {
        ++field2469;
        int var2 = 63 % ((-27 - arg0) / 47);
        if (this.field2472.field4938 != null) {
            class342 var3 = this.field2472.method2094(-113, class49.field796);
            if (var3 != null && var3.field4883 != -1) {
                return var3.field4883;
            }
        }
        return this.field2472.field4883;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(BIIIZI)V", line = 418)
    public final void method1162(byte arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        super.field1768 = (byte) arg5;
        ++field2473;
        if (~super.field1950 != 0 && class84.field1295.method1182(super.field1950, 8).field4676 == 1) {
            super.field1950 = -1;
        }
        if (~super.field1906 != 0) {
            class104 var7 = class512.field7494.method2732(94, super.field1906);
            if (var7.field1499 && var7.field1505 != -1 && class84.field1295.method1182(var7.field1505, 8).field4676 == 1) {
                super.field1906 = -1;
            }
        }
        if (super.field1912 != -1) {
            class104 var8 = class512.field7494.method2732(39, super.field1912);
            if (var8.field1499 && ~var8.field1505 != 0 && class84.field1295.method1182(var8.field1505, arg0 ^ -17).field4676 == 1) {
                super.field1912 = -1;
            }
        }
        if (!arg4) {
            int var9 = -super.field1997[0] + arg3;
            int var10 = -super.field1996[0] + arg1;
            if (~var9 <= 7 && var9 <= 8 && ~var10 <= 7 && var10 <= 8) {
                if (super.field2000 < 9) {
                    ++super.field2000;
                }
                for (int var11 = super.field2000; var11 > 0; --var11) {
                    super.field1997[var11] = super.field1997[var11 + -1];
                    super.field1996[var11] = super.field1996[var11 - 1];
                    super.field2003[var11] = super.field2003[var11 + -1];
                }
                super.field1997[0] = arg3;
                super.field1996[0] = arg1;
                super.field2003[0] = 1;
                return;
            }
        }
        super.field1998 = 0;
        super.field1997[0] = arg3;
        super.field2000 = 0;
        if (arg0 == -25) {
            super.field1999 = 0;
            super.field1996[0] = arg1;
            super.field1769 = (super.field1996[0] << 7) + (arg2 << 6);
            super.field1763 = (super.field1997[0] << 7) - -(arg2 << 6);
            if (super.field2002 != null) {
                super.field2002.method1364();
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(BLqa;)V", line = 500)
    public final void method10(byte arg0, class162 arg1) {
        ++field2477;
        if (arg0 != -32) {
            this.field2466 = 103;
        }
        if (this.field2472 != null) {
            if (super.field2001 || this.method1159(arg1, 0, (byte) 69)) {
                this.method849(super.field2001, arg1, super.field1994, 80);
                super.field1994[0] = super.field1994[1] = super.field1994[2] = super.field1994[3] = null;
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(III)V", line = 523)
    public final void method1163(int arg0, int arg1, int arg2) {
        ++field2460;
        int var4 = super.field1997[0];
        int var5 = super.field1996[0];
        if (~arg1 == -1) {
            ++var5;
        }
        if (arg1 == 1) {
            ++var4;
            ++var5;
        }
        if (arg1 == 2) {
            ++var4;
        }
        if (arg1 == 3) {
            --var5;
            ++var4;
        }
        if (arg1 == 4) {
            --var5;
        }
        if (arg0 == arg1) {
            --var4;
            --var5;
        }
        if (arg1 == 6) {
            --var4;
        }
        if (arg1 == 7) {
            --var4;
            ++var5;
        }
        if (super.field1950 != -1 && ~class84.field1295.method1182(super.field1950, arg0 + 3).field4676 == -2) {
            super.field1950 = -1;
        }
        if (~super.field1906 != 0) {
            class104 var6 = class512.field7494.method2732(arg0 + 74, super.field1906);
            if (var6.field1499 && var6.field1505 != -1 && class84.field1295.method1182(var6.field1505, 8).field4676 == 1) {
                super.field1906 = -1;
            }
        }
        if (~super.field1912 != 0) {
            class104 var7 = class512.field7494.method2732(57, super.field1912);
            if (var7.field1499 && var7.field1505 != -1 && ~class84.field1295.method1182(var7.field1505, arg0 + 3).field4676 == -2) {
                super.field1912 = -1;
            }
        }
        if (super.field2000 < 9) {
            ++super.field2000;
        }
        for (int var8 = super.field2000; ~var8 < -1; --var8) {
            super.field1997[var8] = super.field1997[var8 + -1];
            super.field1996[var8] = super.field1996[var8 - 1];
            super.field2003[var8] = super.field2003[var8 + -1];
        }
        super.field1997[0] = var4;
        super.field1996[0] = var5;
        super.field2003[0] = (byte) arg2;
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(Z)V", line = 615)
    public static void method1164(boolean arg0) {
        field2468 = null;
        field2476 = null;
        if (arg0) {
            method1164(true);
        }
    }

    @OriginalMember(owner = "client!se", name = "j", descriptor = "(I)Z", line = 626)
    private final boolean method1165(int arg0) {
        if (arg0 != 20267) {
            field2476 = null;
        }
        ++field2474;
        return this.field2472.field4927;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ZIILer;Lqa;IB)V", line = 638)
    public final void method19(boolean arg0, int arg1, int arg2, class68 arg3, class162 arg4, int arg5, byte arg6) {
        ++field2471;
        if (arg6 < -105) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IILqa;B)Z", line = 660)
    public final boolean method8(int arg0, int arg1, class162 arg2, byte arg3) {
        ++field2459;
        if (this.field2472 != null && this.method1159(arg2, 131072, (byte) 118)) {
            class414 var5 = arg2.method1115();
            int var6 = super.field1945.method757(38);
            var5.method914(var6);
            var5.method901(super.field1763, super.field1766, super.field1769);
            boolean var7 = false;
            int var8 = 30 / ((-12 - arg3) / 36);
            for (int var9 = 0; super.field1994.length > var9; ++var9) {
                if (super.field1994[var9] != null && super.field1994[var9].method706(arg0, arg1, var5, this.field2472.field4881 == 1)) {
                    var7 = true;
                    break;
                }
            }
            super.field1994[0] = super.field1994[1] = super.field1994[2] = super.field1994[3] = null;
            return var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!se", name = "e", descriptor = "(I)I", line = 699)
    public final int method283(int arg0) {
        ++field2456;
        if (arg0 != 16490) {
            field2468 = null;
        }
        return super.field1910;
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(I)Z", line = 710)
    public final boolean method18(int arg0) {
        if (arg0 < 72) {
            method1161((class351) null, 122);
        }
        ++field2467;
        return false;
    }
}
