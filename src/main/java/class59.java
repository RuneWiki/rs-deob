import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class59 extends class627 implements class752 {

    @OriginalMember(owner = "client!p", name = "k", descriptor = "Ljava/awt/Canvas;")
    public Canvas field827;

    @OriginalMember(owner = "client!p", name = "l", descriptor = "I")
    public int field828;

    @OriginalMember(owner = "client!p", name = "n", descriptor = "I")
    public int field830;

    @OriginalMember(owner = "client!p", name = "j", descriptor = "Z")
    private static boolean field826 = false;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "J")
    private static long field829;

    @OriginalMember(owner = "client!p", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/lang/Exception;)V", line = 5)
    private final void method462(Exception arg0) {
        if (!field826) {
            field829 = class97.method654((byte) 69);
            field826 = true;
        } else if (class97.method654((byte) 43) - field829 < 30000L) {
            this.field827.repaint();
        } else {
            throw new RuntimeException(arg0.getMessage());
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V", line = 27)
    public final void method464(Rectangle[] arg0, int arg1, int arg2, int arg3) {
        try {
            synchronized (this.field827.getTreeLock()) {
                for (int var6 = 0; var6 < arg1; var6++) {
                    Rectangle var7 = arg0[var6];
                    if (var7.width > 0 && var7.height > 0) {
                        this.method470(var7.x, var7.y, var7.width, var7.height, arg2, arg3);
                    }
                }
                field826 = false;
            }
        } catch (Exception var10) {
            this.method462(var10);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/awt/Canvas;II)V", line = 52)
    public final void method465(Canvas arg0, int arg1, int arg2) {
        this.field828 = arg1;
        this.field830 = arg2;
        this.method463(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II)V", line = 58)
    public final void method467(int arg0, int arg1) {
        try {
            synchronized (this.field827.getTreeLock()) {
                Dimension var4 = this.field827.getSize();
                this.method466(arg0, arg1, var4.width, var4.height);
                field826 = false;
            }
        } catch (Exception var7) {
            this.method462(var7);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "()V", line = 72)
    public final void method468() {
        this.method414(true);
        this.nativeid = 0L;
        this.field827 = null;
    }

    @OriginalMember(owner = "client!p", name = "finalize", descriptor = "()V", line = 80)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class133.method841(0, this);
        }
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Loa;Ljava/awt/Canvas;II)V", line = 84)
    public class59(class50 arg0, Canvas arg1, int arg2, int arg3) {
        this.field827 = arg1;
        this.field828 = arg2;
        this.field830 = arg3;
        this.method469(arg0, this.field827, arg2, arg3);
    }

    @OriginalMember(owner = "client!p", name = "oa", descriptor = "(Ljava/awt/Canvas;II)V")
    private final native void method463(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!p", name = "H", descriptor = "(IIII)V")
    private final native void method466(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!p", name = "w", descriptor = "(Z)V")
    public final native void method414(boolean arg0);

    @OriginalMember(owner = "client!p", name = "sa", descriptor = "(Loa;Ljava/awt/Canvas;II)V")
    private final native void method469(class50 arg0, Canvas arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!p", name = "K", descriptor = "(IIIIII)V")
    private final native void method470(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);
}
