import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class9 extends class172 implements class339 {

    @OriginalMember(owner = "client!lq", name = "jb", descriptor = "Z")
    private boolean field188 = false;

    @OriginalMember(owner = "client!lq", name = "X", descriptor = "Lrea;")
    public class567 field176;

    @OriginalMember(owner = "client!lq", name = "Z", descriptor = "Z")
    private boolean field178;

    @OriginalMember(owner = "client!lq", name = "L", descriptor = "Z")
    public static boolean field164 = false;

    @OriginalMember(owner = "client!lq", name = "hb", descriptor = "Z")
    public static boolean field186 = false;

    @OriginalMember(owner = "client!lq", name = "K", descriptor = "I")
    public static int field163;

    @OriginalMember(owner = "client!lq", name = "N", descriptor = "I")
    public static int field166;

    @OriginalMember(owner = "client!lq", name = "O", descriptor = "I")
    public static int field167;

    @OriginalMember(owner = "client!lq", name = "P", descriptor = "I")
    public static int field168;

    @OriginalMember(owner = "client!lq", name = "Q", descriptor = "I")
    public static int field169;

    @OriginalMember(owner = "client!lq", name = "R", descriptor = "I")
    public static int field170;

    @OriginalMember(owner = "client!lq", name = "S", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!lq", name = "T", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "client!lq", name = "U", descriptor = "I")
    public static int field173;

    @OriginalMember(owner = "client!lq", name = "V", descriptor = "I")
    public static int field174;

    @OriginalMember(owner = "client!lq", name = "W", descriptor = "I")
    public static int field175;

    @OriginalMember(owner = "client!lq", name = "Y", descriptor = "I")
    public static int field177;

    @OriginalMember(owner = "client!lq", name = "ab", descriptor = "I")
    public static int field179;

    @OriginalMember(owner = "client!lq", name = "bb", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!lq", name = "cb", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!lq", name = "db", descriptor = "I")
    public static int field182;

    @OriginalMember(owner = "client!lq", name = "eb", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!lq", name = "fb", descriptor = "I")
    public static int field184;

    @OriginalMember(owner = "client!lq", name = "gb", descriptor = "I")
    public static int field185;

    @OriginalMember(owner = "client!lq", name = "ib", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!lq", name = "M", descriptor = "Lsd;")
    private class362 field165;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)Z", line = 5)
    public final boolean method64(int arg0) {
        if (arg0 != 3755) {
            return false;
        } else {
            ++field167;
            return this.field176.method3126(0);
        }
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(B)I", line = 16)
    public final int method65(byte arg0) {
        if (arg0 < 126) {
            this.method64(-94);
        }
        ++field172;
        return this.field176.field7927;
    }

    @OriginalMember(owner = "client!lq", name = "d", descriptor = "(I)V", line = 31)
    public final void method66(int arg0) {
        if (arg0 == -1) {
            ++field184;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(ZLr;)V", line = 45)
    public final void method67(boolean arg0, class566 arg1) {
        if (arg0) {
            this.field178 = true;
        }
        ++field177;
        class474 var3 = this.field176.method3130(true, super.field6461, arg1, true, true, super.field6464, 262144);
        if (var3 != null) {
            class491 var4 = arg1.method995();
            var4.method914(super.field6461, super.field6458, super.field6464);
            this.field176.method3129(var3, super.field2247, arg1, super.field2244, false, super.field2254, super.field2243, 24, var4);
        }
    }

    @OriginalMember(owner = "client!lq", name = "g", descriptor = "(B)Z", line = 66)
    public final boolean method68(byte arg0) {
        ++field175;
        if (arg0 <= 114) {
            this.method77(true, 18, (byte) 120, (class566) null, (class488) null, 124, 76);
        }
        return false;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(I[IILqi;)V", line = 78)
    public static final void method69(int arg0, int[] arg1, int arg2, class514 arg3) {
        ++field173;
        if (arg3.field9691 != null) {
            boolean var4 = true;
            for (int var5 = 0; ~arg3.field9691.length < ~var5; ++var5) {
                if (~arg3.field9691[var5] != ~arg1[var5]) {
                    var4 = false;
                    break;
                }
            }
            if (var4 && ~arg3.field9689 != 0) {
                class395 var6 = class583.field8149.method1844(64, arg3.field9689);
                int var7 = var6.field4970;
                if (~var7 == -2) {
                    arg3.field9698 = 0;
                    arg3.field9731 = arg0;
                    arg3.field9725 = 0;
                    arg3.field9741 = 0;
                    arg3.field9661 = 1;
                    class192.method1159(arg3.field6470, var6, arg3.field6461, arg3.field6464, 114, arg3.field9741, class376.field4748 == arg3);
                }
                if (var7 == 2) {
                    arg3.field9698 = 0;
                }
            }
        }
        boolean var8 = true;
        if (arg2 > -81) {
            method76((byte) -70);
        }
        for (int var9 = 0; ~arg1.length < ~var9; ++var9) {
            if (~arg1[var9] != 0) {
                var8 = false;
            }
            if (arg3.field9691 == null || ~arg3.field9691[var9] == 0 || class583.field8149.method1844(64, arg1[var9]).field4983 >= class583.field8149.method1844(64, arg3.field9691[var9]).field4983) {
                arg3.field9691 = arg1;
                arg3.field9731 = arg0;
                break;
            }
        }
        if (var8) {
            arg3.field9731 = arg0;
            arg3.field9691 = arg1;
        }
    }

    @OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(Lr;Lbda;IIIIIZIIIIIII)V", line = 163)
    public class9(class566 arg0, class441 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, ~arg1.field5507 == -2, class674.method3785((byte) -74, arg13, arg12));
        this.field176 = new class567(arg0, arg1, arg12, arg13, super.field6470, arg3, arg4, arg6, arg7, arg14);
        this.field178 = ~arg1.field5560 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(BLr;)V", line = 172)
    public final void method70(byte arg0, class566 arg1) {
        ++field169;
        int var3 = 14 / ((arg0 - -19) / 34);
        this.field176.method3120((byte) 99, arg1);
    }

    @OriginalMember(owner = "client!lq", name = "g", descriptor = "(I)I", line = 184)
    public final int method71(int arg0) {
        ++field180;
        int var2 = 84 % ((-43 - arg0) / 59);
        return this.field176.method3131((byte) -99);
    }

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "(I)I", line = 194)
    public final int method72(int arg0) {
        ++field174;
        return arg0 != -22496 ? 115 : this.field176.method3128(28110);
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(ZLr;)Log;", line = 205)
    public final class101 method73(boolean arg0, class566 arg1) {
        ++field171;
        class474 var3 = this.field176.method3130(true, super.field6461, arg1, true, arg0, super.field6464, 2048);
        if (var3 == null) {
            return null;
        } else {
            class491 var4 = arg1.method995();
            var4.method914(super.field6461, super.field6458, super.field6464);
            class101 var5 = null;
            if (this.field178) {
                var5 = class676.method3794(true, 1);
            }
            this.field176.method3129(var3, super.field2247, arg1, super.field2244, true, super.field2254, super.field2243, 25, var4);
            if (!class36.field498) {
                var3.method717(var4, var5 == null ? null : var5.field1361[0], 0);
            } else {
                var3.method751(var4, var5 != null ? var5.field1361[0] : null, class432.field5406, 0);
            }
            if (this.field176.field7939 != null) {
                class27 var6 = this.field176.field7939.method545();
                if (!class36.field498) {
                    arg1.method993(var6);
                } else {
                    arg1.method999(var6, class432.field5406);
                }
            }
            this.field188 = var3.method740() || this.field176.field7939 != null;
            if (this.field165 == null) {
                this.field165 = class286.method1606(-24294, super.field6458, var3, super.field6464, super.field6461);
            } else {
                class227.method1360(var3, super.field6461, this.field165, super.field6458, super.field6464, 26219);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(B)I", line = 256)
    public final int method74(byte arg0) {
        ++field185;
        return arg0 != 42 ? -57 : this.field176.field7925;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(IILr;I)Z", line = 271)
    public final boolean method75(int arg0, int arg1, class566 arg2, int arg3) {
        ++field181;
        class474 var5 = this.field176.method3130(true, super.field6461, arg2, false, false, super.field6464, 131072);
        if (var5 == null) {
            return false;
        } else {
            class491 var6 = arg2.method995();
            if (arg3 != 9678) {
                return false;
            } else {
                var6.method914(super.field6461, super.field6458, super.field6464);
                return class36.field498 ? var5.method738(arg0, arg1, var6, false, class432.field5406) : var5.method744(arg0, arg1, var6, false);
            }
        }
    }

    @OriginalMember(owner = "client!lq", name = "i", descriptor = "(B)V", line = 296)
    public static final void method76(byte arg0) {
        int var1 = -60 % ((arg0 - -24) / 32);
        if (class57.field812 != null) {
            class134[] var2 = class57.field812;
            for (int var3 = 0; ~var3 > ~var2.length; ++var3) {
                class134 var4 = var2[var3];
                var4.method776(127);
            }
        }
        ++field170;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(ZIBLr;Llo;II)V", line = 319)
    public final void method77(boolean arg0, int arg1, byte arg2, class566 arg3, class488 arg4, int arg5, int arg6) {
        ++field183;
        int var8 = -47 % ((-50 - arg2) / 55);
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "(B)I", line = 331)
    public final int method78(byte arg0) {
        ++field168;
        int var2 = -17 % ((arg0 - 12) / 48);
        return this.field176.field7940;
    }

    @OriginalMember(owner = "client!lq", name = "h", descriptor = "(B)Z", line = 344)
    public final boolean method79(byte arg0) {
        ++field179;
        if (arg0 >= -26) {
            field164 = false;
        }
        return false;
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(BLr;)V", line = 355)
    public final void method80(byte arg0, class566 arg1) {
        if (arg0 == -114) {
            this.field176.method3123(2, arg1);
            ++field182;
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Z)V", line = 367)
    public final void method81(boolean arg0) {
        if (arg0) {
            this.method72(-17);
        }
        ++field163;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lr;I)Lsd;", line = 377)
    public final class362 method82(class566 arg0, int arg1) {
        ++field187;
        if (arg1 != -1660704056) {
            method76((byte) -21);
        }
        return this.field165;
    }

    @OriginalMember(owner = "client!lq", name = "e", descriptor = "(B)Z", line = 395)
    public final boolean method83(byte arg0) {
        ++field166;
        return arg0 != 23 ? true : this.field188;
    }
}
