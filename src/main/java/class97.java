import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class97 extends class100 implements MouseWheelListener {

    @OriginalMember(owner = "client!o", name = "v", descriptor = "I")
    private int field2439 = 0;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public final void method800(byte arg0, Component arg1) {
        arg1.removeMouseWheelListener(this);
        if (arg0 != -113) {
            this.field2439 = -23;
        }
    }

    @OriginalMember(owner = "client!o", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2439 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(B)I")
    public final synchronized int method801(byte arg0) {
        if (arg0 != -113) {
            this.field2439 = -107;
        }
        int var2 = this.field2439;
        this.field2439 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public final void method802(Component arg0, int arg1) {
        arg0.addMouseWheelListener(this);
        if (arg1 != 0) {
            this.method800((byte) -10, null);
        }
    }
}
