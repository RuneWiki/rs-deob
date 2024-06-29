import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class42 extends class30 implements MouseWheelListener {

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "I")
    private int field926 = 0;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public final void method200(int arg0, Component arg1) {
        if (arg0 != 16) {
            this.field926 = 39;
        }
        arg1.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public final void method194(Component arg0, int arg1) {
        arg0.removeMouseWheelListener(this);
        if (arg1 != 16) {
            this.method196(37);
        }
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)I")
    public final synchronized int method196(int arg0) {
        int var2 = this.field926;
        if (arg0 != -3227) {
            this.field926 = 82;
        }
        this.field926 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!sd", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field926 += arg0.getWheelRotation();
    }
}
