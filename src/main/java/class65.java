import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class65 {

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "Ldc;")
    public static class37 field1171 = class185.method1233((byte) 86, "<col=ffffff> )4 ");

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "Ldc;")
    private static class37 field1178 = class185.method1233((byte) 86, " has logged in)3");

    @OriginalMember(owner = "client!fj", name = "i", descriptor = "Ldc;")
    public static class37 field1179 = field1178;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "I")
    public static int field1172 = 99;

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "I")
    public static int field1174;

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "I")
    public static int field1175;

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "I")
    public static int field1177;

    @OriginalMember(owner = "client!fj", name = "j", descriptor = "I")
    public static int field1180;

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "Lgi;")
    public static class74 field1176;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "[I")
    public static int[] field1173;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Ldc;Ldc;Ldc;B)V")
    public static final void method478(class37 arg0, class37 arg1, class37 arg2, byte arg3) {
        class19.field322 = arg1;
        field1174++;
        if (arg3 == 98) {
            class19.field321 = arg2;
            class19.field324 = arg0;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V")
    public static void method479(int arg0) {
        field1171 = null;
        field1179 = null;
        field1176 = null;
        field1178 = null;
        field1173 = null;
        if (arg0 < 53) {
            field1179 = null;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIZIBLdj;I)V")
    public static final void method480(int arg0, int arg1, boolean arg2, int arg3, byte arg4, class44 arg5, int arg6) {
        long var7 = (long) ((arg6 << 16) + arg3);
        class231 var9 = (class231) class20.field331.method1047((byte) -127, var7);
        field1175++;
        if (var9 != null) {
            return;
        }
        class231 var10 = (class231) class99.field1722.method1047((byte) 126, var7);
        if (var10 != null) {
            return;
        }
        class231 var11 = (class231) class68.field1230.method1047((byte) 97, var7);
        if (var11 == null) {
            if (!arg2) {
                class231 var12 = (class231) class204.field3780.method1047((byte) 97, var7);
                if (var12 != null) {
                    return;
                }
            }
            if (arg1 != 6024) {
                method481(31, -84, -77, -41, (byte) 69, 5, 61, 85);
            }
            class231 var13 = new class231();
            var13.field4231 = arg5;
            var13.field4229 = arg4;
            var13.field4230 = arg0;
            if (arg2) {
                class20.field331.method1044(var13, (byte) -14, var7);
                class28.field506++;
            } else {
                class245.field4483.method465(var13, (byte) 92);
                class68.field1230.method1044(var13, (byte) -14, var7);
                class147.field2798++;
            }
        } else if (arg2) {
            var11.method533(false);
            class20.field331.method1044(var11, (byte) -14, var7);
            class28.field506++;
            class147.field2798--;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIIIBIII)V")
    public static final void method481(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        field1177++;
        if (arg1 == arg3) {
            class237.method1532(arg7, arg6, arg2, arg5, arg0, true, arg3);
        } else if (arg4 == 120) {
            if (arg0 - arg3 >= class29.field536 && arg0 + arg3 <= class82.field1458 && arg6 - arg1 >= class198.field3697 && class199.field3712 >= arg1 + arg6) {
                class121.method830(arg2, true, arg0, arg7, arg3, arg6, arg5, arg1);
            } else {
                class215.method1417(arg6, arg1, arg5, arg3, arg2, -13805, arg0, arg7);
            }
        }
    }
}
