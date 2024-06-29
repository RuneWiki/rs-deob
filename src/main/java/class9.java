import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class9 extends class23 implements MouseWheelListener {

    @OriginalMember(owner = "client!wh", name = "o", descriptor = "I")
    private int field83 = 0;

    @OriginalMember(owner = "client!wh", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 4)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field83 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)I", line = 12)
    public final synchronized int method51(byte arg0) {
        if (arg0 < 74) {
            this.method51((byte) 63);
        }
        int var2 = this.field83;
        this.field83 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(ILjava/awt/Component;)V", line = 24)
    public final void method52(int arg0, Component arg1) {
        if (arg0 == 176) {
            arg1.removeMouseWheelListener(this);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 34)
    public final void method53(int arg0, Component arg1) {
        if (arg0 != -4277) {
            this.field83 = -82;
        }
        arg1.addMouseWheelListener(this);
    }
}
