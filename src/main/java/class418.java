import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class418 extends class260 {

    @OriginalMember(owner = "client!hf", name = "m", descriptor = "I")
    public static int field5997 = 0;

    @OriginalMember(owner = "client!hf", name = "l", descriptor = "I")
    public static int field5996 = 0;

    @OriginalMember(owner = "client!hf", name = "s", descriptor = "Ljw;")
    public static class581 field6003 = new class581(33, 0);

    @OriginalMember(owner = "client!hf", name = "w", descriptor = "I")
    public static int field6007 = 0;

    @OriginalMember(owner = "client!hf", name = "x", descriptor = "[I")
    public static int[] field6008 = new int[3];

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "I")
    public static int field5992;

    @OriginalMember(owner = "client!hf", name = "j", descriptor = "I")
    public static int field5994;

    @OriginalMember(owner = "client!hf", name = "k", descriptor = "I")
    public static int field5995;

    @OriginalMember(owner = "client!hf", name = "n", descriptor = "I")
    public static int field5998;

    @OriginalMember(owner = "client!hf", name = "p", descriptor = "I")
    public static int field6000;

    @OriginalMember(owner = "client!hf", name = "q", descriptor = "I")
    public static int field6001;

    @OriginalMember(owner = "client!hf", name = "r", descriptor = "I")
    public static int field6002;

    @OriginalMember(owner = "client!hf", name = "t", descriptor = "I")
    public static int field6004;

    @OriginalMember(owner = "client!hf", name = "u", descriptor = "I")
    public static int field6005;

    @OriginalMember(owner = "client!hf", name = "v", descriptor = "I")
    public static int field6006;

    @OriginalMember(owner = "client!hf", name = "y", descriptor = "I")
    public static int field6009;

    @OriginalMember(owner = "client!hf", name = "A", descriptor = "I")
    public static int field6011;

    @OriginalMember(owner = "client!hf", name = "z", descriptor = "Z")
    public static boolean field6010;

    @OriginalMember(owner = "client!hf", name = "o", descriptor = "[I")
    public static int[] field5999;

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "[Lvr;")
    public static class147[] field5993;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)Z", line = 6)
    public final boolean method2575(int arg0) {
        ++field6006;
        if (super.field3867.method740((byte) -115)) {
            return false;
        } else {
            int var2 = -45 % ((arg0 - 56) / 53);
            return super.field3867.method737(false) == class380.field5545;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lha;Lor;Z)V", line = 25)
    public static final void method2576(class65 arg0, class668 arg1, boolean arg2) {
        if (!arg2) {
            ++field5992;
            boolean var3 = class770.field10602.method2474(arg1.field9268, arg1.field9234, (byte) 16, arg1.field9275 ? class551.field7456.field1050 : null, arg1.field9231 | -16777216, arg1.field9343, arg0, arg1.field9283) == null;
            if (var3) {
                class338.field4897.method2545(-128, new class624(arg1.field9283, arg1.field9343, arg1.field9234, arg1.field9231 | -16777216, arg1.field9268, arg1.field9275));
                class763.method4242(arg1, true);
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(ILfca;)V", line = 44)
    public class418(int arg0, class92 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "(I)V", line = 49)
    public static final void method2577(int arg0) {
        class483.field6678.method1555((byte) -3);
        if (arg0 < 36) {
            method2577(17);
        }
        ++field6005;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Z)V", line = 60)
    public final void method2(boolean arg0) {
        ++field5994;
        if (super.field3867.method737(arg0) != class380.field5545) {
            super.field3868 = 1;
        } else if (super.field3867.method740((byte) -103)) {
            super.field3868 = 0;
        }
        if (~super.field3868 != -1 && super.field3868 != 1) {
            super.field3868 = this.method8((byte) 4);
        }
    }

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "(I)V", line = 83)
    public static void method2578(int arg0) {
        field6008 = null;
        field5993 = null;
        field5999 = null;
        field6003 = null;
        int var1 = 111 / ((-15 - arg0) / 49);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)I", line = 96)
    public final int method8(byte arg0) {
        if (arg0 != 4) {
            field6010 = false;
        }
        ++field5995;
        return 1;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IC)Z", line = 107)
    public static final boolean method2579(int arg0, char arg1) {
        ++field6004;
        if (arg0 != 8706) {
            method2577(-43);
        }
        if (Character.isISOControl(arg1)) {
            return false;
        } else if (class103.method795(64, arg1)) {
            return true;
        } else {
            char[] var2 = class117.field1685;
            for (int var3 = 0; ~var2.length < ~var3; ++var3) {
                char var7 = var2[var3];
                if (~arg1 == ~var7) {
                    return true;
                }
            }
            char[] var4 = class205.field2687;
            for (int var5 = 0; ~var5 > ~var4.length; ++var5) {
                char var6 = var4[var5];
                if (~arg1 == ~var6) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIIII)V", line = 156)
    public static final void method2580(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field6002;
        if (arg2 == -10602) {
            if (arg1 == arg4) {
                class394.method2488(true, arg1, arg5, arg0, arg3);
            } else if (arg3 - arg1 >= class174.field2335 && ~(arg1 + arg3) >= ~class751.field10402 && ~class523.field7178 >= ~(-arg4 + arg0) && arg0 + arg4 <= class495.field6845) {
                class326.method2067(arg1, (byte) -126, arg5, arg3, arg0, arg4);
            } else {
                class210.method1397(arg0, arg1, -30, arg4, arg3, arg5);
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "(I)V", line = 180)
    public static final void method2581(int arg0) {
        ++field6000;
        class298.field4322.method1552(arg0 ^ 29095);
        class322.field4711.method1552(-120);
        if (arg0 != -29152) {
            method2579(-109, '\u0004');
        }
        class34.field555.method1552(13);
        class443.field6227.method1552(arg0 ^ 29089);
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Lfca;)V", line = 194)
    public class418(class92 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILjava/lang/String;)[B", line = 203)
    public static final byte[] method2582(int arg0, String arg1) {
        if (arg0 != -25417) {
            field5997 = 69;
        }
        ++field6001;
        int var2 = arg1.length();
        if (~var2 == -1) {
            return new byte[0];
        } else {
            int var3 = -4 & var2 - -3;
            int var4 = var3 / 4 * 3;
            if (~(var3 + -2) > ~var2 && class66.method570(arg1.charAt(var3 + -2), -1) != -1) {
                if (var2 <= var3 + -1 || ~class66.method570(arg1.charAt(var3 - 1), -1) == 0) {
                    --var4;
                }
            } else {
                var4 -= 2;
            }
            byte[] var5 = new byte[var4];
            class407.method2525(arg1, (byte) 94, var5, 0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "(I)I", line = 234)
    public final int method2583(int arg0) {
        if (arg0 <= 3) {
            this.method2(false);
        }
        ++field6009;
        return super.field3868;
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(IB)V", line = 246)
    public final void method9(int arg0, byte arg1) {
        super.field3868 = arg0;
        ++field5998;
        if (arg1 != -107) {
            field5999 = null;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IB)I", line = 267)
    public final int method4(int arg0, byte arg1) {
        int var3 = 4 / ((-53 - arg1) / 50);
        ++field6011;
        if (super.field3867.method740((byte) -107)) {
            return 3;
        } else if (super.field3867.method737(false) == class380.field5545) {
            if (arg0 == 0) {
                if (super.field3867.field1316.method1192(63) == 1) {
                    return 2;
                }
                if (~super.field3867.field1307.method1209(55) == -2) {
                    return 2;
                }
                if (~super.field3867.field1322.method1363(95) < -1) {
                    return 2;
                }
            }
            return 1;
        } else {
            return 3;
        }
    }
}
