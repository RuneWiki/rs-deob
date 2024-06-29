import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class563 extends InputStream {

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "I")
    public static int field7550;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
    public static int field7551;

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
    public static int field7552;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "I")
    public static int field7553;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "Ldj;")
    public static class363 field7548;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "[Lwea;")
    public static class167[] field7549;

    @OriginalMember(owner = "client!bf", name = "read", descriptor = "()I", line = 5)
    public final int read() {
        field7550++;
        class438.method2636(true, 30000L);
        return -1;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Ljava/awt/Color;ILjava/awt/Color;Ljava/lang/String;ILjava/awt/Color;)V", line = 15)
    public static final void method3155(Color arg0, int arg1, Color arg2, String arg3, int arg4, Color arg5) {
        try {
            Graphics var6 = class706.field9894.getGraphics();
            if (class453.field6295 == null) {
                class453.field6295 = new Font("Helvetica", 1, 13);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            if (arg5 == null) {
                arg5 = new Color(140, 17, 17);
            }
            if (arg0 == null) {
                arg0 = new Color(255, 255, 255);
            }
            try {
                if (class214.field2819 == null) {
                    class214.field2819 = class706.field9894.createImage(class593.field8019, class140.field2048);
                }
                Graphics var7 = class214.field2819.getGraphics();
                var7.setColor(Color.black);
                if (arg1 <= 121) {
                    method3156((byte) -101);
                }
                var7.fillRect(0, 0, class593.field8019, class140.field2048);
                int var8 = class593.field8019 / 2 - 152;
                int var9 = class140.field2048 / 2 - 18;
                var7.setColor(arg5);
                var7.drawRect(var8, var9, 303, 33);
                var7.setColor(arg2);
                var7.fillRect(var8 + 2, var9 + 2, arg4 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var8 + 1, var9 + 1, 301, 31);
                var7.fillRect(arg4 * 3 + var8 + 2, var9 + 2, 300 - (arg4 * 3), 30);
                var7.setFont(class453.field6295);
                var7.setColor(arg0);
                var7.drawString(arg3, var8 + ((304 - arg3.length() * 6) / 2), var9 - -22);
                if (class213.field2816 != null) {
                    var7.setFont(class453.field6295);
                    var7.setColor(arg0);
                    var7.drawString(class213.field2816, class593.field8019 / 2 - class213.field2816.length() * 6 / 2, class140.field2048 / 2 + -26);
                }
                var6.drawImage(class214.field2819, 0, 0, null);
            } catch (Exception var12) {
                var6.setColor(Color.black);
                var6.fillRect(0, 0, class593.field8019, class140.field2048);
                int var10 = class593.field8019 / 2 - 152;
                int var11 = class140.field2048 / 2 - 18;
                var6.setColor(arg5);
                var6.drawRect(var10, var11, 303, 33);
                var6.setColor(arg2);
                var6.fillRect(var10 + 2, var11 + 2, arg4 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(var10 + 1, var11 - -1, 301, 31);
                var6.fillRect(var10 + (arg4 * 3) + 2, var11 + 2, 300 - (arg4 * 3), 30);
                var6.setFont(class453.field6295);
                var6.setColor(arg0);
                if (class213.field2816 != null) {
                    var6.setFont(class453.field6295);
                    var6.setColor(arg0);
                    var6.drawString(class213.field2816, class593.field8019 / 2 - class213.field2816.length() * 6 / 2, class140.field2048 / 2 - 26);
                }
                var6.drawString(arg3, (304 - (arg3.length() * 6)) / 2 + var10, var11 - -22);
            }
        } catch (Exception var13) {
            class706.field9894.repaint();
        }
        field7553++;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)V", line = 112)
    public static void method3156(byte arg0) {
        if (arg0 == -30) {
            field7549 = null;
            field7548 = null;
        }
    }
}
