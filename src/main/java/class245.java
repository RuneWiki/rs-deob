import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class245 extends class127 implements class161 {

    @OriginalMember(owner = "client!wg", name = "C", descriptor = "B")
    private byte field3385;

    @OriginalMember(owner = "client!wg", name = "Z", descriptor = "B")
    private byte field3408;

    @OriginalMember(owner = "client!wg", name = "H", descriptor = "S")
    private short field3390;

    @OriginalMember(owner = "client!wg", name = "S", descriptor = "Z")
    private boolean field3401;

    @OriginalMember(owner = "client!wg", name = "O", descriptor = "Z")
    private boolean field3397;

    @OriginalMember(owner = "client!wg", name = "T", descriptor = "Z")
    private boolean field3402;

    @OriginalMember(owner = "client!wg", name = "R", descriptor = "Z")
    private boolean field3400;

    @OriginalMember(owner = "client!wg", name = "A", descriptor = "Lhc;")
    private class75 field3383;

    @OriginalMember(owner = "client!wg", name = "V", descriptor = "Lek;")
    private class294 field3404;

    @OriginalMember(owner = "client!wg", name = "w", descriptor = "I")
    public static int field3379;

    @OriginalMember(owner = "client!wg", name = "x", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!wg", name = "y", descriptor = "I")
    public static int field3381;

    @OriginalMember(owner = "client!wg", name = "z", descriptor = "I")
    public static int field3382;

    @OriginalMember(owner = "client!wg", name = "B", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!wg", name = "D", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!wg", name = "E", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!wg", name = "F", descriptor = "I")
    public static int field3388;

    @OriginalMember(owner = "client!wg", name = "J", descriptor = "I")
    public static int field3392;

    @OriginalMember(owner = "client!wg", name = "K", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!wg", name = "L", descriptor = "I")
    public static int field3394;

    @OriginalMember(owner = "client!wg", name = "M", descriptor = "I")
    public static int field3395;

    @OriginalMember(owner = "client!wg", name = "P", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "client!wg", name = "Q", descriptor = "I")
    public static int field3399;

    @OriginalMember(owner = "client!wg", name = "U", descriptor = "I")
    public static int field3403;

    @OriginalMember(owner = "client!wg", name = "W", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!wg", name = "X", descriptor = "I")
    public static int field3406;

    @OriginalMember(owner = "client!wg", name = "Y", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!wg", name = "ab", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!wg", name = "bb", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!wg", name = "cb", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!wg", name = "G", descriptor = "Lrg;")
    public static class383 field3389;

    @OriginalMember(owner = "client!wg", name = "N", descriptor = "Lge;")
    public static class423 field3396;

    @OriginalMember(owner = "client!wg", name = "I", descriptor = "[[B")
    public static byte[][] field3391;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Laa;B)V")
    public final void method122(class281 arg0, byte arg1) {
        ++field3392;
        Object var3 = null;
        class294 var5;
        if (this.field3404 == null && this.field3400) {
            class169 var4 = this.method1535(arg0, 131072, true, 115);
            var5 = var4 == null ? null : var4.field2405;
        } else {
            var5 = this.field3404;
            this.field3404 = null;
        }
        if (var5 != null) {
            class409.method2624(var5, this.field3408, super.field1787, super.field1783, (boolean[]) null);
        }
        if (arg1 < 16) {
            this.field3390 = -97;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)I")
    public final int method123(byte arg0) {
        if (arg0 <= 108) {
            this.field3397 = true;
        }
        ++field3388;
        return 22;
    }

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "(B)V")
    public static void method1534(byte arg0) {
        field3389 = null;
        field3391 = null;
        field3396 = null;
        int var1 = -115 / ((arg0 - 3) / 61);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Laa;Z)V")
    public final void method128(class281 arg0, boolean arg1) {
        ++field3409;
        if (!arg1) {
            field3396 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IZIILaa;ILqh;)V")
    public final void method129(int arg0, boolean arg1, int arg2, int arg3, class281 arg4, int arg5, class43 arg6) {
        ++field3386;
        if (arg6 instanceof class245) {
            class245 var8 = (class245) arg6;
            if (this.field3383 != null && var8.field3383 != null) {
                this.field3383.method535(var8.field3383, arg3, arg5, arg2, arg1);
            }
        }
        if (arg0 != 0) {
            this.method134((class281) null, 93, (byte) -9);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Laa;I)Lcn;")
    public final class300 method131(class281 arg0, int arg1) {
        ++field3398;
        if (this.field3383 == null) {
            return null;
        } else {
            class261 var3 = arg0.method1769();
            var3.method882(super.field1787, super.field1790, super.field1783);
            class300 var4 = null;
            if (this.field3401) {
                var4 = class8.method54((byte) -114, 1);
            }
            this.field3383.method514(var3, var4 != null ? var4.field4152[0] : null, 0);
            if (arg1 < 72) {
                this.method128((class281) null, true);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "(I)I")
    public final int method124(int arg0) {
        if (arg0 != -11197) {
            this.method126(-53);
        }
        ++field3387;
        return this.field3385;
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(Laa;B)V")
    public final void method133(class281 arg0, byte arg1) {
        ++field3394;
        Object var3 = null;
        class294 var5;
        if (this.field3404 == null && this.field3400) {
            class169 var4 = this.method1535(arg0, 131072, true, arg1 ^ -10);
            var5 = var4 != null ? var4.field2405 : null;
        } else {
            var5 = this.field3404;
            this.field3404 = null;
        }
        if (arg1 != -102) {
            this.method134((class281) null, -15, (byte) 14);
        }
        if (var5 != null) {
            class209.method1358(var5, this.field3408, super.field1787, super.field1783, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Laa;IZI)Lvn;")
    private final class169 method1535(class281 arg0, int arg1, boolean arg2, int arg3) {
        ++field3411;
        class369 var5 = class310.method1961(65535 & this.field3390, (byte) 35);
        class156 var6;
        class156 var7;
        if (!this.field3397) {
            if (~this.field3408 <= -4) {
                var6 = null;
            } else {
                var6 = class156.field2213[this.field3408 - -1];
            }
            var7 = class156.field2213[this.field3408];
        } else {
            var6 = class156.field2213[0];
            var7 = class435.field6248[this.field3408];
        }
        int var8 = -49 / ((76 - arg3) / 32);
        return var5.method2362(super.field1790, var7, 22, arg0, 89, this.field3385, var6, super.field1787, super.field1783, arg2, arg1);
    }

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "(B)V")
    public final void method135(byte arg0) {
        ++field3382;
        this.field3402 = false;
        if (this.field3383 != null) {
            this.field3383.method508(-32769 & this.field3383.method533());
        }
        if (arg0 != -123) {
            this.method134((class281) null, -59, (byte) -64);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)I")
    public final int method126(int arg0) {
        ++field3406;
        return arg0 != -13482 ? 85 : this.field3390 & 65535;
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(I)V")
    public final void method138(int arg0) {
        if (arg0 != -4728) {
            this.method134((class281) null, 48, (byte) 86);
        }
        ++field3381;
        if (this.field3383 != null) {
            this.field3383.method494();
        }
    }

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "(B)V")
    public static final void method1536(byte arg0) {
        if (arg0 <= 20) {
            field3396 = null;
        }
        if (~class339.field4742 > -1) {
            class339.field4742 = 0;
            class35.field545 = -1;
            class165.field2359 = -1;
        }
        ++field3405;
        if (~class42.field648 > ~class339.field4742) {
            class165.field2359 = -1;
            class35.field545 = -1;
            class339.field4742 = class42.field648;
        }
        if (~class448.field6472 > -1) {
            class448.field6472 = 0;
            class165.field2359 = -1;
            class35.field545 = -1;
        }
        if (class42.field646 < class448.field6472) {
            class165.field2359 = -1;
            class35.field545 = -1;
            class448.field6472 = class42.field646;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Laa;IB)Lhc;")
    public final class75 method134(class281 arg0, int arg1, byte arg2) {
        if (arg2 > -25) {
            this.method135((byte) 21);
        }
        ++field3399;
        return this.method1537(arg0, arg1, -1);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIILaa;)Z")
    public final boolean method136(int arg0, int arg1, int arg2, class281 arg3) {
        if (arg0 != 0) {
            field3396 = null;
        }
        ++field3395;
        class75 var5 = this.method1537(arg3, 65536, -1);
        if (var5 != null) {
            class261 var6 = arg3.method1769();
            var6.method882(super.field1787, super.field1790, super.field1783);
            return var5.method516(arg1, arg2, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(B)Z")
    public final boolean method127(byte arg0) {
        ++field3393;
        int var2 = 70 / ((-52 - arg0) / 33);
        return this.field3400;
    }

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "(I)Z")
    public final boolean method137(int arg0) {
        if (arg0 != 0) {
            field3389 = null;
        }
        ++field3379;
        return this.field3402;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Laa;II)Lhc;")
    private final class75 method1537(class281 arg0, int arg1, int arg2) {
        ++field3407;
        if (this.field3383 != null && ~arg0.method1732(this.field3383.method533(), arg1) == -1) {
            return this.field3383;
        } else {
            class169 var4 = this.method1535(arg0, arg1, false, arg2 + -99);
            if (arg2 != -1) {
                return null;
            } else {
                return var4 == null ? null : var4.field2401;
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Laa;Lsk;IIIIZIZ)V")
    public class245(class281 arg0, class369 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, boolean arg8) {
        super(arg3, arg4, arg5, arg1.field5165, arg1.field5227);
        this.field3385 = (byte) arg7;
        this.field3408 = (byte) arg2;
        this.field3390 = (short) arg1.field5204;
        this.field3401 = ~arg1.field5221 != -1 && !arg6;
        super.field1787 = (short) arg3;
        super.field1783 = (short) arg5;
        this.field3397 = arg6;
        this.field3402 = arg8;
        this.field3400 = arg0.method1753() && arg1.field5176 && !this.field3397 && ~class410.field5956 != -1;
        int var10 = 1024;
        if (this.field3402) {
            var10 |= 32768;
        }
        class169 var11 = this.method1535(arg0, var10, this.field3400, 126);
        if (var11 != null) {
            this.field3383 = var11.field2401;
            this.field3404 = var11.field2405;
            if (this.field3402) {
                this.field3383 = this.field3383.method529((byte) 0, var10, false);
                return;
            }
        }
    }
}
