import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public class class525 {

    @OriginalMember(owner = "client!dw", name = "h", descriptor = "I")
    public int field7457 = -1;

    @OriginalMember(owner = "client!dw", name = "o", descriptor = "I")
    private int field7464 = 128;

    @OriginalMember(owner = "client!dw", name = "u", descriptor = "Z")
    public boolean field7470 = false;

    @OriginalMember(owner = "client!dw", name = "t", descriptor = "I")
    private int field7469 = 0;

    @OriginalMember(owner = "client!dw", name = "x", descriptor = "I")
    private int field7473 = 0;

    @OriginalMember(owner = "client!dw", name = "e", descriptor = "I")
    private int field7454 = 0;

    @OriginalMember(owner = "client!dw", name = "w", descriptor = "I")
    private int field7472 = 128;

    @OriginalMember(owner = "client!dw", name = "s", descriptor = "I")
    private int field7468 = -1;

    @OriginalMember(owner = "client!dw", name = "y", descriptor = "B")
    public byte field7474 = 0;

    @OriginalMember(owner = "client!dw", name = "r", descriptor = "[I")
    public static int[] field7467 = new int[2];

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "I")
    public static int field7451;

    @OriginalMember(owner = "client!dw", name = "c", descriptor = "I")
    public static int field7452;

    @OriginalMember(owner = "client!dw", name = "d", descriptor = "I")
    public static int field7453;

    @OriginalMember(owner = "client!dw", name = "g", descriptor = "I")
    private int field7456;

    @OriginalMember(owner = "client!dw", name = "i", descriptor = "I")
    public static int field7458;

    @OriginalMember(owner = "client!dw", name = "k", descriptor = "I")
    public static int field7460;

    @OriginalMember(owner = "client!dw", name = "l", descriptor = "I")
    public static int field7461;

    @OriginalMember(owner = "client!dw", name = "n", descriptor = "I")
    public int field7463;

    @OriginalMember(owner = "client!dw", name = "q", descriptor = "I")
    public static int field7466;

    @OriginalMember(owner = "client!dw", name = "v", descriptor = "I")
    public static int field7471;

    @OriginalMember(owner = "client!dw", name = "z", descriptor = "I")
    public static int field7475;

    @OriginalMember(owner = "client!dw", name = "f", descriptor = "Lcda;")
    public class531 field7455;

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "[S")
    private short[] field7450;

    @OriginalMember(owner = "client!dw", name = "j", descriptor = "[S")
    private short[] field7459;

    @OriginalMember(owner = "client!dw", name = "m", descriptor = "[S")
    private short[] field7462;

    @OriginalMember(owner = "client!dw", name = "p", descriptor = "[S")
    private short[] field7465;

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(BLgk;)V", line = 6)
    public final void method2974(byte arg0, class540 arg1) {
        while (true) {
            int var3 = arg1.method3115(29871);
            if (var3 == 0) {
                if (arg0 != 54) {
                    return;
                }
                field7475++;
                return;
            }
            this.method2980(var3, arg1, 1640);
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(IIZIILr;Li;Lar;IBILi;II)Lda;", line = 29)
    private final class395 method2975(int arg0, int arg1, boolean arg2, int arg3, int arg4, class98 arg5, class682 arg6, class524 arg7, int arg8, byte arg9, int arg10, class682 arg11, int arg12, int arg13) {
        field7451++;
        int var15 = arg13;
        class47 var16 = this.field7457 == -1 || arg1 == -1 ? null : arg7.method2971(-40, this.field7457);
        boolean var17 = arg2 & this.field7474 != 0;
        if (var16 != null) {
            var15 = arg13 | var16.method284(false, arg1, (byte) -53, arg8);
        }
        if (var17) {
            var15 |= this.field7474 == 3 ? 7 : 2;
        }
        if (this.field7464 != 128) {
            var15 |= 0x2;
        }
        if (this.field7472 != 128 || this.field7454 != 0) {
            var15 |= 0x5;
        }
        int var18 = -45 / ((arg10 + 26) / 41);
        class692 var19 = this.field7455.field7831;
        class395 var20;
        synchronized (this.field7455.field7831) {
            var20 = (class395) this.field7455.field7831.method3901((long) (this.field7463 |= arg5.field1500 << 29), -47);
        }
        if (var20 == null || arg5.method706(var20.method1027(), var15) != 0) {
            if (var20 != null) {
                var15 = arg5.method661(var15, var20.method1027());
            }
            int var21 = var15;
            if (this.field7450 != null) {
                var21 = var15 | 0x4000;
            }
            if (this.field7465 != null) {
                var21 |= 0x8000;
            }
            class677 var22 = class177.method1208(-29831, this.field7456, this.field7455.field7822, 0);
            if (var22 == null) {
                return null;
            }
            if (var22.field9563 < 13) {
                var22.method3807(0, 2);
            }
            var20 = arg5.method651(var22, var21, this.field7455.field7832, this.field7469 + 64, this.field7473 + 850);
            if (this.field7450 != null) {
                for (int var23 = 0; var23 < this.field7450.length; var23++) {
                    var20.method1052(this.field7450[var23], this.field7459[var23]);
                }
            }
            if (this.field7465 != null) {
                for (int var24 = 0; var24 < this.field7465.length; var24++) {
                    var20.method1045(this.field7465[var24], this.field7462[var24]);
                }
            }
            var20.method1017(var15);
            class692 var25 = this.field7455.field7831;
            synchronized (this.field7455.field7831) {
                this.field7455.field7831.method3894(var20, (byte) 60, (long) (this.field7463 |= arg5.field1500 << 29));
            }
        }
        class395 var26 = var16 == null ? var20.method1038(arg9, var15, true) : var16.method282(var15, arg12, arg1, arg9, 0, var20, arg8, 65535);
        if (this.field7472 != 128 || this.field7464 != 128) {
            var26.method1033(this.field7472, this.field7464, this.field7472);
        }
        if (this.field7454 != 0) {
            if (this.field7454 == 90) {
                var26.method1042(4096);
            }
            if (this.field7454 == 180) {
                var26.method1042(8192);
            }
            if (this.field7454 == 270) {
                var26.method1042(12288);
            }
        }
        if (var17) {
            var26.method1014(this.field7474, this.field7468, arg6, arg11, arg0, arg4, arg3);
        }
        var26.method1017(arg13);
        return var26;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(IIILar;Lr;II)Lda;", line = 151)
    public final class395 method2976(int arg0, int arg1, int arg2, class524 arg3, class98 arg4, int arg5, int arg6) {
        int var8 = -123 % ((8 - arg2) / 63);
        field7453++;
        return this.method2975(0, arg1, false, 0, 0, arg4, null, arg3, arg6, (byte) 5, 15, null, arg0, arg5);
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(I)V", line = 173)
    public static final void method2977(int arg0) {
        field7460++;
        class224.method1397(class332.field4821, (long) class45.field685, (byte) -23);
        if (class567.field8270 != -1) {
            class19.method129(class567.field8270, -18129);
        }
        int var1 = 0;
        if (arg0 != -30673) {
            return;
        }
        while (var1 < class7.field215) {
            if (class394.field5969[var1]) {
                class27.field475[var1] = true;
            }
            class586.field8509[var1] = class394.field5969[var1];
            class394.field5969[var1] = false;
            var1++;
        }
        class22.field430 = class45.field685;
        if (class567.field8270 != -1) {
            class7.field215 = 0;
            class51.method304(true);
        }
        class332.field4821.method699();
        class347.method2158(class332.field4821, arg0 ^ 0x7786);
        int var2 = class366.method2246(arg0 ^ 0x77AE);
        if (var2 == -1) {
            var2 = class222.field2943;
        }
        if (var2 == -1) {
            var2 = class676.field9528;
        }
        class481.method2753((byte) 111, var2);
        class255.field3319 = 0;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(B)V", line = 223)
    public static void method2978(byte arg0) {
        field7467 = null;
        if (arg0 < 43) {
            field7467 = null;
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(IBLar;IILr;I)Lda;", line = 233)
    public final class395 method2979(int arg0, byte arg1, class524 arg2, int arg3, int arg4, class98 arg5, int arg6) {
        int var8 = -99 % ((6 - arg1) / 61);
        field7452++;
        return this.method2975(0, arg6, false, 0, 0, arg5, null, arg2, arg3, (byte) 2, -89, null, arg0, arg4);
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(ILgk;I)V", line = 248)
    private final void method2980(int arg0, class540 arg1, int arg2) {
        if (arg2 != 1640) {
            this.method2979(95, (byte) 3, null, 72, 11, null, 11);
        }
        field7466++;
        if (arg0 == 1) {
            this.field7456 = arg1.method3169(26488);
        } else if (arg0 == 2) {
            this.field7457 = arg1.method3169(26488);
        } else if (arg0 == 4) {
            this.field7472 = arg1.method3169(26488);
        } else if (arg0 == 5) {
            this.field7464 = arg1.method3169(26488);
        } else if (arg0 == 6) {
            this.field7454 = arg1.method3169(26488);
        } else if (arg0 == 7) {
            this.field7469 = arg1.method3115(arg2 + 28231);
        } else if (arg0 == 8) {
            this.field7473 = arg1.method3115(arg2 ^ 0x72C7);
        } else if (arg0 == 9) {
            this.field7474 = 3;
            this.field7468 = 8224;
        } else if (arg0 == 10) {
            this.field7470 = true;
        } else if (arg0 == 11) {
            this.field7474 = 1;
        } else if (arg0 == 12) {
            this.field7474 = 4;
        } else if (arg0 == 13) {
            this.field7474 = 5;
        } else if (arg0 == 14) {
            this.field7474 = 2;
            this.field7468 = arg1.method3115(29871) * 256;
        } else if (arg0 == 15) {
            this.field7474 = 3;
            this.field7468 = arg1.method3169(26488);
        } else if (arg0 == 16) {
            this.field7474 = 3;
            this.field7468 = arg1.method3160(false);
        } else if (arg0 == 40) {
            int var6 = arg1.method3115(arg2 ^ 0x72C7);
            this.field7450 = new short[var6];
            this.field7459 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field7450[var7] = (short) arg1.method3169(26488);
                this.field7459[var7] = (short) arg1.method3169(class145.method1006(arg2, 24848));
            }
        } else if (arg0 == 41) {
            int var4 = arg1.method3115(29871);
            this.field7465 = new short[var4];
            this.field7462 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field7465[var5] = (short) arg1.method3169(26488);
                this.field7462[var5] = (short) arg1.method3169(26488);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lr;IIIIIZIILi;ILi;Lar;)Lda;", line = 379)
    public final class395 method2981(class98 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, class682 arg9, int arg10, class682 arg11, class524 arg12) {
        field7461++;
        return arg4 == -26718 ? this.method2975(arg1, arg7, arg6, arg5, arg8, arg0, arg11, arg12, arg10, (byte) 2, -102, arg9, arg2, arg3) : null;
    }
}
