import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class48 {

    @OriginalMember(owner = "client!gf", name = "w", descriptor = "I")
    private int field1289;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "I")
    private int field1267;

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "[[I")
    private int[][] field1278;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "I")
    public static int field1272 = 3353893;

    @OriginalMember(owner = "client!gf", name = "n", descriptor = "Lkd;")
    public static class73 field1280 = class126.method1070((byte) -66, "Spiel)2Fenster geladen)3");

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "Lkd;")
    private static class73 field1273 = class126.method1070((byte) -66, "Press (Wchange your password(W on front page)3");

    @OriginalMember(owner = "client!gf", name = "m", descriptor = "Lkd;")
    public static class73 field1279 = class126.method1070((byte) -66, ":");

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "Lkd;")
    private static class73 field1275 = class126.method1070((byte) -66, "white:");

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "Lkd;")
    public static class73 field1276 = field1275;

    @OriginalMember(owner = "client!gf", name = "q", descriptor = "Lkd;")
    private static class73 field1283 = class126.method1070((byte) -66, "Loaded textures");

    @OriginalMember(owner = "client!gf", name = "t", descriptor = "I")
    public static int field1286 = 500;

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "Lkd;")
    public static class73 field1274 = field1283;

    @OriginalMember(owner = "client!gf", name = "y", descriptor = "Lkd;")
    public static class73 field1291 = field1275;

    @OriginalMember(owner = "client!gf", name = "z", descriptor = "Lkd;")
    public static class73 field1292 = class126.method1070((byte) -66, "Lade Konfiguration )2 ");

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "I")
    public static int field1269 = 0;

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "Lkd;")
    public static class73 field1271 = class126.method1070((byte) -66, "Bitte schlie-8en Sie die momentan ge-Offnete Benutzeroberfl-=che)1");

    @OriginalMember(owner = "client!gf", name = "A", descriptor = "Lkd;")
    public static class73 field1293 = class126.method1070((byte) -66, "Sie befinden sich in einem Mitglieder)2Gebiet(Q");

    @OriginalMember(owner = "client!gf", name = "B", descriptor = "Lkd;")
    public static class73 field1294 = field1273;

    @OriginalMember(owner = "client!gf", name = "G", descriptor = "[I")
    public static int[] field1299 = new int[2000];

    @OriginalMember(owner = "client!gf", name = "E", descriptor = "Lkd;")
    public static class73 field1297 = class126.method1070((byte) -66, "Versteckt");

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!gf", name = "o", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!gf", name = "p", descriptor = "I")
    public static int field1282;

    @OriginalMember(owner = "client!gf", name = "r", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!gf", name = "s", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!gf", name = "v", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!gf", name = "x", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!gf", name = "C", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "client!gf", name = "D", descriptor = "I")
    public static int field1296;

    @OriginalMember(owner = "client!gf", name = "F", descriptor = "I")
    public static int field1298;

    @OriginalMember(owner = "client!gf", name = "H", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "Loc;")
    public static class100 field1268;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "Lq;")
    public static class111 field1270;

    @OriginalMember(owner = "client!gf", name = "u", descriptor = "Lbc;")
    public static class11 field1287;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Z[B)[B")
    public final byte[] method383(boolean arg0, byte[] arg1) {
        if (arg0) {
            return null;
        }
        if (this.field1278 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field1289 / (long) this.field1267) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field1278[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field1289 + var6;
                int var14 = var13 / this.field1267;
                var5 += var14;
                var6 = var13 - this.field1267 * var14;
            }
            arg1 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg1[var8] = -128;
                } else if (var9 > 127) {
                    arg1[var8] = 127;
                } else {
                    arg1[var8] = (byte) var9;
                }
            }
        }
        field1281++;
        return arg1;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)V")
    public static final void method384(byte arg0) {
        field1290++;
        if (class129.field3262 < 2 && class103.field2567 == 0 && !class50.field1329) {
            return;
        }
        class73 var1;
        if (class103.field2567 == 1 && class129.field3262 < 2) {
            var1 = class32.method258(-59, new class73[] { class87.field2189, class136.field3382, class5.field192, class145.field3578 });
        } else if (class50.field1329 && class129.field3262 < 2) {
            var1 = class32.method258(-112, new class73[] { class57.field1511, class136.field3382, class121.field3102, class145.field3578 });
        } else {
            var1 = class54.field1440[class129.field3262 - 1];
        }
        if (arg0 != -36) {
            method387((byte) 87, null);
        }
        if (class129.field3262 > 2) {
            var1 = class32.method258(-67, new class73[] { var1, class103.field2573, class78.method676(class129.field3262 - 2, -4), class79.field2009 });
        }
        class58.field1553.method349(var1, 4, 15, 16777215, 0, class49.field1308 / 1000);
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(B)V")
    public static void method385(byte arg0) {
        field1293 = null;
        field1275 = null;
        field1287 = null;
        field1274 = null;
        field1283 = null;
        field1297 = null;
        field1292 = null;
        field1268 = null;
        field1280 = null;
        field1294 = null;
        field1299 = null;
        if (arg0 > -94) {
            return;
        }
        field1276 = null;
        field1291 = null;
        field1271 = null;
        field1279 = null;
        field1270 = null;
        field1273 = null;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(III[BII[Lge;)V")
    public static final void method386(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, class47[] arg6) {
        if (arg1 > -78) {
            method387((byte) 23, null);
        }
        for (int var7 = 0; var7 < 4; var7++) {
            for (int var12 = 0; var12 < 64; var12++) {
                for (int var13 = 0; var13 < 64; var13++) {
                    if (arg5 + var12 > 0 && arg5 + var12 < 103 && arg0 + var13 > 0 && arg0 + var13 < 103) {
                        arg6[var7].field1249[arg5 + var12][arg0 + var13] = class149.method1189(arg6[var7].field1249[arg5 + var12][arg0 + var13], -16777217);
                    }
                }
            }
        }
        field1284++;
        class114 var8 = new class114(arg3);
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < 64; var10++) {
                for (int var11 = 0; var11 < 64; var11++) {
                    class66.method546(arg4, arg2, var8, arg5 + var10, var9, arg0 + var11, 0, (byte) 4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(BLee;)V")
    public static final void method387(byte arg0, class34 arg1) {
        field1277++;
        if (class34.field945) {
            class66.method548(arg1, -13);
            return;
        }
        if (arg0 < 76) {
            field1293 = null;
        }
        if (class105.field2615 == 1 && class103.field2570 >= 715 && class42.field1134 >= 453) {
            class21.field580 = !class21.field580;
            if (class21.field580) {
                class103.method827((byte) 65);
            } else {
                class119.method1026(255, class42.field1131, class87.field2193, class114.field2876, false, 104);
            }
        }
        if (class1.field35 == 5) {
            return;
        }
        class44.field1175++;
        if (class1.field35 != 10) {
            return;
        }
        if (class109.field2673 != 2 && class143.field3558 == 0) {
            if (class105.field2615 == 1) {
                byte var2 = 5;
                short var3 = 463;
                byte var4 = 35;
                byte var5 = 100;
                if (class103.field2570 >= var2 && class103.field2570 <= var2 + var5 && var3 <= class42.field1134 && class42.field1134 <= var3 + var4) {
                    class99.method807(true);
                    return;
                }
            }
            if (class41.field1102 != null) {
                class99.method807(true);
            }
        }
        int var6 = class105.field2615;
        int var7 = class103.field2570;
        int var8 = class42.field1134;
        if (class71.field1816 == 0) {
            short var17 = 302;
            short var18 = 291;
            if (var6 == 1 && var7 >= var17 - 75 && var7 <= var17 + 75 && var18 - 20 <= var8 && var8 <= var18 + 20) {
                class71.field1816 = 3;
                class51.field1378 = 0;
            }
            short var19 = 462;
            if (var6 != 1 || var7 < var19 - 75 || var7 > var19 + 75 || var8 < var18 - 20 || var18 + 20 < var8) {
                return;
            }
            class42.field1138 = class11.field357;
            class42.field1129 = class136.field3392;
            class42.field1133 = class11.field349;
            class71.field1816 = 2;
            class51.field1378 = 0;
            return;
        }
        if (class71.field1816 == 2) {
            short var9 = 231;
            int var20 = var9 + 30;
            short var10 = 302;
            if (var6 == 1 && var20 - 15 <= var8 && var8 < var20) {
                class51.field1378 = 0;
            }
            short var11 = 321;
            var20 += 15;
            if (var6 == 1 && var8 >= var20 - 15 && var8 < var20) {
                class51.field1378 = 1;
            }
            var20 += 15;
            if (var6 == 1 && var10 - 75 <= var7 && var7 <= var10 + 75 && var8 >= var11 - 20 && var8 <= var11 + 20) {
                class42.field1142 = class42.field1142.method609((byte) -107).method610(-25);
                if (class42.field1142.method632((byte) -58) == 0) {
                    class42.method315(class133.field3344, class11.field344, -74, class11.field341);
                    return;
                }
                if (class42.field1125.method632((byte) -103) == 0) {
                    class42.method315(class54.field1426, class11.field361, 104, class11.field350);
                    return;
                }
                class42.method315(class64.field1684, class11.field368, 127, class11.field370);
                class45.method337(20, (byte) -73);
                return;
            }
            short var12 = 462;
            if (var6 == 1 && var12 - 75 <= var7 && var7 <= var12 + 75 && var8 >= var11 - 20 && var8 <= var11 + 20) {
                class71.field1816 = 0;
                class42.field1142 = class42.field1131;
                class42.field1125 = class42.field1131;
            }
            while (true) {
                boolean var13;
                label187: do {
                    while (class137.method1118(-50)) {
                        var13 = false;
                        for (int var14 = 0; var14 < class116.field2970.method632((byte) -96); var14++) {
                            if (class87.field2197 == class116.field2970.method624(var14, false)) {
                                var13 = true;
                                break;
                            }
                        }
                        if (class51.field1378 != 0) {
                            continue label187;
                        }
                        if (class129.field3256 == 85 && class42.field1142.method632((byte) -125) > 0) {
                            class42.field1142 = class42.field1142.method630(class42.field1142.method632((byte) -111) - 1, 0, -24023);
                        }
                        if (class129.field3256 == 84 || class129.field3256 == 80) {
                            class51.field1378 = 1;
                        }
                        if (var13 && class42.field1142.method632((byte) -92) < 12) {
                            class42.field1142 = class42.field1142.method607((byte) -115, class87.field2197);
                        }
                    }
                    return;
                } while (class51.field1378 != 1);
                if (class129.field3256 == 85 && class42.field1125.method632((byte) -97) > 0) {
                    class42.field1125 = class42.field1125.method630(class42.field1125.method632((byte) -120) - 1, 0, -24023);
                }
                if (class129.field3256 == 84 || class129.field3256 == 80) {
                    class51.field1378 = 0;
                }
                if (var13 && class42.field1125.method632((byte) -97) < 20) {
                    class42.field1125 = class42.field1125.method607((byte) -13, class87.field2197);
                }
            }
        }
        if (class71.field1816 != 3) {
            return;
        }
        short var15 = 321;
        short var16 = 382;
        if (var6 == 1 && var16 - 75 <= var7 && var7 <= var16 + 75 && var8 >= var15 - 20 && var15 + 20 >= var8) {
            class71.field1816 = 0;
            return;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V")
    public static final void method388(int arg0) {
        field1300++;
        if (class129.field3256 == 104) {
            int var1;
            if (class83.field2081 == -1) {
                var1 = class99.field2494;
            } else {
                var1 = class83.field2081;
            }
            if (class99.field2494 != class83.field2081) {
                var1--;
                if (var1 < 0) {
                    var1 = 19;
                }
                if (class66.field1715[var1] != null) {
                    class9.field309 = class66.field1715[var1];
                    class83.field2081 = var1;
                    class132.field3304 = true;
                }
            }
        }
        if (arg0 != -85) {
            field1270 = null;
        }
        if (class129.field3256 != 105 || class83.field2081 == -1) {
            return;
        }
        class83.field2081++;
        if (class83.field2081 >= 20) {
            class83.field2081 = 0;
        }
        if (class99.field2494 == class83.field2081) {
            class9.field309 = class9.field298;
            class132.field3304 = true;
            class83.field2081 = -1;
        } else if (class66.field1715[class83.field2081] != null) {
            class9.field309 = class66.field1715[class83.field2081];
            class132.field3304 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)I")
    public final int method389(int arg0, int arg1) {
        field1296++;
        if (arg0 != -1) {
            field1276 = null;
        }
        if (this.field1278 != null) {
            arg1 = (int) ((long) this.field1289 * (long) arg1 / (long) this.field1267) + 6;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lq;I)I")
    public static final int method390(class111 arg0, int arg1) {
        field1295++;
        int var2 = 0;
        if (arg0.method897(class105.field2612, -17568, class87.field2200)) {
            var2++;
        }
        if (arg0.method897(class105.field2612, -17568, class34.field916)) {
            var2++;
        }
        if (arg0.method897(class105.field2612, -17568, class86.field2186)) {
            var2++;
        }
        if (arg0.method897(class105.field2612, arg1 - 3300, class66.field1712)) {
            var2++;
        }
        if (arg0.method897(class105.field2612, arg1 - 3300, class32.field892)) {
            var2++;
        }
        if (arg0.method897(class105.field2612, -17568, class139.field3464)) {
            var2++;
        }
        if (arg0.method897(class105.field2612, -17568, class87.field2192)) {
            var2++;
        }
        if (arg0.method897(class105.field2612, -17568, class31.field861)) {
            var2++;
        }
        if (arg0.method897(class105.field2612, -17568, class87.field2199)) {
            var2++;
        }
        if (arg0.method897(class105.field2612, arg1 - 3300, class49.field1306)) {
            var2++;
        }
        if (arg0.method897(class105.field2612, -17568, class102.field2531)) {
            var2++;
        }
        if (arg0.method897(class105.field2612, -17568, class89.field2240)) {
            var2++;
        }
        if (arg0.method897(class105.field2612, arg1 - 3300, class107.field2646)) {
            var2++;
        }
        if (arg0.method897(class105.field2612, -17568, class43.field1154)) {
            var2++;
        }
        if (arg0.method897(class105.field2612, -17568, class76.field1956)) {
            var2++;
        }
        if (arg0.method897(class105.field2612, -17568, class15.field456)) {
            var2++;
        }
        if (arg0.method897(class105.field2612, -17568, class146.field3599)) {
            var2++;
        }
        if (arg0.method897(class105.field2612, arg1 ^ 0x7324, class146.field3612)) {
            var2++;
        }
        if (arg0.method897(class105.field2612, -17568, class57.field1513)) {
            var2++;
        }
        if (arg1 != -14268) {
            method387((byte) 27, null);
        }
        return var2;
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(II)V")
    public class48(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class145.method1162(arg1, arg0, -2);
            int var4 = arg1 / var3;
            this.field1289 = var4;
            int var5 = arg0 / var3;
            this.field1267 = var5;
            this.field1278 = new int[var5][14];
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field1278[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var4 / (double) var5;
                while (var10 < var11) {
                    double var14 = ((double) var10 - var8) * 3.141592653589793D;
                    double var16 = var12;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var12 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "(B)V")
    public static final void method391(byte arg0) {
        if (arg0 >= -2) {
            field1291 = null;
        }
        Object var1 = class53.field1401;
        synchronized (class53.field1401) {
            if (class49.field1309 != 0) {
                class49.field1309 = 1;
                try {
                    class53.field1401.wait();
                } catch (InterruptedException var2) {
                }
            }
        }
        field1285++;
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(II)I")
    public final int method392(int arg0, int arg1) {
        if (this.field1278 != null) {
            arg0 = (int) ((long) this.field1289 * (long) arg0 / (long) this.field1267);
        }
        if (arg1 != -2) {
            field1286 = 117;
        }
        field1288++;
        return arg0;
    }
}
