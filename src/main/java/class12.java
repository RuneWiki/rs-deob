import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class12 implements Runnable {

    @OriginalMember(owner = "client!be", name = "r", descriptor = "Z")
    public boolean field208 = true;

    @OriginalMember(owner = "client!be", name = "i", descriptor = "Ljava/lang/Object;")
    public Object field199 = new Object();

    @OriginalMember(owner = "client!be", name = "u", descriptor = "I")
    public int field211 = 0;

    @OriginalMember(owner = "client!be", name = "v", descriptor = "[I")
    public int[] field212 = new int[500];

    @OriginalMember(owner = "client!be", name = "w", descriptor = "[I")
    public int[] field213 = new int[500];

    @OriginalMember(owner = "client!be", name = "g", descriptor = "I")
    public static int field197 = 0;

    @OriginalMember(owner = "client!be", name = "n", descriptor = "I")
    public static int field204 = 0;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "[I")
    public static int[] field193 = new int[256];

    @OriginalMember(owner = "client!be", name = "m", descriptor = "I")
    public static int field203 = 0;

    @OriginalMember(owner = "client!be", name = "o", descriptor = "[B")
    public static byte[] field205 = new byte[520];

    @OriginalMember(owner = "client!be", name = "k", descriptor = "[I")
    public static int[] field201 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

    @OriginalMember(owner = "client!be", name = "q", descriptor = "Lec;")
    public static class28 field207 = class28.method210(-46, "Import complete");

    @OriginalMember(owner = "client!be", name = "t", descriptor = "[J")
    public static long[] field210 = new long[32];

    @OriginalMember(owner = "client!be", name = "a", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "client!be", name = "b", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "client!be", name = "e", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!be", name = "f", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "client!be", name = "h", descriptor = "I")
    public static int field198;

    @OriginalMember(owner = "client!be", name = "j", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!be", name = "l", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!be", name = "p", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!be", name = "s", descriptor = "I")
    public static int field209;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "Lcc;")
    public static class16 field194;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lke;B)V")
    public static final void method60(class65 arg0, byte arg1) {
        if (arg1 > -39) {
            method63(-13);
        }
        field206++;
        if (arg0.field1469 == 0) {
            return;
        }
        if (arg0.field1463 != -1 && arg0.field1463 < 32768) {
            class90 var2 = class88.field1956[arg0.field1463];
            if (var2 != null) {
                int var3 = arg0.field1446 - var2.field1446;
                int var4 = arg0.field1501 - var2.field1501;
                if (var3 != 0 || var4 != 0) {
                    arg0.field1471 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field1463 >= 32768) {
            int var5 = arg0.field1463 - 32768;
            if (class32.field674 == var5) {
                var5 = 2047;
            }
            class43 var6 = class129.field2779[var5];
            if (var6 != null) {
                int var7 = arg0.field1446 - var6.field1446;
                int var8 = arg0.field1501 - var6.field1501;
                if (var7 != 0 || var8 != 0) {
                    arg0.field1471 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field1443 != 0 || arg0.field1477 != 0) && (arg0.field1484 == 0 || arg0.field1438 > 0)) {
            int var9 = arg0.field1446 - (arg0.field1443 - class18.field366 - class18.field366) * 64;
            int var10 = arg0.field1501 - (arg0.field1477 - class87.field1934 - class87.field1934) * 64;
            if (var9 != 0 || var10 != 0) {
                arg0.field1471 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
            }
            arg0.field1477 = 0;
            arg0.field1443 = 0;
        }
        int var11 = arg0.field1471 - arg0.field1492 & 0x7FF;
        if (var11 == 0) {
            return;
        }
        if (arg0.field1469 > var11 || var11 > 2048 - arg0.field1469) {
            arg0.field1492 = arg0.field1471;
        } else if (var11 > 1024) {
            arg0.field1492 -= arg0.field1469;
        } else {
            arg0.field1492 += arg0.field1469;
        }
        arg0.field1492 &= 0x7FF;
        if (arg0.field1470 != arg0.field1451 || arg0.field1492 == arg0.field1471) {
            return;
        }
        if (arg0.field1447 == -1) {
            arg0.field1470 = arg0.field1449;
            return;
        }
        arg0.field1470 = arg0.field1447;
        return;
    }

    @OriginalMember(owner = "client!be", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field208) {
            Object var1 = this.field199;
            synchronized (this.field199) {
                if (this.field211 < 500) {
                    this.field213[this.field211] = class23.field530;
                    this.field212[this.field211] = class88.field1960;
                    this.field211++;
                }
            }
            class31.method247(50L, (byte) 123);
        }
        field202++;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lvb;ILvb;)V")
    public static final void method61(class122 arg0, int arg1, class122 arg2) {
        class68.field1529 = arg0;
        field192++;
        if (arg1 != 918) {
            method63(71);
        }
        client.field404 = arg2;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ZIII[B)V")
    public static final void method62(boolean arg0, int arg1, int arg2, int arg3, byte[] arg4) {
        if (arg1 != 22391) {
            field197 = 25;
        }
        if (class5.field82 >= 0) {
            class32.field690 = arg2;
            if (class5.field82 == 0) {
                class32.field689 = 1;
            } else {
                int var5 = class127.method969(class5.field82, arg1 ^ 0x570F);
                int var6 = var5 - class18.field360;
                class32.field689 = (var6 + 3600) / arg2;
                if (class32.field689 < 1) {
                    class32.field689 = 1;
                }
            }
            class87.field1939 = arg3;
            class37.field830 = arg4;
            class21.field485 = arg0;
        } else if (class32.field689 == 0) {
            class77.method587(arg4, 126, arg3, arg0);
        } else {
            class21.field485 = arg0;
            class87.field1939 = arg3;
            class37.field830 = arg4;
        }
        field191++;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V")
    public static final void method63(int arg0) {
        class18.field361.method659(1000);
        field200++;
        if (arg0 != 1) {
            method60(null, (byte) 61);
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Z)V")
    public static void method64(boolean arg0) {
        field210 = null;
        field194 = null;
        field201 = null;
        if (arg0) {
            field201 = null;
        }
        field205 = null;
        field193 = null;
        field207 = null;
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(I)V")
    public static final void method65(int arg0) {
        field198++;
        class36.field820 = true;
        class110.method757(false);
        if (class114.field2439) {
            class126.field2737.method435(class125.field2718, 239, 40, 0);
            class126.field2737.method435(class68.method537(1, new class28[] { class125.field2708, class7.field116 }), 239, 60, 128);
        } else if (class23.field515 == 1) {
            class126.field2737.method435(class75.field1686, 239, 40, 0);
            class126.field2737.method435(class68.method537(1, new class28[] { class125.field2714, class7.field116 }), 239, 60, 128);
        } else if (class23.field515 == 2) {
            class126.field2737.method435(class30.field642, 239, 40, 0);
            class126.field2737.method435(class68.method537(1, new class28[] { class125.field2714, class7.field116 }), 239, 60, 128);
        } else if (class23.field515 == 3) {
            if (class125.field2714 != class125.field2713) {
                class17.method95((byte) -48, class125.field2714);
                class125.field2713 = class125.field2714;
            }
            class54 var1 = class124.field2697;
            class120.method918(0, 0, 463, 77);
            for (int var2 = 0; var2 < class21.field455; var2++) {
                int var3 = var2 * 14 + 18 - class64.field1427;
                if (var3 > 0 && var3 < 110) {
                    var1.method435(class105.field2221[var2], 239, var3, 0);
                }
            }
            class120.method908();
            if (class21.field455 > 5) {
                class86.method640((byte) -96, class64.field1427, 463, class21.field455 * 14 + 7, 0, 77);
            }
            if (class125.field2714.method214(-6) == 0) {
                class126.field2737.method435(class7.field122, 239, 40, 255);
            } else if (class21.field455 == 0) {
                class126.field2737.method435(class2.field22, 239, 40, 0);
            }
            var1.method435(class68.method537(1, new class28[] { class125.field2714, class7.field116 }), 239, 90, 0);
            class120.method909(0, 77, 479, 0);
        } else if (class64.field1416 != null) {
            class126.field2737.method435(class64.field1416, 239, 40, 0);
            class126.field2737.method435(class72.field1601, 239, 60, 128);
        } else if (class110.field2325 != -1) {
            boolean var4 = class18.method111(0, arg0 ^ 0xFFFFFFBF, class110.field2325, 0, 0, 96, 479, 2, -1);
            if (!var4) {
                class95.field2092 = true;
            }
        } else if (class1.field13 == -1) {
            class54 var6 = class124.field2697;
            class120.method918(0, 0, 463, 77);
            int var7 = 0;
            for (int var8 = 0; var8 < 100; var8++) {
                if (class117.field2500[var8] != null) {
                    int var10 = class21.field476 + 70 - var7 * 14;
                    class28 var11 = class125.field2705[var8];
                    int var12 = class22.field501[var8];
                    byte var13 = 0;
                    if (var11 != null && var11.method208(class88.field1961, false)) {
                        var11 = var11.method218(5, false);
                        var13 = 1;
                    }
                    if (var11 != null && var11.method208(class63.field1394, false)) {
                        var13 = 2;
                        var11 = var11.method218(5, false);
                    }
                    if (var12 == 0) {
                        var7++;
                        if (var10 > 0 && var10 < 110) {
                            var6.method449(class117.field2500[var8], 4, var10, 0);
                        }
                    }
                    if ((var12 == 1 || var12 == 2) && (var12 == 1 || class16.field317 == 0 || class16.field317 == 1 && class27.method200((byte) 25, var11))) {
                        if (var10 > 0 && var10 < 110) {
                            int var14 = 4;
                            if (var13 == 1) {
                                class20.field439[0].method977(var14, var10 - 12);
                                var14 += 14;
                            }
                            if (var13 == 2) {
                                class20.field439[1].method977(var14, var10 - 12);
                                var14 += 14;
                            }
                            var6.method449(class68.method537(1, new class28[] { var11, class98.field2163 }), var14, var10, 0);
                            int var15 = var14 + var6.method437(var11) + 8;
                            var6.method449(class117.field2500[var8], var15, var10, 255);
                        }
                        var7++;
                    }
                    if ((var12 == 3 || var12 == 7) && class80.field1847 == 0 && (var12 == 7 || class126.field2735 == 0 || class126.field2735 == 1 && class27.method200((byte) 25, var11))) {
                        if (var10 > 0 && var10 < 110) {
                            byte var16 = 4;
                            var6.method449(class95.field2107, var16, var10, 0);
                            int var17 = var16 + var6.method437(class125.field2704);
                            if (var13 == 1) {
                                class20.field439[0].method977(var17, var10 - 12);
                                var17 += 14;
                            }
                            if (var13 == 2) {
                                class20.field439[1].method977(var17, var10 - 12);
                                var17 += 14;
                            }
                            var6.method449(class68.method537(1, new class28[] { var11, class98.field2163 }), var17, var10, 0);
                            int var18 = var17 + var6.method437(var11) + 8;
                            var6.method449(class117.field2500[var8], var18, var10, 8388608);
                        }
                        var7++;
                    }
                    if (var12 == 4 && (class112.field2418 == 0 || class112.field2418 == 1 && class27.method200((byte) 25, var11))) {
                        var7++;
                        if (var10 > 0 && var10 < 110) {
                            var6.method449(class68.method537(1, new class28[] { var11, class62.field1380, class117.field2500[var8] }), 4, var10, 8388736);
                        }
                    }
                    if (var12 == 5 && class80.field1847 == 0 && class126.field2735 < 2) {
                        if (var10 > 0 && var10 < 110) {
                            var6.method449(class117.field2500[var8], 4, var10, 8388608);
                        }
                        var7++;
                    }
                    if (var12 == 6 && class80.field1847 == 0 && class126.field2735 < 2) {
                        var7++;
                        if (var10 > 0 && var10 < 110) {
                            var6.method449(class68.method537(arg0 ^ 0x41, new class28[] { class45.field998, var11, class98.field2163 }), 4, var10, 0);
                            var6.method449(class117.field2500[var8], var6.method437(class68.method537(1, new class28[] { class45.field998, var11 })) + 12, var10, 8388608);
                        }
                    }
                    if (var12 == 8 && (class112.field2418 == 0 || class112.field2418 == 1 && class27.method200((byte) 25, var11))) {
                        var7++;
                        if (var10 > 0 && var10 < 110) {
                            var6.method449(class68.method537(1, new class28[] { var11, class62.field1380, class117.field2500[var8] }), 4, var10, 8270336);
                        }
                    }
                }
            }
            class120.method908();
            class69.field1551 = var7 * 14 + 7;
            if (class69.field1551 < 78) {
                class69.field1551 = 78;
            }
            class86.method640((byte) -105, class69.field1551 - class21.field476 - 77, 463, class69.field1551, 0, 77);
            class28 var9;
            if (class37.field848 == null || class37.field848.field919 == null) {
                var9 = class21.field459;
            } else {
                var9 = class37.field848.field919;
            }
            var6.method449(class68.method537(1, new class28[] { var9, class98.field2163 }), 4, 90, 0);
            var6.method449(class68.method537(1, new class28[] { class125.field2711, class7.field116 }), var6.method437(class68.method537(1, new class28[] { var9, class2.field17 })) + 6, 90, 255);
            class120.method909(0, 77, 479, 0);
        } else {
            boolean var5 = class18.method111(0, -1, class1.field13, 0, 0, 96, 479, 3, -1);
            if (!var5) {
                class95.field2092 = true;
            }
        }
        if (class13.field243 && class75.field1671 == 2) {
            class105.method729(false);
        }
        class43.method341(class117.field2493, 0);
        if (arg0 != 64) {
            field194 = null;
        }
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(Z)V")
    public static final void method66(boolean arg0) {
        class56.method456(arg0, 4370);
        field209++;
        boolean var1 = true;
        class14.field255 = 0;
        for (int var2 = 0; var2 < class68.field1534.length; var2++) {
            if (class27.field573[var2] != -1 && class68.field1534[var2] == null) {
                class68.field1534[var2] = class7.field101.method932(0, 0, class27.field573[var2]);
                if (class68.field1534[var2] == null) {
                    var1 = false;
                    class14.field255++;
                }
            }
            if (class109.field2303[var2] != -1 && class3.field52[var2] == null) {
                class3.field52[var2] = class7.field101.method943(0, -26048, class103.field2195[var2], class109.field2303[var2]);
                if (class3.field52[var2] == null) {
                    class14.field255++;
                    var1 = false;
                }
            }
        }
        if (!var1) {
            class56.field1296 = 1;
            return;
        }
        class88.field1958 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class68.field1534.length; var4++) {
            byte[] var56 = class3.field52[var4];
            if (var56 != null) {
                int var57 = (class109.field2272[var4] >> 8) * 64 - class18.field366;
                int var58 = (class109.field2272[var4] & 0xFF) * 64 - class87.field1934;
                if (class63.field1406) {
                    var57 = 10;
                    var58 = 10;
                }
                var3 &= class34.method288(var57, 0, var56, var58);
            }
        }
        if (!var3) {
            class56.field1296 = 2;
            return;
        }
        if (class56.field1296 != 0) {
            class124.method958((byte) 62, class8.field149, class18.field370, true);
        }
        class36.method299((byte) 118);
        class11.field179.method768();
        System.gc();
        for (int var5 = 0; var5 < 4; var5++) {
            class43.field922[var5].method835(-67);
        }
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var54 = 0; var54 < 104; var54++) {
                for (int var55 = 0; var55 < 104; var55++) {
                    class47.field1080[var6][var54][var55] = 0;
                }
            }
        }
        class8.method41(111);
        int var7 = class68.field1534.length;
        class56.method456(true, 4370);
        if (!class63.field1406) {
            for (int var8 = 0; var8 < var7; var8++) {
                int var17 = (class109.field2272[var8] >> 8) * 64 - class18.field366;
                byte[] var18 = class68.field1534[var8];
                int var19 = (class109.field2272[var8] & 0xFF) * 64 - class87.field1934;
                if (var18 != null) {
                    class25.method176(var18, class43.field922, (class90.field1994 - 6) * 8, (class92.field2039 - 6) * 8, 0, var19, var17);
                }
            }
            for (int var9 = 0; var9 < var7; var9++) {
                int var14 = (class109.field2272[var9] >> 8) * 64 - class18.field366;
                int var15 = (class109.field2272[var9] & 0xFF) * 64 - class87.field1934;
                byte[] var16 = class68.field1534[var9];
                if (var16 == null && class92.field2039 < 800) {
                    class92.method668(var14, 64, var15, 117, 64);
                }
            }
            class56.method456(true, 4370);
            for (int var10 = 0; var10 < var7; var10++) {
                byte[] var11 = class3.field52[var10];
                if (var11 != null) {
                    int var12 = (class109.field2272[var10] >> 8) * 64 - class18.field366;
                    int var13 = (class109.field2272[var10] & 0xFF) * 64 - class87.field1934;
                    class109.method749(var12, class43.field922, var13, 124, var11, class11.field179);
                }
            }
        }
        if (class63.field1406) {
            for (int var20 = 0; var20 < 4; var20++) {
                for (int var34 = 0; var34 < 13; var34++) {
                    for (int var35 = 0; var35 < 13; var35++) {
                        int var36 = class45.field1006[var20][var34][var35];
                        boolean var37 = false;
                        if (var36 != -1) {
                            int var38 = var36 >> 24 & 0x3;
                            int var39 = var36 >> 14 & 0x3FF;
                            int var40 = var36 >> 3 & 0x7FF;
                            int var41 = var36 >> 1 & 0x3;
                            int var42 = (var39 / 8 << 8) + (var40 / 8);
                            for (int var43 = 0; var43 < class109.field2272.length; var43++) {
                                if (class109.field2272[var43] == var42 && class68.field1534[var43] != null) {
                                    var37 = true;
                                    class51.method410(class43.field922, var38, var41, class68.field1534[var43], var20, var34 * 8, false, (var39 & 0x7) * 8, var35 * 8, (var40 & 0x7) * 8);
                                    break;
                                }
                            }
                        }
                        if (!var37) {
                            class25.method179(var35 * 8, var34 * 8, 117, var20);
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < 13; var21++) {
                for (int var32 = 0; var32 < 13; var32++) {
                    int var33 = class45.field1006[0][var21][var32];
                    if (var33 == -1) {
                        class92.method668(var21 * 8, 8, var32 * 8, 109, 8);
                    }
                }
            }
            class56.method456(true, 4370);
            for (int var22 = 0; var22 < 4; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    for (int var24 = 0; var24 < 13; var24++) {
                        int var25 = class45.field1006[var22][var23][var24];
                        if (var25 != -1) {
                            int var26 = var25 >> 24 & 0x3;
                            int var27 = var25 >> 14 & 0x3FF;
                            int var28 = var25 >> 3 & 0x7FF;
                            int var29 = var25 >> 1 & 0x3;
                            int var30 = (var27 / 8 << 8) + var28 / 8;
                            for (int var31 = 0; var31 < class109.field2272.length; var31++) {
                                if (class109.field2272[var31] == var30 && class3.field52[var31] != null) {
                                    class42.method334(var22, var26, class3.field52[var31], var29, (var28 & 0x7) * 8, var24 * 8, (var27 & 0x7) * 8, class11.field179, var23 * 8, (byte) -79, class43.field922);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        class56.method456(true, 4370);
        class36.method299((byte) 118);
        class21.method146(class11.field179, -7261, class43.field922);
        class56.method456(true, 4370);
        int var44 = class32.field681;
        if (var44 > class122.field2657) {
            var44 = class122.field2657;
        }
        if (var44 < class122.field2657 - 1) {
            int var45 = class122.field2657 - 1;
        }
        if (class72.field1591) {
            class11.field179.method793(class32.field681);
        } else {
            class11.field179.method793(0);
        }
        for (int var46 = 0; var46 < 104; var46++) {
            for (int var53 = 0; var53 < 104; var53++) {
                class20.method137((byte) -121, var46, var53);
            }
        }
        class31.method248(-93);
        class74.field1643.method659(1000);
        if (class126.field2727 != null) {
            class122.field2622++;
            class5.field85.method161((byte) 106, 153);
            class5.field85.method898(1057001181, -1202576);
        }
        if (!class63.field1406) {
            int var47 = (class90.field1994 - 6) / 8;
            int var48 = (class92.field2039 - 6) / 8;
            int var49 = (class90.field1994 + 6) / 8;
            int var50 = (class92.field2039 + 6) / 8;
            for (int var51 = var47 - 1; var51 <= var49 + 1; var51++) {
                for (int var52 = var48 - 1; var52 <= var50 + 1; var52++) {
                    if (var47 > var51 || var49 < var51 || var48 > var52 || var50 < var52) {
                        class7.field101.method927(class68.method537(1, new class28[] { class11.field183, class5.method25(6366, var51), class126.field2736, class5.method25(6366, var52) }), (byte) 86);
                        class7.field101.method927(class68.method537(1, new class28[] { class56.field1298, class5.method25(6366, var51), class126.field2736, class5.method25(6366, var52) }), (byte) 126);
                    }
                }
            }
        }
        if (class37.field854 == -1) {
            class74.method574(0, 30);
        } else {
            class74.method574(0, 35);
        }
        class47.method380(0);
        class5.field85.method161((byte) 92, 91);
        class11.method59(0);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IZ)Lic;")
    public static final class51 method67(int arg0, boolean arg1) {
        if (arg1) {
            field193 = null;
        }
        class51 var2 = (class51) class37.field856.method660(-2, (long) arg0);
        field195++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class21.field480.method932(-97, arg0, 14);
        class51 var4 = new class51();
        if (var3 != null) {
            var4.method411(new class119(var3), (byte) -116);
        }
        class37.field856.method666(false, var4, (long) arg0);
        return var4;
    }
}
