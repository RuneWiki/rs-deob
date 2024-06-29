import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class2 {

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "S")
    public static short field12 = 32767;

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "I")
    public static int field15 = 0;

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "[Luf;")
    public static class168[] field10;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIIII)V", line = 5)
    public static final void method4(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field14++;
        int var6 = 0;
        int var7 = arg0;
        class133.method925(14678, arg4 - arg2, arg1, arg4 + arg2, class284.field4810[arg3]);
        int var8 = arg2 * arg2;
        int var9 = arg0 * arg0;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        if (arg5 > -73) {
            field15 = -29;
        }
        int var12 = var8 << 2;
        int var13 = arg0 << 1;
        int var14 = (1 - var13) * var8 + var10;
        int var15 = var9 << 2;
        int var16 = ((arg0 << 1) - 3) * var11;
        int var17 = (var6 + 1) * var15;
        int var18 = ((var6 << 1) + 3) * var10;
        int var19 = (arg0 - 1) * var12;
        int var20 = var9 - ((var13 - 1) * var11);
        while (var7 > 0) {
            if (var14 < 0) {
                while (var14 < 0) {
                    var14 += var18;
                    var20 += var17;
                    var17 += var15;
                    var18 += var15;
                    var6++;
                }
            }
            if (var20 < 0) {
                var20 += var17;
                var17 += var15;
                var6++;
                var14 += var18;
                var18 += var15;
            }
            var7--;
            var14 += -var19;
            int var21 = arg3 + var7;
            var19 -= var12;
            int var22 = arg3 - var7;
            var20 += -var16;
            int var23 = arg4 + var6;
            var16 -= var12;
            int var24 = arg4 - var6;
            class133.method925(14678, var24, arg1, var23, class284.field4810[var22]);
            class133.method925(14678, var24, arg1, var23, class284.field4810[var21]);
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Z)V", line = 90)
    public static void method5(boolean arg0) {
        if (arg0) {
            field10 = null;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIIILf;IJZ)Z", line = 105)
    public static final boolean method6(int arg0, int arg1, int arg2, int arg3, int arg4, class231 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class150.method1033(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V", line = 146)
    public static final void method7(int arg0) {
        class121.field1885 = class211.field3472;
        class273.field4584 = class150.field2330;
        class58.field773 = class155.field2452;
        class270.field4541 = class65.field875;
        class187.field2954 = class140.field2168;
        class154.field2429 = class247.field4231;
        class287.field4843 = class79.field1135;
        class51.field626 = class24.field298;
        class127.field1957 = class128.field1999;
        class284.field4803 = class298.field5043;
        class285.field4829 = class144.field2226;
        if (arg0 != 19345) {
            field11 = 75;
        }
        class144.field2212 = class68.field903;
        class297.field5026 = class196.field3212;
        class183.field2939 = class231.field3723;
        class282.field4731 = class86.field1337;
        class159.field2522 = class165.field2643;
        class256.field4362 = class62.field819;
        class288.field4855 = class78.field1087;
        class15.field174 = class91.field1411;
        class211.field3470 = class71.field960;
        class46.field572 = class141.field2181;
        class57.field750 = class161.field2603;
        class275.field4624 = class142.field2191;
        class288.field4853 = class78.field1087;
        class272.field4576 = class103.field1596;
        class157.field2480 = class119.field1862;
        class24.field287 = class300.field5089;
        class280.field4709 = class76.field1033;
        field8++;
        class70.field920 = class195.field3162;
        class219.field3562 = class248.field4248;
        class199.field3282 = class166.field2667;
        class55.field719 = class36.field412;
        class217.field3546 = class156.field2462;
        class128.field1990 = class114.field1780;
        class166.field2673 = class300.field5086;
        class178.field2877 = class187.field2970;
        class252.field4301 = class159.field2503;
        class64.field857 = class38.field480;
        class295.field5002 = client.field4929;
        class20.field245 = class292.field4918;
        class85.field1290 = class50.field614;
        class227.field3684 = class180.field2905;
        class150.field2323 = class198.field3270;
        class111.field1733 = class279.field4689;
        class154.field2432 = class247.field4231;
        class199.field3279 = class78.field1079;
        class18.field214 = class280.field4703;
        class267.field4505 = class182.field2923;
        class70.field936 = class276.field4646;
        class85.field1328 = class78.field1070;
        class126.field1949 = class270.field4545;
        class183.field2942 = class252.field4285;
        class141.field2179 = class144.field2224;
        class234.field3765 = class229.field3695;
        class85.field1291 = class291.field4916;
        class101.field1577 = class273.field4592;
        class153.field2360 = class44.field537;
        class278.field4667 = class38.field474;
        class72.field967 = class43.field525;
        class118.field1838 = class298.field5044;
        class122.field1896 = class64.field862;
        class182.field2924 = class68.field899;
        class175.field2843 = class196.field3221;
        class266.field4482 = class55.field715;
        class280.field4706 = class26.field327;
        class95.field1528 = class22.field278;
        class17.field198 = class190.field3076;
        class242.field3959 = class114.field1785;
        class217.field3539 = class70.field937;
        class171.field2794 = class64.field860;
        class194.field3151 = class60.field786;
        class20.field240 = class206.field3380;
        class127.field1955 = class73.field980;
        class165.field2635 = class244.field4155;
        class83.field1249 = class126.field1952;
        class179.field2891 = class187.field2979;
        class252.field4304 = class67.field879;
        class121.field1879 = class211.field3472;
        class282.field4750 = class5.field72;
        class55.field713 = class182.field2933;
        class26.field333 = class18.field207;
        class271.field4552 = class242.field4116;
        class238.field3808 = class20.field246;
        class282.field4733 = class291.field4890;
        class154.field2428 = class166.field2669;
        class96.field1533 = class115.field1792;
        class155.field2448 = class206.field3385;
        class289.field4881 = class237.field3789;
        class217.field3548 = class253.field4338;
        class61.field805 = class180.field2897;
        class126.field1948 = class175.field2847;
        class297.field5023 = class282.field4771;
    }
}
