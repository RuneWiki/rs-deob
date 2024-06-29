import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class4 extends class223 implements MouseWheelListener {

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
    private int field59 = 0;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 4)
    public final void method31(int arg0, Component arg1) {
        if (arg0 != 7759444) {
            this.method31(-107, (Component) null);
        }
        arg1.removeMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!qc", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 14)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field59 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 21)
    public final void method32(Component arg0, int arg1) {
        if (arg1 == 64) {
            arg0.addMouseWheelListener(this);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)I", line = 36)
    public final synchronized int method33(byte arg0) {
        int var2 = this.field59;
        this.field59 = 0;
        if (arg0 != 4) {
            this.method32((Component) null, 11);
        }
        return var2;
    }
}
