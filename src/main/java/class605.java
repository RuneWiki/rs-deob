import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lw")
public class class605 extends class25 {

    @OriginalMember(owner = "client!lw", name = "A", descriptor = "Z")
    private boolean field8418 = false;

    @OriginalMember(owner = "client!lw", name = "n", descriptor = "I")
    private int field8405 = 0;

    @OriginalMember(owner = "client!lw", name = "S", descriptor = "Z")
    public boolean field8436 = false;

    @OriginalMember(owner = "client!lw", name = "E", descriptor = "Lbh;")
    public class34 field8422;

    @OriginalMember(owner = "client!lw", name = "K", descriptor = "J")
    private long field8428;

    @OriginalMember(owner = "client!lw", name = "h", descriptor = "Lio;")
    public class401 field8399;

    @OriginalMember(owner = "client!lw", name = "M", descriptor = "Lsda;")
    public class234 field8430;

    @OriginalMember(owner = "client!lw", name = "v", descriptor = "Lwn;")
    public class663 field8413;

    @OriginalMember(owner = "client!lw", name = "y", descriptor = "Z")
    public static boolean field8416 = false;

    @OriginalMember(owner = "client!lw", name = "L", descriptor = "Lmaa;")
    public static class433 field8429 = new class433("", 16);

    @OriginalMember(owner = "client!lw", name = "Q", descriptor = "Z")
    public static boolean field8434 = false;

    @OriginalMember(owner = "client!lw", name = "R", descriptor = "Lof;")
    public static class568 field8435 = new class568(5, -1);

    @OriginalMember(owner = "client!lw", name = "T", descriptor = "J")
    public static long field8437 = 0L;

    @OriginalMember(owner = "client!lw", name = "V", descriptor = "Z")
    public static boolean field8439 = false;

    @OriginalMember(owner = "client!lw", name = "i", descriptor = "I")
    private int field8400;

    @OriginalMember(owner = "client!lw", name = "j", descriptor = "I")
    private int field8401;

    @OriginalMember(owner = "client!lw", name = "k", descriptor = "I")
    public static int field8402;

    @OriginalMember(owner = "client!lw", name = "l", descriptor = "I")
    private int field8403;

    @OriginalMember(owner = "client!lw", name = "m", descriptor = "I")
    private int field8404;

    @OriginalMember(owner = "client!lw", name = "o", descriptor = "I")
    private int field8406;

    @OriginalMember(owner = "client!lw", name = "p", descriptor = "I")
    public static int field8407;

    @OriginalMember(owner = "client!lw", name = "q", descriptor = "I")
    private int field8408;

    @OriginalMember(owner = "client!lw", name = "r", descriptor = "I")
    public int field8409;

    @OriginalMember(owner = "client!lw", name = "s", descriptor = "I")
    public static int field8410;

    @OriginalMember(owner = "client!lw", name = "t", descriptor = "I")
    private int field8411;

    @OriginalMember(owner = "client!lw", name = "u", descriptor = "I")
    private int field8412;

    @OriginalMember(owner = "client!lw", name = "w", descriptor = "I")
    public int field8414;

    @OriginalMember(owner = "client!lw", name = "x", descriptor = "I")
    private int field8415;

    @OriginalMember(owner = "client!lw", name = "z", descriptor = "I")
    private int field8417;

    @OriginalMember(owner = "client!lw", name = "B", descriptor = "I")
    private int field8419;

    @OriginalMember(owner = "client!lw", name = "C", descriptor = "I")
    private int field8420;

    @OriginalMember(owner = "client!lw", name = "D", descriptor = "I")
    private int field8421;

    @OriginalMember(owner = "client!lw", name = "F", descriptor = "I")
    private int field8423;

    @OriginalMember(owner = "client!lw", name = "G", descriptor = "I")
    public static int field8424;

    @OriginalMember(owner = "client!lw", name = "H", descriptor = "I")
    public int field8425;

    @OriginalMember(owner = "client!lw", name = "I", descriptor = "I")
    public int field8426;

    @OriginalMember(owner = "client!lw", name = "J", descriptor = "I")
    public static int field8427;

    @OriginalMember(owner = "client!lw", name = "N", descriptor = "I")
    public static int field8431;

    @OriginalMember(owner = "client!lw", name = "O", descriptor = "I")
    private int field8432;

    @OriginalMember(owner = "client!lw", name = "P", descriptor = "I")
    private int field8433;

    @OriginalMember(owner = "client!lw", name = "U", descriptor = "Ljava/lang/String;")
    public static String field8438;

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(JIIZLoa;)V")
    public final void method3348(long arg0, int arg1, int arg2, boolean arg3, class638 arg4) {
        if (this.field8436) {
            arg3 = false;
        } else if (class684.field9621 < this.field8430.field3354) {
            arg3 = false;
        } else if (class469.field6568 > class661.field9334[class684.field9621]) {
            arg3 = false;
        } else if (this.field8418) {
            arg3 = false;
        } else if (this.field8430.field3381 != -1) {
            int var7 = (int) (arg0 - this.field8428);
            if (this.field8430.field3324 || var7 <= this.field8430.field3381) {
                var7 %= this.field8430.field3381;
            } else {
                arg3 = false;
            }
            if (!this.field8430.field3353 && var7 < this.field8430.field3333) {
                arg3 = false;
            }
            if (this.field8430.field3353 && var7 >= this.field8430.field3333) {
                arg3 = false;
            }
        }
        field8424++;
        if (arg3) {
            this.field8405 += (int) (((double) this.field8430.field3360 + (double) (this.field8430.field3361 - this.field8430.field3360) * Math.random()) * (double) arg2);
            if (this.field8405 > 63) {
                int var8 = this.field8405 >> 6;
                this.field8405 &= 0x3F;
                for (int var9 = 0; var9 < var8; var9++) {
                    int var10;
                    int var11;
                    int var12;
                    if (this.field8430.field3337 <= 0 && this.field8430.field3338 <= 0) {
                        var10 = this.field8423;
                        var11 = this.field8420;
                        var12 = this.field8417;
                    } else {
                        int var13 = (int) (Math.random() * (double) this.field8406) + this.field8411;
                        int var14 = var13 & 0x3FFF;
                        int var15 = class675.field9542[var14];
                        int var16 = class675.field9541[var14];
                        int var17 = (int) ((double) this.field8433 * Math.random()) + this.field8412;
                        int var18 = var17 & 0x1FFF;
                        int var19 = class675.field9542[var18];
                        int var20 = class675.field9541[var18];
                        byte var21 = 13;
                        var12 = (var20 << 1) * -1;
                        var11 = var16 * var19 >> var21;
                        var10 = var15 * var19 >> var21;
                    }
                    int var22 = (int) (Math.random() * 65535.0D);
                    int var23 = (int) (Math.random() * 65535.0D);
                    if ((var22 + var23) > 65535) {
                        var23 = 65535 - var23;
                        var22 = 65535 - var22;
                    }
                    int var24 = 65535 - (var22 + var23);
                    int var25 = (int) ((long) this.field8404 * (long) var23 + ((long) this.field8408 * (long) var22 + ((long) this.field8400 * (long) var24)) >> 16);
                    int var26 = (int) ((long) this.field8419 * (long) var24 + (long) this.field8432 * (long) var23 + (long) this.field8415 * (long) var22 >> 16);
                    int var27 = (int) ((long) this.field8403 * (long) var23 + ((long) this.field8421 * (long) var22 + ((long) this.field8401 * (long) var24)) >> 16);
                    int var28 = (int) ((double) (this.field8430.field3371 - this.field8430.field3362) * Math.random()) + this.field8430.field3362;
                    int var29 = this.field8430.field3330 + ((int) ((double) (this.field8430.field3317 - this.field8430.field3330) * Math.random()));
                    int var30 = (int) (Math.random() * (double) (this.field8430.field3323 - this.field8430.field3363)) + this.field8430.field3363;
                    int var31;
                    if (this.field8430.field3357) {
                        double var32 = Math.random();
                        var31 = (int) ((double) this.field8430.field3336 + (double) this.field8430.field3359 * Math.random()) << 24 | (int) ((double) this.field8430.field3352 * var32 + (double) this.field8430.field3327) | (int) ((double) this.field8430.field3376 * var32 + (double) this.field8430.field3372) << 8 | (int) ((double) this.field8430.field3378 * var32 + (double) this.field8430.field3379) << 16;
                    } else {
                        var31 = (int) (Math.random() * (double) this.field8430.field3359 + (double) this.field8430.field3336) << 24 | (int) (Math.random() * (double) this.field8430.field3378 + (double) this.field8430.field3379) << 16 | (int) ((double) this.field8430.field3372 + Math.random() * (double) this.field8430.field3376) << 8 | (int) ((double) this.field8430.field3327 + Math.random() * (double) this.field8430.field3352);
                    }
                    int var34 = this.field8430.field3349;
                    if (!arg4.method440() && !this.field8430.field3329) {
                        var34 = -1;
                    }
                    if (class264.field3749 == class166.field2512) {
                        new class619(this, var25, var26, var27, var11, var12, var10, var28, var29, var31, var30, var34, this.field8430.field3335, this.field8430.field3385);
                    } else {
                        class619 var36 = class552.field7482[class166.field2512];
                        class166.field2512 = class166.field2512 + 1 & 0x3FF;
                        var36.method3442(this, var25, var26, var27, var11, var12, var10, var28, var29, var31, var30, var34, this.field8430.field3335, this.field8430.field3385);
                    }
                }
            }
        }
        this.field8414 = 0;
        for (class619 var37 = (class619) this.field8413.method3676((byte) -45); var37 != null; var37 = (class619) this.field8413.method3682(-18176)) {
            var37.method3443(arg0, arg2);
            this.field8414++;
        }
        if (arg1 <= 38) {
            field8438 = null;
        }
        class472.field6587 += this.field8414;
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(JBLoa;)V")
    public final void method3349(long arg0, byte arg1, class638 arg2) {
        field8427++;
        if (arg1 != -37) {
            method3350(-90);
        }
        for (class619 var5 = (class619) this.field8413.method3676((byte) 104); var5 != null; var5 = (class619) this.field8413.method3682(arg1 ^ 0x46DB)) {
            var5.method3444(arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "(I)V")
    public static void method3350(int arg0) {
        field8429 = null;
        if (arg0 == 65535) {
            field8435 = null;
            field8438 = null;
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method3351(int arg0, String arg1) {
        System.exit(1);
        field8402++;
        int var2 = 125 % ((28 - arg0) / 56);
    }

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "(B)V")
    public static final void method3352(byte arg0) {
        field8410++;
        if (arg0 < 22) {
            field8435 = null;
        }
        if (class124.field1719) {
            return;
        }
        if (class274.field3872.field874) {
            class249.field3516 = ((int) class249.field3516 + 47 & 0xFFFFFFF0);
        } else {
            class509.field6981 += (12.0F - class509.field6981) / 2.0F;
        }
        class124.field1719 = true;
        class586.field8200 = true;
    }

    @OriginalMember(owner = "client!lw", name = "c", descriptor = "(I)V")
    public final void method3353(int arg0) {
        this.field8419 = this.field8422.field400;
        this.field8403 = this.field8422.field406;
        this.field8400 = this.field8422.field398;
        this.field8432 = this.field8422.field405;
        field8431++;
        if (arg0 != -1) {
            this.method3353(-73);
        }
        this.field8404 = this.field8422.field397;
        this.field8415 = this.field8422.field412;
        this.field8401 = this.field8422.field407;
        this.field8421 = this.field8422.field410;
        this.field8408 = this.field8422.field396;
        if (this.field8408 == this.field8404 && this.field8404 == this.field8400 && this.field8432 == this.field8415 && this.field8432 == this.field8419 && this.field8421 == this.field8403 && this.field8403 == this.field8401) {
            this.field8418 = true;
            return;
        }
        this.field8418 = false;
        int var2 = (this.field8408 + this.field8400 + this.field8404) / 3;
        int var3 = (this.field8415 + this.field8432 + this.field8419) / 3;
        int var4 = (this.field8403 + this.field8401 + this.field8421) / 3;
        if (this.field8425 == var2 && this.field8409 == var3 && this.field8426 == var4) {
            return;
        }
        this.field8409 = var3;
        this.field8426 = var4;
        this.field8425 = var2;
        int var5 = this.field8404 - this.field8408;
        int var6 = this.field8432 - this.field8415;
        int var7 = this.field8403 - this.field8421;
        int var8 = this.field8400 - this.field8408;
        int var9 = this.field8419 - this.field8415;
        int var10 = this.field8401 - this.field8421;
        this.field8417 = var7 * var8 - (var5 * var10);
        this.field8420 = var6 * var10 - (var7 * var9);
        this.field8423 = var5 * var9 - var6 * var8;
        while (this.field8420 > 32767 || this.field8417 > 32767 || this.field8423 > 32767 || this.field8420 < -32767 || this.field8417 < -32767 || this.field8423 < -32767) {
            this.field8423 >>= 0x1;
            this.field8420 >>= 0x1;
            this.field8417 >>= 0x1;
        }
        int var11 = (int) Math.sqrt((double) (this.field8420 * this.field8420 + this.field8423 * this.field8423 + this.field8417 * this.field8417));
        if (var11 <= 0) {
            var11 = 1;
        }
        this.field8417 = this.field8417 * 32767 / var11;
        this.field8423 = this.field8423 * 32767 / var11;
        this.field8420 = this.field8420 * 32767 / var11;
        if (this.field8430.field3337 <= 0 && this.field8430.field3338 <= 0) {
            return;
        }
        int var12 = (int) (Math.atan2((double) this.field8423, (double) this.field8420) * 2607.5945876176133D);
        int var13 = (int) (Math.atan2((double) this.field8417, Math.sqrt((double) (this.field8423 * this.field8423 + this.field8420 * this.field8420))) * 2607.5945876176133D);
        this.field8406 = this.field8430.field3337 - this.field8430.field3315;
        this.field8411 = var12 - ((this.field8406 >> 1) - this.field8430.field3315);
        this.field8433 = this.field8430.field3338 - this.field8430.field3325;
        this.field8412 = var13 + this.field8430.field3325 - (this.field8433 >> 1);
    }

    @OriginalMember(owner = "client!lw", name = "<init>", descriptor = "(Loa;Lbh;Lio;J)V")
    public class605(class638 arg0, class34 arg1, class401 arg2, long arg3) {
        this.field8422 = arg1;
        this.field8428 = arg3;
        this.field8399 = arg2;
        this.field8430 = this.field8422.method160(1);
        if (!arg0.method440() && this.field8430.field3314 != -1) {
            this.field8430 = class690.method3797(this.field8430.field3314, (byte) 117);
        }
        this.field8413 = new class663();
        this.field8405 = (int) ((double) this.field8405 + Math.random() * 64.0D);
        this.method3353(-1);
    }
}
