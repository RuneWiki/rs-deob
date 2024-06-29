import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class114 extends class153 {

    @OriginalMember(owner = "client!je", name = "u", descriptor = "[I")
    public static int[] field2034 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!je", name = "y", descriptor = "[Lbd;")
    public static class162[] field2038 = new class162[1000];

    @OriginalMember(owner = "client!je", name = "w", descriptor = "Lbd;")
    public static class162 field2036 = class17.method142(0, "(U(Y");

    @OriginalMember(owner = "client!je", name = "z", descriptor = "Lbd;")
    public static class162 field2039 = class17.method142(0, "name_icons");

    @OriginalMember(owner = "client!je", name = "v", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "client!je", name = "x", descriptor = "I")
    public static int field2037;

    @OriginalMember(owner = "client!je", name = "B", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "(I)V", line = 29)
    public static void method904(int arg0) {
        if (arg0 < 60) {
            field2036 = (class162) null;
        }
        field2034 = null;
        field2039 = null;
        field2038 = null;
        field2036 = null;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIZLlb;)V", line = 63)
    public static final void method905(int arg0, int arg1, boolean arg2, class60 arg3) {
        field2035++;
        if (arg2) {
            field2039 = (class162) null;
        }
        if (arg3.field5057 == arg1 && arg1 != -1) {
            class142 var4 = class139.method1084(-127, arg1);
            int var5 = var4.field2517;
            if (var5 == 1) {
                arg3.field5028 = 0;
                arg3.field5040 = arg0;
                arg3.field5061 = 0;
                arg3.field5023 = 0;
                class229.method1638(false, var4, arg3.field5023, arg3.field5047, -648569400, arg3.field5013);
            }
            if (var5 == 2) {
                arg3.field5028 = 0;
            }
        } else if (arg1 == -1 || arg3.field5057 == -1 || class139.method1084(-110, arg1).field2515 >= class139.method1084(-96, arg3.field5057).field2515) {
            arg3.field5028 = 0;
            arg3.field5023 = 0;
            arg3.field5040 = arg0;
            arg3.field5022 = arg3.field5006;
            arg3.field5057 = arg1;
            arg3.field5061 = 0;
            if (arg3.field5057 != -1) {
                class229.method1638(false, class139.method1084(-93, arg3.field5057), arg3.field5023, arg3.field5047, -648569400, arg3.field5013);
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(BIII)I", line = 128)
    public static final int method906(byte arg0, int arg1, int arg2, int arg3) {
        field2037++;
        if (arg0 < 89) {
            return 71;
        }
        if (arg2 > 243) {
            arg1 >>= 0x4;
        } else if (arg2 > 217) {
            arg1 >>= 0x3;
        } else if (arg2 > 192) {
            arg1 >>= 0x2;
        } else if (arg2 > 179) {
            arg1 >>= 0x1;
        }
        return (arg1 >> 5 << 7) + (arg3 >> 2 << 10) + (arg2 >> 1);
    }
}
