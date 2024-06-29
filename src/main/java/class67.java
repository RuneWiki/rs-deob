import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class67 extends class105 {

    @OriginalMember(owner = "client!ij", name = "O", descriptor = "[I")
    public static int[] field1276 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!ij", name = "T", descriptor = "Lvf;")
    public static class265 field1281 = class87.method582(-46, "Connexion perdue)3");

    @OriginalMember(owner = "client!ij", name = "N", descriptor = "Lch;")
    public static class117 field1275 = new class117();

    @OriginalMember(owner = "client!ij", name = "M", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!ij", name = "P", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!ij", name = "Q", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!ij", name = "R", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!ij", name = "S", descriptor = "I")
    public static int field1280;

    @OriginalMember(owner = "client!ij", name = "U", descriptor = "I")
    public static int field1282;

    @OriginalMember(owner = "client!ij", name = "V", descriptor = "I")
    public static int field1283;

    @OriginalMember(owner = "client!ij", name = "W", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!ij", name = "X", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!ij", name = "Y", descriptor = "I")
    public static int field1286;

    @OriginalMember(owner = "client!ij", name = "Z", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "(I)V")
    public static void method477(int arg0) {
        field1275 = null;
        if (arg0 > -66) {
            field1275 = null;
        }
        field1281 = null;
        field1276 = null;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "([IJBI)Lvf;")
    public static final class265 method478(int[] arg0, long arg1, byte arg2, int arg3) {
        ++field1285;
        if (class210.field3782 != null) {
            class265 var5 = class210.field3782.method1058(arg0, arg1, 10, arg3);
            if (var5 != null) {
                return var5;
            }
        }
        if (~arg3 == -6) {
            return class103.method691(arg1, 22723).method1765(true);
        } else {
            if (arg2 > -33) {
                method477(42);
            }
            return class120.method807(-778089108, arg1);
        }
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(B)V")
    public static final void method479(byte arg0) {
        class150.field2775.method1888((byte) 113);
        class160.field2927.method1888((byte) 123);
        class211.field3787.method1888((byte) 112);
        ++field1287;
        int var1 = 47 / ((arg0 - -70) / 36);
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(IBI)V")
    public static final void method480(int arg0, byte arg1, int arg2) {
        if (arg1 != -19) {
            method477(7);
        }
        class178 var3 = class188.method1282(arg0, 7, 261360480);
        ++field1284;
        var3.method1162(true);
        var3.field3172 = arg2;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IILng;)V")
    public final void method12(int arg0, int arg1, class135 arg2) {
        ++field1280;
        if (arg1 != 255) {
            method482((byte) -7, 109, -10, 5, -51, (class257) null, 75);
        }
        if (~arg0 == -1) {
            super.field1853 = ~arg2.method920((byte) 30) == -2;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)[I")
    public final int[] method16(int arg0, int arg1) {
        ++field1278;
        if (arg0 != 8055) {
            return null;
        } else {
            int[] var3 = super.field1862.method458(arg1, false);
            if (super.field1862.field1236) {
                int[] var4 = this.method705(arg1, (byte) -101, 0);
                for (int var5 = 0; class94.field1668 > var5; ++var5) {
                    var3[var5] = 4096 - var4[var5];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IB)[[I")
    public final int[][] method18(int arg0, byte arg1) {
        ++field1279;
        int[][] var3 = super.field1870.method569((byte) 55, arg0);
        if (arg1 >= -110) {
            method478((int[]) null, -32L, (byte) 29, -93);
        }
        if (super.field1870.field1567) {
            int[][] var4 = this.method702((byte) 94, arg0, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class94.field1668 < ~var11; ++var11) {
                var8[var11] = -var5[var11] + 4096;
                var9[var11] = -var7[var11] + 4096;
                var10[var11] = -var6[var11] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "(I)V")
    public static final void method481(int arg0) {
        ++field1283;
        if (class145.field2718) {
            if (arg0 != 19380) {
                method483(20, 28, -128, -127);
            }
            class144.field2686 = null;
            class139.field2534 = null;
            class145.field2718 = false;
        }
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "()V")
    public class67() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(BIIIILjg;I)V")
    public static final void method482(byte arg0, int arg1, int arg2, int arg3, int arg4, class257 arg5, int arg6) {
        ++field1274;
        boolean var7 = true;
        long var8 = 0L;
        boolean var10 = false;
        if (~arg6 == -1) {
            var8 = class72.method510(arg1, arg2, arg3);
        } else if (arg6 == 1) {
            var8 = class71.method503(arg1, arg2, arg3);
        } else if (~arg6 != -3) {
            if (arg6 == 3) {
                var8 = class23.method221(arg1, arg2, arg3);
            }
        } else {
            var8 = class179.method1166(arg1, arg2, arg3);
        }
        boolean var11 = false;
        int var12 = (513726 & (int) var8) >> 14;
        if (arg0 >= -100) {
            method479((byte) 125);
        }
        int var13 = (int) (var8 >>> 32) & Integer.MAX_VALUE;
        int var14 = 3 & (int) var8 >> 20;
        class130 var15 = class84.method574(114, var13);
        if (var15.method858(-1426259990)) {
            class130.method864(var15, arg1, arg3, true, arg2);
        }
        if (~var8 != -1L) {
            if (arg6 != 0) {
                if (arg6 != 1) {
                    if (~arg6 == -3) {
                        class2.method15(arg1, arg2, arg3);
                        if (~var15.field2334 != -1 && var15.field2309 + arg2 < 104 && ~(var15.field2309 + arg3) > -105 && ~(arg2 - -var15.field2328) > -105 && var15.field2328 + arg3 < 104) {
                            arg5.method1692(true, var15.field2326, arg3, var15.field2328, arg2, var14, var15.field2309);
                            return;
                        }
                        return;
                    }
                    if (arg6 == 3) {
                        class238.method1585(arg1, arg2, arg3);
                        if (~var15.field2334 == -2) {
                            arg5.method1693(arg2, arg3, -262145);
                            return;
                        }
                    }
                } else {
                    class54.method419(arg1, arg2, arg3);
                }
                return;
            }
            class210.method1440(arg1, arg2, arg3);
            if (var15.field2334 != 0) {
                arg5.method1686(var12, var14, -4, arg3, arg2, var15.field2326);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIII)I")
    public static final int method483(int arg0, int arg1, int arg2, int arg3) {
        ++field1282;
        if (class279.field4936 == null) {
            return 0;
        } else {
            int var4 = arg2 >> 7;
            if (arg1 > -115) {
                field1275 = null;
            }
            int var5 = arg0 >> 7;
            if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
                int var6 = arg3;
                if (~arg3 > -4 && (2 & class230.field4064[1][var4][var5]) == 2) {
                    var6 = arg3 + 1;
                }
                int var7 = 127 & arg2;
                int var8 = 127 & arg0;
                int var9 = (-var7 + 128) * class279.field4936[var6][var4][var5] + class279.field4936[var6][var4 + 1][var5] * var7 >> 7;
                int var10 = (-var7 + 128) * class279.field4936[var6][var4][var5 + 1] - -(class279.field4936[var6][var4 + 1][var5 + 1] * var7) >> 7;
                return (128 - var8) * var9 + var8 * var10 >> 7;
            } else {
                return 0;
            }
        }
    }
}
