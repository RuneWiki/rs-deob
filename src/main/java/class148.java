import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class148 extends class223 {

    @OriginalMember(owner = "client!w", name = "M", descriptor = "I")
    private int field2190 = 4;

    @OriginalMember(owner = "client!w", name = "K", descriptor = "[B")
    private byte[] field2188 = new byte[512];

    @OriginalMember(owner = "client!w", name = "Q", descriptor = "I")
    private int field2194 = 1638;

    @OriginalMember(owner = "client!w", name = "P", descriptor = "I")
    private int field2193 = 0;

    @OriginalMember(owner = "client!w", name = "N", descriptor = "I")
    private int field2191 = 4;

    @OriginalMember(owner = "client!w", name = "R", descriptor = "I")
    private int field2195 = 4;

    @OriginalMember(owner = "client!w", name = "J", descriptor = "Z")
    private boolean field2187 = true;

    @OriginalMember(owner = "client!w", name = "S", descriptor = "[Ljava/lang/String;")
    public static String[] field2196 = new String[500];

    @OriginalMember(owner = "client!w", name = "O", descriptor = "[B")
    public static byte[] field2192 = new byte[32896];

    @OriginalMember(owner = "client!w", name = "ab", descriptor = "[Lpk;")
    public static class103[] field2204;

    @OriginalMember(owner = "client!w", name = "L", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!w", name = "T", descriptor = "I")
    public static int field2197;

    @OriginalMember(owner = "client!w", name = "V", descriptor = "I")
    public static int field2199;

    @OriginalMember(owner = "client!w", name = "W", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!w", name = "X", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!w", name = "Z", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!w", name = "U", descriptor = "[S")
    private short[] field2198;

    @OriginalMember(owner = "client!w", name = "Y", descriptor = "[S")
    private short[] field2202;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIBIIII)I")
    private final int method1073(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2201;
        int var8 = arg4 + -4096;
        int var9 = arg0 >> 12;
        if (arg2 != 29) {
            return 20;
        } else {
            int var10 = var9 + 1;
            int var11 = var9 & 255;
            int var12 = this.field2188[arg6 + var11] & 3;
            if (~arg1 >= ~var10) {
                var10 = 0;
            }
            int var13 = arg0 & 4095;
            int var14 = var10 & 255;
            int var15 = class293.field4543[var13];
            int var16 = var13 + -4096;
            int var17;
            if (~var12 >= -2) {
                var17 = var12 == 0 ? var13 - -arg4 : arg4 - var13;
            } else {
                var17 = ~var12 == -3 ? var13 - arg4 : -arg4 + -var13;
            }
            int var18 = 3 & this.field2188[var14 - -arg6];
            int var19;
            if (~var18 < -2) {
                var19 = var18 == 2 ? var16 - arg4 : -arg4 + -var16;
            } else {
                var19 = var18 == 0 ? var16 - -arg4 : -var16 + arg4;
            }
            int var20 = ((var19 - var17) * var15 >> 12) + var17;
            int var21 = 3 & this.field2188[arg5 + var11];
            int var22;
            if (~var21 >= -2) {
                var22 = ~var21 == -1 ? var8 + var13 : -var13 + var8;
            } else {
                var22 = ~var21 == -3 ? -var8 + var13 : -var8 + -var13;
            }
            int var23 = this.field2188[arg5 + var14] & 3;
            int var24;
            if (~var23 >= -2) {
                var24 = ~var23 == -1 ? var8 + var16 : -var16 + var8;
            } else {
                var24 = var23 != 2 ? -var8 + -var16 : -var8 + var16;
            }
            int var25 = ((var24 - var22) * var15 >> 12) + var22;
            return ((var25 - var20) * arg3 >> 12) + var20;
        }
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "()V")
    public class148() {
        super(0, true);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(BI)[I")
    public final int[] method40(byte arg0, int arg1) {
        ++field2199;
        int[] var3 = super.field3588.method1611(0, arg1);
        if (arg0 <= 14) {
            this.method40((byte) -37, 120);
        }
        if (super.field3588.field3722) {
            this.method1074(arg1, 83, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(II[I)V")
    private final void method1074(int arg0, int arg1, int[] arg2) {
        ++field2189;
        int var4 = class307.field4925[arg0] * this.field2195;
        int var5 = -10 / ((46 - arg1) / 34);
        if (~this.field2191 == -2) {
            int var6 = this.field2198[0] << 12;
            int var7 = this.field2190 * var6 >> 12;
            int var8 = var4 * var6 >> 12;
            int var9 = this.field2195 * var6 >> 12;
            int var10 = var8 >> 12;
            int var11 = var8 & 4095;
            int var12 = class293.field4543[var11];
            int var13 = 255 & this.field2188[255 & var10];
            int var14 = var10 + 1;
            short var15 = this.field2202[0];
            if (var9 <= var14) {
                var14 = 0;
            }
            int var16 = 255 & this.field2188[255 & var14];
            if (this.field2187) {
                for (int var17 = 0; ~var17 > ~class250.field4008; ++var17) {
                    int var18 = class106.field1662[var17] * this.field2190;
                    int var19 = this.method1073(var6 * var18 >> 12, var7, (byte) 29, var12, var11, var16, var13);
                    int var20 = var15 * var19 >> 12;
                    arg2[var17] = (var20 >> 1) + 2048;
                }
            } else {
                for (int var21 = 0; ~class250.field4008 < ~var21; ++var21) {
                    int var22 = class106.field1662[var21] * this.field2190;
                    int var23 = this.method1073(var6 * var22 >> 12, var7, (byte) 29, var12, var11, var16, var13);
                    arg2[var21] = var15 * var23 >> 12;
                }
            }
        } else {
            short var24 = this.field2202[0];
            if (var24 > 8 || var24 < -8) {
                int var25 = this.field2198[0] << 12;
                int var26 = this.field2195 * var25 >> 12;
                int var27 = var4 * var25 >> 12;
                int var28 = this.field2190 * var25 >> 12;
                int var29 = var27 >> 12;
                int var30 = var27 & 4095;
                int var31 = var29 + 1;
                int var32 = 255 & this.field2188[var29 & 255];
                int var33 = class293.field4543[var30];
                if (var31 >= var26) {
                    var31 = 0;
                }
                int var34 = this.field2188[255 & var31] & 255;
                for (int var35 = 0; ~class250.field4008 < ~var35; ++var35) {
                    int var55 = class106.field1662[var35] * this.field2190;
                    int var56 = this.method1073(var25 * var55 >> 12, var28, (byte) 29, var33, var30, var34, var32);
                    arg2[var35] = var24 * var56 >> 12;
                }
            }
            for (int var36 = 1; ~this.field2191 < ~var36; ++var36) {
                short var37 = this.field2202[var36];
                if (var37 > 8 || ~var37 > 7) {
                    int var38 = this.field2198[var36] << 12;
                    int var39 = var4 * var38 >> 12;
                    int var40 = var39 >> 12;
                    int var41 = var39 & 4095;
                    int var42 = var40 + 1;
                    int var43 = this.field2188[255 & var40] & 255;
                    int var44 = this.field2195 * var38 >> 12;
                    int var45 = class293.field4543[var41];
                    int var46 = this.field2190 * var38 >> 12;
                    if (var44 <= var42) {
                        var42 = 0;
                    }
                    int var47 = 255 & this.field2188[255 & var42];
                    if (this.field2187 && ~(this.field2191 + -1) == ~var36) {
                        for (int var48 = 0; var48 < class250.field4008; ++var48) {
                            int var49 = class106.field1662[var48] * this.field2190;
                            int var50 = this.method1073(var38 * var49 >> 12, var46, (byte) 29, var45, var41, var47, var43);
                            int var51 = (var37 * var50 >> 12) + arg2[var48];
                            arg2[var48] = (var51 >> 1) + 2048;
                        }
                    } else {
                        for (int var52 = 0; ~class250.field4008 < ~var52; ++var52) {
                            int var53 = class106.field1662[var52] * this.field2190;
                            int var54 = this.method1073(var38 * var53 >> 12, var46, (byte) 29, var45, var41, var47, var43);
                            arg2[var52] += var37 * var54 >> 12;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "d", descriptor = "(I)V")
    public final void method43(int arg0) {
        ++field2203;
        this.field2188 = class307.method2055((byte) 108, this.field2193);
        this.method1075((byte) 101);
        if (arg0 != 500) {
            this.method1075((byte) -26);
        }
        for (int var2 = this.field2191 + -1; var2 >= 1; --var2) {
            short var3 = this.field2202[var2];
            if (~var3 < -9) {
                return;
            }
            if (~var3 > 7) {
                return;
            }
            --this.field2191;
        }
    }

    @OriginalMember(owner = "client!w", name = "d", descriptor = "(B)V")
    private final void method1075(byte arg0) {
        if (~this.field2194 < -1) {
            this.field2202 = new short[this.field2191];
            this.field2198 = new short[this.field2191];
            for (int var2 = 0; ~this.field2191 < ~var2; ++var2) {
                this.field2202[var2] = (short) ((int) (Math.pow((double) ((float) this.field2194 / 4096.0F), (double) var2) * 4096.0D));
                this.field2198[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        } else if (this.field2202 != null && ~this.field2202.length == ~this.field2191) {
            this.field2198 = new short[this.field2191];
            for (int var3 = 0; ~this.field2191 < ~var3; ++var3) {
                this.field2198[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        if (arg0 != 101) {
            this.method1074(-125, 33, (int[]) null);
        }
        ++field2197;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lha;IB)V")
    public final void method37(class31 arg0, int arg1, byte arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (arg1 == 6) {
                                    this.field2195 = arg0.method265(-103);
                                }
                            } else {
                                this.field2190 = arg0.method265(-92);
                            }
                        } else {
                            this.field2193 = arg0.method265(-94);
                        }
                    } else {
                        this.field2190 = this.field2195 = arg0.method265(-116);
                    }
                } else {
                    this.field2194 = arg0.method308((byte) 96);
                    if (~this.field2194 > -1) {
                        this.field2202 = new short[this.field2191];
                        for (int var5 = 0; var5 < this.field2191; ++var5) {
                            this.field2202[var5] = (short) arg0.method308((byte) 45);
                        }
                    }
                }
            } else {
                this.field2191 = arg0.method265(-113);
            }
        } else {
            this.field2187 = ~arg0.method265(-88) == -2;
        }
        ++field2200;
        if (arg2 != 102) {
            this.field2198 = null;
        }
    }

    @OriginalMember(owner = "client!w", name = "f", descriptor = "(I)V")
    public static void method1076(int arg0) {
        field2204 = null;
        field2192 = null;
        field2196 = null;
        int var1 = -87 % ((arg0 - -57) / 42);
    }

    static {
        int var0 = 0;
        for (int var1 = 0; ~var1 > -257; ++var1) {
            for (int var2 = 0; ~var1 <= ~var2; ++var2) {
                field2192[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 - -65535) / 65535.0F))));
            }
        }
        field2204 = new class103[14];
    }
}
