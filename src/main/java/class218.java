import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class218 extends class130 {

    @OriginalMember(owner = "client!gh", name = "F", descriptor = "[B")
    public byte[] field3695;

    @OriginalMember(owner = "client!gh", name = "B", descriptor = "Lcd;")
    private static class64 field3691 = class44.method335((byte) 71, "Tue");

    @OriginalMember(owner = "client!gh", name = "H", descriptor = "Lcd;")
    public static class64 field3697 = class44.method335((byte) 71, "_labels");

    @OriginalMember(owner = "client!gh", name = "C", descriptor = "Lcd;")
    private static class64 field3692 = class44.method335((byte) 71, "Mon");

    @OriginalMember(owner = "client!gh", name = "J", descriptor = "Lcd;")
    private static class64 field3699 = class44.method335((byte) 71, "Fri");

    @OriginalMember(owner = "client!gh", name = "x", descriptor = "I")
    public static volatile int field3688 = 0;

    @OriginalMember(owner = "client!gh", name = "w", descriptor = "[I")
    public static int[] field3687 = new int[] { 1, 1, 1, 1, 4, 1, 1, 5, 6, 1, 5, 0, 7, 0, 4, 1, 7, 2, 1, 1, 6, 1, 1, 3, 6, 1, 7, 0, 0, 6, 7, 0, 1, 7, 6, 1, 1, 1, 5, 4, 3, 2, 1, 1, 0, 4, 1, 5 };

    @OriginalMember(owner = "client!gh", name = "N", descriptor = "I")
    public static int field3703 = -1;

    @OriginalMember(owner = "client!gh", name = "L", descriptor = "Lcd;")
    private static class64 field3701 = class44.method335((byte) 71, "Sat");

    @OriginalMember(owner = "client!gh", name = "E", descriptor = "Lcd;")
    private static class64 field3694 = class44.method335((byte) 71, "Sun");

    @OriginalMember(owner = "client!gh", name = "O", descriptor = "Lcd;")
    private static class64 field3704 = class44.method335((byte) 71, "Thu");

    @OriginalMember(owner = "client!gh", name = "S", descriptor = "I")
    public static int field3707 = 0;

    @OriginalMember(owner = "client!gh", name = "W", descriptor = "Lcd;")
    private static class64 field3710 = class44.method335((byte) 71, "Wed");

    @OriginalMember(owner = "client!gh", name = "T", descriptor = "Z")
    public static boolean field3708 = false;

    @OriginalMember(owner = "client!gh", name = "z", descriptor = "[Lcd;")
    public static class64[] field3690 = new class64[] { field3694, field3692, field3691, field3710, field3704, field3699, field3701 };

    @OriginalMember(owner = "client!gh", name = "y", descriptor = "I")
    public static int field3689;

    @OriginalMember(owner = "client!gh", name = "D", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!gh", name = "I", descriptor = "I")
    public static int field3698;

    @OriginalMember(owner = "client!gh", name = "K", descriptor = "I")
    public static int field3700;

    @OriginalMember(owner = "client!gh", name = "M", descriptor = "I")
    public static int field3702;

    @OriginalMember(owner = "client!gh", name = "Q", descriptor = "I")
    public static int field3705;

    @OriginalMember(owner = "client!gh", name = "R", descriptor = "I")
    public static int field3706;

    @OriginalMember(owner = "client!gh", name = "V", descriptor = "I")
    public static int field3709;

    @OriginalMember(owner = "client!gh", name = "G", descriptor = "[[Z")
    public static boolean[][] field3696;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(B)V", line = 6)
    public static void method1558(byte arg0) {
        field3696 = (boolean[][]) null;
        field3701 = null;
        field3697 = null;
        field3692 = null;
        field3710 = null;
        field3694 = null;
        field3690 = null;
        if (arg0 != -108) {
            field3688 = -46;
        }
        field3691 = null;
        field3687 = null;
        field3704 = null;
        field3699 = null;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(III)V", line = 42)
    public static final void method1559(int arg0, int arg1, int arg2) {
        field3700++;
        class88.field1601[arg0] = arg1;
        if (arg2 != -26319) {
            method1561((byte) 35);
        }
        class66 var3 = (class66) class196.field3339.method1151((long) arg0, 0);
        if (var3 == null) {
            class66 var4 = new class66(4611686018427387905L);
            class196.field3339.method1149(var4, (long) arg0, -45);
        } else if (var3.field1312 != 4611686018427387905L) {
            var3.field1312 = class154.method1114(true) + 500L | 0x4000000000000000L;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lqm;I)V", line = 74)
    public static final void method1560(class222 arg0, int arg1) {
        field3702++;
        class102.field1843 = arg0;
        if (arg1 != 2064) {
            field3687 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "(B)V", line = 106)
    public static final void method1561(byte arg0) {
        class54.field891 = class200.field3430;
        class9.field194 = class74.field1402;
        class161.field2834 = class306.field5235;
        class304.field5205 = class245.field4261;
        class315.field5339 = class307.field5253;
        class28.field452 = class199.field3402;
        class6.field159 = class61.field1191;
        class30.field508 = class107.field1986;
        class30.field501 = class133.field2363;
        class248.field4311 = class83.field1538;
        int var1 = -54 % ((arg0 + 11) / 49);
        class240.field4114 = class297.field5113;
        class182.field3120 = class60.field1041;
        class48.field800 = class74.field1401;
        class161.field2833 = class63.field1217;
        class53.field852 = class147.field2595;
        class198.field3385 = class159.field2810;
        class196.field3346 = class138.field2457;
        class138.field2448 = class74.field1411;
        class139.field2466 = class77.field1454;
        class81.field1495 = class99.field1793;
        class255.field4437 = class248.field4321;
        class40.field618 = class56.field943;
        class135.field2418 = class110.field2025;
        class252.field4390 = class251.field4379;
        class226.field3846 = class10.field211;
        class58.field958 = class298.field5139;
        class92.field1717 = class111.field2069;
        class185.field3170 = class166.field2903;
        class307.field5243 = class54.field879;
        class261.field4493 = class113.field2083;
        class89.field1604 = class264.field4525;
        class301.field5166 = class169.field2939;
        class47.field772 = class75.field1412;
        class275.field4727 = class236.field3982;
        class84.field1559 = class193.field3284;
        class213.field3588 = class236.field3989;
        class12.field235 = class142.field2498;
        class106.field1959 = class92.field1701;
        class315.field5346 = class315.field5331;
        class84.field1560 = class206.field3511;
        class304.field5195 = class241.field4158;
        class181.field3114 = class56.field951;
        class34.field561 = class130.field2316;
        class91.field1636 = class146.field2581;
        class309.field5256 = class124.field2246;
        class94.field1748 = class3.field24;
        class138.field2464 = class74.field1411;
        class17.field354 = class63.field1214;
        class121.field2180 = class19.field362;
        class297.field5127 = class71.field1382;
        class260.field4474 = class49.field811;
        class205.field3504 = class315.field5340;
        class132.field2357 = class41.field661;
        class149.field2609 = class89.field1603;
        class249.field4334 = class13.field293;
        class258.field4455 = class277.field4763;
        class47.field788 = class103.field1882;
        class76.field1431 = class32.field537;
        class34.field558 = class54.field897;
        class255.field4427 = class134.field2378;
        class131.field2319 = class34.field553;
        class151.field2697 = class75.field1418;
        class255.field4431 = class88.field1585;
        class240.field4112 = class275.field4715;
        class69.field1341 = class281.field4834;
        class180.field3095 = class240.field4099;
        class180.field3077 = class81.field1494;
        class154.field2732 = class55.field932;
        class138.field2453 = class274.field4705;
        field3706++;
        class189.field3253 = class173.field2989;
        class82.field1505 = class248.field4313;
        class224.field3823 = class84.field1558;
        class35.field577 = class197.field3354;
        class114.field2103 = class72.field1394;
        class157.field2777 = class47.field789;
        class246.field4291 = class181.field3110;
        class138.field2452 = class274.field4705;
        class211.field3561 = class273.field4692;
        class101.field1819 = class64.field1257;
        class223.field3802 = class244.field4243;
        class6.field143 = class61.field1191;
        class31.field523 = class27.field434;
        class113.field2080 = class63.field1216;
        class222.field3779 = class82.field1507;
        class143.field2512 = class298.field5128;
        class107.field1983 = class240.field4110;
        class134.field2381 = class315.field5347;
        class220.field3723 = class195.field3318;
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "([B)V", line = 453)
    public class218(byte[] arg0) {
        this.field3695 = arg0;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(BLse;)V", line = 470)
    public static final void method1562(byte arg0, class11 arg1) {
        class187.method1320(200000, arg1, 87);
        field3705++;
        if (arg0 < 43) {
            method1562((byte) 27, (class11) null);
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIZI)I", line = 497)
    public static final int method1563(int arg0, int arg1, boolean arg2, int arg3) {
        field3698++;
        int var4 = arg0 & 0x3;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return arg3;
        } else if (arg2) {
            return var4 == 2 ? 7 - arg1 : -arg3 + 7;
        } else {
            return 9;
        }
    }
}
