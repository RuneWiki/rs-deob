import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class363 extends class145 {

    @OriginalMember(owner = "client!wg", name = "P", descriptor = "[B")
    private byte[] field5510 = new byte[512];

    @OriginalMember(owner = "client!wg", name = "I", descriptor = "I")
    public int field5503 = 1638;

    @OriginalMember(owner = "client!wg", name = "R", descriptor = "I")
    public int field5511 = 4;

    @OriginalMember(owner = "client!wg", name = "O", descriptor = "Z")
    public boolean field5509 = true;

    @OriginalMember(owner = "client!wg", name = "H", descriptor = "I")
    public int field5502 = 0;

    @OriginalMember(owner = "client!wg", name = "N", descriptor = "I")
    public int field5508 = 4;

    @OriginalMember(owner = "client!wg", name = "E", descriptor = "I")
    public int field5499 = 4;

    @OriginalMember(owner = "client!wg", name = "G", descriptor = "I")
    public static int field5501;

    @OriginalMember(owner = "client!wg", name = "J", descriptor = "I")
    public static int field5504;

    @OriginalMember(owner = "client!wg", name = "K", descriptor = "I")
    public static int field5505;

    @OriginalMember(owner = "client!wg", name = "L", descriptor = "I")
    public static int field5506;

    @OriginalMember(owner = "client!wg", name = "T", descriptor = "I")
    public static int field5513;

    @OriginalMember(owner = "client!wg", name = "U", descriptor = "I")
    public static int field5514;

    @OriginalMember(owner = "client!wg", name = "V", descriptor = "I")
    public static int field5515;

    @OriginalMember(owner = "client!wg", name = "W", descriptor = "I")
    public static int field5516;

    @OriginalMember(owner = "client!wg", name = "X", descriptor = "I")
    public static int field5517;

    @OriginalMember(owner = "client!wg", name = "S", descriptor = "Lfda;")
    public static class270 field5512;

    @OriginalMember(owner = "client!wg", name = "F", descriptor = "[S")
    private short[] field5500;

    @OriginalMember(owner = "client!wg", name = "M", descriptor = "[S")
    private short[] field5507;

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "()V")
    public class363() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IILrt;)V")
    public final void method28(int arg0, int arg1, class194 arg2) {
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (~arg0 == -7) {
                                    this.field5511 = arg2.method1177(255);
                                }
                            } else {
                                this.field5508 = arg2.method1177(255);
                            }
                        } else {
                            this.field5502 = arg2.method1177(255);
                        }
                    } else {
                        this.field5508 = this.field5511 = arg2.method1177(255);
                    }
                } else {
                    this.field5503 = arg2.method1233(65280);
                    if (~this.field5503 > -1) {
                        this.field5500 = new short[this.field5499];
                        for (int var5 = 0; ~var5 > ~this.field5499; ++var5) {
                            this.field5500[var5] = (short) arg2.method1233(65280);
                        }
                    }
                }
            } else {
                this.field5499 = arg2.method1177(255);
            }
        } else {
            this.field5509 = ~arg2.method1177(255) == -2;
        }
        if (arg1 >= -67) {
            this.field5508 = -90;
        }
        ++field5516;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)V")
    private final void method2337(byte arg0) {
        if (arg0 > -103) {
            this.field5507 = null;
        }
        if (this.field5503 > 0) {
            this.field5500 = new short[this.field5499];
            this.field5507 = new short[this.field5499];
            for (int var2 = 0; var2 < this.field5499; ++var2) {
                this.field5500[var2] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field5503 / 4096.0F), (double) var2)));
                this.field5507[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        } else if (this.field5500 != null && this.field5500.length == this.field5499) {
            this.field5507 = new short[this.field5499];
            for (int var3 = 0; ~var3 > ~this.field5499; ++var3) {
                this.field5507[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        ++field5505;
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(III)Z")
    public static final boolean method2338(int arg0, int arg1, int arg2) {
        if (arg1 != 1024) {
            field5512 = null;
        }
        ++field5501;
        return (arg2 & 1024) != 0;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZLe;ILjava/awt/Canvas;)Loa;")
    public static final class605 method2339(boolean arg0, class462 arg1, int arg2, Canvas arg3) {
        if (arg2 >= -119) {
            field5512 = null;
        }
        ++field5504;
        return arg0 ? new class449(arg3, arg1) : new class118(arg3, arg1);
    }

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "(I)V")
    public final void method145(int arg0) {
        this.field5510 = class243.method1621(this.field5502, (byte) -123);
        int var2 = 45 % ((-46 - arg0) / 45);
        ++field5517;
        this.method2337((byte) -127);
        for (int var3 = this.field5499 + -1; ~var3 <= -2; --var3) {
            short var4 = this.field5500[var3];
            if (var4 > 8) {
                return;
            }
            if (var4 < -8) {
                return;
            }
            --this.field5499;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZI)[I")
    public final int[] method27(boolean arg0, int arg1) {
        if (arg0) {
            this.field5500 = null;
        }
        ++field5506;
        int[] var3 = super.field1779.method2069(-2, arg1);
        if (super.field1779.field4602) {
            this.method2341((byte) 93, var3, arg1);
        }
        return var3;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILad;)V")
    public static final void method2340(int arg0, class362 arg1) {
        if (arg0 != 28492) {
            method2338(33, -86, -21);
        }
        if (class626.field9060 == null) {
            class590 var2 = new class590();
            byte[] var3 = var2.method3442(128, -22908, 128, 16);
            class626.field9060 = class295.method1981(arg0 + -29545, var3, false);
        }
        ++field5513;
        if (class238.field3390 == null) {
            class456 var4 = new class456();
            byte[] var5 = var4.method2815(128, 128, 1, 16);
            class238.field3390 = class295.method1981(-1053, var5, false);
        }
        class489 var6 = arg1.field5352;
        if (var6.method2936((byte) -122) && class277.field3860 == null) {
            byte[] var7 = class34.method193(128, 16.0F, new class198(419684), 4.0F, 16, true, 128, 0.6F, 8, 4.0F, 0.5F);
            class277.field3860 = class295.method1981(arg0 + -29545, var7, false);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(B[II)V")
    public final void method2341(byte arg0, int[] arg1, int arg2) {
        ++field5514;
        int var4 = class573.field8270[arg2] * this.field5511;
        int var5 = -98 / ((-48 - arg0) / 54);
        if (~this.field5499 == -2) {
            int var6 = this.field5507[0] << 12;
            short var7 = this.field5500[0];
            int var8 = this.field5508 * var6 >> 12;
            int var9 = var4 * var6 >> 12;
            int var10 = this.field5511 * var6 >> 12;
            int var11 = var9 >> 12;
            int var12 = var11 + 1;
            if (var12 >= var10) {
                var12 = 0;
            }
            int var13 = var9 & 4095;
            int var14 = 255 & this.field5510[255 & var12];
            int var15 = class455.field6808[var13];
            int var16 = this.field5510[255 & var11] & 255;
            if (this.field5509) {
                for (int var17 = 0; var17 < class647.field9368; ++var17) {
                    int var18 = class601.field8779[var17] * this.field5508;
                    int var19 = this.method2343(var15, 101, var14, var6 * var18 >> 12, var8, var13, var16);
                    int var20 = var7 * var19 >> 12;
                    arg1[var17] = (var20 >> 1) + 2048;
                }
            } else {
                for (int var21 = 0; var21 < class647.field9368; ++var21) {
                    int var22 = class601.field8779[var21] * this.field5508;
                    int var23 = this.method2343(var15, 59, var14, var6 * var22 >> 12, var8, var13, var16);
                    arg1[var21] = var7 * var23 >> 12;
                }
            }
        } else {
            short var24 = this.field5500[0];
            if (var24 > 8 || ~var24 > 7) {
                int var25 = this.field5507[0] << 12;
                int var26 = this.field5511 * var25 >> 12;
                int var27 = var4 * var25 >> 12;
                int var28 = this.field5508 * var25 >> 12;
                int var29 = var27 >> 12;
                int var30 = var29 + 1;
                if (~var26 >= ~var30) {
                    var30 = 0;
                }
                int var31 = var27 & 4095;
                int var32 = this.field5510[255 & var30] & 255;
                int var33 = 255 & this.field5510[255 & var29];
                int var34 = class455.field6808[var31];
                for (int var35 = 0; ~var35 > ~class647.field9368; ++var35) {
                    int var55 = class601.field8779[var35] * this.field5508;
                    int var56 = this.method2343(var34, 74, var32, var25 * var55 >> 12, var28, var31, var33);
                    arg1[var35] = var24 * var56 >> 12;
                }
            }
            for (int var36 = 1; this.field5499 > var36; ++var36) {
                short var37 = this.field5500[var36];
                if (~var37 < -9 || var37 < -8) {
                    int var38 = this.field5507[var36] << 12;
                    int var39 = var4 * var38 >> 12;
                    int var40 = this.field5508 * var38 >> 12;
                    int var41 = this.field5511 * var38 >> 12;
                    int var42 = var39 >> 12;
                    int var43 = var42 - -1;
                    int var44 = var39 & 4095;
                    if (var41 <= var43) {
                        var43 = 0;
                    }
                    int var45 = 255 & this.field5510[var42 & 255];
                    int var46 = this.field5510[255 & var43] & 255;
                    int var47 = class455.field6808[var44];
                    if (this.field5509 && this.field5499 + -1 == var36) {
                        for (int var48 = 0; var48 < class647.field9368; ++var48) {
                            int var49 = class601.field8779[var48] * this.field5508;
                            int var50 = this.method2343(var47, 44, var46, var38 * var49 >> 12, var40, var44, var45);
                            int var51 = (var37 * var50 >> 12) + arg1[var48];
                            arg1[var48] = 2048 - -(var51 >> 1);
                        }
                    } else {
                        for (int var52 = 0; class647.field9368 > var52; ++var52) {
                            int var53 = class601.field8779[var52] * this.field5508;
                            int var54 = this.method2343(var47, 24, var46, var38 * var53 >> 12, var40, var44, var45);
                            arg1[var52] += var37 * var54 >> 12;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "(Z)V")
    public static void method2342(boolean arg0) {
        field5512 = null;
        if (arg0) {
            field5512 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIIII)I")
    private final int method2343(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field5515;
        int var8 = arg3 >> 12;
        int var9 = var8 + 1;
        int var10 = var8 & 255;
        if (~var9 <= ~arg4) {
            var9 = 0;
        }
        int var11 = arg3 & 4095;
        int var12 = arg5 + -4096;
        int var13 = var9 & 255;
        int var14 = var11 + -4096;
        int var15 = this.field5510[arg6 + var10] & 3;
        int var16 = class455.field6808[var11];
        int var17;
        if (~var15 >= -2) {
            var17 = var15 == 0 ? arg5 + var11 : -var11 + arg5;
        } else {
            var17 = ~var15 != -3 ? -arg5 + -var11 : -arg5 + var11;
        }
        int var18 = this.field5510[var13 - -arg6] & 3;
        if (arg1 <= 10) {
            this.field5509 = true;
        }
        int var19;
        if (var18 > 1) {
            var19 = var18 == 2 ? var14 - arg5 : -arg5 + -var14;
        } else {
            var19 = ~var18 == -1 ? var14 - -arg5 : -var14 + arg5;
        }
        int var20 = ((var19 - var17) * var16 >> 12) + var17;
        int var21 = 3 & this.field5510[arg2 + var10];
        int var22;
        if (var21 <= 1) {
            var22 = ~var21 != -1 ? -var11 + var12 : var11 - -var12;
        } else {
            var22 = var21 == 2 ? -var12 + var11 : -var11 - var12;
        }
        int var23 = 3 & this.field5510[arg2 + var13];
        int var24;
        if (~var23 < -2) {
            var24 = var23 != 2 ? -var12 + -var14 : -var12 + var14;
        } else {
            var24 = ~var23 != -1 ? -var14 + var12 : var12 + var14;
        }
        int var25 = ((-var22 + var24) * var16 >> 12) + var22;
        return ((var25 - var20) * arg0 >> 12) + var20;
    }
}
