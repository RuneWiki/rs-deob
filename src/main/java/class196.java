import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public abstract class class196 {

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "Lbc;")
    public static class283 field2620 = new class283();

    @OriginalMember(owner = "client!qn", name = "e", descriptor = "I")
    public static int field2622 = 2;

    @OriginalMember(owner = "client!qn", name = "f", descriptor = "Lgq;")
    public static class418 field2623 = new class418(64);

    @OriginalMember(owner = "client!qn", name = "g", descriptor = "I")
    public static int field2624 = 0;

    @OriginalMember(owner = "client!qn", name = "h", descriptor = "Z")
    public static boolean field2625 = false;

    @OriginalMember(owner = "client!qn", name = "i", descriptor = "I")
    public static int field2626 = -1;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "I")
    public static int field2621;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(BI)Lps;", line = 7)
    public static final class394 method1168(byte arg0, int arg1) {
        field2621++;
        if (arg0 >= -68) {
            method1170(44, 39);
        }
        int var2 = arg1 >> 16;
        int var3 = arg1 & 0xFFFF;
        if (class365.field5292[var2] == null || class365.field5292[var2][var3] == null) {
            boolean var4 = class395.method2537((byte) -123, var2);
            if (!var4) {
                return null;
            }
        }
        return class365.field5292[var2][var3];
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lh;ILii;ILni;Lfp;II)V", line = 31)
    public static final void method1169(class427 arg0, int arg1, class405 arg2, int arg3, class246 arg4, class7 arg5, int arg6, int arg7) {
        field2619++;
        int var8 = arg4.field3321 - (arg3 / 2) - 5;
        int var9 = arg6 + 2;
        if (~arg5.field133 != arg1) {
            arg2.method2610(arg7 * arg0.method2714() + arg6 + 1 - var9, arg5.field133, true, arg3 + 10, var8, var9);
        }
        if (arg5.field108 != 0) {
            arg2.method2616(arg6 + (arg0.method2714() * arg7 + 1) - var9, 1, var8, arg3 + 10, arg5.field108, var9);
        }
        int var10 = arg5.field96;
        if (arg4.field3320 && arg5.field137 != -1) {
            var10 = arg5.field137;
        }
        for (int var11 = 0; var11 < arg7; var11++) {
            String var12 = class246.field3316[var11];
            if (var11 < (arg7 - 1)) {
                var12 = var12.substring(0, var12.length() - 4);
            }
            arg0.method2717(arg2, var12, arg4.field3321, arg6, var10, true);
            arg6 += arg0.method2714();
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(II)I", line = 73)
    public static final int method1170(int arg0, int arg1) {
        field2618++;
        if (arg1 > -74) {
            field2626 = -46;
        }
        return arg0 >>> 10;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)V", line = 85)
    public static void method1172(int arg0) {
        field2623 = null;
        field2620 = null;
        if (arg0 > -62) {
            field2626 = -62;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(BLid;)Lid;")
    public abstract class240 method1171(byte arg0, class240 arg1);
}
