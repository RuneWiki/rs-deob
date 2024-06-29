import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public class class593 extends class609 {

    @OriginalMember(owner = "client!or", name = "i", descriptor = "Z")
    public boolean field8371 = false;

    @OriginalMember(owner = "client!or", name = "q", descriptor = "I")
    private int field8379 = 0;

    @OriginalMember(owner = "client!or", name = "n", descriptor = "Ljl;")
    public class243 field8376 = new class243();

    @OriginalMember(owner = "client!or", name = "s", descriptor = "Ljl;")
    private class243 field8381 = new class243();

    @OriginalMember(owner = "client!or", name = "v", descriptor = "Z")
    private boolean field8384 = false;

    @OriginalMember(owner = "client!or", name = "m", descriptor = "Lmca;")
    public class29 field8375;

    @OriginalMember(owner = "client!or", name = "f", descriptor = "J")
    private long field8368;

    @OriginalMember(owner = "client!or", name = "l", descriptor = "Llea;")
    public class568 field8374;

    @OriginalMember(owner = "client!or", name = "h", descriptor = "Lnw;")
    public class542 field8370;

    @OriginalMember(owner = "client!or", name = "r", descriptor = "Lli;")
    public class392 field8380;

    @OriginalMember(owner = "client!or", name = "e", descriptor = "Z")
    public static boolean field8367 = false;

    @OriginalMember(owner = "client!or", name = "p", descriptor = "I")
    public static int field8378 = 0;

    @OriginalMember(owner = "client!or", name = "g", descriptor = "I")
    public int field8369;

    @OriginalMember(owner = "client!or", name = "j", descriptor = "I")
    public static int field8372;

    @OriginalMember(owner = "client!or", name = "k", descriptor = "I")
    public static int field8373;

    @OriginalMember(owner = "client!or", name = "o", descriptor = "I")
    public static int field8377;

    @OriginalMember(owner = "client!or", name = "t", descriptor = "I")
    private int field8382;

    @OriginalMember(owner = "client!or", name = "u", descriptor = "I")
    private int field8383;

    @OriginalMember(owner = "client!or", name = "w", descriptor = "I")
    private int field8385;

    @OriginalMember(owner = "client!or", name = "x", descriptor = "I")
    private int field8386;

    @OriginalMember(owner = "client!or", name = "y", descriptor = "I")
    private int field8387;

    @OriginalMember(owner = "client!or", name = "z", descriptor = "I")
    private int field8388;

    @OriginalMember(owner = "client!or", name = "A", descriptor = "I")
    private int field8389;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(B)V", line = 14)
    public final void method3360(byte arg0) {
        this.field8376.field3777 = this.field8374.field8004;
        this.field8376.field3774 = this.field8374.field7994;
        this.field8376.field3780 = this.field8374.field7996;
        this.field8376.field3779 = this.field8374.field8003;
        this.field8376.field3776 = this.field8374.field7991;
        this.field8376.field3783 = this.field8374.field8002;
        this.field8376.field3771 = this.field8374.field7992;
        this.field8376.field3786 = this.field8374.field7993;
        field8377++;
        this.field8376.field3775 = this.field8374.field7983;
        if (arg0 != -77) {
            this.method3361(-66L, (byte) -11, null);
        }
        if (this.field8376.field3786 == this.field8376.field3775 && this.field8376.field3786 == this.field8376.field3777 && this.field8376.field3783 == this.field8376.field3776 && this.field8376.field3780 == this.field8376.field3776 && this.field8376.field3774 == this.field8376.field3771 && this.field8376.field3779 == this.field8376.field3771) {
            this.field8384 = true;
        } else if (this.field8384) {
            this.field8381.field3779 = this.field8376.field3779;
            this.field8381.field3771 = this.field8376.field3771;
            this.field8381.field3774 = this.field8376.field3774;
            this.field8381.field3783 = this.field8376.field3783;
            this.field8381.field3780 = this.field8376.field3780;
            this.field8384 = false;
            this.field8381.field3775 = this.field8376.field3775;
            this.field8381.field3786 = this.field8376.field3786;
            this.field8381.field3777 = this.field8376.field3777;
            this.field8381.field3776 = this.field8376.field3776;
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(JBLr;)V", line = 60)
    public final void method3361(long arg0, byte arg1, class166 arg2) {
        field8373++;
        if (arg1 != 124) {
            this.method3360((byte) -14);
        }
        for (class543 var5 = (class543) this.field8380.method2417(false); var5 != null; var5 = (class543) this.field8380.method2414(true)) {
            var5.method3080(arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Lr;Llea;Lmca;J)V", line = 366)
    public class593(class166 arg0, class568 arg1, class29 arg2, long arg3) {
        this.field8375 = arg2;
        this.field8368 = arg3;
        this.field8374 = arg1;
        this.field8370 = this.field8374.method3232(-111);
        if (!arg0.method129() && this.field8370.field7571 != -1) {
            this.field8370 = class668.method3702(26442, this.field8370.field7571);
        }
        this.field8380 = new class392();
        this.field8379 = (int) ((double) this.field8379 + Math.random() * 64.0D);
        this.method3360((byte) -77);
        this.field8381.field3777 = this.field8376.field3777;
        this.field8381.field3771 = this.field8376.field3771;
        this.field8381.field3786 = this.field8376.field3786;
        this.field8381.field3783 = this.field8376.field3783;
        this.field8381.field3780 = this.field8376.field3780;
        this.field8381.field3776 = this.field8376.field3776;
        this.field8381.field3779 = this.field8376.field3779;
        this.field8381.field3775 = this.field8376.field3775;
        this.field8381.field3774 = this.field8376.field3774;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(BIJZLr;)V", line = 89)
    public final void method3362(byte arg0, int arg1, long arg2, boolean arg3, class166 arg4) {
        if (arg0 != 38) {
            this.field8375 = null;
        }
        if (this.field8371) {
            arg3 = false;
        } else if (class546.field7679 < this.field8370.field7580) {
            arg3 = false;
        } else if (class705.field9918 > class270.field4059[class546.field7679]) {
            arg3 = false;
        } else if (this.field8384) {
            arg3 = false;
        } else if (this.field8370.field7637 != -1) {
            int var7 = (int) (arg2 - this.field8368);
            if (this.field8370.field7617 || this.field8370.field7637 >= var7) {
                var7 %= this.field8370.field7637;
            } else {
                arg3 = false;
            }
            if (!this.field8370.field7613 && this.field8370.field7611 > var7) {
                arg3 = false;
            }
            if (this.field8370.field7613 && var7 >= this.field8370.field7611) {
                arg3 = false;
            }
        }
        field8372++;
        if (arg3) {
            class626.field8771++;
            int var8 = (this.field8376.field3786 + this.field8376.field3775 + this.field8376.field3777) / 3;
            int var9 = (this.field8376.field3783 + this.field8376.field3780 + this.field8376.field3776) / 3;
            int var10 = (this.field8376.field3774 + this.field8376.field3771 + this.field8376.field3779) / 3;
            if (this.field8376.field3778 != var8 || this.field8376.field3770 != var9 || this.field8376.field3784 != var10) {
                this.field8376.field3778 = var8;
                this.field8376.field3770 = var9;
                this.field8376.field3784 = var10;
                int var11 = this.field8376.field3786 - this.field8376.field3775;
                int var12 = this.field8376.field3776 - this.field8376.field3783;
                int var13 = this.field8376.field3771 - this.field8376.field3774;
                int var14 = this.field8376.field3777 - this.field8376.field3775;
                int var15 = this.field8376.field3780 - this.field8376.field3783;
                int var16 = this.field8376.field3779 - this.field8376.field3774;
                this.field8383 = var11 * var15 - var12 * var14;
                this.field8382 = var12 * var16 - (var13 * var15);
                this.field8386 = var13 * var14 - (var11 * var16);
                while (true) {
                    if (this.field8382 <= 32767 && this.field8386 <= 32767 && this.field8383 <= 32767 && this.field8382 >= -32767 && this.field8386 >= -32767 && this.field8383 >= -32767) {
                        int var17 = (int) Math.sqrt((double) (this.field8383 * this.field8383 + this.field8382 * this.field8382 + (this.field8386 * this.field8386)));
                        if (var17 <= 0) {
                            var17 = 1;
                        }
                        this.field8386 = this.field8386 * 32767 / var17;
                        this.field8382 = this.field8382 * 32767 / var17;
                        this.field8383 = this.field8383 * 32767 / var17;
                        if (this.field8370.field7587 > 0 || this.field8370.field7584 > 0) {
                            int var18 = (int) (Math.atan2((double) this.field8383, (double) this.field8382) * 2607.5945876176133D);
                            int var19 = (int) (Math.atan2((double) this.field8386, Math.sqrt((double) (this.field8383 * this.field8383 + this.field8382 * this.field8382))) * 2607.5945876176133D);
                            this.field8388 = this.field8370.field7587 - this.field8370.field7625;
                            this.field8389 = this.field8370.field7584 - this.field8370.field7622;
                            this.field8385 = var18 + this.field8370.field7625 - (this.field8388 >> 1);
                            this.field8387 = this.field8370.field7622 + var19 - (this.field8389 >> 1);
                        }
                        break;
                    }
                    this.field8383 >>= 0x1;
                    this.field8382 >>= 0x1;
                    this.field8386 >>= 0x1;
                }
            }
            this.field8379 += (int) ((double) arg1 * ((double) (this.field8370.field7608 - this.field8370.field7573) * Math.random() + (double) this.field8370.field7573));
            if (this.field8379 > 63) {
                int var20 = this.field8379 >> 6;
                this.field8379 &= 0x3F;
                for (int var21 = 0; var21 < var20; var21++) {
                    int var22;
                    int var23;
                    int var24;
                    if (this.field8370.field7587 <= 0 && this.field8370.field7584 <= 0) {
                        var22 = this.field8383;
                        var23 = this.field8386;
                        var24 = this.field8382;
                    } else {
                        int var25 = (int) (Math.random() * (double) this.field8388) + this.field8385;
                        int var26 = var25 & 0x3FFF;
                        int var27 = class189.field2719[var26];
                        int var28 = class189.field2721[var26];
                        int var29 = this.field8387 + (int) ((double) this.field8389 * Math.random());
                        int var30 = var29 & 0x1FFF;
                        int var31 = class189.field2719[var30];
                        int var32 = class189.field2721[var30];
                        byte var33 = 13;
                        var23 = (var32 << 1) * -1;
                        var24 = var28 * var31 >> var33;
                        var22 = var27 * var31 >> var33;
                    }
                    float var34 = (float) Math.random();
                    float var35 = (float) Math.random();
                    if (var34 + var35 > 1.0F) {
                        var35 = 1.0F - var35;
                        var34 = 1.0F - var34;
                    }
                    float var36 = 1.0F - (var34 + var35);
                    int var37 = (int) ((float) this.field8376.field3777 * var36 + (float) this.field8376.field3786 * var35 + (float) this.field8376.field3775 * var34);
                    int var38 = (int) ((float) this.field8376.field3780 * var36 + (float) this.field8376.field3783 * var34 + (float) this.field8376.field3776 * var35);
                    int var39 = (int) ((float) this.field8376.field3779 * var36 + (float) this.field8376.field3774 * var34 + (float) this.field8376.field3771 * var35);
                    int var40 = (int) ((float) this.field8381.field3777 * var36 + (float) this.field8381.field3786 * var35 + (float) this.field8381.field3775 * var34);
                    int var41 = (int) ((float) this.field8381.field3780 * var36 + (float) this.field8381.field3783 * var34 + (float) this.field8381.field3776 * var35);
                    int var42 = (int) ((float) this.field8381.field3779 * var36 + (float) this.field8381.field3774 * var34 + (float) this.field8381.field3771 * var35);
                    int var43 = var37 - var40;
                    int var44 = var38 - var41;
                    int var45 = var39 - var42;
                    int var46 = (int) ((double) var43 * Math.random() + (double) var40);
                    int var47 = (int) ((double) var41 + (double) var44 * Math.random());
                    int var48 = (int) ((double) var42 + Math.random() * (double) var45);
                    int var49 = this.field8370.field7600 + (int) (Math.random() * (double) (this.field8370.field7631 - this.field8370.field7600));
                    int var50 = (int) (Math.random() * (double) (this.field8370.field7577 - this.field8370.field7616)) + this.field8370.field7616;
                    int var51 = this.field8370.field7583 + (int) ((double) (this.field8370.field7628 - this.field8370.field7583) * Math.random());
                    int var52;
                    if (this.field8370.field7620) {
                        double var53 = Math.random();
                        var52 = (int) ((double) this.field8370.field7591 + Math.random() * (double) this.field8370.field7598) << 24 | (int) ((double) this.field8370.field7636 * var53 + (double) this.field8370.field7590) | (int) ((double) this.field8370.field7603 * var53 + (double) this.field8370.field7596) << 8 | (int) ((double) this.field8370.field7633 * var53 + (double) this.field8370.field7585) << 16;
                    } else {
                        var52 = (int) ((double) this.field8370.field7598 * Math.random() + (double) this.field8370.field7591) << 24 | (int) ((double) this.field8370.field7596 + Math.random() * (double) this.field8370.field7603) << 8 | (int) ((double) this.field8370.field7633 * Math.random() + (double) this.field8370.field7585) << 16 | (int) (Math.random() * (double) this.field8370.field7636 + (double) this.field8370.field7590);
                    }
                    int var55 = this.field8370.field7569;
                    if (!arg4.method129() && !this.field8370.field7566) {
                        var55 = -1;
                    }
                    if (class680.field9605 == class564.field7954) {
                        new class543(this, var46, var47, var48, var24, var23, var22, var49, var50, var52, var51, var55, this.field8370.field7635, this.field8370.field7588);
                    } else {
                        class543 var56 = class21.field280[class680.field9605];
                        class680.field9605 = class680.field9605 + 1 & 0x3FF;
                        var56.method3079(this, var46, var47, var48, var24, var23, var22, var49, var50, var52, var51, var55, this.field8370.field7635, this.field8370.field7588);
                    }
                }
            }
        }
        if (!this.field8376.method1650(this.field8381, 125)) {
            class243 var58 = this.field8381;
            this.field8381 = this.field8376;
            this.field8376 = var58;
            this.field8376.field3783 = this.field8374.field8002;
            this.field8376.field3774 = this.field8374.field7994;
            this.field8376.field3776 = this.field8374.field7991;
            this.field8376.field3777 = this.field8374.field8004;
            this.field8376.field3779 = this.field8374.field8003;
            this.field8376.field3780 = this.field8374.field7996;
            this.field8376.field3771 = this.field8374.field7992;
            this.field8376.field3775 = this.field8374.field7983;
            this.field8376.field3786 = this.field8374.field7993;
        }
        this.field8369 = 0;
        for (class543 var59 = (class543) this.field8380.method2417(false); var59 != null; var59 = (class543) this.field8380.method2414(true)) {
            var59.method3081(arg2, arg1);
            this.field8369++;
        }
        class505.field7153 += this.field8369;
    }
}
