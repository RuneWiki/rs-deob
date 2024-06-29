import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kga")
public class class511 extends class539 implements class310 {

    @OriginalMember(owner = "client!kga", name = "y", descriptor = "Z")
    private boolean field6395;

    @OriginalMember(owner = "client!kga", name = "x", descriptor = "B")
    private byte field6394;

    @OriginalMember(owner = "client!kga", name = "B", descriptor = "Z")
    private boolean field6398;

    @OriginalMember(owner = "client!kga", name = "O", descriptor = "S")
    private short field6411;

    @OriginalMember(owner = "client!kga", name = "F", descriptor = "B")
    private byte field6402;

    @OriginalMember(owner = "client!kga", name = "T", descriptor = "B")
    private byte field6416;

    @OriginalMember(owner = "client!kga", name = "D", descriptor = "Z")
    private boolean field6400;

    @OriginalMember(owner = "client!kga", name = "N", descriptor = "Lw;")
    private class279 field6410;

    @OriginalMember(owner = "client!kga", name = "L", descriptor = "Lba;")
    private class359 field6408;

    @OriginalMember(owner = "client!kga", name = "V", descriptor = "Ldr;")
    public static class675 field6418 = new class675(41, 20);

    @OriginalMember(owner = "client!kga", name = "z", descriptor = "I")
    public static int field6396;

    @OriginalMember(owner = "client!kga", name = "A", descriptor = "I")
    public static int field6397;

    @OriginalMember(owner = "client!kga", name = "C", descriptor = "I")
    public static int field6399;

    @OriginalMember(owner = "client!kga", name = "E", descriptor = "I")
    public static int field6401;

    @OriginalMember(owner = "client!kga", name = "G", descriptor = "I")
    public static int field6403;

    @OriginalMember(owner = "client!kga", name = "H", descriptor = "I")
    public static int field6404;

    @OriginalMember(owner = "client!kga", name = "I", descriptor = "I")
    public static int field6405;

    @OriginalMember(owner = "client!kga", name = "J", descriptor = "I")
    public static int field6406;

    @OriginalMember(owner = "client!kga", name = "K", descriptor = "I")
    public static int field6407;

    @OriginalMember(owner = "client!kga", name = "M", descriptor = "I")
    public static int field6409;

    @OriginalMember(owner = "client!kga", name = "P", descriptor = "I")
    public static int field6412;

    @OriginalMember(owner = "client!kga", name = "Q", descriptor = "I")
    public static int field6413;

    @OriginalMember(owner = "client!kga", name = "R", descriptor = "I")
    public static int field6414;

    @OriginalMember(owner = "client!kga", name = "S", descriptor = "I")
    public static int field6415;

    @OriginalMember(owner = "client!kga", name = "W", descriptor = "I")
    public static int field6419;

    @OriginalMember(owner = "client!kga", name = "U", descriptor = "Lqt;")
    private class595 field6417;

    @OriginalMember(owner = "client!kga", name = "<init>", descriptor = "(Loa;Lpg;IIIIZIIIII)V", line = 6)
    public class511(class650 arg0, class687 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg3, arg4, arg5, arg7, arg8, arg9, class331.method1897(-126, arg11, arg10));
        super.field6793 = arg3;
        this.field6395 = arg6;
        this.field6394 = (byte) arg11;
        this.field6398 = arg1.field9382 != 0 && !arg6;
        super.field6808 = arg5;
        this.field6411 = (short) arg1.field9408;
        this.field6402 = (byte) arg2;
        this.field6416 = (byte) arg10;
        this.field6400 = arg0.method465() && arg1.field9433 && !this.field6395 && ~class611.field8310.method3598(-15929, class628.field8526) != -1;
        class180 var13 = this.method2787(3, 2048, arg0, this.field6400);
        if (var13 != null) {
            this.field6410 = var13.field2118;
            this.field6408 = var13.field2119;
        }
    }

    @OriginalMember(owner = "client!kga", name = "d", descriptor = "(B)I", line = 31)
    public final int method1858(byte arg0) {
        ++field6409;
        if (arg0 <= 6) {
            this.field6411 = -17;
        }
        return this.field6408 == null ? 0 : this.field6408.method2084();
    }

    @OriginalMember(owner = "client!kga", name = "b", descriptor = "(Loa;I)Lqt;", line = 42)
    public final class595 method6(class650 arg0, int arg1) {
        if (this.field6417 == null) {
            this.field6417 = class280.method1688(this.method2786((byte) 108, 0, arg0), super.field6808, -1, super.field6802, super.field6793);
        }
        ++field6399;
        return arg1 != -7459 ? null : this.field6417;
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(Loa;BI)Lba;", line = 58)
    public final class359 method134(class650 arg0, byte arg1, int arg2) {
        ++field6405;
        return arg1 < 80 ? null : this.method2786((byte) 108, arg2, arg0);
    }

    @OriginalMember(owner = "client!kga", name = "e", descriptor = "(B)V", line = 70)
    public static void method2785(byte arg0) {
        field6418 = null;
        if (arg0 <= 110) {
            field6418 = null;
        }
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(BILoa;)Lba;", line = 81)
    private final class359 method2786(byte arg0, int arg1, class650 arg2) {
        ++field6413;
        if (this.field6408 != null && arg2.method493(this.field6408.method2075(), arg1) == 0) {
            return this.field6408;
        } else {
            if (arg0 != 108) {
                this.field6395 = false;
            }
            class180 var4 = this.method2787(3, arg1, arg2, false);
            return var4 == null ? null : var4.field2119;
        }
    }

    @OriginalMember(owner = "client!kga", name = "b", descriptor = "(B)I", line = 103)
    public final int method139(byte arg0) {
        ++field6403;
        if (arg0 <= 13) {
            this.field6411 = 58;
        }
        return this.field6394;
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(Loa;B)V", line = 120)
    public final void method130(class650 arg0, byte arg1) {
        ++field6401;
        Object var3 = null;
        class279 var5;
        if (this.field6410 == null && this.field6400) {
            class180 var4 = this.method2787(3, 262144, arg0, true);
            var5 = var4 == null ? null : var4.field2118;
        } else {
            var5 = this.field6410;
            this.field6410 = null;
        }
        if (arg1 > -27) {
            this.field6395 = false;
        }
        if (var5 != null) {
            class157.method961(var5, this.field6402, super.field6793, super.field6808, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(ILoa;)Lww;", line = 147)
    public final class686 method11(int arg0, class650 arg1) {
        ++field6407;
        if (this.field6408 == null) {
            return null;
        } else {
            class396 var3 = arg1.method470();
            if (arg0 >= -89) {
                this.method8((byte) -112, 116, (class650) null, 65);
            }
            var3.method591(super.field6800 + super.field6793, super.field6802, super.field6808 + super.field6795);
            class686 var4 = null;
            if (this.field6398) {
                var4 = class458.method2520(0, 1);
            }
            this.field6408.method2049(var3, var4 == null ? null : var4.field9361[0], 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(B)I", line = 177)
    public final int method131(byte arg0) {
        if (arg0 != -97) {
            this.field6416 = 43;
        }
        ++field6415;
        return this.field6411 & 65535;
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(Loa;I)V", line = 188)
    public final void method136(class650 arg0, int arg1) {
        ++field6406;
        int var3 = 78 / ((arg1 - -78) / 37);
        Object var4 = null;
        class279 var6;
        if (this.field6410 == null && this.field6400) {
            class180 var5 = this.method2787(3, 262144, arg0, true);
            var6 = var5 != null ? var5.field2118 : null;
        } else {
            var6 = this.field6410;
            this.field6410 = null;
        }
        if (var6 != null) {
            class350.method2017(var6, this.field6402, super.field6793, super.field6808, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(BILoa;I)Z", line = 216)
    public final boolean method8(byte arg0, int arg1, class650 arg2, int arg3) {
        ++field6396;
        int var5 = -113 / ((arg0 - 77) / 40);
        class359 var6 = this.method2786((byte) 108, 131072, arg2);
        if (var6 != null) {
            class396 var7 = arg2.method470();
            var7.method591(super.field6793, super.field6802, super.field6808);
            return var6.method2074(arg3, arg1, var7, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(IILoa;Z)Lm;", line = 239)
    private final class180 method2787(int arg0, int arg1, class650 arg2, boolean arg3) {
        if (arg0 != 3) {
            this.field6394 = -39;
        }
        ++field6412;
        class687 var5 = class232.field3017.method2358(0, 65535 & this.field6411);
        class140 var6;
        class140 var7;
        if (this.field6395) {
            var6 = class286.field3633[this.field6402];
            var7 = class252.field3250[0];
        } else {
            if (this.field6402 >= 3) {
                var7 = null;
            } else {
                var7 = class252.field3250[this.field6402 + 1];
            }
            var6 = class252.field3250[this.field6402];
        }
        return var5.method3786(var7, super.field6808, this.field6394, true, super.field6793, arg1, var6, super.field6802, this.field6416, arg3, arg2);
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(Z)Z", line = 269)
    public final boolean method133(boolean arg0) {
        ++field6397;
        if (arg0) {
            this.field6408 = null;
        }
        return this.field6400;
    }

    @OriginalMember(owner = "client!kga", name = "b", descriptor = "(Loa;B)V", line = 280)
    public final void method7(class650 arg0, byte arg1) {
        if (arg1 != 98) {
            this.method132(-4);
        }
        ++field6419;
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(I)V", line = 292)
    public final void method132(int arg0) {
        ++field6414;
        if (arg0 == -13968) {
            if (this.field6408 != null) {
                this.field6408.method2090();
            }
        }
    }

    @OriginalMember(owner = "client!kga", name = "b", descriptor = "(I)I", line = 311)
    public final int method138(int arg0) {
        if (arg0 != 8470) {
            this.method6((class650) null, -110);
        }
        ++field6404;
        return this.field6416;
    }
}
