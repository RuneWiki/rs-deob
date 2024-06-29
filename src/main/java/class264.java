import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class264 extends class110 implements MouseWheelListener {

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "I")
    private int field4573 = 0;

    @OriginalMember(owner = "client!ae", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 4)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field4573 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 11)
    public final void method862(Component arg0, int arg1) {
        arg0.removeMouseWheelListener(this);
        if (arg1 != -1706) {
            this.method862((Component) null, 47);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)I", line = 22)
    public final synchronized int method861(int arg0) {
        if (arg0 <= 20) {
            this.field4573 = -10;
        }
        int var2 = this.field4573;
        this.field4573 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 35)
    public final void method864(int arg0, Component arg1) {
        arg1.addMouseWheelListener(this);
        int var3 = -26 % ((arg0 - 72) / 54);
    }
}
