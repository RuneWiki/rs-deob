import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class298 {

    @OriginalMember(owner = "client!jm", name = "h", descriptor = "[Lce;")
    public static class126[] field4953 = new class126[200];

    @OriginalMember(owner = "client!jm", name = "j", descriptor = "I")
    public static volatile int field4955 = 0;

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "Lce;")
    private static class126 field4951 = class206.method1445(-7923, "Hidden");

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "Lce;")
    public static class126 field4949 = field4951;

    @OriginalMember(owner = "client!jm", name = "m", descriptor = "Ljava/util/Calendar;")
    public static Calendar field4958 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "I")
    public static int field4946;

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "I")
    public static int field4948;

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "I")
    public static int field4950;

    @OriginalMember(owner = "client!jm", name = "g", descriptor = "I")
    public static int field4952;

    @OriginalMember(owner = "client!jm", name = "i", descriptor = "I")
    public static int field4954;

    @OriginalMember(owner = "client!jm", name = "k", descriptor = "I")
    public static int field4956;

    @OriginalMember(owner = "client!jm", name = "l", descriptor = "I")
    public static int field4957;

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "[[B")
    public static byte[][] field4947;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(B)V", line = 7)
    public static final void method2005(byte arg0) {
        field4948++;
        class57.field890 = new class129();
        int var1 = 19 % ((18 - arg0) / 62);
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lbb;Z)Lfj;", line = 17)
    public static final class286 method2006(class134 arg0, boolean arg1) {
        field4954++;
        if (!arg1) {
            method2010((byte) 42);
        }
        return new class286(arg0.method931((byte) 78), arg0.method931((byte) 127), arg0.method931((byte) 89), arg0.method931((byte) 71), arg0.method931((byte) 103), arg0.method931((byte) 47), arg0.method931((byte) 127), arg0.method931((byte) 67), arg0.method949(20732), arg0.method948(-127));
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(II[BI)I", line = 32)
    public static final int method2007(int arg0, int arg1, byte[] arg2, int arg3) {
        field4952++;
        int var4 = -1;
        int var5 = arg1;
        if (arg3 != 785922280) {
            method2006((class134) null, false);
        }
        while (var5 < arg0) {
            var4 = class84.field1337[(arg2[var5] ^ var4) & 0xFF] ^ var4 >>> 8;
            var5++;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)V", line = 57)
    public static void method2008(int arg0) {
        field4951 = null;
        field4953 = null;
        field4958 = null;
        field4947 = (byte[][]) null;
        field4949 = null;
        if (arg0 != -26495) {
            method2012(-103, (byte) 67, (class313) null, 72);
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIILja;Lja;IIIIJ)V", line = 73)
    public static final void method2009(int arg0, int arg1, int arg2, int arg3, class114 arg4, class114 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class107 var12 = new class107();
        var12.field1678 = arg10;
        var12.field1688 = arg1 * 128 + 64;
        var12.field1681 = arg2 * 128 + 64;
        var12.field1689 = arg3;
        var12.field1684 = arg4;
        var12.field1683 = arg5;
        var12.field1692 = arg6;
        var12.field1685 = arg7;
        var12.field1679 = arg8;
        var12.field1695 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class297.field4940[var13][arg1][arg2] == null) {
                class297.field4940[var13][arg1][arg2] = new class5(var13, arg1, arg2);
            }
        }
        class297.field4940[arg0][arg1][arg2].field49 = var12;
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(B)V", line = 103)
    public static final void method2010(byte arg0) {
        class239.field4033 = class205.field3518;
        class33.field478 = class151.field2766;
        class269.field4546 = class288.field4779;
        class48.field747 = class185.field3198;
        class142.field2582 = class251.field4200;
        class65.field1093 = class181.field3143;
        class16.field218 = class195.field3351;
        class71.field1161 = class158.field2855;
        class166.field2964 = class190.field3252;
        field4949 = class239.field4035;
        class81.field1310 = class292.field4839;
        class128.field2207 = class227.field3837;
        class74.field1202 = class13.field182;
        class58.field902 = class272.field4580;
        class75.field1218 = class221.field3745;
        class252.field4220 = class90.field1409;
        class33.field494 = class18.field250;
        class90.field1416 = class55.field831;
        class318.field5457 = class242.field4102;
        class45.field696 = class137.field2380;
        class130.field2242 = class243.field4118;
        class286.field4731 = class315.field5405;
        class190.field3271 = class153.field2798;
        class45.field692 = class247.field4161;
        class59.field938 = client.field2072;
        class244.field4125 = class73.field1167;
        class13.field175 = class37.field543;
        class46.field711 = class99.field1597;
        class293.field4871 = class19.field264;
        class226.field3800 = class287.field4765;
        class226.field3807 = class134.field2330;
        class27.field381 = class117.field1976;
        class26.field370 = class96.field1544;
        class242.field4101 = class142.field2589;
        class290.field4812 = class117.field1982;
        class40.field641 = class219.field3684;
        class89.field1399 = class95.field1512;
        class88.field1383 = class288.field4781;
        class166.field2961 = class165.field2948;
        class252.field4229 = class51.field786;
        class278.field4638 = class46.field708;
        class93.field1455 = class151.field2767;
        class4.field20 = class55.field837;
        class291.field4818 = class57.field876;
        class28.field388 = class82.field1325;
        class153.field2799 = class52.field801;
        class7.field85 = class91.field1427;
        class65.field1096 = class272.field4572;
        class206.field3526 = class239.field4039;
        class207.field3547 = class317.field5436;
        class214.field3630 = class206.field3533;
        class159.field2869 = class118.field1991;
        class95.field1508 = class247.field4160;
        class88.field1387 = class44.field678;
        class186.field3220 = class288.field4788;
        class96.field1529 = class97.field1566;
        class122.field2044 = class21.field284;
        class23.field339 = class120.field2009;
        class241.field4061 = class16.field228;
        class8.field100 = class162.field2915;
        class270.field4561 = class282.field4684;
        class302.field5036 = class131.field2262;
        class71.field1159 = class158.field2855;
        class73.field1173 = class182.field3178;
        class320.field5488 = class95.field1507;
        class176.field3100 = class97.field1567;
        class304.field5092 = class262.field4379;
        class307.field5188 = class273.field4594;
        class103.field1646 = class168.field2978;
        if (arg0 != 44) {
            return;
        }
        class98.field1580 = class249.field4171;
        class186.field3226 = class290.field4801;
        class193.field3297 = class142.field2571;
        class81.field1308 = class50.field781;
        class81.field1302 = class97.field1568;
        field4956++;
        class283.field4714 = class301.field4989;
        class46.field714 = class99.field1597;
        class124.field2101 = class289.field4798;
        class116.field1957 = class5.field35;
        class58.field910 = class272.field4580;
        class32.field462 = class272.field4570;
        class294.field4907 = client.field2066;
        class177.field3123 = class95.field1518;
        class186.field3208 = class181.field3141;
        class140.field2553 = class181.field3151;
        class44.field679 = class172.field3044;
        class170.field3031 = class99.field1592;
        class285.field4722 = class314.field5376;
        class59.field946 = class321.field5494;
        class95.field1514 = class176.field3099;
        class32.field475 = class47.field722;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IILgd;)V", line = 444)
    public static final void method2011(int arg0, int arg1, class138 arg2) {
        field4946++;
        if (arg2.field2455 > class249.field4174) {
            class41.method259(-1, arg2);
        } else if (class249.field4174 > arg2.field2479) {
            class282.method1885(arg2, 255);
        } else {
            class297.method2002(arg2, 27461);
        }
        if (arg2.field2461 < 128 || arg2.field2487 < 128 || arg2.field2461 >= 13184 || arg2.field2487 >= 13184) {
            arg2.field2476 = -1;
            arg2.field2455 = 0;
            arg2.field2479 = 0;
            arg2.field2445 = -1;
            arg2.field2461 = arg2.field2460[0] * 128 + arg2.method1013(false) * 64;
            arg2.field2487 = arg2.field2471[0] * 128 + arg2.method1013(false) * 64;
            arg2.method1007(20703);
        }
        if (arg0 != 64) {
            return;
        }
        if (class286.field4744 == arg2 && (arg2.field2461 < 1536 || arg2.field2487 < 1536 || arg2.field2461 >= 11776 || arg2.field2487 >= 11776)) {
            arg2.field2479 = 0;
            arg2.field2445 = -1;
            arg2.field2455 = 0;
            arg2.field2476 = -1;
            arg2.field2461 = arg2.field2460[0] * 128 + arg2.method1013(false) * 64;
            arg2.field2487 = arg2.field2471[0] * 128 + (arg2.method1013(false) * 64);
            arg2.method1007(20703);
        }
        class24.method116(arg2, 0);
        class317.method2209(1, arg2);
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IBLcc;I)Z", line = 492)
    public static final boolean method2012(int arg0, byte arg1, class313 arg2, int arg3) {
        if (arg1 != -110) {
            field4947 = (byte[][]) ((byte[][]) null);
        }
        byte[] var4 = arg2.method2173(arg0, arg3, (byte) -99);
        field4950++;
        if (var4 == null) {
            return false;
        } else {
            class278.method1865(0, var4);
            return true;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ILcc;)V", line = 517)
    public static final void method2013(int arg0, class313 arg1) {
        class306.field5133 = arg1;
        field4957++;
        if (arg0 != 128) {
            method2007(62, 40, (byte[]) null, 94);
        }
    }
}
