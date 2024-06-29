import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class66 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
    public static int field1331;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
    public static int field1332;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
    public static int field1333;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "I")
    public static int field1334;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "I")
    public static int field1335;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "[I")
    public static int[] field1328;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "[Ltg;")
    public static class179[] field1330;

    @OriginalMember(owner = "client!ha", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class144.field2959 != null) {
            class7.field133 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class115.field2257.length) {
                var3 = class115.field2257[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class193.field3741 >= 0 && var3 >= 0) {
                class67.field1345[class193.field3741] = ~var3;
                class193.field3741 = class193.field3741 + 1 & 0x7F;
                if (class33.field609 == class193.field3741) {
                    class193.field3741 = -1;
                }
            }
        }
        field1332++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V")
    public static void method412(byte arg0) {
        if (arg0 == 1) {
            field1328 = null;
            field1330 = null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field1334++;
        if (class144.field2959 != null) {
            class193.field3741 = -1;
        }
    }

    @OriginalMember(owner = "client!ha", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field1336++;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
    public static final void method413(int arg0) {
        class88.field1709++;
        if (arg0 == -11) {
            field1337++;
            class29.field522.method338(253, 190);
            class29.field522.method550(99, 0L);
        }
    }

    @OriginalMember(owner = "client!ha", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        if (class144.field2959 != null) {
            int var2 = class103.method637((byte) -73, arg0);
            if (var2 >= 0) {
                int var3 = class106.field2034 + 1 & 0x7F;
                if (class7.field142 != var3) {
                    class180.field3585[class106.field2034] = -1;
                    class107.field2038[class106.field2034] = var2;
                    class106.field2034 = var3;
                }
            }
        }
        arg0.consume();
        field1333++;
    }

    @OriginalMember(owner = "client!ha", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class144.field2959 != null) {
            class7.field133 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class115.field2257.length) {
                var3 = class115.field2257[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            if (class193.field3741 >= 0 && var3 >= 0) {
                class67.field1345[class193.field3741] = var3;
                class193.field3741 = class193.field3741 + 1 & 0x7F;
                if (class33.field609 == class193.field3741) {
                    class193.field3741 = -1;
                }
            }
            if (var3 >= 0) {
                int var4 = class106.field2034 + 1 & 0x7F;
                if (class7.field142 != var4) {
                    class180.field3585[class106.field2034] = var3;
                    class107.field2038[class106.field2034] = -1;
                    class106.field2034 = var4;
                }
            }
            int var5 = arg0.getModifiers();
            if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
                arg0.consume();
            }
        }
        field1335++;
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)Z")
    public static final boolean method414(int arg0) {
        field1331++;
        class66 var1 = class144.field2959;
        synchronized (class144.field2959) {
            if (class7.field142 == class100.field1923) {
                return false;
            } else {
                class112.field2148 = class180.field3585[class7.field142];
                class116.field2271 = class107.field2038[class7.field142];
                class7.field142 = class7.field142 + arg0 & 0x7F;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(III)I")
    public static final int method415(int arg0, int arg1, int arg2) {
        field1329++;
        class174 var3 = (class174) class90.field1792.method75((long) arg2, -128);
        if (var3 == null) {
            return -1;
        } else if (arg0 >= 0 && arg0 < var3.field3462.length) {
            if (arg1 != 0) {
                method413(57);
            }
            return var3.field3462[arg0];
        } else {
            return -1;
        }
    }
}
