import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class99 {

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "Ltd;")
    private static class136 field2373 = class145.method1172("green:", 45);

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "I")
    public static int field2378 = 0;

    @OriginalMember(owner = "client!ob", name = "z", descriptor = "Ltd;")
    public static class136 field2397 = class145.method1172("(U2", 45);

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "I")
    public static int field2372 = -1;

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "Ltd;")
    private static class136 field2377 = class145.method1172("Select", 45);

    @OriginalMember(owner = "client!ob", name = "C", descriptor = "Ltd;")
    private static class136 field2400 = class145.method1172("Loading interfaces )2 ", 45);

    @OriginalMember(owner = "client!ob", name = "s", descriptor = "Ltd;")
    public static class136 field2390 = field2400;

    @OriginalMember(owner = "client!ob", name = "B", descriptor = "Ltd;")
    public static class136 field2399 = field2373;

    @OriginalMember(owner = "client!ob", name = "F", descriptor = "Ltd;")
    public static class136 field2403 = field2373;

    @OriginalMember(owner = "client!ob", name = "y", descriptor = "Ltd;")
    public static class136 field2396 = class145.method1172("swe", 45);

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "[Z")
    public static boolean[] field2379 = new boolean[112];

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "Ltd;")
    public static class136 field2376 = field2377;

    @OriginalMember(owner = "client!ob", name = "t", descriptor = "Lue;")
    public static class143 field2391 = new class143(64);

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "I")
    private int field2380;

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!ob", name = "l", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!ob", name = "m", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!ob", name = "o", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!ob", name = "q", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!ob", name = "v", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!ob", name = "w", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!ob", name = "x", descriptor = "I")
    public static int field2395;

    @OriginalMember(owner = "client!ob", name = "A", descriptor = "I")
    public static int field2398;

    @OriginalMember(owner = "client!ob", name = "E", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!ob", name = "G", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!ob", name = "H", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!ob", name = "I", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "J")
    public static long field2374;

    @OriginalMember(owner = "client!ob", name = "p", descriptor = "J")
    private long field2387;

    @OriginalMember(owner = "client!ob", name = "u", descriptor = "J")
    private long field2392;

    @OriginalMember(owner = "client!ob", name = "J", descriptor = "Z")
    public boolean field2407;

    @OriginalMember(owner = "client!ob", name = "n", descriptor = "[I")
    private int[] field2385;

    @OriginalMember(owner = "client!ob", name = "r", descriptor = "[I")
    private int[] field2389;

    @OriginalMember(owner = "client!ob", name = "D", descriptor = "[Lnb;")
    public static class92[] field2401;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Z)Lsa;")
    public final class126 method795(boolean arg0) {
        field2405++;
        if (this.field2380 != -1) {
            return class139.method1136(this.field2380, 9).method725((byte) -74);
        }
        boolean var2 = arg0;
        for (int var3 = 0; var3 < 12; var3++) {
            int var12 = this.field2385[var3];
            if (var12 >= 256 && var12 < 512 && !class63.method477(var12 - 256, (byte) -76).method125((byte) -127)) {
                var2 = true;
            }
            if (var12 >= 512 && !class63.method472(var12 - 512, (byte) -34).method947(false, this.field2407)) {
                var2 = true;
            }
        }
        if (var2) {
            return null;
        }
        class126[] var4 = new class126[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var9 = this.field2385[var6];
            if (var9 >= 256 && var9 < 512) {
                class126 var10 = class63.method477(var9 - 256, (byte) 0).method126((byte) -16);
                if (var10 != null) {
                    var4[var5++] = var10;
                }
            }
            if (var9 >= 512) {
                class126 var11 = class63.method472(var9 - 512, (byte) -76).method948(this.field2407, false);
                if (var11 != null) {
                    var4[var5++] = var11;
                }
            }
        }
        class126 var7 = new class126(var4, var5);
        for (int var8 = 0; var8 < 5; var8++) {
            if (this.field2389[var8] != 0) {
                var7.method973(class19.field385[var8][0], class19.field385[var8][this.field2389[var8]]);
                if (var8 == 1) {
                    var7.method973(class145.field3337[0], class145.field3337[this.field2389[var8]]);
                }
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZII)V")
    public final void method796(boolean arg0, int arg1, int arg2) {
        int var4 = -108 / ((arg2 - 40) / 47);
        int var5 = this.field2389[arg1];
        if (arg0) {
            var5++;
            if (var5 >= class19.field385[arg1].length) {
                var5 = 0;
            }
        } else {
            var5--;
            if (var5 < 0) {
                var5 = class19.field385[arg1].length - 1;
            }
        }
        field2393++;
        this.field2389[arg1] = var5;
        this.method800(true);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IILqe;Lqe;I)Lda;")
    public final class23 method797(int arg0, int arg1, class116 arg2, class116 arg3, int arg4) {
        field2398++;
        if (this.field2380 != -1) {
            return class139.method1136(this.field2380, 9).method727(118, arg4, arg0, arg3, arg2);
        }
        long var6 = this.field2387;
        int[] var8 = this.field2385;
        if (arg2 != null && (arg2.field2668 >= 0 || arg2.field2662 >= 0)) {
            var8 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var8[var9] = this.field2385[var9];
            }
            if (arg2.field2668 >= 0) {
                var6 += arg2.field2668 - this.field2385[5] << 8;
                var8[5] = arg2.field2668;
            }
            if (arg2.field2662 >= 0) {
                var6 += arg2.field2662 - this.field2385[3] << 16;
                var8[3] = arg2.field2662;
            }
        }
        if (arg1 >= -125) {
            this.method804(null, null, -127, true, -98);
        }
        class23 var10 = (class23) class128.field3080.method1162(var6, true);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var21 = var8[var12];
                if (var21 >= 256 && var21 < 512 && !class63.method477(var21 - 256, (byte) -108).method124(0)) {
                    var11 = true;
                }
                if (var21 >= 512 && !class63.method472(var21 - 512, (byte) -76).method951(this.field2407, -2605)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field2392 != -1L) {
                    var10 = (class23) class128.field3080.method1162(this.field2392, true);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                int var13 = 0;
                class126[] var14 = new class126[12];
                for (int var15 = 0; var15 < 12; var15++) {
                    int var18 = var8[var15];
                    if (var18 >= 256 && var18 < 512) {
                        class126 var19 = class63.method477(var18 - 256, (byte) -86).method132(32);
                        if (var19 != null) {
                            var14[var13++] = var19;
                        }
                    }
                    if (var18 >= 512) {
                        class126 var20 = class63.method472(var18 - 512, (byte) -29).method943(this.field2407, -91);
                        if (var20 != null) {
                            var14[var13++] = var20;
                        }
                    }
                }
                class126 var16 = new class126(var14, var13);
                for (int var17 = 0; var17 < 5; var17++) {
                    if (this.field2389[var17] != 0) {
                        var16.method973(class19.field385[var17][0], class19.field385[var17][this.field2389[var17]]);
                        if (var17 == 1) {
                            var16.method973(class145.field3337[0], class145.field3337[this.field2389[var17]]);
                        }
                    }
                }
                var10 = var16.method984(64, 850, -30, -50, -30);
                class128.field3080.method1164(var6, var10, (byte) 126);
                this.field2392 = var6;
            }
        }
        if (arg2 == null && arg3 == null) {
            return var10;
        }
        class23 var22;
        if (arg2 != null && arg3 != null) {
            var22 = arg2.method914(arg0, (byte) -111, arg3, arg4, var10);
        } else if (arg2 == null) {
            var22 = arg3.method911(arg4, false, var10);
        } else {
            var22 = arg2.method911(arg0, false, var10);
        }
        return var22;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILsb;)V")
    public final void method798(int arg0, class127 arg1) {
        arg1.method1026(this.field2407 ? 1 : 0, (byte) 127);
        for (int var3 = 0; var3 < 7; var3++) {
            int var5 = this.field2385[class55.field1249[var3]];
            if (var5 == 0) {
                arg1.method1026(-1, (byte) 127);
            } else {
                arg1.method1026(var5 - 256, (byte) 127);
            }
        }
        if (arg0 != 1) {
            field2374 = 53L;
        }
        field2382++;
        for (int var4 = 0; var4 < 5; var4++) {
            arg1.method1026(this.field2389[var4], (byte) 127);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIII)V")
    public static final void method799(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2386++;
        class114.method902(arg2, arg1, arg2 + arg4, arg0 + arg1);
        class103.method818();
        class136.field3190++;
        class141.method1144(true, (byte) 125);
        class63.method471(-23767, true);
        class141.method1144(false, (byte) 13);
        class63.method471(-23767, false);
        class110.method871(13312);
        class5.method28(-112);
        if (!class151.field3470) {
            int var5 = class105.field2491;
            if (var5 < class1.field10 / 256) {
                var5 = class1.field10 / 256;
            }
            if (class106.field2503[4] && var5 < class38.field891[4] + 128) {
                var5 = class38.field891[4] + 128;
            }
            int var6 = class65.field1401 + class151.field3467 & 0x7FF;
            class125.method960(var5 * 3 + 600, (byte) 126, var5, var6, class13.field238, class65.method486(class62.field1331, (byte) -42, class24.field555.field3578, class24.field555.field3580) - 50, class152.field3482);
        }
        int var7;
        if (class151.field3470) {
            var7 = class61.method465((byte) 27);
        } else {
            var7 = class91.method689(true);
        }
        int var8 = class9.field168;
        int var9 = 29 % ((arg3 + 85) / 38);
        int var10 = class12.field228;
        int var11 = class100.field2409;
        int var12 = class83.field1976;
        int var13 = class28.field621;
        for (int var14 = 0; var14 < 5; var14++) {
            if (class106.field2503[var14]) {
                int var17 = (int) ((double) (class116.field2674[var14] * 2 + 1) * Math.random() + Math.sin((double) class119.field2702[var14] / 100.0D * (double) class90.field2138[var14]) * (double) class38.field891[var14] - (double) class116.field2674[var14]);
                if (var14 == 2) {
                    class100.field2409 += var17;
                }
                if (var14 == 1) {
                    class28.field621 += var17;
                }
                if (var14 == 0) {
                    class9.field168 += var17;
                }
                if (var14 == 4) {
                    class12.field228 += var17;
                    if (class12.field228 < 128) {
                        class12.field228 = 128;
                    }
                    if (class12.field228 > 383) {
                        class12.field228 = 383;
                    }
                }
                if (var14 == 3) {
                    class83.field1976 = class83.field1976 + var17 & 0x7FF;
                }
            }
        }
        int var15 = class18.field360;
        int var16 = class142.field3292;
        if (arg2 <= var15 && var15 < arg2 + arg4 && var16 >= arg1 && arg0 + arg1 > var16) {
            class23.field537 = class18.field360 - arg2;
            class23.field529 = true;
            class23.field518 = 0;
            class23.field527 = class142.field3292 - arg1;
        } else {
            class23.field529 = false;
            class23.field518 = 0;
        }
        class21.method155(119);
        class114.method891(arg2, arg1, arg4, arg0, 0);
        class21.method155(125);
        class146.field3366.method780(class9.field168, class28.field621, class100.field2409, class12.field228, class83.field1976, var7);
        class21.method155(107);
        class146.field3366.method746();
        class143.method1160(arg4, arg0, arg1, 108, arg2);
        class31.method268(arg1, arg2, -60);
        ((class2) class103.field2444).method15(class41.field967, -28552);
        class127.method1009(arg4, arg2, 4, arg0, arg1);
        class83.field1976 = var12;
        class100.field2409 = var11;
        class9.field168 = var8;
        class28.field621 = var13;
        class12.field228 = var10;
        if (client.field435 && class141.method1149(true, true, false) == 0) {
            client.field435 = false;
        }
        if (client.field435) {
            class114.method891(arg2, arg1, arg4, arg0, 0);
            class105.method843(true, class47.field1073, false);
        }
        if (!client.field435 && !class96.field2267 && var15 >= arg2 && var15 < arg2 + arg4 && var16 >= arg1 && var16 < arg0 + arg1) {
            class69.method510(arg2, 18, arg1, var15, var16);
        }
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(Z)V")
    private final void method800(boolean arg0) {
        long var2 = this.field2387;
        this.field2387 = 0L;
        field2383++;
        int var4 = this.field2385[5];
        int var5 = this.field2385[9];
        this.field2385[9] = var4;
        this.field2385[5] = var5;
        for (int var6 = 0; var6 < 12; var6++) {
            this.field2387 <<= 0x4;
            if (this.field2385[var6] >= 256) {
                this.field2387 += this.field2385[var6] - 256;
            }
        }
        if (this.field2385[0] >= 256) {
            this.field2387 += this.field2385[0] - 256 >> 4;
        }
        if (this.field2385[1] >= 256) {
            this.field2387 += this.field2385[1] - 256 >> 8;
        }
        if (!arg0) {
            field2403 = null;
        }
        for (int var7 = 0; var7 < 5; var7++) {
            this.field2387 <<= 0x3;
            this.field2387 += this.field2389[var7];
        }
        this.field2385[9] = var5;
        this.field2385[5] = var4;
        this.field2387 <<= 0x1;
        this.field2387 += this.field2407 ? 1 : 0;
        if (var2 != 0L && this.field2387 != var2) {
            class128.field3080.method1166(115, var2);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(III)V")
    public static final void method801(int arg0, int arg1, int arg2) {
        field2375++;
        if (class91.method688(arg0, (byte) -128)) {
            class140.method1139(arg1, 208, class94.field2201[arg0]);
            if (arg2 != 128) {
                method799(-17, 71, -103, -83, -23);
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lo;[Lm;I)V")
    public static final void method802(class97 arg0, class83[] arg1, int arg2) {
        field2388++;
        if (arg2 <= 49) {
            field2376 = null;
        }
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((class125.field2895[var3][var110][var111] & 0x1) == 1) {
                        int var112 = var3;
                        if ((class125.field2895[1][var110][var111] & 0x2) == 2) {
                            var112 = var3 - 1;
                        }
                        if (var112 >= 0) {
                            arg1[var112].method626(var111, var110, 2);
                        }
                    }
                }
            }
        }
        class122.field2824 += (int) (Math.random() * 5.0D) - 2;
        class121.field2811 += (int) (Math.random() * 5.0D) - 2;
        if (class122.field2824 < -8) {
            class122.field2824 = -8;
        }
        if (class121.field2811 < -16) {
            class121.field2811 = -16;
        }
        if (class121.field2811 > 16) {
            class121.field2811 = 16;
        }
        if (class122.field2824 > 8) {
            class122.field2824 = 8;
        }
        for (int var4 = 0; var4 < 4; var4++) {
            byte[][] var47 = class133.field3141[var4];
            int var48 = (int) Math.sqrt(5100.0D);
            int var49 = var48 * 768 >> 8;
            for (int var50 = 1; var50 < 103; var50++) {
                for (int var101 = 1; var101 < 103; var101++) {
                    int var102 = class78.field1804[var4][var101 + 1][var50] - class78.field1804[var4][var101 - 1][var50];
                    int var103 = class78.field1804[var4][var101][var50 + 1] - class78.field1804[var4][var101][var50 - 1];
                    int var104 = (int) Math.sqrt((double) (var103 * var103 + var102 * var102 + 65536));
                    int var105 = (var103 << 8) / var104;
                    int var106 = (var102 << 8) / var104;
                    int var107 = 65536 / var104;
                    int var108 = (var105 * -50 + var106 * -50 + var107 * -10) / var49 + 96;
                    int var109 = (var47[var101][var50 - 1] >> 2) + ((var47[var101 - 1][var50] >> 2) - (-(var47[var101][var50 + 1] >> 3) - (var47[var101 + 1][var50] >> 3) - (var47[var101][var50] >> 1)));
                    class74.field1567[var101][var50] = var108 - var109;
                }
            }
            for (int var51 = 0; var51 < 104; var51++) {
                class122.field2843[var51] = 0;
                class87.field2049[var51] = 0;
                class101.field2421[var51] = 0;
                class31.field685[var51] = 0;
                class139.field3241[var51] = 0;
            }
            for (int var52 = -5; var52 < 109; var52++) {
                for (int var55 = 0; var55 < 104; var55++) {
                    int var95 = var52 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < 104) {
                        int var96 = class4.field84[var4][var95][var55] & 0xFF;
                        if (var96 > 0) {
                            class28 var97 = class94.method699(var96 - 1, 33);
                            class122.field2843[var55] += var97.field606;
                            class87.field2049[var55] += var97.field608;
                            class101.field2421[var55] += var97.field616;
                            class31.field685[var55] += var97.field611;
                            var10002 = class139.field3241[var55]++;
                        }
                    }
                    int var98 = var52 - 5;
                    if (var98 >= 0 && var98 < 104) {
                        int var99 = class4.field84[var4][var98][var55] & 0xFF;
                        if (var99 > 0) {
                            class28 var100 = class94.method699(var99 - 1, 106);
                            class122.field2843[var55] -= var100.field606;
                            class87.field2049[var55] -= var100.field608;
                            class101.field2421[var55] -= var100.field616;
                            class31.field685[var55] -= var100.field611;
                            var10002 = class139.field3241[var55]--;
                        }
                    }
                }
                if (var52 >= 1 && var52 < 103) {
                    int var56 = 0;
                    int var57 = 0;
                    int var58 = 0;
                    int var59 = 0;
                    int var60 = 0;
                    for (int var61 = -5; var61 < 109; var61++) {
                        int var62 = var61 - 5;
                        int var63 = var61 + 5;
                        if (var63 >= 0 && var63 < 104) {
                            var58 += class87.field2049[var63];
                            var59 += class139.field3241[var63];
                            var57 += class101.field2421[var63];
                            var60 += class31.field685[var63];
                            var56 += class122.field2843[var63];
                        }
                        if (var62 >= 0 && var62 < 104) {
                            var57 -= class101.field2421[var62];
                            var56 -= class122.field2843[var62];
                            var58 -= class87.field2049[var62];
                            var60 -= class31.field685[var62];
                            var59 -= class139.field3241[var62];
                        }
                        if (var61 >= 1 && var61 < 103 && (!class65.field1399 || (class125.field2895[0][var52][var61] & 0x2) != 0 || (class125.field2895[var4][var52][var61] & 0x10) == 0 && client.method177(var4, 2, var52, var61) == class107.field2520)) {
                            if (var4 < class76.field1714) {
                                class76.field1714 = var4;
                            }
                            int var64 = class40.field941[var4][var52][var61] & 0xFF;
                            int var65 = class4.field84[var4][var52][var61] & 0xFF;
                            if (var65 > 0 || var64 > 0) {
                                int var66 = class78.field1804[var4][var52 + 1][var61];
                                int var67 = class78.field1804[var4][var52][var61 + 1];
                                int var68 = class78.field1804[var4][var52 + 1][var61 + 1];
                                int var69 = class78.field1804[var4][var52][var61];
                                int var70 = class74.field1567[var52 + 1][var61];
                                int var71 = class74.field1567[var52][var61];
                                int var72 = class74.field1567[var52 + 1][var61 + 1];
                                int var73 = class74.field1567[var52][var61 + 1];
                                int var74 = -1;
                                int var75 = -1;
                                if (var65 > 0) {
                                    int var76 = var56 * 256 / var60;
                                    int var77 = var57 / var59;
                                    int var78 = var58 / var59;
                                    var74 = class38.method322(4, var78, var77, var76);
                                    int var79 = var76 + class122.field2824 & 0xFF;
                                    int var80 = class121.field2811 + var77;
                                    if (var80 < 0) {
                                        var80 = 0;
                                    } else if (var80 > 255) {
                                        var80 = 255;
                                    }
                                    var75 = class38.method322(4, var78, var80, var79);
                                }
                                if (var4 > 0) {
                                    boolean var81 = true;
                                    if (var65 == 0 && class35.field832[var4][var52][var61] != 0) {
                                        var81 = false;
                                    }
                                    if (var64 > 0 && !class113.method883(255, var64 - 1).field3516) {
                                        var81 = false;
                                    }
                                    if (var81 && var66 == var69 && var68 == var69 && var67 == var69) {
                                        class16.field322[var4][var52][var61] = class2.method13(class16.field322[var4][var52][var61], 2340);
                                    }
                                }
                                int var82 = 0;
                                if (var75 != -1) {
                                    var82 = class103.field2451[class125.method962(var75, 89, 96)];
                                }
                                if (var64 == 0) {
                                    arg0.method751(var4, var52, var61, 0, 0, -1, var69, var66, var68, var67, class125.method962(var74, 112, var71), class125.method962(var74, 98, var70), class125.method962(var74, 114, var72), class125.method962(var74, 123, var73), 0, 0, 0, 0, var82, 0);
                                } else {
                                    int var83 = class35.field832[var4][var52][var61] + 1;
                                    byte var84 = class15.field300[var4][var52][var61];
                                    class154 var85 = class113.method883(255, var64 - 1);
                                    int var86 = var85.field3534;
                                    int var87;
                                    int var88;
                                    if (var86 >= 0) {
                                        var87 = class103.field2444.method7(var86, (byte) 120);
                                        var88 = -1;
                                    } else if (var85.field3515 == 16711935) {
                                        var88 = -2;
                                        var87 = -2;
                                        var86 = -1;
                                    } else {
                                        var88 = class38.method322(4, var85.field3526, var85.field3510, var85.field3531);
                                        int var89 = class122.field2824 + var85.field3531 & 0xFF;
                                        int var90 = class121.field2811 + var85.field3510;
                                        if (var90 < 0) {
                                            var90 = 0;
                                        } else if (var90 > 255) {
                                            var90 = 255;
                                        }
                                        var87 = class38.method322(4, var85.field3526, var90, var89);
                                    }
                                    int var91 = 0;
                                    if (var87 != -2) {
                                        var91 = class103.field2451[class87.method667((byte) 98, 96, var87)];
                                    }
                                    if (var85.field3521 != -1) {
                                        int var92 = class121.field2811 + var85.field3517;
                                        if (var92 < 0) {
                                            var92 = 0;
                                        } else if (var92 > 255) {
                                            var92 = 255;
                                        }
                                        int var93 = class122.field2824 + var85.field3513 & 0xFF;
                                        int var94 = class38.method322(4, var85.field3524, var92, var93);
                                        var91 = class103.field2451[class87.method667((byte) 99, 96, var94)];
                                    }
                                    arg0.method751(var4, var52, var61, var83, var84, var86, var69, var66, var68, var67, class125.method962(var74, 94, var71), class125.method962(var74, 124, var70), class125.method962(var74, 101, var72), class125.method962(var74, 120, var73), class87.method667((byte) -14, var71, var88), class87.method667((byte) 101, var70, var88), class87.method667((byte) 125, var72, var88), class87.method667((byte) -123, var73, var88), var82, var91);
                                }
                            }
                        }
                    }
                }
            }
            for (int var53 = 1; var53 < 103; var53++) {
                for (int var54 = 1; var54 < 103; var54++) {
                    arg0.method760(var4, var54, var53, client.method177(var4, 2, var54, var53));
                }
            }
            class4.field84[var4] = null;
            class40.field941[var4] = null;
            class35.field832[var4] = null;
            class15.field300[var4] = null;
            class133.field3141[var4] = null;
        }
        arg0.method764(-50, -10, -50);
        for (int var5 = 0; var5 < 104; var5++) {
            for (int var46 = 0; var46 < 104; var46++) {
                if ((class125.field2895[1][var5][var46] & 0x2) == 2) {
                    arg0.method771(var5, var46);
                }
            }
        }
        int var6 = 1;
        int var7 = 2;
        int var8 = 4;
        for (int var9 = 0; var9 < 4; var9++) {
            if (var9 > 0) {
                var6 <<= 0x3;
                var7 <<= 0x3;
                var8 <<= 0x3;
            }
            for (int var10 = 0; var10 <= var9; var10++) {
                for (int var11 = 0; var11 <= 104; var11++) {
                    for (int var12 = 0; var12 <= 104; var12++) {
                        if ((class16.field322[var10][var12][var11] & var6) != 0) {
                            int var13;
                            for (var13 = var11; var13 > 0 && (var6 & class16.field322[var10][var12][var13 - 1]) != 0; var13--) {
                            }
                            int var14;
                            for (var14 = var11; var14 < 104 && (class16.field322[var10][var12][var14 + 1] & var6) != 0; var14++) {
                            }
                            int var15 = var10;
                            int var16 = var10;
                            label357: while (var15 > 0) {
                                for (int var17 = var13; var17 <= var14; var17++) {
                                    if ((var6 & class16.field322[var15 - 1][var12][var17]) == 0) {
                                        break label357;
                                    }
                                }
                                var15--;
                            }
                            label346: while (var16 < var9) {
                                for (int var18 = var13; var18 <= var14; var18++) {
                                    if ((class16.field322[var16 + 1][var12][var18] & var6) == 0) {
                                        break label346;
                                    }
                                }
                                var16++;
                            }
                            int var19 = (var14 + 1 - var13) * (var16 + 1 - var15);
                            if (var19 >= 8) {
                                short var20 = 240;
                                int var21 = class78.field1804[var15][var12][var13];
                                int var22 = class78.field1804[var16][var12][var13] - var20;
                                class97.method745(var9, 1, var12 * 128, var12 * 128, var13 * 128, var14 * 128 + 128, var22, var21);
                                for (int var23 = var15; var23 <= var16; var23++) {
                                    for (int var24 = var13; var24 <= var14; var24++) {
                                        class16.field322[var23][var12][var24] = class154.method1207(class16.field322[var23][var12][var24], ~var6);
                                    }
                                }
                            }
                        }
                        if ((class16.field322[var10][var12][var11] & var7) != 0) {
                            int var25;
                            for (var25 = var12; var25 > 0 && (class16.field322[var10][var25 - 1][var11] & var7) != 0; var25--) {
                            }
                            int var26 = var12;
                            int var27 = var10;
                            while (var26 < 104 && (class16.field322[var10][var26 + 1][var11] & var7) != 0) {
                                var26++;
                            }
                            label413: while (var27 > 0) {
                                for (int var28 = var25; var28 <= var26; var28++) {
                                    if ((var7 & class16.field322[var27 - 1][var28][var11]) == 0) {
                                        break label413;
                                    }
                                }
                                var27--;
                            }
                            int var29;
                            label401: for (var29 = var10; var29 < var9; var29++) {
                                for (int var30 = var25; var30 <= var26; var30++) {
                                    if ((var7 & class16.field322[var29 + 1][var30][var11]) == 0) {
                                        break label401;
                                    }
                                }
                            }
                            int var31 = (var26 + 1 - var25) * (var29 + 1 - var27);
                            if (var31 >= 8) {
                                short var32 = 240;
                                int var33 = class78.field1804[var29][var25][var11] - var32;
                                int var34 = class78.field1804[var27][var25][var11];
                                class97.method745(var9, 2, var25 * 128, var26 * 128 + 128, var11 * 128, var11 * 128, var33, var34);
                                for (int var35 = var27; var35 <= var29; var35++) {
                                    for (int var36 = var25; var36 <= var26; var36++) {
                                        class16.field322[var35][var36][var11] = class154.method1207(class16.field322[var35][var36][var11], ~var7);
                                    }
                                }
                            }
                        }
                        if ((var8 & class16.field322[var10][var12][var11]) != 0) {
                            int var37 = var12;
                            int var38 = var11;
                            int var39 = var12;
                            while (var38 > 0 && (var8 & class16.field322[var10][var12][var38 - 1]) != 0) {
                                var38--;
                            }
                            int var40;
                            for (var40 = var11; var40 < 104 && (class16.field322[var10][var12][var40 + 1] & var8) != 0; var40++) {
                            }
                            label467: while (var39 > 0) {
                                for (int var41 = var38; var41 <= var40; var41++) {
                                    if ((class16.field322[var10][var39 - 1][var41] & var8) == 0) {
                                        break label467;
                                    }
                                }
                                var39--;
                            }
                            label456: while (var37 < 104) {
                                for (int var42 = var38; var42 <= var40; var42++) {
                                    if ((class16.field322[var10][var37 + 1][var42] & var8) == 0) {
                                        break label456;
                                    }
                                }
                                var37++;
                            }
                            if ((var40 + 1 - var38) * (var37 + 1 - var39) >= 4) {
                                int var43 = class78.field1804[var10][var39][var38];
                                class97.method745(var9, 4, var39 * 128, var37 * 128 + 128, var38 * 128, var40 * 128 + 128, var43, var43);
                                for (int var44 = var39; var44 <= var37; var44++) {
                                    for (int var45 = var38; var45 <= var40; var45++) {
                                        class16.field322[var10][var44][var45] = class154.method1207(class16.field322[var10][var44][var45], ~var8);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V")
    public static void method803(int arg0) {
        field2400 = null;
        field2377 = null;
        field2399 = null;
        field2391 = null;
        field2397 = null;
        if (arg0 != -1) {
            return;
        }
        field2401 = null;
        field2403 = null;
        field2390 = null;
        field2396 = null;
        field2379 = null;
        field2376 = null;
        field2373 = null;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "([I[IIZI)V")
    public final void method804(int[] arg0, int[] arg1, int arg2, boolean arg3, int arg4) {
        field2384++;
        if (arg1 == null) {
            arg1 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class78.field1801; var7++) {
                    class18 var8 = class63.method477(var7, (byte) -117);
                    if (var8 != null && !var8.field347 && (arg3 ? 7 : 0) + var6 == var8.field361) {
                        arg1[class55.field1249[var6]] = var7 + 256;
                        break;
                    }
                }
            }
        }
        this.field2407 = arg3;
        this.field2385 = arg1;
        this.field2389 = arg0;
        this.field2380 = arg4;
        if (arg2 != 0) {
            method799(-28, 8, 98, -88, 94);
        }
        this.method800(true);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)V")
    public static final void method805(byte arg0) {
        field2404++;
        if (arg0 > -16 || (class86.field2021 != null || class38.field894 != null)) {
            return;
        }
        int var1 = class51.field1155;
        if (class96.field2267) {
            if (var1 != 1) {
                int var6 = class18.field360;
                int var7 = class142.field3292;
                if (var6 < class49.field1125 - 10 || var6 > class49.field1125 + class38.field892 + 10 || var7 < class65.field1394 - 10 || var7 > class65.field1394 + class128.field3088 + 10) {
                    class96.field2267 = false;
                    class14.method101(class38.field892, class65.field1394, class128.field3088, class49.field1125, (byte) -109);
                }
            }
            if (var1 != 1) {
                return;
            }
            int var8 = class49.field1125;
            int var9 = class38.field892;
            int var10 = class8.field142;
            int var11 = class146.field3379;
            int var12 = class65.field1394;
            int var13 = -1;
            for (int var14 = 0; var14 < class14.field274; var14++) {
                int var15 = var12 + (-var14 + class14.field274 + -1) * 15 + 31;
                if (var8 < var11 && var8 + var9 > var11 && var10 > var15 - 13 && var15 + 3 > var10) {
                    var13 = var14;
                }
            }
            if (var13 != -1) {
                class67.method496(var13, (byte) -48);
            }
            class96.field2267 = false;
            class14.method101(class38.field892, class65.field1394, class128.field3088, class49.field1125, (byte) -115);
            return;
        }
        if (var1 == 1 && class14.field274 > 0) {
            int var2 = class27.field600[class14.field274 - 1];
            if (var2 == 31 || var2 == 28 || var2 == 58 || var2 == 17 || var2 == 33 || var2 == 57 || var2 == 6 || var2 == 41 || var2 == 39 || var2 == 38 || var2 == 22 || var2 == 1002) {
                int var3 = class61.field1301[class14.field274 - 1];
                int var4 = class132.field3122[class14.field274 - 1];
                class74 var5 = class12.method82(var4, (byte) 108);
                if (class33.method291(class56.method444(var5, 0), -92) || class110.method869(-55, class56.method444(var5, 0))) {
                    class118.field2680 = false;
                    class151.field3448 = 0;
                    if (class86.field2021 != null) {
                        class145.method1173(class86.field2021, -4008);
                    }
                    class86.field2021 = class12.method82(var4, (byte) 108);
                    class5.field113 = var3;
                    class143.field3322 = class146.field3379;
                    class69.field1450 = class8.field142;
                    class145.method1173(class86.field2021, -4008);
                    return;
                }
            }
        }
        if (var1 == 1 && (class109.field2574 == 1 && class14.field274 > 2 || class141.method1150(class14.field274 - 1, -21224))) {
            var1 = 2;
        }
        if (var1 == 1 && class14.field274 > 0) {
            class67.method496(class14.field274 - 1, (byte) -48);
        }
        if (var1 == 2 && class14.field274 > 0) {
            class13.method94((byte) -95);
            return;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lke;I)Lke;")
    public static final class74 method806(class74 arg0, int arg1) {
        field2394++;
        int var2 = class53.method432(class56.method444(arg0, arg1), (byte) -47);
        if (var2 == 0) {
            return null;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            arg0 = class12.method82(arg0.field1628, (byte) 108);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZBI)V")
    public final void method807(boolean arg0, byte arg1, int arg2) {
        field2395++;
        if (arg2 == 1 && this.field2407) {
            return;
        }
        int var4 = this.field2385[class55.field1249[arg2]];
        if (var4 == 0) {
            return;
        }
        var4 -= 256;
        int var5 = -42 / ((arg1 - 6) / 33);
        class18 var6;
        do {
            if (arg0) {
                var4++;
                if (var4 >= class78.field1801) {
                    var4 = 0;
                }
            } else {
                var4--;
                if (var4 < 0) {
                    var4 = class78.field1801 - 1;
                }
            }
            var6 = class63.method477(var4, (byte) -9);
        } while (var6 == null || var6.field347 || (this.field2407 ? 7 : 0) + arg2 != var6.field361);
        this.field2385[class55.field1249[arg2]] = var4 + 256;
        this.method800(true);
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(B)I")
    public final int method808(byte arg0) {
        field2406++;
        int var2 = 81 % ((arg0 - 70) / 50);
        return this.field2380 == -1 ? (this.field2389[4] << 20) + (this.field2389[0] << 25) + (this.field2385[0] << 15) + (this.field2385[11] << 5) + (this.field2385[8] << 10) + this.field2385[1] : class139.method1136(this.field2380, 9).field2264 + 305419896;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZI)V")
    public final void method809(boolean arg0, int arg1) {
        field2381++;
        if (arg0 != this.field2407) {
            this.method804(this.field2389, null, 0, arg0, arg1);
        }
    }
}
