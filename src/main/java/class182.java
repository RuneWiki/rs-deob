import java.awt.Canvas;
import java.awt.event.FocusListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class182 extends Canvas implements FocusListener {

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "[Ltl;")
    public static class59[] field3052 = new class59[100];

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "Ltl;")
    public static class59 field3057 = class85.method639(")2", 9588);

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "Lkl;")
    public static class64 field3055 = new class64();

    @OriginalMember(owner = "client!aj", name = "n", descriptor = "[I")
    public static int[] field3060 = new int[32];

    @OriginalMember(owner = "client!aj", name = "m", descriptor = "I")
    public static int field3059 = 0;

    @OriginalMember(owner = "client!aj", name = "o", descriptor = "Ltl;")
    public static class59 field3061 = class85.method639("blinken2:", 9588);

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "I")
    public static int field3047;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "I")
    public static int field3048;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
    public static int field3049;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
    public static int field3050;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "I")
    public static int field3051;

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "I")
    public static int field3054;

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "I")
    public static int field3056;

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IB)Ld;", line = 5)
    public static final class40 method1351(int arg0, byte arg1) {
        if (arg1 > -4) {
            field3061 = (class59) null;
        }
        class40 var2 = (class40) class231.field3793.method1483((byte) -74, (long) arg0);
        field3056++;
        if (var2 != null) {
            return var2;
        }
        class40 var3 = class113.method814(class283.field4865, (byte) -108, arg0, class71.field1119, false);
        if (var3 != null) {
            class231.field3793.method1488((long) arg0, var3, 25838);
        }
        return var3;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Ltl;I)I", line = 30)
    public static final int method1352(class59 arg0, int arg1) {
        field3054++;
        for (int var2 = 0; var2 < class210.field3414.length; var2++) {
            if (class210.field3414[var2].method472(arg0, 90)) {
                return var2;
            }
        }
        int var3 = -84 % ((-arg1 - 42) / 37);
        return -1;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(BI)Ltl;", line = 53)
    public static final class59 method1353(byte arg0, int arg1) {
        field3050++;
        int var2 = -76 % ((arg0 - 42) / 48);
        return arg1 < 999999999 ? class81.method619((byte) -127, arg1) : class86.field1371;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(B)V", line = 92)
    public static final void method1354(byte arg0) {
        class190.field3182.method1484(false);
        if (arg0 <= 125) {
            field3060 = (int[]) null;
        }
        field3058++;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)V", line = 127)
    public static final void method1355(int arg0, int arg1) {
        int var2 = 13 % ((arg1 + 44) / 48);
        class186 var3 = class67.method561(32, arg0, 11);
        var3.method1381(true);
        field3051++;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V", line = 172)
    public static void method1356(int arg0) {
        field3052 = null;
        if (arg0 <= 71) {
            field3061 = (class59) null;
        }
        field3057 = null;
        field3060 = null;
        field3055 = null;
        field3061 = null;
    }
}
