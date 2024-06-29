import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class327 extends class86 implements MouseWheelListener {

    @OriginalMember(owner = "client!bf", name = "n", descriptor = "I")
    private int field5680 = 0;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(Ljava/awt/Component;Z)V", line = 4)
    public final void method565(Component arg0, boolean arg1) {
        if (arg1) {
            this.mouseWheelMoved((MouseWheelEvent) null);
        }
        arg0.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!bf", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 14)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field5680 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Ljava/awt/Component;Z)V", line = 25)
    public final void method561(Component arg0, boolean arg1) {
        arg0.removeMouseWheelListener(this);
        if (arg1) {
            this.method565((Component) null, false);
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)I", line = 36)
    public final synchronized int method563(int arg0) {
        int var2 = this.field5680;
        if (arg0 != 1424) {
            this.method561((Component) null, true);
        }
        this.field5680 = 0;
        return var2;
    }
}
