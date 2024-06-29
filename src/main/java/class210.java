import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class210 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "I")
    public static int field3617 = 0;

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "Loa;")
    public static class262 field3616 = new class262();

    @OriginalMember(owner = "client!kj", name = "p", descriptor = "Lmb;")
    public static class96 field3626 = class243.method1708("huffman", (byte) 126);

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "I")
    public static int field3611;

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "I")
    public static int field3612;

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "I")
    public static int field3613;

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "I")
    public static int field3615;

    @OriginalMember(owner = "client!kj", name = "h", descriptor = "I")
    public static int field3618;

    @OriginalMember(owner = "client!kj", name = "i", descriptor = "I")
    public static int field3619;

    @OriginalMember(owner = "client!kj", name = "j", descriptor = "I")
    public static int field3620;

    @OriginalMember(owner = "client!kj", name = "k", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!kj", name = "m", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!kj", name = "n", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!kj", name = "o", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!kj", name = "q", descriptor = "I")
    public static int field3627;

    @OriginalMember(owner = "client!kj", name = "l", descriptor = "[[[I")
    public static int[][][] field3622;

    @OriginalMember(owner = "client!kj", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field3615++;
        if (class194.field3345 != null) {
            class159.field2819 = 0;
        }
    }

    @OriginalMember(owner = "client!kj", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field3614++;
        if (class194.field3345 != null) {
            class55.field949 = 0;
            class221.field3782 = arg0.getX();
            class241.field4189 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!kj", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class194.field3345 != null) {
            class55.field949 = 0;
            class221.field3782 = arg0.getX();
            class241.field4189 = arg0.getY();
        }
        field3618++;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)V")
    public static void method1460(int arg0) {
        if (arg0 < -46) {
            field3616 = null;
            field3622 = null;
            field3626 = null;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(III)V")
    public static final void method1461(int arg0, int arg1, int arg2) {
        field3612++;
        if (arg2 != 4) {
            return;
        }
        if (class1.field11 != arg1) {
            class244.field4240 = new int[arg1];
            for (int var3 = 0; var3 < arg1; var3++) {
                class244.field4240[var3] = (var3 << 12) / arg1;
            }
            class161.field2838 = arg1 == 64 ? 2048 : 4096;
            class1.field11 = arg1;
            class194.field3343 = arg1 - 1;
        }
        if (class85.field1440 == arg0) {
            return;
        }
        if (class1.field11 == arg0) {
            class23.field395 = class244.field4240;
        } else {
            class23.field395 = new int[arg0];
            for (int var4 = 0; var4 < arg0; var4++) {
                class23.field395[var4] = (var4 << 12) / arg0;
            }
        }
        class85.field1440 = arg0;
        class92.field1520 = arg0 - 1;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IB)I")
    public static final int method1462(int arg0, byte arg1) {
        field3625++;
        int var2 = 53 / ((70 - arg1) / 42);
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lmb;BI)V")
    public static final void method1463(class96 arg0, byte arg1, int arg2) {
        field3619++;
        class43 var3 = class270.method1847(arg2, -10277, 3);
        var3.method333(52);
        var3.field745 = arg0;
        if (arg1 != 50) {
            method1463((class96) null, (byte) 14, -72);
        }
    }

    @OriginalMember(owner = "client!kj", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field3624++;
    }

    @OriginalMember(owner = "client!kj", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        field3620++;
        if (class194.field3345 != null) {
            class55.field949 = 0;
            class221.field3782 = -1;
            class241.field4189 = -1;
        }
    }

    @OriginalMember(owner = "client!kj", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field3627++;
        if (class194.field3345 != null) {
            class55.field949 = 0;
            class133.field2384 = arg0.getX();
            class133.field2397 = arg0.getY();
            class273.field4746 = class155.method1133(126);
            if (arg0.isMetaDown()) {
                class105.field1769 = 2;
                class159.field2819 = 2;
            } else {
                class105.field1769 = 1;
                class159.field2819 = 1;
            }
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!kj", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field3613++;
        if (class194.field3345 != null) {
            class55.field949 = 0;
            class159.field2819 = 0;
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!kj", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field3621++;
        if (class194.field3345 != null) {
            class55.field949 = 0;
            class221.field3782 = arg0.getX();
            class241.field4189 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!kj", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field3623++;
    }
}
