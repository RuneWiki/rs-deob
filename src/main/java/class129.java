import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class129 extends class241 implements MouseWheelListener {

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "I")
    private int field2029 = 0;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Z)I", line = 5)
    public final synchronized int method988(boolean arg0) {
        if (arg0) {
            this.method988(true);
        }
        int var2 = this.field2029;
        this.field2029 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!qa", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 17)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2029 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 24)
    public final void method989(int arg0, Component arg1) {
        if (arg0 != 0) {
            this.field2029 = -83;
        }
        arg1.removeMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 35)
    public final void method990(Component arg0, int arg1) {
        int var3 = 11 % ((arg1 - 54) / 33);
        arg0.addMouseWheelListener(this);
    }
}
