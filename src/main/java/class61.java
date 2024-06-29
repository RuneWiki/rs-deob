import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class61 {

    @OriginalMember(owner = "client!mn", name = "d", descriptor = "J")
    public long field757;

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "Lqi;")
    private class510 field755;

    @OriginalMember(owner = "client!mn", name = "e", descriptor = "Ltt;")
    public static class338 field758 = new class338(26, 8);

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!mn", name = "f", descriptor = "Lkr;")
    public static class354 field759;

    @OriginalMember(owner = "client!mn", name = "finalize", descriptor = "()V", line = 5)
    protected final void finalize() throws Throwable {
        this.field755.method2896(this.field757, 102);
        field754++;
        super.finalize();
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIIII)V", line = 14)
    public static final void method342(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field756++;
        int var5 = 0;
        if (arg3 > -100) {
            field759 = null;
        }
        while (var5 < class629.field8707) {
            Rectangle var6 = class680.field9648[var5];
            if (arg2 < (var6.x + var6.width) && var6.x < (arg1 + arg2) && var6.y + var6.height > arg0 && (arg0 + arg4) > var6.y) {
                class13.field166[var5] = true;
            }
            var5++;
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)V", line = 41)
    public static void method343(int arg0) {
        field759 = null;
        if (arg0 == 23082) {
            field758 = null;
        }
    }

    @OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(Lqi;JI)V", line = 51)
    public class61(class510 arg0, long arg1, int arg2) {
        this.field757 = arg1;
        this.field755 = arg0;
    }
}
