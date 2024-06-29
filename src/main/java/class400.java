import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class400 {

    @OriginalMember(owner = "client!t", name = "d", descriptor = "Z")
    private boolean field5620 = false;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "[I")
    private int[] field5618 = new int[4];

    @OriginalMember(owner = "client!t", name = "e", descriptor = "[Lvj;")
    private class256[] field5621;

    @OriginalMember(owner = "client!t", name = "f", descriptor = "[I")
    private int[] field5622;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "I")
    private static int field5617 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".length();

    @OriginalMember(owner = "client!t", name = "h", descriptor = "[I")
    private static int[] field5624 = new int[256];

    @OriginalMember(owner = "client!t", name = "c", descriptor = "I")
    private int field5619;

    @OriginalMember(owner = "client!t", name = "g", descriptor = "I")
    private int field5623;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lvq;Ljava/awt/Font;Ljava/awt/FontMetrics;CIZ)V")
    private final void method2505(class269 arg0, Font arg1, FontMetrics arg2, char arg3, int arg4, boolean arg5) {
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
        Image var12 = class117.field1588.createImage(var7, var10);
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
        this.field5619 = var9 - var17;
        this.field5623 = var11;
        this.field5622[arg4] = var8;
        this.field5621[arg4] = arg0.method876(var14, 0, var7, var7, var10);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "()I")
    public final int method2506() {
        return this.field5623 - 1;
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "()V")
    public static void method2507() {
        field5624 = null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Ljava/lang/String;)I")
    public final int method2508(String arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            int var4 = field5624[arg0.charAt(var3)];
            var2 += this.field5622[var4];
        }
        return var2;
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "()I")
    public final int method2509() {
        return this.field5619;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lvq;Ljava/lang/String;IIIZ)V")
    public final void method2510(class269 arg0, String arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = this.method2508(arg1) / 2;
        arg0.method904(this.field5618);
        if (arg2 - var7 <= this.field5618[2] && arg2 + var7 >= this.field5618[0] && arg3 - this.field5619 <= this.field5618[3] && this.field5623 + arg3 >= this.field5618[1]) {
            this.method2511(arg0, arg1, this.field5618, arg2 - var7, arg3, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lvq;Ljava/lang/String;[IIIIZ)V")
    private final void method2511(class269 arg0, String arg1, int[] arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg5 == 0) {
            arg6 = false;
        }
        int var8 = arg5 | 0xFF000000;
        for (int var9 = 0; var9 < arg1.length(); var9++) {
            int var10 = field5624[arg1.charAt(var9)];
            if (arg6) {
                this.field5621[var10].method86(arg3 + 1, arg4 + 1, 1, -16777216, 1);
            }
            this.field5621[var10].method86(arg3, arg4, 1, var8, 1);
            arg3 += this.field5622[var10];
        }
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Lvq;IZLjava/awt/Component;)V")
    public class400(class269 arg0, int arg1, boolean arg2, Component arg3) {
        this.field5620 = false;
        this.field5621 = new class256[256];
        this.field5622 = new int[256];
        Font var5 = new Font("Helvetica", arg2 ? 1 : 0, arg1);
        FontMetrics var6 = arg3.getFontMetrics(var5);
        for (int var7 = 0; var7 < field5617; var7++) {
            this.method2505(arg0, var5, var6, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".charAt(var7), var7, false);
        }
        if (arg2 && this.field5620) {
            this.field5620 = false;
            Font var8 = new Font("Helvetica", 0, arg1);
            FontMetrics var9 = arg3.getFontMetrics(var8);
            for (int var10 = 0; var10 < field5617; var10++) {
                this.method2505(arg0, var8, var9, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".charAt(var10), var10, false);
            }
            if (!this.field5620) {
                this.field5620 = false;
                for (int var11 = 0; var11 < field5617; var11++) {
                    this.method2505(arg0, var8, var9, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".charAt(var11), var11, true);
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
            field5624[var0] = var1;
        }
    }
}
