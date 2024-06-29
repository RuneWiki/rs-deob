import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jea")
public class class223 extends class144 implements class394 {

    @OriginalMember(owner = "client!jea", name = "cb", descriptor = "Z")
    private boolean field3349 = false;

    @OriginalMember(owner = "client!jea", name = "S", descriptor = "Lbba;")
    public class668 field3339;

    @OriginalMember(owner = "client!jea", name = "Y", descriptor = "Z")
    private boolean field3345;

    @OriginalMember(owner = "client!jea", name = "Q", descriptor = "Lgd;")
    public static class346 field3337 = new class346();

    @OriginalMember(owner = "client!jea", name = "gb", descriptor = "Lis;")
    public static class101 field3353 = null;

    @OriginalMember(owner = "client!jea", name = "G", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!jea", name = "H", descriptor = "I")
    public static int field3328;

    @OriginalMember(owner = "client!jea", name = "I", descriptor = "I")
    public static int field3329;

    @OriginalMember(owner = "client!jea", name = "J", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!jea", name = "K", descriptor = "I")
    public static int field3331;

    @OriginalMember(owner = "client!jea", name = "L", descriptor = "I")
    public static int field3332;

    @OriginalMember(owner = "client!jea", name = "M", descriptor = "I")
    public static int field3333;

    @OriginalMember(owner = "client!jea", name = "N", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!jea", name = "O", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!jea", name = "P", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!jea", name = "R", descriptor = "I")
    public static int field3338;

    @OriginalMember(owner = "client!jea", name = "T", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!jea", name = "U", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!jea", name = "V", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!jea", name = "W", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!jea", name = "Z", descriptor = "I")
    public static int field3346;

    @OriginalMember(owner = "client!jea", name = "ab", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!jea", name = "bb", descriptor = "I")
    public static int field3348;

    @OriginalMember(owner = "client!jea", name = "db", descriptor = "I")
    public static int field3350;

    @OriginalMember(owner = "client!jea", name = "eb", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!jea", name = "X", descriptor = "Leh;")
    private class203 field3344;

    @OriginalMember(owner = "client!jea", name = "fb", descriptor = "[I")
    public static int[] field3352;

    @OriginalMember(owner = "client!jea", name = "b", descriptor = "(I)I")
    public final int method904(int arg0) {
        if (arg0 != -15140) {
            return -34;
        } else {
            ++field3351;
            return this.field3339.field9390;
        }
    }

    @OriginalMember(owner = "client!jea", name = "g", descriptor = "(I)Z")
    public final boolean method592(int arg0) {
        ++field3335;
        if (arg0 != -15258) {
            this.method631(-47, (class98) null);
        }
        return false;
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(ILr;)V")
    public final void method912(int arg0, class98 arg1) {
        ++field3327;
        this.field3339.method3762(arg1, (byte) -19);
        if (arg0 != 20280) {
            this.field3349 = true;
        }
    }

    @OriginalMember(owner = "client!jea", name = "j", descriptor = "(I)V")
    public final void method585(int arg0) {
        if (arg0 == 96) {
            ++field3341;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(Lr;B)V")
    public final void method911(class98 arg0, byte arg1) {
        if (arg1 == 31) {
            ++field3334;
            this.field3339.method3766(262144, arg0);
        }
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(IILr;B)Z")
    public final boolean method632(int arg0, int arg1, class98 arg2, byte arg3) {
        ++field3343;
        class397 var5 = this.field3339.method3758(true, 131072, arg2, false, false);
        if (var5 == null) {
            return false;
        } else {
            int var6 = 126 % ((arg3 - -75) / 40);
            class152 var7 = arg2.method777();
            var7.method166(super.field3155, super.field3160, super.field3154);
            return class372.field5162 ? var5.method482(arg0, arg1, var7, false, class450.field6494) : var5.method469(arg0, arg1, var7, false);
        }
    }

    @OriginalMember(owner = "client!jea", name = "d", descriptor = "(B)V")
    public static final void method1482(byte arg0) {
        ++field3338;
        int var1 = class643.field9134;
        int[] var2 = class98.field1458;
        for (int var3 = 0; var1 > var3; ++var3) {
            class270 var9 = class76.field1186[var2[var3]];
            if (var9 != null && ~var9.field2409 < -1) {
                --var9.field2409;
                if (var9.field2409 == 0) {
                    var9.field2350 = null;
                }
            }
        }
        for (int var4 = 0; ~class310.field4304 < ~var4; ++var4) {
            long var5 = (long) class253.field3667[var4];
            class6 var7 = (class6) class314.field4359.method2818(-22803, var5);
            if (var7 != null) {
                class88 var8 = var7.field49;
                if (var8.field2409 > 0) {
                    --var8.field2409;
                    if (var8.field2409 == 0) {
                        var8.field2350 = null;
                    }
                }
            }
        }
        if (arg0 != -26) {
            field3352 = null;
        }
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(B)I")
    public final int method634(byte arg0) {
        ++field3329;
        if (arg0 >= -102) {
            this.method585(107);
        }
        return this.field3339.method3759((byte) 60);
    }

    @OriginalMember(owner = "client!jea", name = "c", descriptor = "(Z)Z")
    public final boolean method633(boolean arg0) {
        if (!arg0) {
            return false;
        } else {
            ++field3340;
            return false;
        }
    }

    @OriginalMember(owner = "client!jea", name = "e", descriptor = "(B)V")
    public static void method1483(byte arg0) {
        field3353 = null;
        if (arg0 >= -116) {
            method1483((byte) 61);
        }
        field3337 = null;
        field3352 = null;
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(I)I")
    public final int method903(int arg0) {
        if (arg0 <= 76) {
            this.method904(72);
        }
        ++field3348;
        return this.field3339.field9382;
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "([IIIII)V")
    public static final void method1484(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 > -78) {
            method1483((byte) -122);
        }
        ++field3331;
        --arg4;
        int var6 = arg1 - 1;
        int var5 = -7 + var6;
        while (arg4 < var5) {
            int var7 = arg4 + 1;
            arg0[var7] = arg3;
            int var8 = var7 + 1;
            arg0[var8] = arg3;
            int var9 = var8 + 1;
            arg0[var9] = arg3;
            int var10 = var9 + 1;
            arg0[var10] = arg3;
            int var11 = var10 + 1;
            arg0[var11] = arg3;
            int var12 = var11 + 1;
            arg0[var12] = arg3;
            int var13 = var12 + 1;
            arg0[var13] = arg3;
            arg4 = var13 + 1;
            arg0[arg4] = arg3;
        }
        while (var6 > arg4) {
            ++arg4;
            arg0[arg4] = arg3;
        }
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(Lvj;IZLr;IIB)V")
    public final void method590(class204 arg0, int arg1, boolean arg2, class98 arg3, int arg4, int arg5, byte arg6) {
        if (arg6 > 22) {
            ++field3328;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!jea", name = "<init>", descriptor = "(Lr;Lnf;IIIIIZIIIIIII)V")
    public class223(class98 arg0, class119 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field1955 == 1, class511.method3043(arg13, 2, arg12));
        this.field3339 = new class668(arg0, arg1, arg12, arg13, super.field3158, arg3, this, arg7, arg14);
        this.field3345 = ~arg1.field1903 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!jea", name = "b", descriptor = "(ILr;)Leh;")
    public final class203 method631(int arg0, class98 arg1) {
        if (arg0 != 1) {
            field3353 = null;
        }
        ++field3347;
        return this.field3344;
    }

    @OriginalMember(owner = "client!jea", name = "b", descriptor = "(Z)Z")
    public final boolean method908(boolean arg0) {
        if (arg0) {
            this.method908(true);
        }
        ++field3350;
        return this.field3339.method3761(-122);
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(Lr;I)Lej;")
    public final class690 method627(class98 arg0, int arg1) {
        ++field3336;
        class397 var3 = this.field3339.method3758(true, 2048, arg0, true, false);
        if (var3 == null) {
            return null;
        } else {
            class152 var4 = arg0.method777();
            var4.method166(super.field3155, super.field3160, super.field3154);
            class690 var5 = null;
            if (arg1 != -7927) {
                this.method592(-91);
            }
            if (this.field3345) {
                var5 = class101.method849(-22, 1);
            }
            this.field3339.method3765(super.field2484, true, arg0, -53, super.field2483, super.field2481, var4, super.field2486, var3);
            if (!class372.field5162) {
                var3.method460(var4, var5 != null ? var5.field9788[0] : null, 0);
            } else {
                var3.method448(var4, var5 != null ? var5.field9788[0] : null, class450.field6494, 0);
            }
            if (this.field3339.field9415 != null) {
                class272 var6 = this.field3339.field9415.method3581();
                if (class372.field5162) {
                    arg0.method799(var6, class450.field6494);
                } else {
                    arg0.method737(var6);
                }
            }
            this.field3349 = var3.method449() || this.field3339.field9415 != null;
            if (this.field3344 != null) {
                class136.method1043(23175, var3, this.field3344, super.field3154, super.field3160, super.field3155);
            } else {
                this.field3344 = class420.method2486(super.field3155, super.field3160, super.field3154, var3, 22672);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!jea", name = "c", descriptor = "(I)V")
    public final void method902(int arg0) {
        ++field3342;
        if (arg0 != 27906) {
            field3353 = null;
        }
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(Z)I")
    public final int method907(boolean arg0) {
        ++field3330;
        if (arg0) {
            this.field3344 = null;
        }
        return this.field3339.field9418;
    }

    @OriginalMember(owner = "client!jea", name = "c", descriptor = "(ILr;)V")
    public final void method625(int arg0, class98 arg1) {
        ++field3332;
        class397 var3 = this.field3339.method3758(true, 262144, arg1, true, true);
        if (var3 != null) {
            class152 var4 = arg1.method777();
            var4.method166(super.field3155, super.field3160, super.field3154);
            this.field3339.method3765(super.field2484, false, arg1, 116, super.field2483, super.field2481, var4, super.field2486, var3);
        }
        if (arg0 <= 67) {
            field3352 = null;
        }
    }

    @OriginalMember(owner = "client!jea", name = "i", descriptor = "(I)I")
    public final int method626(int arg0) {
        if (arg0 != -32768) {
            this.field3345 = false;
        }
        ++field3346;
        return this.field3339.method3767(11);
    }

    @OriginalMember(owner = "client!jea", name = "h", descriptor = "(I)Z")
    public final boolean method630(int arg0) {
        ++field3333;
        int var2 = -75 % ((-59 - arg0) / 44);
        return this.field3349;
    }
}
