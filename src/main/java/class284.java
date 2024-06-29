import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class284 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!di", name = "h", descriptor = "I")
    public static int field4256 = 16777215;

    @OriginalMember(owner = "client!di", name = "f", descriptor = "Ljava/lang/String;")
    public static String field4254 = "glow2:";

    @OriginalMember(owner = "client!di", name = "k", descriptor = "I")
    public static int field4259 = 0;

    @OriginalMember(owner = "client!di", name = "g", descriptor = "I")
    public static int field4255 = 0;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "I")
    public static int field4249;

    @OriginalMember(owner = "client!di", name = "b", descriptor = "I")
    public static int field4250;

    @OriginalMember(owner = "client!di", name = "c", descriptor = "I")
    public static int field4251;

    @OriginalMember(owner = "client!di", name = "d", descriptor = "I")
    public static int field4252;

    @OriginalMember(owner = "client!di", name = "e", descriptor = "I")
    public static int field4253;

    @OriginalMember(owner = "client!di", name = "i", descriptor = "I")
    public static int field4257;

    @OriginalMember(owner = "client!di", name = "j", descriptor = "I")
    public static int field4258;

    @OriginalMember(owner = "client!di", name = "l", descriptor = "I")
    public static int field4260;

    @OriginalMember(owner = "client!di", name = "m", descriptor = "I")
    public static int field4261;

    @OriginalMember(owner = "client!di", name = "n", descriptor = "I")
    public static int field4262;

    @OriginalMember(owner = "client!di", name = "o", descriptor = "I")
    public static int field4263;

    @OriginalMember(owner = "client!di", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 3)
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class23.field350 != null) {
            class275.field4134 = 0;
            class349.field4941 = -1;
            class228.field3338 = -1;
        }
        field4262++;
    }

    @OriginalMember(owner = "client!di", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 20)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class23.field350 != null) {
            class275.field4134 = 0;
            class439.field6381 = 0;
            int var2 = arg0.getModifiers();
        }
        field4263++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!di", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 54)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field4257++;
        if (class23.field350 != null) {
            class275.field4134 = 0;
            class349.field4941 = arg0.getX();
            class228.field3338 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!di", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 71)
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field4249++;
    }

    @OriginalMember(owner = "client!di", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 83)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class23.field350 != null) {
            class275.field4134 = 0;
            class349.field4941 = arg0.getX();
            class228.field3338 = arg0.getY();
        }
        field4251++;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIII)I", line = 103)
    public static final int method2009(int arg0, int arg1, int arg2, int arg3) {
        field4260++;
        if (arg1 == arg2) {
            return arg1;
        }
        int var4 = 128 - arg3;
        int var5 = (arg1 & 0x7F) * var4 + (arg2 & 0x7F) * arg3 >> 7;
        int var6 = (arg1 & 0x380) * var4 + (arg2 & 0x380) * arg3 >> 7;
        int var7 = (arg1 & arg0) * var4 + (arg2 & 0xFC00) * arg3 >> 7;
        return var6 & 0x380 | var7 & 0xFC00 | var5 & 0x7F;
    }

    @OriginalMember(owner = "client!di", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 127)
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class23.field350 != null) {
            class275.field4134 = 0;
            class333.field4777 = arg0.getX();
            class452.field6563 = arg0.getY();
            class34.field496 = class10.method63(-21149);
            if (arg0.isMetaDown()) {
                class432.field6230 = 2;
                class439.field6381 = 2;
            } else {
                class432.field6230 = 1;
                class439.field6381 = 1;
            }
            int var2 = arg0.getModifiers();
        }
        field4252++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!di", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 178)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class23.field350 != null) {
            class439.field6381 = 0;
        }
        field4258++;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V", line = 189)
    public static void method2010(int arg0) {
        field4254 = null;
        if (arg0 >= -65) {
            field4255 = 63;
        }
    }

    @OriginalMember(owner = "client!di", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 205)
    public final void focusGained(FocusEvent arg0) {
        field4261++;
    }

    @OriginalMember(owner = "client!di", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 214)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class23.field350 != null) {
            class275.field4134 = 0;
            class349.field4941 = arg0.getX();
            class228.field3338 = arg0.getY();
        }
        field4253++;
    }
}
