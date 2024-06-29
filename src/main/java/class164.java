import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!faa")
public class class164 extends class260 {

    @OriginalMember(owner = "client!faa", name = "l", descriptor = "[S")
    public static short[] field2597 = new short[] { 47, 8, 4, 52, 11, 13, 12, 21 };

    @OriginalMember(owner = "client!faa", name = "p", descriptor = "[Lpq;")
    public static class205[] field2601 = new class205[1024];

    @OriginalMember(owner = "client!faa", name = "h", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!faa", name = "i", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!faa", name = "j", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!faa", name = "k", descriptor = "I")
    public static int field2596;

    @OriginalMember(owner = "client!faa", name = "m", descriptor = "I")
    public static int field2598;

    @OriginalMember(owner = "client!faa", name = "n", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!faa", name = "o", descriptor = "I")
    public static int field2600;

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(B)V", line = 5)
    public static void method1227(byte arg0) {
        if (arg0 >= -9) {
            field2601 = null;
        }
        field2601 = null;
        field2597 = null;
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(I)V", line = 18)
    public final void method126(int arg0) {
        if (arg0 <= 102) {
            method1230((byte[][]) null, (class381) null, -127);
        }
        ++field2594;
        if (super.field3829.method4076(-5569)) {
            super.field3828 = 0;
        }
        if (super.field3828 != 1 && super.field3828 != 0) {
            super.field3828 = this.method123(4377);
        }
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(IB)V", line = 36)
    public final void method128(int arg0, byte arg1) {
        ++field2600;
        if (arg1 != 122) {
            field2597 = null;
        }
        super.field3828 = arg0;
    }

    @OriginalMember(owner = "client!faa", name = "b", descriptor = "(I)I", line = 47)
    public final int method123(int arg0) {
        ++field2593;
        if (arg0 != 4377) {
            this.method1228(-101);
        }
        return 1;
    }

    @OriginalMember(owner = "client!faa", name = "<init>", descriptor = "(Lgn;)V", line = 59)
    public class164(class729 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!faa", name = "<init>", descriptor = "(ILgn;)V", line = 62)
    public class164(int arg0, class729 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!faa", name = "d", descriptor = "(I)Z", line = 65)
    public final boolean method1228(int arg0) {
        ++field2599;
        if (super.field3829.method4076(-5569)) {
            return false;
        } else {
            if (arg0 < 73) {
                this.method128(106, (byte) -113);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!faa", name = "c", descriptor = "(II)I", line = 81)
    public final int method129(int arg0, int arg1) {
        if (arg0 != -1) {
            this.method1228(-51);
        }
        ++field2596;
        return super.field3829.method4076(-5569) ? 3 : 1;
    }

    @OriginalMember(owner = "client!faa", name = "e", descriptor = "(I)I", line = 96)
    public final int method1229(int arg0) {
        ++field2598;
        return arg0 > -14 ? -58 : super.field3828;
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "([[BLrr;I)V", line = 112)
    public static final void method1230(byte[][] arg0, class381 arg1, int arg2) {
        if (arg2 != -6030) {
            field2597 = null;
        }
        ++field2595;
        for (int var3 = 0; ~arg1.field7824 < ~var3; ++var3) {
            class265.method1722(16033);
            for (int var4 = 0; class768.field10571 >> 3 > var4; ++var4) {
                for (int var5 = 0; class350.field4898 >> 3 > var5; ++var5) {
                    int var6 = class650.field9080[var3][var4][var5];
                    if (~var6 != 0) {
                        int var7 = (58379660 & var6) >> 24;
                        if (!arg1.field7823 || ~var7 == -1) {
                            int var8 = (var6 & 7) >> 1;
                            int var9 = 1023 & var6 >> 14;
                            int var10 = 2047 & var6 >> 3;
                            int var11 = (var9 / 8 << 8) + var10 / 8;
                            for (int var12 = 0; ~class551.field7919.length < ~var12; ++var12) {
                                if (~class551.field7919[var12] == ~var11 && arg0[var12] != null) {
                                    arg1.method2371(arg0[var12], arg2 + 6032, var8, (7 & var9) * 8, class37.field491, var7, var3, var5 * 8, (var10 & 7) * 8, class346.field4838, var4 * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
