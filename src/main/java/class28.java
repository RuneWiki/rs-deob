import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class28 {

    @OriginalMember(owner = "client!ap", name = "g", descriptor = "Z")
    public static boolean field478 = false;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!ap", name = "e", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!ap", name = "f", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "client!ap", name = "d", descriptor = "Ltq;")
    public static class67 field475;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIIBIILbm;IIII)Z", line = 5)
    public static final boolean method187(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, class215 arg6, int arg7, int arg8, int arg9, int arg10) {
        field476++;
        int var11 = arg2;
        int var12 = arg7;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg2 - var13;
        int var16 = arg7 - var14;
        class374.field4867[var13][var14] = 99;
        class258.field3262[var13][var14] = 0;
        byte var17 = 0;
        class460.field6423[var17] = arg2;
        int var18 = 0;
        if (arg3 != -67) {
            field478 = false;
        }
        byte var10001 = var17;
        int var26 = var17 + 1;
        class394.field5145[var10001] = arg7;
        int[][] var19 = arg6.field2742;
        while (var26 != var18) {
            var11 = class460.field6423[var18];
            var12 = class394.field5145[var18];
            int var20 = var11 - var15;
            var18 = var18 + 1 & 0xFFF;
            int var21 = var12 - var16;
            int var22 = var11 - arg6.field2751;
            int var23 = var12 - arg6.field2754;
            if (arg1 == -4) {
                if (arg5 == var11 && arg9 == var12) {
                    class482.field7025 = var11;
                    class328.field4213 = var12;
                    return true;
                }
            } else if (arg1 == -3) {
                if (class127.method806(arg5, (byte) 81, arg9, arg8, arg0, 2, var11, 2, var12)) {
                    class482.field7025 = var11;
                    class328.field4213 = var12;
                    return true;
                }
            } else if (arg1 == -2) {
                if (arg6.method1366(0, arg5, var11, arg4, 2, 2, arg8, arg9, var12, arg0)) {
                    class328.field4213 = var12;
                    class482.field7025 = var11;
                    return true;
                }
            } else if (arg1 == -1) {
                if (arg6.method1372(arg9, arg4, var11, var12, arg5, arg8, true, 2, arg0)) {
                    class328.field4213 = var12;
                    class482.field7025 = var11;
                    return true;
                }
            } else if (arg1 == 0 || arg1 == 1 || arg1 == 2 || arg1 == 3 || arg1 == 9) {
                if (arg6.method1380(arg1, arg5, arg10, var12, arg3 ^ 0xFFFFE90F, 2, var11, arg9)) {
                    class328.field4213 = var12;
                    class482.field7025 = var11;
                    return true;
                }
            } else if (arg6.method1368(2, -30, arg9, arg10, var12, arg5, var11, arg1)) {
                class482.field7025 = var11;
                class328.field4213 = var12;
                return true;
            }
            int var25 = class258.field3262[var20][var21] + 1;
            if (var20 > 0 && class374.field4867[var20 - 1][var21] == 0 && (var19[var22 - 1][var23] & 0x43A40000) == 0 && (var19[var22 - 1][var23 + 1] & 0x4E240000) == 0) {
                class460.field6423[var26] = var11 - 1;
                class394.field5145[var26] = var12;
                class374.field4867[var20 - 1][var21] = 2;
                var26 = var26 + 1 & 0xFFF;
                class258.field3262[var20 - 1][var21] = var25;
            }
            if (var20 < 126 && class374.field4867[var20 + 1][var21] == 0 && (var19[var22 + 2][var23] & 0x60E40000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78240000) == 0) {
                class460.field6423[var26] = var11 + 1;
                class394.field5145[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class374.field4867[var20 + 1][var21] = 8;
                class258.field3262[var20 + 1][var21] = var25;
            }
            if (var21 > 0 && class374.field4867[var20][var21 - 1] == 0 && (var19[var22][var23 - 1] & 0x43A40000) == 0 && (var19[var22 + 1][var23 - 1] & 0x60E40000) == 0) {
                class460.field6423[var26] = var11;
                class394.field5145[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class374.field4867[var20][var21 - 1] = 1;
                class258.field3262[var20][var21 - 1] = var25;
            }
            if (var21 < 126 && class374.field4867[var20][var21 + 1] == 0 && (var19[var22][var23 + 2] & 0x4E240000) == 0 && (var19[var22 + 1][var23 + 2] & 0x78240000) == 0) {
                class460.field6423[var26] = var11;
                class394.field5145[var26] = var12 + 1;
                class374.field4867[var20][var21 + 1] = 4;
                var26 = var26 + 1 & 0xFFF;
                class258.field3262[var20][var21 + 1] = var25;
            }
            if (var20 > 0 && var21 > 0 && class374.field4867[var20 - 1][var21 - 1] == 0 && (var19[var22 - 1][var23] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var22][var23 - 1] & 0x63E40000) == 0) {
                class460.field6423[var26] = var11 - 1;
                class394.field5145[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class374.field4867[var20 - 1][var21 - 1] = 3;
                class258.field3262[var20 - 1][var21 - 1] = var25;
            }
            if (var20 < 126 && var21 > 0 && class374.field4867[var20 + 1][var21 - 1] == 0 && (var19[var22 + 1][var23 - 1] & 0x63E40000) == 0 && (var19[var22 + 2][var23 - 1] & 0x60E40000) == 0 && (var19[var22 + 2][var23] & 0x78E40000) == 0) {
                class460.field6423[var26] = var11 + 1;
                class394.field5145[var26] = var12 - 1;
                class374.field4867[var20 + 1][var21 - 1] = 9;
                var26 = var26 + 1 & 0xFFF;
                class258.field3262[var20 + 1][var21 - 1] = var25;
            }
            if (var20 > 0 && var21 < 126 && class374.field4867[var20 - 1][var21 + 1] == 0 && (var19[var22 - 1][var23 + 1] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 + 2] & 0x4E240000) == 0 && (var19[var22][var23 + 2] & 0x7E240000) == 0) {
                class460.field6423[var26] = var11 - 1;
                class394.field5145[var26] = var12 + 1;
                class374.field4867[var20 - 1][var21 + 1] = 6;
                var26 = var26 + 1 & 0xFFF;
                class258.field3262[var20 - 1][var21 + 1] = var25;
            }
            if (var20 < 126 && var21 < 126 && class374.field4867[var20 + 1][var21 + 1] == 0 && (var19[var22 + 1][var23 + 2] & 0x7E240000) == 0 && (var19[var22 + 2][var23 + 2] & 0x78240000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78E40000) == 0) {
                class460.field6423[var26] = var11 + 1;
                class394.field5145[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class374.field4867[var20 + 1][var21 + 1] = 12;
                class258.field3262[var20 + 1][var21 + 1] = var25;
            }
        }
        class482.field7025 = var11;
        class328.field4213 = var12;
        return false;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(ZIIII)I", line = 355)
    public static final int method188(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!arg0) {
            return -94;
        }
        field472++;
        int var5 = arg2 & 0xF;
        int var6 = var5 < 8 ? arg1 : arg4;
        int var7 = var5 < 4 ? arg4 : (var5 == 12 || var5 == 14 ? arg1 : arg3);
        return ((var5 & 0x1) == 0 ? var6 : -var6) + ((var5 & 0x2) == 0 ? var7 : -var7);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(B)V", line = 373)
    public static final void method189(byte arg0) {
        field477++;
        class228 var1 = (class228) class61.field792.method49(-120);
        boolean var2 = class465.field6838 != null || class142.field1882 > 0;
        int var3 = -115 / ((arg0 - 3) / 39);
        if (var2) {
            class139.field1855 = 1;
        }
        if (class354.field4549 && class439.field6113.method1488((byte) 93, 81) && class271.field3433 > 2) {
            if (var2) {
                class289.field3699 = (class502) class103.field1421.field64.field7455.field7455;
            } else {
                class182.method1204(0, (class502) class103.field1421.field64.field7455.field7455, var1.method1444(-116), var1.method1442((byte) 71));
            }
        } else if (var2) {
            class289.field3699 = (class502) class103.field1421.field64.field7455;
        } else {
            class182.method1204(0, (class502) class103.field1421.field64.field7455, var1.method1444(-124), var1.method1442((byte) 71));
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Z)V", line = 415)
    public static void method190(boolean arg0) {
        if (arg0) {
            method188(false, 80, -43, -118, 92);
        }
        field475 = null;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(ZZ[B)Ljava/lang/Object;", line = 434)
    public static final Object method191(boolean arg0, boolean arg1, byte[] arg2) {
        if (arg0) {
            method192(88);
        }
        field473++;
        if (arg2 == null) {
            return null;
        }
        if (arg2.length > 136 && !class47.field679) {
            try {
                class238 var3 = (class238) Class.forName("t").getDeclaredConstructor().newInstance();
                var3.method1508(arg2, (byte) -93);
                return var3;
            } catch (Throwable var4) {
                class47.field679 = true;
            }
        }
        return arg1 ? class182.method1200(arg2, 17916) : arg2;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(I)V", line = 469)
    public static final void method192(int arg0) {
        field474++;
        class377.field4896 = 0;
        boolean var1 = class109.field1514.method561(1110991096) == 1;
        int var2 = class109.field1514.method568((byte) 110);
        int var3 = class109.field1514.method605(31981);
        int var4 = class109.field1514.method577(255);
        if (arg0 != -10902) {
            method188(true, -92, -114, -118, -66);
        }
        class117.method755(var4, -23294);
        int var5 = (class37.field574 - class109.field1514.field1176) / 16;
        class223.field2871 = new int[var5][4];
        for (int var6 = 0; var6 < var5; var6++) {
            for (int var10 = 0; var10 < 4; var10++) {
                class223.field2871[var6][var10] = class109.field1514.method578(111);
            }
        }
        class43.field625 = new int[var5];
        class368.field4740 = new int[var5];
        class511.field7530 = new byte[var5][];
        class235.field3062 = new int[var5];
        class121.field1696 = new byte[var5][];
        class163.field2114 = new byte[var5][];
        class104.field1432 = null;
        class391.field5132 = new int[var5];
        class194.field2507 = new int[var5];
        class523.field7763 = new byte[var5][];
        class13.field236 = null;
        int var7 = 0;
        for (int var8 = (var3 - (class200.field2594 >> 4)) / 8; var8 <= (((class200.field2594 >> 4) + var3) / 8); var8++) {
            for (int var9 = (var2 - (class118.field1647 >> 4)) / 8; var9 <= (((class118.field1647 >> 4) + var2) / 8); var9++) {
                class194.field2507[var7] = (var8 << 8) + var9;
                class43.field625[var7] = class354.field4551.method1297("m" + var8 + "_" + var9, -5105);
                class391.field5132[var7] = class354.field4551.method1297("l" + var8 + "_" + var9, -5105);
                class368.field4740[var7] = class354.field4551.method1297("um" + var8 + "_" + var9, -5105);
                class235.field3062[var7] = class354.field4551.method1297("ul" + var8 + "_" + var9, -5105);
                var7++;
            }
        }
        class414.method2437(var1, (byte) 82, var3, false, var2);
    }
}
