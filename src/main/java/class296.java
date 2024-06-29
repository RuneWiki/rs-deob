import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!za")
public class class296 extends class115 {

    @OriginalMember(owner = "client!za", name = "k", descriptor = "Ljava/awt/Canvas;")
    public Canvas field4424;

    @OriginalMember(owner = "client!za", name = "j", descriptor = "Z")
    private static boolean field4423 = false;

    @OriginalMember(owner = "client!za", name = "i", descriptor = "J")
    private static long field4422;

    @OriginalMember(owner = "client!za", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!za", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method1839(Rectangle[] arg0, int arg1) {
        try {
            synchronized (this.field4424.getTreeLock()) {
                for (int var4 = 0; var4 < arg1; var4++) {
                    Rectangle var5 = arg0[var4];
                    if (var5.width > 0 && var5.height > 0) {
                        this.method1845(var5.x, var5.y, var5.width, var5.height);
                    }
                }
                field4423 = false;
            }
        } catch (Exception var8) {
            this.method1847(var8);
        }
    }

    @OriginalMember(owner = "client!za", name = "H", descriptor = "(Ljava/awt/Canvas;II)V")
    public final native void method1840(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!za", name = "ca", descriptor = "()V")
    private final native void method1841();

    @OriginalMember(owner = "client!za", name = "a", descriptor = "()V")
    public final void method1842() {
        this.method1841();
        this.nativeid = 0L;
        this.field4424 = null;
    }

    @OriginalMember(owner = "client!za", name = "r", descriptor = "(Lqa;Ljava/awt/Canvas;II)V")
    private final native void method1843(class131 arg0, Canvas arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!za", name = "ka", descriptor = "()V")
    private final native void method1844();

    @OriginalMember(owner = "client!za", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            this.method1841();
        }
    }

    @OriginalMember(owner = "client!za", name = "d", descriptor = "(IIII)V")
    private final native void method1845(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!za", name = "<init>", descriptor = "(Lqa;Ljava/awt/Canvas;)V")
    public class296(class131 arg0, Canvas arg1) {
        this.field4424 = arg1;
        Dimension var3 = arg1.getSize();
        this.method1843(arg0, this.field4424, var3.width, var3.height);
    }

    @OriginalMember(owner = "client!za", name = "b", descriptor = "()V")
    public final void method1846() {
        try {
            synchronized (this.field4424.getTreeLock()) {
                this.method1844();
                field4423 = false;
            }
        } catch (Exception var4) {
            this.method1847(var4);
        }
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(Ljava/lang/Exception;)V")
    private final void method1847(Exception arg0) {
        if (!field4423) {
            field4422 = class381.method2281((byte) 82);
            field4423 = true;
        } else if (class381.method2281((byte) -119) - field4422 < 30000L) {
            this.field4424.repaint();
        } else {
            throw new RuntimeException(arg0.getMessage());
        }
    }
}
