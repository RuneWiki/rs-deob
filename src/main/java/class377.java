import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class377 extends class328 {

    @OriginalMember(owner = "client!go", name = "E", descriptor = "I")
    private int field5536 = 0;

    @OriginalMember(owner = "client!go", name = "M", descriptor = "I")
    private int field5544 = 0;

    @OriginalMember(owner = "client!go", name = "S", descriptor = "I")
    private int field5550 = 0;

    @OriginalMember(owner = "client!go", name = "D", descriptor = "Liu;")
    public static class517 field5535 = new class517(112, 0);

    @OriginalMember(owner = "client!go", name = "K", descriptor = "Lsq;")
    public static class442 field5542 = new class442();

    @OriginalMember(owner = "client!go", name = "B", descriptor = "I")
    public static int field5533;

    @OriginalMember(owner = "client!go", name = "C", descriptor = "I")
    public static int field5534;

    @OriginalMember(owner = "client!go", name = "F", descriptor = "I")
    private int field5537;

    @OriginalMember(owner = "client!go", name = "G", descriptor = "I")
    public static int field5538;

    @OriginalMember(owner = "client!go", name = "H", descriptor = "I")
    public static int field5539;

    @OriginalMember(owner = "client!go", name = "I", descriptor = "I")
    private int field5540;

    @OriginalMember(owner = "client!go", name = "J", descriptor = "I")
    private int field5541;

    @OriginalMember(owner = "client!go", name = "L", descriptor = "I")
    public static int field5543;

    @OriginalMember(owner = "client!go", name = "O", descriptor = "I")
    private int field5546;

    @OriginalMember(owner = "client!go", name = "P", descriptor = "I")
    public static int field5547;

    @OriginalMember(owner = "client!go", name = "Q", descriptor = "I")
    private int field5548;

    @OriginalMember(owner = "client!go", name = "R", descriptor = "I")
    private int field5549;

    @OriginalMember(owner = "client!go", name = "N", descriptor = "Ltb;")
    public static class408 field5545;

    @OriginalMember(owner = "client!go", name = "b", descriptor = "(II)[[I", line = 5)
    public final int[][] method7(int arg0, int arg1) {
        ++field5543;
        int[][] var3 = super.field4725.method1886((byte) 124, arg0);
        int var4 = -94 % ((arg1 - 46) / 54);
        if (super.field4725.field4371) {
            int[][] var5 = this.method2040(0, arg0, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var3[0];
            int[] var10 = var3[1];
            int[] var11 = var3[2];
            for (int var12 = 0; ~var12 > ~class449.field6539; ++var12) {
                this.method2291(126, var7[var12], var6[var12], var8[var12]);
                this.field5546 += this.field5550;
                this.field5537 += this.field5544;
                for (this.field5549 += this.field5536; this.field5549 < 0; this.field5549 += 4096) {
                }
                if (this.field5537 < 0) {
                    this.field5537 = 0;
                }
                while (~this.field5549 < -4097) {
                    this.field5549 -= 4096;
                }
                if (~this.field5546 > -1) {
                    this.field5546 = 0;
                }
                if (this.field5537 > 4096) {
                    this.field5537 = 4096;
                }
                if (~this.field5546 < -4097) {
                    this.field5546 = 4096;
                }
                this.method2289((byte) 33, this.field5537, this.field5549, this.field5546);
                var9[var12] = this.field5540;
                var10[var12] = this.field5548;
                var11[var12] = this.field5541;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(BIII)V", line = 78)
    private final void method2289(byte arg0, int arg1, int arg2, int arg3) {
        ++field5538;
        int var5 = ~arg3 < -2049 ? -(arg1 * arg3 >> 12) + arg3 - -arg1 : (4096 - -arg1) * arg3 >> 12;
        if (arg0 == 33) {
            if (~var5 >= -1) {
                this.field5540 = this.field5548 = this.field5541 = arg3;
            } else {
                int var6 = arg2 * 6;
                int var7 = -var5 + arg3 + arg3;
                int var8 = (var5 - var7 << 12) / var5;
                int var9 = var6 >> 12;
                int var10 = var6 - (var9 << 12);
                int var12 = var8 * var5 >> 12;
                int var13 = var10 * var12 >> 12;
                int var14 = var7 - -var13;
                int var15 = -var13 + var5;
                if (var9 != 0) {
                    if (var9 != 1) {
                        if (~var9 != -3) {
                            if (~var9 != -4) {
                                if (~var9 != -5) {
                                    if (var9 == 5) {
                                        this.field5540 = var5;
                                        this.field5548 = var7;
                                        this.field5541 = var15;
                                    }
                                } else {
                                    this.field5541 = var5;
                                    this.field5540 = var14;
                                    this.field5548 = var7;
                                }
                            } else {
                                this.field5548 = var15;
                                this.field5540 = var7;
                                this.field5541 = var5;
                            }
                        } else {
                            this.field5548 = var5;
                            this.field5541 = var14;
                            this.field5540 = var7;
                        }
                    } else {
                        this.field5541 = var7;
                        this.field5540 = var15;
                        this.field5548 = var5;
                    }
                } else {
                    this.field5548 = var14;
                    this.field5541 = var7;
                    this.field5540 = var5;
                }
            }
        }
    }

    @OriginalMember(owner = "client!go", name = "f", descriptor = "(I)V", line = 185)
    public static void method2290(int arg0) {
        field5535 = null;
        field5545 = null;
        field5542 = null;
        int var1 = -119 / ((arg0 - -84) / 41);
    }

    @OriginalMember(owner = "client!go", name = "<init>", descriptor = "()V", line = 304)
    public class377() {
        super(1, false);
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(BILco;)V", line = 203)
    public final void method1(byte arg0, int arg1, class268 arg2) {
        ++field5534;
        if (arg0 >= 75) {
            if (~arg1 != -1) {
                if (arg1 != 1) {
                    if (arg1 == 2) {
                        this.field5550 = (arg2.method1714(-31536) << 12) / 100;
                    }
                } else {
                    this.field5544 = (arg2.method1714(-31536) << 12) / 100;
                }
            } else {
                this.field5536 = arg2.method1730(13436);
            }
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IIII)V", line = 248)
    private final void method2291(int arg0, int arg1, int arg2, int arg3) {
        ++field5539;
        int var5 = ~arg2 < ~arg1 ? arg2 : arg1;
        int var6 = ~arg3 >= ~var5 ? var5 : arg3;
        int var7 = arg1 <= arg2 ? arg1 : arg2;
        int var8 = arg3 >= var7 ? var7 : arg3;
        int var9 = var6 - var8;
        this.field5546 = (var8 - -var6) / 2;
        if (~var9 >= -1) {
            this.field5549 = 0;
        } else {
            int var10 = (var6 - arg2 << 12) / var9;
            int var11 = (-arg1 + var6 << 12) / var9;
            int var12 = (-arg3 + var6 << 12) / var9;
            if (arg2 != var6) {
                if (arg1 != var6) {
                    this.field5549 = arg2 == var8 ? 12288 - -var11 : -var10 + 20480;
                } else {
                    this.field5549 = arg3 == var8 ? var10 + 4096 : -var12 + 12288;
                }
            } else {
                this.field5549 = ~arg1 == ~var8 ? var12 + 20480 : -var11 + 4096;
            }
            this.field5549 /= 6;
        }
        if (arg0 >= 123) {
            if (this.field5546 > 0 && this.field5546 < 4096) {
                this.field5537 = (var9 << 12) / (~this.field5546 < -2049 ? -(this.field5546 * 2) + 8192 : this.field5546 * 2);
            } else {
                this.field5537 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Ljava/lang/String;Lae;IB)Lei;", line = 316)
    public static final class329 method2292(String arg0, class40 arg1, int arg2, byte arg3) {
        ++field5533;
        if (arg2 == 0) {
            return arg1.method356(-14714, arg0);
        } else if (~arg2 == -2) {
            try {
                class630.method3565(arg1.field549, -1961, new Object[] { (new URL(arg1.field549.getCodeBase(), arg0)).toString() }, "openjs");
                class329 var4 = new class329();
                var4.field4739 = 1;
                return var4;
            } catch (Throwable var10) {
                class329 var5 = new class329();
                var5.field4739 = 2;
                return var5;
            }
        } else {
            if (arg3 < 31) {
                method2290(-120);
            }
            if (~arg2 == -3) {
                try {
                    arg1.field549.getAppletContext().showDocument(new URL(arg1.field549.getCodeBase(), arg0), "_blank");
                    class329 var6 = new class329();
                    var6.field4739 = 1;
                    return var6;
                } catch (Exception var11) {
                    class329 var7 = new class329();
                    var7.field4739 = 2;
                    return var7;
                }
            } else if (arg2 == 3) {
                try {
                    class630.method3564(arg1.field549, "loggedout", (byte) -126);
                } catch (Throwable var13) {
                }
                try {
                    arg1.field549.getAppletContext().showDocument(new URL(arg1.field549.getCodeBase(), arg0), "_top");
                    class329 var8 = new class329();
                    var8.field4739 = 1;
                    return var8;
                } catch (Exception var12) {
                    class329 var9 = new class329();
                    var9.field4739 = 2;
                    return var9;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }
}
