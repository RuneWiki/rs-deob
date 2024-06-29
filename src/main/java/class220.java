import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class220 extends class362 implements class532 {

    @OriginalMember(owner = "client!p", name = "r", descriptor = "Ljava/awt/Canvas;")
    public Canvas field3172;

    @OriginalMember(owner = "client!p", name = "p", descriptor = "I")
    public int field3170;

    @OriginalMember(owner = "client!p", name = "s", descriptor = "I")
    public int field3173;

    @OriginalMember(owner = "client!p", name = "o", descriptor = "Z")
    private static boolean field3169 = false;

    @OriginalMember(owner = "client!p", name = "q", descriptor = "J")
    private static long field3171;

    @OriginalMember(owner = "client!p", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!p", name = "sa", descriptor = "(Loa;Ljava/awt/Canvas;II)V")
    private final native void method1562(class694 arg0, Canvas arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!p", name = "w", descriptor = "(Z)V")
    public final native void method129(boolean arg0);

    @OriginalMember(owner = "client!p", name = "H", descriptor = "(IIII)V")
    private final native void method1563(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!p", name = "oa", descriptor = "(Ljava/awt/Canvas;II)V")
    private final native void method1564(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/lang/Exception;)V")
    private final void method1565(Exception arg0) {
        if (!field3169) {
            field3171 = class554.method3190(-54);
            field3169 = true;
        } else if (class554.method3190(-88) - field3171 < 30000L) {
            this.field3172.repaint();
        } else {
            throw new RuntimeException(arg0.getMessage());
        }
    }

    @OriginalMember(owner = "client!p", name = "K", descriptor = "(IIIIII)V")
    private final native void method1566(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(II)V")
    public final void method1567(int arg0, int arg1) {
        try {
            synchronized (this.field3172.getTreeLock()) {
                Dimension var4 = this.field3172.getSize();
                this.method1563(arg0, arg1, var4.width, var4.height);
                field3169 = false;
            }
        } catch (Exception var7) {
            this.method1565(var7);
        }
    }

    @OriginalMember(owner = "client!p", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class305.method1997(0, this);
        }
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Loa;Ljava/awt/Canvas;II)V")
    public class220(class694 arg0, Canvas arg1, int arg2, int arg3) {
        this.field3172 = arg1;
        this.field3170 = arg2;
        this.field3173 = arg3;
        this.method1562(arg0, this.field3172, arg2, arg3);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public final void method1568(Rectangle[] arg0, int arg1, int arg2, int arg3) {
        try {
            synchronized (this.field3172.getTreeLock()) {
                for (int var6 = 0; var6 < arg1; var6++) {
                    Rectangle var7 = arg0[var6];
                    if (var7.width > 0 && var7.height > 0) {
                        this.method1566(var7.x, var7.y, var7.width, var7.height, arg2, arg3);
                    }
                }
                field3169 = false;
            }
        } catch (Exception var10) {
            this.method1565(var10);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method1569(Canvas arg0, int arg1, int arg2) {
        this.field3170 = arg1;
        this.field3173 = arg2;
        this.method1564(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "()V")
    public final void method1570() {
        this.method129(true);
        this.nativeid = 0L;
        this.field3172 = null;
    }
}
