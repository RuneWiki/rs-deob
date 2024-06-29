import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public class class207 {

    @OriginalMember(owner = "client!rt", name = "f", descriptor = "Z")
    public boolean field2523 = true;

    @OriginalMember(owner = "client!rt", name = "q", descriptor = "I")
    private int field2534 = -1;

    @OriginalMember(owner = "client!rt", name = "n", descriptor = "Lqs;")
    private class558 field2531;

    @OriginalMember(owner = "client!rt", name = "l", descriptor = "I")
    private int field2529;

    @OriginalMember(owner = "client!rt", name = "s", descriptor = "Lifa;")
    private class393 field2536;

    @OriginalMember(owner = "client!rt", name = "k", descriptor = "I")
    private int field2528;

    @OriginalMember(owner = "client!rt", name = "r", descriptor = "Lco;")
    private class103 field2535;

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "I")
    public int field2519;

    @OriginalMember(owner = "client!rt", name = "c", descriptor = "I")
    private int field2520;

    @OriginalMember(owner = "client!rt", name = "g", descriptor = "I")
    private int field2524;

    @OriginalMember(owner = "client!rt", name = "m", descriptor = "Lcda;")
    private class154 field2530;

    @OriginalMember(owner = "client!rt", name = "j", descriptor = "Lwaa;")
    public static class652 field2527 = new class652(8);

    @OriginalMember(owner = "client!rt", name = "o", descriptor = "Lgv;")
    public static class72 field2532 = new class72();

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "I")
    public static int field2518;

    @OriginalMember(owner = "client!rt", name = "d", descriptor = "I")
    public static int field2521;

    @OriginalMember(owner = "client!rt", name = "e", descriptor = "I")
    public static int field2522;

    @OriginalMember(owner = "client!rt", name = "h", descriptor = "I")
    public static int field2525;

    @OriginalMember(owner = "client!rt", name = "i", descriptor = "I")
    public static int field2526;

    @OriginalMember(owner = "client!rt", name = "p", descriptor = "Ljn;")
    public static class668 field2533;

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(Z)V", line = 3)
    private final void method1242(boolean arg0) {
        field2525++;
        if (!this.field2523) {
            return;
        }
        this.field2523 = arg0;
        byte[] var2 = this.field2531.field8084;
        int var3 = 0;
        int var4 = this.field2531.field8078;
        int var5 = this.field2531.field8078 * this.field2529 + this.field2528;
        for (int var6 = -128; var6 < 0; var6++) {
            var3 = (var3 << 8) - var3;
            for (int var17 = -128; var17 < 0; var17++) {
                if (var2[var5++] != 0) {
                    var3++;
                }
            }
            var5 += var4 - 128;
        }
        if (this.field2535 != null && this.field2534 == var3) {
            this.field2523 = false;
            return;
        }
        this.field2534 = var3;
        int var7 = this.field2529 * var4 + this.field2528;
        int var8 = 0;
        if (!this.field2536.method481(class384.field5117, false, class279.field3793)) {
            if (class260.field3574 == null) {
                class260.field3574 = new int[16384];
            }
            int[] var9 = class260.field3574;
            for (int var10 = -128; var10 < 0; var10++) {
                for (int var11 = -128; var11 < 0; var11++) {
                    if (var2[var7] == 0) {
                        int var12 = 0;
                        if (var2[var7 - 1] != 0) {
                            var12++;
                        }
                        if (var2[var7 + 1] != 0) {
                            var12++;
                        }
                        if (var2[var7 - var4] != 0) {
                            var12++;
                        }
                        if (var2[var4 + var7] != 0) {
                            var12++;
                        }
                        var9[var8++] = var12 * 17 << 24;
                    } else {
                        var9[var8++] = 1140850688;
                    }
                    var7++;
                }
                var7 += this.field2531.field8078 - 128;
            }
            if (this.field2535 == null) {
                this.field2535 = this.field2536.method2307(128, false, class260.field3574, 128, 0);
                this.field2535.method757(false, false, -101);
            } else {
                this.field2535.method763(-28726, 128, 0, 128, class260.field3574, 0, 128, 0);
            }
            return;
        }
        if (class427.field6125 == null) {
            class427.field6125 = new byte[16384];
        }
        byte[] var13 = class427.field6125;
        for (int var14 = -128; var14 < 0; var14++) {
            for (int var15 = -128; var15 < 0; var15++) {
                if (var2[var7] == 0) {
                    int var16 = 0;
                    if (var2[var7 - 1] != 0) {
                        var16++;
                    }
                    if (var2[var7 + 1] != 0) {
                        var16++;
                    }
                    if (var2[var7 - var4] != 0) {
                        var16++;
                    }
                    if (var2[var4 + var7] != 0) {
                        var16++;
                    }
                    var13[var8++] = (byte) (var16 * 17);
                } else {
                    var13[var8++] = 68;
                }
                var7++;
            }
            var7 += this.field2531.field8078 - 128;
        }
        if (this.field2535 == null) {
            this.field2535 = this.field2536.method2363(128, false, class427.field6125, 128, class384.field5117, (byte) -113);
            this.field2535.method757(false, false, -64);
        } else {
            this.field2535.method762(false, 0, 128, 128, 128, 0, 0, class384.field5117, class427.field6125);
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(IILcda;)V", line = 175)
    public final void method1243(int arg0, int arg1, class154 arg2) {
        field2526++;
        if (arg0 > 0) {
            this.method1242(false);
            this.field2536.method2316((byte) 120, this.field2535);
            this.field2536.method528(0, class73.field1094, arg0, this.field2520, this.field2524 + 1 - this.field2520, arg2, (byte) 121);
        }
        if (arg1 < 88) {
            field2533 = null;
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(I)V", line = 195)
    public static void method1244(int arg0) {
        field2533 = null;
        field2532 = null;
        field2527 = null;
        if (arg0 != -28561) {
            field2532 = null;
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(ZLrm;)Ljava/lang/String;", line = 220)
    public static final String method1245(boolean arg0, class377 arg1) {
        field2521++;
        if (arg0) {
            field2527 = null;
        }
        return arg1.field5059 == null || arg1.field5059.length() <= 0 ? arg1.field5070 : arg1.field5070 + class424.field6070.method2561(class370.field4980, 0) + arg1.field5059;
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(DI)V", line = 236)
    public static final void method1246(double arg0, int arg1) {
        if (class233.field3117 != arg0) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
                class16.field307[var3] = var4 <= 255 ? var4 : 255;
            }
            class233.field3117 = arg0;
        }
        if (arg1 != 0) {
            field2527 = null;
        }
        field2518++;
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(B)V", line = 262)
    public final void method1247(byte arg0) {
        this.method1243(this.field2519, 126, this.field2530);
        int var2 = -18 % ((-arg0 - 24) / 54);
        field2522++;
    }

    @OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(Lifa;Lqs;Ljda;IIIII)V", line = 283)
    public class207(class393 arg0, class558 arg1, class206 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field2531 = arg1;
        this.field2529 = arg7;
        this.field2536 = arg0;
        this.field2528 = arg6;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var29 = (var12 + var13) * arg2.field702 + var11;
            for (int var30 = 0; var30 < var9; var30++) {
                short[] var31 = arg2.field2494[var29++];
                if (var31 != null) {
                    var10 += var31.length;
                }
            }
        }
        if (var10 <= 0) {
            this.field2535 = null;
            this.field2519 = 0;
        } else {
            this.field2520 = Integer.MAX_VALUE;
            this.field2524 = Integer.MIN_VALUE;
            this.field2530 = this.field2536.method475(false, -30974);
            this.field2530.method13(var10, -6482);
            for (int var14 = 0; var14 < 4; var14++) {
                Buffer var15 = this.field2530.method14(true, (byte) -60);
                if (var15 != null) {
                    Stream var16 = this.field2536.method2350(var15, true);
                    if (Stream.method3579()) {
                        for (int var23 = 0; var23 < var9; var23++) {
                            int var24 = (var12 + var23) * arg2.field702 + var11;
                            for (int var25 = 0; var25 < var9; var25++) {
                                short[] var26 = arg2.field2494[var24++];
                                if (var26 != null) {
                                    for (int var27 = 0; var27 < var26.length; var27++) {
                                        int var28 = var26[var27] & 0xFFFF;
                                        if (var28 > this.field2524) {
                                            this.field2524 = var28;
                                        }
                                        if (this.field2520 > var28) {
                                            this.field2520 = var28;
                                        }
                                        var16.method3581(var28);
                                    }
                                }
                            }
                        }
                    } else {
                        for (int var17 = 0; var17 < var9; var17++) {
                            int var18 = (var12 + var17) * arg2.field702 + var11;
                            for (int var19 = 0; var19 < var9; var19++) {
                                short[] var20 = arg2.field2494[var18++];
                                if (var20 != null) {
                                    for (int var21 = 0; var21 < var20.length; var21++) {
                                        int var22 = var20[var21] & 0xFFFF;
                                        if (this.field2520 > var22) {
                                            this.field2520 = var22;
                                        }
                                        if (var22 > this.field2524) {
                                            this.field2524 = var22;
                                        }
                                        var16.method3586(var22);
                                    }
                                }
                            }
                        }
                    }
                    var16.method3578();
                    if (this.field2530.method15(-1969)) {
                        break;
                    }
                }
            }
            this.field2519 = var10 / 3;
        }
    }
}
