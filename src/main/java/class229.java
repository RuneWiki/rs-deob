import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class229 extends class137 implements MouseWheelListener {

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "I")
    private int field3829 = 0;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public final void method1001(int arg0, Component arg1) {
        if (arg0 == 21207) {
            arg1.removeMouseWheelListener(this);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Z)I")
    public final synchronized int method1000(boolean arg0) {
        int var2 = this.field3829;
        if (!arg0) {
            this.mouseWheelMoved((MouseWheelEvent) null);
        }
        this.field3829 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!ga", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field3829 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    public final void method1004(Component arg0, boolean arg1) {
        if (!arg1) {
            this.method1000(true);
        }
        arg0.addMouseWheelListener(this);
    }
}
