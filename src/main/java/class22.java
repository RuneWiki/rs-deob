import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class22 extends class272 {

    @OriginalMember(owner = "client!pc", name = "V", descriptor = "Z")
    public static boolean field262 = false;

    @OriginalMember(owner = "client!pc", name = "bb", descriptor = "[J")
    public static long[] field268 = new long[32];

    @OriginalMember(owner = "client!pc", name = "cb", descriptor = "[I")
    public static int[] field269 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!pc", name = "db", descriptor = "[Ljava/lang/String;")
    public static String[] field270 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!pc", name = "U", descriptor = "B")
    public byte field261;

    @OriginalMember(owner = "client!pc", name = "Q", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!pc", name = "R", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!pc", name = "S", descriptor = "I")
    public static int field259;

    @OriginalMember(owner = "client!pc", name = "T", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!pc", name = "W", descriptor = "I")
    public static int field263;

    @OriginalMember(owner = "client!pc", name = "Y", descriptor = "I")
    public int field265;

    @OriginalMember(owner = "client!pc", name = "ab", descriptor = "I")
    public static int field267;

    @OriginalMember(owner = "client!pc", name = "eb", descriptor = "I")
    public static int field271;

    @OriginalMember(owner = "client!pc", name = "X", descriptor = "Lfl;")
    public class248 field264;

    @OriginalMember(owner = "client!pc", name = "Z", descriptor = "Lng;")
    public static class78 field266;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lfl;I)V")
    public static final void method140(class248 arg0, int arg1) {
        ++field257;
        while (true) {
            while (~arg0.field3723.length < ~arg0.field3748) {
                int var2 = 0;
                boolean var3 = false;
                int var4 = 0;
                if (~arg0.method1593((byte) 27) == -2) {
                    var3 = true;
                    var2 = arg0.method1593((byte) 27);
                    var4 = arg0.method1593((byte) 27);
                }
                int var5 = arg0.method1593((byte) 27);
                int var6 = arg0.method1593((byte) 27);
                int var7 = -(var6 * 64) + class79.field1274 + class99.field1564 + -1;
                int var8 = var5 * 64 - class119.field1798;
                if (var8 >= 0 && var7 - 63 >= 0 && ~(var8 + 63) > ~class106.field1616 && var7 < class99.field1564) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; ~var11 > -65; ++var11) {
                        for (int var12 = 0; ~var12 > -65; ++var12) {
                            if (!var3 || var11 >= var2 * 8 && ~(var2 * 8 + 8) < ~var11 && var12 >= var4 * 8 && ~var12 > ~(var4 * 8 - -8)) {
                                int var13 = arg0.method1593((byte) 27);
                                if (var13 != 0) {
                                    if ((var13 & 1) == 1) {
                                        int var14 = arg0.method1593((byte) 27);
                                        if (class171.field2593[var9][var10] == null) {
                                            class171.field2593[var9][var10] = new byte[4096];
                                        }
                                        class171.field2593[var9][var10][(-var12 + 63 << 6) + var11] = (byte) var14;
                                    }
                                    if ((var13 & 2) == 2) {
                                        int var15 = arg0.method1587(-128);
                                        if (class76.field1223[var9][var10] == null) {
                                            class76.field1223[var9][var10] = new int[4096];
                                        }
                                        class76.field1223[var9][var10][(-var12 + 63 << 6) + var11] = var15;
                                    }
                                    if ((4 & var13) == 4) {
                                        int var16 = arg0.method1587(-121);
                                        if (class127.field1913[var9][var10] == null) {
                                            class127.field1913[var9][var10] = new int[4096];
                                        }
                                        --var16;
                                        class288 var17 = class274.method1816(110, var16);
                                        if (var17.field4336 != null) {
                                            var17 = var17.method1906((byte) -116);
                                            if (var17 == null || var17.field4358 == -1) {
                                                continue;
                                            }
                                        }
                                        class127.field1913[var9][var10][(-var12 + 63 << 6) + var11] = var17.field4323 + 1;
                                        class18 var18 = new class18();
                                        var18.field218 = var17.field4358;
                                        var18.field214 = var7;
                                        var18.field225 = var8;
                                        class226.field3394.method987(var18, (byte) -121);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    for (int var19 = 0; ~(var3 ? 64 : 4096) < ~var19; ++var19) {
                        int var20 = arg0.method1593((byte) 27);
                        if (var20 != 0) {
                            if (~(var20 & 1) == -2) {
                                ++arg0.field3748;
                            }
                            if ((var20 & 2) == 2) {
                                arg0.field3748 += 2;
                            }
                            if (~(var20 & 4) == -5) {
                                arg0.field3748 += 3;
                            }
                        }
                    }
                }
            }
            if (arg1 != 0) {
                field268 = null;
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "(B)[B")
    public final byte[] method111(byte arg0) {
        ++field271;
        if (!super.field4091 && this.field264.field3723.length + -this.field261 <= this.field264.field3748) {
            if (arg0 <= 70) {
                this.method112(119);
            }
            return this.field264.field3723;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZIIIIIIIII)V")
    public static final void method141(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (!arg0) {
            if (~arg7 == ~arg8 && arg2 == arg4 && ~arg6 == ~arg9 && arg1 == arg3) {
                class146.method891(arg4, arg9, arg1, -1, arg5, arg8);
            } else {
                int var10 = arg8;
                int var11 = arg8 * 3;
                int var12 = arg7 * 3;
                int var13 = arg4 * 3;
                int var14 = arg2 * 3;
                int var15 = arg6 * 3;
                int var16 = arg4;
                int var17 = arg3 * 3;
                int var18 = arg9 + var12 + -var15 + -arg8;
                int var19 = var17 - var14 + -var14 + var13;
                int var20 = -var17 + arg1 + var14 + -arg4;
                int var21 = -var11 + var12;
                int var22 = -var12 + var15 + -var12 - -var11;
                int var23 = -var13 + var14;
                for (int var24 = 128; ~var24 >= -4097; var24 += 128) {
                    int var25 = var24 * var24 >> 12;
                    int var26 = var22 * var25;
                    int var27 = var24 * var25 >> 12;
                    int var28 = var18 * var27;
                    int var29 = var19 * var25;
                    int var30 = var20 * var27;
                    int var31 = var21 * var24;
                    int var32 = (var28 + var31 + var26 >> 12) + arg8;
                    int var33 = var23 * var24;
                    int var34 = (var29 + var30 - -var33 >> 12) + arg4;
                    class146.method891(var16, var32, var34, -1, arg5, var10);
                    var16 = var34;
                    var10 = var32;
                }
            }
            ++field259;
        }
    }

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "(B)V")
    public static void method142(byte arg0) {
        int var1 = -82 % ((25 - arg0) / 44);
        field268 = null;
        field269 = null;
        field270 = null;
        field266 = null;
    }

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "(I)I")
    public final int method112(int arg0) {
        ++field258;
        if (this.field264 == null) {
            return 0;
        } else {
            if (arg0 != -1) {
                field266 = null;
            }
            return this.field264.field3748 * 100 / (this.field264.field3723.length + -this.field261);
        }
    }
}
