import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class181 {

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "Ldf;")
    public static class51 field2985 = class46.method233("gr-Un:", 100);

    @OriginalMember(owner = "client!vi", name = "l", descriptor = "Ldf;")
    private static class51 field2991 = class46.method233("Allocated memory", 100);

    @OriginalMember(owner = "client!vi", name = "h", descriptor = "I")
    public static int field2987 = -2;

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "Ldf;")
    public static class51 field2982 = field2991;

    @OriginalMember(owner = "client!vi", name = "k", descriptor = "Ldf;")
    public static class51 field2990 = null;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "I")
    public static int field2980;

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "I")
    public static int field2981;

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "I")
    public static int field2984;

    @OriginalMember(owner = "client!vi", name = "m", descriptor = "I")
    public static int field2992;

    @OriginalMember(owner = "client!vi", name = "j", descriptor = "[I")
    public static int[] field2989;

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "[Ltg;")
    public static class171[] field2986;

    @OriginalMember(owner = "client!vi", name = "i", descriptor = "[Ltg;")
    public static class171[] field2988;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V")
    public static void method1284(int arg0) {
        field2986 = null;
        field2985 = null;
        if (arg0 != 8) {
            return;
        }
        field2989 = null;
        field2988 = null;
        field2990 = null;
        field2991 = null;
        field2982 = null;
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(I)V")
    public static final void method1285(int arg0) {
        field2992++;
        class260.field4546 = 0;
        class37.field573 = 0;
        class70.field1128 = 0;
        class170.field2780 = 0;
        int var1 = -31 % ((-arg0 - 25) / 63);
        class189.field3163 = -1;
        class90.field1498 = false;
        class95.field1575.field2026 = 0;
        class52.field874 = -1;
        class35.field516 = -1;
        class96.field1581 = 0;
        class97.field1622.field2026 = 0;
        class39.field616 = 0;
        class44.field705 = -1;
        for (int var2 = 0; var2 < class66.field1055.length; var2++) {
            if (class66.field1055[var2] != null) {
                class66.field1055[var2].field4355 = -1;
            }
        }
        for (int var3 = 0; var3 < class34.field512.length; var3++) {
            if (class34.field512[var3] != null) {
                class34.field512[var3].field4355 = -1;
            }
        }
        class177.method1243(46);
        class201.field3361 = 1;
        class100.method734(true, 30);
        for (int var4 = 0; var4 < 100; var4++) {
            class213.field3705[var4] = true;
        }
        class86.field1441.method1708(2);
        class185.method1309(-124);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IB)[B")
    public static final synchronized byte[] method1286(int arg0, byte arg1) {
        field2981++;
        if (arg0 == 100 && class261.field4554 > 0) {
            byte[] var2 = class167.field2726[--class261.field4554];
            class167.field2726[class261.field4554] = null;
            return var2;
        }
        if (arg1 != -37) {
            method1289((class97) null, false);
        }
        if (arg0 == 5000 && class133.field2210 > 0) {
            byte[] var3 = class212.field3521[--class133.field2210];
            class212.field3521[class133.field2210] = null;
            return var3;
        } else if (arg0 == 30000 && class45.field719 > 0) {
            byte[] var4 = class255.field4457[--class45.field719];
            class255.field4457[class45.field719] = null;
            return var4;
        } else {
            return new byte[arg0];
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IZZ)Ldf;")
    public static final class51 method1287(int arg0, boolean arg1, boolean arg2) {
        field2980++;
        if (!arg2) {
            method1286(-107, (byte) -105);
        }
        return class204.method1413(arg1, 0, arg0, 10);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)V")
    public static final void method1288(int arg0, int arg1) {
        if (arg0 >= -35) {
            method1290((class103) null, 88, 95, -56);
        }
        class28.field400.method1348(0, arg1);
        field2984++;
        class261.field4557.method1348(0, arg1);
        class221.field3832.method1348(0, arg1);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lqg;Z)V")
    public static final void method1289(class97 arg0, boolean arg1) {
        class264.field4627.method1709(124, arg0);
        while (true) {
            class97 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class97[][] var7;
            class97 var66;
            do {
                class97 var65;
                do {
                    class97 var64;
                    do {
                        class97 var63;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class97) class264.field4627.method1714(58);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field1613);
                                            var3 = var2.field1629;
                                            var4 = var2.field1631;
                                            var5 = var2.field1617;
                                            var6 = var2.field1630;
                                            var7 = class27.field395[var5];
                                            if (!var2.field1612) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class97 var8 = class27.field395[var5 - 1][var3][var4];
                                                    if (var8 != null && var8.field1613) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class40.field628 && var3 > class243.field4209) {
                                                    class97 var9 = var7[var3 - 1][var4];
                                                    if (var9 != null && var9.field1613 && (var9.field1612 || (var2.field1624 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class40.field628 && var3 < class96.field1587 - 1) {
                                                    class97 var10 = var7[var3 + 1][var4];
                                                    if (var10 != null && var10.field1613 && (var10.field1612 || (var2.field1624 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class20.field274 && var4 > class261.field4558) {
                                                    class97 var11 = var7[var3][var4 - 1];
                                                    if (var11 != null && var11.field1613 && (var11.field1612 || (var2.field1624 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class20.field274 && var4 < class79.field1267 - 1) {
                                                    class97 var12 = var7[var3][var4 + 1];
                                                    if (var12 != null && var12.field1613 && (var12.field1612 || (var2.field1624 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field1612 = false;
                                            if (var2.field1626 != null) {
                                                class97 var13 = var2.field1626;
                                                if (var13.field1618 == null) {
                                                    if (var13.field1619 != null) {
                                                        if (class177.method1238(0, var3, var4)) {
                                                            class24.method131(var13.field1619, class246.field4266, class261.field4560, class32.field459, class128.field2150, var3, var4, true);
                                                        } else {
                                                            class24.method131(var13.field1619, class246.field4266, class261.field4560, class32.field459, class128.field2150, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class177.method1238(0, var3, var4)) {
                                                    class202.method1406(var13.field1618, 0, class246.field4266, class261.field4560, class32.field459, class128.field2150, var3, var4, true);
                                                } else {
                                                    class202.method1406(var13.field1618, 0, class246.field4266, class261.field4560, class32.field459, class128.field2150, var3, var4, false);
                                                }
                                                class241 var14 = var13.field1627;
                                                if (var14 != null) {
                                                    var14.field4183.method96(0, class246.field4266, class261.field4560, class32.field459, class128.field2150, var14.field4189 - class124.field2105, var14.field4186 - class69.field1108, var14.field4185 - class123.field2083, var14.field4176);
                                                }
                                                for (int var15 = 0; var15 < var13.field1620; var15++) {
                                                    class33 var16 = var13.field1632[var15];
                                                    if (var16 != null) {
                                                        var16.field488.method96(var16.field484, class246.field4266, class261.field4560, class32.field459, class128.field2150, var16.field475 - class124.field2105, var16.field493 - class69.field1108, var16.field474 - class123.field2083, var16.field477);
                                                    }
                                                }
                                            }
                                            boolean var17 = false;
                                            if (var2.field1618 == null) {
                                                if (var2.field1619 != null) {
                                                    if (class177.method1238(var6, var3, var4)) {
                                                        class24.method131(var2.field1619, class246.field4266, class261.field4560, class32.field459, class128.field2150, var3, var4, true);
                                                    } else {
                                                        var17 = true;
                                                        class24.method131(var2.field1619, class246.field4266, class261.field4560, class32.field459, class128.field2150, var3, var4, false);
                                                    }
                                                }
                                            } else if (class177.method1238(var6, var3, var4)) {
                                                class202.method1406(var2.field1618, var6, class246.field4266, class261.field4560, class32.field459, class128.field2150, var3, var4, true);
                                            } else {
                                                var17 = true;
                                                if (var2.field1618.field1633 != 12345678 || class82.field1389 && var5 <= class19.field271) {
                                                    class202.method1406(var2.field1618, var6, class246.field4266, class261.field4560, class32.field459, class128.field2150, var3, var4, false);
                                                }
                                            }
                                            if (var17) {
                                                class162 var18 = var2.field1614;
                                                if (var18 != null && (var18.field2660 & 0x80000000L) != 0L) {
                                                    var18.field2655.method96(0, class246.field4266, class261.field4560, class32.field459, class128.field2150, var18.field2650 - class124.field2105, var18.field2657 - class69.field1108, var18.field2661 - class123.field2083, var18.field2660);
                                                }
                                            }
                                            int var19 = 0;
                                            int var20 = 0;
                                            class241 var21 = var2.field1627;
                                            class195 var22 = var2.field1616;
                                            if (var21 != null || var22 != null) {
                                                if (class40.field628 == var3) {
                                                    var19++;
                                                } else if (class40.field628 < var3) {
                                                    var19 += 2;
                                                }
                                                if (class20.field274 == var4) {
                                                    var19 += 3;
                                                } else if (class20.field274 > var4) {
                                                    var19 += 6;
                                                }
                                                var20 = class193.field3239[var19];
                                                var2.field1608 = class76.field1218[var19];
                                            }
                                            if (var21 != null) {
                                                if ((var21.field4184 & class172.field2826[var19]) == 0) {
                                                    var2.field1607 = 0;
                                                } else if (var21.field4184 == 16) {
                                                    var2.field1607 = 3;
                                                    var2.field1610 = class173.field2838[var19];
                                                    var2.field1621 = 3 - var2.field1610;
                                                } else if (var21.field4184 == 32) {
                                                    var2.field1607 = 6;
                                                    var2.field1610 = class64.field1044[var19];
                                                    var2.field1621 = 6 - var2.field1610;
                                                } else if (var21.field4184 == 64) {
                                                    var2.field1607 = 12;
                                                    var2.field1610 = class35.field537[var19];
                                                    var2.field1621 = 12 - var2.field1610;
                                                } else {
                                                    var2.field1607 = 9;
                                                    var2.field1610 = class139.field2332[var19];
                                                    var2.field1621 = 9 - var2.field1610;
                                                }
                                                if ((var21.field4184 & var20) != 0 && !class55.method350(var6, var3, var4, var21.field4184)) {
                                                    var21.field4183.method96(0, class246.field4266, class261.field4560, class32.field459, class128.field2150, var21.field4189 - class124.field2105, var21.field4186 - class69.field1108, var21.field4185 - class123.field2083, var21.field4176);
                                                }
                                                if ((var21.field4177 & var20) != 0 && !class55.method350(var6, var3, var4, var21.field4177)) {
                                                    var21.field4187.method96(0, class246.field4266, class261.field4560, class32.field459, class128.field2150, var21.field4189 - class124.field2105, var21.field4186 - class69.field1108, var21.field4185 - class123.field2083, var21.field4176);
                                                }
                                            }
                                            if (var22 != null && !class87.method667(var6, var3, var4, var22.field3252.method94())) {
                                                if ((var22.field3259 & var20) != 0) {
                                                    var22.field3252.method96(0, class246.field4266, class261.field4560, class32.field459, class128.field2150, var22.field3266 + var22.field3272 - class124.field2105, var22.field3254 - class69.field1108, var22.field3271 + var22.field3251 - class123.field2083, var22.field3273);
                                                } else if (var22.field3259 == 256) {
                                                    int var23 = var22.field3266 - class124.field2105;
                                                    int var24 = var22.field3254 - class69.field1108;
                                                    int var25 = var22.field3271 - class123.field2083;
                                                    int var26 = var22.field3253;
                                                    int var27;
                                                    if (var26 == 1 || var26 == 2) {
                                                        var27 = -var23;
                                                    } else {
                                                        var27 = var23;
                                                    }
                                                    int var28;
                                                    if (var26 == 2 || var26 == 3) {
                                                        var28 = -var25;
                                                    } else {
                                                        var28 = var25;
                                                    }
                                                    if (var28 < var27) {
                                                        var22.field3252.method96(0, class246.field4266, class261.field4560, class32.field459, class128.field2150, var22.field3272 + var23, var24, var22.field3251 + var25, var22.field3273);
                                                    } else if (var22.field3268 != null) {
                                                        var22.field3268.method96(0, class246.field4266, class261.field4560, class32.field459, class128.field2150, var23, var24, var25, var22.field3273);
                                                    }
                                                }
                                            }
                                            if (var17) {
                                                class162 var29 = var2.field1614;
                                                if (var29 != null && (var29.field2660 & 0x80000000L) == 0L) {
                                                    var29.field2655.method96(0, class246.field4266, class261.field4560, class32.field459, class128.field2150, var29.field2650 - class124.field2105, var29.field2657 - class69.field1108, var29.field2661 - class123.field2083, var29.field2660);
                                                }
                                                class105 var30 = var2.field1611;
                                                if (var30 != null && var30.field1730 == 0) {
                                                    if (var30.field1735 != null) {
                                                        var30.field1735.method96(0, class246.field4266, class261.field4560, class32.field459, class128.field2150, var30.field1736 - class124.field2105, var30.field1737 - class69.field1108, var30.field1740 - class123.field2083, var30.field1741);
                                                    }
                                                    if (var30.field1731 != null) {
                                                        var30.field1731.method96(0, class246.field4266, class261.field4560, class32.field459, class128.field2150, var30.field1736 - class124.field2105, var30.field1737 - class69.field1108, var30.field1740 - class123.field2083, var30.field1741);
                                                    }
                                                    if (var30.field1739 != null) {
                                                        var30.field1739.method96(0, class246.field4266, class261.field4560, class32.field459, class128.field2150, var30.field1736 - class124.field2105, var30.field1737 - class69.field1108, var30.field1740 - class123.field2083, var30.field1741);
                                                    }
                                                }
                                            }
                                            int var31 = var2.field1624;
                                            if (var31 != 0) {
                                                if (var3 < class40.field628 && (var31 & 0x4) != 0) {
                                                    class97 var32 = var7[var3 + 1][var4];
                                                    if (var32 != null && var32.field1613) {
                                                        class264.field4627.method1709(28, var32);
                                                    }
                                                }
                                                if (var4 < class20.field274 && (var31 & 0x2) != 0) {
                                                    class97 var33 = var7[var3][var4 + 1];
                                                    if (var33 != null && var33.field1613) {
                                                        class264.field4627.method1709(60, var33);
                                                    }
                                                }
                                                if (var3 > class40.field628 && (var31 & 0x1) != 0) {
                                                    class97 var34 = var7[var3 - 1][var4];
                                                    if (var34 != null && var34.field1613) {
                                                        class264.field4627.method1709(-96, var34);
                                                    }
                                                }
                                                if (var4 > class20.field274 && (var31 & 0x8) != 0) {
                                                    class97 var35 = var7[var3][var4 - 1];
                                                    if (var35 != null && var35.field1613) {
                                                        class264.field4627.method1709(-91, var35);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field1607 != 0) {
                                            boolean var36 = true;
                                            for (int var37 = 0; var37 < var2.field1620; var37++) {
                                                if (class170.field2786 != var2.field1632[var37].field480 && (var2.field1609[var37] & var2.field1607) == var2.field1610) {
                                                    var36 = false;
                                                    break;
                                                }
                                            }
                                            if (var36) {
                                                class241 var38 = var2.field1627;
                                                if (!class55.method350(var6, var3, var4, var38.field4184)) {
                                                    var38.field4183.method96(0, class246.field4266, class261.field4560, class32.field459, class128.field2150, var38.field4189 - class124.field2105, var38.field4186 - class69.field1108, var38.field4185 - class123.field2083, var38.field4176);
                                                }
                                                var2.field1607 = 0;
                                            }
                                        }
                                        if (!var2.field1625) {
                                            break;
                                        }
                                        try {
                                            int var39 = var2.field1620;
                                            var2.field1625 = false;
                                            int var40 = 0;
                                            label572: for (int var41 = 0; var41 < var39; var41++) {
                                                class33 var42 = var2.field1632[var41];
                                                if (class170.field2786 != var42.field480) {
                                                    for (int var43 = var42.field492; var43 <= var42.field495; var43++) {
                                                        for (int var44 = var42.field491; var44 <= var42.field478; var44++) {
                                                            class97 var45 = var7[var43][var44];
                                                            if (var45.field1612) {
                                                                var2.field1625 = true;
                                                                continue label572;
                                                            }
                                                            if (var45.field1607 != 0) {
                                                                int var46 = 0;
                                                                if (var43 > var42.field492) {
                                                                    var46++;
                                                                }
                                                                if (var43 < var42.field495) {
                                                                    var46 += 4;
                                                                }
                                                                if (var44 > var42.field491) {
                                                                    var46 += 8;
                                                                }
                                                                if (var44 < var42.field478) {
                                                                    var46 += 2;
                                                                }
                                                                if ((var46 & var45.field1607) == var2.field1621) {
                                                                    var2.field1625 = true;
                                                                    continue label572;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class132.field2206[var40++] = var42;
                                                    int var47 = class40.field628 - var42.field492;
                                                    int var48 = var42.field495 - class40.field628;
                                                    if (var48 > var47) {
                                                        var47 = var48;
                                                    }
                                                    int var49 = class20.field274 - var42.field491;
                                                    int var50 = var42.field478 - class20.field274;
                                                    if (var50 > var49) {
                                                        var42.field483 = var47 + var50;
                                                    } else {
                                                        var42.field483 = var47 + var49;
                                                    }
                                                }
                                            }
                                            while (var40 > 0) {
                                                int var51 = -50;
                                                int var52 = -1;
                                                for (int var53 = 0; var53 < var40; var53++) {
                                                    class33 var54 = class132.field2206[var53];
                                                    if (class170.field2786 != var54.field480) {
                                                        if (var54.field483 > var51) {
                                                            var51 = var54.field483;
                                                            var52 = var53;
                                                        } else if (var54.field483 == var51) {
                                                            int var55 = var54.field475 - class124.field2105;
                                                            int var56 = var54.field474 - class123.field2083;
                                                            int var57 = class132.field2206[var52].field475 - class124.field2105;
                                                            int var58 = class132.field2206[var52].field474 - class123.field2083;
                                                            if (var55 * var55 + var56 * var56 > var57 * var57 + var58 * var58) {
                                                                var52 = var53;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var52 == -1) {
                                                    break;
                                                }
                                                class33 var59 = class132.field2206[var52];
                                                var59.field480 = class170.field2786;
                                                if (!class249.method1692(var6, var59.field492, var59.field495, var59.field491, var59.field478, var59.field488.method94())) {
                                                    var59.field488.method96(var59.field484, class246.field4266, class261.field4560, class32.field459, class128.field2150, var59.field475 - class124.field2105, var59.field493 - class69.field1108, var59.field474 - class123.field2083, var59.field477);
                                                }
                                                for (int var60 = var59.field492; var60 <= var59.field495; var60++) {
                                                    for (int var61 = var59.field491; var61 <= var59.field478; var61++) {
                                                        class97 var62 = var7[var60][var61];
                                                        if (var62.field1607 != 0) {
                                                            class264.field4627.method1709(-121, var62);
                                                        } else if ((var3 != var60 || var4 != var61) && var62.field1613) {
                                                            class264.field4627.method1709(-121, var62);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field1625) {
                                                break;
                                            }
                                        } catch (Exception var81) {
                                            var2.field1625 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field1613);
                            } while (var2.field1607 != 0);
                            if (var3 > class40.field628 || var3 <= class243.field4209) {
                                break;
                            }
                            var63 = var7[var3 - 1][var4];
                        } while (var63 != null && var63.field1613);
                        if (var3 < class40.field628 || var3 >= class96.field1587 - 1) {
                            break;
                        }
                        var64 = var7[var3 + 1][var4];
                    } while (var64 != null && var64.field1613);
                    if (var4 > class20.field274 || var4 <= class261.field4558) {
                        break;
                    }
                    var65 = var7[var3][var4 - 1];
                } while (var65 != null && var65.field1613);
                if (var4 < class20.field274 || var4 >= class79.field1267 - 1) {
                    break;
                }
                var66 = var7[var3][var4 + 1];
            } while (var66 != null && var66.field1613);
            var2.field1613 = false;
            class98.field1641--;
            class105 var67 = var2.field1611;
            if (var67 != null && var67.field1730 != 0) {
                if (var67.field1735 != null) {
                    var67.field1735.method96(0, class246.field4266, class261.field4560, class32.field459, class128.field2150, var67.field1736 - class124.field2105, var67.field1737 - class69.field1108 - var67.field1730, var67.field1740 - class123.field2083, var67.field1741);
                }
                if (var67.field1731 != null) {
                    var67.field1731.method96(0, class246.field4266, class261.field4560, class32.field459, class128.field2150, var67.field1736 - class124.field2105, var67.field1737 - class69.field1108 - var67.field1730, var67.field1740 - class123.field2083, var67.field1741);
                }
                if (var67.field1739 != null) {
                    var67.field1739.method96(0, class246.field4266, class261.field4560, class32.field459, class128.field2150, var67.field1736 - class124.field2105, var67.field1737 - class69.field1108 - var67.field1730, var67.field1740 - class123.field2083, var67.field1741);
                }
            }
            if (var2.field1608 != 0) {
                class195 var68 = var2.field1616;
                if (var68 != null && !class87.method667(var6, var3, var4, var68.field3252.method94())) {
                    if ((var68.field3259 & var2.field1608) != 0) {
                        var68.field3252.method96(0, class246.field4266, class261.field4560, class32.field459, class128.field2150, var68.field3266 + var68.field3272 - class124.field2105, var68.field3254 - class69.field1108, var68.field3271 + var68.field3251 - class123.field2083, var68.field3273);
                    } else if (var68.field3259 == 256) {
                        int var69 = var68.field3266 - class124.field2105;
                        int var70 = var68.field3254 - class69.field1108;
                        int var71 = var68.field3271 - class123.field2083;
                        int var72 = var68.field3253;
                        int var73;
                        if (var72 == 1 || var72 == 2) {
                            var73 = -var69;
                        } else {
                            var73 = var69;
                        }
                        int var74;
                        if (var72 == 2 || var72 == 3) {
                            var74 = -var71;
                        } else {
                            var74 = var71;
                        }
                        if (var74 >= var73) {
                            var68.field3252.method96(0, class246.field4266, class261.field4560, class32.field459, class128.field2150, var68.field3272 + var69, var70, var68.field3251 + var71, var68.field3273);
                        } else if (var68.field3268 != null) {
                            var68.field3268.method96(0, class246.field4266, class261.field4560, class32.field459, class128.field2150, var69, var70, var71, var68.field3273);
                        }
                    }
                }
                class241 var75 = var2.field1627;
                if (var75 != null) {
                    if ((var75.field4177 & var2.field1608) != 0 && !class55.method350(var6, var3, var4, var75.field4177)) {
                        var75.field4187.method96(0, class246.field4266, class261.field4560, class32.field459, class128.field2150, var75.field4189 - class124.field2105, var75.field4186 - class69.field1108, var75.field4185 - class123.field2083, var75.field4176);
                    }
                    if ((var75.field4184 & var2.field1608) != 0 && !class55.method350(var6, var3, var4, var75.field4184)) {
                        var75.field4183.method96(0, class246.field4266, class261.field4560, class32.field459, class128.field2150, var75.field4189 - class124.field2105, var75.field4186 - class69.field1108, var75.field4185 - class123.field2083, var75.field4176);
                    }
                }
            }
            if (var5 < class52.field895 - 1) {
                class97 var76 = class27.field395[var5 + 1][var3][var4];
                if (var76 != null && var76.field1613) {
                    class264.field4627.method1709(-96, var76);
                }
            }
            if (var3 < class40.field628) {
                class97 var77 = var7[var3 + 1][var4];
                if (var77 != null && var77.field1613) {
                    class264.field4627.method1709(13, var77);
                }
            }
            if (var4 < class20.field274) {
                class97 var78 = var7[var3][var4 + 1];
                if (var78 != null && var78.field1613) {
                    class264.field4627.method1709(-120, var78);
                }
            }
            if (var3 > class40.field628) {
                class97 var79 = var7[var3 - 1][var4];
                if (var79 != null && var79.field1613) {
                    class264.field4627.method1709(-118, var79);
                }
            }
            if (var4 > class20.field274) {
                class97 var80 = var7[var3][var4 - 1];
                if (var80 != null && var80.field1613) {
                    class264.field4627.method1709(30, var80);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lfi;III)V")
    public static final void method1290(class103 arg0, int arg1, int arg2, int arg3) {
        int var4 = 34 / ((arg1 - 30) / 46);
        if (arg0.field4344 == arg2 && arg2 != -1) {
            class151 var5 = class72.method501(arg2, (byte) 84);
            int var6 = var5.field2534;
            if (var6 == 1) {
                arg0.field4292 = 0;
                arg0.field4277 = 0;
                arg0.field4321 = arg3;
                arg0.field4342 = 0;
                class208.method1433(arg0.field4348, arg0.field4319, 68, arg0.field4277, class44.field706 == arg0, var5);
            }
            if (var6 == 2) {
                arg0.field4342 = 0;
            }
        } else if (arg2 == -1 || arg0.field4344 == -1 || class72.method501(arg2, (byte) 60).field2535 >= class72.method501(arg0.field4344, (byte) 91).field2535) {
            arg0.field4342 = 0;
            arg0.field4321 = arg3;
            arg0.field4292 = 0;
            arg0.field4344 = arg2;
            arg0.field4279 = arg0.field4347;
            arg0.field4277 = 0;
            if (arg0.field4344 != -1) {
                class208.method1433(arg0.field4348, arg0.field4319, 82, arg0.field4277, class44.field706 == arg0, class72.method501(arg0.field4344, (byte) 17));
            }
        }
        field2983++;
    }
}
