import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class29 extends class56 {

    @OriginalMember(owner = "client!o", name = "G", descriptor = "I")
    private int field383 = 0;

    @OriginalMember(owner = "client!o", name = "P", descriptor = "I")
    private int field391 = 0;

    @OriginalMember(owner = "client!o", name = "V", descriptor = "I")
    private int field397 = 0;

    @OriginalMember(owner = "client!o", name = "L", descriptor = "Z")
    public static boolean field387 = true;

    @OriginalMember(owner = "client!o", name = "D", descriptor = "Lfv;")
    public static class120 field380 = new class120();

    @OriginalMember(owner = "client!o", name = "E", descriptor = "I")
    private int field381;

    @OriginalMember(owner = "client!o", name = "F", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!o", name = "H", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!o", name = "I", descriptor = "I")
    private int field385;

    @OriginalMember(owner = "client!o", name = "K", descriptor = "I")
    private int field386;

    @OriginalMember(owner = "client!o", name = "M", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!o", name = "N", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!o", name = "O", descriptor = "I")
    private int field390;

    @OriginalMember(owner = "client!o", name = "Q", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!o", name = "R", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!o", name = "S", descriptor = "I")
    public static int field394;

    @OriginalMember(owner = "client!o", name = "T", descriptor = "I")
    private int field395;

    @OriginalMember(owner = "client!o", name = "U", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!o", name = "W", descriptor = "I")
    private int field398;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public static final boolean method167(byte arg0, String arg1) {
        int var2 = 68 % ((arg0 - 73) / 53);
        ++field384;
        return class427.field5995.containsKey(arg1);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ILee;I)V")
    public final void method6(int arg0, class675 arg1, int arg2) {
        if (arg0 != 3731) {
            this.field381 = 7;
        }
        ++field394;
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field391 = (arg1.method3719(1854307120) << 12) / 100;
                }
            } else {
                this.field383 = (arg1.method3719(1854307120) << 12) / 100;
            }
        } else {
            this.field397 = arg1.method3706((byte) -117);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ZBLem;)V")
    public static final void method168(boolean arg0, byte arg1, class223 arg2) {
        if (arg1 > -6) {
            method172((byte) 76);
        }
        ++field389;
        class220.field2882.method2491(true, arg2);
        if (arg0) {
            class707.method3967(class727.field10173, 93, arg2, class220.field2882, class184.field2495, class530.field7473);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II)[[I")
    public final int[][] method5(int arg0, int arg1) {
        ++field382;
        if (arg1 != 1) {
            this.field383 = 110;
        }
        int[][] var3 = super.field668.method3009(0, arg0);
        if (super.field668.field7292) {
            int[][] var4 = this.method369(arg0, 125, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class328.field4576; ++var11) {
                this.method169(-125, var7[var11], var6[var11], var5[var11]);
                this.field395 += this.field391;
                this.field398 += this.field397;
                this.field385 += this.field383;
                while (this.field398 < 0) {
                    this.field398 += 4096;
                }
                while (~this.field398 < -4097) {
                    this.field398 -= 4096;
                }
                if (~this.field385 > -1) {
                    this.field385 = 0;
                }
                if (this.field385 > 4096) {
                    this.field385 = 4096;
                }
                if (this.field395 < 0) {
                    this.field395 = 0;
                }
                if (this.field395 > 4096) {
                    this.field395 = 4096;
                }
                this.method171(this.field385, this.field398, (byte) -98, this.field395);
                var8[var11] = this.field386;
                var9[var11] = this.field381;
                var10[var11] = this.field390;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIII)V")
    private final void method169(int arg0, int arg1, int arg2, int arg3) {
        ++field396;
        int var5 = ~arg3 < ~arg2 ? arg3 : arg2;
        int var6 = ~arg1 < ~var5 ? arg1 : var5;
        int var7 = ~arg3 <= ~arg2 ? arg2 : arg3;
        int var8 = arg1 >= var7 ? var7 : arg1;
        this.field395 = (var6 + var8) / 2;
        int var9 = var6 - var8;
        if (~this.field395 < -1 && this.field395 < 4096) {
            this.field385 = (var9 << 12) / (~this.field395 >= -2049 ? this.field395 * 2 : 8192 - this.field395 * 2);
        } else {
            this.field385 = 0;
        }
        if (var9 > 0) {
            int var10 = (-arg3 + var6 << 12) / var9;
            int var11 = (-arg2 + var6 << 12) / var9;
            int var12 = (-arg1 + var6 << 12) / var9;
            if (arg3 == var6) {
                this.field398 = arg2 == var8 ? var12 + 20480 : -var11 + 4096;
            } else if (arg2 == var6) {
                this.field398 = arg1 != var8 ? -var12 + 12288 : var10 + 4096;
            } else {
                this.field398 = ~arg3 != ~var8 ? -var10 + 20480 : var11 + 12288;
            }
            this.field398 /= 6;
        } else {
            this.field398 = 0;
        }
        if (arg0 >= -92) {
            this.field381 = -22;
        }
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V")
    public class29() {
        super(1, false);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Z)V")
    public static final void method170(boolean arg0) {
        class714 var1 = class668.field9073;
        synchronized (class668.field9073) {
            class668.field9073.method4023((byte) -127);
        }
        ++field388;
        if (arg0) {
            class714 var2 = class90.field1079;
            synchronized (class90.field1079) {
                class90.field1079.method4023((byte) -125);
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIBI)V")
    private final void method171(int arg0, int arg1, byte arg2, int arg3) {
        ++field393;
        int var5 = arg3 <= 2048 ? (arg0 + 4096) * arg3 >> 12 : arg0 + arg3 - (arg0 * arg3 >> 12);
        if (var5 <= 0) {
            this.field386 = this.field381 = this.field390 = arg3;
        } else {
            int var6 = arg1 * 6;
            int var7 = arg3 + arg3 + -var5;
            int var8 = (-var7 + var5 << 12) / var5;
            int var9 = var6 >> 12;
            int var10 = -(var9 << 12) + var6;
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var7 + var13;
            int var15 = -var13 + var5;
            if (~var9 != -1) {
                if (~var9 != -2) {
                    if (var9 != 2) {
                        if (var9 != 3) {
                            if (~var9 != -5) {
                                if (var9 == 5) {
                                    this.field386 = var5;
                                    this.field390 = var15;
                                    this.field381 = var7;
                                }
                            } else {
                                this.field381 = var7;
                                this.field390 = var5;
                                this.field386 = var14;
                            }
                        } else {
                            this.field386 = var7;
                            this.field390 = var5;
                            this.field381 = var15;
                        }
                    } else {
                        this.field381 = var5;
                        this.field390 = var14;
                        this.field386 = var7;
                    }
                } else {
                    this.field381 = var5;
                    this.field386 = var15;
                    this.field390 = var7;
                }
            } else {
                this.field386 = var5;
                this.field381 = var14;
                this.field390 = var7;
            }
        }
        if (arg2 != -98) {
            this.field390 = 49;
        }
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(B)V")
    public static void method172(byte arg0) {
        field380 = null;
        int var1 = 120 / ((-56 - arg0) / 37);
    }
}
