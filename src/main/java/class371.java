import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class371 extends class206 {

    @OriginalMember(owner = "client!rb", name = "o", descriptor = "Lkd;")
    private class296 field5654;

    @OriginalMember(owner = "client!rb", name = "t", descriptor = "Luf;")
    private class471 field5669;

    @OriginalMember(owner = "client!rb", name = "x", descriptor = "Lim;")
    private class597 field5662;

    @OriginalMember(owner = "client!rb", name = "G", descriptor = "I")
    private int field5670;

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "I")
    private int field5659;

    @OriginalMember(owner = "client!rb", name = "E", descriptor = "I")
    private int field5658;

    @OriginalMember(owner = "client!rb", name = "F", descriptor = "I")
    private int field5651;

    @OriginalMember(owner = "client!rb", name = "A", descriptor = "[[F")
    private float[][] field5661;

    @OriginalMember(owner = "client!rb", name = "w", descriptor = "[[F")
    private float[][] field5656;

    @OriginalMember(owner = "client!rb", name = "s", descriptor = "[[F")
    private float[][] field5653;

    @OriginalMember(owner = "client!rb", name = "y", descriptor = "I")
    private int field5649;

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "Lqha;")
    private class112 field5650;

    @OriginalMember(owner = "client!rb", name = "m", descriptor = "Lje;")
    private class421 field5668;

    @OriginalMember(owner = "client!rb", name = "C", descriptor = "Ljaclib/memory/Stream;")
    private Stream field5665;

    @OriginalMember(owner = "client!rb", name = "D", descriptor = "Ljaclib/memory/Stream;")
    private Stream field5657;

    @OriginalMember(owner = "client!rb", name = "r", descriptor = "Lsfa;")
    private class723 field5652;

    @OriginalMember(owner = "client!rb", name = "v", descriptor = "I")
    private int field5647;

    @OriginalMember(owner = "client!rb", name = "H", descriptor = "[Ljava/lang/String;")
    private static final String[] field5671 = new String[] { method2997(method2996("o\u0004XE")), method2997(method2996("z_\u001a\u0007@")), method2997(method2996("s\u0013\u001a\u0015To\u0018@\u0017\u0015")), method2997(method2996("s\u0013\u001ah\u0015")), method2997(method2996("s\u0013\u001al\u0015")), method2997(method2996("s\u0013\u001ak\u0015")), method2997(method2996("s\u0013\u001aj\u0015")), method2997(method2996("s\u0013\u001am\u0015")) };

    @OriginalMember(owner = "client!rb", name = "B", descriptor = "F")
    public static float field5664;

    @OriginalMember(owner = "client!rb", name = "q", descriptor = "I")
    public static int field5655;

    @OriginalMember(owner = "client!rb", name = "u", descriptor = "I")
    public static int field5660;

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "I")
    public static int field5663;

    @OriginalMember(owner = "client!rb", name = "z", descriptor = "I")
    public static int field5666;

    @OriginalMember(owner = "client!rb", name = "n", descriptor = "I")
    public static int field5667;

    @OriginalMember(owner = "client!rb", name = "p", descriptor = "Lmja;")
    public static class440 field5648;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(B)V", line = 6)
    public static void method2991(byte arg0) {
        try {
            if (arg0 < 57) {
                method2993((byte) 74);
            }
            field5648 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field5671[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IS)V", line = 17)
    private final void method2992(int arg0, short arg1) {
        try {
            if (Stream.method5102()) {
                this.field5657.method5100(arg1);
            } else {
                this.field5657.method5108(arg1);
            }
            if (arg0 == 29336) {
                field5660++;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field5671[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)V", line = 32)
    public static final void method2993(byte arg0) {
        try {
            field5667++;
            if (arg0 != -52) {
                method2993((byte) -104);
            }
            for (class326 var1 = (class326) class115.field1368.method3863((byte) 64); var1 != null; var1 = (class326) class115.field1368.method3862(-353)) {
                class367.method2972(false, var1, (byte) -60);
            }
            for (class326 var2 = (class326) class403.field6017.method3863((byte) 64); var2 != null; var2 = (class326) class403.field6017.method3862(-353)) {
                class367.method2972(true, var2, (byte) -70);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field5671[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIIIII)V", line = 75)
    private final void method2994(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            field5663++;
            long var8 = -1L;
            int var10 = arg5 + (arg1 << this.field5662.field4341);
            int var11 = (arg3 << this.field5662.field4341) + arg6;
            int var12 = this.field5662.method2404((byte) 124, var10, var11);
            if ((arg5 & 0x7F) == 0 || (arg6 & 0x7F) == 0) {
                var8 = (long) var11 << 16 & 0xFFFFL << 16 | (long) var10 & 0xFFFFL;
                class206 var13 = this.field5650.method977(var8, arg0 - 254);
                if (var13 != null) {
                    this.method2992(29336, ((class695) var13).field10142);
                    return;
                }
            }
            short var14 = (short) (this.field5647++);
            if (var8 != -1L) {
                this.field5650.method968((byte) -111, var8, new class695(var14));
            }
            float var15;
            float var16;
            float var17;
            if (arg5 == 0 && arg6 == 0) {
                var15 = this.field5661[arg4][arg2];
                var16 = this.field5653[arg4][arg2];
                var17 = this.field5656[arg4][arg2];
            } else if (this.field5662.field4340 == arg5 && arg6 == 0) {
                var17 = this.field5656[arg4 + 1][arg2];
                var16 = this.field5653[arg4 + 1][arg2];
                var15 = this.field5661[arg4 + 1][arg2];
            } else if (this.field5662.field4340 == arg5 && this.field5662.field4340 == arg6) {
                var17 = this.field5656[arg4 + 1][arg2 + 1];
                var15 = this.field5661[arg4 + 1][arg2 + 1];
                var16 = this.field5653[arg4 + 1][arg2 + 1];
            } else if (arg5 == 0 && this.field5662.field4340 == arg6) {
                var16 = this.field5653[arg4][arg2 + 1];
                var15 = this.field5661[arg4][arg2 + 1];
                var17 = this.field5656[arg4][arg2 + 1];
            } else {
                float var18 = (float) arg5 / (float) this.field5662.field4340;
                float var19 = (float) arg6 / (float) this.field5662.field4340;
                float var20 = this.field5661[arg4][arg2];
                float var21 = this.field5653[arg4][arg2];
                float var22 = this.field5656[arg4][arg2];
                float var23 = this.field5661[arg4 + 1][arg2];
                float var24 = this.field5653[arg4 + 1][arg2];
                float var25 = this.field5656[arg4 + 1][arg2];
                float var26 = (this.field5656[arg4][arg2 + 1] - var22) * var18 + var22;
                float var27 = (this.field5653[arg4][arg2 + 1] - var21) * var18 + var21;
                float var28 = (this.field5661[arg4 + 1][arg2 + 1] - var23) * var18 + var23;
                float var29 = (this.field5661[arg4][arg2 + 1] - var20) * var18 + var20;
                float var30 = (this.field5653[arg4 + 1][arg2 + 1] - var24) * var18 + var24;
                var15 = (var28 - var29) * var19 + var29;
                var16 = (var30 - var27) * var19 + var27;
                float var31 = (this.field5656[arg4 + 1][arg2 + 1] - var25) * var18 + var25;
                var17 = (var31 - var26) * var19 + var26;
            }
            float var32 = (float) (this.field5669.method3577(-32630) - var10);
            float var33 = (float) (this.field5669.method3581(arg0 - 336) - var12);
            float var34 = (float) (this.field5669.method3580((byte) -126) - var11);
            float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
            float var36 = 1.0F / var35;
            float var37 = var33 * var36;
            float var38 = var32 * var36;
            float var39 = var34 * var36;
            float var40 = var35 / (float) this.field5669.method3579((byte) 125);
            float var41 = 1.0F - var40 * var40;
            if (var41 < 0.0F) {
                var41 = 0.0F;
            }
            float var42 = var17 * var39 + var15 * var38 + var16 * var37;
            if (var42 < 0.0F) {
                var42 = 0.0F;
            }
            float var43 = var41 * var42 * 2.0F;
            if (var43 > 1.0F) {
                var43 = 1.0F;
            }
            int var44 = this.field5669.method3578(-110);
            int var45 = (int) ((float) (var44 >> 16 & 0xFF) * var43);
            if (var45 > 255) {
                var45 = 255;
            }
            int var46 = (int) ((float) ((var44 & 0xFFB7) >> 8) * var43);
            if (var46 > 255) {
                var46 = 255;
            }
            int var47 = (int) ((float) (var44 & 0xFF) * var43);
            if (Stream.method5102()) {
                this.field5665.method5112((float) var10);
                this.field5665.method5112((float) var12);
                this.field5665.method5112((float) var11);
            } else {
                this.field5665.method5105((float) var10);
                this.field5665.method5105((float) var12);
                this.field5665.method5105((float) var11);
            }
            if (var47 > 255) {
                var47 = 255;
            }
            if (this.field5654.field4595 == 0) {
                this.field5665.method5106(var47);
                this.field5665.method5106(var46);
                this.field5665.method5106(var45);
            } else {
                this.field5665.method5106(var45);
                this.field5665.method5106(var46);
                this.field5665.method5106(var47);
            }
            this.field5665.method5106(arg0);
            this.method2992(29336, var14);
        } catch (RuntimeException var49) {
            throw class759.method5498(var49, field5671[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIZI[[Z)V", line = 248)
    public final void method2995(int arg0, int arg1, boolean arg2, int arg3, boolean[][] arg4) {
        try {
            field5666++;
            if (this.field5668 != null && arg0 + arg3 >= this.field5670 && this.field5659 >= arg0 - arg3 && this.field5658 <= arg1 + arg3) {
                if (arg2) {
                    method2991((byte) -25);
                }
                if (arg1 - arg3 <= this.field5651) {
                    for (int var6 = this.field5658; var6 <= this.field5651; var6++) {
                        for (int var7 = this.field5670; var7 <= this.field5659; var7++) {
                            int var8 = var7 - arg0;
                            int var9 = var6 - arg1;
                            if ((-arg3) < var8 && arg3 > var8 && var9 > (-arg3) && arg3 > var9 && arg4[var8 + arg3][arg3 + var9]) {
                                this.field5654.method2446((byte) ((int) (this.field5669.method3576((byte) -102) * 255.0F)), (byte) -65);
                                this.field5654.method856(0, this.field5652, true);
                                this.field5654.method868(false, this.field5654.field4665);
                                this.field5654.method877(this.field5647, this.field5668, 0, 0, class769.field11134, this.field5649 / 3, (byte) -89);
                                return;
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException var11) {
            throw class759.method5498(var11, field5671[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? field5671[0] : field5671[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Lkd;Lim;Luf;[I)V", line = 307)
    public class371(class296 arg0, class597 arg1, class471 arg2, int[] arg3) {
        try {
            this.field5654 = arg0;
            this.field5669 = arg2;
            this.field5662 = arg1;
            int var5 = this.field5669.method3579((byte) 126) - (arg1.field4340 >> 1);
            this.field5670 = this.field5669.method3577(-32630) - var5 >> arg1.field4341;
            this.field5659 = this.field5669.method3577(-32630) + var5 >> arg1.field4341;
            this.field5658 = this.field5669.method3580((byte) 46) - var5 >> arg1.field4341;
            this.field5651 = var5 + this.field5669.method3580((byte) -126) >> arg1.field4341;
            int var6 = this.field5659 + 1 - this.field5670;
            int var7 = this.field5651 + 1 - this.field5658;
            this.field5661 = new float[var6 + 1][var7 + 1];
            this.field5656 = new float[var6 + 1][var7 + 1];
            this.field5653 = new float[var6 + 1][var7 + 1];
            for (int var8 = 0; var8 <= var7; var8++) {
                int var9 = this.field5658 + var8;
                if (var9 > 0 && this.field5662.field4336 - 1 > var9) {
                    for (int var10 = 0; var10 <= var6; var10++) {
                        int var11 = this.field5670 + var10;
                        if (var11 > 0 && var11 < this.field5662.field4337 - 1) {
                            int var12 = arg1.method2407(var9, var11 + 1, 82) - arg1.method2407(var9, var11 - 1, 44);
                            int var13 = arg1.method2407(var9 + 1, var11, -101) - arg1.method2407(var9 - 1, var11, 86);
                            float var14 = (float) (1.0D / Math.sqrt((double) (var12 * var12 - (-(var13 * var13) - 65536))));
                            this.field5661[var10][var8] = (float) var12 * var14;
                            this.field5653[var10][var8] = var14 * -256.0F;
                            this.field5656[var10][var8] = (float) var13 * var14;
                        }
                    }
                }
            }
            int var15 = 0;
            for (int var16 = this.field5658; var16 <= this.field5651; var16++) {
                if (var16 >= 0 && arg1.field4336 > var16) {
                    for (int var17 = this.field5670; var17 <= this.field5659; var17++) {
                        if (var17 >= 0 && arg1.field4337 > var17) {
                            int var18 = arg3[var15];
                            int[] var19 = arg1.field8751[var17][var16];
                            if (var19 != null && var18 != 0) {
                                if (var18 == 1) {
                                    int var20 = 0;
                                    while (var20 < var19.length) {
                                        if (var19[var20++] != -1 && var19[var20++] != -1 && var19[var20++] != -1) {
                                            this.field5649 += 3;
                                        }
                                    }
                                } else {
                                    this.field5649 += 3;
                                }
                            }
                        }
                        var15++;
                    }
                } else {
                    var15 += this.field5659 - this.field5670;
                }
            }
            if (this.field5649 > 0) {
                this.field5650 = new class112(class12.method83((byte) -1, this.field5649));
                this.field5668 = this.field5654.method899(13, false);
                this.field5668.method24(this.field5649, -10749);
                NativeHeapBuffer var21 = this.field5654.method2421(false, this.field5649 * 16, 82);
                this.field5665 = new Stream(var21);
                while (true) {
                    Buffer var22;
                    do {
                        var22 = this.field5668.method3256(true, (byte) -116);
                    } while (var22 == null);
                    this.field5657 = new Stream(var22);
                    int var23 = 0;
                    int var24 = 0;
                    for (int var25 = this.field5658; var25 <= this.field5651; var25++) {
                        if (var25 >= 0 && arg1.field4336 > var25) {
                            int var26 = 0;
                            for (int var27 = this.field5670; var27 <= this.field5659; var27++) {
                                if (var27 >= 0 && var27 < arg1.field4337) {
                                    int var28 = arg3[var23];
                                    int[] var29 = arg1.field8751[var27][var25];
                                    if (var29 != null && var28 != 0) {
                                        if (var28 == 1) {
                                            int[] var30 = arg1.field8765[var27][var25];
                                            int[] var31 = arg1.field8771[var27][var25];
                                            int var32 = 0;
                                            label178: while (true) {
                                                while (true) {
                                                    if (var32 >= var29.length) {
                                                        break label178;
                                                    }
                                                    if (var29[var32] == -1 || var29[var32 + 1] == -1 || var29[var32 + 2] == -1) {
                                                        var32 += 3;
                                                    } else {
                                                        this.method2994(255, var27, var24, var25, var26, var30[var32], var31[var32]);
                                                        var32++;
                                                        this.method2994(255, var27, var24, var25, var26, var30[var32], var31[var32]);
                                                        var32++;
                                                        this.method2994(255, var27, var24, var25, var26, var30[var32], var31[var32]);
                                                        var32++;
                                                    }
                                                }
                                            }
                                        } else if (var28 == 3) {
                                            this.method2994(255, var27, var24, var25, var26, 0, 0);
                                            this.method2994(255, var27, var24, var25, var26, arg1.field4340, 0);
                                            this.method2994(255, var27, var24, var25, var26, 0, arg1.field4340);
                                        } else if (var28 == 2) {
                                            this.method2994(255, var27, var24, var25, var26, arg1.field4340, 0);
                                            this.method2994(255, var27, var24, var25, var26, arg1.field4340, arg1.field4340);
                                            this.method2994(255, var27, var24, var25, var26, 0, 0);
                                        } else if (var28 == 5) {
                                            this.method2994(255, var27, var24, var25, var26, arg1.field4340, arg1.field4340);
                                            this.method2994(255, var27, var24, var25, var26, 0, arg1.field4340);
                                            this.method2994(255, var27, var24, var25, var26, arg1.field4340, 0);
                                        } else if (var28 == 4) {
                                            this.method2994(255, var27, var24, var25, var26, 0, arg1.field4340);
                                            this.method2994(255, var27, var24, var25, var26, 0, 0);
                                            this.method2994(255, var27, var24, var25, var26, arg1.field4340, arg1.field4340);
                                        }
                                    }
                                }
                                var26++;
                                var23++;
                            }
                        } else {
                            var23 += this.field5659 - this.field5670;
                        }
                        var24++;
                    }
                    this.field5657.method5103();
                    if (this.field5668.method3257(-3841)) {
                        this.field5665.method5103();
                        this.field5652 = this.field5654.method850(false, 0);
                        this.field5652.method169(16, this.field5647 * 16, var21, 32);
                        break;
                    }
                    this.field5665.method5110(0);
                    this.field5650.method970(-127);
                }
            } else {
                this.field5652 = null;
                this.field5668 = null;
            }
            this.field5650 = null;
            this.field5661 = this.field5653 = this.field5656 = null;
            this.field5665 = null;
            this.field5657 = null;
        } catch (RuntimeException var34) {
            throw class759.method5498(var34, field5671[2] + (arg0 == null ? field5671[0] : field5671[1]) + ',' + (arg1 == null ? field5671[0] : field5671[1]) + ',' + (arg2 == null ? field5671[0] : field5671[1]) + ',' + (arg3 == null ? field5671[0] : field5671[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!rb", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2996(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x3D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!rb", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2997(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 1;
                    break;
                case 1:
                    var10005 = 113;
                    break;
                case 2:
                    var10005 = 52;
                    break;
                case 3:
                    var10005 = 41;
                    break;
                default:
                    var10005 = 61;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
