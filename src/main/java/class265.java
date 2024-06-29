import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class265 extends class363 implements class231 {

    @OriginalMember(owner = "client!fn", name = "y", descriptor = "Z")
    private boolean field3857;

    @OriginalMember(owner = "client!fn", name = "l", descriptor = "B")
    private byte field3844;

    @OriginalMember(owner = "client!fn", name = "U", descriptor = "S")
    private short field3876;

    @OriginalMember(owner = "client!fn", name = "r", descriptor = "B")
    private byte field3850;

    @OriginalMember(owner = "client!fn", name = "N", descriptor = "B")
    private byte field3870;

    @OriginalMember(owner = "client!fn", name = "u", descriptor = "Z")
    private boolean field3853;

    @OriginalMember(owner = "client!fn", name = "p", descriptor = "Z")
    private boolean field3848;

    @OriginalMember(owner = "client!fn", name = "O", descriptor = "Z")
    private boolean field3871;

    @OriginalMember(owner = "client!fn", name = "G", descriptor = "Lk;")
    private class88 field3864;

    @OriginalMember(owner = "client!fn", name = "m", descriptor = "Lr;")
    public class519 field3845;

    @OriginalMember(owner = "client!fn", name = "A", descriptor = "Lbv;")
    public static class567 field3859 = new class567("Loading JACLIB - ", "Lade JACLIB - ", "Chargement JACLIB - ", "Carregando JACLIB - ");

    @OriginalMember(owner = "client!fn", name = "I", descriptor = "Lpp;")
    public static class464 field3866 = new class464(55, 4);

    @OriginalMember(owner = "client!fn", name = "n", descriptor = "I")
    public static int field3846;

    @OriginalMember(owner = "client!fn", name = "o", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!fn", name = "q", descriptor = "I")
    public static int field3849;

    @OriginalMember(owner = "client!fn", name = "s", descriptor = "I")
    public static int field3851;

    @OriginalMember(owner = "client!fn", name = "v", descriptor = "I")
    public static int field3854;

    @OriginalMember(owner = "client!fn", name = "w", descriptor = "I")
    public static int field3855;

    @OriginalMember(owner = "client!fn", name = "x", descriptor = "I")
    public static int field3856;

    @OriginalMember(owner = "client!fn", name = "z", descriptor = "I")
    public static int field3858;

    @OriginalMember(owner = "client!fn", name = "B", descriptor = "I")
    public static int field3860;

    @OriginalMember(owner = "client!fn", name = "C", descriptor = "I")
    public static int field3861;

    @OriginalMember(owner = "client!fn", name = "D", descriptor = "I")
    public static int field3862;

    @OriginalMember(owner = "client!fn", name = "F", descriptor = "I")
    public static int field3863;

    @OriginalMember(owner = "client!fn", name = "H", descriptor = "I")
    public static int field3865;

    @OriginalMember(owner = "client!fn", name = "J", descriptor = "I")
    public static int field3867;

    @OriginalMember(owner = "client!fn", name = "L", descriptor = "I")
    public static int field3868;

    @OriginalMember(owner = "client!fn", name = "M", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!fn", name = "P", descriptor = "I")
    public static int field3872;

    @OriginalMember(owner = "client!fn", name = "S", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!fn", name = "T", descriptor = "I")
    public static int field3875;

    @OriginalMember(owner = "client!fn", name = "W", descriptor = "I")
    public static int field3878;

    @OriginalMember(owner = "client!fn", name = "X", descriptor = "I")
    public static int field3879;

    @OriginalMember(owner = "client!fn", name = "t", descriptor = "Lkm;")
    private class120 field3852;

    @OriginalMember(owner = "client!fn", name = "V", descriptor = "[I")
    public static int[] field3877;

    @OriginalMember(owner = "client!fn", name = "R", descriptor = "[[S")
    public static short[][] field3873;

    @OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(Lqa;Ltk;IIIIZIIZ)V")
    public class265(class167 arg0, class370 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, boolean arg9) {
        super(arg3, arg4, arg5, class545.method3050(arg8, arg7, (byte) -101));
        this.field3857 = arg1.field5276 != 0 && !arg6;
        this.field3844 = (byte) arg2;
        super.field5151 = arg5;
        this.field3876 = (short) arg1.field5335;
        this.field3850 = (byte) arg7;
        this.field3870 = (byte) arg8;
        this.field3853 = arg6;
        this.field3848 = arg9;
        super.field5156 = arg3;
        this.field3871 = arg0.method594() && arg1.field5353 && !this.field3853 && ~class202.field2854.method3143(class646.field9388, 0) != -1;
        int var11 = 2048;
        if (this.field3848) {
            var11 |= 65536;
        }
        class380 var12 = this.method1681(this.field3871, -76, var11, arg0);
        if (var12 != null) {
            this.field3864 = var12.field5591;
            this.field3845 = var12.field5589;
            if (this.field3848) {
                this.field3845 = this.field3845.method765((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "(B)V")
    public static void method1678(byte arg0) {
        field3877 = null;
        if (arg0 <= -100) {
            field3866 = null;
            field3873 = null;
            field3859 = null;
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lqa;B)V")
    public final void method266(class167 arg0, byte arg1) {
        ++field3874;
        if (arg1 != -40) {
            field3877 = null;
        }
    }

    @OriginalMember(owner = "client!fn", name = "e", descriptor = "(I)V")
    public final void method867(int arg0) {
        ++field3878;
        if (arg0 < 12) {
            this.method269(119);
        }
        this.field3848 = false;
        if (this.field3845 != null) {
            this.field3845.method1405(this.field3845.method1373() & -65537);
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(BZILqa;IILcea;)V")
    public final void method866(byte arg0, boolean arg1, int arg2, class167 arg3, int arg4, int arg5, class103 arg6) {
        ++field3861;
        if (!(arg6 instanceof class265)) {
            if (arg6 instanceof class388) {
                class388 var8 = (class388) arg6;
                if (this.field3845 != null && var8.field5764 != null) {
                    this.field3845.method1363(var8.field5764, arg4, arg2, arg5, arg1);
                }
            }
        } else {
            class265 var9 = (class265) arg6;
            if (this.field3845 != null && var9.field3845 != null) {
                this.field3845.method1363(var9.field3845, arg4, arg2, arg5, arg1);
            }
        }
        if (arg0 != -84) {
            method1678((byte) 90);
        }
    }

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "(B)V")
    public static final void method1679(byte arg0) {
        ++field3879;
        for (class127 var1 = (class127) class207.field2932.method427(true); var1 != null; var1 = (class127) class207.field2932.method420(false)) {
            if (~var1.field2083 < -1) {
                --var1.field2083;
            }
            if (var1.field2083 != 0) {
                if (~var1.field2070 < -1) {
                    --var1.field2070;
                }
                if (~var1.field2070 == -1 && ~var1.field2074 <= -2 && var1.field2073 >= 1 && class146.field2247 + -2 >= var1.field2074 && var1.field2073 <= class66.field990 + -2 && (~var1.field2072 > -1 || class358.method2169((byte) 74, var1.field2072, var1.field2075))) {
                    class421.method2534(var1.field2075, var1.field2082, var1.field2078, var1.field2074, (byte) 13, var1.field2073, var1.field2071, var1.field2072, -1);
                    var1.field2070 = -1;
                    if (~var1.field2084 == ~var1.field2072 && var1.field2084 == -1) {
                        var1.method911(-52);
                    } else if (var1.field2084 == var1.field2072 && var1.field2082 == var1.field2076 && var1.field2081 == var1.field2075) {
                        var1.method911(-52);
                    }
                }
            } else if (~var1.field2084 > -1 || class358.method2169((byte) -121, var1.field2084, var1.field2081)) {
                class421.method2534(var1.field2081, var1.field2076, var1.field2078, var1.field2074, (byte) 13, var1.field2073, var1.field2071, var1.field2084, -1);
                var1.method911(-52);
            }
        }
        int var2 = 71 % ((-17 - arg0) / 41);
    }

    @OriginalMember(owner = "client!fn", name = "g", descriptor = "(I)Ljava/lang/String;")
    public static final String method1680(int arg0) {
        ++field3869;
        if (!class2.field20 && class634.field9212 != null) {
            if (arg0 != -1) {
                field3873 = null;
            }
            return class634.field9212.field8360;
        } else {
            return "";
        }
    }

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "(I)Z")
    public final boolean method262(int arg0) {
        ++field3856;
        if (arg0 != -21131) {
            this.method268(false, (class167) null);
        }
        return this.field3871;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(BLqa;II)Z")
    public final boolean method263(byte arg0, class167 arg1, int arg2, int arg3) {
        ++field3865;
        class519 var5 = this.method1682(131072, (byte) 75, arg1);
        if (var5 != null) {
            class105 var6 = arg1.method637();
            var6.method884(super.field5156, super.field5152, super.field5151);
            return var5.method1399(arg2, arg3, var6, false);
        } else {
            return arg0 != 29;
        }
    }

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(ILqa;)Lkm;")
    public final class120 method260(int arg0, class167 arg1) {
        if (arg0 > -50) {
            this.field3853 = true;
        }
        ++field3867;
        if (this.field3852 == null) {
            this.field3852 = class577.method3298(this.method1682(0, (byte) 75, arg1), super.field5156, super.field5151, (byte) 118, super.field5152);
        }
        return this.field3852;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(ZLqa;)V")
    public final void method268(boolean arg0, class167 arg1) {
        ++field3854;
        Object var3 = null;
        class88 var5;
        if (this.field3864 == null && this.field3871) {
            class380 var4 = this.method1681(true, -94, 262144, arg1);
            var5 = var4 == null ? null : var4.field5591;
        } else {
            var5 = this.field3864;
            this.field3864 = null;
        }
        if (!arg0) {
            method1683(-19, 62, true);
        }
        if (var5 != null) {
            class246.method1566(var5, this.field3844, super.field5156, super.field5151, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "(I)V")
    public final void method270(int arg0) {
        ++field3847;
        int var2 = -57 % ((arg0 - -1) / 47);
        if (this.field3845 != null) {
            this.field3845.method1357();
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(B)I")
    public final int method258(byte arg0) {
        if (arg0 != -36) {
            this.field3857 = false;
        }
        ++field3868;
        return this.field3870;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(ILqa;Z)Lr;")
    public final class519 method254(int arg0, class167 arg1, boolean arg2) {
        if (arg2) {
            this.field3876 = -124;
        }
        ++field3846;
        return this.method1682(arg0, (byte) 75, arg1);
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(ZIILqa;)Lep;")
    private final class380 method1681(boolean arg0, int arg1, int arg2, class167 arg3) {
        ++field3849;
        class370 var5 = class552.field7819.method2890(0, 65535 & this.field3876);
        if (arg1 > -9) {
            return null;
        } else {
            class542 var6;
            class542 var7;
            if (!this.field3853) {
                var6 = class587.field8363[this.field3844];
                if (this.field3844 < 3) {
                    var7 = class587.field8363[this.field3844 + 1];
                } else {
                    var7 = null;
                }
            } else {
                var6 = class73.field1360[this.field3844];
                var7 = class587.field8363[0];
            }
            return var5.method2246(94, this.field3850, var6, var7, this.field3870, super.field5156, arg0, super.field5151, arg2, arg3, super.field5152);
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(ILqa;)V")
    public final void method255(int arg0, class167 arg1) {
        int var3 = -49 % ((arg0 - -46) / 42);
        ++field3875;
        Object var4 = null;
        class88 var6;
        if (this.field3864 == null && this.field3871) {
            class380 var5 = this.method1681(true, -112, 262144, arg1);
            var6 = var5 == null ? null : var5.field5591;
        } else {
            var6 = this.field3864;
            this.field3864 = null;
        }
        if (var6 != null) {
            class371.method2255(var6, this.field3844, super.field5156, super.field5151, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IBLqa;)Lr;")
    private final class519 method1682(int arg0, byte arg1, class167 arg2) {
        ++field3855;
        if (this.field3845 != null && ~arg2.method560(this.field3845.method1373(), arg0) == -1) {
            return this.field3845;
        } else {
            if (arg1 != 75) {
                field3862 = -72;
            }
            class380 var4 = this.method1681(false, -113, arg0, arg2);
            return var4 != null ? var4.field5589 : null;
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)I")
    public final int method269(int arg0) {
        if (arg0 != -13265) {
            return -35;
        } else {
            ++field3863;
            return this.field3850;
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lqa;I)Lbi;")
    public final class465 method267(class167 arg0, int arg1) {
        ++field3851;
        if (this.field3845 == null) {
            return null;
        } else {
            class105 var3 = arg0.method637();
            var3.method884(super.field5156, super.field5152, super.field5151);
            class465 var4 = null;
            if (this.field3857) {
                var4 = class603.method3437((byte) -22, 1);
            }
            if (arg1 != 2) {
                return null;
            } else {
                this.field3845.method1379(var3, var4 != null ? var4.field6707[0] : null, 0);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method1683(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            method1680(-74);
        }
        ++field3860;
        return ~(arg0 & 34) != -1;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Z)Z")
    public final boolean method868(boolean arg0) {
        ++field3872;
        if (arg0) {
            this.field3870 = 39;
        }
        return this.field3848;
    }

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(I)I")
    public final int method264(int arg0) {
        if (arg0 != -25792) {
            this.field3845 = null;
        }
        ++field3858;
        return this.field3876 & 65535;
    }
}
