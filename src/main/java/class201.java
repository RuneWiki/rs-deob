import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class201 extends class1 implements MouseWheelListener {

    @OriginalMember(owner = "client!ij", name = "i", descriptor = "I")
    private int field2793 = 0;

    @OriginalMember(owner = "client!ij", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2793 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)I")
    public final synchronized int method2(int arg0) {
        int var2 = this.field2793;
        if (arg0 == -218) {
            this.field2793 = 0;
            return var2;
        } else {
            return 38;
        }
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(Ljava/awt/Component;I)V")
    public final void method6(Component arg0, int arg1) {
        arg0.removeMouseWheelListener(this);
        if (arg1 != 22830) {
            this.method6((Component) null, -35);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public final void method4(Component arg0, int arg1) {
        if (arg1 == 4) {
            arg0.addMouseWheelListener(this);
        }
    }
}
