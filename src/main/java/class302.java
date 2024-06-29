import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class302 extends class72 implements MouseWheelListener {

    @OriginalMember(owner = "client!vg", name = "n", descriptor = "I")
    private int field4544 = 0;

    @OriginalMember(owner = "client!vg", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 5)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field4544 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 17)
    public final void method588(byte arg0, Component arg1) {
        if (arg0 == -76) {
            arg1.addMouseWheelListener(this);
        }
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(I)I", line = 28)
    public final synchronized int method593(int arg0) {
        if (arg0 > -119) {
            this.field4544 = -99;
        }
        int var2 = this.field4544;
        this.field4544 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 40)
    public final void method595(int arg0, Component arg1) {
        arg1.removeMouseWheelListener(this);
        if (arg0 != -29701) {
            this.field4544 = -117;
        }
    }
}
