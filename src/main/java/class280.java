import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class280 extends class417 implements class28 {

    @OriginalMember(owner = "client!b", name = "j", descriptor = "Ljava/awt/Canvas;")
    public Canvas field3915;

    @OriginalMember(owner = "client!b", name = "k", descriptor = "Z")
    private static boolean field3916 = false;

    @OriginalMember(owner = "client!b", name = "i", descriptor = "J")
    private static long field3914;

    @OriginalMember(owner = "client!b", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method1748(Rectangle[] arg0, int arg1) {
        try {
            synchronized (this.field3915.getTreeLock()) {
                for (int var4 = 0; var4 < arg1; var4++) {
                    Rectangle var5 = arg0[var4];
                    if (var5.width > 0 && var5.height > 0) {
                        this.method1751(var5.x, var5.y, var5.width, var5.height);
                    }
                }
                field3916 = false;
            }
        } catch (Exception var8) {
            this.method1750(var8);
        }
    }

    @OriginalMember(owner = "client!b", name = "NA", descriptor = "(Z)V")
    public final native void method63(boolean arg0);

    @OriginalMember(owner = "client!b", name = "a", descriptor = "()V")
    public final void method1749() {
        try {
            synchronized (this.field3915.getTreeLock()) {
                this.method1755();
                field3916 = false;
            }
        } catch (Exception var4) {
            this.method1750(var4);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Ljava/lang/Exception;)V")
    private final void method1750(Exception arg0) {
        if (!field3916) {
            field3914 = class598.method3538(true);
            field3916 = true;
        } else if (class598.method3538(true) - field3914 < 30000L) {
            this.field3915.repaint();
        } else {
            throw new RuntimeException(arg0.getMessage());
        }
    }

    @OriginalMember(owner = "client!b", name = "ea", descriptor = "(IIII)V")
    private final native void method1751(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!b", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class292.method1797(-123, this);
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "()V")
    public final void method1752() {
        this.method63(true);
        this.nativeid = 0L;
        this.field3915 = null;
    }

    @OriginalMember(owner = "client!b", name = "BA", descriptor = "(La;Ljava/awt/Canvas;II)V")
    private final native void method1753(class530 arg0, Canvas arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!b", name = "xa", descriptor = "(Ljava/awt/Canvas;II)V")
    public final native void method1754(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(La;Ljava/awt/Canvas;)V")
    public class280(class530 arg0, Canvas arg1) {
        this.field3915 = arg1;
        Dimension var3 = arg1.getSize();
        this.method1753(arg0, this.field3915, var3.width, var3.height);
    }

    @OriginalMember(owner = "client!b", name = "ga", descriptor = "()V")
    private final native void method1755();
}
