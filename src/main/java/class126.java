import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class126 {

    @OriginalMember(owner = "client!va", name = "b", descriptor = "Lpd;")
    private static class94 field3157 = class28.method249(47, "Loading interfaces )2 ");

    @OriginalMember(owner = "client!va", name = "h", descriptor = "Lpd;")
    private static class94 field3163 = class28.method249(-52, "You are standing in a members)2only area)3");

    @OriginalMember(owner = "client!va", name = "g", descriptor = "I")
    public static int field3162 = 0;

    @OriginalMember(owner = "client!va", name = "e", descriptor = "Lpd;")
    private static class94 field3160 = class28.method249(127, "Members object");

    @OriginalMember(owner = "client!va", name = "q", descriptor = "J")
    public static volatile long field3172 = 0L;

    @OriginalMember(owner = "client!va", name = "u", descriptor = "I")
    public static int field3176 = -1;

    @OriginalMember(owner = "client!va", name = "n", descriptor = "[J")
    public static long[] field3169 = new long[100];

    @OriginalMember(owner = "client!va", name = "t", descriptor = "Lpd;")
    public static class94 field3175 = field3157;

    @OriginalMember(owner = "client!va", name = "p", descriptor = "Lpd;")
    public static class94 field3171 = class28.method249(122, "leuchten1:");

    @OriginalMember(owner = "client!va", name = "a", descriptor = "Lpd;")
    public static class94 field3156 = field3163;

    @OriginalMember(owner = "client!va", name = "f", descriptor = "Lpd;")
    public static class94 field3161 = field3160;

    @OriginalMember(owner = "client!va", name = "x", descriptor = "Lpd;")
    private static class94 field3179 = class28.method249(-125, "Enter name of friend to add to list");

    @OriginalMember(owner = "client!va", name = "r", descriptor = "Lpd;")
    public static class94 field3173 = field3179;

    @OriginalMember(owner = "client!va", name = "w", descriptor = "I")
    public static int field3178 = 0;

    @OriginalMember(owner = "client!va", name = "y", descriptor = "[I")
    public static int[] field3180 = new int[2000];

    @OriginalMember(owner = "client!va", name = "c", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!va", name = "i", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!va", name = "j", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!va", name = "k", descriptor = "I")
    public static int field3166;

    @OriginalMember(owner = "client!va", name = "l", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!va", name = "o", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!va", name = "s", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!va", name = "v", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!va", name = "m", descriptor = "Lmb;")
    public static class73 field3168;

    @OriginalMember(owner = "client!va", name = "d", descriptor = "[I")
    public static int[] field3159;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V", line = 11)
    public static void method997(int arg0) {
        field3159 = null;
        field3168 = null;
        field3156 = null;
        field3169 = null;
        field3179 = null;
        field3157 = null;
        field3180 = null;
        field3173 = null;
        field3161 = null;
        field3171 = null;
        field3175 = null;
        field3163 = null;
        if (arg0 < 86) {
            field3164 = 76;
        }
        field3160 = null;
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(I)V", line = 40)
    public static final void method998(int arg0) {
        if (arg0 != -9472) {
            method1000((byte) 89);
        }
        field3174++;
        if (class101.field2550 == 0) {
            class64.field1585 = new class24(4, 104, 104, class41.field1049);
            for (int var1 = 0; var1 < 4; var1++) {
                class12.field311[var1] = new class88(104, 104);
            }
            class89.field2292 = new class116(512, 512);
            class101.field2550 = 20;
            client.field503 = class90.field2333;
            class46.field1141 = 5;
        } else if (class101.field2550 == 20) {
            int[] var2 = new int[9];
            for (int var3 = 0; var3 < 9; var3++) {
                int var4 = var3 * 32 + 128 + 15;
                int var5 = class124.field3152[var4];
                int var6 = var4 * 3 + 600;
                var2[var3] = var5 * var6 >> 16;
            }
            class24.method188(var2, 500, 800, 512, 334);
            class101.field2550 = 30;
            client.field503 = class110.field2757;
            class46.field1141 = 10;
        } else if (class101.field2550 == 30) {
            class95.field2445 = class37.method289(false, -1, true, 0, true);
            client.field486 = class37.method289(false, arg0 + 9471, true, 1, true);
            class9.field247 = class37.method289(true, -1, false, 2, true);
            class80.field2032 = class37.method289(false, -1, true, 3, true);
            class30.field867 = class37.method289(false, arg0 ^ 0x24FF, true, 4, true);
            class8.field213 = class37.method289(true, arg0 + 9471, true, 5, true);
            class77.field1978 = class37.method289(true, arg0 + 9471, true, 6, false);
            class7.field149 = class37.method289(false, -1, true, 7, true);
            class95.field2448 = class37.method289(false, arg0 ^ 0x24FF, true, 8, true);
            class120.field3014 = class37.method289(false, -1, true, 9, true);
            field3168 = class37.method289(false, -1, true, 10, true);
            class115.field2919 = class37.method289(false, -1, true, 11, true);
            class13.field317 = class37.method289(false, -1, true, 12, true);
            class46.field1141 = 20;
            class101.field2550 = 40;
            client.field503 = class89.field2305;
        } else if (class101.field2550 == 40) {
            byte var7 = 0;
            int var8 = var7 + class95.field2445.method541(-104) * 5 / 100;
            int var9 = var8 + client.field486.method541(-75) * 5 / 100;
            int var10 = var9 + class9.field247.method541(-96) * 5 / 100;
            int var11 = var10 + class80.field2032.method541(-115) * 5 / 100;
            int var12 = var11 + class30.field867.method541(-28) * 5 / 100;
            int var13 = var12 + class8.field213.method541(-40) * 5 / 100;
            int var14 = var13 + class77.field1978.method541(-39) * 5 / 100;
            int var15 = var14 + class7.field149.method541(-36) * 40 / 100;
            int var16 = var15 + class95.field2448.method541(-81) * 5 / 100;
            int var17 = var16 + class120.field3014.method541(-53) * 5 / 100;
            int var18 = var17 + field3168.method541(-30) * 5 / 100;
            int var19 = var18 + class115.field2919.method541(-87) * 5 / 100;
            int var20 = var19 + class13.field317.method541(-128) * 5 / 100;
            if (var20 == 100) {
                client.field503 = class64.field1586;
                class101.field2550 = 45;
                class46.field1141 = 30;
            } else {
                if (var20 != 0) {
                    client.field503 = class4.method20(new class94[] { class28.field811, class51.method403(var20, true), class89.field2284 }, true);
                }
                class46.field1141 = 30;
            }
        } else if (class101.field2550 == 45) {
            class42.method318(0, !class115.field2912, class112.field2832, arg0 + 9501);
            class26.field700 = class89.method664(class112.field2832, -28393, class128.field3218);
            class99.field2512 = new class76(22050, class43.field1083);
            client.field503 = class100.field2539;
            class101.field2550 = 50;
            class46.field1141 = 35;
        } else if (class101.field2550 == 50) {
            int var21 = 0;
            if (class9.field251 == null) {
                class9.field251 = class110.method798(class21.field566, class8.field230, class95.field2448, true);
            } else {
                var21++;
            }
            if (class112.field2835 == null) {
                class112.field2835 = class110.method798(class62.field1524, class8.field230, class95.field2448, true);
            } else {
                var21++;
            }
            if (class115.field2913 == null) {
                class115.field2913 = class110.method798(class119.field2973, class8.field230, class95.field2448, true);
            } else {
                var21++;
            }
            if (var21 < 3) {
                client.field503 = class4.method20(new class94[] { class54.field1361, class51.method403(var21 * 100 / 3, true), class89.field2284 }, true);
                class46.field1141 = 40;
            } else {
                client.field503 = class134.field3268;
                class101.field2550 = 60;
                class46.field1141 = 40;
            }
        } else if (class101.field2550 == 60) {
            int var22 = method999(class95.field2448, 4, field3168);
            int var23 = class33.method269((byte) -83);
            if (var23 > var22) {
                client.field503 = class4.method20(new class94[] { class123.field3120, class51.method403(var22 * 100 / var23, true), class89.field2284 }, true);
                class46.field1141 = 50;
            } else {
                class46.field1141 = 50;
                client.field503 = class1.field29;
                class1.method6(false, 5);
                class101.field2550 = 70;
            }
        } else if (class101.field2550 == 70) {
            if (class9.field247.method806(arg0 + 9472)) {
                class13.method79(class9.field247, 0);
                class80.method602((byte) 120, class9.field247);
                class46.method345(class9.field247, -100, class7.field149);
                class70.method513(class115.field2912, arg0 ^ 0xFFFFC31E, class9.field247, class7.field149);
                class29.method257(class9.field247, 64, class7.field149);
                class25.method229(class9.field247, class9.field251, 127, class52.field1294, class7.field149);
                class42.method315(class95.field2445, class9.field247, (byte) -69, client.field486);
                class128.method1015(arg0 + 9471, class7.field149, class9.field247);
                class94.method701(class9.field247, arg0 + 11225);
                class85.method618(-121, class9.field247);
                class28.method252(class95.field2448, (byte) -28, class7.field149, class80.field2032);
                class46.field1141 = 60;
                class101.field2550 = 80;
                client.field503 = class81.field2062;
            } else {
                client.field503 = class4.method20(new class94[] { class108.field2680, class51.method403(class9.field247.method544(false), true), class89.field2284 }, true);
                class46.field1141 = 60;
            }
        } else if (class101.field2550 == 80) {
            int var24 = 0;
            if (class30.field852 == null) {
                class30.field852 = class89.method669(class95.field2448, class105.field2614, true, class8.field230);
            } else {
                var24++;
            }
            if (class102.field2579 == null) {
                class102.field2579 = class89.method669(class95.field2448, class99.field2513, true, class8.field230);
            } else {
                var24++;
            }
            if (class80.field2042 == null) {
                class80.field2042 = class84.method613(class8.field230, class136.field3331, class95.field2448, -26288);
            } else {
                var24++;
            }
            if (class41.field1044 == null) {
                class41.field1044 = class47.method349(43, class8.field230, class28.field810, class95.field2448);
            } else {
                var24++;
            }
            if (class103.field2600 == null) {
                class103.field2600 = class47.method349(121, class8.field230, class98.field2487, class95.field2448);
            } else {
                var24++;
            }
            if (class128.field3214 == null) {
                class128.field3214 = class47.method349(69, class8.field230, class42.field1068, class95.field2448);
            } else {
                var24++;
            }
            if (class122.field3066 == null) {
                class122.field3066 = class47.method349(117, class8.field230, class31.field876, class95.field2448);
            } else {
                var24++;
            }
            if (class69.field1677 == null) {
                class69.field1677 = class47.method349(arg0 ^ 0xFFFFDB33, class8.field230, class6.field116, class95.field2448);
            } else {
                var24++;
            }
            if (class43.field1086 == null) {
                class43.field1086 = class89.method669(class95.field2448, class2.field60, true, class8.field230);
            } else {
                var24++;
            }
            if (class75.field1834 == null) {
                class75.field1834 = class47.method349(arg0 ^ 0xFFFFDB47, class8.field230, class119.field2979, class95.field2448);
            } else {
                var24++;
            }
            if (class123.field3133 == null) {
                class123.field3133 = class47.method349(35, class8.field230, class77.field1983, class95.field2448);
            } else {
                var24++;
            }
            if (class135.field3321 == null) {
                class135.field3321 = class47.method349(98, class8.field230, class87.field2233, class95.field2448);
            } else {
                var24++;
            }
            if (class30.field849 == null) {
                class30.field849 = class84.method613(class8.field230, class107.field2649, class95.field2448, -26288);
            } else {
                var24++;
            }
            if (class89.field2308 == null) {
                class89.field2308 = class84.method613(class8.field230, class20.field555, class95.field2448, arg0 - 16816);
            } else {
                var24++;
            }
            if (var24 < 14) {
                client.field503 = class4.method20(new class94[] { class105.field2634, class51.method403(var24 * 100 / 14, true), class89.field2284 }, true);
                class46.field1141 = 70;
            } else {
                class102.field2579.method878();
                int var25 = (int) (Math.random() * 21.0D) - 10;
                int var26 = (int) (Math.random() * 41.0D) - 20;
                int var27 = (int) (Math.random() * 21.0D) - 10;
                int var28 = (int) (Math.random() * 21.0D) - 10;
                for (int var29 = 0; var29 < class41.field1044.length; var29++) {
                    class41.field1044[var29].method869(var25 + var26, var26 + var27, var26 + var28);
                }
                class80.field2042[0].method34(var25 + var26, var27 - -var26, var26 + var28);
                client.field503 = class115.field2915;
                class101.field2550 = 85;
                class46.field1141 = 70;
            }
        } else if (class101.field2550 == 85) {
            int var30 = class9.method53(false, class95.field2448);
            int var31 = class9.method52(38);
            if (var31 > var30) {
                client.field503 = class4.method20(new class94[] { class99.field2509, class51.method403(var30 * 100 / var31, true), class89.field2284 }, true);
                class46.field1141 = 80;
            } else {
                class101.field2550 = 90;
                client.field503 = class88.field2245;
                class46.field1141 = 80;
            }
        } else if (class101.field2550 == 90) {
            if (class120.field3014.method806(arg0 ^ 0xFFFFDB00)) {
                class79 var32 = new class79(class120.field3014, class95.field2448, 20, 0.8D, class115.field2912 ? 64 : 128);
                class124.method991(var32);
                class124.method990(0.8D);
                class101.field2550 = 110;
                client.field503 = class86.field2168;
                class46.field1141 = 90;
            } else {
                client.field503 = class4.method20(new class94[] { class38.field988, class51.method403(class120.field3014.method544(false), true), class89.field2284 }, true);
                class46.field1141 = 90;
            }
        } else if (class101.field2550 == 110) {
            class108.field2681 = new class31();
            class112.field2832.method74(10, class108.field2681, (byte) 2);
            class46.field1141 = 94;
            class101.field2550 = 120;
            client.field503 = class9.field260;
        } else if (class101.field2550 == 120) {
            if (field3168.method820(class8.field230, class86.field2189, (byte) 42)) {
                class23 var33 = new class23(field3168.method818(class86.field2189, (byte) 114, class8.field230));
                class80.method596(var33, false);
                class101.field2550 = 130;
                class46.field1141 = 96;
                client.field503 = class127.field3207;
            } else {
                client.field503 = class4.method20(new class94[] { class79.field1988, class50.field1262 }, true);
                class46.field1141 = 96;
            }
        } else if (class101.field2550 == 130) {
            if (!class80.field2032.method806(arg0 + 9472)) {
                client.field503 = class4.method20(new class94[] { field3175, class51.method403(class80.field2032.method544(false) * 4 / 5, true), class89.field2284 }, true);
                class46.field1141 = 100;
            } else if (class13.field317.method806(0)) {
                class101.field2550 = 140;
                class46.field1141 = 100;
                client.field503 = class14.field336;
            } else {
                client.field503 = class4.method20(new class94[] { field3175, class51.method403(class13.field317.method544(false) / 5 + 80, true), class89.field2284 }, true);
                class46.field1141 = 100;
            }
        } else if (class101.field2550 == 140) {
            class1.method6(false, 10);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Ls;ILs;)I", line = 461)
    private static final int method999(class111 arg0, int arg1, class111 arg2) {
        if (arg1 != 4) {
            return -109;
        }
        int var3 = 0;
        if (arg2.method820(client.field473, class52.field1293, (byte) 42)) {
            var3++;
        }
        if (arg0.method820(client.field473, class123.field3134, (byte) 42)) {
            var3++;
        }
        field3166++;
        if (arg0.method820(client.field473, class28.field808, (byte) 42)) {
            var3++;
        }
        if (arg0.method820(client.field473, class41.field1041, (byte) 42)) {
            var3++;
        }
        if (arg0.method820(client.field473, class55.field1401, (byte) 42)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(B)V", line = 549)
    public static final void method1000(byte arg0) {
        class120.field2987.method224((byte) 33);
        if (arg0 < 15) {
            method1001(122, -55, (byte) -83, null);
        }
        for (int var1 = 0; var1 < 32; var1++) {
            class63.field1554[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class133.field3250[var2] = 0L;
        }
        field3165++;
        class90.field2330 = 0;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIBLoe;)V", line = 579)
    public static final void method1001(int arg0, int arg1, byte arg2, class89 arg3) {
        if (arg2 != 55) {
            return;
        }
        if (arg3.field210 == arg1 && arg1 != -1) {
            int var4 = class70.method519(arg2 ^ 0x32, arg1).field1419;
            if (var4 == 1) {
                arg3.field214 = 0;
                arg3.field192 = arg0;
                arg3.field180 = 0;
                arg3.field164 = 0;
            }
            if (var4 == 2) {
                arg3.field164 = 0;
            }
        } else if (arg1 == -1 || arg3.field210 == -1 || class70.method519(5, arg1).field1418 >= class70.method519(5, arg3.field210).field1418) {
            arg3.field161 = arg3.field162;
            arg3.field210 = arg1;
            arg3.field214 = 0;
            arg3.field164 = 0;
            arg3.field192 = arg0;
            arg3.field180 = 0;
        }
        field3177++;
    }
}
