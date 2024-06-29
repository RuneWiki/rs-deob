import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class648 {

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "Ljn;")
    public static class134 field9061 = new class134(34, 2);

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
    public static int field9062;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "I")
    public static int field9063;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
    public static int field9064;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "Ljava/lang/String;")
    public static String field9060;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V")
    public static final void method3715(byte arg0) {
        if (arg0 <= 20) {
            method3716(-104);
        }
        class197.field2782 = 0;
        class60.field690 = class179.field2263;
        field9064++;
        class141.field1793 = 0;
        class356.field5133 = new class532[500];
        class752.field10378 = 0;
        class381.field5451 = new class532[2000];
        class635.field8861 = false;
        class665.field9352 = new int[class266.field3869][class414.field5796 + 1][class704.field9799 + 1];
        class758.field10425 = new class532[1000];
        class293.field4304 = 0;
        class428.field5974 = new class532[500];
        class169.field2153 = class179.field2263;
        if ((class139.field1781 instanceof class52)) {
            class623.field8736 = false;
        } else {
            class623.field8736 = true;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
    public static void method3716(int arg0) {
        field9060 = null;
        field9061 = null;
        if (arg0 != 34836) {
            field9060 = null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IZ)I")
    public static final int method3717(int arg0, boolean arg1) {
        field9062++;
        if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
            return 6407;
        } else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
            return 6408;
        } else if (arg0 == 6406 || arg0 == 34844) {
            return 6406;
        } else if (arg0 == 6409 || arg0 == 34846) {
            return 6409;
        } else if (arg0 == 6410 || arg0 == 34847) {
            return 6410;
        } else {
            if (arg1) {
                field9060 = null;
            }
            if (arg0 != 6402) {
                throw new IllegalArgumentException("");
            }
            return 6402;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z)V")
    public static final void method3718(boolean arg0) {
        field9063++;
        if (arg0) {
            method3715((byte) -40);
        }
        for (int var1 = 0; var1 < class737.field10141; var1++) {
            int var2 = class35.method291(class616.field8644 + var1, class737.field10141, (byte) -112) * class410.field5753;
            for (int var3 = 0; var3 < class410.field5753; var3++) {
                int var4 = var2 + class35.method291(class395.field5608 + var3, class410.field5753, (byte) -117);
                if (class85.field1027[var4] == class729.field10073) {
                    class376.field5395[var4].method2232(0, 0, class618.field8685, class750.field10361, class618.field8685 * var3, class750.field10361 * var1, true, true);
                }
            }
        }
    }
}
