import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!p")
public abstract class class29 {

    @OriginalMember(owner = "mapview!p", name = "b", descriptor = "[I")
    public static int[] field428 = new int[128];

    @OriginalMember(owner = "mapview!p", name = "d", descriptor = "Ld;")
    public static class7 field430 = class37.method242("Sword Shop", 1333943984);

    @OriginalMember(owner = "mapview!p", name = "h", descriptor = "Ld;")
    public static class7 field434 = class37.method242("Magic Shop", 1333943984);

    @OriginalMember(owner = "mapview!p", name = "j", descriptor = "Ld;")
    public static class7 field436 = class37.method242("Mining Shop", 1333943984);

    @OriginalMember(owner = "mapview!p", name = "k", descriptor = "Ld;")
    public static class7 field437 = class37.method242("Legende", 1333943984);

    @OriginalMember(owner = "mapview!p", name = "l", descriptor = "Ld;")
    public static class7 field438 = class37.method242("Requesting", 1333943984);

    @OriginalMember(owner = "mapview!p", name = "f", descriptor = "Ld;")
    public static class7 field432 = class37.method242("Mining Site", 1333943984);

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "mapview!p", name = "c", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "mapview!p", name = "e", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "mapview!p", name = "m", descriptor = "I")
    public static int field439;

    @OriginalMember(owner = "mapview!p", name = "g", descriptor = "J")
    public static long field433;

    @OriginalMember(owner = "mapview!p", name = "i", descriptor = "Lk;")
    public static class20 field435;

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(I)V", line = 18)
    public static void method209(int arg0) {
        field432 = null;
        field435 = null;
        field434 = null;
        field430 = null;
        field428 = null;
        field438 = null;
        if (arg0 == 0) {
            field436 = null;
            field437 = null;
        }
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(IILba;I)Z", line = 48)
    public static final boolean method210(int arg0, int arg1, class4 arg2, int arg3) {
        byte[] var4 = arg2.method28(arg3, arg1, 25019);
        if (var4 == null) {
            return false;
        }
        class32.method225(var4, (byte) -97);
        if (arg0 < 93) {
            field429 = 127;
        }
        return true;
    }

    @OriginalMember(owner = "mapview!p", name = "b", descriptor = "(I)B", line = 72)
    public static final byte method211(int arg0) {
        if (arg0 > -38) {
            return -53;
        } else if (class28.field393 == null) {
            return 0;
        } else {
            return class28.field393[class16.field166];
        }
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(IIB)I")
    public abstract int method103(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(B)V")
    public abstract void method101(byte arg0);
}
