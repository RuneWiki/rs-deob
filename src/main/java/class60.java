import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class60 {

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "[I")
    private int[] field715 = new int[4];

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "Z")
    private boolean field713 = false;

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "[Lgj;")
    private class381[] field712;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "[I")
    private int[] field710;

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "I")
    private static int field716 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".length();

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "[I")
    private static int[] field717 = new int[256];

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "I")
    private int field711;

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "I")
    private int field714;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".indexOf(var0);
            if (var1 == -1) {
                var1 = 74;
            }
            field717[var0] = var1;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lae;Ljava/lang/String;IIIZ)V", line = 8)
    public final void method350(class134 arg0, String arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = this.method351(arg1) / 2;
        arg0.method659(this.field715);
        if (arg2 - var7 <= this.field715[2] && arg2 + var7 >= this.field715[0] && arg3 - this.field711 <= this.field715[3] && this.field714 + arg3 >= this.field715[1]) {
            this.method355(arg0, arg1, this.field715, arg2 - var7, arg3, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Ljava/lang/String;)I", line = 29)
    public final int method351(String arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            int var4 = field717[arg0.charAt(var3)];
            var2 += this.field710[var4];
        }
        return var2;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "()I", line = 44)
    public final int method352() {
        return this.field714 - 1;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lae;Ljava/awt/Font;Ljava/awt/FontMetrics;CIZ)V", line = 48)
    private final void method353(class134 arg0, Font arg1, FontMetrics arg2, char arg3, int arg4, boolean arg5) {
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
        Image var12 = class402.field5767.createImage(var7, var10);
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
        this.field711 = var9 - var17;
        this.field714 = var11;
        this.field710[arg4] = var8;
        this.field712[arg4] = arg0.method610(var14, 0, var7, var7, var10);
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "()I", line = 141)
    public final int method354() {
        return this.field711;
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Lae;IZLjava/awt/Component;)V", line = 152)
    public class60(class134 arg0, int arg1, boolean arg2, Component arg3) {
        this.field713 = false;
        this.field712 = new class381[256];
        this.field710 = new int[256];
        Font var5 = new Font("Helvetica", arg2 ? 1 : 0, arg1);
        FontMetrics var6 = arg3.getFontMetrics(var5);
        for (int var7 = 0; var7 < field716; var7++) {
            this.method353(arg0, var5, var6, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".charAt(var7), var7, false);
        }
        if (arg2 && this.field713) {
            this.field713 = false;
            Font var8 = new Font("Helvetica", 0, arg1);
            FontMetrics var9 = arg3.getFontMetrics(var8);
            for (int var10 = 0; var10 < field716; var10++) {
                this.method353(arg0, var8, var9, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".charAt(var10), var10, false);
            }
            if (!this.field713) {
                this.field713 = false;
                for (int var11 = 0; var11 < field716; var11++) {
                    this.method353(arg0, var8, var9, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".charAt(var11), var11, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lae;Ljava/lang/String;[IIIIZ)V", line = 195)
    private final void method355(class134 arg0, String arg1, int[] arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg5 == 0) {
            arg6 = false;
        }
        int var8 = arg5 | 0xFF000000;
        for (int var9 = 0; var9 < arg1.length(); var9++) {
            int var10 = field717[arg1.charAt(var9)];
            if (arg6) {
                this.field712[var10].method756(arg3 + 1, arg4 + 1, 1, -16777216, 1);
            }
            this.field712[var10].method756(arg3, arg4, 1, var8, 1);
            arg3 += this.field710[var10];
        }
    }

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "()V", line = 216)
    public static void method356() {
        field717 = null;
    }
}
