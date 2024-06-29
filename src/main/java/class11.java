import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class11 extends class273 implements MouseWheelListener {

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "I")
    private int field166 = 0;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public final void method114(Component arg0, int arg1) {
        if (arg1 != 13) {
            this.field166 = -42;
        }
        arg0.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!hd", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field166 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public final void method115(int arg0, Component arg1) {
        if (arg0 == -8050) {
            arg1.removeMouseWheelListener(this);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)I")
    public final synchronized int method116(int arg0) {
        if (arg0 == 64209450) {
            int var2 = this.field166;
            this.field166 = 0;
            return var2;
        } else {
            return 72;
        }
    }
}
