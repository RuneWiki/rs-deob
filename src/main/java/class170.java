import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class170 extends class194 {

    @OriginalMember(owner = "client!tf", name = "Q", descriptor = "Lbi;")
    public static class104 field2483 = new class104(105, 12);

    @OriginalMember(owner = "client!tf", name = "T", descriptor = "Lbi;")
    public static class104 field2486 = new class104(0, 11);

    @OriginalMember(owner = "client!tf", name = "V", descriptor = "Ltq;")
    public static class276 field2488 = new class276(5000);

    @OriginalMember(owner = "client!tf", name = "X", descriptor = "[J")
    public static long[] field2490 = new long[32];

    @OriginalMember(owner = "client!tf", name = "P", descriptor = "I")
    public static int field2482;

    @OriginalMember(owner = "client!tf", name = "R", descriptor = "I")
    public static int field2484;

    @OriginalMember(owner = "client!tf", name = "S", descriptor = "I")
    public static int field2485;

    @OriginalMember(owner = "client!tf", name = "W", descriptor = "I")
    public static int field2489;

    @OriginalMember(owner = "client!tf", name = "U", descriptor = "[I")
    public static int[] field2487;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IILgi;BZ)V")
    public static final void method1075(int arg0, int arg1, class437 arg2, byte arg3, boolean arg4) {
        field2484++;
        int var5 = arg2.field6615;
        int var6 = arg2.field6730;
        if (arg2.field6629 == 0) {
            arg2.field6615 = arg2.field6704;
        } else if (arg2.field6629 == 1) {
            arg2.field6615 = arg0 - arg2.field6704;
        } else if (arg2.field6629 == 2) {
            arg2.field6615 = arg2.field6704 * arg0 >> 14;
        }
        if (arg2.field6604 == 0) {
            arg2.field6730 = arg2.field6746;
        } else if (arg2.field6604 == 1) {
            arg2.field6730 = arg1 - arg2.field6746;
        } else if (arg2.field6604 == 2) {
            arg2.field6730 = arg2.field6746 * arg1 >> 14;
        }
        if (arg2.field6629 == 4) {
            arg2.field6615 = arg2.field6730 * arg2.field6692 / arg2.field6700;
        }
        if (arg2.field6604 == 4) {
            arg2.field6730 = arg2.field6700 * arg2.field6615 / arg2.field6692;
        }
        if (arg3 <= 19) {
            return;
        }
        if (class223.field3757 && (client.method492(arg2).field7149 != 0 || arg2.field6729 == 0)) {
            if (arg2.field6730 < 5 && arg2.field6615 < 5) {
                arg2.field6615 = 5;
                arg2.field6730 = 5;
            } else {
                if (arg2.field6615 <= 0) {
                    arg2.field6615 = 5;
                }
                if (arg2.field6730 <= 0) {
                    arg2.field6730 = 5;
                }
            }
        }
        if (class411.field6238 == arg2.field6688) {
            class330.field5180 = arg2;
        }
        if (arg4 && arg2.field6679 != null && arg2.field6615 != var5 || arg2.field6730 != var6) {
            class491 var7 = new class491();
            var7.field7430 = arg2.field6679;
            var7.field7423 = arg2;
            class176.field2580.method2124(var7, (byte) 126);
        }
    }

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(I)V")
    public static final void method1076(int arg0) {
        for (int var1 = arg0; var1 < class416.field6309.length; var1++) {
            for (int var2 = 0; var2 < class416.field6309[0].length; var2++) {
                for (int var3 = 0; var3 < class416.field6309[0][0].length; var3++) {
                    class416.field6309[var1][var2][var3] = 0;
                }
            }
        }
        field2482++;
    }

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "(I)V")
    public static void method1077(int arg0) {
        field2483 = null;
        field2487 = null;
        field2488 = null;
        field2490 = null;
        if (arg0 > 9) {
            field2486 = null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method1078(int arg0, String arg1) {
        if (arg0 >= -84) {
            return 62;
        } else {
            field2485++;
            return class487.method2989(10, -13547, arg1, true);
        }
    }
}
