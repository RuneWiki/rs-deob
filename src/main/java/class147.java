import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class147 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "I")
    public static int field2897 = 20;

    @OriginalMember(owner = "client!qc", name = "n", descriptor = "Lsd;")
    private static class166 field2898 = class135.method935("Please wait )2 attempting to reestablish)3", 0);

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "Lsd;")
    public static class166 field2890 = field2898;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "Lb;")
    public static class11 field2885 = new class11(30);

    @OriginalMember(owner = "client!qc", name = "p", descriptor = "I")
    public static int field2900 = 0;

    @OriginalMember(owner = "client!qc", name = "r", descriptor = "Lsd;")
    public static class166 field2902 = class135.method935("cross", 0);

    @OriginalMember(owner = "client!qc", name = "s", descriptor = "Lsd;")
    private static class166 field2903 = class135.method935(" from your friend list first)3", 0);

    @OriginalMember(owner = "client!qc", name = "t", descriptor = "Lsd;")
    public static class166 field2904 = class135.method935("Benutzen Sie die (WPasswort -=ndern(W Option", 0);

    @OriginalMember(owner = "client!qc", name = "u", descriptor = "[I")
    public static int[] field2905 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 0, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!qc", name = "v", descriptor = "Lsd;")
    public static class166 field2906 = field2903;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
    public static int field2886;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
    public static int field2887;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
    public static int field2889;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "I")
    public static int field2892;

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "I")
    public static int field2893;

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
    public static int field2894;

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "I")
    public static int field2896;

    @OriginalMember(owner = "client!qc", name = "o", descriptor = "I")
    public static int field2899;

    @OriginalMember(owner = "client!qc", name = "q", descriptor = "I")
    public static int field2901;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
    public static final void method1008(int arg0) {
        field2895++;
        try {
            if (class153.field2952 == 1) {
                int var1 = class165.field3139.method469((byte) -123);
                if (var1 > 0 && class165.field3139.method473(-120)) {
                    int var2 = var1 - class34.field649;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class165.field3139.method480(var2, (byte) 113);
                    return;
                }
                class165.field3139.method455(255);
                class165.field3139.method449((byte) -128);
                class150.field2922 = null;
                class191.field3634 = null;
                if (class81.field1655 == null) {
                    class153.field2952 = 0;
                } else {
                    class153.field2952 = 2;
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class165.field3139.method455(255);
            class150.field2922 = null;
            class81.field1655 = null;
            class191.field3634 = null;
            class153.field2952 = 0;
        }
        if (arg0 != 0) {
            field2898 = null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field2888++;
        if (class129.field2532 != null) {
            class46.field836 = 0;
            class103.field2020 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!qc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field2893++;
        if (class129.field2532 != null) {
            class103.field2020 = 0;
        }
    }

    @OriginalMember(owner = "client!qc", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class129.field2532 != null) {
            class46.field836 = 0;
            class5.field117 = arg0.getX();
            class200.field3975 = arg0.getY();
        }
        field2892++;
    }

    @OriginalMember(owner = "client!qc", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        field2886++;
        if (class129.field2532 != null) {
            class46.field836 = 0;
            class5.field117 = -1;
            class200.field3975 = -1;
        }
    }

    @OriginalMember(owner = "client!qc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field2896++;
    }

    @OriginalMember(owner = "client!qc", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class129.field2532 != null) {
            class46.field836 = 0;
            class5.field117 = arg0.getX();
            class200.field3975 = arg0.getY();
        }
        field2887++;
    }

    @OriginalMember(owner = "client!qc", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field2889++;
        if (class129.field2532 != null) {
            class46.field836 = 0;
            class5.field117 = arg0.getX();
            class200.field3975 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!qc", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field2899++;
        if (class129.field2532 != null) {
            class46.field836 = 0;
            class191.field3631 = arg0.getX();
            class74.field1535 = arg0.getY();
            class145.field2828 = class100.method748((byte) 35);
            if (arg0.isMetaDown()) {
                class182.field3448 = 2;
                class103.field2020 = 2;
            } else {
                class182.field3448 = 1;
                class103.field2020 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)V")
    public static void method1009(int arg0) {
        field2902 = null;
        field2890 = null;
        field2898 = null;
        field2904 = null;
        field2905 = null;
        int var1 = -95 / ((arg0 + 69) / 47);
        field2906 = null;
        field2903 = null;
        field2885 = null;
    }

    @OriginalMember(owner = "client!qc", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field2894++;
    }
}
