import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class423 extends class270 {

    @OriginalMember(owner = "client!rb", name = "G", descriptor = "I")
    public int field6149 = 4;

    @OriginalMember(owner = "client!rb", name = "L", descriptor = "[B")
    private byte[] field6153 = new byte[512];

    @OriginalMember(owner = "client!rb", name = "V", descriptor = "I")
    public int field6162 = 1638;

    @OriginalMember(owner = "client!rb", name = "U", descriptor = "I")
    public int field6161 = 4;

    @OriginalMember(owner = "client!rb", name = "W", descriptor = "I")
    public int field6163 = 4;

    @OriginalMember(owner = "client!rb", name = "P", descriptor = "Z")
    public boolean field6157 = true;

    @OriginalMember(owner = "client!rb", name = "ab", descriptor = "I")
    public int field6167 = 0;

    @OriginalMember(owner = "client!rb", name = "O", descriptor = "Lfg;")
    public static class18 field6156 = new class18(64);

    @OriginalMember(owner = "client!rb", name = "cb", descriptor = "I")
    public static int field6169 = -2;

    @OriginalMember(owner = "client!rb", name = "H", descriptor = "I")
    public static int field6150;

    @OriginalMember(owner = "client!rb", name = "K", descriptor = "I")
    public static int field6152;

    @OriginalMember(owner = "client!rb", name = "M", descriptor = "I")
    public static int field6154;

    @OriginalMember(owner = "client!rb", name = "N", descriptor = "I")
    public static int field6155;

    @OriginalMember(owner = "client!rb", name = "R", descriptor = "I")
    public static int field6158;

    @OriginalMember(owner = "client!rb", name = "S", descriptor = "I")
    public static int field6159;

    @OriginalMember(owner = "client!rb", name = "T", descriptor = "I")
    public static int field6160;

    @OriginalMember(owner = "client!rb", name = "Y", descriptor = "I")
    public static int field6165;

    @OriginalMember(owner = "client!rb", name = "Z", descriptor = "I")
    public static int field6166;

    @OriginalMember(owner = "client!rb", name = "bb", descriptor = "I")
    public static int field6168;

    @OriginalMember(owner = "client!rb", name = "db", descriptor = "Ldp;")
    public static class174 field6170;

    @OriginalMember(owner = "client!rb", name = "eb", descriptor = "Lr;")
    public static class63 field6171;

    @OriginalMember(owner = "client!rb", name = "J", descriptor = "[S")
    private short[] field6151;

    @OriginalMember(owner = "client!rb", name = "X", descriptor = "[S")
    private short[] field6164;

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V")
    public class423() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "(I)V")
    private final void method2653(int arg0) {
        int var2 = -41 % ((arg0 - -31) / 50);
        if (~this.field6162 < -1) {
            this.field6151 = new short[this.field6161];
            this.field6164 = new short[this.field6161];
            for (int var3 = 0; this.field6161 > var3; ++var3) {
                this.field6164[var3] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field6162 / 4096.0F), (double) var3)));
                this.field6151[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        } else if (this.field6164 != null && this.field6164.length == this.field6161) {
            this.field6151 = new short[this.field6161];
            for (int var4 = 0; ~this.field6161 < ~var4; ++var4) {
                this.field6151[var4] = (short) ((int) Math.pow(2.0D, (double) var4));
            }
        }
        ++field6155;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Ldp;Z)V")
    public static final void method2654(class174 arg0, boolean arg1) {
        ++field6152;
        if (arg1) {
            class158.field2422 = arg0;
            class158.field2422.method1333(0, 35);
        }
    }

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "(B)V")
    public static void method2655(byte arg0) {
        field6170 = null;
        field6156 = null;
        field6171 = null;
        int var1 = -78 % ((40 - arg0) / 35);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(BI)[I")
    public final int[] method81(byte arg0, int arg1) {
        ++field6160;
        int[] var3 = super.field4053.method396(arg1, 79);
        if (arg0 <= 26) {
            return null;
        } else {
            if (super.field4053.field815) {
                this.method2658(var3, 5262, arg1);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Z)V")
    public final void method83(boolean arg0) {
        ++field6166;
        this.field6153 = class105.method937(-99, this.field6167);
        this.method2653(103);
        if (!arg0) {
            field6170 = null;
        }
        for (int var2 = this.field6161 + -1; ~var2 <= -2; --var2) {
            short var3 = this.field6164[var2];
            if (~var3 < -9) {
                return;
            }
            if (var3 < -8) {
                return;
            }
            --this.field6161;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(BIIIIII)I")
    private final int method2656(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field6158;
        int var8 = arg1 >> 12;
        int var9 = var8 + 1;
        int var10 = var8 & 255;
        int var11 = arg1 & 4095;
        if (~var9 <= ~arg5) {
            var9 = 0;
        }
        int var12 = var11 + -4096;
        int var13 = var9 & 255;
        int var14 = arg4 + -4096;
        int var15 = class144.field2244[var11];
        int var16 = 3 & this.field6153[arg3 + var10];
        int var17;
        if (var16 <= 1) {
            var17 = var16 == 0 ? var11 - -arg4 : -var11 + arg4;
        } else {
            var17 = var16 == 2 ? -arg4 + var11 : -arg4 + -var11;
        }
        int var18 = 3 & this.field6153[var13 - -arg3];
        int var19;
        if (var18 > 1) {
            var19 = var18 == 2 ? -arg4 + var12 : -arg4 + -var12;
        } else {
            var19 = var18 != 0 ? -var12 + arg4 : var12 - -arg4;
        }
        int var20 = ((var19 - var17) * var15 >> 12) + var17;
        int var21 = this.field6153[arg6 + var10] & 3;
        int var22;
        if (var21 <= 1) {
            var22 = ~var21 != -1 ? -var11 + var14 : var11 - -var14;
        } else {
            var22 = var21 != 2 ? -var11 + -var14 : -var14 + var11;
        }
        int var23 = 3 & this.field6153[arg6 + var13];
        int var24;
        if (var23 <= 1) {
            var24 = var23 == 0 ? var12 + var14 : var14 - var12;
        } else {
            var24 = var23 != 2 ? -var12 - var14 : -var14 + var12;
        }
        int var25 = ((-var22 + var24) * var15 >> 12) + var22;
        return arg0 > -119 ? -64 : var20 - -((-var20 + var25) * arg2 >> 12);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(CB)Z")
    public static final boolean method2657(char arg0, byte arg1) {
        ++field6154;
        if (arg1 != 19) {
            field6170 = null;
        }
        return ~arg0 <= -49 && ~arg0 >= -58;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "([III)V")
    public final void method2658(int[] arg0, int arg1, int arg2) {
        ++field6159;
        if (arg1 != 5262) {
            field6170 = null;
        }
        int var4 = class364.field5185[arg2] * this.field6163;
        if (~this.field6161 != -2) {
            short var5 = this.field6164[0];
            if (var5 > 8 || var5 < -8) {
                int var6 = this.field6151[0] << 12;
                int var7 = var4 * var6 >> 12;
                int var8 = this.field6163 * var6 >> 12;
                int var9 = this.field6149 * var6 >> 12;
                int var10 = var7 >> 12;
                int var11 = var10 + 1;
                int var12 = var7 & 4095;
                if (var8 <= var11) {
                    var11 = 0;
                }
                int var13 = this.field6153[255 & var11] & 255;
                int var14 = class144.field2244[var12];
                int var15 = this.field6153[255 & var10] & 255;
                for (int var16 = 0; ~class161.field2445 < ~var16; ++var16) {
                    int var36 = class136.field2168[var16] * this.field6149;
                    int var37 = this.method2656((byte) -121, var6 * var36 >> 12, var14, var15, var12, var9, var13);
                    arg0[var16] = var5 * var37 >> 12;
                }
            }
            for (int var17 = 1; this.field6161 > var17; ++var17) {
                short var18 = this.field6164[var17];
                if (~var18 < -9 || var18 < -8) {
                    int var19 = this.field6151[var17] << 12;
                    int var20 = this.field6149 * var19 >> 12;
                    int var21 = this.field6163 * var19 >> 12;
                    int var22 = var4 * var19 >> 12;
                    int var23 = var22 >> 12;
                    int var24 = var23 + 1;
                    int var25 = var22 & 4095;
                    if (~var24 <= ~var21) {
                        var24 = 0;
                    }
                    int var26 = this.field6153[255 & var24] & 255;
                    int var27 = class144.field2244[var25];
                    int var28 = this.field6153[255 & var23] & 255;
                    if (this.field6157 && this.field6161 + -1 == var17) {
                        for (int var29 = 0; var29 < class161.field2445; ++var29) {
                            int var30 = class136.field2168[var29] * this.field6149;
                            int var31 = this.method2656((byte) -124, var19 * var30 >> 12, var27, var28, var25, var20, var26);
                            int var32 = (var18 * var31 >> 12) + arg0[var29];
                            arg0[var29] = 2048 - -(var32 >> 1);
                        }
                    } else {
                        for (int var33 = 0; class161.field2445 > var33; ++var33) {
                            int var34 = class136.field2168[var33] * this.field6149;
                            int var35 = this.method2656((byte) -128, var19 * var34 >> 12, var27, var28, var25, var20, var26);
                            arg0[var33] += var18 * var35 >> 12;
                        }
                    }
                }
            }
        } else {
            short var38 = this.field6164[0];
            int var39 = this.field6151[0] << 12;
            int var40 = var4 * var39 >> 12;
            int var41 = this.field6163 * var39 >> 12;
            int var42 = this.field6149 * var39 >> 12;
            int var43 = var40 >> 12;
            int var44 = var43 + 1;
            if (var41 <= var44) {
                var44 = 0;
            }
            int var45 = var40 & 4095;
            int var46 = class144.field2244[var45];
            int var47 = 255 & this.field6153[var44 & 255];
            int var48 = 255 & this.field6153[255 & var43];
            if (!this.field6157) {
                for (int var49 = 0; var49 < class161.field2445; ++var49) {
                    int var50 = class136.field2168[var49] * this.field6149;
                    int var51 = this.method2656((byte) -127, var39 * var50 >> 12, var46, var48, var45, var42, var47);
                    arg0[var49] = var38 * var51 >> 12;
                }
            } else {
                for (int var52 = 0; var52 < class161.field2445; ++var52) {
                    int var53 = class136.field2168[var52] * this.field6149;
                    int var54 = this.method2656((byte) -122, var39 * var53 >> 12, var46, var48, var45, var42, var47);
                    int var55 = var38 * var54 >> 12;
                    arg0[var52] = (var55 >> 1) + 2048;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(BLec;I)V")
    public final void method78(byte arg0, class37 arg1, int arg2) {
        ++field6168;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (arg2 != 3) {
                        if (~arg2 != -5) {
                            if (arg2 != 5) {
                                if (arg2 == 6) {
                                    this.field6163 = arg1.method271((byte) 113);
                                }
                            } else {
                                this.field6149 = arg1.method271((byte) 114);
                            }
                        } else {
                            this.field6167 = arg1.method271((byte) 107);
                        }
                    } else {
                        this.field6149 = this.field6163 = arg1.method271((byte) 126);
                    }
                } else {
                    this.field6162 = arg1.method321((byte) 103);
                    if (~this.field6162 > -1) {
                        this.field6164 = new short[this.field6161];
                        for (int var5 = 0; this.field6161 > var5; ++var5) {
                            this.field6164[var5] = (short) arg1.method321((byte) 107);
                        }
                    }
                }
            } else {
                this.field6161 = arg1.method271((byte) 107);
            }
        } else {
            this.field6157 = ~arg1.method271((byte) 101) == -2;
        }
        if (arg0 != 108) {
            method2657('Q', (byte) 68);
        }
    }
}
