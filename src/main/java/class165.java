import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class165 extends class168 implements class164 {

    @OriginalMember(owner = "client!nj", name = "D", descriptor = "Lsr;")
    public class168 field2426;

    @OriginalMember(owner = "client!nj", name = "I", descriptor = "[I")
    public static int[] field2431 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!nj", name = "u", descriptor = "I")
    public static int field2417;

    @OriginalMember(owner = "client!nj", name = "v", descriptor = "I")
    public static int field2418;

    @OriginalMember(owner = "client!nj", name = "w", descriptor = "I")
    public static int field2419;

    @OriginalMember(owner = "client!nj", name = "x", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!nj", name = "y", descriptor = "I")
    public static int field2421;

    @OriginalMember(owner = "client!nj", name = "z", descriptor = "I")
    public static int field2422;

    @OriginalMember(owner = "client!nj", name = "A", descriptor = "I")
    public static int field2423;

    @OriginalMember(owner = "client!nj", name = "B", descriptor = "I")
    public static int field2424;

    @OriginalMember(owner = "client!nj", name = "C", descriptor = "I")
    public static int field2425;

    @OriginalMember(owner = "client!nj", name = "E", descriptor = "I")
    public static int field2427;

    @OriginalMember(owner = "client!nj", name = "F", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!nj", name = "G", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!nj", name = "H", descriptor = "I")
    public static int field2430;

    @OriginalMember(owner = "client!nj", name = "J", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!nj", name = "K", descriptor = "I")
    public static int field2433;

    @OriginalMember(owner = "client!nj", name = "L", descriptor = "I")
    public static int field2434;

    @OriginalMember(owner = "client!nj", name = "M", descriptor = "I")
    public static int field2435;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)I")
    public final int method624(byte arg0) {
        if (arg0 >= -119) {
            field2422 = 14;
        }
        field2435++;
        return 0;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ZLya;)V")
    public final void method619(boolean arg0, class38 arg1) {
        if (!arg0) {
            this.method616(117);
        }
        field2425++;
    }

    @OriginalMember(owner = "client!nj", name = "j", descriptor = "(I)V")
    public static void method1099(int arg0) {
        field2431 = null;
        if (arg0 != 0) {
            field2422 = 97;
        }
    }

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "(I)I")
    public final int method627(int arg0) {
        if (arg0 != 23326) {
            field2431 = null;
        }
        field2423++;
        return 0;
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)V")
    public final void method616(int arg0) {
        field2420++;
        if (arg0 != 23504) {
            this.method25(null, true);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIB)V")
    public static final void method1100(int arg0, int arg1, int arg2, byte arg3) {
        class476.field6873 = new byte[arg0][arg1][arg2];
        if (arg3 <= 95) {
            method1102(16, 48, 84, 70, 50, 1, 99);
        }
        field2428++;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lya;ZI)Lt;")
    public final class475 method615(class38 arg0, boolean arg1, int arg2) {
        if (arg1) {
            field2422 = 81;
        }
        field2430++;
        return null;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(BII)I")
    public static final int method1101(byte arg0, int arg1, int arg2) {
        field2429++;
        int var3 = class310.method1982(arg2 + 45365, 4, arg1 + 91923, 123) + (class310.method1982(arg2 + 10294, 2, arg1 + 37821, arg0 ^ 0xFFFFFF9B) - 128 >> 1) + (class310.method1982(arg2, 1, arg1, 121) - 128 >> 2) - 128;
        if (arg0 != -22) {
            method1102(-19, 124, 70, 36, -60, -65, -43);
        }
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "(I)Z")
    public final boolean method614(int arg0) {
        field2418++;
        return arg0 != -1086;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIIIII)Lpc;")
    public static final class477 method1102(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2427++;
        long var7 = (long) arg5 * 475427L ^ (long) arg4 * 67481L ^ (long) arg2 * 97549L ^ (long) arg0 * 986053L ^ (long) arg3 * 32147369L ^ (long) arg1 * 76724863L;
        if (arg6 != 60) {
            return null;
        }
        class477 var9 = (class477) class237.field3805.method87(var7, -2062335807);
        if (var9 == null) {
            class477 var10 = class181.field2717.method298(arg4, arg2, arg5, arg0, arg3, arg1);
            class237.field3805.method84(var7, var10, (byte) 27);
            return var10;
        } else {
            return var9;
        }
    }

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "(I)I")
    public final int method1079(int arg0) {
        if (arg0 == 0) {
            field2434++;
            return 0;
        } else {
            return 121;
        }
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(IIIIILsr;)V")
    public class165(int arg0, int arg1, int arg2, int arg3, int arg4, class168 arg5) {
        super(arg2, arg3, arg4, 0, 0, 0, class257.method1715(arg0, arg1, 24088));
        this.field2426 = arg5;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(BLya;II)Z")
    public final boolean method27(byte arg0, class38 arg1, int arg2, int arg3) {
        if (arg0 >= -119) {
            return false;
        } else {
            field2421++;
            return false;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIIILkd;)Loi;")
    public static final class53 method1103(int arg0, int arg1, int arg2, int arg3, int arg4, class188 arg5) {
        if (arg2 != 3553) {
            field2431 = null;
        }
        field2417++;
        if (!arg5.field3077 && (!class474.method2851(arg4, (byte) -3) || !class474.method2851(arg0, (byte) -47))) {
            return arg5.field3051 ? new class53(arg5, 34037, arg3, arg1, arg4, arg0, true) : new class53(arg5, arg3, arg1, arg4, arg0, class396.method2493((byte) 66, arg4), class396.method2493((byte) 66, arg0), true);
        } else {
            return new class53(arg5, 3553, arg3, arg1, arg4, arg0, true);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ILya;)V")
    public final void method623(int arg0, class38 arg1) {
        field2419++;
        if (arg0 <= 125) {
            field2431 = null;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)I")
    public final int method621(int arg0) {
        if (arg0 == 3021) {
            field2424++;
            return 0;
        } else {
            return 54;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lya;Z)V")
    public final void method25(class38 arg0, boolean arg1) {
        field2432++;
        if (arg1) {
            method1099(-107);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lya;I)Lag;")
    public final class484 method29(class38 arg0, int arg1) {
        field2433++;
        return arg1 < 22 ? null : null;
    }
}
