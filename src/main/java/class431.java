import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vaa")
public class class431 extends class67 {

    @OriginalMember(owner = "client!vaa", name = "ub", descriptor = "Z")
    public boolean field6046 = false;

    @OriginalMember(owner = "client!vaa", name = "qb", descriptor = "Z")
    public boolean field6042 = false;

    @OriginalMember(owner = "client!vaa", name = "Ab", descriptor = "Z")
    public boolean field6052 = false;

    @OriginalMember(owner = "client!vaa", name = "Bb", descriptor = "Z")
    public boolean field6053 = false;

    @OriginalMember(owner = "client!vaa", name = "kb", descriptor = "Z")
    public boolean field6036 = false;

    @OriginalMember(owner = "client!vaa", name = "gb", descriptor = "I")
    public static int field6032;

    @OriginalMember(owner = "client!vaa", name = "hb", descriptor = "I")
    public static int field6033;

    @OriginalMember(owner = "client!vaa", name = "ib", descriptor = "I")
    public static int field6034;

    @OriginalMember(owner = "client!vaa", name = "jb", descriptor = "I")
    public static int field6035;

    @OriginalMember(owner = "client!vaa", name = "lb", descriptor = "I")
    public static int field6037;

    @OriginalMember(owner = "client!vaa", name = "mb", descriptor = "I")
    public static int field6038;

    @OriginalMember(owner = "client!vaa", name = "nb", descriptor = "I")
    public static int field6039;

    @OriginalMember(owner = "client!vaa", name = "ob", descriptor = "I")
    public static int field6040;

    @OriginalMember(owner = "client!vaa", name = "pb", descriptor = "I")
    public static int field6041;

    @OriginalMember(owner = "client!vaa", name = "rb", descriptor = "I")
    public static int field6043;

    @OriginalMember(owner = "client!vaa", name = "sb", descriptor = "I")
    public static int field6044;

    @OriginalMember(owner = "client!vaa", name = "tb", descriptor = "I")
    public static int field6045;

    @OriginalMember(owner = "client!vaa", name = "vb", descriptor = "I")
    public static int field6047;

    @OriginalMember(owner = "client!vaa", name = "wb", descriptor = "I")
    public static int field6048;

    @OriginalMember(owner = "client!vaa", name = "xb", descriptor = "I")
    public static int field6049;

    @OriginalMember(owner = "client!vaa", name = "yb", descriptor = "I")
    public static int field6050;

    @OriginalMember(owner = "client!vaa", name = "zb", descriptor = "I")
    public int field6051;

    @OriginalMember(owner = "client!vaa", name = "Cb", descriptor = "I")
    public static int field6054;

    @OriginalMember(owner = "client!vaa", name = "Db", descriptor = "I")
    public static int field6055;

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(II)Z")
    public final boolean method2433(int arg0, int arg1) {
        ++field6032;
        return arg0 == arg1 && !this.field6052 ? super.field890 : true;
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(I)V")
    public final void method2434(int arg0) {
        ++field6034;
        this.method2438(true, (byte) 125);
        super.field885 = false;
        super.field884 = false;
        super.field881 = false;
        super.field900 = false;
        super.field892 = super.field903 = 0;
        super.field887 = false;
        super.field893 = 0;
        super.field910 = false;
        super.field875 = super.field899 = 0;
        super.field908 = false;
        if (arg0 != 1496) {
            this.method2445((byte) 66);
        }
        super.field880 = false;
        super.field916 = true;
        super.field907 = false;
        super.field902 = false;
        class18.method97(0, 0);
        super.field882 = false;
        super.field876 = true;
        super.field913 = 0;
        this.method2447((byte) -111);
        this.method2448((byte) -68, 2);
        super.field911 = 2;
        class68.method553((byte) 113);
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(ZI)I")
    public final int method2435(boolean arg0, int arg1) {
        ++field6041;
        if (!arg0) {
            return 54;
        } else if (class43.method242(arg1, -1) && !class324.method1964(class340.field4947, (byte) 44)) {
            return ~class202.field2968 > -97 && class514.method2857(arg1, (byte) -19) && super.field895 == 0 ? 1 : super.field895;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!vaa", name = "b", descriptor = "(I)I")
    public final int method2436(int arg0) {
        ++field6055;
        boolean var2 = false;
        boolean var3 = false;
        boolean var4 = false;
        if (class503.field6878.field1084 && !class503.field6878.field1090) {
            if (!class79.field1095.startsWith("win")) {
                var3 = true;
            } else {
                var4 = true;
                var3 = true;
                if (!class79.field1087.startsWith("amd64") && !class79.field1087.startsWith("x86_64")) {
                    var2 = true;
                }
            }
        }
        if (this.field6042) {
            var4 = false;
        }
        if (this.field6053) {
            var2 = false;
        }
        if (this.field6036) {
            var3 = false;
        }
        if (!var2 && !var3 && !var4) {
            return this.method2442((byte) -103);
        } else {
            int var5 = -1;
            if (arg0 != -9917) {
                this.method2446(-46);
            }
            int var6 = -1;
            if (var2) {
                try {
                    var5 = class179.method1211(1000, 2, arg0 + 10003);
                } catch (Exception var16) {
                }
            }
            int var7 = -1;
            if (var4) {
                try {
                    var7 = class179.method1211(1000, 3, 124);
                    if (class429.field6020 == 3) {
                        class127 var8 = class630.field8790.method340();
                        long var9 = 281474976710655L & var8.field1760;
                        int var11 = var8.field1761;
                        if (var11 != 4318) {
                            if (var11 == 4098) {
                                var3 &= ~var9 <= -60129613780L;
                            }
                        } else {
                            var3 &= ~var9 <= -64425238955L;
                        }
                    }
                } catch (Exception var15) {
                }
            }
            if (var3) {
                try {
                    var6 = class179.method1211(1000, 1, arg0 ^ -9959);
                } catch (Exception var14) {
                }
            }
            if (var5 == -1 && var6 == -1 && var7 == -1) {
                return this.method2442((byte) -103);
            } else {
                int var12 = (int) ((float) var6 * 1.1F);
                int var13 = (int) ((float) var7 * 1.1F);
                if (~var13 > ~var5 && ~var12 > ~var5) {
                    return this.method2443(arg0 + 18697, var5);
                } else {
                    return var12 >= var13 ? this.method2450(var12, 1, (byte) -100) : this.method2450(var13, 3, (byte) -99);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vaa", name = "b", descriptor = "(BI)Z")
    public final boolean method2437(byte arg0, int arg1) {
        ++field6033;
        if (arg0 != -90) {
            return false;
        } else {
            return ~arg1 != -1 ? true : super.field890;
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(ZB)V")
    public final void method2438(boolean arg0, byte arg1) {
        int var3 = -127 % ((68 - arg1) / 39);
        super.field890 = arg0;
        ++field6054;
        if (class164.field2499 != null) {
            class164.field2499.method2015((byte) -96, !this.method2433(0, class429.field6020));
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(ILtt;)V")
    public final void method2439(int arg0, class79 arg1) {
        ++field6043;
        class124 var3 = null;
        try {
            class260 var4 = arg1.method628(14, "", true);
            while (var4.field3702 == 0) {
                class419.method2390(105, 1L);
            }
            if (~var4.field3702 == arg0) {
                var3 = (class124) var4.field3706;
                class96 var5 = new class96(class207.method1369((byte) -122));
                this.method547(78, var5);
                var3.method880(var5.field1316, 1, 0, var5.field1301);
            }
        } catch (Exception var7) {
        }
        try {
            if (var3 != null) {
                var3.method886(true);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!vaa", name = "c", descriptor = "(BI)I")
    public final int method2440(byte arg0, int arg1) {
        int var3 = -117 / ((arg0 - -37) / 58);
        ++field6045;
        if (this.field6046) {
            return 0;
        } else if (!this.method2433(0, arg1)) {
            return 1;
        } else {
            return super.field910 ? 2 : 1;
        }
    }

    @OriginalMember(owner = "client!vaa", name = "b", descriptor = "(Z)V")
    public final void method2441(boolean arg0) {
        this.method2438(true, (byte) 126);
        ++field6050;
        super.field885 = true;
        super.field884 = true;
        super.field907 = true;
        super.field875 = super.field899 = 0;
        super.field900 = true;
        super.field902 = true;
        super.field887 = true;
        super.field880 = true;
        super.field916 = true;
        super.field892 = super.field903 = 2;
        super.field910 = true;
        super.field881 = arg0;
        super.field893 = 1;
        super.field908 = true;
        if (~class202.field2968 >= -96) {
            class18.method97(0, 0);
        } else {
            class18.method97(0, 2);
        }
        super.field882 = false;
        super.field876 = true;
        super.field913 = 0;
        this.method2447((byte) 105);
        this.method2448((byte) -68, 0);
        super.field911 = 4;
        class68.method553((byte) 117);
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(B)I")
    private final int method2442(byte arg0) {
        ++field6049;
        byte var2;
        if (class202.field2968 < 96) {
            var2 = 1;
            this.method2445((byte) 47);
        } else {
            int var3 = class302.method1868(true);
            if (var3 <= 100) {
                this.method2441(true);
                var2 = 4;
            } else if (~var3 < -501) {
                if (var3 <= 1000) {
                    this.method2434(1496);
                    var2 = 2;
                } else {
                    var2 = 1;
                    this.method2445((byte) 47);
                }
            } else {
                this.method2446(1);
                var2 = 3;
            }
        }
        if (class429.field6020 != 0) {
            super.field898 = 0;
            class339.method2033(0, -28863);
        }
        if (arg0 >= -77) {
            this.method2443(36, -19);
        }
        this.method2439(-2, class503.field6878);
        return var2;
    }

    @OriginalMember(owner = "client!vaa", name = "b", descriptor = "(II)I")
    private final int method2443(int arg0, int arg1) {
        ++field6038;
        byte var3;
        if (arg1 > 12000) {
            this.method2441(true);
            var3 = 4;
        } else if (~arg1 < -5001) {
            this.method2446(1);
            var3 = 3;
        } else if (~arg1 < -2001) {
            var3 = 2;
            this.method2434(1496);
        } else {
            this.method2445((byte) 47);
            var3 = 1;
        }
        if (class429.field6020 != 2) {
            super.field898 = 2;
            class339.method2033(2, arg0 ^ -21235);
        }
        if (arg0 != 8780) {
            return 33;
        } else {
            this.method2439(arg0 ^ -8782, class503.field6878);
            return var3;
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IIZIII)V")
    public static final void method2444(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        ++field6048;
        if (arg5 != ~(!arg2 ? class274.field3872.field896 : class274.field3872.field909) && arg1 != 0 && class357.field5108 < 50 && arg4 != -1) {
            class604.field8394[class357.field5108++] = new class629((byte) (arg2 ? 3 : 2), arg4, arg1, arg3, arg0, 0);
        }
    }

    @OriginalMember(owner = "client!vaa", name = "b", descriptor = "(B)V")
    public final void method2445(byte arg0) {
        ++field6040;
        this.method2438(false, (byte) 122);
        if (arg0 != 47) {
            this.field6042 = false;
        }
        super.field910 = false;
        super.field902 = false;
        super.field884 = false;
        super.field881 = false;
        super.field908 = false;
        super.field880 = false;
        super.field892 = super.field903 = 0;
        super.field907 = false;
        super.field916 = false;
        super.field875 = super.field899 = 0;
        super.field885 = false;
        super.field900 = false;
        super.field893 = 0;
        super.field887 = false;
        class18.method97(0, 0);
        super.field876 = false;
        super.field882 = false;
        super.field913 = 0;
        this.method2447((byte) -26);
        this.method2448((byte) -68, 2);
        super.field911 = 1;
        class68.method553((byte) 67);
    }

    @OriginalMember(owner = "client!vaa", name = "f", descriptor = "(I)V")
    public final void method2446(int arg0) {
        this.method2438(true, (byte) 109);
        ++field6047;
        super.field887 = true;
        super.field907 = true;
        super.field902 = true;
        super.field875 = super.field899 = 0;
        super.field880 = true;
        super.field892 = super.field903 = arg0;
        super.field900 = true;
        super.field884 = false;
        super.field885 = true;
        super.field881 = true;
        super.field893 = 1;
        super.field916 = true;
        super.field910 = true;
        super.field908 = false;
        if (~class202.field2968 < -96) {
            class18.method97(0, 1);
        } else {
            class18.method97(0, 0);
        }
        super.field913 = 0;
        super.field882 = false;
        super.field876 = true;
        this.method2447((byte) -41);
        this.method2448((byte) -68, 1);
        super.field911 = 3;
        class68.method553((byte) 61);
    }

    @OriginalMember(owner = "client!vaa", name = "c", descriptor = "(B)V")
    private final void method2447(byte arg0) {
        int var2 = 34 / ((37 - arg0) / 56);
        if (~class398.field5528 >= -2) {
            super.field883 = 2;
        } else {
            super.field883 = 4;
        }
        ++field6044;
    }

    @OriginalMember(owner = "client!vaa", name = "d", descriptor = "(BI)V")
    public final void method2448(byte arg0, int arg1) {
        class43.field646 = true;
        class273.field3857 = null;
        if (arg0 != -68) {
            this.field6052 = true;
        }
        super.field895 = arg1;
        ++field6039;
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(Ljr;I)V")
    private final void method2449(class96 arg0, int arg1) {
        ++field6037;
        if (~(arg0.field1316.length + -arg0.field1301) <= -2) {
            int var3 = arg0.method718(88);
            if (~var3 <= -1 && ~var3 >= -23) {
                byte var4;
                if (var3 == 22) {
                    var4 = 45;
                } else if (~var3 != -22) {
                    if (var3 != 20) {
                        if (~var3 == -20) {
                            var4 = 42;
                        } else if (~var3 != -19) {
                            if (~var3 != -18) {
                                if (var3 == 16) {
                                    var4 = 38;
                                } else if (var3 != 15) {
                                    if (~var3 != -15) {
                                        if (var3 != 13) {
                                            if (var3 == 12) {
                                                var4 = 34;
                                            } else if (~var3 != -12) {
                                                if (var3 != 10) {
                                                    if (~var3 == -10) {
                                                        var4 = 31;
                                                    } else if (var3 == 8) {
                                                        var4 = 30;
                                                    } else if (var3 == 7) {
                                                        var4 = 29;
                                                    } else if (~var3 == -7) {
                                                        var4 = 28;
                                                    } else if (~var3 == -6) {
                                                        var4 = 28;
                                                    } else if (~var3 == -5) {
                                                        var4 = 24;
                                                    } else if (var3 != 3) {
                                                        if (~var3 == -3) {
                                                            var4 = 22;
                                                        } else if (~var3 != -2) {
                                                            var4 = 19;
                                                        } else {
                                                            var4 = 23;
                                                        }
                                                    } else {
                                                        var4 = 23;
                                                    }
                                                } else {
                                                    var4 = 32;
                                                }
                                            } else {
                                                var4 = 33;
                                            }
                                        } else {
                                            var4 = 35;
                                        }
                                    } else {
                                        var4 = 36;
                                    }
                                } else {
                                    var4 = 37;
                                }
                            } else {
                                var4 = 40;
                            }
                        } else {
                            var4 = 41;
                        }
                    } else {
                        var4 = 43;
                    }
                } else {
                    var4 = 44;
                }
                if (arg0.field1316.length - arg0.field1301 >= var4) {
                    super.field889 = arg0.method718(-69);
                    if (~super.field889 <= -2) {
                        if (~super.field889 < -5) {
                            super.field889 = 4;
                        }
                    } else {
                        super.field889 = 1;
                    }
                    this.method2438(~arg0.method718(-98) == -2, (byte) 110);
                    super.field910 = arg0.method718(116) == 1;
                    super.field916 = arg0.method718(-96) == 1;
                    super.field880 = arg0.method718(-109) == 1;
                    super.field893 = arg0.method718(122) != 1 ? 0 : 1;
                    super.field900 = ~arg0.method718(-88) == -2;
                    super.field887 = arg0.method718(-101) == 1;
                    super.field881 = arg0.method718(120) == 1;
                    super.field892 = arg0.method718(-72);
                    if (~super.field892 < -3) {
                        super.field892 = 2;
                    }
                    if (~var3 <= -18) {
                        super.field903 = arg0.method718(-72);
                    }
                    if (~var3 > -3) {
                        super.field907 = ~arg0.method718(-124) == -2;
                        arg0.method718(-121);
                    } else {
                        super.field907 = ~arg0.method718(-125) == -2;
                        if (~var3 <= -18) {
                            super.field908 = ~arg0.method718(82) == -2;
                        }
                    }
                    super.field884 = ~arg0.method718(-79) == -2;
                    super.field902 = arg0.method718(-126) == 1;
                    super.field875 = arg0.method718(-63);
                    if (super.field875 > 2) {
                        super.field875 = 2;
                    }
                    super.field899 = super.field875;
                    super.field879 = arg0.method718(-75) == 1;
                    super.field896 = arg0.method718(107);
                    if (super.field896 > 127) {
                        super.field896 = 127;
                    }
                    if (~var3 > -21) {
                        super.field909 = super.field896;
                    } else {
                        super.field909 = arg0.method718(-66);
                        if (~super.field909 < -128) {
                            super.field909 = 127;
                        }
                    }
                    super.field906 = arg0.method718(-105);
                    super.field905 = arg0.method718(78);
                    if (super.field905 > 127) {
                        super.field905 = 127;
                    }
                    if (~var3 <= -22) {
                        super.field877 = arg0.method718(-111);
                        if (~super.field877 < -128) {
                            super.field877 = 127;
                        }
                    } else {
                        super.field877 = super.field906;
                    }
                    if (var3 >= 1) {
                        super.field912 = arg0.method743((byte) -66);
                        super.field886 = arg0.method743((byte) -49);
                    }
                    if (~var3 <= -4 && ~var3 > -7) {
                        arg0.method718(-60);
                    }
                    if (var3 >= 4) {
                        int var5 = arg0.method718(-70);
                        if (var5 < 0 || var5 > 2) {
                            var5 = 0;
                        }
                        if (~class202.field2968 > -97) {
                            var5 = 0;
                        }
                        class18.method97(0, var5);
                    }
                    if (~var3 <= -6) {
                        super.field914 = arg0.method714(false);
                    }
                    int var6 = 0;
                    if (~var3 <= -7) {
                        super.field917 = var6 = arg0.method718(-61);
                    }
                    if (super.field917 != 1 && super.field917 != 2) {
                        super.field917 = 2;
                    }
                    if (~var3 <= -8) {
                        super.field872 = ~arg0.method718(-105) == -2;
                    }
                    if (arg1 > -66) {
                        this.method2440((byte) 100, -2);
                    }
                    if (~var3 <= -9) {
                        super.field874 = arg0.method718(-128) == 1;
                    }
                    if (~var3 <= -10) {
                        super.field913 = arg0.method718(-83);
                    }
                    if (super.field913 < 0 || super.field913 > class65.method523(class202.field2968, 510558785)) {
                        super.field913 = 0;
                    }
                    if (~var3 <= -11) {
                        super.field882 = arg0.method718(-108) != 0;
                    }
                    if (var3 >= 11) {
                        super.field894 = arg0.method718(-110) != 0;
                    }
                    if (var3 >= 12) {
                        super.field893 = arg0.method718(-108);
                    }
                    if (super.field893 < 0 || super.field893 > 2) {
                        super.field893 = 1;
                    }
                    if (~var3 <= -14) {
                        super.field876 = ~arg0.method718(-111) == -2;
                    }
                    if (~var3 > -15) {
                        if (var6 == 0) {
                            super.field898 = 2;
                        } else {
                            super.field898 = 1;
                        }
                    } else {
                        super.field898 = arg0.method718(-52);
                    }
                    if (super.field898 < 0 || ~super.field898 < -6) {
                        super.field898 = 2;
                    }
                    if (~var3 <= -16) {
                        super.field883 = arg0.method718(-62);
                        if (super.field883 < 0 || ~super.field883 < -5) {
                            super.field883 = class398.field5528 == 1 ? 2 : 4;
                        }
                    }
                    if (var3 >= 16) {
                        super.field885 = ~arg0.method718(124) == -2;
                        try {
                            if (~jagmisc.getTotalPhysicalMemory() >= -268435457L) {
                                super.field885 = false;
                            }
                        } catch (Throwable var7) {
                        }
                    }
                    if (var3 < 17 && ~super.field898 == -1) {
                        super.field898 = 2;
                    }
                    if (~var3 <= -19) {
                        super.field911 = arg0.method718(-53);
                        if (~super.field911 > -1 || ~super.field911 < -5) {
                            super.field911 = 0;
                        }
                    }
                    if (~var3 <= -20) {
                        super.field895 = arg0.method718(106);
                    } else if (~super.field911 != -2 && super.field911 != 2) {
                        if (super.field911 == 3) {
                            super.field895 = 1;
                        } else {
                            super.field895 = 0;
                        }
                    } else {
                        super.field895 = 2;
                    }
                    if (var3 >= 22) {
                        super.field878 = arg0.method718(103);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vaa", name = "b", descriptor = "(IIB)I")
    private final int method2450(int arg0, int arg1, byte arg2) {
        if (arg2 > -16) {
            return -48;
        } else {
            ++field6035;
            byte var4;
            if (~arg0 < -20001) {
                var4 = 4;
                this.method2441(true);
            } else if (~arg0 >= -10001) {
                if (~arg0 < -5001) {
                    this.method2434(1496);
                    var4 = 2;
                } else {
                    var4 = 1;
                    this.method2445((byte) 47);
                }
            } else {
                var4 = 3;
                this.method2446(1);
            }
            if (~class429.field6020 != ~arg1) {
                super.field898 = arg1;
                class339.method2033(arg1, -28863);
            }
            this.method2439(-2, class503.field6878);
            return var4;
        }
    }

    @OriginalMember(owner = "client!vaa", name = "<init>", descriptor = "(Ltt;)V")
    public class431(class79 arg0) {
        super.field889 = 3;
        super.field911 = 3;
        this.method2438(true, (byte) 115);
        super.field909 = 127;
        super.field900 = true;
        super.field908 = false;
        super.field899 = 0;
        super.field902 = true;
        super.field880 = true;
        super.field886 = 0;
        super.field887 = true;
        super.field875 = 0;
        super.field912 = 0;
        super.field881 = true;
        super.field907 = true;
        super.field906 = 127;
        super.field903 = 0;
        super.field896 = 127;
        super.field877 = 127;
        super.field892 = 2;
        super.field905 = 127;
        super.field884 = true;
        super.field916 = true;
        super.field879 = true;
        super.field893 = 1;
        super.field910 = true;
        if (~class202.field2968 > -97) {
            class18.method97(0, 0);
        } else {
            class18.method97(0, 2);
        }
        super.field876 = true;
        super.field898 = 2;
        super.field883 = class398.field5528 != 1 ? 4 : 2;
        super.field894 = true;
        super.field913 = 0;
        super.field895 = 0;
        super.field914 = 0;
        super.field882 = false;
        super.field874 = false;
        super.field872 = false;
        super.field917 = 2;
        class124 var2 = null;
        try {
            class260 var3 = arg0.method628(14, "", true);
            while (~var3.field3702 == -1) {
                class419.method2390(40, 1L);
            }
            if (var3.field3702 == 1) {
                var2 = (class124) var3.field3706;
                byte[] var4 = new byte[(int) var2.method882(-47)];
                int var6;
                for (int var5 = 0; var4.length > var5; var5 += var6) {
                    var6 = var2.method884((byte) -40, var5, var4.length + -var5, var4);
                    if (~var6 == 0) {
                        throw new IOException("EOF");
                    }
                }
                this.method2449(new class96(var4), -105);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method886(true);
            }
        } catch (Exception var7) {
        }
    }
}
