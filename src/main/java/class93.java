import java.awt.Component;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public abstract class class93 {

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "[I")
    public static int[] field1595 = new int[200];

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "Z")
    public static boolean field1593 = false;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
    public static int field1596 = 0;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "J")
    public static volatile long field1594 = 0L;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "Lve;")
    public static class255 field1598 = class87.method607(86, "::wm3");

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "J")
    public static long field1592 = 0L;

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "[I")
    public static int[] field1601 = new int[2000];

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
    public static int field1597 = 0;

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
    public static int field1600 = 0;

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "I")
    public static int field1604 = 0;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "I")
    public static int field1605;

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "Lfj;")
    public static class228 field1602;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Ljava/lang/String;B)Lve;", line = 42)
    public static final class255 method694(String arg0, byte arg1) {
        byte[] var2;
        try {
            var2 = arg0.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var7) {
            var2 = arg0.getBytes();
        }
        field1599++;
        class255 var4 = new class255();
        var4.field4343 = 0;
        var4.field4297 = var2;
        for (int var5 = 0; var5 < var2.length; var5++) {
            if (var2[var5] != 0) {
                var2[var4.field4343++] = var2[var5];
            }
        }
        int var6 = -114 / ((67 - arg1) / 51);
        return var4;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Z)V", line = 94)
    public static final void method696(boolean arg0) {
        class313.field5306 = class91.field1553;
        class285.field4902 = class150.field2545;
        class309.field5252 = class269.field4618;
        class160.field2704 = class70.field1113;
        class196.field3241 = class106.field1767;
        class249.field4177 = class116.field1975;
        class210.field3581 = class149.field2510;
        class18.field267 = class2.field36;
        class96.field1666 = class42.field662;
        class30.field501 = class150.field2551;
        class125.field2073 = class260.field4412;
        class197.field3415 = class168.field2822;
        class136.field2258 = class92.field1590;
        class74.field1223 = class76.field1256;
        class196.field3226 = class92.field1591;
        class151.field2563 = class279.field4786;
        class16.field229 = class301.field5180;
        field1603++;
        class58.field882 = class168.field2828;
        class218.field3693 = class24.field376;
        class87.field1400 = class13.field171;
        class24.field377 = class108.field1820;
        class47.field722 = class51.field780;
        class154.field2625 = class305.field5207;
        class173.field2857 = class24.field372;
        class220.field3705 = class254.field4290;
        class247.field4145 = class49.field736;
        class120.field2006 = class1.field20;
        class158.field2672 = class7.field105;
        class106.field1781 = class135.field2236;
        if (!arg0) {
            field1600 = 57;
        }
        class33.field527 = class91.field1561;
        class314.field5332 = class242.field4056;
        class67.field1001 = class261.field4432;
        class289.field4973 = class277.field4748;
        class69.field1035 = class59.field902;
        class37.field575 = class292.field5010;
        class210.field3582 = class167.field2806;
        class241.field4009 = class75.field1241;
        class276.field4741 = class111.field1877;
        class275.field4729 = class297.field5077;
        class274.field4719 = class158.field2669;
        class107.field1803 = class116.field1967;
        class293.field5027 = class114.field1949;
        class236.field3876 = class186.field3005;
        class104.field1748 = class54.field847;
        class165.field2786 = class56.field877;
        class288.field4954 = class14.field196;
        class59.field908 = class58.field892;
        class111.field1861 = class137.field2279;
        class43.field673 = class121.field2023;
        class141.field2339 = class59.field906;
        class163.field2763 = class205.field3528;
        class213.field3630 = class70.field1051;
        class254.field4280 = class285.field4906;
        class84.field1349 = class127.field2098;
        client.field4028 = class17.field253;
        class124.field2071 = class90.field1536;
        class68.field1019 = class82.field1326;
        class191.field3050 = class190.field3036;
        class218.field3684 = class41.field641;
        class2.field32 = class19.field319;
        class6.field90 = class133.field2220;
        class54.field860 = class25.field389;
        class268.field4586 = class135.field2232;
        class9.field129 = class20.field322;
        class240.field4008 = class73.field1206;
        class282.field4852 = class256.field4376;
        class60.field937 = class3.field52;
        class225.field3764 = class113.field1913;
        class291.field4996 = class91.field1562;
        class7.field98 = class53.field834;
        class25.field379 = class217.field3683;
        class236.field3922 = class150.field2542;
        class125.field2072 = class137.field2299;
        class113.field1905 = class121.field2022;
        class128.field2110 = class275.field4727;
        class11.field151 = class22.field347;
        class54.field849 = class163.field2756;
        class1.field26 = class310.field5294;
        class221.field3726 = class75.field1237;
        class249.field4178 = class184.field2968;
        class50.field748 = class282.field4853;
        class187.field3009 = class173.field2856;
        class289.field4971 = class152.field2586;
        class196.field3225 = class274.field4707;
        class187.field3013 = class173.field2856;
        class216.field3660 = class186.field3001;
        class213.field3624 = class70.field1051;
        class249.field4201 = class116.field1975;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V", line = 454)
    public static void method697(int arg0) {
        field1601 = null;
        field1602 = null;
        field1598 = null;
        if (arg0 == 0) {
            field1595 = null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public abstract void method693(byte arg0, Component arg1);

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method695(Component arg0, int arg1);

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)I")
    public abstract int method698(byte arg0);
}
