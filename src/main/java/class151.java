import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class151 {

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "I")
    private int field2530 = 0;

    @OriginalMember(owner = "client!vd", name = "o", descriptor = "I")
    private int field2533 = -1;

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "[I")
    public static int[] field2531 = new int[32];

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "Lrc;")
    public static class9 field2525 = new class9(4);

    @OriginalMember(owner = "client!vd", name = "p", descriptor = "F")
    public static float field2534;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "I")
    public static int field2519;

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
    public int field2520;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "I")
    public static int field2521;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "I")
    public static int field2522;

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "I")
    public static int field2523;

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "I")
    public static int field2524;

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "I")
    public int field2526;

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "I")
    public int field2527;

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "I")
    public static int field2528;

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "I")
    public static int field2529;

    @OriginalMember(owner = "client!vd", name = "n", descriptor = "I")
    public int field2532;

    @OriginalMember(owner = "client!vd", name = "r", descriptor = "I")
    public static int field2536;

    @OriginalMember(owner = "client!vd", name = "q", descriptor = "Lbl;")
    public static class137 field2535;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lvb;ZLjava/lang/Object;)V")
    public static final void method1034(class131 arg0, boolean arg1, Object arg2) {
        field2528++;
        if (!arg1) {
            method1037(91, (byte) -21, (class189[]) null, 121, 10, (byte[]) null, false, -68, -87, -70, -39);
        }
        if (arg0.field2295 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg0.field2295.peekEvent() != null; var3++) {
            class245.method1636(!arg1, 1L);
        }
        if (arg2 != null) {
            arg0.field2295.postEvent(new ActionEvent(arg2, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IBILeh;)V")
    private final void method1035(int arg0, byte arg1, int arg2, class101 arg3) {
        field2524++;
        if (arg2 == 1) {
            this.field2530 = arg3.method658(22292);
            this.method1036(this.field2530, false);
        } else if (arg2 == 2) {
            this.field2533 = arg3.method677(false);
            if (this.field2533 == 65535) {
                this.field2533 = -1;
            }
        } else if (arg2 == 3) {
            arg3.method677(false);
        }
        if (arg1 != 40) {
            method1040(27);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IZ)V")
    private final void method1036(int arg0, boolean arg1) {
        field2529++;
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) ((arg0 & 0xFF79) >> 8) / 256.0D;
        double var7 = var3;
        double var9 = (double) (arg0 & 0xFF) / 256.0D;
        if (var5 < var3) {
            var7 = var5;
        }
        if (var9 < var7) {
            var7 = var9;
        }
        double var11 = var3;
        double var13 = 0.0D;
        if (var5 > var3) {
            var11 = var5;
        }
        double var15 = 0.0D;
        if (var11 < var9) {
            var11 = var9;
        }
        if (arg1) {
            method1037(22, (byte) 3, (class189[]) null, 61, -111, (byte[]) null, false, -41, -39, -19, -4);
        }
        double var17 = (var7 + var11) / 2.0D;
        this.field2532 = (int) (var17 * 256.0D);
        if (this.field2532 < 0) {
            this.field2532 = 0;
        } else if (this.field2532 > 255) {
            this.field2532 = 255;
        }
        if (var7 != var11) {
            if (var3 == var11) {
                var13 = (var5 - var9) / (var11 - var7);
            } else if (var5 == var11) {
                var13 = (var9 - var3) / (var11 - var7) + 2.0D;
            } else if (var9 == var11) {
                var13 = (var3 - var5) / (var11 - var7) + 4.0D;
            }
            if (var17 < 0.5D) {
                var15 = (var11 - var7) / (var7 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var7) / (2.0D - var11 - var7);
            }
        }
        if ((var17 > 0.5D)) {
            this.field2527 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field2527 = (int) (var15 * var17 * 512.0D);
        }
        this.field2520 = (int) (var15 * 256.0D);
        if (this.field2527 < 1) {
            this.field2527 = 1;
        }
        double var19 = var13 / 6.0D;
        if (this.field2520 < 0) {
            this.field2520 = 0;
        } else if (this.field2520 > 255) {
            this.field2520 = 255;
        }
        this.field2526 = (int) ((double) this.field2527 * var19);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IB[Lta;II[BZIIII)V")
    public static final void method1037(int arg0, byte arg1, class189[] arg2, int arg3, int arg4, byte[] arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10) {
        field2521++;
        if (arg1 > 0) {
            field2525 = null;
        }
        class101 var11 = new class101(arg5);
        int var12 = -1;
        while (true) {
            int var13 = var11.method664(-119);
            if (var13 == 0) {
                return;
            }
            var12 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var11.method692(27029);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 & 0x3F;
                int var17 = var14 >> 6 & 0x3F;
                int var18 = var11.method669((byte) 36);
                int var19 = var18 & 0x3;
                int var20 = var14 >> 12;
                int var21 = var18 >> 2;
                if (arg8 == var20 && arg4 <= var17 && (arg4 + 8) > var17 && arg7 <= var16 && var16 < arg7 + 8) {
                    class206 var22 = class10.method64(64, var12);
                    int var23 = class250.method1666(var22.field3404, var19, var16 & 0x7, false, var17 & 0x7, var22.field3377, arg10) + arg3;
                    int var24 = arg0 + class35.method227(var19, var22.field3404, arg10, var16 & 0x7, 12897, var22.field3377, var17 & 0x7);
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class189 var25 = null;
                        if (!arg6) {
                            int var26 = arg9;
                            if ((class229.field3862[1][var23][var24] & 0x2) == 2) {
                                var26 = arg9 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg2[var26];
                            }
                        }
                        class29.method193(arg10 + var19 & 0x3, arg9, !arg6, var21, var24, arg6, var25, 335442796, var23, var12, arg9);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(BZ)V")
    public static final void method1038(byte arg0, boolean arg1) {
        field2522++;
        if (arg0 != 5) {
            field2536 = 67;
        }
        class277.field4434 = arg1;
        class176.field2889 = !class96.method610(0);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILeh;I)V")
    public final void method1039(int arg0, class101 arg1, int arg2) {
        int var4 = -44 % ((37 - arg0) / 52);
        field2519++;
        while (true) {
            int var5 = arg1.method669((byte) 36);
            if (var5 == 0) {
                return;
            }
            this.method1035(arg2, (byte) 40, var5, arg1);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V")
    public static void method1040(int arg0) {
        field2531 = null;
        field2525 = null;
        field2535 = null;
        if (arg0 != 3) {
            field2534 = -0.6425093F;
        }
    }
}
