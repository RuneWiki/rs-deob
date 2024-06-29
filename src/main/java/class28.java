import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class28 extends class142 {

    @OriginalMember(owner = "client!df", name = "bb", descriptor = "I")
    public int field668 = 0;

    @OriginalMember(owner = "client!df", name = "lb", descriptor = "[[B")
    private byte[][] field678 = new byte[256][];

    @OriginalMember(owner = "client!df", name = "wb", descriptor = "Ljava/util/Random;")
    private Random field689 = new Random();

    @OriginalMember(owner = "client!df", name = "kb", descriptor = "[I")
    private int[] field677;

    @OriginalMember(owner = "client!df", name = "qb", descriptor = "[I")
    private int[] field683;

    @OriginalMember(owner = "client!df", name = "mb", descriptor = "[I")
    private int[] field679;

    @OriginalMember(owner = "client!df", name = "Ab", descriptor = "I")
    private int field693;

    @OriginalMember(owner = "client!df", name = "Bb", descriptor = "I")
    private int field694;

    @OriginalMember(owner = "client!df", name = "eb", descriptor = "[Lmb;")
    private static class84[] field671 = new class84[100];

    @OriginalMember(owner = "client!df", name = "ib", descriptor = "Lmb;")
    private static class84 field675 = class79.method672(true, "or2");

    @OriginalMember(owner = "client!df", name = "jb", descriptor = "Lmb;")
    private static class84 field676 = class79.method672(true, "gr3");

    @OriginalMember(owner = "client!df", name = "ab", descriptor = "Lmb;")
    private static class84 field667 = class79.method672(true, "red");

    @OriginalMember(owner = "client!df", name = "nb", descriptor = "Lmb;")
    private static class84 field680 = class79.method672(true, "gr2");

    @OriginalMember(owner = "client!df", name = "pb", descriptor = "Lmb;")
    private static class84 field682 = class79.method672(true, "@str@");

    @OriginalMember(owner = "client!df", name = "cb", descriptor = "Lmb;")
    private static class84 field669 = class79.method672(true, "bla");

    @OriginalMember(owner = "client!df", name = "ob", descriptor = "Lmb;")
    private static class84 field681 = class79.method672(true, "gre");

    @OriginalMember(owner = "client!df", name = "gb", descriptor = "Z")
    private static boolean field673 = false;

    @OriginalMember(owner = "client!df", name = "sb", descriptor = "Lmb;")
    private static class84 field685 = class79.method672(true, "blu");

    @OriginalMember(owner = "client!df", name = "db", descriptor = "Lmb;")
    private static class84 field670 = class79.method672(true, "lre");

    @OriginalMember(owner = "client!df", name = "hb", descriptor = "Lmb;")
    private static class84 field674 = class79.method672(true, "dbl");

    @OriginalMember(owner = "client!df", name = "rb", descriptor = "Lmb;")
    private static class84 field684 = class79.method672(true, "str");

    @OriginalMember(owner = "client!df", name = "Z", descriptor = "Lmb;")
    private static class84 field666 = class79.method672(true, "whi");

    @OriginalMember(owner = "client!df", name = "tb", descriptor = "Lmb;")
    private static class84 field686 = class79.method672(true, "dre");

    @OriginalMember(owner = "client!df", name = "ub", descriptor = "Lmb;")
    private static class84 field687 = class79.method672(true, "gr1");

    @OriginalMember(owner = "client!df", name = "yb", descriptor = "Lmb;")
    private static class84 field691 = class79.method672(true, "yel");

    @OriginalMember(owner = "client!df", name = "vb", descriptor = "Lmb;")
    private static class84 field688 = class79.method672(true, "or3");

    @OriginalMember(owner = "client!df", name = "fb", descriptor = "Lmb;")
    private static class84 field672 = class79.method672(true, "or1");

    @OriginalMember(owner = "client!df", name = "xb", descriptor = "Lmb;")
    private static class84 field690 = class79.method672(true, "mag");

    @OriginalMember(owner = "client!df", name = "zb", descriptor = "Lmb;")
    private static class84 field692 = class79.method672(true, "cya");

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lmb;)I")
    public final int method200(class84 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.field2062; var3++) {
            if (arg0.field2058[var3] == 64 && var3 + 4 < arg0.field2062 && arg0.field2058[var3 + 4] == 64) {
                var3 += 4;
            } else {
                var2 += this.field683[arg0.field2058[var3] & 0xFF];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lmb;IIIZI)V")
    private final void method201(class84 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        class84 var7 = arg0.method698(104);
        int var8 = 0;
        for (int var9 = 0; var9 < var7.method718(-78); var9++) {
            if (var7.method725(var9, -85) == 32) {
                var8++;
            }
        }
        int var10 = 0;
        int var11 = 0;
        if (var8 > 0) {
            var10 = (arg5 - this.method200(var7)) * 256 / var8;
        }
        field673 = false;
        int var12 = arg1;
        if (var7 == null) {
            return;
        }
        int var13 = arg2 - this.field668;
        for (int var14 = 0; var14 < var7.field2062; var14++) {
            if (var7.field2058[var14] == 64 && var14 + 4 < var7.field2062 && var7.field2058[var14 + 4] == 64) {
                int var15 = this.method207(var7.method723(false, var14 + 4, var14 + 1));
                if (var15 != -1) {
                    arg3 = var15;
                }
                var14 += 4;
            } else {
                int var16 = var7.field2058[var14] & 0xFF;
                if (var16 != 32) {
                    if (arg4) {
                        method216(this.field678[var16], arg1 + 1, this.field677[var16] + var13 + 1, this.field683[var16], this.field679[var16], 0);
                    }
                    method216(this.field678[var16], arg1, this.field677[var16] + var13, this.field683[var16], this.field679[var16], arg3);
                }
                arg1 += this.field683[var16];
                if (var16 == 32) {
                    int var17 = var10 + var11;
                    arg1 += var17 / 256;
                    var11 = var17 & 0xFF;
                }
            }
        }
        if (field673) {
            class142.method1157(var12, (int) ((double) this.field668 * 0.7D) + var13, arg1 - var12, 8388608);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lmb;IIIZ)V")
    public final void method202(class84 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.method223(arg0, arg1 - this.method200(arg0) / 2, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lmb;III)V")
    public final void method203(class84 arg0, int arg1, int arg2, int arg3) {
        this.method205(arg0, arg1 - this.method219(arg0), arg2, arg3);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lmb;IIII)V")
    public final void method204(class84 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 == null) {
            return;
        }
        int var6 = arg1 - this.method219(arg0) / 2;
        int var7 = arg2 - this.field668;
        for (int var8 = 0; var8 < arg0.field2062; var8++) {
            int var9 = arg0.field2058[var8] & 0xFF;
            if (var9 != 32) {
                method216(this.field678[var9], var6, this.field677[var9] + var7 + (int) (Math.sin((double) arg4 / 5.0D + (double) var8 / 2.0D) * 5.0D), this.field683[var9], this.field679[var9], arg3);
            }
            var6 += this.field683[var9];
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(Lmb;III)V")
    public final void method205(class84 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return;
        }
        int var5 = arg2 - this.field668;
        for (int var6 = 0; var6 < arg0.field2062; var6++) {
            int var7 = arg0.field2058[var6] & 0xFF;
            if (var7 != 32) {
                method216(this.field678[var7], arg1, this.field677[var7] + var5, this.field683[var7], this.field679[var7], arg3);
            }
            arg1 += this.field683[var7];
        }
    }

    @OriginalMember(owner = "client!df", name = "d", descriptor = "()V")
    public static void method206() {
        field684 = null;
        field682 = null;
        field667 = null;
        field681 = null;
        field685 = null;
        field691 = null;
        field692 = null;
        field690 = null;
        field666 = null;
        field669 = null;
        field670 = null;
        field686 = null;
        field674 = null;
        field672 = null;
        field675 = null;
        field688 = null;
        field687 = null;
        field680 = null;
        field676 = null;
        field671 = null;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(Lmb;)I")
    private final int method207(class84 arg0) {
        if (arg0.method720(-1, field667)) {
            return 16711680;
        } else if (arg0.method720(-1, field681)) {
            return 65280;
        } else if (arg0.method720(-1, field685)) {
            return 255;
        } else if (arg0.method720(-1, field691)) {
            return 16776960;
        } else if (arg0.method720(-1, field692)) {
            return 65535;
        } else if (arg0.method720(-1, field690)) {
            return 16711935;
        } else if (arg0.method720(-1, field666)) {
            return 16777215;
        } else if (arg0.method720(-1, field669)) {
            return 0;
        } else if (arg0.method720(-1, field670)) {
            return 16748608;
        } else if (arg0.method720(-1, field686)) {
            return 8388608;
        } else if (arg0.method720(-1, field674)) {
            return 128;
        } else if (arg0.method720(-1, field672)) {
            return 16756736;
        } else if (arg0.method720(-1, field675)) {
            return 16740352;
        } else if (arg0.method720(-1, field688)) {
            return 16723968;
        } else if (arg0.method720(-1, field687)) {
            return 12648192;
        } else if (arg0.method720(-1, field680)) {
            return 8453888;
        } else if (arg0.method720(-1, field676)) {
            return 4259584;
        } else {
            if (arg0.method720(-1, field684)) {
                field673 = true;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!df", name = "e", descriptor = "(I)I")
    public final int method208(int arg0) {
        return this.field683[arg0 & 0xFF];
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lmb;I)I")
    public final int method209(class84 arg0, int arg1) {
        int var3 = this.method215(arg0, arg1, true);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method219(field671[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(Lmb;I)I")
    public final int method210(class84 arg0, int arg1) {
        return this.method215(arg0, arg1, true);
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(Lmb;IIIZ)V")
    public final void method211(class84 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.method223(arg0, arg1 - this.method200(arg0), arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "([I[BIIIIIIII)V")
    private static final void method212(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(Lmb;III)V")
    public final void method213(class84 arg0, int arg1, int arg2, int arg3) {
        this.method205(arg0, arg1 - this.method219(arg0) / 2, arg2, arg3);
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(Lmb;IIIZI)V")
    public final void method214(class84 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.field689.setSeed((long) arg5);
        int var7 = (this.field689.nextInt() & 0x1F) + 192;
        int var8 = arg2 - this.field668;
        for (int var9 = 0; var9 < arg0.field2062; var9++) {
            if (arg0.field2058[var9] == 64 && var9 + 4 < arg0.field2062 && arg0.field2058[var9 + 4] == 64) {
                int var10 = this.method207(arg0.method723(false, var9 + 4, var9 + 1));
                if (var10 != -1) {
                    arg3 = var10;
                }
                var9 += 4;
            } else {
                int var11 = arg0.field2058[var9] & 0xFF;
                if (var11 != 32) {
                    if (arg4) {
                        method222(this.field678[var11], arg1 + 1, this.field677[var11] + var8 + 1, this.field683[var11], this.field679[var11], 0, 192);
                    }
                    method222(this.field678[var11], arg1, this.field677[var11] + var8, this.field683[var11], this.field679[var11], arg3, var7);
                }
                arg1 += this.field683[var11];
                if ((this.field689.nextInt() & 0x3) == 0) {
                    arg1++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lmb;IZ)I")
    private final int method215(class84 arg0, int arg1, boolean arg2) {
        int var4 = 0;
        int var5 = 0;
        class84 var6 = class47.method340(0, 100);
        int var7 = -1;
        int var8 = 0;
        class84 var9 = null;
        int var10 = 0;
        boolean var11 = false;
        int var12 = 0;
        int var13 = 0;
        int var14 = arg0.method718(53);
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = arg0.method725(var15, -127);
            if (var16 == 64 && var15 + 4 < var14 && arg0.method725(var15 + 4, -126) == 64) {
                class84 var17 = arg0.method723(false, var15 + 5, var15);
                if (var17.method720(-1, field684)) {
                    var11 = true;
                    var12 = var6.method718(79);
                } else {
                    var9 = var17;
                    var10 = var6.method718(101);
                }
                var6.method717(var17, -14485);
                var15 += 4;
            } else if (var16 == 92 && var15 + 1 < var14 && arg0.method725(var15 + 1, -102) == 110) {
                field671[var13++] = var6.method723(false, var6.method718(52), var5).method698(78);
                var5 = var6.method718(31);
                var4 = 0;
                var7 = -1;
                var15++;
                var9 = null;
                var11 = false;
            } else {
                var6.method707(var16, -121);
                var4 += this.method208(var16);
                if (var16 == 32 || var16 == 45) {
                    var7 = var6.method718(113);
                    var8 = var4;
                }
                if (arg2 && var4 > arg1 && var7 >= 0) {
                    field671[var13++] = var6.method723(false, var7, var5).method698(-25);
                    var5 = var7;
                    var7 = -1;
                    var4 -= var8;
                    if (var9 != null && var10 < var5 && var5 > 4) {
                        var5 -= 5;
                        var6.method712(28479, var5, var9);
                    }
                    if (var11 && var12 < var5 && var5 > 4) {
                        var5 -= 5;
                        var6.method712(28479, var5, field682);
                    }
                }
            }
        }
        if (var6.method718(127) > var5) {
            field671[var13++] = var6.method723(false, var6.method718(82), var5).method698(-14);
        }
        return var13;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "([BIIIII)V")
    private static final void method216(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = class142.field3422 * arg2 + arg1;
        int var7 = class142.field3422 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < class142.field3424) {
            int var10 = class142.field3424 - arg2;
            arg4 -= var10;
            arg2 = class142.field3424;
            var9 += arg3 * var10;
            var6 += class142.field3422 * var10;
        }
        if (arg2 + arg4 > class142.field3420) {
            arg4 -= arg2 + arg4 - class142.field3420;
        }
        if (arg1 < class142.field3421) {
            int var11 = class142.field3421 - arg1;
            arg3 -= var11;
            arg1 = class142.field3421;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > class142.field3423) {
            int var12 = arg1 + arg3 - class142.field3423;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method217(class142.field3426, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "([I[BIIIIIII)V")
    private static final void method217(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(Lmb;IIII)V")
    public final void method218(class84 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 == null) {
            return;
        }
        int var6 = arg1 - this.method219(arg0) / 2;
        int var7 = arg2 - this.field668;
        for (int var8 = 0; var8 < arg0.method718(-118); var8++) {
            int var9 = arg0.field2058[var8] & 0xFF;
            if (var9 != 32) {
                method216(this.field678[var9], var6 + (int) (Math.sin((double) arg4 / 5.0D + (double) var8 / 5.0D) * 5.0D), this.field677[var9] + var7 + (int) (Math.sin((double) arg4 / 5.0D + (double) var8 / 3.0D) * 5.0D), this.field683[var9], this.field679[var9], arg3);
            }
            var6 += this.field683[var9];
        }
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(Lmb;)I")
    public final int method219(class84 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.field2062; var3++) {
            var2 += this.field683[arg0.field2058[var3] & 0xFF];
        }
        return var2;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lmb;IIIIIZIII)V")
    public final void method220(class84 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return;
        }
        if (arg9 == 0) {
            arg9 = this.field668;
        }
        boolean var11 = true;
        if (arg4 < this.field694 + this.field693 + arg9 && arg4 < arg9 + arg9) {
            var11 = false;
        }
        int var12 = this.method215(arg0, arg3, var11);
        if (arg8 == 3 && var12 == 1) {
            arg8 = 1;
        }
        int var13;
        if (arg8 == 0) {
            var13 = this.field693 + arg2;
        } else if (arg8 == 1) {
            var13 = (arg4 - this.field693 - this.field694 - (var12 - 1) * arg9) / 2 + this.field693 + arg2;
        } else if (arg8 == 2) {
            var13 = arg2 + arg4 - this.field694 - (var12 - 1) * arg9;
        } else {
            int var14 = (arg4 - this.field693 - this.field694 - (var12 - 1) * arg9) / (var12 + 1);
            if (var14 < 0) {
                var14 = 0;
            }
            var13 = this.field693 + arg2 + var14;
            arg9 += var14;
        }
        for (int var15 = 0; var15 < var12; var15++) {
            if (arg7 == 0) {
                this.method223(field671[var15], arg1, var13, arg5, arg6);
            } else if (arg7 == 1) {
                this.method202(field671[var15], arg3 / 2 + arg1, var13, arg5, arg6);
            } else if (arg7 == 2) {
                this.method211(field671[var15], arg1 + arg3, var13, arg5, arg6);
            } else if (var12 - 1 == var15) {
                this.method223(field671[var15], arg1, var13, arg5, arg6);
            } else {
                this.method201(field671[var15], arg1, var13, arg5, arg6, arg3);
            }
            var13 += arg9;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lmb;IIIII)V")
    public final void method221(class84 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        double var7 = 7.0D - (double) arg5 / 8.0D;
        if (var7 < 0.0D) {
            var7 = 0.0D;
        }
        int var9 = arg1 - this.method219(arg0) / 2;
        int var10 = arg2 - this.field668;
        for (int var11 = 0; var11 < arg0.method718(53); var11++) {
            int var12 = arg0.field2058[var11] & 0xFF;
            if (var12 != 32) {
                method216(this.field678[var12], var9, this.field677[var12] + var10 + (int) (Math.sin((double) var11 / 1.5D + (double) arg4) * var7), this.field683[var12], this.field679[var12], arg3);
            }
            var9 += this.field683[var12];
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "([BIIIIII)V")
    private static final void method222(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = class142.field3422 * arg2 + arg1;
        int var8 = class142.field3422 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class142.field3424) {
            int var11 = class142.field3424 - arg2;
            arg4 -= var11;
            arg2 = class142.field3424;
            var10 += arg3 * var11;
            var7 += class142.field3422 * var11;
        }
        if (arg2 + arg4 > class142.field3420) {
            arg4 -= arg2 + arg4 - class142.field3420;
        }
        if (arg1 < class142.field3421) {
            int var12 = class142.field3421 - arg1;
            arg3 -= var12;
            arg1 = class142.field3421;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class142.field3423) {
            int var13 = arg1 + arg3 - class142.field3423;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method212(class142.field3426, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(Lmb;IIIZ)V")
    public final void method223(class84 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field673 = false;
        int var6 = arg1;
        if (arg0 == null) {
            return;
        }
        int var7 = arg2 - this.field668;
        for (int var8 = 0; var8 < arg0.field2062; var8++) {
            if (arg0.field2058[var8] == 64 && var8 + 4 < arg0.field2062 && arg0.field2058[var8 + 4] == 64) {
                int var9 = this.method207(arg0.method723(false, var8 + 4, var8 + 1));
                if (var9 != -1) {
                    arg3 = var9;
                }
                var8 += 4;
            } else {
                int var10 = arg0.field2058[var8] & 0xFF;
                if (var10 != 32) {
                    if (arg4) {
                        method216(this.field678[var10], arg1 + 1, this.field677[var10] + var7 + 1, this.field683[var10], this.field679[var10], 0);
                    }
                    method216(this.field678[var10], arg1, this.field677[var10] + var7, this.field683[var10], this.field679[var10], arg3);
                }
                arg1 += this.field683[var10];
            }
        }
        if (field673) {
            class142.method1157(var6, (int) ((double) this.field668 * 0.7D) + var7, arg1 - var6, 8388608);
        }
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "([I[I[I[I[[B)V")
    public class28(int[] arg0, int[] arg1, int[] arg2, int[] arg3, byte[][] arg4) {
        this.field677 = arg0;
        this.field683 = arg1;
        this.field679 = arg2;
        byte var6 = 0;
        for (int var7 = 1; var7 < arg3.length; var7++) {
            if (arg3[var7] == 1) {
                var6 = (byte) var7;
            }
        }
        this.field678 = arg4;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field677[var10] < var8 && this.field679[var10] != 0) {
                var8 = this.field677[var10];
            }
            if (this.field679[var10] + this.field677[var10] > var9) {
                var9 = this.field679[var10] + this.field677[var10];
            }
            byte[] var11 = this.field678[var10];
            int var12 = var11.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11[var13] = (byte) (var11[var13] == var6 ? 0 : 1);
            }
        }
        this.field668 = this.field679[32] + this.field677[32];
        this.field693 = this.field668 - var8;
        this.field694 = var9 - this.field668;
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "([B)V")
    public class28(byte[] arg0) {
        this.field683 = new int[arg0.length];
        for (int var2 = 0; var2 < this.field683.length; var2++) {
            this.field683[var2] = arg0[var2] & 0xFF;
        }
    }
}
