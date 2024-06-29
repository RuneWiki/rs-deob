import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class393 {

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
    public static int field5136;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "I")
    public static int field5137;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "I")
    public static int field5138;

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "I")
    public static int field5141;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "I")
    public static int field5142;

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "I")
    public static int field5143;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "Lff;")
    public class393 field5139;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "Lff;")
    public class393 field5140;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lqa;BIZLc;IIIIIIILhi;II)Lc;")
    public static final class507 method2335(class129 arg0, byte arg1, int arg2, boolean arg3, class507 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class44 arg12, int arg13, int arg14) {
        field5143++;
        if (arg4 == null) {
            return null;
        }
        int var15 = 2055;
        if (arg12 != null) {
            int var16 = var15 | arg12.method281(arg11, false, -1, true);
            var15 = var16 & 0xFFFFFDFF;
        }
        long var17 = (long) ((arg6 << 24) + (arg2 + (arg5 << 16))) - (-((long) arg10 << 32) - ((long) arg9 << 48));
        class11 var19 = class65.field826;
        class507 var20;
        synchronized (class65.field826) {
            var20 = (class507) class65.field826.method78(var17, (byte) -98);
        }
        if (var20 == null || arg0.method880(var20.method475(), var15) != 0) {
            if (var20 != null) {
                var15 = arg0.method885(var15, var20.method475());
            }
            byte var21;
            if (arg2 == 1) {
                var21 = 9;
            } else if (arg2 == 2) {
                var21 = 12;
            } else if (arg2 == 3) {
                var21 = 15;
            } else if (arg2 == 4) {
                var21 = 18;
            } else {
                var21 = 21;
            }
            byte var22 = 3;
            int[] var23 = new int[] { 64, 96, 128 };
            class420 var24 = new class420(var21 * var22 + 1, var21 * var22 * 2 + -var21, 0);
            int var25 = var24.method2477((byte) -68, 0, 0, 0);
            int[][] var26 = new int[var22][var21];
            for (int var27 = 0; var27 < var22; var27++) {
                int var28 = var23[var27];
                int var29 = var23[var27];
                for (int var30 = 0; var30 < var21; var30++) {
                    int var31 = (var30 << 14) / var21;
                    int var32 = class21.field385[var31] * var28 >> 15;
                    int var33 = class21.field397[var31] * var29 >> 15;
                    var26[var27][var30] = var24.method2477((byte) -63, var33, var32, 0);
                }
            }
            for (int var34 = 0; var34 < var22; var34++) {
                int var35 = (var34 * 256 + 128) / var22;
                int var36 = 256 - var35;
                byte var37 = (byte) (arg5 * var36 + arg6 * var35 >> 8);
                short var38 = (short) (((arg9 & 0x7F) * var35 + (arg10 & 0x7F) * var36 & 0x7F00) + ((arg9 & 0xFC00) * var35 + (arg10 & 0xFC00) * var36 & 0xFC0000) + ((arg9 & 0x380) * var35 + (arg10 & 0x380) * var36 & 0x38000) >> 8);
                for (int var39 = 0; var39 < var21; var39++) {
                    if (var34 == 0) {
                        var24.method2475((byte) -1, var38, (byte) 1, var26[0][(var39 + 1) % var21], var25, (short) -1, -31562, var37, var26[0][var39]);
                    } else {
                        var24.method2475((byte) -1, var38, (byte) 1, var26[var34 - 1][(var39 + 1) % var21], var26[var34 - 1][var39], (short) -1, -31562, var37, var26[var34][(var39 + 1) % var21]);
                        var24.method2475((byte) -1, var38, (byte) 1, var26[var34][(var39 + 1) % var21], var26[var34 - 1][var39], (short) -1, arg1 - 31524, var37, var26[var34][var39]);
                    }
                }
            }
            var20 = arg0.method888(var24, var15, class335.field4295, 64, 768);
            class11 var40 = class65.field826;
            synchronized (class65.field826) {
                class65.field826.method88(var17, 127, var20);
            }
        }
        if (arg1 != -38) {
            return null;
        }
        int var41 = (arg2 << 6) - 1;
        int var42 = -var41;
        int var43 = -var41;
        int var44 = var41;
        int var45 = var41;
        if (arg3) {
            if (arg13 > 13312 || arg13 < 3072) {
                var43 -= 128;
            }
            if (arg13 > 9216 && arg13 < 15360) {
                var44 = var41 + 128;
            }
            if (arg13 > 1024 && arg13 < 7168) {
                var42 -= 128;
            }
            if (arg13 > 5120 && arg13 < 11264) {
                var45 = var41 + 128;
            }
        }
        int var46 = arg4.method491();
        int var47 = arg4.method490();
        int var48 = arg4.method515();
        if (var47 > var44) {
            var47 = var44;
        }
        int var49 = arg4.method531();
        if (var48 < var43) {
            var48 = var43;
        }
        if (var46 < var42) {
            var46 = var42;
        }
        if (var45 < var49) {
            var49 = var45;
        }
        class424 var50 = null;
        if (arg12 != null) {
            int var51 = arg12.field640[arg11];
            var50 = class403.field5429.method1954(var51 >> 16, -123);
            arg11 = var51 & 0xFFFF;
        }
        class507 var52;
        if (var50 == null) {
            var52 = var20.method510((byte) 3, var15, true);
            var52.method482(var47 - var46 >> 1, 128, var49 - var48 >> 1);
            var52.method537(var46 + var47 >> 1, 0, var48 + var49 >> 1);
        } else {
            var52 = var20.method510((byte) 3, var15, true);
            var52.method482(var47 - var46 >> 1, 128, var49 - var48 >> 1);
            var52.method537(var46 + var47 >> 1, 0, var48 + var49 >> 1);
            var52.method3013(arg11, (byte) 63, var50);
        }
        if (arg14 != 0) {
            var52.method535(arg14);
        }
        if (arg7 != 0) {
            var52.method506(arg7);
        }
        if (arg8 != 0) {
            var52.method537(0, arg8, 0);
        }
        return var52;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)V")
    public final void method2336(byte arg0) {
        if (arg0 < 86) {
            return;
        }
        field5138++;
        if (this.field5139 != null) {
            this.field5139.field5140 = this.field5140;
            this.field5140.field5139 = this.field5139;
            this.field5139 = null;
            this.field5140 = null;
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(B)V")
    public static final void method2337(byte arg0) {
        class377.field4896 = class109.field1514.method608((byte) -112);
        field5136++;
        boolean var1 = class109.field1514.method561(1110991096) == 1;
        int var2 = class109.field1514.method608((byte) 100);
        int var3 = class109.field1514.method605(31981);
        int var4 = class109.field1514.method568((byte) 110);
        class117.method755(var2, -23294);
        class109.field1514.method99(8);
        if (arg0 < 46) {
            return;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var20 = 0; var20 < (class200.field2594 >> 3); var20++) {
                for (int var21 = 0; var21 < (class118.field1647 >> 3); var21++) {
                    int var22 = class109.field1514.method100((byte) 19, 1);
                    if (var22 == 1) {
                        class46.field674[var5][var20][var21] = class109.field1514.method100((byte) -119, 26);
                    } else {
                        class46.field674[var5][var20][var21] = -1;
                    }
                }
            }
        }
        class109.field1514.method102(98);
        int var6 = (class37.field574 - class109.field1514.field1176) / 16;
        class223.field2871 = new int[var6][4];
        for (int var7 = 0; var7 < var6; var7++) {
            for (int var19 = 0; var19 < 4; var19++) {
                class223.field2871[var7][var19] = class109.field1514.method578(108);
            }
        }
        class235.field3062 = new int[var6];
        class511.field7530 = new byte[var6][];
        class43.field625 = new int[var6];
        class104.field1432 = null;
        class368.field4740 = new int[var6];
        class13.field236 = null;
        class523.field7763 = new byte[var6][];
        class391.field5132 = new int[var6];
        class121.field1696 = new byte[var6][];
        class163.field2114 = new byte[var6][];
        class194.field2507 = new int[var6];
        int var8 = 0;
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < (class200.field2594 >> 3); var10++) {
                for (int var11 = 0; var11 < (class118.field1647 >> 3); var11++) {
                    int var12 = class46.field674[var9][var10][var11];
                    if (var12 != -1) {
                        int var13 = (var12 & 0xFFFE7F) >> 14;
                        int var14 = var12 >> 3 & 0x7FF;
                        int var15 = (var13 / 8 << 8) + var14 / 8;
                        for (int var16 = 0; var16 < var8; var16++) {
                            if (class194.field2507[var16] == var15) {
                                var15 = -1;
                                break;
                            }
                        }
                        if (var15 != -1) {
                            class194.field2507[var8] = var15;
                            int var17 = var15 >> 8 & 0xFF;
                            int var18 = var15 & 0xFF;
                            class43.field625[var8] = class354.field4551.method1297("m" + var17 + "_" + var18, -5105);
                            class391.field5132[var8] = class354.field4551.method1297("l" + var17 + "_" + var18, -5105);
                            class368.field4740[var8] = class354.field4551.method1297("um" + var17 + "_" + var18, -5105);
                            class235.field3062[var8] = class354.field4551.method1297("ul" + var17 + "_" + var18, -5105);
                            var8++;
                        }
                    }
                }
            }
        }
        class414.method2437(var1, (byte) -65, var3, false, var4);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
    public static final void method2338(int arg0) {
        if (class127.field1746 != -1) {
            class487.method2907(class127.field1746, false, (byte) -126, -1, -1);
            class127.field1746 = -1;
        }
        if (arg0 != 16776831) {
            method2335(null, (byte) 55, -71, false, null, -66, -77, -40, -68, 29, 88, 38, null, -83, -78);
        }
        field5137++;
    }

    static {
        new class169("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
    }
}
