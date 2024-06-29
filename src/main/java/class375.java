import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class375 extends class80 {

    @OriginalMember(owner = "client!tp", name = "I", descriptor = "[F")
    public static float[] field5486 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!tp", name = "P", descriptor = "S")
    public static short field5493 = 1;

    @OriginalMember(owner = "client!tp", name = "J", descriptor = "I")
    public static int field5487;

    @OriginalMember(owner = "client!tp", name = "K", descriptor = "I")
    public static int field5488;

    @OriginalMember(owner = "client!tp", name = "L", descriptor = "I")
    public static int field5489;

    @OriginalMember(owner = "client!tp", name = "M", descriptor = "I")
    public static int field5490;

    @OriginalMember(owner = "client!tp", name = "N", descriptor = "I")
    public static int field5491;

    @OriginalMember(owner = "client!tp", name = "O", descriptor = "I")
    public static int field5492;

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "(B)V", line = 3)
    public static void method2303(byte arg0) {
        if (arg0 != -44) {
            field5486 = null;
        }
        field5486 = null;
    }

    @OriginalMember(owner = "client!tp", name = "<init>", descriptor = "()V", line = 15)
    public class375() {
        super(0, true);
    }

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "(III)I", line = 21)
    public static final int method2304(int arg0, int arg1, int arg2) {
        ++field5488;
        if (~arg2 != -2 && arg2 != 3) {
            if (arg1 != 2) {
                field5486 = null;
            }
            return class202.field3264[3 & arg0];
        } else {
            return class457.field6780[3 & arg0];
        }
    }

    @OriginalMember(owner = "client!tp", name = "d", descriptor = "(Z)Lge;", line = 36)
    public static final class504 method2305(boolean arg0) {
        if (!arg0) {
            method2303((byte) 88);
        }
        ++field5489;
        class504 var1 = (class504) class272.field4123.method532((byte) -100);
        if (var1 != null) {
            --class262.field4001;
            return var1;
        } else {
            return new class504();
        }
    }

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "(II)[I", line = 61)
    public final int[] method25(int arg0, int arg1) {
        ++field5491;
        if (arg1 != -16828) {
            return null;
        } else {
            int[] var3 = super.field1601.method48(arg0, (byte) 0);
            if (super.field1601.field124) {
                int var4 = class44.field795[arg0];
                for (int var5 = 0; class137.field2308 > var5; ++var5) {
                    var3[var5] = this.method2307(false, var4, class460.field6860[var5]) % 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(ZIIILgh;)V", line = 93)
    public static final void method2306(boolean arg0, int arg1, int arg2, int arg3, class388 arg4) {
        ++field5487;
        int var5 = arg4.field5745;
        int var6 = arg4.field5712;
        if (~arg4.field5823 == -1) {
            arg4.field5745 = arg4.field5820;
        } else if (~arg4.field5823 != -2) {
            if (arg4.field5823 == 2) {
                arg4.field5745 = arg4.field5820 * arg1 >> 14;
            }
        } else {
            arg4.field5745 = -arg4.field5820 + arg1;
        }
        if (arg4.field5771 == 0) {
            arg4.field5712 = arg4.field5741;
        } else if (~arg4.field5771 != -2) {
            if (~arg4.field5771 == -3) {
                arg4.field5712 = arg4.field5741 * arg2 >> 14;
            }
        } else {
            arg4.field5712 = -arg4.field5741 + arg2;
        }
        if (arg4.field5823 == 4) {
            arg4.field5745 = arg4.field5826 * arg4.field5712 / arg4.field5734;
        }
        if (arg4.field5771 == 4) {
            arg4.field5712 = arg4.field5745 * arg4.field5734 / arg4.field5826;
        }
        if (class321.field4902 && (client.method1371(arg4).field1911 != 0 || ~arg4.field5784 == -1)) {
            if (arg4.field5712 < 5 && arg4.field5745 < 5) {
                arg4.field5712 = 5;
                arg4.field5745 = 5;
            } else {
                if (arg4.field5745 <= 0) {
                    arg4.field5745 = 5;
                }
                if (~arg4.field5712 >= -1) {
                    arg4.field5712 = 5;
                }
            }
        }
        if (class154.field2507 == arg4.field5765) {
            class46.field968 = arg4;
        }
        if (arg0 && arg4.field5799 != null && (~arg4.field5745 != ~var5 || ~arg4.field5712 != ~var6)) {
            class322 var7 = new class322();
            var7.field4911 = arg4.field5799;
            var7.field4918 = arg4;
            class212.field3376.method1885(false, var7);
        }
        if (arg3 != 5) {
            method2303((byte) 63);
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(ZII)I", line = 175)
    private final int method2307(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            this.method25(-104, -8);
        }
        ++field5490;
        int var4 = arg2 - -(arg1 * 57);
        int var5 = var4 << 1 ^ var4;
        return -((Integer.MAX_VALUE & (var5 * var5 * 15731 - -789221) * var5 - -1376312589) / 262144) + 4096;
    }
}
