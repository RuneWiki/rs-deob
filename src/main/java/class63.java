import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class63 extends class69 implements class784 {

    @OriginalMember(owner = "client!p", name = "j", descriptor = "Ljava/awt/Canvas;")
    public Canvas field705;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "I")
    public int field708;

    @OriginalMember(owner = "client!p", name = "k", descriptor = "I")
    public int field706;

    @OriginalMember(owner = "client!p", name = "l", descriptor = "Z")
    private static boolean field707 = false;

    @OriginalMember(owner = "client!p", name = "n", descriptor = "J")
    private static long field709;

    @OriginalMember(owner = "client!p", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/lang/Exception;)V", line = 7)
    private final void method497(Exception arg0) {
        if (!field707) {
            field709 = class683.method3903((byte) 4);
            field707 = true;
        } else if (class683.method3903((byte) 4) - field709 < 30000L) {
            this.field705.repaint();
        } else {
            throw new RuntimeException(arg0.getMessage());
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V", line = 29)
    public final void method498(Rectangle[] arg0, int arg1, int arg2, int arg3) {
        try {
            synchronized (this.field705.getTreeLock()) {
                for (int var6 = 0; var6 < arg1; var6++) {
                    Rectangle var7 = arg0[var6];
                    if (var7.width > 0 && var7.height > 0) {
                        this.method500(var7.x, var7.y, var7.width, var7.height, arg2, arg3);
                    }
                }
                field707 = false;
            }
        } catch (Exception var10) {
            this.method497(var10);
        }
    }

    @OriginalMember(owner = "client!p", name = "finalize", descriptor = "()V", line = 54)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class398.method2447(true, this);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "()V", line = 60)
    public final void method499() {
        this.method450(true);
        this.nativeid = 0L;
        this.field705 = null;
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Loa;Ljava/awt/Canvas;II)V", line = 67)
    public class63(class52 arg0, Canvas arg1, int arg2, int arg3) {
        this.field705 = arg1;
        this.field708 = arg2;
        this.field706 = arg3;
        this.method494(arg0, this.field705, arg2, arg3);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/awt/Canvas;II)V", line = 77)
    public final void method501(Canvas arg0, int arg1, int arg2) {
        this.field708 = arg1;
        this.field706 = arg2;
        this.method496(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II)V", line = 82)
    public final void method502(int arg0, int arg1) {
        try {
            synchronized (this.field705.getTreeLock()) {
                Dimension var4 = this.field705.getSize();
                this.method495(arg0, arg1, var4.width, var4.height);
                field707 = false;
            }
        } catch (Exception var7) {
            this.method497(var7);
        }
    }

    @OriginalMember(owner = "client!p", name = "sa", descriptor = "(Loa;Ljava/awt/Canvas;II)V")
    private final native void method494(class52 arg0, Canvas arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!p", name = "H", descriptor = "(IIII)V")
    private final native void method495(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!p", name = "oa", descriptor = "(Ljava/awt/Canvas;II)V")
    private final native void method496(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!p", name = "w", descriptor = "(Z)V")
    public final native void method450(boolean arg0);

    @OriginalMember(owner = "client!p", name = "K", descriptor = "(IIIIII)V")
    private final native void method500(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);
}
