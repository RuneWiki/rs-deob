import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class412 extends class65 {

    @OriginalMember(owner = "client!f", name = "L", descriptor = "F")
    public float field6075;

    @OriginalMember(owner = "client!f", name = "Q", descriptor = "F")
    public float field6080;

    @OriginalMember(owner = "client!f", name = "W", descriptor = "Z")
    public boolean field6086;

    @OriginalMember(owner = "client!f", name = "M", descriptor = "I")
    public int field6076;

    @OriginalMember(owner = "client!f", name = "N", descriptor = "I")
    public int field6077;

    @OriginalMember(owner = "client!f", name = "P", descriptor = "[I")
    public static int[] field6079 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!f", name = "U", descriptor = "[Lok;")
    public static class74[] field6084 = new class74[6];

    @OriginalMember(owner = "client!f", name = "R", descriptor = "I")
    public static int field6081 = 0;

    @OriginalMember(owner = "client!f", name = "S", descriptor = "[S")
    public static short[] field6082 = new short[] { 17, 15, 18, 19, 3, 8, 48, 50 };

    @OriginalMember(owner = "client!f", name = "K", descriptor = "I")
    public static int field6074;

    @OriginalMember(owner = "client!f", name = "O", descriptor = "I")
    public static int field6078;

    @OriginalMember(owner = "client!f", name = "T", descriptor = "I")
    public static int field6083;

    @OriginalMember(owner = "client!f", name = "X", descriptor = "I")
    public static int field6087;

    @OriginalMember(owner = "client!f", name = "V", descriptor = "[I")
    public static int[] field6085;

    @OriginalMember(owner = "client!f", name = "f", descriptor = "(I)V")
    public static final void method2587(int arg0) {
        class312.field4752.field2982 = 0;
        ++field6078;
        class457.field6788 = 0;
        class61.field978 = 0;
        class404.field5966 = null;
        class429.field6369 = 0;
        class136.field2073 = null;
        class498.field7255 = null;
        class424.field6231.field2982 = 0;
        class527.field7716 = null;
        class285.method1915(3);
        class118.method890((byte) 101);
        for (int var1 = 0; ~var1 > -2049; ++var1) {
            class530.field7747[var1] = null;
        }
        class116.field1781 = null;
        for (int var2 = 0; var2 < field6081; ++var2) {
            class46 var4 = class166.field2507[var2].field65;
            if (var4 != null) {
                var4.field7624 = -1;
            }
        }
        class393.method2473(0);
        class33.field401 = 1;
        class376.method2400(9, (byte) 107);
        for (int var3 = 0; ~var3 > -101; ++var3) {
            class434.field6439[var3] = true;
        }
        class537.method3162((byte) -124);
        class202.field3124 = (long) arg0;
        class524.field7690 = null;
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "(Ltt;IIIIIZ)V")
    public class412(class249 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        if (super.field2564 != 34037) {
            this.field6080 = this.field6075 = 1.0F;
            this.field6086 = true;
        } else {
            this.field6080 = (float) arg4;
            this.field6075 = (float) arg5;
            this.field6086 = false;
        }
        this.field6076 = arg4;
        this.field6077 = arg5;
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "(Ltt;IIIIZ[BI)V")
    public class412(class249 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        if (~super.field2564 == -34038) {
            this.field6086 = false;
            this.field6080 = (float) arg3;
            this.field6075 = (float) arg4;
        } else {
            this.field6080 = this.field6075 = 1.0F;
            this.field6086 = true;
        }
        this.field6076 = arg3;
        this.field6077 = arg4;
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "(Ltt;IIIZ[I)V")
    public class412(class249 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
        this.field6077 = arg3;
        this.field6076 = arg2;
        if (~super.field2564 == -34038) {
            this.field6080 = (float) arg2;
            this.field6086 = false;
            this.field6075 = (float) arg3;
        } else {
            this.field6080 = this.field6075 = 1.0F;
            this.field6086 = true;
        }
    }

    @OriginalMember(owner = "client!f", name = "g", descriptor = "(I)V")
    public static void method2588(int arg0) {
        field6079 = null;
        field6085 = null;
        if (arg0 != 34037) {
            field6082 = null;
        }
        field6084 = null;
        field6082 = null;
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "(Ltt;IIIIIIZ)V")
    public class412(class249 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field6075 = (float) arg4 / (float) arg6;
        this.field6076 = arg3;
        this.field6086 = false;
        this.field6077 = arg4;
        this.field6080 = (float) arg3 / (float) arg5;
        this.method437(false, (byte) -104, false);
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "(Ltt;IIII[I)V")
    public class412(class249 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field6076 = arg1;
        this.field6077 = arg2;
        this.method441(0, 0, 0, arg1, (byte) -37, arg5, 0, arg2, true);
        this.field6080 = (float) arg1 / (float) arg3;
        this.field6075 = (float) arg2 / (float) arg4;
        this.field6086 = false;
        this.method437(false, (byte) 94, false);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(III)I")
    public static final int method2589(int arg0, int arg1, int arg2) {
        ++field6087;
        if (arg1 == -1) {
            return 12345678;
        } else {
            int var3 = (arg1 & 127) * arg2 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (~var3 < -127) {
                var3 = 126;
            }
            if (arg0 <= 55) {
                field6084 = null;
            }
            return (arg1 & 65408) + var3;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIB)I")
    public static final int method2590(int arg0, int arg1, byte arg2) {
        int var3 = (127 & arg1) * arg0 >> 7;
        if (arg2 <= 35) {
            method2590(-81, -15, (byte) 100);
        }
        ++field6074;
        if (~var3 <= -3) {
            if (var3 > 126) {
                var3 = 126;
            }
        } else {
            var3 = 2;
        }
        return (arg1 & 65408) - -var3;
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "(Ltt;IIIII[BI)V")
    public class412(class249 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field6077 = arg3;
        this.field6076 = arg2;
        this.method442(0, 0, arg3, 0, 0, arg6, arg7, arg2, true, 3314);
        this.field6075 = (float) arg3 / (float) arg5;
        this.field6080 = (float) arg2 / (float) arg4;
        this.field6086 = false;
        this.method437(false, (byte) -95, false);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIII)V")
    public static final void method2591(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field6083;
        if (~arg3 >= ~arg0) {
            for (int var5 = arg3; var5 < arg0; ++var5) {
                class402.field5946[var5][arg2] = arg1;
            }
        } else {
            for (int var6 = arg0; ~arg3 < ~var6; ++var6) {
                class402.field5946[var6][arg2] = arg1;
            }
        }
        if (arg4 > -66) {
            field6082 = null;
        }
    }
}
