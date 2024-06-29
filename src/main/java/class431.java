import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class431 extends class350 implements MouseWheelListener {

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "I")
    private int field6241 = 0;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Z)I", line = 4)
    public final synchronized int method2227(boolean arg0) {
        if (!arg0) {
            this.mouseWheelMoved((MouseWheelEvent) null);
        }
        int var2 = this.field6241;
        this.field6241 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 17)
    public final void method2229(int arg0, Component arg1) {
        if (arg0 != 20159) {
            this.method2229(71, (Component) null);
        }
        arg1.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!hb", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 27)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field6241 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 40)
    public final void method2230(Component arg0, int arg1) {
        if (arg1 != -15174) {
            this.field6241 = -91;
        }
        arg0.removeMouseWheelListener(this);
    }
}
