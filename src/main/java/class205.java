import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class205 {

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "[I")
    private int[] field3206 = new int[4];

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "Z")
    private boolean field3213 = false;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "[Lhk;")
    private class107[] field3211;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "[I")
    private int[] field3210;

    @OriginalMember(owner = "client!vb", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3214 = new String[] { method1857(method1856("\u001a\u0001\"#L\u001d\u0004).C\u0010\u000f,)F\u000b\u001234]\u000e\u00156?P\u0001\"\u0003\u0004m>%\u0006\u000f`1(\r\ng43\u0010\u0015z/6\u0017\u0010q\"9QV;hwTQ>cz@Eª\u007ff?A#sjL84p\u0018\u001a:t`yF'*%o]I7t|=\u001b)\u009f\u0088®±Õ¿¨\u008e\u0091õ¤\u009c §À\u0093\u008e\u00ad´Û\u0081\u009a\u0080\u0087à³®\u008d\u0094û¡º£\u00adÇ\u008f\u0098\u0083\u008dç¯¸§\u0081ê\u0098¶´\u0080Î")), method1857(method1856("\u0013&\r\u0011l/*\u0002\u0006")) };

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
    private static int field3207 = field3214[0].length();

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "[I")
    private static int[] field3212 = new int[256];

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
    private int field3208;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
    private int field3209;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "()I")
    public final int method1849() {
        return this.field3208;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lha;Ljava/lang/String;IIIZ)V")
    public final void method1850(class63 arg0, String arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = this.method1852(arg1) / 2;
        arg0.method201(this.field3206);
        if (arg2 - var7 <= this.field3206[2] && arg2 + var7 >= this.field3206[0] && arg3 - this.field3208 <= this.field3206[3] && this.field3209 + arg3 >= this.field3206[1]) {
            this.method1853(arg0, arg1, this.field3206, arg2 - var7, arg3, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "()I")
    public final int method1851() {
        return this.field3209 - 1;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Ljava/lang/String;)I")
    public final int method1852(String arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            int var4 = field3212[arg0.charAt(var3)];
            var2 += this.field3210[var4];
        }
        return var2;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lha;Ljava/lang/String;[IIIIZ)V")
    private final void method1853(class63 arg0, String arg1, int[] arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg5 == 0) {
            arg6 = false;
        }
        int var8 = arg5 | 0xFF000000;
        for (int var9 = 0; var9 < arg1.length(); var9++) {
            int var10 = field3212[arg1.charAt(var9)];
            if (arg6) {
                this.field3211[var10].method19(arg3 + 1, arg4 + 1, 0, -16777216, 1);
            }
            this.field3211[var10].method19(arg3, arg4, 0, var8, 1);
            arg3 += this.field3210[var10];
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lha;Ljava/awt/Font;Ljava/awt/FontMetrics;CIZ)V")
    private final void method1854(class63 arg0, Font arg1, FontMetrics arg2, char arg3, int arg4, boolean arg5) {
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
        Image var12 = class442.field6902.createImage(var7, var10);
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
        this.field3208 = var9 - var17;
        this.field3209 = var11;
        this.field3210[arg4] = var8;
        this.field3211[arg4] = arg0.method665(var7, var7, -5, 0, var14, var10);
    }

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "()V")
    public static void method1855() {
        field3212 = null;
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Lha;IZLjava/awt/Component;)V")
    public class205(class63 arg0, int arg1, boolean arg2, Component arg3) {
        this.field3213 = false;
        this.field3211 = new class107[256];
        this.field3210 = new int[256];
        Font var5 = new Font(field3214[1], arg2 ? 1 : 0, arg1);
        FontMetrics var6 = arg3.getFontMetrics(var5);
        for (int var7 = 0; var7 < field3207; var7++) {
            this.method1854(arg0, var5, var6, field3214[0].charAt(var7), var7, false);
        }
        if (arg2 && this.field3213) {
            this.field3213 = false;
            Font var8 = new Font(field3214[1], 0, arg1);
            FontMetrics var9 = arg3.getFontMetrics(var8);
            for (int var10 = 0; var10 < field3207; var10++) {
                this.method1854(arg0, var8, var9, field3214[0].charAt(var10), var10, false);
            }
            if (!this.field3213) {
                this.field3213 = false;
                for (int var11 = 0; var11 < field3207; var11++) {
                    this.method1854(arg0, var8, var9, field3214[0].charAt(var11), var11, true);
                }
            }
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = field3214[0].indexOf(var0);
            if (var1 == -1) {
                var1 = 74;
            }
            field3212[var0] = var1;
        }
    }

    @OriginalMember(owner = "client!vb", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1856(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x9);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!vb", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1857(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 91;
                    break;
                case 1:
                    var10005 = 67;
                    break;
                case 2:
                    var10005 = 97;
                    break;
                case 3:
                    var10005 = 103;
                    break;
                default:
                    var10005 = 9;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
