import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public class class205 {

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "Z")
    private boolean field3378 = false;

    @OriginalMember(owner = "client!wt", name = "c", descriptor = "[I")
    private int[] field3379 = new int[4];

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "[Ll;")
    private class16[] field3377;

    @OriginalMember(owner = "client!wt", name = "f", descriptor = "[I")
    private int[] field3382;

    @OriginalMember(owner = "client!wt", name = "d", descriptor = "I")
    private static int field3380 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".length();

    @OriginalMember(owner = "client!wt", name = "h", descriptor = "[I")
    private static int[] field3384 = new int[256];

    @OriginalMember(owner = "client!wt", name = "e", descriptor = "I")
    private int field3381;

    @OriginalMember(owner = "client!wt", name = "g", descriptor = "I")
    private int field3383;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".indexOf(var0);
            if (var1 == -1) {
                var1 = 74;
            }
            field3384[var0] = var1;
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(Ljava/lang/String;)I", line = 5)
    public final int method1421(String arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            int var4 = field3384[arg0.charAt(var3)];
            var2 += this.field3382[var4];
        }
        return var2;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(Lya;Ljava/lang/String;[IIIIZ)V", line = 21)
    private final void method1422(class38 arg0, String arg1, int[] arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg5 == 0) {
            arg6 = false;
        }
        int var8 = arg5 | 0xFF000000;
        for (int var9 = 0; var9 < arg1.length(); var9++) {
            int var10 = field3384[arg1.charAt(var9)];
            if (arg6) {
                this.field3377[var10].method141(arg3 + 1, arg4 + 1, 0, -16777216, 1);
            }
            this.field3377[var10].method141(arg3, arg4, 0, var8, 1);
            arg3 += this.field3382[var10];
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "()I", line = 42)
    public final int method1423() {
        return this.field3381;
    }

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "()V", line = 46)
    public static void method1424() {
        field3384 = null;
    }

    @OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(Lya;IZLjava/awt/Component;)V", line = 170)
    public class205(class38 arg0, int arg1, boolean arg2, Component arg3) {
        this.field3378 = false;
        this.field3377 = new class16[256];
        this.field3382 = new int[256];
        Font var5 = new Font("Helvetica", arg2 ? 1 : 0, arg1);
        FontMetrics var6 = arg3.getFontMetrics(var5);
        for (int var7 = 0; var7 < field3380; var7++) {
            this.method1425(arg0, var5, var6, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".charAt(var7), var7, false);
        }
        if (arg2 && this.field3378) {
            this.field3378 = false;
            Font var8 = new Font("Helvetica", 0, arg1);
            FontMetrics var9 = arg3.getFontMetrics(var8);
            for (int var10 = 0; var10 < field3380; var10++) {
                this.method1425(arg0, var8, var9, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".charAt(var10), var10, false);
            }
            if (!this.field3378) {
                this.field3378 = false;
                for (int var11 = 0; var11 < field3380; var11++) {
                    this.method1425(arg0, var8, var9, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".charAt(var11), var11, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(Lya;Ljava/awt/Font;Ljava/awt/FontMetrics;CIZ)V", line = 58)
    private final void method1425(class38 arg0, Font arg1, FontMetrics arg2, char arg3, int arg4, boolean arg5) {
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
        Image var12 = class111.field1557.createImage(var7, var10);
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
        this.field3381 = var9 - var17;
        this.field3383 = var11;
        this.field3382[arg4] = var8;
        this.field3377[arg4] = arg0.method350(var14, 0, var7, var7, var10);
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(Lya;Ljava/lang/String;IIIZ)V", line = 148)
    public final void method1426(class38 arg0, String arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = this.method1421(arg1) / 2;
        arg0.method351(this.field3379);
        if (arg2 - var7 <= this.field3379[2] && arg2 + var7 >= this.field3379[0] && arg3 - this.field3381 <= this.field3379[3] && this.field3383 + arg3 >= this.field3379[1]) {
            this.method1422(arg0, arg1, this.field3379, arg2 - var7, arg3, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!wt", name = "c", descriptor = "()I", line = 216)
    public final int method1427() {
        return this.field3383 - 1;
    }
}
