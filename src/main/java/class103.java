import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class103 extends class31 implements MouseWheelListener {

    @OriginalMember(owner = "client!of", name = "t", descriptor = "I")
    private int field2254 = 0;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public final void method244(Component arg0, int arg1) {
        arg0.addMouseWheelListener(this);
        if (arg1 != -6502) {
            this.method241(23);
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)I")
    public final synchronized int method241(int arg0) {
        int var2 = this.field2254;
        this.field2254 = 0;
        return arg0 >= -96 ? 78 : var2;
    }

    @OriginalMember(owner = "client!of", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2254 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ZLjava/awt/Component;)V")
    public final void method240(boolean arg0, Component arg1) {
        if (arg0) {
            this.method240(true, null);
        }
        arg1.removeMouseWheelListener(this);
    }
}
