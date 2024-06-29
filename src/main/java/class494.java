import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class494 extends class99 implements MouseWheelListener {

    @OriginalMember(owner = "client!dq", name = "k", descriptor = "I")
    private int field7221 = 0;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public final void method604(byte arg0, Component arg1) {
        if (arg0 != 77) {
            this.method610(13, null);
        }
        arg1.removeMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!dq", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field7221 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public final void method610(int arg0, Component arg1) {
        arg1.addMouseWheelListener(this);
        if (arg0 != 256) {
            this.method610(99, null);
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(B)I")
    public final synchronized int method608(byte arg0) {
        if (arg0 <= 59) {
            this.field7221 = -87;
        }
        int var2 = this.field7221;
        this.field7221 = 0;
        return var2;
    }
}
