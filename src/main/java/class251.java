import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class251 extends class32 {

    @OriginalMember(owner = "client!sa", name = "o", descriptor = "Loh;")
    private static class263 field4367 = class253.method1681(-123, "Checking for updates )2 ");

    @OriginalMember(owner = "client!sa", name = "r", descriptor = "Loh;")
    public static class263 field4370 = class253.method1681(-127, "<col=80ff00>");

    @OriginalMember(owner = "client!sa", name = "k", descriptor = "Loh;")
    public static class263 field4363 = field4367;

    @OriginalMember(owner = "client!sa", name = "l", descriptor = "[I")
    public static int[] field4364 = new int[4096];

    @OriginalMember(owner = "client!sa", name = "x", descriptor = "Lng;")
    public static class74 field4376 = null;

    @OriginalMember(owner = "client!sa", name = "s", descriptor = "Loh;")
    public static class263 field4371 = class253.method1681(-122, "Fertigkeit: ");

    @OriginalMember(owner = "client!sa", name = "u", descriptor = "Loh;")
    private static class263 field4373 = class253.method1681(-123, "green:");

    @OriginalMember(owner = "client!sa", name = "q", descriptor = "[I")
    public static int[] field4369 = new int[25];

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "Loh;")
    public static class263 field4362 = field4373;

    @OriginalMember(owner = "client!sa", name = "y", descriptor = "Loh;")
    public static class263 field4377 = field4373;

    @OriginalMember(owner = "client!sa", name = "n", descriptor = "I")
    public static int field4366;

    @OriginalMember(owner = "client!sa", name = "t", descriptor = "I")
    public static int field4372;

    @OriginalMember(owner = "client!sa", name = "w", descriptor = "I")
    public static int field4375;

    @OriginalMember(owner = "client!sa", name = "p", descriptor = "Lib;")
    public static class151 field4368;

    @OriginalMember(owner = "client!sa", name = "m", descriptor = "Lue;")
    public static class86 field4365;

    @OriginalMember(owner = "client!sa", name = "v", descriptor = "[I")
    public static int[] field4374;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V")
    public static void method1673(byte arg0) {
        int var1 = 65 % ((-arg0 - 1) / 55);
        field4365 = null;
        field4369 = null;
        field4370 = null;
        field4373 = null;
        field4377 = null;
        field4376 = null;
        field4362 = null;
        field4364 = null;
        field4371 = null;
        field4363 = null;
        field4367 = null;
        field4374 = null;
        field4368 = null;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1674(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class51.field1099 <= arg0 && arg4 <= class198.field3587 && class11.field249 <= arg6 && class276.field4831 >= arg1) {
            class43.method262(arg4, arg6, arg3, 57, arg1, arg2, arg0, arg7);
        } else {
            class83.method560(arg3, 0, arg0, arg1, arg4, arg6, arg2, arg7);
        }
        if (arg5 <= -16) {
            field4366++;
        }
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(B)V")
    public static final void method1675(byte arg0) {
        class103.field1958.method45((byte) -111);
        for (int var1 = 0; var1 < 32; var1++) {
            class12.field332[var1] = 0L;
        }
        field4375++;
        int var2 = 0;
        if (arg0 != 115) {
            return;
        }
        while (var2 < 32) {
            class190.field3415[var2] = 0L;
            var2++;
        }
        class29.field736 = 0;
    }
}
