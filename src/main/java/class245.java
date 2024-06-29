import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class245 extends class206 implements MouseWheelListener {

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "I")
    private int field3421 = 0;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public final void method1273(Component arg0, int arg1) {
        arg0.removeMouseWheelListener(this);
        if (arg1 < 26) {
            this.mouseWheelMoved(null);
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public final void method1271(int arg0, Component arg1) {
        if (arg0 != -14358) {
            this.field3421 = -1;
        }
        arg1.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)I")
    public final synchronized int method1275(int arg0) {
        int var2 = this.field3421;
        if (arg0 == 120) {
            this.field3421 = 0;
            return var2;
        } else {
            return 87;
        }
    }

    @OriginalMember(owner = "client!ll", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field3421 += arg0.getWheelRotation();
    }
}
