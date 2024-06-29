import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class102 extends class65 implements class2 {

    @OriginalMember(owner = "client!p", name = "n", descriptor = "Ljava/awt/Canvas;")
    public Canvas field1525;

    @OriginalMember(owner = "client!p", name = "o", descriptor = "I")
    public int field1526;

    @OriginalMember(owner = "client!p", name = "l", descriptor = "I")
    public int field1523;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "Z")
    private static boolean field1524 = false;

    @OriginalMember(owner = "client!p", name = "k", descriptor = "J")
    private static long field1522;

    @OriginalMember(owner = "client!p", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!p", name = "sa", descriptor = "(Loa;Ljava/awt/Canvas;II)V")
    private final native void method837(class406 arg0, Canvas arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!p", name = "K", descriptor = "(IIIIII)V")
    private final native void method838(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/lang/Exception;)V")
    private final void method839(Exception arg0) {
        if (!field1524) {
            field1522 = class18.method109(-11121);
            field1524 = true;
        } else if (class18.method109(-11121) - field1522 < 30000L) {
            this.field1525.repaint();
        } else {
            throw new RuntimeException(arg0.getMessage());
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method840(Canvas arg0, int arg1, int arg2) {
        this.field1526 = arg1;
        this.field1523 = arg2;
        this.method841(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!p", name = "w", descriptor = "(Z)V")
    public final native void method5(boolean arg0);

    @OriginalMember(owner = "client!p", name = "oa", descriptor = "(Ljava/awt/Canvas;II)V")
    private final native void method841(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!p", name = "a", descriptor = "()V")
    public final void method842() {
        this.method5(true);
        this.nativeid = 0L;
        this.field1525 = null;
    }

    @OriginalMember(owner = "client!p", name = "H", descriptor = "(IIII)V")
    private final native void method843(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!p", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public final void method844(Rectangle[] arg0, int arg1, int arg2, int arg3) {
        try {
            synchronized (this.field1525.getTreeLock()) {
                for (int var6 = 0; var6 < arg1; var6++) {
                    Rectangle var7 = arg0[var6];
                    if (var7.width > 0 && var7.height > 0) {
                        this.method838(var7.x, var7.y, var7.width, var7.height, arg2, arg3);
                    }
                }
                field1524 = false;
            }
        } catch (Exception var10) {
            this.method839(var10);
        }
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(II)V")
    public final void method845(int arg0, int arg1) {
        try {
            synchronized (this.field1525.getTreeLock()) {
                Dimension var4 = this.field1525.getSize();
                this.method843(arg0, arg1, var4.width, var4.height);
                field1524 = false;
            }
        } catch (Exception var7) {
            this.method839(var7);
        }
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Loa;Ljava/awt/Canvas;II)V")
    public class102(class406 arg0, Canvas arg1, int arg2, int arg3) {
        this.field1525 = arg1;
        this.field1526 = arg2;
        this.field1523 = arg3;
        this.method837(arg0, this.field1525, arg2, arg3);
    }

    @OriginalMember(owner = "client!p", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class389.method2431(this, 118);
        }
    }
}
