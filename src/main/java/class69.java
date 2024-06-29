import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class69 extends class123 implements MouseWheelListener {

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "I")
    private int field1130 = 0;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public final void method466(int arg0, Component arg1) {
        arg1.removeMouseWheelListener(this);
        if (arg0 != 0) {
            this.method468((Component) null, true);
        }
    }

    @OriginalMember(owner = "client!tb", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field1130 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)I")
    public final synchronized int method467(int arg0) {
        int var2 = this.field1130;
        this.field1130 = arg0;
        return var2;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    public final void method468(Component arg0, boolean arg1) {
        arg0.addMouseWheelListener(this);
        if (arg1) {
            this.method468((Component) null, true);
        }
    }
}
