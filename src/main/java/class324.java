import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public abstract class class324 {

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "I")
    public static int field5154 = 0;

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "Ljava/lang/String;")
    public static String field5159 = "Opened title screen";

    @OriginalMember(owner = "client!rl", name = "g", descriptor = "Ljava/lang/String;")
    public static String field5160 = null;

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "I")
    public static int field5156;

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "I")
    public static int field5157;

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "I")
    public static int field5158;

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "Lwc;")
    public static class185 field5155;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIII)I", line = 10)
    public static final int method2286(int arg0, int arg1, int arg2, int arg3) {
        field5158++;
        int var4 = arg3 & 0x3;
        if (var4 == 0) {
            return arg1;
        }
        if (arg2 != -27072) {
            method2288(false);
        }
        if (var4 == 1) {
            return arg0;
        } else if (var4 == 2) {
            return 1023 - arg1;
        } else {
            return 1023 - arg0;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIII)V", line = 46)
    public static final void method2287(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 >= -39) {
            method2286(-42, -26, -38, 117);
        }
        class296.field4758 = arg4;
        class273.field4522 = arg3;
        field5156++;
        class74.field1269 = arg0;
        class355.field5640 = arg1;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Z)V", line = 61)
    public static void method2288(boolean arg0) {
        field5155 = null;
        if (!arg0) {
            method2286(-40, -100, 124, -67);
        }
        field5159 = null;
        field5160 = null;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(ILik;)Lik;")
    public abstract class54 method176(int arg0, class54 arg1);
}
