import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class180 extends class202 {

    @OriginalMember(owner = "client!sf", name = "R", descriptor = "Lsb;")
    private static class98 field3097 = class47.method368("Discard", 0);

    @OriginalMember(owner = "client!sf", name = "Y", descriptor = "[I")
    public static int[] field3104 = new int[5];

    @OriginalMember(owner = "client!sf", name = "ab", descriptor = "Lsb;")
    public static class98 field3106 = class47.method368("Nehmen", 0);

    @OriginalMember(owner = "client!sf", name = "bb", descriptor = "Lsb;")
    public static class98 field3107 = field3097;

    @OriginalMember(owner = "client!sf", name = "W", descriptor = "Lsb;")
    public static class98 field3102 = class47.method368("::rect_debug", 0);

    @OriginalMember(owner = "client!sf", name = "db", descriptor = "[Lne;")
    public static class108[] field3109 = new class108[32768];

    @OriginalMember(owner = "client!sf", name = "P", descriptor = "I")
    public int field3096;

    @OriginalMember(owner = "client!sf", name = "S", descriptor = "I")
    public int field3098;

    @OriginalMember(owner = "client!sf", name = "T", descriptor = "I")
    public int field3099;

    @OriginalMember(owner = "client!sf", name = "U", descriptor = "I")
    public static int field3100;

    @OriginalMember(owner = "client!sf", name = "V", descriptor = "I")
    public static int field3101;

    @OriginalMember(owner = "client!sf", name = "eb", descriptor = "I")
    public int field3110;

    @OriginalMember(owner = "client!sf", name = "fb", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!sf", name = "gb", descriptor = "I")
    public static int field3112;

    @OriginalMember(owner = "client!sf", name = "hb", descriptor = "I")
    public static int field3113;

    @OriginalMember(owner = "client!sf", name = "X", descriptor = "Lsb;")
    public class98 field3103;

    @OriginalMember(owner = "client!sf", name = "O", descriptor = "[I")
    public int[] field3095;

    @OriginalMember(owner = "client!sf", name = "cb", descriptor = "[I")
    public int[] field3108;

    @OriginalMember(owner = "client!sf", name = "Z", descriptor = "[Lwa;")
    public class219[] field3105;

    @OriginalMember(owner = "client!sf", name = "N", descriptor = "[Lsb;")
    public class98[] field3094;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Z)V")
    public static void method1243(boolean arg0) {
        field3106 = null;
        field3109 = null;
        field3104 = null;
        field3097 = null;
        field3107 = null;
        if (arg0) {
            field3111 = -9;
        }
        field3102 = null;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IZI)V")
    public static final void method1244(int arg0, boolean arg1, int arg2) {
        field3113++;
        if (!arg1) {
            class134 var3 = class115.method861(1, (byte) 32, arg2);
            var3.method1011(!arg1);
            var3.field2371 = arg0;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IB)Ltb;")
    public static final class136 method1245(int arg0, byte arg1) {
        field3112++;
        class136 var2 = (class136) class124.field2248.method1307((byte) -69, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class144.field2539.method571(26, arg0, arg1 ^ 0xFFFFFFF9);
        if (arg1 != -127) {
            return null;
        }
        class136 var4 = new class136();
        if (var3 != null) {
            var4.method1022(arg1 + 127, new class216(var3));
        }
        class124.field2248.method1312(true, var4, (long) arg0);
        return var4;
    }
}
