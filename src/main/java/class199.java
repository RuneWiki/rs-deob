import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class199 extends class311 implements class425 {

    @OriginalMember(owner = "client!nb", name = "z", descriptor = "Ljp;")
    public class239 field3227;

    @OriginalMember(owner = "client!nb", name = "A", descriptor = "Z")
    private boolean field3228;

    @OriginalMember(owner = "client!nb", name = "G", descriptor = "I")
    public static int field3234 = 0;

    @OriginalMember(owner = "client!nb", name = "t", descriptor = "Lwm;")
    public static class399 field3221 = new class399(64);

    @OriginalMember(owner = "client!nb", name = "O", descriptor = "Lwm;")
    public static class399 field3241 = new class399(10);

    @OriginalMember(owner = "client!nb", name = "P", descriptor = "Lwd;")
    public static class181 field3242 = new class181(8);

    @OriginalMember(owner = "client!nb", name = "U", descriptor = "I")
    public static int field3247 = 1400;

    @OriginalMember(owner = "client!nb", name = "u", descriptor = "I")
    public static int field3222;

    @OriginalMember(owner = "client!nb", name = "v", descriptor = "I")
    public static int field3223;

    @OriginalMember(owner = "client!nb", name = "w", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "client!nb", name = "x", descriptor = "I")
    public static int field3225;

    @OriginalMember(owner = "client!nb", name = "y", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!nb", name = "B", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!nb", name = "C", descriptor = "I")
    public static int field3230;

    @OriginalMember(owner = "client!nb", name = "D", descriptor = "I")
    public static int field3231;

    @OriginalMember(owner = "client!nb", name = "E", descriptor = "I")
    public static int field3232;

    @OriginalMember(owner = "client!nb", name = "F", descriptor = "I")
    public static int field3233;

    @OriginalMember(owner = "client!nb", name = "H", descriptor = "I")
    public static int field3235;

    @OriginalMember(owner = "client!nb", name = "I", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!nb", name = "J", descriptor = "I")
    public static int field3237;

    @OriginalMember(owner = "client!nb", name = "K", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!nb", name = "M", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!nb", name = "N", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!nb", name = "S", descriptor = "I")
    public static int field3245;

    @OriginalMember(owner = "client!nb", name = "V", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!nb", name = "R", descriptor = "Lbc;")
    public static class248 field3244;

    @OriginalMember(owner = "client!nb", name = "Q", descriptor = "Lph;")
    public static class459 field3243;

    @OriginalMember(owner = "client!nb", name = "T", descriptor = "Lph;")
    public static class459 field3246;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(B)V", line = 5)
    public static void method1381(byte arg0) {
        field3246 = null;
        field3221 = null;
        field3241 = null;
        field3242 = null;
        if (arg0 != 80) {
            field3246 = null;
        }
        field3243 = null;
        field3244 = null;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZLza;II)Z", line = 25)
    public final boolean method14(boolean arg0, class288 arg1, int arg2, int arg3) {
        ++field3240;
        class374 var5 = this.field3227.method1559(super.field4710, super.field4706, 131072, -12, arg1, arg0, false);
        if (var5 == null) {
            return false;
        } else {
            class124 var6 = arg1.method364();
            var6.method835(super.field4710, super.field4703, super.field4706);
            return var5.method763(arg3, arg2, var6, false);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V", line = 42)
    public final void method229(int arg0) {
        if (arg0 == -4715) {
            ++field3225;
        }
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)Z", line = 56)
    public final boolean method228(int arg0) {
        if (arg0 != 1396) {
            return false;
        } else {
            ++field3239;
            return this.field3227.method1563(1);
        }
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Lza;Ljc;IIIIIZII)V", line = 68)
    public class199(class288 arg0, class306 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        super(arg4, arg5, arg6, arg1.field4624, arg1.field4591, arg1.field4633);
        this.field3227 = new class239(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
        this.field3228 = ~arg1.field4587 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILpb;II)V", line = 78)
    public static final void method1382(int arg0, class469 arg1, int arg2, int arg3) {
        if (arg0 == -1385037081) {
            class360.field5288[arg2][arg3] = arg1;
            ++field3233;
        }
    }

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "(I)V", line = 89)
    public final void method12(int arg0) {
        ++field3229;
        int var2 = -89 % ((arg0 - -35) / 44);
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(BLza;)V", line = 99)
    public final void method9(byte arg0, class288 arg1) {
        if (arg0 >= -98) {
            field3244 = null;
        }
        ++field3223;
        class374 var3 = this.field3227.method1559(super.field4710, super.field4706, 262144, -12, arg1, true, true);
        if (var3 != null) {
            int var4 = super.field4710 >> 7;
            int var5 = super.field4706 >> 7;
            this.field3227.method1562(var4, 1, var5, var4, var5, var3, false, arg1);
        }
    }

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "(I)I", line = 124)
    public final int method224(int arg0) {
        if (arg0 != -10848) {
            this.method19((byte) -81);
        }
        ++field3230;
        return this.field3227.field3692;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Z)I", line = 136)
    public final int method225(boolean arg0) {
        if (arg0) {
            this.method232((class288) null, false);
        }
        ++field3226;
        return this.field3227.field3711;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILza;I)Le;", line = 148)
    public final class374 method234(int arg0, class288 arg1, int arg2) {
        ++field3232;
        return arg0 <= 99 ? null : this.field3227.method1559(0, 0, arg2, -12, arg1, false, false);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IBILvs;Lza;ZI)V", line = 163)
    public final void method18(int arg0, byte arg1, int arg2, class421 arg3, class288 arg4, boolean arg5, int arg6) {
        if (arg1 == 93) {
            ++field3238;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(Lza;I)Lnd;", line = 176)
    public final class385 method15(class288 arg0, int arg1) {
        ++field3237;
        class374 var3 = this.field3227.method1559(super.field4710, super.field4706, 2048, arg1 + -14, arg0, true, false);
        if (var3 == null) {
            return null;
        } else {
            class124 var4 = arg0.method364();
            var4.method835(super.field4710, super.field4703, super.field4706);
            class385 var5 = null;
            if (this.field3228) {
                var5 = class497.method3001(1, false);
            }
            if (arg1 != 2) {
                this.method18(111, (byte) -74, 80, (class421) null, (class288) null, false, 101);
            }
            if (this.field3227.field3707 == null) {
                var3.method723(var4, var5 == null ? null : var5.field5620[0], 0);
            } else {
                class502 var6 = this.field3227.field3707.method490();
                arg0.method298(var3, var6, var4, var5 != null ? var5.field5620[0] : null, 0);
            }
            int var7 = super.field4710 >> 7;
            int var8 = super.field4706 >> 7;
            this.field3227.method1562(var7, 1, var8, var7, var8, var3, true, arg0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lza;Z)V", line = 217)
    public final void method232(class288 arg0, boolean arg1) {
        ++field3236;
        if (!arg1) {
            field3241 = null;
        }
        this.field3227.method1571(arg0, -94);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)Z", line = 228)
    public final boolean method19(byte arg0) {
        ++field3224;
        return arg0 < 121;
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(I)I", line = 244)
    public final int method231(int arg0) {
        if (arg0 <= 7) {
            return 115;
        } else {
            ++field3235;
            return this.field3227.field3687;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lza;I)V", line = 255)
    public final void method233(class288 arg0, int arg1) {
        ++field3248;
        if (arg1 != 13367) {
            this.method18(28, (byte) -95, -23, (class421) null, (class288) null, false, 52);
        }
        this.field3227.method1564((byte) 92, arg0);
    }
}
