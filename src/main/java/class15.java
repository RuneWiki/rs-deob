import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class15 extends class187 implements MouseWheelListener {

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "I")
    private int field260 = 0;

    @OriginalMember(owner = "client!bd", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field260 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public final void method81(Component arg0, int arg1) {
        if (arg1 < -119) {
            arg0.addMouseWheelListener(this);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)I")
    public final synchronized int method82(boolean arg0) {
        if (arg0) {
            return -22;
        } else {
            int var2 = this.field260;
            this.field260 = 0;
            return var2;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    public final void method83(Component arg0, boolean arg1) {
        if (!arg1) {
            this.field260 = 84;
        }
        arg0.removeMouseWheelListener(this);
    }
}
