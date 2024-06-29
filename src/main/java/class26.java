import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class26 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "Lhi;")
    public static class82 field347 = class95.method664((byte) -112, "Lade Liste der Welten");

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "Lhi;")
    public static class82 field346 = class95.method664((byte) -61, "(U4");

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "Lhi;")
    public static class82 field348 = class95.method664((byte) -65, ")3)3)3");

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
    public static int field349;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "I")
    public static int field351;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
    public static int field353;

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!ha", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 21)
    public final synchronized void keyReleased(KeyEvent arg0) {
        field354++;
        if (class67.field1046 != null) {
            class135.field2332 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class267.field4541.length) {
                var3 = class267.field4541[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class67.field1044 >= 0 && var3 >= 0) {
                class309.field5261[class67.field1044] = ~var3;
                class67.field1044 = class67.field1044 + 1 & 0x7F;
                if (class67.field1044 == class50.field814) {
                    class67.field1044 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!ha", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 74)
    public final synchronized void keyPressed(KeyEvent arg0) {
        field345++;
        if (class67.field1046 == null) {
            return;
        }
        class135.field2332 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < class267.field4541.length) {
            var3 = class267.field4541[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class67.field1044 >= 0 && var3 >= 0) {
            class309.field5261[class67.field1044] = var3;
            class67.field1044 = class67.field1044 + 1 & 0x7F;
            if (class67.field1044 == class50.field814) {
                class67.field1044 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class187.field3142 + 1 & 0x7F;
            if (class144.field2465 != var4) {
                class300.field5089[class187.field3142] = var3;
                class92.field1650[class187.field3142] = -1;
                class187.field3142 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ha", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 149)
    public final void focusGained(FocusEvent arg0) {
        field350++;
    }

    @OriginalMember(owner = "client!ha", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 158)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class67.field1046 != null) {
            class67.field1044 = -1;
        }
        field353++;
    }

    @OriginalMember(owner = "client!ha", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 193)
    public final void keyTyped(KeyEvent arg0) {
        field352++;
        if (class67.field1046 != null) {
            int var2 = class260.method1849(116, arg0);
            if (var2 >= 0) {
                int var3 = class187.field3142 + 1 & 0x7F;
                if (class144.field2465 != var3) {
                    class300.field5089[class187.field3142] = -1;
                    class92.field1650[class187.field3142] = var2;
                    class187.field3142 = var3;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V", line = 236)
    public static void method167(int arg0) {
        field348 = null;
        if (arg0 != 0) {
            field346 = (class82) null;
        }
        field346 = null;
        field347 = null;
    }
}
