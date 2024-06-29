import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class90 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "I")
    public static int field1530 = 1;

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "I")
    public static int field1531 = 255;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "Lda;")
    public static class275 field1529 = class255.method1672(109, "blinken1:");

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "Lda;")
    public static class275 field1532 = class255.method1672(97, "blaugr-Un:");

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "[[[I")
    public static int[][][] field1536 = new int[4][13][13];

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "I")
    public static int field1534;

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!wi", name = "j", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!wi", name = "k", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!wi", name = "l", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!wi", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class91.field1548 != null) {
            class36.field591 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class225.field3803.length > var2) {
                var3 = class225.field3803[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            if (class195.field3333 >= 0 && var3 >= 0) {
                class137.field2414[class195.field3333] = var3;
                class195.field3333 = class195.field3333 + 1 & 0x7F;
                if (class195.field3333 == class146.field2549) {
                    class195.field3333 = -1;
                }
            }
            if (var3 >= 0) {
                int var4 = class33.field487 + 1 & 0x7F;
                if (class160.field2808 != var4) {
                    class39.field655[class33.field487] = var3;
                    class152.field2652[class33.field487] = -1;
                    class33.field487 = var4;
                }
            }
            int var5 = arg0.getModifiers();
            if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
                arg0.consume();
            }
        }
        field1533++;
    }

    @OriginalMember(owner = "client!wi", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class91.field1548 != null) {
            class36.field591 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class225.field3803.length) {
                var3 = class225.field3803[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class195.field3333 >= 0 && var3 >= 0) {
                class137.field2414[class195.field3333] = ~var3;
                class195.field3333 = class195.field3333 + 1 & 0x7F;
                if (class195.field3333 == class146.field2549) {
                    class195.field3333 = -1;
                }
            }
        }
        arg0.consume();
        field1534++;
    }

    @OriginalMember(owner = "client!wi", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field1528++;
    }

    @OriginalMember(owner = "client!wi", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        if (class91.field1548 != null) {
            int var2 = class118.method857(-1, arg0);
            if (var2 >= 0) {
                int var3 = class33.field487 + 1 & 0x7F;
                if (class160.field2808 != var3) {
                    class39.field655[class33.field487] = -1;
                    class152.field2652[class33.field487] = var2;
                    class33.field487 = var3;
                }
            }
        }
        field1535++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Z)V")
    public static void method653(boolean arg0) {
        if (!arg0) {
            field1532 = null;
            field1536 = null;
            field1529 = null;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(II)I")
    public static final int method654(int arg0, int arg1) {
        field1537++;
        int var2 = arg1 & 0x3F;
        int var3 = (arg1 & 0xE8) >> 6;
        if (~var2 == arg0) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!wi", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field1538++;
        if (class91.field1548 != null) {
            class195.field3333 = -1;
        }
    }
}
