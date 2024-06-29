import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class200 extends class169 implements MouseWheelListener {

    @OriginalMember(owner = "client!ij", name = "j", descriptor = "I")
    private int field3141 = 0;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public final void method1127(int arg0, Component arg1) {
        if (arg0 != 0) {
            this.field3141 = -17;
        }
        arg1.removeMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    public final void method1125(Component arg0, boolean arg1) {
        arg0.addMouseWheelListener(this);
        if (arg1) {
            this.mouseWheelMoved((MouseWheelEvent) null);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)I")
    public final synchronized int method1130(int arg0) {
        int var2 = this.field3141;
        this.field3141 = 0;
        if (arg0 != 2) {
            this.field3141 = 22;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ij", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field3141 += arg0.getWheelRotation();
    }
}
