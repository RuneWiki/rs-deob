import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class6 extends class127 implements MouseWheelListener {

    @OriginalMember(owner = "client!ae", name = "u", descriptor = "I")
    private int field118 = 0;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public final void method29(Component arg0, byte arg1) {
        arg0.removeMouseWheelListener(this);
        if (arg1 != -68) {
            this.method30(-53, null);
        }
    }

    @OriginalMember(owner = "client!ae", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field118 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public final void method30(int arg0, Component arg1) {
        if (arg0 != 4) {
            this.mouseWheelMoved(null);
        }
        arg1.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(B)I")
    public final synchronized int method31(byte arg0) {
        if (arg0 <= 11) {
            this.field118 = 13;
        }
        int var2 = this.field118;
        this.field118 = 0;
        return var2;
    }
}
