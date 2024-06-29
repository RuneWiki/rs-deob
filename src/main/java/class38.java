import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class38 extends class294 {

    @OriginalMember(owner = "client!wg", name = "k", descriptor = "Z")
    private boolean field493 = false;

    @OriginalMember(owner = "client!wg", name = "m", descriptor = "Z")
    public boolean field495 = false;

    @OriginalMember(owner = "client!wg", name = "U", descriptor = "I")
    private int field527 = 0;

    @OriginalMember(owner = "client!wg", name = "J", descriptor = "Lhn;")
    public class59 field517;

    @OriginalMember(owner = "client!wg", name = "Q", descriptor = "J")
    private long field524;

    @OriginalMember(owner = "client!wg", name = "x", descriptor = "Lqt;")
    public class275 field506;

    @OriginalMember(owner = "client!wg", name = "D", descriptor = "Lrr;")
    public class283 field511;

    @OriginalMember(owner = "client!wg", name = "O", descriptor = "Lsc;")
    public class250 field522;

    @OriginalMember(owner = "client!wg", name = "P", descriptor = "Lrt;")
    public static class124 field523 = new class124(2);

    @OriginalMember(owner = "client!wg", name = "l", descriptor = "I")
    private int field494;

    @OriginalMember(owner = "client!wg", name = "n", descriptor = "I")
    private int field496;

    @OriginalMember(owner = "client!wg", name = "o", descriptor = "I")
    public int field497;

    @OriginalMember(owner = "client!wg", name = "p", descriptor = "I")
    public int field498;

    @OriginalMember(owner = "client!wg", name = "q", descriptor = "I")
    private int field499;

    @OriginalMember(owner = "client!wg", name = "r", descriptor = "I")
    public int field500;

    @OriginalMember(owner = "client!wg", name = "s", descriptor = "I")
    private int field501;

    @OriginalMember(owner = "client!wg", name = "t", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client!wg", name = "u", descriptor = "I")
    private int field503;

    @OriginalMember(owner = "client!wg", name = "v", descriptor = "I")
    private int field504;

    @OriginalMember(owner = "client!wg", name = "w", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!wg", name = "y", descriptor = "I")
    private int field507;

    @OriginalMember(owner = "client!wg", name = "z", descriptor = "I")
    private int field508;

    @OriginalMember(owner = "client!wg", name = "A", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!wg", name = "C", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "client!wg", name = "E", descriptor = "I")
    private int field512;

    @OriginalMember(owner = "client!wg", name = "F", descriptor = "I")
    public static int field513;

    @OriginalMember(owner = "client!wg", name = "G", descriptor = "I")
    private int field514;

    @OriginalMember(owner = "client!wg", name = "H", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!wg", name = "I", descriptor = "I")
    private int field516;

    @OriginalMember(owner = "client!wg", name = "K", descriptor = "I")
    private int field518;

    @OriginalMember(owner = "client!wg", name = "L", descriptor = "I")
    private int field519;

    @OriginalMember(owner = "client!wg", name = "M", descriptor = "I")
    private int field520;

    @OriginalMember(owner = "client!wg", name = "N", descriptor = "I")
    private int field521;

    @OriginalMember(owner = "client!wg", name = "S", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "client!wg", name = "T", descriptor = "I")
    private int field526;

    @OriginalMember(owner = "client!wg", name = "V", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!wg", name = "W", descriptor = "I")
    public int field529;

    @OriginalMember(owner = "client!wg", name = "Y", descriptor = "[I")
    public static int[] field531;

    @OriginalMember(owner = "client!wg", name = "X", descriptor = "[[[I")
    public static int[][][] field530;

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Ltq;Lqt;Lhn;J)V", line = 483)
    public class38(class63 arg0, class275 arg1, class59 arg2, long arg3) {
        this.field517 = arg2;
        this.field524 = arg3;
        this.field506 = arg1;
        this.field511 = class385.method2337(103, this.field506.field4168);
        if (!arg0.method491() && this.field511.field4315 != -1) {
            this.field511 = class385.method2337(91, this.field511.field4315);
        }
        this.field522 = new class250();
        this.field527 = (int) ((double) this.field527 + Math.random() * 64.0D);
        this.method294(178526416);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)V", line = 16)
    public static void method292(byte arg0) {
        field523 = null;
        field530 = null;
        if (arg0 <= 35) {
            field528 = 77;
        }
        field531 = null;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIIIZIII)V", line = 37)
    public static final void method293(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9) {
        if (arg2 == arg5 && arg0 == arg4 && arg1 == arg9 && arg3 == arg7) {
            class334.method2048((byte) -40, arg3, arg5, arg1, arg4, arg8);
        } else {
            int var10 = arg5;
            int var11 = arg4;
            int var12 = arg5 * 3;
            int var13 = arg4 * 3;
            int var14 = arg2 * 3;
            int var15 = arg0 * 3;
            int var16 = arg9 * 3;
            int var17 = arg7 * 3;
            int var18 = arg1 + var14 - arg5 - var16;
            int var19 = arg3 + var15 - var17 - arg4;
            int var20 = var16 - var14 - (var14 - var12);
            int var21 = var17 + var13 - var15 - var15;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var27 + var29 + var31 >> 12) + arg5;
                int var34 = arg4 + (var28 + var30 + var32 >> 12);
                class334.method2048((byte) -40, var34, var10, var33, var11, arg8);
                var10 = var33;
                var11 = var34;
            }
        }
        if (!arg6) {
            field510++;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V", line = 117)
    public final void method294(int arg0) {
        this.field494 = this.field506.field4170;
        this.field499 = this.field506.field4183;
        this.field501 = this.field506.field4185;
        field505++;
        this.field520 = this.field506.field4180;
        this.field507 = this.field506.field4172;
        this.field518 = this.field506.field4173;
        this.field508 = this.field506.field4167;
        this.field516 = this.field506.field4181;
        this.field519 = this.field506.field4182;
        if (this.field501 == this.field499 && this.field507 == this.field499 && this.field518 == this.field508 && this.field519 == this.field508 && this.field520 == this.field516 && this.field520 == this.field494) {
            this.field493 = true;
            return;
        }
        this.field493 = false;
        int var2 = (this.field501 + this.field499 + this.field507) / 3;
        int var3 = (this.field519 + this.field508 + this.field518) / 3;
        if (arg0 != 178526416) {
            return;
        }
        int var4 = (this.field520 + this.field516 + this.field494) / 3;
        if (this.field529 == var2 && this.field498 == var3 && this.field497 == var4) {
            return;
        }
        this.field497 = var4;
        this.field498 = var3;
        this.field529 = var2;
        int var5 = this.field499 - this.field501;
        int var6 = this.field508 - this.field518;
        int var7 = this.field520 - this.field516;
        int var8 = this.field507 - this.field501;
        int var9 = this.field519 - this.field518;
        int var10 = this.field494 - this.field516;
        this.field526 = var5 * var9 - (var6 * var8);
        this.field504 = var6 * var10 - var7 * var9;
        this.field503 = var7 * var8 - var5 * var10;
        while (this.field504 > 32767 || this.field503 > 32767 || this.field526 > 32767 || this.field504 < -32767 || this.field503 < -32767 || this.field526 < -32767) {
            this.field503 >>= 0x1;
            this.field526 >>= 0x1;
            this.field504 >>= 0x1;
        }
        int var11 = (int) Math.sqrt((double) (this.field526 * this.field526 + this.field504 * this.field504 + this.field503 * this.field503));
        if (var11 <= 0) {
            var11 = 1;
        }
        this.field504 = this.field504 * 32767 / var11;
        this.field503 = this.field503 * 32767 / var11;
        this.field526 = this.field526 * 32767 / var11;
        if (this.field511.field4321 <= 0 && this.field511.field4329 <= 0) {
            return;
        }
        int var12 = (int) (Math.atan2((double) this.field526, (double) this.field504) * 2607.5945876176133D);
        int var13 = (int) (Math.atan2((double) this.field503, Math.sqrt((double) (this.field526 * this.field526 + this.field504 * this.field504))) * 2607.5945876176133D);
        this.field521 = this.field511.field4321 - this.field511.field4282;
        this.field512 = this.field511.field4329 - this.field511.field4337;
        this.field496 = var12 + this.field511.field4282 - (this.field521 >> 1);
        this.field514 = var13 + this.field511.field4337 - (this.field512 >> 1);
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(I)V", line = 206)
    public static final void method295(int arg0) {
        if (class27.field335 != null) {
            class27.field335.method998((byte) -13);
            class27.field335 = null;
        }
        field515++;
        class31.method268(8);
        class150.method1017();
        for (int var1 = 0; var1 < 4; var1++) {
            class183.field2717[var1].method2870(-122);
        }
        class281.method1806(false, (byte) -82);
        System.gc();
        class431.method2524(2, (byte) -27);
        class208.field3142 = false;
        class487.field6840 = -1;
        class165.method1116(true, (byte) -117);
        class75.field1050 = false;
        class356.field5413 = 0;
        class468.field6588 = 0;
        class68.field922 = 0;
        class314.field4728 = 0;
        if (arg0 <= 61) {
            return;
        }
        for (int var2 = 0; var2 < class365.field5522.length; var2++) {
            class365.field5522[var2] = null;
        }
        class433.method2537((byte) 1);
        for (int var3 = 0; var3 < 2048; var3++) {
            class40.field565[var3] = null;
        }
        class256.field3797 = 0;
        for (int var4 = 0; var4 < 32768; var4++) {
            class18.field241[var4] = null;
        }
        class491.field6897.method2299((byte) -57);
        class145.method989(-91);
        class81.field1138 = 0;
        class315.field4736.method27(false);
        class85.method686(false);
        class216.method1441((byte) -124);
        class197.method1345(-116, true);
        try {
            class399.method2383(class21.field261.field2125, -10423, "loggedout");
        } catch (Throwable var5) {
        }
        class3.field64 = null;
        class51.field741 = 0L;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILtq;ZJZ)V", line = 281)
    public final void method296(int arg0, class63 arg1, boolean arg2, long arg3, boolean arg4) {
        if (!arg2) {
            this.field517 = null;
        }
        if (this.field495) {
            arg4 = false;
        } else if (this.field511.field4299 > class5.field90) {
            arg4 = false;
        } else if (class344.field5188 > class293.field4417[class5.field90]) {
            arg4 = false;
        } else if (this.field493) {
            arg4 = false;
        } else if (this.field511.field4330 != -1) {
            int var7 = (int) (arg3 - this.field524);
            if (this.field511.field4328 || this.field511.field4330 >= var7) {
                var7 %= this.field511.field4330;
            } else {
                arg4 = false;
            }
            if (!this.field511.field4304 && this.field511.field4327 > var7) {
                arg4 = false;
            }
            if (this.field511.field4304 && this.field511.field4327 <= var7) {
                arg4 = false;
            }
        }
        field509++;
        if (arg4) {
            this.field527 += (int) ((double) arg0 * ((double) this.field511.field4308 + Math.random() * (double) (this.field511.field4289 - this.field511.field4308)));
            if (this.field527 > 63) {
                int var8 = this.field527 >> 6;
                this.field527 &= 0x3F;
                for (int var9 = 0; var9 < var8; var9++) {
                    int var10;
                    int var11;
                    int var12;
                    if (this.field511.field4321 <= 0 && this.field511.field4329 <= 0) {
                        var10 = this.field504;
                        var11 = this.field526;
                        var12 = this.field503;
                    } else {
                        int var13 = this.field496 + (int) ((double) this.field521 * Math.random());
                        int var14 = var13 & 0x3FFF;
                        int var15 = class172.field2450[var14];
                        int var16 = class172.field2456[var14];
                        int var17 = this.field514 + (int) ((double) this.field512 * Math.random());
                        int var18 = var17 & 0x1FFF;
                        int var19 = class172.field2450[var18];
                        var10 = var16 * var19 >> 15;
                        int var20 = class172.field2456[var18];
                        var12 = var20 * -1;
                        var11 = var15 * var19 >> 15;
                    }
                    int var21 = (int) (Math.random() * 65535.0D);
                    int var22 = (int) (Math.random() * 65535.0D);
                    if (var21 + var22 > 65535) {
                        var21 = 65535 - var21;
                        var22 = 65535 - var22;
                    }
                    int var23 = 65535 - var22 - var21;
                    int var24 = this.field501 * var21 + (this.field499 * var22 + (this.field507 * var23)) >> 16;
                    int var25 = this.field518 * var21 - (-(this.field519 * var23) - (this.field508 * var22)) >> 16;
                    int var26 = this.field494 * var23 + this.field520 * var22 + this.field516 * var21 >> 16;
                    int var27 = (int) (Math.random() * (double) (this.field511.field4300 - this.field511.field4291)) + this.field511.field4291;
                    int var28 = this.field511.field4336 + (int) ((double) (this.field511.field4279 - this.field511.field4336) * Math.random());
                    int var29 = this.field511.field4295 + ((int) (Math.random() * (double) (this.field511.field4288 - this.field511.field4295)));
                    int var30;
                    if (this.field511.field4293) {
                        double var31 = Math.random();
                        var30 = (int) ((double) this.field511.field4319 * var31 + (double) this.field511.field4298) | (int) ((double) this.field511.field4324 * var31 + (double) this.field511.field4310) << 8 | (int) ((double) this.field511.field4343 * var31 + (double) this.field511.field4326) << 16 | (int) ((double) this.field511.field4301 + Math.random() * (double) this.field511.field4312) << 24;
                    } else {
                        var30 = (int) ((double) this.field511.field4298 + Math.random() * (double) this.field511.field4319) | (int) ((double) this.field511.field4310 + Math.random() * (double) this.field511.field4324) << 8 | (int) ((double) this.field511.field4343 * Math.random() + (double) this.field511.field4326) << 16 | (int) (Math.random() * (double) this.field511.field4312 + (double) this.field511.field4301) << 24;
                    }
                    int var33 = this.field511.field4307;
                    if (!arg1.method491() && !this.field511.field4338) {
                        var33 = -1;
                    }
                    if (class488.field6843 == class179.field2674) {
                        new class300(this, var24, var25, var26, var10, var12, var11, var27, var28, var30, var29, var33, this.field511.field4306);
                    } else {
                        class300 var35 = class312.field4709[class179.field2674];
                        class179.field2674 = class179.field2674 + 1 & 0x3FF;
                        var35.method1873(this, var24, var25, var26, var10, var12, var11, var27, var28, var30, var29, var33, this.field511.field4306);
                    }
                }
            }
        }
        this.field500 = 0;
        for (class300 var36 = (class300) this.field522.method1594(16); var36 != null; var36 = (class300) this.field522.method1596(true)) {
            var36.method1872(arg3, arg0);
            this.field500++;
        }
        class6.field109 += this.field500;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(JI)V", line = 451)
    public final void method297(long arg0, int arg1) {
        for (class300 var4 = (class300) this.field522.method1594(16); var4 != null; var4 = (class300) this.field522.method1596(true)) {
            var4.method1871(arg0);
        }
        if (arg1 != -5430) {
            this.method297(1L, -9);
        }
        field502++;
    }
}
