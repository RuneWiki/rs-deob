import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class427 extends class36 implements MouseWheelListener {

    @OriginalMember(owner = "client!vo", name = "h", descriptor = "I")
    private int field5896 = 0;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public final void method305(Component arg0, int arg1) {
        arg0.addMouseWheelListener(this);
        if (arg1 != 24346) {
            this.field5896 = -55;
        }
    }

    @OriginalMember(owner = "client!vo", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field5896 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public final void method307(int arg0, Component arg1) {
        if (arg0 == 32269) {
            arg1.removeMouseWheelListener(this);
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(Z)I")
    public final synchronized int method304(boolean arg0) {
        if (!arg0) {
            this.method307(59, (Component) null);
        }
        int var2 = this.field5896;
        this.field5896 = 0;
        return var2;
    }
}
