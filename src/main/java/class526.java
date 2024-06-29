import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class526 extends class379 {

    @OriginalMember(owner = "client!mo", name = "A", descriptor = "I")
    private int field7732 = 0;

    @OriginalMember(owner = "client!mo", name = "z", descriptor = "Z")
    private boolean field7731 = false;

    @OriginalMember(owner = "client!mo", name = "Q", descriptor = "Z")
    public boolean field7748 = false;

    @OriginalMember(owner = "client!mo", name = "N", descriptor = "Lao;")
    public class189 field7745;

    @OriginalMember(owner = "client!mo", name = "P", descriptor = "J")
    private long field7747;

    @OriginalMember(owner = "client!mo", name = "G", descriptor = "Lbu;")
    public class17 field7738;

    @OriginalMember(owner = "client!mo", name = "K", descriptor = "Ljv;")
    public class56 field7742;

    @OriginalMember(owner = "client!mo", name = "s", descriptor = "Lgn;")
    public class493 field7724;

    @OriginalMember(owner = "client!mo", name = "v", descriptor = "I")
    public static int field7727 = -2;

    @OriginalMember(owner = "client!mo", name = "y", descriptor = "Ltn;")
    public static class59 field7730 = new class59();

    @OriginalMember(owner = "client!mo", name = "j", descriptor = "I")
    private int field7715;

    @OriginalMember(owner = "client!mo", name = "k", descriptor = "I")
    public static int field7716;

    @OriginalMember(owner = "client!mo", name = "l", descriptor = "I")
    private int field7717;

    @OriginalMember(owner = "client!mo", name = "m", descriptor = "I")
    public int field7718;

    @OriginalMember(owner = "client!mo", name = "n", descriptor = "I")
    private int field7719;

    @OriginalMember(owner = "client!mo", name = "o", descriptor = "I")
    private int field7720;

    @OriginalMember(owner = "client!mo", name = "p", descriptor = "I")
    private int field7721;

    @OriginalMember(owner = "client!mo", name = "q", descriptor = "I")
    private int field7722;

    @OriginalMember(owner = "client!mo", name = "r", descriptor = "I")
    public static int field7723;

    @OriginalMember(owner = "client!mo", name = "t", descriptor = "I")
    private int field7725;

    @OriginalMember(owner = "client!mo", name = "u", descriptor = "I")
    private int field7726;

    @OriginalMember(owner = "client!mo", name = "w", descriptor = "I")
    public static int field7728;

    @OriginalMember(owner = "client!mo", name = "x", descriptor = "I")
    private int field7729;

    @OriginalMember(owner = "client!mo", name = "B", descriptor = "I")
    private int field7733;

    @OriginalMember(owner = "client!mo", name = "C", descriptor = "I")
    private int field7734;

    @OriginalMember(owner = "client!mo", name = "D", descriptor = "I")
    private int field7735;

    @OriginalMember(owner = "client!mo", name = "E", descriptor = "I")
    public static int field7736;

    @OriginalMember(owner = "client!mo", name = "F", descriptor = "I")
    private int field7737;

    @OriginalMember(owner = "client!mo", name = "H", descriptor = "I")
    private int field7739;

    @OriginalMember(owner = "client!mo", name = "I", descriptor = "I")
    public static int field7740;

    @OriginalMember(owner = "client!mo", name = "J", descriptor = "I")
    public int field7741;

    @OriginalMember(owner = "client!mo", name = "L", descriptor = "I")
    private int field7743;

    @OriginalMember(owner = "client!mo", name = "M", descriptor = "I")
    public int field7744;

    @OriginalMember(owner = "client!mo", name = "O", descriptor = "I")
    public int field7746;

    @OriginalMember(owner = "client!mo", name = "R", descriptor = "I")
    public static int field7749;

    @OriginalMember(owner = "client!mo", name = "S", descriptor = "I")
    private int field7750;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(II)V", line = 9)
    public static final void method3117(int arg0, int arg1) {
        field7740++;
        class215 var2 = class171.method1208(arg1, (byte) 118, arg0);
        var2.method1469((byte) -61);
    }

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "(I)V", line = 21)
    public final void method3118(int arg0) {
        this.field7722 = this.field7738.field194;
        this.field7720 = this.field7738.field182;
        this.field7743 = this.field7738.field190;
        this.field7717 = this.field7738.field191;
        this.field7721 = this.field7738.field183;
        this.field7726 = this.field7738.field181;
        this.field7725 = this.field7738.field184;
        this.field7735 = this.field7738.field192;
        field7736++;
        if (arg0 != 1) {
            method3122((byte) -46, 5, -1, null, 107, -30, 90);
        }
        this.field7734 = this.field7738.field186;
        if (this.field7726 == this.field7721 && this.field7721 == this.field7717 && this.field7725 == this.field7720 && this.field7734 == this.field7725 && this.field7743 == this.field7722 && this.field7743 == this.field7735) {
            this.field7731 = true;
            return;
        }
        this.field7731 = false;
        int var2 = (this.field7726 + this.field7721 + this.field7717) / 3;
        int var3 = (this.field7734 + this.field7720 + this.field7725) / 3;
        int var4 = (this.field7735 + this.field7722 + this.field7743) / 3;
        if (this.field7718 == var2 && this.field7744 == var3 && this.field7746 == var4) {
            return;
        }
        this.field7744 = var3;
        this.field7746 = var4;
        this.field7718 = var2;
        int var5 = this.field7721 - this.field7726;
        int var6 = this.field7725 - this.field7720;
        int var7 = this.field7743 - this.field7722;
        int var8 = this.field7717 - this.field7726;
        int var9 = this.field7734 - this.field7720;
        int var10 = this.field7735 - this.field7722;
        this.field7750 = var5 * var9 - (var6 * var8);
        this.field7739 = var6 * var10 - var7 * var9;
        this.field7715 = var7 * var8 - (var5 * var10);
        while (this.field7739 > 32767 || this.field7715 > 32767 || this.field7750 > 32767 || this.field7739 < -32767 || this.field7715 < -32767 || this.field7750 < -32767) {
            this.field7739 >>= 0x1;
            this.field7715 >>= 0x1;
            this.field7750 >>= 0x1;
        }
        int var11 = (int) Math.sqrt((double) (this.field7750 * this.field7750 + this.field7739 * this.field7739 + this.field7715 * this.field7715));
        if (var11 <= 0) {
            var11 = 1;
        }
        this.field7715 = this.field7715 * 32767 / var11;
        this.field7750 = this.field7750 * 32767 / var11;
        this.field7739 = this.field7739 * 32767 / var11;
        if (this.field7742.field592 <= 0 && this.field7742.field649 <= 0) {
            return;
        }
        int var12 = (int) (Math.atan2((double) this.field7750, (double) this.field7739) * 2607.5945876176133D);
        int var13 = (int) (Math.atan2((double) this.field7715, Math.sqrt((double) (this.field7739 * this.field7739 + (this.field7750 * this.field7750)))) * 2607.5945876176133D);
        this.field7733 = this.field7742.field592 - this.field7742.field625;
        this.field7729 = this.field7742.field649 - this.field7742.field638;
        this.field7719 = this.field7742.field625 + var12 - (this.field7733 >> 1);
        this.field7737 = this.field7742.field638 + var13 - (this.field7729 >> 1);
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(II)Z", line = 112)
    public static final boolean method3119(int arg0, int arg1) {
        int var2 = -96 / ((-arg0 - 50) / 42);
        field7728++;
        return arg1 >= 12 && arg1 <= 17;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IIJZLya;)V", line = 131)
    public final void method3120(int arg0, int arg1, long arg2, boolean arg3, class38 arg4) {
        if (this.field7748) {
            arg3 = false;
        } else if (this.field7742.field622 > class108.field1535) {
            arg3 = false;
        } else if (class278.field4085 > class352.field4886[class108.field1535]) {
            arg3 = false;
        } else if (this.field7731) {
            arg3 = false;
        } else if (this.field7742.field641 != -1) {
            int var7 = (int) (arg2 - this.field7747);
            if (this.field7742.field593 || var7 <= this.field7742.field641) {
                var7 %= this.field7742.field641;
            } else {
                arg3 = false;
            }
            if (!this.field7742.field605 && this.field7742.field648 > var7) {
                arg3 = false;
            }
            if (this.field7742.field605 && this.field7742.field648 <= var7) {
                arg3 = false;
            }
        }
        field7716++;
        if (arg3) {
            this.field7732 += (int) (((double) this.field7742.field652 + Math.random() * (double) (this.field7742.field589 - this.field7742.field652)) * (double) arg0);
            if (this.field7732 > 63) {
                int var8 = this.field7732 >> 6;
                this.field7732 &= 0x3F;
                for (int var9 = 0; var9 < var8; var9++) {
                    int var10;
                    int var11;
                    int var12;
                    if (this.field7742.field592 <= 0 && this.field7742.field649 <= 0) {
                        var10 = this.field7715;
                        var11 = this.field7739;
                        var12 = this.field7750;
                    } else {
                        int var13 = (int) (Math.random() * (double) this.field7733) + this.field7719;
                        int var14 = var13 & 0x3FFF;
                        int var15 = class340.field4724[var14];
                        int var16 = class340.field4715[var14];
                        int var17 = this.field7737 + (int) (Math.random() * (double) this.field7729);
                        int var18 = var17 & 0x1FFF;
                        int var19 = class340.field4724[var18];
                        int var20 = class340.field4715[var18];
                        byte var21 = 15;
                        var10 = (var20 << 0) * -1;
                        var11 = var16 * var19 >> var21;
                        var12 = var15 * var19 >> var21;
                    }
                    int var22 = (int) (Math.random() * 65535.0D);
                    int var23 = (int) (Math.random() * 65535.0D);
                    if ((var22 + var23) > 65535) {
                        var23 = 65535 - var23;
                        var22 = 65535 - var22;
                    }
                    int var24 = 65535 - (var22 + var23);
                    int var25 = this.field7726 * var22 + this.field7721 * var23 + (this.field7717 * var24) >> 16;
                    int var26 = this.field7734 * var24 + this.field7725 * var23 + this.field7720 * var22 >> 16;
                    int var27 = this.field7743 * var23 + this.field7735 * var24 + this.field7722 * var22 >> 16;
                    int var28 = (int) ((double) (this.field7742.field624 - this.field7742.field632) * Math.random()) + this.field7742.field632;
                    int var29 = this.field7742.field591 + ((int) ((double) (this.field7742.field600 - this.field7742.field591) * Math.random()));
                    int var30 = (int) (Math.random() * (double) (this.field7742.field650 - this.field7742.field611)) + this.field7742.field611;
                    int var31;
                    if (this.field7742.field647) {
                        double var32 = Math.random();
                        var31 = (int) (Math.random() * (double) this.field7742.field654 + (double) this.field7742.field626) << 24 | (int) ((double) this.field7742.field623 * var32 + (double) this.field7742.field603) << 16 | (int) ((double) this.field7742.field590 * var32 + (double) this.field7742.field608) << 8 | (int) ((double) this.field7742.field606 * var32 + (double) this.field7742.field655);
                    } else {
                        var31 = (int) ((double) this.field7742.field626 + Math.random() * (double) this.field7742.field654) << 24 | (int) (Math.random() * (double) this.field7742.field623 + (double) this.field7742.field603) << 16 | (int) ((double) this.field7742.field608 + Math.random() * (double) this.field7742.field590) << 8 | (int) (Math.random() * (double) this.field7742.field606 + (double) this.field7742.field655);
                    }
                    int var34 = this.field7742.field597;
                    if (!arg4.method348() && !this.field7742.field630) {
                        var34 = -1;
                    }
                    if (class99.field1330 == class62.field738) {
                        new class378(this, var25, var26, var27, var11, var10, var12, var28, var29, var31, var30, var34, this.field7742.field628, this.field7742.field595);
                    } else {
                        class378 var36 = class203.field2943[class62.field738];
                        class62.field738 = class62.field738 + 1 & 0x3FF;
                        var36.method2317(this, var25, var26, var27, var11, var10, var12, var28, var29, var31, var30, var34, this.field7742.field628, this.field7742.field595);
                    }
                }
            }
        }
        this.field7741 = 0;
        for (class378 var37 = (class378) this.field7724.method2955(62); var37 != null; var37 = (class378) this.field7724.method2952((byte) -99)) {
            var37.method2319(arg2, arg0);
            this.field7741++;
        }
        if (arg1 >= 44) {
            class213.field3063 += this.field7741;
        }
    }

    @OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(Lya;Lbu;Lao;J)V", line = 452)
    public class526(class38 arg0, class17 arg1, class189 arg2, long arg3) {
        this.field7745 = arg2;
        this.field7747 = arg3;
        this.field7738 = arg1;
        this.field7742 = this.field7738.method131((byte) 85);
        if (!arg0.method348() && this.field7742.field637 != -1) {
            this.field7742 = class417.method2546(112, this.field7742.field637);
        }
        this.field7724 = new class493();
        this.field7732 = (int) ((double) this.field7732 + Math.random() * 64.0D);
        this.method3118(1);
    }

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "(I)V", line = 301)
    public static void method3121(int arg0) {
        field7730 = null;
        if (arg0 != -1) {
            method3117(39, -57);
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(BII[FIII)V", line = 313)
    public static final void method3122(byte arg0, int arg1, int arg2, float[] arg3, int arg4, int arg5, int arg6) {
        field7723++;
        if (arg5 > 0 && !class305.method1900(200, arg5)) {
            throw new IllegalArgumentException("");
        } else if (arg6 <= 0 || class305.method1900(200, arg6)) {
            int var7 = class261.method1676((byte) -11, arg4);
            int var8 = 0;
            int var9 = arg5 < arg6 ? arg5 : arg6;
            int var10 = arg5 >> 1;
            int var11 = arg6 >> 1;
            if (arg0 <= 20) {
                method3117(-117, 29);
            }
            float[] var12 = arg3;
            float[] var13 = new float[var7 * var10 * var11];
            while (true) {
                OpenGL.glTexImage2Df(arg2, var8, arg1, arg5, arg6, 0, arg4, 5126, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg5 * var7;
                for (int var15 = 0; var15 < var7; var15++) {
                    int var17 = var15;
                    int var18 = var15;
                    int var19 = var14 + var15;
                    for (int var20 = 0; var20 < var11; var20++) {
                        for (int var21 = 0; var21 < var10; var21++) {
                            float var22 = var12[var18];
                            int var23 = var7 + var18;
                            float var24 = var12[var23] + var22;
                            float var25 = var12[var19] + var24;
                            var18 = var7 + var23;
                            int var26 = var7 + var19;
                            float var27 = var12[var26] + var25;
                            var19 = var7 + var26;
                            var13[var17] = var27 * 0.25F;
                            var17 += var7;
                        }
                        var18 += var14;
                        var19 += var14;
                    }
                }
                float[] var16 = var13;
                var13 = var12;
                arg5 = var10;
                var12 = var16;
                arg6 = var11;
                var8++;
                var10 >>= 0x1;
                var11 >>= 0x1;
                var9 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(ZJ)V", line = 415)
    public final void method3123(boolean arg0, long arg1) {
        field7749++;
        if (!arg0) {
            this.method3120(-108, -59, 45L, false, null);
        }
        for (class378 var4 = (class378) this.field7724.method2955(62); var4 != null; var4 = (class378) this.field7724.method2952((byte) -71)) {
            var4.method2316(arg1);
        }
    }
}
