import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class216 extends class189 implements class532 {

    @OriginalMember(owner = "client!p", name = "j", descriptor = "Ljava/awt/Canvas;")
    public Canvas field2832;

    @OriginalMember(owner = "client!p", name = "l", descriptor = "I")
    public int field2834;

    @OriginalMember(owner = "client!p", name = "k", descriptor = "I")
    public int field2833;

    @OriginalMember(owner = "client!p", name = "n", descriptor = "Z")
    private static boolean field2836 = false;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "J")
    private static long field2835;

    @OriginalMember(owner = "client!p", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "()V", line = 4)
    public final void method1326() {
        this.method106(true);
        this.nativeid = 0L;
        this.field2832 = null;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/awt/Canvas;II)V", line = 16)
    public final void method1330(Canvas arg0, int arg1, int arg2) {
        this.field2834 = arg1;
        this.field2833 = arg2;
        this.method1328(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V", line = 23)
    public final void method1332(Rectangle[] arg0, int arg1, int arg2, int arg3) {
        try {
            synchronized (this.field2832.getTreeLock()) {
                for (int var6 = 0; var6 < arg1; var6++) {
                    Rectangle var7 = arg0[var6];
                    if (var7.width > 0 && var7.height > 0) {
                        this.method1327(var7.x, var7.y, var7.width, var7.height, arg2, arg3);
                    }
                }
                field2836 = false;
            }
        } catch (Exception var10) {
            this.method1333(var10);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/lang/Exception;)V", line = 47)
    private final void method1333(Exception arg0) {
        if (!field2836) {
            field2835 = class479.method2864((byte) -119);
            field2836 = true;
        } else if (class479.method2864((byte) -106) - field2835 < 30000L) {
            this.field2832.repaint();
        } else {
            throw new RuntimeException(arg0.getMessage());
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II)V", line = 67)
    public final void method1334(int arg0, int arg1) {
        try {
            synchronized (this.field2832.getTreeLock()) {
                Dimension var4 = this.field2832.getSize();
                this.method1331(arg0, arg1, var4.width, var4.height);
                field2836 = false;
            }
        } catch (Exception var7) {
            this.method1333(var7);
        }
    }

    @OriginalMember(owner = "client!p", name = "finalize", descriptor = "()V", line = 79)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class198.method1216((byte) 123, this);
        }
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Loa;Ljava/awt/Canvas;II)V", line = 83)
    public class216(class693 arg0, Canvas arg1, int arg2, int arg3) {
        this.field2832 = arg1;
        this.field2834 = arg2;
        this.field2833 = arg3;
        this.method1329(arg0, this.field2832, arg2, arg3);
    }

    @OriginalMember(owner = "client!p", name = "K", descriptor = "(IIIIII)V")
    private final native void method1327(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!p", name = "oa", descriptor = "(Ljava/awt/Canvas;II)V")
    private final native void method1328(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!p", name = "sa", descriptor = "(Loa;Ljava/awt/Canvas;II)V")
    private final native void method1329(class693 arg0, Canvas arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!p", name = "H", descriptor = "(IIII)V")
    private final native void method1331(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!p", name = "w", descriptor = "(Z)V")
    public final native void method106(boolean arg0);
}
