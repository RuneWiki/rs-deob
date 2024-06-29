import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class21 extends class85 implements MouseWheelListener {

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "I")
    private int field536 = 0;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public final void method148(Component arg0, int arg1) {
        if (arg1 == 1) {
            arg0.removeMouseWheelListener(this);
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)I")
    public final synchronized int method149(int arg0) {
        int var2 = this.field536;
        if (arg0 != 159) {
            this.mouseWheelMoved(null);
        }
        this.field536 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!bj", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field536 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public final void method150(int arg0, Component arg1) {
        if (arg0 != -20016) {
            this.method148(null, 52);
        }
        arg1.addMouseWheelListener(this);
    }
}
