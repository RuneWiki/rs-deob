import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class250 extends class25 {

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "I")
    public int field3521;

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
    public int field3522;

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "I")
    public static int field3523;

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "I")
    public int field3524;

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!gf", name = "n", descriptor = "I")
    public int field3527;

    @OriginalMember(owner = "client!gf", name = "o", descriptor = "I")
    public static int field3528;

    @OriginalMember(owner = "client!gf", name = "p", descriptor = "I")
    public static int field3529;

    @OriginalMember(owner = "client!gf", name = "r", descriptor = "I")
    public static int field3531;

    @OriginalMember(owner = "client!gf", name = "s", descriptor = "I")
    public int field3532;

    @OriginalMember(owner = "client!gf", name = "t", descriptor = "I")
    public int field3533;

    @OriginalMember(owner = "client!gf", name = "u", descriptor = "I")
    public static int field3534;

    @OriginalMember(owner = "client!gf", name = "q", descriptor = "Ljava/lang/String;")
    public String field3530;

    @OriginalMember(owner = "client!gf", name = "m", descriptor = "[Z")
    public static boolean[] field3526;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "([SZ[Ljava/lang/String;)V", line = 8)
    public static final void method1544(short[] arg0, boolean arg1, String[] arg2) {
        class627.method3489(arg1, arg2, 0, arg2.length - 1, arg0);
        field3534++;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZLjava/lang/String;)Z", line = 17)
    public static final boolean method1545(boolean arg0, String arg1) {
        field3528++;
        if (arg1 == null) {
            return false;
        }
        int var2 = 0;
        if (!arg0) {
            return false;
        }
        while (class261.field3711 > var2) {
            if (arg1.equalsIgnoreCase(class272.field3836[var2])) {
                return true;
            }
            if (arg1.equalsIgnoreCase(class24.field327[var2])) {
                return true;
            }
            var2++;
        }
        return false;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIIIIIII)V", line = 48)
    public static final void method1546(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3523++;
        if (class474.method2690(arg3, -256197904)) {
            if (class24.field321[arg3] == null) {
                class520.method2882(class676.field9545[arg3], arg8, arg4, arg6, -1, arg1, arg0, arg2, arg5, (byte) -120);
            } else {
                class520.method2882(class24.field321[arg3], arg8, arg4, arg6, -1, arg1, arg0, arg2, arg5, (byte) -107);
            }
            if (arg7 != -18420) {
                field3529 = 77;
            }
        } else if (arg0 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class287.field3996[var9] = true;
            }
        } else {
            class287.field3996[arg0] = true;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIB)Z", line = 82)
    public static final boolean method1547(int arg0, int arg1, byte arg2) {
        if (arg2 < 107) {
            method1546(-104, 77, 22, -39, 32, 98, -19, -21, 5);
        }
        field3525++;
        return (arg0 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)V", line = 93)
    public static void method1548(int arg0) {
        if (arg0 != -25176) {
            field3526 = null;
        }
        field3526 = null;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;I)V", line = 105)
    public static final void method1549(String arg0, String arg1, int arg2, String arg3, int arg4, String arg5, int arg6) {
        field3531++;
        class669.method3710(arg3, arg5, arg1, arg4, -109, null, arg0, arg2, arg6);
    }
}
