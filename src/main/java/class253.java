import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mca")
public class class253 {

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "I")
    public int field4011;

    @OriginalMember(owner = "client!mca", name = "b", descriptor = "I")
    public static int field4012;

    @OriginalMember(owner = "client!mca", name = "c", descriptor = "I")
    public int field4013;

    @OriginalMember(owner = "client!mca", name = "d", descriptor = "I")
    public static int field4014;

    @OriginalMember(owner = "client!mca", name = "e", descriptor = "I")
    public static int field4015;

    @OriginalMember(owner = "client!mca", name = "f", descriptor = "I")
    public int field4016;

    @OriginalMember(owner = "client!mca", name = "g", descriptor = "I")
    public int field4017;

    @OriginalMember(owner = "client!mca", name = "h", descriptor = "I")
    public int field4018;

    @OriginalMember(owner = "client!mca", name = "i", descriptor = "I")
    public int field4019;

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(IIIIIBLkn;)Z")
    public static final boolean method1720(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, class516 arg6) {
        field4014++;
        if (!class432.field6336 || !class199.field3402) {
            return false;
        } else if (class699.field9884 < 100) {
            return false;
        } else if (arg1 == arg2 && arg3 == arg4) {
            if (!class429.method2671(arg0, (byte) -38, arg1, arg4)) {
                return false;
            } else if (class747.method4177((byte) 121, arg6)) {
                class200.field3412++;
                return true;
            } else {
                return false;
            }
        } else if (arg5 > -111) {
            return true;
        } else {
            for (int var7 = arg1; var7 <= arg2; var7++) {
                for (int var8 = arg4; var8 <= arg3; var8++) {
                    if (class158.field2452[arg0][var7][var8] == -class245.field3946) {
                        return false;
                    }
                }
            }
            if (class747.method4177((byte) 121, arg6)) {
                class200.field3412++;
                return true;
            } else {
                return false;
            }
        }
    }
}
