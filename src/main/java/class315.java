import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hfa")
public class class315 {

    @OriginalMember(owner = "client!hfa", name = "d", descriptor = "Lqda;")
    public static class105 field4498 = new class105(4);

    @OriginalMember(owner = "client!hfa", name = "g", descriptor = "I")
    public static int field4501 = 0;

    @OriginalMember(owner = "client!hfa", name = "h", descriptor = "I")
    public static int field4502 = 100;

    @OriginalMember(owner = "client!hfa", name = "f", descriptor = "I")
    public static int field4500;

    @OriginalMember(owner = "client!hfa", name = "b", descriptor = "[B")
    public byte[] field4496;

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "[S")
    public short[] field4495;

    @OriginalMember(owner = "client!hfa", name = "c", descriptor = "[S")
    public short[] field4497;

    @OriginalMember(owner = "client!hfa", name = "e", descriptor = "[S")
    public short[] field4499;

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(I)V", line = 5)
    public static void method1923(int arg0) {
        if (arg0 == 23132) {
            field4498 = null;
        }
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "([BIIIIII)Z", line = 15)
    public static final boolean method1924(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 != 1) {
            method1924(null, 107, -11, 44, -64, 125, 80);
        }
        field4500++;
        int var7 = arg2 % arg3;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg3 - var7;
        }
        int var9 = -((arg3 + arg6 - 1) / arg3);
        int var10 = -((arg3 + arg2 - 1) / arg3);
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg0[arg1] == 0) {
                    return true;
                }
                arg1 += arg3;
            }
            int var13 = arg1 - var8;
            if (arg0[var13 - 1] == 0) {
                return true;
            }
            arg1 = arg5 + var13;
        }
        return false;
    }
}
