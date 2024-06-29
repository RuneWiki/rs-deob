import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class485 extends class448 {

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "Lgq;")
    public class536 field7119;

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "[I")
    public static int[] field7116 = new int[5];

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "I")
    public static int field7118 = 0;

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "I")
    public static int field7117 = 0;

    @OriginalMember(owner = "client!ib", name = "n", descriptor = "[Ljava/lang/String;")
    public static String[] field7122 = new String[200];

    @OriginalMember(owner = "client!ib", name = "l", descriptor = "I")
    public static int field7120;

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "Lpd;")
    public static class436 field7115;

    @OriginalMember(owner = "client!ib", name = "m", descriptor = "Lqs;")
    public static class496 field7121;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V", line = 9)
    public static void method2839(int arg0) {
        field7122 = null;
        field7115 = null;
        field7116 = null;
        int var1 = -54 % ((arg0 - 5) / 55);
        field7121 = null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIILih;I)Lgq;", line = 21)
    public static final class536 method2840(int arg0, int arg1, int arg2, int arg3, class214 arg4, int arg5) {
        field7120++;
        if (arg5 != 28839) {
            field7118 = -43;
        }
        if (!arg4.field3739 && (!class137.method1029(arg2, false) || !class137.method1029(arg1, false))) {
            return arg4.field3666 ? new class536(arg4, 34037, arg3, arg0, arg2, arg1, true) : new class536(arg4, arg3, arg0, arg2, arg1, class206.method1351(arg2, 123), class206.method1351(arg1, 113), true);
        } else {
            return new class536(arg4, 3553, arg3, arg0, arg2, arg1, true);
        }
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Lih;II[B)V", line = 48)
    public class485(class214 arg0, int arg1, int arg2, byte[] arg3) {
        this.field7119 = class330.method2075(arg3, arg1, arg2, false, arg0, 6406, 6406, (byte) -119);
        this.field7119.method1262(-1, false, false);
    }
}
