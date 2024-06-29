import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class75 {

    @OriginalMember(owner = "client!u", name = "d", descriptor = "Lhg;")
    public static class693 field1062 = new class693(54, -1);

    @OriginalMember(owner = "client!u", name = "e", descriptor = "Lhg;")
    public static class693 field1063 = new class693(50, 2);

    @OriginalMember(owner = "client!u", name = "g", descriptor = "I")
    public static int field1065 = -1;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "I")
    public static int field1060;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "I")
    public static int field1061;

    @OriginalMember(owner = "client!u", name = "f", descriptor = "Lnd;")
    public static class547 field1064;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIIII)V", line = 5)
    public static final void method673(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (class748.field10451.field10434.method4186((byte) 117) != 0 && arg0 != 0 && class3.field26 < 50 && arg2 != -1) {
            class742.field10360[class3.field26++] = new class268((byte) 1, arg2, arg0, arg3, arg1, 0, arg4, null);
        }
        if (arg5 != 0) {
            method675(27);
        }
        field1060++;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIIIIIIB)V", line = 27)
    public static final void method674(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8) {
        field1061++;
        if (arg8 == -70) {
            class694.method3884(false, arg2, 0, arg6, arg0, arg5, arg1, arg4, arg3, arg7);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)[I", line = 40)
    public static final int[] method675(int arg0) {
        field1059++;
        return arg0 == 0 ? new int[] { class656.field9123, class235.field3069, class469.field6293 } : null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V", line = 52)
    public static void method676(byte arg0) {
        field1063 = null;
        if (arg0 < -64) {
            field1064 = null;
            field1062 = null;
        }
    }
}
