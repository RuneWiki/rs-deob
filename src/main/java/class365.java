import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class365 {

    @OriginalMember(owner = "client!hq", name = "g", descriptor = "I")
    private int field5335 = 128;

    @OriginalMember(owner = "client!hq", name = "e", descriptor = "I")
    private int field5333 = -1;

    @OriginalMember(owner = "client!hq", name = "q", descriptor = "Z")
    public boolean field5345 = false;

    @OriginalMember(owner = "client!hq", name = "d", descriptor = "I")
    public int field5332 = -1;

    @OriginalMember(owner = "client!hq", name = "l", descriptor = "I")
    private int field5340 = 0;

    @OriginalMember(owner = "client!hq", name = "z", descriptor = "I")
    private int field5354 = 128;

    @OriginalMember(owner = "client!hq", name = "t", descriptor = "B")
    public byte field5348 = 0;

    @OriginalMember(owner = "client!hq", name = "A", descriptor = "I")
    private int field5355 = 0;

    @OriginalMember(owner = "client!hq", name = "h", descriptor = "I")
    private int field5336 = 0;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "J")
    public static long field5329 = 0L;

    @OriginalMember(owner = "client!hq", name = "x", descriptor = "I")
    public static int field5352 = 0;

    @OriginalMember(owner = "client!hq", name = "f", descriptor = "I")
    public static int field5334 = -1;

    @OriginalMember(owner = "client!hq", name = "B", descriptor = "I")
    public static int field5356 = 500;

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "I")
    public static int field5330;

    @OriginalMember(owner = "client!hq", name = "c", descriptor = "I")
    public static int field5331;

    @OriginalMember(owner = "client!hq", name = "k", descriptor = "I")
    public static int field5339;

    @OriginalMember(owner = "client!hq", name = "m", descriptor = "I")
    public static int field5341;

    @OriginalMember(owner = "client!hq", name = "n", descriptor = "I")
    public static int field5342;

    @OriginalMember(owner = "client!hq", name = "p", descriptor = "I")
    public int field5344;

    @OriginalMember(owner = "client!hq", name = "s", descriptor = "I")
    public static int field5347;

    @OriginalMember(owner = "client!hq", name = "u", descriptor = "I")
    public static int field5349;

    @OriginalMember(owner = "client!hq", name = "w", descriptor = "I")
    public static int field5351;

    @OriginalMember(owner = "client!hq", name = "y", descriptor = "I")
    private int field5353;

    @OriginalMember(owner = "client!hq", name = "C", descriptor = "I")
    public static int field5357;

    @OriginalMember(owner = "client!hq", name = "v", descriptor = "Ldea;")
    public class355 field5350;

    @OriginalMember(owner = "client!hq", name = "i", descriptor = "[S")
    private short[] field5337;

    @OriginalMember(owner = "client!hq", name = "j", descriptor = "[S")
    private short[] field5338;

    @OriginalMember(owner = "client!hq", name = "o", descriptor = "[S")
    private short[] field5343;

    @OriginalMember(owner = "client!hq", name = "r", descriptor = "[S")
    private short[] field5346;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IBLnc;IILha;I)Lka;", line = 20)
    public final class282 method2295(int arg0, byte arg1, class493 arg2, int arg3, int arg4, class543 arg5, int arg6) {
        field5347++;
        if (arg1 <= 109) {
            this.field5355 = 17;
        }
        return this.method2297(0, 0, arg3, arg6, arg5, null, arg0, false, (byte) 2, arg2, 0, 128, null, arg4);
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lnc;IILha;BZILs;IILs;II)Lka;", line = 35)
    public final class282 method2296(class493 arg0, int arg1, int arg2, class543 arg3, byte arg4, boolean arg5, int arg6, class339 arg7, int arg8, int arg9, class339 arg10, int arg11, int arg12) {
        if (arg4 >= -73) {
            return null;
        } else {
            field5331++;
            return this.method2297(arg8, arg2, arg11, arg1, arg3, arg7, arg12, arg5, (byte) 2, arg0, arg6, 128, arg10, arg9);
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIIILha;Ls;IZBLnc;IILs;I)Lka;", line = 46)
    private final class282 method2297(int arg0, int arg1, int arg2, int arg3, class543 arg4, class339 arg5, int arg6, boolean arg7, byte arg8, class493 arg9, int arg10, int arg11, class339 arg12, int arg13) {
        field5357++;
        int var15 = arg13;
        class131 var16 = this.field5332 == -1 || arg6 == -1 ? null : arg9.method2999(this.field5332, false);
        boolean var17 = arg7 & this.field5348 != 0;
        if (var16 != null) {
            var15 = arg13 | var16.method924(arg11 - 214, arg3, false, arg6);
        }
        if (var17) {
            var15 |= this.field5348 == 3 ? 7 : 2;
        }
        if (this.field5335 != 128) {
            var15 |= 0x2;
        }
        if (this.field5354 != arg11 || this.field5336 != 0) {
            var15 |= 0x5;
        }
        class348 var18 = this.field5350.field5249;
        class282 var19;
        synchronized (this.field5350.field5249) {
            var19 = (class282) this.field5350.field5249.method2216(arg11 - 128, (long) (this.field5344 |= arg4.field7874 << 29));
        }
        if (var19 == null || arg4.method300(var19.method528(), var15) != 0) {
            if (var19 != null) {
                var15 = arg4.method374(var15, var19.method528());
            }
            int var20 = var15;
            if (this.field5338 != null) {
                var20 = var15 | 0x4000;
            }
            if (this.field5343 != null) {
                var20 |= 0x8000;
            }
            class637 var21 = class565.method3379(66, this.field5350.field5234, this.field5353, 0);
            if (var21 == null) {
                return null;
            }
            if (var21.field8978 < 13) {
                var21.method3663(false, 2);
            }
            var19 = arg4.method404(var21, var20, this.field5350.field5250, this.field5355 + 64, this.field5340 + 850);
            if (this.field5338 != null) {
                for (int var22 = 0; var22 < this.field5338.length; var22++) {
                    var19.method486(this.field5338[var22], this.field5337[var22]);
                }
            }
            if (this.field5343 != null) {
                for (int var23 = 0; var23 < this.field5343.length; var23++) {
                    var19.method492(this.field5343[var23], this.field5346[var23]);
                }
            }
            var19.method487(var15);
            class348 var24 = this.field5350.field5249;
            synchronized (this.field5350.field5249) {
                this.field5350.field5249.method2213((byte) -16, (long) (this.field5344 |= arg4.field7874 << 29), var19);
            }
        }
        class282 var25 = var16 == null ? var19.method509(arg8, var15, true) : var16.method919((byte) -2, arg6, arg3, arg2, var19, 0, arg8, var15);
        if (this.field5354 != 128 || this.field5335 != 128) {
            var25.method518(this.field5354, this.field5335, this.field5354);
        }
        if (this.field5336 != 0) {
            if (this.field5336 == 90) {
                var25.method541(4096);
            }
            if (this.field5336 == 180) {
                var25.method541(8192);
            }
            if (this.field5336 == 270) {
                var25.method541(12288);
            }
        }
        if (var17) {
            var25.method516(this.field5348, this.field5333, arg5, arg12, arg0, arg10, arg1);
        }
        var25.method487(arg13);
        return var25;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(I)V", line = 158)
    public static final void method2298(int arg0) {
        class42.field710 = 0;
        class455.field6488 = -1;
        class405.field5772 = -1;
        if (arg0 != 18464) {
            field5334 = -29;
        }
        field5351++;
        class545.field7931 = -1;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lsl;Z)V", line = 183)
    public final void method2299(class479 arg0, boolean arg1) {
        while (true) {
            int var3 = arg0.method2886(arg1);
            if (var3 == 0) {
                if (!arg1) {
                    this.method2296(null, -50, 84, null, (byte) -32, false, 126, null, 68, 85, null, 110, 57);
                }
                field5349++;
                return;
            }
            this.method2302((byte) 39, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIIBILnc;Lha;)Lka;", line = 207)
    public final class282 method2300(int arg0, int arg1, int arg2, byte arg3, int arg4, class493 arg5, class543 arg6) {
        int var8 = -48 % ((67 - arg3) / 35);
        field5341++;
        return this.method2297(0, 0, arg0, arg4, arg6, null, arg2, false, (byte) 5, arg5, 0, 128, null, arg1);
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIIII)V", line = 227)
    public static final void method2301(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5330++;
        int var5 = arg4;
        int var6 = arg0;
        int var7 = -arg0;
        int var8 = -1;
        int var9 = class183.method1292(class200.field2976, -1, class204.field3061, arg0 + arg1);
        int var10 = class183.method1292(class200.field2976, -1, class204.field3061, arg1 - arg0);
        class518.method3153(var9, var10, class193.field2839[arg3], -7, arg2);
        while (var5 < var6) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg3 - var6;
                int var12 = arg3 + var6;
                if (var12 >= class377.field5458 && var11 <= class362.field5291) {
                    int var13 = class183.method1292(class200.field2976, -1, class204.field3061, arg1 + var5);
                    int var14 = class183.method1292(class200.field2976, ~arg4, class204.field3061, arg1 - var5);
                    if (class362.field5291 >= var12) {
                        class518.method3153(var13, var14, class193.field2839[var12], -7, arg2);
                    }
                    if (var11 >= class377.field5458) {
                        class518.method3153(var13, var14, class193.field2839[var11], arg4 - 7, arg2);
                    }
                }
            }
            var5++;
            int var15 = arg3 - var5;
            int var16 = arg3 + var5;
            if (class377.field5458 <= var16 && var15 <= class362.field5291) {
                int var17 = class183.method1292(class200.field2976, -1, class204.field3061, arg1 + var6);
                int var18 = class183.method1292(class200.field2976, -1, class204.field3061, arg1 - var6);
                if (class362.field5291 >= var16) {
                    class518.method3153(var17, var18, class193.field2839[var16], -7, arg2);
                }
                if (var15 >= class377.field5458) {
                    class518.method3153(var17, var18, class193.field2839[var15], -7, arg2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(BILsl;)V", line = 305)
    private final void method2302(byte arg0, int arg1, class479 arg2) {
        int var4 = -99 % ((arg0 + 6) / 45);
        field5339++;
        if (arg1 == 1) {
            this.field5353 = arg2.method2882(-1);
        } else if (arg1 == 2) {
            this.field5332 = arg2.method2882(-1);
        } else if (arg1 == 4) {
            this.field5354 = arg2.method2882(-1);
        } else if (arg1 == 5) {
            this.field5335 = arg2.method2882(-1);
        } else if (arg1 == 6) {
            this.field5336 = arg2.method2882(-1);
        } else if (arg1 == 7) {
            this.field5355 = arg2.method2886(true);
        } else if (arg1 == 8) {
            this.field5340 = arg2.method2886(true);
        } else if (arg1 == 9) {
            this.field5333 = 8224;
            this.field5348 = 3;
        } else if (arg1 == 10) {
            this.field5345 = true;
        } else if (arg1 == 11) {
            this.field5348 = 1;
        } else if (arg1 == 12) {
            this.field5348 = 4;
        } else if (arg1 == 13) {
            this.field5348 = 5;
        } else if (arg1 == 14) {
            this.field5348 = 2;
            this.field5333 = arg2.method2886(true) * 256;
        } else if (arg1 == 15) {
            this.field5348 = 3;
            this.field5333 = arg2.method2882(-1);
        } else if (arg1 == 16) {
            this.field5348 = 3;
            this.field5333 = arg2.method2868(-52);
        } else if (arg1 == 40) {
            int var5 = arg2.method2886(true);
            this.field5338 = new short[var5];
            this.field5337 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field5338[var6] = (short) arg2.method2882(-1);
                this.field5337[var6] = (short) arg2.method2882(-1);
            }
            return;
        } else if (arg1 == 41) {
            int var7 = arg2.method2886(true);
            this.field5346 = new short[var7];
            this.field5343 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field5343[var8] = (short) arg2.method2882(-1);
                this.field5346[var8] = (short) arg2.method2882(-1);
            }
            return;
        }
    }
}
