import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eha")
public class class576 {

    @OriginalMember(owner = "client!eha", name = "c", descriptor = "Lgg;")
    public static class114 field8038 = new class114(8);

    @OriginalMember(owner = "client!eha", name = "g", descriptor = "[Ltn;")
    public static class179[] field8042 = new class179[2048];

    @OriginalMember(owner = "client!eha", name = "e", descriptor = "F")
    public static float field8040;

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "I")
    public static int field8036;

    @OriginalMember(owner = "client!eha", name = "b", descriptor = "I")
    public static int field8037;

    @OriginalMember(owner = "client!eha", name = "d", descriptor = "I")
    public static int field8039;

    @OriginalMember(owner = "client!eha", name = "f", descriptor = "I")
    public static int field8041;

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "(B)V")
    public static void method3225(byte arg0) {
        field8038 = null;
        field8042 = null;
        if (arg0 <= 24) {
            field8038 = null;
        }
    }

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "(IIIB)I")
    public static final int method3226(int arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0 & 0x3;
        field8037++;
        if (var4 == 0) {
            return arg2;
        }
        if (arg3 != 35) {
            method3225((byte) -109);
        }
        if (var4 == 1) {
            return arg1;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return 7 - arg1;
        }
    }

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "(IIIIB)V")
    public static final void method3227(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field8039++;
        int var5 = class260.field3300;
        if (arg4 < 95) {
            field8042 = null;
        }
        int var6 = class125.field1499;
        if (class107.field1323) {
            var5 += class173.method1075(-115);
            var6 += class203.method1259((byte) 120);
        }
        if (class426.field6054 == 1) {
            class712 var7 = class188.field2469[class747.field10445 / 100];
            var7.method3929(var5 - 8, var6 + -8);
            class365.method2249(true, var6 + var7.method1882() - 8, var6 + -8, var5 + var7.method1892() - 8, var5 - 8);
        }
        if (class426.field6054 == 2) {
            class712 var8 = class188.field2469[class747.field10445 / 100 + 4];
            var8.method3929(var5 - 8, var6 + -8);
            class365.method2249(true, var6 + var8.method1882() - 8, var6 + -8, (var5 + var8.method1892()) - 8, var5 - 8);
        }
        class223.method1443((byte) -28);
    }
}
