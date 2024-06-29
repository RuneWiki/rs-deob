import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!b")
public class class4 {

    @OriginalMember(owner = "mapview!b", name = "b", descriptor = "Lua;")
    public static class41 field61 = class16.method86("Enter place name to find", true);

    @OriginalMember(owner = "mapview!b", name = "d", descriptor = "[J")
    public static long[] field63 = new long[32];

    @OriginalMember(owner = "mapview!b", name = "h", descriptor = "I")
    public static int field67 = 0;

    @OriginalMember(owner = "mapview!b", name = "k", descriptor = "Lua;")
    public static class41 field70 = class16.method86("Anvil", true);

    @OriginalMember(owner = "mapview!b", name = "i", descriptor = "Lua;")
    public static class41 field68 = class16.method86("Mini Obelisk", true);

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "I")
    public static int field60 = 50;

    @OriginalMember(owner = "mapview!b", name = "c", descriptor = "Lua;")
    private static class41 field62 = class16.method86("fonts", true);

    @OriginalMember(owner = "mapview!b", name = "g", descriptor = "I")
    public static int field66 = 0;

    @OriginalMember(owner = "mapview!b", name = "l", descriptor = "Lua;")
    public static class41 field71 = class16.method86("-5bersicht", true);

    @OriginalMember(owner = "mapview!b", name = "e", descriptor = "Lua;")
    public static class41 field64 = class16.method86("Key", true);

    @OriginalMember(owner = "mapview!b", name = "f", descriptor = "I")
    public static int field65;

    @OriginalMember(owner = "mapview!b", name = "j", descriptor = "I")
    public static int field69;

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(Z)V", line = 11)
    public static void method34(boolean arg0) {
        field64 = null;
        field68 = null;
        field61 = null;
        if (arg0) {
            field70 = null;
            field62 = null;
            field71 = null;
            field63 = null;
        }
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(I[B)[B", line = 35)
    public static final byte[] method35(int arg0, byte[] arg1) {
        if (arg0 == 7360) {
            int var2 = arg1.length;
            byte[] var3 = new byte[var2];
            class33.method195(arg1, 0, var3, 0, var2);
            return var3;
        } else {
            return (byte[]) null;
        }
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(I)[Lua;", line = 55)
    public static final class41[] method36(int arg0) {
        if (arg0 != 0) {
            field67 = -23;
        }
        return new class41[] { class3.field57, class28.field379, class23.field240, class8.field89, class20.field173, class25.field258, class17.field152, class8.field86, class37.field465, class31.field404, field62, class34.field426, class26.field366, class41.field501 };
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(IB)Lua;", line = 78)
    public static final class41 method37(int arg0, byte arg1) {
        class41 var2 = new class41();
        var2.field509 = new byte[arg0];
        var2.field503 = 0;
        if (arg1 != 46) {
            method35(-64, null);
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(Lw;Lw;III)Lna;", line = 103)
    public static final class27 method38(class43 arg0, class43 arg1, int arg2, int arg3, int arg4) {
        if (class25.method144(arg4 ^ 0xFFFFFFB4, arg3, arg2, arg0)) {
            return arg4 == 50 ? class21.method112((byte) -91, arg1.method267(arg4 ^ 0x32, arg3, arg2)) : (class27) null;
        } else {
            return null;
        }
    }
}
