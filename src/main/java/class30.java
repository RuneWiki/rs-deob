import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!pa")
public class class30 implements KeyListener, FocusListener {

    @OriginalMember(owner = "mapview!pa", name = "b", descriptor = "Lna;")
    public static class26 field454 = class33.method219("Suchen", 82);

    @OriginalMember(owner = "mapview!pa", name = "d", descriptor = "Lna;")
    public static class26 field456 = class33.method219("fonts", 102);

    @OriginalMember(owner = "mapview!pa", name = "c", descriptor = "Lna;")
    public static class26 field455 = class33.method219("Furnace", 80);

    @OriginalMember(owner = "mapview!pa", name = "e", descriptor = "Z")
    public static volatile boolean field457 = false;

    @OriginalMember(owner = "mapview!pa", name = "f", descriptor = "Lna;")
    public static class26 field458 = class33.method219("(U", 78);

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "[Laa;")
    public static class1[] field453;

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(ZILp;I)[Lea;", line = 14)
    public static final class9[] method208(boolean arg0, int arg1, class29 arg2, int arg3) {
        if (arg0) {
            return class33.method222(-85, arg3, arg1, arg2) ? class11.method55(0) : null;
        } else {
            return (class9[]) null;
        }
    }

    @OriginalMember(owner = "mapview!pa", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 43)
    public final void focusGained(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!pa", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 101)
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class10.field95 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class26.field400.length > var2) {
                var3 = class26.field400[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class15.field155 >= 0 && var3 >= 0) {
                class40.field526[class15.field155] = ~var3;
                class15.field155 = class15.field155 + 1 & 0x7F;
                if (class39.field515 == class15.field155) {
                    class15.field155 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "mapview!pa", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 134)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class10.field95 != null) {
            class15.field155 = -1;
        }
    }

    @OriginalMember(owner = "mapview!pa", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 164)
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class10.field95 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < class26.field400.length) {
            var3 = class26.field400[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class15.field155 >= 0 && var3 >= 0) {
            class40.field526[class15.field155] = var3;
            class15.field155 = class15.field155 + 1 & 0x7F;
            if (class39.field515 == class15.field155) {
                class15.field155 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class18.field166 + 1 & 0x7F;
            if (class21.field228 != var4) {
                class12.field120[class18.field166] = var3;
                class8.field83[class18.field166] = -1;
                class18.field166 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!pa", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 229)
    public final void keyTyped(KeyEvent arg0) {
        if (class10.field95 != null) {
            int var2 = class33.method221(128, arg0);
            if (var2 >= 0) {
                int var3 = class18.field166 + 1 & 0x7F;
                if (class21.field228 != var3) {
                    class12.field120[class18.field166] = -1;
                    class8.field83[class18.field166] = var2;
                    class18.field166 = var3;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(B)V", line = 271)
    public static void method209(byte arg0) {
        field456 = null;
        int var1 = 48 % ((12 - arg0) / 48);
        field458 = null;
        field455 = null;
        field453 = null;
        field454 = null;
    }
}
