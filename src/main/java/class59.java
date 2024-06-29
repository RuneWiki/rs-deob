import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class59 {

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "[I")
    public static int[] field1099 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "I")
    public static int field1100 = 0;

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "Ldc;")
    private static class37 field1102 = class185.method1233((byte) 86, "Loaded fonts");

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "Ldc;")
    public static class37 field1103 = class185.method1233((byte) 86, "auf einer freien Welt zu spielen)3");

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "I")
    public static int field1105 = 0;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
    public static int field1096 = 0;

    @OriginalMember(owner = "client!fd", name = "n", descriptor = "Ldc;")
    public static class37 field1109 = field1102;

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "I")
    public static int field1101;

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "I")
    public static int field1106;

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!fd", name = "m", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "Lwa;")
    public static class238 field1097;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)V")
    public static void method450(byte arg0) {
        field1109 = null;
        int var1 = -11 % ((-arg0 - 90) / 36);
        field1102 = null;
        field1097 = null;
        field1103 = null;
        field1099 = null;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IB)Z")
    public static final boolean method451(int arg0, byte arg1) {
        int var2 = -104 % ((arg1 - 22) / 49);
        field1106++;
        return (-arg0 & arg0) == arg0;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZI)Lsj;")
    public static final class206 method452(boolean arg0, int arg1) {
        field1101++;
        class206 var2 = (class206) class2.field10.method87(-99, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        if (arg0) {
            method453(-70, 102);
        }
        byte[] var3 = class207.field3871.method1547(class206.method1366(arg1, -1), 0, class200.method1323(arg1, (byte) -125));
        class206 var4 = new class206();
        var4.field3837 = arg1;
        if (var3 != null) {
            var4.method1359(13404, new class28(var3));
        }
        var4.method1368(3);
        class2.field10.method92((long) arg1, var4, !arg0);
        return var4;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(II)I")
    public static final int method453(int arg0, int arg1) {
        field1108++;
        return arg1 == 255 ? arg0 & 0xFF : -100;
    }
}
