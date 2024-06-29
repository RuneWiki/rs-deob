import java.awt.Component;
import java.awt.Cursor;
import java.awt.Point;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class210 {

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "Ljava/awt/Robot;")
    private Robot field3041 = new Robot();

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "Ljava/awt/Component;")
    private Component field3040;

    @OriginalMember(owner = "client!ta", name = "movemouse", descriptor = "(II)V", line = 7)
    public final void movemouse(int arg0, int arg1) {
        this.field3041.mouseMove(arg0, arg1);
    }

    @OriginalMember(owner = "client!ta", name = "showcursor", descriptor = "(Ljava/awt/Component;Z)V", line = 14)
    public final void showcursor(Component arg0, boolean arg1) {
        if (arg1) {
            arg0 = null;
        } else if (arg0 == null) {
            throw new NullPointerException();
        }
        if (this.field3040 == arg0) {
            return;
        }
        if (this.field3040 != null) {
            this.field3040.setCursor(null);
            this.field3040 = null;
        }
        if (arg0 != null) {
            arg0.setCursor(arg0.getToolkit().createCustomCursor(new BufferedImage(1, 1, 2), new Point(0, 0), null));
            this.field3040 = arg0;
        }
    }

    @OriginalMember(owner = "client!ta", name = "setcustomcursor", descriptor = "(Ljava/awt/Component;[IIILjava/awt/Point;)V", line = 44)
    public final void setcustomcursor(Component arg0, int[] arg1, int arg2, int arg3, Point arg4) {
        if (arg1 == null) {
            arg0.setCursor(null);
        } else {
            BufferedImage var6 = new BufferedImage(arg2, arg3, 2);
            var6.setRGB(0, 0, arg2, arg3, arg1, 0, arg2);
            arg0.setCursor(arg0.getToolkit().createCustomCursor(var6, arg4, null));
        }
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "()V", line = 59)
    public class210() throws Exception {
    }
}
