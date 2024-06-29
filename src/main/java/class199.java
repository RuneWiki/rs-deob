import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class199 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!q", name = "h", descriptor = "[I")
    public static int[] field3064 = new int[5];

    @OriginalMember(owner = "client!q", name = "k", descriptor = "I")
    public static int field3067 = 0;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "I")
    public static int field3057;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "I")
    public static int field3059;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "I")
    public static int field3060;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "I")
    public static int field3061;

    @OriginalMember(owner = "client!q", name = "f", descriptor = "I")
    public static int field3062;

    @OriginalMember(owner = "client!q", name = "g", descriptor = "I")
    public static int field3063;

    @OriginalMember(owner = "client!q", name = "i", descriptor = "I")
    public static int field3065;

    @OriginalMember(owner = "client!q", name = "j", descriptor = "I")
    public static int field3066;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V", line = 6)
    public static final void method1358(int arg0) {
        class207.field3153 = null;
        if (arg0 != -86) {
            field3064 = (int[]) null;
        }
        field3059++;
        class43.method335();
    }

    @OriginalMember(owner = "client!q", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 19)
    public final synchronized void keyReleased(KeyEvent arg0) {
        field3060++;
        if (class300.field4960 != null) {
            class230.field3639 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class347.field5563.length > var2) {
                var3 = class347.field5563[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class198.field3040 >= 0 && var3 >= 0) {
                class186.field2880[class198.field3040] = ~var3;
                class198.field3040 = class198.field3040 + 1 & 0x7F;
                if (class320.field5276 == class198.field3040) {
                    class198.field3040 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(B)V", line = 50)
    public static final void method1359(byte arg0) {
        if (arg0 != -22) {
            method1358(117);
        }
        class143.field2302.method644((byte) -125);
        class347.field5559.method644((byte) -104);
        field3065++;
    }

    @OriginalMember(owner = "client!q", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 64)
    public final void keyTyped(KeyEvent arg0) {
        if (class300.field4960 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != '\u0000' && var2 != '\uFFFF' && class313.method2212(0, var2)) {
                int var3 = class294.field4890 + 1 & 0x7F;
                if (class347.field5566 != var3) {
                    class5.field59[class294.field4890] = -1;
                    class339.field5459[class294.field4890] = var2;
                    class294.field4890 = var3;
                }
            }
        }
        field3061++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!q", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 93)
    public final void focusGained(FocusEvent arg0) {
        field3057++;
    }

    @OriginalMember(owner = "client!q", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 106)
    public final synchronized void keyPressed(KeyEvent arg0) {
        field3058++;
        if (class300.field4960 == null) {
            return;
        }
        class230.field3639 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < class347.field5563.length) {
            var3 = class347.field5563[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class198.field3040 >= 0 && var3 >= 0) {
            class186.field2880[class198.field3040] = var3;
            class198.field3040 = class198.field3040 + 1 & 0x7F;
            if (class320.field5276 == class198.field3040) {
                class198.field3040 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class294.field4890 + 1 & 0x7F;
            if (class347.field5566 != var4) {
                class5.field59[class294.field4890] = var3;
                class339.field5459[class294.field4890] = '\u0000';
                class294.field4890 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!q", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 163)
    public final synchronized void focusLost(FocusEvent arg0) {
        field3062++;
        if (class300.field4960 != null) {
            class198.field3040 = -1;
        }
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(I)V", line = 178)
    public static void method1360(int arg0) {
        field3064 = null;
        if (arg0 < 22) {
            method1358(110);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Lnm;Z)V", line = 188)
    public static final void method1361(class221 arg0, boolean arg1) {
        class320.field5278 = arg0;
        field3066++;
        if (!arg1) {
            method1359((byte) 97);
        }
    }

    @OriginalMember(owner = "client!q", name = "c", descriptor = "(I)V", line = 199)
    public static final void method1362(int arg0) {
        field3063++;
        class162.field2579.method31(false);
        class11.field121.method1354((byte) -116);
        if (arg0 != -1) {
            field3064 = (int[]) null;
        }
        class246.field3911.method1354((byte) -121);
    }
}
