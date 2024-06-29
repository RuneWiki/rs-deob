import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public class class378 extends class205 {

    @OriginalMember(owner = "client!pu", name = "D", descriptor = "I")
    private int field5516 = -1;

    @OriginalMember(owner = "client!pu", name = "J", descriptor = "I")
    private int field5522 = 0;

    @OriginalMember(owner = "client!pu", name = "B", descriptor = "I")
    private int field5515 = 0;

    @OriginalMember(owner = "client!pu", name = "K", descriptor = "Z")
    public boolean field5523 = false;

    @OriginalMember(owner = "client!pu", name = "u", descriptor = "I")
    private int field5508 = 0;

    @OriginalMember(owner = "client!pu", name = "A", descriptor = "I")
    private int field5514 = -32768;

    @OriginalMember(owner = "client!pu", name = "E", descriptor = "I")
    public int field5517;

    @OriginalMember(owner = "client!pu", name = "x", descriptor = "I")
    private int field5511;

    @OriginalMember(owner = "client!pu", name = "I", descriptor = "I")
    private int field5521;

    @OriginalMember(owner = "client!pu", name = "Q", descriptor = "Lfn;")
    private class87 field5529;

    @OriginalMember(owner = "client!pu", name = "z", descriptor = "Lsk;")
    public static class423 field5513 = new class423("glow1:", "leuchten1:", "brillant1:", "brilho1:");

    @OriginalMember(owner = "client!pu", name = "Z", descriptor = "I")
    public static int field5537 = 0;

    @OriginalMember(owner = "client!pu", name = "W", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field5534 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!pu", name = "v", descriptor = "I")
    public static int field5509;

    @OriginalMember(owner = "client!pu", name = "y", descriptor = "I")
    public static int field5512;

    @OriginalMember(owner = "client!pu", name = "F", descriptor = "I")
    public static int field5518;

    @OriginalMember(owner = "client!pu", name = "G", descriptor = "I")
    public static int field5519;

    @OriginalMember(owner = "client!pu", name = "H", descriptor = "I")
    public static int field5520;

    @OriginalMember(owner = "client!pu", name = "L", descriptor = "I")
    public static int field5524;

    @OriginalMember(owner = "client!pu", name = "M", descriptor = "I")
    public static int field5525;

    @OriginalMember(owner = "client!pu", name = "N", descriptor = "I")
    public static int field5526;

    @OriginalMember(owner = "client!pu", name = "O", descriptor = "I")
    public static int field5527;

    @OriginalMember(owner = "client!pu", name = "P", descriptor = "I")
    public static int field5528;

    @OriginalMember(owner = "client!pu", name = "R", descriptor = "I")
    public static int field5530;

    @OriginalMember(owner = "client!pu", name = "S", descriptor = "I")
    public static int field5531;

    @OriginalMember(owner = "client!pu", name = "U", descriptor = "I")
    public static int field5532;

    @OriginalMember(owner = "client!pu", name = "X", descriptor = "I")
    public static int field5535;

    @OriginalMember(owner = "client!pu", name = "Y", descriptor = "I")
    public static int field5536;

    @OriginalMember(owner = "client!pu", name = "w", descriptor = "Ldd;")
    private class477 field5510;

    @OriginalMember(owner = "client!pu", name = "V", descriptor = "Lql;")
    public static class496 field5533;

    @OriginalMember(owner = "client!pu", name = "d", descriptor = "(I)Z", line = 3)
    public final boolean method164(int arg0) {
        ++field5524;
        if (arg0 != 0) {
            field5513 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(Lcd;Lqq;I)V", line = 14)
    private final void method2272(class198 arg0, class318 arg1, int arg2) {
        ++field5520;
        if (arg2 != 0) {
            method2277(67);
        }
        class425[] var4 = arg0.method502();
        class10[] var5 = arg0.method471();
        if ((this.field5510 == null || this.field5510.field7292) && (var4 != null || var5 != null)) {
            this.field5510 = new class477(class369.field5424);
        }
        if (this.field5510 != null) {
            this.field5510.method2879(arg1, (long) class369.field5424, var4, var5, false);
            this.field5510.method2883(super.field3217, super.field3225, super.field3227, super.field3219, super.field3220);
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(BLqq;)Lkm;", line = 41)
    public final class227 method169(byte arg0, class318 arg1) {
        ++field5536;
        class198 var3 = this.method2275((~this.field5515 == -1 ? 0 : 5) | 2048, (byte) -64, this.field5511, arg1);
        if (var3 == null) {
            return null;
        } else {
            if (~this.field5515 != -1) {
                var3.method476(this.field5515 * 2048);
            }
            class496 var4 = arg1.method1976();
            var4.method198(super.field3218, super.field3214, super.field3222);
            if (arg0 >= -11) {
                field5534 = null;
            }
            if (this.field5510 != null) {
                class372 var5 = this.field5510.method2882();
                arg1.method1983(var3, var5, var4, (class346) null, 0);
            } else {
                var3.method461(var4, (class346) null, 0);
            }
            this.field5514 = var3.method492();
            this.method2272(var3, arg1, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(ILqq;Lps;ZZII)V", line = 75)
    public final void method165(int arg0, class318 arg1, class59 arg2, boolean arg3, boolean arg4, int arg5, int arg6) {
        if (!arg4) {
            this.method168(-27);
        }
        ++field5531;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(Lqq;BII)Z", line = 90)
    public final boolean method162(class318 arg0, byte arg1, int arg2, int arg3) {
        ++field5512;
        if (arg1 != -44) {
            this.field5514 = 117;
        }
        return false;
    }

    @OriginalMember(owner = "client!pu", name = "e", descriptor = "(I)V", line = 102)
    public final void method168(int arg0) {
        int var2 = 124 % ((-53 - arg0) / 62);
        ++field5527;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "(III)I", line = 112)
    public static final int method2273(int arg0, int arg1, int arg2) {
        ++field5509;
        return arg0 != arg1 && arg0 != 5 ? 256 : class202.field3203[3 & arg2];
    }

    @OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(IIIIIIIIIIIII)V", line = 264)
    public class378(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg3, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
        this.field5517 = arg1 + arg2;
        this.field5515 = arg12;
        this.field5511 = arg0;
        this.field5521 = arg4;
        class29 var14 = class201.field3192.method1250(this.field5511, -102);
        int var15 = var14.field373;
        if (~var15 != 0) {
            this.field5529 = class429.field6302.method106(-80, var15);
            this.field5523 = false;
        } else {
            this.field5523 = true;
        }
        if (~this.field5517 == ~arg2) {
            class70.method516(this.field5529, super.field3217, this.field5508, false, super.field3218, super.field3222, (byte) -79);
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(B)V", line = 129)
    public static final void method2274(byte arg0) {
        class233.field3532 = null;
        class407.field5901 = null;
        ++field5518;
        if (arg0 >= -123) {
            method2274((byte) -81);
        }
    }

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "(ZLqq;)V", line = 143)
    public final void method172(boolean arg0, class318 arg1) {
        ++field5528;
        if (arg0) {
            field5513 = null;
        }
        class198 var3 = this.method2275(0, (byte) -59, this.field5511, arg1);
        if (var3 != null) {
            this.method2272(var3, arg1, 0);
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(IBILqq;)Lcd;", line = 165)
    private final class198 method2275(int arg0, byte arg1, int arg2, class318 arg3) {
        ++field5530;
        class29 var5 = class201.field3192.method1250(arg2, 75);
        if (arg1 >= -40) {
            this.method2275(-58, (byte) 51, 55, (class318) null);
        }
        class343 var6 = class201.field3195[super.field3217];
        class343 var7 = this.field5521 < 3 ? class201.field3195[this.field5521 + 1] : null;
        return this.field5523 ? var5.method147(arg0, arg3, 0, true, super.field3214, -1, -1, super.field3218, var6, class429.field6302, -127, super.field3222, var7) : var5.method147(arg0, arg3, this.field5522, true, super.field3214, this.field5508, this.field5516, super.field3218, var6, class429.field6302, -124, super.field3222, var7);
    }

    @OriginalMember(owner = "client!pu", name = "finalize", descriptor = "()V", line = 188)
    protected final void finalize() {
        ++field5532;
        if (this.field5510 != null) {
            this.field5510.method2878();
        }
    }

    @OriginalMember(owner = "client!pu", name = "d", descriptor = "(B)V", line = 201)
    public final void method2276(byte arg0) {
        if (this.field5510 != null) {
            this.field5510.method2878();
        }
        if (arg0 != -118) {
            this.finalize();
        }
        ++field5519;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(I)V", line = 214)
    public static void method2277(int arg0) {
        field5534 = null;
        int var1 = -25 / ((arg0 - -42) / 37);
        field5513 = null;
        field5533 = null;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(II)V", line = 226)
    public final void method2278(int arg0, int arg1) {
        ++field5526;
        if (!this.field5523) {
            this.field5522 += arg1;
            while (this.field5522 > this.field5529.field1526[this.field5508]) {
                this.field5522 -= this.field5529.field1526[this.field5508];
                ++this.field5508;
                if (~this.field5508 <= ~this.field5529.field1512.length) {
                    this.field5523 = true;
                    break;
                }
            }
            if (!this.field5523) {
                class70.method516(this.field5529, super.field3217, this.field5508, false, super.field3218, super.field3222, (byte) -79);
            }
            if (arg0 != 0) {
                this.method2275(111, (byte) 9, -96, (class318) null);
            }
        }
    }

    @OriginalMember(owner = "client!pu", name = "g", descriptor = "(I)I", line = 306)
    public final int method333(int arg0) {
        if (arg0 != 0) {
            this.field5522 = -107;
        }
        ++field5535;
        return this.field5514;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(IB)I", line = 318)
    public static final int method2279(int arg0, byte arg1) {
        ++field5525;
        int var2 = 34 % ((-65 - arg1) / 48);
        return arg0 >>> 8;
    }
}
