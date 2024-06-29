import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class76 extends class170 implements MouseWheelListener {

    @OriginalMember(owner = "client!hg", name = "q", descriptor = "I")
    private int field1579 = 0;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public final void method530(byte arg0, Component arg1) {
        if (arg0 == 35) {
            arg1.removeMouseWheelListener(this);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public final void method531(int arg0, Component arg1) {
        if (arg0 != 30918) {
            this.field1579 = -67;
        }
        arg1.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!hg", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field1579 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(B)I")
    public final synchronized int method532(byte arg0) {
        if (arg0 <= 19) {
            this.method530((byte) 24, null);
        }
        int var2 = this.field1579;
        this.field1579 = 0;
        return var2;
    }
}
