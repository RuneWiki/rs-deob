import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class162 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!il", name = "g", descriptor = "[S")
    public static short[] field2581 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!il", name = "m", descriptor = "I")
    public static int field2587 = 0;

    @OriginalMember(owner = "client!il", name = "l", descriptor = "Lvj;")
    public static class115 field2586 = new class115();

    @OriginalMember(owner = "client!il", name = "n", descriptor = "Lrk;")
    public static class270 field2588 = new class270(64);

    @OriginalMember(owner = "client!il", name = "a", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!il", name = "b", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!il", name = "c", descriptor = "I")
    public static int field2577;

    @OriginalMember(owner = "client!il", name = "d", descriptor = "I")
    public static int field2578;

    @OriginalMember(owner = "client!il", name = "e", descriptor = "I")
    public static int field2579;

    @OriginalMember(owner = "client!il", name = "f", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!il", name = "i", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!il", name = "j", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!il", name = "k", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!il", name = "h", descriptor = "Lqh;")
    public static class201 field2582;

    @OriginalMember(owner = "client!il", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field2578++;
    }

    @OriginalMember(owner = "client!il", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class72.field1188 != null) {
            class121.field1970 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class278.field4389.length > var2) {
                var3 = class278.field4389[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            if (class85.field1349 >= 0 && var3 >= 0) {
                class83.field1301[class85.field1349] = var3;
                class85.field1349 = class85.field1349 + 1 & 0x7F;
                if (class85.field1349 == class8.field107) {
                    class85.field1349 = -1;
                }
            }
            if (var3 >= 0) {
                int var4 = class107.field1757 + 1 & 0x7F;
                if (class138.field2270 != var4) {
                    class132.field2118[class107.field1757] = var3;
                    class195.field3119[class107.field1757] = '\u0000';
                    class107.field1757 = var4;
                }
            }
            int var5 = arg0.getModifiers();
            if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
                arg0.consume();
            }
        }
        field2577++;
    }

    @OriginalMember(owner = "client!il", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class72.field1188 != null) {
            class85.field1349 = -1;
        }
        field2583++;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IIII)I")
    public static final int method1121(int arg0, int arg1, int arg2, int arg3) {
        field2575++;
        if (arg2 <= 88) {
            return 4;
        }
        int var4 = arg1 & 0x3;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return 7 - arg3;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)V")
    public static final void method1122(int arg0) {
        field2584++;
        if (arg0 < 25) {
            field2582 = null;
        }
        class64.field1065.method481(false);
        class133.field2122.method481(false);
        class39.field742.method481(false);
    }

    @OriginalMember(owner = "client!il", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field2585++;
        if (class72.field1188 != null) {
            class121.field1970 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class278.field4389.length > var2) {
                var3 = class278.field4389[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class85.field1349 >= 0 && var3 >= 0) {
                class83.field1301[class85.field1349] = ~var3;
                class85.field1349 = class85.field1349 + 1 & 0x7F;
                if (class85.field1349 == class8.field107) {
                    class85.field1349 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!il", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        field2576++;
        if (class72.field1188 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != '\u0000' && var2 != '\uFFFF' && class270.method1830(128, var2)) {
                int var3 = class107.field1757 + 1 & 0x7F;
                if (class138.field2270 != var3) {
                    class132.field2118[class107.field1757] = -1;
                    class195.field3119[class107.field1757] = var2;
                    class107.field1757 = var3;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(I)Z")
    public static final boolean method1123(int arg0) {
        if (arg0 != 4626) {
            return false;
        }
        field2579++;
        if (class167.field2656) {
            try {
                if ((Boolean) class160.method1116("showingVideoAd", class105.field1684.field2620, (byte) 52)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!il", name = "c", descriptor = "(I)V")
    public static void method1124(int arg0) {
        field2588 = null;
        field2581 = null;
        if (arg0 != 0) {
            method1124(82);
        }
        field2582 = null;
        field2586 = null;
    }
}
