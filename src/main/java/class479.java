import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public class class479 {

    @OriginalMember(owner = "client!hv", name = "c", descriptor = "[I")
    public static int[] field6802 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "I")
    public static int field6801 = 0;

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "I")
    public static int field6800;

    @OriginalMember(owner = "client!hv", name = "d", descriptor = "I")
    public static int field6803;

    @OriginalMember(owner = "client!hv", name = "e", descriptor = "I")
    public static int field6804;

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(IIB)V")
    public static final void method2802(int arg0, int arg1, byte arg2) {
        if (arg2 <= 50) {
            field6802 = null;
        }
        field6800++;
        class270.field4052++;
        class135 var3 = class688.method3794(class368.field5272, class583.field8198, (byte) 38);
        var3.field1978.method3868(arg0, -318419336);
        var3.field1978.method3865(-1449382360, arg1);
        class19.method223(var3, 0);
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(IB)Lff;")
    public static final class9 method2803(int arg0, byte arg1) {
        field6804++;
        if (arg1 < 104) {
            return null;
        }
        class9[] var2 = class487.method2832((byte) 39);
        for (int var3 = 0; var3 < var2.length; var3++) {
            if (var2[var3].field91 == arg0) {
                return var2[var3];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(I)V")
    public static void method2804(int arg0) {
        if (arg0 == 170) {
            field6802 = null;
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(IZ)V")
    public static final void method2805(int arg0, boolean arg1) {
        if (arg1) {
            field6801 = 15;
        }
        field6803++;
        class677.field9581 = arg0;
        class485.field6902.method2285((byte) -128);
    }
}
