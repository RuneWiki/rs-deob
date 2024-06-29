import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class218 extends class134 implements class531 {

    @OriginalMember(owner = "client!p", name = "k", descriptor = "Ljava/awt/Canvas;")
    public Canvas field2528;

    @OriginalMember(owner = "client!p", name = "n", descriptor = "I")
    public int field2531;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "I")
    public int field2530;

    @OriginalMember(owner = "client!p", name = "j", descriptor = "Z")
    private static boolean field2527 = false;

    @OriginalMember(owner = "client!p", name = "l", descriptor = "J")
    private static long field2529;

    @OriginalMember(owner = "client!p", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!p", name = "sa", descriptor = "(Loa;Ljava/awt/Canvas;II)V")
    private final native void method1271(class692 arg0, Canvas arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!p", name = "H", descriptor = "(IIII)V")
    private final native void method1272(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II)V")
    public final void method1273(int arg0, int arg1) {
        try {
            synchronized (this.field2528.getTreeLock()) {
                Dimension var4 = this.field2528.getSize();
                this.method1272(arg0, arg1, var4.width, var4.height);
                field2527 = false;
            }
        } catch (Exception var7) {
            this.method1277(var7);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "()V")
    public final void method1274() {
        this.method83(true);
        this.nativeid = 0L;
        this.field2528 = null;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method1275(Canvas arg0, int arg1, int arg2) {
        this.field2531 = arg1;
        this.field2530 = arg2;
        this.method1276(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!p", name = "w", descriptor = "(Z)V")
    public final native void method83(boolean arg0);

    @OriginalMember(owner = "client!p", name = "oa", descriptor = "(Ljava/awt/Canvas;II)V")
    private final native void method1276(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!p", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class684.method3871(this, true);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/lang/Exception;)V")
    private final void method1277(Exception arg0) {
        if (!field2527) {
            field2529 = class652.method3700(-1);
            field2527 = true;
        } else if (class652.method3700(-1) - field2529 < 30000L) {
            this.field2528.repaint();
        } else {
            throw new RuntimeException(arg0.getMessage());
        }
    }

    @OriginalMember(owner = "client!p", name = "K", descriptor = "(IIIIII)V")
    private final native void method1278(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!p", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public final void method1279(Rectangle[] arg0, int arg1, int arg2, int arg3) {
        try {
            synchronized (this.field2528.getTreeLock()) {
                for (int var6 = 0; var6 < arg1; var6++) {
                    Rectangle var7 = arg0[var6];
                    if (var7.width > 0 && var7.height > 0) {
                        this.method1278(var7.x, var7.y, var7.width, var7.height, arg2, arg3);
                    }
                }
                field2527 = false;
            }
        } catch (Exception var10) {
            this.method1277(var10);
        }
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Loa;Ljava/awt/Canvas;II)V")
    public class218(class692 arg0, Canvas arg1, int arg2, int arg3) {
        this.field2528 = arg1;
        this.field2531 = arg2;
        this.field2530 = arg3;
        this.method1271(arg0, this.field2528, arg2, arg3);
    }
}
