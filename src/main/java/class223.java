import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class223 extends class498 implements class130 {

    @OriginalMember(owner = "client!b", name = "o", descriptor = "Ljava/awt/Canvas;")
    public Canvas field3210;

    @OriginalMember(owner = "client!b", name = "p", descriptor = "Z")
    private static boolean field3211 = false;

    @OriginalMember(owner = "client!b", name = "n", descriptor = "J")
    private static long field3209;

    @OriginalMember(owner = "client!b", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 4)
    public final void method1371(Rectangle[] arg0, int arg1) {
        try {
            synchronized (this.field3210.getTreeLock()) {
                for (int var4 = 0; var4 < arg1; var4++) {
                    Rectangle var5 = arg0[var4];
                    if (var5.width > 0 && var5.height > 0) {
                        this.method1375(var5.x, var5.y, var5.width, var5.height);
                    }
                }
                field3211 = false;
            }
        } catch (Exception var8) {
            this.method1372(var8);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Ljava/lang/Exception;)V", line = 29)
    private final void method1372(Exception arg0) {
        if (!field3211) {
            field3209 = class465.method2699((byte) 14);
            field3211 = true;
        } else if (class465.method2699((byte) 14) - field3209 < 30000L) {
            this.field3210.repaint();
        } else {
            throw new RuntimeException(arg0.getMessage());
        }
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lw;Ljava/awt/Canvas;)V", line = 49)
    public class223(class199 arg0, Canvas arg1) {
        this.field3210 = arg1;
        Dimension var3 = arg1.getSize();
        this.method1378(arg0, this.field3210, var3.width, var3.height);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "()V", line = 58)
    public final void method1374() {
        this.method540();
        this.nativeid = 0L;
        this.field3210 = null;
    }

    @OriginalMember(owner = "client!b", name = "finalize", descriptor = "()V", line = 63)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class512.method3054(-125, this);
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "()V", line = 74)
    public final void method1377() {
        try {
            synchronized (this.field3210.getTreeLock()) {
                this.method1376();
                field3211 = false;
            }
        } catch (Exception var4) {
            this.method1372(var4);
        }
    }

    @OriginalMember(owner = "client!b", name = "p", descriptor = "()V")
    public final native void method540();

    @OriginalMember(owner = "client!b", name = "U", descriptor = "(Ljava/awt/Canvas;II)V")
    public final native void method1373(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!b", name = "TA", descriptor = "(IIII)V")
    private final native void method1375(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!b", name = "ya", descriptor = "()V")
    private final native void method1376();

    @OriginalMember(owner = "client!b", name = "FA", descriptor = "(Lw;Ljava/awt/Canvas;II)V")
    private final native void method1378(class199 arg0, Canvas arg1, int arg2, int arg3);
}
