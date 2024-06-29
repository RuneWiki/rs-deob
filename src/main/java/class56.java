import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class56 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!b", name = "h", descriptor = "[I")
    public static int[] field814 = new int[2000];

    @OriginalMember(owner = "client!b", name = "j", descriptor = "I")
    public static int field816 = 0;

    @OriginalMember(owner = "client!b", name = "o", descriptor = "Ljava/lang/String;")
    public static String field821 = "Please wait - attempting to reestablish.";

    @OriginalMember(owner = "client!b", name = "a", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!b", name = "b", descriptor = "I")
    public static int field808;

    @OriginalMember(owner = "client!b", name = "f", descriptor = "I")
    public static int field812;

    @OriginalMember(owner = "client!b", name = "g", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!b", name = "i", descriptor = "I")
    public static int field815;

    @OriginalMember(owner = "client!b", name = "k", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!b", name = "m", descriptor = "I")
    public static int field819;

    @OriginalMember(owner = "client!b", name = "n", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!b", name = "p", descriptor = "I")
    public static int field822;

    @OriginalMember(owner = "client!b", name = "c", descriptor = "Lvl;")
    public static class73 field809;

    @OriginalMember(owner = "client!b", name = "e", descriptor = "Lvl;")
    public static class73 field811;

    @OriginalMember(owner = "client!b", name = "l", descriptor = "Lvl;")
    public static class73 field818;

    @OriginalMember(owner = "client!b", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field810;

    @OriginalMember(owner = "client!b", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        field813++;
        if (class205.field3214 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != '\u0000' && var2 != '\uFFFF' && class142.method921(var2, (byte) -21)) {
                int var3 = class313.field5015 + 1 & 0x7F;
                if (class293.field4699 != var3) {
                    class129.field1858[class313.field5015] = -1;
                    class257.field4194[class313.field5015] = var2;
                    class313.field5015 = var3;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!b", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        field807++;
        if (class205.field3214 == null) {
            return;
        }
        class8.field110 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < class18.field244.length) {
            var3 = class18.field244[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class235.field3802 >= 0 && var3 >= 0) {
            class16.field226[class235.field3802] = var3;
            class235.field3802 = class235.field3802 + 1 & 0x7F;
            if (class39.field475 == class235.field3802) {
                class235.field3802 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class313.field5015 + 1 & 0x7F;
            if (class293.field4699 != var4) {
                class129.field1858[class313.field5015] = var3;
                class257.field4194[class313.field5015] = '\u0000';
                class313.field5015 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!b", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field820++;
        if (class205.field3214 != null) {
            class8.field110 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class18.field244.length > var2) {
                var3 = class18.field244[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class235.field3802 >= 0 && var3 >= 0) {
                class16.field226[class235.field3802] = ~var3;
                class235.field3802 = class235.field3802 + 1 & 0x7F;
                if (class39.field475 == class235.field3802) {
                    class235.field3802 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V")
    public static void method363(int arg0) {
        field811 = null;
        field814 = null;
        field821 = null;
        field810 = null;
        if (arg0 != 22752) {
            field811 = null;
        }
        field809 = null;
        field818 = null;
    }

    @OriginalMember(owner = "client!b", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field819++;
        if (class205.field3214 != null) {
            class235.field3802 = -1;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lvl;IBI)[Lnj;")
    public static final class215[] method364(class73 arg0, int arg1, byte arg2, int arg3) {
        if (arg2 == -87) {
            field822++;
            return class135.method862(arg3, arg1, (byte) 121, arg0) ? class153.method1060((byte) 106) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!b", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field808++;
    }
}
