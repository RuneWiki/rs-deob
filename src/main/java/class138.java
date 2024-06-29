import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class138 {

    @OriginalMember(owner = "client!bi", name = "o", descriptor = "[B")
    public static byte[] field1832 = new byte[520];

    @OriginalMember(owner = "client!bi", name = "n", descriptor = "Ljava/lang/String;")
    public static String field1831 = "Loaded update list";

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "Lum;")
    public static class185 field1827 = new class185(0, -1);

    @OriginalMember(owner = "client!bi", name = "C", descriptor = "[I")
    public static int[] field1846 = new int[14];

    @OriginalMember(owner = "client!bi", name = "D", descriptor = "Ljava/lang/String;")
    public static String field1847 = "Stellar Dawn is loading - please wait...";

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "I")
    public int field1818;

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "I")
    public static int field1826;

    @OriginalMember(owner = "client!bi", name = "k", descriptor = "I")
    public int field1828;

    @OriginalMember(owner = "client!bi", name = "l", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!bi", name = "m", descriptor = "I")
    public static int field1830;

    @OriginalMember(owner = "client!bi", name = "p", descriptor = "I")
    public static int field1833;

    @OriginalMember(owner = "client!bi", name = "q", descriptor = "I")
    public static int field1834;

    @OriginalMember(owner = "client!bi", name = "r", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!bi", name = "s", descriptor = "I")
    public int field1836;

    @OriginalMember(owner = "client!bi", name = "t", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!bi", name = "u", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!bi", name = "v", descriptor = "I")
    public static int field1839;

    @OriginalMember(owner = "client!bi", name = "w", descriptor = "I")
    public int field1840;

    @OriginalMember(owner = "client!bi", name = "x", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!bi", name = "y", descriptor = "I")
    public static int field1842;

    @OriginalMember(owner = "client!bi", name = "z", descriptor = "I")
    public static int field1843;

    @OriginalMember(owner = "client!bi", name = "B", descriptor = "Lnr;")
    public static class437 field1845;

    @OriginalMember(owner = "client!bi", name = "A", descriptor = "[[I")
    public int[][] field1844;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IZIIIBZ)V", line = 9)
    public final void method913(int arg0, boolean arg1, int arg2, int arg3, int arg4, byte arg5, boolean arg6) {
        field1841++;
        int var8 = 256;
        if (arg1) {
            var8 |= 0x20000;
        }
        int var9 = arg3 - this.field1828;
        if (arg6) {
            var8 |= 0x40000000;
        }
        int var10 = arg4 - this.field1840;
        int var11 = -14 % ((arg5 + 50) / 39);
        for (int var12 = var9; var12 < arg0 + var9; var12++) {
            if (var12 >= 0 && this.field1836 > var12) {
                for (int var13 = var10; var13 < (var10 + arg2); var13++) {
                    if (var13 >= 0 && var13 < this.field1818) {
                        this.method931((byte) -91, var13, var12, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZZBIIII)V", line = 52)
    public final void method914(boolean arg0, boolean arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = arg6 - this.field1840;
        field1824++;
        int var9 = arg3 - this.field1828;
        if (arg5 == 0) {
            if (arg4 == 0) {
                this.method931((byte) -124, var8, var9, 128);
                this.method931((byte) 49, var8, var9 - 1, 8);
            }
            if (arg4 == 1) {
                this.method931((byte) 59, var8, var9, 2);
                this.method931((byte) 101, var8 + 1, var9, 32);
            }
            if (arg4 == 2) {
                this.method931((byte) -91, var8, var9, 8);
                this.method931((byte) -96, var8, var9 + 1, 128);
            }
            if (arg4 == 3) {
                this.method931((byte) -117, var8, var9, 32);
                this.method931((byte) 119, var8 - 1, var9, 2);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg4 == 0) {
                this.method931((byte) -93, var8, var9, 1);
                this.method931((byte) -120, var8 + 1, var9 - 1, 16);
            }
            if (arg4 == 1) {
                this.method931((byte) 85, var8, var9, 4);
                this.method931((byte) 122, var8 + 1, var9 + 1, 64);
            }
            if (arg4 == 2) {
                this.method931((byte) 29, var8, var9, 16);
                this.method931((byte) -117, var8 - 1, var9 - -1, 1);
            }
            if (arg4 == 3) {
                this.method931((byte) -127, var8, var9, 64);
                this.method931((byte) 29, var8 - 1, var9 + -1, 4);
            }
        }
        if (arg5 == 2) {
            if (arg4 == 0) {
                this.method931((byte) -115, var8, var9, 130);
                this.method931((byte) -93, var8, var9 - 1, 8);
                this.method931((byte) -108, var8 + 1, var9, 32);
            }
            if (arg4 == 1) {
                this.method931((byte) -98, var8, var9, 10);
                this.method931((byte) -113, var8 + 1, var9, 32);
                this.method931((byte) -121, var8, var9 + 1, 128);
            }
            if (arg4 == 2) {
                this.method931((byte) -95, var8, var9, 40);
                this.method931((byte) -127, var8, var9 + 1, 128);
                this.method931((byte) 117, var8 - 1, var9, 2);
            }
            if (arg4 == 3) {
                this.method931((byte) -107, var8, var9, 160);
                this.method931((byte) -117, var8 - 1, var9, 2);
                this.method931((byte) -91, var8, var9 - 1, 8);
            }
        }
        if (arg1) {
            if (arg5 == 0) {
                if (arg4 == 0) {
                    this.method931((byte) -122, var8, var9, 65536);
                    this.method931((byte) 73, var8, var9 - 1, 4096);
                }
                if (arg4 == 1) {
                    this.method931((byte) -124, var8, var9, 1024);
                    this.method931((byte) 57, var8 + 1, var9, 16384);
                }
                if (arg4 == 2) {
                    this.method931((byte) 18, var8, var9, 4096);
                    this.method931((byte) -92, var8, var9 + 1, 65536);
                }
                if (arg4 == 3) {
                    this.method931((byte) -125, var8, var9, 16384);
                    this.method931((byte) -105, var8 - 1, var9, 1024);
                }
            }
            if (arg5 == 1 || arg5 == 3) {
                if (arg4 == 0) {
                    this.method931((byte) 38, var8, var9, 512);
                    this.method931((byte) 83, var8 + 1, var9 + -1, 8192);
                }
                if (arg4 == 1) {
                    this.method931((byte) 93, var8, var9, 2048);
                    this.method931((byte) 34, var8 + 1, var9 + 1, 32768);
                }
                if (arg4 == 2) {
                    this.method931((byte) 53, var8, var9, 8192);
                    this.method931((byte) -105, var8 - 1, var9 + 1, 512);
                }
                if (arg4 == 3) {
                    this.method931((byte) -99, var8, var9, 32768);
                    this.method931((byte) -128, var8 - 1, var9 - 1, 2048);
                }
            }
            if (arg5 == 2) {
                if (arg4 == 0) {
                    this.method931((byte) 115, var8, var9, 66560);
                    this.method931((byte) 38, var8, var9 - 1, 4096);
                    this.method931((byte) 72, var8 + 1, var9, 16384);
                }
                if (arg4 == 1) {
                    this.method931((byte) -113, var8, var9, 5120);
                    this.method931((byte) 87, var8 + 1, var9, 16384);
                    this.method931((byte) 126, var8, var9 + 1, 65536);
                }
                if (arg4 == 2) {
                    this.method931((byte) 106, var8, var9, 20480);
                    this.method931((byte) -105, var8, var9 + 1, 65536);
                    this.method931((byte) 119, var8 - 1, var9, 1024);
                }
                if (arg4 == 3) {
                    this.method931((byte) -114, var8, var9, 81920);
                    this.method931((byte) -97, var8 - 1, var9, 1024);
                    this.method931((byte) -110, var8, var9 - 1, 4096);
                }
            }
        }
        if (arg2 < 123) {
            this.field1844 = null;
        }
        if (!arg0) {
            return;
        }
        if (arg5 == 0) {
            if (arg4 == 0) {
                this.method931((byte) 49, var8, var9, 536870912);
                this.method931((byte) 26, var8, var9 - 1, 33554432);
            }
            if (arg4 == 1) {
                this.method931((byte) 64, var8, var9, 8388608);
                this.method931((byte) 69, var8 + 1, var9, 134217728);
            }
            if (arg4 == 2) {
                this.method931((byte) 73, var8, var9, 33554432);
                this.method931((byte) 29, var8, var9 + 1, 536870912);
            }
            if (arg4 == 3) {
                this.method931((byte) -123, var8, var9, 134217728);
                this.method931((byte) -121, var8 - 1, var9, 8388608);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg4 == 0) {
                this.method931((byte) 97, var8, var9, 4194304);
                this.method931((byte) -93, var8 + 1, var9 + -1, 67108864);
            }
            if (arg4 == 1) {
                this.method931((byte) -102, var8, var9, 16777216);
                this.method931((byte) 97, var8 + 1, var9 + 1, 268435456);
            }
            if (arg4 == 2) {
                this.method931((byte) -112, var8, var9, 67108864);
                this.method931((byte) 83, var8 - 1, var9 - -1, 4194304);
            }
            if (arg4 == 3) {
                this.method931((byte) 88, var8, var9, 268435456);
                this.method931((byte) -102, var8 - 1, var9 - 1, 16777216);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method931((byte) 101, var8, var9, 545259520);
            this.method931((byte) -127, var8, var9 - 1, 33554432);
            this.method931((byte) 91, var8 + 1, var9, 134217728);
        }
        if (arg4 == 1) {
            this.method931((byte) -96, var8, var9, 41943040);
            this.method931((byte) 114, var8 + 1, var9, 134217728);
            this.method931((byte) -94, var8, var9 + 1, 536870912);
        }
        if (arg4 == 2) {
            this.method931((byte) 88, var8, var9, 167772160);
            this.method931((byte) -96, var8, var9 + 1, 536870912);
            this.method931((byte) 71, var8 - 1, var9, 8388608);
        }
        if (arg4 == 3) {
            this.method931((byte) 104, var8, var9, 671088640);
            this.method931((byte) -101, var8 - 1, var9, 8388608);
            this.method931((byte) -105, var8, var9 - 1, 33554432);
            return;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IZII)V", line = 357)
    private final void method915(int arg0, boolean arg1, int arg2, int arg3) {
        field1819++;
        if (!arg1) {
            method924(-85, 20, -98, -34, (byte) 76, -105, -41);
        }
        this.field1844[arg3][arg2] = class401.method2606(this.field1844[arg3][arg2], ~arg0);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIIIZZ)V", line = 370)
    public final void method916(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        field1833++;
        int var8 = arg2 - this.field1840;
        int var9 = arg3 - this.field1828;
        if (arg4 <= 14) {
            return;
        }
        if (arg1 == 0) {
            if (arg0 == 0) {
                this.method915(128, true, var8, var9);
                this.method915(8, true, var8, var9 - 1);
            }
            if (arg0 == 1) {
                this.method915(2, true, var8, var9);
                this.method915(32, true, var8 + 1, var9);
            }
            if (arg0 == 2) {
                this.method915(8, true, var8, var9);
                this.method915(128, true, var8, var9 + 1);
            }
            if (arg0 == 3) {
                this.method915(32, true, var8, var9);
                this.method915(2, true, var8 - 1, var9);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg0 == 0) {
                this.method915(1, true, var8, var9);
                this.method915(16, true, var8 + 1, var9 - 1);
            }
            if (arg0 == 1) {
                this.method915(4, true, var8, var9);
                this.method915(64, true, var8 + 1, var9 + 1);
            }
            if (arg0 == 2) {
                this.method915(16, true, var8, var9);
                this.method915(1, true, var8 - 1, var9 - -1);
            }
            if (arg0 == 3) {
                this.method915(64, true, var8, var9);
                this.method915(4, true, var8 - 1, var9 + -1);
            }
        }
        if (arg1 == 2) {
            if (arg0 == 0) {
                this.method915(130, true, var8, var9);
                this.method915(8, true, var8, var9 - 1);
                this.method915(32, true, var8 + 1, var9);
            }
            if (arg0 == 1) {
                this.method915(10, true, var8, var9);
                this.method915(32, true, var8 + 1, var9);
                this.method915(128, true, var8, var9 + 1);
            }
            if (arg0 == 2) {
                this.method915(40, true, var8, var9);
                this.method915(128, true, var8, var9 + 1);
                this.method915(2, true, var8 - 1, var9);
            }
            if (arg0 == 3) {
                this.method915(160, true, var8, var9);
                this.method915(2, true, var8 - 1, var9);
                this.method915(8, true, var8, var9 - 1);
            }
        }
        if (arg6) {
            if (arg1 == 0) {
                if (arg0 == 0) {
                    this.method915(65536, true, var8, var9);
                    this.method915(4096, true, var8, var9 - 1);
                }
                if (arg0 == 1) {
                    this.method915(1024, true, var8, var9);
                    this.method915(16384, true, var8 + 1, var9);
                }
                if (arg0 == 2) {
                    this.method915(4096, true, var8, var9);
                    this.method915(65536, true, var8, var9 + 1);
                }
                if (arg0 == 3) {
                    this.method915(16384, true, var8, var9);
                    this.method915(1024, true, var8 - 1, var9);
                }
            }
            if (arg1 == 1 || arg1 == 3) {
                if (arg0 == 0) {
                    this.method915(512, true, var8, var9);
                    this.method915(8192, true, var8 + 1, var9 - 1);
                }
                if (arg0 == 1) {
                    this.method915(2048, true, var8, var9);
                    this.method915(32768, true, var8 + 1, var9 - -1);
                }
                if (arg0 == 2) {
                    this.method915(8192, true, var8, var9);
                    this.method915(512, true, var8 - 1, var9 - -1);
                }
                if (arg0 == 3) {
                    this.method915(32768, true, var8, var9);
                    this.method915(2048, true, var8 - 1, var9 + -1);
                }
            }
            if (arg1 == 2) {
                if (arg0 == 0) {
                    this.method915(66560, true, var8, var9);
                    this.method915(4096, true, var8, var9 - 1);
                    this.method915(16384, true, var8 + 1, var9);
                }
                if (arg0 == 1) {
                    this.method915(5120, true, var8, var9);
                    this.method915(16384, true, var8 + 1, var9);
                    this.method915(65536, true, var8, var9 + 1);
                }
                if (arg0 == 2) {
                    this.method915(20480, true, var8, var9);
                    this.method915(65536, true, var8, var9 + 1);
                    this.method915(1024, true, var8 - 1, var9);
                }
                if (arg0 == 3) {
                    this.method915(81920, true, var8, var9);
                    this.method915(1024, true, var8 - 1, var9);
                    this.method915(4096, true, var8, var9 - 1);
                }
            }
        }
        if (!arg5) {
            return;
        }
        if (arg1 == 0) {
            if (arg0 == 0) {
                this.method915(536870912, true, var8, var9);
                this.method915(33554432, true, var8, var9 - 1);
            }
            if (arg0 == 1) {
                this.method915(8388608, true, var8, var9);
                this.method915(134217728, true, var8 + 1, var9);
            }
            if (arg0 == 2) {
                this.method915(33554432, true, var8, var9);
                this.method915(536870912, true, var8, var9 + 1);
            }
            if (arg0 == 3) {
                this.method915(134217728, true, var8, var9);
                this.method915(8388608, true, var8 - 1, var9);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg0 == 0) {
                this.method915(4194304, true, var8, var9);
                this.method915(67108864, true, var8 + 1, var9 + -1);
            }
            if (arg0 == 1) {
                this.method915(16777216, true, var8, var9);
                this.method915(268435456, true, var8 + 1, var9 + 1);
            }
            if (arg0 == 2) {
                this.method915(67108864, true, var8, var9);
                this.method915(4194304, true, var8 - 1, var9 + 1);
            }
            if (arg0 == 3) {
                this.method915(268435456, true, var8, var9);
                this.method915(16777216, true, var8 - 1, var9 - 1);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method915(545259520, true, var8, var9);
            this.method915(33554432, true, var8, var9 - 1);
            this.method915(134217728, true, var8 + 1, var9);
        }
        if (arg0 == 1) {
            this.method915(41943040, true, var8, var9);
            this.method915(134217728, true, var8 + 1, var9);
            this.method915(536870912, true, var8, var9 + 1);
        }
        if (arg0 == 2) {
            this.method915(167772160, true, var8, var9);
            this.method915(536870912, true, var8, var9 + 1);
            this.method915(8388608, true, var8 - 1, var9);
        }
        if (arg0 == 3) {
            this.method915(671088640, true, var8, var9);
            this.method915(8388608, true, var8 - 1, var9);
            this.method915(33554432, true, var8, var9 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIZIIIII)Z", line = 687)
    public final boolean method917(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1835++;
        if (arg6 > 1) {
            return class120.method836(arg5, arg8, arg0, -11093, arg1, arg6, arg6, arg7, arg2) ? true : this.method921(arg8, arg6, -120, arg4, arg5, arg0, arg7, arg2, arg1, arg6);
        }
        int var10 = arg1 + arg8 - 1;
        int var11 = arg2 + arg7 - 1;
        if (arg0 >= arg8 && var10 >= arg0 && arg5 >= arg2 && var11 >= arg5) {
            return true;
        } else if (arg8 - 1 == arg0 && arg5 >= arg2 && var11 >= arg5 && (this.field1844[arg0 - this.field1828][arg5 - this.field1840] & 0x8) == 0 && (arg4 & 0x8) == 0) {
            return true;
        } else if ((var10 + 1) == arg0 && arg2 <= arg5 && arg5 <= var11 && (this.field1844[arg0 - this.field1828][arg5 - this.field1840] & 0x80) == 0 && (arg4 & 0x2) == 0) {
            return true;
        } else {
            if (arg3) {
                method930((class18) null, 11, 101, (byte) 51, 114);
            }
            if ((arg2 - 1) == arg5 && arg8 <= arg0 && arg0 <= var10 && (this.field1844[arg0 - this.field1828][arg5 - this.field1840] & 0x2) == 0 && (arg4 & 0x4) == 0) {
                return true;
            } else {
                return (var11 + 1) == arg5 && arg8 <= arg0 && var10 >= arg0 && (this.field1844[arg0 - this.field1828][arg5 - this.field1840] & 0x20) == 0 && (arg4 & 0x1) == 0;
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BI)V", line = 727)
    public static final void method918(byte arg0, int arg1) {
        field1826++;
        class256 var2 = class363.method2385(6, arg1, (byte) 1);
        if (arg0 <= -122) {
            var2.method1611(-103);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lqj;I)V", line = 743)
    public static final void method919(class238 arg0, int arg1) {
        field1837++;
        class234.field3296 = arg0;
        if (arg1 != -18066) {
            method925(31);
        }
        class191.field2664 = class234.field3296.method1476(19, (byte) -72);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(III)V", line = 758)
    public final void method920(int arg0, int arg1, int arg2) {
        field1842++;
        int var4 = arg2 - this.field1828;
        int var5 = arg1 - this.field1840;
        int var6 = -49 / ((33 - arg0) / 59);
        this.field1844[var4][var5] = class401.method2606(this.field1844[var4][var5], -262145);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIIIIIIII)Z", line = 776)
    public final boolean method921(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 >= -65) {
            this.field1836 = -58;
        }
        field1839++;
        int var11 = arg5 + arg9;
        int var12 = arg4 + arg1;
        int var13 = arg0 + arg8;
        int var14 = arg6 + arg7;
        if (arg5 == var13 && (arg3 & 0x2) == 0) {
            int var15 = arg4 <= arg7 ? arg7 : arg4;
            int var16 = var12 < var14 ? var12 : var14;
            while (var16 > var15) {
                if ((this.field1844[var13 - this.field1828 - 1][var15 - this.field1840] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg0 == var11 && (arg3 & 0x8) == 0) {
            int var17 = arg4 > arg7 ? arg4 : arg7;
            int var18 = var14 <= var12 ? var14 : var12;
            while (var18 > var17) {
                if ((this.field1844[arg0 - this.field1828][var17 - this.field1840] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg4 == var14 && (arg3 & 0x1) == 0) {
            int var19 = arg5 <= arg0 ? arg0 : arg5;
            int var20 = var13 > var11 ? var11 : var13;
            while (var19 < var20) {
                if ((this.field1844[var19 - this.field1828][var14 - this.field1840 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg7 == var12 && (arg3 & 0x4) == 0) {
            int var21 = arg0 < arg5 ? arg5 : arg0;
            int var22 = var11 >= var13 ? var13 : var11;
            while (var21 < var22) {
                if ((this.field1844[var21 - this.field1828][arg7 - this.field1840] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IZZIIIII)V", line = 870)
    public final void method922(int arg0, boolean arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1821++;
        int var9 = 256;
        if (arg1) {
            var9 |= 0x20000;
        }
        if (arg2) {
            var9 |= 0x40000000;
        }
        int var10 = arg3 - this.field1828;
        if (arg7 == 1 || arg7 == 3) {
            int var11 = arg5;
            arg5 = arg0;
            arg0 = var11;
        }
        int var12 = arg6 - this.field1840;
        for (int var13 = var10; var13 < arg5 + var10; var13++) {
            if (var13 >= 0 && this.field1836 > var13) {
                for (int var14 = var12; var14 < (arg0 + var12); var14++) {
                    if (var14 >= 0 && var14 < this.field1818) {
                        this.method915(var9, true, var14, var13);
                    }
                }
            }
        }
        if (arg4 != -14463) {
            this.field1818 = -27;
        }
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(III)V", line = 923)
    public final void method923(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field1828;
        field1830++;
        if (arg1 >= -25) {
            this.method920(44, -106, 106);
        }
        int var5 = arg0 - this.field1840;
        this.field1844[var4][var5] = class128.method871(this.field1844[var4][var5], 2097152);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIIBII)V", line = 939)
    public static final void method924(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        if (class203.field2942 <= (arg1 - arg5) && class297.field4268 >= arg1 + arg5 && (arg3 - arg5) >= class180.field2375 && (arg3 + arg5) <= class50.field695) {
            class151.method988(arg5, arg0, arg3, arg1, 877265224, arg6, arg2);
        } else {
            class288.method1824(-117, arg3, arg5, arg2, arg1, arg6, arg0);
        }
        if (arg4 >= -2) {
            field1845 = null;
        }
        field1825++;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V", line = 957)
    public static void method925(int arg0) {
        field1827 = null;
        field1832 = null;
        field1847 = null;
        int var1 = 46 / ((arg0 - 62) / 41);
        field1846 = null;
        field1831 = null;
        field1845 = null;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZII)V", line = 974)
    public final void method926(boolean arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field1828;
        field1820++;
        if (arg0) {
            int var5 = arg2 - this.field1840;
            this.field1844[var4][var5] = class401.method2606(this.field1844[var4][var5], -2097153);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIIIIII)Z", line = 989)
    public final boolean method927(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1834++;
        if (arg2 == 1) {
            if (arg6 == arg7 && arg0 == arg4) {
                return true;
            }
        } else if (arg6 >= arg7 && arg6 <= (arg7 - (1 - arg2)) && arg4 >= arg4 && arg4 <= (arg2 + arg4 - 1)) {
            return true;
        }
        int var9 = arg6 - this.field1828;
        int var10 = arg4 - this.field1840;
        int var11 = arg7 - this.field1828;
        int var12 = arg0 - this.field1840;
        if (arg2 == 1) {
            if (arg3 == 6 || arg3 == 7) {
                if (arg3 == 7) {
                    arg1 = arg1 + 2 & 0x3;
                }
                if (arg1 == 0) {
                    if ((var9 + 1) == var11 && var10 == var12 && (this.field1844[var11][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 - 1 == var12 && (this.field1844[var11][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var9 - 1 == var11 && var10 == var12 && (this.field1844[var11][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 - 1 == var12 && (this.field1844[var11][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var9 - 1 == var11 && var10 == var12 && (this.field1844[var11][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 + 1 == var12 && (this.field1844[var11][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if ((var9 + 1) == var11 && var10 == var12 && (this.field1844[var11][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 + 1 == var12 && (this.field1844[var11][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 8) {
                if (var9 == var11 && (var10 + 1) == var12 && (this.field1844[var11][var12] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var11 && var10 - 1 == var12 && (this.field1844[var11][var12] & 0x2) == 0) {
                    return true;
                }
                if ((var9 - 1) == var11 && var10 == var12 && (this.field1844[var11][var12] & 0x8) == 0) {
                    return true;
                }
                if (var9 + 1 == var11 && var10 == var12 && (this.field1844[var11][var12] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var11 + arg2 - 1;
            int var14 = arg2 + var12 - 1;
            if (arg3 == 6 || arg3 == 7) {
                if (arg3 == 7) {
                    arg1 = arg1 + 2 & 0x3;
                }
                if (arg1 == 0) {
                    if (var9 + 1 == var11 && var12 <= var10 && var10 <= var14 && (this.field1844[var11][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 <= var9 && var13 >= var9 && var10 - arg2 == var12 && (this.field1844[var9][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if ((var9 - arg2) == var11 && var12 <= var10 && var14 >= var10 && (this.field1844[var13][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 >= var11 && var13 >= var9 && (var10 - arg2) == var12 && (this.field1844[var9][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var9 - arg2 == var11 && var12 <= var10 && var10 <= var14 && (this.field1844[var13][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 >= var11 && var13 >= var9 && var10 + 1 == var12 && (this.field1844[var9][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var9 + 1 == var11 && var10 >= var12 && var10 <= var14 && (this.field1844[var11][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var13 && var10 + 1 == var12 && (this.field1844[var9][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 8) {
                if (var9 >= var11 && var9 <= var13 && var10 + 1 == var12 && (this.field1844[var9][var12] & 0x20) == 0) {
                    return true;
                }
                if (var11 <= var9 && var9 <= var13 && var10 - arg2 == var12 && (this.field1844[var9][var14] & 0x2) == 0) {
                    return true;
                }
                if ((var9 - arg2) == var11 && var10 >= var12 && var14 >= var10 && (this.field1844[var13][var10] & 0x8) == 0) {
                    return true;
                }
                if (var9 + 1 == var11 && var12 <= var10 && var14 >= var10 && (this.field1844[var11][var10] & 0x80) == 0) {
                    return true;
                }
            }
        }
        if (arg5 <= 20) {
            method919((class238) null, 7);
        }
        return false;
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(III)V", line = 1178)
    public final void method928(int arg0, int arg1, int arg2) {
        field1823++;
        int var4 = arg1 - this.field1840;
        int var5 = arg0 - this.field1828;
        this.field1844[var5][var4] = class128.method871(this.field1844[var5][var4], 262144);
        if (arg2 != -32323) {
            this.field1836 = -30;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIIIBII)Z", line = 1191)
    public final boolean method929(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        field1843++;
        if (arg1 == 1) {
            if (arg3 == arg6 && arg0 == arg7) {
                return true;
            }
        } else if (arg6 <= arg3 && arg3 <= arg1 + arg6 - 1 && arg0 >= arg0 && arg1 + arg0 - 1 >= arg0) {
            return true;
        }
        int var9 = arg3 - this.field1828;
        int var10 = arg0 - this.field1840;
        int var11 = arg6 - this.field1828;
        int var12 = arg7 - this.field1840;
        if (arg1 == 1) {
            if (arg4 == 0) {
                if (arg2 == 0) {
                    if (var9 - 1 == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var10 + 1 == var12 && (this.field1844[var11][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var10 - 1) == var12 && (this.field1844[var11][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var9 == var11 && (var10 + 1) == var12) {
                        return true;
                    }
                    if ((var9 - 1) == var11 && var10 == var12 && (this.field1844[var11][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 == var12 && (this.field1844[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if (var9 + 1 == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var10 + 1) == var12 && (this.field1844[var11][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var10 - 1) == var12 && (this.field1844[var11][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var9 == var11 && (var10 - 1) == var12) {
                        return true;
                    }
                    if ((var9 - 1) == var11 && var10 == var12 && (this.field1844[var11][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var10 == var12 && (this.field1844[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 2) {
                if (arg2 == 0) {
                    if (var9 - 1 == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var10 + 1) == var12) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 == var12 && (this.field1844[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var10 - 1) == var12 && (this.field1844[var11][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if ((var9 - 1) == var11 && var10 == var12 && (this.field1844[var11][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var10 + 1) == var12) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var10 - 1) == var12 && (this.field1844[var11][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if ((var9 - 1) == var11 && var10 == var12 && (this.field1844[var11][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var10 + 1) == var12 && (this.field1844[var11][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var10 - 1 == var12) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var9 - 1 == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var10 + 1) == var12 && (this.field1844[var11][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 == var12 && (this.field1844[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 - 1 == var12) {
                        return true;
                    }
                }
            }
            if (arg4 == 9) {
                if (var9 == var11 && (var10 + 1) == var12 && (this.field1844[var11][var12] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var11 && var10 - 1 == var12 && (this.field1844[var11][var12] & 0x2) == 0) {
                    return true;
                }
                if (var9 - 1 == var11 && var10 == var12 && (this.field1844[var11][var12] & 0x8) == 0) {
                    return true;
                }
                if (var9 + 1 == var11 && var10 == var12 && (this.field1844[var11][var12] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var11 + arg1 - 1;
            int var14 = var12 + arg1 - 1;
            if (arg4 == 0) {
                if (arg2 == 0) {
                    if (var9 - arg1 == var11 && var10 >= var12 && var14 >= var10) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var13 && (var10 + 1) == var12 && (this.field1844[var9][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 <= var9 && var13 >= var9 && var10 - arg1 == var12 && (this.field1844[var9][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var11 <= var9 && var9 <= var13 && var10 + 1 == var12) {
                        return true;
                    }
                    if (var9 - arg1 == var11 && var10 >= var12 && var14 >= var10 && (this.field1844[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var12 <= var10 && var10 <= var14 && (this.field1844[var11][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if (var9 + 1 == var11 && var12 <= var10 && var10 <= var14) {
                        return true;
                    }
                    if (var11 <= var9 && var13 >= var9 && (var10 + 1) == var12 && (this.field1844[var9][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var13 && var10 - arg1 == var12 && (this.field1844[var9][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var9 >= var11 && var9 <= var13 && (var10 - arg1) == var12) {
                        return true;
                    }
                    if (var9 - arg1 == var11 && var10 >= var12 && var10 <= var14 && (this.field1844[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var12 <= var10 && var10 <= var14 && (this.field1844[var11][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 2) {
                if (arg2 == 0) {
                    if ((var9 - arg1) == var11 && var10 >= var12 && var14 >= var10) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var13 && (var10 + 1) == var12) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var10 >= var12 && var14 >= var10 && (this.field1844[var11][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 <= var9 && var9 <= var13 && var10 - arg1 == var12 && (this.field1844[var9][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if ((var9 - arg1) == var11 && var10 >= var12 && var14 >= var10 && (this.field1844[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 <= var9 && var13 >= var9 && (var10 + 1) == var12) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 >= var12 && var14 >= var10) {
                        return true;
                    }
                    if (var11 <= var9 && var9 <= var13 && (var10 - arg1) == var12 && (this.field1844[var9][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if (var9 - arg1 == var11 && var10 >= var12 && var10 <= var14 && (this.field1844[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var13 && (var10 + 1) == var12 && (this.field1844[var9][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var12 <= var10 && var10 <= var14) {
                        return true;
                    }
                    if (var11 <= var9 && var9 <= var13 && var10 - arg1 == var12) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var9 - arg1 == var11 && var10 >= var12 && var10 <= var14) {
                        return true;
                    }
                    if (var11 <= var9 && var9 <= var13 && (var10 + 1) == var12 && (this.field1844[var9][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var12 <= var10 && var10 <= var14 && (this.field1844[var11][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 >= var11 && var13 >= var9 && (var10 - arg1) == var12) {
                        return true;
                    }
                }
            }
            if (arg4 == 9) {
                if (var9 >= var11 && var13 >= var9 && (var10 + 1) == var12 && (this.field1844[var9][var12] & 0x2C0120) == 0) {
                    return true;
                }
                if (var11 <= var9 && var13 >= var9 && (var10 - arg1) == var12 && (this.field1844[var9][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if (var9 - arg1 == var11 && var10 >= var12 && var10 <= var14 && (this.field1844[var13][var10] & 0x2C0108) == 0) {
                    return true;
                }
                if ((var9 + 1) == var11 && var12 <= var10 && var10 <= var14 && (this.field1844[var11][var10] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return arg5 <= 86;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lfg;IIBI)V", line = 1561)
    public static final void method930(class18 arg0, int arg1, int arg2, byte arg3, int arg4) {
        field1822++;
        int var5 = -112 / ((-arg3 - 83) / 40);
        class183 var6 = arg0.method140(115);
        int var7 = arg0.field235 - arg0.field272.field3846 & 0x3FFF;
        if (arg4 == -1) {
            if (var7 != 0 || arg0.field266 > 25) {
                arg0.field236 = false;
                if (arg1 < 0 && var6.field2442 != -1) {
                    arg0.field229 = var6.field2442;
                } else if (arg1 <= 0 || var6.field2438 == -1) {
                    arg0.field229 = var6.field2447;
                } else {
                    arg0.field229 = var6.field2438;
                }
            } else if (!arg0.field236 || !var6.method1129(arg0.field229, -28)) {
                arg0.field229 = var6.method1126((byte) -24);
                arg0.field236 = arg0.field229 != -1;
            }
        } else if (arg0.field230 != -1 && var7 >= 10240 || var7 <= 2048) {
            int var8 = class123.field1645[arg2] - arg0.field272.field3846 & 0x3FFF;
            arg0.field236 = false;
            if (arg4 == 2 && var6.field2460 != -1) {
                if (var8 > 2048 && var8 <= 6144 && var6.field2441 != -1) {
                    arg0.field229 = var6.field2441;
                } else if (var8 >= 10240 && var8 < 14336 && var6.field2469 != -1) {
                    arg0.field229 = var6.field2469;
                } else if (var8 <= 6144 || var8 >= 10240 || var6.field2444 == -1) {
                    arg0.field229 = var6.field2460;
                } else {
                    arg0.field229 = var6.field2444;
                }
            } else if (arg4 == 0 && var6.field2458 != -1) {
                if (var8 > 2048 && var8 <= 6144 && var6.field2461 != -1) {
                    arg0.field229 = var6.field2461;
                } else if (var8 >= 10240 && var8 < 14336 && var6.field2470 != -1) {
                    arg0.field229 = var6.field2470;
                } else if (var8 <= 6144 || var8 >= 10240 || var6.field2471 == -1) {
                    arg0.field229 = var6.field2458;
                } else {
                    arg0.field229 = var6.field2471;
                }
            } else if (var8 > 2048 && var8 <= 6144 && var6.field2465 != -1) {
                arg0.field229 = var6.field2465;
            } else if (var8 >= 10240 && var8 < 14336 && var6.field2437 != -1) {
                arg0.field229 = var6.field2437;
            } else if (var8 <= 6144 || var8 >= 10240 || var6.field2433 == -1) {
                arg0.field229 = var6.field2447;
            } else {
                arg0.field229 = var6.field2433;
            }
        } else if (var7 == 0 && arg0.field266 <= 25) {
            arg0.field236 = false;
            if (arg4 == 2 && var6.field2460 != -1) {
                arg0.field229 = var6.field2460;
            } else if (arg4 == 0 && var6.field2458 != -1) {
                arg0.field229 = var6.field2458;
            } else {
                arg0.field229 = var6.field2447;
            }
        } else {
            if (arg4 == 2 && var6.field2460 != -1) {
                if (arg1 < 0 && var6.field2473 != -1) {
                    arg0.field229 = var6.field2473;
                } else if (arg1 <= 0 || var6.field2436 == -1) {
                    arg0.field229 = var6.field2460;
                } else {
                    arg0.field229 = var6.field2436;
                }
            } else if (arg4 == 0 && var6.field2458 != -1) {
                if (arg1 < 0 && var6.field2467 != -1) {
                    arg0.field229 = var6.field2467;
                } else if (arg1 <= 0 || var6.field2450 == -1) {
                    arg0.field229 = var6.field2458;
                } else {
                    arg0.field229 = var6.field2450;
                }
            } else if (arg1 < 0 && var6.field2474 != -1) {
                arg0.field229 = var6.field2474;
            } else if (arg1 <= 0 || var6.field2446 == -1) {
                arg0.field229 = var6.field2447;
            } else {
                arg0.field229 = var6.field2446;
            }
            arg0.field236 = false;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BIII)V", line = 1721)
    private final void method931(byte arg0, int arg1, int arg2, int arg3) {
        field1829++;
        int var5 = 49 % ((arg0 + 37) / 54);
        this.field1844[arg2][arg1] = class128.method871(this.field1844[arg2][arg1], arg3);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)V", line = 1737)
    public final void method932(byte arg0) {
        field1838++;
        if (arg0 != -107) {
            return;
        }
        for (int var2 = 0; var2 < this.field1836; var2++) {
            for (int var3 = 0; var3 < this.field1818; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= (this.field1836 - 5) || var3 >= (this.field1818 - 5)) {
                    this.field1844[var2][var3] = -1;
                } else {
                    this.field1844[var2][var3] = 2097152;
                }
            }
        }
    }
}
