import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class86 extends class102 {

    @OriginalMember(owner = "client!hj", name = "U", descriptor = "I")
    private int field1652 = 0;

    @OriginalMember(owner = "client!hj", name = "Y", descriptor = "I")
    private int field1656 = 0;

    @OriginalMember(owner = "client!hj", name = "ab", descriptor = "I")
    private int field1658 = 1;

    @OriginalMember(owner = "client!hj", name = "P", descriptor = "Lae;")
    public static class6 field1647 = null;

    @OriginalMember(owner = "client!hj", name = "O", descriptor = "Lqe;")
    public static class179 field1646 = class206.method1380(":assist:", (byte) 109);

    @OriginalMember(owner = "client!hj", name = "M", descriptor = "Lqe;")
    public static class179 field1644 = class206.method1380("<br>(X100(U(Y", (byte) 56);

    @OriginalMember(owner = "client!hj", name = "N", descriptor = "Lqe;")
    private static class179 field1645 = class206.method1380("Loading)3)3)3", (byte) -128);

    @OriginalMember(owner = "client!hj", name = "T", descriptor = "Lqe;")
    public static class179 field1651 = class206.method1380(" )2> ", (byte) 1);

    @OriginalMember(owner = "client!hj", name = "X", descriptor = "Lqe;")
    public static class179 field1655 = field1645;

    @OriginalMember(owner = "client!hj", name = "R", descriptor = "I")
    public static int field1649;

    @OriginalMember(owner = "client!hj", name = "S", descriptor = "I")
    public static int field1650;

    @OriginalMember(owner = "client!hj", name = "V", descriptor = "I")
    public static int field1653;

    @OriginalMember(owner = "client!hj", name = "W", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client!hj", name = "Z", descriptor = "I")
    public static int field1657;

    @OriginalMember(owner = "client!hj", name = "Q", descriptor = "Lee;")
    public static class49 field1648;

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "()V")
    public class86() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ZLjava/lang/Object;I)[B")
    public static final byte[] method577(boolean arg0, Object arg1, int arg2) {
        ++field1650;
        if (arg2 != -1) {
            return null;
        } else if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var3 = (byte[]) arg1;
            return arg0 ? class226.method1484(var3, (byte) 125) : var3;
        } else if (arg1 instanceof class16) {
            class16 var4 = (class16) arg1;
            return var4.method123((byte) 102);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ZI)[I")
    public final int[] method11(boolean arg0, int arg1) {
        if (!arg0) {
            this.method11(true, -53);
        }
        ++field1653;
        int[] var3 = super.field1960.method699((byte) -74, arg1);
        if (super.field1960.field2007) {
            int var4 = class94.field1769[arg1];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; class155.field2796 > var6; ++var6) {
                int var7 = class124.field2292[var6];
                int var8 = var7 + -2048 >> 1;
                int var9;
                if (this.field1656 == 0) {
                    var9 = (-var4 + var7) * this.field1658;
                } else {
                    int var10 = var5 * var5 + var8 * var8 >> 12;
                    int var11 = (int) (4096.0D * Math.sqrt((double) ((float) var10 / 4096.0F)));
                    var9 = (int) ((double) (this.field1658 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (var9 & -4096);
                if (~this.field1652 == -1) {
                    var12 = class40.field866[(4094 & var12) >> 4] + 4096 >> 1;
                } else if (this.field1652 == 2) {
                    var12 -= 2048;
                    if (~var12 > -1) {
                        var12 = -var12;
                    }
                    var12 = -var12 + 2048 << 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(BI)Lva;")
    public static final class225 method578(byte arg0, int arg1) {
        ++field1657;
        class225 var2 = (class225) class7.field228.method1299((byte) 92, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class131.field2389.method342(arg1, 5, (byte) 92);
            class225 var4 = new class225();
            if (var3 != null) {
                var4.method1478(0, new class185(var3));
            }
            class7.field228.method1303(var4, (long) arg1, (byte) -114);
            if (arg0 < 45) {
                method577(true, (Object) null, 67);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lra;IZ)V")
    public final void method13(class185 arg0, int arg1, boolean arg2) {
        if (arg2) {
            field1644 = null;
        }
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 == -4) {
                    this.field1658 = arg0.method1243(3);
                }
            } else {
                this.field1652 = arg0.method1243(3);
            }
        } else {
            this.field1656 = arg0.method1243(3);
        }
        ++field1654;
    }

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(I)V")
    public final void method191(int arg0) {
        if (arg0 != 14005) {
            this.field1652 = -121;
        }
        ++field1649;
        class56.method390(-1);
    }

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "(I)V")
    public static void method579(int arg0) {
        field1645 = null;
        field1651 = null;
        field1648 = null;
        field1647 = null;
        if (arg0 == 2) {
            field1646 = null;
            field1655 = null;
            field1644 = null;
        }
    }
}
