import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class246 extends class402 {

    @OriginalMember(owner = "client!mg", name = "u", descriptor = "I")
    private int field3647 = 0;

    @OriginalMember(owner = "client!mg", name = "C", descriptor = "Llk;")
    private class638 field3655 = new class638(16);

    @OriginalMember(owner = "client!mg", name = "M", descriptor = "I")
    private int field3665 = 0;

    @OriginalMember(owner = "client!mg", name = "J", descriptor = "Lv;")
    private class165 field3662 = new class165();

    @OriginalMember(owner = "client!mg", name = "N", descriptor = "J")
    private long field3666 = 0L;

    @OriginalMember(owner = "client!mg", name = "A", descriptor = "I")
    private int field3653;

    @OriginalMember(owner = "client!mg", name = "H", descriptor = "Lpn;")
    private class327 field3660;

    @OriginalMember(owner = "client!mg", name = "I", descriptor = "Z")
    private boolean field3661;

    @OriginalMember(owner = "client!mg", name = "K", descriptor = "Lv;")
    private class165 field3663;

    @OriginalMember(owner = "client!mg", name = "n", descriptor = "Lpn;")
    private class327 field3640;

    @OriginalMember(owner = "client!mg", name = "O", descriptor = "Z")
    private boolean field3667;

    @OriginalMember(owner = "client!mg", name = "B", descriptor = "Ldu;")
    private class424 field3654;

    @OriginalMember(owner = "client!mg", name = "r", descriptor = "Leda;")
    private class133 field3644;

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "[B")
    private byte[] field3635;

    @OriginalMember(owner = "client!mg", name = "z", descriptor = "I")
    private int field3652;

    @OriginalMember(owner = "client!mg", name = "w", descriptor = "I")
    private int field3649;

    @OriginalMember(owner = "client!mg", name = "t", descriptor = "Lsr;")
    private class637 field3646;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "[I")
    public static int[] field3633 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!mg", name = "p", descriptor = "Z")
    public static boolean field3642 = false;

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "I")
    public static int field3636;

    @OriginalMember(owner = "client!mg", name = "k", descriptor = "I")
    public static int field3637;

    @OriginalMember(owner = "client!mg", name = "l", descriptor = "I")
    public static int field3638;

    @OriginalMember(owner = "client!mg", name = "m", descriptor = "I")
    public static int field3639;

    @OriginalMember(owner = "client!mg", name = "o", descriptor = "I")
    public static int field3641;

    @OriginalMember(owner = "client!mg", name = "s", descriptor = "I")
    public static int field3645;

    @OriginalMember(owner = "client!mg", name = "v", descriptor = "I")
    public static int field3648;

    @OriginalMember(owner = "client!mg", name = "x", descriptor = "I")
    public static int field3650;

    @OriginalMember(owner = "client!mg", name = "y", descriptor = "I")
    public static int field3651;

    @OriginalMember(owner = "client!mg", name = "D", descriptor = "I")
    public static int field3656;

    @OriginalMember(owner = "client!mg", name = "E", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!mg", name = "F", descriptor = "I")
    public static int field3658;

    @OriginalMember(owner = "client!mg", name = "G", descriptor = "I")
    public static int field3659;

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "Loga;")
    private class178 field3634;

    @OriginalMember(owner = "client!mg", name = "L", descriptor = "Z")
    private boolean field3664;

    @OriginalMember(owner = "client!mg", name = "q", descriptor = "[B")
    private byte[] field3643;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V", line = 11)
    public final void method1646(int arg0) {
        field3657++;
        if (this.field3660 == null) {
            return;
        }
        this.field3664 = true;
        if (arg0 != 26533) {
            this.field3634 = null;
        }
        if (this.field3663 == null) {
            this.field3663 = new class165();
        }
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(B)Loga;", line = 33)
    public final class178 method1647(byte arg0) {
        field3648++;
        if (this.field3634 != null) {
            return this.field3634;
        }
        if (this.field3646 == null) {
            if (this.field3654.method2562(arg0 ^ 0x9)) {
                return null;
            }
            this.field3646 = this.field3654.method2555(true, (byte) 0, this.field3653, 4, 255);
        }
        if (this.field3646.field8952) {
            return null;
        }
        byte[] var2 = this.field3646.method2735(arg0 + 71);
        if (this.field3646 instanceof class738) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field3634 = new class178(var2, this.field3652, this.field3635);
                if (this.field3634.field2256 != this.field3649) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field3634 = null;
                if (this.field3654.method2562(20)) {
                    this.field3646 = null;
                } else {
                    this.field3646 = this.field3654.method2555(true, (byte) 0, this.field3653, 4, 255);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field3634 = new class178(var2, this.field3652, this.field3635);
            } catch (RuntimeException var4) {
                this.field3654.method2561(1);
                this.field3634 = null;
                if (this.field3654.method2562(20)) {
                    this.field3646 = null;
                } else {
                    this.field3646 = this.field3654.method2555(true, (byte) 0, this.field3653, 4, 255);
                }
                return null;
            }
            if (this.field3640 != null) {
                this.field3644.method897(this.field3653, 2, this.field3640, var2);
            }
        }
        this.field3646 = null;
        if (this.field3660 != null) {
            this.field3647 = 0;
            this.field3643 = new byte[this.field3634.field2251];
        }
        if (arg0 != 29) {
            this.field3661 = true;
        }
        return this.field3634;
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)V", line = 131)
    public final void method1648(int arg0) {
        field3637++;
        if (this.field3663 == null || this.method1647((byte) 29) == null || arg0 != -16033) {
            return;
        }
        for (class69 var2 = this.field3662.method1041(1048832); var2 != null; var2 = this.field3662.method1033(-1)) {
            int var3 = (int) var2.field762;
            if (var3 < 0 || var3 >= this.field3634.field2251 || this.field3634.field2255[var3] == 0) {
                var2.method527(-11229);
            } else {
                if (this.field3643[var3] == 0) {
                    this.method1651(1, (byte) -38, var3);
                }
                if (this.field3643[var3] == -1) {
                    this.method1651(2, (byte) -38, var3);
                }
                if (this.field3643[var3] == 1) {
                    var2.method527(-11229);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(BI)V", line = 178)
    public final void method1649(byte arg0, int arg1) {
        field3636++;
        if (this.field3660 == null) {
            return;
        }
        for (class69 var3 = this.field3662.method1041(1048832); var3 != null; var3 = this.field3662.method1033(-1)) {
            if (((long) arg1) == var3.field762) {
                return;
            }
        }
        class69 var4 = new class69();
        int var5 = 95 % ((5 - arg0) / 48);
        var4.field762 = arg1;
        this.field3662.method1039(var4, 0);
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(I)I", line = 206)
    public final int method1650(int arg0) {
        field3659++;
        if (this.field3634 == null) {
            return 0;
        } else if (this.field3661) {
            class69 var2 = this.field3663.method1041(1048832);
            if (var2 == null) {
                return 0;
            } else {
                if (arg0 >= -126) {
                    this.field3663 = null;
                }
                return (int) var2.field762;
            }
        } else {
            return this.field3634.field2243;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IBI)Lsr;", line = 230)
    private final class637 method1651(int arg0, byte arg1, int arg2) {
        field3651++;
        class637 var4 = (class637) this.field3655.method3669(false, (long) arg2);
        if (var4 != null && arg0 == 0 && !var4.field8954 && var4.field8952) {
            var4.method527(-11229);
            var4 = null;
        }
        if (var4 == null) {
            if (arg0 == 0) {
                if (this.field3660 == null || this.field3643[arg2] == -1) {
                    if (this.field3654.method2562(arg1 ^ 0xFFFFFFCE)) {
                        return null;
                    }
                    var4 = this.field3654.method2555(true, (byte) 2, arg2, arg1 + 42, this.field3653);
                } else {
                    var4 = this.field3644.method899(-32084, arg2, this.field3660);
                }
            } else if (arg0 == 1) {
                if (this.field3660 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field3644.method896(arg2, (byte) 105, this.field3660);
            } else if (arg0 == 2) {
                if (this.field3660 == null) {
                    throw new RuntimeException();
                }
                if (this.field3643[arg2] != -1) {
                    throw new RuntimeException();
                }
                if (this.field3654.method2548(20)) {
                    return null;
                }
                var4 = this.field3654.method2555(false, (byte) 2, arg2, 4, this.field3653);
            } else {
                throw new RuntimeException();
            }
            this.field3655.method3666((byte) 65, (long) arg2, var4);
        }
        if (var4.field8952) {
            return null;
        }
        if (arg1 != -38) {
            this.field3662 = null;
        }
        byte[] var5 = var4.method2735(arg1 + 138);
        if (!(var4 instanceof class738)) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class31.field300.reset();
                class31.field300.update(var5, 0, var5.length - 2);
                int var6 = (int) class31.field300.getValue();
                if (this.field3634.field2257[arg2] != var6) {
                    throw new RuntimeException();
                }
                if (this.field3634.field2240 != null && this.field3634.field2240[arg2] != null) {
                    byte[] var7 = this.field3634.field2240[arg2];
                    byte[] var8 = class353.method2222(var5.length - 2, 0, arg1 ^ 0xFFFFFF9A, var5);
                    for (int var9 = 0; var9 < 64; var9++) {
                        if (var7[var9] != var8[var9]) {
                            throw new RuntimeException();
                        }
                    }
                }
                this.field3654.field5909 = 0;
                this.field3654.field5908 = 0;
            } catch (RuntimeException var17) {
                this.field3654.method2561(arg1 ^ 0xFFFFFFDB);
                var4.method527(arg1 - 11191);
                if (var4.field8954 && !this.field3654.method2562(20)) {
                    class454 var10 = this.field3654.method2555(true, (byte) 2, arg2, 4, this.field3653);
                    this.field3655.method3666((byte) 65, (long) arg2, var10);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field3634.field2248[arg2] >>> 8);
            var5[var5.length - 1] = (byte) this.field3634.field2248[arg2];
            if (this.field3660 != null) {
                this.field3644.method897(arg2, arg1 ^ 0xFFFFFFD8, this.field3660, var5);
                if (this.field3643[arg2] != 1) {
                    this.field3647++;
                    this.field3643[arg2] = 1;
                }
            }
            if (!var4.field8954) {
                var4.method527(-11229);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class31.field300.reset();
            class31.field300.update(var5, 0, var5.length - 2);
            int var11 = (int) class31.field300.getValue();
            if (this.field3634.field2257[arg2] != var11) {
                throw new RuntimeException();
            }
            if (this.field3634.field2240 != null && this.field3634.field2240[arg2] != null) {
                byte[] var12 = this.field3634.field2240[arg2];
                byte[] var13 = class353.method2222(var5.length - 2, 0, 64, var5);
                for (int var14 = 0; var14 < 64; var14++) {
                    if (var12[var14] != var13[var14]) {
                        throw new RuntimeException();
                    }
                }
            }
            int var15 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field3634.field2248[arg2] & 0xFFFF) != var15) {
                throw new RuntimeException();
            }
            if (this.field3643[arg2] != 1) {
                this.field3647++;
                this.field3643[arg2] = 1;
            }
            if (!var4.field8954) {
                var4.method527(-11229);
            }
            return var4;
        } catch (Exception var18) {
            this.field3643[arg2] = -1;
            var4.method527(-11229);
            if (var4.field8954 && !this.field3654.method2562(20)) {
                class454 var16 = this.field3654.method2555(true, (byte) 2, arg2, arg1 ^ 0xFFFFFFDE, this.field3653);
                this.field3655.method3666((byte) 65, (long) arg2, var16);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "(I)V", line = 490)
    public static void method1652(int arg0) {
        if (arg0 == 2) {
            field3633 = null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(B)V", line = 506)
    public final void method1653(byte arg0) {
        field3638++;
        int var2 = 104 % ((arg0 + 50) / 59);
        if (this.field3663 != null) {
            if (this.method1647((byte) 29) == null) {
                return;
            }
            if (this.field3661) {
                boolean var7 = true;
                for (class69 var8 = this.field3663.method1041(1048832); var8 != null; var8 = this.field3663.method1033(-1)) {
                    int var10 = (int) var8.field762;
                    if (this.field3643[var10] == 0) {
                        this.method1651(1, (byte) -38, var10);
                    }
                    if (this.field3643[var10] == 0) {
                        var7 = false;
                    } else {
                        var8.method527(-11229);
                    }
                }
                while (this.field3665 < this.field3634.field2255.length) {
                    if (this.field3634.field2255[this.field3665] == 0) {
                        this.field3665++;
                    } else {
                        if (this.field3644.field1708 >= 250) {
                            var7 = false;
                            break;
                        }
                        if (this.field3643[this.field3665] == 0) {
                            this.method1651(1, (byte) -38, this.field3665);
                        }
                        if (this.field3643[this.field3665] == 0) {
                            class69 var9 = new class69();
                            var9.field762 = this.field3665;
                            var7 = false;
                            this.field3663.method1039(var9, 0);
                        }
                        this.field3665++;
                    }
                }
                if (var7) {
                    this.field3661 = false;
                    this.field3665 = 0;
                }
            } else if (this.field3664) {
                boolean var3 = true;
                for (class69 var4 = this.field3663.method1041(1048832); var4 != null; var4 = this.field3663.method1033(-1)) {
                    int var6 = (int) var4.field762;
                    if (this.field3643[var6] != 1) {
                        this.method1651(2, (byte) -38, var6);
                    }
                    if (this.field3643[var6] == 1) {
                        var4.method527(-11229);
                    } else {
                        var3 = false;
                    }
                }
                while (this.field3634.field2255.length > this.field3665) {
                    if (this.field3634.field2255[this.field3665] == 0) {
                        this.field3665++;
                    } else {
                        if (this.field3654.method2548(20)) {
                            var3 = false;
                            break;
                        }
                        if (this.field3643[this.field3665] != 1) {
                            this.method1651(2, (byte) -38, this.field3665);
                        }
                        if (this.field3643[this.field3665] != 1) {
                            class69 var5 = new class69();
                            var5.field762 = this.field3665;
                            var3 = false;
                            this.field3663.method1039(var5, 0);
                        }
                        this.field3665++;
                    }
                }
                if (var3) {
                    this.field3664 = false;
                    this.field3665 = 0;
                }
            } else {
                this.field3663 = null;
            }
        }
        if (!this.field3667 || class683.method3903((byte) 4) < this.field3666) {
            return;
        }
        for (class637 var11 = (class637) this.field3655.method3668(-108); var11 != null; var11 = (class637) this.field3655.method3667((byte) 91)) {
            if (!var11.field8952) {
                if (var11.field8951) {
                    if (!var11.field8954) {
                        throw new RuntimeException();
                    }
                    var11.method527(-11229);
                } else {
                    var11.field8951 = true;
                }
            }
        }
        this.field3666 = class683.method3903((byte) 4) + 1000L;
    }

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "(I)I", line = 685)
    public final int method1654(int arg0) {
        field3656++;
        if (this.field3634 == null) {
            return 0;
        } else {
            int var2 = 14 / ((arg0 + 8) / 52);
            return this.field3634.field2243;
        }
    }

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "(I)I", line = 705)
    public final int method1655(int arg0) {
        if (arg0 >= -30) {
            this.method1648(-105);
        }
        field3639++;
        if (this.method1647((byte) 29) == null) {
            return this.field3646 == null ? 0 : this.field3646.method2736((byte) 123);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lpq;IIII)Liq;", line = 727)
    public static final class227 method1656(class194 arg0, int arg1, int arg2, int arg3, int arg4) {
        field3650++;
        if (arg3 != 34037) {
            return null;
        } else if (!arg0.field2735 && (!class65.method506(arg2, arg3 ^ 0xF21D) || !class65.method506(arg1, 30440))) {
            return arg0.field2736 ? new class227(arg0, 34037, arg4, arg2, arg1) : new class227(arg0, arg4, arg2, arg1, class179.method1142(arg2, arg3 - 33940), class179.method1142(arg1, -127));
        } else {
            return new class227(arg0, 3553, arg4, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(II)I", line = 750)
    public final int method1657(int arg0, int arg1) {
        if (arg0 != 0) {
            this.method1658(-29);
        }
        field3641++;
        class637 var3 = (class637) this.field3655.method3669(false, (long) arg1);
        return var3 == null ? 0 : var3.method2736((byte) 123);
    }

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "(I)I", line = 767)
    public final int method1658(int arg0) {
        if (arg0 != -26984) {
            this.field3647 = 124;
        }
        field3658++;
        return this.field3647;
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(ILpn;Lpn;Ldu;Leda;I[BIZ)V", line = 826)
    public class246(int arg0, class327 arg1, class327 arg2, class424 arg3, class133 arg4, int arg5, byte[] arg6, int arg7, boolean arg8) {
        this.field3653 = arg0;
        this.field3660 = arg1;
        if (this.field3660 == null) {
            this.field3661 = false;
        } else {
            this.field3661 = true;
            this.field3663 = new class165();
        }
        this.field3640 = arg2;
        this.field3667 = arg8;
        this.field3654 = arg3;
        this.field3644 = arg4;
        this.field3635 = arg6;
        this.field3652 = arg5;
        this.field3649 = arg7;
        if (this.field3640 != null) {
            this.field3646 = this.field3644.method899(-32084, this.field3653, this.field3640);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IB)[B", line = 783)
    public final byte[] method1659(int arg0, byte arg1) {
        field3645++;
        class637 var3 = this.method1651(0, (byte) -38, arg0);
        if (var3 == null) {
            return null;
        }
        byte[] var4 = var3.method2735(100);
        var3.method527(-11229);
        if (arg1 < 61) {
            this.method1657(-30, 22);
        }
        return var4;
    }
}
