import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class220 extends class656 implements class533 {

    @OriginalMember(owner = "client!p", name = "k", descriptor = "Ljava/awt/Canvas;")
    public Canvas field3152;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "I")
    public int field3154;

    @OriginalMember(owner = "client!p", name = "j", descriptor = "I")
    public int field3151;

    @OriginalMember(owner = "client!p", name = "i", descriptor = "Z")
    private static boolean field3150 = false;

    @OriginalMember(owner = "client!p", name = "l", descriptor = "J")
    private static long field3153;

    @OriginalMember(owner = "client!p", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V", line = 4)
    public final void method1411(Rectangle[] arg0, int arg1, int arg2, int arg3) {
        try {
            synchronized (this.field3152.getTreeLock()) {
                for (int var6 = 0; var6 < arg1; var6++) {
                    Rectangle var7 = arg0[var6];
                    if (var7.width > 0 && var7.height > 0) {
                        this.method1418(var7.x, var7.y, var7.width, var7.height, arg2, arg3);
                    }
                }
                field3150 = false;
            }
        } catch (Exception var10) {
            this.method1412(var10);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/lang/Exception;)V", line = 28)
    private final void method1412(Exception arg0) {
        if (!field3150) {
            field3153 = class375.method2193(116);
            field3150 = true;
        } else if (class375.method2193(116) - field3153 < 30000L) {
            this.field3152.repaint();
        } else {
            throw new RuntimeException(arg0.getMessage());
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "()V", line = 49)
    public final void method1413() {
        this.method116(true);
        this.nativeid = 0L;
        this.field3152 = null;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II)V", line = 57)
    public final void method1415(int arg0, int arg1) {
        try {
            synchronized (this.field3152.getTreeLock()) {
                Dimension var4 = this.field3152.getSize();
                this.method1419(arg0, arg1, var4.width, var4.height);
                field3150 = false;
            }
        } catch (Exception var7) {
            this.method1412(var7);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/awt/Canvas;II)V", line = 70)
    public final void method1417(Canvas arg0, int arg1, int arg2) {
        this.field3154 = arg1;
        this.field3151 = arg2;
        this.method1416(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!p", name = "finalize", descriptor = "()V", line = 75)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class521.method2896(this, (byte) -116);
        }
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Loa;Ljava/awt/Canvas;II)V", line = 87)
    public class220(class695 arg0, Canvas arg1, int arg2, int arg3) {
        this.field3152 = arg1;
        this.field3154 = arg2;
        this.field3151 = arg3;
        this.method1414(arg0, this.field3152, arg2, arg3);
    }

    @OriginalMember(owner = "client!p", name = "sa", descriptor = "(Loa;Ljava/awt/Canvas;II)V")
    private final native void method1414(class695 arg0, Canvas arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!p", name = "oa", descriptor = "(Ljava/awt/Canvas;II)V")
    private final native void method1416(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!p", name = "w", descriptor = "(Z)V")
    public final native void method116(boolean arg0);

    @OriginalMember(owner = "client!p", name = "K", descriptor = "(IIIIII)V")
    private final native void method1418(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!p", name = "H", descriptor = "(IIII)V")
    private final native void method1419(int arg0, int arg1, int arg2, int arg3);
}
