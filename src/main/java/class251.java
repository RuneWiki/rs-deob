import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class251 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "[J")
    public static long[] field4340 = new long[32];

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "Lub;")
    public static class227 field4342 = class257.method1749(" )2> ", 17263);

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "I")
    public static int field4348 = 0;

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "I")
    public static int field4352 = 0;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
    public static int field4341;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
    public static int field4344;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
    public static int field4345;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "I")
    public static int field4347;

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "I")
    public static int field4349;

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "I")
    public static int field4350;

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "I")
    public static int field4351;

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "I")
    public static int field4353;

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "I")
    public static int field4355;

    @OriginalMember(owner = "client!vb", name = "q", descriptor = "I")
    public static int field4356;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "Lwh;")
    public static class163 field4346;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "[[B")
    public static byte[][] field4343;

    @OriginalMember(owner = "client!vb", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field4345++;
        if (class61.field1121 != null) {
            class12.field230 = 0;
            class225.field3795 = arg0.getX();
            class56.field1021 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!vb", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class61.field1121 != null) {
            class12.field230 = 0;
            class225.field3795 = arg0.getX();
            class56.field1021 = arg0.getY();
        }
        field4341++;
    }

    @OriginalMember(owner = "client!vb", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field4353++;
        if (class61.field1121 != null) {
            class12.field230 = 0;
            class193.field3276 = 0;
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!vb", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field4344++;
        if (class61.field1121 != null) {
            class12.field230 = 0;
            class225.field3795 = arg0.getX();
            class56.field1021 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!vb", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field4347++;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)Lug;")
    public static final class171 method1677(int arg0) {
        field4355++;
        class171 var1 = (class171) class177.field2978.method209(16711680);
        if (var1 != null) {
            var1.method369(124);
            var1.method727((byte) 2);
            return var1;
        } else if (arg0 < 106) {
            return null;
        } else {
            class171 var2;
            do {
                var2 = (class171) class60.field1111.method209(16711680);
                if (var2 == null) {
                    return null;
                }
                if (var2.method1094(91) > class12.method57(-120)) {
                    return null;
                }
                var2.method369(-126);
                var2.method727((byte) 2);
            } while ((var2.field2112 & Long.MIN_VALUE) == 0L);
            return var2;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V")
    public static void method1678(byte arg0) {
        field4340 = null;
        field4346 = null;
        if (arg0 != 82) {
            field4343 = null;
        }
        field4343 = null;
        field4342 = null;
    }

    @OriginalMember(owner = "client!vb", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        field4356++;
        if (class61.field1121 != null) {
            class12.field230 = 0;
            class225.field3795 = -1;
            class56.field1021 = -1;
        }
    }

    @OriginalMember(owner = "client!vb", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class61.field1121 != null) {
            class193.field3276 = 0;
        }
        field4351++;
    }

    @OriginalMember(owner = "client!vb", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        field4350++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!vb", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class61.field1121 != null) {
            class12.field230 = 0;
            class37.field618 = arg0.getX();
            class60.field1117 = arg0.getY();
            class211.field3573 = class12.method57(-102);
            if (arg0.isMetaDown()) {
                class149.field2606 = 2;
                class193.field3276 = 2;
            } else {
                class149.field2606 = 1;
                class193.field3276 = 1;
            }
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field4354++;
    }
}
