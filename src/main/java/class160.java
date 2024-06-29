import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class160 extends class62 implements MouseWheelListener {

    @OriginalMember(owner = "client!om", name = "h", descriptor = "I")
    private int field2715 = 0;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Ljava/awt/Component;Z)V", line = 4)
    public final void method483(Component arg0, boolean arg1) {
        if (arg1) {
            this.field2715 = -100;
        }
        arg0.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(I)I", line = 16)
    public final synchronized int method484(int arg0) {
        int var2 = this.field2715;
        if (arg0 < 3) {
            return -92;
        } else {
            this.field2715 = 0;
            return var2;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 28)
    public final void method481(Component arg0, byte arg1) {
        if (arg1 != -64) {
            this.method483((Component) null, true);
        }
        arg0.removeMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!om", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 38)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2715 += arg0.getWheelRotation();
    }
}
