import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class25 {

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "[I")
    public static int[] field418 = new int[4];

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "I")
    public static volatile int field419 = 0;

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "Lli;")
    public static class185 field420 = null;

    @OriginalMember(owner = "client!hj", name = "l", descriptor = "Lli;")
    public static class185 field426 = class245.method1649(",Mcran)2titre charg-B", -7);

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "Lli;")
    private static class185 field422 = class245.method1649("Continue", 126);

    @OriginalMember(owner = "client!hj", name = "k", descriptor = "Lli;")
    public static class185 field425 = field422;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "I")
    public int field415;

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "I")
    public int field421;

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "I")
    public int field423;

    @OriginalMember(owner = "client!hj", name = "j", descriptor = "I")
    public int field424;

    @OriginalMember(owner = "client!hj", name = "n", descriptor = "I")
    public int field428;

    @OriginalMember(owner = "client!hj", name = "o", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!hj", name = "p", descriptor = "I")
    public int field430;

    @OriginalMember(owner = "client!hj", name = "q", descriptor = "I")
    public int field431;

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "[B")
    public byte[] field417;

    @OriginalMember(owner = "client!hj", name = "m", descriptor = "[B")
    public byte[] field427;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIZII)V")
    public static final void method168(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (arg0 != 25079) {
            field418 = null;
        }
        field429++;
        if (class127.method912(arg4, (byte) -110)) {
            class60.method422((byte) -71, class136.field2557[arg4], -1, arg2, arg1, arg3);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(B)V")
    public static void method169(byte arg0) {
        field425 = null;
        field418 = null;
        if (arg0 >= 10) {
            field422 = null;
            field426 = null;
            field420 = null;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(III)I")
    public static final int method170(int arg0, int arg1, int arg2) {
        int var3 = 25 % ((37 - arg1) / 62);
        int var4 = 1;
        while (arg0 > 1) {
            if ((arg0 & 0x1) != 0) {
                var4 = arg2 * var4;
            }
            arg2 *= arg2;
            arg0 >>= 0x1;
        }
        field416++;
        if (arg0 == 1) {
            return arg2 * var4;
        } else {
            return var4;
        }
    }
}
