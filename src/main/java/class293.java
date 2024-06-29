import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class293 extends class402 implements MouseWheelListener {

    @OriginalMember(owner = "client!q", name = "e", descriptor = "I")
    private int field3917 = 0;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public final void method1678(int arg0, Component arg1) {
        if (arg0 != 8212) {
            this.method1680(78);
        }
        arg1.removeMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public final void method1679(Component arg0, int arg1) {
        arg0.addMouseWheelListener(this);
        if (arg1 != -8794) {
            this.field3917 = -10;
        }
    }

    @OriginalMember(owner = "client!q", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field3917 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)I")
    public final synchronized int method1680(int arg0) {
        int var2 = this.field3917;
        if (arg0 != -5935) {
            this.field3917 = -29;
        }
        this.field3917 = 0;
        return var2;
    }
}
