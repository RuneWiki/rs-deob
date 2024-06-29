import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class72 {

    @OriginalMember(owner = "client!m", name = "c", descriptor = "La;")
    public static class1 field1759 = class113.method934(-11538, "Cabbage");

    @OriginalMember(owner = "client!m", name = "q", descriptor = "[I")
    public static int[] field1773 = new int[500];

    @OriginalMember(owner = "client!m", name = "l", descriptor = "La;")
    public static class1 field1768 = class113.method934(-11538, "::");

    @OriginalMember(owner = "client!m", name = "e", descriptor = "La;")
    public static class1 field1761 = class113.method934(-11538, "Bitte schlie-8en Sie die momentan ge-Offnete Benutzeroberfl-=che)1 bevor Sie die (WRegelversto-8 melden(W Option benutzen");

    @OriginalMember(owner = "client!m", name = "j", descriptor = "I")
    public static int field1766 = 0;

    @OriginalMember(owner = "client!m", name = "v", descriptor = "La;")
    private static class1 field1778 = class113.method934(-11538, "Loading config )2 ");

    @OriginalMember(owner = "client!m", name = "w", descriptor = "La;")
    public static class1 field1779 = class113.method934(-11538, "Spiel)2Engine wird gestartet)3)3)3");

    @OriginalMember(owner = "client!m", name = "u", descriptor = "La;")
    public static class1 field1777 = class113.method934(-11538, ")1");

    @OriginalMember(owner = "client!m", name = "i", descriptor = "La;")
    public static class1 field1765 = field1778;

    @OriginalMember(owner = "client!m", name = "d", descriptor = "Lcb;")
    public static class15 field1760 = new class15(64);

    @OriginalMember(owner = "client!m", name = "x", descriptor = "La;")
    private static class1 field1780 = class113.method934(-11538, "No response from server)3");

    @OriginalMember(owner = "client!m", name = "y", descriptor = "La;")
    public static class1 field1781 = field1780;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "I")
    public static int field1758;

    @OriginalMember(owner = "client!m", name = "f", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!m", name = "g", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!m", name = "h", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!m", name = "k", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!m", name = "m", descriptor = "I")
    public static int field1769;

    @OriginalMember(owner = "client!m", name = "n", descriptor = "I")
    public static int field1770;

    @OriginalMember(owner = "client!m", name = "o", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!m", name = "p", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!m", name = "r", descriptor = "I")
    public static int field1774;

    @OriginalMember(owner = "client!m", name = "s", descriptor = "I")
    public static int field1775;

    @OriginalMember(owner = "client!m", name = "t", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Z)V", line = 5)
    public static final synchronized void method672(boolean arg0) {
        field1757++;
        if (class50.method523(-122)) {
            class45.method477(-110);
            class53.field1394 = arg0;
            class38.field1029 = null;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IZIILbd;IIZ)V", line = 34)
    public static final synchronized void method673(int arg0, boolean arg1, int arg2, int arg3, class11 arg4, int arg5, int arg6, boolean arg7) {
        field1770++;
        if (!class50.method523(5)) {
            return;
        }
        client.field612 = arg7;
        class11.field406 = arg2;
        class19.field662 = arg5;
        class53.field1394 = arg1;
        class38.field1029 = arg4;
        class120.field2988 = -1;
        class34.field918 = arg0;
        class57.field1465 = arg6;
        class14.field464 = arg3;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(B)V", line = 61)
    public static final void method674(byte arg0) {
        field1764++;
        class70.field1752 = 0;
        if (arg0 != -28) {
            return;
        }
        for (int var1 = -1; var1 < class118.field2942 + class49.field1343; var1++) {
            class80 var18;
            if (var1 == -1) {
                var18 = class104.field2624;
            } else if (class118.field2942 > var1) {
                var18 = class80.field2033[class112.field2761[var1]];
            } else {
                var18 = class120.field2995[class22.field678[var1 - class118.field2942]];
            }
            if (var18 != null && var18.method43(1)) {
                if (var18 instanceof class130) {
                    class42 var19 = ((class130) var18).field3185;
                    if (var19.field1137 != null) {
                        var19 = var19.method458(arg0 + 27);
                    }
                    if (var19 == null) {
                        continue;
                    }
                }
                if (var1 >= class118.field2942) {
                    class42 var20 = ((class130) var18).field3185;
                    if (var20.field1092 >= 0 && var20.field1092 < class4.field179.length) {
                        class52.method526(-127, var18.field1994 + 15, var18);
                        if (class39.field1073 > -1) {
                            class4.field179[var20.field1092].method554(class39.field1073 - 12, class89.field2191 + -30);
                        }
                    }
                    if (class2.field97 == 1 && class22.field678[var1 - class118.field2942] == class132.field3215 && class82.field2066 % 20 < 10) {
                        class52.method526(107, var18.field1994 + 15, var18);
                        if (class39.field1073 > -1) {
                            class76.field1889[0].method554(class39.field1073 - 12, class89.field2191 + -28);
                        }
                    }
                } else {
                    class2 var21 = (class2) var18;
                    int var22 = 30;
                    if (var21.field77 != -1 || var21.field82 != -1) {
                        class52.method526(-44, var18.field1994 + 15, var18);
                        if (class39.field1073 > -1) {
                            if (var21.field77 != -1) {
                                class52.field1379[var21.field77].method554(class39.field1073 - 12, class89.field2191 - var22);
                                var22 += 25;
                            }
                            if (var21.field82 != -1) {
                                class4.field179[var21.field82].method554(class39.field1073 - 12, -var22 + class89.field2191);
                                var22 += 25;
                            }
                        }
                    }
                    if (var1 >= 0 && class2.field97 == 10 && class112.field2761[var1] == class134.field3293) {
                        class52.method526(87, var18.field1994 + 15, var18);
                        if (class39.field1073 > -1) {
                            class76.field1889[1].method554(class39.field1073 - 12, -var22 + class89.field2191);
                        }
                    }
                }
                if (var18.field1967 != null && (var1 >= class118.field2942 || class75.field1867 == 0 || class75.field1867 == 3 || class75.field1867 == 1 && class12.method243(((class2) var18).field87, arg0 ^ 0x7F74))) {
                    class52.method526(88, var18.field1994, var18);
                    if (class39.field1073 > -1 && class67.field1687 > class70.field1752) {
                        class67.field1658[class70.field1752] = class116.field2905.method209(var18.field1967) / 2;
                        class67.field1666[class70.field1752] = class116.field2905.field351;
                        class67.field1693[class70.field1752] = class39.field1073;
                        class67.field1663[class70.field1752] = class89.field2191;
                        class67.field1690[class70.field1752] = var18.field1979;
                        class67.field1673[class70.field1752] = var18.field2000;
                        class67.field1662[class70.field1752] = var18.field1955;
                        class67.field1675[class70.field1752] = var18.field1967;
                        class70.field1752++;
                    }
                }
                if (class82.field2066 < var18.field2016) {
                    class52.method526(109, var18.field1994 + 15, var18);
                    if (class39.field1073 > -1) {
                        int var23 = var18.field2007 * 30 / var18.field1978;
                        if (var23 > 30) {
                            var23 = 30;
                        }
                        class111.method916(class39.field1073 - 15, class89.field2191 + -3, var23, 5, 65280);
                        class111.method916(class39.field1073 + var23 - 15, class89.field2191 + -3, 30 - var23, 5, 16711680);
                    }
                }
                for (int var24 = 0; var24 < 4; var24++) {
                    if (class82.field2066 < var18.field2013[var24]) {
                        class52.method526(99, var18.field1994 / 2, var18);
                        if (class39.field1073 > -1) {
                            if (var24 == 1) {
                                class89.field2191 -= 20;
                            }
                            if (var24 == 2) {
                                class39.field1073 -= 15;
                                class89.field2191 -= 10;
                            }
                            if (var24 == 3) {
                                class39.field1073 += 15;
                                class89.field2191 -= 10;
                            }
                            class47.field1233[var18.field1963[var24]].method554(class39.field1073 - 12, class89.field2191 + -12);
                            class116.field2895.method210(class48.method504(var18.field1964[var24], -1), class39.field1073, class89.field2191 + 4, 0);
                            class116.field2895.method210(class48.method504(var18.field1964[var24], -1), class39.field1073 - 1, class89.field2191 + 3, 16777215);
                        }
                    }
                }
            }
        }
        for (int var2 = 0; var2 < class70.field1752; var2++) {
            int var3 = class67.field1693[var2];
            int var4 = class67.field1663[var2];
            int var5 = class67.field1658[var2];
            int var6 = class67.field1666[var2];
            boolean var7 = true;
            while (var7) {
                var7 = false;
                for (int var17 = 0; var17 < var2; var17++) {
                    if (class67.field1663[var17] - class67.field1666[var17] < var4 + 2 && var4 - var6 < class67.field1663[var17] + 2 && var3 - var5 < class67.field1693[var17] + class67.field1658[var17] && var3 + var5 > class67.field1693[var17] + -class67.field1658[var17] && var4 > class67.field1663[var17] - class67.field1666[var17]) {
                        var7 = true;
                        var4 = class67.field1663[var17] - class67.field1666[var17];
                    }
                }
            }
            class39.field1073 = class67.field1693[var2];
            class89.field2191 = class67.field1663[var2] = var4;
            class1 var8 = class67.field1675[var2];
            if (class16.field528 == 0) {
                int var9 = 16776960;
                if (class67.field1690[var2] < 6) {
                    var9 = class57.field1461[class67.field1690[var2]];
                }
                if (class67.field1690[var2] == 6) {
                    var9 = class97.field2402 % 20 >= 10 ? 16776960 : 16711680;
                }
                if (class67.field1690[var2] == 7) {
                    var9 = class97.field2402 % 20 < 10 ? 255 : 65535;
                }
                if (class67.field1690[var2] == 8) {
                    var9 = class97.field2402 % 20 >= 10 ? 8454016 : 45056;
                }
                if (class67.field1690[var2] == 9) {
                    int var10 = 150 - class67.field1662[var2];
                    if (var10 < 50) {
                        var9 = var10 * 1280 + 16711680;
                    } else if (var10 < 100) {
                        var9 = 16776960 - (var10 - 50) * 327680;
                    } else if (var10 < 150) {
                        var9 = (var10 - 100) * 5 + 65280;
                    }
                }
                if (class67.field1690[var2] == 10) {
                    int var11 = 150 - class67.field1662[var2];
                    if (var11 < 50) {
                        var9 = var11 * 5 + 16711680;
                    } else if (var11 < 100) {
                        var9 = 16711935 + 16384000 - var11 * 327680;
                    } else if (var11 < 150) {
                        var9 = (var11 - 100) * 327680 + 255 + 500 - var11 * 5;
                    }
                }
                if (class67.field1690[var2] == 11) {
                    int var12 = 150 - class67.field1662[var2];
                    if (var12 < 50) {
                        var9 = 16777215 - var12 * 327685;
                    } else if (var12 < 100) {
                        var9 = (var12 - 50) * 327685 + 65280;
                    } else if (var12 < 150) {
                        var9 = 16777215 - (var12 - 100) * 327680;
                    }
                }
                if (class67.field1673[var2] == 0) {
                    class116.field2905.method210(var8, class39.field1073, class89.field2191 + 1, 0);
                    class116.field2905.method210(var8, class39.field1073, class89.field2191, var9);
                }
                if (class67.field1673[var2] == 1) {
                    class116.field2905.method197(var8, class39.field1073, class89.field2191 + 1, 0, class97.field2402);
                    class116.field2905.method197(var8, class39.field1073, class89.field2191, var9, class97.field2402);
                }
                if (class67.field1673[var2] == 2) {
                    class116.field2905.method199(var8, class39.field1073, class89.field2191 + 1, 0, class97.field2402);
                    class116.field2905.method199(var8, class39.field1073, class89.field2191, var9, class97.field2402);
                }
                if (class67.field1673[var2] == 3) {
                    class116.field2905.method202(var8, class39.field1073, class89.field2191 + 1, 0, class97.field2402, 150 - class67.field1662[var2]);
                    class116.field2905.method202(var8, class39.field1073, class89.field2191, var9, class97.field2402, 150 - class67.field1662[var2]);
                }
                if (class67.field1673[var2] == 4) {
                    int var13 = class116.field2905.method209(var8);
                    int var14 = (150 - class67.field1662[var2]) * (var13 + 100) / 150;
                    class111.method915(class39.field1073 - 50, 0, class39.field1073 + 50, 334);
                    class116.field2905.method214(var8, class39.field1073 + 50 - var14, class89.field2191 + 1, 0);
                    class116.field2905.method214(var8, class39.field1073 + 50 - var14, class89.field2191, var9);
                    class111.method922();
                }
                if (class67.field1673[var2] == 5) {
                    int var15 = 0;
                    int var16 = 150 - class67.field1662[var2];
                    class111.method915(0, class89.field2191 - class116.field2905.field351 - 1, 512, class89.field2191 + 5);
                    if (var16 < 25) {
                        var15 = var16 - 25;
                    } else if (var16 > 125) {
                        var15 = var16 - 125;
                    }
                    class116.field2905.method210(var8, class39.field1073, class89.field2191 + var15 + 1, 0);
                    class116.field2905.method210(var8, class39.field1073, class89.field2191 + var15, var9);
                    class111.method922();
                }
            } else {
                class116.field2905.method210(var8, class39.field1073, class89.field2191 + 1, 0);
                class116.field2905.method210(var8, class39.field1073, class89.field2191, 16776960);
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(II)V", line = 442)
    public static final synchronized void method675(int arg0, int arg1) {
        field1767++;
        if (!class50.method523(arg0 - 16923)) {
            return;
        }
        class34.method398(arg1, 17098);
        class38.field1029 = null;
        class53.field1394 = false;
        if (arg0 != 16969) {
            method684(false, -11, -36, -55, 122, null, 102);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIII)V", line = 467)
    public static final void method676(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 == 1) {
            class133.field3264++;
            class70.field1729.method416(11453, 111);
            class70.field1729.method183(75, arg2);
            class70.field1729.method151(arg0, -128);
        }
        field1775++;
        if (arg1 == 2) {
            class70.field1729.method416(11453, 9);
            class70.field1729.method183(84, arg2);
            class70.field1729.method151(arg0, -127);
            class109.field2746++;
        }
        if (arg1 == 3) {
            class11.field396++;
            class70.field1729.method416(11453, 193);
            class70.field1729.method183(36, arg2);
            class70.field1729.method151(arg0, 76);
        }
        if (arg1 == 4) {
            class70.field1729.method416(11453, 53);
            class113.field2796++;
            class70.field1729.method183(111, arg2);
            class70.field1729.method151(arg0, -121);
        }
        if (arg1 == 5) {
            class93.field2326++;
            class70.field1729.method416(11453, 94);
            class70.field1729.method183(117, arg2);
            class70.field1729.method151(arg0, 46);
        }
        if (arg1 == 6) {
            class9.field324++;
            class70.field1729.method416(11453, 213);
            class70.field1729.method183(67, arg2);
            class70.field1729.method151(arg0, -128);
        }
        if (arg1 == 7) {
            class36.field960++;
            class70.field1729.method416(11453, 46);
            class70.field1729.method183(73, arg2);
            class70.field1729.method151(arg0, 86);
        }
        if (arg1 == 8) {
            class70.field1729.method416(11453, 130);
            class70.field1729.method183(71, arg2);
            class70.field1729.method151(arg0, 8);
            class19.field637++;
        }
        if (arg1 == 9) {
            class100.field2509++;
            class70.field1729.method416(11453, 157);
            class70.field1729.method183(40, arg2);
            class70.field1729.method151(arg0, 48);
        }
        if (arg1 == 10) {
            class100.field2444++;
            class70.field1729.method416(11453, 84);
            class70.field1729.method183(116, arg2);
            class70.field1729.method151(arg0, 110);
        }
        if (arg3 > -112) {
            field1760 = null;
        }
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(Z)V", line = 569)
    public static final synchronized void method677(boolean arg0) {
        if (arg0) {
            field1777 = null;
        }
        class131.method1032(104);
        field1771++;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V", line = 587)
    public static void method678(int arg0) {
        field1761 = null;
        field1781 = null;
        field1768 = null;
        field1773 = null;
        field1778 = null;
        field1777 = null;
        if (arg0 != 22019) {
            return;
        }
        field1759 = null;
        field1779 = null;
        field1760 = null;
        field1765 = null;
        field1780 = null;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(BI)Z", line = 607)
    public static final boolean method679(byte arg0, int arg1) {
        field1758++;
        if (arg0 <= 23) {
            method672(true);
        }
        if (arg1 < 0) {
            return false;
        }
        int var2 = class79.field1935[arg1];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        return var2 == 45;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIZ)I", line = 647)
    public static final int method680(int arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg2 & 0x3;
        if (arg3) {
            return -80;
        }
        field1762++;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return 7 - arg0;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(La;La;La;B)V", line = 682)
    public static final void method681(class1 arg0, class1 arg1, class1 arg2, byte arg3) {
        field1769++;
        int var4 = -74 / ((29 - arg3) / 57);
        class123.field3065 = arg0;
        class123.field3080 = arg2;
        class123.field3063 = arg1;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ZLbd;IBLa;ILa;I)V", line = 698)
    public static final synchronized void method682(boolean arg0, class11 arg1, int arg2, byte arg3, class1 arg4, int arg5, class1 arg6, int arg7) {
        field1763++;
        if (!class50.method523(70)) {
            return;
        }
        if (arg3 != 66) {
            method682(false, null, 120, (byte) -44, null, 71, null, -13);
        }
        int var8 = arg1.method229(0, arg4);
        int var9 = arg1.method225(arg3 - 176, var8, arg6);
        method673(arg7, true, arg5, var8, arg1, var9, arg2, arg0);
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(B)V", line = 721)
    public static final synchronized void method683(byte arg0) {
        field1772++;
        if (!class50.method523(-124)) {
            return;
        }
        if (class53.field1394) {
            byte[] var1 = class1.method25(class19.field662, class38.field1029, class14.field464, -118, class57.field1465);
            if (var1 != null) {
                if (class11.field406 >= 0) {
                    class85.method752(0, class34.field918, client.field612, var1, class11.field406);
                } else if (class120.field2988 < 0) {
                    class1.method7(2037, client.field612, var1, class34.field918);
                } else {
                    class35.method407(class34.field918, client.field612, class120.field2988, var1, -27520);
                }
                class53.field1394 = false;
                class38.field1029 = null;
            }
        }
        class117.method965(0);
        if (arg0 >= -109) {
            method676(-59, -67, 107, 108);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ZIIIILbd;I)V", line = 770)
    public static final synchronized void method684(boolean arg0, int arg1, int arg2, int arg3, int arg4, class11 arg5, int arg6) {
        field1774++;
        if (!class50.method523(arg6 ^ 0xFFFFFFF0)) {
            return;
        }
        class53.field1394 = true;
        class120.field2988 = arg6;
        class11.field406 = -1;
        class34.field918 = arg3;
        class19.field662 = arg4;
        client.field612 = arg0;
        class57.field1465 = arg1;
        class38.field1029 = arg5;
        class14.field464 = arg2;
    }
}
