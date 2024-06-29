import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class29 {

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "[I")
    private int[] field313 = new int[4];

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "Z")
    private boolean field314 = false;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "[Lo;")
    private class139[] field312;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "[I")
    private int[] field311;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
    private static int field315 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".length();

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "[I")
    private static int[] field317 = new int[256];

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    private int field310;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
    private int field316;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "()I")
    public final int method189() {
        return this.field316 - 1;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lza;Ljava/lang/String;IIIZ)V")
    public final void method190(class497 arg0, String arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = this.method191(arg1) / 2;
        arg0.method1237(this.field313);
        if (arg2 - var7 <= this.field313[2] && arg2 + var7 >= this.field313[0] && arg3 - this.field310 <= this.field313[3] && this.field316 + arg3 >= this.field313[1]) {
            this.method194(arg0, arg1, this.field313, arg2 - var7, arg3, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Ljava/lang/String;)I")
    public final int method191(String arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            int var4 = field317[arg0.charAt(var3)];
            var2 += this.field311[var4];
        }
        return var2;
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "()V")
    public static void method192() {
        field317 = null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lza;Ljava/awt/Font;Ljava/awt/FontMetrics;CIZ)V")
    private final void method193(class497 arg0, Font arg1, FontMetrics arg2, char arg3, int arg4, boolean arg5) {
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
        Image var12 = class320.field4980.createImage(var7, var10);
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
        this.field310 = var9 - var17;
        this.field316 = var11;
        this.field311[arg4] = var8;
        this.field312[arg4] = arg0.method1232(var14, 0, var7, var7, var10);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lza;Ljava/lang/String;[IIIIZ)V")
    private final void method194(class497 arg0, String arg1, int[] arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg5 == 0) {
            arg6 = false;
        }
        int var8 = arg5 | 0xFF000000;
        for (int var9 = 0; var9 < arg1.length(); var9++) {
            int var10 = field317[arg1.charAt(var9)];
            if (arg6) {
                this.field312[var10].method620(arg3 + 1, arg4 + 1, 0, -16777216, 1);
            }
            this.field312[var10].method620(arg3, arg4, 0, var8, 1);
            arg3 += this.field311[var10];
        }
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "()I")
    public final int method195() {
        return this.field310;
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Lza;IZLjava/awt/Component;)V")
    public class29(class497 arg0, int arg1, boolean arg2, Component arg3) {
        this.field314 = false;
        this.field312 = new class139[256];
        this.field311 = new int[256];
        Font var5 = new Font("Helvetica", arg2 ? 1 : 0, arg1);
        FontMetrics var6 = arg3.getFontMetrics(var5);
        for (int var7 = 0; var7 < field315; var7++) {
            this.method193(arg0, var5, var6, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".charAt(var7), var7, false);
        }
        if (arg2 && this.field314) {
            this.field314 = false;
            Font var8 = new Font("Helvetica", 0, arg1);
            FontMetrics var9 = arg3.getFontMetrics(var8);
            for (int var10 = 0; var10 < field315; var10++) {
                this.method193(arg0, var8, var9, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".charAt(var10), var10, false);
            }
            if (!this.field314) {
                this.field314 = false;
                for (int var11 = 0; var11 < field315; var11++) {
                    this.method193(arg0, var8, var9, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".charAt(var11), var11, true);
                }
            }
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".indexOf(var0);
            if (var1 == -1) {
                var1 = 74;
            }
            field317[var0] = var1;
        }
    }
}
