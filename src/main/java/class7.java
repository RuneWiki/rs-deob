import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!d")
public class class7 implements KeyListener, FocusListener {

    @OriginalMember(owner = "mapview!d", name = "d", descriptor = "Lna;")
    public static class26 field86 = class6.method40("Dungeon", 48);

    @OriginalMember(owner = "mapview!d", name = "c", descriptor = "Lna;")
    public static class26 field85 = class6.method40("(U", 48);

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "Lna;")
    public static class26 field83 = class6.method40("General Store", 48);

    @OriginalMember(owner = "mapview!d", name = "f", descriptor = "[[[[B")
    public static byte[][][][] field88 = new byte[5][][][];

    @OriginalMember(owner = "mapview!d", name = "e", descriptor = "I")
    public static int field87 = 0;

    @OriginalMember(owner = "mapview!d", name = "b", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "mapview!d", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 9)
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class8.field93 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class32.field414.length) {
                var3 = class32.field414[var2];
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
                var4 = class14.method83(-257, arg0);
            }
            if (class25.field363 >= 0 && var3 >= 0) {
                class14.field165[class25.field363] = var3;
                class25.field363 = class25.field363 + 1 & 0x7F;
                if (class33.field432 == class25.field363) {
                    class25.field363 = -1;
                }
            }
            if (var3 >= 0 || var4 >= 0) {
                int var5 = class31.field410 + 1 & 0x7F;
                if (class6.field69 != var5) {
                    class22.field224[class31.field410] = var3;
                    class12.field151[class31.field410] = var4;
                    class31.field410 = var5;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "mapview!d", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 77)
    public final void focusGained(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!d", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 89)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class8.field93 != null) {
            class25.field363 = -1;
        }
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(JB)V", line = 142)
    public static final void method46(long arg0, byte arg1) {
        try {
            if (arg1 > -67) {
                method47(-74, (byte) 71);
            }
            Thread.sleep(arg0);
        } catch (InterruptedException var4) {
        }
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(IB)Lna;", line = 166)
    public static final class26 method47(int arg0, byte arg1) {
        if (arg1 != -50) {
            method46(14L, (byte) -97);
        }
        return class9.method58(false, 10, arg1 - 19, arg0);
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(B)V", line = 191)
    public static void method48(byte arg0) {
        field88 = null;
        if (arg0 >= -52) {
            field85 = null;
        }
        field83 = null;
        field86 = null;
        field85 = null;
    }

    @OriginalMember(owner = "mapview!d", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 204)
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class8.field93 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class32.field414.length) {
                var3 = class32.field414[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class25.field363 >= 0 && var3 >= 0) {
                class14.field165[class25.field363] = ~var3;
                class25.field363 = class25.field363 + 1 & 0x7F;
                if (class33.field432 == class25.field363) {
                    class25.field363 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "mapview!d", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 238)
    public final void keyTyped(KeyEvent arg0) {
        arg0.consume();
    }

    @OriginalMember(owner = "mapview!d", name = "b", descriptor = "(B)B", line = 247)
    public static final byte method49(byte arg0) {
        if (arg0 <= 80) {
            method47(-119, (byte) 30);
        }
        return class4.field42 == null ? 0 : class4.field42[class20.field213];
    }
}
