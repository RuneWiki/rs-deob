import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mw")
public class class489 {

    @OriginalMember(owner = "client!mw", name = "c", descriptor = "Lqe;")
    public static class465 field6981 = new class465(98, 6);

    @OriginalMember(owner = "client!mw", name = "b", descriptor = "Liga;")
    public static class454 field6980;

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "[I")
    public static int[] field6979;

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(Lr;III[Z)V", line = 3)
    public static final void method2942(class181 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class4.field56 == class138.field2153) {
            return;
        }
        int var5 = class173.field2511[arg1].method1827(-3458, arg2, arg3);
        for (int var6 = 0; var6 <= arg1; var6++) {
            if (arg4 == null || arg4[var6]) {
                class278 var7 = class173.field2511[var6];
                if (var7 != null) {
                    var7.method1089(arg0, arg2, var5 - var7.method1827(-3458, arg2, arg3), arg3, 0, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(Lha;IIIIIIZZ)V", line = 32)
    public static final void method2943(class58 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        class497.field7089 = arg0;
        class272.field3892 = arg1;
        class190.field2741 = class272.field3892 > 1 && class497.field7089.method579();
        class440.field6142 = arg2;
        class546.field7701 = 0x1 << class440.field6142;
        class252.field3600 = class546.field7701 >> 1;
        Math.sqrt((double) (class252.field3600 * class252.field3600 + class252.field3600 * class252.field3600));
        class749.field10470 = arg3;
        class613.field8871 = arg4;
        class453.field6328 = arg5;
        class235.field3337 = arg6;
        class105.field1752 = class436.method2630(false);
        class426.method2593(-25606);
        class25.field323 = new class416[arg3][class613.field8871][class453.field6328];
        class173.field2511 = new class278[arg3];
        if (arg7) {
            class478.field6819 = new int[class613.field8871][class453.field6328];
            class128.field1929 = new byte[class613.field8871][class453.field6328];
            class494.field7042 = new short[class613.field8871][class453.field6328];
            class421.field5916 = new class416[1][class613.field8871][class453.field6328];
            class4.field56 = new class278[1];
        } else {
            class478.field6819 = null;
            class128.field1929 = null;
            class494.field7042 = null;
            class421.field5916 = null;
            class4.field56 = null;
        }
        if (arg8) {
            class577.field8165 = new long[arg3][arg4][arg5];
            class502.field7171 = new class122[65535];
            class43.field650 = new boolean[65535];
            class153.field2298 = 0;
        } else {
            class577.field8165 = null;
            class502.field7171 = null;
            class43.field650 = null;
            class153.field2298 = 0;
        }
        class71.method732(false);
        class307.field4351 = new class43[2][];
        class307.field4351[0] = new class43[class90.field1609[0]];
        class307.field4351[1] = new class43[class90.field1609[1]];
        class189.field2729 = new int[2];
        class319.field4524 = new class43[2][];
        class319.field4524[0] = new class43[class750.field10476[0]];
        class319.field4524[1] = new class43[class750.field10476[1]];
        class444.field6176 = new int[2];
        class598.field8718 = new class43[2][];
        class598.field8718[0] = new class43[class423.field5921[0]];
        class598.field8718[1] = new class43[class423.field5921[1]];
        class579.field8176 = new int[2];
        class435.field6082 = new class43[10000];
        class431.field6032 = 0;
        class706.field9897 = new class43[5000];
        class237.field3355 = 0;
        class120.field1870 = new class113[5000];
        class586.field8252 = 0;
        class533.field7539 = new boolean[class235.field3337 + class235.field3337 + 1][class235.field3337 + class235.field3337 + 1];
        class462.field6655 = new boolean[class235.field3337 + class235.field3337 + 2][class235.field3337 + class235.field3337 + 2];
        class311.field4385 = new int[class235.field3337 + class235.field3337 + 2];
        class62.field1128 = class62.field1125;
        if (class190.field2741) {
            class705.field9867 = new boolean[arg3][class235.field3337 + class235.field3337 + 1][class235.field3337 + class235.field3337 + 1];
            class256.field3708 = new boolean[arg3][][];
            if (class253.field3660 != null) {
                class28.method202();
            }
            class253.field3660 = new class699[class272.field3892];
            class497.field7089.method591(class253.field3660.length + 1);
            class497.field7089.method527(0);
            for (int var9 = 0; var9 < class253.field3660.length; var9++) {
                class253.field3660[var9] = new class699(var9 + 1, class497.field7089);
                (new Thread(class253.field3660[var9], "wr" + var9)).start();
            }
            byte var10;
            if (class272.field3892 == 2) {
                var10 = 4;
                class368.field5159 = 2;
            } else if (class272.field3892 == 3) {
                var10 = 6;
                class368.field5159 = 3;
            } else {
                var10 = 8;
                class368.field5159 = 4;
            }
            class497.field7092 = new class671[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                class497.field7092[var11] = new class671(class342.field4812[class272.field3892 - 2][var11]);
            }
        } else {
            class368.field5159 = 1;
        }
        class729.field10212 = new int[class368.field5159 - 1];
        class371.field5197 = new int[class368.field5159 - 1];
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(B)V", line = 163)
    public static void method2944(byte arg0) {
        if (arg0 > -72) {
            field6979 = null;
        }
        field6979 = null;
        field6981 = null;
        field6980 = null;
    }
}
