import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class193 extends class665 implements class198 {

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "Ljava/awt/Canvas;")
    public Canvas field2782;

    @OriginalMember(owner = "client!ta", name = "m", descriptor = "Z")
    private static boolean field2783 = false;

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "J")
    private static long field2781;

    @OriginalMember(owner = "client!ta", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ta", name = "da", descriptor = "(Ll;Ljava/awt/Canvas;II)V")
    private final native void method1295(class18 arg0, Canvas arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "()V")
    public final void method1296() {
        this.method131(true);
        this.nativeid = 0L;
        this.field2782 = null;
    }

    @OriginalMember(owner = "client!ta", name = "UA", descriptor = "(Z)V")
    public final native void method131(boolean arg0);

    @OriginalMember(owner = "client!ta", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class509.method2924((byte) -106, this);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/lang/Exception;)V")
    private final void method1297(Exception arg0) {
        if (!field2783) {
            field2781 = class490.method2840(true);
            field2783 = true;
        } else if (class490.method2840(true) - field2781 < 30000L) {
            this.field2782.repaint();
        } else {
            throw new RuntimeException(arg0.getMessage());
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method1298(Rectangle[] arg0, int arg1) {
        try {
            synchronized (this.field2782.getTreeLock()) {
                for (int var4 = 0; var4 < arg1; var4++) {
                    Rectangle var5 = arg0[var4];
                    if (var5.width > 0 && var5.height > 0) {
                        this.method1302(var5.x, var5.y, var5.width, var5.height);
                    }
                }
                field2783 = false;
            }
        } catch (Exception var8) {
            this.method1297(var8);
        }
    }

    @OriginalMember(owner = "client!ta", name = "H", descriptor = "()V")
    private final native void method1299();

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Ll;Ljava/awt/Canvas;)V")
    public class193(class18 arg0, Canvas arg1) {
        this.field2782 = arg1;
        Dimension var3 = arg1.getSize();
        this.method1295(arg0, this.field2782, var3.width, var3.height);
    }

    @OriginalMember(owner = "client!ta", name = "AA", descriptor = "(Ljava/awt/Canvas;II)V")
    public final native void method1300(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "()V")
    public final void method1301() {
        try {
            synchronized (this.field2782.getTreeLock()) {
                this.method1299();
                field2783 = false;
            }
        } catch (Exception var4) {
            this.method1297(var4);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIII)V")
    private final native void method1302(int arg0, int arg1, int arg2, int arg3);
}
