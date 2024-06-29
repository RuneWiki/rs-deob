import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class633 extends class377 {

    @OriginalMember(owner = "client!ee", name = "E", descriptor = "I")
    private int field8575 = 0;

    @OriginalMember(owner = "client!ee", name = "M", descriptor = "I")
    private int field8582 = 0;

    @OriginalMember(owner = "client!ee", name = "U", descriptor = "I")
    private int field8589 = 0;

    @OriginalMember(owner = "client!ee", name = "F", descriptor = "Z")
    public static boolean field8576 = false;

    @OriginalMember(owner = "client!ee", name = "Q", descriptor = "Ldr;")
    public static class675 field8585 = new class675(77, 8);

    @OriginalMember(owner = "client!ee", name = "R", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field8586 = new CRC32();

    @OriginalMember(owner = "client!ee", name = "z", descriptor = "I")
    private int field8570;

    @OriginalMember(owner = "client!ee", name = "A", descriptor = "I")
    private int field8571;

    @OriginalMember(owner = "client!ee", name = "B", descriptor = "I")
    private int field8572;

    @OriginalMember(owner = "client!ee", name = "C", descriptor = "I")
    public static int field8573;

    @OriginalMember(owner = "client!ee", name = "D", descriptor = "I")
    private int field8574;

    @OriginalMember(owner = "client!ee", name = "G", descriptor = "I")
    public static int field8577;

    @OriginalMember(owner = "client!ee", name = "H", descriptor = "I")
    public static int field8578;

    @OriginalMember(owner = "client!ee", name = "I", descriptor = "I")
    private int field8579;

    @OriginalMember(owner = "client!ee", name = "L", descriptor = "I")
    public static int field8581;

    @OriginalMember(owner = "client!ee", name = "O", descriptor = "I")
    public static int field8583;

    @OriginalMember(owner = "client!ee", name = "S", descriptor = "I")
    private int field8587;

    @OriginalMember(owner = "client!ee", name = "T", descriptor = "I")
    public static int field8588;

    @OriginalMember(owner = "client!ee", name = "V", descriptor = "I")
    public static int field8590;

    @OriginalMember(owner = "client!ee", name = "J", descriptor = "[I")
    public static int[] field8580;

    @OriginalMember(owner = "client!ee", name = "P", descriptor = "[Lsaa;")
    public static class305[] field8584;

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "()V")
    public class633() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "(I)V")
    public static final void method3549(int arg0) {
        ++field8588;
        if (~class593.field7960 < arg0) {
            int var1 = 0;
            for (int var2 = 0; class350.field4526.length > var2; ++var2) {
                if (class350.field4526[var2].startsWith("--> ")) {
                    int var10000 = ~class593.field7960;
                    ++var1;
                    if (var10000 == ~var1) {
                        class229.field2957 = class350.field4526[var2].substring(4);
                        return;
                    }
                }
            }
        } else {
            class229.field2957 = "";
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IILji;)V")
    public final void method27(int arg0, int arg1, class572 arg2) {
        ++field8578;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    this.field8575 = (arg2.method3083(255) << 12) / 100;
                }
            } else {
                this.field8589 = (arg2.method3083(255) << 12) / 100;
            }
        } else {
            this.field8582 = arg2.method3086(65280);
        }
        int var5 = 43 % ((13 - arg1) / 55);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IB)[[I")
    public final int[][] method23(int arg0, byte arg1) {
        ++field8583;
        int[][] var3 = super.field4850.method2566(-27346, arg0);
        int var4 = -92 / ((arg1 - 31) / 42);
        if (super.field4850.field5843) {
            int[][] var5 = this.method2173(1, arg0, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var3[0];
            int[] var10 = var3[1];
            int[] var11 = var3[2];
            for (int var12 = 0; ~class528.field6661 < ~var12; ++var12) {
                this.method3553(-28138, var7[var12], var8[var12], var6[var12]);
                this.field8570 += this.field8575;
                this.field8579 += this.field8582;
                this.field8574 += this.field8589;
                while (~this.field8579 > -1) {
                    this.field8579 += 4096;
                }
                while (~this.field8579 < -4097) {
                    this.field8579 -= 4096;
                }
                if (~this.field8574 > -1) {
                    this.field8574 = 0;
                }
                if (~this.field8570 > -1) {
                    this.field8570 = 0;
                }
                if (this.field8574 > 4096) {
                    this.field8574 = 4096;
                }
                if (this.field8570 > 4096) {
                    this.field8570 = 4096;
                }
                this.method3552(this.field8579, this.field8574, 0, this.field8570);
                var9[var12] = this.field8587;
                var10[var12] = this.field8571;
                var11[var12] = this.field8572;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "(I)V")
    public static void method3550(int arg0) {
        field8580 = null;
        field8586 = null;
        field8585 = null;
        if (arg0 < -70) {
            field8584 = null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIII[B)Z")
    public static final boolean method3551(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        if (arg3 != -30586100) {
            method3550(99);
        }
        ++field8581;
        boolean var6 = true;
        class572 var7 = new class572(arg5);
        int var8 = -1;
        label72: while (true) {
            int var9 = var7.method3069((byte) 116);
            if (var9 == 0) {
                return var6;
            }
            var8 += var9;
            int var10 = 0;
            boolean var11 = false;
            while (true) {
                int var15;
                class687 var18;
                do {
                    int var16;
                    int var17;
                    do {
                        do {
                            do {
                                do {
                                    while (var11) {
                                        int var19 = var7.method3033((byte) 91);
                                        if (~var19 == -1) {
                                            continue label72;
                                        }
                                        var7.method3097((byte) 12);
                                    }
                                    int var12 = var7.method3033((byte) 91);
                                    if (var12 == 0) {
                                        continue label72;
                                    }
                                    var10 += var12 + -1;
                                    int var13 = 63 & var10;
                                    int var14 = (var10 & 4058) >> 6;
                                    var15 = var7.method3097((byte) 12) >> 2;
                                    var16 = var14 - -arg2;
                                    var17 = var13 - -arg4;
                                } while (~var16 >= -1);
                            } while (var17 <= 0);
                        } while (arg1 - 1 <= var16);
                    } while (arg0 + -1 <= var17);
                    var18 = class232.field3017.method2358(0, var8);
                } while (var15 == 22 && !class611.field8310.field8679 && var18.field9382 == 0 && ~var18.field9426 != -2 && !var18.field9461);
                var11 = true;
                if (!var18.method3794(true)) {
                    ++class40.field577;
                    var6 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIII)V")
    private final void method3552(int arg0, int arg1, int arg2, int arg3) {
        ++field8577;
        int var5 = ~arg3 < -2049 ? arg1 + arg3 + -(arg1 * arg3 >> 12) : (arg1 + 4096) * arg3 >> 12;
        if (~var5 < -1) {
            int var6 = arg0 * 6;
            int var7 = arg3 - -arg3 + -var5;
            int var8 = (-var7 + var5 << 12) / var5;
            int var9 = var6 >> 12;
            int var10 = -(var9 << 12) + var6;
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var7 + var13;
            int var15 = -var13 + var5;
            if (var9 != 0) {
                if (var9 != 1) {
                    if (~var9 != -3) {
                        if (~var9 != -4) {
                            if (var9 != 4) {
                                if (~var9 == -6) {
                                    this.field8572 = var15;
                                    this.field8587 = var5;
                                    this.field8571 = var7;
                                }
                            } else {
                                this.field8572 = var5;
                                this.field8571 = var7;
                                this.field8587 = var14;
                            }
                        } else {
                            this.field8572 = var5;
                            this.field8587 = var7;
                            this.field8571 = var15;
                        }
                    } else {
                        this.field8572 = var14;
                        this.field8587 = var7;
                        this.field8571 = var5;
                    }
                } else {
                    this.field8587 = var15;
                    this.field8572 = var7;
                    this.field8571 = var5;
                }
            } else {
                this.field8571 = var14;
                this.field8587 = var5;
                this.field8572 = var7;
            }
        } else {
            this.field8587 = this.field8571 = this.field8572 = arg3;
        }
        if (arg2 != 0) {
            method3551(-38, -63, -87, 72, 72, (byte[]) null);
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(IIII)V")
    private final void method3553(int arg0, int arg1, int arg2, int arg3) {
        ++field8573;
        int var5 = arg1 < arg3 ? arg3 : arg1;
        int var6 = ~var5 > ~arg2 ? arg2 : var5;
        int var7 = arg1 > arg3 ? arg3 : arg1;
        int var8 = arg2 < var7 ? arg2 : var7;
        int var9 = var6 - var8;
        if (arg0 != -28138) {
            field8576 = false;
        }
        this.field8570 = (var6 + var8) / 2;
        if (this.field8570 > 0 && this.field8570 < 4096) {
            this.field8574 = (var9 << 12) / (~this.field8570 < -2049 ? -(this.field8570 * 2) + 8192 : this.field8570 * 2);
        } else {
            this.field8574 = 0;
        }
        if (~var9 < -1) {
            int var10 = (-arg3 + var6 << 12) / var9;
            int var11 = (-arg1 + var6 << 12) / var9;
            int var12 = (-arg2 + var6 << 12) / var9;
            if (arg3 != var6) {
                if (~arg1 != ~var6) {
                    this.field8579 = ~arg3 == ~var8 ? var11 + 12288 : -var10 + 20480;
                } else {
                    this.field8579 = arg2 != var8 ? -var12 + 12288 : var10 + 4096;
                }
            } else {
                this.field8579 = ~arg1 == ~var8 ? var12 + 20480 : 4096 - var11;
            }
            this.field8579 /= 6;
        } else {
            this.field8579 = 0;
        }
    }
}
