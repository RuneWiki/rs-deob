import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class251 extends class152 implements MouseWheelListener {

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "I")
    private int field3449 = 0;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public final void method951(Component arg0, byte arg1) {
        if (arg1 != -84) {
            this.field3449 = -21;
        }
        arg0.removeMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public final void method956(Component arg0, int arg1) {
        arg0.addMouseWheelListener(this);
        if (arg1 <= 5) {
            this.field3449 = 51;
        }
    }

    @OriginalMember(owner = "client!bj", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field3449 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)I")
    public final synchronized int method954(int arg0) {
        int var2 = this.field3449;
        this.field3449 = 0;
        return arg0 < 104 ? -66 : var2;
    }
}
