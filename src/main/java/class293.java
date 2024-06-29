import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class293 {

    @OriginalMember(owner = "client!c", name = "c", descriptor = "Lqh;")
    public static class287 field5025 = null;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "I")
    public static int field5023 = 0;

    @OriginalMember(owner = "client!c", name = "o", descriptor = "Lve;")
    private static class255 field5037 = class87.method607(86, "Loaded wordpack");

    @OriginalMember(owner = "client!c", name = "n", descriptor = "[I")
    public static int[] field5036 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!c", name = "e", descriptor = "Lve;")
    public static class255 field5027 = field5037;

    @OriginalMember(owner = "client!c", name = "p", descriptor = "Lve;")
    public static class255 field5038 = class87.method607(122, "<col=ff9040>");

    @OriginalMember(owner = "client!c", name = "b", descriptor = "I")
    public static int field5024;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "I")
    public static int field5026;

    @OriginalMember(owner = "client!c", name = "f", descriptor = "I")
    public static int field5028;

    @OriginalMember(owner = "client!c", name = "g", descriptor = "I")
    public int field5029;

    @OriginalMember(owner = "client!c", name = "j", descriptor = "I")
    public int field5032;

    @OriginalMember(owner = "client!c", name = "l", descriptor = "I")
    public int field5034;

    @OriginalMember(owner = "client!c", name = "m", descriptor = "I")
    public int field5035;

    @OriginalMember(owner = "client!c", name = "r", descriptor = "I")
    public static int field5040;

    @OriginalMember(owner = "client!c", name = "h", descriptor = "J")
    public long field5030;

    @OriginalMember(owner = "client!c", name = "i", descriptor = "Lme;")
    public class177 field5031;

    @OriginalMember(owner = "client!c", name = "k", descriptor = "Lme;")
    public class177 field5033;

    @OriginalMember(owner = "client!c", name = "q", descriptor = "Lme;")
    public class177 field5039;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ZLqi;Lrg;Lrg;Z)V", line = 8)
    public static final void method2069(boolean arg0, class290 arg1, class88 arg2, class88 arg3, boolean arg4) {
        field5040++;
        class32.field513 = arg3;
        if (arg4) {
            method2069(true, (class290) null, (class88) null, (class88) null, true);
        }
        class115.field1963 = arg2;
        class4.field63 = arg0;
        int var5 = class32.field513.method638(-84) - 1;
        class137.field2289 = class32.field513.method617(17374, var5) + var5 * 256;
        class17.field260 = arg1;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lrg;I)V", line = 28)
    public static final void method2070(class88 arg0, int arg1) {
        if (arg1 != 0) {
            method2070((class88) null, -116);
        }
        class67.field996 = arg0;
        field5024++;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(III)V", line = 43)
    public static final void method2071(int arg0, int arg1, int arg2) {
        field5026++;
        class53 var3 = class303.method2112(-1155040160, arg1, arg0);
        var3.method325((byte) 113);
        var3.field824 = arg2;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(B)V", line = 77)
    public static void method2072(byte arg0) {
        field5037 = null;
        if (arg0 < 121) {
            field5027 = (class255) null;
        }
        field5038 = null;
        field5036 = null;
        field5027 = null;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIIIIII)V", line = 104)
    public static final void method2073(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field5028++;
        if (class125.field2082 <= arg1 && arg1 <= class30.field473 && arg6 >= class125.field2082 && class30.field473 >= arg6 && class125.field2082 <= arg4 && arg4 <= class30.field473 && arg9 >= class125.field2082 && class30.field473 >= arg9 && class261.field4427 <= arg5 && arg5 <= class11.field156 && arg8 >= class261.field4427 && class11.field156 >= arg8 && arg2 >= class261.field4427 && class11.field156 >= arg2 && arg7 >= class261.field4427 && class11.field156 >= arg7) {
            class248.method1712(arg6, arg2, arg1, -16032, arg3, arg4, arg7, arg5, arg8, arg9);
        } else {
            class18.method94(arg6, arg7, arg1, arg9, arg3, arg8, (byte) 72, arg4, arg2, arg5);
        }
        if (arg0 != -4630) {
            field5037 = (class255) null;
        }
    }
}
