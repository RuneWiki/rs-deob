import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class33 extends class126 implements MouseWheelListener {

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "I")
    private int field688 = 0;

    @OriginalMember(owner = "client!dd", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field688 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZLjava/awt/Component;)V")
    public final void method224(boolean arg0, Component arg1) {
        if (arg0) {
            this.method225(-120);
        }
        arg1.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)I")
    public final synchronized int method225(int arg0) {
        if (arg0 == -2) {
            int var2 = this.field688;
            this.field688 = 0;
            return var2;
        } else {
            return -49;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public final void method226(int arg0, Component arg1) {
        arg1.removeMouseWheelListener(this);
        if (arg0 != 0) {
            this.method226(-114, null);
        }
    }
}
