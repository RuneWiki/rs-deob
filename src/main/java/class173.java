import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class173 extends class228 implements class111 {

    @OriginalMember(owner = "client!ua", name = "U", descriptor = "B")
    private byte field2537;

    @OriginalMember(owner = "client!ua", name = "nb", descriptor = "Z")
    private boolean field2556;

    @OriginalMember(owner = "client!ua", name = "H", descriptor = "Z")
    private boolean field2525;

    @OriginalMember(owner = "client!ua", name = "ob", descriptor = "S")
    private short field2557;

    @OriginalMember(owner = "client!ua", name = "M", descriptor = "B")
    private byte field2530;

    @OriginalMember(owner = "client!ua", name = "sb", descriptor = "Z")
    private boolean field2561;

    @OriginalMember(owner = "client!ua", name = "Q", descriptor = "B")
    private byte field2533;

    @OriginalMember(owner = "client!ua", name = "kb", descriptor = "Z")
    private boolean field2553;

    @OriginalMember(owner = "client!ua", name = "J", descriptor = "Lsj;")
    public class73 field2527;

    @OriginalMember(owner = "client!ua", name = "X", descriptor = "Lug;")
    private class325 field2540;

    @OriginalMember(owner = "client!ua", name = "I", descriptor = "[I")
    public static int[] field2526 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!ua", name = "pb", descriptor = "I")
    public static int field2558 = 0;

    @OriginalMember(owner = "client!ua", name = "lb", descriptor = "Z")
    public static boolean field2554 = true;

    @OriginalMember(owner = "client!ua", name = "G", descriptor = "I")
    public static int field2524;

    @OriginalMember(owner = "client!ua", name = "K", descriptor = "I")
    public static int field2528;

    @OriginalMember(owner = "client!ua", name = "L", descriptor = "I")
    public static int field2529;

    @OriginalMember(owner = "client!ua", name = "O", descriptor = "I")
    public static int field2531;

    @OriginalMember(owner = "client!ua", name = "P", descriptor = "I")
    public static int field2532;

    @OriginalMember(owner = "client!ua", name = "R", descriptor = "I")
    public static int field2534;

    @OriginalMember(owner = "client!ua", name = "S", descriptor = "I")
    public static int field2535;

    @OriginalMember(owner = "client!ua", name = "T", descriptor = "I")
    public static int field2536;

    @OriginalMember(owner = "client!ua", name = "V", descriptor = "I")
    public static int field2538;

    @OriginalMember(owner = "client!ua", name = "Y", descriptor = "I")
    public static int field2541;

    @OriginalMember(owner = "client!ua", name = "Z", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!ua", name = "ab", descriptor = "I")
    public static int field2543;

    @OriginalMember(owner = "client!ua", name = "bb", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!ua", name = "cb", descriptor = "I")
    public static int field2545;

    @OriginalMember(owner = "client!ua", name = "db", descriptor = "I")
    public static int field2546;

    @OriginalMember(owner = "client!ua", name = "eb", descriptor = "I")
    public static int field2547;

    @OriginalMember(owner = "client!ua", name = "fb", descriptor = "I")
    public static int field2548;

    @OriginalMember(owner = "client!ua", name = "gb", descriptor = "I")
    public static int field2549;

    @OriginalMember(owner = "client!ua", name = "hb", descriptor = "I")
    public static int field2550;

    @OriginalMember(owner = "client!ua", name = "ib", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!ua", name = "jb", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!ua", name = "mb", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!ua", name = "qb", descriptor = "I")
    public static int field2559;

    @OriginalMember(owner = "client!ua", name = "rb", descriptor = "I")
    public static int field2560;

    @OriginalMember(owner = "client!ua", name = "tb", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!ua", name = "W", descriptor = "[Lkb;")
    public static class80[] field2539;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(I)Z", line = 8)
    public final boolean method577(int arg0) {
        if (arg0 != -16528) {
            this.method575(-90);
        }
        ++field2534;
        return this.field2553;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZLmi;)V", line = 21)
    public static final void method1284(boolean arg0, class409 arg1) {
        if (arg1.field5726 != null) {
            arg1.field5726.field3191 = 0;
        }
        ++field2550;
        arg1.field5725 = arg0;
        for (class409 var2 = arg1.method708(); var2 != null; var2 = arg1.method690()) {
            method1284(false, var2);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(BI)Ljava/lang/String;", line = 46)
    public static final String method1285(byte arg0, int arg1) {
        if (arg0 > -21) {
            return null;
        } else {
            ++field2538;
            if (arg1 < 100000) {
                return "<col=ffff00>" + arg1 + "</col>";
            } else {
                return arg1 < 10000000 ? "<col=ffffff>" + arg1 / 1000 + class362.field4921 + "</col>" : "<col=00ff80>" + arg1 / 1000000 + class63.field965 + "</col>";
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZILpe;)Lsj;", line = 66)
    private final class73 method1286(boolean arg0, int arg1, class391 arg2) {
        ++field2547;
        if (this.field2527 != null && arg2.method183(this.field2527.method426(), arg1) == 0) {
            return this.field2527;
        } else {
            class265 var4 = this.method1290(arg1, arg2, !arg0, arg0);
            return var4 != null ? var4.field3562 : null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILpe;)V", line = 85)
    public final void method581(int arg0, class391 arg1) {
        if (arg0 != 0) {
            this.method577(-88);
        }
        ++field2549;
    }

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "(I)I", line = 96)
    public final int method1287(int arg0) {
        if (arg0 != 0) {
            return -61;
        } else {
            ++field2560;
            return this.field2527 == null ? 15 : this.field2527.method448() / 4;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)I", line = 109)
    public final int method580(int arg0) {
        ++field2543;
        if (arg0 != 24493) {
            this.field2537 = -28;
        }
        return this.field2530;
    }

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "(I)I", line = 121)
    public final int method579(int arg0) {
        if (arg0 != 0) {
            method1285((byte) -50, 51);
        }
        ++field2542;
        return this.field2527 != null ? this.field2527.method420() : 0;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lpe;I)V", line = 134)
    public final void method574(class391 arg0, int arg1) {
        ++field2536;
        Object var3 = null;
        class325 var5;
        if (this.field2540 == null && this.field2553) {
            class265 var4 = this.method1290(131072, arg0, true, true);
            var5 = var4 != null ? var4.field3561 : null;
        } else {
            var5 = this.field2540;
            this.field2540 = null;
        }
        if (var5 != null) {
            class400.method2453(var5, this.field2533, super.field3176, super.field3167, (boolean[]) null);
        }
        if (arg1 != -28992) {
            this.field2557 = 94;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lpe;B)Lca;", line = 161)
    public final class415 method572(class391 arg0, byte arg1) {
        ++field2551;
        if (arg1 > -45) {
            this.method573((byte) 83);
        }
        if (this.field2527 == null) {
            return null;
        } else {
            class156 var3 = arg0.method226();
            var3.method308(super.field3176, super.field3168, super.field3167);
            class415 var4 = null;
            if (this.field2556) {
                var4 = class340.method2159(24579, 1);
            }
            this.field2527.method478(var3, var4 != null ? var4.field5799[0] : null, 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lpe;II)Lsj;", line = 187)
    public final class73 method576(class391 arg0, int arg1, int arg2) {
        if (arg2 != -2705) {
            field2526 = null;
        }
        ++field2546;
        return this.method1286(false, arg1, arg0);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V", line = 203)
    public final void method573(byte arg0) {
        ++field2532;
        if (this.field2527 != null) {
            this.field2527.method458();
        }
        if (arg0 >= -100) {
            this.method573((byte) 14);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lbi;B)Ljava/lang/String;", line = 227)
    public static final String method1288(class139 arg0, byte arg1) {
        if (arg1 > -40) {
            field2526 = null;
        }
        ++field2562;
        if (~client.method1648(arg0).method987(-13163) == -1) {
            return null;
        } else if (arg0.field2047 != null && arg0.field2047.trim().length() != 0) {
            return arg0.field2047;
        } else {
            return class339.field4624 ? "Hidden-use" : null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)I", line = 253)
    public final int method575(int arg0) {
        if (arg0 != -15863) {
            this.field2530 = 98;
        }
        ++field2559;
        return this.field2537;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(BLpe;)V", line = 264)
    public final void method570(byte arg0, class391 arg1) {
        ++field2552;
        Object var3 = null;
        class325 var5;
        if (this.field2540 == null && this.field2553) {
            class265 var4 = this.method1290(131072, arg1, true, true);
            var5 = var4 == null ? null : var4.field3561;
        } else {
            var5 = this.field2540;
            this.field2540 = null;
        }
        int var6 = 103 / ((66 - arg0) / 39);
        if (var5 != null) {
            class415.method2573(var5, this.field2533, super.field3176, super.field3167, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZI)V", line = 292)
    public static final void method1289(boolean arg0, int arg1) {
        class355.field4828.method1801(180, (byte) -126);
        ++field2531;
        ++class160.field2387;
        if (arg1 == 11337) {
            for (class64 var2 = (class64) class204.field2865.method608(-91); var2 != null; var2 = (class64) class204.field2865.method606((byte) 92)) {
                if (!var2.method2370(0)) {
                    var2 = (class64) class204.field2865.method608(-75);
                    if (var2 == null) {
                        break;
                    }
                }
                if (~var2.field973 == -1) {
                    class316.method2013(true, true, arg0, var2);
                }
            }
            if (class331.field4502 != null) {
                class10.method52(class331.field4502, (byte) -89);
                class331.field4502 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Lpe;Lkk;IIIIIZIIIIIIZ)V", line = 330)
    public class173(class391 arg0, class372 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field5142 == 1, class163.method1219(arg12, true, arg13));
        this.field2537 = (byte) arg12;
        this.field2556 = arg1.field5204 != 0;
        this.field2525 = arg7;
        this.field2557 = (short) arg1.field5157;
        this.field2530 = (byte) arg13;
        this.field2561 = arg14;
        this.field2533 = (byte) arg3;
        this.field2553 = arg0.method227() && arg1.field5215 && !this.field2525 && ~class179.field2633 != -1;
        int var16 = 1024;
        if (this.field2561) {
            var16 |= 32768;
        }
        class265 var17 = this.method1290(var16, arg0, true, this.field2553);
        if (var17 != null) {
            this.field2527 = var17.field3562;
            this.field2540 = var17.field3561;
            if (this.field2561) {
                this.field2527 = this.field2527.method440((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILpe;ZZ)Lil;", line = 366)
    private final class265 method1290(int arg0, class391 arg1, boolean arg2, boolean arg3) {
        ++field2524;
        class372 var5 = class10.method53(65535 & this.field2557, arg2);
        class411 var6;
        class411 var7;
        if (!this.field2525) {
            var6 = class265.field3566[this.field2533];
            if (this.field2533 >= 3) {
                var7 = null;
            } else {
                var7 = class265.field3566[this.field2533 + 1];
            }
        } else {
            var7 = class265.field3566[0];
            var6 = class244.field3367[this.field2533];
        }
        return var5.method2318(super.field3167, this.field2537 == 11 ? 4 - -this.field2530 : this.field2530, arg3, arg1, (byte) -30, var6, var7, this.field2537 != 11 ? this.field2537 : 10, super.field3168, arg0, super.field3176);
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(B)V", line = 393)
    public final void method535(byte arg0) {
        this.field2561 = false;
        ++field2535;
        if (this.field2527 != null) {
            this.field2527.method463(this.field2527.method426() & -32769);
        }
        if (arg0 < 110) {
            this.field2557 = 103;
        }
    }

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "(I)Z", line = 408)
    public final boolean method537(int arg0) {
        ++field2544;
        if (arg0 > -48) {
            this.method1287(-101);
        }
        return this.field2561;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZILhh;Lpe;III)V", line = 419)
    public final void method532(boolean arg0, int arg1, class184 arg2, class391 arg3, int arg4, int arg5, int arg6) {
        if (!(arg2 instanceof class314)) {
            if (arg2 instanceof class173) {
                class173 var8 = (class173) arg2;
                if (this.field2527 != null && var8.field2527 != null) {
                    this.field2527.method419(var8.field2527, arg5, arg4, arg6, arg0);
                }
            }
        } else {
            class314 var9 = (class314) arg2;
            if (this.field2527 != null && var9.field4251 != null) {
                this.field2527.method419(var9.field4251, arg5, arg4, arg6, arg0);
            }
        }
        ++field2529;
        int var10 = -72 / ((arg1 - 76) / 38);
    }

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "(B)V", line = 448)
    public static void method1291(byte arg0) {
        field2526 = null;
        if (arg0 < 86) {
            field2545 = 7;
        }
        field2539 = null;
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(B)I", line = 464)
    public final int method582(byte arg0) {
        if (arg0 != 22) {
            this.method581(-53, (class391) null);
        }
        ++field2555;
        return 65535 & this.field2557;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IILpe;I)Z", line = 475)
    public final boolean method583(int arg0, int arg1, class391 arg2, int arg3) {
        ++field2548;
        class73 var5 = this.method1286(false, arg3, arg2);
        if (var5 != null) {
            class156 var6 = arg2.method226();
            var6.method308(super.field3176, super.field3168, super.field3167);
            return var5.method455(arg1, arg0, var6, false);
        } else {
            return false;
        }
    }
}
