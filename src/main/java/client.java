import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class62 {

    @OriginalMember(owner = "client!client", name = "V", descriptor = "Ljava/lang/String;")
    public static String field3601 = "Your ignore list is full. Max of 100 users.";

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "F")
    public static float field3605 = 128.0F;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "Ljava/lang/String;")
    public static String field3614 = "red:";

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "[I")
    private static int[] field3616 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field3617 = 100;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field3619 = -1;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field3598;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field3599;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field3602;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field3603;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field3604;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field3607;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field3608;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field3610;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field3611;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field3612;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field3613;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field3615;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field3618;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field3620;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "Ljj;")
    public static class134 field3609;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "Z")
    public static boolean field3622;

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field3620++;
        if (!this.method486(0)) {
            return;
        }
        class96.field1456 = Integer.parseInt(this.getParameter("worldid"));
        class92.field1312 = Integer.parseInt(this.getParameter("modewhere"));
        if (class92.field1312 < 0 || class92.field1312 > 1) {
            class92.field1312 = 0;
        }
        class284.field4546 = Integer.parseInt(this.getParameter("modewhat"));
        if (class284.field4546 < 0 || class284.field4546 > 2) {
            class284.field4546 = 0;
        }
        String var1 = this.getParameter("advertsuppressed");
        if (var1 != null && var1.equals("1")) {
            class238.field3793 = true;
        } else {
            class238.field3793 = false;
        }
        try {
            class261.field4147 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var9) {
            class261.field4147 = 0;
        }
        class162.method1116(class261.field4147, 1061);
        String var2 = this.getParameter("objecttag");
        if (var2 != null && var2.equals("1")) {
            class221.field3528 = true;
        } else {
            class221.field3528 = false;
        }
        String var3 = this.getParameter("js");
        if (var3 != null && var3.equals("1")) {
            class256.field4096 = true;
        } else {
            class256.field4096 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class189.field3026 = 1;
        } else {
            class189.field3026 = 0;
        }
        try {
            class286.field4561 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var8) {
            class286.field4561 = 0;
        }
        class236.field3762 = this.getParameter("settings");
        if (class236.field3762 == null) {
            class236.field3762 = "";
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class73.field1003 = Integer.parseInt(var5);
            } catch (Exception var7) {
                class73.field1003 = 0;
            }
        }
        String var6 = this.getParameter("haveie6");
        if (var6 != null && var6.equals("1")) {
            class274.field4421 = true;
        } else {
            class274.field4421 = false;
        }
        class85.field1168 = this;
        this.method485((byte) -100, 543, class284.field4546 + 32, 765, 503);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
    private final void method1500(int arg0, int arg1) {
        class272.field4393 = arg0;
        class30.field374.field3329++;
        class297.field4706 = null;
        class30.field374.field3327 = arg1;
        class85.field1156 = null;
        field3611++;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I[B)V")
    private final void method1501(int arg0, byte[] arg1) {
        field3610++;
        class264 var3 = new class264(arg1);
        while (true) {
            int var4 = var3.method1779(-77);
            if (var4 == 0) {
                if (arg0 != 2061) {
                    method1506((class103) null);
                    return;
                }
                return;
            }
            if (var4 == 1) {
                var3.method1777(-72);
                var3.method1777(-74);
                var3.method1777(arg0 ^ 0xFFFFF7CE);
                var3.method1777(-55);
                var3.method1777(arg0 ^ 0xFFFFF7B5);
                var3.method1777(-127);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public static void method1502(byte arg0) {
        field3616 = null;
        field3601 = null;
        field3609 = null;
        field3614 = null;
        if (arg0 != 71) {
            method1507(7, 126);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
    public final void method468(int arg0) {
        field3615++;
        if (class21.field249 == 1000) {
            return;
        }
        long var2 = class103.method732(1) / 1000000L - class238.field3812;
        class238.field3812 = class103.method732(arg0 + 11) / 1000000L;
        boolean var4 = class243.method1600((byte) 102);
        if (var4 && class82.field1141 && class226.field3580 != null) {
            class226.field3580.method744((byte) 123);
        }
        if (arg0 != -10) {
            return;
        }
        if ((class21.field249 == 30 || class21.field249 == 10) && (class243.field3899 || class159.field2597 != 0L && class182.method1253(20215) > class159.field2597)) {
            class8.method50((byte) -114, class285.field4549, class283.field4508, class243.field3899, class195.method1321(true));
        }
        if (class87.field1188 == null) {
            Container var5;
            if (class87.field1188 != null) {
                var5 = class87.field1188;
            } else if (class284.field4537 == null) {
                var5 = class250.field4006.field4090;
            } else {
                var5 = class284.field4537;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class284.field4537 == var5) {
                Insets var8 = class284.field4537.getInsets();
                var7 -= var8.top + var8.bottom;
                var6 -= var8.left + var8.right;
            }
            if (class207.field3337 != var6 || class7.field107 != var7) {
                if (class255.field4084.startsWith("mac")) {
                    class207.field3337 = var6;
                    class7.field107 = var7;
                } else {
                    class83.method604(false);
                }
                class159.field2597 = class182.method1253(20215) + 500L;
            }
        }
        boolean var9 = false;
        if (class128.field2143) {
            var9 = true;
            class128.field2143 = false;
        }
        if (var9) {
            class241.method1588(122);
        }
        if (class21.field249 == 0) {
            class82.method603((byte) -87, class152.field2456, (Color) null, class92.field1314, var9);
        } else if (class21.field249 == 5) {
            class247.method1629((byte) -48, class283.field4524, false);
        } else if (class21.field249 == 10) {
            class143.method968(-9594);
        } else if (class21.field249 == 25 || class21.field249 == 28) {
            if (class108.field1878 == 1) {
                if (class67.field951 > class101.field1527) {
                    class101.field1527 = class67.field951;
                }
                int var11 = (class101.field1527 - class67.field951) * 50 / class101.field1527;
                class157.method1059(arg0 ^ 0xFFFFFFF6, class21.field256 + "<br>(" + var11 + "%)", false);
            } else if (class108.field1878 == 2) {
                if (class7.field106 > class111.field1921) {
                    class111.field1921 = class7.field106;
                }
                int var10 = (class111.field1921 - class7.field106) * 50 / class111.field1921 + 50;
                class157.method1059(arg0 + 10, class21.field256 + "<br>(" + var10 + "%)", false);
            } else {
                class157.method1059(0, class21.field256, false);
            }
        } else if (class21.field249 == 30) {
            class264.method1776(11056, var2);
        } else if (class21.field249 == 40) {
            class157.method1059(arg0 ^ 0xFFFFFFF6, class258.field4115 + "<br>" + class155.field2493, false);
        }
        if ((class21.field249 == 30 || class21.field249 == 10) && class87.field1186 == 0 && !var9) {
            try {
                Graphics var14 = class38.field458.getGraphics();
                for (int var15 = 0; var15 < class154.field2482; var15++) {
                    if (class217.field3482[var15]) {
                        class217.field3478.method422(class236.field3767[var15], false, class186.field2989[var15], class85.field1153[var15], var14, class233.field3710[var15]);
                        class217.field3482[var15] = false;
                    }
                }
            } catch (Exception var16) {
                class38.field458.repaint();
            }
        } else if (class21.field249 != 0) {
            try {
                Graphics var12 = class38.field458.getGraphics();
                class217.field3478.method427(0, var12, 0, arg0 ^ 0xE2D);
                for (int var13 = 0; var13 < class154.field2482; var13++) {
                    class217.field3482[var13] = false;
                }
            } catch (Exception var17) {
                class38.field458.repaint();
            }
        }
        if (class17.field200) {
            class48.method364(-120);
        }
        if (class119.field2006 && class21.field249 == 10 && class113.field1944 != -1) {
            class119.field2006 = false;
            class101.method712(85, class250.field4006);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Leb;IIIIIII)V")
    public static final void method1503(class103[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class103 var9 = arg0[var8];
            if (var9 != null && var9.field1602 == arg1 && (!var9.field1603 || var9.field1655 == 0 || var9.field1568 || method1511(var9).field350 != 0 || class264.field4212 == var9 || var9.field1716 == 1338) && (!var9.field1603 || !method1506(var9))) {
                int var10 = var9.field1679 + arg6;
                int var11 = var9.field1707 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field1655 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field1691 + var10;
                    int var17 = var9.field1693 + var11;
                    if (var9.field1655 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class238.field3815 == var9) {
                    class189.field3020 = true;
                    class129.field2162 = var10;
                    class205.field3284 = var11;
                }
                if (!var9.field1603 || var12 < var14 && var13 < var15) {
                    if (var9.field1655 == 0) {
                        if (!var9.field1603 && method1506(var9) && class268.field4348 != var9) {
                            continue;
                        }
                        if (var9.field1651 && class109.field1893 >= var12 && class250.field4000 >= var13 && class109.field1893 < var14 && class250.field4000 < var15) {
                            for (class173 var18 = (class173) class136.field2259.method365(3); var18 != null; var18 = (class173) class136.field2259.method372((byte) 7)) {
                                if (var18.field2786) {
                                    var18.method544(-58);
                                    var18.field2796.field1686 = false;
                                }
                            }
                            if (class170.field2753 == 0) {
                                class238.field3815 = null;
                                class264.field4212 = null;
                            }
                            class244.field3905 = 0;
                        }
                    }
                    if (var9.field1603) {
                        boolean var19;
                        if (class109.field1893 >= var12 && class250.field4000 >= var13 && class109.field1893 < var14 && class250.field4000 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class205.field3293 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class58.field815 == 1 && class266.field4319 >= var12 && class232.field3696 >= var13 && class266.field4319 < var14 && class232.field3696 < var15) {
                            var21 = true;
                        }
                        if (var9.field1582 != null) {
                            for (int var22 = 0; var22 < var9.field1582.length; var22++) {
                                if (class247.field3975[var9.field1582[var22]]) {
                                    if (var9.field1719 == null || class9.field141 >= var9.field1719[var22]) {
                                        byte var23 = var9.field1674[var22];
                                        if (var23 == 0 || ((var23 & 0x8) == 0 || !class247.field3975[86] && !class247.field3975[82] && !class247.field3975[81]) && ((var23 & 0x2) == 0 || class247.field3975[86]) && ((var23 & 0x1) == 0 || class247.field3975[82]) && ((var23 & 0x4) == 0 || class247.field3975[81])) {
                                            class265.method1791(-1, "", var9.field1659, -25002, var22 + 1);
                                            int var24 = var9.field1666[var22];
                                            if (var9.field1719 == null) {
                                                var9.field1719 = new int[var9.field1582.length];
                                            }
                                            if (var24 == 0) {
                                                var9.field1719[var22] = Integer.MAX_VALUE;
                                            } else {
                                                var9.field1719[var22] = class9.field141 + var24;
                                            }
                                        }
                                    }
                                } else if (var9.field1719 != null) {
                                    var9.field1719[var22] = 0;
                                }
                            }
                        }
                        if (var21) {
                            class122.method852(-81, var9, class266.field4319 - var10, class232.field3696 - var11);
                        }
                        if (class238.field3815 != null && class238.field3815 != var9 && var19 && method1511(var9).method195((byte) 87)) {
                            class33.field396 = var9;
                        }
                        if (class264.field4212 == var9) {
                            class44.field524 = true;
                            class206.field3305 = var10;
                            class44.field528 = var11;
                        }
                        if (var9.field1568 || var9.field1716 != 0) {
                            if (var19 && class203.field3269 != 0 && var9.field1607 != null) {
                                class173 var25 = new class173();
                                var25.field2786 = true;
                                var25.field2796 = var9;
                                var25.field2785 = class203.field3269;
                                var25.field2798 = var9.field1607;
                                class136.field2259.method363(66, var25);
                            }
                            if (class238.field3815 != null || class258.field4114 != null || class240.field3852 || var9.field1716 != 1400 && class244.field3905 > 0) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field1716 != 0) {
                                if (var9.field1716 == 1337) {
                                    class191.field3056 = var9;
                                    continue;
                                }
                                if (var9.field1716 == 1338) {
                                    if (var21) {
                                        class218.field3488 = class266.field4319 - var10;
                                        class73.field994 = class232.field3696 - var11;
                                    }
                                    continue;
                                }
                                if (var9.field1716 == 1400) {
                                    class219.field3506 = var9;
                                    if (var21) {
                                        if (class247.field3975[82] && class151.field2420 > 0) {
                                            int var26 = (int) ((double) (class266.field4319 - var10 - var9.field1691 / 2) * 2.0D / (double) class130.field2168);
                                            int var27 = (int) ((double) (class232.field3696 - var11 - var9.field1693 / 2) * 2.0D / (double) class130.field2168);
                                            int var28 = class122.field2048 + var26;
                                            int var29 = class266.field4320 + var27;
                                            int var30 = class129.field2149 + var28;
                                            int var31 = class225.field3569 + class73.field1002 - var29 - 1;
                                            class125 var32 = class161.method1108(0);
                                            int[] var33 = var32.method873(var31, var30, 44);
                                            if (var33 != null) {
                                                class217.method1444(48, var33[2], var33[1], var33[0]);
                                                class223.method1482(-71);
                                            }
                                            continue;
                                        }
                                        class244.field3905 = 1;
                                        class278.field4454 = class109.field1893;
                                        class230.field3662 = class250.field4000;
                                        continue;
                                    }
                                    if (var20 && class244.field3905 > 0) {
                                        if (class244.field3905 == 1 && (class278.field4454 != class109.field1893 || class250.field4000 != class230.field3662)) {
                                            class25.field307 = class122.field2048;
                                            class265.field4284 = class266.field4320;
                                            class244.field3905 = 2;
                                        }
                                        if (class244.field3905 == 2) {
                                            class199.method1345(0, (int) ((double) (class278.field4454 - class109.field1893) * 2.0D / (double) class109.field1894) + class25.field307);
                                            class279.method1867(-1, (int) ((double) (class230.field3662 - class250.field4000) * 2.0D / (double) class109.field1894) + class265.field4284);
                                        }
                                        continue;
                                    }
                                    class244.field3905 = 0;
                                    continue;
                                }
                                if (var9.field1716 == 1401) {
                                    if (var20) {
                                        class201.method1354(var9.field1691, class109.field1893 - var10, (byte) -46, var9.field1693, class250.field4000 - var11);
                                    }
                                    continue;
                                }
                                if (var9.field1716 == 1402) {
                                    class45.method346((byte) 127, var9);
                                    continue;
                                }
                            }
                            if (!var9.field1625 && var21) {
                                var9.field1625 = true;
                                if (var9.field1646 != null) {
                                    class173 var34 = new class173();
                                    var34.field2786 = true;
                                    var34.field2796 = var9;
                                    var34.field2789 = class266.field4319 - var10;
                                    var34.field2785 = class232.field3696 - var11;
                                    var34.field2798 = var9.field1646;
                                    class136.field2259.method363(-107, var34);
                                }
                            }
                            if (var9.field1625 && var20 && var9.field1685 != null) {
                                class173 var35 = new class173();
                                var35.field2786 = true;
                                var35.field2796 = var9;
                                var35.field2789 = class109.field1893 - var10;
                                var35.field2785 = class250.field4000 - var11;
                                var35.field2798 = var9.field1685;
                                class136.field2259.method363(-125, var35);
                            }
                            if (var9.field1625 && !var20) {
                                var9.field1625 = false;
                                if (var9.field1636 != null) {
                                    class173 var36 = new class173();
                                    var36.field2786 = true;
                                    var36.field2796 = var9;
                                    var36.field2789 = class109.field1893 - var10;
                                    var36.field2785 = class250.field4000 - var11;
                                    var36.field2798 = var9.field1636;
                                    class127.field2122.method363(126, var36);
                                }
                            }
                            if (var20 && var9.field1650 != null) {
                                class173 var37 = new class173();
                                var37.field2786 = true;
                                var37.field2796 = var9;
                                var37.field2789 = class109.field1893 - var10;
                                var37.field2785 = class250.field4000 - var11;
                                var37.field2798 = var9.field1650;
                                class136.field2259.method363(43, var37);
                            }
                            if (!var9.field1686 && var19) {
                                var9.field1686 = true;
                                if (var9.field1589 != null) {
                                    class173 var38 = new class173();
                                    var38.field2786 = true;
                                    var38.field2796 = var9;
                                    var38.field2789 = class109.field1893 - var10;
                                    var38.field2785 = class250.field4000 - var11;
                                    var38.field2798 = var9.field1589;
                                    class136.field2259.method363(-107, var38);
                                }
                            }
                            if (var9.field1686 && var19 && var9.field1656 != null) {
                                class173 var39 = new class173();
                                var39.field2786 = true;
                                var39.field2796 = var9;
                                var39.field2789 = class109.field1893 - var10;
                                var39.field2785 = class250.field4000 - var11;
                                var39.field2798 = var9.field1656;
                                class136.field2259.method363(65, var39);
                            }
                            if (var9.field1686 && !var19) {
                                var9.field1686 = false;
                                if (var9.field1574 != null) {
                                    class173 var40 = new class173();
                                    var40.field2786 = true;
                                    var40.field2796 = var9;
                                    var40.field2789 = class109.field1893 - var10;
                                    var40.field2785 = class250.field4000 - var11;
                                    var40.field2798 = var9.field1574;
                                    class127.field2122.method363(-126, var40);
                                }
                            }
                            if (var9.field1620 != null) {
                                class173 var41 = new class173();
                                var41.field2796 = var9;
                                var41.field2798 = var9.field1620;
                                class8.field114.method363(43, var41);
                            }
                            if (var9.field1629 != null && class188.field3012 > var9.field1654) {
                                if (var9.field1706 == null || class188.field3012 - var9.field1654 > 32) {
                                    class173 var46 = new class173();
                                    var46.field2796 = var9;
                                    var46.field2798 = var9.field1629;
                                    class136.field2259.method363(40, var46);
                                } else {
                                    label572: for (int var42 = var9.field1654; var42 < class188.field3012; var42++) {
                                        int var43 = class5.field56[var42 & 0x1F];
                                        for (int var44 = 0; var44 < var9.field1706.length; var44++) {
                                            if (var9.field1706[var44] == var43) {
                                                class173 var45 = new class173();
                                                var45.field2796 = var9;
                                                var45.field2798 = var9.field1629;
                                                class136.field2259.method363(-104, var45);
                                                break label572;
                                            }
                                        }
                                    }
                                }
                                var9.field1654 = class188.field3012;
                            }
                            if (var9.field1638 != null && class58.field811 > var9.field1627) {
                                if (var9.field1581 == null || class58.field811 - var9.field1627 > 32) {
                                    class173 var51 = new class173();
                                    var51.field2796 = var9;
                                    var51.field2798 = var9.field1638;
                                    class136.field2259.method363(-104, var51);
                                } else {
                                    label548: for (int var47 = var9.field1627; var47 < class58.field811; var47++) {
                                        int var48 = class275.field4438[var47 & 0x1F];
                                        for (int var49 = 0; var49 < var9.field1581.length; var49++) {
                                            if (var9.field1581[var49] == var48) {
                                                class173 var50 = new class173();
                                                var50.field2796 = var9;
                                                var50.field2798 = var9.field1638;
                                                class136.field2259.method363(-107, var50);
                                                break label548;
                                            }
                                        }
                                    }
                                }
                                var9.field1627 = class58.field811;
                            }
                            if (var9.field1630 != null && class217.field3479 > var9.field1616) {
                                if (var9.field1578 == null || class217.field3479 - var9.field1616 > 32) {
                                    class173 var56 = new class173();
                                    var56.field2796 = var9;
                                    var56.field2798 = var9.field1630;
                                    class136.field2259.method363(37, var56);
                                } else {
                                    label524: for (int var52 = var9.field1616; var52 < class217.field3479; var52++) {
                                        int var53 = class189.field3017[var52 & 0x1F];
                                        for (int var54 = 0; var54 < var9.field1578.length; var54++) {
                                            if (var9.field1578[var54] == var53) {
                                                class173 var55 = new class173();
                                                var55.field2796 = var9;
                                                var55.field2798 = var9.field1630;
                                                class136.field2259.method363(108, var55);
                                                break label524;
                                            }
                                        }
                                    }
                                }
                                var9.field1616 = class217.field3479;
                            }
                            if (var9.field1653 != null && class218.field3484 > var9.field1709) {
                                if (var9.field1575 == null || class218.field3484 - var9.field1709 > 32) {
                                    class173 var61 = new class173();
                                    var61.field2796 = var9;
                                    var61.field2798 = var9.field1653;
                                    class136.field2259.method363(-121, var61);
                                } else {
                                    label500: for (int var57 = var9.field1709; var57 < class218.field3484; var57++) {
                                        int var58 = class273.field4416[var57 & 0x1F];
                                        for (int var59 = 0; var59 < var9.field1575.length; var59++) {
                                            if (var9.field1575[var59] == var58) {
                                                class173 var60 = new class173();
                                                var60.field2796 = var9;
                                                var60.field2798 = var9.field1653;
                                                class136.field2259.method363(93, var60);
                                                break label500;
                                            }
                                        }
                                    }
                                }
                                var9.field1709 = class218.field3484;
                            }
                            if (var9.field1704 != null && class109.field1897 > var9.field1604) {
                                if (var9.field1560 == null || class109.field1897 - var9.field1604 > 32) {
                                    class173 var66 = new class173();
                                    var66.field2796 = var9;
                                    var66.field2798 = var9.field1704;
                                    class136.field2259.method363(40, var66);
                                } else {
                                    label476: for (int var62 = var9.field1604; var62 < class109.field1897; var62++) {
                                        int var63 = class220.field3512[var62 & 0x1F];
                                        for (int var64 = 0; var64 < var9.field1560.length; var64++) {
                                            if (var9.field1560[var64] == var63) {
                                                class173 var65 = new class173();
                                                var65.field2796 = var9;
                                                var65.field2798 = var9.field1704;
                                                class136.field2259.method363(-127, var65);
                                                break label476;
                                            }
                                        }
                                    }
                                }
                                var9.field1604 = class109.field1897;
                            }
                            if (class143.field2326 > var9.field1622 && var9.field1611 != null) {
                                class173 var67 = new class173();
                                var67.field2796 = var9;
                                var67.field2798 = var9.field1611;
                                class136.field2259.method363(74, var67);
                            }
                            if (class204.field3273 > var9.field1622 && var9.field1628 != null) {
                                class173 var68 = new class173();
                                var68.field2796 = var9;
                                var68.field2798 = var9.field1628;
                                class136.field2259.method363(-124, var68);
                            }
                            if (class264.field4242 > var9.field1622 && var9.field1550 != null) {
                                class173 var69 = new class173();
                                var69.field2796 = var9;
                                var69.field2798 = var9.field1550;
                                class136.field2259.method363(-107, var69);
                            }
                            if (class264.field4182 > var9.field1622 && var9.field1648 != null) {
                                class173 var70 = new class173();
                                var70.field2796 = var9;
                                var70.field2798 = var9.field1648;
                                class136.field2259.method363(107, var70);
                            }
                            if (class61.field844 > var9.field1622 && var9.field1642 != null) {
                                class173 var71 = new class173();
                                var71.field2796 = var9;
                                var71.field2798 = var9.field1642;
                                class136.field2259.method363(-125, var71);
                            }
                            var9.field1622 = class64.field906;
                            if (var9.field1682 != null) {
                                for (int var72 = 0; var72 < class295.field4670; var72++) {
                                    class173 var73 = new class173();
                                    var73.field2796 = var9;
                                    var73.field2797 = class186.field3000[var72];
                                    var73.field2787 = class138.field2290[var72];
                                    var73.field2798 = var9.field1682;
                                    class136.field2259.method363(-123, var73);
                                }
                            }
                            if (class281.field4483 && var9.field1609 != null) {
                                class173 var74 = new class173();
                                var74.field2796 = var9;
                                var74.field2798 = var9.field1609;
                                class136.field2259.method363(104, var74);
                            }
                        }
                    }
                    if (!var9.field1603 && class238.field3815 == null && class258.field4114 == null && !class240.field3852) {
                        if ((var9.field1619 >= 0 || var9.field1588 != 0) && class109.field1893 >= var12 && class250.field4000 >= var13 && class109.field1893 < var14 && class250.field4000 < var15) {
                            if (var9.field1619 >= 0) {
                                class268.field4348 = arg0[var9.field1619];
                            } else {
                                class268.field4348 = var9;
                            }
                        }
                        if (var9.field1655 == 8 && class109.field1893 >= var12 && class250.field4000 >= var13 && class109.field1893 < var14 && class250.field4000 < var15) {
                            class228.field3634 = var9;
                        }
                        if (var9.field1561 > var9.field1693) {
                            class285.method1913(var11, var9.field1691 + var10, var9.field1561, class109.field1893, class250.field4000, var9.field1693, (byte) -94, var9);
                        }
                    }
                    if (var9.field1655 == 0) {
                        method1503(arg0, var9.field1659, var12, var13, var14, var15, var10 - var9.field1590, var11 - var9.field1639);
                        if (var9.field1624 != null) {
                            method1503(var9.field1624, var9.field1659, var12, var13, var14, var15, var10 - var9.field1590, var11 - var9.field1639);
                        }
                        class128 var75 = (class128) class294.field4656.method457((long) var9.field1659, (byte) -115);
                        if (var75 != null) {
                            class112.method807(var12, var10, var75.field2135, -63, var13, var15, var11, var14);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    private final void method1504(int arg0) {
        field3604++;
        if (!class119.field2006) {
            label237: while (true) {
                do {
                    if (!class257.method1690(127)) {
                        break label237;
                    }
                } while (class155.field2496 != 's' && class155.field2496 != 'S');
                class119.field2006 = true;
            }
        }
        if (class272.field4395 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class182.method1253(20215);
            if (class74.field1013 == 0L) {
                class74.field1013 = var4;
            }
            if (var3 > 16384 && var4 - class74.field1013 < 5000L) {
                if (var4 - class199.field3217 > 1000L) {
                    System.gc();
                    class199.field3217 = var4;
                }
                class92.field1314 = class233.field3718;
                class152.field2456 = 5;
            } else {
                class152.field2456 = 5;
                class92.field1314 = class253.field4047;
                class272.field4395 = 10;
            }
            return;
        }
        int var6 = 120 % ((11 - arg0) / 38);
        if (class272.field4395 == 10) {
            for (int var7 = 0; var7 < 4; var7++) {
                class61.field839[var7] = new class281(104, 104);
            }
            class92.field1314 = class107.field1857;
            class272.field4395 = 30;
            class152.field2456 = 10;
        } else if (class272.field4395 == 30) {
            if (class189.field3023 == null) {
                class189.field3023 = new class33(class30.field374, class247.field3977);
            }
            if (class189.field3023.method230((byte) 63)) {
                class104.field1751 = class22.method150(0, (byte) -33, true, true, false);
                class115.field1964 = class22.method150(1, (byte) -29, true, true, false);
                class92.field1313 = class22.method150(2, (byte) -110, false, true, true);
                class3.field39 = class22.method150(3, (byte) 102, true, true, false);
                class251.field4021 = class22.method150(4, (byte) 89, true, true, false);
                class250.field4004 = class22.method150(5, (byte) 92, true, true, true);
                class198.field3188 = class22.method150(6, (byte) 117, true, false, true);
                class46.field557 = class22.method150(7, (byte) 104, true, true, false);
                class169.field2739 = class22.method150(8, (byte) 91, true, true, false);
                class203.field3258 = class22.method150(9, (byte) -118, true, true, false);
                class246.field3948 = class22.method150(10, (byte) -55, true, true, false);
                class263.field4169 = class22.method150(11, (byte) 115, true, true, false);
                class223.field3543 = class22.method150(12, (byte) 99, true, true, false);
                class147.field2362 = class22.method150(13, (byte) 124, true, true, false);
                class269.field4359 = class22.method150(14, (byte) 113, true, false, false);
                class166.field2714 = class22.method150(15, (byte) -92, true, true, false);
                class185.field2965 = class22.method150(16, (byte) 103, true, true, false);
                class96.field1451 = class22.method150(17, (byte) -107, true, true, false);
                class172.field2769 = class22.method150(18, (byte) 123, true, true, false);
                class223.field3548 = class22.method150(19, (byte) -44, true, true, false);
                class244.field3908 = class22.method150(20, (byte) -36, true, true, false);
                class46.field554 = class22.method150(21, (byte) 109, true, true, false);
                class279.field4469 = class22.method150(22, (byte) -67, true, true, false);
                class200.field3219 = class22.method150(23, (byte) 123, true, true, true);
                class228.field3633 = class22.method150(24, (byte) -118, true, true, false);
                class191.field3051 = class22.method150(25, (byte) 127, true, true, false);
                class274.field4419 = class22.method150(26, (byte) -74, true, true, true);
                class127.field2123 = class22.method150(27, (byte) -108, true, true, false);
                class272.field4387 = class22.method150(28, (byte) 108, true, true, true);
                class92.field1314 = class78.field1074;
                class152.field2456 = 15;
                class272.field4395 = 40;
            } else {
                class92.field1314 = class54.field774;
                class152.field2456 = 12;
            }
        } else if (class272.field4395 == 40) {
            int var8 = 0;
            for (int var9 = 0; var9 < 29; var9++) {
                var8 += class290.field4629[var9].method1316(false) * field3616[var9] / 100;
            }
            if (var8 == 100) {
                class92.field1314 = class203.field3260;
                class152.field2456 = 20;
                class125.method869(class169.field2739, 12800);
                class153.method1034(class169.field2739, -88);
                class41.method317(8, class169.field2739);
                class272.field4395 = 41;
            } else {
                class152.field2456 = 20;
                if (var8 != 0) {
                    class92.field1314 = class101.field1530 + var8 + "%";
                }
            }
        } else if (class272.field4395 == 41) {
            if (class272.field4387.method937(0)) {
                this.method1501(2061, class272.field4387.method939(true, 1));
                class92.field1314 = class75.field1019;
                class272.field4395 = 45;
                class152.field2456 = 25;
            } else {
                class92.field1314 = class271.field4381 + class272.field4387.method914(3) + "%";
                class152.field2456 = 25;
            }
        } else if (class272.field4395 == 45) {
            class23.method155(22050, class195.field3161, 2, (byte) 122);
            class29.field346 = new class105();
            class29.field346.method761(128, (byte) 19, 9);
            class226.field3580 = class260.method1707(22050, 9939, class250.field4006, 0, class38.field458);
            class226.field3580.method736(class29.field346, 93);
            class12.method73(-98, class251.field4021, class269.field4359, class29.field346, class166.field2714);
            class147.field2361 = class260.method1707(2048, 9939, class250.field4006, 1, class38.field458);
            class215.field3464 = new class60();
            class147.field2361.method736(class215.field3464, 90);
            class82.field1140 = new class23(22050, class29.field343);
            class99.field1515 = class198.field3188.method947(-24925, "scape main");
            class92.field1314 = class226.field3575;
            class272.field4395 = 50;
            class152.field2456 = 30;
        } else if (class272.field4395 == 50) {
            int var10 = class278.method1862(-89, class147.field2362, class169.field2739);
            int var11 = class203.method1361(8);
            if (var11 > var10) {
                class92.field1314 = class223.field3547 + var10 * 100 / var11 + "%";
                class152.field2456 = 35;
            } else {
                class92.field1314 = class79.field1080;
                class272.field4395 = 60;
                class152.field2456 = 35;
            }
        } else if (class272.field4395 == 60) {
            int var12 = class71.method554((byte) -58, class169.field2739);
            int var13 = class138.method952(-30419);
            if (var13 > var12) {
                class152.field2456 = 40;
                class92.field1314 = class295.field4669 + var12 * 100 / var13 + "%";
            } else {
                class272.field4395 = 65;
                class152.field2456 = 40;
                class92.field1314 = class295.field4668;
            }
        } else if (class272.field4395 == 65) {
            class129.method895(0, class147.field2362, class169.field2739);
            class92.field1314 = class280.field4473;
            class152.field2456 = 45;
            class233.method1539(5, (byte) 32);
            class272.field4395 = 70;
        } else if (class272.field4395 == 70) {
            class92.field1313.method937(0);
            byte var14 = 0;
            int var15 = var14 + class92.field1313.method914(-98);
            class185.field2965.method937(0);
            int var16 = var15 + class185.field2965.method914(105);
            class96.field1451.method937(0);
            int var17 = var16 + class96.field1451.method914(107);
            class172.field2769.method937(0);
            int var18 = var17 + class172.field2769.method914(-62);
            class223.field3548.method937(0);
            int var19 = var18 + class223.field3548.method914(109);
            class244.field3908.method937(0);
            int var20 = var19 + class244.field3908.method914(116);
            class46.field554.method937(0);
            int var21 = var20 + class46.field554.method914(117);
            class279.field4469.method937(0);
            int var22 = var21 + class279.field4469.method914(109);
            class228.field3633.method937(0);
            int var23 = var22 + class228.field3633.method914(-102);
            class191.field3051.method937(0);
            int var24 = var23 + class191.field3051.method914(-51);
            class127.field2123.method937(0);
            int var25 = var24 + class127.field2123.method914(115);
            if (var25 < 1100) {
                class152.field2456 = 50;
                class92.field1314 = class96.field1443 + var25 / 11 + "%";
            } else {
                class119.method839(class92.field1313, false);
                class28.method188(4, class92.field1313);
                class244.method1601(1616169224, class92.field1313);
                class203.method1368(32, class46.field557, class92.field1313);
                class258.method1694(true, class185.field2965, (byte) 43, class46.field557);
                class284.method1904(class172.field2769, class46.field557, -14408);
                class49.method387(class223.field3548, 127, class1.field16, class46.field557, true);
                class42.method326(79, class92.field1313);
                class41.method316(class104.field1751, (byte) -128, class244.field3908, class115.field1964);
                class107.method785(class92.field1313, 0);
                class64.method515(class46.field557, class46.field554, 0);
                class8.method46(255, class279.field4469);
                class171.method1194(class92.field1313, false);
                class238.method1571(class169.field2739, class147.field2362, class3.field39, (byte) 117, class46.field557);
                class296.method1975((byte) -108, class92.field1313);
                class221.method1467(class96.field1451, -127);
                class44.method345(new class278(), class228.field3633, class191.field3051, (byte) 123);
                class122.method858(19279, class191.field3051, class228.field3633);
                class194.method1314(class92.field1313, -1589);
                class1.method4((byte) -79, class92.field1313);
                class7.method42(6, class92.field1313);
                class179.method1243(class92.field1313, (byte) -111, class169.field2739);
                class116.method827(51, class92.field1313, class169.field2739);
                class92.field1314 = class171.field2757;
                class152.field2456 = 50;
                class88.method627(false);
                class272.field4395 = 80;
            }
        } else if (class272.field4395 == 80) {
            int var26 = class208.method1417(class169.field2739, 0);
            int var27 = class155.method1045(-115);
            if (var26 < var27) {
                class92.field1314 = class166.field2702 + var26 * 100 / var27 + "%";
                class152.field2456 = 60;
            } else {
                class160.method1103(class169.field2739, true);
                class272.field4395 = 90;
                class152.field2456 = 60;
                class92.field1314 = class175.field2818;
            }
        } else if (class272.field4395 == 90) {
            if (class274.field4419.method937(0)) {
                class185 var28 = new class185(class203.field3258, class274.field4419, class169.field2739, 20, !class168.field2735);
                class145.method992(var28);
                if (class257.field4109 == 1) {
                    class145.method993(0.9F);
                }
                if (class257.field4109 == 2) {
                    class145.method993(0.8F);
                }
                if (class257.field4109 == 3) {
                    class145.method993(0.7F);
                }
                if (class257.field4109 == 4) {
                    class145.method993(0.6F);
                }
                class272.field4395 = 100;
                class152.field2456 = 70;
                class92.field1314 = class93.field1329;
            } else {
                class92.field1314 = class260.field4131 + class274.field4419.method914(114) + "%";
                class152.field2456 = 70;
            }
        } else if (class272.field4395 == 100) {
            if (class131.method909(false, class169.field2739)) {
                class272.field4395 = 110;
            }
        } else if (class272.field4395 == 110) {
            class62.field861 = new class124();
            class250.field4006.method1679(class62.field861, 0, 10);
            class152.field2456 = 75;
            class272.field4395 = 120;
            class92.field1314 = class17.field198;
        } else if (class272.field4395 == 120) {
            if (class246.field3948.method930("", "huffman", -109)) {
                class237 var29 = new class237(class246.field3948.method933("", "huffman", -116));
                class289.method1936(var29, -14301);
                class272.field4395 = 130;
                class92.field1314 = class238.field3804;
                class152.field2456 = 80;
            } else {
                class92.field1314 = class122.field2053 + "0%";
                class152.field2456 = 80;
            }
        } else if (class272.field4395 == 130) {
            if (!class3.field39.method937(0)) {
                class92.field1314 = class153.field2475 + class3.field39.method914(-117) * 3 / 4 + "%";
                class152.field2456 = 85;
            } else if (!class223.field3543.method937(0)) {
                class92.field1314 = class153.field2475 + (class223.field3543.method914(18) / 10 + 75) + "%";
                class152.field2456 = 85;
            } else if (!class147.field2362.method937(0)) {
                class92.field1314 = class153.field2475 + (class147.field2362.method914(102) / 20 + 85) + "%";
                class152.field2456 = 85;
            } else if (class200.field3219.method921("details", (byte) 115)) {
                class168.method1182(0, class136.field2262, class200.field3219);
                class190.method1292(class46.field557);
                class152.field2456 = 95;
                class92.field1314 = class34.field427;
                class272.field4395 = 135;
            } else {
                class92.field1314 = class153.field2475 + ((class200.field3219.method946("details", 0) / 10) + 90) + "%";
                class152.field2456 = 85;
            }
        } else if (class272.field4395 == 135) {
            int var30 = class295.method1970((byte) 39);
            if (var30 == -1) {
                class152.field2456 = 95;
                class92.field1314 = class38.field469;
            } else if (var30 == 7 || var30 == 9) {
                this.method483("worldlistfull", (byte) 100);
                class233.method1539(1000, (byte) 32);
            } else if (class196.field3169) {
                class272.field4395 = 140;
                class152.field2456 = 96;
                class92.field1314 = class246.field3956;
            } else {
                this.method483("worldlistio_" + var30, (byte) 100);
                class233.method1539(1000, (byte) 32);
            }
        } else if (class272.field4395 == 140) {
            class207.field3334 = class3.field39.method947(-24925, "loginscreen");
            class250.field4004.method945(true, false, 66);
            class198.field3188.method945(true, true, -103);
            class169.field2739.method945(true, true, 46);
            class147.field2362.method945(true, true, -93);
            class246.field3948.method945(true, true, -80);
            class3.field39.method945(true, true, 99);
            class272.field4395 = 150;
            class17.field200 = true;
            class152.field2456 = 97;
            class92.field1314 = class48.field591;
        } else if (class272.field4395 == 150) {
            if (class119.field2006) {
                class105.field1819 = 0;
                class239.field3819 = 0;
                class108.field1877 = 0;
                class207.field3332 = 0;
            }
            class119.field2006 = true;
            class101.method712(115, class250.field4006);
            class8.method50((byte) -8, -1, -1, false, class207.field3332);
            class92.field1314 = class228.field3632;
            class152.field2456 = 100;
            class272.field4395 = 160;
        } else if (class272.field4395 == 160) {
            class38.method304((byte) 126, true);
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    public final void method477(int arg0) {
        method1502((byte) 71);
        field3598++;
        class101.method711((byte) 59);
        class125.method870((byte) 124);
        class79.method594(arg0 ^ 0xFFFFFF81);
        class17.method121(-48);
        class81.method600((byte) -100);
        class242.method1596((byte) -49);
        class76.method576(arg0 + 16773817);
        class62.method481((byte) 51);
        class228.method1513(false);
        class152.method1027(0);
        class124.method864((byte) 66);
        class115.method825(-83);
        class264.method1758((byte) 123);
        class186.method1273(9);
        class206.method1383((byte) 99);
        class218.method1445(107);
        class33.method229(-31225);
        class134.method923(-7186);
        class157.method1056((byte) -101);
        class9.method54((byte) -112);
        class272.method1833(arg0 ^ 0x58);
        class275.method1858(-48);
        class178.method1240(arg0 ^ 0x78);
        class281.method1885(-1);
        class103.method718(10);
        class235.method1549(64);
        class48.method373(102);
        class271.method1828(15);
        class61.method460(-29383);
        class26.method182(12);
        class105.method774((byte) -96);
        class104.method740((byte) -99);
        class23.method153(0);
        class95.method678(arg0 - 118);
        class21.method138((byte) -75);
        class49.method381(-1);
        class99.method705(-26297);
        class94.method661((byte) 122);
        class44.method344(115);
        class265.method1793((byte) -110);
        class128.method893(true);
        class29.method192(true);
        class69.method545(0);
        class247.method1637((byte) 42);
        class42.method325(arg0 + 4);
        class261.method1712(113);
        class10.method62(1779218854);
        class171.method1195(arg0 ^ 0xFFFFF8F4);
        class258.method1693(-24);
        class97.method696((byte) -109);
        class223.method1478(100);
        class279.method1868((byte) 93);
        class243.method1599((byte) -15);
        class262.method1716(8);
        class93.method652(-55);
        class250.method1650(arg0 ^ 0x6C);
        class253.method1658(0);
        class1.method9(0);
        class41.method314(-1554864895);
        class46.method358((byte) -128);
        class257.method1688((byte) 64);
        class30.method211(0);
        class158.method1074();
        class6.method38(-74);
        class208.method1405((byte) 79);
        class90.method644();
        class106.method781(arg0 - 2);
        class172.method1200((byte) 4);
        class269.method1820((byte) 114);
        class238.method1567(-96);
        class148.method1009(arg0 - 100002);
        class110.method800(24221);
        class163.method1142();
        class133.method912(arg0 - 1);
        class80.method598(0);
        class167.method1176();
        class286.method1919((byte) 85);
        class107.method783(125);
        class200.method1351(69);
        class36.method292();
        class50.method397((byte) -96);
        class199.method1343(99);
        class73.method561((byte) 101);
        class183.method1255(23469);
        class63.method496();
        class249.method1644(0);
        class19.method134(-3);
        class175.method1208(-123);
        class244.method1602(arg0 + 2);
        class226.method1491(false);
        class120.method845(-1);
        class96.method688(4);
        class289.method1933(-103);
        class117.method829((byte) 84);
        class58.method445((byte) 88);
        class177.method1226(arg0 ^ 0xFFFFA8C1);
        class66.method527((byte) 88);
        class294.method1964(99);
        class221.method1465(arg0 + 63);
        class190.method1291();
        class64.method512(0);
        class127.method889(101);
        class284.method1906((byte) -44);
        class229.method1518(-9681);
        class32.method213();
        class207.method1397(arg0 ^ 0x3);
        class144.method974((byte) 122);
        class291.method1951(arg0 + 84);
        class230.method1526((byte) -72);
        class185.method1269(false);
        class205.method1377(arg0 + 24);
        class109.method795(false);
        class118.method835();
        class145.method990();
        class201.method1352(71);
        class156.method1049(arg0 ^ 0x2D8E);
        class83.method607((byte) 102);
        class219.method1456((byte) 31);
        class220.method1459(false);
        class39.method307(false);
        class198.method1336((byte) -63);
        class173.method1202((byte) 102);
        class197.method1331((byte) -109);
        class138.method954((byte) 87);
        class240.method1582((byte) 100);
        class233.method1541((byte) 102);
        class195.method1323((byte) 77);
        class16.method119((byte) -57);
        class82.method601(true);
        class38.method303(122);
        class47.method362();
        class160.method1100(117);
        class164.method1146(11);
        class252.method1655();
        class214.method1436(2);
        class154.method1039(47);
        class102.method717((byte) -79);
        class100.method710((byte) 31);
        class283.method1894(false);
        class54.method421(50);
        class273.method1844(arg0 ^ 0x3);
        class297.method1983(121);
        class231.method1530();
        class116.method826(false);
        class170.method1190(true);
        class224.method1483(29837);
        class193.method1302((byte) 119);
        class241.method1587(-107);
        class280.method1874((byte) 98);
        class202.method1359(arg0 + 56);
        class85.method610(arg0 ^ 0xFFFFFFBE);
        class287.method1925((byte) -108);
        class159.method1097(arg0 + 54);
        class119.method840(24466);
        class52.method407(4301);
        class74.method566((byte) 8);
        class259.method1697((byte) 8);
        class55.method426((byte) 116);
        class155.method1044(80);
        class45.method352(-1);
        class146.method1000((byte) -57);
        class274.method1847(arg0 - 1391);
        class292.method1957();
        class151.method1026(91);
        class268.method1816(arg0 + 121);
        class260.method1711(-29591);
        class188.method1284((byte) 83);
        class129.method898((byte) 9);
        class53.method411();
        class37.method300();
        class196.method1324(arg0 - 90540145);
        class285.method1912((byte) -72);
        class11.method67((byte) -125);
        class216.method1440(0);
        class165.method1150();
        class65.method521();
        class3.method18(arg0 ^ 0x2AC630CD);
        class222.method1475(125);
        class288.method1932((byte) -101);
        class113.method815(-30976);
        class77.method581(54);
        class217.method1442((byte) 109);
        class108.method788((byte) -110);
        class75.method575(-1);
        class122.method854(arg0 ^ 0x7F);
        class162.method1111(true);
        class189.method1289((byte) 102);
        class57.method442(false);
        class136.method950(-19200);
        class131.method905(-1);
        class290.method1944((byte) -113);
        class67.method529(0);
        class7.method45((byte) 85);
        class18.method123((byte) -70);
        class111.method803((byte) -119);
        class51.method401(33);
        class191.method1296(true);
        class227.method1497((byte) -94);
        class72.method557(115);
        class254.method1659(128);
        class184.method1259((byte) 83);
        class92.method647((byte) 20);
        class78.method586(arg0 + 2);
        class246.method1623(1);
        class153.method1036((byte) 106);
        class147.method1007(32767);
        class256.method1683((byte) -102);
        class20.method136(2959);
        class234.method1545((byte) -71);
        class225.method1488(-92);
        class28.method189((byte) 124);
        class203.method1363(false);
        class270.method1823((byte) -120);
        class5.method32(true);
        class34.method232(false);
        class236.method1556(arg0 - 5365);
        class267.method1810(0);
        class263.method1724(4080);
        class8.method48(0);
        class166.method1161(63);
        class87.method614(arg0 ^ 0x41);
        class181.method1248(-32252);
        class168.method1179(true);
        class149.method1013((byte) 94);
        class12.method71((byte) 72);
        class140.method957(arg0 - 65);
        class293.method1962(51);
        class266.method1806(-6484);
        class70.method548(false);
        class150.method1018(arg0 ^ arg0);
        class22.method151((byte) 17);
        class130.method900(arg0 - 1);
        class25.method176(0);
        class232.method1536(true);
        class169.method1187(89);
        class295.method1971(96);
        class251.method1654(-116);
        class161.method1106(arg0 ^ 0xFFFFFF9B);
        class215.method1439(-1);
        if (class62.field887) {
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
    public final void method470(int arg0) {
        class83.method604(false);
        class247.field3977 = new class218();
        class30.field374 = new class206();
        if (class284.field4546 != 0) {
            class234.field3727 = new byte[50][];
        }
        field3618++;
        class9.method57(-29652, class250.field4006);
        if (class92.field1312 == 0) {
            class199.field3204 = this.getCodeBase().getHost();
            class271.field4380 = 43594;
            class3.field52 = 443;
        } else if (class92.field1312 == 1) {
            class199.field3204 = this.getCodeBase().getHost();
            class3.field52 = class96.field1456 + 50000;
            class271.field4380 = class96.field1456 + 40000;
        } else if (class92.field1312 == 2) {
            class3.field52 = class96.field1456 + 50000;
            class271.field4380 = class96.field1456 + 40000;
            class199.field3204 = "127.0.0.1";
        }
        class75.field1027 = class3.field52;
        class281.field4502 = class188.field3007 = class280.field4477 = class243.field3901 = new short[256];
        class148.field2385 = class271.field4380;
        class111.field1920 = class199.field3204;
        if (class255.field4071 == 3 && class92.field1312 != 2) {
            class125.field2088 = class96.field1456;
        }
        if (class189.field3026 == 1) {
            class34.field411 = class271.field4375;
            class287.field4567 = class102.field1543;
            class219.field3507 = true;
            class119.field2015 = class266.field4318;
            class226.field3576 = class236.field3774;
        } else {
            class226.field3576 = class240.field3842;
            class287.field4567 = class119.field2007;
            class34.field411 = class136.field2258;
            class119.field2015 = class184.field2948;
        }
        class223.field3541 = class148.field2385;
        class233.field3697 = class271.field4380;
        class201.method1355(192);
        class75.method574(class38.field458, -109);
        class98.method702((byte) 69, class38.field458);
        class264.field4190 = class30.method205(true);
        if (class264.field4190 != null) {
            class264.field4190.method1281(class38.field458, false);
        }
        class5.field62 = class255.field4071;
        try {
            if (class250.field4006.field4080 != null) {
                class120.field2023 = new class157(class250.field4006.field4080, 5200, 0);
                for (int var2 = 0; var2 < 29; var2++) {
                    class270.field4366[var2] = new class157(class250.field4006.field4088[var2], 6000, 0);
                }
                class106.field1848 = new class157(class250.field4006.field4073, 6000, 0);
                class291.field4643 = new class9(255, class120.field2023, class106.field1848, 500000);
                class101.field1525 = new class157(class250.field4006.field4083, 24, 0);
                class250.field4006.field4073 = null;
                class250.field4006.field4080 = null;
                class250.field4006.field4083 = null;
                class250.field4006.field4088 = null;
            }
        } catch (IOException var3) {
            class106.field1848 = null;
            class120.field2023 = null;
            class101.field1525 = null;
            class291.field4643 = null;
        }
        if (class92.field1312 != 0) {
            class279.field4470 = true;
        }
        if (arg0 == 10962) {
            class33.field405 = class124.field2070;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Leb;)Leb;")
    public static final class103 method1505(class103 arg0) {
        int var1 = method1511(arg0).method194(1);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class168.method1180(8931, arg0.field1602);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Leb;)Z")
    public static final boolean method1506(class103 arg0) {
        if (class178.field2891) {
            if (method1511(arg0).field350 != 0) {
                return false;
            }
            if (arg0.field1655 == 0) {
                return false;
            }
        }
        return arg0.field1684;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method471(int arg0) {
        field3600++;
        if (class21.field249 == 1000) {
            return;
        }
        class9.field141++;
        if ((class9.field141 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class297.field4697 = var2.get(11) * 600 - (-(var2.get(12) * 10) - (var2.get(13) / 6));
            class130.field2173.setSeed((long) class297.field4697);
        }
        this.method1510(110);
        if (arg0 < 13) {
            field3601 = null;
        }
        if (class189.field3023 != null) {
            class189.field3023.method226(127);
        }
        class178.method1235(2);
        class280.method1873((byte) -54);
        class50.method398(12147);
        class143.method971((byte) -127);
        if (class264.field4190 != null) {
            int var3 = class264.field4190.method1280(31813);
            class203.field3269 = var3;
        }
        if (class21.field249 == 0) {
            this.method1504(-36);
            class127.method891((byte) 114);
        } else if (class21.field249 == 5) {
            this.method1504(-28);
            class127.method891((byte) 80);
        } else if (class21.field249 == 25 || class21.field249 == 28) {
            class154.method1040(true);
        }
        if (class21.field249 == 10) {
            this.method1508(23662);
            class17.method122(2283);
            class5.method35((byte) -51);
            class262.method1720((byte) -64);
        } else if (class21.field249 == 30) {
            class152.method1032(105);
        } else if (class21.field249 == 40) {
            class262.method1720((byte) -69);
            if (class157.field2523 != -3) {
                if (class157.field2523 == 15) {
                    class175.method1214(-8222);
                } else if (class157.field2523 != 2) {
                    class297.method1985(-1);
                    return;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)I")
    public static final int method1507(int arg0, int arg1) {
        field3621++;
        int var2 = arg1 >>> 1;
        if (arg0 != 1083397953) {
            field3599 = -5;
        }
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return ~var7 & arg1;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
    public final void method475(byte arg0) {
        field3613++;
        if (class62.field861 != null) {
            class62.field861.field2064 = false;
        }
        class62.field861 = null;
        if (class149.field2395 != null) {
            class149.field2395.method1276(-1);
            class149.field2395 = null;
        }
        class296.method1973(class38.field458, 8175);
        class122.method853(true, class38.field458);
        if (class264.field4190 != null) {
            class264.field4190.method1282(-109, class38.field458);
        }
        class51.method403(false);
        class253.method1657(false);
        class264.field4190 = null;
        if (arg0 < 58) {
            this.init();
        }
        if (class226.field3580 != null) {
            class226.field3580.method742(-1738);
        }
        if (class147.field2361 != null) {
            class147.field2361.method742(-1738);
        }
        class30.field374.method1390(4);
        class247.field3977.method1452(124);
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        field3606++;
        try {
            if (arg0.length != 4) {
                class234.method1544(25657, "argument count");
            }
            class96.field1456 = Integer.parseInt(arg0[0]);
            class92.field1312 = 2;
            if (arg0[1].equals("live")) {
                class284.field4546 = 0;
            } else if (arg0[1].equals("rc")) {
                class284.field4546 = 1;
            } else if (arg0[1].equals("wip")) {
                class284.field4546 = 2;
            } else {
                class234.method1544(25657, "modewhat");
            }
            class238.field3793 = false;
            class261.field4147 = class265.method1798(116, arg0[2]);
            if (class261.field4147 == -1) {
                if (arg0[2].equals("english")) {
                    class261.field4147 = 0;
                } else if (arg0[2].equals("german")) {
                    class261.field4147 = 1;
                } else {
                    class234.method1544(25657, "language");
                }
            }
            class162.method1116(class261.field4147, 1061);
            class256.field4096 = false;
            class221.field3528 = false;
            if (arg0[3].equals("game0")) {
                class189.field3026 = 0;
            } else if (arg0[3].equals("game1")) {
                class189.field3026 = 1;
            } else {
                class234.method1544(25657, "game");
            }
            class286.field4561 = 0;
            class73.field1003 = 0;
            class274.field4421 = false;
            class236.field3762 = "";
            client var1 = new client();
            class85.field1168 = var1;
            var1.method469(29, false, class284.field4546 + 32, 1, "runescape", 1024, 768, 543);
            class284.field4537.setLocation(40, 40);
        } catch (Exception var3) {
            class272.method1837((String) null, 1, var3);
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    private final void method1508(int arg0) {
        field3612++;
        for (class295.field4670 = 0; class257.method1690(arg0 ^ 0x5C11) && class295.field4670 < 128; class295.field4670++) {
            class186.field3000[class295.field4670] = class170.field2752;
            class138.field2290[class295.field4670] = class155.field2496;
        }
        class221.field3524++;
        if (class113.field1944 != -1) {
            class112.method807(0, 0, class113.field1944, -125, 0, class97.field1469, 0, class107.field1856);
        }
        class64.field906++;
        class223.method1476(123);
        while (true) {
            class173 var2;
            class103 var3;
            class103 var4;
            do {
                var2 = (class173) class8.field114.method367(5);
                if (var2 == null) {
                    while (true) {
                        class173 var5;
                        class103 var6;
                        class103 var7;
                        do {
                            var5 = (class173) class127.field2122.method367(5);
                            if (var5 == null) {
                                while (true) {
                                    class173 var8;
                                    class103 var9;
                                    class103 var10;
                                    do {
                                        var8 = (class173) class136.field2259.method367(5);
                                        if (var8 == null) {
                                            if (class238.field3815 != null) {
                                                class225.method1489((byte) 92);
                                            }
                                            if (arg0 != 23662) {
                                                this.method1501(-123, (byte[]) null);
                                            }
                                            if (class82.field1146 != null && class82.field1146.field2271 == 1) {
                                                if (class82.field1146.field2266 != null) {
                                                    class263.method1726(class133.field2206, class70.field966, -17137);
                                                }
                                                class82.field1146 = null;
                                                class70.field966 = false;
                                                class133.field2206 = null;
                                            }
                                            if (class9.field141 % 1500 == 0) {
                                                class34.method238(-3);
                                                return;
                                            }
                                            return;
                                        }
                                        var9 = var8.field2796;
                                        if (var9.field1680 < 0) {
                                            break;
                                        }
                                        var10 = class168.method1180(8931, var9.field1602);
                                    } while (var10 == null || var10.field1624 == null || var10.field1624.length <= var9.field1680 || var10.field1624[var9.field1680] != var9);
                                    class223.method1480(8170, var8);
                                }
                            }
                            var6 = var5.field2796;
                            if (var6.field1680 < 0) {
                                break;
                            }
                            var7 = class168.method1180(arg0 ^ 0x7E8D, var6.field1602);
                        } while (var7 == null || var7.field1624 == null || var6.field1680 >= var7.field1624.length || var7.field1624[var6.field1680] != var6);
                        class223.method1480(8170, var5);
                    }
                }
                var3 = var2.field2796;
                if (var3.field1680 < 0) {
                    break;
                }
                var4 = class168.method1180(8931, var3.field1602);
            } while (var4 == null || var4.field1624 == null || var4.field1624.length <= var3.field1680 || var4.field1624[var3.field1680] != var3);
            class223.method1480(8170, var2);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    public static final void method1509(byte arg0) {
        for (int var1 = 0; var1 < class61.field834; var1++) {
            int var2 = class28.field335[var1];
            class235 var3 = class260.field4141[var2];
            int var4 = class166.field2709.method1779(-55);
            if ((var4 & 0x40) != 0) {
                var4 += class166.field2709.method1779(-75) << 8;
            }
            class274.method1850(var4, var3, arg0 ^ 0x2CF5, var2);
        }
        if (arg0 != -97) {
            method1509((byte) -83);
        }
        field3603++;
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    private final void method1510(int arg0) {
        if (arg0 <= 47) {
            return;
        }
        boolean var2 = class30.field374.method1388(0);
        if (!var2) {
            this.method1512(-21704);
        }
        field3602++;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Leb;)Lkb;")
    public static final class29 method1511(class103 arg0) {
        class29 var1 = (class29) class28.field326.method457(((long) arg0.field1659 << 32) + (long) arg0.field1680, (byte) -115);
        return var1 == null ? arg0.field1552 : var1;
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    private final void method1512(int arg0) {
        field3607++;
        if (class226.field3579 < class30.field374.field3329) {
            class127.field2131 = (class30.field374.field3329 * 50 - 50) * 5;
            if (class127.field2131 > 3000) {
                class127.field2131 = 3000;
            }
            if (class233.field3697 == class223.field3541) {
                class223.field3541 = class75.field1027;
            } else {
                class223.field3541 = class233.field3697;
            }
            if (class30.field374.field3329 >= 2 && class30.field374.field3327 == 6) {
                this.method483("js5connect_outofdate", (byte) 100);
                class21.field249 = 1000;
                return;
            }
            if (class30.field374.field3329 >= 4 && class30.field374.field3327 == -1) {
                this.method483("js5crc", (byte) 100);
                class21.field249 = 1000;
                return;
            }
            if (class30.field374.field3329 >= 4 && (class21.field249 == 0 || class21.field249 == 5)) {
                if (class30.field374.field3327 == 7 || class30.field374.field3327 == 9) {
                    this.method483("js5connect_full", (byte) 100);
                } else if (class30.field374.field3327 > 0) {
                    this.method483("js5connect", (byte) 100);
                } else {
                    this.method483("js5io", (byte) 100);
                }
                class21.field249 = 1000;
                return;
            }
        }
        class226.field3579 = class30.field374.field3329;
        if (class127.field2131 > 0) {
            class127.field2131--;
            return;
        }
        if (arg0 != -21704) {
            field3599 = 102;
        }
        try {
            if (class272.field4393 == 0) {
                class297.field4706 = class250.field4006.method1672(-3, class223.field3541, class111.field1920);
                class272.field4393++;
            }
            if (class272.field4393 == 1) {
                if (class297.field4706.field2271 == 2) {
                    this.method1500(0, 1000);
                    return;
                }
                if (class297.field4706.field2271 == 1) {
                    class272.field4393++;
                }
            }
            if (class272.field4393 == 2) {
                class85.field1156 = new class186((Socket) class297.field4706.field2266, class250.field4006);
                class264 var2 = new class264(5);
                var2.method1757(15, (byte) 114);
                var2.method1789((byte) -38, 543);
                class85.field1156.method1272(5, 0, var2.field4198, -102);
                class272.field4393++;
                class250.field3999 = class182.method1253(20215);
            }
            if (class272.field4393 == 3) {
                if (class21.field249 == 0 || class21.field249 == 5 || class85.field1156.method1274(arg0 + 51195) > 0) {
                    int var3 = class85.field1156.method1270(0);
                    if (var3 != 0) {
                        this.method1500(0, var3);
                        return;
                    }
                    class272.field4393++;
                } else if (class182.method1253(20215) - class250.field3999 > 30000L) {
                    this.method1500(0, 1001);
                    return;
                }
            }
            if (class272.field4393 == 4) {
                boolean var4 = class21.field249 == 5 || class21.field249 == 10 || class21.field249 == 28;
                class30.field374.method1382(37, class85.field1156, !var4);
                class297.field4706 = null;
                class272.field4393 = 0;
                class85.field1156 = null;
            }
        } catch (IOException var5) {
            this.method1500(arg0 + 21704, 1002);
        }
    }
}
