import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class175 {

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "Ldi;")
    public static class330 field2778;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "Z")
    public static boolean field2777;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "[Lo;")
    public static class138[] field2776;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "[Lo;")
    public static class138[] field2779;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "[S")
    public static short[] field2775;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIILza;BILec;Lta;I)V", line = 10)
    public static final void method1182(int arg0, int arg1, int arg2, class491 arg3, byte arg4, int arg5, class68 arg6, class448 arg7, int arg8) {
        int var9 = -35 / (arg4 / 58);
        field2774++;
        class445 var10 = class94.field1585.method492(arg8, (byte) -10);
        if (var10 == null || !var10.field6636 || !var10.method2673(class327.field5160, -13309)) {
            return;
        }
        if (var10.field6625 != null) {
            int[] var11 = new int[var10.field6625.length];
            for (int var12 = 0; var12 < var11.length / 2; var12++) {
                int var14;
                if (class190.field2963 == 4) {
                    var14 = (int) class88.field1483 & 0x3FFF;
                } else {
                    var14 = (int) class88.field1483 + class227.field3959 & 0x3FFF;
                }
                int var15 = class46.field757[var14];
                int var16 = class46.field755[var14];
                if (class190.field2963 != 4) {
                    var16 = var16 * 256 / (class435.field6507 + 256);
                    var15 = var15 * 256 / (class435.field6507 + 256);
                }
                var11[var12 * 2] = arg2 + (arg6.field1009 / 2) + ((arg0 - -(var10.field6625[var12 * 2 + 1] * 4)) * var15 - -((var10.field6625[var12 * 2] * 4 + arg5) * var16) >> 15);
                var11[var12 * 2 + 1] = arg6.field1081 / 2 + arg1 - ((var10.field6625[var12 * 2 + 1] * 4 + arg0) * var16 - (var10.field6625[var12 * 2] * 4 + arg5) * var15 >> 15);
            }
            class267.method1784(arg3, var11, var10.field6621, arg6.field1020, arg6.field1019);
            for (int var13 = 0; var13 < var11.length / 2 - 1; var13++) {
                arg3.method899(var11[var13 * 2], var11[var13 * 2 + 1], var11[(var13 + 1) * 2], var11[(var13 + 1) * 2 + 1], var10.field6649, 1, arg7, arg2, arg1);
            }
            arg3.method899(var11[var11.length - 2], var11[var11.length - 1], var11[0], var11[1], var10.field6649, 1, arg7, arg2, arg1);
        }
        class138 var17 = null;
        if (var10.field6653 != -1) {
            var17 = var10.method2670(false, true, arg3);
            if (var17 != null) {
                class340.method2147(arg2, arg5, arg1, var17, arg7, arg0, 2, arg6);
            }
        }
        if (var10.field6629 == null) {
            return;
        }
        int var18 = 0;
        if (var17 != null) {
            var18 = var17.method210();
        }
        class296 var19 = class151.field2423;
        class331 var20 = class66.field978;
        if (var10.field6611 == 1) {
            var20 = class136.field2303;
            var19 = class531.field7796;
        }
        if (var10.field6611 == 2) {
            var19 = class127.field2188;
            var20 = class84.field1467;
        }
        class495.method2910(arg1, var20, var19, arg7, arg6, arg0, var18, var10.field6629, arg5, arg2, var10.field6624, 127);
        return;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V", line = 120)
    public static void method1183(int arg0) {
        if (arg0 >= -18) {
            method1182(92, -125, -75, null, (byte) -100, 4, null, null, 66);
        }
        field2778 = null;
        field2775 = null;
        field2776 = null;
        field2779 = null;
    }
}
