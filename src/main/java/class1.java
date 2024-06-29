import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class1 {

    @OriginalMember(owner = "client!a", name = "d", descriptor = "Lhb;")
    private static class44 field4 = class102.method810("go back to the main RuneScape webpage", -28606);

    @OriginalMember(owner = "client!a", name = "k", descriptor = "I")
    public static int field11 = -1;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "I")
    public static volatile int field2 = 0;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "Lhb;")
    public static class44 field3 = field4;

    @OriginalMember(owner = "client!a", name = "r", descriptor = "Lhb;")
    private static class44 field18 = class102.method810("Error connecting to server)3", -28606);

    @OriginalMember(owner = "client!a", name = "x", descriptor = "Z")
    public static boolean field24 = false;

    @OriginalMember(owner = "client!a", name = "q", descriptor = "I")
    public static int field17 = 0;

    @OriginalMember(owner = "client!a", name = "y", descriptor = "Lhb;")
    public static class44 field25 = field18;

    @OriginalMember(owner = "client!a", name = "z", descriptor = "Lhb;")
    private static class44 field26 = class102.method810("Take", -28606);

    @OriginalMember(owner = "client!a", name = "e", descriptor = "I")
    public static int field5 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "Lhb;")
    public static class44 field9 = field26;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!a", name = "n", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!a", name = "o", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!a", name = "p", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!a", name = "s", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!a", name = "u", descriptor = "I")
    public static int field21;

    @OriginalMember(owner = "client!a", name = "w", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!a", name = "m", descriptor = "Ltd;")
    public static class116 field13;

    @OriginalMember(owner = "client!a", name = "v", descriptor = "Lfc;")
    public static class34 field22;

    @OriginalMember(owner = "client!a", name = "t", descriptor = "Lpc;")
    public static class93 field20;

    @OriginalMember(owner = "client!a", name = "A", descriptor = "[I")
    public static int[] field27;

    @OriginalMember(owner = "client!a", name = "B", descriptor = "[Lhc;")
    public static class45[] field28;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V", line = 5)
    public static final synchronized void method1(int arg0) {
        if (arg0 <= 90) {
            return;
        }
        field19++;
        if (!class127.method950(-29360)) {
            return;
        }
        if (class117.field2859) {
            byte[] var1 = class64.method570(class11.field219, class77.field1926, class131.field3191, (byte) -93, class18.field356);
            if (var1 != null) {
                if (class120.field2927 >= 0) {
                    class49.method462(var1, class92.field2340, (byte) -101, class85.field2163, class120.field2927);
                } else if (class15.field285 < 0) {
                    class111.method849((byte) 89, class85.field2163, class92.field2340, var1);
                } else {
                    class2.method19(class92.field2340, var1, class15.field285, (byte) -96, class85.field2163);
                }
                class117.field2859 = false;
                class11.field219 = null;
            }
        }
        class98.method778((byte) -58);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IZIIZLhb;Ltd;Lhb;)V", line = 47)
    public static final synchronized void method2(int arg0, boolean arg1, int arg2, int arg3, boolean arg4, class44 arg5, class116 arg6, class44 arg7) {
        field1++;
        if (class127.method950(-29360) && arg4) {
            int var8 = arg6.method897(116, arg5);
            int var9 = arg6.method890((byte) 87, arg7, var8);
            method13(var8, arg6, (byte) -104, arg3, arg1, arg0, arg2, var9);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ZI)V", line = 66)
    public static final void method3(boolean arg0, int arg1) {
        for (int var2 = 0; var2 < class125.field3036; var2++) {
            class46 var3 = class116.field2845[class100.field2515[var2]];
            int var4 = (class100.field2515[var2] << 14) + 536870912;
            if (var3 != null && var3.method432((byte) -117) && arg0 == var3.field1137.field1000 && var3.field1137.method371((byte) -51)) {
                int var5 = var3.field1384 >> 7;
                int var6 = var3.field1371 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field1422 == 1 && (var3.field1384 & 0x7F) == 64 && (var3.field1371 & 0x7F) == 64) {
                        if (class72.field1815[var5][var6] == class34.field840) {
                            continue;
                        }
                        class72.field1815[var5][var6] = class34.field840;
                    }
                    if (!var3.field1137.field998) {
                        var4 += Integer.MIN_VALUE;
                    }
                    class89.field2283.method259(class79.field1993, var3.field1384, var3.field1371, class55.method507(var3.field1422 * 64 + var3.field1371 - 64, class79.field1993, var3.field1384 + var3.field1422 * 64 - 64, -1), (var3.field1422 - 1) * 64 + 60, var3, var3.field1419, var4, var3.field1339);
                }
            }
        }
        field12++;
        if (arg1 != -65) {
            method5((byte) -117);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIILtd;BIZ)V", line = 116)
    public static final synchronized void method4(int arg0, int arg1, int arg2, class116 arg3, byte arg4, int arg5, boolean arg6) {
        field7++;
        if (!class127.method950(-29360)) {
            return;
        }
        class120.field2927 = -1;
        class85.field2163 = arg6;
        if (arg4 >= -92) {
            field25 = null;
        }
        class15.field285 = -1;
        class77.field1926 = arg2;
        class131.field3191 = arg5;
        class92.field2340 = arg1;
        class11.field219 = arg3;
        class18.field356 = arg0;
        class117.field2859 = true;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(B)V", line = 138)
    public static void method5(byte arg0) {
        field27 = null;
        field28 = null;
        field9 = null;
        if (arg0 > -46) {
            method4(-11, 87, 67, null, (byte) 18, -118, true);
        }
        field13 = null;
        field22 = null;
        field4 = null;
        field18 = null;
        field26 = null;
        field25 = null;
        field20 = null;
        field3 = null;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II)V", line = 162)
    public static final synchronized void method6(int arg0, int arg1) {
        field14++;
        if (arg0 != 0) {
            method3(false, -74);
        }
        if (class127.method950(-29360)) {
            class81.method670(arg1, (byte) 2);
            class117.field2859 = false;
            class11.field219 = null;
        }
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(B)I", line = 185)
    public static final int method7(byte arg0) {
        field8++;
        int var1 = 3;
        if (class95.field2420 < 310) {
            int var2 = class130.field3122 >> 7;
            int var3 = class51.field1279 >> 7;
            int var4 = class72.field1820.field1371 >> 7;
            int var5 = class72.field1820.field1384 >> 7;
            if ((class104.field2668[class79.field1993][var2][var3] & 0x4) != 0) {
                var1 = class79.field1993;
            }
            int var6;
            if (var4 <= var3) {
                var6 = var3 - var4;
            } else {
                var6 = var4 - var3;
            }
            int var7;
            if (var5 <= var2) {
                var7 = var2 - var5;
            } else {
                var7 = var5 - var2;
            }
            if (var7 > var6) {
                int var8 = var6 * 65536 / var7;
                int var9 = 32768;
                while (var2 != var5) {
                    var9 += var8;
                    if (var2 < var5) {
                        var2++;
                    } else if (var2 > var5) {
                        var2--;
                    }
                    if ((class104.field2668[class79.field1993][var2][var3] & 0x4) != 0) {
                        var1 = class79.field1993;
                    }
                    if (var9 >= 65536) {
                        if (var3 < var4) {
                            var3++;
                        } else if (var4 < var3) {
                            var3--;
                        }
                        var9 -= 65536;
                        if ((class104.field2668[class79.field1993][var2][var3] & 0x4) != 0) {
                            var1 = class79.field1993;
                        }
                    }
                }
            } else {
                int var10 = var7 * 65536 / var6;
                int var11 = 32768;
                while (var3 != var4) {
                    var11 += var10;
                    if (var4 > var3) {
                        var3++;
                    } else if (var3 > var4) {
                        var3--;
                    }
                    if ((class104.field2668[class79.field1993][var2][var3] & 0x4) != 0) {
                        var1 = class79.field1993;
                    }
                    if (var11 >= 65536) {
                        if (var5 > var2) {
                            var2++;
                        } else if (var2 > var5) {
                            var2--;
                        }
                        if ((class104.field2668[class79.field1993][var2][var3] & 0x4) != 0) {
                            var1 = class79.field1993;
                        }
                        var11 -= 65536;
                    }
                }
            }
        }
        if (arg0 == -110) {
            if ((class104.field2668[class79.field1993][class72.field1820.field1384 >> 7][class72.field1820.field1371 >> 7] & 0x4) != 0) {
                var1 = class79.field1993;
            }
            return var1;
        } else {
            return 107;
        }
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V", line = 310)
    public static final void method8(int arg0) {
        field15++;
        short var1 = 256;
        if (class13.field252 > 0) {
            for (int var4 = 0; var4 < 256; var4++) {
                if (class13.field252 > 768) {
                    class118.field2904[var4] = class127.method951(class64.field1619[var4], -104, 1024 - class13.field252, class43.field996[var4]);
                } else if (class13.field252 <= 256) {
                    class118.field2904[var4] = class127.method951(class43.field996[var4], -67, 256 - class13.field252, class64.field1619[var4]);
                } else {
                    class118.field2904[var4] = class64.field1619[var4];
                }
            }
        } else if (class22.field456 <= 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                class118.field2904[var2] = class43.field996[var2];
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                if (class22.field456 > 768) {
                    class118.field2904[var3] = class127.method951(class81.field2069[var3], 109, 1024 - class22.field456, class43.field996[var3]);
                } else if (class22.field456 <= 256) {
                    class118.field2904[var3] = class127.method951(class43.field996[var3], 60, 256 - class22.field456, class81.field2069[var3]);
                } else {
                    class118.field2904[var3] = class81.field2069[var3];
                }
            }
        }
        for (int var5 = 0; var5 < 33920; var5++) {
            class11.field204.field2353[var5] = class77.field1924.field1131[var5];
        }
        int var6 = 1152;
        int var7 = 0;
        for (int var8 = 1; var8 < var1 - 1; var8++) {
            int var22 = (var1 - var8) * class98.field2500[var8] / var1;
            int var23 = var22 + 22;
            if (var23 < 0) {
                var23 = 0;
            }
            var7 += var23;
            for (int var24 = var23; var24 < 128; var24++) {
                int var25 = class9.field185[var7++];
                if (var25 == 0) {
                    var6++;
                } else {
                    int var27 = 256 - var25;
                    int var28 = class118.field2904[var25];
                    int var29 = class11.field204.field2353[var6];
                    class11.field204.field2353[var6++] = class118.method914(class118.method914(var28, 65280) * var25 + class118.method914(65280, var29) * var27, 16711680) + class118.method914(class118.method914(var28, 16711935) * var25 + var27 * class118.method914(var29, 16711935), -16711936) >> 8;
                }
            }
            var6 += var23;
        }
        if (arg0 != 16711680) {
            method1(10);
        }
        int var9 = 0;
        for (int var10 = 0; var10 < 33920; var10++) {
            class47.field1158.field2353[var10] = class34.field824.field1131[var10];
        }
        int var11 = 1176;
        for (int var12 = 1; var12 < var1 - 1; var12++) {
            int var13 = (var1 - var12) * class98.field2500[var12] / var1;
            int var14 = 103 - var13;
            int var15 = var11 + var13;
            for (int var16 = 0; var16 < var14; var16++) {
                int var17 = class9.field185[var9++];
                if (var17 == 0) {
                    var15++;
                } else {
                    int var19 = class47.field1158.field2353[var15];
                    int var20 = 256 - var17;
                    int var21 = class118.field2904[var17];
                    class47.field1158.field2353[var15++] = class118.method914(class118.method914(65280, var19) * var20 + var17 * class118.method914(65280, var21), 16711680) + class118.method914(class118.method914(var21, 16711935) * var17 + var20 * class118.method914(16711935, var19), -16711936) >> 8;
                }
            }
            var11 = var15 + 128 - var14 - var13;
            var9 += 128 - var14;
        }
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(I)V", line = 482)
    public static final void method9(int arg0) {
        field16++;
        if (class125.field3027 > 0) {
            class125.field3027--;
        }
        if (class35.field853 > 1) {
            class35.field853--;
        }
        if (class47.field1181) {
            class47.field1181 = false;
            class117.method901((byte) -30);
            return;
        }
        for (int var1 = 0; var1 < 100 && class42.method360(0); var1++) {
        }
        if (class69.field1709 != 30 && class69.field1709 != 35) {
            return;
        }
        if (class94.field2392 && class69.field1709 == 30) {
            class121.field2960 = 0;
            class128.field3074 = 0;
            while (class129.method961(-14)) {
            }
            for (int var2 = 0; var2 < class13.field257.length; var2++) {
                class13.field257[var2] = false;
            }
        }
        class25.method210(0, class92.field2333, 239);
        Object var3 = class101.field2566.field1575;
        synchronized (class101.field2566.field1575) {
            if (!class88.field2247) {
                class101.field2566.field1588 = 0;
            } else if (class128.field3074 != 0 || class101.field2566.field1588 >= 40) {
                class120.field2939++;
                int var4 = 0;
                class92.field2333.method702(true, 108);
                class92.field2333.method993(19579, 0);
                int var5 = class92.field2333.field3182;
                for (int var6 = 0; var6 < class101.field2566.field1588 && class92.field2333.field3182 - var5 < 240; var6++) {
                    var4++;
                    int var7 = class101.field2566.field1589[var6];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 502) {
                        var7 = 502;
                    }
                    int var8 = class101.field2566.field1586[var6];
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 764) {
                        var8 = 764;
                    }
                    int var9 = var7 * 765 + var8;
                    if (class101.field2566.field1589[var6] == -1 && class101.field2566.field1586[var6] == -1) {
                        var8 = -1;
                        var9 = 524287;
                        var7 = -1;
                    }
                    if (class80.field2052 != var8 || class23.field503 != var7) {
                        int var10 = var7 - class23.field503;
                        class23.field503 = var7;
                        int var11 = var8 - class80.field2052;
                        class80.field2052 = var8;
                        if (class35.field856 < 8 && var11 >= -32 && var11 <= 31 && var10 >= -32 && var10 <= 31) {
                            var10 += 32;
                            var11 += 32;
                            class92.field2333.method1017(124, (class35.field856 << 12) + (var11 << 6) + var10);
                            class35.field856 = 0;
                        } else if (class35.field856 < 8) {
                            class92.field2333.method977(-107, (class35.field856 << 19) + (var9 + 8388608));
                            class35.field856 = 0;
                        } else {
                            class92.field2333.method975((class35.field856 << 19) + var9 - 1073741824, false);
                            class35.field856 = 0;
                        }
                    } else if (class35.field856 < 2047) {
                        class35.field856++;
                    }
                }
                class92.field2333.method986(16, class92.field2333.field3182 - var5);
                if (var4 >= class101.field2566.field1588) {
                    class101.field2566.field1588 = 0;
                } else {
                    class101.field2566.field1588 -= var4;
                    for (int var12 = 0; var12 < class101.field2566.field1588; var12++) {
                        class101.field2566.field1586[var12] = class101.field2566.field1586[var12 + var4];
                        class101.field2566.field1589[var12] = class101.field2566.field1589[var12 + var4];
                    }
                }
            }
            int var13 = -123 / ((24 - arg0) / 45);
        }
        if (class128.field3074 != 0) {
            long var14 = (class31.field764 - class41.field918) / 50L;
            class43.field993++;
            int var16 = class40.field902;
            class41.field918 = class31.field764;
            byte var17 = 0;
            int var18 = class57.field1508;
            if (class128.field3074 == 2) {
                var17 = 1;
            }
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 502) {
                var16 = 502;
            }
            if (var18 < 0) {
                var18 = 0;
            } else if (var18 > 764) {
                var18 = 764;
            }
            int var19 = var16 * 765 + var18;
            class92.field2333.method702(true, 114);
            if (var14 > 4095L) {
                var14 = 4095L;
            }
            int var20 = (int) var14;
            class92.field2333.method983((byte) -126, (var17 << 19) + (var20 << 20) + var19);
        }
        if (class13.field239 > 0) {
            class13.field239--;
        }
        if (class13.field257[96] || class13.field257[97] || class13.field257[98] || class13.field257[99]) {
            class84.field2157 = true;
        }
        if (class84.field2157 && class13.field239 <= 0) {
            class84.field2157 = false;
            class13.field239 = 20;
            class28.field659++;
            class92.field2333.method702(true, 121);
            class92.field2333.method1011(class116.field2849, false);
            class92.field2333.method1011(class85.field2176, false);
        }
        if (class74.field1889 && !class95.field2411) {
            class95.field2411 = true;
            class92.field2333.method702(true, 174);
            class94.field2378++;
            class92.field2333.method993(19579, 1);
        }
        if (!class74.field1889 && class95.field2411) {
            class94.field2378++;
            class95.field2411 = false;
            class92.field2333.method702(true, 174);
            class92.field2333.method993(19579, 0);
        }
        class81.method672(0);
        if (class69.field1709 != 30 && class69.field1709 != 35) {
            return;
        }
        class71.method605((byte) -113);
        class13.method90((byte) -62);
        class116.field2793++;
        if (class116.field2793 > 750) {
            class117.method901((byte) 125);
            return;
        }
        client.method130(1);
        class18.method122(0);
        class80.method665(0);
        if (class71.field1742 != 0) {
            class111.field2768 += 20;
            if (class111.field2768 >= 400) {
                class71.field1742 = 0;
            }
        }
        class44.field1124++;
        if (class102.field2592 != 0) {
            class122.field2981++;
            if (class122.field2981 >= 15) {
                if (class102.field2592 == 3) {
                    class16.field306 = true;
                }
                if (class102.field2592 == 2) {
                    class88.field2251 = true;
                }
                class102.field2592 = 0;
            }
        }
        if (class34.field843 != 0) {
            client.field374++;
            if (class105.field2687 + 5 < class100.field2519 || class105.field2687 - 5 > class100.field2519 || class89.field2287 + 5 < class110.field2749 || class89.field2287 - 5 > class110.field2749) {
                class77.field1931 = true;
            }
            if (class121.field2960 == 0) {
                if (class34.field843 == 2) {
                    class88.field2251 = true;
                }
                if (class34.field843 == 3) {
                    class16.field306 = true;
                }
                class34.field843 = 0;
                if (class77.field1931 && client.field374 >= 5) {
                    class63.field1594 = -1;
                    class44.method404(10);
                    if (class63.field1594 == class61.field1533 && class5.field121 != class107.field2719) {
                        class120.field2941++;
                        class72 var21 = class90.method727(class61.field1533, -160);
                        byte var22 = 0;
                        if (class27.field608 == 1 && var21.field1800 == 206) {
                            var22 = 1;
                        }
                        if (var21.field1804[class107.field2719] <= 0) {
                            var22 = 0;
                        }
                        if (var21.field1756) {
                            int var23 = class5.field121;
                            int var24 = class107.field2719;
                            var21.field1804[var24] = var21.field1804[var23];
                            var21.field1824[var24] = var21.field1824[var23];
                            var21.field1804[var23] = -1;
                            var21.field1824[var23] = 0;
                        } else if (var22 == 1) {
                            int var25 = class107.field2719;
                            int var26 = class5.field121;
                            while (var25 != var26) {
                                if (var25 < var26) {
                                    var21.method614(var26 - 1, -1, var26);
                                    var26--;
                                } else if (var26 < var25) {
                                    var21.method614(var26 + 1, -1, var26);
                                    var26++;
                                }
                            }
                        } else {
                            var21.method614(class107.field2719, -1, class5.field121);
                        }
                        class92.field2333.method702(true, 182);
                        class92.field2333.method987(class61.field1533, -89);
                        class92.field2333.method1021(class5.field121, 128);
                        class92.field2333.method1017(-95, class107.field2719);
                        class92.field2333.method993(19579, var22);
                    }
                } else if ((class100.field2544 == 1 || class100.method791(class71.field1744 - 1, false)) && class71.field1744 > 2) {
                    class5.method38(-335);
                } else if (class71.field1744 > 0) {
                    class78.method648(class71.field1744 - 1, true);
                }
                class128.field3074 = 0;
                class122.field2981 = 10;
            }
        }
        if (class29.field673 != -1) {
            int var27 = class29.field673;
            int var28 = class29.field696;
            boolean var29 = class18.method123(true, (byte) 96, 0, 0, var28, 0, class72.field1820.field1350[0], var27, 0, class72.field1820.field1355[0], 0, 0);
            class29.field673 = -1;
            if (var29) {
                class33.field792 = class57.field1508;
                class71.field1742 = 1;
                class111.field2768 = 0;
                class61.field1550 = class40.field902;
            }
        }
        if (class128.field3074 == 1 && class131.field3146 != null) {
            class16.field306 = true;
            class128.field3074 = 0;
            class131.field3146 = null;
        }
        class78.method649(0);
        if (class64.field1632 == -1) {
            class69.method593((byte) 57);
            class120.method928(-103);
            class116.method891(false);
        }
        if (class121.field2960 == 1 || class128.field3074 == 1) {
            class21.field432++;
        }
        if (class5.field116 == -1 && class131.field3193 == -1 && class90.field2304 == -1) {
            if (class13.field259 > 0) {
                class13.field259--;
            }
        } else if (class46.field1149 > class13.field259) {
            class13.field259++;
            if (class46.field1149 == class13.field259) {
                if (class131.field3193 != -1) {
                    class88.field2251 = true;
                }
                if (class5.field116 != -1) {
                    class16.field306 = true;
                }
            }
        }
        class103.method814(30);
        if (class33.field802) {
            class40.method348(0);
        }
        for (int var30 = 0; var30 < 5; var30++) {
            int var10002 = class90.field2311[var30]++;
        }
        class44.method409(-121);
        int var31 = class100.method797(127);
        int var32 = class33.method319(-14621);
        if (var31 > 4500 && var32 > 4500) {
            class63.field1593++;
            class125.field3027 = 250;
            class94.method750(4000, 0);
            class92.field2333.method702(true, 195);
        }
        class71.field1750++;
        class67.field1683++;
        if (class67.field1683 > 500) {
            class67.field1683 = 0;
            int var33 = (int) (Math.random() * 8.0D);
            if ((var33 & 0x1) == 1) {
                class15.field282 += class19.field418;
            }
            if ((var33 & 0x4) == 4) {
                class81.field2065 += class66.field1671;
            }
            if ((var33 & 0x2) == 2) {
                class129.field3105 += class74.field1882;
            }
        }
        class109.field2730++;
        if (class109.field2730 > 500) {
            class109.field2730 = 0;
            int var34 = (int) (Math.random() * 8.0D);
            if ((var34 & 0x1) == 1) {
                class52.field1284 += class97.field2465;
            }
            if ((var34 & 0x2) == 2) {
                class4.field94 += class79.field1984;
            }
        }
        if (class52.field1284 < -60) {
            class97.field2465 = 2;
        }
        if (class52.field1284 > 60) {
            class97.field2465 = -2;
        }
        if (class4.field94 < -20) {
            class79.field1984 = 1;
        }
        if (class129.field3105 < -55) {
            class74.field1882 = 2;
        }
        if (class81.field2065 < -40) {
            class66.field1671 = 1;
        }
        if (class4.field94 > 10) {
            class79.field1984 = -1;
        }
        if (class15.field282 < -50) {
            class19.field418 = 2;
        }
        if (class15.field282 > 50) {
            class19.field418 = -2;
        }
        if (class81.field2065 > 40) {
            class66.field1671 = -1;
        }
        if (class129.field3105 > 55) {
            class74.field1882 = -2;
        }
        if (class71.field1750 > 50) {
            class92.field2333.method702(true, 202);
            class9.field173++;
        }
        try {
            if (class107.field2711 != null && class92.field2333.field3182 > 0) {
                class107.field2711.method323(0, (byte) 121, class92.field2333.field3182, class92.field2333.field3172);
                class92.field2333.field3182 = 0;
                class71.field1750 = 0;
            }
        } catch (IOException var35) {
            class117.method901((byte) -90);
        }
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(B)V", line = 1061)
    public static final synchronized void method10(byte arg0) {
        if (arg0 <= 5) {
            method5((byte) -16);
        }
        field10++;
        if (class127.method950(-29360)) {
            class67.method590(0);
            class11.field219 = null;
            class117.field2859 = false;
        }
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "(I)V", line = 1079)
    public static final synchronized void method11(int arg0) {
        class97.method767(57);
        int var1 = 13 % ((6 - arg0) / 46);
        field23++;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ltd;I)V", line = 1089)
    public static final void method12(class116 arg0, int arg1) {
        class19.field421 = arg0;
        field21++;
        if (arg1 != Integer.MIN_VALUE) {
            field27 = null;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ILtd;BIZIII)V", line = 1135)
    public static final synchronized void method13(int arg0, class116 arg1, byte arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        field6++;
        if (!class127.method950(arg2 - 29256)) {
            return;
        }
        class18.field356 = arg6;
        class131.field3191 = arg0;
        if (arg2 != -104) {
            return;
        }
        class11.field219 = arg1;
        class120.field2927 = arg3;
        class15.field285 = -1;
        class85.field2163 = arg4;
        class92.field2340 = arg5;
        class117.field2859 = true;
        class77.field1926 = arg7;
    }
}
