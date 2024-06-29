import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class296 extends class449 implements class285 {

    @OriginalMember(owner = "client!ls", name = "J", descriptor = "Lie;")
    public class53 field4023;

    @OriginalMember(owner = "client!ls", name = "D", descriptor = "Z")
    private boolean field4017;

    @OriginalMember(owner = "client!ls", name = "U", descriptor = "Lmk;")
    public static class154 field4034 = new class154();

    @OriginalMember(owner = "client!ls", name = "V", descriptor = "Ljava/lang/String;")
    public static String field4035 = "glow3:";

    @OriginalMember(owner = "client!ls", name = "W", descriptor = "Z")
    public static boolean field4036 = false;

    @OriginalMember(owner = "client!ls", name = "Y", descriptor = "[I")
    public static int[] field4038 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

    @OriginalMember(owner = "client!ls", name = "y", descriptor = "I")
    public static int field4013;

    @OriginalMember(owner = "client!ls", name = "z", descriptor = "I")
    public static int field4014;

    @OriginalMember(owner = "client!ls", name = "A", descriptor = "I")
    public static int field4015;

    @OriginalMember(owner = "client!ls", name = "C", descriptor = "I")
    public static int field4016;

    @OriginalMember(owner = "client!ls", name = "E", descriptor = "I")
    public static int field4018;

    @OriginalMember(owner = "client!ls", name = "F", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!ls", name = "G", descriptor = "I")
    public static int field4020;

    @OriginalMember(owner = "client!ls", name = "H", descriptor = "I")
    public static int field4021;

    @OriginalMember(owner = "client!ls", name = "I", descriptor = "I")
    public static int field4022;

    @OriginalMember(owner = "client!ls", name = "K", descriptor = "I")
    public static int field4024;

    @OriginalMember(owner = "client!ls", name = "L", descriptor = "I")
    public static int field4025;

    @OriginalMember(owner = "client!ls", name = "M", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!ls", name = "N", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!ls", name = "O", descriptor = "I")
    public static int field4028;

    @OriginalMember(owner = "client!ls", name = "P", descriptor = "I")
    public static int field4029;

    @OriginalMember(owner = "client!ls", name = "Q", descriptor = "I")
    public static int field4030;

    @OriginalMember(owner = "client!ls", name = "R", descriptor = "I")
    public static int field4031;

    @OriginalMember(owner = "client!ls", name = "S", descriptor = "I")
    public static int field4032;

    @OriginalMember(owner = "client!ls", name = "T", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!ls", name = "X", descriptor = "[I")
    public static int[] field4037;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(BI)V")
    public static final void method1738(byte arg0, int arg1) {
        class432.field6340 = new int[arg1][class315.field4214 + 1][class340.field4549 + 1];
        class398.field5751 = new byte[arg1][class315.field4214 + 1][class340.field4549 + 1];
        class430.field6321 = new byte[arg1][class315.field4214][class340.field4549];
        class172.field2165 = new byte[arg1][class315.field4214][class340.field4549];
        class297.field4045 = 99;
        class284.field3879 = new int[5];
        class159.field2058 = new int[class340.field4549];
        if (arg0 != 110) {
            method1741(7, (class286) null);
        }
        class127.field1645 = new byte[arg1][class315.field4214][class340.field4549];
        class271.field3670 = null;
        class398.field5736 = new int[class340.field4549];
        class177.field2221 = new int[class340.field4549];
        class62.field629 = new byte[arg1][class315.field4214][class340.field4549];
        class172.field2158 = new int[class340.field4549];
        ++field4027;
        class110.field1355 = new int[class340.field4549];
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(ZLvm;)V")
    public final void method357(boolean arg0, class322 arg1) {
        this.field4023.method261(-70, arg1);
        if (!arg0) {
            ++field4032;
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lvm;Z)Ldn;")
    public final class321 method355(class322 arg0, boolean arg1) {
        ++field4014;
        class396 var3 = this.field4023.method258(arg0, super.field6520, 1024, super.field6521, -1, true, arg1);
        if (var3 == null) {
            return null;
        } else {
            class247 var4 = arg0.method1650();
            var4.method747(super.field6521, super.field6527, super.field6520);
            class321 var5 = null;
            if (this.field4017) {
                var5 = class204.method1110(258, 1);
            }
            if (this.field4023.field546 != null) {
                class366 var6 = this.field4023.field546.method917();
                arg0.method1622(var3, var6, var4, var5 != null ? var5.field4293[0] : null, 0);
            } else {
                var3.method2284(var4, var5 != null ? var5.field4293[0] : null, 0);
            }
            this.field4023.method262(super.field6520 >> 7, arg0, super.field6521 >> 7, super.field6520 >> 7, arg1, true, var3, super.field6521 >> 7);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lvm;I)V")
    public final void method352(class322 arg0, int arg1) {
        ++field4019;
        class396 var3 = this.field4023.method258(arg0, super.field6520, 131072, super.field6521, -1, true, true);
        if (var3 != null) {
            this.field4023.method262(super.field6520 >> 7, arg0, super.field6521 >> 7, super.field6520 >> 7, false, false, var3, super.field6521 >> 7);
        }
        if (arg1 != 0) {
            field4034 = null;
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(B)Z")
    public final boolean method358(byte arg0) {
        ++field4029;
        return arg0 != 24 ? true : this.field4023.method256(15842);
    }

    @OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(Lvm;Lds;IIIIIIIZI)V")
    public class296(class322 arg0, class225 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        super(arg6, arg7, arg8, class242.method1299(arg3, arg2, 3));
        this.field4023 = new class53(arg0, arg1, arg2, arg3, arg4, arg5, super.field6521, super.field6520, arg9, arg10);
        this.field4017 = ~arg1.field3027 != -1;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(BLvm;)V")
    public final void method347(byte arg0, class322 arg1) {
        this.field4023.method260(false, arg1);
        ++field4021;
        if (arg0 != -108) {
            this.method356(12);
        }
    }

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "(B)I")
    public final int method351(byte arg0) {
        ++field4020;
        if (arg0 != 103) {
            this.field4023 = null;
        }
        return this.field4023.field532;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lvm;II)Ljn;")
    public final class396 method349(class322 arg0, int arg1, int arg2) {
        if (arg1 != -24206) {
            this.method352((class322) null, -104);
        }
        ++field4015;
        return this.field4023.method258(arg0, 0, arg2, 0, -1, false, false);
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(I)I")
    public final int method356(int arg0) {
        if (arg0 != 10397) {
            this.method352((class322) null, -22);
        }
        ++field4013;
        return this.field4023.field539;
    }

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "(I)I")
    public final int method339(int arg0) {
        int var2 = 4 / ((arg0 - 19) / 32);
        ++field4030;
        return this.field4023.field516;
    }

    @OriginalMember(owner = "client!ls", name = "f", descriptor = "(B)V")
    public static void method1739(byte arg0) {
        field4035 = null;
        field4037 = null;
        if (arg0 != -31) {
            method1739((byte) -47);
        }
        field4034 = null;
        field4038 = null;
    }

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "(I)V")
    public final void method346(int arg0) {
        ++field4028;
        if (arg0 <= -13) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(ZIIILai;ILvm;)V")
    public final void method353(boolean arg0, int arg1, int arg2, int arg3, class128 arg4, int arg5, class322 arg6) {
        if (arg1 < 36) {
            field4038 = null;
        }
        ++field4025;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ls", name = "d", descriptor = "(B)Z")
    public final boolean method345(byte arg0) {
        if (arg0 != -72) {
            return false;
        } else {
            ++field4033;
            return false;
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(IIILvm;)Z")
    public final boolean method344(int arg0, int arg1, int arg2, class322 arg3) {
        ++field4026;
        if (arg0 != -23563) {
            field4036 = true;
        }
        class396 var5 = this.field4023.method258(arg3, super.field6520, 65536, super.field6521, -1, false, false);
        if (var5 == null) {
            return false;
        } else {
            class247 var6 = arg3.method1650();
            var6.method747(super.field6521, super.field6527, super.field6520);
            return var5.method2300(arg1, arg2, var6, false);
        }
    }

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "(B)V")
    public final void method350(byte arg0) {
        if (arg0 < 114) {
            this.field4023 = null;
        }
        ++field4031;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(I[IBII)V")
    public static final void method1740(int arg0, int[] arg1, byte arg2, int arg3, int arg4) {
        ++field4018;
        if (arg2 == 81) {
            --arg0;
            int var13 = arg4 - 1;
            int var5 = -7 + var13;
            while (~arg0 > ~var5) {
                int var6 = arg0 + 1;
                arg1[var6] = arg3;
                int var7 = var6 + 1;
                arg1[var7] = arg3;
                int var8 = var7 + 1;
                arg1[var8] = arg3;
                int var9 = var8 + 1;
                arg1[var9] = arg3;
                int var10 = var9 + 1;
                arg1[var10] = arg3;
                int var11 = var10 + 1;
                arg1[var11] = arg3;
                int var12 = var11 + 1;
                arg1[var12] = arg3;
                arg0 = var12 + 1;
                arg1[arg0] = arg3;
            }
            while (~var13 < ~arg0) {
                ++arg0;
                arg1[arg0] = arg3;
            }
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(ILam;)V")
    public static final void method1741(int arg0, class286 arg1) {
        class372.field5203 = arg1;
        int var2 = -25 % ((80 - arg0) / 38);
        ++field4024;
        class444.field6494 = class372.field5203.method1691(16, 0);
    }
}
