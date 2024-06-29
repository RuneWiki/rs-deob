import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class33 extends class185 {

    @OriginalMember(owner = "client!ie", name = "T", descriptor = "I")
    private int field482 = 4096;

    @OriginalMember(owner = "client!ie", name = "Q", descriptor = "[I")
    private int[] field479 = new int[3];

    @OriginalMember(owner = "client!ie", name = "S", descriptor = "I")
    private int field481 = 409;

    @OriginalMember(owner = "client!ie", name = "J", descriptor = "I")
    private int field472 = 4096;

    @OriginalMember(owner = "client!ie", name = "X", descriptor = "I")
    private int field486 = 4096;

    @OriginalMember(owner = "client!ie", name = "R", descriptor = "I")
    public static int field480 = 0;

    @OriginalMember(owner = "client!ie", name = "U", descriptor = "Ljava/lang/String;")
    public static String field483 = " more options";

    @OriginalMember(owner = "client!ie", name = "K", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!ie", name = "L", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!ie", name = "M", descriptor = "I")
    public static int field475;

    @OriginalMember(owner = "client!ie", name = "N", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!ie", name = "O", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "client!ie", name = "P", descriptor = "I")
    public static int field478;

    @OriginalMember(owner = "client!ie", name = "V", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!ie", name = "W", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!ie", name = "Z", descriptor = "I")
    public static int field488;

    @OriginalMember(owner = "client!ie", name = "Y", descriptor = "[[[Lnd;")
    public static class270[][][] field487;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILfl;I)V")
    public final void method27(int arg0, class248 arg1, int arg2) {
        ++field476;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (arg0 == 4) {
                            int var5 = arg1.method1587(arg2 + 6234);
                            this.field479[1] = class94.method598(var5, 65280) >> 4;
                            this.field479[2] = class94.method598(var5 >> 12, 0);
                            this.field479[0] = class94.method598(var5 << 4, 267386880);
                        }
                    } else {
                        this.field482 = arg1.method1575(false);
                    }
                } else {
                    this.field486 = arg1.method1575(false);
                }
            } else {
                this.field472 = arg1.method1575(false);
            }
        } else {
            this.field481 = arg1.method1575(false);
        }
        if (arg2 != -6357) {
            this.field486 = -10;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BLjava/lang/String;)I")
    public static final int method213(byte arg0, String arg1) {
        ++field484;
        for (int var2 = 0; class165.field2535.length > var2; ++var2) {
            if (class165.field2535[var2].equalsIgnoreCase(arg1)) {
                return var2;
            }
        }
        if (arg0 > -2) {
            field487 = null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "(I)Z")
    public static final boolean method214(int arg0) {
        ++field478;
        if (arg0 != 1) {
            method213((byte) -64, (String) null);
        }
        if (class142.field2080) {
            try {
                class73.method498(class209.field3147.field150, "showVideoAd", (byte) 125);
                return true;
            } catch (Throwable var1) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method39(boolean arg0, int arg1) {
        ++field485;
        if (!arg0) {
            return null;
        } else {
            int[][] var3 = super.field2802.method753(1, arg1);
            if (super.field2802.field1807) {
                int[][] var4 = this.method1152(false, 0, arg1);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~var11 > ~class174.field2648; ++var11) {
                    int var12 = var5[var11];
                    int var13 = var12 - this.field479[0];
                    if (~var13 > -1) {
                        var13 = -var13;
                    }
                    if (~var13 < ~this.field481) {
                        var8[var11] = var12;
                        var9[var11] = var6[var11];
                        var10[var11] = var7[var11];
                    } else {
                        int var14 = var6[var11];
                        int var15 = var14 - this.field479[1];
                        if (var15 < 0) {
                            var15 = -var15;
                        }
                        if (this.field481 < var15) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var7[var11];
                        } else {
                            int var16 = var7[var11];
                            int var17 = -this.field479[2] + var16;
                            if (var17 < 0) {
                                var17 = -var17;
                            }
                            if (~this.field481 > ~var17) {
                                var8[var11] = var12;
                                var9[var11] = var14;
                                var10[var11] = var16;
                            } else {
                                var8[var11] = this.field482 * var12 >> 12;
                                var9[var11] = this.field486 * var14 >> 12;
                                var10[var11] = this.field472 * var16 >> 12;
                            }
                        }
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "()V")
    public class33() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(III)Z")
    public static final boolean method215(int arg0, int arg1, int arg2) {
        ++field475;
        if (!class218.field3275) {
            return false;
        } else {
            int var3 = arg2 >> 16;
            if (arg0 != 1) {
                return true;
            } else {
                int var4 = arg2 & 65535;
                if (class234.field3532[var3] != null && class234.field3532[var3][var4] != null) {
                    class289 var5 = class234.field3532[var3][var4];
                    if (~arg1 == 0 && ~var5.field4394 == -1) {
                        for (int var6 = 0; ~class218.field3278 < ~var6; ++var6) {
                            if (class84.field1339[var6] == 43 || ~class84.field1339[var6] == -1007 || class84.field1339[var6] == 41 || class84.field1339[var6] == 13 || class84.field1339[var6] == 37) {
                                for (class289 var7 = class89.method574((byte) -15, class58.field916[var6]); var7 != null; var7 = class144.method878(var7, -57)) {
                                    if (var5.field4504 == var7.field4504) {
                                        return true;
                                    }
                                }
                            }
                        }
                    } else {
                        for (int var8 = 0; ~var8 > ~class218.field3278; ++var8) {
                            if (~class71.field1135[var8] == ~arg1 && ~class58.field916[var8] == ~var5.field4504 && (class84.field1339[var8] == 43 || class84.field1339[var8] == 1006 || ~class84.field1339[var8] == -42 || class84.field1339[var8] == 13 || class84.field1339[var8] == 37)) {
                                return true;
                            }
                        }
                    }
                    return false;
                } else {
                    return false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(II)V")
    public static final void method216(int arg0, int arg1) {
        if (arg0 == 1) {
            class41.field608.method1780(arg1, true);
            ++field474;
        }
    }

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "(I)V")
    public static void method217(int arg0) {
        field483 = null;
        field487 = null;
        if (arg0 != 9231) {
            method214(86);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BIIIII)V")
    public static final void method218(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg5 - arg1;
        ++field488;
        int var7 = -arg3 + arg2;
        if (~var7 != -1) {
            if (~var6 == -1) {
                class265.method1766(arg3, arg1, arg2, -5085, arg4);
            } else {
                if (var7 < 0) {
                    var7 = -var7;
                }
                if (var6 < 0) {
                    var6 = -var6;
                }
                boolean var8 = var7 < var6;
                if (var8) {
                    int var9 = arg3;
                    arg3 = arg1;
                    int var10 = arg2;
                    arg1 = var9;
                    arg2 = arg5;
                    arg5 = var10;
                }
                if (~arg3 < ~arg2) {
                    int var11 = arg1;
                    int var12 = arg3;
                    arg3 = arg2;
                    arg1 = arg5;
                    arg5 = var11;
                    arg2 = var12;
                }
                int var13 = arg1;
                if (arg0 < 35) {
                    field487 = null;
                }
                int var14 = -arg3 + arg2;
                int var15 = -(var14 >> 1);
                int var16 = -arg1 + arg5;
                if (~var16 > -1) {
                    var16 = -var16;
                }
                int var17 = ~arg5 < ~arg1 ? 1 : -1;
                if (var8) {
                    for (int var18 = arg3; arg2 >= var18; ++var18) {
                        class23.field284[var18][var13] = arg4;
                        var15 += var16;
                        if (var15 > 0) {
                            var13 += var17;
                            var15 -= var14;
                        }
                    }
                } else {
                    for (int var19 = arg3; arg2 >= var19; ++var19) {
                        var15 += var16;
                        class23.field284[var13][var19] = arg4;
                        if (var15 > 0) {
                            var13 += var17;
                            var15 -= var14;
                        }
                    }
                }
            }
        } else {
            if (~var6 != -1) {
                class276.method1832(arg1, arg3, -32768, arg5, arg4);
            }
        }
    }
}
