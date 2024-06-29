import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class508 {

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
    public static int field7174 = -2;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "Lnea;")
    public static class664 field7173 = new class664(111, 8);

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "[Z")
    public static boolean[] field7177 = new boolean[100];

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "I")
    public static int field7172;

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
    public static int field7175;

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "I")
    public static int field7176;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "Lnq;")
    public static class424 field7171;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(B)V")
    public static void method2917(byte arg0) {
        field7171 = null;
        field7173 = null;
        field7177 = null;
        if (arg0 < 40) {
            method2918(-109, 73);
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)Lvb;")
    public static final class178 method2918(int arg0, int arg1) {
        field7176++;
        if (arg0 == 100) {
            return class683.field9624 && arg1 >= class32.field497 && arg1 <= class390.field5790 ? class656.field9195[arg1 - class32.field497] : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(BZIII)V")
    public static final void method2919(byte arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (arg0 < -94) {
            field7172++;
            if (class312.method1978(false, arg3)) {
                class697.method3892(arg4, class181.field2558[arg3], (byte) 126, arg1, -1, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IBIII)V")
    public static final void method2920(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 > -45) {
            return;
        }
        field7175++;
        if (class15.field153 <= arg4 - arg0 && (arg4 + arg0) <= class248.field3859 && class520.field7329 <= arg3 - arg0 && class239.field3747 >= arg3 + arg0) {
            class37.method431(arg2, 3, arg4, arg3, arg0);
        } else {
            class97.method789(arg3, arg2, arg0, arg4, -1);
        }
    }
}
