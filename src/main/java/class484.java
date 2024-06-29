import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class484 {

    @OriginalMember(owner = "client!o", name = "d", descriptor = "[I")
    private int[] field7115 = new int[4];

    @OriginalMember(owner = "client!o", name = "g", descriptor = "Z")
    private boolean field7116 = false;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "[Ltb;")
    private class392[] field7112;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "[I")
    private int[] field7114;

    @OriginalMember(owner = "client!o", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7118 = new String[] { method3741(method3740("*U\u0005A\b-P\u000eL\u0007 [\u000bK\u0002;F\u0014V\u0019>A\u0011]\u00141v$f)\u000eq!m$\u0001|*h#\u0004g7w>\u001fb0r5\u0012mv4\u007fX#s3zS.g'îO2\u0018#gC>kZp@L=X0P-aEn\u0015;z+sD(\u001aym¯Ü\u0089Ó\u0091\u008fü©ó±\u0094È\u0087Å\u0084£Ú\u008aÖ\u009f±Î§å¤\u0083úªö¿\u0091î\u0084Ï\u0083¿Ì¤ï£\u009fì\u0080ã®¨â\u0093â\u008a")), method3741(method3740("#r*s(\u001f~%d")) };

    @OriginalMember(owner = "client!o", name = "b", descriptor = "I")
    private static int field7111 = field7118[0].length();

    @OriginalMember(owner = "client!o", name = "h", descriptor = "[I")
    private static int[] field7117 = new int[256];

    @OriginalMember(owner = "client!o", name = "e", descriptor = "I")
    private int field7110;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "I")
    private int field7113;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = field7118[0].indexOf(var0);
            if (var1 == -1) {
                var1 = 74;
            }
            field7117[var0] = var1;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Ljava/lang/String;)I", line = 6)
    public final int method3733(String arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            int var4 = field7117[arg0.charAt(var3)];
            var2 += this.field7114[var4];
        }
        return var2;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lha;Ljava/awt/Font;Ljava/awt/FontMetrics;CIZ)V", line = 22)
    private final void method3734(class18 arg0, Font arg1, FontMetrics arg2, char arg3, int arg4, boolean arg5) {
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
        Image var12 = class560.field8153.createImage(var7, var10);
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
        label75: for (int var18 = 0; var18 < var10; var18++) {
            for (int var19 = 0; var19 < var7; var19++) {
                int var20 = var14[var7 * var18 + var19];
                if ((var20 & 0xFFFFFF) != 0) {
                    var17 = var18;
                    break label75;
                }
            }
        }
        for (int var21 = 0; var21 < var14.length; var21++) {
            if ((var14[var21] & 0xFFFFFF) == 0) {
                var14[var21] = 0;
            }
        }
        this.field7113 = var9 - var17;
        this.field7110 = var11;
        this.field7114[arg4] = var8;
        this.field7112[arg4] = arg0.method201(var10, var7, var14, var7, (byte) 127, 0);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lha;Ljava/lang/String;[IIIIZ)V", line = 111)
    private final void method3735(class18 arg0, String arg1, int[] arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg5 == 0) {
            arg6 = false;
        }
        int var8 = arg5 | 0xFF000000;
        for (int var9 = 0; var9 < arg1.length(); var9++) {
            int var10 = field7117[arg1.charAt(var9)];
            if (arg6) {
                this.field7112[var10].method874(arg3 + 1, arg4 + 1, 0, -16777216, 1);
            }
            this.field7112[var10].method874(arg3, arg4, 0, var8, 1);
            arg3 += this.field7114[var10];
        }
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "()I", line = 133)
    public final int method3736() {
        return this.field7110 - 1;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "()I", line = 136)
    public final int method3737() {
        return this.field7113;
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "()V", line = 141)
    public static void method3738() {
        field7117 = null;
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "(Lha;IZLjava/awt/Component;)V", line = 172)
    public class484(class18 arg0, int arg1, boolean arg2, Component arg3) {
        this.field7116 = false;
        this.field7112 = new class392[256];
        this.field7114 = new int[256];
        Font var5 = new Font(field7118[1], arg2 ? 1 : 0, arg1);
        FontMetrics var6 = arg3.getFontMetrics(var5);
        for (int var7 = 0; var7 < field7111; var7++) {
            this.method3734(arg0, var5, var6, field7118[0].charAt(var7), var7, false);
        }
        if (arg2 && this.field7116) {
            this.field7116 = false;
            Font var8 = new Font(field7118[1], 0, arg1);
            FontMetrics var9 = arg3.getFontMetrics(var8);
            for (int var10 = 0; var10 < field7111; var10++) {
                this.method3734(arg0, var8, var9, field7118[0].charAt(var10), var10, false);
            }
            if (!this.field7116) {
                this.field7116 = false;
                for (int var11 = 0; var11 < field7111; var11++) {
                    this.method3734(arg0, var8, var9, field7118[0].charAt(var11), var11, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lha;Ljava/lang/String;IIIZ)V", line = 152)
    public final void method3739(class18 arg0, String arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = this.method3733(arg1) / 2;
        arg0.method229(this.field7115);
        if (arg2 - var7 <= this.field7115[2] && arg2 + var7 >= this.field7115[0] && arg3 - this.field7113 <= this.field7115[3] && this.field7110 + arg3 >= this.field7115[1]) {
            this.method3735(arg0, arg1, this.field7115, arg2 - var7, arg3, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!o", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3740(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!o", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3741(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 107;
                    break;
                case 1:
                    var10005 = 23;
                    break;
                case 2:
                    var10005 = 70;
                    break;
                case 3:
                    var10005 = 5;
                    break;
                default:
                    var10005 = 77;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
