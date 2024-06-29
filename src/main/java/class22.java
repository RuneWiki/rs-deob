import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!la")
public abstract class class22 {

    @OriginalMember(owner = "mapview!la", name = "b", descriptor = "[I")
    public static int[] field186 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 0, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "mapview!la", name = "i", descriptor = "I")
    public static int field193 = 1;

    @OriginalMember(owner = "mapview!la", name = "e", descriptor = "Lt;")
    public static class31 field189 = class14.method84(114, "Candle Shop");

    @OriginalMember(owner = "mapview!la", name = "d", descriptor = "Lt;")
    public static class31 field188 = class14.method84(114, "Chainmail Shop");

    @OriginalMember(owner = "mapview!la", name = "h", descriptor = "Lt;")
    public static class31 field192 = class14.method84(120, "Fur Trader");

    @OriginalMember(owner = "mapview!la", name = "c", descriptor = "Lt;")
    public static class31 field187 = class14.method84(108, "Anvil");

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "Lt;")
    public static class31 field185 = class14.method84(115, "Axe Shop");

    @OriginalMember(owner = "mapview!la", name = "k", descriptor = "Lt;")
    public static class31 field195 = class14.method84(115, "(U");

    @OriginalMember(owner = "mapview!la", name = "f", descriptor = "Z")
    public static boolean field190 = false;

    @OriginalMember(owner = "mapview!la", name = "g", descriptor = "Lla;")
    public static class22 field191;

    @OriginalMember(owner = "mapview!la", name = "j", descriptor = "[I")
    public static int[] field194;

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(I)V", line = 12)
    public static void method128(int arg0) {
        field187 = null;
        field189 = null;
        if (arg0 != 24867) {
            field195 = null;
        }
        field186 = null;
        field194 = null;
        field192 = null;
        field195 = null;
        field188 = null;
        field185 = null;
        field191 = null;
    }

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(IILca;I)[Lu;", line = 54)
    public static final class32[] method129(int arg0, int arg1, class6 arg2, int arg3) {
        if (class19.method115(arg1, arg2, -41, arg0)) {
            int var4 = -50 / ((arg3 - 2) / 50);
            return class7.method39((byte) -128);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(ILjava/lang/Throwable;Ljava/lang/String;)V", line = 108)
    public static final void method130(int arg0, Throwable arg1, String arg2) {
        try {
            String var3 = "";
            if (arg0 != -1) {
                return;
            }
            if (arg1 != null) {
                var3 = class24.method135(arg1, true);
            }
            if (arg2 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg2;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            class29 var8 = class13.field98.method93((byte) -66, new URL(class13.field98.field132.getCodeBase(), "clienterror.ws?c=" + class14.field109 + "&u=" + class1.field9 + "&v1=" + class16.field137 + "&v2=" + class16.field134 + "&e=" + var7));
            while (var8.field320 == 0) {
                mapview.method145(1L, -110);
            }
            if (var8.field320 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field321;
                var9.read();
                var9.close();
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(BLjava/awt/Color;ILt;)V", line = 163)
    public static final void method131(byte arg0, Color arg1, int arg2, class31 arg3) {
        try {
            Graphics var4 = class12.field90.getGraphics();
            if (class27.field310 == null) {
                class27.field310 = new Font("Helvetica", 1, 13);
                class4.field24 = class12.field90.getFontMetrics(class27.field310);
            }
            if (class1.field16) {
                class1.field16 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, class17.field146, class18.field160);
            }
            if (arg1 == null) {
                arg1 = new Color(140, 17, 17);
            }
            try {
                if (class20.field180 == null) {
                    class20.field180 = class12.field90.createImage(304, 34);
                }
                Graphics var5 = class20.field180.getGraphics();
                var5.setColor(arg1);
                var5.drawRect(0, 0, 303, 33);
                if (arg0 != -62) {
                    field194 = null;
                }
                var5.fillRect(2, 2, arg2 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg2 * 3 + 2, 2, 300 - arg2 * 3, 30);
                var5.setFont(class27.field310);
                var5.setColor(Color.white);
                arg3.method181(arg0 ^ 0xFFFFFFC2, var5, (304 - arg3.method186(-14282, class4.field24)) / 2, 22);
                var4.drawImage(class20.field180, class17.field146 / 2 - 152, class18.field160 / 2 + -18, null);
            } catch (Exception var10) {
                int var7 = class17.field146 / 2 - 152;
                int var8 = class18.field160 / 2 - 18;
                var4.setColor(arg1);
                var4.drawRect(var7, var8, 303, 33);
                var4.fillRect(var7 + 2, var8 - -2, arg2 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var7 + 1, var8 + 1, 301, 31);
                var4.fillRect(arg2 * 3 + var7 + 2, var8 + 2, 300 - arg2 * 3, 30);
                var4.setFont(class27.field310);
                var4.setColor(Color.white);
                arg3.method181(0, var4, var7 + (304 - arg3.method186(-14282, class4.field24)) / 2, var8 + 22);
            }
        } catch (Exception var11) {
            class12.field90.repaint();
        }
    }

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(Z)V")
    public abstract void method1(boolean arg0);

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(III)I")
    public abstract int method4(int arg0, int arg1, int arg2);
}
