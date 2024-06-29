import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class232 extends class154 implements class560 {

    @OriginalMember(owner = "client!p", name = "l", descriptor = "Ljava/awt/Canvas;")
    public Canvas field3363;

    @OriginalMember(owner = "client!p", name = "j", descriptor = "I")
    public int field3361;

    @OriginalMember(owner = "client!p", name = "k", descriptor = "I")
    public int field3362;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "Z")
    private static boolean field3364 = false;

    @OriginalMember(owner = "client!p", name = "i", descriptor = "J")
    private static long field3360;

    @OriginalMember(owner = "client!p", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!p", name = "sa", descriptor = "(Loa;Ljava/awt/Canvas;II)V")
    private final native void method1567(class723 arg0, Canvas arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!p", name = "K", descriptor = "(IIIIII)V")
    private final native void method1568(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II)V")
    public final void method1569(int arg0, int arg1) {
        try {
            synchronized (this.field3363.getTreeLock()) {
                Dimension var4 = this.field3363.getSize();
                this.method1573(arg0, arg1, var4.width, var4.height);
                field3364 = false;
            }
        } catch (Exception var7) {
            this.method1571(var7);
        }
    }

    @OriginalMember(owner = "client!p", name = "oa", descriptor = "(Ljava/awt/Canvas;II)V")
    private final native void method1570(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/lang/Exception;)V")
    private final void method1571(Exception arg0) {
        if (!field3364) {
            field3360 = class197.method1423(1);
            field3364 = true;
        } else if (class197.method1423(1) - field3360 < 30000L) {
            this.field3363.repaint();
        } else {
            throw new RuntimeException(arg0.getMessage());
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public final void method1572(Rectangle[] arg0, int arg1, int arg2, int arg3) {
        try {
            synchronized (this.field3363.getTreeLock()) {
                for (int var6 = 0; var6 < arg1; var6++) {
                    Rectangle var7 = arg0[var6];
                    if (var7.width > 0 && var7.height > 0) {
                        this.method1568(var7.x, var7.y, var7.width, var7.height, arg2, arg3);
                    }
                }
                field3364 = false;
            }
        } catch (Exception var10) {
            this.method1571(var10);
        }
    }

    @OriginalMember(owner = "client!p", name = "H", descriptor = "(IIII)V")
    private final native void method1573(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!p", name = "w", descriptor = "(Z)V")
    public final native void method131(boolean arg0);

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Loa;Ljava/awt/Canvas;II)V")
    public class232(class723 arg0, Canvas arg1, int arg2, int arg3) {
        this.field3363 = arg1;
        this.field3361 = arg2;
        this.field3362 = arg3;
        this.method1567(arg0, this.field3363, arg2, arg3);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method1574(Canvas arg0, int arg1, int arg2) {
        this.field3361 = arg1;
        this.field3362 = arg2;
        this.method1570(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "()V")
    public final void method1575() {
        this.method131(true);
        this.nativeid = 0L;
        this.field3363 = null;
    }

    @OriginalMember(owner = "client!p", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class86.method690(this, (byte) 44);
        }
    }
}
