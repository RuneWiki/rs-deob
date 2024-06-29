import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class8 extends class161 implements MouseWheelListener {

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "I")
    private int field160 = 0;

    @OriginalMember(owner = "client!aa", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field160 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public final void method82(Component arg0, int arg1) {
        arg0.removeMouseWheelListener(this);
        if (arg1 != -27503) {
            this.field160 = -20;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)I")
    public final synchronized int method83(int arg0) {
        int var2 = this.field160;
        if (arg0 <= 115) {
            this.mouseWheelMoved((MouseWheelEvent) null);
        }
        this.field160 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public final void method84(Component arg0, byte arg1) {
        arg0.addMouseWheelListener(this);
        int var3 = -15 / ((arg1 - 4) / 33);
    }
}
