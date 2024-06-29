import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class504 extends class568 {

    @OriginalMember(owner = "client!ap", name = "D", descriptor = "Lih;")
    private class731 field7542;

    @OriginalMember(owner = "client!ap", name = "w", descriptor = "Lgca;")
    private class261 field7541;

    @OriginalMember(owner = "client!ap", name = "u", descriptor = "Lkb;")
    private class721 field7546;

    @OriginalMember(owner = "client!ap", name = "l", descriptor = "I")
    private int field7547;

    @OriginalMember(owner = "client!ap", name = "z", descriptor = "I")
    private int field7543;

    @OriginalMember(owner = "client!ap", name = "G", descriptor = "I")
    private int field7544;

    @OriginalMember(owner = "client!ap", name = "r", descriptor = "I")
    private int field7532;

    @OriginalMember(owner = "client!ap", name = "m", descriptor = "[[F")
    private float[][] field7536;

    @OriginalMember(owner = "client!ap", name = "J", descriptor = "[[F")
    private float[][] field7530;

    @OriginalMember(owner = "client!ap", name = "p", descriptor = "[[F")
    private float[][] field7531;

    @OriginalMember(owner = "client!ap", name = "o", descriptor = "I")
    private int field7540;

    @OriginalMember(owner = "client!ap", name = "H", descriptor = "Lfk;")
    private class682 field7550;

    @OriginalMember(owner = "client!ap", name = "q", descriptor = "Llp;")
    private class414 field7538;

    @OriginalMember(owner = "client!ap", name = "s", descriptor = "Lqr;")
    private class69 field7525;

    @OriginalMember(owner = "client!ap", name = "C", descriptor = "Ljaclib/memory/Stream;")
    private Stream field7537;

    @OriginalMember(owner = "client!ap", name = "v", descriptor = "Ljaclib/memory/Stream;")
    private Stream field7533;

    @OriginalMember(owner = "client!ap", name = "n", descriptor = "I")
    private int field7526;

    @OriginalMember(owner = "client!ap", name = "N", descriptor = "[Ljava/lang/String;")
    private static final String[] field7553 = new String[] { method3803(method3802("~Z$\u007f")), method3803(method3802("k\u0001f=/")), method3803(method3802("q_f/;~F<-z")), method3803(method3802("q_fUz")), method3803(method3802("q_fQz")), method3803(method3802("q_fRz")), method3803(method3802("yIy")), method3803(method3802("q_fVz")), method3803(method3802("q_fTz")), method3803(method3802("q_fPz")), method3803(method3802("q_fWz")) };

    @OriginalMember(owner = "client!ap", name = "A", descriptor = "[I")
    public static int[] field7528 = new int[1];

    @OriginalMember(owner = "client!ap", name = "F", descriptor = "Lwh;")
    public static class155 field7539 = new class155(0, 1);

    @OriginalMember(owner = "client!ap", name = "M", descriptor = "Lhl;")
    public static class556 field7548 = new class556(42, 6);

    @OriginalMember(owner = "client!ap", name = "K", descriptor = "[Ljava/lang/String;")
    public static String[] field7552 = new String[5];

    @OriginalMember(owner = "client!ap", name = "I", descriptor = "I")
    public static int field7527;

    @OriginalMember(owner = "client!ap", name = "L", descriptor = "I")
    public static int field7529;

    @OriginalMember(owner = "client!ap", name = "t", descriptor = "I")
    public static int field7534;

    @OriginalMember(owner = "client!ap", name = "E", descriptor = "I")
    public static int field7535;

    @OriginalMember(owner = "client!ap", name = "y", descriptor = "I")
    public static int field7545;

    @OriginalMember(owner = "client!ap", name = "x", descriptor = "I")
    public static int field7549;

    @OriginalMember(owner = "client!ap", name = "B", descriptor = "I")
    public static int field7551;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIIIIIZ)V", line = 3)
    private final void method3795(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        try {
            field7534++;
            long var8 = -1L;
            int var10 = (arg0 << this.field7546.field4706) + arg3;
            int var11 = arg1 + (arg4 << this.field7546.field4706);
            int var12 = this.field7546.method2497((byte) -112, var10, var11);
            if (arg6) {
                field7528 = null;
            }
            if ((arg3 & 0x7F) == 0 || (arg1 & 0x7F) == 0) {
                var8 = 0xFFFFL << 16 & (long) var11 << 16 | (long) var10 & 0xFFFFL;
                class568 var13 = this.field7525.method737((byte) -39, var8);
                if (var13 != null) {
                    this.method3797(((class794) var13).field11605, -20202);
                    return;
                }
            }
            short var14 = (short) (this.field7526++);
            if (var8 != -1L) {
                this.field7525.method738(new class794(var14), var8, -12002);
            }
            float var15;
            float var16;
            float var17;
            if (arg3 == 0 && arg1 == 0) {
                var17 = this.field7530[arg2][arg5];
                var16 = this.field7536[arg2][arg5];
                var15 = this.field7531[arg2][arg5];
            } else if (this.field7546.field4702 == arg3 && arg1 == 0) {
                var15 = this.field7531[arg2 + 1][arg5];
                var16 = this.field7536[arg2 + 1][arg5];
                var17 = this.field7530[arg2 + 1][arg5];
            } else if (this.field7546.field4702 == arg3 && this.field7546.field4702 == arg1) {
                var15 = this.field7531[arg2 + 1][arg5 + 1];
                var17 = this.field7530[arg2 + 1][arg5 + 1];
                var16 = this.field7536[arg2 + 1][arg5 + 1];
            } else if (arg3 == 0 && this.field7546.field4702 == arg1) {
                var16 = this.field7536[arg2][arg5 + 1];
                var15 = this.field7531[arg2][arg5 + 1];
                var17 = this.field7530[arg2][arg5 + 1];
            } else {
                float var18 = (float) arg3 / (float) this.field7546.field4702;
                float var19 = (float) arg1 / (float) this.field7546.field4702;
                float var20 = this.field7530[arg2][arg5];
                float var21 = this.field7531[arg2][arg5];
                float var22 = this.field7536[arg2][arg5];
                float var23 = this.field7530[arg2 + 1][arg5];
                float var24 = this.field7531[arg2 + 1][arg5];
                float var25 = (this.field7531[arg2 + 1][arg5 + 1] - var24) * var18 + var24;
                float var26 = (this.field7531[arg2][arg5 + 1] - var21) * var18 + var21;
                float var27 = (this.field7530[arg2][arg5 + 1] - var20) * var18 + var20;
                float var28 = (this.field7530[arg2 + 1][arg5 + 1] - var23) * var18 + var23;
                float var29 = this.field7536[arg2 + 1][arg5];
                float var30 = (this.field7536[arg2][arg5 + 1] - var22) * var18 + var22;
                float var31 = (this.field7536[arg2 + 1][arg5 + 1] - var29) * var18 + var29;
                var17 = (var28 - var27) * var19 + var27;
                var15 = (var25 - var26) * var19 + var26;
                var16 = (var31 - var30) * var19 + var30;
            }
            float var32 = (float) (this.field7542.method5300(32) - var10);
            float var33 = (float) (this.field7542.method5297(arg6) - var12);
            float var34 = (float) (this.field7542.method5298(-4) - var11);
            float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
            float var36 = 1.0F / var35;
            float var37 = var32 * var36;
            float var38 = var33 * var36;
            float var39 = var34 * var36;
            float var40 = var35 / (float) this.field7542.method5295(32);
            float var41 = 1.0F - (var40 * var40);
            if (var41 < 0.0F) {
                var41 = 0.0F;
            }
            float var42 = var16 * var39 + var15 * var38 + var17 * var37;
            if (var42 < 0.0F) {
                var42 = 0.0F;
            }
            float var43 = var41 * var42 * 2.0F;
            if (var43 > 1.0F) {
                var43 = 1.0F;
            }
            int var44 = this.field7542.method5294(true);
            int var45 = (int) ((float) ((var44 & 0xFFBF27) >> 16) * var43);
            if (var45 > 255) {
                var45 = 255;
            }
            int var46 = (int) ((float) (var44 >> 8 & 0xFF) * var43);
            if (var46 > 255) {
                var46 = 255;
            }
            int var47 = (int) ((float) (var44 & 0xFF) * var43);
            if (var47 > 255) {
                var47 = 255;
            }
            if (Stream.method5108()) {
                this.field7537.method5109((float) var10);
                this.field7537.method5109((float) var12);
                this.field7537.method5109((float) var11);
            } else {
                this.field7537.method5106((float) var10);
                this.field7537.method5106((float) var12);
                this.field7537.method5106((float) var11);
            }
            if (this.field7541.field4138 == 0) {
                this.field7537.method5105(var47);
                this.field7537.method5105(var46);
                this.field7537.method5105(var45);
            } else {
                this.field7537.method5105(var45);
                this.field7537.method5105(var46);
                this.field7537.method5105(var47);
            }
            this.field7537.method5105(255);
            this.method3797(var14, -20202);
        } catch (RuntimeException var49) {
            throw class590.method4333(var49, field7553[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(I)V", line = 186)
    public static void method3796(int arg0) {
        try {
            field7552 = null;
            field7539 = null;
            if (arg0 != 5316) {
                field7552 = null;
            }
            field7548 = null;
            field7528 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field7553[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(SI)V", line = 203)
    private final void method3797(short arg0, int arg1) {
        try {
            if (arg1 != -20202) {
                method3800(-70, -47);
            }
            if (Stream.method5108()) {
                this.field7533.method5104(arg0);
            } else {
                this.field7533.method5101(arg0);
            }
            field7535++;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7553[8] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(II)Z", line = 224)
    public static final boolean method3798(int arg0, int arg1) {
        try {
            field7545++;
            if (class572.field8277[arg1]) {
                return true;
            } else if (class735.field10780.method602(arg1, 0)) {
                int var2 = class735.field10780.method580(68, arg1);
                if (var2 == 0) {
                    class572.field8277[arg1] = true;
                    return true;
                }
                if (class309.field5028[arg1] == null) {
                    class309.field5028[arg1] = new class683[var2];
                }
                if (arg0 <= 126) {
                    method3796(-84);
                }
                for (int var3 = 0; var3 < var2; var3++) {
                    if (class309.field5028[arg1][var3] == null) {
                        byte[] var4 = class735.field10780.method604((byte) -127, var3, arg1);
                        if (var4 != null) {
                            class683 var5 = class309.field5028[arg1][var3] = new class683();
                            var5.field9774 = (arg1 << 16) + var3;
                            if (var4[0] != -1) {
                                throw new IllegalStateException(field7553[6]);
                            }
                            var5.method4970(new class176(var4), 0);
                        }
                    }
                }
                class572.field8277[arg1] = true;
                return true;
            } else {
                return false;
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field7553[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(I[[ZIBI)V", line = 284)
    public final void method3799(int arg0, boolean[][] arg1, int arg2, byte arg3, int arg4) {
        try {
            field7527++;
            if (this.field7538 != null && (arg2 + arg4) >= this.field7547 && (arg2 - arg4) <= this.field7543 && this.field7544 <= (arg0 + arg4) && arg0 - arg4 <= this.field7532) {
                if (arg3 >= -66) {
                    this.field7530 = null;
                }
                for (int var6 = this.field7544; var6 <= this.field7532; var6++) {
                    for (int var7 = this.field7547; var7 <= this.field7543; var7++) {
                        int var8 = var7 - arg2;
                        int var9 = var6 - arg0;
                        if (var8 > (-arg4) && arg4 > var8 && var9 > -arg4 && arg4 > var9 && arg1[arg4 + var8][arg4 + var9]) {
                            this.field7541.method2269((byte) ((int) (this.field7542.method5299(31541) * 255.0F)), -532560792);
                            this.field7541.method1036(this.field7550, 0, 2);
                            this.field7541.method1042((byte) 123, this.field7541.field4251);
                            this.field7541.method1064(this.field7526, 0, (byte) -33, 0, class356.field5727, this.field7538, this.field7540 / 3);
                            return;
                        }
                    }
                }
            }
        } catch (RuntimeException var11) {
            throw class590.method4333(var11, field7553[3] + arg0 + ',' + (arg1 == null ? field7553[0] : field7553[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "(II)V", line = 346)
    public static final void method3800(int arg0, int arg1) {
        try {
            field7549++;
            class551 var2 = class380.method3113(-122, (long) arg1, 7);
            var2.method4089(63);
            if (arg0 <= 63) {
                field7551 = -36;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7553[10] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IZII)V", line = 361)
    public static final void method3801(int arg0, boolean arg1, int arg2, int arg3) {
        try {
            if (class700.field10071.method737((byte) -39, (long) arg3) == null) {
                if (class519.field7688) {
                    class670 var4 = new class670(arg3, new class197(4096, class599.field8684, arg3), arg0, arg1);
                    var4.field9518.method3058(class782.field11419[class795.field11624], 66);
                    class700.field10071.method738(var4, (long) arg3, -12002);
                } else {
                    class303.method2604(arg3, arg1, arg2 ^ 0x1008);
                }
            }
            if (arg2 != 4096) {
                method3801(-67, true, -104, 126);
            }
            field7529++;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field7553[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Lgca;Lkb;Lih;[I)V", line = 398)
    public class504(class261 arg0, class721 arg1, class731 arg2, int[] arg3) {
        try {
            this.field7542 = arg2;
            this.field7541 = arg0;
            this.field7546 = arg1;
            int var5 = this.field7542.method5295(32) - (arg1.field4702 >> 1);
            this.field7547 = this.field7542.method5300(32) - var5 >> arg1.field4706;
            this.field7543 = this.field7542.method5300(32) + var5 >> arg1.field4706;
            this.field7544 = this.field7542.method5298(-4) - var5 >> arg1.field4706;
            this.field7532 = var5 + this.field7542.method5298(-4) >> arg1.field4706;
            int var6 = this.field7543 + 1 - this.field7547;
            int var7 = this.field7532 + 1 - this.field7544;
            this.field7536 = new float[var6 + 1][var7 + 1];
            this.field7530 = new float[var6 + 1][var7 + 1];
            this.field7531 = new float[var6 + 1][var7 + 1];
            for (int var8 = 0; var8 <= var7; var8++) {
                int var9 = this.field7544 + var8;
                if (var9 > 0 && var9 < (this.field7546.field4697 - 1)) {
                    for (int var10 = 0; var10 <= var6; var10++) {
                        int var11 = this.field7547 + var10;
                        if (var11 > 0 && this.field7546.field4704 - 1 > var11) {
                            int var12 = arg1.method2495(var9, 1, var11 + 1) - arg1.method2495(var9, 1, var11 - 1);
                            int var13 = arg1.method2495(var9 + 1, 1, var11) - arg1.method2495(var9 - 1, 1, var11);
                            float var14 = (float) (1.0D / Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536)));
                            this.field7530[var10][var8] = (float) var12 * var14;
                            this.field7531[var10][var8] = var14 * -256.0F;
                            this.field7536[var10][var8] = (float) var13 * var14;
                        }
                    }
                }
            }
            int var15 = 0;
            for (int var16 = this.field7544; var16 <= this.field7532; var16++) {
                if (var16 >= 0 && arg1.field4697 > var16) {
                    for (int var17 = this.field7547; var17 <= this.field7543; var17++) {
                        if (var17 >= 0 && var17 < arg1.field4704) {
                            int var18 = arg3[var15];
                            int[] var19 = arg1.field10584[var17][var16];
                            if (var19 != null && var18 != 0) {
                                if (var18 == 1) {
                                    int var20 = 0;
                                    while (var20 < var19.length) {
                                        if (var19[var20++] != -1 && var19[var20++] != -1 && var19[var20++] != -1) {
                                            this.field7540 += 3;
                                        }
                                    }
                                } else {
                                    this.field7540 += 3;
                                }
                            }
                        }
                        var15++;
                    }
                } else {
                    var15 += this.field7543 - this.field7547;
                }
            }
            if (this.field7540 <= 0) {
                this.field7550 = null;
                this.field7538 = null;
            } else {
                this.field7525 = new class69(class90.method883((byte) 76, this.field7540));
                this.field7538 = this.field7541.method1077(-7930, false);
                this.field7538.method980(this.field7540, false);
                NativeHeapBuffer var21 = this.field7541.method2216(false, this.field7540 * 16, (byte) -85);
                this.field7537 = new Stream(var21);
                while (true) {
                    Buffer var22;
                    do {
                        var22 = this.field7538.method3305(-119, true);
                    } while (var22 == null);
                    this.field7533 = new Stream(var22);
                    int var23 = 0;
                    int var24 = 0;
                    for (int var25 = this.field7544; var25 <= this.field7532; var25++) {
                        if (var25 >= 0 && arg1.field4697 > var25) {
                            int var26 = 0;
                            for (int var27 = this.field7547; var27 <= this.field7543; var27++) {
                                if (var27 >= 0 && var27 < arg1.field4704) {
                                    int var28 = arg3[var24];
                                    int[] var29 = arg1.field10584[var27][var25];
                                    if (var29 != null && var28 != 0) {
                                        if (var28 == 1) {
                                            int[] var30 = arg1.field10550[var27][var25];
                                            int[] var31 = arg1.field10546[var27][var25];
                                            int var32 = 0;
                                            label179: while (true) {
                                                while (true) {
                                                    if (var32 >= var29.length) {
                                                        break label179;
                                                    }
                                                    if (var29[var32] == -1 || var29[var32 + 1] == -1 || var29[var32 + 2] == -1) {
                                                        var32 += 3;
                                                    } else {
                                                        this.method3795(var27, var31[var32], var26, var30[var32], var25, var23, false);
                                                        var32++;
                                                        this.method3795(var27, var31[var32], var26, var30[var32], var25, var23, false);
                                                        var32++;
                                                        this.method3795(var27, var31[var32], var26, var30[var32], var25, var23, false);
                                                        var32++;
                                                    }
                                                }
                                            }
                                        } else if (var28 == 3) {
                                            this.method3795(var27, 0, var26, 0, var25, var23, false);
                                            this.method3795(var27, 0, var26, arg1.field4702, var25, var23, false);
                                            this.method3795(var27, arg1.field4702, var26, 0, var25, var23, false);
                                        } else if (var28 == 2) {
                                            this.method3795(var27, 0, var26, arg1.field4702, var25, var23, false);
                                            this.method3795(var27, arg1.field4702, var26, arg1.field4702, var25, var23, false);
                                            this.method3795(var27, 0, var26, 0, var25, var23, false);
                                        } else if (var28 == 5) {
                                            this.method3795(var27, arg1.field4702, var26, arg1.field4702, var25, var23, false);
                                            this.method3795(var27, arg1.field4702, var26, 0, var25, var23, false);
                                            this.method3795(var27, 0, var26, arg1.field4702, var25, var23, false);
                                        } else if (var28 == 4) {
                                            this.method3795(var27, arg1.field4702, var26, 0, var25, var23, false);
                                            this.method3795(var27, 0, var26, 0, var25, var23, false);
                                            this.method3795(var27, arg1.field4702, var26, arg1.field4702, var25, var23, false);
                                        }
                                    }
                                }
                                var26++;
                                var24++;
                            }
                        } else {
                            var24 += this.field7543 - this.field7547;
                        }
                        var23++;
                    }
                    this.field7533.method5097();
                    if (this.field7538.method3307(123)) {
                        this.field7537.method5097();
                        this.field7550 = this.field7541.method1030(false, false);
                        this.field7550.method3931(16, 104, this.field7526 * 16, var21);
                        break;
                    }
                    this.field7537.method5103(0);
                    this.field7525.method730(true);
                }
            }
            this.field7530 = this.field7531 = this.field7536 = null;
            this.field7537 = null;
            this.field7525 = null;
            this.field7533 = null;
        } catch (RuntimeException var34) {
            throw class590.method4333(var34, field7553[2] + (arg0 == null ? field7553[0] : field7553[1]) + ',' + (arg1 == null ? field7553[0] : field7553[1]) + ',' + (arg2 == null ? field7553[0] : field7553[1]) + ',' + (arg3 == null ? field7553[0] : field7553[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!ap", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3802(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x52);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ap", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3803(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 16;
                    break;
                case 1:
                    var10005 = 47;
                    break;
                case 2:
                    var10005 = 72;
                    break;
                case 3:
                    var10005 = 19;
                    break;
                default:
                    var10005 = 82;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
