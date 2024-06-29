import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class20 extends class182 {

    @OriginalMember(owner = "client!bh", name = "M", descriptor = "I")
    private int field546 = 128;

    @OriginalMember(owner = "client!bh", name = "J", descriptor = "I")
    private int field543 = 128;

    @OriginalMember(owner = "client!bh", name = "R", descriptor = "I")
    private int field551 = 0;

    @OriginalMember(owner = "client!bh", name = "K", descriptor = "I")
    public int field544 = -1;

    @OriginalMember(owner = "client!bh", name = "O", descriptor = "Z")
    public boolean field548 = false;

    @OriginalMember(owner = "client!bh", name = "bb", descriptor = "I")
    private int field561 = 0;

    @OriginalMember(owner = "client!bh", name = "W", descriptor = "I")
    private int field556 = 0;

    @OriginalMember(owner = "client!bh", name = "V", descriptor = "I")
    public static int field555 = 0;

    @OriginalMember(owner = "client!bh", name = "U", descriptor = "I")
    public static int field554 = 0;

    @OriginalMember(owner = "client!bh", name = "X", descriptor = "Lkh;")
    public static class117 field557 = class224.method1450((byte) 115, ")4l");

    @OriginalMember(owner = "client!bh", name = "L", descriptor = "I")
    public static int field545;

    @OriginalMember(owner = "client!bh", name = "N", descriptor = "I")
    public static int field547;

    @OriginalMember(owner = "client!bh", name = "P", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!bh", name = "S", descriptor = "I")
    private int field552;

    @OriginalMember(owner = "client!bh", name = "T", descriptor = "I")
    public static int field553;

    @OriginalMember(owner = "client!bh", name = "Y", descriptor = "I")
    public static int field558;

    @OriginalMember(owner = "client!bh", name = "cb", descriptor = "I")
    public int field562;

    @OriginalMember(owner = "client!bh", name = "I", descriptor = "[S")
    private short[] field542;

    @OriginalMember(owner = "client!bh", name = "Q", descriptor = "[S")
    private short[] field550;

    @OriginalMember(owner = "client!bh", name = "Z", descriptor = "[S")
    private short[] field559;

    @OriginalMember(owner = "client!bh", name = "ab", descriptor = "[S")
    private short[] field560;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lnc;I)V")
    public final void method176(class145 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method998(117);
            if (var3 == 0) {
                if (arg1 != 0) {
                    this.method177(29, -107);
                }
                field553++;
                return;
            }
            this.method179(var3, arg1 ^ 0x75, arg0);
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)Lcf;")
    public final class29 method177(int arg0, int arg1) {
        field547++;
        class29 var3 = (class29) class136.field2443.method412(arg1 ^ 0x2A, (long) this.field562);
        if (var3 == null) {
            class15 var4 = class15.method143(class196.field3527, this.field552, 0);
            if (var4 == null) {
                return null;
            }
            if (this.field550 != null) {
                for (int var5 = 0; var5 < this.field550.length; var5++) {
                    var4.method144(this.field550[var5], this.field559[var5]);
                }
            }
            if (this.field542 != null) {
                for (int var6 = 0; var6 < this.field542.length; var6++) {
                    var4.method151(this.field542[var6], this.field560[var6]);
                }
            }
            var3 = var4.method159(this.field551 + 64, this.field556 + 850, -30, -50, -30);
            class136.field2443.method408((byte) -57, var3, (long) this.field562);
        }
        class29 var7;
        if (this.field544 == -1 || arg0 == -1) {
            var7 = var3.method250(true, true);
        } else {
            var7 = class81.method555(this.field544, (byte) -80).method1213(arg0, -65, var3);
        }
        if (this.field546 != 128 || this.field543 != 128) {
            var7.method247(this.field546, this.field543, this.field546);
        }
        if (this.field561 != 0) {
            if (this.field561 == 90) {
                var7.method252();
            }
            if (this.field561 == 180) {
                var7.method259();
            }
            if (this.field561 == 270) {
                var7.method255();
            }
        }
        return arg1 == 90 ? var7 : null;
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)V")
    public static void method178(int arg0) {
        field557 = null;
        if (arg0 < 125) {
            method178(10);
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IILnc;)V")
    private final void method179(int arg0, int arg1, class145 arg2) {
        field558++;
        if (arg0 == 1) {
            this.field552 = arg2.method1049((byte) 114);
        } else if (arg0 == 2) {
            this.field544 = arg2.method1049((byte) 100);
        } else if (arg0 == 4) {
            this.field546 = arg2.method1049((byte) 98);
        } else if (arg0 == 5) {
            this.field543 = arg2.method1049((byte) 88);
        } else if (arg0 == 6) {
            this.field561 = arg2.method1049((byte) 123);
        } else if (arg0 == 7) {
            this.field551 = arg2.method998(106);
        } else if (arg0 == 8) {
            this.field556 = arg2.method998(72);
        } else if (arg0 == 9) {
            this.field548 = true;
        } else if (arg0 == 40) {
            int var4 = arg2.method998(68);
            this.field559 = new short[var4];
            this.field550 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field550[var5] = (short) arg2.method1049((byte) 107);
                this.field559[var5] = (short) arg2.method1049((byte) 115);
            }
        } else if (arg0 == 41) {
            int var6 = arg2.method998(80);
            this.field542 = new short[var6];
            this.field560 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field542[var7] = (short) arg2.method1049((byte) 123);
                this.field560[var7] = (short) arg2.method1049((byte) 115);
            }
        }
        int var8 = -94 / ((36 - arg1) / 43);
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(I)V")
    public static final void method180(int arg0) {
        class228.field4106 = true;
        class170.field3051 = true;
        class203.field3665.field806 = 0;
        class158.field2869 = 0L;
        field545++;
        class101.field1848 = 0;
        class10.field329 = 0;
        class246.field4529 = 0;
        class154.field2756 = 0;
        class25.field631 = 0;
        class25.field634 = 0;
        client.field783 = 0;
        class140.field2548 = 0;
        class211.field3805 = 0;
        class10.field355 = 0;
        class232.field4175 = 0;
        class12.field383 = 0;
        class176.field3187 = 0;
        class184.field3303 = 0;
        class232.field4171 = 0;
        class234.field4219 = 0;
        class9.field264 = 0;
        class76.field1440 = 0;
        class213.field3865 = 0;
        class216.field3926 = 0;
        class243.field4483 = 0;
        class141.field2564 = 0;
        class36.field837 = 0;
        class145.field2647 = 0;
        class147.field2689 = 0;
        class94.field1727 = 0;
        class3.field33 = 0;
        class158.field2872 = 0;
        class82.field1558 = 0;
        class84.field1589 = 0;
        class140.field2550 = 0;
        class230.field4141 = 0;
        class111.field2082 = 0;
        class10.field330 = 0;
        class45.field984 = 0;
        class33.field772 = 0;
        client.field788 = 0;
        class190.field3391 = 0;
        class169.field3044 = 0;
        class243.field4476 = 0;
        class145.field2673 = 0;
        class211.field3820 = 0;
        class145.field2645 = 0;
        class18.field516 = 0;
        class9.field147 = 0;
        class199.field3601 = 0;
        class180.field3253 = 0;
        class14.field437 = 0;
        class171.field3087 = 0;
        class25.field618 = 0;
        class198.field3547 = 0;
        class98.field1802 = 0;
        class9.field238 = 0;
        class5.field66 = 0;
        class84.field1590 = 0;
        class66.field1270 = 0;
        class201.field3643 = 0;
        class147.field2698 = 0;
        class211.field3808 = 0;
        class17.field501 = 0;
        class234.field4240 = 0;
        class145.field2668 = 0;
        class231.field4150 = 0;
        class175.field3165 = 0;
        class145.field2620 = 0;
        class158.field2888 = 0;
        class158.field2875 = 0;
        class167.field3017 = 0;
        class111.field2084 = 0;
        class190.field3371 = 0;
        class36.field829 = 0;
        class74.field1399 = 0;
        class162.field2968 = 0;
        class167.field3032 = 0;
        class169.field3040 = 0;
        class104.field1894 = 0;
        class117.field2209 = 0;
        class145.field2663 = 0;
        class225.field4053 = 0;
        class145.field2662 = 0;
        class218.field3967 = 0;
        class119.field2261 = 0;
        class205.field3697 = 0;
        class69.field1334 = 0;
        class212.field3845 = 0;
        class194.field3459 = 0;
        class145.field2611 = 0;
        class45.field972 = 0;
        class243.field4422 = 0;
        class145.field2621 = 0;
        class148.field2707 = 0;
        class199.field3565 = 0;
        class171.field3084 = 0;
        class105.field1910 = 0;
        class10.field348 = 0;
        class69.field1331 = 0;
        class228.field4113 = 0;
        class5.field82 = 0;
        class100.field1836 = 0;
        class50.field1040 = 0;
        class209.field3754 = 0;
        class159.field2904 = 0;
        class201.field3649 = 0;
        class101.field1837 = 0;
        class120.field2265 = 0;
        class234.field4228 = 0;
        class217.field3940 = 0;
        client.field775 = 0;
        class81.field1511 = 0;
        class9.field159 = 0;
        class161.field2956 = 0;
        class145.field2624 = 0;
        class160.field2924 = 0;
        class170.field3055 = 0;
        class243.field4395 = 0;
        class26.field658 = 0;
        class211.field3774 = 0;
        class154.field2821 = 0;
        class194.field3460 = 0;
        class247.field4545 = 0;
        class119.field2237 = 0;
        class76.field1437 = 0;
        class9.field285 = 0;
        class137.field2473 = 0;
        class214.field3891 = 0;
        class33.field769 = 0;
        class117.field2208 = 0;
        class49.field1018 = 0;
        class225.field4050 = 0;
        class174.field3146 = 0;
        class177.field3201 = 0;
        class48.field1014 = 0;
        class136.field2445 = 0;
        class232.field4174 = 0;
        class230.field4147 = 0;
        class226.field4073 = 0;
        class52.field1075 = 0;
        class117.field2210 = 0;
        class23.field592 = 0;
        class28.field680 = 0;
        class9.field228 = 0;
        class180.field3255 = 0;
        class198.field3545 = 0;
        class145.field2627 = 0;
        class139.field2531 = 0;
        class211.field3797 = 0;
        class23.field579 = 0;
        class145.field2644 = 0;
        class243.field4449 = 0;
        class76.field1463 = 0;
        class102.field1857 = 0;
        class74.field1400 = 0;
        class154.field2766 = 0;
        class145.field2650 = 0;
        class215.field3897 = 0;
        class117.field2207 = 0;
        class232.field4167 = 0;
        client.field779 = 0;
        class8.field137 = 0;
        class145.field2615 = 0;
        class154.field2797 = 0;
        class145.field2616 = 0;
        class143.field2595 = 0;
        class56.field1150 = 0;
        class117.field2205 = 0;
        class199.field3591 = 0;
        class4.field55 = 0;
        class151.field2740 = 0;
        class8.field145 = 0;
        class94.field1716 = 0;
        class43.field955 = 0;
        class211.field3771 = 0;
        class32.field753 = 0;
        class243.field4392 = 0;
        class157.field2860 = 0;
        class10.field320 = 0;
        class145.field2646 = 0;
        class140.field2554 = 0;
        class230.field4133 = 0;
        class234.field4279 = 0;
        class233.field4192 = 0;
        class19.field533 = 0;
        class109.field2030 = 0;
        class221.field3987 = 0;
        class111.field2090 = 0;
        class60.field1209 = 0;
        class18.field518 = 0;
        class74.field1411 = 0;
        class211.field3791 = 0;
        class96.field1762 = 0;
        class161.field2935 = 0;
        class36.field838 = 0;
        class160.field2928 = 0;
        class229.field4120 = 0;
        class71.field1361 = 0;
        class86.field1627 = 0;
        class79.field1491 = 0;
        class52.field1069 = 0;
        class200.field3614 = 0;
        class167.field3028 = 0;
        class199.field3566 = 0;
        class108.field1999 = 0;
        class233.field4189 = 0;
        class96.field1763 = 0;
        class184.field3307 = 0;
        class147.field2690 = 0;
        class234.field4268 = 0;
        class38.field881 = 0;
        class45.field990 = 0;
        class86.field1616 = 0;
        class10.field310 = 0;
        class104.field1893 = 0;
        class204.field3684 = 0;
        class199.field3592 = 0;
        class122.field2297 = 0;
        class211.field3779 = 0;
        class231.field4152 = 0;
        class11.field367 = 0;
        class199.field3580 = 0;
        class128.field2376 = 0;
        class101.field1840 = 0;
        class4.field51 = 0;
        class117.field2192 = 0;
        class231.field4155 = 0;
        class136.field2448 = 0;
        class165.field2978 = 0;
        class10.field337 = 0;
        class222.field4009 = 0;
        class159.field2907 = 0;
        class145.field2607 = 0;
        class246.field4535 = 0;
        class145.field2658 = 0;
        class109.field2021 = 0;
        class108.field2006 = 0;
        class38.field875 = 0;
        class193.field3453 = 0;
        class149.field2710 = 0;
        class31.field743 = 0;
        class145.field2676 = 0;
        class156.field2842 = 0;
        class136.field2442 = 0;
        class39.field892 = 0;
        class145.field2639 = 0;
        class94.field1722 = 0;
        class217.field3941 = 0;
        class137.field2480 = 0;
        class226.field4076 = 0;
        class112.field2102 = 0;
        class72.field1383 = 0;
        class243.field4415 = 0;
        class75.field1419 = 0;
        class75.field1426 = 0;
        class45.field983 = 0;
        class117.field2160 = 0;
        class21.field563 = 0;
        class71.field1367 = 0;
        class120.field2270 = 0;
        class145.field2651 = 0;
        class49.field1021 = 0;
        class178.field3229 = 0;
        class77.field1475 = 0;
        class145.field2635 = 0;
        class136.field2447 = 0;
        class200.field3610 = 0;
        class97.field1774 = 0;
        class39.field887 = 0;
        class179.field3236 = 0;
        class48.field1007 = 0;
        class36.field823 = 0;
        class77.field1472 = 0;
        class154.field2786 = 0;
        class127.field2360 = 0;
        class117.field2200 = 0;
        class3.field43 = 0;
        class57.field1172 = 0;
        class104.field1899 = 0;
        class38.field871 = 0;
        class143.field2600 = 0;
        class218.field3959 = 0;
        class94.field1717 = 0;
        class119.field2255 = 0;
        class244.field4498 = 0;
        class13.field424 = 0;
        class102.field1856 = 0;
        class243.field4446 = 0;
        class204.field3689 = 0;
        class159.field2895 = 0;
        class76.field1448 = 0;
        class179.field3233 = 0;
        client.field789 = 0;
        class145.field2671 = 0;
        class122.field2289 = 0;
        class76.field1455 = 0;
        class117.field2215 = 0;
        class143.field2593 = 0;
        class221.field3985 = 0;
        class203.field3664 = 0;
        class52.field1062 = 0;
        class5.field77 = 0;
        client.field786 = 0;
        class10.field324 = 0;
        class117.field2154 = 0;
        class39.field891 = 0;
        class199.field3583 = 0;
        class55.field1119 = 0;
        class4.field59 = 0;
        class117.field2223 = 0;
        class174.field3134 = 0;
        class217.field3944 = 0;
        client.field787 = 0;
        class56.field1154 = 0;
        class211.field3800 = 0;
        class190.field3362 = 0;
        class208.field3735 = 0;
        class117.field2167 = 0;
        class231.field4158 = 0;
        class48.field1011 = 0;
        class145.field2609 = 0;
        class117.field2193 = 0;
        class117.field2212 = 0;
        class145.field2642 = 0;
        class76.field1452 = 0;
        class84.field1587 = 0;
        class243.field4425 = 0;
        class180.field3252 = 0;
        class41.field928 = 0;
        field545 = 0;
        class243.field4440 = 0;
        class96.field1757 = 0;
        class216.field3922 = 0;
        class54.field1114 = 0;
        class199.field3567 = 0;
        class48.field1013 = 0;
        class100.field1822 = 0;
        class240.field4342 = 0;
        class117.field2163 = 0;
        class109.field2022 = 0;
        class145.field2638 = 0;
        class158.field2871 = 0;
        class14.field434 = 0;
        class154.field2802 = 0;
        class136.field2441 = 0;
        class99.field1818 = 0;
        class26.field651 = 0;
        class3.field28 = 0;
        class117.field2183 = 0;
        class3.field44 = 0;
        class127.field2349 = 0;
        class37.field845 = 0;
        class233.field4195 = 0;
        class155.field2831 = 0;
        class54.field1105 = 0;
        field558 = 0;
        class207.field3719 = 0;
        class243.field4431 = 0;
        class75.field1420 = 0;
        class70.field1353 = 0;
        class111.field2080 = 0;
        class3.field23 = 0;
        class53.field1083 = 0;
        class73.field1392 = 0;
        class233.field4203 = 0;
        class43.field954 = 0;
        class25.field630 = 0;
        class14.field432 = 0;
        class24.field605 = 0;
        class67.field1296 = 0;
        class216.field3925 = 0;
        class199.field3578 = 0;
        class1.field13 = 0;
        class156.field2834 = 0;
        class211.field3787 = 0;
        class74.field1405 = 0;
        class178.field3223 = 0;
        class247.field4544 = 0;
        class6.field89 = 0;
        class31.field726 = 0;
        class139.field2541 = 0;
        class120.field2276 = 0;
        class227.field4089 = 0;
        class54.field1111 = 0;
        class173.field3119 = 0;
        class99.field1814 = 0;
        class213.field3875 = 0;
        class199.field3589 = 0;
        class10.field315 = 0;
        class6.field88 = 0;
        class171.field3085 = 0;
        class161.field2945 = 0;
        class221.field3996 = 0;
        class232.field4165 = 0;
        class210.field3766 = 0;
        class243.field4477 = 0;
        class161.field2949 = 0;
        class52.field1059 = 0;
        class70.field1341 = 0;
        class41.field927 = 0;
        class36.field835 = 0;
        class5.field68 = 0;
        class62.field1239 = 0;
        class57.field1173 = 0;
        class49.field1023 = 0;
        class174.field3142 = 0;
        class61.field1221 = 0;
        class50.field1042 = 0;
        class100.field1831 = 0;
        class25.field626 = 0;
        class12.field394 = 0;
        class165.field2990 = 0;
        class130.field2391 = 0;
        class155.field2827 = 0;
        class23.field585 = 0;
        class32.field749 = 0;
        class58.field1198 = 0;
        class117.field2194 = 0;
        class4.field48 = 0;
        class145.field2614 = 0;
        class162.field2958 = 0;
        class50.field1041 = 0;
        class88.field1640 = 0;
        class58.field1195 = 0;
        class10.field344 = 0;
        class145.field2630 = 0;
        class117.field2221 = 0;
        class23.field587 = 0;
        class190.field3364 = 0;
        class62.field1252 = 0;
        class149.field2721 = 0;
        class160.field2930 = 0;
        class5.field67 = 0;
        class117.field2217 = 0;
        class67.field1287 = 0;
        class7.field110 = 0;
        class112.field2109 = 0;
        class232.field4170 = 0;
        class53.field1082 = 0;
        class226.field4077 = 0;
        class171.field3091 = 0;
        class42.field937 = 0;
        class32.field756 = 0;
        class106.field1938 = 0;
        class117.field2178 = 0;
        class58.field1192 = 0;
        class145.field2653 = 0;
        class125.field2341 = 0;
        class221.field3986 = 0;
        class100.field1830 = 0;
        class86.field1625 = 0;
        class4.field49 = 0;
        class6.field93 = 0;
        class154.field2769 = 0;
        class109.field2020 = 0;
        class239.field4317 = 0;
        class82.field1555 = 0;
        class38.field872 = 0;
        class45.field974 = 0;
        class230.field4148 = 0;
        class145.field2649 = 0;
        class117.field2216 = 0;
        class199.field3563 = 0;
        class215.field3916 = 0;
        class199.field3572 = 0;
        class9.field217 = 0;
        class117.field2197 = 0;
        class5.field60 = 0;
        class71.field1368 = 0;
        class159.field2894 = 0;
        class111.field2093 = 0;
        class176.field3186 = 0;
        class215.field3902 = 0;
        class181.field3276 = 0;
        class246.field4522 = 0;
        class52.field1068 = 0;
        class103.field1881 = 0;
        class70.field1347 = 0;
        class52.field1073 = 0;
        class32.field744 = 0;
        class149.field2711 = 0;
        class148.field2701 = 0;
        class80.field1500 = 0;
        class224.field4035 = 0;
        class111.field2079 = 0;
        class5.field73 = 0;
        class119.field2252 = 0;
        class243.field4398 = 0;
        class101.field1842 = 0;
        class71.field1360 = 0;
        class176.field3185 = 0;
        class119.field2254 = 0;
        class10.field347 = 0;
        class166.field3006 = 0;
        class97.field1784 = 0;
        class169.field3048 = 0;
        class147.field2696 = 0;
        class69.field1339 = 0;
        class119.field2240 = 0;
        class196.field3520 = 0;
        class110.field2069 = 0;
        class101.field1853 = 0;
        class174.field3132 = 0;
        class37.field851 = 0;
        class93.field1715 = 0;
        class103.field1878 = 0;
        class114.field2126 = 0;
        class212.field3850 = 0;
        class45.field976 = 0;
        class243.field4436 = 0;
        class10.field318 = 0;
        class240.field4332 = 0;
        class228.field4099 = 0;
        class156.field2845 = 0;
        class76.field1443 = 0;
        class10.field305 = 0;
        class38.field876 = 0;
        class28.field678 = 0;
        class39.field888 = 0;
        class18.field517 = 0;
        class145.field2603 = 0;
        class123.field2306 = 0;
        class88.field1637 = 0;
        class86.field1622 = 0;
        class71.field1356 = 0;
        class57.field1189 = 0;
        class145.field2636 = 0;
        class221.field3997 = 0;
        class145.field2654 = 0;
        class200.field3620 = 0;
        class103.field1875 = 0;
        class248.field4554 = 0;
        class40.field915 = 0;
        class7.field115 = 0;
        class212.field3843 = 0;
        class26.field654 = 0;
        class103.field1879 = 0;
        class207.field3720 = 0;
        class31.field729 = 0;
        class94.field1724 = 0;
        class109.field2013 = 0;
        client.field774 = 0;
        class201.field3647 = 0;
        class199.field3584 = 0;
        class243.field4419 = 0;
        class145.field2608 = 0;
        class71.field1370 = 0;
        class240.field4338 = 0;
        class243.field4400 = 0;
        class117.field2159 = 0;
        class221.field3982 = 0;
        class154.field2774 = 0;
        class48.field1005 = 0;
        class119.field2239 = 0;
        class198.field3551 = 0;
        class222.field3998 = 0;
        class243.field4429 = 0;
        class9.field220 = 0;
        class175.field3163 = 0;
        class36.field827 = 0;
        class36.field839 = 0;
        class38.field864 = 0;
        class106.field1936 = 0;
        class3.field24 = 0;
        class207.field3715 = 0;
        class174.field3153 = 0;
        class5.field69 = 0;
        class90.field1663 = 0;
        class234.field4276 = 0;
        class9.field167 = 0;
        class203.field3672 = 0;
        class199.field3585 = 0;
        class147.field2697 = 0;
        class154.field2813 = 0;
        class93.field1710 = 0;
        class204.field3687 = 0;
        class96.field1768 = 0;
        class147.field2695 = 0;
        class43.field947 = 0;
        class106.field1940 = 0;
        class71.field1362 = 0;
        class229.field4124 = 0;
        class214.field3892 = 0;
        class200.field3636 = 0;
        class223.field4015 = 0;
        class145.field2640 = 0;
        class103.field1865 = 0;
        class93.field1703 = 0;
        class219.field3973 = 0;
        class26.field657 = 0;
        class25.field622 = 0;
        class36.field836 = 0;
        class165.field2980 = 0;
        class53.field1080 = 0;
        class103.field1885 = 0;
        class214.field3894 = 0;
        class49.field1026 = 0;
        class157.field2847 = 0;
        class84.field1579 = 0;
        class3.field32 = 0;
        class40.field914 = 0;
        class117.field2180 = 0;
        class199.field3586 = 0;
        class177.field3203 = 0;
        class159.field2891 = 0;
        class222.field4011 = 0;
        class167.field3027 = 0;
        class218.field3964 = 0;
        class74.field1402 = 0;
        class243.field4427 = 0;
        class61.field1231 = 0;
        class210.field3767 = 0;
        class75.field1428 = 0;
        class146.field2682 = 0;
        class34.field794 = 0;
        class200.field3629 = 0;
        class104.field1897 = 0;
        class246.field4537 = 0;
        class14.field436 = 0;
        class186.field3338 = 0;
        class82.field1557 = 0;
        class3.field30 = 0;
        class111.field2081 = 0;
        class104.field1896 = 0;
        class27.field664 = 0;
        class246.field4527 = 0;
        class10.field312 = 0;
        class231.field4159 = 0;
        class9.field186 = 0;
        class96.field1761 = 0;
        class114.field2123 = 0;
        class56.field1147 = 0;
        class167.field3011 = 0;
        class94.field1720 = 0;
        class25.field610 = 0;
        class215.field3910 = 0;
        class36.field833 = 0;
        class207.field3724 = 0;
        class133.field2402 = 0;
        class172.field3095 = 0;
        class49.field1030 = 0;
        class108.field2001 = 0;
        class62.field1247 = 0;
        class130.field2385 = 0;
        class167.field3025 = 0;
        class45.field980 = 0;
        class90.field1662 = 0;
        class56.field1131 = 0;
        class177.field3189 = 0;
        class70.field1354 = 0;
        class222.field4010 = 0;
        class75.field1430 = 0;
        class69.field1317 = 0;
        class117.field2157 = 0;
        class3.field40 = 0;
        class3.field21 = 0;
        class95.field1736 = 0;
        class191.field3404 = 0;
        class103.field1874 = 0;
        class201.field3641 = 0;
        class117.field2185 = 0;
        class161.field2950 = 0;
        class77.field1476 = 0;
        class92.field1693 = 0;
        class175.field3159 = 0;
        class234.field4211 = 0;
        class106.field1942 = 0;
        class56.field1132 = 0;
        class40.field919 = 0;
        class101.field1854 = 0;
        class1.field6 = 0;
        class212.field3851 = 0;
        class61.field1237 = 0;
        class228.field4100 = 0;
        class167.field3012 = 0;
        class158.field2881 = 0;
        class198.field3558 = 0;
        class199.field3597 = 0;
        class172.field3102 = 0;
        class32.field752 = 0;
        class117.field2186 = 0;
        class145.field2664 = 0;
        class57.field1181 = 0;
        class99.field1812 = 0;
        class176.field3182 = 0;
        class120.field2277 = 0;
        class21.field566 = 0;
        class117.field2164 = 0;
        class172.field3096 = 0;
        class154.field2771 = 0;
        class208.field3725 = 0;
        class25.field619 = 0;
        class6.field94 = 0;
        class145.field2618 = 0;
        class101.field1845 = 0;
        class117.field2161 = 0;
        class106.field1933 = 0;
        class213.field3877 = 0;
        class3.field20 = 0;
        class207.field3722 = 0;
        class145.field2659 = 0;
        class176.field3184 = 0;
        class76.field1444 = 0;
        class145.field2637 = 0;
        class119.field2242 = 0;
        class223.field4029 = 0;
        class104.field1891 = 0;
        class117.field2176 = 0;
        class30.field698 = 0;
        class39.field902 = 0;
        class176.field3178 = 0;
        class169.field3050 = 0;
        class246.field4532 = 0;
        class81.field1522 = 0;
        class21.field568 = 0;
        class10.field325 = 0;
        class125.field2338 = 0;
        class82.field1546 = 0;
        class161.field2955 = 0;
        class150.field2727 = 0;
        class190.field3374 = 0;
        class102.field1863 = 0;
        class52.field1060 = 0;
        class199.field3568 = 0;
        class213.field3872 = 0;
        class115.field2145 = 0;
        class3.field38 = 0;
        class225.field4045 = 0;
        class103.field1873 = 0;
        class53.field1088 = 0;
        class23.field593 = 0;
        class79.field1499 = 0;
        class145.field2675 = 0;
        class244.field4505 = 0;
        class169.field3043 = 0;
        class36.field824 = 0;
        class145.field2666 = 0;
        class81.field1525 = 0;
        class226.field4066 = 0;
        class148.field2699 = 0;
        class28.field681 = 0;
        class211.field3803 = 0;
        class70.field1351 = 0;
        class32.field747 = 0;
        client.field781 = 0;
        class117.field2214 = 0;
        class229.field4130 = 0;
        class145.field2629 = 0;
        class57.field1188 = 0;
        class25.field615 = 0;
        class71.field1359 = 0;
        class194.field3468 = 0;
        class136.field2453 = 0;
        class94.field1723 = 0;
        class106.field1928 = 0;
        class33.field767 = 0;
        class10.field306 = 0;
        class61.field1226 = 0;
        class201.field3654 = 0;
        class82.field1545 = 0;
        class122.field2293 = 0;
        class214.field3895 = 0;
        class124.field2310 = 0;
        class9.field154 = 0;
        class5.field83 = 0;
        class206.field3707 = 0;
        class53.field1095 = 0;
        class217.field3939 = 0;
        class181.field3284 = 0;
        class207.field3721 = 0;
        class165.field2985 = 0;
        class243.field4463 = 0;
        class234.field4229 = 0;
        class25.field614 = 0;
        class180.field3258 = 0;
        class158.field2886 = 0;
        class181.field3281 = 0;
        class44.field958 = 0;
        class243.field4401 = 0;
        class50.field1037 = 0;
        class145.field2652 = 0;
        class5.field84 = 0;
        class119.field2260 = 0;
        class114.field2129 = 0;
        class12.field387 = 0;
        class38.field868 = 0;
        client.field792 = 0;
        class145.field2669 = 0;
        class243.field4456 = 0;
        class54.field1106 = 0;
        class39.field882 = 0;
        class167.field3023 = 0;
        class124.field2316 = 0;
        class13.field421 = 0;
        class195.field3483 = 0;
        class212.field3863 = 0;
        class198.field3560 = 0;
        class186.field3344 = 0;
        class39.field894 = 0;
        class124.field2307 = 0;
        class201.field3651 = 0;
        class10.field339 = 0;
        class26.field650 = 0;
        class219.field3972 = 0;
        class71.field1366 = 0;
        class100.field1828 = 0;
        class100.field1824 = 0;
        class243.field4439 = 0;
        class102.field1858 = 0;
        class224.field4038 = 0;
        class190.field3361 = 0;
        class85.field1611 = 0;
        class5.field74 = 0;
        class211.field3785 = 0;
        class151.field2750 = 0;
        class180.field3257 = 0;
        class139.field2537 = 0;
        class70.field1344 = 0;
        class202.field3656 = 0;
        class37.field849 = 0;
        class218.field3961 = 0;
        class205.field3694 = 0;
        class10.field338 = 0;
        class24.field604 = 0;
        class62.field1242 = 0;
        class109.field2032 = 0;
        client.field778 = 0;
        class158.field2882 = 0;
        class76.field1461 = 0;
        class71.field1369 = 0;
        class61.field1234 = 0;
        class5.field71 = 0;
        class140.field2553 = 0;
        class97.field1790 = 0;
        class96.field1755 = 0;
        class243.field4399 = 0;
        class3.field35 = 0;
        class85.field1609 = 0;
        class231.field4149 = 0;
        class137.field2478 = 0;
        class10.field319 = 0;
        class209.field3756 = 0;
        class9.field200 = 0;
        class240.field4334 = 0;
        class18.field522 = 0;
        class38.field865 = 0;
        class117.field2174 = 0;
        class117.field2155 = 0;
        class55.field1122 = 0;
        class193.field3449 = 0;
        class77.field1470 = 0;
        class69.field1332 = 0;
        class11.field373 = 0;
        class10.field316 = 0;
        class10.field342 = 0;
        class117.field2190 = 0;
        class128.field2379 = 0;
        class4.field53 = 0;
        class243.field4482 = 0;
        class102.field1862 = 0;
        class62.field1251 = 0;
        class145.field2633 = 0;
        class120.field2275 = 0;
        class10.field313 = 0;
        class140.field2546 = 0;
        class3.field22 = 0;
        class199.field3575 = 0;
        class145.field2623 = 0;
        class219.field3977 = 0;
        class215.field3908 = 0;
        class9.field180 = 0;
        class72.field1379 = 0;
        class161.field2954 = 0;
        class117.field2188 = 0;
        class179.field3239 = 0;
        class39.field883 = 0;
        field547 = 0;
        class159.field2897 = 0;
        class167.field3026 = 0;
        class190.field3386 = 0;
        class199.field3569 = 0;
        class145.field2672 = 0;
        class201.field3642 = 0;
        class97.field1779 = 0;
        class199.field3577 = 0;
        class98.field1807 = 0;
        class199.field3595 = 0;
        class162.field2964 = 0;
        class154.field2820 = 0;
        class82.field1541 = 0;
        class103.field1887 = 0;
        class8.field123 = 0;
        class167.field3015 = 0;
        class199.field3576 = 0;
        class41.field926 = 0;
        class211.field3815 = 0;
        class10.field346 = 0;
        class145.field2625 = 0;
        class154.field2758 = 0;
        class174.field3149 = 0;
        class232.field4163 = 0;
        class171.field3082 = 0;
        class56.field1152 = 0;
        class201.field3650 = 0;
        class226.field4080 = 0;
        class79.field1493 = 0;
        class110.field2071 = 0;
        class162.field2963 = 0;
        class68.field1308 = 0;
        class233.field4199 = 0;
        class56.field1142 = 0;
        class160.field2918 = 0;
        class199.field3574 = 0;
        class145.field2604 = 0;
        class96.field1749 = 0;
        class93.field1705 = 0;
        class117.field2203 = 0;
        client.field790 = 0;
        class117.field2181 = 0;
        class93.field1713 = 0;
        class76.field1449 = 0;
        class125.field2340 = 0;
        class77.field1471 = 0;
        class52.field1077 = 0;
        class215.field3905 = 0;
        class180.field3254 = 0;
        class53.field1094 = 0;
        class39.field895 = 0;
        class193.field3451 = 0;
        class135.field2426 = 0;
        class40.field922 = 0;
        class154.field2790 = 0;
        class100.field1832 = 0;
        class246.field4534 = 0;
        class26.field652 = 0;
        class10.field334 = 0;
        class8.field128 = 0;
        class68.field1305 = 0;
        class190.field3397 = 0;
        class135.field2433 = 0;
        class9.field241 = 0;
        class243.field4414 = 0;
        class145.field2661 = 0;
        class79.field1494 = 0;
        class86.field1615 = 0;
        class160.field2921 = 0;
        class75.field1421 = 0;
        class56.field1151 = 0;
        class5.field64 = 0;
        class68.field1306 = 0;
        class233.field4190 = 0;
        class6.field92 = 0;
        class224.field4043 = 0;
        class136.field2450 = 0;
        class199.field3596 = 0;
        class155.field2825 = 0;
        class75.field1418 = 0;
        class158.field2885 = 0;
        class11.field375 = 0;
        class232.field4179 = 0;
        class67.field1284 = 0;
        class117.field2224 = 0;
        class177.field3209 = 0;
        class145.field2655 = 0;
        class181.field3285 = 0;
        class12.field386 = 0;
        class232.field4173 = 0;
        class117.field2153 = 0;
        class12.field388 = 0;
        class145.field2626 = 0;
        class199.field3570 = 0;
        class136.field2437 = 0;
        class53.field1089 = 0;
        class80.field1502 = 0;
        class167.field3019 = 0;
        class226.field4075 = 0;
        class106.field1923 = 0;
        class128.field2373 = 0;
        class243.field4402 = 0;
        class10.field349 = 0;
        class108.field2008 = 0;
        class78.field1480 = 0;
        class45.field978 = 0;
        class128.field2365 = 0;
        class124.field2311 = 0;
        class155.field2824 = 0;
        class45.field975 = 0;
        class106.field1922 = 0;
        class145.field2628 = 0;
        class103.field1866 = 0;
        class158.field2878 = 0;
        class172.field3094 = 0;
        class117.field2189 = 0;
        class166.field2995 = 0;
        class98.field1796 = 0;
        class204.field3686 = 0;
        class8.field143 = 0;
        class8.field125 = 0;
        class30.field705 = 0;
        class151.field2739 = 0;
        class40.field921 = 0;
        class52.field1072 = 0;
        class77.field1473 = 0;
        class5.field62 = 0;
        class147.field2694 = 0;
        class167.field3014 = 0;
        class111.field2089 = 0;
        class208.field3731 = 0;
        class77.field1466 = 0;
        class3.field34 = 0;
        class165.field2986 = 0;
        class243.field4461 = 0;
        class199.field3602 = 0;
        class70.field1348 = 0;
        class246.field4531 = 0;
        class157.field2861 = 0;
        class243.field4412 = 0;
        class145.field2648 = 0;
        class233.field4206 = 0;
        class75.field1413 = 0;
        client.field782 = 0;
        class148.field2700 = 0;
        class171.field3080 = 0;
        class62.field1241 = 0;
        class244.field4501 = 0;
        class39.field889 = 0;
        class248.field4551 = 0;
        class172.field3104 = 0;
        class166.field3000 = 0;
        class6.field91 = 0;
        class199.field3594 = 0;
        class125.field2337 = 0;
        class243.field4475 = 0;
        class10.field307 = 0;
        class97.field1792 = 0;
        class154.field2809 = 0;
        class156.field2833 = 0;
        class182.field3299 = 0;
        class157.field2855 = 0;
        class145.field2622 = 0;
        class119.field2250 = 0;
        class223.field4018 = 0;
        class177.field3196 = 0;
        class145.field2605 = 0;
        class103.field1868 = 0;
        class10.field365 = 0;
        class36.field840 = 0;
        class143.field2594 = 0;
        class117.field2204 = 0;
        class117.field2199 = 0;
        class226.field4067 = 0;
        class145.field2610 = 0;
        class104.field1905 = 0;
        class203.field3674 = 0;
        class86.field1629 = 0;
        class10.field331 = 0;
        class98.field1798 = 0;
        class11.field370 = 0;
        class18.field532 = 0;
        class199.field3579 = 0;
        class81.field1527 = 0;
        class136.field2449 = 0;
        class98.field1811 = 0;
        class120.field2271 = 0;
        class112.field2103 = 0;
        class243.field4472 = 0;
        class243.field4473 = 0;
        class67.field1285 = 0;
        class95.field1737 = 0;
        class4.field58 = 0;
        class106.field1924 = 0;
        class135.field2431 = 0;
        class212.field3859 = 0;
        class161.field2938 = 0;
        class154.field2762 = 0;
        class14.field438 = 0;
        class145.field2660 = 0;
        class224.field4036 = 0;
        class231.field4153 = 0;
        class177.field3204 = 0;
        class14.field431 = 0;
        class140.field2555 = 0;
        class72.field1382 = 0;
        class161.field2951 = 0;
        class117.field2158 = 0;
        class117.field2218 = 0;
        class17.field503 = 0;
        class82.field1559 = 0;
        class117.field2201 = 0;
        class145.field2665 = 0;
        class119.field2259 = 0;
        class178.field3224 = 0;
        class162.field2962 = 0;
        class119.field2247 = 0;
        class25.field617 = 0;
        class176.field3177 = 0;
        class244.field4502 = 0;
        class154.field2760 = 0;
        class56.field1129 = 0;
        class32.field748 = 0;
        class71.field1371 = 0;
        class125.field2334 = 0;
        class92.field1690 = 0;
        class98.field1803 = 0;
        class12.field390 = 0;
        class99.field1816 = 0;
        class70.field1349 = 0;
        class38.field862 = 0;
        class51.field1043 = 0;
        class185.field3320 = 0;
        class246.field4539 = 0;
        class97.field1777 = 0;
        class178.field3227 = 0;
        class109.field2025 = 0;
        class101.field1847 = 0;
        class190.field3396 = 0;
        class177.field3190 = 0;
        class173.field3115 = 0;
        class243.field4434 = 0;
        class227.field4090 = 0;
        class25.field632 = 0;
        class25.field633 = 0;
        class10.field345 = 0;
        class243.field4487 = 0;
        class52.field1070 = 0;
        class145.field2612 = 0;
        class199.field3590 = 0;
        class33.field763 = 0;
        class182.field3300 = 0;
        class136.field2446 = 0;
        class31.field742 = 0;
        class115.field2136 = 0;
        class147.field2691 = 0;
        class117.field2173 = 0;
        class53.field1086 = 0;
        class62.field1244 = 0;
        class160.field2919 = 0;
        class5.field86 = 0;
        class97.field1785 = 0;
        class110.field2073 = 0;
        class23.field583 = 0;
        class117.field2171 = 0;
        class136.field2460 = 0;
        class195.field3477 = 0;
        class100.field1820 = 0;
        class44.field959 = 0;
        class243.field4430 = 0;
        class117.field2220 = 0;
        class81.field1513 = 0;
        class172.field3101 = 0;
        class203.field3669 = 0;
        class31.field741 = 0;
        class36.field822 = 0;
        class216.field3924 = 0;
        class119.field2251 = 0;
        class109.field2040 = 0;
        class67.field1288 = 0;
        class114.field2127 = 0;
        class167.field3024 = 0;
        class176.field3180 = 0;
        class8.field140 = 0;
        class149.field2714 = 0;
        class223.field4025 = 0;
        class156.field2844 = 0;
        field553 = 0;
        class86.field1630 = 0;
        class10.field326 = 0;
        class136.field2440 = 0;
        class161.field2947 = 0;
        class165.field2992 = 0;
        class18.field521 = 0;
        class198.field3556 = 0;
        class52.field1067 = 0;
        class190.field3387 = 0;
        class243.field4474 = 0;
        class225.field4056 = 0;
        class203.field3666 = 0;
        class43.field953 = 0;
        class117.field2226 = 0;
        class79.field1490 = 0;
        class117.field2198 = 0;
        class198.field3546 = 0;
        class10.field354 = 0;
        class99.field1817 = 0;
        class69.field1336 = 0;
        class156.field2843 = 0;
        class150.field2732 = 0;
        class207.field3712 = 0;
        class177.field3210 = 0;
        class167.field3018 = 0;
        class31.field728 = 0;
        class145.field2634 = 0;
        class90.field1673 = 0;
        class215.field3898 = 0;
        class6.field90 = 0;
        class165.field2979 = 0;
        class196.field3508 = 0;
        class182.field3298 = 0;
        class174.field3145 = 0;
        class25.field611 = 0;
        class80.field1507 = 0;
        class119.field2235 = 0;
        class3.field36 = 0;
        class244.field4504 = 0;
        class227.field4092 = 0;
        class180.field3263 = 0;
        class218.field3962 = 0;
        class25.field613 = 0;
        class124.field2309 = 0;
        class90.field1660 = 0;
        class177.field3207 = 0;
        class82.field1549 = 0;
        class225.field4059 = 0;
        class62.field1250 = 0;
        class124.field2313 = 0;
        class230.field4136 = 0;
        class11.field368 = 0;
        class205.field3693 = 0;
        class25.field623 = 0;
        class213.field3880 = 0;
        class128.field2362 = 0;
        class247.field4549 = 0;
        class240.field4340 = 0;
        class9.field268 = 0;
        class97.field1780 = 0;
        class187.field3347 = 0;
        class166.field2998 = 0;
        class28.field682 = 0;
        class154.field2794 = 0;
        class177.field3202 = 0;
        class27.field677 = 0;
        class85.field1607 = 0;
        class169.field3046 = 0;
        class169.field3041 = 0;
        class211.field3829 = 0;
        class34.field797 = 0;
        class190.field3376 = 0;
        class3.field26 = 0;
        class216.field3923 = 0;
        class82.field1553 = 0;
        class167.field3008 = 0;
        class88.field1641 = 0;
        class81.field1523 = 0;
        class166.field2996 = 0;
        class200.field3618 = 0;
        class182.field3296 = 0;
        class96.field1771 = 0;
        class237.field4286 = 0;
        class3.field19 = 0;
        class73.field1396 = 0;
        class217.field3942 = 0;
        class177.field3206 = 0;
        class226.field4071 = 0;
        class160.field2923 = 0;
        class55.field1117 = 0;
        class199.field3593 = 0;
        class212.field3848 = 0;
        class1.field10 = 0;
        class201.field3644 = 0;
        class36.field832 = 0;
        class14.field433 = 0;
        class145.field2631 = 0;
        class45.field973 = 0;
        class81.field1526 = 0;
        class136.field2439 = 0;
        class227.field4088 = 0;
        class49.field1019 = 0;
        class174.field3139 = 0;
        class160.field2932 = 0;
        class79.field1495 = 0;
        class117.field2202 = 0;
        class221.field3984 = 0;
        class161.field2943 = 0;
        class146.field2679 = 0;
        class54.field1108 = 0;
        class117.field2169 = 0;
        class26.field660 = 0;
        class76.field1435 = 0;
        class150.field2734 = 0;
        class160.field2925 = 0;
        class157.field2849 = 0;
        class114.field2125 = 0;
        class9.field208 = 0;
        class52.field1064 = 0;
        class10.field308 = 0;
        class149.field2713 = 0;
        class214.field3889 = 0;
        class32.field754 = 0;
        class122.field2295 = 0;
        class214.field3884 = 0;
        class128.field2374 = 0;
        class145.field2656 = 0;
        class233.field4196 = 0;
        class25.field620 = 0;
        class7.field117 = 0;
        class147.field2688 = 0;
        class117.field2166 = 0;
        class143.field2592 = 0;
        class165.field2977 = 0;
        class157.field2848 = 0;
        class247.field4547 = 0;
        class204.field3682 = 0;
        class145.field2619 = 0;
        class30.field709 = 0;
        class199.field3587 = 0;
        class158.field2887 = 0;
        class199.field3599 = 0;
        class166.field3007 = 0;
        class69.field1340 = 0;
        class158.field2874 = 0;
        class141.field2562 = 0;
        class234.field4230 = 0;
        class207.field3709 = 0;
        class12.field392 = 0;
        class96.field1765 = 0;
        class10.field327 = 0;
        class103.field1872 = 0;
        class109.field2056 = 0;
        class196.field3497 = 0;
        class104.field1898 = 0;
        class217.field3943 = 0;
        class103.field1884 = 0;
        class148.field2702 = 0;
        class10.field352 = 0;
        class223.field4021 = 0;
        class243.field4410 = 0;
        class68.field1307 = 0;
        class172.field3097 = 0;
        class243.field4470 = 0;
        class5.field81 = 0;
        class94.field1721 = 0;
        class86.field1621 = 0;
        class69.field1318 = 0;
        class54.field1107 = 0;
        class74.field1408 = 0;
        class44.field961 = 0;
        class10.field323 = 0;
        class10.field333 = 0;
        class24.field609 = 0;
        class74.field1410 = 0;
        class117.field2177 = 0;
        class117.field2195 = 0;
        class212.field3864 = 0;
        class97.field1787 = 0;
        class101.field1841 = 0;
        class243.field4479 = 0;
        class93.field1707 = 0;
        class99.method672(126);
        class181.field3277 = -1;
        class105.field1911.field2643 = 0;
        class5.field79 = 0;
        class8.field131 = -1;
        class195.field3487 = -1;
        class56.field1161 = -1;
        class10.field357 = 0;
        class18.field511.field2643 = 0;
        class44.field964 = 0;
        for (int var1 = 0; var1 < class84.field1598.length; var1++) {
            class84.field1598[var1] = null;
        }
        class182.field3289 = false;
        class100.field1825 = 0;
        class157.method1113((byte) 127, 0);
        for (int var2 = 0; var2 < 100; var2++) {
            class6.field99[var2] = null;
        }
        client.field776 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        class219.field3975 = 0;
        class193.field3448 = 0;
        class86.field1623 = 0;
        class143.field2589 = 0;
        class80.field1505 = (int) (Math.random() * 80.0D) - 40;
        class202.field3658 = -1;
        class13.field427 = (int) (Math.random() * 120.0D) - 60;
        class92.field1691 = (int) (Math.random() * 100.0D) - 50;
        class229.field4121 = 0;
        class61.field1229 = 0;
        class61.field1233 = 0;
        class215.field3896 = (int) (Math.random() * 110.0D) - 55;
        class82.field1543 = false;
        class174.field3151 = (int) (Math.random() * 30.0D) - 20;
        class201.field3645 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class43.field950[var3] = null;
            class114.field2135[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class1.field18[var4] = null;
        }
        class93.field1712 = class43.field950[arg0] = new class56();
        class173.field3114.method324(arg0 ^ 0xFFFFF863);
        class119.field2257.method324(arg0 - 2151);
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var14 = 0; var14 < 104; var14++) {
                for (int var15 = 0; var15 < 104; var15++) {
                    class143.field2597[var5][var14][var15] = null;
                }
            }
        }
        class145.field2606 = new class36();
        class151.field2744 = 0;
        class169.field3047 = 0;
        for (int var6 = 0; var6 < class178.field3228; var6++) {
            class14 var13 = class246.method1615((byte) 99, var6);
            if (var13 != null && var13.field430 == 0) {
                class112.field2106[var6] = 0;
                class141.field2561[var6] = 0;
            }
        }
        for (int var7 = 0; var7 < class232.field4183.length; var7++) {
            class232.field4183[var7] = -1;
        }
        if (class92.field1697 != -1) {
            class204.method1353(class92.field1697, 24861);
        }
        for (class73 var8 = (class73) class11.field371.method456((byte) 117); var8 != null; var8 = (class73) class11.field371.method459((byte) -87)) {
            class101.method682(28079, var8, true);
        }
        class92.field1697 = -1;
        class11.field371 = new class62(8);
        class100.field1825 = 0;
        class191.field3407 = null;
        class182.field3289 = false;
        class10.field364.method659(false, null, (byte) -41, new int[5], -1);
        for (int var9 = 0; var9 < 8; var9++) {
            class90.field1685[var9] = null;
            class108.field2005[var9] = false;
        }
        class98.method666(-111);
        class224.field4044 = true;
        for (int var10 = 0; var10 < 100; var10++) {
            class173.field3126[var10] = true;
        }
        class231.field4157 = null;
        class211.field3840 = 0;
        class39.field898 = null;
        for (int var11 = 0; var11 < 6; var11++) {
            class175.field3156[var11] = new class195();
        }
        for (int var12 = 0; var12 < 25; var12++) {
            class196.field3523[var12] = 0;
            class115.field2142[var12] = 0;
            class177.field3188[var12] = 0;
        }
        class166.field3002 = true;
        class112.field2107 = class68.field1304 = class193.field3455 = class7.field109 = new short[256];
        class103.field1886 = class217.field3957;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "()V")
    public static final void method181() {
        int var0 = class84.field1581[class76.field1451];
        class200[] var1 = class84.field1596[class76.field1451];
        class27.field674 = 0;
        label191: for (int var2 = 0; var2 < var0; var2++) {
            class200 var3 = var1[var2];
            if (class26.field655 != null) {
                for (int var4 = 0; var4 < class26.field655.length; var4++) {
                    if (class26.field655[var4] != -1000000 && (var3.field3633 <= class26.field655[var4] || var3.field3640 <= class26.field655[var4]) && (var3.field3623 <= class127.field2344[var4] || var3.field3625 <= class127.field2344[var4]) && (var3.field3623 >= class147.field2692[var4] || var3.field3625 >= class147.field2692[var4]) && (var3.field3621 <= class40.field912[var4] || var3.field3612 <= class40.field912[var4]) && (var3.field3621 >= class147.field2687[var4] || var3.field3612 >= class147.field2687[var4])) {
                        continue label191;
                    }
                }
            }
            if (var3.field3619 == 1) {
                int var5 = var3.field3627 + class41.field933 - class38.field870;
                if (var5 >= 0 && var5 <= class41.field933 + class41.field933) {
                    int var6 = var3.field3630 + class41.field933 - class225.field4065;
                    if (var6 < 0) {
                        var6 = 0;
                    }
                    int var7 = var3.field3632 + class41.field933 - class225.field4065;
                    if (var7 > class41.field933 + class41.field933) {
                        var7 = class41.field933 + class41.field933;
                    }
                    boolean var8 = false;
                    while (var6 <= var7) {
                        if (class95.field1740[var5][var6++]) {
                            var8 = true;
                            break;
                        }
                    }
                    if (var8) {
                        int var9 = class225.field4064 - var3.field3623;
                        if (var9 > 32) {
                            var3.field3615 = 1;
                        } else {
                            if (var9 >= -32) {
                                continue;
                            }
                            var3.field3615 = 2;
                            var9 = -var9;
                        }
                        var3.field3634 = (var3.field3621 - class175.field3160 << 8) / var9;
                        var3.field3628 = (var3.field3612 - class175.field3160 << 8) / var9;
                        var3.field3631 = (var3.field3633 - class115.field2139 << 8) / var9;
                        var3.field3624 = (var3.field3640 - class115.field2139 << 8) / var9;
                        class38.field863[class27.field674++] = var3;
                    }
                }
            } else if (var3.field3619 == 2) {
                int var10 = var3.field3630 + class41.field933 - class225.field4065;
                if (var10 >= 0 && var10 <= class41.field933 + class41.field933) {
                    int var11 = var3.field3627 + class41.field933 - class38.field870;
                    if (var11 < 0) {
                        var11 = 0;
                    }
                    int var12 = var3.field3611 + class41.field933 - class38.field870;
                    if (var12 > class41.field933 + class41.field933) {
                        var12 = class41.field933 + class41.field933;
                    }
                    boolean var13 = false;
                    while (var11 <= var12) {
                        if (class95.field1740[var11++][var10]) {
                            var13 = true;
                            break;
                        }
                    }
                    if (var13) {
                        int var14 = class175.field3160 - var3.field3621;
                        if (var14 > 32) {
                            var3.field3615 = 3;
                        } else {
                            if (var14 >= -32) {
                                continue;
                            }
                            var3.field3615 = 4;
                            var14 = -var14;
                        }
                        var3.field3635 = (var3.field3623 - class225.field4064 << 8) / var14;
                        var3.field3613 = (var3.field3625 - class225.field4064 << 8) / var14;
                        var3.field3631 = (var3.field3633 - class115.field2139 << 8) / var14;
                        var3.field3624 = (var3.field3640 - class115.field2139 << 8) / var14;
                        class38.field863[class27.field674++] = var3;
                    }
                }
            } else if (var3.field3619 == 4) {
                int var15 = var3.field3633 - class115.field2139;
                if (var15 > 128) {
                    int var16 = var3.field3630 + class41.field933 - class225.field4065;
                    if (var16 < 0) {
                        var16 = 0;
                    }
                    int var17 = var3.field3632 + class41.field933 - class225.field4065;
                    if (var17 > class41.field933 + class41.field933) {
                        var17 = class41.field933 + class41.field933;
                    }
                    if (var16 <= var17) {
                        int var18 = var3.field3627 + class41.field933 - class38.field870;
                        if (var18 < 0) {
                            var18 = 0;
                        }
                        int var19 = var3.field3611 + class41.field933 - class38.field870;
                        if (var19 > class41.field933 + class41.field933) {
                            var19 = class41.field933 + class41.field933;
                        }
                        boolean var20 = false;
                        label163: for (int var21 = var18; var21 <= var19; var21++) {
                            for (int var22 = var16; var22 <= var17; var22++) {
                                if (class95.field1740[var21][var22]) {
                                    var20 = true;
                                    break label163;
                                }
                            }
                        }
                        if (var20) {
                            var3.field3615 = 5;
                            var3.field3635 = (var3.field3623 - class225.field4064 << 8) / var15;
                            var3.field3613 = (var3.field3625 - class225.field4064 << 8) / var15;
                            var3.field3634 = (var3.field3621 - class175.field3160 << 8) / var15;
                            var3.field3628 = (var3.field3612 - class175.field3160 << 8) / var15;
                            class38.field863[class27.field674++] = var3;
                        }
                    }
                }
            }
        }
    }
}
