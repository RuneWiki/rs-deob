import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class123 extends class66 implements MouseWheelListener {

    @OriginalMember(owner = "client!re", name = "j", descriptor = "I")
    private int field3178 = 0;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 5)
    public final void method632(Component arg0, int arg1) {
        if (arg1 == 25085) {
            arg0.removeMouseWheelListener(this);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 15)
    public final void method630(byte arg0, Component arg1) {
        arg1.addMouseWheelListener(this);
        if (arg0 > -115) {
            this.field3178 = 93;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(B)I", line = 26)
    public final synchronized int method629(byte arg0) {
        int var2 = this.field3178;
        if (arg0 == 22) {
            this.field3178 = 0;
            return var2;
        } else {
            return -62;
        }
    }

    @OriginalMember(owner = "client!re", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 38)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field3178 += arg0.getWheelRotation();
    }
}
