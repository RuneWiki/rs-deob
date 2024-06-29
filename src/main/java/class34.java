import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class34 {

    @OriginalMember(owner = "client!f", name = "e", descriptor = "I")
    public static int field856 = 0;

    @OriginalMember(owner = "client!f", name = "n", descriptor = "Lgd;")
    public static class40 field865 = class14.method90(false, "mapback");

    @OriginalMember(owner = "client!f", name = "j", descriptor = "Lgd;")
    private static class40 field861 = class14.method90(false, " ");

    @OriginalMember(owner = "client!f", name = "r", descriptor = "I")
    public static int field869 = 1;

    @OriginalMember(owner = "client!f", name = "p", descriptor = "Lgd;")
    public static class40 field867 = field861;

    @OriginalMember(owner = "client!f", name = "q", descriptor = "I")
    public static int field868 = 0;

    @OriginalMember(owner = "client!f", name = "v", descriptor = "Lgd;")
    public static class40 field873 = class14.method90(false, "titlebutton");

    @OriginalMember(owner = "client!f", name = "l", descriptor = "Lgd;")
    public static class40 field863 = class14.method90(false, "Unerwartete Antwort vom Anmelde)2Server)3");

    @OriginalMember(owner = "client!f", name = "k", descriptor = "[I")
    public static int[] field862 = new int[] { 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800 };

    @OriginalMember(owner = "client!f", name = "o", descriptor = "Lgd;")
    public static class40 field866 = class14.method90(false, "sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1");

    @OriginalMember(owner = "client!f", name = "C", descriptor = "Lgd;")
    private static class40 field880 = class14.method90(false, "Loaded config");

    @OriginalMember(owner = "client!f", name = "m", descriptor = "Lgd;")
    public static class40 field864 = field880;

    @OriginalMember(owner = "client!f", name = "w", descriptor = "I")
    private static int field874 = 50;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "[I")
    private static int[] field855 = new int[field874];

    @OriginalMember(owner = "client!f", name = "g", descriptor = "[I")
    private static int[] field858 = new int[field874];

    @OriginalMember(owner = "client!f", name = "f", descriptor = "[I")
    private static int[] field857 = new int[field874];

    @OriginalMember(owner = "client!f", name = "u", descriptor = "[I")
    private static int[] field872 = new int[field874];

    @OriginalMember(owner = "client!f", name = "h", descriptor = "[I")
    private static int[] field859 = new int[field874];

    @OriginalMember(owner = "client!f", name = "c", descriptor = "[Lgd;")
    private static class40[] field854 = new class40[field874];

    @OriginalMember(owner = "client!f", name = "t", descriptor = "[I")
    private static int[] field871 = new int[field874];

    @OriginalMember(owner = "client!f", name = "a", descriptor = "[I")
    private static int[] field852 = new int[field874];

    @OriginalMember(owner = "client!f", name = "b", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!f", name = "i", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!f", name = "s", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!f", name = "x", descriptor = "I")
    public static int field875;

    @OriginalMember(owner = "client!f", name = "y", descriptor = "I")
    public static int field876;

    @OriginalMember(owner = "client!f", name = "z", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!f", name = "A", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!f", name = "B", descriptor = "I")
    public static int field879;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(B)V", line = 14)
    public static void method213(byte arg0) {
        field871 = null;
        field872 = null;
        field867 = null;
        if (arg0 != -32) {
            return;
        }
        field859 = null;
        field863 = null;
        field862 = null;
        field880 = null;
        field864 = null;
        field873 = null;
        field866 = null;
        field852 = null;
        field855 = null;
        field861 = null;
        field857 = null;
        field858 = null;
        field865 = null;
        field854 = null;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ZIIIIII[Lee;IIII)V", line = 51)
    public static final void method214(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class30[] arg7, int arg8, int arg9, int arg10, int arg11) {
        field853++;
        if (arg10 > arg5 || arg9 < arg4 || arg6 <= arg5 || arg1 <= arg9) {
            return;
        }
        for (int var12 = 0; var12 < arg7.length; var12++) {
            class30 var13 = arg7[var12];
            if (var13 != null && var13.field722 == arg3 && (!var13.field644 || !var13.field638 || class98.field2334)) {
                int var14 = arg10 + var13.field683 - arg8;
                int var15 = var13.field688 + arg4 - arg11;
                if (var13.field660 == 8 && var14 <= arg5 && arg9 >= var15 && var13.field700 + var14 > arg5 && arg9 < var13.field684 + var15) {
                    class44.field1097 = var12;
                }
                if ((var13.field637 >= 0 || var13.field725 != 0) && arg5 >= var14 && var15 <= arg9 && arg5 < var13.field700 + var14 && var13.field684 + var15 > arg9) {
                    if (var13.field637 < 0) {
                        class66.field1635 = var12;
                    } else {
                        class66.field1635 = var13.field637;
                    }
                }
                if (var13.field660 == 0) {
                    if (var13.field638 && !class12.method70(1, var12, arg2) && !class98.field2334) {
                        continue;
                    }
                    method214(true, var13.field684 + var15, arg2, var13.field704, var15, arg5, var13.field700 + var14, arg7, var13.field718, arg9, var14, var13.field697);
                    if (var13.field745 != null) {
                        method214(true, var13.field684 + var15, arg2, var13.field704, var15, arg5, var14 + var13.field700, var13.field745, var13.field718, arg9, var14, var13.field697);
                    }
                    if (var13.field684 < var13.field670) {
                        class58.method434(arg9, arg5, var15, var13.field670, arg2, var13, var13.field684, var13.field700 + var14, (byte) 121);
                    }
                    if (!var13.field644) {
                        continue;
                    }
                }
                if (var13.field656 == 1 && var14 <= arg5 && arg9 >= var15 && var14 + var13.field700 > arg5 && arg9 < var13.field684 + var15) {
                    boolean var16 = false;
                    if (var13.field734 != 0) {
                        var16 = class64.method464(0, var13);
                    }
                    if (!var16) {
                        client.field448++;
                        class98.method686(0, var13.field704, class125.field2966, var13.field732, 21, 0, -1);
                    }
                }
                if (var13.field656 == 2 && class110.field2682 == 0 && var14 <= arg5 && arg9 >= var15 && arg5 < var13.field700 + var14 && arg9 < var13.field684 + var15) {
                    class98.method686(0, var13.field704, client.method114(true, new class40[] { class65.field1598, var13.field711 }), var13.field733, 13, 0, -1);
                    class60.field1514++;
                }
                if (var13.field656 == 3 && arg5 >= var14 && arg9 >= var15 && arg5 < var13.field700 + var14 && var15 + var13.field684 > arg9) {
                    class113.field2737++;
                    byte var17;
                    if (arg2 == 3) {
                        var17 = 46;
                    } else {
                        var17 = 18;
                    }
                    class98.method686(0, var13.field704, class125.field2966, class12.field298, var17, 0, -1);
                }
                if (var13.field656 == 4 && arg5 >= var14 && var15 <= arg9 && arg5 < var14 + var13.field700 && var13.field684 + var15 > arg9) {
                    class98.method686(0, var13.field704, class125.field2966, var13.field732, 1, 0, -1);
                    class94.field2176++;
                }
                if (var13.field656 == 5 && var14 <= arg5 && var15 <= arg9 && arg5 < var13.field700 + var14 && var13.field684 + var15 > arg9) {
                    class98.method686(0, var13.field704, class125.field2966, var13.field732, 34, 0, -1);
                    class128.field3053++;
                }
                if (var13.field656 == 6 && class56.field1447 == -1 && var14 <= arg5 && arg9 >= var15 && var14 + var13.field700 > arg5 && arg9 < var13.field684 + var15) {
                    class126.field3003++;
                    class98.method686(0, var13.field704, class125.field2966, var13.field732, 47, 0, -1);
                }
                if (var13.field660 == 2) {
                    int var18 = 0;
                    for (int var19 = 0; var19 < var13.field684; var19++) {
                        for (int var20 = 0; var20 < var13.field700; var20++) {
                            int var21 = (var13.field636 + 32) * var19 + var15;
                            int var22 = var14 + (var13.field674 + 32) * var20;
                            if (var18 < 20) {
                                var21 += var13.field694[var18];
                                var22 += var13.field696[var18];
                            }
                            if (var22 <= arg5 && var21 <= arg9 && arg5 < var22 + 32 && arg9 < var21 + 32) {
                                class133.field3242 = var18;
                                class48.field1218 = var13.field704;
                                if (var13.field710[var18] > 0) {
                                    class4 var23 = class132.method1041(var13.field710[var18] - 1, 30);
                                    if (class137.field3344 == 1 && var13.field687) {
                                        if (class30.field748 != var13.field704 || class1.field24 != var18) {
                                            class44.field1109++;
                                            class98.method686(var18, var13.field704, client.method114(arg0, new class40[] { class103.field2460, class4.field141, var23.field114 }), class93.field2130, 6, var23.field105, -1);
                                        }
                                    } else if (class110.field2682 != 1 || !var13.field687) {
                                        client.field462++;
                                        class40[] var24 = var23.field139;
                                        if (class5.field149) {
                                            var24 = class122.method937((byte) 110, var24);
                                        }
                                        if (var13.field687) {
                                            for (int var25 = 4; var25 >= 3; var25--) {
                                                if (var24 != null && var24[var25] != null) {
                                                    class101.field2386++;
                                                    byte var26;
                                                    if (var25 == 3) {
                                                        var26 = 8;
                                                    } else {
                                                        var26 = 5;
                                                    }
                                                    class98.method686(var18, var13.field704, client.method114(true, new class40[] { class79.field1817, var23.field114 }), var24[var25], var26, var23.field105, -1);
                                                } else if (var25 == 4) {
                                                    class98.method686(var18, var13.field704, client.method114(true, new class40[] { class79.field1817, var23.field114 }), class48.field1232, 5, var23.field105, -1);
                                                    class56.field1454++;
                                                }
                                            }
                                        }
                                        if (var13.field713) {
                                            class29.field625++;
                                            class98.method686(var18, var13.field704, client.method114(true, new class40[] { class79.field1817, var23.field114 }), class93.field2130, 25, var23.field105, -1);
                                        }
                                        if (var13.field687 && var24 != null) {
                                            for (int var27 = 2; var27 >= 0; var27--) {
                                                if (var24[var27] != null) {
                                                    class99.field2351++;
                                                    byte var28 = 0;
                                                    if (var27 == 0) {
                                                        var28 = 54;
                                                    }
                                                    if (var27 == 1) {
                                                        var28 = 20;
                                                    }
                                                    if (var27 == 2) {
                                                        var28 = 26;
                                                    }
                                                    class98.method686(var18, var13.field704, client.method114(true, new class40[] { class79.field1817, var23.field114 }), var24[var27], var28, var23.field105, -1);
                                                }
                                            }
                                        }
                                        class40[] var29 = var13.field728;
                                        if (class5.field149) {
                                            var29 = class122.method937((byte) 44, var29);
                                        }
                                        if (var29 != null) {
                                            for (int var30 = 4; var30 >= 0; var30--) {
                                                if (var29[var30] != null) {
                                                    class65.field1600++;
                                                    byte var31 = 0;
                                                    if (var30 == 0) {
                                                        var31 = 19;
                                                    }
                                                    if (var30 == 1) {
                                                        var31 = 30;
                                                    }
                                                    if (var30 == 2) {
                                                        var31 = 24;
                                                    }
                                                    if (var30 == 3) {
                                                        var31 = 33;
                                                    }
                                                    if (var30 == 4) {
                                                        var31 = 17;
                                                    }
                                                    class98.method686(var18, var13.field704, client.method114(true, new class40[] { class79.field1817, var23.field114 }), var29[var30], var31, var23.field105, -1);
                                                }
                                            }
                                        }
                                        class98.method686(var18, var13.field704, client.method114(true, new class40[] { class79.field1817, var23.field114 }), class52.field1325, 1006, var23.field105, -1);
                                    } else if ((class107.field2618 & 0x10) == 16) {
                                        class43.field1076++;
                                        class98.method686(var18, var13.field704, client.method114(true, new class40[] { class4.field76, class4.field141, var23.field114 }), class2.field39, 40, var23.field105, -1);
                                    }
                                }
                            }
                            var18++;
                        }
                    }
                }
                if (var13.field666 && class110.field2682 == 1 && (class107.field2618 & 0x20) == 32) {
                    if (arg5 >= var14 && arg9 >= var15 && arg5 < var13.field700 + var14 && var13.field684 + var15 > arg9) {
                        if (var13.field704 < 0) {
                            class98.method686(var13.field704 & 0x7FFF, var13.field722, client.method114(true, new class40[] { class4.field76, class86.field1928, var13.field668 }), class2.field39, 32, 0, -1);
                        } else {
                            class98.method686(-1, var13.field704, client.method114(true, new class40[] { class4.field76, class86.field1928, var13.field668 }), class2.field39, 32, 0, -1);
                        }
                        class69.field1661++;
                    }
                } else if (var13.field655 && var13.field743 != null && class110.field2682 == 0 && arg5 >= var14 && var15 <= arg9 && arg5 < var13.field700 + var14 && arg9 < var13.field684 + var15) {
                    for (int var32 = var13.field743.length - 1; var32 >= 0; var32--) {
                        if (var13.field743[var32] != null) {
                            if (var13.field704 < 0) {
                                class98.method686(var13.field704 & 0x7FFF, var13.field722, var13.field668, var13.field743[var32], 31, var32 + 1, -1);
                            } else {
                                class98.method686(-1, var13.field704, var13.field668, var13.field743[var32], 31, var32 + 1, -1);
                            }
                            field876++;
                        }
                    }
                }
            }
        }
        if (!arg0) {
            method217(46);
        }
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(B)V", line = 453)
    public static final void method215(byte arg0) {
        try {
            Graphics var1 = class30.field761.getGraphics();
            class108.field2622.method465(-99, 357, var1, 17);
        } catch (Exception var2) {
            class30.field761.repaint();
        }
        field877++;
        if (arg0 != 44) {
            method218(-40, 35);
        }
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "(B)V", line = 485)
    public static final void method216(byte arg0) {
        field870++;
        for (int var1 = -1; var1 < class1.field18; var1++) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = class77.field1787[var1];
            }
            class96 var6 = class90.field2044[var5];
            if (var6 != null && var6.field817 > 0) {
                var6.field817--;
                if (var6.field817 == 0) {
                    var6.field796 = null;
                }
            }
        }
        if (arg0 >= -72) {
            method213((byte) -22);
        }
        for (int var2 = 0; var2 < class23.field548; var2++) {
            int var3 = class115.field2763[var2];
            class23 var4 = class130.field3142[var3];
            if (var4 != null && var4.field817 > 0) {
                var4.field817--;
                if (var4.field817 == 0) {
                    var4.field796 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V", line = 547)
    public static final void method217(int arg0) {
        if (arg0 != -100) {
            field855 = null;
        }
        class101.field2409 = 0;
        field878++;
        for (int var1 = -1; var1 < class23.field548 + class1.field18; var1++) {
            class31 var18;
            if (var1 == -1) {
                var18 = class13.field332;
            } else if (var1 >= class1.field18) {
                var18 = class130.field3142[class115.field2763[var1 - class1.field18]];
            } else {
                var18 = class90.field2044[class77.field1787[var1]];
            }
            if (var18 != null && var18.method135(25)) {
                if (var18 instanceof class23) {
                    class128 var19 = ((class23) var18).field531;
                    if (var19.field3023 != null) {
                        var19 = var19.method1009(4);
                    }
                    if (var19 == null) {
                        continue;
                    }
                }
                if (class1.field18 <= var1) {
                    class128 var20 = ((class23) var18).field531;
                    if (var20.field3033 >= 0 && var20.field3033 < class45.field1126.length) {
                        class86.method563(var18, var18.field820 + 15, 0);
                        if (class16.field421 > -1) {
                            class45.field1126[var20.field3033].method342(class16.field421 - 12, class23.field536 + -30);
                        }
                    }
                    if (class96.field2205 == 1 && class115.field2763[var1 - class1.field18] == class29.field618 && class10.field242 % 20 < 10) {
                        class86.method563(var18, var18.field820 + 15, arg0 + 100);
                        if (class16.field421 > -1) {
                            class107.field2600[0].method342(class16.field421 - 12, class23.field536 + -28);
                        }
                    }
                } else {
                    class96 var21 = (class96) var18;
                    int var22 = 30;
                    if (var21.field2233 != -1 || var21.field2213 != -1) {
                        class86.method563(var18, var18.field820 + 15, 0);
                        if (class16.field421 > -1) {
                            if (var21.field2233 != -1) {
                                class114.field2745[var21.field2233].method342(class16.field421 - 12, -var22 + class23.field536);
                                var22 += 25;
                            }
                            if (var21.field2213 != -1) {
                                class45.field1126[var21.field2213].method342(class16.field421 - 12, -var22 + class23.field536);
                                var22 += 25;
                            }
                        }
                    }
                    if (var1 >= 0 && class96.field2205 == 10 && class77.field1787[var1] == class16.field423) {
                        class86.method563(var18, var18.field820 + 15, arg0 + 100);
                        if (class16.field421 > -1) {
                            class107.field2600[1].method342(class16.field421 - 12, -var22 + class23.field536);
                        }
                    }
                }
                if (var18.field796 != null && (var1 >= class1.field18 || class1.field23 == 0 || class1.field23 == 3 || class1.field23 == 1 && class66.method478(true, ((class96) var18).field2210))) {
                    class86.method563(var18, var18.field820, 0);
                    if (class16.field421 > -1 && field874 > class101.field2409) {
                        field871[class101.field2409] = class1.field17.method367(var18.field796) / 2;
                        field859[class101.field2409] = class1.field17.field1171;
                        field872[class101.field2409] = class16.field421;
                        field858[class101.field2409] = class23.field536;
                        field857[class101.field2409] = var18.field836;
                        field855[class101.field2409] = var18.field810;
                        field852[class101.field2409] = var18.field817;
                        field854[class101.field2409] = var18.field796;
                        class101.field2409++;
                    }
                }
                if (var18.field764 > class10.field242) {
                    class86.method563(var18, var18.field820 + 15, 0);
                    if (class16.field421 > -1) {
                        int var23 = var18.field834 * 30 / var18.field765;
                        if (var23 > 30) {
                            var23 = 30;
                        }
                        class27.method164(class16.field421 - 15, class23.field536 + -3, var23, 5, 65280);
                        class27.method164(class16.field421 + var23 - 15, class23.field536 + -3, 30 - var23, 5, 16711680);
                    }
                }
                for (int var24 = 0; var24 < 4; var24++) {
                    if (class10.field242 < var18.field790[var24]) {
                        class86.method563(var18, var18.field820 / 2, 0);
                        if (class16.field421 > -1) {
                            if (var24 == 1) {
                                class23.field536 -= 20;
                            }
                            if (var24 == 2) {
                                class16.field421 -= 15;
                                class23.field536 -= 10;
                            }
                            if (var24 == 3) {
                                class16.field421 += 15;
                                class23.field536 -= 10;
                            }
                            class93.field2139[var18.field823[var24]].method342(class16.field421 - 12, class23.field536 - 12);
                            class77.field1778.method349(class21.method121(23444, var18.field763[var24]), class16.field421, class23.field536 + 4, 0);
                            class77.field1778.method349(class21.method121(arg0 + 23544, var18.field763[var24]), class16.field421 - 1, class23.field536 + 3, 16777215);
                        }
                    }
                }
            }
        }
        for (int var2 = 0; var2 < class101.field2409; var2++) {
            int var3 = field872[var2];
            int var4 = field858[var2];
            int var5 = field871[var2];
            int var6 = field859[var2];
            boolean var7 = true;
            while (var7) {
                var7 = false;
                for (int var17 = 0; var17 < var2; var17++) {
                    if (field858[var17] - field859[var17] < var4 + 2 && var4 - var6 < field858[var17] + 2 && var3 - var5 < field872[var17] + field871[var17] && field872[var17] - field871[var17] < var3 - -var5 && var4 > field858[var17] - field859[var17]) {
                        var4 = field858[var17] - field859[var17];
                        var7 = true;
                    }
                }
            }
            class16.field421 = field872[var2];
            class23.field536 = field858[var2] = var4;
            class40 var8 = field854[var2];
            if (class8.field205 == 0) {
                int var9 = 16776960;
                if (field857[var2] < 6) {
                    var9 = class76.field1745[field857[var2]];
                }
                if (field857[var2] == 6) {
                    var9 = class2.field40 % 20 >= 10 ? 16776960 : 16711680;
                }
                if (field857[var2] == 7) {
                    var9 = class2.field40 % 20 >= 10 ? 65535 : 255;
                }
                if (field857[var2] == 8) {
                    var9 = class2.field40 % 20 >= 10 ? 8454016 : 45056;
                }
                if (field857[var2] == 9) {
                    int var10 = 150 - field852[var2];
                    if (var10 < 50) {
                        var9 = var10 * 1280 + 16711680;
                    } else if (var10 < 100) {
                        var9 = 16776960 - (var10 - 50) * 327680;
                    } else if (var10 < 150) {
                        var9 = (var10 - 100) * 5 + 65280;
                    }
                }
                if (field857[var2] == 10) {
                    int var11 = 150 - field852[var2];
                    if (var11 < 50) {
                        var9 = var11 * 5 + 16711680;
                    } else if (var11 < 100) {
                        var9 = 16711935 - (var11 - 50) * 327680;
                    } else if (var11 < 150) {
                        var9 = (var11 - 100) * 327680 + 255 - (var11 - 100) * 5;
                    }
                }
                if (field857[var2] == 11) {
                    int var12 = 150 - field852[var2];
                    if (var12 < 50) {
                        var9 = 16777215 - var12 * 327685;
                    } else if (var12 < 100) {
                        var9 = (var12 - 50) * 327685 + 65280;
                    } else if (var12 < 150) {
                        var9 = 32768000 + 16777215 - var12 * 327680;
                    }
                }
                if (field855[var2] == 0) {
                    class1.field17.method349(var8, class16.field421, class23.field536 + 1, 0);
                    class1.field17.method349(var8, class16.field421, class23.field536, var9);
                }
                if (field855[var2] == 1) {
                    class1.field17.method355(var8, class16.field421, class23.field536 + 1, 0, class2.field40);
                    class1.field17.method355(var8, class16.field421, class23.field536, var9, class2.field40);
                }
                if (field855[var2] == 2) {
                    class1.field17.method359(var8, class16.field421, class23.field536 + 1, 0, class2.field40);
                    class1.field17.method359(var8, class16.field421, class23.field536, var9, class2.field40);
                }
                if (field855[var2] == 3) {
                    class1.field17.method360(var8, class16.field421, class23.field536 + 1, 0, class2.field40, 150 - field852[var2]);
                    class1.field17.method360(var8, class16.field421, class23.field536, var9, class2.field40, 150 - field852[var2]);
                }
                if (field855[var2] == 4) {
                    int var13 = class1.field17.method367(var8);
                    int var14 = (150 - field852[var2]) * (var13 + 100) / 150;
                    class27.method166(class16.field421 - 50, 0, class16.field421 + 50, 334);
                    class1.field17.method353(var8, class16.field421 + 50 - var14, class23.field536 + 1, 0);
                    class1.field17.method353(var8, class16.field421 + 50 - var14, class23.field536, var9);
                    class27.method169();
                }
                if (field855[var2] == 5) {
                    int var15 = 0;
                    int var16 = 150 - field852[var2];
                    class27.method166(0, class23.field536 - class1.field17.field1171 - 1, 512, class23.field536 + 5);
                    if (var16 < 25) {
                        var15 = var16 - 25;
                    } else if (var16 > 125) {
                        var15 = var16 - 125;
                    }
                    class1.field17.method349(var8, class16.field421, class23.field536 + var15 + 1, 0);
                    class1.field17.method349(var8, class16.field421, class23.field536 + var15, var9);
                    class27.method169();
                }
            } else {
                class1.field17.method349(var8, class16.field421, class23.field536 + 1, 0);
                class1.field17.method349(var8, class16.field421, class23.field536, 16776960);
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(II)Ld;", line = 933)
    public static final class22 method218(int arg0, int arg1) {
        field879++;
        class22 var2 = (class22) class40.field972.method39(-126, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        if (arg1 != 14925) {
            method214(true, 20, 54, 32, 30, -127, 117, null, 96, 77, 0, 19);
        }
        byte[] var3 = class16.field428.method731(arg0, 4, (byte) -127);
        class22 var4 = new class22();
        if (var3 != null) {
            var4.method127((byte) 106, new class104(var3), arg0);
        }
        var4.method129(false);
        class40.field972.method38(var4, (long) arg0, true);
        return var4;
    }
}
