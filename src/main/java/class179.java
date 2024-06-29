import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class179 {

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "Lkh;")
    private static class117 field3237 = class224.method1450((byte) -39, "Your profile will be transferred in:");

    @OriginalMember(owner = "client!qd", name = "p", descriptor = "I")
    public static int field3245 = 0;

    @OriginalMember(owner = "client!qd", name = "q", descriptor = "Lkh;")
    private static class117 field3246 = class224.method1450((byte) 119, "white:");

    @OriginalMember(owner = "client!qd", name = "u", descriptor = "Lkh;")
    public static class117 field3250 = field3246;

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "Lkh;")
    public static class117 field3235 = field3246;

    @OriginalMember(owner = "client!qd", name = "r", descriptor = "Lkh;")
    public static class117 field3247 = field3237;

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "Lkh;")
    public static class117 field3234 = class224.method1450((byte) -59, "sich mit einer anderen Welt zu verbinden)3");

    @OriginalMember(owner = "client!qd", name = "s", descriptor = "Lkh;")
    public static class117 field3248 = class224.method1450((byte) -109, "null");

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
    public int field3230;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "I")
    public static int field3233;

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "I")
    public int field3242;

    @OriginalMember(owner = "client!qd", name = "n", descriptor = "I")
    public int field3243;

    @OriginalMember(owner = "client!qd", name = "t", descriptor = "I")
    public int field3249;

    @OriginalMember(owner = "client!qd", name = "o", descriptor = "J")
    public long field3244;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "Lai;")
    public static class10 field3231;

    @OriginalMember(owner = "client!qd", name = "v", descriptor = "Lvb;")
    public static class232 field3251;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "Ldd;")
    public class38 field3232;

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "Ldd;")
    public class38 field3238;

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "Ldd;")
    public class38 field3240;

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "[I")
    public static int[] field3241;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZIIIIII)V")
    public static final void method1239(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 >= class240.field4355 && class146.field2678 >= arg2 && arg5 >= class159.field2910 && class224.field4040 >= arg1) {
            if (arg6 == 1) {
                class38.method331(arg5, -8309, arg4, arg2, arg1, arg3);
            } else {
                class40.method354(arg3, true, arg4, arg6, arg1, arg5, arg2);
            }
        } else if (arg6 == 1) {
            class146.method1051(arg5, (byte) 99, arg4, arg3, arg1, arg2);
        } else {
            class143.method967(arg4, arg1, arg3, (byte) -47, arg5, arg6, arg2);
        }
        if (arg0) {
            field3237 = null;
        }
        field3239++;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V")
    public static void method1240(int arg0) {
        field3250 = null;
        field3237 = null;
        field3251 = null;
        field3234 = null;
        field3247 = null;
        if (arg0 != 18806) {
            field3246 = null;
        }
        field3235 = null;
        field3248 = null;
        field3231 = null;
        field3246 = null;
        field3241 = null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(III)I")
    public static final int method1241(int arg0, int arg1, int arg2) {
        field3236++;
        if (arg0 == -2) {
            return 12345678;
        } else if (arg0 == -1) {
            if (arg2 < 2) {
                arg2 = 2;
            } else if (arg2 > 126) {
                arg2 = 126;
            }
            return arg2;
        } else {
            int var3 = (arg0 & 0x7F) * arg2 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            if (arg1 != 23757) {
                field3251 = null;
            }
            return (arg0 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZLjava/awt/Component;)V")
    public static final void method1242(boolean arg0, Component arg1) {
        field3233++;
        arg1.removeKeyListener(class94.field1719);
        arg1.removeFocusListener(class94.field1719);
        if (!arg0) {
            field3248 = null;
        }
        class240.field4347 = -1;
    }
}
