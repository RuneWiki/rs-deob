import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class263 extends class204 implements MouseWheelListener {

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "I")
    private int field4729 = 0;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)I")
    public final synchronized int method1399(int arg0) {
        int var2 = this.field4729;
        if (arg0 != -1) {
            this.field4729 = 4;
        }
        this.field4729 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!nd", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field4729 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public final void method1395(Component arg0, byte arg1) {
        if (arg1 <= 41) {
            this.field4729 = 123;
        }
        arg0.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public final void method1398(Component arg0, int arg1) {
        arg0.removeMouseWheelListener(this);
        if (arg1 >= -16) {
            this.field4729 = -57;
        }
    }
}
