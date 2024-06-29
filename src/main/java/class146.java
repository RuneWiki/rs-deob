import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class146 extends class147 {

    @OriginalMember(owner = "client!sr", name = "s", descriptor = "[S")
    public short[] field1761;

    @OriginalMember(owner = "client!sr", name = "q", descriptor = "[Ljk;")
    public class436[] field1759;

    @OriginalMember(owner = "client!sr", name = "t", descriptor = "[B")
    public byte[] field1762;

    @OriginalMember(owner = "client!sr", name = "z", descriptor = "[B")
    public byte[] field1768;

    @OriginalMember(owner = "client!sr", name = "C", descriptor = "[Ljf;")
    public class103[] field1771;

    @OriginalMember(owner = "client!sr", name = "D", descriptor = "[I")
    private int[] field1772;

    @OriginalMember(owner = "client!sr", name = "p", descriptor = "[B")
    public byte[] field1758;

    @OriginalMember(owner = "client!sr", name = "r", descriptor = "I")
    public int field1760;

    @OriginalMember(owner = "client!sr", name = "o", descriptor = "Lwb;")
    public static class45 field1757 = new class45(512);

    @OriginalMember(owner = "client!sr", name = "F", descriptor = "Lpn;")
    public static class72 field1774 = new class72(17, -1);

    @OriginalMember(owner = "client!sr", name = "u", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!sr", name = "v", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!sr", name = "w", descriptor = "I")
    public static int field1765;

    @OriginalMember(owner = "client!sr", name = "x", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!sr", name = "y", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!sr", name = "A", descriptor = "I")
    public static int field1769;

    @OriginalMember(owner = "client!sr", name = "B", descriptor = "I")
    public static int field1770;

    @OriginalMember(owner = "client!sr", name = "E", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "(I)V")
    public final void method692(int arg0) {
        field1769++;
        this.field1772 = null;
        if (arg0 != 1) {
            this.method696((int[]) null, -55, (class369) null, (byte[]) null);
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lgn;ZI)V")
    public static final void method693(class187 arg0, boolean arg1, int arg2) {
        field1764++;
        class349 var3 = arg0.method1018(-115);
        if (arg0.field2538 == 0) {
            class122.field1517 = 0;
            class451.field6375 = -1;
            arg0.field2530 = 0;
            return;
        }
        if (arg0.field2449 != arg2 && arg0.field2495 == 0) {
            class207 var4 = class175.field2103.method1267(-77, arg0.field2449);
            if (arg0.field2537 > 0 && var4.field2839 == 0) {
                arg0.field2530++;
                class122.field1517 = 0;
                class451.field6375 = -1;
                return;
            }
            if (arg0.field2537 <= 0 && var4.field2854 == 0) {
                class122.field1517 = 0;
                class451.field6375 = -1;
                arg0.field2530++;
                return;
            }
        }
        if (arg0.field2485 != -1 && class204.field2796 >= arg0.field2477) {
            class12 var5 = class234.field3258.method2456(arg0.field2485, arg2 + 601);
            if (var5.field164 && var5.field178 != -1) {
                class207 var6 = class175.field2103.method1267(-51, var5.field178);
                if (arg0.field2537 > 0 && var6.field2839 == 0) {
                    arg0.field2530++;
                    class451.field6375 = -1;
                    class122.field1517 = 0;
                    return;
                }
                if (arg0.field2537 <= 0 && var6.field2854 == 0) {
                    class122.field1517 = 0;
                    class451.field6375 = -1;
                    arg0.field2530++;
                    return;
                }
            }
        }
        int var7 = arg0.field1008;
        int var8 = arg0.field1005;
        int var9 = arg0.field2539[arg0.field2538 - 1] * 128 + arg0.method1012(false) * 64;
        int var10 = arg0.field2536[arg0.field2538 - 1] * 128 + arg0.method1012(false) * 64;
        if (var7 < var9) {
            if (var8 < var10) {
                arg0.method1013(10240, (byte) 102);
            } else if (var8 > var10) {
                arg0.method1013(14336, (byte) 102);
            } else {
                arg0.method1013(12288, (byte) 102);
            }
        } else if (var9 < var7) {
            if (var8 < var10) {
                arg0.method1013(6144, (byte) 102);
            } else if (var8 > var10) {
                arg0.method1013(2048, (byte) 102);
            } else {
                arg0.method1013(4096, (byte) 102);
            }
        } else if (var10 > var8) {
            arg0.method1013(8192, (byte) 102);
        } else if (var8 > var10) {
            arg0.method1013(0, (byte) 102);
        }
        byte var11 = arg0.field2531[arg0.field2538 - 1];
        if (!arg1 && (var9 - var7 > 256 || var9 - var7 < -256 || (var10 - var8) > 256 || var10 - var8 < -256)) {
            arg0.field1005 = var10;
            arg0.field1008 = var9;
            arg0.method1015((byte) -8, arg0.field2451);
            arg0.field2538--;
            if (arg0.field2537 > 0) {
                arg0.field2537--;
            }
            class122.field1517 = 0;
            class451.field6375 = -1;
            return;
        }
        int var12 = 4;
        boolean var13 = true;
        if (arg0 instanceof class137) {
            var13 = ((class137) arg0).field1643.field6728;
        }
        if (var13) {
            int var14 = arg0.field2451 - arg0.field2470.field2805;
            if (var14 != 0 && arg0.field2511 == -1 && arg0.field2519 != 0) {
                var12 = 2;
            }
            if (!arg1 && arg0.field2538 > 2) {
                var12 = 6;
            }
            if (!arg1 && arg0.field2538 > 3) {
                var12 = 8;
            }
        } else {
            if (!arg1 && arg0.field2538 > 1) {
                var12 = 6;
            }
            if (!arg1 && arg0.field2538 > 2) {
                var12 = 8;
            }
        }
        if (arg0.field2530 > 0 && arg0.field2538 > 1) {
            var12 = 8;
            arg0.field2530--;
        }
        if (var11 == 2) {
            var12 <<= 0x1;
        } else if (var11 == 0) {
            var12 >>= 0x1;
        }
        if (var3.field5014 != -1) {
            int var15 = var12 << 7;
            if (arg0.field2538 == 1) {
                int var16 = arg0.field2532 * arg0.field2532;
                int var17 = (var9 < arg0.field1008 ? arg0.field1008 - var9 : -arg0.field1008 + var9) << 7;
                int var18 = (arg0.field1005 <= var10 ? var10 - arg0.field1005 : -var10 + arg0.field1005) << 7;
                int var19 = var17 <= var18 ? var18 : var17;
                int var20 = var3.field5014 * 2 * var19;
                if (var16 > var20) {
                    arg0.field2532 /= 2;
                } else if (var16 / 2 > var19) {
                    arg0.field2532 -= var3.field5014;
                    if (arg0.field2532 < 0) {
                        arg0.field2532 = 0;
                    }
                } else if (arg0.field2532 < var15) {
                    arg0.field2532 += var3.field5014;
                    if (arg0.field2532 > var15) {
                        arg0.field2532 = var15;
                    }
                }
            } else if (var15 > arg0.field2532) {
                arg0.field2532 += var3.field5014;
                if (var15 < arg0.field2532) {
                    arg0.field2532 = var15;
                }
            } else if (arg0.field2532 > 0) {
                arg0.field2532 -= var3.field5014;
                if (arg0.field2532 < 0) {
                    arg0.field2532 = 0;
                }
            }
            var12 = arg0.field2532 >> 7;
            if (var12 < 1) {
                var12 = 1;
            }
        }
        class122.field1517 = 0;
        if (var9 > var7) {
            class122.field1517 |= 0x4;
            arg0.field1008 += var12;
            if (var9 < arg0.field1008) {
                arg0.field1008 = var9;
            }
        } else if (var9 < var7) {
            arg0.field1008 -= var12;
            class122.field1517 |= 0x8;
            if (arg0.field1008 < var9) {
                arg0.field1008 = var9;
            }
        }
        if (var10 > var8) {
            class122.field1517 |= 0x1;
            arg0.field1005 += var12;
            if (arg0.field1005 > var10) {
                arg0.field1005 = var10;
            }
        } else if (var10 < var8) {
            arg0.field1005 -= var12;
            class122.field1517 |= 0x2;
            if (arg0.field1005 < var10) {
                arg0.field1005 = var10;
            }
        }
        if (arg0.field1008 == var9 && arg0.field1005 == var10) {
            arg0.field2538--;
            if (arg0.field2537 > 0) {
                arg0.field2537--;
            }
        }
        if (var12 >= 8) {
            class451.field6375 = 2;
        } else {
            class451.field6375 = var11;
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIZIFIII)[I")
    public static final int[] method694(int arg0, int arg1, boolean arg2, int arg3, float arg4, int arg5, int arg6, int arg7) {
        field1767++;
        int[] var8 = new int[arg0];
        class20 var9 = new class20();
        var9.field281 = arg3;
        var9.field283 = arg6;
        var9.field267 = (int) (arg4 * 4096.0F);
        var9.field276 = arg5;
        var9.field273 = arg2;
        var9.field277 = arg7;
        int var10 = 104 % ((-arg1 - 10) / 40);
        var9.method15(-116);
        class485.method2863((byte) -126, arg0, 1);
        var9.method127(var8, 0, 73);
        return var8;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIB)Ldf;")
    public static final class89 method695(int arg0, int arg1, byte arg2) {
        if (arg2 >= -3) {
            method697(115);
        }
        field1773++;
        class89 var3 = (class89) class41.field502.method233(71, (long) arg0 << 32 | (long) arg1);
        if (var3 == null) {
            var3 = new class89(arg0, arg1);
            class41.field502.method234(-119, var3.field1776, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "([IILpq;[B)Z")
    public final boolean method696(int[] arg0, int arg1, class369 arg2, byte[] arg3) {
        field1763++;
        boolean var5 = true;
        int var6 = 0;
        class436 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg3 == null || arg3[var8] != 0) {
                int var9 = this.field1772[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg2.method2232(arg0, arg1 - 51124, var9 >> 2);
                        } else {
                            var7 = arg2.method2230(var9 >> 2, arg0, (byte) 57);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field1759[var8] = var7;
                        this.field1772[var8] = 0;
                    }
                }
            }
        }
        if (arg1 != 21327) {
            method697(51);
        }
        return var5;
    }

    @OriginalMember(owner = "client!sr", name = "<init>", descriptor = "()V")
    public class146() {
    }

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "(I)V")
    public static void method697(int arg0) {
        field1774 = null;
        field1757 = null;
        if (arg0 != 0) {
            method694(11, -4, true, 124, -1.6292585F, -128, -87, -61);
        }
    }

    @OriginalMember(owner = "client!sr", name = "<init>", descriptor = "([B)V")
    public class146(byte[] arg0) {
        this.field1761 = new short[128];
        this.field1759 = new class436[128];
        this.field1762 = new byte[128];
        this.field1768 = new byte[128];
        this.field1771 = new class103[128];
        this.field1772 = new int[128];
        this.field1758 = new byte[128];
        class179 var2 = new class179(arg0);
        int var3;
        for (var3 = 0; var2.field2159[var2.field2206 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method922(32429);
        }
        var2.field2206++;
        var3++;
        int var6 = var2.field2206;
        var2.field2206 += var3;
        int var7;
        for (var7 = 0; var2.field2159[var2.field2206 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method922(32429);
        }
        var2.field2206++;
        var7++;
        int var10 = var2.field2206;
        var2.field2206 += var7;
        int var11;
        for (var11 = 0; var2.field2159[var2.field2206 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method922(32429);
        }
        var11++;
        var2.field2206++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 <= 1) {
            var15 = var11;
        } else {
            var14[1] = 1;
            int var16 = 1;
            var15 = 2;
            for (int var17 = 2; var17 < var11; var17++) {
                int var105 = var2.method895((byte) -88);
                if (var105 == 0) {
                    var16 = var15++;
                } else {
                    if (var16 >= var105) {
                        var105--;
                    }
                    var16 = var105;
                }
                var14[var17] = (byte) var16;
            }
        }
        class103[] var18 = new class103[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class103 var102 = var18[var19] = new class103();
            int var103 = var2.method895((byte) -113);
            if (var103 > 0) {
                var102.field1241 = new byte[var103 * 2];
            }
            int var104 = var2.method895((byte) -89);
            if (var104 > 0) {
                var102.field1246 = new byte[var104 * 2 + 2];
                var102.field1246[1] = 64;
            }
        }
        int var20 = var2.method895((byte) -76);
        byte[] var21 = var20 <= 0 ? null : new byte[var20 * 2];
        int var22 = var2.method895((byte) -128);
        byte[] var23 = var22 > 0 ? new byte[var22 * 2] : null;
        int var24;
        for (var24 = 0; var2.field2159[var2.field2206 + var24] != 0; var24++) {
        }
        byte[] var25 = new byte[var24];
        for (int var26 = 0; var26 < var24; var26++) {
            var25[var26] = var2.method922(32429);
        }
        var24++;
        var2.field2206++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var2.method895((byte) -91);
            this.field1761[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var2.method895((byte) -94);
            this.field1761[var30] = (short) (this.field1761[var30] + (var29 << 8));
        }
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            if (var31 == 0) {
                if (var32 >= var25.length) {
                    var31 = -1;
                } else {
                    var31 = var25[var32++];
                }
                var33 = var2.method932(73);
            }
            this.field1761[var34] = (short) (this.field1761[var34] + (class444.method2618(2, var33 - 1) << 14));
            var31--;
            this.field1772[var34] = var33;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field1772[var38] != 0) {
                if (var35 == 0) {
                    var37 = var2.field2159[var6++] - 1;
                    if (var4.length > var36) {
                        var35 = var4[var36++];
                    } else {
                        var35 = -1;
                    }
                }
                var35--;
                this.field1768[var38] = (byte) var37;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field1772[var42] != 0) {
                if (var40 == 0) {
                    if (var8.length > var39) {
                        var40 = var8[var39++];
                    } else {
                        var40 = -1;
                    }
                    var41 = var2.field2159[var10++] + 16 << 2;
                }
                this.field1758[var42] = (byte) var41;
                var40--;
            }
        }
        int var43 = 0;
        int var44 = 0;
        class103 var45 = null;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field1772[var46] != 0) {
                if (var44 == 0) {
                    var45 = var18[var14[var43]];
                    if (var43 < var12.length) {
                        var44 = var12[var43++];
                    } else {
                        var44 = -1;
                    }
                }
                this.field1771[var46] = var45;
                var44--;
            }
        }
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (var48 == 0) {
                if (var47 < var25.length) {
                    var48 = var25[var47++];
                } else {
                    var48 = -1;
                }
                if (this.field1772[var50] > 0) {
                    var49 = var2.method895((byte) -127) + 1;
                }
            }
            this.field1762[var50] = (byte) var49;
            var48--;
        }
        this.field1760 = var2.method895((byte) -84) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class103 var99 = var18[var51];
            if (var99.field1241 != null) {
                for (int var100 = 1; var100 < var99.field1241.length; var100 += 2) {
                    var99.field1241[var100] = var2.method922(32429);
                }
            }
            if (var99.field1246 != null) {
                for (int var101 = 3; var101 < (var99.field1246.length - 2); var101 += 2) {
                    var99.field1246[var101] = var2.method922(32429);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var2.method922(32429);
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var2.method922(32429);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class103 var96 = var18[var54];
            if (var96.field1246 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field1246.length; var98 += 2) {
                    var97 = var2.method895((byte) -115) + var97 + 1;
                    var96.field1246[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class103 var93 = var18[var55];
            if (var93.field1241 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field1241.length; var95 += 2) {
                    var94 = (var94 + var2.method895((byte) -88)) + 1;
                    var93.field1241[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var2.method895((byte) -113);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 = var56 + var2.method895((byte) -121) + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[0];
            byte var59 = var21[1];
            for (int var60 = 0; var60 < var58; var60++) {
                this.field1762[var60] = (byte) (this.field1762[var60] * var59 + 32 >> 6);
            }
            int var61 = 2;
            while (var21.length > var61) {
                byte var64 = var21[var61];
                byte var65 = var21[var61 + 1];
                int var66 = (var64 - var58) / 2 + (var64 - var58) * var59;
                for (int var67 = var58; var67 < var64; var67++) {
                    int var68 = class93.method463(var64 - var58, var66, 1);
                    this.field1762[var67] = (byte) (this.field1762[var67] * var68 + 32 >> 6);
                    var66 += var65 - var59;
                }
                var59 = var65;
                var61 += 2;
                var58 = var64;
            }
            Object var62 = null;
            for (int var63 = var58; var63 < 128; var63++) {
                this.field1762[var63] = (byte) (this.field1762[var63] * var59 + 32 >> 6);
            }
        }
        if (var23 != null) {
            int var69 = var2.method895((byte) -93);
            var23[0] = (byte) var69;
            for (int var70 = 2; var70 < var23.length; var70 += 2) {
                var69 = var69 + var2.method895((byte) -106) + 1;
                var23[var70] = (byte) var69;
            }
            byte var71 = var23[0];
            int var72 = var23[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field1758[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field1758[var73] = (byte) var84;
            }
            for (int var74 = 2; var74 < var23.length; var74 += 2) {
                byte var78 = var23[var74];
                int var79 = var23[var74 + 1] << 1;
                int var80 = (var78 - var71) / 2 + (var78 - var71) * var72;
                for (int var81 = var71; var81 < var78; var81++) {
                    int var82 = class93.method463(var78 - var71, var80, 1);
                    int var83 = (this.field1758[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    this.field1758[var81] = (byte) var83;
                    var80 += var79 - var72;
                }
                var71 = var78;
                var72 = var79;
            }
            Object var75 = null;
            for (int var76 = var71; var76 < 128; var76++) {
                int var77 = (this.field1758[var76] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field1758[var76] = (byte) var77;
            }
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field1247 = var2.method895((byte) -126);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class103 var92 = var18[var86];
            if (var92.field1241 != null) {
                var92.field1249 = var2.method895((byte) -80);
            }
            if (var92.field1246 != null) {
                var92.field1250 = var2.method895((byte) -120);
            }
            if (var92.field1247 > 0) {
                var92.field1243 = var2.method895((byte) -95);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field1248 = var2.method895((byte) -100);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class103 var91 = var18[var88];
            if (var91.field1248 > 0) {
                var91.field1252 = var2.method895((byte) -92);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class103 var90 = var18[var89];
            if (var90.field1252 > 0) {
                var90.field1242 = var2.method895((byte) -83);
            }
        }
    }
}
