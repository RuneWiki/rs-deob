import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class456 extends class333 implements class251 {

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "Ljava/awt/Canvas;")
    public Canvas field6495;

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "Z")
    private static boolean field6494 = false;

    @OriginalMember(owner = "client!ta", name = "m", descriptor = "J")
    private static long field6496;

    @OriginalMember(owner = "client!ta", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "()V")
    public final void method2616() {
        try {
            synchronized (this.field6495.getTreeLock()) {
                this.method2622();
                field6494 = false;
            }
        } catch (Exception var4) {
            this.method2617(var4);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/lang/Exception;)V")
    private final void method2617(Exception arg0) {
        if (!field6494) {
            field6496 = class557.method3157(-69);
            field6494 = true;
        } else if (class557.method3157(-57) - field6496 < 30000L) {
            this.field6495.repaint();
        } else {
            throw new RuntimeException(arg0.getMessage());
        }
    }

    @OriginalMember(owner = "client!ta", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class402.method2265(-52, this);
        }
    }

    @OriginalMember(owner = "client!ta", name = "AA", descriptor = "(Ljava/awt/Canvas;II)V")
    public final native void method2618(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ta", name = "da", descriptor = "(Ll;Ljava/awt/Canvas;II)V")
    private final native void method2619(class172 arg0, Canvas arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIII)V")
    private final native void method2620(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ta", name = "UA", descriptor = "(Z)V")
    public final native void method484(boolean arg0);

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "()V")
    public final void method2621() {
        this.method484(true);
        this.nativeid = 0L;
        this.field6495 = null;
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Ll;Ljava/awt/Canvas;)V")
    public class456(class172 arg0, Canvas arg1) {
        this.field6495 = arg1;
        Dimension var3 = arg1.getSize();
        this.method2619(arg0, this.field6495, var3.width, var3.height);
    }

    @OriginalMember(owner = "client!ta", name = "H", descriptor = "()V")
    private final native void method2622();

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method2623(Rectangle[] arg0, int arg1) {
        try {
            synchronized (this.field6495.getTreeLock()) {
                for (int var4 = 0; var4 < arg1; var4++) {
                    Rectangle var5 = arg0[var4];
                    if (var5.width > 0 && var5.height > 0) {
                        this.method2620(var5.x, var5.y, var5.width, var5.height);
                    }
                }
                field6494 = false;
            }
        } catch (Exception var8) {
            this.method2617(var8);
        }
    }
}
