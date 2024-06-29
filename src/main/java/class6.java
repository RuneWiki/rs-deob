import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class6 extends class189 implements MouseWheelListener {

    @OriginalMember(owner = "client!kg", name = "j", descriptor = "I")
    private int field142 = 0;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Z)I")
    public final synchronized int method103(boolean arg0) {
        int var2 = this.field142;
        if (!arg0) {
            this.method103(false);
        }
        this.field142 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public final void method104(byte arg0, Component arg1) {
        arg1.removeMouseWheelListener(this);
        int var3 = 54 / ((arg0 - 44) / 56);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public final void method105(Component arg0, int arg1) {
        if (arg1 > -67) {
            this.method105((Component) null, 26);
        }
        arg0.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!kg", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field142 += arg0.getWheelRotation();
    }
}
