import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class207 extends class31 implements MouseWheelListener {

    @OriginalMember(owner = "client!tc", name = "m", descriptor = "I")
    private int field3781 = 0;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)I")
    public final synchronized int method225(int arg0) {
        if (arg0 <= 65) {
            return -4;
        } else {
            int var2 = this.field3781;
            this.field3781 = 0;
            return var2;
        }
    }

    @OriginalMember(owner = "client!tc", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field3781 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public final void method220(byte arg0, Component arg1) {
        if (arg0 <= 53) {
            this.field3781 = 13;
        }
        arg1.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public final void method223(int arg0, Component arg1) {
        arg1.removeMouseWheelListener(this);
        int var3 = 48 / ((arg0 + 49) / 47);
    }
}
