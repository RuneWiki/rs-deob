import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class44 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "Lhj;")
    public static class69 field631 = class181.method1318("Standort", (byte) -113);

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "I")
    public static int field627 = 0;

    @OriginalMember(owner = "client!rh", name = "o", descriptor = "Lhj;")
    private static class69 field640 = class181.method1318("RuneScape is loading )2 please wait)3)3)3", (byte) -114);

    @OriginalMember(owner = "client!rh", name = "j", descriptor = "Lhj;")
    public static class69 field635 = field640;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "I")
    public static int field626;

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "I")
    public static int field632;

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "I")
    public static int field633;

    @OriginalMember(owner = "client!rh", name = "i", descriptor = "I")
    public static int field634;

    @OriginalMember(owner = "client!rh", name = "k", descriptor = "I")
    public static int field636;

    @OriginalMember(owner = "client!rh", name = "l", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "client!rh", name = "m", descriptor = "I")
    public static int field638;

    @OriginalMember(owner = "client!rh", name = "n", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "client!rh", name = "p", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BLbh;)V")
    public static final void method248(byte arg0, class7 arg1) {
        arg1.field50 = false;
        if (arg1.field51 != null) {
            arg1.field51.field1669 = 0;
        }
        if (arg0 != 37) {
            method250((byte) -20);
        }
        for (class7 var2 = arg1.method33(); var2 != null; var2 = arg1.method34()) {
            method248((byte) 37, var2);
        }
        field639++;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lfh;Z)Lhj;")
    public static final class69 method249(class128 arg0, boolean arg1) {
        if (arg1) {
            field630++;
            return class51.method300((byte) -45, 32767, arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rh", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class113.field2173 != null) {
            class173.field3156 = 0;
            class24.field360 = arg0.getX();
            class56.field1016 = arg0.getY();
            class62.field1199 = class223.method1584(-25392);
            if (arg0.isMetaDown()) {
                class62.field1169 = 2;
                class76.field1482 = 2;
            } else {
                class62.field1169 = 1;
                class76.field1482 = 1;
            }
            int var2 = arg0.getModifiers();
        }
        field634++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!rh", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class113.field2173 != null) {
            class173.field3156 = 0;
            class236.field4293 = arg0.getX();
            class89.field1696 = arg0.getY();
        }
        field633++;
    }

    @OriginalMember(owner = "client!rh", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field637++;
        if (class113.field2173 != null) {
            class173.field3156 = 0;
            class76.field1482 = 0;
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!rh", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class113.field2173 != null) {
            class173.field3156 = 0;
            class236.field4293 = -1;
            class89.field1696 = -1;
        }
        field626++;
    }

    @OriginalMember(owner = "client!rh", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class113.field2173 != null) {
            class173.field3156 = 0;
            class236.field4293 = arg0.getX();
            class89.field1696 = arg0.getY();
        }
        field638++;
    }

    @OriginalMember(owner = "client!rh", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        field636++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!rh", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field641++;
    }

    @OriginalMember(owner = "client!rh", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field629++;
        if (class113.field2173 != null) {
            class173.field3156 = 0;
            class236.field4293 = arg0.getX();
            class89.field1696 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!rh", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class113.field2173 != null) {
            class76.field1482 = 0;
        }
        field628++;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)V")
    public static void method250(byte arg0) {
        field635 = null;
        field631 = null;
        if (arg0 != 55) {
            field635 = null;
        }
        field640 = null;
    }
}
