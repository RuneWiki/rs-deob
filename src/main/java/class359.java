import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public class class359 {

    @OriginalMember(owner = "client!gq", name = "d", descriptor = "S")
    public short field5272;

    @OriginalMember(owner = "client!gq", name = "l", descriptor = "I")
    public int field5280;

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "Z")
    public boolean field5271;

    @OriginalMember(owner = "client!gq", name = "o", descriptor = "I")
    public int field5283;

    @OriginalMember(owner = "client!gq", name = "j", descriptor = "B")
    public byte field5278;

    @OriginalMember(owner = "client!gq", name = "g", descriptor = "I")
    public int field5275;

    @OriginalMember(owner = "client!gq", name = "k", descriptor = "I")
    public int field5279;

    @OriginalMember(owner = "client!gq", name = "p", descriptor = "S")
    public short field5284;

    @OriginalMember(owner = "client!gq", name = "h", descriptor = "I")
    public int field5276;

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "B")
    public byte field5270;

    @OriginalMember(owner = "client!gq", name = "i", descriptor = "S")
    public short field5277;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "I")
    public static int field5269;

    @OriginalMember(owner = "client!gq", name = "e", descriptor = "I")
    public static int field5273;

    @OriginalMember(owner = "client!gq", name = "f", descriptor = "I")
    public static int field5274;

    @OriginalMember(owner = "client!gq", name = "m", descriptor = "I")
    public static int field5281;

    @OriginalMember(owner = "client!gq", name = "n", descriptor = "I")
    public static int field5282;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(III)Lqh;")
    public static final class50 method2210(int arg0, int arg1, int arg2) {
        class234 var3 = class518.field7511[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3613;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(ZLmv;Lmv;BI)I")
    public static final int method2211(boolean arg0, class255 arg1, class255 arg2, byte arg3, int arg4) {
        field5274++;
        if (arg4 == 1) {
            int var5 = arg1.field5237;
            int var6 = arg2.field5237;
            if (!arg0) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg4 == 2) {
            return class490.method2959(arg1.method1644(-1).field5505, class146.field2452, (byte) 62, arg2.method1644(arg3 + 56).field5505);
        } else if (arg4 == 3) {
            if (arg1.field3914.equals("-")) {
                if (arg2.field3914.equals("-")) {
                    return 0;
                } else if (arg0) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg2.field3914.equals("-")) {
                return arg0 ? 1 : -1;
            } else {
                return class490.method2959(arg1.field3914, class146.field2452, (byte) 62, arg2.field3914);
            }
        } else if (arg4 != 4) {
            if (arg3 != -57) {
                field5269 = -6;
            }
            if (arg4 == 5) {
                if (arg1.method2200(false)) {
                    return arg2.method2200(false) ? 0 : 1;
                } else if (arg2.method2200(false)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg4 == 6) {
                if (arg1.method2202((byte) -106)) {
                    return arg2.method2202((byte) 83) ? 0 : 1;
                } else if (arg2.method2202((byte) 47)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg4 == 7) {
                if (arg1.method2203(arg3 + 58)) {
                    return arg2.method2203(1) ? 0 : 1;
                } else if (arg2.method2203(1)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg4 == 8) {
                int var7 = arg1.field3907;
                int var8 = arg2.field3907;
                if (arg0) {
                    if (var8 == 1000) {
                        var8 = -1;
                    }
                    if (var7 == 1000) {
                        var7 = -1;
                    }
                } else {
                    if (var8 == -1) {
                        var8 = 1000;
                    }
                    if (var7 == -1) {
                        var7 = 1000;
                    }
                }
                return var7 - var8;
            } else {
                return arg1.field3910 - arg2.field3910;
            }
        } else if (arg1.method2204((byte) -66)) {
            return arg2.method2204((byte) -66) ? 0 : 1;
        } else if (arg2.method2204((byte) -66)) {
            return -1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method2212(int arg0, byte[] arg1) {
        field5282++;
        class289 var2 = new class289(arg1);
        if (arg0 >= -126) {
            return null;
        }
        int var3 = var2.method1858(-3256);
        int var4 = var2.method1815((byte) -93);
        if (var4 < 0 || class509.field7422 != 0 && var4 > class509.field7422) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method1849(var4, -1, var5, 0);
            return var5;
        } else {
            int var6 = var2.method1815((byte) -94);
            if (var6 < 0 || !(class509.field7422 == 0 || var6 <= class509.field7422)) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class401.method2499(var7, var6, arg1, var4, 9);
            } else {
                class327.field4966.method2252(var2, false, var7);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(IBII)V")
    public static final void method2213(int arg0, byte arg1, int arg2, int arg3) {
        field5273++;
        if (arg3 == 0) {
            class218.field3425++;
            class459.method2765(class46.field962, (byte) 87);
        }
        if (arg1 != 19) {
            method2211(true, null, null, (byte) 70, 114);
        }
        if (arg3 == 1) {
            class257.field3935++;
            class459.method2765(class304.field4552, (byte) 87);
        }
        class335.field5062.method1820(false, class179.field2912.method1458(100, 82) ? 1 : 0);
        class335.field5062.method1853(class212.field3378 + arg0, arg1 ^ 0x1D);
        class335.field5062.method1853(class496.field7292 + arg2, 113);
        class205.field3284 = arg0;
        class471.field6986 = false;
        class127.field2172 = arg2;
        class174.method1202(15);
    }

    @OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
    public class359(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field5272 = (short) arg6;
        this.field5280 = arg0;
        this.field5271 = arg10;
        this.field5283 = arg2;
        this.field5278 = (byte) arg7;
        this.field5275 = arg3;
        this.field5279 = arg1;
        this.field5284 = (short) arg5;
        this.field5276 = arg11;
        this.field5270 = (byte) arg8;
        this.field5277 = (short) arg4;
    }
}
