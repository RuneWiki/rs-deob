import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class227 extends class540 implements class556 {

    @OriginalMember(owner = "client!p", name = "j", descriptor = "Ljava/awt/Canvas;")
    public Canvas field3247;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "I")
    public int field3250;

    @OriginalMember(owner = "client!p", name = "k", descriptor = "I")
    public int field3248;

    @OriginalMember(owner = "client!p", name = "i", descriptor = "Z")
    private static boolean field3246 = false;

    @OriginalMember(owner = "client!p", name = "l", descriptor = "J")
    private static long field3249;

    @OriginalMember(owner = "client!p", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!p", name = "w", descriptor = "(Z)V")
    public final native void method156(boolean arg0);

    @OriginalMember(owner = "client!p", name = "a", descriptor = "()V")
    public final void method1565() {
        this.method156(true);
        this.nativeid = 0L;
        this.field3247 = null;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method1566(Canvas arg0, int arg1, int arg2) {
        this.field3250 = arg1;
        this.field3248 = arg2;
        this.method1569(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public final void method1567(Rectangle[] arg0, int arg1, int arg2, int arg3) {
        try {
            synchronized (this.field3247.getTreeLock()) {
                for (int var6 = 0; var6 < arg1; var6++) {
                    Rectangle var7 = arg0[var6];
                    if (var7.width > 0 && var7.height > 0) {
                        this.method1573(var7.x, var7.y, var7.width, var7.height, arg2, arg3);
                    }
                }
                field3246 = false;
            }
        } catch (Exception var10) {
            this.method1568(var10);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/lang/Exception;)V")
    private final void method1568(Exception arg0) {
        if (!field3246) {
            field3249 = class109.method731(65);
            field3246 = true;
        } else if (class109.method731(41) - field3249 < 30000L) {
            this.field3247.repaint();
        } else {
            throw new RuntimeException(arg0.getMessage());
        }
    }

    @OriginalMember(owner = "client!p", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class349.method2206(18, this);
        }
    }

    @OriginalMember(owner = "client!p", name = "oa", descriptor = "(Ljava/awt/Canvas;II)V")
    private final native void method1569(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!p", name = "H", descriptor = "(IIII)V")
    private final native void method1570(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!p", name = "sa", descriptor = "(Loa;Ljava/awt/Canvas;II)V")
    private final native void method1571(class721 arg0, Canvas arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II)V")
    public final void method1572(int arg0, int arg1) {
        try {
            synchronized (this.field3247.getTreeLock()) {
                Dimension var4 = this.field3247.getSize();
                this.method1570(arg0, arg1, var4.width, var4.height);
                field3246 = false;
            }
        } catch (Exception var7) {
            this.method1568(var7);
        }
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Loa;Ljava/awt/Canvas;II)V")
    public class227(class721 arg0, Canvas arg1, int arg2, int arg3) {
        this.field3247 = arg1;
        this.field3250 = arg2;
        this.field3248 = arg3;
        this.method1571(arg0, this.field3247, arg2, arg3);
    }

    @OriginalMember(owner = "client!p", name = "K", descriptor = "(IIIIII)V")
    private final native void method1573(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);
}
