import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class196 {

    @OriginalMember(owner = "client!je", name = "b", descriptor = "Ljava/lang/String;")
    public static String field3116 = "purple:";

    @OriginalMember(owner = "client!je", name = "e", descriptor = "I")
    public static int field3119 = 3353893;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "I")
    public static int field3117;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "I")
    public static int field3120;

    @OriginalMember(owner = "client!je", name = "i", descriptor = "I")
    public static int field3123;

    @OriginalMember(owner = "client!je", name = "h", descriptor = "Lfa;")
    public static class273 field3122;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "[I")
    public static int[] field3121;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IB)Ldj;")
    public static final class200 method1359(int arg0, byte arg1) {
        class200 var2 = (class200) class31.field393.method149((byte) -104, (long) arg0);
        field3117++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class209.field3354.method1877(class184.method1223(true, arg0), class109.method707(true, arg0), (byte) 44);
        class200 var4 = new class200();
        var4.field3176 = arg0;
        if (arg1 != 21) {
            return null;
        }
        if (var3 != null) {
            var4.method1383(-108, new class202(var3));
        }
        var4.method1381(false);
        class31.field393.method152(var4, (long) arg0, true);
        return var4;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method1360(int arg0, int arg1) {
        field3115++;
        if (arg1 < 100000) {
            return "<col=ffff00>" + arg1 + "</col>";
        } else if (arg1 < 10000000) {
            return "<col=ffffff>" + arg1 / 1000 + class16.field231 + "</col>";
        } else {
            if (arg0 != 10) {
                method1362((byte) 3, true, 102);
            }
            return "<col=00ff80>" + arg1 / 1000000 + class252.field3993 + "</col>";
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
    public static void method1361(int arg0) {
        if (arg0 != -1) {
            field3120 = -19;
        }
        field3122 = null;
        field3121 = null;
        field3116 = null;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(BZI)Ljava/lang/String;")
    public static final String method1362(byte arg0, boolean arg1, int arg2) {
        if (arg0 <= 69) {
            method1359(-68, (byte) 115);
        }
        field3123++;
        return arg1 && arg2 >= 0 ? class253.method1751(10, arg1, 0, arg2) : Integer.toString(arg2);
    }
}
