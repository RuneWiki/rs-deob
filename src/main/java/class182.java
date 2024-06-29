import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class182 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
    public static int field2892 = -1;

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "I")
    public static int field2898 = 0;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "I")
    public static int field2893;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
    public static int field2894;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "I")
    public static int field2896;

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "I")
    public static int field2899;

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "I")
    public static int field2901;

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "I")
    public static int field2902;

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "I")
    public static int field2903;

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "Leh;")
    public static class137 field2897;

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "Lvl;")
    public static class6 field2900;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILeh;)V")
    public static final void method1266(int arg0, class137 arg1) {
        field2899++;
        if (arg0 != 26931) {
            field2892 = 15;
        }
        class117.field1655 = arg1.method929((byte) -83, "runes");
    }

    @OriginalMember(owner = "client!qe", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field2896++;
    }

    @OriginalMember(owner = "client!qe", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class118.field1671 != null) {
            class147.field2312 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class271.field4334.length) {
                var3 = class271.field4334[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class275.field4389 >= 0 && var3 >= 0) {
                class88.field1092[class275.field4389] = ~var3;
                class275.field4389 = class275.field4389 + 1 & 0x7F;
                if (class275.field4389 == class252.field4113) {
                    class275.field4389 = -1;
                }
            }
        }
        field2891++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!qe", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class118.field1671 != null) {
            class275.field4389 = -1;
        }
        field2894++;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V")
    public static void method1267(int arg0) {
        field2900 = null;
        if (arg0 <= 110) {
            method1267(-42);
        }
        field2897 = null;
    }

    @OriginalMember(owner = "client!qe", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        if (class118.field1671 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != '\u0000' && var2 != '\uFFFF' && class56.method324((byte) 67, var2)) {
                int var3 = class157.field2532 + 1 & 0x7F;
                if (class157.field2533 != var3) {
                    class105.field1408[class157.field2532] = -1;
                    class238.field3929[class157.field2532] = var2;
                    class157.field2532 = var3;
                }
            }
        }
        arg0.consume();
        field2903++;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(I)V")
    public static final void method1268(int arg0) {
        class36.field463.method1699(0);
        if (arg0 == 1) {
            field2893++;
            class36.field466.method1699(0);
        }
    }

    @OriginalMember(owner = "client!qe", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class118.field1671 != null) {
            class147.field2312 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class271.field4334.length > var2) {
                var3 = class271.field4334[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            if (class275.field4389 >= 0 && var3 >= 0) {
                class88.field1092[class275.field4389] = var3;
                class275.field4389 = class275.field4389 + 1 & 0x7F;
                if (class275.field4389 == class252.field4113) {
                    class275.field4389 = -1;
                }
            }
            if (var3 >= 0) {
                int var4 = class157.field2532 + 1 & 0x7F;
                if (class157.field2533 != var4) {
                    class105.field1408[class157.field2532] = var3;
                    class238.field3929[class157.field2532] = '\u0000';
                    class157.field2532 = var4;
                }
            }
            int var5 = arg0.getModifiers();
            if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
                arg0.consume();
            }
        }
        field2901++;
    }
}
