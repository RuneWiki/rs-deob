import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class99 extends Canvas {

    @OriginalMember(owner = "client!h", name = "a", descriptor = "Ljava/awt/Component;")
    private Component field1755;

    @OriginalMember(owner = "client!h", name = "d", descriptor = "I")
    public static int field1758 = 0;

    @OriginalMember(owner = "client!h", name = "l", descriptor = "[J")
    public static long[] field1766 = new long[200];

    @OriginalMember(owner = "client!h", name = "k", descriptor = "Loh;")
    private static class258 field1765 = class153.method1046("wave2:", 90);

    @OriginalMember(owner = "client!h", name = "e", descriptor = "Loh;")
    public static class258 field1759 = field1765;

    @OriginalMember(owner = "client!h", name = "m", descriptor = "Loh;")
    public static class258 field1767 = field1765;

    @OriginalMember(owner = "client!h", name = "b", descriptor = "I")
    public static int field1756;

    @OriginalMember(owner = "client!h", name = "f", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!h", name = "g", descriptor = "I")
    public static int field1761;

    @OriginalMember(owner = "client!h", name = "i", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!h", name = "j", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!h", name = "h", descriptor = "Lgb;")
    public static class213 field1762;

    @OriginalMember(owner = "client!h", name = "c", descriptor = "Z")
    public static boolean field1757;

    @OriginalMember(owner = "client!h", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 4)
    public final void paint(Graphics arg0) {
        field1761++;
        this.field1755.paint(arg0);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lgb;BLgb;)V", line = 23)
    public static final void method744(class213 arg0, byte arg1, class213 arg2) {
        class231.field3988 = arg2;
        field1763++;
        class124.field2207 = arg0;
        if (arg1 != 0) {
            field1757 = false;
        }
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 34)
    public class99(Component arg0) {
        this.field1755 = arg0;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V", line = 45)
    public static void method745(int arg0) {
        field1762 = null;
        field1767 = null;
        field1766 = null;
        field1765 = null;
        field1759 = null;
        if (arg0 >= -49) {
            field1762 = (class213) null;
        }
    }

    @OriginalMember(owner = "client!h", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 59)
    public final void update(Graphics arg0) {
        field1756++;
        this.field1755.update(arg0);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIIIIII)V", line = 74)
    public static final void method746(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 != 200) {
            return;
        }
        if (arg2 >= class75.field1314 && arg2 <= class206.field3562 && class75.field1314 <= arg6 && class206.field3562 >= arg6 && class75.field1314 <= arg4 && class206.field3562 >= arg4 && class75.field1314 <= arg1 && arg1 <= class206.field3562 && class241.field4189 <= arg0 && arg0 <= class94.field1654 && class241.field4189 <= arg7 && arg7 <= class94.field1654 && arg5 >= class241.field4189 && arg5 <= class94.field1654 && arg8 >= class241.field4189 && class94.field1654 >= arg8) {
            class58.method454(arg2, arg9, -30736, arg8, arg7, arg4, arg0, arg1, arg6, arg5);
        } else {
            class311.method2164((byte) 111, arg1, arg7, arg6, arg8, arg4, arg5, arg2, arg0, arg9);
        }
        field1760++;
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(I)I", line = 102)
    public static final int method747(int arg0) {
        field1764++;
        if (arg0 != 6) {
            field1762 = (class213) null;
        }
        return 6;
    }
}
