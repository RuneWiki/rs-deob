import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class50 extends class24 implements MouseWheelListener {

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "I")
    private int field1148 = 0;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public final void method148(Component arg0, int arg1) {
        if (arg1 > -23) {
            this.field1148 = 58;
        }
        arg0.removeMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!ha", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field1148 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public final void method147(int arg0, Component arg1) {
        arg1.addMouseWheelListener(this);
        if (arg0 != 0) {
            this.mouseWheelMoved(null);
        }
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)I")
    public final synchronized int method149(int arg0) {
        int var2 = this.field1148;
        this.field1148 = 0;
        return arg0 >= -127 ? 11 : var2;
    }
}
