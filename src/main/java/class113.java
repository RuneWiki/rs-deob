import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class113 {

    @OriginalMember(owner = "client!th", name = "e", descriptor = "S")
    public static short field1733 = 32767;

    @OriginalMember(owner = "client!th", name = "h", descriptor = "[I")
    public static int[] field1736 = new int[2048];

    @OriginalMember(owner = "client!th", name = "c", descriptor = "Lgk;")
    public static class159 field1731 = new class159();

    @OriginalMember(owner = "client!th", name = "b", descriptor = "B")
    public static byte field1730;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!th", name = "f", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!th", name = "g", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!th", name = "i", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(III)I")
    public static final int method728(int arg0, int arg1, int arg2) {
        field1732++;
        class75 var3 = (class75) class166.field2549.method1666((long) arg2, (byte) -114);
        if (var3 == null) {
            return 0;
        } else if (arg1 <= arg0 && var3.field1218.length > arg0) {
            return var3.field1218[arg0];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method729(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1735++;
        if (arg4 != 245221232) {
            method732(120);
        }
        int var9 = arg6 - arg5;
        int var10 = arg1 - arg2;
        int var11 = (arg7 - arg0 << 16) / var10;
        int var12 = (arg8 - arg3 << 16) / var9;
        class154.method938(arg2, arg0, var11, 5334, var12, arg6, 0, arg5, 0, arg1, arg3);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lpf;I)I")
    public static final int method730(class294 arg0, int arg1) {
        field1737++;
        int var2 = 0;
        if (arg0.method1960(class139.field2038, (byte) 117)) {
            var2++;
        }
        if (arg0.method1960(class183.field2762, (byte) 118)) {
            var2++;
        }
        if (arg0.method1960(class203.field3062, (byte) 124)) {
            var2++;
        }
        if (arg1 < 87) {
            return -91;
        }
        if (arg0.method1960(class59.field948, (byte) 116)) {
            var2++;
        }
        if (arg0.method1960(class63.field986, (byte) 121)) {
            var2++;
        }
        if (arg0.method1960(class92.field1458, (byte) 118)) {
            var2++;
        }
        if (arg0.method1960(class11.field144, (byte) 117)) {
            var2++;
        }
        if (arg0.method1960(class43.field696, (byte) 124)) {
            var2++;
        }
        if (arg0.method1960(class72.field1158, (byte) 118)) {
            var2++;
        }
        if (arg0.method1960(class173.field2625, (byte) 126)) {
            var2++;
        }
        if (arg0.method1960(class200.field3042, (byte) 124)) {
            var2++;
        }
        if (arg0.method1960(class106.field1624, (byte) 121)) {
            var2++;
        }
        if (arg0.method1960(class18.field211, (byte) 118)) {
            var2++;
        }
        if (arg0.method1960(class145.field2121, (byte) 126)) {
            var2++;
        }
        if (arg0.method1960(class102.field1607, (byte) 122)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lpf;BLpf;)V")
    public static final void method731(class294 arg0, byte arg1, class294 arg2) {
        field1729++;
        class206.field3081 = arg2;
        class178.field2723 = arg0;
        int var3 = -73 % ((arg1 + 31) / 39);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V")
    public static void method732(int arg0) {
        if (arg0 != -609) {
            field1730 = 2;
        }
        field1731 = null;
        field1736 = null;
    }
}
