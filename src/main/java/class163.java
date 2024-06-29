import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class163 {

    @OriginalMember(owner = "client!uq", name = "i", descriptor = "Lqr;")
    private class65 field2454 = new class65(64);

    @OriginalMember(owner = "client!uq", name = "v", descriptor = "Lqr;")
    public class65 field2467 = new class65(50);

    @OriginalMember(owner = "client!uq", name = "w", descriptor = "Lnd;")
    public class545 field2468 = new class545(250);

    @OriginalMember(owner = "client!uq", name = "D", descriptor = "Leda;")
    private class102 field2475 = new class102();

    @OriginalMember(owner = "client!uq", name = "q", descriptor = "Lwu;")
    public class376 field2462;

    @OriginalMember(owner = "client!uq", name = "l", descriptor = "Z")
    private boolean field2457;

    @OriginalMember(owner = "client!uq", name = "f", descriptor = "Lwu;")
    private class376 field2451;

    @OriginalMember(owner = "client!uq", name = "s", descriptor = "I")
    public int field2464;

    @OriginalMember(owner = "client!uq", name = "F", descriptor = "Loha;")
    private class743 field2477;

    @OriginalMember(owner = "client!uq", name = "r", descriptor = "I")
    public int field2463;

    @OriginalMember(owner = "client!uq", name = "G", descriptor = "[Ljava/lang/String;")
    private String[] field2478;

    @OriginalMember(owner = "client!uq", name = "M", descriptor = "[Ljava/lang/String;")
    private String[] field2483;

    @OriginalMember(owner = "client!uq", name = "u", descriptor = "Llu;")
    public static class714 field2466 = new class714(1);

    @OriginalMember(owner = "client!uq", name = "z", descriptor = "Z")
    public static boolean field2471 = false;

    @OriginalMember(owner = "client!uq", name = "H", descriptor = "I")
    public static int field2479 = 50;

    @OriginalMember(owner = "client!uq", name = "y", descriptor = "[I")
    public static int[] field2470 = new int[field2479];

    @OriginalMember(owner = "client!uq", name = "C", descriptor = "[I")
    public static int[] field2474 = new int[field2479];

    @OriginalMember(owner = "client!uq", name = "E", descriptor = "[Ljava/lang/String;")
    public static String[] field2476 = new String[field2479];

    @OriginalMember(owner = "client!uq", name = "A", descriptor = "[I")
    public static int[] field2472 = new int[field2479];

    @OriginalMember(owner = "client!uq", name = "L", descriptor = "[I")
    public static int[] field2482 = new int[field2479];

    @OriginalMember(owner = "client!uq", name = "I", descriptor = "[I")
    public static int[] field2480 = new int[field2479];

    @OriginalMember(owner = "client!uq", name = "x", descriptor = "[I")
    public static int[] field2469 = new int[field2479];

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "I")
    public static int field2447;

    @OriginalMember(owner = "client!uq", name = "c", descriptor = "I")
    public static int field2448;

    @OriginalMember(owner = "client!uq", name = "d", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!uq", name = "e", descriptor = "I")
    public static int field2450;

    @OriginalMember(owner = "client!uq", name = "g", descriptor = "I")
    public static int field2452;

    @OriginalMember(owner = "client!uq", name = "h", descriptor = "I")
    public static int field2453;

    @OriginalMember(owner = "client!uq", name = "j", descriptor = "I")
    public static int field2455;

    @OriginalMember(owner = "client!uq", name = "k", descriptor = "I")
    public static int field2456;

    @OriginalMember(owner = "client!uq", name = "m", descriptor = "I")
    public static int field2458;

    @OriginalMember(owner = "client!uq", name = "n", descriptor = "I")
    public static int field2459;

    @OriginalMember(owner = "client!uq", name = "o", descriptor = "I")
    public static int field2460;

    @OriginalMember(owner = "client!uq", name = "p", descriptor = "I")
    public static int field2461;

    @OriginalMember(owner = "client!uq", name = "t", descriptor = "I")
    public static int field2465;

    @OriginalMember(owner = "client!uq", name = "K", descriptor = "I")
    public int field2481;

    @OriginalMember(owner = "client!uq", name = "B", descriptor = "Llu;")
    public static class714 field2473;

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(I)I")
    public static final int method1164(int arg0) {
        field2450++;
        if (arg0 != 50) {
            method1172((byte) 54, null);
        }
        class65 var1 = class600.field7880;
        synchronized (class600.field7880) {
            return class600.field7880.method564(false);
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(BI)Lth;")
    public final class597 method1165(byte arg0, int arg1) {
        if (arg0 < 64) {
            return null;
        }
        field2447++;
        class65 var3 = this.field2454;
        class597 var4;
        synchronized (this.field2454) {
            var4 = (class597) this.field2454.method552(4, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class376 var5 = this.field2451;
        byte[] var6;
        synchronized (this.field2451) {
            var6 = this.field2451.method2218((byte) 124, class171.method1211(arg1, -110), class617.method3378(arg1, (byte) 95));
        }
        class597 var7 = new class597();
        var7.field7775 = this;
        var7.field7812 = arg1;
        var7.field7765 = new String[] { null, null, class517.field6847.method2877(this.field2464, (byte) -108), null, null };
        var7.field7762 = new String[] { null, null, null, null, class517.field6848.method2877(this.field2464, (byte) -108) };
        if (var6 != null) {
            var7.method3247((byte) -33, new class677(var6));
        }
        var7.method3249(-122);
        if (var7.field7808 != -1) {
            var7.method3254((byte) 113, this.method1165((byte) 112, var7.field7793), this.method1165((byte) 105, var7.field7808));
        }
        if (var7.field7836 != -1) {
            var7.method3257(this.method1165((byte) 115, var7.field7836), 0, this.method1165((byte) 113, var7.field7820));
        }
        if (var7.field7796 != -1) {
            var7.method3248((byte) 120, this.method1165((byte) 93, var7.field7834), this.method1165((byte) 76, var7.field7796));
        }
        if (!this.field2457 && var7.field7799) {
            var7.field7763 = class517.field6844.method2877(this.field2464, (byte) -108);
            var7.field7822 = null;
            var7.field7784 = 0;
            var7.field7765 = this.field2478;
            var7.field7762 = this.field2483;
            var7.field7815 = false;
            if (var7.field7828 != null) {
                boolean var8 = false;
                for (class656 var9 = var7.field7828.method2144(true); var9 != null; var9 = var7.field7828.method2146(false)) {
                    class62 var10 = this.field2477.method4149(-6119, (int) var9.field8680);
                    if (var10.field763) {
                        var9.method3564(true);
                    } else {
                        var8 = true;
                    }
                }
                if (!var8) {
                    var7.field7828 = null;
                }
            }
        }
        class65 var11 = this.field2454;
        synchronized (this.field2454) {
            this.field2454.method556((byte) 0, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "(I)V")
    public final void method1166(int arg0) {
        field2458++;
        class65 var2 = this.field2467;
        synchronized (this.field2467) {
            this.field2467.method561((byte) -78);
        }
        if (arg0 > -63) {
            field2479 = -123;
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIILha;IIILuea;)Lhu;")
    public final class133 method1167(int arg0, int arg1, int arg2, class59 arg3, int arg4, int arg5, int arg6, class320 arg7) {
        if (arg0 >= -51) {
            method1173(-41, -36);
        }
        this.field2475.field1422 = arg6;
        this.field2475.field1420 = arg2;
        this.field2475.field1419 = arg5;
        field2456++;
        this.field2475.field1423 = arg1;
        this.field2475.field1417 = arg3.field721;
        this.field2475.field1426 = arg4;
        this.field2475.field1427 = arg7 != null;
        return (class133) this.field2468.method3053((byte) 5, this.field2475);
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(B)V")
    public final void method1168(byte arg0) {
        class65 var2 = this.field2454;
        synchronized (this.field2454) {
            this.field2454.method558(0);
        }
        field2461++;
        class65 var3 = this.field2467;
        synchronized (this.field2467) {
            this.field2467.method558(0);
            if (arg0 < 36) {
                this.method1168((byte) -22);
            }
        }
        class545 var4 = this.field2468;
        synchronized (this.field2468) {
            this.field2468.method3044(-28524);
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(ZLuea;Lha;ZILha;IIILda;II)Lhu;")
    public final class133 method1169(boolean arg0, class320 arg1, class59 arg2, boolean arg3, int arg4, class59 arg5, int arg6, int arg7, int arg8, class60 arg9, int arg10, int arg11) {
        field2448++;
        class133 var13 = this.method1167(-98, arg4, arg10, arg2, arg7, arg11, arg8, arg1);
        if (var13 != null) {
            return var13;
        }
        class597 var14 = this.method1165((byte) 112, arg10);
        if (arg11 > 1 && var14.field7835 != null) {
            int var15 = -1;
            for (int var16 = 0; var16 < 10; var16++) {
                if (var14.field7840[var16] <= arg11 && var14.field7840[var16] != 0) {
                    var15 = var14.field7835[var16];
                }
            }
            if (var15 != -1) {
                var14 = this.method1165((byte) 87, var15);
            }
        }
        int[] var17 = var14.method3244(arg5, arg8, arg9, arg11, arg2, arg4, arg1, arg3, 49, arg7);
        if (var17 == null) {
            return null;
        }
        if (arg6 < 30) {
            this.field2464 = 66;
        }
        class133 var18;
        if (arg0) {
            var18 = arg5.method450(32, (byte) 99, 36, var17, 0, 36);
        } else {
            var18 = arg2.method450(32, (byte) 99, 36, var17, 0, 36);
        }
        if (!arg0) {
            class102 var19 = new class102();
            var19.field1427 = arg1 != null;
            var19.field1417 = arg2.field721;
            var19.field1422 = arg8;
            var19.field1423 = arg4;
            var19.field1426 = arg7;
            var19.field1419 = arg11;
            var19.field1420 = arg10;
            this.field2468.method3056((byte) 3, var18, var19);
        }
        return var18;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(II)V")
    public final void method1170(int arg0, int arg1) {
        field2453++;
        class65 var3 = this.field2454;
        synchronized (this.field2454) {
            this.field2454.method553(arg0, -15782);
        }
        class65 var4 = this.field2467;
        synchronized (this.field2467) {
            this.field2467.method553(arg0, -15782);
            if (arg1 >= -100) {
                this.field2483 = null;
            }
        }
        class545 var5 = this.field2468;
        synchronized (this.field2468) {
            this.field2468.method3047(arg0, 8192);
        }
    }

    @OriginalMember(owner = "client!uq", name = "c", descriptor = "(I)V")
    public final void method1171(int arg0) {
        field2465++;
        class65 var2 = this.field2454;
        synchronized (this.field2454) {
            this.field2454.method561((byte) -78);
        }
        class65 var3 = this.field2467;
        synchronized (this.field2467) {
            this.field2467.method561((byte) -78);
        }
        class545 var4 = this.field2468;
        synchronized (this.field2468) {
            this.field2468.method3046((byte) -126);
        }
        if (arg0 != 11813) {
            this.method1171(-13);
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(BLee;)Lgga;")
    public static final class295 method1172(byte arg0, class677 arg1) {
        field2449++;
        class760 var2 = class296.method1829((byte) 53, arg1);
        if (arg0 <= 66) {
            field2473 = null;
        }
        int var3 = arg1.method3802(20198);
        return new class295(var2.field10575, var2.field10571, var2.field10566, var2.field10567, var2.field10569, var3);
    }

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "(II)I")
    public static final int method1173(int arg0, int arg1) {
        return class671.field9152 == null ? 0 : class671.field9152[arg0][arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "(B)V")
    public static void method1174(byte arg0) {
        field2473 = null;
        field2472 = null;
        field2470 = null;
        int var1 = 24 % ((arg0 + 56) / 39);
        field2474 = null;
        field2466 = null;
        field2480 = null;
        field2482 = null;
        field2469 = null;
        field2476 = null;
    }

    @OriginalMember(owner = "client!uq", name = "c", descriptor = "(B)V")
    public final void method1175(byte arg0) {
        if (arg0 != 103) {
            this.field2454 = null;
        }
        field2452++;
        class545 var2 = this.field2468;
        synchronized (this.field2468) {
            this.field2468.method3046((byte) -128);
        }
    }

    @OriginalMember(owner = "client!uq", name = "c", descriptor = "(II)V")
    public final void method1176(int arg0, int arg1) {
        this.field2481 = arg1;
        field2460++;
        class65 var3 = this.field2467;
        synchronized (this.field2467) {
            this.field2467.method561((byte) -78);
        }
        if (arg0 != 36) {
            this.method1171(124);
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IZ)V")
    public final void method1177(int arg0, boolean arg1) {
        field2455++;
        if (arg1 == this.field2457) {
            return;
        }
        this.field2457 = arg1;
        this.method1171(11813);
        if (arg0 != 0) {
            this.field2457 = true;
        }
    }

    @OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(Lms;IZLoha;Lwu;Lwu;)V")
    public class163(class763 arg0, int arg1, boolean arg2, class743 arg3, class376 arg4, class376 arg5) {
        this.field2462 = arg5;
        this.field2457 = arg2;
        this.field2451 = arg4;
        this.field2464 = arg1;
        this.field2477 = arg3;
        if (this.field2451 == null) {
            this.field2463 = 0;
        } else {
            int var7 = this.field2451.method2198(0) - 1;
            this.field2463 = this.field2451.method2195(var7, 0) + var7 * 256;
        }
        this.field2478 = new String[] { null, null, class517.field6847.method2877(this.field2464, (byte) -108), null, null };
        this.field2483 = new String[] { null, null, null, null, class517.field6848.method2877(this.field2464, (byte) -108) };
    }
}
