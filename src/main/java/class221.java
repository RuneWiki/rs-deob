import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class221 extends class168 implements class535 {

    @OriginalMember(owner = "client!p", name = "k", descriptor = "Ljava/awt/Canvas;")
    public Canvas field2958;

    @OriginalMember(owner = "client!p", name = "j", descriptor = "I")
    public int field2957;

    @OriginalMember(owner = "client!p", name = "n", descriptor = "I")
    public int field2961;

    @OriginalMember(owner = "client!p", name = "l", descriptor = "Z")
    private static boolean field2959 = false;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "J")
    private static long field2960;

    @OriginalMember(owner = "client!p", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!p", name = "K", descriptor = "(IIIIII)V")
    private final native void method1432(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!p", name = "a", descriptor = "()V")
    public final void method1433() {
        this.method123(true);
        this.nativeid = 0L;
        this.field2958 = null;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/lang/Exception;)V")
    private final void method1434(Exception arg0) {
        if (!field2959) {
            field2960 = class446.method2525(500);
            field2959 = true;
        } else if (class446.method2525(500) - field2960 < 30000L) {
            this.field2958.repaint();
        } else {
            throw new RuntimeException(arg0.getMessage());
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public final void method1435(Rectangle[] arg0, int arg1, int arg2, int arg3) {
        try {
            synchronized (this.field2958.getTreeLock()) {
                for (int var6 = 0; var6 < arg1; var6++) {
                    Rectangle var7 = arg0[var6];
                    if (var7.width > 0 && var7.height > 0) {
                        this.method1432(var7.x, var7.y, var7.width, var7.height, arg2, arg3);
                    }
                }
                field2959 = false;
            }
        } catch (Exception var10) {
            this.method1434(var10);
        }
    }

    @OriginalMember(owner = "client!p", name = "H", descriptor = "(IIII)V")
    private final native void method1436(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!p", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class166.method1167(this, -1);
        }
    }

    @OriginalMember(owner = "client!p", name = "sa", descriptor = "(Loa;Ljava/awt/Canvas;II)V")
    private final native void method1437(class696 arg0, Canvas arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method1438(Canvas arg0, int arg1, int arg2) {
        this.field2957 = arg1;
        this.field2961 = arg2;
        this.method1440(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II)V")
    public final void method1439(int arg0, int arg1) {
        try {
            synchronized (this.field2958.getTreeLock()) {
                Dimension var4 = this.field2958.getSize();
                this.method1436(arg0, arg1, var4.width, var4.height);
                field2959 = false;
            }
        } catch (Exception var7) {
            this.method1434(var7);
        }
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Loa;Ljava/awt/Canvas;II)V")
    public class221(class696 arg0, Canvas arg1, int arg2, int arg3) {
        this.field2958 = arg1;
        this.field2957 = arg2;
        this.field2961 = arg3;
        this.method1437(arg0, this.field2958, arg2, arg3);
    }

    @OriginalMember(owner = "client!p", name = "w", descriptor = "(Z)V")
    public final native void method123(boolean arg0);

    @OriginalMember(owner = "client!p", name = "oa", descriptor = "(Ljava/awt/Canvas;II)V")
    private final native void method1440(Canvas arg0, int arg1, int arg2);
}
