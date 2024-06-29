import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class74 {

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "Z")
    public static boolean field943 = false;

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "I")
    public static int field949 = -1;

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field948 = new String[100];

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
    public static int field944;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "Lct;")
    public static class104 field946;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "Lfp;")
    public static class9 field942;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIIIII)V")
    public static final void method523(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field945++;
        if (arg1 != -2) {
            field949 = -77;
        }
        if (arg3 >= class9.field128 && class63.field838 >= arg2 && class248.field3659 <= arg5 && arg0 <= class146.field1978) {
            if (arg4 == 1) {
                class322.method2115(arg5, arg6, arg0, arg2, arg1 ^ 0xFFFFFECE, arg3);
            } else {
                class370.method2352(arg6, arg5, arg0, arg3, (byte) 23, arg4, arg2);
            }
        } else if (arg4 == 1) {
            class136.method903(arg3, arg6, (byte) 39, arg2, arg0, arg5);
        } else {
            class26.method271(arg0, arg5, arg2, arg6, 25882, arg4, arg3);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V")
    public static final void method524(int arg0) {
        if (arg0 < 65) {
            return;
        }
        if (class103.field1332 && class436.field6368.method256(-119, 81) && class237.field3532 > 2) {
            class264.method1819((class375) class138.field1885.field5735.field3908.field3908, -35);
        } else {
            class264.method1819((class375) class138.field1885.field5735.field3908, -19);
        }
        field944++;
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(I)V")
    public static void method525(int arg0) {
        field948 = null;
        if (arg0 >= 86) {
            field942 = null;
            field946 = null;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public static final boolean method526(String arg0, byte arg1) {
        int var2 = 122 % ((arg1 + 40) / 44);
        field947++;
        return class404.method2523(10, true, arg0, false);
    }
}
