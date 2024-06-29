import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class142 {

    @OriginalMember(owner = "client!di", name = "c", descriptor = "Z")
    public static volatile boolean field2364 = true;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "Lbe;")
    public static class283 field2362 = class153.method941(125, "<col=00ff00>");

    @OriginalMember(owner = "client!di", name = "d", descriptor = "Z")
    public static boolean field2365 = true;

    @OriginalMember(owner = "client!di", name = "g", descriptor = "[I")
    public static int[] field2368 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!di", name = "e", descriptor = "I")
    public static int field2366;

    @OriginalMember(owner = "client!di", name = "f", descriptor = "I")
    public static int field2367;

    @OriginalMember(owner = "client!di", name = "b", descriptor = "Lek;")
    public static class172 field2363;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V", line = 5)
    public static final void method893(int arg0) {
        field2366++;
        class104.field1779.method1631(arg0 ^ 0xFFFF931D);
        if (arg0 != 0) {
            field2364 = false;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IZIIIB)Lnh;", line = 39)
    public static final class107 method894(int arg0, boolean arg1, int arg2, int arg3, int arg4, byte arg5) {
        field2367++;
        int var6 = (arg3 << 19) + (arg1 ? 65536 : 0) + (arg4 - -(arg0 << 17));
        if (arg5 >= -1) {
            return (class107) null;
        }
        long var8 = (long) arg2 * 3147483667L + ((long) var6 * 3849834839L);
        class107 var10 = (class107) class134.field2251.method1629(-34, var8);
        if (var10 != null) {
            return var10;
        }
        class139.field2311 = false;
        class107 var11 = class197.method1267(arg3, false, arg0, arg4, arg2, arg1, false, (byte) 126);
        if (var11 != null && !class139.field2311) {
            class134.field2251.method1630(true, var8, var11);
        }
        return var11;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Z)V", line = 75)
    public static void method895(boolean arg0) {
        field2368 = null;
        field2362 = null;
        field2363 = null;
        if (arg0) {
            method894(-8, false, -106, 5, -85, (byte) 77);
        }
    }
}
