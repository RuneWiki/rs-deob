import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class150 extends class100 implements MouseWheelListener {

    @OriginalMember(owner = "client!vd", name = "r", descriptor = "I")
    private int field3313 = 0;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public final void method808(Component arg0, byte arg1) {
        arg0.addMouseWheelListener(this);
        if (arg1 < 32) {
            this.field3313 = 13;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)I")
    public final synchronized int method805(int arg0) {
        if (arg0 != 1) {
            this.mouseWheelMoved(null);
        }
        int var2 = this.field3313;
        this.field3313 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public final void method801(byte arg0, Component arg1) {
        if (arg0 != 48) {
            this.field3313 = 47;
        }
        arg1.removeMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!vd", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field3313 += arg0.getWheelRotation();
    }
}
