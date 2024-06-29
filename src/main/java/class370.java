import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class class370 {

    @OriginalMember(owner = "client!rq", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6001 = new String[] { method3049(method3048("<$_*/")), method3049(method3048("<$_./")), method3049(method3048("<$_-/")), method3049(method3048("<$_)/")), method3049(method3048("<$_//")), method3049(method3048("5{_Ez")), method3049(method3048("  \u001d\u0007")), method3049(method3048("<$_(/")) };

    @OriginalMember(owner = "client!rq", name = "j", descriptor = "[Z")
    public static boolean[] field5996 = new boolean[100];

    @OriginalMember(owner = "client!rq", name = "g", descriptor = "I")
    public static int field5995 = 0;

    @OriginalMember(owner = "client!rq", name = "d", descriptor = "Lhl;")
    public static class556 field5992 = new class556(60, 6);

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "I")
    public static int field5991;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "I")
    public static int field5993;

    @OriginalMember(owner = "client!rq", name = "h", descriptor = "I")
    public static int field5994;

    @OriginalMember(owner = "client!rq", name = "e", descriptor = "I")
    public static int field5998;

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "I")
    public static int field6000;

    @OriginalMember(owner = "client!rq", name = "i", descriptor = "Lmq;")
    public static class536 field5999;

    @OriginalMember(owner = "client!rq", name = "f", descriptor = "Ljava/lang/String;")
    public static String field5997;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(I)V")
    public static final void method3042(int arg0) {
        try {
            field5991++;
            class524 var1 = (class524) class199.field3151.method3228(11);
            if (arg0 > -45) {
                method3044(-5);
            }
            boolean var2 = class360.field5806 != null || class542.field7985 > 0;
            int var3 = var1.method1936(11481);
            int var4 = var1.method1935(-118);
            if (var2) {
                class522.field7706 = 1;
            }
            if (var2) {
                class430.field6765 = class750.field11049;
            } else {
                class471.method3620(var3, var4, class750.field11049, 0);
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field6001[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(B)V")
    public static final void method3043(byte arg0) {
        try {
            if (arg0 == -111) {
                field6000++;
                if (class272.field4380 > 1) {
                    class272.field4380--;
                    class123.field1774 = class318.field5182;
                }
                if (class185.field2948.field2669) {
                    class185.field2948.field2669 = false;
                    class169.method1574(-23049);
                } else {
                    if (!class16.field177) {
                        class458.method3554((byte) 12);
                    }
                    for (int var1 = 0; var1 < 100 && class757.method5471(class185.field2948, (byte) -121); var1++) {
                    }
                    if (class315.field5127 == 11) {
                        while (class647.method4713(-1)) {
                            class487 var2 = class618.method4519(114, class444.field6916, class185.field2948.field2659);
                            var2.field7362.method1678(0, 65280);
                            int var3 = var2.field7362.field2799;
                            class647.method4715(-96, var2.field7362);
                            var2.field7362.method1668(-17010, var2.field7362.field2799 - var3);
                            class185.field2948.method1546(var2, 1);
                        }
                        if (class617.field8917 == null) {
                            if (class72.field1004 <= class712.method5167(-2334)) {
                                class617.field8917 = class709.field10268.method4776(class640.field9183.field7671, arg0 + 111);
                            }
                        } else if (class617.field8917.field1960 != -1) {
                            class487 var4 = class618.method4519(72, class247.field3814, class185.field2948.field2659);
                            var4.field7362.method1650((byte) -95, class617.field8917.field1960);
                            class185.field2948.method1546(var4, arg0 + 112);
                            class617.field8917 = null;
                            class72.field1004 = class712.method5167(-2334) + 30000L;
                        }
                        class524 var5 = (class524) class199.field3151.method3228(11);
                        if (var5 != null || class592.field8578 < (class712.method5167(-2334) - 2000L)) {
                            class487 var6 = null;
                            int var7 = 0;
                            for (class524 var8 = (class524) class576.field8304.method3228(11); var8 != null && (var6 == null || (var6.field7362.field2799 - var7) < 240); var8 = (class524) class576.field8304.method3216(true)) {
                                var8.method4173(-1);
                                int var9 = var8.method1935(-107);
                                if (var9 < -1) {
                                    var9 = -1;
                                } else if (var9 > 65534) {
                                    var9 = 65534;
                                }
                                int var10 = var8.method1936(11481);
                                if (var10 < -1) {
                                    var10 = -1;
                                } else if (var10 > 65534) {
                                    var10 = 65534;
                                }
                                if (class764.field11210 != var10 || class658.field9411 != var9) {
                                    if (var6 == null) {
                                        var6 = class618.method4519(85, class360.field5808, class185.field2948.field2659);
                                        class609.field8773++;
                                        var6.field7362.method1678(0, 65280);
                                        var7 = var6.field7362.field2799;
                                    }
                                    int var11 = var10 - class764.field11210;
                                    class764.field11210 = var10;
                                    int var12 = var9 - class658.field9411;
                                    class658.field9411 = var9;
                                    int var13 = (int) ((var8.method1939((byte) -32) - class592.field8578) / 20L);
                                    if (var13 < 8 && var11 >= -32 && var11 <= 31 && var12 >= -32 && var12 <= 31) {
                                        var12 += 32;
                                        var11 += 32;
                                        var6.field7362.method1650((byte) -95, (var11 << 6) + (var13 << 12) + var12);
                                    } else if (var13 < 32 && var11 >= -128 && var11 <= 127 && var12 >= -128 && var12 <= 127) {
                                        var6.field7362.method1678(var13 + 128, 65280);
                                        var11 += 128;
                                        var12 += 128;
                                        var6.field7362.method1650((byte) -95, (var11 << 8) + var12);
                                    } else if (var13 >= 32) {
                                        var6.field7362.method1650((byte) -95, var13 + 57344);
                                        if (var10 == 1 || var9 == -1) {
                                            var6.field7362.method1641((byte) -108, Integer.MIN_VALUE);
                                        } else {
                                            var6.field7362.method1641((byte) -108, var10 | var9 << 16);
                                        }
                                    } else {
                                        var6.field7362.method1678(var13 + 192, 65280);
                                        if (var10 == 1 || var9 == -1) {
                                            var6.field7362.method1641((byte) -108, Integer.MIN_VALUE);
                                        } else {
                                            var6.field7362.method1641((byte) -108, var9 << 16 | var10);
                                        }
                                    }
                                    class592.field8578 = var8.method1939((byte) -32);
                                }
                            }
                            if (var6 != null) {
                                var6.field7362.method1668(arg0 - 16899, -var7 + var6.field7362.field2799);
                                class185.field2948.method1546(var6, 1);
                            }
                        }
                        if (var5 != null) {
                            long var14 = (var5.method1939((byte) -32) - class60.field785) / 50L;
                            if (var14 > 32767L) {
                                var14 = 32767L;
                            }
                            class60.field785 = var5.method1939((byte) -32);
                            int var16 = var5.method1935(-113);
                            if (var16 < 0) {
                                var16 = 0;
                            } else if (var16 > 65535) {
                                var16 = 65535;
                            }
                            int var17 = var5.method1936(11481);
                            if (var17 < 0) {
                                var17 = 0;
                            } else if (var17 > 65535) {
                                var17 = 65535;
                            }
                            byte var18 = 0;
                            if (var5.method1933(-30035) == 2) {
                                var18 = 1;
                            }
                            int var19 = (int) var14;
                            class346.field5615++;
                            class487 var20 = class618.method4519(71, class429.field6754, class185.field2948.field2659);
                            var20.field7362.method1661(242267307, var16 << 16 | var17);
                            var20.field7362.method1631(var19 | var18 << 15, -25924);
                            class185.field2948.method1546(var20, 1);
                        }
                        if (class576.field8306 > 0) {
                            class278.field4448++;
                            class487 var21 = class618.method4519(109, class522.field7707, class185.field2948.field2659);
                            var21.field7362.method1678(class576.field8306 * 3, 65280);
                            for (int var22 = 0; var22 < class576.field8306; var22++) {
                                class394 var23 = class292.field4690[var22];
                                long var24 = (var23.method2542(-15652) - class238.field3659) / 50L;
                                if (var24 > 65535L) {
                                    var24 = 65535L;
                                }
                                class238.field3659 = var23.method2542(-15652);
                                var21.field7362.method1678(var23.method2545(arg0 - 23918), arg0 + 65391);
                                var21.field7362.method1650((byte) -95, (int) var24);
                            }
                            class185.field2948.method1546(var21, arg0 ^ 0xFFFFFF90);
                        }
                        if (class694.field9998 > 0) {
                            class694.field9998--;
                        }
                        if (class794.field11604 && class694.field9998 <= 0) {
                            class694.field9998 = 20;
                            class44.field486++;
                            class794.field11604 = false;
                            class487 var26 = class618.method4519(103, class669.field9506, class185.field2948.field2659);
                            var26.field7362.method1640(-571594296, (int) class29.field293 >> 3);
                            var26.field7362.method1640(-571594296, (int) class418.field6612 >> 3);
                            class185.field2948.method1546(var26, arg0 + 112);
                        }
                        if (class198.field3143 != class516.field7619) {
                            class516.field7619 = class198.field3143;
                            class141.field1977++;
                            class487 var27 = class618.method4519(98, class268.field4319, class185.field2948.field2659);
                            var27.field7362.method1678(class198.field3143 ? 1 : 0, 65280);
                            class185.field2948.method1546(var27, arg0 ^ 0xFFFFFF90);
                        }
                        if (!class746.field10999) {
                            class605.field8719++;
                            class487 var28 = class618.method4519(arg0 ^ 0xFFFFFF8D, class199.field3149, class185.field2948.field2659);
                            var28.field7362.method1678(0, 65280);
                            int var29 = var28.field7362.field2799;
                            class176 var30 = class623.field8996.method3241(-2);
                            var28.field7362.method1667(0, var30.field2799, 71, var30.field2805);
                            var28.field7362.method1668(arg0 - 16899, -var29 + var28.field7362.field2799);
                            class185.field2948.method1546(var28, arg0 ^ 0xFFFFFF90);
                            class746.field10999 = true;
                        }
                        if (class85.field1280 != null) {
                            if (class401.field6334 == 2) {
                                class123.method1190(-1);
                            } else if (class401.field6334 == 3) {
                                class266.method2305(2);
                            }
                        }
                        if (class481.field7319) {
                            class481.field7319 = false;
                        } else {
                            class260.field3920 /= 2.0F;
                        }
                        if (class658.field9412) {
                            class658.field9412 = false;
                        } else {
                            class636.field9130 /= 2.0F;
                        }
                        class740.method5388(arg0 + 110);
                        if (class315.field5127 == 11) {
                            class138.method1285((byte) 123);
                            class112.method1024(arg0 + 109);
                            class207.method1874(23659);
                            class185.field2948.field2665++;
                            if (class185.field2948.field2665 > 750) {
                                class169.method1574(arg0 ^ 0x5A66);
                            } else {
                                class739.method5372(0);
                                class337.method2839(arg0 + 19);
                                class728.method5284((byte) 84);
                                for (int var31 = class398.field6315.method2832(arg0 + 110, true); var31 != -1; var31 = class398.field6315.method2832(-1, false)) {
                                    class490.method3721(var31, 15120);
                                    class78.field1215[class292.method2485(class72.field1012++, 31)] = var31;
                                }
                                for (class551 var32 = class747.method5433((byte) 55); var32 != null; var32 = class747.method5433((byte) 55)) {
                                    int var33 = var32.method4087((byte) 115);
                                    long var34 = var32.method4088((byte) 123);
                                    if (var33 == 1) {
                                        class380.field6121[(int) var34] = var32.field8076;
                                        class542.field7987 |= class335.field5467[(int) var34];
                                        class530.field7796[class292.method2485(31, class94.field1370++)] = (int) var34;
                                    } else if (var33 == 2) {
                                        class723.field10611[(int) var34] = var32.field8072;
                                        class57.field698[class292.method2485(class193.field3038++, 31)] = (int) var34;
                                    } else if (var33 == 3) {
                                        class683 var36 = class200.method1826(true, (int) var34);
                                        if (!var32.field8072.equals(var36.field9780)) {
                                            var36.field9780 = var32.field8072;
                                            class454.method3525((byte) 27, var36);
                                        }
                                    } else if (var33 == 4) {
                                        class683 var37 = class200.method1826(true, (int) var34);
                                        int var38 = var32.field8076;
                                        int var39 = var32.field8073;
                                        int var40 = var32.field8081;
                                        if (var37.field9768 != var38 || var37.field9765 != var39 || var37.field9863 != var40) {
                                            var37.field9863 = var40;
                                            var37.field9768 = var38;
                                            var37.field9765 = var39;
                                            class454.method3525((byte) 27, var37);
                                        }
                                    } else if (var33 == 5) {
                                        class683 var62 = class200.method1826(true, (int) var34);
                                        if (var32.field8076 != var62.field9824 || var32.field8076 == -1) {
                                            var62.field9874 = 0;
                                            var62.field9769 = 0;
                                            var62.field9873 = 1;
                                            var62.field9824 = var32.field8076;
                                            class210 var63 = var62.field9824 == -1 ? null : class397.field6293.method2058(var62.field9824, (byte) -114);
                                            if (var63 != null) {
                                                class290.method2443((byte) 120, var62.field9769, var63);
                                            }
                                            class454.method3525((byte) 27, var62);
                                        }
                                    } else if (var33 == 6) {
                                        int var56 = var32.field8076;
                                        int var57 = (var56 & 0x7F08) >> 10;
                                        int var58 = (var56 & 0x3FE) >> 5;
                                        int var59 = var56 & 0x1F;
                                        int var60 = (var59 << 3) + ((var57 << 19) + (var58 << 11));
                                        class683 var61 = class200.method1826(true, (int) var34);
                                        if (var61.field9789 != var60) {
                                            var61.field9789 = var60;
                                            class454.method3525((byte) 27, var61);
                                        }
                                    } else if (var33 == 7) {
                                        class683 var41 = class200.method1826(true, (int) var34);
                                        boolean var42 = var32.field8076 == 1;
                                        if (var42 != var41.field9784) {
                                            var41.field9784 = var42;
                                            class454.method3525((byte) 27, var41);
                                        }
                                    } else if (var33 == 8) {
                                        class683 var43 = class200.method1826(true, (int) var34);
                                        if (var32.field8076 != var43.field9727 || var32.field8073 != var43.field9879 || var32.field8081 != var43.field9791) {
                                            var43.field9791 = var32.field8081;
                                            var43.field9879 = var32.field8073;
                                            var43.field9727 = var32.field8076;
                                            if (var43.field9807 != -1) {
                                                if (var43.field9812 > 0) {
                                                    var43.field9791 = var43.field9791 * 32 / var43.field9812;
                                                } else if (var43.field9788 > 0) {
                                                    var43.field9791 = var43.field9791 * 32 / var43.field9788;
                                                }
                                            }
                                            class454.method3525((byte) 27, var43);
                                        }
                                    } else if (var33 == 9) {
                                        class683 var44 = class200.method1826(true, (int) var34);
                                        if (var32.field8076 != var44.field9807 || var32.field8073 != var44.field9864) {
                                            var44.field9864 = var32.field8073;
                                            var44.field9807 = var32.field8076;
                                            class454.method3525((byte) 27, var44);
                                        }
                                    } else if (var33 == 10) {
                                        class683 var45 = class200.method1826(true, (int) var34);
                                        if (var32.field8076 != var45.field9856 || var32.field8073 != var45.field9882 || var32.field8081 != var45.field9842) {
                                            var45.field9842 = var32.field8081;
                                            var45.field9856 = var32.field8076;
                                            var45.field9882 = var32.field8073;
                                            class454.method3525((byte) 27, var45);
                                        }
                                    } else if (var33 == 11) {
                                        class683 var55 = class200.method1826(true, (int) var34);
                                        var55.field9806 = var55.field9814 = var32.field8073;
                                        var55.field9883 = var55.field9796 = var32.field8076;
                                        var55.field9889 = 0;
                                        var55.field9820 = 0;
                                        class454.method3525((byte) 27, var55);
                                    } else if (var33 == 12) {
                                        class683 var46 = class200.method1826(true, (int) var34);
                                        int var47 = var32.field8076;
                                        if (var46 != null && var46.field9782 == 0) {
                                            if (var47 > var46.field9821 - var46.field9777) {
                                                var47 = var46.field9821 - var46.field9777;
                                            }
                                            if (var47 < 0) {
                                                var47 = 0;
                                            }
                                            if (var46.field9744 != var47) {
                                                var46.field9744 = var47;
                                                class454.method3525((byte) 27, var46);
                                            }
                                        }
                                    } else if (var33 == 14) {
                                        class683 var48 = class200.method1826(true, (int) var34);
                                        var48.field9737 = var32.field8076;
                                    } else if (var33 == 15) {
                                        class83.field1262 = var32.field8076;
                                        class232.field3598 = var32.field8073;
                                        class499.field7490 = true;
                                    } else if (var33 == 16) {
                                        class683 var54 = class200.method1826(true, (int) var34);
                                        var54.field9718 = var32.field8076;
                                    } else if (var33 == 17) {
                                        class683 var53 = class200.method1826(true, (int) var34);
                                        var53.field9778 = var32.field8076;
                                    } else if (var33 == 18) {
                                        class683 var49 = class200.method1826(true, (int) var34);
                                        int var50 = (int) (var34 >> 32);
                                        var49.method4966((byte) -92, (short) var32.field8076, (short) var32.field8073, var50);
                                    } else if (var33 == 19) {
                                        class683 var51 = class200.method1826(true, (int) var34);
                                        int var52 = (int) (var34 >> 32);
                                        var51.method4981((short) var32.field8073, (short) var32.field8076, 0, var52);
                                    }
                                }
                                if (class359.field5799 != 0) {
                                    class438.field6845 += 20;
                                    if (class438.field6845 >= 400) {
                                        class359.field5799 = 0;
                                    }
                                }
                                class778.field11350++;
                                if (class268.field4328 != null) {
                                    class632.field9087++;
                                    if (class632.field9087 >= 15) {
                                        class454.method3525((byte) 27, class268.field4328);
                                        class268.field4328 = null;
                                    }
                                }
                                class239.field3684 = null;
                                class535.field7853 = false;
                                class309.field5061 = null;
                                class548.field8053 = false;
                                class259.method2179(0, null, -1, -1);
                                class340.method2863(-1, null, (byte) -89, -1);
                                if (!class501.field7499) {
                                    class561.field8156 = -1;
                                }
                                class502.method3787((byte) 126);
                                class318.field5182++;
                                if (class19.field195) {
                                    class253.field3866++;
                                    class487 var64 = class618.method4519(120, class179.field2876, class185.field2948.field2659);
                                    var64.field7362.method1638(class559.field8135 | class38.field432 << 28 | class739.field10858 << 14, 42);
                                    class185.field2948.method1546(var64, 1);
                                    class19.field195 = false;
                                }
                                while (true) {
                                    class730 var65;
                                    class683 var66;
                                    class683 var67;
                                    do {
                                        var65 = (class730) class794.field11602.method3219(-125);
                                        if (var65 == null) {
                                            while (true) {
                                                class730 var68;
                                                class683 var69;
                                                class683 var70;
                                                do {
                                                    var68 = (class730) class444.field6914.method3219(-98);
                                                    if (var68 == null) {
                                                        while (true) {
                                                            class730 var71;
                                                            class683 var72;
                                                            class683 var73;
                                                            do {
                                                                var71 = (class730) class461.field7104.method3219(arg0 ^ 0x23);
                                                                if (var71 == null) {
                                                                    if (class239.field3684 == null) {
                                                                        class542.field7985 = 0;
                                                                    }
                                                                    if (class360.field5806 != null) {
                                                                        class36.method358(128);
                                                                    }
                                                                    if (class264.field4283 > 0 && class196.field3117.method1189(82, 15708) && class196.field3117.method1189(81, 15708) && class317.field5177 != 0) {
                                                                        int var74 = class438.field6846.field9975 - class317.field5177;
                                                                        if (var74 < 0) {
                                                                            var74 = 0;
                                                                        } else if (var74 > 3) {
                                                                            var74 = 3;
                                                                        }
                                                                        class551.method4091(false, var74, class438.field6846.field1200[0] + class141.field2011, class397.field6289 - -class438.field6846.field1201[0]);
                                                                    }
                                                                    class775.method5579((byte) -58);
                                                                    for (int var75 = 0; var75 < 5; var75++) {
                                                                        int var10002 = class31.field365[var75]++;
                                                                    }
                                                                    if (class542.field7987 && class691.field9961 < class712.method5167(arg0 ^ 0x973) - 60000L) {
                                                                        class227.method1989(0);
                                                                    }
                                                                    for (class287 var76 = (class287) class334.field5449.method749(arg0 + 111); var76 != null; var76 = (class287) class334.field5449.method747((byte) 21)) {
                                                                        if (class712.method5167(-2334) / 1000L - 5L > (long) var76.field4628) {
                                                                            if (var76.field4627 > 0) {
                                                                                class585.method4297("", "", (byte) 105, 5, "", var76.field4624 + class709.field10221.method5154(class795.field11624, (byte) 65), 0);
                                                                            }
                                                                            if (var76.field4627 == 0) {
                                                                                class585.method4297("", "", (byte) 114, 5, "", var76.field4624 + class709.field10222.method5154(class795.field11624, (byte) 65), 0);
                                                                            }
                                                                            var76.method1715(-20685);
                                                                        }
                                                                    }
                                                                    class313.field5123++;
                                                                    if (class313.field5123 > 500) {
                                                                        class313.field5123 = 0;
                                                                        int var77 = (int) (Math.random() * 8.0D);
                                                                        if ((var77 & 0x1) == 1) {
                                                                            class438.field6844 += class1.field4;
                                                                        }
                                                                        if ((var77 & 0x2) == 2) {
                                                                            class159.field2334 += class304.field4914;
                                                                        }
                                                                        if ((var77 & 0x4) == 4) {
                                                                            class592.field8574 += class563.field8178;
                                                                        }
                                                                    }
                                                                    if (class438.field6844 < -50) {
                                                                        class1.field4 = 2;
                                                                    }
                                                                    if (class438.field6844 > 50) {
                                                                        class1.field4 = -2;
                                                                    }
                                                                    if (class159.field2334 < -55) {
                                                                        class304.field4914 = 2;
                                                                    }
                                                                    if (class592.field8574 < -40) {
                                                                        class563.field8178 = 1;
                                                                    }
                                                                    if (class159.field2334 > 55) {
                                                                        class304.field4914 = -2;
                                                                    }
                                                                    class547.field8034++;
                                                                    if (class592.field8574 > 40) {
                                                                        class563.field8178 = -1;
                                                                    }
                                                                    if (class547.field8034 > 500) {
                                                                        class547.field8034 = 0;
                                                                        int var78 = (int) (Math.random() * 8.0D);
                                                                        if ((var78 & 0x2) == 2) {
                                                                            class85.field1275 += class348.field5641;
                                                                        }
                                                                        if ((var78 & 0x1) == 1) {
                                                                            class126.field1819 += class300.field4862;
                                                                        }
                                                                    }
                                                                    if (class126.field1819 < -60) {
                                                                        class300.field4862 = 2;
                                                                    }
                                                                    if (class85.field1275 < -20) {
                                                                        class348.field5641 = 1;
                                                                    }
                                                                    if (class126.field1819 > 60) {
                                                                        class300.field4862 = -2;
                                                                    }
                                                                    if (class85.field1275 > 10) {
                                                                        class348.field5641 = -1;
                                                                    }
                                                                    class185.field2948.field2671++;
                                                                    if (class185.field2948.field2671 > 50) {
                                                                        class533.field7817++;
                                                                        class487 var79 = class618.method4519(103, class355.field5712, class185.field2948.field2659);
                                                                        class185.field2948.method1546(var79, 1);
                                                                    }
                                                                    if (class142.field2025) {
                                                                        class613.method4459((byte) -107);
                                                                        class142.field2025 = false;
                                                                    }
                                                                    try {
                                                                        class185.field2948.method1545(94);
                                                                        return;
                                                                    } catch (IOException var81) {
                                                                        class169.method1574(-23049);
                                                                        return;
                                                                    }
                                                                }
                                                                var72 = var71.field10693;
                                                                if (var72.field9799 < 0) {
                                                                    break;
                                                                }
                                                                var73 = class200.method1826(true, var72.field9764);
                                                            } while (var73 == null || var73.field9743 == null || var73.field9743.length <= var72.field9799 || var73.field9743[var72.field9799] != var72);
                                                            class598.method4378(var71);
                                                        }
                                                    }
                                                    var69 = var68.field10693;
                                                    if (var69.field9799 < 0) {
                                                        break;
                                                    }
                                                    var70 = class200.method1826(true, var69.field9764);
                                                } while (var70 == null || var70.field9743 == null || var70.field9743.length <= var69.field9799 || var70.field9743[var69.field9799] != var69);
                                                class598.method4378(var68);
                                            }
                                        }
                                        var66 = var65.field10693;
                                        if (var66.field9799 < 0) {
                                            break;
                                        }
                                        var67 = class200.method1826(true, var66.field9764);
                                    } while (var67 == null || var67.field9743 == null || var67.field9743.length <= var66.field9799 || var67.field9743[var66.field9799] != var66);
                                    class598.method4378(var65);
                                }
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException var82) {
            throw class590.method4333(var82, field6001[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "(I)V")
    public static void method3044(int arg0) {
        try {
            field5996 = null;
            field5999 = null;
            field5997 = null;
            if (arg0 != 29882) {
                method3046(-54, 22, -8, 123, 11, -113, 118, 26, -44);
            }
            field5992 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6001[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(IBI)Z")
    public static final boolean method3045(int arg0, byte arg1, int arg2) {
        try {
            field5994++;
            if (arg1 < 14) {
                method3042(-111);
            }
            return (arg0 & 0x800) != 0;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field6001[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method3046(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        try {
            field5998++;
            if (arg8 < 59) {
                field5995 = -72;
            }
            if (arg0 >= 1 && arg4 >= 1 && arg0 <= class126.field1823 - 2 && class169.field2725 - 2 >= arg4) {
                int var9 = arg1;
                if (arg1 < 3 && class541.method4028(arg4, arg0, (byte) 113)) {
                    var9 = arg1 + 1;
                }
                if (class623.field8996.field6356.method4838(true) == 0 && !class223.method1962(var9, 83, class262.field4264, arg4, arg0)) {
                    return;
                }
                if (class85.field1280 == null) {
                    return;
                }
                class60.field778.method1396(arg4, 18879, arg1, arg0, class662.field9437, class297.field4841[arg1], arg3);
                if (arg5 >= 0) {
                    int var10 = class623.field8996.field6371.method3911(true);
                    class623.field8996.method3244(22733, class623.field8996.field6371, 1);
                    class60.field778.method1397((byte) -122, class662.field9437, arg5, arg2, arg7, arg6, arg1, var9, arg4, arg0, class297.field4841[arg1]);
                    class623.field8996.method3244(22733, class623.field8996.field6371, var10);
                    return;
                }
            }
        } catch (RuntimeException var12) {
            throw class590.method4333(var12, field6001[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(Lpea;II)V")
    public static final void method3047(class758 arg0, int arg1, int arg2) {
        try {
            field5993++;
            if (class180.field2880) {
                arg1 = 0;
                class180.field2880 = false;
            }
            if (arg2 == 0 && class129.field1850 == null || !class129.field1850.method5478((byte) 127, arg0)) {
                class129.field1850 = arg0;
                class96.field1400 = class712.method5167(-2334);
                class788.field11520 = arg1;
                class475.field7237 = arg1;
                if (class475.field7237 != 0) {
                    class55.field695 = class214.field3370;
                    class224.field3511 = class127.field1830;
                    class31.field368 = class101.field1479;
                    class130.field1854 = class653.field9356;
                    class50.field597 = class428.field6749;
                    class284.field4604 = class409.field6539;
                    class133.field1894 = class711.field10286;
                    class356.field5725 = class241.field3708;
                    class167.field2707 = class172.field2757;
                    class775.field11327 = class778.field11347;
                    return;
                }
                class570.method4198(65280);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field6001[4] + (arg0 == null ? field6001[6] : field6001[5]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!rq", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3048(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!rq", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3049(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 78;
                    break;
                case 1:
                    var10005 = 85;
                    break;
                case 2:
                    var10005 = 113;
                    break;
                case 3:
                    var10005 = 107;
                    break;
                default:
                    var10005 = 7;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
