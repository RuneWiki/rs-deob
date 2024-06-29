import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class221 extends class376 implements class185 {

    @OriginalMember(owner = "client!sc", name = "K", descriptor = "Lck;")
    public class436 field3414;

    @OriginalMember(owner = "client!sc", name = "R", descriptor = "Z")
    private boolean field3421;

    @OriginalMember(owner = "client!sc", name = "B", descriptor = "Lnd;")
    public static class366 field3405 = new class366(12, -1);

    @OriginalMember(owner = "client!sc", name = "O", descriptor = "[I")
    public static int[] field3418 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!sc", name = "N", descriptor = "I")
    public static int field3417 = -1;

    @OriginalMember(owner = "client!sc", name = "w", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!sc", name = "x", descriptor = "I")
    public static int field3401;

    @OriginalMember(owner = "client!sc", name = "y", descriptor = "I")
    public static int field3402;

    @OriginalMember(owner = "client!sc", name = "z", descriptor = "I")
    public static int field3403;

    @OriginalMember(owner = "client!sc", name = "A", descriptor = "I")
    public static int field3404;

    @OriginalMember(owner = "client!sc", name = "C", descriptor = "I")
    public static int field3406;

    @OriginalMember(owner = "client!sc", name = "D", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!sc", name = "E", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!sc", name = "F", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!sc", name = "G", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!sc", name = "H", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!sc", name = "I", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!sc", name = "J", descriptor = "I")
    public static int field3413;

    @OriginalMember(owner = "client!sc", name = "L", descriptor = "I")
    public static int field3415;

    @OriginalMember(owner = "client!sc", name = "M", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!sc", name = "P", descriptor = "I")
    public static int field3419;

    @OriginalMember(owner = "client!sc", name = "Q", descriptor = "Lmh;")
    public static class429 field3420;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)V", line = 4)
    public final void method163(int arg0) {
        ++field3407;
        if (arg0 != 8793) {
            field3417 = 125;
        }
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Lqq;Lin;IIIIIZII)V", line = 14)
    public class221(class318 arg0, class56 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        super(arg4, arg5, arg6, arg1.field917, arg1.field900);
        this.field3414 = new class436(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
        this.field3421 = arg1.field895 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZLqq;)V", line = 23)
    public final void method176(boolean arg0, class318 arg1) {
        if (!arg0) {
            field3405 = null;
        }
        ++field3400;
        this.field3414.method2549(10, arg1);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lqq;I)V", line = 35)
    public final void method171(class318 arg0, int arg1) {
        if (arg1 == 1577) {
            ++field3413;
            this.field3414.method2547(-12, arg0);
        }
    }

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "(I)V", line = 46)
    public final void method168(int arg0) {
        ++field3409;
        int var2 = 12 / ((-53 - arg0) / 62);
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lqq;ZI)Lcd;", line = 58)
    public final class198 method167(class318 arg0, boolean arg1, int arg2) {
        if (arg1) {
            this.method164(-86);
        }
        ++field3410;
        return this.field3414.method2550(false, 0, 0, arg0, -72, false, arg2);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lqq;BII)Z", line = 70)
    public final boolean method162(class318 arg0, byte arg1, int arg2, int arg3) {
        ++field3419;
        class198 var5 = this.field3414.method2550(false, super.field5486, super.field5477, arg0, -100, false, 131072);
        if (var5 == null) {
            return false;
        } else if (arg1 != -44) {
            return true;
        } else {
            class496 var6 = arg0.method1976();
            var6.method198(super.field5477, super.field5490, super.field5486);
            return var5.method495(arg2, arg3, var6, false);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Ljava/lang/String;IIIIZLjava/lang/String;IBJZ)V", line = 90)
    public static final void method1345(String arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, String arg6, int arg7, byte arg8, long arg9, boolean arg10) {
        ++field3415;
        if (!class381.field5555 && ~class330.field4948 > -501) {
            int var12 = ~arg4 == 0 ? client.field3001 : arg4;
            class2 var13 = new class2(arg6, arg0, var12, arg1, arg7, arg9, arg3, arg2, arg5, arg10);
            class329.field4932.method4(1, var13);
            ++class330.field4948;
            if (arg8 != -121) {
                field3418 = null;
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)I", line = 111)
    public final int method173(int arg0) {
        ++field3411;
        return arg0 != 1438 ? 39 : this.field3414.field6391;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BLqq;)Lkm;", line = 122)
    public final class227 method169(byte arg0, class318 arg1) {
        ++field3404;
        class198 var3 = this.field3414.method2550(true, super.field5486, super.field5477, arg1, -92, false, 2048);
        if (var3 == null) {
            return null;
        } else {
            if (arg0 > -11) {
                method1347((byte) 89);
            }
            class496 var4 = arg1.method1976();
            var4.method198(super.field5477, super.field5490, super.field5486);
            class227 var5 = null;
            if (this.field3421) {
                var5 = class145.method951(1, 0);
            }
            if (this.field3414.field6402 != null) {
                class372 var6 = this.field3414.field6402.method2882();
                arg1.method1983(var3, var6, var4, var5 == null ? null : var5.field3476[0], 0);
            } else {
                var3.method461(var4, var5 != null ? var5.field3476[0] : null, 0);
            }
            int var7 = super.field5477 >> 7;
            int var8 = super.field5486 >> 7;
            this.field3414.method2548(var8, var7, -400, var7, var3, true, arg1, var8);
            return var5;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Ltq;I)V", line = 166)
    public static final void method1346(class427 arg0, int arg1) {
        if (arg1 != 12) {
            method1346((class427) null, 46);
        }
        ++field3403;
        if (class306.field4636) {
            if (arg0.field6147 != null) {
                class427 var2 = class59.method419(class142.field2311, 12782, class357.field5298);
                if (var2 != null) {
                    class298 var3 = new class298();
                    var3.field4514 = var2;
                    var3.field4517 = arg0;
                    var3.field4520 = arg0.field6147;
                    class94.method704(var3);
                }
            }
            ++class500.field7578;
            class400.method2379((byte) -75, class149.field2401);
            class230.field3508.method253(-119, arg0.field6157);
            class230.field3508.method282(class262.field3967, -35);
            class230.field3508.method282(arg0.field6274, 102);
            class230.field3508.method266(class357.field5298, false);
            class230.field3508.method252(arg0.field6265, -112);
            class230.field3508.method246((byte) -45, class142.field2311);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)I", line = 203)
    public final int method174(byte arg0) {
        if (arg0 <= 113) {
            return 19;
        } else {
            ++field3416;
            return this.field3414.field6400;
        }
    }

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "(I)Z", line = 215)
    public final boolean method164(int arg0) {
        if (arg0 != 0) {
            return true;
        } else {
            ++field3412;
            return false;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z)I", line = 226)
    public final int method170(boolean arg0) {
        if (!arg0) {
            this.field3421 = true;
        }
        ++field3406;
        return this.field3414.field6421;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)Z", line = 238)
    public final boolean method161(int arg0) {
        ++field3402;
        if (arg0 != 15275) {
            this.method165(31, (class318) null, (class59) null, false, false, 45, 124);
        }
        return this.field3414.method2542(arg0 + -15276);
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(ZLqq;)V", line = 249)
    public final void method172(boolean arg0, class318 arg1) {
        ++field3401;
        if (arg0) {
            field3420 = null;
        }
        class198 var3 = this.field3414.method2550(true, super.field5486, super.field5477, arg1, -125, true, 262144);
        if (var3 != null) {
            int var4 = super.field5477 >> 7;
            int var5 = super.field5486 >> 7;
            this.field3414.method2548(var5, var4, -400, var4, var3, false, arg1, var5);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILqq;Lps;ZZII)V", line = 274)
    public final void method165(int arg0, class318 arg1, class59 arg2, boolean arg3, boolean arg4, int arg5, int arg6) {
        if (!arg4) {
            this.field3414 = null;
        }
        ++field3408;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(B)V", line = 296)
    public static void method1347(byte arg0) {
        field3420 = null;
        field3418 = null;
        field3405 = null;
        if (arg0 != 86) {
            method1346((class427) null, 71);
        }
    }
}
