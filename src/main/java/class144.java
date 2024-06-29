import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class144 extends class229 implements MouseWheelListener {

    @OriginalMember(owner = "client!en", name = "h", descriptor = "I")
    private int field2305 = 0;

    @OriginalMember(owner = "client!en", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 10)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2305 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(B)I", line = 18)
    public final synchronized int method1013(byte arg0) {
        int var2 = this.field2305;
        if (arg0 != 113) {
            this.field2305 = 5;
        }
        this.field2305 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Ljava/awt/Component;Z)V", line = 30)
    public final void method1014(Component arg0, boolean arg1) {
        if (!arg1) {
            this.field2305 = -43;
        }
        arg0.removeMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(Ljava/awt/Component;Z)V", line = 40)
    public final void method1015(Component arg0, boolean arg1) {
        if (arg1) {
            arg0.addMouseWheelListener(this);
        }
    }
}
