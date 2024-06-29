import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class220 {

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "Lli;")
    public static class185 field4010 = class245.method1649("; version=1; path=)4; domain=", -96);

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    public static int field4008 = 0;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "Lli;")
    public static class185 field4016 = class245.method1649("weiss:", 125);

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public static int field4006;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
    public static int field4007;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
    public static int field4011;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
    public static int field4012;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
    public static int field4013;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "Ldd;")
    public static class211 field4015;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "[I")
    public static int[] field4009;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "[S")
    public static short[] field4014;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)Lnd;")
    public static final class272 method1522(int arg0, int arg1) {
        field4011++;
        if (arg1 == 0) {
            return new class96();
        } else if (arg1 == 1) {
            return new class94();
        } else if (arg1 == 2) {
            return new class63();
        } else if (arg1 == 3) {
            return new class184();
        } else if (arg1 == 4) {
            return new class205();
        } else if (arg1 == 5) {
            return new class60();
        } else if (arg1 == 6) {
            return new class112();
        } else if (arg1 == 7) {
            return new class3();
        } else if (arg1 == 8) {
            return new class77();
        } else if (arg1 == 9) {
            return new class182();
        } else if (arg1 == 10) {
            return new class187();
        } else if (arg1 == 11) {
            return new class216();
        } else if (arg1 == 12) {
            return new class72();
        } else if (arg1 == 13) {
            return new class124();
        } else if (arg1 == 14) {
            return new class125();
        } else if (arg1 == 15) {
            return new class104();
        } else if (arg1 == 16) {
            return new class210();
        } else if (arg1 == 17) {
            return new class212();
        } else if (arg1 == 18) {
            return new class278();
        } else if (arg1 == 19) {
            return new class275();
        } else if (arg1 == 20) {
            return new class131();
        } else if (arg1 == 21) {
            return new class274();
        } else if (arg1 == 22) {
            return new class248();
        } else if (arg1 == 23) {
            return new class166();
        } else if (arg1 == 24) {
            return new class157();
        } else if (arg1 == 25) {
            return new class126();
        } else if (arg1 == 26) {
            return new class12();
        } else if (arg1 == 27) {
            return new class140();
        } else if (arg1 == 28) {
            return new class15();
        } else if (arg1 == 29) {
            return new class204();
        } else if (arg1 == 30) {
            return new class179();
        } else if (arg1 == 31) {
            return new class214();
        } else if (arg1 == 32) {
            return new class130();
        } else if (arg1 == 33) {
            return new class132();
        } else if (arg1 == 34) {
            return new class24();
        } else if (arg1 == 35) {
            return new class109();
        } else if (arg1 == 36) {
            return new class37();
        } else if (arg1 == 37) {
            return new class108();
        } else if (arg1 == 38) {
            return new class144();
        } else if (arg1 == 39) {
            return new class158();
        } else {
            if (arg0 != 12) {
                field4014 = null;
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lti;Z)V")
    public static final void method1523(class188 arg0, boolean arg1) {
        if (arg1) {
            method1523((class188) null, true);
        }
        class58 var2 = (class58) class262.field4641.method195(113, arg0.field3514.method1327((byte) 101));
        field4013++;
        if (var2 == null) {
            return;
        }
        if (var2.field1007 != null) {
            class90.field1744.method802(var2.field1007);
            var2.field1007 = null;
        }
        var2.method476(116);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lli;Z)V")
    public static final void method1524(class185 arg0, boolean arg1) {
        field4007++;
        if (arg1) {
            method1525(false);
        }
        int var2 = class221.method1530(0, arg0);
        if (var2 != -1) {
            class40.method253(-13103, class215.field3955.field3132[var2], class215.field3955.field3142[var2]);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z)V")
    public static void method1525(boolean arg0) {
        field4009 = null;
        field4015 = null;
        if (!arg0) {
            field4010 = null;
            field4016 = null;
            field4014 = null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(II)I")
    public static int method1526(int arg0, int arg1) {
        return arg0 & arg1;
    }
}
