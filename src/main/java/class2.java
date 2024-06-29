import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class2 extends class22 implements MouseWheelListener {

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "I")
    private int field39 = 0;

    @OriginalMember(owner = "client!pa", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field39 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public final void method14(int arg0, Component arg1) {
        arg1.addMouseWheelListener(this);
        int var3 = -59 % ((-arg0 - 38) / 41);
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)I")
    public final synchronized int method15(int arg0) {
        if (arg0 <= 60) {
            this.field39 = 12;
        }
        int var2 = this.field39;
        this.field39 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(ILjava/awt/Component;)V")
    public final void method16(int arg0, Component arg1) {
        arg1.removeMouseWheelListener(this);
        if (arg0 != 2) {
            this.field39 = -121;
        }
    }
}
