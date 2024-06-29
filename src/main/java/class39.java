import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!u")
public class class39 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "mapview!u", name = "c", descriptor = "Lea;")
    public static class10 field502 = class3.method8("Tannery", -114);

    @OriginalMember(owner = "mapview!u", name = "d", descriptor = "Lea;")
    public static class10 field503 = class3.method8("labels)3dat", -63);

    @OriginalMember(owner = "mapview!u", name = "e", descriptor = "Lea;")
    public static class10 field504 = class3.method8("Overview", -115);

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "Lea;")
    public static class10 field500 = class3.method8("Pub)4Bar", -59);

    @OriginalMember(owner = "mapview!u", name = "f", descriptor = "I")
    public static volatile int field505 = -1;

    @OriginalMember(owner = "mapview!u", name = "b", descriptor = "[Lea;")
    public static class10[] field501;

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "([BIII)I", line = 5)
    public static final int method250(byte[] arg0, int arg1, int arg2, int arg3) {
        int var4 = -1;
        int var5 = 25 % ((arg3 - 34) / 55);
        for (int var6 = arg1; var6 < arg2; var6++) {
            var4 = class34.field457[(arg0[var6] ^ var4) & 0xFF] ^ var4 >>> 8;
        }
        return ~var4;
    }

    @OriginalMember(owner = "mapview!u", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 28)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class22.field234 != null) {
            class33.field445 = 0;
        }
    }

    @OriginalMember(owner = "mapview!u", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 55)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class22.field234 != null) {
            class11.field92 = arg0.getX();
            field505 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!u", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 76)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class22.field234 != null) {
            class11.field92 = arg0.getX();
            field505 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!u", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 94)
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!u", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 103)
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class22.field234 != null) {
            mapview.field350 = arg0.getX();
            mapview.field373 = arg0.getY();
            if (arg0.isMetaDown()) {
                class13.field114 = 2;
                class33.field445 = 2;
            } else {
                class13.field114 = 1;
                class33.field445 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(III)V", line = 138)
    public static final void method251(int arg0, int arg1, int arg2) {
        class25.field388 = arg0 & 0x3F;
        class17.field185 = arg1 >> 6;
        class31.field427 = arg1 & 0x3F;
        if (arg2 < 61) {
            field505 = 20;
        }
        class22.field238 = (class31.field427 << 6) + class25.field388;
        class21.field231 = arg0 >> 6;
        class35.method239(true);
    }

    @OriginalMember(owner = "mapview!u", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 154)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class22.field234 != null) {
            class11.field92 = arg0.getX();
            field505 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(I)V", line = 187)
    public static void method252(int arg0) {
        field503 = null;
        field500 = null;
        field502 = null;
        if (arg0 < 48) {
            method250(null, 27, -99, 13);
        }
        field504 = null;
        field501 = null;
    }

    @OriginalMember(owner = "mapview!u", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 200)
    public final void focusGained(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!u", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 203)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class22.field234 != null) {
            class33.field445 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!u", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 226)
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class22.field234 != null) {
            class11.field92 = -1;
            field505 = -1;
        }
    }
}
