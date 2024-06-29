import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class31 extends class319 {

    @OriginalMember(owner = "client!o", name = "db", descriptor = "I")
    private int field471 = 0;

    @OriginalMember(owner = "client!o", name = "cb", descriptor = "I")
    private int field470 = -1;

    @OriginalMember(owner = "client!o", name = "ob", descriptor = "I")
    private int field482 = 0;

    @OriginalMember(owner = "client!o", name = "lb", descriptor = "I")
    private int field479 = 0;

    @OriginalMember(owner = "client!o", name = "Ab", descriptor = "I")
    private int field494 = 0;

    @OriginalMember(owner = "client!o", name = "Qb", descriptor = "Z")
    private boolean field510 = false;

    @OriginalMember(owner = "client!o", name = "Vb", descriptor = "Z")
    private boolean field515 = false;

    @OriginalMember(owner = "client!o", name = "Nb", descriptor = "I")
    private int field507;

    @OriginalMember(owner = "client!o", name = "ib", descriptor = "I")
    private int field476;

    @OriginalMember(owner = "client!o", name = "sb", descriptor = "I")
    public int field486;

    @OriginalMember(owner = "client!o", name = "Ib", descriptor = "I")
    private int field502;

    @OriginalMember(owner = "client!o", name = "Hb", descriptor = "I")
    public int field501;

    @OriginalMember(owner = "client!o", name = "Kb", descriptor = "I")
    public int field504;

    @OriginalMember(owner = "client!o", name = "Y", descriptor = "I")
    private int field466;

    @OriginalMember(owner = "client!o", name = "wb", descriptor = "I")
    private int field490;

    @OriginalMember(owner = "client!o", name = "Db", descriptor = "I")
    public int field497;

    @OriginalMember(owner = "client!o", name = "Rb", descriptor = "I")
    private int field511;

    @OriginalMember(owner = "client!o", name = "Gb", descriptor = "Z")
    private boolean field500;

    @OriginalMember(owner = "client!o", name = "bb", descriptor = "Lvq;")
    private class489 field469;

    @OriginalMember(owner = "client!o", name = "ub", descriptor = "Lsca;")
    public static class49 field488 = new class49(2);

    @OriginalMember(owner = "client!o", name = "ab", descriptor = "D")
    private double field468;

    @OriginalMember(owner = "client!o", name = "jb", descriptor = "D")
    private double field477;

    @OriginalMember(owner = "client!o", name = "pb", descriptor = "D")
    private double field483;

    @OriginalMember(owner = "client!o", name = "tb", descriptor = "D")
    private double field487;

    @OriginalMember(owner = "client!o", name = "vb", descriptor = "D")
    private double field489;

    @OriginalMember(owner = "client!o", name = "xb", descriptor = "D")
    private double field491;

    @OriginalMember(owner = "client!o", name = "Eb", descriptor = "D")
    private double field498;

    @OriginalMember(owner = "client!o", name = "Jb", descriptor = "D")
    private double field503;

    @OriginalMember(owner = "client!o", name = "Z", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!o", name = "eb", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "client!o", name = "fb", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!o", name = "gb", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!o", name = "hb", descriptor = "I")
    public static int field475;

    @OriginalMember(owner = "client!o", name = "kb", descriptor = "I")
    public static int field478;

    @OriginalMember(owner = "client!o", name = "mb", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!o", name = "nb", descriptor = "I")
    private int field481;

    @OriginalMember(owner = "client!o", name = "qb", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!o", name = "rb", descriptor = "I")
    private int field485;

    @OriginalMember(owner = "client!o", name = "yb", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!o", name = "zb", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!o", name = "Bb", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!o", name = "Cb", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!o", name = "Fb", descriptor = "I")
    public static int field499;

    @OriginalMember(owner = "client!o", name = "Mb", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!o", name = "Ob", descriptor = "I")
    public static int field508;

    @OriginalMember(owner = "client!o", name = "Pb", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!o", name = "Sb", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!o", name = "Tb", descriptor = "I")
    public static int field513;

    @OriginalMember(owner = "client!o", name = "Ub", descriptor = "I")
    public static int field514;

    @OriginalMember(owner = "client!o", name = "Wb", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "client!o", name = "Lb", descriptor = "Lsp;")
    private class663 field505;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BLha;)V", line = 6)
    public final void method32(byte arg0, class65 arg1) {
        ++field514;
        class500 var3 = this.method228(0, true, arg1);
        if (var3 != null) {
            class303 var4 = arg1.method450();
            var4.method972(this.field481);
            if (arg0 <= 69) {
                this.field500 = true;
            }
            var4.method969(this.field485);
            var4.method970((int) this.field491, (int) this.field468, (int) this.field489);
            this.field482 = var3.method335();
            this.field479 = var3.method339();
            this.method225(var3, (byte) -103, arg1, var4);
        }
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "(IIIIIIIIIIIIIZI)V", line = 29)
    public class31(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, boolean arg13, int arg14) {
        super(arg1, arg2, arg3, class783.method4338(arg1, arg3, -12040, arg4) - arg5, arg4, arg3 >> 9, arg3 >> 9, arg4 >> 9, arg4 >> 9, false, (byte) 0);
        this.field507 = arg14;
        this.field476 = arg9;
        this.field515 = false;
        this.field486 = arg7;
        this.field502 = arg0;
        this.field501 = arg6;
        this.field504 = arg12;
        this.field466 = arg5;
        this.field490 = arg8;
        this.field497 = arg11;
        this.field511 = arg10;
        this.field500 = arg13;
        int var16 = class784.field10798.method3973((byte) 81, this.field502).field8277;
        if (var16 != -1) {
            this.field469 = class6.field65.method1034(var16, 0);
        } else {
            this.field469 = null;
        }
    }

    @OriginalMember(owner = "client!o", name = "n", descriptor = "(I)Z", line = 56)
    public final boolean method59(int arg0) {
        if (arg0 != -1) {
            this.finalize();
        }
        ++field484;
        return false;
    }

    @OriginalMember(owner = "client!o", name = "l", descriptor = "(I)I", line = 68)
    public final int method28(int arg0) {
        if (arg0 != -13878) {
            this.field477 = 0.3755719478872897D;
        }
        ++field506;
        return this.field479;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V", line = 79)
    public static void method220(int arg0) {
        if (arg0 != 512) {
            field488 = null;
        }
        field488 = null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIILha;)Z", line = 94)
    public final boolean method33(int arg0, int arg1, int arg2, class65 arg3) {
        if (arg0 != 4161) {
            this.method19(-83);
        }
        ++field475;
        return false;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IBIII)V", line = 108)
    public final void method221(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        ++field516;
        if (!this.field515) {
            double var6 = (double) (arg2 - super.field2257);
            double var8 = (double) (-super.field2259 + arg4);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field489 = (double) this.field476 * var8 / var10 + (double) super.field2259;
            this.field491 = (double) this.field476 * var6 / var10 + (double) super.field2257;
            if (!this.field500) {
                this.field468 = (double) super.field2246;
            } else {
                this.field468 = (double) (class783.method4338(super.field2250, (int) this.field491, -12040, (int) this.field489) + -this.field466);
            }
        }
        double var12 = (double) (-arg0 + 1 + this.field486);
        this.field503 = ((double) arg2 - this.field491) / var12;
        if (arg1 != -4) {
            this.method22(-80, (class65) null);
        }
        this.field483 = ((double) arg4 + -this.field489) / var12;
        this.field487 = Math.sqrt(this.field503 * this.field503 + this.field483 * this.field483);
        if (this.field490 != -1) {
            if (!this.field515) {
                this.field498 = -this.field487 * Math.tan((double) this.field490 * 0.02454369D);
            }
            this.field477 = ((double) arg3 - this.field468 - this.field498 * var12) * 2.0D / (var12 * var12);
        } else {
            this.field498 = ((double) arg3 - this.field468) / var12;
        }
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(I)V", line = 159)
    public final void method222(int arg0) {
        ++field513;
        if (!this.field515) {
            if (this.field511 != arg0) {
                class124 var2 = null;
                if (~this.field511 <= -1) {
                    int var3 = this.field511 + -1;
                    class174 var4 = (class174) class234.field3169.method3953((long) var3, arg0 ^ 14);
                    if (var4 != null) {
                        var2 = var4.field2336;
                    }
                } else {
                    int var5 = -this.field511 + -1;
                    if (~class363.field5292 == ~var5) {
                        var2 = class551.field7456;
                    } else {
                        var2 = class599.field8149[var5];
                    }
                }
                if (var2 != null) {
                    super.field2259 = var2.field2259;
                    super.field2257 = var2.field2257;
                    super.field2246 = class783.method4338(super.field2250, var2.field2257, -12040, var2.field2259) - this.field466;
                    if (this.field507 >= 0) {
                        class208 var6 = var2.method1014((byte) -34);
                        int var7 = 0;
                        int var8 = 0;
                        if (var6.field2718 != null && var6.field2718[this.field507] != null) {
                            var8 += var6.field2718[this.field507][2];
                            var7 += var6.field2718[this.field507][0];
                        }
                        if (var6.field2767 != null && var6.field2767[this.field507] != null) {
                            var8 += var6.field2767[this.field507][2];
                            var7 += var6.field2767[this.field507][0];
                        }
                        if (var7 != 0 || ~var8 != -1) {
                            int var9 = var2.field1860.method3980(2);
                            int var10 = var9;
                            if (var2.field1877 != null && ~var2.field1877[this.field507] != 0) {
                                var10 = var2.field1877[this.field507];
                            }
                            int var11 = -var9 + var10 & 16383;
                            int var12 = class749.field10324[var11];
                            int var13 = class749.field10316[var11];
                            int var14 = var7 * var13 + var8 * var12 >> 14;
                            int var15 = var8 * var13 + -(var7 * var12) >> 14;
                            super.field2259 += var15;
                            super.field2257 += var14;
                        }
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lha;B)Lel;", line = 254)
    public final class574 method27(class65 arg0, byte arg1) {
        if (arg1 != -126) {
            this.field501 = 49;
        }
        ++field467;
        return null;
    }

    @OriginalMember(owner = "client!o", name = "k", descriptor = "(I)Z", line = 274)
    public final boolean method21(int arg0) {
        if (arg0 != 0) {
            return false;
        } else {
            ++field499;
            return this.field510;
        }
    }

    @OriginalMember(owner = "client!o", name = "finalize", descriptor = "()V", line = 287)
    protected final void finalize() {
        if (this.field505 != null) {
            this.field505.method3669();
        }
        ++field493;
    }

    @OriginalMember(owner = "client!o", name = "m", descriptor = "(I)I", line = 300)
    public final int method24(int arg0) {
        if (arg0 != 748449288) {
            this.method66(99);
        }
        ++field512;
        return this.field482;
    }

    @OriginalMember(owner = "client!o", name = "j", descriptor = "(I)V", line = 312)
    public final void method66(int arg0) {
        if (arg0 == -13514) {
            ++field480;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II)V", line = 328)
    public final void method223(int arg0, int arg1) {
        this.field491 += (double) arg1 * this.field503;
        this.field489 += (double) arg1 * this.field483;
        ++field495;
        this.field515 = true;
        if (this.field500) {
            this.field468 = (double) (class783.method4338(super.field2250, (int) this.field491, -12040, (int) this.field489) - this.field466);
        } else if (this.field490 != -1) {
            this.field468 += this.field477 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field498;
            this.field498 += (double) arg1 * this.field477;
        } else {
            this.field468 += (double) arg1 * this.field498;
        }
        this.field485 = 8192 + (int) (Math.atan2(this.field503, this.field483) * 2607.5945876176133D) & arg0;
        this.field481 = 16383 & (int) (2607.5945876176133D * Math.atan2(this.field498, this.field487));
        if (this.field469 != null) {
            this.field471 += arg1;
            while (true) {
                do {
                    do {
                        if (~this.field469.field6773[this.field494] <= ~this.field471) {
                            return;
                        }
                        this.field471 -= this.field469.field6773[this.field494];
                        ++this.field494;
                        if (~this.field494 <= ~this.field469.field6775.length) {
                            this.field494 -= this.field469.field6789;
                            if (~this.field494 > -1 || ~this.field469.field6775.length >= ~this.field494) {
                                this.field494 = 0;
                            }
                        }
                        this.field470 = this.field494 + 1;
                    } while (~this.field470 > ~this.field469.field6775.length);
                    this.field470 -= this.field469.field6789;
                } while (this.field470 >= 0 && ~this.field470 > ~this.field469.field6775.length);
                this.field470 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIIIII)V", line = 384)
    public static final void method224(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field508;
        if (arg1 >= -98) {
            field488 = null;
        }
        if (class174.field2335 <= arg0 && ~arg7 >= ~class751.field10402 && ~arg4 <= ~class523.field7178 && ~arg5 >= ~class495.field6845) {
            class462.method2737(arg5, 1, arg2, arg6, arg3, arg0, arg7, arg4);
        } else {
            class613.method3382(arg0, arg6, arg5, 0, arg2, arg7, arg3, arg4);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lka;BLha;Luu;)V", line = 402)
    private final void method225(class500 arg0, byte arg1, class65 arg2, class303 arg3) {
        ++field473;
        arg0.method296(arg3);
        class577[] var5 = arg0.method341();
        class263[] var6 = arg0.method308();
        if ((this.field505 == null || this.field505.field9163) && (var5 != null || var6 != null)) {
            this.field505 = class663.method3670(class100.field1401, true);
        }
        if (this.field505 != null) {
            this.field505.method3664(arg2, (long) class100.field1401, var5, var6, false);
            this.field505.method3668(super.field2250, super.field4600, super.field4595, super.field4590, super.field4585);
        }
        int var7 = 47 / ((-41 - arg1) / 60);
    }

    @OriginalMember(owner = "client!o", name = "h", descriptor = "(I)Z", line = 430)
    public final boolean method19(int arg0) {
        if (arg0 >= -87) {
            field488 = null;
        }
        ++field492;
        return false;
    }

    @OriginalMember(owner = "client!o", name = "o", descriptor = "(I)V", line = 447)
    public final void method226(int arg0) {
        super.field4600 = super.field4595 = (short) ((int) (this.field491 / 512.0D));
        if (arg0 < -122) {
            super.field4590 = super.field4585 = (short) ((int) (this.field489 / 512.0D));
            ++field496;
        }
    }

    @OriginalMember(owner = "client!o", name = "d", descriptor = "(B)V", line = 474)
    public final void method227(byte arg0) {
        if (this.field505 != null) {
            this.field505.method3669();
        }
        ++field472;
        if (arg0 != 55) {
            this.method22(61, (class65) null);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lha;Lwea;ZIIII)V", line = 491)
    public final void method60(class65 arg0, class167 arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field509;
        if (arg3 >= -16) {
            this.field503 = -1.7224802544073619D;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IZLha;)Lka;", line = 502)
    private final class500 method228(int arg0, boolean arg1, class65 arg2) {
        ++field478;
        if (!arg1) {
            field488 = null;
        }
        class608 var4 = class784.field10798.method3973((byte) 116, this.field502);
        return var4.method3372(arg0, arg2, this.field494, class6.field65, this.field471, 0, this.field470);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ILha;)Ldfa;", line = 516)
    public final class176 method22(int arg0, class65 arg1) {
        ++field474;
        class500 var3 = this.method228(2048, true, arg1);
        if (var3 == null) {
            return null;
        } else {
            class303 var4 = arg1.method450();
            var4.method972(this.field481);
            var4.method969(this.field485);
            var4.method970((int) this.field491, (int) this.field468, (int) this.field489);
            this.method225(var3, (byte) -105, arg1, var4);
            class176 var5 = class567.method3167(false, arg0 ^ arg0, 1);
            if (class200.field2658) {
                var3.method300(var4, var5.field2345[0], class330.field4773, 0);
            } else {
                var3.method292(var4, var5.field2345[0], 0);
            }
            if (this.field505 != null) {
                class515 var6 = this.field505.method3671();
                if (!class200.field2658) {
                    arg1.method524(var6);
                } else {
                    arg1.method532(var6, class330.field4773);
                }
            }
            this.field510 = var3.method326();
            this.field482 = var3.method335();
            this.field479 = var3.method339();
            return var5;
        }
    }
}
