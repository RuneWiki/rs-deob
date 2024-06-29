import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class187 extends class220 implements MouseWheelListener {

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "I")
    private int field3430 = 0;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    public final void method1345(Component arg0, boolean arg1) {
        arg0.removeMouseWheelListener(this);
        if (arg1) {
            this.field3430 = 25;
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)I")
    public final synchronized int method1346(int arg0) {
        int var2 = this.field3430;
        this.field3430 = 0;
        return arg0 == -1 ? var2 : 83;
    }

    @OriginalMember(owner = "client!fc", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field3430 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public final void method1347(int arg0, Component arg1) {
        if (arg0 <= 109) {
            this.field3430 = -54;
        }
        arg1.addMouseWheelListener(this);
    }
}
