import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class11 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "I")
    public static int field144 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!hd", name = "m", descriptor = "Lnh;")
    public static class54 field149 = new class54(64);

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "[B")
    public static byte[] field151;

    @OriginalMember(owner = "client!hd", name = "t", descriptor = "Lcf;")
    private static class93 field156;

    @OriginalMember(owner = "client!hd", name = "r", descriptor = "Lcf;")
    public static class93 field154;

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "Lmb;")
    public static class160 field152;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "I")
    public static int field137;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
    public static int field139;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "I")
    public static int field140;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "I")
    public static int field142;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "I")
    public static int field145;

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "I")
    public static int field147;

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "I")
    public static int field148;

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "I")
    public static int field150;

    @OriginalMember(owner = "client!hd", name = "q", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!hd", name = "s", descriptor = "Lfe;")
    public static class253 field155;

    @OriginalMember(owner = "client!hd", name = "u", descriptor = "Lclient;")
    public static client field157;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)V")
    public static void method47(byte arg0) {
        field149 = null;
        int var1 = -90 / ((arg0 - 16) / 53);
        field155 = null;
        field157 = null;
        field154 = null;
        field156 = null;
        field151 = null;
        field152 = null;
    }

    @OriginalMember(owner = "client!hd", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        field147++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V")
    public static final void method48(int arg0) {
        field141++;
        class152.field2668.method294(0);
        class51.field834.method294(arg0 ^ arg0);
    }

    @OriginalMember(owner = "client!hd", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class272.field4835 != null) {
            client.field2739 = 0;
            class245.field4402 = -1;
            class238.field4259 = -1;
        }
        field137++;
    }

    @OriginalMember(owner = "client!hd", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class272.field4835 != null) {
            client.field2739 = 0;
            class245.field4402 = arg0.getX();
            class238.field4259 = arg0.getY();
        }
        field145++;
    }

    @OriginalMember(owner = "client!hd", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field139++;
    }

    @OriginalMember(owner = "client!hd", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field143++;
        if (class272.field4835 != null) {
            class124.field2204 = 0;
        }
    }

    @OriginalMember(owner = "client!hd", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class272.field4835 != null) {
            client.field2739 = 0;
            class80.field1498 = arg0.getX();
            class170.field2986 = arg0.getY();
            class35.field548 = class28.method155((byte) 113);
            if (arg0.isMetaDown()) {
                class56.field939 = 2;
                class124.field2204 = 2;
            } else {
                class56.field939 = 1;
                class124.field2204 = 1;
            }
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field140++;
    }

    @OriginalMember(owner = "client!hd", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class272.field4835 != null) {
            client.field2739 = 0;
            class124.field2204 = 0;
            int var2 = arg0.getModifiers();
        }
        field148++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!hd", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field142++;
        if (class272.field4835 != null) {
            client.field2739 = 0;
            class245.field4402 = arg0.getX();
            class238.field4259 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!hd", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field146++;
        if (class272.field4835 != null) {
            client.field2739 = 0;
            class245.field4402 = arg0.getX();
            class238.field4259 = arg0.getY();
        }
    }

    static {
        int var0 = 0;
        field151 = new byte[32896];
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field151[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
        field156 = class147.method1066("Choose Option", -48);
        field154 = field156;
        field152 = new class160();
    }
}
