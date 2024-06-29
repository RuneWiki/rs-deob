import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class26 extends class292 implements MouseWheelListener {

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "I")
    private int field453 = 0;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 4)
    public final void method316(byte arg0, Component arg1) {
        arg1.addMouseWheelListener(this);
        int var3 = -75 % ((arg0 + 56) / 61);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)I", line = 15)
    public final synchronized int method317(byte arg0) {
        int var2 = this.field453;
        if (arg0 < 30) {
            this.mouseWheelMoved((MouseWheelEvent) null);
        }
        this.field453 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!ic", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 27)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field453 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 34)
    public final void method318(Component arg0, int arg1) {
        arg0.removeMouseWheelListener(this);
        int var3 = -67 / ((-arg1 - 22) / 52);
    }
}
