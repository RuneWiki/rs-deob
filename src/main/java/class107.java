import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class107 extends class71 implements class2 {

    @OriginalMember(owner = "client!p", name = "k", descriptor = "Ljava/awt/Canvas;")
    public Canvas field1434;

    @OriginalMember(owner = "client!p", name = "n", descriptor = "I")
    public int field1437;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "I")
    public int field1436;

    @OriginalMember(owner = "client!p", name = "l", descriptor = "Z")
    private static boolean field1435 = false;

    @OriginalMember(owner = "client!p", name = "j", descriptor = "J")
    private static long field1433;

    @OriginalMember(owner = "client!p", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "()V")
    public final void method691() {
        this.method12(true);
        this.nativeid = 0L;
        this.field1434 = null;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/lang/Exception;)V")
    private final void method692(Exception arg0) {
        if (!field1435) {
            field1433 = class97.method664((byte) -50);
            field1435 = true;
        } else if (class97.method664((byte) -50) - field1433 < 30000L) {
            this.field1434.repaint();
        } else {
            throw new RuntimeException(arg0.getMessage());
        }
    }

    @OriginalMember(owner = "client!p", name = "w", descriptor = "(Z)V")
    public final native void method12(boolean arg0);

    @OriginalMember(owner = "client!p", name = "sa", descriptor = "(Loa;Ljava/awt/Canvas;II)V")
    private final native void method693(class408 arg0, Canvas arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!p", name = "K", descriptor = "(IIIIII)V")
    private final native void method694(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II)V")
    public final void method695(int arg0, int arg1) {
        try {
            synchronized (this.field1434.getTreeLock()) {
                Dimension var4 = this.field1434.getSize();
                this.method697(arg0, arg1, var4.width, var4.height);
                field1435 = false;
            }
        } catch (Exception var7) {
            this.method692(var7);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public final void method696(Rectangle[] arg0, int arg1, int arg2, int arg3) {
        try {
            synchronized (this.field1434.getTreeLock()) {
                for (int var6 = 0; var6 < arg1; var6++) {
                    Rectangle var7 = arg0[var6];
                    if (var7.width > 0 && var7.height > 0) {
                        this.method694(var7.x, var7.y, var7.width, var7.height, arg2, arg3);
                    }
                }
                field1435 = false;
            }
        } catch (Exception var10) {
            this.method692(var10);
        }
    }

    @OriginalMember(owner = "client!p", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class556.method3276((byte) -10, this);
        }
    }

    @OriginalMember(owner = "client!p", name = "H", descriptor = "(IIII)V")
    private final native void method697(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method698(Canvas arg0, int arg1, int arg2) {
        this.field1437 = arg1;
        this.field1436 = arg2;
        this.method699(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!p", name = "oa", descriptor = "(Ljava/awt/Canvas;II)V")
    private final native void method699(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Loa;Ljava/awt/Canvas;II)V")
    public class107(class408 arg0, Canvas arg1, int arg2, int arg3) {
        this.field1434 = arg1;
        this.field1437 = arg2;
        this.field1436 = arg3;
        this.method693(arg0, this.field1434, arg2, arg3);
    }
}
