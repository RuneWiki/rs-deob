import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class434 {

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "[I")
    private int[] field5715 = new int[4];

    @OriginalMember(owner = "client!qq", name = "e", descriptor = "Z")
    private boolean field5717 = false;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "[Lxa;")
    private class458[] field5713;

    @OriginalMember(owner = "client!qq", name = "d", descriptor = "[I")
    private int[] field5716;

    @OriginalMember(owner = "client!qq", name = "g", descriptor = "I")
    private static int field5719 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".length();

    @OriginalMember(owner = "client!qq", name = "h", descriptor = "[I")
    private static int[] field5720 = new int[256];

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "I")
    private int field5714;

    @OriginalMember(owner = "client!qq", name = "f", descriptor = "I")
    private int field5718;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "()I")
    public final int method2314() {
        return this.field5714 - 1;
    }

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "()I")
    public final int method2315() {
        return this.field5718;
    }

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "()V")
    public static void method2316() {
        field5720 = null;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Loa;Ljava/lang/String;[IIIIZ)V")
    private final void method2317(class635 arg0, String arg1, int[] arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg5 == 0) {
            arg6 = false;
        }
        int var8 = arg5 | 0xFF000000;
        for (int var9 = 0; var9 < arg1.length(); var9++) {
            int var10 = field5720[arg1.charAt(var9)];
            if (arg6) {
                this.field5713[var10].method416(arg3 + 1, arg4 + 1, 0, -16777216, 1);
            }
            this.field5713[var10].method416(arg3, arg4, 0, var8, 1);
            arg3 += this.field5716[var10];
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Ljava/lang/String;)I")
    public final int method2318(String arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            int var4 = field5720[arg0.charAt(var3)];
            var2 += this.field5716[var4];
        }
        return var2;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Loa;Ljava/lang/String;IIIZ)V")
    public final void method2319(class635 arg0, String arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = this.method2318(arg1) / 2;
        arg0.method274(this.field5715);
        if (arg2 - var7 <= this.field5715[2] && arg2 + var7 >= this.field5715[0] && arg3 - this.field5718 <= this.field5715[3] && this.field5714 + arg3 >= this.field5715[1]) {
            this.method2317(arg0, arg1, this.field5715, arg2 - var7, arg3, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Loa;Ljava/awt/Font;Ljava/awt/FontMetrics;CIZ)V")
    private final void method2320(class635 arg0, Font arg1, FontMetrics arg2, char arg3, int arg4, boolean arg5) {
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
        Image var12 = class220.field2664.createImage(var7, var10);
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
        this.field5718 = var9 - var17;
        this.field5714 = var11;
        this.field5716[arg4] = var8;
        this.field5713[arg4] = arg0.method326(var14, 0, var7, var7, var10);
    }

    @OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Loa;IZLjava/awt/Component;)V")
    public class434(class635 arg0, int arg1, boolean arg2, Component arg3) {
        this.field5717 = false;
        this.field5713 = new class458[256];
        this.field5716 = new int[256];
        Font var5 = new Font("Helvetica", arg2 ? 1 : 0, arg1);
        FontMetrics var6 = arg3.getFontMetrics(var5);
        for (int var7 = 0; var7 < field5719; var7++) {
            this.method2320(arg0, var5, var6, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".charAt(var7), var7, false);
        }
        if (arg2 && this.field5717) {
            this.field5717 = false;
            Font var8 = new Font("Helvetica", 0, arg1);
            FontMetrics var9 = arg3.getFontMetrics(var8);
            for (int var10 = 0; var10 < field5719; var10++) {
                this.method2320(arg0, var8, var9, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".charAt(var10), var10, false);
            }
            if (!this.field5717) {
                this.field5717 = false;
                for (int var11 = 0; var11 < field5719; var11++) {
                    this.method2320(arg0, var8, var9, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".charAt(var11), var11, true);
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
            field5720[var0] = var1;
        }
    }
}
