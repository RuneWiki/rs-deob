import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class71 extends class578 implements class438 {

    @OriginalMember(owner = "client!pq", name = "q", descriptor = "Lba;")
    public class606 field823;

    @OriginalMember(owner = "client!pq", name = "I", descriptor = "Z")
    private boolean field839;

    @OriginalMember(owner = "client!pq", name = "L", descriptor = "[S")
    public static short[] field842 = new short[256];

    @OriginalMember(owner = "client!pq", name = "r", descriptor = "I")
    public static int field824;

    @OriginalMember(owner = "client!pq", name = "s", descriptor = "I")
    public static int field825;

    @OriginalMember(owner = "client!pq", name = "t", descriptor = "I")
    public static int field826;

    @OriginalMember(owner = "client!pq", name = "u", descriptor = "I")
    public static int field827;

    @OriginalMember(owner = "client!pq", name = "v", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!pq", name = "w", descriptor = "I")
    public static int field829;

    @OriginalMember(owner = "client!pq", name = "y", descriptor = "I")
    public static int field831;

    @OriginalMember(owner = "client!pq", name = "z", descriptor = "I")
    public static int field832;

    @OriginalMember(owner = "client!pq", name = "C", descriptor = "I")
    public static int field834;

    @OriginalMember(owner = "client!pq", name = "D", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!pq", name = "F", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!pq", name = "G", descriptor = "I")
    public static int field837;

    @OriginalMember(owner = "client!pq", name = "H", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!pq", name = "J", descriptor = "I")
    public static int field840;

    @OriginalMember(owner = "client!pq", name = "K", descriptor = "I")
    public static int field841;

    @OriginalMember(owner = "client!pq", name = "x", descriptor = "Led;")
    private class115 field830;

    @OriginalMember(owner = "client!pq", name = "A", descriptor = "Lbj;")
    public static class440 field833;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(BILqa;)Lr;")
    public final class520 method161(byte arg0, int arg1, class167 arg2) {
        if (arg0 != -127) {
            this.method161((byte) 114, -71, (class167) null);
        }
        ++field827;
        return this.field823.method3529(arg1, (byte) -93, arg2, 0, false, false, 0);
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(ILqa;IB)Z")
    public final boolean method164(int arg0, class167 arg1, int arg2, byte arg3) {
        ++field826;
        class520 var5 = this.field823.method3529(131072, (byte) -93, arg1, super.field8514, false, false, super.field8515);
        if (var5 == null) {
            return false;
        } else {
            if (arg3 != 77) {
                this.field839 = false;
            }
            class105 var6 = arg1.method1038();
            var6.method613(super.field8514, super.field8522, super.field8515);
            return var5.method1963(arg0, arg2, var6, false);
        }
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(B)V")
    public final void method165(byte arg0) {
        ++field829;
        if (arg0 != -33) {
            this.method165((byte) -59);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(B)V")
    public final void method154(byte arg0) {
        ++field836;
        if (arg0 != -74) {
            this.field839 = false;
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lqa;Z)V")
    public final void method166(class167 arg0, boolean arg1) {
        ++field841;
        class520 var3 = this.field823.method3529(262144, (byte) -93, arg0, super.field8514, arg1, true, super.field8515);
        if (var3 != null) {
            int var4 = super.field8514 >> 7;
            int var5 = super.field8515 >> 7;
            this.field823.method3523(var3, arg0, var5, (byte) 124, var4, var5, var4, false);
        }
    }

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "(Z)V")
    public static void method426(boolean arg0) {
        field842 = null;
        if (!arg0) {
            method426(false);
        }
        field833 = null;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(ILqa;IIZLse;I)V")
    public final void method160(int arg0, class167 arg1, int arg2, int arg3, boolean arg4, class198 arg5, int arg6) {
        if (arg2 != -4) {
            field842 = null;
        }
        ++field828;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(ILqa;)Llb;")
    public final class239 method169(int arg0, class167 arg1) {
        ++field834;
        class520 var3 = this.field823.method3529(2048, (byte) -93, arg1, super.field8514, false, true, super.field8515);
        if (var3 == null) {
            return null;
        } else {
            class105 var4 = arg1.method1038();
            var4.method613(super.field8514, super.field8522, super.field8515);
            class239 var5 = null;
            if (this.field839) {
                var5 = class210.method1365(false, 1);
            }
            if (arg0 != -911932384) {
                this.method167(false);
            }
            if (this.field823.field8931 != null) {
                class510 var6 = this.field823.field8931.method550();
                arg1.method1005(var3, var6, var4, var5 == null ? null : var5.field3503[0], 0);
            } else {
                var3.method1965(var4, var5 == null ? null : var5.field3503[0], 0);
            }
            if (this.field830 != null) {
                class278.method1754((byte) 53, this.field830, super.field8515, super.field8514, var3, super.field8522);
            } else {
                this.field830 = class411.method2443(-27621, super.field8522, super.field8514, super.field8515, var3);
            }
            int var7 = super.field8514 >> 7;
            int var8 = super.field8515 >> 7;
            this.field823.method3523(var3, arg1, var8, (byte) 124, var7, var8, var7, true);
            return var5;
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(BLqa;)Led;")
    public final class115 method157(byte arg0, class167 arg1) {
        int var3 = 117 % ((arg0 - 14) / 48);
        ++field838;
        return this.field830;
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(I)I")
    public final int method170(int arg0) {
        if (arg0 != -5527) {
            this.method173(93);
        }
        ++field824;
        return this.field823.field8921;
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(Z)Z")
    public final boolean method167(boolean arg0) {
        if (!arg0) {
            return false;
        } else {
            ++field840;
            return false;
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Z)I")
    public final int method171(boolean arg0) {
        if (!arg0) {
            return 8;
        } else {
            ++field825;
            return this.field823.field8919;
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(I)Z")
    public final boolean method162(int arg0) {
        if (arg0 != -177) {
            this.method161((byte) -117, -116, (class167) null);
        }
        ++field835;
        return this.field823.method3527(15765);
    }

    @OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(Lqa;Lih;IIIIIZIII)V")
    public class71(class167 arg0, class158 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        super(arg4, arg5, arg6, class1.method2(arg8, arg9, false));
        this.field823 = new class606(arg0, arg1, arg8, arg9, arg2, arg3, super.field8514, super.field8515, arg7, arg10);
        this.field839 = arg1.field2028 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(Lqa;B)V")
    public final void method174(class167 arg0, byte arg1) {
        ++field831;
        if (arg1 != 2) {
            this.field839 = true;
        }
        this.field823.method3533(arg0, arg1 + -3);
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lqa;B)V")
    public final void method158(class167 arg0, byte arg1) {
        if (arg1 > -76) {
            this.method166((class167) null, false);
        }
        this.field823.method3526(arg0, 262144);
        ++field832;
    }

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "(I)I")
    public final int method173(int arg0) {
        ++field837;
        if (arg0 <= 30) {
            this.method167(false);
        }
        return this.field823.field8936;
    }
}
