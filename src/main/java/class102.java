import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class102 extends class246 implements MouseWheelListener {

    @OriginalMember(owner = "client!kk", name = "l", descriptor = "I")
    private int field1375 = 0;

    @OriginalMember(owner = "client!kk", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field1375 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)I")
    public final synchronized int method647(int arg0) {
        int var2 = this.field1375;
        if (arg0 != 8) {
            this.field1375 = 105;
        }
        this.field1375 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public final void method648(int arg0, Component arg1) {
        arg1.addMouseWheelListener(this);
        if (arg0 != 3) {
            this.field1375 = -83;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public final void method649(byte arg0, Component arg1) {
        arg1.removeMouseWheelListener(this);
        if (arg0 != -62) {
            this.field1375 = -66;
        }
    }
}
