import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class84 extends class235 {

    @OriginalMember(owner = "client!tj", name = "n", descriptor = "Ljava/lang/String;")
    public static String field1206 = "glow2:";

    @OriginalMember(owner = "client!tj", name = "m", descriptor = "I")
    public static volatile int field1205 = 0;

    @OriginalMember(owner = "client!tj", name = "o", descriptor = "[J")
    public static long[] field1207 = new long[32];

    @OriginalMember(owner = "client!tj", name = "r", descriptor = "[Ljava/lang/String;")
    public static String[] field1210 = new String[100];

    @OriginalMember(owner = "client!tj", name = "l", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!tj", name = "q", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "client!tj", name = "s", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "client!tj", name = "p", descriptor = "[I")
    public static int[] field1208;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)V", line = 8)
    public static void method550(byte arg0) {
        field1207 = null;
        field1210 = null;
        field1208 = null;
        if (arg0 >= 2) {
            field1206 = null;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(III)I", line = 28)
    public static final int method551(int arg0, int arg1, int arg2) {
        field1209++;
        int var3 = class290.method2056(4, arg2 + 45365, arg0 + 91923, -39) + ((class290.method2056(2, arg2 + 10294, arg0 + 37821, -98) + -128 >> 1) - -(class290.method2056(1, arg2, arg0, -124) + -128 >> 2)) - 128;
        if (arg1 != 4096) {
            field1208 = (int[]) null;
        }
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "(I)I", line = 53)
    public static final int method552(int arg0) {
        field1211++;
        if (class296.field4907 != null) {
            return 3;
        }
        if (arg0 != 0) {
            field1205 = 67;
        }
        if (class245.field3886 && class129.field1968) {
            return 2;
        } else if (class245.field3886 && !class129.field1968) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(III)Lbn;", line = 103)
    public static final class206 method553(int arg0, int arg1, int arg2) {
        class50 var3 = class264.field4230[arg0][arg1][arg2];
        return var3 == null ? null : var3.field747;
    }

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "(I)V", line = 113)
    public static final void method554(int arg0) {
        field1204++;
        if (class308.field5013 > 0) {
            class278.method1983(arg0 ^ 0x65);
            return;
        }
        class139.field2183 = class346.field5545;
        class346.field5545 = null;
        class310.method2165(5, 40);
        if (arg0 != 100) {
            field1208 = (int[]) null;
        }
    }
}
