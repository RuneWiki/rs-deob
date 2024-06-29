import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class642 extends class435 {

    @OriginalMember(owner = "client!ib", name = "u", descriptor = "Lam;")
    private class289 field9103;

    @OriginalMember(owner = "client!ib", name = "y", descriptor = "Lnh;")
    private class495 field9107;

    @OriginalMember(owner = "client!ib", name = "E", descriptor = "Lsq;")
    private class194 field9113;

    @OriginalMember(owner = "client!ib", name = "x", descriptor = "I")
    private int field9106;

    @OriginalMember(owner = "client!ib", name = "J", descriptor = "I")
    private int field9118;

    @OriginalMember(owner = "client!ib", name = "w", descriptor = "I")
    private int field9105;

    @OriginalMember(owner = "client!ib", name = "M", descriptor = "I")
    private int field9121;

    @OriginalMember(owner = "client!ib", name = "q", descriptor = "[[F")
    private float[][] field9099;

    @OriginalMember(owner = "client!ib", name = "r", descriptor = "[[F")
    private float[][] field9100;

    @OriginalMember(owner = "client!ib", name = "C", descriptor = "[[F")
    private float[][] field9111;

    @OriginalMember(owner = "client!ib", name = "v", descriptor = "I")
    private int field9104;

    @OriginalMember(owner = "client!ib", name = "L", descriptor = "Lmo;")
    private class482 field9120;

    @OriginalMember(owner = "client!ib", name = "N", descriptor = "Leu;")
    private class175 field9122;

    @OriginalMember(owner = "client!ib", name = "F", descriptor = "Ljaclib/memory/Stream;")
    private Stream field9114;

    @OriginalMember(owner = "client!ib", name = "t", descriptor = "Ljaclib/memory/Stream;")
    private Stream field9102;

    @OriginalMember(owner = "client!ib", name = "G", descriptor = "Lwf;")
    private class483 field9115;

    @OriginalMember(owner = "client!ib", name = "A", descriptor = "I")
    private int field9109;

    @OriginalMember(owner = "client!ib", name = "K", descriptor = "Leda;")
    public static class116 field9119 = new class116(7, 4);

    @OriginalMember(owner = "client!ib", name = "O", descriptor = "Leda;")
    public static class116 field9123 = new class116(2, 3);

    @OriginalMember(owner = "client!ib", name = "Q", descriptor = "Lqj;")
    public static class511 field9124 = new class511(9, 2);

    @OriginalMember(owner = "client!ib", name = "s", descriptor = "I")
    public static int field9101;

    @OriginalMember(owner = "client!ib", name = "z", descriptor = "I")
    public static int field9108;

    @OriginalMember(owner = "client!ib", name = "B", descriptor = "I")
    public static int field9110;

    @OriginalMember(owner = "client!ib", name = "D", descriptor = "I")
    public static int field9112;

    @OriginalMember(owner = "client!ib", name = "H", descriptor = "I")
    public static int field9116;

    @OriginalMember(owner = "client!ib", name = "I", descriptor = "I")
    public static int field9117;

    @OriginalMember(owner = "client!ib", name = "R", descriptor = "I")
    public static int field9125;

    @OriginalMember(owner = "client!ib", name = "S", descriptor = "Lmf;")
    public static class409 field9126;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(SI)V")
    private final void method3608(short arg0, int arg1) {
        field9108++;
        if (Stream.method2042()) {
            this.field9102.method2036(arg0);
        } else {
            this.field9102.method2038(arg0);
        }
        if (arg1 != 26927) {
            field9124 = null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(BI)Z")
    public static final boolean method3609(byte arg0, int arg1) {
        if (arg0 < 82) {
            return false;
        }
        field9110++;
        if (arg1 == 49 || arg1 == 25 || arg1 == 60 || arg1 == 18 || arg1 == 51) {
            return true;
        } else {
            return arg1 == 11 || arg1 == 1004;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IBII[[Z)V")
    public final void method3610(int arg0, byte arg1, int arg2, int arg3, boolean[][] arg4) {
        field9117++;
        if (this.field9122 == null || this.field9106 > (arg2 + arg3) || this.field9118 < (arg2 - arg3) || this.field9105 > (arg0 + arg3) || this.field9121 < arg0 - arg3 || arg1 != -26) {
            return;
        }
        for (int var6 = this.field9105; var6 <= this.field9121; var6++) {
            for (int var7 = this.field9106; var7 <= this.field9118; var7++) {
                int var8 = var7 - arg2;
                int var9 = var6 - arg0;
                if (var8 > -arg3 && arg3 > var8 && (-arg3) < var9 && var9 < arg3 && arg4[arg3 + var8][arg3 + var9]) {
                    this.field9107.method2896((byte) ((int) (this.field9103.method1777(-4) * 255.0F)), -1386621944);
                    this.field9107.method131(3438, this.field9115, 0);
                    this.field9107.method98((byte) 15, this.field9107.field7380);
                    this.field9107.method116(this.field9104 / 3, 0, this.field9109, this.field9122, class334.field4660, (byte) -50, 0);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method3611(int arg0, String arg1) {
        field9101++;
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = arg0; var4 < var2; var4++) {
            var3 = (var3 << 5) - (var3 - arg1.charAt(var4));
        }
        return var3;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIZII)V")
    private final void method3612(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field9112++;
        long var8 = -1L;
        int var10 = (arg2 << this.field9113.field9707) + arg5;
        int var11 = (arg0 << this.field9113.field9707) + arg3;
        int var12 = this.field9113.method3861((byte) 124, var10, var11);
        if ((arg5 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
            var8 = (long) var10 & 0xFFFFL | (long) var11 << 16 & 0xFFFFL << 16;
            class435 var13 = this.field9120.method2818(-22803, var8);
            if (var13 != null) {
                this.method3608(((class497) var13).field7404, 26927);
                return;
            }
        }
        short var14 = (short) (this.field9109++);
        if (var8 != -1L) {
            this.field9120.method2816(new class497(var14), var8, false);
        }
        float var15;
        float var16;
        float var17;
        if (arg5 == 0 && arg3 == 0) {
            var15 = this.field9099[arg6][arg1];
            var16 = this.field9111[arg6][arg1];
            var17 = this.field9100[arg6][arg1];
        } else if (this.field9113.field9709 == arg5 && arg3 == 0) {
            var17 = this.field9100[arg6 + 1][arg1];
            var15 = this.field9099[arg6 + 1][arg1];
            var16 = this.field9111[arg6 + 1][arg1];
        } else if (this.field9113.field9709 == arg5 && this.field9113.field9709 == arg3) {
            var17 = this.field9100[arg6 + 1][arg1 + 1];
            var16 = this.field9111[arg6 + 1][arg1 + 1];
            var15 = this.field9099[arg6 + 1][arg1 + 1];
        } else if (arg5 == 0 && this.field9113.field9709 == arg3) {
            var15 = this.field9099[arg6][arg1 + 1];
            var17 = this.field9100[arg6][arg1 + 1];
            var16 = this.field9111[arg6][arg1 + 1];
        } else {
            float var18 = (float) arg5 / (float) this.field9113.field9709;
            float var19 = (float) arg3 / (float) this.field9113.field9709;
            float var20 = this.field9099[arg6][arg1];
            float var21 = this.field9111[arg6][arg1];
            float var22 = this.field9100[arg6][arg1];
            float var23 = this.field9099[arg6 + 1][arg1];
            float var24 = this.field9111[arg6 + 1][arg1];
            float var25 = (this.field9099[arg6][arg1 + 1] - var20) * var18 + var20;
            float var26 = (this.field9111[arg6][arg1 + 1] - var21) * var18 + var21;
            float var27 = (this.field9099[arg6 + 1][arg1 + 1] - var23) * var18 + var23;
            float var28 = (this.field9111[arg6 + 1][arg1 + 1] - var24) * var18 + var24;
            float var29 = this.field9100[arg6 + 1][arg1];
            float var30 = (this.field9100[arg6][arg1 + 1] - var22) * var18 + var22;
            var16 = (var28 - var26) * var19 + var26;
            float var31 = (this.field9100[arg6 + 1][arg1 + 1] - var29) * var18 + var29;
            var15 = (var27 - var25) * var19 + var25;
            var17 = (var31 - var30) * var19 + var30;
        }
        float var32 = (float) (this.field9103.method1776((byte) -116) - var10);
        float var33 = (float) (this.field9103.method1775((byte) 81) - var12);
        float var34 = (float) (this.field9103.method1771(arg4) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var34 * var36;
        float var38 = var33 * var36;
        float var39 = var32 * var36;
        float var40 = var35 / (float) this.field9103.method1772(arg4);
        float var41 = 1.0F - (var40 * var40);
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var17 * var37 + var15 * var39 + var16 * var38;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field9103.method1774(45);
        int var45 = (int) ((float) (var44 >> 16 & 0xFF) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) (var44 >> 8 & 0xFF) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (Stream.method2042()) {
            this.field9114.method2037((float) var10);
            this.field9114.method2037((float) var12);
            this.field9114.method2037((float) var11);
        } else {
            this.field9114.method2035((float) var10);
            this.field9114.method2035((float) var12);
            this.field9114.method2035((float) var11);
        }
        if (var47 > 255) {
            var47 = 255;
        }
        if (this.field9107.field7304 == 0) {
            this.field9114.method2029(var47);
            this.field9114.method2029(var46);
            this.field9114.method2029(var45);
        } else {
            this.field9114.method2029(var45);
            this.field9114.method2029(var46);
            this.field9114.method2029(var47);
        }
        this.field9114.method2029(255);
        this.method3608(var14, 26927);
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(IB)V")
    public static final void method3613(int arg0, byte arg1) {
        int var2 = -119 / ((51 - arg1) / 54);
        class313.field4339 = arg0;
        field9116++;
        class638.field9056.method936(-49);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V")
    public static void method3614(byte arg0) {
        field9126 = null;
        field9119 = null;
        field9123 = null;
        field9124 = null;
        if (arg0 != 50) {
            field9124 = null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Lnh;Lsq;Lam;[I)V")
    public class642(class495 arg0, class194 arg1, class289 arg2, int[] arg3) {
        this.field9103 = arg2;
        this.field9107 = arg0;
        this.field9113 = arg1;
        int var5 = this.field9103.method1772(true) - (arg1.field9709 >> 1);
        this.field9106 = this.field9103.method1776((byte) -116) - var5 >> arg1.field9707;
        this.field9118 = var5 + this.field9103.method1776((byte) -116) >> arg1.field9707;
        this.field9105 = this.field9103.method1771(true) - var5 >> arg1.field9707;
        this.field9121 = var5 + this.field9103.method1771(true) >> arg1.field9707;
        int var6 = this.field9118 + 1 - this.field9106;
        int var7 = this.field9121 + 1 - this.field9105;
        this.field9099 = new float[var6 + 1][var7 + 1];
        this.field9100 = new float[var6 + 1][var7 + 1];
        this.field9111 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var27 = this.field9105 + var8;
            if (var27 > 0 && var27 < (this.field9113.field9703 - 1)) {
                for (int var28 = 0; var28 <= var6; var28++) {
                    int var29 = this.field9106 + var28;
                    if (var29 > 0 && this.field9113.field9706 - 1 > var29) {
                        int var30 = arg1.method3858(var27, var29 + 1, (byte) 84) - arg1.method3858(var27, var29 - 1, (byte) 38);
                        int var31 = arg1.method3858(var27 + 1, var29, (byte) 56) - arg1.method3858(var27 - 1, var29, (byte) 37);
                        float var32 = (float) (1.0D / Math.sqrt((double) (var31 * var31 + var30 * var30 + 65536)));
                        this.field9099[var28][var8] = (float) var30 * var32;
                        this.field9111[var28][var8] = var32 * -256.0F;
                        this.field9100[var28][var8] = (float) var31 * var32;
                    }
                }
            }
        }
        int var9 = 0;
        for (int var10 = this.field9105; var10 <= this.field9121; var10++) {
            if (var10 >= 0 && var10 < arg1.field9703) {
                for (int var23 = this.field9106; var23 <= this.field9118; var23++) {
                    if (var23 >= 0 && var23 < arg1.field9706) {
                        int var24 = arg3[var9];
                        int[] var25 = arg1.field3000[var23][var10];
                        if (var25 != null && var24 != 0) {
                            if (var24 == 1) {
                                int var26 = 0;
                                while (var25.length > var26) {
                                    if (var25[var26++] != -1 && var25[var26++] != -1 && var25[var26++] != -1) {
                                        this.field9104 += 3;
                                    }
                                }
                            } else {
                                this.field9104 += 3;
                            }
                        }
                    }
                    var9++;
                }
            } else {
                var9 += this.field9118 - this.field9106;
            }
        }
        if (this.field9104 > 0) {
            this.field9120 = new class482(class99.method830(this.field9104, false));
            this.field9122 = this.field9107.method115((byte) 123, false);
            this.field9122.method238(-22454, this.field9104);
            NativeHeapBuffer var11 = this.field9107.method2945((byte) -121, this.field9104 * 16, false);
            this.field9114 = new Stream(var11);
            while (true) {
                Buffer var12;
                do {
                    var12 = this.field9122.method1283((byte) 0, true);
                } while (var12 == null);
                this.field9102 = new Stream(var12);
                int var13 = 0;
                int var14 = 0;
                for (int var15 = this.field9105; var15 <= this.field9121; var15++) {
                    if (var15 >= 0 && arg1.field9703 > var15) {
                        int var16 = 0;
                        for (int var17 = this.field9106; var17 <= this.field9118; var17++) {
                            if (var17 >= 0 && var17 < arg1.field9706) {
                                int var18 = arg3[var14];
                                int[] var19 = arg1.field3000[var17][var15];
                                if (var19 != null && var18 != 0) {
                                    if (var18 == 1) {
                                        int[] var20 = arg1.field3006[var17][var15];
                                        int[] var21 = arg1.field3004[var17][var15];
                                        int var22 = 0;
                                        label121: while (true) {
                                            while (true) {
                                                if (var22 >= var19.length) {
                                                    break label121;
                                                }
                                                if (var19[var22] == -1 || var19[var22 + 1] == -1 || var19[var22 + 2] == -1) {
                                                    var22 += 3;
                                                } else {
                                                    this.method3612(var15, var13, var17, var21[var22], true, var20[var22], var16);
                                                    var22++;
                                                    this.method3612(var15, var13, var17, var21[var22], true, var20[var22], var16);
                                                    var22++;
                                                    this.method3612(var15, var13, var17, var21[var22], true, var20[var22], var16);
                                                    var22++;
                                                }
                                            }
                                        }
                                    } else if (var18 == 3) {
                                        this.method3612(var15, var13, var17, 0, true, 0, var16);
                                        this.method3612(var15, var13, var17, 0, true, arg1.field9709, var16);
                                        this.method3612(var15, var13, var17, arg1.field9709, true, 0, var16);
                                    } else if (var18 == 2) {
                                        this.method3612(var15, var13, var17, 0, true, arg1.field9709, var16);
                                        this.method3612(var15, var13, var17, arg1.field9709, true, arg1.field9709, var16);
                                        this.method3612(var15, var13, var17, 0, true, 0, var16);
                                    } else if (var18 == 5) {
                                        this.method3612(var15, var13, var17, arg1.field9709, true, arg1.field9709, var16);
                                        this.method3612(var15, var13, var17, arg1.field9709, true, 0, var16);
                                        this.method3612(var15, var13, var17, 0, true, arg1.field9709, var16);
                                    } else if (var18 == 4) {
                                        this.method3612(var15, var13, var17, arg1.field9709, true, 0, var16);
                                        this.method3612(var15, var13, var17, 0, true, 0, var16);
                                        this.method3612(var15, var13, var17, arg1.field9709, true, arg1.field9709, var16);
                                    }
                                }
                            }
                            var16++;
                            var14++;
                        }
                    } else {
                        var14 += this.field9118 - this.field9106;
                    }
                    var13++;
                }
                this.field9102.method2034();
                if (this.field9122.method1284(-28439)) {
                    this.field9114.method2034();
                    this.field9115 = this.field9107.method119(false, 0);
                    this.field9115.method534(16, var11, this.field9109 * 16, (byte) -32);
                    break;
                }
                this.field9114.method2031(0);
                this.field9120.method2821(1);
            }
        } else {
            this.field9122 = null;
            this.field9115 = null;
        }
        this.field9114 = null;
        this.field9120 = null;
        this.field9099 = this.field9111 = this.field9100 = null;
        this.field9102 = null;
    }
}
