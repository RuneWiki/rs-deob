import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class196 {

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "Lme;")
    private class668 field2555 = new class668(64);

    @OriginalMember(owner = "client!bb", name = "z", descriptor = "Lme;")
    public class668 field2575 = new class668(50);

    @OriginalMember(owner = "client!bb", name = "A", descriptor = "Lgea;")
    public class54 field2576 = new class54(250);

    @OriginalMember(owner = "client!bb", name = "B", descriptor = "Lefa;")
    private class324 field2577 = new class324();

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "Z")
    private boolean field2559;

    @OriginalMember(owner = "client!bb", name = "y", descriptor = "Lpe;")
    private class615 field2574;

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "I")
    public int field2560;

    @OriginalMember(owner = "client!bb", name = "E", descriptor = "Lat;")
    private class143 field2580;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "Lpe;")
    public class615 field2550;

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "I")
    public int field2558;

    @OriginalMember(owner = "client!bb", name = "D", descriptor = "[Ljava/lang/String;")
    private String[] field2579;

    @OriginalMember(owner = "client!bb", name = "C", descriptor = "[Ljava/lang/String;")
    private String[] field2578;

    @OriginalMember(owner = "client!bb", name = "v", descriptor = "[I")
    public static int[] field2571 = new int[4096];

    @OriginalMember(owner = "client!bb", name = "m", descriptor = "I")
    public static int field2562 = -1;

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "[[I")
    public static int[][] field2557 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "F")
    public static float field2561;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "I")
    public static int field2554;

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!bb", name = "n", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!bb", name = "o", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!bb", name = "q", descriptor = "I")
    public static int field2566;

    @OriginalMember(owner = "client!bb", name = "r", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!bb", name = "s", descriptor = "I")
    public static int field2568;

    @OriginalMember(owner = "client!bb", name = "t", descriptor = "I")
    public static int field2569;

    @OriginalMember(owner = "client!bb", name = "u", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!bb", name = "w", descriptor = "I")
    public static int field2572;

    @OriginalMember(owner = "client!bb", name = "x", descriptor = "I")
    public static int field2573;

    @OriginalMember(owner = "client!bb", name = "F", descriptor = "I")
    public int field2581;

    @OriginalMember(owner = "client!bb", name = "p", descriptor = "Lpe;")
    public static class615 field2565;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "Lkw;")
    public static class7 field2553;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)V")
    public final void method1287(byte arg0) {
        class668 var2 = this.field2555;
        synchronized (this.field2555) {
            this.field2555.method3658(0);
        }
        if (arg0 != -43) {
            this.method1300(-72);
        }
        field2567++;
        class668 var3 = this.field2575;
        synchronized (this.field2575) {
            this.field2575.method3658(arg0 ^ 0xFFFFFFD5);
        }
        class54 var4 = this.field2576;
        synchronized (this.field2576) {
            this.field2576.method476((byte) 86);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZI)V")
    public final void method1288(boolean arg0, int arg1) {
        class668 var3 = this.field2555;
        synchronized (this.field2555) {
            this.field2555.method3659(-128, arg1);
        }
        field2568++;
        class668 var4 = this.field2575;
        synchronized (this.field2575) {
            this.field2575.method3659(-116, arg1);
        }
        if (arg0) {
            this.method1287((byte) 46);
        }
        class54 var5 = this.field2576;
        synchronized (this.field2576) {
            this.field2576.method466(arg1, (byte) -104);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V")
    public final void method1289(int arg0) {
        field2570++;
        class54 var2 = this.field2576;
        synchronized (this.field2576) {
            this.field2576.method472(true);
            if (arg0 >= -32) {
                this.method1299(false, -37);
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)V")
    public static void method1290(int arg0) {
        if (arg0 != 2) {
            method1291(null, -114, 73, -90, 28, 11);
        }
        field2565 = null;
        field2557 = null;
        field2571 = null;
        field2553 = null;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lcp;IIIII)V")
    public static final void method1291(class242 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field3251 = 0;
        label58: for (int var6 = arg2; var6 <= arg4; var6++) {
            label56: for (int var7 = arg3; var7 <= arg5; var7++) {
                long var8 = class283.field3689[arg1][var6][var7];
                long var10 = 0L;
                while (true) {
                    label51: while (true) {
                        if (var10 > 48L) {
                            continue label56;
                        }
                        int var12 = (int) (var8 >>> (int) var10 & 0xFFFFL);
                        if (var12 <= 0) {
                            continue label56;
                        }
                        class357 var13 = class421.field5440[var12 - 1];
                        for (int var14 = 0; var14 < arg0.field3251; var14++) {
                            if (arg0.field3254[var14] == var13.field4631) {
                                var10 += 16L;
                                continue label51;
                            }
                        }
                        arg0.field3254[arg0.field3251++] = var13.field4631;
                        if (arg0.field3251 == 4) {
                            break label58;
                        }
                        var10 += 16L;
                    }
                }
            }
        }
        for (int var15 = arg0.field3251; var15 < 4; var15++) {
            arg0.field3254[var15] = null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)Lau;")
    public final class696 method1292(int arg0, int arg1) {
        field2569++;
        class668 var3 = this.field2555;
        class696 var4;
        synchronized (this.field2555) {
            var4 = (class696) this.field2555.method3655(-128, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class615 var5 = this.field2574;
        byte[] var6;
        synchronized (this.field2574) {
            var6 = this.field2574.method3346(-1, class154.method1113(70, arg1), class388.method2223(arg1, 255));
        }
        class696 var7 = new class696();
        var7.field9565 = arg1;
        var7.field9557 = this;
        var7.field9556 = new String[] { null, null, class604.field8131.method3280((byte) 76, this.field2560), null, null };
        var7.field9534 = new String[] { null, null, null, null, class604.field8132.method3280((byte) 84, this.field2560) };
        if (var6 != null) {
            var7.method3796(true, new class418(var6));
        }
        var7.method3792((byte) -74);
        if (var7.field9575 != -1) {
            var7.method3791(this.method1292(0, var7.field9575), this.method1292(0, var7.field9505), arg0 + 69);
        }
        if (~var7.field9547 != arg0) {
            var7.method3795(this.method1292(arg0, var7.field9540), false, this.method1292(0, var7.field9547));
        }
        if (!this.field2559 && var7.field9506) {
            var7.field9569 = class604.field8129.method3280((byte) -122, this.field2560);
            var7.field9534 = this.field2578;
            var7.field9520 = null;
            var7.field9509 = 0;
            var7.field9549 = false;
            var7.field9556 = this.field2579;
            if (var7.field9543 != null) {
                boolean var8 = false;
                for (class424 var9 = var7.field9543.method42((byte) 127); var9 != null; var9 = var7.field9543.method40(false)) {
                    class428 var10 = this.field2580.method1075((byte) -65, (int) var9.field5499);
                    if (var10.field5536) {
                        var9.method2438((byte) 115);
                    } else {
                        var8 = true;
                    }
                }
                if (!var8) {
                    var7.field9543 = null;
                }
            }
        }
        class668 var11 = this.field2555;
        synchronized (this.field2555) {
            this.field2555.method3650((long) arg1, arg0 ^ 0xFFFFFF8D, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZILta;IIIIILoa;Lto;ZLoa;)Lxa;")
    public final class511 method1293(boolean arg0, int arg1, class597 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class43 arg8, class210 arg9, boolean arg10, class43 arg11) {
        field2552++;
        class511 var13 = this.method1296(arg11, arg6, arg3, arg5, arg1, arg7, arg9, -59);
        if (arg4 != 10) {
            this.method1293(true, -104, null, 42, 73, -79, 95, -104, null, null, false, null);
        }
        if (var13 != null) {
            return var13;
        }
        class696 var14 = this.method1292(0, arg7);
        if (arg5 > 1 && var14.field9516 != null) {
            int var15 = -1;
            for (int var16 = 0; var16 < 10; var16++) {
                if (var14.field9538[var16] <= arg5 && var14.field9538[var16] != 0) {
                    var15 = var14.field9516[var16];
                }
            }
            if (var15 != -1) {
                var14 = this.method1292(0, var15);
            }
        }
        int[] var17 = var14.method3787(arg3, arg8, arg6, arg1, arg10, arg2, arg5, false, arg9, arg11);
        if (var17 == null) {
            return null;
        }
        class511 var18;
        if (arg0) {
            var18 = arg8.method381(var17, 0, 36, 36, 32);
        } else {
            var18 = arg11.method381(var17, 0, 36, 36, 32);
        }
        if (!arg0) {
            class324 var19 = new class324();
            var19.field4207 = arg11.field604;
            var19.field4200 = arg5;
            var19.field4202 = arg6;
            var19.field4208 = arg9 != null;
            var19.field4201 = arg3;
            var19.field4204 = arg1;
            var19.field4205 = arg7;
            this.field2576.method469(var19, true, var18);
        }
        return var18;
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(II)V")
    public final void method1294(int arg0, int arg1) {
        field2563++;
        this.field2581 = arg1;
        class668 var3 = this.field2575;
        synchronized (this.field2575) {
            this.field2575.method3656((byte) 0);
            if (arg0 != 29518) {
                field2561 = -0.58641106F;
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(B)V")
    public final void method1295(byte arg0) {
        if (arg0 >= -100) {
            this.field2577 = null;
        }
        class668 var2 = this.field2575;
        synchronized (this.field2575) {
            this.field2575.method3656((byte) 0);
        }
        field2573++;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Loa;IIIIILto;I)Lxa;")
    public final class511 method1296(class43 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class210 arg6, int arg7) {
        this.field2577.field4201 = arg2;
        this.field2577.field4204 = arg4;
        this.field2577.field4207 = arg0.field604;
        this.field2577.field4205 = arg5;
        if (arg7 >= -40) {
            return null;
        }
        this.field2577.field4208 = arg6 != null;
        this.field2577.field4202 = arg1;
        this.field2577.field4200 = arg3;
        field2554++;
        return (class511) this.field2576.method475(-20988, this.field2577);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;)V")
    public static final void method1297(String arg0, boolean arg1, String arg2) {
        field2564++;
        class222.field2906 = -1;
        if (!arg1) {
            field2562 = -106;
        }
        class57.field769 = 1;
        class540.method2866(false, arg2, 0, arg0);
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)V")
    public static final void method1298(int arg0) {
        if (arg0 != 4) {
            field2571 = null;
        }
        if (class630.field8792 == null) {
            class528 var1 = new class528();
            byte[] var2 = var1.method2813(128, 128, -1672, 16);
            class630.field8792 = class708.method3882(arg0 ^ 0xFFFFFF73, var2, false);
        }
        field2572++;
        if (class429.field5553 == null) {
            class38 var3 = new class38();
            byte[] var4 = var3.method304(128, 128, 16, (byte) 105);
            class429.field5553 = class708.method3882(-137, var4, false);
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(ZI)V")
    public final void method1299(boolean arg0, int arg1) {
        field2566++;
        if (arg0 == this.field2559) {
            return;
        }
        this.field2559 = arg0;
        if (arg1 != 871) {
            field2557 = null;
        }
        this.method1300(-97);
    }

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "(I)V")
    public final void method1300(int arg0) {
        class668 var2 = this.field2555;
        synchronized (this.field2555) {
            this.field2555.method3656((byte) 0);
        }
        field2556++;
        class668 var3 = this.field2575;
        synchronized (this.field2575) {
            int var4 = -80 % ((arg0 - 20) / 53);
            this.field2575.method3656((byte) 0);
        }
        class54 var5 = this.field2576;
        synchronized (this.field2576) {
            this.field2576.method472(true);
        }
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lvd;IZLat;Lpe;Lpe;)V")
    public class196(class635 arg0, int arg1, boolean arg2, class143 arg3, class615 arg4, class615 arg5) {
        this.field2559 = arg2;
        this.field2574 = arg4;
        this.field2560 = arg1;
        this.field2580 = arg3;
        this.field2550 = arg5;
        if (this.field2574 == null) {
            this.field2558 = 0;
        } else {
            int var7 = this.field2574.method3366(-98) - 1;
            this.field2558 = this.field2574.method3341(var7, -19046) + var7 * 256;
        }
        this.field2579 = new String[] { null, null, class604.field8131.method3280((byte) 75, this.field2560), null, null };
        this.field2578 = new String[] { null, null, null, null, class604.field8132.method3280((byte) 97, this.field2560) };
    }
}
