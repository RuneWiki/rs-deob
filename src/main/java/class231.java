import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class231 extends class101 implements class559 {

    @OriginalMember(owner = "client!p", name = "o", descriptor = "Ljava/awt/Canvas;")
    public Canvas field3149;

    @OriginalMember(owner = "client!p", name = "q", descriptor = "I")
    public int field3151;

    @OriginalMember(owner = "client!p", name = "n", descriptor = "I")
    public int field3148;

    @OriginalMember(owner = "client!p", name = "p", descriptor = "Z")
    private static boolean field3150 = false;

    @OriginalMember(owner = "client!p", name = "r", descriptor = "J")
    private static long field3152;

    @OriginalMember(owner = "client!p", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II)V")
    public final void method1510(int arg0, int arg1) {
        try {
            synchronized (this.field3149.getTreeLock()) {
                Dimension var4 = this.field3149.getSize();
                this.method1517(arg0, arg1, var4.width, var4.height);
                field3150 = false;
            }
        } catch (Exception var7) {
            this.method1514(var7);
        }
    }

    @OriginalMember(owner = "client!p", name = "oa", descriptor = "(Ljava/awt/Canvas;II)V")
    private final native void method1511(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!p", name = "w", descriptor = "(Z)V")
    public final native void method151(boolean arg0);

    @OriginalMember(owner = "client!p", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public final void method1512(Rectangle[] arg0, int arg1, int arg2, int arg3) {
        try {
            synchronized (this.field3149.getTreeLock()) {
                for (int var6 = 0; var6 < arg1; var6++) {
                    Rectangle var7 = arg0[var6];
                    if (var7.width > 0 && var7.height > 0) {
                        this.method1516(var7.x, var7.y, var7.width, var7.height, arg2, arg3);
                    }
                }
                field3150 = false;
            }
        } catch (Exception var10) {
            this.method1514(var10);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "()V")
    public final void method1513() {
        this.method151(true);
        this.nativeid = 0L;
        this.field3149 = null;
    }

    @OriginalMember(owner = "client!p", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class552.method3121(this, (byte) 20);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/lang/Exception;)V")
    private final void method1514(Exception arg0) {
        if (!field3150) {
            field3152 = class302.method1910(0);
            field3150 = true;
        } else if (class302.method1910(0) - field3152 < 30000L) {
            this.field3149.repaint();
        } else {
            throw new RuntimeException(arg0.getMessage());
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method1515(Canvas arg0, int arg1, int arg2) {
        this.field3151 = arg1;
        this.field3148 = arg2;
        this.method1511(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!p", name = "K", descriptor = "(IIIIII)V")
    private final native void method1516(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!p", name = "H", descriptor = "(IIII)V")
    private final native void method1517(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!p", name = "sa", descriptor = "(Loa;Ljava/awt/Canvas;II)V")
    private final native void method1518(class724 arg0, Canvas arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Loa;Ljava/awt/Canvas;II)V")
    public class231(class724 arg0, Canvas arg1, int arg2, int arg3) {
        this.field3149 = arg1;
        this.field3151 = arg2;
        this.field3148 = arg3;
        this.method1518(arg0, this.field3149, arg2, arg3);
    }
}
