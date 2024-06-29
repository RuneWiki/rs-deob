import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class654 extends class94 implements class49 {

    @OriginalMember(owner = "client!em", name = "M", descriptor = "Z")
    private boolean field9167 = false;

    @OriginalMember(owner = "client!em", name = "bb", descriptor = "Lrv;")
    public class312 field9179;

    @OriginalMember(owner = "client!em", name = "O", descriptor = "Z")
    private boolean field9168;

    @OriginalMember(owner = "client!em", name = "X", descriptor = "[[I")
    public static int[][] field9175 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!em", name = "U", descriptor = "F")
    public static float field9173 = 1024.0F;

    @OriginalMember(owner = "client!em", name = "fb", descriptor = "I")
    public static int field9183 = 0;

    @OriginalMember(owner = "client!em", name = "J", descriptor = "I")
    public static int field9164;

    @OriginalMember(owner = "client!em", name = "L", descriptor = "I")
    public static int field9166;

    @OriginalMember(owner = "client!em", name = "P", descriptor = "I")
    public static int field9169;

    @OriginalMember(owner = "client!em", name = "Q", descriptor = "I")
    public static int field9170;

    @OriginalMember(owner = "client!em", name = "R", descriptor = "I")
    public static int field9171;

    @OriginalMember(owner = "client!em", name = "T", descriptor = "I")
    public static int field9172;

    @OriginalMember(owner = "client!em", name = "W", descriptor = "I")
    public static int field9174;

    @OriginalMember(owner = "client!em", name = "Y", descriptor = "I")
    public static int field9176;

    @OriginalMember(owner = "client!em", name = "Z", descriptor = "I")
    public static int field9177;

    @OriginalMember(owner = "client!em", name = "ab", descriptor = "I")
    public static int field9178;

    @OriginalMember(owner = "client!em", name = "cb", descriptor = "I")
    public static int field9180;

    @OriginalMember(owner = "client!em", name = "db", descriptor = "I")
    public static int field9181;

    @OriginalMember(owner = "client!em", name = "eb", descriptor = "I")
    public static int field9182;

    @OriginalMember(owner = "client!em", name = "gb", descriptor = "I")
    public static int field9184;

    @OriginalMember(owner = "client!em", name = "hb", descriptor = "I")
    public static int field9185;

    @OriginalMember(owner = "client!em", name = "ib", descriptor = "I")
    public static int field9186;

    @OriginalMember(owner = "client!em", name = "K", descriptor = "Llf;")
    private class676 field9165;

    @OriginalMember(owner = "client!em", name = "c", descriptor = "(Lr;I)Lwj;", line = 3)
    public final class315 method182(class564 arg0, int arg1) {
        ++field9171;
        class473 var3 = this.field9179.method1786(true, arg0, super.field5176, false, -14283, 2048, super.field5179);
        if (var3 == null) {
            return null;
        } else {
            class490 var4 = arg0.method950();
            var4.method23(super.field5179 - -super.field969, super.field5178, super.field973 + super.field5176);
            class315 var5 = null;
            if (this.field9168) {
                var5 = class419.method2349((byte) 122, 1);
            }
            int var6 = super.field5179 >> 9;
            int var7 = super.field5176 >> 9;
            this.field9179.method1794(true, var6, var7, var6, var4, (byte) 83, var3, var7, arg0);
            if (arg1 != 0) {
                field9175 = null;
            }
            if (!class460.field6553) {
                var3.method1914(var4, var5 != null ? var5.field3912[0] : null, 0);
            } else {
                var3.method1875(var4, var5 != null ? var5.field3912[0] : null, class682.field9623, 0);
            }
            if (this.field9179.field3865 != null) {
                class332 var8 = this.field9179.field3865.method1952();
                if (!class460.field6553) {
                    arg0.method1033(var8);
                } else {
                    arg0.method1048(var8, class682.field9623);
                }
            }
            this.field9167 = var3.method1913() || this.field9179.field3865 != null;
            if (this.field9165 != null) {
                class299.method1742(super.field5178, this.field9165, var3, super.field5176, (byte) -117, super.field5179);
            } else {
                this.field9165 = class191.method1166(arg1, super.field5176, var3, super.field5178, super.field5179);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(B)I", line = 56)
    public final int method241(byte arg0) {
        if (arg0 != 29) {
            return -64;
        } else {
            ++field9177;
            return this.field9179.field3875;
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Lr;I)V", line = 67)
    public final void method232(class564 arg0, int arg1) {
        if (arg1 == 6905) {
            this.field9179.method1790((byte) 109, arg0);
            ++field9172;
        }
    }

    @OriginalMember(owner = "client!em", name = "k", descriptor = "(I)I", line = 81)
    public static final int method3638(int arg0) {
        ++field9164;
        int var1 = class512.field7343.method149((byte) 72);
        if (var1 < class140.field1552.length - 1) {
            class512.field7343 = class140.field1552[var1 + 1];
        }
        if (arg0 != 2) {
            field9183 = 84;
        }
        return 100;
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(I)I", line = 101)
    public final int method238(int arg0) {
        if (arg0 != 6518) {
            return 47;
        } else {
            ++field9186;
            return this.field9179.field3866;
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(I)V", line = 113)
    public final void method234(int arg0) {
        if (arg0 >= -51) {
            this.field9167 = true;
        }
        ++field9170;
    }

    @OriginalMember(owner = "client!em", name = "d", descriptor = "(Lr;I)Llf;", line = 125)
    public final class676 method185(class564 arg0, int arg1) {
        if (arg1 < 42) {
            return null;
        } else {
            ++field9181;
            return this.field9165;
        }
    }

    @OriginalMember(owner = "client!em", name = "l", descriptor = "(I)V", line = 136)
    public static void method3639(int arg0) {
        field9175 = null;
        int var1 = -40 / ((arg0 - -86) / 32);
    }

    @OriginalMember(owner = "client!em", name = "i", descriptor = "(I)Z", line = 147)
    public final boolean method177(int arg0) {
        ++field9185;
        if (arg0 >= -103) {
            this.field9168 = true;
        }
        return this.field9167;
    }

    @OriginalMember(owner = "client!em", name = "e", descriptor = "(B)I", line = 158)
    public final int method175(byte arg0) {
        ++field9178;
        return arg0 < 119 ? -8 : this.field9179.method1793(-1);
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Z)I", line = 172)
    public final int method237(boolean arg0) {
        ++field9174;
        if (arg0) {
            this.method173((class564) null, 51, -30, -58);
        }
        return this.field9179.field3848;
    }

    @OriginalMember(owner = "client!em", name = "g", descriptor = "(I)I", line = 185)
    public final int method179(int arg0) {
        if (arg0 != 3370) {
            this.method236((byte) -93);
        }
        ++field9166;
        return this.field9179.method1791((byte) 68);
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Lr;Lqp;IIIIIZIIIII)V", line = 228)
    public class654(class564 arg0, class638 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
        this.field9179 = new class312(arg0, arg1, arg10, arg11, super.field5166, arg3, arg4, arg6, arg7, arg12);
        this.field9168 = ~arg1.field9035 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!em", name = "h", descriptor = "(I)Z", line = 199)
    public final boolean method180(int arg0) {
        if (arg0 != -1) {
            this.method173((class564) null, 127, 88, 78);
        }
        ++field9182;
        return false;
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(Lr;I)V", line = 213)
    public final void method230(class564 arg0, int arg1) {
        this.field9179.method1795(arg0, 91);
        ++field9169;
        if (arg1 != 21670) {
            this.method234(57);
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Lr;III)Z", line = 243)
    public final boolean method173(class564 arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 0) {
            return false;
        } else {
            ++field9184;
            class473 var5 = this.field9179.method1786(false, arg0, super.field5176, false, -14283, 131072, super.field5179);
            if (var5 == null) {
                return false;
            } else {
                class490 var6 = arg0.method950();
                var6.method23(super.field969 + super.field5179, super.field5178, super.field973 + super.field5176);
                return class460.field6553 ? var5.method1896(arg1, arg3, var6, false, class682.field9623) : var5.method1867(arg1, arg3, var6, false);
            }
        }
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(B)Z", line = 263)
    public final boolean method236(byte arg0) {
        if (arg0 > -33) {
            this.field9179 = null;
        }
        ++field9180;
        return this.field9179.method1787(true);
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Lr;Z)V", line = 277)
    public final void method172(class564 arg0, boolean arg1) {
        ++field9176;
        class473 var3 = this.field9179.method1786(true, arg0, super.field5176, arg1, -14283, 262144, super.field5179);
        if (var3 != null) {
            int var4 = super.field5179 >> 9;
            int var5 = super.field5176 >> 9;
            class490 var6 = arg0.method950();
            var6.method23(super.field5179, super.field5178, super.field5176);
            this.field9179.method1794(false, var4, var5, var4, var6, (byte) 82, var3, var5, arg0);
        }
    }
}
