import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ea")
public class class10 extends class19 {

    @OriginalMember(owner = "mapview!ea", name = "J", descriptor = "[[B")
    private byte[][] field111 = new byte[256][];

    @OriginalMember(owner = "mapview!ea", name = "M", descriptor = "I")
    private int field114 = 0;

    @OriginalMember(owner = "mapview!ea", name = "W", descriptor = "Z")
    private boolean field124;

    @OriginalMember(owner = "mapview!ea", name = "E", descriptor = "[I")
    private int[] field106;

    @OriginalMember(owner = "mapview!ea", name = "U", descriptor = "[I")
    private int[] field122;

    @OriginalMember(owner = "mapview!ea", name = "I", descriptor = "[I")
    private int[] field110;

    @OriginalMember(owner = "mapview!ea", name = "B", descriptor = "Ld;")
    private static class7 field103 = class38.method251((byte) -102, "dre");

    @OriginalMember(owner = "mapview!ea", name = "G", descriptor = "Ld;")
    private static class7 field108 = class38.method251((byte) -103, "dbl");

    @OriginalMember(owner = "mapview!ea", name = "N", descriptor = "Ld;")
    private static class7 field115 = class38.method251((byte) 105, "red");

    @OriginalMember(owner = "mapview!ea", name = "A", descriptor = "Ld;")
    private static class7 field102 = class38.method251((byte) 92, "gr2");

    @OriginalMember(owner = "mapview!ea", name = "K", descriptor = "Ld;")
    private static class7 field112 = class38.method251((byte) 75, "lre");

    @OriginalMember(owner = "mapview!ea", name = "O", descriptor = "Ld;")
    private static class7 field116 = class38.method251((byte) 108, "or2");

    @OriginalMember(owner = "mapview!ea", name = "Q", descriptor = "Ld;")
    private static class7 field118 = class38.method251((byte) -86, "mag");

    @OriginalMember(owner = "mapview!ea", name = "R", descriptor = "Ld;")
    private static class7 field119 = class38.method251((byte) 105, "bla");

    @OriginalMember(owner = "mapview!ea", name = "C", descriptor = "Ld;")
    private static class7 field104 = class38.method251((byte) 121, "or3");

    @OriginalMember(owner = "mapview!ea", name = "D", descriptor = "Ld;")
    private static class7 field105 = class38.method251((byte) -102, "or1");

    @OriginalMember(owner = "mapview!ea", name = "H", descriptor = "Ld;")
    private static class7 field109 = class38.method251((byte) 58, "blu");

    @OriginalMember(owner = "mapview!ea", name = "T", descriptor = "Ld;")
    private static class7 field121 = class38.method251((byte) -67, "str");

    @OriginalMember(owner = "mapview!ea", name = "P", descriptor = "Ld;")
    private static class7 field117 = class38.method251((byte) -110, "whi");

    @OriginalMember(owner = "mapview!ea", name = "V", descriptor = "Ld;")
    private static class7 field123 = class38.method251((byte) -99, "gr1");

    @OriginalMember(owner = "mapview!ea", name = "L", descriptor = "Ld;")
    private static class7 field113 = class38.method251((byte) -66, "yel");

    @OriginalMember(owner = "mapview!ea", name = "S", descriptor = "Ld;")
    private static class7 field120 = class38.method251((byte) 108, "gr3");

    @OriginalMember(owner = "mapview!ea", name = "F", descriptor = "Ld;")
    private static class7 field107 = class38.method251((byte) 102, "cya");

    @OriginalMember(owner = "mapview!ea", name = "X", descriptor = "Ld;")
    private static class7 field125 = class38.method251((byte) -100, "gre");

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(Ld;III)V", line = 13)
    public final void method91(class7 arg0, int arg1, int arg2, int arg3) {
        this.method94(arg0, arg1 - this.method92(arg0) / 2, arg2, arg3);
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(Ld;)I", line = 27)
    public final int method92(class7 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.field76; var3++) {
            var2 += this.field122[arg0.field75[var3] & 0xFF];
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "([I[BIIIIIII)V", line = 43)
    private final void method93(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "mapview!ea", name = "b", descriptor = "(Ld;III)V", line = 108)
    public final void method94(class7 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return;
        }
        int var5 = arg2 - this.field114;
        for (int var6 = 0; var6 < arg0.field76; var6++) {
            int var7 = arg0.field75[var6] & 0xFF;
            if (var7 != 32) {
                this.method97(this.field111[var7], arg1, this.field106[var7] + var5, this.field122[var7], this.field110[var7], arg3);
            }
            arg1 += this.field122[var7];
        }
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(Ld;IIIZ)V", line = 143)
    public final void method95(class7 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field124 = false;
        int var6 = arg1;
        if (arg0 == null) {
            return;
        }
        int var7 = arg2 - this.field114;
        for (int var8 = 0; var8 < arg0.field76; var8++) {
            if (arg0.field75[var8] == 64 && var8 + 4 < arg0.field76 && arg0.field75[var8 + 4] == 64) {
                int var9 = this.method96(arg0.method57(var8 + 1, var8 + 4, 117));
                if (var9 != -1) {
                    arg3 = var9;
                }
                var8 += 4;
            } else {
                int var10 = arg0.field75[var8] & 0xFF;
                if (var10 != 32) {
                    if (arg4) {
                        this.method97(this.field111[var10], arg1 + 1, this.field106[var10] + var7 + 1, this.field122[var10], this.field110[var10], 0);
                    }
                    this.method97(this.field111[var10], arg1, this.field106[var10] + var7, this.field122[var10], this.field110[var10], arg3);
                }
                arg1 += this.field122[var10];
            }
        }
        if (this.field124) {
            class19.method139(var6, (int) ((double) this.field114 * 0.7D) + var7, arg1 - var6, 8388608);
        }
    }

    @OriginalMember(owner = "mapview!ea", name = "b", descriptor = "(Ld;)I", line = 196)
    private final int method96(class7 arg0) {
        if (arg0.method66((byte) 105, field115)) {
            return 16711680;
        } else if (arg0.method66((byte) 105, field125)) {
            return 65280;
        } else if (arg0.method66((byte) 105, field109)) {
            return 255;
        } else if (arg0.method66((byte) 105, field113)) {
            return 16776960;
        } else if (arg0.method66((byte) 105, field107)) {
            return 65535;
        } else if (arg0.method66((byte) 105, field118)) {
            return 16711935;
        } else if (arg0.method66((byte) 105, field117)) {
            return 16777215;
        } else if (arg0.method66((byte) 105, field119)) {
            return 0;
        } else if (arg0.method66((byte) 105, field112)) {
            return 16748608;
        } else if (arg0.method66((byte) 105, field103)) {
            return 8388608;
        } else if (arg0.method66((byte) 105, field108)) {
            return 128;
        } else if (arg0.method66((byte) 105, field105)) {
            return 16756736;
        } else if (arg0.method66((byte) 105, field116)) {
            return 16740352;
        } else if (arg0.method66((byte) 105, field104)) {
            return 16723968;
        } else if (arg0.method66((byte) 105, field123)) {
            return 12648192;
        } else if (arg0.method66((byte) 105, field102)) {
            return 8453888;
        } else if (arg0.method66((byte) 105, field120)) {
            return 4259584;
        } else {
            if (arg0.method66((byte) 105, field121)) {
                this.field124 = true;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "([BIIIII)V", line = 255)
    private final void method97(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class19.field201 * arg2 + arg1;
        int var8 = class19.field201 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class19.field202) {
            int var11 = class19.field202 - arg2;
            arg4 -= var11;
            arg2 = class19.field202;
            var10 += arg3 * var11;
            var7 += class19.field201 * var11;
        }
        if (arg2 + arg4 > class19.field204) {
            arg4 -= arg2 + arg4 - class19.field204;
        }
        if (arg1 < class19.field205) {
            int var12 = class19.field205 - arg1;
            arg3 -= var12;
            arg1 = class19.field205;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class19.field206) {
            int var13 = arg1 + arg3 - class19.field206;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method93(class19.field203, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "mapview!ea", name = "c", descriptor = "(Ld;III)V", line = 303)
    public final void method98(class7 arg0, int arg1, int arg2, int arg3) {
        this.method94(arg0, arg1 - this.method92(arg0), arg2, arg3);
    }

    @OriginalMember(owner = "mapview!ea", name = "<init>", descriptor = "([I[I[I[I[[B)V", line = 396)
    public class10(int[] arg0, int[] arg1, int[] arg2, int[] arg3, byte[][] arg4) {
        new Random();
        this.field124 = false;
        this.field106 = arg0;
        this.field122 = arg1;
        this.field110 = arg2;
        byte var6 = 0;
        for (int var7 = 1; var7 < arg3.length; var7++) {
            if (arg3[var7] == 1) {
                var6 = (byte) var7;
            }
        }
        this.field111 = arg4;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field106[var10] < var8) {
                var8 = this.field106[var10];
            }
            if (this.field110[var10] + this.field106[var10] > var9) {
                var9 = this.field110[var10] + this.field106[var10];
            }
            byte[] var11 = this.field111[var10];
            int var12 = var11.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11[var13] = (byte) (var11[var13] == var6 ? 0 : 1);
            }
        }
        this.field114 = this.field110[32] + this.field106[32];
    }

    @OriginalMember(owner = "mapview!ea", name = "c", descriptor = "()V", line = 315)
    public static void method99() {
        field121 = null;
        field115 = null;
        field125 = null;
        field109 = null;
        field113 = null;
        field107 = null;
        field118 = null;
        field117 = null;
        field119 = null;
        field112 = null;
        field103 = null;
        field108 = null;
        field105 = null;
        field116 = null;
        field104 = null;
        field123 = null;
        field102 = null;
        field120 = null;
    }
}
