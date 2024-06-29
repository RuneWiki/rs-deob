import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class232 extends class242 {

    @OriginalMember(owner = "client!dc", name = "R", descriptor = "I")
    private int field4031 = 2;

    @OriginalMember(owner = "client!dc", name = "S", descriptor = "I")
    private int field4032 = 5;

    @OriginalMember(owner = "client!dc", name = "db", descriptor = "I")
    private int field4043 = 0;

    @OriginalMember(owner = "client!dc", name = "eb", descriptor = "I")
    private int field4044 = 5;

    @OriginalMember(owner = "client!dc", name = "W", descriptor = "I")
    private int field4036 = 2048;

    @OriginalMember(owner = "client!dc", name = "hb", descriptor = "[S")
    private short[] field4047 = new short[512];

    @OriginalMember(owner = "client!dc", name = "cb", descriptor = "I")
    private int field4042 = 1;

    @OriginalMember(owner = "client!dc", name = "X", descriptor = "[B")
    private byte[] field4037 = new byte[512];

    @OriginalMember(owner = "client!dc", name = "T", descriptor = "Lka;")
    public static class253 field4033 = new class253(16);

    @OriginalMember(owner = "client!dc", name = "gb", descriptor = "Lsb;")
    public static class221 field4046 = new class221(100);

    @OriginalMember(owner = "client!dc", name = "jb", descriptor = "Lp;")
    private static class280 field4049 = class18.method140((byte) -120, "Your ignore list is full)3 Max of 100 users)3");

    @OriginalMember(owner = "client!dc", name = "lb", descriptor = "Lp;")
    public static class280 field4051 = class18.method140((byte) -120, "Fertigkeit: ");

    @OriginalMember(owner = "client!dc", name = "mb", descriptor = "[I")
    public static int[] field4052 = new int[100];

    @OriginalMember(owner = "client!dc", name = "ob", descriptor = "Lp;")
    public static class280 field4054 = field4049;

    @OriginalMember(owner = "client!dc", name = "U", descriptor = "I")
    public static int field4034;

    @OriginalMember(owner = "client!dc", name = "V", descriptor = "I")
    public static int field4035;

    @OriginalMember(owner = "client!dc", name = "Y", descriptor = "I")
    public static int field4038;

    @OriginalMember(owner = "client!dc", name = "Z", descriptor = "I")
    public static int field4039;

    @OriginalMember(owner = "client!dc", name = "ab", descriptor = "I")
    public static int field4040;

    @OriginalMember(owner = "client!dc", name = "bb", descriptor = "I")
    public static int field4041;

    @OriginalMember(owner = "client!dc", name = "fb", descriptor = "I")
    public static int field4045;

    @OriginalMember(owner = "client!dc", name = "ib", descriptor = "I")
    public static int field4048;

    @OriginalMember(owner = "client!dc", name = "pb", descriptor = "Lwf;")
    public static class1 field4055;

    @OriginalMember(owner = "client!dc", name = "nb", descriptor = "[Lab;")
    public static class145[] field4053;

    @OriginalMember(owner = "client!dc", name = "kb", descriptor = "[Ll;")
    public static class160[] field4050;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIII)I")
    public static final int method1560(int arg0, int arg1, int arg2, int arg3) {
        ++field4040;
        if ((8 & class259.field4598[arg2][arg3][arg0]) != 0) {
            return 0;
        } else {
            return arg1 < arg2 && (2 & class259.field4598[1][arg3][arg0]) != 0 ? arg2 - 1 : arg2;
        }
    }

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "(I)V")
    public static void method1561(int arg0) {
        field4055 = null;
        field4054 = null;
        field4053 = null;
        field4051 = null;
        field4050 = null;
        field4049 = null;
        field4033 = null;
        field4052 = null;
        if (arg0 == 0) {
            field4046 = null;
        }
    }

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "(I)V")
    public static final void method1562(int arg0) {
        class129.field2242 = 0;
        class81.field1333 = true;
        ++field4039;
        class82.field1350 = 0;
        class144.field2518 = 0;
        class187.field3296 = 0;
        class241.field4229 = 0;
        class254.field4447 = 0;
        class155.field2704 = 0;
        class180.field3116 = 0;
        class9.field213 = 0;
        class197.field3450 = 0;
        class46.field762 = 0;
        class122.field2146 = 0;
        class142.field2491 = 0;
        class25.field468 = 0;
        class187.field3295 = 0;
        class221.field3831 = 0;
        class90.field1474 = 0;
        class192.field3387 = 0;
        class231.field4028 = 0;
        class280.field4906 = 0;
        class49.field812 = 0;
        class261.field4610 = 0;
        class83.field1381 = 0;
        class144.field2524 = 0;
        class252.field4410 = 0;
        class150.field2602 = 0;
        class91.field1477 = 0;
        class153.field2655 = 0;
        class99.field1608 = 0;
        class257.field4548 = 0;
        class188.field3313 = 0;
        class85.field1393 = 0;
        class136.field2388 = 0;
        class278.field4873 = 0;
        class68.field1125 = 0;
        class51.field835 = 0;
        class276.field4787 = 0;
        class68.field1121 = 0;
        class19.field341 = 0;
        class61.field980 = 0;
        class227.field3924 = 0;
        class220.field3817 = 0;
        class235.field4104 = 0;
        class280.field4891 = 0;
        class280.field4922 = 0;
        class1.field50 = 0;
        class187.field3291 = 0;
        class78.field1282 = 0;
        class150.field2601 = 0;
        class180.field3129 = 0;
        client.field2686 = 0;
        class277.field4807 = 0;
        class97.field1551 = 0;
        class66.field1105 = 0;
        class19.field342 = 0;
        class83.field1362 = 0;
        class28.field525 = 0;
        class89.field1442 = 0;
        class30.field564 = 0;
        class231.field4029 = 0;
        class128.field2231 = 0;
        class150.field2603 = 0;
        class15.field286 = 0;
        class180.field3122 = 0;
        class109.field1801 = 0;
        class253.field4424 = 0;
        class75.field1241 = 0;
        class2.field78 = 0;
        class211.field3635 = 0;
        class102.field1668 = 0;
        class81.field1327 = 0;
        class180.field3131 = 0;
        class1.field9 = 0;
        class46.field774 = 0;
        class147.field2563 = 0;
        class176.field3045 = 0;
        class159.field2781 = 0;
        class25.field455 = 0;
        class253.field4430 = 0;
        class73.field1200 = 0;
        class73.field1197 = 0;
        class76.field1251 = 0;
        class57.field922 = 0;
        class1.field25 = 0;
        class265.field4669 = 0;
        class65.field1090 = 0;
        class22.field398 = 0;
        class130.field2286 = 0;
        class52.field857 = 0;
        class19.field350 = 0;
        class250.field4392 = 0;
        class130.field2316 = 0;
        class246.field4327 = 0;
        class113.field2028 = 0;
        class109.field1814 = 0;
        class181.field3166 = 0;
        class83.field1374 = 0;
        class152.field2619 = 0;
        class86.field1421 = 0;
        class201.field3519 = 0;
        class250.field4389 = 0;
        class271.field4743 = 0;
        class155.field2718 = 0;
        class224.field3865 = 0;
        class157.field2742 = 0;
        class221.field3843 = 0;
        class197.field3446 = 0;
        class196.field3436 = 0;
        class258.field4567 = 0;
        class263.field4646 = 0;
        class258.field4575 = 0;
        class55.field900 = 0;
        class169.field2964 = 0;
        class130.field2325 = 0;
        class49.field795 = 0;
        class102.field1680 = 0;
        class27.field523 = 0;
        class61.field994 = 0;
        class192.field3386 = 0;
        class262.field4628 = 0;
        class259.field4592 = 0;
        class9.field189 = 0;
        class175.field3037 = 0;
        class261.field4618 = 0;
        class194.field3415 = 0;
        class228.field3949 = 0;
        class214.field3672 = 0;
        class180.field3119 = 0;
        class97.field1539 = 0;
        class145.field2537 = 0;
        class17.field318 = 0;
        class25.field509 = 0;
        class136.field2397 = 0;
        class120.field2133 = 0;
        class65.field1093 = 0;
        class64.field1058 = 0;
        class192.field3352 = 0;
        class242.field4240 = 0;
        class177.field3084 = 0;
        class167.field2923 = 0;
        class128.field2228 = 0;
        class8.field152 = 0;
        class145.field2535 = 0;
        class90.field1465 = 0;
        class150.field2606 = 0;
        class100.field1630 = 0;
        class74.field1219 = 0;
        class194.field3422 = 0;
        class45.field741 = 0;
        class112.field1840 = 0;
        class215.field3691 = 0;
        class184.field3248 = 0;
        class65.field1092 = 0;
        class92.field1491 = 0;
        class261.field4608 = 0;
        class61.field986 = 0;
        class199.field3482 = 0;
        class62.field1008 = 0;
        class16.field303 = 0;
        class128.field2235 = 0;
        class155.field2715 = 0;
        class280.field4897 = 0;
        class189.field3326 = 0;
        class207.field3585 = 0;
        class282.field4965 = 0;
        class24.field440 = 0;
        class160.field2812 = 0;
        class161.field2820 = 0;
        class167.field2922 = 0;
        class109.field1822 = 0;
        class90.field1464 = 0;
        class227.field3911 = 0;
        class278.field4870 = 0;
        class238.field4126 = 0;
        class255.field4474 = arg0;
        class230.field3969 = 0;
        class50.field818 = 0;
        class89.field1446 = 0;
        class175.field3043 = 0;
        class40.field694 = 0;
        class58.field942 = 0;
        class58.field932 = 0;
        class279.field4888 = 0;
        class197.field3456 = 0;
        class130.field2246 = 0;
        class1.field34 = 0;
        class53.field872 = 0;
        class160.field2787 = 0;
        class1.field12 = 0;
        class246.field4332 = 0;
        class176.field3057 = 0;
        class122.field2141 = 0;
        class66.field1107 = 0;
        class13.field268 = 0;
        class257.field4531 = 0;
        class1.field53 = 0;
        class224.field3863 = 0;
        class176.field3050 = 0;
        class52.field859 = 0;
        class222.field3853 = 0;
        class21.field379 = 0;
        class262.field4630 = 0;
        class230.field3987 = 0;
        class277.field4844 = 0;
        class279.field4886 = 0;
        class93.field1505 = 0;
        class127.field2217 = 0;
        class97.field1547 = 0;
        class204.field3539 = 0;
        class96.field1531 = 0;
        class184.field3240 = 0;
        class210.field3611 = 0;
        class153.field2640 = 0;
        class159.field2778 = 0;
        class255.field4498 = 0;
        class129.field2240 = 0;
        class244.field4287 = 0;
        class255.field4527 = 0;
        class43.field720 = 0;
        class3.field94 = 0;
        class52.field856 = 0;
        class142.field2474 = 0;
        class99.field1620 = 0;
        class100.field1634 = 0;
        class241.field4230 = 0;
        class214.field3679 = 0;
        class260.field4602 = 0;
        class162.field2833 = 0;
        class122.field2149 = 0;
        class228.field3945 = 0;
        field4039 = 0;
        class261.field4613 = 0;
        class105.field1737 = 0;
        class1.field8 = 0;
        class214.field3669 = 0;
        class17.field320 = 0;
        field4035 = 0;
        class86.field1425 = 0;
        class133.field2363 = 0;
        class126.field2212 = 0;
        class249.field4355 = 0;
        class46.field753 = 0;
        class25.field476 = 0;
        class1.field4 = 0;
        class189.field3323 = 0;
        class46.field773 = 0;
        class147.field2565 = 0;
        class4.field116 = 0;
        class130.field2312 = 0;
        class16.field296 = 0;
        class221.field3832 = 0;
        class177.field3079 = 0;
        class97.field1543 = 0;
        class79.field1296 = 0;
        class9.field202 = 0;
        class204.field3545 = 0;
        class19.field340 = 0;
        class90.field1461 = 0;
        class207.field3581 = 0;
        class158.field2765 = 0;
        class51.field840 = 0;
        class157.field2755 = 0;
        class246.field4320 = 0;
        class1.field35 = 0;
        class25.field483 = 0;
        class79.field1298 = 0;
        class207.field3579 = 0;
        class183.field3222 = 0;
        class228.field3934 = 0;
        class49.field815 = 0;
        class211.field3618 = 0;
        class187.field3270 = 0;
        class145.field2525 = 0;
        class25.field477 = 0;
        class31.field584 = 0;
        class220.field3772 = 0;
        class261.field4612 = 0;
        class83.field1365 = 0;
        class280.field4935 = 0;
        class158.field2759 = 0;
        class3.field103 = 0;
        class212.field3645 = 0;
        class197.field3445 = 0;
        class52.field855 = 0;
        class25.field491 = 0;
        class127.field2227 = 0;
        class150.field2589 = 0;
        class94.field1523 = 0;
        class236.field4108 = 0;
        class142.field2456 = 0;
        class25.field479 = 0;
        class16.field308 = 0;
        class122.field2154 = 0;
        class43.field715 = 0;
        class280.field4948 = 0;
        class1.field59 = 0;
        class227.field3931 = 0;
        class236.field4114 = 0;
        class152.field2635 = 0;
        class109.field1818 = 0;
        class164.field2880 = 0;
        class233.field4064 = 0;
        class51.field843 = 0;
        class1.field17 = 0;
        class79.field1299 = 0;
        class269.field4716 = 0;
        class176.field3059 = 0;
        class178.field3096 = 0;
        class271.field4732 = 0;
        class227.field3928 = 0;
        class112.field1859 = 0;
        class188.field3312 = 0;
        class199.field3484 = 0;
        class206.field3572 = 0;
        class200.field3509 = 0;
        class100.field1637 = 0;
        class205.field3569 = 0;
        class262.field4634 = 0;
        class222.field3852 = 0;
        class31.field575 = 0;
        class242.field4241 = 0;
        class160.field2791 = 0;
        class187.field3275 = 0;
        class252.field4405 = 0;
        class231.field4017 = 0;
        class173.field3010 = 0;
        class74.field1226 = 0;
        class183.field3220 = 0;
        class238.field4125 = 0;
        class25.field506 = 0;
        class229.field3958 = 0;
        class142.field2475 = 0;
        class33.field616 = 0;
        class253.field4421 = 0;
        class90.field1467 = 0;
        class101.field1645 = 0;
        class16.field294 = 0;
        class154.field2671 = 0;
        class60.field961 = 0;
        class92.field1496 = 0;
        class215.field3693 = 0;
        class113.field1862 = 0;
        class25.field503 = 0;
        class50.field821 = 0;
        class194.field3416 = 0;
        class24.field442 = 0;
        class29.field538 = 0;
        class245.field4302 = 0;
        class60.field970 = 0;
        class154.field2670 = 0;
        class134.field2374 = 0;
        class197.field3443 = 0;
        class9.field211 = 0;
        class187.field3286 = 0;
        class109.field1802 = 0;
        class122.field2144 = 0;
        class130.field2299 = 0;
        class280.field4941 = 0;
        class29.field550 = 0;
        field4038 = 0;
        class180.field3143 = 0;
        class280.field4943 = 0;
        class118.field2114 = 0;
        class13.field267 = 0;
        class277.field4796 = 0;
        class277.field4851 = 0;
        class244.field4289 = 0;
        class1.field7 = 0;
        class44.field733 = 0;
        class78.field1284 = 0;
        class176.field3056 = 0;
        class205.field3558 = 0;
        class280.field4931 = 0;
        field4040 = 0;
        class225.field3891 = 0;
        class108.field1790 = 0;
        class25.field453 = 0;
        class99.field1610 = 0;
        class220.field3792 = 0;
        class142.field2508 = 0;
        class215.field3680 = 0;
        class157.field2736 = 0;
        class109.field1792 = 0;
        class1.field16 = 0;
        class161.field2826 = 0;
        class7.field137 = 0;
        class113.field1911 = 0;
        class220.field3813 = 0;
        class221.field3844 = 0;
        class46.field766 = 0;
        class66.field1114 = 0;
        class180.field3150 = 0;
        class215.field3689 = 0;
        class180.field3155 = 0;
        class234.field4089 = 0;
        class164.field2873 = 0;
        class212.field3653 = 0;
        class244.field4291 = 0;
        class129.field2244 = 0;
        class99.field1618 = 0;
        class3.field107 = 0;
        class226.field3904 = 0;
        class275.field4768 = 0;
        class109.field1811 = 0;
        class106.field1761 = 0;
        class98.field1596 = 0;
        class62.field1012 = 0;
        class191.field3335 = 0;
        class236.field4111 = 0;
        class99.field1621 = 0;
        class45.field746 = 0;
        class212.field3643 = 0;
        class262.field4627 = 0;
        class85.field1398 = 0;
        class109.field1812 = 0;
        class20.field368 = 0;
        class153.field2649 = 0;
        class131.field2332 = 0;
        class203.field3532 = 0;
        class134.field2370 = 0;
        class74.field1232 = 0;
        class75.field1243 = 0;
        class1.field23 = 0;
        class257.field4532 = 0;
        class1.field45 = 0;
        class92.field1503 = 0;
        class1.field39 = 0;
        class264.field4650 = 0;
        class25.field452 = 0;
        class280.field4893 = 0;
        class165.field2895 = 0;
        class211.field3633 = 0;
        class282.field4960 = 0;
        class90.field1462 = 0;
        class149.field2581 = 0;
        class25.field448 = 0;
        class1.field60 = 0;
        class280.field4919 = 0;
        class230.field3981 = 0;
        class3.field106 = 0;
        class51.field834 = 0;
        class215.field3692 = 0;
        class11.field234 = 0;
        class34.field626 = 0;
        class173.field3017 = 0;
        class25.field504 = 0;
        class248.field4339 = 0;
        class136.field2389 = 0;
        class132.field2344 = 0;
        class86.field1407 = 0;
        class257.field4551 = 0;
        class25.field467 = 0;
        class15.field289 = 0;
        class18.field334 = 0;
        class173.field3018 = 0;
        class280.field4946 = 0;
        class106.field1760 = 0;
        class228.field3943 = 0;
        class25.field454 = 0;
        class66.field1100 = 0;
        class124.field2167 = 0;
        class136.field2385 = 0;
        class215.field3683 = 0;
        class283.field4972 = 0;
        class25.field490 = 0;
        class181.field3165 = 0;
        class193.field3406 = 0;
        class193.field3402 = 0;
        class25.field458 = 0;
        class273.field4746 = 0;
        class222.field3848 = 0;
        class81.field1328 = 0;
        class99.field1613 = 0;
        class90.field1471 = 0;
        class126.field2209 = 0;
        class1.field26 = 0;
        class242.field4261 = 0;
        class278.field4868 = 0;
        class91.field1479 = 0;
        class112.field1846 = 0;
        class7.field139 = 0;
        class248.field4349 = 0;
        class32.field593 = 0;
        class127.field2226 = 0;
        class159.field2777 = 0;
        class66.field1113 = 0;
        class24.field438 = 0;
        class263.field4648 = 0;
        class109.field1799 = 0;
        class54.field887 = 0;
        class148.field2566 = 0;
        class212.field3644 = 0;
        class57.field924 = 0;
        class280.field4924 = 0;
        class66.field1108 = 0;
        class283.field4989 = 0;
        class280.field4896 = 0;
        class35.field646 = 0;
        class30.field570 = 0;
        class167.field2926 = 0;
        class244.field4285 = 0;
        class153.field2641 = 0;
        class104.field1728 = 0;
        class182.field3188 = 0;
        class93.field1506 = 0;
        class152.field2631 = 0;
        class133.field2365 = 0;
        class193.field3407 = 0;
        class89.field1450 = 0;
        class280.field4930 = 0;
        class38.field670 = 0;
        class176.field3044 = 0;
        class262.field4635 = 0;
        class224.field3871 = 0;
        class241.field4219 = 0;
        class74.field1230 = 0;
        class278.field4875 = 0;
        class2.field86 = 0;
        class46.field760 = 0;
        class160.field2795 = 0;
        class35.field641 = 0;
        class243.field4280 = 0;
        class257.field4553 = 0;
        class246.field4311 = 0;
        class21.field385 = 0;
        class267.field4688 = 0;
        class99.field1609 = 0;
        class99.field1607 = 0;
        class234.field4067 = 0;
        class205.field3559 = 0;
        class78.field1277 = 0;
        class169.field2951 = 0;
        field4041 = 0;
        class78.field1279 = 0;
        class16.field306 = 0;
        class203.field3528 = 0;
        class191.field3336 = 0;
        class127.field2218 = 0;
        class29.field548 = 0;
        class259.field4590 = 0;
        class136.field2405 = 0;
        class205.field3565 = 0;
        class134.field2368 = 0;
        class86.field1412 = 0;
        class79.field1302 = 0;
        class253.field4436 = 0;
        class25.field505 = 0;
        class212.field3639 = 0;
        class13.field263 = 0;
        class215.field3690 = 0;
        class18.field329 = 0;
        class29.field549 = 0;
        class25.field484 = 0;
        class221.field3845 = 0;
        class99.field1623 = 0;
        class180.field3128 = 0;
        class259.field4587 = 0;
        class31.field588 = 0;
        class277.field4849 = 0;
        class180.field3126 = 0;
        class184.field3243 = 0;
        class109.field1795 = 0;
        class220.field3820 = 0;
        class221.field3835 = 0;
        class283.field4985 = 0;
        class261.field4611 = 0;
        class154.field2667 = 0;
        class32.field591 = 0;
        class280.field4921 = 0;
        class164.field2874 = 0;
        class184.field3230 = 0;
        class130.field2309 = 0;
        class200.field3501 = 0;
        class197.field3444 = 0;
        class235.field4103 = 0;
        class40.field698 = 0;
        class1.field49 = 0;
        class18.field338 = 0;
        class280.field4899 = 0;
        class43.field714 = 0;
        class109.field1820 = 0;
        class233.field4061 = 0;
        class113.field1943 = 0;
        class1.field63 = 0;
        class229.field3962 = 0;
        class262.field4626 = 0;
        class6.field123 = 0;
        class242.field4258 = 0;
        class28.field526 = 0;
        class168.field2936 = 0;
        class124.field2174 = 0;
        class55.field899 = 0;
        class231.field4025 = 0;
        class260.field4601 = 0;
        class255.field4504 = 0;
        class193.field3408 = 0;
        class98.field1586 = 0;
        class113.field2004 = 0;
        class180.field3154 = 0;
        class152.field2630 = 0;
        class25.field449 = 0;
        class275.field4770 = 0;
        class228.field3947 = 0;
        class280.field4909 = 0;
        class86.field1414 = 0;
        class17.field313 = 0;
        class66.field1104 = 0;
        class45.field743 = 0;
        class96.field1533 = 0;
        class25.field470 = 0;
        class184.field3233 = 0;
        class81.field1321 = 0;
        class173.field3021 = 0;
        class97.field1554 = 0;
        class6.field127 = 0;
        class61.field996 = 0;
        class51.field844 = 0;
        class154.field2672 = 0;
        class200.field3500 = 0;
        class205.field3555 = 0;
        class28.field527 = 0;
        class161.field2818 = 0;
        class234.field4088 = 0;
        class2.field77 = 0;
        class1.field47 = 0;
        class112.field1839 = 0;
        class15.field282 = 0;
        class230.field3970 = 0;
        class49.field804 = 0;
        class124.field2171 = 0;
        class126.field2206 = 0;
        class103.field1705 = 0;
        class109.field1824 = 0;
        class132.field2352 = 0;
        class277.field4839 = 0;
        class21.field382 = 0;
        class29.field555 = 0;
        class280.field4903 = 0;
        class269.field4720 = 0;
        class57.field931 = 0;
        class85.field1391 = 0;
        class76.field1249 = 0;
        class153.field2639 = 0;
        class180.field3139 = 0;
        class78.field1286 = 0;
        class180.field3148 = 0;
        class283.field4993 = 0;
        class150.field2588 = 0;
        class277.field4805 = 0;
        class123.field2162 = 0;
        class152.field2627 = 0;
        class54.field878 = 0;
        class254.field4446 = 0;
        class267.field4689 = 0;
        class109.field1805 = 0;
        class130.field2308 = 0;
        class241.field4215 = 0;
        class4.field114 = 0;
        class130.field2291 = 0;
        class205.field3556 = 0;
        class224.field3872 = 0;
        class215.field3694 = 0;
        class50.field827 = 0;
        class180.field3113 = 0;
        class21.field388 = 0;
        class46.field765 = 0;
        class130.field2324 = 0;
        class131.field2334 = 0;
        class130.field2284 = 0;
        class99.field1617 = 0;
        class90.field1458 = 0;
        class283.field4975 = 0;
        class277.field4798 = 0;
        class282.field4956 = 0;
        class280.field4938 = 0;
        class113.field2016 = 0;
        class103.field1722 = 0;
        class55.field898 = 0;
        class193.field3399 = 0;
        class97.field1548 = 0;
        class243.field4276 = 0;
        class66.field1097 = 0;
        class244.field4288 = 0;
        class255.field4497 = 0;
        class258.field4568 = 0;
        class208.field3597 = 0;
        class225.field3893 = 0;
        class192.field3368 = 0;
        class230.field3991 = 0;
        class49.field793 = 0;
        class280.field4934 = 0;
        class228.field3935 = 0;
        class105.field1749 = 0;
        class21.field384 = 0;
        class169.field2960 = 0;
        class219.field3747 = 0;
        class194.field3417 = 0;
        class20.field371 = 0;
        class260.field4599 = 0;
        class220.field3809 = 0;
        class234.field4075 = 0;
        class18.field333 = 0;
        class187.field3293 = 0;
        class1.field65 = 0;
        class81.field1325 = 0;
        class226.field3899 = 0;
        class243.field4264 = 0;
        class175.field3032 = 0;
        class105.field1748 = 0;
        class149.field2583 = 0;
        class74.field1223 = 0;
        class19.field356 = 0;
        class54.field880 = 0;
        class25.field456 = 0;
        class224.field3883 = 0;
        class200.field3506 = 0;
        class177.field3076 = 0;
        class94.field1524 = 0;
        class280.field4923 = 0;
        class180.field3144 = 0;
        class109.field1796 = 0;
        class152.field2626 = 0;
        class90.field1475 = 0;
        class1.field40 = 0;
        class280.field4915 = 0;
        class79.field1300 = 0;
        class207.field3586 = 0;
        class29.field557 = 0;
        class259.field4591 = 0;
        class59.field949 = 0;
        class43.field717 = 0;
        class9.field212 = 0;
        class267.field4694 = 0;
        class113.field1994 = 0;
        class25.field462 = 0;
        class258.field4573 = 0;
        client.field2692 = 0;
        class83.field1359 = 0;
        class231.field4019 = 0;
        class1.field46 = 0;
        class154.field2660 = 0;
        class113.field1898 = 0;
        class280.field4898 = 0;
        class68.field1122 = 0;
        class86.field1415 = 0;
        class97.field1546 = 0;
        class21.field386 = 0;
        class127.field2219 = 0;
        class257.field4536 = 0;
        class127.field2216 = 0;
        class102.field1688 = 0;
        class97.field1541 = 0;
        class185.field3253 = 0;
        class102.field1675 = 0;
        class205.field3567 = 0;
        class74.field1235 = 0;
        class154.field2665 = 0;
        class33.field624 = 0;
        class199.field3480 = 0;
        class246.field4323 = 0;
        class88.field1433 = 0;
        class140.field2441 = 0;
        class280.field4937 = 0;
        class215.field3698 = 0;
        class243.field4278 = 0;
        class280.field4925 = 0;
        class130.field2280 = 0;
        class73.field1195 = 0;
        class53.field869 = 0;
        class246.field4317 = 0;
        class99.field1597 = 0;
        class31.field576 = 0;
        class129.field2243 = 0;
        client.field2685 = 0;
        class109.field1817 = 0;
        class201.field3513 = 0;
        class215.field3688 = 0;
        class157.field2746 = 0;
        class14.field276 = 0;
        class64.field1071 = 0;
        class113.field1864 = 0;
        class245.field4304 = 0;
        class187.field3287 = 0;
        class240.field4198 = 0;
        class227.field3913 = 0;
        class280.field4947 = 0;
        class204.field3538 = 0;
        class45.field744 = 0;
        class25.field496 = 0;
        class21.field389 = 0;
        class9.field199 = 0;
        class60.field974 = 0;
        class249.field4363 = 0;
        class230.field3992 = 0;
        class4.field115 = 0;
        class233.field4062 = 0;
        class257.field4541 = 0;
        class219.field3755 = 0;
        class219.field3748 = 0;
        class21.field390 = 0;
        class105.field1747 = 0;
        class54.field889 = 0;
        class255.field4463 = 0;
        class66.field1096 = 0;
        class89.field1441 = 0;
        class19.field344 = 0;
        class44.field737 = 0;
        class107.field1770 = 0;
        class180.field3147 = 0;
        class162.field2832 = 0;
        class65.field1089 = 0;
        class190.field3334 = 0;
        class113.field1896 = 0;
        class215.field3695 = 0;
        class134.field2379 = 0;
        class184.field3239 = 0;
        class116.field2096 = 0;
        class254.field4445 = 0;
        class231.field4024 = 0;
        class180.field3142 = 0;
        class283.field4971 = 0;
        class280.field4916 = 0;
        class280.field4905 = 0;
        class244.field4293 = 0;
        class89.field1447 = 0;
        class18.field327 = 0;
        class243.field4284 = 0;
        class169.field2957 = 0;
        class280.field4902 = 0;
        class152.field2620 = 0;
        class203.field3536 = 0;
        class238.field4129 = 0;
        class208.field3593 = 0;
        class44.field728 = 0;
        class3.field99 = 0;
        class78.field1265 = 0;
        class19.field355 = 0;
        client.field2680 = 0;
        class37.field669 = 0;
        class234.field4083 = 0;
        class109.field1803 = 0;
        class86.field1418 = 0;
        class83.field1383 = 0;
        class192.field3369 = 0;
        class136.field2384 = 0;
        class176.field3051 = 0;
        class234.field4065 = 0;
        class37.field660 = 0;
        class248.field4340 = 0;
        class230.field4001 = 0;
        class53.field870 = 0;
        class243.field4273 = 0;
        class283.field4978 = 0;
        class25.field485 = 0;
        class230.field3980 = 0;
        class269.field4712 = 0;
        class177.field3081 = 0;
        class25.field472 = 0;
        class240.field4200 = 0;
        class13.field270 = 0;
        class98.field1582 = 0;
        class177.field3075 = 0;
        class6.field128 = 0;
        class160.field2801 = 0;
        class191.field3342 = 0;
        class178.field3087 = 0;
        class57.field920 = 0;
        class282.field4964 = 0;
        class230.field3967 = 0;
        class157.field2744 = 0;
        class25.field488 = 0;
        class1.field13 = 0;
        class257.field4530 = 0;
        class266.field4681 = 0;
        class260.field4607 = 0;
        class242.field4262 = 0;
        class98.field1580 = 0;
        class220.field3766 = 0;
        class221.field3829 = 0;
        class41.field705 = 0;
        class280.field4949 = 0;
        class38.field675 = 0;
        class227.field3916 = 0;
        class25.field463 = 0;
        class38.field673 = 0;
        class93.field1514 = 0;
        class90.field1454 = 0;
        client.field2694 = 0;
        class50.field822 = 0;
        class271.field4742 = 0;
        class25.field450 = 0;
        class11.field238 = 0;
        class196.field3433 = 0;
        class112.field1841 = 0;
        class280.field4928 = 0;
        class235.field4101 = 0;
        class231.field4018 = 0;
        class126.field2211 = 0;
        field4048 = 0;
        class255.field4493 = 0;
        class241.field4233 = 0;
        class1.field1 = 0;
        class113.field1956 = 0;
        class28.field536 = 0;
        class74.field1215 = 0;
        class57.field929 = 0;
        class1.field27 = 0;
        class25.field493 = 0;
        class83.field1367 = 0;
        class201.field3517 = 0;
        class113.field1962 = 0;
        class99.field1603 = 0;
        class257.field4550 = 0;
        class4.field110 = 0;
        class227.field3912 = 0;
        class13.field257 = 0;
        class242.field4239 = 0;
        class9.field207 = 0;
        class282.field4962 = 0;
        class15.field283 = 0;
        class113.field1886 = 0;
        class149.field2575 = 0;
        class140.field2432 = 0;
        class257.field4554 = 0;
        class131.field2329 = 0;
        class66.field1101 = 0;
        class74.field1234 = 0;
        class109.field1810 = 0;
        class283.field4977 = 0;
        class18.field331 = 0;
        class74.field1216 = 0;
        class102.field1671 = 0;
        class220.field3763 = 0;
        class136.field2394 = 0;
        class182.field3201 = 0;
        class136.field2400 = 0;
        class6.field133 = 0;
        class7.field135 = 0;
        class258.field4571 = 0;
        class25.field508 = 0;
        class230.field3979 = 0;
        class8.field169 = 0;
        class23.field413 = 0;
        class34.field630 = 0;
        class80.field1315 = 0;
        class99.field1601 = 0;
        class44.field731 = 0;
        class150.field2586 = 0;
        class54.field883 = 0;
        class1.field15 = 0;
        class108.field1782 = 0;
        class209.field3607 = 0;
        class81.field1323 = 0;
        class6.field134 = 0;
        class208.field3588 = 0;
        class40.field692 = 0;
        class1.field29 = 0;
        class73.field1196 = 0;
        class113.field1871 = 0;
        class3.field108 = 0;
        class52.field854 = 0;
        class212.field3649 = 0;
        class131.field2330 = 0;
        class148.field2573 = 0;
        class21.field380 = 0;
        class182.field3195 = 0;
        class277.field4795 = 0;
        class92.field1499 = 0;
        class164.field2881 = 0;
        class279.field4885 = 0;
        class188.field3302 = 0;
        class205.field3566 = 0;
        class132.field2354 = 0;
        class73.field1210 = 0;
        class273.field4757 = 0;
        class278.field4865 = 0;
        class211.field3626 = 0;
        class78.field1262 = 0;
        class109.field1819 = 0;
        class180.field3115 = 0;
        class207.field3577 = 0;
        class255.field4480 = 0;
        class104.field1729 = 0;
        class153.field2646 = 0;
        class142.field2497 = 0;
        class180.field3118 = 0;
        class242.field4259 = 0;
        class103.field1707 = 0;
        class31.field590 = 0;
        class105.field1742 = 0;
        class230.field4000 = 0;
        class1.field51 = 0;
        class9.field206 = 0;
        class142.field2457 = 0;
        class136.field2386 = 0;
        class168.field2942 = 0;
        class22.field403 = 0;
        class221.field3833 = 0;
        class41.field708 = 0;
        class56.field914 = 0;
        class12.field243 = 0;
        class109.field1807 = 0;
        class1.field28 = 0;
        class201.field3518 = 0;
        class6.field132 = 0;
        class238.field4123 = 0;
        class175.field3041 = 0;
        class130.field2305 = 0;
        class280.field4918 = 0;
        class13.field260 = 0;
        class153.field2650 = 0;
        class269.field4709 = 0;
        class269.field4715 = 0;
        class46.field769 = 0;
        class153.field2642 = 0;
        class32.field596 = 0;
        class105.field1752 = 0;
        class25.field499 = 0;
        class255.field4482 = 0;
        class147.field2564 = 0;
        class1.field38 = 0;
        class167.field2928 = 0;
        class99.field1622 = 0;
        class56.field910 = 0;
        class118.field2112 = 0;
        class242.field4252 = 0;
        class25.field492 = 0;
        class277.field4817 = 0;
        class57.field926 = 0;
        class102.field1679 = 0;
        class159.field2784 = 0;
        class58.field946 = 0;
        class140.field2439 = 0;
        class168.field2935 = 0;
        class50.field824 = 0;
        class29.field551 = 0;
        class144.field2523 = 0;
        class142.field2492 = 0;
        class211.field3628 = 0;
        class265.field4672 = 0;
        class181.field3158 = 0;
        class73.field1211 = 0;
        class75.field1245 = 0;
        class117.field2102 = 0;
        class9.field191 = 0;
        class194.field3423 = 0;
        class242.field4249 = 0;
        class215.field3687 = 0;
        class280.field4900 = 0;
        class234.field4085 = 0;
        class259.field4594 = 0;
        class197.field3447 = 0;
        class253.field4426 = 0;
        class102.field1673 = 0;
        class93.field1513 = 0;
        class1.field57 = 0;
        class235.field4099 = 0;
        class97.field1549 = 0;
        client.field2693 = 0;
        class35.field640 = 0;
        class34.field628 = 0;
        client.field2691 = 0;
        class182.field3181 = 0;
        class169.field2963 = 0;
        class32.field601 = 0;
        class180.field3114 = 0;
        class275.field4774 = 0;
        class142.field2482 = 0;
        class92.field1497 = 0;
        class280.field4929 = 0;
        class46.field757 = 0;
        class160.field2797 = 0;
        class185.field3260 = 0;
        class180.field3134 = 0;
        class254.field4449 = 0;
        class280.field4951 = 0;
        class193.field3410 = 0;
        class83.field1361 = 0;
        class221.field3839 = 0;
        class1.field10 = 0;
        class29.field560 = 0;
        class208.field3589 = 0;
        class204.field3544 = 0;
        class152.field2624 = 0;
        class165.field2890 = 0;
        class19.field357 = 0;
        class1.field18 = 0;
        class176.field3053 = 0;
        class157.field2741 = 0;
        class48.field792 = 0;
        class67.field1118 = 0;
        class221.field3836 = 0;
        class257.field4547 = 0;
        class246.field4314 = 0;
        class19.field358 = 0;
        client.field2682 = 0;
        class189.field3319 = 0;
        class266.field4679 = 0;
        class25.field489 = 0;
        class231.field4014 = 0;
        class199.field3490 = 0;
        class12.field248 = 0;
        class75.field1237 = 0;
        class4.field111 = 0;
        class189.field3322 = 0;
        class78.field1287 = 0;
        class255.field4513 = 0;
        class144.field2516 = 0;
        class257.field4534 = 0;
        class157.field2750 = 0;
        class100.field1636 = 0;
        class227.field3920 = 0;
        class220.field3800 = 0;
        class25.field482 = 0;
        class280.field4894 = 0;
        class109.field1806 = 0;
        class253.field4428 = 0;
        class62.field1001 = 0;
        class3.field102 = 0;
        class109.field1813 = 0;
        class104.field1732 = 0;
        class230.field3982 = 0;
        class35.field650 = 0;
        class178.field3099 = 0;
        class249.field4358 = 0;
        class91.field1481 = 0;
        class109.field1804 = 0;
        class242.field4236 = 0;
        class176.field3048 = 0;
        class184.field3232 = 0;
        class192.field3384 = 0;
        class112.field1853 = 0;
        class98.field1587 = 0;
        class21.field387 = 0;
        class257.field4537 = 0;
        class164.field2877 = 0;
        class127.field2221 = 0;
        class117.field2103 = 0;
        class181.field3162 = 0;
        class200.field3496 = 0;
        class180.field3137 = 0;
        class44.field729 = 0;
        class173.field3020 = 0;
        class248.field4337 = 0;
        class25.field507 = 0;
        class173.field3011 = 0;
        class241.field4209 = 0;
        class224.field3877 = 0;
        class283.field4990 = 0;
        class78.field1292 = 0;
        class153.field2643 = 0;
        class183.field3213 = 0;
        class66.field1102 = 0;
        class11.field228 = 0;
        class205.field3570 = 0;
        class185.field3252 = 0;
        class189.field3318 = 0;
        class283.field4988 = 0;
        class226.field3896 = 0;
        class175.field3039 = 0;
        class74.field1224 = 0;
        class184.field3242 = 0;
        class251.field4395 = 0;
        class234.field4080 = 0;
        class81.field1330 = 0;
        class259.field4584 = 0;
        client.field2688 = 0;
        class280.field4913 = 0;
        class242.field4237 = 0;
        class78.field1289 = 0;
        class27.field517 = 0;
        class157.field2747 = 0;
        class54.field894 = 0;
        class257.field4538 = 0;
        class115.field2089 = 0;
        class203.field3537 = 0;
        class180.field3127 = 0;
        class249.field4370 = 0;
        class252.field4416 = 0;
        class54.field881 = 0;
        class66.field1099 = 0;
        class27.field511 = 0;
        class271.field4741 = 0;
        class282.field4958 = 0;
        class125.field2189 = 0;
        class148.field2572 = 0;
        class132.field2353 = 0;
        class180.field3135 = 0;
        class265.field4667 = 0;
        class283.field4979 = 0;
        class261.field4609 = 0;
        class127.field2224 = 0;
        class22.field399 = 0;
        class153.field2654 = 0;
        class94.field1516 = 0;
        class173.field3022 = 0;
        class52.field850 = 0;
        class249.field4364 = 0;
        class191.field3341 = 0;
        class32.field599 = 0;
        class176.field3049 = 0;
        class187.field3273 = 0;
        class107.field1768 = 0;
        class242.field4250 = 0;
        class62.field1006 = 0;
        class82.field1338 = 0;
        class180.field3123 = 0;
        class233.field4058 = 0;
        class25.field445 = 0;
        class41.field709 = 0;
        class51.field839 = 0;
        class102.field1661 = 0;
        class21.field395 = 0;
        class74.field1225 = 0;
        class142.field2469 = 0;
        class48.field788 = 0;
        class15.field290 = 0;
        class280.field4942 = 0;
        class51.field845 = 0;
        class228.field3944 = 0;
        class227.field3919 = 0;
        class76.field1252 = 0;
        class238.field4131 = 0;
        class267.field4693 = 0;
        class205.field3553 = 0;
        class176.field3061 = 0;
        class185.field3265 = 0;
        class1.field32 = 0;
        class215.field3681 = 0;
        class149.field2576 = 0;
        class35.field642 = 0;
        class108.field1779 = 0;
        class83.field1368 = 0;
        class59.field952 = 0;
        class242.field4246 = 0;
        class150.field2590 = 0;
        class73.field1193 = 0;
        class20.field369 = 0;
        class253.field4423 = 0;
        class25.field497 = 0;
        class73.field1199 = 0;
        class283.field4980 = 0;
        class178.field3105 = 0;
        class246.field4324 = 0;
        class100.field1632 = 0;
        class199.field3488 = 0;
        class103.field1709 = 0;
        class130.field2288 = 0;
        class255.field4471 = 0;
        class255.field4507 = 0;
        class130.field2320 = 0;
        field4034 = 0;
        class250.field4387 = 0;
        class109.field1815 = 0;
        class66.field1111 = 0;
        class36.field653 = 0;
        class214.field3671 = 0;
        class52.field848 = 0;
        class178.field3089 = 0;
        class253.field4422 = 0;
        class220.field3784 = 0;
        class25.field447 = 0;
        class248.field4336 = 0;
        class192.field3375 = 0;
        class133.field2362 = 0;
        class89.field1443 = 0;
        class54.field876 = 0;
        class109.field1808 = 0;
        class220.field3780 = 0;
        class131.field2328 = 0;
        class97.field1544 = 0;
        class164.field2885 = 0;
        class61.field983 = 0;
        class25.field459 = 0;
        class257.field4545 = 0;
        class25.field460 = 0;
        class103.field1710 = 0;
        class227.field3921 = 0;
        client.field2687 = 0;
        class98.field1576 = 0;
        class224.field3875 = 0;
        class90.field1455 = 0;
        class23.field419 = 0;
        class124.field2168 = 0;
        class25.field478 = 0;
        class233.field4059 = 0;
        class49.field816 = 0;
        class168.field2939 = 0;
        class86.field1404 = 0;
        class93.field1515 = 0;
        class1.field22 = 0;
        class255.field4467 = 0;
        class205.field3571 = 0;
        class118.field2111 = 0;
        class130.field2296 = 0;
        class154.field2661 = 0;
        class47.field785 = 0;
        client.field2684 = 0;
        class86.field1420 = 0;
        class255.field4460 = 0;
        class193.field3409 = 0;
        class18.field339 = 0;
        class226.field3902 = 0;
        class46.field752 = 0;
        class280.field4904 = 0;
        class249.field4373 = 0;
        class61.field982 = 0;
        class120.field2131 = 0;
        class209.field3604 = 0;
        class194.field3420 = 0;
        class181.field3160 = 0;
        class65.field1091 = 0;
        class126.field2210 = 0;
        class268.field4701 = 0;
        class64.field1048 = 0;
        class1.field21 = 0;
        class132.field2346 = 0;
        class264.field4649 = 0;
        class250.field4390 = 0;
        class243.field4272 = 0;
        class97.field1542 = 0;
        class2.field87 = 0;
        class116.field2094 = 0;
        class253.field4425 = 0;
        class101.field1649 = 0;
        class61.field992 = 0;
        class187.field3271 = 0;
        class65.field1087 = 0;
        class83.field1371 = 0;
        class282.field4963 = 0;
        class277.field4831 = 0;
        class130.field2314 = 0;
        class9.field200 = 0;
        class209.field3600 = 0;
        class66.field1098 = 0;
        class271.field4738 = 0;
        class155.field2717 = 0;
        class183.field3227 = 0;
        class9.field210 = 0;
        class230.field3990 = 0;
        class183.field3214 = 0;
        class40.field693 = 0;
        class278.field4871 = 0;
        class144.field2522 = 0;
        class9.field205 = 0;
        class250.field4383 = 0;
        class107.field1772 = 0;
        class25.field502 = 0;
        class180.field3132 = 0;
        class145.field2536 = 0;
        class50.field820 = 0;
        class187.field3279 = 0;
        class257.field4549 = 0;
        class280.field4895 = 0;
        class191.field3337 = 0;
        class21.field377 = 0;
        class230.field3977 = 0;
        class28.field524 = 0;
        class175.field3036 = 0;
        class25.field457 = 0;
        class31.field586 = 0;
        class240.field4199 = 0;
        class150.field2593 = 0;
        class109.field1793 = 0;
        class158.field2767 = 0;
        class271.field4740 = 0;
        class9.field204 = 0;
        class219.field3752 = 0;
        class157.field2753 = 0;
        class54.field877 = 0;
        class253.field4429 = 0;
        class131.field2326 = 0;
        class244.field4297 = 0;
        class47.field778 = 0;
        class106.field1759 = 0;
        class255.field4525 = 0;
        class226.field3895 = 0;
        class173.field3013 = 0;
        class109.field1809 = 0;
        class19.field345 = 0;
        class97.field1550 = 0;
        class126.field2200 = 0;
        class112.field1854 = 0;
        class25.field469 = 0;
        class140.field2437 = 0;
        class61.field990 = 0;
        class78.field1260 = 0;
        class260.field4605 = 0;
        class94.field1519 = 0;
        class7.field138 = 0;
        class83.field1357 = 0;
        class78.field1269 = 0;
        class136.field2390 = 0;
        class129.field2245 = 0;
        class188.field3299 = 0;
        class180.field3121 = 0;
        class199.field3491 = 0;
        class99.field1599 = 0;
        class269.field4724 = 0;
        class191.field3344 = 0;
        class47.field777 = 0;
        class56.field913 = 0;
        class38.field676 = 0;
        class9.field203 = 0;
        class25.field498 = 0;
        class61.field984 = 0;
        class280.field4912 = 0;
        class154.field2663 = 0;
        client.field2690 = 0;
        class83.field1387 = 0;
        class279.field4889 = 0;
        class224.field3873 = 0;
        class61.field998 = 0;
        class90.field1469 = 0;
        class234.field4090 = 0;
        class113.field1989 = 0;
        class126.field2198 = 0;
        class23.field432 = 0;
        class244.field4294 = 0;
        class25.field480 = 0;
        class57.field919 = 0;
        class13.field265 = 0;
        class25.field466 = 0;
        class142.field2453 = 0;
        class19.field354 = 0;
        class193.field3411 = 0;
        class150.field2598 = 0;
        class280.field4890 = 0;
        class19.field360 = 0;
        class176.field3052 = 0;
        class130.field2261 = 0;
        class222.field3856 = 0;
        class9.field198 = 0;
        class280.field4945 = 0;
        class246.field4334 = 0;
        class1.field67 = 0;
        class184.field3235 = 0;
        class57.field921 = 0;
        class74.field1221 = 0;
        class191.field3339 = 0;
        class255.field4508 = 0;
        class112.field1844 = 0;
        class280.field4914 = 0;
        class180.field3136 = 0;
        class16.field297 = 0;
        class19.field343 = 0;
        class102.field1685 = 0;
        class53.field863 = 0;
        class275.field4773 = 0;
        class269.field4723 = 0;
        class220.field3767 = 0;
        class275.field4772 = 0;
        class226.field3897 = 0;
        class53.field868 = 0;
        class158.field2761 = 0;
        class240.field4202 = 0;
        class109.field1800 = 0;
        class30.field567 = 0;
        class249.field4352 = 0;
        class250.field4386 = 0;
        class149.field2582 = 0;
        class283.field4970 = 0;
        class182.field3189 = 0;
        class242.field4254 = 0;
        class263.field4643 = 0;
        class41.field699 = 0;
        class180.field3140 = 0;
        class59.field959 = 0;
        class50.field823 = 0;
        class267.field4686 = 0;
        class113.field2031 = 0;
        class25.field446 = 0;
        class48.field790 = 0;
        class9.field192 = 0;
        class215.field3710 = 0;
        class165.field2888 = 0;
        class221.field3842 = 0;
        class62.field999 = 0;
        class259.field4585 = 0;
        class25.field500 = 0;
        class280.field4933 = 0;
        class92.field1500 = 0;
        class192.field3392 = 0;
        class8.field160 = 0;
        class159.field2783 = 0;
        class207.field3584 = 0;
        class157.field2738 = 0;
        class242.field4260 = 0;
        class280.field4927 = 0;
        class180.field3138 = 0;
        class280.field4910 = 0;
        class19.field353 = 0;
        class280.field4917 = 0;
        class280.field4932 = 0;
        class43.field718 = 0;
        class30.field568 = 0;
        class220.field3758 = 0;
        class279.field4882 = 0;
        class27.field512 = 0;
        class117.field2109 = 0;
        class275.field4776 = 0;
        class180.field3152 = 0;
        class267.field4699 = 0;
        class19.field351 = 0;
        class94.field1526 = 0;
        class104.field1730 = 0;
        class150.field2604 = 0;
        class90.field1453 = 0;
        class180.field3156 = 0;
        class58.field944 = 0;
        class180.field3133 = 0;
        class282.field4957 = 0;
        class283.field4984 = 0;
        class64.field1078 = 0;
        class109.field1816 = 0;
        class192.field3357 = 0;
        class180.field3117 = 0;
        class267.field4698 = 0;
        class1.field31 = 0;
        class231.field4027 = 0;
        class199.field3489 = 0;
        class177.field3074 = 0;
        class99.field1616 = 0;
        class180.field3153 = 0;
        class104.field1727 = 0;
        class169.field2950 = 0;
        class44.field735 = 0;
        class228.field3953 = 0;
        class180.field3145 = 0;
        class25.field461 = 0;
        class98.field1584 = 0;
        class175.field3040 = 0;
        class43.field724 = 0;
        class280.field4939 = 0;
        class47.field786 = 0;
        client.field2683 = 0;
        class29.field543 = 0;
        class265.field4671 = 0;
        class62.field1019 = 0;
        class142.field2510 = 0;
        class136.field2401 = 0;
        class96.field1536 = 0;
        class32.field594 = 0;
        class99.field1614 = 0;
        class93.field1511 = 0;
        class1.field30 = 0;
        class83.field1360 = 0;
        class178.field3093 = 0;
        class220.field3760 = 0;
        class133.field2364 = 0;
        class142.field2488 = 0;
        class83.field1358 = 0;
        class94.field1529 = 0;
        class107.field1771 = 0;
        class61.field979 = 0;
        class73.field1201 = 0;
        class150.field2587 = 0;
        class230.field3998 = 0;
        class92.field1490 = 0;
        class37.field661 = 0;
        class159.field2775 = 0;
        class44.field734 = 0;
        class163.field2871 = 0;
        class89.field1445 = 0;
        class25.field474 = 0;
        class140.field2429 = 0;
        class65.field1085 = 0;
        class33.field607 = 0;
        class197.field3454 = 0;
        class262.field4638 = 0;
        class25.field501 = 0;
        class48.field787 = 0;
        class89.field1448 = 0;
        class31.field580 = 0;
        field4045 = 0;
        client.field2681 = 0;
        class176.field3066 = 0;
        class25.field494 = 0;
        class199.field3486 = 0;
        class180.field3125 = 0;
        class27.field522 = 0;
        class184.field3245 = 0;
        class235.field4094 = 0;
        class109.field1821 = 0;
        class27.field519 = 0;
        class41.field702 = 0;
        class153.field2647 = 0;
        class112.field1847 = 0;
        class278.field4867 = 0;
        class24.field436 = 0;
        class280.field4936 = 0;
        class25.field451 = 0;
        class126.field2208 = 0;
        class176.field3054 = 0;
        class34.field629 = 0;
        class159.field2779 = 0;
        class41.field703 = 0;
        class251.field4397 = 0;
        class193.field3404 = 0L;
        class252.field4400.field2158 = 0;
        class31.field578 = true;
        class199.method1365((byte) 30);
        class258.field4578 = -1;
        class230.field3974 = 0;
        class4.field117 = -1;
        class34.field627.field481 = 0;
        class85.field1394 = -1;
        class276.field4785 = 0;
        class20.field367.field481 = 0;
        class252.field4406 = 0;
        class125.field2193 = -1;
        for (int var1 = 0; var1 < class81.field1335.length; ++var1) {
            class81.field1335[var1] = null;
        }
        class31.field582 = false;
        class157.field2745 = 0;
        class262.method1771(110, 0);
        for (int var2 = 0; var2 < 100; ++var2) {
            class27.field521[var2] = null;
        }
        class107.field1767 = 0;
        class79.field1304 = 0;
        class273.field4756 = (int) (120.0D * Math.random()) + -60;
        class120.field2134 = (int) (Math.random() * 100.0D) - 50;
        class205.field3554 = 0;
        class209.field3599 = 0;
        class25.field487 = 2047 & -10 + (int) (Math.random() * 20.0D);
        class130.field2295 = -1;
        class205.field3563 = 0;
        class263.field4647 = false;
        class73.field1204 = 0;
        class142.field2461 = -20 + (int) (30.0D * Math.random());
        class210.field3615 = (int) (80.0D * Math.random()) - 40;
        class277.field4847 = -55 + (int) (Math.random() * 110.0D);
        class112.field1845 = 0;
        class112.field1836 = 0;
        for (int var3 = 0; ~var3 > -2049; ++var3) {
            class280.field4940[var3] = null;
            class92.field1486[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; ++var4) {
            class46.field756[var4] = null;
        }
        class262.field4631 = class280.field4940[2047] = new class142();
        class230.field4009.method639(12);
        class211.field3636.method639(93);
        for (int var5 = 0; ~var5 > -5; ++var5) {
            for (int var12 = 0; var12 < 104; ++var12) {
                for (int var13 = 0; var13 < 104; ++var13) {
                    class165.field2896[var5][var12][var13] = null;
                }
            }
        }
        class224.field3880 = new class90();
        class86.field1406 = 0;
        class208.field3590 = 0;
        class8.method80(true);
        class240.method1634(-121);
        class16.field304 = 0;
        class152.field2625 = 0;
        class212.field3648 = 0;
        class187.field3269 = 0;
        class97.field1560 = 0;
        class24.field435 = 0;
        class144.field2520 = 0;
        class275.field4779 = 0;
        class226.field3900 = 0;
        class82.field1356 = 0;
        for (int var6 = 0; ~class262.field4621.length < ~var6; ++var6) {
            class262.field4621[var6] = -1;
        }
        if (~class246.field4315 != 0) {
            class94.method664((byte) -62, class246.field4315);
        }
        for (class144 var7 = (class144) class261.field4614.method142(true); var7 != null; var7 = (class144) class261.field4614.method143((byte) -123)) {
            class16.method127((byte) -126, var7, true);
        }
        class246.field4315 = -1;
        class261.field4614 = new class19(8);
        class178.method1226((byte) 83);
        class180.field3157 = null;
        class31.field582 = false;
        class157.field2745 = 0;
        client.field2689.method1214(-1, false, new int[5], (int[]) null, (byte) 120);
        for (int var8 = 0; ~var8 > -9; ++var8) {
            class176.field3068[var8] = null;
            class81.field1336[var8] = false;
            class98.field1589[var8] = -1;
        }
        class125.method867(true);
        class28.field528 = true;
        for (int var9 = 0; ~var9 > -101; ++var9) {
            class207.field3583[var9] = true;
        }
        class59.field950 = null;
        class231.field4030 = null;
        class215.field3716 = 0;
        for (int var10 = 0; var10 < 6; ++var10) {
            class244.field4296[var10] = new class262();
        }
        for (int var11 = 0; ~var11 > -26; ++var11) {
            class157.field2733[var11] = 0;
            class259.field4589[var11] = 0;
            class46.field758[var11] = 0;
        }
        class125.field2195 = class8.field187 = class120.field2139 = class263.field4641 = new short[256];
        class112.field1837 = true;
        class238.field4128 = 0;
        class18.field337 = class167.field2933;
        class197.field3442 = false;
        class21.method167(Integer.MAX_VALUE);
        class148.field2567 = false;
        method1565(arg0 ^ 51);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IILlj;)V")
    public final void method49(int arg0, int arg1, class25 arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (arg1 == 6) {
                                    this.field4032 = arg2.method189((byte) -103);
                                }
                            } else {
                                this.field4044 = arg2.method189((byte) -103);
                            }
                        } else {
                            this.field4042 = arg2.method189((byte) -103);
                        }
                    } else {
                        this.field4031 = arg2.method189((byte) -103);
                    }
                } else {
                    this.field4036 = arg2.method193((byte) 77);
                }
            } else {
                this.field4043 = arg2.method189((byte) -103);
            }
        } else {
            this.field4044 = this.field4032 = arg2.method189((byte) -103);
        }
        ++field4034;
        if (arg0 > -119) {
            method1562(-70);
        }
    }

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "(I)V")
    public final void method111(int arg0) {
        this.field4037 = class259.method1754(106, this.field4043);
        ++field4041;
        this.method1564(103);
        if (arg0 <= 122) {
            field4055 = null;
        }
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "()V")
    public class232() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Llf;")
    public static final class209 method1563(Throwable arg0, String arg1) {
        ++field4038;
        class209 var2;
        if (!(arg0 instanceof class209)) {
            var2 = new class209(arg0, arg1);
        } else {
            var2 = (class209) arg0;
            var2.field3605 = var2.field3605 + ' ' + arg1;
        }
        return var2;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)[I")
    public final int[] method54(int arg0, int arg1) {
        int var3 = -122 % ((73 - arg1) / 41);
        ++field4035;
        int[] var4 = super.field4251.method1417((byte) 78, arg0);
        if (super.field4251.field3655) {
            int var5 = class117.field2106[arg0] * this.field4032 + 2048;
            int var6 = var5 >> 12;
            int var7 = var6 + 1;
            for (int var8 = 0; var8 < class264.field4654; ++var8) {
                class85.field1390 = Integer.MAX_VALUE;
                class53.field871 = Integer.MAX_VALUE;
                class243.field4282 = Integer.MAX_VALUE;
                class197.field3449 = Integer.MAX_VALUE;
                int var9 = class102.field1701[var8] * this.field4044 + 2048;
                int var10 = var9 >> 12;
                int var11 = var10 + 1;
                for (int var12 = var6 + -1; ~var12 >= ~var7; ++var12) {
                    int var14 = this.field4037[(~this.field4032 >= ~var12 ? -this.field4032 + var12 : var12) & 255] & 255;
                    for (int var15 = var10 + -1; ~var11 <= ~var15; ++var15) {
                        int var16 = (this.field4037[(var15 < this.field4044 ? var15 : -this.field4044 + var15) + var14 & 255] & 255) * 2;
                        int var28 = var16 + 1;
                        int var17 = -this.field4047[var16] + -(var15 << 12) + var9;
                        int var18 = -(var12 << 12) + -this.field4047[var28] + var5;
                        int var19 = this.field4042;
                        int var20;
                        if (~var19 != -2) {
                            if (~var19 != -4) {
                                if (~var19 != -5) {
                                    if (~var19 != -6) {
                                        if (~var19 == -3) {
                                            var20 = (~var18 > -1 ? -var18 : var18) + (~var17 <= -1 ? var17 : -var17);
                                        } else {
                                            var20 = (int) (4096.0D * Math.sqrt((double) ((float) (var17 * var17 + var18 * var18) / 1.6777216E7F)));
                                        }
                                    } else {
                                        int var21 = var18 * var18;
                                        int var22 = var17 * var17;
                                        var20 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var21 + var22) / 1.6777216E7F))) * 4096.0D);
                                    }
                                } else {
                                    int var23 = (int) (Math.sqrt((double) ((float) (~var17 <= -1 ? var17 : -var17) / 4096.0F)) * 4096.0D);
                                    int var24 = (int) (4096.0D * Math.sqrt((double) ((float) (var18 < 0 ? -var18 : var18) / 4096.0F)));
                                    int var25 = var23 - -var24;
                                    var20 = var25 * var25 >> 12;
                                }
                            } else {
                                int var26 = var18 < 0 ? -var18 : var18;
                                int var27 = var17 >= 0 ? var17 : -var17;
                                var20 = ~var26 <= ~var27 ? var26 : var27;
                            }
                        } else {
                            var20 = var17 * var17 - -(var18 * var18) >> 12;
                        }
                        if (var20 >= class197.field3449) {
                            if (~var20 > ~class243.field4282) {
                                class85.field1390 = class53.field871;
                                class53.field871 = class243.field4282;
                                class243.field4282 = var20;
                            } else if (class53.field871 <= var20) {
                                if (class85.field1390 > var20) {
                                    class85.field1390 = var20;
                                }
                            } else {
                                class85.field1390 = class53.field871;
                                class53.field871 = var20;
                            }
                        } else {
                            class85.field1390 = class53.field871;
                            class53.field871 = class243.field4282;
                            class243.field4282 = class197.field3449;
                            class197.field3449 = var20;
                        }
                    }
                }
                int var13 = this.field4031;
                if (~var13 != -1) {
                    if (~var13 != -2) {
                        if (var13 != 3) {
                            if (var13 != 4) {
                                if (~var13 == -3) {
                                    var4[var8] = -class197.field3449 + class243.field4282;
                                }
                            } else {
                                var4[var8] = class85.field1390;
                            }
                        } else {
                            var4[var8] = class53.field871;
                        }
                    } else {
                        var4[var8] = class243.field4282;
                    }
                } else {
                    var4[var8] = class197.field3449;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "(I)V")
    private final void method1564(int arg0) {
        ++field4045;
        Random var2 = new Random((long) this.field4043);
        this.field4047 = new short[512];
        if (arg0 <= 22) {
            this.field4042 = 20;
        }
        if (this.field4036 > 0) {
            for (int var3 = 0; var3 < 512; ++var3) {
                this.field4047[var3] = (short) class47.method352(1, var2, this.field4036);
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "(I)V")
    public static final void method1565(int arg0) {
        ++class246.field4311;
        class34.field627.method551(arg0, true);
        class34.field627.method227(arg0 ^ -20450, class210.method1410(0));
        class34.field627.method214(-3, class190.field3328);
        ++field4048;
        class34.field627.method214(-3, class103.field1724);
        class34.field627.method227(-20435, class128.field2234);
    }
}
