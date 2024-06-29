import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class258 extends class78 implements MouseWheelListener {

    @OriginalMember(owner = "client!fl", name = "h", descriptor = "I")
    private int field4103 = 0;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)I")
    public final synchronized int method609(int arg0) {
        if (arg0 <= 11) {
            this.field4103 = 99;
        }
        int var2 = this.field4103;
        this.field4103 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public final void method608(Component arg0, int arg1) {
        if (arg1 == 17148) {
            arg0.addMouseWheelListener(this);
        }
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(Ljava/awt/Component;I)V")
    public final void method615(Component arg0, int arg1) {
        arg0.removeMouseWheelListener(this);
        if (arg1 != 0) {
            this.field4103 = -71;
        }
    }

    @OriginalMember(owner = "client!fl", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field4103 += arg0.getWheelRotation();
    }
}
