import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class453 extends class45 implements class247 {

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "Ljava/awt/Canvas;")
    public Canvas field5973;

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "Z")
    private static boolean field5971 = false;

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "J")
    private static long field5972;

    @OriginalMember(owner = "client!ta", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ta", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class69.method386(-1995, this);
        }
    }

    @OriginalMember(owner = "client!ta", name = "H", descriptor = "()V")
    private final native void method2544();

    @OriginalMember(owner = "client!ta", name = "da", descriptor = "(Ll;Ljava/awt/Canvas;II)V")
    private final native void method2545(class168 arg0, Canvas arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method2546(Rectangle[] arg0, int arg1) {
        try {
            synchronized (this.field5973.getTreeLock()) {
                for (int var4 = 0; var4 < arg1; var4++) {
                    Rectangle var5 = arg0[var4];
                    if (var5.width > 0 && var5.height > 0) {
                        this.method2549(var5.x, var5.y, var5.width, var5.height);
                    }
                }
                field5971 = false;
            }
        } catch (Exception var8) {
            this.method2548(var8);
        }
    }

    @OriginalMember(owner = "client!ta", name = "UA", descriptor = "(Z)V")
    public final native void method528(boolean arg0);

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "()V")
    public final void method2547() {
        try {
            synchronized (this.field5973.getTreeLock()) {
                this.method2544();
                field5971 = false;
            }
        } catch (Exception var4) {
            this.method2548(var4);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/lang/Exception;)V")
    private final void method2548(Exception arg0) {
        if (!field5971) {
            field5972 = class529.method2982((byte) -69);
            field5971 = true;
        } else if (class529.method2982((byte) -69) - field5972 < 30000L) {
            this.field5973.repaint();
        } else {
            throw new RuntimeException(arg0.getMessage());
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIII)V")
    private final native void method2549(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "()V")
    public final void method2550() {
        this.method528(true);
        this.nativeid = 0L;
        this.field5973 = null;
    }

    @OriginalMember(owner = "client!ta", name = "AA", descriptor = "(Ljava/awt/Canvas;II)V")
    public final native void method2551(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Ll;Ljava/awt/Canvas;)V")
    public class453(class168 arg0, Canvas arg1) {
        this.field5973 = arg1;
        Dimension var3 = arg1.getSize();
        this.method2545(arg0, this.field5973, var3.width, var3.height);
    }
}
