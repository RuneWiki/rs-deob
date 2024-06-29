import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class50 {

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "Lpg;")
    public static class77 field732 = new class77(5000);

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "Lcc;")
    public static class216 field734 = new class216(64);

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "Ljava/lang/String;")
    public static String field737 = "Hidden";

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "I")
    public static int field735;

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "I")
    public static int field736;

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "Llc;")
    public static class86 field733;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ZIBZLmf;IIZI)Lsi;")
    public static final class204 method387(boolean arg0, int arg1, byte arg2, boolean arg3, class10 arg4, int arg5, int arg6, boolean arg7, int arg8) {
        field731++;
        class62 var9 = class254.method1800(arg8, 15017);
        if (arg1 > 1 && var9.field870 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field891[var11] && var9.field891[var11] != 0) {
                    var10 = var9.field870[var11];
                }
            }
            if (var10 != -1) {
                var9 = class254.method1800(var10, 15017);
            }
        }
        class246 var12 = var9.method450(arg4, 126);
        if (var12 == null) {
            return null;
        }
        if (arg2 > -45) {
            field732 = null;
        }
        class140 var13 = null;
        if (var9.field902 != -1) {
            var13 = (class140) method387(false, 10, (byte) -126, true, arg4, 0, 1, true, var9.field936);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field924 != -1) {
            var13 = (class140) method387(false, arg1, (byte) -85, true, arg4, arg5, arg6, false, var9.field937);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = class70.field1031;
        int var15 = class70.field1030;
        int var16 = class70.field1028;
        int[] var17 = new int[4];
        class70.method507(var17);
        class140 var18 = new class140(36, 32);
        class70.method511(var18.field2251, 36, 32);
        class47.method357();
        class47.method356(16, 16);
        int var19 = var9.field900;
        if (arg7) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg6 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        class47.field684 = false;
        int var20 = class47.field679[var9.field906] * var19 >> 16;
        int var21 = class47.field695[var9.field906] * var19 >> 16;
        var12.method154(0, var9.field895, var9.field934, var9.field906, var9.field880, var9.field907 + var20 - (var12.method3() / 2), var9.field907 + var21, -1L);
        if (arg6 >= 1) {
            var18.method988(1);
            if (arg6 >= 2) {
                var18.method988(16777215);
            }
            class70.method511(var18.field2251, 36, 32);
        }
        if (arg5 != 0) {
            var18.method991(arg5);
        }
        if (var9.field902 != -1) {
            var13.method60(0, 0);
        } else if (var9.field924 != -1) {
            class70.method511(var13.field2251, 36, 32);
            var18.method60(0, 0);
            var18 = var13;
        }
        if (arg0 && (var9.field909 == 1 || arg1 != 1) && arg1 != -1) {
            class180.field2907.method1254(class128.method929(arg1, -126), 0, 9, 16776960, 1);
        }
        class70.method511(var14, var15, var16);
        class70.method495(var17);
        class47.method357();
        class47.field684 = true;
        return var18;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(B)V")
    public static void method388(byte arg0) {
        field733 = null;
        field732 = null;
        if (arg0 != 73) {
            method388((byte) -35);
        }
        field734 = null;
        field737 = null;
    }
}
