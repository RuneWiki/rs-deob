import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class127 extends class300 implements MouseWheelListener {

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "I")
    private int field2252 = 0;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)I", line = 5)
    public final synchronized int method881(int arg0) {
        if (arg0 < 30) {
            this.method881(-26);
        }
        int var2 = this.field2252;
        this.field2252 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 17)
    public final void method882(int arg0, Component arg1) {
        if (arg0 <= 49) {
            this.field2252 = -68;
        }
        arg1.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 27)
    public final void method883(Component arg0, int arg1) {
        if (arg1 == 0) {
            arg0.removeMouseWheelListener(this);
        }
    }

    @OriginalMember(owner = "client!aj", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 37)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2252 += arg0.getWheelRotation();
    }
}
