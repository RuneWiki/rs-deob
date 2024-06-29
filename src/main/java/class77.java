import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class77 extends class48 implements MouseWheelListener {

    @OriginalMember(owner = "client!dd", name = "m", descriptor = "I")
    private int field1080 = 0;

    @OriginalMember(owner = "client!dd", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field1080 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public final void method300(Component arg0, byte arg1) {
        if (arg1 != -8) {
            this.method296(1);
        }
        arg0.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)I")
    public final synchronized int method296(int arg0) {
        int var2 = this.field1080;
        this.field1080 = 0;
        return arg0 == -1 ? var2 : 48;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public final void method297(int arg0, Component arg1) {
        arg1.removeMouseWheelListener(this);
        if (arg0 != -17721) {
            this.method297(-36, (Component) null);
        }
    }
}
