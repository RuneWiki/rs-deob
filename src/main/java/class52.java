import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class52 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "[I")
    public static int[] field655 = new int[14];

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "I")
    public static int field659 = -1;

    @OriginalMember(owner = "client!fg", name = "l", descriptor = "I")
    public static int field665 = 0;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "I")
    public static int field654;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!fg", name = "j", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!fg", name = "k", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!fg", name = "i", descriptor = "Lug;")
    public static class253 field662;

    @OriginalMember(owner = "client!fg", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 13)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class81.field1099 != null) {
            class279.field4301 = -1;
        }
        field664++;
    }

    @OriginalMember(owner = "client!fg", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 30)
    public final synchronized void keyReleased(KeyEvent arg0) {
        field663++;
        if (class81.field1099 != null) {
            class238.field3732 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class249.field3923.length > var2) {
                var3 = class249.field3923[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class279.field4301 >= 0 && var3 >= 0) {
                class4.field36[class279.field4301] = ~var3;
                class279.field4301 = class279.field4301 + 1 & 0x7F;
                if (class42.field577 == class279.field4301) {
                    class279.field4301 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V", line = 67)
    public static void method378(int arg0) {
        field655 = null;
        if (arg0 != -5201) {
            field661 = 100;
        }
        field662 = null;
    }

    @OriginalMember(owner = "client!fg", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 78)
    public final void keyTyped(KeyEvent arg0) {
        if (class81.field1099 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != '\u0000' && var2 != '\uFFFF' && class301.method2087(var2, 123)) {
                int var3 = class328.field5143 + 1 & 0x7F;
                if (class113.field1590 != var3) {
                    class125.field1800[class328.field5143] = -1;
                    class64.field930[class328.field5143] = var2;
                    class328.field5143 = var3;
                }
            }
        }
        field654++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Z)V", line = 108)
    public static final void method379(boolean arg0) {
        field660++;
        if (class3.field26) {
            class327.field5128 = null;
            class344.field5342 = null;
            class3.field26 = arg0;
        }
    }

    @OriginalMember(owner = "client!fg", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 128)
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class81.field1099 != null) {
            class238.field3732 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class249.field3923.length > var2) {
                var3 = class249.field3923[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            if (class279.field4301 >= 0 && var3 >= 0) {
                class4.field36[class279.field4301] = var3;
                class279.field4301 = class279.field4301 + 1 & 0x7F;
                if (class42.field577 == class279.field4301) {
                    class279.field4301 = -1;
                }
            }
            if (var3 >= 0) {
                int var4 = class328.field5143 + 1 & 0x7F;
                if (class113.field1590 != var4) {
                    class125.field1800[class328.field5143] = var3;
                    class64.field930[class328.field5143] = '\u0000';
                    class328.field5143 = var4;
                }
            }
            int var5 = arg0.getModifiers();
            if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
                arg0.consume();
            }
        }
        field656++;
    }

    @OriginalMember(owner = "client!fg", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 185)
    public final void focusGained(FocusEvent arg0) {
        field658++;
    }
}
