import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cea")
public class class227 extends class90 {

    @OriginalMember(owner = "client!cea", name = "h", descriptor = "I")
    private int field3296 = 0;

    @OriginalMember(owner = "client!cea", name = "n", descriptor = "Z")
    public boolean field3302 = false;

    @OriginalMember(owner = "client!cea", name = "t", descriptor = "Laq;")
    public class172 field3308 = new class172();

    @OriginalMember(owner = "client!cea", name = "u", descriptor = "Laq;")
    private class172 field3309 = new class172();

    @OriginalMember(owner = "client!cea", name = "v", descriptor = "Z")
    private boolean field3310 = false;

    @OriginalMember(owner = "client!cea", name = "r", descriptor = "Lf;")
    public class788 field3306;

    @OriginalMember(owner = "client!cea", name = "s", descriptor = "J")
    private long field3307;

    @OriginalMember(owner = "client!cea", name = "i", descriptor = "Loea;")
    public class624 field3297;

    @OriginalMember(owner = "client!cea", name = "j", descriptor = "Liea;")
    public class506 field3298;

    @OriginalMember(owner = "client!cea", name = "m", descriptor = "Lem;")
    public class239 field3301;

    @OriginalMember(owner = "client!cea", name = "k", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!cea", name = "l", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!cea", name = "o", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "client!cea", name = "p", descriptor = "I")
    public int field3304;

    @OriginalMember(owner = "client!cea", name = "q", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!cea", name = "w", descriptor = "I")
    private int field3311;

    @OriginalMember(owner = "client!cea", name = "x", descriptor = "I")
    private int field3312;

    @OriginalMember(owner = "client!cea", name = "y", descriptor = "I")
    private int field3313;

    @OriginalMember(owner = "client!cea", name = "z", descriptor = "I")
    private int field3314;

    @OriginalMember(owner = "client!cea", name = "B", descriptor = "I")
    private int field3315;

    @OriginalMember(owner = "client!cea", name = "C", descriptor = "I")
    private int field3316;

    @OriginalMember(owner = "client!cea", name = "D", descriptor = "I")
    private int field3317;

    @OriginalMember(owner = "client!cea", name = "g", descriptor = "[[[J")
    public static long[][][] field3295;

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(ZIIJLha;)V")
    public final void method1548(boolean arg0, int arg1, int arg2, long arg3, class66 arg4) {
        if (this.field3302) {
            arg0 = false;
        } else if (this.field3298.field6953 > class393.field5437) {
            arg0 = false;
        } else if (class74.field1068[class393.field5437] < class426.field5823) {
            arg0 = false;
        } else if (this.field3310) {
            arg0 = false;
        } else if (this.field3298.field6957 != -1) {
            int var7 = (int) (arg3 - this.field3307);
            if (this.field3298.field6964 || this.field3298.field6957 >= var7) {
                var7 %= this.field3298.field6957;
            } else {
                arg0 = false;
            }
            if (!this.field3298.field6908 && this.field3298.field6916 > var7) {
                arg0 = false;
            }
            if (this.field3298.field6908 && var7 >= this.field3298.field6916) {
                arg0 = false;
            }
        }
        field3303++;
        if (arg0) {
            class85.field1167++;
            int var8 = (this.field3308.field2752 + this.field3308.field2754 + this.field3308.field2746) / 3;
            int var9 = (this.field3308.field2753 + this.field3308.field2749 + this.field3308.field2748) / 3;
            int var10 = (this.field3308.field2751 - (-this.field3308.field2744 - this.field3308.field2741)) / 3;
            if (this.field3308.field2742 != var8 || this.field3308.field2745 != var9 || this.field3308.field2747 != var10) {
                this.field3308.field2747 = var10;
                this.field3308.field2745 = var9;
                this.field3308.field2742 = var8;
                int var11 = this.field3308.field2752 - this.field3308.field2746;
                int var12 = this.field3308.field2753 - this.field3308.field2749;
                int var13 = this.field3308.field2744 - this.field3308.field2751;
                int var14 = this.field3308.field2754 - this.field3308.field2746;
                int var15 = this.field3308.field2748 - this.field3308.field2749;
                int var16 = this.field3308.field2741 - this.field3308.field2751;
                this.field3311 = var11 * var15 - (var12 * var14);
                this.field3315 = var12 * var16 - var13 * var15;
                this.field3313 = var13 * var14 - (var11 * var16);
                while (true) {
                    if (this.field3315 <= 32767 && this.field3313 <= 32767 && this.field3311 <= 32767 && this.field3315 >= -32767 && this.field3313 >= -32767 && this.field3311 >= -32767) {
                        int var17 = (int) Math.sqrt((double) (this.field3313 * this.field3313 + (this.field3315 * this.field3315 + (this.field3311 * this.field3311))));
                        if (var17 <= 0) {
                            var17 = 1;
                        }
                        this.field3315 = this.field3315 * 32767 / var17;
                        this.field3311 = this.field3311 * 32767 / var17;
                        this.field3313 = this.field3313 * 32767 / var17;
                        if (this.field3298.field6907 > 0 || this.field3298.field6962 > 0) {
                            int var18 = (int) (Math.atan2((double) this.field3311, (double) this.field3315) * 2607.5945876176133D);
                            int var19 = (int) (Math.atan2((double) this.field3313, Math.sqrt((double) (this.field3315 * this.field3315 + (this.field3311 * this.field3311)))) * 2607.5945876176133D);
                            this.field3312 = this.field3298.field6907 - this.field3298.field6912;
                            this.field3314 = this.field3298.field6962 - this.field3298.field6913;
                            this.field3316 = this.field3298.field6912 + var18 - (this.field3312 >> 1);
                            this.field3317 = this.field3298.field6913 + var19 - (this.field3314 >> 1);
                        }
                        break;
                    }
                    this.field3315 >>= 0x1;
                    this.field3313 >>= 0x1;
                    this.field3311 >>= 0x1;
                }
            }
            this.field3296 += (int) ((double) arg2 * (Math.random() * (double) (this.field3298.field6898 - this.field3298.field6928) + (double) this.field3298.field6928));
            if (this.field3296 > 63) {
                int var20 = this.field3296 >> 6;
                this.field3296 &= 0x3F;
                for (int var21 = 0; var21 < var20; var21++) {
                    int var22;
                    int var23;
                    int var24;
                    if (this.field3298.field6907 <= 0 && this.field3298.field6962 <= 0) {
                        var22 = this.field3313;
                        var23 = this.field3311;
                        var24 = this.field3315;
                    } else {
                        int var25 = this.field3316 + (int) ((double) this.field3312 * Math.random());
                        int var26 = var25 & 0x3FFF;
                        int var27 = class191.field2937[var26];
                        int var28 = class191.field2936[var26];
                        int var29 = (int) ((double) this.field3314 * Math.random()) + this.field3317;
                        int var30 = var29 & 0x1FFF;
                        int var31 = class191.field2937[var30];
                        int var32 = class191.field2936[var30];
                        byte var33 = 13;
                        var22 = (var32 << 1) * -1;
                        var24 = var28 * var31 >> var33;
                        var23 = var27 * var31 >> var33;
                    }
                    float var34 = (float) Math.random();
                    float var35 = (float) Math.random();
                    if (var34 + var35 > 1.0F) {
                        var34 = 1.0F - var34;
                        var35 = 1.0F - var35;
                    }
                    float var36 = 1.0F - var35 - var34;
                    int var37 = (int) ((float) this.field3308.field2754 * var36 + (float) this.field3308.field2752 * var35 + (float) this.field3308.field2746 * var34);
                    int var38 = (int) ((float) this.field3308.field2748 * var36 + (float) this.field3308.field2753 * var35 + (float) this.field3308.field2749 * var34);
                    int var39 = (int) ((float) this.field3308.field2741 * var36 + (float) this.field3308.field2751 * var34 + (float) this.field3308.field2744 * var35);
                    int var40 = (int) ((float) this.field3309.field2754 * var36 + (float) this.field3309.field2752 * var35 + (float) this.field3309.field2746 * var34);
                    int var41 = (int) ((float) this.field3309.field2748 * var36 + (float) this.field3309.field2753 * var35 + (float) this.field3309.field2749 * var34);
                    int var42 = (int) ((float) this.field3309.field2741 * var36 + (float) this.field3309.field2751 * var34 + (float) this.field3309.field2744 * var35);
                    int var43 = var37 - var40;
                    int var44 = var38 - var41;
                    int var45 = var39 - var42;
                    int var46 = (int) ((double) var43 * Math.random() + (double) var40);
                    int var47 = (int) ((double) var41 + Math.random() * (double) var44);
                    int var48 = (int) ((double) var42 + (double) var45 * Math.random());
                    int var49 = (int) ((double) (this.field3298.field6944 - this.field3298.field6894) * Math.random()) + this.field3298.field6894;
                    int var50 = this.field3298.field6899 + (int) (Math.random() * (double) (this.field3298.field6963 - this.field3298.field6899));
                    int var51 = this.field3298.field6918 + ((int) ((double) (this.field3298.field6931 - this.field3298.field6918) * Math.random()));
                    int var54;
                    if (this.field3298.field6933) {
                        double var52 = Math.random();
                        var54 = (int) ((double) this.field3298.field6936 * Math.random() + (double) this.field3298.field6946) << 24 | (int) ((double) this.field3298.field6919 * var52 + (double) this.field3298.field6922) << 16 | (int) ((double) this.field3298.field6952 * var52 + (double) this.field3298.field6921) << 8 | (int) ((double) this.field3298.field6948 * var52 + (double) this.field3298.field6937);
                    } else {
                        var54 = (int) ((double) this.field3298.field6946 + Math.random() * (double) this.field3298.field6936) << 24 | (int) (Math.random() * (double) this.field3298.field6948 + (double) this.field3298.field6937) | (int) (Math.random() * (double) this.field3298.field6919 + (double) this.field3298.field6922) << 16 | (int) ((double) this.field3298.field6921 + (double) this.field3298.field6952 * Math.random()) << 8;
                    }
                    int var55 = this.field3298.field6909;
                    if (!arg4.method534() && !this.field3298.field6935) {
                        var55 = -1;
                    }
                    if (class700.field9652 == class315.field4313) {
                        new class176(this, var46, var47, var48, var24, var22, var23, var49, var50, var54, var51, var55, this.field3298.field6942, this.field3298.field6929);
                    } else {
                        class176 var56 = class425.field5810[class700.field9652];
                        class700.field9652 = class700.field9652 + 1 & 0x3FF;
                        var56.method1333(this, var46, var47, var48, var24, var22, var23, var49, var50, var54, var51, var55, this.field3298.field6942, this.field3298.field6929);
                    }
                }
            }
        }
        if (arg1 > -53) {
            this.field3297 = null;
        }
        if (!this.field3308.method1312(this.field3309, 4)) {
            class172 var58 = this.field3309;
            this.field3309 = this.field3308;
            this.field3308 = var58;
            this.field3308.field2744 = this.field3297.field8703;
            this.field3308.field2742 = this.field3309.field2742;
            this.field3308.field2753 = this.field3297.field8695;
            this.field3308.field2752 = this.field3297.field8688;
            this.field3308.field2751 = this.field3297.field8704;
            this.field3308.field2741 = this.field3297.field8710;
            this.field3308.field2747 = this.field3309.field2747;
            this.field3308.field2749 = this.field3297.field8702;
            this.field3308.field2754 = this.field3297.field8701;
            this.field3308.field2748 = this.field3297.field8699;
            this.field3308.field2745 = this.field3309.field2745;
            this.field3308.field2746 = this.field3297.field8689;
        }
        this.field3304 = 0;
        for (class176 var59 = (class176) this.field3301.method1597((byte) -79); var59 != null; var59 = (class176) this.field3301.method1601(119)) {
            var59.method1330(arg3, arg2);
            this.field3304++;
        }
        class201.field3057 += this.field3304;
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(I)V")
    public static final void method1549(int arg0) {
        field3300++;
        int var1 = 0;
        if (arg0 < 63) {
            method1551(-16);
        }
        while (var1 < 100) {
            class169.field2716[var1] = null;
            var1++;
        }
        class488.field6587 = 0;
    }

    @OriginalMember(owner = "client!cea", name = "b", descriptor = "(I)V")
    public final void method1550(int arg0) {
        field3299++;
        this.field3308.field2744 = this.field3297.field8703;
        this.field3308.field2749 = this.field3297.field8702;
        this.field3308.field2746 = this.field3297.field8689;
        this.field3308.field2754 = this.field3297.field8701;
        this.field3308.field2751 = this.field3297.field8704;
        this.field3308.field2748 = this.field3297.field8699;
        this.field3308.field2753 = this.field3297.field8695;
        this.field3308.field2752 = this.field3297.field8688;
        this.field3308.field2741 = this.field3297.field8710;
        if (arg0 != 32767) {
            return;
        }
        if (this.field3308.field2752 == this.field3308.field2746 && this.field3308.field2754 == this.field3308.field2752 && this.field3308.field2753 == this.field3308.field2749 && this.field3308.field2753 == this.field3308.field2748 && this.field3308.field2751 == this.field3308.field2744 && this.field3308.field2744 == this.field3308.field2741) {
            this.field3310 = true;
        } else if (this.field3310) {
            this.field3309.field2741 = this.field3308.field2741;
            this.field3309.field2748 = this.field3308.field2748;
            this.field3309.field2749 = this.field3308.field2749;
            this.field3309.field2744 = this.field3308.field2744;
            this.field3309.field2753 = this.field3308.field2753;
            this.field3310 = false;
            this.field3309.field2754 = this.field3308.field2754;
            this.field3309.field2746 = this.field3308.field2746;
            this.field3309.field2751 = this.field3308.field2751;
            this.field3309.field2752 = this.field3308.field2752;
        }
    }

    @OriginalMember(owner = "client!cea", name = "c", descriptor = "(I)V")
    public static void method1551(int arg0) {
        if (arg0 != 0) {
            method1551(83);
        }
        field3295 = null;
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(JZLha;)V")
    public final void method1552(long arg0, boolean arg1, class66 arg2) {
        field3305++;
        if (arg1) {
            method1551(83);
        }
        for (class176 var5 = (class176) this.field3301.method1597((byte) 80); var5 != null; var5 = (class176) this.field3301.method1601(105)) {
            var5.method1331(arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!cea", name = "<init>", descriptor = "(Lha;Loea;Lf;J)V")
    public class227(class66 arg0, class624 arg1, class788 arg2, long arg3) {
        this.field3306 = arg2;
        this.field3307 = arg3;
        this.field3297 = arg1;
        this.field3298 = this.field3297.method3514(true);
        if (!arg0.method534() && this.field3298.field6910 != -1) {
            this.field3298 = class252.method1659(0, this.field3298.field6910);
        }
        this.field3301 = new class239();
        this.field3296 = (int) ((double) this.field3296 + Math.random() * 64.0D);
        this.method1550(32767);
        this.field3309.field2754 = this.field3308.field2754;
        this.field3309.field2749 = this.field3308.field2749;
        this.field3309.field2744 = this.field3308.field2744;
        this.field3309.field2751 = this.field3308.field2751;
        this.field3309.field2752 = this.field3308.field2752;
        this.field3309.field2746 = this.field3308.field2746;
        this.field3309.field2753 = this.field3308.field2753;
        this.field3309.field2741 = this.field3308.field2741;
        this.field3309.field2748 = this.field3308.field2748;
    }
}
