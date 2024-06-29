import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!h")
public class class15 extends class27 {

    @OriginalMember(owner = "mapview!h", name = "B", descriptor = "I")
    private int field141 = 0;

    @OriginalMember(owner = "mapview!h", name = "D", descriptor = "Z")
    private boolean field143 = false;

    @OriginalMember(owner = "mapview!h", name = "C", descriptor = "[B")
    private byte[] field142 = new byte[100000];

    @OriginalMember(owner = "mapview!h", name = "E", descriptor = "Ljava/lang/String;")
    private static String field144 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| " + String.valueOf('Ä') + 'Ë' + 'Ï' + 'Ö' + 'Ü' + 'ä' + 'ë' + 'ï' + 'ö' + 'ü' + 'ÿ' + 'ß';

    @OriginalMember(owner = "mapview!h", name = "F", descriptor = "I")
    private static int field145 = field144.length();

    @OriginalMember(owner = "mapview!h", name = "G", descriptor = "[I")
    private static int[] field146 = new int[256];

    @OriginalMember(owner = "mapview!h", name = "c", descriptor = "()I", line = 5)
    public final int method76() {
        return this.field142[6];
    }

    @OriginalMember(owner = "mapview!h", name = "d", descriptor = "()V", line = 8)
    public static void method77() {
        field144 = null;
        field146 = null;
    }

    @OriginalMember(owner = "mapview!h", name = "e", descriptor = "()I", line = 12)
    public final int method78() {
        return this.field142[8] - 1;
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "([I[BIIIIIII)V", line = 17)
    private final void method79(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "mapview!h", name = "<init>", descriptor = "(IZLjava/awt/Component;)V", line = 220)
    public class15(int arg0, boolean arg1, Component arg2) {
        this.field141 = field145 * 9;
        this.field143 = false;
        Font var4 = new Font("Helvetica", arg1 ? 1 : 0, arg0);
        FontMetrics var5 = arg2.getFontMetrics(var4);
        for (int var6 = 0; var6 < field145; var6++) {
            this.method84(var4, var5, field144.charAt(var6), var6, false);
        }
        if (arg1 && this.field143) {
            this.field141 = field145 * 9;
            this.field143 = false;
            Font var7 = new Font("Helvetica", 0, arg0);
            FontMetrics var8 = arg2.getFontMetrics(var7);
            for (int var9 = 0; var9 < field145; var9++) {
                this.method84(var7, var8, field144.charAt(var9), var9, false);
            }
            if (!this.field143) {
                this.field141 = field145 * 9;
                this.field143 = false;
                for (int var10 = 0; var10 < field145; var10++) {
                    this.method84(var7, var8, field144.charAt(var10), var10, true);
                }
            }
        }
        byte[] var11 = new byte[this.field141];
        for (int var12 = 0; var12 < this.field141; var12++) {
            var11[var12] = this.field142[var12];
        }
        this.field142 = var11;
    }

    @OriginalMember(owner = "mapview!h", name = "b", descriptor = "([I[BIIIIIII)V", line = 56)
    private final void method80(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(IIII[B)V", line = 112)
    private final void method81(int arg0, int arg1, int arg2, int arg3, byte[] arg4) {
        int var6 = arg4[arg0 + 5] + arg1;
        int var7 = arg2 - arg4[arg0 + 6];
        int var8 = arg4[arg0 + 3];
        int var9 = arg4[arg0 + 4];
        int var10 = arg4[arg0 + 1] * 128 + arg4[arg0] * 16384 + arg4[arg0 + 2];
        int var11 = class27.field337 * var7 + var6;
        int var12 = class27.field337 - var8;
        int var13 = 0;
        if (var7 < class27.field339) {
            int var14 = class27.field339 - var7;
            var9 -= var14;
            var7 = class27.field339;
            var10 += var8 * var14;
            var11 += class27.field337 * var14;
        }
        if (var7 + var9 >= class27.field336) {
            var9 -= var7 + var9 + 1 - class27.field336;
        }
        if (var6 < class27.field340) {
            int var15 = class27.field340 - var6;
            var8 -= var15;
            var6 = class27.field340;
            var10 += var15;
            var11 += var15;
            var13 += var15;
            var12 += var15;
        }
        if (var6 + var8 >= class27.field341) {
            int var16 = var6 + var8 + 1 - class27.field341;
            var8 -= var16;
            var13 += var16;
            var12 += var16;
        }
        if (var8 <= 0 || var9 <= 0) {
            return;
        }
        if (this.field143) {
            this.method79(class27.field338, arg4, arg3, var10, var11, var8, var9, var12, var13);
        } else {
            this.method80(class27.field338, arg4, arg3, var10, var11, var8, var9, var12, var13);
        }
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(Lu;)I", line = 173)
    private final int method82(class38 arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.method239(-6588); var3++) {
            if (arg0.method238(var3, -106) == 64 && var3 + 4 < arg0.method239(-6588) && arg0.method238(var3 + 4, -99) == 64) {
                var3 += 4;
            } else if (arg0.method238(var3, -118) == 126 && var3 + 4 < arg0.method239(-6588) && arg0.method238(var3 + 4, -115) == 126) {
                var3 += 4;
            } else {
                var2 += this.field142[field146[arg0.method238(var3, -115)] + 7];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(Lu;IIIZ)V", line = 194)
    private final void method83(class38 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (this.field143 || arg3 == 0) {
            arg4 = false;
        }
        for (int var6 = 0; var6 < arg0.method239(-6588); var6++) {
            int var7 = field146[arg0.method238(var6, -103)];
            if (arg4) {
                this.method81(var7, arg1 + 1, arg2, 0, this.field142);
                this.method81(var7, arg1, arg2 + 1, 0, this.field142);
            }
            this.method81(var7, arg1, arg2, arg3, this.field142);
            arg1 += this.field142[var7 + 7];
        }
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(Ljava/awt/Font;Ljava/awt/FontMetrics;CIZ)V", line = 276)
    private final void method84(Font arg0, FontMetrics arg1, char arg2, int arg3, boolean arg4) {
        int var6 = arg1.charWidth(arg2);
        int var7 = var6;
        if (arg4) {
            try {
                if (arg2 == '/') {
                    arg4 = false;
                }
                if (arg2 == 'f' || arg2 == 't' || arg2 == 'w' || arg2 == 'v' || arg2 == 'k' || arg2 == 'x' || arg2 == 'y' || arg2 == 'A' || arg2 == 'V' || arg2 == 'W') {
                    var6++;
                }
            } catch (Exception var38) {
            }
        }
        int var9 = arg1.getMaxAscent();
        int var10 = arg1.getMaxAscent() + arg1.getMaxDescent();
        int var11 = arg1.getHeight();
        Image var12 = class31.field381.createImage(var6, var10);
        Graphics var13 = var12.getGraphics();
        var13.setColor(Color.black);
        var13.fillRect(0, 0, var6, var10);
        var13.setColor(Color.white);
        var13.setFont(arg0);
        var13.drawString(arg2 + "", 0, var9);
        if (arg4) {
            var13.drawString(arg2 + "", 1, var9);
        }
        int[] var14 = new int[var6 * var10];
        PixelGrabber var15 = new PixelGrabber(var12, 0, 0, var6, var10, var14, 0, var6);
        try {
            var15.grabPixels();
        } catch (Exception var37) {
        }
        var12.flush();
        Object var17 = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = var6;
        int var21 = var10;
        label135: for (int var22 = 0; var22 < var10; var22++) {
            for (int var23 = 0; var23 < var6; var23++) {
                int var24 = var14[var6 * var22 + var23];
                if ((var24 & 0xFFFFFF) != 0) {
                    var19 = var22;
                    break label135;
                }
            }
        }
        label123: for (int var25 = 0; var25 < var6; var25++) {
            for (int var26 = 0; var26 < var10; var26++) {
                int var27 = var14[var6 * var26 + var25];
                if ((var27 & 0xFFFFFF) != 0) {
                    var18 = var25;
                    break label123;
                }
            }
        }
        label111: for (int var28 = var10 - 1; var28 >= 0; var28--) {
            for (int var29 = 0; var29 < var6; var29++) {
                int var30 = var14[var6 * var28 + var29];
                if ((var30 & 0xFFFFFF) != 0) {
                    var21 = var28 + 1;
                    break label111;
                }
            }
        }
        label99: for (int var31 = var6 - 1; var31 >= 0; var31--) {
            for (int var32 = 0; var32 < var10; var32++) {
                int var33 = var14[var6 * var32 + var31];
                if ((var33 & 0xFFFFFF) != 0) {
                    var20 = var31 + 1;
                    break label99;
                }
            }
        }
        this.field142[arg3 * 9] = (byte) (this.field141 / 16384);
        this.field142[arg3 * 9 + 1] = (byte) (this.field141 / 128 & 0x7F);
        this.field142[arg3 * 9 + 2] = (byte) (this.field141 & 0x7F);
        this.field142[arg3 * 9 + 3] = (byte) (var20 - var18);
        this.field142[arg3 * 9 + 4] = (byte) (var21 - var19);
        this.field142[arg3 * 9 + 5] = (byte) var18;
        this.field142[arg3 * 9 + 6] = (byte) (var9 - var19);
        this.field142[arg3 * 9 + 7] = (byte) var7;
        this.field142[arg3 * 9 + 8] = (byte) var11;
        for (int var34 = var19; var34 < var21; var34++) {
            for (int var35 = var18; var35 < var20; var35++) {
                int var36 = var14[var6 * var34 + var35] & 0xFF;
                if (var36 > 30 && var36 < 230) {
                    this.field143 = true;
                }
                this.field142[this.field141++] = (byte) var36;
            }
        }
    }

    @OriginalMember(owner = "mapview!h", name = "b", descriptor = "(Lu;IIIZ)V", line = 462)
    public final void method85(class38 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = this.method82(arg0) / 2;
        int var7 = this.method76();
        if (arg1 - var6 <= class27.field341 && (arg1 + var6 >= class27.field340 && (arg2 - var7 <= class27.field336 && arg2 >= 0))) {
            this.method83(arg0, arg1 - var6, arg2, arg3, arg4);
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = field144.indexOf(var0);
            if (var1 == -1) {
                var1 = 74;
            }
            field146[var0] = var1 * 9;
        }
    }
}
