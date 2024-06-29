import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class204 extends class1 {

    @OriginalMember(owner = "client!tf", name = "ub", descriptor = "I")
    private int field3628 = 4096;

    @OriginalMember(owner = "client!tf", name = "kb", descriptor = "Loc;")
    private static class151 field3618 = class137.method873(2, "glow2:");

    @OriginalMember(owner = "client!tf", name = "mb", descriptor = "Loc;")
    public static class151 field3620 = field3618;

    @OriginalMember(owner = "client!tf", name = "gb", descriptor = "[I")
    public static int[] field3614 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!tf", name = "ob", descriptor = "[B")
    public static byte[] field3622 = new byte[520];

    @OriginalMember(owner = "client!tf", name = "ib", descriptor = "Loc;")
    public static class151 field3616 = field3618;

    @OriginalMember(owner = "client!tf", name = "wb", descriptor = "I")
    public static int field3630 = -1;

    @OriginalMember(owner = "client!tf", name = "hb", descriptor = "Loc;")
    private static class151 field3615 = class137.method873(2, "Lade Eingabe)2Steuerungsprogramm)3)3)3");

    @OriginalMember(owner = "client!tf", name = "xb", descriptor = "[I")
    public static int[] field3631 = new int[32];

    @OriginalMember(owner = "client!tf", name = "jb", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!tf", name = "lb", descriptor = "I")
    public static int field3619;

    @OriginalMember(owner = "client!tf", name = "nb", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!tf", name = "qb", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!tf", name = "rb", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!tf", name = "sb", descriptor = "I")
    public static int field3626;

    @OriginalMember(owner = "client!tf", name = "tb", descriptor = "I")
    public static int field3627;

    @OriginalMember(owner = "client!tf", name = "vb", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!tf", name = "yb", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!tf", name = "pb", descriptor = "Lcg;")
    public static class30 field3623;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IBIII)V")
    public static final void method1288(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        class55.method380(arg4, 111, class43.field887[arg3], arg0 + arg2, -arg2 + arg0);
        ++field3621;
        int var5 = 0;
        int var6 = -1;
        int var7 = arg2;
        int var8 = -arg2;
        while (~var5 > ~var7) {
            var6 += 2;
            ++var5;
            var8 += var6;
            if (~var8 <= -1) {
                --var7;
                int[] var9 = class43.field887[-var7 + arg3];
                var8 -= var7 << 1;
                int var10 = arg0 + var5;
                int var11 = -var5 + arg0;
                int[] var12 = class43.field887[arg3 + var7];
                class55.method380(arg4, 107, var12, var10, var11);
                class55.method380(arg4, 118, var9, var10, var11);
            }
            int var13 = arg0 + var7;
            int var14 = -var7 + arg0;
            int[] var15 = class43.field887[arg3 + var5];
            int[] var16 = class43.field887[-var5 + arg3];
            class55.method380(arg4, 118, var15, var13, var14);
            class55.method380(arg4, 125, var16, var13, var14);
        }
        if (arg1 != 35) {
            field3616 = null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "(B)V")
    public static final void method1289(byte arg0) {
        class78.field1508 = new byte[4][105][105];
        ++field3619;
        class79.field1521 = new byte[4][104][104];
        class223.field3883 = new int[104];
        class197.field3506 = new byte[4][104][104];
        class94.field1759 = new byte[4][104][104];
        class185.field3319 = new byte[4][104][104];
        class141.field2558 = new int[104];
        class53.field1067 = 99;
        class109.field1941 = new int[104];
        class175.field3167 = new int[104];
        class231.field4122 = new int[4][105][105];
        class103.field1850 = new int[104];
        if (arg0 != 107) {
            method1294(-69);
        }
    }

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "(I)V")
    public static final void method1290(int arg0) {
        class19.field397 = 0;
        ++field3627;
        int var1 = (class228.field3975.field3976 >> 7) + class232.field4188;
        if (arg0 != 3008) {
            method1293((byte) -54);
        }
        int var2 = (class228.field3975.field4029 >> 7) + class64.field1255;
        if (~var1 <= -3054 && ~var1 >= -3157 && var2 >= 3056 && var2 <= 3136) {
            class19.field397 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && ~var2 <= -9493 && ~var2 >= -9536) {
            class19.field397 = 1;
        }
        if (~class19.field397 == -2 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class19.field397 = 0;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(BI)[I")
    public final int[] method11(byte arg0, int arg1) {
        ++field3625;
        if (arg0 != 107) {
            field3623 = null;
        }
        int[] var3 = super.field21.method1182(arg1, arg0 + -31816);
        if (super.field21.field3388) {
            int[] var4 = this.method4(class155.field2804 & arg1 + -1, -115, 0);
            int[] var5 = this.method4(arg1, arg0 ^ -10, 0);
            int[] var6 = this.method4(class155.field2804 & arg1 - -1, arg0 ^ -4, 0);
            for (int var7 = 0; ~class202.field3603 < ~var7; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field3628;
                int var9 = (var5[var7 + 1 & class78.field1510] + -var5[class78.field1510 & var7 + -1]) * this.field3628;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var12 + var13 + 4096) / 4096.0F)) * 4096.0D);
                int var15 = ~var14 != -1 ? 16777216 / var14 : 0;
                var3[var7] = -var15 + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IILwa;)V")
    public final void method13(int arg0, int arg1, class229 arg2) {
        ++field3617;
        if (arg0 == arg1) {
            this.field3628 = arg2.method1490((byte) 73);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IILsd;I)Z")
    public static final boolean method1291(int arg0, int arg1, class192 arg2, int arg3) {
        if (arg0 != 0) {
            field3631 = null;
        }
        ++field3626;
        byte[] var4 = arg2.method1208(arg1, (byte) 76, arg3);
        if (var4 == null) {
            return false;
        } else {
            class133.method818(var4, (byte) 56);
            return true;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIILwg;JLwg;Lwg;)V")
    public static final void method1292(int arg0, int arg1, int arg2, int arg3, class235 arg4, long arg5, class235 arg6, class235 arg7) {
        class126 var9 = new class126();
        var9.field2255 = arg4;
        var9.field2256 = arg1 * 128 + 64;
        var9.field2248 = arg2 * 128 + 64;
        var9.field2262 = arg3;
        var9.field2258 = arg5;
        var9.field2252 = arg6;
        var9.field2260 = arg7;
        int var10 = 0;
        class72 var11 = class95.field1776[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field1397; ++var12) {
                class124 var13 = var11.field1405[var12];
                if ((var13.field2230 & 4194304L) == 4194304L) {
                    int var14 = var13.field2220.method74();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field2254 = -var10;
        if (class95.field1776[arg0][arg1][arg2] == null) {
            class95.field1776[arg0][arg1][arg2] = new class72(arg0, arg1, arg2);
        }
        class95.field1776[arg0][arg1][arg2].field1407 = var9;
    }

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "(B)V")
    public static final void method1293(byte arg0) {
        int var1 = -26 % ((arg0 - -52) / 49);
        ++field3632;
        ++class152.field2753;
        class48.field984.method650(-13721, 205);
        class48.field984.method1458((byte) 89, 0L);
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "()V")
    public class204() {
        super(1, true);
    }

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "(I)V")
    public static void method1294(int arg0) {
        field3618 = null;
        field3620 = null;
        field3615 = null;
        field3623 = null;
        if (arg0 < 46) {
            field3614 = null;
        }
        field3631 = null;
        field3614 = null;
        field3616 = null;
        field3622 = null;
    }

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "(B)V")
    public static final void method1295(byte arg0) {
        class118.field2121 = class31.field645;
        class111.field1960 = class152.field2760;
        class53.field1076 = class42.field871;
        class40.field843 = class139.field2543;
        class235.field4362 = class233.field4287;
        class104.field1868 = field3615;
        class178.field3214 = class228.field3995;
        class115.field2049 = class101.field1833;
        class114.field2024 = class71.field1388;
        class124.field2231 = class25.field523;
        class14.field329 = class174.field3159;
        class190.field3365 = class16.field374;
        class58.field1159 = class191.field3377;
        class187.field3326 = class53.field1077;
        class162.field2930 = class32.field653;
        class124.field2237 = class63.field1220;
        class163.field2955 = class237.field4411;
        class142.field2567 = class92.field1682;
        class43.field894 = class72.field1409;
        class165.field2969 = class55.field1114;
        class147.field2638 = class40.field811;
        class235.field4349 = class92.field1674;
        class113.field2019 = class21.field474;
        class159.field2860 = class32.field656;
        class162.field2935 = class167.field3045;
        class223.field3874 = class92.field1674;
        class64.field1250 = class197.field3517;
        class223.field3890 = class92.field1674;
        class141.field2560 = class169.field3090;
        class170.field3102 = class220.field3826;
        class55.field1116 = class215.field3759;
        class101.field1832 = class9.field145;
        class31.field641 = class56.field1135;
        class36.field734 = class23.field514;
        class144.field2602 = class32.field654;
        class42.field868 = class177.field3199;
        class79.field1527 = class149.field2666;
        class68.field1345 = class19.field412;
        class223.field3865 = class92.field1674;
        class235.field4367 = class233.field4287;
        class182.field3283 = class225.field3927;
        class235.field4345 = class233.field4287;
        class177.field3202 = class166.field3016;
        class175.field3180 = class95.field1765;
        class159.field2867 = class170.field3092;
        class166.field3036 = class108.field1905;
        class235.field4344 = class89.field1624;
        class213.field3740 = class218.field3796;
        class175.field3173 = class126.field2253;
        class235.field4341 = class233.field4287;
        class163.field2956 = class36.field728;
        class235.field4346 = class43.field895;
        field3616 = class189.field3349;
        if (arg0 != 44) {
            method1295((byte) -105);
        }
        class235.field4338 = class218.field3806;
        class180.field3259 = class175.field3164;
        class128.field2308 = class89.field1630;
        class224.field3901 = class89.field1631;
        class161.field2914 = class36.field747;
        class42.field875 = class187.field3329;
        class235.field4352 = class233.field4287;
        class109.field1939 = class83.field1570;
        class52.field1048 = class41.field856;
        class181.field3270 = class217.field3783;
        class72.field1417 = class192.field3434;
        class142.field2573 = class46.field946;
        class121.field2181 = class177.field3198;
        class147.field2636 = class224.field3902;
        class108.field1911 = class124.field2241;
        class235.field4353 = class233.field4287;
        class167.field3044 = class130.field2386;
        class179.field3251 = class128.field2298;
        class115.field2039 = class231.field4124;
        class126.field2249 = client.field698;
        class235.field4380 = class233.field4287;
        class141.field2564 = class112.field1994;
        class175.field3166 = class126.field2253;
        class2.field60 = class134.field2443;
        class226.field3943 = class7.field118;
        class117.field2104 = class155.field2817;
        class27.field565 = class4.field84;
        class235.field4343 = class233.field4287;
        class235.field4375 = class153.field2785;
        class81.field1548 = class167.field3040;
        class223.field3868 = class152.field2759;
        class25.field537 = class232.field4267;
        class235.field4372 = class233.field4287;
        class1.field37 = class212.field3735;
        class223.field3866 = class164.field2958;
        class161.field2905 = class193.field3459;
        class235.field4366 = class233.field4287;
        class14.field318 = class50.field1010;
        class205.field3634 = class200.field3544;
        class33.field669 = class46.field953;
        class219.field3814 = class20.field432;
        class235.field4371 = class233.field4287;
        class69.field1354 = class195.field3471;
        class190.field3364 = class206.field3647;
        class235.field4357 = class89.field1624;
        class93.field1747 = class57.field1146;
        class5.field96 = class220.field3827;
        class235.field4369 = class233.field4287;
        class99.field1787 = class197.field3524;
        class45.field938 = class51.field1035;
        class116.field2087 = class180.field3265;
        class159.field2858 = class178.field3223;
        class235.field4378 = class14.field333;
        class157.field2843 = class23.field515;
        class169.field3084 = class29.field625;
        class196.field3483 = class90.field1653;
        class235.field4368 = class233.field4287;
        class163.field2951 = class103.field1862;
        class54.field1100 = class115.field2062;
        class50.field1016 = class217.field3779;
        class27.field569 = class9.field142;
        class235.field4342 = class233.field4287;
        class225.field3918 = class129.field2372;
        class236.field4385 = class57.field1148;
        class235.field4351 = class233.field4287;
        class89.field1620 = class235.field4348;
        class170.field3094 = class56.field1129;
        class226.field3934 = class195.field3475;
        class223.field3869 = class152.field2759;
        class1.field36 = class212.field3735;
        class200.field3547 = class231.field4117;
        class215.field3768 = class94.field1764;
        class223.field3872 = class131.field2414;
        class235.field4333 = class22.field485;
        class235.field4339 = class161.field2910;
        class130.field2390 = class85.field1601;
        class45.field933 = class36.field731;
        class208.field3666 = class162.field2940;
        class223.field3867 = class146.field2622;
        class14.field321 = class202.field3604;
        class22.field489 = class66.field1277;
        class55.field1119 = class123.field2200;
        class8.field123 = class99.field1795;
        class104.field1873 = class215.field3765;
        class235.field4373 = class9.field141;
        class27.field579 = class14.field335;
        class45.field940 = client.field701;
        class146.field2608 = class64.field1254;
        class235.field4337 = class233.field4287;
        class108.field1899 = class181.field3278;
        class45.field944 = class25.field545;
        class118.field2126 = class47.field977;
        class235.field4379 = class233.field4287;
        class182.field3289 = class36.field752;
        class182.field3286 = class233.field4287;
        class210.field3685 = class149.field2665;
        class63.field1218 = class65.field1264;
        class231.field4120 = class91.field1669;
        class27.field582 = class9.field142;
        class235.field4365 = class5.field101;
        class45.field924 = class104.field1867;
        class174.field3146 = class55.field1120;
        class235.field4360 = class233.field4287;
        class63.field1238 = class108.field1901;
        class36.field754 = class170.field3091;
        class235.field4336 = class233.field4287;
        class193.field3462 = class58.field1166;
        class36.field730 = class15.field353;
        class235.field4359 = class92.field1683;
        class29.field610 = class175.field3174;
        class90.field1654 = class52.field1052;
        class45.field931 = class211.field3702;
        class162.field2929 = class123.field2194;
        class113.field2009 = class148.field2653;
        class123.field2193 = class27.field571;
        class192.field3445 = class161.field2908;
        class235.field4355 = class233.field4287;
        class235.field4350 = class109.field1925;
        class235.field4364 = class92.field1683;
        class11.field198 = class43.field876;
        class156.field2830 = class85.field1596;
        class112.field1975 = class167.field3046;
        class45.field929 = class211.field3702;
        class187.field3327 = class66.field1275;
        class232.field4262 = class154.field2791;
        class131.field2407 = class68.field1352;
        class58.field1160 = class29.field616;
        class115.field2074 = class156.field2833;
        class54.field1104 = class115.field2062;
        ++field3629;
        class197.field3512 = class50.field1007;
        class235.field4377 = class166.field3034;
        class235.field4354 = class233.field4287;
        class223.field3888 = class131.field2414;
        class106.field1875 = class31.field648;
        class27.field575 = class71.field1375;
        class235.field4376 = class179.field3250;
        class131.field2406 = class13.field310;
        class163.field2947 = class44.field908;
        class31.field647 = class200.field3545;
        class20.field453 = class225.field3913;
        class193.field3461 = class44.field914;
        class176.field3184 = class57.field1142;
        class179.field3239 = class216.field3771;
    }
}
