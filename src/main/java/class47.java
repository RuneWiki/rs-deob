import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class47 extends class230 implements MouseWheelListener {

    @OriginalMember(owner = "client!lj", name = "i", descriptor = "I")
    private int field684 = 0;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Ljava/awt/Component;Z)V", line = 5)
    public final void method353(Component arg0, boolean arg1) {
        if (arg1) {
            arg0.removeMouseWheelListener(this);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 15)
    public final void method354(int arg0, Component arg1) {
        if (arg0 != 32353) {
            this.field684 = -39;
        }
        arg1.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(B)I", line = 26)
    public final synchronized int method355(byte arg0) {
        if (arg0 <= 57) {
            this.field684 = 81;
        }
        int var2 = this.field684;
        this.field684 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!lj", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 38)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field684 += arg0.getWheelRotation();
    }
}
