import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class133 extends class529 implements class400 {

    @OriginalMember(owner = "client!b", name = "m", descriptor = "Ljava/awt/Canvas;")
    public Canvas field1802;

    @OriginalMember(owner = "client!b", name = "n", descriptor = "Z")
    private static boolean field1803 = false;

    @OriginalMember(owner = "client!b", name = "l", descriptor = "J")
    private static long field1801;

    @OriginalMember(owner = "client!b", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!b", name = "FA", descriptor = "(Lw;Ljava/awt/Canvas;II)V")
    private final native void method820(class459 arg0, Canvas arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!b", name = "TA", descriptor = "(IIII)V")
    private final native void method821(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!b", name = "a", descriptor = "()V")
    public final void method822() {
        try {
            synchronized (this.field1802.getTreeLock()) {
                this.method826();
                field1803 = false;
            }
        } catch (Exception var4) {
            this.method827(var4);
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "()V")
    public final void method823() {
        this.method175();
        this.nativeid = 0L;
        this.field1802 = null;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method824(Rectangle[] arg0, int arg1) {
        try {
            synchronized (this.field1802.getTreeLock()) {
                for (int var4 = 0; var4 < arg1; var4++) {
                    Rectangle var5 = arg0[var4];
                    if (var5.width > 0 && var5.height > 0) {
                        this.method821(var5.x, var5.y, var5.width, var5.height);
                    }
                }
                field1803 = false;
            }
        } catch (Exception var8) {
            this.method827(var8);
        }
    }

    @OriginalMember(owner = "client!b", name = "p", descriptor = "()V")
    public final native void method175();

    @OriginalMember(owner = "client!b", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class431.method2721(this, false);
        }
    }

    @OriginalMember(owner = "client!b", name = "U", descriptor = "(Ljava/awt/Canvas;II)V")
    public final native void method825(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lw;Ljava/awt/Canvas;)V")
    public class133(class459 arg0, Canvas arg1) {
        this.field1802 = arg1;
        Dimension var3 = arg1.getSize();
        this.method820(arg0, this.field1802, var3.width, var3.height);
    }

    @OriginalMember(owner = "client!b", name = "ya", descriptor = "()V")
    private final native void method826();

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Ljava/lang/Exception;)V")
    private final void method827(Exception arg0) {
        if (!field1803) {
            field1801 = class246.method1705((byte) 28);
            field1803 = true;
        } else if (class246.method1705((byte) 28) - field1801 < 30000L) {
            this.field1802.repaint();
        } else {
            throw new RuntimeException(arg0.getMessage());
        }
    }
}
