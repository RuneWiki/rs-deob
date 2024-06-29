import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class126 extends class142 {

    @OriginalMember(owner = "client!nh", name = "U", descriptor = "I")
    public static int field2400 = 0;

    @OriginalMember(owner = "client!nh", name = "W", descriptor = "Lai;")
    public static class10 field2402 = class44.method278(":duelfriend:", -90);

    @OriginalMember(owner = "client!nh", name = "Y", descriptor = "I")
    public static int field2404 = 0;

    @OriginalMember(owner = "client!nh", name = "ab", descriptor = "Z")
    public static boolean field2406 = false;

    @OriginalMember(owner = "client!nh", name = "Q", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!nh", name = "R", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!nh", name = "S", descriptor = "I")
    public static int field2398;

    @OriginalMember(owner = "client!nh", name = "T", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!nh", name = "V", descriptor = "I")
    public static int field2401;

    @OriginalMember(owner = "client!nh", name = "X", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!nh", name = "Z", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!nh", name = "cb", descriptor = "I")
    public static int field2408;

    @OriginalMember(owner = "client!nh", name = "bb", descriptor = "Lta;")
    public static class173 field2407;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method86(int arg0, boolean arg1) {
        ++field2405;
        int[][] var3 = super.field2666.method956(arg0, -96);
        if (super.field2666.field2664) {
            int[] var4 = this.method963((byte) -121, 2, arg0);
            int[][] var5 = this.method961(2, 0, arg0);
            int[][] var6 = this.method961(2, 1, arg0);
            int[] var7 = var3[0];
            int[] var8 = var5[0];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[2];
            int[] var14 = var6[0];
            int[] var15 = var6[1];
            for (int var16 = 0; class133.field2499 > var16; ++var16) {
                int var17 = var4[var16];
                if (~var17 == -4097) {
                    var7[var16] = var8[var16];
                    var10[var16] = var11[var16];
                    var9[var16] = var12[var16];
                } else if (~var17 != -1) {
                    int var18 = -var17 + 4096;
                    var7[var16] = var8[var16] * var17 + var14[var16] * var18 >> 12;
                    var10[var16] = var11[var16] * var17 + var15[var16] * var18 >> 12;
                    var9[var16] = var12[var16] * var17 + var13[var16] * var18 >> 12;
                } else {
                    var7[var16] = var14[var16];
                    var10[var16] = var15[var16];
                    var9[var16] = var13[var16];
                }
            }
        }
        return arg1 ? null : var3;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IBI)I")
    public static final int method869(int arg0, byte arg1, int arg2) {
        if (arg1 != -70) {
            return 12;
        } else {
            ++field2403;
            int var3 = arg0 * 57 + arg2;
            int var4 = var3 << 13 ^ var3;
            int var5 = (var4 * var4 * 15731 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
            return (134161820 & var5) >> 19;
        }
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "()V")
    public class126() {
        super(3, false);
    }

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "(I)V")
    public static final void method870(int arg0) {
        ++field2408;
        for (int var1 = -1; ~class189.field3616 < ~var1; ++var1) {
            int var2;
            if (~var1 != 0) {
                var2 = class174.field3355[var1];
            } else {
                var2 = 2047;
            }
            class38 var3 = class2.field10[var2];
            if (var3 != null) {
                class116.method827(1, 256, var3);
            }
        }
        if (arg0 >= -99) {
            field2407 = null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "(I)V")
    public static void method871(int arg0) {
        field2407 = null;
        field2402 = null;
        int var1 = -39 % ((arg0 - -5) / 32);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZI)[I")
    public final int[] method6(boolean arg0, int arg1) {
        ++field2401;
        int[] var3 = super.field2683.method1186((byte) -114, arg1);
        if (super.field2683.field3516) {
            int[] var4 = this.method963((byte) -121, 0, arg1);
            int[] var5 = this.method963((byte) -121, 1, arg1);
            int[] var6 = this.method963((byte) -121, 2, arg1);
            for (int var7 = 0; class133.field2499 > var7; ++var7) {
                int var8 = var6[var7];
                if (~var8 != -4097) {
                    if (var8 == 0) {
                        var3[var7] = var5[var7];
                    } else {
                        var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                    }
                } else {
                    var3[var7] = var4[var7];
                }
            }
        }
        return arg0 ? null : var3;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lme;IB)V")
    public final void method78(class114 arg0, int arg1, byte arg2) {
        ++field2399;
        if (arg2 < -34) {
            if (arg1 == 0) {
                super.field2684 = arg0.method767(true) == 1;
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(B)V")
    public static final void method872(byte arg0) {
        ++field2398;
        Object var1 = class149.field2871;
        synchronized (class149.field2871) {
            if (class134.field2507 == 0) {
                class120.field2313.method494(5, new class137(), arg0 ^ -127);
            }
            class134.field2507 = 600;
        }
        if (arg0 != -4) {
            method869(-113, (byte) -107, -10);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IBILc;)[Lta;")
    public static final class173[] method873(int arg0, byte arg1, int arg2, class21 arg3) {
        ++field2397;
        if (arg1 <= 97) {
            field2402 = null;
        }
        return !class169.method1123(arg2, (byte) 102, arg0, arg3) ? null : class73.method456(false);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lc;I)V")
    public static final void method874(class21 arg0, int arg1) {
        class192.field3653 = arg0;
        if (arg1 != -4097) {
            method871(53);
        }
        ++field2396;
    }
}
