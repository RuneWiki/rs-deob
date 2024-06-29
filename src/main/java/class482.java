import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class482 {

    @OriginalMember(owner = "client!fa", name = "n", descriptor = "[I")
    public static int[] field7319 = new int[25];

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "I")
    public int field7307;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
    public static int field7308;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
    public static int field7309;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "I")
    public int field7310;

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "I")
    public static int field7312;

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "I")
    public int field7313;

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "I")
    public int field7314;

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "I")
    public int field7315;

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "I")
    public int field7317;

    @OriginalMember(owner = "client!fa", name = "m", descriptor = "I")
    public int field7318;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "Ltn;")
    public static class524 field7311;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "[B")
    public byte[] field7306;

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "[B")
    public byte[] field7316;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(III)V", line = 4)
    public static final void method2922(int arg0, int arg1, int arg2) {
        field7308++;
        class621 var3 = class442.method2691(arg0, arg2, true);
        var3.method3592((byte) 124);
        var3.field9068 = arg1;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V", line = 18)
    public static void method2923(int arg0) {
        field7311 = null;
        field7319 = null;
        if (arg0 != -25667) {
            field7311 = null;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)Lto;", line = 38)
    public static final class216 method2924(int arg0, int arg1) {
        field7309++;
        class216 var2 = (class216) class563.field8344.method2025((long) arg0, 2);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class463.field6690.method3486((byte) -63, arg0, 1);
        class216 var4 = new class216();
        var4.field3188 = arg0;
        if (var3 != null) {
            var4.method1395(true, new class428(var3));
        }
        if (arg1 != -23810) {
            method2924(104, -58);
        }
        var4.method1393((byte) 10);
        if (var4.field3202 == 2 && class369.field5338.method1333((long) arg0, false) == null) {
            class369.field5338.method1341(new class269(class110.field1400), (byte) 34, (long) arg0);
            class297.field4348[class110.field1400++] = var4;
        }
        class563.field8344.method2029(false, var4, (long) arg0);
        return var4;
    }
}
