import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class93 implements Runnable {

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "[[B")
    public static byte[][] field2164 = new byte[250][];

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "Lrc;")
    public static class105 field2165 = class43.method374("da dieser Computer gegen unsere ", 0);

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "[I")
    public static int[] field2166 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "Lrc;")
    public static class105 field2176 = class43.method374(" Sekunde(Xn(Y -Ubertragen)3", 0);

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "J")
    public static long field2170 = 0L;

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "J")
    public static long field2173 = 0L;

    @OriginalMember(owner = "client!pc", name = "q", descriptor = "Z")
    public static boolean field2178 = false;

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
    public static int field2172 = 2301979;

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "Lrc;")
    private static class105 field2169 = class43.method374("No response from server)3", 0);

    @OriginalMember(owner = "client!pc", name = "s", descriptor = "Lrc;")
    public static class105 field2180 = field2169;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
    public static int field2162;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
    public static int field2163;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "I")
    public static int field2174;

    @OriginalMember(owner = "client!pc", name = "p", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!pc", name = "r", descriptor = "I")
    public static int field2179;

    @OriginalMember(owner = "client!pc", name = "t", descriptor = "I")
    public static int field2181;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "Lb;")
    public static class7 field2167;

    @OriginalMember(owner = "client!pc", name = "n", descriptor = "Lb;")
    public static class7 field2175;

    @OriginalMember(owner = "client!pc", name = "run", descriptor = "()V", line = 3)
    public final void run() {
        field2174++;
        try {
            while (true) {
                class3 var1 = class109.field2507;
                class64 var2;
                synchronized (class109.field2507) {
                    var2 = (class64) class109.field2507.method31(1280);
                }
                if (var2 == null) {
                    class75.method634(100L, 20306);
                    Object var6 = class3.field36;
                    synchronized (class3.field36) {
                        if (class31.field698 <= 1) {
                            class31.field698 = 0;
                            class3.field36.notifyAll();
                            return;
                        }
                        class31.field698--;
                    }
                } else {
                    if (var2.field1425 == 0) {
                        var2.field1426.method454(var2.field1427.length, 125, var2.field1427, (int) var2.field1448);
                        class3 var4 = class109.field2507;
                        synchronized (class109.field2507) {
                            var2.method551(-110);
                        }
                    } else if (var2.field1425 == 1) {
                        var2.field1427 = var2.field1426.method455((byte) 66, (int) var2.field1448);
                        class3 var3 = class109.field2507;
                        synchronized (class109.field2507) {
                            class112.field2626.method23(1024, var2);
                        }
                    }
                    Object var5 = class3.field36;
                    synchronized (class3.field36) {
                        if (class31.field698 <= 1) {
                            class31.field698 = 0;
                            class3.field36.notifyAll();
                            return;
                        }
                        class31.field698 = 600;
                    }
                }
            }
        } catch (Exception var17) {
            class19.method225(0, null, var17);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lrc;Lpb;ILrc;)Lme;", line = 76)
    public static final class77 method771(class105 arg0, class92 arg1, int arg2, class105 arg3) {
        field2162++;
        if (arg2 == 1) {
            int var4 = arg1.method753(arg3, 3);
            int var5 = arg1.method765(var4, (byte) 97, arg0);
            return class28.method270(arg1, var4, 0, var5);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V", line = 91)
    public static final void method772(int arg0) {
        field2179++;
        while (class18.field389.method780(class80.field1794, arg0 + 97) >= 27) {
            int var1 = class18.field389.method785(205, 15);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class19.field466[var1] == null) {
                var2 = true;
                class19.field466[var1] = new class115();
            }
            class115 var3 = class19.field466[var1];
            class24.field578[class133.field3229++] = var1;
            var3.field1269 = class104.field2351;
            int var4 = class18.field389.method785(205, 1);
            if (var4 == 1) {
                class122.field3001[class76.field1701++] = var1;
            }
            int var5 = class18.field389.method785(205, 5);
            int var6 = class18.field389.method785(205, 1);
            int var7 = class23.field551[class18.field389.method785(arg0 ^ 0xCD, 3)];
            if (var2) {
                var3.field1226 = var7;
            }
            if (var5 > 15) {
                var5 -= 32;
            }
            int var8 = class18.field389.method785(205, 5);
            var3.field2681 = class12.method142(116, class18.field389.method785(205, 13));
            var3.field1265 = var3.field2681.field499;
            var3.field1290 = var3.field2681.field453;
            if (var8 > 15) {
                var8 -= 32;
            }
            var3.field1259 = var3.field2681.field468;
            var3.field1285 = var3.field2681.field487;
            var3.field1254 = var3.field2681.field478;
            var3.field1217 = var3.field2681.field470;
            var3.field1228 = var3.field2681.field472;
            if (var3.field1254 == 0) {
                var3.field1226 = 0;
            }
            var3.field1227 = var3.field2681.field461;
            var3.field1278 = var3.field2681.field494;
            var3.method469((byte) 57, class119.field2842.field1261[0] + var8, var6 == 1, class119.field2842.field1281[0] + var5);
        }
        if (arg0 != 0) {
            method775(91);
        }
        class18.field389.method789((byte) -34);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BIIIZIIIIIII)Z", line = 166)
    public static final boolean method773(byte arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field2163++;
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var36 = 0; var36 < 104; var36++) {
                class116.field2720[var12][var36] = 0;
                class88.field1991[var12][var36] = 99999999;
            }
        }
        class116.field2720[arg3][arg9] = 99;
        int var13 = arg3;
        class88.field1991[arg3][arg9] = 0;
        int var14 = 0;
        boolean var15 = false;
        byte var16 = 0;
        class71.field1562[var16] = arg3;
        int var17 = arg9;
        int var37 = var16 + 1;
        class43.field988[var16] = arg9;
        int var18 = class71.field1562.length;
        int[][] var19 = class116.field2717[class73.field1619].field2548;
        while (var14 != var37) {
            var13 = class71.field1562[var14];
            var17 = class43.field988[var14];
            var14 = (var14 + 1) % var18;
            if (arg11 == var13 && arg1 == var17) {
                var15 = true;
                break;
            }
            if (arg2 != 0) {
                if ((arg2 < 5 || arg2 == 10) && class116.field2717[class73.field1619].method893(arg2 - 1, var17, arg6, 130, arg11, var13, arg1)) {
                    var15 = true;
                    break;
                }
                if (arg2 < 10 && class116.field2717[class73.field1619].method905(arg6, arg1, var17, arg2 - 1, (byte) -87, arg11, var13)) {
                    var15 = true;
                    break;
                }
            }
            if (arg10 != 0 && arg7 != 0 && class116.field2717[class73.field1619].method901(arg7, arg5, -79, var17, arg1, arg10, var13, arg11)) {
                var15 = true;
                break;
            }
            int var35 = class88.field1991[var13][var17] + 1;
            if (var13 > 0 && class116.field2720[var13 - 1][var17] == 0 && (var19[var13 - 1][var17] & 0x1280108) == 0) {
                class71.field1562[var37] = var13 - 1;
                class43.field988[var37] = var17;
                var37 = (var37 + 1) % var18;
                class116.field2720[var13 - 1][var17] = 2;
                class88.field1991[var13 - 1][var17] = var35;
            }
            if (var13 < 103 && class116.field2720[var13 + 1][var17] == 0 && (var19[var13 + 1][var17] & 0x1280180) == 0) {
                class71.field1562[var37] = var13 + 1;
                class43.field988[var37] = var17;
                var37 = (var37 + 1) % var18;
                class116.field2720[var13 + 1][var17] = 8;
                class88.field1991[var13 + 1][var17] = var35;
            }
            if (var17 > 0 && class116.field2720[var13][var17 - 1] == 0 && (var19[var13][var17 - 1] & 0x1280102) == 0) {
                class71.field1562[var37] = var13;
                class43.field988[var37] = var17 - 1;
                var37 = (var37 + 1) % var18;
                class116.field2720[var13][var17 - 1] = 1;
                class88.field1991[var13][var17 - 1] = var35;
            }
            if (var17 < 103 && class116.field2720[var13][var17 + 1] == 0 && (var19[var13][var17 + 1] & 0x1280120) == 0) {
                class71.field1562[var37] = var13;
                class43.field988[var37] = var17 + 1;
                class116.field2720[var13][var17 + 1] = 4;
                var37 = (var37 + 1) % var18;
                class88.field1991[var13][var17 + 1] = var35;
            }
            if (var13 > 0 && var17 > 0 && class116.field2720[var13 - 1][var17 - 1] == 0 && (var19[var13 - 1][var17 - 1] & 0x128010E) == 0 && (var19[var13 - 1][var17] & 0x1280108) == 0 && (var19[var13][var17 - 1] & 0x1280102) == 0) {
                class71.field1562[var37] = var13 - 1;
                class43.field988[var37] = var17 - 1;
                class116.field2720[var13 - 1][var17 - 1] = 3;
                var37 = (var37 + 1) % var18;
                class88.field1991[var13 - 1][var17 - 1] = var35;
            }
            if (var13 < 103 && var17 > 0 && class116.field2720[var13 + 1][var17 - 1] == 0 && (var19[var13 + 1][var17 - 1] & 0x1280183) == 0 && (var19[var13 + 1][var17] & 0x1280180) == 0 && (var19[var13][var17 - 1] & 0x1280102) == 0) {
                class71.field1562[var37] = var13 + 1;
                class43.field988[var37] = var17 - 1;
                var37 = (var37 + 1) % var18;
                class116.field2720[var13 + 1][var17 - 1] = 9;
                class88.field1991[var13 + 1][var17 - 1] = var35;
            }
            if (var13 > 0 && var17 < 103 && class116.field2720[var13 - 1][var17 + 1] == 0 && (var19[var13 - 1][var17 + 1] & 0x1280138) == 0 && (var19[var13 - 1][var17] & 0x1280108) == 0 && (var19[var13][var17 + 1] & 0x1280120) == 0) {
                class71.field1562[var37] = var13 - 1;
                class43.field988[var37] = var17 + 1;
                class116.field2720[var13 - 1][var17 + 1] = 6;
                class88.field1991[var13 - 1][var17 + 1] = var35;
                var37 = (var37 + 1) % var18;
            }
            if (var13 < 103 && var17 < 103 && class116.field2720[var13 + 1][var17 + 1] == 0 && (var19[var13 + 1][var17 + 1] & 0x12801E0) == 0 && (var19[var13 + 1][var17] & 0x1280180) == 0 && (var19[var13][var17 + 1] & 0x1280120) == 0) {
                class71.field1562[var37] = var13 + 1;
                class43.field988[var37] = var17 + 1;
                var37 = (var37 + 1) % var18;
                class116.field2720[var13 + 1][var17 + 1] = 12;
                class88.field1991[var13 + 1][var17 + 1] = var35;
            }
        }
        class98.field2258 = 0;
        if (!var15) {
            if (!arg4) {
                return false;
            }
            int var20 = 1000;
            byte var21 = 10;
            int var22 = 100;
            for (int var23 = arg11 - var21; var23 <= arg11 + var21; var23++) {
                for (int var24 = arg1 - var21; var24 <= arg1 + var21; var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class88.field1991[var23][var24] < 100) {
                        int var25 = 0;
                        if (var23 < arg11) {
                            var25 = arg11 - var23;
                        } else if (var23 > arg10 + arg11 - 1) {
                            var25 = var23 + 1 - arg11 - arg10;
                        }
                        int var26 = 0;
                        if (arg1 > var24) {
                            var26 = arg1 - var24;
                        } else if (var24 > arg1 + arg7 - 1) {
                            var26 = var24 + 1 - arg7 - arg1;
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (var27 < var20 || var20 == var27 && class88.field1991[var23][var24] < var22) {
                            var22 = class88.field1991[var23][var24];
                            var13 = var23;
                            var17 = var24;
                            var20 = var27;
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return false;
            }
            if (arg3 == var13 && arg9 == var17) {
                return false;
            }
            class98.field2258 = 1;
        }
        byte var28 = 0;
        class71.field1562[var28] = var13;
        if (arg0 != 80) {
            method772(-29);
        }
        int var38 = var28 + 1;
        class43.field988[var28] = var17;
        int var29;
        int var30 = var29 = class116.field2720[var13][var17];
        while (arg3 != var13 || arg9 != var17) {
            if (var29 != var30) {
                class71.field1562[var38] = var13;
                var29 = var30;
                class43.field988[var38++] = var17;
            }
            if ((var30 & 0x2) != 0) {
                var13++;
            } else if ((var30 & 0x8) != 0) {
                var13--;
            }
            if ((var30 & 0x1) != 0) {
                var17++;
            } else if ((var30 & 0x4) != 0) {
                var17--;
            }
            var30 = class116.field2720[var13][var17];
        }
        if (var38 > 0) {
            int var31 = var38--;
            int var32 = class71.field1562[var38];
            int var33 = class43.field988[var38];
            if (var31 > 25) {
                var31 = 25;
            }
            if (arg8 == 0) {
                class17.field362++;
                class66.field1472.method781(157, (byte) -36);
                class66.field1472.method102((byte) 123, var31 + var31 + 3);
            }
            if (arg8 == 1) {
                class107.field2447++;
                class66.field1472.method781(158, (byte) -34);
                class66.field1472.method102((byte) 123, var31 + var31 + 17);
            }
            if (arg8 == 2) {
                class66.field1472.method781(217, (byte) -67);
                class66.field1472.method102((byte) 123, var31 + var31 + 3);
                class95.field2186++;
            }
            class12.field243 = class71.field1562[0];
            class55.field1103 = class43.field988[0];
            for (int var34 = 1; var34 < var31; var34++) {
                var38--;
                class66.field1472.method70(class71.field1562[var38] - var32, (byte) -99);
                class66.field1472.method60(class43.field988[var38] - var33, -22);
            }
            class66.field1472.method77(class55.field1111[82] ? 1 : 0, 80);
            class66.field1472.method68(class23.field562 + var32, (byte) 31);
            class66.field1472.method111(class107.field2466 + var33, -27867);
            return true;
        } else if (arg8 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)V", line = 510)
    public static final void method774(int arg0) {
        field2177++;
        if (class24.field576 != null) {
            class24.field576.method1037(arg0 + 16);
            class24.field576 = null;
        }
        class61.method484(false);
        class130.field3161.method536();
        for (int var1 = 0; var1 < 4; var1++) {
            class116.field2717[var1].method899(-2);
        }
        System.gc();
        class96.method802((byte) 70, 10);
        class9.field174 = -1;
        class60.field1336 = 0;
        if (arg0 != -16) {
            field2164 = null;
        }
        class75.method632(arg0 + 121);
        class136.method1069((byte) 45, 10);
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(I)V", line = 551)
    public static void method775(int arg0) {
        field2167 = null;
        field2169 = null;
        field2164 = null;
        if (arg0 >= -44) {
            return;
        }
        field2180 = null;
        field2176 = null;
        field2165 = null;
        field2166 = null;
        field2175 = null;
    }

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "(I)V", line = 599)
    public static final void method776(int arg0) {
        field2168++;
        int var1 = class119.field2842.field1274 + class113.field2656;
        int var2 = class45.field1022 + class119.field2842.field1229;
        if (class83.field1870 - var2 < -500 || class83.field1870 - var2 > 500 || class117.field2728 - var1 < -500 || class117.field2728 - var1 > 500) {
            class83.field1870 = var2;
            class117.field2728 = var1;
        }
        if (class83.field1870 != var2) {
            class83.field1870 += (var2 - class83.field1870) / 16;
        }
        if (class117.field2728 != var1) {
            class117.field2728 += (var1 - class117.field2728) / 16;
        }
        if (class55.field1111[96]) {
            class105.field2380 += (-class105.field2380 - 24) / 2;
        } else if (class55.field1111[97]) {
            class105.field2380 += (24 - class105.field2380) / 2;
        } else {
            class105.field2380 /= 2;
        }
        int var3 = class117.field2728 >> 7;
        if (class55.field1111[98]) {
            class87.field1975 += (12 - class87.field1975) / 2;
        } else if (class55.field1111[99]) {
            class87.field1975 += (-class87.field1975 - 12) / 2;
        } else {
            class87.field1975 /= 2;
        }
        class34.field806 += class87.field1975 / 2;
        if (class34.field806 < 128) {
            class34.field806 = 128;
        }
        if (class34.field806 > 383) {
            class34.field806 = 383;
        }
        client.field432 = class105.field2380 / 2 + client.field432 & 0x7FF;
        int var4 = 0;
        int var5 = class83.field1870 >> 7;
        int var6 = class134.method1061(11387, class73.field1619, class83.field1870, class117.field2728);
        if (arg0 <= 53) {
            return;
        }
        if (var5 > 3 && var3 > 3 && var5 < 100 && var3 < 100) {
            for (int var7 = var5 - 4; var7 <= var5 + 4; var7++) {
                for (int var8 = var3 - 4; var8 <= var3 + 4; var8++) {
                    int var9 = class73.field1619;
                    if (var9 < 3 && (class57.field1185[1][var7][var8] & 0x2) == 2) {
                        var9++;
                    }
                    int var10 = var6 - class9.field151[var9][var7][var8];
                    if (var4 < var10) {
                        var4 = var10;
                    }
                }
            }
        }
        int var11 = var4 * 192;
        if (var11 > 98048) {
            var11 = 98048;
        }
        if (var11 < 32768) {
            var11 = 32768;
        }
        if (class71.field1567 < var11) {
            class71.field1567 += (var11 - class71.field1567) / 24;
        } else if (var11 < class71.field1567) {
            class71.field1567 += (var11 - class71.field1567) / 80;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V", line = 713)
    public static final void method777(byte arg0) {
        if (arg0 != -28) {
            return;
        }
        field2181++;
        class107.method873(-10513);
        if (class78.field1761 != 10) {
            return;
        }
        int var1 = class86.field1937 - 202;
        int var2 = class104.field2371;
        int var3 = class30.field683 - 171;
        if (class9.field173 == 0) {
            byte var4 = 100;
            byte var5 = 120;
            if (var2 == 1 && var4 - 75 <= var1 && var4 + 75 >= var1 && var5 - 20 <= var3 && var5 + 20 >= var3) {
                class9.field173 = 3;
                class127.field3085 = 0;
            }
            short var6 = 260;
            if (var2 == 1 && var1 >= var6 - 75 && var1 <= var6 + 75 && var3 >= var5 - 20 && var5 + 20 >= var3) {
                class37.field849 = class111.field2563;
                class37.field863 = class111.field2567;
                class127.field3085 = 0;
                class9.field173 = 2;
                class37.field857 = class102.field2321;
            }
        } else if (class9.field173 == 2) {
            byte var7 = 100;
            short var8 = 150;
            byte var9 = 60;
            int var15 = var9 + 30;
            if (var2 == 1 && var15 - 15 <= var3 && var3 < var15) {
                class127.field3085 = 0;
            }
            var15 += 15;
            if (var2 == 1 && var15 - 15 <= var3 && var15 > var3) {
                class127.field3085 = 1;
            }
            var15 += 15;
            if (var2 == 1 && var1 >= var7 - 75 && var1 <= var7 + 75 && var8 - 20 <= var3 && var8 + 20 >= var3) {
                class37.field855 = class37.field855.method826(false).method844(21975);
                class59.method472(class129.field3122, 0, class111.field2609, class111.field2613);
                class136.method1069((byte) 45, 20);
            } else {
                short var10 = 260;
                if (var2 == 1 && var10 - 75 <= var1 && var1 <= var10 + 75 && var8 - 20 <= var3 && var3 <= var8 + 20) {
                    class37.field850 = class37.field858;
                    class9.field173 = 0;
                    class37.field855 = class37.field858;
                }
                while (true) {
                    boolean var11;
                    label141: do {
                        while (class14.method159(2)) {
                            var11 = false;
                            for (int var12 = 0; var12 < class29.field659.method863(-123); var12++) {
                                if (class16.field326 == class29.field659.method837(var12, (byte) 59)) {
                                    var11 = true;
                                    break;
                                }
                            }
                            if (class127.field3085 != 0) {
                                continue label141;
                            }
                            if (class125.field3051 == 85 && class37.field855.method863(-128) > 0) {
                                class37.field855 = class37.field855.method860(0, false, class37.field855.method863(-127) - 1);
                            }
                            if (class125.field3051 == 84 || class125.field3051 == 80) {
                                class127.field3085 = 1;
                            }
                            if (var11 && class37.field855.method863(arg0 - 98) < 12) {
                                class37.field855 = class37.field855.method857(class16.field326, -127);
                            }
                        }
                        return;
                    } while (class127.field3085 != 1);
                    if (class125.field3051 == 85 && class37.field850.method863(-127) > 0) {
                        class37.field850 = class37.field850.method860(0, false, class37.field850.method863(-128) - 1);
                    }
                    if (class125.field3051 == 84 || class125.field3051 == 80) {
                        class127.field3085 = 0;
                    }
                    if (var11 && class37.field850.method863(-128) < 20) {
                        class37.field850 = class37.field850.method857(class16.field326, 114);
                    }
                }
            }
        } else if (class9.field173 == 3) {
            short var13 = 180;
            short var14 = 150;
            if (var2 == 1 && var13 - 75 <= var1 && var1 <= var13 + 75 && var14 - 20 <= var3 && var14 + 20 >= var3) {
                class9.field173 = 0;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)Lrc;", line = 888)
    public static final class105 method778(int arg0, int arg1) {
        if (arg1 != 98) {
            field2173 = -47L;
        }
        field2171++;
        return class108.method878(new class105[] { class75.method637(arg0 >> 24 & 0xFF, arg1 ^ 0x2053), class134.field3281, class75.method637(arg0 >> 16 & 0xFF, 8241), class134.field3281, class75.method637(arg0 >> 8 & 0xFF, 8241), class134.field3281, class75.method637(arg0 & 0xFF, 8241) }, 2867);
    }
}
