import java.awt.Component;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public abstract class class258 {

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "Z")
    public static boolean field3932 = false;

    @OriginalMember(owner = "client!fj", name = "i", descriptor = "I")
    public static int field3940 = 0;

    @OriginalMember(owner = "client!fj", name = "j", descriptor = "[I")
    public static int[] field3941 = new int[14];

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "I")
    public static int field3933;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
    public static int field3934;

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "I")
    public static int field3935;

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "I")
    public static int field3937;

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "I")
    public static int field3938;

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "Lpf;")
    public static class294 field3939;

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "[I")
    public static int[] field3936;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)Z")
    public static final boolean method1735(int arg0) throws IOException {
        field3934++;
        if (class44.field706 == null) {
            return false;
        }
        int var1 = class44.field706.method953(0);
        if (var1 == 0) {
            return false;
        }
        if (class246.field3683 == -1) {
            var1--;
            class44.field706.method946(class100.field1580.field3723, true, 1, 0);
            class100.field1580.field3748 = 0;
            class246.field3683 = class100.field1580.method1094(17013);
            class202.field3050 = class165.field2534[class246.field3683];
        }
        if (class202.field3050 == -1) {
            if (var1 <= 0) {
                return false;
            }
            var1--;
            class44.field706.method946(class100.field1580.field3723, true, 1, 0);
            class202.field3050 = class100.field1580.field3723[0] & 0xFF;
        }
        if (class202.field3050 == -2) {
            if (var1 <= 1) {
                return false;
            }
            class44.field706.method946(class100.field1580.field3723, true, 2, 0);
            class100.field1580.field3748 = 0;
            class202.field3050 = class100.field1580.method1575(false);
            var1 -= 2;
        }
        if (var1 < class202.field3050) {
            return false;
        }
        class100.field1580.field3748 = 0;
        class44.field706.method946(class100.field1580.field3723, true, class202.field3050, 0);
        class18.field216 = 0;
        class136.field1990 = class85.field1366;
        class85.field1366 = class157.field2367;
        class157.field2367 = class246.field3683;
        if (class246.field3683 == 103) {
            int var2 = class100.field1580.method1576(-17672);
            int var3 = class100.field1580.method1575(false);
            if (var2 < -70000) {
                var3 += 32768;
            }
            class289 var4;
            if (var2 >= 0) {
                var4 = class89.method574((byte) -15, var2);
            } else {
                var4 = null;
            }
            while (class100.field1580.field3748 < class202.field3050) {
                int var5 = class100.field1580.method1563((byte) 3);
                int var6 = class100.field1580.method1575(false);
                int var7 = 0;
                if (var6 != 0) {
                    var7 = class100.field1580.method1593((byte) 27);
                    if (var7 == 255) {
                        var7 = class100.field1580.method1576(-17672);
                    }
                }
                if (var4 != null && var5 >= 0 && var5 < var4.field4513.length) {
                    var4.field4513[var5] = var6;
                    var4.field4448[var5] = var7;
                }
                class48.method320(var5, var3, var7, var6 - 1, -10993);
            }
            if (var4 != null) {
                class295.method1980(var4, arg0 ^ 0x5);
            }
            class227.method1447(5);
            class217.field3269[class94.method598(class268.field4041++, 31)] = class94.method598(var3, 32767);
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 167) {
            int var8 = class100.field1580.method1575(false);
            int var9 = class100.field1580.method1593((byte) 27);
            int var10 = class100.field1580.method1593((byte) 27);
            int var11 = class100.field1580.method1575(false);
            int var12 = class100.field1580.method1593((byte) 27);
            int var13 = class100.field1580.method1593((byte) 27);
            if (class266.method1767(var8, false)) {
                class224.method1427(var9, var12, var10, var11, (byte) -111, var13);
            }
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 128) {
            int var14 = class100.field1580.method1618(16711680);
            int var15 = class100.field1580.method1578(-2);
            byte var16 = class100.field1580.method1604(arg0 ^ 0x1);
            if (class266.method1767(var14, false)) {
                class247.method1556(var15, (byte) 85, var16);
            }
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 9) {
            int var17 = class100.field1580.method1590((byte) -71);
            class22.field266 = class209.field3147.method56(var17, true);
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 183) {
            for (int var18 = 0; var18 < class35.field494.length; var18++) {
                if (class35.field494[var18] != class186.field2823[var18]) {
                    class35.field494[var18] = class186.field2823[var18];
                    class183.method1140(var18, -24559);
                    class235.field3550[class94.method598(class26.field323++, 31)] = var18;
                }
            }
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 77) {
            int var19 = class100.field1580.method1575(false);
            if (class266.method1767(var19, false)) {
                class39.method233(26611);
            }
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 16) {
            int var20 = class100.field1580.method1575(false);
            String var21 = class100.field1580.method1597((byte) -43);
            Object[] var22 = new Object[var21.length() + 1];
            for (int var23 = var21.length() - 1; var23 >= 0; var23--) {
                if (var21.charAt(var23) == 's') {
                    var22[var23 + 1] = class100.field1580.method1597((byte) 119);
                } else {
                    var22[var23 + 1] = Integer.valueOf(class100.field1580.method1576(-17672));
                }
            }
            var22[0] = Integer.valueOf(class100.field1580.method1576(-17672));
            if (class266.method1767(var20, false)) {
                class234 var24 = new class234();
                var24.field3533 = var22;
                class228.method1456((byte) -33, var24);
            }
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 217) {
            int var25 = class100.field1580.method1582(-1);
            int var26 = class100.field1580.method1606((byte) 77);
            int var27 = class100.field1580.method1578(-2);
            if (class266.method1767(var27, false)) {
                class24.method152(var25, arg0 - 105, var26);
            }
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 148) {
            class159.field2449 = class100.field1580.method1593((byte) 27);
            class112.field1724 = class68.field1077;
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 64) {
            int var28 = class100.field1580.method1572(-70);
            int var29 = class100.field1580.method1590((byte) -62);
            int var30 = class100.field1580.method1575(false);
            if (class266.method1767(var30, false)) {
                class202.method1290(var28, -13070, var29);
            }
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 69) {
            int var31 = class100.field1580.method1582(arg0 - 6);
            int var32 = class100.field1580.method1578(-2);
            int var33 = class100.field1580.method1618(16711680);
            if (var32 == 65535) {
                var32 = -1;
            }
            int var34 = class100.field1580.method1618(16711680);
            int var35 = class100.field1580.method1578(arg0 - 7);
            if (var35 == 65535) {
                var35 = -1;
            }
            if (class266.method1767(var34, false)) {
                for (int var36 = var35; var36 <= var32; var36++) {
                    long var37 = ((long) var31 << 32) + ((long) var36);
                    class268 var39 = (class268) class221.field3326.method1666(var37, (byte) -113);
                    class268 var40;
                    if (var39 != null) {
                        var40 = new class268(var39.field4049, var33);
                        var39.method538(59);
                    } else if (var36 == -1) {
                        var40 = new class268(class89.method574((byte) -15, var31).field4529.field4049, var33);
                    } else {
                        var40 = new class268(0, var33);
                    }
                    class221.field3326.method1663(var37, var40, -103);
                }
            }
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 119) {
            for (int var41 = 0; var41 < class96.field1521.length; var41++) {
                if (class96.field1521[var41] != null) {
                    class96.field1521[var41].field2260 = -1;
                }
            }
            for (int var42 = 0; var42 < class18.field220.length; var42++) {
                if (class18.field220[var42] != null) {
                    class18.field220[var42].field2260 = -1;
                }
            }
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 96) {
            int var43 = class100.field1580.method1576(-17672);
            int var44 = class100.field1580.method1575(false);
            class289 var45;
            if (var43 < 0) {
                var45 = null;
            } else {
                var45 = class89.method574((byte) -15, var43);
            }
            if (var45 != null) {
                for (int var46 = 0; var46 < var45.field4513.length; var46++) {
                    var45.field4513[var46] = 0;
                    var45.field4448[var46] = 0;
                }
            }
            if (var43 < -70000) {
                var44 += 32768;
            }
            class49.method327(var44, (byte) 99);
            int var47 = class100.field1580.method1575(false);
            for (int var48 = 0; var48 < var47; var48++) {
                int var49 = class100.field1580.method1593((byte) 27);
                if (var49 == 255) {
                    var49 = class100.field1580.method1582(-1);
                }
                int var50 = class100.field1580.method1570(true);
                if (var45 != null && var45.field4513.length > var48) {
                    var45.field4513[var48] = var50;
                    var45.field4448[var48] = var49;
                }
                class48.method320(var48, var44, var49, var50 - 1, arg0 ^ 0xFFFFD50A);
            }
            if (var45 != null) {
                class295.method1980(var45, 0);
            }
            class227.method1447(5);
            class217.field3269[class94.method598(class268.field4041++, 31)] = class94.method598(var44, 32767);
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 200) {
            class187.field2847 = class68.field1077;
            long var51 = class100.field1580.method1608(arg0 + 11114);
            if (var51 == 0L) {
                class277.field4179 = null;
                class184.field2779 = null;
                class132.field1941 = null;
                class246.field3683 = -1;
                class224.field3352 = 0;
                return true;
            }
            long var53 = class100.field1580.method1608(11119);
            class132.field1941 = class98.method632(0, var53);
            class277.field4179 = class98.method632(arg0 - 5, var51);
            class113.field1730 = class100.field1580.method1604(4);
            int var55 = class100.field1580.method1593((byte) 27);
            if (var55 == 255) {
                class246.field3683 = -1;
                return true;
            }
            class224.field3352 = var55;
            class196[] var56 = new class196[100];
            for (int var57 = 0; var57 < class224.field3352; var57++) {
                var56[var57] = new class196();
                var56[var57].field1321 = class100.field1580.method1608(arg0 ^ 0x2B6A);
                var56[var57].field2982 = class98.method632(0, var56[var57].field1321);
                var56[var57].field2977 = class100.field1580.method1575(false);
                var56[var57].field2987 = class100.field1580.method1604(4);
                var56[var57].field2981 = class100.field1580.method1597((byte) 120);
                if (class209.field3150 == var56[var57].field1321) {
                    class293.field4624 = var56[var57].field2987;
                }
            }
            boolean var58 = false;
            int var59 = class224.field3352;
            while (var59 > 0) {
                var59--;
                boolean var60 = true;
                for (int var61 = 0; var61 < var59; var61++) {
                    if (var56[var61].field2982.compareTo(var56[var61 + 1].field2982) > 0) {
                        var60 = false;
                        class196 var62 = var56[var61];
                        var56[var61] = var56[var61 + 1];
                        var56[var61 + 1] = var62;
                    }
                }
                if (var60) {
                    break;
                }
            }
            class246.field3683 = -1;
            class184.field2779 = var56;
            return true;
        } else if (class246.field3683 == 117) {
            long var63 = class100.field1580.method1608(arg0 + 11114);
            class100.field1580.method1604(4);
            long var65 = class100.field1580.method1608(11119);
            long var67 = (long) class100.field1580.method1575(false);
            long var69 = (long) class100.field1580.method1587(-121);
            int var71 = class100.field1580.method1593((byte) 27);
            boolean var72 = false;
            long var73 = (var67 << 32) + var69;
            int var75 = 0;
            label1230: while (true) {
                if (var75 >= 100) {
                    if (var71 <= 1) {
                        if ((!class85.field1354 || class41.field610) && !class116.field1762) {
                            for (int var76 = 0; var76 < class154.field2307; var76++) {
                                if (class35.field493[var76] == var63) {
                                    var72 = true;
                                    break label1230;
                                }
                            }
                        } else {
                            var72 = true;
                        }
                    }
                    break;
                }
                if (class24.field289[var75] == var73) {
                    var72 = true;
                    break;
                }
                var75++;
            }
            if (!var72 && class218.field3280 == 0) {
                class24.field289[class76.field1235] = var73;
                class76.field1235 = (class76.field1235 + 1) % 100;
                String var77 = class164.method1021(class2.method9(class210.method1346(class100.field1580, false), 1207));
                if (var71 == 2 || var71 == 3) {
                    class251.method1651(9, class200.method1255(var65, false), var77, -1488, "<img=1>" + class200.method1255(var63, false));
                } else if (var71 == 1) {
                    class251.method1651(9, class200.method1255(var65, false), var77, -1488, "<img=0>" + class200.method1255(var63, false));
                } else {
                    class251.method1651(9, class200.method1255(var65, false), var77, -1488, class200.method1255(var63, false));
                }
            }
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 107) {
            int var78 = class100.field1580.method1618(16711680);
            int var79 = class100.field1580.method1575(false);
            int var80 = class100.field1580.method1576(-17672);
            if (class266.method1767(var78, false)) {
                class175.method1083((byte) 75, var80, var79);
            }
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 41) {
            int var81 = class100.field1580.method1575(false);
            if (var81 == 65535) {
                var81 = -1;
            }
            int var82 = class100.field1580.method1593((byte) 27);
            int var83 = class100.field1580.method1575(false);
            int var84 = class100.field1580.method1593((byte) 27);
            class45.method304(var81, var84, var82, arg0 - 5, var83);
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 162) {
            int var85 = class100.field1580.method1593((byte) 27);
            int var86 = var85 >> 5;
            int var87 = var85 & 0x1F;
            if (var87 == 0) {
                class101.field1591[var86] = null;
                class246.field3683 = -1;
                return true;
            }
            class93 var88 = new class93();
            var88.field1466 = var87;
            var88.field1466 = var85 & 0x3F;
            var88.field1473 = class100.field1580.method1593((byte) 27);
            if (var88.field1473 >= 0 && class112.field1723.length > var88.field1473) {
                if (var88.field1466 == 1 || var88.field1466 == 10) {
                    var88.field1471 = class100.field1580.method1575(false);
                    class100.field1580.field3748 += 5;
                } else if (var88.field1466 >= 2 && var88.field1466 <= 6) {
                    if (var88.field1466 == 2) {
                        var88.field1476 = 64;
                        var88.field1467 = 64;
                    }
                    if (var88.field1466 == 3) {
                        var88.field1476 = 64;
                        var88.field1467 = 0;
                    }
                    if (var88.field1466 == 4) {
                        var88.field1476 = 64;
                        var88.field1467 = 128;
                    }
                    if (var88.field1466 == 5) {
                        var88.field1467 = 64;
                        var88.field1476 = 0;
                    }
                    if (var88.field1466 == 6) {
                        var88.field1467 = 64;
                        var88.field1476 = 128;
                    }
                    var88.field1466 = 2;
                    var88.field1468 = class100.field1580.method1575(false);
                    var88.field1474 = class100.field1580.method1575(false);
                    var88.field1465 = class100.field1580.method1593((byte) 27);
                    var88.field1470 = class100.field1580.method1575(false);
                }
                var88.field1463 = class100.field1580.method1575(false);
                if (var88.field1463 == 65535) {
                    var88.field1463 = -1;
                }
                class101.field1591[var86] = var88;
            }
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 150) {
            class36.method221((byte) -85, class100.field1580.method1597((byte) 100));
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 208) {
            int var89 = class100.field1580.method1575(false);
            int var90 = class100.field1580.method1575(false);
            int var91 = class100.field1580.method1575(false);
            if (class266.method1767(var89, false)) {
                class100.method646(var90, var91, (byte) 119);
            }
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 180) {
            byte[] var92 = new byte[class202.field3050];
            class100.field1580.method1096(class202.field3050, 0, 0, var92);
            String var93 = class115.method743(var92, class202.field3050, 255, 0);
            if (class210.field3152 == null && class12.field165 == 3 || !class12.field155.startsWith("win") || class75.field1216) {
                class41.method275((byte) 49, true, var93);
            } else {
                client.field2373 = var93;
                class235.field3545 = true;
                class273.field4111 = class209.field3147.method66(-98, var93);
            }
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 122) {
            long var94 = class100.field1580.method1608(11119);
            class100.field1580.method1604(arg0 ^ 0x1);
            long var96 = class100.field1580.method1608(arg0 + 11114);
            long var98 = (long) class100.field1580.method1575(false);
            long var100 = (long) class100.field1580.method1587(arg0 ^ 0xFFFFFF84);
            int var102 = class100.field1580.method1593((byte) 27);
            int var103 = class100.field1580.method1575(false);
            boolean var104 = false;
            long var105 = (var98 << 32) + var100;
            int var107 = 0;
            label1279: while (true) {
                if (var107 >= 100) {
                    if (var102 <= 1) {
                        for (int var108 = 0; var108 < class154.field2307; var108++) {
                            if (class35.field493[var108] == var94) {
                                var104 = true;
                                break label1279;
                            }
                        }
                    }
                    break;
                }
                if (class24.field289[var107] == var105) {
                    var104 = true;
                    break;
                }
                var107++;
            }
            if (!var104 && class218.field3280 == 0) {
                class24.field289[class76.field1235] = var105;
                class76.field1235 = (class76.field1235 + 1) % 100;
                String var109 = class231.method1473((byte) -33, var103).method477(class100.field1580, 0);
                if (var102 == 2 || var102 == 3) {
                    class1.method1(0, "<img=1>" + class200.method1255(var94, false), class200.method1255(var96, false), var109, 20, var103);
                } else if (var102 == 1) {
                    class1.method1(0, "<img=0>" + class200.method1255(var94, false), class200.method1255(var96, false), var109, 20, var103);
                } else {
                    class1.method1(arg0 - 5, class200.method1255(var94, false), class200.method1255(var96, false), var109, 20, var103);
                }
            }
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 147) {
            class92.method594(class202.field3050, -29221, class100.field1580, class209.field3147);
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 182) {
            int var110 = class100.field1580.method1570(true);
            int var111 = class100.field1580.method1576(-17672);
            int var112 = class100.field1580.method1575(false);
            int var113 = class100.field1580.method1618(16711680);
            if (class266.method1767(var110, false)) {
                class128.method802((var112 << 16) + var113, var111, 0);
            }
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 38) {
            int var114 = class100.field1580.method1583(-1);
            int var115 = class100.field1580.method1578(arg0 - 7);
            if (var115 == 65535) {
                var115 = -1;
            }
            class225.method1439(var114, var115, arg0 ^ 0x65);
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 212) {
            int var116 = class100.field1580.method1575(false);
            if (var116 == 65535) {
                var116 = -1;
            }
            int var117 = class100.field1580.method1566(-22113);
            int var118 = class100.field1580.method1572(arg0 - 118);
            class92.method588(var118, 101, var117, var116);
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 93) {
            class262.field3975 = class100.field1580.method1593((byte) 27);
            class52.field834 = class100.field1580.method1572(-84);
            while (class202.field3050 > class100.field1580.field3748) {
                class246.field3683 = class100.field1580.method1593((byte) 27);
                class119.method754(1284368036);
            }
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 8) {
            int var119 = class100.field1580.method1618(16711680);
            int var120 = class100.field1580.method1578(-2);
            int var121 = class100.field1580.method1570(true);
            int var122 = class100.field1580.method1582(arg0 - 6);
            int var123 = class100.field1580.method1618(16711680);
            if (class266.method1767(var120, false)) {
                class248.method1581(var122, var123, var121, 32768, var119);
            }
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 68) {
            class283.field4232 = class100.field1580.method1593((byte) 27);
            class190.field2920 = class100.field1580.method1593((byte) 27);
            class91.field1445 = class100.field1580.method1593((byte) 27);
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == arg0) {
            class262.field3975 = class100.field1580.method1593((byte) 27);
            class52.field834 = class100.field1580.method1593((byte) 27);
            for (int var124 = class52.field834; var124 < class52.field834 + 8; var124++) {
                for (int var126 = class262.field3975; var126 < (class262.field3975 + 8); var126++) {
                    if (class251.field3816[class99.field1557][var124][var126] != null) {
                        class251.field3816[class99.field1557][var124][var126] = null;
                        class204.method1296(var126, var124, true);
                    }
                }
            }
            for (class192 var125 = (class192) class228.field3432.method983(arg0 ^ 0x2); var125 != null; var125 = (class192) class228.field3432.method985((byte) 124)) {
                if (class52.field834 <= var125.field2948 && (class52.field834 + 8) > var125.field2948 && class262.field3975 <= var125.field2944 && var125.field2944 < (class262.field3975 + 8) && class99.field1557 == var125.field2955) {
                    var125.field2946 = 0;
                }
            }
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 245) {
            long var127 = class100.field1580.method1608(11119);
            long var129 = (long) class100.field1580.method1575(false);
            boolean var131 = false;
            long var132 = (long) class100.field1580.method1587(-126);
            long var134 = (var129 << 32) + var132;
            int var136 = class100.field1580.method1593((byte) 27);
            int var137 = class100.field1580.method1575(false);
            int var138 = 0;
            label1315: while (true) {
                if (var138 >= 100) {
                    if (var136 <= 1) {
                        for (int var139 = 0; var139 < class154.field2307; var139++) {
                            if (class35.field493[var139] == var127) {
                                var131 = true;
                                break label1315;
                            }
                        }
                    }
                    break;
                }
                if (class24.field289[var138] == var134) {
                    var131 = true;
                    break;
                }
                var138++;
            }
            if (!var131 && class218.field3280 == 0) {
                class24.field289[class76.field1235] = var134;
                class76.field1235 = (class76.field1235 + 1) % 100;
                String var140 = class231.method1473((byte) -33, var137).method477(class100.field1580, 0);
                if (var136 == 2) {
                    class1.method1(0, "<img=1>" + class200.method1255(var127, false), (String) null, var140, 18, var137);
                } else if (var136 == 1) {
                    class1.method1(0, "<img=0>" + class200.method1255(var127, false), (String) null, var140, 18, var137);
                } else {
                    class1.method1(0, class200.method1255(var127, false), (String) null, var140, 18, var137);
                }
            }
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 243) {
            int var141 = class100.field1580.method1618(16711680);
            byte var142 = class100.field1580.method1602((byte) 96);
            class4.method17(7298, var142, var141);
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 197) {
            String var143 = class100.field1580.method1597((byte) -94);
            int var144 = class100.field1580.method1575(false);
            int var145 = class100.field1580.method1570(true);
            if (class266.method1767(var145, false)) {
                class251.method1648(var143, var144, -117);
            }
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 28) {
            long var146 = class100.field1580.method1608(11119);
            int var148 = class100.field1580.method1575(false);
            boolean var149 = false;
            if ((Long.MIN_VALUE & var146) != 0L) {
                var149 = true;
            }
            byte var150 = class100.field1580.method1604(4);
            if (var149) {
                if (class224.field3352 == 0) {
                    class246.field3683 = -1;
                    return true;
                }
                long var156 = var146 & Long.MAX_VALUE;
                boolean var158 = false;
                int var159;
                for (var159 = 0; var159 < class224.field3352 && (class184.field2779[var159].field1321 != var156 || class184.field2779[var159].field2977 != var148); var159++) {
                }
                if (var159 < class224.field3352) {
                    while ((class224.field3352 - 1) > var159) {
                        class184.field2779[var159] = class184.field2779[var159 + 1];
                        var159++;
                    }
                    class224.field3352--;
                    class184.field2779[class224.field3352] = null;
                }
            } else {
                String var151 = class100.field1580.method1597((byte) 87);
                class196 var152 = new class196();
                var152.field1321 = var146;
                var152.field2982 = class98.method632(0, var152.field1321);
                var152.field2981 = var151;
                var152.field2987 = var150;
                var152.field2977 = var148;
                int var153;
                for (var153 = class224.field3352 - 1; var153 >= 0; var153--) {
                    int var154 = class184.field2779[var153].field2982.compareTo(var152.field2982);
                    if (var154 == 0) {
                        class184.field2779[var153].field2977 = var148;
                        class184.field2779[var153].field2987 = var150;
                        class184.field2779[var153].field2981 = var151;
                        class187.field2847 = class68.field1077;
                        class246.field3683 = -1;
                        if (class209.field3150 == var146) {
                            class293.field4624 = var150;
                        }
                        return true;
                    }
                    if (var154 < 0) {
                        break;
                    }
                }
                if (class184.field2779.length <= class224.field3352) {
                    class246.field3683 = -1;
                    return true;
                }
                for (int var155 = class224.field3352 - 1; var155 > var153; var155--) {
                    class184.field2779[var155 + 1] = class184.field2779[var155];
                }
                if (class224.field3352 == 0) {
                    class184.field2779 = new class196[100];
                }
                class184.field2779[var153 + 1] = var152;
                if (class209.field3150 == var146) {
                    class293.field4624 = var150;
                }
                class224.field3352++;
            }
            class187.field2847 = class68.field1077;
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 129) {
            int var160 = class100.field1580.method1576(-17672);
            int var161 = class100.field1580.method1575(false);
            if (class266.method1767(var161, false)) {
                int var162 = 0;
                if (class165.field2537.field1670 != null) {
                    var162 = class165.field2537.field1670.method525((byte) 72);
                }
                class102.method655(3, var162, (byte) 90, var160, -1);
            }
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 61) {
            int var163 = class100.field1580.method1578(-2);
            int var164 = class100.field1580.method1570(true);
            int var165 = class100.field1580.method1570(true);
            int var166 = class100.field1580.method1582(-1);
            if ((var166 >> 30) != 0) {
                int var191 = ((var166 & 0xFFFD6BB) >> 14) - class81.field1303;
                int var192 = (var166 & 0x3FFF) - class147.field2141;
                int var193 = var166 >> 28 & 0x3;
                if (var191 >= 0 && var192 >= 0 && var191 < 104 && var192 < 104) {
                    int var194 = var192 * 128 + 64;
                    int var195 = var191 * 128 + 64;
                    class106 var196 = new class106(var164, var193, var195, var194, class183.method1139(var193, var194, var195, (byte) 117) - var163, var165, class270.field4058);
                    class239.field3595.method987(new class83(var196), (byte) -121);
                }
            } else if (var166 >> 29 != 0) {
                int var179 = var166 & 0xFFFF;
                class61 var180 = class18.field220[var179];
                if (var180 != null) {
                    if (var164 == 65535) {
                        var164 = -1;
                    }
                    boolean var181 = true;
                    if (var164 != -1 && var180.field2230 != -1) {
                        if (var180.field2230 == var164) {
                            class21 var186 = class236.method1498((byte) -118, var164);
                            if (var186.field256 && var186.field249 != -1) {
                                class215 var187 = class276.method1829(var186.field249, arg0 ^ 0x7222);
                                int var188 = var187.field3220;
                                if (var188 == 1) {
                                    var180.field2218 = 0;
                                    var180.field2201 = 0;
                                    var180.field2249 = 0;
                                    var180.field2280 = class270.field4058 + var165;
                                    var181 = false;
                                    var180.field2272 = 1;
                                    client.method966((byte) 52, var180.field2201, false, var180.field2234, var187, var180.field2251);
                                } else if (var188 == 2) {
                                    var181 = false;
                                    var180.field2270 = 0;
                                }
                            }
                        } else {
                            class21 var182 = class236.method1498((byte) -105, var164);
                            class21 var183 = class236.method1498((byte) -128, var180.field2230);
                            if (var182.field249 != -1 && var183.field249 != -1) {
                                class215 var184 = class276.method1829(var182.field249, 29223);
                                class215 var185 = class276.method1829(var183.field249, arg0 ^ 0x7222);
                                if (var184.field3227 < var185.field3227) {
                                    var181 = false;
                                }
                            }
                        }
                    }
                    if (var181) {
                        var180.field2201 = 0;
                        var180.field2221 = var163;
                        var180.field2280 = class270.field4058 + var165;
                        if (var180.field2280 > class270.field4058) {
                            var180.field2201 = -1;
                        }
                        var180.field2230 = var164;
                        var180.field2218 = 0;
                        var180.field2272 = 1;
                        if (var180.field2230 != -1 && class270.field4058 == var180.field2280) {
                            int var189 = class236.method1498((byte) -107, var180.field2230).field249;
                            if (var189 != -1) {
                                class215 var190 = class276.method1829(var189, arg0 ^ 0x7222);
                                if (var190 != null && var190.field3215 != null) {
                                    client.method966((byte) 52, 0, false, var180.field2234, var190, var180.field2251);
                                }
                            }
                        }
                    }
                }
            } else if ((var166 >> 28) != 0) {
                int var167 = var166 & 0xFFFF;
                class107 var168;
                if (class221.field3334 == var167) {
                    var168 = class165.field2537;
                } else {
                    var168 = class96.field1521[var167];
                }
                if (var168 != null) {
                    if (var164 == 65535) {
                        var164 = -1;
                    }
                    boolean var169 = true;
                    if (var164 != -1 && var168.field2230 != -1) {
                        if (var168.field2230 == var164) {
                            class21 var174 = class236.method1498((byte) -113, var164);
                            if (var174.field256 && var174.field249 != -1) {
                                class215 var175 = class276.method1829(var174.field249, 29223);
                                int var176 = var175.field3220;
                                if (var176 == 1) {
                                    var168.field2201 = 0;
                                    var168.field2280 = class270.field4058 + var165;
                                    var168.field2249 = 0;
                                    var168.field2272 = 1;
                                    var169 = false;
                                    var168.field2218 = 0;
                                    client.method966((byte) 52, var168.field2201, false, var168.field2234, var175, var168.field2251);
                                } else if (var176 == 2) {
                                    var169 = false;
                                    var168.field2270 = 0;
                                }
                            }
                        } else {
                            class21 var170 = class236.method1498((byte) -124, var164);
                            class21 var171 = class236.method1498((byte) -115, var168.field2230);
                            if (var170.field249 != -1 && var171.field249 != -1) {
                                class215 var172 = class276.method1829(var170.field249, 29223);
                                class215 var173 = class276.method1829(var171.field249, 29223);
                                if (var173.field3227 > var172.field3227) {
                                    var169 = false;
                                }
                            }
                        }
                    }
                    if (var169) {
                        var168.field2221 = var163;
                        var168.field2218 = 0;
                        var168.field2272 = 1;
                        var168.field2230 = var164;
                        var168.field2201 = 0;
                        var168.field2280 = class270.field4058 + var165;
                        if (class270.field4058 < var168.field2280) {
                            var168.field2201 = -1;
                        }
                        if (var168.field2230 == 65535) {
                            var168.field2230 = -1;
                        }
                        if (var168.field2230 != -1 && class270.field4058 == var168.field2280) {
                            int var177 = class236.method1498((byte) -121, var168.field2230).field249;
                            if (var177 != -1) {
                                class215 var178 = class276.method1829(var177, arg0 + 29218);
                                if (var178 != null && var178.field3215 != null) {
                                    client.method966((byte) 52, 0, class165.field2537 == var168, var168.field2234, var178, var168.field2251);
                                }
                            }
                        }
                    }
                }
            }
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 135) {
            int var197 = class100.field1580.method1575(false);
            int var198 = class100.field1580.method1618(16711680);
            int var199 = class100.field1580.method1572(-76);
            class61 var200 = class18.field220[var197];
            if (var200 != null) {
                class196.method1226(var199, var200, var198, -1);
            }
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 11) {
            int var201 = class100.field1580.method1572(-87);
            int var202 = class100.field1580.method1578(-2);
            class70.method468(var202, var201, (byte) -84);
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 239) {
            class52.field834 = class100.field1580.method1571((byte) -114);
            class262.field3975 = class100.field1580.method1572(-78);
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 60) {
            if (class202.field3050 == 0) {
                class213.field3189 = class206.field3084;
            } else {
                class213.field3189 = class100.field1580.method1597((byte) 119);
            }
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 154) {
            int var203 = class100.field1580.method1571((byte) -92);
            int var204 = var203 >> 2;
            int var205 = var203 & 0x3;
            int var206 = class293.field4607[var204];
            int var207 = class100.field1580.method1618(16711680);
            int var208 = class100.field1580.method1582(-1);
            if (var207 == 65535) {
                var207 = -1;
            }
            int var209 = (var208 & 0xFFFCB57) >> 14;
            int var210 = var208 >> 28 & 0x3;
            int var211 = var209 - class81.field1303;
            int var212 = var208 & 0x3FFF;
            int var213 = var212 - class147.field2141;
            class178.method1109(var204, var210, var205, var213, (byte) 124, var207, var206, var211);
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 215) {
            class237.method1506(arg0 - 5);
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 210) {
            if (class136.field1987 != -1) {
                class273.method1811(true, class136.field1987, 0);
            }
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 153) {
            int var214 = class100.field1580.method1615(false);
            int var215 = class100.field1580.method1578(-2);
            int var216 = class100.field1580.method1590((byte) -56);
            if (class266.method1767(var215, false)) {
                class199 var217 = (class199) class229.field3449.method1666((long) var216, (byte) 88);
                class199 var218 = (class199) class229.field3449.method1666((long) var214, (byte) 87);
                if (var218 != null) {
                    class80.method528(var218, var217 == null || var217.field3026 != var218.field3026, (byte) 32);
                }
                if (var217 != null) {
                    var217.method538(arg0 + 97);
                    class229.field3449.method1663((long) var214, var217, -76);
                }
                class289 var219 = class89.method574((byte) -15, var216);
                if (var219 != null) {
                    class295.method1980(var219, 0);
                }
                class289 var220 = class89.method574((byte) -15, var214);
                if (var220 != null) {
                    class295.method1980(var220, 0);
                    class163.method1010(true, var220, true);
                }
                if (class136.field1987 != -1) {
                    class273.method1811(true, class136.field1987, 1);
                }
            }
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 223) {
            long var221 = class100.field1580.method1608(arg0 + 11114);
            int var223 = class100.field1580.method1575(false);
            boolean var224 = true;
            int var225 = class100.field1580.method1593((byte) 27);
            String var226 = "";
            if (var221 < 0L) {
                var224 = false;
                var221 &= Long.MAX_VALUE;
            }
            if (var223 > 0) {
                var226 = class100.field1580.method1597((byte) -34);
            }
            String var227 = class200.method1255(var221, false);
            for (int var228 = 0; var228 < class150.field2164; var228++) {
                if (class259.field3944[var228] == var221) {
                    if (class285.field4275[var228] != var223) {
                        class285.field4275[var228] = var223;
                        if (var223 > 0) {
                            class48.method321(5, "", var227 + class127.field1916, -121);
                        }
                        if (var223 == 0) {
                            class48.method321(5, "", var227 + class288.field4354, 33);
                        }
                    }
                    var227 = null;
                    class128.field1917[var228] = var226;
                    class223.field3344[var228] = var225;
                    class32.field462[var228] = var224;
                    break;
                }
            }
            if (var227 != null && class150.field2164 < 200) {
                class259.field3944[class150.field2164] = var221;
                class7.field114[class150.field2164] = var227;
                class285.field4275[class150.field2164] = var223;
                class128.field1917[class150.field2164] = var226;
                class223.field3344[class150.field2164] = var225;
                class32.field462[class150.field2164] = var224;
                class150.field2164++;
            }
            int var229 = class150.field2164;
            boolean var230 = false;
            class112.field1724 = class68.field1077;
            while (var229 > 0) {
                boolean var231 = true;
                var229--;
                for (int var232 = 0; var232 < var229; var232++) {
                    if (class285.field4275[var232] != class91.field1434 && class285.field4275[var232 + 1] == class91.field1434 || class285.field4275[var232] == 0 && class285.field4275[var232 + 1] != 0) {
                        int var233 = class285.field4275[var232];
                        var231 = false;
                        class285.field4275[var232] = class285.field4275[var232 + 1];
                        class285.field4275[var232 + 1] = var233;
                        String var234 = class128.field1917[var232];
                        class128.field1917[var232] = class128.field1917[var232 + 1];
                        class128.field1917[var232 + 1] = var234;
                        String var235 = class7.field114[var232];
                        class7.field114[var232] = class7.field114[var232 + 1];
                        class7.field114[var232 + 1] = var235;
                        long var236 = class259.field3944[var232];
                        class259.field3944[var232] = class259.field3944[var232 + 1];
                        class259.field3944[var232 + 1] = var236;
                        int var238 = class223.field3344[var232];
                        class223.field3344[var232] = class223.field3344[var232 + 1];
                        class223.field3344[var232 + 1] = var238;
                        boolean var239 = class32.field462[var232];
                        class32.field462[var232] = class32.field462[var232 + 1];
                        class32.field462[var232 + 1] = var239;
                    }
                }
                if (var231) {
                    break;
                }
            }
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 7) {
            int var240 = class100.field1580.method1570(true);
            int var241 = class100.field1580.method1575(false);
            int var242 = class100.field1580.method1570(true);
            int var243 = class100.field1580.method1578(-2);
            int var244 = class100.field1580.method1590((byte) -102);
            if (class266.method1767(var241, false)) {
                class102.method655(7, var240 | var242 << 16, (byte) 90, var244, var243);
            }
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 82) {
            class151.method914(true, true);
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 216) {
            class99.method640((byte) -13);
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 226) {
            int var245 = class100.field1580.method1571((byte) -104);
            int var246 = class100.field1580.method1575(false);
            if (var246 == 65535) {
                var246 = -1;
            }
            int var247 = class100.field1580.method1571((byte) -109);
            String var248 = class100.field1580.method1597((byte) -29);
            if (var247 >= 1 && var247 <= 8) {
                if (var248.equalsIgnoreCase("null")) {
                    var248 = null;
                }
                class72.field1138[var247 - 1] = var248;
                class91.field1444[var247 - 1] = var246;
                class241.field3627[var247 - 1] = var245 == 0;
            }
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 118) {
            class227.method1447(arg0);
            class118.field1783 = class100.field1580.method1593((byte) 27);
            class246.field3683 = -1;
            class16.field189 = class68.field1077;
            return true;
        } else if (class246.field3683 == 214) {
            String var249 = class100.field1580.method1597((byte) 91);
            int var250 = class100.field1580.method1618(16711680);
            int var251 = class100.field1580.method1578(arg0 ^ 0xFFFFFFFB);
            if (class266.method1767(var251, false)) {
                class251.method1648(var249, var250, 94);
            }
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 115) {
            int var252 = class100.field1580.method1575(false);
            int var253 = class100.field1580.method1593((byte) 27);
            int var254 = class100.field1580.method1593((byte) 27);
            int var255 = class100.field1580.method1575(false);
            int var256 = class100.field1580.method1593((byte) 27);
            int var257 = class100.field1580.method1593((byte) 27);
            if (class266.method1767(var252, false)) {
                class186.method1158(var255, (byte) 107, var254, var253, var257, var256, true);
            }
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 136) {
            int var258 = class100.field1580.method1576(-17672);
            class289 var259 = class89.method574((byte) -15, var258);
            for (int var260 = 0; var260 < var259.field4513.length; var260++) {
                var259.field4513[var260] = -1;
                var259.field4513[var260] = 0;
            }
            class295.method1980(var259, 0);
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 164) {
            int var261 = class100.field1580.method1593((byte) 27);
            if (class100.field1580.method1593((byte) 27) == 0) {
                class143.field2093[var261] = new class84();
            } else {
                class100.field1580.field3748--;
                class143.field2093[var261] = new class84(class100.field1580);
            }
            class20.field230 = class68.field1077;
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 186) {
            class56.field892 = 0;
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 176) {
            class281.method1858(arg0 ^ 0xFFFFFFFA);
            class246.field3683 = -1;
            return false;
        } else if (class246.field3683 == 34) {
            long var262 = class100.field1580.method1608(arg0 + 11114);
            int var264 = class100.field1580.method1575(false);
            String var265 = class231.method1473((byte) -33, var264).method477(class100.field1580, 0);
            class1.method1(0, class200.method1255(var262, false), (String) null, var265, 19, var264);
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 62) {
            String var266 = class100.field1580.method1597((byte) 113);
            if (var266.endsWith(":tradereq:")) {
                boolean var267 = false;
                String var268 = var266.substring(0, var266.indexOf(":"));
                long var269 = class94.method604((byte) -105, var268);
                for (int var271 = 0; var271 < class154.field2307; var271++) {
                    if (class35.field493[var271] == var269) {
                        var267 = true;
                        break;
                    }
                }
                if (!var267 && class218.field3280 == 0) {
                    class48.method321(4, var268, class107.field1644, 20);
                }
            } else if (var266.endsWith(":chalreq:")) {
                String var301 = var266.substring(0, var266.indexOf(":"));
                boolean var302 = false;
                long var303 = class94.method604((byte) -126, var301);
                for (int var305 = 0; var305 < class154.field2307; var305++) {
                    if (class35.field493[var305] == var303) {
                        var302 = true;
                        break;
                    }
                }
                if (!var302 && class218.field3280 == 0) {
                    String var306 = var266.substring(var266.indexOf(":") + 1, var266.length() - 9);
                    class48.method321(8, var301, var306, arg0 ^ 0xFFFFFF97);
                }
            } else if (var266.endsWith(":assistreq:")) {
                String var272 = var266.substring(0, var266.indexOf(":"));
                long var273 = class94.method604((byte) 89, var272);
                boolean var275 = false;
                for (int var276 = 0; var276 < class154.field2307; var276++) {
                    if (class35.field493[var276] == var273) {
                        var275 = true;
                        break;
                    }
                }
                if (!var275 && class218.field3280 == 0) {
                    class48.method321(10, var272, "", 90);
                }
            } else if (var266.endsWith(":clan:")) {
                String var300 = var266.substring(0, var266.indexOf(":clan:"));
                class48.method321(11, "", var300, 47);
            } else if (var266.endsWith(":trade:")) {
                String var277 = var266.substring(0, var266.indexOf(":trade:"));
                if (class218.field3280 == 0) {
                    class48.method321(12, "", var277, arg0 ^ 0x13);
                }
            } else if (var266.endsWith(":assist:")) {
                String var299 = var266.substring(0, var266.indexOf(":assist:"));
                if (class218.field3280 == 0) {
                    class48.method321(13, "", var299, -102);
                }
            } else if (var266.endsWith(":duelstake:")) {
                String var278 = var266.substring(0, var266.indexOf(":"));
                long var279 = class94.method604((byte) 116, var278);
                boolean var281 = false;
                for (int var282 = 0; var282 < class154.field2307; var282++) {
                    if (class35.field493[var282] == var279) {
                        var281 = true;
                        break;
                    }
                }
                if (!var281 && class218.field3280 == 0) {
                    class48.method321(14, var278, "", -110);
                }
            } else if (var266.endsWith(":duelfriend:")) {
                String var294 = var266.substring(0, var266.indexOf(":"));
                long var295 = class94.method604((byte) 77, var294);
                boolean var297 = false;
                for (int var298 = 0; var298 < class154.field2307; var298++) {
                    if (class35.field493[var298] == var295) {
                        var297 = true;
                        break;
                    }
                }
                if (!var297 && class218.field3280 == 0) {
                    class48.method321(15, var294, "", arg0 ^ 0xFFFFFF95);
                }
            } else if (var266.endsWith(":clanreq:")) {
                String var283 = var266.substring(0, var266.indexOf(":"));
                long var284 = class94.method604((byte) 115, var283);
                boolean var286 = false;
                for (int var287 = 0; var287 < class154.field2307; var287++) {
                    if (class35.field493[var287] == var284) {
                        var286 = true;
                        break;
                    }
                }
                if (!var286 && class218.field3280 == 0) {
                    class48.method321(16, var283, "", arg0 ^ 0x10);
                }
            } else if (var266.endsWith(":allyreq:")) {
                String var288 = var266.substring(0, var266.indexOf(":"));
                long var289 = class94.method604((byte) 116, var288);
                boolean var291 = false;
                for (int var292 = 0; var292 < class154.field2307; var292++) {
                    if (class35.field493[var292] == var289) {
                        var291 = true;
                        break;
                    }
                }
                if (!var291 && class218.field3280 == 0) {
                    String var293 = var266.substring(var266.indexOf(":") + 1, var266.length() + -9);
                    class48.method321(21, var288, var293, -109);
                }
            } else {
                class48.method321(0, "", var266, 34);
            }
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 116) {
            int var307 = class100.field1580.method1572(arg0 ^ 0xFFFFFF92);
            int var308 = class100.field1580.method1593((byte) 27);
            int var309 = class100.field1580.method1571((byte) -92);
            class99.field1557 = var309 >> 1;
            class165.field2537.method677(-126, (var309 & 0x1) == 1, var308, var307);
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 95) {
            int var310 = class100.field1580.method1618(arg0 + 16711675);
            int var311 = class100.field1580.method1578(arg0 ^ 0xFFFFFFFB);
            if (var311 == 65535) {
                var311 = -1;
            }
            int var312 = class100.field1580.method1576(-17672);
            if (class266.method1767(var310, false)) {
                class102.method655(2, var311, (byte) 90, var312, -1);
            }
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 37) {
            int var313 = class100.field1580.method1615(false);
            int var314 = class100.field1580.method1570(true);
            int var315 = class100.field1580.method1618(16711680);
            if (var315 == 65535) {
                var315 = -1;
            }
            int var316 = class100.field1580.method1576(-17672);
            if (class266.method1767(var314, false)) {
                class289 var317 = class89.method574((byte) -15, var313);
                if (var317.field4495) {
                    class286.method1881((byte) 88, var313, var316, var315);
                    class43 var319 = class160.method999(var315, 0);
                    class248.method1581(var313, var319.field623, var319.field665, 32768, var319.field649);
                    class247.method1552(var313, var319.field650, arg0 ^ 0x4, var319.field660, var319.field658);
                } else if (var315 == -1) {
                    class246.field3683 = -1;
                    var317.field4453 = 0;
                    return true;
                } else {
                    class43 var318 = class160.method999(var315, 0);
                    var317.field4453 = 4;
                    var317.field4459 = var315;
                    var317.field4480 = var318.field665 * 100 / var316;
                    var317.field4531 = var318.field649;
                    var317.field4434 = var318.field623;
                    class295.method1980(var317, 0);
                }
            }
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 113) {
            int var320 = class100.field1580.method1570(true);
            int var321 = class100.field1580.method1582(-1);
            int var322 = class100.field1580.method1578(arg0 ^ 0xFFFFFFFB);
            if (var320 == 65535) {
                var320 = -1;
            }
            if (class266.method1767(var322, false)) {
                class102.method655(1, var320, (byte) 90, var321, -1);
            }
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 105) {
            class100.field1580.field3748 += 28;
            if (class100.field1580.method1560(0)) {
                class217.method1390((byte) -19, class100.field1580.field3748 - 28, class100.field1580);
            }
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 48) {
            class151.method914(false, true);
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 15) {
            int var323 = class100.field1580.method1582(-1);
            int var324 = class100.field1580.method1575(false);
            int var325 = class100.field1580.method1615(false);
            int var326 = class100.field1580.method1578(-2);
            if (var326 == 65535) {
                var326 = -1;
            }
            if (var324 == 65535) {
                var324 = -1;
            }
            int var327 = class100.field1580.method1618(16711680);
            if (class266.method1767(var327, false)) {
                for (int var328 = var324; var328 <= var326; var328++) {
                    long var329 = ((long) var323 << 32) + ((long) var328);
                    class268 var331 = (class268) class221.field3326.method1666(var329, (byte) 49);
                    class268 var332;
                    if (var331 != null) {
                        var332 = new class268(var325, var331.field4035);
                        var331.method538(arg0 + 78);
                    } else if (var328 == -1) {
                        var332 = new class268(var325, class89.method574((byte) -15, var323).field4529.field4035);
                    } else {
                        var332 = new class268(var325, -1);
                    }
                    class221.field3326.method1663(var329, var332, -73);
                }
            }
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 219) {
            int var333 = class100.field1580.method1578(-2);
            int var334 = class100.field1580.method1590((byte) -101);
            class4.method17(arg0 + 7293, var334, var333);
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 247) {
            class205.field3077 = class100.field1580.method1570(true) * 30;
            class16.field189 = class68.field1077;
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 132) {
            int var335 = class100.field1580.method1582(-1);
            int var336 = class100.field1580.method1578(-2);
            int var337 = class100.field1580.method1618(arg0 ^ 0xFF0005);
            if (class266.method1767(var336, false)) {
                class198.method1244(var335, 39, var337);
            }
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 241) {
            int var338 = class100.field1580.method1590((byte) -76);
            int var339 = class100.field1580.method1570(true);
            int var340 = class100.field1580.method1618(arg0 ^ 0xFF0005);
            if (class266.method1767(var339, false)) {
                class247.method1556(var340, (byte) 89, var338);
            }
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 194) {
            int var341 = class100.field1580.method1564((byte) -17);
            int var342 = class100.field1580.method1575(false);
            int var343 = class100.field1580.method1564((byte) -17);
            int var344 = class100.field1580.method1615(false);
            if (class266.method1767(var342, false)) {
                class277.method1835(var343, var341, var344, (byte) 114);
            }
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 72) {
            int var345 = class100.field1580.method1571((byte) -105);
            int var346 = class100.field1580.method1578(-2);
            if (class266.method1767(var346, false)) {
                class71.field1133 = var345;
            }
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 202) {
            class227.method1447(5);
            int var347 = class100.field1580.method1593((byte) 27);
            int var348 = class100.field1580.method1590((byte) -99);
            int var349 = class100.field1580.method1593((byte) 27);
            class93.field1481[var347] = var348;
            class231.field3479[var347] = var349;
            class155.field2327[var347] = 1;
            for (int var350 = 0; var350 < 98; var350++) {
                if (var348 >= class254.field3867[var350]) {
                    class155.field2327[var347] = var350 + 2;
                }
            }
            class177.field2705[class94.method598(class159.field2440++, 31)] = var347;
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 158) {
            int var351 = class100.field1580.method1575(false);
            if (class266.method1767(var351, false)) {
                class137.method838(arg0 - 11639);
            }
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 22) {
            long var352 = class100.field1580.method1608(11119);
            long var354 = (long) class100.field1580.method1575(false);
            long var356 = (long) class100.field1580.method1587(-124);
            boolean var358 = false;
            long var359 = (var354 << 32) + var356;
            int var361 = class100.field1580.method1593((byte) 27);
            int var362 = 0;
            label1513: while (true) {
                if (var362 >= 100) {
                    if (var361 <= 1) {
                        if ((!class85.field1354 || class41.field610) && !class116.field1762) {
                            for (int var363 = 0; var363 < class154.field2307; var363++) {
                                if (class35.field493[var363] == var352) {
                                    var358 = true;
                                    break label1513;
                                }
                            }
                        } else {
                            var358 = true;
                        }
                    }
                    break;
                }
                if (class24.field289[var362] == var359) {
                    var358 = true;
                    break;
                }
                var362++;
            }
            if (!var358 && class218.field3280 == 0) {
                class24.field289[class76.field1235] = var359;
                class76.field1235 = (class76.field1235 + 1) % 100;
                String var364 = class164.method1021(class2.method9(class210.method1346(class100.field1580, false), 1207));
                if (var361 == 2 || var361 == 3) {
                    class48.method321(7, "<img=1>" + class200.method1255(var352, false), var364, -104);
                } else if (var361 == 1) {
                    class48.method321(7, "<img=0>" + class200.method1255(var352, false), var364, 72);
                } else {
                    class48.method321(3, class200.method1255(var352, false), var364, -109);
                }
            }
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 173) {
            int var365 = class100.field1580.method1570(true);
            class126.method791(var365, arg0 ^ 0x5);
            class217.field3269[class94.method598(31, class268.field4041++)] = class94.method598(var365, 32767);
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 228) {
            class214.field3211 = class100.field1580.method1593((byte) 27);
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 111 || class246.field3683 == 26 || class246.field3683 == 92 || class246.field3683 == 203 || class246.field3683 == 237 || class246.field3683 == 131 || class246.field3683 == 199 || class246.field3683 == 218 || class246.field3683 == 230 || class246.field3683 == 29 || class246.field3683 == 134 || class246.field3683 == 63 || class246.field3683 == 45 || class246.field3683 == 67) {
            class119.method754(1284368036);
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 108) {
            int var366 = class100.field1580.method1576(arg0 - 17677);
            String var367 = class100.field1580.method1597((byte) -63);
            int var368 = class100.field1580.method1578(-2);
            if (class266.method1767(var368, false)) {
                class98.method631(var366, var367, -128);
            }
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 106) {
            class227.method1447(5);
            class234.field3535 = class100.field1580.method1606((byte) 77);
            class246.field3683 = -1;
            class16.field189 = class68.field1077;
            return true;
        } else if (class246.field3683 == 85) {
            long var369 = class100.field1580.method1608(arg0 + 11114);
            String var371 = class164.method1021(class2.method9(class210.method1346(class100.field1580, false), arg0 + 1202));
            class48.method321(6, class200.method1255(var369, false), var371, arg0 - 124);
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 235) {
            int var372 = class100.field1580.method1618(16711680);
            int var373 = class100.field1580.method1593((byte) 27);
            int var374 = class100.field1580.method1618(16711680);
            int var375 = class100.field1580.method1576(-17672);
            if (class266.method1767(var374, false)) {
                class199 var376 = (class199) class229.field3449.method1666((long) var375, (byte) -124);
                if (var376 != null) {
                    class80.method528(var376, var376.field3026 != var372, (byte) 97);
                }
                class206.method1304(var373, var372, var375, -2003);
            }
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 195) {
            int var377 = class100.field1580.method1575(false);
            int var378 = class100.field1580.method1593((byte) 27);
            int var379 = class100.field1580.method1593((byte) 27);
            int var380 = class100.field1580.method1593((byte) 27);
            int var381 = class100.field1580.method1593((byte) 27);
            int var382 = class100.field1580.method1575(false);
            if (class266.method1767(var377, false)) {
                class49.field789[var378] = true;
                class132.field1938[var378] = var379;
                class264.field3991[var378] = var380;
                class102.field1601[var378] = var381;
                class287.field4296[var378] = var382;
            }
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 250) {
            int var383 = class100.field1580.method1618(16711680);
            int var384 = class100.field1580.method1582(arg0 ^ 0xFFFFFFFA);
            class70.method468(var383, var384, (byte) -124);
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 102) {
            int var385 = class100.field1580.method1575(false);
            int var386 = class100.field1580.method1576(-17672);
            if (class266.method1767(var385, false)) {
                class199 var387 = (class199) class229.field3449.method1666((long) var386, (byte) 112);
                if (var387 != null) {
                    class80.method528(var387, true, (byte) 50);
                }
                if (class224.field3355 != null) {
                    class295.method1980(class224.field3355, 0);
                    class224.field3355 = null;
                }
            }
            class246.field3683 = -1;
            return true;
        } else if (class246.field3683 == 213) {
            class154.field2307 = class202.field3050 / 8;
            for (int var388 = 0; var388 < class154.field2307; var388++) {
                class35.field493[var388] = class100.field1580.method1608(11119);
                class71.field1130[var388] = class86.method566(class35.field493[var388], -15715);
                class27.field335[var388] = false;
            }
            class246.field3683 = -1;
            class112.field1724 = class68.field1077;
            return true;
        } else if (class246.field3683 == 125) {
            class122.method774(0);
            class227.method1447(5);
            class246.field3683 = -1;
            class26.field323 += 32;
            return true;
        } else if (class246.field3683 == 58) {
            int var389 = class100.field1580.method1618(16711680);
            int var390 = class100.field1580.method1583(arg0 - 6);
            int var391 = class100.field1580.method1570(true);
            if (class266.method1767(var389, false)) {
                if (var390 == 2) {
                    class273.method1807(23752);
                }
                class136.field1987 = var391;
                class235.method1492(var391, (byte) 28);
                class282.method1859((byte) -39, false);
                class160.method997(class136.field1987, 29283);
                for (int var392 = 0; var392 < 100; var392++) {
                    class7.field105[var392] = true;
                }
            }
            class246.field3683 = -1;
            return true;
        } else {
            class275.method1822("T1 - " + class246.field3683 + "," + class85.field1366 + "," + class136.field1990 + " - " + class202.field3050, (byte) -125, (Throwable) null);
            class281.method1858(-1);
            return true;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public abstract void method44(byte arg0, Component arg1);

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method42(Component arg0, int arg1);

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(B)V")
    public static final void method1736(byte arg0) {
        if (arg0 != 5) {
            method1738((byte) -64);
        }
        field3937++;
        class97.field1526.method1782(0);
        class46.field751.method1782(0);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lpf;II)Luf;")
    public static final class176 method1737(class294 arg0, int arg1, int arg2) {
        field3933++;
        byte[] var3 = arg0.method1942(arg1, 27157);
        if (var3 == null) {
            return null;
        } else {
            int var4 = 31 % ((72 - arg2) / 43);
            return new class176(var3);
        }
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(I)I")
    public abstract int method43(int arg0);

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(B)V")
    public static void method1738(byte arg0) {
        field3941 = null;
        int var1 = -64 % ((arg0 + 34) / 53);
        field3939 = null;
        field3936 = null;
    }
}
