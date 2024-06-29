import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class187 extends class248 implements MouseWheelListener {

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
    private int field3005 = 0;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)I")
    public final synchronized int method1280(int arg0) {
        if (arg0 == 31813) {
            int var2 = this.field3005;
            this.field3005 = 0;
            return var2;
        } else {
            return -106;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    public final void method1281(Component arg0, boolean arg1) {
        arg0.addMouseWheelListener(this);
        if (arg1) {
            this.field3005 = -53;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public final void method1282(int arg0, Component arg1) {
        if (arg0 < -83) {
            arg1.removeMouseWheelListener(this);
        }
    }

    @OriginalMember(owner = "client!ia", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field3005 += arg0.getWheelRotation();
    }
}
