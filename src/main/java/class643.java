import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jia")
public class class643 {

    @OriginalMember(owner = "client!jia", name = "e", descriptor = "Ljb;")
    public static class519 field8654 = new class519(44, -1);

    @OriginalMember(owner = "client!jia", name = "j", descriptor = "I")
    public static int field8659 = 0;

    @OriginalMember(owner = "client!jia", name = "k", descriptor = "Z")
    public static boolean field8660 = false;

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "I")
    public static int field8650;

    @OriginalMember(owner = "client!jia", name = "f", descriptor = "I")
    public static int field8655;

    @OriginalMember(owner = "client!jia", name = "g", descriptor = "I")
    public static int field8656;

    @OriginalMember(owner = "client!jia", name = "h", descriptor = "Leb;")
    public static class651 field8657;

    @OriginalMember(owner = "client!jia", name = "b", descriptor = "[B")
    public byte[] field8651;

    @OriginalMember(owner = "client!jia", name = "c", descriptor = "[S")
    public short[] field8652;

    @OriginalMember(owner = "client!jia", name = "d", descriptor = "[S")
    public short[] field8653;

    @OriginalMember(owner = "client!jia", name = "i", descriptor = "[S")
    public short[] field8658;

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(B)I", line = 5)
    public static final int method3537(byte arg0) {
        if (arg0 >= -111) {
            return -85;
        } else {
            field8656++;
            return class436.field6312 == null ? 0 : class436.field6312.length * 2;
        }
    }

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(I)V", line = 24)
    public static final void method3538(int arg0) {
        int var1 = 64 / ((arg0 + 82) / 35);
        field8650++;
        class738.field10011.method3103(-11294);
    }

    @OriginalMember(owner = "client!jia", name = "b", descriptor = "(I)V", line = 34)
    public static void method3539(int arg0) {
        field8657 = null;
        if (arg0 != 15433) {
            method3537((byte) -127);
        }
        field8654 = null;
    }

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(IIII[BII)Z", line = 46)
    public static final boolean method3540(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        field8655++;
        int var7 = arg5 % arg6;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg6 - var7;
        }
        if (arg3 < 38) {
            method3537((byte) 112);
        }
        int var9 = -((arg1 + arg6 - 1) / arg6);
        int var10 = -((arg5 + arg6 - 1) / arg6);
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg4[arg2] == 0) {
                    return true;
                }
                arg2 += arg6;
            }
            int var13 = arg2 - var8;
            if (arg4[var13 - 1] == 0) {
                return true;
            }
            arg2 = arg0 + var13;
        }
        return false;
    }
}
