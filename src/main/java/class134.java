import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class134 {

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "[I")
    public static int[] field2047 = new int[25];

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "I")
    public static int field2054 = 0;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "F")
    public static float field2048;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(BII)I")
    public static final int method977(byte arg0, int arg1, int arg2) {
        field2050++;
        int var3 = 1;
        while (arg1 > 1) {
            if ((arg1 & 0x1) != 0) {
                var3 = arg2 * var3;
            }
            arg2 *= arg2;
            arg1 >>= 0x1;
        }
        if (arg1 == 1) {
            return arg2 * var3;
        } else {
            int var4 = 60 % ((-arg0 - 17) / 52);
            return var3;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V")
    public static void method978(byte arg0) {
        if (arg0 != 10) {
            method981(null, false, -11);
        }
        field2047 = null;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(BLwq;)V")
    public static final void method979(byte arg0, class116 arg1) {
        field2051++;
        for (class101 var2 = (class101) class360.field5347.method1004((byte) -58); var2 != null; var2 = (class101) class360.field5347.method996(1)) {
            if (var2.field1446 == arg1) {
                if (var2.field1443 != null) {
                    class359.field5328.method385(var2.field1443);
                    var2.field1443 = null;
                }
                var2.method2677(-22491);
                return;
            }
        }
        if (arg0 != -115) {
            field2048 = -0.10247855F;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
    public static final void method980(int arg0) {
        field2052++;
        class382.field5752 = 0;
        class456.field6644.method993(116);
        if (arg0 != 25) {
            method980(44);
        }
        class307.field4631 = false;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Luq;ZI)I")
    public static final int method981(class114 arg0, boolean arg1, int arg2) {
        if (!arg1) {
            field2054 = 51;
        }
        field2053++;
        if (!client.method1387(arg0).method2413((byte) -101, arg2) && arg0.field1678 == null) {
            return -1;
        } else if (arg0.field1708 == null || arg2 >= arg0.field1708.length) {
            return -1;
        } else {
            return arg0.field1708[arg2];
        }
    }
}
