import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class183 extends class149 implements MouseWheelListener {

    @OriginalMember(owner = "client!le", name = "k", descriptor = "I")
    private int field2625 = 0;

    @OriginalMember(owner = "client!le", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2625 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    public final void method982(Component arg0, boolean arg1) {
        arg0.removeMouseWheelListener(this);
        if (arg1) {
            this.method982((Component) null, true);
        }
    }

    @OriginalMember(owner = "client!le", name = "d", descriptor = "(I)I")
    public final synchronized int method985(int arg0) {
        int var2 = this.field2625;
        this.field2625 = 0;
        if (arg0 >= -111) {
            this.field2625 = 50;
        }
        return var2;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ZLjava/awt/Component;)V")
    public final void method986(boolean arg0, Component arg1) {
        if (!arg0) {
            this.field2625 = -69;
        }
        arg1.addMouseWheelListener(this);
    }
}
