import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class230 extends class206 implements class558 {

    @OriginalMember(owner = "client!p", name = "j", descriptor = "Ljava/awt/Canvas;")
    public Canvas field3491;

    @OriginalMember(owner = "client!p", name = "n", descriptor = "I")
    public int field3494;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "I")
    public int field3492;

    @OriginalMember(owner = "client!p", name = "k", descriptor = "Z")
    private static boolean field3493 = false;

    @OriginalMember(owner = "client!p", name = "l", descriptor = "J")
    private static long field3495;

    @OriginalMember(owner = "client!p", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!p", name = "H", descriptor = "(IIII)V")
    private final native void method1969(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!p", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class201.method1801((byte) -35, this);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method1970(Canvas arg0, int arg1, int arg2) {
        this.field3494 = arg1;
        this.field3492 = arg2;
        this.method1974(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!p", name = "sa", descriptor = "(Loa;Ljava/awt/Canvas;II)V")
    private final native void method1971(class721 arg0, Canvas arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!p", name = "a", descriptor = "()V")
    public final void method1972() {
        this.method130(true);
        this.nativeid = 0L;
        this.field3491 = null;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/lang/Exception;)V")
    private final void method1973(Exception arg0) {
        if (!field3493) {
            field3495 = class430.method3299(80);
            field3493 = true;
        } else if (class430.method3299(117) - field3495 < 30000L) {
            this.field3491.repaint();
        } else {
            throw new RuntimeException(arg0.getMessage());
        }
    }

    @OriginalMember(owner = "client!p", name = "oa", descriptor = "(Ljava/awt/Canvas;II)V")
    private final native void method1974(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!p", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public final void method1975(Rectangle[] arg0, int arg1, int arg2, int arg3) {
        try {
            synchronized (this.field3491.getTreeLock()) {
                for (int var6 = 0; var6 < arg1; var6++) {
                    Rectangle var7 = arg0[var6];
                    if (var7.width > 0 && var7.height > 0) {
                        this.method1977(var7.x, var7.y, var7.width, var7.height, arg2, arg3);
                    }
                }
                field3493 = false;
            }
        } catch (Exception var10) {
            this.method1973(var10);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II)V")
    public final void method1976(int arg0, int arg1) {
        try {
            synchronized (this.field3491.getTreeLock()) {
                Dimension var4 = this.field3491.getSize();
                this.method1969(arg0, arg1, var4.width, var4.height);
                field3493 = false;
            }
        } catch (Exception var7) {
            this.method1973(var7);
        }
    }

    @OriginalMember(owner = "client!p", name = "w", descriptor = "(Z)V")
    public final native void method130(boolean arg0);

    @OriginalMember(owner = "client!p", name = "K", descriptor = "(IIIIII)V")
    private final native void method1977(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Loa;Ljava/awt/Canvas;II)V")
    public class230(class721 arg0, Canvas arg1, int arg2, int arg3) {
        this.field3491 = arg1;
        this.field3494 = arg2;
        this.field3492 = arg3;
        this.method1971(arg0, this.field3491, arg2, arg3);
    }
}
