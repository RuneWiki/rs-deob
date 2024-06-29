import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public abstract class class166 {

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "[I")
    public static int[] field2688 = new int[64];

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "Ljava/lang/String;")
    public static String field2692 = "Unable to find ";

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "I")
    public static int field2687;

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "I")
    public static int field2691;

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "[I")
    public static int[] field2689;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "[I")
    public static int[] field2690;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIIIII)I", line = 4)
    public static final int method1258(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg2 & 0x3;
        field2687++;
        if ((arg5 & 0x1) == 1) {
            int var8 = arg0;
            arg0 = arg1;
            arg1 = var8;
        }
        if (arg4 >= -113) {
            method1261(115);
        }
        if (var7 == 0) {
            return arg6;
        } else if (var7 == 1) {
            return 1 + 7 - arg0 - arg3;
        } else if (var7 == 2) {
            return 1 + 7 - arg6 - arg1;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(BI)V", line = 43)
    public static final void method1259(byte arg0, int arg1) {
        class188 var2 = class147.method1111(-75, arg1, 1);
        field2691++;
        var2.method1393((byte) -97);
        int var3 = -67 / ((-arg0 - 12) / 44);
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(I)V", line = 61)
    public static final void method1261(int arg0) {
        class333.method2332(true, 5);
        field2693++;
        class318.method2213(5, false);
        class211.method1510(5, 0);
        class224.method1598(5, (byte) -114);
        class162.method1220(5, 128);
        class91.method660(5, (byte) 101);
        class339.method2362(5, 0);
        class12.method94(5, (byte) 44);
        class200.method1446(true, 5);
        class243.method1680(5, -117);
        class257.method1814(20468, 5);
        class13.method99((byte) 95, 5);
        class61.method423((byte) -128, 5);
        class205.method1483(5, false);
        if (arg0 > -34) {
            field2692 = (String) null;
        }
        class299.method2057(5, -124);
        class161.method1216(true, 5);
        class262.method1844((byte) -14, 5);
        class260.method1829(50, true);
        class290.method2004(6798, 5);
        class38.method291((byte) 47, 5);
        class299.field4604.method741(5, (byte) -79);
        class235.field3587.method741(5, (byte) 118);
    }

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "(I)V", line = 100)
    public static void method1263(int arg0) {
        field2692 = null;
        field2690 = null;
        field2689 = null;
        if (arg0 < -86) {
            field2688 = null;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)[B")
    public abstract byte[] method1260(int arg0);

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Z[B)V")
    public abstract void method1262(boolean arg0, byte[] arg1);
}
