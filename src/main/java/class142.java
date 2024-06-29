import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class142 {

    @OriginalMember(owner = "client!tc", name = "n", descriptor = "I")
    public int field2295 = 0;

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "I")
    public int field2289 = 0;

    @OriginalMember(owner = "client!tc", name = "r", descriptor = "Z")
    private boolean field2299 = false;

    @OriginalMember(owner = "client!tc", name = "t", descriptor = "[Lll;")
    public static class147[] field2301 = new class147[8];

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "Lek;")
    public static class205 field2293 = new class205();

    @OriginalMember(owner = "client!tc", name = "A", descriptor = "Lrb;")
    public static class143 field2308 = new class143(32);

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    public static int field2283;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
    public static int field2284;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
    public int field2286;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
    public int field2287;

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
    public static int field2288;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "I")
    public int field2290;

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "I")
    public int field2291;

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "I")
    public static int field2292;

    @OriginalMember(owner = "client!tc", name = "m", descriptor = "I")
    public static int field2294;

    @OriginalMember(owner = "client!tc", name = "o", descriptor = "I")
    public int field2296;

    @OriginalMember(owner = "client!tc", name = "p", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!tc", name = "q", descriptor = "I")
    public int field2298;

    @OriginalMember(owner = "client!tc", name = "s", descriptor = "I")
    public int field2300;

    @OriginalMember(owner = "client!tc", name = "v", descriptor = "I")
    public int field2303;

    @OriginalMember(owner = "client!tc", name = "x", descriptor = "I")
    private int field2305;

    @OriginalMember(owner = "client!tc", name = "y", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!tc", name = "z", descriptor = "I")
    public int field2307;

    @OriginalMember(owner = "client!tc", name = "w", descriptor = "J")
    public long field2304;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "Llc;")
    public static class270 field2282;

    @OriginalMember(owner = "client!tc", name = "u", descriptor = "Llc;")
    public static class270 field2302;

    @OriginalMember(owner = "client!tc", name = "B", descriptor = "Llc;")
    public static class270 field2309;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lhc;I)V")
    public final void method1058(class53 arg0, int arg1) {
        if (arg1 != 934207399) {
            return;
        }
        while (true) {
            int var3 = arg0.method366(-16505);
            if (var3 == 0) {
                field2292++;
                return;
            }
            this.method1061(8, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1059(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class165.field2539 == 0) {
            int var7 = class202.field2972;
            int var8 = class249.field3765;
            int var9 = class51.field709;
            int var10 = class246.field3613;
            int var11 = (arg5 - arg6) * (var7 - var9) / arg0 + var9;
            int var12 = (arg1 - arg3) * (var10 - var8) / arg4 + var8;
            if (class6.field57 && (class69.field1111 & 0x40) != 0) {
                class263 var13 = class34.method219(class295.field4741, 45, class309.field4981);
                if (var13 == null) {
                    class308.method2088(-1);
                } else {
                    class63.method481(0L, var12, class87.field1380, var11, class169.field2567, (short) 45, -1, " ->");
                }
            } else {
                if (class121.field1986 == 1) {
                    class63.method481(0L, var12, -1, var11, class256.field3861, (short) 31, -1, "");
                }
                class302.field4891++;
                class63.method481(0L, var12, -1, var11, class24.field264, (short) 11, -1, "");
            }
        }
        field2284++;
        long var14 = -1L;
        if (arg2 <= 97) {
            field2288 = -8;
        }
        for (int var16 = 0; var16 < class89.field1438; var16++) {
            long var17 = class204.field3016[var16];
            int var19 = (int) var17 & 0x7F;
            int var20 = ((int) var17 & 0x3FA4) >> 7;
            int var21 = (int) var17 >> 29 & 0x3;
            int var22 = (int) (var17 >>> 32) & Integer.MAX_VALUE;
            if (var14 != var17) {
                var14 = var17;
                if (var21 == 2 && class235.method1622(class37.field474, var19, var20, var17)) {
                    class93 var23 = class48.method297(false, var22);
                    if (var23.field1528 != null) {
                        var23 = var23.method710(0);
                    }
                    if (var23 == null) {
                        continue;
                    }
                    if (class165.field2539 == 1) {
                        class63.method481(var17, var20, class298.field4788, var19, class260.field4026, (short) 43, -1, class221.field3221 + " -> <col=00ffff>" + var23.field1529);
                        class193.field2850++;
                    } else if (class6.field57) {
                        class192 var24 = class243.field3580 == -1 ? null : class51.method308((byte) -73, class243.field3580);
                        if ((class69.field1111 & 0x4) != 0 && (var24 == null || var23.method705(var24.field2840, 19850, class243.field3580) != var24.field2840)) {
                            class197.field2896++;
                            class63.method481(var17, var20, class87.field1380, var19, class169.field2567, (short) 15, -1, class136.field2220 + " -> <col=00ffff>" + var23.field1529);
                        }
                    } else {
                        class99.field1683++;
                        String[] var25 = var23.field1532;
                        if (class92.field1489) {
                            var25 = class135.method1020((byte) 0, var25);
                        }
                        if (var25 != null) {
                            for (int var26 = 4; var26 >= 0; var26--) {
                                if (var25[var26] != null) {
                                    class82.field1318++;
                                    short var27 = 0;
                                    int var28 = -1;
                                    if (var23.field1572 == var26) {
                                        var28 = var23.field1508;
                                    }
                                    if (var26 == 0) {
                                        var27 = 44;
                                    }
                                    if (var26 == 1) {
                                        var27 = 38;
                                    }
                                    if (var23.field1502 == var26) {
                                        var28 = var23.field1521;
                                    }
                                    if (var26 == 2) {
                                        var27 = 35;
                                    }
                                    if (var26 == 3) {
                                        var27 = 13;
                                    }
                                    if (var26 == 4) {
                                        var27 = 1010;
                                    }
                                    class63.method481(var17, var20, var28, var19, var25[var26], var27, -1, "<col=00ffff>" + var23.field1529);
                                }
                            }
                        }
                        class63.method481((long) var23.field1505, var20, class74.field1176, var19, class35.field452, (short) 1007, -1, "<col=00ffff>" + var23.field1529);
                    }
                }
                if (var21 == 1) {
                    class12 var29 = class255.field3856[var22];
                    if ((var29.field137.field1738 & 0x1) == 0 && (var29.field3660 & 0x7F) == 0 && (var29.field3753 & 0x7F) == 0 || (var29.field137.field1738 & 0x1) == 1 && (var29.field3660 & 0x7F) == 64 && (var29.field3753 & 0x7F) == 64) {
                        int var30 = var29.field3753 + 64 - (var29.field137.field1738 * 64);
                        int var31 = var29.field3660 + 64 - (var29.field137.field1738 * 64);
                        for (int var32 = 0; var32 < class12.field135; var32++) {
                            class12 var37 = class255.field3856[class14.field159[var32]];
                            if (var37 != null && !var37.field3743 && var29 != var37 && var37.field3736) {
                                int var38 = var37.field3660 + 64 - var37.field137.field1738 * 64;
                                int var39 = var37.field3753 + 64 - (var37.field137.field1738 * 64);
                                if (var38 >= var31 && var29.field137.field1738 - (var38 - var31 >> 7) >= var37.field137.field1738 && var39 >= var30 && var29.field137.field1738 - (var39 - var30 >> 7) >= var37.field137.field1738) {
                                    class292.method1987(var20, 102, var19, var37.field137, class14.field159[var32]);
                                    var37.field3743 = true;
                                }
                            }
                        }
                        for (int var33 = 0; var33 < class103.field1791; var33++) {
                            class207 var34 = class92.field1475[class162.field2518[var33]];
                            if (var34 != null && !var34.field3743 && var34.field3736) {
                                int var35 = var34.field3660 - ((var34.method1467(0) - 1) * 64);
                                int var36 = var34.field3753 - (var34.method1467(0) - 1) * 64;
                                if (var31 <= var35 && var34.method1467(0) <= var29.field137.field1738 - (var35 - var31 >> 7) && var30 <= var36 && var34.method1467(0) <= (var29.field137.field1738 - (var36 - var30 >> 7))) {
                                    class143.method1067(class162.field2518[var33], var19, true, var20, var34);
                                    var34.field3743 = true;
                                }
                            }
                        }
                    }
                    if (var29.field3743) {
                        continue;
                    }
                    class292.method1987(var20, 90, var19, var29.field137, var22);
                    var29.field3743 = true;
                }
                if (var21 == 0) {
                    class207 var40 = class92.field1475[var22];
                    if ((var40.field3660 & 0x7F) == 64 && (var40.field3753 & 0x7F) == 64) {
                        int var41 = var40.field3660 + (64 - (var40.method1467(0) * 64));
                        int var42 = var40.field3753 + (64 - (var40.method1467(0) * 64));
                        for (int var43 = 0; var43 < class12.field135; var43++) {
                            class12 var48 = class255.field3856[class14.field159[var43]];
                            if (var48 != null && !var48.field3743 && var48.field3736) {
                                int var49 = var48.field3660 + 64 - (var48.field137.field1738 * 64);
                                int var50 = var48.field3753 - ((var48.field137.field1738 - 1) * 64);
                                if (var49 >= var41 && var48.field137.field1738 <= (var40.method1467(0) - (var49 - var41 >> 7)) && var42 <= var50 && var48.field137.field1738 <= var40.method1467(0) - (var50 - var42 >> 7)) {
                                    class292.method1987(var20, 55, var19, var48.field137, class14.field159[var43]);
                                    var48.field3743 = true;
                                }
                            }
                        }
                        for (int var44 = 0; var44 < class103.field1791; var44++) {
                            class207 var45 = class92.field1475[class162.field2518[var44]];
                            if (var45 != null && !var45.field3743 && var40 != var45 && var45.field3736) {
                                int var46 = var45.field3660 - (var45.method1467(0) - 1) * 64;
                                int var47 = var45.field3753 + 64 - var45.method1467(0) * 64;
                                if (var46 >= var41 && var45.method1467(0) <= var40.method1467(0) - (var46 - var41 >> 7) && var42 <= var47 && var45.method1467(0) <= (var40.method1467(0) - (var47 - var42 >> 7))) {
                                    class143.method1067(class162.field2518[var44], var19, true, var20, var45);
                                    var45.field3743 = true;
                                }
                            }
                        }
                    }
                    if (var40.field3743) {
                        continue;
                    }
                    class143.method1067(var22, var19, true, var20, var40);
                    var40.field3743 = true;
                }
                if (var21 == 3) {
                    class2 var51 = class37.field475[class37.field474][var19][var20];
                    if (var51 != null) {
                        for (class193 var52 = (class193) var51.method6(32); var52 != null; var52 = (class193) var51.method7((byte) -89)) {
                            int var53 = var52.field2853.field3073;
                            class31 var54 = class12.method88(var53, 27838);
                            if (class165.field2539 == 1) {
                                class63.method481((long) var53, var20, class298.field4788, var19, class260.field4026, (short) 12, -1, class221.field3221 + " -> <col=ff9040>" + var54.field349);
                                class306.field4948++;
                            } else if (class6.field57) {
                                class192 var59 = class243.field3580 == -1 ? null : class51.method308((byte) -73, class243.field3580);
                                if ((class69.field1111 & 0x1) != 0 && (var59 == null || var54.method203(var59.field2840, class243.field3580, -41) != var59.field2840)) {
                                    class256.field3866++;
                                    class63.method481((long) var53, var20, class87.field1380, var19, class169.field2567, (short) 16, -1, class136.field2220 + " -> <col=ff9040>" + var54.field349);
                                }
                            } else {
                                class256.field3864++;
                                String[] var55 = var54.field354;
                                if (class92.field1489) {
                                    var55 = class135.method1020((byte) 0, var55);
                                }
                                for (int var56 = 4; var56 >= 0; var56--) {
                                    if (var55 != null && var55[var56] != null) {
                                        byte var57 = 0;
                                        if (var56 == 0) {
                                            var57 = 18;
                                        }
                                        class295.field4721++;
                                        if (var56 == 1) {
                                            var57 = 14;
                                        }
                                        if (var56 == 2) {
                                            var57 = 9;
                                        }
                                        if (var56 == 3) {
                                            var57 = 36;
                                        }
                                        int var58 = -1;
                                        if (var54.field381 == var56) {
                                            var58 = var54.field386;
                                        }
                                        if (var54.field388 == var56) {
                                            var58 = var54.field341;
                                        }
                                        if (var56 == 4) {
                                            var57 = 37;
                                        }
                                        class63.method481((long) var53, var20, var58, var19, var55[var56], var57, -1, "<col=ff9040>" + var54.field349);
                                    }
                                }
                                class63.method481((long) var53, var20, class74.field1176, var19, class35.field452, (short) 1009, -1, "<col=ff9040>" + var54.field349);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIBIII)V")
    public static final void method1060(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        int var6 = arg4;
        field2297++;
        int var7 = arg0 * arg0;
        int var8 = arg4 * arg4;
        if (arg2 != 110) {
            return;
        }
        int var9 = var8 << 1;
        int var10 = 0;
        int var11 = arg4 << 1;
        int var12 = (1 - var11) * var7 + var9;
        int var13 = var7 << 1;
        int var14 = var8 - ((var11 - 1) * var13);
        int var15 = var7 << 2;
        int var16 = var8 << 2;
        int var17 = ((var10 << 1) + 3) * var9;
        int var18 = ((arg4 << 1) - 3) * var13;
        if (class73.field1156 <= arg5 && class59.field859 >= arg5) {
            int var19 = class289.method1972(class264.field4230, (byte) 122, arg0 + arg3, class273.field4418);
            int var20 = class289.method1972(class264.field4230, (byte) 122, arg3 - arg0, class273.field4418);
            class89.method669(class104.field1795[arg5], arg1, var19, var20, (byte) -124);
        }
        int var21 = (arg4 - 1) * var15;
        int var22 = (var10 + 1) * var16;
        while (var6 > 0) {
            if (var12 < 0) {
                while (var12 < 0) {
                    var14 += var22;
                    var10++;
                    var12 += var17;
                    var17 += var16;
                    var22 += var16;
                }
            }
            var6--;
            int var23 = arg5 - var6;
            int var24 = arg5 + var6;
            if (var14 < 0) {
                var12 += var17;
                var14 += var22;
                var22 += var16;
                var10++;
                var17 += var16;
            }
            var12 += -var21;
            if (class73.field1156 <= var24 && class59.field859 >= var23) {
                int var25 = class289.method1972(class264.field4230, (byte) 122, arg3 + var10, class273.field4418);
                int var26 = class289.method1972(class264.field4230, (byte) 122, arg3 - var10, class273.field4418);
                if (var23 >= class73.field1156) {
                    class89.method669(class104.field1795[var23], arg1, var25, var26, (byte) -126);
                }
                if (var24 <= class59.field859) {
                    class89.method669(class104.field1795[var24], arg1, var25, var26, (byte) -123);
                }
            }
            var21 -= var15;
            var14 += -var18;
            var18 -= var15;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IILhc;)V")
    private final void method1061(int arg0, int arg1, class53 arg2) {
        if (arg0 != 8) {
            method1060(99, -103, (byte) 121, 25, -79, -41);
        }
        if (arg1 == 1) {
            this.field2305 = arg2.method331(-106);
        } else if (arg1 == 2) {
            arg2.method366(-16505);
        } else if (arg1 == 3) {
            this.field2296 = arg2.method340(-92);
            this.field2291 = arg2.method340(arg0 - 114);
            this.field2307 = arg2.method340(-122);
        } else if (arg1 == 4) {
            this.field2303 = arg2.method366(-16505);
            this.field2287 = arg2.method340(-93);
        } else if (arg1 == 6) {
            this.field2286 = arg2.method366(-16505);
        } else if (arg1 == 8) {
            this.field2295 = 1;
        } else if (arg1 == 9) {
            this.field2289 = 1;
        } else if (arg1 == 10) {
            this.field2299 = true;
        }
        field2306++;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Z)V")
    public final void method1062(boolean arg0) {
        this.field2290 = class244.field3592[this.field2305];
        if (!arg0) {
            this.field2305 = -28;
        }
        field2285++;
        this.field2300 = (int) Math.sqrt((double) (this.field2307 * this.field2307 + (this.field2296 * this.field2296 + (this.field2291 * this.field2291))));
        if (this.field2287 == 0) {
            this.field2287 = 1;
        }
        if (this.field2303 == 0) {
            this.field2304 = 2147483647L;
        } else if (this.field2303 == 1) {
            this.field2304 = (long) (this.field2300 * 8 / this.field2287);
            this.field2304 *= this.field2304;
        } else if (this.field2303 == 2) {
            this.field2304 = (long) (this.field2300 * 8 / this.field2287);
        }
        if (this.field2299) {
            this.field2300 *= -1;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
    public static void method1063(int arg0) {
        field2302 = null;
        field2301 = null;
        if (arg0 != -19774) {
            method1059(11, -51, -64, 88, -12, -60, 36);
        }
        field2282 = null;
        field2309 = null;
        field2293 = null;
        field2308 = null;
    }
}
