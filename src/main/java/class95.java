import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class95 extends class55 {

    @OriginalMember(owner = "client!rh", name = "n", descriptor = "Le;")
    public static class191 field1542 = class54.method368("<img=0>", 2047);

    @OriginalMember(owner = "client!rh", name = "p", descriptor = "[J")
    public static long[] field1544 = new long[32];

    @OriginalMember(owner = "client!rh", name = "r", descriptor = "Le;")
    private static class191 field1546 = class54.method368("Please wait )2 attempting to reestablish)3", 2047);

    @OriginalMember(owner = "client!rh", name = "m", descriptor = "I")
    public static int field1541 = 0;

    @OriginalMember(owner = "client!rh", name = "o", descriptor = "Le;")
    public static class191 field1543 = field1546;

    @OriginalMember(owner = "client!rh", name = "u", descriptor = "[I")
    public static int[] field1549 = new int[128];

    @OriginalMember(owner = "client!rh", name = "q", descriptor = "I")
    public static int field1545;

    @OriginalMember(owner = "client!rh", name = "s", descriptor = "Lbd;")
    public static class24 field1547;

    @OriginalMember(owner = "client!rh", name = "t", descriptor = "Ljava/lang/String;")
    public static String field1548;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(JI)Le;")
    public static final class191 method587(long arg0, int arg1) {
        int var3 = -71 % ((76 - arg1) / 48);
        field1545++;
        return class199.method1392(false, arg0, (byte) 102, 10);
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(I)V")
    public static void method588(int arg0) {
        if (arg0 != 0) {
            field1543 = null;
        }
        field1542 = null;
        field1547 = null;
        field1543 = null;
        field1546 = null;
        field1549 = null;
        field1548 = null;
        field1544 = null;
    }
}
