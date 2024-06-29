import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class64 extends class766 implements class784 {

    @OriginalMember(owner = "client!p", name = "r", descriptor = "Ljava/awt/Canvas;")
    public Canvas field969;

    @OriginalMember(owner = "client!p", name = "p", descriptor = "I")
    public int field967;

    @OriginalMember(owner = "client!p", name = "q", descriptor = "I")
    public int field968;

    @OriginalMember(owner = "client!p", name = "n", descriptor = "Z")
    private static boolean field965 = false;

    @OriginalMember(owner = "client!p", name = "o", descriptor = "J")
    private static long field966;

    @OriginalMember(owner = "client!p", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!p", name = "finalize", descriptor = "()V", line = 3)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class270.method1726(this, -1);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V", line = 10)
    public final void method640(Rectangle[] arg0, int arg1, int arg2, int arg3) {
        try {
            synchronized (this.field969.getTreeLock()) {
                for (int var6 = 0; var6 < arg1; var6++) {
                    Rectangle var7 = arg0[var6];
                    if (var7.width > 0 && var7.height > 0) {
                        this.method645(var7.x, var7.y, var7.width, var7.height, arg2, arg3);
                    }
                }
                field965 = false;
            }
        } catch (Exception var10) {
            this.method646(var10);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/awt/Canvas;II)V", line = 38)
    public final void method643(Canvas arg0, int arg1, int arg2) {
        this.field967 = arg1;
        this.field968 = arg2;
        this.method642(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/lang/Exception;)V", line = 50)
    private final void method646(Exception arg0) {
        if (!field965) {
            field966 = class337.method2062(false);
            field965 = true;
        } else if (class337.method2062(false) - field966 < 30000L) {
            this.field969.repaint();
        } else {
            throw new RuntimeException(arg0.getMessage());
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II)V", line = 70)
    public final void method647(int arg0, int arg1) {
        try {
            synchronized (this.field969.getTreeLock()) {
                Dimension var4 = this.field969.getSize();
                this.method644(arg0, arg1, var4.width, var4.height);
                field965 = false;
            }
        } catch (Exception var7) {
            this.method646(var7);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "()V", line = 83)
    public final void method648() {
        this.method444(true);
        this.nativeid = 0L;
        this.field969 = null;
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Loa;Ljava/awt/Canvas;II)V", line = 87)
    public class64(class53 arg0, Canvas arg1, int arg2, int arg3) {
        this.field969 = arg1;
        this.field967 = arg2;
        this.field968 = arg3;
        this.method641(arg0, this.field969, arg2, arg3);
    }

    @OriginalMember(owner = "client!p", name = "sa", descriptor = "(Loa;Ljava/awt/Canvas;II)V")
    private final native void method641(class53 arg0, Canvas arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!p", name = "oa", descriptor = "(Ljava/awt/Canvas;II)V")
    private final native void method642(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!p", name = "w", descriptor = "(Z)V")
    public final native void method444(boolean arg0);

    @OriginalMember(owner = "client!p", name = "H", descriptor = "(IIII)V")
    private final native void method644(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!p", name = "K", descriptor = "(IIIIII)V")
    private final native void method645(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);
}
