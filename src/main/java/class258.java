import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class258 extends class139 implements MouseWheelListener {

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "I")
    private int field4427 = 0;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Ljava/awt/Component;Z)V", line = 4)
    public final void method946(Component arg0, boolean arg1) {
        if (arg1) {
            arg0.addMouseWheelListener(this);
        }
    }

    @OriginalMember(owner = "client!ia", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 15)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field4427 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)I", line = 23)
    public final synchronized int method943(byte arg0) {
        if (arg0 < 39) {
            this.field4427 = 60;
        }
        int var2 = this.field4427;
        this.field4427 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 35)
    public final void method944(byte arg0, Component arg1) {
        arg1.removeMouseWheelListener(this);
        if (arg0 != 53) {
            this.field4427 = -72;
        }
    }
}
