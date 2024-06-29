import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class223 extends class202 implements class161 {

    @OriginalMember(owner = "client!al", name = "J", descriptor = "Lah;")
    public class191 field3411;

    @OriginalMember(owner = "client!al", name = "B", descriptor = "Z")
    private boolean field3404;

    @OriginalMember(owner = "client!al", name = "z", descriptor = "I")
    public static int field3402;

    @OriginalMember(owner = "client!al", name = "A", descriptor = "I")
    public static int field3403;

    @OriginalMember(owner = "client!al", name = "C", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!al", name = "D", descriptor = "I")
    public static int field3406;

    @OriginalMember(owner = "client!al", name = "E", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!al", name = "F", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!al", name = "G", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!al", name = "I", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!al", name = "K", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!al", name = "L", descriptor = "I")
    public static int field3413;

    @OriginalMember(owner = "client!al", name = "M", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!al", name = "N", descriptor = "I")
    public static int field3415;

    @OriginalMember(owner = "client!al", name = "O", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!al", name = "P", descriptor = "I")
    public static int field3417;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1543(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg4 == arg9 && arg1 == arg8 && ~arg0 == ~arg5 && ~arg2 == ~arg6) {
            class462.method2832(arg4, arg7, 0, arg1, arg6, arg0);
        } else {
            int var10 = arg4;
            int var11 = arg1;
            int var12 = arg4 * 3;
            int var13 = arg1 * 3;
            int var14 = arg9 * 3;
            int var15 = arg8 * 3;
            int var16 = arg5 * 3;
            int var17 = arg2 * 3;
            int var18 = -arg4 + arg0 + -var16 + var14;
            int var19 = -arg1 + -var17 + arg6 + var15;
            int var20 = var16 - var14 - var14 - -var12;
            int var21 = -var15 + var13 + var17 - var15;
            int var22 = -var12 + var14;
            int var23 = var15 - var13;
            for (int var24 = 128; ~var24 >= -4097; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var27 + var29 + var31 >> 12) + arg4;
                int var34 = (var28 + var30 + var32 >> 12) + arg1;
                class462.method2832(var10, arg7, 0, var11, var34, var33);
                var11 = var34;
                var10 = var33;
            }
        }
        if (arg3 == 0) {
            ++field3416;
        }
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(ILza;)Lhp;")
    public final class293 method110(int arg0, class299 arg1) {
        ++field3417;
        class289 var3 = this.field3411.method1322(super.field3126, arg1, (byte) -118, true, false, 2048, super.field3114);
        if (var3 == null) {
            return null;
        } else {
            class517 var4 = arg1.method538();
            var4.method951(super.field3126 - -super.field3131, super.field3133, super.field3120 + super.field3114);
            class293 var5 = null;
            if (this.field3404) {
                var5 = class467.method2844(-22755, 1);
            }
            if (arg0 != 0) {
                this.method99((byte) 88);
            }
            if (this.field3411.field2942 == null) {
                var3.method673(var4, var5 == null ? null : var5.field4524[0], 0);
            } else {
                class320 var6 = this.field3411.field2942.method2424();
                arg1.method584(var3, var6, var4, var5 != null ? var5.field4524[0] : null, 0);
            }
            int var7 = super.field3126 >> 7;
            int var8 = super.field3114 >> 7;
            this.field3411.method1323(var8, -2376, arg1, true, var3, var7, var7, var8);
            return var5;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Lza;IZ)Le;")
    public final class289 method111(class299 arg0, int arg1, boolean arg2) {
        ++field3406;
        if (!arg2) {
            this.field3411 = null;
        }
        return this.field3411.method1322(0, arg0, (byte) -114, false, false, arg1, 0);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Lza;III)Z")
    public final boolean method109(class299 arg0, int arg1, int arg2, int arg3) {
        ++field3405;
        class289 var5 = this.field3411.method1322(super.field3126, arg0, (byte) -118, false, false, 131072, super.field3114);
        if (var5 == null) {
            return false;
        } else {
            class517 var6 = arg0.method538();
            var6.method951(super.field3131 + super.field3126, super.field3133, super.field3120 + super.field3114);
            if (arg2 < 23) {
                this.field3404 = false;
            }
            return var5.method638(arg1, arg3, var6, false);
        }
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lza;Lii;IIIIIZIIIIII)V")
    public class223(class299 arg0, class395 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        super(arg4, arg5, arg6, arg8, arg9, arg10, class159.method1147((byte) 120, arg11, arg12));
        this.field3411 = new class191(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
        this.field3404 = ~arg1.field5840 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(BZ)Z")
    public static final boolean method1544(byte arg0, boolean arg1) {
        int var2 = 102 % ((73 - arg0) / 43);
        ++field3408;
        boolean var3 = class376.field5542.method544();
        if (!var3 != arg1) {
            return true;
        } else {
            if (arg1) {
                if (!class376.field5542.method508()) {
                    arg1 = false;
                }
            } else {
                class376.field5542.method527();
            }
            if (arg1 != var3) {
                class40.field667.field4202 = arg1;
                class40.field667.method422(class122.field1844, 1);
                return true;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(B)Z")
    public final boolean method104(byte arg0) {
        ++field3403;
        int var2 = -106 / ((-41 - arg0) / 38);
        return this.field3411.method1328((byte) -93);
    }

    @OriginalMember(owner = "client!al", name = "d", descriptor = "(B)I")
    public final int method1421(byte arg0) {
        int var2 = -126 / ((arg0 - -48) / 35);
        ++field3415;
        return this.field3411.method1324((byte) -57);
    }

    @OriginalMember(owner = "client!al", name = "c", descriptor = "(I)V")
    public final void method106(int arg0) {
        if (arg0 != -19159) {
            this.field3411 = null;
        }
        ++field3402;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(BLza;)V")
    public final void method100(byte arg0, class299 arg1) {
        if (arg0 != 51) {
            this.field3411 = null;
        }
        ++field3412;
        this.field3411.method1321(-32004, arg1);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(B)I")
    public final int method99(byte arg0) {
        ++field3407;
        return arg0 != -107 ? 43 : this.field3411.field2946;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)I")
    public final int method97(int arg0) {
        if (arg0 < 82) {
            this.field3411 = null;
        }
        ++field3414;
        return this.field3411.field2917;
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(I)I")
    public final int method103(int arg0) {
        if (arg0 >= -10) {
            this.field3404 = false;
        }
        ++field3409;
        return this.field3411.field2951;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ILza;)V")
    public final void method98(int arg0, class299 arg1) {
        if (arg0 != 31203) {
            this.method1421((byte) -66);
        }
        ++field3413;
        class289 var3 = this.field3411.method1322(super.field3126, arg1, (byte) -124, true, false, 262144, super.field3114);
        if (var3 != null) {
            int var4 = super.field3126 >> 7;
            int var5 = super.field3114 >> 7;
            this.field3411.method1323(var5, arg0 + -33579, arg1, false, var3, var4, var4, var5);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Lza;B)V")
    public final void method96(class299 arg0, byte arg1) {
        if (arg1 > 78) {
            this.field3411.method1319(119, arg0);
            ++field3410;
        }
    }
}
