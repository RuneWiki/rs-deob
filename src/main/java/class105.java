import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class105 extends class44 {

    @OriginalMember(owner = "client!jj", name = "s", descriptor = "I")
    private int field1621;

    @OriginalMember(owner = "client!jj", name = "p", descriptor = "I")
    private int field1618;

    @OriginalMember(owner = "client!jj", name = "n", descriptor = "I")
    private int field1616;

    @OriginalMember(owner = "client!jj", name = "o", descriptor = "I")
    private int field1617;

    @OriginalMember(owner = "client!jj", name = "j", descriptor = "Lrh;")
    public static class46 field1612 = new class46();

    @OriginalMember(owner = "client!jj", name = "t", descriptor = "Lef;")
    public static class214 field1622 = null;

    @OriginalMember(owner = "client!jj", name = "r", descriptor = "Llf;")
    public static class211 field1620 = new class211(64);

    @OriginalMember(owner = "client!jj", name = "w", descriptor = "[Z")
    public static boolean[] field1625 = new boolean[8];

    @OriginalMember(owner = "client!jj", name = "v", descriptor = "Lrh;")
    public static class46 field1624 = new class46();

    @OriginalMember(owner = "client!jj", name = "k", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!jj", name = "l", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!jj", name = "m", descriptor = "I")
    public static int field1615;

    @OriginalMember(owner = "client!jj", name = "q", descriptor = "I")
    public static int field1619;

    @OriginalMember(owner = "client!jj", name = "u", descriptor = "I")
    public static int field1623;

    @OriginalMember(owner = "client!jj", name = "x", descriptor = "I")
    public static int field1626;

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(III)V")
    public final void method333(int arg0, int arg1, int arg2) {
        ++field1613;
        if (arg0 != 0) {
            this.method332(110, -87, -105);
        }
    }

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "(I)V")
    public static void method689(int arg0) {
        if (arg0 <= 21) {
            field1624 = null;
        }
        field1622 = null;
        field1624 = null;
        field1625 = null;
        field1620 = null;
        field1612 = null;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)I")
    public static final int method690(int arg0, int arg1) {
        if (arg1 != -823281080) {
            return -4;
        } else {
            ++field1626;
            return arg0 >>> 8;
        }
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(IIIIII)V")
    public class105(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field1621 = arg0;
        this.field1618 = arg1;
        this.field1616 = arg3;
        this.field1617 = arg2;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IBI)V")
    public final void method336(int arg0, byte arg1, int arg2) {
        ++field1619;
        int var4 = this.field1617 * arg2 >> 12;
        int var5 = this.field1618 * arg0 >> 12;
        int var6 = this.field1621 * arg2 >> 12;
        int var7 = this.field1616 * arg0 >> 12;
        if (arg1 != 43) {
            this.field1621 = -7;
        }
        class98.method654(super.field565, var4, var7, var6, var5, (byte) 91);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public static final int method691(String arg0, byte arg1) {
        ++field1614;
        int var2 = 0;
        if (arg1 > -54) {
            return -12;
        } else {
            while (~class101.field1573.length < ~var2) {
                if (class101.field1573[var2].equalsIgnoreCase(arg0)) {
                    return var2;
                }
                ++var2;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(III)V")
    public final void method332(int arg0, int arg1, int arg2) {
        ++field1623;
        if (arg1 < 113) {
            this.method333(73, 49, -19);
        }
    }
}
