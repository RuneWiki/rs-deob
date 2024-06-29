import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class9 extends class258 implements MouseWheelListener {

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "I")
    private int field124 = 0;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public final void method42(Component arg0, int arg1) {
        arg0.addMouseWheelListener(this);
        if (arg1 != 30153) {
            this.method43(100);
        }
    }

    @OriginalMember(owner = "client!ig", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field124 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(I)I")
    public final synchronized int method43(int arg0) {
        int var2 = this.field124;
        if (arg0 == -23869) {
            this.field124 = 0;
            return var2;
        } else {
            return 87;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public final void method44(byte arg0, Component arg1) {
        if (arg0 != 106) {
            this.field124 = 60;
        }
        arg1.removeMouseWheelListener(this);
    }
}
