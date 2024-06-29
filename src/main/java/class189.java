import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class189 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "Lok;")
    public static class41 field3065 = class137.method956("gelb:", 45);

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "Lok;")
    public static class41 field3067 = class137.method956("Eingabeprozedur geladen)3", 45);

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "[S")
    public static short[] field3069 = new short[256];

    @OriginalMember(owner = "client!lk", name = "i", descriptor = "Lok;")
    public static class41 field3071 = class137.method956("::wm3", 45);

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "I")
    public static int field3063;

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "I")
    public static int field3064;

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "I")
    public static int field3066;

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "I")
    public static int field3068;

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "I")
    public static int field3070;

    @OriginalMember(owner = "client!lk", name = "j", descriptor = "I")
    public static int field3072;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V", line = 39)
    public static void method1354(int arg0) {
        field3069 = null;
        if (arg0 == -21388) {
            field3067 = null;
            field3071 = null;
            field3065 = null;
        }
    }

    @OriginalMember(owner = "client!lk", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 61)
    public final synchronized void keyPressed(KeyEvent arg0) {
        field3063++;
        if (class248.field3960 == null) {
            return;
        }
        class144.field2198 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < class195.field3156.length) {
            var3 = class195.field3156[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class308.field5190 >= 0 && var3 >= 0) {
            class230.field3645[class308.field5190] = var3;
            class308.field5190 = class308.field5190 + 1 & 0x7F;
            if (class308.field5190 == class195.field3143) {
                class308.field5190 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class18.field236 + 1 & 0x7F;
            if (class308.field5188 != var4) {
                class10.field132[class18.field236] = var3;
                class232.field3671[class18.field236] = -1;
                class18.field236 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!lk", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 120)
    public final void focusGained(FocusEvent arg0) {
        field3066++;
    }

    @OriginalMember(owner = "client!lk", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 128)
    public final synchronized void focusLost(FocusEvent arg0) {
        field3070++;
        if (class248.field3960 != null) {
            class308.field5190 = -1;
        }
    }

    @OriginalMember(owner = "client!lk", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 148)
    public final void keyTyped(KeyEvent arg0) {
        if (class248.field3960 != null) {
            int var2 = class116.method826(0, arg0);
            if (var2 >= 0) {
                int var3 = class18.field236 + 1 & 0x7F;
                if (class308.field5188 != var3) {
                    class10.field132[class18.field236] = -1;
                    class232.field3671[class18.field236] = var2;
                    class18.field236 = var3;
                }
            }
        }
        field3072++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lbc;I)Z", line = 246)
    public static final boolean method1355(class302 arg0, int arg1) {
        field3064++;
        if (arg0.field4924 == 205) {
            class48.field742 = 250;
            return true;
        } else {
            return arg1 != -31196;
        }
    }

    @OriginalMember(owner = "client!lk", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 276)
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class248.field3960 != null) {
            class144.field2198 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class195.field3156.length > var2) {
                var3 = class195.field3156[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class308.field5190 >= 0 && var3 >= 0) {
                class230.field3645[class308.field5190] = ~var3;
                class308.field5190 = class308.field5190 + 1 & 0x7F;
                if (class308.field5190 == class195.field3143) {
                    class308.field5190 = -1;
                }
            }
        }
        field3068++;
        arg0.consume();
    }
}
