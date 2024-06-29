import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class26 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "Ldc;")
    private static class37 field443 = class185.method1233((byte) 86, "Hidden");

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "Ldc;")
    public static class37 field446 = field443;

    @OriginalMember(owner = "client!cc", name = "p", descriptor = "[I")
    public static int[] field455 = new int[200];

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "Ldc;")
    public static class37 field453 = class185.method1233((byte) 86, "Ausw-=hlen");

    @OriginalMember(owner = "client!cc", name = "o", descriptor = "Ldc;")
    public static class37 field454 = class185.method1233((byte) 86, "Anmelde)2Limit -Uberschritten)3");

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "Ldc;")
    public static class37 field449 = class185.method1233((byte) 86, "Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "I")
    public static int field447 = 0;

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "[I")
    public static int[] field450 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!cc", name = "r", descriptor = "[[B")
    public static byte[][] field457 = new byte[250][];

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
    public static int field441;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "I")
    public static int field445;

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!cc", name = "q", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!cc", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class32.field657 != null) {
            class94.field1643 = 0;
            class174.field3321 = arg0.getX();
            class151.field2869 = arg0.getY();
            class242.field4450 = class214.method1416(22624);
            if (arg0.isMetaDown()) {
                class127.field2347 = 2;
                class43.field922 = 2;
            } else {
                class127.field2347 = 1;
                class43.field922 = 1;
            }
            int var2 = arg0.getModifiers();
        }
        field445++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!cc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class32.field657 != null) {
            class43.field922 = 0;
        }
        field452++;
    }

    @OriginalMember(owner = "client!cc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field451++;
    }

    @OriginalMember(owner = "client!cc", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        field441++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!cc", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class32.field657 != null) {
            class94.field1643 = 0;
            class227.field4185 = arg0.getX();
            class222.field4119 = arg0.getY();
        }
        field442++;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V")
    public static void method173(byte arg0) {
        field450 = null;
        if (arg0 != 51) {
            field450 = null;
        }
        field443 = null;
        field446 = null;
        field454 = null;
        field457 = null;
        field449 = null;
        field453 = null;
        field455 = null;
    }

    @OriginalMember(owner = "client!cc", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field440++;
        if (class32.field657 != null) {
            class94.field1643 = 0;
            class227.field4185 = arg0.getX();
            class222.field4119 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!cc", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field448++;
        if (class32.field657 != null) {
            class94.field1643 = 0;
            class43.field922 = 0;
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!cc", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class32.field657 != null) {
            class94.field1643 = 0;
            class227.field4185 = arg0.getX();
            class222.field4119 = arg0.getY();
        }
        field444++;
    }

    @OriginalMember(owner = "client!cc", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class32.field657 != null) {
            class94.field1643 = 0;
            class227.field4185 = -1;
            class222.field4119 = -1;
        }
        field456++;
    }
}
