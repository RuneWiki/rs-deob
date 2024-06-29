import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class205 extends class82 {

    @OriginalMember(owner = "client!te", name = "V", descriptor = "[I")
    private int[] field3674 = new int[3];

    @OriginalMember(owner = "client!te", name = "X", descriptor = "I")
    private int field3676 = 4096;

    @OriginalMember(owner = "client!te", name = "S", descriptor = "I")
    private int field3671 = 409;

    @OriginalMember(owner = "client!te", name = "Z", descriptor = "I")
    private int field3678 = 4096;

    @OriginalMember(owner = "client!te", name = "T", descriptor = "I")
    private int field3672 = 4096;

    @OriginalMember(owner = "client!te", name = "P", descriptor = "I")
    public static int field3668 = 0;

    @OriginalMember(owner = "client!te", name = "bb", descriptor = "I")
    public static int field3680 = 0;

    @OriginalMember(owner = "client!te", name = "cb", descriptor = "Lvc;")
    public static class223 field3681 = null;

    @OriginalMember(owner = "client!te", name = "db", descriptor = "Ldj;")
    public static class44 field3682 = class89.method650(255, "Fertigkeit)2");

    @OriginalMember(owner = "client!te", name = "eb", descriptor = "Ldj;")
    private static class44 field3683 = class89.method650(255, "Free world");

    @OriginalMember(owner = "client!te", name = "ab", descriptor = "Ldj;")
    public static class44 field3679 = field3683;

    @OriginalMember(owner = "client!te", name = "Q", descriptor = "I")
    public static int field3669;

    @OriginalMember(owner = "client!te", name = "R", descriptor = "I")
    public static int field3670;

    @OriginalMember(owner = "client!te", name = "U", descriptor = "I")
    public static int field3673;

    @OriginalMember(owner = "client!te", name = "Y", descriptor = "I")
    public static int field3677;

    @OriginalMember(owner = "client!te", name = "W", descriptor = "[[[I")
    public static int[][][] field3675;

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "()V")
    public class205() {
        super(1, false);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lfj;IB)V")
    public final void method2(class66 arg0, int arg1, byte arg2) {
        if (arg2 != 68) {
            field3683 = null;
        }
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (~arg1 == -5) {
                            int var5 = arg0.method480(arg2 ^ 54);
                            this.field3674[2] = class29.method202(255, var5) >> 12;
                            this.field3674[0] = class29.method202(var5, 16711680) << 4;
                            this.field3674[1] = class29.method202(4080, var5 >> 4);
                        }
                    } else {
                        this.field3676 = arg0.method500(49);
                    }
                } else {
                    this.field3672 = arg0.method500(111);
                }
            } else {
                this.field3678 = arg0.method500(40);
            }
        } else {
            this.field3671 = arg0.method500(59);
        }
        ++field3673;
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(II)[[I")
    public final int[][] method6(int arg0, int arg1) {
        ++field3670;
        int[][] var3 = super.field1601.method548(arg1, true);
        if (arg0 >= -59) {
            return null;
        } else {
            if (super.field1601.field1343) {
                int[][] var4 = this.method619(arg1, true, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[2];
                int[] var7 = var3[0];
                int[] var8 = var4[1];
                int[] var9 = var3[2];
                int[] var10 = var3[1];
                for (int var11 = 0; ~var11 > ~class129.field2287; ++var11) {
                    int var12 = var5[var11];
                    int var13 = -this.field3674[0] + var12;
                    if (~var13 > -1) {
                        var13 = -var13;
                    }
                    if (~this.field3671 > ~var13) {
                        var7[var11] = var12;
                        var10[var11] = var8[var11];
                        var9[var11] = var6[var11];
                    } else {
                        int var14 = var8[var11];
                        int var15 = var14 - this.field3674[1];
                        if (var15 < 0) {
                            var15 = -var15;
                        }
                        if (var15 > this.field3671) {
                            var7[var11] = var12;
                            var10[var11] = var14;
                            var9[var11] = var6[var11];
                        } else {
                            int var16 = var6[var11];
                            int var17 = -this.field3674[2] + var16;
                            if (~var17 > -1) {
                                var17 = -var17;
                            }
                            if (~var17 < ~this.field3671) {
                                var7[var11] = var12;
                                var10[var11] = var14;
                                var9[var11] = var16;
                            } else {
                                var7[var11] = this.field3676 * var12 >> 12;
                                var10[var11] = this.field3672 * var14 >> 12;
                                var9[var11] = this.field3678 * var16 >> 12;
                            }
                        }
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(B)V")
    public static void method1327(byte arg0) {
        field3683 = null;
        field3681 = null;
        field3675 = null;
        if (arg0 != 113) {
            field3683 = null;
        }
        field3682 = null;
        field3679 = null;
    }
}
