import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class53 extends class203 {

    @OriginalMember(owner = "client!km", name = "L", descriptor = "Lmh;")
    private static class62 field763 = class201.method1405(true, "Type");

    @OriginalMember(owner = "client!km", name = "X", descriptor = "Lmh;")
    public static class62 field775 = field763;

    @OriginalMember(owner = "client!km", name = "T", descriptor = "Lmh;")
    public static class62 field771 = class201.method1405(true, ":clanreq:");

    @OriginalMember(owner = "client!km", name = "W", descriptor = "Lmh;")
    public static class62 field774 = class29.method176(160, 58);

    @OriginalMember(owner = "client!km", name = "cb", descriptor = "I")
    public static int field780 = -1;

    @OriginalMember(owner = "client!km", name = "eb", descriptor = "Lmh;")
    public static class62 field782 = class201.method1405(true, "Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100");

    @OriginalMember(owner = "client!km", name = "G", descriptor = "I")
    public static int field758;

    @OriginalMember(owner = "client!km", name = "H", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!km", name = "I", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!km", name = "K", descriptor = "I")
    public static int field762;

    @OriginalMember(owner = "client!km", name = "M", descriptor = "I")
    public static int field764;

    @OriginalMember(owner = "client!km", name = "N", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!km", name = "Q", descriptor = "I")
    public static int field768;

    @OriginalMember(owner = "client!km", name = "R", descriptor = "I")
    public static int field769;

    @OriginalMember(owner = "client!km", name = "S", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!km", name = "U", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!km", name = "V", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!km", name = "ab", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!km", name = "bb", descriptor = "Lvb;")
    public static class137 field779;

    @OriginalMember(owner = "client!km", name = "db", descriptor = "Lhi;")
    public static class26 field781;

    @OriginalMember(owner = "client!km", name = "J", descriptor = "Lmh;")
    public class62 field761;

    @OriginalMember(owner = "client!km", name = "O", descriptor = "[I")
    public int[] field766;

    @OriginalMember(owner = "client!km", name = "P", descriptor = "[I")
    public int[] field767;

    @OriginalMember(owner = "client!km", name = "Y", descriptor = "[I")
    public int[] field776;

    @OriginalMember(owner = "client!km", name = "Z", descriptor = "[I")
    public int[] field777;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IIILsg;)V", line = 4)
    public static final void method341(int arg0, int arg1, int arg2, class191 arg3) {
        if (arg1 != 20205) {
            field763 = (class62) null;
        }
        if (arg3.field3077 == 0) {
            arg3.field3098 = arg3.field3124;
        } else if (arg3.field3077 == 1) {
            arg3.field3098 = (arg0 - arg3.field3126) / 2 + arg3.field3124;
        } else if (arg3.field3077 == 2) {
            arg3.field3098 = arg0 - arg3.field3126 - arg3.field3124;
        } else if (arg3.field3077 == 3) {
            arg3.field3098 = arg3.field3124 * arg0 >> 14;
        } else if (arg3.field3077 == 4) {
            arg3.field3098 = (arg0 - arg3.field3126) / 2 + (arg3.field3124 * arg0 >> 14);
        } else {
            arg3.field3098 = arg0 - arg3.field3126 - (arg3.field3124 * arg0 >> 14);
        }
        if (arg3.field3072 == 0) {
            arg3.field3152 = arg3.field3049;
        } else if (arg3.field3072 == 1) {
            arg3.field3152 = (arg2 - arg3.field3190) / 2 + arg3.field3049;
        } else if (arg3.field3072 == 2) {
            arg3.field3152 = arg2 - arg3.field3049 - arg3.field3190;
        } else if (arg3.field3072 == 3) {
            arg3.field3152 = arg3.field3049 * arg2 >> 14;
        } else if (arg3.field3072 == 4) {
            arg3.field3152 = (arg3.field3049 * arg2 >> 14) + (arg2 - arg3.field3190) / 2;
        } else {
            arg3.field3152 = arg2 - arg3.field3190 - (arg3.field3049 * arg2 >> 14);
        }
        field778++;
        if (!class263.field4433 || !(client.method2058(arg3) != 0 || arg3.field3068 == 0)) {
            return;
        }
        if (arg3.field3098 < 0) {
            arg3.field3098 = 0;
        } else if ((arg3.field3126 + arg3.field3098) > arg0) {
            arg3.field3098 = arg0 - arg3.field3126;
        }
        if (arg3.field3152 < 0) {
            arg3.field3152 = 0;
        } else if ((arg3.field3190 + arg3.field3152) > arg2) {
            arg3.field3152 = arg2 - arg3.field3190;
        }
    }

    @OriginalMember(owner = "client!km", name = "d", descriptor = "(I)V", line = 82)
    public final void method342(int arg0) {
        if (arg0 < 82) {
            this.field777 = (int[]) null;
        }
        field762++;
        if (this.field767 != null) {
            for (int var2 = 0; var2 < this.field767.length; var2++) {
                this.field767[var2] = class270.method1854(this.field767[var2], 32768);
            }
        }
        if (this.field777 != null) {
            for (int var3 = 0; var3 < this.field777.length; var3++) {
                this.field777[var3] = class270.method1854(this.field777[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!km", name = "e", descriptor = "(I)V", line = 111)
    public static final void method343(int arg0) {
        class244.field4149 = true;
        class197.field3336.field11 = 0;
        field758++;
        class307.field5277 = 0L;
        class74.field1187 = 0;
        class2.field19 = 0;
        class232.field4014 = 0;
        class218.field3760 = 0;
        class186.field2970 = 0;
        class158.field2552 = 0;
        class205.field3470 = 0;
        class103.field1701 = 0;
        class306.field5251 = 0;
        class143.field2291 = 0;
        class205.field3459 = 0;
        if (arg0 != 32054) {
            method350(-85, -108, 16);
        }
        class182.field2899 = 0;
        class114.field1913 = 0;
        class29.field381 = 0;
        class119.field1996 = 0;
        class55.field804 = 0;
        class101.field1666 = 0;
        class161.field2599 = 0;
        class37.field507 = 0;
        class97.field1593 = 0;
        class270.field4572 = 0;
        class92.field1516 = 0;
        class102.field1686 = 0;
        class194.field3269 = 0;
        class5.field55 = 0;
        class140.field2248 = 0;
        class240.field4089 = 0;
        class185.field2958 = 0;
        class69.field1056 = 0;
        class275.field4724 = 0;
        class205.field3452 = 0;
        class111.field1802 = 0;
        class37.field510 = 0;
        class247.field4198 = 0;
        class111.field1807 = 0;
        class228.field3964 = 0;
        class22.field240 = 0;
        class92.field1492 = 0;
        class287.field4902 = 0;
        class263.field4427 = 0;
        class270.field4585 = 0;
        class74.field1166 = 0;
        class264.field4450 = 0;
        class92.field1475 = 0;
        class199.field3357 = 0;
        class292.field4955 = 0;
        class245.field4179 = 0;
        class265.field4464 = 0;
        class164.field2658 = 0;
        class108.field1756 = 0;
        class16.field144 = 0;
        class62.field896 = 0;
        class294.field4995 = 0;
        class262.field4421 = 0;
        class134.field2180 = 0;
        class177.field2834 = 0;
        class74.field1149 = 0;
        class182.field2890 = 0;
        class205.field3481 = 0;
        class293.field4988 = 0;
        class186.field2968 = 0;
        class111.field1801 = 0;
        class177.field2837 = 0;
        class116.field1941 = 0;
        class170.field2771 = 0;
        class64.field979 = 0;
        class92.field1509 = 0;
        class94.field1543 = 0;
        class218.field3744 = 0;
        class234.field4031 = 0;
        class275.field4719 = 0;
        class195.field3291 = 0;
        class216.field3717 = 0;
        class209.field3541 = 0;
        class110.field1776 = 0;
        class37.field505 = 0;
        class258.field4347 = 0;
        class111.field1798 = 0;
        class140.field2247 = 0;
        class232.field4009 = 0;
        class74.field1178 = 0;
        class250.field4241 = 0;
        class74.field1134 = 0;
        class298.field5077 = 0;
        class265.field4458 = 0;
        class196.field3317 = 0;
        class200.field3379 = 0;
        field759 = 0;
        class96.field1565 = 0;
        class212.field3575 = 0;
        class131.field2131 = 0;
        class215.field3653 = 0;
        class191.field3140 = 0;
        class14.field116 = 0;
        class96.field1581 = 0;
        class284.field4861 = 0;
        class74.field1186 = 0;
        class249.field4230 = 0;
        class92.field1503 = 0;
        class112.field1858 = 0;
        class113.field1880 = 0;
        class308.field5289 = 0;
        class92.field1528 = 0;
        class2.field17 = 0;
        class245.field4173 = 0;
        class268.field4561 = 0;
        class135.field2197 = 0;
        class12.field101 = 0;
        class252.field4263 = 0;
        class283.field4819 = 0;
        class112.field1844 = 0;
        class140.field2252 = 0;
        class87.field1396 = 0;
        class37.field563 = 0;
        class20.field216 = 0;
        class294.field5024 = 0;
        class73.field1123 = 0;
        class284.field4855 = 0;
        class92.field1490 = 0;
        class74.field1138 = 0;
        class252.field4276 = 0;
        class274.field4644 = 0;
        class270.field4592 = 0;
        class62.field913 = 0;
        class92.field1501 = 0;
        class111.field1792 = 0;
        class256.field4328 = 0;
        class186.field2971 = 0;
        class75.field1221 = 0;
        class284.field4846 = 0;
        class62.field950 = 0;
        class153.field2434 = 0;
        class263.field4439 = 0;
        class74.field1171 = 0;
        class165.field2684 = 0;
        class207.field3517 = 0;
        class62.field924 = 0;
        class170.field2773 = 0;
        class304.field5230 = 0;
        class193.field3253 = 0;
        class146.field2316 = 0;
        class41.field623 = 0;
        class123.field2039 = 0;
        class187.field2987 = 0;
        class262.field4411 = 0;
        class26.field325 = 0;
        class92.field1519 = 0;
        class265.field4486 = 0;
        class114.field1908 = 0;
        class153.field2408 = 0;
        class222.field3834 = 0;
        class109.field1765 = 0;
        class159.field2556 = 0;
        class270.field4595 = 0;
        class241.field4120 = 0;
        class92.field1497 = 0;
        class91.field1438 = 0;
        class274.field4655 = 0;
        class56.field813 = 0;
        class186.field2978 = 0;
        class49.field712 = 0;
        class230.field3993 = 0;
        class135.field2203 = 0;
        class29.field401 = 0;
        class205.field3457 = 0;
        class222.field3859 = 0;
        class26.field298 = 0;
        class246.field4187 = 0;
        class219.field3771 = 0;
        class219.field3775 = 0;
        class80.field1334 = 0;
        class222.field3864 = 0;
        class170.field2759 = 0;
        class92.field1470 = 0;
        class136.field2213 = 0;
        class191.field3137 = 0;
        class240.field4093 = 0;
        class176.field2818 = 0;
        class151.field2389 = 0;
        class235.field4045 = 0;
        class135.field2194 = 0;
        class73.field1122 = 0;
        class77.field1282 = 0;
        class49.field702 = 0;
        class85.field1381 = 0;
        class111.field1793 = 0;
        class216.field3703 = 0;
        class196.field3321 = 0;
        class77.field1291 = 0;
        class306.field5247 = 0;
        class247.field4196 = 0;
        class270.field4593 = 0;
        class165.field2675 = 0;
        class123.field2036 = 0;
        class181.field2883 = 0;
        class204.field3438 = 0;
        class155.field2500 = 0;
        class19.field187 = 0;
        class30.field418 = 0;
        class248.field4220 = 0;
        class27.field345 = 0;
        class62.field949 = 0;
        class38.field593 = 0;
        class294.field5012 = 0;
        class43.field660 = 0;
        class205.field3462 = 0;
        class262.field4409 = 0;
        class49.field708 = 0;
        class264.field4447 = 0;
        class158.field2544 = 0;
        class251.field4256 = 0;
        class90.field1419 = 0;
        class215.field3655 = 0;
        class252.field4264 = 0;
        class288.field4915 = 0;
        class92.field1474 = 0;
        class171.field2784 = 0;
        class64.field964 = 0;
        class41.field627 = 0;
        class205.field3445 = 0;
        class162.field2625 = 0;
        class194.field3272 = 0;
        class262.field4420 = 0;
        class296.field5053 = 0;
        class195.field3302 = 0;
        class1.field3 = 0;
        class101.field1654 = 0;
        class26.field295 = 0;
        class113.field1887 = 0;
        class245.field4171 = 0;
        class222.field3818 = 0;
        class209.field3543 = 0;
        class62.field915 = 0;
        class155.field2492 = 0;
        class112.field1850 = 0;
        class252.field4284 = 0;
        class37.field543 = 0;
        class199.field3364 = 0;
        class246.field4189 = 0;
        class102.field1671 = 0;
        class309.field5298 = 0;
        class194.field3259 = 0;
        class52.field746 = 0;
        class187.field2991 = 0;
        class274.field4649 = 0;
        class205.field3475 = 0;
        class52.field747 = 0;
        class49.field707 = 0;
        class20.field212 = 0;
        class62.field898 = 0;
        class277.field4758 = 0;
        class122.field2032 = 0;
        class20.field198 = 0;
        class161.field2607 = 0;
        class108.field1747 = 0;
        class74.field1180 = 0;
        class263.field4438 = 0;
        class262.field4402 = 0;
        class60.field867 = 0;
        class42.field637 = 0;
        class108.field1744 = 0;
        class108.field1740 = 0;
        class45.field670 = 0;
        class62.field916 = 0;
        class286.field4895 = 0;
        class162.field2618 = 0;
        class90.field1416 = 0;
        class37.field571 = 0;
        class62.field885 = 0;
        class122.field2023 = 0;
        class85.field1387 = 0;
        class153.field2439 = 0;
        class121.field2018 = 0;
        class222.field3845 = 0;
        class182.field2893 = 0;
        class29.field379 = 0;
        class250.field4236 = 0;
        class304.field5231 = 0;
        class261.field4394 = 0;
        class218.field3766 = 0;
        class174.field2808 = 0;
        class17.field155 = 0;
        class106.field1729 = 0;
        class158.field2546 = 0;
        class241.field4115 = 0;
        class62.field928 = 0;
        class194.field3266 = 0;
        class77.field1289 = 0;
        class286.field4896 = 0;
        class26.field305 = 0;
        class284.field4849 = 0;
        class252.field4279 = 0;
        class205.field3482 = 0;
        class100.field1644 = 0;
        class92.field1464 = 0;
        class195.field3299 = 0;
        class198.field3349 = 0;
        class68.field1055 = 0;
        class74.field1192 = 0;
        class252.field4265 = 0;
        class251.field4261 = 0;
        class35.field452 = 0;
        class62.field919 = 0;
        class268.field4560 = 0;
        class2.field14 = 0;
        class309.field5294 = 0;
        class29.field368 = 0;
        class182.field2907 = 0;
        class107.field1736 = 0;
        class75.field1216 = 0;
        class307.field5282 = 0;
        class32.field441 = 0;
        class191.field3120 = 0;
        class75.field1212 = 0;
        class96.field1577 = 0;
        class201.field3391 = 0;
        class92.field1467 = 0;
        class275.field4690 = 0;
        class148.field2345 = 0;
        class174.field2802 = 0;
        class235.field4038 = 0;
        class98.field1605 = 0;
        class265.field4465 = 0;
        class209.field3545 = 0;
        class250.field4234 = 0;
        class250.field4233 = 0;
        class278.field4780 = 0;
        class118.field1980 = 0;
        class307.field5273 = 0;
        class262.field4414 = 0;
        class77.field1276 = 0;
        class287.field4909 = 0;
        class133.field2160 = 0;
        class283.field4826 = 0;
        class92.field1507 = 0;
        class263.field4426 = 0;
        class15.field128 = 0;
        class112.field1842 = 0;
        class129.field2110 = 0;
        class22.field237 = 0;
        class77.field1285 = 0;
        class198.field3342 = 0;
        class261.field4389 = 0;
        class30.field407 = 0;
        class192.field3219 = 0;
        class62.field922 = 0;
        class72.field1090 = 0;
        class57.field845 = 0;
        class31.field426 = 0;
        class230.field4002 = 0;
        class36.field486 = 0;
        class233.field4017 = 0;
        class241.field4110 = 0;
        class222.field3832 = 0;
        class135.field2204 = 0;
        class181.field2870 = 0;
        client.field5171 = 0;
        class73.field1126 = 0;
        class2.field16 = 0;
        class62.field944 = 0;
        class245.field4168 = 0;
        class250.field4240 = 0;
        class241.field4105 = 0;
        class153.field2450 = 0;
        class103.field1697 = 0;
        class258.field4346 = 0;
        class294.field5013 = 0;
        class52.field740 = 0;
        class240.field4096 = 0;
        class102.field1684 = 0;
        class113.field1884 = 0;
        class74.field1163 = 0;
        class123.field2041 = 0;
        class243.field4135 = 0;
        class108.field1750 = 0;
        class27.field352 = 0;
        class165.field2686 = 0;
        class77.field1296 = 0;
        class94.field1554 = 0;
        class135.field2208 = 0;
        class4.field41 = 0;
        class246.field4188 = 0;
        class122.field2027 = 0;
        class195.field3312 = 0;
        class187.field2985 = 0;
        class31.field428 = 0;
        class19.field185 = 0;
        class91.field1436 = 0;
        class112.field1836 = 0;
        class237.field4069 = 0;
        class267.field4526 = 0;
        class235.field4050 = 0;
        class227.field3955 = 0;
        class45.field681 = 0;
        class306.field5255 = 0;
        class216.field3726 = 0;
        class55.field806 = 0;
        class131.field2136 = 0;
        class74.field1154 = 0;
        class62.field930 = 0;
        class278.field4774 = 0;
        class209.field3537 = 0;
        class137.field2235 = 0;
        class234.field4032 = 0;
        class232.field4010 = 0;
        class174.field2806 = 0;
        class123.field2047 = 0;
        class26.field324 = 0;
        class62.field897 = 0;
        class207.field3526 = 0;
        class162.field2621 = 0;
        class31.field422 = 0;
        class92.field1496 = 0;
        class62.field911 = 0;
        client.field5163 = 0;
        class200.field3373 = 0;
        class149.field2351 = 0;
        class283.field4825 = 0;
        class109.field1764 = 0;
        class284.field4843 = 0;
        class166.field2701 = 0;
        class307.field5276 = 0;
        class195.field3301 = 0;
        class143.field2290 = 0;
        class208.field3532 = 0;
        class294.field5019 = 0;
        class191.field3061 = 0;
        class29.field363 = 0;
        class12.field99 = 0;
        class197.field3331 = 0;
        class252.field4268 = 0;
        class192.field3222 = 0;
        class96.field1583 = 0;
        class171.field2781 = 0;
        class290.field4928 = 0;
        class96.field1575 = 0;
        class74.field1131 = 0;
        class208.field3533 = 0;
        class4.field32 = 0;
        class218.field3741 = 0;
        class30.field405 = 0;
        class216.field3702 = 0;
        class283.field4842 = 0;
        class250.field4242 = 0;
        class92.field1486 = 0;
        class17.field151 = 0;
        class2.field20 = 0;
        class189.field3008 = 0;
        class49.field704 = 0;
        class267.field4507 = 0;
        class245.field4177 = 0;
        class110.field1771 = 0;
        class227.field3951 = 0;
        class250.field4238 = 0;
        class238.field4077 = 0;
        class199.field3369 = 0;
        class29.field361 = 0;
        class148.field2343 = 0;
        class37.field558 = 0;
        class186.field2976 = 0;
        class183.field2921 = 0;
        class163.field2640 = 0;
        class247.field4203 = 0;
        class7.field82 = 0;
        class107.field1734 = 0;
        class30.field406 = 0;
        class50.field727 = 0;
        class26.field290 = 0;
        class182.field2894 = 0;
        class244.field4147 = 0;
        class205.field3468 = 0;
        class181.field2865 = 0;
        class70.field1075 = 0;
        class49.field703 = 0;
        class153.field2442 = 0;
        class111.field1796 = 0;
        class183.field2919 = 0;
        class112.field1837 = 0;
        class38.field581 = 0;
        class195.field3308 = 0;
        class309.field5301 = 0;
        class243.field4137 = 0;
        class37.field562 = 0;
        class261.field4395 = 0;
        class218.field3749 = 0;
        class125.field2087 = 0;
        class256.field4333 = 0;
        class194.field3275 = 0;
        class205.field3449 = 0;
        class284.field4858 = 0;
        class229.field3985 = 0;
        class226.field3926 = 0;
        class165.field2700 = 0;
        class134.field2191 = 0;
        class45.field672 = 0;
        class90.field1426 = 0;
        class96.field1588 = 0;
        class216.field3705 = 0;
        class225.field3918 = 0;
        class254.field4312 = 0;
        class155.field2502 = 0;
        class54.field783 = 0;
        class74.field1128 = 0;
        class74.field1169 = 0;
        class191.field3143 = 0;
        class209.field3546 = 0;
        class190.field3021 = 0;
        class235.field4040 = 0;
        class62.field904 = 0;
        class252.field4283 = 0;
        client.field5168 = 0;
        class205.field3456 = 0;
        class199.field3359 = 0;
        class271.field4598 = 0;
        class91.field1454 = 0;
        class100.field1648 = 0;
        class268.field4546 = 0;
        class275.field4656 = 0;
        class193.field3244 = 0;
        class270.field4574 = 0;
        class96.field1584 = 0;
        class92.field1510 = 0;
        class92.field1478 = 0;
        class56.field817 = 0;
        class301.field5175 = 0;
        class201.field3405 = 0;
        class234.field4030 = 0;
        class266.field4491 = 0;
        class24.field272 = 0;
        class294.field4999 = 0;
        class26.field286 = 0;
        class247.field4201 = 0;
        class92.field1526 = 0;
        class62.field887 = 0;
        class169.field2740 = 0;
        class57.field840 = 0;
        class115.field1932 = 0;
        class39.field610 = 0;
        class293.field4986 = 0;
        client.field5169 = 0;
        class36.field492 = 0;
        class74.field1194 = 0;
        class72.field1099 = 0;
        class218.field3745 = 0;
        class20.field194 = 0;
        class191.field3057 = 0;
        class141.field2267 = 0;
        class212.field3573 = 0;
        class108.field1753 = 0;
        class75.field1210 = 0;
        class135.field2198 = 0;
        class39.field600 = 0;
        class228.field3968 = 0;
        class16.field148 = 0;
        class29.field393 = 0;
        class73.field1120 = 0;
        class246.field4192 = 0;
        class7.field79 = 0;
        class203.field3428 = 0;
        class198.field3346 = 0;
        class80.field1331 = 0;
        class29.field384 = 0;
        class173.field2800 = 0;
        class96.field1590 = 0;
        class166.field2704 = 0;
        class151.field2375 = 0;
        class52.field745 = 0;
        class62.field894 = 0;
        class134.field2178 = 0;
        class1.field7 = 0;
        class74.field1145 = 0;
        class164.field2662 = 0;
        class35.field455 = 0;
        class129.field2125 = 0;
        class94.field1552 = 0;
        class29.field364 = 0;
        class26.field285 = 0;
        class24.field267 = 0;
        class218.field3740 = 0;
        class92.field1512 = 0;
        class120.field2003 = 0;
        class284.field4848 = 0;
        class241.field4106 = 0;
        class74.field1196 = 0;
        class77.field1278 = 0;
        class301.field5184 = 0;
        class112.field1831 = 0;
        class102.field1674 = 0;
        class206.field3501 = 0;
        class243.field4133 = 0;
        class227.field3948 = 0;
        class81.field1352 = 0;
        class140.field2244 = 0;
        class265.field4459 = 0;
        class116.field1939 = 0;
        class14.field113 = 0;
        class146.field2308 = 0;
        class200.field3387 = 0;
        class230.field3999 = 0;
        class74.field1144 = 0;
        class81.field1359 = 0;
        class41.field621 = 0;
        class206.field3504 = 0;
        class52.field743 = 0;
        class116.field1936 = 0;
        class275.field4673 = 0;
        class296.field5050 = 0;
        class220.field3787 = 0;
        class43.field650 = 0;
        class177.field2825 = 0;
        class207.field3513 = 0;
        class256.field4326 = 0;
        class189.field3004 = 0;
        class73.field1117 = 0;
        class78.field1309 = 0;
        class102.field1681 = 0;
        class270.field4577 = 0;
        class218.field3763 = 0;
        class300.field5144 = 0;
        class275.field4665 = 0;
        class170.field2768 = 0;
        class91.field1448 = 0;
        class12.field102 = 0;
        class246.field4191 = 0;
        class233.field4023 = 0;
        class297.field5072 = 0;
        class29.field373 = 0;
        class101.field1664 = 0;
        class134.field2182 = 0;
        class190.field3024 = 0;
        class301.field5176 = 0;
        class17.field154 = 0;
        class111.field1808 = 0;
        class186.field2969 = 0;
        class31.field421 = 0;
        class148.field2326 = 0;
        class216.field3700 = 0;
        class170.field2760 = 0;
        class159.field2567 = 0;
        class181.field2884 = 0;
        class96.field1592 = 0;
        class265.field4480 = 0;
        class261.field4386 = 0;
        class35.field458 = 0;
        class308.field5286 = 0;
        class102.field1680 = 0;
        class177.field2827 = 0;
        class269.field4569 = 0;
        class108.field1745 = 0;
        class111.field1799 = 0;
        class27.field329 = 0;
        class278.field4775 = 0;
        class74.field1143 = 0;
        class192.field3215 = 0;
        class26.field300 = 0;
        class109.field1762 = 0;
        class229.field3978 = 0;
        class262.field4419 = 0;
        class238.field4072 = 0;
        class55.field811 = 0;
        class184.field2938 = 0;
        class60.field871 = 0;
        class205.field3464 = 0;
        class241.field4108 = 0;
        class262.field4406 = 0;
        class216.field3734 = 0;
        class182.field2901 = 0;
        class258.field4356 = 0;
        class92.field1482 = 0;
        class244.field4159 = 0;
        class176.field2816 = 0;
        class62.field920 = 0;
        class62.field926 = 0;
        class236.field4055 = 0;
        class215.field3641 = 0;
        class193.field3241 = 0;
        class94.field1548 = 0;
        class258.field4359 = 0;
        class127.field2099 = 0;
        class216.field3698 = 0;
        class298.field5092 = 0;
        class74.field1183 = 0;
        class229.field3976 = 0;
        class46.field694 = 0;
        class183.field2918 = 0;
        class38.field592 = 0;
        class186.field2977 = 0;
        class96.field1564 = 0;
        client.field5160 = 0;
        class112.field1848 = 0;
        class62.field948 = 0;
        class163.field2635 = 0;
        class98.field1616 = 0;
        class216.field3712 = 0;
        class62.field895 = 0;
        class111.field1794 = 0;
        class272.field4624 = 0;
        class236.field4056 = 0;
        class218.field3755 = 0;
        class7.field78 = 0;
        class208.field3534 = 0;
        class300.field5145 = 0;
        class206.field3486 = 0;
        class272.field4631 = 0;
        class221.field3801 = 0;
        client.field5170 = 0;
        class228.field3965 = 0;
        class195.field3296 = 0;
        class92.field1522 = 0;
        class283.field4833 = 0;
        class7.field74 = 0;
        class182.field2910 = 0;
        class29.field366 = 0;
        class62.field901 = 0;
        class45.field675 = 0;
        class233.field4027 = 0;
        class201.field3399 = 0;
        class38.field589 = 0;
        class92.field1505 = 0;
        class205.field3472 = 0;
        class27.field339 = 0;
        class63.field959 = 0;
        class80.field1336 = 0;
        class140.field2251 = 0;
        class169.field2751 = 0;
        class235.field4047 = 0;
        class75.field1209 = 0;
        class261.field4387 = 0;
        class118.field1970 = 0;
        class201.field3398 = 0;
        class182.field2902 = 0;
        class218.field3750 = 0;
        class35.field453 = 0;
        class270.field4587 = 0;
        class191.field3130 = 0;
        class29.field377 = 0;
        class158.field2542 = 0;
        class269.field4566 = 0;
        class191.field3093 = 0;
        class297.field5067 = 0;
        class218.field3764 = 0;
        class236.field4054 = 0;
        class26.field293 = 0;
        class252.field4274 = 0;
        class62.field933 = 0;
        class206.field3493 = 0;
        class120.field2007 = 0;
        class39.field601 = 0;
        class192.field3225 = 0;
        class205.field3474 = 0;
        class198.field3344 = 0;
        class118.field1962 = 0;
        class77.field1290 = 0;
        class151.field2377 = 0;
        class182.field2896 = 0;
        class177.field2830 = 0;
        class55.field803 = 0;
        class60.field870 = 0;
        class293.field4987 = 0;
        class195.field3311 = 0;
        class240.field4086 = 0;
        class26.field306 = 0;
        class36.field487 = 0;
        class32.field439 = 0;
        class22.field232 = 0;
        class45.field671 = 0;
        class243.field4130 = 0;
        client.field5166 = 0;
        class36.field494 = 0;
        class181.field2871 = 0;
        class92.field1471 = 0;
        class112.field1833 = 0;
        class159.field2563 = 0;
        class186.field2980 = 0;
        class92.field1530 = 0;
        client.field5157 = 0;
        class306.field5245 = 0;
        class146.field2310 = 0;
        class156.field2517 = 0;
        class162.field2617 = 0;
        class205.field3446 = 0;
        class294.field5001 = 0;
        class120.field2008 = 0;
        class181.field2873 = 0;
        class114.field1909 = 0;
        class199.field3363 = 0;
        class292.field4975 = 0;
        class115.field1925 = 0;
        class278.field4762 = 0;
        class177.field2831 = 0;
        class140.field2245 = 0;
        class192.field3221 = 0;
        class165.field2697 = 0;
        class289.field4924 = 0;
        class109.field1758 = 0;
        class205.field3443 = 0;
        class26.field323 = 0;
        class108.field1746 = 0;
        class144.field2298 = 0;
        class155.field2499 = 0;
        class92.field1524 = 0;
        class163.field2642 = 0;
        class109.field1768 = 0;
        class275.field4701 = 0;
        class38.field577 = 0;
        class15.field119 = 0;
        class262.field4405 = 0;
        class134.field2183 = 0;
        class17.field168 = 0;
        class29.field380 = 0;
        class92.field1465 = 0;
        class31.field420 = 0;
        class191.field3065 = 0;
        class37.field529 = 0;
        class308.field5292 = 0;
        class216.field3672 = 0;
        class301.field5174 = 0;
        class62.field938 = 0;
        class250.field4237 = 0;
        class186.field2965 = 0;
        class92.field1472 = 0;
        class226.field3936 = 0;
        class170.field2762 = 0;
        class191.field3168 = 0;
        class101.field1668 = 0;
        class37.field565 = 0;
        class74.field1132 = 0;
        class192.field3230 = 0;
        class254.field4314 = 0;
        class189.field3013 = 0;
        class249.field4229 = 0;
        class234.field4037 = 0;
        class276.field4734 = 0;
        class110.field1783 = 0;
        field773 = 0;
        class92.field1494 = 0;
        class62.field888 = 0;
        class282.field4812 = 0;
        class108.field1751 = 0;
        class123.field2034 = 0;
        class96.field1587 = 0;
        class165.field2685 = 0;
        class31.field424 = 0;
        class99.field1627 = 0;
        class195.field3309 = 0;
        class94.field1550 = 0;
        class146.field2319 = 0;
        class265.field4477 = 0;
        class119.field1997 = 0;
        class201.field3396 = 0;
        class191.field3146 = 0;
        class199.field3360 = 0;
        class63.field957 = 0;
        class122.field2028 = 0;
        class30.field413 = 0;
        class116.field1940 = 0;
        class301.field5177 = 0;
        class184.field2949 = 0;
        class259.field4365 = 0;
        class218.field3748 = 0;
        class62.field945 = 0;
        class301.field5178 = 0;
        class78.field1316 = 0;
        class5.field54 = 0;
        class81.field1347 = 0;
        class26.field308 = 0;
        class52.field754 = 0;
        class36.field490 = 0;
        class278.field4770 = 0;
        class156.field2516 = 0;
        class36.field481 = 0;
        class50.field721 = 0;
        class218.field3739 = 0;
        class294.field5000 = 0;
        class275.field4666 = 0;
        class232.field4007 = 0;
        class63.field956 = 0;
        class153.field2435 = 0;
        class108.field1738 = 0;
        class62.field941 = 0;
        class42.field635 = 0;
        class20.field203 = 0;
        class106.field1726 = 0;
        class151.field2387 = 0;
        class252.field4272 = 0;
        class237.field4067 = 0;
        class74.field1155 = 0;
        class181.field2878 = 0;
        class205.field3444 = 0;
        class78.field1301 = 0;
        class52.field748 = 0;
        class263.field4436 = 0;
        class129.field2112 = 0;
        client.field5159 = 0;
        class140.field2254 = 0;
        class37.field532 = 0;
        class111.field1800 = 0;
        class200.field3372 = 0;
        class69.field1060 = 0;
        class241.field4118 = 0;
        class275.field4693 = 0;
        class300.field5146 = 0;
        class221.field3789 = 0;
        class29.field369 = 0;
        class110.field1782 = 0;
        class212.field3555 = 0;
        class74.field1167 = 0;
        class26.field297 = 0;
        class143.field2278 = 0;
        class64.field978 = 0;
        class54.field792 = 0;
        class215.field3643 = 0;
        class241.field4102 = 0;
        class215.field3656 = 0;
        class258.field4357 = 0;
        class229.field3975 = 0;
        class137.field2231 = 0;
        class105.field1719 = 0;
        class229.field3981 = 0;
        class238.field4071 = 0;
        class36.field484 = 0;
        class19.field182 = 0;
        class192.field3218 = 0;
        class150.field2360 = 0;
        class5.field52 = 0;
        class110.field1780 = 0;
        class191.field3101 = 0;
        class62.field908 = 0;
        class99.field1639 = 0;
        class153.field2452 = 0;
        class221.field3796 = 0;
        client.field5161 = 0;
        class222.field3853 = 0;
        class222.field3873 = 0;
        class123.field2044 = 0;
        class240.field4085 = 0;
        class1.field6 = 0;
        class30.field410 = 0;
        class70.field1074 = 0;
        class294.field4998 = 0;
        class135.field2195 = 0;
        class54.field798 = 0;
        class184.field2937 = 0;
        class17.field167 = 0;
        class92.field1515 = 0;
        class170.field2761 = 0;
        class237.field4068 = 0;
        class71.field1080 = 0;
        class62.field946 = 0;
        class17.field165 = 0;
        class92.field1462 = 0;
        class129.field2122 = 0;
        class189.field3007 = 0;
        class291.field4943 = 0;
        class287.field4906 = 0;
        class271.field4605 = 0;
        class96.field1580 = 0;
        class251.field4252 = 0;
        class62.field902 = 0;
        class181.field2881 = 0;
        class26.field283 = 0;
        class200.field3374 = 0;
        class131.field2135 = 0;
        class100.field1651 = 0;
        class26.field299 = 0;
        class292.field4952 = 0;
        class262.field4401 = 0;
        class74.field1162 = 0;
        class275.field4721 = 0;
        class15.field126 = 0;
        class196.field3322 = 0;
        class226.field3943 = 0;
        class150.field2372 = 0;
        class184.field2943 = 0;
        class26.field312 = 0;
        class194.field3276 = 0;
        class56.field814 = 0;
        class92.field1469 = 0;
        class29.field389 = 0;
        class120.field2009 = 0;
        class37.field531 = 0;
        class92.field1477 = 0;
        class81.field1362 = 0;
        class17.field171 = 0;
        class150.field2371 = 0;
        class124.field2050 = 0;
        class252.field4271 = 0;
        class74.field1151 = 0;
        class119.field1991 = 0;
        class26.field291 = 0;
        field760 = 0;
        class56.field823 = 0;
        class281.field4809 = 0;
        class116.field1944 = 0;
        class74.field1168 = 0;
        class296.field5056 = 0;
        class181.field2882 = 0;
        class85.field1385 = 0;
        class222.field3823 = 0;
        class109.field1759 = 0;
        class152.field2402 = 0;
        class73.field1121 = 0;
        class42.field639 = 0;
        class136.field2214 = 0;
        class229.field3972 = 0;
        field769 = 0;
        class192.field3226 = 0;
        class99.field1634 = 0;
        class252.field4280 = 0;
        class97.field1599 = 0;
        class80.field1333 = 0;
        class37.field551 = 0;
        class309.field5299 = 0;
        class17.field158 = 0;
        class182.field2886 = 0;
        class7.field80 = 0;
        class92.field1498 = 0;
        class169.field2741 = 0;
        class26.field313 = 0;
        class244.field4152 = 0;
        class247.field4199 = 0;
        class43.field653 = 0;
        class287.field4903 = 0;
        class165.field2683 = 0;
        class62.field900 = 0;
        class309.field5300 = 0;
        class245.field4172 = 0;
        class284.field4851 = 0;
        class102.field1672 = 0;
        class2.field22 = 0;
        class284.field4845 = 0;
        class162.field2622 = 0;
        class96.field1556 = 0;
        class207.field3522 = 0;
        class143.field2294 = 0;
        class115.field1930 = 0;
        class143.field2282 = 0;
        class17.field161 = 0;
        class92.field1517 = 0;
        class184.field2939 = 0;
        class135.field2200 = 0;
        class153.field2427 = 0;
        class41.field630 = 0;
        class56.field819 = 0;
        class62.field882 = 0;
        class4.field35 = 0;
        class254.field4310 = 0;
        class103.field1693 = 0;
        class212.field3565 = 0;
        class26.field322 = 0;
        class252.field4266 = 0;
        class49.field700 = 0;
        class146.field2313 = 0;
        class250.field4235 = 0;
        class78.field1314 = 0;
        class294.field4997 = 0;
        class111.field1811 = 0;
        class176.field2815 = 0;
        class105.field1723 = 0;
        client.field5156 = 0;
        class56.field831 = 0;
        class112.field1849 = 0;
        class115.field1924 = 0;
        class72.field1100 = 0;
        class15.field131 = 0;
        class270.field4596 = 0;
        class38.field583 = 0;
        class232.field4012 = 0;
        class248.field4213 = 0;
        class4.field40 = 0;
        class133.field2170 = 0;
        class92.field1523 = 0;
        class46.field685 = 0;
        class246.field4181 = 0;
        class62.field886 = 0;
        class164.field2654 = 0;
        class8.field88 = 0;
        class256.field4324 = 0;
        class294.field5005 = 0;
        class114.field1903 = 0;
        class96.field1566 = 0;
        class181.field2872 = 0;
        class99.field1640 = 0;
        class4.field34 = 0;
        client.field5165 = 0;
        class204.field3441 = 0;
        class254.field4317 = 0;
        class227.field3949 = 0;
        class52.field741 = 0;
        class36.field489 = 0;
        class50.field725 = 0;
        class276.field4750 = 0;
        class56.field832 = 0;
        class262.field4412 = 0;
        class261.field4384 = 0;
        class101.field1655 = 0;
        class101.field1660 = 0;
        class236.field4053 = 0;
        class111.field1795 = 0;
        class193.field3247 = 0;
        class194.field3256 = 0;
        class218.field3754 = 0;
        class81.field1349 = 0;
        class74.field1188 = 0;
        class26.field287 = 0;
        class153.field2424 = 0;
        class267.field4523 = 0;
        class114.field1899 = 0;
        class204.field3434 = 0;
        class113.field1873 = 0;
        class31.field419 = 0;
        class92.field1491 = 0;
        class174.field2801 = 0;
        class165.field2690 = 0;
        class193.field3254 = 0;
        class205.field3447 = 0;
        class12.field110 = 0;
        class2.field18 = 0;
        class216.field3714 = 0;
        class244.field4139 = 0;
        class49.field713 = 0;
        class96.field1569 = 0;
        class91.field1439 = 0;
        class205.field3460 = 0;
        class57.field838 = 0;
        class229.field3973 = 0;
        class74.field1130 = 0;
        class214.field3636 = 0;
        class205.field3467 = 0;
        class100.field1646 = 0;
        class263.field4435 = 0;
        class92.field1529 = 0;
        class260.field4371 = 0;
        class229.field3971 = 0;
        field764 = 0;
        class270.field4583 = 0;
        class62.field937 = 0;
        class49.field711 = 0;
        class268.field4550 = 0;
        class260.field4379 = 0;
        class35.field459 = 0;
        class17.field163 = 0;
        class92.field1483 = 0;
        class92.field1527 = 0;
        class258.field4343 = 0;
        class108.field1743 = 0;
        class262.field4417 = 0;
        class49.field706 = 0;
        class216.field3681 = 0;
        class283.field4822 = 0;
        class62.field921 = 0;
        class205.field3458 = 0;
        class275.field4706 = 0;
        client.field5164 = 0;
        class298.field5085 = 0;
        class124.field2058 = 0;
        class194.field3273 = 0;
        class99.field1641 = 0;
        class184.field2945 = 0;
        class136.field2212 = 0;
        class99.field1631 = 0;
        class265.field4461 = 0;
        class245.field4178 = 0;
        class20.field196 = 0;
        class155.field2505 = 0;
        class92.field1521 = 0;
        class111.field1805 = 0;
        class284.field4856 = 0;
        class276.field4735 = 0;
        class123.field2040 = 0;
        class29.field374 = 0;
        class170.field2764 = 0;
        class74.field1185 = 0;
        class4.field37 = 0;
        class252.field4278 = 0;
        class275.field4668 = 0;
        class148.field2334 = 0;
        class249.field4228 = 0;
        class205.field3448 = 0;
        class112.field1840 = 0;
        class153.field2437 = 0;
        class207.field3507 = 0;
        field762 = 0;
        class218.field3752 = 0;
        class229.field3979 = 0;
        class265.field4463 = 0;
        class92.field1463 = 0;
        class96.field1559 = 0;
        class62.field923 = 0;
        class297.field5070 = 0;
        class38.field590 = 0;
        class183.field2920 = 0;
        class216.field3719 = 0;
        class39.field605 = 0;
        class205.field3478 = 0;
        class270.field4584 = 0;
        class284.field4854 = 0;
        class74.field1135 = 0;
        class20.field199 = 0;
        class77.field1280 = 0;
        class165.field2682 = 0;
        class272.field4632 = 0;
        class248.field4225 = 0;
        class300.field5141 = 0;
        class258.field4355 = 0;
        class184.field2948 = 0;
        class62.field929 = 0;
        class200.field3380 = 0;
        class113.field1869 = 0;
        class292.field4970 = 0;
        class26.field317 = 0;
        class267.field4503 = 0;
        class297.field5076 = 0;
        class41.field625 = 0;
        class252.field4281 = 0;
        class107.field1730 = 0;
        client.field5158 = 0;
        class21.field223 = 0;
        class221.field3797 = 0;
        class300.field5143 = 0;
        class298.field5078 = 0;
        class55.field812 = 0;
        class206.field3497 = 0;
        class155.field2496 = 0;
        class103.field1694 = 0;
        class137.field2226 = 0;
        class278.field4763 = 0;
        class96.field1585 = 0;
        class240.field4101 = 0;
        class236.field4057 = 0;
        class140.field2250 = 0;
        class125.field2066 = 0;
        class77.field1273 = 0;
        class37.field550 = 0;
        class62.field932 = 0;
        class158.field2555 = 0;
        class116.field1943 = 0;
        class153.field2415 = 0;
        class77.field1284 = 0;
        class62.field943 = 0;
        class284.field4850 = 0;
        class241.field4109 = 0;
        class118.field1979 = 0;
        class220.field3785 = 0;
        class230.field3998 = 0;
        class254.field4311 = 0;
        class137.field2232 = 0;
        class203.field3432 = 0;
        class125.field2088 = 0;
        class170.field2767 = 0;
        class233.field4024 = 0;
        class91.field1431 = 0;
        class186.field2973 = 0;
        class49.field716 = 0;
        class72.field1096 = 0;
        class205.field3442 = 0;
        class92.field1473 = 0;
        class247.field4204 = 0;
        class309.field5297 = 0;
        class236.field4052 = 0;
        class283.field4829 = 0;
        class170.field2774 = 0;
        class205.field3451 = 0;
        class233.field4018 = 0;
        class201.field3413 = 0;
        class112.field1854 = 0;
        class7.field73 = 0;
        class233.field4026 = 0;
        class195.field3300 = 0;
        class226.field3932 = 0;
        class57.field833 = 0;
        class158.field2551 = 0;
        class74.field1164 = 0;
        class92.field1461 = 0;
        class30.field409 = 0;
        class248.field4224 = 0;
        class62.field918 = 0;
        class16.field146 = 0;
        class62.field892 = 0;
        class256.field4330 = 0;
        class39.field602 = 0;
        class304.field5225 = 0;
        class29.field375 = 0;
        class120.field2014 = 0;
        class62.field883 = 0;
        class2.field15 = 0;
        class300.field5152 = 0;
        class62.field907 = 0;
        class197.field3333 = 0;
        field778 = 0;
        class20.field197 = 0;
        class92.field1493 = 0;
        class36.field482 = 0;
        class169.field2750 = 0;
        class263.field4425 = 0;
        class218.field3762 = 0;
        class125.field2067 = 0;
        class271.field4619 = 0;
        class298.field5083 = 0;
        class56.field821 = 0;
        class291.field4949 = 0;
        class110.field1772 = 0;
        client.field5172 = 0;
        class269.field4564 = 0;
        class27.field347 = 0;
        class7.field81 = 0;
        class163.field2634 = 0;
        class152.field2400 = 0;
        class288.field4911 = 0;
        class26.field282 = 0;
        class164.field2655 = 0;
        class57.field841 = 0;
        class212.field3571 = 0;
        class244.field4143 = 0;
        class1.field1 = 0;
        class181.field2875 = 0;
        class74.field1198 = 0;
        class26.field316 = 0;
        class101.field1653 = 0;
        class73.field1116 = 0;
        class307.field5281 = 0;
        class216.field3735 = 0;
        class229.field3974 = 0;
        class286.field4889 = 0;
        class91.field1451 = 0;
        class98.field1610 = 0;
        class181.field2874 = 0;
        class263.field4440 = 0;
        class17.field157 = 0;
        class261.field4393 = 0;
        class219.field3772 = 0;
        class94.field1553 = 0;
        class294.field5017 = 0;
        class153.field2418 = 0;
        class74.field1159 = 0;
        class201.field3406 = 0;
        class97.field1598 = 0;
        class135.field2201 = 0;
        class26.field318 = 0;
        class196.field3323 = 0;
        class137.field2217 = 0;
        class287.field4899 = 0;
        class199.field3352 = 0;
        class277.field4759 = 0;
        class81.field1355 = 0;
        class74.field1165 = 0;
        class4.field38 = 0;
        class247.field4200 = 0;
        class99.field1637 = 0;
        class92.field1518 = 0;
        class278.field4765 = 0;
        class271.field4606 = 0;
        class198.field3343 = 0;
        class120.field2001 = 0;
        class118.field1976 = 0;
        class149.field2352 = 0;
        class260.field4380 = 0;
        class140.field2249 = 0;
        class191.field3178 = 0;
        class115.field1926 = 0;
        class62.field891 = 0;
        class20.field213 = 0;
        class203.field3421 = 0;
        class207.field3524 = 0;
        class235.field4041 = 0;
        class87.field1393 = 0;
        class92.field1480 = 0;
        class161.field2602 = 0;
        class135.field2206 = 0;
        class194.field3263 = 0;
        class196.field3318 = 0;
        class155.field2495 = 0;
        class62.field917 = 0;
        class265.field4482 = 0;
        class74.field1137 = 0;
        class20.field191 = 0;
        class199.field3365 = 0;
        class96.field1578 = 0;
        class74.field1173 = 0;
        class92.field1500 = 0;
        class232.field4006 = 0;
        class271.field4604 = 0;
        class185.field2963 = 0;
        class185.field2961 = 0;
        class205.field3454 = 0;
        class131.field2133 = 0;
        class62.field905 = 0;
        class229.field3987 = 0;
        class77.field1281 = 0;
        class207.field3510 = 0;
        class118.field1969 = 0;
        class270.field4580 = 0;
        class109.field1767 = 0;
        class184.field2951 = 0;
        class131.field2134 = 0;
        class62.field914 = 0;
        class153.field2429 = 0;
        class30.field415 = 0;
        class22.field234 = 0;
        class50.field726 = 0;
        class37.field536 = 0;
        class15.field129 = 0;
        class259.field4360 = 0;
        class181.field2867 = 0;
        class238.field4078 = 0;
        class105.field1721 = 0;
        class190.field3026 = 0;
        class92.field1481 = 0;
        class81.field1350 = 0;
        class216.field3679 = 0;
        class263.field4434 = 0;
        class227.field3950 = 0;
        class125.field2077 = 0;
        class101.field1661 = 0;
        class189.field3002 = 0;
        class218.field3746 = 0;
        class205.field3471 = 0;
        class55.field810 = 0;
        class288.field4912 = 0;
        class5.field53 = 0;
        class29.field392 = 0;
        class192.field3229 = 0;
        class228.field3969 = 0;
        class75.field1217 = 0;
        class26.field292 = 0;
        class74.field1161 = 0;
        class278.field4778 = 0;
        class256.field4322 = 0;
        class125.field2070 = 0;
        class74.field1127 = 0;
        class29.field388 = 0;
        class116.field1935 = 0;
        class113.field1885 = 0;
        class71.field1081 = 0;
        class205.field3476 = 0;
        class298.field5082 = 0;
        class262.field4418 = 0;
        class284.field4844 = 0;
        class236.field4059 = 0;
        class92.field1502 = 0;
        class103.field1699 = 0;
        class277.field4756 = 0;
        class112.field1838 = 0;
        class98.field1613 = 0;
        class114.field1907 = 0;
        class151.field2392 = 0;
        class112.field1835 = 0;
        class252.field4286 = 0;
        class225.field3925 = 0;
        class158.field2538 = 0;
        class125.field2085 = 0;
        class189.field3011 = 0;
        class205.field3465 = 0;
        class74.field1195 = 0;
        class134.field2177 = 0;
        class133.field2155 = 0;
        class268.field4562 = 0;
        class258.field4352 = 0;
        class205.field3450 = 0;
        class92.field1525 = 0;
        class194.field3265 = 0;
        class143.field2293 = 0;
        class163.field2636 = 0;
        class116.field1934 = 0;
        class96.field1574 = 0;
        class236.field4058 = 0;
        class92.field1485 = 0;
        class251.field4254 = 0;
        class191.field3197 = 0;
        class263.field4430 = 0;
        class62.field910 = 0;
        class20.field207 = 0;
        class91.field1430 = 0;
        class263.field4428 = 0;
        class184.field2944 = 0;
        class165.field2694 = 0;
        class307.field5275 = 0;
        class156.field2507 = 0;
        class287.field4907 = 0;
        class105.field1718 = 0;
        class125.field2086 = 0;
        class52.field750 = 0;
        class195.field3310 = 0;
        class205.field3469 = 0;
        class92.field1506 = 0;
        class165.field2693 = 0;
        class92.field1479 = 0;
        class52.field738 = 0;
        class94.field1546 = 0;
        class244.field4156 = 0;
        class181.field2864 = 0;
        class189.field3006 = 0;
        class99.field1624 = 0;
        class73.field1118 = 0;
        class62.field940 = 0;
        class112.field1829 = 0;
        class226.field3937 = 0;
        class124.field2052 = 0;
        class37.field568 = 0;
        class192.field3220 = 0;
        class62.field939 = 0;
        class265.field4457 = 0;
        class49.field714 = 0;
        class26.field307 = 0;
        class92.field1514 = 0;
        class91.field1455 = 0;
        class37.field537 = 0;
        class135.field2192 = 0;
        class98.field1619 = 0;
        class189.field3001 = 0;
        class215.field3657 = 0;
        class62.field925 = 0;
        class118.field1963 = 0;
        class133.field2157 = 0;
        class298.field5094 = 0;
        class137.field2219 = 0;
        class266.field4492 = 0;
        class276.field4739 = 0;
        class66.field994 = 0;
        class29.field378 = 0;
        class281.field4797 = 0;
        class49.field698 = 0;
        class205.field3466 = 0;
        class92.field1488 = 0;
        class267.field4500 = 0;
        class308.field5288 = 0;
        class294.field5006 = 0;
        class57.field836 = 0;
        class57.field843 = 0;
        class194.field3284 = 0;
        class258.field4342 = 0;
        class26.field319 = 0;
        class52.field744 = 0;
        class206.field3500 = 0;
        class215.field3642 = 0;
        class296.field5055 = 0;
        class244.field4161 = 0;
        class156.field2524 = 0;
        class199.field3356 = 0;
        class92.field1466 = 0;
        field772 = 0;
        class143.field2295 = 0;
        class20.field200 = 0;
        class137.field2223 = 0;
        class129.field2123 = 0;
        class218.field3767 = 0;
        class90.field1417 = 0;
        class289.field4919 = 0;
        class271.field4620 = 0;
        class151.field2390 = 0;
        class92.field1487 = 0;
        class289.field4917 = 0;
        class296.field5058 = 0;
        class62.field947 = 0;
        class72.field1093 = 0;
        class304.field5227 = 0;
        class216.field3690 = 0;
        class78.field1302 = 0;
        class221.field3792 = 0;
        class258.field4353 = 0;
        class69.field1063 = 0;
        class306.field5250 = 0;
        class20.field188 = 0;
        class35.field460 = 0;
        class189.field3009 = 0;
        class201.field3409 = 0;
        class203.field3424 = 0;
        class119.field1992 = 0;
        class22.field233 = 0;
        class64.field965 = 0;
        class16.field135 = 0;
        class195.field3303 = 0;
        class92.field1489 = 0;
        class36.field475 = 0;
        class251.field4248 = 0;
        class283.field4837 = 0;
        class74.field1153 = 0;
        class281.field4803 = 0;
        class226.field3927 = 0;
        class244.field4144 = 0;
        class281.field4802 = 0;
        class151.field2394 = 0;
        class298.field5089 = 0;
        class105.field1714 = 0;
        class91.field1437 = 0;
        class158.field2534 = 0;
        class165.field2676 = 0;
        class187.field2981 = 0;
        class75.field1208 = 0;
        class252.field4267 = 0;
        class56.field826 = 0;
        class185.field2957 = 0;
        class205.field3479 = 0;
        class46.field689 = 0;
        class26.field284 = 0;
        class37.field570 = 0;
        class262.field4422 = 0;
        class296.field5051 = 0;
        class56.field824 = 0;
        class56.field820 = 0;
        class294.field5023 = 0;
        field765 = 0;
        class241.field4116 = 0;
        class205.field3461 = 0;
        class112.field1828 = 0;
        class183.field2923 = 0;
        class71.field1079 = 0;
        class62.field951 = 0;
        field758 = 0;
        class215.field3649 = 0;
        class92.field1508 = 0;
        class152.field2397 = 0;
        class12.field105 = 0;
        class222.field3840 = 0;
        class62.field935 = 0;
        class62.field889 = 0;
        class173.field2793 = 0;
        class26.field315 = 0;
        class301.field5188 = 0;
        class29.field397 = 0;
        class163.field2641 = 0;
        class74.field1170 = true;
        class125.method945((byte) 54);
        class237.field4063 = -1;
        class107.field1735 = -1;
        class32.field436 = 0;
        class170.field2772.field1476 = 0;
        class70.field1071 = -1;
        class260.field4377 = 0;
        class75.field1223.field1476 = 0;
        class286.field4893 = -1;
        class196.field3326 = 0;
        for (int var1 = 0; var1 < class189.field3012.length; var1++) {
            class189.field3012[var1] = null;
        }
        class80.field1341 = false;
        class195.field3293 = 0;
        class155.method1148(0, (byte) 96);
        for (int var2 = 0; var2 < 100; var2++) {
            class201.field3411[var2] = null;
        }
        class267.field4516 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        class118.field1975 = 0;
        class149.field2350 = (int) (Math.random() * 30.0D) - 20;
        class106.field1728 = false;
        class292.field4956 = (int) (Math.random() * 110.0D) - 55;
        class230.field4003 = (int) (Math.random() * 100.0D) - 50;
        class274.field4642 = 0;
        class263.field4429 = 0;
        class236.field4062 = 0;
        class152.field2398 = 0;
        class187.field2984 = (int) (Math.random() * 120.0D) - 60;
        class215.field3646 = (int) (Math.random() * 80.0D) - 40;
        class39.field603 = 0;
        class133.field2163 = 0;
        class149.field2349 = -1;
        class29.field372 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class5.field50[var3] = null;
            class181.field2868[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class301.field5186[var4] = null;
        }
        class268.field4551 = class5.field50[2047] = new class153();
        class38.field580.method328(false);
        class241.field4113.method328(false);
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var6 = 0; var6 < 104; var6++) {
                for (int var7 = 0; var7 < 104; var7++) {
                    class7.field72[var5][var6][var7] = null;
                }
            }
        }
        class68.field1053 = new class52();
        class293.field4993 = 0;
        class190.field3042 = 0;
        class102.method809((byte) 97);
        class300.method2045(-30484);
        class267.field4518 = 0;
        class284.field4862 = 0;
        class165.field2687 = 0;
        class123.field2037 = 0;
        class106.field1727 = 0;
        class207.field3509 = 0;
        class21.field221 = 0;
        class194.field3280 = 0;
        class153.field2453 = 0;
        class259.field4361 = 0;
        for (int var8 = 0; var8 < class194.field3264.length; var8++) {
            class194.field3264[var8] = -1;
        }
        if (class301.field5183 != -1) {
            class123.method937(class301.field5183, false);
        }
        for (class146 var9 = (class146) class214.field3632.method317(-51); var9 != null; var9 = (class146) class214.field3632.method314(-73)) {
            class294.method1993(var9, 3, true);
        }
        class301.field5183 = -1;
        class214.field3632 = new class49(8);
        class227.method1608((byte) -87);
        class195.field3293 = 0;
        class80.field1341 = false;
        class81.field1354 = null;
        class162.field2616.method85(false, 0, new int[] { 0, 0, 0, 0, 0 }, (int[]) null, -1);
        for (int var10 = 0; var10 < 8; var10++) {
            class205.field3473[var10] = null;
            class291.field4945[var10] = false;
        }
        class220.method1569(arg0 - 32054);
        class90.field1427 = true;
        for (int var11 = 0; var11 < 100; var11++) {
            class220.field3784[var11] = true;
        }
        class127.field2105 = null;
        class201.field3410 = 0;
        class225.field3923 = null;
        for (int var12 = 0; var12 < 6; var12++) {
            class281.field4808[var12] = new class201();
        }
        for (int var13 = 0; var13 < 25; var13++) {
            class146.field2314[var13] = 0;
            class260.field4372[var13] = 0;
            class52.field742[var13] = 0;
        }
        class246.method1717(-104);
        class233.field4028 = class118.field1973 = class96.field1557 = class244.field4158 = new short[256];
        class221.field3803 = 0;
        class108.field1741 = class152.field2407;
        class278.field4785 = true;
        class249.field4231 = false;
        class278.method1903(arg0 ^ 0xFFFF82CC);
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IS)Z", line = 1940)
    public static final boolean method344(int arg0, short arg1) {
        field769++;
        if (arg1 == 37 || arg1 == 45 || arg1 == 20 || arg1 == 46 || arg1 == 35 || arg1 == 23 || arg1 == 44 || arg1 == 7) {
            return true;
        } else if (arg0 != 19) {
            return false;
        } else if (arg1 == 15 || arg1 == 3 || arg1 == 1004 || arg1 == 1001) {
            return true;
        } else if (arg1 == 36 || arg1 == 29 || arg1 == 22 || arg1 == 48 || arg1 == 6) {
            return true;
        } else {
            return arg1 == 49 || arg1 == 19 || arg1 == 42 || arg1 == 14 || arg1 == 26 || arg1 == 2;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(BLmi;)V", line = 1969)
    public final void method345(byte arg0, class92 arg1) {
        while (true) {
            int var3 = arg1.method702(-1);
            if (var3 == 0) {
                field760++;
                if (arg0 >= -57) {
                    field780 = -113;
                }
                return;
            }
            this.method346(-30947, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(ILmi;I)V", line = 1987)
    private final void method346(int arg0, class92 arg1, int arg2) {
        field759++;
        if (arg0 != -30947) {
            field781 = (class26) null;
        }
        if (arg2 == 1) {
            this.field761 = arg1.method696((byte) -120);
        } else if (arg2 == 2) {
            int var7 = arg1.method702(arg0 ^ 0x78E2);
            this.field777 = new int[var7];
            this.field766 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field777[var8] = arg1.method721(72);
                int var9 = arg1.method702(-1);
                if (var9 == 0) {
                    this.field766[var8] = -1;
                } else {
                    this.field766[var8] = var9;
                }
            }
        } else if (arg2 == 3) {
            int var4 = arg1.method702(-1);
            this.field776 = new int[var4];
            this.field767 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field767[var5] = arg1.method721(class290.method1975(arg0, -30976));
                int var6 = arg1.method702(-1);
                if (var6 == 0) {
                    this.field776[var5] = -1;
                } else {
                    this.field776[var5] = var6;
                }
            }
        } else if (arg2 == 4) {
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(BI)I", line = 2058)
    public final int method347(byte arg0, int arg1) {
        field765++;
        if (this.field767 == null) {
            return -1;
        }
        if (arg0 != -33) {
            this.field776 = (int[]) null;
        }
        for (int var3 = 0; var3 < this.field767.length; var3++) {
            if (this.field776[var3] == arg1) {
                return this.field767[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IB)I", line = 2085)
    public final int method348(int arg0, byte arg1) {
        field772++;
        if (this.field777 == null) {
            return -1;
        }
        int var3 = 0;
        if (arg1 > -88) {
            field771 = (class62) null;
        }
        while (var3 < this.field777.length) {
            if (this.field766[var3] == arg0) {
                return this.field777[var3];
            }
            var3++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Lhi;B)V", line = 2110)
    public static final void method349(class26 arg0, byte arg1) {
        int var2 = -84 / ((68 - arg1) / 56);
        class91.field1428 = arg0;
        field773++;
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(III)I", line = 2129)
    public static final int method350(int arg0, int arg1, int arg2) {
        field764++;
        if (arg0 < arg2) {
            int var3 = arg0;
            arg0 = arg2;
            arg2 = var3;
        }
        while (arg2 != 0) {
            int var4 = arg0 % arg2;
            arg0 = arg2;
            arg2 = var4;
        }
        if (arg1 > -88) {
            field768 = 100;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!km", name = "f", descriptor = "(I)V", line = 2158)
    public static void method351(int arg0) {
        field779 = null;
        field771 = null;
        field774 = null;
        int var1 = -121 / ((arg0 - 72) / 51);
        field782 = null;
        field775 = null;
        field763 = null;
        field781 = null;
    }
}
