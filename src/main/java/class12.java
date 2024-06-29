import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class12 extends class98 implements MouseWheelListener {

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "I")
    private int field251 = 0;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public final void method68(int arg0, Component arg1) {
        if (arg0 < 123) {
            this.field251 = 45;
        }
        arg1.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!bd", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field251 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ZLjava/awt/Component;)V")
    public final void method69(boolean arg0, Component arg1) {
        arg1.removeMouseWheelListener(this);
        if (arg0) {
            this.method70((byte) -3);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)I")
    public final synchronized int method70(byte arg0) {
        if (arg0 != 109) {
            this.method69(true, null);
        }
        int var2 = this.field251;
        this.field251 = 0;
        return var2;
    }
}
