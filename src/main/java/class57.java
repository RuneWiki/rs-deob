import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class57 extends class129 implements MouseWheelListener {

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "I")
    private int field1280 = 0;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public final void method447(Component arg0, byte arg1) {
        if (arg1 >= 74) {
            arg0.removeMouseWheelListener(this);
        }
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(ILjava/awt/Component;)V")
    public final void method448(int arg0, Component arg1) {
        arg1.addMouseWheelListener(this);
        if (arg0 != -28706) {
            this.field1280 = -15;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)I")
    public final synchronized int method449(boolean arg0) {
        int var2 = this.field1280;
        if (arg0) {
            this.field1280 = 0;
            return var2;
        } else {
            return 15;
        }
    }

    @OriginalMember(owner = "client!ia", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field1280 += arg0.getWheelRotation();
    }
}
