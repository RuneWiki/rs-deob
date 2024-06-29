import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class408 {

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "Lkg;")
    public static class275 field5176 = new class275(43, 4);

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "I")
    public static int field5175;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
    public static int field5177;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "I")
    public static int field5178;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "I")
    public static int field5179;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lcc;B)V")
    public static final void method2274(class733 arg0, byte arg1) {
        field5178++;
        if (arg1 != -23) {
            method2274(null, (byte) -21);
        }
        for (class357 var2 = (class357) class757.field10561.method3672(-1); var2 != null; var2 = (class357) class757.field10561.method3662(-1)) {
            if (var2.field4592 == arg0) {
                if (var2.field4617 != null) {
                    class307.field4055.method1319(var2.field4617);
                    var2.field4617 = null;
                }
                var2.method1175(-2);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Ljava/lang/String;BC)I")
    public static final int method2275(String arg0, byte arg1, char arg2) {
        field5179++;
        int var3 = 0;
        int var4 = arg0.length();
        int var5 = -18 / ((arg1 + 22) / 33);
        for (int var6 = 0; var6 < var4; var6++) {
            if (arg0.charAt(var6) == arg2) {
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILria;IZI)V")
    public static final void method2276(int arg0, class288 arg1, int arg2, boolean arg3, int arg4) {
        field5177++;
        if (arg0 >= -16) {
            return;
        }
        int var5 = arg1.field3617;
        int var6 = arg1.field3714;
        if (arg1.field3701 == 0) {
            arg1.field3617 = arg1.field3660;
        } else if (arg1.field3701 == 1) {
            arg1.field3617 = arg4 - arg1.field3660;
        } else if (arg1.field3701 == 2) {
            arg1.field3617 = arg1.field3660 * arg4 >> 14;
        }
        if (arg1.field3677 == 0) {
            arg1.field3714 = arg1.field3675;
        } else if (arg1.field3677 == 1) {
            arg1.field3714 = arg2 - arg1.field3675;
        } else if (arg1.field3677 == 2) {
            arg1.field3714 = arg1.field3675 * arg2 >> 14;
        }
        if (arg1.field3701 == 4) {
            arg1.field3617 = arg1.field3714 * arg1.field3624 / arg1.field3636;
        }
        if (arg1.field3677 == 4) {
            arg1.field3714 = arg1.field3636 * arg1.field3617 / arg1.field3624;
        }
        if (class711.field9869 && (client.method1833(arg1).field3291 != 0 || arg1.field3655 == 0)) {
            if (arg1.field3714 < 5 && arg1.field3617 < 5) {
                arg1.field3617 = 5;
                arg1.field3714 = 5;
            } else {
                if (arg1.field3617 <= 0) {
                    arg1.field3617 = 5;
                }
                if (arg1.field3714 <= 0) {
                    arg1.field3714 = 5;
                }
            }
        }
        if (class360.field4657 == arg1.field3715) {
            class223.field2979 = arg1;
        }
        if (arg3 && arg1.field3770 != null && arg1.field3617 != var5 || arg1.field3714 != var6) {
            class694 var7 = new class694();
            var7.field9645 = arg1.field3770;
            var7.field9635 = arg1;
            class129.field1834.method3671(var7, false);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)V")
    public static void method2277(byte arg0) {
        field5176 = null;
        if (arg0 <= 67) {
            method2277((byte) 79);
        }
    }
}
