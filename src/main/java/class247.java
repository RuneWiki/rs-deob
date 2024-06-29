import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class247 extends class216 implements MouseWheelListener {

    @OriginalMember(owner = "client!mk", name = "j", descriptor = "I")
    private int field4131 = 0;

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(I)I")
    public final synchronized int method1541(int arg0) {
        int var2 = this.field4131;
        this.field4131 = 0;
        return arg0 == -1 ? var2 : -116;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public final void method1545(Component arg0, int arg1) {
        arg0.addMouseWheelListener(this);
        int var3 = -103 / ((31 - arg1) / 38);
    }

    @OriginalMember(owner = "client!mk", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field4131 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public final void method1542(Component arg0, byte arg1) {
        arg0.removeMouseWheelListener(this);
        if (arg1 != 31) {
            this.method1545((Component) null, -20);
        }
    }
}
