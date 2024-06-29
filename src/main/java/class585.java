import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class585 {

    @OriginalMember(owner = "client!po", name = "d", descriptor = "[I")
    private int[] field8274 = new int[4];

    @OriginalMember(owner = "client!po", name = "f", descriptor = "Z")
    private boolean field8276 = false;

    @OriginalMember(owner = "client!po", name = "c", descriptor = "[Lnf;")
    private class604[] field8273;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "[I")
    private int[] field8271;

    @OriginalMember(owner = "client!po", name = "g", descriptor = "I")
    private static int field8277 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".length();

    @OriginalMember(owner = "client!po", name = "h", descriptor = "[I")
    private static int[] field8278 = new int[256];

    @OriginalMember(owner = "client!po", name = "b", descriptor = "I")
    private int field8272;

    @OriginalMember(owner = "client!po", name = "e", descriptor = "I")
    private int field8275;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".indexOf(var0);
            if (var1 == -1) {
                var1 = 74;
            }
            field8278[var0] = var1;
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Lha;Ljava/awt/Font;Ljava/awt/FontMetrics;CIZ)V", line = 4)
    private final void method3361(class66 arg0, Font arg1, FontMetrics arg2, char arg3, int arg4, boolean arg5) {
        int var7 = arg2.charWidth(arg3);
        int var8 = var7;
        if (arg5) {
            try {
                if (arg3 == '/') {
                    arg5 = false;
                }
                if (arg3 == 'f' || arg3 == 't' || arg3 == 'w' || arg3 == 'v' || arg3 == 'k' || arg3 == 'x' || arg3 == 'y' || arg3 == 'A' || arg3 == 'V' || arg3 == 'W') {
                    var7++;
                }
            } catch (Exception var23) {
            }
        }
        int var9 = arg2.getMaxAscent();
        int var10 = arg2.getMaxAscent() + arg2.getMaxDescent();
        int var11 = arg2.getHeight();
        Image var12 = class558.field7896.createImage(var7, var10);
        Graphics var13 = var12.getGraphics();
        var13.setColor(Color.black);
        var13.fillRect(0, 0, var7, var10);
        var13.setColor(Color.white);
        var13.setFont(arg1);
        var13.drawString(String.valueOf(arg3), 0, var9);
        if (arg5) {
            var13.drawString(String.valueOf(arg3), 1, var9);
        }
        int[] var14 = new int[var7 * var10];
        PixelGrabber var15 = new PixelGrabber(var12, 0, 0, var7, var10, var14, 0, var7);
        try {
            var15.grabPixels();
        } catch (Exception var22) {
        }
        var12.flush();
        Object var16 = null;
        int var17 = 0;
        label66: for (int var18 = 0; var18 < var10; var18++) {
            for (int var19 = 0; var19 < var7; var19++) {
                int var20 = var14[var7 * var18 + var19];
                if ((var20 & 0xFFFFFF) != 0) {
                    var17 = var18;
                    break label66;
                }
            }
        }
        for (int var21 = 0; var21 < var14.length; var21++) {
            if ((var14[var21] & 0xFFFFFF) == 0) {
                var14[var21] = 0;
            }
        }
        this.field8272 = var9 - var17;
        this.field8275 = var11;
        this.field8271[arg4] = var8;
        this.field8273[arg4] = arg0.method495(0, var7, var14, var10, var7, true);
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "()I", line = 93)
    public final int method3362() {
        return this.field8272;
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "()V", line = 98)
    public static void method3363() {
        field8278 = null;
    }

    @OriginalMember(owner = "client!po", name = "c", descriptor = "()I", line = 102)
    public final int method3364() {
        return this.field8275 - 1;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Lha;Ljava/lang/String;IIIZ)V", line = 106)
    public final void method3365(class66 arg0, String arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = this.method3366(arg1) / 2;
        arg0.method580(this.field8274);
        if (arg2 - var7 <= this.field8274[2] && arg2 + var7 >= this.field8274[0] && arg3 - this.field8272 <= this.field8274[3] && this.field8275 + arg3 >= this.field8274[1]) {
            this.method3367(arg0, arg1, this.field8274, arg2 - var7, arg3, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Ljava/lang/String;)I", line = 125)
    public final int method3366(String arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            int var4 = field8278[arg0.charAt(var3)];
            var2 += this.field8271[var4];
        }
        return var2;
    }

    @OriginalMember(owner = "client!po", name = "<init>", descriptor = "(Lha;IZLjava/awt/Component;)V", line = 192)
    public class585(class66 arg0, int arg1, boolean arg2, Component arg3) {
        this.field8276 = false;
        this.field8273 = new class604[256];
        this.field8271 = new int[256];
        Font var5 = new Font("Helvetica", arg2 ? 1 : 0, arg1);
        FontMetrics var6 = arg3.getFontMetrics(var5);
        for (int var7 = 0; var7 < field8277; var7++) {
            this.method3361(arg0, var5, var6, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".charAt(var7), var7, false);
        }
        if (arg2 && this.field8276) {
            this.field8276 = false;
            Font var8 = new Font("Helvetica", 0, arg1);
            FontMetrics var9 = arg3.getFontMetrics(var8);
            for (int var10 = 0; var10 < field8277; var10++) {
                this.method3361(arg0, var8, var9, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".charAt(var10), var10, false);
            }
            if (!this.field8276) {
                this.field8276 = false;
                for (int var11 = 0; var11 < field8277; var11++) {
                    this.method3361(arg0, var8, var9, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".charAt(var11), var11, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Lha;Ljava/lang/String;[IIIIZ)V", line = 145)
    private final void method3367(class66 arg0, String arg1, int[] arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg5 == 0) {
            arg6 = false;
        }
        int var8 = arg5 | 0xFF000000;
        for (int var9 = 0; var9 < arg1.length(); var9++) {
            int var10 = field8278[arg1.charAt(var9)];
            if (arg6) {
                this.field8273[var10].method215(arg3 + 1, arg4 + 1, 0, -16777216, 1);
            }
            this.field8273[var10].method215(arg3, arg4, 0, var8, 1);
            arg3 += this.field8271[var10];
        }
    }
}
