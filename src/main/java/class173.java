import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class173 extends class73 implements MouseWheelListener {

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "I")
    private int field2623 = 0;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 4)
    public final void method453(int arg0, Component arg1) {
        arg1.addMouseWheelListener(this);
        int var3 = -110 % ((34 - arg0) / 60);
    }

    @OriginalMember(owner = "client!ge", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 13)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2623 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 21)
    public final void method455(Component arg0, int arg1) {
        if (arg1 == -5680) {
            arg0.removeMouseWheelListener(this);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)I", line = 35)
    public final synchronized int method451(int arg0) {
        if (arg0 != 127) {
            this.mouseWheelMoved((MouseWheelEvent) null);
        }
        int var2 = this.field2623;
        this.field2623 = 0;
        return var2;
    }
}
