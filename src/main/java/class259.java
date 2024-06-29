import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class259 extends class147 implements MouseWheelListener {

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "I")
    private int field4583 = 0;

    @OriginalMember(owner = "client!oh", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field4583 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)I")
    public final synchronized int method963(byte arg0) {
        int var2 = this.field4583;
        if (arg0 >= -40) {
            this.method962((Component) null, (byte) -11);
        }
        this.field4583 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public final void method962(Component arg0, byte arg1) {
        arg0.addMouseWheelListener(this);
        if (arg1 != -113) {
            this.field4583 = 52;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public final void method961(int arg0, Component arg1) {
        arg1.removeMouseWheelListener(this);
        if (arg0 != -22966) {
            this.mouseWheelMoved((MouseWheelEvent) null);
        }
    }
}
