import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class296 {

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "Z")
    public static boolean field4056 = false;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
    public static int field4054;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "I")
    public static int field4055;

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "I")
    public static int field4057;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "Lvs;")
    public static class518 field4058;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)V", line = 9)
    public static void method1849(byte arg0) {
        int var1 = -102 % ((-arg0 - 21) / 59);
        field4058 = null;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V", line = 29)
    public static final void method1850(int arg0) {
        if (arg0 >= -73) {
            method1851(-11, 102, 72, -7);
        }
        class137.field1880.method2310(-19316);
        field4055++;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIII)I", line = 40)
    public static final int method1851(int arg0, int arg1, int arg2, int arg3) {
        field4054++;
        if ((class160.field2297[arg0][arg2][arg1] & arg3) == 0) {
            return arg0 <= 0 || (class160.field2297[1][arg2][arg1] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }
}
