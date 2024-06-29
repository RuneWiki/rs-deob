import java.awt.Component;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class80 {

    @OriginalMember(owner = "client!ld", name = "s", descriptor = "I")
    public int field1950;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    public int field1935;

    @OriginalMember(owner = "client!ld", name = "o", descriptor = "I")
    public int field1946;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
    public int field1932;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "Lja;")
    public static class62 field1933 = class30.method243(43, "Sie befinden sich in einem Mitglieder)2Gebiet(Q");

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "Lja;")
    public static class62 field1939 = class30.method243(43, "blinken2:");

    @OriginalMember(owner = "client!ld", name = "q", descriptor = "I")
    public static int field1948 = 0;

    @OriginalMember(owner = "client!ld", name = "p", descriptor = "[I")
    public static int[] field1947 = new int[50];

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "Lja;")
    public static class62 field1941 = class30.method243(43, "da dieser Computer gegen unsere ");

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "Lja;")
    private static class62 field1938 = class30.method243(43, "Please try again)3");

    @OriginalMember(owner = "client!ld", name = "n", descriptor = "I")
    public static int field1945 = 0;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "Lja;")
    public static class62 field1937 = field1938;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
    public static int field1934;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
    public static int field1936;

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "I")
    public static int field1940;

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "I")
    public static int field1942;

    @OriginalMember(owner = "client!ld", name = "l", descriptor = "I")
    public static int field1943;

    @OriginalMember(owner = "client!ld", name = "m", descriptor = "I")
    public static int field1944;

    @OriginalMember(owner = "client!ld", name = "r", descriptor = "I")
    public static int field1949;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIII)V")
    public static final void method631(int arg0, int arg1, int arg2, int arg3) {
        field1949++;
        class147.method1173((byte) 10);
        class19.method141(arg0, arg3, class130.field2974.field2625 + arg0, arg3 - -class130.field2974.field2624);
        if (class15.field362 == 2 || class15.field362 == 5) {
            class19.method146(arg0 + 25, arg3 + 5, 0, class17.field397, class68.field1697);
        } else {
            int var4 = class62.field1495 + class50.field1162 & 0x7FF;
            int var5 = class40.field936.field136 / 32 + 48;
            int var6 = 464 - class40.field936.field134 / 32;
            class135.field3106.method422(arg0 + 25, arg3 + 5, 146, 151, var5, var6, var4, class128.field2909 + 256, class17.field397, class68.field1697);
            for (int var7 = 0; var7 < class97.field2264; var7++) {
                int var37 = class108.field2476[var7] * 4 + 2 - class40.field936.field136 / 32;
                int var38 = class139.field3228[var7] * 4 + 2 - class40.field936.field134 / 32;
                class36.method275(var37, class105.field2428[var7], arg3, 4, arg0, var38);
            }
            for (int var8 = 0; var8 < 104; var8++) {
                for (int var33 = 0; var33 < 104; var33++) {
                    class105 var34 = class32.field765[class155.field3598][var8][var33];
                    if (var34 != null) {
                        int var35 = var8 * 4 + 2 - class40.field936.field136 / 32;
                        int var36 = var33 * 4 + 2 - class40.field936.field134 / 32;
                        class36.method275(var35, class3.field36[0], arg3, 4, arg0, var36);
                    }
                }
            }
            for (int var9 = 0; var9 < class83.field2001; var9++) {
                class130 var29 = class136.field3127[class36.field871[var9]];
                if (var29 != null && var29.method66((byte) -24)) {
                    class138 var30 = var29.field2966;
                    if (var30 != null && var30.field3208 != null) {
                        var30 = var30.method1108(-1);
                    }
                    if (var30 != null && var30.field3206 && var30.field3202) {
                        int var31 = var29.field136 / 32 - class40.field936.field136 / 32;
                        int var32 = var29.field134 / 32 - class40.field936.field134 / 32;
                        class36.method275(var31, class3.field36[1], arg3, 4, arg0, var32);
                    }
                }
            }
            for (int var10 = 0; var10 < class147.field3460; var10++) {
                class115 var21 = class52.field1200[class141.field3311[var10]];
                if (var21 != null && var21.method66((byte) -24)) {
                    int var22 = var21.field134 / 32 - class40.field936.field134 / 32;
                    int var23 = var21.field136 / 32 - class40.field936.field136 / 32;
                    boolean var24 = false;
                    long var25 = var21.field2653.method448(37);
                    for (int var27 = 0; var27 < class54.field1334; var27++) {
                        if (class94.field2217[var27] == var25 && class136.field3128[var27] != 0) {
                            var24 = true;
                            break;
                        }
                    }
                    boolean var28 = false;
                    if (class40.field936.field2655 != 0 && var21.field2655 != 0 && class40.field936.field2655 == var21.field2655) {
                        var28 = true;
                    }
                    if (var24) {
                        class36.method275(var23, class3.field36[3], arg3, 4, arg0, var22);
                    } else if (var28) {
                        class36.method275(var23, class3.field36[4], arg3, 4, arg0, var22);
                    } else {
                        class36.method275(var23, class3.field36[2], arg3, 4, arg0, var22);
                    }
                }
            }
            if (class116.field2676 != 0 && class86.field2060 % 20 < 10) {
                if (class116.field2676 == 1 && class122.field2786 >= 0 && class136.field3127.length > class122.field2786) {
                    class130 var11 = class136.field3127[class122.field2786];
                    if (var11 != null) {
                        int var12 = var11.field136 / 32 - class40.field936.field136 / 32;
                        int var13 = var11.field134 / 32 - class40.field936.field134 / 32;
                        class124.method973(class81.field1957[1], arg0, var13, var12, arg3, 3200);
                    }
                }
                if (class116.field2676 == 2) {
                    int var14 = (class82.field1978 - class40.field926) * 4 + 2 - class40.field936.field136 / 32;
                    int var15 = (class144.field3356 - class27.field673) * 4 + 2 - class40.field936.field134 / 32;
                    class124.method973(class81.field1957[1], arg0, var15, var14, arg3, 3200);
                }
                if (class116.field2676 == 10 && class57.field1391 >= 0 && class52.field1200.length > class57.field1391) {
                    class115 var16 = class52.field1200[class57.field1391];
                    if (var16 != null) {
                        int var17 = var16.field136 / 32 - class40.field936.field136 / 32;
                        int var18 = var16.field134 / 32 - class40.field936.field134 / 32;
                        class124.method973(class81.field1957[1], arg0, var18, var17, arg3, 3200);
                    }
                }
            }
            if (class146.field3444 != 0) {
                int var19 = class146.field3444 * 4 + 2 - class40.field936.field136 / 32;
                int var20 = class24.field597 * 4 + 2 - class40.field936.field134 / 32;
                class36.method275(var19, class81.field1957[0], arg3, 4, arg0, var20);
            }
            class19.method143(arg0 + 97, arg3 - -78, 3, 3, 16777215);
        }
        if (class15.field362 >= 3) {
            class19.method146(arg0, arg3, 0, class132.field3019, class81.field1962);
        } else {
            class121.field2772.method422(arg0, arg3, 33, 33, 25, 25, class62.field1495, 256, class132.field3019, class81.field1962);
        }
        if (class121.field2769[arg1]) {
            class130.field2974.method932(arg0, arg3);
        }
        class134.field3070[arg1] = true;
        if (arg2 > -126) {
            field1933 = null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILjava/awt/Component;Lpd;Lpd;)V")
    public static final void method632(int arg0, Component arg1, class108 arg2, class108 arg3) {
        field1942++;
        if (class75.field1860) {
            return;
        }
        class19.method133();
        byte[] var4 = arg2.method870(class116.field2670, class7.field211, true);
        class110.field2518 = new class58(var4, arg1);
        class57.field1389 = class110.field2518.method410();
        class128.field2871 = class93.method717(arg3, class7.field211, class70.field1781, -105);
        class15.field370 = class93.method717(arg3, class7.field211, class143.field3341, -112);
        class40.field939 = class93.method717(arg3, class7.field211, class132.field3029, -117);
        class132.field3027 = class50.method348(class7.field211, class67.field1675, arg3, 2);
        class151.field3553 = class50.method348(class7.field211, class149.field3511, arg3, 2);
        class30.field738 = new int[256];
        int var5 = 101 % ((49 - arg0) / 63);
        for (int var6 = 0; var6 < 64; var6++) {
            class30.field738[var6] = var6 * 262144;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            class30.field738[var7 + 64] = var7 * 1024 + 16711680;
        }
        for (int var8 = 0; var8 < 64; var8++) {
            class30.field738[var8 + 128] = var8 * 4 + 16776960;
        }
        for (int var9 = 0; var9 < 64; var9++) {
            class30.field738[var9 + 192] = 16777215;
        }
        class115.field2640 = new int[256];
        for (int var10 = 0; var10 < 64; var10++) {
            class115.field2640[var10] = var10 * 1024;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            class115.field2640[var11 + 64] = var11 * 4 + 65280;
        }
        for (int var12 = 0; var12 < 64; var12++) {
            class115.field2640[var12 + 128] = var12 * 262144 + 65535;
        }
        for (int var13 = 0; var13 < 64; var13++) {
            class115.field2640[var13 + 192] = 16777215;
        }
        class22.field524 = new int[256];
        for (int var14 = 0; var14 < 64; var14++) {
            class22.field524[var14] = var14 * 4;
        }
        for (int var15 = 0; var15 < 64; var15++) {
            class22.field524[var15 + 64] = var15 * 262144 + 255;
        }
        for (int var16 = 0; var16 < 64; var16++) {
            class22.field524[var16 + 128] = var16 * 1024 + 16711935;
        }
        for (int var17 = 0; var17 < 64; var17++) {
            class22.field524[var17 + 192] = 16777215;
        }
        class34.field811 = new int[256];
        class75.field1867 = new int[32768];
        class4.field52 = new int[32768];
        class143.method1133(0, null);
        class134.field3092 = new int[32768];
        if (class141.field3308 == 0) {
            class6.field160 = true;
        } else {
            class6.field160 = false;
        }
        class51.field1181 = false;
        class10.field244 = 0;
        class7.field215 = class7.field211;
        class7.field210 = class7.field211;
        class151.field3550 = new int[32768];
        if (class6.field160) {
            class17.method117((byte) 68, 2);
        } else {
            class5.method49(255, class31.field761, 2, 75, class7.field211, class59.field1441, false);
        }
        method633(60, false);
        class75.field1860 = true;
        class110.field2518.method411(0, 0);
        class57.field1389.method411(382, 0);
        class128.field2871.method932(382 - class128.field2871.field2625 / 2, 18);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IZ)V")
    public static final void method633(int arg0, boolean arg1) {
        if (arg0 <= 11) {
            field1936 = -85;
        }
        field1934++;
        if (class126.field2840 == null) {
            return;
        }
        try {
            class128 var2 = new class128(4);
            var2.method1010(arg1 ? 2 : 3, 32768);
            var2.method1003(114, 0);
            class126.field2840.method979(4, 19770, var2.field2874, 0);
        } catch (IOException var4) {
            try {
                class126.field2840.method978(117);
            } catch (Exception var3) {
            }
            class75.field1865++;
            class126.field2840 = null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
    public static final void method634(int arg0) {
        field1944++;
        if (arg0 != 1) {
            field1939 = null;
        }
        for (class131 var1 = (class131) class138.field3217.method840(true); var1 != null; var1 = (class131) class138.field3217.method841((byte) 18)) {
            if (var1.field2994 > 0) {
                var1.field2994--;
            }
            if (var1.field2994 != 0) {
                if (var1.field2986 > 0) {
                    var1.field2986--;
                }
                if (var1.field2986 == 0 && var1.field2989 >= 1 && var1.field3002 >= 1 && var1.field2989 <= 102 && var1.field3002 <= 102 && (var1.field2985 < 0 || class17.method116(106, var1.field2985, var1.field2996))) {
                    class47.method337(var1.field2985, var1.field2996, var1.field2998, var1.field2989, var1.field3005, -27995, var1.field3002, var1.field3000);
                    var1.field2986 = -1;
                    if (var1.field2985 == var1.field2984 && var1.field2984 == -1) {
                        var1.method1176((byte) -122);
                    } else if (var1.field2985 == var1.field2984 && var1.field2998 == var1.field2995 && var1.field2996 == var1.field2981) {
                        var1.method1176((byte) -120);
                    }
                }
            } else if (var1.field2984 < 0 || class17.method116(arg0 + 122, var1.field2984, var1.field2981)) {
                class47.method337(var1.field2984, var1.field2981, var1.field2995, var1.field2989, var1.field3005, -27995, var1.field3002, var1.field3000);
                var1.method1176((byte) -121);
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)Z")
    public static final boolean method635(int arg0, int arg1) {
        if (arg0 == -1295571787) {
            field1943++;
            return (arg1 >> 21 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Z)V")
    public static final void method636(boolean arg0) {
        class113.method931(true, false);
        boolean var1 = true;
        field1940++;
        field1945 = 0;
        for (int var2 = 0; var2 < class34.field801.length; var2++) {
            if (class146.field3442[var2] != -1 && class34.field801[var2] == null) {
                class34.field801[var2] = class17.field399.method867(class146.field3442[var2], 15, 0);
                if (class34.field801[var2] == null) {
                    var1 = false;
                    field1945++;
                }
            }
            if (class22.field516[var2] != -1 && class24.field601[var2] == null) {
                class24.field601[var2] = class17.field399.method876(-5, class22.field516[var2], class132.field3028[var2], 0);
                if (class24.field601[var2] == null) {
                    var1 = false;
                    field1945++;
                }
            }
        }
        if (!var1) {
            class88.field2096 = 1;
            return;
        }
        boolean var3 = true;
        class132.field3009 = 0;
        for (int var4 = 0; var4 < class34.field801.length; var4++) {
            byte[] var56 = class24.field601[var4];
            if (var56 != null) {
                int var57 = (class85.field2043[var4] >> 8) * 64 - class40.field926;
                int var58 = (class85.field2043[var4] & 0xFF) * 64 - class27.field673;
                if (class24.field589) {
                    var57 = 10;
                    var58 = 10;
                }
                var3 &= class96.method745(arg0, var57, var58, var56);
            }
        }
        if (!var3) {
            class88.field2096 = 2;
            return;
        }
        if (class88.field2096 != 0) {
            class122.method964(class70.method594(new class62[] { class43.field991, class7.field206 }, 1229), -13897, true);
        }
        class147.method1173((byte) 10);
        class138.method1106((byte) 25);
        class147.method1173((byte) 10);
        class119.field2703.method591();
        class147.method1173((byte) 10);
        System.gc();
        for (int var5 = 0; var5 < 4; var5++) {
            class131.field2991[var5].method1201((byte) 63);
        }
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var54 = 0; var54 < 104; var54++) {
                for (int var55 = 0; var55 < 104; var55++) {
                    class155.field3581[var6][var54][var55] = 0;
                }
            }
        }
        class147.method1173((byte) 10);
        class119.method953((byte) -23);
        int var7 = class34.field801.length;
        class113.method930(31);
        class113.method931(true, arg0);
        if (!class24.field589) {
            for (int var8 = 0; var8 < var7; var8++) {
                byte[] var17 = class34.field801[var8];
                int var18 = (class85.field2043[var8] & 0xFF) * 64 - class27.field673;
                int var19 = (class85.field2043[var8] >> 8) * 64 - class40.field926;
                if (var17 != null) {
                    class147.method1173((byte) 10);
                    class35.method269(class28.field694 * 8 - 48, var18, field1936 * 8 - 48, (byte) 109, var17, class131.field2991, var19);
                }
            }
            for (int var9 = 0; var9 < var7; var9++) {
                int var14 = (class85.field2043[var9] >> 8) * 64 - class40.field926;
                int var15 = (class85.field2043[var9] & 0xFF) * 64 - class27.field673;
                byte[] var16 = class34.field801[var9];
                if (var16 == null && field1936 < 800) {
                    class147.method1173((byte) 10);
                    class17.method122(64, var14, var15, -6257, 64);
                }
            }
            class113.method931(true, true);
            for (int var10 = 0; var10 < var7; var10++) {
                byte[] var11 = class24.field601[var10];
                if (var11 != null) {
                    int var12 = (class85.field2043[var10] >> 8) * 64 - class40.field926;
                    int var13 = (class85.field2043[var10] & 0xFF) * 64 - class27.field673;
                    class147.method1173((byte) 10);
                    class153.method1193(var13, var11, class131.field2991, false, var12, class119.field2703);
                }
            }
        }
        if (class24.field589) {
            for (int var20 = 0; var20 < 4; var20++) {
                class147.method1173((byte) 10);
                for (int var34 = 0; var34 < 13; var34++) {
                    for (int var35 = 0; var35 < 13; var35++) {
                        boolean var36 = false;
                        int var37 = class40.field927[var20][var34][var35];
                        if (var37 != -1) {
                            int var38 = var37 >> 24 & 0x3;
                            int var39 = var37 >> 1 & 0x3;
                            int var40 = var37 >> 14 & 0x3FF;
                            int var41 = var37 >> 3 & 0x7FF;
                            int var42 = (var40 / 8 << 8) + var41 / 8;
                            for (int var43 = 0; var43 < class85.field2043.length; var43++) {
                                if (class85.field2043[var43] == var42 && class34.field801[var43] != null) {
                                    var36 = true;
                                    class68.method530((byte) -124, var38, var20, var34 * 8, (var41 & 0x7) * 8, var35 * 8, class131.field2991, (var40 & 0x7) * 8, var39, class34.field801[var43]);
                                    break;
                                }
                            }
                        }
                        if (!var36) {
                            client.method162(var20, true, var34 * 8, var35 * 8);
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < 13; var21++) {
                for (int var32 = 0; var32 < 13; var32++) {
                    int var33 = class40.field927[0][var21][var32];
                    if (var33 == -1) {
                        class17.method122(8, var21 * 8, var32 * 8, -6257, 8);
                    }
                }
            }
            class113.method931(arg0, true);
            for (int var22 = 0; var22 < 4; var22++) {
                class147.method1173((byte) 10);
                for (int var23 = 0; var23 < 13; var23++) {
                    for (int var24 = 0; var24 < 13; var24++) {
                        int var25 = class40.field927[var22][var23][var24];
                        if (var25 != -1) {
                            int var26 = var25 >> 24 & 0x3;
                            int var27 = var25 >> 3 & 0x7FF;
                            int var28 = var25 >> 1 & 0x3;
                            int var29 = var25 >> 14 & 0x3FF;
                            int var30 = (var29 / 8 << 8) + var27 / 8;
                            for (int var31 = 0; var31 < class85.field2043.length; var31++) {
                                if (class85.field2043[var31] == var30 && class24.field601[var31] != null) {
                                    class155.method1211(var28, var24 * 8, (var27 & 0x7) * 8, var26, class119.field2703, var23 * 8, class24.field601[var31], class131.field2991, (byte) -107, var22, (var29 & 0x7) * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        class113.method931(true, true);
        class138.method1106((byte) 25);
        class147.method1173((byte) 10);
        class124.method975(class131.field2991, class119.field2703, -116);
        class113.method931(true, true);
        int var44 = class84.field2016;
        if (var44 > class155.field3598) {
            var44 = class155.field3598;
        }
        if (var44 < class155.field3598 - 1) {
            int var45 = class155.field3598 - 1;
        }
        if (class144.field3361) {
            class119.field2703.method566(class84.field2016);
        } else {
            class119.field2703.method566(0);
        }
        for (int var46 = 0; var46 < 104; var46++) {
            for (int var53 = 0; var53 < 104; var53++) {
                class93.method714(var46, 1336339591, var53);
            }
        }
        class147.method1173((byte) 10);
        class63.method480(true);
        class71.field1800.method127((byte) -125);
        if (class15.field348 != null) {
            class136.field3140.method810(-2, 229);
            class136.field3140.method1040(1057001181, -1308601992);
            class102.field2380++;
        }
        if (!class24.field589) {
            int var47 = (class28.field694 - 6) / 8;
            int var48 = (class28.field694 + 6) / 8;
            int var49 = (field1936 - 6) / 8;
            int var50 = (field1936 + 6) / 8;
            for (int var51 = var47 - 1; var51 <= var48 + 1; var51++) {
                for (int var52 = var49 - 1; var52 <= var50 + 1; var52++) {
                    if (var47 > var51 || var48 < var51 || var49 > var52 || var52 > var50) {
                        class17.field399.method866((byte) 123, class70.method594(new class62[] { class111.field2556, class31.method249(true, var51), class134.field3099, class31.method249(arg0, var52) }, 1229));
                        class17.field399.method866((byte) 127, class70.method594(new class62[] { class59.field1451, class31.method249(arg0, var51), class134.field3099, class31.method249(arg0, var52) }, 1229));
                    }
                }
            }
        }
        class62.method473((byte) 96, 30);
        class147.method1173((byte) 10);
        class132.method1060(95);
        class136.field3140.method810(-2, 65);
        class134.method1070(-309);
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)V")
    public static void method637(int arg0) {
        if (arg0 != -48) {
            field1936 = -110;
        }
        field1933 = null;
        field1937 = null;
        field1941 = null;
        field1938 = null;
        field1947 = null;
        field1939 = null;
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V")
    public class80() {
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lld;)V")
    public class80(class80 arg0) {
        this.field1950 = arg0.field1950;
        this.field1935 = arg0.field1935;
        this.field1946 = arg0.field1946;
        this.field1932 = arg0.field1932;
    }
}
