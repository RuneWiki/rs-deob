import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!s")
public class PixFont extends Draw2D {

    @OriginalMember(owner = "mapview!s", name = "G", descriptor = "[[B")
    private byte[][] fontChar = new byte[256][];

    @OriginalMember(owner = "mapview!s", name = "I", descriptor = "I")
    private int field419 = 0;

    @OriginalMember(owner = "mapview!s", name = "V", descriptor = "[I")
    private int[] field432;

    @OriginalMember(owner = "mapview!s", name = "L", descriptor = "[I")
    private int[] field422;

    @OriginalMember(owner = "mapview!s", name = "w", descriptor = "[I")
    private int[] field408;

    @OriginalMember(owner = "mapview!s", name = "y", descriptor = "Lv;")
    private static JagString field410 = class1.method2(255, "mag");

    @OriginalMember(owner = "mapview!s", name = "C", descriptor = "Lv;")
    private static JagString field413 = class1.method2(255, "dbl");

    @OriginalMember(owner = "mapview!s", name = "D", descriptor = "Lv;")
    private static JagString field414 = class1.method2(255, "dre");

    @OriginalMember(owner = "mapview!s", name = "E", descriptor = "Lv;")
    private static JagString field415 = class1.method2(255, "red");

    @OriginalMember(owner = "mapview!s", name = "x", descriptor = "Lv;")
    private static JagString field409 = class1.method2(255, "or3");

    @OriginalMember(owner = "mapview!s", name = "M", descriptor = "Z")
    private static boolean strikethrough = false;

    @OriginalMember(owner = "mapview!s", name = "H", descriptor = "Lv;")
    private static JagString field418 = class1.method2(255, "gr2");

    @OriginalMember(owner = "mapview!s", name = "K", descriptor = "Lv;")
    private static JagString field421 = class1.method2(255, "or2");

    @OriginalMember(owner = "mapview!s", name = "z", descriptor = "Lv;")
    private static JagString field411 = class1.method2(255, "lre");

    @OriginalMember(owner = "mapview!s", name = "F", descriptor = "Lv;")
    private static JagString field416 = class1.method2(255, "str");

    @OriginalMember(owner = "mapview!s", name = "J", descriptor = "Lv;")
    private static JagString field420 = class1.method2(255, "blu");

    @OriginalMember(owner = "mapview!s", name = "P", descriptor = "Lv;")
    private static JagString field426 = class1.method2(255, "cya");

    @OriginalMember(owner = "mapview!s", name = "B", descriptor = "Lv;")
    private static JagString field412 = class1.method2(255, "yel");

    @OriginalMember(owner = "mapview!s", name = "N", descriptor = "Lv;")
    private static JagString field424 = class1.method2(255, "dma");

    @OriginalMember(owner = "mapview!s", name = "S", descriptor = "Lv;")
    private static JagString field429 = class1.method2(255, "bla");

    @OriginalMember(owner = "mapview!s", name = "O", descriptor = "Lv;")
    private static JagString field425 = class1.method2(255, "whi");

    @OriginalMember(owner = "mapview!s", name = "U", descriptor = "Lv;")
    private static JagString field431 = class1.method2(255, "gr3");

    @OriginalMember(owner = "mapview!s", name = "T", descriptor = "Lv;")
    private static JagString field430 = class1.method2(255, "gr1");

    @OriginalMember(owner = "mapview!s", name = "Q", descriptor = "Lv;")
    private static JagString field427 = class1.method2(255, "or1");

    @OriginalMember(owner = "mapview!s", name = "R", descriptor = "Lv;")
    private static JagString field428 = class1.method2(255, "gre");

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(Lv;III)V", line = 5)
    public final void drawStringCenter(JagString arg0, int arg1, int arg2, int arg3) {
        this.drawString(arg0, arg1 - this.stringWidth(arg0) / 2, arg2, arg3);
    }

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(Lv;)I", line = 20)
    public final int stringWidth(JagString arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.field468; var3++) {
            var2 += this.field422[arg0.field474[var3] & 0xFF];
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(Lv;IIIZ)V", line = 42)
    public final void drawString(JagString arg0, int arg1, int arg2, int arg3, boolean arg4) {
        strikethrough = false;
        int var6 = arg1;
        if (arg0 == null) {
            return;
        }
        int var7 = arg2 - this.field419;
        for (int var8 = 0; var8 < arg0.field468; var8++) {
            if (arg0.field474[var8] == 64 && var8 + 4 < arg0.field468 && arg0.field474[var8 + 4] == 64) {
                int var9 = this.evaluate(arg0.method241(true, var8 + 1, var8 + 4));
                if (var9 != -1) {
                    arg3 = var9;
                }
                var8 += 4;
            } else {
                int var10 = arg0.field474[var8] & 0xFF;
                if (var10 != 32) {
                    if (arg4) {
                        drawChar(this.fontChar[var10], arg1 + 1, this.field432[var10] + var7 + 1, this.field422[var10], this.field408[var10], 0);
                    }
                    drawChar(this.fontChar[var10], arg1, this.field432[var10] + var7, this.field422[var10], this.field408[var10], arg3);
                }
                arg1 += this.field422[var10];
            }
        }
        if (strikethrough) {
            Draw2D.drawHorizontalLine(var6, (int) ((double) this.field419 * 0.7D) + var7, arg1 - var6, 8388608);
        }
    }

    @OriginalMember(owner = "mapview!s", name = "b", descriptor = "(Lv;III)V", line = 104)
    public final void drawString(JagString arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return;
        }
        int var5 = arg2 - this.field419;
        for (int var6 = 0; var6 < arg0.field468; var6++) {
            int var7 = arg0.field474[var6] & 0xFF;
            if (var7 != 32) {
                drawChar(this.fontChar[var7], arg1, this.field432[var7] + var5, this.field422[var7], this.field408[var7], arg3);
            }
            arg1 += this.field422[var7];
        }
    }

    @OriginalMember(owner = "mapview!s", name = "c", descriptor = "(Lv;III)V", line = 127)
    public final void drawStringRight(JagString arg0, int arg1, int arg2, int arg3) {
        this.drawString(arg0, arg1 - this.stringWidth(arg0), arg2, arg3);
    }

    @OriginalMember(owner = "mapview!s", name = "<init>", descriptor = "([I[I[I[I[[B)V", line = 412)
    public PixFont(int[] arg0, int[] arg1, int[] arg2, int[] arg3, byte[][] arg4) {
        new Random();
        this.field432 = arg0;
        this.field422 = arg1;
        this.field408 = arg2;
        byte var6 = 0;
        for (int var7 = 1; var7 < arg3.length; var7++) {
            if (arg3[var7] == 1) {
                var6 = (byte) var7;
            }
        }
        this.fontChar = arg4;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field432[var10] < var8 && this.field408[var10] != 0) {
                var8 = this.field432[var10];
            }
            if (this.field432[var10] + this.field408[var10] > var9) {
                var9 = this.field432[var10] + this.field408[var10];
            }
            byte[] var11 = this.fontChar[var10];
            int var12 = var11.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11[var13] = (byte) (var11[var13] == var6 ? 0 : 1);
            }
        }
        this.field419 = this.field432[32] + this.field408[32];
    }

    @OriginalMember(owner = "mapview!s", name = "b", descriptor = "(Lv;)I", line = 143)
    private final int evaluate(JagString arg0) {
        if (arg0.method245(field415, -120)) {
            return 16711680;
        } else if (arg0.method245(field428, -108)) {
            return 65280;
        } else if (arg0.method245(field420, -127)) {
            return 255;
        } else if (arg0.method245(field412, -120)) {
            return 16776960;
        } else if (arg0.method245(field426, -120)) {
            return 65535;
        } else if (arg0.method245(field410, -108)) {
            return 16711935;
        } else if (arg0.method245(field425, -128)) {
            return 16777215;
        } else if (arg0.method245(field429, -120)) {
            return 0;
        } else if (arg0.method245(field414, -86)) {
            return 8388608;
        } else if (arg0.method245(field413, -121)) {
            return 128;
        } else if (arg0.method245(field424, -88)) {
            return 8388736;
        } else if (arg0.method245(field411, -118)) {
            return 16748608;
        } else if (arg0.method245(field427, -127)) {
            return 16756736;
        } else if (arg0.method245(field421, -119)) {
            return 16740352;
        } else if (arg0.method245(field409, -100)) {
            return 16723968;
        } else if (arg0.method245(field430, -118)) {
            return 12648192;
        } else if (arg0.method245(field418, -87)) {
            return 8453888;
        } else if (arg0.method245(field431, -89)) {
            return 4259584;
        } else {
            if (arg0.method245(field416, -85)) {
                strikethrough = true;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "mapview!s", name = "c", descriptor = "()V", line = 227)
    public static void method203() {
        field416 = null;
        field415 = null;
        field428 = null;
        field420 = null;
        field412 = null;
        field426 = null;
        field410 = null;
        field425 = null;
        field429 = null;
        field414 = null;
        field413 = null;
        field424 = null;
        field411 = null;
        field427 = null;
        field421 = null;
        field409 = null;
        field430 = null;
        field418 = null;
        field431 = null;
    }

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "([I[BIIIIIII)V", line = 249)
    private static final void plotLetter(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "([BIIIII)V", line = 355)
    private static final void drawChar(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = Draw2D.width * arg2 + arg1;
        int var7 = Draw2D.width - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < Draw2D.top) {
            int var10 = Draw2D.top - arg2;
            arg4 -= var10;
            arg2 = Draw2D.top;
            var9 += arg3 * var10;
            var6 += Draw2D.width * var10;
        }
        if (arg2 + arg4 > Draw2D.bottom) {
            arg4 -= arg2 + arg4 - Draw2D.bottom;
        }
        if (arg1 < Draw2D.left) {
            int var11 = Draw2D.left - arg1;
            arg3 -= var11;
            arg1 = Draw2D.left;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > Draw2D.right) {
            int var12 = arg1 + arg3 - Draw2D.right;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            plotLetter(Draw2D.data, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }
}
