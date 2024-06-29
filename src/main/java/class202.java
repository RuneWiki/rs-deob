import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public class class202 extends class76 {

    @OriginalMember(owner = "client!ru", name = "u", descriptor = "I")
    public static int field2958 = 0;

    @OriginalMember(owner = "client!ru", name = "t", descriptor = "Z")
    public static boolean field2957 = false;

    @OriginalMember(owner = "client!ru", name = "s", descriptor = "F")
    public static float field2956;

    @OriginalMember(owner = "client!ru", name = "m", descriptor = "I")
    public int field2950;

    @OriginalMember(owner = "client!ru", name = "n", descriptor = "I")
    public static int field2951;

    @OriginalMember(owner = "client!ru", name = "o", descriptor = "I")
    public int field2952;

    @OriginalMember(owner = "client!ru", name = "p", descriptor = "I")
    public int field2953;

    @OriginalMember(owner = "client!ru", name = "r", descriptor = "I")
    public int field2955;

    @OriginalMember(owner = "client!ru", name = "v", descriptor = "I")
    public int field2959;

    @OriginalMember(owner = "client!ru", name = "w", descriptor = "I")
    public static int field2960;

    @OriginalMember(owner = "client!ru", name = "x", descriptor = "I")
    public static int field2961;

    @OriginalMember(owner = "client!ru", name = "y", descriptor = "I")
    public static int field2962;

    @OriginalMember(owner = "client!ru", name = "z", descriptor = "I")
    public int field2963;

    @OriginalMember(owner = "client!ru", name = "q", descriptor = "Ljava/lang/String;")
    public String field2954;

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(BI)Z", line = 6)
    public static final boolean method1451(byte arg0, int arg1) {
        field2951++;
        int var2 = arg0 & 0xFF;
        if (var2 == 0) {
            return false;
        } else if (var2 >= 128 && var2 < 160 && class413.field5839[var2 - 128] == '\u0000') {
            return false;
        } else if (arg1 < 106) {
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(Ld;ILcb;)V", line = 42)
    public static final void method1452(class159 arg0, int arg1, class544 arg2) {
        class496.field7062 = arg0;
        if (arg1 != 22203) {
            field2961 = -108;
        }
        field2960++;
        class405.field5712 = arg2;
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(II)Loha;", line = 63)
    public static final class771 method1453(int arg0, int arg1) {
        field2962++;
        class771 var2 = (class771) class567.field8027.method2373((long) arg1, 103);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class674.field9616.method3150(arg1, 73, 1);
        class771 var4 = new class771();
        var4.field10628 = arg1;
        if (var3 != null) {
            var4.method4240(new class120(var3), (byte) 90);
        }
        if (arg0 != -128) {
            method1451((byte) 113, 31);
        }
        var4.method4238((byte) -117);
        if (var4.field10630 == 2 && class200.field2940.method380((byte) -3, (long) arg1) == null) {
            class200.field2940.method384((long) arg1, new class633(class276.field3841), false);
            class286.field4385[class276.field3841++] = var4;
        }
        class567.field8027.method2362(var4, 0, (long) arg1);
        return var4;
    }
}
