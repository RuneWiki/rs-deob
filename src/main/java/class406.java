import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class406 extends class236 implements class56 {

    @OriginalMember(owner = "client!k", name = "N", descriptor = "Lrg;")
    public class381 field5908;

    @OriginalMember(owner = "client!k", name = "P", descriptor = "Z")
    private boolean field5909;

    @OriginalMember(owner = "client!k", name = "z", descriptor = "Lm;")
    public static class242 field5894 = new class242();

    @OriginalMember(owner = "client!k", name = "V", descriptor = "[J")
    public static long[] field5914 = new long[32];

    @OriginalMember(owner = "client!k", name = "X", descriptor = "Z")
    public static boolean field5916 = false;

    @OriginalMember(owner = "client!k", name = "W", descriptor = "[I")
    public static int[] field5915 = new int[2];

    @OriginalMember(owner = "client!k", name = "A", descriptor = "I")
    public static int field5895;

    @OriginalMember(owner = "client!k", name = "B", descriptor = "I")
    public static int field5896;

    @OriginalMember(owner = "client!k", name = "C", descriptor = "I")
    public static int field5897;

    @OriginalMember(owner = "client!k", name = "D", descriptor = "I")
    public static int field5898;

    @OriginalMember(owner = "client!k", name = "E", descriptor = "I")
    public static int field5899;

    @OriginalMember(owner = "client!k", name = "F", descriptor = "I")
    public static int field5900;

    @OriginalMember(owner = "client!k", name = "G", descriptor = "I")
    public static int field5901;

    @OriginalMember(owner = "client!k", name = "H", descriptor = "I")
    public static int field5902;

    @OriginalMember(owner = "client!k", name = "I", descriptor = "I")
    public static int field5903;

    @OriginalMember(owner = "client!k", name = "J", descriptor = "I")
    public static int field5904;

    @OriginalMember(owner = "client!k", name = "K", descriptor = "I")
    public static int field5905;

    @OriginalMember(owner = "client!k", name = "L", descriptor = "I")
    public static int field5906;

    @OriginalMember(owner = "client!k", name = "M", descriptor = "I")
    public static int field5907;

    @OriginalMember(owner = "client!k", name = "Q", descriptor = "I")
    public static int field5910;

    @OriginalMember(owner = "client!k", name = "R", descriptor = "I")
    public static int field5911;

    @OriginalMember(owner = "client!k", name = "U", descriptor = "I")
    public static int field5913;

    @OriginalMember(owner = "client!k", name = "T", descriptor = "[[[B")
    public static byte[][][] field5912;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(B)I", line = 4)
    public final int method122(byte arg0) {
        if (arg0 >= -103) {
            return 109;
        } else {
            ++field5911;
            return this.field5908.field5589;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(II)V", line = 16)
    public static final void method2573(int arg0, int arg1) {
        ++field5898;
        int var2 = -36 / ((arg0 - 84) / 40);
        class440 var3 = class186.method1241(arg1, 14, (byte) 56);
        var3.method2749(13828096);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)I", line = 32)
    public final int method121(int arg0) {
        if (arg0 != 28024) {
            this.method111(8, (class298) null);
        }
        ++field5896;
        return this.field5908.field5582;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(BLtj;)V", line = 43)
    public final void method126(byte arg0, class298 arg1) {
        if (arg0 == 50) {
            ++field5913;
            class257 var3 = this.field5908.method2477(false, arg1, super.field3287, true, super.field3302, 88, 131072);
            if (var3 != null) {
                this.field5908.method2484(super.field3287 >> 7, false, arg1, var3, super.field3302 >> 7, super.field3302 >> 7, arg0 + 5865, super.field3287 >> 7);
            }
        }
    }

    @OriginalMember(owner = "client!k", name = "d", descriptor = "(I)I", line = 58)
    public final int method116(int arg0) {
        ++field5906;
        if (arg0 != 24186) {
            field5912 = null;
        }
        return this.field5908.field5562;
    }

    @OriginalMember(owner = "client!k", name = "h", descriptor = "(I)V", line = 70)
    public static void method2574(int arg0) {
        field5915 = null;
        int var1 = 59 / ((-68 - arg0) / 45);
        field5912 = null;
        field5914 = null;
        field5894 = null;
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(I)Z", line = 84)
    public final boolean method125(int arg0) {
        ++field5910;
        if (arg0 > -112) {
            method2574(-111);
        }
        return this.field5908.method2482(true);
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(II)Lue;", line = 101)
    public static final class92 method2575(int arg0, int arg1) {
        ++field5904;
        if (arg0 != 14880) {
            method2573(4, 100);
        }
        class51 var2 = class257.field3768;
        class92 var3;
        synchronized (class257.field3768) {
            var3 = (class92) class257.field3768.method378((byte) 28, (long) arg1);
        }
        if (var3 != null) {
            return var3;
        } else {
            byte[] var4 = class402.field5872.method1235(class264.method1773(arg1, -31587), false, class266.method1781(-127, arg1));
            class92 var5 = new class92();
            if (var4 != null) {
                var5.method742(-1793, new class341(var4));
            }
            class51 var6 = class257.field3768;
            synchronized (class257.field3768) {
                class257.field3768.method367((long) arg1, var5, true);
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(ILtj;)V", line = 130)
    public final void method108(int arg0, class298 arg1) {
        if (arg0 >= -8) {
            this.field5909 = false;
        }
        this.field5908.method2478(-18021, arg1);
        ++field5905;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Ltj;IB)Lqb;", line = 142)
    public final class257 method117(class298 arg0, int arg1, byte arg2) {
        ++field5899;
        if (arg2 < 42) {
            this.method124(-107);
        }
        return this.field5908.method2477(false, arg0, 0, false, 0, 99, arg1);
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Ltj;Lqr;IIIIIIIZIIII)V", line = 153)
    public class406(class298 arg0, class212 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11, int arg12, int arg13) {
        super(arg6, arg7, arg8, arg10, arg11, arg12, class283.method1941(5, arg3, arg2));
        this.field5908 = new class381(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg13);
        this.field5909 = arg1.field2932 != 0;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ILtj;II)Z", line = 162)
    public final boolean method120(int arg0, class298 arg1, int arg2, int arg3) {
        if (arg3 != 0) {
            return false;
        } else {
            ++field5902;
            class257 var5 = this.field5908.method2477(false, arg1, super.field3287, false, super.field3302, -71, 65536);
            if (var5 == null) {
                return false;
            } else {
                class118 var6 = arg1.method519();
                var6.method274(super.field3300 + super.field3287, super.field3293, super.field3302 + super.field3298);
                return var5.method1698(arg2, arg0, var6, false);
            }
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ILtj;)V", line = 182)
    public final void method111(int arg0, class298 arg1) {
        this.field5908.method2485(arg1, 114);
        ++field5901;
        if (arg0 > -68) {
            field5916 = true;
        }
    }

    @OriginalMember(owner = "client!k", name = "c", descriptor = "(I)V", line = 193)
    public final void method124(int arg0) {
        if (arg0 < 26) {
            field5912 = null;
        }
        ++field5897;
    }

    @OriginalMember(owner = "client!k", name = "f", descriptor = "(I)I", line = 209)
    public final int method1529(int arg0) {
        if (arg0 != 1) {
            field5916 = true;
        }
        ++field5903;
        return this.field5908.method2479(true);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Ltj;I)Lri;", line = 221)
    public final class372 method118(class298 arg0, int arg1) {
        if (arg1 != 18630) {
            field5894 = null;
        }
        ++field5900;
        class257 var3 = this.field5908.method2477(false, arg0, super.field3287, true, super.field3302, -47, 1024);
        if (var3 == null) {
            return null;
        } else {
            class118 var4 = arg0.method519();
            var4.method274(super.field3300 + super.field3287, super.field3293, super.field3302 - -super.field3298);
            class372 var5 = null;
            if (this.field5909) {
                var5 = class384.method2492(1, (byte) 86);
            }
            if (this.field5908.field5588 != null) {
                class305 var6 = this.field5908.field5588.method2597();
                arg0.method453(var3, var6, var4, var5 == null ? null : var5.field5481[0], 0);
            } else {
                var3.method1661(var4, var5 == null ? null : var5.field5481[0], 0);
            }
            this.field5908.method2484(super.field3287 >> 7, true, arg0, var3, super.field3302 >> 7, super.field3302 >> 7, 5915, super.field3287 >> 7);
            return var5;
        }
    }
}
