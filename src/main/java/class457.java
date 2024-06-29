import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class457 extends class329 implements class249 {

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "Ljava/awt/Canvas;")
    public Canvas field5833;

    @OriginalMember(owner = "client!ta", name = "m", descriptor = "Z")
    private static boolean field5835 = false;

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "J")
    private static long field5834;

    @OriginalMember(owner = "client!ta", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "()V")
    public final void method2438() {
        this.method548(true);
        this.nativeid = 0L;
        this.field5833 = null;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/lang/Exception;)V")
    private final void method2439(Exception arg0) {
        if (!field5835) {
            field5834 = class571.method3150(99);
            field5835 = true;
        } else if (class571.method3150(108) - field5834 < 30000L) {
            this.field5833.repaint();
        } else {
            throw new RuntimeException(arg0.getMessage());
        }
    }

    @OriginalMember(owner = "client!ta", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class499.method2689(this, (byte) 37);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method2440(Rectangle[] arg0, int arg1) {
        try {
            synchronized (this.field5833.getTreeLock()) {
                for (int var4 = 0; var4 < arg1; var4++) {
                    Rectangle var5 = arg0[var4];
                    if (var5.width > 0 && var5.height > 0) {
                        this.method2443(var5.x, var5.y, var5.width, var5.height);
                    }
                }
                field5835 = false;
            }
        } catch (Exception var8) {
            this.method2439(var8);
        }
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "()V")
    public final void method2441() {
        try {
            synchronized (this.field5833.getTreeLock()) {
                this.method2442();
                field5835 = false;
            }
        } catch (Exception var4) {
            this.method2439(var4);
        }
    }

    @OriginalMember(owner = "client!ta", name = "H", descriptor = "()V")
    private final native void method2442();

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIII)V")
    private final native void method2443(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Ll;Ljava/awt/Canvas;)V")
    public class457(class171 arg0, Canvas arg1) {
        this.field5833 = arg1;
        Dimension var3 = arg1.getSize();
        this.method2445(arg0, this.field5833, var3.width, var3.height);
    }

    @OriginalMember(owner = "client!ta", name = "UA", descriptor = "(Z)V")
    public final native void method548(boolean arg0);

    @OriginalMember(owner = "client!ta", name = "AA", descriptor = "(Ljava/awt/Canvas;II)V")
    public final native void method2444(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ta", name = "da", descriptor = "(Ll;Ljava/awt/Canvas;II)V")
    private final native void method2445(class171 arg0, Canvas arg1, int arg2, int arg3);
}
