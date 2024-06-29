import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class399 extends class5 implements MouseWheelListener {

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "I")
    private int field5701 = 0;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)I")
    public final synchronized int method32(int arg0) {
        if (arg0 != 15) {
            this.field5701 = -127;
        }
        int var2 = this.field5701;
        this.field5701 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!kj", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field5701 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(Ljava/awt/Component;I)V")
    public final void method30(Component arg0, int arg1) {
        if (arg1 == 15) {
            arg0.removeMouseWheelListener(this);
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public final void method29(Component arg0, int arg1) {
        if (arg1 != 3587) {
            this.method30(null, 23);
        }
        arg0.addMouseWheelListener(this);
    }
}
