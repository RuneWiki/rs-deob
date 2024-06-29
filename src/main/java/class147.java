import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class147 {

    @OriginalMember(owner = "client!va", name = "e", descriptor = "I")
    public static int field3318 = 0;

    @OriginalMember(owner = "client!va", name = "f", descriptor = "I")
    public static int field3319 = 0;

    @OriginalMember(owner = "client!va", name = "i", descriptor = "Lhe;")
    public static class54 field3322 = class6.method58("Versteckt", false);

    @OriginalMember(owner = "client!va", name = "h", descriptor = "Lm;")
    public static class83 field3321 = new class83(8);

    @OriginalMember(owner = "client!va", name = "o", descriptor = "Lhe;")
    private static class54 field3328 = class6.method58("Prepared visibility map", false);

    @OriginalMember(owner = "client!va", name = "m", descriptor = "Lhe;")
    public static class54 field3326 = field3328;

    @OriginalMember(owner = "client!va", name = "l", descriptor = "Lhe;")
    public static class54 field3325 = class6.method58("::rect_debug", false);

    @OriginalMember(owner = "client!va", name = "p", descriptor = "Lhe;")
    public static class54 field3329 = class6.method58("Zu viele Verbindungen von Ihrer Adresse)3", false);

    @OriginalMember(owner = "client!va", name = "a", descriptor = "I")
    public int field3314;

    @OriginalMember(owner = "client!va", name = "b", descriptor = "I")
    public int field3315;

    @OriginalMember(owner = "client!va", name = "c", descriptor = "I")
    public int field3316;

    @OriginalMember(owner = "client!va", name = "g", descriptor = "I")
    public static int field3320;

    @OriginalMember(owner = "client!va", name = "k", descriptor = "I")
    public int field3324;

    @OriginalMember(owner = "client!va", name = "n", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!va", name = "q", descriptor = "I")
    public int field3330;

    @OriginalMember(owner = "client!va", name = "d", descriptor = "Lhd;")
    public class53 field3317;

    @OriginalMember(owner = "client!va", name = "j", descriptor = "[I")
    public static int[] field3323;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(B)V")
    public static void method1116(byte arg0) {
        if (arg0 < 15) {
            return;
        }
        field3323 = null;
        field3322 = null;
        field3329 = null;
        field3328 = null;
        field3325 = null;
        field3321 = null;
        field3326 = null;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(II)Lhe;")
    public static final class54 method1117(int arg0, int arg1) {
        if (arg0 > -6) {
            method1116((byte) -8);
        }
        field3320++;
        return class149.method1134(10, -9, false, arg1);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(BI)Lpc;")
    public static final class107 method1118(byte arg0, int arg1) {
        field3327++;
        if (arg0 < 40) {
            field3319 = 87;
        }
        class107 var2 = (class107) class66.field1598.method991((long) arg1, true);
        if (var2 != null) {
            return var2;
        }
        class107 var3 = class6.method53(arg1, false, -119, class40.field1053, class84.field2093);
        if (var3 != null) {
            class66.field1598.method990(true, (long) arg1, var3);
        }
        return var3;
    }
}
