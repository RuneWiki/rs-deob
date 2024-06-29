import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class47 extends class43 implements MouseWheelListener {

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "I")
    private int field997 = 0;

    @OriginalMember(owner = "client!eb", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field997 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)I")
    public final synchronized int method360(byte arg0) {
        if (arg0 != -104) {
            this.mouseWheelMoved(null);
        }
        int var2 = this.field997;
        this.field997 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public final void method362(Component arg0, int arg1) {
        arg0.removeMouseWheelListener(this);
        if (arg1 != -28077) {
            this.field997 = -50;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZLjava/awt/Component;)V")
    public final void method365(boolean arg0, Component arg1) {
        arg1.addMouseWheelListener(this);
        if (arg0) {
            this.field997 = 13;
        }
    }
}
