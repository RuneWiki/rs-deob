import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class139 extends class95 implements MouseWheelListener {

    @OriginalMember(owner = "client!va", name = "x", descriptor = "I")
    private int field3453 = 0;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public final void method779(Component arg0, int arg1) {
        if (arg1 >= 90) {
            arg0.addMouseWheelListener(this);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ZLjava/awt/Component;)V")
    public final void method780(boolean arg0, Component arg1) {
        arg1.removeMouseWheelListener(this);
        if (!arg0) {
            this.mouseWheelMoved(null);
        }
    }

    @OriginalMember(owner = "client!va", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field3453 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(I)I")
    public final synchronized int method778(int arg0) {
        if (arg0 > -47) {
            this.field3453 = -39;
        }
        int var2 = this.field3453;
        this.field3453 = 0;
        return var2;
    }
}
