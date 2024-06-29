import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rw")
public class class128 {

    @OriginalMember(owner = "client!rw", name = "b", descriptor = "Z")
    public static boolean field2092 = false;

    @OriginalMember(owner = "client!rw", name = "g", descriptor = "[[[I")
    public static int[][][] field2097 = new int[2][][];

    @OriginalMember(owner = "client!rw", name = "h", descriptor = "I")
    public static int field2098 = 0;

    @OriginalMember(owner = "client!rw", name = "e", descriptor = "Lpp;")
    public static class464 field2095 = new class464(4, -1);

    @OriginalMember(owner = "client!rw", name = "c", descriptor = "I")
    public static int field2093;

    @OriginalMember(owner = "client!rw", name = "d", descriptor = "I")
    public static int field2094;

    @OriginalMember(owner = "client!rw", name = "f", descriptor = "I")
    public static int field2096;

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "[Lha;")
    public static class116[] field2091;

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(Loh;IIIIIILqa;Lpa;)V")
    public static final void method1004(class549 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class167 arg7, class593 arg8) {
        field2096++;
        class192 var9 = class249.field3634.method70(arg5, 84);
        if (var9 != null && var9.field2735 && var9.method1272(-108, class401.field6001)) {
            if (var9.field2737 != null) {
                int[] var10 = new int[var9.field2737.length];
                for (int var11 = 0; var11 < var10.length / 2; var11++) {
                    int var13;
                    if (class377.field5547 == 4) {
                        var13 = (int) class523.field7256 & 0x3FFF;
                    } else {
                        var13 = (int) class523.field7256 + class495.field6941 & 0x3FFF;
                    }
                    int var14 = class285.field4154[var13];
                    int var15 = class285.field4152[var13];
                    if (class377.field5547 != 4) {
                        var14 = var14 * 256 / (class353.field5042 + 256);
                        var15 = var15 * 256 / (class353.field5042 + 256);
                    }
                    var10[var11 * 2] = ((arg3 + (var9.field2737[var11 * 2] * 4)) * var15 + (var9.field2737[var11 * 2 + 1] * 4 + arg2) * var14 >> 15) + arg0.field7678 / 2 + arg4;
                    var10[var11 * 2 + 1] = arg0.field7776 / 2 + arg6 - ((var9.field2737[var11 * 2 + 1] * 4 + arg2) * var15 - ((var9.field2737[var11 * 2] * 4 + arg3) * var14) >> 15);
                }
                class198.method1301(arg7, var10, var9.field2741, arg0.field7633, arg0.field7778);
                for (int var12 = 0; var12 < var10.length / 2 - 1; var12++) {
                    arg7.method633(var10[var12 * 2], var10[var12 * 2 + 1], var10[var12 * 2 + 2], var10[(var12 + 1) * 2 + 1], var9.field2767, 1, arg8, arg4, arg6);
                }
                arg7.method633(var10[var10.length - 2], var10[var10.length - 1], var10[0], var10[1], var9.field2767, 1, arg8, arg4, arg6);
            }
            class116 var16 = null;
            if (var9.field2747 != -1) {
                var16 = var9.method1273(false, (byte) -67, arg7);
                if (var16 != null) {
                    class638.method3684(arg3, arg0, false, arg2, arg8, var16, arg4, arg6);
                }
            }
            if (var9.field2753 != null) {
                int var17 = 0;
                if (var16 != null) {
                    var17 = var16.method968();
                }
                class259 var18 = class380.field5593;
                class633 var19 = class258.field3751;
                if (var9.field2759 == 1) {
                    var19 = class106.field1780;
                    var18 = class409.field6077;
                }
                if (var9.field2759 == 2) {
                    var18 = class273.field3996;
                    var19 = class26.field358;
                }
                class573.method3276(var17, var19, arg2, arg4, (byte) -72, var18, arg3, var9.field2760, var9.field2753, arg6, arg0, arg8);
            }
        }
        if (arg1 != -10087) {
            field2091 = null;
        }
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(I)V")
    public static void method1005(int arg0) {
        field2091 = null;
        field2095 = null;
        if (arg0 != -256) {
            method1004(null, 119, 43, 46, -80, 32, -1, null, null);
        }
        field2097 = null;
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(B)V")
    public static final void method1006(byte arg0) {
        int var1 = -119 % ((68 - arg0) / 32);
        field2094++;
        class69.field1306 = true;
    }

    @OriginalMember(owner = "client!rw", name = "b", descriptor = "(I)V")
    public static final void method1007(int arg0) {
        class558.field7906 = class26.field358.field9192 + class26.field358.field9193 + 2;
        class555.field7859 = new String[500];
        class105.field1762 = class106.field1780.field9193 + class106.field1780.field9192 + 2;
        field2093++;
        if (arg0 == 1) {
            for (int var1 = 0; var1 < class555.field7859.length; var1++) {
                class555.field7859[var1] = "";
            }
        }
    }
}
