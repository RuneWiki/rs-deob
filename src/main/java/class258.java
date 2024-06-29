import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public class class258 extends class204 {

    @OriginalMember(owner = "client!ru", name = "l", descriptor = "[I")
    public static int[] field3794 = new int[1];

    @OriginalMember(owner = "client!ru", name = "k", descriptor = "I")
    public static int field3793 = -1;

    @OriginalMember(owner = "client!ru", name = "h", descriptor = "I")
    public static int field3790;

    @OriginalMember(owner = "client!ru", name = "i", descriptor = "I")
    public static int field3791;

    @OriginalMember(owner = "client!ru", name = "j", descriptor = "I")
    public static int field3792;

    @OriginalMember(owner = "client!ru", name = "m", descriptor = "I")
    public static int field3795;

    @OriginalMember(owner = "client!ru", name = "n", descriptor = "I")
    public static int field3796;

    @OriginalMember(owner = "client!ru", name = "o", descriptor = "I")
    public static int field3797;

    @OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(Lfs;)V", line = 3)
    public class258(class607 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(ILfs;)V", line = 6)
    public class258(int arg0, class607 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "(B)I", line = 9)
    public final int method1707(byte arg0) {
        ++field3795;
        if (arg0 != -98) {
            this.method1707((byte) -98);
        }
        return super.field2852;
    }

    @OriginalMember(owner = "client!ru", name = "c", descriptor = "(I)Z", line = 21)
    public final boolean method1708(int arg0) {
        int var2 = 71 % ((arg0 - -13) / 44);
        ++field3792;
        int var3 = super.field2853.method3513((byte) -97).method4270(4);
        return ~var3 <= -97;
    }

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "(Z)V", line = 37)
    public static void method1709(boolean arg0) {
        if (!arg0) {
            field3794 = null;
        }
        field3794 = null;
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(B)I", line = 48)
    public final int method490(byte arg0) {
        if (arg0 < 83) {
            field3793 = 114;
        }
        ++field3791;
        return 0;
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(I)V", line = 60)
    public final void method486(int arg0) {
        ++field3796;
        if (arg0 != -4591) {
            method1709(false);
        }
        int var2 = super.field2853.method3513((byte) -66).method4270(4);
        if (~var2 > -97) {
            super.field2852 = 0;
        }
        if (~super.field2852 < -2 && var2 < 128) {
            super.field2852 = 1;
        }
        if (~super.field2852 < -3 && ~var2 > -193) {
            super.field2852 = 2;
        }
        if (~super.field2852 > -1 || ~super.field2852 < -4) {
            super.field2852 = this.method490((byte) 108);
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(II)I", line = 91)
    public final int method487(int arg0, int arg1) {
        ++field3790;
        int var3 = -112 / ((arg1 - -57) / 60);
        int var4 = super.field2853.method3513((byte) 63).method4270(4);
        if (var4 < 96) {
            return 3;
        } else if (arg0 > 1 && ~var4 > -129) {
            return 3;
        } else {
            return ~arg0 < -4 && var4 < 192 ? 3 : 1;
        }
    }

    @OriginalMember(owner = "client!ru", name = "d", descriptor = "(II)V", line = 117)
    public final void method488(int arg0, int arg1) {
        ++field3797;
        if (arg1 > -105) {
            field3793 = -38;
        }
        super.field2852 = arg0;
    }
}
