import java.awt.Container;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Rectangle;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class116 {

    @OriginalMember(owner = "client!client", name = "X", descriptor = "Z")
    public static boolean field935 = false;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    private static int field930 = 0;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "[I")
    public static int[] field943 = new int[14];

    @OriginalMember(owner = "client!client", name = "O", descriptor = "I")
    public static int field926;

    @OriginalMember(owner = "client!client", name = "P", descriptor = "I")
    public static int field927;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    public static int field928;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field929;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field932;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field933;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field934;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field939;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field942;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field944;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "Z")
    public static boolean field945;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljb;)Ljb;", line = 6)
    public static final class499 method447(class499 arg0) {
        int var1 = method450(arg0).method2393(-336834766);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class211.method1457(arg0.field7322, 6687);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)V", line = 25)
    private final void method448(int arg0, boolean arg1) {
        class322.field4975 = 0;
        class514.field7617.field5532++;
        class42.field643 = null;
        field937++;
        if (!arg1) {
            class332.field5138 = null;
            class514.field7617.field5530 = arg0;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Ljb;IIIIIIIII)V", line = 42)
    public static final void method449(class499[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        for (int var10 = 0; var10 < arg0.length; var10++) {
            class499 var11 = arg0[var10];
            if (var11 != null && var11.field7322 == arg1) {
                int var12 = var11.field7326 + arg6;
                int var13 = var11.field7337 + arg7;
                int var14;
                int var15;
                int var16;
                int var17;
                if (var11.field7355 == 2) {
                    var14 = arg2;
                    var15 = arg3;
                    var16 = arg4;
                    var17 = arg5;
                } else {
                    int var18 = var11.field7348 + var12;
                    int var19 = var11.field7386 + var13;
                    if (var11.field7355 == 9) {
                        var18++;
                        var19++;
                    }
                    var14 = var12 > arg2 ? var12 : arg2;
                    var15 = var13 > arg3 ? var13 : arg3;
                    var16 = var18 < arg4 ? var18 : arg4;
                    var17 = var19 < arg5 ? var19 : arg5;
                }
                if (var11.field7355 == 0 || var11.field7309 || method450(var11).field5891 != 0 || class439.field6543 == var11 || class144.field2076 == var11.field7369) {
                    if (!method452(var11)) {
                        if (class362.field5615 == var11) {
                            class111.field1560 = true;
                            class106.field1506 = var12;
                            class101.field1453 = var13;
                        }
                        if (var11.field7285 || var14 < var16 && var15 < var17) {
                            if (var11.field7372 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                for (class199 var20 = (class199) class296.field4384.method1970(64); var20 != null; var20 = (class199) class296.field4384.method1960(24)) {
                                    if (var20.field2804) {
                                        var20.method2785((byte) -120);
                                        var20.field2817.field7324 = false;
                                    }
                                }
                                if (class102.field1457 == 0) {
                                    class362.field5615 = null;
                                    class439.field6543 = null;
                                }
                                class515.field7638 = 0;
                                class508.field7560 = false;
                                class277.field3840 = false;
                                if (!class455.field6680) {
                                    class80.method519(-50);
                                }
                            }
                            boolean var21;
                            if (class346.field5419.method812(false) >= var14 && class346.field5419.method811(false) >= var15 && class346.field5419.method812(false) < var16 && class346.field5419.method811(false) < var17) {
                                var21 = true;
                            } else {
                                var21 = false;
                            }
                            if (!class500.field7455 && var21) {
                                if (var11.field7417 >= 0) {
                                    class479.field7008 = var11.field7417;
                                } else if (var11.field7372) {
                                    class479.field7008 = -1;
                                }
                            }
                            if (!class455.field6680 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                class170.method1198(arg9 - var13, -64, arg8 - var12, var11);
                            }
                            boolean var22 = false;
                            if (class346.field5419.method802(true) && var21) {
                                var22 = true;
                            }
                            boolean var23 = false;
                            class414 var24 = (class414) class94.field1369.method1970(64);
                            if (var24 != null && var24.method715((byte) 85) == 0 && var24.method717(18591) >= var14 && var24.method712(35) >= var15 && var24.method717(18591) < var16 && var24.method712(66) < var17) {
                                var23 = true;
                            }
                            if (var11.field7382 != null) {
                                for (int var25 = 0; var25 < var11.field7382.length; var25++) {
                                    if (class382.field5821.method705((byte) 43, var11.field7382[var25])) {
                                        if (var11.field7378 == null || class405.field6116 >= var11.field7378[var25]) {
                                            byte var26 = var11.field7305[var25];
                                            if (var26 == 0 || ((var26 & 0x8) == 0 || !class382.field5821.method705((byte) 43, 86) && !class382.field5821.method705((byte) 43, 82) && !class382.field5821.method705((byte) 43, 81)) && ((var26 & 0x2) == 0 || class382.field5821.method705((byte) 43, 86)) && ((var26 & 0x1) == 0 || class382.field5821.method705((byte) 43, 82)) && ((var26 & 0x4) == 0 || class382.field5821.method705((byte) 43, 81))) {
                                                if (var25 < 10) {
                                                    class455.method2742(-1, var25 + 1, var11.field7312, (byte) 35, "");
                                                } else if (var25 == 10) {
                                                    class457.method2749(-1);
                                                    class388 var27 = method450(var11);
                                                    class234.method1587(var27.method2394(true), var27.field5894, 123, var11);
                                                    class266.field3714 = class263.method1694(var11, 103);
                                                    if (class266.field3714 == null) {
                                                        class266.field3714 = "Null";
                                                    }
                                                    class509.field7572 = var11.field7307 + "<col=ffffff>";
                                                }
                                                int var28 = var11.field7360[var25];
                                                if (var11.field7378 == null) {
                                                    var11.field7378 = new int[var11.field7382.length];
                                                }
                                                if (var28 == 0) {
                                                    var11.field7378[var25] = Integer.MAX_VALUE;
                                                } else {
                                                    var11.field7378[var25] = class405.field6116 + var28;
                                                }
                                            }
                                        }
                                    } else if (var11.field7378 != null) {
                                        var11.field7378[var25] = 0;
                                    }
                                }
                            }
                            if (var23) {
                                class154.method1004(false, var24.method712(78) - var13, var24.method717(18591) - var12, var11);
                            }
                            if (class362.field5615 != null && class362.field5615 != var11 && var21 && method450(var11).method2391((byte) -103)) {
                                class58.field775 = var11;
                            }
                            if (class439.field6543 == var11) {
                                class181.field2577 = true;
                                class441.field6562 = var12;
                                class354.field5495 = var13;
                            }
                            if (var11.field7309 || var11.field7369 != 0) {
                                if (var21 && class338.field5349 != 0 && var11.field7395 != null) {
                                    class199 var29 = new class199();
                                    var29.field2804 = true;
                                    var29.field2817 = var11;
                                    var29.field2814 = class338.field5349;
                                    var29.field2813 = var11.field7395;
                                    class296.field4384.method1958(var29, 0);
                                }
                                if (class362.field5615 != null || class455.field6680 || class101.field1449 != var11.field7369 && class515.field7638 > 0) {
                                    var23 = false;
                                    var22 = false;
                                    var21 = false;
                                }
                                if (var11.field7369 != 0) {
                                    if (class301.field4445 == var11.field7369 || class127.field1802 == var11.field7369) {
                                        class38.field603 = var11;
                                        if (class429.field6384 != null) {
                                            class429.field6384.method3118(var11.field7386, (byte) -99, class337.field5242);
                                        }
                                        if (class301.field4445 == var11.field7369) {
                                            if (!class455.field6680 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                                class467.method2786((byte) -101, arg8, arg9, class337.field5242);
                                                for (class231 var30 = (class231) class27.field446.method2358((byte) 61); var30 != null; var30 = (class231) class27.field446.method2363(31844)) {
                                                    if (arg8 >= var30.field3284 && arg8 < var30.field3290 && arg9 >= var30.field3291 && arg9 < var30.field3286) {
                                                        class80.method519(-77);
                                                        class326.method2109(var30.field3288, 0);
                                                    }
                                                }
                                            }
                                            class54.method369(var12, var13, var11, -10281);
                                            continue;
                                        }
                                    }
                                    if (class144.field2076 == var11.field7369) {
                                        if (var11.method2975((byte) -127, class337.field5242) == null || class93.field1352 != 0 && class93.field1352 != 3 || class455.field6680 || arg8 < var14 || arg9 < var15 || arg8 >= var16 || arg9 >= var17) {
                                            continue;
                                        }
                                        int var31 = arg8 - var12;
                                        int var32 = arg9 - var13;
                                        int var33 = var11.field7367[var32];
                                        if (var31 < var33 || var31 > var11.field7397[var32] + var33) {
                                            continue;
                                        }
                                        int var34 = var31 - var11.field7348 / 2;
                                        int var35 = var32 - var11.field7386 / 2;
                                        int var36;
                                        if (class432.field6409 == 4) {
                                            var36 = (int) class482.field7022 & 0x3FFF;
                                        } else {
                                            var36 = (int) class482.field7022 + class384.field5871 & 0x3FFF;
                                        }
                                        int var37 = class525.field7760[var36];
                                        int var38 = class525.field7763[var36];
                                        if (class432.field6409 != 4) {
                                            var37 = (class235.field3345 + 256) * var37 >> 8;
                                            var38 = (class235.field3345 + 256) * var38 >> 8;
                                        }
                                        int var39 = var34 * var38 + var35 * var37 >> 15;
                                        int var40 = var35 * var38 - var34 * var37 >> 15;
                                        int var41;
                                        int var42;
                                        if (class432.field6409 == 4) {
                                            var41 = (class274.field3815 >> 7) + (var39 >> 2);
                                            var42 = (class209.field2963 >> 7) - (var40 >> 2);
                                        } else {
                                            int var43 = (class339.field5365.method2091(-15245) - 1) * 64;
                                            var41 = (class339.field5365.field2217 - var43 >> 7) + (var39 >> 2);
                                            var42 = (class339.field5365.field2215 - var43 >> 7) - (var40 >> 2);
                                        }
                                        if (class500.field7455 && (class303.field4468 & 0x40) != 0) {
                                            class499 var44 = class458.method2757(class186.field2616, false, class126.field1798);
                                            if (var44 == null) {
                                                class457.method2749(-1);
                                            } else {
                                                class294.method1898(-1, var41, 1L, false, class261.field3635, true, class266.field3714, " ->", var42, var11.field7310, 58);
                                            }
                                            continue;
                                        }
                                        if (class393.field5983 == class259.field3610) {
                                            class294.method1898(-1, var41, 1L, false, -1, true, class25.field410.method2335((byte) -100, class288.field4292), "", var42, -1, 20);
                                        }
                                        class294.method1898(-1, var41, 1L, false, class456.field6697, true, class454.field6673, "", var42, -1, 48);
                                        continue;
                                    }
                                    if (class101.field1449 == var11.field7369) {
                                        class217.field3009 = var11;
                                        if (var21) {
                                            class508.field7560 = true;
                                        }
                                        if (var23) {
                                            int var45 = (int) ((double) (var24.method717(18591) - var12 - var11.field7348 / 2) * 2.0D / (double) class135.field1961);
                                            int var46 = (int) (-((double) (var24.method712(82) - var13 - var11.field7386 / 2) * 2.0D / (double) class135.field1961));
                                            int var47 = class277.field3839 + var45 + class135.field1969;
                                            int var48 = class501.field7487 + var46 + class135.field1974;
                                            class316 var49 = class229.method1572(-16777216);
                                            if (var49 == null) {
                                                continue;
                                            }
                                            int[] var50 = new int[3];
                                            var49.method2050(var47, var48, var50, (byte) -69);
                                            if (var50 != null) {
                                                if (class382.field5821.method705((byte) 43, 82) && class528.field7809 > 0) {
                                                    class523.method3105(var50[0], var50[2], var50[1], (byte) 107);
                                                    continue;
                                                }
                                                class277.field3840 = true;
                                                class320.field4914 = var50[0];
                                                class142.field2057 = var50[1];
                                                class410.field6173 = var50[2];
                                            }
                                            class515.field7638 = 1;
                                            class154.field2255 = false;
                                            class103.field1475 = class346.field5419.method812(false);
                                            class460.field6750 = class346.field5419.method811(false);
                                            continue;
                                        }
                                        if (var22 && class515.field7638 > 0) {
                                            if (class515.field7638 == 1 && (class103.field1475 != class346.field5419.method812(false) || class460.field6750 != class346.field5419.method811(false))) {
                                                class528.field7793 = class277.field3839;
                                                class512.field7607 = class501.field7487;
                                                class515.field7638 = 2;
                                            }
                                            if (class515.field7638 == 2) {
                                                class154.field2255 = true;
                                                class412.method2506(class528.field7793 + (int) ((double) (class103.field1475 - class346.field5419.method812(false)) * 2.0D / (double) class135.field1966), (byte) -123);
                                                class202.method1410(class512.field7607 - (int) ((double) (class460.field6750 - class346.field5419.method811(false)) * 2.0D / (double) class135.field1966), (byte) 37);
                                            }
                                            continue;
                                        }
                                        if (class515.field7638 > 0 && !class154.field2255) {
                                            if ((class299.field4423 == 1 || class115.method744((byte) -83)) && class12.field201 > 2) {
                                                class492.method2919(0, class460.field6750, class103.field1475);
                                            } else if (class106.method711(-86)) {
                                                class492.method2919(0, class460.field6750, class103.field1475);
                                            }
                                        }
                                        class515.field7638 = 0;
                                        continue;
                                    }
                                    if (class104.field1499 == var11.field7369) {
                                        if (var22) {
                                            class1.method2(class346.field5419.method811(false) - var13, 123, var11.field7386, var11.field7348, class346.field5419.method812(false) - var12);
                                        }
                                        continue;
                                    }
                                    if (class211.field2973 == var11.field7369) {
                                        class517.method3079(var13, (byte) -111, var11, var12);
                                        continue;
                                    }
                                }
                                if (!var11.field7416 && var23) {
                                    var11.field7416 = true;
                                    if (var11.field7415 != null) {
                                        class199 var51 = new class199();
                                        var51.field2804 = true;
                                        var51.field2817 = var11;
                                        var51.field2803 = var24.method717(18591) - var12;
                                        var51.field2814 = var24.method712(25) - var13;
                                        var51.field2813 = var11.field7415;
                                        class296.field4384.method1958(var51, 0);
                                    }
                                }
                                if (var11.field7416 && var22 && var11.field7354 != null) {
                                    class199 var52 = new class199();
                                    var52.field2804 = true;
                                    var52.field2817 = var11;
                                    var52.field2803 = class346.field5419.method812(false) - var12;
                                    var52.field2814 = class346.field5419.method811(false) - var13;
                                    var52.field2813 = var11.field7354;
                                    class296.field4384.method1958(var52, 0);
                                }
                                if (var11.field7416 && !var22) {
                                    var11.field7416 = false;
                                    if (var11.field7426 != null) {
                                        class199 var53 = new class199();
                                        var53.field2804 = true;
                                        var53.field2817 = var11;
                                        var53.field2803 = class346.field5419.method812(false) - var12;
                                        var53.field2814 = class346.field5419.method811(false) - var13;
                                        var53.field2813 = var11.field7426;
                                        class494.field7220.method1958(var53, 0);
                                    }
                                }
                                if (var22 && var11.field7409 != null) {
                                    class199 var54 = new class199();
                                    var54.field2804 = true;
                                    var54.field2817 = var11;
                                    var54.field2803 = class346.field5419.method812(false) - var12;
                                    var54.field2814 = class346.field5419.method811(false) - var13;
                                    var54.field2813 = var11.field7409;
                                    class296.field4384.method1958(var54, 0);
                                }
                                if (!var11.field7324 && var21) {
                                    var11.field7324 = true;
                                    if (var11.field7388 != null) {
                                        class199 var55 = new class199();
                                        var55.field2804 = true;
                                        var55.field2817 = var11;
                                        var55.field2803 = class346.field5419.method812(false) - var12;
                                        var55.field2814 = class346.field5419.method811(false) - var13;
                                        var55.field2813 = var11.field7388;
                                        class296.field4384.method1958(var55, 0);
                                    }
                                }
                                if (var11.field7324 && var21 && var11.field7286 != null) {
                                    class199 var56 = new class199();
                                    var56.field2804 = true;
                                    var56.field2817 = var11;
                                    var56.field2803 = class346.field5419.method812(false) - var12;
                                    var56.field2814 = class346.field5419.method811(false) - var13;
                                    var56.field2813 = var11.field7286;
                                    class296.field4384.method1958(var56, 0);
                                }
                                if (var11.field7324 && !var21) {
                                    var11.field7324 = false;
                                    if (var11.field7323 != null) {
                                        class199 var57 = new class199();
                                        var57.field2804 = true;
                                        var57.field2817 = var11;
                                        var57.field2803 = class346.field5419.method812(false) - var12;
                                        var57.field2814 = class346.field5419.method811(false) - var13;
                                        var57.field2813 = var11.field7323;
                                        class494.field7220.method1958(var57, 0);
                                    }
                                }
                                if (var11.field7411 != null) {
                                    class199 var58 = new class199();
                                    var58.field2817 = var11;
                                    var58.field2813 = var11.field7411;
                                    class62.field886.method1958(var58, 0);
                                }
                                if (var11.field7301 != null && class456.field6700 > var11.field7361) {
                                    if (var11.field7422 == null || class456.field6700 - var11.field7361 > 32) {
                                        class199 var63 = new class199();
                                        var63.field2817 = var11;
                                        var63.field2813 = var11.field7301;
                                        class296.field4384.method1958(var63, 0);
                                    } else {
                                        label691: for (int var59 = var11.field7361; var59 < class456.field6700; var59++) {
                                            int var60 = class433.field6426[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var11.field7422.length; var61++) {
                                                if (var11.field7422[var61] == var60) {
                                                    class199 var62 = new class199();
                                                    var62.field2817 = var11;
                                                    var62.field2813 = var11.field7301;
                                                    class296.field4384.method1958(var62, 0);
                                                    break label691;
                                                }
                                            }
                                        }
                                    }
                                    var11.field7361 = class456.field6700;
                                }
                                if (var11.field7345 != null && class189.field2655 > var11.field7398) {
                                    if (var11.field7376 == null || class189.field2655 - var11.field7398 > 32) {
                                        class199 var68 = new class199();
                                        var68.field2817 = var11;
                                        var68.field2813 = var11.field7345;
                                        class296.field4384.method1958(var68, 0);
                                    } else {
                                        label667: for (int var64 = var11.field7398; var64 < class189.field2655; var64++) {
                                            int var65 = class457.field6703[var64 & 0x1F];
                                            for (int var66 = 0; var66 < var11.field7376.length; var66++) {
                                                if (var11.field7376[var66] == var65) {
                                                    class199 var67 = new class199();
                                                    var67.field2817 = var11;
                                                    var67.field2813 = var11.field7345;
                                                    class296.field4384.method1958(var67, 0);
                                                    break label667;
                                                }
                                            }
                                        }
                                    }
                                    var11.field7398 = class189.field2655;
                                }
                                if (var11.field7394 != null && class217.field3012 > var11.field7377) {
                                    if (var11.field7442 == null || class217.field3012 - var11.field7377 > 32) {
                                        class199 var73 = new class199();
                                        var73.field2817 = var11;
                                        var73.field2813 = var11.field7394;
                                        class296.field4384.method1958(var73, 0);
                                    } else {
                                        label643: for (int var69 = var11.field7377; var69 < class217.field3012; var69++) {
                                            int var70 = class33.field525[var69 & 0x1F];
                                            for (int var71 = 0; var71 < var11.field7442.length; var71++) {
                                                if (var11.field7442[var71] == var70) {
                                                    class199 var72 = new class199();
                                                    var72.field2817 = var11;
                                                    var72.field2813 = var11.field7394;
                                                    class296.field4384.method1958(var72, 0);
                                                    break label643;
                                                }
                                            }
                                        }
                                    }
                                    var11.field7377 = class217.field3012;
                                }
                                if (var11.field7338 != null && class456.field6698 > var11.field7402) {
                                    if (var11.field7353 == null || class456.field6698 - var11.field7402 > 32) {
                                        class199 var78 = new class199();
                                        var78.field2817 = var11;
                                        var78.field2813 = var11.field7338;
                                        class296.field4384.method1958(var78, 0);
                                    } else {
                                        label619: for (int var74 = var11.field7402; var74 < class456.field6698; var74++) {
                                            int var75 = class152.field2182[var74 & 0x1F];
                                            for (int var76 = 0; var76 < var11.field7353.length; var76++) {
                                                if (var11.field7353[var76] == var75) {
                                                    class199 var77 = new class199();
                                                    var77.field2817 = var11;
                                                    var77.field2813 = var11.field7338;
                                                    class296.field4384.method1958(var77, 0);
                                                    break label619;
                                                }
                                            }
                                        }
                                    }
                                    var11.field7402 = class456.field6698;
                                }
                                if (var11.field7379 != null && class232.field3302 > var11.field7435) {
                                    if (var11.field7447 == null || class232.field3302 - var11.field7435 > 32) {
                                        class199 var83 = new class199();
                                        var83.field2817 = var11;
                                        var83.field2813 = var11.field7379;
                                        class296.field4384.method1958(var83, 0);
                                    } else {
                                        label595: for (int var79 = var11.field7435; var79 < class232.field3302; var79++) {
                                            int var80 = class100.field1444[var79 & 0x1F];
                                            for (int var81 = 0; var81 < var11.field7447.length; var81++) {
                                                if (var11.field7447[var81] == var80) {
                                                    class199 var82 = new class199();
                                                    var82.field2817 = var11;
                                                    var82.field2813 = var11.field7379;
                                                    class296.field4384.method1958(var82, 0);
                                                    break label595;
                                                }
                                            }
                                        }
                                    }
                                    var11.field7435 = class232.field3302;
                                }
                                if (class274.field3818 > var11.field7352 && var11.field7328 != null) {
                                    class199 var84 = new class199();
                                    var84.field2817 = var11;
                                    var84.field2813 = var11.field7328;
                                    class296.field4384.method1958(var84, 0);
                                }
                                if (class475.field6921 > var11.field7352 && var11.field7373 != null) {
                                    class199 var85 = new class199();
                                    var85.field2817 = var11;
                                    var85.field2813 = var11.field7373;
                                    class296.field4384.method1958(var85, 0);
                                }
                                if (class512.field7600 > var11.field7352 && var11.field7318 != null) {
                                    class199 var86 = new class199();
                                    var86.field2817 = var11;
                                    var86.field2813 = var11.field7318;
                                    class296.field4384.method1958(var86, 0);
                                }
                                if (class23.field354 > var11.field7352 && var11.field7292 != null) {
                                    class199 var87 = new class199();
                                    var87.field2817 = var11;
                                    var87.field2813 = var11.field7292;
                                    class296.field4384.method1958(var87, 0);
                                }
                                if (class111.field1561 > var11.field7352 && var11.field7291 != null) {
                                    class199 var88 = new class199();
                                    var88.field2817 = var11;
                                    var88.field2813 = var11.field7291;
                                    class296.field4384.method1958(var88, 0);
                                }
                                var11.field7352 = class485.field7086;
                                if (var11.field7344 != null) {
                                    for (int var89 = 0; var89 < class12.field199; var89++) {
                                        class199 var90 = new class199();
                                        var90.field2817 = var11;
                                        var90.field2815 = class453.field6651[var89].method1946(4);
                                        var90.field2808 = class453.field6651[var89].method1945((byte) 125);
                                        var90.field2813 = var11.field7344;
                                        class296.field4384.method1958(var90, 0);
                                    }
                                }
                                if (class412.field6196 && var11.field7366 != null) {
                                    class199 var91 = new class199();
                                    var91.field2817 = var11;
                                    var91.field2813 = var11.field7366;
                                    class296.field4384.method1958(var91, 0);
                                }
                            }
                            if (var11.field7355 == 5 && var11.field7429 != -1) {
                                var11.method2983(-224, class296.field4391, class496.field7258).method3118(var11.field7386, (byte) -99, class337.field5242);
                            }
                            class82.method531(var11, -113);
                            if (var11.field7355 == 0) {
                                method449(arg0, var11.field7312, var14, var15, var16, var17, var12 - var11.field7418, var13 - var11.field7389, arg8, arg9);
                                if (var11.field7423 != null) {
                                    method449(var11.field7423, var11.field7312, var14, var15, var16, var17, var12 - var11.field7418, var13 - var11.field7389, arg8, arg9);
                                }
                                class407 var92 = (class407) class27.field449.method943((long) var11.field7312, -1);
                                if (var92 != null) {
                                    if (class393.field5983 == class23.field352 && var92.field6156 == 0 && !class455.field6680 && var21 && !class197.field2788) {
                                        class80.method519(-14);
                                    }
                                    class153.method999(arg8, var12, var13, var92.field6155, arg9, var17, var16, var15, 0, var14);
                                }
                            }
                        }
                    }
                } else if (var14 < var16 && var15 < var17) {
                    class82.method531(var11, -55);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljb;)Lqj;", line = 946)
    public static final class388 method450(class499 arg0) {
        class388 var1 = (class388) class415.field6218.method943(((long) arg0.field7312 << 32) + (long) arg0.field7304, -1);
        return var1 == null ? arg0.field7432 : var1;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V", line = 950)
    public final void method451(byte arg0) {
        method465(-26432);
        field931++;
        class490.method2914((byte) -109);
        class375.method2337(-1);
        class320.method2073(24041);
        class335.method2149((byte) 97);
        class86.method555(false);
        class467.method2787(false);
        class233.method1579(0);
        class141.method941(822);
        class116.method751(true);
        class466.method2781(arg0 - 115);
        class266.method1705(25821);
        class63.method430((byte) -100);
        class331.method2137(104);
        class23.method180((byte) -104);
        class496.method2948(1);
        class271.method1729(arg0 - 29644);
        class187.method1317(127);
        class169.method1188((byte) 124);
        class306.method1969((byte) -105);
        class66.method438(13);
        class501.method2992(0);
        class359.method2266((byte) 90);
        class430.method2581(-12189);
        class205.method1429((byte) -1);
        class438.method2635((byte) -121);
        class87.method567((byte) 95);
        class445.method2683(0);
        class100.method674(124);
        class181.method1298(119);
        class94.method656(100);
        class508.method3030((byte) 113);
        class250.method1639(true);
        class463.method2771(-24876);
        class313.method2033(-70);
        class52.method359(arg0 - 22332);
        class41.method327(arg0 ^ 0xFFFFFFF9);
        class174.method1212((byte) -116);
        class398.method2442((byte) -113);
        class518.method3085(11);
        class37.method267((byte) -68);
        class300.method1937(64);
        class57.method391(0);
        class259.method1678(-5);
        class13.method110(30);
        class441.method2663((byte) 71);
        class299.method1928(1);
        class408.method2491(-102);
        class93.method648(19334);
        class12.method103((byte) -59);
        class326.method2111(500);
        class514.method3059(-102);
        class194.method1373(84);
        class321.method2083((byte) 93);
        class492.method2922(false);
        class140.method936(-78);
        class117.method762((byte) -48);
        class167.method1175(-94);
        class316.method2052((byte) 115);
        class338.method2186((byte) 75);
        class380.method2355(89);
        class499.method2969(17448);
        class168.method1181(-5909);
        class322.method2092((byte) -55);
        class48.method349((byte) 56);
        class69.method473(false);
        class143.method954(true);
        class91.method585(-128);
        class337.method2178((byte) 60);
        class33.method253(1);
        class420.method2530((byte) 0);
        class512.method3049((byte) -105);
        class251.method1641(arg0 - 13656);
        class407.method2482((byte) 67);
        class388.method2395((byte) 54);
        class449.method2712(false);
        class189.method1325(arg0 - 106);
        class59.method399((byte) 92);
        class76.method500(-257);
        class389.method2399(0);
        class40.method320((byte) -78);
        class144.method957(true);
        class166.method1169((byte) -124);
        class403.method2473(arg0 + 23452);
        class245.method1628(false);
        class103.method695(0);
        class336.method2172((byte) 88);
        class395.method2431(-119);
        class472.method2835(arg0 ^ 0xFFFFFFE3);
        class270.method1722((byte) -63);
        class113.method738(26767);
        class201.method1397((byte) 18);
        class529.method3125(true);
        class242.method1615((byte) 79);
        class344.method2202((byte) -36);
        class130.method833(162);
        class192.method1345(102);
        class454.method2731(22050);
        class206.method1433(true);
        class329.method2126(12);
        class61.method406(0);
        class164.method1160(-120);
        class225.method1534(-96);
        class235.method1598(-121);
        class504.method3015(14149);
        class491.method2917((byte) 70);
        class15.method129(arg0 ^ 0x7);
        class195.method1376(30);
        class4.method44(31477);
        class258.method1672(42);
        class471.method2829(-126);
        class30.method223(arg0 + 31852);
        class215.method1467(0);
        class172.method1207(arg0 - 5267);
        class64.method431(-1);
        class460.method2761(1);
        class211.method1456(true);
        class396.method2438((byte) -112);
        class153.method1003(124);
        class507.method3025(true);
        class134.method868();
        class406.method2479(0);
        class219.method1484(-1);
        class42.method331(arg0 - 3);
        class158.method1029((byte) -50);
        class7.method68(arg0 ^ 0x76);
        class415.method2517((byte) 75);
        class128.method816(arg0 ^ 0xFFFFFFF2);
        class291.method1883();
        class135.method884();
        class202.method1408(true);
        class5.method48((byte) -84);
        class171.method1201();
        class8.method75(false);
        class24.method199(arg0 - 115);
        class208.method1440(22145);
        class357.method2258(true);
        class226.method1554(-116);
        class348.method2213((byte) -111);
        class263.method1695(108);
        class19.method145(arg0 ^ 0x40);
        class109.method722(54);
        class334.method2146(1);
        class95.method664((byte) 60);
        class362.method2289(arg0 - 242);
        class31.method224(-6);
        class243.method1620(0);
        class437.method2613((byte) 96);
        class498.method2966(7);
        class494.method2937((byte) -103);
        class163.method1158((byte) 2);
        class372.method2327(-1);
        class145.method964(1);
        class513.method3054((byte) -108);
        class379.method2352(false);
        class341.method2195((byte) -105);
        class493.method2930((byte) -105);
        class260.method1682(false);
        class340.method2192(arg0 + 10);
        class54.method371(arg0 ^ 0xFFFFFFE6);
        class97.method667(125);
        class267.method1709((byte) 89);
        class207.method1435(arg0 + 23280);
        class184.method1304();
        class170.method1195(1876);
        class253.method1651((byte) -124);
        class452.method2723(-1485);
        class369.method2303((byte) 116);
        class487.method2902((byte) -63);
        class349.method2218(-87);
        class111.method731(-44);
        class29.method222(14);
        class137.method914((byte) 71);
        class165.method1164((byte) 126);
        class495.method2944(-97);
        class199.method1393((byte) 77);
        class432.method2584(3);
        class479.method2873(arg0 ^ 0x12);
        class367.method2299(4);
        class138.method915((byte) -78);
        class383.method2375(4);
        class523.method3101(arg0 ^ 0xFFFFD019);
        class70.method481(99);
        class255.method1661((byte) -26);
        class115.method743(true);
        class442.method2669((byte) -1);
        class229.method1570((byte) -128);
        class500.method2988(-116);
        class290.method1873(255);
        class410.method2492((byte) -54);
        class394.method2424((byte) -39);
        class465.method2778(317769057);
        class314.method2040((byte) -77);
        class269.method1716(arg0 ^ 0xE5730DBA);
        class119.method765(-3371);
        class485.method2898((byte) -27);
        class285.method1854((byte) -16);
        class519.method3090((byte) -30);
        class423.method2551((byte) -19);
        class368.method2301(17);
        class278.method1759(false);
        class102.method688(arg0 - 30012);
        class231.method1575(4199);
        class223.method1510(-176577049);
        class384.method2381(0);
        class428.method2565((byte) 122);
        class275.method1749(30956);
        class440.method2661((byte) 72);
        class481.method2875((byte) 122);
        class459.method2759((byte) -71);
        class26.method205(28971);
        class433.method2595((byte) 116);
        class249.method1636(1540776839);
        class425.method2557(arg0 ^ 0xF2);
        class353.method2229(arg0 ^ 0x2);
        class217.method1473((byte) -122);
        class98.method670((byte) -114);
        class318.method2068();
        class525.method3111(95);
        class439.method2658(arg0 ^ 0x71);
        class304.method1952(81);
        class152.method993(arg0 - 208);
        class162.method1155(-1);
        class274.method1743(arg0 - 114);
        class480.method2874(5);
        class185.method1314(4194303);
        class325.method2105(arg0 - 224);
        class350.method2223((byte) -125);
        class323.method2100(27523);
        class448.method2709();
        class319.method2070((byte) -116);
        class483.method2885(13323);
        class351.method2224(arg0 - 100);
        class75.method498(9863);
        class286.method1859(-124);
        class399.method2454(-1187959186);
        class6.method52(-24805);
        class458.method2758(0);
        class77.method511((byte) 82);
        class392.method2413(20);
        class193.method1360((byte) -126);
        class74.method489(true);
        class426.method2561(50);
        class296.method1907((byte) 122);
        class136.method904();
        class435.method2607(97);
        class443.method2673(100);
        class360.method2267();
        class147.method973();
        class221.method1501();
        class527.method3117(arg0 - 206);
        class51.method352(arg0 - 114);
        class139.method929();
        class429.method2569(-28742);
        class413.method2510(arg0 - 106);
        class180.method1294(115);
        class35.method260((byte) 127);
        class386.method2387(arg0 - 185);
        class366.method2296(-68);
        class402.method2465();
        class411.method2499((byte) 72);
        class149.method982((byte) 69);
        class81.method523((byte) 83);
        class453.method2725(43);
        class484.method2892((byte) 106);
        class58.method395((byte) 95);
        class148.method978((byte) 33);
        class127.method813(-86);
        class530.method3129(false);
        class78.method514(arg0 - 11146);
        class382.method2372(-5001);
        class84.method540((byte) 108);
        class110.method726(-1);
        if (arg0 != 114) {
            return;
        }
        class197.method1380((byte) 91);
        class390.method2403((byte) -125);
        class213.method1459(-1);
        class88.method574((byte) -75);
        class282.method1826(16384);
        class517.method3080((byte) -119);
        class10.method85(117);
        class209.method1450(arg0 - 5);
        class120.method770(true);
        class83.method532(true);
        class317.method2061(-1);
        class14.method116(105);
        class393.method2415(-100);
        class339.method2191(-28838);
        class346.method2209((byte) -122);
        class308.method1978((byte) -81);
        class509.method3036(10040);
        class237.method1604(arg0 ^ 0x19);
        class330.method2132();
        class424.method2556((byte) -67);
        class310.method1993(arg0 - 42);
        class363.method2293((byte) -101);
        class391.method2407(4);
        class36.method265(arg0 ^ 0x70);
        class21.method165(-2069709524);
        class505.method3017((byte) 41);
        class232.method1577(-30328);
        class422.method2544(49);
        class421.method2533((byte) -38);
        class417.method2520(0);
        class405.method2477((byte) -127);
        class515.method3065(arg0 ^ 0xFFFFFFBB);
        class374.method2334(arg0 ^ 0xFFFFE3BA);
        class55.method376(-121);
        class112.method737(65);
        class502.method3002(arg0 ^ 0x72);
        class96.method665((byte) 113);
        class279.method1760((byte) -40);
        class151.method990(-41);
        class190.method1329(-101);
        class11.method98(14195);
        class315.method2042(8216);
        class17.method138(1);
        class99.method673(true);
        class34.method255((byte) 97);
        class224.method1512(false);
        class256.method1663(-118);
        class104.method701(-2048);
        class345.method2205(false);
        class464.method2775();
        class312.method2021();
        class129.method821(-22136);
        class524.method3108(arg0 - 142);
        class354.method2236((byte) -122);
        class281.method1763(-23375);
        class455.method2736(true);
        class482.method2880(2);
        class486.method2900(37);
        class38.method273((byte) -35);
        class252.method1647(-16777216);
        class381.method2364(27869);
        class56.method384(arg0 ^ 0x1C);
        class133.method861(arg0 + 34222);
        class412.method2503(true);
        class456.method2745(-10406);
        class178.method1281(1242430288);
        class307.method1974((byte) 72);
        class277.method1757((byte) 90);
        class288.method1867(arg0 - 102);
        class257.method1670((byte) 96);
        class516.method3069(103);
        class123.method794((byte) 67);
        class240.method1611(17266);
        class62.method426(75);
        class397.method2441(-72);
        class67.method443(true);
        class520.method3094(9593);
        class146.method972(1);
        class227.method1560(-354);
        class216.method1468((byte) 38);
        class247.method1632(arg0 + 15056);
        class179.method1285((byte) -71);
        class203.method1412(-127);
        class287.method1863(0);
        class457.method2754(0);
        class295.method1901(arg0 ^ 0xFFFFDF2C);
        class234.method1586((byte) 85);
        class332.method2139(0);
        class328.method2115(true);
        class238.method1607(-114);
        class444.method2677(-86);
        class73.method488((byte) 93);
        class85.method552((byte) -94);
        class142.method950(false);
        class261.method1685(117);
        class302.method1941(true);
        class101.method685(true);
        class186.method1315(true);
        class404.method2475((byte) 86);
        class1.method11(-927179380);
        class292.method1891(-127);
        class473.method2840((byte) 19);
        class462.method2768((byte) -105);
        class510.method3042(false);
        class198.method1390((byte) 120);
        class265.method1699((byte) 40);
        class434.method2603((byte) 63);
        class25.method202(0);
        class333.method2143((byte) -60);
        class414.method2514(-95);
        class470.method2820((byte) -110);
        class150.method986((byte) 25);
        class204.method1415(Integer.MIN_VALUE);
        class32.method232((byte) -39);
        class303.method1943((byte) -57);
        class107.method713(-104);
        class371.method2323((byte) -66);
        class301.method1940(14184);
        class461.method2764(-161);
        class477.method2859(true);
        class419.method2528(16773);
        class352.method2225(-23331);
        class65.method433((byte) 99);
        class27.method208((byte) 123);
        class16.method134(-10950);
        class244.method1625(625777584);
        class289.method1869(arg0 - 145);
        class72.method483((byte) 18);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Ljb;)Z", line = 1361)
    public static final boolean method452(class499 arg0) {
        if (class197.field2788) {
            if (method450(arg0).field5891 != 0) {
                return false;
            }
            if (arg0.field7355 == 0) {
                return false;
            }
        }
        return arg0.field7356;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V", line = 1376)
    public static final void method453() {
        class149.field2142 = 0;
        for (int var0 = 0; var0 < class25.field411; var0++) {
            class194 var1 = class151.field2174[class259.field3609[var0]];
            if (var1.field5310 && var1.method1375(7) != -1) {
                int var2 = (var1.method2091(-15245) - 1) * 64 + 60;
                int var3 = var1.field2217 - var2 >> 7;
                int var4 = var1.field2215 - var2 >> 7;
                class337 var5 = class438.method2654(var4, var3, var1.field2210, true);
                if (var5 != null) {
                    int var6 = var5.field5254;
                    if (var5 instanceof class194) {
                        var6 += 2048;
                    }
                    if (var5.field5307 == 0 && var5.method1375(7) != -1) {
                        class101.field1452[class149.field2142] = var6;
                        class8.field124[class149.field2142] = var6;
                        class149.field2142++;
                        var5.field5307++;
                    }
                    class101.field1452[class149.field2142] = var6;
                    class8.field124[class149.field2142] = var1.field5254 + 2048;
                    class149.field2142++;
                    var5.field5307++;
                }
            }
        }
        class257.method1671(class149.field2142 - 1, class101.field1452, 0, class8.field124, Integer.MAX_VALUE);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V", line = 1426)
    public static final void method454() {
        int var0 = class442.field6574;
        int[] var1 = class320.field4896;
        boolean var2 = class96.field1399.field5223 == 1 && var0 > 200 || class96.field1399.field5223 == 0 && var0 > 50;
        for (int var3 = 0; var3 < var0; var3++) {
            class322 var12 = class439.field6539[var1[var3]];
            if (var12.method2096(0)) {
                var12.method1001(-117);
                if (var12.field2208 >= 0 && var12.field2216 >= 0 && var12.field2214 < class96.field1403 && var12.field2213 < class485.field7122) {
                    var12.field4968 = var12.field5294 ? var2 : false;
                    if (class339.field5365 == var12) {
                        var12.field5249 = Integer.MAX_VALUE;
                    } else {
                        int var13 = 0;
                        if (!var12.field5310) {
                            var13++;
                        }
                        if (var12.field5303 > class405.field6116) {
                            var13 += 2;
                        }
                        int var14 = var13 + (5 - var12.method2091(-15245) << 2);
                        if (var12.field4978) {
                            var14 += 512;
                        } else {
                            if (class405.field6121 == 0) {
                                var14 += 32;
                            } else {
                                var14 += 128;
                            }
                            var14 += 256;
                        }
                        var12.field5249 = var14 + 1;
                    }
                } else {
                    var12.field5249 = -1;
                }
            } else {
                var12.field5249 = -1;
            }
        }
        for (int var4 = 0; var4 < class25.field411; var4++) {
            class194 var9 = class151.field2174[class259.field3609[var4]];
            if (var9.method1371(0) && var9.field2768.method2127(class36.field583, (byte) 84)) {
                var9.method1001(-97);
                if (var9.field2208 >= 0 && var9.field2216 >= 0 && var9.field2214 < class96.field1403 && var9.field2213 < class485.field7122) {
                    int var10 = 0;
                    if (!var9.field5310) {
                        var10++;
                    }
                    if (var9.field5303 > class405.field6116) {
                        var10 += 2;
                    }
                    int var11 = var10 + (5 - var9.method2091(-15245) << 2);
                    if (class405.field6121 == 0) {
                        if (var9.field2768.field5044) {
                            var11 += 64;
                        } else {
                            var11 += 128;
                        }
                    } else if (class405.field6121 == 1) {
                        if (var9.field2768.field5044) {
                            var11 += 32;
                        } else {
                            var11 += 64;
                        }
                    }
                    if (var9.field2768.field5060) {
                        var11 += 1024;
                    } else if (!var9.field2768.field5072) {
                        var11 += 256;
                    }
                    var9.field5249 = var11 + 1;
                } else {
                    var9.field5249 = -1;
                }
            } else {
                var9.field5249 = -1;
            }
        }
        for (int var5 = 0; var5 < class463.field6771.length; var5++) {
            class187 var6 = class463.field6771[var5];
            if (var6 != null) {
                if (var6.field2631 == 1) {
                    class194 var7 = class151.field2174[var6.field2626];
                    if (var7 != null && var7.field5249 >= 0) {
                        var7.field5249 += 2048;
                    }
                } else if (var6.field2631 == 10) {
                    class322 var8 = class439.field6539[var6.field2626];
                    if (var8 != null && class339.field5365 != var8 && var8.field5249 >= 0) {
                        var8.field5249 += 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V", line = 1590)
    public static final void method455(int arg0, int arg1) {
        field944++;
        class377 var2 = class99.method672(arg0, false, arg1);
        var2.method2339(-11688);
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V", line = 1602)
    public static final void method456(int arg0) {
        int var1 = class442.field6574;
        int[] var2 = class320.field4896;
        int var3 = class206.field2920 ? var1 : class25.field411 + var1;
        for (int var4 = 0; var4 < var3; var4++) {
            class337 var5;
            if (var4 < var1) {
                var5 = class439.field6539[var2[var4]];
            } else {
                var5 = class151.field2174[class259.field3609[var4 - var1]];
            }
            if (var5.field2210 == arg0) {
                var5.field5307 = 0;
                if (var5.field5249 < 0) {
                    var5.field5310 = false;
                } else {
                    int var6 = var5.method2091(-15245);
                    if ((var6 & 0x1) == 0) {
                        if ((var5.field2217 & 0x7F) != 0 || (var5.field2215 & 0x7F) != 0) {
                            var5.field5310 = false;
                            continue;
                        }
                    } else if ((var5.field2217 & 0x7F) != 64 || (var5.field2215 & 0x7F) != 64) {
                        var5.field5310 = false;
                        continue;
                    }
                    int var10002;
                    if (var6 == 1) {
                        int var7 = var5.field2217 >> 7;
                        int var8 = var5.field2215 >> 7;
                        if (class504.field7531[var7][var8] != var5.field5249) {
                            var5.field5310 = true;
                            continue;
                        }
                        if (class35.field541[var7][var8] > 1) {
                            var10002 = class35.field541[var7][var8]--;
                            var5.field5310 = true;
                            continue;
                        }
                    } else {
                        int var9 = (var6 - 1) * 64 + 60;
                        int var10 = var5.field2217 - var9 >> 7;
                        int var11 = var5.field2215 - var9 >> 7;
                        int var12 = var5.field2217 + var9 >> 7;
                        int var13 = var5.field2215 + var9 >> 7;
                        if (!class254.method1654(16102, var5.field5249, var13, var12, var10, var11)) {
                            for (int var14 = var10; var14 <= var12; var14++) {
                                for (int var15 = var11; var15 <= var13; var15++) {
                                    if (class504.field7531[var14][var15] == var5.field5249) {
                                        var10002 = class35.field541[var14][var15]--;
                                    }
                                }
                            }
                            var5.field5310 = true;
                            continue;
                        }
                    }
                    if (var5 instanceof class322 && var5.field5341 != null && class405.field6116 >= var5.field5341.field6137 && class405.field6116 < var5.field5341.field6125) {
                        ((class322) var5).field4968 = false;
                    }
                    var5.field5310 = false;
                    var5.field2222 = class500.method2985(var5.field2217, 5293, var5.field2210, var5.field2215);
                    class223.method1511(var5, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)I", line = 1720)
    private static final int method457(byte arg0) {
        field936++;
        if (arg0 > -59) {
            field943 = null;
        }
        return 6;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V", line = 1732)
    private final void method458(boolean arg0) {
        if (!class96.field1399.field5227) {
            for (int var2 = 0; var2 < class12.field199; var2++) {
                if (class453.field6651[var2].method1945((byte) 126) == 's' || class453.field6651[var2].method1945((byte) 125) == 'S') {
                    class96.field1399.field5227 = true;
                    break;
                }
            }
        }
        field942++;
        if (field930 == 0) {
            Runtime var3 = Runtime.getRuntime();
            int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
            long var5 = class264.method1698(true);
            if (class320.field4906 == 0L) {
                class320.field4906 = var5;
            }
            if (var4 > 16384 && var5 - class320.field4906 < 5000L) {
                if ((var5 - class334.field5154) > 1000L) {
                    System.gc();
                    class334.field5154 = var5;
                }
                class386.field5884 = class501.field7482.method2335((byte) -100, class288.field4292);
                class500.field7456 = 5;
            } else {
                class386.field5884 = class414.field6215.method2335((byte) -100, class288.field4292);
                class500.field7456 = 5;
                field930 = 10;
            }
        } else if (field930 == 10) {
            for (int var7 = 0; var7 < 4; var7++) {
                class444.field6605[var7] = class452.method2722(0, class96.field1403, class485.field7122);
            }
            class386.field5884 = class150.field2167.method2335((byte) -100, class288.field4292);
            field930 = 20;
            class500.field7456 = 10;
        } else if (field930 == 20) {
            if (class453.field6656 == null) {
                class453.field6656 = new class430(class514.field7617, class334.field5152);
            }
            if (class453.field6656.method2582(255)) {
                class339.field5360 = class190.method1331(1, true, false, 1, 0);
                class512.field7606 = class190.method1331(1, true, false, 1, 1);
                class338.field5355 = class190.method1331(1, true, false, 1, 2);
                class486.field7135 = class190.method1331(1, true, false, 1, 3);
                class29.field459 = class190.method1331(1, true, false, 1, 4);
                class255.field3538 = class190.method1331(1, true, true, 1, 5);
                class438.field6532 = class190.method1331(1, false, true, 1, 6);
                class274.field3819 = class190.method1331(1, true, false, 1, 7);
                class113.field1576 = class190.method1331(1, true, false, 1, 8);
                class504.field7527 = class190.method1331(1, true, false, 1, 9);
                class59.field790 = class190.method1331(1, true, false, 1, 10);
                class21.field335 = class190.method1331(1, true, false, 1, 11);
                class501.field7486 = class190.method1331(1, true, false, 1, 12);
                class119.field1677 = class190.method1331(1, true, false, 1, 13);
                class394.field5985 = class190.method1331(1, false, false, 1, 14);
                class48.field675 = class190.method1331(1, true, false, 1, 15);
                class359.field5553 = class190.method1331(1, true, false, 1, 16);
                class354.field5499 = class190.method1331(1, true, false, 1, 17);
                class261.field3633 = class190.method1331(1, true, false, 1, 18);
                class498.field7275 = class190.method1331(1, true, false, 1, 19);
                class99.field1427 = class190.method1331(1, true, false, 1, 20);
                class508.field7553 = class190.method1331(1, true, false, 1, 21);
                class391.field5943 = class190.method1331(1, true, false, 1, 22);
                class149.field2158 = class190.method1331(1, true, true, 1, 23);
                class265.field3705 = class190.method1331(1, true, false, 1, 24);
                class150.field2169 = class190.method1331(1, true, false, 1, 25);
                class33.field522 = class190.method1331(1, true, true, 1, 26);
                class86.field1176 = class190.method1331(1, true, false, 1, 27);
                class127.field1806 = class190.method1331(1, true, true, 1, 28);
                class251.field3477 = class190.method1331(1, true, false, 1, 29);
                class386.field5884 = class490.field7166.method2335((byte) -100, class288.field4292);
                field930 = 30;
                class500.field7456 = 15;
            } else {
                class386.field5884 = class98.field1416.method2335((byte) -100, class288.field4292);
                class500.field7456 = 12;
            }
        } else if (field930 == 30) {
            int var8 = 0;
            for (int var9 = 0; var9 < 30; var9++) {
                var8 += class76.field1032[var9].method1422((byte) 126) * class331.field5128[var9] / 100;
            }
            if (var8 == 100) {
                class386.field5884 = class415.field6226.method2335((byte) -100, class288.field4292);
                class500.field7456 = 20;
                class158.method1026(-22, class113.field1576);
                class213.method1458(30067, class113.field1576);
                field930 = 40;
            } else {
                if (var8 != 0) {
                    class386.field5884 = class263.field3676.method2335((byte) -100, class288.field4292) + var8 + "%";
                }
                class500.field7456 = 20;
            }
        } else if (field930 == 40) {
            if (class127.field1806.method2643(0)) {
                this.method459(class127.field1806.method2638(true, 1), false);
                class386.field5884 = class417.field6252.method2335((byte) -100, class288.field4292);
                field930 = 50;
                class500.field7456 = 25;
            } else {
                class386.field5884 = class40.field618.method2335((byte) -100, class288.field4292) + class127.field1806.method2628(116) + "%";
                class500.field7456 = 25;
            }
        } else if (field930 == 50) {
            class518.method3081(false);
            class386.field5884 = class94.field1368.method2335((byte) -100, class288.field4292);
            class500.field7456 = 30;
            field930 = 60;
        } else if (field930 == 60) {
            int var10 = class335.method2160(class113.field1576, (byte) -121, class119.field1677);
            int var11 = method457((byte) -119);
            if (var10 < var11) {
                class386.field5884 = class226.field3247.method2335((byte) -100, class288.field4292) + var10 * 100 / var11 + "%";
                class500.field7456 = 35;
            } else {
                class386.field5884 = class110.field1555.method2335((byte) -100, class288.field4292);
                field930 = 70;
                class500.field7456 = 35;
            }
        } else if (field930 == 70) {
            int var12 = class336.method2165((byte) 78, class113.field1576);
            int var13 = class481.method2878((byte) 46);
            if (var13 > var12) {
                class386.field5884 = class465.field6790.method2335((byte) -100, class288.field4292) + var12 * 100 / var13 + "%";
                class500.field7456 = 40;
            } else {
                class386.field5884 = class487.field7143.method2335((byte) -100, class288.field4292);
                class500.field7456 = 40;
                field930 = 80;
            }
        } else if (field930 == 80) {
            if (class33.field522.method2643(0)) {
                class500.field7448 = new class226(class33.field522, class504.field7527, class113.field1576);
                class386.field5884 = class389.field5900.method2335((byte) -100, class288.field4292);
                class500.field7456 = 45;
                field930 = 90;
            } else {
                class386.field5884 = class406.field6126.method2335((byte) -100, class288.field4292) + class33.field522.method2628(-94) + "%";
                class500.field7456 = 45;
            }
        } else if (field930 == 90) {
            class386.field5884 = class116.field1617.method2335((byte) -100, class288.field4292);
            class500.field7456 = 50;
            field930 = 95;
        } else if (field930 == 95) {
            if (class96.field1399.field5227) {
                class96.field1399.field5234 = 1;
                class96.field1399.field5212 = 0;
                class96.field1399.field5225 = 0;
                class96.field1399.field5219 = 0;
                class96.field1399.field5239 = 0;
            }
            class96.field1399.field5227 = true;
            class96.field1399.method1731(true, class419.field6254);
            class353.method2230((byte) 89, false, class96.field1399.field5239);
            class386.field5884 = class395.field6013.method2335((byte) -100, class288.field4292);
            field930 = 100;
            class500.field7456 = 55;
        } else if (field930 == 100) {
            class520.method3096(class119.field1677, class113.field1576, class337.field5242, (byte) 104);
            class386.field5884 = class232.field3297.method2335((byte) -100, class288.field4292);
            class500.field7456 = 60;
            class524.method3106(5, (byte) 88);
            field930 = 110;
        } else if (field930 == 110) {
            class338.field5355.method2643(0);
            byte var14 = 0;
            int var15 = var14 + class338.field5355.method2628(-121);
            class359.field5553.method2643(0);
            int var16 = var15 + class359.field5553.method2628(-127);
            class354.field5499.method2643(0);
            int var17 = var16 + class354.field5499.method2628(123);
            class261.field3633.method2643(0);
            int var18 = var17 + class261.field3633.method2628(-100);
            class498.field7275.method2643(0);
            int var19 = var18 + class498.field7275.method2628(59);
            class99.field1427.method2643(0);
            int var20 = var19 + class99.field1427.method2628(-81);
            class508.field7553.method2643(0);
            int var21 = var20 + class508.field7553.method2628(118);
            class391.field5943.method2643(0);
            int var22 = var21 + class391.field5943.method2628(86);
            class265.field3705.method2643(0);
            int var23 = var22 + class265.field3705.method2628(-95);
            class150.field2169.method2643(0);
            int var24 = var23 + class150.field2169.method2628(48);
            class86.field1176.method2643(0);
            int var25 = var24 + class86.field1176.method2628(99);
            class251.field3477.method2643(0);
            int var26 = var25 + class251.field3477.method2628(62);
            if (var26 < 1200) {
                class386.field5884 = class219.field3041.method2335((byte) -100, class288.field4292) + var26 / 12 + "%";
                class500.field7456 = 65;
            } else {
                class209.field2960 = new class518(class393.field5983, class288.field4292, class338.field5355);
                class186.field2620 = new class445(class393.field5983, class288.field4292, class338.field5355);
                class31.field473 = new class100(class393.field5983, class288.field4292, class338.field5355, class113.field1576);
                class96.field1401 = new class181(class393.field5983, class288.field4292, class354.field5499);
                class423.field6309 = new class94(class393.field5983, class288.field4292, class338.field5355);
                class398.field6048 = new class262(class393.field5983, class288.field4292, class338.field5355);
                class75.field1012 = new class508(class393.field5983, class288.field4292, class338.field5355, class274.field3819);
                class67.field923 = new class250(class393.field5983, class288.field4292, class338.field5355);
                class64.field896 = new class463(class393.field5983, class288.field4292, class338.field5355);
                class56.field755 = new class313(class393.field5983, class288.field4292, true, class359.field5553, class274.field3819);
                class237.field3377 = new class52(class393.field5983, class288.field4292, class338.field5355, class113.field1576);
                class471.field6878 = new class41(class393.field5983, class288.field4292, class338.field5355, class113.field1576);
                class410.field6175 = new class174(class393.field5983, class288.field4292, true, class261.field3633, class274.field3819);
                class84.field1154 = new class398(class393.field5983, class288.field4292, true, class209.field2960, class498.field7275, class274.field3819);
                class525.field7770 = new class37(class393.field5983, class288.field4292, class338.field5355);
                class260.field3621 = new class300(class393.field5983, class288.field4292, class99.field1427, class339.field5360, class512.field7606);
                class296.field4391 = new class57(class393.field5983, class288.field4292, class338.field5355);
                class496.field7258 = new class259(class393.field5983, class288.field4292, class338.field5355);
                class275.field3826 = new class13(class393.field5983, class288.field4292, class508.field7553, class274.field3819);
                class128.field1812 = new class441(class393.field5983, class288.field4292, class338.field5355);
                class482.field7025 = new class299(class393.field5983, class288.field4292, class338.field5355);
                class34.field540 = new class408(class393.field5983, class288.field4292, class338.field5355);
                class144.field2075 = new class93(class393.field5983, class288.field4292, class391.field5943);
                class513.field7614 = new class12(class393.field5983, class288.field4292, class338.field5355);
                class70.method480(class119.field1677, class113.field1576, class274.field3819, class486.field7135, (byte) 71);
                class528.method3122((byte) -124, class251.field3477);
                class258.field3604 = new class326(class288.field4292, class265.field3705, class150.field2169);
                class84.field1147 = new class514(class288.field4292, class265.field3705, class150.field2169, new class260());
                class386.field5884 = class165.field2408.method2335((byte) -100, class288.field4292);
                class500.field7456 = 65;
                class329.method2118((byte) 104);
                class56.field755.method2037(!class96.field1399.method1734(123, class441.field6563), -148568433);
                class36.field583 = new class169();
                class67.method446((byte) -117);
                class495.method2943(117, class86.field1176);
                class1.method4(class500.field7448, (byte) 107, class274.field3819);
                field930 = 120;
            }
        } else if (field930 == 120) {
            int var27 = class522.method3099(class113.field1576, (byte) -31);
            int var28 = class523.method3104(94);
            if (var28 > var27) {
                class386.field5884 = class243.field3410.method2335((byte) -100, class288.field4292) + var27 * 100 / var28 + "%";
                class500.field7456 = 70;
            } else {
                class488.method2911(class337.field5242, class113.field1576, 0);
                class509.method3035(class41.field635, -12168);
                class386.field5884 = class423.field6306.method2335((byte) -100, class288.field4292);
                class500.field7456 = 70;
                field930 = 130;
            }
        } else if (field930 == 130) {
            if (class59.field790.method2626("", 0, "huffman")) {
                class253 var29 = new class253(class59.field790.method2627("", "huffman", 0));
                class429.method2571((byte) -71, var29);
                class386.field5884 = class454.field6672.method2335((byte) -100, class288.field4292);
                class500.field7456 = 75;
                field930 = 140;
            } else {
                class386.field5884 = class507.field7542.method2335((byte) -100, class288.field4292) + "0%";
                class500.field7456 = 75;
            }
        } else if (field930 == 140) {
            if (class486.field7135.method2643(0)) {
                class386.field5884 = class97.field1408.method2335((byte) -100, class288.field4292);
                class500.field7456 = 80;
                field930 = 150;
            } else {
                class386.field5884 = class73.field990.method2335((byte) -100, class288.field4292) + class486.field7135.method2628(-118) + "%";
                class500.field7456 = 80;
            }
        } else if (field930 != 150) {
            if (!arg0) {
                field935 = false;
            }
            if (field930 == 160) {
                if (class119.field1677.method2643(0)) {
                    class386.field5884 = class527.field7786.method2335((byte) -100, class288.field4292);
                    class500.field7456 = 85;
                    field930 = 170;
                } else {
                    class386.field5884 = class527.field7786.method2335((byte) -100, class288.field4292) + class119.field1677.method2628(-85) + "%";
                    class500.field7456 = 85;
                }
            } else if (field930 == 170) {
                if (class149.field2158.method2636(21946, "details")) {
                    class135.method876(class149.field2158, class423.field6309, class398.field6048, class56.field755, class237.field3377, class471.field6878, class36.field583);
                    class386.field5884 = class292.field4349.method2335((byte) -100, class288.field4292);
                    class500.field7456 = 89;
                    field930 = 180;
                } else {
                    class386.field5884 = class337.field5332.method2335((byte) -100, class288.field4292) + class149.field2158.method2646(0, "details") + "%";
                    class500.field7456 = 87;
                }
            } else if (field930 == 180) {
                int var30 = class384.method2377(1);
                if (var30 == -1) {
                    class386.field5884 = class384.field5861.method2335((byte) -100, class288.field4292);
                    class500.field7456 = 90;
                } else if (var30 == 7 || var30 == 9) {
                    this.method752((byte) -116, "worldlistfull");
                    class524.method3106(1000, (byte) 49);
                } else if (class164.field2394) {
                    class386.field5884 = class256.field3540.method2335((byte) -100, class288.field4292);
                    field930 = 190;
                    class500.field7456 = 90;
                } else {
                    this.method752((byte) -63, "worldlistio_" + var30);
                    class524.method3106(1000, (byte) 42);
                }
            } else if (field930 == 190) {
                class508.field7561 = new String[class482.field7025.field4425];
                class397.field6038 = new boolean[class34.field540.field6165];
                class129.field1815 = new int[class34.field540.field6165];
                for (int var31 = 0; var31 < class34.field540.field6165; var31++) {
                    if (class34.field540.method2488(var31, (byte) 75).field7610 == 0) {
                        class397.field6038[var31] = true;
                        class523.field7737++;
                    }
                    class129.field1815[var31] = -1;
                }
                class379.method2346(2);
                class332.field5147 = class486.field7135.method2652("loginscreen", 95);
                class255.field3538.method2629(false, true, (byte) -74);
                class438.field6532.method2629(true, true, (byte) -74);
                class113.field1576.method2629(true, true, (byte) -74);
                class119.field1677.method2629(true, true, (byte) -74);
                class59.field790.method2629(true, true, (byte) -74);
                class486.field7135.method2629(true, true, (byte) -74);
                class440.field6550 = true;
                class338.field5355.field6511 = 2;
                class354.field5499.field6511 = 2;
                class359.field5553.field6511 = 2;
                class261.field3633.field6511 = 2;
                class498.field7275.field6511 = 2;
                class99.field1427.field6511 = 2;
                class508.field7553.field6511 = 2;
                class41.method326(-1, 111, -1, class96.field1399.field5234, false);
                class386.field5884 = class322.field4958.method2335((byte) -100, class288.field4292);
                field930 = 200;
                class500.field7456 = 95;
            } else if (field930 == 200) {
                class152.method995(true, (byte) 95);
            }
        } else if (class501.field7486.method2643(0)) {
            class386.field5884 = class117.field1649.method2335((byte) -100, class288.field4292);
            field930 = 160;
            class500.field7456 = 82;
        } else {
            class386.field5884 = class394.field5988.method2335((byte) -100, class288.field4292) + class501.field7486.method2628(111) + "%";
            class500.field7456 = 82;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([BZ)V", line = 2284)
    private final void method459(byte[] arg0, boolean arg1) {
        if (arg1) {
            field930 = 68;
        }
        field934++;
        class91 var3 = new class91(arg0);
        while (true) {
            while (true) {
                int var4 = var3.method618((byte) 100);
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    int[] var5 = class6.field96 = new int[6];
                    var5[0] = var3.method631(10494);
                    var5[1] = var3.method631(10494);
                    var5[2] = var3.method631(10494);
                    var5[3] = var3.method631(10494);
                    var5[4] = var3.method631(10494);
                    var5[5] = var3.method631(10494);
                } else if (var4 == 4) {
                    int var6 = var3.method618((byte) 100);
                    class271.field3775 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        class271.field3775[var7] = var3.method631(10494);
                        if (class271.field3775[var7] == 65535) {
                            class271.field3775[var7] = -1;
                        }
                    }
                } else if (var4 == 5) {
                    int var8 = var3.method618((byte) 100);
                    class63.field895 = new int[var8];
                    for (int var9 = 0; var9 < var8; var9++) {
                        class63.field895[var9] = var3.method631(10494);
                        if (class63.field895[var9] == 65535) {
                            class63.field895[var9] = -1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V", line = 2365)
    public static final void method460(int arg0) {
        int var1 = class442.field6574;
        int[] var2 = class320.field4896;
        for (int var3 = 0; var3 < class25.field411 + var1; var3++) {
            class337 var4;
            if (var3 < var1) {
                var4 = class439.field6539[var2[var3]];
            } else {
                var4 = class151.field2174[class259.field3609[var3 - var1]];
            }
            if (var4.field2210 == arg0 && var4.field5249 >= 0) {
                int var5 = var4.method2091(-15245);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field2217 & 0x7F) != 0 || (var4.field2215 & 0x7F) != 0) {
                        continue;
                    }
                } else if ((var4.field2217 & 0x7F) != 64 || (var4.field2215 & 0x7F) != 64) {
                    continue;
                }
                int var10002;
                if (var5 == 1) {
                    int var6 = var4.field2217 >> 7;
                    int var7 = var4.field2215 >> 7;
                    if (var4.field5249 > class504.field7531[var6][var7]) {
                        class504.field7531[var6][var7] = var4.field5249;
                        class35.field541[var6][var7] = 1;
                    } else if (class504.field7531[var6][var7] == var4.field5249) {
                        var10002 = class35.field541[var6][var7]++;
                    }
                } else {
                    int var8 = (var5 - 1) * 64 + 60;
                    int var9 = var4.field2217 - var8 >> 7;
                    int var10 = var4.field2215 - var8 >> 7;
                    int var11 = var4.field2217 + var8 >> 7;
                    int var12 = var4.field2215 + var8 >> 7;
                    for (int var13 = var9; var13 <= var11; var13++) {
                        for (int var14 = var10; var14 <= var12; var14++) {
                            if (var4.field5249 > class504.field7531[var13][var14]) {
                                class504.field7531[var13][var14] = var4.field5249;
                                class35.field541[var13][var14] = 1;
                            } else if (class504.field7531[var13][var14] == var4.field5249) {
                                var10002 = class35.field541[var13][var14]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V", line = 2464)
    private final void method461(byte arg0) {
        class501.field7485++;
        field938++;
        class54.method369(-1, -1, null, -10281);
        class517.method3079(-1, (byte) -111, null, -1);
        class362.method2288(0);
        class485.field7086++;
        for (int var2 = 0; var2 < 32768; var2++) {
            class194 var12 = class151.field2174[var2];
            if (var12 != null) {
                byte var13 = var12.field2768.field5101;
                if ((var13 & 0x1) != 0) {
                    int var14 = var12.method2091(-15245);
                    if ((var13 & 0x2) != 0 && var12.field5343 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var15 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var16 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var15 != 0 || var16 != 0) {
                            int var17 = var12.field5339[0] + var15;
                            int var18 = var12.field5344[0] + var16;
                            if (var17 < 0) {
                                var17 = 0;
                            } else if ((class96.field1403 - var14 - 1) < var17) {
                                var17 = class96.field1403 - var14 - 1;
                            }
                            if (var18 < 0) {
                                var18 = 0;
                            } else if ((class485.field7122 - var14 - 1) < var18) {
                                var18 = class485.field7122 - var14 - 1;
                            }
                            int var19 = class421.method2536(var14, class444.field6605[var12.field2210], var17, class111.field1557, 0, var12.field5344[0], -1, var14, 0, class168.field2446, var14, var18, var12.field5339[0], -1, true);
                            if (var19 > 0) {
                                if (var19 > 9) {
                                    var19 = 9;
                                }
                                for (int var20 = 0; var20 < var19; var20++) {
                                    var12.field5339[var20] = class111.field1557[var19 - var20 - 1];
                                    var12.field5344[var20] = class168.field2446[var19 - var20 - 1];
                                    var12.field5340[var20] = 1;
                                }
                                var12.field5343 = var19;
                            }
                        }
                    }
                    class526.method3115(true, var12, true);
                    int var21 = class10.method86(6402, var12);
                    class44.method340(class269.field3733, var21, var12, -3, class321.field4915);
                    class437.method2615(var12, (byte) 96);
                }
            }
        }
        if (class520.field7708 == 0 && class16.field266 == 0) {
            if (class432.field6409 == 2) {
                class282.method1774((byte) 118);
            } else {
                class325.method2106(-95);
            }
            if (class34.field539 >> 7 < 14 || (class96.field1403 - 14) <= (class34.field539 >> 7) || class301.field4447 >> 7 < 14 || class485.field7122 - 14 <= class301.field4447 >> 7) {
                class466.method2783(-21726);
            }
        }
        while (true) {
            class199 var3;
            class499 var4;
            class499 var5;
            do {
                var3 = (class199) class62.field886.method1962(0);
                if (var3 == null) {
                    if (arg0 != -106) {
                        field935 = false;
                    }
                    while (true) {
                        class199 var6;
                        class499 var7;
                        class499 var8;
                        do {
                            var6 = (class199) class494.field7220.method1962(0);
                            if (var6 == null) {
                                while (true) {
                                    class199 var9;
                                    class499 var10;
                                    class499 var11;
                                    do {
                                        var9 = (class199) class296.field4384.method1962(0);
                                        if (var9 == null) {
                                            if (class362.field5615 != null) {
                                                class198.method1391(arg0 + 1952301995);
                                            }
                                            if ((class405.field6116 % 1500) == 0) {
                                                class145.method966((byte) -121);
                                            }
                                            class42.method330((byte) 80);
                                            if (class292.field4351 && class213.field2980 < class264.method1698(true) - 60000L) {
                                                class74.method492(arg0 ^ 0xFFFFFFEF);
                                                return;
                                            }
                                            return;
                                        }
                                        var10 = var9.field2817;
                                        if (var10.field7304 < 0) {
                                            break;
                                        }
                                        var11 = class211.method1457(var10.field7322, 6687);
                                    } while (var11 == null || var11.field7423 == null || var11.field7423.length <= var10.field7304 || var11.field7423[var10.field7304] != var10);
                                    class291.method1886(var9);
                                }
                            }
                            var7 = var6.field2817;
                            if (var7.field7304 < 0) {
                                break;
                            }
                            var8 = class211.method1457(var7.field7322, 6687);
                        } while (var8 == null || var8.field7423 == null || var8.field7423.length <= var7.field7304 || var8.field7423[var7.field7304] != var7);
                        class291.method1886(var6);
                    }
                }
                var4 = var3.field2817;
                if (var4.field7304 < 0) {
                    break;
                }
                var5 = class211.method1457(var4.field7322, 6687);
            } while (var5 == null || var5.field7423 == null || var5.field7423.length <= var4.field7304 || var5.field7423[var4.field7304] != var4);
            class291.method1886(var3);
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V", line = 2670)
    private final void method462(int arg0) {
        field941++;
        int var2 = -105 % ((83 - arg0) / 35);
        boolean var3 = class514.field7617.method2253(116);
        if (!var3) {
            this.method466(2988);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V", line = 2694)
    public static final void method463() {
        for (int var0 = 0; var0 < class96.field1403; var0++) {
            int[] var1 = class504.field7531[var0];
            for (int var2 = 0; var2 < class485.field7122; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)Ljava/lang/String;", line = 2714)
    public final String method464(boolean arg0) {
        field926++;
        String var2 = null;
        try {
            var2 = "[1)" + class82.field1105 + "," + class437.field6477 + "," + class96.field1403 + "," + class485.field7122 + "|";
            if (class339.field5365 != null) {
                var2 = var2 + "2)" + class195.field2770 + "," + (class339.field5365.field5339[0] + class82.field1105) + "," + (class339.field5365.field5344[0] + class437.field6477) + "|";
            }
            var2 = var2 + "3)" + class441.field6563 + "|4)" + class96.field1399.field5212 + "|5)" + class320.method2074(-32190) + "|6)" + class7.field112 + "," + class486.field7136 + "|";
            var2 = var2 + "7)" + class96.field1399.method2171(class441.field6563, 123) + "|";
            var2 = var2 + "8)" + class96.field1399.method2170(class441.field6563, arg0) + "|";
            var2 = var2 + "9)" + class96.field1399.field5194 + "|";
            var2 = var2 + "10)" + class96.field1399.field5209 + "|";
            var2 = var2 + "11)" + class96.field1399.field5211 + "|";
            var2 = var2 + "12)" + class96.field1399.method1734(126, class441.field6563) + "|";
            var2 = var2 + "13)" + class455.field6684 + "]";
        } catch (Throwable var3) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V", line = 2740)
    public static void method465(int arg0) {
        if (arg0 != -26432) {
            field943 = null;
        }
        field943 = null;
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V", line = 2756)
    private final void method466(int arg0) {
        if (arg0 != 2988) {
            return;
        }
        field932++;
        if (class514.field7617.field5532 > class427.field6349) {
            if (class529.field7815 == class391.field5947) {
                class529.field7815 = class116.field1635;
            } else {
                class529.field7815 = class391.field5947;
            }
            class37.field597 = (class514.field7617.field5532 * 50 - 50) * 5;
            if (class37.field597 > 3000) {
                class37.field597 = 3000;
            }
            if (class514.field7617.field5532 >= 2 && class514.field7617.field5530 == 6) {
                this.method752((byte) -8, "js5connect_outofdate");
                class144.field2077 = 1000;
                return;
            }
            if (class514.field7617.field5532 >= 4 && class514.field7617.field5530 == -1) {
                this.method752((byte) -28, "js5crc");
                class144.field2077 = 1000;
                return;
            }
            if (class514.field7617.field5532 >= 4 && (class144.field2077 == 0 || class144.field2077 == 5)) {
                if (class514.field7617.field5530 == 7 || class514.field7617.field5530 == 9) {
                    this.method752((byte) -53, "js5connect_full");
                } else if (class514.field7617.field5530 > 0) {
                    this.method752((byte) -26, "js5connect");
                } else {
                    this.method752((byte) -88, "js5io");
                }
                class144.field2077 = 1000;
                return;
            }
        }
        class427.field6349 = class514.field7617.field5532;
        if (class37.field597 > 0) {
            class37.field597--;
            return;
        }
        try {
            if (class322.field4975 == 0) {
                class332.field5138 = class419.field6254.method2814(class529.field7815, class244.field3414, 0);
                class322.field4975++;
            }
            if (class322.field4975 == 1) {
                if (class332.field5138.field1791 == 2) {
                    this.method448(1000, false);
                    return;
                }
                if (class332.field5138.field1791 == 1) {
                    class322.field4975++;
                }
            }
            if (class322.field4975 == 2) {
                class42.field643 = new class501((Socket) class332.field5138.field1793, class419.field6254);
                class91 var2 = new class91(5);
                var2.method625(class442.field6577.field2934, false);
                var2.method615(28010, 587);
                class42.field643.method2999(var2.field1277, 5, arg0 - 2987, 0);
                class322.field4975++;
                class113.field1581 = class264.method1698(true);
            }
            if (class322.field4975 == 3) {
                if (class144.field2077 == 0 || class144.field2077 == 5 || class42.field643.method2995((byte) 31) > 0) {
                    int var3 = class42.field643.method3000((byte) 117);
                    if (var3 != 0) {
                        this.method448(var3, false);
                        return;
                    }
                    class322.field4975++;
                } else if ((class264.method1698(true) - class113.field1581) > 30000L) {
                    this.method448(1001, false);
                    return;
                }
            }
            if (class322.field4975 == 4) {
                boolean var4 = class144.field2077 == 5 || class144.field2077 == 10 || class144.field2077 == 28;
                class514.field7617.method2254(!var4, class42.field643, 128);
                class332.field5138 = null;
                class42.field643 = null;
                class322.field4975 = 0;
            }
        } catch (IOException var5) {
            this.method448(1002, false);
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 2898)
    public final void init() {
        field940++;
        if (!this.method749((byte) 109)) {
            return;
        }
        class504.field7529 = Integer.parseInt(this.getParameter("worldid"));
        class74.field999 = class198.method1388(Integer.parseInt(this.getParameter("modewhere")), -115);
        if (!class265.method1704(class74.field999, (byte) 35) && class74.field999 != class140.field2031) {
            class74.field999 = class140.field2031;
        }
        class243.field3413 = class319.method2069(Integer.parseInt(this.getParameter("modewhat")), true);
        if (class505.field7533 != class243.field3413 && class243.field3413 != class11.field186 && class98.field1418 != class243.field3413) {
            class243.field3413 = class98.field1418;
        }
        try {
            class288.field4292 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var8) {
            class288.field4292 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class242.field3405 = true;
        } else {
            class242.field3405 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class197.field2784 = true;
        } else {
            class197.field2784 = false;
        }
        String var3 = this.getParameter("advert");
        if (var3 != null && var3.equals("1")) {
            class472.field6899 = true;
        } else {
            class472.field6899 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class393.field5983 = class259.field3610;
        } else {
            class393.field5983 = class23.field352;
        }
        try {
            class97.field1409 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var7) {
            class97.field1409 = 0;
        }
        class457.field6707 = this.getParameter("quiturl");
        class165.field2407 = this.getParameter("settings");
        if (class165.field2407 == null) {
            class165.field2407 = "";
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class117.field1653 = Integer.parseInt(var5);
            } catch (Exception var6) {
                class117.field1653 = 0;
            }
        }
        class460.field6747 = Integer.parseInt(this.getParameter("colourid"));
        if (class460.field6747 < 0 || class460.field6747 >= class225.field3212.length) {
            class460.field6747 = 0;
        }
        if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
            class395.field6010 = true;
            class329.field5103 = true;
        }
        if (class393.field5983 == class23.field352) {
            class462.field6768 = 503;
            class515.field7639 = 765;
        } else if (class393.field5983 == class259.field3610) {
            class462.field6768 = 480;
            class515.field7639 = 640;
        }
        class498.field7279 = this;
        this.method753(587, false, class243.field3413.method1706(7219) + 32, class462.field6768, class515.field7639);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V", line = 2994)
    public final void method467(int arg0) {
        if (class292.field4351) {
            class74.method492(-113);
        }
        field927++;
        if (class337.field5242 != null) {
            class337.field5242.method2954((byte) -128);
        }
        if (class260.field3628 != null) {
            class158.method1030(class419.field6254, 0, class260.field3628);
            class260.field3628 = null;
        }
        if (class81.field1092 != null) {
            class81.field1092.method2994(-1);
            class81.field1092 = null;
        }
        if (class379.field5784 != null) {
            class379.field5784.method440(7, class245.field3430);
        }
        class379.field5784 = null;
        class386.method2384((byte) 123);
        class514.field7617.method2241(-24623);
        if (arg0 <= 109) {
            return;
        }
        class334.field5152.method2261(1);
        if (class335.field5162 != null) {
            class335.field5162.method934(2);
            class335.field5162 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 3039)
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 4) {
                class178.method1282("argument count", 1);
            }
            class504.field7529 = Integer.parseInt(arg0[0]);
            class74.field999 = class367.field5658;
            if (arg0[1].equals("live")) {
                class243.field3413 = class98.field1418;
            } else if (arg0[1].equals("rc")) {
                class243.field3413 = class11.field186;
            } else if (arg0[1].equals("wip")) {
                class243.field3413 = class505.field7533;
            } else {
                class178.method1282("modewhat", 1);
            }
            class288.field4292 = class179.method1289(arg0[2], false);
            if (class288.field4292 == -1) {
                if (arg0[2].equals("english")) {
                    class288.field4292 = 0;
                } else if (arg0[2].equals("german")) {
                    class288.field4292 = 1;
                } else {
                    class178.method1282("language", 1);
                }
            }
            class197.field2784 = false;
            class242.field3405 = false;
            if (arg0[3].equals("game0")) {
                class393.field5983 = class23.field352;
            } else if (arg0[3].equals("game1")) {
                class393.field5983 = class259.field3610;
            } else {
                class178.method1282("game", 1);
            }
            class97.field1409 = 0;
            class165.field2407 = "";
            class460.field6747 = class393.field5983.field5120;
            class395.field6010 = true;
            class329.field5103 = true;
            class117.field1653 = 0;
            client var1 = new client();
            class498.field7279 = var1;
            var1.method748(false, 1024, 587, false, 30, class393.field5983.field5125, 768, class243.field3413.method1706(7219) + 32);
            class452.field6646.setLocation(40, 40);
        } catch (Exception var3) {
            class438.method2644(null, -1, var3);
        }
        field928++;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V", line = 3105)
    public final void method468(int arg0) {
        field929++;
        if (class144.field2077 == 1000) {
            return;
        }
        long var2 = class286.method1861((byte) 103) / 1000000L - class390.field5919;
        class390.field5919 = class286.method1861((byte) 113) / 1000000L;
        boolean var4 = class454.method2734(-14159);
        if (var4 && class165.field2412 && class374.field5734 != null) {
            class374.field5734.method1596((byte) -37);
        }
        if (class144.field2077 == 30 || class144.field2077 == 10) {
            if (class80.field1080 != 0L && class264.method1698(true) > class80.field1080) {
                class41.method326(class96.field1399.field5228, 109, class96.field1399.field5207, class320.method2074(arg0 ^ 0xFFFF9B53), false);
            } else if (!class337.field5242.method1052() && class315.field4814) {
                class397.method2440(0);
            }
        }
        if (class260.field3628 == null) {
            Container var5;
            if (class452.field6646 == null) {
                var5 = class419.field6254.field6861;
            } else {
                var5 = class452.field6646;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class452.field6646 == var5) {
                Insets var8 = class452.field6646.getInsets();
                var7 -= var8.top + var8.bottom;
                var6 -= var8.right + var8.left;
            }
            if (class503.field7496 != var6 || class529.field7811 != var7) {
                if (class337.field5242 == null || class337.field5242.method1138()) {
                    class488.method2909((byte) 2);
                } else {
                    class529.field7811 = var7;
                    class503.field7496 = var6;
                }
                class80.field1080 = class264.method1698(true) + 500L;
            }
        }
        if (class260.field3628 != null && !class289.field4300 && (class144.field2077 == 30 || class144.field2077 == 10)) {
            class41.method326(-1, arg0 ^ -6433, -1, class96.field1399.field5234, false);
        }
        boolean var9 = false;
        if (class471.field6883) {
            class471.field6883 = false;
            var9 = true;
        }
        if (var9) {
            class168.method1183((byte) 74);
        }
        if (class337.field5242 != null && class337.field5242.method1052() || class320.method2074(-32190) != 1) {
            class268.method1710(true);
        }
        if (class144.field2077 == 0) {
            class290.method1871(class500.field7456, class104.field1482[class460.field6747], var9, class304.field4469[class460.field6747], class225.field3212[class460.field6747], arg0 ^ 0x4EB, class386.field5884);
        } else if (class144.field2077 == 5) {
            class419.method2527(var9 | class337.field5242.method1052(), class104.field1497, class104.field1482[class460.field6747].getRGB(), class225.field3212[class460.field6747].getRGB(), class337.field5242, class304.field4469[class460.field6747].getRGB(), (byte) 22);
        } else if (class144.field2077 == 10) {
            class120.method769((byte) -67);
        } else if (class144.field2077 == 25 || class144.field2077 == 28) {
            if (class178.field2538 == 1) {
                if (class224.field3160 < class488.field7154) {
                    class224.field3160 = class488.field7154;
                }
                int var11 = (class224.field3160 - class488.field7154) * 50 / class224.field3160;
                class252.method1645(class84.field1153, (byte) 31, class107.field1512.method2335((byte) -100, class288.field4292) + "<br>(" + var11 + "%)", true);
            } else if (class178.field2538 == 2) {
                if (class223.field3149 > class394.field5990) {
                    class394.field5990 = class223.field3149;
                }
                int var10 = (class394.field5990 - class223.field3149) * 50 / class394.field5990 + 50;
                class252.method1645(class84.field1153, (byte) 31, class107.field1512.method2335((byte) -100, class288.field4292) + "<br>(" + var10 + "%)", true);
            } else {
                class252.method1645(class84.field1153, (byte) 31, class107.field1512.method2335((byte) -100, class288.field4292), true);
            }
        } else if (class144.field2077 == 30) {
            class32.method233(1, var2);
        } else if (class144.field2077 == 40) {
            class252.method1645(class84.field1153, (byte) 31, class308.field4619.method2335((byte) -100, class288.field4292) + "<br>" + class190.field2661.method2335((byte) -100, class288.field4292), true);
        }
        if (class103.field1467 == 3) {
            for (int var12 = 0; var12 < class425.field6335; var12++) {
                Rectangle var13 = class383.field5834[var12];
                if (class15.field252[var12]) {
                    class337.field5242.method2952(var13.width, var13.height, var13.x, -1996553985, (byte) -53, var13.y);
                } else if (class527.field7783[var12]) {
                    class337.field5242.method2952(var13.width, var13.height, var13.x, -1996554240, (byte) -53, var13.y);
                }
            }
        }
        if (class16.method135(arg0 - 14754)) {
            class229.method1573(class337.field5242, (byte) -40);
        }
        if ((class144.field2077 == 30 || class144.field2077 == 10) && class103.field1467 == 0 && class320.method2074(-32190) == 1 && !var9 && class469.field6851.equals("1.1")) {
            int var14 = 0;
            for (int var15 = 0; var15 < class425.field6335; var15++) {
                if (class527.field7783[var15]) {
                    class527.field7783[var15] = false;
                    class286.field4259[var14++] = class383.field5834[var15];
                }
            }
            class337.field5242.method1091(class286.field4259, var14);
        } else if (class144.field2077 != 0) {
            class337.field5242.method1075();
            for (int var16 = 0; var16 < class425.field6335; var16++) {
                class527.field7783[var16] = false;
            }
        }
        if (class96.field1399.field5204 == 0) {
            class106.method710(15L, (byte) 6);
        } else if (class96.field1399.field5204 == 1) {
            class106.method710(10L, (byte) 6);
        } else if (class96.field1399.field5204 == 2) {
            class106.method710(5L, (byte) 6);
        } else if (class96.field1399.field5204 == 3) {
            class106.method710(2L, (byte) 6);
        }
        if (arg0 != 6417) {
            field935 = true;
        }
        if (class440.field6550) {
            class194.method1365((byte) 126);
        }
        if (class96.field1399.field5227 && class144.field2077 == 10 && class329.field5062 != -1) {
            class96.field1399.field5227 = false;
            class96.field1399.method1731(true, class419.field6254);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V", line = 3341)
    public final void method469(int arg0) {
        field939++;
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class488.method2909((byte) 2);
        class334.field5152 = new class359(class419.field6254);
        class514.field7617 = new class356();
        if (class74.field999 != class140.field2031) {
            class485.field7124 = new byte[50][];
        }
        class96.field1399 = new class271(class419.field6254);
        if (class74.field999 == class140.field2031) {
            class14.field239 = this.getCodeBase().getHost();
            class422.field6294 = 43594;
            class356.field5518 = 443;
        } else if (class265.method1704(class74.field999, (byte) 35)) {
            class14.field239 = this.getCodeBase().getHost();
            class356.field5518 = class504.field7529 + 50000;
            class422.field6294 = class504.field7529 + 40000;
        } else if (class74.field999 == class367.field5658) {
            class422.field6294 = class504.field7529 + 40000;
            class356.field5518 = class504.field7529 + 50000;
            class14.field239 = "127.0.0.1";
        }
        class116.field1635 = class356.field5518;
        class391.field5947 = class422.field6294;
        class354.field5497 = class422.field6294;
        class244.field3414 = class14.field239;
        class529.field7815 = class354.field5497;
        if (class393.field5983 == class259.field3610) {
            class133.field1927 = 0;
            class99.field1426 = true;
            class19.field287 = class500.field7449;
            class4.field50 = 16777215;
            class336.field5218 = class238.field3380;
            class301.field4446 = class87.field1199;
            class102.field1461 = class158.field2312;
        } else {
            class336.field5218 = class520.field7710;
            class102.field1461 = class270.field3747;
            class19.field287 = class430.field6400;
            class301.field4446 = class58.field784;
        }
        class232.field3300 = class462.field6766 = class145.field2080 = class117.field1652 = new short[256];
        if (class469.field6854 == 3) {
            class12.field195 = class504.field7529;
        }
        class382.field5821 = class313.method2030(100, class245.field3430);
        class346.field5419 = class262.method1687(class245.field3430, (byte) -45, true);
        class379.field5784 = class266.method1707((byte) -18);
        if (arg0 != 0) {
            this.method469(21);
        }
        if (class379.field5784 != null) {
            class379.field5784.method437(class245.field3430, false);
        }
        class206.field2910 = class469.field6854;
        try {
            if (class419.field6254.field6852 != null) {
                class460.field6748 = new class87(class419.field6254.field6852, 5200, 0);
                for (int var3 = 0; var3 < 30; var3++) {
                    class195.field2769[var3] = new class87(class419.field6254.field6863[var3], 6000, 0);
                }
                class207.field2929 = new class87(class419.field6254.field6856, 6000, 0);
                class15.field251 = new class80(255, class460.field6748, class207.field2929, 500000);
                class518.field7679 = new class87(class419.field6254.field6862, 24, 0);
                class419.field6254.field6856 = null;
                class419.field6254.field6863 = null;
                class419.field6254.field6862 = null;
                class419.field6254.field6852 = null;
            }
        } catch (IOException var4) {
            class518.field7679 = null;
            class207.field2929 = null;
            class15.field251 = null;
            class460.field6748 = null;
        }
        if (class74.field999 != class140.field2031) {
            class430.field6388 = true;
        }
        class180.field2572 = (class393.field5983 == class23.field352 ? class359.field5564 : class146.field2094).method2335((byte) -100, class288.field4292);
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V", line = 3458)
    public static final void method470() {
        int var0 = class442.field6574;
        int[] var1 = class320.field4896;
        int var2 = class206.field2920 ? var0 : class25.field411 + var0;
        for (int var3 = 0; var3 < var2; var3++) {
            class337 var4;
            if (var3 < var0) {
                var4 = class439.field6539[var1[var3]];
            } else {
                var4 = class151.field2174[class259.field3609[var3 - var0]];
            }
            if (var4.field5249 >= 0) {
                int var5 = var4.method2091(-15245);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field2217 & 0x7F) == 0 && (var4.field2215 & 0x7F) == 0) {
                        continue;
                    }
                } else if ((var4.field2217 & 0x7F) == 64 && (var4.field2215 & 0x7F) == 64) {
                    continue;
                }
                if (var4 instanceof class322 && var4.field5341 != null && class405.field6116 >= var4.field5341.field6137 && class405.field6116 < var4.field5341.field6125) {
                    ((class322) var4).field4968 = false;
                }
                var4.field2222 = class500.method2985(var4.field2217, 5293, var4.field2210, var4.field2215);
                class223.method1511(var4, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V", line = 3503)
    public final void method471(boolean arg0) {
        field933++;
        if (class144.field2077 == 1000) {
            return;
        }
        class405.field6116++;
        if (arg0) {
            field943 = null;
        }
        if ((class405.field6116 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class213.field2983 = var2.get(11) * 600 + var2.get(12) * 10 + var2.get(13) / 6;
            class529.field7812.setSeed((long) class213.field2983);
        }
        if ((class405.field6116 % 50) == 0) {
            class394.field5986 = class372.field5708;
            class512.field7599 = class170.field2465;
            class372.field5708 = 0;
            class170.field2465 = 0;
        }
        this.method462(-52);
        if (class453.field6656 != null) {
            class453.field6656.method2577((byte) 101);
        }
        class188.method1324(-9815);
        class382.field5821.method707((byte) -84);
        class346.field5419.method801(-8379);
        if (class379.field5784 != null) {
            int var3 = class379.field5784.method439(Integer.MAX_VALUE);
            class338.field5349 = var3;
        }
        if (class337.field5242 != null) {
            class337.field5242.method1119((int) class264.method1698(!arg0));
        }
        class104.method704(-72);
        class12.field199 = 0;
        for (class333 var4 = class382.field5821.method708(-17); var4 != null && class12.field199 < 128; var4 = class382.field5821.method708(127)) {
            if (var4.method1947((byte) -106) != 1) {
                char var5 = var4.method1945((byte) 126);
                if (!class126.method807((byte) 106) || var5 != '`' && var5 != '§') {
                    class453.field6651[class12.field199] = var4;
                    class12.field199++;
                } else if (class16.method135(-8337)) {
                    class163.method1156((byte) 113);
                } else {
                    class117.method759(0);
                }
            }
        }
        for (class414 var6 = class346.field5419.method808(104); var6 != null; var6 = class346.field5419.method808(81)) {
            int var7 = var6.method715((byte) -26);
            if (var7 == -1) {
                class217.field3018.method1958(var6, 0);
            } else if (class126.method809((byte) 88, var7)) {
                class94.field1369.method1958(var6, 0);
            }
            if (class94.field1369.method1967(112) > 10) {
                class94.field1369.method1962(0);
            }
        }
        if (class16.method135(-8337)) {
            class396.method2436(-45);
        }
        if (class144.field2077 == 0) {
            this.method458(true);
            class55.method373(0);
        } else if (class144.field2077 == 5) {
            this.method458(true);
            class55.method373(0);
        } else if (class144.field2077 == 25 || class144.field2077 == 28) {
            class102.method689(-103);
        }
        if (class144.field2077 == 10) {
            this.method461((byte) -106);
            class292.method1889(true);
            class255.method1660(-122);
            class167.method1174((byte) -116);
        } else if (class144.field2077 == 30) {
            class483.method2884(27757);
        } else if (class144.field2077 == 40) {
            class167.method1174((byte) -114);
            if (class376.field5748 != -3 && class376.field5748 != 2 && class376.field5748 != 15) {
                class19.method146(0);
            }
        }
        class5.method46((byte) 66, class337.field5242);
        class94.field1369.method1962(0);
    }
}
