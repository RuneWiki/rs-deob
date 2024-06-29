import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class27 {

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "Lhj;")
    private static class69 field391 = class181.method1318("Loading)3)3)3", (byte) -128);

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "Lhj;")
    public static class69 field394 = class181.method1318(" )2> <col=ffff00>", (byte) -125);

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "Z")
    public static boolean field392 = false;

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "Lhj;")
    public static class69 field389 = field391;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
    public static int field385;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "I")
    public int field390;

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "Lih;")
    public class196 field387;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "[I")
    public int[] field384;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IB)I")
    public static final int method152(int arg0, byte arg1) {
        if (arg1 != -45) {
            field389 = null;
        }
        field388++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIB)V")
    public static final void method153(int arg0, int arg1, byte arg2) {
        class235.field4278++;
        field382++;
        class48.field692.method301(60, -104);
        class48.field692.method908(false, arg0);
        class48.field692.method943((byte) 127, arg1);
        if (arg2 != -85) {
            method157(67);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V")
    public static void method154(int arg0) {
        field394 = null;
        if (arg0 != -6) {
            field381 = -73;
        }
        field391 = null;
        field389 = null;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(III)Lne;")
    public static final class49 method155(int arg0, int arg1, int arg2) {
        field385++;
        if (arg0 >= -14) {
            field391 = null;
        }
        for (class49 var3 = (class49) class258.field4619.method1724(255); var3 != null; var3 = (class49) class258.field4619.method1726(100)) {
            if (var3.field707 && var3.method275(arg2, 12800, arg1)) {
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(IB)V")
    public static final void method156(int arg0, byte arg1) {
        if (arg1 >= 15) {
            field386++;
            class118.field2226.method1708(-1009973721, arg0);
        }
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)V")
    public static final void method157(int arg0) {
        field393++;
        if (class165.field3034 == 5 && arg0 == 60) {
            class165.field3034 = 6;
        }
    }
}
