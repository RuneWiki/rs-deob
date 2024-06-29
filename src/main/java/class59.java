import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class59 extends class145 implements MouseWheelListener {

    @OriginalMember(owner = "client!ic", name = "o", descriptor = "I")
    private int field1345 = 0;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    public final void method455(Component arg0, boolean arg1) {
        if (arg1) {
            this.method457((byte) 14);
        }
        arg0.removeMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!ic", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field1345 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public final void method456(int arg0, Component arg1) {
        arg1.addMouseWheelListener(this);
        if (arg0 <= 95) {
            this.method455(null, false);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)I")
    public final synchronized int method457(byte arg0) {
        int var2 = this.field1345;
        this.field1345 = 0;
        if (arg0 != 12) {
            this.method456(-117, null);
        }
        return var2;
    }
}
