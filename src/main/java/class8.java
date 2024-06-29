import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class8 extends class40 implements MouseWheelListener {

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
    private int field89 = 0;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public final void method49(byte arg0, Component arg1) {
        int var3 = -6 % ((54 - arg0) / 38);
        arg1.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)I")
    public final synchronized int method50(byte arg0) {
        int var2 = this.field89;
        this.field89 = 0;
        if (arg0 != 58) {
            this.field89 = 50;
        }
        return var2;
    }

    @OriginalMember(owner = "client!bc", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field89 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public final void method51(Component arg0, byte arg1) {
        if (arg1 != 69) {
            this.field89 = 122;
        }
        arg0.removeMouseWheelListener(this);
    }
}
