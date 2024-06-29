import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!e")
public class class9 {

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "Ln;")
    public static class26 field180 = method82(255, "Loading )3)3)3");

    @OriginalMember(owner = "mapview!e", name = "b", descriptor = "Ln;")
    public static class26 field181 = method82(255, "Loading ");

    @OriginalMember(owner = "mapview!e", name = "c", descriptor = "Ln;")
    public static class26 field182 = method82(255, "Overview");

    @OriginalMember(owner = "mapview!e", name = "e", descriptor = "Ln;")
    public static class26 field184 = method82(255, "Chainmail Shop");

    @OriginalMember(owner = "mapview!e", name = "i", descriptor = "Ln;")
    public static class26 field188 = method82(255, "???");

    @OriginalMember(owner = "mapview!e", name = "j", descriptor = "Ln;")
    public static class26 field189 = method82(255, "Scimitar Shop");

    @OriginalMember(owner = "mapview!e", name = "k", descriptor = "Ln;")
    public static class26 field190 = method82(255, "mapscene");

    @OriginalMember(owner = "mapview!e", name = "g", descriptor = "B")
    public byte field186;

    @OriginalMember(owner = "mapview!e", name = "f", descriptor = "Z")
    public static boolean field185;

    @OriginalMember(owner = "mapview!e", name = "h", descriptor = "[B")
    public byte[] field187;

    @OriginalMember(owner = "mapview!e", name = "d", descriptor = "[[Le;")
    public static class9[][] field183;

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "(I)V", line = 10)
    public final void method79(int arg0) {
        boolean var2 = true;
        if (this.field187 != null) {
            this.field186 = this.field187[0];
            for (int var3 = 0; var3 < 4096; var3++) {
                if (this.field187[var3] != this.field186) {
                    var2 = false;
                    break;
                }
            }
            if (var2) {
                this.field187 = null;
            }
        }
        if (arg0 <= 80) {
            field184 = null;
        }
    }

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 45)
    public static final void method80(int arg0, Component arg1) {
        arg1.removeMouseListener(class15.field233);
        arg1.removeMouseMotionListener(class15.field233);
        if (arg0 == 2) {
            arg1.removeFocusListener(class15.field233);
        }
    }

    @OriginalMember(owner = "mapview!e", name = "b", descriptor = "(I)V", line = 80)
    public static void method81(int arg0) {
        if (arg0 != -5300) {
            method82(-64, null);
        }
        field180 = null;
        field182 = null;
        field189 = null;
        field190 = null;
        field181 = null;
        field184 = null;
        field188 = null;
        field183 = null;
    }

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "(ILjava/lang/String;)Ln;", line = 100)
    public static final class26 method82(int arg0, String arg1) {
        byte[] var2 = arg1.getBytes();
        int var3 = 0;
        int var4 = var2.length;
        class26 var5 = new class26();
        if (arg0 != 255) {
            method82(-64, null);
        }
        var5.field354 = new byte[var4];
        while (var4 > var3) {
            int var6 = var2[var3++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var3 >= var4) {
                    break;
                }
                int var7 = var2[var3++] & 0xFF;
                var5.field354[var5.field347++] = (byte) (var6 * 43 + var7 - 48 - 1720);
            } else if (var6 != 0) {
                var5.field354[var5.field347++] = (byte) var6;
            }
        }
        var5.method200(-73);
        return var5.method193(-123);
    }

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "(II)I", line = 142)
    public static int method83(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "(IBILla;)Z", line = 153)
    public static final boolean method84(int arg0, byte arg1, int arg2, class23 arg3) {
        byte[] var4 = arg3.method165(-50, arg0, arg2);
        if (arg1 != -9) {
            method81(-23);
        }
        if (var4 == null) {
            return false;
        } else {
            class33.method226(var4, 0);
            return true;
        }
    }

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "(ILn;ILjava/awt/Color;)V", line = 189)
    public static final void method85(int arg0, class26 arg1, int arg2, Color arg3) {
        try {
            Graphics var4 = class4.field119.getGraphics();
            if (class21.field298 == null) {
                class21.field298 = new Font("Helvetica", 1, 13);
                class17.field250 = class4.field119.getFontMetrics(class21.field298);
            }
            if (class6.field149) {
                class6.field149 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, class14.field228, class16.field248);
            }
            if (arg3 == null) {
                arg3 = new Color(140, 17, 17);
            }
            try {
                if (class19.field264 == null) {
                    class19.field264 = class4.field119.createImage(304, 34);
                }
                if (arg2 != -19820) {
                    field188 = null;
                }
                Graphics var5 = class19.field264.getGraphics();
                var5.setColor(arg3);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var5.setFont(class21.field298);
                var5.setColor(Color.white);
                arg1.method181(var5, (304 - arg1.method199(arg2 + 3180, class17.field250)) / 2, 22, -1);
                var4.drawImage(class19.field264, class14.field228 / 2 - 152, class16.field248 / 2 + -18, null);
            } catch (Exception var10) {
                int var7 = class14.field228 / 2 - 152;
                int var8 = class16.field248 / 2 - 18;
                var4.setColor(arg3);
                var4.drawRect(var7, var8, 303, 33);
                var4.fillRect(var7 + 2, var8 - -2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var7 + 1, var8 - -1, 301, 31);
                var4.fillRect(arg0 * 3 + var7 + 2, var8 + 2, 300 - arg0 * 3, 30);
                var4.setFont(class21.field298);
                var4.setColor(Color.white);
                arg1.method181(var4, (304 - arg1.method199(-16640, class17.field250)) / 2 + var7, var8 + 22, -1);
            }
        } catch (Exception var11) {
            class4.field119.repaint();
        }
    }
}
