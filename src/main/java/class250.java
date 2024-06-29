import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class250 implements Runnable {

    @OriginalMember(owner = "client!io", name = "o", descriptor = "Lbd;")
    private class37 field4089 = new class37();

    @OriginalMember(owner = "client!io", name = "n", descriptor = "Ljava/lang/Thread;")
    private Thread field4088 = new Thread(this);

    @OriginalMember(owner = "client!io", name = "j", descriptor = "[C")
    public static char[] field4084 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!io", name = "r", descriptor = "J")
    public static long field4092 = 0L;

    @OriginalMember(owner = "client!io", name = "h", descriptor = "I")
    public static int field4082 = 0;

    @OriginalMember(owner = "client!io", name = "s", descriptor = "Ljava/lang/String;")
    public static String field4093 = "Loaded config";

    @OriginalMember(owner = "client!io", name = "a", descriptor = "I")
    public static int field4075;

    @OriginalMember(owner = "client!io", name = "b", descriptor = "I")
    public static int field4076;

    @OriginalMember(owner = "client!io", name = "c", descriptor = "I")
    public static int field4077;

    @OriginalMember(owner = "client!io", name = "d", descriptor = "I")
    public static int field4078;

    @OriginalMember(owner = "client!io", name = "e", descriptor = "I")
    public static int field4079;

    @OriginalMember(owner = "client!io", name = "f", descriptor = "I")
    public static int field4080;

    @OriginalMember(owner = "client!io", name = "g", descriptor = "I")
    public static int field4081;

    @OriginalMember(owner = "client!io", name = "i", descriptor = "I")
    public static int field4083;

    @OriginalMember(owner = "client!io", name = "k", descriptor = "I")
    public static int field4085;

    @OriginalMember(owner = "client!io", name = "l", descriptor = "I")
    public static int field4086;

    @OriginalMember(owner = "client!io", name = "m", descriptor = "I")
    public static int field4087;

    @OriginalMember(owner = "client!io", name = "p", descriptor = "I")
    public static int field4090;

    @OriginalMember(owner = "client!io", name = "q", descriptor = "I")
    public static int field4091;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Lfr;Le;Z)I", line = 5)
    public static final int method1726(class235 arg0, class312 arg1, boolean arg2) {
        if (!arg2) {
            return 123;
        }
        field4083++;
        if (arg0.field3931 != -1) {
            return arg0.field3931;
        }
        if (arg0.field3921 != -1) {
            class266 var3 = class35.field434.method989(arg1.method711() ? arg0.field3921 : arg0.field3930, (byte) 71);
            if (!var3.field4269) {
                return var3.field4284;
            }
        }
        return arg0.field3935;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(I)V", line = 31)
    public final void method1727(int arg0) {
        field4085++;
        if (this.field4088 == null) {
            return;
        }
        this.method1728(new class161(), 0);
        try {
            this.field4088.join();
        } catch (InterruptedException var2) {
        }
        if (arg0 != -19432) {
            this.method1728((class161) null, 108);
        }
        this.field4088 = null;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Ltf;I)V", line = 51)
    private final void method1728(class161 arg0, int arg1) {
        class37 var3 = this.field4089;
        synchronized (this.field4089) {
            this.field4089.method245(500, arg0);
            this.field4089.notify();
        }
        if (arg1 != 0) {
            this.method1731((String) null, 61);
        }
        field4075++;
    }

    @OriginalMember(owner = "client!io", name = "run", descriptor = "()V", line = 65)
    public final void run() {
        field4091++;
        while (true) {
            class37 var1 = this.field4089;
            class112 var3;
            synchronized (this.field4089) {
                class161 var2;
                for (var2 = this.field4089.method248(-24951); var2 == null; var2 = this.field4089.method248(-24951)) {
                    try {
                        this.field4089.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class112)) {
                    return;
                }
                var3 = (class112) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field1548).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field1552 = var5;
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IIIIIBI)V", line = 104)
    public static final void method1729(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field4090++;
        int var7 = class21.method153(arg2, (byte) -97, class396.field5925, class99.field1378);
        if (arg5 != -51) {
            field4077 = -113;
        }
        int var8 = class21.method153(arg1, (byte) -78, class396.field5925, class99.field1378);
        int var9 = class21.method153(arg6, (byte) -93, class185.field3005, class406.field6033);
        int var10 = class21.method153(arg3, (byte) -98, class185.field3005, class406.field6033);
        int var11 = class21.method153(arg0 + arg2, (byte) -102, class396.field5925, class99.field1378);
        int var12 = class21.method153(arg1 - arg0, (byte) -108, class396.field5925, class99.field1378);
        for (int var13 = var7; var13 < var11; var13++) {
            class256.method1769(var10, class277.field4414[var13], (byte) 84, arg4, var9);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class256.method1769(var10, class277.field4414[var14], (byte) 110, arg4, var9);
        }
        int var15 = class21.method153(arg6 + arg0, (byte) -93, class185.field3005, class406.field6033);
        int var16 = class21.method153(arg3 - arg0, (byte) -125, class185.field3005, class406.field6033);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class277.field4414[var17];
            class256.method1769(var15, var18, (byte) 57, arg4, var9);
            class256.method1769(var10, var18, (byte) 49, arg4, var16);
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Z)V", line = 156)
    public static void method1730(boolean arg0) {
        field4093 = null;
        field4084 = null;
        if (arg0) {
            method1729(-107, 125, 67, -15, -81, (byte) 38, 37);
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Ljava/lang/String;I)Lsa;", line = 167)
    public final class112 method1731(String arg0, int arg1) {
        field4076++;
        if (this.field4088 == null) {
            throw new IllegalStateException("");
        }
        int var3 = 95 / ((16 - arg1) / 60);
        if (arg0 == null) {
            throw new IllegalArgumentException("");
        }
        class112 var4 = new class112(arg0);
        this.method1728(var4, 0);
        return var4;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(ZLfn;ILe;IZIIIIIII)V", line = 189)
    public static final void method1732(boolean arg0, class72 arg1, int arg2, class312 arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        if (arg11 != 1) {
            method1736(122, (String) null);
        }
        field4087++;
        if (!class117.method852(true) && !class396.method2495(arg2, (byte) 59, class81.field1007, arg10, arg4)) {
            return;
        }
        if (class51.field632 > arg10) {
            class51.field632 = arg10;
        }
        class127 var13 = class137.method1003(arg9, -30796);
        if (class128.field2035 == 1 && var13.field1948) {
            return;
        }
        int var14;
        int var15;
        if (arg8 == 1 || arg8 == 3) {
            var14 = var13.field1944;
            var15 = var13.field2014;
        } else {
            var14 = var13.field2014;
            var15 = var13.field1944;
        }
        int var16;
        int var17;
        if (arg2 + var14 > class80.field1003) {
            var16 = arg2;
            var17 = arg2 + 1;
        } else {
            var16 = (var14 >> 1) + arg2;
            var17 = (var14 + 1 >> 1) + arg2;
        }
        int var18;
        int var19;
        if (arg4 + var15 <= class380.field5751) {
            var18 = arg4 + (var15 >> 1);
            var19 = (var15 + 1 >> 1) + arg4;
        } else {
            var19 = arg4 + 1;
            var18 = arg4;
        }
        class129 var20 = class275.field4396[arg12];
        int var21 = var20.method779(var16, var18) + (var20.method779(var17, var18) + var20.method779(var16, var19)) + var20.method779(var17, var19) >> 2;
        int var22 = (arg2 << 7) + (var14 << 6);
        int var23 = (arg4 << 7) + (var15 << 6);
        boolean var24 = arg5 && !arg0 && var13.field2012;
        if (var13.method940(2)) {
            class224.method1609(arg2, (class219) null, arg10, arg8, (class50) null, var13, 8500, arg4);
        }
        boolean var25 = arg6 == -1 && var13.field2022 == -1 && var13.field1973 == null && var13.field1984 == null && !var13.field2024;
        if (class381.field5767 && var13.field1975 != 1) {
            return;
        }
        if (arg7 == 22) {
            if (class341.field5267 || var13.field2021 != 0 || var13.field2027 == 1 || var13.field1992) {
                class191 var26;
                if (var25) {
                    class432 var27 = new class432(arg3, var13, arg12, var22, var21, var23, arg0, arg8, var24);
                    var26 = var27;
                    if (var27.method190((byte) -128)) {
                        var27.method194(arg3, -88);
                    }
                } else {
                    var26 = new class212(arg3, var13, arg8, arg10, arg12, var22, var21, var23, arg0, arg6);
                }
                class137.method1002(arg10, arg2, arg4, var26);
                if (var13.field2027 == 1 && arg1 != null) {
                    arg1.method452(arg11 + 262143, arg4, arg2);
                }
            }
        } else if (arg7 == 10 || arg7 == 11) {
            class165 var65 = null;
            class57 var67;
            int var68;
            if (var25) {
                class165 var66 = new class165(arg3, var13, arg10, arg12, var22, var21, var23, arg0, arg2, arg2 + var14 - 1, arg4, var15 + arg4 - 1, arg7, arg8, var24);
                var65 = var66;
                var67 = var66;
                var68 = var66.method1161((byte) -22);
            } else {
                var67 = new class285(arg3, var13, arg7, arg8, arg10, arg12, var22, var21, var23, arg0, arg2, arg2 + var14 - 1, arg4, arg4 + var15 - 1, arg6);
                var68 = 15;
            }
            if (class239.method1689(var67, false)) {
                if (var65 != null && var65.method190((byte) -127)) {
                    var65.method194(arg3, -98);
                }
                if (var13.field2007 && arg5) {
                    if (var68 > 30) {
                        var68 = 30;
                    }
                    for (int var69 = 0; var69 <= var14; var69++) {
                        for (int var70 = 0; var70 <= var15; var70++) {
                            var20.method786(arg2 + var69, arg4 + var70, var68);
                        }
                    }
                }
            }
            if (var13.field2027 != 0 && arg1 != null) {
                arg1.method459(var13.field1993, 77, arg4, var14, arg2, var15, !var13.field1989);
            }
        } else if (!(arg7 < 12 || arg7 > 17) || !(arg7 < 18 || arg7 > 21)) {
            class57 var28;
            if (var25) {
                class165 var29 = new class165(arg3, var13, arg10, arg12, var22, var21, var23, arg0, arg2, arg2 + var14 - 1, arg4, arg4 + var15 - 1, arg7, arg8, var24);
                var28 = var29;
                if (var29.method190((byte) -127)) {
                    var29.method194(arg3, arg11 ^ 0x6A);
                }
            } else {
                var28 = new class285(arg3, var13, arg7, arg8, arg10, arg12, var22, var21, var23, arg0, arg2, arg2 + var14 - 1, arg4, arg4 + var15 - 1, arg6);
            }
            class239.method1689(var28, false);
            if (arg5 && !arg0 && arg7 >= 12 && arg7 <= 17 && arg7 != 13 && arg10 > 0 && var13.field1975 != 0) {
                class369.field5616[arg10][arg2][arg4] = (byte) class35.method227(class369.field5616[arg10][arg2][arg4], 4);
            }
            if (var13.field2027 != 0 && arg1 != null) {
                arg1.method459(var13.field1993, 109, arg4, var14, arg2, var15, !var13.field1989);
            }
        } else if (arg7 == 0) {
            class89 var30;
            if (var25) {
                class29 var31 = new class29(arg3, var13, arg12, var22, var21, var23, arg0, arg7, arg8, var24);
                var30 = var31;
                if (var31.method190((byte) -128)) {
                    var31.method194(arg3, 98);
                }
            } else {
                var30 = new class181(arg3, var13, 0, arg8, arg10, arg12, var22, var21, var23, arg0, arg6);
            }
            class272.method1843(arg10, arg2, arg4, var30, (class89) null);
            if (arg5) {
                if (arg8 == 0) {
                    if (var13.field2007) {
                        var20.method786(arg2, arg4, 50);
                        var20.method786(arg2, arg4 + 1, 50);
                    }
                    if (var13.field1975 == 1 && !arg0) {
                        class369.field5616[arg10][arg2][arg4] = (byte) class35.method227(class369.field5616[arg10][arg2][arg4], 1);
                    }
                } else if (arg8 == 1) {
                    if (var13.field2007) {
                        var20.method786(arg2, arg4 + 1, 50);
                        var20.method786(arg2 + 1, arg4 + 1, 50);
                    }
                    if (var13.field1975 == 1 && !arg0) {
                        class369.field5616[arg10][arg2][arg4 + 1] = (byte) class35.method227(class369.field5616[arg10][arg2][arg4 + 1], 2);
                    }
                } else if (arg8 == 2) {
                    if (var13.field2007) {
                        var20.method786(arg2 + 1, arg4, 50);
                        var20.method786(arg2 + 1, arg4 - -1, 50);
                    }
                    if (var13.field1975 == 1 && !arg0) {
                        class369.field5616[arg10][arg2 + 1][arg4] = (byte) class35.method227(class369.field5616[arg10][arg2 + 1][arg4], 1);
                    }
                } else if (arg8 == 3) {
                    if (var13.field2007) {
                        var20.method786(arg2, arg4, 50);
                        var20.method786(arg2 + 1, arg4, 50);
                    }
                    if (var13.field1975 == 1 && !arg0) {
                        class369.field5616[arg10][arg2][arg4] = (byte) class35.method227(class369.field5616[arg10][arg2][arg4], 2);
                    }
                }
            }
            if (var13.field2027 != 0 && arg1 != null) {
                arg1.method447((byte) -86, arg8, arg7, !var13.field1989, arg2, var13.field1993, arg4);
            }
            if (var13.field2008 != 16) {
                class447.method2787(arg10, arg2, arg4, var13.field2008);
            }
        } else if (arg7 == 1) {
            class89 var32;
            if (var25) {
                class29 var33 = new class29(arg3, var13, arg12, var22, var21, var23, arg0, arg7, arg8, var24);
                if (var33.method190((byte) -128)) {
                    var33.method194(arg3, 96);
                }
                var32 = var33;
            } else {
                var32 = new class181(arg3, var13, 1, arg8, arg10, arg12, var22, var21, var23, arg0, arg6);
            }
            class272.method1843(arg10, arg2, arg4, var32, (class89) null);
            if (var13.field2007 && arg5) {
                if (arg8 == 0) {
                    var20.method786(arg2, arg4 + 1, 50);
                } else if (arg8 == 1) {
                    var20.method786(arg2 + 1, arg4 + 1, 50);
                } else if (arg8 == 2) {
                    var20.method786(arg2 + 1, arg4, 50);
                } else if (arg8 == 3) {
                    var20.method786(arg2, arg4, 50);
                }
            }
            if (var13.field2027 != 0 && arg1 != null) {
                arg1.method447((byte) -126, arg8, arg7, !var13.field1989, arg2, var13.field1993, arg4);
            }
        } else if (arg7 == 2) {
            int var34 = arg8 + 1 & 0x3;
            class89 var37;
            class89 var38;
            if (var25) {
                class29 var35 = new class29(arg3, var13, arg12, var22, var21, var23, arg0, arg7, arg8 + 4, var24);
                class29 var36 = new class29(arg3, var13, arg12, var22, var21, var23, arg0, arg7, var34, var24);
                if (var35.method190((byte) -128)) {
                    var35.method194(arg3, -91);
                }
                var37 = var36;
                if (var36.method190((byte) -127)) {
                    var36.method194(arg3, arg11 + 48);
                }
                var38 = var35;
            } else {
                var38 = new class181(arg3, var13, 2, arg8 + 4, arg10, arg12, var22, var21, var23, arg0, arg6);
                var37 = new class181(arg3, var13, 2, var34, arg10, arg12, var22, var21, var23, arg0, arg6);
            }
            class272.method1843(arg10, arg2, arg4, var38, var37);
            if (var13.field1975 == 1 && arg5 && !arg0) {
                if (arg8 == 0) {
                    class369.field5616[arg10][arg2][arg4] = (byte) class35.method227(class369.field5616[arg10][arg2][arg4], 1);
                    class369.field5616[arg10][arg2][arg4 + 1] = (byte) class35.method227(class369.field5616[arg10][arg2][arg4 + 1], 2);
                } else if (arg8 == 1) {
                    class369.field5616[arg10][arg2][arg4 + 1] = (byte) class35.method227(class369.field5616[arg10][arg2][arg4 + 1], 2);
                    class369.field5616[arg10][arg2 + 1][arg4] = (byte) class35.method227(class369.field5616[arg10][arg2 + 1][arg4], 1);
                } else if (arg8 == 2) {
                    class369.field5616[arg10][arg2 + 1][arg4] = (byte) class35.method227(class369.field5616[arg10][arg2 + 1][arg4], 1);
                    class369.field5616[arg10][arg2][arg4] = (byte) class35.method227(class369.field5616[arg10][arg2][arg4], 2);
                } else if (arg8 == 3) {
                    class369.field5616[arg10][arg2][arg4] = (byte) class35.method227(class369.field5616[arg10][arg2][arg4], 2);
                    class369.field5616[arg10][arg2][arg4] = (byte) class35.method227(class369.field5616[arg10][arg2][arg4], 1);
                }
            }
            if (var13.field2027 != 0 && arg1 != null) {
                arg1.method447((byte) -96, arg8, arg7, !var13.field1989, arg2, var13.field1993, arg4);
            }
            if (var13.field2008 != 16) {
                class447.method2787(arg10, arg2, arg4, var13.field2008);
            }
        } else if (arg7 == 3) {
            class89 var39;
            if (var25) {
                class29 var40 = new class29(arg3, var13, arg12, var22, var21, var23, arg0, arg7, arg8, var24);
                var39 = var40;
                if (var40.method190((byte) -127)) {
                    var40.method194(arg3, 80);
                }
            } else {
                var39 = new class181(arg3, var13, 3, arg8, arg10, arg12, var22, var21, var23, arg0, arg6);
            }
            class272.method1843(arg10, arg2, arg4, var39, (class89) null);
            if (var13.field2007 && arg5) {
                if (arg8 == 0) {
                    var20.method786(arg2, arg4 + 1, 50);
                } else if (arg8 == 1) {
                    var20.method786(arg2 + 1, arg4 + 1, 50);
                } else if (arg8 == 2) {
                    var20.method786(arg2 + 1, arg4, 50);
                } else if (arg8 == 3) {
                    var20.method786(arg2, arg4, 50);
                }
            }
            if (var13.field2027 != 0 && arg1 != null) {
                arg1.method447((byte) -85, arg8, arg7, !var13.field1989, arg2, var13.field1993, arg4);
            }
        } else if (arg7 == 9) {
            class57 var41;
            if (var25) {
                class165 var42 = new class165(arg3, var13, arg10, arg12, var22, var21, var23, arg0, arg2, arg2, arg4, arg4, arg7, arg8, var24);
                var41 = var42;
                if (var42.method190((byte) -128)) {
                    var42.method194(arg3, 46);
                }
            } else {
                var41 = new class285(arg3, var13, arg7, arg8, arg10, arg12, var22, var21, var23, arg0, arg2, arg2 + var14 - 1, arg4, arg4 + var15 - 1, arg6);
            }
            class239.method1689(var41, false);
            if (var13.field2027 != 0 && arg1 != null) {
                arg1.method459(var13.field1993, -93, arg4, var14, arg2, var15, !var13.field1989);
            }
            if (var13.field2008 != 16) {
                class447.method2787(arg10, arg2, arg4, var13.field2008);
            }
        } else if (arg7 == 4) {
            class303 var44;
            if (var25) {
                class282 var43 = new class282(arg3, var13, arg12, var22, var21, var23, arg0, 0, 0, 0, arg7, arg8);
                var44 = var43;
                if (var43.method190((byte) -127)) {
                    var43.method194(arg3, -96);
                }
            } else {
                var44 = new class284(arg3, var13, arg7, arg8, arg10, arg12, var22, var21, var23, arg0, 0, 0, 0, arg6);
            }
            class231.method1641(arg10, arg2, arg4, var44, (class303) null);
        } else if (arg7 == 5) {
            int var45 = 16;
            class149 var46 = (class149) class139.method1016(arg10, arg2, arg4);
            if (var46 != null) {
                var45 = class137.method1003(var46.method197(true), -30796).field2008;
            }
            class303 var48;
            if (var25) {
                class282 var47 = new class282(arg3, var13, arg12, var22, var21, var23, arg0, 0, class441.field6461[arg8] * var45, class362.field5529[arg8] * var45, arg7, arg8);
                if (var47.method190((byte) -127)) {
                    var47.method194(arg3, 109);
                }
                var48 = var47;
            } else {
                var48 = new class284(arg3, var13, arg7, arg8, arg10, arg12, var22, var21, var23, arg0, 0, class441.field6461[arg8] * var45, class362.field5529[arg8] * var45, arg6);
            }
            class231.method1641(arg10, arg2, arg4, var48, (class303) null);
        } else if (arg7 == 6) {
            int var49 = 8;
            class149 var50 = (class149) class139.method1016(arg10, arg2, arg4);
            if (var50 != null) {
                var49 = class137.method1003(var50.method197(true), -30796).field2008 / 2;
            }
            class303 var52;
            if (var25) {
                class282 var51 = new class282(arg3, var13, arg12, var22, var21, var23, arg0, arg8, class441.field6461[arg8] * var49, class362.field5529[arg8] * var49, arg7, arg8 + 4);
                if (var51.method190((byte) -127)) {
                    var51.method194(arg3, 68);
                }
                var52 = var51;
            } else {
                var52 = new class284(arg3, var13, arg7, arg8 + 4, arg10, arg12, var22, var21, var23, arg0, arg8, class405.field6031[arg8] * var49, class226.field3761[arg8] * var49, arg6);
            }
            class231.method1641(arg10, arg2, arg4, var52, (class303) null);
        } else if (arg7 == 7) {
            int var53 = arg8 + 2 & 0x3;
            class303 var55;
            if (var25) {
                class282 var54 = new class282(arg3, var13, arg12, var22, var21, var23, arg0, var53, 0, 0, arg7, var53 + 4);
                if (var54.method190((byte) -127)) {
                    var54.method194(arg3, -88);
                }
                var55 = var54;
            } else {
                var55 = new class284(arg3, var13, arg7, var53 + 4, arg10, arg12, var22, var21, var23, arg0, var53, 0, 0, arg6);
            }
            class231.method1641(arg10, arg2, arg4, var55, (class303) null);
        } else if (arg7 == 8) {
            int var56 = arg8 + 2 & 0x3;
            int var57 = 8;
            class149 var58 = (class149) class139.method1016(arg10, arg2, arg4);
            if (var58 != null) {
                var57 = class137.method1003(var58.method197(true), arg11 ^ 0xFFFF87B5).field2008 / 2;
            }
            class303 var60;
            class303 var62;
            if (var25) {
                class282 var63 = new class282(arg3, var13, arg12, var22, var21, var23, arg0, arg8, class405.field6031[arg8] * var57, class226.field3761[arg8] * var57, arg7, arg8 + 4);
                class282 var64 = new class282(arg3, var13, arg12, var22, var21, var23, arg0, arg8, 0, 0, arg7, var56 + 4);
                if (var63.method190((byte) -127)) {
                    var63.method194(arg3, arg11 - 86);
                }
                if (var64.method190((byte) -128)) {
                    var64.method194(arg3, 122);
                }
                var60 = var63;
                var62 = var64;
            } else {
                class284 var59 = new class284(arg3, var13, arg7, arg8 + 4, arg10, arg12, var22, var21, var23, arg0, arg8, class405.field6031[arg8] * var57, class226.field3761[arg8] * var57, arg6);
                var60 = var59;
                class284 var61 = new class284(arg3, var13, arg7, var56 + 4, arg10, arg12, var22, var21, var23, arg0, arg8, 0, 0, arg6);
                var62 = var61;
            }
            class231.method1641(arg10, arg2, arg4, var60, var62);
        }
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(I)V", line = 807)
    public static final void method1733(int arg0) {
        if (arg0 != -21496) {
            field4084 = null;
        }
        if (class199.field3211 > 0) {
            int var1 = 0;
            for (int var2 = 0; var2 < class314.field4939.length; var2++) {
                if (class314.field4939[var2].startsWith("--> ")) {
                    var1++;
                    if (class199.field3211 == var1) {
                        class213.field3412 = class314.field4939[var2].substring(4);
                        break;
                    }
                }
            }
        } else {
            class213.field3412 = "";
        }
        field4079++;
    }

    @OriginalMember(owner = "client!io", name = "c", descriptor = "(I)V", line = 849)
    public static final void method1734(int arg0) {
        field4086++;
        for (int var1 = 0; var1 < class301.field4773; var1++) {
            class406 var2 = class386.method2449(true, var1);
            if (var2 != null && var2.field6038 == 0) {
                class391.field5869[var1] = 0;
                class403.field6014[var1] = 0;
            }
        }
        if (arg0 != 2) {
            method1733(118);
        }
        class58.field746 = new class256(128);
    }

    @OriginalMember(owner = "client!io", name = "d", descriptor = "(I)V", line = 877)
    public static final void method1735(int arg0) {
        field4078++;
        if (arg0 != 1) {
            field4077 = -4;
        }
        class180.field2937.method1764(92);
        class8.field105.method357((byte) 85);
        class58.field758.method357((byte) 41);
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(ILjava/lang/String;)J", line = 892)
    public static final long method1736(int arg0, String arg1) {
        field4081++;
        int var2 = arg1.length();
        long var3 = 0L;
        int var5 = 0;
        if (arg0 != 128) {
            field4084 = null;
        }
        while (var2 > var5) {
            var3 = (long) arg1.charAt(var5) + (var3 << 5) - var3;
            var5++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(BI)V", line = 918)
    public static final void method1737(byte arg0, int arg1) {
        class220.field3625 = arg1;
        field4080++;
        class390.field5860 = null;
        class277.field4419 = -1;
        class263.field4241 = 0;
        class150.field2350 = false;
        class417.field6178 = 1;
        if (arg0 != 18) {
            method1732(false, (class72) null, -110, (class312) null, 56, true, 73, 5, 68, -16, -1, 60, -50);
        }
        class358.field5471 = -1;
    }

    @OriginalMember(owner = "client!io", name = "<init>", descriptor = "()V", line = 948)
    public class250() {
        this.field4088.setDaemon(true);
        this.field4088.start();
    }
}
