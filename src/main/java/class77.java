import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class77 implements class104 {

    @OriginalMember(owner = "client!la", name = "u", descriptor = "Lqb;")
    private class113 field1883 = new class113();

    @OriginalMember(owner = "client!la", name = "v", descriptor = "I")
    private int field1884 = 128;

    @OriginalMember(owner = "client!la", name = "y", descriptor = "I")
    private int field1887 = 0;

    @OriginalMember(owner = "client!la", name = "w", descriptor = "D")
    private double field1885 = 1.0D;

    @OriginalMember(owner = "client!la", name = "z", descriptor = "I")
    private int field1888;

    @OriginalMember(owner = "client!la", name = "B", descriptor = "Lff;")
    private class42 field1889;

    @OriginalMember(owner = "client!la", name = "r", descriptor = "[Lcf;")
    private class21[] field1880;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "[I")
    public static int[] field1863 = new int[] { 0, 1, 2, 3 };

    @OriginalMember(owner = "client!la", name = "e", descriptor = "[Lr;")
    public static class118[] field1867 = new class118[100];

    @OriginalMember(owner = "client!la", name = "o", descriptor = "[J")
    public static long[] field1877 = new long[200];

    @OriginalMember(owner = "client!la", name = "h", descriptor = "[[B")
    public static byte[][] field1870 = new byte[50][];

    @OriginalMember(owner = "client!la", name = "n", descriptor = "Lr;")
    private static class118 field1876 = class153.method1136(87, " more options");

    @OriginalMember(owner = "client!la", name = "k", descriptor = "Lr;")
    public static class118 field1873 = field1876;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "I")
    public static int field1871;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!la", name = "p", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!la", name = "q", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!la", name = "s", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!la", name = "t", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!la", name = "x", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!la", name = "l", descriptor = "[I")
    public static int[] field1874;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIZIILwa;III[Lsc;[B)V")
    public static final void method645(int arg0, int arg1, boolean arg2, int arg3, int arg4, class154 arg5, int arg6, int arg7, int arg8, class128[] arg9, byte[] arg10) {
        class105 var11 = new class105(arg10);
        int var12 = -1;
        if (!arg2) {
            field1877 = null;
        }
        while (true) {
            int var13 = var11.method815((byte) 126);
            if (var13 == 0) {
                field1881++;
                return;
            }
            var12 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var11.method815((byte) 127);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 & 0x3F;
                int var17 = var14 >> 6 & 0x3F;
                int var18 = var14 >> 12;
                int var19 = var11.method831((byte) 76);
                int var20 = var19 >> 2;
                int var21 = var19 & 0x3;
                if (arg6 == var18 && var17 >= arg3 && var17 < arg3 + 8 && arg4 <= var16 && var16 < arg4 + 8) {
                    class148 var22 = class47.method396(117, var12);
                    int var23 = class24.method218(var22.field3287, (byte) -128, var21, var22.field3279, var16 & 0x7, arg1, var17 & 0x7) + arg0;
                    int var24 = class106.method851(var17 & 0x7, var22.field3287, (byte) -3, var21, var22.field3279, arg1, var16 & 0x7) + arg7;
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        int var25 = arg8;
                        if ((class33.field830[1][var23][var24] & 0x2) == 2) {
                            var25 = arg8 - 1;
                        }
                        class128 var26 = null;
                        if (var25 >= 0) {
                            var26 = arg9[var25];
                        }
                        class26.method227(var24, arg5, arg8, var26, arg1 + var21 & 0x3, var12, var23, var20, (byte) 104);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V")
    public static void method646(byte arg0) {
        field1870 = null;
        field1867 = null;
        field1877 = null;
        field1876 = null;
        field1873 = null;
        field1863 = null;
        field1874 = null;
        if (arg0 < 109) {
            method647(121, -65, (byte) 88);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIB)V")
    public static final void method647(int arg0, int arg1, byte arg2) {
        field1882++;
        if (class2.field51 != 0 && class2.field51 != 3) {
            return;
        }
        if (arg2 != 55) {
            field1873 = null;
        }
        if (class82.field1972 != 1) {
            return;
        }
        int var3 = class29.field701 - arg0 - 25;
        int var4 = class14.field317 - arg1 - 5;
        if (var3 < 0 || var4 < 0 || var3 >= 146 || var4 >= 151) {
            return;
        }
        var3 -= 73;
        var4 -= 75;
        int var5 = class153.field3460 + class103.field2375 & 0x7FF;
        int var6 = class58.field1346[var5];
        int var7 = class58.field1354[var5];
        int var8 = (class153.field3452 + 256) * var7 >> 8;
        int var9 = (class153.field3452 + 256) * var6 >> 8;
        int var10 = var4 * var9 - var3 * var8 >> 11;
        int var11 = var3 * var9 + var4 * var8 >> 11;
        int var12 = class89.field2150.field712 - var10 >> 7;
        int var13 = class89.field2150.field760 + var11 >> 7;
        boolean var14 = class81.method674(0, class89.field2150.field710[0], (byte) -69, var13, var12, class89.field2150.field755[0], 1, true, 0, 0, 0, 0);
        if (!var14) {
            return;
        }
        class1.field22.method800(arg2 - 180, var3);
        class1.field22.method800(81, var4);
        class1.field22.method828(class103.field2375, (byte) -54);
        class1.field22.method800(arg2 ^ 0x64, 57);
        class1.field22.method800(-126, class153.field3460);
        class1.field22.method800(-108, class153.field3452);
        class1.field22.method800(-115, 89);
        class1.field22.method828(class89.field2150.field760, (byte) -54);
        class1.field22.method828(class89.field2150.field712, (byte) -54);
        class1.field22.method800(-109, class101.field2347);
        class1.field22.method800(70, 63);
        return;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BI)Z")
    public final boolean method648(byte arg0, int arg1) {
        int var3 = -94 / ((10 - arg0) / 51);
        field1879++;
        return this.field1884 == 64;
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(BI)I")
    public final int method649(byte arg0, int arg1) {
        if (arg0 < 32) {
            this.field1883 = null;
        }
        field1886++;
        return this.field1880[arg1] == null ? 0 : this.field1880[arg1].field509;
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(II)Z")
    public final boolean method650(int arg0, int arg1) {
        field1869++;
        int var3 = 121 / ((arg0 - 85) / 34);
        return this.field1880[arg1].field513;
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(B)V")
    public static final void method651(byte arg0) {
        class67.field1518.method394(12693);
        field1878++;
        int var1 = -53 / ((arg0 + 1) / 61);
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "(II)[I")
    public final int[] method652(int arg0, int arg1) {
        field1871++;
        if (arg0 != 18778) {
            this.field1880 = null;
        }
        class21 var3 = this.field1880[arg1];
        if (var3 != null) {
            if (var3.field515 != null) {
                this.field1883.method894(-1, var3);
                var3.field506 = true;
                return var3.field515;
            }
            boolean var4 = var3.method193(this.field1885, this.field1884, this.field1889);
            if (var4) {
                if (this.field1887 == 0) {
                    class21 var5 = (class21) this.field1883.method881((byte) -9);
                    var5.method190();
                } else {
                    this.field1887--;
                }
                this.field1883.method894(arg0 - 18779, var3);
                var3.field506 = true;
                return var3.field515;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Z)V")
    public final void method653(boolean arg0) {
        field1872++;
        for (int var2 = 0; var2 < this.field1880.length; var2++) {
            if (this.field1880[var2] != null) {
                this.field1880[var2].method190();
            }
        }
        if (!arg0) {
            this.method649((byte) -37, 10);
        }
        this.field1883 = new class113();
        this.field1887 = this.field1888;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
    public static final void method654(int arg0) {
        if (class56.field1322 > 0) {
            class56.field1322--;
        }
        if (class99.field2296 > 1) {
            class99.field2296--;
        }
        field1868++;
        if (class92.field2197) {
            class92.field2197 = false;
            class1.method7(512600200);
            return;
        }
        for (int var1 = 0; var1 < 100 && class20.method181(209); var1++) {
        }
        if (class26.field631 != 30) {
            return;
        }
        class148.method1082(class1.field22, 0, 187);
        Object var2 = class53.field1264.field552;
        synchronized (class53.field1264.field552) {
            if (!class141.field3203) {
                class53.field1264.field555 = 0;
            } else if (class82.field1972 != 0 || class53.field1264.field555 >= 40) {
                class1.field22.method722(155, (byte) 66);
                class137.field3123++;
                class1.field22.method800(-106, 0);
                int var3 = 0;
                int var4 = class1.field22.field2404;
                for (int var5 = 0; var5 < class53.field1264.field555 && class1.field22.field2404 - var4 < 240; var5++) {
                    var3++;
                    int var6 = class53.field1264.field554[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 502) {
                        var6 = 502;
                    }
                    int var7 = class53.field1264.field556[var5];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 764) {
                        var7 = 764;
                    }
                    int var8 = var6 * 765 + var7;
                    if (class53.field1264.field554[var5] == -1 && class53.field1264.field556[var5] == -1) {
                        var6 = -1;
                        var7 = -1;
                        var8 = 524287;
                    }
                    if (class157.field3622 != var7 || class73.field1683 != var6) {
                        int var9 = var7 - class157.field3622;
                        int var10 = var6 - class73.field1683;
                        class73.field1683 = var6;
                        class157.field3622 = var7;
                        if (class83.field1990 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var9 += 32;
                            var10 += 32;
                            class1.field22.method828((class83.field1990 << 12) + (var9 << 6) + var10, (byte) -54);
                            class83.field1990 = 0;
                        } else if (class83.field1990 < 8) {
                            class1.field22.method798(-114, (class83.field1990 << 19) + var8 + 8388608);
                            class83.field1990 = 0;
                        } else {
                            class1.field22.method811((class83.field1990 << 19) + var8 - 1073741824, 2073135696);
                            class83.field1990 = 0;
                        }
                    } else if (class83.field1990 < 2047) {
                        class83.field1990++;
                    }
                }
                class1.field22.method845(false, class1.field22.field2404 - var4);
                if (var3 < class53.field1264.field555) {
                    class53.field1264.field555 -= var3;
                    for (int var11 = 0; var11 < class53.field1264.field555; var11++) {
                        class53.field1264.field556[var11] = class53.field1264.field556[var11 + var3];
                        class53.field1264.field554[var11] = class53.field1264.field554[var11 + var3];
                    }
                } else {
                    class53.field1264.field555 = 0;
                }
            }
        }
        if (class82.field1972 != 0) {
            class62.field1430++;
            long var12 = (class37.field921 - class85.field2068) / 50L;
            if (var12 > 4095L) {
                var12 = 4095L;
            }
            class85.field2068 = class37.field921;
            byte var14 = 0;
            if (class82.field1972 == 2) {
                var14 = 1;
            }
            int var15 = class14.field317;
            int var16 = (int) var12;
            int var17 = class29.field701;
            class1.field22.method722(142, (byte) 87);
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 502) {
                var15 = 502;
            }
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 764) {
                var17 = 764;
            }
            int var18 = var15 * 765 + var17;
            class1.field22.method817((var14 << 19) + (var16 << 20) + var18, -43);
        }
        if (class130.field2964[96] || class130.field2964[97] || class130.field2964[98] || class130.field2964[99]) {
            class59.field1359 = true;
        }
        if (class99.field2291 > 0) {
            class99.field2291--;
        }
        if (class59.field1359 && class99.field2291 <= 0) {
            class59.field1359 = false;
            class99.field2291 = 20;
            class124.field2835++;
            class1.field22.method722(219, (byte) -6);
            class1.field22.method808(1624265448, class103.field2375);
            class1.field22.method841(class64.field1472, -82);
        }
        if (class67.field1558 && !class108.field2521) {
            class11.field247++;
            class108.field2521 = true;
            class1.field22.method722(151, (byte) -125);
            class1.field22.method800(30, 1);
        }
        if (!class67.field1558 && class108.field2521) {
            class11.field247++;
            class108.field2521 = false;
            class1.field22.method722(151, (byte) 40);
            class1.field22.method800(-103, 0);
        }
        class78.method662((byte) 30);
        if (class26.field631 != 30) {
            return;
        }
        class48.method405((byte) 104);
        class139.method1044(106);
        class11.field254++;
        if (class11.field254 > 750) {
            class1.method7(512600200);
            return;
        }
        class84.method690((byte) 51);
        class32.method275(-110);
        class64.method562(true);
        if (class124.field2831 != 0) {
            class9.field195 += 20;
            if (class9.field195 >= 400) {
                class124.field2831 = 0;
            }
        }
        class9.field212++;
        if (class32.field820 != null) {
            class23.field560++;
            if (class23.field560 >= 15) {
                class26.method232((byte) 64, class32.field820);
                class32.field820 = null;
            }
        }
        if (class136.field3086 != null) {
            class26.method232((byte) 50, class136.field3086);
            class31.field784++;
            if (class33.field827 > class80.field1944 + 5 || class33.field827 < class80.field1944 - 5 || class14.field340 + 5 < class44.field1049 || class14.field340 - 5 > class44.field1049) {
                class92.field2217 = true;
            }
            if (class9.field197 == 0) {
                if (class92.field2217 && class31.field784 >= 5) {
                    if (class23.field563 == class136.field3086 && class88.field2131 != class67.field1557) {
                        byte var19 = 0;
                        class74 var20 = class136.field3086;
                        if (class137.field3131 == 1 && var20.field1731 == 206) {
                            var19 = 1;
                        }
                        class33.field832++;
                        if (var20.field1816[class67.field1557] <= 0) {
                            var19 = 0;
                        }
                        if (class140.method1045(0, class46.method384(var20, 0))) {
                            int var23 = class88.field2131;
                            int var24 = class67.field1557;
                            var20.field1816[var24] = var20.field1816[var23];
                            var20.field1743[var24] = var20.field1743[var23];
                            var20.field1816[var23] = -1;
                            var20.field1743[var23] = 0;
                        } else if (var19 == 1) {
                            int var21 = class88.field2131;
                            int var22 = class67.field1557;
                            while (var21 != var22) {
                                if (var22 < var21) {
                                    var20.method621(var21 - 1, true, var21);
                                    var21--;
                                } else if (var21 < var22) {
                                    var20.method621(var21 + 1, true, var21);
                                    var21++;
                                }
                            }
                        } else {
                            var20.method621(class67.field1557, true, class88.field2131);
                        }
                        class1.field22.method722(180, (byte) -125);
                        class1.field22.method842(class88.field2131, (byte) 2);
                        class1.field22.method839(var19, (byte) 127);
                        class1.field22.method817(class136.field3086.field1703, -119);
                        class1.field22.method808(1624265448, class67.field1557);
                    }
                } else if ((class148.field3294 == 1 || class92.method734(class39.field950 - 1, (byte) -127)) && class39.field950 > 2) {
                    class11.method86(503);
                } else if (class39.field950 > 0) {
                    class22.method208(class39.field950 - 1, 84);
                }
                class136.field3086 = null;
                class82.field1972 = 0;
                class23.field560 = 10;
            }
        }
        class4.field71 = null;
        class114.field2665 = false;
        class74 var25 = class151.field3379;
        class85.field2095 = 0;
        class151.field3379 = null;
        class134.field3047 = false;
        class74 var26 = class157.field3611;
        class157.field3611 = null;
        while (class115.method901(93) && class85.field2095 < 128) {
            class67.field1553[class85.field2095] = class122.field2809;
            class149.field3348[class85.field2095] = class99.field2290;
            class85.field2095++;
        }
        class20.method189(class48.field1167, 0, -20490, 0, 765, 503, 0, 0);
        class73.field1691++;
        while (true) {
            class136 var27;
            class74 var28;
            class74 var29;
            do {
                var27 = (class136) class88.field2127.method890((byte) -111);
                if (var27 == null) {
                    while (true) {
                        class136 var30;
                        class74 var31;
                        class74 var32;
                        do {
                            var30 = (class136) class118.field2734.method890((byte) -100);
                            if (var30 == null) {
                                while (true) {
                                    class136 var33;
                                    class74 var34;
                                    class74 var35;
                                    do {
                                        var33 = (class136) class1.field9.method890((byte) -93);
                                        if (var33 == null) {
                                            if (class95.field2249 != null) {
                                                class15.method134(-173);
                                            }
                                            if (class154.field3490 != -1) {
                                                int var36 = class154.field3490;
                                                int var37 = class154.field3516;
                                                boolean var38 = class81.method674(0, class89.field2150.field710[0], (byte) -124, var36, var37, class89.field2150.field755[0], 0, true, 0, 0, 0, 0);
                                                class154.field3490 = -1;
                                                if (var38) {
                                                    class70.field1623 = class29.field701;
                                                    class35.field893 = class14.field317;
                                                    class124.field2831 = 1;
                                                    class9.field195 = 0;
                                                }
                                            }
                                            class25.method224(false);
                                            if (class151.field3379 != var25) {
                                                if (var25 != null) {
                                                    class26.method232((byte) 111, var25);
                                                }
                                                if (class151.field3379 != null) {
                                                    class26.method232((byte) 101, class151.field3379);
                                                }
                                            }
                                            if (class157.field3611 != var26 && class94.field2229 == class108.field2520) {
                                                if (var26 != null) {
                                                    class26.method232((byte) 70, var26);
                                                }
                                                if (class157.field3611 != null) {
                                                    class26.method232((byte) 91, class157.field3611);
                                                }
                                            }
                                            if (class157.field3611 == null) {
                                                if (class94.field2229 > 0) {
                                                    class94.field2229--;
                                                }
                                            } else if (class94.field2229 < class108.field2520) {
                                                class94.field2229++;
                                                if (class94.field2229 == class108.field2520) {
                                                    class26.method232((byte) 112, class157.field3611);
                                                }
                                            }
                                            class144.method1065(-118);
                                            if (class24.field575) {
                                                class72.method607(26416);
                                            }
                                            int var39 = -97 % ((arg0 - 14) / 34);
                                            for (int var40 = 0; var40 < 5; var40++) {
                                                int var10002 = class35.field873[var40]++;
                                            }
                                            int var41 = class158.method1230(-50);
                                            int var42 = class106.method852((byte) -115);
                                            if (var41 > 4500 && var42 > 4500) {
                                                class56.field1322 = 250;
                                                class106.field2464++;
                                                class9.method70(4000, (byte) 94);
                                                class1.field22.method722(6, (byte) 1);
                                            }
                                            class85.field2086++;
                                            class67.field1559++;
                                            if (class67.field1559 > 500) {
                                                int var43 = (int) (Math.random() * 8.0D);
                                                if ((var43 & 0x2) == 2) {
                                                    class141.field3196 += class131.field2987;
                                                }
                                                if ((var43 & 0x4) == 4) {
                                                    class94.field2235 += class36.field918;
                                                }
                                                if ((var43 & 0x1) == 1) {
                                                    class10.field217 += class140.field3177;
                                                }
                                                class67.field1559 = 0;
                                            }
                                            if (class94.field2235 < -40) {
                                                class36.field918 = 1;
                                            }
                                            if (class141.field3196 < -55) {
                                                class131.field2987 = 2;
                                            }
                                            if (class10.field217 < -50) {
                                                class140.field3177 = 2;
                                            }
                                            if (class94.field2235 > 40) {
                                                class36.field918 = -1;
                                            }
                                            if (class141.field3196 > 55) {
                                                class131.field2987 = -2;
                                            }
                                            if (class10.field217 > 50) {
                                                class140.field3177 = -2;
                                            }
                                            class75.field1860++;
                                            if (class75.field1860 > 500) {
                                                int var44 = (int) (Math.random() * 8.0D);
                                                class75.field1860 = 0;
                                                if ((var44 & 0x2) == 2) {
                                                    class153.field3452 += class141.field3200;
                                                }
                                                if ((var44 & 0x1) == 1) {
                                                    class153.field3460 += class92.field2218;
                                                }
                                            }
                                            if (class153.field3460 < -60) {
                                                class92.field2218 = 2;
                                            }
                                            if (class153.field3452 < -20) {
                                                class141.field3200 = 1;
                                            }
                                            if (class153.field3460 > 60) {
                                                class92.field2218 = -2;
                                            }
                                            if (class153.field3452 > 10) {
                                                class141.field3200 = -1;
                                            }
                                            if (class85.field2086 > 50) {
                                                class20.field490++;
                                                class1.field22.method722(176, (byte) 10);
                                            }
                                            try {
                                                if (class127.field2915 != null && class1.field22.field2404 > 0) {
                                                    class127.field2915.method409((byte) -101, class1.field22.field2405, 0, class1.field22.field2404);
                                                    class1.field22.field2404 = 0;
                                                    class85.field2086 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var45) {
                                                class1.method7(512600200);
                                                return;
                                            }
                                        }
                                        var34 = var33.field3077;
                                        if (var34.field1764 < 0) {
                                            break;
                                        }
                                        var35 = class99.method770(-4894, var34.field1828);
                                    } while (var35 == null || var35.field1729 == null || var35.field1729.length <= var34.field1764 || var35.field1729[var34.field1764] != var34);
                                    class83.method681(var33, (byte) -106);
                                }
                            }
                            var31 = var30.field3077;
                            if (var31.field1764 < 0) {
                                break;
                            }
                            var32 = class99.method770(-4894, var31.field1828);
                        } while (var32 == null || var32.field1729 == null || var31.field1764 >= var32.field1729.length || var32.field1729[var31.field1764] != var31);
                        class83.method681(var30, (byte) -119);
                    }
                }
                var28 = var27.field3077;
                if (var28.field1764 < 0) {
                    break;
                }
                var29 = class99.method770(-4894, var28.field1828);
            } while (var29 == null || var29.field1729 == null || var29.field1729.length <= var28.field1764 || var29.field1729[var28.field1764] != var28);
            class83.method681(var27, (byte) -90);
        }
    }

    @OriginalMember(owner = "client!la", name = "d", descriptor = "(II)V")
    public final void method655(int arg0, int arg1) {
        for (int var3 = 0; var3 < this.field1880.length; var3++) {
            class21 var4 = this.field1880[var3];
            if (var4 != null && var4.field507 != 0 && var4.field506) {
                var4.method192(arg1);
                var4.field506 = false;
            }
        }
        field1865++;
        if (arg0 != -16890) {
            field1876 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BD)V")
    public final void method656(byte arg0, double arg1) {
        if (arg0 != -31) {
            method646((byte) 15);
        }
        field1864++;
        this.field1885 = arg1;
        this.method653(true);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II)Z")
    public final boolean method657(int arg0, int arg1) {
        if (arg1 <= 123) {
            this.field1883 = null;
        }
        field1866++;
        return true;
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lff;Lff;IDI)V")
    public class77(class42 arg0, class42 arg1, int arg2, double arg3, int arg4) {
        this.field1888 = arg2;
        this.field1887 = this.field1888;
        this.field1884 = arg4;
        this.field1889 = arg1;
        this.field1885 = arg3;
        int[] var7 = arg0.method352(0, 50);
        int var8 = var7.length;
        this.field1880 = new class21[arg0.method343((byte) 103, 0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class105 var10 = new class105(arg0.method350(0, -24, var7[var9]));
            this.field1880[var7[var9]] = new class21(var10);
        }
    }
}
