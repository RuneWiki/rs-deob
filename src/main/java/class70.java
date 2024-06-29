import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class70 extends class137 {

    @OriginalMember(owner = "client!tb", name = "y", descriptor = "I")
    private int field1116;

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "I")
    private int field1105;

    @OriginalMember(owner = "client!tb", name = "H", descriptor = "I")
    private int field1125;

    @OriginalMember(owner = "client!tb", name = "A", descriptor = "I")
    private int field1118;

    @OriginalMember(owner = "client!tb", name = "E", descriptor = "I")
    private int field1122;

    @OriginalMember(owner = "client!tb", name = "p", descriptor = "I")
    private int field1107;

    @OriginalMember(owner = "client!tb", name = "u", descriptor = "I")
    private int field1112;

    @OriginalMember(owner = "client!tb", name = "s", descriptor = "I")
    private int field1110;

    @OriginalMember(owner = "client!tb", name = "G", descriptor = "Ljava/lang/String;")
    public static String field1124 = "Loaded world list data";

    @OriginalMember(owner = "client!tb", name = "C", descriptor = "Lta;")
    public static class262 field1120 = new class262(200);

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "I")
    public static int field1106;

    @OriginalMember(owner = "client!tb", name = "q", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "client!tb", name = "r", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!tb", name = "t", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!tb", name = "v", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!tb", name = "w", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!tb", name = "x", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!tb", name = "z", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!tb", name = "B", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!tb", name = "D", descriptor = "I")
    public static int field1121;

    @OriginalMember(owner = "client!tb", name = "F", descriptor = "I")
    public static int field1123;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Luf;Luf;I)V")
    public static final void method541(class176 arg0, class176 arg1, int arg2) {
        class126.field1973 = arg0;
        ++field1115;
        class25.field388 = arg1;
        if (arg2 >= -21) {
            method545(-100);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZII)V")
    public final void method542(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            ++field1108;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIBII)V")
    public static final void method543(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        ++field1117;
        class127 var5 = (class127) class251.field3858.method1414(true, (long) arg1);
        if (var5 == null) {
            var5 = new class127();
            class251.field3858.method1409((long) arg1, 1, var5);
        }
        if (~var5.field1998.length >= ~arg4) {
            int[] var6 = new int[arg4 + 1];
            int[] var7 = new int[arg4 + 1];
            for (int var8 = 0; ~var5.field1998.length < ~var8; ++var8) {
                var6[var8] = var5.field1998[var8];
                var7[var8] = var5.field1989[var8];
            }
            for (int var9 = var5.field1998.length; var9 < arg4; ++var9) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field1989 = var7;
            var5.field1998 = var6;
        }
        var5.field1998[arg4] = arg3;
        int var10 = -71 / ((-10 - arg2) / 63);
        var5.field1989[arg4] = arg0;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZIBZLvl;IIIZ)Lqd;")
    public static final class3 method544(boolean arg0, int arg1, byte arg2, boolean arg3, class242 arg4, int arg5, int arg6, int arg7, boolean arg8) {
        ++field1114;
        class123 var9 = class32.method260(arg6, true);
        if (~arg5 < -2 && var9.field1918 != null) {
            int var10 = -1;
            for (int var11 = 0; ~var11 > -11; ++var11) {
                if (var9.field1931[var11] <= arg5 && var9.field1931[var11] != 0) {
                    var10 = var9.field1918[var11];
                }
            }
            if (var10 != -1) {
                var9 = class32.method260(var10, true);
            }
        }
        class281 var12 = var9.method878(arg4, 106);
        if (var12 == null) {
            return null;
        } else {
            class49 var13 = null;
            if (~var9.field1922 != 0) {
                var13 = (class49) method544(true, 0, (byte) 127, false, arg4, 10, var9.field1901, 1, true);
                if (var13 == null) {
                    return null;
                }
            } else if (~var9.field1887 != 0) {
                var13 = (class49) method544(false, arg1, (byte) 110, false, arg4, arg5, var9.field1935, arg7, true);
                if (var13 == null) {
                    return null;
                }
            }
            int var14 = class201.field3144;
            int[] var15 = class201.field3150;
            int var16 = class201.field3146;
            int[] var17 = new int[4];
            class201.method1341(var17);
            class49 var18 = new class49(36, 32);
            class201.method1353(var18.field795, 36, 32);
            class97.method765();
            class97.method758(16, 16);
            class97.field1548 = false;
            int var19 = var9.field1905;
            if (arg0) {
                var19 = (int) ((double) var19 * 1.5D);
            } else if (arg7 == 2) {
                var19 = (int) ((double) var19 * 1.04D);
            }
            int var20 = class97.field1557[var9.field1930] * var19 >> 16;
            int var21 = class97.field1556[var9.field1930] * var19 >> 16;
            var12.method1533(0, var9.field1888, var9.field1950, var9.field1930, var9.field1944, -(var12.method223() / 2) + var20 + var9.field1924, var9.field1924 + var21, -1L);
            if (~arg7 <= -2) {
                var18.method408(1);
                if (arg7 >= 2) {
                    var18.method408(16777215);
                }
                class201.method1353(var18.field795, 36, 32);
            }
            if (arg1 != 0) {
                var18.method411(arg1);
            }
            if (~var9.field1922 == 0) {
                if (var9.field1887 != -1) {
                    class201.method1353(var13.field795, 36, 32);
                    var18.method45(0, 0);
                    var18 = var13;
                }
            } else {
                var13.method45(0, 0);
            }
            if (arg3 && (~var9.field1906 == -2 || arg5 != 1) && ~arg5 != 0) {
                class28.field423.method13(method551(arg5, 0), 0, 9, 16776960, 1);
            }
            class201.method1353(var15, var16, var14);
            class201.method1349(var17);
            class97.method765();
            class97.field1548 = true;
            if (arg2 < 94) {
                method547((class243) null, -69, -89, 107, -9, -85, 68, 42, false);
            }
            return var18;
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)V")
    public static final void method545(int arg0) {
        class35.field552.field4232 = 0;
        class221.field3462 = true;
        client.field2407 = true;
        ++field1104;
        class260.field3998 = 0;
        class234.field3612 = 0;
        class55.field859 = 0;
        class9.field186 = 0;
        class9.field192 = 0;
        class256.field3922 = 0;
        class105.field1694 = 0;
        class79.field1324 = 0;
        class212.field3292 = 0;
        class210.field3262 = 0;
        class111.field1755 = 0;
        class8.field172 = 0;
        class44.field707 = 0;
        class42.field687 = 0;
        class112.field1763 = 0;
        class243.field3765 = 0;
        class220.field3446 = 0;
        class48.field789 = 0;
        class209.field3239 = 0;
        class37.field629 = 0;
        class237.field3667 = 0;
        class3.field44 = 0;
        class177.field2660 = 0;
        class260.field3999 = 0;
        class174.field2579 = 0;
        class47.field746 = 0;
        class44.field711 = 0;
        class214.field3299 = 0;
        class29.field464 = 0;
        class127.field1991 = 0;
        class188.field2998 = 0;
        class222.field3472 = 0;
        class196.field3081 = 0;
        class87.field1429 = 0;
        class268.field4267 = 0;
        class129.field2003 = 0;
        class262.field4092 = 0;
        class254.field3903 = 0;
        class79.field1328 = 0;
        class239.field3708 = 0;
        class263.field4107 = 0;
        class191.field3042 = 0;
        class112.field1757 = 0;
        class211.field3275 = 0;
        class35.field553 = 0;
        class37.field586 = 0;
        class254.field3900 = 0;
        class66.field1061 = 0;
        class197.field3100 = 0;
        class53.field824 = 0;
        class107.field1709 = 0;
        class29.field449 = 0;
        class191.field3033 = 0;
        class215.field3314 = 0;
        class277.field4359 = 0;
        class140.field2157 = 0;
        class296.field4658 = 0;
        class211.field3272 = 0;
        class261.field4017 = 0;
        class142.field2185 = 0;
        class48.field784 = 0;
        class35.field554 = 0;
        class9.field184 = 0;
        class135.field2113 = 0;
        class99.field1582 = 0;
        class94.field1529 = 0;
        class103.field1640 = 0;
        class109.field1743 = 0;
        class211.field3267 = 0;
        class212.field3288 = 0;
        class165.field2503 = 0;
        class87.field1425 = 0;
        class157.field2412 = 0;
        class159.field2437 = 0;
        class214.field3294 = 0;
        class30.field475 = 0;
        class90.field1456 = 0;
        class129.field2010 = 0;
        class122.field1873 = 0;
        class195.field3071 = 0;
        class21.field323 = 0;
        class211.field3280 = 0;
        class62.field1000 = 0;
        class176.field2647 = 0;
        class261.field4012 = 0;
        class103.field1645 = 0;
        class44.field713 = 0;
        class50.field796 = 0;
        class33.field530 = 0;
        class116.field1815 = 0;
        class21.field305 = 0;
        class176.field2616 = 0;
        class140.field2158 = 0;
        class123.field1896 = 0;
        class153.field2349 = 0;
        class121.field1871 = 0;
        class172.field2567 = 0;
        class123.field1912 = 0;
        class277.field4357 = 0;
        class287.field4513 = 0;
        class102.field1628 = 0;
        class50.field801 = 0;
        class23.field338 = 0;
        class25.field370 = 0;
        client.field2395 = 0;
        class287.field4507 = 0;
        class191.field3035 = 0;
        class169.field2537 = 0;
        class7.field125 = 0;
        class230.field3587 = 0;
        class165.field2500 = 0;
        class290.field4562 = 0;
        class77.field1288 = 0;
        class260.field3993 = 0;
        class217.field3363 = 0;
        class264.field4190 = 0;
        class58.field893 = 0;
        class177.field2652 = 0;
        class131.field2027 = 0;
        class123.field1891 = 0;
        class205.field3193 = 0;
        class291.field4589 = 0;
        class287.field4504 = 0;
        class71.field1129 = 0;
        class64.field1017 = 0;
        class276.field4350 = 0;
        class147.field2278 = 0;
        class112.field1760 = 0;
        class119.field1838 = 0;
        class5.field91 = 0;
        class47.field781 = 0;
        class65.field1040 = 0;
        class61.field971 = 0;
        class37.field593 = 0;
        class160.field2446 = 0;
        class261.field4021 = 0;
        class5.field69 = 0;
        class80.field1337 = 0;
        class261.field4030 = 0;
        class47.field764 = 0;
        class80.field1332 = 0;
        class175.field2601 = 0;
        class176.field2612 = 0;
        class263.field4118 = 0;
        class235.field3641 = 0;
        class32.field512 = 0;
        class103.field1638 = 0;
        class251.field3862 = 0;
        class208.field3226 = 0;
        class262.field4091 = 0;
        class184.field2784 = 0;
        class73.field1155 = 0;
        class165.field2502 = 0;
        class297.field4690 = 0;
        class31.field507 = 0;
        class256.field3926 = 0;
        class28.field437 = 0;
        class288.field4533 = 0;
        class34.field542 = 0;
        class65.field1033 = 0;
        class153.field2344 = 0;
        class268.field4266 = 0;
        class212.field3286 = 0;
        class25.field381 = 0;
        class75.field1267 = 0;
        class134.field2094 = 0;
        class62.field993 = 0;
        class261.field4029 = 0;
        class109.field1735 = 0;
        class275.field4326 = 0;
        class176.field2645 = 0;
        class261.field4056 = 0;
        class7.field117 = 0;
        class261.field4053 = 0;
        class261.field4039 = 0;
        class37.field582 = 0;
        class53.field823 = 0;
        class288.field4540 = 0;
        class26.field392 = 0;
        class155.field2367 = 0;
        class288.field4528 = 0;
        class214.field3303 = 0;
        class37.field585 = 0;
        class151.field2333 = 0;
        class135.field2112 = 0;
        class25.field383 = 0;
        class283.field4476 = 0;
        class61.field983 = 0;
        class7.field126 = 0;
        class139.field2135 = 0;
        class246.field3806 = 0;
        class144.field2229 = 0;
        class278.field4371 = 0;
        class208.field3224 = 0;
        class149.field2304 = 0;
        class69.field1091 = 0;
        class254.field3897 = 0;
        class7.field129 = 0;
        class223.field3499 = 0;
        class41.field676 = 0;
        class184.field2767 = 0;
        class71.field1131 = 0;
        class32.field523 = 0;
        class57.field884 = 0;
        field1113 = 0;
        class77.field1293 = 0;
        class219.field3434 = 0;
        class297.field4694 = 0;
        class285.field4489 = 0;
        class166.field2509 = 0;
        class188.field2863 = 0;
        class209.field3247 = 0;
        class92.field1489 = 0;
        class26.field401 = 0;
        class223.field3494 = 0;
        class34.field541 = 0;
        class62.field996 = 0;
        class63.field1007 = 0;
        class134.field2083 = 0;
        class37.field608 = 0;
        class43.field695 = 0;
        class13.field224 = 0;
        class174.field2580 = 0;
        class295.field4637 = 0;
        class88.field1438 = 0;
        class167.field2521 = 0;
        class30.field476 = 0;
        class288.field4537 = 0;
        class45.field720 = 0;
        class295.field4638 = 0;
        class239.field3697 = 0;
        class297.field4679 = 0;
        class115.field1792 = 0;
        class29.field458 = 0;
        class217.field3375 = 0;
        class85.field1396 = 0;
        class261.field4071 = 0;
        class115.field1793 = 0;
        class84.field1388 = 0;
        class228.field3573 = 0;
        class219.field3421 = 0;
        class214.field3302 = 0;
        class1.field4 = 0;
        class7.field130 = 0;
        class37.field643 = 0;
        class186.field2811 = 0;
        class127.field1988 = 0;
        class204.field3178 = 0;
        class249.field3840 = 0;
        class283.field4471 = 0;
        class31.field491 = 0;
        class239.field3717 = 0;
        class271.field4285 = 0;
        class28.field427 = 0;
        class261.field4018 = 0;
        class73.field1222 = 0;
        class228.field3569 = 0;
        class187.field2821 = 0;
        class198.field3112 = 0;
        class123.field1902 = 0;
        class259.field3980 = 0;
        class221.field3460 = 0;
        class164.field2495 = 0;
        class77.field1302 = 0;
        class71.field1128 = 0;
        class208.field3237 = 0;
        class28.field434 = 0;
        class98.field1564 = 0;
        class286.field4497 = 0;
        class237.field3669 = 0;
        class261.field4035 = 0;
        class8.field156 = 0;
        class211.field3277 = 0;
        class255.field3915 = 0;
        class286.field4494 = 0;
        class143.field2200 = 0;
        class223.field3516 = 0;
        class238.field3688 = 0;
        class57.field881 = 0;
        class296.field4667 = 0;
        class28.field410 = 0;
        class209.field3250 = 0;
        class190.field3022 = 0;
        class260.field3991 = 0;
        class77.field1306 = 0;
        class5.field61 = 0;
        class256.field3927 = 0;
        class266.field4244 = 0;
        class222.field3473 = 0;
        class16.field255 = 0;
        class32.field521 = 0;
        class261.field4023 = 0;
        class216.field3327 = 0;
        class177.field2654 = 0;
        class99.field1575 = 0;
        class176.field2615 = 0;
        class155.field2359 = 0;
        class188.field2918 = 0;
        class123.field1923 = 0;
        class10.field207 = 0;
        class8.field163 = 0;
        class259.field3966 = 0;
        class277.field4370 = 0;
        class234.field3628 = 0;
        class73.field1205 = 0;
        class55.field858 = 0;
        class19.field298 = 0;
        class231.field3607 = 0;
        class69.field1094 = 0;
        class176.field2649 = 0;
        class143.field2196 = 0;
        class202.field3158 = 0;
        class31.field501 = 0;
        class105.field1693 = 0;
        class271.field4282 = 0;
        class37.field635 = 0;
        class151.field2338 = 0;
        class47.field748 = 0;
        class176.field2625 = 0;
        class134.field2074 = 0;
        class126.field1967 = 0;
        class155.field2368 = 0;
        class176.field2626 = 0;
        class219.field3427 = 0;
        class76.field1282 = 0;
        class111.field1750 = 0;
        class242.field3749 = 0;
        class188.field2925 = 0;
        class123.field1936 = 0;
        class166.field2507 = 0;
        class37.field620 = 0;
        class115.field1787 = 0;
        class208.field3236 = 0;
        class81.field1352 = 0;
        class190.field3026 = 0;
        class17.field277 = 0;
        class260.field3992 = 0;
        class37.field637 = 0;
        class81.field1350 = 0;
        class198.field3111 = 0;
        class37.field625 = 0;
        class293.field4611 = 0;
        class154.field2351 = 0;
        class107.field1708 = 0;
        class271.field4284 = 0;
        class268.field4268 = 0;
        class203.field3166 = 0;
        class68.field1075 = 0;
        class112.field1772 = 0;
        class144.field2234 = 0;
        class46.field724 = 0;
        class174.field2578 = 0;
        class47.field761 = 0;
        class93.field1510 = 0;
        client.field2393 = 0;
        class223.field3512 = 0;
        class123.field1884 = 0;
        class31.field502 = 0;
        class276.field4348 = 0;
        class223.field3490 = 0;
        class234.field3619 = 0;
        class264.field4220 = 0;
        class156.field2390 = 0;
        class234.field3624 = 0;
        class61.field975 = 0;
        class64.field1021 = 0;
        class90.field1455 = 0;
        class163.field2480 = 0;
        class270.field4278 = 0;
        class217.field3389 = 0;
        class273.field4309 = 0;
        class69.field1093 = 0;
        class117.field1820 = 0;
        class252.field3876 = 0;
        client.field2396 = 0;
        class271.field4286 = 0;
        class167.field2522 = 0;
        class266.field4247 = 0;
        class132.field2034 = 0;
        class15.field250 = 0;
        class47.field759 = 0;
        class250.field3849 = 0;
        class45.field715 = 0;
        class74.field1233 = 0;
        class184.field2771 = 0;
        class88.field1442 = 0;
        class287.field4520 = 0;
        class107.field1707 = 0;
        class176.field2617 = 0;
        class58.field917 = 0;
        class58.field904 = 0;
        class262.field4086 = 0;
        class195.field3068 = 0;
        class234.field3620 = 0;
        class6.field105 = 0;
        class176.field2619 = 0;
        class294.field4620 = 0;
        class234.field3629 = 0;
        class263.field4119 = 0;
        class167.field2520 = 0;
        class81.field1348 = 0;
        class7.field118 = 0;
        class188.field2927 = 0;
        class37.field604 = 0;
        client.field2397 = 0;
        class109.field1734 = 0;
        class156.field2382 = 0;
        class129.field2011 = 0;
        class295.field4639 = 0;
        class237.field3653 = 0;
        class145.field2253 = 0;
        class88.field1434 = 0;
        class77.field1284 = 0;
        class134.field2078 = 0;
        class57.field890 = 0;
        class263.field4108 = 0;
        class239.field3693 = 0;
        class275.field4328 = 0;
        class238.field3679 = 0;
        class242.field3736 = 0;
        class37.field617 = 0;
        class35.field567 = 0;
        class237.field3658 = 0;
        class224.field3520 = 0;
        class45.field717 = 0;
        class244.field3780 = 0;
        class73.field1181 = 0;
        class227.field3552 = 0;
        class134.field2068 = 0;
        class184.field2774 = 0;
        class179.field2684 = 0;
        class92.field1490 = 0;
        class264.field4169 = 0;
        class198.field3108 = 0;
        class84.field1381 = 0;
        class123.field1933 = 0;
        class77.field1287 = 0;
        class186.field2793 = 0;
        class68.field1089 = 0;
        class45.field719 = 0;
        class151.field2339 = 0;
        class156.field2388 = 0;
        class31.field497 = 0;
        class1.field8 = 0;
        client.field2392 = 0;
        class21.field307 = 0;
        class209.field3243 = 0;
        class204.field3180 = 0;
        field1109 = 0;
        class135.field2107 = 0;
        class263.field4116 = 0;
        class37.field597 = 0;
        class68.field1073 = 0;
        class198.field3117 = 0;
        class161.field2472 = 0;
        class41.field677 = 0;
        class157.field2423 = 0;
        class151.field2335 = 0;
        class268.field4269 = 0;
        class158.field2435 = 0;
        class195.field3077 = 0;
        class48.field791 = 0;
        class186.field2803 = 0;
        class256.field3923 = 0;
        class207.field3220 = 0;
        class10.field201 = 0;
        class107.field1714 = 0;
        class129.field2007 = 0;
        class246.field3808 = 0;
        class9.field193 = 0;
        class210.field3263 = 0;
        class264.field4130 = 0;
        class262.field4094 = 0;
        class253.field3890 = 0;
        class42.field682 = 0;
        class209.field3242 = 0;
        class242.field3734 = 0;
        class109.field1726 = 0;
        class291.field4591 = 0;
        class158.field2432 = 0;
        class126.field1970 = 0;
        class61.field969 = 0;
        class65.field1029 = 0;
        class74.field1251 = 0;
        class184.field2761 = 0;
        class90.field1452 = 0;
        class220.field3444 = 0;
        class74.field1246 = 0;
        class220.field3448 = 0;
        class61.field973 = 0;
        class68.field1072 = 0;
        class58.field901 = 0;
        class73.field1224 = 0;
        class188.field3011 = 0;
        class139.field2134 = 0;
        class87.field1420 = 0;
        class139.field2138 = 0;
        class28.field430 = 0;
        class287.field4522 = 0;
        class6.field103 = 0;
        class29.field451 = 0;
        class103.field1641 = 0;
        class113.field1775 = 0;
        class235.field3642 = 0;
        class80.field1339 = 0;
        class215.field3322 = 0;
        client.field2398 = 0;
        class188.field3000 = 0;
        class126.field1978 = 0;
        class117.field1819 = 0;
        class8.field134 = 0;
        class255.field3908 = 0;
        class297.field4695 = 0;
        class202.field3156 = 0;
        field1115 = 0;
        class175.field2597 = 0;
        class136.field2116 = 0;
        class132.field2036 = 0;
        class134.field2100 = 0;
        class184.field2788 = 0;
        class222.field3466 = 0;
        class88.field1432 = 0;
        class123.field1898 = 0;
        class109.field1742 = 0;
        class292.field4604 = 0;
        class94.field1520 = 0;
        class68.field1082 = 0;
        class272.field4292 = 0;
        class4.field56 = 0;
        class291.field4586 = 0;
        class115.field1789 = 0;
        class186.field2810 = 0;
        class79.field1326 = 0;
        class219.field3432 = 0;
        class217.field3376 = 0;
        class176.field2640 = 0;
        class217.field3390 = 0;
        class5.field71 = 0;
        class249.field3838 = 0;
        class261.field4026 = 0;
        class29.field456 = 0;
        class13.field220 = 0;
        class68.field1078 = 0;
        class260.field4002 = 0;
        class42.field681 = 0;
        client.field2402 = 0;
        class5.field59 = 0;
        class220.field3442 = 0;
        class244.field3784 = 0;
        class85.field1397 = 0;
        class177.field2650 = 0;
        class239.field3709 = 0;
        class51.field809 = 0;
        class105.field1690 = 0;
        class239.field3700 = 0;
        class131.field2026 = 0;
        class263.field4114 = 0;
        class31.field494 = 0;
        class188.field2958 = 0;
        class62.field991 = 0;
        class77.field1301 = 0;
        class77.field1290 = 0;
        class217.field3402 = 0;
        class16.field262 = 0;
        class65.field1030 = 0;
        class140.field2159 = 0;
        class37.field621 = 0;
        class262.field4085 = 0;
        class261.field4007 = 0;
        class196.field3091 = 0;
        class37.field618 = 0;
        class94.field1511 = 0;
        class50.field797 = 0;
        class291.field4587 = 0;
        class224.field3519 = 0;
        class134.field2081 = 0;
        class118.field1824 = 0;
        class39.field650 = 0;
        class234.field3617 = 0;
        class112.field1758 = 0;
        class287.field4510 = 0;
        class169.field2536 = 0;
        class167.field2527 = 0;
        class37.field592 = 0;
        class208.field3227 = 0;
        class28.field409 = 0;
        class79.field1327 = 0;
        class238.field3684 = 0;
        class77.field1300 = 0;
        class260.field4001 = 0;
        class261.field4008 = 0;
        class222.field3475 = 0;
        class123.field1945 = 0;
        class197.field3098 = 0;
        class28.field447 = 0;
        class37.field627 = 0;
        class134.field2069 = 0;
        class197.field3103 = 0;
        class251.field3859 = 0;
        class276.field4337 = 0;
        class147.field2277 = 0;
        class57.field880 = 0;
        class37.field599 = 0;
        class211.field3273 = 0;
        class224.field3524 = 0;
        class37.field611 = 0;
        class99.field1574 = 0;
        class77.field1295 = 0;
        class219.field3437 = 0;
        class285.field4490 = 0;
        class265.field4223 = 0;
        class88.field1436 = 0;
        class21.field316 = 0;
        class32.field508 = 0;
        class116.field1811 = 0;
        class259.field3982 = 0;
        class252.field3875 = 0;
        class69.field1096 = 0;
        class288.field4534 = 0;
        class44.field705 = 0;
        class296.field4649 = 0;
        class68.field1067 = 0;
        class288.field4536 = 0;
        class62.field1001 = 0;
        class85.field1394 = 0;
        class235.field3646 = 0;
        class173.field2572 = 0;
        class42.field684 = 0;
        class169.field2534 = 0;
        class289.field4551 = 0;
        class268.field4265 = 0;
        class6.field100 = 0;
        class237.field3660 = 0;
        class78.field1311 = 0;
        class209.field3252 = 0;
        class143.field2198 = 0;
        class258.field3948 = 0;
        class165.field2506 = 0;
        class111.field1752 = 0;
        class266.field4249 = 0;
        class287.field4516 = 0;
        class188.field2989 = 0;
        class98.field1565 = 0;
        class115.field1790 = 0;
        class242.field3743 = 0;
        class37.field580 = 0;
        class243.field3768 = 0;
        class94.field1522 = 0;
        class189.field3015 = 0;
        class176.field2635 = 0;
        class296.field4661 = 0;
        class32.field525 = 0;
        class158.field2430 = 0;
        class88.field1430 = 0;
        class26.field393 = 0;
        class37.field595 = 0;
        class78.field1319 = 0;
        class42.field679 = 0;
        class296.field4644 = 0;
        class184.field2786 = 0;
        class297.field4676 = 0;
        class84.field1382 = 0;
        class230.field3594 = 0;
        class127.field1990 = 0;
        class219.field3436 = 0;
        class154.field2350 = 0;
        class53.field829 = 0;
        class129.field2002 = 0;
        class203.field3173 = 0;
        class37.field594 = arg0;
        class155.field2364 = 0;
        class186.field2808 = 0;
        class261.field4051 = 0;
        class7.field116 = 0;
        class126.field1972 = 0;
        class50.field798 = 0;
        class66.field1050 = 0;
        class151.field2332 = 0;
        class134.field2095 = 0;
        class74.field1234 = 0;
        class196.field3088 = 0;
        class74.field1250 = 0;
        class197.field3102 = 0;
        class264.field4168 = 0;
        class66.field1046 = 0;
        class231.field3600 = 0;
        class293.field4619 = 0;
        class73.field1163 = 0;
        class203.field3174 = 0;
        field1121 = 0;
        class244.field3779 = 0;
        class272.field4295 = 0;
        class37.field624 = 0;
        class126.field1966 = 0;
        class142.field2183 = 0;
        class214.field3295 = 0;
        class293.field4609 = 0;
        class143.field2211 = 0;
        class71.field1132 = 0;
        class146.field2260 = 0;
        class266.field4238 = 0;
        class133.field2058 = 0;
        class32.field515 = 0;
        field1117 = 0;
        class23.field337 = 0;
        class69.field1090 = 0;
        class84.field1378 = 0;
        class258.field3950 = 0;
        class3.field45 = 0;
        class156.field2380 = 0;
        class74.field1236 = 0;
        class211.field3274 = 0;
        class134.field2077 = 0;
        class158.field2428 = 0;
        class196.field3086 = 0;
        class41.field668 = 0;
        class261.field4066 = 0;
        class260.field3997 = 0;
        class261.field4049 = 0;
        class37.field630 = 0;
        class103.field1647 = 0;
        class6.field107 = 0;
        class263.field4112 = 0;
        class176.field2638 = 0;
        class37.field614 = 0;
        class207.field3217 = 0;
        class176.field2639 = 0;
        class32.field509 = 0;
        class196.field3087 = 0;
        class32.field510 = 0;
        class66.field1053 = 0;
        class296.field4647 = 0;
        class186.field2794 = 0;
        class252.field3871 = 0;
        class39.field644 = 0;
        class140.field2163 = 0;
        class261.field4038 = 0;
        class75.field1260 = 0;
        class244.field3781 = 0;
        class176.field2632 = 0;
        class15.field252 = 0;
        class28.field419 = 0;
        class295.field4635 = 0;
        class254.field3898 = 0;
        class256.field3931 = 0;
        class66.field1066 = 0;
        class253.field3894 = 0;
        class176.field2613 = 0;
        class64.field1020 = 0;
        class176.field2630 = 0;
        class262.field4103 = 0;
        class293.field4610 = 0;
        class47.field747 = 0;
        class94.field1524 = 0;
        class203.field3162 = 0;
        class153.field2346 = 0;
        class37.field628 = 0;
        class112.field1766 = 0;
        class42.field680 = 0;
        class297.field4681 = 0;
        class203.field3167 = 0;
        field1108 = 0;
        class50.field800 = 0;
        class186.field2802 = 0;
        class289.field4546 = 0;
        class131.field2031 = 0;
        class202.field3157 = 0;
        class223.field3483 = 0;
        class293.field4617 = 0;
        class211.field3270 = 0;
        class270.field4276 = 0;
        class210.field3260 = 0;
        class220.field3439 = 0;
        class160.field2449 = 0;
        class93.field1507 = 0;
        class140.field2152 = 0;
        class191.field3036 = 0;
        class250.field3845 = 0;
        class34.field539 = 0;
        class238.field3690 = 0;
        class261.field4055 = 0;
        class87.field1424 = 0;
        class169.field2538 = 0;
        class266.field4252 = 0;
        class176.field2643 = 0;
        class288.field4529 = 0;
        class216.field3341 = 0;
        class176.field2610 = 0;
        class261.field4022 = 0;
        class242.field3757 = 0;
        class277.field4360 = 0;
        class156.field2389 = 0;
        class15.field253 = 0;
        class224.field3525 = 0;
        class161.field2463 = 0;
        class241.field3724 = 0;
        class220.field3445 = 0;
        class241.field3732 = 0;
        class296.field4673 = 0;
        class5.field65 = 0;
        class246.field3804 = 0;
        class260.field3989 = 0;
        class188.field2847 = 0;
        class177.field2655 = 0;
        class153.field2343 = 0;
        class206.field3206 = 0;
        class205.field3195 = 0;
        class47.field763 = 0;
        class172.field2571 = 0;
        class5.field70 = 0;
        class235.field3643 = 0;
        class242.field3759 = 0;
        class191.field3040 = 0;
        class176.field2621 = 0;
        class131.field2029 = 0;
        class239.field3702 = 0;
        class264.field4145 = 0;
        class251.field3861 = 0;
        class287.field4515 = 0;
        class18.field283 = 0;
        class75.field1262 = 0;
        class172.field2564 = 0;
        class211.field3266 = 0;
        class208.field3234 = 0;
        class256.field3929 = 0;
        class126.field1979 = 0;
        class261.field4020 = 0;
        class71.field1127 = 0;
        class69.field1101 = 0;
        class253.field3886 = 0;
        class7.field127 = 0;
        class32.field511 = 0;
        class122.field1877 = 0;
        class29.field469 = 0;
        class205.field3184 = 0;
        class29.field468 = 0;
        class134.field2086 = 0;
        class164.field2498 = 0;
        class252.field3874 = 0;
        class55.field845 = 0;
        class103.field1634 = 0;
        class230.field3596 = 0;
        class29.field453 = 0;
        class37.field601 = 0;
        class132.field2033 = 0;
        class30.field487 = 0;
        class160.field2448 = 0;
        class262.field4089 = 0;
        class277.field4361 = 0;
        class30.field470 = 0;
        class234.field3623 = 0;
        class119.field1836 = 0;
        class146.field2272 = 0;
        class143.field2191 = 0;
        class155.field2363 = 0;
        class241.field3727 = 0;
        class37.field602 = 0;
        class136.field2115 = 0;
        class132.field2039 = 0;
        class171.field2548 = 0;
        class235.field3647 = 0;
        class61.field984 = 0;
        class271.field4288 = 0;
        class148.field2285 = 0;
        class32.field513 = 0;
        class143.field2195 = 0;
        class239.field3694 = 0;
        class37.field638 = 0;
        class294.field4622 = 0;
        class21.field326 = 0;
        class56.field861 = 0;
        class55.field853 = 0;
        class285.field4491 = 0;
        class224.field3518 = 0;
        class263.field4109 = 0;
        class77.field1294 = 0;
        class188.field2867 = 0;
        class176.field2624 = 0;
        class143.field2205 = 0;
        class119.field1845 = 0;
        class32.field514 = 0;
        class206.field3201 = 0;
        class23.field332 = 0;
        class17.field280 = 0;
        class220.field3443 = 0;
        class287.field4514 = 0;
        client.field2401 = 0;
        class235.field3645 = 0;
        class146.field2258 = 0;
        class77.field1283 = 0;
        class291.field4582 = 0;
        class133.field2046 = 0;
        class149.field2301 = 0;
        class122.field1872 = 0;
        class207.field3216 = 0;
        class126.field1969 = 0;
        class206.field3200 = 0;
        class272.field4301 = 0;
        class184.field2783 = 0;
        class74.field1247 = 0;
        class5.field72 = 0;
        class28.field443 = 0;
        client.field2400 = 0;
        class206.field3202 = 0;
        class186.field2801 = 0;
        class34.field551 = 0;
        class241.field3725 = 0;
        class5.field73 = 0;
        class261.field4068 = 0;
        class287.field4503 = 0;
        class31.field499 = 0;
        class188.field2854 = 0;
        class189.field3019 = 0;
        class217.field3345 = 0;
        class234.field3618 = 0;
        class134.field2072 = 0;
        class256.field3917 = 0;
        class72.field1145 = 0;
        class261.field4044 = 0;
        class41.field672 = 0;
        class107.field1704 = 0;
        class231.field3605 = 0;
        class37.field587 = 0;
        class238.field3687 = 0;
        class209.field3254 = 0;
        class167.field2525 = 0;
        class130.field2015 = 0;
        class79.field1323 = 0;
        class215.field3326 = 0;
        class234.field3625 = 0;
        class156.field2387 = 0;
        class220.field3447 = 0;
        class132.field2040 = 0;
        class5.field77 = 0;
        class266.field4243 = 0;
        class197.field3097 = 0;
        class172.field2562 = 0;
        class246.field3807 = 0;
        class73.field1172 = 0;
        class19.field295 = 0;
        class245.field3794 = 0;
        class167.field2519 = 0;
        class127.field1999 = 0;
        class261.field4073 = 0;
        class7.field131 = 0;
        class134.field2099 = 0;
        class130.field2017 = 0;
        class229.field3579 = 0;
        class283.field4472 = 0;
        field1111 = 0;
        class37.field598 = 0;
        class259.field3957 = 0;
        class296.field4657 = 0;
        class289.field4550 = 0;
        class176.field2628 = 0;
        class154.field2355 = 0;
        class191.field3039 = 0;
        class242.field3746 = 0;
        client.field2404 = 0;
        class159.field2443 = 0;
        class129.field2004 = 0;
        class290.field4577 = 0;
        class130.field2016 = 0;
        class149.field2295 = 0;
        class253.field3884 = 0;
        class72.field1151 = 0;
        class85.field1393 = 0;
        class293.field4616 = 0;
        class222.field3468 = 0;
        class132.field2035 = 0;
        class205.field3189 = 0;
        class253.field3889 = 0;
        class43.field689 = 0;
        class253.field3895 = 0;
        class55.field850 = 0;
        class261.field4042 = 0;
        class252.field3881 = 0;
        class176.field2644 = 0;
        class253.field3885 = 0;
        class21.field317 = 0;
        class256.field3930 = 0;
        class262.field4087 = 0;
        class275.field4327 = 0;
        class57.field886 = 0;
        class239.field3701 = 0;
        class178.field2664 = 0;
        class108.field1724 = 0;
        class273.field4312 = 0;
        class276.field4335 = 0;
        class256.field3925 = 0;
        class23.field334 = 0;
        class10.field195 = 0;
        class94.field1523 = 0;
        class134.field2076 = 0;
        class134.field2096 = 0;
        class79.field1325 = 0;
        class223.field3507 = 0;
        class37.field607 = 0;
        class261.field4050 = 0;
        class34.field535 = 0;
        class205.field3191 = 0;
        class80.field1334 = 0;
        class155.field2361 = 0;
        class121.field1864 = 0;
        class36.field577 = 0;
        class37.field615 = 0;
        class123.field1942 = 0;
        class206.field3207 = 0;
        class292.field4601 = 0;
        class176.field2611 = 0;
        class77.field1297 = 0;
        class207.field3218 = 0;
        class242.field3742 = 0;
        class205.field3190 = 0;
        class167.field2518 = 0;
        class86.field1406 = 0;
        class290.field4563 = 0;
        class17.field279 = 0;
        class149.field2296 = 0;
        class108.field1722 = 0;
        class21.field313 = 0;
        client.field2403 = 0;
        class196.field3084 = 0;
        class148.field2284 = 0;
        class37.field641 = 0;
        class144.field2236 = 0;
        class11.field211 = 0;
        class217.field3358 = 0;
        class266.field4236 = 0;
        class220.field3441 = 0;
        class274.field4316 = 0;
        class134.field2067 = 0;
        class99.field1579 = 0;
        class25.field372 = 0;
        class76.field1277 = 0;
        class100.field1610 = 0;
        class197.field3092 = 0;
        class143.field2190 = 0;
        class207.field3210 = 0;
        class73.field1188 = 0;
        class275.field4321 = 0;
        class217.field3400 = 0;
        class219.field3422 = 0;
        class56.field875 = 0;
        class37.field623 = 0;
        class216.field3330 = 0;
        class219.field3426 = 0;
        class190.field3025 = 0;
        class155.field2372 = 0;
        class143.field2209 = 0;
        class50.field804 = 0;
        class149.field2300 = 0;
        class74.field1235 = 0;
        class296.field4655 = 0;
        class107.field1705 = 0;
        class166.field2508 = 0;
        class29.field462 = 0;
        class45.field716 = 0;
        class134.field2089 = 0;
        class261.field4074 = 0;
        field1103 = 0;
        class116.field1805 = 0;
        class191.field3034 = 0;
        class129.field2006 = 0;
        class186.field2798 = 0;
        class1.field3 = 0;
        class29.field452 = 0;
        class149.field2305 = 0;
        class176.field2637 = 0;
        class259.field3976 = 0;
        class37.field590 = 0;
        class21.field306 = 0;
        class130.field2014 = 0;
        class276.field4332 = 0;
        class123.field1892 = 0;
        class132.field2032 = 0;
        class228.field3577 = 0;
        class8.field178 = 0;
        class99.field1583 = 0;
        class264.field4153 = 0;
        class56.field874 = 0;
        class243.field3770 = 0;
        class237.field3659 = 0;
        class37.field616 = 0;
        class244.field3773 = 0;
        class124.field1962 = 0;
        class176.field2634 = 0;
        class251.field3857 = 0;
        class188.field2826 = 0;
        class188.field2939 = 0;
        class259.field3962 = 0;
        class10.field198 = 0;
        class74.field1242 = 0;
        class109.field1737 = 0;
        class235.field3649 = 0;
        class61.field980 = 0;
        class234.field3615 = 0;
        class292.field4600 = 0;
        class261.field4019 = 0;
        class143.field2204 = 0;
        class264.field4180 = 0;
        class126.field1977 = 0;
        class44.field703 = 0;
        class184.field2765 = 0;
        class17.field272 = 0;
        class73.field1195 = 0;
        class99.field1576 = 0;
        class134.field2084 = 0;
        class5.field63 = 0;
        class84.field1384 = 0;
        class134.field2102 = 0;
        class87.field1423 = 0;
        class216.field3328 = 0;
        class171.field2544 = 0;
        class286.field4500 = 0;
        class234.field3613 = 0;
        class252.field3880 = 0;
        class210.field3257 = 0;
        class260.field3994 = 0;
        class151.field2331 = 0;
        class197.field3096 = 0;
        class204.field3179 = 0;
        class265.field4225 = 0;
        class73.field1201 = 0;
        class261.field4054 = 0;
        class119.field1842 = 0;
        class293.field4618 = 0;
        class19.field292 = 0;
        class88.field1444 = 0;
        class234.field3614 = 0;
        class207.field3223 = 0;
        class139.field2141 = 0;
        class112.field1767 = 0;
        class166.field2512 = 0;
        class123.field1939 = 0;
        class21.field308 = 0;
        class278.field4372 = 0;
        class206.field3198 = 0;
        class31.field492 = 0;
        class217.field3383 = 0;
        class176.field2631 = 0;
        class196.field3080 = 0;
        class61.field977 = 0;
        class47.field776 = 0;
        class73.field1160 = 0;
        class11.field209 = 0;
        class155.field2374 = 0;
        class255.field3905 = 0;
        class134.field2070 = 0;
        class261.field4072 = 0;
        class204.field3175 = 0;
        class90.field1457 = 0;
        class109.field1730 = 0;
        class133.field2044 = 0;
        class72.field1148 = 0;
        class261.field4060 = 0;
        class189.field3016 = 0;
        class261.field4010 = 0;
        class149.field2303 = 0;
        class266.field4237 = 0;
        class239.field3711 = 0;
        class66.field1060 = 0;
        class109.field1732 = 0;
        class37.field626 = 0;
        class272.field4300 = 0;
        class177.field2661 = 0;
        class1.field6 = 0;
        class50.field805 = 0;
        class169.field2532 = 0;
        class62.field1002 = 0;
        class136.field2120 = 0;
        class157.field2414 = 0;
        class158.field2429 = 0;
        class176.field2620 = 0;
        class64.field1018 = 0;
        class1.field9 = 0;
        class230.field3590 = 0;
        field1119 = 0;
        class287.field4502 = 0;
        class9.field188 = 0;
        class188.field2976 = 0;
        class221.field3463 = 0;
        class37.field581 = 0;
        class184.field2779 = 0;
        class226.field3545 = 0;
        class132.field2038 = 0;
        class223.field3500 = 0;
        class73.field1171 = 0;
        class219.field3431 = 0;
        class295.field4640 = 0;
        class280.field4382 = 0;
        class21.field324 = 0;
        class155.field2378 = 0;
        class172.field2554 = 0;
        class87.field1426 = 0;
        class123.field1910 = 0;
        class291.field4593 = 0;
        class167.field2517 = 0;
        class47.field765 = 0;
        class177.field2657 = 0;
        class34.field543 = 0;
        class179.field2672 = 0;
        class134.field2080 = 0;
        class149.field2306 = 0;
        class265.field4228 = 0;
        class134.field2093 = 0;
        class133.field2062 = 0;
        field1123 = 0;
        class88.field1447 = 0;
        class26.field397 = 0;
        class112.field1759 = 0;
        class31.field500 = 0;
        class141.field2179 = 0;
        class56.field877 = 0;
        class217.field3362 = 0;
        class287.field4509 = 0;
        class161.field2468 = 0;
        class140.field2147 = 0;
        class244.field3786 = 0;
        class263.field4117 = 0;
        class278.field4373 = 0;
        class7.field122 = 0;
        class149.field2297 = 0;
        class80.field1331 = 0;
        class249.field3837 = 0;
        class3.field41 = 0;
        class289.field4547 = 0;
        class184.field2770 = 0;
        class107.field1703 = 0;
        class61.field974 = 0;
        class176.field2623 = 0;
        class261.field4003 = 0;
        class57.field885 = 0;
        class37.field584 = 0;
        class270.field4277 = 0;
        class37.field631 = 0;
        class261.field4031 = 0;
        class127.field1995 = 0;
        class205.field3188 = 0;
        class135.field2108 = 0;
        class191.field3030 = 0;
        class297.field4682 = 0;
        class79.field1321 = 0;
        class188.field2889 = 0;
        class287.field4512 = 0;
        class238.field3685 = 0;
        class78.field1314 = 0;
        class130.field2022 = 0;
        class44.field712 = 0;
        class120.field1851 = 0;
        client.field2391 = 0;
        class262.field4102 = 0;
        class29.field461 = 0;
        class186.field2805 = 0;
        class266.field4242 = 0;
        class189.field3017 = 0;
        class25.field380 = 0;
        class64.field1022 = 0;
        class214.field3306 = 0;
        class273.field4314 = 0;
        class15.field248 = 0;
        class190.field3027 = 0;
        class217.field3368 = 0;
        class137.field2129 = 0;
        class68.field1069 = 0;
        class47.field783 = 0;
        class238.field3681 = 0;
        class286.field4496 = 0;
        client.field2406 = 0;
        class207.field3214 = 0;
        class259.field3972 = 0;
        class277.field4364 = 0;
        class47.field771 = 0;
        class73.field1213 = 0;
        class64.field1014 = 0;
        class26.field396 = 0;
        class134.field2088 = 0;
        class134.field2079 = 0;
        class188.field2864 = 0;
        class100.field1611 = 0;
        class134.field2091 = 0;
        class88.field1441 = 0;
        class176.field2646 = 0;
        class11.field208 = 0;
        class115.field1788 = 0;
        class72.field1147 = 0;
        class103.field1643 = 0;
        class31.field498 = 0;
        client.field2394 = 0;
        class184.field2782 = 0;
        class28.field414 = 0;
        class143.field2187 = 0;
        class66.field1059 = 0;
        class119.field1846 = 0;
        class275.field4330 = 0;
        class186.field2807 = 0;
        class37.field591 = 0;
        class16.field261 = 0;
        class61.field982 = 0;
        class155.field2370 = 0;
        class234.field3610 = 0;
        class261.field4062 = 0;
        class247.field3818 = 0;
        class231.field3606 = 0;
        class276.field4339 = 0;
        class124.field1963 = 0;
        class157.field2410 = 0;
        class53.field826 = 0;
        class105.field1696 = 0;
        class261.field4034 = 0;
        class272.field4294 = 0;
        class5.field68 = 0;
        class37.field600 = 0;
        class187.field2814 = 0;
        class16.field260 = 0;
        class203.field3172 = 0;
        class141.field2176 = 0;
        class25.field369 = 0;
        class37.field619 = 0;
        class179.field2681 = 0;
        class26.field394 = 0;
        class265.field4233 = 0;
        class153.field2342 = 0;
        class116.field1796 = 0;
        class3.field47 = 0;
        class78.field1315 = 0;
        class88.field1431 = 0;
        class21.field321 = 0;
        class58.field920 = 0;
        class290.field4567 = 0;
        class1.field12 = 0;
        class29.field460 = 0;
        class289.field4552 = 0;
        class239.field3705 = 0;
        class266.field4239 = 0;
        class241.field3726 = 0;
        class297.field4697 = 0;
        class17.field274 = 0;
        class29.field466 = 0;
        class161.field2454 = 0;
        class219.field3424 = 0;
        class261.field4016 = 0;
        class37.field633 = 0;
        class73.field1212 = 0;
        class109.field1729 = 0;
        class127.field1994 = 0;
        class273.field4307 = 0;
        class68.field1080 = 0;
        class242.field3737 = 0;
        class74.field1252 = 0;
        class64.field1016 = 0;
        class13.field219 = 0;
        class35.field569 = 0;
        class223.field3504 = 0;
        class94.field1515 = 0;
        class37.field596 = 0;
        class216.field3337 = 0;
        class7.field132 = 0;
        class88.field1445 = 0;
        class134.field2071 = 0;
        class129.field2005 = 0;
        class35.field574 = 0;
        class6.field101 = 0;
        class251.field3863 = 0;
        class37.field636 = 0;
        class5.field58 = 0;
        class121.field1861 = 0;
        class290.field4576 = 0;
        class92.field1497 = 0;
        class231.field3598 = 0;
        class188.field2963 = 0;
        class73.field1154 = 0;
        class166.field2515 = 0;
        class228.field3567 = 0;
        class123.field1915 = 0;
        class184.field2772 = 0;
        class88.field1440 = 0;
        class262.field4105 = 0;
        class288.field4544 = 0;
        class3.field51 = 0;
        class133.field2053 = 0;
        class8.field143 = 0;
        class161.field2464 = 0;
        class261.field4052 = 0;
        class184.field2768 = 0;
        class166.field2514 = 0;
        class107.field1710 = 0;
        class1.field11 = 0;
        class264.field4217 = 0;
        class37.field610 = 0;
        class30.field471 = 0;
        class65.field1036 = 0;
        class37.field622 = 0;
        class275.field4319 = 0;
        class42.field685 = 0;
        class235.field3648 = 0;
        class253.field3887 = 0;
        class26.field398 = 0;
        class223.field3511 = 0;
        class18.field284 = 0;
        class253.field3891 = 0;
        class84.field1383 = 0;
        class37.field612 = 0;
        class41.field669 = 0;
        class261.field4011 = 0;
        class120.field1858 = 0;
        class156.field2381 = 0;
        class186.field2804 = 0;
        class212.field3284 = 0;
        class261.field4014 = 0;
        class222.field3478 = 0;
        class291.field4578 = 0;
        class134.field2090 = 0;
        class151.field2330 = 0;
        class220.field3440 = 0;
        class163.field2491 = 0;
        class51.field812 = 0;
        class143.field2192 = 0;
        field1114 = 0;
        class186.field2797 = 0;
        class251.field3852 = 0;
        class283.field4470 = 0;
        class264.field4156 = 0;
        class271.field4287 = 0;
        class237.field3668 = 0;
        class75.field1270 = 0;
        class190.field3028 = 0;
        class237.field3657 = 0;
        class219.field3435 = 0;
        class204.field3176 = 0;
        class161.field2471 = 0;
        class276.field4333 = 0;
        class257.field3944 = 0;
        class148.field2283 = 0;
        class35.field557 = 0;
        class276.field4345 = 0;
        class8.field146 = 0;
        class239.field3703 = 0;
        class81.field1342 = 0;
        class140.field2174 = 0;
        class296.field4666 = 0;
        class37.field634 = 0;
        class1.field13 = 0;
        class205.field3186 = 0;
        class242.field3758 = 0;
        class28.field429 = 0;
        class47.field760 = 0;
        class19.field296 = 0;
        class227.field3551 = 0;
        class81.field1354 = 0;
        class148.field2293 = 0;
        class134.field2098 = 0;
        class166.field2511 = 0;
        class66.field1049 = 0;
        class134.field2082 = 0;
        class161.field2453 = 0;
        class30.field481 = 0;
        class86.field1413 = 0;
        field1106 = 0;
        class158.field2424 = 0;
        class188.field2956 = 0;
        class244.field3776 = 0;
        class11.field212 = 0;
        class13.field226 = 0;
        class29.field455 = 0;
        class249.field3834 = 0;
        class57.field887 = 0;
        class37.field606 = 0;
        class165.field2505 = 0;
        class261.field4009 = 0;
        class37.field642 = 0;
        class73.field1210 = 0;
        class226.field3536 = 0;
        class5.field79 = 0;
        class223.field3514 = 0;
        class73.field1175 = 0;
        class143.field2194 = 0;
        class37.field613 = 0;
        class65.field1032 = 0;
        class47.field754 = 0;
        class41.field666 = 0;
        class133.field2066 = 0;
        class33.field529 = 0;
        class28.field420 = 0;
        class241.field3723 = 0;
        class85.field1399 = 0;
        class21.field311 = 0;
        class103.field1636 = 0;
        class174.field2585 = 0;
        class228.field3562 = 0;
        class61.field989 = 0;
        class256.field3928 = 0;
        class264.field4165 = 0;
        class141.field2175 = 0;
        class242.field3745 = 0;
        class123.field1952 = 0;
        class37.field640 = 0;
        client.field2405 = 0;
        class247.field3825 = 0;
        class280.field4383 = 0;
        class264.field4207 = 0;
        class5.field64 = 0;
        class13.field225 = 0;
        class245.field3796 = 0;
        class133.field2054 = 0;
        class143.field2219 = 0;
        class278.field4378 = 0;
        class288.field4531 = 0;
        class37.field603 = 0;
        class84.field1379 = 0;
        class286.field4499 = 0;
        class37.field605 = 0;
        class32.field522 = 0;
        class197.field3099 = 0;
        class252.field3882 = 0;
        class184.field2787 = 0;
        class19.field293 = 0;
        class270.field4280 = 0;
        class43.field692 = 0;
        class229.field3578 = 0;
        class68.field1076 = 0;
        class202.field3153 = 0;
        class118.field1827 = 0;
        class287.field4517 = 0;
        class265.field4229 = 0;
        class16.field257 = 0;
        class244.field3774 = 0;
        class180.field2690 = 0;
        class223.field3485 = 0;
        class94.field1527 = 0;
        class163.field2485 = 0;
        class295.field4628 = 0;
        class288.field4541 = 0;
        field1104 = 0;
        class208.field3235 = 0;
        class123.field1890 = 0;
        class253.field3893 = 0;
        class288.field4542 = 0;
        class237.field3654 = 0;
        class176.field2618 = 0;
        class73.field1193 = 0;
        class209.field3249 = 0;
        class99.field1578 = 0;
        class255.field3904 = 0;
        class93.field1508 = 0;
        class79.field1322 = 0;
        class149.field2302 = 0;
        class187.field2819 = 0;
        class6.field109 = 0;
        class195.field3074 = 0;
        class88.field1435 = 0;
        class7.field120 = 0;
        class149.field2311 = 0;
        class72.field1150 = 0;
        class277.field4363 = 0;
        class29.field459 = 0;
        class10.field202 = 0;
        class242.field3751 = 0;
        class217.field3365 = 0;
        class195.field3073 = 0;
        class290.field4565 = 0;
        class81.field1349 = 0;
        class93.field1504 = 0;
        class290.field4568 = 0;
        class37.field609 = 0;
        class5.field75 = 0;
        class53.field827 = 0;
        class9.field187 = 0;
        class31.field495 = 0;
        class8.field161 = 0;
        class74.field1249 = 0;
        class237.field3676 = 0;
        class90.field1451 = 0;
        class261.field4075 = 0;
        class84.field1386 = 0;
        class11.field213 = 0;
        class58.field896 = 0;
        class103.field1644 = 0;
        class32.field519 = 0;
        class61.field986 = 0;
        class234.field3621 = 0;
        class176.field2609 = 0;
        class171.field2550 = 0;
        class223.field3505 = 0;
        class198.field3114 = 0;
        class74.field1255 = 0;
        class133.field2051 = 0;
        class66.field1055 = 0;
        class134.field2073 = 0;
        class195.field3069 = 0;
        class261.field4032 = 0;
        class76.field1273 = 0;
        class212.field3293 = 0;
        class196.field3085 = 0;
        class188.field2872 = 0;
        class126.field1974 = 0;
        class66.field1057 = 0;
        class155.field2360 = 0;
        class48.field790 = 0;
        class1.field10 = 0;
        class84.field1380 = 0;
        class136.field2121 = 0;
        class113.field1783 = 0;
        class151.field2329 = 0;
        class32.field520 = 0;
        class123.field1886 = 0;
        class28.field418 = 0;
        class124.field1955 = 0;
        class159.field2439 = 0;
        class229.field3582 = 0;
        class268.field4271 = 0;
        class84.field1389 = 0;
        class74.field1244 = 0;
        class90.field1453 = 0;
        class234.field3626 = 0;
        class151.field2336 = 0;
        class77.field1292 = 0;
        class219.field3423 = 0;
        class65.field1042 = 0;
        class260.field3996 = 0;
        class74.field1238 = 0;
        class251.field3854 = 0;
        class137.field2133 = 0;
        class242.field3747 = 0;
        class231.field3604 = 0L;
        class23.field331 = 0;
        class207.method1387(127);
        class292.field4607.field588 = 0;
        class239.field3692.field588 = 0;
        class71.field1126 = 0;
        class155.field2373 = 0;
        class146.field2259 = -1;
        class108.field1725 = 0;
        class265.field4222 = -1;
        class86.field1415 = -1;
        class32.field524 = -1;
        for (int var1 = 0; ~var1 > ~class217.field3360.length; ++var1) {
            class217.field3360[var1] = null;
        }
        class220.field3450 = 0;
        class64.field1025 = false;
        class197.method1320(true, 0);
        for (int var2 = 0; ~var2 > -101; ++var2) {
            class117.field1817[var2] = null;
        }
        class5.field76 = -50 + (int) (100.0D * Math.random());
        class93.field1506 = (int) (Math.random() * 110.0D) + -55;
        class276.field4334 = (float) (2047 & -10 + (int) (20.0D * Math.random()));
        class90.field1458 = 0;
        class177.field2656 = 0;
        class108.field1723 = 0;
        class296.field4674 = (int) (30.0D * Math.random()) + -20;
        class208.field3238 = (int) (80.0D * Math.random()) + -40;
        class5.field78 = 0;
        class88.field1443 = 0;
        class8.field162 = 0;
        class62.field1006 = 0;
        class179.field2678 = false;
        class208.field3233 = -1;
        class133.field2060 = (int) (Math.random() * 120.0D) - 60;
        class119.field1837 = 0;
        for (int var3 = 0; ~var3 > -2049; ++var3) {
            class41.field675[var3] = null;
            class81.field1347[var3] = null;
        }
        for (int var4 = 0; ~var4 > -32769; ++var4) {
            class72.field1144[var4] = null;
        }
        class261.field4058 = class41.field675[2047] = new class28();
        class13.field229.method1016(false);
        class1.field2.method1016(false);
        if (class293.field4613 != null) {
            for (int var5 = 0; ~var5 > -5; ++var5) {
                for (int var6 = 0; var6 < 104; ++var6) {
                    for (int var7 = 0; ~var7 > -105; ++var7) {
                        class293.field4613[var5][var6][var7] = null;
                    }
                }
            }
        }
        class208.field3232 = new class149();
        class140.field2160 = 0;
        class262.field4100 = 0;
        class37.method316(2204);
        class26.method213((byte) 117);
        class189.field3014 = 0;
        class278.field4379 = 0;
        class111.field1754 = 0;
        class283.field4473 = 0;
        class259.field3977 = 0;
        class180.field2685 = 0;
        class28.field415 = 0;
        class123.field1895 = 0;
        class98.field1566 = 0;
        class135.field2106 = 0;
        for (int var8 = 0; ~class227.field3550.length < ~var8; ++var8) {
            class227.field3550[var8] = -1;
        }
        if (class34.field544 != -1) {
            class154.method1037(class34.field544, (byte) 117);
        }
        for (class120 var9 = (class120) class13.field230.method1410(arg0 ^ -124); var9 != null; var9 = (class120) class13.field230.method1413(-1)) {
            class249.method1672(true, (byte) 50, var9);
        }
        class34.field544 = -1;
        class13.field230 = new class211(8);
        class8.method92((byte) 113);
        class220.field3450 = 0;
        class174.field2577 = null;
        class64.field1025 = false;
        class296.field4670.method1633(-1, (byte) 98, false, new int[5], -1, (int[]) null);
        for (int var10 = 0; ~var10 > -9; ++var10) {
            class58.field908[var10] = null;
            class212.field3291[var10] = false;
            class18.field291[var10] = -1;
        }
        class212.method1419(511);
        class130.field2019 = true;
        for (int var11 = 0; ~var11 > -101; ++var11) {
            class37.field632[var11] = true;
        }
        class100.field1608 = 0;
        class23.field354 = null;
        class46.field732 = null;
        for (int var12 = 0; ~var12 > -7; ++var12) {
            class217.field3408[var12] = new class207();
        }
        for (int var13 = 0; var13 < 25; ++var13) {
            class216.field3335[var13] = 0;
            class77.field1285[var13] = 0;
            class250.field3846[var13] = 0;
        }
        class18.field290 = class113.field1776 = class25.field391 = class80.field1335 = new short[256];
        class216.field3333 = true;
        class203.field3171 = class93.field1505;
        class214.field3296 = false;
        class109.field1741 = 0;
        class31.method249(18336);
        class23.field336 = false;
        class293.method1967(161);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILuf;I)Ldi;")
    public static final class179 method546(int arg0, class176 arg1, int arg2) {
        ++field1123;
        if (arg2 != 0) {
            method551(3, -105);
        }
        return !class223.method1489(arg0, arg1, (byte) 39) ? null : class191.method1294((byte) -86);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Ldc;IIIIIIIZ)V")
    public static final void method547(class243 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class102.field1630;
        int var11;
        int var12 = var11 = (arg7 << 7) - class239.field3713;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class68.field1079[arg1][arg6][arg7] - class58.field894;
        int var18 = class68.field1079[arg1][arg6 + 1][arg7] - class58.field894;
        int var19 = class68.field1079[arg1][arg6 + 1][arg7 + 1] - class58.field894;
        int var20 = class68.field1079[arg1][arg6][arg7 + 1] - class58.field894;
        int var21 = arg4 * var12 + arg5 * var10 >> 16;
        int var22 = arg5 * var12 - arg4 * var10 >> 16;
        int var24 = arg3 * var17 - arg2 * var22 >> 16;
        int var25 = arg2 * var17 + arg3 * var22 >> 16;
        if (var25 >= 50) {
            int var27 = arg4 * var11 + arg5 * var14 >> 16;
            int var28 = arg5 * var11 - arg4 * var14 >> 16;
            int var30 = arg3 * var18 - arg2 * var28 >> 16;
            int var31 = arg2 * var18 + arg3 * var28 >> 16;
            if (var31 >= 50) {
                int var33 = arg4 * var16 + arg5 * var13 >> 16;
                int var34 = arg5 * var16 - arg4 * var13 >> 16;
                int var36 = arg3 * var19 - arg2 * var34 >> 16;
                int var37 = arg2 * var19 + arg3 * var34 >> 16;
                if (var37 >= 50) {
                    int var39 = arg4 * var15 + arg5 * var9 >> 16;
                    int var40 = arg5 * var15 - arg4 * var9 >> 16;
                    int var42 = arg3 * var20 - arg2 * var40 >> 16;
                    int var43 = arg2 * var20 + arg3 * var40 >> 16;
                    if (var43 >= 50) {
                        int var45 = (var21 << 9) / var25 + class97.field1546;
                        int var46 = (var24 << 9) / var25 + class97.field1552;
                        int var47 = (var27 << 9) / var31 + class97.field1546;
                        int var48 = (var30 << 9) / var31 + class97.field1552;
                        int var49 = (var33 << 9) / var37 + class97.field1546;
                        int var50 = (var36 << 9) / var37 + class97.field1552;
                        int var51 = (var39 << 9) / var43 + class97.field1546;
                        int var52 = (var42 << 9) / var43 + class97.field1552;
                        class97.field1559 = 0;
                        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
                            if (class222.field3479 && class33.method263(class99.field1586 + class97.field1546, class97.field1552 + class137.field2125, var50, var52, var48, var49, var51, var47)) {
                                class187.field2818 = arg6;
                                class133.field2041 = arg7;
                            }
                            if (!arg8) {
                                class97.field1553 = false;
                                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class97.field1550 || var51 > class97.field1550 || var47 > class97.field1550) {
                                    class97.field1553 = true;
                                }
                                if (arg0.field3767 == -1) {
                                    if (arg0.field3771 != 12345678) {
                                        class97.method762(var50, var52, var48, var49, var51, var47, arg0.field3771, arg0.field3769, arg0.field3762);
                                    }
                                } else if (class155.field2366) {
                                    if (arg0.field3761) {
                                        class97.method750(var50, var52, var48, var49, var51, var47, arg0.field3771, arg0.field3769, arg0.field3762, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field3767);
                                    } else {
                                        class97.method750(var50, var52, var48, var49, var51, var47, arg0.field3771, arg0.field3769, arg0.field3762, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field3767);
                                    }
                                } else {
                                    int var53 = class97.field1547.method1893(arg0.field3767, -62);
                                    class97.method762(var50, var52, var48, var49, var51, var47, class111.method824(var53, arg0.field3771), class111.method824(var53, arg0.field3769), class111.method824(var53, arg0.field3762));
                                }
                            }
                        }
                        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) > 0) {
                            if (class222.field3479 && class33.method263(class99.field1586 + class97.field1546, class97.field1552 + class137.field2125, var46, var48, var52, var45, var47, var51)) {
                                class187.field2818 = arg6;
                                class133.field2041 = arg7;
                            }
                            if (!arg8) {
                                class97.field1553 = false;
                                if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class97.field1550 || var47 > class97.field1550 || var51 > class97.field1550) {
                                    class97.field1553 = true;
                                }
                                if (arg0.field3767 == -1) {
                                    if (arg0.field3766 != 12345678) {
                                        class97.method762(var46, var48, var52, var45, var47, var51, arg0.field3766, arg0.field3762, arg0.field3769);
                                        return;
                                    }
                                } else {
                                    if (class155.field2366) {
                                        class97.method750(var46, var48, var52, var45, var47, var51, arg0.field3766, arg0.field3762, arg0.field3769, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field3767);
                                        return;
                                    }
                                    int var54 = class97.field1547.method1893(arg0.field3767, -34);
                                    class97.method762(var46, var48, var52, var45, var47, var51, class111.method824(var54, arg0.field3766), class111.method824(var54, arg0.field3762), class111.method824(var54, arg0.field3769));
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZZIIZ)Luf;")
    public static final class176 method548(boolean arg0, boolean arg1, int arg2, int arg3, boolean arg4) {
        ++field1109;
        class252 var5 = null;
        if (arg2 != 0) {
            return null;
        } else {
            if (class212.field3285 != null) {
                var5 = new class252(arg3, class212.field3285, class266.field4240[arg3], 1000000);
            }
            class295.field4627[arg3] = class55.field856.method1681(false, class39.field659, var5, arg3);
            if (arg4) {
                class295.field4627[arg3].method992(false);
            }
            return new class176(class295.field4627[arg3], arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(III)V")
    public final void method549(int arg0, int arg1, int arg2) {
        ++field1106;
        int var4 = this.field1125 * arg1 >> 12;
        int var5 = this.field1112 * arg0 >> 12;
        int var6 = this.field1105 * arg0 >> 12;
        int var7 = this.field1118 * arg1 >> 12;
        int var8 = this.field1110 * arg0 >> 12;
        int var9 = this.field1116 * arg0 >> 12;
        int var10 = this.field1122 * arg1 >> 12;
        int var11 = this.field1107 * arg1 >> 12;
        class258.method1713(var11, var7, var5, (byte) -100, super.field2124, var6, var10, var8, var4, var9);
        if (arg2 != 0) {
            method551(26, 79);
        }
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class70(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field1116 = arg6;
        this.field1105 = arg2;
        this.field1125 = arg1;
        this.field1118 = arg3;
        this.field1122 = arg5;
        this.field1107 = arg7;
        this.field1112 = arg0;
        this.field1110 = arg4;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(III)V")
    public final void method550(int arg0, int arg1, int arg2) {
        ++field1111;
        if (arg0 != 0) {
            this.field1112 = 2;
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(II)Ljava/lang/String;")
    private static final String method551(int arg0, int arg1) {
        if (arg1 != 0) {
            method546(70, (class176) null, -118);
        }
        ++field1103;
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else {
            return ~arg0 > -10000001 ? "<col=ffffff>" + arg0 / 1000 + class124.field1964 + "</col>" : "<col=00ff80>" + arg0 / 1000000 + class55.field855 + "</col>";
        }
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(I)V")
    public static void method552(int arg0) {
        field1124 = null;
        if (arg0 != -11811) {
            field1124 = null;
        }
        field1120 = null;
    }

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "(I)V")
    public static final void method553(int arg0) {
        for (class120 var1 = (class120) class13.field230.method1410(-91); var1 != null; var1 = (class120) class13.field230.method1413(-1)) {
            int var2 = var1.field1852;
            if (class103.method784(-1, var2)) {
                class188[] var3 = class261.field4006[var2];
                boolean var4 = true;
                for (int var5 = 0; ~var5 > ~var3.length; ++var5) {
                    if (var3[var5] != null) {
                        var4 = var3[var5].field2852;
                        break;
                    }
                }
                if (!var4) {
                    int var6 = (int) var1.field1408;
                    class188 var7 = class5.method57((byte) -106, var6);
                    if (var7 != null) {
                        class246.method1663(255, var7);
                    }
                }
            }
        }
        if (arg0 < 84) {
            method551(-98, -88);
        }
        ++field1119;
    }
}
