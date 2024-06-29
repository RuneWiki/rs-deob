import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class139 {

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "[S")
    public static short[] field1980 = new short[256];

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "[B")
    public static byte[] field1975 = new byte[520];

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "Lhu;")
    public static class86 field1978 = new class86(8);

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "I")
    public static int field1979;

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "[Luu;")
    public static class188[] field1976;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)V", line = 6)
    public static void method1043(int arg0) {
        field1980 = null;
        field1976 = null;
        if (arg0 == -16641) {
            field1975 = null;
            field1978 = null;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIIZIIII)Z", line = 20)
    public static final boolean method1044(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8) {
        field1977++;
        int var9 = class435.field6375.field1777[0];
        int var10 = class435.field6375.field1778[0];
        if (var9 < 0 || class397.field5828 <= var9 || var10 < 0 || var10 >= class457.field6713) {
            return false;
        } else if (arg2 < 0 || arg2 >= class397.field5828 || arg1 < 0 || arg1 >= class457.field6713) {
            return false;
        } else if (arg8 <= 98) {
            return false;
        } else {
            int var11 = class164.method1162((byte) -106, class455.field6684[class435.field6375.field6328], var9, arg2, arg5, arg1, class435.field6375.method963((byte) 127), arg6, class75.field1023, arg0, arg4, class371.field5513, var10, arg3, arg7);
            if (var11 < 1) {
                return false;
            }
            class74.field1012 = class371.field5513[var11 - 1];
            class98.field1317 = class75.field1023[var11 - 1];
            class233.field3421 = false;
            class490.method2944((byte) -31);
            return true;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIIBII)V", line = 52)
    public static final void method1045(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field1979++;
        if (arg5 >= class72.field992 && class126.field1842 >= arg0 && class471.field6963 <= arg6 && class401.field5947 >= arg3) {
            if (arg2 == 1) {
                class114.method919(arg3, arg0, arg6, arg1, arg5, -95);
            } else {
                class194.method1359(arg3, arg5, -21, arg1, arg0, arg2, arg6);
            }
        } else if (arg2 == 1) {
            class468.method2829(arg0, arg3, arg1, -70, arg6, arg5);
        } else {
            class179.method1256(arg6, arg1, arg5, arg0, arg2, arg3, (byte) -126);
        }
        if (arg4 >= -60) {
            method1045(-39, 4, 126, -25, (byte) -92, 118, 79);
        }
    }
}
