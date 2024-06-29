import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class88 extends class147 {

    @OriginalMember(owner = "client!jk", name = "H", descriptor = "[S")
    public short[] field1455;

    @OriginalMember(owner = "client!jk", name = "C", descriptor = "[B")
    public byte[] field1450;

    @OriginalMember(owner = "client!jk", name = "D", descriptor = "[Lkj;")
    public class176[] field1451;

    @OriginalMember(owner = "client!jk", name = "r", descriptor = "[B")
    public byte[] field1439;

    @OriginalMember(owner = "client!jk", name = "I", descriptor = "[Lwh;")
    public class10[] field1456;

    @OriginalMember(owner = "client!jk", name = "s", descriptor = "[I")
    private int[] field1440;

    @OriginalMember(owner = "client!jk", name = "w", descriptor = "[B")
    public byte[] field1444;

    @OriginalMember(owner = "client!jk", name = "u", descriptor = "I")
    public int field1442;

    @OriginalMember(owner = "client!jk", name = "p", descriptor = "I")
    public static int field1437 = -1;

    @OriginalMember(owner = "client!jk", name = "y", descriptor = "Z")
    public static boolean field1446 = false;

    @OriginalMember(owner = "client!jk", name = "F", descriptor = "Lna;")
    public static class26 field1453 = class69.method505("::tween", (byte) -126);

    @OriginalMember(owner = "client!jk", name = "G", descriptor = "Z")
    public static boolean field1454 = false;

    @OriginalMember(owner = "client!jk", name = "z", descriptor = "Ln;")
    public static class282 field1447 = new class282(50);

    @OriginalMember(owner = "client!jk", name = "q", descriptor = "I")
    public static int field1438;

    @OriginalMember(owner = "client!jk", name = "t", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!jk", name = "v", descriptor = "I")
    public static int field1443;

    @OriginalMember(owner = "client!jk", name = "x", descriptor = "I")
    public static int field1445;

    @OriginalMember(owner = "client!jk", name = "A", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!jk", name = "E", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!jk", name = "J", descriptor = "I")
    public static int field1457;

    @OriginalMember(owner = "client!jk", name = "B", descriptor = "Lma;")
    public static class285 field1449;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "(B)V", line = 5)
    public final void method688(byte arg0) {
        int var2 = 127 % ((-arg0 - 70) / 42);
        field1441++;
        this.field1440 = null;
    }

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "(B)V", line = 18)
    public static final void method689(byte arg0) {
        int var1 = -125 / ((-arg0) / 59);
        class307.field5281.method1987(3);
        field1443++;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(ILna;)Lbn;", line = 31)
    public static final class66 method690(int arg0, class26 arg1) {
        field1452++;
        if (arg0 != 2) {
            method691(false);
        }
        for (class66 var2 = (class66) class287.field4796.method264(-19); var2 != null; var2 = (class66) class287.field4796.method263(4)) {
            if (var2.field1047.method159((byte) -42, arg1)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Z)V", line = 58)
    public static void method691(boolean arg0) {
        field1453 = null;
        if (arg0) {
            field1447 = null;
            field1449 = null;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I[ILle;[B)Z", line = 80)
    public final boolean method692(int arg0, int[] arg1, class243 arg2, byte[] arg3) {
        if (arg0 != 17904) {
            return false;
        }
        int var5 = 0;
        class176 var6 = null;
        field1448++;
        boolean var7 = true;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg3 == null || arg3[var8] != 0) {
                int var9 = this.field1440[var8];
                if (var9 != 0) {
                    if (var5 != var9) {
                        var5 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var6 = arg2.method1679(var9 >> 2, 33, arg1);
                        } else {
                            var6 = arg2.method1682(10089, var9 >> 2, arg1);
                        }
                        if (var6 == null) {
                            var7 = false;
                        }
                    }
                    if (var6 != null) {
                        this.field1451[var8] = var6;
                        this.field1440[var8] = 0;
                    }
                }
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IZ[BII[Lmj;)V", line = 183)
    public static final void method693(int arg0, boolean arg1, byte[] arg2, int arg3, int arg4, class228[] arg5) {
        field1438++;
        class82 var6 = new class82(arg2);
        int var7 = -1;
        while (true) {
            int var8 = var6.method612((byte) -126);
            if (var8 == 0) {
                if (arg4 != 0) {
                    method691(true);
                }
                return;
            }
            var7 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var6.method617(true);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 & 0x3F;
                int var12 = var9 >> 12;
                int var13 = var9 >> 6 & 0x3F;
                int var14 = var6.method642((byte) -48);
                int var15 = var14 >> 2;
                int var16 = var14 & 0x3;
                int var17 = arg0 + var13;
                int var18 = arg3 + var11;
                if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
                    class228 var19 = null;
                    if (!arg1) {
                        int var20 = var12;
                        if ((class92.field1492[1][var17][var18] & 0x2) == 2) {
                            var20 = var12 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg5[var20];
                        }
                    }
                    class100.method739(var12, !arg1, var12, arg1, var19, var7, var15, var17, (byte) 50, var18, var16);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "()V", line = 256)
    public class88() {
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "([B)V", line = 258)
    public class88(byte[] arg0) {
        this.field1455 = new short[128];
        this.field1450 = new byte[128];
        this.field1451 = new class176[128];
        this.field1439 = new byte[128];
        this.field1456 = new class10[128];
        this.field1440 = new int[128];
        int var2 = 0;
        this.field1444 = new byte[128];
        class82 var3 = new class82(arg0);
        while (var3.field1280[var3.field1301 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method599(false);
        }
        var3.field1301++;
        var2++;
        int var6 = var3.field1301;
        var3.field1301 += var2;
        int var7;
        for (var7 = 0; var3.field1280[var3.field1301 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method599(false);
        }
        var3.field1301++;
        var7++;
        int var10 = 0;
        int var11 = var3.field1301;
        var3.field1301 += var7;
        while (var3.field1280[var3.field1301 + var10] != 0) {
            var10++;
        }
        byte[] var12 = new byte[var10];
        for (int var13 = 0; var13 < var10; var13++) {
            var12[var13] = var3.method599(false);
        }
        var3.field1301++;
        var10++;
        byte[] var14 = new byte[var10];
        int var15;
        if (var10 <= 1) {
            var15 = var10;
        } else {
            var15 = 2;
            var14[1] = 1;
            int var16 = 1;
            for (int var17 = 2; var17 < var10; var17++) {
                int var18 = var3.method642((byte) -87);
                if (var18 == 0) {
                    var16 = var15++;
                } else {
                    if (var18 <= var16) {
                        var18--;
                    }
                    var16 = var18;
                }
                var14[var17] = (byte) var16;
            }
        }
        class10[] var19 = new class10[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class10 var21 = var19[var20] = new class10();
            int var22 = var3.method642((byte) -121);
            if (var22 > 0) {
                var21.field123 = new byte[var22 * 2];
            }
            int var23 = var3.method642((byte) -47);
            if (var23 > 0) {
                var21.field137 = new byte[var23 * 2 + 2];
                var21.field137[1] = 64;
            }
        }
        int var24 = var3.method642((byte) -81);
        byte[] var25 = var24 > 0 ? new byte[var24 * 2] : null;
        int var26 = var3.method642((byte) -84);
        byte[] var27 = var26 > 0 ? new byte[var26 * 2] : null;
        int var28;
        for (var28 = 0; var3.field1280[var3.field1301 + var28] != 0; var28++) {
        }
        byte[] var29 = new byte[var28];
        for (int var30 = 0; var30 < var28; var30++) {
            var29[var30] = var3.method599(false);
        }
        var3.field1301++;
        var28++;
        int var31 = 0;
        for (int var32 = 0; var32 < 128; var32++) {
            var31 += var3.method642((byte) -101);
            this.field1455[var32] = (short) var31;
        }
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            var33 += var3.method642((byte) -115);
            this.field1455[var34] = (short) (this.field1455[var34] + (var33 << 8));
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (var35 == 0) {
                if (var29.length > var36) {
                    var35 = var29[var36++];
                } else {
                    var35 = -1;
                }
                var37 = var3.method580((byte) 122);
            }
            this.field1455[var38] = (short) (this.field1455[var38] + class4.method23(32768, var37 - 1 << 14));
            this.field1440[var38] = var37;
            var35--;
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field1440[var42] != 0) {
                if (var39 == 0) {
                    var40 = var3.field1280[var6++] - 1;
                    if (var4.length > var41) {
                        var39 = var4[var41++];
                    } else {
                        var39 = -1;
                    }
                }
                var39--;
                this.field1444[var42] = (byte) var40;
            }
        }
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field1440[var46] != 0) {
                if (var43 == 0) {
                    var45 = var3.field1280[var11++] + 16 << 2;
                    if (var44 < var8.length) {
                        var43 = var8[var44++];
                    } else {
                        var43 = -1;
                    }
                }
                var43--;
                this.field1439[var46] = (byte) var45;
            }
        }
        int var47 = 0;
        int var48 = 0;
        class10 var49 = null;
        for (int var50 = 0; var50 < 128; var50++) {
            if (this.field1440[var50] != 0) {
                if (var48 == 0) {
                    var49 = var19[var14[var47]];
                    if (var47 >= var12.length) {
                        var48 = -1;
                    } else {
                        var48 = var12[var47++];
                    }
                }
                this.field1456[var50] = var49;
                var48--;
            }
        }
        int var51 = 0;
        int var52 = 0;
        int var53 = 0;
        for (int var54 = 0; var54 < 128; var54++) {
            if (var51 == 0) {
                if (var52 < var29.length) {
                    var51 = var29[var52++];
                } else {
                    var51 = -1;
                }
                if (this.field1440[var54] > 0) {
                    var53 = var3.method642((byte) -61) + 1;
                }
            }
            var51--;
            this.field1450[var54] = (byte) var53;
        }
        this.field1442 = var3.method642((byte) -26) + 1;
        for (int var55 = 0; var55 < var15; var55++) {
            class10 var56 = var19[var55];
            if (var56.field123 != null) {
                for (int var57 = 1; var57 < var56.field123.length; var57 += 2) {
                    var56.field123[var57] = var3.method599(false);
                }
            }
            if (var56.field137 != null) {
                for (int var58 = 3; var58 < var56.field137.length - 2; var58 += 2) {
                    var56.field137[var58] = var3.method599(false);
                }
            }
        }
        if (var25 != null) {
            for (int var59 = 1; var59 < var25.length; var59 += 2) {
                var25[var59] = var3.method599(false);
            }
        }
        if (var27 != null) {
            for (int var60 = 1; var60 < var27.length; var60 += 2) {
                var27[var60] = var3.method599(false);
            }
        }
        for (int var61 = 0; var61 < var15; var61++) {
            class10 var62 = var19[var61];
            if (var62.field137 != null) {
                int var63 = 0;
                for (int var64 = 2; var64 < var62.field137.length; var64 += 2) {
                    var63 -= -var3.method642((byte) -114) - 1;
                    var62.field137[var64] = (byte) var63;
                }
            }
        }
        for (int var65 = 0; var65 < var15; var65++) {
            class10 var66 = var19[var65];
            if (var66.field123 != null) {
                int var67 = 0;
                for (int var68 = 2; var68 < var66.field123.length; var68 += 2) {
                    var67 = var67 + var3.method642((byte) -29) + 1;
                    var66.field123[var68] = (byte) var67;
                }
            }
        }
        if (var25 != null) {
            int var69 = var3.method642((byte) -32);
            var25[0] = (byte) var69;
            for (int var70 = 2; var70 < var25.length; var70 += 2) {
                var69 = (var69 + var3.method642((byte) -29)) + 1;
                var25[var70] = (byte) var69;
            }
            byte var71 = var25[0];
            byte var72 = var25[1];
            for (int var73 = 0; var73 < var71; var73++) {
                this.field1450[var73] = (byte) (this.field1450[var73] * var72 + 32 >> 6);
            }
            int var74 = 2;
            while (var74 < var25.length) {
                byte var75 = var25[var74];
                byte var76 = var25[var74 + 1];
                var74 += 2;
                int var77 = (var75 - var71) / 2 + (var75 - var71) * var72;
                for (int var78 = var71; var78 < var75; var78++) {
                    int var79 = class110.method777(var77, -125, var75 - var71);
                    var77 += var76 - var72;
                    this.field1450[var78] = (byte) (this.field1450[var78] * var79 + 32 >> 6);
                }
                var72 = var76;
                var71 = var75;
            }
            Object var80 = null;
            for (int var81 = var71; var81 < 128; var81++) {
                this.field1450[var81] = (byte) (this.field1450[var81] * var72 + 32 >> 6);
            }
        }
        if (var27 != null) {
            int var82 = var3.method642((byte) -118);
            var27[0] = (byte) var82;
            for (int var83 = 2; var83 < var27.length; var83 += 2) {
                var82 = (var82 + var3.method642((byte) -75)) + 1;
                var27[var83] = (byte) var82;
            }
            byte var84 = var27[0];
            int var85 = var27[1] << 1;
            for (int var86 = 0; var86 < var84; var86++) {
                int var87 = (this.field1439[var86] & 0xFF) + var85;
                if (var87 < 0) {
                    var87 = 0;
                }
                if (var87 > 128) {
                    var87 = 128;
                }
                this.field1439[var86] = (byte) var87;
            }
            int var88 = 2;
            while (var88 < var27.length) {
                byte var89 = var27[var88];
                int var90 = (var89 - var84) * var85 + ((var89 - var84) / 2);
                int var91 = var27[var88 + 1] << 1;
                var88 += 2;
                for (int var92 = var84; var92 < var89; var92++) {
                    int var93 = class110.method777(var90, -116, var89 - var84);
                    var90 += var91 - var85;
                    int var94 = (this.field1439[var92] & 0xFF) + var93;
                    if (var94 < 0) {
                        var94 = 0;
                    }
                    if (var94 > 128) {
                        var94 = 128;
                    }
                    this.field1439[var92] = (byte) var94;
                }
                var84 = var89;
                var85 = var91;
            }
            for (int var95 = var84; var95 < 128; var95++) {
                int var96 = (this.field1439[var95] & 0xFF) + var85;
                if (var96 < 0) {
                    var96 = 0;
                }
                if (var96 > 128) {
                    var96 = 128;
                }
                this.field1439[var95] = (byte) var96;
            }
            Object var97 = null;
        }
        for (int var98 = 0; var98 < var15; var98++) {
            var19[var98].field139 = var3.method642((byte) -60);
        }
        for (int var99 = 0; var99 < var15; var99++) {
            class10 var100 = var19[var99];
            if (var100.field123 != null) {
                var100.field127 = var3.method642((byte) -23);
            }
            if (var100.field137 != null) {
                var100.field132 = var3.method642((byte) -104);
            }
            if (var100.field139 > 0) {
                var100.field122 = var3.method642((byte) -124);
            }
        }
        for (int var101 = 0; var101 < var15; var101++) {
            var19[var101].field138 = var3.method642((byte) -102);
        }
        for (int var102 = 0; var102 < var15; var102++) {
            class10 var103 = var19[var102];
            if (var103.field138 > 0) {
                var103.field126 = var3.method642((byte) -80);
            }
        }
        for (int var104 = 0; var104 < var15; var104++) {
            class10 var105 = var19[var104];
            if (var105.field126 > 0) {
                var105.field129 = var3.method642((byte) -84);
            }
        }
    }
}
