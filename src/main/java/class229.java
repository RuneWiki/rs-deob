import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public class class229 {

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "[I")
    public static int[] field2964 = new int[14];

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!rt", name = "c", descriptor = "I")
    public static int field2965;

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(IBIIIII)V")
    public static final void method1361(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2965++;
        if (arg1 != 7) {
            field2964 = null;
        }
        for (class267 var7 = (class267) class608.field8493.method113((byte) 15); var7 != null; var7 = (class267) class608.field8493.method119(false)) {
            if (var7.field3536 <= class406.field5732) {
                var7.method975((byte) 5);
            } else {
                class616.method3473(arg4, var7.field3538, (var7.field3532 << 9) + 256, arg1 ^ 0xFFFFFFF8, arg5, var7.field3540 * 2, (var7.field3541 << 9) + 256, arg3 >> 1, arg6 >> 1);
                class214.field2575.method479(var7.field3533 | 0xFF000000, var7.field3539, arg0 + class118.field1560[0], 0, (byte) -67, arg2 + class118.field1560[1]);
            }
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(I)V")
    public static void method1362(int arg0) {
        if (arg0 != -1) {
            method1361(110, (byte) -22, 5, 54, 26, 54, 115);
        }
        field2964 = null;
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(II)V")
    public static final void method1363(int arg0, int arg1) {
        field2963++;
        class252 var2 = class150.method916(arg1, arg0 - 72, 8);
        var2.method1497(arg0 + arg0);
    }
}
