import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class196 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "Ljd;")
    private static class92 field3823 = class202.method1325((byte) 90, "To play on this world move to a free area first)3");

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "I")
    public static int field3825 = 2;

    @OriginalMember(owner = "client!uh", name = "k", descriptor = "Ljd;")
    public static class92 field3830 = field3823;

    @OriginalMember(owner = "client!uh", name = "l", descriptor = "Ljd;")
    private static class92 field3831 = class202.method1325((byte) 90, "glow1:");

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "Ljd;")
    public static class92 field3822 = field3831;

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "Ljd;")
    public static class92 field3827 = field3831;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "I")
    public static int field3821;

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "I")
    public static int field3824;

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "I")
    public static int field3829;

    @OriginalMember(owner = "client!uh", name = "m", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!uh", name = "n", descriptor = "I")
    public static int field3833;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)I")
    public static int method1301(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IZ)Z")
    public static final boolean method1302(int arg0, boolean arg1) {
        if (arg1) {
            field3826++;
            return (arg0 >> 30 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!uh", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        if (class79.field1617 != null) {
            int var2 = class189.method1214(11933, arg0);
            if (var2 >= 0) {
                int var3 = class147.field2918 + 1 & 0x7F;
                if (class193.field3773 != var3) {
                    class18.field453[class147.field2918] = -1;
                    class114.field2294[class147.field2918] = var2;
                    class147.field2918 = var3;
                }
            }
        }
        arg0.consume();
        field3821++;
    }

    @OriginalMember(owner = "client!uh", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        field3829++;
        if (class79.field1617 == null) {
            return;
        }
        class5.field278 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && class162.field3186.length > var2) {
            var3 = class162.field3186[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class77.field1596 >= 0 && var3 >= 0) {
            class28.field631[class77.field1596] = var3;
            class77.field1596 = class77.field1596 + 1 & 0x7F;
            if (class77.field1596 == class207.field3989) {
                class77.field1596 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class147.field2918 + 1 & 0x7F;
            if (class193.field3773 != var4) {
                class18.field453[class147.field2918] = var3;
                class114.field2294[class147.field2918] = -1;
                class147.field2918 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!uh", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field3832++;
        if (class79.field1617 != null) {
            class5.field278 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class162.field3186.length > var2) {
                var3 = class162.field3186[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class77.field1596 >= 0 && var3 >= 0) {
                class28.field631[class77.field1596] = ~var3;
                class77.field1596 = class77.field1596 + 1 & 0x7F;
                if (class77.field1596 == class207.field3989) {
                    class77.field1596 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V")
    public static void method1303(int arg0) {
        field3823 = null;
        if (arg0 != -1) {
            method1302(-77, false);
        }
        field3830 = null;
        field3822 = null;
        field3831 = null;
        field3827 = null;
    }

    @OriginalMember(owner = "client!uh", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class79.field1617 != null) {
            class77.field1596 = -1;
        }
        field3820++;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(II[II)I")
    public static final int method1304(int arg0, int arg1, int[] arg2, int arg3) {
        int var4 = 112 / ((4 - arg3) / 58);
        field3828++;
        return arg2[1] * arg0 + arg2[0] * arg1;
    }

    @OriginalMember(owner = "client!uh", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field3824++;
    }
}
