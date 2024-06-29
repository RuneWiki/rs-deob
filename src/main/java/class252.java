import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class252 {

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    public int field4226 = 0;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "I")
    public int field4228 = 0;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "Z")
    public boolean field4227 = false;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
    public static int field4225 = 0;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
    public static int field4229 = 0;

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "Lwa;")
    private static class75 field4239 = class66.method560("VOLL", false);

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "Lwa;")
    public static class75 field4237 = class66.method560("hint_mapmarkers", false);

    @OriginalMember(owner = "client!ve", name = "p", descriptor = "Lwa;")
    public static class75 field4240 = class66.method560("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3", false);

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "Lwa;")
    public static class75 field4234 = class66.method560("_labels", false);

    @OriginalMember(owner = "client!ve", name = "q", descriptor = "Lwa;")
    public static class75 field4241 = class66.method560("Lade Schrifts-=tze )2 ", false);

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
    public static int field4230;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "I")
    public static int field4233;

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "I")
    public static int field4236;

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "Loh;")
    public static class15 field4235;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "La;")
    public static class259 field4232;

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "Lsl;")
    public class92 field4238;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
    public ByteBuffer field4231;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(BI)V", line = 12)
    public static final void method1811(byte arg0, int arg1) {
        field4236++;
        int var2 = -67 % ((arg0 + 58) / 53);
        if (arg1 == 0) {
            return;
        }
        if (arg1 == 1) {
            class20.method128(-105);
        } else if (arg1 == 2) {
            method1814(-13424);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V", line = 35)
    public static void method1812(int arg0) {
        field4232 = null;
        field4235 = null;
        field4241 = null;
        if (arg0 != 0) {
            field4229 = -8;
        }
        field4234 = null;
        field4240 = null;
        field4239 = null;
        field4237 = null;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZIIIII)V", line = 69)
    public static final void method1813(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = class14.method74(class294.field5041, arg3, -1178441849, class90.field1495);
        field4233++;
        int var7 = class14.method74(class294.field5041, arg2, -1178441849, class90.field1495);
        int var8 = class14.method74(class288.field4956, arg5, -1178441849, class153.field2635);
        int var9 = class14.method74(class288.field4956, arg1, -1178441849, class153.field2635);
        for (int var10 = var6; var10 <= var7; var10++) {
            class150.method1151(7, class63.field1096[var10], var8, arg4, var9);
        }
        if (arg0) {
            field4241 = (class75) null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V", line = 94)
    private static final void method1814(int arg0) {
        class272.field4694 = class86.field1424;
        class143.field2465 = class28.field397;
        class237.field3988 = class286.field4930;
        class166.field2800 = class268.field4642;
        class279.field4837 = class245.field4127;
        class235.field3974 = class291.field4991;
        class108.field1824 = class40.field623;
        class247.field4174 = class137.field2343;
        class91.field1506 = class285.field4906;
        class43.field709 = class189.field3150;
        class65.field1119 = class96.field1549;
        class302.field5166 = class261.field4370;
        class126.field2174 = class126.field2185;
        class279.field4835 = class223.field3776;
        class59.field987 = class235.field3961;
        class97.field1597 = class163.field2779;
        class125.field2161 = class292.field5023;
        class10.field128 = class13.field177;
        class69.field1187 = class263.field4560;
        class219.field3741 = class276.field4747;
        class86.field1412 = class310.field5274;
        class291.field5003 = class63.field1099;
        class133.field2294 = class205.field3467;
        class86.field1418 = class310.field5274;
        field4230++;
        class161.field2732 = class214.field3646;
        class305.field5211 = class162.field2750;
        class240.field4063 = class294.field5048;
        class245.field4122 = class138.field2368;
        class51.field834 = class39.field612;
        class67.field1177 = class25.field320;
        class106.field1790 = class299.field5111;
        class251.field4213 = class171.field2880;
        class244.field4110 = class156.field2666;
        class104.field1752 = class25.field322;
        class113.field1913 = class144.field2482;
        class197.field3301 = class78.field1347;
        class199.field3339 = class25.field329;
        class94.field1535 = class89.field1480;
        class300.field5133 = class152.field2622;
        class117.field1988 = class240.field4064;
        class106.field1782 = class30.field439;
        class8.field113 = class130.field2244;
        class204.field3452 = class276.field4742;
        class65.field1121 = class151.field2602;
        class34.field505 = class115.field1951;
        class189.field3154 = class267.field4606;
        class138.field2370 = class306.field5224;
        class297.field5079 = class55.field912;
        class306.field5223 = class233.field3951;
        class11.field152 = class95.field1539;
        class285.field4897 = class246.field4154;
        class95.field1538 = class240.field4052;
        class63.field1102 = class167.field2824;
        class155.field2652 = class115.field1945;
        class45.field734 = class172.field2907;
        class90.field1493 = class6.field76;
        class253.field4259 = class6.field81;
        class54.field892 = class130.field2246;
        class95.field1544 = class241.field4070;
        class310.field5289 = class95.field1542;
        if (arg0 != -13424) {
            field4232 = (class259) null;
        }
        class202.field3429 = class111.field1892;
        class88.field1461 = class215.field3674;
        class34.field497 = class89.field1482;
        class255.field4268 = class127.field2207;
        class175.field2936 = class177.field2986;
        class40.field625 = class198.field3317;
        class26.field343 = class125.field2155;
        class204.field3456 = class155.field2664;
        class48.field781 = class48.field784;
        class301.field5154 = class240.field4056;
        class261.field4373 = class55.field910;
        class216.field3690 = class187.field3126;
        class229.field3896 = class89.field1472;
        class166.field2805 = class268.field4642;
        class304.field5200 = field4239;
        class299.field5126 = class273.field4718;
        class19.field262 = class198.field3329;
        class199.field3351 = class261.field4368;
        class161.field2741 = class182.field3037;
        class112.field1911 = class182.field3031;
        class120.field2018 = class216.field3694;
        class279.field4830 = class182.field3035;
        class106.field1787 = class123.field2060;
        class31.field449 = class198.field3326;
        class39.field601 = class60.field1053;
        class282.field4861 = class175.field2944;
        class43.field705 = class213.field3628;
        class139.field2399 = class200.field3385;
        class173.field2920 = class79.field1350;
        class198.field3318 = class304.field5198;
        class116.field1962 = class78.field1346;
        class8.field107 = class130.field2244;
        class207.field3510 = class214.field3631;
    }
}
