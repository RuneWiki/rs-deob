import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class39 extends class198 implements MouseWheelListener {

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "I")
    private int field526 = 0;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public final void method260(Component arg0, int arg1) {
        arg0.removeMouseWheelListener(this);
        if (arg1 != 509) {
            this.method262((byte) 76);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    public final void method261(Component arg0, boolean arg1) {
        if (arg1) {
            arg0.addMouseWheelListener(this);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)I")
    public final synchronized int method262(byte arg0) {
        int var2 = this.field526;
        this.field526 = 0;
        if (arg0 > -31) {
            this.method260(null, -8);
        }
        return var2;
    }

    @OriginalMember(owner = "client!dd", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field526 += arg0.getWheelRotation();
    }
}
