import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class526 {

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "I")
    public static int field7241 = 1338;

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "I")
    public static int field7242;

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "I")
    public static int field7243;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(BII)Z", line = 6)
    public static final boolean method3130(byte arg0, int arg1, int arg2) {
        if (arg0 > 0) {
            return false;
        } else {
            field7242++;
            return class330.method2078(-36, arg2, arg1) | (arg2 & 0x70000) != 0 || class43.method345(arg1, arg2, 1024);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(III[BIZ)V", line = 18)
    public static final void method3131(int arg0, int arg1, int arg2, byte[] arg3, int arg4, boolean arg5) {
        if (arg5) {
            field7241 = -41;
        }
        field7243++;
        if (arg2 >= arg4) {
            return;
        }
        int var6 = arg1 + arg2;
        int var7 = arg4 - arg2 >> 2;
        while (true) {
            var7--;
            if (var7 < 0) {
                int var8 = arg4 - arg2 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        return;
                    }
                    arg3[var6++] = 1;
                }
            }
            arg3[var6++] = 1;
            arg3[var6++] = 1;
            arg3[var6++] = 1;
            arg3[var6++] = 1;
        }
    }
}
