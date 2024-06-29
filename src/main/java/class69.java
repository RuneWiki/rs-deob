import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class69 {

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
    public static int field1010 = 0;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "Ljava/lang/String;")
    public static String field1012 = "";

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "Lta;")
    public static class197 field1014 = new class197(64);

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "Z")
    public static boolean field1019 = true;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    public static int field1009;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "Lek;")
    public static class184 field1017;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(III)V", line = 6)
    public static final void method577(int arg0, int arg1, int arg2) {
        if (class170.field2536 != arg0 && arg2 != -1) {
            class197.method1435(arg2, class136.field2123, class170.field2536, 0, false, 20140);
            class213.field3386 = true;
        }
        field1011++;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V", line = 24)
    public static void method578(int arg0) {
        field1014 = null;
        field1017 = null;
        if (arg0 != 24502) {
            field1015 = -55;
        }
        field1012 = null;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)Lfe;", line = 49)
    public static final class243 method579(int arg0, int arg1) {
        field1016++;
        class243 var2 = (class243) class45.field711.method816((long) arg0, (byte) 73);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg0 < 32768) {
            var3 = class137.field2133.method1507(arg0, (byte) -126, 1);
        } else {
            var3 = class326.field5070.method1507(arg0 & 0x7FFF, (byte) 110, 1);
        }
        class243 var4 = new class243();
        if (arg1 != -32761) {
            method579(72, -84);
        }
        if (var3 != null) {
            var4.method1681(new class35(var3), false);
        }
        if (arg0 >= 32768) {
            var4.method1686((byte) -117);
        }
        class45.field711.method817(var4, (long) arg0, (byte) -102);
        return var4;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", line = 85)
    public static final String method580(byte arg0, String arg1, String arg2, String arg3) {
        int var4 = -100 % ((-arg0 - 64) / 54);
        field1013++;
        for (int var5 = arg2.indexOf(arg1); var5 != -1; var5 = arg2.indexOf(arg1, arg3.length() + var5)) {
            arg2 = arg2.substring(0, var5) + arg3 + arg2.substring(arg1.length() + var5);
        }
        return arg2;
    }
}
