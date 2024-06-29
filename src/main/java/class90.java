import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class90 extends class2 implements MouseWheelListener {

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "I")
    private int field2142 = 0;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public final void method17(Component arg0, int arg1) {
        if (arg1 != -1) {
            this.mouseWheelMoved(null);
        }
        arg0.removeMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!nd", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2142 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)I")
    public final synchronized int method15(int arg0) {
        int var2 = this.field2142;
        if (arg0 != -1) {
            this.field2142 = 79;
        }
        this.field2142 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(Ljava/awt/Component;I)V")
    public final void method19(Component arg0, int arg1) {
        arg0.addMouseWheelListener(this);
        if (arg1 != 50) {
            this.method15(45);
        }
    }
}
