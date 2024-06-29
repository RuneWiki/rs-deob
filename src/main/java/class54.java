import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class54 {

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "Lke;")
    public static class65 field1391 = class1.method17("-5berpr-Ufen Sie Ihr Mitteilungsfach)3", -124);

    @OriginalMember(owner = "client!ja", name = "z", descriptor = "Lke;")
    private static class65 field1397 = class1.method17("K", -114);

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "Lke;")
    public static class65 field1381 = field1397;

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "Lke;")
    public static class65 field1384 = field1397;

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "[B")
    public static byte[] field1383 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!ja", name = "u", descriptor = "I")
    public static int field1392 = 0;

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "I")
    public static int field1375;

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "I")
    public static int field1380;

    @OriginalMember(owner = "client!ja", name = "k", descriptor = "I")
    private int field1382;

    @OriginalMember(owner = "client!ja", name = "n", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!ja", name = "o", descriptor = "I")
    public static int field1386;

    @OriginalMember(owner = "client!ja", name = "q", descriptor = "I")
    public static int field1388;

    @OriginalMember(owner = "client!ja", name = "r", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!ja", name = "v", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!ja", name = "y", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!ja", name = "B", descriptor = "I")
    public static int field1399;

    @OriginalMember(owner = "client!ja", name = "p", descriptor = "J")
    private long field1387;

    @OriginalMember(owner = "client!ja", name = "s", descriptor = "J")
    public static long field1390;

    @OriginalMember(owner = "client!ja", name = "A", descriptor = "J")
    private long field1398;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "Lpa;")
    public static class90 field1372;

    @OriginalMember(owner = "client!ja", name = "x", descriptor = "Z")
    public boolean field1395;

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "[I")
    private int[] field1379;

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "[I")
    private int[] field1394;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Z)I", line = 6)
    public final int method429(boolean arg0) {
        if (arg0) {
            this.method433(null, false);
        }
        field1374++;
        return this.field1382 == -1 ? (this.field1394[8] << 10) + (this.field1394[11] << 5) + (this.field1379[4] << 20) + (this.field1394[0] << 15) + (this.field1379[0] << 25) + this.field1394[1] : class74.method654(this.field1382, 9).field1439 + 305419896;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V", line = 25)
    public static final void method430(int arg0) {
        if (arg0 != 7735) {
            method438(-60, -103, null, null);
        }
        field1378++;
        int var1 = class46.field1203 + class32.field833.field1067;
        int var2 = class10.field168 + class32.field833.field1070;
        if (class52.field1323 - var1 < -500 || class52.field1323 - var1 > 500 || class12.field255 - var2 < -500 || class12.field255 - var2 > 500) {
            class52.field1323 = var1;
            class12.field255 = var2;
        }
        int var3 = 0;
        if (class52.field1323 != var1) {
            class52.field1323 += (var1 - class52.field1323) / 16;
        }
        int var4 = class52.field1323 >> 7;
        if (class12.field255 != var2) {
            class12.field255 += (var2 - class12.field255) / 16;
        }
        int var5 = class12.field255 >> 7;
        if (class75.field2024[96]) {
            class101.field2639 += (-class101.field2639 - 24) / 2;
        } else if (class75.field2024[97]) {
            class101.field2639 += (24 - class101.field2639) / 2;
        } else {
            class101.field2639 /= 2;
        }
        if (class75.field2024[98]) {
            class17.field351 += (12 - class17.field351) / 2;
        } else if (class75.field2024[99]) {
            class17.field351 += (-class17.field351 - 12) / 2;
        } else {
            class17.field351 /= 2;
        }
        class128.field3098 += class17.field351 / 2;
        if (class128.field3098 < 128) {
            class128.field3098 = 128;
        }
        if (class128.field3098 > 383) {
            class128.field3098 = 383;
        }
        class125.field3031 = class101.field2639 / 2 + class125.field3031 & 0x7FF;
        int var6 = class58.method495(class12.field255, class52.field1323, true, class19.field462);
        if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
            for (int var7 = var4 - 4; var7 <= var4 + 4; var7++) {
                for (int var8 = var5 - 4; var8 <= var5 + 4; var8++) {
                    int var9 = class19.field462;
                    if (var9 < 3 && (class114.field2852[1][var7][var8] & 0x2) == 2) {
                        var9++;
                    }
                    int var10 = var6 - class24.field611[var9][var7][var8];
                    if (var10 > var3) {
                        var3 = var10;
                    }
                }
            }
        }
        int var11 = var3 * 192;
        if (var11 > 98048) {
            var11 = 98048;
        }
        if (var11 < 32768) {
            var11 = 32768;
        }
        if (class99.field2560 < var11) {
            class99.field2560 += (var11 - class99.field2560) / 24;
        } else if (var11 < class99.field2560) {
            class99.field2560 += (var11 - class99.field2560) / 80;
            return;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I[I[IZI)V", line = 136)
    public final void method431(int arg0, int[] arg1, int[] arg2, boolean arg3, int arg4) {
        if (arg1 == null) {
            arg1 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class101.field2636; var7++) {
                    class12 var8 = class62.method521(var7, 114);
                    if (var8 != null && !var8.field242 && var8.field243 == var6 + (arg3 ? 7 : 0)) {
                        arg1[class24.field612[var6]] = var7 + 256;
                        break;
                    }
                }
            }
        }
        this.field1395 = arg3;
        field1388++;
        this.field1394 = arg1;
        if (arg4 <= 67) {
            this.method442(-88, true, true);
        }
        this.field1379 = arg2;
        this.field1382 = arg0;
        this.method441(111);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)Lke;", line = 198)
    public static final class65 method432(int arg0, int arg1, int arg2) {
        field1373++;
        int var3 = arg0 - arg1;
        if (var3 < -9) {
            return class83.field2189;
        } else if (var3 < -6) {
            return class12.field238;
        } else if (var3 < -3) {
            return class76.field2041;
        } else if (var3 < 0) {
            return class87.field2320;
        } else if (var3 > 9) {
            return class48.field1261;
        } else if (var3 > 6) {
            return class53.field1340;
        } else if (var3 > 3) {
            return class1.field27;
        } else if (~var3 < arg2) {
            return class60.field1608;
        } else {
            return class50.field1267;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lg;Z)V", line = 237)
    public final void method433(class39 arg0, boolean arg1) {
        if (arg1) {
            return;
        }
        arg0.method305(arg1, this.field1395 ? 1 : 0);
        for (int var3 = 0; var3 < 7; var3++) {
            int var5 = this.field1394[class24.field612[var3]];
            if (var5 == 0) {
                arg0.method305(false, -1);
            } else {
                arg0.method305(arg1, var5 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method305(false, this.field1379[var4]);
        }
        field1396++;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Laa;ILaa;II)Lga;", line = 280)
    public final class37 method434(class1 arg0, int arg1, class1 arg2, int arg3, int arg4) {
        field1385++;
        if (this.field1382 != -1) {
            return class74.method654(this.field1382, 9).method450(arg1, arg0, arg3, -29898, arg2);
        }
        if (arg4 > -67) {
            this.method442(-105, false, false);
        }
        long var6 = this.field1387;
        int[] var8 = this.field1394;
        if (arg0 != null && (arg0.field11 >= 0 || arg0.field35 >= 0)) {
            var8 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var8[var9] = this.field1394[var9];
            }
            if (arg0.field11 >= 0) {
                var6 += arg0.field11 - this.field1394[5] << 8;
                var8[5] = arg0.field11;
            }
            if (arg0.field35 >= 0) {
                var6 += arg0.field35 - this.field1394[3] << 16;
                var8[3] = arg0.field35;
            }
        }
        class37 var10 = (class37) class98.field2530.method833((byte) -53, var6);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var20 = var8[var12];
                if (var20 >= 256 && var20 < 512 && !class62.method521(var20 - 256, 87).method71((byte) 102)) {
                    var11 = true;
                }
                if (var20 >= 512 && !class81.method715(false, var20 - 512).method458(-17315, this.field1395)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field1398 != -1L) {
                    var10 = (class37) class98.field2530.method833((byte) -53, this.field1398);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                class37[] var13 = new class37[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var17 = var8[var15];
                    if (var17 >= 256 && var17 < 512) {
                        class37 var18 = class62.method521(var17 - 256, 99).method69(0);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                    if (var17 >= 512) {
                        class37 var19 = class81.method715(false, var17 - 512).method465(this.field1395, true);
                        if (var19 != null) {
                            var13[var14++] = var19;
                        }
                    }
                }
                var10 = new class37(var13, var14);
                for (int var16 = 0; var16 < 5; var16++) {
                    if (this.field1379[var16] != 0) {
                        var10.method291(class72.field1894[var16][0], class72.field1894[var16][this.field1379[var16]]);
                        if (var16 == 1) {
                            var10.method291(class26.field636[0], class26.field636[this.field1379[var16]]);
                        }
                    }
                }
                var10.method268();
                var10.method287(64, 850, -30, -50, -30, true);
                class98.field2530.method836(var6, var10, true);
                this.field1398 = var6;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var10;
        }
        class37 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method5(var10, arg1, (byte) 24, arg3, arg2);
        } else if (arg0 == null) {
            var21 = arg2.method9(false, arg1, var10);
        } else {
            var21 = arg0.method9(false, arg3, var10);
        }
        return var21;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)Lda;", line = 450)
    public static final class19 method435(int arg0, int arg1) {
        field1380++;
        class19 var2 = (class19) class72.field1892.method833((byte) -53, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        if (arg0 != 32247) {
            field1384 = null;
        }
        byte[] var3 = class24.field604.method477(6, (byte) 127, arg1);
        class19 var4 = new class19();
        var4.field459 = arg1;
        if (var3 != null) {
            var4.method163(true, new class39(var3));
        }
        var4.method157((byte) 50);
        if (var4.field429) {
            var4.field465 = false;
            var4.field438 = false;
        }
        class72.field1892.method836((long) arg1, var4, true);
        return var4;
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(Z)Lga;", line = 482)
    public final class37 method436(boolean arg0) {
        field1376++;
        if (!arg0) {
            return null;
        } else if (this.field1382 == -1) {
            boolean var2 = false;
            for (int var3 = 0; var3 < 12; var3++) {
                int var12 = this.field1394[var3];
                if (var12 >= 256 && var12 < 512 && !class62.method521(var12 - 256, -16).method63(-4)) {
                    var2 = true;
                }
                if (var12 >= 512 && !class81.method715(!arg0, var12 - 512).method469(this.field1395, -5508)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class37[] var4 = new class37[12];
            int var5 = 0;
            for (int var6 = 0; var6 < 12; var6++) {
                int var9 = this.field1394[var6];
                if (var9 >= 256 && var9 < 512) {
                    class37 var10 = class62.method521(var9 - 256, -33).method64(!arg0);
                    if (var10 != null) {
                        var4[var5++] = var10;
                    }
                }
                if (var9 >= 512) {
                    class37 var11 = class81.method715(false, var9 - 512).method459(117, this.field1395);
                    if (var11 != null) {
                        var4[var5++] = var11;
                    }
                }
            }
            class37 var7 = new class37(var4, var5);
            for (int var8 = 0; var8 < 5; var8++) {
                if (this.field1379[var8] != 0) {
                    var7.method291(class72.field1894[var8][0], class72.field1894[var8][this.field1379[var8]]);
                    if (var8 == 1) {
                        var7.method291(class26.field636[0], class26.field636[this.field1379[var8]]);
                    }
                }
            }
            return var7;
        } else {
            return class74.method654(this.field1382, 9).method444(-68);
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)V", line = 588)
    public static void method437(byte arg0) {
        field1384 = null;
        field1381 = null;
        field1391 = null;
        if (arg0 < 90) {
            method438(2, 42, null, null);
        }
        field1372 = null;
        field1383 = null;
        field1397 = null;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IILta;Lld;)V", line = 604)
    public static final void method438(int arg0, int arg1, class112 arg2, class70 arg3) {
        field1377++;
        class81 var4 = new class81();
        var4.field2151 = arg3;
        var4.field2153 = 1;
        var4.field2145 = arg2;
        var4.field349 = arg0;
        class53 var5 = class51.field1292;
        synchronized (class51.field1292) {
            if (arg1 != 64) {
                method430(-117);
            }
            class51.field1292.method425(var4, arg1 ^ 0x50);
        }
        class100.method831(-1);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ZB)V", line = 632)
    public final void method439(boolean arg0, byte arg1) {
        int var3 = 70 % ((arg1 + 24) / 60);
        field1399++;
        if (this.field1395 != arg0) {
            this.method431(-1, null, this.field1379, arg0, 111);
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIZ)V", line = 656)
    public final void method440(int arg0, int arg1, boolean arg2) {
        field1393++;
        if (arg0 != 0) {
            return;
        }
        int var4 = this.field1379[arg1];
        if (arg2) {
            var4++;
            if (var4 >= class72.field1894[arg1].length) {
                var4 = 0;
            }
        } else {
            var4--;
            if (var4 < 0) {
                var4 = class72.field1894[arg1].length - 1;
            }
        }
        this.field1379[arg1] = var4;
        this.method441(arg0 ^ 0x6B);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)V", line = 685)
    private final void method441(int arg0) {
        field1386++;
        long var2 = this.field1387;
        int var4 = this.field1394[5];
        int var5 = this.field1394[9];
        this.field1394[5] = var5;
        this.field1394[9] = var4;
        this.field1387 = 0L;
        int var6 = 0;
        if (arg0 <= 60) {
            this.field1379 = null;
        }
        while (var6 < 12) {
            this.field1387 <<= 0x4;
            if (this.field1394[var6] >= 256) {
                this.field1387 += this.field1394[var6] - 256;
            }
            var6++;
        }
        if (this.field1394[0] >= 256) {
            this.field1387 += this.field1394[0] - 256 >> 4;
        }
        if (this.field1394[1] >= 256) {
            this.field1387 += this.field1394[1] - 256 >> 8;
        }
        for (int var7 = 0; var7 < 5; var7++) {
            this.field1387 <<= 0x3;
            this.field1387 += this.field1379[var7];
        }
        this.field1387 <<= 0x1;
        this.field1387 += this.field1395 ? 1 : 0;
        this.field1394[5] = var4;
        this.field1394[9] = var5;
        if (var2 != 0L && this.field1387 != var2) {
            class98.field2530.method832(var2, -1);
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IZZ)V", line = 748)
    public final void method442(int arg0, boolean arg1, boolean arg2) {
        field1389++;
        if (arg0 == 1 && this.field1395) {
            return;
        }
        int var4 = this.field1394[class24.field612[arg0]];
        if (var4 == 0) {
            return;
        }
        var4 -= 256;
        class12 var5;
        do {
            if (arg1) {
                var4++;
                if (class101.field2636 <= var4) {
                    var4 = 0;
                }
            } else {
                var4--;
                if (var4 < 0) {
                    var4 = class101.field2636 - 1;
                }
            }
            var5 = class62.method521(var4, 96);
        } while (var5 == null || var5.field242 || var5.field243 != (this.field1395 ? 7 : 0) + arg0);
        this.field1394[class24.field612[arg0]] = var4 + 256;
        if (arg2) {
            this.method442(51, true, false);
        }
        this.method441(62);
    }
}
