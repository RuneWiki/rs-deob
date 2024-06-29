import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class580 {

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "B")
    public byte field7703 = 0;

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "Z")
    public boolean field7701 = false;

    @OriginalMember(owner = "client!tl", name = "p", descriptor = "I")
    private int field7715 = 0;

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "I")
    private int field7702 = -1;

    @OriginalMember(owner = "client!tl", name = "j", descriptor = "I")
    private int field7709 = 128;

    @OriginalMember(owner = "client!tl", name = "v", descriptor = "I")
    private int field7721 = 128;

    @OriginalMember(owner = "client!tl", name = "x", descriptor = "I")
    public int field7723 = -1;

    @OriginalMember(owner = "client!tl", name = "y", descriptor = "I")
    private int field7724 = 0;

    @OriginalMember(owner = "client!tl", name = "s", descriptor = "I")
    private int field7718 = 0;

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "I")
    public static int field7704 = 0;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "I")
    private int field7700;

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "I")
    public static int field7705;

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "I")
    public static int field7706;

    @OriginalMember(owner = "client!tl", name = "i", descriptor = "I")
    public static int field7708;

    @OriginalMember(owner = "client!tl", name = "k", descriptor = "I")
    public int field7710;

    @OriginalMember(owner = "client!tl", name = "n", descriptor = "I")
    public static int field7713;

    @OriginalMember(owner = "client!tl", name = "o", descriptor = "I")
    public static int field7714;

    @OriginalMember(owner = "client!tl", name = "r", descriptor = "I")
    public static int field7717;

    @OriginalMember(owner = "client!tl", name = "t", descriptor = "I")
    public static int field7719;

    @OriginalMember(owner = "client!tl", name = "w", descriptor = "I")
    public static int field7722;

    @OriginalMember(owner = "client!tl", name = "u", descriptor = "Lpw;")
    public class662 field7720;

    @OriginalMember(owner = "client!tl", name = "h", descriptor = "[S")
    private short[] field7707;

    @OriginalMember(owner = "client!tl", name = "l", descriptor = "[S")
    private short[] field7711;

    @OriginalMember(owner = "client!tl", name = "m", descriptor = "[S")
    private short[] field7712;

    @OriginalMember(owner = "client!tl", name = "q", descriptor = "[S")
    private short[] field7716;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ZLoa;Ld;BIILd;ILuc;IIII)Lba;")
    public final class358 method3180(boolean arg0, class651 arg1, class139 arg2, byte arg3, int arg4, int arg5, class139 arg6, int arg7, class27 arg8, int arg9, int arg10, int arg11, int arg12) {
        if (arg3 < 27) {
            this.method3185(-102, null, 71, true, null, -85, 113, 45, null, null, 20, (byte) -56, -65, 67);
        }
        field7717++;
        return this.method3185(arg5, arg2, arg7, arg0, arg8, arg9, arg11, arg4, arg1, arg6, arg12, (byte) 2, arg10, 0);
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Leh;I)V")
    public final void method3181(class335 arg0, int arg1) {
        field7708++;
        if (arg1 != -11894) {
            return;
        }
        while (true) {
            int var3 = arg0.method2034(255);
            if (var3 == 0) {
                return;
            }
            this.method3184(var3, 16, arg0);
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Luc;ILoa;IIII)Lba;")
    public final class358 method3182(class27 arg0, int arg1, class651 arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 <= 122) {
            method3187(-26, 22, -59);
        }
        field7714++;
        return this.method3185(0, null, arg1, false, arg0, arg5, 0, arg6, arg2, null, arg3, (byte) 5, 0, 0);
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILuc;IIIILoa;)Lba;")
    public final class358 method3183(int arg0, class27 arg1, int arg2, int arg3, int arg4, int arg5, class651 arg6) {
        field7719++;
        if (arg2 != 1) {
            this.method3183(-2, null, 26, 34, -127, 127, null);
        }
        return this.method3185(0, null, arg5, false, arg1, arg3, 0, arg0, arg6, null, arg4, (byte) 2, 0, 0);
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IILeh;)V")
    private final void method3184(int arg0, int arg1, class335 arg2) {
        if (arg0 == 1) {
            this.field7700 = arg2.method2001((byte) -83);
        } else if (arg0 == 2) {
            this.field7723 = arg2.method2001((byte) -83);
        } else if (arg0 == 4) {
            this.field7721 = arg2.method2001((byte) -83);
        } else if (arg0 == 5) {
            this.field7709 = arg2.method2001((byte) -83);
        } else if (arg0 == 6) {
            this.field7718 = arg2.method2001((byte) -83);
        } else if (arg0 == 7) {
            this.field7724 = arg2.method2034(arg1 ^ 0xEF);
        } else if (arg0 == 8) {
            this.field7715 = arg2.method2034(255);
        } else if (arg0 == 9) {
            this.field7702 = 8224;
            this.field7703 = 3;
        } else if (arg0 == 10) {
            this.field7701 = true;
        } else if (arg0 == 11) {
            this.field7703 = 1;
        } else if (arg0 == 12) {
            this.field7703 = 4;
        } else if (arg0 == 13) {
            this.field7703 = 5;
        } else if (arg0 == 14) {
            this.field7703 = 2;
            this.field7702 = arg2.method2034(255) * 256;
        } else if (arg0 == 15) {
            this.field7703 = 3;
            this.field7702 = arg2.method2001((byte) -83);
        } else if (arg0 == 16) {
            this.field7703 = 3;
            this.field7702 = arg2.method2045(-98);
        } else if (arg0 == 40) {
            int var6 = arg2.method2034(255);
            this.field7712 = new short[var6];
            this.field7716 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field7712[var7] = (short) arg2.method2001((byte) -83);
                this.field7716[var7] = (short) arg2.method2001((byte) -83);
            }
        } else if (arg0 == 41) {
            int var4 = arg2.method2034(255);
            this.field7707 = new short[var4];
            this.field7711 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field7711[var5] = (short) arg2.method2001((byte) -83);
                this.field7707[var5] = (short) arg2.method2001((byte) -83);
            }
        }
        field7706++;
        if (arg1 != 16) {
            this.field7707 = null;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILd;IZLuc;IIILoa;Ld;IBII)Lba;")
    private final class358 method3185(int arg0, class139 arg1, int arg2, boolean arg3, class27 arg4, int arg5, int arg6, int arg7, class651 arg8, class139 arg9, int arg10, byte arg11, int arg12, int arg13) {
        field7722++;
        int var15 = arg7;
        class616 var16 = this.field7723 == -1 || arg2 == -1 ? null : arg4.method231(this.field7723, arg13 ^ 0xFFFFD20C);
        boolean var17 = arg3 & this.field7703 != 0;
        if (var16 != null) {
            var15 = arg7 | var16.method3374(116, false, arg5, arg2);
        }
        if (var17) {
            var15 |= this.field7703 == 3 ? 7 : 2;
        }
        if (this.field7709 != 128) {
            var15 |= 0x2;
        }
        if (this.field7721 != 128 || this.field7718 != 0) {
            var15 |= 0x5;
        }
        class666 var18 = this.field7720.field9411;
        class358 var19;
        synchronized (this.field7720.field9411) {
            var19 = (class358) this.field7720.field9411.method3750((long) (this.field7710 |= arg8.field8804 << 29), false);
        }
        if (arg13 != 0) {
            this.field7703 = 37;
        }
        if (var19 == null || arg8.method376(var19.method1945(), var15) != 0) {
            if (var19 != null) {
                var15 = arg8.method460(var15, var19.method1945());
            }
            int var20 = var15;
            if (this.field7712 != null) {
                var20 = var15 | 0x4000;
            }
            if (this.field7711 != null) {
                var20 |= 0x8000;
            }
            class545 var21 = class590.method3240(this.field7720.field9404, this.field7700, 125, 0);
            if (var21 == null) {
                return null;
            }
            if (var21.field7257 < 13) {
                var21.method3027(-256, 2);
            }
            var19 = arg8.method443(var21, var20, this.field7720.field9412, this.field7724 + 64, this.field7715 - -850);
            if (this.field7712 != null) {
                for (int var22 = 0; var22 < this.field7712.length; var22++) {
                    var19.method1929(this.field7712[var22], this.field7716[var22]);
                }
            }
            if (this.field7711 != null) {
                for (int var23 = 0; var23 < this.field7711.length; var23++) {
                    var19.method1937(this.field7711[var23], this.field7707[var23]);
                }
            }
            var19.method1899(var15);
            class666 var24 = this.field7720.field9411;
            synchronized (this.field7720.field9411) {
                this.field7720.field9411.method3745(1, (long) (this.field7710 |= arg8.field8804 << 29), var19);
            }
        }
        class358 var25 = var16 == null ? var19.method1519(arg11, var15, true) : var16.method3371(arg5, 0, var15, (byte) 74, arg10, arg11, arg2, var19);
        if (this.field7721 != 128 || this.field7709 != 128) {
            var25.method1918(this.field7721, this.field7709, this.field7721);
        }
        if (this.field7718 != 0) {
            if (this.field7718 == 90) {
                var25.method1898(4096);
            }
            if (this.field7718 == 180) {
                var25.method1898(8192);
            }
            if (this.field7718 == 270) {
                var25.method1898(12288);
            }
        }
        if (var17) {
            var25.method1919(this.field7703, this.field7702, arg1, arg9, arg12, arg6, arg0);
        }
        var25.method1899(arg7);
        return var25;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method3186(int arg0, String arg1) {
        if (arg0 < 94) {
            method3186(-58, null);
        }
        field7705++;
        return arg1.length() + 1;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(III)I")
    public static final int method3187(int arg0, int arg1, int arg2) {
        if (arg1 >= -115) {
            field7704 = -55;
        }
        field7713++;
        return arg2 == 1 || arg2 == 3 ? class527.field7027[arg0 & 0x3] : class179.field2745[arg0 & 0x3];
    }
}
