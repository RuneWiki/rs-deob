import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class256 extends class20 implements MouseWheelListener {

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "I")
    private int field4442 = 0;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 4)
    public final void method198(Component arg0, int arg1) {
        arg0.removeMouseWheelListener(this);
        int var3 = -37 % ((arg1 + 4) / 44);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Z)I", line = 14)
    public final synchronized int method199(boolean arg0) {
        int var2 = this.field4442;
        if (arg0) {
            return 96;
        } else {
            this.field4442 = 0;
            return var2;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 26)
    public final void method196(byte arg0, Component arg1) {
        if (arg0 == -7) {
            arg1.addMouseWheelListener(this);
        }
    }

    @OriginalMember(owner = "client!jh", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 36)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field4442 += arg0.getWheelRotation();
    }
}
