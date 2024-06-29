import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class371 {

    @OriginalMember(owner = "client!ns", name = "d", descriptor = "I")
    public static int field5819 = 1403;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "I")
    public static int field5816;

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "I")
    public static int field5818;

    @OriginalMember(owner = "client!ns", name = "e", descriptor = "I")
    public static int field5820;

    @OriginalMember(owner = "client!ns", name = "f", descriptor = "I")
    public static int field5821;

    @OriginalMember(owner = "client!ns", name = "g", descriptor = "I")
    public static int field5822;

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "Ljava/lang/String;")
    public static String field5817;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)V", line = 8)
    public static void method2447(int arg0) {
        if (arg0 <= 51) {
            method2448(31, -85, -31);
        }
        field5817 = null;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(III)V", line = 22)
    public static final void method2448(int arg0, int arg1, int arg2) {
        field5818++;
        class413 var3 = class674.method3852(12, arg1, arg2 + 23103);
        var3.method2633(16777215);
        if (arg2 != -22977) {
            method2447(-67);
        }
        var3.field6337 = arg0;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(BF)F", line = 36)
    public static final float method2449(byte arg0, float arg1) {
        field5816++;
        return arg0 == 39 ? arg1 * arg1 * arg1 * ((arg1 * 6.0F - 15.0F) * arg1 + 10.0F) : -0.8822517F;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lie;I)Lvs;", line = 47)
    public static final class548 method2450(class6 arg0, int arg1) {
        field5820++;
        if (arg1 != -3) {
            method2449((byte) -23, -0.7716389F);
        }
        return new class548(arg0.method45(-8652), arg0.method45(-8652), arg0.method45(arg1 ^ 0x21C9), arg0.method45(-8652), arg0.method86(arg1 ^ 0x77), arg0.method86(-96), arg0.method70(-9059));
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IIIIB)V", line = 65)
    public static final void method2451(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 > -72) {
            return;
        }
        field5821++;
        class165 var5 = class641.method3717(8592);
        var5.field2776.method65(class434.field6605.field7155, -77);
        var5.field2776.method65(arg0, -77);
        var5.field2776.method65(arg3, -77);
        var5.field2776.method25(true, arg2);
        var5.field2776.method25(true, arg1);
        class642.method3726(-684096285, var5);
        class205.field3403 = -3;
        class528.field7708 = 0;
        class125.field2054 = 1;
        class166.field2784 = 0;
    }
}
