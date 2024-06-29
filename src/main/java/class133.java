import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class133 extends class402 implements class425 {

    @OriginalMember(owner = "client!vb", name = "P", descriptor = "Ljp;")
    public class239 field2240;

    @OriginalMember(owner = "client!vb", name = "M", descriptor = "Z")
    private boolean field2237;

    @OriginalMember(owner = "client!vb", name = "L", descriptor = "I")
    public static int field2236 = -1;

    @OriginalMember(owner = "client!vb", name = "u", descriptor = "I")
    public static int field2219;

    @OriginalMember(owner = "client!vb", name = "v", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!vb", name = "w", descriptor = "I")
    public static int field2221;

    @OriginalMember(owner = "client!vb", name = "x", descriptor = "I")
    public static int field2222;

    @OriginalMember(owner = "client!vb", name = "y", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!vb", name = "z", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!vb", name = "A", descriptor = "I")
    public static int field2225;

    @OriginalMember(owner = "client!vb", name = "B", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!vb", name = "C", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!vb", name = "D", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!vb", name = "E", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!vb", name = "F", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!vb", name = "G", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!vb", name = "H", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!vb", name = "I", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!vb", name = "J", descriptor = "I")
    public static int field2234;

    @OriginalMember(owner = "client!vb", name = "K", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!vb", name = "N", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!vb", name = "Q", descriptor = "I")
    public static int field2241;

    @OriginalMember(owner = "client!vb", name = "O", descriptor = "[Lo;")
    public static class24[] field2239;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)Z")
    public final boolean method19(byte arg0) {
        ++field2220;
        if (arg0 <= 121) {
            this.method229(109);
        }
        return false;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lza;I)V")
    public final void method233(class288 arg0, int arg1) {
        this.field2240.method1564((byte) -9, arg0);
        ++field2231;
        if (arg1 != 13367) {
            field2236 = -18;
        }
    }

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "(I)V")
    public final void method12(int arg0) {
        int var2 = -103 % ((-35 - arg0) / 44);
        ++field2232;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZLza;II)Z")
    public final boolean method14(boolean arg0, class288 arg1, int arg2, int arg3) {
        ++field2219;
        class374 var5 = this.field2240.method1559(super.field6073, super.field6078, 131072, -12, arg1, arg0, false);
        if (var5 == null) {
            return false;
        } else {
            class124 var6 = arg1.method364();
            var6.method835(super.field6073, super.field6083, super.field6078);
            return var5.method763(arg3, arg2, var6, false);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IB)V")
    public static final void method1016(int arg0, byte arg1) {
        if (arg1 == -103) {
            ++field2238;
            class505.method3030((byte) 58);
            int var2 = class161.field2593.method1400((byte) -44, arg0).field7764;
            if (~var2 != -1) {
                int var3 = class402.field6080.field258[arg0];
                if (var2 == 6) {
                    class483.field7124 = var3;
                }
                if (~var2 == -6) {
                    class47.field971 = var3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(I)I")
    public final int method231(int arg0) {
        if (arg0 <= 7) {
            return 122;
        } else {
            ++field2222;
            return this.field2240.field3687;
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)Z")
    public final boolean method228(int arg0) {
        ++field2226;
        return arg0 != 1396 ? true : this.field2240.method1563(1);
    }

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "(I)I")
    public final int method224(int arg0) {
        if (arg0 != -10848) {
            return 45;
        } else {
            ++field2241;
            return this.field2240.field3692;
        }
    }

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "(I)I")
    public final int method8(int arg0) {
        ++field2224;
        if (arg0 != 0) {
            field2239 = null;
        }
        return this.field2240.method1568((byte) -50);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILza;I)Le;")
    public final class374 method234(int arg0, class288 arg1, int arg2) {
        ++field2233;
        if (arg0 < 99) {
            field2228 = -39;
        }
        return this.field2240.method1559(0, 0, arg2, -12, arg1, false, false);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
    public final void method229(int arg0) {
        if (arg0 != -4715) {
            this.method232((class288) null, false);
        }
        ++field2225;
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(Lza;I)Lnd;")
    public final class385 method15(class288 arg0, int arg1) {
        ++field2227;
        class374 var3 = this.field2240.method1559(super.field6073, super.field6078, 2048, -12, arg0, true, false);
        if (var3 == null) {
            return null;
        } else {
            class124 var4 = arg0.method364();
            if (arg1 != 2) {
                return null;
            } else {
                var4.method835(super.field6073, super.field6083, super.field6078);
                class385 var5 = null;
                if (this.field2237) {
                    var5 = class497.method3001(1, false);
                }
                if (this.field2240.field3707 == null) {
                    var3.method723(var4, var5 != null ? var5.field5620[0] : null, 0);
                } else {
                    class502 var6 = this.field2240.field3707.method490();
                    arg0.method298(var3, var6, var4, var5 == null ? null : var5.field5620[0], 0);
                }
                this.field2240.method1562(super.field6082, 1, super.field6077, super.field6081, super.field6075, var3, true, arg0);
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(BLza;)V")
    public final void method9(byte arg0, class288 arg1) {
        ++field2235;
        class374 var3 = this.field2240.method1559(super.field6073, super.field6078, 262144, -12, arg1, true, true);
        if (arg0 > -98) {
            field2239 = null;
        }
        if (var3 != null) {
            this.field2240.method1562(super.field6082, 1, super.field6077, super.field6081, super.field6075, var3, false, arg1);
        }
    }

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "(I)V")
    public static final void method1017(int arg0) {
        for (class504 var1 = (class504) class243.field3768.method532((byte) -100); var1 != null; var1 = (class504) class243.field3768.method532((byte) -100)) {
            class308.method1972(var1, true);
        }
        ++field2229;
        int var2;
        int var3;
        if (class186.field2990.method1783(-1, field2236)) {
            var2 = 0;
            var3 = 3;
        } else {
            var3 = class419.field6303;
            var2 = class419.field6303;
        }
        client.method1373();
        for (int var4 = var2; var3 >= var4; ++var4) {
            client.method1352();
            client.method1367(var4);
            client.method1353(var4);
        }
        client.method1359();
        client.method1369();
        if (arg0 >= -115) {
            method1016(99, (byte) -114);
        }
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Lza;Ljc;IIIIIZIIIIIII)V")
    public class133(class288 arg0, class306 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field4602 == 1, class344.method2163(15565, arg12, arg13));
        this.field2240 = new class239(arg0, arg1, arg12, arg13, super.field6084, arg3, arg4, arg6, arg7, arg14);
        this.field2237 = ~arg1.field4587 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "(I)V")
    public static void method1018(int arg0) {
        field2239 = null;
        if (arg0 != -1) {
            method1019((class459) null, (class16) null, -3);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lza;Z)V")
    public final void method232(class288 arg0, boolean arg1) {
        if (!arg1) {
            field2236 = -95;
        }
        this.field2240.method1571(arg0, 126);
        ++field2234;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Z)I")
    public final int method225(boolean arg0) {
        ++field2223;
        if (arg0) {
            this.method232((class288) null, true);
        }
        return this.field2240.field3711;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IBILvs;Lza;ZI)V")
    public final void method18(int arg0, byte arg1, int arg2, class421 arg3, class288 arg4, boolean arg5, int arg6) {
        if (arg1 == 93) {
            ++field2221;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lph;Ll;I)V")
    public static final void method1019(class459 arg0, class16 arg1, int arg2) {
        ++field2230;
        if (arg2 == -22018) {
            class514.field7467 = arg1;
            class196.field3149 = arg0;
        }
    }
}
