import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class57 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
    public static int field1433 = -1;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "Lea;")
    public static class38 field1434 = class9.method46((byte) 110, "Zu viele Verbindungen von Ihrer Adresse)3");

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "Lea;")
    public static class38 field1436 = class9.method46((byte) 111, "Fps:");

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "Lea;")
    public static class38 field1435 = class9.method46((byte) 113, " steht bereits auf Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "I")
    public static int field1438;

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "I")
    public static int field1442;

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "Ljf;")
    public static class86 field1443;

    @OriginalMember(owner = "client!gb", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class94.field2113 != null) {
            class105.field2352 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class36.field766.length) {
                var3 = class36.field766[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            if (class29.field585 >= 0 && var3 >= 0) {
                class125.field2698[class29.field585] = var3;
                class29.field585 = class29.field585 + 1 & 0x7F;
                if (class29.field585 == class162.field3370) {
                    class29.field585 = -1;
                }
            }
            if (var3 >= 0) {
                int var4 = class100.field2243 + 1 & 0x7F;
                if (class136.field2858 != var4) {
                    class199.field3929[class100.field2243] = var3;
                    class178.field3601[class100.field2243] = -1;
                    class100.field2243 = var4;
                }
            }
            int var5 = arg0.getModifiers();
            if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
                arg0.consume();
            }
        }
        field1442++;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
    public static void method418(int arg0) {
        field1436 = null;
        field1443 = null;
        field1435 = null;
        if (arg0 != 0) {
            field1436 = null;
        }
        field1434 = null;
    }

    @OriginalMember(owner = "client!gb", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field1440++;
        if (class94.field2113 != null) {
            class29.field585 = -1;
        }
    }

    @OriginalMember(owner = "client!gb", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class94.field2113 != null) {
            class105.field2352 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class36.field766.length > var2) {
                var3 = class36.field766[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class29.field585 >= 0 && var3 >= 0) {
                class125.field2698[class29.field585] = ~var3;
                class29.field585 = class29.field585 + 1 & 0x7F;
                if (class29.field585 == class162.field3370) {
                    class29.field585 = -1;
                }
            }
        }
        field1441++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!gb", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        field1439++;
        if (class94.field2113 != null) {
            int var2 = class186.method1255(arg0, -15009);
            if (var2 >= 0) {
                int var3 = class100.field2243 + 1 & 0x7F;
                if (class136.field2858 != var3) {
                    class199.field3929[class100.field2243] = -1;
                    class178.field3601[class100.field2243] = var2;
                    class100.field2243 = var3;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!gb", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field1438++;
    }
}
