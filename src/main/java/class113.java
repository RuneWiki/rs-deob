import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class113 extends class60 implements MouseWheelListener {

    @OriginalMember(owner = "client!s", name = "s", descriptor = "I")
    private int field2689 = 0;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 8)
    public final void method441(int arg0, Component arg1) {
        if (arg0 == 99) {
            arg1.removeMouseWheelListener(this);
        }
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(I)I", line = 19)
    public final synchronized int method447(int arg0) {
        int var2 = this.field2689;
        this.field2689 = 0;
        if (arg0 < 124) {
            this.field2689 = 62;
        }
        return var2;
    }

    @OriginalMember(owner = "client!s", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 33)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2689 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 40)
    public final void method446(Component arg0, byte arg1) {
        if (arg1 > 69) {
            arg0.addMouseWheelListener(this);
        }
    }
}
