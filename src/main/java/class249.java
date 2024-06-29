import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class249 extends class6 implements MouseWheelListener {

    @OriginalMember(owner = "client!he", name = "i", descriptor = "I")
    private int field3697 = 0;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public final void method35(byte arg0, Component arg1) {
        if (arg0 == 76) {
            arg1.removeMouseWheelListener(this);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ZLjava/awt/Component;)V")
    public final void method33(boolean arg0, Component arg1) {
        arg1.addMouseWheelListener(this);
        if (arg0) {
            this.mouseWheelMoved(null);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)I")
    public final synchronized int method34(int arg0) {
        if (arg0 != 7581) {
            this.method34(-96);
        }
        int var2 = this.field3697;
        this.field3697 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!he", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field3697 += arg0.getWheelRotation();
    }
}
