import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class109 {

    @OriginalMember(owner = "client!t", name = "g", descriptor = "I")
    private int field2359;

    @OriginalMember(owner = "client!t", name = "d", descriptor = "I")
    private int field2356;

    @OriginalMember(owner = "client!t", name = "k", descriptor = "[[I")
    private int[][] field2363;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "Lo;")
    public static class84 field2353 = class15.method124("Too many connections from your address)3", 255);

    @OriginalMember(owner = "client!t", name = "f", descriptor = "Lo;")
    public static class84 field2358 = class15.method124("(Y", 255);

    @OriginalMember(owner = "client!t", name = "j", descriptor = "Lqc;")
    public static class97 field2362 = new class97(260);

    @OriginalMember(owner = "client!t", name = "n", descriptor = "Lo;")
    public static class84 field2366 = class15.method124("glow1:", 255);

    @OriginalMember(owner = "client!t", name = "m", descriptor = "I")
    public static int field2365 = 0;

    @OriginalMember(owner = "client!t", name = "o", descriptor = "I")
    public static int field2367 = 0;

    @OriginalMember(owner = "client!t", name = "l", descriptor = "Lqc;")
    public static class97 field2364 = new class97(50);

    @OriginalMember(owner = "client!t", name = "s", descriptor = "Lo;")
    public static class84 field2371 = class15.method124("Please contact customer support)3", 255);

    @OriginalMember(owner = "client!t", name = "t", descriptor = "I")
    public static int field2372 = 0;

    @OriginalMember(owner = "client!t", name = "r", descriptor = "Lqc;")
    public static class97 field2370 = new class97(50);

    @OriginalMember(owner = "client!t", name = "v", descriptor = "Lqc;")
    public static class97 field2374 = new class97(50);

    @OriginalMember(owner = "client!t", name = "b", descriptor = "I")
    public static int field2354;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!t", name = "e", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!t", name = "h", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!t", name = "i", descriptor = "I")
    public static int field2361;

    @OriginalMember(owner = "client!t", name = "p", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!t", name = "q", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!t", name = "u", descriptor = "Li;")
    public static class48 field2373;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(BII[Lfb;[BII)V", line = 13)
    public static final void method846(byte arg0, int arg1, int arg2, class33[] arg3, byte[] arg4, int arg5, int arg6) {
        for (int var7 = 0; var7 < 4; var7++) {
            for (int var12 = 0; var12 < 64; var12++) {
                for (int var13 = 0; var13 < 64; var13++) {
                    if (arg5 + var12 > 0 && arg5 + var12 < 103 && arg1 + var13 > 0 && arg1 + var13 < 103) {
                        arg3[var7].field654[arg5 + var12][arg1 + var13] = class61.method486(arg3[var7].field654[arg5 + var12][arg1 + var13], -16777217);
                    }
                }
            }
        }
        if (arg0 > -100) {
            method847(107, -64, null, -27);
        }
        field2360++;
        class27 var8 = new class27(arg4);
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < 64; var10++) {
                for (int var11 = 0; var11 < 64; var11++) {
                    class67.method515(var11 + arg1, var9, 0, arg6, var8, arg2, (byte) 88, var10 + arg5);
                }
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IILvb;I)V", line = 82)
    public static final void method847(int arg0, int arg1, class121 arg2, int arg3) {
        field2361++;
        if (arg2 == null) {
            return;
        }
        int var4 = class79.field1680 + class103.field2176 & 0x7FF;
        int var5 = arg0 * arg0 + arg3 * arg3;
        if (arg1 != -21346) {
            field2358 = null;
        }
        if (var5 > 6400) {
            return;
        }
        int var6 = class83.field1857[var4];
        int var7 = var6 * 256 / (class17.field302 + 256);
        int var8 = class83.field1835[var4];
        int var9 = var8 * 256 / (class17.field302 + 256);
        int var10 = arg3 * var7 - arg0 * var9 >> 16;
        int var11 = arg0 * var7 + arg3 * var9 >> 16;
        if (var5 <= 2500) {
            arg2.method947(var11 + 94 + 4 - arg2.field2708 / 2, 83 - arg2.field2706 / 2 + -var10 + -4);
        } else {
            arg2.method945(class19.field371, var11 + 94 + 4 - arg2.field2708 / 2, -(arg2.field2706 / 2) + -4 + -var10 + 83);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(II)I", line = 117)
    public final int method848(int arg0, int arg1) {
        field2357++;
        if (arg1 < 119) {
            field2370 = null;
        }
        if (this.field2363 != null) {
            arg0 = this.field2359 * arg0 / this.field2356 + 7;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(II)I", line = 135)
    public final int method849(int arg0, int arg1) {
        field2354++;
        if (arg0 != 94) {
            this.method849(-92, 46);
        }
        if (this.field2363 != null) {
            arg1 = this.field2359 * arg1 / this.field2356;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V", line = 166)
    public static void method850(int arg0) {
        field2364 = null;
        field2358 = null;
        field2371 = null;
        field2366 = null;
        field2374 = null;
        if (arg0 != -27290) {
            method846((byte) -91, -84, 125, null, null, -13, -58);
        }
        field2362 = null;
        field2373 = null;
        field2353 = null;
        field2370 = null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I[B)[B", line = 193)
    public final byte[] method851(int arg0, byte[] arg1) {
        if (this.field2363 != null) {
            int var3 = arg1.length * this.field2359 / this.field2356 + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                int[] var10 = this.field2363[var5];
                byte var11 = arg1[var7];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var6 + var12] += var10[var12] * var11;
                }
                int var13 = this.field2359 + var5;
                int var14 = var13 / this.field2356;
                var6 += var14;
                var5 = var13 - this.field2356 * var14;
            }
            arg1 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg1[var8] = -128;
                } else if (var9 <= 127) {
                    arg1[var8] = (byte) var9;
                } else {
                    arg1[var8] = 127;
                }
            }
        }
        if (arg0 != -4) {
            this.method849(-16, -43);
        }
        field2368++;
        return arg1;
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(II)V", line = 277)
    public class109(int arg0, int arg1) {
        int var3 = class79.method581(arg1, (byte) 94, arg0);
        int var4 = arg1 / var3;
        this.field2359 = var4;
        int var5 = arg0 / var3;
        this.field2356 = var5;
        if (var4 != var5) {
            this.field2363 = new int[var5][14];
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field2363[var6];
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
                while (var11 > var10) {
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
}
