import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class45 extends class59 {

    @OriginalMember(owner = "client!gb", name = "zb", descriptor = "[[B")
    private byte[][] field931 = new byte[256][];

    @OriginalMember(owner = "client!gb", name = "Fb", descriptor = "I")
    public int field937 = 0;

    @OriginalMember(owner = "client!gb", name = "rb", descriptor = "Ljava/util/Random;")
    private Random field923 = new Random();

    @OriginalMember(owner = "client!gb", name = "qb", descriptor = "[I")
    private int[] field922;

    @OriginalMember(owner = "client!gb", name = "mb", descriptor = "[I")
    private int[] field918;

    @OriginalMember(owner = "client!gb", name = "vb", descriptor = "[I")
    private int[] field927;

    @OriginalMember(owner = "client!gb", name = "Gb", descriptor = "I")
    private int field938;

    @OriginalMember(owner = "client!gb", name = "Hb", descriptor = "I")
    private int field939;

    @OriginalMember(owner = "client!gb", name = "pb", descriptor = "Lrd;")
    private static class114 field921 = class84.method656("bla", (byte) 121);

    @OriginalMember(owner = "client!gb", name = "kb", descriptor = "Lrd;")
    private static class114 field916 = class84.method656("blu", (byte) 125);

    @OriginalMember(owner = "client!gb", name = "gb", descriptor = "Z")
    private static boolean field912 = false;

    @OriginalMember(owner = "client!gb", name = "jb", descriptor = "Lrd;")
    private static class114 field915 = class84.method656("gr3", (byte) 126);

    @OriginalMember(owner = "client!gb", name = "lb", descriptor = "Lrd;")
    private static class114 field917 = class84.method656("@str@", (byte) 127);

    @OriginalMember(owner = "client!gb", name = "sb", descriptor = "Lrd;")
    private static class114 field924 = class84.method656("dbl", (byte) 115);

    @OriginalMember(owner = "client!gb", name = "ob", descriptor = "Lrd;")
    private static class114 field920 = class84.method656("red", (byte) 121);

    @OriginalMember(owner = "client!gb", name = "xb", descriptor = "Lrd;")
    private static class114 field929 = class84.method656("or3", (byte) 123);

    @OriginalMember(owner = "client!gb", name = "yb", descriptor = "[Lrd;")
    private static class114[] field930 = new class114[100];

    @OriginalMember(owner = "client!gb", name = "wb", descriptor = "Lrd;")
    private static class114 field928 = class84.method656("lre", (byte) 127);

    @OriginalMember(owner = "client!gb", name = "Ab", descriptor = "Lrd;")
    private static class114 field932 = class84.method656("or1", (byte) 123);

    @OriginalMember(owner = "client!gb", name = "ib", descriptor = "Lrd;")
    private static class114 field914 = class84.method656("or2", (byte) 119);

    @OriginalMember(owner = "client!gb", name = "nb", descriptor = "Lrd;")
    private static class114 field919 = class84.method656("str", (byte) 116);

    @OriginalMember(owner = "client!gb", name = "hb", descriptor = "Lrd;")
    private static class114 field913 = class84.method656("dre", (byte) 127);

    @OriginalMember(owner = "client!gb", name = "Bb", descriptor = "Lrd;")
    private static class114 field933 = class84.method656("cya", (byte) 115);

    @OriginalMember(owner = "client!gb", name = "ub", descriptor = "Lrd;")
    private static class114 field926 = class84.method656("gre", (byte) 124);

    @OriginalMember(owner = "client!gb", name = "Db", descriptor = "Lrd;")
    private static class114 field935 = class84.method656("gr2", (byte) 120);

    @OriginalMember(owner = "client!gb", name = "tb", descriptor = "Lrd;")
    private static class114 field925 = class84.method656("yel", (byte) 118);

    @OriginalMember(owner = "client!gb", name = "Eb", descriptor = "Lrd;")
    private static class114 field936 = class84.method656("whi", (byte) 119);

    @OriginalMember(owner = "client!gb", name = "Cb", descriptor = "Lrd;")
    private static class114 field934 = class84.method656("gr1", (byte) 119);

    @OriginalMember(owner = "client!gb", name = "Ib", descriptor = "Lrd;")
    private static class114 field940 = class84.method656("mag", (byte) 116);

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lrd;IIIZI)V")
    private final void method315(class114 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        class114 var7 = arg0.method862(-6488);
        int var8 = 0;
        for (int var9 = 0; var9 < var7.method854(-29348); var9++) {
            if (var7.method861(var9, -14412) == 32) {
                var8++;
            }
        }
        int var10 = 0;
        int var11 = 0;
        if (var8 > 0) {
            var10 = (arg5 - this.method325(var7)) * 256 / var8;
        }
        field912 = false;
        int var12 = arg1;
        if (var7 == null) {
            return;
        }
        int var13 = arg2 - this.field937;
        for (int var14 = 0; var14 < var7.field2660; var14++) {
            if (var7.field2676[var14] == 64 && var14 + 4 < var7.field2660 && var7.field2676[var14 + 4] == 64) {
                int var15 = this.method332(var7.method860(var14 + 4, -23745, var14 + 1));
                if (var15 != -1) {
                    arg3 = var15;
                }
                var14 += 4;
            } else {
                int var16 = var7.field2676[var14] & 0xFF;
                if (var16 != 32) {
                    if (arg4) {
                        method323(this.field931[var16], arg1 + 1, this.field922[var16] + var13 + 1, this.field918[var16], this.field927[var16], 0);
                    }
                    method323(this.field931[var16], arg1, this.field922[var16] + var13, this.field918[var16], this.field927[var16], arg3);
                }
                arg1 += this.field918[var16];
                if (var16 == 32) {
                    int var17 = var10 + var11;
                    arg1 += var17 / 256;
                    var11 = var17 & 0xFF;
                }
            }
        }
        if (field912) {
            class59.method432(var12, (int) ((double) this.field937 * 0.7D) + var13, arg1 - var12, 8388608);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lrd;I)I")
    public final int method316(class114 arg0, int arg1) {
        int var3 = this.method334(arg0, arg1, true);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method326(field930[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lrd;III)V")
    public final void method317(class114 arg0, int arg1, int arg2, int arg3) {
        this.method333(arg0, arg1 - this.method326(arg0), arg2, arg3);
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(Lrd;IIIZI)V")
    public final void method318(class114 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.field923.setSeed((long) arg5);
        int var7 = (this.field923.nextInt() & 0x1F) + 192;
        int var8 = arg2 - this.field937;
        for (int var9 = 0; var9 < arg0.field2660; var9++) {
            if (arg0.field2676[var9] == 64 && var9 + 4 < arg0.field2660 && arg0.field2676[var9 + 4] == 64) {
                int var10 = this.method332(arg0.method860(var9 + 4, -23745, var9 + 1));
                if (var10 != -1) {
                    arg3 = var10;
                }
                var9 += 4;
            } else {
                int var11 = arg0.field2676[var9] & 0xFF;
                if (var11 != 32) {
                    if (arg4) {
                        method329(this.field931[var11], arg1 + 1, this.field922[var11] + var8 + 1, this.field918[var11], this.field927[var11], 0, 192);
                    }
                    method329(this.field931[var11], arg1, this.field922[var11] + var8, this.field918[var11], this.field927[var11], arg3, var7);
                }
                arg1 += this.field918[var11];
                if ((this.field923.nextInt() & 0x3) == 0) {
                    arg1++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lrd;IIII)V")
    public final void method319(class114 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 == null) {
            return;
        }
        int var6 = arg1 - this.method326(arg0) / 2;
        int var7 = arg2 - this.field937;
        for (int var8 = 0; var8 < arg0.field2660; var8++) {
            int var9 = arg0.field2676[var8] & 0xFF;
            if (var9 != 32) {
                method323(this.field931[var9], var6, this.field922[var9] + var7 + (int) (Math.sin((double) arg4 / 5.0D + (double) var8 / 2.0D) * 5.0D), this.field918[var9], this.field927[var9], arg3);
            }
            var6 += this.field918[var9];
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lrd;IIIZ)V")
    public final void method320(class114 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.method338(arg0, arg1 - this.method325(arg0), arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "([I[BIIIIIIII)V")
    private static final void method321(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "([I[BIIIIIII)V")
    private static final void method322(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "([BIIIII)V")
    private static final void method323(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = class59.field1218 * arg2 + arg1;
        int var7 = class59.field1218 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < class59.field1214) {
            int var10 = class59.field1214 - arg2;
            arg4 -= var10;
            arg2 = class59.field1214;
            var9 += arg3 * var10;
            var6 += class59.field1218 * var10;
        }
        if (arg2 + arg4 > class59.field1216) {
            arg4 -= arg2 + arg4 - class59.field1216;
        }
        if (arg1 < class59.field1213) {
            int var11 = class59.field1213 - arg1;
            arg3 -= var11;
            arg1 = class59.field1213;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > class59.field1212) {
            int var12 = arg1 + arg3 - class59.field1212;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method322(class59.field1215, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(Lrd;IIII)V")
    public final void method324(class114 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 == null) {
            return;
        }
        int var6 = arg1 - this.method326(arg0) / 2;
        int var7 = arg2 - this.field937;
        for (int var8 = 0; var8 < arg0.method854(-29348); var8++) {
            int var9 = arg0.field2676[var8] & 0xFF;
            if (var9 != 32) {
                method323(this.field931[var9], var6 + (int) (Math.sin((double) arg4 / 5.0D + (double) var8 / 5.0D) * 5.0D), this.field922[var9] + var7 + (int) (Math.sin((double) arg4 / 5.0D + (double) var8 / 3.0D) * 5.0D), this.field918[var9], this.field927[var9], arg3);
            }
            var6 += this.field918[var9];
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lrd;)I")
    public final int method325(class114 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.field2660; var3++) {
            if (arg0.field2676[var3] == 64 && var3 + 4 < arg0.field2660 && arg0.field2676[var3 + 4] == 64) {
                var3 += 4;
            } else {
                var2 += this.field918[arg0.field2676[var3] & 0xFF];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(Lrd;)I")
    public final int method326(class114 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.field2660; var3++) {
            var2 += this.field918[arg0.field2676[var3] & 0xFF];
        }
        return var2;
    }

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "(I)I")
    public final int method327(int arg0) {
        return this.field918[arg0 & 0xFF];
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(Lrd;I)I")
    public final int method328(class114 arg0, int arg1) {
        return this.method334(arg0, arg1, true);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "([BIIIIII)V")
    private static final void method329(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = class59.field1218 * arg2 + arg1;
        int var8 = class59.field1218 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class59.field1214) {
            int var11 = class59.field1214 - arg2;
            arg4 -= var11;
            arg2 = class59.field1214;
            var10 += arg3 * var11;
            var7 += class59.field1218 * var11;
        }
        if (arg2 + arg4 > class59.field1216) {
            arg4 -= arg2 + arg4 - class59.field1216;
        }
        if (arg1 < class59.field1213) {
            int var12 = class59.field1213 - arg1;
            arg3 -= var12;
            arg1 = class59.field1213;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class59.field1212) {
            int var13 = arg1 + arg3 - class59.field1212;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method321(class59.field1215, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lrd;IIIIIZIII)V")
    public final void method330(class114 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return;
        }
        if (arg9 == 0) {
            arg9 = this.field937;
        }
        boolean var11 = true;
        if (arg4 < this.field939 + this.field938 + arg9 && arg4 < arg9 + arg9) {
            var11 = false;
        }
        int var12 = this.method334(arg0, arg3, var11);
        if (arg8 == 3 && var12 == 1) {
            arg8 = 1;
        }
        int var13;
        if (arg8 == 0) {
            var13 = this.field938 + arg2;
        } else if (arg8 == 1) {
            var13 = (arg4 - this.field938 - this.field939 - (var12 - 1) * arg9) / 2 + this.field938 + arg2;
        } else if (arg8 == 2) {
            var13 = arg2 + arg4 - this.field939 - (var12 - 1) * arg9;
        } else {
            int var14 = (arg4 - this.field938 - this.field939 - (var12 - 1) * arg9) / (var12 + 1);
            if (var14 < 0) {
                var14 = 0;
            }
            var13 = this.field938 + arg2 + var14;
            arg9 += var14;
        }
        for (int var15 = 0; var15 < var12; var15++) {
            if (arg7 == 0) {
                this.method338(field930[var15], arg1, var13, arg5, arg6);
            } else if (arg7 == 1) {
                this.method335(field930[var15], arg3 / 2 + arg1, var13, arg5, arg6);
            } else if (arg7 == 2) {
                this.method320(field930[var15], arg1 + arg3, var13, arg5, arg6);
            } else if (var12 - 1 == var15) {
                this.method338(field930[var15], arg1, var13, arg5, arg6);
            } else {
                this.method315(field930[var15], arg1, var13, arg5, arg6, arg3);
            }
            var13 += arg9;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lrd;IIIII)V")
    public final void method331(class114 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        double var7 = 7.0D - (double) arg5 / 8.0D;
        if (var7 < 0.0D) {
            var7 = 0.0D;
        }
        int var9 = arg1 - this.method326(arg0) / 2;
        int var10 = arg2 - this.field937;
        for (int var11 = 0; var11 < arg0.method854(-29348); var11++) {
            int var12 = arg0.field2676[var11] & 0xFF;
            if (var12 != 32) {
                method323(this.field931[var12], var9, this.field922[var12] + var10 + (int) (Math.sin((double) var11 / 1.5D + (double) arg4) * var7), this.field918[var12], this.field927[var12], arg3);
            }
            var9 += this.field918[var12];
        }
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(Lrd;)I")
    private final int method332(class114 arg0) {
        if (arg0.method881(field920, false)) {
            return 16711680;
        } else if (arg0.method881(field926, false)) {
            return 65280;
        } else if (arg0.method881(field916, false)) {
            return 255;
        } else if (arg0.method881(field925, false)) {
            return 16776960;
        } else if (arg0.method881(field933, false)) {
            return 65535;
        } else if (arg0.method881(field940, false)) {
            return 16711935;
        } else if (arg0.method881(field936, false)) {
            return 16777215;
        } else if (arg0.method881(field921, false)) {
            return 0;
        } else if (arg0.method881(field928, false)) {
            return 16748608;
        } else if (arg0.method881(field913, false)) {
            return 8388608;
        } else if (arg0.method881(field924, false)) {
            return 128;
        } else if (arg0.method881(field932, false)) {
            return 16756736;
        } else if (arg0.method881(field914, false)) {
            return 16740352;
        } else if (arg0.method881(field929, false)) {
            return 16723968;
        } else if (arg0.method881(field934, false)) {
            return 12648192;
        } else if (arg0.method881(field935, false)) {
            return 8453888;
        } else if (arg0.method881(field915, false)) {
            return 4259584;
        } else {
            if (arg0.method881(field919, false)) {
                field912 = true;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(Lrd;III)V")
    public final void method333(class114 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return;
        }
        int var5 = arg2 - this.field937;
        for (int var6 = 0; var6 < arg0.field2660; var6++) {
            int var7 = arg0.field2676[var6] & 0xFF;
            if (var7 != 32) {
                method323(this.field931[var7], arg1, this.field922[var7] + var5, this.field918[var7], this.field927[var7], arg3);
            }
            arg1 += this.field918[var7];
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lrd;IZ)I")
    private final int method334(class114 arg0, int arg1, boolean arg2) {
        int var4 = 0;
        int var5 = 0;
        class114 var6 = class109.method826((byte) -8, 100);
        int var7 = -1;
        int var8 = 0;
        class114 var9 = null;
        int var10 = 0;
        boolean var11 = false;
        int var12 = 0;
        int var13 = 0;
        int var14 = arg0.method854(-29348);
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = arg0.method861(var15, -14412);
            if (var16 == 64 && var15 + 4 < var14 && arg0.method861(var15 + 4, -14412) == 64) {
                class114 var17 = arg0.method860(var15 + 5, -23745, var15);
                if (var17.method881(field919, false)) {
                    var11 = true;
                    var12 = var6.method854(-29348);
                } else {
                    var9 = var17;
                    var10 = var6.method854(-29348);
                }
                var6.method883(var17, (byte) 69);
                var15 += 4;
            } else if (var16 == 92 && var15 + 1 < var14 && arg0.method861(var15 + 1, -14412) == 110) {
                field930[var13++] = var6.method860(var6.method854(-29348), -23745, var5).method862(-6488);
                var5 = var6.method854(-29348);
                var4 = 0;
                var7 = -1;
                var15++;
                var9 = null;
                var11 = false;
            } else {
                var6.method871(var16, -101);
                var4 += this.method327(var16);
                if (var16 == 32 || var16 == 45) {
                    var7 = var6.method854(-29348);
                    var8 = var4;
                }
                if (arg2 && var4 > arg1 && var7 >= 0) {
                    field930[var13++] = var6.method860(var7, -23745, var5).method862(-6488);
                    var5 = var7;
                    var7 = -1;
                    var4 -= var8;
                    if (var9 != null && var10 < var5 && var5 > 4) {
                        var5 -= 5;
                        var6.method853(var5, (byte) 74, var9);
                    }
                    if (var11 && var12 < var5 && var5 > 4) {
                        var5 -= 5;
                        var6.method853(var5, (byte) -65, field917);
                    }
                }
            }
        }
        if (var6.method854(-29348) > var5) {
            field930[var13++] = var6.method860(var6.method854(-29348), -23745, var5).method862(-6488);
        }
        return var13;
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(Lrd;IIIZ)V")
    public final void method335(class114 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.method338(arg0, arg1 - this.method325(arg0) / 2, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "()V")
    public static void method336() {
        field919 = null;
        field917 = null;
        field920 = null;
        field926 = null;
        field916 = null;
        field925 = null;
        field933 = null;
        field940 = null;
        field936 = null;
        field921 = null;
        field928 = null;
        field913 = null;
        field924 = null;
        field932 = null;
        field914 = null;
        field929 = null;
        field934 = null;
        field935 = null;
        field915 = null;
        field930 = null;
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(Lrd;III)V")
    public final void method337(class114 arg0, int arg1, int arg2, int arg3) {
        this.method333(arg0, arg1 - this.method326(arg0) / 2, arg2, arg3);
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(Lrd;IIIZ)V")
    public final void method338(class114 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field912 = false;
        int var6 = arg1;
        if (arg0 == null) {
            return;
        }
        int var7 = arg2 - this.field937;
        for (int var8 = 0; var8 < arg0.field2660; var8++) {
            if (arg0.field2676[var8] == 64 && var8 + 4 < arg0.field2660 && arg0.field2676[var8 + 4] == 64) {
                int var9 = this.method332(arg0.method860(var8 + 4, -23745, var8 + 1));
                if (var9 != -1) {
                    arg3 = var9;
                }
                var8 += 4;
            } else {
                int var10 = arg0.field2676[var8] & 0xFF;
                if (var10 != 32) {
                    if (arg4) {
                        method323(this.field931[var10], arg1 + 1, this.field922[var10] + var7 + 1, this.field918[var10], this.field927[var10], 0);
                    }
                    method323(this.field931[var10], arg1, this.field922[var10] + var7, this.field918[var10], this.field927[var10], arg3);
                }
                arg1 += this.field918[var10];
            }
        }
        if (field912) {
            class59.method432(var6, (int) ((double) this.field937 * 0.7D) + var7, arg1 - var6, 8388608);
        }
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "([I[I[I[I[[B)V")
    public class45(int[] arg0, int[] arg1, int[] arg2, int[] arg3, byte[][] arg4) {
        this.field922 = arg0;
        this.field918 = arg1;
        this.field927 = arg2;
        byte var6 = 0;
        for (int var7 = 1; var7 < arg3.length; var7++) {
            if (arg3[var7] == 1) {
                var6 = (byte) var7;
            }
        }
        this.field931 = arg4;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field922[var10] < var8 && this.field927[var10] != 0) {
                var8 = this.field922[var10];
            }
            if (this.field927[var10] + this.field922[var10] > var9) {
                var9 = this.field927[var10] + this.field922[var10];
            }
            byte[] var11 = this.field931[var10];
            int var12 = var11.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11[var13] = (byte) (var11[var13] == var6 ? 0 : 1);
            }
        }
        this.field937 = this.field927[32] + this.field922[32];
        this.field938 = this.field937 - var8;
        this.field939 = var9 - this.field937;
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "([B)V")
    public class45(byte[] arg0) {
        this.field918 = new int[arg0.length];
        for (int var2 = 0; var2 < this.field918.length; var2++) {
            this.field918[var2] = arg0[var2] & 0xFF;
        }
    }
}
