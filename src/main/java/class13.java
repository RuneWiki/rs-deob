import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ga")
public class class13 implements KeyListener, FocusListener {

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "Lda;")
    public static class7 field116 = new class7();

    @OriginalMember(owner = "mapview!ga", name = "e", descriptor = "La;")
    public static class1 field120 = class3.method36("Bank", -99);

    @OriginalMember(owner = "mapview!ga", name = "d", descriptor = "I")
    public static int field119 = -1;

    @OriginalMember(owner = "mapview!ga", name = "c", descriptor = "La;")
    public static class1 field118 = class3.method36("fonts", -85);

    @OriginalMember(owner = "mapview!ga", name = "f", descriptor = "Loa;")
    public static class28 field121 = null;

    @OriginalMember(owner = "mapview!ga", name = "b", descriptor = "La;")
    public static class1 field117 = class3.method36("map", -112);

    @OriginalMember(owner = "mapview!ga", name = "g", descriptor = "La;")
    public static class1 field122 = class3.method36("Apothecary", -121);

    @OriginalMember(owner = "mapview!ga", name = "h", descriptor = "[[B")
    public static byte[][] field123;

    @OriginalMember(owner = "mapview!ga", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 6)
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class2.field13 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < class8.field87.length) {
            var3 = class8.field87[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class28.field396 >= 0 && var3 >= 0) {
            class30.field417[class28.field396] = var3;
            class28.field396 = class28.field396 + 1 & 0x7F;
            if (class5.field56 == class28.field396) {
                class28.field396 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class26.field366 + 1 & 0x7F;
            if (class27.field381 != var4) {
                class3.field32[class26.field366] = var3;
                class10.field108[class26.field366] = -1;
                class26.field366 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 67)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class2.field13 != null) {
            class28.field396 = -1;
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 84)
    public final void keyTyped(KeyEvent arg0) {
        if (class2.field13 != null) {
            int var2 = class27.method178(arg0, -103);
            if (var2 >= 0) {
                int var3 = class26.field366 + 1 & 0x7F;
                if (class27.field381 != var3) {
                    class3.field32[class26.field366] = -1;
                    class10.field108[class26.field366] = var2;
                    class26.field366 = var3;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "(I)V", line = 116)
    public static void method67(int arg0) {
        field117 = null;
        field123 = null;
        field120 = null;
        field116 = null;
        field122 = null;
        if (arg0 < -27) {
            field118 = null;
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "(B)V", line = 139)
    public static final void method68(byte arg0) {
        if (arg0 < 117) {
            method67(-57);
        }
        if (class2.field13 != null) {
            class13 var1 = class2.field13;
            synchronized (class2.field13) {
                class2.field13 = null;
            }
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 204)
    public final void focusGained(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ga", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 228)
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class2.field13 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class8.field87.length) {
                var3 = class8.field87[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class28.field396 >= 0 && var3 >= 0) {
                class30.field417[class28.field396] = ~var3;
                class28.field396 = class28.field396 + 1 & 0x7F;
                if (class5.field56 == class28.field396) {
                    class28.field396 = -1;
                }
            }
        }
        arg0.consume();
    }
}
