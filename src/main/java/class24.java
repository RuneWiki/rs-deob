import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class24 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "Loa;")
    public static class99 field360 = class221.method1463(2844, "M");

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "I")
    public static int field361 = -1;

    @OriginalMember(owner = "client!gh", name = "t", descriptor = "Loa;")
    public static class99 field371 = class221.method1463(2844, ")2");

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "I")
    public static int field353;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
    public static int field356;

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "I")
    public static int field359;

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "I")
    public static int field362;

    @OriginalMember(owner = "client!gh", name = "l", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "client!gh", name = "m", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "client!gh", name = "n", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!gh", name = "o", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!gh", name = "p", descriptor = "I")
    public static int field367;

    @OriginalMember(owner = "client!gh", name = "r", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!gh", name = "s", descriptor = "I")
    public static int field370;

    @OriginalMember(owner = "client!gh", name = "u", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!gh", name = "v", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!gh", name = "q", descriptor = "Ljd;")
    public static class87 field368;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "[I")
    public static int[] field352;

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "[[[B")
    public static byte[][][] field357;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Z)V")
    public static final void method181(boolean arg0) {
        field363++;
        class193.field3395 = null;
        class223.field3885 = null;
        class290.field5082 = null;
        class173.field3062 = null;
        class181.field3151 = null;
        if (arg0) {
            field366 = 54;
        }
        class11.field94 = null;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)[Laa;")
    public static final class170[] method182(int arg0) {
        field362++;
        class170[] var1 = new class170[class201.field3495];
        for (int var2 = 0; var2 < class201.field3495; var2++) {
            var1[var2] = new class109(class164.field2883, class88.field1520, class290.field5082[var2], class11.field94[var2], class223.field3885[var2], class193.field3395[var2], class181.field3151[var2], class173.field3062);
        }
        if (arg0 != 6983) {
            field366 = -78;
        }
        method181(false);
        return var1;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)Z")
    public static final boolean method183(int arg0, int arg1) {
        field354++;
        if (arg1 == 4860) {
            return (arg0 >> 31 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!gh", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field365++;
        if (class205.field3552 != null) {
            class108.field1957 = 0;
            class185.field3282 = 0;
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Loa;I)Z")
    public static final boolean method184(class99 arg0, int arg1) {
        field355++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = arg1; var2 < class122.field2138; var2++) {
            if (arg0.method706(class218.field3795[var2], 126)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!gh", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field369++;
    }

    @OriginalMember(owner = "client!gh", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field364++;
        if (class205.field3552 != null) {
            class185.field3282 = 0;
        }
    }

    @OriginalMember(owner = "client!gh", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field356++;
        if (class205.field3552 != null) {
            class108.field1957 = 0;
            class221.field3846 = arg0.getX();
            class159.field2827 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!gh", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field359++;
        if (class205.field3552 != null) {
            class108.field1957 = 0;
            class221.field3846 = arg0.getX();
            class159.field2827 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!gh", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field370++;
        if (class205.field3552 != null) {
            class108.field1957 = 0;
            class56.field927 = arg0.getX();
            class224.field3899 = arg0.getY();
            class153.field2682 = class231.method1513(118);
            if (arg0.isMetaDown()) {
                class17.field180 = 2;
                class185.field3282 = 2;
            } else {
                class17.field180 = 1;
                class185.field3282 = 1;
            }
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!gh", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        field358++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!gh", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class205.field3552 != null) {
            class108.field1957 = 0;
            class221.field3846 = arg0.getX();
            class159.field2827 = arg0.getY();
        }
        field353++;
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)V")
    public static void method185(int arg0) {
        field371 = null;
        field368 = null;
        field352 = null;
        field360 = null;
        if (arg0 != 0) {
            method181(false);
        }
        field357 = null;
    }

    @OriginalMember(owner = "client!gh", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class205.field3552 != null) {
            class108.field1957 = 0;
            class221.field3846 = -1;
            class159.field2827 = -1;
        }
        field372++;
    }
}
