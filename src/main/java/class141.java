import java.awt.Frame;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class141 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "[[I")
    public static int[][] field2892 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "I")
    public static int field2900 = 0;

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "Lrf;")
    public static class163 field2899 = class53.method392(-116, "Lade Sprites )2 ");

    @OriginalMember(owner = "client!pb", name = "q", descriptor = "Lrf;")
    private static class163 field2906 = class53.method392(-41, "No reply from loginserver)3");

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "Lrf;")
    public static class163 field2893 = field2906;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "Lf;")
    public static class51 field2896 = new class51(5000);

    @OriginalMember(owner = "client!pb", name = "s", descriptor = "Lrf;")
    private static class163 field2908 = class53.method392(-103, "go back to the main RuneScape webpage");

    @OriginalMember(owner = "client!pb", name = "t", descriptor = "Lrf;")
    public static class163 field2909 = field2908;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    public static int field2890;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
    public static int field2894;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
    public static int field2897;

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "I")
    public static int field2901;

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "I")
    public static int field2902;

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "I")
    public static int field2903;

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "I")
    public static int field2904;

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "I")
    public static int field2905;

    @OriginalMember(owner = "client!pb", name = "r", descriptor = "Ljava/awt/Frame;")
    public static Frame field2907;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)V")
    public static final void method922(byte arg0) {
        class97.field2053 = 0;
        field2895++;
        int var1 = (class56.field1136.field716 >> 7) + class172.field3493;
        int var2 = (class56.field1136.field679 >> 7) + class69.field1470;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class97.field2053 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class97.field2053 = 1;
        }
        if (arg0 == -67 && (class97.field2053 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062)) {
            class97.field2053 = 0;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(BLig;)Lig;")
    public static final class84 method923(byte arg0, class84 arg1) {
        if (arg0 < 109) {
            method923((byte) -50, null);
        }
        field2898++;
        int var2 = class43.method266(class21.method130(arg1, (byte) 77), (byte) -51);
        if (var2 == 0) {
            return null;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            arg1 = class138.method907(arg1.field1724, false);
            if (arg1 == null) {
                return null;
            }
        }
        return arg1;
    }

    @OriginalMember(owner = "client!pb", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field2904++;
        if (class131.field2735 != null) {
            class49.field960 = 0;
            class177.field3573 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!pb", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field2891++;
        if (class131.field2735 != null) {
            class177.field3573 = 0;
        }
    }

    @OriginalMember(owner = "client!pb", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        field2901++;
        if (class131.field2735 != null) {
            class49.field960 = 0;
            class58.field1169 = -1;
            class108.field2245 = -1;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
    public static void method924(int arg0) {
        field2892 = null;
        field2893 = null;
        field2899 = null;
        field2907 = null;
        field2896 = null;
        field2908 = null;
        if (arg0 == 1) {
            field2909 = null;
            field2906 = null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field2903++;
        if (class131.field2735 != null) {
            class49.field960 = 0;
            class58.field1169 = arg0.getX();
            class108.field2245 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!pb", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field2902++;
    }

    @OriginalMember(owner = "client!pb", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class131.field2735 != null) {
            class49.field960 = 0;
            class139.field2860 = arg0.getX();
            class4.field72 = arg0.getY();
            class89.field1933 = class155.method994(10);
            if (arg0.isMetaDown()) {
                class179.field3599 = 2;
                class177.field3573 = 2;
            } else {
                class179.field3599 = 1;
                class177.field3573 = 1;
            }
        }
        field2905++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!pb", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field2897++;
        if (class131.field2735 != null) {
            class49.field960 = 0;
            class58.field1169 = arg0.getX();
            class108.field2245 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!pb", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field2890++;
    }

    @OriginalMember(owner = "client!pb", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class131.field2735 != null) {
            class49.field960 = 0;
            class58.field1169 = arg0.getX();
            class108.field2245 = arg0.getY();
        }
        field2894++;
    }
}
