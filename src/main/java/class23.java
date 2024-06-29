import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class23 extends class115 {

    @OriginalMember(owner = "client!na", name = "Y", descriptor = "I")
    private int field305 = 0;

    @OriginalMember(owner = "client!na", name = "O", descriptor = "I")
    private int field296 = 4;

    @OriginalMember(owner = "client!na", name = "X", descriptor = "I")
    private int field304 = 4;

    @OriginalMember(owner = "client!na", name = "L", descriptor = "[B")
    private byte[] field293 = new byte[512];

    @OriginalMember(owner = "client!na", name = "T", descriptor = "I")
    private int field300 = 4;

    @OriginalMember(owner = "client!na", name = "bb", descriptor = "Z")
    private boolean field308 = true;

    @OriginalMember(owner = "client!na", name = "gb", descriptor = "I")
    private int field313 = 1638;

    @OriginalMember(owner = "client!na", name = "N", descriptor = "[I")
    public static int[] field295 = new int[32];

    @OriginalMember(owner = "client!na", name = "ab", descriptor = "I")
    public static volatile int field307 = -1;

    @OriginalMember(owner = "client!na", name = "M", descriptor = "I")
    public static int field294 = 0;

    @OriginalMember(owner = "client!na", name = "cb", descriptor = "Ljava/lang/String;")
    public static String field309 = "Allocating memory";

    @OriginalMember(owner = "client!na", name = "fb", descriptor = "[I")
    public static int[] field312 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!na", name = "J", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!na", name = "K", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!na", name = "P", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!na", name = "Q", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!na", name = "R", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "client!na", name = "U", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!na", name = "V", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!na", name = "Z", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!na", name = "W", descriptor = "[I")
    public static int[] field303;

    @OriginalMember(owner = "client!na", name = "db", descriptor = "[S")
    private short[] field310;

    @OriginalMember(owner = "client!na", name = "eb", descriptor = "[S")
    private short[] field311;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(CI)Z")
    public static final boolean method167(char arg0, int arg1) {
        if (arg1 != -5555) {
            return false;
        } else {
            ++field301;
            return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ILkl;I)V")
    public final void method168(int arg0, class114 arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (~arg2 != -5) {
                            if (~arg2 != -6) {
                                if (arg2 == 6) {
                                    this.field304 = arg1.method760(false);
                                }
                            } else {
                                this.field296 = arg1.method760(false);
                            }
                        } else {
                            this.field305 = arg1.method760(false);
                        }
                    } else {
                        this.field296 = this.field304 = arg1.method760(false);
                    }
                } else {
                    this.field313 = arg1.method763(true);
                    if (this.field313 < 0) {
                        this.field311 = new short[this.field300];
                        for (int var5 = 0; this.field300 > var5; ++var5) {
                            this.field311[var5] = (short) arg1.method763(true);
                        }
                    }
                }
            } else {
                this.field300 = arg1.method760(false);
            }
        } else {
            this.field308 = ~arg1.method760(false) == -2;
        }
        if (arg0 != -1) {
            this.method170((byte) -107);
        }
        ++field291;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I[II)V")
    private final void method169(int arg0, int[] arg1, int arg2) {
        ++field297;
        int var4 = class187.field2664[arg0] * this.field304;
        if (arg2 == 0) {
            if (this.field300 != 1) {
                short var5 = this.field311[0];
                if (~var5 < -9 || var5 < -8) {
                    int var6 = this.field310[0] << 12;
                    int var7 = var4 * var6 >> 12;
                    int var8 = var7 >> 12;
                    int var9 = var8 + 1;
                    int var10 = this.field304 * var6 >> 12;
                    int var11 = this.field296 * var6 >> 12;
                    int var12 = 255 & this.field293[255 & var8];
                    int var13 = var7 & 4095;
                    int var14 = class270.field4234[var13];
                    if (var9 >= var10) {
                        var9 = 0;
                    }
                    int var15 = 255 & this.field293[var9 & 255];
                    for (int var16 = 0; ~var16 > ~class77.field1178; ++var16) {
                        int var36 = class169.field2444[var16] * this.field296;
                        int var37 = this.method175(var13, var12, (byte) -81, var11, var14, var6 * var36 >> 12, var15);
                        arg1[var16] = var5 * var37 >> 12;
                    }
                }
                for (int var17 = 1; ~var17 > ~this.field300; ++var17) {
                    short var18 = this.field311[var17];
                    if (~var18 < -9 || var18 < -8) {
                        int var19 = this.field310[var17] << 12;
                        int var20 = this.field304 * var19 >> 12;
                        int var21 = var4 * var19 >> 12;
                        int var22 = var21 >> 12;
                        int var23 = this.field296 * var19 >> 12;
                        int var24 = 255 & this.field293[var22 & 255];
                        int var25 = var22 - -1;
                        int var26 = var21 & 4095;
                        int var27 = class270.field4234[var26];
                        if (var20 <= var25) {
                            var25 = 0;
                        }
                        int var28 = this.field293[var25 & 255] & 255;
                        if (this.field308 && ~(this.field300 - 1) == ~var17) {
                            for (int var29 = 0; var29 < class77.field1178; ++var29) {
                                int var30 = class169.field2444[var29] * this.field296;
                                int var31 = this.method175(var26, var24, (byte) -81, var23, var27, var19 * var30 >> 12, var28);
                                int var32 = (var18 * var31 >> 12) + arg1[var29];
                                arg1[var29] = 2048 - -(var32 >> 1);
                            }
                        } else {
                            for (int var33 = 0; ~class77.field1178 < ~var33; ++var33) {
                                int var34 = class169.field2444[var33] * this.field296;
                                int var35 = this.method175(var26, var24, (byte) -81, var23, var27, var19 * var34 >> 12, var28);
                                arg1[var33] += var18 * var35 >> 12;
                            }
                        }
                    }
                }
            } else {
                short var38 = this.field311[0];
                int var39 = this.field310[0] << 12;
                int var40 = this.field304 * var39 >> 12;
                int var41 = var4 * var39 >> 12;
                int var42 = var41 >> 12;
                int var43 = var41 & 4095;
                int var44 = this.field296 * var39 >> 12;
                int var45 = class270.field4234[var43];
                int var46 = var42 - -1;
                int var47 = this.field293[255 & var42] & 255;
                if (var46 >= var40) {
                    var46 = 0;
                }
                int var48 = 255 & this.field293[var46 & 255];
                if (this.field308) {
                    for (int var49 = 0; var49 < class77.field1178; ++var49) {
                        int var50 = class169.field2444[var49] * this.field296;
                        int var51 = this.method175(var43, var47, (byte) -81, var44, var45, var39 * var50 >> 12, var48);
                        int var52 = var38 * var51 >> 12;
                        arg1[var49] = (var52 >> 1) + 2048;
                    }
                } else {
                    for (int var53 = 0; class77.field1178 > var53; ++var53) {
                        int var54 = class169.field2444[var53] * this.field296;
                        int var55 = this.method175(var43, var47, (byte) -81, var44, var45, var39 * var54 >> 12, var48);
                        arg1[var53] = var38 * var55 >> 12;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(B)V")
    public final void method170(byte arg0) {
        this.field293 = class254.method1702(this.field305, 0);
        int var2 = -66 % ((78 - arg0) / 42);
        ++field292;
        this.method174(-127);
        for (int var3 = this.field300 + -1; var3 >= 1; --var3) {
            short var4 = this.field311[var3];
            if (var4 > 8 || ~var4 > 7) {
                return;
            }
            --this.field300;
        }
    }

    @OriginalMember(owner = "client!na", name = "e", descriptor = "(II)[I")
    public final int[] method116(int arg0, int arg1) {
        ++field306;
        if (arg0 != 242152972) {
            this.method116(12, -84);
        }
        int[] var3 = super.field1705.method463(arg1, false);
        if (super.field1705.field1072) {
            this.method169(arg1, var3, arg0 + -242152972);
        }
        return var3;
    }

    @OriginalMember(owner = "client!na", name = "d", descriptor = "(B)V")
    public static void method171(byte arg0) {
        field312 = null;
        field303 = null;
        field309 = null;
        field295 = null;
        if (arg0 > -72) {
            field312 = null;
        }
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "()V")
    public class23() {
        super(0, true);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIII)V")
    public static final void method172(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field298;
        for (int var6 = arg3; var6 <= arg2 + arg3; ++var6) {
            for (int var11 = arg5; var11 <= arg5 - -arg1; ++var11) {
                if (~var11 <= -1 && ~var11 > -105 && ~var6 <= -1 && ~var6 > -105) {
                    class214.field3077[arg0][var11][var6] = 127;
                }
            }
        }
        for (int var7 = arg3; ~var7 > ~(arg2 + arg3); ++var7) {
            for (int var10 = arg5; ~var10 > ~(arg1 + arg5); ++var10) {
                if (var10 >= 0 && var10 < 104 && var7 >= 0 && ~var7 > -105) {
                    class107.field1556[arg0][var10][var7] = arg0 > 0 ? class107.field1556[arg0 + -1][var10][var7] : 0;
                }
            }
        }
        if (arg5 > 0 && arg5 < 104) {
            for (int var8 = arg3 - -1; arg2 + arg3 > var8; ++var8) {
                if (var8 >= 0 && ~var8 > -105) {
                    class107.field1556[arg0][arg5][var8] = class107.field1556[arg0][arg5 + -1][var8];
                }
            }
        }
        if (arg4 > ~arg3 && arg3 < 104) {
            for (int var9 = arg5 + 1; var9 < arg5 - -arg1; ++var9) {
                if (~var9 <= -1 && var9 < 104) {
                    class107.field1556[arg0][var9][arg3] = class107.field1556[arg0][var9][arg3 + -1];
                }
            }
        }
        if (~arg5 <= -1 && ~arg3 <= -1 && arg5 < 104 && arg3 < 104) {
            if (~arg0 == -1) {
                if (arg5 > 0 && ~class107.field1556[arg0][arg5 + -1][arg3] != -1) {
                    class107.field1556[arg0][arg5][arg3] = class107.field1556[arg0][arg5 + -1][arg3];
                    return;
                }
                if (~arg3 < -1 && ~class107.field1556[arg0][arg5][arg3 + -1] != -1) {
                    class107.field1556[arg0][arg5][arg3] = class107.field1556[arg0][arg5][arg3 + -1];
                    return;
                }
                if (~arg5 < -1 && arg3 > 0 && ~class107.field1556[arg0][arg5 + -1][arg3 + -1] != -1) {
                    class107.field1556[arg0][arg5][arg3] = class107.field1556[arg0][arg5 + -1][arg3 - 1];
                    return;
                }
            } else {
                if (arg5 > 0 && ~class107.field1556[arg0 + -1][arg5 + -1][arg3] != ~class107.field1556[arg0][arg5 + -1][arg3]) {
                    class107.field1556[arg0][arg5][arg3] = class107.field1556[arg0][arg5 + -1][arg3];
                    return;
                }
                if (~arg3 >= -1 || ~class107.field1556[arg0 - 1][arg5][arg3 - 1] == ~class107.field1556[arg0][arg5][arg3 - 1]) {
                    if (arg5 > 0 && arg3 > 0 && ~class107.field1556[arg0][arg5 + -1][arg3 + -1] != ~class107.field1556[arg0 - 1][arg5 + -1][arg3 + -1]) {
                        class107.field1556[arg0][arg5][arg3] = class107.field1556[arg0][arg5 + -1][arg3 + -1];
                        return;
                    }
                    return;
                }
                class107.field1556[arg0][arg5][arg3] = class107.field1556[arg0][arg5][arg3 - 1];
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method173(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!na", name = "e", descriptor = "(I)V")
    private final void method174(int arg0) {
        if (arg0 >= -121) {
            this.method170((byte) 87);
        }
        if (~this.field313 < -1) {
            this.field311 = new short[this.field300];
            this.field310 = new short[this.field300];
            for (int var2 = 0; var2 < this.field300; ++var2) {
                this.field311[var2] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field313 / 4096.0F), (double) var2)));
                this.field310[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        } else if (this.field311 != null && this.field311.length == this.field300) {
            this.field310 = new short[this.field300];
            for (int var3 = 0; ~var3 > ~this.field300; ++var3) {
                this.field310[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        ++field299;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIBIIII)I")
    private final int method175(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field302;
        int var8 = arg0 + -4096;
        if (arg2 != -81) {
            method173(-24, 39, 93, 76, 97, 33, 99, -107);
        }
        int var9 = arg5 >> 12;
        int var10 = var9 + 1;
        int var11 = arg5 & 4095;
        if (var10 >= arg3) {
            var10 = 0;
        }
        int var12 = var11 + -4096;
        int var13 = var10 & 255;
        int var14 = var9 & 255;
        int var15 = this.field293[arg1 + var14] & 3;
        int var16 = class270.field4234[var11];
        int var17;
        if (~var15 >= -2) {
            var17 = var15 != 0 ? -var11 + arg0 : arg0 + var11;
        } else {
            var17 = var15 == 2 ? var11 - arg0 : -arg0 + -var11;
        }
        int var18 = 3 & this.field293[arg1 + var13];
        int var19;
        if (~var18 >= -2) {
            var19 = ~var18 == -1 ? arg0 + var12 : -var12 + arg0;
        } else {
            var19 = ~var18 == -3 ? -arg0 + var12 : -arg0 + -var12;
        }
        int var20 = 3 & this.field293[arg6 + var14];
        int var21 = var17 - -((-var17 + var19) * var16 >> 12);
        int var22;
        if (~var20 >= -2) {
            var22 = var20 != 0 ? -var11 + var8 : var8 + var11;
        } else {
            var22 = var20 == 2 ? -var8 + var11 : -var8 + -var11;
        }
        int var23 = 3 & this.field293[arg6 + var13];
        int var24;
        if (var23 > 1) {
            var24 = var23 == 2 ? var12 - var8 : -var8 + -var12;
        } else {
            var24 = ~var23 == -1 ? var8 + var12 : -var12 + var8;
        }
        int var25 = ((var24 - var22) * var16 >> 12) + var22;
        return var21 - -((-var21 + var25) * arg4 >> 12);
    }
}
