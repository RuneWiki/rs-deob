import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class228 extends class568 implements class560 {

    @OriginalMember(owner = "client!p", name = "m", descriptor = "Ljava/awt/Canvas;")
    public Canvas field3556;

    @OriginalMember(owner = "client!p", name = "o", descriptor = "I")
    public int field3554;

    @OriginalMember(owner = "client!p", name = "l", descriptor = "I")
    public int field3558;

    @OriginalMember(owner = "client!p", name = "n", descriptor = "Z")
    private static boolean field3557 = false;

    @OriginalMember(owner = "client!p", name = "p", descriptor = "J")
    private static long field3555;

    @OriginalMember(owner = "client!p", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "()V", line = 8)
    public final void method1995() {
        this.method121(true);
        this.nativeid = 0L;
        this.field3556 = null;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/awt/Canvas;II)V", line = 13)
    public final void method1996(Canvas arg0, int arg1, int arg2) {
        this.field3554 = arg1;
        this.field3558 = arg2;
        this.method2001(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(II)V", line = 20)
    public final void method1998(int arg0, int arg1) {
        try {
            synchronized (this.field3556.getTreeLock()) {
                Dimension var4 = this.field3556.getSize();
                this.method1999(arg0, arg1, var4.width, var4.height);
                field3557 = false;
            }
        } catch (Exception var7) {
            this.method2002(var7);
        }
    }

    @OriginalMember(owner = "client!p", name = "finalize", descriptor = "()V", line = 33)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class377.method3103(this, false);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V", line = 38)
    public final void method2000(Rectangle[] arg0, int arg1, int arg2, int arg3) {
        try {
            synchronized (this.field3556.getTreeLock()) {
                for (int var6 = 0; var6 < arg1; var6++) {
                    Rectangle var7 = arg0[var6];
                    if (var7.width > 0 && var7.height > 0) {
                        this.method1997(var7.x, var7.y, var7.width, var7.height, arg2, arg3);
                    }
                }
                field3557 = false;
            }
        } catch (Exception var10) {
            this.method2002(var10);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/lang/Exception;)V", line = 65)
    private final void method2002(Exception arg0) {
        if (!field3557) {
            field3555 = class712.method5167(-2334);
            field3557 = true;
        } else if (class712.method5167(-2334) - field3555 < 30000L) {
            this.field3556.repaint();
        } else {
            throw new RuntimeException(arg0.getMessage());
        }
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Loa;Ljava/awt/Canvas;II)V", line = 84)
    public class228(class725 arg0, Canvas arg1, int arg2, int arg3) {
        this.field3556 = arg1;
        this.field3554 = arg2;
        this.field3558 = arg3;
        this.method1994(arg0, this.field3556, arg2, arg3);
    }

    @OriginalMember(owner = "client!p", name = "w", descriptor = "(Z)V")
    public final native void method121(boolean arg0);

    @OriginalMember(owner = "client!p", name = "sa", descriptor = "(Loa;Ljava/awt/Canvas;II)V")
    private final native void method1994(class725 arg0, Canvas arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!p", name = "K", descriptor = "(IIIIII)V")
    private final native void method1997(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!p", name = "H", descriptor = "(IIII)V")
    private final native void method1999(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!p", name = "oa", descriptor = "(Ljava/awt/Canvas;II)V")
    private final native void method2001(Canvas arg0, int arg1, int arg2);
}
