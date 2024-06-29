import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dfa")
public class class164 {

    @OriginalMember(owner = "client!dfa", name = "e", descriptor = "Z")
    public boolean field2412 = false;

    @OriginalMember(owner = "client!dfa", name = "i", descriptor = "I")
    private int field2416 = 0;

    @OriginalMember(owner = "client!dfa", name = "j", descriptor = "B")
    public byte field2417 = 0;

    @OriginalMember(owner = "client!dfa", name = "g", descriptor = "I")
    private int field2414 = 128;

    @OriginalMember(owner = "client!dfa", name = "s", descriptor = "I")
    private int field2426 = 128;

    @OriginalMember(owner = "client!dfa", name = "r", descriptor = "I")
    private int field2425 = 0;

    @OriginalMember(owner = "client!dfa", name = "v", descriptor = "I")
    private int field2429 = 0;

    @OriginalMember(owner = "client!dfa", name = "t", descriptor = "I")
    public int field2427 = -1;

    @OriginalMember(owner = "client!dfa", name = "o", descriptor = "I")
    private int field2422 = -1;

    @OriginalMember(owner = "client!dfa", name = "k", descriptor = "[I")
    public static int[] field2418 = new int[32];

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "I")
    public static int field2408;

    @OriginalMember(owner = "client!dfa", name = "c", descriptor = "I")
    public int field2410;

    @OriginalMember(owner = "client!dfa", name = "d", descriptor = "I")
    public static int field2411;

    @OriginalMember(owner = "client!dfa", name = "f", descriptor = "I")
    public static int field2413;

    @OriginalMember(owner = "client!dfa", name = "h", descriptor = "I")
    public static int field2415;

    @OriginalMember(owner = "client!dfa", name = "l", descriptor = "I")
    public static int field2419;

    @OriginalMember(owner = "client!dfa", name = "m", descriptor = "I")
    private int field2420;

    @OriginalMember(owner = "client!dfa", name = "p", descriptor = "I")
    public static int field2423;

    @OriginalMember(owner = "client!dfa", name = "w", descriptor = "I")
    public static int field2430;

    @OriginalMember(owner = "client!dfa", name = "q", descriptor = "Lvfa;")
    public class668 field2424;

    @OriginalMember(owner = "client!dfa", name = "b", descriptor = "[S")
    private short[] field2409;

    @OriginalMember(owner = "client!dfa", name = "n", descriptor = "[S")
    private short[] field2421;

    @OriginalMember(owner = "client!dfa", name = "u", descriptor = "[S")
    private short[] field2428;

    @OriginalMember(owner = "client!dfa", name = "x", descriptor = "[S")
    private short[] field2431;

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(Lud;ZI)V")
    private final void method1216(class35 arg0, boolean arg1, int arg2) {
        if (!arg1) {
            this.method1218((byte) 106, null);
        }
        if (arg2 == 1) {
            this.field2420 = arg0.method253(-13900);
        } else if (arg2 == 2) {
            this.field2427 = arg0.method253(-13900);
        } else if (arg2 == 4) {
            this.field2414 = arg0.method253(-13900);
        } else if (arg2 == 5) {
            this.field2426 = arg0.method253(-13900);
        } else if (arg2 == 6) {
            this.field2425 = arg0.method253(-13900);
        } else if (arg2 == 7) {
            this.field2416 = arg0.method273(255);
        } else if (arg2 == 8) {
            this.field2429 = arg0.method273(255);
        } else if (arg2 == 9) {
            this.field2422 = 8224;
            this.field2417 = 3;
        } else if (arg2 == 10) {
            this.field2412 = true;
        } else if (arg2 == 11) {
            this.field2417 = 1;
        } else if (arg2 == 12) {
            this.field2417 = 4;
        } else if (arg2 == 13) {
            this.field2417 = 5;
        } else if (arg2 == 14) {
            this.field2417 = 2;
            this.field2422 = arg0.method273(255) * 256;
        } else if (arg2 == 15) {
            this.field2417 = 3;
            this.field2422 = arg0.method253(-13900);
        } else if (arg2 == 16) {
            this.field2417 = 3;
            this.field2422 = arg0.method234((byte) -95);
        } else if (arg2 == 40) {
            int var4 = arg0.method273(255);
            this.field2428 = new short[var4];
            this.field2421 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2428[var5] = (short) arg0.method253(-13900);
                this.field2421[var5] = (short) arg0.method253(-13900);
            }
        } else if (arg2 == 41) {
            int var6 = arg0.method273(255);
            this.field2409 = new short[var6];
            this.field2431 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field2431[var7] = (short) arg0.method253(-13900);
                this.field2409[var7] = (short) arg0.method253(-13900);
            }
        }
        field2419++;
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IILs;ILs;Lsd;IIIZIIBLha;)Lka;")
    private final class469 method1217(int arg0, int arg1, class278 arg2, int arg3, class278 arg4, class93 arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11, byte arg12, class58 arg13) {
        field2423++;
        int var15 = arg1;
        class718 var16 = this.field2427 == -1 || arg8 == -1 ? null : arg5.method851(this.field2427, -2);
        boolean var17 = arg9 & this.field2417 != 0;
        if (var16 != null) {
            var15 = arg1 | var16.method4011(65535, arg6, arg8, false);
        }
        if (var17) {
            var15 |= this.field2417 == 3 ? 7 : 2;
        }
        if (this.field2426 != 128) {
            var15 |= 0x2;
        }
        if (this.field2414 != 128 || this.field2425 != 0) {
            var15 |= 0x5;
        }
        class510 var18 = this.field2424.field9377;
        class469 var19;
        synchronized (this.field2424.field9377) {
            var19 = (class469) this.field2424.field9377.method3054((byte) -91, (long) (this.field2410 |= arg13.field1071 << 29));
        }
        if (var19 == null || arg13.method611(var19.method361(), var15) != 0) {
            if (var19 != null) {
                var15 = arg13.method614(var15, var19.method361());
            }
            int var20 = var15;
            if (this.field2428 != null) {
                var20 = var15 | 0x4000;
            }
            if (this.field2431 != null) {
                var20 |= 0x8000;
            }
            class729 var21 = class337.method2148(-14907, this.field2420, this.field2424.field9373, 0);
            if (var21 == null) {
                return null;
            }
            if (var21.field10196 < 13) {
                var21.method4058(2, 0);
            }
            var19 = arg13.method646(var21, var20, this.field2424.field9380, this.field2416 + 64, this.field2429 + 850);
            if (this.field2428 != null) {
                for (int var22 = 0; var22 < this.field2428.length; var22++) {
                    var19.method359(this.field2428[var22], this.field2421[var22]);
                }
            }
            if (this.field2431 != null) {
                for (int var23 = 0; var23 < this.field2431.length; var23++) {
                    var19.method323(this.field2431[var23], this.field2409[var23]);
                }
            }
            var19.method347(var15);
            class510 var24 = this.field2424.field9377;
            synchronized (this.field2424.field9377) {
                this.field2424.field9377.method3047(false, var19, (long) (this.field2410 |= arg13.field1071 << 29));
            }
        }
        class469 var25 = var16 == null ? var19.method325(arg12, var15, true) : var16.method4007(var19, (byte) -70, arg8, 0, arg3, arg6, var15, arg12);
        if (this.field2414 != 128 || this.field2426 != 128) {
            var25.method315(this.field2414, this.field2426, this.field2414);
        }
        if (this.field2425 != 0) {
            if (this.field2425 == 90) {
                var25.method360(4096);
            }
            if (this.field2425 == 180) {
                var25.method360(8192);
            }
            if (this.field2425 == 270) {
                var25.method360(12288);
            }
        }
        if (var17) {
            var25.method330(this.field2417, this.field2422, arg4, arg2, arg7, arg0, arg10);
        }
        if (arg11 > -94) {
            this.method1218((byte) -79, null);
        }
        var25.method347(arg1);
        return var25;
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(BLud;)V")
    public final void method1218(byte arg0, class35 arg1) {
        if (arg0 <= 51) {
            this.field2426 = 67;
        }
        field2430++;
        while (true) {
            int var3 = arg1.method273(255);
            if (var3 == 0) {
                return;
            }
            this.method1216(arg1, true, var3);
        }
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(B)V")
    public static void method1219(byte arg0) {
        field2418 = null;
        if (arg0 != 2) {
            field2418 = null;
        }
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IIILsd;ILha;I)Lka;")
    public final class469 method1220(int arg0, int arg1, int arg2, class93 arg3, int arg4, class58 arg5, int arg6) {
        field2411++;
        return arg1 == 0 ? this.method1217(0, arg0, null, arg4, null, arg3, arg6, 0, arg2, false, 0, arg1 - 99, (byte) 5, arg5) : null;
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(II)I")
    public static int method1221(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IILha;IILsd;I)Lka;")
    public final class469 method1222(int arg0, int arg1, class58 arg2, int arg3, int arg4, class93 arg5, int arg6) {
        int var8 = -76 % ((arg6 - 9) / 36);
        field2413++;
        return this.method1217(0, arg4, null, arg0, null, arg5, arg3, 0, arg1, false, 0, -123, (byte) 2, arg2);
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(BI)I")
    public static final int method1223(byte arg0, int arg1) {
        int var2 = 69 % ((6 - arg0) / 52);
        field2408++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IIIIIIIILsd;Ls;ZLha;Ls;)Lka;")
    public final class469 method1224(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class93 arg8, class278 arg9, boolean arg10, class58 arg11, class278 arg12) {
        if (arg1 != -13) {
            this.method1220(-61, -8, 21, null, 103, null, 38);
        }
        field2415++;
        return this.method1217(arg6, arg5, arg9, arg0, arg12, arg8, arg3, arg4, arg2, arg10, arg7, arg1 - 103, (byte) 2, arg11);
    }
}
