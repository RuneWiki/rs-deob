import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class116 {

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "Lai;")
    public static class10 field2219 = class44.method278(" steht bereits auf Ihrer Freunde)2Liste(Q", 127);

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "Lai;")
    public static class10 field2220 = class44.method278("<col=ff9040>", -128);

    @OriginalMember(owner = "client!mg", name = "p", descriptor = "Lai;")
    public static class10 field2230 = class44.method278("Cabbage", 105);

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "[I")
    public static int[] field2216 = new int[32];

    @OriginalMember(owner = "client!mg", name = "t", descriptor = "I")
    public static int field2234 = 0;

    @OriginalMember(owner = "client!mg", name = "u", descriptor = "[Lai;")
    public static class10[] field2235 = new class10[500];

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
    public static int field2215;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "I")
    public static int field2221;

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "I")
    public static int field2222;

    @OriginalMember(owner = "client!mg", name = "k", descriptor = "I")
    public static int field2225;

    @OriginalMember(owner = "client!mg", name = "l", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!mg", name = "n", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!mg", name = "o", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!mg", name = "r", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!mg", name = "s", descriptor = "I")
    private int field2233;

    @OriginalMember(owner = "client!mg", name = "v", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!mg", name = "w", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!mg", name = "x", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!mg", name = "y", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "J")
    private long field2217;

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "J")
    private long field2224;

    @OriginalMember(owner = "client!mg", name = "m", descriptor = "Ldb;")
    public static class32 field2227;

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "Z")
    public boolean field2223;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "[I")
    private int[] field2218;

    @OriginalMember(owner = "client!mg", name = "z", descriptor = "[I")
    private int[] field2240;

    @OriginalMember(owner = "client!mg", name = "q", descriptor = "[Lbf;")
    public static class17[] field2231;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ZII)V")
    public final void method820(boolean arg0, int arg1, int arg2) {
        field2221++;
        if (arg2 == 1 && this.field2223) {
            return;
        }
        int var4 = this.field2218[class144.field2753[arg2]];
        int var5 = -24 / ((66 - arg1) / 48);
        if (var4 == 0) {
            return;
        }
        var4 -= 256;
        class36 var6;
        do {
            if (arg0) {
                var4++;
                if (var4 >= class179.field3396) {
                    var4 = 0;
                }
            } else {
                var4--;
                if (var4 < 0) {
                    var4 = class179.field3396 - 1;
                }
            }
            var6 = class84.method511(-6053, var4);
        } while (var6 == null || var6.field565 || var6.field567 != (this.field2223 ? 7 : 0) + arg2);
        this.field2218[class144.field2753[arg2]] = var4 + 256;
        this.method822(125);
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(BIZ)V")
    public final void method821(byte arg0, int arg1, boolean arg2) {
        field2215++;
        if (arg0 <= 72) {
            return;
        }
        int var4 = this.field2240[arg1];
        if (arg2) {
            var4++;
            if (class24.field365[arg1].length <= var4) {
                var4 = 0;
            }
        } else {
            var4--;
            if (var4 < 0) {
                var4 = class24.field365[arg1].length - 1;
            }
        }
        this.field2240[arg1] = var4;
        this.method822(123);
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V")
    private final void method822(int arg0) {
        long var2 = this.field2224;
        field2222++;
        int var4 = this.field2218[5];
        int var5 = this.field2218[9];
        this.field2218[5] = var5;
        this.field2218[9] = var4;
        this.field2224 = 0L;
        for (int var6 = 0; var6 < 12; var6++) {
            this.field2224 <<= 0x4;
            if (this.field2218[var6] >= 256) {
                this.field2224 += this.field2218[var6] - 256;
            }
        }
        if (this.field2218[0] >= 256) {
            this.field2224 += this.field2218[0] - 256 >> 4;
        }
        if (this.field2218[1] >= 256) {
            this.field2224 += this.field2218[1] - 256 >> 8;
        }
        for (int var7 = 0; var7 < 5; var7++) {
            this.field2224 <<= 0x3;
            this.field2224 += this.field2240[var7];
        }
        this.field2218[5] = var4;
        this.field2224 <<= 0x1;
        this.field2218[9] = var5;
        this.field2224 += this.field2223 ? 1 : 0;
        if (arg0 <= 120) {
            method827(-20, -10, null);
        }
        if (var2 != 0L && this.field2224 != var2) {
            class192.field3651.method229(var2, 0);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ZB)V")
    public final void method823(boolean arg0, byte arg1) {
        field2239++;
        if (this.field2223 != arg0) {
            this.method824(-1, null, (byte) 57, this.field2240, arg0);
            int var3 = -105 % ((arg1 + 26) / 62);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I[IB[IZ)V")
    public final void method824(int arg0, int[] arg1, byte arg2, int[] arg3, boolean arg4) {
        field2236++;
        if (arg1 == null) {
            arg1 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class179.field3396; var7++) {
                    class36 var8 = class84.method511(-6053, var7);
                    if (var8 != null && !var8.field565 && var6 + (arg4 ? 7 : 0) == var8.field567) {
                        arg1[class144.field2753[var6]] = var7 + 256;
                        break;
                    }
                }
            }
        }
        if (arg2 != 57) {
            method827(-122, -126, null);
        }
        this.field2218 = arg1;
        this.field2223 = arg4;
        this.field2233 = arg0;
        this.field2240 = arg3;
        this.method822(arg2 + 64);
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lic;Lic;ZII)Lsa;")
    public final class164 method825(class77 arg0, class77 arg1, boolean arg2, int arg3, int arg4) {
        field2226++;
        if (this.field2233 != -1) {
            return class129.method900((byte) 56, this.field2233).method1207(arg0, arg3, 78, arg1, arg4);
        }
        if (arg2) {
            this.field2223 = false;
        }
        long var6 = this.field2224;
        int[] var8 = this.field2218;
        if (arg1 != null && (arg1.field1338 >= 0 || arg1.field1354 >= 0)) {
            var8 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var8[var9] = this.field2218[var9];
            }
            if (arg1.field1338 >= 0) {
                var6 += arg1.field1338 - this.field2218[5] << 8;
                var8[5] = arg1.field1338;
            }
            if (arg1.field1354 >= 0) {
                var6 += arg1.field1354 - this.field2218[3] << 16;
                var8[3] = arg1.field1354;
            }
        }
        class164 var10 = (class164) class192.field3651.method222(116, var6);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var21 = var8[var12];
                if (var21 >= 256 && var21 < 512 && !class84.method511(-6053, var21 - 256).method243((byte) 115)) {
                    var11 = true;
                }
                if (var21 >= 512 && !class104.method678(500, var21 - 512).method626((byte) -119, this.field2223)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field2217 != -1L) {
                    var10 = (class164) class192.field3651.method222(-25, this.field2217);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                class112[] var13 = new class112[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var18 = var8[var15];
                    if (var18 >= 256 && var18 < 512) {
                        class112 var19 = class84.method511(-6053, var18 - 256).method244(0);
                        if (var19 != null) {
                            var13[var14++] = var19;
                        }
                    }
                    if (var18 >= 512) {
                        class112 var20 = class104.method678(500, var18 - 512).method624(this.field2223, (byte) 116);
                        if (var20 != null) {
                            var13[var14++] = var20;
                        }
                    }
                }
                class112 var16 = new class112(var13, var14);
                for (int var17 = 0; var17 < 5; var17++) {
                    if (class24.field365[var17].length > this.field2240[var17]) {
                        var16.method736(class93.field1681[var17], class24.field365[var17][this.field2240[var17]]);
                    }
                    if (this.field2240[var17] < class171.field3318[var17].length) {
                        var16.method736(class183.field3482[var17], class171.field3318[var17][this.field2240[var17]]);
                    }
                }
                var10 = var16.method734(64, 850, -30, -50, -30, true, true);
                class192.field3651.method225(-21284, var6, var10);
                this.field2217 = var6;
            }
        }
        if (arg1 == null && arg0 == null) {
            return var10;
        }
        class164 var22;
        if (arg1 != null && arg0 != null) {
            var22 = arg1.method475(var10, arg0, arg4, 4, arg3);
        } else if (arg1 == null) {
            var22 = arg0.method476((byte) -34, var10, arg4);
        } else {
            var22 = arg1.method476((byte) -34, var10, arg3);
        }
        return var22;
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)V")
    public static void method826(int arg0) {
        field2235 = null;
        field2216 = null;
        field2230 = null;
        field2219 = null;
        field2231 = null;
        if (arg0 < -5) {
            field2227 = null;
            field2220 = null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IILh;)V")
    public static final void method827(int arg0, int arg1, class65 arg2) {
        if (arg2.field1121 > class120.field2304) {
            method830(arg2, 14575);
        } else if (class120.field2304 <= arg2.field1127) {
            class165.method1096((byte) 40, arg2);
        } else {
            class42.method266(-15108, arg2);
        }
        field2238++;
        if (arg1 != 256) {
            return;
        }
        if (arg2.field1100 < 128 || arg2.field1097 < 128 || arg2.field1100 >= 13184 || arg2.field1097 >= 13184) {
            arg2.field1141 = -1;
            arg2.field1097 = arg2.field1106[0] * 128 + arg2.field1126 * 64;
            arg2.field1127 = 0;
            arg2.field1081 = -1;
            arg2.field1121 = 0;
            arg2.field1100 = arg2.field1099[0] * 128 + arg2.field1126 * 64;
            arg2.method430((byte) 0);
        }
        if (class145.field2767 == arg2 && (arg2.field1100 < 1536 || arg2.field1097 < 1536 || arg2.field1100 >= 11776 || arg2.field1097 >= 11776)) {
            arg2.field1097 = arg2.field1106[0] * 128 + arg2.field1126 * 64;
            arg2.field1121 = 0;
            arg2.field1127 = 0;
            arg2.field1100 = arg2.field1099[0] * 128 + arg2.field1126 * 64;
            arg2.field1141 = -1;
            arg2.field1081 = -1;
            arg2.method430((byte) -15);
        }
        class15.method91(arg2, -80);
        class33.method218(9345, arg2);
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIBI)Z")
    public static final boolean method828(int arg0, int arg1, byte arg2, int arg3) {
        field2228++;
        int var4 = class36.field560.method588(class42.field687, arg3, arg0, arg1);
        int var5 = arg1 >> 14 & 0x7FFF;
        if (var4 == -1) {
            return false;
        }
        int var6 = var4 & 0x1F;
        int var7 = var4 >> 6 & 0x3;
        if (var6 == 10 || var6 == 11 || var6 == 22) {
            class47 var8 = class184.method1189(var5, 6);
            int var9;
            int var10;
            if (var7 == 0 || var7 == 2) {
                var9 = var8.field792;
                var10 = var8.field804;
            } else {
                var9 = var8.field804;
                var10 = var8.field792;
            }
            int var11 = var8.field831;
            if (var7 != 0) {
                var11 = (var11 >> 4 - var7) + (var11 << var7 & 0xF);
            }
            class84.method514(arg3, 1, 0, var10, arg0, var9, 2, 0, class145.field2767.field1099[0], var11, class145.field2767.field1106[0], true);
        } else {
            class84.method514(arg3, 1, var7, 0, arg0, 0, 2, var6 + 1, class145.field2767.field1099[0], 0, class145.field2767.field1106[0], true);
        }
        class83.field1451 = 0;
        if (arg2 <= 88) {
            return true;
        } else {
            class95.field1754 = class5.field58;
            class126.field2400 = 2;
            class21.field323 = class172.field3330;
            return true;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lme;I)V")
    public final void method829(class114 arg0, int arg1) {
        arg0.method781(0, this.field2223 ? 1 : 0);
        field2237++;
        if (arg1 > -73) {
            return;
        }
        for (int var3 = 0; var3 < 7; var3++) {
            int var5 = this.field2218[class144.field2753[var3]];
            if (var5 == 0) {
                arg0.method781(0, -1);
            } else {
                arg0.method781(0, var5 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method781(0, this.field2240[var4]);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lh;I)V")
    private static final void method830(class65 arg0, int arg1) {
        field2229++;
        if (arg0.field1122 == 0) {
            arg0.field1108 = 1024;
        }
        int var2 = arg0.field1121 - class120.field2304;
        arg0.field1114 = 0;
        if (arg1 != 14575) {
            method826(38);
        }
        if (arg0.field1122 == 1) {
            arg0.field1108 = 1536;
        }
        if (arg0.field1122 == 2) {
            arg0.field1108 = 0;
        }
        if (arg0.field1122 == 3) {
            arg0.field1108 = 512;
        }
        int var3 = arg0.field1096 * 128 + arg0.field1126 * 64;
        arg0.field1100 += (var3 - arg0.field1100) / var2;
        int var4 = arg0.field1126 * 64 + arg0.field1090 * 128;
        arg0.field1097 += (var4 - arg0.field1097) / var2;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IILic;)Lsa;")
    public final class164 method831(int arg0, int arg1, class77 arg2) {
        field2232++;
        if (this.field2233 != -1) {
            return class129.method900((byte) 56, this.field2233).method1205(126, arg2, arg0);
        }
        if (arg1 != -513) {
            field2227 = null;
        }
        class164 var4 = (class164) class104.field1939.method222(115, this.field2224);
        if (var4 == null) {
            boolean var5 = false;
            for (int var6 = 0; var6 < 12; var6++) {
                int var15 = this.field2218[var6];
                if (var15 >= 256 && var15 < 512 && !class84.method511(-6053, var15 - 256).method246(-30173)) {
                    var5 = true;
                }
                if (var15 >= 512 && !class104.method678(arg1 + 1013, var15 - 512).method614(82, this.field2223)) {
                    var5 = true;
                }
            }
            if (var5) {
                return null;
            }
            class112[] var7 = new class112[12];
            int var8 = 0;
            for (int var9 = 0; var9 < 12; var9++) {
                int var12 = this.field2218[var9];
                if (var12 >= 256 && var12 < 512) {
                    class112 var13 = class84.method511(-6053, var12 - 256).method241(false);
                    if (var13 != null) {
                        var7[var8++] = var13;
                    }
                }
                if (var12 >= 512) {
                    class112 var14 = class104.method678(arg1 ^ 0xFFFFFC0B, var12 - 512).method627(arg1 - 10794, this.field2223);
                    if (var14 != null) {
                        var7[var8++] = var14;
                    }
                }
            }
            class112 var10 = new class112(var7, var8);
            for (int var11 = 0; var11 < 5; var11++) {
                if (this.field2240[var11] < class24.field365[var11].length) {
                    var10.method736(class93.field1681[var11], class24.field365[var11][this.field2240[var11]]);
                }
                if (class171.field3318[var11].length > this.field2240[var11]) {
                    var10.method736(class183.field3482[var11], class171.field3318[var11][this.field2240[var11]]);
                }
            }
            var4 = var10.method734(64, 768, -50, -10, -50, true, true);
            class104.field1939.method225(arg1 ^ 0x5123, this.field2224, var4);
        }
        if (arg2 != null) {
            var4 = arg2.method477((byte) -102, var4, arg0);
        }
        return var4;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)I")
    public final int method832(byte arg0) {
        field2225++;
        int var2 = -61 % ((arg0 - 33) / 38);
        return this.field2233 == -1 ? (this.field2240[0] << 25) + (this.field2240[4] << 20) + (this.field2218[0] << 15) + (this.field2218[11] << 5) + (this.field2218[8] << 10) + this.field2218[1] : class129.method900((byte) 56, this.field2233).field3595 + 305419896;
    }
}
