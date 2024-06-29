import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dca")
public class class174 {

    @OriginalMember(owner = "client!dca", name = "c", descriptor = "Lbd;")
    public static class60 field2355 = new class60(2, 8);

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!dca", name = "b", descriptor = "I")
    public static int field2354;

    @OriginalMember(owner = "client!dca", name = "d", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(I)V")
    public static void method1112(int arg0) {
        field2355 = null;
        if (arg0 != 0) {
            method1113(-84, 60, 104, -123, 48, -43, 111, true, 77);
        }
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(IIIIIIIZI)Z")
    public static final boolean method1113(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8) {
        field2354++;
        int var9 = class660.field9039.field8009[0];
        int var10 = class660.field9039.field8015[0];
        if (var9 < 0 || class336.field4683 <= var9 || var10 < 0 || var10 >= class700.field9768) {
            return false;
        } else if (arg6 >= 0 && class336.field4683 > arg6 && arg8 >= 0 && arg8 < class700.field9768) {
            int var11 = class511.method3019(class660.field9039.method1835((byte) 127), var9, var10, arg1, -29375, arg3, arg4, arg8, arg6, class566.field8043, arg5, class64.field784, class147.field2114[class660.field9039.field1266], arg0, arg7);
            if (var11 < 1) {
                return false;
            }
            class210.field2763 = class64.field784[var11 - 1];
            class656.field8997 = class566.field8043[var11 - arg2];
            class29.field387 = false;
            class180.method1135(arg2 + 122);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(BI)C")
    public static final char method1114(byte arg0, int arg1) {
        if (arg1 != 0) {
            method1113(-67, 63, -34, 86, -107, -4, -61, true, 88);
        }
        field2356++;
        int var2 = arg0 & 0xFF;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class322.field4457[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        return (char) var2;
    }
}
