import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class154 extends class236 {

    @OriginalMember(owner = "client!db", name = "x", descriptor = "Lsg;")
    private static class30 field2915 = class167.method1221((byte) 33, "Schrifts-=tze geladen)3");

    @OriginalMember(owner = "client!db", name = "v", descriptor = "I")
    public static int field2913 = 0;

    @OriginalMember(owner = "client!db", name = "t", descriptor = "I")
    public int field2911;

    @OriginalMember(owner = "client!db", name = "u", descriptor = "I")
    public static int field2912;

    @OriginalMember(owner = "client!db", name = "w", descriptor = "I")
    public int field2914;

    @OriginalMember(owner = "client!db", name = "y", descriptor = "I")
    public static int field2916;

    @OriginalMember(owner = "client!db", name = "z", descriptor = "I")
    public int field2917;

    @OriginalMember(owner = "client!db", name = "A", descriptor = "I")
    public static int field2918;

    @OriginalMember(owner = "client!db", name = "B", descriptor = "I")
    public int field2919;

    @OriginalMember(owner = "client!db", name = "C", descriptor = "I")
    public static int field2920;

    @OriginalMember(owner = "client!db", name = "E", descriptor = "I")
    public static int field2921;

    @OriginalMember(owner = "client!db", name = "G", descriptor = "I")
    public int field2923;

    @OriginalMember(owner = "client!db", name = "H", descriptor = "I")
    public int field2924;

    @OriginalMember(owner = "client!db", name = "J", descriptor = "I")
    public int field2926;

    @OriginalMember(owner = "client!db", name = "K", descriptor = "I")
    public int field2927;

    @OriginalMember(owner = "client!db", name = "L", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!db", name = "N", descriptor = "I")
    public int field2930;

    @OriginalMember(owner = "client!db", name = "O", descriptor = "I")
    public int field2931;

    @OriginalMember(owner = "client!db", name = "P", descriptor = "I")
    public int field2932;

    @OriginalMember(owner = "client!db", name = "Q", descriptor = "I")
    public int field2933;

    @OriginalMember(owner = "client!db", name = "R", descriptor = "I")
    public int field2934;

    @OriginalMember(owner = "client!db", name = "S", descriptor = "I")
    public static int field2935;

    @OriginalMember(owner = "client!db", name = "T", descriptor = "I")
    public int field2936;

    @OriginalMember(owner = "client!db", name = "U", descriptor = "I")
    public int field2937;

    @OriginalMember(owner = "client!db", name = "V", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!db", name = "X", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!db", name = "Y", descriptor = "I")
    public int field2941;

    @OriginalMember(owner = "client!db", name = "Z", descriptor = "I")
    public int field2942;

    @OriginalMember(owner = "client!db", name = "F", descriptor = "Lqf;")
    public class122 field2922;

    @OriginalMember(owner = "client!db", name = "M", descriptor = "Lid;")
    public class215 field2929;

    @OriginalMember(owner = "client!db", name = "I", descriptor = "Lbd;")
    public class258 field2925;

    @OriginalMember(owner = "client!db", name = "W", descriptor = "Lm;")
    public class38 field2939;

    @OriginalMember(owner = "client!db", name = "s", descriptor = "[I")
    public static int[] field2910;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V")
    public static final void method1151(byte arg0) {
        if (class242.field4331 < 0) {
            class32.field811 = -1;
            class242.field4331 = 0;
            class41.field1014 = -1;
        }
        if (arg0 > -99) {
            field2916 = 45;
        }
        field2940++;
        if (class98.field1979 < class242.field4331) {
            class41.field1014 = -1;
            class242.field4331 = class98.field1979;
            class32.field811 = -1;
        }
        if (class241.field4304 < 0) {
            class241.field4304 = 0;
            class41.field1014 = -1;
            class32.field811 = -1;
        }
        if (class241.field4304 > class53.field1179) {
            class32.field811 = -1;
            class241.field4304 = class53.field1179;
            class41.field1014 = -1;
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(III)V")
    public static final void method1152(int arg0, int arg1, int arg2) {
        field2918++;
        if (arg1 < -45 && class246.field4382 != 0 && arg0 != -1) {
            class221.method1595(class113.field2243, arg0, 0, class246.field4382, false, (byte) -84);
            class11.field223 = true;
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(Z)V")
    public static final void method1153(boolean arg0) {
        if (arg0) {
            method1156((byte) 48);
        }
        field2935++;
        int var1 = class223.field4000.method1456(class269.field4737);
        for (int var2 = 0; var2 < class52.field1165; var2++) {
            int var6 = class223.field4000.method1456(class109.method864(0, var2));
            if (var1 < var6) {
                var1 = var6;
            }
        }
        int var3 = class52.field1165 * 15 + 21;
        var1 += 8;
        int var4 = class5.field77 - (var1 / 2);
        int var5 = class219.field3960;
        if (class15.field324 < (var1 + var4)) {
            var4 = class15.field324 - var1;
        }
        if (class238.field4238 < var3 + var5) {
            var5 = class238.field4238 - var3;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        if (class93.field1864 == 1) {
            if (class5.field77 == class197.field3571 && class273.field4793 == class219.field3960) {
                class202.field3594 = class52.field1165 * 15 + 22;
                class169.field3187 = var4;
                class208.field3744 = var5;
                class93.field1864 = 0;
                class94.field1890 = true;
                class163.field3039 = var1;
            }
        } else if (class5.field77 == class32.field817 && class219.field3960 == class183.field3365) {
            class208.field3744 = var5;
            class93.field1864 = 0;
            class169.field3187 = var4;
            class163.field3039 = var1;
            class94.field1890 = true;
            class202.field3594 = class52.field1165 * 15 + 22;
        } else {
            class93.field1864 = 1;
            class273.field4793 = class183.field3365;
            class197.field3571 = class32.field817;
        }
    }

    @OriginalMember(owner = "client!db", name = "d", descriptor = "(I)V")
    public static final void method1154(int arg0) {
        if (arg0 != -7307) {
            field2913 = 28;
        }
        class134.field2621.method1650(arg0 ^ 0xFFFFE314);
        field2938++;
        class49.field1111.method1650(73);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lmc;ZZLmc;Lwi;)V")
    public static final void method1155(class151 arg0, boolean arg1, boolean arg2, class151 arg3, class218 arg4) {
        class127.field2471 = arg0;
        if (arg1) {
            return;
        }
        class122.field2394 = arg2;
        class160.field3011 = arg3;
        field2928++;
        int var5 = class160.field3011.method1108((byte) 19) - 1;
        class189.field3442 = class160.field3011.method1124(var5, -35) + var5 * 256;
        class175.field3255 = arg4;
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(B)V")
    public static void method1156(byte arg0) {
        field2910 = null;
        if (arg0 != 31) {
            field2913 = 100;
        }
        field2915 = null;
    }

    @OriginalMember(owner = "client!db", name = "e", descriptor = "(I)V")
    public static final void method1157(int arg0) {
        class61.field1318 = class117.field2313;
        class242.field4330 = class88.field1798;
        class116.field2291 = class160.field3012;
        class129.field2553 = class5.field72;
        class224.field4018 = class203.field3619;
        class242.field4335 = class20.field367;
        class22.field416 = class254.field4495;
        class1.field2 = class196.field3544;
        class163.field3031 = class270.field4759;
        class74.field1663 = class107.field2157;
        class266.field4684 = class63.field1375;
        class245.field4378 = class252.field4447;
        class204.field3639 = client.field3800;
        class68.field1493 = class270.field4754;
        class270.field4744 = class175.field3263;
        class63.field1366 = client.field3802;
        class238.field4244 = class182.field3345;
        class263.field4656 = class219.field3958;
        class124.field2424 = class207.field3727;
        class117.field2310 = class9.field173;
        class96.field1949 = class190.field3461;
        class136.field2663 = class135.field2648;
        class255.field4497 = class256.field4514;
        class246.field4380 = class114.field2255;
        class129.field2548 = class194.field3497;
        class88.field1801 = class47.field1072;
        class273.field4784 = class77.field1686;
        class145.field2780 = class48.field1106;
        class23.field439 = class179.field3313;
        class141.field2727 = class52.field1173;
        class28.field538 = class109.field2190;
        class137.field2671 = class186.field3428;
        class124.field2425 = class207.field3727;
        class212.field3819 = class69.field1522;
        class200.field3580 = class117.field2317;
        class203.field3620 = class163.field3035;
        class57.field1246 = class9.field174;
        class232.field4138 = class100.field2035;
        class109.field2194 = class259.field4593;
        class106.field2133 = class197.field3568;
        class205.field3672 = class40.field1002;
        class59.field1274 = class30.field619;
        class44.field1047 = class173.field3224;
        class276.field4819 = class224.field4015;
        class228.field4078 = class224.field4007;
        class102.field2070 = class138.field2702;
        class33.field822 = class137.field2678;
        class93.field1866 = class263.field4642;
        class100.field2038 = class129.field2544;
        class115.field2273 = class49.field1116;
        class90.field1826 = class15.field317;
        field2920++;
        class202.field3603 = class233.field4152;
        class129.field2542 = class209.field3752;
        class273.field4788 = class43.field1026;
        class129.field2550 = class189.field3447;
        class54.field1201 = class126.field2458;
        class68.field1478 = class172.field3222;
        class183.field3361 = field2915;
        class219.field3953 = class88.field1803;
        class49.field1109 = class92.field1855;
        class1.field12 = class190.field3466;
        class255.field4501 = class238.field4241;
        class160.field3016 = class168.field3089;
        class204.field3653 = client.field3800;
        class28.field521 = class108.field2185;
        class93.field1868 = class263.field4642;
        class53.field1177 = class231.field4107;
        class44.field1034 = class58.field1270;
        class73.field1645 = class96.field1953;
        if (arg0 != 22969) {
            field2916 = -117;
        }
        class266.field4683 = class149.field2842;
        class87.field1778 = class23.field429;
        class227.field4058 = class277.field4833;
        class67.field1468 = class183.field3377;
        class132.field2593 = class133.field2613;
        class129.field2546 = class219.field3961;
        class269.field4737 = class155.field2947;
        class122.field2396 = class185.field3387;
        class241.field4306 = class235.field4194;
        class60.field1302 = class201.field3584;
        class25.field473 = class277.field4837;
        class179.field3319 = class117.field2298;
        class106.field2126 = class35.field860;
        class276.field4814 = class104.field2091;
        class31.field764 = class228.field4070;
        class227.field4059 = class202.field3599;
        class31.field796 = class21.field397;
        class265.field4678 = class92.field1861;
        class243.field4339 = class230.field4090;
    }

    @OriginalMember(owner = "client!db", name = "f", descriptor = "(I)V")
    public final void method1158(int arg0) {
        field2912++;
        this.field2922 = null;
        if (arg0 != -1) {
            method1151((byte) -61);
        }
        this.field2925 = null;
        this.field2929 = null;
        this.field2939 = null;
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(B)V")
    public static final void method1159(byte arg0) {
        class277.field4830.method1652(-8259);
        class121.field2376.method1652(-8259);
        if (arg0 == 101) {
            class270.field4758.method1652(-8259);
            class102.field2071.method1652(-8259);
            field2921++;
        }
    }
}
