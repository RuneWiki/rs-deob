import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!paa")
public class class578 {

    @OriginalMember(owner = "client!paa", name = "l", descriptor = "Z")
    public boolean field8230 = false;

    @OriginalMember(owner = "client!paa", name = "f", descriptor = "I")
    private int field8224 = 0;

    @OriginalMember(owner = "client!paa", name = "g", descriptor = "I")
    private int field8225 = 128;

    @OriginalMember(owner = "client!paa", name = "m", descriptor = "I")
    private int field8231 = 0;

    @OriginalMember(owner = "client!paa", name = "j", descriptor = "B")
    public byte field8228 = 0;

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "I")
    private int field8219 = 128;

    @OriginalMember(owner = "client!paa", name = "s", descriptor = "I")
    private int field8237 = -1;

    @OriginalMember(owner = "client!paa", name = "v", descriptor = "I")
    private int field8240 = 0;

    @OriginalMember(owner = "client!paa", name = "w", descriptor = "I")
    public int field8241 = -1;

    @OriginalMember(owner = "client!paa", name = "b", descriptor = "Lhga;")
    public static class158 field8220 = new class158(49, 6);

    @OriginalMember(owner = "client!paa", name = "x", descriptor = "F")
    public static float field8242 = 1.0F;

    @OriginalMember(owner = "client!paa", name = "e", descriptor = "I")
    public static int field8223;

    @OriginalMember(owner = "client!paa", name = "i", descriptor = "I")
    public static int field8227;

    @OriginalMember(owner = "client!paa", name = "k", descriptor = "I")
    public static int field8229;

    @OriginalMember(owner = "client!paa", name = "o", descriptor = "I")
    public static int field8233;

    @OriginalMember(owner = "client!paa", name = "p", descriptor = "I")
    private int field8234;

    @OriginalMember(owner = "client!paa", name = "r", descriptor = "I")
    public int field8236;

    @OriginalMember(owner = "client!paa", name = "t", descriptor = "I")
    public static int field8238;

    @OriginalMember(owner = "client!paa", name = "u", descriptor = "I")
    public static int field8239;

    @OriginalMember(owner = "client!paa", name = "z", descriptor = "I")
    public static int field8244;

    @OriginalMember(owner = "client!paa", name = "q", descriptor = "Lar;")
    public class634 field8235;

    @OriginalMember(owner = "client!paa", name = "y", descriptor = "Lsw;")
    public static class701 field8243;

    @OriginalMember(owner = "client!paa", name = "c", descriptor = "[S")
    private short[] field8221;

    @OriginalMember(owner = "client!paa", name = "d", descriptor = "[S")
    private short[] field8222;

    @OriginalMember(owner = "client!paa", name = "h", descriptor = "[S")
    private short[] field8226;

    @OriginalMember(owner = "client!paa", name = "n", descriptor = "[S")
    private short[] field8232;

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(ILjb;IILi;Li;BZILr;III)Lda;", line = 7)
    public final class55 method3380(int arg0, class458 arg1, int arg2, int arg3, class37 arg4, class37 arg5, byte arg6, boolean arg7, int arg8, class167 arg9, int arg10, int arg11, int arg12) {
        field8229++;
        if (arg6 >= -32) {
            this.field8221 = null;
        }
        return this.method3387(arg10, (byte) -31, arg3, arg9, arg8, arg7, arg5, arg0, arg1, arg4, arg12, arg11, (byte) 2, arg2);
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(ILr;IIILjb;I)Lda;", line = 23)
    public final class55 method3381(int arg0, class167 arg1, int arg2, int arg3, int arg4, class458 arg5, int arg6) {
        field8239++;
        return arg0 == 0 ? this.method3387(arg2, (byte) -114, arg4, arg1, 0, false, null, arg6, arg5, null, arg3, 0, (byte) 5, 0) : null;
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(ILjb;ILr;III)Lda;", line = 53)
    public final class55 method3382(int arg0, class458 arg1, int arg2, class167 arg3, int arg4, int arg5, int arg6) {
        field8244++;
        if (arg6 != -11243) {
            this.method3385(null, -24, -75);
        }
        return this.method3387(arg5, (byte) -42, arg0, arg3, 0, false, null, arg4, arg1, null, arg2, 0, (byte) 2, 0);
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(I)V", line = 66)
    public static final void method3383(int arg0) {
        field8238++;
        if (class497.field7254) {
            return;
        }
        if (class17.field282.field4878) {
            class37.field514 = ((int) class37.field514 - 65 & 0xFFFFFF80);
        } else {
            class574.field8188 += (-class574.field8188 - 24.0F) / 2.0F;
        }
        class497.field7254 = true;
        if (arg0 < -52) {
            class328.field5085 = true;
        }
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(BLie;)V", line = 97)
    public final void method3384(byte arg0, class6 arg1) {
        field8227++;
        if (arg0 != 2) {
            return;
        }
        while (true) {
            int var3 = arg1.method70(-9059);
            if (var3 == 0) {
                return;
            }
            this.method3385(arg1, 117, var3);
        }
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(Lie;II)V", line = 127)
    private final void method3385(class6 arg0, int arg1, int arg2) {
        if (arg1 < 39) {
            return;
        }
        if (arg2 == 1) {
            this.field8234 = arg0.method67(12021);
        } else if (arg2 == 2) {
            this.field8241 = arg0.method67(12021);
        } else if (arg2 == 4) {
            this.field8225 = arg0.method67(12021);
        } else if (arg2 == 5) {
            this.field8219 = arg0.method67(12021);
        } else if (arg2 == 6) {
            this.field8240 = arg0.method67(12021);
        } else if (arg2 == 7) {
            this.field8224 = arg0.method70(-9059);
        } else if (arg2 == 8) {
            this.field8231 = arg0.method70(-9059);
        } else if (arg2 == 9) {
            this.field8228 = 3;
            this.field8237 = 8224;
        } else if (arg2 == 10) {
            this.field8230 = true;
        } else if (arg2 == 11) {
            this.field8228 = 1;
        } else if (arg2 == 12) {
            this.field8228 = 4;
        } else if (arg2 == 13) {
            this.field8228 = 5;
        } else if (arg2 == 14) {
            this.field8228 = 2;
            this.field8237 = arg0.method70(-9059) * 256;
        } else if (arg2 == 15) {
            this.field8228 = 3;
            this.field8237 = arg0.method67(12021);
        } else if (arg2 == 16) {
            this.field8228 = 3;
            this.field8237 = arg0.method72(-55);
        } else if (arg2 == 40) {
            int var4 = arg0.method70(-9059);
            this.field8232 = new short[var4];
            this.field8221 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field8232[var5] = (short) arg0.method67(12021);
                this.field8221[var5] = (short) arg0.method67(12021);
            }
        } else if (arg2 == 41) {
            int var6 = arg0.method70(-9059);
            this.field8226 = new short[var6];
            this.field8222 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field8222[var7] = (short) arg0.method67(12021);
                this.field8226[var7] = (short) arg0.method67(12021);
            }
        }
        field8233++;
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(B)V", line = 259)
    public static void method3386(byte arg0) {
        field8243 = null;
        field8220 = null;
        if (arg0 != 5) {
            method3383(-115);
        }
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(IBILr;IZLi;ILjb;Li;IIBI)Lda;", line = 274)
    private final class55 method3387(int arg0, byte arg1, int arg2, class167 arg3, int arg4, boolean arg5, class37 arg6, int arg7, class458 arg8, class37 arg9, int arg10, int arg11, byte arg12, int arg13) {
        field8223++;
        int var15 = arg0;
        if (arg1 >= -21) {
            this.field8240 = -42;
        }
        class428 var16 = this.field8241 == -1 || arg2 == -1 ? null : arg8.method2872((byte) 11, this.field8241);
        boolean var17 = arg5 & this.field8228 != 0;
        if (var16 != null) {
            var15 = arg0 | var16.method2712((byte) 85, arg10, false, arg2);
        }
        if (var17) {
            var15 |= this.field8228 == 3 ? 7 : 2;
        }
        if (this.field8219 != 128) {
            var15 |= 0x2;
        }
        if (this.field8225 != 128 || this.field8240 != 0) {
            var15 |= 0x5;
        }
        class49 var18 = this.field8235.field8911;
        class55 var19;
        synchronized (this.field8235.field8911) {
            var19 = (class55) this.field8235.field8911.method560(false, (long) (this.field8236 |= arg3.field2804 << 29));
        }
        if (var19 == null || arg3.method323(var19.method651(), var15) != 0) {
            if (var19 != null) {
                var15 = arg3.method286(var15, var19.method651());
            }
            int var20 = var15;
            if (this.field8232 != null) {
                var20 = var15 | 0x4000;
            }
            if (this.field8222 != null) {
                var20 |= 0x8000;
            }
            class534 var21 = class243.method1736(this.field8234, 0, 6392, this.field8235.field8902);
            if (var21 == null) {
                return null;
            }
            if (var21.field7772 < 13) {
                var21.method3244(44, 2);
            }
            var19 = arg3.method287(var21, var20, this.field8235.field8912, this.field8224 + 64, this.field8231 + 850);
            if (this.field8232 != null) {
                for (int var22 = 0; var22 < this.field8232.length; var22++) {
                    var19.method608(this.field8232[var22], this.field8221[var22]);
                }
            }
            if (this.field8222 != null) {
                for (int var23 = 0; var23 < this.field8222.length; var23++) {
                    var19.method602(this.field8222[var23], this.field8226[var23]);
                }
            }
            var19.method629(var15);
            class49 var24 = this.field8235.field8911;
            synchronized (this.field8235.field8911) {
                this.field8235.field8911.method559(var19, (long) (this.field8236 |= arg3.field2804 << 29), 0);
            }
        }
        class55 var25 = var16 == null ? var19.method609(arg12, var15, true) : var16.method2710(arg7, arg10, false, arg2, 0, var19, arg12, var15);
        if (this.field8225 != 128 || this.field8219 != 128) {
            var25.method600(this.field8225, this.field8219, this.field8225);
        }
        if (this.field8240 != 0) {
            if (this.field8240 == 90) {
                var25.method618(4096);
            }
            if (this.field8240 == 180) {
                var25.method618(8192);
            }
            if (this.field8240 == 270) {
                var25.method618(12288);
            }
        }
        if (var17) {
            var25.method624(this.field8228, this.field8237, arg6, arg9, arg4, arg13, arg11);
        }
        var25.method629(arg0);
        return var25;
    }
}
