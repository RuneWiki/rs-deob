import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class351 {

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "[I")
    private int[] field5383 = new int[4];

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "Z")
    private boolean field5382 = false;

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "[Lf;")
    private class529[] field5381;

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "[I")
    private int[] field5384;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "I")
    private static int field5380 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".length();

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "[I")
    private static int[] field5387 = new int[256];

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "I")
    private int field5385;

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "I")
    private int field5386;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".indexOf(var0);
            if (var1 == -1) {
                var1 = 74;
            }
            field5387[var0] = var1;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lqa;Ljava/lang/String;[IIIIZ)V", line = 5)
    private final void method2231(class162 arg0, String arg1, int[] arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg5 == 0) {
            arg6 = false;
        }
        int var8 = arg5 | 0xFF000000;
        for (int var9 = 0; var9 < arg1.length(); var9++) {
            int var10 = field5387[arg1.charAt(var9)];
            if (arg6) {
                this.field5381[var10].method102(arg3 + 1, arg4 + 1, 0, -16777216, 1);
            }
            this.field5381[var10].method102(arg3, arg4, 0, var8, 1);
            arg3 += this.field5384[var10];
        }
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Lqa;IZLjava/awt/Component;)V", line = 173)
    public class351(class162 arg0, int arg1, boolean arg2, Component arg3) {
        this.field5382 = false;
        this.field5381 = new class529[256];
        this.field5384 = new int[256];
        Font var5 = new Font("Helvetica", arg2 ? 1 : 0, arg1);
        FontMetrics var6 = arg3.getFontMetrics(var5);
        for (int var7 = 0; var7 < field5380; var7++) {
            this.method2233(arg0, var5, var6, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".charAt(var7), var7, false);
        }
        if (arg2 && this.field5382) {
            this.field5382 = false;
            Font var8 = new Font("Helvetica", 0, arg1);
            FontMetrics var9 = arg3.getFontMetrics(var8);
            for (int var10 = 0; var10 < field5380; var10++) {
                this.method2233(arg0, var8, var9, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".charAt(var10), var10, false);
            }
            if (!this.field5382) {
                this.field5382 = false;
                for (int var11 = 0; var11 < field5380; var11++) {
                    this.method2233(arg0, var8, var9, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".charAt(var11), var11, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "()I", line = 34)
    public final int method2232() {
        return this.field5385;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lqa;Ljava/awt/Font;Ljava/awt/FontMetrics;CIZ)V", line = 39)
    private final void method2233(class162 arg0, Font arg1, FontMetrics arg2, char arg3, int arg4, boolean arg5) {
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
        Image var12 = class370.field5611.createImage(var7, var10);
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
        this.field5385 = var9 - var17;
        this.field5386 = var11;
        this.field5384[arg4] = var8;
        this.field5381[arg4] = arg0.method306(var14, 0, var7, var7, var10);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Ljava/lang/String;)I", line = 128)
    public final int method2234(String arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            int var4 = field5387[arg0.charAt(var3)];
            var2 += this.field5384[var4];
        }
        return var2;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lqa;Ljava/lang/String;IIIZ)V", line = 146)
    public final void method2235(class162 arg0, String arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = this.method2234(arg1) / 2;
        arg0.method251(this.field5383);
        if (arg2 - var7 <= this.field5383[2] && arg2 + var7 >= this.field5383[0] && arg3 - this.field5385 <= this.field5383[3] && this.field5386 + arg3 >= this.field5383[1]) {
            this.method2231(arg0, arg1, this.field5383, arg2 - var7, arg3, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "()I", line = 163)
    public final int method2236() {
        return this.field5386 - 1;
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "()V", line = 167)
    public static void method2237() {
        field5387 = null;
    }
}
