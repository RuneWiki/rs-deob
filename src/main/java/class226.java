import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class226 {

    @OriginalMember(owner = "client!ir", name = "c", descriptor = "Z")
    private boolean field3252 = false;

    @OriginalMember(owner = "client!ir", name = "d", descriptor = "[I")
    private int[] field3253 = new int[4];

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "[Lrn;")
    private class417[] field3251;

    @OriginalMember(owner = "client!ir", name = "g", descriptor = "[I")
    private int[] field3256;

    @OriginalMember(owner = "client!ir", name = "e", descriptor = "I")
    private static int field3254 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".length();

    @OriginalMember(owner = "client!ir", name = "h", descriptor = "[I")
    private static int[] field3257 = new int[256];

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "I")
    private int field3250;

    @OriginalMember(owner = "client!ir", name = "f", descriptor = "I")
    private int field3255;

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lvc;Ljava/awt/Font;Ljava/awt/FontMetrics;CIZ)V")
    private final void method1537(class89 arg0, Font arg1, FontMetrics arg2, char arg3, int arg4, boolean arg5) {
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
        Image var12 = class33.field338.createImage(var7, var10);
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
        this.field3250 = var9 - var17;
        this.field3255 = var11;
        this.field3256[arg4] = var8;
        this.field3251[arg4] = arg0.method342(var14, 0, var7, var7, var10);
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Ljava/lang/String;)I")
    public final int method1538(String arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            int var4 = field3257[arg0.charAt(var3)];
            var2 += this.field3256[var4];
        }
        return var2;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "()I")
    public final int method1539() {
        return this.field3255 - 1;
    }

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "()I")
    public final int method1540() {
        return this.field3250;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lvc;Ljava/lang/String;IIIZ)V")
    public final void method1541(class89 arg0, String arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = this.method1538(arg1) / 2;
        arg0.method409(this.field3253);
        if (arg2 - var7 <= this.field3253[2] && arg2 + var7 >= this.field3253[0] && arg3 - this.field3250 <= this.field3253[3] && this.field3255 + arg3 >= this.field3253[1]) {
            this.method1543(arg0, arg1, this.field3253, arg2 - var7, arg3, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!ir", name = "c", descriptor = "()V")
    public static void method1542() {
        field3257 = null;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lvc;Ljava/lang/String;[IIIIZ)V")
    private final void method1543(class89 arg0, String arg1, int[] arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg5 == 0) {
            arg6 = false;
        }
        int var8 = arg5 | 0xFF000000;
        for (int var9 = 0; var9 < arg1.length(); var9++) {
            int var10 = field3257[arg1.charAt(var9)];
            if (arg6) {
                this.field3251[var10].method722(arg3 + 1, arg4 + 1, 1, -16777216, 1);
            }
            this.field3251[var10].method722(arg3, arg4, 1, var8, 1);
            arg3 += this.field3256[var10];
        }
    }

    @OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(Lvc;IZLjava/awt/Component;)V")
    public class226(class89 arg0, int arg1, boolean arg2, Component arg3) {
        this.field3252 = false;
        this.field3251 = new class417[256];
        this.field3256 = new int[256];
        Font var5 = new Font("Helvetica", arg2 ? 1 : 0, arg1);
        FontMetrics var6 = arg3.getFontMetrics(var5);
        for (int var7 = 0; var7 < field3254; var7++) {
            this.method1537(arg0, var5, var6, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".charAt(var7), var7, false);
        }
        if (arg2 && this.field3252) {
            this.field3252 = false;
            Font var8 = new Font("Helvetica", 0, arg1);
            FontMetrics var9 = arg3.getFontMetrics(var8);
            for (int var10 = 0; var10 < field3254; var10++) {
                this.method1537(arg0, var8, var9, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".charAt(var10), var10, false);
            }
            if (!this.field3252) {
                this.field3252 = false;
                for (int var11 = 0; var11 < field3254; var11++) {
                    this.method1537(arg0, var8, var9, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".charAt(var11), var11, true);
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
            field3257[var0] = var1;
        }
    }
}
