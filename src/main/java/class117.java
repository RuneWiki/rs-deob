import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class117 extends class93 implements MouseWheelListener {

    @OriginalMember(owner = "client!ai", name = "o", descriptor = "I")
    private int field1979 = 0;

    @OriginalMember(owner = "client!ai", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 4)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field1979 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 11)
    public final void method693(byte arg0, Component arg1) {
        arg1.removeMouseWheelListener(this);
        if (arg0 < 81) {
            this.method695((Component) null, -120);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 25)
    public final void method695(Component arg0, int arg1) {
        arg0.addMouseWheelListener(this);
        if (arg1 <= 104) {
            this.method698((byte) -44);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)I", line = 38)
    public final synchronized int method698(byte arg0) {
        int var2 = this.field1979;
        this.field1979 = 0;
        if (arg0 >= -23) {
            this.field1979 = 89;
        }
        return var2;
    }
}
