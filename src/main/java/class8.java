import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class8 extends class158 {

    @OriginalMember(owner = "client!ag", name = "Lb", descriptor = "Lkb;")
    private static class93 field132 = class76.method390("Location", 0);

    @OriginalMember(owner = "client!ag", name = "Gb", descriptor = "Lkb;")
    public static class93 field127 = field132;

    @OriginalMember(owner = "client!ag", name = "Qb", descriptor = "Lkb;")
    private static class93 field137 = class76.method390("Connecting to server)3)3)3", 0);

    @OriginalMember(owner = "client!ag", name = "Rb", descriptor = "Lkb;")
    private static class93 field138 = class76.method390("Benutzen Sie die (WPasswort -=ndern(W Option", 0);

    @OriginalMember(owner = "client!ag", name = "Jb", descriptor = "Lkb;")
    public static class93 field130 = field137;

    @OriginalMember(owner = "client!ag", name = "Eb", descriptor = "Lnb;")
    public static class120 field125 = new class120(64);

    @OriginalMember(owner = "client!ag", name = "Bb", descriptor = "I")
    public static int field122;

    @OriginalMember(owner = "client!ag", name = "Db", descriptor = "I")
    public static int field124;

    @OriginalMember(owner = "client!ag", name = "Fb", descriptor = "I")
    public static int field126;

    @OriginalMember(owner = "client!ag", name = "Hb", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "client!ag", name = "Ib", descriptor = "I")
    public static int field129;

    @OriginalMember(owner = "client!ag", name = "Kb", descriptor = "I")
    public static int field131;

    @OriginalMember(owner = "client!ag", name = "Mb", descriptor = "I")
    private int field133;

    @OriginalMember(owner = "client!ag", name = "Nb", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!ag", name = "Ob", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "client!ag", name = "Pb", descriptor = "I")
    public static int field136;

    @OriginalMember(owner = "client!ag", name = "Sb", descriptor = "I")
    public static int field139;

    @OriginalMember(owner = "client!ag", name = "Cb", descriptor = "Lfe;")
    private class53 field123;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "([II)V")
    public final void method39(int[] arg0, int arg1) {
        this.field123 = new class53(arg0);
        ++field126;
        if (arg1 != 7) {
            this.method39((int[]) null, 54);
        }
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(I)V")
    public class8(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ag", name = "t", descriptor = "(I)I")
    public final int method40(int arg0) {
        if (arg0 > -127) {
            field132 = null;
        }
        ++field134;
        return super.field3162[super.field3153++] + -this.field123.method294(255) & 255;
    }

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "(Z)V")
    public final void method41(boolean arg0) {
        this.field133 = super.field3153 * 8;
        if (arg0) {
            method43((byte) 97);
        }
        ++field128;
    }

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "(II)I")
    public final int method42(int arg0, int arg1) {
        int var3 = this.field133 >> 3;
        int var4 = -(7 & this.field133) + 8;
        ++field135;
        this.field133 += arg0;
        if (arg1 >= -34) {
            this.method42(-26, -53);
        }
        int var5 = 0;
        while (~arg0 < ~var4) {
            var5 += (super.field3162[var3++] & class60.field952[var4]) << -var4 + arg0;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg0 != var4) {
            var6 = (super.field3162[var3] >> var4 - arg0 & class60.field952[arg0]) + var5;
        } else {
            var6 = (class60.field952[var4] & super.field3162[var3]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "(B)V")
    public static final void method43(byte arg0) {
        class176.field3465 = class139.field2711;
        class30.field512 = class59.field949;
        class91.field1667 = class1.field29;
        class51.field809 = class180.field3571;
        class123.field2277 = class169.field3365;
        class55.field922 = class64.field1012;
        class138.field2680 = class114.field2114;
        class131.field2488 = class71.field1317;
        class176.field3487 = class80.field1428;
        class140.field2727 = class145.field2826;
        class121.field2238 = class193.field3750;
        class176.field3480 = class139.field2711;
        class13.field219 = class122.field2268;
        class106.field1939 = class145.field2824;
        class188.field3678 = class116.field2179;
        class176.field3464 = class139.field2711;
        class32.field518 = class83.field1527;
        class176.field3496 = class36.field588;
        class190.field3714 = class55.field900;
        class114.field2116 = class4.field61;
        class126.field2379 = class184.field3626;
        class89.field1609 = class179.field3568;
        class101.field1851 = class173.field3433;
        class178.field3536 = class205.field3954;
        class57.field929 = class29.field465;
        class124.field2316 = class30.field509;
        class191.field3725 = class43.field711;
        class137.field2653 = class7.field114;
        class65.field1110 = class166.field3325;
        class176.field3461 = class138.field2659;
        class175.field3459 = class36.field597;
        class176.field3492 = class139.field2711;
        class113.field2107 = class73.field1351;
        class166.field3317 = class98.field1828;
        class124.field2312 = class7.field113;
        class161.field3232 = class84.field1543;
        class193.field3755 = class111.field2001;
        class9.field147 = class108.field1958;
        class176.field3484 = class194.field3772;
        class96.field1772 = class113.field2099;
        class140.field2726 = class186.field3671;
        class37.field623 = class27.field437;
        class37.field626 = class88.field1590;
        class126.field2380 = class184.field3626;
        class145.field2820 = class55.field908;
        class151.field2917 = class101.field1861;
        class51.field820 = class138.field2678;
        class67.field1214 = class80.field1427;
        class40.field668 = class97.field1803;
        class73.field1349 = class177.field3523;
        class135.field2621 = class200.field3881;
        class176.field3491 = class139.field2711;
        class176.field3469 = class200.field3875;
        class80.field1432 = class96.field1786;
        class32.field530 = class82.field1514;
        class66.field1195 = class51.field807;
        class192.field3741 = class157.field3129;
        class206.field4028 = class173.field3428;
        class176.field3502 = class139.field2711;
        class82.field1509 = class116.field2173;
        class161.field3231 = class167.field3340;
        class12.field196 = class152.field2941;
        class176.field3497 = class12.field198;
        class141.field2745 = class66.field1197;
        class139.field2702 = class32.field523;
        class159.field3201 = field138;
        class143.field2790 = class155.field3046;
        class188.field3690 = class9.field146;
        class140.field2734 = class186.field3671;
        class176.field3470 = class139.field2711;
        class49.field792 = class117.field2199;
        class176.field3483 = class139.field2711;
        class177.field3515 = class135.field2629;
        class68.field1265 = class107.field1951;
        if (arg0 != 9) {
            field132 = null;
        }
        class66.field1207 = class120.field2229;
        class34.field542 = class173.field3429;
        class144.field2794 = class13.field207;
        class53.field895 = class124.field2314;
        class41.field686 = class178.field3544;
        class176.field3485 = class139.field2711;
        class195.field3823 = class160.field3214;
        class176.field3475 = class151.field2933;
        class207.field4049 = class44.field717;
        class15.field265 = class116.field2177;
        class131.field2469 = class23.field352;
        class176.field3489 = class186.field3671;
        class140.field2716 = class107.field1948;
        class176.field3486 = class139.field2711;
        class96.field1777 = class207.field4061;
        class70.field1298 = class44.field724;
        class39.field654 = class197.field3834;
        class158.field3137 = class176.field3508;
        class35.field576 = class126.field2366;
        class102.field1884 = class25.field390;
        class176.field3477 = class47.field757;
        class65.field1125 = class47.field755;
        class47.field766 = class88.field1591;
        class152.field2948 = class73.field1332;
        class47.field752 = class88.field1591;
        class158.field3171 = class120.field2215;
        class83.field1529 = class43.field714;
        class93.field1697 = class89.field1618;
        field127 = class153.field3008;
        class201.field3902 = class101.field1858;
        class68.field1254 = class116.field2172;
        class157.field3108 = class73.field1338;
        class176.field3498 = class61.field981;
        class83.field1528 = class143.field2787;
        class114.field2115 = class65.field1047;
        class95.field1759 = class93.field1706;
        class177.field3530 = class64.field1016;
        class120.field2219 = class96.field1776;
        class176.field3501 = class139.field2711;
        class176.field3500 = class78.field1400;
        class194.field3769 = class59.field944;
        class63.field1004 = class169.field3370;
        class63.field1003 = class172.field3407;
        class176.field3463 = class139.field2711;
        class144.field2811 = class101.field1862;
        class26.field422 = class13.field237;
        class147.field2835 = class69.field1278;
        class131.field2474 = class117.field2180;
        class154.field3029 = class36.field596;
        class73.field1333 = class57.field935;
        class203.field3930 = class203.field3931;
        class178.field3540 = class18.field308;
        class4.field72 = class170.field3384;
        class83.field1534 = class15.field274;
        class137.field2652 = class84.field1541;
        class32.field515 = class142.field2777;
        class126.field2367 = class169.field3362;
        class176.field3479 = class61.field981;
        class176.field3466 = class181.field3584;
        class120.field2237 = class154.field3043;
        class176.field3504 = class139.field2711;
        class176.field3494 = class139.field2711;
        class182.field3604 = class126.field2378;
        class62.field990 = class111.field1997;
        class68.field1258 = class139.field2711;
        class176.field3478 = class139.field2711;
        class176.field3495 = class139.field2711;
        class4.field59 = class138.field2662;
        class13.field217 = class128.field2434;
        class91.field1673 = class130.field2460;
        class197.field3837 = class165.field3265;
        class35.field569 = class171.field3396;
        class179.field3558 = class130.field2452;
        class81.field1477 = class73.field1342;
        class165.field3246 = class137.field2656;
        class91.field1675 = class184.field3630;
        class205.field3963 = class72.field1320;
        class104.field1911 = class190.field3708;
        class178.field3547 = class65.field1136;
        class176.field3488 = class139.field2711;
        class176.field3481 = class139.field2711;
        class76.field1370 = class160.field3213;
        class63.field1005 = class207.field4046;
        class140.field2732 = class173.field3437;
        class68.field1257 = class116.field2172;
        class115.field2166 = class139.field2703;
        class66.field1200 = class51.field807;
        class141.field2765 = class126.field2375;
        class176.field3490 = class139.field2711;
        class176.field3503 = class139.field2711;
        class16.field289 = class57.field934;
        class140.field2729 = class186.field3671;
        class10.field163 = class139.field2689;
        class176.field3499 = class139.field2711;
        class80.field1434 = class72.field1326;
        class140.field2717 = class173.field3437;
        class138.field2660 = class114.field2114;
        class83.field1524 = class30.field514;
        class66.field1191 = class117.field2185;
        class165.field3260 = class141.field2759;
        class66.field1192 = class36.field582;
        class70.field1303 = class73.field1329;
        class176.field3476 = class194.field3772;
        class40.field660 = class98.field1837;
        class69.field1285 = class182.field3605;
        class152.field2947 = class128.field2406;
        field130 = class15.field275;
        class167.field3349 = class53.field898;
        class96.field1778 = class92.field1681;
        class36.field581 = class39.field646;
        class203.field3914 = class152.field2943;
        class182.field3599 = class126.field2378;
        class16.field279 = class19.field322;
        class130.field2454 = class55.field910;
        class136.field2642 = class116.field2171;
        class4.field67 = class201.field3907;
        ++field136;
        class76.field1366 = class148.field2848;
        class76.field1379 = class13.field205;
        class69.field1282 = class201.field3904;
        class157.field3124 = class40.field669;
        class141.field2752 = class75.field1362;
        if (class97.field1827) {
        }
    }

    @OriginalMember(owner = "client!ag", name = "u", descriptor = "(I)V")
    public static void method44(int arg0) {
        field130 = null;
        field132 = null;
        field137 = null;
        if (arg0 >= -114) {
            field131 = -94;
        }
        field125 = null;
        field127 = null;
        field138 = null;
    }

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "(B)V")
    public final void method45(byte arg0) {
        ++field122;
        if (arg0 > 88) {
            super.field3153 = (this.field133 + 7) / 8;
        }
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(BI)I")
    public final int method46(byte arg0, int arg1) {
        ++field139;
        return arg0 >= -9 ? -8 : arg1 * 8 + -this.field133;
    }

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "(II)V")
    public final void method47(int arg0, int arg1) {
        if (arg1 != 8) {
            field130 = null;
        }
        super.field3162[super.field3153++] = (byte) (this.field123.method294(255) + arg0);
        ++field124;
    }
}
