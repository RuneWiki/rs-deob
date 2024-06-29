import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class61 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!g", name = "a", descriptor = "I")
    public static int field1493 = 0;

    @OriginalMember(owner = "client!g", name = "g", descriptor = "I")
    public static int field1499 = 0;

    @OriginalMember(owner = "client!g", name = "h", descriptor = "Ldd;")
    public static class35 field1500 = class180.method1196((byte) -55, "ams");

    @OriginalMember(owner = "client!g", name = "b", descriptor = "Ldd;")
    private static class35 field1494 = class180.method1196((byte) -44, "Choose Option");

    @OriginalMember(owner = "client!g", name = "k", descriptor = "I")
    public static int field1503 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!g", name = "l", descriptor = "Ldd;")
    public static class35 field1504 = field1494;

    @OriginalMember(owner = "client!g", name = "m", descriptor = "I")
    public static int field1505 = 0;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "I")
    public static int field1495;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "I")
    public static int field1496;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "I")
    public static int field1497;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "I")
    public static int field1498;

    @OriginalMember(owner = "client!g", name = "i", descriptor = "I")
    public static int field1501;

    @OriginalMember(owner = "client!g", name = "j", descriptor = "I")
    public static int field1502;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(B)Lta;")
    public static final class180 method518(byte arg0) {
        if (arg0 >= -106) {
            method518((byte) -58);
        }
        field1502++;
        try {
            return (class180) Class.forName("pf").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return new class203();
        }
    }

    @OriginalMember(owner = "client!g", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        field1495++;
        if (class111.field2443 != null) {
            int var2 = class39.method376(-4865, arg0);
            if (var2 >= 0) {
                int var3 = class115.field2558 + 1 & 0x7F;
                if (class184.field3777 != var3) {
                    class105.field2354[class115.field2558] = -1;
                    class38.field837[class115.field2558] = var2;
                    class115.field2558 = var3;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!g", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class111.field2443 != null) {
            class53.field1202 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class200.field4014.length) {
                var3 = class200.field4014[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class79.field1854 >= 0 && var3 >= 0) {
                class71.field1700[class79.field1854] = ~var3;
                class79.field1854 = class79.field1854 + 1 & 0x7F;
                if (class89.field1998 == class79.field1854) {
                    class79.field1854 = -1;
                }
            }
        }
        arg0.consume();
        field1496++;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V")
    public static void method519(int arg0) {
        field1494 = null;
        field1500 = null;
        if (arg0 == -1) {
            field1504 = null;
        }
    }

    @OriginalMember(owner = "client!g", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field1501++;
    }

    @OriginalMember(owner = "client!g", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class111.field2443 != null) {
            class79.field1854 = -1;
        }
        field1498++;
    }

    @OriginalMember(owner = "client!g", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class111.field2443 != null) {
            class53.field1202 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class200.field4014.length) {
                var3 = class200.field4014[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            if (class79.field1854 >= 0 && var3 >= 0) {
                class71.field1700[class79.field1854] = var3;
                class79.field1854 = class79.field1854 + 1 & 0x7F;
                if (class89.field1998 == class79.field1854) {
                    class79.field1854 = -1;
                }
            }
            if (var3 >= 0) {
                int var4 = class115.field2558 + 1 & 0x7F;
                if (class184.field3777 != var4) {
                    class105.field2354[class115.field2558] = var3;
                    class38.field837[class115.field2558] = -1;
                    class115.field2558 = var4;
                }
            }
            int var5 = arg0.getModifiers();
            if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
                arg0.consume();
            }
        }
        field1497++;
    }
}
