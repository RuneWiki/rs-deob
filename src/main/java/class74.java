import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class74 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "[[I")
    public static int[][] field939 = new int[128][128];

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
    public static int field934;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    public static int field935;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
    public static int field942;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "I")
    public static int field944;

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "I")
    public static int field946;

    @OriginalMember(owner = "client!hc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field940++;
        if (class433.field6389 != null) {
            class394.field5912 = 0;
        }
    }

    @OriginalMember(owner = "client!hc", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class433.field6389 != null) {
            class358.field5467 = 0;
            class255.field4128 = arg0.getX();
            class108.field1519 = arg0.getY();
            class181.field2972 = class46.method297(27104);
            if (arg0.isMetaDown()) {
                class220.field3626 = 2;
                class394.field5912 = 2;
            } else {
                class220.field3626 = 1;
                class394.field5912 = 1;
            }
            int var2 = arg0.getModifiers();
        }
        field938++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!hc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field935++;
    }

    @OriginalMember(owner = "client!hc", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        field946++;
        if (class433.field6389 != null) {
            class358.field5467 = 0;
            class91.field1129 = -1;
            class1.field3 = -1;
        }
    }

    @OriginalMember(owner = "client!hc", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field941++;
        if (class433.field6389 != null) {
            class358.field5467 = 0;
            class91.field1129 = arg0.getX();
            class1.field3 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)Ln;")
    public static final class13 method475(byte arg0) {
        field942++;
        class13 var1 = (class13) class391.field5873.method2432((byte) -123);
        if (var1 == null) {
            if (arg0 != -96) {
                field939 = null;
            }
            return new class13();
        } else {
            class374.field5642--;
            return var1;
        }
    }

    @OriginalMember(owner = "client!hc", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field934++;
        if (class433.field6389 != null) {
            class358.field5467 = 0;
            class91.field1129 = arg0.getX();
            class1.field3 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!hc", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field945++;
        if (class433.field6389 != null) {
            class358.field5467 = 0;
            class394.field5912 = 0;
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!hc", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field944++;
        if (class433.field6389 != null) {
            class358.field5467 = 0;
            class91.field1129 = arg0.getX();
            class1.field3 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
    public static void method476(int arg0) {
        if (arg0 != 128) {
            field943 = -74;
        }
        field939 = null;
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(B)V")
    public static final void method477(byte arg0) {
        field937++;
        if (class138.field2149) {
            return;
        }
        if (arg0 <= 45) {
            field939 = null;
        }
        if (class301.field4772) {
            class316.field4958 = (float) ((int) class316.field4958 + 47 & 0xFFFFFFF0);
        } else {
            class137.field2144 += (12.0F - class137.field2144) / 2.0F;
        }
        class324.field5089 = true;
        class138.field2149 = true;
    }

    @OriginalMember(owner = "client!hc", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field936++;
    }
}
