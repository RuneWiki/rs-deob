import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class21 implements Runnable {

    @OriginalMember(owner = "client!od", name = "j", descriptor = "Z")
    public boolean field389 = true;

    @OriginalMember(owner = "client!od", name = "h", descriptor = "Ljava/lang/Object;")
    public Object field387 = new Object();

    @OriginalMember(owner = "client!od", name = "m", descriptor = "[I")
    public int[] field392 = new int[500];

    @OriginalMember(owner = "client!od", name = "l", descriptor = "I")
    public int field391 = 0;

    @OriginalMember(owner = "client!od", name = "o", descriptor = "[I")
    public int[] field394 = new int[500];

    @OriginalMember(owner = "client!od", name = "d", descriptor = "I")
    public static int field383 = 0;

    @OriginalMember(owner = "client!od", name = "r", descriptor = "Lsg;")
    public static class30 field397 = class167.method1221((byte) 33, " steht bereits auf Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!od", name = "a", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!od", name = "e", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!od", name = "f", descriptor = "I")
    public static int field385;

    @OriginalMember(owner = "client!od", name = "g", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!od", name = "i", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!od", name = "n", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!od", name = "p", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "client!od", name = "k", descriptor = "Lmc;")
    public static class151 field390;

    @OriginalMember(owner = "client!od", name = "q", descriptor = "Lbk;")
    public static class51 field396;

    @OriginalMember(owner = "client!od", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field389) {
            Object var1 = this.field387;
            synchronized (this.field387) {
                if (this.field391 < 500) {
                    this.field392[this.field391] = class23.field440;
                    this.field394[this.field391] = class104.field2095;
                    this.field391++;
                }
            }
            class160.method1191(50L, 0);
        }
        field388++;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ILfi;ZIIIIZIIIILeh;I)Lfi;")
    public static final class217 method197(int arg0, class217 arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, class138 arg12, int arg13) {
        long var14 = ((long) arg8 << 48) + (long) ((arg6 << 24) + (arg9 << 16) + arg10) + ((long) arg0 << 32);
        field385++;
        class217 var16 = (class217) class31.field784.method1644((byte) -77, var14);
        if (var16 == null) {
            byte var17 = 3;
            byte var18;
            if (arg10 == 1) {
                var18 = 9;
            } else if (arg10 == 2) {
                var18 = 12;
            } else if (arg10 == 3) {
                var18 = 15;
            } else if (arg10 == 4) {
                var18 = 18;
            } else {
                var18 = 21;
            }
            int[] var19 = new int[] { 64, 96, 128 };
            class128 var20 = new class128(var17 * var18 + 1, var17 * var18 * 2 - var18, 0);
            int var21 = var20.method971(0, 0, 0);
            int[][] var22 = new int[var17][var18];
            for (int var23 = 0; var23 < var17; var23++) {
                int var30 = var19[var23];
                int var31 = var19[var23];
                for (int var32 = 0; var32 < var18; var32++) {
                    int var33 = (var32 << 11) / var18;
                    int var34 = class213.field3849[var33] * var30 + arg11 >> 16;
                    int var35 = class213.field3846[var33] * var31 + arg13 >> 16;
                    var22[var23][var32] = var20.method971(var34, 0, var35);
                }
            }
            for (int var24 = 0; var24 < var17; var24++) {
                int var25 = (var24 * 256 + 128) / var17;
                int var26 = 256 - var25;
                byte var27 = (byte) (arg6 * var25 + arg9 * var26 >> 8);
                short var28 = (short) (((arg0 & 0x7F) * var26 + (arg8 & 0x7F) * var25 & 0x7F00) + ((arg0 & 0x380) * var26 + (arg8 & 0x380) * var25 & 0x38000) + ((arg0 & 0xFC00) * var26 + (arg8 & 0xFC00) * var25 & 0xFC0000) >> 8);
                for (int var29 = 0; var29 < var18; var29++) {
                    if (var24 == 0) {
                        var20.method973(var21, var22[0][(var29 + 1) % var18], var22[0][var29], (byte) 1, var28, var27);
                    } else {
                        var20.method973(var22[var24 - 1][var29], var22[var24 - 1][(var29 + 1) % var18], var22[var24][(var29 + 1) % var18], (byte) 1, var28, var27);
                        var20.method973(var22[var24 - 1][var29], var22[var24][(var29 + 1) % var18], var22[var24][var29], (byte) 1, var28, var27);
                    }
                }
            }
            var16 = var20.method965(64, 768, -50, -10, -50);
            class31.field784.method1646(var14, var16, -117);
        }
        int var36 = arg10 * 64 - 1;
        int var37 = -var36;
        int var38 = -var36;
        int var39 = var36;
        int var40 = var36;
        if (arg2) {
            if (arg5 > 1664 || arg5 < 384) {
                var37 -= 128;
            }
            if (arg5 > 640 && arg5 < 1408) {
                var40 = var36 + 128;
            }
            if (arg5 > 128 && arg5 < 896) {
                var38 -= 128;
            }
            if (arg5 > 1152 && arg5 < 1920) {
                var39 = var36 + 128;
            }
        }
        int var41 = arg1.method1554();
        int var42 = arg1.method1552();
        if (var42 > var39) {
            var42 = var39;
        }
        class219 var43 = null;
        if (var41 < var38) {
            var41 = var38;
        }
        int var44 = arg1.method1560();
        if (var44 < var37) {
            var44 = var37;
        }
        int var45 = arg1.method1542();
        if (var45 > var40) {
            var45 = var40;
        }
        if (arg12 != null) {
            int var46 = arg12.field2699[arg4];
            var43 = class183.method1317(var46 >> 16, 32);
            arg4 = var46 & 0xFFFF;
        }
        class217 var47;
        if (var43 == null) {
            var47 = var16.method1558(true, true);
            var47.method1564((var42 - var41) / 2, 128, (var45 - var44) / 2);
            var47.method1549((var41 + var42) / 2, 0, (var44 + var45) / 2);
        } else {
            var47 = var16.method1558(!var43.method1588(arg4, (byte) -88), true);
            var47.method1564((var42 - var41) / 2, 128, (var45 - var44) / 2);
            var47.method1549((var41 + var42) / 2, 0, (var44 + var45) / 2);
            var47.method1540(var43, arg4);
        }
        if (arg5 != 0) {
            var47.method1565(arg5);
        }
        class214 var48 = (class214) var47;
        if (class31.method303(arg11 + var41, arg13 + var44, class159.field2998, -4) != arg3 || class31.method303(arg11 + var42, arg13 + var45, class159.field2998, -4) != arg3) {
            for (int var49 = 0; var49 < var48.field3876; var49++) {
                var48.field3887[var49] += class31.method303(var48.field3873[var49] + arg11, var48.field3870[var49] + arg13, class159.field2998, -4) - arg3;
            }
            var48.field3883 = false;
        }
        if (!arg7) {
            method199((class8) null, (byte) -119);
        }
        return var47;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(B)V")
    public static final void method198(byte arg0) {
        class170.field3204.field391 = 0;
        class125.field2442 = 0;
        class116.field2286 = true;
        class173.field3235 = true;
        class223.field4001 = 0L;
        class133.method1005(112);
        class52.field1161 = -1;
        class196.field3551 = -1;
        class202.field3607 = 0;
        class179.field3314 = 0;
        class36.field871 = -1;
        class70.field1586 = -1;
        field381++;
        class50.field1128 = 0;
        class178.field3292 = 0;
        class272.field4772 = 0;
        class195.field3511 = 0;
        class121.field2380 = 0;
        class14.field311 = 0;
        class151.field2883 = 0;
        class168.field3118 = 0;
        class75.field1666 = 0;
        class109.field2193 = 0;
        class94.field1896 = 0;
        class40.field951 = 0;
        class254.field4490 = 0;
        class17.field342 = 0;
        class20.field369 = 0;
        class60.field1301 = 0;
        class225.field4027 = 0;
        class166.field3057 = 0;
        class98.field1987 = 0;
        class14.field299 = 0;
        class238.field4234 = 0;
        class63.field1383 = 0;
        class8.field134 = 0;
        class40.field967 = 0;
        class49.field1118 = 0;
        class67.field1469 = 0;
        class133.field2616 = 0;
        class212.field3818 = 0;
        class129.field2535 = 0;
        class80.field1730 = 0;
        client.field3787 = 0;
        class201.field3591 = 0;
        class186.field3408 = 0;
        class104.field2099 = 0;
        class114.field2263 = 0;
        class65.field1436 = 0;
        class235.field4184 = 0;
        class81.field1741 = 0;
        class114.field2260 = 0;
        class58.field1267 = 0;
        class68.field1480 = 0;
        class1.field20 = 0;
        class151.field2888 = 0;
        class68.field1481 = 0;
        class185.field3383 = 0;
        class100.field2034 = 0;
        class259.field4573 = 0;
        class68.field1477 = 0;
        class221.field3983 = 0;
        class81.field1733 = 0;
        class212.field3842 = 0;
        class31.field710 = 0;
        class93.field1886 = 0;
        class69.field1531 = 0;
        class8.field137 = 0;
        class31.field676 = 0;
        class55.field1204 = 0;
        class245.field4371 = 0;
        class252.field4455 = 0;
        class263.field4647 = 0;
        class31.field647 = 0;
        class136.field2657 = 0;
        class30.field617 = 0;
        class257.field4541 = 0;
        class24.field447 = 0;
        class149.field2834 = 0;
        class135.field2644 = 0;
        class14.field314 = 0;
        class91.field1849 = 0;
        if (arg0 < 12) {
            method202(-4);
        }
        class262.field4633 = 0;
        class232.field4129 = 0;
        class65.field1427 = 0;
        class167.field3066 = 0;
        class74.field1654 = 0;
        class270.field4751 = 0;
        class11.field214 = 0;
        class262.field4624 = 0;
        class137.field2668 = 0;
        class227.field4053 = 0;
        class30.field614 = 0;
        class241.field4293 = 0;
        class254.field4492 = 0;
        class159.field2981 = 0;
        class69.field1500 = 0;
        class8.field147 = 0;
        class30.field631 = 0;
        class236.field4220 = 0;
        class40.field977 = 0;
        class69.field1510 = 0;
        class69.field1533 = 0;
        class30.field586 = 0;
        class30.field612 = 0;
        class151.field2863 = 0;
        class225.field4033 = 0;
        class205.field3666 = 0;
        class249.field4407 = 0;
        class220.field3967 = 0;
        class168.field3159 = 0;
        class215.field3924 = 0;
        class96.field1958 = 0;
        class73.field1643 = 0;
        class59.field1276 = 0;
        class6.field78 = 0;
        class275.field4798 = 0;
        class135.field2634 = 0;
        class260.field4595 = 0;
        class189.field3451 = 0;
        class30.field628 = 0;
        class69.field1564 = 0;
        class271.field4763 = 0;
        class254.field4487 = 0;
        class270.field4747 = 0;
        class57.field1251 = 0;
        class63.field1373 = 0;
        class93.field1872 = 0;
        class94.field1891 = 0;
        class136.field2655 = 0;
        class60.field1291 = 0;
        class155.field2943 = 0;
        class37.field893 = 0;
        class253.field4461 = 0;
        field385 = 0;
        class31.field775 = 0;
        class266.field4694 = 0;
        class61.field1322 = 0;
        class94.field1903 = 0;
        class2.field31 = 0;
        class2.field28 = 0;
        class94.field1907 = 0;
        class265.field4674 = 0;
        class8.field143 = 0;
        class50.field1145 = 0;
        class8.field105 = 0;
        class250.field4431 = 0;
        class259.field4590 = 0;
        class57.field1244 = 0;
        class23.field430 = 0;
        class8.field157 = 0;
        class249.field4413 = 0;
        class41.field1013 = 0;
        class99.field2013 = 0;
        class164.field3046 = 0;
        class155.field2945 = 0;
        class70.field1587 = 0;
        class254.field4479 = 0;
        class244.field4358 = 0;
        class175.field3256 = 0;
        class120.field2346 = 0;
        class135.field2640 = 0;
        class157.field2952 = 0;
        class14.field280 = 0;
        class8.field154 = 0;
        class257.field4525 = 0;
        class220.field3968 = 0;
        class203.field3627 = 0;
        class247.field4397 = 0;
        class100.field2045 = 0;
        class172.field3213 = 0;
        class241.field4314 = 0;
        class93.field1877 = 0;
        class230.field4094 = 0;
        class137.field2676 = 0;
        class69.field1538 = 0;
        class63.field1371 = 0;
        class40.field978 = 0;
        class270.field4749 = 0;
        class115.field2279 = 0;
        class90.field1815 = 0;
        class220.field3970 = 0;
        class151.field2891 = 0;
        class94.field1906 = 0;
        class40.field935 = 0;
        class160.field3000 = 0;
        class79.field1707 = 0;
        class190.field3468 = 0;
        class97.field1973 = 0;
        class215.field3928 = 0;
        class194.field3499 = 0;
        class168.field3145 = 0;
        class234.field4156 = 0;
        class93.field1889 = 0;
        class257.field4556 = 0;
        class71.field1588 = 0;
        class151.field2903 = 0;
        class154.field2940 = 0;
        class139.field2716 = 0;
        class8.field108 = 0;
        class14.field301 = 0;
        class180.field3331 = 0;
        class14.field283 = 0;
        class135.field2645 = 0;
        class80.field1712 = 0;
        class30.field600 = 0;
        class8.field102 = 0;
        class134.field2624 = 0;
        class63.field1350 = 0;
        class159.field2989 = 0;
        class8.field118 = 0;
        class195.field3516 = 0;
        client.field3788 = 0;
        client.field3791 = 0;
        client.field3792 = 0;
        class49.field1108 = 0;
        class153.field2909 = 0;
        class73.field1640 = 0;
        class230.field4097 = 0;
        class151.field2894 = 0;
        class201.field3587 = 0;
        class223.field3997 = 0;
        class151.field2859 = 0;
        class30.field608 = 0;
        class130.field2559 = 0;
        class136.field2659 = 0;
        class271.field4761 = 0;
        class69.field1552 = 0;
        class122.field2403 = 0;
        class244.field4359 = 0;
        class103.field2081 = 0;
        class174.field3254 = 0;
        class110.field2210 = 0;
        class30.field623 = 0;
        class263.field4650 = 0;
        class244.field4361 = 0;
        class69.field1554 = 0;
        class29.field565 = 0;
        class25.field470 = 0;
        class167.field3082 = 0;
        class13.field247 = 0;
        class119.field2328 = 0;
        class193.field3490 = 0;
        class87.field1793 = 0;
        class221.field3987 = 0;
        class101.field2058 = 0;
        class50.field1135 = 0;
        class8.field115 = 0;
        class252.field4450 = 0;
        class81.field1742 = 0;
        class69.field1565 = 0;
        class234.field4162 = 0;
        class40.field969 = 0;
        class178.field3305 = 0;
        class144.field2777 = 0;
        class65.field1430 = 0;
        class246.field4388 = 0;
        class73.field1650 = 0;
        class216.field3945 = 0;
        class257.field4533 = 0;
        class8.field130 = 0;
        class40.field949 = 0;
        class31.field657 = 0;
        class69.field1499 = 0;
        class150.field2854 = 0;
        class223.field4006 = 0;
        class130.field2561 = 0;
        class147.field2808 = 0;
        class170.field3196 = 0;
        class13.field240 = 0;
        class32.field818 = 0;
        class175.field3259 = 0;
        class90.field1817 = 0;
        class268.field4727 = 0;
        class233.field4150 = 0;
        class120.field2365 = 0;
        class147.field2817 = 0;
        class8.field106 = 0;
        class224.field4017 = 0;
        class45.field1056 = 0;
        class53.field1180 = 0;
        class121.field2382 = 0;
        class91.field1835 = 0;
        class64.field1410 = 0;
        client.field3796 = 0;
        class8.field139 = 0;
        class88.field1795 = 0;
        class122.field2408 = 0;
        class265.field4671 = 0;
        class151.field2866 = 0;
        class197.field3565 = 0;
        class20.field364 = 0;
        class54.field1190 = 0;
        class44.field1033 = 0;
        class195.field3513 = 0;
        class138.field2703 = 0;
        class121.field2379 = 0;
        class31.field789 = 0;
        class185.field3386 = 0;
        class14.field294 = 0;
        class13.field251 = 0;
        class30.field593 = 0;
        class8.field112 = 0;
        class59.field1272 = 0;
        class263.field4644 = 0;
        class2.field25 = 0;
        class182.field3349 = 0;
        class13.field235 = 0;
        class186.field3421 = 0;
        class36.field875 = 0;
        class249.field4408 = 0;
        class6.field92 = 0;
        class212.field3826 = 0;
        class41.field1018 = 0;
        class219.field3955 = 0;
        class151.field2885 = 0;
        class8.field125 = 0;
        class30.field594 = 0;
        class122.field2412 = 0;
        class203.field3631 = 0;
        class8.field111 = 0;
        class183.field3362 = 0;
        class47.field1075 = 0;
        class228.field4073 = 0;
        class100.field2031 = 0;
        class50.field1147 = 0;
        class30.field610 = 0;
        class121.field2385 = 0;
        class151.field2867 = 0;
        class112.field2237 = 0;
        class37.field885 = 0;
        class79.field1703 = 0;
        class8.field121 = 0;
        class112.field2225 = 0;
        class191.field3479 = 0;
        class241.field4316 = 0;
        class179.field3307 = 0;
        class167.field3074 = 0;
        class160.field3010 = 0;
        class64.field1412 = 0;
        class209.field3761 = 0;
        field384 = 0;
        class61.field1324 = 0;
        class232.field4128 = 0;
        class64.field1417 = 0;
        class106.field2125 = 0;
        class8.field138 = 0;
        class153.field2907 = 0;
        class20.field368 = 0;
        class74.field1655 = 0;
        class233.field4146 = 0;
        class30.field581 = 0;
        class151.field2872 = 0;
        class61.field1325 = 0;
        class6.field93 = 0;
        class69.field1546 = 0;
        class59.field1281 = 0;
        class232.field4122 = 0;
        class151.field2897 = 0;
        class69.field1543 = 0;
        class141.field2721 = 0;
        class8.field119 = 0;
        class143.field2759 = 0;
        class262.field4631 = 0;
        class44.field1039 = 0;
        class16.field333 = 0;
        class16.field331 = 0;
        class69.field1561 = 0;
        class14.field309 = 0;
        class57.field1255 = 0;
        class33.field830 = 0;
        class69.field1515 = 0;
        class33.field828 = 0;
        class120.field2335 = 0;
        class8.field131 = 0;
        class263.field4654 = 0;
        class157.field2969 = 0;
        class73.field1651 = 0;
        class120.field2375 = 0;
        class186.field3420 = 0;
        class147.field2812 = 0;
        class173.field3244 = 0;
        class93.field1883 = 0;
        class8.field126 = 0;
        class120.field2340 = 0;
        class99.field2025 = 0;
        class30.field627 = 0;
        class135.field2646 = 0;
        class13.field239 = 0;
        class255.field4507 = 0;
        class93.field1882 = 0;
        class167.field3081 = 0;
        class270.field4742 = 0;
        class94.field1898 = 0;
        class50.field1141 = 0;
        class37.field898 = 0;
        class79.field1705 = 0;
        class247.field4401 = 0;
        class226.field4042 = 0;
        class68.field1491 = 0;
        class211.field3807 = 0;
        class30.field587 = 0;
        class129.field2541 = 0;
        class61.field1308 = 0;
        class235.field4201 = 0;
        class28.field527 = 0;
        class153.field2905 = 0;
        class48.field1095 = 0;
        class275.field4801 = 0;
        class277.field4827 = 0;
        class141.field2735 = 0;
        class48.field1090 = 0;
        class25.field467 = 0;
        class14.field266 = 0;
        class252.field4446 = 0;
        class99.field2003 = 0;
        class263.field4639 = 0;
        class14.field295 = 0;
        class57.field1260 = 0;
        class14.field312 = 0;
        class261.field4612 = 0;
        class173.field3240 = 0;
        class204.field3633 = 0;
        class143.field2765 = 0;
        class235.field4200 = 0;
        class69.field1550 = 0;
        class41.field1008 = 0;
        class37.field881 = 0;
        class209.field3763 = 0;
        class29.field543 = 0;
        class62.field1331 = 0;
        client.field3784 = 0;
        class78.field1692 = 0;
        class160.field3004 = 0;
        class48.field1107 = 0;
        class32.field813 = 0;
        class52.field1167 = 0;
        class40.field959 = 0;
        class216.field3941 = 0;
        class92.field1856 = 0;
        class37.field897 = 0;
        class57.field1261 = 0;
        class8.field114 = 0;
        class108.field2186 = 0;
        class185.field3390 = 0;
        class276.field4816 = 0;
        class30.field585 = 0;
        class81.field1735 = 0;
        class25.field484 = 0;
        class41.field1020 = 0;
        class185.field3384 = 0;
        class173.field3241 = 0;
        class220.field3966 = 0;
        class87.field1786 = 0;
        class246.field4383 = 0;
        class13.field256 = 0;
        class82.field1748 = 0;
        class151.field2875 = 0;
        class68.field1489 = 0;
        class160.field3009 = 0;
        class73.field1641 = 0;
        class87.field1776 = 0;
        class157.field2957 = 0;
        class50.field1144 = 0;
        class86.field1773 = 0;
        class13.field246 = 0;
        class256.field4519 = 0;
        class30.field616 = 0;
        class11.field211 = 0;
        class33.field825 = 0;
        class227.field4051 = 0;
        class80.field1715 = 0;
        class13.field249 = 0;
        class241.field4297 = 0;
        class48.field1104 = 0;
        class17.field337 = 0;
        class225.field4034 = 0;
        class255.field4504 = 0;
        class55.field1214 = 0;
        class146.field2799 = 0;
        class133.field2611 = 0;
        class257.field4552 = 0;
        class69.field1534 = 0;
        class20.field365 = 0;
        class168.field3134 = 0;
        class101.field2057 = 0;
        class205.field3677 = 0;
        class259.field4580 = 0;
        class80.field1725 = 0;
        class37.field889 = 0;
        class168.field3136 = 0;
        class209.field3758 = 0;
        class173.field3242 = 0;
        class130.field2556 = 0;
        class69.field1508 = 0;
        class90.field1814 = 0;
        class186.field3407 = 0;
        class244.field4355 = 0;
        class182.field3346 = 0;
        class223.field4003 = 0;
        class259.field4570 = 0;
        class47.field1071 = 0;
        class14.field263 = 0;
        class117.field2303 = 0;
        class64.field1413 = 0;
        class69.field1529 = 0;
        class8.field104 = 0;
        class106.field2131 = 0;
        class47.field1083 = 0;
        class159.field2983 = 0;
        class63.field1407 = 0;
        class241.field4265 = 0;
        class257.field4539 = 0;
        class30.field609 = 0;
        class30.field615 = 0;
        class119.field2320 = 0;
        class119.field2332 = 0;
        class8.field132 = 0;
        class145.field2786 = 0;
        class96.field1950 = 0;
        class177.field3283 = 0;
        class30.field583 = 0;
        class45.field1053 = 0;
        class173.field3225 = 0;
        class273.field4791 = 0;
        class277.field4822 = 0;
        class40.field983 = 0;
        class272.field4773 = 0;
        class117.field2297 = 0;
        class104.field2085 = 0;
        class13.field253 = 0;
        class204.field3646 = 0;
        class14.field276 = 0;
        class8.field136 = 0;
        class90.field1819 = 0;
        class63.field1355 = 0;
        class174.field3247 = 0;
        class266.field4688 = 0;
        class13.field241 = 0;
        class167.field3062 = 0;
        class125.field2452 = 0;
        class204.field3649 = 0;
        class203.field3630 = 0;
        class131.field2584 = 0;
        class235.field4203 = 0;
        class225.field4036 = 0;
        class54.field1197 = 0;
        class69.field1558 = 0;
        class91.field1831 = 0;
        class28.field506 = 0;
        class121.field2378 = 0;
        class13.field242 = 0;
        class263.field4653 = 0;
        class253.field4468 = 0;
        class71.field1605 = 0;
        class69.field1502 = 0;
        class235.field4186 = 0;
        class204.field3634 = 0;
        class173.field3229 = 0;
        class238.field4235 = 0;
        class119.field2326 = 0;
        class154.field2921 = 0;
        class259.field4579 = 0;
        class115.field2270 = 0;
        class243.field4345 = 0;
        class105.field2109 = 0;
        class135.field2632 = 0;
        class99.field2014 = 0;
        class176.field3269 = 0;
        class47.field1073 = 0;
        class261.field4608 = 0;
        class13.field255 = 0;
        class109.field2198 = 0;
        class266.field4682 = 0;
        class93.field1878 = 0;
        class69.field1542 = 0;
        class41.field1023 = 0;
        class146.field2794 = 0;
        class247.field4396 = 0;
        class30.field620 = 0;
        class259.field4589 = 0;
        class190.field3463 = 0;
        class127.field2474 = 0;
        client.field3786 = 0;
        class74.field1657 = 0;
        class178.field3295 = 0;
        class8.field103 = 0;
        class157.field2961 = 0;
        client.field3789 = 0;
        class67.field1472 = 0;
        class109.field2200 = 0;
        class266.field4689 = 0;
        class142.field2747 = 0;
        class241.field4275 = 0;
        class47.field1074 = 0;
        class31.field725 = 0;
        class236.field4214 = 0;
        class68.field1487 = 0;
        class119.field2325 = 0;
        class147.field2813 = 0;
        class138.field2697 = 0;
        class71.field1609 = 0;
        class151.field2861 = 0;
        class17.field351 = 0;
        class13.field260 = 0;
        class231.field4098 = 0;
        class155.field2946 = 0;
        class269.field4733 = 0;
        class50.field1129 = 0;
        class170.field3193 = 0;
        class263.field4652 = 0;
        class71.field1610 = 0;
        class107.field2145 = 0;
        class30.field622 = 0;
        class229.field4087 = 0;
        class37.field888 = 0;
        class182.field3351 = 0;
        class110.field2213 = 0;
        class250.field4429 = 0;
        class231.field4104 = 0;
        class14.field297 = 0;
        class234.field4168 = 0;
        class190.field3454 = 0;
        class29.field552 = 0;
        class260.field4598 = 0;
        class110.field2206 = 0;
        class94.field1897 = 0;
        field388 = 0;
        class76.field1675 = 0;
        class256.field4510 = 0;
        class277.field4829 = 0;
        class168.field3099 = 0;
        class8.field152 = 0;
        class139.field2717 = 0;
        class15.field319 = 0;
        class13.field257 = 0;
        class65.field1428 = 0;
        class112.field2235 = 0;
        class43.field1032 = 0;
        class239.field4252 = 0;
        class50.field1142 = 0;
        class263.field4641 = 0;
        class100.field2042 = 0;
        class23.field428 = 0;
        class87.field1789 = 0;
        class235.field4204 = 0;
        class124.field2426 = 0;
        class231.field4101 = 0;
        class48.field1097 = 0;
        class54.field1194 = 0;
        class25.field481 = 0;
        class196.field3552 = 0;
        class90.field1813 = 0;
        client.field3783 = 0;
        class124.field2439 = 0;
        class134.field2623 = 0;
        class73.field1644 = 0;
        class48.field1087 = 0;
        class257.field4548 = 0;
        class129.field2543 = 0;
        class166.field3056 = 0;
        class115.field2269 = 0;
        class168.field3130 = 0;
        class167.field3059 = 0;
        class244.field4353 = 0;
        class14.field304 = 0;
        class31.field748 = 0;
        class261.field4611 = 0;
        class50.field1143 = 0;
        class33.field823 = 0;
        class186.field3417 = 0;
        class103.field2082 = 0;
        class163.field3036 = 0;
        class250.field4419 = 0;
        class8.field113 = 0;
        class233.field4145 = 0;
        class151.field2901 = 0;
        class178.field3303 = 0;
        class14.field310 = 0;
        class170.field3191 = 0;
        class67.field1470 = 0;
        class69.field1535 = 0;
        class254.field4475 = 0;
        class151.field2895 = 0;
        class168.field3151 = 0;
        class2.field34 = 0;
        class180.field3332 = 0;
        class272.field4767 = 0;
        class6.field87 = 0;
        class157.field2955 = 0;
        class160.field3001 = 0;
        class168.field3128 = 0;
        class232.field4133 = 0;
        class112.field2227 = 0;
        class151.field2882 = 0;
        class182.field3348 = 0;
        class253.field4462 = 0;
        class261.field4607 = 0;
        class175.field3266 = 0;
        class99.field2017 = 0;
        class9.field165 = 0;
        class151.field2880 = 0;
        class99.field2012 = 0;
        class8.field148 = 0;
        class183.field3364 = 0;
        class29.field546 = 0;
        class266.field4695 = 0;
        field393 = 0;
        class209.field3760 = 0;
        class151.field2876 = 0;
        class193.field3489 = 0;
        client.field3793 = 0;
        class41.field1012 = 0;
        class204.field3650 = 0;
        class31.field640 = 0;
        class81.field1744 = 0;
        class116.field2281 = 0;
        class212.field3831 = 0;
        class82.field1751 = 0;
        class166.field3055 = 0;
        class252.field4457 = 0;
        class91.field1833 = 0;
        class59.field1279 = 0;
        class138.field2682 = 0;
        class102.field2073 = 0;
        class20.field366 = 0;
        class59.field1280 = 0;
        class69.field1532 = 0;
        class8.field110 = 0;
        class133.field2614 = 0;
        class147.field2818 = 0;
        class189.field3440 = 0;
        class249.field4412 = 0;
        class25.field479 = 0;
        class6.field85 = 0;
        class270.field4746 = 0;
        class44.field1048 = 0;
        class277.field4834 = 0;
        class234.field4155 = 0;
        class270.field4755 = 0;
        class209.field3762 = 0;
        class137.field2677 = 0;
        class96.field1955 = 0;
        class37.field883 = 0;
        class80.field1726 = 0;
        class69.field1516 = 0;
        class137.field2672 = 0;
        class194.field3503 = 0;
        class78.field1701 = 0;
        class272.field4769 = 0;
        class50.field1125 = 0;
        class1.field3 = 0;
        class37.field882 = 0;
        class174.field3248 = 0;
        class48.field1089 = 0;
        class151.field2862 = 0;
        class195.field3510 = 0;
        class31.field723 = 0;
        class40.field941 = 0;
        class97.field1970 = 0;
        class78.field1697 = 0;
        class93.field1881 = 0;
        class185.field3401 = 0;
        class224.field4022 = 0;
        field381 = 0;
        class110.field2203 = 0;
        class41.field1010 = 0;
        class30.field575 = 0;
        class273.field4787 = 0;
        class13.field237 = 0;
        class189.field3448 = 0;
        class20.field370 = 0;
        class78.field1694 = 0;
        class130.field2557 = 0;
        class131.field2589 = 0;
        class65.field1432 = 0;
        class159.field2985 = 0;
        class234.field4169 = 0;
        class8.field122 = 0;
        class107.field2150 = 0;
        class174.field3251 = 0;
        class130.field2572 = 0;
        class224.field4014 = 0;
        class57.field1254 = 0;
        class86.field1768 = 0;
        class229.field4085 = 0;
        class9.field163 = 0;
        class212.field3822 = 0;
        class151.field2860 = 0;
        class99.field2020 = 0;
        class151.field2896 = 0;
        class30.field591 = 0;
        class183.field3360 = 0;
        class23.field438 = 0;
        class134.field2620 = 0;
        class30.field605 = 0;
        class32.field820 = 0;
        class179.field3325 = 0;
        class226.field4048 = 0;
        class3.field48 = 0;
        class69.field1539 = 0;
        class69.field1511 = 0;
        class8.field128 = 0;
        class121.field2383 = 0;
        class172.field3216 = 0;
        class50.field1121 = 0;
        class104.field2090 = 0;
        class254.field4488 = 0;
        class260.field4597 = 0;
        class241.field4329 = 0;
        class30.field604 = 0;
        class92.field1858 = 0;
        class5.field65 = 0;
        class71.field1596 = 0;
        class252.field4443 = 0;
        class97.field1976 = 0;
        class142.field2746 = 0;
        class266.field4690 = 0;
        class80.field1711 = 0;
        class61.field1320 = 0;
        class59.field1285 = 0;
        class30.field584 = 0;
        class68.field1485 = 0;
        class246.field4379 = 0;
        class69.field1530 = 0;
        class160.field3002 = 0;
        class146.field2795 = 0;
        class157.field2968 = 0;
        class241.field4321 = 0;
        class151.field2877 = 0;
        class114.field2265 = 0;
        class276.field4815 = 0;
        class60.field1296 = 0;
        class131.field2580 = 0;
        class99.field2006 = 0;
        class8.field156 = 0;
        class25.field471 = 0;
        class235.field4192 = 0;
        class138.field2692 = 0;
        class138.field2693 = 0;
        class216.field3946 = 0;
        class120.field2344 = 0;
        class96.field1964 = 0;
        class185.field3391 = 0;
        class105.field2121 = 0;
        field395 = 0;
        class69.field1517 = 0;
        class55.field1226 = 0;
        class31.field722 = 0;
        class30.field569 = 0;
        class243.field4344 = 0;
        class25.field485 = 0;
        class31.field730 = 0;
        class121.field2386 = 0;
        class219.field3954 = 0;
        class151.field2864 = 0;
        class46.field1063 = 0;
        class82.field1749 = 0;
        class15.field323 = 0;
        class211.field3810 = 0;
        class30.field592 = 0;
        class13.field259 = 0;
        class135.field2633 = 0;
        class46.field1067 = 0;
        class31.field795 = 0;
        class1.field18 = 0;
        class151.field2898 = 0;
        class77.field1684 = 0;
        class50.field1122 = 0;
        class195.field3531 = 0;
        class40.field973 = 0;
        class14.field313 = 0;
        client.field3785 = 0;
        class202.field3606 = 0;
        class70.field1582 = 0;
        class137.field2670 = 0;
        class14.field289 = 0;
        class175.field3262 = 0;
        class254.field4494 = 0;
        class37.field903 = 0;
        class37.field886 = 0;
        class88.field1797 = 0;
        class164.field3044 = 0;
        class174.field3245 = 0;
        class210.field3770 = 0;
        class14.field271 = 0;
        class257.field4528 = 0;
        class49.field1110 = 0;
        class30.field630 = 0;
        class224.field4010 = 0;
        class157.field2958 = 0;
        class55.field1228 = 0;
        class250.field4417 = 0;
        class185.field3385 = 0;
        class157.field2965 = 0;
        class99.field1995 = 0;
        class35.field850 = 0;
        class212.field3835 = 0;
        class69.field1501 = 0;
        class112.field2239 = 0;
        class14.field286 = 0;
        class167.field3070 = 0;
        class44.field1046 = 0;
        class150.field2855 = 0;
        class234.field4164 = 0;
        class231.field4102 = 0;
        class69.field1526 = 0;
        class17.field338 = 0;
        class43.field1030 = 0;
        class17.field350 = 0;
        class15.field321 = 0;
        class266.field4691 = 0;
        class193.field3495 = 0;
        class24.field455 = 0;
        class80.field1720 = 0;
        class194.field3501 = 0;
        class114.field2262 = 0;
        class130.field2554 = 0;
        class37.field896 = 0;
        class103.field2080 = 0;
        class236.field4219 = 0;
        class68.field1476 = 0;
        class3.field46 = 0;
        class131.field2578 = 0;
        class52.field1164 = 0;
        class65.field1438 = 0;
        class20.field378 = 0;
        class137.field2679 = 0;
        class65.field1433 = 0;
        class62.field1328 = 0;
        class17.field354 = 0;
        class247.field4399 = 0;
        class69.field1556 = 0;
        class108.field2176 = 0;
        class8.field153 = 0;
        class127.field2463 = 0;
        class170.field3197 = 0;
        class173.field3243 = 0;
        class99.field2000 = 0;
        class48.field1098 = 0;
        class159.field2999 = 0;
        class160.field3007 = 0;
        class93.field1888 = 0;
        class6.field84 = 0;
        class253.field4472 = 0;
        class48.field1086 = 0;
        class14.field300 = 0;
        class8.field155 = 0;
        class257.field4534 = 0;
        class194.field3504 = 0;
        class154.field2928 = 0;
        class2.field29 = 0;
        class69.field1544 = 0;
        class254.field4483 = 0;
        class94.field1908 = 0;
        class14.field291 = 0;
        class166.field3058 = 0;
        class2.field27 = 0;
        class151.field2902 = 0;
        class115.field2267 = 0;
        class69.field1547 = 0;
        class148.field2831 = 0;
        class63.field1342 = 0;
        class125.field2450 = 0;
        class30.field570 = 0;
        class151.field2900 = 0;
        class197.field3560 = 0;
        class250.field4427 = 0;
        class43.field1028 = 0;
        class194.field3498 = 0;
        class115.field2278 = 0;
        class8.field120 = 0;
        class257.field4537 = 0;
        class178.field3301 = 0;
        class44.field1040 = 0;
        class159.field2990 = 0;
        class173.field3231 = 0;
        class23.field436 = 0;
        class150.field2852 = 0;
        class96.field1947 = 0;
        class29.field554 = 0;
        class257.field4529 = 0;
        class24.field448 = 0;
        class268.field4726 = 0;
        class74.field1656 = 0;
        class201.field3590 = 0;
        class14.field284 = 0;
        class24.field456 = 0;
        class125.field2451 = 0;
        class186.field3426 = 0;
        class215.field3923 = 0;
        class110.field2217 = 0;
        class232.field4125 = 0;
        class185.field3382 = 0;
        class13.field250 = 0;
        class137.field2669 = 0;
        class107.field2162 = 0;
        class50.field1131 = 0;
        class6.field81 = 0;
        class175.field3264 = 0;
        class257.field4544 = 0;
        class110.field2205 = 0;
        class41.field1019 = 0;
        class50.field1133 = 0;
        class143.field2756 = 0;
        class235.field4210 = 0;
        class63.field1397 = 0;
        class107.field2137 = 0;
        class167.field3079 = 0;
        class259.field4586 = 0;
        class151.field2869 = 0;
        class108.field2180 = 0;
        class266.field4686 = 0;
        class211.field3812 = 0;
        class30.field574 = 0;
        class23.field432 = 0;
        class227.field4067 = 0;
        class59.field1287 = 0;
        class109.field2192 = 0;
        class138.field2681 = 0;
        class65.field1440 = 0;
        class8.field107 = 0;
        class121.field2377 = 0;
        class76.field1671 = 0;
        class138.field2691 = 0;
        class259.field4584 = 0;
        class169.field3175 = 0;
        class263.field4645 = 0;
        class29.field559 = 0;
        class8.field117 = 0;
        class180.field3334 = 0;
        class25.field480 = 0;
        class36.field880 = 0;
        class215.field3937 = 0;
        class112.field2236 = 0;
        class151.field2887 = 0;
        class63.field1348 = 0;
        class259.field4583 = 0;
        class232.field4131 = 0;
        class2.field35 = 0;
        class245.field4377 = 0;
        class186.field3422 = 0;
        class108.field2173 = 0;
        class32.field812 = 0;
        class23.field437 = 0;
        class5.field75 = 0;
        class55.field1206 = 0;
        class46.field1064 = 0;
        class238.field4233 = 0;
        class120.field2345 = 0;
        class96.field1966 = 0;
        class32.field809 = 0;
        class14.field269 = 0;
        class254.field4489 = 0;
        class136.field2661 = 0;
        class107.field2161 = 0;
        class8.field160 = 0;
        class220.field3974 = 0;
        class169.field3178 = 0;
        class24.field453 = 0;
        class246.field4381 = 0;
        class71.field1607 = 0;
        class30.field573 = 0;
        class100.field2044 = 0;
        class268.field4724 = 0;
        class226.field4041 = 0;
        class8.field151 = 0;
        class215.field3925 = 0;
        class4.field57 = 0;
        class266.field4697 = 0;
        class29.field561 = 0;
        class241.field4319 = 0;
        class14.field261 = 0;
        class229.field4086 = 0;
        class122.field2409 = 0;
        class196.field3550 = 0;
        class159.field2993 = 0;
        class276.field4811 = 0;
        class33.field835 = 0;
        class63.field1341 = 0;
        class8.field127 = 0;
        class173.field3228 = 0;
        class30.field601 = 0;
        class112.field2228 = 0;
        class114.field2253 = 0;
        class133.field2612 = 0;
        class48.field1093 = 0;
        class246.field4390 = 0;
        class57.field1245 = 0;
        class134.field2627 = 0;
        class268.field4712 = 0;
        class71.field1594 = 0;
        class90.field1810 = 0;
        class142.field2740 = 0;
        class211.field3806 = 0;
        class196.field3546 = 0;
        class227.field4052 = 0;
        class209.field3753 = 0;
        class174.field3249 = 0;
        class17.field349 = 0;
        class168.field3103 = 0;
        class33.field821 = 0;
        class105.field2119 = 0;
        client.field3797 = 0;
        class212.field3833 = 0;
        class105.field2112 = 0;
        class173.field3227 = 0;
        class120.field2347 = 0;
        class114.field2258 = 0;
        class30.field582 = 0;
        class247.field4393 = 0;
        class203.field3624 = 0;
        class48.field1102 = 0;
        class236.field4217 = 0;
        class92.field1860 = 0;
        class163.field3034 = 0;
        class104.field2096 = 0;
        class232.field4121 = 0;
        class59.field1284 = 0;
        class1.field5 = 0;
        class208.field3740 = 0;
        class176.field3267 = 0;
        class50.field1124 = 0;
        class31.field662 = 0;
        class41.field1015 = 0;
        class69.field1528 = 0;
        class78.field1693 = 0;
        class132.field2601 = 0;
        class169.field3170 = 0;
        class30.field589 = 0;
        class234.field4161 = 0;
        class210.field3779 = 0;
        class14.field293 = 0;
        class13.field245 = 0;
        class115.field2276 = 0;
        class151.field2889 = 0;
        class168.field3165 = 0;
        class226.field4046 = 0;
        class6.field86 = 0;
        class212.field3828 = 0;
        class11.field219 = 0;
        class256.field4513 = 0;
        class6.field79 = 0;
        class80.field1728 = 0;
        class5.field73 = 0;
        class249.field4406 = 0;
        client.field3795 = 0;
        class115.field2271 = 0;
        class14.field298 = 0;
        class185.field3402 = 0;
        class40.field979 = 0;
        class96.field1957 = 0;
        class69.field1569 = 0;
        class126.field2455 = 0;
        class30.field588 = 0;
        class47.field1085 = 0;
        class9.field166 = 0;
        class241.field4327 = 0;
        class23.field442 = 0;
        class30.field580 = 0;
        class260.field4605 = 0;
        class135.field2630 = 0;
        class134.field2626 = 0;
        class201.field3582 = 0;
        class30.field567 = 0;
        class150.field2848 = 0;
        class235.field4208 = 0;
        class251.field4434 = 0;
        class108.field2172 = 0;
        class113.field2250 = 0;
        class49.field1115 = 0;
        class149.field2835 = 0;
        class31.field753 = 0;
        class30.field590 = 0;
        class47.field1078 = 0;
        class242.field4334 = 0;
        class25.field472 = 0;
        class146.field2804 = 0;
        class193.field3487 = 0;
        class254.field4484 = 0;
        class77.field1682 = 0;
        class69.field1567 = 0;
        class97.field1971 = 0;
        class168.field3104 = 0;
        class81.field1738 = 0;
        class20.field375 = 0;
        class259.field4585 = 0;
        class40.field934 = 0;
        class185.field3404 = 0;
        class170.field3201 = 0;
        class50.field1134 = 0;
        class227.field4066 = 0;
        class67.field1474 = 0;
        class69.field1514 = 0;
        class31.field805 = 0;
        class266.field4687 = 0;
        class13.field243 = 0;
        class241.field4298 = 0;
        class154.field2920 = 0;
        class73.field1646 = 0;
        class170.field3188 = 0;
        class275.field4799 = 0;
        class30.field606 = 0;
        class8.field129 = 0;
        class147.field2816 = 0;
        class260.field4603 = 0;
        class185.field3394 = 0;
        class145.field2783 = 0;
        class138.field2689 = 0;
        class135.field2639 = 0;
        class241.field4301 = 0;
        class239.field4251 = 0;
        class3.field52 = 0;
        class8.field145 = 0;
        class99.field2005 = 0;
        class52.field1169 = 0;
        class241.field4303 = 0;
        class125.field2441 = 0;
        class151.field2870 = 0;
        class108.field2184 = 0;
        class234.field4157 = 0;
        class8.field150 = 0;
        class212.field3829 = 0;
        class268.field4723 = 0;
        client.field3790 = 0;
        class55.field1210 = 0;
        class259.field4591 = 0;
        class173.field3233 = 0;
        class229.field4080 = 0;
        class50.field1123 = 0;
        class223.field3998 = 0;
        class195.field3519 = 0;
        class228.field4077 = 0;
        class41.field1011 = 0;
        class30.field595 = 0;
        class20.field372 = 0;
        class6.field90 = 0;
        class275.field4802 = 0;
        class262.field4628 = 0;
        class49.field1117 = 0;
        class154.field2935 = 0;
        class102.field2066 = 0;
        class232.field4135 = 0;
        class259.field4587 = 0;
        class151.field2873 = 0;
        class126.field2454 = 0;
        class179.field3309 = 0;
        class14.field305 = 0;
        class23.field434 = 0;
        class11.field207 = 0;
        class87.field1783 = 0;
        class131.field2586 = 0;
        class157.field2954 = 0;
        class43.field1029 = 0;
        class31.field787 = 0;
        class8.field135 = 0;
        class185.field3398 = 0;
        class177.field3287 = 0;
        class224.field4011 = 0;
        class186.field3414 = 0;
        class253.field4473 = 0;
        class235.field4195 = 0;
        class257.field4550 = 0;
        class234.field4160 = 0;
        class159.field2988 = 0;
        class8.field140 = 0;
        class229.field4084 = 0;
        class99.field2026 = 0;
        class270.field4740 = 0;
        class22.field398 = 0;
        class31.field747 = 0;
        class229.field4083 = 0;
        class6.field89 = 0;
        class69.field1566 = 0;
        class132.field2591 = 0;
        class179.field3320 = 0;
        class8.field161 = 0;
        class1.field4 = 0;
        class11.field200 = 0;
        class243.field4340 = 0;
        class36.field873 = 0;
        class40.field948 = 0;
        class87.field1794 = 0;
        class106.field2129 = 0;
        class68.field1488 = 0;
        class98.field1986 = 0;
        class52.field1175 = 0;
        class154.field2938 = 0;
        class31.field801 = 0;
        class79.field1704 = 0;
        class63.field1361 = 0;
        class8.field144 = 0;
        class30.field597 = 0;
        class31.field645 = 0;
        class268.field4722 = 0;
        class210.field3778 = 0;
        class79.field1702 = 0;
        class142.field2739 = 0;
        class64.field1416 = 0;
        class212.field3832 = 0;
        class238.field4236 = 0;
        class14.field267 = 0;
        class159.field2982 = 0;
        class195.field3512 = 0;
        class253.field4471 = 0;
        class210.field3765 = 0;
        class190.field3458 = 0;
        class113.field2246 = 0;
        class100.field2033 = 0;
        class168.field3154 = 0;
        class260.field4594 = 0;
        class30.field621 = 0;
        class186.field3419 = 0;
        class251.field4435 = 0;
        class29.field548 = 0;
        class69.field1509 = 0;
        class136.field2658 = 0;
        class227.field4050 = 0;
        class23.field433 = 0;
        class157.field2962 = 0;
        class98.field1990 = 0;
        class30.field629 = 0;
        class232.field4123 = 0;
        class168.field3144 = 0;
        class167.field3087 = 0;
        class168.field3139 = 0;
        class130.field2568 = 0;
        client.field3794 = 0;
        class55.field1230 = 0;
        class55.field1221 = 0;
        class39.field929 = 0;
        class5.field74 = 0;
        class123.field2414 = 0;
        class37.field887 = 0;
        class2.field40 = 0;
        class108.field2187 = 0;
        class65.field1441 = 0;
        class30.field568 = 0;
        class1.field7 = 0;
        class96.field1946 = 0;
        class269.field4732 = 0;
        class229.field4081 = 0;
        class101.field2062 = 0;
        class157.field2959 = 0;
        class220.field3965 = 0;
        class114.field2264 = 0;
        class4.field62 = 0;
        class67.field1465 = 0;
        class174.field3252 = 0;
        class99.field1999 = 0;
        class212.field3820 = 0;
        class31.field745 = 0;
        class130.field2565 = 0;
        class235.field4199 = 0;
        class14.field268 = 0;
        class15.field318 = 0;
        class257.field4549 = 0;
        class9.field164 = 0;
        class268.field4725 = 0;
        class151.field2890 = 0;
        class142.field2744 = 0;
        class33.field832 = 0;
        class273.field4796 = 0;
        class71.field1606 = 0;
        class30.field611 = 0;
        class17.field348 = 0;
        class8.field158 = 0;
        class262.field4627 = 0;
        class204.field3638 = 0;
        class112.field2232 = 0;
        class33.field827 = 0;
        class40.field982 = 0;
        class144.field2771 = 0;
        class30.field571 = 0;
        class170.field3200 = 0;
        class172.field3221 = 0;
        class208.field3737 = 0;
        class59.field1282 = 0;
        class52.field1166 = 0;
        class50.field1126 = 0;
        class147.field2815 = 0;
        class249.field4414 = 0;
        class266.field4698 = 0;
        class195.field3518 = 0;
        class16.field328 = 0;
        class102.field2069 = 0;
        class270.field4745 = 0;
        class157.field2963 = 0;
        class169.field3173 = 0;
        class250.field4421 = 0;
        class79.field1706 = 0;
        class98.field1992 = 0;
        class178.field3300 = 0;
        class168.field3146 = 0;
        class1.field6 = 0;
        class14.field302 = 0;
        class94.field1900 = 0;
        class151.field2884 = 0;
        class30.field578 = 0;
        class253.field4474 = 0;
        class114.field2261 = 0;
        class178.field3293 = 0;
        class31.field714 = 0;
        class209.field3757 = 0;
        class99.field2008 = 0;
        class168.field3093 = 0;
        class107.field2154 = 0;
        class238.field4240 = 0;
        class88.field1802 = 0;
        class33.field829 = 0;
        class168.field3133 = 0;
        class22.field415 = 0;
        class108.field2174 = 0;
        class183.field3353 = 0;
        class273.field4785 = 0;
        class37.field891 = 0;
        class33.field831 = 0;
        class185.field3389 = 0;
        class37.field890 = 0;
        class37.field884 = 0;
        class235.field4180 = 0;
        class262.field4623 = 0;
        class30.field598 = 0;
        class227.field4062 = 0;
        class28.field510 = 0;
        class99.field2028 = 0;
        class24.field444 = 0;
        class122.field2397 = 0;
        class169.field3182 = 0;
        class221.field3986 = 0;
        class235.field4183 = 0;
        class47.field1068 = 0;
        class216.field3944 = 0;
        class17.field345 = 0;
        class236.field4216 = 0;
        class121.field2384 = 0;
        class54.field1192 = 0;
        class138.field2683 = 0;
        class255.field4500 = 0;
        class30.field625 = 0;
        class96.field1951 = 0;
        class154.field2918 = 0;
        class122.field2393 = 0;
        class235.field4209 = 0;
        class108.field2175 = 0;
        class104.field2100 = 0;
        class212.field3824 = 0;
        class189.field3445 = 0;
        class157.field2972 = 0;
        class93.field1865 = 0;
        class92.field1859 = 0;
        class121.field2387 = 0;
        class53.field1187 = 0;
        class254.field4481 = 0;
        class4.field61 = 0;
        class228.field4075 = 0;
        class227.field4056 = 0;
        class130.field2564 = 0;
        class100.field2036 = 0;
        class193.field3483 = 0;
        field386 = 0;
        class103.field2077 = 0;
        class110.field2212 = 0;
        class5.field69 = 0;
        class6.field80 = 0;
        class236.field4212 = 0;
        class226.field4047 = 0;
        class108.field2182 = 0;
        class28.field519 = 0;
        class8.field141 = 0;
        class273.field4781 = 0;
        class249.field4411 = 0;
        class20.field377 = 0;
        class23.field426 = 0;
        class99.field1996 = 0;
        class11.field197 = 0;
        class99.field2027 = 0;
        class53.field1183 = 0;
        class13.field248 = 0;
        class63.field1396 = 0;
        class137.field2675 = 0;
        class151.field2893 = 0;
        class270.field4748 = 0;
        class154.field2912 = 0;
        class226.field4043 = 0;
        class117.field2301 = 0;
        class57.field1253 = 0;
        class69.field1512 = 0;
        class40.field985 = 0;
        class142.field2738 = 0;
        class201.field3588 = 0;
        class30.field572 = 0;
        class164.field3042 = 0;
        class99.field2019 = 0;
        class221.field3982 = 0;
        class247.field4398 = 0;
        class6.field82 = 0;
        class120.field2369 = 0;
        class266.field4692 = 0;
        class55.field1229 = 0;
        class30.field624 = 0;
        class2.field38 = 0;
        class130.field2560 = 0;
        class69.field1563 = 0;
        class29.field550 = 0;
        class112.field2229 = 0;
        class202.field3613 = 0;
        class136.field2665 = 0;
        class65.field1434 = 0;
        class57.field1257 = 0;
        class120.field2364 = 0;
        class6.field83 = 0;
        class2.field24 = 0;
        class151.field2868 = 0;
        class205.field3668 = 0;
        class117.field2299 = 0;
        class256.field4520 = 0;
        class257.field4524 = 0;
        class224.field4012 = 0;
        class70.field1583 = 0;
        class259.field4575 = 0;
        class252.field4459 = 0;
        class277.field4828 = 0;
        class8.field133 = 0;
        class194.field3502 = 0;
        class96.field1952 = 0;
        class169.field3176 = 0;
        class31.field642 = 0;
        class101.field2059 = 0;
        class96.field1956 = 0;
        class30.field577 = 0;
        class57.field1249 = 0;
        class127.field2480 = 0;
        class94.field1899 = 0;
        class173.field3237 = 0;
        class47.field1080 = 0;
        class8.field142 = 0;
        class205.field3670 = 0;
        class138.field2684 = 0;
        class69.field1523 = 0;
        class185.field3388 = 0;
        class8.field149 = 0;
        class99.field2024 = 0;
        class139.field2718 = 0;
        class234.field4170 = 0;
        class150.field2851 = 0;
        class129.field2533 = 0;
        class87.field1781 = 0;
        class15.field325 = 0;
        class8.field159 = 0;
        class159.field2979 = 0;
        class8.field109 = 0;
        class150.field2853 = 0;
        class272.field4770 = 0;
        class212.field3827 = 0;
        class232.field4136 = 0;
        class69.field1537 = 0;
        class260.field4604 = 0;
        class104.field2094 = 0;
        class241.field4281 = 0;
        class1.field19 = 0;
        class60.field1304 = 0;
        class190.field3460 = 0;
        class76.field1679 = 0;
        class99.field2011 = 0;
        class70.field1581 = 0;
        class190.field3453 = 0;
        class196.field3553.field146 = 0;
        class59.field1289.field146 = 0;
        class107.field2152 = 0;
        for (int var1 = 0; var1 < class262.field4620.length; var1++) {
            class262.field4620[var1] = null;
        }
        class52.field1165 = 0;
        class94.field1890 = false;
        class194.method1404(-81, 0);
        for (int var2 = 0; var2 < 100; var2++) {
            class86.field1772[var2] = null;
        }
        class110.field2202 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        class236.field4222 = (int) (Math.random() * 80.0D) - 40;
        class50.field1139 = (int) (Math.random() * 30.0D) - 20;
        class139.field2719 = (int) (Math.random() * 100.0D) - 50;
        class132.field2607 = 0;
        class80.field1732 = 0;
        class221.field3985 = 0;
        class28.field528 = 0;
        class173.field3239 = 0;
        class175.field3258 = false;
        class219.field3957 = 0;
        class210.field3771 = 0;
        class132.field2602 = (int) (Math.random() * 110.0D) - 55;
        class233.field4153 = 0;
        class147.field2811 = (int) (Math.random() * 120.0D) - 60;
        class86.field1769 = -1;
        for (int var3 = 0; var3 < 2048; var3++) {
            class75.field1670[var3] = null;
            class106.field2124[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class125.field2443[var4] = null;
        }
        class247.field4394 = class75.field1670[2047] = new class120();
        class77.field1681.method480(74);
        class238.field4237.method480(22);
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var12 = 0; var12 < 104; var12++) {
                for (int var13 = 0; var13 < 104; var13++) {
                    class103.field2078[var5][var12][var13] = null;
                }
            }
        }
        class41.field1024 = new class48();
        class277.field4823 = 0;
        class117.field2307 = 0;
        class209.method1479(16);
        class273.method1864(30);
        class183.field3354 = 0;
        class223.field4002 = 0;
        class77.field1685 = 0;
        class143.field2768 = 0;
        class52.field1162 = 0;
        class71.field1599 = 0;
        class132.field2605 = 0;
        class142.field2750 = 0;
        class98.field1981 = 0;
        class53.field1185 = 0;
        for (int var6 = 0; var6 < class228.field4076.length; var6++) {
            class228.field4076[var6] = -1;
        }
        if (class196.field3548 != -1) {
            class43.method444(0, class196.field3548);
        }
        for (class180 var7 = (class180) class143.field2762.method1178(true); var7 != null; var7 = (class180) class143.field2762.method1176((byte) 22)) {
            class2.method13((byte) -73, true, var7);
        }
        class196.field3548 = -1;
        class143.field2762 = new class157(8);
        class231.method1638(7);
        class263.field4661 = null;
        class52.field1165 = 0;
        class94.field1890 = false;
        class185.field3380.method1328(0, new int[5], false, (int[]) null, -1);
        for (int var8 = 0; var8 < 8; var8++) {
            class157.field2956[var8] = null;
            class48.field1105[var8] = false;
        }
        class172.method1265(-120);
        class253.field4465 = true;
        for (int var9 = 0; var9 < 100; var9++) {
            class14.field288[var9] = true;
        }
        class244.field4366 = null;
        class148.field2825 = null;
        class122.field2405 = 0;
        for (int var10 = 0; var10 < 6; var10++) {
            class73.field1648[var10] = new class141();
        }
        for (int var11 = 0; var11 < 25; var11++) {
            class146.field2806[var11] = 0;
            class126.field2453[var11] = 0;
            class29.field557[var11] = 0;
        }
        class37.field899 = 0;
        class176.field3270 = class70.field1584 = class224.field4016 = class5.field64 = new short[256];
        class222.field3995 = true;
        class137.field2680 = false;
        class252.field4456 = class74.field1663;
        class31.method320(63);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Laa;B)V")
    public static final void method199(class8 arg0, byte arg1) {
        field386++;
        if ((arg0.field124.length - arg0.field146) < 1) {
            return;
        }
        int var2 = arg0.method63((byte) 86);
        if (var2 < 0 || var2 > 7) {
            return;
        }
        byte var3;
        if (var2 == 7) {
            var3 = 29;
        } else if (var2 == 6) {
            var3 = 28;
        } else if (var2 == 5) {
            var3 = 28;
        } else if (var2 == 4) {
            var3 = 24;
        } else if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if (var3 > (arg0.field124.length - arg0.field146)) {
            return;
        }
        class123.field2416 = arg0.method63((byte) 77);
        if (class123.field2416 < 1) {
            class123.field2416 = 1;
        } else if (class123.field2416 > 4) {
            class123.field2416 = 4;
        }
        class108.method858(arg0.method63((byte) 87) == 1, -27822);
        class238.field4243 = arg0.method63((byte) 53) == 1;
        class197.field3569 = arg0.method63((byte) 79) == 1;
        class185.field3392 = arg0.method63((byte) 111) == 1;
        class39.field928 = arg0.method63((byte) 75) == 1;
        class261.field4610 = arg0.method63((byte) 97) == 1;
        class104.field2102 = arg0.method63((byte) 54) == 1;
        class113.field2240 = arg0.method63((byte) 66) == 1;
        class22.field409 = arg0.method63((byte) 72);
        if (class22.field409 > 2) {
            class22.field409 = 2;
        }
        if (var2 < 2) {
            class209.field3755 = arg0.method63((byte) 126) == 1;
            arg0.method63((byte) 58);
        } else {
            class209.field3755 = arg0.method63((byte) 76) == 1;
        }
        class50.field1136 = arg0.method63((byte) 46) == 1;
        class177.field3277 = arg0.method63((byte) 52) == 1;
        class117.field2316 = arg0.method63((byte) 71);
        if (class117.field2316 > 2) {
            class117.field2316 = 2;
        }
        class142.field2749 = arg0.method63((byte) 56) == 1;
        class169.field3184 = arg0.method63((byte) 82);
        if (class169.field3184 > 127) {
            class169.field3184 = 127;
        }
        class246.field4382 = arg0.method63((byte) 123);
        class169.field3185 = arg0.method63((byte) 63);
        if (arg1 != 109) {
            field382 = -50;
        }
        if (class169.field3185 > 127) {
            class169.field3185 = 127;
        }
        if (var2 >= 1) {
            class224.field4020 = arg0.method65((byte) 126);
            class82.field1755 = arg0.method65((byte) 107);
        }
        if (var2 >= 3 && var2 < 6) {
            arg0.method63((byte) 49);
        }
        if (var2 >= 4) {
            arg0.method63((byte) 65);
        }
        if (var2 >= 5) {
            class90.field1818 = arg0.method70(arg1 + 65171);
        }
        if (var2 >= 6) {
            class40.field998 = arg0.method63((byte) 45);
        }
        if (var2 >= 7) {
            class180.field3333 = arg0.method63((byte) 86) == 1;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Z)V")
    public static final void method200(boolean arg0) {
        int var1 = 0;
        if (arg0) {
            return;
        }
        while (class168.field3158 > var1) {
            int var2 = class116.field2293[var1];
            class275 var3 = class125.field2443[var2];
            int var4 = class59.field1289.method63((byte) 54);
            if ((var4 & 0x8) != 0) {
                var3.field1384 = class59.field1289.method79(true);
                if (var3.field1384 == 65535) {
                    var3.field1384 = -1;
                }
            }
            if ((var4 & 0x40) != 0) {
                var3.field1345 = class59.field1289.method92(124);
                int var5 = class59.field1289.method99(false);
                if (var3.field1345 == 65535) {
                    var3.field1345 = -1;
                }
                var3.field1339 = (var5 & 0xFFFF) + class133.field2617;
                var3.field1369 = var5 >> 16;
                var3.field1346 = 0;
                var3.field1403 = 0;
                if (class133.field2617 < var3.field1339) {
                    var3.field1403 = -1;
                }
                if (var3.field1345 != -1 && class133.field2617 == var3.field1339) {
                    int var6 = class263.method1819(var3.field1345, -4).field460;
                    if (var6 != -1) {
                        class138 var7 = class193.method1396(-30590, var6);
                        if (var7 != null && var7.field2699 != null) {
                            class53.method518(var3.field1360, var3.field1336, -127, 0, var7, false);
                        }
                    }
                }
            }
            if ((var4 & 0x10) != 0) {
                int var8 = class59.field1289.method79(true);
                if (var8 == 65535) {
                    var8 = -1;
                }
                int var9 = class59.field1289.method54(102);
                class150.method1088(var3, var8, var9, 105);
            }
            if ((var4 & 0x2) != 0) {
                if (var3.field4805.method1698(true)) {
                    class143.method1062(false, var3);
                }
                var3.field4805 = class2.method14(false, class59.field1289.method92(118));
                var3.method567((byte) 108, var3.field4805.field4307);
                var3.field1376 = var3.field4805.field4308;
                var3.field1378 = var3.field4805.field4278;
                var3.field1399 = var3.field4805.field4313;
                var3.field1354 = var3.field4805.field4315;
                var3.field1409 = var3.field4805.field4261;
                var3.field1385 = var3.field4805.field4296;
                var3.field1392 = var3.field4805.field4290;
                var3.field1362 = var3.field4805.field4288;
                if (var3.field4805.method1698(true)) {
                    class195.method1410((class40) null, var3, 0, var3.field1372[0], class159.field2998, (byte) -97, var3.field1349[0], (class120) null);
                }
            }
            if ((var4 & 0x4) != 0) {
                int var10 = class59.field1289.method54(111);
                int var11 = class59.field1289.method54(57);
                var3.method571(class133.field2617, -111, var10, var11);
                var3.field1338 = class133.field2617 + 300;
                var3.field1377 = class59.field1289.method54(65);
            }
            if ((var4 & 0x80) != 0) {
                var3.field1357 = class59.field1289.method84(0);
                var3.field1374 = 100;
            }
            if ((var4 & 0x1) != 0) {
                var3.field1380 = class59.field1289.method79(true);
                var3.field1390 = class59.field1289.method79(!arg0);
            }
            if ((var4 & 0x20) != 0) {
                int var12 = class59.field1289.method77((byte) -49);
                int var13 = class59.field1289.method69(5002);
                var3.method571(class133.field2617, -105, var12, var13);
            }
            var1++;
        }
        field395++;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(BIIIILue;I)V")
    public static final void method201(byte arg0, int arg1, int arg2, int arg3, int arg4, class13 arg5, int arg6) {
        field393++;
        long var7 = 0L;
        int var9 = -122 / ((51 - arg0) / 35);
        boolean var10 = false;
        if (arg2 == 0) {
            var7 = class176.method1291(arg1, arg6, arg4);
        } else if (arg2 == 1) {
            var7 = class246.method1729(arg1, arg6, arg4);
        } else if (arg2 == 2) {
            var7 = class30.method259(arg1, arg6, arg4);
        } else if (arg2 == 3) {
            var7 = class275.method1868(arg1, arg6, arg4);
        }
        boolean var11 = true;
        int var12 = ((int) var7 & 0x7F9DA) >> 14;
        int var13 = Integer.MAX_VALUE & (int) (var7 >>> 32);
        boolean var14 = false;
        int var15 = (int) var7 >> 20 & 0x3;
        class40 var16 = class195.method1415(-128, var13);
        if (var16.method421(0)) {
            class175.method1287(var16, arg4, 124, arg6, arg1);
        }
        if (var7 == 0L) {
            return;
        }
        if (arg2 == 0) {
            class148.method1083(arg1, arg6, arg4);
            if (var16.field944 != 0) {
                arg5.method123(var12, arg4, var16.field981, 1, var15, arg6);
                return;
            }
            return;
        }
        if (arg2 == 1) {
            class86.method724(arg1, arg6, arg4);
            return;
        }
        if (arg2 == 2) {
            class136.method1027(arg1, arg6, arg4);
            if (var16.field944 != 0 && (var16.field937 + arg6) < 104 && (arg4 + var16.field937) < 104 && var16.field955 + arg6 < 104 && (var16.field955 + arg4) < 104) {
                arg5.method130(arg6, var16.field937, arg4, var16.field981, var16.field955, var15, -120);
                return;
            }
            return;
        }
        if (arg2 != 3) {
            return;
        }
        class144.method1065(arg1, arg6, arg4);
        if (var16.field944 == 1) {
            arg5.method135(arg6, (byte) -105, arg4);
            return;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V")
    public static void method202(int arg0) {
        field397 = null;
        if (arg0 != 18992) {
            method202(-44);
        }
        field390 = null;
        field396 = null;
    }
}
