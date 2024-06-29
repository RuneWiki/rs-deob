import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class110 extends class116 implements MouseWheelListener {

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "I")
    private int field2459 = 0;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public final void method872(int arg0, Component arg1) {
        arg1.removeMouseWheelListener(this);
        if (arg0 != 17) {
            this.field2459 = -39;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)I")
    public final synchronized int method873(int arg0) {
        int var2 = this.field2459;
        this.field2459 = arg0;
        return var2;
    }

    @OriginalMember(owner = "client!mc", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2459 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public final void method874(Component arg0, byte arg1) {
        arg0.addMouseWheelListener(this);
        if (arg1 <= 91) {
            this.method872(-124, null);
        }
    }
}
