import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class143 {

    @OriginalMember(owner = "client!km", name = "a", descriptor = "I")
    public static int field2347 = 0;

    @OriginalMember(owner = "client!km", name = "d", descriptor = "Ljava/lang/String;")
    public static String field2350 = "Use";

    @OriginalMember(owner = "client!km", name = "b", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!km", name = "c", descriptor = "I")
    public static int field2349;

    @OriginalMember(owner = "client!km", name = "e", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!km", name = "f", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!km", name = "g", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!km", name = "h", descriptor = "I")
    public static int field2354;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I)V", line = 5)
    public static final void method1183(int arg0) {
        field2353++;
        if (arg0 != 31) {
            method1183(99);
        }
        class231.field3610.method656(0);
        class191.field3002.method656(0);
        class346.field5504.method656(0);
        class223.field3465.method656(0);
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(ZILjava/awt/Color;ILjava/lang/String;)V", line = 19)
    public static final void method1184(boolean arg0, int arg1, Color arg2, int arg3, String arg4) {
        field2349++;
        try {
            Graphics var5 = class64.field974.getGraphics();
            if (class6.field83 == null) {
                class6.field83 = new Font("Helvetica", 1, 13);
                class205.field3167 = class64.field974.getFontMetrics(class6.field83);
            }
            if (arg0) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class126.field2113, class362.field5740);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (class44.field711 == null) {
                    class44.field711 = class64.field974.createImage(304, 34);
                }
                Graphics var6 = class44.field711.getGraphics();
                var6.setColor(arg2);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg3 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg3 * 3 + 2, 2, 300 - arg3 * 3, 30);
                var6.setFont(class6.field83);
                if (arg1 <= 31) {
                    method1184(false, 46, (Color) null, -74, (String) null);
                }
                var6.setColor(Color.white);
                var6.drawString(arg4, (304 - class205.field3167.stringWidth(arg4)) / 2, 22);
                var5.drawImage(class44.field711, class126.field2113 / 2 - 152, class362.field5740 / 2 + -18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = class126.field2113 / 2 - 152;
                int var9 = class362.field5740 / 2 - 18;
                var5.setColor(arg2);
                var5.drawRect(var8, var9, 303, 33);
                var5.fillRect(var8 + 2, var9 + 2, arg3 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var8 + 1, var9 + 1, 301, 31);
                var5.fillRect(var8 + (arg3 * 3) + 2, var9 + 2, 300 - (arg3 * 3), 30);
                var5.setFont(class6.field83);
                var5.setColor(Color.white);
                var5.drawString(arg4, (304 - class205.field3167.stringWidth(arg4)) / 2 + var8, var9 - -22);
            }
            if (class45.field721 != null) {
                var5.setFont(class6.field83);
                var5.setColor(Color.white);
                var5.drawString(class45.field721, class126.field2113 / 2 - (class205.field3167.stringWidth(class45.field721) / 2), class362.field5740 / 2 - 26);
            }
        } catch (Exception var12) {
            class64.field974.repaint();
        }
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(I)V", line = 95)
    public static void method1185(int arg0) {
        if (arg0 == 15955) {
            field2350 = null;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(CB)C", line = 108)
    public static final char method1186(char arg0, byte arg1) {
        field2354++;
        if (arg0 == 'Æ') {
            return 'E';
        }
        int var2 = 111 % ((arg1 - 18) / 53);
        if (arg0 == 'æ') {
            return 'e';
        } else if (arg0 == 'ß') {
            return 's';
        } else if (arg0 == 'Œ') {
            return 'E';
        } else {
            return (char) (arg0 == 'œ' ? 'e' : '\u0000');
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I[B)[B", line = 140)
    public static final byte[] method1187(int arg0, byte[] arg1) {
        field2351++;
        if (arg0 != 9) {
            field2347 = 121;
        }
        class25 var2 = new class25(arg1);
        int var3 = var2.method281(-125);
        int var4 = var2.method262((byte) 85);
        if (var4 < 0 || !(class57.field893 == 0 || var4 <= class57.field893)) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method301((byte) -89, var4, var5, 0);
            return var5;
        } else {
            int var6 = var2.method262((byte) 113);
            if (var6 < 0 || class57.field893 != 0 && class57.field893 < var6) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class196.method1488(var7, var6, arg1, var4, 9);
            } else {
                class296.field4595.method1470(var2, -42, var7);
            }
            return var7;
        }
    }
}
