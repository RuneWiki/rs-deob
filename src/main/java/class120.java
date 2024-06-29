import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class120 extends class19 implements MouseWheelListener {

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "I")
    private int field2325 = 0;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public final void method114(Component arg0, byte arg1) {
        arg0.addMouseWheelListener(this);
        if (arg1 != -55) {
            this.mouseWheelMoved(null);
        }
    }

    @OriginalMember(owner = "client!ma", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2325 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public final void method112(Component arg0, int arg1) {
        arg0.removeMouseWheelListener(this);
        if (arg1 != 15929) {
            this.method120(123);
        }
    }

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "(I)I")
    public final synchronized int method120(int arg0) {
        if (arg0 < 102) {
            this.mouseWheelMoved(null);
        }
        int var2 = this.field2325;
        this.field2325 = 0;
        return var2;
    }
}
