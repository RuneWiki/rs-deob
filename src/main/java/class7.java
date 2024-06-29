import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!da")
public class class7 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "mapview!da", name = "c", descriptor = "La;")
    public static class1 field71 = class3.method36("Mining Site", -84);

    @OriginalMember(owner = "mapview!da", name = "d", descriptor = "La;")
    public static class1 field72 = class3.method36("Requesting", -127);

    @OriginalMember(owner = "mapview!da", name = "e", descriptor = "La;")
    public static class1 field73 = class3.method36("Woodcutting stump", -106);

    @OriginalMember(owner = "mapview!da", name = "b", descriptor = "I")
    public static int field70 = 0;

    @OriginalMember(owner = "mapview!da", name = "f", descriptor = "Lv;")
    public static class40 field74;

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "[I")
    public static int[] field69;

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(B)I", line = 8)
    public static final int method50(byte arg0) {
        int var1 = 104 % ((13 - arg0) / 51);
        if (class33.field464 == null) {
            return 0;
        } else if (class33.field464.field509 == null) {
            return field69[class33.field464.field517 & 0xFF];
        } else {
            return field69[class33.field464.field509[class5.field47] & 0xFF];
        }
    }

    @OriginalMember(owner = "mapview!da", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 25)
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class13.field116 != null) {
            class27.field380 = arg0.getX();
            class40.field516 = arg0.getY();
            if (arg0.isMetaDown()) {
                class5.field49 = 2;
                class41.field521 = 2;
            } else {
                class5.field49 = 1;
                class41.field521 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!da", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 69)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class13.field116 != null) {
            class41.field521 = 0;
        }
    }

    @OriginalMember(owner = "mapview!da", name = "b", descriptor = "(B)[Lu;", line = 86)
    public static final class38[] method51(byte arg0) {
        if (arg0 != 47) {
            method50((byte) 69);
        }
        class38[] var1 = new class38[class30.field409];
        for (int var2 = 0; var2 < class30.field409; var2++) {
            class38 var3 = new class38();
            var3.field489 = class2.field22[var2];
            var3.field486 = class30.field411[var2];
            var3.field490 = class29.field403[var2];
            var3.field487 = class30.field410[var2];
            byte[] var4 = class13.field123[var2];
            int var5 = var3.field490 * var3.field487;
            var3.field488 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                var3.field488[var6] = class27.field378[mapview.method165(var4[var6], 255)];
            }
            var1[var2] = var3;
        }
        class25.method171((byte) 122);
        return var1;
    }

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 131)
    public static final void method52(Component arg0, byte arg1) {
        arg0.removeKeyListener(class2.field13);
        if (arg1 < 19) {
            method51((byte) -100);
        }
        arg0.removeFocusListener(class2.field13);
        class28.field396 = -1;
    }

    @OriginalMember(owner = "mapview!da", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 143)
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class13.field116 != null) {
            class26.field372 = -1;
            class33.field451 = -1;
        }
    }

    @OriginalMember(owner = "mapview!da", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 163)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class13.field116 != null) {
            class26.field372 = arg0.getX();
            class33.field451 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!da", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 181)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class13.field116 != null) {
            class26.field372 = arg0.getX();
            class33.field451 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!da", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 201)
    public final void focusGained(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!da", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 204)
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!da", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 217)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class13.field116 != null) {
            class41.field521 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!da", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 237)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class13.field116 != null) {
            class26.field372 = arg0.getX();
            class33.field451 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(I)V", line = 260)
    public static void method53(int arg0) {
        field69 = null;
        field72 = null;
        if (arg0 != 6454) {
            field74 = null;
        }
        field71 = null;
        field74 = null;
        field73 = null;
    }
}
