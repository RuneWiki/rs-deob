import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class353 extends class383 implements class196 {

    @OriginalMember(owner = "client!jc", name = "s", descriptor = "Lpd;")
    public class433 field5466;

    @OriginalMember(owner = "client!jc", name = "C", descriptor = "Z")
    private boolean field5476;

    @OriginalMember(owner = "client!jc", name = "w", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field5470 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!jc", name = "D", descriptor = "Lqo;")
    public static class141 field5477 = new class141(32);

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "I")
    public static int field5458;

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "I")
    public static int field5459;

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "I")
    public static int field5460;

    @OriginalMember(owner = "client!jc", name = "n", descriptor = "I")
    public static int field5461;

    @OriginalMember(owner = "client!jc", name = "o", descriptor = "I")
    public static int field5462;

    @OriginalMember(owner = "client!jc", name = "p", descriptor = "I")
    public static int field5463;

    @OriginalMember(owner = "client!jc", name = "q", descriptor = "I")
    public static int field5464;

    @OriginalMember(owner = "client!jc", name = "r", descriptor = "I")
    public static int field5465;

    @OriginalMember(owner = "client!jc", name = "t", descriptor = "I")
    public static int field5467;

    @OriginalMember(owner = "client!jc", name = "u", descriptor = "I")
    public static int field5468;

    @OriginalMember(owner = "client!jc", name = "v", descriptor = "I")
    public static int field5469;

    @OriginalMember(owner = "client!jc", name = "x", descriptor = "I")
    public static int field5471;

    @OriginalMember(owner = "client!jc", name = "y", descriptor = "I")
    public static int field5472;

    @OriginalMember(owner = "client!jc", name = "z", descriptor = "I")
    public static int field5473;

    @OriginalMember(owner = "client!jc", name = "A", descriptor = "I")
    public static int field5474;

    @OriginalMember(owner = "client!jc", name = "B", descriptor = "I")
    public static int field5475;

    @OriginalMember(owner = "client!jc", name = "E", descriptor = "I")
    public static int field5478;

    @OriginalMember(owner = "client!jc", name = "G", descriptor = "I")
    public static int field5480;

    @OriginalMember(owner = "client!jc", name = "F", descriptor = "Lic;")
    public static class32 field5479;

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(Lqa;Leu;IIIIIZII)V")
    public class353(class496 arg0, class130 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        super(arg4, arg5, arg6, arg1.field1896, arg1.field1909);
        this.field5466 = new class433(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
        this.field5476 = arg1.field1886 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)I")
    public final int method63(byte arg0) {
        if (arg0 != 63) {
            return -7;
        } else {
            ++field5462;
            return this.field5466.field6432;
        }
    }

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "(I)V")
    public static void method2229(int arg0) {
        field5477 = null;
        field5470 = null;
        int var1 = 50 / ((arg0 - -19) / 38);
        field5479 = null;
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(BLqa;)V")
    public final void method62(byte arg0, class496 arg1) {
        ++field5468;
        if (arg0 != -126) {
            this.method62((byte) -85, (class496) null);
        }
        class201 var3 = this.field5466.method2590(true, 10, arg1, true, super.field5835, 262144, super.field5838);
        if (var3 != null) {
            int var4 = super.field5838 >> 7;
            int var5 = super.field5835 >> 7;
            this.field5466.method2589(var5, var4, false, var4, var5, arg1, true, var3);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILqa;)V")
    public final void method67(int arg0, class496 arg1) {
        this.field5466.method2599((byte) 86, arg1);
        ++field5474;
        int var3 = 77 % ((59 - arg0) / 60);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)I")
    public final int method50(int arg0) {
        if (arg0 != 25707) {
            field5478 = -105;
        }
        ++field5480;
        return this.field5466.field6429;
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(B)Z")
    public final boolean method60(byte arg0) {
        ++field5467;
        if (arg0 >= -108) {
            field5477 = null;
        }
        return this.field5466.method2593(10);
    }

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "(I)Z")
    public final boolean method49(int arg0) {
        ++field5475;
        if (arg0 != 7) {
            this.method56(-78, -57, -87, (class496) null);
        }
        return false;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILqa;B)Lc;")
    public final class201 method53(int arg0, class496 arg1, byte arg2) {
        int var4 = 75 % ((-62 - arg2) / 39);
        ++field5461;
        return this.field5466.method2590(false, 10, arg1, false, 0, arg0, 0);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIILqa;)Z")
    public final boolean method56(int arg0, int arg1, int arg2, class496 arg3) {
        ++field5471;
        class201 var5 = this.field5466.method2590(false, 10, arg3, false, super.field5835, 131072, super.field5838);
        if (var5 == null) {
            return false;
        } else {
            if (arg1 != 3) {
                this.method59((byte) 60);
            }
            class23 var6 = arg3.method1088();
            var6.method185(super.field5838, super.field5837, super.field5835);
            return var5.method310(arg0, arg2, var6, false);
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)I")
    public final int method66(int arg0) {
        ++field5458;
        if (arg0 != -7234) {
            field5477 = null;
        }
        return this.field5466.field6421;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lqa;I)Lpj;")
    public final class507 method51(class496 arg0, int arg1) {
        ++field5473;
        class201 var3 = this.field5466.method2590(true, 10, arg0, false, super.field5835, 2048, super.field5838);
        if (var3 == null) {
            return null;
        } else {
            class23 var4 = arg0.method1088();
            var4.method185(super.field5838, super.field5837, super.field5835);
            class507 var5 = null;
            if (this.field5476) {
                var5 = class82.method527(1, 1761171873);
            }
            if (arg1 != -150) {
                this.method51((class496) null, -59);
            }
            if (this.field5466.field6448 != null) {
                class258 var6 = this.field5466.field6448.method870();
                arg0.method1047(var3, var6, var4, var5 != null ? var5.field7549[0] : null, 0);
            } else {
                var3.method318(var4, var5 == null ? null : var5.field7549[0], 0);
            }
            int var7 = super.field5838 >> 7;
            int var8 = super.field5835 >> 7;
            this.field5466.method2589(var8, var7, true, var7, var8, arg0, true, var3);
            return var5;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(BZI)V")
    public static final void method2230(byte arg0, boolean arg1, int arg2) {
        if (~arg2 == -1) {
            class337.field5242 = class496.method2951(class96.field1399.field5212 * 2, 24695, class500.field7448, class419.field6254, class245.field3430, arg2);
        } else {
            if (arg1) {
                class337.field5242 = class496.method2951(0, 24695, class500.field7448, class419.field6254, class245.field3430, 0);
                class337.field5242.method1053(0);
                class4 var3 = class392.method2411(class66.field917, (byte) -67, class119.field1677, 0);
                class33 var4 = class337.field5242.method1095(var3, class476.method2847(class113.field1576, class66.field917, 0), true);
                class252.method1645(var4, (byte) 31, class107.field1512.method2335((byte) -100, class288.field4292), true);
                class337.field5242.method1075();
                class168.method1183((byte) 104);
                class337.field5242.method2954((byte) -110);
            }
            try {
                class337.field5242 = class496.method2951(class96.field1399.field5212 * 2, 24695, class500.field7448, class419.field6254, class245.field3430, arg2);
                if (class337.field5242.method1043()) {
                    class195 var5 = class337.field5242.method1129(78643200);
                    class337.field5242.method1133(var5);
                }
            } catch (Throwable var6) {
                class337.field5242 = class496.method2951(0, 24695, class500.field7448, class419.field6254, class245.field3430, 0);
                arg2 = 0;
            }
        }
        ++field5463;
        class441.field6563 = arg2;
        class425.method2559(128);
        if (!class337.field5242.method1094()) {
            class505.field7541 = 1;
        }
        class337.field5242.method1072(class505.field7541);
        class337.field5242.method1105(0);
        class337.field5242.method1126(8);
        class245.field3425 = class337.field5242.method1092();
        class445.field6617 = class337.field5242.method1092();
        class519.method3088((byte) -15);
        class337.field5242.method1067(!class96.field1399.field5200);
        if (arg0 >= 8) {
            if (class337.field5242.method1089()) {
                class269.method1717(false, class96.field1399.field5211);
            }
            class452.method2721(class337.field5242, class485.field7122 >> 3, 1, class96.field1403 >> 3);
            class459.method2760((byte) -7);
            class406.field6129 = false;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(BLqa;)V")
    public final void method55(byte arg0, class496 arg1) {
        ++field5472;
        this.field5466.method2598(96, arg1);
        if (arg0 >= -31) {
            field5477 = null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IB)I")
    public static final int method2231(int arg0, byte arg1) {
        ++field5460;
        int var7 = arg0 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        if (arg1 != -84) {
            method2230((byte) -87, true, 111);
        }
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lqv;BLqa;IZII)V")
    public final void method61(class49 arg0, byte arg1, class496 arg2, int arg3, boolean arg4, int arg5, int arg6) {
        ++field5465;
        if (arg1 != 118) {
            field5479 = null;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "(I)V")
    public final void method57(int arg0) {
        if (arg0 != -5077) {
            this.method51((class496) null, -29);
        }
        ++field5464;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(II[B)I")
    public static final int method2232(int arg0, int arg1, byte[] arg2) {
        if (arg1 != 0) {
            return -38;
        } else {
            ++field5459;
            return class52.method360(0, true, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(B)V")
    public final void method59(byte arg0) {
        ++field5469;
        int var2 = 111 % ((arg0 - 27) / 63);
    }
}
