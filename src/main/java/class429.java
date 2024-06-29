import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class429 extends class498 {

    @OriginalMember(owner = "client!nk", name = "l", descriptor = "Lkr;")
    public static class602 field6010 = new class602(18, 3);

    @OriginalMember(owner = "client!nk", name = "i", descriptor = "I")
    public static int field6007;

    @OriginalMember(owner = "client!nk", name = "j", descriptor = "I")
    public int field6008;

    @OriginalMember(owner = "client!nk", name = "k", descriptor = "I")
    public int field6009;

    @OriginalMember(owner = "client!nk", name = "m", descriptor = "I")
    public int field6011;

    @OriginalMember(owner = "client!nk", name = "o", descriptor = "I")
    public static int field6013;

    @OriginalMember(owner = "client!nk", name = "p", descriptor = "I")
    public int field6014;

    @OriginalMember(owner = "client!nk", name = "n", descriptor = "Lni;")
    public class515 field6012;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IBI)Z")
    public static final boolean method2660(int arg0, byte arg1, int arg2) {
        if (arg1 >= -34) {
            method2662(-125, 95, false, -72, -75);
        }
        field6013++;
        return (arg0 & 0x22) != 0;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)V")
    public static void method2661(byte arg0) {
        if (arg0 != -113) {
            method2661((byte) -53);
        }
        field6010 = null;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIZII)V")
    public static final void method2662(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        int var5 = -86 / ((arg4 - 38) / 39);
        if (class332.field4707.field4789.method963(0) == 0) {
            class507.method3048(false, 64);
        } else {
            class357.field5129 = class332.field4707.field4789.method963(0);
            class393.method2459(0, true, 1);
        }
        field6007++;
        class444.field6170 = arg2;
        class176.field2417 = arg1;
        class57.field798 = arg3;
        class461.method2822(arg0);
    }
}
