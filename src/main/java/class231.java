import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class231 extends class159 implements class558 {

    @OriginalMember(owner = "client!p", name = "m", descriptor = "Ljava/awt/Canvas;")
    public Canvas field2964;

    @OriginalMember(owner = "client!p", name = "o", descriptor = "I")
    public int field2966;

    @OriginalMember(owner = "client!p", name = "n", descriptor = "I")
    public int field2965;

    @OriginalMember(owner = "client!p", name = "k", descriptor = "Z")
    private static boolean field2962 = false;

    @OriginalMember(owner = "client!p", name = "l", descriptor = "J")
    private static long field2963;

    @OriginalMember(owner = "client!p", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!p", name = "sa", descriptor = "(Loa;Ljava/awt/Canvas;II)V")
    private final native void method1452(class721 arg0, Canvas arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!p", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public final void method1453(Rectangle[] arg0, int arg1, int arg2, int arg3) {
        try {
            synchronized (this.field2964.getTreeLock()) {
                for (int var6 = 0; var6 < arg1; var6++) {
                    Rectangle var7 = arg0[var6];
                    if (var7.width > 0 && var7.height > 0) {
                        this.method1454(var7.x, var7.y, var7.width, var7.height, arg2, arg3);
                    }
                }
                field2962 = false;
            }
        } catch (Exception var10) {
            this.method1457(var10);
        }
    }

    @OriginalMember(owner = "client!p", name = "K", descriptor = "(IIIIII)V")
    private final native void method1454(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!p", name = "H", descriptor = "(IIII)V")
    private final native void method1455(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!p", name = "oa", descriptor = "(Ljava/awt/Canvas;II)V")
    private final native void method1456(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/lang/Exception;)V")
    private final void method1457(Exception arg0) {
        if (!field2962) {
            field2963 = class401.method2440(false);
            field2962 = true;
        } else if (class401.method2440(false) - field2963 < 30000L) {
            this.field2964.repaint();
        } else {
            throw new RuntimeException(arg0.getMessage());
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II)V")
    public final void method1458(int arg0, int arg1) {
        try {
            synchronized (this.field2964.getTreeLock()) {
                Dimension var4 = this.field2964.getSize();
                this.method1455(arg0, arg1, var4.width, var4.height);
                field2962 = false;
            }
        } catch (Exception var7) {
            this.method1457(var7);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "()V")
    public final void method1459() {
        this.method105(true);
        this.nativeid = 0L;
        this.field2964 = null;
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Loa;Ljava/awt/Canvas;II)V")
    public class231(class721 arg0, Canvas arg1, int arg2, int arg3) {
        this.field2964 = arg1;
        this.field2966 = arg2;
        this.field2965 = arg3;
        this.method1452(arg0, this.field2964, arg2, arg3);
    }

    @OriginalMember(owner = "client!p", name = "w", descriptor = "(Z)V")
    public final native void method105(boolean arg0);

    @OriginalMember(owner = "client!p", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class766.method4210((byte) -4, this);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method1460(Canvas arg0, int arg1, int arg2) {
        this.field2966 = arg1;
        this.field2965 = arg2;
        this.method1456(arg0, arg1, arg2);
    }
}
