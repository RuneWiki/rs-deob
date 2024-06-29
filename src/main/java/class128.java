import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class128 {

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "D")
    public static double field2114 = -1.0D;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "Lqe;")
    public static class168 field2118 = null;

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "Lqe;")
    public static class168 field2121 = class66.method448("Eingabeprozedur geladen)3", 18);

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
    public static int field2113;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "I")
    public static int field2115;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
    public static int field2116;

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
    public static int field2117;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
    public static int field2119;

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)Lsh;")
    public static final class213 method865(int arg0, int arg1) {
        if (arg1 != 1) {
            method867((byte) -43, -41);
        }
        class213 var2 = (class213) class182.field3237.method1499(0, (long) arg0);
        field2117++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class247.field4277.method1712(class202.method1291(arg0, 21099), class236.method1531(arg0, 32385), arg1 ^ 0xFFFFFFFE);
        class213 var4 = new class213();
        var4.field3693 = arg0;
        if (var3 != null) {
            var4.method1374(-9383, new class112(var3));
        }
        class182.field3237.method1502((byte) -18, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V")
    public static void method866(int arg0) {
        field2118 = null;
        field2121 = null;
        if (arg0 != 1) {
            method867((byte) 10, -102);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BI)Lqe;")
    public static final class168 method867(byte arg0, int arg1) {
        if (arg0 <= 76) {
            return null;
        } else {
            field2115++;
            return class135.method912(arg1, (byte) 45, 10, false);
        }
    }
}
