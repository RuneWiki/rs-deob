import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class593 extends class435 implements class52 {

    @OriginalMember(owner = "client!ta", name = "r", descriptor = "Ljava/awt/Canvas;")
    public Canvas field8606;

    @OriginalMember(owner = "client!ta", name = "q", descriptor = "Z")
    private static boolean field8605 = false;

    @OriginalMember(owner = "client!ta", name = "s", descriptor = "J")
    private static long field8607;

    @OriginalMember(owner = "client!ta", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "()V", line = 5)
    public final void method3393() {
        try {
            synchronized (this.field8606.getTreeLock()) {
                this.method3400();
                field8605 = false;
            }
        } catch (Exception var4) {
            this.method3394(var4);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/lang/Exception;)V", line = 17)
    private final void method3394(Exception arg0) {
        if (!field8605) {
            field8607 = class254.method1619(true);
            field8605 = true;
        } else if (class254.method1619(true) - field8607 < 30000L) {
            this.field8606.repaint();
        } else {
            throw new RuntimeException(arg0.getMessage());
        }
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Ll;Ljava/awt/Canvas;)V", line = 36)
    public class593(class261 arg0, Canvas arg1) {
        this.field8606 = arg1;
        Dimension var3 = arg1.getSize();
        this.method3399(arg0, this.field8606, var3.width, var3.height);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 44)
    public final void method3396(Rectangle[] arg0, int arg1) {
        try {
            synchronized (this.field8606.getTreeLock()) {
                for (int var4 = 0; var4 < arg1; var4++) {
                    Rectangle var5 = arg0[var4];
                    if (var5.width > 0 && var5.height > 0) {
                        this.method3397(var5.x, var5.y, var5.width, var5.height);
                    }
                }
                field8605 = false;
            }
        } catch (Exception var8) {
            this.method3394(var8);
        }
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "()V", line = 69)
    public final void method3398() {
        this.method411(true);
        this.nativeid = 0L;
        this.field8606 = null;
    }

    @OriginalMember(owner = "client!ta", name = "finalize", descriptor = "()V", line = 76)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class388.method2372(this, 0);
        }
    }

    @OriginalMember(owner = "client!ta", name = "UA", descriptor = "(Z)V")
    public final native void method411(boolean arg0);

    @OriginalMember(owner = "client!ta", name = "AA", descriptor = "(Ljava/awt/Canvas;II)V")
    public final native void method3395(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIII)V")
    private final native void method3397(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ta", name = "da", descriptor = "(Ll;Ljava/awt/Canvas;II)V")
    private final native void method3399(class261 arg0, Canvas arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ta", name = "H", descriptor = "()V")
    private final native void method3400();
}
