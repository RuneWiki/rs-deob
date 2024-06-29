import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class57 extends class335 implements MouseWheelListener {

    @OriginalMember(owner = "client!we", name = "e", descriptor = "I")
    private int field751 = 0;

    @OriginalMember(owner = "client!we", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 4)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field751 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(B)I", line = 13)
    public final synchronized int method402(byte arg0) {
        int var2 = this.field751;
        if (arg0 > -54) {
            return -121;
        } else {
            this.field751 = 0;
            return var2;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 28)
    public final void method403(Component arg0, int arg1) {
        if (arg1 != -1) {
            this.method404((Component) null, true);
        }
        arg0.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/awt/Component;Z)V", line = 38)
    public final void method404(Component arg0, boolean arg1) {
        arg0.removeMouseWheelListener(this);
        if (!arg1) {
            this.method402((byte) -14);
        }
    }
}
