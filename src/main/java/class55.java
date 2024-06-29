import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class55 extends class181 {

    @OriginalMember(owner = "client!nd", name = "C", descriptor = "I")
    public static int field925 = 0;

    @OriginalMember(owner = "client!nd", name = "R", descriptor = "[I")
    public static int[] field939 = new int[99];

    @OriginalMember(owner = "client!nd", name = "t", descriptor = "I")
    public static int field917;

    @OriginalMember(owner = "client!nd", name = "u", descriptor = "I")
    public int field918;

    @OriginalMember(owner = "client!nd", name = "v", descriptor = "I")
    public int field919;

    @OriginalMember(owner = "client!nd", name = "w", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "client!nd", name = "x", descriptor = "I")
    public int field921;

    @OriginalMember(owner = "client!nd", name = "y", descriptor = "I")
    public int field922;

    @OriginalMember(owner = "client!nd", name = "z", descriptor = "I")
    public static int field923;

    @OriginalMember(owner = "client!nd", name = "A", descriptor = "I")
    public static int field924;

    @OriginalMember(owner = "client!nd", name = "D", descriptor = "I")
    public static int field926;

    @OriginalMember(owner = "client!nd", name = "E", descriptor = "I")
    public int field927;

    @OriginalMember(owner = "client!nd", name = "F", descriptor = "I")
    public int field928;

    @OriginalMember(owner = "client!nd", name = "G", descriptor = "I")
    public static int field929;

    @OriginalMember(owner = "client!nd", name = "I", descriptor = "I")
    public int field930;

    @OriginalMember(owner = "client!nd", name = "J", descriptor = "I")
    public int field931;

    @OriginalMember(owner = "client!nd", name = "L", descriptor = "I")
    public int field933;

    @OriginalMember(owner = "client!nd", name = "M", descriptor = "I")
    public static int field934;

    @OriginalMember(owner = "client!nd", name = "N", descriptor = "I")
    public int field935;

    @OriginalMember(owner = "client!nd", name = "O", descriptor = "I")
    public int field936;

    @OriginalMember(owner = "client!nd", name = "P", descriptor = "I")
    public int field937;

    @OriginalMember(owner = "client!nd", name = "Q", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!nd", name = "K", descriptor = "[I")
    public static int[] field932;

    @OriginalMember(owner = "client!nd", name = "s", descriptor = "[Lji;")
    public static class256[] field916;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(II)Ldf;")
    public static final class145 method460(int arg0, int arg1) {
        if (arg1 >= -77) {
            return null;
        }
        field924++;
        class145 var2 = (class145) class8.field93.method945((long) arg0, true);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class64.field1075.method1605(-127, arg0, 3);
        class145 var4 = new class145();
        if (var3 != null) {
            var4.method994(new class54(var3), false);
        }
        class8.field93.method941(var4, (long) arg0, -8447);
        return var4;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIIZI)V")
    public static final void method461(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field934++;
        int var6 = arg2 - arg3;
        int var7 = arg0 - arg5;
        if (var7 == 0) {
            if (var6 != 0) {
                class283.method1879(arg3, arg1, arg5, 0, arg2);
            }
        } else if (var6 == 0) {
            class130.method893(arg0, arg5, 65, arg3, arg1);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (!arg4) {
                if (var7 < 0) {
                    var7 = -var7;
                }
                boolean var8 = var7 < var6;
                if (var8) {
                    int var9 = arg5;
                    arg5 = arg3;
                    int var10 = arg0;
                    arg3 = var9;
                    arg0 = arg2;
                    arg2 = var10;
                }
                if (arg5 > arg0) {
                    int var11 = arg5;
                    int var12 = arg3;
                    arg3 = arg2;
                    arg2 = var12;
                    arg5 = arg0;
                    arg0 = var11;
                }
                int var13 = arg3;
                int var14 = arg2 - arg3;
                int var15 = arg0 - arg5;
                if (var14 < 0) {
                    var14 = -var14;
                }
                int var16 = -(var15 >> 1);
                int var17 = arg3 >= arg2 ? -1 : 1;
                if (var8) {
                    for (int var19 = arg5; var19 <= arg0; var19++) {
                        class241.field3751[var19][var13] = arg1;
                        var16 += var14;
                        if (var16 > 0) {
                            var16 -= var15;
                            var13 += var17;
                        }
                    }
                } else {
                    for (int var18 = arg5; var18 <= arg0; var18++) {
                        class241.field3751[var13][var18] = arg1;
                        var16 += var14;
                        if (var16 > 0) {
                            var13 += var17;
                            var16 -= var15;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIIIIB)V")
    public static final void method462(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        field920++;
        if (arg6 < 21) {
            method466(83, -100, -57, 9, false, 92);
        }
        class243.method1655(arg5, -116);
        int var7 = 0;
        int var8 = arg5 - arg2;
        int var9 = arg5;
        int var10 = -arg5;
        if (var8 < 0) {
            var8 = 0;
        }
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        if (class175.field2557 <= arg0 && arg0 <= class91.field1381) {
            int[] var15 = class241.field3751[arg0];
            int var16 = class251.method1710(arg4 - arg5, (byte) 27, class196.field2961, class84.field1287);
            int var17 = class251.method1710(arg4 + arg5, (byte) 27, class196.field2961, class84.field1287);
            int var18 = class251.method1710(arg4 - var8, (byte) 27, class196.field2961, class84.field1287);
            int var19 = class251.method1710(arg4 + var8, (byte) 27, class196.field2961, class84.field1287);
            class222.method1519((byte) -108, var16, var15, var18, arg1);
            class222.method1519((byte) -117, var18, var15, var19, arg3);
            class222.method1519((byte) -126, var19, var15, var17, arg1);
        }
        while (var7 < var9) {
            var14 += 2;
            var13 += 2;
            var12 += var14;
            var10 += var13;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                class13.field187[var11] = var7;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                int var20 = arg0 - var9;
                int var21 = arg0 + var9;
                if (var21 >= class175.field2557 && class91.field1381 >= var20) {
                    if (var9 < var8) {
                        int var22 = class13.field187[var9];
                        int var23 = class251.method1710(arg4 + var7, (byte) 27, class196.field2961, class84.field1287);
                        int var24 = class251.method1710(arg4 - var7, (byte) 27, class196.field2961, class84.field1287);
                        int var25 = class251.method1710(arg4 + var22, (byte) 27, class196.field2961, class84.field1287);
                        int var26 = class251.method1710(arg4 - var22, (byte) 27, class196.field2961, class84.field1287);
                        if (var21 <= class91.field1381) {
                            int[] var27 = class241.field3751[var21];
                            class222.method1519((byte) -115, var24, var27, var26, arg1);
                            class222.method1519((byte) -114, var26, var27, var25, arg3);
                            class222.method1519((byte) -121, var25, var27, var23, arg1);
                        }
                        if (class175.field2557 <= var20) {
                            int[] var28 = class241.field3751[var20];
                            class222.method1519((byte) -111, var24, var28, var26, arg1);
                            class222.method1519((byte) -117, var26, var28, var25, arg3);
                            class222.method1519((byte) -110, var25, var28, var23, arg1);
                        }
                    } else {
                        int var29 = class251.method1710(arg4 + var7, (byte) 27, class196.field2961, class84.field1287);
                        int var30 = class251.method1710(arg4 - var7, (byte) 27, class196.field2961, class84.field1287);
                        if (var21 <= class91.field1381) {
                            class222.method1519((byte) -116, var30, class241.field3751[var21], var29, arg1);
                        }
                        if (var20 >= class175.field2557) {
                            class222.method1519((byte) -128, var30, class241.field3751[var20], var29, arg1);
                        }
                    }
                }
            }
            int var31 = arg0 - var7;
            int var32 = arg0 + var7;
            if (class175.field2557 <= var32 && class91.field1381 >= var31) {
                int var33 = arg4 - var9;
                int var34 = arg4 + var9;
                if (class196.field2961 <= var34 && class84.field1287 >= var33) {
                    int var35 = class251.method1710(var34, (byte) 27, class196.field2961, class84.field1287);
                    int var36 = class251.method1710(var33, (byte) 27, class196.field2961, class84.field1287);
                    if (var7 < var8) {
                        int var37 = var7 <= var11 ? var11 : class13.field187[var7];
                        int var38 = class251.method1710(arg4 + var37, (byte) 27, class196.field2961, class84.field1287);
                        int var39 = class251.method1710(arg4 - var37, (byte) 27, class196.field2961, class84.field1287);
                        if (class91.field1381 >= var32) {
                            int[] var40 = class241.field3751[var32];
                            class222.method1519((byte) -113, var36, var40, var39, arg1);
                            class222.method1519((byte) -112, var39, var40, var38, arg3);
                            class222.method1519((byte) -127, var38, var40, var35, arg1);
                        }
                        if (class175.field2557 <= var31) {
                            int[] var41 = class241.field3751[var31];
                            class222.method1519((byte) -115, var36, var41, var39, arg1);
                            class222.method1519((byte) -113, var39, var41, var38, arg3);
                            class222.method1519((byte) -118, var38, var41, var35, arg1);
                        }
                    } else {
                        if (class91.field1381 >= var32) {
                            class222.method1519((byte) -116, var36, class241.field3751[var32], var35, arg1);
                        }
                        if (class175.field2557 <= var31) {
                            class222.method1519((byte) -126, var36, class241.field3751[var31], var35, arg1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(I)V")
    public static final void method463(int arg0) {
        class103.field1512 = true;
        class15.field277 = 0L;
        class264.field4132.field2970 = 0;
        class25.field476 = 0;
        field917++;
        class88.field1337 = 0;
        class277.field4266 = 0;
        class128.field1875 = 0;
        class258.field3956 = 0;
        class218.field3347 = 0;
        class102.field1493 = 0;
        class211.field3174 = 0;
        class211.field3178 = 0;
        class50.field816 = 0;
        class17.field317 = 0;
        class78.field1236 = 0;
        class259.field3983 = 0;
        class61.field1008 = 0;
        class198.field2984 = 0;
        class115.field1749 = 0;
        class186.field2721 = 0;
        class160.field2325 = 0;
        class124.field1836 = 0;
        class18.field324 = 0;
        class68.field1129 = 0;
        class253.field3918 = 0;
        class6.field72 = 0;
        class163.field2358 = 0;
        class85.field1301 = 0;
        class43.field751 = 0;
        class111.field1672 = 0;
        class108.field1591 = 0;
        class194.field2933 = 0;
        class3.field37 = 0;
        class153.field2235 = 0;
        class284.field4366 = 0;
        class268.field4174 = 0;
        class296.field4500 = 0;
        class258.field3953 = 0;
        class183.field2665 = 0;
        class236.field3621 = 0;
        class51.field825 = 0;
        class217.field3336 = 0;
        class32.field566 = 0;
        class54.field909 = 0;
        class54.field878 = 0;
        class256.field3940 = 0;
        class165.field2427 = 0;
        class197.field2971 = 0;
        class8.field94 = 0;
        class248.field3855 = 0;
        class75.field1198 = 0;
        class14.field199 = 0;
        class201.field3010 = 0;
        class286.field4382 = 0;
        class61.field998 = 0;
        class43.field760 = 0;
        class189.field2819 = 0;
        class77.field1217 = 0;
        class269.field4187 = 0;
        class297.field4652 = 0;
        class198.field2983 = 0;
        class237.field3661 = 0;
        class168.field2469 = 0;
        class243.field3760 = 0;
        class15.field282 = 0;
        class137.field1990 = 0;
        class275.field4240 = 0;
        class277.field4263 = 0;
        class281.field4310 = 0;
        class152.field2220 = 0;
        class183.field2660 = 0;
        class211.field3151 = 0;
        class212.field3189 = 0;
        class251.field3883 = 0;
        class24.field395 = 0;
        class6.field77 = 0;
        class296.field4520 = 0;
        class256.field3938 = 0;
        class212.field3191 = 0;
        class61.field1019 = 0;
        class212.field3239 = 0;
        class36.field642 = 0;
        class216.field3314 = 0;
        class237.field3650 = 0;
        class108.field1579 = 0;
        class275.field4255 = 0;
        class54.field906 = 0;
        class61.field1005 = 0;
        class212.field3226 = 0;
        class260.field3996 = 0;
        class147.field2136 = 0;
        class278.field4288 = 0;
        class211.field3150 = 0;
        class19.field332 = 0;
        class54.field850 = 0;
        class130.field1917 = 0;
        class155.field2272 = 0;
        class208.field3122 = 0;
        class4.field52 = 0;
        class54.field904 = 0;
        class136.field1981 = 0;
        class21.field354 = 0;
        class148.field2141 = 0;
        class246.field3822 = 0;
        class154.field2258 = 0;
        class210.field3142 = 0;
        class259.field3980 = 0;
        class278.field4284 = 0;
        class54.field847 = 0;
        class162.field2340 = 0;
        class281.field4312 = 0;
        class191.field2898 = 0;
        class122.field1808 = 0;
        class165.field2418 = 0;
        class54.field907 = 0;
        class54.field853 = 0;
        class85.field1299 = 0;
        class153.field2249 = 0;
        class188.field2760 = 0;
        class90.field1365 = 0;
        class121.field1799 = 0;
        class175.field2561 = 0;
        class69.field1142 = 0;
        class5.field64 = 0;
        class189.field2807 = 0;
        class125.field1844 = 0;
        class237.field3676 = 0;
        class10.field153 = 0;
        class225.field3515 = 0;
        class237.field3638 = 0;
        class215.field3303 = 0;
        class54.field846 = 0;
        class24.field386 = 0;
        class236.field3630 = 0;
        class103.field1507 = 0;
        class284.field4350 = 0;
        class54.field845 = 0;
        class130.field1902 = 0;
        class102.field1500 = 0;
        class75.field1200 = 0;
        class141.field2035 = 0;
        class164.field2386 = 0;
        class9.field117 = 0;
        class270.field4211 = 0;
        class101.field1485 = 0;
        class111.field1690 = 0;
        class124.field1835 = 0;
        class178.field2609 = 0;
        class88.field1330 = 0;
        class125.field1850 = 0;
        class54.field891 = 0;
        class189.field2827 = 0;
        class100.field1454 = 0;
        class148.field2140 = 0;
        class297.field4562 = 0;
        class54.field880 = 0;
        class9.field116 = 0;
        class109.field1597 = 0;
        class73.field1183 = 0;
        class152.field2230 = 0;
        class157.field2304 = 0;
        class27.field526 = 0;
        class225.field3520 = 0;
        class196.field2955 = 0;
        class211.field3167 = 0;
        class156.field2286 = 0;
        class209.field3132 = 0;
        class124.field1830 = 0;
        class117.field1770 = 0;
        class124.field1831 = 0;
        class191.field2891 = 0;
        class105.field1544 = 0;
        class102.field1496 = 0;
        class237.field3648 = 0;
        class207.field3096 = 0;
        class15.field232 = 0;
        class139.field2010 = 0;
        class277.field4270 = 0;
        class131.field1927 = 0;
        class224.field3495 = 0;
        class81.field1255 = 0;
        class7.field86 = 0;
        class117.field1772 = 0;
        class153.field2236 = 0;
        class196.field2964 = 0;
        class61.field1004 = 0;
        class25.field440 = 0;
        class73.field1185 = 0;
        class113.field1720 = 0;
        class22.field361 = 0;
        class142.field2058 = 0;
        class92.field1385 = 0;
        class295.field4493 = 0;
        class43.field755 = 0;
        class96.field1415 = 0;
        class152.field2226 = 0;
        class164.field2397 = 0;
        class107.field1576 = 0;
        class175.field2562 = 0;
        class180.field2619 = 0;
        class217.field3334 = 0;
        class227.field3550 = 0;
        class101.field1484 = 0;
        class189.field2837 = 0;
        class189.field2828 = 0;
        class224.field3501 = 0;
        class269.field4178 = 0;
        class283.field4333 = 0;
        class275.field4259 = 0;
        class56.field945 = 0;
        class212.field3225 = 0;
        class150.field2180 = 0;
        class224.field3503 = 0;
        class109.field1614 = 0;
        class249.field3857 = 0;
        class185.field2697 = 0;
        class134.field1961 = 0;
        class237.field3647 = 0;
        class159.field2315 = 0;
        class138.field2001 = 0;
        class39.field695 = 0;
        class231.field3570 = 0;
        class183.field2654 = 0;
        class32.field567 = 0;
        class130.field1901 = 0;
        class177.field2601 = 0;
        class9.field115 = 0;
        class212.field3224 = 0;
        class54.field852 = 0;
        class231.field3580 = 0;
        class269.field4192 = 0;
        class54.field895 = 0;
        class20.field344 = 0;
        class296.field4504 = 0;
        class19.field331 = 0;
        class246.field3834 = 0;
        class64.field1065 = 0;
        class228.field3555 = 0;
        class186.field2727 = 0;
        class34.field611 = 0;
        class261.field4003 = 0;
        class81.field1256 = 0;
        class17.field318 = 0;
        class152.field2232 = 0;
        class39.field697 = 0;
        class131.field1928 = 0;
        client.field724 = 0;
        class251.field3884 = 0;
        class139.field2011 = 0;
        class253.field3909 = 0;
        class239.field3684 = 0;
        class212.field3234 = 0;
        class62.field1032 = 0;
        class78.field1226 = 0;
        class163.field2367 = 0;
        class160.field2319 = 0;
        class33.field588 = 0;
        class286.field4386 = 0;
        class191.field2892 = 0;
        class162.field2342 = 0;
        class54.field915 = 0;
        class225.field3513 = 0;
        class54.field866 = 0;
        class189.field2851 = 0;
        class210.field3137 = 0;
        class90.field1373 = 0;
        class149.field2153 = 0;
        class63.field1058 = 0;
        class222.field3460 = 0;
        class134.field1968 = 0;
        class66.field1088 = 0;
        class232.field3596 = 0;
        class283.field4325 = 0;
        class73.field1184 = 0;
        class245.field3804 = 0;
        class105.field1551 = 0;
        class253.field3897 = 0;
        class58.field959 = 0;
        class236.field3623 = 0;
        class78.field1221 = 0;
        class177.field2600 = 0;
        class34.field608 = 0;
        class249.field3865 = 0;
        class225.field3523 = 0;
        class214.field3292 = 0;
        class15.field268 = 0;
        class87.field1320 = 0;
        class104.field1521 = 0;
        class54.field894 = 0;
        class295.field4494 = 0;
        class43.field763 = 0;
        class231.field3572 = 0;
        class139.field2021 = 0;
        class189.field2853 = 0;
        class171.field2504 = 0;
        class68.field1135 = 0;
        if (arg0 > -112) {
            return;
        }
        class165.field2431 = 0;
        class1.field4 = 0;
        class163.field2362 = 0;
        class66.field1090 = 0;
        class42.field748 = 0;
        class189.field2830 = 0;
        class100.field1461 = 0;
        class186.field2722 = 0;
        class293.field4445 = 0;
        class15.field243 = 0;
        class134.field1971 = 0;
        class139.field2015 = 0;
        class87.field1315 = 0;
        class51.field823 = 0;
        class120.field1795 = 0;
        class212.field3197 = 0;
        class280.field4303 = 0;
        class15.field247 = 0;
        class54.field889 = 0;
        class133.field1951 = 0;
        class244.field3779 = 0;
        class199.field2990 = 0;
        class90.field1375 = 0;
        class157.field2300 = 0;
        class62.field1036 = 0;
        class236.field3625 = 0;
        class253.field3898 = 0;
        class232.field3594 = 0;
        class33.field589 = 0;
        class199.field2997 = 0;
        class96.field1419 = 0;
        class261.field4006 = 0;
        class54.field900 = 0;
        class284.field4356 = 0;
        class231.field3579 = 0;
        class258.field3963 = 0;
        class21.field348 = 0;
        class67.field1103 = 0;
        class54.field903 = 0;
        class142.field2045 = 0;
        class240.field3730 = 0;
        class262.field4033 = 0;
        class222.field3452 = 0;
        class107.field1573 = 0;
        class164.field2396 = 0;
        class97.field1437 = 0;
        class61.field1007 = 0;
        class235.field3618 = 0;
        class97.field1423 = 0;
        class137.field1991 = 0;
        class188.field2799 = 0;
        class73.field1186 = 0;
        class211.field3162 = 0;
        class200.field3005 = 0;
        class173.field2537 = 0;
        class30.field559 = 0;
        class12.field176 = 0;
        class63.field1047 = 0;
        class296.field4514 = 0;
        class54.field860 = 0;
        class166.field2449 = 0;
        class266.field4150 = 0;
        class285.field4378 = 0;
        class155.field2267 = 0;
        class83.field1277 = 0;
        class106.field1565 = 0;
        class102.field1492 = 0;
        class32.field565 = 0;
        class211.field3153 = 0;
        class156.field2288 = 0;
        class237.field3674 = 0;
        class37.field648 = 0;
        class191.field2890 = 0;
        class12.field174 = 0;
        class111.field1676 = 0;
        class54.field914 = 0;
        class67.field1108 = 0;
        class5.field65 = 0;
        class217.field3333 = 0;
        class109.field1594 = 0;
        class110.field1638 = 0;
        class224.field3480 = 0;
        class59.field969 = 0;
        class90.field1368 = 0;
        class111.field1696 = 0;
        class60.field980 = 0;
        class156.field2285 = 0;
        class42.field749 = 0;
        class273.field4229 = 0;
        class47.field794 = 0;
        class297.field4526 = 0;
        class58.field961 = 0;
        class10.field152 = 0;
        class59.field971 = 0;
        class207.field3101 = 0;
        class196.field2963 = 0;
        class212.field3241 = 0;
        class297.field4626 = 0;
        class13.field186 = 0;
        class103.field1505 = 0;
        class237.field3653 = 0;
        class213.field3268 = 0;
        class109.field1607 = 0;
        class296.field4519 = 0;
        class212.field3188 = 0;
        class163.field2372 = 0;
        class36.field636 = 0;
        class222.field3457 = 0;
        class85.field1296 = 0;
        class78.field1224 = 0;
        class25.field473 = 0;
        class265.field4145 = 0;
        class183.field2656 = 0;
        class195.field2951 = 0;
        class102.field1486 = 0;
        class285.field4374 = 0;
        class76.field1210 = 0;
        class186.field2713 = 0;
        class109.field1593 = 0;
        class39.field702 = 0;
        class152.field2228 = 0;
        class224.field3489 = 0;
        class173.field2536 = 0;
        class17.field319 = 0;
        class226.field3531 = 0;
        class286.field4385 = 0;
        class104.field1536 = 0;
        class54.field881 = 0;
        class54.field882 = 0;
        class181.field2634 = 0;
        class145.field2093 = 0;
        class277.field4276 = 0;
        class273.field4230 = 0;
        class71.field1170 = 0;
        class76.field1213 = 0;
        class81.field1253 = 0;
        class100.field1466 = 0;
        class97.field1421 = 0;
        class146.field2120 = 0;
        class297.field4657 = 0;
        class240.field3722 = 0;
        class145.field2106 = 0;
        class240.field3723 = 0;
        class155.field2271 = 0;
        class253.field3894 = 0;
        class210.field3144 = 0;
        class54.field885 = 0;
        class220.field3412 = 0;
        class54.field890 = 0;
        class207.field3111 = 0;
        class75.field1194 = 0;
        class150.field2194 = 0;
        class206.field3081 = 0;
        class103.field1513 = 0;
        field926 = 0;
        class60.field977 = 0;
        class142.field2050 = 0;
        class185.field2691 = 0;
        class258.field3954 = 0;
        class178.field2608 = 0;
        class183.field2655 = 0;
        class254.field3920 = 0;
        class75.field1196 = 0;
        class83.field1276 = 0;
        class169.field2496 = 0;
        class174.field2549 = 0;
        class183.field2653 = 0;
        class111.field1685 = 0;
        class61.field999 = 0;
        class134.field1969 = 0;
        class262.field4038 = 0;
        class202.field3046 = 0;
        class150.field2196 = 0;
        class61.field1016 = 0;
        class130.field1923 = 0;
        class181.field2626 = 0;
        class297.field4605 = 0;
        class134.field1958 = 0;
        class133.field1949 = 0;
        class244.field3782 = 0;
        class90.field1360 = 0;
        class34.field616 = 0;
        class216.field3328 = 0;
        class96.field1418 = 0;
        class83.field1274 = 0;
        class164.field2404 = 0;
        class33.field583 = 0;
        class81.field1258 = 0;
        class188.field2766 = 0;
        class9.field111 = 0;
        class54.field905 = 0;
        class54.field865 = 0;
        class54.field867 = 0;
        class188.field2753 = 0;
        class37.field654 = 0;
        class142.field2037 = 0;
        class126.field1858 = 0;
        class229.field3559 = 0;
        client.field732 = 0;
        class297.field4637 = 0;
        class22.field362 = 0;
        class224.field3494 = 0;
        class211.field3165 = 0;
        class244.field3777 = 0;
        class81.field1259 = 0;
        class67.field1105 = 0;
        class15.field254 = 0;
        class268.field4173 = 0;
        class241.field3742 = 0;
        class88.field1335 = 0;
        class128.field1877 = 0;
        class272.field4224 = 0;
        class190.field2879 = 0;
        class164.field2388 = 0;
        class245.field3815 = 0;
        class66.field1091 = 0;
        class180.field2625 = 0;
        class211.field3160 = 0;
        class237.field3668 = 0;
        class5.field71 = 0;
        class81.field1260 = 0;
        class3.field42 = 0;
        class43.field768 = 0;
        class189.field2824 = 0;
        class54.field849 = 0;
        class87.field1316 = 0;
        class78.field1228 = 0;
        class211.field3170 = 0;
        class240.field3726 = 0;
        class207.field3109 = 0;
        class189.field2825 = 0;
        class245.field3806 = 0;
        client.field734 = 0;
        class97.field1426 = 0;
        class9.field109 = 0;
        class234.field3608 = 0;
        class54.field884 = 0;
        class281.field4315 = 0;
        class233.field3603 = 0;
        class50.field817 = 0;
        class177.field2597 = 0;
        class186.field2724 = 0;
        class106.field1566 = 0;
        class12.field178 = 0;
        field934 = 0;
        class179.field2618 = 0;
        class59.field973 = 0;
        class111.field1679 = 0;
        class216.field3325 = 0;
        class174.field2548 = 0;
        class19.field337 = 0;
        class267.field4162 = 0;
        class165.field2420 = 0;
        class283.field4328 = 0;
        class108.field1587 = 0;
        class225.field3514 = 0;
        class24.field389 = 0;
        class262.field4042 = 0;
        class15.field229 = 0;
        class166.field2440 = 0;
        class191.field2888 = 0;
        class100.field1452 = 0;
        class90.field1363 = 0;
        class102.field1499 = 0;
        class207.field3102 = 0;
        class253.field3916 = 0;
        class189.field2875 = 0;
        class25.field464 = 0;
        class19.field335 = 0;
        class56.field946 = 0;
        class59.field972 = 0;
        class212.field3195 = 0;
        class206.field3089 = 0;
        class1.field12 = 0;
        class109.field1627 = 0;
        class206.field3087 = 0;
        class1.field16 = 0;
        class246.field3829 = 0;
        class180.field2624 = 0;
        class33.field596 = 0;
        class253.field3915 = 0;
        class61.field996 = 0;
        class81.field1264 = 0;
        class18.field326 = 0;
        class297.field4659 = 0;
        class189.field2863 = 0;
        class295.field4488 = 0;
        class206.field3084 = 0;
        class245.field3814 = 0;
        class11.field160 = 0;
        class150.field2175 = 0;
        class89.field1346 = 0;
        class270.field4210 = 0;
        class168.field2471 = 0;
        class245.field3791 = 0;
        class269.field4181 = 0;
        class220.field3416 = 0;
        class61.field991 = 0;
        class211.field3166 = 0;
        class100.field1460 = 0;
        class164.field2393 = 0;
        class127.field1868 = 0;
        class227.field3541 = 0;
        class87.field1326 = 0;
        class111.field1694 = 0;
        class89.field1345 = 0;
        class37.field646 = 0;
        class261.field4005 = 0;
        class248.field3850 = 0;
        class143.field2071 = 0;
        class207.field3094 = 0;
        class237.field3665 = 0;
        class297.field4583 = 0;
        class177.field2596 = 0;
        class269.field4199 = 0;
        class152.field2227 = 0;
        class155.field2262 = 0;
        class103.field1506 = 0;
        class139.field2005 = 0;
        class152.field2229 = 0;
        class25.field407 = 0;
        class221.field3439 = 0;
        class270.field4212 = 0;
        class236.field3629 = 0;
        class249.field3860 = 0;
        class267.field4168 = 0;
        field923 = 0;
        class212.field3214 = 0;
        class261.field4015 = 0;
        class261.field4014 = 0;
        class18.field325 = 0;
        class54.field896 = 0;
        class224.field3484 = 0;
        class114.field1741 = 0;
        class34.field607 = 0;
        class15.field263 = 0;
        class195.field2950 = 0;
        class25.field492 = 0;
        class90.field1371 = 0;
        class54.field893 = 0;
        class188.field2788 = 0;
        class237.field3642 = 0;
        class275.field4256 = 0;
        class153.field2245 = 0;
        class29.field535 = 0;
        class170.field2500 = 0;
        class111.field1689 = 0;
        class202.field3043 = 0;
        class202.field3041 = 0;
        class11.field163 = 0;
        class12.field182 = 0;
        class185.field2701 = 0;
        class212.field3200 = 0;
        class231.field3575 = 0;
        class36.field640 = 0;
        class202.field3045 = 0;
        class133.field1957 = 0;
        class123.field1827 = 0;
        class202.field3051 = 0;
        class151.field2209 = 0;
        class8.field95 = 0;
        class51.field828 = 0;
        class145.field2094 = 0;
        class273.field4232 = 0;
        class261.field4004 = 0;
        class47.field792 = 0;
        class1.field17 = 0;
        class71.field1169 = 0;
        class58.field955 = 0;
        class14.field210 = 0;
        class68.field1127 = 0;
        class123.field1817 = 0;
        class141.field2031 = 0;
        class296.field4508 = 0;
        class200.field3002 = 0;
        class260.field3993 = 0;
        class89.field1352 = 0;
        class260.field3998 = 0;
        class241.field3753 = 0;
        class54.field859 = 0;
        class218.field3340 = 0;
        class150.field2188 = 0;
        class112.field1718 = 0;
        class177.field2594 = 0;
        class181.field2630 = 0;
        class217.field3339 = 0;
        class213.field3279 = 0;
        class16.field291 = 0;
        class59.field970 = 0;
        class87.field1329 = 0;
        class61.field1015 = 0;
        class176.field2584 = 0;
        class115.field1746 = 0;
        class199.field2993 = 0;
        class273.field4228 = 0;
        class239.field3687 = 0;
        class275.field4243 = 0;
        class275.field4253 = 0;
        class103.field1509 = 0;
        class284.field4369 = 0;
        class64.field1067 = 0;
        class33.field584 = 0;
        class211.field3154 = 0;
        class246.field3830 = 0;
        class54.field844 = 0;
        class227.field3538 = 0;
        class6.field74 = 0;
        class212.field3227 = 0;
        class122.field1816 = 0;
        class181.field2638 = 0;
        class266.field4153 = 0;
        class209.field3133 = 0;
        class166.field2442 = 0;
        class188.field2735 = 0;
        class237.field3659 = 0;
        class22.field372 = 0;
        class207.field3110 = 0;
        class54.field913 = 0;
        class183.field2661 = 0;
        class49.field812 = 0;
        class27.field521 = 0;
        class16.field293 = 0;
        class237.field3652 = 0;
        class59.field967 = 0;
        class105.field1546 = 0;
        class76.field1208 = 0;
        class284.field4355 = 0;
        class297.field4639 = 0;
        class224.field3492 = 0;
        class78.field1244 = 0;
        class195.field2947 = 0;
        class292.field4433 = 0;
        class51.field822 = 0;
        class237.field3654 = 0;
        class60.field982 = 0;
        class7.field81 = 0;
        class124.field1832 = 0;
        class194.field2936 = 0;
        class239.field3699 = 0;
        class292.field4431 = 0;
        class202.field3054 = 0;
        class25.field470 = 0;
        class253.field3903 = 0;
        class296.field4511 = 0;
        class68.field1136 = 0;
        class153.field2243 = 0;
        class3.field38 = 0;
        class88.field1340 = 0;
        class224.field3512 = 0;
        class222.field3454 = 0;
        class212.field3215 = 0;
        class54.field872 = 0;
        class155.field2277 = 0;
        class130.field1911 = 0;
        class297.field4695 = 0;
        class297.field4688 = 0;
        class54.field892 = 0;
        class212.field3220 = 0;
        class293.field4449 = 0;
        class163.field2380 = 0;
        class227.field3548 = 0;
        class84.field1292 = 0;
        class261.field4018 = 0;
        class115.field1750 = 0;
        class212.field3201 = 0;
        class104.field1517 = 0;
        class186.field2718 = 0;
        class54.field874 = 0;
        class227.field3535 = 0;
        class206.field3083 = 0;
        class32.field577 = 0;
        class156.field2287 = 0;
        class104.field1519 = 0;
        class191.field2901 = 0;
        class162.field2338 = 0;
        class54.field875 = 0;
        class135.field1976 = 0;
        class27.field524 = 0;
        class237.field3640 = 0;
        class142.field2059 = 0;
        class149.field2167 = 0;
        class232.field3592 = 0;
        class228.field3557 = 0;
        class213.field3272 = 0;
        class84.field1281 = 0;
        class137.field1993 = 0;
        class3.field45 = 0;
        client.field717 = 0;
        class173.field2532 = 0;
        client.field726 = 0;
        class104.field1532 = 0;
        class141.field2033 = 0;
        class212.field3245 = 0;
        class9.field110 = 0;
        class153.field2237 = 0;
        class22.field370 = 0;
        class277.field4268 = 0;
        class33.field591 = 0;
        class39.field706 = 0;
        class64.field1068 = 0;
        class239.field3678 = 0;
        class140.field2027 = 0;
        class212.field3228 = 0;
        class76.field1212 = 0;
        class162.field2351 = 0;
        class129.field1900 = 0;
        class100.field1457 = 0;
        class81.field1252 = 0;
        class68.field1124 = 0;
        class212.field3247 = 0;
        class237.field3656 = 0;
        class142.field2048 = 0;
        class278.field4283 = 0;
        class267.field4170 = 0;
        class156.field2283 = 0;
        class87.field1318 = 0;
        class30.field561 = 0;
        class69.field1147 = 0;
        class245.field3805 = 0;
        class241.field3752 = 0;
        class69.field1137 = 0;
        class71.field1167 = 0;
        class224.field3496 = 0;
        class109.field1602 = 0;
        class249.field3859 = 0;
        class155.field2266 = 0;
        client.field727 = 0;
        class283.field4346 = 0;
        class243.field3764 = 0;
        class166.field2443 = 0;
        class153.field2246 = 0;
        class25.field480 = 0;
        class212.field3223 = 0;
        class275.field4257 = 0;
        class297.field4663 = 0;
        class269.field4195 = 0;
        class250.field3882 = 0;
        class178.field2604 = 0;
        class14.field194 = 0;
        class260.field3985 = 0;
        class66.field1086 = 0;
        class82.field1267 = 0;
        class83.field1278 = 0;
        class51.field840 = 0;
        class185.field2693 = 0;
        class262.field4035 = 0;
        class111.field1686 = 0;
        class106.field1563 = 0;
        class85.field1300 = 0;
        class225.field3522 = 0;
        class163.field2368 = 0;
        class106.field1559 = 0;
        class85.field1295 = 0;
        class133.field1948 = 0;
        class188.field2778 = 0;
        class8.field99 = 0;
        class214.field3286 = 0;
        class54.field876 = 0;
        class126.field1860 = 0;
        class220.field3411 = 0;
        class111.field1680 = 0;
        class23.field381 = 0;
        class16.field294 = 0;
        class245.field3819 = 0;
        class61.field1000 = 0;
        class284.field4362 = 0;
        class277.field4271 = 0;
        class259.field3969 = 0;
        class160.field2322 = 0;
        client.field731 = 0;
        class178.field2610 = 0;
        class51.field835 = 0;
        class211.field3180 = 0;
        class109.field1620 = 0;
        class164.field2399 = 0;
        class267.field4169 = 0;
        class111.field1684 = 0;
        class176.field2576 = 0;
        class293.field4443 = 0;
        class295.field4486 = 0;
        class176.field2577 = 0;
        class287.field4393 = 0;
        class47.field787 = 0;
        class195.field2944 = 0;
        class246.field3825 = 0;
        class89.field1355 = 0;
        class220.field3419 = 0;
        class149.field2166 = 0;
        class213.field3281 = 0;
        class270.field4209 = 0;
        class54.field857 = 0;
        class54.field912 = 0;
        class265.field4139 = 0;
        class104.field1530 = 0;
        class246.field3832 = 0;
        class239.field3686 = 0;
        class39.field699 = 0;
        class188.field2779 = 0;
        class102.field1491 = 0;
        class110.field1654 = 0;
        class220.field3420 = 0;
        class101.field1479 = 0;
        class3.field43 = 0;
        class131.field1932 = 0;
        class153.field2248 = 0;
        class142.field2053 = 0;
        class247.field3841 = 0;
        class225.field3519 = 0;
        class227.field3536 = 0;
        class212.field3238 = 0;
        class212.field3198 = 0;
        class108.field1580 = 0;
        class278.field4285 = 0;
        class221.field3445 = 0;
        class117.field1771 = 0;
        class296.field4505 = 0;
        class292.field4430 = 0;
        class122.field1814 = 0;
        class21.field352 = 0;
        class12.field169 = 0;
        class76.field1206 = 0;
        class9.field105 = 0;
        class173.field2527 = 0;
        class245.field3813 = 0;
        class185.field2684 = 0;
        class194.field2931 = 0;
        class34.field615 = 0;
        class157.field2298 = 0;
        class121.field1802 = 0;
        class34.field599 = 0;
        class108.field1583 = 0;
        class86.field1314 = 0;
        class188.field2740 = 0;
        class214.field3290 = 0;
        class34.field617 = 0;
        class212.field3199 = 0;
        class4.field49 = 0;
        class296.field4507 = 0;
        class153.field2233 = 0;
        class231.field3577 = 0;
        class184.field2672 = 0;
        class186.field2726 = 0;
        class253.field3917 = 0;
        class228.field3552 = 0;
        class171.field2507 = 0;
        class260.field3992 = 0;
        class54.field862 = 0;
        class247.field3845 = 0;
        class37.field653 = 0;
        class121.field1804 = 0;
        class84.field1289 = 0;
        class11.field161 = 0;
        class168.field2479 = 0;
        class32.field578 = 0;
        class283.field4348 = 0;
        class54.field883 = 0;
        class275.field4254 = 0;
        class215.field3299 = 0;
        class214.field3287 = 0;
        class124.field1837 = 0;
        class89.field1341 = 0;
        class239.field3705 = 0;
        class111.field1691 = 0;
        class163.field2360 = 0;
        class69.field1144 = 0;
        class220.field3405 = 0;
        class292.field4432 = 0;
        class284.field4367 = 0;
        class211.field3163 = 0;
        class243.field3758 = 0;
        class1.field2 = 0;
        class75.field1203 = 0;
        class211.field3155 = 0;
        class128.field1872 = 0;
        class277.field4278 = 0;
        class39.field698 = 0;
        class196.field2966 = 0;
        class212.field3190 = 0;
        class25.field458 = 0;
        class237.field3658 = 0;
        class88.field1331 = 0;
        class195.field2942 = 0;
        class134.field1972 = 0;
        class7.field82 = 0;
        class5.field66 = 0;
        class293.field4447 = 0;
        class164.field2385 = 0;
        class82.field1268 = 0;
        class15.field237 = 0;
        class43.field753 = 0;
        client.field718 = 0;
        class237.field3671 = 0;
        class54.field911 = 0;
        class54.field908 = 0;
        class150.field2192 = 0;
        class50.field815 = 0;
        class212.field3244 = 0;
        class237.field3657 = 0;
        class194.field2932 = 0;
        class131.field1934 = 0;
        class186.field2720 = 0;
        class37.field652 = 0;
        class296.field4498 = 0;
        class273.field4233 = 0;
        class172.field2517 = 0;
        class21.field350 = 0;
        class199.field2992 = 0;
        class17.field320 = 0;
        class145.field2107 = 0;
        class84.field1286 = 0;
        class43.field758 = 0;
        class17.field313 = 0;
        class92.field1386 = 0;
        class245.field3817 = 0;
        class237.field3660 = 0;
        class275.field4261 = 0;
        class78.field1229 = 0;
        class120.field1796 = 0;
        class111.field1675 = 0;
        class143.field2069 = 0;
        class245.field3811 = 0;
        class149.field2163 = 0;
        class13.field191 = 0;
        class292.field4435 = 0;
        class260.field3987 = 0;
        class44.field774 = 0;
        class215.field3297 = 0;
        class211.field3179 = 0;
        class171.field2512 = 0;
        class240.field3729 = 0;
        class165.field2434 = 0;
        class286.field4381 = 0;
        class246.field3824 = 0;
        class295.field4487 = 0;
        class188.field2752 = 0;
        class186.field2714 = 0;
        class244.field3770 = 0;
        class142.field2044 = 0;
        class283.field4335 = 0;
        class58.field958 = 0;
        class18.field330 = 0;
        class66.field1094 = 0;
        class14.field212 = 0;
        class275.field4248 = 0;
        class17.field308 = 0;
        class77.field1219 = 0;
        class210.field3138 = 0;
        class153.field2234 = 0;
        class261.field4029 = 0;
        class205.field3071 = 0;
        class39.field689 = 0;
        client.field716 = 0;
        class202.field3039 = 0;
        class54.field898 = 0;
        class89.field1342 = 0;
        class150.field2186 = 0;
        class233.field3600 = 0;
        class215.field3296 = 0;
        class212.field3246 = 0;
        class153.field2247 = 0;
        class7.field87 = 0;
        class137.field1989 = 0;
        class139.field2007 = 0;
        class212.field3222 = 0;
        class213.field3280 = 0;
        class212.field3237 = 0;
        class13.field192 = 0;
        class87.field1328 = 0;
        class206.field3082 = 0;
        class296.field4512 = 0;
        class162.field2347 = 0;
        class277.field4265 = 0;
        class250.field3876 = 0;
        class54.field910 = 0;
        class224.field3507 = 0;
        class105.field1557 = 0;
        class78.field1241 = 0;
        class44.field773 = 0;
        class151.field2201 = 0;
        class245.field3792 = 0;
        class42.field740 = 0;
        class61.field1009 = 0;
        class68.field1130 = 0;
        class159.field2314 = 0;
        class253.field3911 = 0;
        class30.field542 = 0;
        class269.field4180 = 0;
        class296.field4509 = 0;
        class259.field3979 = 0;
        class261.field4027 = 0;
        class296.field4518 = 0;
        class121.field1797 = 0;
        class68.field1131 = 0;
        class61.field1001 = 0;
        class218.field3346 = 0;
        class127.field1864 = 0;
        class292.field4436 = 0;
        class239.field3693 = 0;
        class105.field1548 = 0;
        class237.field3646 = 0;
        class245.field3801 = 0;
        class188.field2750 = 0;
        class81.field1257 = 0;
        class22.field367 = 0;
        class145.field2114 = 0;
        class102.field1487 = 0;
        class211.field3156 = 0;
        class44.field778 = 0;
        class218.field3342 = 0;
        class9.field112 = 0;
        class9.field106 = 0;
        class153.field2250 = 0;
        class81.field1254 = 0;
        class265.field4144 = 0;
        class250.field3871 = 0;
        class237.field3669 = 0;
        class212.field3255 = 0;
        class67.field1104 = 0;
        class284.field4351 = 0;
        class82.field1269 = 0;
        class87.field1319 = 0;
        class261.field4007 = 0;
        class258.field3957 = 0;
        class110.field1656 = 0;
        class189.field2843 = 0;
        class15.field244 = 0;
        class277.field4279 = 0;
        class212.field3207 = 0;
        class241.field3748 = 0;
        class267.field4165 = 0;
        class295.field4485 = 0;
        class111.field1671 = 0;
        class164.field2400 = 0;
        class246.field3831 = 0;
        class20.field345 = 0;
        class126.field1861 = 0;
        class211.field3172 = 0;
        class87.field1322 = 0;
        class56.field950 = 0;
        class297.field4572 = 0;
        class197.field2973 = 0;
        class239.field3719 = 0;
        class146.field2117 = 0;
        class212.field3217 = 0;
        class19.field336 = 0;
        class7.field79 = 0;
        client.field735 = 0;
        class260.field3995 = 0;
        class103.field1508 = 0;
        class154.field2255 = 0;
        class195.field2943 = 0;
        class275.field4258 = 0;
        class47.field791 = 0;
        class60.field986 = 0;
        class181.field2631 = 0;
        class63.field1043 = 0;
        class90.field1361 = 0;
        class205.field3067 = 0;
        class287.field4395 = 0;
        class89.field1350 = 0;
        class260.field3989 = 0;
        class237.field3664 = 0;
        class61.field992 = 0;
        class281.field4316 = 0;
        client.field719 = 0;
        class239.field3690 = 0;
        class240.field3732 = 0;
        class102.field1489 = 0;
        class168.field2470 = 0;
        class237.field3644 = 0;
        class266.field4148 = 0;
        class54.field855 = 0;
        class110.field1639 = 0;
        class130.field1914 = 0;
        class296.field4496 = 0;
        class226.field3526 = 0;
        class14.field196 = 0;
        class221.field3444 = 0;
        class170.field2502 = 0;
        class296.field4503 = 0;
        class66.field1096 = 0;
        class15.field213 = 0;
        class124.field1834 = 0;
        class226.field3529 = 0;
        class215.field3309 = 0;
        class76.field1211 = 0;
        class68.field1123 = 0;
        class256.field3946 = 0;
        class90.field1369 = 0;
        class207.field3100 = 0;
        class224.field3482 = 0;
        class56.field944 = 0;
        class151.field2210 = 0;
        class211.field3171 = 0;
        class211.field3173 = 0;
        class284.field4360 = 0;
        class78.field1240 = 0;
        class195.field2953 = 0;
        class62.field1038 = 0;
        class246.field3827 = 0;
        class105.field1543 = 0;
        class138.field1998 = 0;
        class15.field262 = 0;
        class12.field181 = 0;
        class18.field327 = 0;
        class247.field3842 = 0;
        class54.field886 = 0;
        class225.field3524 = 0;
        class155.field2265 = 0;
        class243.field3767 = 0;
        class7.field89 = 0;
        class61.field1012 = 0;
        class232.field3591 = 0;
        class142.field2038 = 0;
        class10.field159 = 0;
        class226.field3534 = 0;
        class260.field3999 = 0;
        class42.field747 = 0;
        class280.field4301 = 0;
        class218.field3345 = 0;
        class139.field2017 = 0;
        class39.field700 = 0;
        class213.field3274 = 0;
        class169.field2482 = 0;
        class212.field3231 = 0;
        class188.field2738 = 0;
        class96.field1416 = 0;
        class182.field2652 = 0;
        class234.field3606 = 0;
        class39.field701 = 0;
        class162.field2353 = 0;
        class195.field2949 = 0;
        class216.field3327 = 0;
        class175.field2554 = 0;
        class296.field4516 = 0;
        class262.field4040 = 0;
        class15.field287 = 0;
        class68.field1120 = 0;
        class226.field3530 = 0;
        class56.field942 = 0;
        class218.field3343 = 0;
        class145.field2104 = 0;
        class237.field3643 = 0;
        class166.field2450 = 0;
        class68.field1118 = 0;
        class121.field1803 = 0;
        class151.field2211 = 0;
        class173.field2533 = 0;
        class200.field3009 = 0;
        class267.field4159 = 0;
        class90.field1374 = 0;
        class275.field4235 = 0;
        class211.field3169 = 0;
        class159.field2316 = 0;
        field938 = 0;
        class14.field202 = 0;
        class164.field2401 = 0;
        class250.field3881 = 0;
        class34.field600 = 0;
        class199.field2986 = 0;
        class96.field1417 = 0;
        class221.field3448 = 0;
        class145.field2110 = 0;
        class142.field2046 = 0;
        class286.field4384 = 0;
        class207.field3099 = 0;
        class244.field3775 = 0;
        class97.field1439 = 0;
        class167.field2464 = 0;
        class179.field2617 = 0;
        class292.field4438 = 0;
        class237.field3667 = 0;
        class54.field888 = 0;
        class283.field4339 = 0;
        class231.field3584 = 0;
        class212.field3216 = 0;
        class233.field3604 = 0;
        class163.field2370 = 0;
        class265.field4138 = 0;
        class32.field576 = 0;
        class100.field1455 = 0;
        class247.field3843 = 0;
        class139.field2022 = 0;
        class54.field856 = 0;
        class104.field1524 = 0;
        class237.field3649 = 0;
        class220.field3407 = 0;
        class32.field572 = 0;
        class188.field2769 = 0;
        class164.field2391 = 0;
        class129.field1894 = 0;
        class284.field4352 = 0;
        class159.field2313 = 0;
        class185.field2695 = 0;
        client.field733 = 0;
        class23.field378 = 0;
        class168.field2476 = 0;
        class245.field3802 = 0;
        class297.field4682 = 0;
        class214.field3288 = 0;
        class239.field3708 = 0;
        class253.field3913 = 0;
        class36.field639 = 0;
        class5.field70 = 0;
        class9.field114 = 0;
        class67.field1109 = 0;
        class169.field2487 = 0;
        class244.field3776 = 0;
        class63.field1045 = 0;
        class224.field3510 = 0;
        class237.field3645 = 0;
        class215.field3302 = 0;
        client.field722 = 0;
        class210.field3139 = 0;
        class232.field3589 = 0;
        class172.field2515 = 0;
        class131.field1941 = 0;
        class145.field2101 = 0;
        class166.field2445 = 0;
        class117.field1760 = 0;
        class202.field3044 = 0;
        class131.field1933 = 0;
        client.field730 = 0;
        class212.field3209 = 0;
        class210.field3136 = 0;
        class54.field854 = 0;
        class221.field3440 = 0;
        class267.field4163 = 0;
        class105.field1547 = 0;
        class107.field1575 = 0;
        class145.field2108 = 0;
        class231.field3581 = 0;
        class148.field2143 = 0;
        class54.field870 = 0;
        class212.field3194 = 0;
        class78.field1242 = 0;
        class43.field754 = 0;
        class162.field2356 = 0;
        class78.field1231 = 0;
        class224.field3481 = 0;
        class21.field353 = 0;
        class190.field2882 = 0;
        class117.field1768 = 0;
        class113.field1730 = 0;
        class111.field1697 = 0;
        class142.field2054 = 0;
        class143.field2072 = 0;
        class10.field119 = 0;
        class152.field2222 = 0;
        class137.field1994 = 0;
        class91.field1382 = 0;
        class186.field2711 = 0;
        class37.field651 = 0;
        class151.field2205 = 0;
        class145.field2112 = 0;
        class17.field306 = 0;
        class266.field4154 = 0;
        class54.field869 = 0;
        class211.field3164 = 0;
        class212.field3254 = 0;
        class162.field2352 = 0;
        class231.field3578 = 0;
        class61.field990 = 0;
        class142.field2062 = 0;
        class170.field2498 = 0;
        class155.field2260 = 0;
        class262.field4032 = 0;
        class15.field245 = 0;
        class151.field2199 = 0;
        class27.field520 = 0;
        class250.field3874 = 0;
        class17.field309 = 0;
        class211.field3152 = 0;
        class103.field1514 = 0;
        class216.field3320 = 0;
        class89.field1358 = 0;
        class121.field1801 = 0;
        class122.field1810 = 0;
        class212.field3229 = 0;
        class111.field1677 = 0;
        class222.field3453 = 0;
        class148.field2145 = 0;
        class211.field3158 = 0;
        class131.field1937 = 0;
        class186.field2723 = 0;
        class34.field598 = 0;
        class231.field3569 = 0;
        class104.field1538 = 0;
        class34.field609 = 0;
        class236.field3628 = 0;
        class262.field4037 = 0;
        class54.field902 = 0;
        class264.field4129 = 0;
        class292.field4437 = 0;
        client.field725 = 0;
        class217.field3335 = 0;
        class225.field3517 = 0;
        class89.field1351 = 0;
        class139.field2020 = 0;
        class220.field3430 = 0;
        class231.field3586 = 0;
        class205.field3077 = 0;
        class34.field602 = 0;
        class250.field3870 = 0;
        class111.field1683 = 0;
        class207.field3106 = 0;
        class152.field2231 = 0;
        class20.field346 = 0;
        class296.field4513 = 0;
        class111.field1678 = 0;
        class108.field1588 = 0;
        class181.field2636 = 0;
        class244.field3772 = 0;
        class59.field968 = 0;
        class258.field3960 = 0;
        class34.field601 = 0;
        class228.field3556 = 0;
        class139.field2009 = 0;
        class162.field2344 = 0;
        class211.field3147 = 0;
        class261.field4013 = 0;
        class254.field3923 = 0;
        class59.field963 = 0;
        class129.field1895 = 0;
        class207.field3107 = 0;
        class253.field3904 = 0;
        class162.field2348 = 0;
        class253.field3899 = 0;
        class212.field3196 = 0;
        class11.field168 = 0;
        class211.field3146 = 0;
        class167.field2463 = 0;
        class190.field2884 = 0;
        class60.field985 = 0;
        class211.field3175 = 0;
        class49.field808 = 0;
        class295.field4479 = 0;
        class167.field2458 = 0;
        class189.field2872 = 0;
        class237.field3662 = 0;
        class125.field1853 = 0;
        class223.field3467 = 0;
        class85.field1306 = 0;
        class68.field1134 = 0;
        class237.field3651 = 0;
        class229.field3562 = 0;
        class237.field3641 = 0;
        class254.field3922 = 0;
        class63.field1053 = 0;
        class258.field3962 = 0;
        class235.field3612 = 0;
        class297.field4595 = 0;
        client.field723 = 0;
        field920 = 0;
        class164.field2387 = 0;
        class88.field1338 = 0;
        class23.field374 = 0;
        class153.field2244 = 0;
        class51.field821 = 0;
        class142.field2055 = 0;
        class81.field1263 = 0;
        class15.field285 = 0;
        class84.field1290 = 0;
        class7.field85 = 0;
        class32.field570 = 0;
        class212.field3235 = 0;
        class213.field3284 = 0;
        class197.field2974 = 0;
        class262.field4034 = 0;
        class54.field851 = 0;
        class115.field1748 = 0;
        class295.field4489 = 0;
        class113.field1733 = 0;
        class5.field62 = 0;
        class152.field2217 = 0;
        class164.field2390 = 0;
        class296.field4502 = 0;
        class156.field2279 = 0;
        class185.field2707 = 0;
        class191.field2889 = 0;
        class54.field897 = 0;
        class190.field2877 = 0;
        class208.field3124 = 0;
        class103.field1511 = 0;
        class259.field3982 = 0;
        class39.field694 = 0;
        class62.field1030 = 0;
        class127.field1862 = 0;
        class69.field1143 = 0;
        class4.field51 = 0;
        class237.field3672 = 0;
        class47.field793 = 0;
        class123.field1828 = 0;
        class195.field2941 = 0;
        class6.field76 = 0;
        class287.field4396 = 0;
        class280.field4306 = 0;
        client.field721 = 0;
        class211.field3176 = 0;
        class143.field2067 = 0;
        class115.field1751 = 0;
        class171.field2506 = 0;
        class129.field1899 = 0;
        class54.field868 = 0;
        class139.field2013 = 0;
        class284.field4370 = 0;
        class109.field1618 = 0;
        class163.field2376 = 0;
        class297.field4704 = 0;
        class232.field3595 = 0;
        class63.field1050 = 0;
        class188.field2756 = 0;
        class190.field2880 = 0;
        class181.field2627 = 0;
        class15.field249 = 0;
        class42.field745 = 0;
        class162.field2345 = 0;
        class91.field1379 = 0;
        class280.field4304 = 0;
        class133.field1947 = 0;
        class173.field2529 = 0;
        class78.field1239 = 0;
        class189.field2869 = 0;
        class136.field1985 = 0;
        class237.field3670 = 0;
        class266.field4149 = 0;
        class160.field2332 = 0;
        class34.field613 = 0;
        class212.field3205 = 0;
        class191.field2895 = 0;
        class125.field1848 = 0;
        class39.field707 = 0;
        class212.field3193 = 0;
        class87.field1325 = 0;
        class62.field1029 = 0;
        class245.field3818 = 0;
        class113.field1722 = 0;
        class275.field4245 = 0;
        class284.field4359 = 0;
        class211.field3159 = 0;
        class194.field2935 = 0;
        class164.field2389 = 0;
        class25.field446 = 0;
        class64.field1063 = 0;
        class216.field3331 = 0;
        class181.field2632 = 0;
        class220.field3418 = 0;
        class272.field4226 = 0;
        class90.field1376 = 0;
        class175.field2556 = 0;
        class59.field965 = 0;
        class214.field3293 = 0;
        class171.field2505 = 0;
        class278.field4280 = 0;
        class54.field871 = 0;
        class135.field1978 = 0;
        class176.field2579 = 0;
        class261.field4017 = 0;
        field924 = 0;
        class247.field3839 = 0;
        class39.field692 = 0;
        class237.field3666 = 0;
        class54.field873 = 0;
        class47.field796 = 0;
        class143.field2070 = 0;
        class138.field2003 = 0;
        class54.field864 = 0;
        class1.field3 = 0;
        class251.field3886 = 0;
        class114.field1740 = 0;
        class284.field4365 = 0;
        class6.field78 = 0;
        class220.field3410 = 0;
        class199.field2996 = 0;
        class87.field1327 = 0;
        class173.field2535 = 0;
        class160.field2326 = 0;
        class296.field4501 = 0;
        class179.field2613 = 0;
        class218.field3349 = 0;
        class260.field3990 = 0;
        class45.field782 = 0;
        class134.field1966 = 0;
        class207.field3095 = 0;
        class107.field1571 = 0;
        class211.field3168 = 0;
        class216.field3329 = 0;
        class25.field427 = 0;
        class224.field3497 = 0;
        class84.field1283 = 0;
        class115.field1747 = 0;
        class131.field1935 = 0;
        class19.field338 = 0;
        class218.field3341 = 0;
        class156.field2280 = 0;
        class264.field4126 = 0;
        class214.field3291 = 0;
        class208.field3120 = 0;
        class142.field2043 = 0;
        class150.field2191 = 0;
        class25.field396 = 0;
        class154.field2257 = 0;
        class202.field3049 = 0;
        class264.field4135 = 0;
        class201.field3011 = 0;
        class261.field4026 = 0;
        class177.field2602 = 0;
        class78.field1233 = 0;
        class11.field164 = 0;
        class16.field295 = 0;
        field917 = 0;
        class32.field573 = 0;
        class216.field3323 = 0;
        class175.field2566 = 0;
        class200.field3006 = 0;
        class105.field1541 = 0;
        class222.field3456 = 0;
        class97.field1433 = 0;
        class212.field3218 = 0;
        class280.field4296 = 0;
        class21.field347 = 0;
        class212.field3192 = 0;
        class146.field2122 = 0;
        class21.field355 = 0;
        class224.field3499 = 0;
        class169.field2490 = 0;
        class275.field4242 = 0;
        class101.field1468 = 0;
        class149.field2168 = 0;
        class188.field2754 = 0;
        class9.field113 = 0;
        class220.field3414 = 0;
        class13.field190 = 0;
        class15.field274 = 0;
        class78.field1232 = 0;
        class140.field2026 = true;
        class125.method875((byte) -119);
        class163.field2377 = -1;
        class236.field3624 = -1;
        class59.field964.field887 = 0;
        class283.field4330 = -1;
        class206.field3091 = 0;
        class125.field1847 = 0;
        class173.field2543.field887 = 0;
        class199.field3000 = -1;
        class8.field101 = 0;
        for (int var1 = 0; var1 < class234.field3610.length; var1++) {
            class234.field3610[var1] = null;
        }
        class66.field1093 = false;
        class51.field826 = 0;
        class258.method1738(0, 11);
        for (int var2 = 0; var2 < 100; var2++) {
            class155.field2264[var2] = null;
        }
        class111.field1693 = 0;
        class213.field3283 = -1;
        class208.field3116 = (int) (Math.random() * 80.0D) - 40;
        class69.field1139 = (int) (Math.random() * 110.0D) - 55;
        class76.field1205 = false;
        class277.field4275 = 0;
        class284.field4353 = 0;
        class283.field4336 = 0;
        class97.field1427 = 0;
        class109.field1605 = (int) (Math.random() * 100.0D) - 50;
        class207.field3093 = 0;
        class208.field3123 = 0;
        class89.field1349 = (float) ((int) (Math.random() * 20.0D) - 10 & 0x7FF);
        class258.field3958 = (int) (Math.random() * 30.0D) - 20;
        class96.field1420 = (int) (Math.random() * 120.0D) - 60;
        class266.field4155 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class166.field2438[var3] = null;
            class85.field1302[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class243.field3762[var4] = null;
        }
        class185.field2687 = class166.field2438[2047] = new class224();
        class21.field349.method1891(34);
        class73.field1187.method1891(85);
        if (class235.field3614 != null) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < 104; var6++) {
                    for (int var7 = 0; var7 < 104; var7++) {
                        class235.field3614[var5][var6][var7] = null;
                    }
                }
            }
        }
        class269.field4183 = new class284();
        class239.field3711 = 0;
        class3.field36 = 0;
        class139.method946(-1);
        class201.method1339(-22813);
        class179.field2616 = 0;
        class127.field1866 = 0;
        class123.field1821 = 0;
        class86.field1313 = 0;
        class19.field339 = 0;
        class61.field1024 = 0;
        class210.field3135 = 0;
        class139.field2006 = 0;
        class178.field2607 = 0;
        class44.field776 = 0;
        for (int var8 = 0; var8 < class117.field1759.length; var8++) {
            class117.field1759[var8] = -1;
        }
        if (class184.field2677 != -1) {
            class181.method1189(class184.field2677, 14670);
        }
        for (class123 var9 = (class123) class124.field1833.method315((byte) -73); var9 != null; var9 = (class123) class124.field1833.method310(-119)) {
            class102.method743(true, 100, var9);
        }
        class184.field2677 = -1;
        class124.field1833 = new class39(8);
        class162.method1092(4);
        class7.field90 = null;
        class51.field826 = 0;
        class66.field1093 = false;
        class171.field2508.method1773(false, -125, -1, new int[5], -1, (int[]) null);
        for (int var10 = 0; var10 < 8; var10++) {
            class296.field4497[var10] = null;
            class64.field1070[var10] = false;
            class196.field2967[var10] = -1;
        }
        class67.method535((byte) -82);
        class78.field1227 = true;
        for (int var11 = 0; var11 < 100; var11++) {
            class17.field315[var11] = true;
        }
        class182.field2646 = null;
        class212.field3256 = 0;
        class51.field838 = null;
        for (int var12 = 0; var12 < 6; var12++) {
            class264.field4133[var12] = new class267();
        }
        for (int var13 = 0; var13 < 25; var13++) {
            class259.field3967[var13] = 0;
            class202.field3053[var13] = 0;
            class102.field1502[var13] = 0;
        }
        class195.field2946 = class126.field1859;
        class91.field1378 = class176.field2572 = class164.field2395 = class135.field1977 = new short[256];
        class157.field2305 = 0;
        class36.field641 = true;
        class148.field2146 = false;
        class248.method1698(-96);
        class197.field2979 = false;
        class36.method284(-113);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIIIII)I")
    public static final int method464(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg3 & 0x3;
        if ((arg1 & 0x1) == 1) {
            int var8 = arg5;
            arg5 = arg6;
            arg6 = var8;
        }
        field926++;
        if (var7 == 0) {
            return arg0;
        } else if (var7 == 1) {
            return arg4;
        } else if (var7 == 2) {
            return 7 - arg0 - (arg5 + -1);
        } else {
            if (arg2 != 8) {
                field932 = null;
            }
            return 8 - arg6 - arg4;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(BIIIIII)V")
    public static final void method465(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field938++;
        int var7 = class251.method1710(arg4, (byte) 27, class175.field2557, class91.field1381);
        int var8 = class251.method1710(arg1, (byte) 27, class175.field2557, class91.field1381);
        if (arg0 != 106) {
            field929 = -52;
        }
        int var9 = class251.method1710(arg3, (byte) 27, class196.field2961, class84.field1287);
        int var10 = class251.method1710(arg5, (byte) 27, class196.field2961, class84.field1287);
        int var11 = class251.method1710(arg4 + arg2, (byte) 27, class175.field2557, class91.field1381);
        int var12 = class251.method1710(arg1 - arg2, (byte) 27, class175.field2557, class91.field1381);
        for (int var13 = var7; var13 < var11; var13++) {
            class222.method1519((byte) -113, var9, class241.field3751[var13], var10, arg6);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class222.method1519((byte) -115, var9, class241.field3751[var14], var10, arg6);
        }
        int var15 = class251.method1710(arg2 + arg3, (byte) 27, class196.field2961, class84.field1287);
        int var16 = class251.method1710(arg5 - arg2, (byte) 27, class196.field2961, class84.field1287);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class241.field3751[var17];
            class222.method1519((byte) -128, var9, var18, var15, arg6);
            class222.method1519((byte) -126, var16, var18, var10, arg6);
        }
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(IIIIZI)V")
    public static final void method466(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        for (int var6 = arg2; var6 <= (arg1 + arg2); var6++) {
            for (int var11 = arg0; var11 <= arg0 + arg3; var11++) {
                if (var11 >= 0 && var11 < 104 && var6 >= 0 && var6 < 104) {
                    class51.field834[arg5][var11][var6] = 127;
                }
            }
        }
        if (!arg4) {
            return;
        }
        field923++;
        for (int var7 = arg2; var7 < (arg2 + arg1); var7++) {
            for (int var10 = arg0; var10 < (arg0 + arg3); var10++) {
                if (var10 >= 0 && var10 < 104 && var7 >= 0 && var7 < 104) {
                    class166.field2451[arg5][var10][var7] = arg5 <= 0 ? 0 : class166.field2451[arg5 - 1][var10][var7];
                }
            }
        }
        if (arg0 > 0 && arg0 < 104) {
            for (int var8 = arg2 + 1; var8 < arg1 + arg2; var8++) {
                if (var8 >= 0 && var8 < 104) {
                    class166.field2451[arg5][arg0][var8] = class166.field2451[arg5][arg0 - 1][var8];
                }
            }
        }
        if (arg2 > 0 && arg2 < 104) {
            for (int var9 = arg0 + 1; var9 < arg0 + arg3; var9++) {
                if (var9 >= 0 && var9 < 104) {
                    class166.field2451[arg5][var9][arg2] = class166.field2451[arg5][var9][arg2 - 1];
                }
            }
        }
        if (arg0 < 0 || arg2 < 0 || arg0 >= 104 || arg2 >= 104) {
            return;
        }
        if (arg5 == 0) {
            if (arg0 > 0 && class166.field2451[arg5][arg0 - 1][arg2] != 0) {
                class166.field2451[arg5][arg0][arg2] = class166.field2451[arg5][arg0 - 1][arg2];
                return;
            }
            if (arg2 > 0 && class166.field2451[arg5][arg0][arg2 - 1] != 0) {
                class166.field2451[arg5][arg0][arg2] = class166.field2451[arg5][arg0][arg2 - 1];
                return;
            }
            if (arg0 > 0 && arg2 > 0 && class166.field2451[arg5][arg0 - 1][arg2 - 1] != 0) {
                class166.field2451[arg5][arg0][arg2] = class166.field2451[arg5][arg0 - 1][arg2 - 1];
                return;
            }
            return;
        }
        if (arg0 > 0 && class166.field2451[arg5][arg0 - 1][arg2] != class166.field2451[arg5 - 1][arg0 - 1][arg2]) {
            class166.field2451[arg5][arg0][arg2] = class166.field2451[arg5][arg0 - 1][arg2];
            return;
        }
        if (arg2 > 0 && class166.field2451[arg5 - 1][arg0][arg2 - 1] != class166.field2451[arg5][arg0][arg2 - 1]) {
            class166.field2451[arg5][arg0][arg2] = class166.field2451[arg5][arg0][arg2 - 1];
            return;
        }
        if (arg0 > 0 && arg2 > 0 && class166.field2451[arg5 - 1][arg0 - 1][arg2 - 1] != class166.field2451[arg5][arg0 - 1][arg2 - 1]) {
            class166.field2451[arg5][arg0][arg2] = class166.field2451[arg5][arg0 - 1][arg2 - 1];
            return;
        }
    }

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "(I)V")
    public static void method467(int arg0) {
        field939 = null;
        field916 = null;
        if (arg0 != 0) {
            field916 = null;
        }
        field932 = null;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field939[var1] = var0 / 4;
        }
    }
}
