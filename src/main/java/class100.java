import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class100 extends class115 {

    @OriginalMember(owner = "client!fg", name = "T", descriptor = "I")
    private int field1579 = 4096;

    @OriginalMember(owner = "client!fg", name = "cb", descriptor = "I")
    private int field1588 = 4096;

    @OriginalMember(owner = "client!fg", name = "fb", descriptor = "I")
    private int field1591 = 4096;

    @OriginalMember(owner = "client!fg", name = "Q", descriptor = "Lqe;")
    public static class168 field1576 = class66.method448("(U0a )2 non)2existant gosub script)2num: ", -119);

    @OriginalMember(owner = "client!fg", name = "X", descriptor = "I")
    public static int field1583 = 0;

    @OriginalMember(owner = "client!fg", name = "U", descriptor = "Lqe;")
    private static class168 field1580 = class66.method448(" more options", -117);

    @OriginalMember(owner = "client!fg", name = "Z", descriptor = "Lqe;")
    public static class168 field1585 = field1580;

    @OriginalMember(owner = "client!fg", name = "R", descriptor = "Lqe;")
    private static class168 field1577 = class66.method448("Loading )2 please wait)3", 59);

    @OriginalMember(owner = "client!fg", name = "V", descriptor = "Lqe;")
    public static class168 field1581 = field1577;

    @OriginalMember(owner = "client!fg", name = "hb", descriptor = "Lqe;")
    public static class168 field1593 = class66.method448("3D)2Softwarebibliothek gestartet)3", -117);

    @OriginalMember(owner = "client!fg", name = "ab", descriptor = "I")
    public static int field1586 = 0;

    @OriginalMember(owner = "client!fg", name = "S", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!fg", name = "W", descriptor = "I")
    public static int field1582;

    @OriginalMember(owner = "client!fg", name = "Y", descriptor = "I")
    public static int field1584;

    @OriginalMember(owner = "client!fg", name = "bb", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!fg", name = "eb", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!fg", name = "gb", descriptor = "I")
    public static int field1592;

    @OriginalMember(owner = "client!fg", name = "db", descriptor = "[Luj;")
    public static class158[] field1589;

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "()V")
    public class100() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "(B)V")
    public static void method656(byte arg0) {
        field1576 = null;
        field1589 = null;
        field1581 = null;
        field1585 = null;
        int var1 = 13 % ((arg0 - -22) / 36);
        field1580 = null;
        field1593 = null;
        field1577 = null;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILgg;)I")
    public static final int method657(int arg0, class222 arg1) {
        ++field1582;
        class180 var2 = arg1.field3814;
        if (var2.field3206 != null) {
            var2 = var2.method1192(-1);
            if (var2 == null) {
                return -1;
            }
        }
        if (arg0 != 4768) {
            field1583 = -108;
        }
        int var3 = var2.field3218;
        if (arg1.field224 != arg1.field223) {
            if (~arg1.field223 == ~arg1.field161) {
                var3 = var2.field3214;
            }
        } else {
            var3 = var2.field3161;
        }
        return var3;
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(II)[[I")
    public final int[][] method1(int arg0, int arg1) {
        ++field1590;
        if (arg1 <= 11) {
            this.method1(83, 46);
        }
        int[][] var3 = super.field1882.method1242(arg0, 95);
        if (super.field1882.field3344) {
            int[][] var4 = this.method789(0, (byte) -124, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class130.field2297 > var11; ++var11) {
                int var12 = var7[var11];
                int var13 = var5[var11];
                int var14 = var6[var11];
                if (var12 == var13 && var12 == var14) {
                    var8[var11] = this.field1579 * var13 >> 12;
                    var9[var11] = this.field1588 * var12 >> 12;
                    var10[var11] = this.field1591 * var14 >> 12;
                } else {
                    var8[var11] = this.field1579;
                    var9[var11] = this.field1588;
                    var10[var11] = this.field1591;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIB)V")
    public static final void method658(int arg0, int arg1, byte arg2) {
        if (~class130.field2297 != ~arg0) {
            class193.field3367 = new int[arg0];
            for (int var3 = 0; ~arg0 < ~var3; ++var3) {
                class193.field3367[var3] = (var3 << 12) / arg0;
            }
            class71.field1094 = arg0 == 64 ? 2048 : 4096;
            class134.field2350 = arg0 + -1;
            class130.field2297 = arg0;
        }
        if (class62.field855 != arg1) {
            if (class130.field2297 != arg1) {
                class170.field2963 = new int[arg1];
                for (int var4 = 0; var4 < arg1; ++var4) {
                    class170.field2963[var4] = (var4 << 12) / arg1;
                }
            } else {
                class170.field2963 = class193.field3367;
            }
            class38.field522 = arg1 + -1;
            class62.field855 = arg1;
        }
        ++field1578;
        if (arg2 != -78) {
            field1593 = null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IZ)V")
    public static final void method659(int arg0, boolean arg1) {
        ++field1587;
        if (class238.field4077 == null || arg0 > class238.field4077.length) {
            class238.field4077 = new int[arg0];
        }
        if (arg1) {
            field1583 = 85;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(BLnh;I)V")
    public final void method3(byte arg0, class112 arg1, int arg2) {
        if (arg0 != 107) {
            method658(79, 60, (byte) -58);
        }
        ++field1584;
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    this.field1591 = arg1.method731(false);
                }
            } else {
                this.field1588 = arg1.method731(false);
            }
        } else {
            this.field1579 = arg1.method731(false);
        }
    }
}
