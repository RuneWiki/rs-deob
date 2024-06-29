import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class4 extends class59 implements MouseWheelListener {

    @OriginalMember(owner = "client!vd", name = "o", descriptor = "I")
    private int field43 = 0;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZLjava/awt/Component;)V")
    public final void method58(boolean arg0, Component arg1) {
        arg1.removeMouseWheelListener(this);
        if (!arg0) {
            this.mouseWheelMoved((MouseWheelEvent) null);
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)I")
    public final synchronized int method59(int arg0) {
        if (arg0 != 29262) {
            this.method58(false, (Component) null);
        }
        int var2 = this.field43;
        this.field43 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!vd", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field43 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(ZLjava/awt/Component;)V")
    public final void method60(boolean arg0, Component arg1) {
        arg1.addMouseWheelListener(this);
        if (arg0) {
            this.field43 = 2;
        }
    }
}
