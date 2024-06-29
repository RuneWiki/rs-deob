import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class403 extends class578 implements class438 {

    @OriginalMember(owner = "client!le", name = "L", descriptor = "S")
    private short field5789;

    @OriginalMember(owner = "client!le", name = "O", descriptor = "Z")
    private boolean field5792;

    @OriginalMember(owner = "client!le", name = "y", descriptor = "Z")
    private boolean field5777;

    @OriginalMember(owner = "client!le", name = "r", descriptor = "B")
    private byte field5770;

    @OriginalMember(owner = "client!le", name = "D", descriptor = "B")
    private byte field5782;

    @OriginalMember(owner = "client!le", name = "T", descriptor = "B")
    private byte field5797;

    @OriginalMember(owner = "client!le", name = "R", descriptor = "Z")
    private boolean field5795;

    @OriginalMember(owner = "client!le", name = "Q", descriptor = "Z")
    private boolean field5794;

    @OriginalMember(owner = "client!le", name = "v", descriptor = "Lr;")
    public class520 field5774;

    @OriginalMember(owner = "client!le", name = "q", descriptor = "Lk;")
    private class88 field5769;

    @OriginalMember(owner = "client!le", name = "F", descriptor = "Lqu;")
    public static class364 field5784 = new class364(51, 4);

    @OriginalMember(owner = "client!le", name = "V", descriptor = "[[I")
    public static int[][] field5799 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!le", name = "s", descriptor = "I")
    public static int field5771;

    @OriginalMember(owner = "client!le", name = "t", descriptor = "I")
    public static int field5772;

    @OriginalMember(owner = "client!le", name = "u", descriptor = "I")
    public static int field5773;

    @OriginalMember(owner = "client!le", name = "x", descriptor = "I")
    public static int field5776;

    @OriginalMember(owner = "client!le", name = "z", descriptor = "I")
    public static int field5778;

    @OriginalMember(owner = "client!le", name = "A", descriptor = "I")
    public static int field5779;

    @OriginalMember(owner = "client!le", name = "B", descriptor = "I")
    public static int field5780;

    @OriginalMember(owner = "client!le", name = "C", descriptor = "I")
    public static int field5781;

    @OriginalMember(owner = "client!le", name = "E", descriptor = "I")
    public static int field5783;

    @OriginalMember(owner = "client!le", name = "H", descriptor = "I")
    public static int field5785;

    @OriginalMember(owner = "client!le", name = "I", descriptor = "I")
    public static int field5786;

    @OriginalMember(owner = "client!le", name = "J", descriptor = "I")
    public static int field5787;

    @OriginalMember(owner = "client!le", name = "K", descriptor = "I")
    public static int field5788;

    @OriginalMember(owner = "client!le", name = "M", descriptor = "I")
    public static int field5790;

    @OriginalMember(owner = "client!le", name = "N", descriptor = "I")
    public static int field5791;

    @OriginalMember(owner = "client!le", name = "P", descriptor = "I")
    public static int field5793;

    @OriginalMember(owner = "client!le", name = "S", descriptor = "I")
    public static int field5796;

    @OriginalMember(owner = "client!le", name = "U", descriptor = "I")
    public static int field5798;

    @OriginalMember(owner = "client!le", name = "w", descriptor = "Led;")
    private class115 field5775;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Z)I", line = 4)
    public final int method171(boolean arg0) {
        if (!arg0) {
            this.method170(55);
        }
        ++field5788;
        return this.field5782;
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Lqa;Lih;IIIIZIIZ)V", line = 16)
    public class403(class167 arg0, class158 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, boolean arg9) {
        super(arg3, arg4, arg5, class509.method3043(arg7, 3, arg8));
        super.field8514 = arg3;
        this.field5789 = (short) arg1.field2010;
        this.field5792 = ~arg1.field2028 != -1 && !arg6;
        this.field5777 = arg6;
        this.field5770 = (byte) arg2;
        super.field8515 = arg5;
        this.field5782 = (byte) arg7;
        this.field5797 = (byte) arg8;
        this.field5795 = arg9;
        this.field5794 = arg0.method1007() && arg1.field2078 && !this.field5777 && class94.field1158.method131(false, class239.field3499) != 0;
        int var11 = 2048;
        if (this.field5795) {
            var11 |= 65536;
        }
        class342 var12 = this.method2416(arg0, -15926, var11, this.field5794);
        if (var12 != null) {
            this.field5774 = var12.field4999;
            this.field5769 = var12.field5001;
            if (this.field5795) {
                this.field5774 = this.field5774.method369((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)Z", line = 50)
    public final boolean method162(int arg0) {
        ++field5780;
        if (arg0 != -177) {
            this.field5769 = null;
        }
        return this.field5794;
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(Z)Z", line = 62)
    public final boolean method167(boolean arg0) {
        ++field5793;
        if (!arg0) {
            this.method171(false);
        }
        return this.field5795;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIILlaa;Llaa;)V", line = 74)
    public static final void method2414(int arg0, int arg1, int arg2, class578 arg3, class578 arg4) {
        class415 var5 = class240.method1542(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field5987 = arg3;
            var5.field5978 = arg4;
        }
    }

    @OriginalMember(owner = "client!le", name = "e", descriptor = "(I)V", line = 84)
    public static void method2415(int arg0) {
        field5799 = null;
        if (arg0 == -11749) {
            field5784 = null;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Lqa;IIZ)Lrp;", line = 96)
    private final class342 method2416(class167 arg0, int arg1, int arg2, boolean arg3) {
        if (arg1 != -15926) {
            this.method160(126, (class167) null, -4, 91, false, (class198) null, 25);
        }
        ++field5776;
        class158 var5 = class312.field4690.method2004(false, this.field5789 & 65535);
        class543 var6;
        class543 var7;
        if (!this.field5777) {
            if (this.field5770 >= 3) {
                var6 = null;
            } else {
                var6 = class562.field8337[this.field5770 + 1];
            }
            var7 = class562.field8337[this.field5770];
        } else {
            var7 = class287.field4219[this.field5770];
            var6 = class562.field8337[0];
        }
        return var5.method918(super.field8522, super.field8514, var7, super.field8515, 0, this.field5782, arg3, arg2, this.field5797, var6, arg0);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIZ)Ljava/lang/String;", line = 127)
    public static final String method2417(int arg0, int arg1, int arg2, boolean arg3) {
        ++field5798;
        if (~arg2 <= -3 && arg2 <= 36) {
            if (arg1 != 11341) {
                field5799 = null;
            }
            if (arg3 && arg0 >= 0) {
                int var4 = 2;
                int var5 = arg0 / arg2;
                while (~var5 != -1) {
                    var5 /= arg2;
                    ++var4;
                }
                char[] var6 = new char[var4];
                var6[0] = '+';
                for (int var7 = var4 - 1; ~var7 < -1; --var7) {
                    int var8 = arg0;
                    arg0 /= arg2;
                    int var9 = -(arg0 * arg2) + var8;
                    if (~var9 > -11) {
                        var6[var7] = (char) (var9 + 48);
                    } else {
                        var6[var7] = (char) (var9 + 87);
                    }
                }
                return new String(var6);
            } else {
                return Integer.toString(arg0, arg2);
            }
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ILqa;IB)Z", line = 189)
    public final boolean method164(int arg0, class167 arg1, int arg2, byte arg3) {
        ++field5787;
        class520 var5 = this.method2418(arg1, 131072, 0);
        if (var5 != null) {
            class105 var6 = arg1.method1038();
            var6.method613(super.field8514, super.field8522, super.field8515);
            return var5.method1963(arg0, arg2, var6, false);
        } else {
            return arg3 != 77;
        }
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(I)I", line = 211)
    public final int method170(int arg0) {
        ++field5778;
        return arg0 != -5527 ? -8 : this.field5797;
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(I)I", line = 224)
    public final int method173(int arg0) {
        if (arg0 <= 30) {
            this.method160(23, (class167) null, 10, -7, true, (class198) null, -52);
        }
        ++field5796;
        return 65535 & this.field5789;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ILqa;IIZLse;I)V", line = 235)
    public final void method160(int arg0, class167 arg1, int arg2, int arg3, boolean arg4, class198 arg5, int arg6) {
        if (!(arg5 instanceof class403)) {
            if (arg5 instanceof class70) {
                class70 var8 = (class70) arg5;
                if (this.field5774 != null && var8.field810 != null) {
                    this.field5774.method1952(var8.field810, arg6, arg3, arg0, arg4);
                }
            }
        } else {
            class403 var9 = (class403) arg5;
            if (this.field5774 != null && var9.field5774 != null) {
                this.field5774.method1952(var9.field5774, arg6, arg3, arg0, arg4);
            }
        }
        if (arg2 == -4) {
            ++field5785;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Lqa;B)V", line = 265)
    public final void method158(class167 arg0, byte arg1) {
        ++field5786;
        Object var3 = null;
        class88 var5;
        if (this.field5769 == null && this.field5794) {
            class342 var4 = this.method2416(arg0, -15926, 262144, true);
            var5 = var4 == null ? null : var4.field5001;
        } else {
            var5 = this.field5769;
            this.field5769 = null;
        }
        if (arg1 >= -76) {
            field5799 = null;
        }
        if (var5 != null) {
            class253.method1607(var5, this.field5770, super.field8514, super.field8515, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(BLqa;)Led;", line = 293)
    public final class115 method157(byte arg0, class167 arg1) {
        if (this.field5775 == null) {
            this.field5775 = class411.method2443(-27621, super.field8522, super.field8514, super.field8515, this.method2418(arg1, 0, 0));
        }
        ++field5779;
        int var3 = -25 / ((14 - arg0) / 48);
        return this.field5775;
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(Lqa;B)V", line = 307)
    public final void method174(class167 arg0, byte arg1) {
        ++field5771;
        if (arg1 != 2) {
            this.method173(27);
        }
        Object var3 = null;
        class88 var5;
        if (this.field5769 == null && this.field5794) {
            class342 var4 = this.method2416(arg0, -15926, 262144, true);
            var5 = var4 == null ? null : var4.field5001;
        } else {
            var5 = this.field5769;
            this.field5769 = null;
        }
        if (var5 != null) {
            class639.method3698(var5, this.field5770, super.field8514, super.field8515, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Lqa;Z)V", line = 338)
    public final void method166(class167 arg0, boolean arg1) {
        if (!arg1) {
            this.method157((byte) -123, (class167) null);
        }
        ++field5781;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Lqa;II)Lr;", line = 351)
    private final class520 method2418(class167 arg0, int arg1, int arg2) {
        ++field5772;
        if (this.field5774 != null && arg0.method1026(this.field5774.method1950(), arg1) == 0) {
            return this.field5774;
        } else {
            class342 var4 = this.method2416(arg0, arg2 + -15926, arg1, false);
            if (arg2 != 0) {
                this.method167(false);
            }
            return var4 != null ? var4.field4999 : null;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V", line = 373)
    public final void method154(byte arg0) {
        if (arg0 == -74) {
            ++field5783;
            if (this.field5774 != null) {
                this.field5774.method1961();
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(B)V", line = 386)
    public final void method165(byte arg0) {
        if (arg0 != -33) {
            this.method164(124, (class167) null, 108, (byte) 22);
        }
        this.field5795 = false;
        ++field5791;
        if (this.field5774 != null) {
            this.field5774.method1973(-65537 & this.field5774.method1950());
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(BILqa;)Lr;", line = 400)
    public final class520 method161(byte arg0, int arg1, class167 arg2) {
        ++field5773;
        return arg0 != -127 ? null : this.method2418(arg2, arg1, 0);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ILqa;)Llb;", line = 411)
    public final class239 method169(int arg0, class167 arg1) {
        ++field5790;
        if (this.field5774 == null) {
            return null;
        } else if (arg0 != -911932384) {
            return null;
        } else {
            class105 var3 = arg1.method1038();
            var3.method613(super.field8514, super.field8522, super.field8515);
            class239 var4 = null;
            if (this.field5792) {
                var4 = class210.method1365(false, 1);
            }
            this.field5774.method1965(var3, var4 == null ? null : var4.field3503[0], 0);
            return var4;
        }
    }
}
