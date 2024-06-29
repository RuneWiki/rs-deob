import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class99 {

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "Loa;")
    public static class153 field1722 = new class153(32);

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "Ldc;")
    public static class37 field1724 = class185.method1233((byte) 86, "<col=80ff00>");

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "Ldc;")
    private static class37 field1727 = class185.method1233((byte) 86, "slide:");

    @OriginalMember(owner = "client!jb", name = "m", descriptor = "Ldc;")
    private static class37 field1729 = class185.method1233((byte) 86, "K");

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "Ldc;")
    public static class37 field1726 = field1727;

    @OriginalMember(owner = "client!jb", name = "p", descriptor = "Ldc;")
    public static class37 field1732 = field1727;

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "Ldc;")
    public static class37 field1725 = field1729;

    @OriginalMember(owner = "client!jb", name = "n", descriptor = "Ldc;")
    public static class37 field1730 = field1729;

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "Lsg;")
    public static class203 field1731 = new class203();

    @OriginalMember(owner = "client!jb", name = "r", descriptor = "Lbb;")
    public static class14 field1734 = new class14(16);

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
    public static int field1717;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
    public int field1718;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!jb", name = "q", descriptor = "I")
    public static int field1733;

    @OriginalMember(owner = "client!jb", name = "s", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "Ljc;")
    public static class100 field1723;

    @OriginalMember(owner = "client!jb", name = "t", descriptor = "Lmf;")
    public static class136 field1736;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "Lmi;")
    public class139 field1719;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "[I")
    public int[] field1721;

    @OriginalMember(owner = "client!jb", name = "l", descriptor = "[S")
    public static short[] field1728;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
    public static void method656(int arg0) {
        field1726 = null;
        field1722 = null;
        field1727 = null;
        field1736 = null;
        field1730 = null;
        field1723 = null;
        field1732 = null;
        field1734 = null;
        field1728 = null;
        field1731 = null;
        field1724 = null;
        field1729 = null;
        if (arg0 != 15380) {
            method658((byte) 60);
        }
        field1725 = null;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIII[[[B[I[I[I[I[IIB)V")
    public static final void method657(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[][][] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int arg12, byte arg13) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class238.field4372 * 128) {
            arg0 = class238.field4372 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= client.field682 * 128) {
            arg2 = client.field682 * 128 - 1;
        }
        class59.field1098 = class169.field3211[arg3];
        class38.field793 = class169.field3220[arg3];
        class124.field2215 = class169.field3211[arg4];
        class197.field3689 = class169.field3220[arg4];
        class39.field818 = arg0;
        class133.field2466 = arg1;
        class151.field2861 = arg2;
        class240.field4408 = arg0 / 128;
        class199.field3702 = arg2 / 128;
        class92.field1583 = arg5;
        class242.field4446 = class240.field4408 - class84.field1484;
        if (class242.field4446 < 0) {
            class242.field4446 = 0;
        }
        class18.field267 = class199.field3702 - class84.field1484;
        if (class18.field267 < 0) {
            class18.field267 = 0;
        }
        class41.field838 = class84.field1484 + class240.field4408;
        if (class41.field838 > class238.field4372) {
            class41.field838 = class238.field4372;
        }
        class180.field3360 = class84.field1484 + class199.field3702;
        if (class180.field3360 > client.field682) {
            class180.field3360 = client.field682;
        }
        short var14 = 3500;
        for (int var15 = 0; var15 < class84.field1484 + class84.field1484 + 2; var15++) {
            for (int var18 = 0; var18 < class84.field1484 + class84.field1484 + 2; var18++) {
                int var19 = (var15 - class84.field1484 << 7) - (class39.field818 & 0x7F);
                int var20 = (var18 - class84.field1484 << 7) - (class151.field2861 & 0x7F);
                int var21 = class240.field4408 + var15 - class84.field1484;
                int var22 = class199.field3702 + var18 - class84.field1484;
                if (var21 >= 0 && var22 >= 0 && var21 < class238.field4372 && var22 < client.field682) {
                    int var23;
                    if (class228.field4197 == null) {
                        var23 = class78.field1370[0][var21][var22] + 128 - class133.field2466;
                    } else {
                        var23 = class228.field4197[0][var21][var22] + 128 - class133.field2466;
                    }
                    int var24 = class78.field1370[3][var21][var22] - class133.field2466 - 1000;
                    class153.field2908[var15][var18] = class2.method26(var19, var24, var23, var20, var14);
                } else {
                    class153.field2908[var15][var18] = false;
                }
            }
        }
        for (int var16 = 0; var16 < class84.field1484 + class84.field1484 + 1; var16++) {
            for (int var17 = 0; var17 < class84.field1484 + class84.field1484 + 1; var17++) {
                class214.field4005[var16][var17] = class153.field2908[var16][var17] || class153.field2908[var16 + 1][var17] || class153.field2908[var16][var17 + 1] || class153.field2908[var16 + 1][var17 + 1];
            }
        }
        class82.field1452 = arg7;
        class176.field3333 = arg8;
        class151.field2865 = arg9;
        class199.field3704 = arg10;
        class183.field3391 = arg11;
        class72.method512();
        class167.method1125(arg0, arg1, arg2, arg6, arg12, arg13);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
    public static final void method658(byte arg0) {
        field1720++;
        try {
            if (class28.field467 == 0) {
                if (class180.field3352 != null) {
                    class180.field3352.method557(false);
                    class180.field3352 = null;
                }
                class30.field589 = 0;
                class51.field1037 = null;
                class28.field467 = 1;
                class41.field846 = false;
            }
            if (class28.field467 == 1) {
                if (class51.field1037 == null) {
                    class51.field1037 = class10.field130.method142(class227.field4180, class161.field3036, 47);
                }
                if (class51.field1037.field2461 == 2) {
                    throw new IOException();
                }
                if (class51.field1037.field2461 == 1) {
                    class180.field3352 = new class81((Socket) class51.field1037.field2465, class10.field130);
                    class28.field467 = 2;
                    class51.field1037 = null;
                }
            }
            if (class28.field467 == 2) {
                long var1 = class198.field3695 = class19.field325.method347(-101);
                class49.field970.field526 = 0;
                class49.field970.method214((byte) 107, 14);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class49.field970.method214((byte) 105, var3);
                class180.field3352.method558(30000, 2, 0, class49.field970.field502);
                class12.field167.field526 = 0;
                class28.field467 = 3;
            }
            if (class28.field467 == 3) {
                if (class68.field1250 != null) {
                    class68.field1250.method102(256);
                }
                if (class218.field4075 != null) {
                    class218.field4075.method102(256);
                }
                int var4 = class180.field3352.method552((byte) 10);
                if (class68.field1250 != null) {
                    class68.field1250.method102(256);
                }
                if (class218.field4075 != null) {
                    class218.field4075.method102(256);
                }
                if (var4 != 0) {
                    class184.method1231(true, var4);
                    return;
                }
                class12.field167.field526 = 0;
                class28.field467 = 4;
            }
            if (class28.field467 == 4) {
                if (class12.field167.field526 < 8) {
                    int var5 = class180.field3352.method554(arg0 ^ 0x41);
                    if (8 - class12.field167.field526 < var5) {
                        var5 = 8 - class12.field167.field526;
                    }
                    if (var5 > 0) {
                        class180.field3352.method555(var5, 106, class12.field167.field526, class12.field167.field502);
                        class12.field167.field526 += var5;
                    }
                }
                if (class12.field167.field526 == 8) {
                    class12.field167.field526 = 0;
                    class197.field3683 = class12.field167.method222(-116);
                    class28.field467 = 5;
                }
            }
            if (class28.field467 == 5) {
                class49.field970.field526 = 0;
                int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class197.field3683 >> 32), (int) class197.field3683 };
                class49.field970.method214((byte) 103, 10);
                class49.field970.method183(var6[0], -1137894376);
                class49.field970.method183(var6[1], -1137894376);
                class49.field970.method183(var6[2], -1137894376);
                class49.field970.method183(var6[3], arg0 ^ 0x43D2E3E7);
                class49.field970.method190(class19.field325.method347(arg0 ^ 0x6C), (byte) -126);
                class49.field970.method200(class19.field326, -113);
                class49.field970.method216(117, class74.field1314, class3.field16);
                class50.field998.field526 = 0;
                if (class109.field1891 == 40) {
                    class50.field998.method214((byte) 120, 18);
                } else {
                    class50.field998.method214((byte) 105, 16);
                }
                class50.field998.method214((byte) 107, class49.field970.field526 + class183.method1224(class44.field950, (byte) 38) + 137);
                class50.field998.method183(498, -1137894376);
                class50.field998.method214((byte) 109, class16.field259 ? 1 : 0);
                class28.method224((byte) -126, class50.field998);
                class50.field998.method200(class44.field950, -99);
                class50.field998.method183(class97.field1695, -1137894376);
                class50.field998.method183(class41.field858.field4369, -1137894376);
                class50.field998.method183(class56.field1076.field4369, -1137894376);
                class50.field998.method183(class159.field3005.field4369, -1137894376);
                class50.field998.method183(class203.field3756.field4369, -1137894376);
                class50.field998.method183(class69.field1254.field4369, -1137894376);
                class50.field998.method183(class185.field3416.field4369, -1137894376);
                class50.field998.method183(class68.field1236.field4369, -1137894376);
                class50.field998.method183(class149.field2821.field4369, arg0 - 1137894375);
                class50.field998.method183(class212.field3958.field4369, -1137894376);
                class50.field998.method183(class144.field2768.field4369, -1137894376);
                class50.field998.method183(class161.field3047.field4369, -1137894376);
                class50.field998.method183(class18.field298.field4369, -1137894376);
                class50.field998.method183(class149.field2824.field4369, -1137894376);
                class50.field998.method183(class211.field3947.field4369, -1137894376);
                class50.field998.method183(class153.field2892.field4369, arg0 ^ 0x43D2E3E7);
                class50.field998.method183(class242.field4443.field4369, -1137894376);
                class50.field998.method183(class200.field3727.field4369, -1137894376);
                class50.field998.method183(class68.field1249.field4369, -1137894376);
                class50.field998.method183(class9.field121.field4369, -1137894376);
                class50.field998.method183(class191.field3569.field4369, -1137894376);
                class50.field998.method183(class79.field1406.field4369, -1137894376);
                class50.field998.method183(class123.field2207.field4369, -1137894376);
                class50.field998.method183(class117.field2097.field4369, arg0 - 1137894375);
                class50.field998.method183(class56.field1075.field4369, -1137894376);
                class50.field998.method183(class157.field2977.field4369, -1137894376);
                class50.field998.method183(class14.field207.field4369, -1137894376);
                class50.field998.method192(0, 71, class49.field970.field502, class49.field970.field526);
                class180.field3352.method558(30000, class50.field998.field526, 0, class50.field998.field502);
                class49.field970.method1509((byte) -127, var6);
                for (int var7 = 0; var7 < 4; var7++) {
                    var6[var7] += 50;
                }
                class12.field167.method1509((byte) -99, var6);
                class28.field467 = 6;
            }
            if (class28.field467 == 6 && class180.field3352.method554(-55) > 0) {
                int var8 = class180.field3352.method552((byte) 10);
                if (var8 == 21 && class109.field1891 == 20) {
                    class28.field467 = 7;
                } else if (var8 == 2) {
                    class28.field467 = 9;
                } else if (var8 == 15 && class109.field1891 == 40) {
                    class176.method1182((byte) 41);
                    return;
                } else if (var8 == 23 && class44.field927 < 1) {
                    class44.field927++;
                    class28.field467 = 0;
                } else {
                    class184.method1231(true, var8);
                    return;
                }
            }
            if (class28.field467 == 7 && class180.field3352.method554(-73) > 0) {
                class108.field1879 = (class180.field3352.method552((byte) 10) + 3) * 60;
                class28.field467 = 8;
            }
            if (class28.field467 == 8) {
                class30.field589 = 0;
                class65.method478(class80.method548(new class37[] { class151.method1034((byte) -9, class108.field1879 / 60), class85.field1504 }, -49), class165.field3130, class122.field2172, (byte) 98);
                if (--class108.field1879 <= 0) {
                    class28.field467 = 0;
                }
                return;
            }
            if (class28.field467 == 9 && class180.field3352.method554(-76) >= 9) {
                class92.field1582 = class180.field3352.method552((byte) 10);
                class230.field4221 = class180.field3352.method552((byte) 10);
                class144.field2763 = class180.field3352.method552((byte) 10);
                class78.field1365 = class180.field3352.method552((byte) 10);
                class193.field3603 = class180.field3352.method552((byte) 10) == 1;
                class75.field1324 = class180.field3352.method552((byte) 10);
                class75.field1324 <<= 0x8;
                class75.field1324 += class180.field3352.method552((byte) 10);
                class69.field1257 = class180.field3352.method552((byte) 10);
                class180.field3352.method555(1, arg0 ^ 0xFFFFFF89, 0, class12.field167.field502);
                class12.field167.field526 = 0;
                class223.field4136 = class12.field167.method1508((byte) 47);
                class180.field3352.method555(2, 110, 0, class12.field167.field502);
                class12.field167.field526 = 0;
                class8.field100 = class12.field167.method230((byte) -116);
                class28.field467 = 10;
            }
            if (class28.field467 == 10) {
                if (class180.field3352.method554(arg0 ^ 0xC) >= class8.field100) {
                    class12.field167.field526 = 0;
                    class180.field3352.method555(class8.field100, 119, 0, class12.field167.field502);
                    class131.method916(0);
                    class151.field2859 = -1;
                    class195.method1297(false, -73);
                    class223.field4136 = -1;
                }
                return;
            }
            class30.field589++;
            if (class30.field589 > 2000) {
                if (class44.field927 < 1) {
                    if (class77.field1363 == class161.field3036) {
                        class161.field3036 = class73.field1298;
                    } else {
                        class161.field3036 = class77.field1363;
                    }
                    class44.field927++;
                    class28.field467 = 0;
                    return;
                }
                class184.method1231(true, -3);
                return;
            }
        } catch (IOException var9) {
            if (class44.field927 < 1) {
                class44.field927++;
                if (class77.field1363 == class161.field3036) {
                    class161.field3036 = class73.field1298;
                } else {
                    class161.field3036 = class77.field1363;
                }
                class28.field467 = 0;
                return;
            }
            class184.method1231(true, -2);
            return;
        }
        if (arg0 != -1) {
            method657(-86, 99, -20, 69, 10, 108, null, null, null, null, null, null, -39, (byte) -102);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Ldc;B)Z")
    public static final boolean method659(class37 arg0, byte arg1) {
        field1717++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class104.field1808; var2++) {
            if (arg0.method303(class80.field1420[var2], 40)) {
                return true;
            }
        }
        if (arg0.method303(class238.field4382.field2187, 40)) {
            return true;
        } else {
            if (arg1 != 56) {
                method657(-43, 104, -97, 92, 15, 5, null, null, null, null, null, null, 19, (byte) 113);
            }
            return false;
        }
    }
}
