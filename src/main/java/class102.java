import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class102 {

    @OriginalMember(owner = "client!r", name = "m", descriptor = "I")
    public int field2310 = 0;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "I")
    public int field2301 = 0;

    @OriginalMember(owner = "client!r", name = "j", descriptor = "Lb;")
    public static class7 field2307 = new class7(8);

    @OriginalMember(owner = "client!r", name = "r", descriptor = "[I")
    public static int[] field2315 = new int[32];

    @OriginalMember(owner = "client!r", name = "t", descriptor = "Lrc;")
    private static class105 field2317;

    @OriginalMember(owner = "client!r", name = "w", descriptor = "Lrc;")
    private static class105 field2320;

    @OriginalMember(owner = "client!r", name = "B", descriptor = "Lrc;")
    public static class105 field2325;

    @OriginalMember(owner = "client!r", name = "u", descriptor = "Lrc;")
    private static class105 field2318;

    @OriginalMember(owner = "client!r", name = "C", descriptor = "Lrc;")
    public static class105 field2326;

    @OriginalMember(owner = "client!r", name = "v", descriptor = "Lrc;")
    public static class105 field2319;

    @OriginalMember(owner = "client!r", name = "A", descriptor = "Lrc;")
    public static class105 field2324;

    @OriginalMember(owner = "client!r", name = "F", descriptor = "Lrc;")
    private static class105 field2329;

    @OriginalMember(owner = "client!r", name = "y", descriptor = "Lrc;")
    public static class105 field2322;

    @OriginalMember(owner = "client!r", name = "s", descriptor = "Lrc;")
    public static class105 field2316;

    @OriginalMember(owner = "client!r", name = "E", descriptor = "Lrc;")
    private static class105 field2328;

    @OriginalMember(owner = "client!r", name = "x", descriptor = "Lrc;")
    public static class105 field2321;

    @OriginalMember(owner = "client!r", name = "G", descriptor = "Lrc;")
    public static class105 field2330;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "I")
    public int field2299;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "I")
    public int field2302;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "I")
    public int field2304;

    @OriginalMember(owner = "client!r", name = "h", descriptor = "I")
    public static int field2305;

    @OriginalMember(owner = "client!r", name = "i", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!r", name = "k", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!r", name = "l", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!r", name = "n", descriptor = "I")
    public static int field2311;

    @OriginalMember(owner = "client!r", name = "o", descriptor = "I")
    public static int field2312;

    @OriginalMember(owner = "client!r", name = "p", descriptor = "I")
    public int field2313;

    @OriginalMember(owner = "client!r", name = "q", descriptor = "I")
    public int field2314;

    @OriginalMember(owner = "client!r", name = "D", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!r", name = "z", descriptor = "J")
    public static long field2323;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "Lk;")
    public class60 field2300;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2315[var1] = var0 - 1;
            var0 += var0;
        }
        field2317 = class43.method374("Connection lost", 0);
        field2320 = class43.method374(" million", 0);
        field2325 = field2320;
        field2318 = class43.method374("Choose Option", 0);
        field2326 = class43.method374("scrollen:", 0);
        field2319 = class43.method374("::fpsoff", 0);
        field2324 = class43.method374("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3", 0);
        field2329 = class43.method374("Friends", 0);
        field2322 = field2318;
        field2316 = field2329;
        field2328 = class43.method374("Enter your username (V password)3", 0);
        field2321 = field2328;
        field2330 = field2317;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljd;B)V", line = 13)
    public static final void method812(class58 arg0, byte arg1) {
        field2308++;
        if (class104.field2351 == arg0.field1288 || arg0.field1238 == -1 || arg0.field1230 != 0 || arg0.field1244 + 1 > class6.method49(103, arg0.field1238).field2683[arg0.field1262]) {
            int var2 = arg0.field1288 - arg0.field1272;
            int var3 = class104.field2351 - arg0.field1272;
            int var4 = arg0.field1256 * 128 + arg0.field1227 * 64;
            int var5 = arg0.field1287 * 128 + arg0.field1227 * 64;
            int var6 = arg0.field1227 * 64 + arg0.field1211 * 128;
            arg0.field1229 = ((var2 - var3) * var4 + var3 * var6) / var2;
            int var7 = arg0.field1248 * 128 + arg0.field1227 * 64;
            arg0.field1274 = ((var2 - var3) * var5 + var3 * var7) / var2;
        }
        arg0.field1242 = 0;
        if (arg0.field1219 == 0) {
            arg0.field1253 = 1024;
        }
        if (arg0.field1219 == 1) {
            arg0.field1253 = 1536;
        }
        if (arg0.field1219 == 2) {
            arg0.field1253 = 0;
        }
        if (arg0.field1219 == 3) {
            arg0.field1253 = 512;
        }
        int var8 = 23 / ((-arg1 - 25) / 41);
        arg0.field1226 = arg0.field1253;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ZI)V", line = 56)
    public static final void method813(boolean arg0, int arg1) {
        field2305++;
        int[] var2 = class85.field1925.field613;
        int var3 = var2.length;
        for (int var4 = 0; var4 < var3; var4++) {
            var2[var4] = 0;
        }
        if (arg0) {
            return;
        }
        for (int var5 = 1; var5 < 103; var5++) {
            int var20 = (103 - var5) * 4 * 512 + 24628;
            for (int var21 = 1; var21 < 103; var21++) {
                if ((class57.field1185[arg1][var21][var5] & 0x18) == 0) {
                    class130.field3161.method533(var2, var20, 512, arg1, var21, var5);
                }
                if (arg1 < 3 && (class57.field1185[arg1 + 1][var21][var5] & 0x8) != 0) {
                    class130.field3161.method533(var2, var20, 512, arg1 + 1, var21, var5);
                }
                var20 += 4;
            }
        }
        class85.field1925.method248();
        int var6 = (int) (Math.random() * 20.0D) + (238 - -((int) (Math.random() * 20.0D)) - 10 << 8) + ((int) (Math.random() * 20.0D) + 228 << 16) + 238 - 10;
        int var7 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        for (int var8 = 1; var8 < 103; var8++) {
            for (int var19 = 1; var19 < 103; var19++) {
                if ((class57.field1185[arg1][var19][var8] & 0x18) == 0) {
                    class127.method1023(arg1, var8, var7, var6, var19, !arg0);
                }
                if (arg1 < 3 && (class57.field1185[arg1 + 1][var19][var8] & 0x8) != 0) {
                    class127.method1023(arg1 + 1, var8, var7, var6, var19, true);
                }
            }
        }
        class9.field176 = 0;
        for (int var9 = 0; var9 < 104; var9++) {
            for (int var10 = 0; var10 < 104; var10++) {
                int var11 = class130.field3161.method503(class73.field1619, var9, var10);
                if (var11 != 0) {
                    int var12 = var11 >> 14 & 0x7FFF;
                    int var13 = class12.method149(var12, (byte) 62).field2961;
                    if (var13 >= 0) {
                        int var14 = var10;
                        int var15 = var9;
                        if (var13 != 22 && var13 != 29 && var13 != 34 && var13 != 36 && var13 != 46 && var13 != 47 && var13 != 48) {
                            int[][] var16 = class116.field2717[class73.field1619].field2548;
                            for (int var17 = 0; var17 < 10; var17++) {
                                int var18 = (int) (Math.random() * 4.0D);
                                if (var18 == 0 && var15 > 0 && var15 > var9 - 3 && (var16[var15 - 1][var14] & 0x1280108) == 0) {
                                    var15--;
                                }
                                if (var18 == 1 && var15 < 103 && var9 + 3 > var15 && (var16[var15 + 1][var14] & 0x1280180) == 0) {
                                    var15++;
                                }
                                if (var18 == 2 && var14 > 0 && var10 - 3 < var14 && (var16[var15][var14 - 1] & 0x1280102) == 0) {
                                    var14--;
                                }
                                if (var18 == 3 && var14 < 103 && var14 < var10 + 3 && (var16[var15][var14 + 1] & 0x1280120) == 0) {
                                    var14++;
                                }
                            }
                        }
                        class85.field1926[class9.field176] = class73.field1610[var13];
                        class83.field1872[class9.field176] = var15;
                        class55.field1101[class9.field176] = var14;
                        class9.field176++;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V", line = 210)
    public static void method814(byte arg0) {
        int var1 = 120 / ((70 - arg0) / 33);
        field2329 = null;
        field2320 = null;
        field2322 = null;
        field2317 = null;
        field2315 = null;
        field2318 = null;
        field2326 = null;
        field2330 = null;
        field2319 = null;
        field2307 = null;
        field2325 = null;
        field2316 = null;
        field2324 = null;
        field2328 = null;
        field2321 = null;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)Lme;", line = 236)
    public static final class77 method815(boolean arg0) {
        field2311++;
        if (arg0) {
            method816(-76, true);
        }
        class77 var1 = new class77(class113.field2646, class90.field2059, class50.field1057, class58.field1295, class85.field1908);
        class9.method118(-1);
        return var1;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IZ)V", line = 252)
    public static final void method816(int arg0, boolean arg1) {
        field2303++;
        if (class119.field2842.field1229 >> 7 == class12.field243 && class119.field2842.field1274 >> 7 == class55.field1103) {
            class12.field243 = 0;
        }
        int var2 = class97.field2250;
        if (arg1) {
            var2 = 1;
        }
        int var3 = 0;
        if (arg0 != 127) {
            return;
        }
        while (var3 < var2) {
            class15 var4;
            int var5;
            if (arg1) {
                var4 = class119.field2842;
                var5 = 33538048;
            } else {
                var4 = class58.field1303[class121.field2956[var3]];
                var5 = class121.field2956[var3] << 14;
            }
            if (var4 != null && var4.method164(95)) {
                var4.field290 = false;
                int var6 = var4.field1229 >> 7;
                if ((class109.field2520 && class97.field2250 > 50 || class97.field2250 > 200) && !arg1 && var4.field1290 == var4.field1271) {
                    var4.field290 = true;
                }
                int var7 = var4.field1274 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var4.field288 == null || class104.field2351 < var4.field304 || var4.field292 <= class104.field2351) {
                        label92: {
                            if ((var4.field1229 & 0x7F) == 64 && (var4.field1274 & 0x7F) == 64) {
                                if (class43.field987[var6][var7] == class105.field2421) {
                                    break label92;
                                }
                                class43.field987[var6][var7] = class105.field2421;
                            }
                            var4.field311 = class134.method1061(11387, class73.field1619, var4.field1229, var4.field1274);
                            class130.field3161.method509(class73.field1619, var4.field1229, var4.field1274, var4.field311, 60, var4, var4.field1226, var5, var4.field1284);
                        }
                    } else {
                        var4.field290 = false;
                        var4.field311 = class134.method1061(11387, class73.field1619, var4.field1229, var4.field1274);
                        class130.field3161.method500(class73.field1619, var4.field1229, var4.field1274, var4.field311, 60, var4, var4.field1226, var5, var4.field297, var4.field302, var4.field319, var4.field317);
                    }
                }
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V", line = 368)
    public static final void method817(int arg0) {
        class110.field2556 = 0;
        field2306++;
        int var1 = (class119.field2842.field1229 >> 7) + class23.field562;
        int var2 = (class119.field2842.field1274 >> 7) + class107.field2466;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class110.field2556 = 1;
        }
        int var3 = -73 / ((arg0 + 27) / 32);
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class110.field2556 = 1;
        }
        if (class110.field2556 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class110.field2556 = 0;
        }
    }
}
