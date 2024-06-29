import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class203 extends class43 implements MouseWheelListener {

    @OriginalMember(owner = "client!ih", name = "m", descriptor = "I")
    private int field3660 = 0;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)I")
    public final synchronized int method245(byte arg0) {
        if (arg0 != -56) {
            this.field3660 = -19;
        }
        int var2 = this.field3660;
        this.field3660 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZLjava/awt/Component;)V")
    public final void method248(boolean arg0, Component arg1) {
        arg1.addMouseWheelListener(this);
        if (arg0) {
            this.method248(true, (Component) null);
        }
    }

    @OriginalMember(owner = "client!ih", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field3660 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public final void method251(byte arg0, Component arg1) {
        arg1.removeMouseWheelListener(this);
        if (arg0 != 52) {
            this.method248(false, (Component) null);
        }
    }
}
