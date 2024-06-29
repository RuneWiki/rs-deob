import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!e")
public class class9 extends class30 {

    @OriginalMember(owner = "mapview!e", name = "m", descriptor = "Lu;")
    public static class38 field84 = class28.method177("(U", (byte) -84);

    @OriginalMember(owner = "mapview!e", name = "n", descriptor = "Lu;")
    public static class38 field85 = class28.method177("Vegetable Store", (byte) -84);

    @OriginalMember(owner = "mapview!e", name = "r", descriptor = "Z")
    public static volatile boolean field89 = true;

    @OriginalMember(owner = "mapview!e", name = "s", descriptor = "Lu;")
    public static class38 field90 = class28.method177("map", (byte) -84);

    @OriginalMember(owner = "mapview!e", name = "q", descriptor = "Lu;")
    public static class38 field88 = class28.method177("Water Source", (byte) -84);

    @OriginalMember(owner = "mapview!e", name = "p", descriptor = "Lka;")
    public static class22 field87 = new class22();

    @OriginalMember(owner = "mapview!e", name = "t", descriptor = "I")
    public static volatile int field91 = 0;

    @OriginalMember(owner = "mapview!e", name = "u", descriptor = "I")
    public static int field92 = 0;

    @OriginalMember(owner = "mapview!e", name = "o", descriptor = "Ljava/lang/String;")
    public static String field86;

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "(I)Z", line = 5)
    public static final boolean method46(int arg0) {
        class11 var1 = class29.field364;
        synchronized (class29.field364) {
            if (arg0 > -12) {
                return true;
            } else if (class19.field191 == class11.field102) {
                return false;
            } else {
                class38.field489 = class29.field369[class11.field102];
                class3.field26 = class28.field351[class11.field102];
                class11.field102 = class11.field102 + 1 & 0x7F;
                return true;
            }
        }
    }

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "(Z)V", line = 46)
    public static void method47(boolean arg0) {
        field90 = null;
        field86 = null;
        field87 = null;
        field85 = null;
        if (!arg0) {
            field85 = null;
        }
        field88 = null;
        field84 = null;
    }

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "(Lu;Ljava/awt/Color;II)V", line = 75)
    public static final void method48(class38 arg0, Color arg1, int arg2, int arg3) {
        try {
            Graphics var4 = class3.field36.getGraphics();
            if (class20.field207 == null) {
                class20.field207 = new Font("Helvetica", 1, 13);
                class37.field473 = class3.field36.getFontMetrics(class20.field207);
            }
            if (field89) {
                field89 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, class3.field34, class4.field46);
            }
            if (arg1 == null) {
                arg1 = new Color(140, 17, 17);
            }
            try {
                if (class34.field431 == null) {
                    class34.field431 = class3.field36.createImage(304, 34);
                }
                Graphics var5 = class34.field431.getGraphics();
                var5.setColor(arg1);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg3 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg3 * 3 + 2, 2, 300 - arg2 * arg3, 30);
                var5.setFont(class20.field207);
                var5.setColor(Color.white);
                arg0.method237(var5, false, (304 - arg0.method238(class37.field473, true)) / 2, 22);
                var4.drawImage(class34.field431, class3.field34 / 2 - 152, class4.field46 / 2 + -18, null);
            } catch (Exception var10) {
                int var7 = class3.field34 / 2 - 152;
                int var8 = class4.field46 / 2 - 18;
                var4.setColor(arg1);
                var4.drawRect(var7, var8, 303, 33);
                var4.fillRect(var7 + 2, var8 + 2, arg3 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var7 + 1, var8 + 1, 301, 31);
                var4.fillRect(arg3 * 3 + var7 + 2, var8 + 2, 300 - arg3 * 3, 30);
                var4.setFont(class20.field207);
                var4.setColor(Color.white);
                arg0.method237(var4, false, (304 - arg0.method238(class37.field473, true)) / 2 + var7, var8 - -22);
            }
        } catch (Exception var11) {
            class3.field36.repaint();
        }
    }
}
