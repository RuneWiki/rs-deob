import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public class class521 extends class513 {

    @OriginalMember(owner = "client!pu", name = "y", descriptor = "Lul;")
    private class530 field7640;

    @OriginalMember(owner = "client!pu", name = "K", descriptor = "Ljda;")
    private class206 field7652;

    @OriginalMember(owner = "client!pu", name = "A", descriptor = "Lifa;")
    private class393 field7642;

    @OriginalMember(owner = "client!pu", name = "x", descriptor = "I")
    private int field7639;

    @OriginalMember(owner = "client!pu", name = "n", descriptor = "I")
    private int field7629;

    @OriginalMember(owner = "client!pu", name = "o", descriptor = "I")
    private int field7630;

    @OriginalMember(owner = "client!pu", name = "u", descriptor = "I")
    private int field7636;

    @OriginalMember(owner = "client!pu", name = "r", descriptor = "[[F")
    private float[][] field7633;

    @OriginalMember(owner = "client!pu", name = "D", descriptor = "[[F")
    private float[][] field7645;

    @OriginalMember(owner = "client!pu", name = "C", descriptor = "[[F")
    private float[][] field7644;

    @OriginalMember(owner = "client!pu", name = "t", descriptor = "I")
    private int field7635;

    @OriginalMember(owner = "client!pu", name = "I", descriptor = "Lel;")
    private class508 field7650;

    @OriginalMember(owner = "client!pu", name = "j", descriptor = "Lcda;")
    private class154 field7625;

    @OriginalMember(owner = "client!pu", name = "p", descriptor = "Lwaa;")
    private class652 field7631;

    @OriginalMember(owner = "client!pu", name = "m", descriptor = "Ljaclib/memory/Stream;")
    private Stream field7628;

    @OriginalMember(owner = "client!pu", name = "G", descriptor = "Ljaclib/memory/Stream;")
    private Stream field7648;

    @OriginalMember(owner = "client!pu", name = "k", descriptor = "I")
    private int field7626;

    @OriginalMember(owner = "client!pu", name = "q", descriptor = "I")
    public static int field7632 = -1;

    @OriginalMember(owner = "client!pu", name = "v", descriptor = "Loe;")
    public static class183 field7637 = new class183();

    @OriginalMember(owner = "client!pu", name = "H", descriptor = "[I")
    public static int[] field7649 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!pu", name = "s", descriptor = "I")
    public static int field7634;

    @OriginalMember(owner = "client!pu", name = "w", descriptor = "I")
    public static int field7638;

    @OriginalMember(owner = "client!pu", name = "z", descriptor = "I")
    public static int field7641;

    @OriginalMember(owner = "client!pu", name = "B", descriptor = "I")
    public static int field7643;

    @OriginalMember(owner = "client!pu", name = "F", descriptor = "I")
    public static int field7647;

    @OriginalMember(owner = "client!pu", name = "L", descriptor = "I")
    public static int field7653;

    @OriginalMember(owner = "client!pu", name = "l", descriptor = "Lq;")
    public static class394 field7627;

    @OriginalMember(owner = "client!pu", name = "J", descriptor = "[Lf;")
    public static class701[] field7651;

    @OriginalMember(owner = "client!pu", name = "E", descriptor = "[Ljava/lang/String;")
    public static String[] field7646;

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(IIZLjn;II)V", line = 5)
    public static final void method3088(int arg0, int arg1, boolean arg2, class668 arg3, int arg4, int arg5) {
        field7653++;
        class320.method1865(arg2, arg3, 0L, arg5, true, arg4, arg0);
        int var6 = 107 / ((17 - arg1) / 61);
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(III[[ZI)V", line = 34)
    public final void method3089(int arg0, int arg1, int arg2, boolean[][] arg3, int arg4) {
        field7643++;
        if (this.field7625 == null || this.field7639 > (arg0 + arg2) || (arg0 - arg2) > this.field7629) {
            return;
        }
        if (arg4 > -83) {
            this.field7635 = -57;
        }
        if (this.field7630 > arg1 + arg2 || (arg1 - arg2) > this.field7636) {
            return;
        }
        for (int var6 = this.field7630; var6 <= this.field7636; var6++) {
            for (int var7 = this.field7639; var7 <= this.field7629; var7++) {
                int var8 = var7 - arg0;
                int var9 = var6 - arg1;
                if (-arg2 < var8 && arg2 > var8 && var9 > -arg2 && arg2 > var9 && arg3[arg2 + var8][arg2 + var9]) {
                    this.field7642.method2378((byte) ((int) (this.field7640.method3117(false) * 255.0F)), (byte) -123);
                    this.field7642.method493(0, 0, this.field7650);
                    this.field7642.method480(this.field7642.field5549, -76);
                    this.field7642.method528(0, class73.field1094, this.field7635 / 3, 0, this.field7626, this.field7625, (byte) 126);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(ZLec;I)V", line = 91)
    public static final void method3090(boolean arg0, class213 arg1, int arg2) {
        field7641++;
        class573 var3 = arg1.method1280(-1);
        if (arg1.field2683 == 0) {
            class674.field9675 = 0;
            class577.field8434 = -1;
            arg1.field2688 = 0;
            return;
        }
        if (arg1.field2637 != -1 && arg1.field2596 == 0) {
            class282 var4 = class195.field2367.method3273(arg1.field2637, 0);
            if (arg1.field2680 > 0 && var4.field3825 == 0) {
                class577.field8434 = -1;
                arg1.field2688++;
                class674.field9675 = 0;
                return;
            }
            if (arg1.field2680 <= 0 && var4.field3836 == 0) {
                class674.field9675 = 0;
                class577.field8434 = -1;
                arg1.field2688++;
                return;
            }
        }
        if (arg1.field2626 != -1 && arg1.field2657 <= class543.field7882) {
            class596 var5 = class276.field3774.method136(arg1.field2626, false);
            if (var5.field8600 && var5.field8614 != -1) {
                class282 var6 = class195.field2367.method3273(var5.field8614, 0);
                if (arg1.field2680 > 0 && var6.field3825 == 0) {
                    class577.field8434 = -1;
                    arg1.field2688++;
                    class674.field9675 = 0;
                    return;
                }
                if (arg1.field2680 <= 0 && var6.field3836 == 0) {
                    class577.field8434 = -1;
                    class674.field9675 = 0;
                    arg1.field2688++;
                    return;
                }
            }
        }
        if (arg1.field2626 != -1 && class543.field7882 >= arg1.field2657) {
            class596 var7 = class276.field3774.method136(arg1.field2626, false);
            if (var7.field8600 && var7.field8614 != -1) {
                class282 var8 = class195.field2367.method3273(var7.field8614, arg2 + 13412);
                if (arg1.field2680 > 0 && var8.field3825 == 0) {
                    class577.field8434 = -1;
                    arg1.field2688++;
                    class674.field9675 = 0;
                    return;
                }
                if (arg1.field2680 <= 0 && var8.field3836 == 0) {
                    class577.field8434 = -1;
                    class674.field9675 = 0;
                    arg1.field2688++;
                    return;
                }
            }
        }
        int var9 = arg1.field530;
        int var10 = arg1.field531;
        if (arg2 != -13412) {
            field7627 = null;
        }
        int var11 = arg1.field2689[arg1.field2683 - 1] * 512 + arg1.method1284((byte) -124) * 256;
        int var12 = arg1.field2686[arg1.field2683 - 1] * 512 + (arg1.method1284((byte) -124) * 256);
        if (var11 > var9) {
            if (var10 < var12) {
                arg1.method1295(-1, 10240);
            } else if (var10 <= var12) {
                arg1.method1295(-1, 12288);
            } else {
                arg1.method1295(arg2 + 13411, 14336);
            }
        } else if (var9 > var11) {
            if (var10 < var12) {
                arg1.method1295(-1, 6144);
            } else if (var10 <= var12) {
                arg1.method1295(arg2 + 13411, 4096);
            } else {
                arg1.method1295(-1, 2048);
            }
        } else if (var12 > var10) {
            arg1.method1295(-1, 8192);
        } else if (var12 < var10) {
            arg1.method1295(-1, 0);
        }
        byte var13 = arg1.field2679[arg1.field2683 - 1];
        if (!arg0 && var11 - var9 > 1024 || var11 - var9 < -1024 || var12 - var10 > 1024 || var12 - var10 < -1024) {
            arg1.field530 = var11;
            arg1.field531 = var12;
            arg1.method1293((byte) -62, false, arg1.field2578);
            if (arg1.field2680 > 0) {
                arg1.field2680--;
            }
            arg1.field2683--;
            class577.field8434 = -1;
            class674.field9675 = 0;
            return;
        }
        int var14 = 16;
        boolean var15 = true;
        if (arg1 instanceof class557) {
            var15 = ((class557) arg1).field8052.field4320;
        }
        if (var15) {
            int var16 = arg1.field2578 - arg1.field2588.field7554;
            if (var16 != 0 && arg1.field2628 == -1 && arg1.field2616 != 0) {
                var14 = 8;
            }
            if (!arg0 && arg1.field2683 > 2) {
                var14 = 24;
            }
            if (!arg0 && arg1.field2683 > 3) {
                var14 = 32;
            }
        } else {
            if (!arg0 && arg1.field2683 > 1) {
                var14 = 24;
            }
            if (!arg0 && arg1.field2683 > 2) {
                var14 = 32;
            }
        }
        if (arg1.field2688 > 0 && arg1.field2683 > 1) {
            var14 = 32;
            arg1.field2688--;
        }
        if (var13 == 2) {
            var14 <<= 0x1;
        } else if (var13 == 0) {
            var14 >>= 0x1;
        }
        class674.field9675 = 0;
        if (var3.field8393 != -1) {
            int var17 = var14 << 9;
            if (arg1.field2683 == 1) {
                int var18 = arg1.field2681 * arg1.field2681;
                int var19 = (var11 < arg1.field530 ? arg1.field530 - var11 : -arg1.field530 + var11) << 9;
                int var20 = (arg1.field531 <= var12 ? var12 - arg1.field531 : arg1.field531 - var12) << 9;
                int var21 = var20 < var19 ? var19 : var20;
                int var22 = var3.field8393 * var21 * 2;
                if (var22 < var18) {
                    arg1.field2681 /= 2;
                } else if (var21 < var18 / 2) {
                    arg1.field2681 -= var3.field8393;
                    if (arg1.field2681 < 0) {
                        arg1.field2681 = 0;
                    }
                } else if (arg1.field2681 < var17) {
                    arg1.field2681 += var3.field8393;
                    if (arg1.field2681 > var17) {
                        arg1.field2681 = var17;
                    }
                }
            } else if (arg1.field2681 < var17) {
                arg1.field2681 += var3.field8393;
                if (var17 < arg1.field2681) {
                    arg1.field2681 = var17;
                }
            } else if (arg1.field2681 > 0) {
                arg1.field2681 -= var3.field8393;
                if (arg1.field2681 < 0) {
                    arg1.field2681 = 0;
                }
            }
            var14 = arg1.field2681 >> 9;
            if (var14 < 1) {
                var14 = 1;
            }
        }
        if (var9 == var11 && var10 == var12) {
            class577.field8434 = -1;
        } else {
            if (var9 < var11) {
                class674.field9675 |= 0x4;
                arg1.field530 += var14;
                if (arg1.field530 > var11) {
                    arg1.field530 = var11;
                }
            } else if (var11 < var9) {
                class674.field9675 |= 0x8;
                arg1.field530 -= var14;
                if (var11 > arg1.field530) {
                    arg1.field530 = var11;
                }
            }
            if (var12 > var10) {
                arg1.field531 += var14;
                class674.field9675 |= 0x1;
                if (var12 < arg1.field531) {
                    arg1.field531 = var12;
                }
            } else if (var12 < var10) {
                arg1.field531 -= var14;
                class674.field9675 |= 0x2;
                if (arg1.field531 < var12) {
                    arg1.field531 = var12;
                }
            }
            if (var14 < 32) {
                class577.field8434 = var13;
            } else {
                class577.field8434 = 2;
            }
        }
        if (arg1.field530 == var11 && arg1.field531 == var12) {
            if (arg1.field2680 > 0) {
                arg1.field2680--;
            }
            arg1.field2683--;
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(SI)V", line = 434)
    private final void method3091(short arg0, int arg1) {
        field7634++;
        if (Stream.method3579()) {
            this.field7648.method3581(arg0);
        } else {
            this.field7648.method3586(arg0);
        }
        int var3 = 43 / ((arg1 - 63) / 41);
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(I)V", line = 458)
    public static void method3092(int arg0) {
        field7646 = null;
        if (arg0 != -1860) {
            method3088(40, 124, true, null, 117, -108);
        }
        field7627 = null;
        field7637 = null;
        field7651 = null;
        field7649 = null;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(IIIIIZI)V", line = 481)
    private final void method3093(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field7638++;
        long var8 = -1L;
        int var10 = (arg0 << this.field7652.field696) + arg2;
        int var11 = (arg4 << this.field7652.field696) + arg6;
        int var12 = this.field7652.method428(true, var10, var11);
        if ((arg2 & 0x7F) == 0 || (arg6 & 0x7F) == 0) {
            var8 = ((long) var11 & 0xFFFFL) << 16 | (long) var10 & 0xFFFFL;
            class513 var13 = this.field7631.method3678(var8, -122);
            if (var13 != null) {
                this.method3091(((class384) var13).field5118, 127);
                return;
            }
        }
        short var14 = (short) (this.field7626++);
        if (var8 != -1L) {
            this.field7631.method3670(var8, new class384(var14), (byte) 127);
        }
        float var15;
        float var16;
        float var17;
        if (arg2 == 0 && arg6 == 0) {
            var15 = this.field7645[arg3][arg1];
            var16 = this.field7633[arg3][arg1];
            var17 = this.field7644[arg3][arg1];
        } else if (this.field7652.field695 == arg2 && arg6 == 0) {
            var16 = this.field7633[arg3 + 1][arg1];
            var15 = this.field7645[arg3 + 1][arg1];
            var17 = this.field7644[arg3 + 1][arg1];
        } else if (this.field7652.field695 == arg2 && this.field7652.field695 == arg6) {
            var17 = this.field7644[arg3 + 1][arg1 + 1];
            var15 = this.field7645[arg3 + 1][arg1 + 1];
            var16 = this.field7633[arg3 + 1][arg1 + 1];
        } else if (arg2 == 0 && this.field7652.field695 == arg6) {
            var17 = this.field7644[arg3][arg1 + 1];
            var15 = this.field7645[arg3][arg1 + 1];
            var16 = this.field7633[arg3][arg1 + 1];
        } else {
            float var18 = (float) arg2 / (float) this.field7652.field695;
            float var19 = (float) arg6 / (float) this.field7652.field695;
            float var20 = this.field7644[arg3][arg1];
            float var21 = this.field7633[arg3][arg1];
            float var22 = this.field7645[arg3][arg1];
            float var23 = this.field7644[arg3 + 1][arg1];
            float var24 = this.field7633[arg3 + 1][arg1];
            float var25 = (this.field7633[arg3][arg1 + 1] - var21) * var18 + var21;
            float var26 = (this.field7645[arg3][arg1 + 1] - var22) * var18 + var22;
            float var27 = (this.field7644[arg3][arg1 + 1] - var20) * var18 + var20;
            float var28 = (this.field7633[arg3 + 1][arg1 + 1] - var24) * var18 + var24;
            float var29 = (this.field7644[arg3 + 1][arg1 + 1] - var23) * var18 + var23;
            float var30 = this.field7645[arg3 + 1][arg1];
            var16 = (var28 - var25) * var19 + var25;
            var17 = (var29 - var27) * var19 + var27;
            float var31 = (this.field7645[arg3 + 1][arg1 + 1] - var30) * var18 + var30;
            var15 = (var31 - var26) * var19 + var26;
        }
        float var32 = (float) (this.field7640.method3118(34037) - var10);
        float var33 = (float) (this.field7640.method3119(3553) - var12);
        float var34 = (float) (this.field7640.method3115(-30190) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var33 * var36;
        if (arg5) {
            this.field7635 = 103;
        }
        float var38 = var34 * var36;
        float var39 = var32 * var36;
        float var40 = var35 / (float) this.field7640.method3122(-11184);
        float var41 = 1.0F - (var40 * var40);
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var15 * var38 + var16 * var37 + var17 * var39;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field7640.method3120(true);
        int var45 = (int) ((float) (var44 >> 16 & 0xFF) * var43);
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
        if (Stream.method3579()) {
            this.field7628.method3584((float) var10);
            this.field7628.method3584((float) var12);
            this.field7628.method3584((float) var11);
        } else {
            this.field7628.method3577((float) var10);
            this.field7628.method3577((float) var12);
            this.field7628.method3577((float) var11);
        }
        if (this.field7642.field5443 == 0) {
            this.field7628.method3576(var47);
            this.field7628.method3576(var46);
            this.field7628.method3576(var45);
        } else {
            this.field7628.method3576(var45);
            this.field7628.method3576(var46);
            this.field7628.method3576(var47);
        }
        this.field7628.method3576(255);
        this.method3091(var14, 104);
    }

    @OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(Lifa;Ljda;Lul;[I)V", line = 657)
    public class521(class393 arg0, class206 arg1, class530 arg2, int[] arg3) {
        this.field7640 = arg2;
        this.field7652 = arg1;
        this.field7642 = arg0;
        int var5 = this.field7640.method3122(-11184) - (arg1.field695 >> 1);
        this.field7639 = this.field7640.method3118(34037) - var5 >> arg1.field696;
        this.field7629 = var5 + this.field7640.method3118(34037) >> arg1.field696;
        this.field7630 = this.field7640.method3115(-30190) - var5 >> arg1.field696;
        this.field7636 = this.field7640.method3115(-30190) + var5 >> arg1.field696;
        int var6 = this.field7629 + 1 - this.field7639;
        int var7 = this.field7636 + 1 - this.field7630;
        this.field7633 = new float[var6 + 1][var7 + 1];
        this.field7645 = new float[var6 + 1][var7 + 1];
        this.field7644 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var27 = this.field7630 + var8;
            if (var27 > 0 && (this.field7652.field706 - 1) > var27) {
                for (int var28 = 0; var28 <= var6; var28++) {
                    int var29 = this.field7639 + var28;
                    if (var29 > 0 && this.field7652.field702 - 1 > var29) {
                        int var30 = arg1.method437(90, var27, var29 + 1) - arg1.method437(98, var27, var29 - 1);
                        int var31 = arg1.method437(124, var27 + 1, var29) - arg1.method437(95, var27 - 1, var29);
                        float var32 = (float) (1.0D / Math.sqrt((double) (var30 * var30 + var31 * var31 + 65536)));
                        this.field7644[var28][var8] = (float) var30 * var32;
                        this.field7633[var28][var8] = var32 * -256.0F;
                        this.field7645[var28][var8] = (float) var31 * var32;
                    }
                }
            }
        }
        int var9 = 0;
        for (int var10 = this.field7630; var10 <= this.field7636; var10++) {
            if (var10 >= 0 && var10 < arg1.field706) {
                for (int var23 = this.field7639; var23 <= this.field7629; var23++) {
                    if (var23 >= 0 && arg1.field702 > var23) {
                        int var24 = arg3[var9];
                        int[] var25 = arg1.field2498[var23][var10];
                        if (var25 != null && var24 != 0) {
                            if (var24 == 1) {
                                int var26 = 0;
                                while (var26 < var25.length) {
                                    if (var25[var26++] != -1 && var25[var26++] != -1 && var25[var26++] != -1) {
                                        this.field7635 += 3;
                                    }
                                }
                            } else {
                                this.field7635 += 3;
                            }
                        }
                    }
                    var9++;
                }
            } else {
                var9 += this.field7629 - this.field7639;
            }
        }
        if (this.field7635 <= 0) {
            this.field7650 = null;
            this.field7625 = null;
        } else {
            this.field7631 = new class652(class698.method3915(this.field7635, (byte) 93));
            this.field7625 = this.field7642.method475(false, -30974);
            this.field7625.method13(this.field7635, -6482);
            NativeHeapBuffer var11 = this.field7642.method2376(this.field7635 * 16, false, true);
            this.field7628 = new Stream(var11);
            while (true) {
                Buffer var12;
                do {
                    var12 = this.field7625.method14(true, (byte) -60);
                } while (var12 == null);
                this.field7648 = new Stream(var12);
                int var13 = 0;
                int var14 = 0;
                for (int var15 = this.field7630; var15 <= this.field7636; var15++) {
                    if (var15 >= 0 && var15 < arg1.field706) {
                        int var16 = 0;
                        for (int var17 = this.field7639; var17 <= this.field7629; var17++) {
                            if (var17 >= 0 && arg1.field702 > var17) {
                                int var18 = arg3[var14];
                                int[] var19 = arg1.field2498[var17][var15];
                                if (var19 != null && var18 != 0) {
                                    if (var18 == 1) {
                                        int[] var20 = arg1.field2487[var17][var15];
                                        int[] var21 = arg1.field2490[var17][var15];
                                        int var22 = 0;
                                        label123: while (true) {
                                            while (true) {
                                                if (var22 >= var19.length) {
                                                    break label123;
                                                }
                                                if (var19[var22] == -1 || var19[var22 + 1] == -1 || var19[var22 + 2] == -1) {
                                                    var22 += 3;
                                                } else {
                                                    this.method3093(var17, var13, var20[var22], var16, var15, false, var21[var22]);
                                                    var22++;
                                                    this.method3093(var17, var13, var20[var22], var16, var15, false, var21[var22]);
                                                    var22++;
                                                    this.method3093(var17, var13, var20[var22], var16, var15, false, var21[var22]);
                                                    var22++;
                                                }
                                            }
                                        }
                                    } else if (var18 == 3) {
                                        this.method3093(var17, var13, 0, var16, var15, false, 0);
                                        this.method3093(var17, var13, arg1.field695, var16, var15, false, 0);
                                        this.method3093(var17, var13, 0, var16, var15, false, arg1.field695);
                                    } else if (var18 == 2) {
                                        this.method3093(var17, var13, arg1.field695, var16, var15, false, 0);
                                        this.method3093(var17, var13, arg1.field695, var16, var15, false, arg1.field695);
                                        this.method3093(var17, var13, 0, var16, var15, false, 0);
                                    } else if (var18 == 5) {
                                        this.method3093(var17, var13, arg1.field695, var16, var15, false, arg1.field695);
                                        this.method3093(var17, var13, 0, var16, var15, false, arg1.field695);
                                        this.method3093(var17, var13, arg1.field695, var16, var15, false, 0);
                                    } else if (var18 == 4) {
                                        this.method3093(var17, var13, 0, var16, var15, false, arg1.field695);
                                        this.method3093(var17, var13, 0, var16, var15, false, 0);
                                        this.method3093(var17, var13, arg1.field695, var16, var15, false, arg1.field695);
                                    }
                                }
                            }
                            var14++;
                            var16++;
                        }
                    } else {
                        var14 += this.field7629 - this.field7639;
                    }
                    var13++;
                }
                this.field7648.method3578();
                if (this.field7625.method15(-1969)) {
                    this.field7628.method3578();
                    this.field7650 = this.field7642.method516((byte) 108, false);
                    this.field7650.method739(this.field7626 * 16, -16501, 16, var11);
                    break;
                }
                this.field7628.method3574(0);
                this.field7631.method3674((byte) -107);
            }
        }
        this.field7648 = null;
        this.field7644 = this.field7633 = this.field7645 = null;
        this.field7628 = null;
        this.field7631 = null;
    }
}
