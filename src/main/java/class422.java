import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class422 extends class279 implements class448 {

    @OriginalMember(owner = "client!kq", name = "fb", descriptor = "S")
    private short field6142;

    @OriginalMember(owner = "client!kq", name = "S", descriptor = "Z")
    private boolean field6129;

    @OriginalMember(owner = "client!kq", name = "eb", descriptor = "B")
    private byte field6141;

    @OriginalMember(owner = "client!kq", name = "G", descriptor = "Z")
    private boolean field6118;

    @OriginalMember(owner = "client!kq", name = "X", descriptor = "Z")
    private boolean field6134;

    @OriginalMember(owner = "client!kq", name = "jb", descriptor = "B")
    private byte field6146;

    @OriginalMember(owner = "client!kq", name = "ab", descriptor = "B")
    private byte field6137;

    @OriginalMember(owner = "client!kq", name = "W", descriptor = "Z")
    private boolean field6133;

    @OriginalMember(owner = "client!kq", name = "P", descriptor = "Li;")
    private class31 field6126;

    @OriginalMember(owner = "client!kq", name = "Y", descriptor = "Le;")
    public class373 field6135;

    @OriginalMember(owner = "client!kq", name = "lb", descriptor = "Lho;")
    public static class103 field6148 = new class103(61, 2);

    @OriginalMember(owner = "client!kq", name = "ob", descriptor = "F")
    public static float field6151;

    @OriginalMember(owner = "client!kq", name = "H", descriptor = "I")
    public static int field6119;

    @OriginalMember(owner = "client!kq", name = "I", descriptor = "I")
    public static int field6120;

    @OriginalMember(owner = "client!kq", name = "J", descriptor = "I")
    public static int field6121;

    @OriginalMember(owner = "client!kq", name = "K", descriptor = "I")
    public static int field6122;

    @OriginalMember(owner = "client!kq", name = "L", descriptor = "I")
    public static int field6123;

    @OriginalMember(owner = "client!kq", name = "N", descriptor = "I")
    public static int field6124;

    @OriginalMember(owner = "client!kq", name = "O", descriptor = "I")
    public static int field6125;

    @OriginalMember(owner = "client!kq", name = "Q", descriptor = "I")
    public static int field6127;

    @OriginalMember(owner = "client!kq", name = "R", descriptor = "I")
    public static int field6128;

    @OriginalMember(owner = "client!kq", name = "T", descriptor = "I")
    public static int field6130;

    @OriginalMember(owner = "client!kq", name = "U", descriptor = "I")
    public static int field6131;

    @OriginalMember(owner = "client!kq", name = "V", descriptor = "I")
    public static int field6132;

    @OriginalMember(owner = "client!kq", name = "Z", descriptor = "I")
    public static int field6136;

    @OriginalMember(owner = "client!kq", name = "bb", descriptor = "I")
    public static int field6138;

    @OriginalMember(owner = "client!kq", name = "cb", descriptor = "I")
    public static int field6139;

    @OriginalMember(owner = "client!kq", name = "db", descriptor = "I")
    public static int field6140;

    @OriginalMember(owner = "client!kq", name = "gb", descriptor = "I")
    public static int field6143;

    @OriginalMember(owner = "client!kq", name = "hb", descriptor = "I")
    public static int field6144;

    @OriginalMember(owner = "client!kq", name = "ib", descriptor = "I")
    public static int field6145;

    @OriginalMember(owner = "client!kq", name = "kb", descriptor = "I")
    public static int field6147;

    @OriginalMember(owner = "client!kq", name = "nb", descriptor = "I")
    public static int field6150;

    @OriginalMember(owner = "client!kq", name = "mb", descriptor = "Lml;")
    public static class266 field6149;

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "(BLza;)Luc;", line = 4)
    public final class23 method50(byte arg0, class287 arg1) {
        ++field6136;
        if (arg0 != -112) {
            this.field6135 = null;
        }
        if (this.field6135 == null) {
            return null;
        } else {
            class124 var3 = arg1.method1183();
            var3.method743(super.field3704, super.field3700, super.field3694);
            class23 var4 = null;
            if (this.field6129) {
                var4 = class117.method703(1, 39);
            }
            this.field6135.method2051(var3, var4 == null ? null : var4.field226[0], 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(ILza;)V", line = 32)
    public final void method44(int arg0, class287 arg1) {
        ++field6122;
        Object var3 = null;
        if (arg0 <= 122) {
            this.field6126 = null;
        }
        class31 var5;
        if (this.field6126 == null && this.field6133) {
            class190 var4 = this.method2605(arg1, true, -2635, 262144);
            var5 = var4 == null ? null : var4.field2454;
        } else {
            var5 = this.field6126;
            this.field6126 = null;
        }
        if (var5 != null) {
            class488.method2957(var5, this.field6137, super.field3704, super.field3694, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IBLza;)Le;", line = 62)
    public final class373 method39(int arg0, byte arg1, class287 arg2) {
        ++field6121;
        if (arg1 != -54) {
            this.field6137 = 46;
        }
        return this.method2607(arg0, arg2, (byte) 23);
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIII)V", line = 73)
    public static final void method2603(int arg0, int arg1, int arg2, int arg3) {
        int var4 = -71 % ((arg1 - -67) / 56);
        ++field6120;
        int var5 = class319.field4256.field4655 * arg2 >> 8;
        if (~arg0 == 0 && !class401.field5809) {
            class462.method2837(1);
        } else if (~arg0 != 0 && (class43.field460 != arg0 || !class390.method2359((byte) 24)) && ~var5 != -1 && !class401.field5809) {
            class300.method1792(var5, arg3, class96.field1214, 0, 26313, arg0, false);
        }
        class43.field460 = arg0;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(I)V", line = 98)
    public final void method45(int arg0) {
        ++field6127;
        if (this.field6135 != null) {
            this.field6135.method2013();
        }
        if (arg0 != 9479) {
            field6149 = null;
        }
    }

    @OriginalMember(owner = "client!kq", name = "g", descriptor = "(I)I", line = 113)
    public final int method2604(int arg0) {
        ++field6147;
        if (arg0 != 15) {
            this.field6142 = -118;
        }
        return this.field6135 != null ? this.field6135.method2028() / 4 : 15;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(ILza;BI)Z", line = 132)
    public final boolean method37(int arg0, class287 arg1, byte arg2, int arg3) {
        ++field6131;
        class373 var5 = this.method2607(131072, arg1, (byte) 23);
        if (arg2 > -64) {
            this.method38((byte) 54);
        }
        if (var5 != null) {
            class124 var6 = arg1.method1183();
            var6.method743(super.field3704, super.field3700, super.field3694);
            return var5.method2026(arg3, arg0, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "(B)Z", line = 153)
    public final boolean method38(byte arg0) {
        if (arg0 != -89) {
            this.method2607(-53, (class287) null, (byte) -53);
        }
        ++field6124;
        return this.field6133;
    }

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "(BLza;)V", line = 164)
    public final void method36(byte arg0, class287 arg1) {
        if (arg0 >= -120) {
            this.method38((byte) -104);
        }
        ++field6128;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lza;ZII)Luu;", line = 178)
    private final class190 method2605(class287 arg0, boolean arg1, int arg2, int arg3) {
        ++field6143;
        class70 var5 = class123.field1593.method2920(65535 & this.field6142, 19219);
        class38 var6;
        class38 var7;
        if (this.field6118) {
            var6 = class378.field5470[this.field6137];
            var7 = class14.field152[0];
        } else {
            var6 = class14.field152[this.field6137];
            if (~this.field6137 <= -4) {
                var7 = null;
            } else {
                var7 = class14.field152[this.field6137 + 1];
            }
        }
        return arg2 != -2635 ? null : var5.method416(0, var6, arg3, arg1, this.field6146 != 11 ? this.field6146 : 10, super.field3694, var7, super.field3700, arg0, super.field3704, ~this.field6146 == -12 ? 4 - -this.field6141 : this.field6141);
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIIZILot;Lza;)V", line = 208)
    public final void method40(int arg0, int arg1, int arg2, boolean arg3, int arg4, class419 arg5, class287 arg6) {
        ++field6123;
        int var8 = 24 % ((arg0 - 61) / 47);
        if (!(arg5 instanceof class249)) {
            if (arg5 instanceof class422) {
                class422 var9 = (class422) arg5;
                if (this.field6135 != null && var9.field6135 != null) {
                    this.field6135.method2049(var9.field6135, arg4, arg2, arg1, arg3);
                    return;
                }
            }
        } else {
            class249 var10 = (class249) arg5;
            if (this.field6135 == null || var10.field3300 == null) {
                return;
            }
            this.field6135.method2049(var10.field3300, arg4, arg2, arg1, arg3);
        }
    }

    @OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(Lza;Ler;IIIIIZIIIIIIZ)V", line = 240)
    public class422(class287 arg0, class70 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field836 == 1, class252.method1559(arg12, -9954, arg13));
        this.field6142 = (short) arg1.field834;
        this.field6129 = ~arg1.field886 != -1 && !arg7;
        this.field6141 = (byte) arg13;
        this.field6118 = arg7;
        this.field6134 = arg14;
        this.field6146 = (byte) arg12;
        this.field6137 = (byte) arg3;
        this.field6133 = arg0.method1129() && arg1.field820 && !this.field6118 && ~class319.field4256.method2058(class20.field183, 1) != -1;
        int var16 = 2048;
        if (this.field6134) {
            var16 |= 65536;
        }
        class190 var17 = this.method2605(arg0, this.field6133, -2635, var16);
        if (var17 != null) {
            this.field6126 = var17.field2454;
            this.field6135 = var17.field2455;
            if (this.field6134) {
                this.field6135 = this.field6135.method2027((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "(I)I", line = 273)
    public final int method47(int arg0) {
        ++field6144;
        return arg0 != -15774 ? 77 : this.field6141;
    }

    @OriginalMember(owner = "client!kq", name = "h", descriptor = "(I)V", line = 284)
    public static final void method2606(int arg0) {
        ++field6130;
        if (arg0 != 28346) {
            field6149 = null;
        }
        class209.method1326(true);
        class60.field699 = null;
        class253.field3372 = null;
        class525.field7728 = null;
        class275.field3657 = null;
        class275.field3667 = null;
    }

    @OriginalMember(owner = "client!kq", name = "d", descriptor = "(B)V", line = 300)
    public final void method42(byte arg0) {
        this.field6134 = false;
        if (arg0 == 92) {
            ++field6145;
            if (this.field6135 != null) {
                this.field6135.method2034(-65537 & this.field6135.method2025());
            }
        }
    }

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "(B)Z", line = 315)
    public final boolean method41(byte arg0) {
        ++field6125;
        if (arg0 != -62) {
            this.field6133 = true;
        }
        return this.field6134;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(ILza;B)Le;", line = 329)
    private final class373 method2607(int arg0, class287 arg1, byte arg2) {
        ++field6140;
        if (this.field6135 != null && arg1.method1191(this.field6135.method2025(), arg0) == 0) {
            return this.field6135;
        } else {
            if (arg2 != 23) {
                field6149 = null;
            }
            class190 var4 = this.method2605(arg1, false, -2635, arg0);
            return var4 == null ? null : var4.field2455;
        }
    }

    @OriginalMember(owner = "client!kq", name = "e", descriptor = "(I)I", line = 349)
    public final int method132(int arg0) {
        if (arg0 >= -103) {
            return 27;
        } else {
            ++field6132;
            return this.field6135 != null ? this.field6135.method2041() : 0;
        }
    }

    @OriginalMember(owner = "client!kq", name = "i", descriptor = "(I)V", line = 367)
    public static void method2608(int arg0) {
        if (arg0 != 0) {
            method2608(-17);
        }
        field6148 = null;
        field6149 = null;
    }

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "(I)I", line = 378)
    public final int method46(int arg0) {
        ++field6139;
        int var2 = 35 / ((arg0 - -18) / 42);
        return 65535 & this.field6142;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(BLza;)V", line = 389)
    public final void method49(byte arg0, class287 arg1) {
        if (arg0 == -56) {
            ++field6138;
            Object var3 = null;
            class31 var5;
            if (this.field6126 == null && this.field6133) {
                class190 var4 = this.method2605(arg1, true, -2635, 262144);
                var5 = var4 != null ? var4.field2454 : null;
            } else {
                var5 = this.field6126;
                this.field6126 = null;
            }
            if (var5 != null) {
                class378.method2312(var5, this.field6137, super.field3704, super.field3694, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(B)I", line = 417)
    public final int method48(byte arg0) {
        ++field6119;
        if (arg0 != -70) {
            this.method2605((class287) null, true, 32, 120);
        }
        return this.field6146;
    }
}
