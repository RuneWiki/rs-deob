import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jda")
public class class449 {

    @OriginalMember(owner = "client!jda", name = "e", descriptor = "Ljj;")
    public static class398 field6145 = new class398(16, 7);

    @OriginalMember(owner = "client!jda", name = "f", descriptor = "[Z")
    public static boolean[] field6146 = new boolean[8];

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "I")
    public static int field6141;

    @OriginalMember(owner = "client!jda", name = "b", descriptor = "I")
    public static int field6142;

    @OriginalMember(owner = "client!jda", name = "c", descriptor = "I")
    public static int field6143;

    @OriginalMember(owner = "client!jda", name = "d", descriptor = "I")
    public static int field6144;

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(I[BI)[B", line = 3)
    public static final byte[] method2565(int arg0, byte[] arg1, int arg2) {
        if (arg0 < 69) {
            method2565(97, null, -46);
        }
        field6141++;
        byte[] var3 = new byte[arg2];
        class657.method3639(arg1, 0, var3, 0, arg2);
        return var3;
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(IIIIIIIIZ)Z", line = 17)
    public static final boolean method2566(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        field6142++;
        int var9 = class596.field8164.field526[0];
        int var10 = class596.field8164.field516[0];
        if (var9 < 0 || class588.field8082 <= var9 || var10 < 0 || class12.field113 <= var10) {
            return false;
        } else if (arg7 >= 0 && class588.field8082 > arg7 && arg4 >= 0 && class12.field113 > arg4) {
            int var11 = class25.method146(arg7, var10, arg6, class517.field7136, arg4, arg3, arg1, arg8, arg5, class364.field5239, class624.field8489[class596.field8164.field3925], (byte) -68, arg2, class596.field8164.method241(-25747), var9);
            if (var11 < 1) {
                return false;
            }
            class436.field6025 = class517.field7136[var11 - 1];
            class251.field3388 = class364.field5239[var11 - 1];
            if (arg0 >= -28) {
                return false;
            } else {
                class329.field4819 = false;
                class650.method3609(30787);
                return true;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(I)V", line = 51)
    public static void method2567(int arg0) {
        field6146 = null;
        field6145 = null;
        if (arg0 != -1) {
            method2566(-38, -27, -57, 90, 1, 2, 71, -59, false);
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(Z)V", line = 63)
    public static final void method2568(boolean arg0) {
        if (arg0) {
            method2569(127, -87, 44, true);
        }
        if (class9.field103.method1942()) {
            class9.field103.method1938(class249.field3351);
            class82.method460((byte) 118);
            class9.field103.method1907(class249.field3351);
            class9.field103.method1786(class249.field3351);
        } else {
            class564.method3180(class161.field2038, (byte) 97);
        }
        field6143++;
        class578.method3251((byte) 125);
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(IIIZ)I", line = 97)
    public static final int method2569(int arg0, int arg1, int arg2, boolean arg3) {
        field6144++;
        class149 var4 = class255.method1597(arg1, arg3, 27628);
        if (var4 == null) {
            return -1;
        } else if (arg2 >= ~arg0 && var4.field1873.length > arg0) {
            return var4.field1873[arg0];
        } else {
            return -1;
        }
    }
}
