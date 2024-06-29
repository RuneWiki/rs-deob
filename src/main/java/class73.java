import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public class class73 extends class199 implements MouseWheelListener {

    @OriginalMember(owner = "client!fv", name = "g", descriptor = "I")
    private int field1059 = 0;

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public final void method490(Component arg0, int arg1) {
        arg0.removeMouseWheelListener(this);
        int var3 = -36 / ((arg1 + 30) / 41);
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public final void method491(byte arg0, Component arg1) {
        arg1.addMouseWheelListener(this);
        if (arg0 != -98) {
            this.field1059 = 127;
        }
    }

    @OriginalMember(owner = "client!fv", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field1059 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "(I)I")
    public final synchronized int method492(int arg0) {
        int var2 = this.field1059;
        if (arg0 >= -40) {
            this.field1059 = 52;
        }
        this.field1059 = 0;
        return var2;
    }
}
