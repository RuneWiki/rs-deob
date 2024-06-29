import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class204 {

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
    public static int field2928 = -1;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "I")
    public static int field2932 = -1;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
    public static int field2929;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
    public static int field2930;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "[I")
    public static int[] field2933;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V", line = 10)
    public static void method1351(int arg0) {
        if (arg0 != 25851) {
            field2932 = 59;
        }
        field2933 = null;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(BI)Lhn;", line = 25)
    public static final class429 method1352(byte arg0, int arg1) {
        field2931++;
        if (arg0 != -2) {
            field2929 = 85;
        }
        class429 var2 = (class429) class28.field344.method856((long) arg1, (byte) 123);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class236.field3334.method2431((byte) 77, 19, arg1);
        class429 var4 = new class429();
        if (var3 != null) {
            var4.method2703(2, new class236(var3));
        }
        class28.field344.method849((byte) 63, var4, (long) arg1);
        return var4;
    }
}
