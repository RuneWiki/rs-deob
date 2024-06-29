import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class622 {

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "Lrq;")
    public static class350 field8663 = new class350("WIP", 2);

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "I")
    public static int field8667 = 0;

    @OriginalMember(owner = "client!sk", name = "i", descriptor = "[Lkia;")
    public static class620[] field8670 = new class620[75];

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "I")
    public static int field8668 = 0;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "I")
    public static int field8662;

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "I")
    public static int field8664;

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "I")
    public static int field8665;

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "I")
    public static int field8666;

    @OriginalMember(owner = "client!sk", name = "h", descriptor = "I")
    public static int field8669;

    @OriginalMember(owner = "client!sk", name = "j", descriptor = "I")
    public static int field8671;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIIIB)V")
    public static final void method3494(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        class577.field8152 = arg1;
        class401.field5697 = arg2;
        class623.field8674 = arg3;
        if (arg5 <= 44) {
            field8667 = 78;
        }
        field8671 = arg0;
        field8662++;
        class291.field4105 = arg4;
        if (class291.field4105 >= 100) {
            int var6 = class623.field8674 * 512 + 256;
            int var7 = field8671 * 512 + 256;
            int var8 = class469.method2798(116, var7, class526.field7430, var6) - class401.field5697;
            int var9 = var6 - class511.field7303;
            int var10 = var8 - class155.field2169;
            int var11 = var7 - class32.field426;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class187.field2514 = (int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D) & 0x3FFF;
            class720.field9994 = (int) (-2607.5945876176133D * Math.atan2((double) var9, (double) var11)) & 0x3FFF;
            if (class187.field2514 < 1024) {
                class187.field2514 = 1024;
            }
            class707.field9813 = 0;
            if (class187.field2514 > 3072) {
                class187.field2514 = 3072;
            }
        }
        class218.field2850 = -1;
        class419.field5919 = -1;
        class97.field1168 = 2;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)V")
    public static void method3495(byte arg0) {
        if (arg0 >= -47) {
            method3494(119, -71, -4, -49, 4, (byte) 24);
        }
        field8663 = null;
        field8670 = null;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IB)I")
    public static final int method3496(int arg0, byte arg1) {
        field8669++;
        int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
        if (arg1 > -48) {
            method3497(-104, 103, -95, -51, -92, 86, -31);
        }
        int var3 = arg0 * 6 - 61440;
        int var4 = (arg0 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIIIII)V")
    public static final void method3497(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field8666++;
        if (arg4 < 107) {
            return;
        }
        if (class71.field960 <= arg1 && arg3 <= class549.field7665 && class143.field2050 <= arg5 && arg0 <= class461.field6495) {
            if (arg2 == 1) {
                class548.method3174(arg3, arg6, 118, arg5, arg0, arg1);
            } else {
                class14.method94(arg3, arg0, arg1, 1, arg6, arg5, arg2);
            }
        } else if (arg2 == 1) {
            class657.method3607(arg0, arg6, arg3, -178792918, arg5, arg1);
        } else {
            class643.method3556(arg2, arg0, arg3, true, arg6, arg5, arg1);
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)I")
    public static final int method3498(int arg0) {
        field8665++;
        if (class24.field340 == null) {
            return 0;
        } else {
            if (arg0 != -2) {
                method3497(72, -57, -112, -25, -54, 21, 67);
            }
            return class24.field340.length * 2;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(BIII)I")
    public static final int method3499(byte arg0, int arg1, int arg2, int arg3) {
        field8664++;
        int var4 = arg3 & 0x3;
        if (var4 == 0) {
            return arg1;
        }
        if (arg0 != 16) {
            method3494(-58, 59, 59, 126, 97, (byte) 41);
        }
        if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return 7 - arg2;
        }
    }
}
