import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eha")
public class class89 {

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "Lag;")
    public static class682 field1072 = new class682(7500);

    @OriginalMember(owner = "client!eha", name = "c", descriptor = "Lqfa;")
    public static class98 field1074 = new class98(89, -1);

    @OriginalMember(owner = "client!eha", name = "b", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "(B)V", line = 8)
    public static void method677(byte arg0) {
        field1072 = null;
        int var1 = 8 / ((arg0 + 41) / 37);
        field1074 = null;
    }

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "(ZIIIIII)V", line = 23)
    public static final void method678(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1073++;
        class596 var7 = (class596) class251.field3369.method2301(-31182);
        if (arg0) {
            method677((byte) 50);
        }
        while (var7 != null) {
            if (class740.field10285 >= var7.field8379) {
                var7.method3646((byte) -123);
            } else {
                class32.method186((var7.field8380 << 9) + 256, var7.field8378 * 2, var7.field8382, (byte) -60, arg1, arg3 >> 1, arg2 >> 1, arg6, (var7.field8377 << 9) + 256);
                class505.field7241.method499(arg4 + class278.field3936[1], class278.field3936[0] + arg5, 0, false, var7.field8375 | 0xFF000000, var7.field8381);
            }
            var7 = (class596) class251.field3369.method2310(67);
        }
    }
}
