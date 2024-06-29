import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class614 {

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "I")
    public static int field8598;

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "I")
    public static int field8599;

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
    public static int field8600;

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "I")
    public static int field8601;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IB)V")
    public static final void method3369(int arg0, byte arg1) {
        field8601++;
        if (class668.field9150 == arg0) {
            return;
        }
        if (arg0 == 13) {
            if (class224.field2948 == null) {
                class142.method879(2, class432.field6111, class643.field8880, class516.field7276);
            } else {
                class590.method3278(1, class643.field8880);
            }
        }
        if (arg0 != 13 && class696.field9858 != null) {
            class696.field9858.method872(-1);
            class696.field9858 = null;
        }
        if (arg0 == 3) {
            class177.method1084(true, class638.field8834 != class100.field1231);
        }
        if (arg0 == 7) {
            class685.method3798(class638.field8834 != class635.field8801, -1);
        }
        if (arg0 == 5) {
            if (class224.field2948 == null) {
                class631.method3434(0, class516.field7276, class432.field6111);
            } else {
                class281.method1678((byte) -125);
            }
        } else if (arg0 == 6) {
            if (class224.field2948 == null) {
                class142.method879(2, class432.field6111, class643.field8880, class516.field7276);
            } else {
                class590.method3278(1, class643.field8880);
            }
        } else if (arg0 == 9) {
            if (class224.field2948 == null) {
                class142.method879(2, class432.field6111, class643.field8880, class516.field7276);
            } else {
                class590.method3278(1, class643.field8880);
            }
        } else if (arg0 == 12) {
            if (class224.field2948 == null) {
                class631.method3434(0, class516.field7276, class432.field6111);
            } else {
                class281.method1678((byte) -128);
            }
        }
        if (class41.method340(4, class668.field9150)) {
            class565.field7911.field9720 = 2;
            class37.field544.field9720 = 2;
            class274.field3470.field9720 = 2;
            class687.field9729.field9720 = 2;
            class438.field6162.field9720 = 2;
            class530.field7471.field9720 = 2;
            class394.field5493.field9720 = 2;
        }
        if (class41.method340(4, arg0)) {
            class7.field72 = 0;
            class455.field6381 = 1;
            class129.field1558 = 0;
            class496.field7020 = 1;
            class575.field8033 = 0;
            class676.method3638(-1, true);
            class565.field7911.field9720 = 1;
            class37.field544.field9720 = 1;
            class274.field3470.field9720 = 1;
            class687.field9729.field9720 = 1;
            class438.field6162.field9720 = 1;
            class530.field7471.field9720 = 1;
            class394.field5493.field9720 = 1;
        }
        if (arg1 > -53) {
            method3371((byte) 87, -91);
        }
        if (arg0 == 11 || arg0 == 3) {
            class609.method3338(111);
        }
        boolean var2 = arg0 == 2 || class374.method2276(false, arg0) || class189.method1198(arg0, -127);
        boolean var3 = class668.field9150 == 2 || class374.method2276(false, class668.field9150) || class189.method1198(class668.field9150, -123);
        if (var3 != var2) {
            if (var2) {
                class601.field8357 = class182.field2386;
                if (class223.field2944.field624.method3601((byte) -123) == 0) {
                    class750.method4190(2, true);
                } else {
                    class418.method2489(class456.field6388, -26500, class182.field2386, 2, false, 0, class223.field2944.field624.method3601((byte) -125));
                    class519.method2979((byte) -109);
                }
                class101.field1243.method4097(false, (byte) -118);
            } else {
                class750.method4190(2, true);
                class101.field1243.method4097(true, (byte) -109);
            }
        }
        if (class41.method340(4, arg0) || arg0 == 13) {
            class458.field6407.method116();
        }
        class668.field9150 = arg0;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZZ)V")
    public static final void method3370(boolean arg0, boolean arg1) {
        field8599++;
        class128.field1554.method1961(class422.field5998.method94());
        int[] var2 = class422.field5998.method71();
        class298.field3866 = var2[1];
        class293.field3815 = var2[3];
        class419.field5963 = var2[0];
        if (!arg0) {
            field8598 = 95;
        }
        class486.field6919 = var2[2];
        if (arg1) {
            class422.field5998.method117(class715.field10076, class154.field1873, class681.field9269, class748.field10466);
            class91.method630(class221.field2879, -71);
        } else {
            class422.field5998.method117(class73.field959, class17.field230, class347.field4491, class643.field8878);
            class91.method630(class733.field10246, -36);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(BI)V")
    public static final void method3371(byte arg0, int arg1) {
        field8600++;
        class548 var2 = class696.method3872(arg1, 12, -1633381944);
        var2.method3127((byte) 126);
        int var3 = 116 / ((arg0 - 46) / 43);
    }
}
