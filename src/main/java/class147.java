import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class147 extends class123 implements MouseWheelListener {

    @OriginalMember(owner = "client!w", name = "j", descriptor = "I")
    private int field3672 = 0;

    @OriginalMember(owner = "client!w", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field3672 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public final void method968(int arg0, Component arg1) {
        arg1.removeMouseWheelListener(this);
        if (arg0 != 256) {
            this.field3672 = -26;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(B)I")
    public final synchronized int method967(byte arg0) {
        int var2 = this.field3672;
        this.field3672 = 0;
        if (arg0 >= -55) {
            this.field3672 = -94;
        }
        return var2;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public final void method970(Component arg0, int arg1) {
        if (arg1 < 0) {
            arg0.addMouseWheelListener(this);
        }
    }
}
