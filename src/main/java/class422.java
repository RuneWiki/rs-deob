import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class422 extends class243 implements MouseWheelListener {

    @OriginalMember(owner = "client!ed", name = "n", descriptor = "I")
    private int field5980 = 0;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)I", line = 5)
    public final synchronized int method1647(int arg0) {
        int var2 = this.field5980;
        this.field5980 = arg0;
        return var2;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 14)
    public final void method1644(Component arg0, byte arg1) {
        arg0.addMouseWheelListener(this);
        if (arg1 >= -58) {
            this.field5980 = -8;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 24)
    public final void method1652(int arg0, Component arg1) {
        if (arg0 != -16777216) {
            this.field5980 = -64;
        }
        arg1.removeMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!ed", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 35)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field5980 += arg0.getWheelRotation();
    }
}
