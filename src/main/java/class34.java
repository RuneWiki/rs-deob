import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class34 extends class32 {

    @OriginalMember(owner = "client!fc", name = "nb", descriptor = "I")
    public int field684 = 0;

    @OriginalMember(owner = "client!fc", name = "mb", descriptor = "[[B")
    private byte[][] field683 = new byte[256][];

    @OriginalMember(owner = "client!fc", name = "ib", descriptor = "Ljava/util/Random;")
    private Random field679 = new Random();

    @OriginalMember(owner = "client!fc", name = "tb", descriptor = "Z")
    private boolean field690 = false;

    @OriginalMember(owner = "client!fc", name = "Y", descriptor = "[I")
    private int[] field669;

    @OriginalMember(owner = "client!fc", name = "sb", descriptor = "[I")
    private int[] field689;

    @OriginalMember(owner = "client!fc", name = "eb", descriptor = "[I")
    private int[] field675;

    @OriginalMember(owner = "client!fc", name = "ab", descriptor = "Lo;")
    private static class84 field671 = class15.method124("gr2", 255);

    @OriginalMember(owner = "client!fc", name = "Z", descriptor = "Lo;")
    private static class84 field670 = class15.method124("dre", 255);

    @OriginalMember(owner = "client!fc", name = "W", descriptor = "Lo;")
    private static class84 field667 = class15.method124("gre", 255);

    @OriginalMember(owner = "client!fc", name = "X", descriptor = "Lo;")
    private static class84 field668 = class15.method124("yel", 255);

    @OriginalMember(owner = "client!fc", name = "V", descriptor = "Lo;")
    private static class84 field666 = class15.method124("str", 255);

    @OriginalMember(owner = "client!fc", name = "gb", descriptor = "Lo;")
    private static class84 field677 = class15.method124("mag", 255);

    @OriginalMember(owner = "client!fc", name = "bb", descriptor = "Lo;")
    private static class84 field672 = class15.method124("or2", 255);

    @OriginalMember(owner = "client!fc", name = "lb", descriptor = "Lo;")
    private static class84 field682 = class15.method124("or1", 255);

    @OriginalMember(owner = "client!fc", name = "ob", descriptor = "Lo;")
    private static class84 field685 = class15.method124("bla", 255);

    @OriginalMember(owner = "client!fc", name = "cb", descriptor = "Lo;")
    private static class84 field673 = class15.method124("or3", 255);

    @OriginalMember(owner = "client!fc", name = "fb", descriptor = "Lo;")
    private static class84 field676 = class15.method124("red", 255);

    @OriginalMember(owner = "client!fc", name = "db", descriptor = "Lo;")
    private static class84 field674 = class15.method124("cya", 255);

    @OriginalMember(owner = "client!fc", name = "kb", descriptor = "Lo;")
    private static class84 field681 = class15.method124("lre", 255);

    @OriginalMember(owner = "client!fc", name = "pb", descriptor = "Lo;")
    private static class84 field686 = class15.method124("dbl", 255);

    @OriginalMember(owner = "client!fc", name = "rb", descriptor = "Lo;")
    private static class84 field688 = class15.method124("whi", 255);

    @OriginalMember(owner = "client!fc", name = "jb", descriptor = "Lo;")
    private static class84 field680 = class15.method124("blu", 255);

    @OriginalMember(owner = "client!fc", name = "hb", descriptor = "Lo;")
    private static class84 field678 = class15.method124("gr3", 255);

    @OriginalMember(owner = "client!fc", name = "qb", descriptor = "Lo;")
    private static class84 field687 = class15.method124("gr1", 255);

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lo;IIII)V", line = 4)
    public final void method309(class84 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 == null) {
            return;
        }
        int var6 = arg1 - this.method313(arg0) / 2;
        int var7 = arg2 - this.field684;
        for (int var8 = 0; var8 < arg0.field1906; var8++) {
            int var9 = arg0.field1869[var8] & 0xFF;
            if (var9 != 32) {
                this.method314(this.field683[var9], var6, this.field669[var9] + var7 + (int) (Math.sin((double) arg4 / 5.0D + (double) var8 / 2.0D) * 5.0D), this.field689[var9], this.field675[var9], arg3);
            }
            var6 += this.field689[var9];
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "([I[BIIIIIII)V", line = 26)
    private final void method310(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lo;III)V", line = 82)
    public final void method311(class84 arg0, int arg1, int arg2, int arg3) {
        this.method320(arg0, arg1 - this.method313(arg0) / 2, arg2, arg3);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "([I[BIIIIIIII)V", line = 85)
    private final void method312(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lo;)I", line = 117)
    public final int method313(class84 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.field1906; var3++) {
            var2 += this.field689[arg0.field1869[var3] & 0xFF];
        }
        return var2;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "([BIIIII)V", line = 134)
    private final void method314(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class32.field638 * arg2 + arg1;
        int var8 = class32.field638 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class32.field637) {
            int var11 = class32.field637 - arg2;
            arg4 -= var11;
            arg2 = class32.field637;
            var10 += arg3 * var11;
            var7 += class32.field638 * var11;
        }
        if (arg2 + arg4 > class32.field636) {
            arg4 -= arg2 + arg4 - class32.field636;
        }
        if (arg1 < class32.field635) {
            int var12 = class32.field635 - arg1;
            arg3 -= var12;
            arg1 = class32.field635;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class32.field634) {
            int var13 = arg1 + arg3 - class32.field634;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method310(class32.field639, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(Lo;IIII)V", line = 183)
    public final void method315(class84 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 == null) {
            return;
        }
        int var6 = arg1 - this.method313(arg0) / 2;
        int var7 = arg2 - this.field684;
        for (int var8 = 0; var8 < arg0.method639(42); var8++) {
            int var9 = arg0.field1869[var8] & 0xFF;
            if (var9 != 32) {
                this.method314(this.field683[var9], var6 + (int) (Math.sin((double) arg4 / 5.0D + (double) var8 / 5.0D) * 5.0D), this.field669[var9] + var7 + (int) (Math.sin((double) arg4 / 5.0D + (double) var8 / 3.0D) * 5.0D), this.field689[var9], this.field675[var9], arg3);
            }
            var6 += this.field689[var9];
        }
    }

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "()V", line = 206)
    public static void method316() {
        field676 = null;
        field667 = null;
        field680 = null;
        field668 = null;
        field674 = null;
        field677 = null;
        field688 = null;
        field685 = null;
        field681 = null;
        field670 = null;
        field686 = null;
        field682 = null;
        field672 = null;
        field673 = null;
        field687 = null;
        field671 = null;
        field678 = null;
        field666 = null;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(Lo;III)V", line = 227)
    public final void method317(class84 arg0, int arg1, int arg2, int arg3) {
        this.method320(arg0, arg1 - this.method313(arg0), arg2, arg3);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "([BIIIIII)V", line = 237)
    private final void method318(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = class32.field638 * arg2 + arg1;
        int var9 = class32.field638 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class32.field637) {
            int var12 = class32.field637 - arg2;
            arg4 -= var12;
            arg2 = class32.field637;
            var11 += arg3 * var12;
            var8 += class32.field638 * var12;
        }
        if (arg2 + arg4 > class32.field636) {
            arg4 -= arg2 + arg4 - class32.field636;
        }
        if (arg1 < class32.field635) {
            int var13 = class32.field635 - arg1;
            arg3 -= var13;
            arg1 = class32.field635;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class32.field634) {
            int var14 = arg1 + arg3 - class32.field634;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method312(class32.field639, arg0, arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lo;IIIZ)V", line = 292)
    public final void method319(class84 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field690 = false;
        int var6 = arg1;
        if (arg0 == null) {
            return;
        }
        int var7 = arg2 - this.field684;
        for (int var8 = 0; var8 < arg0.field1906; var8++) {
            if (arg0.field1869[var8] == 64 && var8 + 4 < arg0.field1906 && arg0.field1869[var8 + 4] == 64) {
                int var9 = this.method324(arg0.method650(var8 + 4, -32, var8 + 1));
                if (var9 != -1) {
                    arg3 = var9;
                }
                var8 += 4;
            } else {
                int var10 = arg0.field1869[var8] & 0xFF;
                if (var10 != 32) {
                    if (arg4) {
                        this.method314(this.field683[var10], arg1 + 1, this.field669[var10] + var7 + 1, this.field689[var10], this.field675[var10], 0);
                    }
                    this.method314(this.field683[var10], arg1, this.field669[var10] + var7, this.field689[var10], this.field675[var10], arg3);
                }
                arg1 += this.field689[var10];
            }
        }
        if (this.field690) {
            class32.method281(var6, (int) ((double) this.field684 * 0.7D) + var7, arg1 - var6, 8388608);
        }
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(Lo;III)V", line = 343)
    public final void method320(class84 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return;
        }
        int var5 = arg2 - this.field684;
        for (int var6 = 0; var6 < arg0.field1906; var6++) {
            int var7 = arg0.field1869[var6] & 0xFF;
            if (var7 != 32) {
                this.method314(this.field683[var7], arg1, this.field669[var7] + var5, this.field689[var7], this.field675[var7], arg3);
            }
            arg1 += this.field689[var7];
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(Lo;)I", line = 364)
    public final int method321(class84 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.field1906; var3++) {
            if (arg0.field1869[var3] == 64 && var3 + 4 < arg0.field1906 && arg0.field1869[var3 + 4] == 64) {
                var3 += 4;
            } else {
                var2 += this.field689[arg0.field1869[var3] & 0xFF];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lo;IIIII)V", line = 390)
    public final void method322(class84 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        double var7 = 7.0D - (double) arg5 / 8.0D;
        if (var7 < 0.0D) {
            var7 = 0.0D;
        }
        int var9 = arg1 - this.method313(arg0) / 2;
        int var10 = arg2 - this.field684;
        for (int var11 = 0; var11 < arg0.method639(45); var11++) {
            int var12 = arg0.field1869[var11] & 0xFF;
            if (var12 != 32) {
                this.method314(this.field683[var12], var9, this.field669[var12] + var10 + (int) (Math.sin((double) var11 / 1.5D + (double) arg4) * var7), this.field689[var12], this.field675[var12], arg3);
            }
            var9 += this.field689[var12];
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(Lo;IIIZ)V", line = 416)
    public final void method323(class84 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.method319(arg0, arg1 - this.method321(arg0) / 2, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(Lo;)I", line = 435)
    private final int method324(class84 arg0) {
        if (arg0.method654(-10, field676)) {
            return 16711680;
        } else if (arg0.method654(-10, field667)) {
            return 65280;
        } else if (arg0.method654(-10, field680)) {
            return 255;
        } else if (arg0.method654(-10, field668)) {
            return 16776960;
        } else if (arg0.method654(-10, field674)) {
            return 65535;
        } else if (arg0.method654(-10, field677)) {
            return 16711935;
        } else if (arg0.method654(-10, field688)) {
            return 16777215;
        } else if (arg0.method654(-10, field685)) {
            return 0;
        } else if (arg0.method654(-10, field681)) {
            return 16748608;
        } else if (arg0.method654(-10, field670)) {
            return 8388608;
        } else if (arg0.method654(-10, field686)) {
            return 128;
        } else if (arg0.method654(-10, field682)) {
            return 16756736;
        } else if (arg0.method654(-10, field672)) {
            return 16740352;
        } else if (arg0.method654(-10, field673)) {
            return 16723968;
        } else if (arg0.method654(-10, field687)) {
            return 12648192;
        } else if (arg0.method654(-10, field671)) {
            return 8453888;
        } else if (arg0.method654(-10, field678)) {
            return 4259584;
        } else {
            if (arg0.method654(-10, field666)) {
                this.field690 = true;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lo;IIIZI)V", line = 500)
    public final void method325(class84 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.field679.setSeed((long) arg5);
        int var7 = (this.field679.nextInt() & 0x1F) + 192;
        int var8 = arg2 - this.field684;
        for (int var9 = 0; var9 < arg0.field1906; var9++) {
            if (arg0.field1869[var9] == 64 && var9 + 4 < arg0.field1906 && arg0.field1869[var9 + 4] == 64) {
                int var10 = this.method324(arg0.method650(var9 + 4, -32, var9 + 1));
                if (var10 != -1) {
                    arg3 = var10;
                }
                var9 += 4;
            } else {
                int var11 = arg0.field1869[var9] & 0xFF;
                if (var11 != 32) {
                    if (arg4) {
                        this.method318(this.field683[var11], arg1 + 1, this.field669[var11] + var8 + 1, this.field689[var11], this.field675[var11], 0, 192);
                    }
                    this.method318(this.field683[var11], arg1, this.field669[var11] + var8, this.field689[var11], this.field675[var11], arg3, var7);
                }
                arg1 += this.field689[var11];
                if ((this.field679.nextInt() & 0x3) == 0) {
                    arg1++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "([I[I[I[I[[B)V", line = 585)
    public class34(int[] arg0, int[] arg1, int[] arg2, int[] arg3, byte[][] arg4) {
        this.field669 = arg0;
        this.field689 = arg1;
        this.field675 = arg2;
        byte var6 = 0;
        for (int var7 = 1; var7 < arg3.length; var7++) {
            if (arg3[var7] == 1) {
                var6 = (byte) var7;
            }
        }
        this.field683 = arg4;
        for (int var8 = 0; var8 < 256; var8++) {
            byte[] var9 = this.field683[var8];
            int var10 = var9.length;
            for (int var11 = 0; var11 < var10; var11++) {
                var9[var11] = (byte) (var9[var11] == var6 ? 0 : 1);
            }
        }
        this.field684 = this.field675[32] + this.field669[32];
    }
}
