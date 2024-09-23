import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("YXVQXWYR")
public class PixFont extends Pix2D {

    @OriginalMember(owner = "YXVQXWYR", name = "x", descriptor = "Z")
    private boolean _flowObfuscator9 = false;

    @OriginalMember(owner = "YXVQXWYR", name = "y", descriptor = "I")
    private int _flowObfuscator10 = 445;

    @OriginalMember(owner = "YXVQXWYR", name = "z", descriptor = "I")
    private int _flowObfuscator11 = -471;

    @OriginalMember(owner = "YXVQXWYR", name = "A", descriptor = "I")
    private int _flowObfuscator12 = -471;

    @OriginalMember(owner = "YXVQXWYR", name = "B", descriptor = "Z")
    private boolean _flowObfuscator13 = false;

    @OriginalMember(owner = "YXVQXWYR", name = "C", descriptor = "I")
    private int _flowObfuscator14 = 3;

    @OriginalMember(owner = "YXVQXWYR", name = "D", descriptor = "Z")
    private boolean _flowObfuscator15 = false;

    @OriginalMember(owner = "YXVQXWYR", name = "E", descriptor = "[[B")
    public byte[][] charMask = new byte[256][];

    @OriginalMember(owner = "YXVQXWYR", name = "F", descriptor = "[I")
    public int[] charMaskWidth = new int[256];

    @OriginalMember(owner = "YXVQXWYR", name = "G", descriptor = "[I")
    public int[] charMaskHeight = new int[256];

    @OriginalMember(owner = "YXVQXWYR", name = "H", descriptor = "[I")
    public int[] charOffsetX = new int[256];

    @OriginalMember(owner = "YXVQXWYR", name = "I", descriptor = "[I")
    public int[] charOffsetY = new int[256];

    @OriginalMember(owner = "YXVQXWYR", name = "J", descriptor = "[I")
    public int[] charAdvance = new int[256];

    @OriginalMember(owner = "YXVQXWYR", name = "L", descriptor = "Ljava/util/Random;")
    public Random random = new Random();

    @OriginalMember(owner = "YXVQXWYR", name = "M", descriptor = "Z")
    public boolean strikethrough = false;

    @OriginalMember(owner = "YXVQXWYR", name = "K", descriptor = "I")
    public int height;

    @OriginalMember(owner = "YXVQXWYR", name = "<init>", descriptor = "(ZLjava/lang/String;ILXTGLDHGX;)V")
    public PixFont(boolean arg0, String arg1, int arg2, Jagfile arg3) {
        Packet var5 = new Packet(arg3.read(arg1 + ".dat", null), 891);
        Packet var6 = new Packet(arg3.read("index.dat", null), 891);
        boolean var7 = true;
        if (arg2 != 0) {
            this._flowObfuscator15 = !this._flowObfuscator15;
        }
        var6.pos = var5.g2() + 4;
        int var8 = var6.g1();
        if (var8 > 0) {
            var6.pos += (var8 - 1) * 3;
        }
        for (int var9 = 0; var9 < 256; var9++) {
            this.charOffsetX[var9] = var6.g1();
            this.charOffsetY[var9] = var6.g1();
            int var11 = this.charMaskWidth[var9] = var6.g2();
            int var12 = this.charMaskHeight[var9] = var6.g2();
            int var13 = var6.g1();
            int var14 = var11 * var12;
            this.charMask[var9] = new byte[var14];
            if (var13 == 0) {
                for (int var15 = 0; var15 < var14; var15++) {
                    this.charMask[var9][var15] = var5.g1b();
                }
            } else if (var13 == 1) {
                for (int var16 = 0; var16 < var11; var16++) {
                    for (int var17 = 0; var17 < var12; var17++) {
                        this.charMask[var9][var11 * var17 + var16] = var5.g1b();
                    }
                }
            }
            if (var12 > this.height && var9 < 128) {
                this.height = var12;
            }
            this.charOffsetX[var9] = 1;
            this.charAdvance[var9] = var11 + 2;
            int var18 = 0;
            for (int var19 = var12 / 7; var19 < var12; var19++) {
                var18 += this.charMask[var9][var11 * var19];
            }
            int var10002;
            if (var18 <= var12 / 7) {
                var10002 = this.charAdvance[var9]--;
                this.charOffsetX[var9] = 0;
            }
            int var20 = 0;
            for (int var21 = var12 / 7; var21 < var12; var21++) {
                var20 += this.charMask[var9][var11 * var21 + var11 - 1];
            }
            if (var20 <= var12 / 7) {
                var10002 = this.charAdvance[var9]--;
            }
        }
        if (arg0) {
            this.charAdvance[32] = this.charAdvance[73];
        } else {
            this.charAdvance[32] = this.charAdvance[105];
            if (Linkable._flowObfuscator2) {
            }
        }
    }

    @OriginalMember(owner = "YXVQXWYR", name = "a", descriptor = "(Ljava/lang/String;IIBI)V")
    public void drawStringRight(String arg0, int arg1, int arg2, byte arg3, int arg4) {
        this.drawString(arg2, arg0, arg4, 822, arg1 - this.stringWidth(arg0, true));
        if (arg3 != -80) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
    }

    @OriginalMember(owner = "YXVQXWYR", name = "a", descriptor = "(ILjava/lang/String;III)V")
    public void drawStringCenter(int arg0, String arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 23693) {
            this._flowObfuscator14 = 467;
        }
        this.drawString(arg0, arg1, arg3, 822, arg4 - this.stringWidth(arg1, true) / 2);
    }

    @OriginalMember(owner = "YXVQXWYR", name = "a", descriptor = "(IIILjava/lang/String;IZ)V")
    public void drawStringCenterTag(int arg0, int arg1, int arg2, String arg3, int arg4, boolean arg5) {
        int var7 = 74 / arg2;
        this.drawStringTag(false, arg5, arg1 - this.stringWidthTag(this._flowObfuscator10, arg3) / 2, arg0, arg3, arg4);
    }

    @OriginalMember(owner = "YXVQXWYR", name = "a", descriptor = "(ILjava/lang/String;)I")
    public int stringWidthTag(int arg0, String arg1) {
        int var3 = 75 / arg0;
        if (arg1 == null) {
            return 0;
        }
        int var4 = 0;
        for (int var5 = 0; var5 < arg1.length(); var5++) {
            if (arg1.charAt(var5) == '@' && var5 + 4 < arg1.length() && arg1.charAt(var5 + 4) == '@') {
                var5 += 4;
            } else {
                var4 += this.charAdvance[arg1.charAt(var5)];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "YXVQXWYR", name = "a", descriptor = "(Ljava/lang/String;Z)I")
    public int stringWidth(String arg0, boolean arg1) {
        if (!arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (arg0 == null) {
            return 0;
        }
        int var4 = 0;
        for (int var5 = 0; var5 < arg0.length(); var5++) {
            var4 += this.charAdvance[arg0.charAt(var5)];
        }
        return var4;
    }

    @OriginalMember(owner = "YXVQXWYR", name = "b", descriptor = "(ILjava/lang/String;III)V")
    public void drawString(int arg0, String arg1, int arg2, int arg3, int arg4) {
        if (arg1 == null) {
            return;
        }
        int var6 = arg2 - this.height;
        for (int var7 = 0; var7 < arg1.length(); var7++) {
            char var9 = arg1.charAt(var7);
            if (var9 != ' ') {
                this.plotChar(this.charMask[var9], this.charOffsetX[var9] + arg4, this.charOffsetY[var9] + var6, this.charMaskWidth[var9], this.charMaskHeight[var9], arg0);
            }
            arg4 += this.charAdvance[var9];
        }
        int var8 = 50 / arg3;
    }

    @OriginalMember(owner = "YXVQXWYR", name = "a", descriptor = "(IZLjava/lang/String;III)V")
    public void drawStringWave(int arg0, boolean arg1, String arg2, int arg3, int arg4, int arg5) {
        if (!arg1) {
            this._flowObfuscator15 = !this._flowObfuscator15;
        }
        if (arg2 == null) {
            return;
        }
        int var7 = arg3 - this.stringWidth(arg2, true) / 2;
        int var8 = arg5 - this.height;
        for (int var9 = 0; var9 < arg2.length(); var9++) {
            char var10 = arg2.charAt(var9);
            if (var10 != ' ') {
                this.plotChar(this.charMask[var10], this.charOffsetX[var10] + var7, this.charOffsetY[var10] + var8 + (int) (Math.sin((double) arg4 / 5.0D + (double) var9 / 2.0D) * 5.0D), this.charMaskWidth[var10], this.charMaskHeight[var10], arg0);
            }
            var7 += this.charAdvance[var10];
        }
    }

    @OriginalMember(owner = "YXVQXWYR", name = "a", descriptor = "(ILjava/lang/String;IIBI)V")
    public void drawStringWave2(int arg0, String arg1, int arg2, int arg3, byte arg4, int arg5) {
        if (arg1 == null) {
            return;
        }
        int var7 = arg0 - this.stringWidth(arg1, true) / 2;
        int var8 = arg3 - this.height;
        if (arg4 != 5) {
            return;
        }
        for (int var9 = 0; var9 < arg1.length(); var9++) {
            char var10 = arg1.charAt(var9);
            if (var10 != ' ') {
                this.plotChar(this.charMask[var10], this.charOffsetX[var10] + var7 + (int) (Math.sin((double) arg2 / 5.0D + (double) var9 / 5.0D) * 5.0D), this.charOffsetY[var10] + var8 + (int) (Math.sin((double) arg2 / 5.0D + (double) var9 / 3.0D) * 5.0D), this.charMaskWidth[var10], this.charMaskHeight[var10], arg5);
            }
            var7 += this.charAdvance[var10];
        }
    }

    @OriginalMember(owner = "YXVQXWYR", name = "a", descriptor = "(ILjava/lang/String;ZIIII)V")
    public void drawStringShake(int arg0, String arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!arg2) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        if (arg1 == null) {
            return;
        }
        double var9 = 7.0D - (double) arg0 / 8.0D;
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg5 - this.stringWidth(arg1, true) / 2;
        int var12 = arg4 - this.height;
        for (int var13 = 0; var13 < arg1.length(); var13++) {
            char var14 = arg1.charAt(var13);
            if (var14 != ' ') {
                this.plotChar(this.charMask[var14], this.charOffsetX[var14] + var11, this.charOffsetY[var14] + var12 + (int) (Math.sin((double) var13 / 1.5D + (double) arg3) * var9), this.charMaskWidth[var14], this.charMaskHeight[var14], arg6);
            }
            var11 += this.charAdvance[var14];
        }
    }

    @OriginalMember(owner = "YXVQXWYR", name = "a", descriptor = "(ZZIILjava/lang/String;I)V")
    public void drawStringTag(boolean arg0, boolean arg1, int arg2, int arg3, String arg4, int arg5) {
        this.strikethrough = false;
        int var7 = arg2;
        if (arg4 == null) {
            return;
        }
        int var8 = arg5 - this.height;
        for (int var9 = 0; var9 < arg4.length(); var9++) {
            if (arg4.charAt(var9) == '@' && var9 + 4 < arg4.length() && arg4.charAt(var9 + 4) == '@') {
                int var10 = this.evaluateTag(arg4.substring(var9 + 1, var9 + 4), this._flowObfuscator11);
                if (var10 != -1) {
                    arg3 = var10;
                }
                var9 += 4;
            } else {
                char var11 = arg4.charAt(var9);
                if (var11 != ' ') {
                    if (arg1) {
                        this.plotChar(this.charMask[var11], this.charOffsetX[var11] + arg2 + 1, this.charOffsetY[var11] + var8 + 1, this.charMaskWidth[var11], this.charMaskHeight[var11], 0);
                    }
                    this.plotChar(this.charMask[var11], this.charOffsetX[var11] + arg2, this.charOffsetY[var11] + var8, this.charMaskWidth[var11], this.charMaskHeight[var11], arg3);
                }
                arg2 += this.charAdvance[var11];
            }
        }
        if (!arg0 && this.strikethrough) {
            Pix2D.hline((int) ((double) this.height * 0.7D) + var8, 8388608, arg2 - var7, var7, (byte) 4);
        }
    }

    @OriginalMember(owner = "YXVQXWYR", name = "a", descriptor = "(ZIILjava/lang/String;III)V")
    public void drawStringTooltip(boolean arg0, int arg1, int arg2, String arg3, int arg4, int arg5, int arg6) {
        if (arg3 == null) {
            return;
        }
        this.random.setSeed((long) arg4);
        int var8 = (this.random.nextInt() & 0x1F) + 192;
        int var9 = arg6 - this.height;
        int var10 = 10 / arg5;
        for (int var11 = 0; var11 < arg3.length(); var11++) {
            if (arg3.charAt(var11) == '@' && var11 + 4 < arg3.length() && arg3.charAt(var11 + 4) == '@') {
                int var12 = this.evaluateTag(arg3.substring(var11 + 1, var11 + 4), this._flowObfuscator11);
                if (var12 != -1) {
                    arg2 = var12;
                }
                var11 += 4;
            } else {
                char var13 = arg3.charAt(var11);
                if (var13 != ' ') {
                    if (arg0) {
                        this.plotCharTrans(192, this.charOffsetX[var13] + arg1 + 1, this.charMask[var13], this.charMaskWidth[var13], this.charOffsetY[var13] + var9 + 1, this.charMaskHeight[var13], false, 0);
                    }
                    this.plotCharTrans(var8, this.charOffsetX[var13] + arg1, this.charMask[var13], this.charMaskWidth[var13], this.charOffsetY[var13] + var9, this.charMaskHeight[var13], false, arg2);
                }
                arg1 += this.charAdvance[var13];
                if ((this.random.nextInt() & 0x3) == 0) {
                    arg1++;
                }
            }
        }
    }

    @OriginalMember(owner = "YXVQXWYR", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public int evaluateTag(String arg0, int arg1) {
        if (arg1 >= 0) {
            this._flowObfuscator9 = !this._flowObfuscator9;
        }
        if (arg0.equals("red")) {
            return 16711680;
        } else if (arg0.equals("gre")) {
            return 65280;
        } else if (arg0.equals("blu")) {
            return 255;
        } else if (arg0.equals("yel")) {
            return 16776960;
        } else if (arg0.equals("cya")) {
            return 65535;
        } else if (arg0.equals("mag")) {
            return 16711935;
        } else if (arg0.equals("whi")) {
            return 16777215;
        } else if (arg0.equals("bla")) {
            return 0;
        } else if (arg0.equals("lre")) {
            return 16748608;
        } else if (arg0.equals("dre")) {
            return 8388608;
        } else if (arg0.equals("dbl")) {
            return 128;
        } else if (arg0.equals("or1")) {
            return 16756736;
        } else if (arg0.equals("or2")) {
            return 16740352;
        } else if (arg0.equals("or3")) {
            return 16723968;
        } else if (arg0.equals("gr1")) {
            return 12648192;
        } else if (arg0.equals("gr2")) {
            return 8453888;
        } else if (arg0.equals("gr3")) {
            return 4259584;
        } else {
            if (arg0.equals("str")) {
                this.strikethrough = true;
            }
            if (arg0.equals("end")) {
                this.strikethrough = false;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "YXVQXWYR", name = "a", descriptor = "([BIIIII)V")
    private void plotChar(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = Pix2D.width2d * arg2 + arg1;
        int var8 = Pix2D.width2d - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < Pix2D.boundTop) {
            int var11 = Pix2D.boundTop - arg2;
            arg4 -= var11;
            arg2 = Pix2D.boundTop;
            var10 += arg3 * var11;
            var7 += Pix2D.width2d * var11;
        }
        if (arg2 + arg4 >= Pix2D.boundBottom) {
            arg4 -= arg2 + arg4 + 1 - Pix2D.boundBottom;
        }
        if (arg1 < Pix2D.boundLeft) {
            int var12 = Pix2D.boundLeft - arg1;
            arg3 -= var12;
            arg1 = Pix2D.boundLeft;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 >= Pix2D.boundRight) {
            int var13 = arg1 + arg3 + 1 - Pix2D.boundRight;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.copyPixels(Pix2D.data, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "YXVQXWYR", name = "a", descriptor = "([I[BIIIIIII)V")
    private void copyPixels(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "YXVQXWYR", name = "a", descriptor = "(II[BIIIZI)V")
    private void plotCharTrans(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        int var9 = Pix2D.width2d * arg4 + arg1;
        int var10 = Pix2D.width2d - arg3;
        int var11 = 0;
        int var12 = 0;
        if (arg4 < Pix2D.boundTop) {
            int var13 = Pix2D.boundTop - arg4;
            arg5 -= var13;
            arg4 = Pix2D.boundTop;
            var12 += arg3 * var13;
            var9 += Pix2D.width2d * var13;
        }
        if (arg4 + arg5 >= Pix2D.boundBottom) {
            arg5 -= arg4 + arg5 + 1 - Pix2D.boundBottom;
        }
        if (arg1 < Pix2D.boundLeft) {
            int var14 = Pix2D.boundLeft - arg1;
            arg3 -= var14;
            arg1 = Pix2D.boundLeft;
            var12 += var14;
            var9 += var14;
            var11 += var14;
            var10 += var14;
        }
        if (arg1 + arg3 >= Pix2D.boundRight) {
            int var15 = arg1 + arg3 + 1 - Pix2D.boundRight;
            arg3 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (arg3 <= 0 || arg5 <= 0) {
            return;
        }
        this.copyPixelsTrans(arg2, arg5, var9, Pix2D.data, 520, var12, arg3, var11, var10, arg7, arg0);
        if (arg6) {
            for (int var16 = 1; var16 > 0; var16++) {
            }
        }
    }

    @OriginalMember(owner = "YXVQXWYR", name = "a", descriptor = "([BII[IIIIIIII)V")
    private void copyPixelsTrans(byte[] arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var12 = 98 / arg4;
        int var13 = ((arg9 & 0xFF00FF) * arg10 & 0xFF00FF00) + ((arg9 & 0xFF00) * arg10 & 0xFF0000) >> 8;
        int var14 = 256 - arg10;
        for (int var15 = -arg1; var15 < 0; var15++) {
            for (int var16 = -arg6; var16 < 0; var16++) {
                if (arg0[arg5++] == 0) {
                    arg2++;
                } else {
                    int var17 = arg3[arg2];
                    arg3[arg2++] = (((var17 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var17 & 0xFF00) * var14 & 0xFF0000) >> 8) + var13;
                }
            }
            arg2 += arg8;
            arg5 += arg7;
        }
    }
}
