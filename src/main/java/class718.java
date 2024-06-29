import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class718 {

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "[I")
    private int[] field10401 = new int[4];

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "Z")
    private boolean field10402 = false;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "[Lfs;")
    private class581[] field10405;

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "[I")
    private int[] field10400;

    @OriginalMember(owner = "client!hg", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10408 = new String[] { method5241(method5240("RS\u0007\u0018\u0005UV\f\u0015\nX]\t\u0012\u000fC@\u0016\u000f\u0014FG\u0013\u0004\u0019Ip&?$vw#4)yz(1.|a5.3gd2+8jktmr %qjw+(e~ã74\u001azj;8i\u0003}8J?\u0001=(+c\u001ccm=xr~<.\u0018 `×Ú\u008b\u008a\u009c÷ú«ª¼ìÎ\u0085\u009c\u0089ÛÜ\u0088\u008f\u0092ÉÈ¥¼©ûü¨¯²éè\u0086\u0096\u008eÇÊ¦¶®çê\u0082º£Ðä\u0091»\u0087")), method5241(method5240("[t(*%gx'=")) };

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "I")
    private static int field10404 = field10408[0].length();

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "[I")
    private static int[] field10407 = new int[256];

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "I")
    private int field10403;

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "I")
    private int field10406;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = field10408[0].indexOf(var0);
            if (var1 == -1) {
                var1 = 74;
            }
            field10407[var0] = var1;
        }
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "()I", line = 5)
    public final int method5233() {
        return this.field10403 - 1;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lha;Ljava/lang/String;[IIIIZ)V", line = 9)
    private final void method5234(class66 arg0, String arg1, int[] arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg5 == 0) {
            arg6 = false;
        }
        int var8 = arg5 | 0xFF000000;
        for (int var9 = 0; var9 < arg1.length(); var9++) {
            int var10 = field10407[arg1.charAt(var9)];
            if (arg6) {
                this.field10405[var10].method999(arg3 + 1, arg4 + 1, 0, -16777216, 1);
            }
            this.field10405[var10].method999(arg3, arg4, 0, var8, 1);
            arg3 += this.field10400[var10];
        }
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Lha;IZLjava/awt/Component;)V", line = 172)
    public class718(class66 arg0, int arg1, boolean arg2, Component arg3) {
        this.field10402 = false;
        this.field10405 = new class581[256];
        this.field10400 = new int[256];
        Font var5 = new Font(field10408[1], arg2 ? 1 : 0, arg1);
        FontMetrics var6 = arg3.getFontMetrics(var5);
        for (int var7 = 0; var7 < field10404; var7++) {
            this.method5237(arg0, var5, var6, field10408[0].charAt(var7), var7, false);
        }
        if (arg2 && this.field10402) {
            this.field10402 = false;
            Font var8 = new Font(field10408[1], 0, arg1);
            FontMetrics var9 = arg3.getFontMetrics(var8);
            for (int var10 = 0; var10 < field10404; var10++) {
                this.method5237(arg0, var8, var9, field10408[0].charAt(var10), var10, false);
            }
            if (!this.field10402) {
                this.field10402 = false;
                for (int var11 = 0; var11 < field10404; var11++) {
                    this.method5237(arg0, var8, var9, field10408[0].charAt(var11), var11, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Ljava/lang/String;)I", line = 40)
    public final int method5235(String arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            int var4 = field10407[arg0.charAt(var3)];
            var2 += this.field10400[var4];
        }
        return var2;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lha;Ljava/lang/String;IIIZ)V", line = 57)
    public final void method5236(class66 arg0, String arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = this.method5235(arg1) / 2;
        arg0.method543(this.field10401);
        if (arg2 - var7 <= this.field10401[2] && arg2 + var7 >= this.field10401[0] && arg3 - this.field10406 <= this.field10401[3] && this.field10403 + arg3 >= this.field10401[1]) {
            this.method5234(arg0, arg1, this.field10401, arg2 - var7, arg3, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lha;Ljava/awt/Font;Ljava/awt/FontMetrics;CIZ)V", line = 75)
    private final void method5237(class66 arg0, Font arg1, FontMetrics arg2, char arg3, int arg4, boolean arg5) {
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
        Image var12 = class502.field7252.createImage(var7, var10);
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
        this.field10406 = var9 - var17;
        this.field10403 = var11;
        this.field10400[arg4] = var8;
        this.field10405[arg4] = arg0.method520(0, var7, var14, (byte) 41, var7, var10);
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "()I", line = 163)
    public final int method5238() {
        return this.field10406;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "()V", line = 170)
    public static void method5239() {
        field10407 = null;
    }

    @OriginalMember(owner = "client!hg", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5240(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x40);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!hg", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5241(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 19;
                    break;
                case 1:
                    var10005 = 17;
                    break;
                case 2:
                    var10005 = 68;
                    break;
                case 3:
                    var10005 = 92;
                    break;
                default:
                    var10005 = 64;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
