import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class29 {

    @OriginalMember(owner = "client!ln", name = "d", descriptor = "[I")
    public static int[] field345 = new int[14];

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "I")
    public static int field343 = 0;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field342 = new String[500];

    @OriginalMember(owner = "client!ln", name = "e", descriptor = "F")
    public static float field346;

    @OriginalMember(owner = "client!ln", name = "g", descriptor = "F")
    public static float field348;

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!ln", name = "f", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)I", line = 10)
    public static final int method211(int arg0) {
        if (arg0 != 32) {
            method211(-119);
        }
        field347++;
        return class67.field847 && class276.field4349[81] && class74.field924 > 2 ? class304.field4734[class74.field924 - 2] : class304.field4734[class74.field924 - 1];
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(B)V", line = 29)
    public static void method212(byte arg0) {
        field342 = null;
        field345 = null;
        if (arg0 >= -75) {
            field345 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(II)Lam;", line = 53)
    public static final class282 method213(int arg0, int arg1) {
        field344++;
        class282 var2 = (class282) class208.field3144.method380(0, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class123.field1699.method100(arg1, arg0, (byte) -107);
        class282 var4 = new class282();
        if (var3 != null) {
            var4.method2041(new class143(var3), 43);
        }
        var4.method2037((byte) -126);
        class208.field3144.method377((long) arg0, var4, arg1 ^ 0xFFFFFFDF);
        return var4;
    }
}
