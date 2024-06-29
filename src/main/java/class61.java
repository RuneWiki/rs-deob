import java.net.URL;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class61 extends class74 {

    @OriginalMember(owner = "client!oc", name = "T", descriptor = "[S")
    private short[] field976 = new short[257];

    @OriginalMember(owner = "client!oc", name = "W", descriptor = "I")
    private int field979 = 0;

    @OriginalMember(owner = "client!oc", name = "Y", descriptor = "Lll;")
    public static class211 field981 = new class211(16);

    @OriginalMember(owner = "client!oc", name = "cb", descriptor = "I")
    public static int field985 = 0;

    @OriginalMember(owner = "client!oc", name = "eb", descriptor = "[J")
    public static long[] field987 = new long[100];

    @OriginalMember(owner = "client!oc", name = "M", descriptor = "I")
    public static int field969;

    @OriginalMember(owner = "client!oc", name = "O", descriptor = "I")
    public static int field971;

    @OriginalMember(owner = "client!oc", name = "Q", descriptor = "I")
    public static int field973;

    @OriginalMember(owner = "client!oc", name = "R", descriptor = "I")
    public static int field974;

    @OriginalMember(owner = "client!oc", name = "S", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!oc", name = "U", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!oc", name = "X", descriptor = "I")
    public static int field980;

    @OriginalMember(owner = "client!oc", name = "Z", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!oc", name = "ab", descriptor = "I")
    public static int field983;

    @OriginalMember(owner = "client!oc", name = "bb", descriptor = "I")
    public static int field984;

    @OriginalMember(owner = "client!oc", name = "db", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!oc", name = "gb", descriptor = "I")
    public static int field989;

    @OriginalMember(owner = "client!oc", name = "fb", descriptor = "Lfe;")
    public static class261 field988;

    @OriginalMember(owner = "client!oc", name = "P", descriptor = "[I")
    private int[] field972;

    @OriginalMember(owner = "client!oc", name = "V", descriptor = "[I")
    private int[] field978;

    @OriginalMember(owner = "client!oc", name = "hb", descriptor = "[Loa;")
    public static class100[] field990;

    @OriginalMember(owner = "client!oc", name = "N", descriptor = "[[I")
    private int[][] field970;

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "(I)V")
    public static void method485(int arg0) {
        field987 = null;
        if (arg0 != 1) {
            method494(4);
        }
        field981 = null;
        field990 = null;
        field988 = null;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IILuc;)V")
    public static final void method486(int arg0, int arg1, class39 arg2) {
        Object[] var3 = arg2.field647;
        if (arg0 != -6766) {
            method494(-51);
        }
        ++field973;
        int var4 = (Integer) var3[0];
        class226 var5 = class212.method1418((byte) -21, var4);
        if (var5 != null) {
            class238.field3686 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = -1;
            int[] var9 = var5.field3547;
            int[] var10 = var5.field3549;
            byte var11 = -1;
            try {
                class252.field3869 = new String[var5.field3548];
                class86.field1410 = new int[var5.field3534];
                int var12 = 0;
                int var13 = 0;
                for (int var14 = 1; var3.length > var14; ++var14) {
                    if (var3[var14] instanceof Integer) {
                        int var15 = (Integer) var3[var14];
                        if (var15 == -2147483647) {
                            var15 = arg2.field656;
                        }
                        if (var15 == -2147483646) {
                            var15 = arg2.field652;
                        }
                        if (~var15 == 2147483644) {
                            var15 = arg2.field657 != null ? arg2.field657.field2977 : -1;
                        }
                        if (var15 == -2147483644) {
                            var15 = arg2.field648;
                        }
                        if (var15 == -2147483643) {
                            var15 = arg2.field657 == null ? -1 : arg2.field657.field2856;
                        }
                        if (~var15 == 2147483641) {
                            var15 = arg2.field651 != null ? arg2.field651.field2977 : -1;
                        }
                        if (var15 == -2147483641) {
                            var15 = arg2.field651 == null ? -1 : arg2.field651.field2856;
                        }
                        if (var15 == -2147483640) {
                            var15 = arg2.field645;
                        }
                        if (~var15 == 2147483638) {
                            var15 = arg2.field655;
                        }
                        class86.field1410[var13++] = var15;
                    } else if (var3[var14] instanceof String) {
                        String var16 = (String) var3[var14];
                        if (var16.equals("event_opbase")) {
                            var16 = arg2.field653;
                        }
                        class252.field3869[var12++] = var16;
                    }
                }
                int var17 = 0;
                label4017: while (true) {
                    ++var17;
                    if (~var17 < ~arg1) {
                        throw new RuntimeException("slow");
                    }
                    ++var8;
                    int var517 = var9[var8];
                    if (~var517 > -101) {
                        if (~var517 == -1) {
                            class47.field739[var6++] = var10[var8];
                            continue;
                        }
                        if (var517 == 1) {
                            int var18 = var10[var8];
                            class47.field739[var6++] = class30.field482[var18];
                            continue;
                        }
                        if (var517 == 2) {
                            int var19 = var10[var8];
                            --var6;
                            class53.method436(var19, class47.field739[var6], (byte) -123);
                            continue;
                        }
                        if (var517 == 3) {
                            class179.field2682[var7++] = var5.field3543[var8];
                            continue;
                        }
                        if (var517 == 6) {
                            var8 += var10[var8];
                            continue;
                        }
                        if (var517 == 7) {
                            var6 -= 2;
                            if (class47.field739[var6 - -1] != class47.field739[var6]) {
                                var8 += var10[var8];
                            }
                            continue;
                        }
                        if (~var517 == -9) {
                            var6 -= 2;
                            if (class47.field739[var6 + 1] == class47.field739[var6]) {
                                var8 += var10[var8];
                            }
                            continue;
                        }
                        if (~var517 == -10) {
                            var6 -= 2;
                            if (~class47.field739[var6 + 1] < ~class47.field739[var6]) {
                                var8 += var10[var8];
                            }
                            continue;
                        }
                        if (var517 == 10) {
                            var6 -= 2;
                            if (~class47.field739[var6 + 1] > ~class47.field739[var6]) {
                                var8 += var10[var8];
                            }
                            continue;
                        }
                        if (~var517 == -22) {
                            if (class238.field3686 == 0) {
                                return;
                            }
                            class17 var20 = class47.field766[--class238.field3686];
                            var8 = var20.field275;
                            var5 = var20.field271;
                            class252.field3869 = var20.field270;
                            var10 = var5.field3549;
                            var9 = var5.field3547;
                            class86.field1410 = var20.field276;
                            continue;
                        }
                        if (var517 == 25) {
                            int var21 = var10[var8];
                            class47.field739[var6++] = class42.method357(var21, 3754);
                            continue;
                        }
                        if (var517 == 27) {
                            int var22 = var10[var8];
                            --var6;
                            class179.method1192(class47.field739[var6], var22, arg0 ^ 6686);
                            continue;
                        }
                        if (~var517 == -32) {
                            var6 -= 2;
                            if (class47.field739[var6 + 1] >= class47.field739[var6]) {
                                var8 += var10[var8];
                            }
                            continue;
                        }
                        if (~var517 == -33) {
                            var6 -= 2;
                            if (~class47.field739[var6] <= ~class47.field739[var6 + 1]) {
                                var8 += var10[var8];
                            }
                            continue;
                        }
                        if (~var517 == -34) {
                            class47.field739[var6++] = class86.field1410[var10[var8]];
                            continue;
                        }
                        int var10001;
                        if (var517 == 34) {
                            var10001 = var10[var8];
                            --var6;
                            class86.field1410[var10001] = class47.field739[var6];
                            continue;
                        }
                        if (var517 == 35) {
                            class179.field2682[var7++] = class252.field3869[var10[var8]];
                            continue;
                        }
                        if (var517 == 36) {
                            var10001 = var10[var8];
                            --var7;
                            class252.field3869[var10001] = class179.field2682[var7];
                            continue;
                        }
                        if (var517 == 37) {
                            int var23 = var10[var8];
                            var7 -= var23;
                            String var24 = class177.method1185((byte) -126, var23, var7, class179.field2682);
                            class179.field2682[var7++] = var24;
                            continue;
                        }
                        if (~var517 == -39) {
                            --var6;
                            continue;
                        }
                        if (~var517 == -40) {
                            --var7;
                            continue;
                        }
                        if (~var517 == -41) {
                            int var25 = var10[var8];
                            class226 var26 = class212.method1418((byte) -21, var25);
                            String[] var27 = new String[var26.field3548];
                            int[] var28 = new int[var26.field3534];
                            for (int var29 = 0; var29 < var26.field3535; ++var29) {
                                var28[var29] = class47.field739[-var26.field3535 + var29 + var6];
                            }
                            for (int var30 = 0; var30 < var26.field3538; ++var30) {
                                var27[var30] = class179.field2682[var7 - -var30 + -var26.field3538];
                            }
                            var6 -= var26.field3535;
                            var7 -= var26.field3538;
                            class17 var31 = new class17();
                            var31.field270 = class252.field3869;
                            var31.field275 = var8;
                            var31.field276 = class86.field1410;
                            var31.field271 = var5;
                            if (~class47.field766.length >= ~class238.field3686) {
                                throw new RuntimeException();
                            }
                            var8 = -1;
                            class47.field766[class238.field3686++] = var31;
                            class252.field3869 = var27;
                            var5 = var26;
                            var9 = var26.field3547;
                            class86.field1410 = var28;
                            var10 = var26.field3549;
                            continue;
                        }
                        if (~var517 == -43) {
                            class47.field739[var6++] = class227.field3550[var10[var8]];
                            continue;
                        }
                        if (~var517 == -44) {
                            int var32 = var10[var8];
                            --var6;
                            class227.field3550[var32] = class47.field739[var6];
                            class209.method1403(92, var32);
                            continue;
                        }
                        if (~var517 == -45) {
                            int var33 = var10[var8] >> 16;
                            int var34 = var10[var8] & 65535;
                            --var6;
                            int var35 = class47.field739[var6];
                            if (~var35 <= -1 && ~var35 >= -5001) {
                                class16.field265[var33] = var35;
                                byte var36 = -1;
                                if (var34 == 105) {
                                    var36 = 0;
                                }
                                int var37 = 0;
                                while (true) {
                                    if (var37 >= var35) {
                                        continue label4017;
                                    }
                                    class94.field1514[var33][var37] = var36;
                                    ++var37;
                                }
                            }
                            throw new RuntimeException();
                        }
                        if (~var517 == -46) {
                            --var6;
                            int var38 = class47.field739[var6];
                            int var39 = var10[var8];
                            if (var38 >= 0 && var38 < class16.field265[var39]) {
                                class47.field739[var6++] = class94.field1514[var39][var38];
                                continue;
                            }
                            throw new RuntimeException();
                        }
                        if (var517 == 46) {
                            var6 -= 2;
                            int var40 = class47.field739[var6];
                            int var41 = var10[var8];
                            if (var40 >= 0 && class16.field265[var41] > var40) {
                                class94.field1514[var41][var40] = class47.field739[var6 + 1];
                                continue;
                            }
                            throw new RuntimeException();
                        }
                        if (var517 == 47) {
                            String var42 = class137.field2131[var10[var8]];
                            if (var42 == null) {
                                var42 = "null";
                            }
                            class179.field2682[var7++] = var42;
                            continue;
                        }
                        if (~var517 == -49) {
                            int var43 = var10[var8];
                            --var7;
                            class137.field2131[var43] = class179.field2682[var7];
                            class48.method396(var43, 2);
                            continue;
                        }
                        if (~var517 == -52) {
                            class211 var44 = var5.field3540[var10[var8]];
                            --var6;
                            class229 var45 = (class229) var44.method1414(true, (long) class47.field739[var6]);
                            if (var45 != null) {
                                var8 += var45.field3580;
                            }
                            continue;
                        }
                    }
                    boolean var46;
                    if (var10[var8] != 1) {
                        var46 = false;
                    } else {
                        var46 = true;
                    }
                    if (~var517 > -301) {
                        if (var517 == 100) {
                            var6 -= 3;
                            int var47 = class47.field739[var6 + 1];
                            int var48 = class47.field739[var6 + 2];
                            int var49 = class47.field739[var6];
                            if (~var47 == -1) {
                                throw new RuntimeException();
                            }
                            class188 var50 = class5.method57((byte) -100, var49);
                            if (var50.field2968 == null) {
                                var50.field2968 = new class188[var48 + 1];
                            }
                            if (~var50.field2968.length >= ~var48) {
                                class188[] var51 = new class188[var48 + 1];
                                for (int var52 = 0; ~var52 > ~var50.field2968.length; ++var52) {
                                    var51[var52] = var50.field2968[var52];
                                }
                                var50.field2968 = var51;
                            }
                            if (~var48 < -1 && var50.field2968[var48 + -1] == null) {
                                throw new RuntimeException("Gap at:" + (var48 - 1));
                            }
                            class188 var53 = new class188();
                            var53.field2852 = true;
                            var53.field2937 = var47;
                            var53.field2856 = var48;
                            var53.field2870 = var53.field2977 = var50.field2977;
                            var50.field2968[var48] = var53;
                            if (!var46) {
                                class39.field658 = var53;
                            } else {
                                class100.field1607 = var53;
                            }
                            class246.method1663(255, var50);
                            continue;
                        }
                        if (~var517 == -102) {
                            class188 var54 = var46 ? class100.field1607 : class39.field658;
                            if (var54.field2856 == -1) {
                                if (!var46) {
                                    throw new RuntimeException("Tried to cc_delete static active-component!");
                                }
                                throw new RuntimeException("Tried to .cc_delete static .active-component!");
                            }
                            class188 var55 = class5.method57((byte) -114, var54.field2977);
                            var55.field2968[var54.field2856] = null;
                            class246.method1663(arg0 + 7021, var55);
                            continue;
                        }
                        if (var517 == 102) {
                            --var6;
                            class188 var56 = class5.method57((byte) -119, class47.field739[var6]);
                            var56.field2968 = null;
                            class246.method1663(255, var56);
                            continue;
                        }
                        if (~var517 == -201) {
                            var6 -= 2;
                            int var57 = class47.field739[var6];
                            int var58 = class47.field739[var6 - -1];
                            class188 var59 = class32.method261(var57, var58, 55);
                            if (var59 != null && ~var58 != 0) {
                                class47.field739[var6++] = 1;
                                if (var46) {
                                    class100.field1607 = var59;
                                } else {
                                    class39.field658 = var59;
                                }
                                continue;
                            }
                            class47.field739[var6++] = 0;
                            continue;
                        }
                        if (~var517 == -202) {
                            --var6;
                            int var60 = class47.field739[var6];
                            class188 var61 = class5.method57((byte) -111, var60);
                            if (var61 == null) {
                                class47.field739[var6++] = 0;
                            } else {
                                class47.field739[var6++] = 1;
                                if (var46) {
                                    class100.field1607 = var61;
                                } else {
                                    class39.field658 = var61;
                                }
                            }
                            continue;
                        }
                    } else if (var517 < 500) {
                        if (var517 == 403) {
                            var6 -= 2;
                            int var62 = class47.field739[var6 + 1];
                            int var63 = class47.field739[var6];
                            for (int var64 = 0; ~class112.field1764.length < ~var64; ++var64) {
                                if (class112.field1764[var64] == var63) {
                                    class261.field4058.field440.method1646(var62, var64, -89);
                                    continue label4017;
                                }
                            }
                            int var65 = 0;
                            while (true) {
                                if (~class190.field3023.length >= ~var65) {
                                    continue label4017;
                                }
                                if (class190.field3023[var65] == var63) {
                                    class261.field4058.field440.method1646(var62, var65, 53);
                                    continue label4017;
                                }
                                ++var65;
                            }
                        }
                        if (~var517 == -405) {
                            var6 -= 2;
                            int var66 = class47.field739[var6];
                            int var67 = class47.field739[var6 + 1];
                            class261.field4058.field440.method1637(var67, -9629, var66);
                            continue;
                        }
                        if (~var517 == -411) {
                            --var6;
                            boolean var68 = class47.field739[var6] != 0;
                            class261.field4058.field440.method1635(121, var68);
                            continue;
                        }
                    } else if ((var517 < 1000 || ~var517 <= -1101) && (var517 < 2000 || var517 >= 2100)) {
                        if ((~var517 > -1101 || var517 >= 1200) && (~var517 > -2101 || ~var517 <= -2201)) {
                            if ((~var517 > -1201 || ~var517 <= -1301) && (var517 < 2200 || var517 >= 2300)) {
                                if (~var517 <= -1301 && var517 < 1400 || var517 >= 2300 && var517 < 2400) {
                                    class188 var498;
                                    if (var517 >= 2000) {
                                        var517 -= 1000;
                                        --var6;
                                        var498 = class5.method57((byte) -93, class47.field739[var6]);
                                    } else {
                                        var498 = !var46 ? class39.field658 : class100.field1607;
                                    }
                                    if (~var517 == -1301) {
                                        --var6;
                                        int var499 = class47.field739[var6] - 1;
                                        if (~var499 <= -1 && ~var499 >= -10) {
                                            --var7;
                                            var498.method1270(class179.field2682[var7], (byte) -65, var499);
                                            continue;
                                        }
                                        --var7;
                                        continue;
                                    }
                                    if (var517 == 1301) {
                                        var6 -= 2;
                                        int var500 = class47.field739[var6];
                                        int var501 = class47.field739[var6 + 1];
                                        var498.field2911 = class32.method261(var500, var501, 103);
                                        continue;
                                    }
                                    if (var517 == 1302) {
                                        --var6;
                                        var498.field2981 = class47.field739[var6] == 1;
                                        continue;
                                    }
                                    if (~var517 == -1304) {
                                        --var6;
                                        var498.field2836 = class47.field739[var6];
                                        continue;
                                    }
                                    if (var517 == 1304) {
                                        --var6;
                                        var498.field2988 = class47.field739[var6];
                                        continue;
                                    }
                                    if (var517 == 1305) {
                                        --var7;
                                        var498.field2855 = class179.field2682[var7];
                                        continue;
                                    }
                                    if (~var517 == -1307) {
                                        --var7;
                                        var498.field3004 = class179.field2682[var7];
                                        continue;
                                    }
                                    if (var517 == 1307) {
                                        var498.field3001 = null;
                                        continue;
                                    }
                                    if (~var517 == -1309) {
                                        --var6;
                                        var498.field2941 = class47.field739[var6];
                                        --var6;
                                        var498.field2983 = class47.field739[var6];
                                        continue;
                                    }
                                    if (var517 == 1309) {
                                        --var6;
                                        int var502 = class47.field739[var6];
                                        --var6;
                                        int var503 = class47.field739[var6];
                                        if (var503 >= 1 && var503 <= 10) {
                                            var498.method1264(var503 - 1, var502, 98);
                                        }
                                        continue;
                                    }
                                    if (var517 == 1310) {
                                        --var7;
                                        var498.field2975 = class179.field2682[var7];
                                        continue;
                                    }
                                } else {
                                    if (~var517 <= -1401 && var517 < 1500 || var517 >= 2400 && ~var517 > -2501) {
                                        class188 var75;
                                        if (var517 < 2000) {
                                            var75 = var46 ? class100.field1607 : class39.field658;
                                        } else {
                                            var517 -= 1000;
                                            --var6;
                                            var75 = class5.method57((byte) -98, class47.field739[var6]);
                                        }
                                        int[] var76 = null;
                                        --var7;
                                        String var77 = class179.field2682[var7];
                                        if (~var77.length() < -1 && ~var77.charAt(-1 + var77.length()) == -90) {
                                            --var6;
                                            int var78 = class47.field739[var6];
                                            if (~var78 < -1) {
                                                var76 = new int[var78];
                                                while (~(var78--) < -1) {
                                                    --var6;
                                                    var76[var78] = class47.field739[var6];
                                                }
                                            }
                                            var77 = var77.substring(0, -1 + var77.length());
                                        }
                                        Object[] var79 = new Object[1 + var77.length()];
                                        for (int var80 = var79.length + -1; ~var80 <= -2; --var80) {
                                            if (var77.charAt(var80 + -1) == 's') {
                                                --var7;
                                                var79[var80] = class179.field2682[var7];
                                            } else {
                                                --var6;
                                                var79[var80] = new Integer(class47.field739[var6]);
                                            }
                                        }
                                        --var6;
                                        int var81 = class47.field739[var6];
                                        if (var81 != -1) {
                                            var79[0] = new Integer(var81);
                                        } else {
                                            var79 = null;
                                        }
                                        if (~var517 != -1401) {
                                            if (var517 == 1401) {
                                                var75.field2951 = var79;
                                            } else if (var517 != 1402) {
                                                if (var517 != 1403) {
                                                    if (~var517 == -1405) {
                                                        var75.field2931 = var79;
                                                    } else if (var517 != 1405) {
                                                        if (var517 == 1406) {
                                                            var75.field2972 = var79;
                                                        } else if (var517 == 1407) {
                                                            var75.field2962 = var79;
                                                            var75.field2949 = var76;
                                                        } else if (var517 != 1408) {
                                                            if (var517 == 1409) {
                                                                var75.field2832 = var79;
                                                            } else if (~var517 != -1411) {
                                                                if (var517 != 1411) {
                                                                    if (~var517 != -1413) {
                                                                        if (~var517 == -1415) {
                                                                            var75.field2987 = var79;
                                                                            var75.field2971 = var76;
                                                                        } else if (var517 != 1415) {
                                                                            if (~var517 == -1417) {
                                                                                var75.field2834 = var79;
                                                                            } else if (var517 == 1417) {
                                                                                var75.field2992 = var79;
                                                                            } else if (var517 == 1418) {
                                                                                var75.field2940 = var79;
                                                                            } else if (var517 != 1419) {
                                                                                if (var517 != 1420) {
                                                                                    if (~var517 != -1422) {
                                                                                        if (var517 == 1422) {
                                                                                            var75.field2936 = var79;
                                                                                        } else if (~var517 != -1424) {
                                                                                            if (var517 != 1424) {
                                                                                                if (var517 == 1425) {
                                                                                                    var75.field2895 = var79;
                                                                                                } else if (var517 != 1426) {
                                                                                                    if (~var517 != -1428) {
                                                                                                        if (~var517 == -1429) {
                                                                                                            var75.field2979 = var79;
                                                                                                            var75.field2899 = var76;
                                                                                                        } else if (var517 == 1429) {
                                                                                                            var75.field2912 = var76;
                                                                                                            var75.field2885 = var79;
                                                                                                        }
                                                                                                    } else {
                                                                                                        var75.field2829 = var79;
                                                                                                    }
                                                                                                } else {
                                                                                                    var75.field2923 = var79;
                                                                                                }
                                                                                            } else {
                                                                                                var75.field2873 = var79;
                                                                                            }
                                                                                        } else {
                                                                                            var75.field2898 = var79;
                                                                                        }
                                                                                    } else {
                                                                                        var75.field2905 = var79;
                                                                                    }
                                                                                } else {
                                                                                    var75.field2890 = var79;
                                                                                }
                                                                            } else {
                                                                                var75.field2896 = var79;
                                                                            }
                                                                        } else {
                                                                            var75.field2973 = var76;
                                                                            var75.field2942 = var79;
                                                                        }
                                                                    } else {
                                                                        var75.field2865 = var79;
                                                                    }
                                                                } else {
                                                                    var75.field2935 = var79;
                                                                }
                                                            } else {
                                                                var75.field2957 = var79;
                                                            }
                                                        } else {
                                                            var75.field2827 = var79;
                                                        }
                                                    } else {
                                                        var75.field2845 = var79;
                                                    }
                                                } else {
                                                    var75.field2980 = var79;
                                                }
                                            } else {
                                                var75.field2917 = var79;
                                            }
                                        } else {
                                            var75.field2884 = var79;
                                        }
                                        var75.field2985 = true;
                                        continue;
                                    }
                                    if (~var517 <= -1601) {
                                        if (~var517 > -1701) {
                                            class188 var82 = var46 ? class100.field1607 : class39.field658;
                                            if (var517 == 1600) {
                                                class47.field739[var6++] = var82.field3008;
                                                continue;
                                            }
                                            if (~var517 == -1602) {
                                                class47.field739[var6++] = var82.field2887;
                                                continue;
                                            }
                                            if (var517 == 1602) {
                                                class179.field2682[var7++] = var82.field2831;
                                                continue;
                                            }
                                            if (var517 == 1603) {
                                                class47.field739[var6++] = var82.field2997;
                                                continue;
                                            }
                                            if (~var517 == -1605) {
                                                class47.field739[var6++] = var82.field2900;
                                                continue;
                                            }
                                            if (var517 == 1605) {
                                                class47.field739[var6++] = var82.field2908;
                                                continue;
                                            }
                                            if (var517 == 1606) {
                                                class47.field739[var6++] = var82.field2945;
                                                continue;
                                            }
                                            if (var517 == 1607) {
                                                class47.field739[var6++] = var82.field2990;
                                                continue;
                                            }
                                            if (var517 == 1608) {
                                                class47.field739[var6++] = var82.field2933;
                                                continue;
                                            }
                                            if (var517 == 1609) {
                                                class47.field739[var6++] = var82.field2894;
                                                continue;
                                            }
                                            if (var517 == 1610) {
                                                class47.field739[var6++] = var82.field2869;
                                                continue;
                                            }
                                            if (~var517 == -1612) {
                                                class47.field739[var6++] = var82.field2953;
                                                continue;
                                            }
                                            if (~var517 == -1613) {
                                                class47.field739[var6++] = var82.field2888;
                                                continue;
                                            }
                                        } else if (var517 >= 1800) {
                                            if (~var517 <= -1901) {
                                                if (var517 >= 2600) {
                                                    if (~var517 <= -2701) {
                                                        if (var517 >= 2800) {
                                                            if (~var517 <= -2901) {
                                                                if (var517 >= 3200) {
                                                                    if (var517 >= 3300) {
                                                                        if (~var517 > -3401) {
                                                                            if (var517 == 3300) {
                                                                                class47.field739[var6++] = class267.field4256;
                                                                                continue;
                                                                            }
                                                                            if (var517 == 3301) {
                                                                                var6 -= 2;
                                                                                int var83 = class47.field739[var6 + 1];
                                                                                int var84 = class47.field739[var6];
                                                                                class47.field739[var6++] = class271.method1833((byte) -121, var83, var84);
                                                                                continue;
                                                                            }
                                                                            if (~var517 == -3303) {
                                                                                var6 -= 2;
                                                                                int var85 = class47.field739[var6];
                                                                                int var86 = class47.field739[var6 - -1];
                                                                                class47.field739[var6++] = class223.method1496(var86, 108, var85);
                                                                                continue;
                                                                            }
                                                                            if (var517 == 3303) {
                                                                                var6 -= 2;
                                                                                int var87 = class47.field739[var6];
                                                                                int var88 = class47.field739[var6 + 1];
                                                                                class47.field739[var6++] = class270.method1827(var87, var88, 27959);
                                                                                continue;
                                                                            }
                                                                            if (var517 == 3304) {
                                                                                --var6;
                                                                                int var89 = class47.field739[var6];
                                                                                class47.field739[var6++] = class263.method1790((byte) 32, var89).field2110;
                                                                                continue;
                                                                            }
                                                                            if (~var517 == -3306) {
                                                                                --var6;
                                                                                int var90 = class47.field739[var6];
                                                                                class47.field739[var6++] = class216.field3335[var90];
                                                                                continue;
                                                                            }
                                                                            if (~var517 == -3307) {
                                                                                --var6;
                                                                                int var91 = class47.field739[var6];
                                                                                class47.field739[var6++] = class77.field1285[var91];
                                                                                continue;
                                                                            }
                                                                            if (~var517 == -3308) {
                                                                                --var6;
                                                                                int var92 = class47.field739[var6];
                                                                                class47.field739[var6++] = class250.field3846[var92];
                                                                                continue;
                                                                            }
                                                                            if (var517 == 3308) {
                                                                                int var93 = class274.field4318;
                                                                                int var94 = (class261.field4058.field4176 >> 7) + class118.field1828;
                                                                                int var95 = (class261.field4058.field4123 >> 7) + class129.field2008;
                                                                                class47.field739[var6++] = (var93 << 28) + (var94 << 14) - -var95;
                                                                                continue;
                                                                            }
                                                                            if (var517 == 3309) {
                                                                                --var6;
                                                                                int var96 = class47.field739[var6];
                                                                                class47.field739[var6++] = class3.method48(var96, 268430777) >> 14;
                                                                                continue;
                                                                            }
                                                                            if (~var517 == -3311) {
                                                                                --var6;
                                                                                int var97 = class47.field739[var6];
                                                                                class47.field739[var6++] = var97 >> 28;
                                                                                continue;
                                                                            }
                                                                            if (var517 == 3311) {
                                                                                --var6;
                                                                                int var98 = class47.field739[var6];
                                                                                class47.field739[var6++] = class3.method48(var98, 16383);
                                                                                continue;
                                                                            }
                                                                            if (~var517 == -3313) {
                                                                                class47.field739[var6++] = class249.field3844 ? 1 : 0;
                                                                                continue;
                                                                            }
                                                                            if (var517 == 3313) {
                                                                                var6 -= 2;
                                                                                int var99 = class47.field739[var6] - -32768;
                                                                                int var100 = class47.field739[var6 + 1];
                                                                                class47.field739[var6++] = class271.method1833((byte) -106, var100, var99);
                                                                                continue;
                                                                            }
                                                                            if (var517 == 3314) {
                                                                                var6 -= 2;
                                                                                int var101 = class47.field739[var6 + 1];
                                                                                int var102 = class47.field739[var6] - -32768;
                                                                                class47.field739[var6++] = class223.method1496(var101, 122, var102);
                                                                                continue;
                                                                            }
                                                                            if (var517 == 3315) {
                                                                                var6 -= 2;
                                                                                int var103 = class47.field739[var6] + 32768;
                                                                                int var104 = class47.field739[var6 - -1];
                                                                                class47.field739[var6++] = class270.method1827(var103, var104, 27959);
                                                                                continue;
                                                                            }
                                                                            if (~var517 == -3317) {
                                                                                if (class259.field3968 >= 2) {
                                                                                    class47.field739[var6++] = class259.field3968;
                                                                                } else {
                                                                                    class47.field739[var6++] = 0;
                                                                                }
                                                                                continue;
                                                                            }
                                                                            if (var517 == 3317) {
                                                                                class47.field739[var6++] = class108.field1725;
                                                                                continue;
                                                                            }
                                                                            if (var517 == 3318) {
                                                                                class47.field739[var6++] = class155.field2358;
                                                                                continue;
                                                                            }
                                                                            if (~var517 == -3322) {
                                                                                class47.field739[var6++] = class158.field2434;
                                                                                continue;
                                                                            }
                                                                            if (var517 == 3322) {
                                                                                class47.field739[var6++] = class143.field2197;
                                                                                continue;
                                                                            }
                                                                            if (~var517 == -3324) {
                                                                                if (class209.field3253 >= 5 && ~class209.field3253 >= -10) {
                                                                                    class47.field739[var6++] = 1;
                                                                                    continue;
                                                                                }
                                                                                class47.field739[var6++] = 0;
                                                                                continue;
                                                                            }
                                                                            if (~var517 == -3325) {
                                                                                if (~class209.field3253 <= -6 && class209.field3253 <= 9) {
                                                                                    class47.field739[var6++] = class209.field3253;
                                                                                    continue;
                                                                                }
                                                                                class47.field739[var6++] = 0;
                                                                                continue;
                                                                            }
                                                                            if (~var517 == -3326) {
                                                                                class47.field739[var6++] = !class286.field4492 ? 0 : 1;
                                                                                continue;
                                                                            }
                                                                            if (~var517 == -3327) {
                                                                                class47.field739[var6++] = class261.field4058.field428;
                                                                                continue;
                                                                            }
                                                                            if (~var517 == -3328) {
                                                                                class47.field739[var6++] = class261.field4058.field440.field3752 ? 1 : 0;
                                                                                continue;
                                                                            }
                                                                            if (~var517 == -3329) {
                                                                                class47.field739[var6++] = class65.field1041 && !class31.field503 ? 1 : 0;
                                                                                continue;
                                                                            }
                                                                            if (var517 == 3329) {
                                                                                class47.field739[var6++] = class166.field2513 ? 1 : 0;
                                                                                continue;
                                                                            }
                                                                            if (var517 == 3330) {
                                                                                --var6;
                                                                                int var105 = class47.field739[var6];
                                                                                class47.field739[var6++] = class9.method108(var105, 71);
                                                                                continue;
                                                                            }
                                                                            if (~var517 == -3332) {
                                                                                var6 -= 2;
                                                                                int var106 = class47.field739[var6];
                                                                                int var107 = class47.field739[var6 - -1];
                                                                                class47.field739[var6++] = class222.method1483(false, var106, var107, (byte) -40);
                                                                                continue;
                                                                            }
                                                                            if (var517 == 3332) {
                                                                                var6 -= 2;
                                                                                int var108 = class47.field739[var6];
                                                                                int var109 = class47.field739[var6 + 1];
                                                                                class47.field739[var6++] = class222.method1483(true, var108, var109, (byte) -115);
                                                                                continue;
                                                                            }
                                                                            if (~var517 == -3334) {
                                                                                class47.field739[var6++] = class153.field2345;
                                                                                continue;
                                                                            }
                                                                            if (~var517 == -3336) {
                                                                                class47.field739[var6++] = class226.field3542;
                                                                                continue;
                                                                            }
                                                                            if (var517 == 3336) {
                                                                                var6 -= 4;
                                                                                int var110 = class47.field739[var6 + 2];
                                                                                int var111 = class47.field739[var6 + 1];
                                                                                int var112 = class47.field739[var6];
                                                                                int var113 = class47.field739[var6 + 3];
                                                                                int var114 = (var111 << 14) + var112;
                                                                                int var115 = (var110 << 28) + var114;
                                                                                int var116 = var113 + var115;
                                                                                class47.field739[var6++] = var116;
                                                                                continue;
                                                                            }
                                                                            if (~var517 == -3338) {
                                                                                class47.field739[var6++] = class274.field4315;
                                                                                continue;
                                                                            }
                                                                        } else if (~var517 > -3501) {
                                                                            if (var517 == 3400) {
                                                                                var6 -= 2;
                                                                                int var117 = class47.field739[var6];
                                                                                int var118 = class47.field739[var6 + 1];
                                                                                class21 var119 = class203.method1360(var117, (byte) 56);
                                                                                class179.field2682[var7++] = var119.method187(var118, 15424);
                                                                                continue;
                                                                            }
                                                                            if (var517 == 3408) {
                                                                                var6 -= 4;
                                                                                int var120 = class47.field739[var6 - -1];
                                                                                int var121 = class47.field739[var6];
                                                                                int var122 = class47.field739[var6 + 3];
                                                                                int var123 = class47.field739[var6 + 2];
                                                                                class21 var124 = class203.method1360(var123, (byte) 56);
                                                                                if (var124.field309 == var121 && var124.field315 == var120) {
                                                                                    if (var120 != 115) {
                                                                                        class47.field739[var6++] = var124.method184((byte) 59, var122);
                                                                                    } else {
                                                                                        class179.field2682[var7++] = var124.method187(var122, arg0 + 22190);
                                                                                    }
                                                                                    continue;
                                                                                }
                                                                                throw new RuntimeException("C3408-1");
                                                                            }
                                                                            if (var517 == 3409) {
                                                                                var6 -= 3;
                                                                                int var125 = class47.field739[var6];
                                                                                int var126 = class47.field739[var6 + 1];
                                                                                int var127 = class47.field739[var6 - -2];
                                                                                if (~var126 == 0) {
                                                                                    throw new RuntimeException("C3409-2");
                                                                                }
                                                                                class21 var128 = class203.method1360(var126, (byte) 56);
                                                                                if (var128.field315 != var125) {
                                                                                    throw new RuntimeException("C3409-1");
                                                                                }
                                                                                class47.field739[var6++] = !var128.method182(var127, (byte) -81) ? 0 : 1;
                                                                                continue;
                                                                            }
                                                                            if (var517 == 3410) {
                                                                                --var6;
                                                                                int var129 = class47.field739[var6];
                                                                                --var7;
                                                                                String var130 = class179.field2682[var7];
                                                                                if (var129 == -1) {
                                                                                    throw new RuntimeException("C3410-2");
                                                                                }
                                                                                class21 var131 = class203.method1360(var129, (byte) 56);
                                                                                if (var131.field315 != 's') {
                                                                                    throw new RuntimeException("C3410-1");
                                                                                }
                                                                                class47.field739[var6++] = !var131.method178((byte) -112, var130) ? 0 : 1;
                                                                                continue;
                                                                            }
                                                                            if (~var517 == -3412) {
                                                                                --var6;
                                                                                int var132 = class47.field739[var6];
                                                                                class21 var133 = class203.method1360(var132, (byte) 56);
                                                                                class47.field739[var6++] = var133.field314.method1417(arg0 + 28574);
                                                                                continue;
                                                                            }
                                                                        } else if (~var517 <= -3701) {
                                                                            if (var517 >= 4000) {
                                                                                if (~var517 > -4101) {
                                                                                    if (~var517 == -4001) {
                                                                                        var6 -= 2;
                                                                                        int var134 = class47.field739[var6];
                                                                                        int var135 = class47.field739[var6 + 1];
                                                                                        class47.field739[var6++] = var134 + var135;
                                                                                        continue;
                                                                                    }
                                                                                    if (~var517 == -4002) {
                                                                                        var6 -= 2;
                                                                                        int var136 = class47.field739[var6];
                                                                                        int var137 = class47.field739[var6 + 1];
                                                                                        class47.field739[var6++] = -var137 + var136;
                                                                                        continue;
                                                                                    }
                                                                                    if (var517 == 4002) {
                                                                                        var6 -= 2;
                                                                                        int var138 = class47.field739[var6 + 1];
                                                                                        int var139 = class47.field739[var6];
                                                                                        class47.field739[var6++] = var138 * var139;
                                                                                        continue;
                                                                                    }
                                                                                    if (var517 == 4003) {
                                                                                        var6 -= 2;
                                                                                        int var140 = class47.field739[var6];
                                                                                        int var141 = class47.field739[var6 - -1];
                                                                                        class47.field739[var6++] = var140 / var141;
                                                                                        continue;
                                                                                    }
                                                                                    if (~var517 == -4005) {
                                                                                        --var6;
                                                                                        int var142 = class47.field739[var6];
                                                                                        class47.field739[var6++] = (int) (Math.random() * (double) var142);
                                                                                        continue;
                                                                                    }
                                                                                    if (var517 == 4005) {
                                                                                        --var6;
                                                                                        int var143 = class47.field739[var6];
                                                                                        class47.field739[var6++] = (int) (Math.random() * (double) (var143 + 1));
                                                                                        continue;
                                                                                    }
                                                                                    if (var517 == 4006) {
                                                                                        var6 -= 5;
                                                                                        int var144 = class47.field739[var6 - -1];
                                                                                        int var145 = class47.field739[var6];
                                                                                        int var146 = class47.field739[var6 + 2];
                                                                                        int var147 = class47.field739[var6 + 3];
                                                                                        int var148 = class47.field739[var6 + 4];
                                                                                        class47.field739[var6++] = var145 - -((-var145 + var144) * (-var146 + var148) / (var147 - var146));
                                                                                        continue;
                                                                                    }
                                                                                    if (~var517 == -4008) {
                                                                                        var6 -= 2;
                                                                                        long var149 = (long) class47.field739[var6];
                                                                                        long var151 = (long) class47.field739[var6 + 1];
                                                                                        class47.field739[var6++] = (int) (var149 - -(var149 * var151 / 100L));
                                                                                        continue;
                                                                                    }
                                                                                    if (~var517 == -4009) {
                                                                                        var6 -= 2;
                                                                                        int var153 = class47.field739[var6 + 1];
                                                                                        int var154 = class47.field739[var6];
                                                                                        class47.field739[var6++] = class115.method840(var154, 1 << var153);
                                                                                        continue;
                                                                                    }
                                                                                    if (~var517 == -4010) {
                                                                                        var6 -= 2;
                                                                                        int var155 = class47.field739[var6];
                                                                                        int var156 = class47.field739[var6 - -1];
                                                                                        class47.field739[var6++] = class3.method48(var155, -(1 << var156) + -1);
                                                                                        continue;
                                                                                    }
                                                                                    if (~var517 == -4011) {
                                                                                        var6 -= 2;
                                                                                        int var157 = class47.field739[var6 + 1];
                                                                                        int var158 = class47.field739[var6];
                                                                                        class47.field739[var6++] = class3.method48(var158, 1 << var157) != 0 ? 1 : 0;
                                                                                        continue;
                                                                                    }
                                                                                    if (~var517 == -4012) {
                                                                                        var6 -= 2;
                                                                                        int var159 = class47.field739[var6];
                                                                                        int var160 = class47.field739[var6 - -1];
                                                                                        class47.field739[var6++] = var159 % var160;
                                                                                        continue;
                                                                                    }
                                                                                    if (~var517 == -4013) {
                                                                                        var6 -= 2;
                                                                                        int var161 = class47.field739[var6 + 1];
                                                                                        int var162 = class47.field739[var6];
                                                                                        if (~var162 == -1) {
                                                                                            class47.field739[var6++] = 0;
                                                                                        } else {
                                                                                            class47.field739[var6++] = (int) Math.pow((double) var162, (double) var161);
                                                                                        }
                                                                                        continue;
                                                                                    }
                                                                                    if (~var517 == -4014) {
                                                                                        var6 -= 2;
                                                                                        int var163 = class47.field739[var6];
                                                                                        int var164 = class47.field739[var6 + 1];
                                                                                        if (~var163 == -1) {
                                                                                            class47.field739[var6++] = 0;
                                                                                        } else if (var164 != 0) {
                                                                                            class47.field739[var6++] = (int) Math.pow((double) var163, 1.0D / (double) var164);
                                                                                        } else {
                                                                                            class47.field739[var6++] = Integer.MAX_VALUE;
                                                                                        }
                                                                                        continue;
                                                                                    }
                                                                                    if (var517 == 4014) {
                                                                                        var6 -= 2;
                                                                                        int var165 = class47.field739[var6];
                                                                                        int var166 = class47.field739[var6 - -1];
                                                                                        class47.field739[var6++] = class3.method48(var165, var166);
                                                                                        continue;
                                                                                    }
                                                                                    if (~var517 == -4016) {
                                                                                        var6 -= 2;
                                                                                        int var167 = class47.field739[var6 - -1];
                                                                                        int var168 = class47.field739[var6];
                                                                                        class47.field739[var6++] = class115.method840(var167, var168);
                                                                                        continue;
                                                                                    }
                                                                                    if (var517 == 4016) {
                                                                                        var6 -= 2;
                                                                                        int var169 = class47.field739[var6];
                                                                                        int var170 = class47.field739[var6 + 1];
                                                                                        class47.field739[var6++] = var170 > var169 ? var169 : var170;
                                                                                        continue;
                                                                                    }
                                                                                    if (~var517 == -4018) {
                                                                                        var6 -= 2;
                                                                                        int var171 = class47.field739[var6 + 1];
                                                                                        int var172 = class47.field739[var6];
                                                                                        class47.field739[var6++] = ~var171 > ~var172 ? var172 : var171;
                                                                                        continue;
                                                                                    }
                                                                                    if (~var517 == -4019) {
                                                                                        var6 -= 3;
                                                                                        long var173 = (long) class47.field739[var6];
                                                                                        long var175 = (long) class47.field739[var6 - -1];
                                                                                        long var177 = (long) class47.field739[var6 + 2];
                                                                                        class47.field739[var6++] = (int) (var173 * var177 / var175);
                                                                                        continue;
                                                                                    }
                                                                                } else if (~var517 > -4201) {
                                                                                    if (~var517 == -4101) {
                                                                                        --var7;
                                                                                        String var179 = class179.field2682[var7];
                                                                                        --var6;
                                                                                        int var180 = class47.field739[var6];
                                                                                        class179.field2682[var7++] = var179 + var180;
                                                                                        continue;
                                                                                    }
                                                                                    if (~var517 == -4102) {
                                                                                        var7 -= 2;
                                                                                        String var181 = class179.field2682[var7];
                                                                                        String var182 = class179.field2682[var7 + 1];
                                                                                        class179.field2682[var7++] = var181 + var182;
                                                                                        continue;
                                                                                    }
                                                                                    if (~var517 == -4103) {
                                                                                        --var7;
                                                                                        String var183 = class179.field2682[var7];
                                                                                        --var6;
                                                                                        int var184 = class47.field739[var6];
                                                                                        class179.field2682[var7++] = var183 + class238.method1607(var184, true, -17218);
                                                                                        continue;
                                                                                    }
                                                                                    if (var517 == 4103) {
                                                                                        --var7;
                                                                                        String var185 = class179.field2682[var7];
                                                                                        class179.field2682[var7++] = var185.toLowerCase();
                                                                                        continue;
                                                                                    }
                                                                                    if (~var517 == -4105) {
                                                                                        --var6;
                                                                                        int var186 = class47.field739[var6];
                                                                                        long var187 = ((long) var186 + 11745L) * 86400000L;
                                                                                        class41.field665.setTime(new Date(var187));
                                                                                        int var189 = class41.field665.get(5);
                                                                                        int var190 = class41.field665.get(2);
                                                                                        int var191 = class41.field665.get(1);
                                                                                        class179.field2682[var7++] = var189 + "-" + class28.field417[var190] + "-" + var191;
                                                                                        continue;
                                                                                    }
                                                                                    if (var517 == 4105) {
                                                                                        var7 -= 2;
                                                                                        String var192 = class179.field2682[var7 + 1];
                                                                                        String var193 = class179.field2682[var7];
                                                                                        if (class261.field4058.field440 != null && class261.field4058.field440.field3752) {
                                                                                            class179.field2682[var7++] = var192;
                                                                                            continue;
                                                                                        }
                                                                                        class179.field2682[var7++] = var193;
                                                                                        continue;
                                                                                    }
                                                                                    if (var517 == 4106) {
                                                                                        --var6;
                                                                                        int var194 = class47.field739[var6];
                                                                                        class179.field2682[var7++] = Integer.toString(var194);
                                                                                        continue;
                                                                                    }
                                                                                    if (var517 == 4107) {
                                                                                        var7 -= 2;
                                                                                        class47.field739[var6++] = class169.method1129(class208.method1391(class226.field3542, class179.field2682[var7 + 1], class179.field2682[var7], arg0 + 6742), (byte) 83);
                                                                                        continue;
                                                                                    }
                                                                                    if (~var517 == -4109) {
                                                                                        --var7;
                                                                                        String var195 = class179.field2682[var7];
                                                                                        var6 -= 2;
                                                                                        int var196 = class47.field739[var6];
                                                                                        int var197 = class47.field739[var6 + 1];
                                                                                        class47.field739[var6++] = class9.method101(-75, var197).method17(var195, var196);
                                                                                        continue;
                                                                                    }
                                                                                    if (var517 == 4109) {
                                                                                        var6 -= 2;
                                                                                        --var7;
                                                                                        String var198 = class179.field2682[var7];
                                                                                        int var199 = class47.field739[var6 + 1];
                                                                                        int var200 = class47.field739[var6];
                                                                                        class47.field739[var6++] = class9.method101(arg0 + 6653, var199).method31(var198, var200);
                                                                                        continue;
                                                                                    }
                                                                                    if (var517 == 4110) {
                                                                                        var7 -= 2;
                                                                                        String var201 = class179.field2682[var7 + 1];
                                                                                        String var202 = class179.field2682[var7];
                                                                                        --var6;
                                                                                        if (~class47.field739[var6] != -2) {
                                                                                            class179.field2682[var7++] = var201;
                                                                                        } else {
                                                                                            class179.field2682[var7++] = var202;
                                                                                        }
                                                                                        continue;
                                                                                    }
                                                                                    if (var517 == 4111) {
                                                                                        --var7;
                                                                                        String var203 = class179.field2682[var7];
                                                                                        class179.field2682[var7++] = class2.method25(var203);
                                                                                        continue;
                                                                                    }
                                                                                    if (~var517 == -4113) {
                                                                                        --var6;
                                                                                        int var204 = class47.field739[var6];
                                                                                        --var7;
                                                                                        String var205 = class179.field2682[var7];
                                                                                        if (~var204 == 0) {
                                                                                            throw new RuntimeException("null char");
                                                                                        }
                                                                                        class179.field2682[var7++] = var205 + (char) var204;
                                                                                        continue;
                                                                                    }
                                                                                    if (~var517 == -4114) {
                                                                                        --var6;
                                                                                        int var206 = class47.field739[var6];
                                                                                        class47.field739[var6++] = !class107.method810((char) var206, class76.method605(arg0, 6861)) ? 0 : 1;
                                                                                        continue;
                                                                                    }
                                                                                    if (~var517 == -4115) {
                                                                                        --var6;
                                                                                        int var207 = class47.field739[var6];
                                                                                        class47.field739[var6++] = class268.method1822(65, (char) var207) ? 1 : 0;
                                                                                        continue;
                                                                                    }
                                                                                    if (var517 == 4115) {
                                                                                        --var6;
                                                                                        int var208 = class47.field739[var6];
                                                                                        class47.field739[var6++] = class195.method1309(65, (char) var208) ? 1 : 0;
                                                                                        continue;
                                                                                    }
                                                                                    if (~var517 == -4117) {
                                                                                        --var6;
                                                                                        int var209 = class47.field739[var6];
                                                                                        class47.field739[var6++] = !class139.method962((char) var209, -49) ? 0 : 1;
                                                                                        continue;
                                                                                    }
                                                                                    if (~var517 == -4118) {
                                                                                        --var7;
                                                                                        String var210 = class179.field2682[var7];
                                                                                        if (var210 != null) {
                                                                                            class47.field739[var6++] = var210.length();
                                                                                        } else {
                                                                                            class47.field739[var6++] = 0;
                                                                                        }
                                                                                        continue;
                                                                                    }
                                                                                    if (~var517 == -4119) {
                                                                                        var6 -= 2;
                                                                                        int var211 = class47.field739[var6];
                                                                                        --var7;
                                                                                        String var212 = class179.field2682[var7];
                                                                                        int var213 = class47.field739[var6 + 1];
                                                                                        class179.field2682[var7++] = var212.substring(var211, var213);
                                                                                        continue;
                                                                                    }
                                                                                    if (~var517 == -4120) {
                                                                                        --var7;
                                                                                        String var214 = class179.field2682[var7];
                                                                                        StringBuffer var215 = new StringBuffer(var214.length());
                                                                                        boolean var216 = false;
                                                                                        for (int var217 = 0; var217 < var214.length(); ++var217) {
                                                                                            char var218 = var214.charAt(var217);
                                                                                            if (~var218 == -61) {
                                                                                                var216 = true;
                                                                                            } else if (~var218 == -63) {
                                                                                                var216 = false;
                                                                                            } else if (!var216) {
                                                                                                var215.append(var218);
                                                                                            }
                                                                                        }
                                                                                        class179.field2682[var7++] = var215.toString();
                                                                                        continue;
                                                                                    }
                                                                                    if (var517 == 4120) {
                                                                                        var6 -= 2;
                                                                                        --var7;
                                                                                        String var219 = class179.field2682[var7];
                                                                                        int var220 = class47.field739[var6];
                                                                                        int var221 = class47.field739[var6 + 1];
                                                                                        class47.field739[var6++] = var219.indexOf(var220, var221);
                                                                                        continue;
                                                                                    }
                                                                                    if (var517 == 4121) {
                                                                                        var7 -= 2;
                                                                                        String var222 = class179.field2682[var7];
                                                                                        String var223 = class179.field2682[var7 + 1];
                                                                                        --var6;
                                                                                        int var224 = class47.field739[var6];
                                                                                        class47.field739[var6++] = var222.indexOf(var223, var224);
                                                                                        continue;
                                                                                    }
                                                                                    if (var517 == 4122) {
                                                                                        --var6;
                                                                                        int var225 = class47.field739[var6];
                                                                                        class47.field739[var6++] = Character.toLowerCase((char) var225);
                                                                                        continue;
                                                                                    }
                                                                                    if (~var517 == -4124) {
                                                                                        --var6;
                                                                                        int var226 = class47.field739[var6];
                                                                                        class47.field739[var6++] = Character.toUpperCase((char) var226);
                                                                                        continue;
                                                                                    }
                                                                                    if (~var517 == -4125) {
                                                                                        --var6;
                                                                                        boolean var227 = class47.field739[var6] != 0;
                                                                                        --var6;
                                                                                        int var228 = class47.field739[var6];
                                                                                        class179.field2682[var7++] = class176.method1178(class226.field3542, 0, true, var227, (long) var228);
                                                                                        continue;
                                                                                    }
                                                                                } else if (~var517 <= -4301) {
                                                                                    if (var517 >= 4400) {
                                                                                        if (~var517 <= -4501) {
                                                                                            if (~var517 > -4601) {
                                                                                                if (var517 == 4500) {
                                                                                                    var6 -= 2;
                                                                                                    int var229 = class47.field739[var6];
                                                                                                    int var230 = class47.field739[var6 + 1];
                                                                                                    class289 var231 = class31.method250(var230, -89);
                                                                                                    if (var231.method1948((byte) -122)) {
                                                                                                        class179.field2682[var7++] = class47.method383(true, var229).method1576(var231.field4549, (byte) -47, var230);
                                                                                                    } else {
                                                                                                        class47.field739[var6++] = class47.method383(true, var229).method1578(-16, var231.field4557, var230);
                                                                                                    }
                                                                                                    continue;
                                                                                                }
                                                                                            } else if (var517 < 5100) {
                                                                                                if (~var517 == -5001) {
                                                                                                    class47.field739[var6++] = class290.field4573;
                                                                                                    continue;
                                                                                                }
                                                                                                if (var517 == 5001) {
                                                                                                    ++class56.field861;
                                                                                                    var6 -= 3;
                                                                                                    class290.field4573 = class47.field739[var6];
                                                                                                    class214.field3297 = class47.field739[var6 + 1];
                                                                                                    class219.field3428 = class47.field739[var6 + 2];
                                                                                                    class292.field4607.method1251(26, (byte) -50);
                                                                                                    class292.field4607.method287(440742616, class290.field4573);
                                                                                                    class292.field4607.method287(arg0 ^ -440740022, class214.field3297);
                                                                                                    class292.field4607.method287(440742616, class219.field3428);
                                                                                                    continue;
                                                                                                }
                                                                                                if (var517 == 5002) {
                                                                                                    var6 -= 2;
                                                                                                    ++class285.field4490;
                                                                                                    int var232 = class47.field739[var6];
                                                                                                    --var7;
                                                                                                    String var233 = class179.field2682[var7];
                                                                                                    int var234 = class47.field739[var6 + 1];
                                                                                                    class292.field4607.method1251(88, (byte) -22);
                                                                                                    class292.field4607.method337(2103219728, class247.method1668(var233, true));
                                                                                                    class292.field4607.method287(440742616, var232 + -1);
                                                                                                    class292.field4607.method287(440742616, var234);
                                                                                                    continue;
                                                                                                }
                                                                                                if (~var517 == -5004) {
                                                                                                    --var6;
                                                                                                    int var235 = class47.field739[var6];
                                                                                                    String var236 = null;
                                                                                                    if (var235 < 100) {
                                                                                                        var236 = class117.field1817[var235];
                                                                                                    }
                                                                                                    if (var236 == null) {
                                                                                                        var236 = "";
                                                                                                    }
                                                                                                    class179.field2682[var7++] = var236;
                                                                                                    continue;
                                                                                                }
                                                                                                if (~var517 == -5005) {
                                                                                                    --var6;
                                                                                                    int var237 = class47.field739[var6];
                                                                                                    int var238 = -1;
                                                                                                    if (var237 < 100 && class117.field1817[var237] != null) {
                                                                                                        var238 = class108.field1721[var237];
                                                                                                    }
                                                                                                    class47.field739[var6++] = var238;
                                                                                                    continue;
                                                                                                }
                                                                                                if (var517 == 5005) {
                                                                                                    class47.field739[var6++] = class214.field3297;
                                                                                                    continue;
                                                                                                }
                                                                                                if (var517 == 5008) {
                                                                                                    --var7;
                                                                                                    String var239 = class179.field2682[var7];
                                                                                                    if (var239.startsWith("::")) {
                                                                                                        class142.method982(var239, false);
                                                                                                        continue;
                                                                                                    }
                                                                                                    if (class259.field3968 == 0 && (class65.field1041 && !class31.field503 || class166.field2513)) {
                                                                                                        continue;
                                                                                                    }
                                                                                                    ++class212.field3292;
                                                                                                    String var240 = var239.toLowerCase();
                                                                                                    byte var241 = 0;
                                                                                                    byte var242 = 0;
                                                                                                    if (!var240.startsWith(class293.field4614)) {
                                                                                                        if (var240.startsWith(class134.field2092)) {
                                                                                                            var239 = var239.substring(class134.field2092.length());
                                                                                                            var242 = 1;
                                                                                                        } else if (!var240.startsWith(class48.field794)) {
                                                                                                            if (!var240.startsWith(class154.field2357)) {
                                                                                                                if (var240.startsWith(class171.field2551)) {
                                                                                                                    var242 = 4;
                                                                                                                    var239 = var239.substring(class171.field2551.length());
                                                                                                                } else if (!var240.startsWith(class137.field2128)) {
                                                                                                                    if (!var240.startsWith(class139.field2136)) {
                                                                                                                        if (var240.startsWith(class278.field4375)) {
                                                                                                                            var239 = var239.substring(class278.field4375.length());
                                                                                                                            var242 = 7;
                                                                                                                        } else if (!var240.startsWith(class17.field282)) {
                                                                                                                            if (!var240.startsWith(class151.field2337)) {
                                                                                                                                if (!var240.startsWith(class252.field3879)) {
                                                                                                                                    if (!var240.startsWith(class291.field4585)) {
                                                                                                                                        if (~class226.field3542 != -1) {
                                                                                                                                            if (var240.startsWith(class226.field3544)) {
                                                                                                                                                var242 = 0;
                                                                                                                                                var239 = var239.substring(class226.field3544.length());
                                                                                                                                            } else if (var240.startsWith(class35.field559)) {
                                                                                                                                                var239 = var239.substring(class35.field559.length());
                                                                                                                                                var242 = 1;
                                                                                                                                            } else if (!var240.startsWith(class174.field2584)) {
                                                                                                                                                if (var240.startsWith(class134.field2103)) {
                                                                                                                                                    var239 = var239.substring(class134.field2103.length());
                                                                                                                                                    var242 = 3;
                                                                                                                                                } else if (var240.startsWith(class143.field2207)) {
                                                                                                                                                    var242 = 4;
                                                                                                                                                    var239 = var239.substring(class143.field2207.length());
                                                                                                                                                } else if (var240.startsWith(class25.field389)) {
                                                                                                                                                    var239 = var239.substring(class25.field389.length());
                                                                                                                                                    var242 = 5;
                                                                                                                                                } else if (var240.startsWith(class31.field496)) {
                                                                                                                                                    var239 = var239.substring(class31.field496.length());
                                                                                                                                                    var242 = 6;
                                                                                                                                                } else if (var240.startsWith(class22.field328)) {
                                                                                                                                                    var239 = var239.substring(class22.field328.length());
                                                                                                                                                    var242 = 7;
                                                                                                                                                } else if (!var240.startsWith(class142.field2181)) {
                                                                                                                                                    if (var240.startsWith(class259.field3984)) {
                                                                                                                                                        var242 = 9;
                                                                                                                                                        var239 = var239.substring(class259.field3984.length());
                                                                                                                                                    } else if (!var240.startsWith(class120.field1857)) {
                                                                                                                                                        if (var240.startsWith(class69.field1099)) {
                                                                                                                                                            var239 = var239.substring(class69.field1099.length());
                                                                                                                                                            var242 = 11;
                                                                                                                                                        }
                                                                                                                                                    } else {
                                                                                                                                                        var239 = var239.substring(class120.field1857.length());
                                                                                                                                                        var242 = 10;
                                                                                                                                                    }
                                                                                                                                                } else {
                                                                                                                                                    var242 = 8;
                                                                                                                                                    var239 = var239.substring(class142.field2181.length());
                                                                                                                                                }
                                                                                                                                            } else {
                                                                                                                                                var242 = 2;
                                                                                                                                                var239 = var239.substring(class174.field2584.length());
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        var242 = 11;
                                                                                                                                        var239 = var239.substring(class291.field4585.length());
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    var242 = 10;
                                                                                                                                    var239 = var239.substring(class252.field3879.length());
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                var239 = var239.substring(class151.field2337.length());
                                                                                                                                var242 = 9;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            var242 = 8;
                                                                                                                            var239 = var239.substring(class17.field282.length());
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        var239 = var239.substring(class139.field2136.length());
                                                                                                                        var242 = 6;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    var242 = 5;
                                                                                                                    var239 = var239.substring(class137.field2128.length());
                                                                                                                }
                                                                                                            } else {
                                                                                                                var242 = 3;
                                                                                                                var239 = var239.substring(class154.field2357.length());
                                                                                                            }
                                                                                                        } else {
                                                                                                            var239 = var239.substring(class48.field794.length());
                                                                                                            var242 = 2;
                                                                                                        }
                                                                                                    } else {
                                                                                                        var239 = var239.substring(class293.field4614.length());
                                                                                                        var242 = 0;
                                                                                                    }
                                                                                                    String var243 = var239.toLowerCase();
                                                                                                    if (var243.startsWith(class44.field710)) {
                                                                                                        var241 = 1;
                                                                                                        var239 = var239.substring(class44.field710.length());
                                                                                                    } else if (var243.startsWith(class258.field3954)) {
                                                                                                        var239 = var239.substring(class258.field3954.length());
                                                                                                        var241 = 2;
                                                                                                    } else if (!var243.startsWith(class173.field2573)) {
                                                                                                        if (!var243.startsWith(class100.field1599)) {
                                                                                                            if (var243.startsWith(class74.field1241)) {
                                                                                                                var241 = 5;
                                                                                                                var239 = var239.substring(class74.field1241.length());
                                                                                                            } else if (~class226.field3542 != -1) {
                                                                                                                if (var243.startsWith(class160.field2447)) {
                                                                                                                    var239 = var239.substring(class160.field2447.length());
                                                                                                                    var241 = 1;
                                                                                                                } else if (!var243.startsWith(class214.field3308)) {
                                                                                                                    if (var243.startsWith(class119.field1843)) {
                                                                                                                        var239 = var239.substring(class119.field1843.length());
                                                                                                                        var241 = 3;
                                                                                                                    } else if (!var243.startsWith(class64.field1026)) {
                                                                                                                        if (var243.startsWith(class292.field4602)) {
                                                                                                                            var239 = var239.substring(class292.field4602.length());
                                                                                                                            var241 = 5;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        var241 = 4;
                                                                                                                        var239 = var239.substring(class64.field1026.length());
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    var241 = 2;
                                                                                                                    var239 = var239.substring(class214.field3308.length());
                                                                                                                }
                                                                                                            }
                                                                                                        } else {
                                                                                                            var241 = 4;
                                                                                                            var239 = var239.substring(class100.field1599.length());
                                                                                                        }
                                                                                                    } else {
                                                                                                        var239 = var239.substring(class173.field2573.length());
                                                                                                        var241 = 3;
                                                                                                    }
                                                                                                    class292.field4607.method1251(147, (byte) -32);
                                                                                                    class292.field4607.method287(440742616, 0);
                                                                                                    int var244 = class292.field4607.field588;
                                                                                                    class292.field4607.method287(arg0 + 440749382, var242);
                                                                                                    class292.field4607.method287(440742616, var241);
                                                                                                    class169.method1124(class292.field4607, -57, var239);
                                                                                                    class292.field4607.method339(-var244 + class292.field4607.field588, 440742616);
                                                                                                    continue;
                                                                                                }
                                                                                                if (var517 == 5009) {
                                                                                                    var7 -= 2;
                                                                                                    String var245 = class179.field2682[var7];
                                                                                                    String var246 = class179.field2682[var7 + 1];
                                                                                                    if (class259.field3968 != 0 || (!class65.field1041 || class31.field503) && !class166.field2513) {
                                                                                                        class292.field4607.method1251(66, (byte) -101);
                                                                                                        class292.field4607.method287(440742616, 0);
                                                                                                        ++class131.field2026;
                                                                                                        int var247 = class292.field4607.field588;
                                                                                                        class292.field4607.method337(arg0 ^ -2103217278, class247.method1668(var245, true));
                                                                                                        class169.method1124(class292.field4607, -69, var246);
                                                                                                        class292.field4607.method339(-var247 + class292.field4607.field588, 440742616);
                                                                                                    }
                                                                                                    continue;
                                                                                                }
                                                                                                if (~var517 == -5011) {
                                                                                                    --var6;
                                                                                                    int var248 = class47.field739[var6];
                                                                                                    String var249 = null;
                                                                                                    if (~var248 > -101) {
                                                                                                        var249 = class265.field4224[var248];
                                                                                                    }
                                                                                                    if (var249 == null) {
                                                                                                        var249 = "";
                                                                                                    }
                                                                                                    class179.field2682[var7++] = var249;
                                                                                                    continue;
                                                                                                }
                                                                                                if (~var517 == -5012) {
                                                                                                    --var6;
                                                                                                    int var250 = class47.field739[var6];
                                                                                                    String var251 = null;
                                                                                                    if (var250 < 100) {
                                                                                                        var251 = class286.field4495[var250];
                                                                                                    }
                                                                                                    if (var251 == null) {
                                                                                                        var251 = "";
                                                                                                    }
                                                                                                    class179.field2682[var7++] = var251;
                                                                                                    continue;
                                                                                                }
                                                                                                if (var517 == 5012) {
                                                                                                    --var6;
                                                                                                    int var252 = class47.field739[var6];
                                                                                                    int var253 = -1;
                                                                                                    if (~var252 > -101) {
                                                                                                        var253 = class42.field678[var252];
                                                                                                    }
                                                                                                    class47.field739[var6++] = var253;
                                                                                                    continue;
                                                                                                }
                                                                                                if (var517 == 5015) {
                                                                                                    String var254;
                                                                                                    if (class261.field4058 != null && class261.field4058.field446 != null) {
                                                                                                        var254 = class261.field4058.method222(0);
                                                                                                    } else {
                                                                                                        var254 = class148.field2282;
                                                                                                    }
                                                                                                    class179.field2682[var7++] = var254;
                                                                                                    continue;
                                                                                                }
                                                                                                if (var517 == 5016) {
                                                                                                    class47.field739[var6++] = class219.field3428;
                                                                                                    continue;
                                                                                                }
                                                                                                if (~var517 == -5018) {
                                                                                                    class47.field739[var6++] = class108.field1723;
                                                                                                    continue;
                                                                                                }
                                                                                                if (var517 == 5050) {
                                                                                                    --var6;
                                                                                                    int var255 = class47.field739[var6];
                                                                                                    class179.field2682[var7++] = class195.method1306(28489, var255).field558;
                                                                                                    continue;
                                                                                                }
                                                                                                if (var517 == 5051) {
                                                                                                    --var6;
                                                                                                    int var256 = class47.field739[var6];
                                                                                                    class35 var257 = class195.method1306(28489, var256);
                                                                                                    if (var257.field563 != null) {
                                                                                                        class47.field739[var6++] = var257.field563.length;
                                                                                                    } else {
                                                                                                        class47.field739[var6++] = 0;
                                                                                                    }
                                                                                                    continue;
                                                                                                }
                                                                                                if (var517 == 5052) {
                                                                                                    var6 -= 2;
                                                                                                    int var258 = class47.field739[var6];
                                                                                                    int var259 = class47.field739[var6 - -1];
                                                                                                    class35 var260 = class195.method1306(28489, var258);
                                                                                                    int var261 = var260.field563[var259];
                                                                                                    class47.field739[var6++] = var261;
                                                                                                    continue;
                                                                                                }
                                                                                                if (~var517 == -5054) {
                                                                                                    --var6;
                                                                                                    int var262 = class47.field739[var6];
                                                                                                    class35 var263 = class195.method1306(arg0 + 35255, var262);
                                                                                                    if (var263.field556 != null) {
                                                                                                        class47.field739[var6++] = var263.field556.length;
                                                                                                    } else {
                                                                                                        class47.field739[var6++] = 0;
                                                                                                    }
                                                                                                    continue;
                                                                                                }
                                                                                                if (var517 == 5054) {
                                                                                                    var6 -= 2;
                                                                                                    int var264 = class47.field739[var6];
                                                                                                    int var265 = class47.field739[var6 + 1];
                                                                                                    class47.field739[var6++] = class195.method1306(class76.method605(arg0, -29989), var264).field556[var265];
                                                                                                    continue;
                                                                                                }
                                                                                                if (~var517 == -5056) {
                                                                                                    --var6;
                                                                                                    int var266 = class47.field739[var6];
                                                                                                    class179.field2682[var7++] = class266.method1810((byte) 114, var266).method1616(-74);
                                                                                                    continue;
                                                                                                }
                                                                                                if (~var517 == -5057) {
                                                                                                    --var6;
                                                                                                    int var267 = class47.field739[var6];
                                                                                                    class239 var268 = class266.method1810((byte) 122, var267);
                                                                                                    if (var268.field3704 == null) {
                                                                                                        class47.field739[var6++] = 0;
                                                                                                    } else {
                                                                                                        class47.field739[var6++] = var268.field3704.length;
                                                                                                    }
                                                                                                    continue;
                                                                                                }
                                                                                                if (var517 == 5057) {
                                                                                                    var6 -= 2;
                                                                                                    int var269 = class47.field739[var6];
                                                                                                    int var270 = class47.field739[var6 + 1];
                                                                                                    class47.field739[var6++] = class266.method1810((byte) 121, var269).field3704[var270];
                                                                                                    continue;
                                                                                                }
                                                                                                if (~var517 == -5059) {
                                                                                                    class292.field4608 = new class18();
                                                                                                    --var6;
                                                                                                    class292.field4608.field288 = class47.field739[var6];
                                                                                                    class292.field4608.field286 = class266.method1810((byte) 120, class292.field4608.field288);
                                                                                                    class292.field4608.field287 = new int[class292.field4608.field286.method1620(arg0 + 6767)];
                                                                                                    continue;
                                                                                                }
                                                                                                if (~var517 == -5060) {
                                                                                                    ++class189.field3017;
                                                                                                    class292.field4607.method1251(41, (byte) -14);
                                                                                                    class292.field4607.method287(440742616, 0);
                                                                                                    int var271 = class292.field4607.field588;
                                                                                                    class292.field4607.method287(440742616, 0);
                                                                                                    class292.field4607.method312(1489253544, class292.field4608.field288);
                                                                                                    class292.field4608.field286.method1617(class292.field4608.field287, false, class292.field4607);
                                                                                                    class292.field4607.method339(-var271 + class292.field4607.field588, 440742616);
                                                                                                    continue;
                                                                                                }
                                                                                                if (var517 == 5060) {
                                                                                                    --var7;
                                                                                                    String var272 = class179.field2682[var7];
                                                                                                    ++class186.field2794;
                                                                                                    class292.field4607.method1251(5, (byte) -83);
                                                                                                    class292.field4607.method287(440742616, 0);
                                                                                                    int var273 = class292.field4607.field588;
                                                                                                    class292.field4607.method337(arg0 + 2103226494, class247.method1668(var272, true));
                                                                                                    class292.field4607.method312(arg0 ^ -1489252038, class292.field4608.field288);
                                                                                                    class292.field4608.field286.method1617(class292.field4608.field287, false, class292.field4607);
                                                                                                    class292.field4607.method339(-var273 + class292.field4607.field588, 440742616);
                                                                                                    continue;
                                                                                                }
                                                                                                if (~var517 == -5062) {
                                                                                                    ++class189.field3017;
                                                                                                    class292.field4607.method1251(41, (byte) -51);
                                                                                                    class292.field4607.method287(440742616, 0);
                                                                                                    int var274 = class292.field4607.field588;
                                                                                                    class292.field4607.method287(arg0 + 440749382, 1);
                                                                                                    class292.field4607.method312(arg0 ^ -1489252038, class292.field4608.field288);
                                                                                                    class292.field4608.field286.method1617(class292.field4608.field287, false, class292.field4607);
                                                                                                    class292.field4607.method339(-var274 + class292.field4607.field588, 440742616);
                                                                                                    continue;
                                                                                                }
                                                                                                if (~var517 == -5063) {
                                                                                                    var6 -= 2;
                                                                                                    int var275 = class47.field739[var6 + 1];
                                                                                                    int var276 = class47.field739[var6];
                                                                                                    class47.field739[var6++] = class195.method1306(28489, var276).field566[var275];
                                                                                                    continue;
                                                                                                }
                                                                                                if (~var517 == -5064) {
                                                                                                    var6 -= 2;
                                                                                                    int var277 = class47.field739[var6 + 1];
                                                                                                    int var278 = class47.field739[var6];
                                                                                                    class47.field739[var6++] = class195.method1306(28489, var278).field562[var277];
                                                                                                    continue;
                                                                                                }
                                                                                                if (~var517 == -5065) {
                                                                                                    var6 -= 2;
                                                                                                    int var279 = class47.field739[var6];
                                                                                                    int var280 = class47.field739[var6 + 1];
                                                                                                    if (~var280 == 0) {
                                                                                                        class47.field739[var6++] = -1;
                                                                                                    } else {
                                                                                                        class47.field739[var6++] = class195.method1306(28489, var279).method273(false, (char) var280);
                                                                                                    }
                                                                                                    continue;
                                                                                                }
                                                                                                if (var517 == 5065) {
                                                                                                    var6 -= 2;
                                                                                                    int var281 = class47.field739[var6 - -1];
                                                                                                    int var282 = class47.field739[var6];
                                                                                                    if (var281 == -1) {
                                                                                                        class47.field739[var6++] = -1;
                                                                                                    } else {
                                                                                                        class47.field739[var6++] = class195.method1306(28489, var282).method278((byte) 109, (char) var281);
                                                                                                    }
                                                                                                    continue;
                                                                                                }
                                                                                                if (var517 == 5066) {
                                                                                                    --var6;
                                                                                                    int var283 = class47.field739[var6];
                                                                                                    class47.field739[var6++] = class266.method1810((byte) 115, var283).method1620(1);
                                                                                                    continue;
                                                                                                }
                                                                                                if (~var517 == -5068) {
                                                                                                    var6 -= 2;
                                                                                                    int var284 = class47.field739[var6 + 1];
                                                                                                    int var285 = class47.field739[var6];
                                                                                                    int var286 = class266.method1810((byte) 122, var285).method1613(var284, 16);
                                                                                                    class47.field739[var6++] = var286;
                                                                                                    continue;
                                                                                                }
                                                                                                if (var517 == 5068) {
                                                                                                    var6 -= 2;
                                                                                                    int var287 = class47.field739[var6 + 1];
                                                                                                    int var288 = class47.field739[var6];
                                                                                                    class292.field4608.field287[var288] = var287;
                                                                                                    continue;
                                                                                                }
                                                                                                if (var517 == 5069) {
                                                                                                    var6 -= 2;
                                                                                                    int var289 = class47.field739[var6];
                                                                                                    int var290 = class47.field739[var6 + 1];
                                                                                                    class292.field4608.field287[var289] = var290;
                                                                                                    continue;
                                                                                                }
                                                                                                if (~var517 == -5071) {
                                                                                                    var6 -= 3;
                                                                                                    int var291 = class47.field739[var6];
                                                                                                    int var292 = class47.field739[var6 + 1];
                                                                                                    int var293 = class47.field739[var6 - -2];
                                                                                                    class239 var294 = class266.method1810((byte) 120, var291);
                                                                                                    if (var294.method1613(var292, 16) != 0) {
                                                                                                        throw new RuntimeException("bad command");
                                                                                                    }
                                                                                                    class47.field739[var6++] = var294.method1610((byte) 120, var293, var292);
                                                                                                    continue;
                                                                                                }
                                                                                                if (var517 == 5071) {
                                                                                                    --var7;
                                                                                                    String var295 = class179.field2682[var7];
                                                                                                    --var6;
                                                                                                    boolean var296 = ~class47.field739[var6] == -2;
                                                                                                    class288.method1937((byte) 124, var295, var296);
                                                                                                    class47.field739[var6++] = class16.field256;
                                                                                                    continue;
                                                                                                }
                                                                                                if (var517 == 5072) {
                                                                                                    if (class98.field1571 != null && class16.field256 > class28.field424) {
                                                                                                        class47.field739[var6++] = class3.method48(class98.field1571[class28.field424++], 65535);
                                                                                                        continue;
                                                                                                    }
                                                                                                    class47.field739[var6++] = -1;
                                                                                                    continue;
                                                                                                }
                                                                                                if (var517 == 5073) {
                                                                                                    class28.field424 = 0;
                                                                                                    continue;
                                                                                                }
                                                                                            } else if (var517 < 5200) {
                                                                                                if (~var517 == -5101) {
                                                                                                    if (!class145.field2256[86]) {
                                                                                                        class47.field739[var6++] = 0;
                                                                                                    } else {
                                                                                                        class47.field739[var6++] = 1;
                                                                                                    }
                                                                                                    continue;
                                                                                                }
                                                                                                if (var517 == 5101) {
                                                                                                    if (class145.field2256[82]) {
                                                                                                        class47.field739[var6++] = 1;
                                                                                                    } else {
                                                                                                        class47.field739[var6++] = 0;
                                                                                                    }
                                                                                                    continue;
                                                                                                }
                                                                                                if (var517 == 5102) {
                                                                                                    if (class145.field2256[81]) {
                                                                                                        class47.field739[var6++] = 1;
                                                                                                    } else {
                                                                                                        class47.field739[var6++] = 0;
                                                                                                    }
                                                                                                    continue;
                                                                                                }
                                                                                            } else if (var517 >= 5300) {
                                                                                                if (~var517 <= -5401) {
                                                                                                    if (var517 < 5500) {
                                                                                                        if (var517 == 5400) {
                                                                                                            ++class277.field4363;
                                                                                                            var7 -= 2;
                                                                                                            String var297 = class179.field2682[var7];
                                                                                                            String var298 = class179.field2682[var7 - -1];
                                                                                                            --var6;
                                                                                                            int var299 = class47.field739[var6];
                                                                                                            class292.field4607.method1251(33, (byte) -123);
                                                                                                            class292.field4607.method287(arg0 ^ -440740022, 1 + class39.method343(var297, 5509) + class39.method343(var298, arg0 + 12275));
                                                                                                            class292.field4607.method321(126, var297);
                                                                                                            class292.field4607.method321(-31, var298);
                                                                                                            class292.field4607.method287(arg0 + 440749382, var299);
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (var517 == 5401) {
                                                                                                            var6 -= 2;
                                                                                                            class18.field290[class47.field739[var6]] = (short) class139.method965(class47.field739[var6 - -1], (byte) 120);
                                                                                                            class74.method591(false);
                                                                                                            method494(1);
                                                                                                            class57.method460(arg0 + 6764);
                                                                                                            class19.method167((byte) 123);
                                                                                                            class172.method1139(122);
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (~var517 == -5406) {
                                                                                                            var6 -= 2;
                                                                                                            int var300 = class47.field739[var6];
                                                                                                            int var301 = class47.field739[var6 + 1];
                                                                                                            if (var300 >= 0 && var300 < 2) {
                                                                                                                class261.field4059[var300] = new int[var301 << 1][4];
                                                                                                            }
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (var517 == 5406) {
                                                                                                            var6 -= 7;
                                                                                                            int var302 = class47.field739[var6];
                                                                                                            int var303 = class47.field739[var6 + 1] << 1;
                                                                                                            int var304 = class47.field739[var6 + 3];
                                                                                                            int var305 = class47.field739[var6 - -2];
                                                                                                            int var306 = class47.field739[var6 - -5];
                                                                                                            int var307 = class47.field739[var6 + 4];
                                                                                                            int var308 = class47.field739[var6 + 6];
                                                                                                            if (var302 >= 0 && ~var302 > -3 && class261.field4059[var302] != null && var303 >= 0 && ~var303 > ~class261.field4059[var302].length) {
                                                                                                                class261.field4059[var302][var303] = new int[] { class3.method48(16383, var305 >> 14) * 128, var304, class3.method48(var305, 16383) * 128, var308 };
                                                                                                                class261.field4059[var302][var303 - -1] = new int[] { 128 * (class3.method48(268431142, var307) >> 14), var306, 128 * class3.method48(var307, 16383) };
                                                                                                            }
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (~var517 == -5408) {
                                                                                                            --var6;
                                                                                                            int var309 = class261.field4059[class47.field739[var6]].length >> 1;
                                                                                                            class47.field739[var6++] = var309;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (var517 == 5411) {
                                                                                                            if (class239.field3716 == null) {
                                                                                                                method492(class283.method1898((byte) 46), false, (byte) 43);
                                                                                                            } else {
                                                                                                                System.exit(0);
                                                                                                            }
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (var517 == 5419) {
                                                                                                            String var310 = "";
                                                                                                            if (class55.field854 != null) {
                                                                                                                if (class55.field854.field3831 == null) {
                                                                                                                    var310 = class204.method1370(false, class55.field854.field3833);
                                                                                                                } else {
                                                                                                                    var310 = (String) class55.field854.field3831;
                                                                                                                }
                                                                                                            }
                                                                                                            class179.field2682[var7++] = var310;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (~var517 == -5421) {
                                                                                                            class47.field739[var6++] = class59.field927 == 3 ? 1 : 0;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (~var517 == -5422) {
                                                                                                            --var7;
                                                                                                            String var311 = class179.field2682[var7];
                                                                                                            --var6;
                                                                                                            boolean var312 = ~class47.field739[var6] == -2;
                                                                                                            String var313 = class283.method1898((byte) 46) + var311;
                                                                                                            if (class239.field3716 != null || var312 && class59.field927 != 3 && class59.field939.startsWith("win") && !class157.field2416) {
                                                                                                                class35.field561 = var313;
                                                                                                                class140.field2154 = var312;
                                                                                                                class10.field196 = class22.field329.method479(var313, 95);
                                                                                                                continue;
                                                                                                            }
                                                                                                            method492(var313, var312, (byte) 43);
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (var517 == 5422) {
                                                                                                            var7 -= 2;
                                                                                                            String var314 = class179.field2682[var7];
                                                                                                            String var315 = class179.field2682[var7 - -1];
                                                                                                            --var6;
                                                                                                            int var316 = class47.field739[var6];
                                                                                                            if (var314.length() > 0) {
                                                                                                                if (class254.field3899 == null) {
                                                                                                                    class254.field3899 = new String[class4.field55[class154.field2352]];
                                                                                                                }
                                                                                                                class254.field3899[var316] = var314;
                                                                                                            }
                                                                                                            if (~var315.length() < -1) {
                                                                                                                if (class222.field3480 == null) {
                                                                                                                    class222.field3480 = new String[class4.field55[class154.field2352]];
                                                                                                                }
                                                                                                                class222.field3480[var316] = var315;
                                                                                                            }
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (var517 == 5423) {
                                                                                                            --var7;
                                                                                                            System.out.println(class179.field2682[var7]);
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (~var517 == -5425) {
                                                                                                            var6 -= 11;
                                                                                                            class238.field3678 = class47.field739[var6];
                                                                                                            class212.field3283 = class47.field739[var6 + 1];
                                                                                                            class221.field3458 = class47.field739[var6 + 2];
                                                                                                            class124.field1957 = class47.field739[var6 + 3];
                                                                                                            class58.field903 = class47.field739[var6 + 4];
                                                                                                            class100.field1614 = class47.field739[var6 + 5];
                                                                                                            class34.field545 = class47.field739[var6 - -6];
                                                                                                            class217.field3371 = class47.field739[var6 + 7];
                                                                                                            class267.field4260 = class47.field739[var6 + 8];
                                                                                                            class229.field3585 = class47.field739[var6 + 9];
                                                                                                            class98.field1570 = class47.field739[var6 + 10];
                                                                                                            class90.field1459.method1147(class58.field903, arg0 ^ 6697);
                                                                                                            class90.field1459.method1147(class100.field1614, -88);
                                                                                                            class90.field1459.method1147(class34.field545, arg0 + 6708);
                                                                                                            class90.field1459.method1147(class217.field3371, -125);
                                                                                                            class90.field1459.method1147(class267.field4260, -45);
                                                                                                            class23.field336 = true;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (var517 == 5425) {
                                                                                                            class31.method249(18336);
                                                                                                            class23.field336 = false;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (~var517 == -5427) {
                                                                                                            --var6;
                                                                                                            class102.field1627 = class47.field739[var6];
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (~var517 == -5428) {
                                                                                                            var6 -= 2;
                                                                                                            class86.field1418 = class47.field739[var6];
                                                                                                            class228.field3576 = class47.field739[var6 + 1];
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (~var517 == -5429) {
                                                                                                            var6 -= 2;
                                                                                                            int var317 = class47.field739[var6 + 1];
                                                                                                            int var318 = class47.field739[var6];
                                                                                                            class47.field739[var6++] = !class119.method853(-126, var318, var317) ? 0 : 1;
                                                                                                            continue;
                                                                                                        }
                                                                                                    } else if (var517 < 5600) {
                                                                                                        if (~var517 == -5501) {
                                                                                                            var6 -= 4;
                                                                                                            int var319 = class47.field739[var6];
                                                                                                            int var320 = class47.field739[var6 + 1];
                                                                                                            int var321 = class47.field739[var6 + 3];
                                                                                                            int var322 = class47.field739[var6 + 2];
                                                                                                            class57.method456((16383 & var319) + -class129.field2008, (16383 & var319 >> 14) + -class118.field1828, var321, false, 22822, var322, var320);
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (~var517 == -5502) {
                                                                                                            var6 -= 4;
                                                                                                            int var323 = class47.field739[var6 - -1];
                                                                                                            int var324 = class47.field739[var6];
                                                                                                            int var325 = class47.field739[var6 + 2];
                                                                                                            int var326 = class47.field739[var6 + 3];
                                                                                                            class167.method1108(var323, ((var324 & 268426235) >> 14) + -class118.field1828, var325, var326, (16383 & var324) + -class129.field2008, (byte) -54);
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (~var517 == -5503) {
                                                                                                            var6 -= 6;
                                                                                                            int var327 = class47.field739[var6];
                                                                                                            if (var327 >= 2) {
                                                                                                                throw new RuntimeException();
                                                                                                            }
                                                                                                            class126.field1981 = var327;
                                                                                                            int var328 = class47.field739[var6 + 1];
                                                                                                            if (var328 + 1 >= class261.field4059[class126.field1981].length >> 1) {
                                                                                                                throw new RuntimeException();
                                                                                                            }
                                                                                                            class283.field4475 = 0;
                                                                                                            class71.field1138 = var328;
                                                                                                            class148.field2290 = class47.field739[var6 + 2];
                                                                                                            class262.field4093 = class47.field739[var6 + 3];
                                                                                                            int var329 = class47.field739[var6 + 4];
                                                                                                            if (var329 >= 2) {
                                                                                                                throw new RuntimeException();
                                                                                                            }
                                                                                                            class1.field14 = var329;
                                                                                                            int var330 = class47.field739[var6 - -5];
                                                                                                            if (class261.field4059[class1.field14].length >> 1 <= var330 - -1) {
                                                                                                                throw new RuntimeException();
                                                                                                            }
                                                                                                            class6.field111 = 3;
                                                                                                            class113.field1781 = var330;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (var517 == 5503) {
                                                                                                            class103.method789((byte) -1);
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (var517 == 5504) {
                                                                                                            var6 -= 2;
                                                                                                            class79.method623(class47.field739[var6], 32, class47.field739[var6 - -1]);
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (var517 == 5505) {
                                                                                                            class47.field739[var6++] = (int) class161.field2460;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (~var517 == -5507) {
                                                                                                            class47.field739[var6++] = (int) class276.field4334;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (var517 == 5507) {
                                                                                                            class32.method255((byte) 82);
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (var517 == 5508) {
                                                                                                            class235.method1574((byte) 116);
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (~var517 == -5510) {
                                                                                                            class44.method372(true);
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (var517 == 5510) {
                                                                                                            class144.method994((byte) 35);
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (var517 == 5512) {
                                                                                                            class65.method512(-111);
                                                                                                            continue;
                                                                                                        }
                                                                                                    } else if (var517 < 5700) {
                                                                                                        if (~var517 == -5601) {
                                                                                                            var7 -= 2;
                                                                                                            --var6;
                                                                                                            int var331 = class47.field739[var6];
                                                                                                            String var332 = class179.field2682[var7];
                                                                                                            String var333 = class179.field2682[var7 - -1];
                                                                                                            if (~class239.field3715 == -11 && class226.field3537 == 0 && class8.field182 == 0 && ~class137.field2132 == -1 && ~class214.field3298 == -1) {
                                                                                                                class62.method499(true, var332, var333, var331);
                                                                                                            }
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (~var517 == -5602) {
                                                                                                            class179.method1189(arg0 + 206481494);
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (~var517 == -5603) {
                                                                                                            if (~class8.field182 == -1) {
                                                                                                                class35.field572 = -2;
                                                                                                            }
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (var517 == 5603) {
                                                                                                            var6 -= 4;
                                                                                                            if (class239.field3715 == 10 && class226.field3537 == 0 && ~class8.field182 == -1 && ~class137.field2132 == -1 && class214.field3298 == 0) {
                                                                                                                class48.method392(class47.field739[var6], class47.field739[var6 + 2], class47.field739[var6 + 1], 118, class47.field739[var6 - -3]);
                                                                                                            }
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (var517 == 5604) {
                                                                                                            --var7;
                                                                                                            if (~class239.field3715 == -11 && ~class226.field3537 == -1 && class8.field182 == 0 && ~class137.field2132 == -1 && ~class214.field3298 == -1) {
                                                                                                                class50.method419(class247.method1668(class179.field2682[var7], true), (byte) -17);
                                                                                                            }
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (var517 == 5605) {
                                                                                                            var7 -= 3;
                                                                                                            var6 -= 7;
                                                                                                            if (class239.field3715 == 10 && class226.field3537 == 0 && class8.field182 == 0 && ~class137.field2132 == -1 && class214.field3298 == 0) {
                                                                                                                class169.method1126(class47.field739[var6 + 3], (byte) 91, class179.field2682[var7 + 1], class47.field739[var6], class47.field739[var6 + 1], class179.field2682[var7 + 2], class47.field739[var6 - -2], class247.method1668(class179.field2682[var7], true), ~class47.field739[var6 + 5] == -2, class47.field739[var6 + 4] == 1, ~class47.field739[var6 + 6] == -2);
                                                                                                            }
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (~var517 == -5607) {
                                                                                                            if (~class137.field2132 == -1) {
                                                                                                                class259.field3978 = -2;
                                                                                                            }
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (~var517 == -5608) {
                                                                                                            class47.field739[var6++] = class35.field572;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (var517 == 5608) {
                                                                                                            class47.field739[var6++] = class171.field2549;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (var517 == 5609) {
                                                                                                            class47.field739[var6++] = class259.field3978;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (~var517 == -5611) {
                                                                                                            for (int var334 = 0; ~var334 > -6; ++var334) {
                                                                                                                class179.field2682[var7++] = var334 < class126.field1968.length ? class25.method203(class126.field1968[var334], -112) : "";
                                                                                                            }
                                                                                                            class126.field1968 = null;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (~var517 == -5612) {
                                                                                                            class47.field739[var6++] = class92.field1480;
                                                                                                            continue;
                                                                                                        }
                                                                                                    } else if (~var517 > -6101) {
                                                                                                        if (~var517 == -6002) {
                                                                                                            --var6;
                                                                                                            int var335 = class47.field739[var6];
                                                                                                            if (var335 < 1) {
                                                                                                                var335 = 1;
                                                                                                            }
                                                                                                            if (var335 > 4) {
                                                                                                                var335 = 4;
                                                                                                            }
                                                                                                            class250.field3847 = var335;
                                                                                                            if (~class250.field3847 == -2) {
                                                                                                                class97.method755(0.9F);
                                                                                                            }
                                                                                                            if (~class250.field3847 == -3) {
                                                                                                                class97.method755(0.8F);
                                                                                                            }
                                                                                                            if (~class250.field3847 == -4) {
                                                                                                                class97.method755(0.7F);
                                                                                                            }
                                                                                                            if (~class250.field3847 == -5) {
                                                                                                                class97.method755(0.6F);
                                                                                                            }
                                                                                                            method494(1);
                                                                                                            class220.method1477(class22.field329, 0);
                                                                                                            class258.field3956 = false;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (var517 == 6002) {
                                                                                                            --var6;
                                                                                                            class88.method705(32, class47.field739[var6] == 1);
                                                                                                            class273.method1839(32233);
                                                                                                            class90.method715((byte) -30);
                                                                                                            class121.method865(-109);
                                                                                                            class220.method1477(class22.field329, 0);
                                                                                                            class258.field3956 = false;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (~var517 == -6004) {
                                                                                                            --var6;
                                                                                                            class51.field813 = ~class47.field739[var6] == -2;
                                                                                                            class121.method865(arg0 ^ 6682);
                                                                                                            class220.method1477(class22.field329, arg0 ^ -6766);
                                                                                                            class258.field3956 = false;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (~var517 == -6006) {
                                                                                                            --var6;
                                                                                                            class1.field16 = ~class47.field739[var6] == -2;
                                                                                                            class90.method715((byte) 113);
                                                                                                            class220.method1477(class22.field329, arg0 + 6766);
                                                                                                            class258.field3956 = false;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (var517 == 6006) {
                                                                                                            --var6;
                                                                                                            class196.field3083 = class47.field739[var6] == 1;
                                                                                                            ((class287) class97.field1547).method1933(12148, !class196.field3083);
                                                                                                            class220.method1477(class22.field329, 0);
                                                                                                            class258.field3956 = false;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (~var517 == -6008) {
                                                                                                            --var6;
                                                                                                            class242.field3760 = ~class47.field739[var6] == -2;
                                                                                                            class220.method1477(class22.field329, 0);
                                                                                                            class258.field3956 = false;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (var517 == 6008) {
                                                                                                            --var6;
                                                                                                            class21.field320 = class47.field739[var6] == 1;
                                                                                                            class220.method1477(class22.field329, 0);
                                                                                                            class258.field3956 = false;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (~var517 == -6010) {
                                                                                                            --var6;
                                                                                                            class155.field2366 = class47.field739[var6] == 1;
                                                                                                            class220.method1477(class22.field329, 0);
                                                                                                            class258.field3956 = false;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (var517 == 6010) {
                                                                                                            --var6;
                                                                                                            class272.field4299 = class47.field739[var6] == 1;
                                                                                                            class220.method1477(class22.field329, arg0 + 6766);
                                                                                                            class258.field3956 = false;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (var517 == 6011) {
                                                                                                            --var6;
                                                                                                            int var336 = class47.field739[var6];
                                                                                                            if (~var336 > -1 || var336 > 2) {
                                                                                                                var336 = 0;
                                                                                                            }
                                                                                                            class270.field4279 = var336;
                                                                                                            class220.method1477(class22.field329, 0);
                                                                                                            class258.field3956 = false;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (~var517 == -6013) {
                                                                                                            --var6;
                                                                                                            class30.field486 = ~class47.field739[var6] == -2;
                                                                                                            if (~class250.field3847 == -2) {
                                                                                                                class97.method755(0.9F);
                                                                                                            }
                                                                                                            if (class250.field3847 == 2) {
                                                                                                                class97.method755(0.8F);
                                                                                                            }
                                                                                                            if (class250.field3847 == 3) {
                                                                                                                class97.method755(0.7F);
                                                                                                            }
                                                                                                            if (~class250.field3847 == -5) {
                                                                                                                class97.method755(0.6F);
                                                                                                            }
                                                                                                            class90.method715((byte) -26);
                                                                                                            class220.method1477(class22.field329, 0);
                                                                                                            class258.field3956 = false;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (var517 == 6014) {
                                                                                                            --var6;
                                                                                                            class56.field862 = ~class47.field739[var6] == -2;
                                                                                                            class220.method1477(class22.field329, 0);
                                                                                                            class258.field3956 = false;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (~var517 == -6016) {
                                                                                                            --var6;
                                                                                                            class144.field2246 = ~class47.field739[var6] == -2;
                                                                                                            class220.method1477(class22.field329, arg0 ^ -6766);
                                                                                                            class258.field3956 = false;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (var517 == 6016) {
                                                                                                            --var6;
                                                                                                            int var337 = class47.field739[var6];
                                                                                                            if (var337 < 0 || var337 > 2) {
                                                                                                                var337 = 0;
                                                                                                            }
                                                                                                            class30.field474 = var337;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (~var517 == -6018) {
                                                                                                            --var6;
                                                                                                            class43.field688 = class47.field739[var6] == 1;
                                                                                                            class196.method1315(false);
                                                                                                            class220.method1477(class22.field329, 0);
                                                                                                            class258.field3956 = false;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (~var517 == -6019) {
                                                                                                            --var6;
                                                                                                            int var338 = class47.field739[var6];
                                                                                                            if (~var338 > -1) {
                                                                                                                var338 = 0;
                                                                                                            }
                                                                                                            if (~var338 < -128) {
                                                                                                                var338 = 127;
                                                                                                            }
                                                                                                            class63.field1011 = var338;
                                                                                                            class220.method1477(class22.field329, 0);
                                                                                                            class258.field3956 = false;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (var517 == 6019) {
                                                                                                            --var6;
                                                                                                            int var339 = class47.field739[var6];
                                                                                                            if (~var339 > -1) {
                                                                                                                var339 = 0;
                                                                                                            }
                                                                                                            if (var339 > 255) {
                                                                                                                var339 = 255;
                                                                                                            }
                                                                                                            if (~class259.field3985 != ~var339) {
                                                                                                                if (~class259.field3985 == -1 && class295.field4633 != -1) {
                                                                                                                    class266.method1815(false, class158.field2427, 0, class295.field4633, var339, 10000);
                                                                                                                    class28.field421 = false;
                                                                                                                } else if (~var339 != -1) {
                                                                                                                    class8.method96(-126, var339);
                                                                                                                } else {
                                                                                                                    class153.method1028(1);
                                                                                                                    class28.field421 = false;
                                                                                                                }
                                                                                                                class259.field3985 = var339;
                                                                                                            }
                                                                                                            class220.method1477(class22.field329, 0);
                                                                                                            class258.field3956 = false;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (~var517 == -6021) {
                                                                                                            --var6;
                                                                                                            int var340 = class47.field739[var6];
                                                                                                            if (var340 < 0) {
                                                                                                                var340 = 0;
                                                                                                            }
                                                                                                            if (var340 > 127) {
                                                                                                                var340 = 127;
                                                                                                            }
                                                                                                            class253.field3896 = var340;
                                                                                                            class220.method1477(class22.field329, 0);
                                                                                                            class258.field3956 = false;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (~var517 == -6022) {
                                                                                                            --var6;
                                                                                                            class214.field3296 = class47.field739[var6] == 1;
                                                                                                            class121.method865(115);
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (~var517 == -6024) {
                                                                                                            --var6;
                                                                                                            int var341 = class47.field739[var6];
                                                                                                            if (var341 < 0) {
                                                                                                                var341 = 0;
                                                                                                            }
                                                                                                            boolean var342 = false;
                                                                                                            if (var341 > 2) {
                                                                                                                var341 = 2;
                                                                                                            }
                                                                                                            if (class64.field1024 < 96) {
                                                                                                                var341 = 0;
                                                                                                                var342 = true;
                                                                                                            }
                                                                                                            class240.method1623(var341);
                                                                                                            class220.method1477(class22.field329, 0);
                                                                                                            class258.field3956 = false;
                                                                                                            class47.field739[var6++] = !var342 ? 1 : 0;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (~var517 == -6025) {
                                                                                                            --var6;
                                                                                                            int var343 = class47.field739[var6];
                                                                                                            if (var343 < 0 || ~var343 < -3) {
                                                                                                                var343 = 0;
                                                                                                            }
                                                                                                            class39.field662 = var343;
                                                                                                            class220.method1477(class22.field329, 0);
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (~var517 == -6028) {
                                                                                                            --var6;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (var517 == 6028) {
                                                                                                            --var6;
                                                                                                            class210.field3261 = ~class47.field739[var6] != -1;
                                                                                                            class220.method1477(class22.field329, 0);
                                                                                                            continue;
                                                                                                        }
                                                                                                    } else if (~var517 <= -6201) {
                                                                                                        if (var517 >= 6300) {
                                                                                                            if (var517 < 6400) {
                                                                                                                if (var517 == 6300) {
                                                                                                                    class47.field739[var6++] = (int) (class269.method1823(-39) / 60000L);
                                                                                                                    continue;
                                                                                                                }
                                                                                                                if (var517 == 6301) {
                                                                                                                    class47.field739[var6++] = (int) (class269.method1823(-21) / 86400000L) + -11745;
                                                                                                                    continue;
                                                                                                                }
                                                                                                                if (~var517 == -6303) {
                                                                                                                    var6 -= 3;
                                                                                                                    int var344 = class47.field739[var6];
                                                                                                                    int var345 = class47.field739[var6 - -1];
                                                                                                                    int var346 = class47.field739[var6 + 2];
                                                                                                                    class41.field665.clear();
                                                                                                                    class41.field665.set(11, 12);
                                                                                                                    class41.field665.set(var346, var345, var344);
                                                                                                                    class47.field739[var6++] = -11745 + (int) (class41.field665.getTime().getTime() / 86400000L);
                                                                                                                    continue;
                                                                                                                }
                                                                                                                if (var517 == 6303) {
                                                                                                                    class41.field665.clear();
                                                                                                                    class41.field665.setTime(new Date(class269.method1823(-113)));
                                                                                                                    class47.field739[var6++] = class41.field665.get(1);
                                                                                                                    continue;
                                                                                                                }
                                                                                                                if (~var517 == -6305) {
                                                                                                                    boolean var347 = true;
                                                                                                                    --var6;
                                                                                                                    int var348 = class47.field739[var6];
                                                                                                                    if (var348 < 0) {
                                                                                                                        var347 = ~((var348 + 1) % 4) == -1;
                                                                                                                    } else if (~var348 <= -1583) {
                                                                                                                        if (~(var348 % 4) != -1) {
                                                                                                                            var347 = false;
                                                                                                                        } else if (var348 % 100 == 0) {
                                                                                                                            if (~(var348 % 400) != -1) {
                                                                                                                                var347 = false;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            var347 = true;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        var347 = ~(var348 % 4) == -1;
                                                                                                                    }
                                                                                                                    class47.field739[var6++] = !var347 ? 0 : 1;
                                                                                                                    continue;
                                                                                                                }
                                                                                                            } else if (var517 >= 6500) {
                                                                                                                if (~var517 > -6601) {
                                                                                                                    if (~var517 == -6501) {
                                                                                                                        if (~class239.field3715 == -11 && class226.field3537 == 0 && ~class8.field182 == -1 && class137.field2132 == 0) {
                                                                                                                            class47.field739[var6++] = class220.method1473(103) != -1 ? 1 : 0;
                                                                                                                            continue;
                                                                                                                        }
                                                                                                                        class47.field739[var6++] = 1;
                                                                                                                        continue;
                                                                                                                    }
                                                                                                                    if (var517 == 6501) {
                                                                                                                        class209 var349 = class18.method163((byte) -25);
                                                                                                                        if (var349 == null) {
                                                                                                                            class47.field739[var6++] = -1;
                                                                                                                            class47.field739[var6++] = 0;
                                                                                                                            class179.field2682[var7++] = "";
                                                                                                                            class47.field739[var6++] = 0;
                                                                                                                            class179.field2682[var7++] = "";
                                                                                                                            class47.field739[var6++] = 0;
                                                                                                                        } else {
                                                                                                                            class47.field739[var6++] = var349.field3245;
                                                                                                                            class47.field739[var6++] = var349.field1791;
                                                                                                                            class179.field2682[var7++] = var349.field3240;
                                                                                                                            class238 var350 = var349.method1400(1);
                                                                                                                            class47.field739[var6++] = var350.field3683;
                                                                                                                            class179.field2682[var7++] = var350.field3677;
                                                                                                                            class47.field739[var6++] = var349.field1786;
                                                                                                                        }
                                                                                                                        continue;
                                                                                                                    }
                                                                                                                    if (var517 == 6502) {
                                                                                                                        class209 var351 = class271.method1830((byte) -86);
                                                                                                                        if (var351 != null) {
                                                                                                                            class47.field739[var6++] = var351.field3245;
                                                                                                                            class47.field739[var6++] = var351.field1791;
                                                                                                                            class179.field2682[var7++] = var351.field3240;
                                                                                                                            class238 var352 = var351.method1400(arg0 + 6767);
                                                                                                                            class47.field739[var6++] = var352.field3683;
                                                                                                                            class179.field2682[var7++] = var352.field3677;
                                                                                                                            class47.field739[var6++] = var351.field1786;
                                                                                                                        } else {
                                                                                                                            class47.field739[var6++] = -1;
                                                                                                                            class47.field739[var6++] = 0;
                                                                                                                            class179.field2682[var7++] = "";
                                                                                                                            class47.field739[var6++] = 0;
                                                                                                                            class179.field2682[var7++] = "";
                                                                                                                            class47.field739[var6++] = 0;
                                                                                                                        }
                                                                                                                        continue;
                                                                                                                    }
                                                                                                                    if (var517 == 6503) {
                                                                                                                        --var6;
                                                                                                                        int var353 = class47.field739[var6];
                                                                                                                        if (~class239.field3715 == -11 && class226.field3537 == 0 && class8.field182 == 0 && class137.field2132 == 0) {
                                                                                                                            class47.field739[var6++] = class93.method732(var353, 14405) ? 1 : 0;
                                                                                                                            continue;
                                                                                                                        }
                                                                                                                        class47.field739[var6++] = 0;
                                                                                                                        continue;
                                                                                                                    }
                                                                                                                    if (var517 == 6504) {
                                                                                                                        --var6;
                                                                                                                        class184.field2785 = class47.field739[var6];
                                                                                                                        class220.method1477(class22.field329, 0);
                                                                                                                        continue;
                                                                                                                    }
                                                                                                                    if (~var517 == -6506) {
                                                                                                                        class47.field739[var6++] = class184.field2785;
                                                                                                                        continue;
                                                                                                                    }
                                                                                                                    if (~var517 == -6507) {
                                                                                                                        --var6;
                                                                                                                        int var354 = class47.field739[var6];
                                                                                                                        class209 var355 = class3.method42((byte) 118, var354);
                                                                                                                        if (var355 == null) {
                                                                                                                            class47.field739[var6++] = -1;
                                                                                                                            class179.field2682[var7++] = "";
                                                                                                                            class47.field739[var6++] = 0;
                                                                                                                            class179.field2682[var7++] = "";
                                                                                                                            class47.field739[var6++] = 0;
                                                                                                                        } else {
                                                                                                                            class47.field739[var6++] = var355.field1791;
                                                                                                                            class179.field2682[var7++] = var355.field3240;
                                                                                                                            class238 var356 = var355.method1400(arg0 ^ -6765);
                                                                                                                            class47.field739[var6++] = var356.field3683;
                                                                                                                            class179.field2682[var7++] = var356.field3677;
                                                                                                                            class47.field739[var6++] = var355.field1786;
                                                                                                                        }
                                                                                                                        continue;
                                                                                                                    }
                                                                                                                    if (var517 == 6507) {
                                                                                                                        var6 -= 4;
                                                                                                                        int var357 = class47.field739[var6];
                                                                                                                        boolean var358 = ~class47.field739[var6 - -1] == -2;
                                                                                                                        int var359 = class47.field739[var6 + 2];
                                                                                                                        boolean var360 = ~class47.field739[var6 + 3] == -2;
                                                                                                                        class9.method105(var357, var359, var360, var358, (byte) 81);
                                                                                                                        continue;
                                                                                                                    }
                                                                                                                } else if (~var517 > -6701) {
                                                                                                                    if (~var517 == -6601) {
                                                                                                                        --var6;
                                                                                                                        class195.field3070 = class47.field739[var6] == 1;
                                                                                                                        class220.method1477(class22.field329, arg0 ^ -6766);
                                                                                                                        continue;
                                                                                                                    }
                                                                                                                    if (var517 == 6601) {
                                                                                                                        class47.field739[var6++] = class195.field3070 ? 1 : 0;
                                                                                                                        continue;
                                                                                                                    }
                                                                                                                }
                                                                                                            } else {
                                                                                                                if (~var517 == -6406) {
                                                                                                                    class47.field739[var6++] = !class187.method1259((byte) -120) ? 0 : 1;
                                                                                                                    continue;
                                                                                                                }
                                                                                                                if (~var517 == -6407) {
                                                                                                                    class47.field739[var6++] = !class285.method1919((byte) 61) ? 0 : 1;
                                                                                                                    continue;
                                                                                                                }
                                                                                                            }
                                                                                                        } else {
                                                                                                            if (var517 == 6200) {
                                                                                                                var6 -= 2;
                                                                                                                class57.field879 = (short) class47.field739[var6];
                                                                                                                if (~class57.field879 >= -1) {
                                                                                                                    class57.field879 = 256;
                                                                                                                }
                                                                                                                class181.field2695 = (short) class47.field739[var6 + 1];
                                                                                                                if (~class181.field2695 >= -1) {
                                                                                                                    class181.field2695 = 205;
                                                                                                                }
                                                                                                                continue;
                                                                                                            }
                                                                                                            if (~var517 == -6202) {
                                                                                                                var6 -= 2;
                                                                                                                class57.field882 = (short) class47.field739[var6];
                                                                                                                if (class57.field882 <= 0) {
                                                                                                                    class57.field882 = 256;
                                                                                                                }
                                                                                                                class276.field4353 = (short) class47.field739[var6 + 1];
                                                                                                                if (class276.field4353 <= 0) {
                                                                                                                    class276.field4353 = 320;
                                                                                                                }
                                                                                                                continue;
                                                                                                            }
                                                                                                            if (var517 == 6202) {
                                                                                                                var6 -= 4;
                                                                                                                class137.field2127 = (short) class47.field739[var6];
                                                                                                                if (class137.field2127 <= 0) {
                                                                                                                    class137.field2127 = 1;
                                                                                                                }
                                                                                                                class21.field325 = (short) class47.field739[var6 + 1];
                                                                                                                if (class21.field325 <= 0) {
                                                                                                                    class21.field325 = 32767;
                                                                                                                } else if (~class137.field2127 < ~class21.field325) {
                                                                                                                    class21.field325 = class137.field2127;
                                                                                                                }
                                                                                                                class143.field2202 = (short) class47.field739[var6 + 2];
                                                                                                                if (class143.field2202 <= 0) {
                                                                                                                    class143.field2202 = 1;
                                                                                                                }
                                                                                                                class35.field564 = (short) class47.field739[var6 + 3];
                                                                                                                if (class35.field564 <= 0) {
                                                                                                                    class35.field564 = 32767;
                                                                                                                } else if (class35.field564 < class143.field2202) {
                                                                                                                    class35.field564 = class143.field2202;
                                                                                                                }
                                                                                                                continue;
                                                                                                            }
                                                                                                            if (~var517 == -6204) {
                                                                                                                class44.method371(0, 0, false, -2, class79.field1320.field2922, class79.field1320.field2928);
                                                                                                                class47.field739[var6++] = class72.field1153;
                                                                                                                class47.field739[var6++] = class16.field266;
                                                                                                                continue;
                                                                                                            }
                                                                                                            if (~var517 == -6205) {
                                                                                                                class47.field739[var6++] = class57.field882;
                                                                                                                class47.field739[var6++] = class276.field4353;
                                                                                                                continue;
                                                                                                            }
                                                                                                            if (~var517 == -6206) {
                                                                                                                class47.field739[var6++] = class57.field879;
                                                                                                                class47.field739[var6++] = class181.field2695;
                                                                                                                continue;
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        if (~var517 == -6102) {
                                                                                                            class47.field739[var6++] = class250.field3847;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (var517 == 6102) {
                                                                                                            class47.field739[var6++] = class223.method1487(85) ? 1 : 0;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (var517 == 6103) {
                                                                                                            class47.field739[var6++] = class51.field813 ? 1 : 0;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (~var517 == -6106) {
                                                                                                            class47.field739[var6++] = class1.field16 ? 1 : 0;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (~var517 == -6107) {
                                                                                                            class47.field739[var6++] = class196.field3083 ? 1 : 0;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (~var517 == -6108) {
                                                                                                            class47.field739[var6++] = class242.field3760 ? 1 : 0;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (var517 == 6108) {
                                                                                                            class47.field739[var6++] = !class21.field320 ? 0 : 1;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (~var517 == -6110) {
                                                                                                            class47.field739[var6++] = !class155.field2366 ? 0 : 1;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (~var517 == -6111) {
                                                                                                            class47.field739[var6++] = !class272.field4299 ? 0 : 1;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (~var517 == -6112) {
                                                                                                            class47.field739[var6++] = class270.field4279;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (~var517 == -6113) {
                                                                                                            class47.field739[var6++] = !class30.field486 ? 0 : 1;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (~var517 == -6115) {
                                                                                                            class47.field739[var6++] = class56.field862 ? 1 : 0;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (~var517 == -6116) {
                                                                                                            class47.field739[var6++] = class144.field2246 ? 1 : 0;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (var517 == 6116) {
                                                                                                            class47.field739[var6++] = class30.field474;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (var517 == 6117) {
                                                                                                            class47.field739[var6++] = !class43.field688 ? 0 : 1;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (var517 == 6118) {
                                                                                                            class47.field739[var6++] = class63.field1011;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (~var517 == -6120) {
                                                                                                            class47.field739[var6++] = class259.field3985;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (~var517 == -6121) {
                                                                                                            class47.field739[var6++] = class253.field3896;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (var517 == 6121) {
                                                                                                            class47.field739[var6++] = 0;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (~var517 == -6124) {
                                                                                                            class47.field739[var6++] = class240.method1622();
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (var517 == 6124) {
                                                                                                            class47.field739[var6++] = class39.field662;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (var517 == 6126) {
                                                                                                            class47.field739[var6++] = 0;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (var517 == 6127) {
                                                                                                            class47.field739[var6++] = !class66.field1047 ? 0 : 1;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (~var517 == -6129) {
                                                                                                            class47.field739[var6++] = class210.field3261 ? 1 : 0;
                                                                                                            continue;
                                                                                                        }
                                                                                                    }
                                                                                                } else {
                                                                                                    if (var517 == 5300) {
                                                                                                        var6 -= 2;
                                                                                                        class47.field739[var6++] = 0;
                                                                                                        continue;
                                                                                                    }
                                                                                                    if (var517 == 5301) {
                                                                                                        continue;
                                                                                                    }
                                                                                                    if (var517 == 5302) {
                                                                                                        class47.field739[var6++] = 0;
                                                                                                        continue;
                                                                                                    }
                                                                                                    if (var517 == 5303) {
                                                                                                        --var6;
                                                                                                        class47.field739[var6++] = 0;
                                                                                                        class47.field739[var6++] = 0;
                                                                                                        continue;
                                                                                                    }
                                                                                                    if (~var517 == -5306) {
                                                                                                        byte var361 = -1;
                                                                                                        class47.field739[var6++] = var361;
                                                                                                        continue;
                                                                                                    }
                                                                                                    if (var517 == 5306) {
                                                                                                        class47.field739[var6++] = class245.method1659(116);
                                                                                                        continue;
                                                                                                    }
                                                                                                    if (~var517 == -5308) {
                                                                                                        --var6;
                                                                                                        int var362 = class47.field739[var6];
                                                                                                        if (var362 < 0 || var362 > 2) {
                                                                                                            var362 = 0;
                                                                                                        }
                                                                                                        class271.method1832(false, (byte) -80, -1, -1, var362);
                                                                                                        continue;
                                                                                                    }
                                                                                                    if (var517 == 5308) {
                                                                                                        class47.field739[var6++] = class148.field2287;
                                                                                                        continue;
                                                                                                    }
                                                                                                    if (~var517 == -5310) {
                                                                                                        --var6;
                                                                                                        int var363 = class47.field739[var6];
                                                                                                        if (~var363 > -1 || ~var363 < -3) {
                                                                                                            var363 = 0;
                                                                                                        }
                                                                                                        class148.field2287 = var363;
                                                                                                        class220.method1477(class22.field329, arg0 ^ -6766);
                                                                                                        continue;
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                if (var517 == 5200) {
                                                                                                    int var10000 = arg0 + 6816;
                                                                                                    --var6;
                                                                                                    class260.method1722(var10000, class47.field739[var6]);
                                                                                                    continue;
                                                                                                }
                                                                                                if (var517 == 5201) {
                                                                                                    class47.field739[var6++] = class215.method1431(120);
                                                                                                    continue;
                                                                                                }
                                                                                                if (var517 == 5202) {
                                                                                                    --var6;
                                                                                                    class113.method834(class47.field739[var6], (byte) -81);
                                                                                                    continue;
                                                                                                }
                                                                                                if (var517 == 5203) {
                                                                                                    --var7;
                                                                                                    class71.method559((byte) 70, class179.field2682[var7]);
                                                                                                    continue;
                                                                                                }
                                                                                                if (var517 == 5204) {
                                                                                                    class179.field2682[var7 + -1] = class260.method1730((byte) -44, class179.field2682[var7 - 1]);
                                                                                                    continue;
                                                                                                }
                                                                                                if (var517 == 5205) {
                                                                                                    --var6;
                                                                                                    class283.method1899(class47.field739[var6], -1, (byte) -117, -1);
                                                                                                    continue;
                                                                                                }
                                                                                                if (~var517 == -5207) {
                                                                                                    --var6;
                                                                                                    int var364 = class47.field739[var6];
                                                                                                    class297 var365 = class73.method582((var364 & 268423650) >> 14, 37, var364 & 16383);
                                                                                                    if (var365 != null) {
                                                                                                        class47.field739[var6++] = var365.field4699;
                                                                                                    } else {
                                                                                                        class47.field739[var6++] = -1;
                                                                                                    }
                                                                                                    continue;
                                                                                                }
                                                                                                if (var517 == 5207) {
                                                                                                    --var6;
                                                                                                    class297 var366 = class47.method382(false, class47.field739[var6]);
                                                                                                    if (var366 != null && var366.field4698 != null) {
                                                                                                        class179.field2682[var7++] = var366.field4698;
                                                                                                        continue;
                                                                                                    }
                                                                                                    class179.field2682[var7++] = "";
                                                                                                    continue;
                                                                                                }
                                                                                                if (~var517 == -5209) {
                                                                                                    class47.field739[var6++] = class69.field1098;
                                                                                                    class47.field739[var6++] = class263.field4111;
                                                                                                    continue;
                                                                                                }
                                                                                                if (var517 == 5209) {
                                                                                                    class47.field739[var6++] = class76.field1275 + class140.field2155;
                                                                                                    class47.field739[var6++] = class221.field3453 + -1 - class250.field3848 + class197.field3093;
                                                                                                    continue;
                                                                                                }
                                                                                                if (var517 == 5210) {
                                                                                                    --var6;
                                                                                                    int var367 = class47.field739[var6];
                                                                                                    class297 var368 = class47.method382(false, var367);
                                                                                                    if (var368 == null) {
                                                                                                        class47.field739[var6++] = 0;
                                                                                                        class47.field739[var6++] = 0;
                                                                                                    } else {
                                                                                                        class47.field739[var6++] = class3.method48(var368.field4677, 268430028) >> 14;
                                                                                                        class47.field739[var6++] = class3.method48(16383, var368.field4677);
                                                                                                    }
                                                                                                    continue;
                                                                                                }
                                                                                                if (~var517 == -5212) {
                                                                                                    --var6;
                                                                                                    int var369 = class47.field739[var6];
                                                                                                    class297 var370 = class47.method382(false, var369);
                                                                                                    if (var370 == null) {
                                                                                                        class47.field739[var6++] = 0;
                                                                                                        class47.field739[var6++] = 0;
                                                                                                    } else {
                                                                                                        class47.field739[var6++] = var370.field4678 - var370.field4691;
                                                                                                        class47.field739[var6++] = -var370.field4696 + var370.field4693;
                                                                                                    }
                                                                                                    continue;
                                                                                                }
                                                                                                if (~var517 == -5213) {
                                                                                                    int var371 = class184.method1234(3);
                                                                                                    int var372 = 0;
                                                                                                    String var373;
                                                                                                    if (var371 == -1) {
                                                                                                        var373 = "";
                                                                                                    } else {
                                                                                                        var373 = class293.field4615.field4538[var371];
                                                                                                        var372 = class293.field4615.method1936(var371, arg0 + -9597);
                                                                                                    }
                                                                                                    String var374 = class290.method1953(0, var373, " ", "<br>");
                                                                                                    class179.field2682[var7++] = var374;
                                                                                                    class47.field739[var6++] = var372;
                                                                                                    continue;
                                                                                                }
                                                                                                if (var517 == 5213) {
                                                                                                    int var375 = class50.method416(-26921);
                                                                                                    int var376 = 0;
                                                                                                    String var377;
                                                                                                    if (~var375 != 0) {
                                                                                                        var377 = class293.field4615.field4538[var375];
                                                                                                        var376 = class293.field4615.method1936(var375, -16363);
                                                                                                    } else {
                                                                                                        var377 = "";
                                                                                                    }
                                                                                                    String var378 = class290.method1953(arg0 + 6766, var377, " ", "<br>");
                                                                                                    class179.field2682[var7++] = var378;
                                                                                                    class47.field739[var6++] = var376;
                                                                                                    continue;
                                                                                                }
                                                                                                if (var517 == 5214) {
                                                                                                    --var6;
                                                                                                    int var379 = class47.field739[var6];
                                                                                                    class297 var380 = class3.method50((byte) -41);
                                                                                                    if (var380 != null) {
                                                                                                        int[] var381 = var380.method1991((var379 & 268422091) >> 14, 16383 & var379, arg0 ^ -6766, (962264318 & var379) >> 28);
                                                                                                        if (var381 != null) {
                                                                                                            class129.method911(var381[2], var381[1], arg0 + 6832);
                                                                                                        }
                                                                                                    }
                                                                                                    continue;
                                                                                                }
                                                                                                if (~var517 == -5216) {
                                                                                                    var6 -= 2;
                                                                                                    int var382 = class47.field739[var6 + 1];
                                                                                                    int var383 = class47.field739[var6];
                                                                                                    class84 var384 = class265.method1807(true, (var383 & 268427469) >> 14, 16383 & var383);
                                                                                                    boolean var385 = false;
                                                                                                    for (class297 var386 = (class297) var384.method681(2); var386 != null; var386 = (class297) var384.method680(-7)) {
                                                                                                        if (var386.field4699 == var382) {
                                                                                                            var385 = true;
                                                                                                            break;
                                                                                                        }
                                                                                                    }
                                                                                                    if (var385) {
                                                                                                        class47.field739[var6++] = 1;
                                                                                                    } else {
                                                                                                        class47.field739[var6++] = 0;
                                                                                                    }
                                                                                                    continue;
                                                                                                }
                                                                                                if (~var517 == -5217) {
                                                                                                    --var6;
                                                                                                    int var387 = class47.field739[var6];
                                                                                                    class77.method607(-1, var387);
                                                                                                    continue;
                                                                                                }
                                                                                                if (~var517 == -5218) {
                                                                                                    --var6;
                                                                                                    int var388 = class47.field739[var6];
                                                                                                    if (!class11.method119(31, var388)) {
                                                                                                        class47.field739[var6++] = 0;
                                                                                                    } else {
                                                                                                        class47.field739[var6++] = 1;
                                                                                                    }
                                                                                                    continue;
                                                                                                }
                                                                                                if (var517 == 5218) {
                                                                                                    --var6;
                                                                                                    int var389 = class47.field739[var6];
                                                                                                    class297 var390 = class47.method382(false, var389);
                                                                                                    if (var390 == null) {
                                                                                                        class47.field739[var6++] = -1;
                                                                                                    } else {
                                                                                                        class47.field739[var6++] = var390.field4685;
                                                                                                    }
                                                                                                    continue;
                                                                                                }
                                                                                                if (~var517 == -5220) {
                                                                                                    --var7;
                                                                                                    class21.method186((byte) 103, class179.field2682[var7]);
                                                                                                    continue;
                                                                                                }
                                                                                                if (~var517 == -5221) {
                                                                                                    class47.field739[var6++] = ~class122.field1874 == -101 ? 1 : 0;
                                                                                                    continue;
                                                                                                }
                                                                                                if (var517 == 5221) {
                                                                                                    --var6;
                                                                                                    int var391 = class47.field739[var6];
                                                                                                    class129.method911(var391 & 16383, (var391 & 268425814) >> 14, 116);
                                                                                                    continue;
                                                                                                }
                                                                                                if (var517 == 5222) {
                                                                                                    class297 var392 = class3.method50((byte) -41);
                                                                                                    if (var392 != null) {
                                                                                                        int[] var393 = var392.method1990(-class250.field3848 + -1 + class221.field3453 - -class197.field3093, arg0 + 6765, class140.field2155 - -class76.field1275);
                                                                                                        if (var393 != null) {
                                                                                                            class47.field739[var6++] = var393[1];
                                                                                                            class47.field739[var6++] = var393[2];
                                                                                                        } else {
                                                                                                            class47.field739[var6++] = -1;
                                                                                                            class47.field739[var6++] = -1;
                                                                                                        }
                                                                                                    } else {
                                                                                                        class47.field739[var6++] = -1;
                                                                                                        class47.field739[var6++] = -1;
                                                                                                    }
                                                                                                    continue;
                                                                                                }
                                                                                                if (var517 == 5223) {
                                                                                                    var6 -= 2;
                                                                                                    int var394 = class47.field739[var6];
                                                                                                    int var395 = class47.field739[var6 + 1];
                                                                                                    class283.method1899(var394, 16383 & var395, (byte) -110, (268427865 & var395) >> 14);
                                                                                                    continue;
                                                                                                }
                                                                                                if (var517 == 5224) {
                                                                                                    --var6;
                                                                                                    int var396 = class47.field739[var6];
                                                                                                    class297 var397 = class3.method50((byte) -41);
                                                                                                    if (var397 != null) {
                                                                                                        int[] var398 = var397.method1991((268432211 & var396) >> 14, var396 & 16383, arg0 ^ -6766, (864041973 & var396) >> 28);
                                                                                                        if (var398 == null) {
                                                                                                            class47.field739[var6++] = -1;
                                                                                                            class47.field739[var6++] = -1;
                                                                                                        } else {
                                                                                                            class47.field739[var6++] = var398[1];
                                                                                                            class47.field739[var6++] = var398[2];
                                                                                                        }
                                                                                                    } else {
                                                                                                        class47.field739[var6++] = -1;
                                                                                                        class47.field739[var6++] = -1;
                                                                                                    }
                                                                                                    continue;
                                                                                                }
                                                                                                if (~var517 == -5226) {
                                                                                                    --var6;
                                                                                                    int var399 = class47.field739[var6];
                                                                                                    class297 var400 = class3.method50((byte) -41);
                                                                                                    if (var400 != null) {
                                                                                                        int[] var401 = var400.method1990(var399 & 16383, -1, 16383 & var399 >> 14);
                                                                                                        if (var401 != null) {
                                                                                                            class47.field739[var6++] = var401[1];
                                                                                                            class47.field739[var6++] = var401[2];
                                                                                                        } else {
                                                                                                            class47.field739[var6++] = -1;
                                                                                                            class47.field739[var6++] = -1;
                                                                                                        }
                                                                                                    } else {
                                                                                                        class47.field739[var6++] = -1;
                                                                                                        class47.field739[var6++] = -1;
                                                                                                    }
                                                                                                    continue;
                                                                                                }
                                                                                            }
                                                                                        } else if (~var517 == -4401) {
                                                                                            var6 -= 2;
                                                                                            int var402 = class47.field739[var6];
                                                                                            int var403 = class47.field739[var6 + 1];
                                                                                            class289 var404 = class31.method250(var403, -89);
                                                                                            if (var404.method1948((byte) 120)) {
                                                                                                class179.field2682[var7++] = class85.method690(2276, var402).method574(var404.field4549, var403, true);
                                                                                            } else {
                                                                                                class47.field739[var6++] = class85.method690(2276, var402).method573(var403, 9623, var404.field4557);
                                                                                            }
                                                                                            continue;
                                                                                        }
                                                                                    } else if (var517 == 4300) {
                                                                                        var6 -= 2;
                                                                                        int var405 = class47.field739[var6];
                                                                                        int var406 = class47.field739[var6 + 1];
                                                                                        class289 var407 = class31.method250(var406, arg0 ^ 6709);
                                                                                        if (var407.method1948((byte) -124)) {
                                                                                            class179.field2682[var7++] = class253.method1689(var405, -22396).method1449((byte) 91, var407.field4549, var406);
                                                                                        } else {
                                                                                            class47.field739[var6++] = class253.method1689(var405, -22396).method1454(var407.field4557, var406, (byte) 79);
                                                                                        }
                                                                                        continue;
                                                                                    }
                                                                                } else {
                                                                                    if (var517 == 4200) {
                                                                                        --var6;
                                                                                        int var408 = class47.field739[var6];
                                                                                        class179.field2682[var7++] = class32.method260(var408, true).field1885;
                                                                                        continue;
                                                                                    }
                                                                                    if (~var517 == -4202) {
                                                                                        var6 -= 2;
                                                                                        int var409 = class47.field739[var6 + 1];
                                                                                        int var410 = class47.field739[var6];
                                                                                        class123 var411 = class32.method260(var410, true);
                                                                                        if (var409 >= 1 && var409 <= 5 && var411.field1908[var409 - 1] != null) {
                                                                                            class179.field2682[var7++] = var411.field1908[var409 - 1];
                                                                                            continue;
                                                                                        }
                                                                                        class179.field2682[var7++] = "";
                                                                                        continue;
                                                                                    }
                                                                                    if (~var517 == -4203) {
                                                                                        var6 -= 2;
                                                                                        int var412 = class47.field739[var6 + 1];
                                                                                        int var413 = class47.field739[var6];
                                                                                        class123 var414 = class32.method260(var413, true);
                                                                                        if (~var412 <= -2 && var412 <= 5 && var414.field1926[var412 + -1] != null) {
                                                                                            class179.field2682[var7++] = var414.field1926[var412 + -1];
                                                                                            continue;
                                                                                        }
                                                                                        class179.field2682[var7++] = "";
                                                                                        continue;
                                                                                    }
                                                                                    if (var517 == 4203) {
                                                                                        --var6;
                                                                                        int var415 = class47.field739[var6];
                                                                                        class47.field739[var6++] = class32.method260(var415, true).field1909;
                                                                                        continue;
                                                                                    }
                                                                                    if (~var517 == -4205) {
                                                                                        --var6;
                                                                                        int var416 = class47.field739[var6];
                                                                                        class47.field739[var6++] = ~class32.method260(var416, true).field1906 == -2 ? 1 : 0;
                                                                                        continue;
                                                                                    }
                                                                                    if (~var517 == -4206) {
                                                                                        --var6;
                                                                                        int var417 = class47.field739[var6];
                                                                                        class123 var418 = class32.method260(var417, true);
                                                                                        if (var418.field1922 == -1 && var418.field1901 >= 0) {
                                                                                            class47.field739[var6++] = var418.field1901;
                                                                                            continue;
                                                                                        }
                                                                                        class47.field739[var6++] = var417;
                                                                                        continue;
                                                                                    }
                                                                                    if (~var517 == -4207) {
                                                                                        --var6;
                                                                                        int var419 = class47.field739[var6];
                                                                                        class123 var420 = class32.method260(var419, true);
                                                                                        if (var420.field1922 >= 0 && ~var420.field1901 <= -1) {
                                                                                            class47.field739[var6++] = var420.field1901;
                                                                                            continue;
                                                                                        }
                                                                                        class47.field739[var6++] = var419;
                                                                                        continue;
                                                                                    }
                                                                                    if (var517 == 4207) {
                                                                                        --var6;
                                                                                        int var421 = class47.field739[var6];
                                                                                        class47.field739[var6++] = class32.method260(var421, true).field1917 ? 1 : 0;
                                                                                        continue;
                                                                                    }
                                                                                    if (var517 == 4208) {
                                                                                        var6 -= 2;
                                                                                        int var422 = class47.field739[var6];
                                                                                        int var423 = class47.field739[var6 + 1];
                                                                                        class289 var424 = class31.method250(var423, arg0 ^ 6709);
                                                                                        if (!var424.method1948((byte) -128)) {
                                                                                            class47.field739[var6++] = class32.method260(var422, true).method876(-1, var423, var424.field4557);
                                                                                        } else {
                                                                                            class179.field2682[var7++] = class32.method260(var422, true).method874(var424.field4549, (byte) 115, var423);
                                                                                        }
                                                                                        continue;
                                                                                    }
                                                                                    if (var517 == 4210) {
                                                                                        --var7;
                                                                                        String var425 = class179.field2682[var7];
                                                                                        --var6;
                                                                                        int var426 = class47.field739[var6];
                                                                                        class72.method562(var425, ~var426 == -2, 0);
                                                                                        class47.field739[var6++] = class16.field256;
                                                                                        continue;
                                                                                    }
                                                                                    if (~var517 == -4212) {
                                                                                        if (class98.field1571 != null && class28.field424 < class16.field256) {
                                                                                            class47.field739[var6++] = class3.method48(class98.field1571[class28.field424++], 65535);
                                                                                            continue;
                                                                                        }
                                                                                        class47.field739[var6++] = -1;
                                                                                        continue;
                                                                                    }
                                                                                    if (var517 == 4212) {
                                                                                        class28.field424 = 0;
                                                                                        continue;
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                if (~var517 == -3904) {
                                                                                    --var6;
                                                                                    int var427 = class47.field739[var6];
                                                                                    class47.field739[var6++] = class217.field3408[var427].method1384((byte) -127);
                                                                                    continue;
                                                                                }
                                                                                if (var517 == 3904) {
                                                                                    --var6;
                                                                                    int var428 = class47.field739[var6];
                                                                                    class47.field739[var6++] = class217.field3408[var428].field3221;
                                                                                    continue;
                                                                                }
                                                                                if (~var517 == -3906) {
                                                                                    --var6;
                                                                                    int var429 = class47.field739[var6];
                                                                                    class47.field739[var6++] = class217.field3408[var429].field3219;
                                                                                    continue;
                                                                                }
                                                                                if (~var517 == -3907) {
                                                                                    --var6;
                                                                                    int var430 = class47.field739[var6];
                                                                                    class47.field739[var6++] = class217.field3408[var430].field3222;
                                                                                    continue;
                                                                                }
                                                                                if (~var517 == -3908) {
                                                                                    --var6;
                                                                                    int var431 = class47.field739[var6];
                                                                                    class47.field739[var6++] = class217.field3408[var431].field3213;
                                                                                    continue;
                                                                                }
                                                                                if (var517 == 3908) {
                                                                                    --var6;
                                                                                    int var432 = class47.field739[var6];
                                                                                    class47.field739[var6++] = class217.field3408[var432].field3208;
                                                                                    continue;
                                                                                }
                                                                                if (~var517 == -3911) {
                                                                                    --var6;
                                                                                    int var433 = class47.field739[var6];
                                                                                    int var434 = class217.field3408[var433].method1382((byte) -117);
                                                                                    class47.field739[var6++] = var434 == 0 ? 1 : 0;
                                                                                    continue;
                                                                                }
                                                                                if (var517 == 3911) {
                                                                                    --var6;
                                                                                    int var435 = class47.field739[var6];
                                                                                    int var436 = class217.field3408[var435].method1382((byte) -117);
                                                                                    class47.field739[var6++] = var436 != 2 ? 0 : 1;
                                                                                    continue;
                                                                                }
                                                                                if (var517 == 3912) {
                                                                                    --var6;
                                                                                    int var437 = class47.field739[var6];
                                                                                    int var438 = class217.field3408[var437].method1382((byte) -117);
                                                                                    class47.field739[var6++] = ~var438 != -6 ? 0 : 1;
                                                                                    continue;
                                                                                }
                                                                                if (var517 == 3913) {
                                                                                    --var6;
                                                                                    int var439 = class47.field739[var6];
                                                                                    int var440 = class217.field3408[var439].method1382((byte) -117);
                                                                                    class47.field739[var6++] = ~var440 == -2 ? 1 : 0;
                                                                                    continue;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            if (var517 == 3600) {
                                                                                if (class140.field2160 != 0) {
                                                                                    if (class140.field2160 != 1) {
                                                                                        class47.field739[var6++] = class262.field4100;
                                                                                    } else {
                                                                                        class47.field739[var6++] = -1;
                                                                                    }
                                                                                } else {
                                                                                    class47.field739[var6++] = -2;
                                                                                }
                                                                                continue;
                                                                            }
                                                                            if (~var517 == -3602) {
                                                                                --var6;
                                                                                int var441 = class47.field739[var6];
                                                                                if (class140.field2160 == 2 && var441 < class262.field4100) {
                                                                                    class179.field2682[var7++] = class3.field53[var441];
                                                                                    continue;
                                                                                }
                                                                                class179.field2682[var7++] = "";
                                                                                continue;
                                                                            }
                                                                            if (~var517 == -3603) {
                                                                                --var6;
                                                                                int var442 = class47.field739[var6];
                                                                                if (~class140.field2160 == -3 && ~class262.field4100 < ~var442) {
                                                                                    class47.field739[var6++] = class112.field1761[var442];
                                                                                    continue;
                                                                                }
                                                                                class47.field739[var6++] = 0;
                                                                                continue;
                                                                            }
                                                                            if (~var517 == -3604) {
                                                                                --var6;
                                                                                int var443 = class47.field739[var6];
                                                                                if (~class140.field2160 == -3 && ~var443 > ~class262.field4100) {
                                                                                    class47.field739[var6++] = class174.field2587[var443];
                                                                                    continue;
                                                                                }
                                                                                class47.field739[var6++] = 0;
                                                                                continue;
                                                                            }
                                                                            if (~var517 == -3605) {
                                                                                --var7;
                                                                                String var444 = class179.field2682[var7];
                                                                                --var6;
                                                                                int var445 = class47.field739[var6];
                                                                                class291.method1962(var444, var445, (byte) 124);
                                                                                continue;
                                                                            }
                                                                            if (~var517 == -3606) {
                                                                                --var7;
                                                                                String var446 = class179.field2682[var7];
                                                                                class81.method634(arg0 + 36368, class247.method1668(var446, true));
                                                                                continue;
                                                                            }
                                                                            if (var517 == 3606) {
                                                                                --var7;
                                                                                String var447 = class179.field2682[var7];
                                                                                class205.method1373(1, class247.method1668(var447, true));
                                                                                continue;
                                                                            }
                                                                            if (var517 == 3607) {
                                                                                --var7;
                                                                                String var448 = class179.field2682[var7];
                                                                                class280.method1876(false, class247.method1668(var448, true), 121);
                                                                                continue;
                                                                            }
                                                                            if (~var517 == -3609) {
                                                                                --var7;
                                                                                String var449 = class179.field2682[var7];
                                                                                class214.method1429(arg0 ^ 21894, class247.method1668(var449, true));
                                                                                continue;
                                                                            }
                                                                            if (~var517 == -3610) {
                                                                                --var7;
                                                                                String var450 = class179.field2682[var7];
                                                                                if (var450.startsWith("<img=0>") || var450.startsWith("<img=1>")) {
                                                                                    var450 = var450.substring(7);
                                                                                }
                                                                                class47.field739[var6++] = !class92.method725(var450, -76) ? 0 : 1;
                                                                                continue;
                                                                            }
                                                                            if (~var517 == -3611) {
                                                                                --var6;
                                                                                int var451 = class47.field739[var6];
                                                                                if (class140.field2160 == 2 && ~class262.field4100 < ~var451) {
                                                                                    class179.field2682[var7++] = class5.field74[var451];
                                                                                    continue;
                                                                                }
                                                                                class179.field2682[var7++] = "";
                                                                                continue;
                                                                            }
                                                                            if (~var517 == -3612) {
                                                                                if (class23.field354 != null) {
                                                                                    class179.field2682[var7++] = class25.method203(class23.field354, arg0 + 6653);
                                                                                } else {
                                                                                    class179.field2682[var7++] = "";
                                                                                }
                                                                                continue;
                                                                            }
                                                                            if (var517 == 3612) {
                                                                                if (class23.field354 != null) {
                                                                                    class47.field739[var6++] = class100.field1608;
                                                                                } else {
                                                                                    class47.field739[var6++] = 0;
                                                                                }
                                                                                continue;
                                                                            }
                                                                            if (var517 == 3613) {
                                                                                --var6;
                                                                                int var452 = class47.field739[var6];
                                                                                if (class23.field354 != null && ~class100.field1608 < ~var452) {
                                                                                    class179.field2682[var7++] = class25.method203(class46.field732[var452].field1377, -122);
                                                                                    continue;
                                                                                }
                                                                                class179.field2682[var7++] = "";
                                                                                continue;
                                                                            }
                                                                            if (~var517 == -3615) {
                                                                                --var6;
                                                                                int var453 = class47.field739[var6];
                                                                                if (class23.field354 != null && class100.field1608 > var453) {
                                                                                    class47.field739[var6++] = class46.field732[var453].field1374;
                                                                                    continue;
                                                                                }
                                                                                class47.field739[var6++] = 0;
                                                                                continue;
                                                                            }
                                                                            if (var517 == 3615) {
                                                                                --var6;
                                                                                int var454 = class47.field739[var6];
                                                                                if (class23.field354 != null && var454 < class100.field1608) {
                                                                                    class47.field739[var6++] = class46.field732[var454].field1375;
                                                                                    continue;
                                                                                }
                                                                                class47.field739[var6++] = 0;
                                                                                continue;
                                                                            }
                                                                            if (~var517 == -3617) {
                                                                                class47.field739[var6++] = class239.field3706;
                                                                                continue;
                                                                            }
                                                                            if (var517 == 3617) {
                                                                                --var7;
                                                                                String var455 = class179.field2682[var7];
                                                                                class99.method773(var455, false);
                                                                                continue;
                                                                            }
                                                                            if (var517 == 3618) {
                                                                                class47.field739[var6++] = class23.field330;
                                                                                continue;
                                                                            }
                                                                            if (var517 == 3619) {
                                                                                --var7;
                                                                                String var456 = class179.field2682[var7];
                                                                                class9.method106(-1, class247.method1668(var456, true));
                                                                                continue;
                                                                            }
                                                                            if (var517 == 3620) {
                                                                                class251.method1682(112);
                                                                                continue;
                                                                            }
                                                                            if (~var517 == -3622) {
                                                                                if (class140.field2160 == 0) {
                                                                                    class47.field739[var6++] = -1;
                                                                                } else {
                                                                                    class47.field739[var6++] = class132.field2037;
                                                                                }
                                                                                continue;
                                                                            }
                                                                            if (var517 == 3622) {
                                                                                --var6;
                                                                                int var457 = class47.field739[var6];
                                                                                if (~class140.field2160 != -1 && ~var457 > ~class132.field2037) {
                                                                                    class179.field2682[var7++] = class288.method1938(class295.field4629[var457], 58);
                                                                                    continue;
                                                                                }
                                                                                class179.field2682[var7++] = "";
                                                                                continue;
                                                                            }
                                                                            if (~var517 == -3624) {
                                                                                --var7;
                                                                                String var458 = class179.field2682[var7];
                                                                                if (var458.startsWith("<img=0>") || var458.startsWith("<img=1>")) {
                                                                                    var458 = var458.substring(7);
                                                                                }
                                                                                class47.field739[var6++] = class268.method1819((byte) 121, var458) ? 1 : 0;
                                                                                continue;
                                                                            }
                                                                            if (var517 == 3624) {
                                                                                --var6;
                                                                                int var459 = class47.field739[var6];
                                                                                if (class46.field732 != null && ~var459 > ~class100.field1608 && class46.field732[var459].field1377.equalsIgnoreCase(class261.field4058.field446)) {
                                                                                    class47.field739[var6++] = 1;
                                                                                    continue;
                                                                                }
                                                                                class47.field739[var6++] = 0;
                                                                                continue;
                                                                            }
                                                                            if (~var517 == -3626) {
                                                                                if (class156.field2385 != null) {
                                                                                    class179.field2682[var7++] = class25.method203(class156.field2385, -121);
                                                                                } else {
                                                                                    class179.field2682[var7++] = "";
                                                                                }
                                                                                continue;
                                                                            }
                                                                            if (var517 == 3626) {
                                                                                --var6;
                                                                                int var460 = class47.field739[var6];
                                                                                if (class23.field354 != null && ~var460 > ~class100.field1608) {
                                                                                    class179.field2682[var7++] = class46.field732[var460].field1371;
                                                                                    continue;
                                                                                }
                                                                                class179.field2682[var7++] = "";
                                                                                continue;
                                                                            }
                                                                            if (~var517 == -3628) {
                                                                                --var6;
                                                                                int var461 = class47.field739[var6];
                                                                                if (~class140.field2160 == -3 && ~var461 <= -1 && ~var461 > ~class262.field4100) {
                                                                                    class47.field739[var6++] = class29.field467[var461] ? 1 : 0;
                                                                                    continue;
                                                                                }
                                                                                class47.field739[var6++] = 0;
                                                                                continue;
                                                                            }
                                                                            if (~var517 == -3629) {
                                                                                --var7;
                                                                                String var462 = class179.field2682[var7];
                                                                                if (var462.startsWith("<img=0>") || var462.startsWith("<img=1>")) {
                                                                                    var462 = var462.substring(7);
                                                                                }
                                                                                class47.field739[var6++] = class80.method629(var462, 0);
                                                                                continue;
                                                                            }
                                                                            if (~var517 == -3630) {
                                                                                class47.field739[var6++] = class28.field445;
                                                                                continue;
                                                                            }
                                                                            if (var517 == 3630) {
                                                                                --var7;
                                                                                String var463 = class179.field2682[var7];
                                                                                class280.method1876(true, class247.method1668(var463, true), arg0 ^ -6688);
                                                                                continue;
                                                                            }
                                                                            if (var517 == 3631) {
                                                                                --var6;
                                                                                int var464 = class47.field739[var6];
                                                                                class47.field739[var6++] = class130.field2025[var464] ? 1 : 0;
                                                                                continue;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        if (var517 == 3200) {
                                                                            var6 -= 3;
                                                                            class57.method457(class47.field739[var6 + 1], 255, class47.field739[var6], (byte) 107, class47.field739[var6 + 2]);
                                                                            continue;
                                                                        }
                                                                        if (var517 == 3201) {
                                                                            --var6;
                                                                            class224.method1500(255, class47.field739[var6], (byte) -51);
                                                                            continue;
                                                                        }
                                                                        if (~var517 == -3203) {
                                                                            var6 -= 2;
                                                                            class88.method709(class47.field739[var6], (byte) 126, class47.field739[var6 + 1], 255);
                                                                            continue;
                                                                        }
                                                                    }
                                                                } else {
                                                                    if (var517 == 3100) {
                                                                        --var7;
                                                                        String var465 = class179.field2682[var7];
                                                                        class73.method567("", 0, var465, 67);
                                                                        continue;
                                                                    }
                                                                    if (~var517 == -3102) {
                                                                        var6 -= 2;
                                                                        class87.method699(class47.field739[var6], class261.field4058, (byte) 75, class47.field739[var6 + 1]);
                                                                        continue;
                                                                    }
                                                                    if (var517 == 3103) {
                                                                        class19.method171((byte) 125);
                                                                        continue;
                                                                    }
                                                                    if (var517 == 3104) {
                                                                        --var7;
                                                                        String var466 = class179.field2682[var7];
                                                                        ++class230.field3596;
                                                                        int var467 = 0;
                                                                        if (class44.method367((byte) -60, var466)) {
                                                                            var467 = class290.method1955(var466, 0);
                                                                        }
                                                                        class292.field4607.method1251(93, (byte) -94);
                                                                        class292.field4607.method289(var467, -11);
                                                                        continue;
                                                                    }
                                                                    if (~var517 == -3106) {
                                                                        ++class68.field1076;
                                                                        --var7;
                                                                        String var468 = class179.field2682[var7];
                                                                        class292.field4607.method1251(187, (byte) -94);
                                                                        class292.field4607.method337(2103219728, class247.method1668(var468, true));
                                                                        continue;
                                                                    }
                                                                    if (~var517 == -3107) {
                                                                        ++class188.field2956;
                                                                        --var7;
                                                                        String var469 = class179.field2682[var7];
                                                                        class292.field4607.method1251(57, (byte) -107);
                                                                        class292.field4607.method287(arg0 + 440749382, 1 + var469.length());
                                                                        class292.field4607.method321(arg0 + 6886, var469);
                                                                        continue;
                                                                    }
                                                                    if (~var517 == -3108) {
                                                                        --var6;
                                                                        int var470 = class47.field739[var6];
                                                                        --var7;
                                                                        String var471 = class179.field2682[var7];
                                                                        class275.method1845(true, var470, var471);
                                                                        continue;
                                                                    }
                                                                    if (var517 == 3108) {
                                                                        var6 -= 3;
                                                                        int var472 = class47.field739[var6];
                                                                        int var473 = class47.field739[var6 + 1];
                                                                        int var474 = class47.field739[var6 + 2];
                                                                        class188 var475 = class5.method57((byte) -98, var474);
                                                                        class75.method594(0, var472, var475, var473);
                                                                        continue;
                                                                    }
                                                                    if (var517 == 3109) {
                                                                        var6 -= 2;
                                                                        int var476 = class47.field739[var6];
                                                                        int var477 = class47.field739[var6 + 1];
                                                                        class188 var478 = var46 ? class100.field1607 : class39.field658;
                                                                        class75.method594(0, var476, var478, var477);
                                                                        continue;
                                                                    }
                                                                    if (var517 == 3110) {
                                                                        ++class288.field4544;
                                                                        --var6;
                                                                        int var479 = class47.field739[var6];
                                                                        class292.field4607.method1251(100, (byte) -37);
                                                                        class292.field4607.method312(arg0 + 1489260310, var479);
                                                                        continue;
                                                                    }
                                                                }
                                                            } else {
                                                                --var6;
                                                                class188 var480 = class5.method57((byte) -104, class47.field739[var6]);
                                                                if (~var517 == -2801) {
                                                                    class47.field739[var6++] = client.method1063(var480).method1456((byte) 121);
                                                                    continue;
                                                                }
                                                                if (var517 == 2801) {
                                                                    --var6;
                                                                    int var481 = class47.field739[var6];
                                                                    int var518 = var481 - 1;
                                                                    if (var480.field3001 != null && var480.field3001.length > var518 && var480.field3001[var518] != null) {
                                                                        class179.field2682[var7++] = var480.field3001[var518];
                                                                        continue;
                                                                    }
                                                                    class179.field2682[var7++] = "";
                                                                    continue;
                                                                }
                                                                if (~var517 == -2803) {
                                                                    if (var480.field2855 != null) {
                                                                        class179.field2682[var7++] = var480.field2855;
                                                                    } else {
                                                                        class179.field2682[var7++] = "";
                                                                    }
                                                                    continue;
                                                                }
                                                            }
                                                        } else {
                                                            if (var517 == 2700) {
                                                                --var6;
                                                                class188 var482 = class5.method57((byte) -106, class47.field739[var6]);
                                                                class47.field739[var6++] = var482.field2835;
                                                                continue;
                                                            }
                                                            if (~var517 == -2702) {
                                                                --var6;
                                                                class188 var483 = class5.method57((byte) -123, class47.field739[var6]);
                                                                if (~var483.field2835 != 0) {
                                                                    class47.field739[var6++] = var483.field2995;
                                                                } else {
                                                                    class47.field739[var6++] = 0;
                                                                }
                                                                continue;
                                                            }
                                                            if (var517 == 2702) {
                                                                --var6;
                                                                int var484 = class47.field739[var6];
                                                                class120 var485 = (class120) class13.field230.method1414(true, (long) var484);
                                                                if (var485 != null) {
                                                                    class47.field739[var6++] = 1;
                                                                } else {
                                                                    class47.field739[var6++] = 0;
                                                                }
                                                                continue;
                                                            }
                                                            if (~var517 == -2704) {
                                                                --var6;
                                                                class188 var486 = class5.method57((byte) -103, class47.field739[var6]);
                                                                if (var486.field2968 == null) {
                                                                    class47.field739[var6++] = 0;
                                                                    continue;
                                                                }
                                                                int var487 = var486.field2968.length;
                                                                for (int var488 = 0; ~var488 > ~var486.field2968.length; ++var488) {
                                                                    if (var486.field2968[var488] == null) {
                                                                        var487 = var488;
                                                                        break;
                                                                    }
                                                                }
                                                                class47.field739[var6++] = var487;
                                                                continue;
                                                            }
                                                            if (var517 == 2704 || var517 == 2705) {
                                                                var6 -= 2;
                                                                int var489 = class47.field739[var6 + 1];
                                                                int var490 = class47.field739[var6];
                                                                class120 var491 = (class120) class13.field230.method1414(true, (long) var490);
                                                                if (var491 != null && var491.field1852 == var489) {
                                                                    class47.field739[var6++] = 1;
                                                                    continue;
                                                                }
                                                                class47.field739[var6++] = 0;
                                                                continue;
                                                            }
                                                        }
                                                    } else {
                                                        --var6;
                                                        class188 var492 = class5.method57((byte) -120, class47.field739[var6]);
                                                        if (~var517 == -2601) {
                                                            class47.field739[var6++] = var492.field3008;
                                                            continue;
                                                        }
                                                        if (var517 == 2601) {
                                                            class47.field739[var6++] = var492.field2887;
                                                            continue;
                                                        }
                                                        if (var517 == 2602) {
                                                            class179.field2682[var7++] = var492.field2831;
                                                            continue;
                                                        }
                                                        if (~var517 == -2604) {
                                                            class47.field739[var6++] = var492.field2997;
                                                            continue;
                                                        }
                                                        if (~var517 == -2605) {
                                                            class47.field739[var6++] = var492.field2900;
                                                            continue;
                                                        }
                                                        if (var517 == 2605) {
                                                            class47.field739[var6++] = var492.field2908;
                                                            continue;
                                                        }
                                                        if (var517 == 2606) {
                                                            class47.field739[var6++] = var492.field2945;
                                                            continue;
                                                        }
                                                        if (~var517 == -2608) {
                                                            class47.field739[var6++] = var492.field2990;
                                                            continue;
                                                        }
                                                        if (~var517 == -2609) {
                                                            class47.field739[var6++] = var492.field2933;
                                                            continue;
                                                        }
                                                        if (var517 == 2609) {
                                                            class47.field739[var6++] = var492.field2894;
                                                            continue;
                                                        }
                                                        if (var517 == 2610) {
                                                            class47.field739[var6++] = var492.field2869;
                                                            continue;
                                                        }
                                                        if (var517 == 2611) {
                                                            class47.field739[var6++] = var492.field2953;
                                                            continue;
                                                        }
                                                        if (var517 == 2612) {
                                                            class47.field739[var6++] = var492.field2888;
                                                            continue;
                                                        }
                                                    }
                                                } else {
                                                    --var6;
                                                    class188 var493 = class5.method57((byte) -95, class47.field739[var6]);
                                                    if (var517 == 2500) {
                                                        class47.field739[var6++] = var493.field3003;
                                                        continue;
                                                    }
                                                    if (~var517 == -2502) {
                                                        class47.field739[var6++] = var493.field2961;
                                                        continue;
                                                    }
                                                    if (var517 == 2502) {
                                                        class47.field739[var6++] = var493.field2922;
                                                        continue;
                                                    }
                                                    if (var517 == 2503) {
                                                        class47.field739[var6++] = var493.field2928;
                                                        continue;
                                                    }
                                                    if (var517 == 2504) {
                                                        class47.field739[var6++] = var493.field3009 ? 1 : 0;
                                                        continue;
                                                    }
                                                    if (var517 == 2505) {
                                                        class47.field739[var6++] = var493.field2870;
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                class188 var494 = var46 ? class100.field1607 : class39.field658;
                                                if (~var517 == -1801) {
                                                    class47.field739[var6++] = client.method1063(var494).method1456((byte) 121);
                                                    continue;
                                                }
                                                if (var517 == 1801) {
                                                    --var6;
                                                    int var495 = class47.field739[var6];
                                                    int var519 = var495 - 1;
                                                    if (var494.field3001 != null && ~var519 > ~var494.field3001.length && var494.field3001[var519] != null) {
                                                        class179.field2682[var7++] = var494.field3001[var519];
                                                        continue;
                                                    }
                                                    class179.field2682[var7++] = "";
                                                    continue;
                                                }
                                                if (~var517 == -1803) {
                                                    if (var494.field2855 == null) {
                                                        class179.field2682[var7++] = "";
                                                    } else {
                                                        class179.field2682[var7++] = var494.field2855;
                                                    }
                                                    continue;
                                                }
                                            }
                                        } else {
                                            class188 var496 = !var46 ? class39.field658 : class100.field1607;
                                            if (~var517 == -1701) {
                                                class47.field739[var6++] = var496.field2835;
                                                continue;
                                            }
                                            if (~var517 == -1702) {
                                                if (~var496.field2835 == 0) {
                                                    class47.field739[var6++] = 0;
                                                } else {
                                                    class47.field739[var6++] = var496.field2995;
                                                }
                                                continue;
                                            }
                                            if (~var517 == -1703) {
                                                class47.field739[var6++] = var496.field2856;
                                                continue;
                                            }
                                        }
                                    } else {
                                        class188 var497 = !var46 ? class39.field658 : class100.field1607;
                                        if (var517 == 1500) {
                                            class47.field739[var6++] = var497.field3003;
                                            continue;
                                        }
                                        if (var517 == 1501) {
                                            class47.field739[var6++] = var497.field2961;
                                            continue;
                                        }
                                        if (~var517 == -1503) {
                                            class47.field739[var6++] = var497.field2922;
                                            continue;
                                        }
                                        if (var517 == 1503) {
                                            class47.field739[var6++] = var497.field2928;
                                            continue;
                                        }
                                        if (var517 == 1504) {
                                            class47.field739[var6++] = var497.field3009 ? 1 : 0;
                                            continue;
                                        }
                                        if (~var517 == -1506) {
                                            class47.field739[var6++] = var497.field2870;
                                            continue;
                                        }
                                    }
                                }
                            } else {
                                class188 var504;
                                if (var517 < 2000) {
                                    var504 = var46 ? class100.field1607 : class39.field658;
                                } else {
                                    var517 -= 1000;
                                    --var6;
                                    var504 = class5.method57((byte) -106, class47.field739[var6]);
                                }
                                class246.method1663(255, var504);
                                if (~var517 == -1201 || var517 == 1205 || var517 == 1208 || ~var517 == -1210) {
                                    var6 -= 2;
                                    int var505 = class47.field739[var6];
                                    int var506 = class47.field739[var6 + 1];
                                    if (var504.field2856 == -1) {
                                        class5.method59(var504.field2977, (byte) -110);
                                        class73.method566(var504.field2977, 75);
                                        class127.method904(var504.field2977, 10);
                                    }
                                    if (var505 == -1) {
                                        var504.field2993 = -1;
                                        var504.field2947 = 1;
                                        var504.field2835 = -1;
                                    } else {
                                        var504.field2835 = var505;
                                        var504.field2995 = var506;
                                        if (var517 != 1208 && ~var517 != -1210) {
                                            var504.field2877 = false;
                                        } else {
                                            var504.field2877 = true;
                                        }
                                        class123 var507 = class32.method260(var505, true);
                                        var504.field2990 = var507.field1950;
                                        var504.field2869 = var507.field1944;
                                        var504.field2933 = var507.field1888;
                                        var504.field2945 = var507.field1930;
                                        var504.field2953 = var507.field1924;
                                        if (~var517 != -1206) {
                                            var504.field2991 = true;
                                        } else {
                                            var504.field2991 = false;
                                        }
                                        var504.field2908 = var507.field1905;
                                        if (var504.field2837 > 0) {
                                            var504.field2908 = var504.field2908 * 32 / var504.field2837;
                                        } else if (var504.field2924 > 0) {
                                            var504.field2908 = var504.field2908 * 32 / var504.field2924;
                                        }
                                    }
                                    continue;
                                }
                                if (var517 == 1201) {
                                    var504.field2947 = 2;
                                    --var6;
                                    var504.field2993 = class47.field739[var6];
                                    if (~var504.field2856 == 0) {
                                        class283.method1900(var504.field2977, 4);
                                    }
                                    continue;
                                }
                                if (var517 == 1202) {
                                    var504.field2947 = 3;
                                    var504.field2993 = class261.field4058.field440.method1632((byte) 124);
                                    if (~var504.field2856 == 0) {
                                        class283.method1900(var504.field2977, 4);
                                    }
                                    continue;
                                }
                                if (var517 == 1203) {
                                    var504.field2947 = 6;
                                    --var6;
                                    var504.field2993 = class47.field739[var6];
                                    if (var504.field2856 == -1) {
                                        class283.method1900(var504.field2977, 4);
                                    }
                                    continue;
                                }
                                if (var517 == 1204) {
                                    var504.field2947 = 5;
                                    --var6;
                                    var504.field2993 = class47.field739[var6];
                                    if (~var504.field2856 == 0) {
                                        class283.method1900(var504.field2977, 4);
                                    }
                                    continue;
                                }
                                if (var517 == 1206) {
                                    var6 -= 4;
                                    var504.field2999 = class47.field739[var6];
                                    var504.field2902 = class47.field739[var6 + 1];
                                    var504.field2849 = class47.field739[var6 - -2];
                                    var504.field2964 = class47.field739[var6 + 3];
                                    class246.method1663(255, var504);
                                    continue;
                                }
                                if (~var517 == -1208) {
                                    var6 -= 2;
                                    var504.field2830 = class47.field739[var6];
                                    var504.field2986 = class47.field739[var6 + 1];
                                    class246.method1663(arg0 + 7021, var504);
                                    continue;
                                }
                            }
                        } else {
                            class188 var508;
                            if (var517 < 2000) {
                                var508 = var46 ? class100.field1607 : class39.field658;
                            } else {
                                var517 -= 1000;
                                --var6;
                                var508 = class5.method57((byte) -125, class47.field739[var6]);
                            }
                            if (~var517 == -1101) {
                                var6 -= 2;
                                var508.field3008 = class47.field739[var6];
                                if (~var508.field3008 < ~(-var508.field2922 + var508.field2997)) {
                                    var508.field3008 = var508.field2997 - var508.field2922;
                                }
                                if (~var508.field3008 > -1) {
                                    var508.field3008 = 0;
                                }
                                var508.field2887 = class47.field739[var6 + 1];
                                if (~var508.field2887 < ~(-var508.field2928 + var508.field2900)) {
                                    var508.field2887 = -var508.field2928 + var508.field2900;
                                }
                                if (var508.field2887 < 0) {
                                    var508.field2887 = 0;
                                }
                                class246.method1663(255, var508);
                                if (~var508.field2856 == 0) {
                                    class122.method869(false, var508.field2977);
                                }
                                continue;
                            }
                            if (var517 == 1101) {
                                --var6;
                                var508.field2934 = class47.field739[var6];
                                class246.method1663(arg0 ^ -6803, var508);
                                if (var508.field2856 == -1) {
                                    class261.method1759((byte) 95, var508.field2977);
                                }
                                continue;
                            }
                            if (var517 == 1102) {
                                --var6;
                                var508.field2843 = class47.field739[var6] == 1;
                                class246.method1663(255, var508);
                                continue;
                            }
                            if (~var517 == -1104) {
                                --var6;
                                var508.field2894 = class47.field739[var6];
                                class246.method1663(255, var508);
                                continue;
                            }
                            if (~var517 == -1105) {
                                --var6;
                                var508.field2838 = class47.field739[var6];
                                class246.method1663(255, var508);
                                continue;
                            }
                            if (var517 == 1105) {
                                --var6;
                                var508.field2888 = class47.field739[var6];
                                class246.method1663(255, var508);
                                continue;
                            }
                            if (~var517 == -1107) {
                                --var6;
                                var508.field2828 = class47.field739[var6];
                                class246.method1663(arg0 + 7021, var508);
                                continue;
                            }
                            if (~var517 == -1108) {
                                --var6;
                                var508.field2882 = class47.field739[var6] == 1;
                                class246.method1663(255, var508);
                                continue;
                            }
                            if (~var517 == -1109) {
                                var508.field2947 = 1;
                                --var6;
                                var508.field2993 = class47.field739[var6];
                                class246.method1663(255, var508);
                                if (var508.field2856 == -1) {
                                    class283.method1900(var508.field2977, 4);
                                }
                                continue;
                            }
                            if (~var517 == -1110) {
                                var6 -= 6;
                                var508.field2869 = class47.field739[var6];
                                var508.field2953 = class47.field739[var6 - -1];
                                var508.field2945 = class47.field739[var6 + 2];
                                var508.field2933 = class47.field739[var6 + 3];
                                var508.field2990 = class47.field739[var6 + 4];
                                var508.field2908 = class47.field739[var6 + 5];
                                class246.method1663(arg0 ^ -6803, var508);
                                if (var508.field2856 == -1) {
                                    class73.method566(var508.field2977, -120);
                                    class127.method904(var508.field2977, 10);
                                }
                                continue;
                            }
                            if (~var517 == -1111) {
                                --var6;
                                int var509 = class47.field739[var6];
                                if (var508.field2857 != var509) {
                                    var508.field2833 = 0;
                                    var508.field2857 = var509;
                                    var508.field2868 = 1;
                                    var508.field2974 = 0;
                                    class246.method1663(255, var508);
                                }
                                if (var508.field2856 == -1) {
                                    class290.method1952((byte) -110, var508.field2977);
                                }
                                continue;
                            }
                            if (var517 == 1111) {
                                --var6;
                                var508.field2880 = ~class47.field739[var6] == -2;
                                class246.method1663(255, var508);
                                continue;
                            }
                            if (var517 == 1112) {
                                --var7;
                                String var510 = class179.field2682[var7];
                                if (!var510.equals(var508.field2831)) {
                                    var508.field2831 = var510;
                                    class246.method1663(255, var508);
                                }
                                if (~var508.field2856 == 0) {
                                    class265.method1808(var508.field2977, arg0 + 6769);
                                }
                                continue;
                            }
                            if (~var517 == -1114) {
                                --var6;
                                var508.field2878 = class47.field739[var6];
                                class246.method1663(arg0 ^ -6803, var508);
                                continue;
                            }
                            if (~var517 == -1115) {
                                var6 -= 3;
                                var508.field2914 = class47.field739[var6];
                                var508.field2844 = class47.field739[var6 + 1];
                                var508.field2825 = class47.field739[var6 + 2];
                                class246.method1663(255, var508);
                                continue;
                            }
                            if (~var517 == -1116) {
                                --var6;
                                var508.field2984 = class47.field739[var6] == 1;
                                class246.method1663(255, var508);
                                continue;
                            }
                            if (var517 == 1116) {
                                --var6;
                                var508.field2891 = class47.field739[var6];
                                class246.method1663(arg0 + 7021, var508);
                                continue;
                            }
                            if (~var517 == -1118) {
                                --var6;
                                var508.field2879 = class47.field739[var6];
                                class246.method1663(255, var508);
                                continue;
                            }
                            if (var517 == 1118) {
                                --var6;
                                var508.field2959 = class47.field739[var6] == 1;
                                class246.method1663(arg0 + 7021, var508);
                                continue;
                            }
                            if (~var517 == -1120) {
                                --var6;
                                var508.field2930 = ~class47.field739[var6] == -2;
                                class246.method1663(255, var508);
                                continue;
                            }
                            if (~var517 == -1121) {
                                var6 -= 2;
                                var508.field2997 = class47.field739[var6];
                                var508.field2900 = class47.field739[var6 + 1];
                                class246.method1663(arg0 ^ -6803, var508);
                                if (var508.field2937 == 0) {
                                    class160.method1079(false, 5, var508);
                                }
                                continue;
                            }
                            if (var517 == 1121) {
                                class246.method1663(255, var508);
                                var6 -= 2;
                                continue;
                            }
                            if (var517 == 1122) {
                                --var6;
                                var508.field2862 = class47.field739[var6] == 1;
                                class246.method1663(arg0 + 7021, var508);
                                continue;
                            }
                            if (var517 == 1123) {
                                --var6;
                                var508.field2908 = class47.field739[var6];
                                class246.method1663(arg0 + 7021, var508);
                                if (var508.field2856 == -1) {
                                    class73.method566(var508.field2977, 123);
                                }
                                continue;
                            }
                            if (var517 == 1124) {
                                --var6;
                                int var511 = class47.field739[var6];
                                var508.field2954 = ~var511 == -2;
                                class246.method1663(255, var508);
                                continue;
                            }
                        }
                    } else {
                        class188 var69;
                        if (~var517 > -2001) {
                            var69 = var46 ? class100.field1607 : class39.field658;
                        } else {
                            var517 -= 1000;
                            --var6;
                            var69 = class5.method57((byte) -119, class47.field739[var6]);
                        }
                        if (var517 == 1000) {
                            var6 -= 4;
                            var69.field2846 = class47.field739[var6];
                            var69.field2860 = class47.field739[var6 + 1];
                            int var70 = class47.field739[var6 + 2];
                            if (var70 >= 0) {
                                if (var70 > 5) {
                                    var70 = 5;
                                }
                            } else {
                                var70 = 0;
                            }
                            int var71 = class47.field739[var6 + 3];
                            if (~var71 > -1) {
                                var71 = 0;
                            } else if (~var71 < -6) {
                                var71 = 5;
                            }
                            var69.field2970 = (byte) var71;
                            var69.field2901 = (byte) var70;
                            class246.method1663(255, var69);
                            class207.method1385(88, var69);
                            if (~var69.field2856 == 0) {
                                method489(var69.field2977, (byte) 120);
                            }
                            continue;
                        }
                        if (var517 == 1001) {
                            var6 -= 4;
                            var69.field2924 = class47.field739[var6];
                            var69.field2893 = class47.field739[var6 + 1];
                            var69.field2859 = 0;
                            var69.field2837 = 0;
                            int var72 = class47.field739[var6 + 3];
                            if (~var72 <= -1) {
                                if (var72 > 4) {
                                    var72 = 4;
                                }
                            } else {
                                var72 = 0;
                            }
                            int var73 = class47.field739[var6 + 2];
                            var69.field2861 = (byte) var72;
                            if (var73 < 0) {
                                var73 = 0;
                            } else if (~var73 < -5) {
                                var73 = 4;
                            }
                            var69.field2966 = (byte) var73;
                            class246.method1663(255, var69);
                            class207.method1385(arg0 + 6890, var69);
                            if (var69.field2937 == 0) {
                                class160.method1079(false, 5, var69);
                            }
                            continue;
                        }
                        if (var517 == 1003) {
                            --var6;
                            boolean var74 = class47.field739[var6] == 1;
                            if (var74 == !var69.field3009) {
                                var69.field3009 = var74;
                                class246.method1663(255, var69);
                            }
                            if (var69.field2856 == -1) {
                                class47.method387(-46, var69.field2977);
                            }
                            continue;
                        }
                        if (var517 == 1004) {
                            var6 -= 2;
                            var69.field2892 = class47.field739[var6];
                            var69.field2965 = class47.field739[var6 + 1];
                            class246.method1663(255, var69);
                            class207.method1385(83, var69);
                            if (var69.field2937 == 0) {
                                class160.method1079(false, 5, var69);
                            }
                            continue;
                        }
                        if (var517 == 1005) {
                            --var6;
                            var69.field2910 = ~class47.field739[var6] == -2;
                            continue;
                        }
                    }
                    throw new IllegalStateException();
                }
            } catch (Exception var516) {
                if (var5.field3539 == null) {
                    if (~class238.field3689 != -1) {
                        class73.method567("", 0, "Clientscript error - check log for details", 9);
                    }
                    class223.method1490(var516, "CS2 - scr:" + var5.field1408 + " op:" + var11, (byte) -66);
                } else {
                    StringBuffer var513 = new StringBuffer(30);
                    var513.append("%0a - in: ").append(var5.field3539);
                    for (int var514 = class238.field3686 + -1; ~var514 <= -1; --var514) {
                        var513.append("%0a - via: ").append(class47.field766[var514].field271.field3539);
                    }
                    if (~var11 == -41) {
                        int var515 = var10[var8];
                        var513.append("%0a - non-existant gosub script-num: ").append(Integer.toString(var515));
                    }
                    if (class238.field3689 != 0) {
                        class73.method567("", 0, "Clientscript error in: " + var5.field3539, 98);
                    }
                    class223.method1490(var516, "CS2 - scr:" + var5.field1408 + " op:" + var11 + var513.toString(), (byte) -66);
                }
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIII)V")
    public static final void method487(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != -5306) {
            method485(-69);
        }
        if (~arg0 <= ~class271.field4289 && ~class113.field1779 <= ~arg0) {
            int var5 = class68.method533(class75.field1265, class261.field4025, arg3, (byte) 58);
            int var6 = class68.method533(class75.field1265, class261.field4025, arg2, (byte) 86);
            class133.method928(arg0, var6, 3668, var5, arg1);
        }
        ++field969;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(BLf;I)V")
    public final void method80(byte arg0, class37 arg1, int arg2) {
        if (arg0 != -79) {
            this.method490(-97);
        }
        if (arg2 == 0) {
            this.field979 = arg1.method333((byte) -59);
            this.field970 = new int[arg1.method333((byte) -59)][2];
            for (int var4 = 0; this.field970.length > var4; ++var4) {
                this.field970[var4][0] = arg1.method293(108);
                this.field970[var4][1] = arg1.method293(arg0 + -41);
            }
        }
        ++field980;
    }

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "(I)V")
    private final void method488(int arg0) {
        ++field977;
        int[] var2 = this.field970[0];
        int[] var3 = this.field970[this.field970.length - 2];
        int[] var4 = this.field970[this.field970.length - 1];
        int[] var5 = this.field970[1];
        this.field978 = new int[] { var3[0] - var4[arg0] + var3[0], var3[1] + -var4[1] + var3[1] };
        this.field972 = new int[] { -var5[0] - (-var2[0] - var2[0]), var2[1] - (-var2[1] - -var5[1]) };
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(IB)V")
    private static final void method489(int arg0, byte arg1) {
        ++field982;
        if (arg1 > 101) {
            class295 var2 = class250.method1673(73, 11, arg0);
            var2.method1979(-8205);
        }
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V")
    public class61() {
        super(1, true);
    }

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "(I)V")
    private final void method490(int arg0) {
        ++field989;
        if (arg0 != 1997) {
            method487(72, 109, 29, -58, 73);
        }
        int var2 = this.field979;
        if (~var2 != -3) {
            if (var2 == 1) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; ~var5 > ~(this.field970.length + -1) && ~var4 <= ~this.field970[var5][0]; ++var5) {
                    }
                    int[] var6 = this.field970[var5 + -1];
                    int[] var7 = this.field970[var5];
                    int var8 = (-var6[0] + var4 << 12) / (var7[0] + -var6[0]);
                    int var9 = 4096 - class221.field3456[255 & var8 >> 5] >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 - -(var7[1] * var9) >> 12;
                    if (~var11 >= 32767) {
                        var11 = -32767;
                    }
                    if (var11 >= 32768) {
                        var11 = 32767;
                    }
                    this.field976[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; ~var12 > -258; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; ~(this.field970.length + -1) < ~var14 && ~var13 <= ~this.field970[var14][0]; ++var14) {
                    }
                    int[] var15 = this.field970[var14 + -1];
                    int[] var16 = this.field970[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] - var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (~var19 >= 32767) {
                        var19 = -32767;
                    }
                    if (var19 >= 32768) {
                        var19 = 32767;
                    }
                    this.field976[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; var20 < 257; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; ~var22 > ~(this.field970.length + -1) && ~this.field970[var22][0] >= ~var21; ++var22) {
                }
                int[] var23 = this.field970[var22];
                int[] var24 = this.field970[var22 + -1];
                int var25 = this.method491(var22 + -2, (byte) 76)[1];
                int var26 = var24[1];
                int var27 = var23[1];
                int var28 = this.method491(var22 + 1, (byte) -120)[1];
                int var29 = (-var24[0] + var21 << 12) / (var23[0] + -var24[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = -var25 - -var26 + -var27 + var28;
                int var32 = -var26 + -var31 + var25;
                int var33 = -var25 + var27;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var29 * var33 >> 12;
                int var37 = var30 * var32 >> 12;
                int var38 = var26 + var36 + var35 + var37;
                if (~var38 >= 32767) {
                    var38 = -32767;
                }
                if (~var38 <= -32769) {
                    var38 = 32767;
                }
                this.field976[var20] = (short) var38;
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(IB)[I")
    private final int[] method491(int arg0, byte arg1) {
        ++field984;
        if (~arg0 > -1) {
            return this.field972;
        } else {
            int var3 = 95 / ((-83 - arg1) / 34);
            return this.field970.length <= arg0 ? this.field978 : this.field970[arg0];
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Ljava/lang/String;ZB)V")
    public static final void method492(String arg0, boolean arg1, byte arg2) {
        if (arg1) {
            try {
                class179.field2677.getAppletContext().showDocument(new URL(class179.field2677.getCodeBase(), arg0), "_blank");
            } catch (Exception var5) {
            }
        } else {
            try {
                class138.method959("loggedout", (byte) -69, class22.field329.field934);
            } catch (Throwable var4) {
            }
            try {
                class179.field2677.getAppletContext().showDocument(new URL(class179.field2677.getCodeBase(), arg0), "_top");
            } catch (Exception var3) {
            }
        }
        ++field975;
        if (arg2 != 43) {
            field990 = null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(Z)V")
    public final void method493(boolean arg0) {
        ++field986;
        if (this.field970 == null) {
            this.field970 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (this.field970.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (this.field979 == 2) {
                this.method488(0);
            }
            class87.method698(arg0);
            this.method490(1997);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)[I")
    public final int[] method448(int arg0, int arg1) {
        int[] var3 = super.field1254.method1328((byte) -108, arg1);
        if (arg0 != 4) {
            this.method80((byte) -50, (class37) null, -42);
        }
        if (super.field1254.field3118) {
            int[] var4 = this.method590(arg0 ^ 4, 0, arg1);
            for (int var5 = 0; ~class178.field2662 < ~var5; ++var5) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (~var6 < -257) {
                    var6 = 256;
                }
                var3[var5] = this.field976[var6];
            }
        }
        ++field974;
        return var3;
    }

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "(I)V")
    private static final void method494(int arg0) {
        if (arg0 == 1) {
            class8.field176.method1782(-33);
            ++field971;
        }
    }
}
