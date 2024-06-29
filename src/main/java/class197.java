import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class197 extends class68 implements MouseWheelListener {

    @OriginalMember(owner = "client!t", name = "n", descriptor = "I")
    private int field3075 = 0;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public final void method465(int arg0, Component arg1) {
        if (arg0 != 20646) {
            this.method465(-67, (Component) null);
        }
        arg1.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public final void method467(Component arg0, byte arg1) {
        arg0.removeMouseWheelListener(this);
        if (arg1 != 117) {
            this.mouseWheelMoved((MouseWheelEvent) null);
        }
    }

    @OriginalMember(owner = "client!t", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field3075 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)I")
    public final synchronized int method463(int arg0) {
        int var2 = this.field3075;
        if (arg0 != 2) {
            this.method467((Component) null, (byte) 110);
        }
        this.field3075 = 0;
        return var2;
    }
}
