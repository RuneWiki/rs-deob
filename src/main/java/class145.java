import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class145 {

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "Z")
    private boolean field1926 = false;

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "[I")
    private int[] field1929 = new int[4];

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "[Lo;")
    private class24[] field1927;

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "[I")
    private int[] field1928;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
    private static int field1923 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".length();

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "[I")
    private static int[] field1930 = new int[256];

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
    private int field1924;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
    private int field1925;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".indexOf(var0);
            if (var1 == -1) {
                var1 = 74;
            }
            field1930[var0] = var1;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lza;Ljava/awt/Font;Ljava/awt/FontMetrics;CIZ)V", line = 5)
    private final void method883(class287 arg0, Font arg1, FontMetrics arg2, char arg3, int arg4, boolean arg5) {
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
        Image var12 = class60.field701.createImage(var7, var10);
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
        this.field1925 = var9 - var17;
        this.field1924 = var11;
        this.field1928[arg4] = var8;
        this.field1927[arg4] = arg0.method1218(var14, 0, var7, var7, var10);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lza;Ljava/lang/String;[IIIIZ)V", line = 94)
    private final void method884(class287 arg0, String arg1, int[] arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg5 == 0) {
            arg6 = false;
        }
        int var8 = arg5 | 0xFF000000;
        for (int var9 = 0; var9 < arg1.length(); var9++) {
            int var10 = field1930[arg1.charAt(var9)];
            if (arg6) {
                this.field1927[var10].method12(arg3 + 1, arg4 + 1, 0, -16777216, 1);
            }
            this.field1927[var10].method12(arg3, arg4, 0, var8, 1);
            arg3 += this.field1928[var10];
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "()I", line = 116)
    public final int method885() {
        return this.field1925;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Ljava/lang/String;)I", line = 121)
    public final int method886(String arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            int var4 = field1930[arg0.charAt(var3)];
            var2 += this.field1928[var4];
        }
        return var2;
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lza;IZLjava/awt/Component;)V", line = 170)
    public class145(class287 arg0, int arg1, boolean arg2, Component arg3) {
        this.field1926 = false;
        this.field1927 = new class24[256];
        this.field1928 = new int[256];
        Font var5 = new Font("Helvetica", arg2 ? 1 : 0, arg1);
        FontMetrics var6 = arg3.getFontMetrics(var5);
        for (int var7 = 0; var7 < field1923; var7++) {
            this.method883(arg0, var5, var6, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".charAt(var7), var7, false);
        }
        if (arg2 && this.field1926) {
            this.field1926 = false;
            Font var8 = new Font("Helvetica", 0, arg1);
            FontMetrics var9 = arg3.getFontMetrics(var8);
            for (int var10 = 0; var10 < field1923; var10++) {
                this.method883(arg0, var8, var9, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".charAt(var10), var10, false);
            }
            if (!this.field1926) {
                this.field1926 = false;
                for (int var11 = 0; var11 < field1923; var11++) {
                    this.method883(arg0, var8, var9, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".charAt(var11), var11, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lza;Ljava/lang/String;IIIZ)V", line = 150)
    public final void method887(class287 arg0, String arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = this.method886(arg1) / 2;
        arg0.method1163(this.field1929);
        if (arg2 - var7 <= this.field1929[2] && arg2 + var7 >= this.field1929[0] && arg3 - this.field1925 <= this.field1929[3] && this.field1924 + arg3 >= this.field1929[1]) {
            this.method884(arg0, arg1, this.field1929, arg2 - var7, arg3, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "()V", line = 168)
    public static void method888() {
        field1930 = null;
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "()I", line = 216)
    public final int method889() {
        return this.field1924 - 1;
    }
}
