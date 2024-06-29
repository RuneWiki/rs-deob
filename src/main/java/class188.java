import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public class class188 extends class33 implements class438 {

    @OriginalMember(owner = "client!hv", name = "H", descriptor = "Lba;")
    public class606 field2876;

    @OriginalMember(owner = "client!hv", name = "n", descriptor = "Z")
    private boolean field2857;

    @OriginalMember(owner = "client!hv", name = "o", descriptor = "[I")
    public static int[] field2858 = new int[5];

    @OriginalMember(owner = "client!hv", name = "l", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!hv", name = "m", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!hv", name = "p", descriptor = "I")
    public static int field2859;

    @OriginalMember(owner = "client!hv", name = "q", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!hv", name = "r", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!hv", name = "s", descriptor = "I")
    public static int field2862;

    @OriginalMember(owner = "client!hv", name = "t", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!hv", name = "u", descriptor = "I")
    public static int field2864;

    @OriginalMember(owner = "client!hv", name = "v", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!hv", name = "w", descriptor = "I")
    public static int field2866;

    @OriginalMember(owner = "client!hv", name = "x", descriptor = "I")
    public static int field2867;

    @OriginalMember(owner = "client!hv", name = "y", descriptor = "I")
    public static int field2868;

    @OriginalMember(owner = "client!hv", name = "A", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!hv", name = "B", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!hv", name = "D", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!hv", name = "E", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!hv", name = "F", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!hv", name = "G", descriptor = "I")
    public static int field2875;

    @OriginalMember(owner = "client!hv", name = "z", descriptor = "Led;")
    private class115 field2869;

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(ILqa;IIZLse;I)V", line = 3)
    public final void method160(int arg0, class167 arg1, int arg2, int arg3, boolean arg4, class198 arg5, int arg6) {
        if (arg2 != -4) {
            this.field2876 = null;
        }
        ++field2875;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "(Z)Z", line = 14)
    public final boolean method167(boolean arg0) {
        ++field2856;
        return !arg0 ? false : false;
    }

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "(B)V", line = 26)
    public final void method165(byte arg0) {
        ++field2861;
        if (arg0 == -33) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(BILqa;)Lr;", line = 38)
    public final class520 method161(byte arg0, int arg1, class167 arg2) {
        if (arg0 != -127) {
            return null;
        } else {
            ++field2866;
            return this.field2876.method3529(arg1, (byte) -93, arg2, 0, false, false, 0);
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(BLqa;)Led;", line = 50)
    public final class115 method157(byte arg0, class167 arg1) {
        ++field2855;
        int var3 = 113 / ((14 - arg0) / 48);
        return this.field2869;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(ILqa;)Llb;", line = 66)
    public final class239 method169(int arg0, class167 arg1) {
        ++field2874;
        class520 var3 = this.field2876.method3529(2048, (byte) -93, arg1, super.field362, false, true, super.field366);
        if (var3 == null) {
            return null;
        } else {
            class105 var4 = arg1.method1038();
            var4.method613(super.field362, super.field363, super.field366);
            class239 var5 = null;
            if (this.field2857) {
                var5 = class210.method1365(false, 1);
            }
            if (this.field2876.field8931 != null) {
                class510 var6 = this.field2876.field8931.method550();
                arg1.method1005(var3, var6, var4, var5 != null ? var5.field3503[0] : null, 0);
            } else {
                var3.method1965(var4, var5 == null ? null : var5.field3503[0], 0);
            }
            if (this.field2869 != null) {
                class278.method1754((byte) 53, this.field2869, super.field366, super.field362, var3, super.field363);
            } else {
                this.field2869 = class411.method2443(-27621, super.field363, super.field362, super.field366, var3);
            }
            int var7 = super.field362 >> 7;
            int var8 = super.field366 >> 7;
            if (arg0 != -911932384) {
                this.method154((byte) -91);
            }
            this.field2876.method3523(var3, arg1, var8, (byte) 124, var7, var8, var7, true);
            return var5;
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(I)Z", line = 111)
    public final boolean method162(int arg0) {
        if (arg0 != -177) {
            return true;
        } else {
            ++field2873;
            return this.field2876.method3527(15765);
        }
    }

    @OriginalMember(owner = "client!hv", name = "c", descriptor = "(I)I", line = 122)
    public final int method173(int arg0) {
        ++field2860;
        if (arg0 < 30) {
            this.field2869 = null;
        }
        return this.field2876.field8936;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(I[S)[S", line = 138)
    public static final short[] method1228(int arg0, short[] arg1) {
        ++field2863;
        if (arg1 == null) {
            return null;
        } else {
            short[] var2 = new short[arg1.length];
            class473.method2879(arg1, 0, var2, arg0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "(I)I", line = 153)
    public final int method170(int arg0) {
        if (arg0 != -5527) {
            return -90;
        } else {
            ++field2870;
            return this.field2876.field8921;
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(Lqa;B)V", line = 166)
    public final void method158(class167 arg0, byte arg1) {
        ++field2867;
        if (arg1 < -76) {
            this.field2876.method3526(arg0, 262144);
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(Z)I", line = 177)
    public final int method171(boolean arg0) {
        if (!arg0) {
            return 53;
        } else {
            ++field2862;
            return this.field2876.field8919;
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(Lqa;Z)V", line = 188)
    public final void method166(class167 arg0, boolean arg1) {
        ++field2859;
        class520 var3 = this.field2876.method3529(262144, (byte) -93, arg0, super.field362, true, arg1, super.field366);
        if (var3 != null) {
            int var4 = super.field362 >> 7;
            int var5 = super.field366 >> 7;
            this.field2876.method3523(var3, arg0, var5, (byte) 124, var4, var5, var4, false);
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(B)V", line = 207)
    public final void method154(byte arg0) {
        if (arg0 != -74) {
            field2871 = -68;
        }
        ++field2868;
    }

    @OriginalMember(owner = "client!hv", name = "e", descriptor = "(B)Z", line = 219)
    public static final boolean method1229(byte arg0) {
        ++field2872;
        if (arg0 > -56) {
            method1230(-44);
        }
        return class110.field1406 != 0 ? true : class240.field3505.method2547(101);
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(ILqa;IB)Z", line = 233)
    public final boolean method164(int arg0, class167 arg1, int arg2, byte arg3) {
        ++field2865;
        if (arg3 != 77) {
            return true;
        } else {
            class520 var5 = this.field2876.method3529(131072, (byte) -93, arg1, super.field362, false, false, super.field366);
            if (var5 == null) {
                return false;
            } else {
                class105 var6 = arg1.method1038();
                var6.method613(super.field362, super.field363, super.field366);
                return var5.method1963(arg0, arg2, var6, false);
            }
        }
    }

    @OriginalMember(owner = "client!hv", name = "<init>", descriptor = "(Lqa;Lih;IIIIIZII)V", line = 254)
    public class188(class167 arg0, class158 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        super(arg4, arg5, arg6, arg1.field2011, arg1.field2074, arg1.field2062);
        this.field2876 = new class606(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
        this.field2857 = ~arg1.field2028 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!hv", name = "e", descriptor = "(I)V", line = 264)
    public static void method1230(int arg0) {
        if (arg0 == 262144) {
            field2858 = null;
        }
    }

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "(Lqa;B)V", line = 278)
    public final void method174(class167 arg0, byte arg1) {
        this.field2876.method3533(arg0, -1);
        ++field2864;
        if (arg1 != 2) {
            this.field2869 = null;
        }
    }
}
