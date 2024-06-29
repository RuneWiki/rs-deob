import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class266 extends class315 implements MouseWheelListener {

    @OriginalMember(owner = "client!dk", name = "k", descriptor = "I")
    private int field3850 = 0;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)I", line = 5)
    public final synchronized int method1825(byte arg0) {
        int var2 = 29 % ((42 - arg0) / 44);
        int var3 = this.field3850;
        this.field3850 = 0;
        return var3;
    }

    @OriginalMember(owner = "client!dk", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 16)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field3850 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 23)
    public final void method1826(Component arg0, byte arg1) {
        arg0.removeMouseWheelListener(this);
        int var3 = 2 % ((-arg1 - 16) / 37);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Ljava/awt/Component;Z)V", line = 33)
    public final void method1827(Component arg0, boolean arg1) {
        arg0.addMouseWheelListener(this);
        if (!arg1) {
            this.method1825((byte) -104);
        }
    }
}
