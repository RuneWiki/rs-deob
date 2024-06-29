import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public class class272 extends class450 {

    @OriginalMember(owner = "client!kv", name = "f", descriptor = "I")
    public static int field3789 = 0;

    @OriginalMember(owner = "client!kv", name = "g", descriptor = "I")
    public static int field3790;

    @OriginalMember(owner = "client!kv", name = "h", descriptor = "I")
    public static int field3791;

    @OriginalMember(owner = "client!kv", name = "i", descriptor = "I")
    public static int field3792;

    @OriginalMember(owner = "client!kv", name = "j", descriptor = "I")
    public static int field3793;

    @OriginalMember(owner = "client!kv", name = "k", descriptor = "I")
    public static int field3794;

    @OriginalMember(owner = "client!kv", name = "l", descriptor = "I")
    public static int field3795;

    @OriginalMember(owner = "client!kv", name = "m", descriptor = "I")
    public static int field3796;

    @OriginalMember(owner = "client!kv", name = "n", descriptor = "I")
    public static int field3797;

    @OriginalMember(owner = "client!kv", name = "o", descriptor = "I")
    public static int field3798;

    @OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(Lup;)V")
    public class272(class278 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(II)I")
    public final int method75(int arg0, int arg1) {
        ++field3798;
        if (super.field6171.method1672(arg0)) {
            return 3;
        } else {
            return super.field6171.method1671(arg0 ^ 7108) == class628.field8355 ? 1 : 3;
        }
    }

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "(Z)I")
    public final int method1631(boolean arg0) {
        ++field3790;
        return !arg0 ? 77 : super.field6170;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IILfha;B)V")
    public static final void method1632(int arg0, int arg1, class383 arg2, byte arg3) {
        ++field3792;
        int[] var4 = new int[4];
        class335.method2021(var4, 0, var4.length, arg0);
        class585.method3194(arg1, arg2, (byte) 62, var4);
        if (arg3 != -83) {
            field3789 = 9;
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(ZI)V")
    public final void method67(boolean arg0, int arg1) {
        if (!arg0) {
            this.method68(true);
        }
        super.field6170 = arg1;
        ++field3796;
    }

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "(B)V")
    public static final void method1633(byte arg0) {
        ++field3791;
        for (int var1 = 0; ~var1 > -6; ++var1) {
            class555.field7298[var1] = false;
        }
        if (arg0 != 77) {
            method1632(99, 126, (class383) null, (byte) -37);
        }
        class5.field132 = -1;
        class20.field337 = -1;
        class12.field193 = -1;
        class264.field3680 = -1;
        class278.field3898 = 1;
        class4.field120 = 0;
        class489.field6634 = 0;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(B)V")
    public final void method73(byte arg0) {
        ++field3797;
        if (super.field6171.method1671(7108) != class628.field8355) {
            super.field6170 = 1;
        } else if (super.field6171.method1672(0)) {
            super.field6170 = 0;
        }
        if (~super.field6170 != -1 && ~super.field6170 != -2) {
            super.field6170 = this.method68(false);
        }
        if (arg0 != 98) {
            method1632(-39, -51, (class383) null, (byte) 89);
        }
    }

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "(I)Z")
    public final boolean method1634(int arg0) {
        ++field3794;
        if (super.field6171.method1672(0)) {
            return false;
        } else if (super.field6171.method1671(7108) == class628.field8355) {
            return true;
        } else {
            if (arg0 != 260) {
                field3789 = 105;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Z)I")
    public final int method68(boolean arg0) {
        if (arg0) {
            field3789 = -77;
        }
        ++field3793;
        return 1;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lwu;ZII)Lav;")
    public static final class640 method1635(class376 arg0, boolean arg1, int arg2, int arg3) {
        ++field3795;
        class677 var4 = new class677(arg0.method2218((byte) 114, arg3, arg2));
        class640 var5 = new class640(arg2, var4.method3793(15598), var4.method3793(15598), var4.method3799(false), var4.method3799(arg1), var4.method3821((byte) 105) == 1, var4.method3821((byte) -86), var4.method3821((byte) -82));
        int var6 = var4.method3821((byte) 79);
        for (int var7 = 0; var6 > var7; ++var7) {
            var5.field8485.method11(new class183(var4.method3821((byte) -56), var4.method3807(-1), var4.method3807(-1), var4.method3807(-1), var4.method3807(-1), var4.method3807(-1), var4.method3807(-1), var4.method3807(-1), var4.method3807(-1)), -105);
        }
        var5.method3502((byte) 56);
        return var5;
    }

    @OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(ILup;)V")
    public class272(int arg0, class278 arg1) {
        super(arg0, arg1);
    }
}
