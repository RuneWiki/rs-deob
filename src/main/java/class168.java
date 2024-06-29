import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class168 extends class25 implements MouseWheelListener {

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "I")
    private int field2687 = 0;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public final void method146(Component arg0, int arg1) {
        arg0.removeMouseWheelListener(this);
        if (arg1 != 0) {
            this.field2687 = 58;
        }
    }

    @OriginalMember(owner = "client!jc", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2687 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public final void method144(Component arg0, byte arg1) {
        arg0.addMouseWheelListener(this);
        if (arg1 != -22) {
            this.field2687 = -40;
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)I")
    public final synchronized int method147(int arg0) {
        int var2 = this.field2687;
        this.field2687 = arg0;
        return var2;
    }
}
