import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class220 extends class55 implements class533 {

    @OriginalMember(owner = "client!p", name = "l", descriptor = "Ljava/awt/Canvas;")
    public Canvas field2841;

    @OriginalMember(owner = "client!p", name = "k", descriptor = "I")
    public int field2840;

    @OriginalMember(owner = "client!p", name = "n", descriptor = "I")
    public int field2843;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "Z")
    private static boolean field2842 = false;

    @OriginalMember(owner = "client!p", name = "o", descriptor = "J")
    private static long field2844;

    @OriginalMember(owner = "client!p", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!p", name = "finalize", descriptor = "()V", line = 3)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class280.method1680(false, this);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V", line = 9)
    public final void method1245(Rectangle[] arg0, int arg1, int arg2, int arg3) {
        try {
            synchronized (this.field2841.getTreeLock()) {
                for (int var6 = 0; var6 < arg1; var6++) {
                    Rectangle var7 = arg0[var6];
                    if (var7.width > 0 && var7.height > 0) {
                        this.method1249(var7.x, var7.y, var7.width, var7.height, arg2, arg3);
                    }
                }
                field2842 = false;
            }
        } catch (Exception var10) {
            this.method1247(var10);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/lang/Exception;)V", line = 34)
    private final void method1247(Exception arg0) {
        if (!field2842) {
            field2844 = class538.method2963(-47);
            field2842 = true;
        } else if (class538.method2963(-47) - field2844 < 30000L) {
            this.field2841.repaint();
        } else {
            throw new RuntimeException(arg0.getMessage());
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II)V", line = 60)
    public final void method1250(int arg0, int arg1) {
        try {
            synchronized (this.field2841.getTreeLock()) {
                Dimension var4 = this.field2841.getSize();
                this.method1246(arg0, arg1, var4.width, var4.height);
                field2842 = false;
            }
        } catch (Exception var7) {
            this.method1247(var7);
        }
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Loa;Ljava/awt/Canvas;II)V", line = 76)
    public class220(class694 arg0, Canvas arg1, int arg2, int arg3) {
        this.field2841 = arg1;
        this.field2840 = arg2;
        this.field2843 = arg3;
        this.method1253(arg0, this.field2841, arg2, arg3);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/awt/Canvas;II)V", line = 83)
    public final void method1251(Canvas arg0, int arg1, int arg2) {
        this.field2840 = arg1;
        this.field2843 = arg2;
        this.method1248(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "()V", line = 88)
    public final void method1252() {
        this.method73(true);
        this.nativeid = 0L;
        this.field2841 = null;
    }

    @OriginalMember(owner = "client!p", name = "H", descriptor = "(IIII)V")
    private final native void method1246(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!p", name = "oa", descriptor = "(Ljava/awt/Canvas;II)V")
    private final native void method1248(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!p", name = "K", descriptor = "(IIIIII)V")
    private final native void method1249(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!p", name = "w", descriptor = "(Z)V")
    public final native void method73(boolean arg0);

    @OriginalMember(owner = "client!p", name = "sa", descriptor = "(Loa;Ljava/awt/Canvas;II)V")
    private final native void method1253(class694 arg0, Canvas arg1, int arg2, int arg3);
}
