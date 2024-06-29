import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class218 extends class44 implements class111 {

    @OriginalMember(owner = "client!ir", name = "I", descriptor = "Z")
    private boolean field3015;

    @OriginalMember(owner = "client!ir", name = "M", descriptor = "Z")
    private boolean field3019;

    @OriginalMember(owner = "client!ir", name = "E", descriptor = "S")
    private short field3011;

    @OriginalMember(owner = "client!ir", name = "y", descriptor = "B")
    private byte field3005;

    @OriginalMember(owner = "client!ir", name = "Q", descriptor = "B")
    private byte field3023;

    @OriginalMember(owner = "client!ir", name = "S", descriptor = "Z")
    private boolean field3025;

    @OriginalMember(owner = "client!ir", name = "P", descriptor = "Z")
    private boolean field3022;

    @OriginalMember(owner = "client!ir", name = "z", descriptor = "Lug;")
    private class325 field3006;

    @OriginalMember(owner = "client!ir", name = "w", descriptor = "Lsj;")
    private class73 field3003;

    @OriginalMember(owner = "client!ir", name = "L", descriptor = "Laj;")
    public static class71 field3018 = new class71(16);

    @OriginalMember(owner = "client!ir", name = "Y", descriptor = "Lls;")
    public static class297 field3031 = class130.method1011(-1);

    @OriginalMember(owner = "client!ir", name = "v", descriptor = "I")
    public static int field3002;

    @OriginalMember(owner = "client!ir", name = "x", descriptor = "I")
    public static int field3004;

    @OriginalMember(owner = "client!ir", name = "A", descriptor = "I")
    public static int field3007;

    @OriginalMember(owner = "client!ir", name = "B", descriptor = "I")
    public static int field3008;

    @OriginalMember(owner = "client!ir", name = "C", descriptor = "I")
    public static int field3009;

    @OriginalMember(owner = "client!ir", name = "D", descriptor = "I")
    public static int field3010;

    @OriginalMember(owner = "client!ir", name = "F", descriptor = "I")
    public static int field3012;

    @OriginalMember(owner = "client!ir", name = "G", descriptor = "I")
    public static int field3013;

    @OriginalMember(owner = "client!ir", name = "H", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!ir", name = "J", descriptor = "I")
    public static int field3016;

    @OriginalMember(owner = "client!ir", name = "K", descriptor = "I")
    public static int field3017;

    @OriginalMember(owner = "client!ir", name = "N", descriptor = "I")
    public static int field3020;

    @OriginalMember(owner = "client!ir", name = "O", descriptor = "I")
    public static int field3021;

    @OriginalMember(owner = "client!ir", name = "R", descriptor = "I")
    public static int field3024;

    @OriginalMember(owner = "client!ir", name = "T", descriptor = "I")
    public static int field3026;

    @OriginalMember(owner = "client!ir", name = "U", descriptor = "I")
    public static int field3027;

    @OriginalMember(owner = "client!ir", name = "V", descriptor = "I")
    public static int field3028;

    @OriginalMember(owner = "client!ir", name = "W", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!ir", name = "X", descriptor = "I")
    public static int field3030;

    @OriginalMember(owner = "client!ir", name = "bb", descriptor = "I")
    public static int field3034;

    @OriginalMember(owner = "client!ir", name = "Z", descriptor = "Lns;")
    public static class174 field3032;

    @OriginalMember(owner = "client!ir", name = "ab", descriptor = "Lrk;")
    public static class427 field3033;

    @OriginalMember(owner = "client!ir", name = "c", descriptor = "(I)Z")
    public final boolean method577(int arg0) {
        if (arg0 != -16528) {
            this.field3025 = true;
        }
        ++field3016;
        return this.field3022;
    }

    @OriginalMember(owner = "client!ir", name = "e", descriptor = "(I)Z")
    public final boolean method537(int arg0) {
        if (arg0 >= -48) {
            this.field3025 = false;
        }
        ++field3028;
        return this.field3015;
    }

    @OriginalMember(owner = "client!ir", name = "h", descriptor = "(I)V")
    public static final void method1489(int arg0) {
        ++field3014;
        class410 var1 = class418.field5861;
        synchronized (class418.field5861) {
            class418.field5861.method2533(0);
        }
        if (arg0 <= 121) {
            field3032 = null;
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IILpe;I)Z")
    public final boolean method583(int arg0, int arg1, class391 arg2, int arg3) {
        ++field3017;
        class73 var5 = this.method1495(arg2, arg3, false);
        if (var5 != null) {
            class156 var6 = arg2.method226();
            var6.method308(super.field707, super.field704, super.field706);
            return var5.method455(arg1, arg0, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(II)I")
    public static final int method1490(int arg0, int arg1) {
        ++field3021;
        class167 var2 = class428.method2666(arg0, arg1 ^ 56132);
        int var3 = var2.field2482;
        int var4 = var2.field2483;
        int var5 = var2.field2478;
        int var6 = class221.field3054[var5 - var4];
        return arg1 != -23365 ? 58 : class414.field5782[var3] >> var4 & var6;
    }

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(B)I")
    public final int method582(byte arg0) {
        ++field3024;
        if (arg0 != 22) {
            this.field3006 = null;
        }
        return this.field3011 & 65535;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(ILpe;)V")
    public final void method581(int arg0, class391 arg1) {
        if (arg0 == 0) {
            ++field3008;
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lpe;B)Lca;")
    public final class415 method572(class391 arg0, byte arg1) {
        ++field3030;
        if (this.field3003 == null) {
            return null;
        } else {
            class156 var3 = arg0.method226();
            var3.method308(super.field707, super.field704, super.field706);
            class415 var4 = null;
            if (arg1 > -45) {
                method1490(15, 32);
            }
            if (this.field3025) {
                var4 = class340.method2159(24579, 1);
            }
            this.field3003.method478(var3, var4 == null ? null : var4.field5799[0], 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(I)I")
    public final int method580(int arg0) {
        ++field3007;
        return arg0 != 24493 ? 126 : this.field3023;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lpe;I)V")
    public final void method574(class391 arg0, int arg1) {
        ++field3004;
        if (arg1 == -28992) {
            Object var3 = null;
            class325 var5;
            if (this.field3006 == null && this.field3022) {
                class265 var4 = this.method1494((byte) -23, true, arg0, 131072);
                var5 = var4 == null ? null : var4.field3561;
            } else {
                var5 = this.field3006;
                this.field3006 = null;
            }
            if (var5 != null) {
                class400.method2453(var5, this.field3005, super.field707, super.field706, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(ZILhh;Lpe;III)V")
    public final void method532(boolean arg0, int arg1, class184 arg2, class391 arg3, int arg4, int arg5, int arg6) {
        int var8 = 105 / ((76 - arg1) / 38);
        if (arg2 instanceof class218) {
            class218 var9 = (class218) arg2;
            if (this.field3003 != null && var9.field3003 != null) {
                this.field3003.method419(var9.field3003, arg5, arg4, arg6, arg0);
            }
        }
        ++field3034;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(B)V")
    public final void method573(byte arg0) {
        if (this.field3003 != null) {
            this.field3003.method458();
        }
        if (arg0 > -100) {
            method1491(false);
        }
        ++field3012;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lpe;II)Lsj;")
    public final class73 method576(class391 arg0, int arg1, int arg2) {
        ++field3027;
        return arg2 != -2705 ? null : this.method1495(arg0, arg1, false);
    }

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(Z)V")
    public static final void method1491(boolean arg0) {
        ++field3002;
        if (~class177.field2613 < -1) {
            class239.method1589(-122);
        } else {
            class118.field1642 = class105.field1540;
            if (arg0) {
                method1492((byte) 103);
            }
            class105.field1540 = null;
            class29.method340(40, (byte) -58);
        }
    }

    @OriginalMember(owner = "client!ir", name = "g", descriptor = "(B)[Luo;")
    public static final class385[] method1492(byte arg0) {
        if (class264.field3542 == null) {
            class385[] var1 = class296.method1904(class30.field502, true);
            class385[] var2 = new class385[var1.length];
            int var3 = 0;
            label63: for (int var4 = 0; ~var1.length < ~var4; ++var4) {
                class385 var8 = var1[var4];
                if ((var8.field5430 <= 0 || ~var8.field5430 <= -25) && ~var8.field5424 <= -801 && ~var8.field5426 <= -601 && (~class297.field4005 <= -97 || class243.field3355 != 0 || ~var8.field5424 >= -1025 && var8.field5426 <= 768)) {
                    for (int var9 = 0; var3 > var9; ++var9) {
                        class385 var10 = var2[var9];
                        if (~var8.field5424 == ~var10.field5424 && var8.field5426 == var10.field5426) {
                            if (~var10.field5430 > ~var8.field5430) {
                                var2[var9] = var8;
                            }
                            continue label63;
                        }
                    }
                    var2[var3] = var8;
                    ++var3;
                }
            }
            class264.field3542 = new class385[var3];
            class152.method1169(var2, 0, class264.field3542, 0, var3);
            int[] var5 = new int[class264.field3542.length];
            for (int var6 = 0; class264.field3542.length > var6; ++var6) {
                class385 var7 = class264.field3542[var6];
                var5[var6] = var7.field5426 * var7.field5424;
            }
            class199.method1408(class264.field3542, var5, 8239);
        }
        ++field3020;
        int var11 = 103 % ((34 - arg0) / 35);
        return class264.field3542;
    }

    @OriginalMember(owner = "client!ir", name = "i", descriptor = "(I)V")
    public static void method1493(int arg0) {
        if (arg0 != 768) {
            method1492((byte) 89);
        }
        field3018 = null;
        field3031 = null;
        field3033 = null;
        field3032 = null;
    }

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(I)I")
    public final int method575(int arg0) {
        ++field3026;
        if (arg0 != -15863) {
            this.field3015 = true;
        }
        return 22;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(BZLpe;I)Lil;")
    private final class265 method1494(byte arg0, boolean arg1, class391 arg2, int arg3) {
        ++field3009;
        class372 var5 = class10.method53(65535 & this.field3011, true);
        if (arg0 != -23) {
            this.method574((class391) null, 70);
        }
        class411 var6;
        class411 var7;
        if (!this.field3019) {
            var6 = class265.field3566[this.field3005];
            if (~this.field3005 <= -4) {
                var7 = null;
            } else {
                var7 = class265.field3566[this.field3005 + 1];
            }
        } else {
            var6 = class244.field3367[this.field3005];
            var7 = class265.field3566[0];
        }
        return var5.method2318(super.field706, this.field3023, arg1, arg2, (byte) -30, var6, var7, 22, super.field704, arg3, super.field707);
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lpe;IZ)Lsj;")
    private final class73 method1495(class391 arg0, int arg1, boolean arg2) {
        ++field3010;
        if (this.field3003 != null && ~arg0.method183(this.field3003.method426(), arg1) == -1) {
            return this.field3003;
        } else {
            class265 var4 = this.method1494((byte) -23, arg2, arg0, arg1);
            return var4 == null ? null : var4.field3562;
        }
    }

    @OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(Lpe;Lkk;IIIIZIZ)V")
    public class218(class391 arg0, class372 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, boolean arg8) {
        super(arg3, arg4, arg5, arg1.field5183, arg1.field5159);
        this.field3015 = arg8;
        this.field3019 = arg6;
        this.field3011 = (short) arg1.field5157;
        this.field3005 = (byte) arg2;
        this.field3023 = (byte) arg7;
        super.field706 = (short) arg5;
        super.field707 = (short) arg3;
        this.field3025 = arg1.field5204 != 0;
        this.field3022 = arg0.method227() && arg1.field5215 && !this.field3019 && ~class179.field2633 != -1;
        int var10 = 1024;
        if (this.field3015) {
            var10 |= 32768;
        }
        class265 var11 = this.method1494((byte) -23, this.field3022, arg0, var10);
        if (var11 != null) {
            this.field3006 = var11.field3561;
            this.field3003 = var11.field3562;
            if (this.field3015) {
                this.field3003 = this.field3003.method440((byte) 0, var10, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IIILf;Lf;)V")
    public static final void method1496(int arg0, int arg1, int arg2, class57 arg3, class57 arg4) {
        if (class118.field1653[arg0][arg1][arg2] == null) {
            class263.method1695(arg0, arg1, arg2);
        }
        class118.field1653[arg0][arg1][arg2].field3121 = arg3;
        class118.field1653[arg0][arg1][arg2].field3116 = arg4;
    }

    @OriginalMember(owner = "client!ir", name = "c", descriptor = "(B)V")
    public final void method535(byte arg0) {
        if (arg0 > 110) {
            ++field3029;
            this.field3015 = false;
            if (this.field3003 != null) {
                this.field3003.method463(-32769 & this.field3003.method426());
            }
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(BLpe;)V")
    public final void method570(byte arg0, class391 arg1) {
        ++field3013;
        int var3 = -103 % ((66 - arg0) / 39);
        Object var4 = null;
        class325 var6;
        if (this.field3006 == null && this.field3022) {
            class265 var5 = this.method1494((byte) -23, true, arg1, 131072);
            var6 = var5 != null ? var5.field3561 : null;
        } else {
            var6 = this.field3006;
            this.field3006 = null;
        }
        if (var6 != null) {
            class415.method2573(var6, this.field3005, super.field707, super.field706, (boolean[]) null);
        }
    }
}
