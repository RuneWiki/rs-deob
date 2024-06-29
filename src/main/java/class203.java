import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class203 {

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "Ljava/lang/String;")
    public static String field3062 = "Select";

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "I")
    public static int field3065 = 2;

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "S")
    public static short field3063 = 205;

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "Lnk;")
    public static class2 field3066 = new class2();

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "Lnk;")
    public static class2 field3069 = new class2();

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "I")
    public static int field3061;

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "I")
    public static int field3064;

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "I")
    public static int field3067;

    @OriginalMember(owner = "client!bj", name = "j", descriptor = "I")
    public static int field3070;

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "Ldd;")
    public static class3 field3068;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Ljh;I)V", line = 26)
    public static final void method1365(class207 arg0, int arg1) {
        int var2 = -112 / ((arg1 - 9) / 36);
        field3067++;
        class207 var3 = class80.method551(0, arg0);
        int var4;
        int var5;
        if (var3 == null) {
            var4 = class334.field5203;
            var5 = class174.field2644;
        } else {
            var4 = var3.field3169;
            var5 = var3.field3239;
        }
        class322.method2180(var5, arg0, false, 5, var4);
        class158.method1098(var4, var5, -22245, arg0);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V", line = 57)
    public static void method1366(int arg0) {
        if (arg0 != 2) {
            method1365((class207) null, 121);
        }
        field3066 = null;
        field3068 = null;
        field3069 = null;
        field3062 = null;
    }
}
