import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!f")
public class class11 extends class31 {

    @OriginalMember(owner = "mapview!f", name = "R", descriptor = "I")
    private int field110 = 0;

    @OriginalMember(owner = "mapview!f", name = "W", descriptor = "[[B")
    private byte[][] field115 = new byte[256][];

    @OriginalMember(owner = "mapview!f", name = "cb", descriptor = "[I")
    private int[] field121;

    @OriginalMember(owner = "mapview!f", name = "X", descriptor = "[I")
    private int[] field116;

    @OriginalMember(owner = "mapview!f", name = "E", descriptor = "[I")
    private int[] field99;

    @OriginalMember(owner = "mapview!f", name = "D", descriptor = "Ll;")
    private static class22 field98 = class33.method229("lre", -47);

    @OriginalMember(owner = "mapview!f", name = "K", descriptor = "Ll;")
    private static class22 field104 = class33.method229("whi", -50);

    @OriginalMember(owner = "mapview!f", name = "I", descriptor = "Ll;")
    private static class22 field102 = class33.method229("mag", -63);

    @OriginalMember(owner = "mapview!f", name = "N", descriptor = "Ll;")
    private static class22 field107 = class33.method229("dbl", -55);

    @OriginalMember(owner = "mapview!f", name = "T", descriptor = "Ll;")
    private static class22 field112 = class33.method229("blu", -42);

    @OriginalMember(owner = "mapview!f", name = "O", descriptor = "Ll;")
    private static class22 field108 = class33.method229("gre", -125);

    @OriginalMember(owner = "mapview!f", name = "M", descriptor = "Ll;")
    private static class22 field106 = class33.method229("gr1", -101);

    @OriginalMember(owner = "mapview!f", name = "J", descriptor = "Ll;")
    private static class22 field103 = class33.method229("or1", -72);

    @OriginalMember(owner = "mapview!f", name = "H", descriptor = "Ll;")
    private static class22 field101 = class33.method229("bla", -122);

    @OriginalMember(owner = "mapview!f", name = "ab", descriptor = "Ll;")
    private static class22 field119 = class33.method229("or3", -52);

    @OriginalMember(owner = "mapview!f", name = "Y", descriptor = "Ll;")
    private static class22 field117 = class33.method229("gr3", -124);

    @OriginalMember(owner = "mapview!f", name = "F", descriptor = "Ll;")
    private static class22 field100 = class33.method229("cya", -120);

    @OriginalMember(owner = "mapview!f", name = "P", descriptor = "Ll;")
    private static class22 field109 = class33.method229("str", -42);

    @OriginalMember(owner = "mapview!f", name = "L", descriptor = "Ll;")
    private static class22 field105 = class33.method229("red", -51);

    @OriginalMember(owner = "mapview!f", name = "U", descriptor = "Ll;")
    private static class22 field113 = class33.method229("dre", -64);

    @OriginalMember(owner = "mapview!f", name = "bb", descriptor = "Ll;")
    private static class22 field120 = class33.method229("yel", -126);

    @OriginalMember(owner = "mapview!f", name = "Z", descriptor = "Z")
    private static boolean field118 = false;

    @OriginalMember(owner = "mapview!f", name = "S", descriptor = "Ll;")
    private static class22 field111 = class33.method229("gr2", -73);

    @OriginalMember(owner = "mapview!f", name = "V", descriptor = "Ll;")
    private static class22 field114 = class33.method229("or2", -103);

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "(Ll;IIIZ)V", line = 4)
    public final void method51(class22 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field118 = false;
        int var6 = arg1;
        if (arg0 == null) {
            return;
        }
        int var7 = arg2 - this.field110;
        for (int var8 = 0; var8 < arg0.field213; var8++) {
            if (arg0.field215[var8] == 64 && var8 + 4 < arg0.field213 && arg0.field215[var8 + 4] == 64) {
                int var9 = this.method54(arg0.method131(var8 + 4, (byte) -100, var8 + 1));
                if (var9 != -1) {
                    arg3 = var9;
                }
                var8 += 4;
            } else {
                int var10 = arg0.field215[var8] & 0xFF;
                if (var10 != 32) {
                    if (arg4) {
                        method53(this.field115[var10], arg1 + 1, this.field121[var10] + var7 + 1, this.field116[var10], this.field99[var10], 0);
                    }
                    method53(this.field115[var10], arg1, this.field121[var10] + var7, this.field116[var10], this.field99[var10], arg3);
                }
                arg1 += this.field116[var10];
            }
        }
        if (field118) {
            class31.method213(var6, (int) ((double) this.field110 * 0.7D) + var7, arg1 - var6, 8388608);
        }
    }

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "(Ll;III)V", line = 47)
    public final void method52(class22 arg0, int arg1, int arg2, int arg3) {
        this.method58(arg0, arg1 - this.method59(arg0) / 2, arg2, arg3);
    }

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "([BIIIII)V", line = 63)
    private static final void method53(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = class31.field428 * arg2 + arg1;
        int var7 = class31.field428 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < class31.field432) {
            int var10 = class31.field432 - arg2;
            arg4 -= var10;
            arg2 = class31.field432;
            var9 += arg3 * var10;
            var6 += class31.field428 * var10;
        }
        if (arg2 + arg4 > class31.field433) {
            arg4 -= arg2 + arg4 - class31.field433;
        }
        if (arg1 < class31.field430) {
            int var11 = class31.field430 - arg1;
            arg3 -= var11;
            arg1 = class31.field430;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > class31.field431) {
            int var12 = arg1 + arg3 - class31.field431;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method55(class31.field434, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "(Ll;)I", line = 120)
    private final int method54(class22 arg0) {
        if (arg0.method136(27321, field105)) {
            return 16711680;
        } else if (arg0.method136(27321, field108)) {
            return 65280;
        } else if (arg0.method136(27321, field112)) {
            return 255;
        } else if (arg0.method136(27321, field120)) {
            return 16776960;
        } else if (arg0.method136(27321, field100)) {
            return 65535;
        } else if (arg0.method136(27321, field102)) {
            return 16711935;
        } else if (arg0.method136(27321, field104)) {
            return 16777215;
        } else if (arg0.method136(27321, field101)) {
            return 0;
        } else if (arg0.method136(27321, field98)) {
            return 16748608;
        } else if (arg0.method136(27321, field113)) {
            return 8388608;
        } else if (arg0.method136(27321, field107)) {
            return 128;
        } else if (arg0.method136(27321, field103)) {
            return 16756736;
        } else if (arg0.method136(27321, field114)) {
            return 16740352;
        } else if (arg0.method136(27321, field119)) {
            return 16723968;
        } else if (arg0.method136(27321, field106)) {
            return 12648192;
        } else if (arg0.method136(27321, field111)) {
            return 8453888;
        } else if (arg0.method136(27321, field117)) {
            return 4259584;
        } else {
            if (arg0.method136(27321, field109)) {
                field118 = true;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "mapview!f", name = "<init>", descriptor = "([I[I[I[I[[B)V", line = 403)
    public class11(int[] arg0, int[] arg1, int[] arg2, int[] arg3, byte[][] arg4) {
        new Random();
        this.field121 = arg0;
        this.field116 = arg1;
        this.field99 = arg2;
        byte var6 = 0;
        for (int var7 = 1; var7 < arg3.length; var7++) {
            if (arg3[var7] == 1) {
                var6 = (byte) var7;
            }
        }
        this.field115 = arg4;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field121[var10] < var8 && this.field99[var10] != 0) {
                var8 = this.field121[var10];
            }
            if (this.field99[var10] + this.field121[var10] > var9) {
                var9 = this.field99[var10] + this.field121[var10];
            }
            byte[] var11 = this.field115[var10];
            int var12 = var11.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11[var13] = (byte) (var11[var13] == var6 ? 0 : 1);
            }
        }
        this.field110 = this.field99[32] + this.field121[32];
    }

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "([I[BIIIIIII)V", line = 217)
    private static final void method55(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "mapview!f", name = "c", descriptor = "()V", line = 275)
    public static void method56() {
        field109 = null;
        field105 = null;
        field108 = null;
        field112 = null;
        field120 = null;
        field100 = null;
        field102 = null;
        field104 = null;
        field101 = null;
        field98 = null;
        field113 = null;
        field107 = null;
        field103 = null;
        field114 = null;
        field119 = null;
        field106 = null;
        field111 = null;
        field117 = null;
    }

    @OriginalMember(owner = "mapview!f", name = "b", descriptor = "(Ll;III)V", line = 296)
    public final void method57(class22 arg0, int arg1, int arg2, int arg3) {
        this.method58(arg0, arg1 - this.method59(arg0), arg2, arg3);
    }

    @OriginalMember(owner = "mapview!f", name = "c", descriptor = "(Ll;III)V", line = 311)
    public final void method58(class22 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return;
        }
        int var5 = arg2 - this.field110;
        for (int var6 = 0; var6 < arg0.field213; var6++) {
            int var7 = arg0.field215[var6] & 0xFF;
            if (var7 != 32) {
                method53(this.field115[var7], arg1, this.field121[var7] + var5, this.field116[var7], this.field99[var7], arg3);
            }
            arg1 += this.field116[var7];
        }
    }

    @OriginalMember(owner = "mapview!f", name = "b", descriptor = "(Ll;)I", line = 362)
    public final int method59(class22 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.field213; var3++) {
            var2 += this.field116[arg0.field215[var3] & 0xFF];
        }
        return var2;
    }
}
