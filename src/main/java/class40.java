import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!v")
public class class40 {

    @OriginalMember(owner = "mapview!v", name = "d", descriptor = "Lta;")
    public static class37 field529 = class20.method87(-115, "Quest Start");

    @OriginalMember(owner = "mapview!v", name = "c", descriptor = "Lta;")
    public static class37 field528 = class20.method87(-104, "Crafting Shop");

    @OriginalMember(owner = "mapview!v", name = "b", descriptor = "Lta;")
    public static class37 field527 = class20.method87(-110, "Woodcutting stump");

    @OriginalMember(owner = "mapview!v", name = "e", descriptor = "Lta;")
    public static class37 field530 = class20.method87(-127, "Grand Exchange");

    @OriginalMember(owner = "mapview!v", name = "f", descriptor = "Lta;")
    public static class37 field531 = class20.method87(-94, "Mining Shop");

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "I")
    public static int field526;

    @OriginalMember(owner = "mapview!v", name = "g", descriptor = "[B")
    public static byte[] field532;

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(IZ)Lta;", line = 13)
    public static final class37 method259(int arg0, boolean arg1) {
        class37 var2 = new class37();
        var2.field499 = new byte[arg0];
        var2.field509 = 0;
        return arg1 ? (class37) null : var2;
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(II)[B", line = 45)
    public static final synchronized byte[] method260(int arg0, int arg1) {
        if (arg1 == 100 && class10.field108 > 0) {
            byte[] var2 = class12.field137[--class10.field108];
            class12.field137[class10.field108] = null;
            return var2;
        } else if (arg0 == arg1 && class26.field427 > 0) {
            byte[] var3 = class35.field485[--class26.field427];
            class35.field485[class26.field427] = null;
            return var3;
        } else if (arg1 == 30000 && class26.field422 > 0) {
            byte[] var4 = class15.field166[--class26.field422];
            class15.field166[class26.field422] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(I)V", line = 84)
    public static void method261(int arg0) {
        field531 = null;
        field529 = null;
        field532 = null;
        field527 = null;
        field530 = null;
        if (arg0 == 100) {
            field528 = null;
        }
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(Ljava/lang/Object;IZ)[B", line = 103)
    public static final byte[] method262(Object arg0, int arg1, boolean arg2) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var4 = (byte[]) arg0;
            return arg2 ? class38.method247(var4, (byte) 71) : var4;
        } else if (arg0 instanceof class6) {
            class6 var3 = (class6) arg0;
            return var3.method25(116);
        } else {
            if (arg1 != 760) {
                field531 = null;
            }
            throw new IllegalArgumentException();
        }
    }
}
