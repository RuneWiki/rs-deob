import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class88 extends class27 {

    @OriginalMember(owner = "client!jf", name = "V", descriptor = "I")
    private int field1599 = 585;

    @OriginalMember(owner = "client!jf", name = "O", descriptor = "I")
    public static int field1592 = 0;

    @OriginalMember(owner = "client!jf", name = "N", descriptor = "Lkb;")
    public static class93 field1591 = class76.method390("T", 0);

    @OriginalMember(owner = "client!jf", name = "M", descriptor = "Lkb;")
    public static class93 field1590 = class76.method390("Spiel)2Engine wird gestartet)3)3)3", 0);

    @OriginalMember(owner = "client!jf", name = "W", descriptor = "[Z")
    public static boolean[] field1600 = new boolean[100];

    @OriginalMember(owner = "client!jf", name = "Q", descriptor = "Lkb;")
    public static class93 field1594 = class76.method390("<col=00ffff>", 0);

    @OriginalMember(owner = "client!jf", name = "X", descriptor = "[[S")
    public static short[][] field1601 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!jf", name = "U", descriptor = "I")
    public static int field1598 = 7759444;

    @OriginalMember(owner = "client!jf", name = "P", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!jf", name = "R", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!jf", name = "S", descriptor = "I")
    public static int field1596;

    @OriginalMember(owner = "client!jf", name = "T", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!jf", name = "Y", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!jf", name = "Z", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!jf", name = "ab", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "client!jf", name = "bb", descriptor = "I")
    public static int field1605;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "(B)V")
    public static void method444(byte arg0) {
        field1594 = null;
        field1591 = null;
        field1590 = null;
        field1600 = null;
        if (arg0 <= 103) {
            field1591 = null;
        }
        field1601 = null;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Ltb;I)V")
    public static final void method445(class174 arg0, int arg1) {
        if (arg1 == -6609) {
            ++field1595;
            class64.field1014 = arg0;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IZ)[I")
    public final int[] method55(int arg0, boolean arg1) {
        ++field1604;
        int[] var3 = super.field447.method1238(arg1, arg0);
        if (super.field447.field3737) {
            int var4 = class142.field2781[arg0];
            for (int var5 = 0; ~var5 > ~class159.field3209; ++var5) {
                int var6 = class97.field1808[var5];
                if (~this.field1599 > ~var6 && ~(-this.field1599 + 4096) < ~var6 && ~var4 < ~(2048 - this.field1599) && 2048 - -this.field1599 > var4) {
                    int var7 = 2048 - var6;
                    int var8 = ~var7 > -1 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field1599 + 2048);
                    var3[var5] = -var10 + 4096;
                } else if (-this.field1599 + 2048 < var6 && this.field1599 + 2048 > var6) {
                    int var11 = var4 + -2048;
                    int var12 = var11 >= 0 ? var11 : -var11;
                    int var13 = var12 - this.field1599;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field1599 + 2048);
                } else if (var4 >= this.field1599 && 4096 - this.field1599 >= var4) {
                    if (~this.field1599 >= ~var6 && ~(4096 - this.field1599) <= ~var6) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = ~var15 > -1 ? -var15 : var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field1599 + 2048);
                        var3[var5] = 4096 - var18;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = ~var19 > -1 ? -var19 : var19;
                    int var21 = var20 - this.field1599;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (2048 - this.field1599);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(BILrd;)V")
    public final void method15(byte arg0, int arg1, class158 arg2) {
        if (arg1 == 0) {
            this.field1599 = arg2.method1071(28101);
        }
        if (arg0 > 106) {
            ++field1603;
        }
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "()V")
    public class88() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(IIII)I")
    public static final int method446(int arg0, int arg1, int arg2, int arg3) {
        ++field1602;
        int var4 = arg0 & 3;
        if (~var4 == -1) {
            return arg2;
        } else {
            if (arg3 != -4193) {
                field1591 = null;
            }
            if (~var4 == -2) {
                return 7 - arg1;
            } else {
                return ~var4 == -3 ? -arg2 + 7 : arg1;
            }
        }
    }
}
