import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class2 extends class102 {

    @OriginalMember(owner = "client!aa", name = "V", descriptor = "I")
    private int field29 = 4096;

    @OriginalMember(owner = "client!aa", name = "Z", descriptor = "I")
    private int field33 = 0;

    @OriginalMember(owner = "client!aa", name = "R", descriptor = "D")
    public static double field25 = -1.0D;

    @OriginalMember(owner = "client!aa", name = "U", descriptor = "Lqe;")
    public static class179 field28 = class206.method1380(" zuerst von Ihrer Ignorieren)2Liste(Q", (byte) -126);

    @OriginalMember(owner = "client!aa", name = "Q", descriptor = "Lqe;")
    public static class179 field24 = class206.method1380("<col=ffffff>", (byte) -127);

    @OriginalMember(owner = "client!aa", name = "P", descriptor = "I")
    public static int field23 = 0;

    @OriginalMember(owner = "client!aa", name = "T", descriptor = "Lqe;")
    public static class179 field27 = class206.method1380("underlay)3dat", (byte) 103);

    @OriginalMember(owner = "client!aa", name = "N", descriptor = "[I")
    public static int[] field21 = new int[500];

    @OriginalMember(owner = "client!aa", name = "W", descriptor = "Lqe;")
    public static class179 field30 = class206.method1380("mem=", (byte) -127);

    @OriginalMember(owner = "client!aa", name = "M", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!aa", name = "O", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!aa", name = "S", descriptor = "I")
    public static int field26;

    @OriginalMember(owner = "client!aa", name = "X", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "client!aa", name = "Y", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!aa", name = "ab", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!aa", name = "bb", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZI)[I")
    public final int[] method11(boolean arg0, int arg1) {
        ++field31;
        if (!arg0) {
            this.method13((class185) null, -55, false);
        }
        int[] var3 = super.field1960.method699((byte) -74, arg1);
        if (super.field1960.field2007) {
            int[] var4 = this.method679(arg1, 0, (byte) -109);
            for (int var5 = 0; var5 < class155.field2796; ++var5) {
                int var6 = var4[var5];
                if (this.field33 <= var6) {
                    if (this.field29 >= var6) {
                        var3[var5] = var6;
                    } else {
                        var3[var5] = this.field29;
                    }
                } else {
                    var3[var5] = this.field33;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(BILqa;)V")
    public static final void method12(byte arg0, int arg1, class175 arg2) {
        ++field20;
        if (~arg2.field3136 >= ~class13.field322) {
            if (~class13.field322 < ~arg2.field3151) {
                class53.method370(2535, arg2);
            } else {
                class241.method1559(-23761, arg2);
            }
        } else {
            class84.method569(128, arg2);
        }
        if (~arg2.field3159 > -129 || arg2.field3198 < 128 || ~arg2.field3159 <= -13185 || ~arg2.field3198 <= -13185) {
            arg2.field3198 = arg2.field3160[0] * 128 + arg2.field3178 * 64;
            arg2.field3136 = 0;
            arg2.field3151 = 0;
            arg2.field3182 = -1;
            arg2.field3154 = -1;
            arg2.field3159 = arg2.field3200[0] * 128 + arg2.field3178 * 64;
            arg2.method1105(18575);
        }
        if (class61.field1298 == arg2 && (~arg2.field3159 > -1537 || ~arg2.field3198 > -1537 || ~arg2.field3159 <= -11777 || arg2.field3198 >= 11776)) {
            arg2.field3182 = -1;
            arg2.field3154 = -1;
            arg2.field3159 = arg2.field3200[0] * 128 - -(arg2.field3178 * 64);
            arg2.field3136 = 0;
            arg2.field3151 = 0;
            arg2.field3198 = arg2.field3160[0] * 128 + arg2.field3178 * 64;
            arg2.method1105(18575);
        }
        class95.method617(arg2, -21250);
        if (arg0 < 80) {
            field26 = -10;
        }
        class108.method705(arg2, -120);
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "()V")
    public class2() {
        super(1, false);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lra;IZ)V")
    public final void method13(class185 arg0, int arg1, boolean arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    super.field1957 = ~arg0.method1243(3) == -2;
                }
            } else {
                this.field29 = arg0.method1252(2);
            }
        } else {
            this.field33 = arg0.method1252(2);
        }
        if (arg2) {
            method15((byte) 127);
        }
        ++field32;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)[[I")
    public final int[][] method14(int arg0, int arg1) {
        if (arg1 != 64) {
            this.method14(86, 29);
        }
        ++field22;
        int[][] var3 = super.field1950.method598((byte) -74, arg0);
        if (super.field1950.field1724) {
            int[][] var4 = this.method677(47, arg0, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class155.field2796 < ~var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (~this.field33 >= ~var12) {
                    if (this.field29 < var12) {
                        var8[var11] = this.field29;
                    } else {
                        var8[var11] = var12;
                    }
                } else {
                    var8[var11] = this.field33;
                }
                if (this.field33 > var13) {
                    var9[var11] = this.field33;
                } else if (var13 > this.field29) {
                    var9[var11] = this.field29;
                } else {
                    var9[var11] = var13;
                }
                if (~var14 > ~this.field33) {
                    var10[var11] = this.field33;
                } else if (~this.field29 > ~var14) {
                    var10[var11] = this.field29;
                } else {
                    var10[var11] = var14;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "(B)V")
    public static void method15(byte arg0) {
        field24 = null;
        if (arg0 == -40) {
            field27 = null;
            field28 = null;
            field21 = null;
            field30 = null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(JB)Lqe;")
    public static final class179 method16(long arg0, byte arg1) {
        ++field34;
        class66.field1337.setTime(new Date(arg0));
        int var3 = class66.field1337.get(7);
        int var4 = class66.field1337.get(5);
        int var5 = class66.field1337.get(2);
        int var6 = class66.field1337.get(1);
        int var7 = class66.field1337.get(11);
        int var8 = class66.field1337.get(12);
        if (arg1 > -16) {
            method15((byte) 111);
        }
        int var9 = class66.field1337.get(13);
        return class78.method502((byte) -85, new class179[] { class95.field1782[var3 + -1], class6.field129, class148.method949((byte) -14, var4 / 10), class148.method949((byte) -14, var4 % 10), class25.field582, class43.field939[var5], class25.field582, class148.method949((byte) -14, var6), class185.field3408, class148.method949((byte) -14, var7 / 10), class148.method949((byte) -14, var7 % 10), class169.field3045, class148.method949((byte) -14, var8 / 10), class148.method949((byte) -14, var8 % 10), class169.field3045, class148.method949((byte) -14, var9 / 10), class148.method949((byte) -14, var9 % 10), client.field707 });
    }
}
