import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bga")
public class class327 extends class98 {

    @OriginalMember(owner = "client!bga", name = "J", descriptor = "Lga;")
    public class370 field5082;

    @OriginalMember(owner = "client!bga", name = "H", descriptor = "[I")
    public static int[] field5080 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!bga", name = "G", descriptor = "F")
    public static float field5079;

    @OriginalMember(owner = "client!bga", name = "E", descriptor = "I")
    public static int field5077;

    @OriginalMember(owner = "client!bga", name = "F", descriptor = "I")
    public static int field5078;

    @OriginalMember(owner = "client!bga", name = "I", descriptor = "I")
    public static int field5081;

    @OriginalMember(owner = "client!bga", name = "K", descriptor = "I")
    public static int field5083;

    @OriginalMember(owner = "client!bga", name = "L", descriptor = "I")
    public static int field5084;

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(I)V")
    public static void method2202(int arg0) {
        field5080 = null;
        if (arg0 != 126) {
            method2203(null, (byte) 8, 13, 116);
        }
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(Lpt;BII)V")
    public static final void method2203(class491 arg0, byte arg1, int arg2, int arg3) {
        class224.field3610[arg2][arg3] = arg0;
        if (arg1 >= 35) {
            field5081++;
        }
    }

    @OriginalMember(owner = "client!bga", name = "b", descriptor = "(III)V")
    public static final void method2204(int arg0, int arg1, int arg2) {
        field5083++;
        class413 var3 = class674.method3852(13, arg2, 122);
        var3.method2633(arg1);
        var3.field6337 = arg0;
    }

    @OriginalMember(owner = "client!bga", name = "c", descriptor = "(III)I")
    public static final int method2205(int arg0, int arg1, int arg2) {
        int var3 = (arg2 & 0x7F) * arg0 >> 7;
        field5077++;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        if (arg1 >= -64) {
            field5079 = 1.5501728F;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(IB)Z")
    public static final boolean method2206(int arg0, byte arg1) {
        field5078++;
        if (arg1 < 68) {
            return false;
        } else {
            return arg0 == 0 || arg0 == 1 || arg0 == 2;
        }
    }

    @OriginalMember(owner = "client!bga", name = "<init>", descriptor = "(Lga;)V")
    public class327(class370 arg0) {
        this.field5082 = arg0;
    }
}
