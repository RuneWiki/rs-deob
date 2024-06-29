import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class263 extends class204 {

    @OriginalMember(owner = "client!jj", name = "j", descriptor = "Ljn;")
    public static class134 field3841 = new class134(14, 0);

    @OriginalMember(owner = "client!jj", name = "r", descriptor = "Ljn;")
    public static class134 field3849 = new class134(129, -1);

    @OriginalMember(owner = "client!jj", name = "s", descriptor = "Z")
    public static boolean field3850 = false;

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!jj", name = "i", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!jj", name = "k", descriptor = "I")
    public static int field3842;

    @OriginalMember(owner = "client!jj", name = "l", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!jj", name = "m", descriptor = "I")
    public static int field3844;

    @OriginalMember(owner = "client!jj", name = "n", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!jj", name = "o", descriptor = "I")
    public static int field3846;

    @OriginalMember(owner = "client!jj", name = "p", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!jj", name = "q", descriptor = "I")
    public static int field3848;

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "(I)Z", line = 4)
    public final boolean method1728(int arg0) {
        int var2 = -35 / ((arg0 - -13) / 44);
        ++field3842;
        if (super.field2853.method3510(-125) == class692.field9661) {
            return !super.field2853.method3505(127);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)I", line = 25)
    public final int method487(int arg0, int arg1) {
        ++field3843;
        int var3 = 0 % ((-57 - arg1) / 60);
        if (super.field2853.method3510(-87) == class692.field9661) {
            if (super.field2853.method3505(121)) {
                return 3;
            } else {
                return arg0 != 0 && ~super.field2853.field8551.method3429((byte) -98) != -2 ? 2 : 1;
            }
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(FFFIIFFF)F", line = 48)
    public static final float method1729(float arg0, float arg1, float arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        ++field3845;
        float var8 = 0.0F;
        if (arg4 != -1) {
            return -1.4630314F;
        } else {
            float var9 = arg0 - arg1;
            float var10 = -arg5 + arg7;
            float var11 = -arg2 + arg6;
            float var12 = 0.0F;
            float var13 = 0.0F;
            float var14 = 0.0F;
            while (var8 < 1.1F) {
                float var15 = var8 * var9 + arg1;
                float var16 = var8 * var10 + arg5;
                float var17 = var8 * var11 + arg2;
                int var18 = (int) var15 >> 9;
                int var19 = (int) var17 >> 9;
                if (~var18 < -1 && ~var19 < -1 && var18 < class741.field10208 && ~var19 > ~class525.field7224) {
                    int var20 = class724.field10031.field3467;
                    if (var20 < 3 && (class533.field7338[1][var18][var19] & 2) != 0) {
                        ++var20;
                    }
                    int var21 = class95.field1115[var20].method2529((int) var17, (int) var15, (byte) -128);
                    if (var16 > (float) var21) {
                        if (arg3 < 2) {
                            return var8;
                        }
                        return var8 - 0.1F + method1729(var15, var12, var14, arg3 + -1, -1, var13, var17, var16) * 0.1F;
                    }
                }
                var13 = var16;
                var8 += 0.1F;
                var12 = var15;
                var14 = var17;
            }
            return -1.0F;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)I", line = 116)
    public final int method490(byte arg0) {
        if (arg0 <= 83) {
            field3841 = null;
        }
        ++field3839;
        return 1;
    }

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "(I)Z", line = 129)
    public static final boolean method1730(int arg0) {
        if (arg0 != 0) {
            return false;
        } else {
            ++class218.field2994;
            ++field3844;
            class194.field2491 = true;
            return true;
        }
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Lfs;)V", line = 142)
    public class263(class607 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V", line = 146)
    public final void method486(int arg0) {
        if (super.field2853.method3510(-84) == class692.field9661) {
            if (super.field2853.method3505(arg0 ^ -4504)) {
                super.field2852 = 0;
            }
        } else {
            super.field2852 = 1;
        }
        if (arg0 != -4591) {
            method1730(-80);
        }
        ++field3846;
        if (super.field2852 != 0 && super.field2852 != 1) {
            super.field2852 = this.method490((byte) 120);
        }
    }

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "(I)V", line = 168)
    public static void method1731(int arg0) {
        field3849 = null;
        field3841 = null;
        int var1 = 92 / ((arg0 - -61) / 63);
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(ILfs;)V", line = 183)
    public class263(int arg0, class607 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "(II)V", line = 186)
    public final void method488(int arg0, int arg1) {
        super.field2852 = arg0;
        if (arg1 <= -105) {
            ++field3840;
        }
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(B)I", line = 198)
    public final int method1732(byte arg0) {
        if (arg0 != -98) {
            this.method488(48, 4);
        }
        ++field3847;
        return super.field2852;
    }
}
