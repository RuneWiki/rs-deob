import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class414 {

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "[I")
    private int[] field5987 = new int[4];

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "Z")
    private boolean field5991 = false;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "[Ll;")
    private class315[] field5985;

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "[I")
    private int[] field5989;

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "I")
    private static int field5990 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".length();

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "[I")
    private static int[] field5992 = new int[256];

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "I")
    private int field5986;

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "I")
    private int field5988;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".indexOf(var0);
            if (var1 == -1) {
                var1 = 74;
            }
            field5992[var0] = var1;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Ltj;Ljava/lang/String;[IIIIZ)V", line = 3)
    private final void method2610(class298 arg0, String arg1, int[] arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg5 == 0) {
            arg6 = false;
        }
        int var8 = arg5 | 0xFF000000;
        for (int var9 = 0; var9 < arg1.length(); var9++) {
            int var10 = field5992[arg1.charAt(var9)];
            if (arg6) {
                this.field5985[var10].method211(arg3 + 1, arg4 + 1, 1, -16777216, 1);
            }
            this.field5985[var10].method211(arg3, arg4, 1, var8, 1);
            arg3 += this.field5989[var10];
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "()I", line = 24)
    public final int method2611() {
        return this.field5988;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Ljava/lang/String;)I", line = 30)
    public final int method2612(String arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            int var4 = field5992[arg0.charAt(var3)];
            var2 += this.field5989[var4];
        }
        return var2;
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "()V", line = 45)
    public static void method2613() {
        field5992 = null;
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(Ltj;IZLjava/awt/Component;)V", line = 176)
    public class414(class298 arg0, int arg1, boolean arg2, Component arg3) {
        this.field5991 = false;
        this.field5985 = new class315[256];
        this.field5989 = new int[256];
        Font var5 = new Font("Helvetica", arg2 ? 1 : 0, arg1);
        FontMetrics var6 = arg3.getFontMetrics(var5);
        for (int var7 = 0; var7 < field5990; var7++) {
            this.method2614(arg0, var5, var6, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".charAt(var7), var7, false);
        }
        if (arg2 && this.field5991) {
            this.field5991 = false;
            Font var8 = new Font("Helvetica", 0, arg1);
            FontMetrics var9 = arg3.getFontMetrics(var8);
            for (int var10 = 0; var10 < field5990; var10++) {
                this.method2614(arg0, var8, var9, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".charAt(var10), var10, false);
            }
            if (!this.field5991) {
                this.field5991 = false;
                for (int var11 = 0; var11 < field5990; var11++) {
                    this.method2614(arg0, var8, var9, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".charAt(var11), var11, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Ltj;Ljava/awt/Font;Ljava/awt/FontMetrics;CIZ)V", line = 53)
    private final void method2614(class298 arg0, Font arg1, FontMetrics arg2, char arg3, int arg4, boolean arg5) {
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
        Image var12 = class422.field6138.createImage(var7, var10);
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
        this.field5988 = var9 - var17;
        this.field5986 = var11;
        this.field5989[arg4] = var8;
        this.field5985[arg4] = arg0.method514(var14, 0, var7, var7, var10);
    }

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "()I", line = 143)
    public final int method2615() {
        return this.field5986 - 1;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Ltj;Ljava/lang/String;IIIZ)V", line = 148)
    public final void method2616(class298 arg0, String arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = this.method2612(arg1) / 2;
        arg0.method474(this.field5987);
        if (arg2 - var7 <= this.field5987[2] && arg2 + var7 >= this.field5987[0] && arg3 - this.field5988 <= this.field5987[3] && this.field5986 + arg3 >= this.field5987[1]) {
            this.method2610(arg0, arg1, this.field5987, arg2 - var7, arg3, arg4, arg5);
        }
    }
}
