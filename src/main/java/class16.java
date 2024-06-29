import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!i")
public class class16 extends class22 {

    @OriginalMember(owner = "mapview!i", name = "r", descriptor = "Z")
    private boolean field170 = false;

    @OriginalMember(owner = "mapview!i", name = "t", descriptor = "I")
    private int field172 = 0;

    @OriginalMember(owner = "mapview!i", name = "u", descriptor = "[B")
    private byte[] field173 = new byte[100000];

    @OriginalMember(owner = "mapview!i", name = "s", descriptor = "Ljava/lang/String;")
    private static String field171 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| " + String.valueOf('Ä') + 'Ë' + 'Ï' + 'Ö' + 'Ü' + 'ä' + 'ë' + 'ï' + 'ö' + 'ü' + 'ÿ' + 'ß';

    @OriginalMember(owner = "mapview!i", name = "v", descriptor = "I")
    private static int field174 = field171.length();

    @OriginalMember(owner = "mapview!i", name = "w", descriptor = "[I")
    private static int[] field175 = new int[256];

    @OriginalMember(owner = "mapview!i", name = "c", descriptor = "()I", line = 3)
    public final int method66() {
        return this.field173[8] - 1;
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(Lta;IIIZ)V", line = 7)
    private final void method67(class37 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (this.field170 || arg3 == 0) {
            arg4 = false;
        }
        for (int var6 = 0; var6 < arg0.method241((byte) 92); var6++) {
            int var7 = field175[arg0.method229((byte) 109, var6)];
            if (arg4) {
                this.method72(var7, arg1 + 1, arg2, 0, this.field173);
                this.method72(var7, arg1, arg2 + 1, 0, this.field173);
            }
            this.method72(var7, arg1, arg2, arg3, this.field173);
            arg1 += this.field173[var7 + 7];
        }
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(Lta;)I", line = 31)
    private final int method68(class37 arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.method241((byte) 92); var3++) {
            if (arg0.method229((byte) 109, var3) == 64 && var3 + 4 < arg0.method241((byte) 92) && arg0.method229((byte) 68, var3 + 4) == 64) {
                var3 += 4;
            } else if (arg0.method229((byte) 111, var3) == 126 && var3 + 4 < arg0.method241((byte) 92) && arg0.method229((byte) 79, var3 + 4) == 126) {
                var3 += 4;
            } else {
                var2 += this.field173[field175[arg0.method229((byte) 108, var3)] + 7];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!i", name = "b", descriptor = "(Lta;IIIZ)V", line = 53)
    public final void method69(class37 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = this.method68(arg0) / 2;
        int var7 = this.method73();
        if (arg1 - var6 <= class22.field251 && (arg1 + var6 >= class22.field248 && (arg2 - var7 <= class22.field245 && arg2 >= 0))) {
            this.method67(arg0, arg1 - var6, arg2, arg3, arg4);
        }
    }

    @OriginalMember(owner = "mapview!i", name = "d", descriptor = "()V", line = 71)
    public static void method70() {
        field171 = null;
        field175 = null;
    }

    @OriginalMember(owner = "mapview!i", name = "<init>", descriptor = "(IZLjava/awt/Component;)V", line = 430)
    public class16(int arg0, boolean arg1, Component arg2) {
        this.field172 = field174 * 9;
        this.field170 = false;
        Font var4 = new Font("Helvetica", arg1 ? 1 : 0, arg0);
        FontMetrics var5 = arg2.getFontMetrics(var4);
        for (int var6 = 0; var6 < field174; var6++) {
            this.method74(var4, var5, field171.charAt(var6), var6, false);
        }
        if (arg1 && this.field170) {
            this.field172 = field174 * 9;
            this.field170 = false;
            Font var7 = new Font("Helvetica", 0, arg0);
            FontMetrics var8 = arg2.getFontMetrics(var7);
            for (int var9 = 0; var9 < field174; var9++) {
                this.method74(var7, var8, field171.charAt(var9), var9, false);
            }
            if (!this.field170) {
                this.field172 = field174 * 9;
                this.field170 = false;
                for (int var10 = 0; var10 < field174; var10++) {
                    this.method74(var7, var8, field171.charAt(var10), var10, true);
                }
            }
        }
        byte[] var11 = new byte[this.field172];
        for (int var12 = 0; var12 < this.field172; var12++) {
            var11[var12] = this.field173[var12];
        }
        this.field173 = var11;
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "([I[BIIIIIII)V", line = 80)
    private final void method71(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = field171.indexOf(var0);
            if (var1 == -1) {
                var1 = 74;
            }
            field175[var0] = var1 * 9;
        }
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(IIII[B)V", line = 139)
    private final void method72(int arg0, int arg1, int arg2, int arg3, byte[] arg4) {
        int var6 = arg4[arg0 + 5] + arg1;
        int var7 = arg2 - arg4[arg0 + 6];
        int var8 = arg4[arg0 + 3];
        int var9 = arg4[arg0 + 4];
        int var10 = arg4[arg0 + 1] * 128 + arg4[arg0] * 16384 + arg4[arg0 + 2];
        int var11 = class22.field246 * var7 + var6;
        int var12 = class22.field246 - var8;
        int var13 = 0;
        if (var7 < class22.field247) {
            int var14 = class22.field247 - var7;
            var9 -= var14;
            var7 = class22.field247;
            var10 += var8 * var14;
            var11 += class22.field246 * var14;
        }
        if (var7 + var9 >= class22.field245) {
            var9 -= var7 + var9 + 1 - class22.field245;
        }
        if (var6 < class22.field248) {
            int var15 = class22.field248 - var6;
            var8 -= var15;
            var6 = class22.field248;
            var10 += var15;
            var11 += var15;
            var13 += var15;
            var12 += var15;
        }
        if (var6 + var8 >= class22.field251) {
            int var16 = var6 + var8 + 1 - class22.field251;
            var8 -= var16;
            var13 += var16;
            var12 += var16;
        }
        if (var8 <= 0 || var9 <= 0) {
            return;
        }
        if (this.field170) {
            this.method75(class22.field249, arg4, arg3, var10, var11, var8, var9, var12, var13);
        } else {
            this.method71(class22.field249, arg4, arg3, var10, var11, var8, var9, var12, var13);
        }
    }

    @OriginalMember(owner = "mapview!i", name = "e", descriptor = "()I", line = 204)
    public final int method73() {
        return this.field173[6];
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(Ljava/awt/Font;Ljava/awt/FontMetrics;CIZ)V", line = 208)
    private final void method74(Font arg0, FontMetrics arg1, char arg2, int arg3, boolean arg4) {
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
        Image var12 = mapview.field320.createImage(var6, var10);
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
        this.field173[arg3 * 9] = (byte) (this.field172 / 16384);
        this.field173[arg3 * 9 + 1] = (byte) (this.field172 / 128 & 0x7F);
        this.field173[arg3 * 9 + 2] = (byte) (this.field172 & 0x7F);
        this.field173[arg3 * 9 + 3] = (byte) (var20 - var18);
        this.field173[arg3 * 9 + 4] = (byte) (var21 - var19);
        this.field173[arg3 * 9 + 5] = (byte) var18;
        this.field173[arg3 * 9 + 6] = (byte) (var9 - var19);
        this.field173[arg3 * 9 + 7] = (byte) var7;
        this.field173[arg3 * 9 + 8] = (byte) var11;
        for (int var34 = var19; var34 < var21; var34++) {
            for (int var35 = var18; var35 < var20; var35++) {
                int var36 = var14[var6 * var34 + var35] & 0xFF;
                if (var36 > 30 && var36 < 230) {
                    this.field170 = true;
                }
                this.field173[this.field172++] = (byte) var36;
            }
        }
    }

    @OriginalMember(owner = "mapview!i", name = "b", descriptor = "([I[BIIIIIII)V", line = 396)
    private final void method75(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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
}
