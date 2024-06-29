import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class295 extends class114 implements MouseWheelListener {

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "I")
    private int field4675 = 0;

    @OriginalMember(owner = "client!lh", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field4675 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Z)I")
    public final synchronized int method841(boolean arg0) {
        int var2 = this.field4675;
        if (!arg0) {
            this.method840(-71, (Component) null);
        }
        this.field4675 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public final void method842(Component arg0, byte arg1) {
        arg0.removeMouseWheelListener(this);
        if (arg1 >= -119) {
            this.field4675 = 58;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public final void method840(int arg0, Component arg1) {
        if (arg0 == 7) {
            arg1.addMouseWheelListener(this);
        }
    }
}
