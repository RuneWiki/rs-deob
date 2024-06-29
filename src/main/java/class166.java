import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class166 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "[C")
    public static char[] field2544 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!ek", name = "k", descriptor = "I")
    public static int field2554 = 0;

    @OriginalMember(owner = "client!ek", name = "h", descriptor = "[[B")
    public static byte[][] field2551 = new byte[1000][];

    @OriginalMember(owner = "client!ek", name = "o", descriptor = "I")
    public static int field2558 = 0;

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "I")
    public static int field2550 = 2;

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "Ljl;")
    public static class253 field2549 = new class253(32);

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "I")
    public static int field2545;

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "I")
    public static int field2546;

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "I")
    public static int field2547;

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "I")
    public static int field2548;

    @OriginalMember(owner = "client!ek", name = "i", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!ek", name = "j", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!ek", name = "l", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!ek", name = "n", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!ek", name = "p", descriptor = "I")
    public static int field2559;

    @OriginalMember(owner = "client!ek", name = "q", descriptor = "I")
    public static int field2560;

    @OriginalMember(owner = "client!ek", name = "m", descriptor = "Lja;")
    public static class60 field2556;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V")
    public static void method1042(int arg0) {
        if (arg0 == 382) {
            field2556 = null;
            field2551 = null;
            field2544 = null;
            field2549 = null;
        }
    }

    @OriginalMember(owner = "client!ek", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field2555++;
    }

    @OriginalMember(owner = "client!ek", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class44.field704 != null) {
            class219.field3302 = 0;
            class230.field3467 = 0;
            int var2 = arg0.getModifiers();
        }
        field2547++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ek", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field2546++;
    }

    @OriginalMember(owner = "client!ek", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field2557++;
        if (class44.field704 != null) {
            class219.field3302 = 0;
            class133.field1948 = arg0.getX();
            class90.field1419 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!ek", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class44.field704 != null) {
            class219.field3302 = 0;
            class133.field1948 = arg0.getX();
            class90.field1419 = arg0.getY();
        }
        field2559++;
    }

    @OriginalMember(owner = "client!ek", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field2552++;
        if (class44.field704 != null) {
            class230.field3467 = 0;
        }
    }

    @OriginalMember(owner = "client!ek", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class44.field704 != null) {
            class219.field3302 = 0;
            class37.field508 = arg0.getX();
            class128.field1921 = arg0.getY();
            class25.field303 = class263.method1754(15);
            if (arg0.isMetaDown()) {
                class92.field1455 = 2;
                class230.field3467 = 2;
            } else {
                class92.field1455 = 1;
                class230.field3467 = 1;
            }
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field2560++;
    }

    @OriginalMember(owner = "client!ek", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        field2553++;
        if (class44.field704 != null) {
            class219.field3302 = 0;
            class133.field1948 = -1;
            class90.field1419 = -1;
        }
    }

    @OriginalMember(owner = "client!ek", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class44.field704 != null) {
            class219.field3302 = 0;
            class133.field1948 = arg0.getX();
            class90.field1419 = arg0.getY();
        }
        field2545++;
    }
}
