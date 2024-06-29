import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class28 extends class183 implements MouseWheelListener {

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "I")
    private int field529 = 0;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public final void method250(Component arg0, byte arg1) {
        if (arg1 <= 49) {
            this.method252((byte) -8, null);
        }
        arg0.removeMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)I")
    public final synchronized int method251(byte arg0) {
        int var2 = this.field529;
        if (arg0 > -40) {
            this.method250(null, (byte) 16);
        }
        this.field529 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!cg", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field529 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public final void method252(byte arg0, Component arg1) {
        if (arg0 == 127) {
            arg1.addMouseWheelListener(this);
        }
    }
}
