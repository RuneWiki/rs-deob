import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class230 extends class244 implements MouseWheelListener {

    @OriginalMember(owner = "client!i", name = "m", descriptor = "I")
    private int field3533 = 0;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)I", line = 5)
    public final synchronized int method1667(int arg0) {
        int var2 = this.field3533;
        if (arg0 == -2005100980) {
            this.field3533 = 0;
            return var2;
        } else {
            return -87;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 17)
    public final void method1668(Component arg0, int arg1) {
        if (arg1 != 128) {
            this.field3533 = 124;
        }
        arg0.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 31)
    public final void method1669(int arg0, Component arg1) {
        arg1.removeMouseWheelListener(this);
        if (arg0 != 128) {
            this.field3533 = -68;
        }
    }

    @OriginalMember(owner = "client!i", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 41)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field3533 += arg0.getWheelRotation();
    }
}
