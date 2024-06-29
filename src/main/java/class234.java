import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class234 extends class59 implements MouseWheelListener {

    @OriginalMember(owner = "client!rf", name = "k", descriptor = "I")
    private int field4112 = 0;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)I")
    public final synchronized int method443(int arg0) {
        int var2 = this.field4112;
        this.field4112 = arg0;
        return var2;
    }

    @OriginalMember(owner = "client!rf", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field4112 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public final void method444(Component arg0, int arg1) {
        arg0.removeMouseWheelListener(this);
        if (arg1 != -29591) {
            this.field4112 = -15;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public final void method442(byte arg0, Component arg1) {
        arg1.addMouseWheelListener(this);
        if (arg0 != 59) {
            this.method443(-52);
        }
    }
}
