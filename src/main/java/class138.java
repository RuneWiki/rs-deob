import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class138 {

    @OriginalMember(owner = "client!as", name = "c", descriptor = "I")
    public static int field1935 = -1;

    @OriginalMember(owner = "client!as", name = "f", descriptor = "Lsu;")
    public static class192 field1938 = new class192();

    @OriginalMember(owner = "client!as", name = "a", descriptor = "I")
    public static int field1933;

    @OriginalMember(owner = "client!as", name = "b", descriptor = "I")
    public int field1934;

    @OriginalMember(owner = "client!as", name = "d", descriptor = "I")
    public int field1936;

    @OriginalMember(owner = "client!as", name = "e", descriptor = "I")
    public int field1937;

    @OriginalMember(owner = "client!as", name = "h", descriptor = "I")
    public int field1940;

    @OriginalMember(owner = "client!as", name = "i", descriptor = "I")
    public static int field1941;

    @OriginalMember(owner = "client!as", name = "g", descriptor = "Lpj;")
    public static class132 field1939;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(B)V", line = 6)
    public static void method976(byte arg0) {
        field1939 = null;
        if (arg0 != -93) {
            method978(null, 16, 86, -44, -108);
        }
        field1938 = null;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(III)Z", line = 17)
    public static final boolean method977(int arg0, int arg1, int arg2) {
        if (arg1 != 544) {
            field1938 = null;
        }
        field1933++;
        return (arg2 & 0x220) == 544 | (arg2 & 0x18) != 0;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Lmh;IIII)V", line = 33)
    public static final void method978(class577 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 == 1 && arg3 > 0) {
            class110.method821(arg0, arg2, arg3 - 1, arg4);
        } else if (arg1 == 4 && arg3 <= class137.field1931) {
            class110.method821(arg0, arg2, arg3 + 1, arg4);
        } else if (arg1 == 8 && arg4 > 0) {
            class110.method821(arg0, arg2, arg3, arg4 - 1);
        } else if (arg1 == 2 && arg4 <= class22.field308) {
            class110.method821(arg0, arg2, arg3, arg4 + 1);
        } else if (arg1 == 16 && arg3 > 0 && arg4 <= class22.field308) {
            class110.method821(arg0, arg2, arg3 - 1, arg4 + 1);
        } else if (arg1 == 32 && arg3 <= class137.field1931 && arg4 <= class22.field308) {
            class110.method821(arg0, arg2, arg3 + 1, arg4 + 1);
        } else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
            class110.method821(arg0, arg2, arg3 - 1, arg4 - 1);
        } else if (arg1 == 64 && arg3 <= class137.field1931 && arg4 > 0) {
            class110.method821(arg0, arg2, arg3 + 1, arg4 - 1);
        } else {
            throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
        }
    }
}
