import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ka")
public class class21 extends class37 {

    @OriginalMember(owner = "mapview!ka", name = "N", descriptor = "[[B")
    private byte[][] field257 = new byte[256][];

    @OriginalMember(owner = "mapview!ka", name = "L", descriptor = "I")
    private int field256 = 0;

    @OriginalMember(owner = "mapview!ka", name = "S", descriptor = "Z")
    private boolean field262;

    @OriginalMember(owner = "mapview!ka", name = "w", descriptor = "[I")
    private int[] field241;

    @OriginalMember(owner = "mapview!ka", name = "D", descriptor = "[I")
    private int[] field248;

    @OriginalMember(owner = "mapview!ka", name = "x", descriptor = "[I")
    private int[] field242;

    @OriginalMember(owner = "mapview!ka", name = "u", descriptor = "Lba;")
    private static class4 field239 = class14.method105((byte) -114, "dbl");

    @OriginalMember(owner = "mapview!ka", name = "y", descriptor = "Lba;")
    private static class4 field243 = class14.method105((byte) -65, "dre");

    @OriginalMember(owner = "mapview!ka", name = "C", descriptor = "Lba;")
    private static class4 field247 = class14.method105((byte) -100, "blu");

    @OriginalMember(owner = "mapview!ka", name = "G", descriptor = "Lba;")
    private static class4 field251 = class14.method105((byte) -70, "gre");

    @OriginalMember(owner = "mapview!ka", name = "A", descriptor = "Lba;")
    private static class4 field245 = class14.method105((byte) -69, "or2");

    @OriginalMember(owner = "mapview!ka", name = "F", descriptor = "Lba;")
    private static class4 field250 = class14.method105((byte) -111, "str");

    @OriginalMember(owner = "mapview!ka", name = "I", descriptor = "Lba;")
    private static class4 field253 = class14.method105((byte) -74, "yel");

    @OriginalMember(owner = "mapview!ka", name = "H", descriptor = "Lba;")
    private static class4 field252 = class14.method105((byte) -111, "gr2");

    @OriginalMember(owner = "mapview!ka", name = "v", descriptor = "Lba;")
    private static class4 field240 = class14.method105((byte) -113, "bla");

    @OriginalMember(owner = "mapview!ka", name = "z", descriptor = "Lba;")
    private static class4 field244 = class14.method105((byte) -90, "or3");

    @OriginalMember(owner = "mapview!ka", name = "P", descriptor = "Lba;")
    private static class4 field259 = class14.method105((byte) -67, "red");

    @OriginalMember(owner = "mapview!ka", name = "E", descriptor = "Lba;")
    private static class4 field249 = class14.method105((byte) -87, "gr3");

    @OriginalMember(owner = "mapview!ka", name = "O", descriptor = "Lba;")
    private static class4 field258 = class14.method105((byte) -69, "gr1");

    @OriginalMember(owner = "mapview!ka", name = "K", descriptor = "Lba;")
    private static class4 field255 = class14.method105((byte) -118, "mag");

    @OriginalMember(owner = "mapview!ka", name = "B", descriptor = "Lba;")
    private static class4 field246 = class14.method105((byte) -66, "or1");

    @OriginalMember(owner = "mapview!ka", name = "R", descriptor = "Lba;")
    private static class4 field261 = class14.method105((byte) -122, "cya");

    @OriginalMember(owner = "mapview!ka", name = "Q", descriptor = "Lba;")
    private static class4 field260 = class14.method105((byte) -95, "lre");

    @OriginalMember(owner = "mapview!ka", name = "J", descriptor = "Lba;")
    private static class4 field254 = class14.method105((byte) -121, "whi");

    @OriginalMember(owner = "mapview!ka", name = "c", descriptor = "()V", line = 10)
    public static void method146() {
        field259 = null;
        field251 = null;
        field247 = null;
        field253 = null;
        field261 = null;
        field255 = null;
        field254 = null;
        field240 = null;
        field260 = null;
        field243 = null;
        field239 = null;
        field246 = null;
        field245 = null;
        field244 = null;
        field258 = null;
        field252 = null;
        field249 = null;
        field250 = null;
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(Lba;)I", line = 32)
    public final int method147(class4 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.field84; var3++) {
            var2 += this.field248[arg0.field82[var3] & 0xFF];
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(Lba;IIIZ)V", line = 47)
    public final void method148(class4 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field262 = false;
        int var6 = arg1;
        if (arg0 == null) {
            return;
        }
        int var7 = arg2 - this.field256;
        for (int var8 = 0; var8 < arg0.field84; var8++) {
            if (arg0.field82[var8] == 64 && var8 + 4 < arg0.field84 && arg0.field82[var8 + 4] == 64) {
                int var9 = this.method149(arg0.method29(var8 + 4, 40, var8 + 1));
                if (var9 != -1) {
                    arg3 = var9;
                }
                var8 += 4;
            } else {
                int var10 = arg0.field82[var8] & 0xFF;
                if (var10 != 32) {
                    if (arg4) {
                        this.method154(this.field257[var10], arg1 + 1, this.field241[var10] + var7 + 1, this.field248[var10], this.field242[var10], 0);
                    }
                    this.method154(this.field257[var10], arg1, this.field241[var10] + var7, this.field248[var10], this.field242[var10], arg3);
                }
                arg1 += this.field248[var10];
            }
        }
        if (this.field262) {
            class37.method234(var6, (int) ((double) this.field256 * 0.7D) + var7, arg1 - var6, 8388608);
        }
    }

    @OriginalMember(owner = "mapview!ka", name = "b", descriptor = "(Lba;)I", line = 95)
    private final int method149(class4 arg0) {
        if (arg0.method49(48, field259)) {
            return 16711680;
        } else if (arg0.method49(75, field251)) {
            return 65280;
        } else if (arg0.method49(109, field247)) {
            return 255;
        } else if (arg0.method49(97, field253)) {
            return 16776960;
        } else if (arg0.method49(119, field261)) {
            return 65535;
        } else if (arg0.method49(126, field255)) {
            return 16711935;
        } else if (arg0.method49(73, field254)) {
            return 16777215;
        } else if (arg0.method49(67, field240)) {
            return 0;
        } else if (arg0.method49(122, field260)) {
            return 16748608;
        } else if (arg0.method49(63, field243)) {
            return 8388608;
        } else if (arg0.method49(64, field239)) {
            return 128;
        } else if (arg0.method49(62, field246)) {
            return 16756736;
        } else if (arg0.method49(90, field245)) {
            return 16740352;
        } else if (arg0.method49(95, field244)) {
            return 16723968;
        } else if (arg0.method49(121, field258)) {
            return 12648192;
        } else if (arg0.method49(112, field252)) {
            return 8453888;
        } else if (arg0.method49(71, field249)) {
            return 4259584;
        } else {
            if (arg0.method49(73, field250)) {
                this.field262 = true;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "([I[BIIIIIII)V", line = 183)
    private final void method150(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(Lba;III)V", line = 282)
    public final void method151(class4 arg0, int arg1, int arg2, int arg3) {
        this.method153(arg0, arg1 - this.method147(arg0), arg2, arg3);
    }

    @OriginalMember(owner = "mapview!ka", name = "b", descriptor = "(Lba;III)V", line = 285)
    public final void method152(class4 arg0, int arg1, int arg2, int arg3) {
        this.method153(arg0, arg1 - this.method147(arg0) / 2, arg2, arg3);
    }

    @OriginalMember(owner = "mapview!ka", name = "c", descriptor = "(Lba;III)V", line = 299)
    public final void method153(class4 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return;
        }
        int var5 = arg2 - this.field256;
        for (int var6 = 0; var6 < arg0.field84; var6++) {
            int var7 = arg0.field82[var6] & 0xFF;
            if (var7 != 32) {
                this.method154(this.field257[var7], arg1, this.field241[var7] + var5, this.field248[var7], this.field242[var7], arg3);
            }
            arg1 += this.field248[var7];
        }
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "([BIIIII)V", line = 320)
    private final void method154(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class37.field456 * arg2 + arg1;
        int var8 = class37.field456 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class37.field458) {
            int var11 = class37.field458 - arg2;
            arg4 -= var11;
            arg2 = class37.field458;
            var10 += arg3 * var11;
            var7 += class37.field456 * var11;
        }
        if (arg2 + arg4 > class37.field454) {
            arg4 -= arg2 + arg4 - class37.field454;
        }
        if (arg1 < class37.field455) {
            int var12 = class37.field455 - arg1;
            arg3 -= var12;
            arg1 = class37.field455;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class37.field460) {
            int var13 = arg1 + arg3 - class37.field460;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method150(class37.field457, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "mapview!ka", name = "<init>", descriptor = "([I[I[I[I[[B)V", line = 392)
    public class21(int[] arg0, int[] arg1, int[] arg2, int[] arg3, byte[][] arg4) {
        new Random();
        this.field262 = false;
        this.field241 = arg0;
        this.field248 = arg1;
        this.field242 = arg2;
        byte var6 = 0;
        for (int var7 = 1; var7 < arg3.length; var7++) {
            if (arg3[var7] == 1) {
                var6 = (byte) var7;
            }
        }
        this.field257 = arg4;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field241[var10] < var8) {
                var8 = this.field241[var10];
            }
            if (this.field242[var10] + this.field241[var10] > var9) {
                var9 = this.field242[var10] + this.field241[var10];
            }
            byte[] var11 = this.field257[var10];
            int var12 = var11.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11[var13] = (byte) (var11[var13] == var6 ? 0 : 1);
            }
        }
        this.field256 = this.field242[32] + this.field241[32];
    }
}
