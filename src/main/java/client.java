import jagex3.jagmisc.jagmisc;
import java.awt.Canvas;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Rectangle;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.GregorianCalendar;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class225 {

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "Llc;")
    public static class435 field6404 = new class435(7, -2);

    @OriginalMember(owner = "client!client", name = "zb", descriptor = "Lgr;")
    public static class530 field6414 = new class530(71, -1);

    @OriginalMember(owner = "client!client", name = "Db", descriptor = "Ljava/lang/String;")
    public static String field6418 = null;

    @OriginalMember(owner = "client!client", name = "Ab", descriptor = "F")
    public static float field6415;

    @OriginalMember(owner = "client!client", name = "D", descriptor = "I")
    public static int field6396;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field6397;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field6398;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field6399;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field6400;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field6401;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field6402;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field6403;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
    public static int field6405;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
    public static int field6406;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
    public static int field6407;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
    public static int field6408;

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
    public static int field6409;

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
    public static int field6410;

    @OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
    public static int field6411;

    @OriginalMember(owner = "client!client", name = "xb", descriptor = "I")
    public static int field6412;

    @OriginalMember(owner = "client!client", name = "yb", descriptor = "Lgw;")
    public static class685 field6413;

    // $FF: synthetic field
    @OriginalMember(owner = "client!client", name = "Eb", descriptor = "Ljava/lang/Class;")
    public static Class field6419;

    @OriginalMember(owner = "client!client", name = "Fb", descriptor = "Z")
    public static boolean field6420;

    @OriginalMember(owner = "client!client", name = "Bb", descriptor = "[I")
    public static int[] field6416;

    @OriginalMember(owner = "client!client", name = "Cb", descriptor = "[Lqk;")
    public static class146[] field6417;

    // $FF: synthetic method
    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2740(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lqk;IIIIIIIIIII)V", line = 5)
    public static final void method2722(class146[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        label812: for (int var12 = 0; var12 < arg0.length; var12++) {
            class146 var13 = arg0[var12];
            if (var13 != null && var13.field2109 == arg1) {
                int var14 = var13.field2103 + arg6;
                int var15 = var13.field1992 + arg7;
                int var16;
                int var17;
                int var18;
                int var19;
                if (var13.field2112 == 2) {
                    var16 = arg2;
                    var17 = arg3;
                    var18 = arg4;
                    var19 = arg5;
                } else {
                    int var20 = var13.field2016 + var14;
                    int var21 = var13.field1997 + var15;
                    if (var13.field2112 == 9) {
                        var20++;
                        var21++;
                    }
                    var16 = var14 > arg2 ? var14 : arg2;
                    var17 = var15 > arg3 ? var15 : arg3;
                    var18 = var20 < arg4 ? var20 : arg4;
                    var19 = var21 < arg5 ? var21 : arg5;
                }
                if (var13.field2112 == 0 || var13.field1983 || method2732(var13).field6793 != 0 || class83.field1211 == var13 || class642.field9139 == var13.field1990 || class350.field5200 == var13.field1990) {
                    if (!method2735(var13)) {
                        int var22 = 0;
                        int var23 = 0;
                        if (class416.field5919) {
                            var22 = class352.method2243(-114);
                            var23 = class695.method3915((byte) 86);
                        }
                        if (class131.field1810 == var13 && class350.method2238(100, class131.field1810) != null) {
                            class753.field10505 = true;
                            class502.field7297 = var14;
                            class537.field7800 = var15;
                        }
                        if (var13.field2080 || var16 < var18 && var17 < var19) {
                            if (var13.field1987 && arg10 >= var16 && arg11 >= var17 && arg10 < var18 && arg11 < var19) {
                                for (class362 var24 = (class362) class441.field6290.method3565(-84); var24 != null; var24 = (class362) class441.field6290.method3561((byte) 20)) {
                                    if (var24.field5292) {
                                        var24.method2656((byte) 119);
                                        var24.field5304.field2042 = false;
                                    }
                                }
                                if (class671.field9571 == 0) {
                                    class131.field1810 = null;
                                    class83.field1211 = null;
                                }
                                class520.field7494 = 0;
                                class656.field9396 = false;
                                class252.field3647 = false;
                                if (!class147.field2154) {
                                    class423.method2601(-29372);
                                }
                            }
                            boolean var25;
                            if (class535.field7789.method2459(-32213) + var22 >= var16 && class535.field7789.method2452(-93) + var23 >= var17 && class535.field7789.method2459(-32213) + var22 < var18 && class535.field7789.method2452(-114) + var23 < var19) {
                                var25 = true;
                            } else {
                                var25 = false;
                            }
                            if (!class549.field7997 && var25) {
                                if (var13.field2077 >= 0) {
                                    class548.field7953 = var13.field2077;
                                } else if (var13.field1987) {
                                    class548.field7953 = -1;
                                }
                            }
                            if (!class147.field2154 && arg10 >= var16 && arg11 >= var17 && arg10 < var18 && arg11 < var19) {
                                class739.method4125(var13, arg11 - var15, arg10 - var14, (byte) 117);
                            }
                            boolean var26 = false;
                            if (class535.field7789.method2454(-19704) && var25) {
                                var26 = true;
                            }
                            boolean var27 = false;
                            class553 var28 = (class553) class466.field6643.method3565(103);
                            if (var28 != null && var28.method762(-4) == 0 && var28.method760(124) + var22 >= var16 && var28.method761(false) + var23 >= var17 && var28.method760(126) + var22 < var18 && var28.method761(false) + var23 < var19) {
                                var27 = true;
                            }
                            if (var13.field2126 != null && !class651.method3749(23)) {
                                for (int var29 = 0; var29 < var13.field2126.length; var29++) {
                                    if (class253.field3661.method2780(var13.field2126[var29], 114)) {
                                        if (var13.field2074 == null || class703.field9918 >= var13.field2074[var29]) {
                                            byte var30 = var13.field1996[var29];
                                            if (var30 == 0 || ((var30 & 0x8) == 0 || !class253.field3661.method2780(86, 94) && !class253.field3661.method2780(82, 70) && !class253.field3661.method2780(81, 97)) && ((var30 & 0x2) == 0 || class253.field3661.method2780(86, 73)) && ((var30 & 0x1) == 0 || class253.field3661.method2780(82, 64)) && ((var30 & 0x4) == 0 || class253.field3661.method2780(81, 111))) {
                                                if (var29 < 10) {
                                                    class555.method3333(26952, "", var29 + 1, -1, var13.field2079);
                                                } else if (var29 == 10) {
                                                    class61.method571(false);
                                                    class478 var31 = method2732(var13);
                                                    class355.method2260(var31.field6790, var13, 0, var31.method2860(false));
                                                    class297.field4060 = class242.method1663(var13, 69);
                                                    if (class297.field4060 == null) {
                                                        class297.field4060 = "Null";
                                                    }
                                                    class377.field5459 = var13.field2024 + "<col=ffffff>";
                                                }
                                                int var32 = var13.field1989[var29];
                                                if (var13.field2074 == null) {
                                                    var13.field2074 = new int[var13.field2126.length];
                                                }
                                                if (var32 == 0) {
                                                    var13.field2074[var29] = Integer.MAX_VALUE;
                                                } else {
                                                    var13.field2074[var29] = class703.field9918 + var32;
                                                }
                                            }
                                        }
                                    } else if (var13.field2074 != null) {
                                        var13.field2074[var29] = 0;
                                    }
                                }
                            }
                            if (var27) {
                                class26.method110(var13, (byte) 116, var23 + var28.method761(false) - var15, var22 + var28.method760(123) - var14);
                            }
                            if (class131.field1810 != null && class131.field1810 != var13 && var25 && method2732(var13).method2858(false)) {
                                class66.field1022 = var13;
                            }
                            if (class83.field1211 == var13) {
                                class601.field8527 = true;
                                class187.field2616 = var14;
                                class600.field8521 = var15;
                            }
                            if (var13.field1983 || var13.field1990 != 0) {
                                if (var25 && class428.field6170 != 0 && var13.field1972 != null) {
                                    class362 var33 = new class362();
                                    var33.field5292 = true;
                                    var33.field5304 = var13;
                                    var33.field5289 = class428.field6170;
                                    var33.field5297 = var13.field1972;
                                    class441.field6290.method3559(var33, (byte) 12);
                                }
                                if (class131.field1810 != null || class147.field2154 || class451.field6456 != var13.field1990 && class520.field7494 > 0) {
                                    var27 = false;
                                    var26 = false;
                                    var25 = false;
                                }
                                if (var13.field1990 != 0) {
                                    if (class543.field7887 == var13.field1990 || class475.field6768 == var13.field1990) {
                                        class594.field8450 = var13;
                                        if (class728.field10226 != null) {
                                            class728.field10226.method3374(class211.field3164, (byte) 49, var13.field1997);
                                        }
                                        if (class543.field7887 == var13.field1990) {
                                            if (class147.field2154 || arg10 < var16 || arg11 < var17 || arg10 >= var18 || arg11 >= var19) {
                                                continue;
                                            }
                                            class684.method3881(arg9, class211.field3164, arg8, true);
                                            class175 var34 = (class175) class597.field8488.method1527(67);
                                            while (true) {
                                                if (var34 == null) {
                                                    continue label812;
                                                }
                                                if (arg10 >= var34.field2452 && arg10 < var34.field2456 && arg11 >= var34.field2453 && arg11 < var34.field2454) {
                                                    class423.method2601(-29372);
                                                    class623.method3601(var34.field2458, -27363);
                                                }
                                                var34 = (class175) class597.field8488.method1523(true);
                                            }
                                        }
                                    }
                                    if (class642.field9139 == var13.field1990) {
                                        if (var13.method1030(-64, class211.field3164) == null || class42.field710 != 0 && class42.field710 != 3 || class147.field2154 || arg10 < var16 || arg11 < var17 || arg10 >= var18 || arg11 >= var19) {
                                            continue;
                                        }
                                        int var35 = arg10 - var14;
                                        int var36 = arg11 - var15;
                                        int var37 = var13.field2025[var36];
                                        if (var35 < var37 || var35 > var13.field2111[var36] + var37) {
                                            continue;
                                        }
                                        int var38 = var35 - var13.field2016 / 2;
                                        int var39 = var36 - var13.field1997 / 2;
                                        int var40;
                                        if (class165.field2351 == 4) {
                                            var40 = (int) class680.field9668 & 0x3FFF;
                                        } else {
                                            var40 = (int) class680.field9668 + class225.field3350 & 0x3FFF;
                                        }
                                        int var41 = class125.field1736[var40];
                                        int var42 = class125.field1729[var40];
                                        if (class165.field2351 != 4) {
                                            var41 = (class17.field162 + 256) * var41 >> 8;
                                            var42 = (class17.field162 + 256) * var42 >> 8;
                                        }
                                        int var43 = var38 * var42 + var39 * var41 >> 14;
                                        int var44 = var39 * var42 - var38 * var41 >> 14;
                                        int var45;
                                        int var46;
                                        if (class165.field2351 == 4) {
                                            var45 = (class472.field6697 >> 9) + (var43 >> 2);
                                            var46 = (class658.field9426 >> 9) - (var44 >> 2);
                                        } else {
                                            int var47 = (class108.field1536.method2053(true) - 1) * 256;
                                            var45 = (class108.field1536.field3923 - var47 >> 9) + (var43 >> 2);
                                            var46 = (class108.field1536.field3916 - var47 >> 9) - (var44 >> 2);
                                        }
                                        if (class549.field7997 && (class538.field7820 & 0x40) != 0) {
                                            class146 var48 = class590.method3467(1, class231.field3475, class250.field3640);
                                            if (var48 == null) {
                                                class61.method571(false);
                                            } else {
                                                class145.method1016(class297.field4060, true, var46, true, " ->", -118, var45, (long) (var13.field2010 << 0 | var13.field2079), class243.field3582, 1L, 47, var13.field2131, false);
                                            }
                                            continue;
                                        }
                                        if (class528.field7683 == class48.field790) {
                                            class145.method1016(class608.field8647.method3543(-24350, class45.field748), true, var46, true, "", -119, var45, 0L, -1, 1L, 18, -1, false);
                                        }
                                        class145.method1016(class527.field7652, true, var46, true, "", -125, var45, 0L, class121.field1646, 1L, 5, -1, false);
                                        continue;
                                    }
                                    if (class451.field6456 == var13.field1990) {
                                        class344.field4731 = var13;
                                        if (var25) {
                                            class656.field9396 = true;
                                        }
                                        if (var27) {
                                            int var49 = (int) ((double) (var22 + var28.method760(125) - var14 - var13.field2016 / 2) * 2.0D / (double) class664.field9492);
                                            int var50 = (int) (-((double) (var23 + var28.method761(false) - var15 - var13.field1997 / 2) * 2.0D / (double) class664.field9492));
                                            int var51 = class488.field7039 + var49 + class664.field9502;
                                            int var52 = class78.field1135 + var50 + class664.field9498;
                                            class685 var53 = class528.method3193(-26132);
                                            if (var53 == null) {
                                                continue;
                                            }
                                            int[] var54 = new int[3];
                                            var53.method3893(var51, var54, var52, -112);
                                            if (var54 != null) {
                                                if (class253.field3661.method2780(82, 125) && class598.field8507 > 0) {
                                                    class619.method3592(var54[2], var54[0], var54[1], -71);
                                                    continue;
                                                }
                                                class252.field3647 = true;
                                                class695.field9832 = var54[0];
                                                class517.field7447 = var54[1];
                                                class556.field8084 = var54[2];
                                            }
                                            class520.field7494 = 1;
                                            class226.field3371 = false;
                                            class416.field5920 = class535.field7789.method2459(-32213);
                                            class285.field3968 = class535.field7789.method2452(-121);
                                            continue;
                                        }
                                        if (var26 && class520.field7494 > 0) {
                                            if (class520.field7494 == 1 && (class416.field5920 != class535.field7789.method2459(-32213) || class285.field3968 != class535.field7789.method2452(-111))) {
                                                class487.field7025 = class488.field7039;
                                                class475.field6764 = class78.field1135;
                                                class520.field7494 = 2;
                                            }
                                            if (class520.field7494 == 2) {
                                                class226.field3371 = true;
                                                class348.method2209(-125, class487.field7025 + (int) ((double) (class416.field5920 - class535.field7789.method2459(-32213)) * 2.0D / (double) class664.field9493));
                                                class435.method2671(-1, class475.field6764 - (int) ((double) (class285.field3968 - class535.field7789.method2452(-126)) * 2.0D / (double) class664.field9493));
                                            }
                                            continue;
                                        }
                                        if (class520.field7494 > 0 && !class226.field3371) {
                                            if ((class316.field4268 == 1 || class91.method708(-2001)) && class456.field6499 > 2) {
                                                class187.method1325(class285.field3968, class416.field5920, 107);
                                            } else if (class12.method58((byte) -3)) {
                                                class187.method1325(class285.field3968, class416.field5920, -67);
                                            }
                                        }
                                        class520.field7494 = 0;
                                        continue;
                                    }
                                    if (class475.field6766 == var13.field1990) {
                                        if (var26) {
                                            class757.method4207((byte) -6, var22 + class535.field7789.method2459(-32213) - var14, var13.field1997, var13.field2016, var23 + class535.field7789.method2452(-96) - var15);
                                        }
                                        continue;
                                    }
                                    if (class350.field5200 == var13.field1990) {
                                        class303.method1893(0, var13, var15, var14);
                                        continue;
                                    }
                                }
                                if (!var13.field2037 && var27) {
                                    var13.field2037 = true;
                                    if (var13.field2006 != null) {
                                        class362 var55 = new class362();
                                        var55.field5292 = true;
                                        var55.field5304 = var13;
                                        var55.field5300 = var22 + var28.method760(123) - var14;
                                        var55.field5289 = var23 + var28.method761(false) - var15;
                                        var55.field5297 = var13.field2006;
                                        class441.field6290.method3559(var55, (byte) 12);
                                    }
                                }
                                if (var13.field2037 && var26 && var13.field2043 != null) {
                                    class362 var56 = new class362();
                                    var56.field5292 = true;
                                    var56.field5304 = var13;
                                    var56.field5300 = var22 + class535.field7789.method2459(-32213) - var14;
                                    var56.field5289 = var23 + class535.field7789.method2452(-95) - var15;
                                    var56.field5297 = var13.field2043;
                                    class441.field6290.method3559(var56, (byte) 12);
                                }
                                if (var13.field2037 && !var26) {
                                    var13.field2037 = false;
                                    if (var13.field2065 != null) {
                                        class362 var57 = new class362();
                                        var57.field5292 = true;
                                        var57.field5304 = var13;
                                        var57.field5300 = var22 + class535.field7789.method2459(-32213) - var14;
                                        var57.field5289 = var23 + class535.field7789.method2452(-86) - var15;
                                        var57.field5297 = var13.field2065;
                                        class535.field7779.method3559(var57, (byte) 12);
                                    }
                                }
                                if (var26 && var13.field2085 != null) {
                                    class362 var58 = new class362();
                                    var58.field5292 = true;
                                    var58.field5304 = var13;
                                    var58.field5300 = var22 + class535.field7789.method2459(-32213) - var14;
                                    var58.field5289 = var23 + class535.field7789.method2452(-77) - var15;
                                    var58.field5297 = var13.field2085;
                                    class441.field6290.method3559(var58, (byte) 12);
                                }
                                if (!var13.field2042 && var25) {
                                    var13.field2042 = true;
                                    if (var13.field2022 != null) {
                                        class362 var59 = new class362();
                                        var59.field5292 = true;
                                        var59.field5304 = var13;
                                        var59.field5300 = var22 + class535.field7789.method2459(-32213) - var14;
                                        var59.field5289 = var23 + class535.field7789.method2452(-108) - var15;
                                        var59.field5297 = var13.field2022;
                                        class441.field6290.method3559(var59, (byte) 12);
                                    }
                                }
                                if (var13.field2042 && var25 && var13.field2063 != null) {
                                    class362 var60 = new class362();
                                    var60.field5292 = true;
                                    var60.field5304 = var13;
                                    var60.field5300 = var22 + class535.field7789.method2459(-32213) - var14;
                                    var60.field5289 = var23 + class535.field7789.method2452(-122) - var15;
                                    var60.field5297 = var13.field2063;
                                    class441.field6290.method3559(var60, (byte) 12);
                                }
                                if (var13.field2042 && !var25) {
                                    var13.field2042 = false;
                                    if (var13.field1985 != null) {
                                        class362 var61 = new class362();
                                        var61.field5292 = true;
                                        var61.field5304 = var13;
                                        var61.field5300 = var22 + class535.field7789.method2459(-32213) - var14;
                                        var61.field5289 = var23 + class535.field7789.method2452(-98) - var15;
                                        var61.field5297 = var13.field1985;
                                        class535.field7779.method3559(var61, (byte) 12);
                                    }
                                }
                                if (var13.field2044 != null) {
                                    class362 var62 = new class362();
                                    var62.field5304 = var13;
                                    var62.field5297 = var13.field2044;
                                    class99.field1438.method3559(var62, (byte) 12);
                                }
                                if (var13.field2003 != null && class634.field8947 > var13.field2072) {
                                    if (var13.field2127 == null || class634.field8947 - var13.field2072 > 32) {
                                        class362 var67 = new class362();
                                        var67.field5304 = var13;
                                        var67.field5297 = var13.field2003;
                                        class441.field6290.method3559(var67, (byte) 12);
                                    } else {
                                        label699: for (int var63 = var13.field2072; var63 < class634.field8947; var63++) {
                                            int var64 = class490.field7056[var63 & 0x1F];
                                            for (int var65 = 0; var65 < var13.field2127.length; var65++) {
                                                if (var13.field2127[var65] == var64) {
                                                    class362 var66 = new class362();
                                                    var66.field5304 = var13;
                                                    var66.field5297 = var13.field2003;
                                                    class441.field6290.method3559(var66, (byte) 12);
                                                    break label699;
                                                }
                                            }
                                        }
                                    }
                                    var13.field2072 = class634.field8947;
                                }
                                if (var13.field2005 != null && class311.field4206 > var13.field2122) {
                                    if (var13.field2058 == null || class311.field4206 - var13.field2122 > 32) {
                                        class362 var72 = new class362();
                                        var72.field5304 = var13;
                                        var72.field5297 = var13.field2005;
                                        class441.field6290.method3559(var72, (byte) 12);
                                    } else {
                                        label675: for (int var68 = var13.field2122; var68 < class311.field4206; var68++) {
                                            int var69 = class259.field3704[var68 & 0x1F];
                                            for (int var70 = 0; var70 < var13.field2058.length; var70++) {
                                                if (var13.field2058[var70] == var69) {
                                                    class362 var71 = new class362();
                                                    var71.field5304 = var13;
                                                    var71.field5297 = var13.field2005;
                                                    class441.field6290.method3559(var71, (byte) 12);
                                                    break label675;
                                                }
                                            }
                                        }
                                    }
                                    var13.field2122 = class311.field4206;
                                }
                                if (var13.field2035 != null && class513.field7436 > var13.field1974) {
                                    if (var13.field2028 == null || class513.field7436 - var13.field1974 > 32) {
                                        class362 var77 = new class362();
                                        var77.field5304 = var13;
                                        var77.field5297 = var13.field2035;
                                        class441.field6290.method3559(var77, (byte) 12);
                                    } else {
                                        label651: for (int var73 = var13.field1974; var73 < class513.field7436; var73++) {
                                            int var74 = class192.field2700[var73 & 0x1F];
                                            for (int var75 = 0; var75 < var13.field2028.length; var75++) {
                                                if (var13.field2028[var75] == var74) {
                                                    class362 var76 = new class362();
                                                    var76.field5304 = var13;
                                                    var76.field5297 = var13.field2035;
                                                    class441.field6290.method3559(var76, (byte) 12);
                                                    break label651;
                                                }
                                            }
                                        }
                                    }
                                    var13.field1974 = class513.field7436;
                                }
                                if (var13.field2135 != null && class666.field9523 > var13.field2001) {
                                    if (var13.field2104 == null || class666.field9523 - var13.field2001 > 32) {
                                        class362 var82 = new class362();
                                        var82.field5304 = var13;
                                        var82.field5297 = var13.field2135;
                                        class441.field6290.method3559(var82, (byte) 12);
                                    } else {
                                        label627: for (int var78 = var13.field2001; var78 < class666.field9523; var78++) {
                                            int var79 = class70.field1075[var78 & 0x1F];
                                            for (int var80 = 0; var80 < var13.field2104.length; var80++) {
                                                if (var13.field2104[var80] == var79) {
                                                    class362 var81 = new class362();
                                                    var81.field5304 = var13;
                                                    var81.field5297 = var13.field2135;
                                                    class441.field6290.method3559(var81, (byte) 12);
                                                    break label627;
                                                }
                                            }
                                        }
                                    }
                                    var13.field2001 = class666.field9523;
                                }
                                if (var13.field2121 != null && class519.field7485 > var13.field2123) {
                                    if (var13.field1999 == null || class519.field7485 - var13.field2123 > 32) {
                                        class362 var87 = new class362();
                                        var87.field5304 = var13;
                                        var87.field5297 = var13.field2121;
                                        class441.field6290.method3559(var87, (byte) 12);
                                    } else {
                                        label603: for (int var83 = var13.field2123; var83 < class519.field7485; var83++) {
                                            int var84 = class249.field3625[var83 & 0x1F];
                                            for (int var85 = 0; var85 < var13.field1999.length; var85++) {
                                                if (var13.field1999[var85] == var84) {
                                                    class362 var86 = new class362();
                                                    var86.field5304 = var13;
                                                    var86.field5297 = var13.field2121;
                                                    class441.field6290.method3559(var86, (byte) 12);
                                                    break label603;
                                                }
                                            }
                                        }
                                    }
                                    var13.field2123 = class519.field7485;
                                }
                                if (class133.field1846 > var13.field2119 && var13.field1998 != null) {
                                    class362 var88 = new class362();
                                    var88.field5304 = var13;
                                    var88.field5297 = var13.field1998;
                                    class441.field6290.method3559(var88, (byte) 12);
                                }
                                if (class363.field5307 > var13.field2119 && var13.field2040 != null) {
                                    class362 var89 = new class362();
                                    var89.field5304 = var13;
                                    var89.field5297 = var13.field2040;
                                    class441.field6290.method3559(var89, (byte) 12);
                                }
                                if (class80.field1147 > var13.field2119 && var13.field2114 != null) {
                                    class362 var90 = new class362();
                                    var90.field5304 = var13;
                                    var90.field5297 = var13.field2114;
                                    class441.field6290.method3559(var90, (byte) 12);
                                }
                                if (class204.field3062 > var13.field2119 && var13.field2032 != null) {
                                    class362 var91 = new class362();
                                    var91.field5304 = var13;
                                    var91.field5297 = var13.field2032;
                                    class441.field6290.method3559(var91, (byte) 12);
                                }
                                if (class590.field8390 > var13.field2119 && var13.field2048 != null) {
                                    class362 var92 = new class362();
                                    var92.field5304 = var13;
                                    var92.field5297 = var13.field2048;
                                    class441.field6290.method3559(var92, (byte) 12);
                                }
                                var13.field2119 = class152.field2225;
                                if (var13.field1977 != null) {
                                    for (int var93 = 0; var93 < class518.field7470; var93++) {
                                        class362 var94 = new class362();
                                        var94.field5304 = var13;
                                        var94.field5290 = class282.field3945[var93].method2800((byte) -110);
                                        var94.field5293 = class282.field3945[var93].method2802(-17007);
                                        var94.field5297 = var13.field1977;
                                        class441.field6290.method3559(var94, (byte) 12);
                                    }
                                }
                                if (class486.field7004 && var13.field2110 != null) {
                                    class362 var95 = new class362();
                                    var95.field5304 = var13;
                                    var95.field5297 = var13.field2110;
                                    class441.field6290.method3559(var95, (byte) 12);
                                }
                            }
                            if (var13.field2112 == 5 && var13.field2057 != -1) {
                                var13.method1028(class154.field2237, (byte) -128, class455.field6490).method3374(class211.field3164, (byte) 49, var13.field1997);
                            }
                            class468.method2825(var13, true);
                            if (var13.field2112 == 0) {
                                method2722(arg0, var13.field2079, var16, var17, var18, var19, var14 - var13.field1988, var15 - var13.field1970, arg8, arg9, arg10, arg11);
                                if (var13.field2019 != null) {
                                    method2722(var13.field2019, var13.field2079, var16, var17, var18, var19, var14 - var13.field1988, var15 - var13.field1970, arg8, arg9, arg10, arg11);
                                }
                                class182 var96 = (class182) class591.field8410.method4020((long) var13.field2079, (byte) -118);
                                if (var96 != null) {
                                    if (class528.field7683 == class391.field5635 && var96.field2507 == 0 && !class147.field2154 && var25 && !class284.field3960) {
                                        class423.method2601(-29372);
                                    }
                                    class460.method2789(arg9, var19, arg11, arg10, arg8, var96.field2505, true, var15, var14, var17, var16, var18);
                                }
                            }
                        }
                    }
                } else if (var16 < var18 && var17 < var19) {
                    class468.method2825(var13, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V", line = 915)
    public static final void method2723() {
        class63.field1006 = 0;
        for (int var0 = 0; var0 < class619.field8816; var0++) {
            class571 var1 = ((class63) class389.field5608.method4020((long) class545.field7927[var0], (byte) -69)).field1004;
            if (var1.field4612 && var1.method2064(73) != -1) {
                int var2 = (var1.method2053(true) - 1) * 256 + 252;
                int var3 = var1.field3923 - var2 >> 9;
                int var4 = var1.field3916 - var2 >> 9;
                class335 var5 = class643.method3708(var3, var1.field3920, var4, 256);
                if (var5 != null) {
                    int var6 = var5.field4592;
                    if (var5 instanceof class571) {
                        var6 += 2048;
                    }
                    if (var5.field4607 == 0 && var5.method2064(63) != -1) {
                        class109.field1564[class63.field1006] = var6;
                        class145.field1967[class63.field1006] = var6;
                        class63.field1006++;
                        var5.field4607++;
                    }
                    class109.field1564[class63.field1006] = var6;
                    class145.field1967[class63.field1006] = var1.field4592 + 2048;
                    class63.field1006++;
                    var5.field4607++;
                }
            }
        }
        class589.method3461(class145.field1967, class63.field1006 - 1, class109.field1564, (byte) 123, 0);
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V", line = 963)
    public final void method1573(int arg0) {
        if (arg0 > -36) {
            field6418 = null;
        }
        field6399++;
        if (class243.field3580.field7975.method3775(false) != 2) {
            this.method2730(-124);
            return;
        }
        try {
            this.method2730(-126);
        } catch (ThreadDeath var4) {
            throw var4;
        } catch (Throwable var5) {
            class705.method3952(var5.getMessage() + " (Recovered) " + this.method1556(9), var5, -29913);
            class403.method2449(false, 0, -89);
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 987)
    public static final void main(String[] arg0) {
        field6403++;
        try {
            if (arg0.length != 6) {
                class126.method885(1, "Argument count");
            }
            class342.field4706 = new class518();
            class342.field4706.field7472 = Integer.parseInt(arg0[0]);
            class542.field7861 = new class518();
            class542.field7861.field7472 = Integer.parseInt(arg0[1]);
            class224.field3306 = new class518();
            class224.field3306.field7472 = Integer.parseInt(arg0[2]);
            class25.field223 = class246.field3590;
            if (arg0[3].equals("live")) {
                class283.field3959 = class32.field302;
            } else if (arg0[3].equals("rc")) {
                class283.field3959 = class671.field9558;
            } else if (arg0[3].equals("wip")) {
                class283.field3959 = class291.field4014;
            } else {
                class126.method885(1, "modewhat");
            }
            class45.field748 = class519.method3154(127, arg0[4]);
            if (class45.field748 == -1) {
                if (arg0[4].equals("english")) {
                    class45.field748 = 0;
                } else if (arg0[4].equals("german")) {
                    class45.field748 = 1;
                } else {
                    class126.method885(1, "language");
                }
            }
            class326.field4428 = false;
            class525.field7640 = false;
            if (arg0[5].equals("game0")) {
                class528.field7683 = class391.field5635;
            } else if (arg0[5].equals("game1")) {
                class528.field7683 = class48.field790;
            } else if (arg0[5].equals("game2")) {
                class528.field7683 = class165.field2352;
            } else if (arg0[5].equals("game3")) {
                class528.field7683 = class332.field4504;
            } else {
                class126.method885(1, "game");
            }
            class461.field6558 = 0L;
            class565.field8191 = "";
            class50.field813 = 0;
            class343.field4709 = true;
            class297.field4063 = true;
            class265.field3797 = false;
            class355.field5245 = false;
            class100.field1445 = null;
            field6418 = null;
            class266.field3801 = class528.field7683.field4258;
            class616.field8781 = 0;
            class360.field5276 = 0;
            client var1 = new client();
            class660.field9437 = var1;
            var1.method1565(false, 37, 630, class528.field7683.field4260, 1024, 768, class283.field3959.method3613(false) + 32, -106);
            class696.field9834.setLocation(40, 40);
        } catch (Exception var3) {
            class705.method3952(null, var3, -29913);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)Ljava/lang/String;", line = 1076)
    public final String method1556(int arg0) {
        if (arg0 != 9) {
            field6404 = null;
        }
        field6407++;
        String var2 = null;
        try {
            var2 = "[1)" + class41.field693 + "," + class71.field1085 + "," + class184.field2546 + "," + class240.field3555 + "|";
            if (class108.field1536 != null) {
                var2 = var2 + "2)" + class687.field9758 + "," + (class108.field1536.field4646[0] + class41.field693) + "," + (class108.field1536.field4645[0] + class71.field1085) + "|";
            }
            var2 = var2 + "3)" + class243.field3580.field7975.method3775(false) + "|4)" + class243.field3580.field8015.method2498(false) + "|5)" + class184.method1305(1) + "|6)" + class68.field1042 + "," + class565.field8187 + "|";
            var2 = var2 + "7)" + class243.field3580.field7991.method3589(false) + "|";
            var2 = var2 + "8)" + class243.field3580.field8007.method435(false) + "|";
            var2 = var2 + "9)" + class243.field3580.field8001.method3761(false) + "|";
            var2 = var2 + "10)" + class243.field3580.field8008.method4186(false) + "|";
            var2 = var2 + "11)" + class243.field3580.field8011.method2959(false) + "|";
            var2 = var2 + "12)" + class243.field3580.field8002.method2026(false) + "|";
            var2 = var2 + "13)" + class597.field8492 + "|";
            var2 = var2 + "14)" + class369.field5392;
            try {
                var2 = var2 + "|15)" + jagmisc.getTotalPhysicalMemory();
            } catch (Throwable var15) {
            }
            try {
                if (class243.field3580.field7975.method3775(false) == 2) {
                    Class var3 = Class.forName("java.lang.ClassLoader");
                    Field var4 = var3.getDeclaredField("nativeLibraries");
                    Class var5 = Class.forName("java.lang.reflect.AccessibleObject");
                    Method var6 = var5.getDeclaredMethod("setAccessible", Boolean.TYPE);
                    var6.invoke(var4, Boolean.TRUE);
                    Vector var7 = (Vector) var4.get((field6419 == null ? (field6419 = method2740("client")) : field6419).getClassLoader());
                    for (int var8 = 0; var7.size() > var8; var8++) {
                        try {
                            Object var9 = var7.elementAt(var8);
                            Field var10 = var9.getClass().getDeclaredField("name");
                            var6.invoke(var10, Boolean.TRUE);
                            try {
                                String var11 = (String) var10.get(var9);
                                if (var11 != null && var11.indexOf("sw3d.dll") != -1) {
                                    Field var12 = var9.getClass().getDeclaredField("handle");
                                    var6.invoke(var12, Boolean.TRUE);
                                    var2 = var2 + "|16)" + Long.toHexString(var12.getLong(var9));
                                    var6.invoke(var12, Boolean.FALSE);
                                }
                            } catch (Throwable var13) {
                            }
                            var6.invoke(var10, Boolean.FALSE);
                        } catch (Throwable var14) {
                        }
                    }
                }
            } catch (Throwable var16) {
            }
            var2 = var2 + "]";
        } catch (Throwable var17) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lqk;)Lqk;", line = 1161)
    public static final class146 method2724(class146 arg0) {
        int var1 = method2732(arg0).method2854(21974);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class250.method1689(arg0.field2109, false);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V", line = 1183)
    public static final void method2725(int arg0) {
        int var1 = class468.field6665;
        int[] var2 = class38.field500;
        int var3 = class386.field5578 ? var1 : class619.field8816 + var1;
        for (int var4 = 0; var4 < var3; var4++) {
            class335 var5;
            if (var4 < var1) {
                var5 = class536.field7796[var2[var4]];
            } else {
                var5 = ((class63) class389.field5608.method4020((long) class545.field7927[var4 - var1], (byte) -94)).field1004;
            }
            if (var5.field3920 == arg0) {
                var5.field4607 = 0;
                if (var5.field4552 < 0) {
                    var5.field4612 = false;
                } else {
                    int var6 = var5.method2053(true);
                    if ((var6 & 0x1) == 0) {
                        if ((var5.field3923 & 0x1FF) != 0 || (var5.field3916 & 0x1FF) != 0) {
                            var5.field4612 = false;
                            continue;
                        }
                    } else if ((var5.field3923 & 0x1FF) != 256 || (var5.field3916 & 0x1FF) != 256) {
                        var5.field4612 = false;
                        continue;
                    }
                    int var10002;
                    if (var6 == 1) {
                        int var7 = var5.field3923 >> 9;
                        int var8 = var5.field3916 >> 9;
                        if (class558.field8115[var7][var8] != var5.field4552) {
                            var5.field4612 = true;
                            continue;
                        }
                        if (class21.field196[var7][var8] > 1) {
                            var10002 = class21.field196[var7][var8]--;
                            var5.field4612 = true;
                            continue;
                        }
                    } else {
                        int var9 = (var6 - 1) * 256 + 252;
                        int var10 = var5.field3923 - var9 >> 9;
                        int var11 = var5.field3916 - var9 >> 9;
                        int var12 = var5.field3923 + var9 >> 9;
                        int var13 = var5.field3916 + var9 >> 9;
                        if (!class416.method2508(var10, 3435, var5.field4552, var13, var12, var11)) {
                            for (int var14 = var10; var14 <= var12; var14++) {
                                for (int var15 = var11; var15 <= var13; var15++) {
                                    if (class558.field8115[var14][var15] == var5.field4552) {
                                        var10002 = class21.field196[var14][var15]--;
                                    }
                                }
                            }
                            var5.field4612 = true;
                            continue;
                        }
                    }
                    var5.field4612 = false;
                    var5.field3922 = class530.method3211(var5.field3916, 2, var5.field3923, var5.field3920);
                    class262.method1734(var5, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V", line = 1298)
    private final void method2726(int arg0) {
        field6398++;
        if (class57.field971 < class488.field7032.field9685) {
            class214.field3215.method3150((byte) -15);
            class121.field1647 = (class488.field7032.field9685 - 1) * 50 * 5;
            if (class121.field1647 > 3000) {
                class121.field1647 = 3000;
            }
            if (class488.field7032.field9685 >= 2 && class488.field7032.field9682 == 6) {
                this.method1575(arg0 ^ 0xFFFFCAA0, "js5connect_outofdate");
                class369.field5392 = 14;
                return;
            }
            if (class488.field7032.field9685 >= 4 && class488.field7032.field9682 == -1) {
                this.method1575(-13658, "js5crc");
                class369.field5392 = 14;
                return;
            }
            if (class488.field7032.field9685 >= 4 && class281.method1801(class369.field5392, (byte) -88)) {
                if (class488.field7032.field9682 == 7 || class488.field7032.field9682 == 9) {
                    this.method1575(-13658, "js5connect_full");
                } else if (class488.field7032.field9682 <= 0) {
                    this.method1575(-13658, "js5io");
                } else if (class275.field3882 == null) {
                    this.method1575(-13658, "js5connect");
                } else {
                    this.method1575(-13658, "js5proxy_" + class275.field3882.trim());
                }
                class369.field5392 = 14;
                return;
            }
        }
        class57.field971 = class488.field7032.field9685;
        if (class121.field1647 > 0) {
            class121.field1647--;
            return;
        }
        try {
            if (arg0 != 6) {
                field6413 = null;
            }
            if (class4.field33 == 0) {
                class163.field2327 = class214.field3215.method3152(class345.field4749, (byte) -128);
                class4.field33++;
            }
            if (class4.field33 == 1) {
                if (class163.field2327.field6198 == 2) {
                    if (class163.field2327.field6200 != null) {
                        class275.field3882 = (String) class163.field2327.field6200;
                    }
                    this.method2733(19702, 1000);
                    return;
                }
                if (class163.field2327.field6198 == 1) {
                    class4.field33++;
                }
            }
            if (class4.field33 == 2) {
                class702.field9899 = new class748((Socket) class163.field2327.field6200, class345.field4749, 25000);
                class479 var2 = new class479(5);
                var2.method2881(class105.field1489.field9838, (byte) 116);
                var2.method2926((byte) -127, 630);
                class702.field9899.method4167(5, 0, 0, var2.field6800);
                class4.field33++;
                class119.field1637 = class465.method2818(arg0 ^ 0xF9);
            }
            if (class4.field33 == 3) {
                if (class281.method1801(class369.field5392, (byte) -113) || class702.field9899.method4166(63) > 0) {
                    int var3 = class702.field9899.method4164(arg0 ^ 0x5269);
                    if (var3 != 0) {
                        this.method2733(19702, var3);
                        return;
                    }
                    class4.field33++;
                } else if (class465.method2818(255) - class119.field1637 > 30000L) {
                    this.method2733(19702, 1001);
                    return;
                }
            }
            if (class4.field33 == 4) {
                boolean var4 = class281.method1801(class369.field5392, (byte) -83) || class693.method3912(-18935, class369.field5392) || class488.method2970(class369.field5392, false);
                class710[] var5 = class710.method3972(true);
                class479 var6 = new class479(var5.length * 4);
                class702.field9899.method4165(var6.field6800, var6.field6800.length, -52, 0);
                for (int var7 = 0; var7 < var5.length; var7++) {
                    var5[var7].method3970((byte) -69, var6.method2868(-34));
                }
                class488.field7032.method3862(class702.field9899, !var4, arg0 ^ 0xFFFFFFBA);
                class4.field33 = 0;
                class163.field2327 = null;
                class702.field9899 = null;
            }
        } catch (IOException var8) {
            this.method2733(19702, 1002);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V", line = 1468)
    public final void method1560(boolean arg0) {
        field6400++;
        if (class577.field8287) {
            class424.method2627(false);
        }
        class176.method1265(false);
        if (class211.field3164 != null) {
            class211.field3164.method3266(1);
        }
        if (class214.field3211 != null) {
            class702.method3948(class345.field4749, 0, class214.field3211);
            class214.field3211 = null;
        }
        if (class325.field4415 != null) {
            class325.field4415.method1581(false);
            class325.field4415 = null;
        }
        class135.method960(0);
        class488.field7032.method3869(104);
        if (!arg0) {
            return;
        }
        class713.field10059.method2700((byte) 57);
        if (class601.field8528 != null) {
            class601.field8528.method4029(1000);
            class601.field8528 = null;
        }
        try {
            class426.field6158.method1294((byte) -76);
            for (int var2 = 0; var2 < 37; var2++) {
                class230.field3424[var2].method1294((byte) -106);
            }
            class497.field7149.method1294((byte) -114);
            class299.field4083.method1294((byte) -94);
            class77.method639(-119);
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V", line = 1525)
    private final void method2727(int arg0) {
        field6396++;
        if (class369.field5392 == 14) {
            return;
        }
        long var2 = class680.method3873(arg0 ^ 0x7F) / 1000000L - class497.field7156;
        if (arg0 != 2) {
            return;
        }
        class497.field7156 = class680.method3873(125) / 1000000L;
        boolean var4 = class453.method2770(0);
        if (var4 && class509.field7381 && class375.field5435 != null) {
            class375.field5435.method2230((byte) -62);
        }
        if (class261.method1728(-24205, class369.field5392)) {
            if (class568.field8209 != 0L && class465.method2818(255) > class568.field8209) {
                class301.method1886(class13.field140, false, (byte) 99, class468.field6670, class184.method1305(1));
            } else if (!class211.field3164.method292() && class590.field8391) {
                class569.method3389(arg0 ^ 0x62);
            }
        }
        if (class214.field3211 == null) {
            Container var5;
            if (class696.field9834 != null) {
                var5 = class696.field9834;
            } else if (class486.field6999 == null) {
                var5 = class181.field2502;
            } else {
                var5 = class486.field6999;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class696.field9834 == var5) {
                Insets var8 = class696.field9834.getInsets();
                var7 -= var8.top + var8.bottom;
                var6 -= var8.left + var8.right;
            }
            if (class291.field4016 != var6 || class443.field6318 != var7 || class567.field8205) {
                if (class211.field3164 == null || class211.field3164.method255()) {
                    class654.method3753(83);
                } else {
                    class291.field4016 = var6;
                    class443.field6318 = var7;
                }
                class568.field8209 = class465.method2818(arg0 + 253) + 500L;
                class567.field8205 = false;
            }
        }
        if (class214.field3211 != null && !class240.field3557 && class261.method1728(-24205, class369.field5392)) {
            class301.method1886(-1, false, (byte) 80, -1, class243.field3580.field7993.method2653(false));
        }
        boolean var9 = false;
        if (class123.field1699) {
            class123.field1699 = false;
            var9 = true;
        }
        if (var9) {
            class457.method2783((byte) 76);
        }
        if (class211.field3164 != null && class211.field3164.method292() || class184.method1305(1) != 1) {
            class328.method2021(-8586);
        }
        if (class281.method1801(class369.field5392, (byte) -116)) {
            class731.method4071(arg0 - 2, var9);
        } else if (class167.method1193(class369.field5392, (byte) -69)) {
            class576.method3415((byte) 54);
        } else if (class283.method1812(class369.field5392, false)) {
            class576.method3415((byte) 54);
        } else if (class447.method2721((byte) -82, class369.field5392)) {
            if (class127.field1757 == 1) {
                if (class640.field9110 < class11.field108) {
                    class640.field9110 = class11.field108;
                }
                int var11 = (class640.field9110 - class11.field108) * 50 / class640.field9110;
                class343.method2105(class79.field1140, class211.field3164, class208.field3141, (byte) -14, true, class608.field8632.method3543(-24350, class45.field748) + "<br>(" + var11 + "%)");
            } else if (class127.field1757 == 2) {
                if (class258.field3700 < class488.field7033) {
                    class258.field3700 = class488.field7033;
                }
                int var10 = (class258.field3700 - class488.field7033) * 50 / class258.field3700 + 50;
                class343.method2105(class79.field1140, class211.field3164, class208.field3141, (byte) -14, true, class608.field8632.method3543(-24350, class45.field748) + "<br>(" + var10 + "%)");
            } else {
                class343.method2105(class79.field1140, class211.field3164, class208.field3141, (byte) -14, true, class608.field8632.method3543(-24350, class45.field748));
            }
        } else if (class369.field5392 == 10) {
            class355.method2262(var2, (byte) 117);
        } else if (class369.field5392 == 13) {
            class343.method2105(class79.field1140, class211.field3164, class208.field3141, (byte) -14, false, class608.field8634.method3543(-24350, class45.field748) + "<br>" + class608.field8635.method3543(-24350, class45.field748));
        }
        if (class171.field2403 == 3) {
            for (int var12 = 0; var12 < class727.field10212; var12++) {
                Rectangle var13 = class39.field673[var12];
                if (class486.field7003[var12]) {
                    class211.field3164.method3261(var13.x, var13.y, -21307, var13.height, var13.width, -65281);
                } else if (class567.field8200[var12]) {
                    class211.field3164.method3261(var13.x, var13.y, -21307, var13.height, var13.width, -65536);
                } else {
                    class211.field3164.method3261(var13.x, var13.y, -21307, var13.height, var13.width, -16711936);
                }
            }
        }
        if (class651.method3749(arg0 ^ 0x19)) {
            class254.method1702((byte) 113, class211.field3164);
        }
        if (class345.field4749.field4100 && class261.method1728(-24205, class369.field5392) && class171.field2403 == 0 && class184.method1305(arg0 ^ 0x3) == 1 && !var9) {
            int var16 = 0;
            for (int var17 = 0; var17 < class727.field10212; var17++) {
                if (class567.field8200[var17]) {
                    class567.field8200[var17] = false;
                    class77.field1113[var16++] = class39.field673[var17];
                }
            }
            try {
                if (class416.field5919) {
                    class594.method3485(var16, (byte) 122, class77.field1113);
                } else {
                    class211.field3164.method3269(var16, false, class77.field1113);
                }
            } catch (class360 var19) {
            }
        } else if (!class281.method1801(class369.field5392, (byte) -100)) {
            for (int var14 = 0; var14 < class727.field10212; var14++) {
                class567.field8200[var14] = false;
            }
            try {
                if (class416.field5919) {
                    class325.method2007(8);
                } else {
                    class211.field3164.method3268(true);
                }
            } catch (class360 var20) {
                class705.method3952(var20.getMessage() + " (Recovered) " + this.method1556(9), var20, -29913);
                class403.method2449(false, 0, -11);
            }
        }
        class379.method2352((byte) -126);
        int var18 = class243.field3580.field7995.method3249(false);
        if (var18 == 0) {
            class363.method2283(15L, -24244);
        } else if (var18 == 1) {
            class363.method2283(10L, arg0 - 24246);
        } else if (var18 == 2) {
            class363.method2283(5L, -24244);
        } else if (var18 == 3) {
            class363.method2283(2L, arg0 ^ 0xFFFFA14E);
        }
        if (class672.field9576) {
            class455.method2775((byte) 19);
        }
        if (class243.field3580.field7965.method159(false) == 1 && class369.field5392 == 3 && class346.field4771 != -1) {
            class243.field3580.method3301(0, 24, class243.field3580.field7965);
            class23.method102((byte) -74);
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V", line = 1787)
    public final synchronized void method1572(int arg0) {
        field6401++;
        if (class486.field6999 != null && class95.field1383 == null && !class345.field4749.field4100) {
            try {
                Class var2 = class486.field6999.getClass();
                Field var3 = var2.getDeclaredField("canvas");
                class95.field1383 = (Canvas) var3.get(class486.field6999);
                var3.set(class486.field6999, null);
                if (class95.field1383 != null) {
                    return;
                }
            } catch (Exception var4) {
            }
        }
        super.method1572(arg0);
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 1815)
    public final void init() {
        field6405++;
        if (!this.method1558(-87)) {
            return;
        }
        class342.field4706 = new class518();
        class342.field4706.field7472 = Integer.parseInt(this.getParameter("worldid"));
        class542.field7861 = new class518();
        class542.field7861.field7472 = Integer.parseInt(this.getParameter("lobbyid"));
        class542.field7861.field7468 = this.getParameter("lobbyaddress");
        class224.field3306 = new class518();
        class224.field3306.field7472 = Integer.parseInt(this.getParameter("demoid"));
        class224.field3306.field7468 = this.getParameter("demoaddress");
        class25.field223 = class640.method3696(Integer.parseInt(this.getParameter("modewhere")), 11106);
        if (class25.field223 == class246.field3590) {
            class25.field223 = class711.field10014;
        } else if (!class458.method2788(class25.field223, -119) && class536.field7793 != class25.field223) {
            class25.field223 = class536.field7793;
        }
        class283.field3959 = class647.method3742(Integer.parseInt(this.getParameter("modewhat")), -1);
        if (class291.field4014 != class283.field3959 && class671.field9558 != class283.field3959 && class32.field302 != class283.field3959) {
            class283.field3959 = class32.field302;
        }
        try {
            class45.field748 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var14) {
            class45.field748 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class326.field4428 = true;
        } else {
            class326.field4428 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class525.field7640 = true;
        } else {
            class525.field7640 = false;
        }
        String var3 = this.getParameter("advert");
        if (var3 != null && var3.equals("1")) {
            class259.field3703 = true;
        } else {
            class259.field3703 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null) {
            if (var4.equals("0")) {
                class528.field7683 = class391.field5635;
            } else if (var4.equals("1")) {
                class528.field7683 = class48.field790;
            } else if (var4.equals("2")) {
                class528.field7683 = class165.field2352;
            } else if (var4.equals("3")) {
                class528.field7683 = class332.field4504;
            }
        }
        try {
            class50.field813 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var13) {
            class50.field813 = 0;
        }
        class26.field239 = this.getParameter("quiturl");
        class565.field8191 = this.getParameter("settings");
        if (class565.field8191 == null) {
            class565.field8191 = "";
        }
        class683.field9702 = "1".equals(this.getParameter("under"));
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class360.field5276 = Integer.parseInt(var5);
            } catch (Exception var12) {
                class360.field5276 = 0;
            }
        }
        class266.field3801 = Integer.parseInt(this.getParameter("colourid"));
        if (class266.field3801 < 0 || class181.field2501.length <= class266.field3801) {
            class266.field3801 = 0;
        }
        if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
            class343.field4709 = true;
            class297.field4063 = true;
        }
        String var6 = this.getParameter("frombilling");
        if (var6 != null && var6.equals("true")) {
            class355.field5245 = true;
        }
        field6418 = this.getParameter("sskey");
        if (field6418 != null && field6418.length() < 2) {
            field6418 = null;
        }
        String var7 = this.getParameter("force64mb");
        if (var7 != null && var7.equals("true")) {
            class265.field3797 = true;
        }
        String var8 = this.getParameter("worldflags");
        if (var8 != null) {
            try {
                class616.field8781 = Integer.parseInt(var8);
            } catch (Exception var11) {
            }
        }
        String var9 = this.getParameter("userFlow");
        if (var9 != null) {
            try {
                class461.field6558 = Long.parseLong(var9);
            } catch (NumberFormatException var10) {
            }
        }
        class100.field1445 = this.getParameter("additionalInfo");
        if (class100.field1445 != null && class100.field1445.length() > 50) {
            class100.field1445 = null;
        }
        class660.field9437 = this;
        if (class528.field7683 == class391.field5635) {
            class544.field7915 = 503;
            class758.field10546 = 765;
        } else if (class528.field7683 == class48.field790) {
            class758.field10546 = 640;
            class544.field7915 = 480;
        }
        this.method1570(class283.field3959.method3613(false) + 32, class528.field7683.field4260, 630, 1, 37, class758.field10546, class544.field7915);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V", line = 1979)
    public static void method2728(byte arg0) {
        field6404 = null;
        field6416 = null;
        field6418 = null;
        field6413 = null;
        if (arg0 >= -87) {
            method2724(null);
        }
        field6417 = null;
        field6414 = null;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V", line = 1997)
    public static final void method2729() {
        for (int var0 = 0; var0 < class184.field2546; var0++) {
            int[] var1 = class558.field8115[var0];
            for (int var2 = 0; var2 < class240.field3555; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V", line = 2019)
    private final void method2730(int arg0) {
        field6409++;
        if (class369.field5392 == 14) {
            return;
        }
        class703.field9918++;
        if (arg0 > -116) {
            this.method1573(97);
        }
        if (class703.field9918 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class387.field5591 = var2.get(11) * 600 + var2.get(12) * 10 + var2.get(13) / 6;
            class382.field5533.setSeed((long) class387.field5591);
        }
        if (class703.field9918 % 50 == 0) {
            class171.field2402 = class401.field5749;
            class322.field4384 = class716.field10111;
            class401.field5749 = 0;
            class716.field10111 = 0;
        }
        this.method2731((byte) 116);
        if (class264.field3788 != null) {
            class264.field3788.method2096((byte) -103);
        }
        class363.method2284((byte) 1);
        class36.method187(126);
        class253.field3661.method2784(true);
        class535.field7789.method2453(127);
        if (class211.field3164 != null) {
            class211.field3164.method260((int) class465.method2818(255));
        }
        class591.method3473(34);
        class147.field2140 = 0;
        class518.field7470 = 0;
        for (class462 var3 = class253.field3661.method2785(118); var3 != null; var3 = class253.field3661.method2785(-108)) {
            int var6 = var3.method2804(-10523);
            if (var6 == 2 || var6 == 3) {
                char var7 = var3.method2802(-17007);
                if (class160.method1138(1) && (var7 == '`' || var7 == '§' || var7 == '²')) {
                    if (class651.method3749(123)) {
                        class554.method3332(-114);
                    } else {
                        class407.method2483(true);
                    }
                } else if (class518.field7470 < 128) {
                    class282.field3945[class518.field7470] = var3;
                    class518.field7470++;
                }
            } else if (var6 == 0 && class147.field2140 < 75) {
                class4.field31[class147.field2140] = var3;
                class147.field2140++;
            }
        }
        class428.field6170 = 0;
        for (class553 var4 = class535.field7789.method2456((byte) -63); var4 != null; var4 = class535.field7789.method2456((byte) -63)) {
            int var5 = var4.method762(-4);
            if (var5 == -1) {
                class119.field1634.method3559(var4, (byte) 12);
            } else if (var5 == 6) {
                class428.field6170 += var4.method759((byte) 124);
            } else if (class168.method1199(var5, true)) {
                class466.field6643.method3559(var4, (byte) 12);
                if (class466.field6643.method3557(81) > 10) {
                    class466.field6643.method3563(0);
                }
            }
        }
        if (class651.method3749(94)) {
            class145.method1014(5);
        }
        if (class281.method1801(class369.field5392, (byte) -95)) {
            class237.method1654(-1);
            class486.method2966((byte) -88);
        } else if (class447.method2721((byte) -82, class369.field5392)) {
            class118.method833(10);
        }
        if (class693.method3912(-18935, class369.field5392) && !class447.method2721((byte) -82, class369.field5392)) {
            this.method2739(1000);
            class100.method752(-6913);
            class490.method2983(50);
        } else if (class488.method2970(class369.field5392, false) && !class447.method2721((byte) -82, class369.field5392)) {
            this.method2739(1000);
            class490.method2983(50);
        } else if (class369.field5392 == 12) {
            class490.method2983(50);
        } else if (class25.method106(class369.field5392, 75) && !class447.method2721((byte) -82, class369.field5392)) {
            class353.method2249(-103);
        } else if (class369.field5392 == 13) {
            class490.method2983(50);
            if (class560.field8129 != -3 && class560.field8129 != 2 && class560.field8129 != 15) {
                class89.method694(false, 0);
            }
        }
        class647.method3740(-15368, class211.field3164);
        class466.field6643.method3563(0);
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V", line = 2189)
    private final void method2731(byte arg0) {
        field6408++;
        if (arg0 > 61) {
            boolean var2 = class488.field7032.method3865((byte) -93);
            if (!var2) {
                this.method2726(6);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lqk;)Lea;", line = 2206)
    public static final class478 method2732(class146 arg0) {
        class478 var1 = (class478) class491.field7069.method4020(((long) arg0.field2079 << 32) + (long) arg0.field2010, (byte) -91);
        return var1 == null ? arg0.field1980 : var1;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V", line = 2211)
    public final void method1559(boolean arg0) {
        field6411++;
        if (class243.field3580.field7975.method3775(arg0) != 2) {
            this.method2727(2);
            return;
        }
        try {
            this.method2727(2);
        } catch (ThreadDeath var4) {
            throw var4;
        } catch (Throwable var5) {
            class705.method3952(var5.getMessage() + " (Recovered) " + this.method1556(9), var5, -29913);
            class403.method2449(false, 0, -9);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V", line = 2233)
    private final void method2733(int arg0, int arg1) {
        class488.field7032.field9682 = arg1;
        field6397++;
        class488.field7032.field9685++;
        if (arg0 != 19702) {
            field6418 = null;
        }
        class4.field33 = 0;
        class702.field9899 = null;
        class163.field2327 = null;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V", line = 2250)
    public final void method1563(int arg0) {
        field6410++;
        if (class265.field3797) {
            class597.field8492 = 64;
        }
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class654.method3753(127);
        int var3 = 70 / ((arg0 + 83) / 38);
        class713.field10059 = new class441(class345.field4749);
        class488.field7032 = new class680();
        class445.method2718(new int[] { 20, 260 }, (byte) 122, new int[] { 1000, 100 });
        if (class536.field7793 != class25.field223) {
            class661.field9449 = new byte[50][];
        }
        class243.field3580 = class465.method2815(0);
        if (class536.field7793 == class25.field223) {
            class342.field4706.field7468 = this.getCodeBase().getHost();
        } else if (class458.method2788(class25.field223, -117)) {
            class342.field4706.field7468 = this.getCodeBase().getHost();
            class342.field4706.field7464 = class342.field4706.field7472 + 40000;
            class542.field7861.field7464 = class542.field7861.field7472 + 40000;
            class342.field4706.field7471 = class342.field4706.field7472 + 50000;
            class224.field3306.field7464 = class224.field3306.field7472 + 40000;
            class542.field7861.field7471 = class542.field7861.field7472 + 50000;
            class224.field3306.field7471 = class224.field3306.field7472 + 50000;
        } else if (class25.field223 == class246.field3590) {
            class342.field4706.field7468 = "127.0.0.1";
            class542.field7861.field7468 = "127.0.0.1";
            class224.field3306.field7468 = "127.0.0.1";
            class342.field4706.field7464 = class342.field4706.field7472 + 40000;
            class542.field7861.field7464 = class542.field7861.field7472 + 40000;
            class342.field4706.field7471 = class342.field4706.field7472 + 50000;
            class224.field3306.field7464 = class224.field3306.field7472 + 40000;
            class542.field7861.field7471 = class542.field7861.field7472 + 50000;
            class224.field3306.field7471 = class224.field3306.field7472 + 50000;
        }
        if (class528.field7683 == class48.field790) {
            class349.field5157 = class685.field9736;
            class647.field9314 = 0;
            class514.field7445 = 16777215;
            class235.field3514 = true;
            class587.field8366 = class380.field5513;
        } else if (class528.field7683 == class332.field4504) {
            class587.field8366 = class185.field2550;
            class349.field5157 = class99.field1433;
        } else {
            class587.field8366 = class326.field4429;
            class349.field5157 = class562.field8150;
        }
        class37.field338 = class23.field216 = class368.field5382 = class589.field8375 = new short[256];
        class214.field3215 = class342.field4706;
        if (class528.field7683 == class391.field5635) {
            class370.field5399 = false;
        }
        try {
            class554.field8058 = class660.field9437.getToolkit().getSystemClipboard();
        } catch (Exception var5) {
        }
        class253.field3661 = class140.method994(class95.field1383, false);
        class535.field7789 = class26.method109(class95.field1383, 12566, true);
        try {
            if (class345.field4749.field4101 != null) {
                class426.field6158 = new class183(class345.field4749.field4101, 5200, 0);
                for (int var4 = 0; var4 < 37; var4++) {
                    class230.field3424[var4] = new class183(class345.field4749.field4111[var4], 6000, 0);
                }
                class497.field7149 = new class183(class345.field4749.field4112, 6000, 0);
                class704.field9923 = new class247(255, class426.field6158, class497.field7149, 500000);
                class299.field4083 = new class183(class345.field4749.field4110, 24, 0);
                class345.field4749.field4112 = null;
                class345.field4749.field4111 = null;
                class345.field4749.field4101 = null;
                class345.field4749.field4110 = null;
            }
        } catch (IOException var6) {
            class299.field4083 = null;
            class704.field9923 = null;
            class497.field7149 = null;
            class426.field6158 = null;
        }
        if (class536.field7793 != class25.field223) {
            class372.field5403 = true;
        }
        class211.field3163 = class608.field8632.method3543(-24350, class45.field748);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIB)Z", line = 2374)
    public static final boolean method2734(int arg0, int arg1, byte arg2) {
        int var3 = -40 % ((-arg2 - 15) / 63);
        field6406++;
        return class23.method105(false, arg0, arg1) | (arg0 & 0x70000) != 0 || class297.method1855(arg0, arg1, -29);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lqk;)Z", line = 2389)
    public static final boolean method2735(class146 arg0) {
        if (class284.field3960) {
            if (method2732(arg0).field6793 != 0) {
                return false;
            }
            if (arg0.field2112 == 0) {
                return false;
            }
        }
        return arg0.field2116;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V", line = 2404)
    public static final void method2736() {
        int var0 = class468.field6665;
        int[] var1 = class38.field500;
        int var2 = class243.field3580.field7966.method695(false);
        boolean var3 = var2 == 1 && var0 > 200 || var2 == 0 && var0 > 50;
        for (int var4 = 0; var4 < var0; var4++) {
            class639 var14 = class536.field7796[var1[var4]];
            if (!var14.method3684(69)) {
                var14.field4552 = -1;
            } else if (var14.field9055) {
                var14.field4552 = -1;
            } else {
                var14.method1308(-680858839);
                if (var14.field9038 >= 0 && var14.field9035 >= 0 && var14.field9036 < class184.field2546 && var14.field9042 < class240.field3555) {
                    var14.field9057 = var14.field4595 ? var3 : false;
                    if (class108.field1536 == var14) {
                        var14.field4552 = Integer.MAX_VALUE;
                    } else {
                        int var15 = 0;
                        if (!var14.field4612) {
                            var15++;
                        }
                        if (var14.field4589 > class703.field9918) {
                            var15 += 2;
                        }
                        int var16 = var15 + (5 - var14.method2053(true) << 2);
                        if (var14.field9050) {
                            var16 += 512;
                        } else {
                            if (class118.field1623 == 0) {
                                var16 += 32;
                            } else {
                                var16 += 128;
                            }
                            var16 += 256;
                        }
                        var14.field4552 = var16 + 1;
                    }
                } else {
                    var14.field4552 = -1;
                }
            }
        }
        for (int var5 = 0; var5 < class619.field8816; var5++) {
            class571 var11 = ((class63) class389.field5608.method4020((long) class545.field7927[var5], (byte) -102)).field1004;
            if (var11.method3394(45) && var11.field8235.method3170(class226.field3372, -125)) {
                var11.method1308(-680858839);
                if (var11.field9038 >= 0 && var11.field9035 >= 0 && var11.field9036 < class184.field2546 && var11.field9042 < class240.field3555) {
                    int var12 = 0;
                    if (!var11.field4612) {
                        var12++;
                    }
                    if (var11.field4589 > class703.field9918) {
                        var12 += 2;
                    }
                    int var13 = var12 + (5 - var11.method2053(true) << 2);
                    if (class118.field1623 == 0) {
                        if (var11.field8235.field7576) {
                            var13 += 64;
                        } else {
                            var13 += 128;
                        }
                    } else if (class118.field1623 == 1) {
                        if (var11.field8235.field7576) {
                            var13 += 32;
                        } else {
                            var13 += 64;
                        }
                    }
                    if (var11.field8235.field7533) {
                        var13 += 1024;
                    } else if (!var11.field8235.field7546) {
                        var13 += 256;
                    }
                    var11.field4552 = var13 + 1;
                } else {
                    var11.field4552 = -1;
                }
            } else {
                var11.field4552 = -1;
            }
        }
        for (int var6 = 0; var6 < class99.field1437.length; var6++) {
            class504 var7 = class99.field1437[var6];
            if (var7 != null) {
                if (var7.field7322 == 1) {
                    class63 var8 = (class63) class389.field5608.method4020((long) var7.field7334, (byte) -92);
                    if (var8 != null) {
                        class571 var9 = var8.field1004;
                        if (var9.field4552 >= 0) {
                            var9.field4552 += 2048;
                        }
                    }
                } else if (var7.field7322 == 10) {
                    class639 var10 = class536.field7796[var7.field7334];
                    if (var10 != null && class108.field1536 != var10 && var10.field4552 >= 0) {
                        var10.field4552 += 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V", line = 2578)
    public static final void method2737() {
        int var0 = class468.field6665;
        int[] var1 = class38.field500;
        int var2 = class386.field5578 ? var0 : class619.field8816 + var0;
        for (int var3 = 0; var3 < var2; var3++) {
            class335 var4;
            if (var3 < var0) {
                var4 = class536.field7796[var1[var3]];
            } else {
                var4 = ((class63) class389.field5608.method4020((long) class545.field7927[var3 - var0], (byte) -94)).field1004;
            }
            if (var4.field4552 >= 0) {
                int var5 = var4.method2053(true);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field3923 & 0x1FF) == 0 && (var4.field3916 & 0x1FF) == 0) {
                        continue;
                    }
                } else if ((var4.field3923 & 0x1FF) == 256 && (var4.field3916 & 0x1FF) == 256) {
                    continue;
                }
                var4.field3922 = class530.method3211(var4.field3916, 2, var4.field3923, var4.field3920);
                class262.method1734(var4, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V", line = 2620)
    public final void method1557(int arg0) {
        method2728((byte) -93);
        field6412++;
        class631.method3625((byte) -127);
        class608.method3541(-32419);
        class457.method2781(false);
        class235.method1639(true);
        class337.method2079(false);
        class710.method3976(arg0 ^ 0xFFFFCF3E);
        class560.method3357((byte) -117);
        class501.method3052((byte) 98);
        class388.method2382(89);
        class498.method3028(0);
        class715.method4012((byte) 38);
        class225.method1562(-1);
        class204.method1455((byte) 44);
        class627.method3614(-96);
        class573.method3406(27455);
        class315.method1940((byte) 26);
        class121.method850(true);
        class549.method3299((byte) 74);
        class207.method1477((byte) 107);
        class504.method3083(-4);
        class611.method3567(0);
        class748.method4171(0);
        class680.method3867((byte) -124);
        class441.method2697((byte) -96);
        class342.method2098((byte) -59);
        class230.method1599(0);
        class183.method1293(1934);
        class348.method2206((byte) 120);
        class577.method3418(-118);
        class169.method1212(-18);
        class59.method554(64);
        class140.method993((byte) 98);
        class353.method2250(false);
        class398.method2412((byte) -51);
        class3.method13((byte) -44);
        class438.method2685(true);
        class439.method2691((byte) -118);
        class734.method4086((byte) 0);
        class468.method2827((byte) 98);
        class306.method1904(11);
        class258.method1715(4243);
        class493.method3001(false);
        class551.method3316((byte) -68);
        class281.method1797((byte) 86);
        class355.method2265(-21917);
        class561.method3358((byte) 62);
        class588.method3459((byte) -43);
        class669.method3819((byte) -126);
        class162.method1143(-92);
        class488.method2972((byte) 72);
        class456.method2778(-82);
        class694.method3914(-121);
        class684.method3886(-7132);
        class168.method1205(11908);
        class435.method2670(-1);
        class717.method4028((byte) -123);
        class635.method3641(-2);
        class685.method3892((byte) 90);
        class564.method3376((byte) -41);
        class215.method1520(-102);
        class146.method1020((byte) 16);
        class750.method4180((byte) 83);
        class639.method3681(arg0 ^ 0x38F1);
        class619.method3593(-99);
        class505.method3085(false);
        class479.method2872((byte) 0);
        class375.method2328(-98);
        class740.method4130(-461);
        class279.method1793(arg0 ^ 0xFFFFC730);
        class571.method3400(arg0 ^ arg0);
        class182.method1285(true);
        class533.method3232(-66);
        class35.method182((byte) 38);
        class612.method3568((byte) -127);
        class113.method816(false);
        class534.method3233(69);
        class310.method1928(-1);
        class465.method2817(1);
        class568.method3386(0);
        class538.method3247(arg0 + 14529);
        class189.method1328(123);
        class91.method706(false);
        class184.method1301(119);
        class80.method655((byte) 120);
        class524.method3188(arg0 + 14630);
        class132.method932(true);
        class131.method921((byte) -126);
        class196.method1384(125);
        class282.method1811((byte) -116);
        class403.method2448((byte) 16);
        class123.method870(-84);
        class506.method3088(true);
        class145.method1012(61);
        class614.method3573(67);
        class482.method2945(arg0 + 14654);
        class637.method3666(arg0 ^ 0x38E8);
        class495.method3010(-2);
        class339.method2086(-3832);
        class424.method2625((byte) -69);
        class400.method2425(arg0 ^ 0xFFFFC751);
        class322.method2003(arg0 + 14530);
        class334.method2050(-3584);
        class413.method2495(false);
        class585.method3445(-5);
        class156.method1118(0);
        class476.method2849((byte) 104);
        class726.method4055(false);
        class433.method2660(arg0 + 14531);
        class89.method696((byte) 68);
        class618.method3590(0);
        class42.method434(-90);
        class675.method3836(arg0 + 14790);
        class218.method1537((byte) -21);
        class36.method184((byte) 95);
        class70.method618(55);
        class397.method2408(6410);
        class206.method1473((byte) 70);
        class752.method4189(25561);
        class662.method3771(1);
        class329.method2023(-61);
        class658.method3757(18401);
        class429.method2652(104);
        class50.method465(-4);
        class539.method3248((byte) 47);
        class268.method1757(arg0 ^ 0xFFFFCF3E);
        class31.method154(1023);
        class616.method3575((byte) -45);
        class150.method1091((byte) -115);
        class125.method876(5);
        class729.method4067(false);
        class360.method2276(arg0 ^ 0xFFFFC776);
        class569.method3388(true);
        class254.method1700((byte) 15);
        class502.method3057(122);
        class458.method2787(-911);
        class40.method426((byte) -77);
        class275.method1778((byte) 124);
        class280.method1795(45);
        class349.method2226(1);
        class105.method773(-106);
        class529.method3204();
        class387.method2378(arg0 + 14632);
        class332.method2041(0);
        class713.method3995((byte) 108);
        class345.method2116((byte) 127);
        class94.method729(2);
        class28.method142(107);
        class236.method1646(arg0 ^ 0xFFFFC738);
        class670.method3821(false);
        class509.method3100(-114);
        class474.method2845(32202);
        class445.method2719(arg0 + 14505);
        class389.method2388(-1);
        class135.method959((byte) 113);
        class451.method2760(-1);
        class469.method2834((byte) 68);
        class609.method3544((byte) 95);
        class600.method3504(3);
        class11.method56(arg0 + 14655);
        class172.method1219(1);
        class664.method3798();
        class201.method1423(-111);
        class379.method2353((byte) -110);
        class243.method1665(false);
        class316.method1943((byte) -68);
        class383.method2364(2);
        class133.method939(0);
        class718.method4035((byte) 78);
        class284.method1816((byte) 66);
        class14.method72(true);
        class141.method996(1);
        class746.method4160(1);
        class296.method1849((byte) -124);
        class678.method3858((byte) 26);
        class603.method3511((byte) -49);
        class522.method3177(9);
        class344.method2109(0);
        class27.method136();
        class83.method667(-80);
        class672.method3828(arg0 ^ 0xFFFFC71E);
        class475.method2846(arg0 ^ 0xFFFFC740);
        class186.method1316(79);
        class393.method2398(arg0 ^ 0xFFFFC73A);
        class274.method1776((byte) 36);
        class285.method1819((byte) 10);
        class587.method3455(-1461444964);
        class241.method1660((byte) -72);
        class463.method2808(arg0 + 14532);
        class336.method2075();
        class696.method3918((byte) 4);
        class115.method819((byte) 123);
        class699.method3925(122);
        class21.method98(true);
        class362.method2282((byte) 50);
        class657.method3756(57);
        class453.method2771((byte) 51);
        class661.method3769((byte) -127);
        class64.method581(arg0 ^ 0xFFFFC738);
        class277.method1788(69);
        class644.method3714((byte) -48);
        class217.method1534(arg0 - 1505982798);
        class19.method89(false);
        class208.method1486(arg0 + 14530);
        class704.method3950(arg0 ^ 0x38B5);
        class648.method3744(false);
        class557.method3348();
        class108.method799((byte) 106);
        class144.method1010(true);
        class367.method2308(-1);
        class540.method3251();
        class266.method1756(arg0 + 14528);
        class32.method163(arg0 + 14530);
        class198.method1416((byte) -103);
        class37.method191(256);
        class667.method3807(arg0 + 14530);
        class531.method3221();
        class111.method810(-50);
        class181.method1281((byte) 118);
        class584.method3436((byte) -99);
        class507.method3093((byte) 113);
        class325.method2009(101);
        class732.method4074(3);
        class607.method3538((byte) 83);
        class167.method1191(-4);
        class12.method61(65);
        class640.method3699((byte) 115);
        class195.method1376(3914);
        class500.method3036(0);
        class396.method2406(false);
        class368.method2309(true);
        class163.method1147(111);
        class633.method3626(-29656);
        class159.method1134(-23390);
        class6.method25((byte) -122);
        class143.method1006((byte) -110);
        class185.method1312(true);
        class741.method4132(1);
        class75.method635((byte) -101);
        class340.method2090(0);
        class386.method2376(true);
        class714.method4006((byte) -32);
        class703.method3949(true);
        class411.method2489(1);
        class153.method1107(62);
        class440.method2694(14774);
        class205.method1463((byte) 81);
        class223.method1552(arg0 ^ 0x4BB9);
        class92.method714((byte) -117);
        class202.method1433((byte) -77);
        class606.method3532((byte) 111);
        class460.method2794((byte) 113);
        class57.method547((byte) -77);
        class293.method1838(true);
        class593.method3482((byte) 33);
        class53.method479((byte) 63);
        class240.method1659(65);
        class313.method1935(-111);
        class629.method3619(51);
        class147.method1036(16);
        class56.method544((byte) -62);
        class659.method3765((byte) -97);
        class548.method3297(12477);
        class536.method3239(-382);
        class326.method2014(-81);
        class364.method2289((byte) 127);
        class79.method650(-9001);
        class679.method3861(0);
        class138.method979((byte) 115);
        class157.method1123((byte) -96);
        class624.method3604(arg0 + 14637);
        class554.method3330(-127);
        class434.method2668((byte) -118);
        class151.method1093(1);
        class596.method3489(5);
        class541.method3254(127);
        class381.method2357(arg0 + 14529);
        class269.method1761((byte) -115);
        class34.method179((byte) 41);
        class233.method1629((byte) 123);
        class41.method430((byte) 57);
        class234.method1636(-118);
        class130.method910();
        class527.method3192((byte) 123);
        class634.method3633((byte) -32);
        class576.method3414(80);
        class226.method1578(-22598);
        class511.method3106(75);
        class724.method4047(-4);
        class610.method3551(arg0 ^ 0xFFFFC73A);
        class311.method1930(-20630);
        class23.method103(true);
        class82.method663(4);
        class646.method3733(1815786753);
        class687.method3896(4);
        class622.method3598((byte) 19);
        class232.method1611();
        class286.method1823(22368);
        class102.method757((byte) -125);
        class689.method3901();
        class712.method3980();
        class382.method2361(2);
        class570.method3392();
        class67.method593(true);
        class303.method1892(false);
        class625.method3607(-4332);
        class693.method3911(arg0 ^ 0xFFFF8C9D);
        class328.method2018(false);
        class706.method3957(105);
        class589.method3464((byte) 116);
        class288.method1830((byte) 99);
        class299.method1861(2);
        class472.method2841(22101);
        class377.method2341(100);
        class390.method2390(true);
        class39.method415(false);
        class84.method677(-23310);
        class535.method3237(false);
        class30.method148(false);
        class757.method4210((byte) 52);
        class216.method1531(126);
        class566.method3383(arg0 + 14477);
        class450.method2750();
        class242.method1662(arg0 + 14545);
        class54.method481(-55);
        class95.method734((byte) -119);
        class598.method3499((byte) -76);
        class139.method981(2048);
        class372.method2322((byte) -109);
        class352.method2242(arg0 + 14616);
        class249.method1685(arg0 - 14054);
        class343.method2103((byte) -115);
        class148.method1040(-20123);
        class513.method3120((byte) -48);
        class575.method3411(false);
        class408.method2485(-23664);
        class174.method1259(arg0 + 14656);
        class366.method2304(-1);
        class425.method2644((byte) -62);
        class66.method590(arg0 + 14484);
        class461.method2796(-1609038844);
        class711.method3977((byte) 110);
        class663.method3776(-15891);
        class346.method2144((byte) 44);
        class481.method2930(arg0 + 18347);
        class127.method899((byte) 126);
        class525.method3190(-11884);
        class270.method1767(-117);
        class294.method1840(5889);
        class733.method4083((byte) -78);
        class604.method3520(-123);
        class246.method1673(false);
        class9.method31((byte) -119);
        class745.method4159(-2);
        class212.method1499(116);
        class96.method736((byte) -113);
        class38.method396(-96);
        class697.method3922(false);
        class674.method3831(-30335);
        class617.method3586(false);
        class417.method2520((byte) -47);
        class613.method3571(true);
        class272.method1774(122);
        class597.method3493(arg0 ^ 0xFFFFC741);
        class545.method3279(1);
        class81.method658(-12152);
        class351.method2241(26704);
        class496.method3017(-12142);
        class192.method1360(-625);
        class755.method4195(arg0 + 407746);
        class683.method3878((byte) -21);
        class109.method806(-28529);
        class749.method4174(true);
        class643.method3712((byte) 60);
        class152.method1097(arg0 ^ 0xFFFFD73E);
        class668.method3810();
        class26.method119(-29558);
        class563.method3367((byte) 109);
        class257.method1711(-3);
        class231.method1604(-114);
        class112.method811((byte) -22);
        class758.method4213((byte) 96);
        class721.method4041((byte) 122);
        class591.method3471((byte) 92);
        class119.method835((byte) -121);
        class264.method1747(0);
        class312.method1933(arg0 + 14591);
        class77.method640((byte) -83);
        class486.method2967((byte) 111);
        class437.method2673(4);
        class491.method2987(2);
        class742.method4133(-100523764);
        class45.method446(arg0 + 14637);
        class414.method2499(20948);
        class464.method2814(arg0 + 14530);
        class405.method2464(arg0 + 14417);
        class301.method1885(false);
        class214.method1516((byte) 104);
        class399.method2415(16989);
        class595.method3486(6888);
        class338.method2084(-121);
        class350.method2240(false);
        class72.method627(812);
        class321.method1991(arg0 ^ 0xFFFFC73D);
        class385.method2373(32686);
        class357.method2269((byte) 83);
        class320.method1988();
        class193.method1369(208);
        class211.method1493(-58);
        class621.method3596((byte) -86);
        class660.method3766(-2535);
        class565.method3380(false);
        class78.method644(12);
        class93.method719(arg0 ^ 0xFFFFC73F);
        class62.method579((byte) 71);
        class48.method460(arg0 + 14649);
        class537.method3245(arg0 ^ 0xFFFF4A7F);
        class126.method890((byte) 125);
        class283.method1815(arg0 ^ 0xFFFFC73C);
        class401.method2436(16);
        class671.method3825(-16327);
        class582.method3428((byte) -49);
        class556.method3339((byte) -111);
        class166.method1188(-61440);
        class99.method746((byte) -126);
        class695.method3916(false);
        class623.method3602(false);
        class51.method470(6407);
        class690.method3902(20618);
        class426.method2647(arg0 ^ 0xFFFFCBEC);
        class154.method1112(65535);
        class253.method1696((byte) -109);
        class743.method4137(6811);
        class295.method1847(false);
        class567.method3384((byte) 114);
        class497.method3023(arg0 + 22724);
        class165.method1182((byte) -112);
        class558.method3352(95);
        class15.method78(false);
        class356.method2266(675442595);
        class716.method4027(arg0 - 6591);
        class583.method3434(20521);
        class728.method4066(0);
        class308.method1924(true);
        class376.method2333(30930);
        class412.method2492(-5808);
        class416.method2515((byte) 110);
        class76.method636((byte) -122);
        class490.method2985(true);
        class753.method4193(true);
        class628.method3618(arg0 ^ 0x38E5);
        class443.method2709((byte) 48);
        class43.method441(14194);
        class90.method702(-128);
        class705.method3954((byte) 127);
        class455.method2776(5);
        class118.method832((byte) 80);
        class542.method3257(-18024);
        class572.method3402(arg0 + 14651);
        class487.method2969((byte) 60);
        class477.method2852(true);
        class209.method1491(-126);
        class291.method1832(25662);
        class391.method2393(-3724);
        class645.method3718(-123);
        class520.method3161(arg0 ^ 0x38BB);
        class71.method624(0);
        class579.method3426(arg0 + 14405);
        class47.method458((byte) 123);
        class4.method19(75);
        class656.method3755(-66);
        class142.method999(-27018);
        class380.method2354(-21577);
        class384.method2370(9291);
        class160.method1140((byte) -113);
        class422.method2586(-126);
        class259.method1720(arg0 + 14458);
        class691.method3904(-1);
        class528.method3194(11319);
        class219.method1544(19169);
        class122.method863((byte) -82);
        class702.method3945(114);
        class402.method2444(-18154);
        class262.method1735(true);
        class137.method974(arg0 + 14658);
        class394.method2401(arg0 + 14536);
        class297.method1852((byte) 12);
        class499.method3033((byte) -123);
        class22.method99((byte) -121);
        class363.method2285(27002);
        class519.method3157(true);
        class98.method740((byte) 92);
        class194.method1371(12);
        class304.method1896((byte) -109);
        class466.method2820((byte) -128);
        class594.method3484(false);
        class489.method2976(128);
        class727.method4059(false);
        class271.method1771(31);
        class370.method2321(30000);
        class176.method1267(-23994);
        class651.method3750(120);
        class224.method1554(-7275);
        class333.method2044((byte) 127);
        class559.method3355((byte) 127);
        class25.method108((byte) -78);
        class100.method755(arg0 + 14648);
        class347.method2201((byte) 93);
        class514.method3127((byte) -103);
        class492.method2993(77);
        class449.method2744((byte) -86);
        class751.method4185(true);
        class562.method3366((byte) -118);
        class738.method4123(110);
        class46.method450(1007);
        class17.method81(false);
        class642.method3704((byte) -87);
        class709.method3968((byte) -69);
        class601.method3507(-18420);
    }

    @OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V", line = 3147)
    public static final void method2738(int arg0) {
        int var1 = class468.field6665;
        int[] var2 = class38.field500;
        for (int var3 = 0; var3 < class619.field8816 + var1; var3++) {
            class335 var4;
            if (var3 < var1) {
                var4 = class536.field7796[var2[var3]];
            } else {
                var4 = ((class63) class389.field5608.method4020((long) class545.field7927[var3 - var1], (byte) -78)).field1004;
            }
            if (var4.field3920 == arg0 && var4.field4552 >= 0) {
                int var5 = var4.method2053(true);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field3923 & 0x1FF) != 0 || (var4.field3916 & 0x1FF) != 0) {
                        continue;
                    }
                } else if ((var4.field3923 & 0x1FF) != 256 || (var4.field3916 & 0x1FF) != 256) {
                    continue;
                }
                int var10002;
                if (var5 == 1) {
                    int var6 = var4.field3923 >> 9;
                    int var7 = var4.field3916 >> 9;
                    if (var4.field4552 > class558.field8115[var6][var7]) {
                        class558.field8115[var6][var7] = var4.field4552;
                        class21.field196[var6][var7] = 1;
                    } else if (class558.field8115[var6][var7] == var4.field4552) {
                        var10002 = class21.field196[var6][var7]++;
                    }
                } else {
                    int var8 = (var5 - 1) * 256 + 60;
                    int var9 = var4.field3923 - var8 >> 9;
                    int var10 = var4.field3916 - var8 >> 9;
                    int var11 = var4.field3923 + var8 >> 9;
                    int var12 = var4.field3916 + var8 >> 9;
                    for (int var13 = var9; var13 <= var11; var13++) {
                        for (int var14 = var10; var14 <= var12; var14++) {
                            if (var4.field4552 > class558.field8115[var13][var14]) {
                                class558.field8115[var13][var14] = var4.field4552;
                                class21.field196[var13][var14] = 1;
                            } else if (class558.field8115[var13][var14] == var4.field4552) {
                                var10002 = class21.field196[var13][var14]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V", line = 3245)
    private final void method2739(int arg0) {
        field6402++;
        if (class369.field5392 == 7 && class35.field318 == 0) {
            if (class326.field4421 > 1) {
                class326.field4421--;
                class590.field8390 = class152.field2225;
            }
            if (!class147.field2154) {
                class423.method2601(-29372);
            }
            for (int var2 = 0; var2 < 100 && class708.method3963(arg0 - 1000); var2++) {
            }
        }
        class731.field10244++;
        class512.method3115(-1, null, -1, false);
        class303.method1893(0, null, -1, -1);
        class202.method1434(-1);
        class152.field2225++;
        for (int var3 = 0; var3 < class551.field8042; var3++) {
            class571 var4 = class414.field5889[var3].field1004;
            if (var4 != null) {
                byte var5 = var4.field8235.field7523;
                if ((var5 & 0x1) != 0) {
                    int var6 = var4.method2053(true);
                    if ((var5 & 0x2) != 0 && var4.field4637 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var7 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var8 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var7 != 0 || var8 != 0) {
                            int var9 = var4.field4646[0] + var7;
                            int var10 = var4.field4645[0] + var8;
                            if (var9 < 0) {
                                var9 = 0;
                            } else if (var9 > (class184.field2546 - (var6 + 1))) {
                                var9 = class184.field2546 - var6 - 1;
                            }
                            if (var10 < 0) {
                                var10 = 0;
                            } else if (class240.field3555 - (var6 + 1) < var10) {
                                var10 = class240.field3555 - var6 - 1;
                            }
                            int var11 = class235.method1638(var6, true, class6.field57[var4.field3920], var6, -1, var9, 0, 17105, var6, var4.field4645[0], 0, var10, class47.field786, class332.field4509, var4.field4646[0]);
                            if (var11 > 0) {
                                if (var11 > 9) {
                                    var11 = 9;
                                }
                                for (int var12 = 0; var12 < var11; var12++) {
                                    var4.field4646[var12] = class47.field786[var11 - var12 - 1];
                                    var4.field4645[var12] = class332.field4509[var11 - var12 - 1];
                                    var4.field4642[var12] = 1;
                                }
                                var4.field4637 = var11;
                            }
                        }
                    }
                    class502.method3056((byte) 107, var4, true);
                    int var13 = class314.method1939(-111, var4);
                    class57.method546(var4, arg0 ^ 0xFFFFFC29);
                    class364.method2291(127, class235.field3517, class465.field6624, var13, var4);
                    class530.method3216(class235.field3517, -3587, var4);
                    class177.method1271(true, var4);
                }
            }
        }
        if (class35.field318 == 0 && class328.field4452 == 0) {
            if (class165.field2351 == 2) {
                class426.method2649(arg0 - 856409925);
            } else {
                class215.method1522((byte) 60);
            }
            if (class518.field7473 >> 9 < 14 || class518.field7473 >> 9 >= class184.field2546 - 14 || class123.field1698 >> 9 < 14 || (class240.field3555 - 14) <= (class123.field1698 >> 9)) {
                class393.method2397((byte) 84);
            }
        }
        while (true) {
            class362 var14;
            class146 var15;
            class146 var16;
            do {
                var14 = (class362) class99.field1438.method3563(0);
                if (var14 == null) {
                    while (true) {
                        class362 var17;
                        class146 var18;
                        class146 var19;
                        do {
                            var17 = (class362) class535.field7779.method3563(0);
                            if (var17 == null) {
                                while (true) {
                                    class362 var20;
                                    class146 var21;
                                    class146 var22;
                                    do {
                                        var20 = (class362) class441.field6290.method3563(arg0 - 1000);
                                        if (var20 == null) {
                                            if (class131.field1810 != null) {
                                                class752.method4187(0);
                                            }
                                            if (class703.field9918 % 1500 == 0) {
                                                class663.method3778((byte) -117);
                                            }
                                            if (class369.field5392 == 7 && class35.field318 == 0) {
                                                class750.method4182((byte) 110);
                                            }
                                            class530.method3218((byte) 111);
                                            if (class577.field8287 && class465.method2818(255) - 60000L > class549.field8013) {
                                                class424.method2627(false);
                                            }
                                            if (arg0 != 1000) {
                                                field6416 = null;
                                            }
                                            for (class161 var23 = (class161) class286.field3978.method1527(82); var23 != null; var23 = (class161) class286.field3978.method1523(true)) {
                                                if ((class465.method2818(255) / 1000L - 5L) > ((long) var23.field2312)) {
                                                    if (var23.field2310 > 0) {
                                                        class145.method1013(var23.field2309 + class608.field8639.method3543(-24350, class45.field748), (byte) 115, "", 5, 0, "", "");
                                                    }
                                                    if (var23.field2310 == 0) {
                                                        class145.method1013(var23.field2309 + class608.field8640.method3543(-24350, class45.field748), (byte) 101, "", 5, 0, "", "");
                                                    }
                                                    var23.method814(59);
                                                }
                                            }
                                            if (class369.field5392 == 7 && class35.field318 == 0) {
                                                if (class325.field4415 == null) {
                                                    class89.method694(false, 0);
                                                    return;
                                                }
                                                class512.field7418++;
                                                if (class512.field7418 > 50) {
                                                    class342.field4691++;
                                                    class88 var24 = class448.method2741((byte) 76, class148.field2161, class583.field8319);
                                                    class523.method3183(var24, (byte) 31);
                                                }
                                                try {
                                                    class521.method3165((byte) 113);
                                                    return;
                                                } catch (IOException var25) {
                                                    class89.method694(false, 0);
                                                    return;
                                                }
                                            }
                                            return;
                                        }
                                        var21 = var20.field5304;
                                        if (var21.field2010 < 0) {
                                            break;
                                        }
                                        var22 = class250.method1689(var21.field2109, false);
                                    } while (var22 == null || var22.field2019 == null || var21.field2010 >= var22.field2019.length || var22.field2019[var21.field2010] != var21);
                                    class529.method3207(var20);
                                }
                            }
                            var18 = var17.field5304;
                            if (var18.field2010 < 0) {
                                break;
                            }
                            var19 = class250.method1689(var18.field2109, false);
                        } while (var19 == null || var19.field2019 == null || var19.field2019.length <= var18.field2010 || var19.field2019[var18.field2010] != var18);
                        class529.method3207(var17);
                    }
                }
                var15 = var14.field5304;
                if (var15.field2010 < 0) {
                    break;
                }
                var16 = class250.method1689(var15.field2109, false);
            } while (var16 == null || var16.field2019 == null || var16.field2019.length <= var15.field2010 || var16.field2019[var15.field2010] != var15);
            class529.method3207(var14);
        }
    }
}
