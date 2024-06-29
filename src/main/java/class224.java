import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class224 extends class120 implements class143 {

    @OriginalMember(owner = "client!wj", name = "R", descriptor = "Lwg;")
    public class245 field3365;

    @OriginalMember(owner = "client!wj", name = "y", descriptor = "Z")
    private boolean field3346;

    @OriginalMember(owner = "client!wj", name = "z", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!wj", name = "A", descriptor = "I")
    public static int field3348;

    @OriginalMember(owner = "client!wj", name = "B", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!wj", name = "C", descriptor = "I")
    public static int field3350;

    @OriginalMember(owner = "client!wj", name = "D", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!wj", name = "E", descriptor = "I")
    public static int field3352;

    @OriginalMember(owner = "client!wj", name = "F", descriptor = "I")
    public static int field3353;

    @OriginalMember(owner = "client!wj", name = "G", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!wj", name = "H", descriptor = "I")
    public static int field3355;

    @OriginalMember(owner = "client!wj", name = "I", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!wj", name = "K", descriptor = "I")
    public static int field3358;

    @OriginalMember(owner = "client!wj", name = "L", descriptor = "I")
    public static int field3359;

    @OriginalMember(owner = "client!wj", name = "M", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!wj", name = "N", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!wj", name = "O", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!wj", name = "P", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!wj", name = "Q", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!wj", name = "J", descriptor = "Ltj;")
    public static class108 field3357;

    static {
        new class349("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IILvq;)Lni;", line = 9)
    public final class305 method614(int arg0, int arg1, class269 arg2) {
        if (arg0 > -19) {
            this.field3346 = true;
        }
        ++field3356;
        return this.field3365.method1714(0, false, 0, arg2, 126, false, arg1);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILvq;)V", line = 20)
    public final void method605(int arg0, class269 arg1) {
        this.field3365.method1703((byte) -38, arg1);
        if (arg0 == 29929) {
            ++field3360;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lvq;IIB)Z", line = 31)
    public final boolean method16(class269 arg0, int arg1, int arg2, byte arg3) {
        ++field3354;
        class305 var5 = this.field3365.method1714(super.field1629, false, super.field1619, arg0, -85, false, 65536);
        if (var5 == null) {
            return false;
        } else {
            int var6 = 93 % ((arg3 - 19) / 45);
            class154 var7 = arg0.method884();
            var7.method1133(super.field1619, super.field1621, super.field1629);
            return var5.method209(arg1, arg2, var7, false);
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(B)I", line = 52)
    public final int method602(byte arg0) {
        if (arg0 > -33) {
            return -24;
        } else {
            ++field3363;
            return this.field3365.field3653;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Z)Z", line = 65)
    public final boolean method608(boolean arg0) {
        if (arg0) {
            return true;
        } else {
            ++field3348;
            return this.field3365.method1706(65);
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(BLvq;)Lbf;", line = 81)
    public final class316 method15(byte arg0, class269 arg1) {
        ++field3355;
        class305 var3 = this.field3365.method1714(super.field1629, false, super.field1619, arg1, 49, true, 1024);
        if (var3 == null) {
            return null;
        } else {
            int var4 = 0 % ((-8 - arg0) / 51);
            class154 var5 = arg1.method884();
            var5.method1133(super.field1619, super.field1621, super.field1629);
            class316 var6 = null;
            if (this.field3346) {
                var6 = class105.method616(-15465, 1);
            }
            if (this.field3365.field3652 == null) {
                var3.method230(var5, var6 == null ? null : var6.field4631[0], 0);
            } else {
                class235 var7 = this.field3365.field3652.method2152();
                arg1.method1013(var3, var7, var5, var6 == null ? null : var6.field4631[0], 0);
            }
            this.field3365.method1705(true, super.field1629 >> 7, super.field1619 >> 7, super.field1629 >> 7, arg1, super.field1619 >> 7, var3, 7215);
            return var6;
        }
    }

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "(B)V", line = 118)
    public static void method1573(byte arg0) {
        if (arg0 != -4) {
            field3357 = null;
        }
        field3357 = null;
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(B)I", line = 129)
    public final int method603(byte arg0) {
        ++field3352;
        if (arg0 != -62) {
            field3359 = 58;
        }
        return this.field3365.field3640;
    }

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "(I)Z", line = 140)
    public final boolean method610(int arg0) {
        ++field3347;
        return arg0 != -439;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lpl;III)V", line = 153)
    public static final void method1574(class390 arg0, int arg1, int arg2, int arg3) {
        int var4 = class115.field1487[arg1][arg2][arg3];
        int var5 = 0;
        arg0.field5481 = 0;
        while (var5 <= 24) {
            int var6 = var4 >> var5 & 255;
            if (var6 <= 0) {
                break;
            }
            arg0.field5487[arg0.field5481++] = class282.field4039[var6 - 1];
            var5 += 8;
        }
        for (int var7 = arg0.field5481; var7 < 4; ++var7) {
            arg0.field5487[var7] = null;
        }
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(I)I", line = 183)
    public final int method599(int arg0) {
        if (arg0 != -10450) {
            return -101;
        } else {
            ++field3353;
            return this.field3365.field3651;
        }
    }

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "(B)V", line = 196)
    public final void method613(byte arg0) {
        ++field3361;
        if (arg0 < -56) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lvq;B)V", line = 207)
    public final void method22(class269 arg0, byte arg1) {
        if (arg1 >= 11) {
            ++field3350;
            class305 var3 = this.field3365.method1714(super.field1629, true, super.field1619, arg0, -94, true, 131072);
            if (var3 != null) {
                this.field3365.method1705(false, super.field1629 >> 7, super.field1619 >> 7, super.field1629 >> 7, arg0, super.field1619 >> 7, var3, 7215);
            }
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)V", line = 222)
    public final void method600(int arg0) {
        ++field3364;
        if (arg0 > -62) {
            this.method603((byte) -126);
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lvq;ZLkm;IIBI)V", line = 232)
    public final void method611(class269 arg0, boolean arg1, class198 arg2, int arg3, int arg4, byte arg5, int arg6) {
        int var8 = -5 / ((12 - arg5) / 40);
        ++field3358;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(II)Luj;", line = 243)
    public static final class215 method1575(int arg0, int arg1) {
        ++field3362;
        class215 var2 = (class215) class349.field5079.method99(true, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class92.field1186.method643(30, arg1, true);
            class215 var4 = new class215();
            if (var3 != null) {
                var4.method1507(arg1, (byte) -116, new class130(var3));
            }
            class349.field5079.method90(var4, (long) arg1, arg0 + arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lvq;I)V", line = 265)
    public final void method604(class269 arg0, int arg1) {
        ++field3351;
        this.field3365.method1708(arg0, true);
        int var3 = -3 % ((arg1 - 87) / 34);
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(Lvq;Lbi;IIIIIIIZI)V", line = 275)
    public class224(class269 arg0, class282 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        super(arg6, arg7, arg8, class190.method1369(118, arg2, arg3));
        this.field3365 = new class245(arg0, arg1, arg2, arg3, arg4, arg5, super.field1619, super.field1629, arg9, arg10);
        this.field3346 = ~arg1.field4036 != -1 && !arg9;
    }
}
