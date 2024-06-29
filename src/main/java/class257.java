import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class257 {

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "I")
    private int field4006 = 0;

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "Z")
    private boolean field4007 = false;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "[B")
    private byte[] field4005 = new byte[100000];

    @OriginalMember(owner = "client!gn", name = "d", descriptor = "I")
    private static int field4008 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæ".length();

    @OriginalMember(owner = "client!gn", name = "e", descriptor = "[I")
    private static int[] field4009 = new int[256];

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Ljava/lang/String;IIIZ)V", line = 4)
    public final void method1716(String arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = this.method1721(arg0) / 2;
        int var7 = this.method1718();
        if (arg1 - var6 <= class270.field4166 && arg1 + var6 >= class270.field4171 && arg2 - var7 <= class270.field4168 && arg2 >= 0) {
            this.method1722(arg0, arg1 - var6, arg2, arg3, arg4);
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "()V", line = 22)
    public static void method1717() {
        field4009 = null;
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "()I", line = 25)
    public final int method1718() {
        return this.field4005[6];
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "([I[BIIIIIII)V", line = 29)
    private final void method1719(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "()I", line = 86)
    public final int method1720() {
        return this.field4005[8] - 1;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Ljava/lang/String;)I", line = 90)
    private final int method1721(String arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            if (arg0.charAt(var3) == '@' && var3 + 4 < arg0.length() && arg0.charAt(var3 + 4) == '@') {
                var3 += 4;
            } else if (arg0.charAt(var3) == '~' && var3 + 4 < arg0.length() && arg0.charAt(var3 + 4) == '~') {
                var3 += 4;
            } else {
                var2 += this.field4005[field4009[arg0.charAt(var3)] + 7];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(Ljava/lang/String;IIIZ)V", line = 111)
    private final void method1722(String arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (this.field4007 || arg3 == 0) {
            arg4 = false;
        }
        for (int var6 = 0; var6 < arg0.length(); var6++) {
            int var7 = field4009[arg0.charAt(var6)];
            if (arg4) {
                this.method1725(var7, arg1 + 1, arg2, 1, this.field4005);
                this.method1725(var7, arg1, arg2 + 1, 1, this.field4005);
            }
            this.method1725(var7, arg1, arg2, arg3, this.field4005);
            arg1 += this.field4005[var7 + 7];
        }
    }

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(IZLjava/awt/Component;)V", line = 449)
    public class257(int arg0, boolean arg1, Component arg2) {
        this.field4006 = field4008 * 9;
        this.field4007 = false;
        Font var4 = new Font("Helvetica", arg1 ? 1 : 0, arg0);
        FontMetrics var5 = arg2.getFontMetrics(var4);
        for (int var6 = 0; var6 < field4008; var6++) {
            this.method1723(var4, var5, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæ".charAt(var6), var6, false);
        }
        if (arg1 && this.field4007) {
            this.field4006 = field4008 * 9;
            this.field4007 = false;
            Font var7 = new Font("Helvetica", 0, arg0);
            FontMetrics var8 = arg2.getFontMetrics(var7);
            for (int var9 = 0; var9 < field4008; var9++) {
                this.method1723(var7, var8, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæ".charAt(var9), var9, false);
            }
            if (!this.field4007) {
                this.field4006 = field4008 * 9;
                this.field4007 = false;
                for (int var10 = 0; var10 < field4008; var10++) {
                    this.method1723(var7, var8, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæ".charAt(var10), var10, true);
                }
            }
        }
        byte[] var11 = new byte[this.field4006];
        for (int var12 = 0; var12 < this.field4006; var12++) {
            var11[var12] = this.field4005[var12];
        }
        this.field4005 = var11;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Ljava/awt/Font;Ljava/awt/FontMetrics;CIZ)V", line = 139)
    private final void method1723(Font arg0, FontMetrics arg1, char arg2, int arg3, boolean arg4) {
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
        Image var12 = class216.field3456.createImage(var6, var10);
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
        this.field4005[arg3 * 9] = (byte) (this.field4006 / 16384);
        this.field4005[arg3 * 9 + 1] = (byte) (this.field4006 / 128 & 0x7F);
        this.field4005[arg3 * 9 + 2] = (byte) (this.field4006 & 0x7F);
        this.field4005[arg3 * 9 + 3] = (byte) (var20 - var18);
        this.field4005[arg3 * 9 + 4] = (byte) (var21 - var19);
        this.field4005[arg3 * 9 + 5] = (byte) var18;
        this.field4005[arg3 * 9 + 6] = (byte) (var9 - var19);
        this.field4005[arg3 * 9 + 7] = (byte) var7;
        this.field4005[arg3 * 9 + 8] = (byte) var11;
        for (int var34 = var19; var34 < var21; var34++) {
            for (int var35 = var18; var35 < var20; var35++) {
                int var36 = var14[var6 * var34 + var35] & 0xFF;
                if (var36 > 30 && var36 < 230) {
                    this.field4007 = true;
                }
                this.field4005[this.field4006++] = (byte) var36;
            }
        }
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "([I[BIIIIIII)V", line = 326)
    private final void method1724(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIII[B)V", line = 362)
    private final void method1725(int arg0, int arg1, int arg2, int arg3, byte[] arg4) {
        int var6 = arg4[arg0 + 5] + arg1;
        int var7 = arg2 - arg4[arg0 + 6];
        int var8 = arg4[arg0 + 3];
        int var9 = arg4[arg0 + 4];
        int var10 = arg4[arg0 + 1] * 128 + arg4[arg0] * 16384 + arg4[arg0 + 2];
        int var11 = class270.field4172 * var7 + var6;
        int var12 = class270.field4172 - var8;
        int var13 = 0;
        if (var7 < class270.field4165) {
            int var14 = class270.field4165 - var7;
            var9 -= var14;
            var7 = class270.field4165;
            var10 += var8 * var14;
            var11 += class270.field4172 * var14;
        }
        if (var7 + var9 >= class270.field4168) {
            var9 -= var7 + var9 + 1 - class270.field4168;
        }
        if (var6 < class270.field4171) {
            int var15 = class270.field4171 - var6;
            var8 -= var15;
            var6 = class270.field4171;
            var10 += var15;
            var11 += var15;
            var13 += var15;
            var12 += var15;
        }
        if (var6 + var8 >= class270.field4166) {
            int var16 = var6 + var8 + 1 - class270.field4166;
            var8 -= var16;
            var13 += var16;
            var12 += var16;
        }
        if (var8 <= 0 || var9 <= 0) {
            return;
        }
        if (this.field4007) {
            this.method1724(class270.field4170, arg4, arg3, var10, var11, var8, var9, var12, var13);
        } else {
            this.method1719(class270.field4170, arg4, arg3, var10, var11, var8, var9, var12, var13);
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæ".indexOf(var0);
            if (var1 == -1) {
                var1 = 74;
            }
            field4009[var0] = var1 * 9;
        }
    }
}
