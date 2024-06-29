import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class202 extends class77 implements MouseWheelListener {

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "I")
    private int field2858 = 0;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public final void method666(int arg0, Component arg1) {
        arg1.removeMouseWheelListener(this);
        if (arg0 != 30) {
            this.field2858 = -105;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)I")
    public final synchronized int method660(byte arg0) {
        if (arg0 == -64) {
            int var2 = this.field2858;
            this.field2858 = 0;
            return var2;
        } else {
            return -101;
        }
    }

    @OriginalMember(owner = "client!gf", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2858 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public final void method658(Component arg0, byte arg1) {
        arg0.addMouseWheelListener(this);
        if (arg1 > -35) {
            this.field2858 = 121;
        }
    }
}
