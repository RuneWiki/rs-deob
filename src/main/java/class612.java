import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dca")
public class class612 {

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "I")
    public static int field8819;

    @OriginalMember(owner = "client!dca", name = "b", descriptor = "I")
    public static int field8820;

    @OriginalMember(owner = "client!dca", name = "e", descriptor = "I")
    public static int field8823;

    @OriginalMember(owner = "client!dca", name = "f", descriptor = "I")
    public static int field8824;

    @OriginalMember(owner = "client!dca", name = "c", descriptor = "Lf;")
    public static class256 field8821;

    @OriginalMember(owner = "client!dca", name = "g", descriptor = "Lf;")
    public static class256 field8825;

    @OriginalMember(owner = "client!dca", name = "d", descriptor = "[Lut;")
    public static class616[] field8822;

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(ZII)Z", line = 5)
    public static final boolean method3483(boolean arg0, int arg1, int arg2) {
        field8819++;
        if (arg0) {
            return false;
        } else {
            return (arg1 & 0x400) != 0;
        }
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(IB)Z", line = 18)
    public static final boolean method3484(int arg0, byte arg1) {
        int var2 = 56 % ((-arg1 - 45) / 44);
        class298.field4387 = arg0 + 1 & 0xFFFF;
        field8824++;
        class538.field7907 = true;
        return true;
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(I)V", line = 33)
    public static void method3485(int arg0) {
        field8821 = null;
        field8825 = null;
        field8822 = null;
        if (arg0 != -1) {
            method3484(39, (byte) -98);
        }
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(IIIBII)V", line = 50)
    public static final void method3486(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        if (class335.field4872.field9495 != 0 && arg5 != 0 && class380.field5732 < 50 && arg1 != -1) {
            class141.field2038[class380.field5732++] = new class268((byte) 1, arg1, arg5, arg4, arg0, 0, arg2, null);
        }
        field8823++;
        if (arg3 > -96) {
            field8820 = 107;
        }
    }
}
