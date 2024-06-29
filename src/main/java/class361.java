import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class361 extends class401 implements MouseWheelListener {

    @OriginalMember(owner = "client!im", name = "k", descriptor = "I")
    private int field5230 = 0;

    @OriginalMember(owner = "client!im", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 4)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field5230 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 12)
    public final void method2291(Component arg0, byte arg1) {
        int var3 = 97 % ((arg1 - 4) / 56);
        arg0.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(I)I", line = 21)
    public final synchronized int method2292(int arg0) {
        if (arg0 == 16) {
            int var2 = this.field5230;
            this.field5230 = 0;
            return var2;
        } else {
            return 102;
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 33)
    public final void method2293(int arg0, Component arg1) {
        if (arg0 != 29738) {
            this.field5230 = -87;
        }
        arg1.removeMouseWheelListener(this);
    }
}
