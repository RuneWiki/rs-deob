import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class181 {

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "Lof;")
    public static class475 field2287 = new class475(0, 1);

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
    public static int field2288 = 0;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "F")
    public static float field2289;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
    public static int field2290;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)V", line = 6)
    public static void method1151(byte arg0) {
        if (arg0 != -61) {
            field2289 = 0.66294175F;
        }
        field2287 = null;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IZ)I", line = 18)
    public static final int method1152(int arg0, boolean arg1) {
        field2286++;
        if (arg1) {
            method1152(-114, false);
        }
        return arg0 >>> 10;
    }
}
