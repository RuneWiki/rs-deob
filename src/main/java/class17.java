import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ia")
public class class17 implements KeyListener, FocusListener {

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "Lt;")
    private static class31 field145 = class14.method84(113, "Crafting Shop");

    @OriginalMember(owner = "mapview!ia", name = "d", descriptor = "Lt;")
    private static class31 field148 = class14.method84(109, "Estate Agent");

    @OriginalMember(owner = "mapview!ia", name = "c", descriptor = "Lt;")
    public static class31 field147 = class14.method84(121, "details)3dat");

    @OriginalMember(owner = "mapview!ia", name = "e", descriptor = "Lt;")
    public static class31 field149 = class14.method84(109, "50(U");

    @OriginalMember(owner = "mapview!ia", name = "g", descriptor = "Z")
    public static boolean field151 = true;

    @OriginalMember(owner = "mapview!ia", name = "f", descriptor = "Lt;")
    private static class31 field150 = class14.method84(115, "General Store");

    @OriginalMember(owner = "mapview!ia", name = "b", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "mapview!ia", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 6)
    public final void focusGained(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(B)Lla;", line = 12)
    public static final class22 method97(byte arg0) {
        try {
            return arg0 == -112 ? (class22) Class.forName("e").getDeclaredConstructor().newInstance() : (class22) null;
        } catch (Throwable var2) {
            return new class1();
        }
    }

    @OriginalMember(owner = "mapview!ia", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 28)
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class11.field78 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class22.field186.length > var2) {
                var3 = class22.field186[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class28.field316 >= 0 && var3 >= 0) {
                class18.field154[class28.field316] = ~var3;
                class28.field316 = class28.field316 + 1 & 0x7F;
                if (class28.field316 == class14.field104) {
                    class28.field316 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "mapview!ia", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 76)
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class11.field78 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class22.field186.length) {
                var3 = class22.field186[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            int var4;
            if (var3 == 85 || var3 == 80 || var3 == 84 || var3 == 0 || var3 == 101) {
                var4 = -1;
            } else {
                var4 = class27.method170(arg0, 9);
            }
            if (class28.field316 >= 0 && var3 >= 0) {
                class18.field154[class28.field316] = var3;
                class28.field316 = class28.field316 + 1 & 0x7F;
                if (class28.field316 == class14.field104) {
                    class28.field316 = -1;
                }
            }
            if (var3 >= 0 || var4 >= 0) {
                int var5 = class6.field57 + 1 & 0x7F;
                if (class1.field4 != var5) {
                    class7.field65[class6.field57] = var3;
                    class20.field179[class6.field57] = var4;
                    class6.field57 = var5;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(I)V", line = 178)
    public static void method98(int arg0) {
        field149 = null;
        field147 = null;
        field148 = null;
        field145 = null;
        field150 = null;
        if (arg0 > -52) {
            method97((byte) -87);
        }
    }

    @OriginalMember(owner = "mapview!ia", name = "b", descriptor = "(I)[Lt;", line = 217)
    public static final class31[] method99(int arg0) {
        if (arg0 != 0) {
            field146 = 101;
        }
        return new class31[] { field150, class4.field26, class14.field103, class22.field185, class18.field162, class19.field165, mapview.field254, class1.field11, class14.field108, class12.field91, class22.field187, class30.field323, class14.field105, class7.field60, class18.field161, class26.field296, class18.field153, class30.field333, class11.field87, class18.field158, class34.field369, class19.field166, class20.field172, field145, class22.field189, class28.field315, class27.field305, class19.field170, class7.field61, class6.field44, class23.field200, class23.field196, class33.field352, class26.field297, class18.field155, class27.field308, class7.field62, class6.field50, class27.field306, class11.field84, class31.field337, class11.field83, mapview.field272, class7.field63, class1.field15, class22.field188, class4.field31, class22.field192, class1.field7, class12.field96, class27.field311, class19.field169, class24.field206, class26.field292, class26.field299, class33.field349, class18.field157, class20.field175, class6.field59, class26.field294, class34.field362, class28.field314, class26.field293, class25.field287, class25.field287, class25.field287, class25.field287, field148, class26.field304, class11.field80 };
    }

    @OriginalMember(owner = "mapview!ia", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 253)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class11.field78 != null) {
            class28.field316 = -1;
        }
    }

    @OriginalMember(owner = "mapview!ia", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 269)
    public final void keyTyped(KeyEvent arg0) {
        arg0.consume();
    }
}
