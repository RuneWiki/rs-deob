import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vw")
public class class542 {

    @OriginalMember(owner = "client!vw", name = "d", descriptor = "I")
    public static int field7042 = 0;

    @OriginalMember(owner = "client!vw", name = "i", descriptor = "I")
    public static int field7047 = -50;

    @OriginalMember(owner = "client!vw", name = "f", descriptor = "Ljava/lang/String;")
    public static String field7044 = null;

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "I")
    public static int field7039;

    @OriginalMember(owner = "client!vw", name = "c", descriptor = "I")
    public static int field7041;

    @OriginalMember(owner = "client!vw", name = "e", descriptor = "I")
    public static int field7043;

    @OriginalMember(owner = "client!vw", name = "g", descriptor = "I")
    public static int field7045;

    @OriginalMember(owner = "client!vw", name = "h", descriptor = "I")
    public static int field7046;

    @OriginalMember(owner = "client!vw", name = "b", descriptor = "[Lxa;")
    public static class511[] field7040;

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(ILdg;)I", line = 3)
    public static final int method2876(int arg0, class193 arg1) {
        field7039++;
        int var2 = arg1.field2488;
        class501 var3 = arg1.method1435((byte) -28);
        if (arg1.field2976) {
            var2 = arg1.field2496;
        } else if (arg1.field3025 == var3.field6570 || arg1.field3025 == var3.field6574 || arg1.field3025 == var3.field6587 || arg1.field3025 == var3.field6608) {
            var2 = arg1.field2485;
        } else if (arg1.field3025 == var3.field6610 || arg1.field3025 == var3.field6572 || arg1.field3025 == var3.field6612 || arg1.field3025 == var3.field6597) {
            var2 = arg1.field2477;
        }
        return arg0 == -1 ? var2 : -128;
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(ZLjava/lang/String;Loa;Lta;Lsga;Z)V", line = 32)
    public static final void method2877(boolean arg0, String arg1, class43 arg2, class597 arg3, class547 arg4, boolean arg5) {
        field7041++;
        if (class382.field4897 && class165.method1151(115)) {
            class547 var11 = class81.field1110;
            class597 var12 = arg2.method405(var11, class30.field459, true);
            int var13 = var11.method2898(null, 250, -5633, arg1);
            int var14 = var11.method2904(var11.field7100, 250, arg1, -1, null);
            int var15 = class463.field6064.field6651;
            int var16 = var15 + 4;
            int var17 = var16 * 2 + var13;
            int var18 = var16 * 2 + var14;
            if (class32.field469 > var18) {
                var18 = class32.field469;
            }
            if (var17 < class619.field8352) {
                var17 = class619.field8352;
            }
            int var19 = class541.field7035.method3005(class94.field1240, (byte) -128, var17) + class694.field9488;
            int var20 = class590.field8007.method3059(var18, class535.field6968, -103) + class527.field6861;
            arg2.method325(class419.field5430, false).method2756(class290.field3752.field6651 + var19, class290.field3752.field6650 + var20, var17 - (class290.field3752.field6651 * 2), -(class290.field3752.field6650 * 2) + var18);
            arg2.method325(class290.field3752, true).method2751(var19, var20);
            class290.field3752.method2733();
            arg2.method325(class290.field3752, true).method2751(var19 + var17 - var15, var20);
            class290.field3752.method2728();
            arg2.method325(class290.field3752, true).method2751(var17 + var19 - var15, -var15 + var18 + var20);
            class290.field3752.method2733();
            arg2.method325(class290.field3752, true).method2751(var19, var18 + var20 - var15);
            class290.field3752.method2728();
            arg2.method325(class463.field6064, true).method2756(var19, var20 + class290.field3752.field6650, var15, var18 - (class290.field3752.field6650 * 2));
            class463.field6064.method2735();
            arg2.method325(class463.field6064, true).method2756(class290.field3752.field6651 + var19, var20, var17 - (class290.field3752.field6651 * 2), var15);
            class463.field6064.method2735();
            arg2.method325(class463.field6064, true).method2756(var19 + var17 - var15, class290.field3752.field6650 + var20, var15, var18 - class290.field3752.field6650 * 2);
            class463.field6064.method2735();
            arg2.method325(class463.field6064, true).method2756(var19 + class290.field3752.field6651, var18 + var20 + -var15, var17 - (class290.field3752.field6651 * 2), var15);
            class463.field6064.method2735();
            var12.method3256(0, class635.field8835 | 0xFF000000, var18 - var16 * 2, var16 + var20, var19 + var16, 0, arg1, null, 0, null, -1, null, 0, var17 - (var16 * 2), 1, 1);
            class197.method1303(var19, var20, -58, var17, var18);
        } else {
            int var6 = arg4.method2898(null, 250, -5633, arg1);
            int var7 = arg4.method2899(null, 250, arg1, true) * 13;
            byte var8 = 4;
            int var9 = var8 + 6;
            int var10 = var8 + 6;
            arg2.method353(var9 - var8, var10 - var8, var6 + var8 + var8, var7 + var8 + var8, -16777216, 0);
            arg2.method388(var9 - var8, -var8 + var10, var6 + var8 + var8, var7 + var8 - -var8, -1, 0);
            arg3.method3256(0, -1, var7, var10, var9, 0, arg1, null, -5, null, -1, null, 0, var6, 1, 1);
            class197.method1303(var9 - var8, -var8 + var10, -58, var6 + var8 + var8, var8 + var8 + var7);
        }
        if (arg0) {
            try {
                arg2.method216();
            } catch (class381 var21) {
            }
        }
        if (!arg5) {
            field7043 = 6;
        }
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "([BB)V", line = 115)
    public static final void method2878(byte[] arg0, byte arg1) {
        if (arg1 != -20) {
            method2879(-108);
        }
        field7045++;
        class418 var2 = new class418(arg0);
        while (true) {
            while (true) {
                int var3 = var2.method2396(63);
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    int[] var4 = class326.field4247 = new int[6];
                    var4[0] = var2.method2393(class392.method2234(arg1, 30741));
                    var4[1] = var2.method2393(-30727);
                    var4[2] = var2.method2393(-30727);
                    var4[3] = var2.method2393(class392.method2234(arg1, 30741));
                    var4[4] = var2.method2393(-30727);
                    var4[5] = var2.method2393(arg1 - 30707);
                } else if (var3 == 4) {
                    int var7 = var2.method2396(-104);
                    class452.field5890 = new int[var7];
                    for (int var8 = 0; var8 < var7; var8++) {
                        class452.field5890[var8] = var2.method2393(-30727);
                        if (class452.field5890[var8] == 65535) {
                            class452.field5890[var8] = -1;
                        }
                    }
                } else if (var3 == 5) {
                    int var5 = var2.method2396(-103);
                    class484.field6454 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        class484.field6454[var6] = var2.method2393(arg1 - 30707);
                        if (class484.field6454[var6] == 65535) {
                            class484.field6454[var6] = -1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(I)V", line = 206)
    public static void method2879(int arg0) {
        field7044 = null;
        if (arg0 != 4646) {
            method2878(null, (byte) 35);
        }
        field7040 = null;
    }
}
