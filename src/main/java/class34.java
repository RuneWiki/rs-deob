import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class34 extends class169 implements MouseWheelListener {

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "I")
    private int field489 = 0;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(ILjava/awt/Component;)V")
    public final void method196(int arg0, Component arg1) {
        int var3 = 11 / ((arg0 - 55) / 49);
        arg1.removeMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)I")
    public final synchronized int method197(byte arg0) {
        if (arg0 != -58) {
            this.method197((byte) 93);
        }
        int var2 = this.field489;
        this.field489 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!sd", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field489 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public final void method198(int arg0, Component arg1) {
        if (arg0 < -120) {
            arg1.addMouseWheelListener(this);
        }
    }
}
