import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class117 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "[Ljava/awt/Color;")
    public static Color[] field1518 = new Color[] { new Color(16777215), new Color(16777215) };

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "Luc;")
    public static class51 field1523 = new class51(8);

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "I")
    public static int field1526 = 0;

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "I")
    public static int field1525 = -1;

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "[B")
    public static byte[] field1527 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!pe", name = "o", descriptor = "[I")
    public static int[] field1528 = new int[250];

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "I")
    public static int field1515;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
    public static int field1516;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "I")
    public static int field1517;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
    public static int field1519;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
    public static int field1520;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "I")
    public static int field1521;

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
    public static int field1522;

    @OriginalMember(owner = "client!pe", name = "p", descriptor = "Ltj;")
    public static class298 field1529;

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "Luh;")
    public static class414 field1524;

    @OriginalMember(owner = "client!pe", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 9)
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class254.field3706 != null) {
            class395.field5755 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class245.field3445.length > var2) {
                var3 = class245.field3445[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            if (class274.field4033 >= 0 && var3 >= 0) {
                class388.field5675[class274.field4033] = var3;
                class274.field4033 = class274.field4033 + 1 & 0x7F;
                if (class72.field1022 == class274.field4033) {
                    class274.field4033 = -1;
                }
            }
            if (var3 >= 0) {
                int var4 = client.field846 + 1 & 0x7F;
                if (class255.field3722 != var4) {
                    class242.field3392[client.field846] = var3;
                    class190.field2647[client.field846] = '\u0000';
                    client.field846 = var4;
                }
            }
            int var5 = arg0.getModifiers();
            if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
                arg0.consume();
            }
        }
        field1517++;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V", line = 66)
    public static void method855(int arg0) {
        field1528 = null;
        field1523 = null;
        if (arg0 != -1) {
            method855(-18);
        }
        field1518 = null;
        field1529 = null;
        field1527 = null;
        field1524 = null;
    }

    @OriginalMember(owner = "client!pe", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 83)
    public final void keyTyped(KeyEvent arg0) {
        if (class254.field3706 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != '\u0000' && var2 != '\uFFFF' && class360.method2371(128, var2)) {
                int var3 = client.field846 + 1 & 0x7F;
                if (class255.field3722 != var3) {
                    class242.field3392[client.field846] = -1;
                    class190.field2647[client.field846] = var2;
                    client.field846 = var3;
                }
            }
        }
        field1515++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!pe", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 113)
    public final void focusGained(FocusEvent arg0) {
        field1521++;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)V", line = 133)
    public static final void method856(int arg0) {
        field1520++;
        class216 var1 = class444.field6413;
        synchronized (class444.field6413) {
            class444.field6413.method1420(-1);
            if (arg0 != 1107) {
                field1528 = null;
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 146)
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class254.field3706 != null) {
            class395.field5755 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class245.field3445.length > var2) {
                var3 = class245.field3445[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class274.field4033 >= 0 && var3 >= 0) {
                class388.field5675[class274.field4033] = ~var3;
                class274.field4033 = class274.field4033 + 1 & 0x7F;
                if (class72.field1022 == class274.field4033) {
                    class274.field4033 = -1;
                }
            }
        }
        field1522++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(CB)Z", line = 180)
    public static final boolean method857(char arg0, byte arg1) {
        field1514++;
        if (arg0 >= ' ' && arg0 <= '~') {
            return true;
        }
        int var2 = 55 % ((-arg1 - 9) / 34);
        if (arg0 >= ' ' && arg0 <= 'ÿ') {
            return true;
        } else {
            return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
        }
    }

    @OriginalMember(owner = "client!pe", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 200)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class254.field3706 != null) {
            class274.field4033 = -1;
        }
        field1516++;
    }
}
