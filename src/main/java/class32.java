import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!r")
public class class32 extends class8 {

    @OriginalMember(owner = "mapview!r", name = "q", descriptor = "Ll;")
    public static class22 field435 = class33.method229("map", -97);

    @OriginalMember(owner = "mapview!r", name = "r", descriptor = "Ll;")
    public static class22 field436 = class33.method229("-5bersicht", -81);

    @OriginalMember(owner = "mapview!r", name = "t", descriptor = "Ll;")
    public static class22 field438 = class33.method229("50(U", -127);

    @OriginalMember(owner = "mapview!r", name = "s", descriptor = "Ll;")
    public static class22 field437 = class33.method229(" ", -71);

    @OriginalMember(owner = "mapview!r", name = "u", descriptor = "[[B")
    public static byte[][] field439 = new byte[250][];

    @OriginalMember(owner = "mapview!r", name = "v", descriptor = "Ll;")
    public static class22 field440 = class33.method229("Apothecary", -109);

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(I[B)[B", line = 19)
    public static final byte[] method223(int arg0, byte[] arg1) {
        if (arg0 != 0) {
            field437 = null;
        }
        int var2 = arg1.length;
        byte[] var3 = new byte[var2];
        class7.method34(arg1, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(I[BB)I", line = 45)
    public static final int method224(int arg0, byte[] arg1, byte arg2) {
        int var3 = -53 % ((-arg2 - 40) / 47);
        return class3.method12(arg1, arg0, (byte) -48, 0);
    }

    @OriginalMember(owner = "mapview!r", name = "b", descriptor = "(Z)[Ll;", line = 53)
    public static final class22[] method225(boolean arg0) {
        return arg0 ? new class22[] { class10.field77, class22.field221, class22.field212, class5.field38, class34.field457, class23.field227, class13.field142, class10.field83, class23.field228, class25.field245, class12.field126, class10.field94, class24.field238 } : (class22[]) null;
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(B)V", line = 65)
    public static final void method226(byte arg0) {
        if (arg0 < 81) {
            method224(-126, null, (byte) -29);
        }
        if (class5.field36 != null) {
            class16 var1 = class5.field36;
            synchronized (class5.field36) {
                class5.field36 = null;
            }
        }
    }

    @OriginalMember(owner = "mapview!r", name = "b", descriptor = "(B)Z", line = 108)
    public static final boolean method227(byte arg0) {
        class13 var1 = class13.field132;
        synchronized (class13.field132) {
            if (class35.field472 == class24.field233) {
                return false;
            }
            class38.field509 = class8.field67[class35.field472];
            class17.field169 = class16.field164[class35.field472];
            int var2 = -98 % ((36 - arg0) / 60);
            class35.field472 = class35.field472 + 1 & 0x7F;
            return true;
        }
    }

    @OriginalMember(owner = "mapview!r", name = "b", descriptor = "(I)V", line = 125)
    public static void method228(int arg0) {
        field438 = null;
        if (arg0 != 0) {
            return;
        }
        field436 = null;
        field437 = null;
        field439 = null;
        field440 = null;
        field435 = null;
    }
}
