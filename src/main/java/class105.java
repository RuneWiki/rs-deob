import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class105 extends class45 {

    @OriginalMember(owner = "client!vj", name = "x", descriptor = "I")
    public int field1710;

    @OriginalMember(owner = "client!vj", name = "s", descriptor = "I")
    public int field1705;

    @OriginalMember(owner = "client!vj", name = "B", descriptor = "[I")
    public static int[] field1714 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!vj", name = "r", descriptor = "Lvl;")
    public static class164 field1704 = new class164(16);

    @OriginalMember(owner = "client!vj", name = "o", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!vj", name = "p", descriptor = "I")
    public static int field1702;

    @OriginalMember(owner = "client!vj", name = "q", descriptor = "I")
    public static int field1703;

    @OriginalMember(owner = "client!vj", name = "t", descriptor = "I")
    public static int field1706;

    @OriginalMember(owner = "client!vj", name = "u", descriptor = "I")
    public static int field1707;

    @OriginalMember(owner = "client!vj", name = "v", descriptor = "I")
    public static int field1708;

    @OriginalMember(owner = "client!vj", name = "w", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!vj", name = "y", descriptor = "I")
    public static int field1711;

    @OriginalMember(owner = "client!vj", name = "z", descriptor = "I")
    public static int field1712;

    @OriginalMember(owner = "client!vj", name = "A", descriptor = "I")
    public static int field1713;

    @OriginalMember(owner = "client!vj", name = "C", descriptor = "I")
    public static int field1715;

    @OriginalMember(owner = "client!vj", name = "D", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(I)Z", line = 5)
    public final boolean method807(int arg0) {
        if (arg0 != 1) {
            field1704 = (class164) null;
        }
        field1702++;
        return (this.field1710 >> 29 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(B)V", line = 16)
    public static void method808(byte arg0) {
        if (arg0 <= 25) {
            field1704 = (class164) null;
        }
        field1704 = null;
        field1714 = null;
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(I)Z", line = 27)
    public final boolean method809(int arg0) {
        field1708++;
        if (arg0 != -2142398602) {
            field1704 = (class164) null;
        }
        return (this.field1710 >> 30 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(BI)Z", line = 38)
    public final boolean method810(byte arg0, int arg1) {
        field1703++;
        if (arg0 < 47) {
            method808((byte) 51);
        }
        return (this.field1710 >> arg1 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "(B)Z", line = 51)
    public final boolean method811(byte arg0) {
        if (arg0 >= -122) {
            return false;
        } else {
            field1715++;
            return ((this.field1710 & 0x390049) >> 21) != 0;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Z)I", line = 70)
    public final int method812(boolean arg0) {
        field1709++;
        return arg0 ? class344.method2424((byte) 93, this.field1710) : -109;
    }

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "(B)Z", line = 84)
    public final boolean method813(byte arg0) {
        field1701++;
        if (arg0 != -64) {
            field1714 = (int[]) null;
        }
        return (this.field1710 >> 22 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "(I)V", line = 95)
    public static final void method814(int arg0) {
        field1706++;
        if (arg0 < 96) {
            return;
        }
        for (int var1 = 0; var1 < class356.field5645; var1++) {
            int var2 = class330.field5248[var1];
            class258 var3 = class56.field924[var2];
            int var4 = class29.field383.method1720((byte) -65);
            if ((var4 & 0x20) != 0) {
                var4 += class29.field383.method1720((byte) -32) << 8;
            }
            class251.method1950(var4, (byte) -33, var2, var3);
        }
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(Z)Z", line = 131)
    public final boolean method815(boolean arg0) {
        field1707++;
        if (!arg0) {
            field1714 = (int[]) null;
        }
        return (this.field1710 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "(I)Z", line = 146)
    public final boolean method816(int arg0) {
        field1716++;
        int var2 = -115 / ((arg0 + 71) / 36);
        return (this.field1710 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "(I)I", line = 157)
    public final int method817(int arg0) {
        field1711++;
        return arg0 == 1882153 ? (this.field1710 & 0x1CB829) >> 18 : -87;
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(II)V", line = 167)
    public class105(int arg0, int arg1) {
        this.field1710 = arg0;
        this.field1705 = arg1;
    }

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "(I)Z", line = 177)
    public final boolean method818(int arg0) {
        if (arg0 > -28) {
            field1704 = (class164) null;
        }
        field1712++;
        return (this.field1710 >> 28 & 0x1) != 0;
    }
}
