import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class272 extends class314 {

    @OriginalMember(owner = "client!a", name = "m", descriptor = "Lud;")
    public class279 field4843;

    @OriginalMember(owner = "client!a", name = "p", descriptor = "Lud;")
    private static class279 field4846 = class130.method1024("Tue", 255);

    @OriginalMember(owner = "client!a", name = "k", descriptor = "Lud;")
    private static class279 field4841 = class130.method1024("Fri", 255);

    @OriginalMember(owner = "client!a", name = "q", descriptor = "Lud;")
    private static class279 field4847 = class130.method1024("Loading interfaces )2 ", 255);

    @OriginalMember(owner = "client!a", name = "u", descriptor = "Lud;")
    private static class279 field4851 = class130.method1024("Sun", 255);

    @OriginalMember(owner = "client!a", name = "n", descriptor = "Lud;")
    private static class279 field4844 = class130.method1024("Thu", 255);

    @OriginalMember(owner = "client!a", name = "o", descriptor = "Lud;")
    public static class279 field4845 = class130.method1024(" ", 255);

    @OriginalMember(owner = "client!a", name = "t", descriptor = "Lud;")
    private static class279 field4850 = class130.method1024("Sat", 255);

    @OriginalMember(owner = "client!a", name = "s", descriptor = "I")
    public static int field4849 = 0;

    @OriginalMember(owner = "client!a", name = "w", descriptor = "Lud;")
    private static class279 field4853 = class130.method1024("Wed", 255);

    @OriginalMember(owner = "client!a", name = "z", descriptor = "Lud;")
    public static class279 field4856 = field4847;

    @OriginalMember(owner = "client!a", name = "v", descriptor = "Lud;")
    private static class279 field4852 = class130.method1024("Mon", 255);

    @OriginalMember(owner = "client!a", name = "l", descriptor = "[Lud;")
    public static class279[] field4842 = new class279[] { field4851, field4852, field4846, field4853, field4844, field4841, field4850 };

    @OriginalMember(owner = "client!a", name = "r", descriptor = "I")
    public static int field4848;

    @OriginalMember(owner = "client!a", name = "x", descriptor = "I")
    public static int field4854;

    @OriginalMember(owner = "client!a", name = "y", descriptor = "I")
    public static int field4855;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(B)V", line = 5)
    public static void method1937(byte arg0) {
        field4841 = null;
        if (arg0 != 39) {
            method1939(8, (class279) null, (class279) null, 8, (class279) null);
        }
        field4847 = null;
        field4850 = null;
        field4845 = null;
        field4851 = null;
        field4844 = null;
        field4842 = null;
        field4856 = null;
        field4853 = null;
        field4846 = null;
        field4852 = null;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIBIIII)V", line = 26)
    public static final void method1938(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8) {
        field4855++;
        if (class283.method2031(20714, arg8)) {
            class204.method1508(-1, arg5, arg6, arg1, (byte) 120, arg3, arg2, arg7, class18.field545[arg8], arg0);
            if (arg4 > -108) {
                field4845 = (class279) null;
            }
        } else if (arg3 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class71.field1398[var9] = true;
            }
        } else {
            class71.field1398[arg3] = true;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ILud;Lud;ILud;)V", line = 83)
    public static final void method1939(int arg0, class279 arg1, class279 arg2, int arg3, class279 arg4) {
        class170.method1325(arg3, arg2, arg0, arg1, -1, arg4);
        field4854++;
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "()V", line = 89)
    public class272() {
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Lud;)V", line = 110)
    public class272(class279 arg0) {
        this.field4843 = arg0;
    }
}
