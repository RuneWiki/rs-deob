import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class49 extends class190 implements MouseWheelListener {

    @OriginalMember(owner = "client!eh", name = "p", descriptor = "I")
    private int field1032 = 0;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public final void method338(Component arg0, int arg1) {
        if (arg1 != 64) {
            this.field1032 = -41;
        }
        arg0.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(Ljava/awt/Component;I)V")
    public final void method339(Component arg0, int arg1) {
        if (arg1 != 1) {
            this.field1032 = -71;
        }
        arg0.removeMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Z)I")
    public final synchronized int method340(boolean arg0) {
        int var2 = this.field1032;
        if (!arg0) {
            this.method340(false);
        }
        this.field1032 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!eh", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field1032 += arg0.getWheelRotation();
    }
}
