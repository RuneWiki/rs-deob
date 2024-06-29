import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class230 extends class577 implements class557 {

    @OriginalMember(owner = "client!p", name = "l", descriptor = "Ljava/awt/Canvas;")
    public Canvas field3501;

    @OriginalMember(owner = "client!p", name = "p", descriptor = "I")
    public int field3505;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "I")
    public int field3502;

    @OriginalMember(owner = "client!p", name = "n", descriptor = "Z")
    private static boolean field3503 = false;

    @OriginalMember(owner = "client!p", name = "o", descriptor = "J")
    private static long field3504;

    @OriginalMember(owner = "client!p", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "()V", line = 7)
    public final void method1557() {
        this.method211(true);
        this.nativeid = 0L;
        this.field3501 = null;
    }

    @OriginalMember(owner = "client!p", name = "finalize", descriptor = "()V", line = 14)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class196.method1359(this, (byte) 90);
        }
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(II)V", line = 19)
    public final void method1559(int arg0, int arg1) {
        try {
            synchronized (this.field3501.getTreeLock()) {
                Dimension var4 = this.field3501.getSize();
                this.method1555(arg0, arg1, var4.width, var4.height);
                field3503 = false;
            }
        } catch (Exception var7) {
            this.method1561(var7);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/lang/Exception;)V", line = 35)
    private final void method1561(Exception arg0) {
        if (!field3503) {
            field3504 = class459.method2731(103);
            field3503 = true;
        } else if (class459.method2731(111) - field3504 < 30000L) {
            this.field3501.repaint();
        } else {
            throw new RuntimeException(arg0.getMessage());
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V", line = 58)
    public final void method1562(Rectangle[] arg0, int arg1, int arg2, int arg3) {
        try {
            synchronized (this.field3501.getTreeLock()) {
                for (int var6 = 0; var6 < arg1; var6++) {
                    Rectangle var7 = arg0[var6];
                    if (var7.width > 0 && var7.height > 0) {
                        this.method1560(var7.x, var7.y, var7.width, var7.height, arg2, arg3);
                    }
                }
                field3503 = false;
            }
        } catch (Exception var10) {
            this.method1561(var10);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/awt/Canvas;II)V", line = 83)
    public final void method1563(Canvas arg0, int arg1, int arg2) {
        this.field3505 = arg1;
        this.field3502 = arg2;
        this.method1556(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Loa;Ljava/awt/Canvas;II)V", line = 87)
    public class230(class722 arg0, Canvas arg1, int arg2, int arg3) {
        this.field3501 = arg1;
        this.field3505 = arg2;
        this.field3502 = arg3;
        this.method1558(arg0, this.field3501, arg2, arg3);
    }

    @OriginalMember(owner = "client!p", name = "H", descriptor = "(IIII)V")
    private final native void method1555(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!p", name = "oa", descriptor = "(Ljava/awt/Canvas;II)V")
    private final native void method1556(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!p", name = "sa", descriptor = "(Loa;Ljava/awt/Canvas;II)V")
    private final native void method1558(class722 arg0, Canvas arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!p", name = "K", descriptor = "(IIIIII)V")
    private final native void method1560(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!p", name = "w", descriptor = "(Z)V")
    public final native void method211(boolean arg0);
}
