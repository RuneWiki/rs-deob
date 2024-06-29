import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class507 extends class472 {

    @OriginalMember(owner = "client!ba", name = "B", descriptor = "[B")
    public byte[] field7376;

    @OriginalMember(owner = "client!ba", name = "E", descriptor = "I")
    public static int field7379;

    @OriginalMember(owner = "client!ba", name = "C", descriptor = "Lwn;")
    public static class177 field7377;

    @OriginalMember(owner = "client!ba", name = "D", descriptor = "[I")
    public static int[] field7378;

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "([B)V", line = 5)
    public class507(byte[] arg0) {
        this.field7376 = arg0;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIIILtt;)Lf;", line = 14)
    public static final class412 method3020(int arg0, int arg1, int arg2, int arg3, int arg4, class249 arg5) {
        field7379++;
        if (arg2 != 34037) {
            return null;
        } else if (!arg5.field3967 && (!class380.method2416(arg2 ^ 0xFFFF7B0A, arg3) || !class380.method2416(-1, arg1))) {
            return arg5.field3987 ? new class412(arg5, 34037, arg0, arg4, arg3, arg1, true) : new class412(arg5, arg0, arg4, arg3, arg1, class46.method307((byte) -43, arg3), class46.method307((byte) -83, arg1), true);
        } else {
            return new class412(arg5, 3553, arg0, arg4, arg3, arg1, true);
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V", line = 33)
    public static void method3021(int arg0) {
        if (arg0 > 106) {
            field7377 = null;
            field7378 = null;
        }
    }
}
