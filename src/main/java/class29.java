import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class29 extends class176 {

    @OriginalMember(owner = "client!vd", name = "w", descriptor = "Z")
    public boolean field428 = false;

    @OriginalMember(owner = "client!vd", name = "O", descriptor = "Z")
    private boolean field445 = false;

    @OriginalMember(owner = "client!vd", name = "F", descriptor = "I")
    private int field437 = 0;

    @OriginalMember(owner = "client!vd", name = "K", descriptor = "Llq;")
    public class392 field441;

    @OriginalMember(owner = "client!vd", name = "G", descriptor = "J")
    private long field438;

    @OriginalMember(owner = "client!vd", name = "B", descriptor = "Ljg;")
    public class228 field433;

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "Lun;")
    public class296 field417;

    @OriginalMember(owner = "client!vd", name = "M", descriptor = "Lpw;")
    public class507 field443;

    @OriginalMember(owner = "client!vd", name = "R", descriptor = "I")
    public static int field448 = 0;

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "I")
    private int field418;

    @OriginalMember(owner = "client!vd", name = "n", descriptor = "I")
    private int field419;

    @OriginalMember(owner = "client!vd", name = "o", descriptor = "I")
    public int field420;

    @OriginalMember(owner = "client!vd", name = "p", descriptor = "I")
    private int field421;

    @OriginalMember(owner = "client!vd", name = "q", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!vd", name = "r", descriptor = "I")
    private int field423;

    @OriginalMember(owner = "client!vd", name = "s", descriptor = "I")
    private int field424;

    @OriginalMember(owner = "client!vd", name = "t", descriptor = "I")
    public int field425;

    @OriginalMember(owner = "client!vd", name = "u", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!vd", name = "v", descriptor = "I")
    private int field427;

    @OriginalMember(owner = "client!vd", name = "x", descriptor = "I")
    public int field429;

    @OriginalMember(owner = "client!vd", name = "y", descriptor = "I")
    private int field430;

    @OriginalMember(owner = "client!vd", name = "z", descriptor = "I")
    private int field431;

    @OriginalMember(owner = "client!vd", name = "A", descriptor = "I")
    private int field432;

    @OriginalMember(owner = "client!vd", name = "C", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!vd", name = "D", descriptor = "I")
    public static int field435;

    @OriginalMember(owner = "client!vd", name = "E", descriptor = "I")
    public int field436;

    @OriginalMember(owner = "client!vd", name = "I", descriptor = "I")
    private int field439;

    @OriginalMember(owner = "client!vd", name = "J", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "client!vd", name = "L", descriptor = "I")
    private int field442;

    @OriginalMember(owner = "client!vd", name = "N", descriptor = "I")
    private int field444;

    @OriginalMember(owner = "client!vd", name = "P", descriptor = "I")
    private int field446;

    @OriginalMember(owner = "client!vd", name = "Q", descriptor = "I")
    private int field447;

    @OriginalMember(owner = "client!vd", name = "S", descriptor = "I")
    private int field449;

    @OriginalMember(owner = "client!vd", name = "T", descriptor = "I")
    private int field450;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IBIIIIII)V", line = 18)
    public static final void method260(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field435++;
        int var8 = 0;
        int var9 = arg5;
        int var10 = 0;
        int var11 = arg7 - arg4;
        int var12 = arg5 - arg4;
        int var13 = arg7 * arg7;
        int var14 = arg5 * arg5;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        if (arg1 < 120) {
            method264(-13, null);
        }
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg5 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - ((var21 - 1) * var18);
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - ((var22 - 1) * var20);
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg5 - 1) * var27;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        if (arg0 >= class463.field6924 && arg0 <= class369.field5628) {
            int[] var39 = class466.field6955[arg0];
            int var40 = class33.method289(261104, class377.field5760, class49.field701, arg6 - arg7);
            int var41 = class33.method289(261104, class377.field5760, class49.field701, arg6 + arg7);
            int var42 = class33.method289(261104, class377.field5760, class49.field701, arg6 - var11);
            int var43 = class33.method289(261104, class377.field5760, class49.field701, arg6 + var11);
            class221.method1489(var39, var40, var42, (byte) -30, arg2);
            class221.method1489(var39, var42, var43, (byte) -30, arg3);
            class221.method1489(var39, var43, var41, (byte) -30, arg2);
        }
        while (var9 > 0) {
            boolean var44 = var12 >= var9;
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var35;
                    var23 += var31;
                    var8++;
                    var35 += var28;
                    var31 += var28;
                }
            }
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var26 += var37;
                        var25 += var33;
                        var37 += var30;
                        var10++;
                        var33 += var30;
                    }
                }
                if (var26 < 0) {
                    var25 += var33;
                    var26 += var37;
                    var10++;
                    var33 += var30;
                    var37 += var30;
                }
                var26 += -var34;
                var25 += -var38;
                var38 -= var29;
                var34 -= var29;
            }
            if (var24 < 0) {
                var24 += var35;
                var23 += var31;
                var31 += var28;
                var8++;
                var35 += var28;
            }
            var23 += -var36;
            var24 += -var32;
            var36 -= var27;
            var9--;
            var32 -= var27;
            int var45 = arg0 - var9;
            int var46 = arg0 + var9;
            if (var46 >= class463.field6924 && class369.field5628 >= var45) {
                int var47 = class33.method289(261104, class377.field5760, class49.field701, arg6 + var8);
                int var48 = class33.method289(261104, class377.field5760, class49.field701, arg6 - var8);
                if (var44) {
                    int var49 = class33.method289(261104, class377.field5760, class49.field701, arg6 + var10);
                    int var50 = class33.method289(261104, class377.field5760, class49.field701, arg6 - var10);
                    if (class463.field6924 <= var45) {
                        int[] var51 = class466.field6955[var45];
                        class221.method1489(var51, var48, var50, (byte) -30, arg2);
                        class221.method1489(var51, var50, var49, (byte) -30, arg3);
                        class221.method1489(var51, var49, var47, (byte) -30, arg2);
                    }
                    if (var46 <= class369.field5628) {
                        int[] var52 = class466.field6955[var46];
                        class221.method1489(var52, var48, var50, (byte) -30, arg2);
                        class221.method1489(var52, var50, var49, (byte) -30, arg3);
                        class221.method1489(var52, var49, var47, (byte) -30, arg2);
                    }
                } else {
                    if (var45 >= class463.field6924) {
                        class221.method1489(class466.field6955[var45], var48, var47, (byte) -30, arg2);
                    }
                    if (class369.field5628 >= var46) {
                        class221.method1489(class466.field6955[var46], var48, var47, (byte) -30, arg2);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IJ)V", line = 222)
    public final void method261(int arg0, long arg1) {
        if (arg0 == 520515554) {
            for (class97 var4 = (class97) this.field443.method3040(false); var4 != null; var4 = (class97) this.field443.method3043((byte) -125)) {
                var4.method647(arg1);
            }
            field434++;
        }
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(I)V", line = 243)
    public final void method262(int arg0) {
        this.field450 = this.field441.field5992;
        this.field446 = this.field441.field5995;
        this.field424 = this.field441.field6002;
        this.field449 = this.field441.field5998;
        if (arg0 != -30753) {
            this.field417 = null;
        }
        this.field447 = this.field441.field5985;
        this.field430 = this.field441.field5993;
        this.field431 = this.field441.field5991;
        field422++;
        this.field423 = this.field441.field5986;
        this.field442 = this.field441.field6001;
        if (this.field450 == this.field424 && this.field449 == this.field424 && this.field447 == this.field430 && this.field447 == this.field446 && this.field442 == this.field431 && this.field442 == this.field423) {
            this.field445 = true;
            return;
        }
        this.field445 = false;
        int var2 = (this.field449 + this.field424 + this.field450) / 3;
        int var3 = (this.field430 - (-this.field447 - this.field446)) / 3;
        int var4 = (this.field431 + this.field442 + this.field423) / 3;
        if (this.field420 == var2 && this.field429 == var3 && this.field436 == var4) {
            return;
        }
        this.field436 = var4;
        this.field429 = var3;
        this.field420 = var2;
        int var5 = this.field424 - this.field450;
        int var6 = this.field447 - this.field430;
        int var7 = this.field442 - this.field431;
        int var8 = this.field449 - this.field450;
        int var9 = this.field446 - this.field430;
        int var10 = this.field423 - this.field431;
        this.field439 = var6 * var10 - (var7 * var9);
        this.field432 = var5 * var9 - (var6 * var8);
        for (this.field421 = var7 * var8 - (var5 * var10); this.field439 > 32767 || this.field421 > 32767 || this.field432 > 32767 || this.field439 < -32767 || this.field421 < -32767 || this.field432 < -32767; this.field421 >>= 0x1) {
            this.field432 >>= 0x1;
            this.field439 >>= 0x1;
        }
        int var11 = (int) Math.sqrt((double) (this.field421 * this.field421 + this.field439 * this.field439 + this.field432 * this.field432));
        if (var11 <= 0) {
            var11 = 1;
        }
        this.field421 = this.field421 * 32767 / var11;
        this.field432 = this.field432 * 32767 / var11;
        this.field439 = this.field439 * 32767 / var11;
        if (this.field417.field4334 <= 0 && this.field417.field4333 <= 0) {
            return;
        }
        int var12 = (int) (Math.atan2((double) this.field432, (double) this.field439) * 2607.5945876176133D);
        int var13 = (int) (Math.atan2((double) this.field421, Math.sqrt((double) (this.field439 * this.field439 + this.field432 * this.field432))) * 2607.5945876176133D);
        this.field418 = this.field417.field4334 - this.field417.field4369;
        this.field427 = this.field417.field4333 - this.field417.field4374;
        this.field444 = var12 + this.field417.field4369 - (this.field418 >> 1);
        this.field419 = this.field417.field4374 + var13 - (this.field427 >> 1);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IZBLqa;J)V", line = 327)
    public final void method263(int arg0, boolean arg1, byte arg2, class165 arg3, long arg4) {
        field426++;
        if (this.field428) {
            arg1 = false;
        } else if (this.field417.field4345 > class538.field7897) {
            arg1 = false;
        } else if (class351.field5417[class538.field7897] < class224.field3111) {
            arg1 = false;
        } else if (this.field445) {
            arg1 = false;
        } else if (this.field417.field4337 != -1) {
            int var7 = (int) (arg4 - this.field438);
            if (this.field417.field4317 || this.field417.field4337 >= var7) {
                var7 %= this.field417.field4337;
            } else {
                arg1 = false;
            }
            if (!this.field417.field4315 && this.field417.field4347 > var7) {
                arg1 = false;
            }
            if (this.field417.field4315 && this.field417.field4347 <= var7) {
                arg1 = false;
            }
        }
        if (arg1) {
            this.field437 += (int) ((double) arg0 * ((double) (this.field417.field4355 - this.field417.field4313) * Math.random() + (double) this.field417.field4313));
            if (this.field437 > 63) {
                int var8 = this.field437 >> 6;
                this.field437 &= 0x3F;
                for (int var9 = 0; var9 < var8; var9++) {
                    int var10;
                    int var11;
                    int var12;
                    if (this.field417.field4334 <= 0 && this.field417.field4333 <= 0) {
                        var10 = this.field439;
                        var11 = this.field421;
                        var12 = this.field432;
                    } else {
                        int var13 = (int) (Math.random() * (double) this.field418) + this.field444;
                        int var14 = var13 & 0x3FFF;
                        int var15 = class428.field6502[var14];
                        int var16 = class428.field6501[var14];
                        int var17 = (int) ((double) this.field427 * Math.random()) + this.field419;
                        int var18 = var17 & 0x1FFF;
                        int var19 = class428.field6502[var18];
                        int var20 = class428.field6501[var18];
                        byte var21 = 15;
                        var10 = var16 * var19 >> var21;
                        var11 = (var20 << 0) * -1;
                        var12 = var15 * var19 >> var21;
                    }
                    int var22 = (int) (Math.random() * 65535.0D);
                    int var23 = (int) (Math.random() * 65535.0D);
                    if (var22 + var23 > 65535) {
                        var23 = 65535 - var23;
                        var22 = 65535 - var22;
                    }
                    int var24 = 65535 - var22 - var23;
                    int var25 = (int) ((long) this.field450 * (long) var22 + (long) this.field449 * (long) var24 + (long) this.field424 * (long) var23 >> 16);
                    int var26 = (int) ((long) this.field446 * (long) var24 + ((long) this.field430 * (long) var22 + ((long) this.field447 * (long) var23)) >> 16);
                    int var27 = (int) ((long) this.field423 * (long) var24 + (long) this.field442 * (long) var23 + (long) this.field431 * (long) var22 >> 16);
                    int var28 = (int) ((double) (this.field417.field4350 - this.field417.field4353) * Math.random()) + this.field417.field4353;
                    int var29 = (int) ((double) (this.field417.field4321 - this.field417.field4327) * Math.random()) + this.field417.field4327;
                    int var30 = this.field417.field4371 + ((int) ((double) (this.field417.field4344 - this.field417.field4371) * Math.random()));
                    int var31;
                    if (this.field417.field4351) {
                        double var32 = Math.random();
                        var31 = (int) ((double) this.field417.field4343 + Math.random() * (double) this.field417.field4364) << 24 | (int) ((double) this.field417.field4370 * var32 + (double) this.field417.field4377) | (int) ((double) this.field417.field4352 * var32 + (double) this.field417.field4311) << 16 | (int) ((double) this.field417.field4359 * var32 + (double) this.field417.field4338) << 8;
                    } else {
                        var31 = (int) ((double) this.field417.field4370 * Math.random() + (double) this.field417.field4377) | (int) ((double) this.field417.field4352 * Math.random() + (double) this.field417.field4311) << 16 | (int) ((double) this.field417.field4338 + Math.random() * (double) this.field417.field4359) << 8 | (int) (Math.random() * (double) this.field417.field4364 + (double) this.field417.field4343) << 24;
                    }
                    int var34 = this.field417.field4316;
                    if (!arg3.method841() && !this.field417.field4318) {
                        var34 = -1;
                    }
                    if (class281.field3978 == class263.field3685) {
                        new class97(this, var25, var26, var27, var10, var11, var12, var28, var29, var31, var30, var34, this.field417.field4319, this.field417.field4361);
                    } else {
                        class97 var36 = class457.field6857[class281.field3978];
                        class281.field3978 = class281.field3978 + 1 & 0x3FF;
                        var36.method646(this, var25, var26, var27, var10, var11, var12, var28, var29, var31, var30, var34, this.field417.field4319, this.field417.field4361);
                    }
                }
            }
        }
        this.field425 = 0;
        for (class97 var37 = (class97) this.field443.method3040(false); var37 != null; var37 = (class97) this.field443.method3043((byte) -125)) {
            var37.method649(arg4, arg0);
            this.field425++;
        }
        if (arg2 < 67) {
            this.method261(22, 23L);
        }
        class457.field6849 += this.field425;
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(Lqa;Llq;Ljg;J)V", line = 531)
    public class29(class165 arg0, class392 arg1, class228 arg2, long arg3) {
        this.field441 = arg1;
        this.field438 = arg3;
        this.field433 = arg2;
        this.field417 = this.field441.method2447((byte) -60);
        if (!arg0.method841() && this.field417.field4373 != -1) {
            this.field417 = class424.method2586(true, this.field417.field4373);
        }
        this.field443 = new class507();
        this.field437 = (int) ((double) this.field437 + Math.random() * 64.0D);
        this.method262(-30753);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILnj;)Loc;", line = 517)
    public static final class138 method264(int arg0, class164 arg1) {
        if (arg0 > -116) {
            method260(44, (byte) -67, 79, 48, 119, 125, 38, -41);
        }
        field440++;
        return new class138(arg1.method1056(1024), arg1.method1056(1024), arg1.method1056(1024), arg1.method1056(1024), arg1.method1090(-1), arg1.method1090(-1), arg1.method1087(false));
    }
}
