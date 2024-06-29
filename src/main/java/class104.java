import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class104 extends class79 implements MouseWheelListener {

    @OriginalMember(owner = "client!p", name = "s", descriptor = "I")
    private int field2585 = 0;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(ILjava/awt/Component;)V")
    public final void method604(int arg0, Component arg1) {
        if (arg0 != 3294) {
            this.method604(-107, null);
        }
        arg1.removeMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I)I")
    public final synchronized int method601(int arg0) {
        int var2 = -36 % ((23 - arg0) / 36);
        int var3 = this.field2585;
        this.field2585 = 0;
        return var3;
    }

    @OriginalMember(owner = "client!p", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2585 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public final void method600(int arg0, Component arg1) {
        arg1.addMouseWheelListener(this);
        if (arg0 < 111) {
            this.method600(-111, null);
        }
    }
}
