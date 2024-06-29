import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bka")
public class class178 extends class207 {

    @OriginalMember(owner = "client!bka", name = "n", descriptor = "Lmw;")
    public static class517 field2350 = new class517(12, -1);

    @OriginalMember(owner = "client!bka", name = "o", descriptor = "Z")
    public static boolean field2351 = false;

    @OriginalMember(owner = "client!bka", name = "p", descriptor = "I")
    public static int field2352 = 0;

    @OriginalMember(owner = "client!bka", name = "g", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!bka", name = "h", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!bka", name = "i", descriptor = "I")
    public static int field2345;

    @OriginalMember(owner = "client!bka", name = "j", descriptor = "I")
    public static int field2346;

    @OriginalMember(owner = "client!bka", name = "k", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!bka", name = "l", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!bka", name = "m", descriptor = "I")
    public static int field2349;

    @OriginalMember(owner = "client!bka", name = "q", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!bka", name = "b", descriptor = "(IB)I")
    public final int method39(int arg0, byte arg1) {
        ++field2343;
        if (class670.method3697(false, arg0)) {
            if (super.field2668.field5141.method2544(0) && !class360.method2283(-1, super.field2668.field5141.method2541(43))) {
                return 3;
            }
            if (super.field2668.field5179.method1441(43) == 1) {
                return 3;
            }
        }
        if (arg0 == 3) {
            return 3;
        } else if (class670.method3697(false, arg0)) {
            return 2;
        } else {
            return arg1 != 69 ? -103 : 1;
        }
    }

    @OriginalMember(owner = "client!bka", name = "<init>", descriptor = "(ILrd;)V")
    public class178(int arg0, class355 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!bka", name = "b", descriptor = "(I)I")
    public final int method36(int arg0) {
        if (arg0 > -14) {
            field2350 = null;
        }
        ++field2345;
        return 0;
    }

    @OriginalMember(owner = "client!bka", name = "<init>", descriptor = "(Lrd;)V")
    public class178(class355 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!bka", name = "a", descriptor = "(IB)V")
    public final void method41(int arg0, byte arg1) {
        ++field2348;
        super.field2669 = arg0;
        if (arg1 > -7) {
            field2351 = false;
        }
    }

    @OriginalMember(owner = "client!bka", name = "a", descriptor = "(I)V")
    public final void method37(int arg0) {
        if (this.method1215((byte) -53)) {
            if (super.field2668.field5141.method2544(0) && !class360.method2283(-1, super.field2668.field5141.method2541(43))) {
                super.field2669 = 1;
            }
            if (super.field2668.field5179.method1441(43) == 1) {
                super.field2669 = 1;
            }
        }
        ++field2344;
        if (super.field2669 == 3) {
            super.field2669 = 2;
        }
        if (super.field2669 < 0 || super.field2669 > 3) {
            super.field2669 = this.method36(-84);
        }
        int var2 = 55 % ((-58 - arg0) / 48);
    }

    @OriginalMember(owner = "client!bka", name = "c", descriptor = "(I)V")
    public static void method1213(int arg0) {
        if (arg0 != 3) {
            field2351 = true;
        }
        field2350 = null;
    }

    @OriginalMember(owner = "client!bka", name = "a", descriptor = "(B)Z")
    public final boolean method1214(byte arg0) {
        ++field2347;
        return arg0 != 8 ? true : true;
    }

    @OriginalMember(owner = "client!bka", name = "b", descriptor = "(B)Z")
    public final boolean method1215(byte arg0) {
        ++field2349;
        int var2 = -43 % ((arg0 - -17) / 35);
        return class670.method3697(false, super.field2669);
    }

    @OriginalMember(owner = "client!bka", name = "d", descriptor = "(I)I")
    public final int method1216(int arg0) {
        ++field2353;
        if (arg0 != 43) {
            method1213(73);
        }
        return super.field2669;
    }

    @OriginalMember(owner = "client!bka", name = "a", descriptor = "(ZIIIII)V")
    public static final void method1217(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2346;
        if (arg5 != 32753) {
            field2350 = null;
        }
        long var6 = (long) (arg3 | (arg0 ? Integer.MIN_VALUE : 0));
        class358 var8 = (class358) class790.field10847.method1248(arg5 + -32627, var6);
        if (var8 == null) {
            var8 = new class358();
            class790.field10847.method1247(arg5 ^ 28695, var6, var8);
        }
        if (arg4 >= var8.field5210.length) {
            int[] var9 = new int[arg4 + 1];
            int[] var10 = new int[arg4 + 1];
            for (int var11 = 0; ~var11 > ~var8.field5210.length; ++var11) {
                var9[var11] = var8.field5210[var11];
                var10[var11] = var8.field5213[var11];
            }
            for (int var12 = var8.field5210.length; var12 < arg4; ++var12) {
                var9[var12] = -1;
                var10[var12] = 0;
            }
            var8.field5210 = var9;
            var8.field5213 = var10;
        }
        var8.field5210[arg4] = arg2;
        var8.field5213[arg4] = arg1;
    }
}
