import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class232 extends class379 implements class559 {

    @OriginalMember(owner = "client!p", name = "l", descriptor = "Ljava/awt/Canvas;")
    public Canvas field2766;

    @OriginalMember(owner = "client!p", name = "k", descriptor = "I")
    public int field2765;

    @OriginalMember(owner = "client!p", name = "h", descriptor = "I")
    public int field2762;

    @OriginalMember(owner = "client!p", name = "i", descriptor = "Z")
    private static boolean field2763 = false;

    @OriginalMember(owner = "client!p", name = "j", descriptor = "J")
    private static long field2764;

    @OriginalMember(owner = "client!p", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/lang/Exception;)V")
    private final void method1422(Exception arg0) {
        if (!field2763) {
            field2764 = class349.method2069(true);
            field2763 = true;
        } else if (class349.method2069(true) - field2764 < 30000L) {
            this.field2766.repaint();
        } else {
            throw new RuntimeException(arg0.getMessage());
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public final void method1423(Rectangle[] arg0, int arg1, int arg2, int arg3) {
        try {
            synchronized (this.field2766.getTreeLock()) {
                for (int var6 = 0; var6 < arg1; var6++) {
                    Rectangle var7 = arg0[var6];
                    if (var7.width > 0 && var7.height > 0) {
                        this.method1430(var7.x, var7.y, var7.width, var7.height, arg2, arg3);
                    }
                }
                field2763 = false;
            }
        } catch (Exception var10) {
            this.method1422(var10);
        }
    }

    @OriginalMember(owner = "client!p", name = "w", descriptor = "(Z)V")
    public final native void method229(boolean arg0);

    @OriginalMember(owner = "client!p", name = "H", descriptor = "(IIII)V")
    private final native void method1424(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!p", name = "sa", descriptor = "(Loa;Ljava/awt/Canvas;II)V")
    private final native void method1425(class724 arg0, Canvas arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II)V")
    public final void method1426(int arg0, int arg1) {
        try {
            synchronized (this.field2766.getTreeLock()) {
                Dimension var4 = this.field2766.getSize();
                this.method1424(arg0, arg1, var4.width, var4.height);
                field2763 = false;
            }
        } catch (Exception var7) {
            this.method1422(var7);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "()V")
    public final void method1427() {
        this.method229(true);
        this.nativeid = 0L;
        this.field2766 = null;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method1428(Canvas arg0, int arg1, int arg2) {
        this.field2765 = arg1;
        this.field2762 = arg2;
        this.method1429(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!p", name = "oa", descriptor = "(Ljava/awt/Canvas;II)V")
    private final native void method1429(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!p", name = "K", descriptor = "(IIIIII)V")
    private final native void method1430(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Loa;Ljava/awt/Canvas;II)V")
    public class232(class724 arg0, Canvas arg1, int arg2, int arg3) {
        this.field2766 = arg1;
        this.field2765 = arg2;
        this.field2762 = arg3;
        this.method1425(arg0, this.field2766, arg2, arg3);
    }

    @OriginalMember(owner = "client!p", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class405.method2430((byte) -104, this);
        }
    }
}
