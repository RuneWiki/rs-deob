import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class95 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "Li;")
    public static class207 field1715 = new class207(5000);

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "Lqd;")
    public static class40 field1717 = class147.method1106("Cache:", (byte) -59);

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "Lqd;")
    public static class40 field1719 = class147.method1106("Clientscript error )2 check log for details", (byte) -97);

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "Lqd;")
    public static class40 field1716 = class147.method1106("Fertigkeit: ", (byte) -47);

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
    public static int field1706;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "I")
    public static int field1707;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
    public static int field1708;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
    public static int field1711;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
    public static int field1712;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "I")
    public static int field1713;

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
    public static int field1714;

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!pe", name = "o", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!pe", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 17)
    public final void focusGained(FocusEvent arg0) {
        field1706++;
    }

    @OriginalMember(owner = "client!pe", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 43)
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class306.field5135 != null) {
            class14.field241 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class41.field776.length > var2) {
                var3 = class41.field776[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            if (class265.field4447 >= 0 && var3 >= 0) {
                class1.field1[class265.field4447] = var3;
                class265.field4447 = class265.field4447 + 1 & 0x7F;
                if (class96.field1727 == class265.field4447) {
                    class265.field4447 = -1;
                }
            }
            if (var3 >= 0) {
                int var4 = class164.field2720 + 1 & 0x7F;
                if (class257.field4280 != var4) {
                    class285.field4812[class164.field2720] = var3;
                    class96.field1729[class164.field2720] = -1;
                    class164.field2720 = var4;
                }
            }
            int var5 = arg0.getModifiers();
            if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
                arg0.consume();
            }
        }
        field1709++;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)I", line = 123)
    public static final int method715(byte arg0) {
        if (arg0 >= -60) {
            return -75;
        } else {
            field1711++;
            return 2;
        }
    }

    @OriginalMember(owner = "client!pe", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 144)
    public final synchronized void keyReleased(KeyEvent arg0) {
        field1707++;
        if (class306.field5135 != null) {
            class14.field241 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class41.field776.length > var2) {
                var3 = class41.field776[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class265.field4447 >= 0 && var3 >= 0) {
                class1.field1[class265.field4447] = ~var3;
                class265.field4447 = class265.field4447 + 1 & 0x7F;
                if (class96.field1727 == class265.field4447) {
                    class265.field4447 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!pe", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 184)
    public final void keyTyped(KeyEvent arg0) {
        field1714++;
        if (class306.field5135 != null) {
            int var2 = class211.method1484(arg0, false);
            if (var2 >= 0) {
                int var3 = class164.field2720 + 1 & 0x7F;
                if (class257.field4280 != var3) {
                    class285.field4812[class164.field2720] = -1;
                    class96.field1729[class164.field2720] = var2;
                    class164.field2720 = var3;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!pe", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 226)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class306.field5135 != null) {
            class265.field4447 = -1;
        }
        field1713++;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V", line = 248)
    public static void method716(int arg0) {
        if (arg0 != 127) {
            field1715 = (class207) null;
        }
        field1719 = null;
        field1715 = null;
        field1717 = null;
        field1716 = null;
    }
}
