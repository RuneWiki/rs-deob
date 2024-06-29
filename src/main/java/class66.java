import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class66 extends class228 implements class111 {

    @OriginalMember(owner = "client!pn", name = "H", descriptor = "Lpl;")
    public class447 field985;

    @OriginalMember(owner = "client!pn", name = "W", descriptor = "Z")
    private boolean field1000;

    @OriginalMember(owner = "client!pn", name = "J", descriptor = "[I")
    public static int[] field987 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!pn", name = "T", descriptor = "Ljava/lang/String;")
    public static String field997 = "flash1:";

    @OriginalMember(owner = "client!pn", name = "S", descriptor = "Ljava/lang/String;")
    public static String field996 = "Hidden";

    @OriginalMember(owner = "client!pn", name = "Y", descriptor = "I")
    public static int field1002 = 0;

    @OriginalMember(owner = "client!pn", name = "X", descriptor = "I")
    public static int field1001;

    @OriginalMember(owner = "client!pn", name = "Z", descriptor = "I")
    public static int field1003;

    @OriginalMember(owner = "client!pn", name = "ab", descriptor = "I")
    public static int field1004;

    @OriginalMember(owner = "client!pn", name = "bb", descriptor = "I")
    public static int field1005;

    @OriginalMember(owner = "client!pn", name = "cb", descriptor = "I")
    public static int field1006;

    @OriginalMember(owner = "client!pn", name = "F", descriptor = "I")
    public static int field983;

    @OriginalMember(owner = "client!pn", name = "G", descriptor = "I")
    public static int field984;

    @OriginalMember(owner = "client!pn", name = "I", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!pn", name = "K", descriptor = "I")
    public static int field988;

    @OriginalMember(owner = "client!pn", name = "M", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "client!pn", name = "N", descriptor = "I")
    public static int field991;

    @OriginalMember(owner = "client!pn", name = "O", descriptor = "I")
    public static int field992;

    @OriginalMember(owner = "client!pn", name = "P", descriptor = "I")
    public static int field993;

    @OriginalMember(owner = "client!pn", name = "Q", descriptor = "I")
    public static int field994;

    @OriginalMember(owner = "client!pn", name = "R", descriptor = "I")
    public static int field995;

    @OriginalMember(owner = "client!pn", name = "U", descriptor = "I")
    public static int field998;

    @OriginalMember(owner = "client!pn", name = "V", descriptor = "I")
    public static int field999;

    @OriginalMember(owner = "client!pn", name = "L", descriptor = "Lrk;")
    public static class427 field989;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(BLpe;)V")
    public final void method570(byte arg0, class391 arg1) {
        int var3 = -12 % ((arg0 - 66) / 39);
        this.field985.method2781(arg1, -4136);
        ++field993;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(ZILhh;Lpe;III)V")
    public final void method532(boolean arg0, int arg1, class184 arg2, class391 arg3, int arg4, int arg5, int arg6) {
        ++field990;
        int var8 = -76 / ((arg1 - 76) / 38);
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIIII)V")
    public static final void method571(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field992;
        if (arg1 != 1) {
            field987 = null;
        }
        class329 var5 = (class329) class19.field374.method614(-117, (long) arg0);
        if (var5 == null) {
            var5 = new class329();
            class19.field374.method612((long) arg0, -1, var5);
        }
        if (~var5.field4472.length >= ~arg2) {
            int[] var6 = new int[arg2 + 1];
            int[] var7 = new int[arg2 + 1];
            for (int var8 = 0; ~var5.field4472.length < ~var8; ++var8) {
                var6[var8] = var5.field4472[var8];
                var7[var8] = var5.field4473[var8];
            }
            for (int var9 = var5.field4472.length; arg2 > var9; ++var9) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field4472 = var6;
            var5.field4473 = var7;
        }
        var5.field4472[arg2] = arg3;
        var5.field4473[arg2] = arg4;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lpe;B)Lca;")
    public final class415 method572(class391 arg0, byte arg1) {
        ++field1006;
        class73 var3 = this.field985.method2782(super.field3176, arg0, true, 1024, super.field3167, 0, false);
        if (var3 == null) {
            return null;
        } else {
            if (arg1 >= -45) {
                this.field1000 = false;
            }
            class156 var4 = arg0.method226();
            var4.method308(super.field3176, super.field3168, super.field3167);
            class415 var5 = null;
            if (this.field1000) {
                var5 = class340.method2159(24579, 1);
            }
            if (this.field985.field6484 != null) {
                class374 var6 = this.field985.field6484.method489();
                arg0.method166(var3, var6, var4, var5 == null ? null : var5.field5799[0], 0);
            } else {
                var3.method478(var4, var5 != null ? var5.field5799[0] : null, 0);
            }
            this.field985.method2776(var3, super.field3172, super.field3162, super.field3178, arg0, super.field3161, 13, true);
            return var5;
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(B)V")
    public final void method573(byte arg0) {
        ++field994;
        if (arg0 > -100) {
            field1002 = -13;
        }
    }

    @OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(Lpe;Lkk;IIIIIIIZIIIII)V")
    public class66(class391 arg0, class372 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg4, arg6, arg7, arg8, arg10, arg11, arg12, arg13, ~arg1.field5142 == -2, class94.method807(9, arg2, arg3));
        this.field985 = new class447(arg0, arg1, arg2, arg3, super.field3170, arg5, arg6, arg8, arg9, arg14);
        this.field1000 = ~arg1.field5204 != -1;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lpe;I)V")
    public final void method574(class391 arg0, int arg1) {
        this.field985.method2783(arg0, (byte) -25);
        if (arg1 != -28992) {
            this.method580(-49);
        }
        ++field998;
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(I)I")
    public final int method575(int arg0) {
        if (arg0 != -15863) {
            this.field985 = null;
        }
        ++field984;
        return this.field985.field6450;
    }

    @OriginalMember(owner = "client!pn", name = "e", descriptor = "(I)Z")
    public final boolean method537(int arg0) {
        if (arg0 > -48) {
            return true;
        } else {
            ++field991;
            return false;
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lpe;II)Lsj;")
    public final class73 method576(class391 arg0, int arg1, int arg2) {
        ++field1003;
        if (arg2 != -2705) {
            this.field985 = null;
        }
        return this.field985.method2782(0, arg0, false, arg1, 0, 0, false);
    }

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "(I)Z")
    public final boolean method577(int arg0) {
        ++field999;
        return arg0 != -16528 ? false : this.field985.method2787(104);
    }

    @OriginalMember(owner = "client!pn", name = "f", descriptor = "(B)V")
    public static final void method578(byte arg0) {
        ++field995;
        class410 var1 = class105.field1538;
        synchronized (class105.field1538) {
            class105.field1538.method2539(64);
        }
        if (arg0 != -62) {
            method571(-107, -74, 124, 8, 77);
        }
    }

    @OriginalMember(owner = "client!pn", name = "g", descriptor = "(I)I")
    public final int method579(int arg0) {
        if (arg0 != 0) {
            this.field985 = null;
        }
        ++field986;
        return this.field985.method2789((byte) 102);
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(I)I")
    public final int method580(int arg0) {
        ++field1005;
        if (arg0 != 24493) {
            field1002 = -104;
        }
        return this.field985.field6462;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(ILpe;)V")
    public final void method581(int arg0, class391 arg1) {
        ++field983;
        class73 var3 = this.field985.method2782(super.field3176, arg1, true, 131072, super.field3167, arg0, true);
        if (var3 != null) {
            this.field985.method2776(var3, super.field3172, super.field3162, super.field3178, arg1, super.field3161, 13, false);
        }
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(B)I")
    public final int method582(byte arg0) {
        ++field1001;
        return arg0 != 22 ? 7 : this.field985.field6458;
    }

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "(B)V")
    public final void method535(byte arg0) {
        if (arg0 > 110) {
            ++field988;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IILpe;I)Z")
    public final boolean method583(int arg0, int arg1, class391 arg2, int arg3) {
        ++field1004;
        class73 var5 = this.field985.method2782(super.field3176, arg2, false, arg3, super.field3167, 0, false);
        if (var5 == null) {
            return false;
        } else {
            class156 var6 = arg2.method226();
            var6.method308(super.field3176, super.field3168, super.field3167);
            return var5.method455(arg1, arg0, var6, false);
        }
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(Z)V")
    public static void method584(boolean arg0) {
        if (!arg0) {
            field997 = null;
            field996 = null;
            field989 = null;
            field987 = null;
        }
    }
}
