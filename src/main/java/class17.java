import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class17 extends class18 implements MouseWheelListener {

    @OriginalMember(owner = "client!cb", name = "t", descriptor = "I")
    private int field341 = 0;

    @OriginalMember(owner = "client!cb", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 4)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field341 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 11)
    public final void method137(byte arg0, Component arg1) {
        if (arg0 != 14) {
            this.field341 = 12;
        }
        arg1.removeMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 21)
    public final void method138(Component arg0, int arg1) {
        arg0.addMouseWheelListener(this);
        if (arg1 > -86) {
            this.field341 = 86;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)I", line = 31)
    public final synchronized int method139(byte arg0) {
        if (arg0 != 36) {
            this.field341 = -76;
        }
        int var2 = this.field341;
        this.field341 = 0;
        return var2;
    }
}
