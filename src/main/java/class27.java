import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class27 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "[Leh;")
    public static class47[] field518 = new class47[1000];

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "I")
    public static int field524 = 0;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "Lpa;")
    public static class136 field521 = new class136(64);

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "I")
    public static int field526;

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "I")
    public static int field527;

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!cf", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field517++;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
    public static void method247(int arg0) {
        field518 = null;
        field521 = null;
        if (arg0 != 15164) {
            field521 = null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field519++;
        if (class147.field2881 != null) {
            class106.field2216 = -1;
        }
    }

    @OriginalMember(owner = "client!cf", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        field523++;
        if (class147.field2881 != null) {
            int var2 = class199.method1307(-116, arg0);
            if (var2 >= 0) {
                int var3 = class61.field1269 + 1 & 0x7F;
                if (class153.field3008 != var3) {
                    class182.field3493[class61.field1269] = -1;
                    class114.field2308[class61.field1269] = var2;
                    class61.field1269 = var3;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IZ)Z")
    public static final boolean method248(int arg0, boolean arg1) {
        field528++;
        if (arg1) {
            field520 = -102;
        }
        return (arg0 >> 20 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!cf", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field527++;
        if (class147.field2881 != null) {
            class162.field3160 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class68.field1506.length > var2) {
                var3 = class68.field1506[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class106.field2216 >= 0 && var3 >= 0) {
                class149.field2915[class106.field2216] = ~var3;
                class106.field2216 = class106.field2216 + 1 & 0x7F;
                if (class82.field1758 == class106.field2216) {
                    class106.field2216 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!cf", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        field526++;
        if (class147.field2881 == null) {
            return;
        }
        class162.field3160 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < class68.field1506.length) {
            var3 = class68.field1506[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class106.field2216 >= 0 && var3 >= 0) {
            class149.field2915[class106.field2216] = var3;
            class106.field2216 = class106.field2216 + 1 & 0x7F;
            if (class82.field1758 == class106.field2216) {
                class106.field2216 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class61.field1269 + 1 & 0x7F;
            if (class153.field3008 != var4) {
                class182.field3493[class61.field1269] = var3;
                class114.field2308[class61.field1269] = -1;
                class61.field1269 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIII)V")
    public static final void method249(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = 0; var5 < class3.field39; var5++) {
            if (arg4 < client.field550[var5] + class90.field1899[var5] && arg2 + arg4 > client.field550[var5] && class75.field1629[var5] + class191.field3713[var5] > arg0 && class75.field1629[var5] < arg0 + arg3) {
                class158.field3077[var5] = true;
            }
        }
        field525++;
        if (arg1 != -23343) {
            method247(79);
        }
    }
}
