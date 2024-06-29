import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class109 {

    @OriginalMember(owner = "client!to", name = "t", descriptor = "I")
    public int field1589;

    @OriginalMember(owner = "client!to", name = "q", descriptor = "[I")
    public int[] field1586;

    @OriginalMember(owner = "client!to", name = "g", descriptor = "[Lgi;")
    public class287[] field1576;

    @OriginalMember(owner = "client!to", name = "l", descriptor = "[I")
    public static int[] field1581 = new int[5];

    @OriginalMember(owner = "client!to", name = "m", descriptor = "Ljava/lang/String;")
    public static String field1582 = "wave:";

    @OriginalMember(owner = "client!to", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field1585 = new String[200];

    @OriginalMember(owner = "client!to", name = "o", descriptor = "I")
    public static int field1584 = 0;

    @OriginalMember(owner = "client!to", name = "k", descriptor = "F")
    public static float field1580;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!to", name = "b", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!to", name = "c", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!to", name = "d", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!to", name = "f", descriptor = "I")
    public static int field1575;

    @OriginalMember(owner = "client!to", name = "h", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!to", name = "i", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!to", name = "j", descriptor = "I")
    public static int field1579;

    @OriginalMember(owner = "client!to", name = "n", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!to", name = "r", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!to", name = "s", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!to", name = "e", descriptor = "Lln;")
    public static class118 field1574;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(II)I", line = 9)
    public static final int method830(int arg0, int arg1) {
        field1573++;
        return arg0 == 22733 ? arg1 >>> 8 : 68;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Z)V", line = 20)
    public static void method831(boolean arg0) {
        if (!arg0) {
            method834((byte) -89, -84);
        }
        field1574 = null;
        field1581 = null;
        field1582 = null;
        field1585 = null;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IIZZIII)V", line = 35)
    public static final void method832(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field1570++;
        if (arg3) {
            class141.method999();
        }
        if (class124.field1809 != null && (arg5 != 3 || class96.field1365 != arg6 || class285.field4298 != arg4)) {
            class220.method1604(class54.field787, class124.field1809, 83);
            class124.field1809 = null;
        }
        if (arg5 == 3 && class124.field1809 == null) {
            class124.field1809 = class2.method8(0, 0, class54.field787, arg6, arg4, (byte) -71);
            if (class124.field1809 != null) {
                class285.field4298 = arg4;
                class96.field1365 = arg6;
                class309.method2176(class54.field787, false);
            }
        }
        if (arg5 == 3 && class124.field1809 == null) {
            method832(arg0, arg1, true, true, -1, class135.field1971, -1);
            return;
        }
        Container var7;
        if (class124.field1809 != null) {
            var7 = class124.field1809;
        } else if (class131.field1905 == null) {
            var7 = class54.field787.field878;
        } else {
            var7 = class131.field1905;
        }
        class212.field3069 = var7.getSize().width;
        class98.field1389 = var7.getSize().height;
        if (class131.field1905 == var7) {
            Insets var8 = class131.field1905.getInsets();
            class98.field1389 -= var8.top + var8.bottom;
            class212.field3069 -= var8.right + var8.left;
        }
        if (arg5 < 2) {
            class354.field5445 = 0;
            class286.field4312 = 765;
            class329.field4954 = (class212.field3069 - 765) / 2;
            class19.field301 = 503;
        } else {
            class19.field301 = class98.field1389;
            class329.field4954 = 0;
            class354.field5445 = 0;
            class286.field4312 = class212.field3069;
        }
        if (arg2) {
            class37.method273((byte) -69, class306.field4585);
            class3.method21((byte) 50, class306.field4585);
            if (class67.field977 != null) {
                class67.field977.method543(class306.field4585, 127);
            }
            class300.field4493.method1957((byte) -107);
            class273.method2002(class306.field4585, arg1 ^ 0xFFFFFFAB);
            class263.method1949(1, class306.field4585);
            if (class67.field977 != null) {
                class67.field977.method544(arg1 + 10, class306.field4585);
            }
        } else {
            if (class141.field2031) {
                class141.method1004(class286.field4312, class19.field301);
            }
            class306.field4585.setSize(class286.field4312, class19.field301);
            if (class131.field1905 == var7) {
                Insets var9 = class131.field1905.getInsets();
                class306.field4585.setLocation(class329.field4954 + var9.left, var9.top - -class354.field5445);
            } else {
                class306.field4585.setLocation(class329.field4954, class354.field5445);
            }
        }
        if (arg5 == 0 && arg0 > 0) {
            class141.method1014(class306.field4585);
        }
        if (arg3 && arg5 > 0) {
            class306.field4585.setIgnoreRepaint(true);
            if (!class298.field4462) {
                class40.method289();
                class356.field5460 = null;
                class356.field5460 = class2.method12((byte) 92, class286.field4312, class19.field301, class306.field4585);
                class44.method338();
                if (class194.field2819 == 5) {
                    class230.method1714(true, (byte) -100, class126.field1846);
                } else {
                    class355.method2470((byte) -119, class127.field1851, false);
                }
                try {
                    Graphics var10 = class306.field4585.getGraphics();
                    class356.field5460.method221(0, 0, -92, var10);
                } catch (Exception var14) {
                }
                class228.method1705((byte) 106);
                if (arg0 == 0) {
                    class356.field5460 = class2.method12((byte) 34, 765, 503, class306.field4585);
                } else {
                    class356.field5460 = null;
                }
                class210 var12 = class54.field787.method482((byte) 73, class300.field4493.getClass());
                while (var12.field3056 == 0) {
                    class184.method1283(100L, 10);
                }
                if (var12.field3056 == 1) {
                    class298.field4462 = true;
                }
            }
            if (class298.field4462) {
                class141.method994(class306.field4585, class304.field4559 * 2);
            }
        }
        if (!class141.field2031 && arg5 > 0) {
            method832(arg0, arg1 ^ 0x0, true, true, -1, 0, -1);
            return;
        }
        if (arg5 > arg1 && arg0 == 0) {
            class274.field4154.setPriority(5);
            class356.field5460 = null;
            class317.method2217();
            ((class71) class345.field5336).method577((byte) -120, 200);
            if (class98.field1379) {
                class345.method2430(0.7F);
            }
            if (class73.field1070 == null) {
                class73.field1070 = new class2[13][13];
            }
            class268.method1977(4, 104, 104);
            class24.method148(104, 104);
            class281.method2052(13925);
        } else if (arg5 == 0 && arg0 > 0) {
            class274.field4154.setPriority(1);
            class356.field5460 = class2.method12((byte) 67, 765, 503, class306.field4585);
            class317.method2218();
            class155.method1128();
            ((class71) class345.field5336).method577((byte) 71, 20);
            if (class98.field1379) {
                if (class257.field3849 == 1) {
                    class345.method2430(0.9F);
                }
                if (class257.field3849 == 2) {
                    class345.method2430(0.8F);
                }
                if (class257.field3849 == 3) {
                    class345.method2430(0.7F);
                }
                if (class257.field3849 == 4) {
                    class345.method2430(0.6F);
                }
            }
            class224.method1643();
            class281.method2052(13925);
        }
        class313.field4662 = !class3.method15((byte) 93);
        class155.method1116(class286.field4312, class19.field301);
        if (arg3) {
            class209.method1525(-570);
        }
        if (arg5 >= 2) {
            class352.field5420 = true;
        } else {
            class352.field5420 = false;
        }
        if (class257.field3850 != -1) {
            class202.method1469(true, (byte) -58);
        }
        if (class67.field973 != null && (class194.field2819 == 30 || class194.field2819 == 25)) {
            class83.method681(arg1 - 26552);
        }
        for (int var13 = 0; var13 < 100; var13++) {
            class332.field5051[var13] = true;
        }
        class267.field4069 = true;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(BLjava/lang/String;)V", line = 279)
    public static final void method833(byte arg0, String arg1) {
        field1583++;
        if (class132.field1942 == null) {
            return;
        }
        class132.field1925++;
        class107.field1533.method1915(true, 33);
        int var2 = 66 % ((arg0 + 43) / 33);
        class107.field1533.method1355((byte) -118, class225.method1646(-25, arg1));
        class107.field1533.method1343(arg1, 0);
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(BI)V", line = 301)
    public static final void method834(byte arg0, int arg1) {
        int var2 = 48 / ((arg0 - 35) / 40);
        field1587++;
        class95 var3 = class227.method1699(12, -1855723168, arg1);
        var3.method743(0);
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(I[III[I)V", line = 316)
    public static final void method835(int arg0, int[] arg1, int arg2, int arg3, int[] arg4) {
        if (arg3 < arg2) {
            int var5 = (arg2 + arg3) / 2;
            int var6 = arg3;
            int var7 = arg1[var5];
            arg1[var5] = arg1[arg2];
            arg1[arg2] = var7;
            int var8 = arg4[var5];
            arg4[var5] = arg4[arg2];
            arg4[arg2] = var8;
            for (int var9 = arg3; var9 < arg2; var9++) {
                if (((var9 & 0x1) + var7) < arg1[var9]) {
                    int var10 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6] = var10;
                    int var11 = arg4[var9];
                    arg4[var9] = arg4[var6];
                    arg4[var6++] = var11;
                }
            }
            arg1[arg2] = arg1[var6];
            arg1[var6] = var7;
            arg4[arg2] = arg4[var6];
            arg4[var6] = var8;
            method835(19426, arg1, var6 - 1, arg3, arg4);
            method835(arg0 ^ 0x0, arg1, arg2, var6 + 1, arg4);
        }
        if (arg0 != 19426) {
            method838((String) null, 64);
        }
        field1588++;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IIIII)V", line = 371)
    public static final void method836(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class95 var5 = class227.method1699(10, -1855723168, arg1);
        field1579++;
        if (arg3 >= -41) {
            method836(119, -93, -51, -99, -56);
        }
        var5.method738((byte) 96);
        var5.field1331 = arg0;
        var5.field1329 = arg2;
        var5.field1328 = arg4;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IIII)Lvn;", line = 392)
    public static final class98 method837(int arg0, int arg1, int arg2, int arg3) {
        field1575++;
        class98 var4 = new class98();
        var4.field1393 = arg3;
        var4.field1380 = arg2;
        class288.field4360.method1400((long) arg1, 114, var4);
        class51.method424(1, arg3);
        class359 var5 = class231.method1719(arg1, 83);
        if (var5 != null) {
            class83.method676(var5, (byte) -88);
        }
        if (class289.field4380 != null) {
            class83.method676(class289.field4380, (byte) -124);
            class289.field4380 = null;
        }
        int var6 = class264.field4043;
        if (arg0 != 26) {
            field1582 = (String) null;
        }
        for (int var7 = 0; var7 < var6; var7++) {
            if (method840(class216.field3186[var7], (byte) -27)) {
                class329.method2280(arg0 ^ 0x2E, var7);
            }
        }
        if (class264.field4043 == 1) {
            class15.field246 = false;
            class230.method1716(class131.field1899, class173.field2499, class172.field2482, 2, class134.field1957);
        } else {
            class230.method1716(class131.field1899, class173.field2499, class172.field2482, 2, class134.field1957);
            int var8 = class126.field1846.method203(class173.field2493);
            for (int var9 = 0; var9 < class264.field4043; var9++) {
                int var10 = class126.field1846.method203(class181.method1252(var9, -21419));
                if (var8 < var10) {
                    var8 = var10;
                }
            }
            class134.field1957 = (class304.field4564 ? 26 : 22) + class264.field4043 * 15;
            class172.field2482 = var8 + 8;
        }
        if (var5 != null) {
            class143.method1031(false, var5, -1);
        }
        class237.method1763(arg3, (byte) 11);
        if (class257.field3850 != -1) {
            class31.method217(-103, 1, class257.field3850);
        }
        return var4;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 472)
    public static final void method838(String arg0, int arg1) {
        field1577++;
        System.out.println("Error: " + class103.method792(2, "\n", "%0a", arg0));
        int var2 = 115 % ((arg1 + 45) / 62);
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "([[I[[B[[F[[B[[B[[B[[F[[FB[[I[[[BI)[Lnk;", line = 483)
    public static final class224[] method839(int[][] arg0, byte[][] arg1, float[][] arg2, byte[][] arg3, byte[][] arg4, byte[][] arg5, float[][] arg6, float[][] arg7, byte arg8, int[][] arg9, byte[][][] arg10, int arg11) {
        field1572++;
        class196 var12 = new class196(128);
        for (int var13 = 1; var13 <= 102; var13++) {
            for (int var14 = 1; var14 <= 102; var14++) {
                int var15 = arg5[var13][var14] & 0xFF;
                int var16 = arg4[var13][var14] & 0xFF;
                if (var16 != 0) {
                    class243 var17 = class1.method5(4, var16 - 1);
                    if (var17.field3627 == -1) {
                        continue;
                    }
                    class224 var18 = class244.method1793(var17, var12, arg8 - 30063);
                    byte var19 = arg1[var13][var14];
                    int[] var20 = class149.field2175[var19];
                    var18.field3380 += var20.length / 2;
                    var18.field3363++;
                    if (var17.field3624 && var15 != 0) {
                        var18.field3380 += class264.field4038[var19];
                    }
                }
                if ((arg5[var13][var14] & 0xFF) != 0 || var16 != 0 && arg1[var13][var14] == 0) {
                    int var21 = 0;
                    int[] var22 = new int[8];
                    int var23 = 0;
                    int var24 = 0;
                    int var25 = 0;
                    int var26 = 0;
                    int var27 = arg4[var13][var14 + 1] & 0xFF;
                    int var28 = arg4[var13 - 1][var14] & 0xFF;
                    int var29 = arg4[var13][var14 - 1] & 0xFF;
                    int var30 = arg4[var13 - 1][var14 + 1] & 0xFF;
                    int var31 = arg4[var13 - 1][var14 - 1] & 0xFF;
                    int var32 = arg4[var13 + 1][var14] & 0xFF;
                    int var33 = arg4[var13 + 1][var14 + 1] & 0xFF;
                    int var34 = arg4[var13 + 1][var14 - 1] & 0xFF;
                    if (var30 == 0 || var16 == var30) {
                        boolean var43 = false;
                    } else {
                        class243 var35 = class1.method5(4, var30 - 1);
                        if (var35.field3624 && var35.field3627 != -1) {
                            byte var36 = arg1[var13 - 1][var14 + 1];
                            byte var37 = arg3[var13 - 1][var14 + 1];
                            int var38 = class252.field3763[(var37 + 3 & 0x3) + var36 * 4];
                            int var39 = class252.field3763[(var37 + 2 & 0x3) + var36 * 4];
                            if (class262.field3995[var38][1] && class262.field3995[var39][0]) {
                                boolean var40 = false;
                            } else {
                                for (int var41 = 0; var41 < 8; var41++) {
                                    if (var21 == var41) {
                                        var22[var21++] = var30;
                                        break;
                                    }
                                    if (var22[var41] == var30) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var42 = false;
                        }
                    }
                    if (var31 == 0 || var16 == var31) {
                        boolean var52 = false;
                    } else {
                        class243 var44 = class1.method5(4, var31 - 1);
                        if (var44.field3624 && var44.field3627 != -1) {
                            byte var45 = arg3[var13 - 1][var14 - 1];
                            byte var46 = arg1[var13 - 1][var14 - 1];
                            int var47 = class252.field3763[(var45 & 0x3) + var46 * 4];
                            int var48 = class252.field3763[var46 * 4 + (var45 + 3 & 0x3)];
                            if (class262.field3995[var47][1] && class262.field3995[var48][0]) {
                                boolean var49 = false;
                            } else {
                                for (int var50 = 0; var50 < 8; var50++) {
                                    if (var21 == var50) {
                                        var22[var21++] = var31;
                                        break;
                                    }
                                    if (var22[var50] == var31) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var51 = false;
                        }
                    }
                    if (var34 == 0 || var16 == var34) {
                        boolean var61 = false;
                    } else {
                        class243 var53 = class1.method5(4, var34 - 1);
                        if (var53.field3624 && var53.field3627 != -1) {
                            byte var54 = arg3[var13 + 1][var14 - 1];
                            byte var55 = arg1[var13 + 1][var14 - 1];
                            int var56 = class252.field3763[(var54 + 1 & 0x3) + var55 * 4];
                            int var57 = class252.field3763[var55 * 4 + (var54 & 0x3)];
                            if (class262.field3995[var56][1] && class262.field3995[var57][0]) {
                                boolean var58 = false;
                            } else {
                                for (int var59 = 0; var59 < 8; var59++) {
                                    if (var21 == var59) {
                                        var22[var21++] = var34;
                                        break;
                                    }
                                    if (var22[var59] == var34) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var60 = false;
                        }
                    }
                    if (var33 == 0 || var16 == var33) {
                        boolean var70 = false;
                    } else {
                        class243 var62 = class1.method5(arg8 ^ 0xFFFFFFD4, var33 - 1);
                        if (var62.field3624 && var62.field3627 != -1) {
                            byte var63 = arg3[var13 + 1][var14 + 1];
                            byte var64 = arg1[var13 + 1][var14 + 1];
                            int var65 = class252.field3763[(var63 + 1 & 0x3) + var64 * 4];
                            int var66 = class252.field3763[(var63 + 2 & 0x3) + var64 * 4];
                            if (class262.field3995[var66][1] && class262.field3995[var65][0]) {
                                boolean var67 = false;
                            } else {
                                for (int var68 = 0; var68 < 8; var68++) {
                                    if (var21 == var68) {
                                        var22[var21++] = var33;
                                        break;
                                    }
                                    if (var22[var68] == var33) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var69 = false;
                        }
                    }
                    if (var27 != 0 && var16 != var27) {
                        class243 var71 = class1.method5(arg8 ^ 0xFFFFFFD4, var27 - 1);
                        if (var71.field3624 && var71.field3627 != -1) {
                            var23 = class252.field3763[arg1[var13][var14 + 1] * 4 + (arg3[var13][var14 + 1] + 2 & 0x3)];
                            for (int var72 = 0; var72 < 8; var72++) {
                                if (var21 == var72) {
                                    var22[var21++] = var27;
                                    break;
                                }
                                if (var22[var72] == var27) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var28 != 0 && var16 != var28) {
                        class243 var73 = class1.method5(4, var28 - 1);
                        if (var73.field3624 && var73.field3627 != -1) {
                            var25 = class252.field3763[(arg3[var13 - 1][var14] + 3 & 0x3) + arg1[var13 - 1][var14] * 4];
                            for (int var74 = 0; var74 < 8; var74++) {
                                if (var21 == var74) {
                                    var22[var21++] = var28;
                                    break;
                                }
                                if (var22[var74] == var28) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var29 != 0 && var16 != var29) {
                        class243 var75 = class1.method5(arg8 ^ 0xFFFFFFD4, var29 - 1);
                        if (var75.field3624 && var75.field3627 != -1) {
                            var24 = class252.field3763[(arg3[var13][var14 - 1] & 0x3) + arg1[var13][var14 - 1] * 4];
                            for (int var76 = 0; var76 < 8; var76++) {
                                if (var21 == var76) {
                                    var22[var21++] = var29;
                                    break;
                                }
                                if (var22[var76] == var29) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var32 != 0 && var16 != var32) {
                        class243 var77 = class1.method5(4, var32 - 1);
                        if (var77.field3624 && var77.field3627 != -1) {
                            var26 = class252.field3763[(arg3[var13 + 1][var14] + 1 & 0x3) + arg1[var13 + 1][var14] * 4];
                            for (int var78 = 0; var78 < 8; var78++) {
                                if (var21 == var78) {
                                    var22[var21++] = var32;
                                    break;
                                }
                                if (var22[var78] == var32) {
                                    break;
                                }
                            }
                        }
                    }
                    for (int var79 = 0; var79 < var21; var79++) {
                        int var80 = var22[var79];
                        boolean[] var81 = class262.field3995[var27 == var80 ? var23 : 0];
                        boolean[] var82 = class262.field3995[var28 == var80 ? var25 : 0];
                        boolean[] var83 = class262.field3995[var32 == var80 ? var26 : 0];
                        boolean[] var84 = class262.field3995[var29 == var80 ? var24 : 0];
                        class243 var85 = class1.method5(arg8 ^ 0xFFFFFFD4, var80 - 1);
                        class224 var86 = class244.method1793(var85, var12, -30111);
                        var86.field3380 += 5;
                        var86.field3380 += var81.length - 2;
                        var86.field3380 += var82.length - 2;
                        var86.field3380 += var84.length - 2;
                        var86.field3380 += var83.length - 2;
                        var86.field3363++;
                    }
                }
            }
        }
        for (class224 var87 = (class224) var12.method1406(0); var87 != null; var87 = (class224) var12.method1404(-106)) {
            var87.method1645();
        }
        for (int var88 = 1; var88 <= 102; var88++) {
            for (int var89 = 1; var89 <= 102; var89++) {
                int var90 = arg5[var88][var89] & 0xFF;
                int var91;
                if ((arg10[arg11][var88][var89] & 0x8) != 0) {
                    var91 = 0;
                } else if ((arg10[1][var88][var89] & 0x2) == 2 && arg11 > 0) {
                    var91 = arg11 - 1;
                } else {
                    var91 = arg11;
                }
                int var92 = arg4[var88][var89] & 0xFF;
                if (var92 != 0) {
                    class243 var93 = class1.method5(arg8 ^ 0xFFFFFFD4, var92 - 1);
                    if (var93.field3627 == -1) {
                        continue;
                    }
                    class224 var94 = class244.method1793(var93, var12, -30111);
                    byte var95 = arg1[var88][var89];
                    byte var96 = arg3[var88][var89];
                    int var97 = class333.method2352(var93.field3627, arg9[var88][var89], var93.field3618, (byte) -13);
                    int var98 = class333.method2352(var93.field3627, arg9[var88 + 1][var89], var93.field3618, (byte) -13);
                    int var99 = class333.method2352(var93.field3627, arg9[var88 + 1][var89 + 1], var93.field3618, (byte) -13);
                    int var100 = class333.method2352(var93.field3627, arg9[var88][var89 + 1], var93.field3618, (byte) -13);
                    class72.method593(var100, var90 != 0 && var93.field3624, var94, var91, var97, var99, arg2, var96, 28, arg7, var95, arg0, var98, arg6, var88, var89);
                }
                if ((arg5[var88][var89] & 0xFF) != 0 || var92 != 0 && arg1[var88][var89] == 0) {
                    int var101 = 0;
                    int[] var102 = new int[8];
                    int var103 = 0;
                    int var104 = 0;
                    int var105 = 0;
                    int var106 = arg4[var88][var89 + 1] & 0xFF;
                    int var107 = 0;
                    int var108 = arg4[var88 + 1][var89] & 0xFF;
                    int var109 = arg4[var88 - 1][var89] & 0xFF;
                    int var110 = arg4[var88 - 1][var89 + 1] & 0xFF;
                    int var111 = arg4[var88][var89 - 1] & 0xFF;
                    int var112 = arg4[var88 - 1][var89 - 1] & 0xFF;
                    int var113 = arg4[var88 + 1][var89 - 1] & 0xFF;
                    int var114 = arg4[var88 + 1][var89 + 1] & 0xFF;
                    if (var110 == 0 || var92 == var110) {
                        var110 = 0;
                    } else {
                        class243 var115 = class1.method5(4, var110 - 1);
                        if (var115.field3624 && var115.field3627 != -1) {
                            byte var116 = arg1[var88 - 1][var89 + 1];
                            byte var117 = arg3[var88 - 1][var89 + 1];
                            int var118 = class252.field3763[var116 * 4 + (var117 + 3 & 0x3)];
                            int var119 = class252.field3763[(var117 + 2 & 0x3) + var116 * 4];
                            if (class262.field3995[var118][1] && class262.field3995[var119][0]) {
                                var110 = 0;
                            } else {
                                for (int var120 = 0; var120 < 8; var120++) {
                                    if (var101 == var120) {
                                        var102[var101++] = var110;
                                        break;
                                    }
                                    if (var102[var120] == var110) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var110 = 0;
                        }
                    }
                    if (var112 == 0 || var92 == var112) {
                        var112 = 0;
                    } else {
                        class243 var121 = class1.method5(4, var112 - 1);
                        if (var121.field3624 && var121.field3627 != -1) {
                            byte var122 = arg3[var88 - 1][var89 - 1];
                            byte var123 = arg1[var88 - 1][var89 - 1];
                            int var124 = class252.field3763[(var122 & 0x3) + var123 * 4];
                            int var125 = class252.field3763[(var122 + 3 & 0x3) + var123 * 4];
                            if (class262.field3995[var124][1] && class262.field3995[var125][0]) {
                                var112 = 0;
                            } else {
                                for (int var126 = 0; var126 < 8; var126++) {
                                    if (var101 == var126) {
                                        var102[var101++] = var112;
                                        break;
                                    }
                                    if (var102[var126] == var112) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var112 = 0;
                        }
                    }
                    if (var113 == 0 || var92 == var113) {
                        var113 = 0;
                    } else {
                        class243 var127 = class1.method5(4, var113 - 1);
                        if (var127.field3624 && var127.field3627 != -1) {
                            byte var128 = arg1[var88 + 1][var89 - 1];
                            byte var129 = arg3[var88 + 1][var89 - 1];
                            int var130 = class252.field3763[(var129 & 0x3) + var128 * 4];
                            int var131 = class252.field3763[(var129 + 1 & 0x3) + var128 * 4];
                            if (class262.field3995[var131][1] && class262.field3995[var130][0]) {
                                var113 = 0;
                            } else {
                                for (int var132 = 0; var132 < 8; var132++) {
                                    if (var101 == var132) {
                                        var102[var101++] = var113;
                                        break;
                                    }
                                    if (var102[var132] == var113) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var113 = 0;
                        }
                    }
                    if (var114 == 0 || var92 == var114) {
                        var114 = 0;
                    } else {
                        class243 var133 = class1.method5(4, var114 - 1);
                        if (var133.field3624 && var133.field3627 != -1) {
                            byte var134 = arg3[var88 + 1][var89 + 1];
                            byte var135 = arg1[var88 + 1][var89 + 1];
                            int var136 = class252.field3763[(var134 + 2 & 0x3) + var135 * 4];
                            int var137 = class252.field3763[(var134 + 1 & 0x3) + var135 * 4];
                            if (class262.field3995[var136][1] && class262.field3995[var137][0]) {
                                var114 = 0;
                            } else {
                                for (int var138 = 0; var138 < 8; var138++) {
                                    if (var101 == var138) {
                                        var102[var101++] = var114;
                                        break;
                                    }
                                    if (var102[var138] == var114) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var114 = 0;
                        }
                    }
                    if (var106 != 0 && var92 != var106) {
                        class243 var139 = class1.method5(4, var106 - 1);
                        if (var139.field3624 && var139.field3627 != -1) {
                            var103 = class252.field3763[(arg3[var88][var89 + 1] + 2 & 0x3) + arg1[var88][var89 + 1] * 4];
                            for (int var140 = 0; var140 < 8; var140++) {
                                if (var101 == var140) {
                                    var102[var101++] = var106;
                                    break;
                                }
                                if (var102[var140] == var106) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var109 != 0 && var92 != var109) {
                        class243 var141 = class1.method5(4, var109 - 1);
                        if (var141.field3624 && var141.field3627 != -1) {
                            var104 = class252.field3763[(arg3[var88 - 1][var89] + 3 & 0x3) + arg1[var88 - 1][var89] * 4];
                            for (int var142 = 0; var142 < 8; var142++) {
                                if (var101 == var142) {
                                    var102[var101++] = var109;
                                    break;
                                }
                                if (var102[var142] == var109) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var111 != 0 && var92 != var111) {
                        class243 var143 = class1.method5(4, var111 - 1);
                        if (var143.field3624 && var143.field3627 != -1) {
                            var107 = class252.field3763[(arg3[var88][var89 - 1] & 0x3) + arg1[var88][var89 - 1] * 4];
                            for (int var144 = 0; var144 < 8; var144++) {
                                if (var101 == var144) {
                                    var102[var101++] = var111;
                                    break;
                                }
                                if (var102[var144] == var111) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var108 != 0 && var92 != var108) {
                        class243 var145 = class1.method5(arg8 ^ 0xFFFFFFD4, var108 - 1);
                        if (var145.field3624 && var145.field3627 != -1) {
                            var105 = class252.field3763[(arg3[var88 + 1][var89] + 1 & 0x3) + arg1[var88 + 1][var89] * 4];
                            for (int var146 = 0; var146 < 8; var146++) {
                                if (var101 == var146) {
                                    var102[var101++] = var108;
                                    break;
                                }
                                if (var102[var146] == var108) {
                                    break;
                                }
                            }
                        }
                    }
                    for (int var147 = 0; var147 < var101; var147++) {
                        int var148 = var102[var147];
                        boolean[] var149 = class262.field3995[var106 == var148 ? var103 : 0];
                        boolean[] var150 = class262.field3995[var109 == var148 ? var104 : 0];
                        boolean[] var151 = class262.field3995[var108 == var148 ? var105 : 0];
                        boolean[] var152 = class262.field3995[var111 == var148 ? var107 : 0];
                        class243 var153 = class1.method5(4, var148 - 1);
                        class224 var154 = class244.method1793(var153, var12, arg8 - 30063);
                        int var155 = class333.method2352(var153.field3627, arg9[var88][var89], var153.field3618, (byte) -13) << 8 | 0xFF;
                        int var156 = class333.method2352(var153.field3627, arg9[var88 + 1][var89], var153.field3618, (byte) -13) << 8 | 0xFF;
                        int var157 = class333.method2352(var153.field3627, arg9[var88 + 1][var89 + 1], var153.field3618, (byte) -13) << 8 | 0xFF;
                        int var158 = class333.method2352(var153.field3627, arg9[var88][var89 + 1], var153.field3618, (byte) -13) << 8 | 0xFF;
                        byte var159 = 6;
                        int var160 = var149.length + var159 - 2;
                        int var161 = var150.length + var160 - 2;
                        boolean var162 = var110 != var148 && var150[0] && var149[1];
                        boolean var163 = var112 != var148 && var152[0] && var150[1];
                        boolean var164 = var114 != var148 && var149[0] && var151[1];
                        boolean var165 = var113 != var148 && var151[0] && var152[1];
                        int var166 = var152.length + var161 - 2;
                        int var167 = var151.length + var166 - 2;
                        int var168 = class259.method1902(0, true, arg7, arg2, 0.0F, var154, arg6, var158, arg0, var89, 64, (int[][]) null, 64, var157, var155, var156, (byte) 58, var88);
                        int[] var169 = new int[var167];
                        int var170 = class259.method1902(0, var162, arg7, arg2, 0.0F, var154, arg6, var158, arg0, var89, 0, (int[][]) null, 128, var157, var155, var156, (byte) 111, var88);
                        byte var171 = 0;
                        int var172 = class259.method1902(0, var164, arg7, arg2, 0.0F, var154, arg6, var158, arg0, var89, 128, (int[][]) null, 128, var157, var155, var156, (byte) 74, var88);
                        int var173 = class259.method1902(0, var163, arg7, arg2, 0.0F, var154, arg6, var158, arg0, var89, 0, (int[][]) null, 0, var157, var155, var156, (byte) 50, var88);
                        int var174 = class259.method1902(0, var165, arg7, arg2, 0.0F, var154, arg6, var158, arg0, var89, 128, (int[][]) null, 0, var157, var155, var156, (byte) 91, var88);
                        int var180 = var171 + 1;
                        var169[var171] = var168;
                        var169[var180++] = var172;
                        if (var149.length > 2) {
                            var169[var180++] = class259.method1902(0, var149[2], arg7, arg2, 0.0F, var154, arg6, var158, arg0, var89, 64, (int[][]) null, 128, var157, var155, var156, (byte) 68, var88);
                        }
                        var169[var180++] = var170;
                        if (var150.length > 2) {
                            var169[var180++] = class259.method1902(0, var150[2], arg7, arg2, 0.0F, var154, arg6, var158, arg0, var89, 0, (int[][]) null, 64, var157, var155, var156, (byte) 69, var88);
                        }
                        var169[var180++] = var173;
                        if (var152.length > 2) {
                            var169[var180++] = class259.method1902(0, var152[2], arg7, arg2, 0.0F, var154, arg6, var158, arg0, var89, 64, (int[][]) null, 0, var157, var155, var156, (byte) 78, var88);
                        }
                        var169[var180++] = var174;
                        if (var151.length > 2) {
                            var169[var180++] = class259.method1902(0, var151[2], arg7, arg2, 0.0F, var154, arg6, var158, arg0, var89, 128, (int[][]) null, 64, var157, var155, var156, (byte) 120, var88);
                        }
                        var169[var180++] = var172;
                        var154.method1641(var91, var88, var89, var169, (int[]) null, true);
                    }
                }
            }
        }
        for (class224 var175 = (class224) var12.method1406(0); var175 != null; var175 = (class224) var12.method1404(-67)) {
            if (var175.field3365 == 0) {
                var175.method876(arg8 + 56);
            } else {
                var175.method1642();
            }
        }
        int var176 = var12.method1409(0);
        long[] var177 = new long[var176];
        class224[] var178 = new class224[var176];
        var12.method1403(true, var178);
        int var179 = 0;
        if (arg8 != -48) {
            return (class224[]) null;
        }
        while (var179 < var176) {
            var177[var179] = var178[var179].field1656;
            var179++;
        }
        class199.method1448(var178, (byte) -119, var177);
        return var178;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(SB)Z", line = 1415)
    public static final boolean method840(short arg0, byte arg1) {
        field1578++;
        if (arg0 == 2 || arg0 == 34 || arg0 == 22 || arg0 == 17 || arg0 == 58 || arg0 == 50 || arg0 == 8 || arg0 == 7) {
            return true;
        } else if (arg0 == 19 || arg0 == 49 || arg0 == 1008 || arg0 == 1004) {
            return true;
        } else {
            if (arg1 != -27) {
                method837(96, -121, -65, -70);
            }
            if (arg0 == 21 || arg0 == 20 || arg0 == 26 || arg0 == 45 || arg0 == 35) {
                return true;
            } else {
                return arg0 == 1 || arg0 == 37 || arg0 == 46 || arg0 == 60 || arg0 == 42 || arg0 == 47;
            }
        }
    }

    @OriginalMember(owner = "client!to", name = "<init>", descriptor = "(I)V", line = 1438)
    public class109(int arg0) {
        this.field1589 = arg0;
        this.field1586 = new int[this.field1589];
        this.field1576 = new class287[this.field1589];
    }
}
