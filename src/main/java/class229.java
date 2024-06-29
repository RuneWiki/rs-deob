import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class229 extends class441 {

    @OriginalMember(owner = "client!j", name = "y", descriptor = "I")
    private int field3508;

    @OriginalMember(owner = "client!j", name = "x", descriptor = "I")
    private int field3507;

    @OriginalMember(owner = "client!j", name = "q", descriptor = "I")
    private int field3500;

    @OriginalMember(owner = "client!j", name = "p", descriptor = "I")
    private int field3499;

    @OriginalMember(owner = "client!j", name = "s", descriptor = "I")
    private int field3502;

    @OriginalMember(owner = "client!j", name = "w", descriptor = "I")
    private int field3506;

    @OriginalMember(owner = "client!j", name = "l", descriptor = "I")
    private int field3495;

    @OriginalMember(owner = "client!j", name = "k", descriptor = "I")
    private int field3494;

    @OriginalMember(owner = "client!j", name = "u", descriptor = "I")
    public static int field3504 = 64;

    @OriginalMember(owner = "client!j", name = "r", descriptor = "Lwl;")
    public static class452 field3501 = new class452(20, -1);

    @OriginalMember(owner = "client!j", name = "j", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "client!j", name = "n", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!j", name = "o", descriptor = "I")
    public static int field3498;

    @OriginalMember(owner = "client!j", name = "t", descriptor = "I")
    public static int field3503;

    @OriginalMember(owner = "client!j", name = "v", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!j", name = "z", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!j", name = "A", descriptor = "I")
    public static int field3510;

    @OriginalMember(owner = "client!j", name = "B", descriptor = "I")
    public static int field3511;

    @OriginalMember(owner = "client!j", name = "m", descriptor = "Lbg;")
    public static class246 field3496;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(III)V")
    public final void method176(int arg0, int arg1, int arg2) {
        ++field3493;
        if (arg1 != 307) {
            method1389(true, -66);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ZI)V")
    public static final void method1389(boolean arg0, int arg1) {
        ++field3497;
        byte[][] var2;
        byte var3;
        if (!arg0) {
            var2 = class446.field6568;
            var3 = 4;
        } else {
            var2 = class154.field2122;
            var3 = 1;
        }
        for (int var4 = arg1; var4 < var3; ++var4) {
            class374.method2244((byte) -78);
            for (int var5 = 0; ~var5 > ~(class115.field1522 >> 3); ++var5) {
                for (int var6 = 0; ~var6 > ~(class198.field3004 >> 3); ++var6) {
                    int var7 = class310.field4666[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = var7 >> 24 & 3;
                        if (!arg0 || var8 == 0) {
                            int var9 = var7 >> 1 & 3;
                            int var10 = var7 >> 14 & 1023;
                            int var11 = 2047 & var7 >> 3;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class161.field2243.length; ++var13) {
                                if (~class161.field2243[var13] == ~var12 && var2[var13] != null) {
                                    class153.method948(var9, (7 & var11) * 8, var8, var4, arg0, var5 * 8, var2[var13], (7 & var10) * 8, class449.field6599, class196.field2965, var6 * 8, (byte) 26);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIII)V")
    public static final void method1390(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 17 % ((-12 - arg1) / 48);
        ++field3511;
        class32 var5 = class136.method854(9, (byte) 114, arg2);
        var5.method194(false);
        var5.field412 = arg3;
        var5.field404 = arg0;
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class229(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field3508 = arg0;
        this.field3507 = arg3;
        this.field3500 = arg5;
        this.field3499 = arg4;
        this.field3502 = arg2;
        this.field3506 = arg6;
        this.field3495 = arg7;
        this.field3494 = arg1;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(BII)V")
    public final void method175(byte arg0, int arg1, int arg2) {
        if (arg0 > -67) {
            method1393(-54, (byte) -80);
        }
        ++field3510;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(II)V")
    public static final void method1391(int arg0, int arg1) {
        ++field3505;
        class241 var2 = class386.field5705;
        synchronized (class386.field5705) {
            class386.field5705.method1481(3, arg1);
        }
        class241 var3 = class306.field4633;
        synchronized (class306.field4633) {
            class306.field4633.method1481(3, arg1);
            if (arg0 != 64) {
                field3504 = -72;
            }
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IZI)V")
    public final void method174(int arg0, boolean arg1, int arg2) {
        ++field3503;
        int var4 = this.field3508 * arg2 >> 12;
        int var5 = this.field3494 * arg0 >> 12;
        int var6 = this.field3502 * arg2 >> 12;
        int var7 = this.field3507 * arg0 >> 12;
        if (!arg1) {
            method1393(-48, (byte) 24);
        }
        int var8 = this.field3499 * arg2 >> 12;
        int var9 = this.field3500 * arg0 >> 12;
        int var10 = this.field3506 * arg2 >> 12;
        int var11 = this.field3495 * arg0 >> 12;
        class396.method2500(super.field6485, var8, var10, var4, var9, 14088, var11, var7, var6, var5);
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(I)V")
    public static void method1392(int arg0) {
        field3496 = null;
        if (arg0 == 5784) {
            field3501 = null;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IB)Lsi;")
    public static final class94 method1393(int arg0, byte arg1) {
        ++field3498;
        if (arg1 != 36) {
            field3496 = null;
        }
        class94 var2 = (class94) class143.field1909.method1491((long) arg0, arg1 + -36);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class169.field2429.method823(29, -20334, arg0);
            class94 var4 = new class94();
            if (var3 != null) {
                var4.method619(126, arg0, new class385(var3));
            }
            class143.field1909.method1488(arg1 ^ 164, (long) arg0, var4);
            return var4;
        }
    }
}
