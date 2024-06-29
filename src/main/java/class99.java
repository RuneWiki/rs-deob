import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public abstract class class99 extends class56 {

    @OriginalMember(owner = "client!ob", name = "rb", descriptor = "I")
    public int field2412 = 0;

    @OriginalMember(owner = "client!ob", name = "vb", descriptor = "[[B")
    private byte[][] field2416 = new byte[256][];

    @OriginalMember(owner = "client!ob", name = "O", descriptor = "[I")
    private int[] field2384;

    @OriginalMember(owner = "client!ob", name = "wb", descriptor = "[I")
    private int[] field2417;

    @OriginalMember(owner = "client!ob", name = "tb", descriptor = "[I")
    private int[] field2414;

    @OriginalMember(owner = "client!ob", name = "M", descriptor = "[I")
    private int[] field2382;

    @OriginalMember(owner = "client!ob", name = "X", descriptor = "I")
    private int field2392;

    @OriginalMember(owner = "client!ob", name = "eb", descriptor = "I")
    private int field2399;

    @OriginalMember(owner = "client!ob", name = "S", descriptor = "Lv;")
    private static class146 field2388 = class159.method1226((byte) -37, "gt");

    @OriginalMember(owner = "client!ob", name = "N", descriptor = "Lv;")
    private static class146 field2383 = class159.method1226((byte) -37, ")4u");

    @OriginalMember(owner = "client!ob", name = "bb", descriptor = "Lv;")
    private static class146 field2396 = class159.method1226((byte) -37, "shad=");

    @OriginalMember(owner = "client!ob", name = "ab", descriptor = "Lv;")
    private static class146 field2395 = class159.method1226((byte) -37, "col=");

    @OriginalMember(owner = "client!ob", name = "jb", descriptor = "Lv;")
    private static class146 field2404 = class159.method1226((byte) -37, ")4str");

    @OriginalMember(owner = "client!ob", name = "W", descriptor = "I")
    private static int field2391 = 256;

    @OriginalMember(owner = "client!ob", name = "nb", descriptor = "Lv;")
    private static class146 field2408 = class159.method1226((byte) -37, ")4col");

    @OriginalMember(owner = "client!ob", name = "R", descriptor = "Lv;")
    private static class146 field2387 = class159.method1226((byte) -37, "u");

    @OriginalMember(owner = "client!ob", name = "ob", descriptor = "I")
    private static int field2409 = 0;

    @OriginalMember(owner = "client!ob", name = "T", descriptor = "Lv;")
    private static class146 field2389 = class159.method1226((byte) -37, ")4shad");

    @OriginalMember(owner = "client!ob", name = "mb", descriptor = "I")
    private static int field2407 = 0;

    @OriginalMember(owner = "client!ob", name = "pb", descriptor = "Lv;")
    private static class146 field2410 = class159.method1226((byte) -37, "str=");

    @OriginalMember(owner = "client!ob", name = "kb", descriptor = "I")
    private static int field2405 = -1;

    @OriginalMember(owner = "client!ob", name = "ib", descriptor = "I")
    private static int field2403 = -1;

    @OriginalMember(owner = "client!ob", name = "fb", descriptor = "Lv;")
    private static class146 field2400 = class159.method1226((byte) -37, "shad");

    @OriginalMember(owner = "client!ob", name = "db", descriptor = "Lv;")
    private static class146 field2398 = class159.method1226((byte) -37, "br");

    @OriginalMember(owner = "client!ob", name = "sb", descriptor = "Lv;")
    private static class146 field2413 = class159.method1226((byte) -37, "str");

    @OriginalMember(owner = "client!ob", name = "hb", descriptor = "I")
    private static int field2402 = -1;

    @OriginalMember(owner = "client!ob", name = "qb", descriptor = "Lv;")
    private static class146 field2411 = class159.method1226((byte) -37, "lt");

    @OriginalMember(owner = "client!ob", name = "gb", descriptor = "I")
    private static int field2401 = 0;

    @OriginalMember(owner = "client!ob", name = "lb", descriptor = "Lv;")
    private static class146 field2406 = class159.method1226((byte) -37, "img=");

    @OriginalMember(owner = "client!ob", name = "cb", descriptor = "Lv;")
    private static class146 field2397 = class159.method1226((byte) -37, "u=");

    @OriginalMember(owner = "client!ob", name = "Z", descriptor = "I")
    private static int field2394 = 0;

    @OriginalMember(owner = "client!ob", name = "ub", descriptor = "I")
    private static int field2415 = -1;

    @OriginalMember(owner = "client!ob", name = "V", descriptor = "Ljava/util/Random;")
    private static Random field2390 = new Random();

    @OriginalMember(owner = "client!ob", name = "xb", descriptor = "[Lv;")
    private static class146[] field2418 = new class146[100];

    @OriginalMember(owner = "client!ob", name = "Q", descriptor = "[B")
    private byte[] field2386;

    @OriginalMember(owner = "client!ob", name = "P", descriptor = "[I")
    private int[] field2385;

    @OriginalMember(owner = "client!ob", name = "Y", descriptor = "[Lue;")
    public static class144[] field2393;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lv;II[I[I)V")
    private final void method803(class146 arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field2412;
        int var7 = -1;
        int var8 = -1;
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.field3372; var10++) {
            int var11 = arg0.field3365[var10] & 0xFF;
            if (var11 == 60) {
                var7 = var10;
            } else {
                if (var11 == 62 && var7 != -1) {
                    class146 var12 = arg0.method1105(var10, 91, var7 + 1);
                    var7 = -1;
                    if (var12.method1107((byte) -125, field2411)) {
                        var11 = 60;
                    } else {
                        if (!var12.method1107((byte) -125, field2388)) {
                            if (var12.method1098(field2406, true)) {
                                try {
                                    int var13;
                                    if (arg3 == null) {
                                        var13 = 0;
                                    } else {
                                        var13 = arg3[var9];
                                    }
                                    int var14;
                                    if (arg4 == null) {
                                        var14 = 0;
                                    } else {
                                        var14 = arg4[var9];
                                    }
                                    var9++;
                                    int var15 = var12.method1103(true, 4).method1113(10);
                                    class144 var16 = field2393[var15];
                                    var16.method1065(arg1 + var13, this.field2412 + var6 - var16.field3285 + var14);
                                    arg1 += var16.field3281;
                                    var8 = -1;
                                } catch (Exception var22) {
                                }
                            } else {
                                this.method808(var12);
                            }
                            continue;
                        }
                        var11 = 62;
                    }
                }
                if (var7 == -1) {
                    if (this.field2386 != null && var8 != -1) {
                        arg1 += this.field2386[(var8 << 8) + var11];
                    }
                    int var17 = this.field2414[var11];
                    int var18 = this.field2382[var11];
                    int var19;
                    if (arg3 == null) {
                        var19 = 0;
                    } else {
                        var19 = arg3[var9];
                    }
                    int var20;
                    if (arg4 == null) {
                        var20 = 0;
                    } else {
                        var20 = arg4[var9];
                    }
                    var9++;
                    if (var11 == 32) {
                        if (field2401 > 0) {
                            field2394 += field2401;
                            arg1 += field2394 >> 8;
                            field2394 &= 0xFF;
                        }
                    } else if (field2391 == 256) {
                        if (field2403 != -1) {
                            method818(this.field2416[var11], this.field2384[var11] + arg1 + var19 + 1, this.field2417[var11] + var6 + 1 + var20, var17, var18, field2403);
                        }
                        this.method673(this.field2416[var11], this.field2384[var11] + arg1 + var19, this.field2417[var11] + var6 + var20, var17, var18, field2407);
                    } else {
                        if (field2403 != -1) {
                            method828(this.field2416[var11], this.field2384[var11] + arg1 + var19 + 1, this.field2417[var11] + var6 + 1 + var20, var17, var18, field2403, field2391);
                        }
                        this.method674(this.field2416[var11], this.field2384[var11] + arg1 + var19, this.field2417[var11] + var6 + var20, var17, var18, field2407, field2391);
                    }
                    int var21 = this.field2385[var11];
                    if (field2415 != -1) {
                        class56.method392(arg1, (int) ((double) this.field2412 * 0.7D) + var6, var21, field2415);
                    }
                    if (field2402 != -1) {
                        class56.method392(arg1, this.field2412 + var6, var21, field2402);
                    }
                    arg1 += var21;
                    var8 = var11;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "([I[BIIIIIII)V")
    public static final void method804(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = -(arg5 >> 2);
        int var10 = -(arg5 & 0x3);
        for (int var11 = -arg6; var11 < 0; var11++) {
            for (int var12 = var9; var12 < 0; var12++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
            }
            for (int var13 = var10; var13 < 0; var13++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lv;II)V")
    private final void method805(class146 arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field2412;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.field3372; var7++) {
            int var8 = arg0.field3365[var7] & 0xFF;
            if (var8 == 60) {
                var5 = var7;
            } else {
                if (var8 == 62 && var5 != -1) {
                    class146 var9 = arg0.method1105(var7, -102, var5 + 1);
                    var5 = -1;
                    if (var9.method1107((byte) -126, field2411)) {
                        var8 = 60;
                    } else {
                        if (!var9.method1107((byte) -79, field2388)) {
                            if (var9.method1098(field2406, true)) {
                                try {
                                    int var10 = var9.method1103(true, 4).method1113(10);
                                    class144 var11 = field2393[var10];
                                    var11.method1065(arg1, this.field2412 + var4 - var11.field3285);
                                    arg1 += var11.field3281;
                                    var6 = -1;
                                } catch (Exception var15) {
                                }
                            } else {
                                this.method808(var9);
                            }
                            continue;
                        }
                        var8 = 62;
                    }
                }
                if (var5 == -1) {
                    if (this.field2386 != null && var6 != -1) {
                        arg1 += this.field2386[(var6 << 8) + var8];
                    }
                    int var12 = this.field2414[var8];
                    int var13 = this.field2382[var8];
                    if (var8 == 32) {
                        if (field2401 > 0) {
                            field2394 += field2401;
                            arg1 += field2394 >> 8;
                            field2394 &= 0xFF;
                        }
                    } else if (field2391 == 256) {
                        if (field2403 != -1) {
                            method818(this.field2416[var8], this.field2384[var8] + arg1 + 1, this.field2417[var8] + var4 + 1, var12, var13, field2403);
                        }
                        this.method673(this.field2416[var8], this.field2384[var8] + arg1, this.field2417[var8] + var4, var12, var13, field2407);
                    } else {
                        if (field2403 != -1) {
                            method828(this.field2416[var8], this.field2384[var8] + arg1 + 1, this.field2417[var8] + var4 + 1, var12, var13, field2403, field2391);
                        }
                        this.method674(this.field2416[var8], this.field2384[var8] + arg1, this.field2417[var8] + var4, var12, var13, field2407, field2391);
                    }
                    int var14 = this.field2385[var8];
                    if (field2415 != -1) {
                        class56.method392(arg1, (int) ((double) this.field2412 * 0.7D) + var4, var14, field2415);
                    }
                    if (field2402 != -1) {
                        class56.method392(arg1, this.field2412 + var4 + 1, var14, field2402);
                    }
                    arg1 += var14;
                    var6 = var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lv;IIII)V")
    public final void method806(class146 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method816(arg3, arg4);
            this.method805(arg0, arg1 - this.method811(arg0) / 2, arg2);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "([[B[[B[I[I[III)I")
    private static final int method807(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
        int var7 = arg2[arg5];
        int var8 = arg4[arg5] + var7;
        int var9 = arg2[arg6];
        int var10 = arg4[arg6] + var9;
        int var11 = var7;
        if (var9 > var7) {
            var11 = var9;
        }
        int var12 = var8;
        if (var10 < var8) {
            var12 = var10;
        }
        int var13 = arg3[arg5];
        if (arg3[arg6] < var13) {
            var13 = arg3[arg6];
        }
        byte[] var14 = arg1[arg5];
        byte[] var15 = arg0[arg6];
        int var16 = var11 - var7;
        int var17 = var11 - var9;
        for (int var18 = var11; var18 < var12; var18++) {
            int var19 = var14[var16++] + var15[var17++];
            if (var19 < var13) {
                var13 = var19;
            }
        }
        return -var13;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "([BIIIIII)V")
    public abstract void method674(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lv;)V")
    private final void method808(class146 arg0) {
        try {
            if (arg0.method1098(field2395, true)) {
                field2407 = arg0.method1103(true, 4).method1079(-49, 16);
                return;
            }
            if (arg0.method1107((byte) -104, field2408)) {
                field2407 = field2409;
                return;
            }
            if (arg0.method1098(field2410, true)) {
                field2415 = arg0.method1103(true, 4).method1079(-49, 16);
                return;
            }
            if (arg0.method1107((byte) -106, field2413)) {
                field2415 = 8388608;
                return;
            }
            if (arg0.method1107((byte) -91, field2404)) {
                field2415 = -1;
                return;
            }
            if (arg0.method1098(field2397, true)) {
                field2402 = arg0.method1103(true, 2).method1079(-49, 16);
                return;
            }
            if (arg0.method1107((byte) -126, field2387)) {
                field2402 = 0;
                return;
            }
            if (arg0.method1107((byte) -110, field2383)) {
                field2402 = -1;
                return;
            }
            if (arg0.method1098(field2396, true)) {
                field2403 = arg0.method1103(true, 5).method1079(-49, 16);
                return;
            }
            if (arg0.method1107((byte) -80, field2400)) {
                field2403 = 0;
                return;
            }
            if (arg0.method1107((byte) -115, field2389)) {
                field2403 = field2405;
                return;
            }
            if (arg0.method1107((byte) -87, field2398)) {
                this.method816(field2409, field2405);
                return;
            }
        } catch (Exception var2) {
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lv;IIIII)V")
    public final void method809(class146 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method816(arg3, arg4);
        int[] var7 = new int[arg0.field3372];
        for (int var8 = 0; var8 < arg0.field3372; var8++) {
            var7[var8] = (int) (Math.sin((double) arg5 / 5.0D + (double) var8 / 2.0D) * 5.0D);
        }
        this.method803(arg0, arg1 - this.method811(arg0) / 2, arg2, null, var7);
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(Lv;IIIII)V")
    public final void method810(class146 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method816(arg3, arg4);
        field2390.setSeed((long) arg5);
        field2391 = (field2390.nextInt() & 0x1F) + 192;
        int[] var7 = new int[arg0.field3372];
        int var8 = 0;
        for (int var9 = 0; var9 < arg0.field3372; var9++) {
            var7[var9] = var8;
            if ((field2390.nextInt() & 0x3) == 0) {
                var8++;
            }
        }
        this.method803(arg0, arg1, arg2, var7, null);
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(Lv;)I")
    public final int method811(class146 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = -1;
        int var3 = -1;
        int var4 = 0;
        for (int var5 = 0; var5 < arg0.field3372; var5++) {
            int var6 = arg0.field3365[var5] & 0xFF;
            if (var6 == 60) {
                var2 = var5;
            } else {
                if (var6 == 62 && var2 != -1) {
                    class146 var7 = arg0.method1105(var5, -60, var2 + 1);
                    var2 = -1;
                    if (var7.method1107((byte) -92, field2411)) {
                        var6 = 60;
                    } else {
                        if (!var7.method1107((byte) -86, field2388)) {
                            if (var7.method1098(field2406, true)) {
                                try {
                                    int var8 = var7.method1103(true, 4).method1113(10);
                                    var4 += field2393[var8].field3281;
                                    var3 = -1;
                                } catch (Exception var9) {
                                }
                            }
                            continue;
                        }
                        var6 = 62;
                    }
                }
                if (var2 == -1) {
                    var4 += this.field2385[var6];
                    if (this.field2386 != null && var3 != -1) {
                        var4 += this.field2386[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lv;I)I")
    public final int method812(class146 arg0, int arg1) {
        return this.method819(arg0, new int[] { arg1 }, field2418);
    }

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "()V")
    public static void method813() {
        field2411 = null;
        field2388 = null;
        field2406 = null;
        field2398 = null;
        field2395 = null;
        field2408 = null;
        field2397 = null;
        field2387 = null;
        field2383 = null;
        field2396 = null;
        field2400 = null;
        field2389 = null;
        field2410 = null;
        field2413 = null;
        field2404 = null;
        field2393 = null;
        field2390 = null;
        field2418 = null;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "([B)V")
    private final void method814(byte[] arg0) {
        this.field2385 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field2385.length; var2++) {
                this.field2385[var2] = arg0[var2] & 0xFF;
            }
            this.field2412 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field2385[var4] = arg0[var3++] & 0xFF;
        }
        int[] var5 = new int[256];
        int[] var6 = new int[256];
        for (int var7 = 0; var7 < 256; var7++) {
            var5[var7] = arg0[var3++] & 0xFF;
        }
        for (int var8 = 0; var8 < 256; var8++) {
            var6[var8] = arg0[var3++] & 0xFF;
        }
        byte[][] var9 = new byte[256][];
        for (int var10 = 0; var10 < 256; var10++) {
            var9[var10] = new byte[var5[var10]];
            byte var17 = 0;
            for (int var18 = 0; var18 < var9[var10].length; var18++) {
                var17 += arg0[var3++];
                var9[var10][var18] = var17;
            }
        }
        byte[][] var11 = new byte[256][];
        for (int var12 = 0; var12 < 256; var12++) {
            var11[var12] = new byte[var5[var12]];
            byte var15 = 0;
            for (int var16 = 0; var16 < var11[var12].length; var16++) {
                var15 += arg0[var3++];
                var11[var12][var16] = var15;
            }
        }
        this.field2386 = new byte[65536];
        for (int var13 = 0; var13 < 256; var13++) {
            if (var13 != 32 && var13 != 160) {
                for (int var14 = 0; var14 < 256; var14++) {
                    if (var14 != 32 && var14 != 160) {
                        this.field2386[(var13 << 8) + var14] = (byte) method807(var9, var11, var6, this.field2385, var5, var13, var14);
                    }
                }
            }
        }
        this.field2412 = var5[32] + var6[32];
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lv;IIIIII)V")
    public final void method815(class146 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method816(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int[] var10 = new int[arg0.field3372];
        for (int var11 = 0; var11 < arg0.field3372; var11++) {
            var10[var11] = (int) (Math.sin((double) var11 / 1.5D + (double) arg5) * var8);
        }
        this.method803(arg0, arg1 - this.method811(arg0) / 2, arg2, null, var10);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)V")
    private final void method816(int arg0, int arg1) {
        field2415 = -1;
        field2402 = -1;
        field2405 = arg1;
        field2403 = arg1;
        field2409 = arg0;
        field2407 = arg0;
        field2391 = 256;
        field2401 = 0;
        field2394 = 0;
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(Lv;I)V")
    private final void method817(class146 arg0, int arg1) {
        int var3 = 0;
        boolean var4 = false;
        for (int var5 = 0; var5 < arg0.method1080(-1); var5++) {
            int var6 = arg0.method1089(79, var5);
            if (var6 == 60) {
                var4 = true;
            } else if (var6 == 62) {
                var4 = false;
            } else if (!var4 && var6 == 32) {
                var3++;
            }
        }
        if (var3 > 0) {
            field2401 = (arg1 - this.method811(arg0) << 8) / var3;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "([BIIIII)V")
    public abstract void method673(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "([BIIIII)V")
    private static final void method818(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = class56.field1265 * arg2 + arg1;
        int var7 = class56.field1265 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < class56.field1266) {
            int var10 = class56.field1266 - arg2;
            arg4 -= var10;
            arg2 = class56.field1266;
            var9 += arg3 * var10;
            var6 += class56.field1265 * var10;
        }
        if (arg2 + arg4 > class56.field1270) {
            arg4 -= arg2 + arg4 - class56.field1270;
        }
        if (arg1 < class56.field1268) {
            int var11 = class56.field1268 - arg1;
            arg3 -= var11;
            arg1 = class56.field1268;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > class56.field1267) {
            int var12 = arg1 + arg3 - class56.field1267;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method804(class56.field1269, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lv;[I[Lv;)I")
    private final int method819(class146 arg0, int[] arg1, class146[] arg2) {
        if (arg0 == null) {
            return 0;
        }
        int var4 = 0;
        int var5 = 0;
        class146 var6 = class64.method462(100, 0);
        int var7 = -1;
        int var8 = 0;
        byte var9 = 0;
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        int var13 = arg0.method1080(-1);
        for (int var14 = 0; var14 < var13; var14++) {
            int var15 = arg0.method1089(108, var14);
            if (var15 == 60) {
                var10 = var14;
            } else {
                if (var15 == 62 && var10 != -1) {
                    class146 var16 = arg0.method1105(var14, 100, var10 + 1);
                    var10 = -1;
                    var6.method1117((byte) -31, 60);
                    var6.method1085(var16, -1);
                    var6.method1117((byte) -31, 62);
                    if (var16.method1107((byte) -115, field2398)) {
                        arg2[var12++] = var6.method1105(var6.method1080(-1), -81, var5);
                        var5 = var6.method1080(-1);
                        var4 = 0;
                        var7 = -1;
                        var11 = -1;
                    } else if (var16.method1107((byte) -127, field2411)) {
                        var4 += this.method825(60);
                        if (this.field2386 != null && var11 != -1) {
                            var4 += this.field2386[(var11 << 8) + 60];
                        }
                        var11 = 60;
                    } else if (var16.method1107((byte) -87, field2388)) {
                        var4 += this.method825(62);
                        if (this.field2386 != null && var11 != -1) {
                            var4 += this.field2386[(var11 << 8) + 62];
                        }
                        var11 = 62;
                    } else if (var16.method1098(field2406, true)) {
                        try {
                            int var17 = var16.method1103(true, 4).method1113(10);
                            var4 += field2393[var17].field3281;
                            var11 = -1;
                        } catch (Exception var18) {
                        }
                    }
                    var15 = -1;
                }
                if (var10 == -1) {
                    if (var15 != -1) {
                        var6.method1117((byte) -31, var15);
                        var4 += this.method825(var15);
                        if (this.field2386 != null && var11 != -1) {
                            var4 += this.field2386[(var11 << 8) + var15];
                        }
                        var11 = var15;
                    }
                    if (var15 == 32) {
                        var7 = var6.method1080(-1);
                        var8 = var4;
                        var9 = 1;
                    }
                    if (arg1 != null && var4 > arg1[var12 < arg1.length ? var12 : arg1.length - 1] && var7 >= 0) {
                        arg2[var12++] = var6.method1105(var7 - var9, 127, var5);
                        var5 = var7;
                        var7 = -1;
                        var4 -= var8;
                        var11 = -1;
                    }
                    if (var15 == 45) {
                        var7 = var6.method1080(-1);
                        var8 = var4;
                        var9 = 0;
                    }
                }
            }
        }
        if (var6.method1080(-1) > var5) {
            arg2[var12++] = var6.method1105(var6.method1080(-1), -111, var5);
        }
        return var12;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lv;IIIIIIIII)I")
    public final int method820(class146 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return 0;
        }
        this.method816(arg5, arg6);
        if (arg9 == 0) {
            arg9 = this.field2412;
        }
        int[] var11 = new int[] { arg3 };
        if (arg4 < this.field2399 + this.field2392 + arg9 && arg4 < arg9 + arg9) {
            var11 = null;
        }
        int var12 = this.method819(arg0, var11, field2418);
        if (arg8 == 3 && var12 == 1) {
            arg8 = 1;
        }
        int var13;
        if (arg8 == 0) {
            var13 = this.field2392 + arg2;
        } else if (arg8 == 1) {
            var13 = (arg4 - this.field2392 - this.field2399 - (var12 - 1) * arg9) / 2 + this.field2392 + arg2;
        } else if (arg8 == 2) {
            var13 = arg2 + arg4 - this.field2399 - (var12 - 1) * arg9;
        } else {
            int var14 = (arg4 - this.field2392 - this.field2399 - (var12 - 1) * arg9) / (var12 + 1);
            if (var14 < 0) {
                var14 = 0;
            }
            var13 = this.field2392 + arg2 + var14;
            arg9 += var14;
        }
        for (int var15 = 0; var15 < var12; var15++) {
            if (arg7 == 0) {
                this.method805(field2418[var15], arg1, var13);
            } else if (arg7 == 1) {
                this.method805(field2418[var15], arg1 + (arg3 - this.method811(field2418[var15])) / 2, var13);
            } else if (arg7 == 2) {
                this.method805(field2418[var15], arg1 + arg3 - this.method811(field2418[var15]), var13);
            } else if (var12 - 1 == var15) {
                this.method805(field2418[var15], arg1, var13);
            } else {
                this.method817(field2418[var15], arg3);
                this.method805(field2418[var15], arg1, var13);
                field2401 = 0;
            }
            var13 += arg9;
        }
        return var12;
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(Lv;)Lv;")
    public static final class146 method821(class146 arg0) {
        int var1 = arg0.method1080(-1);
        int var2 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            byte var8 = arg0.field3365[var3];
            if (var8 == 60 || var8 == 62) {
                var2 += 3;
            }
        }
        class146 var4 = new class146();
        var4.field3372 = var1 + var2;
        var4.field3365 = new byte[var4.field3372];
        int var5 = 0;
        for (int var6 = 0; var6 < var1; var6++) {
            byte var7 = arg0.field3365[var6];
            if (var7 == 60) {
                var4.field3365[var5++] = 60;
                var4.field3365[var5++] = 108;
                var4.field3365[var5++] = 116;
                var4.field3365[var5++] = 62;
            } else if (var7 == 62) {
                var4.field3365[var5++] = 60;
                var4.field3365[var5++] = 103;
                var4.field3365[var5++] = 116;
                var4.field3365[var5++] = 62;
            } else {
                var4.field3365[var5++] = var7;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(Lv;I)I")
    public final int method822(class146 arg0, int arg1) {
        int var3 = this.method819(arg0, new int[] { arg1 }, field2418);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method811(field2418[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "([I[BIIIIIIII)V")
    public static final void method823(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = ((arg2 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((arg2 & 0xFF00) * arg9 & 0xFF0000) >> 8;
        int var11 = 256 - arg9;
        for (int var12 = -arg6; var12 < 0; var12++) {
            for (int var13 = -arg5; var13 < 0; var13++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    int var14 = arg0[arg4];
                    arg0[arg4++] = (((var14 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * var11 & 0xFF0000) >> 8) + var10;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(Lv;IIII)V")
    public final void method824(class146 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method816(arg3, arg4);
            this.method805(arg0, arg1 - this.method811(arg0), arg2);
        }
    }

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "(I)I")
    private final int method825(int arg0) {
        return this.field2385[arg0 & 0xFF];
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(Lv;IIIII)V")
    public final void method826(class146 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method816(arg3, arg4);
        int[] var7 = new int[arg0.field3372];
        int[] var8 = new int[arg0.field3372];
        for (int var9 = 0; var9 < arg0.field3372; var9++) {
            var7[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 5.0D) * 5.0D);
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 3.0D) * 5.0D);
        }
        this.method803(arg0, arg1 - this.method811(arg0) / 2, arg2, var7, var8);
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(Lv;IIII)V")
    public final void method827(class146 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method816(arg3, arg4);
            this.method805(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V")
    public class99(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field2384 = arg1;
        this.field2417 = arg2;
        this.field2414 = arg3;
        this.field2382 = arg4;
        this.method814(arg0);
        this.field2416 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field2417[var10] < var8 && this.field2382[var10] != 0) {
                var8 = this.field2417[var10];
            }
            if (this.field2417[var10] + this.field2382[var10] > var9) {
                var9 = this.field2417[var10] + this.field2382[var10];
            }
        }
        this.field2392 = this.field2412 - var8;
        this.field2399 = var9 - this.field2412;
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "([B)V")
    public class99(byte[] arg0) {
        this.method814(arg0);
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "([BIIIIII)V")
    private static final void method828(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = class56.field1265 * arg2 + arg1;
        int var8 = class56.field1265 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class56.field1266) {
            int var11 = class56.field1266 - arg2;
            arg4 -= var11;
            arg2 = class56.field1266;
            var10 += arg3 * var11;
            var7 += class56.field1265 * var11;
        }
        if (arg2 + arg4 > class56.field1270) {
            arg4 -= arg2 + arg4 - class56.field1270;
        }
        if (arg1 < class56.field1268) {
            int var12 = class56.field1268 - arg1;
            arg3 -= var12;
            arg1 = class56.field1268;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class56.field1267) {
            int var13 = arg1 + arg3 - class56.field1267;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method823(class56.field1269, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }
}
