import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cda")
public class class390 extends class360 implements class231 {

    @OriginalMember(owner = "client!cda", name = "I", descriptor = "Lwca;")
    public class308 field5829;

    @OriginalMember(owner = "client!cda", name = "x", descriptor = "Z")
    private boolean field5818;

    @OriginalMember(owner = "client!cda", name = "u", descriptor = "I")
    public static int field5815 = 0;

    @OriginalMember(owner = "client!cda", name = "t", descriptor = "Luj;")
    public static class574 field5814 = new class574(128);

    @OriginalMember(owner = "client!cda", name = "s", descriptor = "I")
    public static int field5813;

    @OriginalMember(owner = "client!cda", name = "v", descriptor = "I")
    public static int field5816;

    @OriginalMember(owner = "client!cda", name = "w", descriptor = "I")
    public static int field5817;

    @OriginalMember(owner = "client!cda", name = "y", descriptor = "I")
    public static int field5819;

    @OriginalMember(owner = "client!cda", name = "z", descriptor = "I")
    public static int field5820;

    @OriginalMember(owner = "client!cda", name = "A", descriptor = "I")
    public static int field5821;

    @OriginalMember(owner = "client!cda", name = "B", descriptor = "I")
    public static int field5822;

    @OriginalMember(owner = "client!cda", name = "C", descriptor = "I")
    public static int field5823;

    @OriginalMember(owner = "client!cda", name = "D", descriptor = "I")
    public static int field5824;

    @OriginalMember(owner = "client!cda", name = "E", descriptor = "I")
    public static int field5825;

    @OriginalMember(owner = "client!cda", name = "F", descriptor = "I")
    public static int field5826;

    @OriginalMember(owner = "client!cda", name = "G", descriptor = "I")
    public static int field5827;

    @OriginalMember(owner = "client!cda", name = "H", descriptor = "I")
    public static int field5828;

    @OriginalMember(owner = "client!cda", name = "J", descriptor = "I")
    public static int field5830;

    @OriginalMember(owner = "client!cda", name = "L", descriptor = "I")
    public static int field5832;

    @OriginalMember(owner = "client!cda", name = "M", descriptor = "I")
    public static int field5833;

    @OriginalMember(owner = "client!cda", name = "N", descriptor = "I")
    public static int field5834;

    @OriginalMember(owner = "client!cda", name = "O", descriptor = "I")
    public static int field5835;

    @OriginalMember(owner = "client!cda", name = "K", descriptor = "Lkm;")
    private class120 field5831;

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(ZLqa;)V", line = 4)
    public final void method268(boolean arg0, class167 arg1) {
        ++field5824;
        this.field5829.method1911(arg1, -8881);
        if (!arg0) {
            this.method1175(true);
        }
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(IIIIIIII)V", line = 21)
    public static final void method2358(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field5813;
        int var8 = class34.method306(class222.field3350, arg4, class409.field6071, (byte) 108);
        int var9 = class34.method306(class222.field3350, arg1, class409.field6071, (byte) 110);
        if (arg3 != 1) {
            method2359((class648) null, -103, 125, -70, 72);
        }
        int var10 = class34.method306(class183.field2638, arg7, class268.field3911, (byte) 100);
        int var11 = class34.method306(class183.field2638, arg5, class268.field3911, (byte) 101);
        int var12 = class34.method306(class222.field3350, arg4 + arg6, class409.field6071, (byte) 112);
        int var13 = class34.method306(class222.field3350, -arg6 + arg1, class409.field6071, (byte) 90);
        for (int var14 = var8; var12 > var14; ++var14) {
            class614.method3490(arg0, var10, -101, class495.field6944[var14], var11);
        }
        for (int var15 = var9; ~var15 < ~var13; --var15) {
            class614.method3490(arg0, var10, -91, class495.field6944[var15], var11);
        }
        int var16 = class34.method306(class183.field2638, arg7 - -arg6, class268.field3911, (byte) 101);
        int var17 = class34.method306(class183.field2638, -arg6 + arg5, class268.field3911, (byte) 93);
        for (int var18 = var12; var13 >= var18; ++var18) {
            int[] var19 = class495.field6944[var18];
            class614.method3490(arg0, var10, -91, var19, var16);
            class614.method3490(arg2, var16, -123, var19, var17);
            class614.method3490(arg0, var17, -111, var19, var11);
        }
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(Lqa;I)Lbi;", line = 74)
    public final class465 method267(class167 arg0, int arg1) {
        ++field5819;
        class519 var3 = this.field5829.method1908(2048, -1, arg0, false, true, super.field5109, super.field5108);
        if (var3 == null) {
            return null;
        } else {
            class105 var4 = arg0.method637();
            var4.method884(super.field5108, super.field5111, super.field5109);
            class465 var5 = null;
            if (this.field5818) {
                var5 = class603.method3437((byte) -22, 1);
            }
            if (this.field5829.field4460 == null) {
                var3.method1379(var4, var5 != null ? var5.field6707[0] : null, 0);
            } else {
                class616 var6 = this.field5829.field4460.method3350();
                arg0.method553(var3, var6, var4, var5 == null ? null : var5.field6707[0], 0);
            }
            if (arg1 != 2) {
                this.method266((class167) null, (byte) -30);
            }
            if (this.field5831 == null) {
                this.field5831 = class577.method3298(var3, super.field5108, super.field5109, (byte) 106, super.field5111);
            } else {
                class221.method1477(var3, this.field5831, super.field5109, super.field5108, arg1 ^ -8038, super.field5111);
            }
            this.field5829.method1907(var3, true, super.field5113, arg0, 34165, super.field5107, super.field5119, super.field5117);
            return var5;
        }
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(Z)Z", line = 117)
    public final boolean method868(boolean arg0) {
        if (arg0) {
            this.field5818 = false;
        }
        ++field5816;
        return false;
    }

    @OriginalMember(owner = "client!cda", name = "e", descriptor = "(I)V", line = 128)
    public final void method867(int arg0) {
        ++field5825;
        if (arg0 >= 12) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(Lqa;B)V", line = 139)
    public final void method266(class167 arg0, byte arg1) {
        ++field5821;
        if (arg1 != -40) {
            this.method266((class167) null, (byte) -61);
        }
        class519 var3 = this.field5829.method1908(262144, -1, arg0, true, true, super.field5109, super.field5108);
        if (var3 != null) {
            this.field5829.method1907(var3, false, super.field5113, arg0, 34165, super.field5107, super.field5119, super.field5117);
        }
    }

    @OriginalMember(owner = "client!cda", name = "b", descriptor = "(ILqa;)Lkm;", line = 154)
    public final class120 method260(int arg0, class167 arg1) {
        ++field5835;
        return arg0 >= -50 ? null : this.field5831;
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(ILqa;Z)Lr;", line = 166)
    public final class519 method254(int arg0, class167 arg1, boolean arg2) {
        if (arg2) {
            return null;
        } else {
            ++field5832;
            return this.field5829.method1908(arg0, -1, arg1, false, false, 0, 0);
        }
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(Ljba;IIII)V", line = 179)
    public static final void method2359(class648 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 == 1 && arg3 > 0) {
            class321.method2002(arg0, arg2, arg3 - 1, arg4);
        } else if (arg1 == 4 && arg3 <= class362.field5145) {
            class321.method2002(arg0, arg2, arg3 + 1, arg4);
        } else if (arg1 == 8 && arg4 > 0) {
            class321.method2002(arg0, arg2, arg3, arg4 - 1);
        } else if (arg1 == 2 && arg4 <= class305.field4400) {
            class321.method2002(arg0, arg2, arg3, arg4 + 1);
        } else if (arg1 == 16 && arg3 > 0 && arg4 <= class305.field4400) {
            class321.method2002(arg0, arg2, arg3 - 1, arg4 + 1);
        } else if (arg1 == 32 && arg3 <= class362.field5145 && arg4 <= class305.field4400) {
            class321.method2002(arg0, arg2, arg3 + 1, arg4 + 1);
        } else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
            class321.method2002(arg0, arg2, arg3 - 1, arg4 - 1);
        } else if (arg1 == 64 && arg3 <= class362.field5145 && arg4 > 0) {
            class321.method2002(arg0, arg2, arg3 + 1, arg4 - 1);
        } else {
            throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
        }
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(I)I", line = 230)
    public final int method269(int arg0) {
        if (arg0 != -13265) {
            this.method254(-76, (class167) null, false);
        }
        ++field5817;
        return this.field5829.field4433;
    }

    @OriginalMember(owner = "client!cda", name = "b", descriptor = "(I)I", line = 241)
    public final int method264(int arg0) {
        if (arg0 != -25792) {
            this.method266((class167) null, (byte) -69);
        }
        ++field5823;
        return this.field5829.field4455;
    }

    @OriginalMember(owner = "client!cda", name = "<init>", descriptor = "(Lqa;Ltk;IIIIIZIIIIIII)V", line = 252)
    public class390(class167 arg0, class370 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field5317 == 1, class531.method2993(arg13, arg12, -4762));
        this.field5829 = new class308(arg0, arg1, arg12, arg13, super.field5116, arg3, arg4, arg6, arg7, arg14);
        this.field5818 = arg1.field5276 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!cda", name = "d", descriptor = "(I)Z", line = 262)
    public final boolean method262(int arg0) {
        if (arg0 != -21131) {
            this.method262(-118);
        }
        ++field5822;
        return this.field5829.method1910(-1);
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(BZILqa;IILcea;)V", line = 277)
    public final void method866(byte arg0, boolean arg1, int arg2, class167 arg3, int arg4, int arg5, class103 arg6) {
        ++field5827;
        if (arg0 != -84) {
            this.field5831 = null;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!cda", name = "f", descriptor = "(I)V", line = 298)
    public static void method2360(int arg0) {
        field5814 = null;
        if (arg0 != 0) {
            method2359((class648) null, -95, 80, -63, 52);
        }
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(ILqa;)V", line = 308)
    public final void method255(int arg0, class167 arg1) {
        this.field5829.method1919(-22, arg1);
        int var3 = -100 % ((arg0 - -46) / 42);
        ++field5820;
    }

    @OriginalMember(owner = "client!cda", name = "b", descriptor = "(Z)I", line = 318)
    public final int method1175(boolean arg0) {
        if (arg0) {
            return 43;
        } else {
            ++field5830;
            return this.field5829.method1918(-85);
        }
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(BLqa;II)Z", line = 331)
    public final boolean method263(byte arg0, class167 arg1, int arg2, int arg3) {
        ++field5834;
        class519 var5 = this.field5829.method1908(131072, -1, arg1, false, false, super.field5109, super.field5108);
        if (var5 == null) {
            return false;
        } else if (arg0 != 29) {
            return true;
        } else {
            class105 var6 = arg1.method637();
            var6.method884(super.field5108, super.field5111, super.field5109);
            return var5.method1399(arg2, arg3, var6, false);
        }
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(B)I", line = 354)
    public final int method258(byte arg0) {
        ++field5833;
        return arg0 != -36 ? 79 : this.field5829.field4430;
    }

    @OriginalMember(owner = "client!cda", name = "c", descriptor = "(I)V", line = 366)
    public final void method270(int arg0) {
        int var2 = 11 / ((-1 - arg0) / 47);
        ++field5826;
    }
}
