import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public class class454 extends class35 implements MouseWheelListener {

    @OriginalMember(owner = "client!hr", name = "g", descriptor = "I")
    private int field6350 = 0;

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 5)
    public final void method230(byte arg0, Component arg1) {
        if (arg0 <= 76) {
            this.method228(-27);
        }
        arg1.removeMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(I)I", line = 15)
    public final synchronized int method228(int arg0) {
        if (arg0 != -15720) {
            this.mouseWheelMoved(null);
        }
        int var2 = this.field6350;
        this.field6350 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Ljava/awt/Component;Z)V", line = 28)
    public final void method227(Component arg0, boolean arg1) {
        arg0.addMouseWheelListener(this);
        if (arg1) {
            this.method228(-46);
        }
    }

    @OriginalMember(owner = "client!hr", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 41)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field6350 += arg0.getWheelRotation();
    }
}
