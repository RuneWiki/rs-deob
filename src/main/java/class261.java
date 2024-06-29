import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class261 extends class72 implements MouseWheelListener {

    @OriginalMember(owner = "client!kl", name = "m", descriptor = "I")
    private int field4678 = 0;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(ZLjava/awt/Component;)V")
    public final void method480(boolean arg0, Component arg1) {
        if (arg0) {
            this.field4678 = 15;
        }
        arg1.removeMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!kl", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field4678 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public final void method481(byte arg0, Component arg1) {
        if (arg0 < 105) {
            this.method481((byte) -93, (Component) null);
        }
        arg1.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)I")
    public final synchronized int method483(int arg0) {
        int var2 = this.field4678;
        this.field4678 = 0;
        if (arg0 != -1749410640) {
            this.field4678 = 122;
        }
        return var2;
    }
}
