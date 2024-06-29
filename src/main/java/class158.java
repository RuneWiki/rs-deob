import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class158 extends class51 implements MouseWheelListener {

    @OriginalMember(owner = "client!p", name = "g", descriptor = "I")
    private int field3023 = 0;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    public final void method367(Component arg0, boolean arg1) {
        if (!arg1) {
            arg0.removeMouseWheelListener(this);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public final void method371(byte arg0, Component arg1) {
        if (arg0 != 118) {
            this.method370(82);
        }
        arg1.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(I)I")
    public final synchronized int method370(int arg0) {
        int var2 = this.field3023;
        this.field3023 = 0;
        return arg0 == 32767 ? var2 : 28;
    }

    @OriginalMember(owner = "client!p", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field3023 += arg0.getWheelRotation();
    }
}
