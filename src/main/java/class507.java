import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class507 extends class471 implements MouseWheelListener {

    @OriginalMember(owner = "client!wn", name = "e", descriptor = "I")
    private int field7475 = 0;

    @OriginalMember(owner = "client!wn", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 4)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field7475 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 12)
    public final void method2830(int arg0, Component arg1) {
        arg1.removeMouseWheelListener(this);
        if (arg0 != 73) {
            this.method2829(null, 117);
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(B)I", line = 26)
    public final synchronized int method2828(byte arg0) {
        if (arg0 >= -65) {
            this.method2829(null, -20);
        }
        int var2 = this.field7475;
        this.field7475 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 38)
    public final void method2829(Component arg0, int arg1) {
        arg0.addMouseWheelListener(this);
        if (arg1 != -29157) {
            this.method2830(-111, null);
        }
    }
}
