import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class215 extends class3 {

    @OriginalMember(owner = "client!ch", name = "M", descriptor = "I")
    public int field3312 = 4;

    @OriginalMember(owner = "client!ch", name = "L", descriptor = "I")
    public int field3311 = 4;

    @OriginalMember(owner = "client!ch", name = "X", descriptor = "Z")
    public boolean field3323 = true;

    @OriginalMember(owner = "client!ch", name = "Q", descriptor = "I")
    public int field3316 = 4;

    @OriginalMember(owner = "client!ch", name = "S", descriptor = "I")
    public int field3318 = 0;

    @OriginalMember(owner = "client!ch", name = "T", descriptor = "[B")
    private byte[] field3319 = new byte[512];

    @OriginalMember(owner = "client!ch", name = "I", descriptor = "I")
    public int field3308 = 1638;

    @OriginalMember(owner = "client!ch", name = "W", descriptor = "I")
    public static int field3322 = 0;

    @OriginalMember(owner = "client!ch", name = "G", descriptor = "I")
    public static int field3306;

    @OriginalMember(owner = "client!ch", name = "H", descriptor = "I")
    public static int field3307;

    @OriginalMember(owner = "client!ch", name = "K", descriptor = "I")
    public static int field3310;

    @OriginalMember(owner = "client!ch", name = "N", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!ch", name = "O", descriptor = "I")
    public static int field3314;

    @OriginalMember(owner = "client!ch", name = "P", descriptor = "I")
    public static int field3315;

    @OriginalMember(owner = "client!ch", name = "R", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!ch", name = "U", descriptor = "I")
    public static int field3320;

    @OriginalMember(owner = "client!ch", name = "V", descriptor = "I")
    public static int field3321;

    @OriginalMember(owner = "client!ch", name = "Y", descriptor = "I")
    public static int field3324;

    @OriginalMember(owner = "client!ch", name = "F", descriptor = "[S")
    private short[] field3305;

    @OriginalMember(owner = "client!ch", name = "J", descriptor = "[S")
    private short[] field3309;

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "(III)Loe;", line = 15)
    public static final class86 method1458(int arg0, int arg1, int arg2) {
        class50 var3 = class264.field4230[arg0][arg1][arg2];
        return var3 == null || var3.field733 == null ? null : var3.field733;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BI)[I", line = 26)
    public final int[] method25(byte arg0, int arg1) {
        field3324++;
        int[] var3 = this.field21.method1258(arg1, 0);
        if (arg0 <= 57) {
            this.field3312 = -99;
        }
        if (this.field21.field2808) {
            this.method1461(var3, arg1, -20647);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "(III)V", line = 48)
    public static final void method1459(int arg0, int arg1, int arg2) {
        field3315++;
        class211 var3 = class17.method115(12, arg2, 4086);
        var3.method1433(true);
        var3.field3210 = arg1;
        if (arg0 >= -15) {
            field3313 = 126;
        }
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(IIIII)V", line = 64)
    public static final void method1460(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3320++;
        class195.field2992.field5137 = 0;
        class195.field2992.method2193(20, false);
        class195.field2992.method2193(arg3, false);
        class195.field2992.method2193(arg0, false);
        class195.field2992.method2206(arg2, (byte) -71);
        class195.field2992.method2206(arg1, (byte) -77);
        class268.field4421 = 0;
        class45.field654 = arg4;
        class55.field843 = 1;
        class26.field399 = 0;
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "()V", line = 183)
    public class215() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lfh;IZ)V", line = 88)
    public final void method14(class313 arg0, int arg1, boolean arg2) {
        field3321++;
        if (arg1 == 0) {
            this.field3323 = arg0.method2224(-127) == 1;
        } else if (arg1 == 1) {
            this.field3312 = arg0.method2224(-126);
        } else if (arg1 == 2) {
            this.field3308 = arg0.method2214(0);
            if (this.field3308 < 0) {
                this.field3305 = new short[this.field3312];
                for (int var5 = 0; var5 < this.field3312; var5++) {
                    this.field3305[var5] = (short) arg0.method2214(0);
                }
            }
        } else if (arg1 == 3) {
            this.field3311 = this.field3316 = arg0.method2224(-126);
        } else if (arg1 == 4) {
            this.field3318 = arg0.method2224(-123);
        } else if (arg1 == 5) {
            this.field3311 = arg0.method2224(-128);
        } else if (arg1 == 6) {
            this.field3316 = arg0.method2224(-123);
        }
        if (arg2) {
            method1460(-24, 87, 112, 52, -124);
        }
    }

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "(B)V", line = 190)
    public final void method20(byte arg0) {
        field3306++;
        this.field3319 = class290.method2052(this.field3318, (byte) 126);
        this.method1463((byte) 6);
        for (int var2 = this.field3312 - 1; var2 >= 1; var2--) {
            short var3 = this.field3305[var2];
            if (var3 > 8 || var3 < -8) {
                break;
            }
            this.field3312--;
        }
        int var4 = 3 % ((-arg0 - 20) / 58);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "([III)V", line = 236)
    public final void method1461(int[] arg0, int arg1, int arg2) {
        int var4 = class159.field2546[arg1] * this.field3316;
        field3314++;
        if (arg2 != -20647) {
            this.field3312 = 79;
        }
        if (this.field3312 == 1) {
            short var5 = this.field3305[0];
            int var6 = this.field3309[0] << 12;
            int var7 = this.field3316 * var6 >> 12;
            int var8 = var4 * var6 >> 12;
            int var9 = this.field3311 * var6 >> 12;
            int var10 = var8 >> 12;
            int var11 = var10 + 1;
            if (var11 >= var7) {
                var11 = 0;
            }
            int var12 = var8 & 0xFFF;
            int var13 = this.field3319[var11 & 0xFF] & 0xFF;
            int var14 = class243.field3835[var12];
            int var15 = this.field3319[var10 & 0xFF] & 0xFF;
            if (this.field3323) {
                for (int var19 = 0; var19 < class326.field5342; var19++) {
                    int var20 = class163.field2591[var19] * this.field3311;
                    int var21 = this.method1462(var13, var12, var9, 0, var6 * var20 >> 12, var14, var15);
                    int var22 = var5 * var21 >> 12;
                    arg0[var19] = (var22 >> 1) + 2048;
                }
            } else {
                for (int var16 = 0; var16 < class326.field5342; var16++) {
                    int var17 = class163.field2591[var16] * this.field3311;
                    int var18 = this.method1462(var13, var12, var9, arg2 + 20647, var6 * var17 >> 12, var14, var15);
                    arg0[var16] = var5 * var18 >> 12;
                }
            }
            return;
        }
        short var23 = this.field3305[0];
        if (var23 > 8 || var23 < -8) {
            int var24 = this.field3309[0] << 12;
            int var25 = this.field3316 * var24 >> 12;
            int var26 = var4 * var24 >> 12;
            int var27 = this.field3311 * var24 >> 12;
            int var28 = var26 >> 12;
            int var29 = this.field3319[var28 & 0xFF] & 0xFF;
            int var30 = var28 + 1;
            int var31 = var26 & 0xFFF;
            if (var25 <= var30) {
                var30 = 0;
            }
            int var32 = class243.field3835[var31];
            int var33 = this.field3319[var30 & 0xFF] & 0xFF;
            for (int var34 = 0; var34 < class326.field5342; var34++) {
                int var35 = class163.field2591[var34] * this.field3311;
                int var36 = this.method1462(var33, var31, var27, 0, var24 * var35 >> 12, var32, var29);
                arg0[var34] = var23 * var36 >> 12;
            }
        }
        for (int var37 = 1; var37 < this.field3312; var37++) {
            short var38 = this.field3305[var37];
            if (var38 > 8 || var38 < -8) {
                int var39 = this.field3309[var37] << 12;
                int var40 = var4 * var39 >> 12;
                int var41 = this.field3311 * var39 >> 12;
                int var42 = this.field3316 * var39 >> 12;
                int var43 = var40 >> 12;
                int var44 = var40 & 0xFFF;
                int var45 = this.field3319[var43 & 0xFF] & 0xFF;
                int var46 = class243.field3835[var44];
                int var47 = var43 + 1;
                if (var47 >= var42) {
                    var47 = 0;
                }
                int var48 = this.field3319[var47 & 0xFF] & 0xFF;
                if (this.field3323 && this.field3312 - 1 == var37) {
                    for (int var49 = 0; var49 < class326.field5342; var49++) {
                        int var50 = class163.field2591[var49] * this.field3311;
                        int var51 = this.method1462(var48, var44, var41, arg2 + 20647, var39 * var50 >> 12, var46, var45);
                        int var52 = arg0[var49] + (var38 * var51 >> 12);
                        arg0[var49] = (var52 >> 1) + 2048;
                    }
                } else {
                    for (int var53 = 0; var53 < class326.field5342; var53++) {
                        int var54 = class163.field2591[var53] * this.field3311;
                        int var55 = this.method1462(var48, var44, var41, 0, var39 * var54 >> 12, var46, var45);
                        arg0[var53] += var38 * var55 >> 12;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIIII)I", line = 399)
    private final int method1462(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3307++;
        int var8 = arg4 >> 12;
        int var9 = var8 + 1;
        if (var9 >= arg2) {
            var9 = 0;
        }
        int var10 = arg4 & 0xFFF;
        int var11 = arg1 - 4096;
        int var12 = class243.field3835[var10];
        int var13 = var9 & 0xFF;
        int var14 = var10 - 4096;
        int var15 = var8 & 0xFF;
        int var16 = this.field3319[arg6 + var15] & 0x3;
        if (arg3 != 0) {
            method1459(-5, -87, 88);
        }
        int var17;
        if (var16 > 1) {
            var17 = var16 == 2 ? var10 - arg1 : -arg1 + -var10;
        } else {
            var17 = var16 == 0 ? arg1 + var10 : -var10 + arg1;
        }
        int var18 = this.field3319[arg6 + var13] & 0x3;
        int var19;
        if (var18 <= 1) {
            var19 = var18 == 0 ? arg1 + var14 : -var14 + arg1;
        } else {
            var19 = var18 == 2 ? var14 - arg1 : -arg1 + -var14;
        }
        int var20 = ((var19 - var17) * var12 >> 12) + var17;
        int var21 = this.field3319[var15 + arg0] & 0x3;
        int var22;
        if (var21 > 1) {
            var22 = var21 == 2 ? var10 - var11 : -var10 - var11;
        } else {
            var22 = var21 == 0 ? var10 + var11 : -var10 + var11;
        }
        int var23 = this.field3319[arg0 + var13] & 0x3;
        int var24;
        if (var23 > 1) {
            var24 = var23 == 2 ? var14 - var11 : -var11 + -var14;
        } else {
            var24 = var23 == 0 ? var11 + var14 : -var14 + var11;
        }
        int var25 = ((var24 - var22) * var12 >> 12) + var22;
        return ((var25 - var20) * arg5 >> 12) + var20;
    }

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "(B)V", line = 474)
    private final void method1463(byte arg0) {
        if (this.field3308 > 0) {
            this.field3309 = new short[this.field3312];
            this.field3305 = new short[this.field3312];
            for (int var2 = 0; var2 < this.field3312; var2++) {
                this.field3305[var2] = (short) ((int) (Math.pow((double) ((float) this.field3308 / 4096.0F), (double) var2) * 4096.0D));
                this.field3309[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        } else if (this.field3305 != null && this.field3305.length == this.field3312) {
            this.field3309 = new short[this.field3312];
            for (int var3 = 0; var3 < this.field3312; var3++) {
                this.field3309[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        if (arg0 == 6) {
            field3310++;
        }
    }
}
