import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class91 extends class189 {

    @OriginalMember(owner = "client!k", name = "kb", descriptor = "Z")
    private boolean field2122 = true;

    @OriginalMember(owner = "client!k", name = "lb", descriptor = "Z")
    private boolean field2123 = true;

    @OriginalMember(owner = "client!k", name = "nb", descriptor = "Lgg;")
    public static class63 field2125 = class116.method911(43, ")1p");

    @OriginalMember(owner = "client!k", name = "pb", descriptor = "Lgg;")
    private static class63 field2127 = class116.method911(43, "New User");

    @OriginalMember(owner = "client!k", name = "ob", descriptor = "Lgg;")
    public static class63 field2126 = field2127;

    @OriginalMember(owner = "client!k", name = "mb", descriptor = "Lch;")
    public static class29 field2124 = new class29(30);

    @OriginalMember(owner = "client!k", name = "qb", descriptor = "I")
    public static int field2128 = 0;

    @OriginalMember(owner = "client!k", name = "tb", descriptor = "I")
    public static int field2131 = 1;

    @OriginalMember(owner = "client!k", name = "ub", descriptor = "[Z")
    public static boolean[] field2132 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };

    @OriginalMember(owner = "client!k", name = "gb", descriptor = "I")
    public static int field2118;

    @OriginalMember(owner = "client!k", name = "hb", descriptor = "I")
    public static int field2119;

    @OriginalMember(owner = "client!k", name = "ib", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!k", name = "jb", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!k", name = "sb", descriptor = "I")
    public static int field2130;

    @OriginalMember(owner = "client!k", name = "rb", descriptor = "Lwb;")
    public static class200 field2129;

    @OriginalMember(owner = "client!k", name = "vb", descriptor = "Ljc;")
    public static class85 field2133;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "(B)V")
    public static void method778(byte arg0) {
        field2129 = null;
        if (arg0 >= -101) {
            method778((byte) -111);
        }
        field2124 = null;
        field2125 = null;
        field2133 = null;
        field2127 = null;
        field2126 = null;
        field2132 = null;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IBLab;)V")
    public final void method77(int arg0, byte arg1, class3 arg2) {
        ++field2118;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    super.field3811 = arg2.method64(31790) == 1;
                }
            } else {
                this.field2122 = ~arg2.method64(31790) == -2;
            }
        } else {
            this.field2123 = arg2.method64(31790) == 1;
        }
        if (arg1 < 32) {
            field2133 = null;
        }
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(BI)V")
    public static final void method779(byte arg0, int arg1) {
        class117.field2618 = arg1;
        class150.field3156 = -1;
        ++field2121;
        class101.field2368 = 0;
        class49.field1187 = null;
        class90.field2110 = false;
        class97.field2308 = -1;
        class42.field971 = 1;
        if (arg0 != 102) {
            method778((byte) 28);
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(II)[I")
    public final int[] method90(int arg0, int arg1) {
        int[] var3 = super.field3825.method681(arg1, (byte) -86);
        if (super.field3825.field1840) {
            int[] var4 = this.method1245(0, !this.field2122 ? arg1 : -arg1 + class1.field4, 11433);
            if (this.field2123) {
                for (int var5 = 0; ~class54.field1430 < ~var5; ++var5) {
                    var3[var5] = var4[-var5 + class75.field1867];
                }
            } else {
                class102.method849(var4, 0, var3, 0, class54.field1430);
            }
        }
        if (arg0 != 0) {
            this.method77(17, (byte) 29, (class3) null);
        }
        ++field2119;
        return var3;
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(II)[[I")
    public final int[][] method83(int arg0, int arg1) {
        ++field2130;
        int[][] var3 = super.field3808.method237(-1, arg0);
        if (arg1 < 34) {
            return null;
        } else {
            if (super.field3808.field561) {
                int[][] var4 = this.method1244((byte) 20, !this.field2122 ? arg0 : class1.field4 - arg0, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[2];
                int[] var7 = var4[1];
                int[] var8 = var3[2];
                int[] var9 = var3[0];
                int[] var10 = var3[1];
                if (!this.field2123) {
                    for (int var11 = 0; class54.field1430 > var11; ++var11) {
                        var9[var11] = var5[var11];
                        var10[var11] = var7[var11];
                        var8[var11] = var6[var11];
                    }
                } else {
                    for (int var12 = 0; ~class54.field1430 < ~var12; ++var12) {
                        var9[var12] = var5[class75.field1867 - var12];
                        var10[var12] = var7[-var12 + class75.field1867];
                        var8[var12] = var6[-var12 + class75.field1867];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "()V")
    public class91() {
        super(1, false);
    }
}
