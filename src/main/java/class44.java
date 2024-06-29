import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class44 extends class60 implements class116 {

    @OriginalMember(owner = "client!lj", name = "x", descriptor = "Lva;")
    public class60 field552;

    @OriginalMember(owner = "client!lj", name = "H", descriptor = "Lsd;")
    public static class74 field562 = new class74(57, 10);

    @OriginalMember(owner = "client!lj", name = "M", descriptor = "I")
    public static int field567 = 0;

    @OriginalMember(owner = "client!lj", name = "L", descriptor = "[Lc;")
    public static class172[] field566 = new class172[16];

    @OriginalMember(owner = "client!lj", name = "t", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "client!lj", name = "u", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!lj", name = "v", descriptor = "I")
    public static int field550;

    @OriginalMember(owner = "client!lj", name = "w", descriptor = "I")
    public static int field551;

    @OriginalMember(owner = "client!lj", name = "y", descriptor = "I")
    public static int field553;

    @OriginalMember(owner = "client!lj", name = "z", descriptor = "I")
    public static int field554;

    @OriginalMember(owner = "client!lj", name = "A", descriptor = "I")
    public static int field555;

    @OriginalMember(owner = "client!lj", name = "B", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!lj", name = "C", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client!lj", name = "D", descriptor = "I")
    public static int field558;

    @OriginalMember(owner = "client!lj", name = "E", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "client!lj", name = "F", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!lj", name = "G", descriptor = "I")
    public static int field561;

    @OriginalMember(owner = "client!lj", name = "I", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!lj", name = "J", descriptor = "I")
    public static int field564;

    @OriginalMember(owner = "client!lj", name = "N", descriptor = "Lbu;")
    public static class237 field568;

    @OriginalMember(owner = "client!lj", name = "K", descriptor = "[Ljava/lang/String;")
    public static String[] field565;

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "(I)V", line = 3)
    public final void method32(int arg0) {
        field561++;
        if (arg0 != -2) {
            this.method16(false);
        }
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(B)I", line = 16)
    public final int method31(byte arg0) {
        int var2 = 44 % ((arg0 + 23) / 35);
        field554++;
        return 0;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V", line = 26)
    public final void method24(int arg0) {
        if (arg0 > 41) {
            field559++;
        }
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(I)Z", line = 36)
    public final boolean method22(int arg0) {
        field558++;
        return arg0 > -32;
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(B)V", line = 51)
    public static void method228(byte arg0) {
        if (arg0 < -3) {
            field562 = null;
            field568 = null;
            field566 = null;
            field565 = null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(IIILva;)V", line = 64)
    public class44(int arg0, int arg1, int arg2, class60 arg3) {
        super(arg0, arg1, arg2, false, false);
        this.field552 = arg3;
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(ILoj;)Lmg;", line = 72)
    public final class451 method19(int arg0, class280 arg1) {
        if (arg0 <= 95) {
            return null;
        } else {
            field560++;
            return null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "(I)Z", line = 84)
    public final boolean method33(int arg0) {
        if (arg0 == 1957) {
            field549++;
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(ILoj;)V", line = 97)
    public final void method18(int arg0, class280 arg1) {
        field564++;
        int var3 = -50 % ((62 - arg0) / 63);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Z)I", line = 108)
    public final int method16(boolean arg0) {
        field550++;
        if (arg0) {
            field567 = -82;
        }
        return 0;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILoj;II)Z", line = 119)
    public final boolean method28(int arg0, class280 arg1, int arg2, int arg3) {
        if (arg3 != -6085) {
            this.method26((byte) -36);
        }
        field548++;
        return false;
    }

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "(ILoj;)V", line = 130)
    public final void method27(int arg0, class280 arg1) {
        if (arg0 == 0) {
            field556++;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILoj;)V", line = 141)
    public final void method20(int arg0, class280 arg1) {
        field557++;
        if (arg0 != 5744) {
            this.method19(-88, (class280) null);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIZLa;IBLoj;)V", line = 155)
    public final void method23(int arg0, int arg1, boolean arg2, class78 arg3, int arg4, byte arg5, class280 arg6) {
        field563++;
        if (arg5 != -65) {
            field566 = null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILoj;B)Lqh;", line = 165)
    public final class352 method21(int arg0, class280 arg1, byte arg2) {
        if (arg2 == -98) {
            field553++;
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIIZ)I", line = 190)
    public static final int method229(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg4) {
            return -124;
        } else {
            field551++;
            int var5 = 65536 - class16.field214[arg0 * 8192 / arg3] >> 1;
            return ((65536 - var5) * arg1 >> 16) + (arg2 * var5 >> 16);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(B)I", line = 203)
    public final int method26(byte arg0) {
        field555++;
        if (arg0 != 73) {
            this.method21(-70, (class280) null, (byte) -77);
        }
        return 0;
    }
}
