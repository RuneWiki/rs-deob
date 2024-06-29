import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class99 extends class130 implements MouseWheelListener {

    @OriginalMember(owner = "client!kh", name = "n", descriptor = "I")
    private int field1840 = 0;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public final void method554(Component arg0, byte arg1) {
        arg0.removeMouseWheelListener(this);
        if (arg1 != -85) {
            this.field1840 = 16;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Z)I")
    public final synchronized int method555(boolean arg0) {
        if (arg0) {
            int var2 = this.field1840;
            this.field1840 = 0;
            return var2;
        } else {
            return -71;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public final void method556(Component arg0, int arg1) {
        if (arg1 != -24021) {
            this.method554(null, (byte) 11);
        }
        arg0.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!kh", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field1840 += arg0.getWheelRotation();
    }
}
