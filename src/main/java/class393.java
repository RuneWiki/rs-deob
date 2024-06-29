import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public class class393 extends class487 {

    @OriginalMember(owner = "client!lp", name = "f", descriptor = "Lwfa;")
    public class200 field5773;

    @OriginalMember(owner = "client!lp", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field5774 = new String[100];

    @OriginalMember(owner = "client!lp", name = "d", descriptor = "I")
    public static int field5771;

    @OriginalMember(owner = "client!lp", name = "e", descriptor = "I")
    public static int field5772;

    @OriginalMember(owner = "client!lp", name = "h", descriptor = "I")
    public static int field5775;

    @OriginalMember(owner = "client!lp", name = "i", descriptor = "Lpc;")
    public static class670 field5776;

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "(B)V", line = 6)
    public static void method2469(byte arg0) {
        field5774 = null;
        if (arg0 >= -67) {
            field5776 = null;
        }
        field5776 = null;
    }

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "(I)I", line = 21)
    public static final int method2470(int arg0) {
        field5775++;
        if (arg0 != 512) {
            method2472(122, 62, -125, 72, -74, 116, 43, (byte) 104, 62, -115);
        }
        return class99.field1732.method1718((byte) -98);
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIBI)Z", line = 35)
    public static final boolean method2471(int arg0, int arg1, byte arg2, int arg3) {
        field5772++;
        if (!class728.field9848 || !class151.field2492) {
            return false;
        } else if (class399.field5890 < 100) {
            return false;
        } else {
            int var4 = class299.field4185[arg0][arg1][arg3];
            if ((-class470.field6597) == var4) {
                return false;
            } else if (class470.field6597 == var4) {
                return true;
            } else if (class683.field9250 == class344.field4822) {
                return false;
            } else {
                int var5 = arg1 << class130.field2185;
                int var6 = arg3 << class130.field2185;
                if (arg2 != -97) {
                    method2470(-4);
                }
                if (class87.method829(var5 + 1, var5 - (-class1.field3 - -1), var6 + 1, var5 + 1, var6 + class1.field3 - 1, class683.field9250[arg0].method1851((byte) -86, arg3 + 1, arg1), class683.field9250[arg0].method1851((byte) -86, arg3 + 1, arg1 + 1), class683.field9250[arg0].method1851((byte) -86, arg3, arg1), class1.field3 + var6 - 1, false) && class87.method829(var5 + 1, var5 + -1 + class1.field3, var6 + 1, var5 - 1 + class1.field3, class1.field3 + var6 - 1, class683.field9250[arg0].method1851((byte) -86, arg3 - -1, arg1 + 1), class683.field9250[arg0].method1851((byte) -86, arg3, arg1 + 1), class683.field9250[arg0].method1851((byte) -86, arg3, arg1), var6 + 1, false)) {
                    class72.field1330++;
                    class299.field4185[arg0][arg1][arg3] = class470.field6597;
                    return true;
                } else {
                    class299.field4185[arg0][arg1][arg3] = -class470.field6597;
                    return false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIIIIIIBII)V", line = 81)
    public static final void method2472(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9) {
        field5771++;
        if (arg4 < 512 || arg6 < 512 || arg4 > ((class376.field5325 - 2) * 512) || (class175.field2711 - 2) * 512 < arg6) {
            class339.field4768[0] = class339.field4768[1] = -1;
        } else if (arg7 >= 22) {
            int var10 = class197.method1403(arg4, arg0, 11219, arg6) - arg2;
            if (class241.field3529) {
                class368.method2343(false, true);
            } else {
                class244.field3536.method752(arg5, 0, 0);
                class272.field3822.method210(class244.field3536);
            }
            if (class458.field6459) {
                class272.field3822.method195(arg4, var10, arg6, class58.field1146, class339.field4768);
            } else {
                class272.field3822.method299(arg4, var10, arg6, class339.field4768);
            }
            if (class241.field3529) {
                class115.method1017((byte) 60);
            } else {
                class244.field3536.method752(-arg5, 0, 0);
                class272.field3822.method210(class244.field3536);
            }
        }
    }

    @OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(Lwga;II[B)V", line = 123)
    public class393(class745 arg0, int arg1, int arg2, byte[] arg3) {
        this.field5773 = arg0.method4155(arg3, arg1, class556.field7676, 2, false, arg2);
        this.field5773.method1014(false, false, 25688);
    }

    @OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(Lwga;II[I)V", line = 135)
    public class393(class745 arg0, int arg1, int arg2, int[] arg3) {
        this.field5773 = arg0.method4091(arg2, arg1, -15137, false, arg3);
        this.field5773.method1014(false, false, 25688);
    }
}
