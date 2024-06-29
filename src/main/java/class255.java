import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class255 extends class393 implements MouseWheelListener {

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "I")
    private int field3492 = 0;

    @OriginalMember(owner = "client!vj", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field3492 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)I")
    public final synchronized int method1568(int arg0) {
        int var2 = this.field3492;
        this.field3492 = 0;
        if (arg0 <= 14) {
            this.field3492 = 2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public final void method1569(int arg0, Component arg1) {
        arg1.removeMouseWheelListener(this);
        if (arg0 != 42) {
            this.method1568(51);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public final void method1570(Component arg0, int arg1) {
        arg0.addMouseWheelListener(this);
        if (arg1 > -10) {
            this.method1570((Component) null, -29);
        }
    }
}
