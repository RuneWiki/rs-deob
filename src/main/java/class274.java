import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class274 extends OutputStream {

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "I")
    public static int field3646;

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "I")
    public static int field3647;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
    public static int field3648;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
    public static int field3649;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "I")
    public static int field3650;

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "I")
    public static int field3651;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)V", line = 10)
    public static final void method1664(int arg0, int arg1) {
        if (arg1 == -5) {
            field3651++;
            class184 var2 = class277.method1682(arg0, 2, arg1 ^ 0x6A);
            var2.method1075((byte) -104);
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lug;B)Ljava/lang/String;", line = 24)
    public static final String method1665(class396 arg0, byte arg1) {
        if (arg1 == 24) {
            field3649++;
            return class375.method2215(229068417, arg0, 32767);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Ljk;B)Ljk;", line = 39)
    public static final class450 method1666(class450 arg0, byte arg1) {
        field3648++;
        if (arg0.field6550 != -1) {
            return class406.method2490((byte) -116, arg0.field6550);
        }
        int var2 = -35 % ((arg1 + 67) / 42);
        int var3 = arg0.field6558 >>> 16;
        class74 var4 = new class74(class152.field1989);
        for (class360 var5 = (class360) var4.method434(-122); var5 != null; var5 = (class360) var4.method432(-259)) {
            if (var5.field4886 == var3) {
                return class406.method2490((byte) -116, (int) var5.field6348);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(BIIIII)V", line = 68)
    public static final void method1667(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != -28) {
            method1665(null, (byte) -13);
        }
        if (class319.field4256.field4652 != 0 && arg1 != 0 && class347.field4621 < 50 && arg5 != -1) {
            class40.field429[class347.field4621++] = new class282((byte) 1, arg5, arg1, arg2, arg4, arg3);
        }
        field3647++;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILjk;II)V", line = 87)
    public static final void method1668(int arg0, class450 arg1, int arg2, int arg3) {
        if (arg1.field6551 == 0) {
            arg1.field6601 = arg1.field6645;
        } else if (arg1.field6551 == 1) {
            arg1.field6601 = (arg2 - arg1.field6612) / 2 + arg1.field6645;
        } else if (arg1.field6551 == 2) {
            arg1.field6601 = arg2 - arg1.field6645 - arg1.field6612;
        } else if (arg1.field6551 == 3) {
            arg1.field6601 = arg1.field6645 * arg2 >> 14;
        } else if (arg1.field6551 == 4) {
            arg1.field6601 = (arg2 - arg1.field6612) / 2 + (arg1.field6645 * arg2 >> 14);
        } else {
            arg1.field6601 = arg2 - arg1.field6612 - (arg1.field6645 * arg2 >> 14);
        }
        if (arg1.field6683 == 0) {
            arg1.field6682 = arg1.field6624;
        } else if (arg1.field6683 == 1) {
            arg1.field6682 = (arg3 - arg1.field6573) / 2 + arg1.field6624;
        } else if (arg1.field6683 == 2) {
            arg1.field6682 = arg3 - arg1.field6573 - arg1.field6624;
        } else if (arg1.field6683 == 3) {
            arg1.field6682 = arg1.field6624 * arg3 >> 14;
        } else if (arg1.field6683 == 4) {
            arg1.field6682 = (arg1.field6624 * arg3 >> 14) + (arg3 - arg1.field6573) / 2;
        } else {
            arg1.field6682 = arg3 - arg1.field6573 - (arg1.field6624 * arg3 >> 14);
        }
        int var4 = -43 / ((20 - arg0) / 33);
        field3646++;
        if (!class94.field1134) {
            return;
        }
        if (client.method1253(arg1).field2979 == 0 && arg1.field6686 != 0) {
            return;
        }
        if (arg1.field6601 < 0) {
            arg1.field6601 = 0;
        } else if (arg2 < arg1.field6612 + arg1.field6601) {
            arg1.field6601 = arg2 - arg1.field6612;
        }
        if (arg1.field6682 < 0) {
            arg1.field6682 = 0;
            return;
        }
        if ((arg1.field6682 + arg1.field6573) > arg3) {
            arg1.field6682 = arg3 - arg1.field6573;
            return;
        }
    }

    @OriginalMember(owner = "client!sg", name = "write", descriptor = "(I)V", line = 159)
    public final void write(int arg0) throws IOException {
        field3650++;
        throw new IOException();
    }
}
