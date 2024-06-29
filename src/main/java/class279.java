import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class279 extends class176 implements class27 {

    @OriginalMember(owner = "client!b", name = "n", descriptor = "Ljava/awt/Canvas;")
    public Canvas field3857;

    @OriginalMember(owner = "client!b", name = "o", descriptor = "Z")
    private static boolean field3858 = false;

    @OriginalMember(owner = "client!b", name = "m", descriptor = "J")
    private static long field3856;

    @OriginalMember(owner = "client!b", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method1796(Rectangle[] arg0, int arg1) {
        try {
            synchronized (this.field3857.getTreeLock()) {
                for (int var4 = 0; var4 < arg1; var4++) {
                    Rectangle var5 = arg0[var4];
                    if (var5.width > 0 && var5.height > 0) {
                        this.method1798(var5.x, var5.y, var5.width, var5.height);
                    }
                }
                field3858 = false;
            }
        } catch (Exception var8) {
            this.method1801(var8);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "()V")
    public final void method1797() {
        this.method134(true);
        this.nativeid = 0L;
        this.field3857 = null;
    }

    @OriginalMember(owner = "client!b", name = "ea", descriptor = "(IIII)V")
    private final native void method1798(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!b", name = "BA", descriptor = "(La;Ljava/awt/Canvas;II)V")
    private final native void method1799(class530 arg0, Canvas arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!b", name = "xa", descriptor = "(Ljava/awt/Canvas;II)V")
    public final native void method1800(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Ljava/lang/Exception;)V")
    private final void method1801(Exception arg0) {
        if (!field3858) {
            field3856 = class488.method2835(30160);
            field3858 = true;
        } else if (class488.method2835(30160) - field3856 < 30000L) {
            this.field3857.repaint();
        } else {
            throw new RuntimeException(arg0.getMessage());
        }
    }

    @OriginalMember(owner = "client!b", name = "NA", descriptor = "(Z)V")
    public final native void method134(boolean arg0);

    @OriginalMember(owner = "client!b", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class138.method926(this, -1);
        }
    }

    @OriginalMember(owner = "client!b", name = "ga", descriptor = "()V")
    private final native void method1802();

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(La;Ljava/awt/Canvas;)V")
    public class279(class530 arg0, Canvas arg1) {
        this.field3857 = arg1;
        Dimension var3 = arg1.getSize();
        this.method1799(arg0, this.field3857, var3.width, var3.height);
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "()V")
    public final void method1803() {
        try {
            synchronized (this.field3857.getTreeLock()) {
                this.method1802();
                field3858 = false;
            }
        } catch (Exception var4) {
            this.method1801(var4);
        }
    }
}
