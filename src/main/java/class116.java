import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class116 extends class157 {

    @OriginalMember(owner = "client!cj", name = "Q", descriptor = "I")
    private int field2326;

    @OriginalMember(owner = "client!cj", name = "X", descriptor = "Lcc;")
    public static class209 field2333 = class95.method669(84, "Chargement de l(W-Bcran)2titre )2 ");

    @OriginalMember(owner = "client!cj", name = "Z", descriptor = "I")
    public static int field2335 = 0;

    @OriginalMember(owner = "client!cj", name = "Y", descriptor = "Lcc;")
    public static class209 field2334 = class95.method669(123, "blinken2:");

    @OriginalMember(owner = "client!cj", name = "O", descriptor = "F")
    public static float field2324;

    @OriginalMember(owner = "client!cj", name = "N", descriptor = "I")
    public static int field2323;

    @OriginalMember(owner = "client!cj", name = "P", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!cj", name = "R", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!cj", name = "S", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!cj", name = "T", descriptor = "I")
    public static int field2329;

    @OriginalMember(owner = "client!cj", name = "U", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!cj", name = "V", descriptor = "I")
    public static int field2331;

    @OriginalMember(owner = "client!cj", name = "W", descriptor = "I")
    public static int field2332;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIII)V")
    public static final void method821(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2329;
        if (arg3 == 12) {
            if (arg4 >= class262.field4723 && class230.field4184 >= arg4) {
                int var5 = class257.method1787(class102.field1957, arg2, 28, class155.field2847);
                int var6 = class257.method1787(class102.field1957, arg0, 28, class155.field2847);
                class201.method1387(var6, -124, arg4, var5, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILcc;)I")
    public static final int method822(int arg0, class209 arg1) {
        ++field2330;
        if (class134.field2548 != null && arg1.method1486(5) != 0) {
            for (int var2 = arg0; var2 < class134.field2548.field3036; ++var2) {
                if (class134.field2548.field3032[var2].method1471(class8.field162, class251.field4515, false).method1453(arg1, (byte) -59)) {
                    return var2;
                }
            }
            return -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(BLsj;Lsj;)V")
    public static final void method823(byte arg0, class49 arg1, class49 arg2) {
        if (arg0 >= -23) {
            method827(52, (byte) -124, -44);
        }
        class14.field269 = arg1;
        ++field2325;
        class114.field2279 = arg2;
        class238.field4314 = class114.field2279.method360(3, 0);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(BI)[I")
    public final int[] method4(byte arg0, int arg1) {
        ++field2327;
        if (arg0 != -98) {
            field2335 = -71;
        }
        int[] var3 = super.field2879.method1269(arg1, arg0 + 17983);
        if (super.field2879.field3363) {
            class270.method1844(var3, 0, class226.field4124, this.field2326);
        }
        return var3;
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(I)V")
    private class116(int arg0) {
        super(0, true);
        this.field2326 = 4096;
        this.field2326 = arg0;
    }

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "(I)V")
    public static void method824(int arg0) {
        field2333 = null;
        field2334 = null;
        if (arg0 != -5866) {
            field2334 = null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZIZZIIII)Lal;")
    public static final class231 method825(boolean arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field2323;
        class82 var8 = class249.method1728(arg7, true);
        if (arg5 > 1 && var8.field1631 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; ++var10) {
                if (arg5 >= var8.field1641[var10] && ~var8.field1641[var10] != -1) {
                    var9 = var8.field1631[var10];
                }
            }
            if (~var9 != 0) {
                var8 = class249.method1728(var9, true);
            }
        }
        class55 var11 = var8.method589(false);
        if (var11 == null) {
            return null;
        } else {
            class269 var12 = null;
            if (~var8.field1625 == 0) {
                if (~var8.field1617 != 0) {
                    var12 = (class269) method825(false, arg1, true, false, arg4, arg5, 7194, var8.field1626);
                    if (var12 == null) {
                        return null;
                    }
                }
            } else {
                var12 = (class269) method825(false, 1, true, true, 0, 10, 7194, var8.field1619);
                if (var12 == null) {
                    return null;
                }
            }
            int[] var13 = class4.field60;
            int var14 = class4.field53;
            int var15 = class4.field58;
            int[] var16 = new int[4];
            class4.method36(var16);
            class269 var17 = new class269(36, 32);
            class4.method28(var17.field4801, 36, 32);
            class15.method129();
            class15.method117(16, 16);
            class15.field286 = false;
            int var18 = var8.field1640;
            if (arg6 != 7194) {
                return null;
            } else {
                if (arg3) {
                    var18 = (int) ((double) var18 * 1.5D);
                } else if (arg1 == 2) {
                    var18 = (int) ((double) var18 * 1.04D);
                }
                int var19 = class15.field280[var8.field1630] * var18 >> 16;
                int var20 = class15.field278[var8.field1630] * var18 >> 16;
                var11.method423(0, var8.field1618, var8.field1590, var8.field1630, var8.field1616, -(var11.method216() / 2) + var20 - -var8.field1596, var19 - -var8.field1596, -1L);
                if (arg1 >= 1) {
                    var17.method1829(1);
                    if (arg1 >= 2) {
                        var17.method1829(16777215);
                    }
                    class4.method28(var17.field4801, 36, 32);
                }
                if (~arg4 != -1) {
                    var17.method1827(arg4);
                }
                if (var8.field1625 != -1) {
                    var12.method232(0, 0);
                } else if (~var8.field1617 != 0) {
                    class4.method28(var12.field4801, 36, 32);
                    var17.method232(0, 0);
                    var17 = var12;
                }
                if (arg0 && (var8.field1583 == 1 || ~arg5 != -2) && ~arg5 != 0) {
                    class67.field1281.method1295(class67.method489(arg5, (byte) -59), 0, 9, 16776960, 1);
                }
                class4.method28(var13, var14, var15);
                class4.method22(var16);
                class15.method129();
                class15.field286 = true;
                return var17;
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "()V")
    public class116() {
        this(4096);
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(BI)V")
    public static final void method826(byte arg0, int arg1) {
        short var2 = 256;
        if (~var2 > ~arg1) {
            arg1 = var2;
        }
        ++field2331;
        if (arg1 > 10) {
            arg1 = 10;
        }
        class126.field2447 += arg1 * 128;
        if (~class126.field2447 < ~class276.field4873.length) {
            class126.field2447 -= class276.field4873.length;
            int var3 = (int) (12.0D * Math.random());
            class162.method1121(class21.field404[var3], 119);
        }
        int var4 = 0;
        int var5 = arg1 * 128;
        int var6 = (var2 - arg1) * 128;
        if (arg0 <= 56) {
            field2333 = null;
        }
        for (int var7 = 0; ~var6 < ~var7; ++var7) {
            int var26 = class43.field865[var4 + var5] + -(class276.field4873[class126.field2447 + var4 & class276.field4873.length + -1] * arg1 / 6);
            if (var26 < 0) {
                var26 = 0;
            }
            class43.field865[var4++] = var26;
        }
        for (int var8 = var2 - arg1; var2 > var8; ++var8) {
            int var23 = var8 * 128;
            for (int var24 = 0; var24 < 128; ++var24) {
                int var25 = (int) (100.0D * Math.random());
                if (var25 < 50 && ~var24 < -11 && ~var24 > -119) {
                    class43.field865[var24 - -var23] = 255;
                } else {
                    class43.field865[var23 + var24] = 0;
                }
            }
        }
        for (int var9 = 0; var9 < -arg1 + var2; ++var9) {
            class73.field1391[var9] = class73.field1391[arg1 + var9];
        }
        for (int var10 = var2 - arg1; ~var2 < ~var10; ++var10) {
            class73.field1391[var10] = (int) (Math.sin((double) class241.field4349 / 14.0D) * 16.0D + Math.sin((double) class241.field4349 / 15.0D) * 14.0D + Math.sin((double) class241.field4349 / 16.0D) * 12.0D);
            ++class241.field4349;
        }
        class211.field3841 += arg1;
        int var11 = ((1 & class163.field2968) + arg1) / 2;
        if (~var11 < -1) {
            for (int var12 = 0; ~class211.field3841 < ~var12; ++var12) {
                int var21 = 2 + (int) (Math.random() * 124.0D);
                int var22 = (int) (Math.random() * 128.0D) + 128;
                class43.field865[(var22 << 7) + var21] = 192;
            }
            class211.field3841 = 0;
            for (int var13 = 0; var2 > var13; ++var13) {
                int var18 = 0;
                int var19 = var13 * 128;
                for (int var20 = -var11; var20 < 128; ++var20) {
                    if (var20 - -var11 < 128) {
                        var18 += class43.field865[var19 + var20 + var11];
                    }
                    if (-var11 + -1 + var20 >= 0) {
                        var18 -= class43.field865[var19 + var20 + -var11 + -1];
                    }
                    if (~var20 <= -1) {
                        class113.field2264[var19 + var20] = var18 / (var11 * 2 + 1);
                    }
                }
            }
            for (int var14 = 0; var14 < 128; ++var14) {
                int var15 = 0;
                for (int var16 = -var11; ~var2 < ~var16; ++var16) {
                    int var17 = var16 * 128;
                    if (~(var11 + var16) > ~var2) {
                        var15 += class113.field2264[var11 * 128 + var14 + var17];
                    }
                    if (var16 + -1 + -var11 >= 0) {
                        var15 -= class113.field2264[-((var11 - -1) * 128) + var17 + var14];
                    }
                    if (var16 >= 0) {
                        class43.field865[var14 + var17] = var15 / (var11 * 2 + 1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IBI)Lji;")
    public static final class42 method827(int arg0, byte arg1, int arg2) {
        ++field2332;
        class42 var3 = class247.method1719(arg2, -8667);
        if (~arg0 == 0) {
            return var3;
        } else if (var3 != null && var3.field762 != null && ~var3.field762.length < ~arg0) {
            return arg1 <= 23 ? null : var3.field762[arg0];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IBLtf;)V")
    public final void method1(int arg0, byte arg1, class106 arg2) {
        if (arg1 < -29) {
            ++field2328;
            if (arg0 == 0) {
                this.field2326 = (arg2.method774((byte) 113) << 12) / 255;
            }
        }
    }
}
