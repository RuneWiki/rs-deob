import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class109 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "[J")
    public static long[] field1760 = new long[100];

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "Lmh;")
    public static class62 field1763 = class201.method1405(true, ": ");

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "Lmh;")
    public static class62 field1769 = class201.method1405(true, ": ");

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "[I")
    public static int[] field1766 = new int[500];

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "I")
    public static int field1758;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
    public static int field1759;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "I")
    public static int field1765;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "I")
    public static int field1770;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "[Lwj;")
    public static class135[] field1761;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V", line = 10)
    public static void method839(int arg0) {
        field1769 = null;
        field1766 = null;
        field1760 = null;
        field1763 = null;
        if (arg0 > -100) {
            field1769 = (class62) null;
        }
        field1761 = null;
    }

    @OriginalMember(owner = "client!lb", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 24)
    public final void focusGained(FocusEvent arg0) {
        field1768++;
    }

    @OriginalMember(owner = "client!lb", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 44)
    public final void keyTyped(KeyEvent arg0) {
        if (class111.field1810 != null) {
            int var2 = class149.method1075(128, arg0);
            if (var2 >= 0) {
                int var3 = class304.field5229 + 1 & 0x7F;
                if (class228.field3970 != var3) {
                    class290.field4932[class304.field5229] = -1;
                    class26.field296[class304.field5229] = var2;
                    class304.field5229 = var3;
                }
            }
        }
        arg0.consume();
        field1758++;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)V", line = 76)
    public static final void method840(boolean arg0) {
        field1764++;
        if (!class149.method1073((byte) -80) && class7.field85 != class190.field3028) {
            class189.method1322(class268.field4551.field3846[0], 26, false, class237.field4066, class7.field85, class2.field30, class268.field4551.field3828[0]);
            return;
        }
        if (class7.field85 != class149.field2349) {
            class149.field2349 = class7.field85;
            class52.method332(class7.field85, -125);
            class170.method1226(2);
        }
        if (!arg0) {
            method842(33, -60, 61, -73L);
        }
    }

    @OriginalMember(owner = "client!lb", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 115)
    public final synchronized void keyPressed(KeyEvent arg0) {
        field1765++;
        if (class111.field1810 == null) {
            return;
        }
        class206.field3487 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && class94.field1545.length > var2) {
            var3 = class94.field1545[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class243.field4138 >= 0 && var3 >= 0) {
            class114.field1911[class243.field4138] = var3;
            class243.field4138 = class243.field4138 + 1 & 0x7F;
            if (class243.field4138 == class118.field1982) {
                class243.field4138 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class304.field5229 + 1 & 0x7F;
            if (class228.field3970 != var4) {
                class290.field4932[class304.field5229] = var3;
                class26.field296[class304.field5229] = -1;
                class304.field5229 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)Z", line = 208)
    public static final boolean method841(int arg0) {
        field1759++;
        if (class60.field876 == 0) {
            if (arg0 < 106) {
                method840(false);
            }
            return class78.field1307.method530(-116);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!lb", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 224)
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class111.field1810 != null) {
            class206.field3487 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class94.field1545.length) {
                var3 = class94.field1545[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class243.field4138 >= 0 && var3 >= 0) {
                class114.field1911[class243.field4138] = ~var3;
                class243.field4138 = class243.field4138 + 1 & 0x7F;
                if (class243.field4138 == class118.field1982) {
                    class243.field4138 = -1;
                }
            }
        }
        arg0.consume();
        field1762++;
    }

    @OriginalMember(owner = "client!lb", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 262)
    public final synchronized void focusLost(FocusEvent arg0) {
        field1767++;
        if (class111.field1810 != null) {
            class243.field4138 = -1;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIJ)Z", line = 282)
    public static final boolean method842(int arg0, int arg1, int arg2, long arg3) {
        class166 var5 = class256.field4320[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field2706 != null && var5.field2706.field787 == arg3) {
            return true;
        } else if (var5.field2720 != null && var5.field2720.field4554 == arg3) {
            return true;
        } else if (var5.field2711 != null && var5.field2711.field442 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field2724; var6++) {
                if (var5.field2713[var6].field2668 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }
}
