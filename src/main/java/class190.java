import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class190 extends InputStream {

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "Ljava/lang/String;")
    public static String field3082 = "purple:";

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "I")
    public static int field3077;

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "I")
    public static int field3080;

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "I")
    public static int field3081;

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "[I")
    public static int[] field3078;

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "[Lvj;")
    public static class173[] field3083;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)V")
    public static void method1245(int arg0) {
        field3082 = null;
        field3078 = null;
        if (arg0 > -119) {
            method1247((String) null, -60);
        }
        field3083 = null;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ZIILjava/awt/Color;Ljava/lang/String;)V")
    public static final void method1246(boolean arg0, int arg1, int arg2, Color arg3, String arg4) {
        try {
            if (arg2 <= 42) {
                field3083 = null;
            }
            Graphics var5 = class118.field2099.getGraphics();
            if (class177.field2922 == null) {
                class177.field2922 = new Font("Helvetica", 1, 13);
                class133.field2307 = class118.field2099.getFontMetrics(class177.field2922);
            }
            if (arg0) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class267.field4324, class4.field38);
            }
            if (arg3 == null) {
                arg3 = new Color(140, 17, 17);
            }
            try {
                if (class77.field1253 == null) {
                    class77.field1253 = class118.field2099.createImage(304, 34);
                }
                Graphics var6 = class77.field1253.getGraphics();
                var6.setColor(arg3);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg1 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg1 * 3 + 2, 2, 300 - (arg1 * 3), 30);
                var6.setFont(class177.field2922);
                var6.setColor(Color.white);
                var6.drawString(arg4, (304 - class133.field2307.stringWidth(arg4)) / 2, 22);
                var5.drawImage(class77.field1253, class267.field4324 / 2 - 152, class4.field38 / 2 + -18, (ImageObserver) null);
            } catch (Exception var9) {
                int var7 = class267.field4324 / 2 - 152;
                int var8 = class4.field38 / 2 - 18;
                var5.setColor(arg3);
                var5.drawRect(var7, var8, 303, 33);
                var5.fillRect(var7 + 2, var8 + 2, arg1 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var7 + 1, var8 + 1, 301, 31);
                var5.fillRect(arg1 * 3 + var7 + 2, var8 - -2, 300 - (arg1 * 3), 30);
                var5.setFont(class177.field2922);
                var5.setColor(Color.white);
                var5.drawString(arg4, var7 + ((304 - class133.field2307.stringWidth(arg4)) / 2), var8 + 22);
            }
            if (class241.field3968 != null) {
                var5.setFont(class177.field2922);
                var5.setColor(Color.white);
                var5.drawString(class241.field3968, class267.field4324 / 2 - class133.field2307.stringWidth(class241.field3968) / 2, class4.field38 / 2 - 26);
            }
        } catch (Exception var10) {
            class118.field2099.repaint();
        }
        field3080++;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method1247(String arg0, int arg1) {
        field3077++;
        int var2 = arg0.length();
        int var3 = -57 / ((31 - arg1) / 45);
        byte var4 = 2;
        char[] var5 = new char[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            char var7 = arg0.charAt(var6);
            if (var4 == 0) {
                var7 = Character.toLowerCase(var7);
            } else if (var4 == 2 || Character.isUpperCase(var7)) {
                var7 = class72.method435(true, var7);
            }
            if (Character.isLetter(var7)) {
                var4 = 0;
            } else if (var7 == '.' || var7 == '?' || var7 == '!') {
                var4 = 2;
            } else if (!Character.isSpaceChar(var7)) {
                var4 = 1;
            } else if (var4 != 2) {
                var4 = 1;
            }
            var5[var6] = var7;
        }
        return new String(var5);
    }

    @OriginalMember(owner = "client!rk", name = "read", descriptor = "()I")
    public final int read() {
        class245.method1636(false, 30000L);
        field3081++;
        return -1;
    }
}
