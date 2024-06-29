import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!f")
public class WorldMapFont extends Draw2D {

    @OriginalMember(owner = "mapview!f", name = "p", descriptor = "Z")
    public boolean field48 = false;

    @OriginalMember(owner = "mapview!f", name = "q", descriptor = "I")
    public int field49 = 0;

    @OriginalMember(owner = "mapview!f", name = "r", descriptor = "[B")
    public byte[] field50 = new byte[100000];

    @OriginalMember(owner = "mapview!f", name = "s", descriptor = "[I")
    public static int[] field51 = new int[256];

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "(Ljava/awt/Font;Ljava/awt/FontMetrics;CIZLa;)V")
    private void method22(Font arg0, FontMetrics arg1, char arg2, int arg3, boolean arg4, GameShell arg5) {
        int var7 = arg1.charWidth(arg2);
        int var8 = var7;
        if (arg4) {
            try {
                if (arg2 == '/') {
                    arg4 = false;
                }
                if (arg2 == 'f' || arg2 == 't' || arg2 == 'w' || arg2 == 'v' || arg2 == 'k' || arg2 == 'x' || arg2 == 'y' || arg2 == 'A' || arg2 == 'V' || arg2 == 'W') {
                    var7++;
                }
            } catch (Exception var39) {
            }
        }
        int var10 = arg1.getMaxAscent();
        int var11 = arg1.getMaxAscent() + arg1.getMaxDescent();
        int var12 = arg1.getHeight();
        Image var13 = arg5.method9().createImage(var7, var11);
        Graphics var14 = var13.getGraphics();
        var14.setColor(Color.black);
        var14.fillRect(0, 0, var7, var11);
        var14.setColor(Color.white);
        var14.setFont(arg0);
        var14.drawString(arg2 + "", 0, var10);
        if (arg4) {
            var14.drawString(arg2 + "", 1, var10);
        }
        int[] var15 = new int[var7 * var11];
        PixelGrabber var16 = new PixelGrabber(var13, 0, 0, var7, var11, var15, 0, var7);
        try {
            var16.grabPixels();
        } catch (Exception var38) {
        }
        var13.flush();
        Object var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = var7;
        int var22 = var11;
        label143: for (int var23 = 0; var23 < var11; var23++) {
            for (int var24 = 0; var24 < var7; var24++) {
                int var25 = var15[var7 * var23 + var24];
                if ((var25 & 0xFFFFFF) != 0) {
                    var20 = var23;
                    break label143;
                }
            }
        }
        label129: for (int var26 = 0; var26 < var7; var26++) {
            for (int var27 = 0; var27 < var11; var27++) {
                int var28 = var15[var7 * var27 + var26];
                if ((var28 & 0xFFFFFF) != 0) {
                    var19 = var26;
                    break label129;
                }
            }
        }
        label115: for (int var29 = var11 - 1; var29 >= 0; var29--) {
            for (int var30 = 0; var30 < var7; var30++) {
                int var31 = var15[var7 * var29 + var30];
                if ((var31 & 0xFFFFFF) != 0) {
                    var22 = var29 + 1;
                    break label115;
                }
            }
        }
        label101: for (int var32 = var7 - 1; var32 >= 0; var32--) {
            for (int var33 = 0; var33 < var11; var33++) {
                int var34 = var15[var7 * var33 + var32];
                if ((var34 & 0xFFFFFF) != 0) {
                    var21 = var32 + 1;
                    break label101;
                }
            }
        }
        this.field50[arg3 * 9] = (byte) (this.field49 / 16384);
        this.field50[arg3 * 9 + 1] = (byte) (this.field49 / 128 & 0x7F);
        this.field50[arg3 * 9 + 2] = (byte) (this.field49 & 0x7F);
        this.field50[arg3 * 9 + 3] = (byte) (var21 - var19);
        this.field50[arg3 * 9 + 4] = (byte) (var22 - var20);
        this.field50[arg3 * 9 + 5] = (byte) var19;
        this.field50[arg3 * 9 + 6] = (byte) (var10 - var20);
        this.field50[arg3 * 9 + 7] = (byte) var8;
        this.field50[arg3 * 9 + 8] = (byte) var12;
        for (int var35 = var20; var35 < var22; var35++) {
            for (int var36 = var19; var36 < var21; var36++) {
                int var37 = var15[var7 * var35 + var36] & 0xFF;
                if (var37 > 30 && var37 < 230) {
                    this.field48 = true;
                }
                this.field50[this.field49++] = (byte) var37;
            }
        }
    }

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "(Ljava/lang/String;IIIZ)V")
    public void method23(String arg0, int arg1, int arg2, int arg3, boolean arg4) {
        try {
            if (this.field48 || arg3 == 0) {
                arg4 = false;
            }
            for (int var6 = 0; var6 < arg0.length(); var6++) {
                int var7 = field51[arg0.charAt(var6)];
                if (arg4) {
                    this.method28(var7, arg1 + 1, arg2, 0, this.field50, this.field48);
                    this.method28(var7, arg1, arg2 + 1, 0, this.field50, this.field48);
                }
                this.method28(var7, arg1, arg2, arg3, this.field50, this.field48);
                arg1 += this.field50[var7 + 7];
            }
        } catch (Exception var9) {
            System.out.println("drawstring: " + var9);
            var9.printStackTrace();
        }
    }

    @OriginalMember(owner = "mapview!f", name = "<init>", descriptor = "(IZLa;)V")
    public WorldMapFont(int arg0, boolean arg1, GameShell arg2) {
        this.field49 = 855;
        this.field48 = false;
        Font var4 = new Font("Helvetica", arg1 ? 1 : 0, arg0);
        FontMetrics var5 = arg2.getFontMetrics(var4);
        for (int var6 = 0; var6 < 95; var6++) {
            this.method22(var4, var5, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var6), var6, false, arg2);
        }
        if (arg1 && this.field48) {
            this.field49 = 855;
            this.field48 = false;
            Font var7 = new Font("Helvetica", 0, arg0);
            FontMetrics var8 = arg2.getFontMetrics(var7);
            for (int var9 = 0; var9 < 95; var9++) {
                this.method22(var7, var8, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var9), var9, false, arg2);
            }
            if (!this.field48) {
                this.field49 = 855;
                this.field48 = false;
                for (int var10 = 0; var10 < 95; var10++) {
                    this.method22(var7, var8, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var10), var10, true, arg2);
                }
            }
        }
        byte[] var11 = new byte[this.field49];
        for (int var12 = 0; var12 < this.field49; var12++) {
            var11[var12] = this.field50[var12];
        }
        this.field50 = var11;
    }

    @OriginalMember(owner = "mapview!f", name = "b", descriptor = "(Ljava/lang/String;IIIZ)V")
    public void method24(String arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = this.method27(arg0) / 2;
        int var7 = this.method30();
        if (arg1 - var6 <= Draw2D.field43 && (arg1 + var6 >= Draw2D.field42 && (arg2 - var7 <= Draw2D.field41 && arg2 >= 0))) {
            this.method23(arg0, arg1 - var6, arg2, arg3, arg4);
        }
    }

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "([I[BIIIIIII)V")
    private void method25(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        for (int var10 = -arg6; var10 < 0; var10++) {
            for (int var11 = -arg5; var11 < 0; var11++) {
                int var12 = arg1[arg3++] & 0xFF;
                if (var12 <= 30) {
                    arg4++;
                } else if (var12 >= 230) {
                    arg0[arg4++] = arg2;
                } else {
                    int var13 = arg0[arg4];
                    arg0[arg4++] = ((arg2 & 0xFF00FF) * var12 + (var13 & 0xFF00FF) * (256 - var12) & 0xFF00FF00) + ((arg2 & 0xFF00) * var12 + (var13 & 0xFF00) * (256 - var12) & 0xFF0000) >> 8;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "mapview!f", name = "b", descriptor = "()I")
    public int method26() {
        return this.field50[8] - 1;
    }

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "(Ljava/lang/String;)I")
    public int method27(String arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            if (arg0.charAt(var3) == '@' && var3 + 4 < arg0.length() && arg0.charAt(var3 + 4) == '@') {
                var3 += 4;
            } else if (arg0.charAt(var3) == '~' && var3 + 4 < arg0.length() && arg0.charAt(var3 + 4) == '~') {
                var3 += 4;
            } else {
                var2 += this.field50[field51[arg0.charAt(var3)] + 7];
            }
        }
        return var2;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var0);
            if (var1 == -1) {
                var1 = 74;
            }
            field51[var0] = var1 * 9;
        }
    }

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "(IIII[BZ)V")
    private void method28(int arg0, int arg1, int arg2, int arg3, byte[] arg4, boolean arg5) {
        int var7 = arg4[arg0 + 5] + arg1;
        int var8 = arg2 - arg4[arg0 + 6];
        int var9 = arg4[arg0 + 3];
        int var10 = arg4[arg0 + 4];
        int var11 = arg4[arg0 + 1] * 128 + arg4[arg0] * 16384 + arg4[arg0 + 2];
        int var12 = Draw2D.field38 * var8 + var7;
        int var13 = Draw2D.field38 - var9;
        int var14 = 0;
        if (var8 < Draw2D.field40) {
            int var15 = Draw2D.field40 - var8;
            var10 -= var15;
            var8 = Draw2D.field40;
            var11 += var9 * var15;
            var12 += Draw2D.field38 * var15;
        }
        if (var8 + var10 >= Draw2D.field41) {
            var10 -= var8 + var10 + 1 - Draw2D.field41;
        }
        if (var7 < Draw2D.field42) {
            int var16 = Draw2D.field42 - var7;
            var9 -= var16;
            var7 = Draw2D.field42;
            var11 += var16;
            var12 += var16;
            var14 += var16;
            var13 += var16;
        }
        if (var7 + var9 >= Draw2D.field43) {
            int var17 = var7 + var9 + 1 - Draw2D.field43;
            var9 -= var17;
            var14 += var17;
            var13 += var17;
        }
        if (var9 <= 0 || var10 <= 0) {
            return;
        }
        if (arg5) {
            this.method25(Draw2D.field37, arg4, arg3, var11, var12, var9, var10, var13, var14);
        } else {
            this.method29(Draw2D.field37, arg4, arg3, var11, var12, var9, var10, var13, var14);
        }
    }

    @OriginalMember(owner = "mapview!f", name = "b", descriptor = "([I[BIIIIIII)V")
    private void method29(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        try {
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
        } catch (Exception var16) {
            System.out.println("plotletter: " + var16);
            var16.printStackTrace();
        }
    }

    @OriginalMember(owner = "mapview!f", name = "c", descriptor = "()I")
    public int method30() {
        return this.field50[6];
    }
}
