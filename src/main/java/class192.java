import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public abstract class class192 extends class219 {

    @OriginalMember(owner = "client!r", name = "t", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!r", name = "u", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ILjava/awt/Canvas;Ld;II)Lha;", line = 8)
    public static final class66 method1406(int arg0, Canvas arg1, class159 arg2, int arg3, int arg4) {
        field2855++;
        return arg0 == -201 ? new class721(arg1, arg2, arg4, arg3) : null;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lhq;I)V", line = 21)
    public static final void method1407(class167 arg0, int arg1) {
        arg0.field2428 = null;
        field2856++;
        int var2 = arg0.field2426.length;
        for (int var3 = 0; var3 < var2; var3++) {
            arg0.field2426[var3].field9279 = false;
        }
        class310[] var4 = class683.field9701;
        synchronized (class683.field9701) {
            if (var2 < class683.field9701.length && class520.field7436[var2] < 200) {
                class683.field9701[var2].method2026((byte) 51, arg0);
                int var10002 = class520.field7436[var2]++;
            }
        }
        if (arg1 == 1949) {
            ;
        }
    }
}
