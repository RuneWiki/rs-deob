import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class106 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!el", name = "e", descriptor = "J")
    public static long field1847 = 0L;

    @OriginalMember(owner = "client!el", name = "c", descriptor = "I")
    public static int field1845 = 0;

    @OriginalMember(owner = "client!el", name = "k", descriptor = "[Lfd;")
    public static class219[] field1853 = new class219[0];

    @OriginalMember(owner = "client!el", name = "a", descriptor = "I")
    public static int field1843;

    @OriginalMember(owner = "client!el", name = "b", descriptor = "I")
    public static int field1844;

    @OriginalMember(owner = "client!el", name = "d", descriptor = "I")
    public static int field1846;

    @OriginalMember(owner = "client!el", name = "g", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!el", name = "h", descriptor = "I")
    public static int field1850;

    @OriginalMember(owner = "client!el", name = "j", descriptor = "I")
    public static int field1852;

    @OriginalMember(owner = "client!el", name = "f", descriptor = "Lwk;")
    public static class157 field1848;

    @OriginalMember(owner = "client!el", name = "i", descriptor = "[[B")
    public static byte[][] field1851;

    @OriginalMember(owner = "client!el", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field1852++;
    }

    @OriginalMember(owner = "client!el", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        field1849++;
        if (class170.field2750 == null) {
            return;
        }
        class76.field1044 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < class274.field4420.length) {
            var3 = class274.field4420[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class253.field4046 >= 0 && var3 >= 0) {
            class241.field3873[class253.field4046] = var3;
            class253.field4046 = class253.field4046 + 1 & 0x7F;
            if (class253.field4046 == field1845) {
                class253.field4046 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class67.field946 + 1 & 0x7F;
            if (class64.field899 != var4) {
                class52.field727[class67.field946] = var3;
                class28.field332[class67.field946] = '\u0000';
                class67.field946 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!el", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class170.field2750 != null) {
            class253.field4046 = -1;
        }
        field1846++;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V")
    public static void method781(int arg0) {
        field1848 = null;
        if (arg0 != -1) {
            method781(119);
        }
        field1853 = null;
        field1851 = null;
    }

    @OriginalMember(owner = "client!el", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        field1843++;
        if (class170.field2750 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != '\u0000' && var2 != '\uFFFF' && class260.method1709((byte) -78, var2)) {
                int var3 = class67.field946 + 1 & 0x7F;
                if (class64.field899 != var3) {
                    class52.field727[class67.field946] = -1;
                    class28.field332[class67.field946] = var2;
                    class67.field946 = var3;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Z)V")
    public static final void method782(boolean arg0) {
        field1850++;
        if (arg0) {
            field1848 = null;
        }
        if (class274.field4425 == 5) {
            class274.field4425 = 6;
        }
    }

    @OriginalMember(owner = "client!el", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field1844++;
        if (class170.field2750 != null) {
            class76.field1044 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class274.field4420.length) {
                var3 = class274.field4420[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class253.field4046 >= 0 && var3 >= 0) {
                class241.field3873[class253.field4046] = ~var3;
                class253.field4046 = class253.field4046 + 1 & 0x7F;
                if (class253.field4046 == field1845) {
                    class253.field4046 = -1;
                }
            }
        }
        arg0.consume();
    }
}
