import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class197 extends class174 implements MouseWheelListener {

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "I")
    private int field3295 = 0;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)I")
    public final synchronized int method1226(int arg0) {
        int var2 = this.field3295;
        this.field3295 = arg0;
        return var2;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    public final void method1225(Component arg0, boolean arg1) {
        if (arg1) {
            this.method1225((Component) null, true);
        }
        arg0.removeMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!pa", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field3295 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public final void method1223(byte arg0, Component arg1) {
        arg1.addMouseWheelListener(this);
        if (arg0 >= -80) {
            this.method1226(67);
        }
    }
}
