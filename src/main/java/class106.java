import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class106 extends class513 implements class2 {

    @OriginalMember(owner = "client!p", name = "o", descriptor = "Ljava/awt/Canvas;")
    public Canvas field1543;

    @OriginalMember(owner = "client!p", name = "l", descriptor = "I")
    public int field1540;

    @OriginalMember(owner = "client!p", name = "n", descriptor = "I")
    public int field1542;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "Z")
    private static boolean field1541 = false;

    @OriginalMember(owner = "client!p", name = "k", descriptor = "J")
    private static long field1539;

    @OriginalMember(owner = "client!p", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!p", name = "finalize", descriptor = "()V", line = 4)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class301.method1765(this, 0);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II)V", line = 13)
    public final void method720(int arg0, int arg1) {
        try {
            synchronized (this.field1543.getTreeLock()) {
                Dimension var4 = this.field1543.getSize();
                this.method718(arg0, arg1, var4.width, var4.height);
                field1541 = false;
            }
        } catch (Exception var7) {
            this.method724(var7);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V", line = 25)
    public final void method721(Rectangle[] arg0, int arg1, int arg2, int arg3) {
        try {
            synchronized (this.field1543.getTreeLock()) {
                for (int var6 = 0; var6 < arg1; var6++) {
                    Rectangle var7 = arg0[var6];
                    if (var7.width > 0 && var7.height > 0) {
                        this.method719(var7.x, var7.y, var7.width, var7.height, arg2, arg3);
                    }
                }
                field1541 = false;
            }
        } catch (Exception var10) {
            this.method724(var10);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/awt/Canvas;II)V", line = 50)
    public final void method723(Canvas arg0, int arg1, int arg2) {
        this.field1540 = arg1;
        this.field1542 = arg2;
        this.method722(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/lang/Exception;)V", line = 55)
    private final void method724(Exception arg0) {
        if (!field1541) {
            field1539 = class224.method1457((byte) -62);
            field1541 = true;
        } else if (class224.method1457((byte) -62) - field1539 < 30000L) {
            this.field1543.repaint();
        } else {
            throw new RuntimeException(arg0.getMessage());
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "()V", line = 75)
    public final void method725() {
        this.method3(true);
        this.nativeid = 0L;
        this.field1543 = null;
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Loa;Ljava/awt/Canvas;II)V", line = 87)
    public class106(class406 arg0, Canvas arg1, int arg2, int arg3) {
        this.field1543 = arg1;
        this.field1540 = arg2;
        this.field1542 = arg3;
        this.method726(arg0, this.field1543, arg2, arg3);
    }

    @OriginalMember(owner = "client!p", name = "H", descriptor = "(IIII)V")
    private final native void method718(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!p", name = "K", descriptor = "(IIIIII)V")
    private final native void method719(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!p", name = "oa", descriptor = "(Ljava/awt/Canvas;II)V")
    private final native void method722(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!p", name = "sa", descriptor = "(Loa;Ljava/awt/Canvas;II)V")
    private final native void method726(class406 arg0, Canvas arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!p", name = "w", descriptor = "(Z)V")
    public final native void method3(boolean arg0);
}
