import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class63 {

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "I")
    public int field939;

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "I")
    public int field940;

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "I")
    public int field942;

    @OriginalMember(owner = "client!sl", name = "f", descriptor = "I")
    public int field943;

    @OriginalMember(owner = "client!sl", name = "g", descriptor = "I")
    public static int field944;

    @OriginalMember(owner = "client!sl", name = "h", descriptor = "I")
    public int field945;

    @OriginalMember(owner = "client!sl", name = "i", descriptor = "I")
    public static int field946;

    @OriginalMember(owner = "client!sl", name = "j", descriptor = "I")
    public int field947;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lou;B)V")
    public static final void method414(class197 arg0, byte arg1) {
        field944++;
        int var2 = arg0.field3138 - class504.field7348;
        int var3 = arg0.field3114 * 128 + arg0.method1143(0) * 64;
        int var4 = arg0.field3147 * 128 + (arg0.method1143(0) * 64);
        arg0.field4716 += (var3 - arg0.field4716) / var2;
        arg0.field3155 = 0;
        arg0.field4714 += (var4 - arg0.field4714) / var2;
        if (arg0.field3120 == 0) {
            arg0.method1304(8192, false);
        }
        if (arg1 < 11) {
            method416(-121, true);
        }
        if (arg0.field3120 == 1) {
            arg0.method1304(12288, false);
        }
        if (arg0.field3120 == 2) {
            arg0.method1304(0, false);
        }
        if (arg0.field3120 == 3) {
            arg0.method1304(4096, false);
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIIII)V")
    public static final void method415(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field938++;
        if (arg0 == 128 && class182.field2877 <= arg4 && arg4 <= class235.field4076) {
            int var5 = class52.method367(arg1, class472.field6996, (byte) -24, class29.field460);
            int var6 = class52.method367(arg2, class472.field6996, (byte) 106, class29.field460);
            class338.method2143(var6, arg4, arg3, (byte) -70, var5);
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IZ)Z")
    public static final boolean method416(int arg0, boolean arg1) {
        field941++;
        if (!arg1) {
            return false;
        } else if (arg0 == 12 || arg0 == 21 || arg0 == 3 || arg0 == 57 || arg0 == 59) {
            return true;
        } else {
            return arg0 == 5 || arg0 == 1010;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(II)I")
    public static final int method417(int arg0, int arg1) {
        field946++;
        return arg1 > -126 ? -100 : arg0 >>> 7;
    }
}
