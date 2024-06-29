import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!d")
public class class7 extends class8 {

    @OriginalMember(owner = "mapview!d", name = "E", descriptor = "Z")
    private boolean field106 = false;

    @OriginalMember(owner = "mapview!d", name = "C", descriptor = "I")
    private int field104 = 0;

    @OriginalMember(owner = "mapview!d", name = "D", descriptor = "[B")
    private byte[] field105 = new byte[100000];

    @OriginalMember(owner = "mapview!d", name = "F", descriptor = "[I")
    private static int[] field107 = new int[256];

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "([I[BIIIIIII)V", line = 4)
    private final void method56(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(Ljava/awt/Font;Ljava/awt/FontMetrics;CIZ)V", line = 61)
    private final void method57(Font arg0, FontMetrics arg1, char arg2, int arg3, boolean arg4) {
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
        Image var12 = class25.field340.createImage(var6, var10);
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
        this.field105[arg3 * 9] = (byte) (this.field104 / 16384);
        this.field105[arg3 * 9 + 1] = (byte) (this.field104 / 128 & 0x7F);
        this.field105[arg3 * 9 + 2] = (byte) (this.field104 & 0x7F);
        this.field105[arg3 * 9 + 3] = (byte) (var20 - var18);
        this.field105[arg3 * 9 + 4] = (byte) (var21 - var19);
        this.field105[arg3 * 9 + 5] = (byte) var18;
        this.field105[arg3 * 9 + 6] = (byte) (var9 - var19);
        this.field105[arg3 * 9 + 7] = (byte) var7;
        this.field105[arg3 * 9 + 8] = (byte) var11;
        for (int var34 = var19; var34 < var21; var34++) {
            for (int var35 = var18; var35 < var20; var35++) {
                int var36 = var14[var6 * var34 + var35] & 0xFF;
                if (var36 > 30 && var36 < 230) {
                    this.field106 = true;
                }
                this.field105[this.field104++] = (byte) var36;
            }
        }
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(Lh;IIIZ)V", line = 246)
    private final void method58(class15 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (this.field106 || arg3 == 0) {
            arg4 = false;
        }
        for (int var6 = 0; var6 < arg0.method133((byte) -69); var6++) {
            int var7 = field107[arg0.method129(var6, 10)];
            if (arg4) {
                this.method62(var7, arg1 + 1, arg2, 0, this.field105);
                this.method62(var7, arg1, arg2 + 1, 0, this.field105);
            }
            this.method62(var7, arg1, arg2, arg3, this.field105);
            arg1 += this.field105[var7 + 7];
        }
    }

    @OriginalMember(owner = "mapview!d", name = "b", descriptor = "(Lh;IIIZ)V", line = 270)
    public final void method59(class15 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = this.method63(arg0) / 2;
        int var7 = this.method60();
        if (arg1 - var6 <= class8.field111 && (arg1 + var6 >= class8.field108 && (arg2 - var7 <= class8.field113 && arg2 >= 0))) {
            this.method58(arg0, arg1 - var6, arg2, arg3, arg4);
        }
    }

    @OriginalMember(owner = "mapview!d", name = "c", descriptor = "()I", line = 291)
    public final int method60() {
        return this.field105[6];
    }

    @OriginalMember(owner = "mapview!d", name = "d", descriptor = "()V", line = 294)
    public static void method61() {
        field107 = null;
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(IIII[B)V", line = 298)
    private final void method62(int arg0, int arg1, int arg2, int arg3, byte[] arg4) {
        int var6 = arg4[arg0 + 5] + arg1;
        int var7 = arg2 - arg4[arg0 + 6];
        int var8 = arg4[arg0 + 3];
        int var9 = arg4[arg0 + 4];
        int var10 = arg4[arg0 + 1] * 128 + arg4[arg0] * 16384 + arg4[arg0 + 2];
        int var11 = class8.field109 * var7 + var6;
        int var12 = class8.field109 - var8;
        int var13 = 0;
        if (var7 < class8.field110) {
            int var14 = class8.field110 - var7;
            var9 -= var14;
            var7 = class8.field110;
            var10 += var8 * var14;
            var11 += class8.field109 * var14;
        }
        if (var7 + var9 >= class8.field113) {
            var9 -= var7 + var9 + 1 - class8.field113;
        }
        if (var6 < class8.field108) {
            int var15 = class8.field108 - var6;
            var8 -= var15;
            var6 = class8.field108;
            var10 += var15;
            var11 += var15;
            var13 += var15;
            var12 += var15;
        }
        if (var6 + var8 >= class8.field111) {
            int var16 = var6 + var8 + 1 - class8.field111;
            var8 -= var16;
            var13 += var16;
            var12 += var16;
        }
        if (var8 <= 0 || var9 <= 0) {
            return;
        }
        if (this.field106) {
            this.method64(class8.field114, arg4, arg3, var10, var11, var8, var9, var12, var13);
        } else {
            this.method56(class8.field114, arg4, arg3, var10, var11, var8, var9, var12, var13);
        }
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(Lh;)I", line = 359)
    private final int method63(class15 arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.method133((byte) -104); var3++) {
            if (arg0.method129(var3, 10) == 64 && var3 + 4 < arg0.method133((byte) -38) && arg0.method129(var3 + 4, 10) == 64) {
                var3 += 4;
            } else if (arg0.method129(var3, 10) == 126 && var3 + 4 < arg0.method133((byte) -75) && arg0.method129(var3 + 4, 10) == 126) {
                var3 += 4;
            } else {
                var2 += this.field105[field107[arg0.method129(var3, 10)] + 7];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!d", name = "b", descriptor = "([I[BIIIIIII)V", line = 383)
    private final void method64(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "mapview!d", name = "<init>", descriptor = "(IZLjava/awt/Component;)V", line = 445)
    public class7(int arg0, boolean arg1, Component arg2) {
        this.field104 = 855;
        this.field106 = false;
        Font var4 = new Font("Helvetica", arg1 ? 1 : 0, arg0);
        FontMetrics var5 = arg2.getFontMetrics(var4);
        for (int var6 = 0; var6 < 95; var6++) {
            this.method57(var4, var5, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var6), var6, false);
        }
        if (arg1 && this.field106) {
            this.field104 = 855;
            this.field106 = false;
            Font var7 = new Font("Helvetica", 0, arg0);
            FontMetrics var8 = arg2.getFontMetrics(var7);
            for (int var9 = 0; var9 < 95; var9++) {
                this.method57(var7, var8, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var9), var9, false);
            }
            if (!this.field106) {
                this.field104 = 855;
                this.field106 = false;
                for (int var10 = 0; var10 < 95; var10++) {
                    this.method57(var7, var8, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var10), var10, true);
                }
            }
        }
        byte[] var11 = new byte[this.field104];
        for (int var12 = 0; var12 < this.field104; var12++) {
            var11[var12] = this.field105[var12];
        }
        this.field105 = var11;
    }

    @OriginalMember(owner = "mapview!d", name = "e", descriptor = "()I", line = 421)
    public final int method65() {
        return this.field105[8] - 1;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var0);
            if (var1 == -1) {
                var1 = 74;
            }
            field107[var0] = var1 * 9;
        }
    }
}
