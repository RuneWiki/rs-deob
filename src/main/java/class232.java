import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class232 {

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "Lsb;")
    private static class98 field3991 = class47.method368("M", 0);

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "I")
    public static int field3990 = 0;

    @OriginalMember(owner = "client!fh", name = "h", descriptor = "I")
    public static int field3992 = -1;

    @OriginalMember(owner = "client!fh", name = "j", descriptor = "Lsb;")
    public static class98 field3994 = field3991;

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "Lsb;")
    private static class98 field3986 = class47.method368("Loaded config", 0);

    @OriginalMember(owner = "client!fh", name = "i", descriptor = "Lsb;")
    public static class98 field3993 = class47.method368("overlay", 0);

    @OriginalMember(owner = "client!fh", name = "n", descriptor = "Lsb;")
    public static class98 field3998 = class47.method368("(Y<)4col>", 0);

    @OriginalMember(owner = "client!fh", name = "m", descriptor = "Lsb;")
    public static class98 field3997 = field3986;

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "[I")
    public static int[] field3989 = new int[32];

    @OriginalMember(owner = "client!fh", name = "o", descriptor = "Lsb;")
    public static class98 field3999 = field3991;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "I")
    public static int field3985;

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "I")
    public static int field3987;

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "I")
    public static int field3988;

    @OriginalMember(owner = "client!fh", name = "k", descriptor = "I")
    public static int field3995;

    @OriginalMember(owner = "client!fh", name = "l", descriptor = "I")
    public static int field3996;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)V")
    public static void method1591(byte arg0) {
        int var1 = -86 % ((arg0 + 10) / 45);
        field3989 = null;
        field3999 = null;
        field3993 = null;
        field3997 = null;
        field3998 = null;
        field3986 = null;
        field3991 = null;
        field3994 = null;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZIIIIBLtg;)V")
    public static final void method1592(boolean arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, class75 arg6) {
        class216.field3685 = 1;
        class104.field1854 = arg3;
        class262.field4600 = arg4;
        field3996++;
        class245.field4292 = arg2;
        class133.field2357 = arg0;
        class116.field2072 = arg6;
        class242.field4189 = arg1;
        int var7 = -52 % ((arg5 + 24) / 45);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(BILlj;)Lsb;")
    public static final class98 method1593(byte arg0, int arg1, class216 arg2) {
        field3995++;
        try {
            if (arg0 <= 33) {
                method1591((byte) 102);
            }
            class98 var3 = new class98();
            var3.field1694 = arg2.method1482(26084);
            if (arg1 < var3.field1694) {
                var3.field1694 = arg1;
            }
            var3.field1733 = new byte[var3.field1694];
            arg2.field3728 += class144.field2535.method1232(var3.field1733, -99938527, var3.field1694, 0, arg2.field3706, arg2.field3728);
            return var3;
        } catch (Exception var4) {
            return class262.field4594;
        }
    }
}
