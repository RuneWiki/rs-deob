import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class592 {

    @OriginalMember(owner = "client!rj", name = "i", descriptor = "I")
    public int field8410;

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "S")
    public short field8405;

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "I")
    public int field8403;

    @OriginalMember(owner = "client!rj", name = "l", descriptor = "Z")
    public boolean field8413;

    @OriginalMember(owner = "client!rj", name = "m", descriptor = "I")
    public int field8414;

    @OriginalMember(owner = "client!rj", name = "k", descriptor = "B")
    public byte field8412;

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "I")
    public int field8404;

    @OriginalMember(owner = "client!rj", name = "h", descriptor = "S")
    public short field8409;

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "I")
    public int field8406;

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "S")
    public short field8408;

    @OriginalMember(owner = "client!rj", name = "j", descriptor = "Lbv;")
    public static class567 field8411 = new class567("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");

    @OriginalMember(owner = "client!rj", name = "o", descriptor = "Lbv;")
    public static class567 field8416 = new class567("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "I")
    public static int field8402;

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "I")
    public static int field8407;

    @OriginalMember(owner = "client!rj", name = "n", descriptor = "I")
    public static int field8415;

    @OriginalMember(owner = "client!rj", name = "p", descriptor = "I")
    public static int field8417;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIII)V")
    private static final void method3384(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field8407++;
        class21 var5 = class601.method3413(arg3, arg2, (byte) 117);
        var5.method230(18340);
        var5.field308 = arg0;
        var5.field302 = arg4;
        var5.field304 = arg1;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lqa;Lcea;III)V")
    public static final void method3385(class167 arg0, class103 arg1, int arg2, int arg3, int arg4) {
        if (arg3 < class362.field5145) {
            class184 var5 = class277.field4051[arg2][arg3 + 1][arg4];
            if (var5 != null && var5.field2662 != null && var5.field2662.method868(false)) {
                arg1.method866((byte) -84, true, 0, arg0, class390.field5828, 0, var5.field2662);
            }
        }
        if (arg4 < class362.field5145) {
            class184 var6 = class277.field4051[arg2][arg3][arg4 + 1];
            if (var6 != null && var6.field2662 != null && var6.field2662.method868(false)) {
                arg1.method866((byte) -84, true, 0, arg0, 0, class390.field5828, var6.field2662);
            }
        }
        if (arg3 < class362.field5145 && arg4 < class305.field4400) {
            class184 var7 = class277.field4051[arg2][arg3 + 1][arg4 + 1];
            if (var7 != null && var7.field2662 != null && var7.field2662.method868(false)) {
                arg1.method866((byte) -84, true, 0, arg0, class390.field5828, class390.field5828, var7.field2662);
            }
        }
        if (arg3 < class362.field5145 && arg4 > 0) {
            class184 var8 = class277.field4051[arg2][arg3 + 1][arg4 - 1];
            if (var8 != null && var8.field2662 != null && var8.field2662.method868(false)) {
                arg1.method866((byte) -84, true, 0, arg0, class390.field5828, -class390.field5828, var8.field2662);
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)V")
    public static void method3386(int arg0) {
        field8416 = null;
        field8411 = null;
        if (arg0 < 61) {
            method3385(null, null, -62, 1, 70);
        }
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(I)Z")
    public static final boolean method3387(int arg0) throws IOException {
        field8415++;
        if (client.field8770 == null) {
            return false;
        }
        if (class240.field3487 == null) {
            if (class295.field4254) {
                if (!client.field8770.method2739(1, 544)) {
                    return false;
                }
                client.field8770.method2741(-1, 0, 1, class52.field761.field3952);
                class39.field537++;
                class464.field6699 = 0;
                class295.field4254 = false;
            }
            class52.field761.field3913 = 0;
            if (class52.field761.method1658((byte) -108)) {
                if (!client.field8770.method2739(1, arg0 ^ 0xFFFFFDDF)) {
                    return false;
                }
                client.field8770.method2741(-1, 1, 1, class52.field761.field3952);
                class39.field537++;
                class464.field6699 = 0;
            }
            class295.field4254 = true;
            class517[] var1 = class467.method2716(false);
            int var2 = class52.field761.method1667((byte) -76);
            if (var2 < 0 || var1.length <= var2) {
                throw new IOException("invo:" + var2 + " ip:" + class52.field761.field3913);
            }
            class240.field3487 = var1[var2];
            class541.field7525 = class240.field3487.field7192;
        }
        if (class541.field7525 == -1) {
            if (!client.field8770.method2739(1, arg0 + 545)) {
                return false;
            }
            client.field8770.method2741(-1, 0, 1, class52.field761.field3952);
            class541.field7525 = class52.field761.field3952[0] & 0xFF;
            class464.field6699 = 0;
            class39.field537++;
        }
        if (class541.field7525 == -2) {
            if (!client.field8770.method2739(2, 544)) {
                return false;
            }
            client.field8770.method2741(-1, 0, 2, class52.field761.field3952);
            class52.field761.field3913 = 0;
            class541.field7525 = class52.field761.method1745(32132);
            class39.field537 += 2;
            class464.field6699 = 0;
        }
        if (class541.field7525 > 0) {
            if (!client.field8770.method2739(class541.field7525, 544)) {
                return false;
            }
            class52.field761.field3913 = 0;
            client.field8770.method2741(-1, 0, class541.field7525, class52.field761.field3952);
            class464.field6699 = 0;
            class39.field537 += class541.field7525;
        }
        class370.field5320 = class338.field4853;
        class338.field4853 = class393.field5881;
        class393.field5881 = class240.field3487;
        if (class294.field4253 == class240.field3487) {
            int var3 = class52.field761.method1748(86);
            class39.field542 = class270.field3976.method354(var3, arg0 ^ 0x54A1);
            class240.field3487 = null;
            return true;
        } else if (class324.field4671 == class240.field3487) {
            boolean var4 = class52.field761.method1738(arg0 + 256) == 1;
            String var5 = class52.field761.method1752(false);
            String var6 = var5;
            if (var4) {
                var6 = class52.field761.method1752(false);
            }
            int var7 = class52.field761.method1738(255);
            int var8 = class52.field761.method1745(32132);
            boolean var9 = false;
            if (var7 <= 1 && class331.method2050(true, var6)) {
                var9 = true;
            }
            if (!var9 && class341.field4914 == 0) {
                String var10 = class377.field5545.method2475(-11743, var8).method2223((byte) -119, class52.field761);
                if (var7 == 2) {
                    class150.method1076(var10, 99, 0, null, "<img=1>" + var5, var8, "<img=1>" + var6, 25);
                } else if (var7 == 1) {
                    class150.method1076(var10, arg0 + 100, 0, null, "<img=0>" + var5, var8, "<img=0>" + var6, 25);
                } else {
                    class150.method1076(var10, arg0 + 100, 0, null, var5, var8, var6, 25);
                }
            }
            class240.field3487 = null;
            return true;
        } else if (class437.field6383 == class240.field3487) {
            int var11 = class52.field761.method1701(arg0 ^ 0xFFFFFF00);
            int var12 = class52.field761.method1744(arg0 + 59);
            if (var12 == 255) {
                var11 = -1;
                var12 = -1;
            }
            class568.method3221(var11, true, var12);
            class240.field3487 = null;
            return true;
        } else if (class442.field6462 == class240.field3487) {
            class240.field3487 = null;
            return false;
        } else if (arg0 != -1) {
            return false;
        } else if (class604.field8604 == class240.field3487) {
            int var13 = class52.field761.method1745(32132);
            if (class481.method2771(var13, false)) {
                class183.method1229((byte) -20);
            }
            class240.field3487 = null;
            return true;
        } else if (class88.field1592 == class240.field3487) {
            class424.method2543(class25.field346, arg0 + 91);
            class240.field3487 = null;
            return true;
        } else if (class240.field3487 == class167.field2444) {
            boolean var14 = class52.field761.method1738(255) == 1;
            String var15 = class52.field761.method1752(false);
            String var16 = var15;
            if (var14) {
                var16 = class52.field761.method1752(false);
            }
            long var17 = (long) class52.field761.method1745(arg0 ^ 0xFFFF827B);
            long var19 = (long) class52.field761.method1700((byte) 44);
            int var21 = class52.field761.method1738(arg0 ^ 0xFFFFFF00);
            int var22 = class52.field761.method1745(arg0 + 32133);
            long var23 = (var17 << 32) + var19;
            boolean var25 = false;
            int var26 = 0;
            while (true) {
                if (var26 >= 100) {
                    if (var21 <= 1 && class331.method2050(true, var16)) {
                        var25 = true;
                    }
                    break;
                }
                if (class600.field8518[var26] == var23) {
                    var25 = true;
                    break;
                }
                var26++;
            }
            if (!var25 && class341.field4914 == 0) {
                class600.field8518[class6.field63] = var23;
                class6.field63 = (class6.field63 + 1) % 100;
                String var27 = class377.field5545.method2475(-11743, var22).method2223((byte) -119, class52.field761);
                if (var21 == 2) {
                    class150.method1076(var27, arg0 + 100, 0, null, "<img=1>" + var15, var22, "<img=1>" + var16, 18);
                } else if (var21 == 1) {
                    class150.method1076(var27, 99, 0, null, "<img=0>" + var15, var22, "<img=0>" + var16, 18);
                } else {
                    class150.method1076(var27, 99, 0, null, var15, var22, var16, 18);
                }
            }
            class240.field3487 = null;
            return true;
        } else if (class551.field7814 == class240.field3487) {
            int var28 = class52.field761.method1750(true);
            int var29 = class52.field761.method1712(82);
            if (class481.method2771(var28, false)) {
                class469.method2722(0, var29, 4, 5, class323.field4670);
            }
            class240.field3487 = null;
            return true;
        } else if (class587.field8366 == class240.field3487) {
            int var30 = class52.field761.method1723((byte) 95);
            int var31 = class52.field761.method1716(-31245);
            int var32 = class52.field761.method1723((byte) 61);
            if (class481.method2771(var30, false)) {
                class612.method3472(var32, var31, (byte) 81);
            }
            class240.field3487 = null;
            return true;
        } else if (class489.field6883 == class240.field3487) {
            int var33 = class52.field761.method1728(arg0 ^ 0xFC6E7A77);
            int var34 = class52.field761.method1712(-47);
            int var35 = class52.field761.method1745(32132);
            int var36 = class52.field761.method1728(59868552);
            if (class481.method2771(var35, false)) {
                class475.method2751(var36, false, var34, var33);
            }
            class240.field3487 = null;
            return true;
        } else if (client.field8782 == class240.field3487) {
            int var37 = class52.field761.method1749((byte) 105);
            int var38 = class52.field761.method1748(101);
            int var39 = class52.field761.method1738(255);
            String var40 = "";
            String var41 = var40;
            if ((var39 & 0x1) != 0) {
                var40 = class52.field761.method1752(false);
                if ((var39 & 0x2) == 0) {
                    var41 = var40;
                } else {
                    var41 = class52.field761.method1752(false);
                }
            }
            String var42 = class52.field761.method1752(false);
            if (var37 == 99) {
                class595.method3397((byte) 122, var42);
            } else if (var41.equals("") || !class331.method2050(true, var41)) {
                class175.method1205(var40, var38, var37, var42, -1, var41);
            } else {
                class240.field3487 = null;
                return true;
            }
            class240.field3487 = null;
            return true;
        } else if (class426.field6226 == class240.field3487) {
            int var43 = class52.field761.method1738(arg0 + 256);
            int var44 = class52.field761.method1723((byte) 102);
            int var45 = class52.field761.method1712(arg0 ^ 0xFFFFFF92);
            if (class481.method2771(var44, false)) {
                class133.method1026(var45, var43, 12137);
            }
            class240.field3487 = null;
            return true;
        } else if (class417.field6139 == class240.field3487) {
            int var46 = class52.field761.method1745(32132);
            if (class481.method2771(var46, false)) {
                class393.method2379((byte) 102);
            }
            class240.field3487 = null;
            return true;
        } else if (class321.field4651 == class240.field3487) {
            String var47 = class52.field761.method1752(false);
            String var48 = class601.method3415(true, class437.method2589(class52.field761, false));
            class175.method1205(var47, 0, 6, var48, -1, var47);
            class240.field3487 = null;
            return true;
        } else if (class527.field7329 == class240.field3487) {
            int var49 = class52.field761.method1716(-31245);
            int var50 = class52.field761.method1750(true);
            int var51 = class52.field761.method1720(-17391);
            if (class481.method2771(var50, false)) {
                class318.method1954(23454, var51, var49);
            }
            class240.field3487 = null;
            return true;
        } else if (class644.field9378 == class240.field3487) {
            int var52 = class52.field761.method1745(32132);
            int var53 = class52.field761.method1738(255);
            boolean var54 = (var53 & 0x1) == 1;
            while (class52.field761.field3913 < class541.field7525) {
                int var55 = class52.field761.method1749((byte) -91);
                int var56 = class52.field761.method1745(32132);
                int var57 = 0;
                if (var56 != 0) {
                    var57 = class52.field761.method1738(255);
                    if (var57 == 255) {
                        var57 = class52.field761.method1748(-124);
                    }
                }
                class89.method797(0, var57, var56 - 1, var55, var52, var54);
            }
            class93.field1639[class424.method2540(31, class45.field634++)] = var52;
            class240.field3487 = null;
            return true;
        } else if (class240.field3487 == class167.field2447) {
            int var58 = class52.field761.method1750(true);
            int var59 = class52.field761.method1712(-78);
            int var60 = class52.field761.method1745(arg0 ^ 0xFFFF827B);
            int var61 = class52.field761.method1745(32132);
            int var62 = class52.field761.method1720(arg0 ^ 0x43EE);
            if (class481.method2771(var62, false)) {
                class469.method2722(var60, var59, arg0 + 5, 7, var61 << 16 | var58);
            }
            class240.field3487 = null;
            return true;
        } else if (class79.field1431 == class240.field3487) {
            class162.method1134(27512, true);
            class240.field3487 = null;
            return true;
        } else if (class240.field3487 == class230.field3406) {
            class424.method2543(class54.field777, -16);
            class240.field3487 = null;
            return true;
        } else if (class624.field8806 == class240.field3487) {
            int var63 = class52.field761.method1750(true);
            int var64 = class52.field761.method1748(-78);
            int var65 = class52.field761.method1720(-17391);
            if (var65 == 65535) {
                var65 = -1;
            }
            int var66 = class52.field761.method1720(-17391);
            int var67 = class52.field761.method1750(true);
            if (var67 == 65535) {
                var67 = -1;
            }
            if (class481.method2771(var66, false)) {
                for (int var68 = var65; var68 <= var67; var68++) {
                    long var69 = ((long) var64 << 32) + (long) var68;
                    class546 var71 = (class546) class170.field2472.method740(0, var69);
                    class546 var72;
                    if (var71 != null) {
                        var72 = new class546(var71.field7595, var63);
                        var71.method911(-52);
                    } else if (var68 == -1) {
                        var72 = new class546(class495.method2822((byte) -110, var64).field7760.field7595, var63);
                    } else {
                        var72 = new class546(0, var63);
                    }
                    class170.field2472.method737(var69, (byte) 92, var72);
                }
            }
            class240.field3487 = null;
            return true;
        } else if (class240.field3487 == class215.field3247) {
            int var73 = class52.field761.method1723((byte) 119);
            int var74 = class52.field761.method1750(true);
            int var75 = class52.field761.method1716(-31245);
            if (class481.method2771(var73, false)) {
                class444.method2621(96, var75, var74);
            }
            class240.field3487 = null;
            return true;
        } else if (class50.field749 == class240.field3487) {
            class424.method2543(class72.field1356, arg0 - 124);
            class240.field3487 = null;
            return true;
        } else if (class240.field3487 == class234.field3445) {
            if (class24.method238(-122, class64.field893)) {
                class189.field2717 = (int) ((float) class52.field761.method1745(32132) * 2.5F);
            } else {
                class189.field2717 = class52.field761.method1745(32132) * 30;
            }
            class410.field6095 = class498.field6986;
            class240.field3487 = null;
            return true;
        } else if (class88.field1593 == class240.field3487) {
            int var76 = class52.field761.method1745(32132);
            int var77 = class52.field761.method1738(255);
            int var78 = class52.field761.method1738(255);
            int var79 = class52.field761.method1745(arg0 ^ 0xFFFF827B) << 0;
            int var80 = class52.field761.method1738(arg0 + 256);
            int var81 = class52.field761.method1738(255);
            if (class481.method2771(var76, false)) {
                class365.method2206(352, var78, var80, var81, var77, var79);
            }
            class240.field3487 = null;
            return true;
        } else if (class464.field6702 == class240.field3487) {
            boolean var82 = class52.field761.method1738(255) == 1;
            byte[] var83 = new byte[class541.field7525 - 1];
            class52.field761.method1695(var83, (byte) -52, class541.field7525 - 1, 0);
            class578.method3306(var83, var82, (byte) 112);
            class240.field3487 = null;
            return true;
        } else if (class498.field6974 == class240.field3487) {
            class280.field4093 = class52.field761.method1730(13436);
            class410.field6095 = class498.field6986;
            class240.field3487 = null;
            return true;
        } else if (class325.field4682 == class240.field3487) {
            class216.field3266 = class52.field761.method1736(arg0 + 16895);
            class149.field2261 = class52.field761.method1738(arg0 ^ 0xFFFFFF00) == 1;
            class240.field3487 = null;
            return true;
        } else if (class328.field4734 == class240.field3487) {
            class424.method2543(class299.field4325, -113);
            class240.field3487 = null;
            return true;
        } else if (class278.field4072 == class240.field3487) {
            int var84 = class52.field761.method1745(32132);
            int var85 = class52.field761.method1738(255);
            boolean var86 = (var85 & 0x1) == 1;
            class424.method2541(var86, false, var84);
            int var87 = class52.field761.method1745(32132);
            for (int var88 = 0; var88 < var87; var88++) {
                int var89 = class52.field761.method1723((byte) 101);
                int var90 = class52.field761.method1738(arg0 ^ 0xFFFFFF00);
                if (var90 == 255) {
                    var90 = class52.field761.method1740((byte) -100);
                }
                class89.method797(~arg0, var90, var89 - 1, var88, var84, var86);
            }
            class93.field1639[class424.method2540(31, class45.field634++)] = var84;
            class240.field3487 = null;
            return true;
        } else if (class525.field7293 == class240.field3487) {
            class424.method2543(class574.field8171, 54);
            class240.field3487 = null;
            return true;
        } else if (class240.field3487 == class204.field2883) {
            class511.field7081 = class52.field761.method1738(arg0 + 256);
            for (int var91 = 0; var91 < class511.field7081; var91++) {
                class290.field4198[var91] = class52.field761.method1752(false);
                class97.field1699[var91] = class52.field761.method1752(false);
                if (class97.field1699[var91].equals("")) {
                    class97.field1699[var91] = class290.field4198[var91];
                }
                class293.field4223[var91] = class52.field761.method1752(false);
                class240.field3494[var91] = class52.field761.method1752(false);
                if (class240.field3494[var91].equals("")) {
                    class240.field3494[var91] = class293.field4223[var91];
                }
                class536.field7484[var91] = false;
            }
            class240.field3487 = null;
            class137.field2179 = class498.field6986;
            return true;
        } else if (class242.field3516 == class240.field3487) {
            while (class52.field761.field3913 < class541.field7525) {
                boolean var102 = class52.field761.method1738(255) == 1;
                String var103 = class52.field761.method1752(false);
                String var104 = class52.field761.method1752(false);
                int var105 = class52.field761.method1745(32132);
                int var106 = class52.field761.method1738(255);
                String var107 = "";
                boolean var108 = false;
                if (var105 > 0) {
                    var107 = class52.field761.method1752(false);
                    var108 = class52.field761.method1738(255) == 1;
                }
                for (int var109 = 0; var109 < class404.field6020; var109++) {
                    if (var102) {
                        if (var104.equals(class534.field7454[var109])) {
                            class534.field7454[var109] = var103;
                            var103 = null;
                            class301.field4344[var109] = var104;
                            break;
                        }
                    } else if (var103.equals(class534.field7454[var109])) {
                        if (class41.field572[var109] != var105) {
                            boolean var110 = true;
                            for (class81 var111 = (class81) class8.field76.method944(-126); var111 != null; var111 = (class81) class8.field76.method947((byte) 125)) {
                                if (var111.field1442.equals(var103)) {
                                    if (var105 != 0 && var111.field1439 == 0) {
                                        var111.method2753(0);
                                        var110 = false;
                                    } else if (var105 == 0 && var111.field1439 != 0) {
                                        var111.method2753(arg0 + 1);
                                        var110 = false;
                                    }
                                }
                            }
                            if (var110) {
                                class8.field76.method952((byte) 33, new class81(var103, var105));
                            }
                            class41.field572[var109] = var105;
                        }
                        class301.field4344[var109] = var104;
                        class289.field4189[var109] = var107;
                        class233.field3424[var109] = var106;
                        var103 = null;
                        class289.field4193[var109] = var108;
                        break;
                    }
                }
                if (var103 != null && class404.field6020 < 200) {
                    class534.field7454[class404.field6020] = var103;
                    class301.field4344[class404.field6020] = var104;
                    class41.field572[class404.field6020] = var105;
                    class289.field4189[class404.field6020] = var107;
                    class233.field3424[class404.field6020] = var106;
                    class289.field4193[class404.field6020] = var108;
                    class404.field6020++;
                }
            }
            class492.field6912 = 2;
            class137.field2179 = class498.field6986;
            boolean var92 = false;
            int var93 = class404.field6020;
            while (var93 > 0) {
                boolean var94 = true;
                var93--;
                for (int var95 = 0; var95 < var93; var95++) {
                    if (class41.field572[var95] != class352.field5017.field3409 && class41.field572[var95 + 1] == class352.field5017.field3409 || class41.field572[var95] == 0 && class41.field572[var95 + 1] != 0) {
                        int var96 = class41.field572[var95];
                        class41.field572[var95] = class41.field572[var95 + 1];
                        class41.field572[var95 + 1] = var96;
                        String var97 = class289.field4189[var95];
                        class289.field4189[var95] = class289.field4189[var95 + 1];
                        class289.field4189[var95 + 1] = var97;
                        String var98 = class534.field7454[var95];
                        class534.field7454[var95] = class534.field7454[var95 + 1];
                        class534.field7454[var95 + 1] = var98;
                        String var99 = class301.field4344[var95];
                        class301.field4344[var95] = class301.field4344[var95 + 1];
                        class301.field4344[var95 + 1] = var99;
                        int var100 = class233.field3424[var95];
                        class233.field3424[var95] = class233.field3424[var95 + 1];
                        class233.field3424[var95 + 1] = var100;
                        boolean var101 = class289.field4193[var95];
                        class289.field4193[var95] = class289.field4193[var95 + 1];
                        var94 = false;
                        class289.field4193[var95 + 1] = var101;
                    }
                }
                if (var94) {
                    break;
                }
            }
            class240.field3487 = null;
            return true;
        } else if (class240.field3487 == class158.field2369) {
            boolean var112 = class52.field761.method1738(255) == 1;
            String var113 = class52.field761.method1752(false);
            String var114 = var113;
            if (var112) {
                var114 = class52.field761.method1752(false);
            }
            long var115 = class52.field761.method1690(false);
            long var117 = (long) class52.field761.method1745(32132);
            long var119 = (long) class52.field761.method1700((byte) 44);
            int var121 = class52.field761.method1738(255);
            int var122 = class52.field761.method1745(32132);
            long var123 = (var117 << 32) + var119;
            boolean var125 = false;
            int var126 = 0;
            while (true) {
                if (var126 >= 100) {
                    if (var121 <= 1 && class331.method2050(true, var114)) {
                        var125 = true;
                    }
                    break;
                }
                if (class600.field8518[var126] == var123) {
                    var125 = true;
                    break;
                }
                var126++;
            }
            if (!var125 && class341.field4914 == 0) {
                class600.field8518[class6.field63] = var123;
                class6.field63 = (class6.field63 + 1) % 100;
                String var127 = class377.field5545.method2475(arg0 - 11742, var122).method2223((byte) -119, class52.field761);
                if (var121 == 2) {
                    class150.method1076(var127, arg0 + 100, 0, class186.method1249(-115, var115), "<img=1>" + var113, var122, "<img=1>" + var114, 20);
                } else if (var121 == 1) {
                    class150.method1076(var127, 99, 0, class186.method1249(-122, var115), "<img=0>" + var113, var122, "<img=0>" + var114, 20);
                } else {
                    class150.method1076(var127, 99, 0, class186.method1249(-128, var115), var113, var122, var114, 20);
                }
            }
            class240.field3487 = null;
            return true;
        } else if (class82.field1454 == class240.field3487) {
            boolean var128 = class52.field761.method1738(255) == 1;
            String var129 = class52.field761.method1752(false);
            String var130 = var129;
            if (var128) {
                var130 = class52.field761.method1752(false);
            }
            long var131 = class52.field761.method1690(false);
            long var133 = (long) class52.field761.method1745(arg0 ^ 0xFFFF827B);
            long var135 = (long) class52.field761.method1700((byte) 44);
            int var137 = class52.field761.method1738(255);
            long var138 = (var133 << 32) + var135;
            boolean var140 = false;
            int var141 = 0;
            while (true) {
                if (var141 >= 100) {
                    if (var137 <= 1) {
                        if (!(!class149.field2261 || class118.field1910) || class361.field5140) {
                            var140 = true;
                        } else if (class331.method2050(true, var130)) {
                            var140 = true;
                        }
                    }
                    break;
                }
                if (class600.field8518[var141] == var138) {
                    var140 = true;
                    break;
                }
                var141++;
            }
            if (!var140 && class341.field4914 == 0) {
                class600.field8518[class6.field63] = var138;
                class6.field63 = (class6.field63 + 1) % 100;
                String var142 = class601.method3415(true, class437.method2589(class52.field761, false));
                if (var137 == 2 || var137 == 3) {
                    class150.method1076(var142, 99, 0, class186.method1249(-103, var131), "<img=1>" + var129, -1, "<img=1>" + var130, 9);
                } else if (var137 == 1) {
                    class150.method1076(var142, 99, 0, class186.method1249(-109, var131), "<img=0>" + var129, -1, "<img=0>" + var130, 9);
                } else {
                    class150.method1076(var142, 99, 0, class186.method1249(-112, var131), var129, -1, var130, 9);
                }
            }
            class240.field3487 = null;
            return true;
        } else if (class240.field3487 == class159.field2375) {
            int var143 = class52.field761.method1745(arg0 ^ 0xFFFF827B);
            int var144 = class52.field761.method1712(96);
            int var145 = class52.field761.method1720(arg0 ^ 0x43EE);
            int var146 = class52.field761.method1720(-17391);
            int var147 = class52.field761.method1745(32132);
            if (class481.method2771(var145, false)) {
                class501.method2848(var146, var144, var143, -22671, var147);
            }
            class240.field3487 = null;
            return true;
        } else if (class259.field3774 == class240.field3487) {
            int var148 = class52.field761.method1728(59868552);
            int var149 = class52.field761.method1748(arg0 + 118);
            int var150 = class52.field761.method1750(true);
            if (class481.method2771(var150, false)) {
                class337.method2067(var149, var148, 19136);
            }
            class240.field3487 = null;
            return true;
        } else if (class240.field3487 == class1.field3) {
            class304.field4385 = class52.field761.method1738(255);
            class410.field6095 = class498.field6986;
            class240.field3487 = null;
            return true;
        } else if (class294.field4240 == class240.field3487) {
            int var151 = class52.field761.method1745(32132);
            if (var151 == 65535) {
                var151 = -1;
            }
            int var152 = class52.field761.method1738(255);
            int var153 = class52.field761.method1745(32132);
            int var154 = class52.field761.method1738(255);
            class245.method1554(var151, 0, var153, var154, var152);
            class240.field3487 = null;
            return true;
        } else if (class602.field8568 == class240.field3487) {
            int var155 = class52.field761.method1745(32132);
            int var156 = class52.field761.method1750(true);
            String var157 = class52.field761.method1752(false);
            if (class481.method2771(var155, false)) {
                class45.method409(43, var156, var157);
            }
            class240.field3487 = null;
            return true;
        } else if (class614.field8709 == class240.field3487) {
            int var158 = class52.field761.method1750(true);
            int var159 = class52.field761.method1748(arg0 + 110);
            int var160 = class52.field761.method1723((byte) 68);
            int var161 = class52.field761.method1745(32132);
            if (class481.method2771(var158, false)) {
                class229.method1506((var160 << 16) + var161, arg0 + 14, var159);
            }
            class240.field3487 = null;
            return true;
        } else if (class240.field3487 == class167.field2434) {
            int var162 = class52.field761.method1712(arg0 - 31);
            int var163 = class52.field761.method1748(-55);
            int var164 = class52.field761.method1750(true);
            if (var164 == 65535) {
                var164 = -1;
            }
            int var165 = class52.field761.method1720(arg0 ^ 0x43EE);
            if (class481.method2771(var165, false)) {
                class207.method1331(var162, 9, var163, var164);
                class381 var166 = class611.field8684.method1621((byte) 121, var164);
                class501.method2848(var166.field5674, var163, var166.field5641, -22671, var166.field5628);
                method3384(var166.field5604, var166.field5664, 10, var163, var166.field5657);
            }
            class240.field3487 = null;
            return true;
        } else if (class646.field9386 == class240.field3487) {
            int var167 = class52.field761.method1745(arg0 ^ 0xFFFF827B);
            if (var167 == 65535) {
                var167 = -1;
            }
            int var168 = class52.field761.method1738(255);
            int var169 = class52.field761.method1745(32132);
            int var170 = class52.field761.method1738(255);
            class308.method1915(true, var167, var170, var168, var169);
            class240.field3487 = null;
            return true;
        } else if (class355.field5078 == class240.field3487) {
            class424.method2543(class599.field8509, 52);
            class240.field3487 = null;
            return true;
        } else if (class566.field8092 == class240.field3487) {
            class424.method2543(class596.field8487, -117);
            class240.field3487 = null;
            return true;
        } else if (class457.field6591 == class240.field3487) {
            boolean var171 = class52.field761.method1738(255) == 1;
            String var172 = class52.field761.method1752(false);
            String var173 = var172;
            if (var171) {
                var173 = class52.field761.method1752(false);
            }
            int var174 = class52.field761.method1738(255);
            boolean var175 = false;
            if (var174 <= 1) {
                if (!(!class149.field2261 || class118.field1910) || class361.field5140) {
                    var175 = true;
                } else if (var174 <= 1 && class331.method2050(true, var173)) {
                    var175 = true;
                }
            }
            if (!var175 && class341.field4914 == 0) {
                String var176 = class601.method3415(true, class437.method2589(class52.field761, false));
                if (var174 == 2) {
                    class150.method1076(var176, 99, 0, null, "<img=1>" + var172, -1, "<img=1>" + var173, 24);
                } else if (var174 == 1) {
                    class150.method1076(var176, 99, 0, null, "<img=0>" + var172, -1, "<img=0>" + var173, 24);
                } else {
                    class150.method1076(var176, 99, 0, null, var172, -1, var173, 24);
                }
            }
            class240.field3487 = null;
            return true;
        } else if (class240.field3487 == class206.field2904) {
            class424.method2543(class170.field2484, -2);
            class240.field3487 = null;
            return true;
        } else if (class280.field4090 == class240.field3487) {
            int var177 = class52.field761.method1745(32132);
            int var178 = class52.field761.method1738(255);
            int var179 = class52.field761.method1738(255);
            int var180 = class52.field761.method1745(32132) << 0;
            int var181 = class52.field761.method1738(arg0 ^ 0xFFFFFF00);
            int var182 = class52.field761.method1738(255);
            if (class481.method2771(var177, false)) {
                class254.method1600((byte) 104, var179, var178, var181, var182, true, var180);
            }
            class240.field3487 = null;
            return true;
        } else if (class65.field923 == class240.field3487) {
            class424.method2543(class133.field2153, 124);
            class240.field3487 = null;
            return true;
        } else if (class240.field3487 == class111.field1842) {
            int var183 = class52.field761.method1738(arg0 ^ 0xFFFFFF00);
            int var184 = class52.field761.method1750(true);
            class401.field6001.method3554(0, var183, var184);
            class240.field3487 = null;
            return true;
        } else if (class467.field6725 == class240.field3487) {
            class424.method2543(class275.field4024, 72);
            class240.field3487 = null;
            return true;
        } else if (class483.field6847 == class240.field3487) {
            int var185 = class52.field761.method1738(255);
            if (class52.field761.method1738(255) == 0) {
                class175.field2574[var185] = new class407();
            } else {
                class52.field761.field3913--;
                class175.field2574[var185] = new class407(class52.field761);
            }
            class240.field3487 = null;
            class593.field8420 = class498.field6986;
            return true;
        } else if (class488.field6874 == class240.field3487) {
            int var186 = class52.field761.method1738(255);
            int var187 = var186 >> 5;
            int var188 = var186 & 0x1F;
            if (var188 == 0) {
                class451.field6552[var187] = null;
                class240.field3487 = null;
                return true;
            }
            class371 var189 = new class371();
            var189.field5361 = var188;
            var189.field5360 = class52.field761.method1738(255);
            if (var189.field5360 >= 0 && class128.field2091.length > var189.field5360) {
                if (var189.field5361 == 1 || var189.field5361 == 10) {
                    var189.field5357 = class52.field761.method1745(32132);
                    class52.field761.field3913 += 6;
                } else if (var189.field5361 >= 2 && var189.field5361 <= 6) {
                    if (var189.field5361 == 2) {
                        var189.field5364 = 64;
                        var189.field5356 = 64;
                    }
                    if (var189.field5361 == 3) {
                        var189.field5356 = 64;
                        var189.field5364 = 0;
                    }
                    if (var189.field5361 == 4) {
                        var189.field5356 = 64;
                        var189.field5364 = 128;
                    }
                    if (var189.field5361 == 5) {
                        var189.field5364 = 64;
                        var189.field5356 = 0;
                    }
                    if (var189.field5361 == 6) {
                        var189.field5356 = 128;
                        var189.field5364 = 64;
                    }
                    var189.field5361 = 2;
                    var189.field5355 = class52.field761.method1738(255);
                    var189.field5364 += class52.field761.method1745(arg0 + 32133) - class382.field5687 << 7;
                    var189.field5356 += class52.field761.method1745(arg0 ^ 0xFFFF827B) - class597.field8500 << 7;
                    var189.field5362 = class52.field761.method1738(255) << 0;
                    var189.field5366 = class52.field761.method1745(32132);
                }
                var189.field5365 = class52.field761.method1745(32132);
                if (var189.field5365 == 65535) {
                    var189.field5365 = -1;
                }
                class451.field6552[var187] = var189;
            }
            class240.field3487 = null;
            return true;
        } else if (class410.field6092 == class240.field3487) {
            String var190 = class52.field761.method1752(false);
            boolean var191 = class52.field761.method1738(arg0 ^ 0xFFFFFF00) == 1;
            String var192;
            if (var191) {
                var192 = class52.field761.method1752(false);
            } else {
                var192 = var190;
            }
            int var193 = class52.field761.method1745(32132);
            byte var194 = class52.field761.method1714(-31536);
            boolean var195 = false;
            if (var194 == -128) {
                var195 = true;
            }
            if (var195) {
                if (class619.field8734 == 0) {
                    class240.field3487 = null;
                    return true;
                }
                boolean var196 = false;
                int var197;
                for (var197 = 0; var197 < class619.field8734 && (!class10.field115[var197].field1382.equals(var192) || class10.field115[var197].field1386 != var193); var197++) {
                }
                if (var197 < class619.field8734) {
                    while (class619.field8734 - 1 > var197) {
                        class10.field115[var197] = class10.field115[var197 + 1];
                        var197++;
                    }
                    class619.field8734--;
                    class10.field115[class619.field8734] = null;
                }
            } else {
                String var198 = class52.field761.method1752(false);
                class74 var199 = new class74();
                var199.field1385 = var190;
                var199.field1382 = var192;
                var199.field1381 = class596.method3403(var199.field1382, -74);
                var199.field1384 = var198;
                var199.field1387 = var194;
                var199.field1386 = var193;
                int var200;
                for (var200 = class619.field8734 - 1; var200 >= 0; var200--) {
                    int var201 = class10.field115[var200].field1381.compareTo(var199.field1381);
                    if (var201 == 0) {
                        class10.field115[var200].field1386 = var193;
                        class10.field115[var200].field1387 = var194;
                        class10.field115[var200].field1384 = var198;
                        if (var192.equals(class644.field9367.field5958)) {
                            class117.field1900 = var194;
                        }
                        class323.field4668 = class498.field6986;
                        class240.field3487 = null;
                        return true;
                    }
                    if (var201 < 0) {
                        break;
                    }
                }
                if (class10.field115.length <= class619.field8734) {
                    class240.field3487 = null;
                    return true;
                }
                for (int var202 = class619.field8734 - 1; var202 > var200; var202--) {
                    class10.field115[var202 + 1] = class10.field115[var202];
                }
                if (class619.field8734 == 0) {
                    class10.field115 = new class74[100];
                }
                class10.field115[var200 + 1] = var199;
                class619.field8734++;
                if (var192.equals(class644.field9367.field5958)) {
                    class117.field1900 = var194;
                }
            }
            class240.field3487 = null;
            class323.field4668 = class498.field6986;
            return true;
        } else if (class241.field3502 == class240.field3487) {
            class367.method2217(arg0 + 17760, class52.field761.method1752(false));
            class240.field3487 = null;
            return true;
        } else if (class644.field9381 == class240.field3487) {
            int var203 = class52.field761.method1723((byte) 76);
            if (var203 == 65535) {
                var203 = -1;
            }
            int var204 = class52.field761.method1701(255);
            int var205 = class52.field761.method1738(arg0 ^ 0xFFFFFF00);
            class183.method1228(-114, var205, var204, var203);
            class240.field3487 = null;
            return true;
        } else if (class440.field6421 == class240.field3487) {
            int var206 = class52.field761.method1723((byte) 110);
            if (var206 == 65535) {
                var206 = -1;
            }
            int var207 = class52.field761.method1700((byte) 44);
            int var208 = class52.field761.method1701(255);
            class439.method2596(var206, var207, false, var208);
            class240.field3487 = null;
            return true;
        } else if (class611.field8686 == class240.field3487) {
            int var209 = class52.field761.method1712(-80);
            int var210 = class52.field761.method1745(32132);
            if (class481.method2771(var210, false)) {
                class469.method2722(-1, var209, 4, 3, -1);
            }
            class240.field3487 = null;
            return true;
        } else if (class413.field6117 == class240.field3487) {
            int var211 = class52.field761.method1745(32132);
            int var212 = class52.field761.method1750(true);
            int var213 = class52.field761.method1750(true);
            if (class481.method2771(var211, false)) {
                class205.method1314(var213, 0, (byte) 102, var212);
            }
            class240.field3487 = null;
            return true;
        } else if (class432.field6309 == class240.field3487) {
            String var214 = class52.field761.method1752(false);
            int var215 = class52.field761.method1745(arg0 + 32133);
            String var216 = class377.field5545.method2475(arg0 ^ 0x2DDE, var215).method2223((byte) -119, class52.field761);
            class150.method1076(var216, 99, 0, null, var214, var215, var214, 19);
            class240.field3487 = null;
            return true;
        } else if (class299.field4329 == class240.field3487) {
            int var217 = class52.field761.method1723((byte) 121);
            int var218 = class52.field761.method1738(255);
            if (class481.method2771(var217, false)) {
                class356.field5084 = var218;
            }
            class240.field3487 = null;
            return true;
        } else if (class407.field6044 == class240.field3487) {
            int var219 = class52.field761.method1723((byte) 106);
            int var220 = class52.field761.method1723((byte) 121);
            int var221 = class52.field761.method1689(-17);
            class181 var222 = (class181) class432.field6368.method740(0, (long) var219);
            if (var222 != null) {
                class562.method3203(var222.field2623, var221, var220, 9656);
            }
            class240.field3487 = null;
            return true;
        } else if (class240.field3487 == class112.field1864) {
            int var223 = class52.field761.method1716(-31245);
            int var224 = class52.field761.method1745(32132);
            class401.field6001.method3554(0, var223, var224);
            class240.field3487 = null;
            return true;
        } else if (class600.field8516 == class240.field3487) {
            for (int var225 = 0; var225 < class39.field536.length; var225++) {
                if (class39.field536[var225] != null) {
                    class39.field536[var225].field1514 = -1;
                }
            }
            for (int var226 = 0; var226 < class313.field4570; var226++) {
                class629.field8848[var226].field2623.field1514 = -1;
            }
            class240.field3487 = null;
            return true;
        } else if (class252.field3683 == class240.field3487) {
            class240.field3487 = null;
            class492.field6912 = 1;
            class137.field2179 = class498.field6986;
            return true;
        } else if (class608.field8644 == class240.field3487) {
            int var227 = class52.field761.method1745(arg0 + 32133);
            String var228 = class52.field761.method1752(false);
            int var229 = class52.field761.method1750(true);
            if (class481.method2771(var229, false)) {
                class45.method409(arg0 + 110, var227, var228);
            }
            class240.field3487 = null;
            return true;
        } else if (class240.field3487 == class121.field1947) {
            int var230 = class52.field761.method1748(117);
            int var231 = class52.field761.method1750(true);
            int var232 = class52.field761.method1723((byte) 78);
            if (var232 == 65535) {
                var232 = -1;
            }
            int var233 = class52.field761.method1716(-31245);
            int var234 = class52.field761.method1723((byte) 84);
            if (var234 == 65535) {
                var234 = -1;
            }
            if (class481.method2771(var231, false)) {
                for (int var235 = var234; var235 <= var232; var235++) {
                    long var236 = ((long) var230 << 32) + ((long) var235);
                    class546 var238 = (class546) class170.field2472.method740(0, var236);
                    class546 var239;
                    if (var238 != null) {
                        var239 = new class546(var233, var238.field7587);
                        var238.method911(arg0 - 51);
                    } else if (var235 == -1) {
                        var239 = new class546(var233, class495.method2822((byte) -111, var230).field7760.field7587);
                    } else {
                        var239 = new class546(var233, -1);
                    }
                    class170.field2472.method737(var236, (byte) 92, var239);
                }
            }
            class240.field3487 = null;
            return true;
        } else if (class382.field5683 == class240.field3487) {
            class192.field2738 = class52.field761.method1714(-31536) << 3;
            class526.field7322 = class52.field761.method1701(255);
            class605.field8618 = class52.field761.method1706((byte) 104) << 3;
            while (class52.field761.field3913 < class541.field7525) {
                class214 var240 = class515.method2888(arg0 - 16313)[class52.field761.method1738(255)];
                class424.method2543(var240, 24);
            }
            class240.field3487 = null;
            return true;
        } else if (class586.field8356 == class240.field3487) {
            int var241 = class52.field761.method1745(32132);
            String var242 = class52.field761.method1752(false);
            Object[] var243 = new Object[var242.length() + 1];
            for (int var244 = var242.length() - 1; var244 >= 0; var244--) {
                if (var242.charAt(var244) == 's') {
                    var243[var244 + 1] = class52.field761.method1752(false);
                } else {
                    var243[var244 + 1] = Integer.valueOf(class52.field761.method1748(116));
                }
            }
            var243[0] = Integer.valueOf(class52.field761.method1748(105));
            if (class481.method2771(var241, false)) {
                class526 var245 = new class526();
                var245.field7314 = var243;
                class30.method277(var245);
            }
            class240.field3487 = null;
            return true;
        } else if (class387.field5758 == class240.field3487) {
            int var246 = class52.field761.method1712(-31);
            int var247 = class52.field761.method1750(true);
            class401.field6001.method3555(var246, var247, arg0 + 93);
            class240.field3487 = null;
            return true;
        } else if (class240.field3487 == class167.field2445) {
            int var248 = class52.field761.method1720(-17391);
            if (var248 == 65535) {
                var248 = -1;
            }
            int var249 = class52.field761.method1701(255);
            int var250 = var249 >> 2;
            int var251 = var249 & 0x3;
            int var252 = class226.field3372[var250];
            int var253 = class52.field761.method1716(-31245);
            int var254 = var253 >> 28 & 0x3;
            int var255 = (var253 & 0xFFFE76C) >> 14;
            int var256 = var255 - class382.field5687;
            int var257 = var253 & 0x3FFF;
            int var258 = var257 - class597.field8500;
            class127.method999(var250, var248, var254, var256, var251, var252, var258, 112);
            class240.field3487 = null;
            return true;
        } else if (class240.field3487 == class155.field2339) {
            int var259 = class52.field761.method1750(true);
            if (var259 == 65535) {
                var259 = -1;
            }
            int var260 = class52.field761.method1748(-119);
            int var261 = class52.field761.method1745(arg0 + 32133);
            if (class481.method2771(var261, false)) {
                class469.method2722(-1, var260, arg0 + 5, 1, var259);
            }
            class240.field3487 = null;
            return true;
        } else if (class444.field6484 == class240.field3487) {
            int var262 = class52.field761.method1745(32132);
            int var263 = class52.field761.method1748(92);
            if (class481.method2771(var262, false)) {
                class553 var264 = (class553) class639.field9274.method740(~arg0, (long) var263);
                if (var264 != null) {
                    class61.method489(-27920, true, false, var264);
                }
                if (class559.field7930 != null) {
                    class412.method2497(class559.field7930, 94);
                    class559.field7930 = null;
                }
            }
            class240.field3487 = null;
            return true;
        } else if (class240.field3487 == class181.field2618) {
            int var265 = class52.field761.method1723((byte) 84);
            int var266 = class52.field761.method1740((byte) -111);
            int var267 = class52.field761.method1750(true);
            int var268 = class52.field761.method1740((byte) -105);
            if (class481.method2771(var267, false)) {
                class469.method2722(var268, var266, arg0 ^ 0xFFFFFFFB, 5, var265);
            }
            class240.field3487 = null;
            return true;
        } else if (class240.field3487 == class163.field2422) {
            class323.field4668 = class498.field6986;
            if (class541.field7525 == 0) {
                class240.field3487 = null;
                class619.field8734 = 0;
                class295.field4258 = null;
                class102.field1740 = null;
                class10.field115 = null;
                return true;
            }
            class295.field4258 = class52.field761.method1752(false);
            boolean var269 = class52.field761.method1738(arg0 + 256) == 1;
            if (var269) {
                class52.field761.method1752(false);
            }
            long var270 = class52.field761.method1690(false);
            class102.field1740 = class555.method3108(var270, 0);
            class133.field2151 = class52.field761.method1714(-31536);
            int var272 = class52.field761.method1738(255);
            if (var272 == 255) {
                class240.field3487 = null;
                return true;
            }
            class619.field8734 = var272;
            class74[] var273 = new class74[100];
            for (int var274 = 0; var274 < class619.field8734; var274++) {
                var273[var274] = new class74();
                var273[var274].field1385 = class52.field761.method1752(false);
                boolean var280 = class52.field761.method1738(255) == 1;
                if (var280) {
                    var273[var274].field1382 = class52.field761.method1752(false);
                } else {
                    var273[var274].field1382 = var273[var274].field1385;
                }
                var273[var274].field1381 = class596.method3403(var273[var274].field1382, -109);
                var273[var274].field1386 = class52.field761.method1745(32132);
                var273[var274].field1387 = class52.field761.method1714(-31536);
                var273[var274].field1384 = class52.field761.method1752(false);
                if (var273[var274].field1382.equals(class644.field9367.field5958)) {
                    class117.field1900 = var273[var274].field1387;
                }
            }
            boolean var275 = false;
            int var276 = class619.field8734;
            while (var276 > 0) {
                boolean var277 = true;
                var276--;
                for (int var278 = 0; var278 < var276; var278++) {
                    if (var273[var278].field1381.compareTo(var273[var278 + 1].field1381) > 0) {
                        class74 var279 = var273[var278];
                        var273[var278] = var273[var278 + 1];
                        var277 = false;
                        var273[var278 + 1] = var279;
                    }
                }
                if (var277) {
                    break;
                }
            }
            class10.field115 = var273;
            class240.field3487 = null;
            return true;
        } else if (class646.field9384 == class240.field3487) {
            int var281 = class52.field761.method1720(-17391);
            int var282 = class52.field761.method1689(arg0 - 125);
            int var283 = class52.field761.method1745(32132);
            int var284 = class52.field761.method1716(-31245);
            int var285 = class52.field761.method1723((byte) 90);
            boolean var286 = (var282 & 0x80) != 0;
            if ((var284 >> 30) != 0) {
                int var318 = var284 >> 28 & 0x3;
                int var319 = (var284 >> 14 & 0x3FFF) - class382.field5687;
                int var320 = (var284 & 0x3FFF) - class597.field8500;
                if (var319 >= 0 && var320 >= 0 && var319 < class146.field2247 && var320 < class66.field990) {
                    int var321 = var319 * 128 + 64;
                    int var322 = var320 * 128 + 64;
                    int var323 = var318;
                    if (var318 < 3 && class402.method2455(var320, var319, 31705)) {
                        var323 = var318 + 1;
                    }
                    class562 var324 = new class562(var285, 0, class310.field4553, var318, var323, var321, class355.method2160(var321, var322, var318, (byte) 103) - var283, var322, var319, var319, var320, var320, var282);
                    class341.field4897.method414(new class276(var324), (byte) 88);
                }
            } else if ((var284 >> 29) != 0) {
                int var302 = var284 & 0xFFFF;
                class181 var303 = (class181) class432.field6368.method740(arg0 + 1, (long) var302);
                if (var303 != null) {
                    if (var285 == 65535) {
                        var285 = -1;
                    }
                    class170 var304 = var303.field2623;
                    boolean var305 = true;
                    int var306 = var286 ? var304.field1520 : var304.field1487;
                    if (var285 != -1 && var306 != -1) {
                        if (var285 == var306) {
                            class347 var311 = class522.field7247.method2489(30, var285);
                            if (var311.field4975 && var311.field4961 != -1) {
                                class439 var312 = class49.field739.method2297((byte) 127, var311.field4961);
                                int var313 = var312.field6396;
                                if (var313 == 0 || var313 == 2) {
                                    var305 = false;
                                } else if (var313 == 1) {
                                    var305 = true;
                                }
                            }
                        } else {
                            class347 var307 = class522.field7247.method2489(30, var285);
                            class347 var308 = class522.field7247.method2489(30, var306);
                            if (var307.field4961 != -1 && var308.field4961 != -1) {
                                class439 var309 = class49.field739.method2297((byte) 114, var307.field4961);
                                class439 var310 = class49.field739.method2297((byte) 119, var308.field4961);
                                if (var310.field6408 > var309.field6408) {
                                    var305 = false;
                                }
                            }
                        }
                    }
                    if (var305) {
                        if (var286) {
                            var304.field1513 = 0;
                            var304.field1535 = 0;
                            var304.field1534 = var282 & 0x7;
                            var304.field1561 = 1;
                            var304.field1508 = var283;
                            var304.field1510 = class310.field4553 + var281;
                            var304.field1520 = var285;
                            if (class310.field4553 < var304.field1510) {
                                var304.field1535 = -1;
                            }
                            if (var304.field1520 != -1 && class310.field4553 == var304.field1510) {
                                int var316 = class522.field7247.method2489(30, var304.field1520).field4961;
                                if (var316 != -1) {
                                    class439 var317 = class49.field739.method2297((byte) 118, var316);
                                    if (var317 != null && var317.field6416 != null) {
                                        class402.method2456(false, var304.field5109, 0, var317, (byte) -23, var304.field5108, var304.field5116);
                                    }
                                }
                            }
                        } else {
                            var304.field1500 = var283;
                            var304.field1481 = class310.field4553 + var281;
                            var304.field1503 = var282 & 0x7;
                            var304.field1533 = 1;
                            var304.field1487 = var285;
                            var304.field1494 = 0;
                            var304.field1553 = 0;
                            if (var304.field1481 > class310.field4553) {
                                var304.field1553 = -1;
                            }
                            if (var304.field1487 != -1 && class310.field4553 == var304.field1481) {
                                int var314 = class522.field7247.method2489(arg0 + 31, var304.field1487).field4961;
                                if (var314 != -1) {
                                    class439 var315 = class49.field739.method2297((byte) 126, var314);
                                    if (var315 != null && var315.field6416 != null) {
                                        class402.method2456(false, var304.field5109, 0, var315, (byte) -23, var304.field5108, var304.field5116);
                                    }
                                }
                            }
                        }
                    }
                }
            } else if (var284 >> 28 != 0) {
                int var287 = var284 & 0xFFFF;
                class400 var288;
                if (class323.field4670 == var287) {
                    var288 = class644.field9367;
                } else {
                    var288 = class39.field536[var287];
                }
                if (var288 != null) {
                    if (var285 == 65535) {
                        var285 = -1;
                    }
                    boolean var289 = true;
                    int var290 = var286 ? var288.field1520 : var288.field1487;
                    if (var285 != -1 && var290 != -1) {
                        if (var285 == var290) {
                            class347 var291 = class522.field7247.method2489(30, var285);
                            if (var291.field4975 && var291.field4961 != -1) {
                                class439 var292 = class49.field739.method2297((byte) 127, var291.field4961);
                                int var293 = var292.field6396;
                                if (var293 == 0 || var293 == 2) {
                                    var289 = false;
                                } else if (var293 == 1) {
                                    var289 = true;
                                }
                            }
                        } else {
                            class347 var294 = class522.field7247.method2489(30, var285);
                            class347 var295 = class522.field7247.method2489(30, var290);
                            if (var294.field4961 != -1 && var295.field4961 != -1) {
                                class439 var296 = class49.field739.method2297((byte) 125, var294.field4961);
                                class439 var297 = class49.field739.method2297((byte) 122, var295.field4961);
                                if (var296.field6408 < var297.field6408) {
                                    var289 = false;
                                }
                            }
                        }
                    }
                    if (var289) {
                        if (var286) {
                            var288.field1510 = class310.field4553 + var281;
                            var288.field1561 = 1;
                            var288.field1508 = var283;
                            var288.field1534 = var282 & 0x7;
                            var288.field1513 = 0;
                            var288.field1520 = var285;
                            var288.field1535 = 0;
                            if (var288.field1520 == 65535) {
                                var288.field1520 = -1;
                            }
                            if (class310.field4553 < var288.field1510) {
                                var288.field1535 = -1;
                            }
                            if (var288.field1520 != -1 && class310.field4553 == var288.field1510) {
                                int var298 = class522.field7247.method2489(arg0 + 31, var288.field1520).field4961;
                                if (var298 != -1) {
                                    class439 var299 = class49.field739.method2297((byte) 121, var298);
                                    if (var299 != null && var299.field6416 != null) {
                                        class402.method2456(class644.field9367 == var288, var288.field5109, 0, var299, (byte) -23, var288.field5108, var288.field5116);
                                    }
                                }
                            }
                        } else {
                            var288.field1500 = var283;
                            var288.field1553 = 0;
                            var288.field1487 = var285;
                            var288.field1494 = 0;
                            var288.field1481 = class310.field4553 + var281;
                            var288.field1533 = 1;
                            var288.field1503 = var282 & 0x7;
                            if (var288.field1481 > class310.field4553) {
                                var288.field1553 = -1;
                            }
                            if (var288.field1487 == 65535) {
                                var288.field1487 = -1;
                            }
                            if (var288.field1487 != -1 && class310.field4553 == var288.field1481) {
                                int var300 = class522.field7247.method2489(30, var288.field1487).field4961;
                                if (var300 != -1) {
                                    class439 var301 = class49.field739.method2297((byte) 127, var300);
                                    if (var301 != null && var301.field6416 != null) {
                                        class402.method2456(class644.field9367 == var288, var288.field5109, 0, var301, (byte) -23, var288.field5108, var288.field5116);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            class240.field3487 = null;
            return true;
        } else if (class336.field4805 == class240.field3487) {
            class136.field2176 = class52.field761.method1689(-33);
            class390.field5815 = class52.field761.method1701(255);
            class240.field3487 = null;
            return true;
        } else if (class467.field6739 == class240.field3487) {
            class542.field7543 = class36.method317(class52.field761.method1738(arg0 ^ 0xFFFFFF00), (byte) 117);
            class240.field3487 = null;
            return true;
        } else if (class240.field3487 == class10.field112) {
            class562.method3208(class270.field3976, class52.field761, (byte) -115, class541.field7525);
            class240.field3487 = null;
            return true;
        } else if (class522.field7249 == class240.field3487) {
            int var325 = class52.field761.method1720(-17391);
            if (var325 == 65535) {
                var325 = -1;
            }
            int var326 = class52.field761.method1748(82);
            int var327 = class52.field761.method1745(32132);
            if (class481.method2771(var327, false)) {
                class469.method2722(-1, var326, 4, 2, var325);
            }
            class240.field3487 = null;
            return true;
        } else if (class240.field3487 == class230.field3404) {
            int var328 = class52.field761.method1738(255);
            boolean var329 = (var328 & 0x1) == 1;
            String var330 = class52.field761.method1752(false);
            String var331 = class52.field761.method1752(false);
            if (var331.equals("")) {
                var331 = var330;
            }
            String var332 = class52.field761.method1752(false);
            String var333 = class52.field761.method1752(false);
            if (var333.equals("")) {
                var333 = var332;
            }
            if (var329) {
                for (int var334 = 0; var334 < class511.field7081; var334++) {
                    if (class97.field1699[var334].equals(var333)) {
                        class290.field4198[var334] = var330;
                        class97.field1699[var334] = var331;
                        class293.field4223[var334] = var332;
                        class240.field3494[var334] = var333;
                        break;
                    }
                }
            } else {
                class290.field4198[class511.field7081] = var330;
                class97.field1699[class511.field7081] = var331;
                class293.field4223[class511.field7081] = var332;
                class240.field3494[class511.field7081] = var333;
                class536.field7484[class511.field7081] = class424.method2540(2, var328) == 2;
                class511.field7081++;
            }
            class137.field2179 = class498.field6986;
            class240.field3487 = null;
            return true;
        } else if (class597.field8495 == class240.field3487) {
            class424.method2543(class401.field5994, -101);
            class240.field3487 = null;
            return true;
        } else if (class240.field3487 == class227.field3388) {
            int var335 = class52.field761.method1745(arg0 ^ 0xFFFF827B);
            byte var336 = class52.field761.method1706((byte) 118);
            int var337 = class52.field761.method1723((byte) 84);
            if (class481.method2771(var335, false)) {
                class318.method1954(23454, var337, var336);
            }
            class240.field3487 = null;
            return true;
        } else if (class528.field7351 == class240.field3487) {
            int var338 = class52.field761.method1716(-31245);
            int var339 = class52.field761.method1745(32132);
            int var340 = class52.field761.method1740((byte) -112);
            if (class481.method2771(var339, false)) {
                class553 var341 = (class553) class639.field9274.method740(0, (long) var340);
                class553 var342 = (class553) class639.field9274.method740(0, (long) var338);
                if (var342 != null) {
                    class61.method489(-27920, var341 == null || var341.field7827 != var342.field7827, false, var342);
                }
                if (var341 != null) {
                    var341.method911(-52);
                    class639.field9274.method737((long) var338, (byte) 92, var341);
                }
                class549 var343 = class495.method2822((byte) -115, var340);
                if (var343 != null) {
                    class412.method2497(var343, 81);
                }
                class549 var344 = class495.method2822((byte) -105, var338);
                if (var344 != null) {
                    class412.method2497(var344, 113);
                    class633.method3657(var344, true, (byte) 63);
                }
                if (class609.field8659 != -1) {
                    class293.method1845(class609.field8659, 1, 0);
                }
            }
            class240.field3487 = null;
            return true;
        } else if (class54.field775 == class240.field3487) {
            int var345 = class52.field761.method1723((byte) 50);
            if (var345 == 65535) {
                var345 = -1;
            }
            int var346 = class52.field761.method1748(106);
            int var347 = class52.field761.method1750(true);
            if (class481.method2771(var347, false)) {
                class27.method247(var346, var345, (byte) 95);
            }
            class240.field3487 = null;
            return true;
        } else if (class92.field1636 == class240.field3487) {
            if (class609.field8659 != -1) {
                class293.method1845(class609.field8659, 0, 0);
            }
            class240.field3487 = null;
            return true;
        } else if (class389.field5809 == class240.field3487) {
            boolean var348 = class52.field761.method1738(arg0 + 256) == 1;
            String var349 = class52.field761.method1752(false);
            String var350 = var349;
            if (var348) {
                var350 = class52.field761.method1752(false);
            }
            long var351 = (long) class52.field761.method1745(32132);
            long var353 = (long) class52.field761.method1700((byte) 44);
            int var355 = class52.field761.method1738(255);
            long var356 = (var351 << 32) + var353;
            boolean var358 = false;
            int var359 = 0;
            while (true) {
                if (var359 >= 100) {
                    if (var355 <= 1) {
                        if (!(!class149.field2261 || class118.field1910) || class361.field5140) {
                            var358 = true;
                        } else if (class331.method2050(true, var350)) {
                            var358 = true;
                        }
                    }
                    break;
                }
                if (class600.field8518[var359] == var356) {
                    var358 = true;
                    break;
                }
                var359++;
            }
            if (!var358 && class341.field4914 == 0) {
                class600.field8518[class6.field63] = var356;
                class6.field63 = (class6.field63 + 1) % 100;
                String var360 = class601.method3415(true, class437.method2589(class52.field761, false));
                if (var355 == 2) {
                    class150.method1076(var360, 99, 0, null, "<img=1>" + var349, -1, "<img=1>" + var350, 7);
                } else if (var355 == 1) {
                    class150.method1076(var360, 99, 0, null, "<img=0>" + var349, -1, "<img=0>" + var350, 7);
                } else {
                    class150.method1076(var360, 99, 0, null, var349, -1, var350, 3);
                }
            }
            class240.field3487 = null;
            return true;
        } else if (class536.field7481 == class240.field3487) {
            int var361 = class52.field761.method1723((byte) 70);
            byte var362 = class52.field761.method1714(-31536);
            class401.field6001.method3555(var362, var361, 103);
            class240.field3487 = null;
            return true;
        } else if (class240.field3487 == class219.field3294) {
            class204.method1308(class52.field761, class541.field7525, (byte) 109);
            class240.field3487 = null;
            return true;
        } else if (class338.field4856 == class240.field3487) {
            class49.method436(32);
            class240.field3487 = null;
            return false;
        } else if (class258.field3754 == class240.field3487) {
            class424.method2543(class134.field2160, 57);
            class240.field3487 = null;
            return true;
        } else if (class623.field8787 == class240.field3487) {
            class52.field761.field3913 += 28;
            if (class52.field761.method1696(arg0)) {
                class614.method3491(class52.field761.field3913 - 28, true, class52.field761);
            }
            class240.field3487 = null;
            return true;
        } else if (class264.field3842 == class240.field3487) {
            int var363 = class52.field761.method1738(255);
            int var364 = class52.field761.method1720(arg0 - 17390);
            boolean var365 = (var363 & 0x1) == 1;
            class432.method2581(var364, var365, arg0 ^ 0x522A);
            class93.field1639[class424.method2540(class45.field634++, 31)] = var364;
            class240.field3487 = null;
            return true;
        } else if (class240.field3487 == class21.field303) {
            class97.method842((byte) 75);
            class240.field3487 = null;
            return true;
        } else if (class5.field46 == class240.field3487) {
            class401.field6001.method3550(false);
            class240.field3487 = null;
            class495.field6939 += 32;
            return true;
        } else if (class402.field6006 == class240.field3487) {
            int var366 = class52.field761.method1745(32132);
            int var367 = class52.field761.method1738(255);
            int var368 = class52.field761.method1738(arg0 ^ 0xFFFFFF00);
            int var369 = class52.field761.method1738(arg0 ^ 0xFFFFFF00);
            int var370 = class52.field761.method1738(255);
            int var371 = class52.field761.method1745(32132);
            if (class481.method2771(var366, false)) {
                class574.field8178[var367] = true;
                class442.field6467[var367] = var368;
                class362.field5147[var367] = var369;
                class394.field5912[var367] = var370;
                class112.field1861[var367] = var371;
            }
            class240.field3487 = null;
            return true;
        } else if (class240.field3487 == class121.field1949) {
            int var372 = class52.field761.method1689(-109);
            int var373 = class52.field761.method1750(true);
            if (var373 == 65535) {
                var373 = -1;
            }
            String var374 = class52.field761.method1752(false);
            int var375 = class52.field761.method1744(arg0 - 102);
            if (var372 >= 1 && var372 <= 8) {
                if (var374.equalsIgnoreCase("null")) {
                    var374 = null;
                }
                class69.field1303[var372 - 1] = var374;
                class170.field2486[var372 - 1] = var373;
                class480.field6824[var372 - 1] = var375 == 0;
            }
            class240.field3487 = null;
            return true;
        } else if (class361.field5135 == class240.field3487) {
            class488.field6873 = class541.field7525 > 2 ? class52.field761.method1752(false) : class148.field2255.method3220(false, class538.field7500);
            class201.field2841 = class541.field7525 > 0 ? class52.field761.method1745(32132) : -1;
            class240.field3487 = null;
            if (class201.field2841 == 65535) {
                class201.field2841 = -1;
            }
            return true;
        } else if (class534.field7459 == class240.field3487) {
            class473.field6783 = class52.field761.method1738(arg0 ^ 0xFFFFFF00);
            class240.field3487 = null;
            return true;
        } else if (class308.field4467 == class240.field3487) {
            int var376 = class52.field761.method1745(32132);
            int var377 = class52.field761.method1701(255);
            int var378 = class52.field761.method1748(110);
            int var379 = class52.field761.method1750(true);
            if (class481.method2771(var379, false)) {
                class553 var380 = (class553) class639.field9274.method740(0, (long) var378);
                if (var380 != null) {
                    class61.method489(arg0 - 27919, var380.field7827 != var376, false, var380);
                }
                class538.method3028(var377, var378, var376, false, 3791);
            }
            class240.field3487 = null;
            return true;
        } else if (class266.field3883 == class240.field3487) {
            int var381 = class52.field761.method1745(arg0 ^ 0xFFFF827B);
            int var382 = class52.field761.method1745(32132);
            int var383 = class52.field761.method1745(32132);
            int var384 = class52.field761.method1745(arg0 ^ 0xFFFF827B);
            if (class481.method2771(var381, false) && class177.field2593[var382] != null) {
                for (int var385 = var383; var385 < var384; var385++) {
                    int var386 = class52.field761.method1700((byte) 44);
                    if (var385 < class177.field2593[var382].length && class177.field2593[var382][var385] != null) {
                        class177.field2593[var382][var385].field7710 = var386;
                    }
                }
            }
            class240.field3487 = null;
            return true;
        } else if (class586.field8353 == class240.field3487) {
            class424.method2543(class49.field740, -127);
            class240.field3487 = null;
            return true;
        } else if (class590.field8385 == class240.field3487) {
            class605.field8618 = class52.field761.method1706((byte) 108) << 3;
            class192.field2738 = class52.field761.method1733(false) << 3;
            class526.field7322 = class52.field761.method1689(-54);
            for (class51 var387 = (class51) class573.field8163.method734(arg0 + 1); var387 != null; var387 = (class51) class573.field8163.method736(-1)) {
                int var389 = (int) (var387.field1798 >> 28 & 0x3L);
                int var390 = (int) (var387.field1798 & 0x3FFFL);
                int var391 = var390 - class382.field5687;
                int var392 = (int) (var387.field1798 >> 14 & 0x3FFFL);
                int var393 = var392 - class597.field8500;
                if (class526.field7322 == var389 && var391 >= class192.field2738 && class192.field2738 + 8 > var391 && class605.field8618 <= var393 && var393 < class605.field8618 + 8) {
                    var387.method911(-52);
                    if (var391 >= 0 && var393 >= 0 && class146.field2247 > var391 && class66.field990 > var393) {
                        class297.method1862(var393, var391, 4694638, class526.field7322);
                    }
                }
            }
            for (class127 var388 = (class127) class207.field2932.method427(true); var388 != null; var388 = (class127) class207.field2932.method420(false)) {
                if (var388.field2074 >= class192.field2738 && class192.field2738 + 8 > var388.field2074 && var388.field2073 >= class605.field8618 && class605.field8618 + 8 > var388.field2073 && class526.field7322 == var388.field2078) {
                    var388.field2083 = 0;
                }
            }
            class240.field3487 = null;
            return true;
        } else if (class584.field8325 == class240.field3487) {
            int var394 = class52.field761.method1689(-103);
            int var395 = class52.field761.method1740((byte) -120);
            int var396 = class52.field761.method1701(255);
            class355.field5072[var396] = var395;
            class208.field2934[var396] = var394;
            class146.field2239[var396] = 1;
            int var397 = class45.field638[var396] - 1;
            for (int var398 = 0; var398 < var397; var398++) {
                if (class424.field6201[var398] <= var395) {
                    class146.field2239[var396] = var398 + 2;
                }
            }
            class69.field1305[class424.method2540(class407.field6045++, 31)] = var396;
            class240.field3487 = null;
            return true;
        } else if (class258.field3750 == class240.field3487) {
            int var399 = class52.field761.method1723((byte) 94);
            int var400 = class52.field761.method1750(true);
            int var401 = class52.field761.method1712(-82);
            if (class481.method2771(var399, false)) {
                class308.method1914(var401, var400, 127);
            }
            class240.field3487 = null;
            return true;
        } else if (class471.field6772 == class240.field3487) {
            class424.method2543(class151.field2276, -125);
            class240.field3487 = null;
            return true;
        } else if (class240.field3487 == class23.field323) {
            class162.method1134(arg0 ^ 0xFFFF9487, false);
            class240.field3487 = null;
            return true;
        } else if (class377.field5535 == class240.field3487) {
            class271.method1759(false, 4);
            class240.field3487 = null;
            return false;
        } else if (class555.field7856 == class240.field3487) {
            String var402 = class52.field761.method1752(false);
            int var403 = class52.field761.method1748(126);
            int var404 = class52.field761.method1720(-17391);
            if (class481.method2771(var404, false)) {
                class186.method1250(var402, var403, -127);
            }
            class240.field3487 = null;
            return true;
        } else if (class388.field5794 == class240.field3487) {
            class210.method1346(-1);
            class240.field3487 = null;
            return false;
        } else if (class240.field3487 == class218.field3285) {
            class271.method1759(class633.field9208, 4);
            class240.field3487 = null;
            return false;
        } else if (class642.field9331 == class240.field3487) {
            if (class443.field6474 != null) {
                class5.method14(-1, arg0 ^ 0x3C, -1, false, class202.field2854.field7925);
            }
            byte[] var405 = new byte[class541.field7525];
            class52.field761.method1662(0, true, var405, class541.field7525);
            String var406 = class277.method1781(class541.field7525, 0, var405, -19);
            class132.method1023(class270.field3976, true, class646.field9388 == 1, var406, -6116);
            class240.field3487 = null;
            return true;
        } else if (class606.field8626 == class240.field3487) {
            class605.field8618 = class52.field761.method1733(false) << 3;
            class192.field2738 = class52.field761.method1707(true) << 3;
            class526.field7322 = class52.field761.method1701(255);
            class240.field3487 = null;
            return true;
        } else if (class240.field3487 == class223.field3352) {
            int var407 = class52.field761.method1750(true);
            int var408 = class52.field761.method1701(255);
            int var409 = class52.field761.method1723((byte) 64);
            if (class481.method2771(var407, false)) {
                if (var408 == 2) {
                    class565.method3215((byte) -76);
                }
                class609.field8659 = var409;
                class305.method1897(var409, -122);
                class185.method1240(32768, false);
                class30.method276(class609.field8659);
                for (int var410 = 0; var410 < 100; var410++) {
                    class509.field7067[var410] = true;
                }
            }
            class240.field3487 = null;
            return true;
        } else if (class240.field3487 == class2.field19) {
            class424.method2543(class368.field5229, arg0 - 126);
            class240.field3487 = null;
            return true;
        } else {
            class593.method3390("T1 - " + (class240.field3487 == null ? -1 : class240.field3487.method2914(6)) + "," + (class338.field4853 == null ? -1 : class338.field4853.method2914(6)) + "," + (class370.field5320 == null ? -1 : class370.field5320.method2914(6)) + " - " + class541.field7525, null, 0);
            class271.method1759(false, 4);
            return true;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILoh;I)Ljava/lang/String;")
    public static final String method3388(int arg0, class549 arg1, int arg2) {
        field8402++;
        if (arg2 != -30913) {
            field8417 = 114;
        }
        if (!client.method3530(arg1).method3056(arg0, 1) && arg1.field7754 == null) {
            return null;
        } else if (arg1.field7685 == null || arg0 >= arg1.field7685.length || arg1.field7685[arg0] == null || arg1.field7685[arg0].trim().length() == 0) {
            return class640.field9285 ? "Hidden-" + arg0 : null;
        } else {
            return arg1.field7685[arg0];
        }
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
    public class592(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field8410 = arg11;
        this.field8405 = (short) arg4;
        this.field8403 = arg1;
        this.field8413 = arg10;
        this.field8414 = arg0;
        this.field8412 = (byte) arg8;
        this.field8404 = arg3;
        this.field8409 = (short) arg5;
        this.field8406 = arg2;
        this.field8408 = (short) arg6;
    }
}
