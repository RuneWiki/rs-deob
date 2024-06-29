import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class260 {

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "Ljf;")
    public static class229 field4514 = class212.method1457((byte) 90, ")1");

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "Ljf;")
    public static class229 field4517 = class212.method1457((byte) 125, ")1o");

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "I")
    public static int field4516 = 0;

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "D")
    public static double field4518 = -1.0D;

    @OriginalMember(owner = "client!mm", name = "i", descriptor = "Ljf;")
    public static class229 field4521 = class212.method1457((byte) 115, " zuerst von Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!mm", name = "j", descriptor = "Ljf;")
    public static class229 field4522 = class212.method1457((byte) 114, "");

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "I")
    public static int field4513;

    @OriginalMember(owner = "client!mm", name = "g", descriptor = "I")
    public static int field4519;

    @OriginalMember(owner = "client!mm", name = "h", descriptor = "I")
    public static int field4520;

    @OriginalMember(owner = "client!mm", name = "k", descriptor = "I")
    public static int field4523;

    @OriginalMember(owner = "client!mm", name = "l", descriptor = "I")
    public static int field4524;

    @OriginalMember(owner = "client!mm", name = "m", descriptor = "[I")
    public static int[] field4525;

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "[[[B")
    public static byte[][][] field4515;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(B)V", line = 9)
    public static void method1849(byte arg0) {
        field4525 = null;
        field4521 = null;
        field4517 = null;
        field4514 = null;
        if (arg0 != 11) {
            method1851(-123);
        }
        field4522 = null;
        field4515 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(II)I", line = 24)
    public static int method1850(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V", line = 56)
    public static final void method1851(int arg0) {
        if (arg0 != 0) {
            method1855((byte) -83, -121, (class67[]) null, -53, 70, -116, -3, -24, 124, -18);
        }
        field4523++;
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class124.field2176 - 1; var2++) {
                if (class115.field2063[var2] < 1000 && class115.field2063[var2 + 1] > 1000) {
                    var1 = false;
                    class229 var3 = class143.field2498[var2];
                    class143.field2498[var2] = class143.field2498[var2 + 1];
                    class143.field2498[var2 + 1] = var3;
                    class229 var4 = class150.field2584[var2];
                    class150.field2584[var2] = class150.field2584[var2 + 1];
                    class150.field2584[var2 + 1] = var4;
                    int var5 = class229.field3952[var2];
                    class229.field3952[var2] = class229.field3952[var2 + 1];
                    class229.field3952[var2 + 1] = var5;
                    int var6 = class18.field282[var2];
                    class18.field282[var2] = class18.field282[var2 + 1];
                    class18.field282[var2 + 1] = var6;
                    short var7 = class115.field2063[var2];
                    class115.field2063[var2] = class115.field2063[var2 + 1];
                    class115.field2063[var2 + 1] = var7;
                    long var8 = class267.field4579[var2];
                    class267.field4579[var2] = class267.field4579[var2 + 1];
                    class267.field4579[var2 + 1] = var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(BLjf;)V", line = 108)
    public static final void method1852(byte arg0, class229 arg1) {
        field4519++;
        if (class200.field3500 >= 2) {
            if (arg1.method1653(class223.field3802, false)) {
                class98.method668(0);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class28.method245((byte) -75, 0, (class229) null, class142.method989(new class229[] { class91.field1668, class84.method607(81, var4), class20.field316 }, -79));
            }
            if (class108.field1900 && arg1.method1653(class72.field1380, false)) {
                System.out.println("oncard_geometry:" + class263.field4545);
                System.out.println("oncard_2d:" + class263.field4544);
                System.out.println("oncard_texture:" + class263.field4549);
            }
            if (arg1.method1653(class232.field4030, false)) {
                class323.method2179((byte) 109);
            }
            if (arg1.method1653(class127.field2273, false)) {
                class102.field1773.method1566(1);
            }
            if (arg1.method1653(class82.field1519, false)) {
                class102.field1773.method1568(true);
            }
            if (arg1.method1653(class301.field5120, false)) {
                class215.field3689.method1378((byte) -78);
                class160.field2720.method1432(20752);
                class102.field1773.method1571(-99);
            }
            if (arg1.method1653(class330.field5614, false)) {
                class205.field3568 = true;
            }
            if (arg1.method1653(class130.field2308, false)) {
                class186.method1295(25, (byte) 84);
            }
            if (arg1.method1653(class81.field1469, false)) {
                class186.field3257 = true;
            }
            if (arg1.method1653(class228.field3918, false)) {
                class186.field3257 = false;
            }
            if (arg1.method1653(class20.field307, false)) {
                class156.method1044(0, -1, false, (byte) 103, -1);
            }
            if (arg1.method1653(class165.field2837, false)) {
                class156.method1044(1, -1, false, (byte) 115, -1);
            }
            if (arg1.method1653(class105.field1823, false)) {
                class156.method1044(2, -1, false, (byte) 109, -1);
            }
            if (arg1.method1653(class261.field4534, false)) {
                class156.method1044(3, 1024, false, (byte) 109, 768);
            }
            if (arg1.method1653(class194.field3389, false)) {
                for (int var5 = 0; var5 < 4; var5++) {
                    for (int var6 = 1; var6 < 103; var6++) {
                        for (int var7 = 1; var7 < 103; var7++) {
                            class80.field1460[var5].field4331[var6][var7] = 0;
                        }
                    }
                }
            }
            if (arg1.method1654(-117, class320.field5406) && class329.field5599 != 0) {
                class221.method1527(1000, arg1.method1625(true, 6).method1629(43));
            }
            if (arg1.method1653(class157.field2688, false) && class329.field5599 == 2) {
                throw new RuntimeException();
            }
            if (arg1.method1654(-128, class168.field2883)) {
                class195.field3396 = arg1.method1625(true, 12).method1644(true).method1629(43);
                class28.method245((byte) -75, 0, (class229) null, class142.method989(new class229[] { class194.field3383, class84.method607(-123, class195.field3396) }, -70));
            }
            if (arg1.method1653(class170.field2963, false)) {
                class131.field2317 = true;
            }
        }
        class84.field1608.method1397(215, 0);
        class211.field3622++;
        int var8 = -2 % ((39 - arg0) / 50);
        class84.field1608.method140(arg1.method1626(90) - 1, (byte) 75);
        class84.field1608.method107((byte) -21, arg1.method1625(true, 2));
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(III)Lck;", line = 257)
    public static final class240 method1853(int arg0, int arg1, int arg2) {
        class125 var3 = class312.field5246[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class240 var4 = var3.field2196;
            var3.field2196 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(BLjf;Lek;)Ldj;", line = 290)
    public static final class330 method1854(byte arg0, class229 arg1, class185 arg2) {
        field4520++;
        int var3 = arg2.method1292(arg1, (byte) 74);
        if (var3 == -1) {
            return new class330(0);
        }
        int[] var4 = arg2.method1280(var3, (byte) 80);
        class330 var5 = new class330(var4.length);
        int var6 = 0;
        if (arg0 >= -7) {
            return (class330) null;
        }
        while (var5.field5616 > var6) {
            class14 var7 = new class14(arg2.method1275(var4[var6], var3, -5211));
            var5.field5618[var6] = var7.method105((byte) -83);
            var5.field5615[var6] = var7.method98(true);
            var5.field5625[var6] = (short) var7.method116(-1);
            var5.field5622[var6] = (short) var7.method116(-1);
            var5.field5621[var6] = var7.method128((byte) 4);
            var6++;
        }
        return var5;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(BI[Lnf;IIIIIII)V", line = 351)
    public static final void method1855(byte arg0, int arg1, class67[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field4524++;
        if (class108.field1900) {
            class163.method1095(arg3, arg8, arg5, arg1);
        } else {
            class114.method813(arg3, arg8, arg5, arg1);
            class227.method1591();
        }
        for (int var10 = 0; var10 < arg2.length; var10++) {
            class67 var11 = arg2[var10];
            if (var11 != null && (var11.field1211 == arg9 || arg9 == -1412584499 && class317.field5356 == var11)) {
                int var12;
                if (arg4 == -1) {
                    class305.field5167[class241.field4250] = var11.field1195 + arg7;
                    class162.field2764[class241.field4250] = var11.field1207 + arg6;
                    class124.field2178[class241.field4250] = var11.field1258;
                    class143.field2499[class241.field4250] = var11.field1295;
                    var12 = class241.field4250++;
                } else {
                    var12 = arg4;
                }
                var11.field1170 = var12;
                var11.field1201 = class199.field3475;
                if (!var11.field1249 || !client.method1827(var11)) {
                    if (var11.field1296 > 0) {
                        class290.method2022(var11, -121);
                    }
                    int var13 = var11.field1195 + arg7;
                    int var14 = var11.field1207 + arg6;
                    int var15 = var11.field1133;
                    if (class131.field2317 && (client.method1820(var11) != 0 || var11.field1267 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class317.field5356 == var11) {
                        if (arg9 != -1412584499 && !var11.field1270) {
                            class230.field3994 = arg6;
                            class98.field1743 = arg2;
                            class44.field809 = arg7;
                            continue;
                        }
                        if (class66.field1129 && class290.field4961) {
                            int var16 = class82.field1511;
                            int var17 = class287.field4914;
                            int var18 = var17 - class303.field5150;
                            if (class63.field1091 > var18) {
                                var18 = class63.field1091;
                            }
                            if (var11.field1258 + var18 > class63.field1091 - -class206.field3594.field1258) {
                                var18 = class206.field3594.field1258 + class63.field1091 - var11.field1258;
                            }
                            int var19 = var16 - class4.field34;
                            var13 = var18;
                            if (var19 < class151.field2617) {
                                var19 = class151.field2617;
                            }
                            if ((class151.field2617 + class206.field3594.field1295) < (var19 + var11.field1295)) {
                                var19 = class151.field2617 + class206.field3594.field1295 - var11.field1295;
                            }
                            var14 = var19;
                        }
                        if (!var11.field1270) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var22;
                    int var24;
                    int var25;
                    if (var11.field1267 == 2) {
                        var25 = arg1;
                        var22 = arg8;
                        var20 = arg3;
                        var24 = arg5;
                    } else {
                        var20 = var13 <= arg3 ? arg3 : var13;
                        int var21 = var11.field1295 + var14;
                        var22 = var14 <= arg8 ? arg8 : var14;
                        int var23 = var13 + var11.field1258;
                        if (var11.field1267 == 9) {
                            var21++;
                            var23++;
                        }
                        var24 = var23 < arg5 ? var23 : arg5;
                        var25 = var21 < arg1 ? var21 : arg1;
                    }
                    if (!var11.field1249 || var20 < var24 && var25 > var22) {
                        if (var11.field1296 != 0) {
                            if (var11.field1296 == 1337 || var11.field1296 == 1403 && class108.field1900) {
                                class96.field1703 = var14;
                                class10.field128 = var11;
                                class225.field3850 = var13;
                                class119.method846(-1671102361, var11.field1258, var11.field1296 == 1403, var11.field1295, var14, var13);
                                if (class108.field1900) {
                                    class163.method1095(arg3, arg8, arg5, arg1);
                                } else {
                                    class114.method813(arg3, arg8, arg5, arg1);
                                }
                                continue;
                            }
                            if (var11.field1296 == 1338) {
                                if (!var11.method495(-29165)) {
                                    continue;
                                }
                                class109.method775(var14, var13, (byte) 74, var12, var11);
                                if (class108.field1900) {
                                    class163.method1095(arg3, arg8, arg5, arg1);
                                } else {
                                    class114.method813(arg3, arg8, arg5, arg1);
                                }
                                if (class171.field2974 != 0 && class171.field2974 != 3 || class61.field1044 || var20 > class48.field875 || class25.field461 < var22 || class48.field875 >= var24 || var25 <= class25.field461) {
                                    continue;
                                }
                                int var41 = class48.field875 - var13;
                                int var42 = class25.field461 - var14;
                                int var43 = var11.field1237[var42];
                                if (var41 < var43 || var41 > (var11.field1224[var42] + var43)) {
                                    continue;
                                }
                                int var44 = var42 - var11.field1295 / 2;
                                int var45 = class229.field3939 + class213.field3653 & 0x7FF;
                                int var46 = var41 - var11.field1258 / 2;
                                int var47 = class227.field3896[var45];
                                int var48 = (class102.field1778 + 256) * var47 >> 8;
                                int var49 = class227.field3911[var45];
                                int var50 = (class102.field1778 + 256) * var49 >> 8;
                                int var51 = var44 * var48 + var46 * var50 >> 11;
                                int var52 = var44 * var50 - (var46 * var48) >> 11;
                                int var53 = class301.field5124.field1983 + var51 >> 7;
                                int var54 = class301.field5124.field2028 - var52 >> 7;
                                if (class273.field4677 && (class324.field5471 & 0x40) != 0) {
                                    class67 var55 = class189.method1305(class157.field2693, arg0 ^ 0x82F, class232.field4035);
                                    if (var55 == null) {
                                        class71.method523(-43);
                                    } else {
                                        class194.method1334(1L, var53, var54, -12158, (short) 8, class228.field3916, class299.field5090);
                                    }
                                    continue;
                                }
                                if (class98.field1739 == 1) {
                                    class194.method1334(1L, var53, var54, arg0 ^ 0xFFFFD0AD, (short) 46, class141.field2449, class331.field5638);
                                }
                                class194.method1334(1L, var53, var54, -12158, (short) 28, class144.field2516, class331.field5638);
                                continue;
                            }
                            if (var11.field1296 == 1339) {
                                if (var11.method495(-29165)) {
                                    class126.method886(var12, var13, arg0 ^ 0x2D, var14, var11);
                                    if (class108.field1900) {
                                        class163.method1095(arg3, arg8, arg5, arg1);
                                    } else {
                                        class114.method813(arg3, arg8, arg5, arg1);
                                    }
                                }
                                continue;
                            }
                            if (var11.field1296 == 1400) {
                                class175.method1184(var11.field1258, var14, var11.field1295, var13, (byte) -39);
                                class244.field4341[var12] = true;
                                class107.field1883[var12] = true;
                                if (class108.field1900) {
                                    class163.method1095(arg3, arg8, arg5, arg1);
                                } else {
                                    class114.method813(arg3, arg8, arg5, arg1);
                                }
                                continue;
                            }
                            if (var11.field1296 == 1401) {
                                class126.method889(var14, var11.field1258, var13, var11.field1295, arg0 + 25691);
                                class244.field4341[var12] = true;
                                class107.field1883[var12] = true;
                                if (class108.field1900) {
                                    class163.method1095(arg3, arg8, arg5, arg1);
                                } else {
                                    class114.method813(arg3, arg8, arg5, arg1);
                                }
                                continue;
                            }
                            if (var11.field1296 == 1402) {
                                if (!class108.field1900) {
                                    class156.method1041(arg0 - 47, var14, var13);
                                    class244.field4341[var12] = true;
                                    class107.field1883[var12] = true;
                                }
                                continue;
                            }
                            if (var11.field1296 == 1405) {
                                if (!class186.field3257) {
                                    continue;
                                }
                                int var26 = var11.field1258 + var13;
                                int var27 = var14 + 15;
                                class249.field4385.method962(class142.method989(new class229[] { class63.field1075, class84.method607(arg0 + 74, class281.field4818) }, -10), var26, var27, 16776960, -1);
                                Runtime var28 = Runtime.getRuntime();
                                int var29 = (int) ((var28.totalMemory() - var28.freeMemory()) / 1024L);
                                int var141 = var27 + 15;
                                int var30 = 16776960;
                                if (var29 > 65536) {
                                    var30 = 16711680;
                                }
                                class249.field4385.method962(class142.method989(new class229[] { class29.field504, class84.method607(95, var29), class20.field316 }, -17), var26, var141, var30, -1);
                                var27 = var141 + 15;
                                if (class108.field1900) {
                                    int var31 = 16776960;
                                    int var32 = (class263.field4545 + class263.field4544 + class263.field4549) / 1024;
                                    if (var32 > 65536) {
                                        var31 = 16711680;
                                    }
                                    class249.field4385.method962(class142.method989(new class229[] { class73.field1387, class84.method607(104, var32), class20.field316 }, arg0 ^ 0xFFFFFFAA), var26, var27, var31, -1);
                                    var27 += 15;
                                }
                                int var33 = 16776960;
                                int var34 = 0;
                                int var35 = 0;
                                int var36 = 0;
                                for (int var37 = 0; var37 < 28; var37++) {
                                    var34 += class62.field1060[var37].method890(arg0 + 71);
                                    var35 += class62.field1060[var37].method896(arg0 ^ 0xFFFFFC93);
                                    var36 += class62.field1060[var37].method895((byte) -1);
                                }
                                int var38 = var36 * 100 / var34;
                                int var39 = var35 * 10000 / var34;
                                class229 var40 = class142.method989(new class229[] { class155.field2642, class287.method2003((long) var39, 2, false, 0, true), class289.field4939, class84.method607(arg0 - 114, var38), class257.field4482 }, -87);
                                class211.field3636.method962(var40, var26, var27, var33, -1);
                                var27 += 12;
                                if (class164.field2787 > 0) {
                                    class211.field3636.method962(class142.method989(new class229[] { class193.field3350, class84.method607(-81, class164.field2785), class57.field1013, class84.method607(127, class164.field2787) }, arg0 ^ 0xFFFFFFB2), var26, var27, var33, -1);
                                }
                                var27 += 12;
                                class244.field4341[var12] = true;
                                class107.field1883[var12] = true;
                                continue;
                            }
                            if (var11.field1296 == 1406) {
                                class142.field2467 = var11;
                                class59.field1020 = var13;
                                class63.field1085 = var14;
                                continue;
                            }
                        }
                        if (!class61.field1044) {
                            if (var11.field1267 == 0 && var11.field1216 && class48.field875 >= var20 && class25.field461 >= var22 && var24 > class48.field875 && var25 > class25.field461 && !class131.field2317) {
                                class115.field2063[0] = 1003;
                                class124.field2176 = 1;
                                class150.field2584[0] = class122.field2167;
                                class143.field2498[0] = class331.field5638;
                            }
                            if (class48.field875 >= var20 && class25.field461 >= var22 && class48.field875 < var24 && var25 > class25.field461) {
                                class242.method1751(var11, class48.field875 - var13, (byte) -16, class25.field461 - var14);
                            }
                        }
                        if (var11.field1267 == 0) {
                            if (!var11.field1249 && client.method1827(var11) && class312.field5244 != var11) {
                                continue;
                            }
                            if (!var11.field1249) {
                                if (var11.field1167 > (var11.field1200 - var11.field1295)) {
                                    var11.field1167 = var11.field1200 - var11.field1295;
                                }
                                if (var11.field1167 < 0) {
                                    var11.field1167 = 0;
                                }
                            }
                            method1855((byte) 47, var25, arg2, var20, var12, var24, var14 - var11.field1167, -var11.field1297 + var13, var22, var11.field1247);
                            if (var11.field1243 != null) {
                                method1855((byte) 47, var25, var11.field1243, var20, var12, var24, var14 - var11.field1167, -var11.field1297 + var13, var22, var11.field1247);
                            }
                            class321 var56 = (class321) class151.field2618.method1890((long) var11.field1247, -94);
                            if (var56 != null) {
                                if (var56.field5434 == 0 && !class61.field1044 && var20 <= class48.field875 && class25.field461 >= var22 && var24 > class48.field875 && class25.field461 < var25 && !class131.field2317) {
                                    class115.field2063[0] = 1003;
                                    class150.field2584[0] = class122.field2167;
                                    class124.field2176 = 1;
                                    class143.field2498[0] = class331.field5638;
                                }
                                class203.method1424(var56.field5432, var12, var25, var14, var20, (byte) 119, var24, var13, var22);
                            }
                            if (class108.field1900) {
                                class163.method1095(arg3, arg8, arg5, arg1);
                            } else {
                                class114.method813(arg3, arg8, arg5, arg1);
                                class227.method1591();
                            }
                        }
                        if (class201.field3510[var12] || class195.field3396 > 1) {
                            if (var11.field1267 == 0 && !var11.field1249 && var11.field1200 > var11.field1295) {
                                class214.method1469(7708, var11.field1295, var11.field1258 + var13, var14, var11.field1200, var11.field1167);
                            }
                            if (var11.field1267 != 1) {
                                if (var11.field1267 == 2) {
                                    int var57 = 0;
                                    for (int var58 = 0; var58 < var11.field1241; var58++) {
                                        for (int var59 = 0; var59 < var11.field1176; var59++) {
                                            int var60 = (var11.field1182 + 32) * var59 + var13;
                                            int var61 = (var11.field1186 + 32) * var58 + var14;
                                            if (var57 < 20) {
                                                var60 += var11.field1250[var57];
                                                var61 += var11.field1131[var57];
                                            }
                                            if (var11.field1227[var57] > 0) {
                                                boolean var63 = false;
                                                boolean var64 = false;
                                                int var65 = var11.field1227[var57] - 1;
                                                if ((var60 + 32) > arg3 && var60 < arg5 && (var61 + 32) > arg8 && var61 < arg1 || class140.field2438 == var11 && class308.field5209 == var57) {
                                                    class35 var66;
                                                    if (class23.field415 == 1 && class110.field1934 == var57 && class156.field2669 == var11.field1247) {
                                                        var66 = class259.method1843(true, var11.field1213, var11.field1153[var57], var65, 2, 0);
                                                    } else {
                                                        var66 = class259.method1843(true, var11.field1213, var11.field1153[var57], var65, 1, 3153952);
                                                    }
                                                    if (class227.field3898) {
                                                        class244.field4341[var12] = true;
                                                    }
                                                    if (var66 == null) {
                                                        class194.method1328((byte) -105, var11);
                                                    } else if (class140.field2438 == var11 && class308.field5209 == var57) {
                                                        int var67 = class287.field4914 - class60.field1036;
                                                        if (var67 < 5 && var67 > -5) {
                                                            var67 = 0;
                                                        }
                                                        int var68 = class82.field1511 - class217.field3731;
                                                        if (var68 < 5 && var68 > -5) {
                                                            var68 = 0;
                                                        }
                                                        if (field4516 < 5) {
                                                            var68 = 0;
                                                            var67 = 0;
                                                        }
                                                        var66.method313(var60 + var67, var61 + var68, 128);
                                                        if (arg9 != -1) {
                                                            class67 var69 = arg2[arg9 & 0xFFFF];
                                                            int var70;
                                                            int var71;
                                                            if (class108.field1900) {
                                                                var70 = class163.field2771;
                                                                var71 = class163.field2770;
                                                            } else {
                                                                var70 = class114.field2054;
                                                                var71 = class114.field2049;
                                                            }
                                                            if (var61 + var68 < var71 && var69.field1167 > 0) {
                                                                int var72 = (var71 - var68 - var61) * class146.field2540 / 3;
                                                                if (var72 > (class146.field2540 * 10)) {
                                                                    var72 = class146.field2540 * 10;
                                                                }
                                                                if (var69.field1167 < var72) {
                                                                    var72 = var69.field1167;
                                                                }
                                                                class217.field3731 += var72;
                                                                var69.field1167 -= var72;
                                                                class194.method1328((byte) -100, var69);
                                                            }
                                                            if (var70 < (var61 - (-var68 - 32)) && (var69.field1200 - var69.field1295) > var69.field1167) {
                                                                int var73 = (var61 + var68 + 32 - var70) * class146.field2540 / 3;
                                                                if (var73 > (class146.field2540 * 10)) {
                                                                    var73 = class146.field2540 * 10;
                                                                }
                                                                if (var73 > (var69.field1200 - var69.field1167 - var69.field1295)) {
                                                                    var73 = var69.field1200 - var69.field1295 - var69.field1167;
                                                                }
                                                                var69.field1167 += var73;
                                                                class217.field3731 -= var73;
                                                                class194.method1328((byte) -102, var69);
                                                            }
                                                        }
                                                    } else if (class3.field19 == var11 && class183.field3168 == var57) {
                                                        var66.method313(var60, var61, 128);
                                                    } else {
                                                        var66.method314(var60, var61);
                                                    }
                                                }
                                            } else if (var11.field1253 != null && var57 < 20) {
                                                class35 var62 = var11.method505(var57, arg0 ^ 0x6740);
                                                if (var62 != null) {
                                                    var62.method314(var60, var61);
                                                } else if (class119.field2119) {
                                                    class194.method1328((byte) -67, var11);
                                                }
                                            }
                                            var57++;
                                        }
                                    }
                                } else if (var11.field1267 == 3) {
                                    int var74;
                                    if (class213.method1462(var11, 26)) {
                                        var74 = var11.field1226;
                                        if (class312.field5244 == var11 && var11.field1132 != 0) {
                                            var74 = var11.field1132;
                                        }
                                    } else {
                                        var74 = var11.field1292;
                                        if (class312.field5244 == var11 && var11.field1289 != 0) {
                                            var74 = var11.field1289;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var11.field1184) {
                                            if (class108.field1900) {
                                                class163.method1102(var13, var14, var11.field1258, var11.field1295, var74);
                                            } else {
                                                class114.method803(var13, var14, var11.field1258, var11.field1295, var74);
                                            }
                                        } else if (class108.field1900) {
                                            class163.method1098(var13, var14, var11.field1258, var11.field1295, var74);
                                        } else {
                                            class114.method805(var13, var14, var11.field1258, var11.field1295, var74);
                                        }
                                    } else if (var11.field1184) {
                                        if (class108.field1900) {
                                            class163.method1093(var13, var14, var11.field1258, var11.field1295, var74, 256 - (var15 & 0xFF));
                                        } else {
                                            class114.method822(var13, var14, var11.field1258, var11.field1295, var74, 256 - (var15 & 0xFF));
                                        }
                                    } else if (class108.field1900) {
                                        class163.method1106(var13, var14, var11.field1258, var11.field1295, var74, 256 - (var15 & 0xFF));
                                    } else {
                                        class114.method807(var13, var14, var11.field1258, var11.field1295, var74, 256 - (var15 & 0xFF));
                                    }
                                } else if (var11.field1267 == 4) {
                                    class138 var137 = var11.method499(class305.field5169, 16777215);
                                    if (var137 != null) {
                                        class229 var138 = var11.field1235;
                                        int var139;
                                        if (class213.method1462(var11, 26)) {
                                            var139 = var11.field1226;
                                            if (class312.field5244 == var11 && var11.field1132 != 0) {
                                                var139 = var11.field1132;
                                            }
                                            if (var11.field1263.method1626(arg0 ^ 0x3C) > 0) {
                                                var138 = var11.field1263;
                                            }
                                        } else {
                                            var139 = var11.field1292;
                                            if (class312.field5244 == var11 && var11.field1289 != 0) {
                                                var139 = var11.field1289;
                                            }
                                        }
                                        if (var11.field1249 && var11.field1165 != -1) {
                                            class313 var140 = class113.method799(var11.field1165, (byte) 50);
                                            var138 = var140.field5281;
                                            if (var138 == null) {
                                                var138 = class258.field4490;
                                            }
                                            if ((var140.field5298 == 1 || var11.field1273 != 1) && var11.field1273 != -1) {
                                                var138 = class142.method989(new class229[] { class110.field1944, var138, class172.field2993, class107.method729(6, var11.field1273) }, -96);
                                            }
                                        }
                                        if (class208.field3613 == var11) {
                                            var138 = class280.field4791;
                                            var139 = var11.field1292;
                                        }
                                        if (!var11.field1249) {
                                            var138 = class118.method844(var11, var138, (byte) 73);
                                        }
                                        var137.method961(var138, var13, var14, var11.field1258, var11.field1295, var139, var11.field1286 ? 0 : -1, var11.field1194, var11.field1254, var11.field1246);
                                    } else if (class119.field2119) {
                                        class194.method1328((byte) -68, var11);
                                    }
                                } else if (var11.field1267 == 5) {
                                    if (var11.field1249) {
                                        class35 var122;
                                        if (var11.field1165 == -1) {
                                            var122 = var11.method506(arg0 - 27701, false);
                                        } else {
                                            var122 = class259.method1843(true, var11.field1213, var11.field1273, var11.field1165, var11.field1178, var11.field1196);
                                        }
                                        if (var122 != null) {
                                            int var123 = var122.field662;
                                            int var124 = var122.field670;
                                            if (var11.field1260) {
                                                int var126 = (var11.field1258 + var124 - 1) / var124;
                                                int var127 = (var123 + var11.field1295 - 1) / var123;
                                                if (class108.field1900) {
                                                    class163.method1107(var13, var14, var13 + var11.field1258, var14 - -var11.field1295);
                                                    boolean var130 = class172.method1169(var122.field667, -1443519519);
                                                    class326 var131 = (class326) var122;
                                                    boolean var132 = class172.method1169(var122.field669, -1443519519);
                                                    if (var130 && var132) {
                                                        if (var15 == 0) {
                                                            var131.method2195(var13, var14, var126, var127);
                                                        } else {
                                                            var131.method2191(var13, var14, 256 - (var15 & 0xFF), var126, var127);
                                                        }
                                                    } else if (var130) {
                                                        for (int var136 = 0; var136 < var127; var136++) {
                                                            if (var15 == 0) {
                                                                var131.method2195(var13, var14 + (var123 * var136), var126, 1);
                                                            } else {
                                                                var131.method2191(var13, var123 * var136 + var14, -(var15 & 0xFF) + 256, var126, 1);
                                                            }
                                                        }
                                                    } else if (var132) {
                                                        for (int var135 = 0; var135 < var126; var135++) {
                                                            if (var15 == 0) {
                                                                var131.method2195(var13 + (var124 * var135), var14, 1, var127);
                                                            } else {
                                                                var131.method2191(var124 * var135 + var13, var14, 256 - (var15 & 0xFF), 1, var127);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var133 = 0; var133 < var126; var133++) {
                                                            for (int var134 = 0; var134 < var127; var134++) {
                                                                if (var15 == 0) {
                                                                    var122.method314(var124 * var133 + var13, var123 * var134 + var14);
                                                                } else {
                                                                    var122.method313(var124 * var133 + var13, var123 * var134 + var14, 256 - (var15 & 0xFF));
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class163.method1095(arg3, arg8, arg5, arg1);
                                                } else {
                                                    class114.method820(var13, var14, var11.field1258 + var13, var14 - -var11.field1295);
                                                    for (int var128 = 0; var128 < var126; var128++) {
                                                        for (int var129 = 0; var129 < var127; var129++) {
                                                            if (var11.field1255 != 0) {
                                                                var122.method309(var11.field1255, var124 * var128 + var124 / 2 + var13, var123 * var129 + var14 - -(var123 / 2), 32244, 4096);
                                                            } else if (var15 == 0) {
                                                                var122.method314(var124 * var128 + var13, var123 * var129 + var14);
                                                            } else {
                                                                var122.method313(var124 * var128 + var13, var14 - -(var123 * var129), 256 - (var15 & 0xFF));
                                                            }
                                                        }
                                                    }
                                                    class114.method813(arg3, arg8, arg5, arg1);
                                                }
                                            } else {
                                                int var125 = var11.field1258 * 4096 / var124;
                                                if (var11.field1255 != 0) {
                                                    var122.method309(var11.field1255, var13 + (var11.field1258 / 2), var11.field1295 / 2 + var14, arg0 + 32197, var125);
                                                } else if (var15 != 0) {
                                                    var122.method317(var13, var14, var11.field1258, var11.field1295, 256 - (var15 & 0xFF));
                                                } else if (var11.field1258 == var124 && var11.field1295 == var123) {
                                                    var122.method314(var13, var14);
                                                } else {
                                                    var122.method310(var13, var14, var11.field1258, var11.field1295);
                                                }
                                            }
                                        } else if (class119.field2119) {
                                            class194.method1328((byte) -74, var11);
                                        }
                                    } else {
                                        class35 var121 = var11.method506(-27654, class213.method1462(var11, 26));
                                        if (var121 != null) {
                                            var121.method314(var13, var14);
                                        } else if (class119.field2119) {
                                            class194.method1328((byte) -101, var11);
                                        }
                                    }
                                } else if (var11.field1267 == 6) {
                                    boolean var102 = class213.method1462(var11, arg0 ^ 0x35);
                                    int var103;
                                    if (var102) {
                                        var103 = var11.field1146;
                                    } else {
                                        var103 = var11.field1276;
                                    }
                                    class196 var104 = null;
                                    int var105 = 0;
                                    if (var11.field1165 != -1) {
                                        class313 var110 = class113.method799(var11.field1165, (byte) 50);
                                        if (var110 != null) {
                                            class313 var111 = var110.method2132(var11.field1273, (byte) 38);
                                            class194 var112 = var103 == -1 ? null : class280.method1965(var103, -93);
                                            var104 = var111.method2117(var11.field1252, arg0 + 60, var112, 1);
                                            if (var104 == null) {
                                                class194.method1328((byte) -108, var11);
                                            } else {
                                                var105 = -var104.method201() / 2;
                                            }
                                        }
                                    } else if (var11.field1134 == 5) {
                                        if (var11.field1288 == -1) {
                                            var104 = class122.field2157.method1476(-1, (class194) null, (class194) null, -1, (byte) -70);
                                        } else {
                                            int var106 = var11.field1288 & 0x7FF;
                                            if (class112.field1963 == var106) {
                                                var106 = 2047;
                                            }
                                            class33 var107 = class192.field3334[var106];
                                            class194 var108 = var103 == -1 ? null : class280.method1965(var103, arg0 ^ 0xFFFFFFEF);
                                            if (var107 != null && ((int) var107.field621.method1617(arg0 ^ 0x58) << 11) == (var11.field1288 & 0xFFFFF800)) {
                                                var104 = var107.field613.method1476(0, var108, (class194) null, var11.field1252, (byte) -70);
                                            }
                                        }
                                    } else if (var103 == -1) {
                                        var104 = var11.method503((byte) -62, var102, (class194) null, class301.field5124.field613, -1);
                                        if (var104 == null && class119.field2119) {
                                            class194.method1328((byte) -109, var11);
                                        }
                                    } else {
                                        class194 var109 = class280.method1965(var103, -89);
                                        var104 = var11.method503((byte) -62, var102, var109, class301.field5124.field613, var11.field1252);
                                        if (var104 == null && class119.field2119) {
                                            class194.method1328((byte) -115, var11);
                                        }
                                    }
                                    if (var104 != null) {
                                        int var113;
                                        if (var11.field1236 > 0) {
                                            var113 = (var11.field1295 << 8) / var11.field1236;
                                        } else {
                                            var113 = 256;
                                        }
                                        int var114;
                                        if (var11.field1234 > 0) {
                                            var114 = (var11.field1258 << 8) / var11.field1234;
                                        } else {
                                            var114 = 256;
                                        }
                                        int var115 = var11.field1295 / 2 + (var11.field1268 * var113 >> 8) + var14;
                                        int var116 = (var11.field1166 * var114 >> 8) + var11.field1258 / 2 + var13;
                                        if (class108.field1900) {
                                            if (var11.field1248) {
                                                class108.method757(var116, var115, var11.field1171, var11.field1269, var114, var113);
                                            } else {
                                                class108.method740(var116, var115, var114, var113);
                                                class108.method745((float) var11.field1163, (float) var11.field1269 * 1.5F);
                                            }
                                            class108.method762();
                                            class108.method747(true);
                                            class108.method768(false);
                                            class237.method1699(arg0 + 34, class281.field4822);
                                            if (class205.field3589) {
                                                class163.method1100();
                                                class108.method761();
                                                class163.method1095(arg3, arg8, arg5, arg1);
                                                class205.field3589 = false;
                                            }
                                            if (var11.field1192) {
                                                class108.method769();
                                            }
                                            int var119 = class227.field3911[var11.field1231] * var11.field1171 >> 16;
                                            int var120 = class227.field3896[var11.field1231] * var11.field1171 >> 16;
                                            if (var11.field1249) {
                                                var104.method275(0, var11.field1209, var11.field1285, var11.field1231, var11.field1179, var11.field1143 + var120 + var105, var11.field1143 + var119, -1L);
                                            } else {
                                                var104.method275(0, var11.field1209, 0, var11.field1231, 0, var120, var119, -1L);
                                            }
                                            if (var11.field1192) {
                                                class108.method767();
                                            }
                                        } else {
                                            class227.method1596(var116, var115);
                                            int var117 = class227.field3896[var11.field1231] * var11.field1171 >> 16;
                                            int var118 = class227.field3911[var11.field1231] * var11.field1171 >> 16;
                                            if (!var11.field1249) {
                                                var104.method275(0, var11.field1209, 0, var11.field1231, 0, var117, var118, -1L);
                                            } else if (var11.field1248) {
                                                ((class32) var104).method282(0, var11.field1209, var11.field1285, var11.field1231, var11.field1179, var11.field1143 + var105 + var117, var11.field1143 + var118, var11.field1171);
                                            } else {
                                                var104.method275(0, var11.field1209, var11.field1285, var11.field1231, var11.field1179, var105 + var117 + var11.field1143, var11.field1143 + var118, -1L);
                                            }
                                            class227.method1582();
                                        }
                                    }
                                } else {
                                    if (var11.field1267 == 7) {
                                        class138 var75 = var11.method499(class305.field5169, 16777215);
                                        if (var75 == null) {
                                            if (class119.field2119) {
                                                class194.method1328((byte) -74, var11);
                                            }
                                            continue;
                                        }
                                        int var76 = 0;
                                        for (int var77 = 0; var77 < var11.field1241; var77++) {
                                            for (int var78 = 0; var78 < var11.field1176; var78++) {
                                                if (var11.field1227[var76] > 0) {
                                                    class313 var79 = class113.method799(var11.field1227[var76] - 1, (byte) 50);
                                                    class229 var80;
                                                    if (var79.field5298 != 1 && var11.field1153[var76] == 1) {
                                                        var80 = class142.method989(new class229[] { class110.field1944, var79.field5281, class10.field122 }, arg0 ^ 0xFFFFFFBD);
                                                    } else {
                                                        var80 = class142.method989(new class229[] { class110.field1944, var79.field5281, class172.field2993, class107.method729(arg0 ^ 0x29, var11.field1153[var76]) }, arg0 - 60);
                                                    }
                                                    int var81 = (var11.field1186 + 12) * var77 + var14;
                                                    int var82 = (var11.field1182 + 115) * var78 + var13;
                                                    if (var11.field1194 == 0) {
                                                        var75.method957(var80, var82, var81, var11.field1292, var11.field1286 ? 0 : -1);
                                                    } else if (var11.field1194 == 1) {
                                                        var75.method954(var80, var82 + 57, var81, var11.field1292, var11.field1286 ? 0 : -1);
                                                    } else {
                                                        var75.method962(var80, var82 + 115 - 1, var81, var11.field1292, var11.field1286 ? 0 : -1);
                                                    }
                                                }
                                                var76++;
                                            }
                                        }
                                    }
                                    if (var11.field1267 == 8 && class273.field4673 == var11 && class3.field15 == class107.field1867) {
                                        int var83 = 0;
                                        int var84 = 0;
                                        class138 var85 = class249.field4385;
                                        class229 var86 = var11.field1235;
                                        class229 var87 = class118.method844(var11, var86, (byte) 76);
                                        while (var87.method1626(17) > 0) {
                                            int var88 = var87.method1649(class264.field4554, (byte) -117);
                                            class229 var89;
                                            if (var88 == -1) {
                                                var89 = var87;
                                                var87 = class331.field5638;
                                            } else {
                                                var89 = var87.method1639((byte) -20, var88, 0);
                                                var87 = var87.method1625(true, var88 + 4);
                                            }
                                            int var90 = var85.method947(var89);
                                            var84 += var85.field2400 + 1;
                                            if (var83 < var90) {
                                                var83 = var90;
                                            }
                                        }
                                        var84 += 7;
                                        int var91 = var11.field1295 + var14 + 5;
                                        var83 += 6;
                                        if (arg1 < (var84 + var91)) {
                                            var91 = arg1 - var84;
                                        }
                                        int var92 = var11.field1258 + var13 - var83 - 5;
                                        if (var92 < var13 + 5) {
                                            var92 = var13 + 5;
                                        }
                                        if (arg5 < (var83 + var92)) {
                                            var92 = arg5 - var83;
                                        }
                                        if (class108.field1900) {
                                            class163.method1102(var92, var91, var83, var84, 16777120);
                                            class163.method1098(var92, var91, var83, var84, 0);
                                        } else {
                                            class114.method803(var92, var91, var83, var84, 16777120);
                                            class114.method805(var92, var91, var83, var84, 0);
                                        }
                                        class229 var93 = var11.field1235;
                                        int var94 = var85.field2400 + var91 + 2;
                                        class229 var95 = class118.method844(var11, var93, (byte) 76);
                                        while (var95.method1626(96) > 0) {
                                            int var96 = var95.method1649(class264.field4554, (byte) -125);
                                            class229 var97;
                                            if (var96 == -1) {
                                                var97 = var95;
                                                var95 = class331.field5638;
                                            } else {
                                                var97 = var95.method1639((byte) -20, var96, 0);
                                                var95 = var95.method1625(true, var96 + 4);
                                            }
                                            var85.method957(var97, var92 + 3, var94, 0, -1);
                                            var94 += var85.field2400 + 1;
                                        }
                                    }
                                    if (var11.field1267 == 9) {
                                        int var98;
                                        int var99;
                                        int var100;
                                        int var101;
                                        if (var11.field1205) {
                                            var98 = var11.field1295 + var14;
                                            var99 = var13;
                                            var100 = var14;
                                            var101 = var11.field1258 + var13;
                                        } else {
                                            var101 = var13 + var11.field1258;
                                            var98 = var14;
                                            var100 = var11.field1295 + var14;
                                            var99 = var13;
                                        }
                                        if (var11.field1189 == 1) {
                                            if (class108.field1900) {
                                                class163.method1105(var99, var98, var101, var100, var11.field1292);
                                            } else {
                                                class114.method802(var99, var98, var101, var100, var11.field1292);
                                            }
                                        } else if (class108.field1900) {
                                            class163.method1103(var99, var98, var101, var100, var11.field1292, var11.field1189);
                                        } else {
                                            class114.method816(var99, var98, var101, var100, var11.field1292, var11.field1189);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg0 != 47) {
            method1851(-91);
        }
    }
}
