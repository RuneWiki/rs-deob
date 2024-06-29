import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.util.GregorianCalendar;
import nativeadvert.browsercontrol;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class239 {

    @OriginalMember(owner = "client!client", name = "S", descriptor = "Le;")
    private static class191 field1729 = class54.method368("Continue", 2047);

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "[I")
    public static int[] field1736 = new int[5];

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "[S")
    public static short[] field1745 = new short[] { 29, 43, 46, 23, 38, 24, 36, 31 };

    @OriginalMember(owner = "client!client", name = "X", descriptor = "Le;")
    public static class191 field1734 = field1729;

    @OriginalMember(owner = "client!client", name = "P", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    public static int field1727;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field1728;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field1733;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field1738;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field1741;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field1742;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field1744;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field1747;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "Lng;")
    public static class121 field1731;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
    public final void method657(int arg0) {
        field1742++;
        if (class47.field836 == 1000) {
            return;
        }
        if (arg0 < 31) {
            field1736 = null;
        }
        boolean var2 = class256.method1771(2);
        boolean var3 = false;
        if (var2 && class141.field2360 && class199.field3539 != null) {
            class199.field3539.method350(true);
        }
        if (class47.field836 == 30 || class47.field836 == 10) {
            if (class268.field4728) {
                class253.method1756(false);
            } else if (class75.field1279 != 0L && class75.field1279 < class27.method198((byte) -125)) {
                class253.method1756(false);
            }
        }
        if (class33.field489 != 0L && class27.method198((byte) -128) > class33.field489 && class263.field4670 != null && (class47.field836 == 30 || class47.field836 == 25)) {
            class141.method927((byte) -59);
        }
        if (class163.field2761) {
            var3 = true;
            class163.field2761 = false;
        }
        if (var3) {
            class119.method791((byte) 71);
        }
        if (class47.field836 == 0) {
            class106.method684((Color) null, var3, -2343, class185.field3237, class134.field2245);
        } else if (class47.field836 == 5) {
            class65.method431(class230.field4128, 3);
        } else if (class47.field836 == 10) {
            class105.method674(0);
        } else if (class47.field836 == 25 || class47.field836 == 28) {
            if (class73.field1270 == 1) {
                if (class100.field1600 > class11.field124) {
                    class11.field124 = class100.field1600;
                }
                int var4 = (class11.field124 - class100.field1600) * 50 / class11.field124;
                class40.method270(false, 0, class228.method1629(new class191[] { class233.field4163, class229.field4120, class92.method563(-110, var4), class68.field1185 }, (byte) -114));
            } else if (class73.field1270 == 2) {
                if (class122.field2027 < class47.field839) {
                    class122.field2027 = class47.field839;
                }
                int var5 = (class122.field2027 - class47.field839) * 50 / class122.field2027 + 50;
                class40.method270(false, 0, class228.method1629(new class191[] { class233.field4163, class229.field4120, class92.method563(-124, var5), class68.field1185 }, (byte) -101));
            } else {
                class40.method270(false, 0, class233.field4163);
            }
        } else if (class47.field836 == 30) {
            class181.method1224((byte) -112);
        } else if (class47.field836 == 40) {
            class40.method270(false, 0, class228.method1629(new class191[] { class23.field326, class239.field4227, class95.field1543 }, (byte) -64));
        }
        if ((class47.field836 == 30 || class47.field836 == 10) && class224.field3991 == 0 && !var3) {
            try {
                Graphics var6 = class51.field909.getGraphics();
                for (int var7 = 0; var7 < class239.field4257; var7++) {
                    if (class87.field1428[var7]) {
                        class42.field740.method155(var6, 32767, class97.field1570[var7], class61.field1108[var7], class86.field1420[var7], class181.field3101[var7]);
                        class87.field1428[var7] = false;
                    }
                }
            } catch (Exception var14) {
                class51.field909.repaint();
            }
        } else if (class47.field836 != 0) {
            try {
                Graphics var8 = class51.field909.getGraphics();
                class42.field740.method156(true, 0, 0, var8);
                for (int var9 = 0; var9 < class239.field4257; var9++) {
                    class87.field1428[var9] = false;
                }
            } catch (Exception var13) {
                class51.field909.repaint();
            }
        }
        if (class16.field218) {
            class22.method163(-127);
        }
        if (!browsercontrol.iscreated() || class213.field3764 == 0) {
            return;
        }
        try {
            Point var10 = class51.field909.getLocationOnScreen();
            Dimension var11 = class51.field909.getSize();
            browsercontrol.set_position(var10.x, var10.y - class213.field3764, var11.width, class213.field3764);
        } catch (Exception var12) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Leg;IIIIIII)V")
    public static final void method658(class33[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class33 var9 = arg0[var8];
            if (var9 != null && var9.field478 == arg1 && (!var9.field591 || var9.field493 == 0 || var9.field513 || method668(var9) != 0 || class56.field1037 == var9 || var9.field483 == 1338) && (!var9.field591 || !method661(var9))) {
                int var10 = var9.field526 + arg6;
                int var11 = var9.field624 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field493 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field537 + var10;
                    int var17 = var9.field561 + var11;
                    if (var9.field493 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class158.field2686 == var9) {
                    class163.field2758 = true;
                    class263.field4657 = var10;
                    class134.field2257 = var11;
                }
                if (!var9.field591 || var12 < var14 && var13 < var15) {
                    if (var9.field493 == 0) {
                        if (!var9.field591 && method661(var9) && class30.field422 != var9) {
                            continue;
                        }
                        if (var9.field622 && class189.field3325 >= var12 && class133.field2229 >= var13 && class189.field3325 < var14 && class133.field2229 < var15) {
                            for (class61 var18 = (class61) class31.field431.method1173(33); var18 != null; var18 = (class61) class31.field431.method1175(-1)) {
                                if (var18.field1092) {
                                    var18.method655(63);
                                }
                            }
                            if (class249.field4426 == 0) {
                                class158.field2686 = null;
                                class56.field1037 = null;
                            }
                            class143.field2371 = false;
                        }
                    }
                    if (var9.field591) {
                        boolean var19;
                        if (class189.field3325 >= var12 && class133.field2229 >= var13 && class189.field3325 < var14 && class133.field2229 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class51.field929 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class33.field520 == 1 && class104.field1709 >= var12 && class50.field897 >= var13 && class104.field1709 < var14 && class50.field897 < var15) {
                            var21 = true;
                        }
                        if (class32.field445 > 0 && var9.field627 != null) {
                            for (int var22 = 0; var22 < var9.field627.length; var22++) {
                                for (int var23 = 0; var23 < class32.field445; var23++) {
                                    int var24 = var9.field627[var22] & 0xFF;
                                    if (class127.field2095[var23] == var24) {
                                        if (var9.field588 != null) {
                                            byte var25 = var9.field588[var22];
                                            if (var25 != 0 && ((var25 & 0x2) != 0 && !class88.field1438[86] || (var25 & 0x1) != 0 && !class88.field1438[82] || (var25 & 0x4) != 0 && !class88.field1438[81])) {
                                                continue;
                                            }
                                        }
                                        class20.method152(var22 + 1, class26.field385, var9.field491, -1, 137);
                                    }
                                }
                            }
                        }
                        if (var21) {
                            class83.method523((byte) -51, class104.field1709 - var10, class50.field897 - var11, var9);
                        }
                        if (class158.field2686 != null && class158.field2686 != var9 && var19 && class230.method1637(-1, method668(var9))) {
                            class168.field2838 = var9;
                        }
                        if (class56.field1037 == var9) {
                            class56.field1034 = true;
                            class266.field4714 = var10;
                            class143.field2374 = var11;
                        }
                        if (var9.field513 || var9.field483 != 0) {
                            if (var19 && class31.field434 != 0 && var9.field541 != null) {
                                class61 var26 = new class61();
                                var26.field1092 = true;
                                var26.field1089 = var9;
                                var26.field1091 = class31.field434;
                                var26.field1101 = var9.field541;
                                class31.field431.method1176(var26, (byte) 38);
                            }
                            if (class158.field2686 != null || class57.field1059 != null || class258.field4575 || var9.field483 != 1400 && class143.field2371) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field483 != 0) {
                                if (var9.field483 == 1337) {
                                    class153.field2628 = var9;
                                    class184.method1238(var9, (byte) -35);
                                    continue;
                                }
                                if (var9.field483 == 1338) {
                                    if (var21) {
                                        class70.method467(false, class50.field897 - var11, var9, class104.field1709 - var10);
                                    }
                                    continue;
                                }
                                if (var9.field483 == 1400) {
                                    class3.field23 = var9;
                                    if (var21) {
                                        if (class88.field1438[82] && class227.field4084 > 0) {
                                            int var27 = (int) ((double) (class104.field1709 - var10 - var9.field537 / 2) * 2.0D / (double) class115.field1905);
                                            int var28 = (int) ((double) (class50.field897 - var11 - var9.field561 / 2) * 2.0D / (double) class115.field1905);
                                            int var29 = class30.field420 + var27;
                                            int var30 = class67.field1160 + var28;
                                            int var31 = class54.field1009 + var29;
                                            int var32 = class161.field2728 + class76.field1319 - var30 - 1;
                                            class104.method651(var31, -122, var32, 0);
                                            class256.method1773((byte) 117);
                                            continue;
                                        }
                                        class143.field2371 = true;
                                        class258.field4580 = class189.field3325;
                                        class61.field1107 = class133.field2229;
                                        class249.field4436 = class30.field420;
                                        class20.field282 = class67.field1160;
                                        continue;
                                    }
                                    if (var20 && class143.field2371) {
                                        class266.method1830((int) ((double) (class258.field4580 - class189.field3325) * 2.0D / (double) class216.field3808) + class249.field4436, -1);
                                        class55.method372(-1, (int) ((double) (class61.field1107 - class133.field2229) * 2.0D / (double) class216.field3808) + class20.field282);
                                        continue;
                                    }
                                    class143.field2371 = false;
                                    continue;
                                }
                                if (var9.field483 == 1401) {
                                    if (var20) {
                                        class216.method1474(class189.field3325 - var10, var9.field537, (byte) 85, var9.field561, class133.field2229 - var11);
                                    }
                                    continue;
                                }
                                if (var9.field483 == 1402) {
                                    class184.method1238(var9, (byte) -66);
                                    continue;
                                }
                                if (var9.field483 == 1404) {
                                    class184.method1238(var9, (byte) -93);
                                    continue;
                                }
                            }
                            if (!var9.field524 && var21) {
                                var9.field524 = true;
                                if (var9.field544 != null) {
                                    class61 var33 = new class61();
                                    var33.field1092 = true;
                                    var33.field1089 = var9;
                                    var33.field1100 = class104.field1709 - var10;
                                    var33.field1091 = class50.field897 - var11;
                                    var33.field1101 = var9.field544;
                                    class31.field431.method1176(var33, (byte) 38);
                                }
                            }
                            if (var9.field524 && var20 && var9.field575 != null) {
                                class61 var34 = new class61();
                                var34.field1092 = true;
                                var34.field1089 = var9;
                                var34.field1100 = class189.field3325 - var10;
                                var34.field1091 = class133.field2229 - var11;
                                var34.field1101 = var9.field575;
                                class31.field431.method1176(var34, (byte) 38);
                            }
                            if (var9.field524 && !var20) {
                                var9.field524 = false;
                                if (var9.field550 != null) {
                                    class61 var35 = new class61();
                                    var35.field1092 = true;
                                    var35.field1089 = var9;
                                    var35.field1100 = class189.field3325 - var10;
                                    var35.field1091 = class133.field2229 - var11;
                                    var35.field1101 = var9.field550;
                                    class55.field1020.method1176(var35, (byte) 38);
                                }
                            }
                            if (var20 && var9.field620 != null) {
                                class61 var36 = new class61();
                                var36.field1092 = true;
                                var36.field1089 = var9;
                                var36.field1100 = class189.field3325 - var10;
                                var36.field1091 = class133.field2229 - var11;
                                var36.field1101 = var9.field620;
                                class31.field431.method1176(var36, (byte) 38);
                            }
                            if (!var9.field468 && var19) {
                                var9.field468 = true;
                                if (var9.field570 != null) {
                                    class61 var37 = new class61();
                                    var37.field1092 = true;
                                    var37.field1089 = var9;
                                    var37.field1100 = class189.field3325 - var10;
                                    var37.field1091 = class133.field2229 - var11;
                                    var37.field1101 = var9.field570;
                                    class31.field431.method1176(var37, (byte) 38);
                                }
                            }
                            if (var9.field468 && var19 && var9.field498 != null) {
                                class61 var38 = new class61();
                                var38.field1092 = true;
                                var38.field1089 = var9;
                                var38.field1100 = class189.field3325 - var10;
                                var38.field1091 = class133.field2229 - var11;
                                var38.field1101 = var9.field498;
                                class31.field431.method1176(var38, (byte) 38);
                            }
                            if (var9.field468 && !var19) {
                                var9.field468 = false;
                                if (var9.field564 != null) {
                                    class61 var39 = new class61();
                                    var39.field1092 = true;
                                    var39.field1089 = var9;
                                    var39.field1100 = class189.field3325 - var10;
                                    var39.field1091 = class133.field2229 - var11;
                                    var39.field1101 = var9.field564;
                                    class55.field1020.method1176(var39, (byte) 38);
                                }
                            }
                            if (var9.field586 != null) {
                                class61 var40 = new class61();
                                var40.field1089 = var9;
                                var40.field1101 = var9.field586;
                                class209.field3723.method1176(var40, (byte) 38);
                            }
                            if (var9.field460 != null && class249.field4424 > var9.field598) {
                                if (var9.field484 == null || class249.field4424 - var9.field598 > 32) {
                                    class61 var45 = new class61();
                                    var45.field1089 = var9;
                                    var45.field1101 = var9.field460;
                                    class31.field431.method1176(var45, (byte) 38);
                                } else {
                                    label550: for (int var41 = var9.field598; var41 < class249.field4424; var41++) {
                                        int var42 = class145.field2446[var41 & 0x1F];
                                        for (int var43 = 0; var43 < var9.field484.length; var43++) {
                                            if (var9.field484[var43] == var42) {
                                                class61 var44 = new class61();
                                                var44.field1089 = var9;
                                                var44.field1101 = var9.field460;
                                                class31.field431.method1176(var44, (byte) 38);
                                                break label550;
                                            }
                                        }
                                    }
                                }
                                var9.field598 = class249.field4424;
                            }
                            if (var9.field553 != null && class107.field1784 > var9.field496) {
                                if (var9.field576 == null || class107.field1784 - var9.field496 > 32) {
                                    class61 var50 = new class61();
                                    var50.field1089 = var9;
                                    var50.field1101 = var9.field553;
                                    class31.field431.method1176(var50, (byte) 38);
                                } else {
                                    label526: for (int var46 = var9.field496; var46 < class107.field1784; var46++) {
                                        int var47 = class207.field3692[var46 & 0x1F];
                                        for (int var48 = 0; var48 < var9.field576.length; var48++) {
                                            if (var9.field576[var48] == var47) {
                                                class61 var49 = new class61();
                                                var49.field1089 = var9;
                                                var49.field1101 = var9.field553;
                                                class31.field431.method1176(var49, (byte) 38);
                                                break label526;
                                            }
                                        }
                                    }
                                }
                                var9.field496 = class107.field1784;
                            }
                            if (var9.field516 != null && class35.field640 > var9.field530) {
                                if (var9.field472 == null || class35.field640 - var9.field530 > 32) {
                                    class61 var55 = new class61();
                                    var55.field1089 = var9;
                                    var55.field1101 = var9.field516;
                                    class31.field431.method1176(var55, (byte) 38);
                                } else {
                                    label502: for (int var51 = var9.field530; var51 < class35.field640; var51++) {
                                        int var52 = class150.field2581[var51 & 0x1F];
                                        for (int var53 = 0; var53 < var9.field472.length; var53++) {
                                            if (var9.field472[var53] == var52) {
                                                class61 var54 = new class61();
                                                var54.field1089 = var9;
                                                var54.field1101 = var9.field516;
                                                class31.field431.method1176(var54, (byte) 38);
                                                break label502;
                                            }
                                        }
                                    }
                                }
                                var9.field530 = class35.field640;
                            }
                            if (var9.field618 != null && class49.field868 > var9.field623) {
                                if (var9.field486 == null || class49.field868 - var9.field623 > 32) {
                                    class61 var60 = new class61();
                                    var60.field1089 = var9;
                                    var60.field1101 = var9.field618;
                                    class31.field431.method1176(var60, (byte) 38);
                                } else {
                                    label478: for (int var56 = var9.field623; var56 < class49.field868; var56++) {
                                        int var57 = class115.field1909[var56 & 0x1F];
                                        for (int var58 = 0; var58 < var9.field486.length; var58++) {
                                            if (var9.field486[var58] == var57) {
                                                class61 var59 = new class61();
                                                var59.field1089 = var9;
                                                var59.field1101 = var9.field618;
                                                class31.field431.method1176(var59, (byte) 38);
                                                break label478;
                                            }
                                        }
                                    }
                                }
                                var9.field623 = class49.field868;
                            }
                            if (var9.field584 != null && class159.field2692 > var9.field539) {
                                if (var9.field465 == null || class159.field2692 - var9.field539 > 32) {
                                    class61 var65 = new class61();
                                    var65.field1089 = var9;
                                    var65.field1101 = var9.field584;
                                    class31.field431.method1176(var65, (byte) 38);
                                } else {
                                    label454: for (int var61 = var9.field539; var61 < class159.field2692; var61++) {
                                        int var62 = class184.field3229[var61 & 0x1F];
                                        for (int var63 = 0; var63 < var9.field465.length; var63++) {
                                            if (var9.field465[var63] == var62) {
                                                class61 var64 = new class61();
                                                var64.field1089 = var9;
                                                var64.field1101 = var9.field584;
                                                class31.field431.method1176(var64, (byte) 38);
                                                break label454;
                                            }
                                        }
                                    }
                                }
                                var9.field539 = class159.field2692;
                            }
                            if (class193.field3451 > var9.field596 && var9.field487 != null) {
                                class61 var66 = new class61();
                                var66.field1089 = var9;
                                var66.field1101 = var9.field487;
                                class31.field431.method1176(var66, (byte) 38);
                            }
                            if (class21.field297 > var9.field596 && var9.field556 != null) {
                                class61 var67 = new class61();
                                var67.field1089 = var9;
                                var67.field1101 = var9.field556;
                                class31.field431.method1176(var67, (byte) 38);
                            }
                            if (class141.field2350 > var9.field596 && var9.field569 != null) {
                                class61 var68 = new class61();
                                var68.field1089 = var9;
                                var68.field1101 = var9.field569;
                                class31.field431.method1176(var68, (byte) 38);
                            }
                            if (class69.field1217 > var9.field596 && var9.field522 != null) {
                                class61 var69 = new class61();
                                var69.field1089 = var9;
                                var69.field1101 = var9.field522;
                                class31.field431.method1176(var69, (byte) 38);
                            }
                            if (class250.field4450 > var9.field596 && var9.field581 != null) {
                                class61 var70 = new class61();
                                var70.field1089 = var9;
                                var70.field1101 = var9.field581;
                                class31.field431.method1176(var70, (byte) 38);
                            }
                            var9.field596 = class110.field1841;
                            if (var9.field567 != null) {
                                for (int var71 = 0; var71 < class32.field445; var71++) {
                                    class61 var72 = new class61();
                                    var72.field1089 = var9;
                                    var72.field1084 = class127.field2095[var71];
                                    var72.field1096 = class21.field303[var71];
                                    var72.field1101 = var9.field567;
                                    class31.field431.method1176(var72, (byte) 38);
                                }
                            }
                            if (class253.field4484 && var9.field543 != null) {
                                class61 var73 = new class61();
                                var73.field1089 = var9;
                                var73.field1101 = var9.field543;
                                class31.field431.method1176(var73, (byte) 38);
                            }
                        }
                    }
                    if (!var9.field591 && class158.field2686 == null && class57.field1059 == null && !class258.field4575) {
                        if ((var9.field560 >= 0 || var9.field506 != 0) && class189.field3325 >= var12 && class133.field2229 >= var13 && class189.field3325 < var14 && class133.field2229 < var15) {
                            if (var9.field560 >= 0) {
                                class30.field422 = arg0[var9.field560];
                            } else {
                                class30.field422 = var9;
                            }
                        }
                        if (var9.field493 == 8 && class189.field3325 >= var12 && class133.field2229 >= var13 && class189.field3325 < var14 && class133.field2229 < var15) {
                            class182.field3139 = var9;
                        }
                        if (var9.field482 > var9.field561) {
                            class110.method702(class189.field3325, class133.field2229, 16, var11, var9.field561, var9.field482, var9.field537 + var10, var9);
                        }
                    }
                    if (var9.field493 == 0) {
                        method658(arg0, var9.field491, var12, var13, var14, var15, var10 - var9.field585, var11 - var9.field534);
                        if (var9.field548 != null) {
                            method658(var9.field548, var9.field491, var12, var13, var14, var15, var10 - var9.field585, var11 - var9.field534);
                        }
                        class267 var74 = (class267) class73.field1259.method612((long) var9.field491, true);
                        if (var74 != null) {
                            class211.method1449(var12, var74.field4721, var14, var13, var10, var15, 118, var11);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    public static void method659(byte arg0) {
        field1729 = null;
        field1731 = null;
        if (arg0 < 62) {
            field1731 = null;
        }
        field1734 = null;
        field1745 = null;
        field1736 = null;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILe;)V")
    public static final void method660(int arg0, class191 arg1) {
        class198.field3528 = arg1;
        field1730++;
        if (class167.field2820.field4379 == null) {
            return;
        }
        try {
            class191 var2 = class191.field3410.method1310(105, class167.field2820.field4379);
            class191 var3 = class12.field149.method1310(121, class167.field2820.field4379);
            class191 var4 = class228.method1629(new class191[] { var2, class154.field2654, arg1, class107.field1778, var3 }, (byte) -9);
            class191 var5;
            if (arg0 == arg1.method1304(63)) {
                var5 = class228.method1629(new class191[] { var4, class19.field270 }, (byte) -91);
            } else {
                var5 = class228.method1629(new class191[] { var4, class87.field1424, class151.method1026(class27.method198((byte) -113) + 94608000000L, arg0 ^ 0xA), class228.field4107, class95.method587(94608000L, 124) }, (byte) -126);
            }
            class228.method1629(new class191[] { class243.field4339, var5, class222.field3974 }, (byte) -54).method1334(class167.field2820.field4379, false);
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Leg;)Z")
    public static final boolean method661(class33 arg0) {
        if (class111.field1875) {
            if (method668(arg0) != 0) {
                return false;
            }
            if (arg0.field493 == 0) {
                return false;
            }
        }
        return arg0.field607;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public final void method662(int arg0) {
        if (browsercontrol.iscreated()) {
            browsercontrol.destroy();
        }
        field1741++;
        if (class167.field2820 != null) {
            class167.field2820.method1713(-25027, this.getClass());
        }
        if (class248.field4420 != null) {
            class248.field4420.field2767 = false;
        }
        class248.field4420 = null;
        if (class263.field4670 != null) {
            class263.field4670.method174(-26);
            class263.field4670 = null;
        }
        class59.method399(104, class51.field909);
        class127.method859(0, class51.field909);
        if (class162.field2737 != null) {
            class162.field2737.method1208(true, class51.field909);
        }
        class263.method1806(4096);
        int var2 = -39 % ((48 - arg0) / 57);
        class92.method559(true);
        class162.field2737 = null;
        if (class199.field3539 != null) {
            class199.field3539.method347(-90);
        }
        if (class93.field1527 != null) {
            class93.field1527.method347(-97);
        }
        class127.field2105.method1395(0);
        class81.field1364.method1661(-108);
        try {
            if (class256.field4537 != null) {
                class256.field4537.method1137(0);
            }
            if (class258.field4577 != null) {
                for (int var3 = 0; var3 < class258.field4577.length; var3++) {
                    if (class258.field4577[var3] != null) {
                        class258.field4577[var3].method1137(0);
                    }
                }
            }
            if (class132.field2224 != null) {
                class132.field2224.method1137(0);
            }
            if (class51.field923 != null) {
                class51.field923.method1137(0);
            }
        } catch (IOException var4) {
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public final void method663(byte arg0) {
        class81.field1364 = new class236();
        class127.field2105 = new class200();
        class209.method1445(class167.field2820, false, class261.field4602);
        field1744++;
        class128.field2119 = class90.field1466 = class59.field1069 = class24.field332 = new short[256];
        class261.field4624 = class18.field239 == 0 ? 43594 : class135.field2263 + 40000;
        if (class83.field1394 == 1) {
            class46.field833 = class263.field4665;
            class143.field2375 = class227.field4082;
            class200.field3582 = class13.field162;
            class13.field164 = class167.field2818;
        } else {
            class46.field833 = class132.field2196;
            class200.field3582 = class270.field4768;
            class143.field2375 = class196.field3505;
            class13.field164 = class182.field3129;
        }
        if (arg0 >= -62) {
            return;
        }
        class205.field3640 = class261.field4624;
        class181.field3123 = class18.field239 == 0 ? 443 : class135.field2263 + 50000;
        class14.method92((byte) -86);
        class266.method1831(class51.field909, (byte) 12);
        class253.method1755(class51.field909, 100);
        class162.field2737 = class28.method201(0);
        if (class162.field2737 != null) {
            class162.field2737.method1210(0, class51.field909);
        }
        class194.field3495 = class247.field4367;
        try {
            if (class167.field2820.field4376 != null) {
                class256.field4537 = new class168(class167.field2820.field4376, 5200, 0);
                for (int var2 = 0; var2 < 27; var2++) {
                    class258.field4577[var2] = new class168(class167.field2820.field4368[var2], 6000, 0);
                }
                class132.field2224 = new class168(class167.field2820.field4371, 6000, 0);
                class221.field3899 = new class59(255, class256.field4537, class132.field2224, 500000);
                class51.field923 = new class168(class167.field2820.field4384, 24, 0);
                class167.field2820.field4376 = null;
                class167.field2820.field4371 = null;
                class167.field2820.field4384 = null;
                class167.field2820.field4368 = null;
            }
        } catch (IOException var3) {
            class256.field4537 = null;
            class132.field2224 = null;
            class51.field923 = null;
            class221.field3899 = null;
        }
        if (class18.field239 != 0) {
            class181.field3114 = true;
        }
        class184.field3223 = class211.field3743;
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            if (arg0.length < 7 || arg0.length > 8) {
                class188.method1297((byte) 95);
            }
            class135.field2263 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class18.field239 = 0;
            } else if (arg0[1].equals("office")) {
                class18.field239 = 1;
            } else if (arg0[1].equals("local")) {
                class18.field239 = 2;
            } else {
                class188.method1297((byte) -81);
            }
            int var1 = -1;
            if (arg0[2].equals("live")) {
                class19.field271 = 0;
            } else if (arg0[2].equals("rc")) {
                class19.field271 = 1;
            } else if (arg0[2].equals("wip")) {
                class19.field271 = 2;
            } else {
                class188.method1297((byte) 64);
            }
            if (arg0[4].equals("free")) {
                class200.field3588 = false;
            } else if (arg0[4].equals("members")) {
                class200.field3588 = true;
            } else {
                class188.method1297((byte) -78);
            }
            try {
                byte[] var2 = arg0[5].getBytes("ISO-8859-1");
                var1 = class242.method1697(55, class76.method491(var2.length, var2, 0, -1));
            } catch (Exception var5) {
            }
            if (var1 != -1) {
                class233.field4165 = var1;
            } else if (arg0[5].equals("english")) {
                class233.field4165 = 0;
            } else if (arg0[5].equals("german")) {
                class233.field4165 = 1;
            } else {
                class188.method1297((byte) 57);
            }
            class68.method449(true, class233.field4165);
            if (arg0[6].equals("game0")) {
                class83.field1394 = 0;
            } else if (arg0[6].equals("game1")) {
                class83.field1394 = 1;
            } else {
                class188.method1297((byte) 62);
            }
            if (arg0.length != 8) {
                class261.field4602 = false;
            } else if (arg0[7].equals("safemode")) {
                class261.field4602 = true;
            } else {
                class188.method1297((byte) -76);
            }
            class95.field1548 = "127.0.0.1";
            class198.field3528 = class26.field385;
            class235.field4190 = 0;
            client var3 = new client();
            var3.method1679(class19.field271 + 32, 27, (byte) -111, 765, 513, "runescape", 503);
            class114.field1884.setLocation(40, 40);
        } catch (Exception var6) {
            class25.method182(var6, (String) null, true);
        }
        field1738++;
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field1728++;
        if (!this.method1676((byte) -22)) {
            return;
        }
        class135.field2263 = Integer.parseInt(this.getParameter("worldid"));
        class19.field271 = Integer.parseInt(this.getParameter("modewhat"));
        class18.field239 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("safemode");
        if (var1 != null && var1.equals("1")) {
            class261.field4602 = true;
        } else {
            class261.field4602 = false;
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class200.field3588 = true;
        } else {
            class200.field3588 = false;
        }
        String var3 = this.getParameter("lang");
        if (var3 != null) {
            try {
                class233.field4165 = Integer.parseInt(var3);
            } catch (Exception var11) {
            }
        }
        class68.method449(true, class233.field4165);
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class83.field1394 = 1;
        } else {
            class83.field1394 = 0;
        }
        try {
            class70.field1238 = Integer.parseInt(this.getParameter("js"));
            class39.field708 = Integer.parseInt(this.getParameter("plug"));
            class235.field4190 = Integer.parseInt(this.getParameter("affid"));
            class34.field639 = Integer.parseInt(this.getParameter("haveie6")) == 1;
        } catch (Exception var10) {
        }
        class198.field3528 = class151.field2598.method1310(73, this);
        if (class198.field3528 == null) {
            class198.field3528 = class26.field385;
        }
        String var5 = this.getParameter("advert");
        if (var5 != null) {
            byte[] var6;
            try {
                var6 = var5.getBytes("ISO-8859-1");
            } catch (UnsupportedEncodingException var9) {
                var6 = var5.getBytes();
            }
            class191 var7 = class76.method491(var6.length, var6, 0, -1);
            boolean var8 = class42.method278(var7, true);
            if (var8) {
                class24.field343 = var7;
            }
        }
        class95.field1548 = this.getCodeBase().getHost();
        this.method1677(503, 765, 513, class19.field271 + 32, 0);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
    public final void method664(byte arg0) {
        field1737++;
        method659((byte) 96);
        class191.method1336(-116);
        class87.method532((byte) -87);
        class49.method327((byte) -23);
        class46.method318((byte) 66);
        class239.method1673(-20584);
        class83.method525(false);
        class39.method262((byte) -126);
        class164.method1108(92);
        class79.method512(-32);
        class225.method1587(-252);
        class24.method172(126);
        class200.method1398(-120);
        class236.method1671(-127);
        class151.method1022(20799);
        class272.method1855(-14);
        class121.method823(-104);
        class168.method1130(0);
        class59.method398((byte) 30);
        class147.method986(0);
        class156.method1068(false);
        class162.method1101(81);
        class220.method1500((byte) -105);
        class33.method236((byte) -27);
        class76.method495(26305);
        class175.method1172(0);
        class97.method611((byte) 121);
        class180.method1209(false);
        class70.method468(123);
        class226.method1619(4556);
        class221.method1541(1);
        class51.method352(-62);
        class149.method1013(4478);
        class181.method1213(114);
        class248.method1735(-83);
        class176.method1181(-97);
        class199.method1394((byte) 114);
        class213.method1458((byte) -19);
        class184.method1242(-32328);
        class267.method1833((byte) -40);
        class104.method653((byte) 13);
        class5.method20((byte) 59);
        class207.method1423(true);
        class23.method168(98);
        class3.method8((byte) -108);
        class8.method59(-81);
        class210.method1446((byte) -49);
        class194.method1377(-126);
        class31.method215(27652);
        class178.method1195(false);
        class11.method81(-21334);
        class223.method1554((byte) -48);
        class4.method13(1);
        class102.method646(-122);
        class119.method789(4106008);
        class163.method1106((byte) 108);
        class187.method1281();
        class270.method1842(16);
        class148.method996(2000);
        class144.method969();
        class159.method1080(-1);
        class183.method1235(0);
        class27.method200((byte) 38);
        class161.method1091(-692958913);
        class10.method72((byte) -117);
        class218.method1483((byte) -31);
        class232.method1643(true);
        class44.method293();
        class253.method1757(0);
        class12.method86(69);
        class206.method1418(-127);
        class16.method122(107);
        class254.method1760((byte) 43);
        class9.method66(4);
        class257.method1777((byte) -127);
        class269.method1841(-92);
        class215.method1466(false);
        class48.method326();
        class167.method1125(28015);
        class66.method435(true);
        class192.method1369(-14001);
        class15.method119();
        class7.method34();
        class179.method1206(true);
        class126.method856((byte) 97);
        class114.method728(0);
        class53.method359(-119);
        class19.method147(50);
        class260.method1784(134663368);
        class6.method26();
        class110.method709(false);
        class94.method573();
        class135.method908((byte) -33);
        class131.method886(112);
        class89.method542(5000);
        class188.method1296(-25578);
        class235.method1656((byte) 110);
        class22.method164(-31330);
        class65.method428((byte) 126);
        class47.method322((byte) 92);
        class25.method180(-121);
        class20.method150(-127);
        class86.method530(6);
        class90.method549((byte) 64);
        class154.method1042(true);
        class233.method1645(-4);
        class244.method1707(5483);
        class242.method1698((byte) -36);
        class14.method93(-19551);
        class35.method242(1);
        class30.method212(9298);
        class99.method621(0);
        class122.method831((byte) 74);
        class69.method455(-26390);
        class271.method1847(-4739);
        class165.method1117((byte) -120);
        class182.method1228((byte) 99);
        class26.method188((byte) 118);
        class62.method414(false);
        class141.method932(10);
        class64.method427(15796);
        class61.method411(-8694);
        class38.method260((byte) 115);
        class266.method1824((byte) 96);
        class230.method1638(0);
        class240.method1683(-29);
        class241.method1693(true);
        class34.method238(-29240);
        class57.method385(51);
        class216.method1471(0);
        class197.method1388((byte) -11);
        class245.method1711(false);
        class177.method1192();
        class190.method1301((byte) -84);
        class143.method942(false);
        class75.method486((byte) 86);
        class54.method370(true);
        class101.method629(-28);
        class115.method733(76);
        class150.method1019((byte) -86);
        class261.method1797((byte) 115);
        class45.method309(-1);
        class43.method281((byte) 94);
        class63.method425(128);
        class166.method1122(-122);
        class107.method687(48);
        class217.method1480(400);
        class211.method1450((byte) -20);
        class189.method1300(78);
        class1.method3((byte) -125);
        class21.method161((byte) 14);
        class100.method622(-109);
        class219.method1486(-122);
        class146.method981(-18500);
        class42.method274(-118);
        class113.method725();
        class193.method1375(false);
        class142.method934(121);
        class172.method1161((byte) -23);
        class111.method712(-32690);
        class196.method1384((byte) -28);
        class227.method1623(-8256);
        class174.method1168();
        class186.method1259();
        class125.method850();
        class153.method1040(-87);
        class29.method209(5467);
        class273.method1864(-2);
        class108.method695();
        class264.method1813();
        class32.method219(27861);
        class124.method847((byte) -62);
        class91.method556((byte) 39);
        if (arg0 > -112) {
            method659((byte) 57);
        }
        class106.method682(2);
        class228.method1631(false);
        class256.method1770(-1);
        class56.method375((byte) 91);
        class118.method782(27557);
        class198.method1391((byte) -18);
        class71.method473((byte) -41);
        class268.method1838(true);
        class28.method203(0);
        class128.method867(-30738);
        class130.method879(true);
        class93.method570(0);
        class117.method778(102);
        class157.method1073(0);
        class68.method452(62);
        class73.method476((byte) -119);
        class37.method256((byte) -125);
        class85.method527((byte) -114);
        class138.method921(0);
        class40.method266(20503);
        class265.method1821(true);
        class18.method141(61);
        class173.method1162(72);
        class17.method133(-30164);
        class170.method1147(true);
        class205.method1417(true);
        class82.method519(-9230);
        class209.method1437(26508);
        class81.method516(1);
        class127.method857(0);
        class133.method896(-13185);
        class158.method1077((byte) -57);
        class229.method1634((byte) 41);
        class201.method1410((byte) -55);
        class137.method911((byte) -119);
        class250.method1745(false);
        class258.method1780((byte) 87);
        class263.method1807(-12863);
        class255.method1763(-2);
        class145.method979(true);
        class88.method533(-2514);
        class134.method901((byte) -71);
        class123.method840(true);
        class105.method679((byte) 110);
        class252.method1753(true);
        class129.method878(12219);
        class169.method1142(4095);
        class55.method371((byte) -116);
        class74.method481(15391);
        class95.method588(0);
        class185.method1252(0);
        class132.method891((byte) 122);
        class222.method1547((byte) 15);
        class234.method1653(1);
        class13.method90(-90);
        class36.method248(64);
        class262.method1802(0);
        class112.method716(53);
        class50.method336((byte) -101);
        class92.method561(0);
        class67.method442(0);
        class249.method1741((byte) 118);
        class152.method1030(-72);
        class243.method1701(-12);
        class203.method1413(668647052);
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    private final void method665(int arg0) {
        field1746++;
        if (arg0 > 93) {
            boolean var2 = class127.field2105.method1402(true);
            if (!var2) {
                this.method670(-1);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    public final void method666(int arg0) {
        field1733++;
        if (class47.field836 == 1000) {
            return;
        }
        class135.field2267++;
        if (class135.field2267 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class271.field4779 = var2.get(11) * 600 + (var2.get(12) * 10 + (var2.get(13) / 6));
            class27.field390.setSeed((long) class271.field4779);
        }
        this.method665(98);
        if (class211.field3737 != null) {
            class211.field3737.method1024(0);
        }
        if (arg0 < 1) {
            return;
        }
        class252.method1752(106);
        class228.method1632((byte) 105);
        class172.method1158(1);
        class118.method784((byte) 11);
        if (class162.field2737 != null) {
            int var3 = class162.field2737.method1211(true);
            class31.field434 = var3;
        }
        if (class47.field836 == 0) {
            this.method669(-131);
            class240.method1685((byte) 118);
        } else if (class47.field836 == 5) {
            this.method669(-131);
            class240.method1685((byte) 118);
        } else if (class47.field836 == 25 || class47.field836 == 28) {
            class16.method124(30);
        }
        if (class47.field836 == 10) {
            this.method667(102);
            class209.method1440(2);
            class121.method807(4);
        } else if (class47.field836 == 30) {
            class228.method1626(126);
        } else if (class47.field836 == 40) {
            class121.method807(4);
            if (class240.field4263 != -3) {
                if (class240.field4263 == 15) {
                    class82.method520(126);
                    return;
                }
                if (class240.field4263 != 2) {
                    class245.method1712(-10697);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    private final void method667(int arg0) {
        field1732++;
        class101.method625(104, this);
        for (class32.field445 = 0; class172.method1159((byte) -82) && class32.field445 < 128; class32.field445++) {
            class127.field2095[class32.field445] = class180.field3091;
            class21.field303[class32.field445] = class201.field3600;
        }
        class182.field3138++;
        if (class130.field2166 != -1) {
            class211.method1449(0, class130.field2166, class200.field3584, 0, 0, class190.field3337, 73, 0);
        }
        int var2 = 52 / ((arg0 - 10) / 60);
        class110.field1841++;
        class40.method265((byte) 100);
        while (true) {
            class61 var3;
            class33 var4;
            class33 var5;
            do {
                var3 = (class61) class209.field3723.method1171(-256);
                if (var3 == null) {
                    while (true) {
                        class61 var6;
                        class33 var7;
                        class33 var8;
                        do {
                            var6 = (class61) class55.field1020.method1171(-256);
                            if (var6 == null) {
                                while (true) {
                                    class61 var9;
                                    class33 var10;
                                    class33 var11;
                                    do {
                                        var9 = (class61) class31.field431.method1171(-256);
                                        if (var9 == null) {
                                            if (class158.field2686 != null) {
                                                class73.method474(-16729);
                                            }
                                            if (class126.field2084 != null && class126.field2084.field1356 == 1) {
                                                if (class126.field2084.field1360 != null) {
                                                    class219.method1487(-27286, class235.field4187, class233.field4167);
                                                }
                                                class233.field4167 = null;
                                                class235.field4187 = false;
                                                class126.field2084 = null;
                                                return;
                                            }
                                            return;
                                        }
                                        var10 = var9.field1089;
                                        if (var10.field589 < 0) {
                                            break;
                                        }
                                        var11 = class233.method1646(5877, var10.field478);
                                    } while (var11 == null || var11.field548 == null || var10.field589 >= var11.field548.length || var11.field548[var10.field589] != var10);
                                    class12.method87(var9, -12934);
                                }
                            }
                            var7 = var6.field1089;
                            if (var7.field589 < 0) {
                                break;
                            }
                            var8 = class233.method1646(5877, var7.field478);
                        } while (var8 == null || var8.field548 == null || var7.field589 >= var8.field548.length || var8.field548[var7.field589] != var7);
                        class12.method87(var6, -12934);
                    }
                }
                var4 = var3.field1089;
                if (var4.field589 < 0) {
                    break;
                }
                var5 = class233.method1646(5877, var4.field478);
            } while (var5 == null || var5.field548 == null || var4.field589 >= var5.field548.length || var5.field548[var4.field589] != var4);
            class12.method87(var3, -12934);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Leg;)I")
    public static final int method668(class33 arg0) {
        class115 var1 = (class115) class83.field1390.method612(((long) arg0.field491 << 32) + (long) arg0.field589, true);
        return var1 == null ? arg0.field579 : var1.field1896;
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    private final void method669(int arg0) {
        field1739++;
        if (class76.field1324 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class27.method198((byte) -123);
            if (class183.field3157 == 0L) {
                class183.field3157 = var4;
            }
            if (var3 > 16384 && (var4 - class183.field3157) < 5000L) {
                if (var4 - class101.field1612 > 1000L) {
                    System.gc();
                    class101.field1612 = var4;
                }
                class134.field2245 = class106.field1769;
                class185.field3237 = 5;
            } else {
                class185.field3237 = 5;
                class134.field2245 = class61.field1104;
                class76.field1324 = 10;
            }
        } else if (class76.field1324 == 10) {
            class89.method538(4, 104, 104, 25);
            for (int var6 = 0; var6 < 4; var6++) {
                class82.field1383[var6] = new class220(104, 104);
            }
            class134.field2245 = class222.field3972;
            class185.field3237 = 10;
            class76.field1324 = 30;
        } else if (class76.field1324 == 30) {
            if (class211.field3737 == null) {
                class211.field3737 = new class151(class127.field2105, class81.field1364);
            }
            if (class211.field3737.method1021((byte) 115)) {
                class27.field396 = class29.method205(false, true, true, (byte) -101, 0);
                class68.field1188 = class29.method205(false, true, true, (byte) -71, 1);
                class191.field3409 = class29.method205(true, true, false, (byte) -83, 2);
                class37.field683 = class29.method205(false, true, true, (byte) -73, 3);
                class137.field2303 = class29.method205(false, true, true, (byte) -102, 4);
                class273.field4834 = class29.method205(true, true, true, (byte) -119, 5);
                class102.field1653 = class29.method205(true, false, true, (byte) -110, 6);
                class200.field3581 = class29.method205(false, true, true, (byte) -86, 7);
                class215.field3792 = class29.method205(false, true, true, (byte) -85, 8);
                class156.field2664 = class29.method205(false, true, true, (byte) -122, 9);
                class245.field4359 = class29.method205(false, true, true, (byte) -80, 10);
                class28.field409 = class29.method205(false, true, true, (byte) -90, 11);
                class152.field2604 = class29.method205(false, true, true, (byte) -99, 12);
                class256.field4545 = class29.method205(false, true, true, (byte) -77, 13);
                class114.field1891 = class29.method205(false, false, true, (byte) -82, 14);
                class168.field2827 = class29.method205(false, true, true, (byte) -64, 15);
                class143.field2383 = class29.method205(false, true, true, (byte) -84, 16);
                field1731 = class29.method205(false, true, true, (byte) -73, 17);
                class128.field2128 = class29.method205(false, true, true, (byte) -76, 18);
                class18.field238 = class29.method205(false, true, true, (byte) -85, 19);
                class261.field4626 = class29.method205(false, true, true, (byte) -84, 20);
                class166.field2802 = class29.method205(false, true, true, (byte) -93, 21);
                class135.field2274 = class29.method205(false, true, true, (byte) -126, 22);
                class190.field3332 = class29.method205(true, true, true, (byte) -64, 23);
                class97.field1565 = class29.method205(false, true, true, (byte) -128, 24);
                class54.field1011 = class29.method205(false, true, true, (byte) -107, 25);
                class253.field4491 = class29.method205(true, true, true, (byte) -103, 26);
                class185.field3237 = 15;
                class134.field2245 = class106.field1764;
                class76.field1324 = 40;
            } else {
                class134.field2245 = class86.field1411;
                class185.field3237 = 12;
            }
        } else if (class76.field1324 == 40) {
            int var7 = 0;
            for (int var8 = 0; var8 < 27; var8++) {
                var7 += class188.field3317[var8].method1862(arg0 ^ 0x82) * class53.field966[var8] / 100;
            }
            if (var7 == 100) {
                class185.field3237 = 20;
                class134.field2245 = class49.field889;
                class54.method365(class215.field3792, 112);
                class211.method1452(class215.field3792, true);
                class29.method207(arg0 ^ 0xB8, class215.field3792);
                class153.method1039(class215.field3792, (byte) -127);
                class76.field1324 = 45;
            } else {
                if (var7 != 0) {
                    class134.field2245 = class228.method1629(new class191[] { class112.field1880, class92.method563(-62, var7), class230.field4131 }, (byte) -118);
                }
                class185.field3237 = 20;
            }
        } else if (class76.field1324 == 45) {
            class5.method16(class126.field2088, 2, 22050, 15899);
            class19.field266 = new class221();
            class19.field266.method1532(128, arg0 - 27808, 9);
            class199.field3539 = class128.method870((byte) 109, class51.field909, 22050, class167.field2820, 0);
            class199.field3539.method340(true, class19.field266);
            class217.method1475(class114.field1891, (byte) -80, class137.field2303, class168.field2827, class19.field266);
            class93.field1527 = class128.method870((byte) 126, class51.field909, 2048, class167.field2820, 1);
            class270.field4764 = new class78();
            class93.field1527.method340(true, class270.field4764);
            class128.field2124 = new class149(22050, class75.field1284);
            class175.field2931 = class102.field1653.method824(true, class49.field885);
            class185.field3237 = 30;
            class134.field2245 = class156.field2671;
            class76.field1324 = 50;
        } else if (class76.field1324 == 50) {
            int var9 = class12.method85(class215.field3792, (byte) -90, class256.field4545);
            int var10 = class256.method1772(arg0 ^ 0x234E);
            if (var9 < var10) {
                class134.field2245 = class228.method1629(new class191[] { class135.field2277, class92.method563(-125, var9 * 100 / var10), class230.field4131 }, (byte) -63);
                class185.field3237 = 35;
            } else {
                class185.field3237 = 35;
                class134.field2245 = class178.field3053;
                class76.field1324 = 60;
            }
        } else if (class76.field1324 == 60) {
            int var11 = class70.method464(class215.field3792, -57);
            int var12 = class45.method311(-67);
            if (var11 < var12) {
                class134.field2245 = class228.method1629(new class191[] { class111.field1862, class92.method563(-94, var11 * 100 / var12), class230.field4131 }, (byte) -112);
                class185.field3237 = 40;
            } else {
                class76.field1324 = 65;
                class134.field2245 = class249.field4431;
                class185.field3237 = 40;
            }
        } else if (class76.field1324 == 65) {
            class39.field709 = false;
            class255.method1762(class256.field4545, false, class215.field3792);
            class134.field2245 = class163.field2763;
            class185.field3237 = 45;
            class188.method1293(5, -30211);
            class76.field1324 = 70;
        } else if (class76.field1324 == 70) {
            byte var13 = 0;
            class191.field3409.method794((byte) 90);
            int var14 = var13 + class191.field3409.method817(97);
            class143.field2383.method794((byte) 49);
            int var15 = var14 + class143.field2383.method817(103);
            field1731.method794((byte) 73);
            int var16 = var15 + field1731.method817(arg0 ^ 0xFFFFFF17);
            class128.field2128.method794((byte) 30);
            int var17 = var16 + class128.field2128.method817(105);
            class18.field238.method794((byte) 47);
            int var18 = var17 + class18.field238.method817(121);
            class261.field4626.method794((byte) 115);
            int var19 = var18 + class261.field4626.method817(127);
            class166.field2802.method794((byte) 53);
            int var20 = var19 + class166.field2802.method817(124);
            class135.field2274.method794((byte) 24);
            int var21 = var20 + class135.field2274.method817(109);
            class97.field1565.method794((byte) 55);
            int var22 = var21 + class97.field1565.method817(118);
            class54.field1011.method794((byte) 77);
            int var23 = var22 + class54.field1011.method817(109);
            if (var23 < 1000) {
                class134.field2245 = class228.method1629(new class191[] { class81.field1363, class92.method563(-104, var23 / 10), class230.field4131 }, (byte) -10);
                class185.field3237 = 50;
            } else {
                class123.method839((byte) -122, class191.field3409);
                class211.method1448(4, class191.field3409);
                class271.method1850(class191.field3409, 128);
                class18.method140(class191.field3409, class200.field3581, false);
                class165.method1115(class200.field3588, 126, class200.field3581, class143.field2383);
                class92.method565(class128.field2128, (byte) -69, class200.field3581);
                class21.method159(class200.field3588, class18.field238, class1.field5, class200.field3581, 25045);
                class26.method192(class191.field3409, 0);
                class260.method1785(false, class68.field1188, class261.field4626, class27.field396);
                class42.method275(arg0 ^ 0x96, class200.field3581, class166.field2802);
                class104.method648(class135.field2274, true);
                class8.method65((byte) -29, class191.field3409);
                class25.method178(class37.field683, class215.field3792, class200.field3581, 17732, class256.field4545);
                class215.method1464(class191.field3409, 27975);
                class265.method1823(field1731, (byte) 112);
                class227.method1624(class97.field1565, -4163, class54.field1011, new class271());
                class22.method162(class54.field1011, (byte) -99, class97.field1565);
                class134.field2245 = class272.field4788;
                class185.field3237 = 50;
                class270.method1845((byte) 124);
                class76.field1324 = 80;
            }
        } else if (class76.field1324 == 80) {
            int var24 = class5.method21(class215.field3792, arg0 ^ 0xFFFFFF7D);
            int var25 = class270.method1844(84);
            if (var25 > var24) {
                class134.field2245 = class228.method1629(new class191[] { class21.field309, class92.method563(-103, var24 * 100 / var25), class230.field4131 }, (byte) -6);
                class185.field3237 = 60;
            } else {
                class138.method920(0, class215.field3792);
                class185.field3237 = 60;
                class134.field2245 = class207.field3678;
                class76.field1324 = 90;
            }
        } else if (class76.field1324 == 90) {
            if (class253.field4491.method794((byte) 28)) {
                class192 var26 = new class192(class156.field2664, class253.field4491, class215.field3792, 20, !class209.field3721);
                class15.method114(var26);
                if (class87.field1421 == 1) {
                    class15.method103(0.9F);
                }
                if (class87.field1421 == 2) {
                    class15.method103(0.8F);
                }
                if (class87.field1421 == 3) {
                    class15.method103(0.7F);
                }
                if (class87.field1421 == 4) {
                    class15.method103(0.6F);
                }
                class134.field2245 = class162.field2738;
                class76.field1324 = 100;
                class185.field3237 = 70;
            } else {
                class134.field2245 = class228.method1629(new class191[] { class122.field2023, class92.method563(-75, class253.field4491.method817(124)), class230.field4131 }, (byte) -29);
                class185.field3237 = 70;
            }
        } else if (class76.field1324 == 100) {
            if (class181.method1227(0, class215.field3792)) {
                class76.field1324 = 110;
            }
        } else if (class76.field1324 == 110) {
            class248.field4420 = new class164();
            class167.field2820.method1715(10, arg0 + 15, class248.field4420);
            class76.field1324 = 120;
            class185.field3237 = 75;
            class134.field2245 = class181.field3100;
        } else if (class76.field1324 == 120) {
            if (class245.field4359.method813(class26.field385, (byte) 85, class104.field1722)) {
                class182 var27 = new class182(class245.field4359.method802(class104.field1722, (byte) -79, class26.field385));
                class17.method134(0, var27);
                class76.field1324 = 130;
                class185.field3237 = 80;
                class134.field2245 = class220.field3860;
            } else {
                class134.field2245 = class228.method1629(new class191[] { class159.field2702, class10.field105 }, (byte) -41);
                class185.field3237 = 80;
            }
        } else if (~class76.field1324 == arg0) {
            if (!class37.field683.method794((byte) 69)) {
                class134.field2245 = class228.method1629(new class191[] { class172.field2897, class92.method563(-102, class37.field683.method817(104) * 3 / 4), class230.field4131 }, (byte) -95);
                class185.field3237 = 85;
            } else if (!class152.field2604.method794((byte) 99)) {
                class134.field2245 = class228.method1629(new class191[] { class172.field2897, class92.method563(arg0 + 65, class152.field2604.method817(109) / 10 + 75), class230.field4131 }, (byte) -84);
                class185.field3237 = 85;
            } else if (!class256.field4545.method794((byte) 87)) {
                class134.field2245 = class228.method1629(new class191[] { class172.field2897, class92.method563(-52, class256.field4545.method817(127) / 20 + 85), class230.field4131 }, (byte) -123);
                class185.field3237 = 85;
            } else if (class190.field3332.method825((byte) -98, class130.field2163)) {
                class158.method1078(class190.field3332, class79.field1355, class31.field436, class255.field4530, class23.field323, class169.field2857, 102);
                class185.field3237 = 100;
                class134.field2245 = class9.field85;
                class76.field1324 = 140;
            } else {
                class134.field2245 = class228.method1629(new class191[] { class172.field2897, class92.method563(-101, class190.field3332.method820((byte) 62, class130.field2163) / 10 + 90), class230.field4131 }, (byte) -107);
                class185.field3237 = 85;
            }
        } else if (class76.field1324 == 140) {
            class28.field402 = class37.field683.method824(true, class236.field4195);
            class273.field4834.method800(true, false, (byte) 101);
            class102.field1653.method800(true, true, (byte) 35);
            class215.field3792.method800(true, true, (byte) 102);
            class256.field4545.method800(true, true, (byte) 34);
            class245.field4359.method800(true, true, (byte) 58);
            class37.field683.method800(true, true, (byte) 102);
            class16.field218 = true;
            class245.method1712(-10697);
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    private final void method670(int arg0) {
        field1726++;
        if (class127.field2105.field3595 >= 4) {
            this.method1674(2, "js5crc");
            class47.field836 = 1000;
            return;
        }
        if (class127.field2105.field3598 >= 4) {
            if (class47.field836 == 0 || class47.field836 == 5) {
                this.method1674(2, "js5io");
                class47.field836 = 1000;
                return;
            }
            class127.field2105.field3598 = 3;
            class5.field51 = 3000;
        }
        if (class5.field51-- > 0) {
            return;
        }
        try {
            if (class75.field1282 == 0) {
                class86.field1412 = class167.field2820.method1721((byte) -96, class95.field1548, class205.field3640);
                class75.field1282++;
            }
            if (arg0 != -1) {
                field1734 = null;
            }
            if (class75.field1282 == 1) {
                if (class86.field1412.field1356 == 2) {
                    this.method672(32, -1);
                    return;
                }
                if (class86.field1412.field1356 == 1) {
                    class75.field1282++;
                }
            }
            if (class75.field1282 == 2) {
                class183.field3147 = new class24((Socket) class86.field1412.field1360, class167.field2820);
                class225 var2 = new class225(5);
                var2.method1613(15, 21);
                var2.method1576(30289, 513);
                class183.field3147.method173((byte) 112, 5, var2.field3995, 0);
                class75.field1282++;
                class137.field2308 = class27.method198((byte) -120);
            }
            if (class75.field1282 == 3) {
                if (class47.field836 == 0 || class47.field836 == 5 || class183.field3147.method177((byte) 125) > 0) {
                    int var3 = class183.field3147.method171(arg0 ^ 0x69E0);
                    if (var3 != 0) {
                        this.method672(arg0 + 33, var3);
                        return;
                    }
                    class75.field1282++;
                } else if (class27.method198((byte) -118) - class137.field2308 > 30000L) {
                    this.method672(32, -2);
                    return;
                }
            }
            if (class75.field1282 == 4) {
                boolean var4 = class47.field836 == 5 || class47.field836 == 10 || class47.field836 == 28;
                class127.field2105.method1401(!var4, class183.field3147, arg0 ^ 0xFFFFFFFA);
                class75.field1282 = 0;
                class183.field3147 = null;
                class86.field1412 = null;
                class197.field3515 = 0;
            }
        } catch (IOException var5) {
            this.method672(arg0 ^ 0xFFFFFFDF, -3);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)Z")
    public static final boolean method671(int arg0, int arg1) {
        if (arg0 >= -25) {
            field1736 = null;
        }
        field1740++;
        return (-arg1 & arg1) == arg1;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
    private final void method672(int arg0, int arg1) {
        if (class261.field4624 == class205.field3640) {
            class205.field3640 = class181.field3123;
        } else {
            class205.field3640 = class261.field4624;
        }
        field1735++;
        class183.field3147 = null;
        class86.field1412 = null;
        class197.field3515++;
        if (arg0 != 32) {
            this.method664((byte) -3);
        }
        class75.field1282 = 0;
        if (class197.field3515 >= 2 && (arg1 == 7 || arg1 == 9)) {
            if (class47.field836 == 0 || class47.field836 == 5) {
                this.method1674(2, "js5connect_full");
                class47.field836 = 1000;
            } else {
                class5.field51 = 3000;
            }
        } else if (class197.field3515 >= 2 && arg1 == 6) {
            this.method1674(arg0 - 30, "js5connect_outofdate");
            class47.field836 = 1000;
        } else if (class197.field3515 >= 4) {
            if (class47.field836 == 0 || class47.field836 == 5) {
                this.method1674(arg0 ^ 0x22, "js5connect");
                class47.field836 = 1000;
            } else {
                class5.field51 = 3000;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Leg;)Leg;")
    public static final class33 method673(class33 arg0) {
        int var1 = class18.method143(25046, method668(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class233.method1646(5877, arg0.field478);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }
}
