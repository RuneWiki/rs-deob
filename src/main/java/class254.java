import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class254 extends class84 {

    @OriginalMember(owner = "client!o", name = "K", descriptor = "I")
    public int field3887 = -1;

    @OriginalMember(owner = "client!o", name = "S", descriptor = "I")
    public int field3895 = 12800;

    @OriginalMember(owner = "client!o", name = "J", descriptor = "I")
    public int field3886 = -1;

    @OriginalMember(owner = "client!o", name = "L", descriptor = "Z")
    public boolean field3888 = true;

    @OriginalMember(owner = "client!o", name = "Q", descriptor = "I")
    public int field3893 = 0;

    @OriginalMember(owner = "client!o", name = "G", descriptor = "I")
    public int field3883 = 12800;

    @OriginalMember(owner = "client!o", name = "bb", descriptor = "I")
    public int field3902 = 0;

    @OriginalMember(owner = "client!o", name = "N", descriptor = "I")
    public int field3890;

    @OriginalMember(owner = "client!o", name = "D", descriptor = "Ljava/lang/String;")
    public String field3880;

    @OriginalMember(owner = "client!o", name = "ab", descriptor = "Ljava/lang/String;")
    public String field3901;

    @OriginalMember(owner = "client!o", name = "M", descriptor = "I")
    public int field3889;

    @OriginalMember(owner = "client!o", name = "O", descriptor = "Lab;")
    public class148 field3891;

    @OriginalMember(owner = "client!o", name = "B", descriptor = "Ljava/lang/String;")
    public static String field3878 = "flash1:";

    @OriginalMember(owner = "client!o", name = "F", descriptor = "[Z")
    public static boolean[] field3882 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!o", name = "C", descriptor = "Ljava/lang/String;")
    public static String field3879 = "wishes to trade with you.";

    @OriginalMember(owner = "client!o", name = "Y", descriptor = "I")
    public static int field3899 = 0;

    @OriginalMember(owner = "client!o", name = "E", descriptor = "I")
    public static int field3881;

    @OriginalMember(owner = "client!o", name = "H", descriptor = "I")
    public static int field3884;

    @OriginalMember(owner = "client!o", name = "P", descriptor = "I")
    public static int field3892;

    @OriginalMember(owner = "client!o", name = "R", descriptor = "I")
    public static int field3894;

    @OriginalMember(owner = "client!o", name = "U", descriptor = "I")
    public static int field3896;

    @OriginalMember(owner = "client!o", name = "W", descriptor = "I")
    public static int field3897;

    @OriginalMember(owner = "client!o", name = "X", descriptor = "I")
    public static int field3898;

    @OriginalMember(owner = "client!o", name = "Z", descriptor = "I")
    public static int field3900;

    @OriginalMember(owner = "client!o", name = "I", descriptor = "Lfe;")
    public static class261 field3885;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIILsa;IJZ)Z")
    public static final boolean method1694(int arg0, int arg1, int arg2, int arg3, int arg4, class268 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class193.method1233(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "client!o", name = "h", descriptor = "(I)V")
    public static final void method1695(int arg0) {
        field3892++;
        if (arg0 != -7145) {
            field3879 = null;
        }
        class160.field2244.method544(false);
        class57.field819.method544(false);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(III)Lmd;")
    public static final class228 method1696(int arg0, int arg1, int arg2) {
        class89 var3 = class194.field2682[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class228 var4 = var3.field1235;
            var3.field1235 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BII)[I")
    public final int[] method1697(byte arg0, int arg1, int arg2) {
        field3896++;
        if (arg0 > -123) {
            field3878 = null;
        }
        for (class83 var4 = (class83) this.field3891.method990(-124); var4 != null; var4 = (class83) this.field3891.method993(-91)) {
            if (var4.method515(118, arg2, arg1)) {
                return var4.method522(arg2, arg1, 91);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!o", name = "i", descriptor = "(I)V")
    public static void method1698(int arg0) {
        field3885 = null;
        if (arg0 != -17368) {
            method1699((byte) 16, (String) null, (class211) null);
        }
        field3882 = null;
        field3879 = null;
        field3878 = null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BLjava/lang/String;Lse;)Ljava/lang/String;")
    public static final String method1699(byte arg0, String arg1, class211 arg2) {
        if (arg0 != 122) {
            method1695(87);
        }
        field3897++;
        if (arg1.indexOf("%") == -1) {
            return arg1;
        }
        while (true) {
            int var3 = arg1.indexOf("%1");
            if (var3 == -1) {
                while (true) {
                    int var4 = arg1.indexOf("%2");
                    if (var4 == -1) {
                        while (true) {
                            int var5 = arg1.indexOf("%3");
                            if (var5 == -1) {
                                while (true) {
                                    int var6 = arg1.indexOf("%4");
                                    if (var6 == -1) {
                                        while (true) {
                                            int var7 = arg1.indexOf("%5");
                                            if (var7 == -1) {
                                                while (true) {
                                                    int var8 = arg1.indexOf("%dns");
                                                    if (var8 == -1) {
                                                        return arg1;
                                                    }
                                                    String var9 = "";
                                                    if (class148.field2053 != null) {
                                                        if (class148.field2053.field1665 == null) {
                                                            var9 = class122.method802(class148.field2053.field1668, true);
                                                        } else {
                                                            var9 = (String) class148.field2053.field1665;
                                                        }
                                                    }
                                                    arg1 = arg1.substring(0, var8) + var9 + arg1.substring(var8 + 4);
                                                }
                                            }
                                            arg1 = arg1.substring(0, var7) + class154.method1026(class39.method255(arg2, 4, arg0 - 134), 0) + arg1.substring(var7 + 2);
                                        }
                                    }
                                    arg1 = arg1.substring(0, var6) + class154.method1026(class39.method255(arg2, 3, -12), 0) + arg1.substring(var6 + 2);
                                }
                            }
                            arg1 = arg1.substring(0, var5) + class154.method1026(class39.method255(arg2, 2, arg0 - 134), 0) + arg1.substring(var5 + 2);
                        }
                    }
                    arg1 = arg1.substring(0, var4) + class154.method1026(class39.method255(arg2, 1, -12), arg0 ^ 0x7A) + arg1.substring(var4 + 2);
                }
            }
            arg1 = arg1.substring(0, var3) + class154.method1026(class39.method255(arg2, 0, -12), 0) + arg1.substring(var3 + 2);
        }
    }

    @OriginalMember(owner = "client!o", name = "d", descriptor = "(B)V")
    public final void method1700(byte arg0) {
        field3898++;
        this.field3893 = 0;
        this.field3902 = 0;
        this.field3895 = 12800;
        this.field3883 = 12800;
        for (class83 var2 = (class83) this.field3891.method990(arg0 + 40); var2 != null; var2 = (class83) this.field3891.method993(-25)) {
            if (var2.field1125 > this.field3902) {
                this.field3902 = var2.field1125;
            }
            if (this.field3893 < var2.field1126) {
                this.field3893 = var2.field1126;
            }
            if (var2.field1122 < this.field3895) {
                this.field3895 = var2.field1122;
            }
            if (var2.field1128 < this.field3883) {
                this.field3883 = var2.field1128;
            }
        }
        if (arg0 != -118) {
            this.method1701(11, -31, 68, -40);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIII)[I")
    public final int[] method1701(int arg0, int arg1, int arg2, int arg3) {
        field3894++;
        int var5 = -121 / ((-arg0 - 25) / 46);
        for (class83 var6 = (class83) this.field3891.method990(-116); var6 != null; var6 = (class83) this.field3891.method993(-83)) {
            if (var6.method520(arg3, -109, arg1, arg2)) {
                return var6.method521(arg2, 8332, arg3);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIB)[I")
    public final int[] method1702(int arg0, int arg1, byte arg2) {
        field3881++;
        if (arg2 != -59) {
            this.method1700((byte) -41);
        }
        for (class83 var4 = (class83) this.field3891.method990(-125); var4 != null; var4 = (class83) this.field3891.method993(-72)) {
            if (var4.method517(arg0, (byte) -125, arg1)) {
                return var4.method521(arg1, arg2 ^ 0xFFFFDF49, arg0);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!o", name = "j", descriptor = "(I)V")
    public static final void method1703(int arg0) {
        class169.field2343 = true;
        class160.field2231 = 0L;
        class36.field553 = 0;
        class54.field784.field2791 = 0;
        class170.field2354 = true;
        class255.method1705(-1);
        class202.field2795 = 0;
        class281.field4359.field3402 = 0;
        class253.field3868 = -1;
        class214.field3226 = 0;
        class233.field3518.field3402 = 0;
        class261.field3946 = 0;
        class203.field2819 = -1;
        field3900++;
        class88.field1210 = -1;
        class206.field2869 = 0;
        class228.field3455 = 0;
        class218.field3286 = 0;
        class56.field805 = 0;
        class229.field3472 = 0;
        class286.field4509 = 0;
        class274.field4239 = 0;
        class248.field3797 = 0;
        class285.field4472 = 0;
        class268.field4108 = 0;
        class148.field2049 = 0;
        class127.field1795 = 0;
        class94.field1327 = 0;
        class41.field608 = 0;
        class32.field493 = 0;
        class232.field3513 = 0;
        class269.field4111 = 0;
        class139.field1938 = 0;
        class36.field557 = 0;
        class241.field3693 = 0;
        class7.field64 = 0;
        class235.field3539 = 0;
        class104.field1446 = 0;
        class224.field3349 = 0;
        class235.field3538 = 0;
        class197.field2730 = 0;
        class266.field4087 = 0;
        class278.field4303 = 0;
        class208.field2941 = 0;
        class269.field4131 = 0;
        class32.field452 = 0;
        class15.field156 = 0;
        class102.field1427 = 0;
        class154.field2139 = 0;
        class37.field566 = 0;
        class42.field634 = 0;
        class29.field395 = 0;
        class266.field3990 = 0;
        class132.field1861 = 0;
        class73.field1006 = 0;
        class208.field2955 = 0;
        class186.field2565 = 0;
        class167.field2298 = 0;
        class269.field4132 = 0;
        class137.field1920 = 0;
        class4.field28 = 0;
        class6.field50 = 0;
        class93.field1299 = 0;
        class179.field2511 = 0;
        class140.field1944 = 0;
        class136.field1899 = 0;
        class175.field2466 = 0;
        class118.field1671 = 0;
        class276.field4266 = 0;
        class253.field3865 = 0;
        class234.field3527 = 0;
        class65.field883 = 0;
        class16.field166 = 0;
        class21.field313 = 0;
        class21.field302 = 0;
        class116.field1655 = 0;
        class235.field3547 = 0;
        class277.field4289 = 0;
        class68.field918 = 0;
        class148.field2050 = 0;
        class123.field1722 = 0;
        class86.field1173 = 0;
        class282.field4369 = 0;
        client.field2196 = 0;
        class105.field1463 = 0;
        class217.field3276 = 0;
        class111.field1604 = 0;
        class219.field3298 = 0;
        class224.field3408 = 0;
        class279.field4326 = 0;
        class155.field2153 = 0;
        class169.field2341 = 0;
        class178.field2496 = 0;
        class96.field1352 = 0;
        class208.field2919 = 0;
        class208.field2952 = 0;
        class93.field1289 = 0;
        class188.field2594 = 0;
        class224.field3358 = 0;
        class224.field3367 = 0;
        class294.field4631 = 0;
        class94.field1311 = 0;
        class194.field2690 = 0;
        class154.field2147 = 0;
        class132.field1890 = 0;
        class238.field3610 = 0;
        class224.field3343 = 0;
        class210.field2996 = 0;
        class77.field1077 = 0;
        class211.field3164 = 0;
        class174.field2433 = 0;
        class153.field2128 = 0;
        class145.field2019 = 0;
        class32.field483 = 0;
        class17.field177 = 0;
        client.field2195 = 0;
        class100.field1395 = 0;
        class114.field1637 = 0;
        class264.field3967 = 0;
        class68.field930 = 0;
        class206.field2877 = 0;
        class215.field3247 = 0;
        class296.field4659 = 0;
        class164.field2279 = 0;
        class261.field3955 = 0;
        class257.field3931 = 0;
        class111.field1583 = 0;
        class203.field2835 = 0;
        class226.field3435 = 0;
        class10.field97 = 0;
        class238.field3613 = 0;
        class38.field572 = 0;
        class34.field526 = 0;
        class178.field2502 = 0;
        class225.field3420 = 0;
        class289.field4564 = 0;
        class29.field391 = 0;
        class172.field2390 = 0;
        class132.field1885 = 0;
        class132.field1881 = 0;
        class246.field3767 = 0;
        class49.field704 = 0;
        class230.field3483 = 0;
        class158.field2202 = 0;
        client.field2182 = 0;
        class174.field2436 = 0;
        class163.field2266 = 0;
        class208.field2925 = 0;
        class278.field4301 = 0;
        class241.field3688 = 0;
        class68.field919 = 0;
        class193.field2675 = 0;
        class17.field182 = 0;
        class245.field3739 = 0;
        class235.field3560 = 0;
        class158.field2200 = 0;
        class131.field1842 = 0;
        class208.field2931 = 0;
        class226.field3434 = 0;
        class285.field4463 = 0;
        class89.field1242 = 0;
        class32.field439 = 0;
        class146.field2027 = 0;
        class35.field537 = 0;
        class119.field1676 = 0;
        class241.field3687 = 0;
        class74.field1034 = 0;
        class93.field1302 = 0;
        class139.field1934 = 0;
        class252.field3853 = 0;
        class224.field3374 = 0;
        class103.field1440 = 0;
        class235.field3578 = 0;
        class150.field2077 = 0;
        class156.field2164 = 0;
        class297.field4684 = 0;
        class37.field564 = 0;
        class41.field609 = 0;
        class231.field3501 = 0;
        class110.field1528 = 0;
        class74.field1023 = 0;
        class203.field2820 = 0;
        class32.field462 = 0;
        class207.field2891 = 0;
        class7.field63 = 0;
        class39.field584 = 0;
        class241.field3689 = 0;
        class255.field3911 = 0;
        class127.field1793 = 0;
        class174.field2438 = 0;
        class212.field3198 = 0;
        class170.field2356 = 0;
        class235.field3571 = 0;
        class266.field4053 = 0;
        class210.field2998 = 0;
        class137.field1916 = 0;
        class34.field521 = 0;
        class235.field3550 = 0;
        class224.field3347 = 0;
        class281.field4346 = 0;
        class127.field1803 = 0;
        class127.field1808 = 0;
        class241.field3707 = 0;
        class174.field2451 = 0;
        class101.field1402 = 0;
        class132.field1866 = 0;
        class224.field3360 = 0;
        class208.field2908 = 0;
        class111.field1558 = 0;
        class249.field3814 = 0;
        class268.field4104 = 0;
        class8.field75 = 0;
        class275.field4248 = 0;
        class293.field4616 = 0;
        class143.field1978 = 0;
        class140.field1945 = 0;
        class34.field510 = 0;
        class171.field2379 = 0;
        class73.field1010 = 0;
        class68.field931 = 0;
        class86.field1170 = 0;
        class189.field2605 = 0;
        class16.field168 = 0;
        class135.field1898 = 0;
        class29.field399 = 0;
        class284.field4428 = 0;
        class224.field3356 = 0;
        class208.field2912 = 0;
        class155.field2155 = 0;
        class15.field148 = 0;
        class252.field3852 = 0;
        class108.field1511 = 0;
        class4.field25 = 0;
        class205.field2851 = 0;
        class284.field4434 = 0;
        class132.field1886 = 0;
        class224.field3355 = 0;
        client.field2187 = 0;
        class215.field3234 = 0;
        class289.field4561 = 0;
        class246.field3757 = 0;
        class160.field2235 = 0;
        class96.field1354 = 0;
        class37.field567 = 0;
        class143.field1982 = 0;
        class86.field1167 = 0;
        class277.field4293 = 0;
        class39.field578 = 0;
        class67.field907 = 0;
        class206.field2871 = 0;
        class295.field4645 = 0;
        class222.field3329 = 0;
        class293.field4620 = 0;
        class224.field3346 = 0;
        class224.field3359 = 0;
        class235.field3543 = 0;
        class205.field2852 = 0;
        class191.field2648 = 0;
        class120.field1684 = 0;
        class235.field3567 = 0;
        class174.field2441 = 0;
        class111.field1578 = 0;
        class208.field2945 = 0;
        class257.field3929 = 0;
        class160.field2240 = 0;
        class264.field3962 = 0;
        class94.field1320 = 0;
        class129.field1829 = 0;
        class186.field2570 = 0;
        class93.field1297 = 0;
        class221.field3316 = 0;
        class224.field3338 = 0;
        class77.field1071 = 0;
        class200.field2782 = 0;
        class129.field1827 = 0;
        class89.field1234 = 0;
        class287.field4530 = 0;
        class56.field811 = 0;
        class73.field1001 = 0;
        class214.field3227 = 0;
        class268.field4109 = 0;
        class264.field3968 = 0;
        class174.field2443 = 0;
        class21.field310 = 0;
        class36.field555 = 0;
        class149.field2064 = 0;
        class59.field837 = 0;
        class236.field3590 = 0;
        class208.field2938 = 0;
        class67.field905 = 0;
        class74.field1031 = 0;
        class132.field1876 = 0;
        class216.field3258 = 0;
        class268.field4101 = 0;
        class250.field3832 = 0;
        class285.field4462 = 0;
        class188.field2597 = 0;
        class224.field3393 = 0;
        class170.field2357 = 0;
        class136.field1904 = 0;
        class281.field4355 = 0;
        class224.field3370 = 0;
        class184.field2548 = 0;
        class203.field2832 = 0;
        class284.field4422 = 0;
        class247.field3783 = 0;
        class273.field4215 = 0;
        class57.field812 = 0;
        class44.field666 = 0;
        class87.field1188 = 0;
        class233.field3515 = 0;
        class168.field2311 = 0;
        class214.field3214 = 0;
        class247.field3787 = 0;
        class212.field3192 = 0;
        class274.field4234 = 0;
        class273.field4219 = 0;
        class159.field2216 = 0;
        class214.field3217 = 0;
        class241.field3709 = 0;
        class280.field4335 = 0;
        class286.field4518 = 0;
        class224.field3357 = 0;
        class280.field4342 = 0;
        class246.field3761 = 0;
        class94.field1313 = 0;
        class186.field2560 = 0;
        class71.field979 = 0;
        class65.field886 = 0;
        class163.field2262 = 0;
        class73.field1017 = 0;
        class160.field2239 = 0;
        class79.field1098 = 0;
        class224.field3354 = 0;
        class230.field3482 = 0;
        class32.field488 = 0;
        class132.field1856 = 0;
        class191.field2641 = 0;
        class286.field4488 = 0;
        class180.field2517 = 0;
        class281.field4351 = 0;
        class73.field1019 = 0;
        class111.field1606 = 0;
        class81.field1108 = 0;
        field3881 = 0;
        class253.field3863 = 0;
        class202.field2800 = 0;
        class193.field2674 = 0;
        class94.field1328 = 0;
        class94.field1315 = 0;
        class148.field2045 = 0;
        class37.field561 = 0;
        class53.field767 = 0;
        class93.field1295 = 0;
        class278.field4302 = 0;
        class208.field2922 = 0;
        class116.field1658 = 0;
        class214.field3219 = 0;
        class122.field1696 = 0;
        class129.field1826 = 0;
        class241.field3705 = 0;
        class43.field644 = 0;
        class184.field2546 = 0;
        class32.field450 = 0;
        class153.field2124 = 0;
        class232.field3512 = 0;
        class203.field2815 = 0;
        class168.field2329 = 0;
        class40.field596 = 0;
        class54.field782 = 0;
        class47.field686 = 0;
        class104.field1456 = 0;
        class136.field1909 = 0;
        class140.field1955 = 0;
        class17.field173 = 0;
        class232.field3511 = 0;
        class189.field2615 = 0;
        class193.field2670 = 0;
        class246.field3752 = 0;
        class39.field577 = 0;
        class127.field1797 = 0;
        class273.field4214 = 0;
        class221.field3311 = 0;
        class228.field3448 = 0;
        class235.field3556 = 0;
        class151.field2102 = 0;
        class194.field2692 = 0;
        class124.field1742 = 0;
        class257.field3923 = 0;
        class188.field2592 = 0;
        class245.field3746 = 0;
        class171.field2366 = 0;
        class8.field74 = 0;
        class156.field2165 = 0;
        class293.field4600 = 0;
        class127.field1801 = 0;
        class83.field1131 = 0;
        class227.field3443 = 0;
        class218.field3285 = 0;
        class172.field2396 = 0;
        class165.field2285 = 0;
        class278.field4314 = 0;
        class249.field3825 = 0;
        class169.field2345 = 0;
        class224.field3376 = 0;
        class276.field4281 = 0;
        class276.field4283 = 0;
        class229.field3468 = 0;
        class210.field2997 = 0;
        class286.field4513 = 0;
        class101.field1424 = 0;
        class168.field2307 = 0;
        class8.field67 = 0;
        class75.field1042 = 0;
        class121.field1692 = 0;
        class224.field3390 = 0;
        class21.field312 = 0;
        class200.field2785 = 0;
        class6.field46 = 0;
        class168.field2325 = 0;
        class75.field1050 = 0;
        class290.field4578 = 0;
        class34.field516 = 0;
        class221.field3307 = 0;
        class35.field539 = 0;
        class228.field3449 = 0;
        class63.field866 = 0;
        class148.field2051 = 0;
        class180.field2528 = 0;
        class224.field3372 = 0;
        class289.field4560 = 0;
        class206.field2879 = 0;
        class282.field4366 = 0;
        class165.field2288 = 0;
        class290.field4576 = 0;
        class195.field2693 = 0;
        class284.field4443 = 0;
        class96.field1356 = 0;
        class136.field1906 = 0;
        class75.field1047 = 0;
        class22.field320 = 0;
        class132.field1879 = 0;
        class286.field4482 = 0;
        class179.field2504 = 0;
        class4.field32 = 0;
        class208.field2918 = 0;
        class284.field4452 = 0;
        class88.field1215 = 0;
        class154.field2132 = 0;
        class82.field1115 = 0;
        class59.field831 = 0;
        class208.field2903 = 0;
        class65.field887 = 0;
        class178.field2498 = 0;
        class42.field629 = 0;
        class199.field2776 = 0;
        class206.field2876 = 0;
        class295.field4640 = 0;
        class249.field3816 = 0;
        class7.field58 = 0;
        class149.field2062 = 0;
        class151.field2085 = 0;
        class137.field1922 = 0;
        class29.field398 = 0;
        field3897 = 0;
        class4.field27 = 0;
        class282.field4372 = 0;
        class101.field1409 = 0;
        class108.field1502 = 0;
        class132.field1869 = 0;
        class77.field1072 = 0;
        class246.field3765 = 0;
        class206.field2867 = 0;
        class32.field453 = 0;
        class225.field3415 = 0;
        class39.field585 = 0;
        class140.field1942 = 0;
        class274.field4246 = 0;
        class206.field2881 = 0;
        class151.field2108 = 0;
        class156.field2179 = 0;
        class144.field1999 = 0;
        class149.field2063 = 0;
        class170.field2359 = 0;
        class224.field3353 = 0;
        class32.field469 = 0;
        class140.field1950 = 0;
        class23.field327 = 0;
        class197.field2728 = 0;
        class142.field1973 = 0;
        class21.field303 = 0;
        class50.field725 = 0;
        class83.field1135 = 0;
        class123.field1729 = 0;
        class132.field1880 = 0;
        class12.field120 = 0;
        class224.field3369 = 0;
        class38.field570 = 0;
        class188.field2596 = 0;
        class286.field4510 = 0;
        class148.field2052 = 0;
        class142.field1968 = 0;
        class48.field697 = 0;
        class273.field4201 = 0;
        class66.field903 = 0;
        class48.field695 = 0;
        class173.field2401 = 0;
        class286.field4499 = 0;
        class208.field2948 = 0;
        class101.field1412 = 0;
        class184.field2555 = 0;
        class149.field2067 = 0;
        class171.field2371 = 0;
        class175.field2467 = 0;
        class53.field775 = 0;
        class110.field1530 = 0;
        class62.field862 = 0;
        class211.field3029 = 0;
        class127.field1799 = 0;
        class163.field2267 = 0;
        class77.field1076 = 0;
        class154.field2146 = 0;
        class250.field3831 = 0;
        class268.field4103 = 0;
        class257.field3932 = 0;
        class143.field1988 = 0;
        class211.field3114 = 0;
        class2.field11 = 0;
        class195.field2694 = 0;
        class224.field3375 = 0;
        class123.field1717 = 0;
        client.field2184 = 0;
        class88.field1189 = 0;
        class245.field3748 = 0;
        class224.field3368 = 0;
        class269.field4130 = 0;
        class197.field2737 = 0;
        class104.field1444 = 0;
        class76.field1057 = 0;
        class1.field7 = 0;
        class274.field4230 = 0;
        client.field2188 = 0;
        class27.field354 = 0;
        class15.field157 = 0;
        class255.field3904 = 0;
        class266.field4082 = 0;
        class208.field2944 = 0;
        class285.field4473 = 0;
        class4.field23 = 0;
        class170.field2353 = 0;
        class248.field3800 = 0;
        class32.field492 = 0;
        class251.field3837 = 0;
        class282.field4365 = 0;
        class224.field3377 = 0;
        class44.field661 = 0;
        class95.field1345 = 0;
        class238.field3608 = 0;
        class6.field51 = 0;
        class75.field1048 = 0;
        class273.field4225 = 0;
        class85.field1159 = 0;
        class283.field4385 = 0;
        class253.field3867 = 0;
        class224.field3404 = 0;
        class204.field2838 = 0;
        class215.field3246 = 0;
        class208.field2961 = 0;
        class9.field83 = 0;
        class224.field3362 = 0;
        class230.field3490 = 0;
        class94.field1316 = 0;
        class108.field1507 = 0;
        class146.field2035 = 0;
        class159.field2215 = 0;
        class13.field136 = 0;
        class74.field1025 = 0;
        class211.field3082 = 0;
        class175.field2468 = 0;
        class224.field3403 = 0;
        class35.field547 = 0;
        class27.field349 = 0;
        class283.field4386 = 0;
        class13.field126 = 0;
        class224.field3361 = 0;
        class27.field355 = 0;
        class292.field4591 = 0;
        class233.field3517 = 0;
        class294.field4623 = 0;
        class261.field3953 = 0;
        class280.field4340 = 0;
        class46.field675 = 0;
        class278.field4310 = 0;
        class224.field3348 = 0;
        class265.field3977 = 0;
        class42.field639 = 0;
        class225.field3425 = 0;
        class74.field1037 = 0;
        class179.field2512 = 0;
        class123.field1731 = 0;
        class278.field4300 = 0;
        class34.field512 = 0;
        class266.field4011 = 0;
        class132.field1882 = 0;
        class110.field1523 = 0;
        class214.field3221 = 0;
        class224.field3373 = 0;
        class212.field3183 = 0;
        class139.field1932 = 0;
        class154.field2140 = 0;
        class200.field2783 = 0;
        class123.field1715 = 0;
        class246.field3774 = 0;
        class104.field1452 = 0;
        class172.field2381 = 0;
        class29.field376 = 0;
        class101.field1407 = 0;
        client.field2189 = 0;
        class47.field693 = 0;
        class210.field3003 = 0;
        class204.field2836 = 0;
        class88.field1201 = 0;
        class111.field1564 = 0;
        class181.field2532 = 0;
        class120.field1689 = 0;
        field3898 = 0;
        class68.field921 = 0;
        class50.field722 = 0;
        class167.field2294 = 0;
        class60.field849 = 0;
        class4.field35 = 0;
        class212.field3188 = 0;
        class108.field1504 = 0;
        class21.field306 = 0;
        class266.field4018 = 0;
        class249.field3808 = 0;
        class224.field3399 = 0;
        class84.field1145 = 0;
        class225.field3421 = 0;
        class206.field2878 = 0;
        class295.field4650 = 0;
        class179.field2507 = 0;
        class54.field779 = 0;
        class224.field3391 = 0;
        class155.field2154 = 0;
        class111.field1553 = 0;
        class37.field563 = 0;
        class224.field3381 = 0;
        class29.field401 = 0;
        class76.field1062 = 0;
        class251.field3842 = 0;
        class230.field3488 = 0;
        class293.field4615 = 0;
        class165.field2287 = 0;
        class208.field2932 = 0;
        class189.field2614 = 0;
        class132.field1868 = 0;
        class265.field3980 = 0;
        class276.field4277 = 0;
        class175.field2469 = 0;
        class4.field31 = 0;
        class273.field4218 = 0;
        class21.field314 = 0;
        class8.field72 = 0;
        class40.field594 = 0;
        class148.field2046 = 0;
        class145.field2021 = 0;
        class289.field4558 = 0;
        class180.field2524 = 0;
        class235.field3549 = 0;
        class229.field3474 = 0;
        class293.field4606 = 0;
        class92.field1281 = 0;
        class47.field688 = 0;
        class52.field755 = 0;
        class32.field482 = 0;
        class116.field1646 = 0;
        class111.field1595 = 0;
        class92.field1278 = 0;
        class222.field3327 = 0;
        class42.field622 = 0;
        class224.field3339 = 0;
        class88.field1211 = 0;
        class100.field1397 = 0;
        class88.field1214 = 0;
        class204.field2839 = 0;
        class123.field1734 = 0;
        class269.field4128 = 0;
        class224.field3383 = 0;
        class269.field4121 = 0;
        class111.field1603 = 0;
        class257.field3930 = 0;
        class230.field3479 = 0;
        class294.field4632 = 0;
        class288.field4552 = 0;
        class208.field2950 = 0;
        class116.field1651 = 0;
        class76.field1065 = 0;
        class111.field1541 = 0;
        class68.field933 = 0;
        class32.field461 = 0;
        class188.field2595 = 0;
        client.field2193 = 0;
        class84.field1150 = 0;
        class224.field3395 = 0;
        class77.field1080 = 0;
        class73.field1018 = 0;
        class211.field3032 = 0;
        class270.field4138 = 0;
        class270.field4137 = 0;
        class132.field1855 = 0;
        class132.field1859 = 0;
        class88.field1199 = 0;
        class193.field2660 = 0;
        class148.field2058 = 0;
        class95.field1342 = 0;
        class208.field2904 = 0;
        class235.field3566 = 0;
        class297.field4680 = 0;
        class228.field3454 = 0;
        class212.field3199 = 0;
        class213.field3201 = 0;
        class69.field937 = 0;
        class211.field3145 = 0;
        class59.field841 = 0;
        class29.field404 = 0;
        class94.field1322 = 0;
        class203.field2829 = 0;
        class16.field163 = 0;
        class144.field2011 = 0;
        class191.field2631 = 0;
        class132.field1889 = 0;
        class198.field2755 = 0;
        class288.field4554 = 0;
        class101.field1414 = 0;
        class274.field4229 = 0;
        class22.field321 = 0;
        class33.field507 = 0;
        class66.field897 = 0;
        class9.field77 = 0;
        class73.field1014 = 0;
        class29.field389 = 0;
        class216.field3263 = 0;
        class180.field2526 = 0;
        class116.field1653 = 0;
        class132.field1887 = 0;
        class4.field30 = 0;
        class148.field2047 = 0;
        class292.field4593 = 0;
        class211.field3059 = 0;
        class266.field4036 = 0;
        class257.field3933 = 0;
        class210.field2999 = 0;
        class203.field2822 = 0;
        class256.field3918 = 0;
        class170.field2364 = 0;
        class174.field2447 = 0;
        class235.field3575 = 0;
        class273.field4209 = 0;
        class48.field699 = 0;
        class235.field3544 = 0;
        class212.field3194 = 0;
        class47.field684 = 0;
        class142.field1966 = 0;
        class269.field4117 = 0;
        class111.field1619 = 0;
        class19.field274 = 0;
        class16.field165 = 0;
        class293.field4611 = 0;
        class107.field1498 = 0;
        class137.field1912 = 0;
        class171.field2376 = 0;
        class266.field4069 = 0;
        class148.field2057 = 0;
        class88.field1195 = 0;
        class34.field517 = 0;
        class22.field318 = 0;
        class136.field1908 = 0;
        class4.field36 = 0;
        class35.field549 = 0;
        class124.field1739 = 0;
        class139.field1937 = 0;
        class132.field1864 = 0;
        class176.field2473 = 0;
        class137.field1923 = 0;
        class127.field1789 = 0;
        class35.field551 = 0;
        class127.field1784 = 0;
        class236.field3588 = 0;
        class280.field4332 = 0;
        class237.field3599 = 0;
        class42.field621 = 0;
        class101.field1403 = 0;
        class288.field4556 = 0;
        class154.field2145 = 0;
        class61.field851 = 0;
        class102.field1426 = 0;
        class235.field3557 = 0;
        class176.field2474 = 0;
        class74.field1021 = 0;
        class51.field732 = 0;
        class140.field1952 = 0;
        class145.field2017 = 0;
        class13.field134 = 0;
        class224.field3340 = 0;
        class137.field1915 = 0;
        class281.field4358 = 0;
        class6.field53 = 0;
        class193.field2665 = 0;
        class59.field836 = 0;
        class73.field1008 = 0;
        class53.field771 = 0;
        class256.field3917 = 0;
        class224.field3342 = 0;
        class199.field2772 = 0;
        class293.field4602 = 0;
        class42.field623 = 0;
        class93.field1288 = 0;
        class148.field2043 = 0;
        class281.field4348 = 0;
        class239.field3648 = 0;
        class276.field4276 = 0;
        class67.field904 = 0;
        class213.field3205 = 0;
        class71.field984 = 0;
        class288.field4555 = 0;
        class107.field1489 = 0;
        class293.field4608 = 0;
        class274.field4232 = 0;
        class297.field4698 = 0;
        class29.field380 = 0;
        class52.field756 = 0;
        class17.field180 = 0;
        class53.field776 = 0;
        class141.field1959 = 0;
        class56.field801 = 0;
        class245.field3738 = 0;
        class208.field2897 = 0;
        class94.field1325 = 0;
        class144.field2009 = 0;
        class293.field4618 = 0;
        class286.field4495 = 0;
        class219.field3300 = 0;
        class197.field2732 = 0;
        class167.field2302 = 0;
        class204.field2841 = 0;
        class51.field731 = 0;
        class74.field1030 = 0;
        class212.field3185 = 0;
        class167.field2292 = 0;
        class21.field315 = 0;
        class235.field3579 = 0;
        class252.field3850 = 0;
        class159.field2220 = 0;
        class127.field1780 = 0;
        class21.field297 = 0;
        class216.field3256 = 0;
        class208.field2959 = 0;
        class216.field3265 = 0;
        class22.field316 = 0;
        class236.field3593 = 0;
        class221.field3318 = 0;
        class247.field3791 = 0;
        class144.field2004 = 0;
        class21.field308 = 0;
        class253.field3869 = 0;
        class124.field1741 = 0;
        class174.field2445 = 0;
        class54.field786 = 0;
        class295.field4653 = 0;
        class214.field3213 = 0;
        class159.field2213 = 0;
        class86.field1178 = 0;
        class281.field4350 = 0;
        class87.field1184 = 0;
        class125.field1752 = 0;
        class16.field158 = 0;
        class39.field586 = 0;
        class249.field3822 = 0;
        class181.field2542 = 0;
        class249.field3819 = 0;
        class265.field3981 = 0;
        class13.field131 = 0;
        class69.field939 = 0;
        class208.field2913 = 0;
        class236.field3591 = 0;
        class154.field2144 = 0;
        class50.field721 = 0;
        class28.field365 = 0;
        class78.field1086 = 0;
        class71.field976 = 0;
        class151.field2084 = 0;
        class167.field2296 = 0;
        class136.field1900 = 0;
        class88.field1220 = 0;
        class211.field3140 = 0;
        class137.field1913 = 0;
        class54.field777 = 0;
        class9.field82 = 0;
        class13.field135 = 0;
        class150.field2073 = 0;
        class174.field2456 = 0;
        class132.field1858 = 0;
        class63.field863 = 0;
        class234.field3532 = 0;
        class62.field856 = 0;
        class63.field865 = 0;
        class246.field3751 = 0;
        class77.field1081 = 0;
        class284.field4444 = 0;
        class207.field2886 = 0;
        class1.field8 = 0;
        class284.field4400 = 0;
        class208.field2921 = 0;
        class264.field3970 = 0;
        class88.field1219 = 0;
        class101.field1408 = 0;
        class269.field4112 = 0;
        class79.field1094 = 0;
        class32.field495 = 0;
        class42.field631 = 0;
        class40.field602 = 0;
        class191.field2632 = 0;
        class163.field2260 = 0;
        class95.field1347 = 0;
        class174.field2457 = 0;
        class36.field559 = 0;
        class94.field1321 = 0;
        class203.field2823 = 0;
        class251.field3843 = 0;
        class290.field4580 = 0;
        class94.field1323 = 0;
        class10.field101 = 0;
        class208.field2929 = 0;
        class53.field772 = 0;
        class145.field2022 = 0;
        class290.field4573 = 0;
        class150.field2070 = 0;
        class83.field1124 = 0;
        class143.field1977 = 0;
        class119.field1680 = 0;
        class174.field2452 = 0;
        class191.field2633 = 0;
        class224.field3389 = 0;
        class266.field4073 = 0;
        class68.field915 = 0;
        class108.field1508 = 0;
        class47.field685 = 0;
        class40.field600 = 0;
        class42.field632 = 0;
        class205.field2858 = 0;
        class235.field3562 = 0;
        class127.field1804 = 0;
        class132.field1884 = 0;
        class10.field99 = 0;
        class20.field289 = 0;
        class187.field2584 = 0;
        class93.field1301 = 0;
        class246.field3758 = 0;
        class16.field171 = 0;
        class235.field3551 = 0;
        class132.field1857 = 0;
        class287.field4537 = 0;
        class274.field4244 = 0;
        class222.field3326 = 0;
        class227.field3438 = 0;
        class53.field769 = 0;
        class168.field2323 = 0;
        class206.field2866 = 0;
        class140.field1954 = 0;
        class74.field1036 = 0;
        class168.field2304 = 0;
        class31.field418 = 0;
        class163.field2265 = 0;
        class148.field2044 = 0;
        client.field2192 = 0;
        class17.field175 = 0;
        class140.field1949 = 0;
        class165.field2284 = 0;
        class224.field3387 = 0;
        class74.field1024 = 0;
        class234.field3525 = 0;
        class140.field1947 = 0;
        class1.field3 = 0;
        class234.field3536 = 0;
        field3894 = 0;
        class193.field2672 = 0;
        class142.field1965 = 0;
        class224.field3351 = 0;
        class169.field2344 = 0;
        class35.field541 = 0;
        class198.field2751 = 0;
        class6.field45 = 0;
        class68.field928 = 0;
        class122.field1694 = 0;
        class203.field2824 = 0;
        class40.field597 = 0;
        class132.field1863 = 0;
        class203.field2827 = 0;
        class281.field4353 = 0;
        class241.field3698 = 0;
        class156.field2171 = 0;
        class199.field2773 = 0;
        class219.field3295 = 0;
        class208.field2930 = 0;
        class179.field2510 = 0;
        class219.field3297 = 0;
        class28.field368 = 0;
        class211.field3133 = 0;
        class237.field3601 = 0;
        class95.field1344 = 0;
        class87.field1187 = 0;
        class79.field1095 = 0;
        class235.field3542 = 0;
        class275.field4252 = 0;
        class114.field1636 = 0;
        class225.field3423 = 0;
        class28.field360 = 0;
        class94.field1310 = 0;
        class21.field304 = 0;
        class137.field1914 = 0;
        class206.field2870 = 0;
        class229.field3469 = 0;
        class144.field2008 = 0;
        class248.field3796 = 0;
        class292.field4585 = 0;
        class275.field4249 = 0;
        class15.field152 = 0;
        class123.field1711 = 0;
        class240.field3664 = 0;
        class144.field2013 = 0;
        class241.field3691 = 0;
        class101.field1411 = 0;
        class241.field3690 = 0;
        class266.field4004 = 0;
        class28.field372 = 0;
        class295.field4638 = 0;
        class296.field4662 = 0;
        class116.field1647 = 0;
        class53.field770 = 0;
        class208.field2896 = 0;
        class184.field2552 = 0;
        class110.field1535 = 0;
        class86.field1163 = 0;
        class284.field4391 = 0;
        class286.field4503 = 0;
        class9.field89 = 0;
        class10.field95 = 0;
        class9.field76 = 0;
        class172.field2383 = 0;
        class297.field4692 = 0;
        class139.field1935 = 0;
        class121.field1693 = 0;
        class188.field2593 = 0;
        class280.field4331 = 0;
        class9.field81 = 0;
        class181.field2538 = 0;
        class120.field1687 = 0;
        class290.field4569 = 0;
        class16.field162 = 0;
        class111.field1546 = 0;
        class86.field1175 = 0;
        class240.field3654 = 0;
        class104.field1447 = 0;
        class122.field1697 = 0;
        class297.field4682 = 0;
        class129.field1824 = 0;
        class247.field3785 = 0;
        class211.field3008 = 0;
        class240.field3684 = 0;
        class282.field4363 = 0;
        class241.field3699 = 0;
        class20.field287 = 0;
        class231.field3499 = 0;
        class208.field2940 = 0;
        client.field2190 = 0;
        class85.field1160 = 0;
        class173.field2402 = 0;
        class39.field592 = 0;
        class269.field4115 = 0;
        class77.field1070 = 0;
        class41.field610 = 0;
        class44.field665 = 0;
        class44.field663 = 0;
        class27.field356 = 0;
        class215.field3236 = 0;
        class224.field3401 = 0;
        class123.field1737 = 0;
        class150.field2071 = 0;
        class172.field2391 = 0;
        class278.field4299 = 0;
        class88.field1203 = 0;
        class5.field39 = 0;
        class202.field2813 = 0;
        class148.field2055 = 0;
        client.field2183 = 0;
        class283.field4378 = 0;
        class104.field1453 = 0;
        class208.field2958 = 0;
        class132.field1877 = 0;
        class274.field4237 = 0;
        field3896 = 0;
        class276.field4279 = 0;
        class101.field1416 = 0;
        client.field2191 = 0;
        class250.field3830 = 0;
        class78.field1089 = 0;
        class221.field3317 = 0;
        class180.field2518 = 0;
        class225.field3410 = 0;
        class224.field3380 = 0;
        class211.field3147 = 0;
        class231.field3507 = 0;
        class59.field839 = 0;
        class221.field3308 = 0;
        class63.field871 = 0;
        class127.field1800 = 0;
        class252.field3855 = 0;
        class156.field2162 = 0;
        class93.field1287 = 0;
        class92.field1280 = 0;
        class132.field1862 = 0;
        class276.field4273 = 0;
        class293.field4610 = 0;
        class61.field854 = 0;
        class31.field421 = 0;
        class123.field1724 = 0;
        class177.field2481 = 0;
        class289.field4563 = 0;
        class290.field4568 = 0;
        class144.field1995 = 0;
        class59.field833 = 0;
        class236.field3585 = 0;
        class214.field3223 = 0;
        class154.field2141 = 0;
        class202.field2802 = 0;
        class235.field3581 = 0;
        class16.field159 = 0;
        class31.field423 = 0;
        class144.field1997 = 0;
        class9.field90 = 0;
        class34.field514 = 0;
        class19.field282 = 0;
        class224.field3386 = 0;
        class50.field719 = 0;
        class156.field2175 = 0;
        class198.field2761 = 0;
        class63.field872 = 0;
        class235.field3558 = 0;
        class173.field2419 = 0;
        class273.field4220 = 0;
        class276.field4271 = 0;
        class74.field1026 = 0;
        class132.field1870 = 0;
        class22.field317 = 0;
        class235.field3561 = 0;
        class47.field683 = 0;
        class12.field123 = 0;
        class137.field1919 = 0;
        class43.field655 = 0;
        class211.field3104 = 0;
        class42.field628 = 0;
        class246.field3775 = 0;
        class93.field1290 = 0;
        class105.field1465 = 0;
        class208.field2914 = 0;
        class208.field2906 = 0;
        class236.field3598 = 0;
        class281.field4356 = 0;
        class132.field1875 = 0;
        class235.field3548 = 0;
        class237.field3600 = 0;
        class211.field3047 = 0;
        class236.field3589 = 0;
        class74.field1039 = 0;
        class148.field2056 = 0;
        class224.field3364 = 0;
        class266.field4023 = 0;
        class217.field3269 = 0;
        class239.field3619 = 0;
        class208.field2926 = 0;
        class16.field169 = 0;
        class238.field3609 = 0;
        class100.field1394 = 0;
        class171.field2374 = 0;
        class273.field4221 = 0;
        class235.field3577 = 0;
        class270.field4142 = 0;
        class224.field3388 = 0;
        class146.field2031 = 0;
        class85.field1157 = 0;
        class168.field2309 = 0;
        class197.field2731 = 0;
        class225.field3419 = 0;
        class111.field1591 = 0;
        class83.field1134 = 0;
        class171.field2377 = 0;
        class287.field4542 = 0;
        class88.field1207 = 0;
        class213.field3212 = 0;
        class283.field4376 = 0;
        class29.field392 = 0;
        class159.field2225 = 0;
        class172.field2385 = 0;
        class159.field2212 = 0;
        class202.field2811 = 0;
        class107.field1491 = 0;
        class294.field4624 = 0;
        class114.field1640 = 0;
        class270.field4143 = 0;
        class103.field1432 = 0;
        class224.field3363 = 0;
        class286.field4508 = 0;
        class171.field2365 = 0;
        class240.field3659 = 0;
        class235.field3552 = 0;
        class84.field1142 = 0;
        class206.field2883 = 0;
        class170.field2361 = 0;
        class7.field62 = 0;
        class197.field2734 = 0;
        class197.field2733 = 0;
        int var1 = 118 % ((78 - arg0) / 33);
        class234.field3533 = 0;
        class92.field1282 = 0;
        class132.field1860 = 0;
        class7.field60 = 0;
        class28.field363 = 0;
        class4.field24 = 0;
        class235.field3564 = 0;
        class287.field4525 = 0;
        class296.field4654 = 0;
        class203.field2831 = 0;
        class93.field1304 = 0;
        class150.field2072 = 0;
        class21.field300 = 0;
        class20.field292 = 0;
        class6.field47 = 0;
        class293.field4617 = 0;
        class249.field3815 = 0;
        class203.field2834 = 0;
        class148.field2042 = 0;
        class39.field574 = 0;
        class214.field3216 = 0;
        class39.field579 = 0;
        class15.field147 = 0;
        class30.field413 = 0;
        class124.field1740 = 0;
        class94.field1326 = 0;
        class285.field4475 = 0;
        class221.field3313 = 0;
        class228.field3458 = 0;
        class163.field2264 = 0;
        class206.field2863 = 0;
        class224.field3366 = 0;
        class283.field4379 = 0;
        class253.field3858 = 0;
        class94.field1318 = 0;
        class102.field1428 = 0;
        class286.field4522 = 0;
        class278.field4311 = 0;
        class189.field2613 = 0;
        class208.field2910 = 0;
        class160.field2243 = 0;
        class206.field2882 = 0;
        class213.field3210 = 0;
        class108.field1506 = 0;
        class280.field4328 = 0;
        class276.field4269 = 0;
        class245.field3740 = 0;
        class46.field674 = 0;
        class224.field3341 = 0;
        class168.field2330 = 0;
        class68.field916 = 0;
        class280.field4334 = 0;
        class240.field3680 = 0;
        class284.field4430 = 0;
        class253.field3875 = 0;
        class11.field112 = 0;
        class32.field445 = 0;
        class269.field4122 = 0;
        class278.field4309 = 0;
        class73.field1012 = 0;
        class172.field2382 = 0;
        class255.field3912 = 0;
        class241.field3697 = 0;
        class266.field4033 = 0;
        class68.field913 = 0;
        class127.field1785 = 0;
        class241.field3700 = 0;
        class198.field2744 = 0;
        class269.field4114 = 0;
        class156.field2173 = 0;
        class236.field3592 = 0;
        class235.field3580 = 0;
        class187.field2579 = 0;
        class32.field489 = 0;
        class276.field4275 = 0;
        class32.field426 = 0;
        class83.field1139 = 0;
        class173.field2408 = 0;
        class110.field1533 = 0;
        class138.field1930 = 0;
        class145.field2018 = 0;
        class151.field2096 = 0;
        class42.field635 = 0;
        class208.field2963 = 0;
        class82.field1116 = 0;
        class173.field2414 = 0;
        class280.field4337 = 0;
        class7.field59 = 0;
        class219.field3296 = 0;
        class127.field1786 = 0;
        field3892 = 0;
        class231.field3502 = 0;
        class269.field4125 = 0;
        class156.field2166 = 0;
        class235.field3576 = 0;
        class297.field4685 = 0;
        class127.field1791 = 0;
        class211.field3162 = 0;
        class34.field515 = 0;
        client.field2198 = 0;
        class256.field3913 = 0;
        class194.field2684 = 0;
        class177.field2486 = 0;
        class39.field590 = 0;
        class13.field132 = 0;
        class101.field1410 = 0;
        class88.field1213 = 0;
        class33.field503 = 0;
        class224.field3379 = 0;
        class132.field1888 = 0;
        class249.field3823 = 0;
        class283.field4374 = 0;
        class269.field4113 = 0;
        class111.field1563 = 0;
        class238.field3607 = 0;
        class104.field1449 = 0;
        class198.field2754 = 0;
        class12.field119 = 0;
        class204.field2837 = 0;
        class92.field1285 = 0;
        class131.field1850 = 0;
        class225.field3412 = 0;
        class270.field4140 = 0;
        class116.field1661 = 0;
        class84.field1146 = 0;
        class168.field2321 = 0;
        class282.field4368 = 0;
        class137.field1911 = 0;
        class132.field1865 = 0;
        class241.field3695 = 0;
        class123.field1726 = 0;
        class107.field1490 = 0;
        class208.field2911 = 0;
        class288.field4557 = 0;
        class208.field2943 = 0;
        class174.field2453 = 0;
        class268.field4110 = 0;
        class84.field1149 = 0;
        class284.field4389 = 0;
        class110.field1537 = 0;
        class82.field1118 = 0;
        class246.field3778 = 0;
        class175.field2460 = 0;
        class140.field1948 = 0;
        class242.field3714 = 0;
        class207.field2888 = 0;
        class229.field3467 = 0;
        class85.field1158 = 0;
        class273.field4206 = 0;
        class46.field678 = 0;
        class124.field1744 = 0;
        class224.field3352 = 0;
        class294.field4627 = 0;
        class172.field2397 = 0;
        class151.field2105 = 0;
        class86.field1161 = 0;
        class206.field2880 = 0;
        class122.field1695 = 0;
        class89.field1238 = 0;
        class132.field1874 = 0;
        class278.field4307 = 0;
        class175.field2459 = 0;
        class193.field2664 = 0;
        class200.field2779 = 0;
        class74.field1022 = 0;
        class214.field3224 = 0;
        class256.field3915 = 0;
        class261.field3948 = 0;
        class10.field96 = 0;
        class29.field383 = 0;
        class109.field1516 = 0;
        class277.field4288 = 0;
        class71.field968 = 0;
        class229.field3466 = 0;
        class167.field2293 = 0;
        class203.field2816 = 0;
        class93.field1293 = 0;
        class274.field4233 = 0;
        class84.field1147 = 0;
        class42.field625 = 0;
        class99.field1393 = 0;
        class213.field3202 = 0;
        class230.field3478 = 0;
        class4.field22 = 0;
        class278.field4297 = 0;
        class53.field774 = 0;
        class168.field2315 = 0;
        class297.field4695 = 0;
        class240.field3670 = 0;
        class237.field3603 = 0;
        class163.field2270 = 0;
        class75.field1049 = 0;
        class224.field3345 = 0;
        class283.field4375 = 0;
        class129.field1821 = 0;
        class34.field511 = 0;
        class249.field3809 = 0;
        class41.field606 = 0;
        class292.field4583 = 0;
        class240.field3678 = 0;
        class143.field1989 = 0;
        class283.field4373 = 0;
        class10.field98 = 0;
        class94.field1312 = 0;
        class119.field1678 = 0;
        class11.field108 = 0;
        class101.field1404 = 0;
        class235.field3572 = 0;
        class178.field2491 = 0;
        class277.field4286 = 0;
        class213.field3208 = 0;
        class81.field1107 = 0;
        class9.field78 = 0;
        class281.field4354 = 0;
        class131.field1851 = 0;
        class247.field3786 = 0;
        class256.field3916 = 0;
        class149.field2066 = 0;
        class127.field1811 = 0;
        class278.field4304 = 0;
        class224.field3385 = 0;
        class266.field3983 = 0;
        class225.field3417 = 0;
        class208.field2927 = 0;
        class235.field3545 = 0;
        class189.field2606 = 0;
        class208.field2956 = 0;
        class238.field3614 = 0;
        class44.field658 = 0;
        class49.field713 = 0;
        class284.field4421 = 0;
        class231.field3505 = 0;
        class63.field867 = 0;
        class73.field1015 = 0;
        class208.field2946 = 0;
        class160.field2227 = 0;
        class269.field4118 = 0;
        class51.field735 = 0;
        class266.field4005 = 0;
        class230.field3481 = 0;
        class33.field506 = 0;
        class123.field1707 = 0;
        class32.field434 = 0;
        class43.field645 = 0;
        class19.field272 = 0;
        class168.field2313 = 0;
        class236.field3597 = 0;
        class136.field1902 = 0;
        class238.field3611 = 0;
        class136.field1910 = 0;
        class290.field4571 = 0;
        class100.field1398 = 0;
        class132.field1878 = 0;
        class286.field4483 = 0;
        class224.field3371 = 0;
        class62.field859 = 0;
        class78.field1088 = 0;
        class235.field3573 = 0;
        class202.field2796 = 0;
        class101.field1417 = 0;
        class287.field4528 = 0;
        class49.field710 = 0;
        class5.field40 = 0;
        class10.field103 = 0;
        class53.field768 = 0;
        class93.field1305 = 0;
        class235.field3555 = 0;
        class208.field2909 = 0;
        class235.field3546 = 0;
        class208.field2915 = 0;
        class188.field2590 = 0;
        class68.field923 = 0;
        class5.field37 = 0;
        class163.field2268 = 0;
        class104.field1457 = 0;
        class194.field2691 = 0;
        class85.field1152 = 0;
        class116.field1657 = 0;
        class86.field1172 = 0;
        class177.field2480 = 0;
        class56.field806 = 0;
        class101.field1418 = 0;
        class168.field2306 = 0;
        class192.field2653 = 0;
        class42.field633 = 0;
        class144.field2005 = 0;
        class49.field716 = 0;
        class16.field161 = 0;
        class235.field3540 = 0;
        class96.field1351 = 0;
        class144.field2014 = 0;
        class140.field1943 = 0;
        class205.field2853 = 0;
        class29.field382 = 0;
        class234.field3528 = 0;
        class16.field170 = 0;
        class215.field3240 = 0;
        class92.field1284 = 0;
        class181.field2539 = 0;
        class30.field417 = 0;
        class231.field3494 = 0;
        class202.field2797 = 0;
        class193.field2677 = 0;
        class93.field1307 = 0;
        class276.field4280 = 0;
        class224.field3394 = 0;
        class135.field1893 = 0;
        class234.field3530 = 0;
        class131.field1846 = 0;
        class270.field4141 = 0;
        class203.field2817 = 0;
        field3900 = 0;
        class88.field1212 = 0;
        class116.field1654 = 0;
        class245.field3749 = 0;
        class281.field4352 = 0;
        class241.field3685 = 0;
        class231.field3503 = 0;
        class231.field3498 = 0;
        class76.field1060 = 0;
        class178.field2492 = 0;
        class88.field1197 = 0;
        class67.field910 = 0;
        class101.field1413 = 0;
        class136.field1905 = 0;
        class19.field280 = 0;
        class297.field4693 = 0;
        class76.field1058 = 0;
        class269.field4116 = 0;
        class83.field1127 = 0;
        class218.field3290 = 0;
        class9.field88 = 0;
        class193.field2663 = 0;
        class38.field571 = 0;
        class16.field164 = 0;
        class118.field1669 = 0;
        class158.field2206 = 0;
        class225.field3416 = 0;
        class123.field1710 = 0;
        class268.field4106 = 0;
        class236.field3587 = 0;
        class295.field4633 = 0;
        class179.field2514 = 0;
        class110.field1534 = 0;
        class86.field1166 = 0;
        class266.field4017 = 0;
        class83.field1136 = 0;
        class208.field2935 = 0;
        class286.field4498 = 0;
        class269.field4123 = 0;
        class59.field843 = 0;
        class146.field2032 = 0;
        class39.field591 = 0;
        class266.field4064 = 0;
        class170.field2351 = 0;
        class187.field2583 = 0;
        class68.field924 = 0;
        class292.field4587 = 0;
        class154.field2134 = 0;
        class127.field1798 = 0;
        class12.field115 = 0;
        class100.field1400 = 0;
        class33.field499 = 0;
        class114.field1643 = 0;
        class149.field2065 = 0;
        class13.field125 = 0;
        class86.field1179 = 0;
        class180.field2527 = 0;
        class73.field1009 = 0;
        class226.field3429 = 0;
        class207.field2890 = 0;
        class199.field2778 = 0;
        class208.field2928 = 0;
        class131.field1854 = 0;
        class249.field3813 = 0;
        class210.field3002 = 0;
        class127.field1792 = 0;
        class189.field2608 = 0;
        class143.field1983 = 0;
        class224.field3392 = 0;
        class270.field4144 = 0;
        class4.field21 = 0;
        class197.field2723 = 0;
        class88.field1221 = 0;
        class116.field1656 = 0;
        class224.field3382 = 0;
        class171.field2380 = 0;
        class247.field3790 = 0;
        class146.field2028 = 0;
        class279.field4322 = 0;
        class104.field1448 = 0;
        class50.field723 = 0;
        class226.field3428 = 0;
        class240.field3683 = 0;
        class68.field927 = 0;
        class71.field981 = 0;
        class168.field2324 = 0;
        class89.field1227 = 0;
        class224.field3344 = 0;
        class208.field2898 = 0;
        client.field2197 = 0;
        class160.field2229 = 0;
        class224.field3350 = 0;
        class211.field3004 = 0;
        class231.field3495 = 0;
        class287.field4531 = 0;
        class253.field3873 = 0;
        class19.field270 = 0;
        class293.field4598 = 0;
        class213.field3209 = 0;
        class101.field1419 = 0;
        class224.field3397 = 0;
        class75.field1043 = 0;
        class202.field2810 = 0;
        class281.field4349 = 0;
        field3884 = 0;
        class146.field2038 = 0;
        class122.field1698 = 0;
        class284.field4420 = 0;
        class151.field2100 = -1;
        for (int var2 = 0; var2 < class175.field2463.length; var2++) {
            class175.field2463[var2] = null;
        }
        class68.field925 = 0;
        class15.field146 = false;
        class173.method1134(0, (byte) 84);
        for (int var3 = 0; var3 < 100; var3++) {
            class44.field664[var3] = null;
        }
        class84.field1151 = 0;
        class234.field3535 = 0;
        class141.field1963 = 0;
        class103.field1442 = 0;
        class163.field2263 = (int) (Math.random() * 100.0D) - 50;
        class11.field113 = false;
        class92.field1283 = 0;
        class286.field4481 = 0;
        class42.field636 = (int) (Math.random() * 80.0D) - 40;
        class214.field3218 = 0;
        class207.field2887 = (int) (Math.random() * 110.0D) - 55;
        class68.field912 = (float) ((int) (Math.random() * 20.0D) - 10 & 0x7FF);
        class155.field2161 = -1;
        class111.field1600 = (int) (Math.random() * 30.0D) - 20;
        class217.field3266 = (int) (Math.random() * 120.0D) - 60;
        class199.field2768 = 0;
        for (int var4 = 0; var4 < 2048; var4++) {
            class154.field2133[var4] = null;
            class248.field3803[var4] = null;
        }
        for (int var5 = 0; var5 < 32768; var5++) {
            class119.field1679[var5] = null;
        }
        class217.field3280 = class154.field2133[2047] = new class88();
        class168.field2318.method989((byte) -126);
        class256.field3914.method989((byte) -91);
        if (class297.field4690 != null) {
            for (int var6 = 0; var6 < 4; var6++) {
                for (int var7 = 0; var7 < 104; var7++) {
                    for (int var8 = 0; var8 < 104; var8++) {
                        class297.field4690[var6][var7][var8] = null;
                    }
                }
            }
        }
        class41.field607 = new class148();
        class105.field1458 = 0;
        class279.field4323 = 0;
        class41.method271(16);
        class277.method1853((byte) -122);
        class188.field2600 = 0;
        class178.field2501 = 0;
        class48.field694 = 0;
        class221.field3324 = 0;
        class290.field4577 = 0;
        class15.field155 = 0;
        class1.field5 = 0;
        class200.field2780 = 0;
        class217.field3282 = 0;
        class116.field1662 = 0;
        for (int var9 = 0; var9 < class270.field4146.length; var9++) {
            class270.field4146[var9] = -1;
        }
        if (class212.field3193 != -1) {
            class170.method1112(class212.field3193, 0);
        }
        for (class56 var10 = (class56) class289.field4559.method21((byte) 67); var10 != null; var10 = (class56) class289.field4559.method22(true)) {
            class136.method924((byte) 86, var10, true);
        }
        class212.field3193 = -1;
        class289.field4559 = new class4(8);
        class241.method1613(-1);
        class15.field146 = false;
        class68.field925 = 0;
        class233.field3524 = null;
        class150.field2068.method966((int[]) null, -97, false, new int[5], -1, -1);
        for (int var11 = 0; var11 < 8; var11++) {
            class31.field420[var11] = null;
            class163.field2272[var11] = false;
            class48.field701[var11] = -1;
        }
        class266.method1742(89);
        class29.field377 = true;
        for (int var12 = 0; var12 < 100; var12++) {
            class42.field640[var12] = true;
        }
        class132.field1873 = 0;
        class273.field4226 = null;
        class297.field4694 = null;
        for (int var13 = 0; var13 < 6; var13++) {
            class132.field1867[var13] = new class77();
        }
        for (int var14 = 0; var14 < 25; var14++) {
            class180.field2521[var14] = 0;
            class15.field149[var14] = 0;
            class149.field2060[var14] = 0;
        }
        class20.field291 = true;
        class277.field4285 = class269.field4133;
        class215.field3245 = 0;
        class284.field4405 = class103.field1443 = class43.field648 = class282.field4367 = new short[256];
        class129.field1822 = false;
        class34.method232(-50);
        class137.field1925 = false;
        class294.method1970(119);
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(III)Z")
    public final boolean method1704(int arg0, int arg1, int arg2) {
        field3884++;
        int var4 = 100 % ((arg0 - 17) / 57);
        for (class83 var5 = (class83) this.field3891.method990(-111); var5 != null; var5 = (class83) this.field3891.method993(-52)) {
            if (var5.method517(arg2, (byte) -101, arg1)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZI)V")
    public class254(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6) {
        this.field3887 = arg6;
        this.field3890 = arg0;
        this.field3886 = arg4;
        this.field3880 = arg2;
        this.field3901 = arg1;
        this.field3889 = arg3;
        this.field3888 = arg5;
        if (this.field3887 == 255) {
            this.field3887 = 0;
        }
        this.field3891 = new class148();
    }
}
