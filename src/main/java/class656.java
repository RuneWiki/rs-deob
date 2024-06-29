import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class656 extends class260 {

    @OriginalMember(owner = "client!sn", name = "q", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field9146 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!sn", name = "h", descriptor = "I")
    public static int field9137;

    @OriginalMember(owner = "client!sn", name = "i", descriptor = "I")
    public static int field9138;

    @OriginalMember(owner = "client!sn", name = "k", descriptor = "I")
    public static int field9140;

    @OriginalMember(owner = "client!sn", name = "l", descriptor = "I")
    public static int field9141;

    @OriginalMember(owner = "client!sn", name = "m", descriptor = "I")
    public static int field9142;

    @OriginalMember(owner = "client!sn", name = "n", descriptor = "I")
    public static int field9143;

    @OriginalMember(owner = "client!sn", name = "o", descriptor = "I")
    public static int field9144;

    @OriginalMember(owner = "client!sn", name = "p", descriptor = "I")
    public static int field9145;

    @OriginalMember(owner = "client!sn", name = "r", descriptor = "I")
    public static int field9147;

    @OriginalMember(owner = "client!sn", name = "j", descriptor = "[S")
    public static short[] field9139;

    @OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(ILgn;)V", line = 6)
    public class656(int arg0, class729 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(Lgn;)V", line = 10)
    public class656(class729 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(ZLmea;IIB)V", line = 15)
    public static final void method3750(boolean arg0, class451 arg1, int arg2, int arg3, byte arg4) {
        ++field9147;
        int var5 = arg1.field6290;
        int var6 = arg1.field6288;
        if (arg4 < 71) {
            method3750(true, (class451) null, 82, -107, (byte) 109);
        }
        if (arg1.field6286 != 0) {
            if (~arg1.field6286 != -2) {
                if (arg1.field6286 == 2) {
                    arg1.field6290 = arg1.field6202 * arg2 >> 14;
                }
            } else {
                arg1.field6290 = -arg1.field6202 + arg2;
            }
        } else {
            arg1.field6290 = arg1.field6202;
        }
        if (arg1.field6327 == 0) {
            arg1.field6288 = arg1.field6257;
        } else if (~arg1.field6327 == -2) {
            arg1.field6288 = -arg1.field6257 + arg3;
        } else if (~arg1.field6327 == -3) {
            arg1.field6288 = arg1.field6257 * arg3 >> 14;
        }
        if (~arg1.field6286 == -5) {
            arg1.field6290 = arg1.field6288 * arg1.field6234 / arg1.field6294;
        }
        if (~arg1.field6327 == -5) {
            arg1.field6288 = arg1.field6294 * arg1.field6290 / arg1.field6234;
        }
        if (class81.field901 && (client.method2046(arg1).field441 != 0 || arg1.field6210 == 0)) {
            if (~arg1.field6288 > -6 && ~arg1.field6290 > -6) {
                arg1.field6288 = 5;
                arg1.field6290 = 5;
            } else {
                if (arg1.field6290 <= 0) {
                    arg1.field6290 = 5;
                }
                if (arg1.field6288 <= 0) {
                    arg1.field6288 = 5;
                }
            }
        }
        if (class256.field3762 == arg1.field6271) {
            class209.field3245 = arg1;
        }
        if (arg0 && arg1.field6184 != null) {
            if (arg1.field6290 != var5 || arg1.field6288 != var6) {
                class166 var7 = new class166();
                var7.field2627 = arg1;
                var7.field2619 = arg1.field6184;
                class208.field3220.method1727(var7, (byte) 116);
            }
        }
    }

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "(I)V", line = 91)
    public static void method3751(int arg0) {
        field9139 = null;
        field9146 = null;
        if (arg0 != -5) {
            method3753(-79, -42);
        }
    }

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "(I)I", line = 102)
    public final int method123(int arg0) {
        if (arg0 != 4377) {
            return -38;
        } else {
            ++field9143;
            if (!super.field3829.method4076(-5569)) {
                return super.field3829.field10098.method1591(104) && class211.method1452(super.field3829.field10098.method1588(-113), arg0 ^ 4415) ? 1 : 0;
            } else {
                return 2;
            }
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IB)V", line = 124)
    public final void method128(int arg0, byte arg1) {
        super.field3828 = arg0;
        ++field9141;
        if (arg1 != 122) {
            method3750(true, (class451) null, -6, 62, (byte) -40);
        }
    }

    @OriginalMember(owner = "client!sn", name = "e", descriptor = "(I)I", line = 135)
    public final int method3752(int arg0) {
        if (arg0 > -14) {
            return 24;
        } else {
            ++field9145;
            return super.field3828;
        }
    }

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "(II)Z", line = 146)
    public static final boolean method3753(int arg0, int arg1) {
        if (arg1 < 26) {
            return true;
        } else {
            ++field9140;
            return ~arg0 == -4 || arg0 == 7 || arg0 == 10;
        }
    }

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "(II)I", line = 158)
    public final int method129(int arg0, int arg1) {
        ++field9137;
        if (super.field3829.method4076(-5569)) {
            return 3;
        } else {
            if (arg0 != -1) {
                this.method123(72);
            }
            return 1;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)V", line = 179)
    public final void method126(int arg0) {
        if (super.field3829.method4076(-5569)) {
            super.field3828 = 2;
        }
        ++field9138;
        if (arg0 >= 102) {
            if (super.field3828 < 0 || ~super.field3828 < -3) {
                super.field3828 = this.method123(4377);
            }
        }
    }

    @OriginalMember(owner = "client!sn", name = "f", descriptor = "(I)Z", line = 200)
    public final boolean method3754(int arg0) {
        if (arg0 < 73) {
            this.method126(79);
        }
        ++field9142;
        return !super.field3829.method4076(-5569);
    }
}
