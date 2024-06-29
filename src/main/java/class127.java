import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class127 {

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "I")
    public int field3036 = 0;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public int field3026 = 0;

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "Laf;")
    public static class7 field3035 = class48.method406(40, " )2> <col=ffffff>");

    @OriginalMember(owner = "client!sb", name = "v", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3046 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!sb", name = "D", descriptor = "Laf;")
    public static class7 field3054 = class48.method406(40, "Hidden)2");

    @OriginalMember(owner = "client!sb", name = "C", descriptor = "Laf;")
    private static class7 field3053 = class48.method406(40, " from your ignore list first");

    @OriginalMember(owner = "client!sb", name = "I", descriptor = "Laf;")
    public static class7 field3058 = field3053;

    @OriginalMember(owner = "client!sb", name = "E", descriptor = "Laf;")
    private static class7 field3055 = class48.method406(40, "purple:");

    @OriginalMember(owner = "client!sb", name = "y", descriptor = "Laf;")
    public static class7 field3049 = field3055;

    @OriginalMember(owner = "client!sb", name = "B", descriptor = "Laf;")
    public static class7 field3052 = field3055;

    @OriginalMember(owner = "client!sb", name = "A", descriptor = "Lgd;")
    public static class46 field3051 = new class46(128);

    @OriginalMember(owner = "client!sb", name = "L", descriptor = "I")
    public static int field3061 = -1;

    @OriginalMember(owner = "client!sb", name = "M", descriptor = "I")
    public static int field3062 = -1;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
    public int field3025;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
    public int field3027;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
    public int field3028;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
    public int field3029;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
    public static int field3030;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
    public int field3031;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "I")
    public int field3033;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
    public static int field3034;

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "I")
    public static int field3038;

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "I")
    public static int field3039;

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "I")
    public static int field3040;

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "I")
    public int field3041;

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "I")
    public int field3042;

    @OriginalMember(owner = "client!sb", name = "t", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!sb", name = "u", descriptor = "I")
    public int field3045;

    @OriginalMember(owner = "client!sb", name = "w", descriptor = "I")
    public int field3047;

    @OriginalMember(owner = "client!sb", name = "x", descriptor = "I")
    public int field3048;

    @OriginalMember(owner = "client!sb", name = "z", descriptor = "I")
    public static int field3050;

    @OriginalMember(owner = "client!sb", name = "F", descriptor = "I")
    public static int field3056;

    @OriginalMember(owner = "client!sb", name = "s", descriptor = "Lod;")
    public class101 field3043;

    @OriginalMember(owner = "client!sb", name = "K", descriptor = "Lr;")
    public static class118 field3060;

    @OriginalMember(owner = "client!sb", name = "J", descriptor = "[I")
    public static int[] field3059;

    @OriginalMember(owner = "client!sb", name = "G", descriptor = "[[[B")
    public static byte[][][] field3057;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(BLkb;)V")
    private static final void method1048(byte arg0, class71 arg1) {
        if (arg0 > -103) {
            field3057 = null;
        }
        class115.field2747 = arg1;
        field3030++;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V")
    public static final void method1049(byte arg0) {
        field3037++;
        if (class143.field3393 == 0) {
            class47.field1151 = new class124(4, 104, 104, class108.field2636);
            for (int var1 = 0; var1 < 4; var1++) {
                class155.field3609[var1] = new class87(104, 104);
            }
            class9.field251 = new class40(512, 512);
            class13.field330 = 5;
            class143.field3393 = 20;
            class106.field2600 = class8.field194;
        } else if (class143.field3393 == 20) {
            int[] var2 = new int[9];
            for (int var3 = 0; var3 < 9; var3++) {
                int var4 = var3 * 32 + 128 + 15;
                int var5 = class134.field3164[var4];
                int var6 = var4 * 3 + 600;
                var2[var3] = var5 * var6 >> 16;
            }
            class124.method1037(var2, 500, 800, 512, 334);
            class106.field2600 = class101.field2398;
            class143.field3393 = 30;
            class13.field330 = 10;
        } else if (class143.field3393 == 30) {
            class82.field1881 = class92.method741(true, (byte) -85, true, false, 0);
            class53.field1290 = class92.method741(true, (byte) -88, true, false, 1);
            class57.field1365 = class92.method741(false, (byte) -91, true, true, 2);
            class75.field1754 = class92.method741(true, (byte) -63, true, false, 3);
            class39.field984 = class92.method741(true, (byte) -112, true, false, 4);
            class21.field545 = class92.method741(true, (byte) -66, true, true, 5);
            class113.field2710 = class92.method741(true, (byte) -125, false, true, 6);
            class18.field430 = class92.method741(true, (byte) -89, true, false, 7);
            field3060 = class92.method741(true, (byte) -121, true, false, 8);
            class48.field1169 = class92.method741(true, (byte) -63, true, false, 9);
            class71.field1554 = class92.method741(true, (byte) -72, true, false, 10);
            class142.field3373 = class92.method741(true, (byte) -70, true, false, 11);
            class11.field282 = class92.method741(true, (byte) -85, true, false, 12);
            class83.field1973 = class92.method741(false, (byte) -107, true, true, 13);
            class120.field2826 = class92.method741(true, (byte) -118, false, false, 14);
            class13.field341 = class92.method741(true, (byte) -56, true, false, 15);
            class13.field330 = 20;
            class143.field3393 = 40;
            class106.field2600 = class126.field3006;
        } else if (class143.field3393 == 40) {
            byte var7 = 0;
            int var8 = var7 + class82.field1881.method917(89) * 4 / 100;
            int var9 = var8 + class53.field1290.method917(-123) * 4 / 100;
            int var10 = var9 + class57.field1365.method917(-111) * 2 / 100;
            int var11 = var10 + class75.field1754.method917(-71) * 2 / 100;
            int var12 = var11 + class39.field984.method917(-27) * 6 / 100;
            int var13 = var12 + class21.field545.method917(76) * 4 / 100;
            int var14 = var13 + class113.field2710.method917(-104) * 2 / 100;
            int var15 = var14 + class18.field430.method917(98) * 60 / 100;
            int var16 = var15 + field3060.method917(-103) * 2 / 100;
            int var17 = var16 + class48.field1169.method917(-54) * 2 / 100;
            int var18 = var17 + class71.field1554.method917(69) * 2 / 100;
            int var19 = var18 + class142.field3373.method917(122) * 2 / 100;
            int var20 = var19 + class11.field282.method917(arg0 ^ 0xFFFFFF85) * 2 / 100;
            int var21 = var20 + class83.field1973.method917(-121) * 2 / 100;
            int var22 = var21 + class120.field2826.method917(123) * 2 / 100;
            int var23 = var22 + class13.field341.method917(arg0 ^ 0xFFFFFF97) * 2 / 100;
            if (var23 == 100) {
                class13.field330 = 30;
                class143.field3393 = 45;
                class106.field2600 = class123.field2934;
            } else {
                if (var23 != 0) {
                    class106.field2600 = class116.method905(new class7[] { class116.field2767, class51.method421((byte) 117, var23), class78.field1820 }, arg0 - 65);
                }
                class13.field330 = 30;
            }
        } else if (class143.field3393 == 45) {
            class46.method393(22050, !class91.field2106, 2, (byte) -85);
            class73 var24 = new class73();
            var24.method606(128, 9, (byte) 63);
            class133.field3118 = class136.method1112(0, class74.field1717, 22050, 87, class13.field324);
            class133.field3118.method592(var24, (byte) -88);
            class108.method863(-108, class39.field984, class120.field2826, class13.field341, var24);
            class111.field2674 = class136.method1112(1, class74.field1717, 2048, arg0 - 175, class13.field324);
            class144.field3402 = new class1();
            class111.field2674.method592(class144.field3402, (byte) -91);
            class121.field2847 = new class6(22050, class48.field1164);
            class106.field2600 = class9.field247;
            class143.field3393 = 50;
            class13.field330 = 35;
        } else if (class143.field3393 == 50) {
            int var25 = 0;
            if (class51.field1224 == null) {
                class51.field1224 = class7.method93(class78.field1816, class52.field1243, field3060, (byte) 90);
            } else {
                var25++;
            }
            if (class147.field3448 == null) {
                class147.field3448 = class7.method93(class108.field2644, class52.field1243, field3060, (byte) -117);
            } else {
                var25++;
            }
            if (class25.field660 == null) {
                class25.field660 = class7.method93(class9.field226, class52.field1243, field3060, (byte) -113);
            } else {
                var25++;
            }
            if (var25 < 3) {
                class106.field2600 = class116.method905(new class7[] { class21.field530, class51.method421((byte) 116, var25 * 100 / 3), class78.field1820 }, arg0 ^ 0x43);
                class13.field330 = 40;
            } else {
                class13.field330 = 40;
                class106.field2600 = class87.field2031;
                class143.field3393 = 60;
            }
        } else if (class143.field3393 == 60) {
            int var26 = class48.method403(field3060, class71.field1554, true);
            int var27 = class79.method668(arg0 ^ 0x44);
            if (var27 > var26) {
                class106.field2600 = class116.method905(new class7[] { class37.field937, class51.method421((byte) -81, var26 * 100 / var27), class78.field1820 }, 1);
                class13.field330 = 50;
            } else {
                class106.field2600 = class102.field2411;
                class13.field330 = 50;
                class111.method880(20, 5);
                class143.field3393 = 70;
            }
        } else if (class143.field3393 == 70) {
            if (class57.field1365.method581(true)) {
                class52.method425(-119, class57.field1365);
                method1048((byte) -119, class57.field1365);
                class131.method1072(class18.field430, -14171, class57.field1365);
                class139.method1137(arg0 - 15759, class18.field430, class57.field1365, class91.field2106);
                class24.method225(class57.field1365, class18.field430, -72);
                class145.method1174(class18.field430, class57.field1365, class94.field2188, arg0 ^ 0x48, class51.field1224);
                class120.method924(class53.field1290, class57.field1365, class82.field1881, 80040880);
                class74.method638(-534549599, class18.field430, class57.field1365);
                class66.method533(arg0 - 104, class57.field1365);
                class74.method636(-21894, class57.field1365);
                class27.method250(class75.field1754, field3060, class18.field430, (byte) -88);
                class39.method339(class57.field1365, (byte) 79);
                class39.method334(class57.field1365, (byte) -121);
                class106.field2600 = class119.field2816;
                class143.field3393 = 80;
                class13.field330 = 60;
            } else {
                class106.field2600 = class116.method905(new class7[] { class106.field2605, class51.method421((byte) -93, class57.field1365.method913(arg0 - 12)), class78.field1820 }, 1);
                class13.field330 = 60;
            }
        } else if (class143.field3393 == 80) {
            int var28 = 0;
            if (class58.field1385 == null) {
                class58.field1385 = class68.method544(class118.field2779, field3060, class52.field1243, -292);
            } else {
                var28++;
            }
            if (class64.field1416 == null) {
                class64.field1416 = class68.method544(class58.field1384, field3060, class52.field1243, -292);
            } else {
                var28++;
            }
            if (class83.field1949 == null) {
                class83.field1949 = class24.method230(class52.field1243, -16125, class18.field433, field3060);
            } else {
                var28++;
            }
            if (class98.field2336 == null) {
                class98.field2336 = class27.method249((byte) -86, field3060, class64.field1420, class52.field1243);
            } else {
                var28++;
            }
            if (class151.field3536 == null) {
                class151.field3536 = class27.method249((byte) -86, field3060, class9.field237, class52.field1243);
            } else {
                var28++;
            }
            if (class113.field2717 == null) {
                class113.field2717 = class27.method249((byte) -86, field3060, class28.field739, class52.field1243);
            } else {
                var28++;
            }
            if (class7.field171 == null) {
                class7.field171 = class27.method249((byte) -86, field3060, class45.field1081, class52.field1243);
            } else {
                var28++;
            }
            if (class111.field2687 == null) {
                class111.field2687 = class27.method249((byte) -86, field3060, class71.field1548, class52.field1243);
            } else {
                var28++;
            }
            if (class3.field38 == null) {
                class3.field38 = class27.method249((byte) -86, field3060, class55.field1339, class52.field1243);
            } else {
                var28++;
            }
            if (class49.field1185 == null) {
                class49.field1185 = class27.method249((byte) -86, field3060, class155.field3602, class52.field1243);
            } else {
                var28++;
            }
            if (class118.field2785 == null) {
                class118.field2785 = class27.method249((byte) -86, field3060, class92.field2127, class52.field1243);
            } else {
                var28++;
            }
            if (class39.field983 == null) {
                class39.field983 = class24.method230(class52.field1243, -16125, class87.field2033, field3060);
            } else {
                var28++;
            }
            if (class109.field2660 == null) {
                class109.field2660 = class24.method230(class52.field1243, -16125, class25.field658, field3060);
            } else {
                var28++;
            }
            if (class93.field2184 == null) {
                class93.field2184 = class102.method837(class87.field2048, -79, class52.field1243, field3060);
            } else {
                var28++;
            }
            if (var28 < 14) {
                class106.field2600 = class116.method905(new class7[] { class66.field1432, class51.method421((byte) 122, var28 * 100 / 14), class78.field1820 }, 1);
                class13.field330 = 70;
            } else {
                class5.field94 = class109.field2660;
                int var29 = (int) (Math.random() * 21.0D) - 10;
                int var30 = (int) (Math.random() * 21.0D) - 10;
                class64.field1416.method352();
                int var31 = (int) (Math.random() * 21.0D) - 10;
                int var32 = (int) (Math.random() * 41.0D) - 20;
                for (int var33 = 0; var33 < class98.field2336.length; var33++) {
                    class98.field2336[var33].method363(var29 + var32, var31 - -var32, var30 + var32);
                }
                class83.field1949[0].method895(var29 + var32, var31 - -var32, var30 + var32);
                class91.method739(0);
                class13.field330 = 70;
                class143.field3393 = 90;
                class106.field2600 = class7.field172;
            }
        } else if (class143.field3393 == 90) {
            if (class48.field1169.method581(true)) {
                class66 var34 = new class66(class48.field1169, field3060, 20, 0.8D, class91.field2106 ? 64 : 128);
                class134.method1090(var34);
                class134.method1095(0.8D);
                class13.field330 = 90;
                class143.field3393 = 110;
                class106.field2600 = class14.field354;
            } else {
                class106.field2600 = class116.method905(new class7[] { class101.field2392, class51.method421((byte) 125, class48.field1169.method913(-83)), class78.field1820 }, 1);
                class13.field330 = 90;
            }
        } else if (class143.field3393 == 110) {
            class43.field1033 = new class151();
            class74.field1717.method823((byte) -98, 10, class43.field1033);
            class106.field2600 = class72.field1588;
            class13.field330 = 94;
            class143.field3393 = 120;
        } else if (class143.field3393 == 120) {
            if (class71.field1554.method564(class83.field1940, class52.field1243, (byte) -93)) {
                class4 var35 = new class4(class71.field1554.method573(true, class52.field1243, class83.field1940));
                class51.method422(27937, var35);
                class13.field330 = 96;
                class143.field3393 = 130;
                class106.field2600 = class21.field529;
            } else {
                class106.field2600 = class116.method905(new class7[] { class32.field853, class43.field1034 }, 1);
                class13.field330 = 96;
            }
        } else if (class143.field3393 != 130) {
            if (arg0 != 66) {
                method1053(19, 86, null);
            }
            if (class143.field3393 == 140) {
                class111.method880(arg0 - 46, 10);
            }
        } else if (!class75.field1754.method581(true)) {
            class106.field2600 = class116.method905(new class7[] { class95.field2256, class51.method421((byte) 114, class75.field1754.method913(-109) * 4 / 5), class78.field1820 }, 1);
            class13.field330 = 100;
        } else if (!class11.field282.method581(true)) {
            class106.field2600 = class116.method905(new class7[] { class95.field2256, class51.method421((byte) -89, class11.field282.method913(-120) / 6 + 80), class78.field1820 }, 1);
            class13.field330 = 100;
        } else if (class83.field1973.method581(true)) {
            class13.field330 = 100;
            class143.field3393 = 140;
            class106.field2600 = class50.field1200;
        } else {
            class106.field2600 = class116.method905(new class7[] { class95.field2256, class51.method421((byte) 125, class83.field1973.method913(-99) / 20 + 96), class78.field1820 }, arg0 - 65);
            class13.field330 = 100;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
    public static void method1050(int arg0) {
        field3053 = null;
        field3035 = null;
        field3052 = null;
        field3049 = null;
        field3055 = null;
        int var1 = 121 % ((62 - arg0) / 49);
        field3046 = null;
        field3059 = null;
        field3051 = null;
        field3054 = null;
        field3058 = null;
        field3057 = null;
        field3060 = null;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIIILfd;)V")
    public static final void method1051(int arg0, int arg1, int arg2, int arg3, int arg4, class40 arg5) {
        field3040++;
        if (arg5 == null) {
            return;
        }
        int var6 = client.field577 + class4.field48 & 0x7FF;
        int var7 = arg4 * arg4 + arg2 * arg2;
        if (arg3 >= -17 || var7 > 6400) {
            return;
        }
        int var8 = class134.field3164[var6];
        int var9 = var8 * 256 / (class113.field2705 + 256);
        int var10 = class134.field3160[var6];
        int var11 = var10 * 256 / (class113.field2705 + 256);
        int var12 = arg2 * var11 - arg4 * var9 >> 16;
        int var13 = arg2 * var9 + arg4 * var11 >> 16;
        if (var7 <= 2500) {
            arg5.method341(var13 + arg1 + 4 + 94 - arg5.field990 / 2, -(arg5.field985 / 2) + -4 + arg0 - -83 + -var12);
        } else {
            arg5.method365(class93.field2184, arg1 + var13 + 94 + 4 - arg5.field990 / 2, arg0 + 83 + -var12 - arg5.field985 / 2 + -4);
        }
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V")
    public static final void method1052(int arg0) {
        field3034++;
        int var1 = class18.field436;
        int var2 = class24.field640;
        int var3 = 6116423;
        int var4 = class52.field1247;
        int var5 = class27.field711;
        class33.method301(var2, var1, var2 + var5, var1 + var4);
        class33.method304(var2, var1, var5, var4, var3);
        class33.method304(var2 + 1, var1 - -1, var5 - 2, 16, 0);
        class33.method299(var2 + 1, var1 + 18, var5 - 2, var4 + -19, 0);
        class25.field660.method42(class23.field625, var2 + 3, var1 + 14, var3, -1);
        int var6 = class111.field2681;
        if (arg0 >= -12) {
            method1051(-34, 62, 17, 42, -63, null);
        }
        int var7 = class113.field2709;
        for (int var8 = 0; var8 < class19.field449; var8++) {
            int var9 = 16777215;
            int var10 = (class19.field449 - var8 - 1) * 15 + var1 + 31;
            if (var7 > var2 && var2 + var5 > var7 && var10 - 13 < var6 && var10 + 3 > var6) {
                var9 = 16776960;
            }
            class25.field660.method42(class81.method680(var8, false), var2 + 3, var10, var9, 0);
        }
        class153.method1204((byte) 94, class27.field711, class52.field1247, class24.field640, class18.field436);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II[B)I")
    public static final int method1053(int arg0, int arg1, byte[] arg2) {
        if (arg0 != 130) {
            field3052 = null;
        }
        field3032++;
        return class95.method781(arg2, 0, arg1, true);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IZ)V")
    public static final void method1054(int arg0, boolean arg1) {
        field3039++;
        if (class118.field2780 == null || arg0 < 0 || class118.field2780.length <= arg0 || class118.field2780[arg0] == null) {
            return;
        }
        class47.field1150.method1131(163, 2027385224);
        class47.field1150.method956(class118.field2780[arg0].field3261, -822368080);
        if (!arg1) {
            class133.field3122++;
        }
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(B)V")
    public static final void method1055(byte arg0) {
        class78.field1808.method391((byte) -73);
        if (arg0 == -54) {
            field3044++;
        }
    }
}
