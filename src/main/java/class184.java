import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class184 {

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "Lma;")
    private static class5 field2830 = class12.method119("Ok", (byte) 102);

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "Lma;")
    public static class5 field2828 = field2830;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "Z")
    public static boolean field2833 = false;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
    public static int field2832;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V", line = 7)
    public static void method1206(int arg0) {
        field2830 = null;
        field2828 = null;
        if (arg0 != 2) {
            field2830 = (class5) null;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IBIIII)V", line = 29)
    public static final void method1207(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != 38) {
            method1206(-87);
        }
        class86.field1303 = arg3;
        class282.field4789 = arg4;
        field2832++;
        class150.field2167 = arg2;
        class223.field3687 = arg5;
        class89.field1332 = arg0;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IB)V", line = 54)
    public static final void method1208(int arg0, byte arg1) {
        if (arg1 == -4) {
            field2831++;
            class250 var2 = class282.method1912(arg1 ^ 0xE91A99DC, arg0, 1);
            var2.method1748(arg1 + 4);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIB)I", line = 69)
    public static final int method1209(int arg0, int arg1, byte arg2) {
        field2829++;
        if (arg2 != -104) {
            field2828 = (class5) null;
        }
        if (arg0 == -1) {
            return 12345678;
        }
        int var3 = (arg0 & 0x7F) * arg1 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }
}
