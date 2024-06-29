import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class131 {

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "Z")
    public static boolean field2623 = false;

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "Ljd;")
    private static class92 field2625 = class202.method1325((byte) 90, "Connection timed out)3");

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "Ljd;")
    private static class92 field2627 = class202.method1325((byte) 90, "button near the top of that page)3");

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "Ljd;")
    public static class92 field2621 = field2627;

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "Ljd;")
    public static class92 field2624 = class202.method1325((byte) 90, "cross");

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "Ljd;")
    public static class92 field2626 = class202.method1325((byte) 90, ")1p");

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "Ljd;")
    public static class92 field2622 = class202.method1325((byte) 90, ")2");

    @OriginalMember(owner = "client!nf", name = "n", descriptor = "Ljd;")
    public static class92 field2634 = field2625;

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "[I")
    public static int[] field2631 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 67, 68, 69, 70, 71, 72, 75, 79, 80, 81, 82, 87, 88, 89, 90, 77, 96, 98, 99, 100, 101, 102, 250, 251, 109, 110, 111, 112, 117, 252, 167, 126, 127, 128, 129, 130, 131, 132, 135, 139, 140, 141, 142, 147, 148, 149, 150, 137, 156, 158, 159, 160, 161, 162, 253, 254, 170, 171, 172, 173, 178, 255, 179 };

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!nf", name = "l", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!nf", name = "m", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!nf", name = "o", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "[I")
    public static int[] field2628;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)V")
    public static void method863(byte arg0) {
        int var1 = 106 / ((-arg0 - 66) / 53);
        field2625 = null;
        field2622 = null;
        field2628 = null;
        field2634 = null;
        field2627 = null;
        field2621 = null;
        field2631 = null;
        field2624 = null;
        field2626 = null;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIII)V")
    public static final void method864(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != 18061) {
            field2634 = null;
        }
        field2632++;
        class116 var5 = (class116) class29.field637.method216(-125, (long) arg1);
        if (var5 == null) {
            var5 = new class116();
            class29.field637.method210((byte) -66, (long) arg1, var5);
        }
        if (var5.field2356.length <= arg4) {
            int[] var6 = new int[arg4 + 1];
            int[] var7 = new int[arg4 + 1];
            for (int var8 = 0; var8 < var5.field2356.length; var8++) {
                var6[var8] = var5.field2356[var8];
                var7[var8] = var5.field2347[var8];
            }
            for (int var9 = var5.field2356.length; var9 < arg4; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field2347 = var7;
            var5.field2356 = var6;
        }
        var5.field2356[arg4] = arg0;
        var5.field2347[arg4] = arg2;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(BI)V")
    public static final void method865(byte arg0, int arg1) {
        field2633++;
        if (arg1 < 0) {
            return;
        }
        int var2 = class137.field2741[arg1];
        int var3 = class186.field3520[arg1];
        int var4 = class13.field383[arg1];
        if (var4 >= 2000) {
            var4 -= 2000;
        }
        int var5 = (int) class44.field990[arg1];
        long var6 = class44.field990[arg1];
        if (var4 == 47) {
            class129 var8 = class107.field2187[var5];
            if (var8 != null) {
                class186.method1206(class15.field423.field233[0], 0, (byte) 125, class15.field423.field198[0], var8.field233[0], 1, false, 1, 0, 0, var8.field198[0], 2);
                class159.field3164 = class81.field1645;
                class13.field375++;
                class73.field1540 = 2;
                class205.field3946 = 0;
                class185.field3505 = class31.field705;
                class99.field2000.method405(91, 7);
                class99.field2000.method441(var5, (byte) -122);
                class99.field2000.method450(class130.field2611, (byte) -120);
                class99.field2000.method438(class31.field699, 69);
                class99.field2000.method458(class1.field101, 9345);
            }
        }
        if (var4 == 13) {
            class99.field2000.method405(182, 7);
            class99.field2000.method464(arg0 + 1361896122, var5);
            class99.field2000.method458(var3, arg0 + 9427);
            class68.field1374++;
            class99.field2000.method460(var2, 118);
            class65.field1317 = 0;
            class49.field1075 = class175.method1155(var2, (byte) -125);
            class105.field2148 = var3;
        }
        if (var4 == 8) {
            class146.field2894++;
            boolean var9 = class186.method1206(class15.field423.field233[0], 0, (byte) 125, class15.field423.field198[0], var3, 0, false, 0, 0, 0, var2, 2);
            if (!var9) {
                class186.method1206(class15.field423.field233[0], 0, (byte) 126, class15.field423.field198[0], var3, 1, false, 1, 0, 0, var2, 2);
            }
            class205.field3946 = 0;
            class73.field1540 = 2;
            class185.field3505 = class31.field705;
            class159.field3164 = class81.field1645;
            class99.field2000.method405(22, 7);
            class99.field2000.method460(class138.field2766, 118);
            class99.field2000.method464(1361896040, class118.field2402);
            class99.field2000.method450(class210.field4077 + var2, (byte) -85);
            class99.field2000.method458(var5, 9345);
            class99.field2000.method441(var3 + class115.field2343, (byte) -118);
        }
        if (var4 == 57) {
            class70.field1492++;
            class99.field2000.method405(209, 7);
            class99.field2000.method441(var3, (byte) -71);
            class99.field2000.method464(1361896040, var5);
            class99.field2000.method446(var2, -26751);
            class65.field1317 = 0;
            class49.field1075 = class175.method1155(var2, (byte) 92);
            class105.field2148 = var3;
        }
        if (var4 == 2 && class9.method65(var6, (byte) 126, var2, var3)) {
            class90.field1767++;
            class99.field2000.method405(125, 7);
            class99.field2000.method458(class210.field4077 + var2, 9345);
            class99.field2000.method450(class115.field2343 + var3, (byte) -103);
            class99.field2000.method464(1361896040, class1.field101);
            class99.field2000.method458((int) (var6 >>> 32) & Integer.MAX_VALUE, 9345);
            class99.field2000.method450(class130.field2611, (byte) -123);
            class99.field2000.method446(class31.field699, -26751);
        }
        if (var4 == 50) {
            class205.field3939++;
            boolean var11 = class186.method1206(class15.field423.field233[0], 0, (byte) 126, class15.field423.field198[0], var3, 0, false, 0, 0, 0, var2, 2);
            if (!var11) {
                class186.method1206(class15.field423.field233[0], 0, (byte) 126, class15.field423.field198[0], var3, 1, false, 1, 0, 0, var2, 2);
            }
            class73.field1540 = 2;
            class205.field3946 = 0;
            class185.field3505 = class31.field705;
            class159.field3164 = class81.field1645;
            class99.field2000.method405(240, 7);
            class99.field2000.method450(var3 + class115.field2343, (byte) -105);
            class99.field2000.method441(var5, (byte) -125);
            class99.field2000.method464(arg0 ^ 0xAED31DC6, var2 + class210.field4077);
        }
        if (var4 == 38) {
            boolean var13 = true;
            class1 var14 = class175.method1155(var2, (byte) 117);
            if (var14.field120 > 0) {
                var13 = class209.method1364(var14, (byte) -102);
            }
            if (var13) {
                class99.field2000.method405(13, 7);
                class58.field1217++;
                class99.field2000.method446(var2, -26751);
            }
        }
        if (var4 == 18) {
            class129 var15 = class107.field2187[var5];
            if (var15 != null) {
                class32.field721++;
                class186.method1206(class15.field423.field233[0], 0, (byte) 10, class15.field423.field198[0], var15.field233[0], 1, false, 1, 0, 0, var15.field198[0], 2);
                class73.field1540 = 2;
                class159.field3164 = class81.field1645;
                class185.field3505 = class31.field705;
                class205.field3946 = 0;
                class99.field2000.method405(130, arg0 ^ 0xFFFFFFA9);
                class99.field2000.method458(var5, 9345);
            }
        }
        if (var4 == 25) {
            boolean var16 = class186.method1206(class15.field423.field233[0], 0, (byte) -36, class15.field423.field198[0], var3, 0, false, 0, 0, 0, var2, 2);
            if (!var16) {
                class186.method1206(class15.field423.field233[0], 0, (byte) 127, class15.field423.field198[0], var3, 1, false, 1, 0, 0, var2, 2);
            }
            class205.field3946 = 0;
            class185.field3505 = class31.field705;
            class140.field2814++;
            class73.field1540 = 2;
            class159.field3164 = class81.field1645;
            class99.field2000.method405(160, arg0 ^ 0xFFFFFFA9);
            class99.field2000.method464(1361896040, class115.field2343 + var3);
            class99.field2000.method441(var2 + class210.field4077, (byte) -115);
            class99.field2000.method441(var5, (byte) -112);
        }
        if (var4 == 16) {
            class45.method286(arg0 + 238);
        }
        if (var4 == 33) {
            class91 var18 = class172.field3347[var5];
            if (var18 != null) {
                class15.field422++;
                class186.method1206(class15.field423.field233[0], 0, (byte) -43, class15.field423.field198[0], var18.field233[0], 1, false, 1, 0, 0, var18.field198[0], 2);
                class185.field3505 = class31.field705;
                class205.field3946 = 0;
                class159.field3164 = class81.field1645;
                class73.field1540 = 2;
                class99.field2000.method405(134, 7);
                class99.field2000.method458(var5, 9345);
            }
        }
        if (var4 == 15) {
            class91 var19 = class172.field3347[var5];
            if (var19 != null) {
                class63.field1280++;
                class186.method1206(class15.field423.field233[0], 0, (byte) -57, class15.field423.field198[0], var19.field233[0], 1, false, 1, 0, 0, var19.field198[0], 2);
                class205.field3946 = 0;
                class73.field1540 = 2;
                class185.field3505 = class31.field705;
                class159.field3164 = class81.field1645;
                class99.field2000.method405(81, 7);
                class99.field2000.method426(class31.field699, (byte) -13);
                class99.field2000.method441(class1.field101, (byte) -68);
                class99.field2000.method464(1361896040, class130.field2611);
                class99.field2000.method464(arg0 ^ 0xAED31DC6, var5);
            }
        }
        if (var4 == 39) {
            class58.field1217++;
            class99.field2000.method405(13, 7);
            class99.field2000.method446(var2, -26751);
            class1 var20 = class175.method1155(var2, (byte) -77);
            if (var20.field43 != null && var20.field43[0][0] == 5) {
                int var21 = var20.field43[0][1];
                if (class165.field3242[var21] != var20.field113[0]) {
                    class165.field3242[var21] = var20.field113[0];
                    class139.method924(var21, (byte) 125);
                }
            }
        }
        if (var4 == 1007) {
            class1 var22 = class175.method1155(var2, (byte) -88);
            if (var22 == null || var22.field60[var3] < 100000) {
                class132.field2638++;
                class99.field2000.method405(204, arg0 ^ 0xFFFFFFA9);
                class99.field2000.method450(var5, (byte) -65);
            } else {
                class117.method788(class3.field189, arg0 - 18919, 0, class77.method529(arg0 ^ 0x53, new class92[] { class142.method938(var22.field60[var3], false), class127.field2562, class92.method626((byte) 59, var5).field2162 }));
            }
            class65.field1317 = 0;
            class49.field1075 = class175.method1155(var2, (byte) 75);
            class105.field2148 = var3;
        }
        if (var4 == 21) {
            class91 var23 = class172.field3347[var5];
            if (var23 != null) {
                class186.method1206(class15.field423.field233[0], 0, (byte) -123, class15.field423.field198[0], var23.field233[0], 1, false, 1, 0, 0, var23.field198[0], 2);
                class159.field3164 = class81.field1645;
                class205.field3946 = 0;
                class185.field3505 = class31.field705;
                class209.field4007++;
                class73.field1540 = 2;
                class99.field2000.method405(176, 7);
                class99.field2000.method446(class138.field2766, -26751);
                class99.field2000.method441(var5, (byte) -66);
                class99.field2000.method464(1361896040, class118.field2402);
            }
        }
        if (var4 == 1004) {
            class9.method65(var6, (byte) -123, var2, var3);
            class99.field2000.method405(51, 7);
            class119.field2405++;
            class99.field2000.method464(arg0 + 1361896122, var3 - -class115.field2343);
            class99.field2000.method450(Integer.MAX_VALUE & (int) (var6 >>> 32), (byte) -103);
            class99.field2000.method450(class210.field4077 + var2, (byte) -102);
        }
        if (var4 == 48) {
            class129 var24 = class107.field2187[var5];
            if (var24 != null) {
                class186.method1206(class15.field423.field233[0], 0, (byte) 126, class15.field423.field198[0], var24.field233[0], 1, false, 1, 0, 0, var24.field198[0], 2);
                class185.field3505 = class31.field705;
                class156.field3099++;
                class159.field3164 = class81.field1645;
                class73.field1540 = 2;
                class205.field3946 = 0;
                class99.field2000.method405(144, arg0 ^ 0xFFFFFFA9);
                class99.field2000.method450(var5, (byte) -118);
            }
        }
        if (var4 == 46) {
            class20.field487++;
            class99.field2000.method405(76, 7);
            class99.field2000.method446(var2, -26751);
            class99.field2000.method458(var5, 9345);
            class99.field2000.method450(var3, (byte) -90);
            class65.field1317 = 0;
            class49.field1075 = class175.method1155(var2, (byte) -95);
            class105.field2148 = var3;
        }
        if (var4 == 1002) {
            class185.field3505 = class31.field705;
            class132.field2638++;
            class73.field1540 = 2;
            class159.field3164 = class81.field1645;
            class205.field3946 = 0;
            class99.field2000.method405(204, 7);
            class99.field2000.method450(var5, (byte) -55);
        }
        if (var4 == 26) {
            class91 var25 = class172.field3347[var5];
            if (var25 != null) {
                class92.field1821++;
                class186.method1206(class15.field423.field233[0], 0, (byte) -53, class15.field423.field198[0], var25.field233[0], 1, false, 1, 0, 0, var25.field198[0], 2);
                class205.field3946 = 0;
                class185.field3505 = class31.field705;
                class73.field1540 = 2;
                class159.field3164 = class81.field1645;
                class99.field2000.method405(207, 7);
                class99.field2000.method458(var5, arg0 + 9427);
            }
        }
        if (var4 == 43) {
            class9.method65(var6, (byte) -49, var2, var3);
            class99.field2000.method405(10, 7);
            class99.field2000.method464(1361896040, class210.field4077 + var2);
            class99.field2000.method458(var3 + class115.field2343, 9345);
            class20.field481++;
            class99.field2000.method458(Integer.MAX_VALUE & (int) (var6 >>> 32), 9345);
        }
        if (var4 == 42) {
            class91 var26 = class172.field3347[var5];
            if (var26 != null) {
                class186.method1206(class15.field423.field233[0], 0, (byte) 125, class15.field423.field198[0], var26.field233[0], 1, false, 1, 0, 0, var26.field198[0], 2);
                class73.field1540 = 2;
                class205.field3946 = 0;
                class159.field3164 = class81.field1645;
                class185.field3505 = class31.field705;
                class99.field2000.method405(66, 7);
                class99.field2000.method450(var5, (byte) -84);
                class87.field1720++;
            }
        }
        if (arg0 != -82) {
            return;
        }
        if (var4 == 44) {
            class111.field2263++;
            class9.method65(var6, (byte) 126, var2, var3);
            class99.field2000.method405(42, arg0 ^ 0xFFFFFFA9);
            class99.field2000.method458((int) (var6 >>> 32) & Integer.MAX_VALUE, arg0 + 9427);
            class99.field2000.method464(arg0 + 1361896122, var2 - -class210.field4077);
            class99.field2000.method450(class115.field2343 + var3, (byte) -82);
        }
        if (var4 == 7) {
            class94.field1911++;
            boolean var27 = class186.method1206(class15.field423.field233[0], 0, (byte) -108, class15.field423.field198[0], var3, 0, false, 0, 0, 0, var2, 2);
            if (!var27) {
                class186.method1206(class15.field423.field233[0], 0, (byte) 126, class15.field423.field198[0], var3, 1, false, 1, 0, 0, var2, 2);
            }
            class73.field1540 = 2;
            class185.field3505 = class31.field705;
            class159.field3164 = class81.field1645;
            class205.field3946 = 0;
            class99.field2000.method405(118, arg0 ^ 0xFFFFFFA9);
            class99.field2000.method464(1361896040, var5);
            class99.field2000.method458(var2 + class210.field4077, 9345);
            class99.field2000.method464(1361896040, var3 + class115.field2343);
        }
        if (var4 == 14) {
            class99.field2000.method405(165, arg0 ^ 0xFFFFFFA9);
            class99.field2000.method450(var3, (byte) -106);
            class125.field2537++;
            class99.field2000.method460(var2, 122);
            class99.field2000.method441(var5, (byte) -104);
            class65.field1317 = 0;
            class49.field1075 = class175.method1155(var2, (byte) -125);
            class105.field2148 = var3;
        }
        if (var4 == 1001) {
            class73.field1540 = 2;
            class52.field1100++;
            class205.field3946 = 0;
            class185.field3505 = class31.field705;
            class159.field3164 = class81.field1645;
            class99.field2000.method405(43, arg0 + 89);
            class99.field2000.method450(var5, (byte) -114);
        }
        if (var4 == 34) {
            class99.field2000.method405(230, arg0 + 89);
            class36.field827++;
            class99.field2000.method438(var2, 83);
            class99.field2000.method446(class138.field2766, -26751);
            class99.field2000.method458(class118.field2402, 9345);
            class99.field2000.method441(var3, (byte) -82);
        }
        if (var4 == 40) {
            class129 var29 = class107.field2187[var5];
            if (var29 != null) {
                class186.method1206(class15.field423.field233[0], 0, (byte) -90, class15.field423.field198[0], var29.field233[0], 1, false, 1, 0, 0, var29.field198[0], 2);
                class94.field1914++;
                class159.field3164 = class81.field1645;
                class73.field1540 = 2;
                class205.field3946 = 0;
                class185.field3505 = class31.field705;
                class99.field2000.method405(49, 7);
                class99.field2000.method464(1361896040, var5);
            }
        }
        if (var4 == 6) {
            class156.field3096++;
            boolean var30 = class186.method1206(class15.field423.field233[0], 0, (byte) 127, class15.field423.field198[0], var3, 0, false, 0, 0, 0, var2, 2);
            if (!var30) {
                class186.method1206(class15.field423.field233[0], 0, (byte) -10, class15.field423.field198[0], var3, 1, false, 1, 0, 0, var2, 2);
            }
            class159.field3164 = class81.field1645;
            class185.field3505 = class31.field705;
            class73.field1540 = 2;
            class205.field3946 = 0;
            class99.field2000.method405(59, 7);
            class99.field2000.method441(var5, (byte) -99);
            class99.field2000.method458(class115.field2343 + var3, arg0 + 9427);
            class99.field2000.method441(class210.field4077 + var2, (byte) -116);
        }
        if (var4 == 19) {
            class129 var32 = class107.field2187[var5];
            if (var32 != null) {
                class101.field2071++;
                class186.method1206(class15.field423.field233[0], 0, (byte) -61, class15.field423.field198[0], var32.field233[0], 1, false, 1, 0, 0, var32.field198[0], 2);
                class73.field1540 = 2;
                class185.field3505 = class31.field705;
                class205.field3946 = 0;
                class159.field3164 = class81.field1645;
                class99.field2000.method405(175, 7);
                class99.field2000.method464(1361896040, var5);
            }
        }
        if (var4 == 32) {
            class103.field2124++;
            boolean var33 = class186.method1206(class15.field423.field233[0], 0, (byte) -36, class15.field423.field198[0], var3, 0, false, 0, 0, 0, var2, 2);
            if (!var33) {
                class186.method1206(class15.field423.field233[0], 0, (byte) -43, class15.field423.field198[0], var3, 1, false, 1, 0, 0, var2, 2);
            }
            class73.field1540 = 2;
            class185.field3505 = class31.field705;
            class159.field3164 = class81.field1645;
            class205.field3946 = 0;
            class99.field2000.method405(201, arg0 ^ 0xFFFFFFA9);
            class99.field2000.method450(class1.field101, (byte) -79);
            class99.field2000.method441(class130.field2611, (byte) -81);
            class99.field2000.method426(class31.field699, (byte) -13);
            class99.field2000.method458(class210.field4077 + var2, 9345);
            class99.field2000.method450(class115.field2343 + var3, (byte) -92);
            class99.field2000.method464(1361896040, var5);
        }
        if (var4 == 1) {
            class129 var35 = class107.field2187[var5];
            if (var35 != null) {
                class186.method1206(class15.field423.field233[0], 0, (byte) 125, class15.field423.field198[0], var35.field233[0], 1, false, 1, 0, 0, var35.field198[0], 2);
                class73.field1540 = 2;
                class185.field3505 = class31.field705;
                class58.field1216++;
                class205.field3946 = 0;
                class159.field3164 = class81.field1645;
                class99.field2000.method405(33, arg0 + 89);
                class99.field2000.method446(class138.field2766, -26751);
                class99.field2000.method458(var5, 9345);
                class99.field2000.method450(class118.field2402, (byte) -117);
            }
        }
        if (var4 == 12) {
            class1 var36 = class148.method961(var3, var2, (byte) -124);
            if (var36 != null) {
                class43.method270(arg0 + 199);
                class70.method432(class132.method869(class114.method766(-38, var36), arg0 ^ 0xFF56A65), -21303, var2, var3);
                class59.field1235 = 0;
                class124.field2527 = class213.method1384(var36, arg0 + 82);
                if (class124.field2527 == null) {
                    class124.field2527 = class193.field3781;
                }
                if (!var36.field94) {
                    class33.field746 = class77.method529(-3, new class92[] { class186.field3515, var36.field58, class49.field1059 });
                    return;
                }
                class33.field746 = class77.method529(arg0 + 79, new class92[] { var36.field111, class49.field1059 });
            }
            return;
        }
        if (var4 == 4) {
            class9.method65(var6, (byte) -8, var2, var3);
            class99.field2000.method405(200, 7);
            class99.field2000.method450(var3 + class115.field2343, (byte) -63);
            class39.field873++;
            class99.field2000.method458(Integer.MAX_VALUE & (int) (var6 >>> 32), 9345);
            class99.field2000.method441(class210.field4077 + var2, (byte) -93);
        }
        if (var4 == 31) {
            class74.field1561++;
            class99.field2000.method405(94, arg0 ^ 0xFFFFFFA9);
            class99.field2000.method446(var2, -26751);
            class99.field2000.method450(var3, (byte) -65);
            class99.field2000.method464(1361896040, var5);
            class65.field1317 = 0;
            class49.field1075 = class175.method1155(var2, (byte) -93);
            class105.field2148 = var3;
        }
        if (var4 == 36 && class9.method65(var6, (byte) 126, var2, var3)) {
            class120.field2442++;
            class99.field2000.method405(9, arg0 ^ 0xFFFFFFA9);
            class99.field2000.method446(class138.field2766, -26751);
            class99.field2000.method450(Integer.MAX_VALUE & (int) (var6 >>> 32), (byte) -61);
            class99.field2000.method464(1361896040, class118.field2402);
            class99.field2000.method450(class115.field2343 + var3, (byte) -125);
            class99.field2000.method450(class210.field4077 + var2, (byte) -127);
        }
        if (var4 == 11) {
            class185.method1201(class81.field1639, var3, var2);
        }
        if (var4 == 3) {
            class58.field1217++;
            class99.field2000.method405(13, arg0 + 89);
            class99.field2000.method446(var2, -26751);
            class1 var37 = class175.method1155(var2, (byte) -81);
            if (var37.field43 != null && var37.field43[0][0] == 5) {
                int var38 = var37.field43[0][1];
                class165.field3242[var38] = 1 - class165.field3242[var38];
                class139.method924(var38, (byte) 125);
            }
        }
        if (var4 == 49) {
            class99.field2000.method405(151, 7);
            class99.field2000.method441(var5, (byte) -103);
            class99.field2000.method446(class138.field2766, -26751);
            class10.field342++;
            class99.field2000.method446(var2, -26751);
            class99.field2000.method450(var3, (byte) -73);
            class99.field2000.method458(class118.field2402, 9345);
            class65.field1317 = 0;
            class49.field1075 = class175.method1155(var2, (byte) 37);
            class105.field2148 = var3;
        }
        if (var4 == 24) {
            class91 var39 = class172.field3347[var5];
            if (var39 != null) {
                class186.method1206(class15.field423.field233[0], 0, (byte) -5, class15.field423.field198[0], var39.field233[0], 1, false, 1, 0, 0, var39.field198[0], 2);
                class99.field2003++;
                class185.field3505 = class31.field705;
                class159.field3164 = class81.field1645;
                class73.field1540 = 2;
                class205.field3946 = 0;
                class99.field2000.method405(236, arg0 ^ 0xFFFFFFA9);
                class99.field2000.method450(var5, (byte) -70);
            }
        }
        if (var4 == 1005) {
            class159.field3164 = class81.field1645;
            class73.field1540 = 2;
            class205.field3946 = 0;
            class185.field3505 = class31.field705;
            class129 var40 = class107.field2187[var5];
            if (var40 != null) {
                class97 var41 = var40.field2592;
                if (var41.field1940 != null) {
                    var41 = var41.method674((byte) -99);
                }
                if (var41 != null) {
                    class68.field1372++;
                    class99.field2000.method405(83, 7);
                    class99.field2000.method458(var41.field1959, arg0 + 9427);
                }
            }
        }
        if (var4 == 29) {
            class43.method270(arg0 + 202);
            class1 var42 = class175.method1155(var2, (byte) 82);
            class1.field101 = var3;
            class31.field699 = var2;
            class130.field2611 = var5;
            class59.field1235 = 1;
            class3.method21(26702, var42);
            class1.field6 = class77.method529(arg0 ^ 0x53, new class92[] { class51.field1079, class92.method626((byte) 59, var5).field2162, class49.field1059 });
            if (class1.field6 == null) {
                class1.field6 = class60.field1251;
            }
            return;
        }
        if (var4 == 58) {
            class91 var43 = class172.field3347[var5];
            if (var43 != null) {
                class186.method1206(class15.field423.field233[0], 0, (byte) 125, class15.field423.field198[0], var43.field233[0], 1, false, 1, 0, 0, var43.field198[0], 2);
                class185.field3505 = class31.field705;
                class127.field2569++;
                class159.field3164 = class81.field1645;
                class73.field1540 = 2;
                class205.field3946 = 0;
                class99.field2000.method405(202, 7);
                class99.field2000.method441(var5, (byte) -82);
            }
        }
        if (var4 == 45) {
            class59.field1234++;
            boolean var44 = class186.method1206(class15.field423.field233[0], 0, (byte) 125, class15.field423.field198[0], var3, 0, false, 0, 0, 0, var2, 2);
            if (!var44) {
                class186.method1206(class15.field423.field233[0], 0, (byte) -27, class15.field423.field198[0], var3, 1, false, 1, 0, 0, var2, 2);
            }
            class159.field3164 = class81.field1645;
            class205.field3946 = 0;
            class73.field1540 = 2;
            class185.field3505 = class31.field705;
            class99.field2000.method405(60, arg0 + 89);
            class99.field2000.method441(var5, (byte) -109);
            class99.field2000.method458(var3 + class115.field2343, 9345);
            class99.field2000.method441(class210.field4077 + var2, (byte) -107);
        }
        if (var4 == 5) {
            class91 var46 = class172.field3347[var5];
            if (var46 != null) {
                class5.field282++;
                class186.method1206(class15.field423.field233[0], 0, (byte) 126, class15.field423.field198[0], var46.field233[0], 1, false, 1, 0, 0, var46.field198[0], 2);
                class205.field3946 = 0;
                class185.field3505 = class31.field705;
                class73.field1540 = 2;
                class159.field3164 = class81.field1645;
                class99.field2000.method405(87, 7);
                class99.field2000.method450(var5, (byte) -112);
            }
        }
        if (var4 == 35) {
            class189.field3584++;
            class99.field2000.method405(44, 7);
            class99.field2000.method464(1361896040, var3);
            class99.field2000.method441(var5, (byte) -93);
            class99.field2000.method426(var2, (byte) -13);
            class65.field1317 = 0;
            class49.field1075 = class175.method1155(var2, (byte) 70);
            class105.field2148 = var3;
        }
        if (var4 == 10) {
            class129 var47 = class107.field2187[var5];
            if (var47 != null) {
                class186.method1206(class15.field423.field233[0], 0, (byte) 126, class15.field423.field198[0], var47.field233[0], 1, false, 1, 0, 0, var47.field198[0], 2);
                class185.field3505 = class31.field705;
                class96.field1932++;
                class73.field1540 = 2;
                class205.field3946 = 0;
                class159.field3164 = class81.field1645;
                class99.field2000.method405(86, arg0 + 89);
                class99.field2000.method464(arg0 ^ 0xAED31DC6, var5);
            }
        }
        if (var4 == 41) {
            class67.field1360++;
            class99.field2000.method405(231, 7);
            class99.field2000.method464(1361896040, var5);
            class99.field2000.method446(var2, -26751);
            class99.field2000.method458(var3, 9345);
            class65.field1317 = 0;
            class49.field1075 = class175.method1155(var2, (byte) 48);
            class105.field2148 = var3;
        }
        if (var4 == 30) {
            class99.field2000.method405(170, 7);
            class99.field2000.method441(var3, (byte) -73);
            class99.field2000.method458(var5, arg0 + 9427);
            class175.field3386++;
            class99.field2000.method426(var2, (byte) -13);
            class65.field1317 = 0;
            class49.field1075 = class175.method1155(var2, (byte) 81);
            class105.field2148 = var3;
        }
        if (var4 == 22) {
            class99.field2000.method405(254, 7);
            class99.field2000.method426(class31.field699, (byte) -13);
            class99.field2000.method441(var3, (byte) -87);
            class15.field420++;
            class99.field2000.method438(var2, 86);
            class99.field2000.method441(class130.field2611, (byte) -69);
            class99.field2000.method441(var5, (byte) -66);
            class99.field2000.method441(class1.field101, (byte) -85);
            class65.field1317 = 0;
            class49.field1075 = class175.method1155(var2, (byte) -124);
            class105.field2148 = var3;
        }
        if (var4 == 17 || var4 == 1006) {
            class27.method172(class189.field3604[arg1], var3, var5, 123, var2);
        }
        if (var4 == 9 && class93.field1897 == null) {
            class206.method1342(138, var3, var2);
            class93.field1897 = class148.method961(var3, var2, (byte) -118);
            class3.method21(26702, class93.field1897);
        }
        if (var4 == 51) {
            class99.field2000.method405(215, 7);
            class135.field2705++;
            class99.field2000.method426(var2, (byte) -13);
            class99.field2000.method464(1361896040, var3);
            class99.field2000.method441(var5, (byte) -113);
            class65.field1317 = 0;
            class49.field1075 = class175.method1155(var2, (byte) 39);
            class105.field2148 = var3;
        }
        if (var4 == 20) {
            class91 var48 = class172.field3347[var5];
            if (var48 != null) {
                class81.field1654++;
                class186.method1206(class15.field423.field233[0], 0, (byte) -22, class15.field423.field198[0], var48.field233[0], 1, false, 1, 0, 0, var48.field198[0], 2);
                class185.field3505 = class31.field705;
                class205.field3946 = 0;
                class159.field3164 = class81.field1645;
                class73.field1540 = 2;
                class99.field2000.method405(70, 7);
                class99.field2000.method458(var5, 9345);
            }
        }
        if (var4 == 23) {
            class125.field2543++;
            class9.method65(var6, (byte) 126, var2, var3);
            class99.field2000.method405(237, 7);
            class99.field2000.method450((int) (var6 >>> 32) & Integer.MAX_VALUE, (byte) -55);
            class99.field2000.method464(1361896040, class210.field4077 + var2);
            class99.field2000.method450(class115.field2343 + var3, (byte) -108);
        }
        if (var4 == 28) {
            class91 var49 = class172.field3347[var5];
            if (var49 != null) {
                class186.method1206(class15.field423.field233[0], 0, (byte) -93, class15.field423.field198[0], var49.field233[0], 1, false, 1, 0, 0, var49.field198[0], 2);
                class205.field3946 = 0;
                class159.field3164 = class81.field1645;
                class73.field1540 = 2;
                class185.field3505 = class31.field705;
                class99.field2000.method405(188, arg0 + 89);
                class49.field1068++;
                class99.field2000.method450(var5, (byte) -72);
            }
        }
        if (var4 == 37) {
            class103.field2119++;
            class99.field2000.method405(123, 7);
            class99.field2000.method458(var5, 9345);
            class99.field2000.method450(var3, (byte) -120);
            class99.field2000.method460(var2, 110);
            class65.field1317 = 0;
            class49.field1075 = class175.method1155(var2, (byte) -124);
            class105.field2148 = var3;
        }
        if (class59.field1235 != 0) {
            class59.field1235 = 0;
            class3.method21(arg0 + 26784, class175.method1155(class31.field699, (byte) 78));
        }
        if (class95.field1918) {
            class43.method270(106);
        }
        if (class49.field1075 != null && class65.field1317 == 0) {
            class3.method21(26702, class49.field1075);
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IZIILnh;I)V")
    public static final void method866(int arg0, boolean arg1, int arg2, int arg3, class133 arg4, int arg5) {
        class156.field3100 = arg4;
        class79.field1619 = arg0;
        class151.field3002 = arg3;
        field2635++;
        class33.field738 = 10000;
        class110.field2245 = arg2;
        class150.field2980 = arg5;
        class151.field2989 = arg1;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IBI)V")
    public static final void method867(int arg0, byte arg1, int arg2) {
        field2629++;
        if (arg1 != 92) {
            method863((byte) -93);
        }
        long var3 = (long) ((arg0 << 16) + arg2);
        class153 var5 = (class153) class164.field3198.method216(arg1 - 167, var3);
        if (var5 != null) {
            class156.field3094.method1160(arg1 - 1886201749, var5);
        }
    }
}
