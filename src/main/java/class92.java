import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class92 {

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
    public static int field2344 = 99;

    @OriginalMember(owner = "client!pb", name = "r", descriptor = "I")
    public static int field2357 = 0;

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "Lv;")
    private static class122 field2348 = class55.method425(-87, "Please check your message)2centre for details)3");

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "Lv;")
    public static class122 field2355 = field2348;

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "Lv;")
    public static class122 field2350 = class55.method425(-62, "auf einer freien Welt zu spielen)3");

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "Lv;")
    private static class122 field2352 = class55.method425(-92, "Please remove ");

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "Lv;")
    public static class122 field2345 = field2352;

    @OriginalMember(owner = "client!pb", name = "q", descriptor = "Lv;")
    public static class122 field2356 = field2352;

    @OriginalMember(owner = "client!pb", name = "y", descriptor = "Lv;")
    public static class122 field2364 = class55.method425(-87, "Stufe)2");

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
    public static int field2346;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "I")
    public static int field2354;

    @OriginalMember(owner = "client!pb", name = "s", descriptor = "I")
    public static int field2358;

    @OriginalMember(owner = "client!pb", name = "t", descriptor = "I")
    public static int field2359;

    @OriginalMember(owner = "client!pb", name = "u", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!pb", name = "v", descriptor = "I")
    public static int field2361;

    @OriginalMember(owner = "client!pb", name = "w", descriptor = "I")
    private int field2362;

    @OriginalMember(owner = "client!pb", name = "x", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "J")
    private long field2353;

    @OriginalMember(owner = "client!pb", name = "z", descriptor = "J")
    private long field2365;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "Lvb;")
    public static class124 field2343;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "Z")
    public boolean field2341;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "[I")
    private int[] field2342;

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "[I")
    private int[] field2349;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIZ)V", line = 10)
    public final void method726(int arg0, int arg1, boolean arg2) {
        int var4 = this.field2349[arg1];
        field2354++;
        if (arg2) {
            var4++;
            if (var4 >= class26.field700[arg1].length) {
                var4 = 0;
            }
        } else {
            var4--;
            if (var4 < 0) {
                var4 = class26.field700[arg1].length - 1;
            }
        }
        if (arg0 != 0) {
            field2355 = null;
        }
        this.field2349[arg1] = var4;
        this.method734((byte) -37);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lkd;I)V", line = 43)
    public final void method727(class64 arg0, int arg1) {
        field2346++;
        int var3 = 69 / ((arg1 + 51) / 47);
        arg0.method523(255, this.field2341 ? 1 : 0);
        for (int var4 = 0; var4 < 7; var4++) {
            int var6 = this.field2342[class7.field164[var4]];
            if (var6 == 0) {
                arg0.method523(255, -1);
            } else {
                arg0.method523(255, var6 - 256);
            }
        }
        for (int var5 = 0; var5 < 5; var5++) {
            arg0.method523(255, this.field2349[var5]);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZI)V", line = 78)
    public final void method728(boolean arg0, int arg1) {
        if (arg1 != 19755) {
            field2364 = null;
        }
        field2361++;
        if (this.field2341 != arg0) {
            this.method735(this.field2349, null, true, arg0, -1);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IZI)V", line = 103)
    public final void method729(int arg0, boolean arg1, int arg2) {
        field2347++;
        if (arg0 == 1 && this.field2341) {
            return;
        }
        int var4 = this.field2342[class7.field164[arg0]];
        if (var4 == 0) {
            return;
        }
        var4 -= 256;
        class103 var5;
        do {
            if (arg1) {
                var4++;
                if (class43.field1145 <= var4) {
                    var4 = 0;
                }
            } else {
                var4--;
                if (var4 < 0) {
                    var4 = class43.field1145 - 1;
                }
            }
            var5 = class36.method318(var4, (byte) 92);
        } while (var5 == null || var5.field2567 || var5.field2571 != arg0 + (this.field2341 ? 7 : 0));
        this.field2342[class7.field164[arg0]] = var4 + 256;
        this.method734((byte) 114);
        if (arg2 != 103) {
            field2352 = null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIIIIII)V", line = 152)
    public static final void method730(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0 != 556131374) {
            field2356 = null;
        }
        field2363++;
        if (arg5 < 1 || arg4 < 1 || arg5 > 102 || arg4 > 102) {
            return;
        }
        if (class109.field2703 && class34.field848 != arg7) {
            return;
        }
        boolean var8 = true;
        int var9 = 0;
        if (arg1 == 0) {
            var9 = class90.field2306.method47(arg7, arg5, arg4);
        }
        if (arg1 == 1) {
            var9 = class90.field2306.method42(arg7, arg5, arg4);
        }
        boolean var10 = false;
        boolean var11 = false;
        if (arg1 == 2) {
            var9 = class90.field2306.method26(arg7, arg5, arg4);
        }
        if (arg1 == 3) {
            var9 = class90.field2306.method3(arg7, arg5, arg4);
        }
        if (var9 != 0) {
            int var12 = var9 >> 14 & 0x7FFF;
            int var13 = class90.field2306.method22(arg7, arg5, arg4, var9);
            int var14 = var13 >> 6 & 0x3;
            int var15 = var13 & 0x1F;
            if (arg1 == 0) {
                class90.field2306.method45(arg7, arg5, arg4);
                class42 var16 = class14.method124((byte) 52, var12);
                if (var16.field1102) {
                    class41.field1048[arg7].method154(arg4, false, var14, var16.field1075, var15, arg5);
                }
            }
            if (arg1 == 1) {
                class90.field2306.method41(arg7, arg5, arg4);
            }
            if (arg1 == 2) {
                class90.field2306.method7(arg7, arg5, arg4);
                class42 var17 = class14.method124((byte) 52, var12);
                if (var17.field1090 + arg5 > 103 || var17.field1090 + arg4 > 103 || var17.field1080 + arg5 > 103 || var17.field1080 + arg4 > 103) {
                    return;
                }
                if (var17.field1102) {
                    class41.field1048[arg7].method147(arg5, (byte) 46, var17.field1090, var14, var17.field1080, var17.field1075, arg4);
                }
            }
            if (arg1 == 3) {
                class90.field2306.method8(arg7, arg5, arg4);
                class42 var18 = class14.method124((byte) 52, var12);
                if (var18.field1102 && var18.field1083 == 1) {
                    class41.field1048[arg7].method148((byte) 26, arg5, arg4);
                }
            }
        }
        if (arg6 < 0) {
            return;
        }
        int var19 = arg7;
        if (arg7 < 3 && (class54.field1408[1][arg5][arg4] & 0x2) == 2) {
            var19 = arg7 + 1;
        }
        class10.method103(arg4, 100, arg6, arg2, var19, class41.field1048[arg7], class90.field2306, arg7, arg3, arg5);
        return;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)Llb;", line = 256)
    public final class68 method731(byte arg0) {
        field2340++;
        if (this.field2362 != -1) {
            return class109.method843(this.field2362, (byte) -31).method220(9329);
        }
        boolean var2 = false;
        for (int var3 = 0; var3 < 12; var3++) {
            int var13 = this.field2342[var3];
            if (var13 >= 256 && var13 < 512 && !class36.method318(var13 - 256, (byte) 109).method790((byte) 115)) {
                var2 = true;
            }
            if (var13 >= 512 && !class5.method69(var13 - 512, false).method95(0, this.field2341)) {
                var2 = true;
            }
        }
        if (var2) {
            return null;
        }
        class68[] var4 = new class68[12];
        int var5 = 0;
        int var6 = -16 / ((38 - arg0) / 56);
        for (int var7 = 0; var7 < 12; var7++) {
            int var10 = this.field2342[var7];
            if (var10 >= 256 && var10 < 512) {
                class68 var11 = class36.method318(var10 - 256, (byte) 108).method783((byte) 10);
                if (var11 != null) {
                    var4[var5++] = var11;
                }
            }
            if (var10 >= 512) {
                class68 var12 = class5.method69(var10 - 512, false).method98(28236, this.field2341);
                if (var12 != null) {
                    var4[var5++] = var12;
                }
            }
        }
        class68 var8 = new class68(var4, var5);
        for (int var9 = 0; var9 < 5; var9++) {
            if (this.field2349[var9] != 0) {
                var8.method560(class26.field700[var9][0], class26.field700[var9][this.field2349[var9]]);
                if (var9 == 1) {
                    var8.method560(class61.field1559[0], class61.field1559[this.field2349[var9]]);
                }
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Loe;ILoe;II)Llb;", line = 354)
    public final class68 method732(class89 arg0, int arg1, class89 arg2, int arg3, int arg4) {
        field2358++;
        if (this.field2362 != -1) {
            return class109.method843(this.field2362, (byte) -31).method225(arg2, 70, arg4, arg3, arg0);
        }
        int[] var6 = this.field2342;
        long var7 = this.field2365;
        if (arg2 != null && (arg2.field2280 >= 0 || arg2.field2296 >= 0)) {
            var6 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var6[var9] = this.field2342[var9];
            }
            if (arg2.field2280 >= 0) {
                var7 += arg2.field2280 - this.field2342[5] << 8;
                var6[5] = arg2.field2280;
            }
            if (arg2.field2296 >= 0) {
                var7 += arg2.field2296 - this.field2342[3] << 16;
                var6[3] = arg2.field2296;
            }
        }
        if (arg1 > -108) {
            this.method729(-42, false, 100);
        }
        class68 var10 = (class68) class109.field2694.method436(-69, var7);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var20 = var6[var12];
                if (var20 >= 256 && var20 < 512 && !class36.method318(var20 - 256, (byte) 105).method793(4)) {
                    var11 = true;
                }
                if (var20 >= 512 && !class5.method69(var20 - 512, false).method97(120, this.field2341)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field2353 != -1L) {
                    var10 = (class68) class109.field2694.method436(-64, this.field2353);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                class68[] var13 = new class68[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var17 = var6[var15];
                    if (var17 >= 256 && var17 < 512) {
                        class68 var18 = class36.method318(var17 - 256, (byte) 104).method788(-109);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                    if (var17 >= 512) {
                        class68 var19 = class5.method69(var17 - 512, false).method93(0, this.field2341);
                        if (var19 != null) {
                            var13[var14++] = var19;
                        }
                    }
                }
                var10 = new class68(var13, var14);
                for (int var16 = 0; var16 < 5; var16++) {
                    if (this.field2349[var16] != 0) {
                        var10.method560(class26.field700[var16][0], class26.field700[var16][this.field2349[var16]]);
                        if (var16 == 1) {
                            var10.method560(class61.field1559[0], class61.field1559[this.field2349[var16]]);
                        }
                    }
                }
                var10.method540();
                var10.method548(64, 850, -30, -50, -30, true);
                class109.field2694.method437(var7, var10, (byte) 69);
                this.field2353 = var7;
            }
        }
        if (arg2 == null && arg0 == null) {
            return var10;
        }
        class68 var21;
        if (arg2 != null && arg0 != null) {
            var21 = arg2.method707(arg4, arg3, arg0, var10, 9149);
        } else if (arg2 == null) {
            var21 = arg0.method710(var10, (byte) -125, arg3);
        } else {
            var21 = arg2.method710(var10, (byte) -119, arg4);
        }
        return var21;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)I", line = 523)
    public final int method733(int arg0) {
        if (arg0 > -78) {
            return -105;
        } else {
            field2360++;
            return this.field2362 == -1 ? (this.field2349[4] << 20) + (this.field2342[8] << 10) + (this.field2349[0] << 25) + (this.field2342[0] << 15) + (this.field2342[11] << 5) + this.field2342[1] : class109.method843(this.field2362, (byte) -31).field562 + 305419896;
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(B)V", line = 542)
    private final void method734(byte arg0) {
        int var2 = this.field2342[5];
        int var3 = this.field2342[9];
        long var4 = this.field2365;
        this.field2342[5] = var3;
        this.field2342[9] = var2;
        field2359++;
        this.field2365 = 0L;
        for (int var6 = 0; var6 < 12; var6++) {
            this.field2365 <<= 0x4;
            if (this.field2342[var6] >= 256) {
                this.field2365 += this.field2342[var6] - 256;
            }
        }
        int var7 = -112 / ((55 - arg0) / 57);
        if (this.field2342[0] >= 256) {
            this.field2365 += this.field2342[0] - 256 >> 4;
        }
        if (this.field2342[1] >= 256) {
            this.field2365 += this.field2342[1] - 256 >> 8;
        }
        for (int var8 = 0; var8 < 5; var8++) {
            this.field2365 <<= 0x3;
            this.field2365 += this.field2349[var8];
        }
        this.field2365 <<= 0x1;
        this.field2365 += this.field2341 ? 1 : 0;
        this.field2342[5] = var2;
        this.field2342[9] = var3;
        if (var4 != 0L && this.field2365 != var4) {
            class109.field2694.method431((byte) 10, var4);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "([I[IZZI)V", line = 610)
    public final void method735(int[] arg0, int[] arg1, boolean arg2, boolean arg3, int arg4) {
        field2351++;
        if (arg1 == null) {
            arg1 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class43.field1145; var7++) {
                    class103 var8 = class36.method318(var7, (byte) 119);
                    if (var8 != null && !var8.field2567 && var8.field2571 == (arg3 ? 7 : 0) + var6) {
                        arg1[class7.field164[var6]] = var7 + 256;
                        break;
                    }
                }
            }
        }
        this.field2362 = arg4;
        this.field2349 = arg0;
        if (arg2) {
            this.field2341 = arg3;
            this.field2342 = arg1;
            this.method734((byte) -89);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)V", line = 663)
    public static void method736(boolean arg0) {
        field2364 = null;
        field2356 = null;
        if (arg0) {
            field2355 = null;
        }
        field2352 = null;
        field2350 = null;
        field2343 = null;
        field2348 = null;
        field2355 = null;
        field2345 = null;
    }
}
