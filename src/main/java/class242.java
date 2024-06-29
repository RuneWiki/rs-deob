import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class242 extends class287 implements MouseWheelListener {

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "I")
    private int field3757 = 0;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)I")
    public final synchronized int method1651(int arg0) {
        int var2 = this.field3757;
        int var3 = 114 % ((arg0 - 51) / 46);
        this.field3757 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public final void method1652(byte arg0, Component arg1) {
        arg1.removeMouseWheelListener(this);
        int var3 = 82 % ((arg0 - 47) / 54);
    }

    @OriginalMember(owner = "client!pa", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field3757 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public final void method1653(Component arg0, int arg1) {
        if (arg1 != -1) {
            this.method1651(-7);
        }
        arg0.addMouseWheelListener(this);
    }
}
