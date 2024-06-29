import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class159 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "Le;")
    public static class191 field2694 = class54.method368(" <col=ffffff>", 2047);

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "Le;")
    public static class191 field2693 = class54.method368("lila:", 2047);

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "I")
    public static int field2692 = 0;

    @OriginalMember(owner = "client!vj", name = "l", descriptor = "Le;")
    private static class191 field2703 = class54.method368("Loading wordpack )2 ", 2047);

    @OriginalMember(owner = "client!vj", name = "m", descriptor = "Le;")
    private static class191 field2704 = class54.method368("FULL", 2047);

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "Le;")
    public static class191 field2702 = field2703;

    @OriginalMember(owner = "client!vj", name = "n", descriptor = "Le;")
    private static class191 field2705 = class54.method368("Members object", 2047);

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "Le;")
    public static class191 field2697 = field2705;

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "Le;")
    public static class191 field2696 = field2704;

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "Le;")
    public static class191 field2700 = class54.method368(")3)3)3", 2047);

    @OriginalMember(owner = "client!vj", name = "p", descriptor = "Le;")
    public static class191 field2707 = class54.method368("(U0a )2 in: ", 2047);

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "Le;")
    public static class191 field2698 = class11.method76((byte) -41, 160);

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "client!vj", name = "j", descriptor = "I")
    public static int field2701;

    @OriginalMember(owner = "client!vj", name = "q", descriptor = "I")
    public static int field2708;

    @OriginalMember(owner = "client!vj", name = "r", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!vj", name = "s", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!vj", name = "o", descriptor = "Lvb;")
    public static class64 field2706;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)V")
    public static final void method1079(byte arg0) {
        field2709++;
        class234.method1655(true);
        class148.method1005(-116);
        class61.method412(false);
        class166.method1120(32);
        class176.method1189((byte) -100);
        class107.method688(-30198);
        if (arg0 > -12) {
            return;
        }
        class12.method88(124);
        class244.method1708((byte) -104);
        class131.method888((byte) 78);
        class12.method82(false);
        class250.method1746(0);
        class115.method732(-101);
        class128.method868(29891);
        class83.method524((byte) 58);
        class201.field3609.method985(0);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)V")
    public static void method1080(int arg0) {
        field2704 = null;
        field2696 = null;
        field2694 = null;
        field2706 = null;
        field2702 = null;
        field2693 = null;
        field2700 = null;
        if (arg0 != -1) {
            field2705 = null;
        }
        field2703 = null;
        field2705 = null;
        field2707 = null;
        field2697 = null;
        field2698 = null;
    }

    @OriginalMember(owner = "client!vj", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class229.field4119 != null) {
            class45.field808 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class267.field4717.length) {
                var3 = class267.field4717[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class196.field3504 >= 0 && var3 >= 0) {
                class93.field1517[class196.field3504] = ~var3;
                class196.field3504 = class196.field3504 + 1 & 0x7F;
                if (class31.field438 == class196.field3504) {
                    class196.field3504 = -1;
                }
            }
        }
        field2701++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!vj", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        if (class229.field4119 != null) {
            int var2 = class54.method369(arg0, 116);
            if (var2 >= 0) {
                int var3 = class112.field1877 + 1 & 0x7F;
                if (class201.field3605 != var3) {
                    class95.field1549[class112.field1877] = -1;
                    class220.field3854[class112.field1877] = var2;
                    class112.field1877 = var3;
                }
            }
        }
        arg0.consume();
        field2710++;
    }

    @OriginalMember(owner = "client!vj", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field2708++;
    }

    @OriginalMember(owner = "client!vj", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class229.field4119 != null) {
            class45.field808 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class267.field4717.length > var2) {
                var3 = class267.field4717[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            if (class196.field3504 >= 0 && var3 >= 0) {
                class93.field1517[class196.field3504] = var3;
                class196.field3504 = class196.field3504 + 1 & 0x7F;
                if (class31.field438 == class196.field3504) {
                    class196.field3504 = -1;
                }
            }
            if (var3 >= 0) {
                int var4 = class112.field1877 + 1 & 0x7F;
                if (class201.field3605 != var4) {
                    class95.field1549[class112.field1877] = var3;
                    class220.field3854[class112.field1877] = -1;
                    class112.field1877 = var4;
                }
            }
            int var5 = arg0.getModifiers();
            if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
                arg0.consume();
            }
        }
        field2699++;
    }

    @OriginalMember(owner = "client!vj", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field2695++;
        if (class229.field4119 != null) {
            class196.field3504 = -1;
        }
    }
}
