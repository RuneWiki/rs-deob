import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class633 extends class9 {

    @OriginalMember(owner = "client!pn", name = "z", descriptor = "Lrj;")
    public class510 field9117;

    @OriginalMember(owner = "client!pn", name = "D", descriptor = "I")
    public static int field9120 = 0;

    @OriginalMember(owner = "client!pn", name = "A", descriptor = "F")
    public static float field9118;

    @OriginalMember(owner = "client!pn", name = "w", descriptor = "I")
    public static int field9114;

    @OriginalMember(owner = "client!pn", name = "x", descriptor = "I")
    public static int field9115;

    @OriginalMember(owner = "client!pn", name = "C", descriptor = "I")
    public static int field9119;

    @OriginalMember(owner = "client!pn", name = "y", descriptor = "[I")
    public static int[] field9116;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IZZIIII)V")
    public static final void method3637(int arg0, boolean arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 < 67) {
            method3640((byte) -84);
        }
        field9115++;
        if (arg0 >= arg6) {
            return;
        }
        int var7 = (arg0 + arg6) / 2;
        int var8 = arg0;
        class29 var9 = class544.field7971[var7];
        class544.field7971[var7] = class544.field7971[arg6];
        class544.field7971[arg6] = var9;
        for (int var10 = arg0; var10 < arg6; var10++) {
            if (class343.method1918(class544.field7971[var10], arg1, arg5, (byte) 90, arg2, arg4, var9) <= 0) {
                class29 var11 = class544.field7971[var10];
                class544.field7971[var10] = class544.field7971[var8];
                class544.field7971[var8++] = var11;
            }
        }
        class544.field7971[arg6] = class544.field7971[var8];
        class544.field7971[var8] = var9;
        method3637(arg0, arg1, arg2, 115, arg4, arg5, var8 - 1);
        method3637(var8 + 1, arg1, arg2, 122, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IB)V")
    public static final void method3638(int arg0, byte arg1) {
        if (arg1 <= 57) {
            field9120 = 58;
        }
        class641 var2 = class342.field4407;
        synchronized (class342.field4407) {
            class342.field4407.method3686((byte) 53, arg0);
        }
        field9114++;
        class641 var3 = class325.field4116;
        synchronized (class325.field4116) {
            class325.field4116.method3686((byte) 53, arg0);
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IC)Z")
    public static final boolean method3639(int arg0, char arg1) {
        field9119++;
        if (arg1 >= ' ' && arg1 <= '~') {
            return true;
        } else if (arg1 >= ' ' && arg1 <= 'ÿ') {
            return true;
        } else if (arg1 == '€' || arg1 == 'Œ' || arg1 == '—' || arg1 == 'œ' || arg1 == 'Ÿ') {
            return true;
        } else {
            if (arg0 != 338) {
                method3637(35, false, false, 78, -110, -96, -71);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(B)V")
    public static void method3640(byte arg0) {
        field9116 = null;
        if (arg0 >= -5) {
            method3637(121, false, true, -16, 32, -117, -127);
        }
    }

    @OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(Lrj;)V")
    public class633(class510 arg0) {
        this.field9117 = arg0;
    }
}
