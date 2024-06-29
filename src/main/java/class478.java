import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class478 extends class130 implements class28 {

    @OriginalMember(owner = "client!b", name = "l", descriptor = "Ljava/awt/Canvas;")
    public Canvas field7028;

    @OriginalMember(owner = "client!b", name = "k", descriptor = "Z")
    private static boolean field7027 = false;

    @OriginalMember(owner = "client!b", name = "m", descriptor = "J")
    private static long field7029;

    @OriginalMember(owner = "client!b", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "()V", line = 5)
    public final void method2886() {
        try {
            synchronized (this.field7028.getTreeLock()) {
                this.method2885();
                field7027 = false;
            }
        } catch (Exception var4) {
            this.method2888(var4);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Ljava/lang/Exception;)V", line = 20)
    private final void method2888(Exception arg0) {
        if (!field7027) {
            field7029 = class375.method2397((byte) -75);
            field7027 = true;
        } else if (class375.method2397((byte) -75) - field7029 < 30000L) {
            this.field7028.repaint();
        } else {
            throw new RuntimeException(arg0.getMessage());
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "()V", line = 41)
    public final void method2889() {
        this.method164();
        this.nativeid = 0L;
        this.field7028 = null;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 47)
    public final void method2890(Rectangle[] arg0, int arg1) {
        try {
            synchronized (this.field7028.getTreeLock()) {
                for (int var4 = 0; var4 < arg1; var4++) {
                    Rectangle var5 = arg0[var4];
                    if (var5.width > 0 && var5.height > 0) {
                        this.method2887(var5.x, var5.y, var5.width, var5.height);
                    }
                }
                field7027 = false;
            }
        } catch (Exception var8) {
            this.method2888(var8);
        }
    }

    @OriginalMember(owner = "client!b", name = "finalize", descriptor = "()V", line = 71)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class45.method300(this, 0);
        }
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lw;Ljava/awt/Canvas;)V", line = 78)
    public class478(class69 arg0, Canvas arg1) {
        this.field7028 = arg1;
        Dimension var3 = arg1.getSize();
        this.method2892(arg0, this.field7028, var3.width, var3.height);
    }

    @OriginalMember(owner = "client!b", name = "ya", descriptor = "()V")
    private final native void method2885();

    @OriginalMember(owner = "client!b", name = "TA", descriptor = "(IIII)V")
    private final native void method2887(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!b", name = "U", descriptor = "(Ljava/awt/Canvas;II)V")
    public final native void method2891(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!b", name = "FA", descriptor = "(Lw;Ljava/awt/Canvas;II)V")
    private final native void method2892(class69 arg0, Canvas arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!b", name = "p", descriptor = "()V")
    public final native void method164();
}
