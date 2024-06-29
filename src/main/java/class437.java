import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class437 extends class310 implements MouseWheelListener {

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "I")
    private int field6444 = 0;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(Ljava/awt/Component;I)V", line = 4)
    public final void method1985(Component arg0, int arg1) {
        if (arg1 == 11021) {
            arg0.removeMouseWheelListener(this);
        }
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(B)I", line = 16)
    public final synchronized int method1984(byte arg0) {
        if (arg0 == 11) {
            int var2 = this.field6444;
            this.field6444 = 0;
            return var2;
        } else {
            return 97;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 28)
    public final void method1979(Component arg0, int arg1) {
        if (arg1 > -117) {
            this.field6444 = 55;
        }
        arg0.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!wa", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 43)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field6444 += arg0.getWheelRotation();
    }
}
