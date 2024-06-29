import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class16 extends class130 {

    @OriginalMember(owner = "client!c", name = "yb", descriptor = "I")
    public int field398 = 0;

    @OriginalMember(owner = "client!c", name = "mb", descriptor = "[[B")
    private byte[][] field386 = new byte[256][];

    @OriginalMember(owner = "client!c", name = "vb", descriptor = "Ljava/util/Random;")
    private Random field395 = new Random();

    @OriginalMember(owner = "client!c", name = "Db", descriptor = "Z")
    private boolean field403 = false;

    @OriginalMember(owner = "client!c", name = "ub", descriptor = "[I")
    private int[] field394;

    @OriginalMember(owner = "client!c", name = "zb", descriptor = "[I")
    private int[] field399;

    @OriginalMember(owner = "client!c", name = "jb", descriptor = "[I")
    private int[] field383;

    @OriginalMember(owner = "client!c", name = "Jb", descriptor = "I")
    private int field409;

    @OriginalMember(owner = "client!c", name = "Eb", descriptor = "I")
    private int field404;

    @OriginalMember(owner = "client!c", name = "ob", descriptor = "Lpd;")
    private static class94 field388 = class28.method249(-56, "bla");

    @OriginalMember(owner = "client!c", name = "pb", descriptor = "Lpd;")
    private static class94 field389 = class28.method249(-97, "gr3");

    @OriginalMember(owner = "client!c", name = "nb", descriptor = "Lpd;")
    private static class94 field387 = class28.method249(106, "dbl");

    @OriginalMember(owner = "client!c", name = "rb", descriptor = "Lpd;")
    private static class94 field391 = class28.method249(24, "gr1");

    @OriginalMember(owner = "client!c", name = "kb", descriptor = "Lpd;")
    private static class94 field384 = class28.method249(-102, "gr2");

    @OriginalMember(owner = "client!c", name = "lb", descriptor = "Lpd;")
    private static class94 field385 = class28.method249(-74, "or2");

    @OriginalMember(owner = "client!c", name = "xb", descriptor = "Lpd;")
    private static class94 field397 = class28.method249(-90, "or1");

    @OriginalMember(owner = "client!c", name = "Bb", descriptor = "Lpd;")
    private static class94 field401 = class28.method249(102, "str");

    @OriginalMember(owner = "client!c", name = "qb", descriptor = "Lpd;")
    private static class94 field390 = class28.method249(-69, "cya");

    @OriginalMember(owner = "client!c", name = "sb", descriptor = "Lpd;")
    private static class94 field392 = class28.method249(27, "red");

    @OriginalMember(owner = "client!c", name = "Ab", descriptor = "Lpd;")
    private static class94 field400 = class28.method249(82, "blu");

    @OriginalMember(owner = "client!c", name = "Cb", descriptor = "Lpd;")
    private static class94 field402 = class28.method249(-125, "mag");

    @OriginalMember(owner = "client!c", name = "wb", descriptor = "[Lpd;")
    private static class94[] field396 = new class94[100];

    @OriginalMember(owner = "client!c", name = "tb", descriptor = "Lpd;")
    private static class94 field393 = class28.method249(39, "lre");

    @OriginalMember(owner = "client!c", name = "Hb", descriptor = "Lpd;")
    private static class94 field407 = class28.method249(-97, "gre");

    @OriginalMember(owner = "client!c", name = "Gb", descriptor = "Lpd;")
    private static class94 field406 = class28.method249(48, "yel");

    @OriginalMember(owner = "client!c", name = "Kb", descriptor = "Lpd;")
    private static class94 field410 = class28.method249(48, "dre");

    @OriginalMember(owner = "client!c", name = "Fb", descriptor = "Lpd;")
    private static class94 field405 = class28.method249(-53, "whi");

    @OriginalMember(owner = "client!c", name = "Ib", descriptor = "Lpd;")
    private static class94 field408 = class28.method249(-51, "or3");

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lpd;IIIZ)V", line = 13)
    public final void method103(class94 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field403 = false;
        int var6 = arg1;
        if (arg0 == null) {
            return;
        }
        int var7 = arg2 - this.field398;
        for (int var8 = 0; var8 < arg0.field2396; var8++) {
            if (arg0.field2382[var8] == 64 && var8 + 4 < arg0.field2396 && arg0.field2382[var8 + 4] == 64) {
                int var9 = this.method106(arg0.method706(var8 + 4, (byte) 116, var8 + 1));
                if (var9 != -1) {
                    arg3 = var9;
                }
                var8 += 4;
            } else {
                int var10 = arg0.field2382[var8] & 0xFF;
                if (var10 != 32) {
                    if (arg4) {
                        this.method109(this.field386[var10], arg1 + 1, this.field394[var10] + var7 + 1, this.field399[var10], this.field383[var10], 0);
                    }
                    this.method109(this.field386[var10], arg1, this.field394[var10] + var7, this.field399[var10], this.field383[var10], arg3);
                }
                arg1 += this.field399[var10];
            }
        }
        if (this.field403) {
            class130.method1020(var6, (int) ((double) this.field398 * 0.7D) + var7, arg1 - var6, 8388608);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lpd;IIIZI)V", line = 55)
    public final void method104(class94 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.field395.setSeed((long) arg5);
        int var7 = (this.field395.nextInt() & 0x1F) + 192;
        int var8 = arg2 - this.field398;
        for (int var9 = 0; var9 < arg0.field2396; var9++) {
            if (arg0.field2382[var9] == 64 && var9 + 4 < arg0.field2396 && arg0.field2382[var9 + 4] == 64) {
                int var10 = this.method106(arg0.method706(var9 + 4, (byte) 116, var9 + 1));
                if (var10 != -1) {
                    arg3 = var10;
                }
                var9 += 4;
            } else {
                int var11 = arg0.field2382[var9] & 0xFF;
                if (var11 != 32) {
                    if (arg4) {
                        this.method119(this.field386[var11], arg1 + 1, this.field394[var11] + var8 + 1, this.field399[var11], this.field383[var11], 0, 192);
                    }
                    this.method119(this.field386[var11], arg1, this.field394[var11] + var8, this.field399[var11], this.field383[var11], arg3, var7);
                }
                arg1 += this.field399[var11];
                if ((this.field395.nextInt() & 0x3) == 0) {
                    arg1++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lpd;IIII)V", line = 98)
    public final void method105(class94 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 == null) {
            return;
        }
        int var6 = arg1 - this.method118(arg0) / 2;
        int var7 = arg2 - this.field398;
        for (int var8 = 0; var8 < arg0.method710(-123); var8++) {
            int var9 = arg0.field2382[var8] & 0xFF;
            if (var9 != 32) {
                this.method109(this.field386[var9], var6 + (int) (Math.sin((double) arg4 / 5.0D + (double) var8 / 5.0D) * 5.0D), this.field394[var9] + var7 + (int) (Math.sin((double) arg4 / 5.0D + (double) var8 / 3.0D) * 5.0D), this.field399[var9], this.field383[var9], arg3);
            }
            var6 += this.field399[var9];
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lpd;)I", line = 124)
    private final int method106(class94 arg0) {
        if (arg0.method689((byte) 59, field392)) {
            return 16711680;
        } else if (arg0.method689((byte) 59, field407)) {
            return 65280;
        } else if (arg0.method689((byte) 59, field400)) {
            return 255;
        } else if (arg0.method689((byte) 59, field406)) {
            return 16776960;
        } else if (arg0.method689((byte) 59, field390)) {
            return 65535;
        } else if (arg0.method689((byte) 59, field402)) {
            return 16711935;
        } else if (arg0.method689((byte) 59, field405)) {
            return 16777215;
        } else if (arg0.method689((byte) 59, field388)) {
            return 0;
        } else if (arg0.method689((byte) 59, field393)) {
            return 16748608;
        } else if (arg0.method689((byte) 59, field410)) {
            return 8388608;
        } else if (arg0.method689((byte) 59, field387)) {
            return 128;
        } else if (arg0.method689((byte) 59, field397)) {
            return 16756736;
        } else if (arg0.method689((byte) 59, field385)) {
            return 16740352;
        } else if (arg0.method689((byte) 59, field408)) {
            return 16723968;
        } else if (arg0.method689((byte) 59, field391)) {
            return 12648192;
        } else if (arg0.method689((byte) 59, field384)) {
            return 8453888;
        } else if (arg0.method689((byte) 59, field389)) {
            return 4259584;
        } else {
            if (arg0.method689((byte) 59, field401)) {
                this.field403 = true;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(Lpd;IIIZ)V", line = 182)
    public final void method107(class94 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.method103(arg0, arg1 - this.method113(arg0), arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(Lpd;IIIZI)V", line = 185)
    private final void method108(class94 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        class94 var7 = arg0.method718(11083);
        int var8 = 0;
        for (int var9 = 0; var9 < var7.method710(-123); var9++) {
            if (var7.method695(false, var9) == 32) {
                var8++;
            }
        }
        int var10 = 0;
        int var11 = 0;
        if (var8 > 0) {
            var10 = (arg5 - this.method113(var7)) * 256 / var8;
        }
        this.field403 = false;
        int var12 = arg1;
        if (var7 == null) {
            return;
        }
        int var13 = arg2 - this.field398;
        for (int var14 = 0; var14 < var7.field2396; var14++) {
            if (var7.field2382[var14] == 64 && var14 + 4 < var7.field2396 && var7.field2382[var14 + 4] == 64) {
                int var15 = this.method106(var7.method706(var14 + 4, (byte) 116, var14 + 1));
                if (var15 != -1) {
                    arg3 = var15;
                }
                var14 += 4;
            } else {
                int var16 = var7.field2382[var14] & 0xFF;
                if (var16 != 32) {
                    if (arg4) {
                        this.method109(this.field386[var16], arg1 + 1, this.field394[var16] + var13 + 1, this.field399[var16], this.field383[var16], 0);
                    }
                    this.method109(this.field386[var16], arg1, this.field394[var16] + var13, this.field399[var16], this.field383[var16], arg3);
                }
                arg1 += this.field399[var16];
                if (var16 == 32) {
                    int var17 = var10 + var11;
                    arg1 += var17 / 256;
                    var11 = var17 & 0xFF;
                }
            }
        }
        if (this.field403) {
            class130.method1020(var12, (int) ((double) this.field398 * 0.7D) + var13, arg1 - var12, 8388608);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "([BIIIII)V", line = 261)
    private final void method109(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class130.field3239 * arg2 + arg1;
        int var8 = class130.field3239 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class130.field3241) {
            int var11 = class130.field3241 - arg2;
            arg4 -= var11;
            arg2 = class130.field3241;
            var10 += arg3 * var11;
            var7 += class130.field3239 * var11;
        }
        if (arg2 + arg4 > class130.field3243) {
            arg4 -= arg2 + arg4 - class130.field3243;
        }
        if (arg1 < class130.field3238) {
            int var12 = class130.field3238 - arg1;
            arg3 -= var12;
            arg1 = class130.field3238;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class130.field3240) {
            int var13 = arg1 + arg3 - class130.field3240;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method123(class130.field3242, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lpd;III)V", line = 311)
    public final void method110(class94 arg0, int arg1, int arg2, int arg3) {
        this.method115(arg0, arg1 - this.method118(arg0), arg2, arg3);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lpd;IIIII)V", line = 314)
    public final void method111(class94 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        double var7 = 7.0D - (double) arg5 / 8.0D;
        if (var7 < 0.0D) {
            var7 = 0.0D;
        }
        int var9 = arg1 - this.method118(arg0) / 2;
        int var10 = arg2 - this.field398;
        for (int var11 = 0; var11 < arg0.method710(-123); var11++) {
            int var12 = arg0.field2382[var11] & 0xFF;
            if (var12 != 32) {
                this.method109(this.field386[var12], var9, this.field394[var12] + var10 + (int) (Math.sin((double) var11 / 1.5D + (double) arg4) * var7), this.field399[var12], this.field383[var12], arg3);
            }
            var9 += this.field399[var12];
        }
    }

    @OriginalMember(owner = "client!c", name = "d", descriptor = "()V", line = 347)
    public static void method112() {
        field392 = null;
        field407 = null;
        field400 = null;
        field406 = null;
        field390 = null;
        field402 = null;
        field405 = null;
        field388 = null;
        field393 = null;
        field410 = null;
        field387 = null;
        field397 = null;
        field385 = null;
        field408 = null;
        field391 = null;
        field384 = null;
        field389 = null;
        field401 = null;
        field396 = null;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(Lpd;)I", line = 371)
    public final int method113(class94 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.field2396; var3++) {
            if (arg0.field2382[var3] == 64 && var3 + 4 < arg0.field2396 && arg0.field2382[var3 + 4] == 64) {
                var3 += 4;
            } else {
                var2 += this.field399[arg0.field2382[var3] & 0xFF];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(Lpd;IIII)V", line = 394)
    public final void method114(class94 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 == null) {
            return;
        }
        int var6 = arg1 - this.method118(arg0) / 2;
        int var7 = arg2 - this.field398;
        for (int var8 = 0; var8 < arg0.field2396; var8++) {
            int var9 = arg0.field2382[var8] & 0xFF;
            if (var9 != 32) {
                this.method109(this.field386[var9], var6, this.field394[var9] + var7 + (int) (Math.sin((double) arg4 / 5.0D + (double) var8 / 2.0D) * 5.0D), this.field399[var9], this.field383[var9], arg3);
            }
            var6 += this.field399[var9];
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(Lpd;III)V", line = 415)
    public final void method115(class94 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return;
        }
        int var5 = arg2 - this.field398;
        for (int var6 = 0; var6 < arg0.field2396; var6++) {
            int var7 = arg0.field2382[var6] & 0xFF;
            if (var7 != 32) {
                this.method109(this.field386[var7], arg1, this.field394[var7] + var5, this.field399[var7], this.field383[var7], arg3);
            }
            arg1 += this.field399[var7];
        }
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(Lpd;IIIZ)V", line = 441)
    public final void method116(class94 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.method103(arg0, arg1 - this.method113(arg0) / 2, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "([I[BIIIIIIII)V", line = 445)
    private final void method117(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var11 = ((arg2 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((arg2 & 0xFF00) * arg9 & 0xFF0000) >> 8;
        int var12 = 256 - arg9;
        for (int var13 = -arg6; var13 < 0; var13++) {
            for (int var14 = -arg5; var14 < 0; var14++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    int var15 = arg0[arg4];
                    arg0[arg4++] = (((var15 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var15 & 0xFF00) * var12 & 0xFF0000) >> 8) + var11;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(Lpd;)I", line = 476)
    public final int method118(class94 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.field2396; var3++) {
            var2 += this.field399[arg0.field2382[var3] & 0xFF];
        }
        return var2;
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "([I[I[I[I[[B)V", line = 806)
    public class16(int[] arg0, int[] arg1, int[] arg2, int[] arg3, byte[][] arg4) {
        this.field394 = arg0;
        this.field399 = arg1;
        this.field383 = arg2;
        byte var6 = 0;
        for (int var7 = 1; var7 < arg3.length; var7++) {
            if (arg3[var7] == 1) {
                var6 = (byte) var7;
            }
        }
        this.field386 = arg4;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field394[var10] < var8) {
                var8 = this.field394[var10];
            }
            if (this.field394[var10] + this.field383[var10] > var9) {
                var9 = this.field394[var10] + this.field383[var10];
            }
            byte[] var11 = this.field386[var10];
            int var12 = var11.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11[var13] = (byte) (var11[var13] == var6 ? 0 : 1);
            }
        }
        this.field398 = this.field394[32] + this.field383[32];
        this.field409 = this.field398 - var8;
        this.field404 = var9 - this.field398;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "([BIIIIII)V", line = 510)
    private final void method119(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = class130.field3239 * arg2 + arg1;
        int var9 = class130.field3239 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class130.field3241) {
            int var12 = class130.field3241 - arg2;
            arg4 -= var12;
            arg2 = class130.field3241;
            var11 += arg3 * var12;
            var8 += class130.field3239 * var12;
        }
        if (arg2 + arg4 > class130.field3243) {
            arg4 -= arg2 + arg4 - class130.field3243;
        }
        if (arg1 < class130.field3238) {
            int var13 = class130.field3238 - arg1;
            arg3 -= var13;
            arg1 = class130.field3238;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class130.field3240) {
            int var14 = arg1 + arg3 - class130.field3240;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method117(class130.field3242, arg0, arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(Lpd;III)V", line = 569)
    public final void method120(class94 arg0, int arg1, int arg2, int arg3) {
        this.method115(arg0, arg1 - this.method118(arg0) / 2, arg2, arg3);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lpd;IIIIIZIII)V", line = 588)
    public final void method121(class94 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return;
        }
        int var11 = 0;
        int var12 = 0;
        class94 var13 = class86.method628(100, (byte) -111);
        int var14 = -1;
        int var15 = 0;
        class94 var16 = null;
        if (arg9 == 0) {
            arg9 = this.field409;
        }
        boolean var17 = true;
        if (arg4 < this.field409 + this.field404 + arg9 && arg4 < arg9 + arg9) {
            var17 = false;
        }
        int var18 = 0;
        int var19 = arg0.method710(-123);
        for (int var20 = 0; var20 < var19; var20++) {
            int var24 = arg0.method695(false, var20);
            if (var24 == 64 && var20 + 4 < var19 && arg0.method695(false, var20 + 4) == 64) {
                var16 = arg0.method706(var20 + 5, (byte) 116, var20);
                var13.method690(0, var16);
                var20 += 4;
            } else if (var24 == 92 && var20 + 1 < var19 && arg0.method695(false, var20 + 1) == 110) {
                var16 = null;
                field396[var18++] = var13.method706(var13.method710(-123), (byte) 116, var12).method718(11083);
                var12 = var13.method710(-123);
                var11 = 0;
                var14 = -1;
                var20++;
            } else {
                var13.method725(var24, 0);
                var11 += this.method122(var24);
                if (var24 == 32 || var24 == 45) {
                    var14 = var13.method710(-123);
                    var15 = var11;
                }
                if (var17 && var11 > arg3 && var14 >= 0) {
                    field396[var18++] = var13.method706(var14, (byte) 116, var12).method718(11083);
                    var12 = var14;
                    var14 = -1;
                    var11 -= var15;
                    if (var16 != null && var12 > 4) {
                        var12 -= 5;
                        var13.method708((byte) 116, var12, var16);
                    }
                }
            }
        }
        if (var13.method710(-123) > var12) {
            field396[var18++] = var13.method706(var13.method710(-123), (byte) 116, var12).method718(11083);
        }
        if (arg8 == 3 && var18 == 1) {
            arg8 = 1;
        }
        int var21;
        if (arg8 == 0) {
            var21 = this.field409 + arg2;
        } else if (arg8 == 1) {
            var21 = (arg4 - this.field409 - this.field404 - (var18 - 1) * arg9) / 2 + this.field409 + arg2;
        } else if (arg8 == 2) {
            var21 = arg2 + arg4 - this.field404 - (var18 - 1) * arg9;
        } else {
            int var22 = (arg4 - this.field409 - this.field404 - (var18 - 1) * arg9) / (var18 + 1);
            if (var22 < 0) {
                var22 = 0;
            }
            var21 = this.field409 + arg2 + var22;
            arg9 += var22;
        }
        for (int var23 = 0; var23 < var18; var23++) {
            if (arg7 == 0) {
                this.method103(field396[var23], arg1, var21, arg5, arg6);
            } else if (arg7 == 1) {
                this.method116(field396[var23], arg3 / 2 + arg1, var21, arg5, arg6);
            } else if (arg7 == 2) {
                this.method107(field396[var23], arg1 + arg3, var21, arg5, arg6);
            } else if (var18 - 1 == var23) {
                this.method103(field396[var23], arg1, var21, arg5, arg6);
            } else {
                this.method108(field396[var23], arg1, var21, arg5, arg6, arg3);
            }
            var21 += arg9;
        }
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(I)I", line = 727)
    public final int method122(int arg0) {
        return this.field399[arg0 & 0xFF];
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "([I[BIIIIIII)V", line = 732)
    private final void method123(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = -(arg5 >> 2);
        int var11 = -(arg5 & 0x3);
        for (int var12 = -arg6; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
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
            for (int var14 = var11; var14 < 0; var14++) {
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
}
