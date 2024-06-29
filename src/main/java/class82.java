import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class82 extends class259 {

    @OriginalMember(owner = "client!qb", name = "W", descriptor = "I")
    public static int field1752 = 10;

    @OriginalMember(owner = "client!qb", name = "Y", descriptor = "Lsg;")
    public static class30 field1754 = class167.method1221((byte) 33, "Musik)2Engine vorbereitet)3");

    @OriginalMember(owner = "client!qb", name = "X", descriptor = "Lsg;")
    public static class30 field1753 = class167.method1221((byte) 33, "Fallen lassen");

    @OriginalMember(owner = "client!qb", name = "Z", descriptor = "I")
    public static int field1755 = 0;

    @OriginalMember(owner = "client!qb", name = "S", descriptor = "I")
    public static int field1748;

    @OriginalMember(owner = "client!qb", name = "T", descriptor = "I")
    public static int field1749;

    @OriginalMember(owner = "client!qb", name = "V", descriptor = "I")
    public static int field1751;

    @OriginalMember(owner = "client!qb", name = "U", descriptor = "[Z")
    public static boolean[] field1750;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZIIII)V")
    public static final void method706(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1748;
        class167.field3063 = 0L;
        int var5 = class150.method1089((byte) 67);
        if (arg1 >= -123) {
            field1752 = 62;
        }
        boolean var6 = false;
        if (arg4 == 3 || var5 == 3) {
            arg0 = true;
        }
        if (class66.field1445.startsWith("mac") && ~arg4 < -1) {
            arg0 = true;
        }
        if (arg4 > 0 != var5 > 0) {
            var6 = true;
        }
        if (arg0 && ~arg4 < -1) {
            var6 = true;
        }
        class270.method1852((byte) 5, var6, arg2, arg4, var5, arg3, arg0);
    }

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "(I)V")
    public static void method707(int arg0) {
        field1750 = null;
        field1753 = null;
        if (arg0 == 9311) {
            field1754 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IZ)[I")
    public final int[] method17(int arg0, boolean arg1) {
        int[] var3 = super.field4581.method1841(18, arg0);
        if (super.field4581.field4729) {
            int[][] var4 = this.method1795(arg0, 2, 0);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            for (int var8 = 0; ~var8 > ~class223.field3999; ++var8) {
                var3[var8] = (var5[var8] + var6[var8] + var7[var8]) / 3;
            }
        }
        if (arg1) {
            field1753 = null;
        }
        ++field1751;
        return var3;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIII)V")
    public static final void method708(int arg0, int arg1, int arg2, int arg3) {
        class195 var4 = class71.field1613[arg0][arg1][arg2];
        if (var4 != null) {
            class146 var5 = var4.field3537;
            if (var5 != null) {
                var5.field2801 = var5.field2801 * arg3 / 16;
                var5.field2789 = var5.field2789 * arg3 / 16;
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "()V")
    public class82() {
        super(1, true);
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(IB)V")
    public static final void method709(int arg0, byte arg1) {
        if (arg1 != 43) {
            field1754 = null;
        }
        class68 var2 = class103.method830(arg0, 4, 5);
        ++field1749;
        var2.method610(2141640544);
    }
}
