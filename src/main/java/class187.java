import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class187 extends class102 implements MouseWheelListener {

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "I")
    private int field3557 = 0;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public final void method668(int arg0, Component arg1) {
        if (arg0 != 15312) {
            this.field3557 = -100;
        }
        arg1.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(B)I")
    public final synchronized int method670(byte arg0) {
        int var2 = this.field3557;
        this.field3557 = 0;
        if (arg0 > -72) {
            this.method673(null, (byte) -16);
        }
        return var2;
    }

    @OriginalMember(owner = "client!uf", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field3557 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public final void method673(Component arg0, byte arg1) {
        if (arg1 < 12) {
            this.method673(null, (byte) -128);
        }
        arg0.removeMouseWheelListener(this);
    }
}
