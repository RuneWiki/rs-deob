import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pga")
public class class581 {

    @OriginalMember(owner = "client!pga", name = "b", descriptor = "I")
    public static int field8125;

    @OriginalMember(owner = "client!pga", name = "c", descriptor = "I")
    public static int field8126;

    @OriginalMember(owner = "client!pga", name = "d", descriptor = "I")
    public static int field8127;

    @OriginalMember(owner = "client!pga", name = "e", descriptor = "I")
    public static int field8128;

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "J")
    public static long field8124;

    @OriginalMember(owner = "client!pga", name = "f", descriptor = "Lvfa;")
    public static class264 field8129;

    @OriginalMember(owner = "client!pga", name = "h", descriptor = "Loj;")
    public static class543 field8131;

    @OriginalMember(owner = "client!pga", name = "g", descriptor = "Lpl;")
    public static class612 field8130;

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(IZ)V", line = 22)
    public static final void method3204(int arg0, boolean arg1) {
        field8128++;
        class592 var2 = class61.method371(3, arg0, (byte) 97);
        if (arg1) {
            var2.method3253(0);
        }
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(II)Z", line = 60)
    public static final boolean method3205(int arg0, int arg1) {
        if (arg0 != -66) {
            method3204(73, false);
        }
        field8126++;
        return arg1 == 7 || arg1 == 8 || arg1 == 9;
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(IZLqj;I[BIII)Lar;", line = 88)
    public static final class4 method3206(int arg0, boolean arg1, class548 arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7) {
        field8125++;
        if (arg3 <= 86) {
            return null;
        } else if (!arg2.field7586 && (!class4.method36(arg5, (byte) 98) || !class4.method36(arg0, (byte) 98))) {
            return arg2.field7540 ? new class4(arg2, 34037, arg7, arg5, arg0, arg1, arg4, arg6) : new class4(arg2, arg7, arg5, arg0, class391.method2101(arg5, 128), class391.method2101(arg0, 128), arg4, arg6);
        } else {
            return new class4(arg2, 3553, arg7, arg5, arg0, arg1, arg4, arg6);
        }
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(I)V", line = 107)
    public static void method3207(int arg0) {
        field8131 = null;
        field8130 = null;
        field8129 = null;
        if (arg0 != -26723) {
            field8131 = null;
        }
    }
}
