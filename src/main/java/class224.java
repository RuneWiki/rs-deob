import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gga")
public class class224 extends class388 {

    @OriginalMember(owner = "client!gga", name = "u", descriptor = "[B")
    public byte[] field3308;

    @OriginalMember(owner = "client!gga", name = "r", descriptor = "Lgr;")
    public static class530 field3305 = new class530(43, 2);

    @OriginalMember(owner = "client!gga", name = "t", descriptor = "I")
    public static int field3307;

    @OriginalMember(owner = "client!gga", name = "w", descriptor = "Lmda;")
    public static class349 field3310;

    @OriginalMember(owner = "client!gga", name = "s", descriptor = "Lvs;")
    public static class518 field3306;

    @OriginalMember(owner = "client!gga", name = "v", descriptor = "[I")
    public static int[] field3309;

    @OriginalMember(owner = "client!gga", name = "c", descriptor = "(I)V", line = 7)
    public static void method1554(int arg0) {
        field3305 = null;
        field3309 = null;
        field3310 = null;
        field3306 = null;
        if (arg0 != -7275) {
            field3309 = null;
        }
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(IIZ)Z", line = 26)
    public static final boolean method1555(int arg0, int arg1, boolean arg2) {
        field3307++;
        if (arg1 >= 1000 && arg0 < 1000) {
            return true;
        }
        if (!arg2) {
            field3305 = null;
        }
        if (arg1 >= 1000 || arg0 >= 1000) {
            return arg1 >= 1000 && arg0 >= 1000;
        } else if (class512.method3111(arg1, -12047)) {
            return false;
        } else {
            return class512.method3111(arg0, -12047);
        }
    }

    @OriginalMember(owner = "client!gga", name = "<init>", descriptor = "([B)V", line = 58)
    public class224(byte[] arg0) {
        this.field3308 = arg0;
    }
}
