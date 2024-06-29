import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class112 {

    @OriginalMember(owner = "client!tb", name = "r", descriptor = "Lec;")
    public static class28 field2408 = class28.method210(-46, "Side panel redrawn");

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "Lec;")
    public static class28 field2395 = class28.method210(-46, "backright2");

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "Lec;")
    public static class28 field2405 = class28.method210(-46, "redstone1");

    @OriginalMember(owner = "client!tb", name = "B", descriptor = "I")
    public static int field2418 = 0;

    @OriginalMember(owner = "client!tb", name = "A", descriptor = "Lec;")
    public static class28 field2417 = class28.method210(-46, "Login attempts exceeded)3");

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "Lud;")
    public static class119 field2401 = new class119(new byte[5000]);

    @OriginalMember(owner = "client!tb", name = "D", descriptor = "I")
    public static int field2420 = 0;

    @OriginalMember(owner = "client!tb", name = "F", descriptor = "Z")
    public static boolean field2422 = false;

    @OriginalMember(owner = "client!tb", name = "E", descriptor = "Lec;")
    public static class28 field2421 = class28.method210(-46, "@gre@");

    @OriginalMember(owner = "client!tb", name = "G", descriptor = "I")
    public static volatile int field2423 = -1;

    @OriginalMember(owner = "client!tb", name = "H", descriptor = "Lec;")
    public static class28 field2424 = class28.method210(-46, "@cya@");

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
    public static int field2391;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "I")
    public static int field2398;

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "I")
    public static int field2400;

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "I")
    private int field2402;

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!tb", name = "q", descriptor = "I")
    public static int field2407;

    @OriginalMember(owner = "client!tb", name = "t", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!tb", name = "u", descriptor = "I")
    public static int field2411;

    @OriginalMember(owner = "client!tb", name = "v", descriptor = "I")
    public static int field2412;

    @OriginalMember(owner = "client!tb", name = "y", descriptor = "I")
    public static int field2415;

    @OriginalMember(owner = "client!tb", name = "z", descriptor = "I")
    public static int field2416;

    @OriginalMember(owner = "client!tb", name = "s", descriptor = "J")
    private long field2409;

    @OriginalMember(owner = "client!tb", name = "x", descriptor = "J")
    private long field2414;

    @OriginalMember(owner = "client!tb", name = "C", descriptor = "Lce;")
    public static class18 field2419;

    @OriginalMember(owner = "client!tb", name = "w", descriptor = "Z")
    public boolean field2413;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "[I")
    private int[] field2392;

    @OriginalMember(owner = "client!tb", name = "p", descriptor = "[I")
    private int[] field2406;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)I")
    public final int method810(byte arg0) {
        int var2 = 20 / ((-arg0 - 71) / 38);
        field2391++;
        return this.field2402 == -1 ? (this.field2406[0] << 15) + (this.field2406[8] << 10) + (this.field2406[11] << 5) + this.field2406[1] + (this.field2392[0] << 25) + (this.field2392[4] << 20) : class8.method42(this.field2402, 102).field2258 + 305419896;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IZI)V")
    public final void method811(int arg0, boolean arg1, int arg2) {
        field2400++;
        if (arg0 == 1 && this.field2413) {
            return;
        }
        int var4 = this.field2406[class48.field1099[arg0]];
        if (var4 == 0) {
            return;
        }
        var4 -= 256;
        class21 var5;
        do {
            if (arg1) {
                var4++;
                if (var4 >= class8.field146) {
                    var4 = 0;
                }
            } else {
                var4--;
                if (var4 < 0) {
                    var4 = class8.field146 - 1;
                }
            }
            var5 = class63.method510(var4, (byte) -94);
        } while (var5 == null || var5.field456 || var5.field473 != arg0 + (this.field2413 ? 7 : 0));
        if (arg2 != 0) {
            this.method810((byte) -111);
        }
        this.field2406[class48.field1099[arg0]] = var4 + 256;
        this.method812(false);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Z)V")
    private final void method812(boolean arg0) {
        field2416++;
        long var2 = this.field2409;
        int var4 = this.field2406[9];
        int var5 = this.field2406[5];
        this.field2406[5] = var4;
        this.field2406[9] = var5;
        this.field2409 = 0L;
        for (int var6 = 0; var6 < 12; var6++) {
            this.field2409 <<= 0x4;
            if (this.field2406[var6] >= 256) {
                this.field2409 += this.field2406[var6] - 256;
            }
        }
        if (this.field2406[0] >= 256) {
            this.field2409 += this.field2406[0] - 256 >> 4;
        }
        if (arg0) {
            this.method810((byte) 73);
        }
        if (this.field2406[1] >= 256) {
            this.field2409 += this.field2406[1] - 256 >> 8;
        }
        for (int var7 = 0; var7 < 5; var7++) {
            this.field2409 <<= 0x3;
            this.field2409 += this.field2392[var7];
        }
        this.field2409 <<= 0x1;
        this.field2409 += this.field2413 ? 1 : 0;
        this.field2406[5] = var5;
        this.field2406[9] = var4;
        if (var2 != 0L && this.field2409 != var2) {
            class72.field1593.method665(var2, (byte) 78);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IZ)V")
    public final void method813(int arg0, boolean arg1) {
        field2399++;
        if (this.field2413 != arg1) {
            this.method815(null, arg0, arg1, -30417, this.field2392);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILc;IILc;)Lfb;")
    public final class33 method814(int arg0, class13 arg1, int arg2, int arg3, class13 arg4) {
        field2393++;
        if (this.field2402 != -1) {
            return class8.method42(this.field2402, 109).method734(arg3, arg1, arg2, arg4, (byte) 127);
        }
        int[] var6 = this.field2406;
        if (arg0 != 3582) {
            return null;
        }
        long var7 = this.field2409;
        if (arg1 != null && (arg1.field221 >= 0 || arg1.field216 >= 0)) {
            var6 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var6[var9] = this.field2406[var9];
            }
            if (arg1.field221 >= 0) {
                var7 += arg1.field221 - this.field2406[5] << 8;
                var6[5] = arg1.field221;
            }
            if (arg1.field216 >= 0) {
                var7 += arg1.field216 - this.field2406[3] << 16;
                var6[3] = arg1.field216;
            }
        }
        class33 var10 = (class33) class72.field1593.method660(arg0 ^ 0xFFFFF200, var7);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var20 = var6[var12];
                if (var20 >= 256 && var20 < 512 && !class63.method510(var20 - 256, (byte) -55).method148(24752)) {
                    var11 = true;
                }
                if (var20 >= 512 && !class129.method992(var20 - 512, -63).method984(this.field2413, arg0 + 22801)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field2414 != -1L) {
                    var10 = (class33) class72.field1593.method660(-2, this.field2414);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                class33[] var13 = new class33[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var17 = var6[var15];
                    if (var17 >= 256 && var17 < 512) {
                        class33 var18 = class63.method510(var17 - 256, (byte) 58).method141(124);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                    if (var17 >= 512) {
                        class33 var19 = class129.method992(var17 - 512, -48).method982(116, this.field2413);
                        if (var19 != null) {
                            var13[var14++] = var19;
                        }
                    }
                }
                var10 = new class33(var13, var14);
                for (int var16 = 0; var16 < 5; var16++) {
                    if (this.field2392[var16] != 0) {
                        var10.method270(class123.field2670[var16][0], class123.field2670[var16][this.field2392[var16]]);
                        if (var16 == 1) {
                            var10.method270(class12.field201[0], class12.field201[this.field2392[var16]]);
                        }
                    }
                }
                var10.method277();
                var10.method282(64, 850, -30, -50, -30, true);
                class72.field1593.method666(false, var10, var7);
                this.field2414 = var7;
            }
        }
        if (arg1 == null && arg4 == null) {
            return var10;
        }
        class33 var21;
        if (arg1 != null && arg4 != null) {
            var21 = arg1.method74(arg4, var10, arg2, arg3, 708184976);
        } else if (arg1 == null) {
            var21 = arg4.method68((byte) -128, var10, arg2);
        } else {
            var21 = arg1.method68((byte) -128, var10, arg3);
        }
        return var21;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "([IIZI[I)V")
    public final void method815(int[] arg0, int arg1, boolean arg2, int arg3, int[] arg4) {
        field2394++;
        if (arg3 != -30417) {
            this.method816(-23, null);
        }
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class8.field146; var7++) {
                    class21 var8 = class63.method510(var7, (byte) -55);
                    if (var8 != null && !var8.field456 && var8.field473 == (arg2 ? 7 : 0) + var6) {
                        arg0[class48.field1099[var6]] = var7 + 256;
                        break;
                    }
                }
            }
        }
        this.field2413 = arg2;
        this.field2406 = arg0;
        this.field2392 = arg4;
        this.field2402 = arg1;
        this.method812(false);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILud;)V")
    public final void method816(int arg0, class119 arg1) {
        arg1.method888(this.field2413 ? 1 : 0, arg0 - 28322);
        for (int var3 = 0; var3 < 7; var3++) {
            int var5 = this.field2406[class48.field1099[var3]];
            if (var5 == 0) {
                arg1.method888(-1, 106);
            } else {
                arg1.method888(var5 - 256, -121);
            }
        }
        int var4 = 0;
        if (arg0 != 28222) {
            this.field2413 = false;
        }
        while (var4 < 5) {
            arg1.method888(this.field2392[var4], arg0 - 28337);
            var4++;
        }
        field2398++;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)Lfb;")
    public final class33 method817(int arg0) {
        field2412++;
        if (this.field2402 != -1) {
            return class8.method42(this.field2402, arg0 - 387).method733((byte) 30);
        }
        boolean var2 = false;
        for (int var3 = 0; var3 < 12; var3++) {
            int var12 = this.field2406[var3];
            if (var12 >= 256 && var12 < 512 && !class63.method510(var12 - 256, (byte) 122).method151((byte) 90)) {
                var2 = true;
            }
            if (var12 >= 512 && !class129.method992(var12 - 512, -77).method993(127, this.field2413)) {
                var2 = true;
            }
        }
        if (arg0 != 512) {
            this.field2406 = null;
        }
        if (var2) {
            return null;
        }
        class33[] var4 = new class33[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var9 = this.field2406[var6];
            if (var9 >= 256 && var9 < 512) {
                class33 var10 = class63.method510(var9 - 256, (byte) 52).method147(113);
                if (var10 != null) {
                    var4[var5++] = var10;
                }
            }
            if (var9 >= 512) {
                class33 var11 = class129.method992(var9 - 512, -30).method991(true, this.field2413);
                if (var11 != null) {
                    var4[var5++] = var11;
                }
            }
        }
        class33 var7 = new class33(var4, var5);
        for (int var8 = 0; var8 < 5; var8++) {
            if (this.field2392[var8] != 0) {
                var7.method270(class123.field2670[var8][0], class123.field2670[var8][this.field2392[var8]]);
                if (var8 == 1) {
                    var7.method270(class12.field201[0], class12.field201[this.field2392[var8]]);
                }
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZIZ)V")
    public final void method818(boolean arg0, int arg1, boolean arg2) {
        field2397++;
        int var4 = this.field2392[arg1];
        if (arg0) {
            var4++;
            if (var4 >= class123.field2670[arg1].length) {
                var4 = 0;
            }
        } else {
            var4--;
            if (var4 < 0) {
                var4 = class123.field2670[arg1].length - 1;
            }
        }
        if (!arg2) {
            field2423 = 116;
        }
        this.field2392[arg1] = var4;
        this.method812(false);
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(B)V")
    public static void method819(byte arg0) {
        field2421 = null;
        field2417 = null;
        field2401 = null;
        field2424 = null;
        field2419 = null;
        if (arg0 >= -1) {
            method821(true);
        }
        field2395 = null;
        field2405 = null;
        field2408 = null;
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)Lea;")
    public static final class26 method820(int arg0) {
        field2410++;
        class26 var1 = new class26();
        var1.field564 = class72.field1613;
        var1.field566 = class106.field2250;
        var1.field569 = class61.field1365[arg0];
        var1.field567 = class25.field552[0];
        var1.field568 = class118.field2514[0];
        var1.field565 = class62.field1382[0];
        int var2 = var1.field568 * var1.field565;
        byte[] var3 = class123.field2682[0];
        var1.field563 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var1.field563[var4] = class53.field1219[class106.method732(255, var3[var4])];
        }
        class51.method409(arg0 ^ 0xFFFFFFA2);
        return var1;
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(Z)V")
    public static final void method821(boolean arg0) {
        if (arg0) {
            method821(true);
        }
        field2396++;
        if (class110.field2314 == 2) {
            class127.method972(true, (class88.field1946 - class18.field366 << 7) + class72.field1615, field2420 * 2, (class34.field767 - class87.field1934 << 7) + client.field399);
            if (class20.field434 > -1 && class83.field1888 % 20 < 10) {
                class114.field2443[0].method188(class20.field434 - 12, class57.field1308 - 28);
            }
        }
    }
}
