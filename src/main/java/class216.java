import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class216 extends class626 implements class529 {

    @OriginalMember(owner = "client!p", name = "h", descriptor = "Ljava/awt/Canvas;")
    public Canvas field3085;

    @OriginalMember(owner = "client!p", name = "i", descriptor = "I")
    public int field3086;

    @OriginalMember(owner = "client!p", name = "l", descriptor = "I")
    public int field3089;

    @OriginalMember(owner = "client!p", name = "j", descriptor = "Z")
    private static boolean field3087 = false;

    @OriginalMember(owner = "client!p", name = "k", descriptor = "J")
    private static long field3088;

    @OriginalMember(owner = "client!p", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/lang/Exception;)V", line = 3)
    private final void method1500(Exception arg0) {
        if (!field3087) {
            field3088 = class742.method4128(1);
            field3087 = true;
        } else if (class742.method4128(1) - field3088 < 30000L) {
            this.field3085.repaint();
        } else {
            throw new RuntimeException(arg0.getMessage());
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V", line = 28)
    public final void method1503(Rectangle[] arg0, int arg1, int arg2, int arg3) {
        try {
            synchronized (this.field3085.getTreeLock()) {
                for (int var6 = 0; var6 < arg1; var6++) {
                    Rectangle var7 = arg0[var6];
                    if (var7.width > 0 && var7.height > 0) {
                        this.method1501(var7.x, var7.y, var7.width, var7.height, arg2, arg3);
                    }
                }
                field3087 = false;
            }
        } catch (Exception var10) {
            this.method1500(var10);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "()V", line = 57)
    public final void method1504() {
        this.method107(true);
        this.nativeid = 0L;
        this.field3085 = null;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/awt/Canvas;II)V", line = 65)
    public final void method1506(Canvas arg0, int arg1, int arg2) {
        this.field3086 = arg1;
        this.field3089 = arg2;
        this.method1502(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Loa;Ljava/awt/Canvas;II)V", line = 70)
    public class216(class691 arg0, Canvas arg1, int arg2, int arg3) {
        this.field3085 = arg1;
        this.field3086 = arg2;
        this.field3089 = arg3;
        this.method1507(arg0, this.field3085, arg2, arg3);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II)V", line = 77)
    public final void method1508(int arg0, int arg1) {
        try {
            synchronized (this.field3085.getTreeLock()) {
                Dimension var4 = this.field3085.getSize();
                this.method1505(arg0, arg1, var4.width, var4.height);
                field3087 = false;
            }
        } catch (Exception var7) {
            this.method1500(var7);
        }
    }

    @OriginalMember(owner = "client!p", name = "finalize", descriptor = "()V", line = 89)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class727.method4045(this, 13483);
        }
    }

    @OriginalMember(owner = "client!p", name = "K", descriptor = "(IIIIII)V")
    private final native void method1501(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!p", name = "w", descriptor = "(Z)V")
    public final native void method107(boolean arg0);

    @OriginalMember(owner = "client!p", name = "oa", descriptor = "(Ljava/awt/Canvas;II)V")
    private final native void method1502(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!p", name = "H", descriptor = "(IIII)V")
    private final native void method1505(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!p", name = "sa", descriptor = "(Loa;Ljava/awt/Canvas;II)V")
    private final native void method1507(class691 arg0, Canvas arg1, int arg2, int arg3);
}
