import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class148 extends class11 implements MouseWheelListener {

    @OriginalMember(owner = "client!qh", name = "s", descriptor = "I")
    private int field2685 = 0;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    public final void method50(Component arg0, boolean arg1) {
        arg0.addMouseWheelListener(this);
        if (!arg1) {
            this.method45(false);
        }
    }

    @OriginalMember(owner = "client!qh", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2685 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public final void method46(int arg0, Component arg1) {
        if (arg0 != 100) {
            this.method45(true);
        }
        arg1.removeMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Z)I")
    public final synchronized int method45(boolean arg0) {
        if (arg0) {
            this.method50((Component) null, true);
        }
        int var2 = this.field2685;
        this.field2685 = 0;
        return var2;
    }
}
