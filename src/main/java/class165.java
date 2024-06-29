import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class165 extends class187 {

    @OriginalMember(owner = "client!la", name = "v", descriptor = "[B")
    public byte[] field2539;

    @OriginalMember(owner = "client!la", name = "z", descriptor = "[Lb;")
    public class73[] field2543;

    @OriginalMember(owner = "client!la", name = "y", descriptor = "[B")
    public byte[] field2542;

    @OriginalMember(owner = "client!la", name = "w", descriptor = "[I")
    private int[] field2540;

    @OriginalMember(owner = "client!la", name = "D", descriptor = "[B")
    public byte[] field2547;

    @OriginalMember(owner = "client!la", name = "C", descriptor = "[S")
    public short[] field2546;

    @OriginalMember(owner = "client!la", name = "n", descriptor = "[Ltf;")
    public class109[] field2531;

    @OriginalMember(owner = "client!la", name = "x", descriptor = "I")
    public int field2541;

    @OriginalMember(owner = "client!la", name = "r", descriptor = "Z")
    public static boolean field2535 = false;

    @OriginalMember(owner = "client!la", name = "q", descriptor = "I")
    public static int field2534 = 0;

    @OriginalMember(owner = "client!la", name = "B", descriptor = "I")
    public static int field2545 = -1;

    @OriginalMember(owner = "client!la", name = "o", descriptor = "I")
    public static int field2532;

    @OriginalMember(owner = "client!la", name = "p", descriptor = "I")
    public static int field2533;

    @OriginalMember(owner = "client!la", name = "s", descriptor = "I")
    public static int field2536;

    @OriginalMember(owner = "client!la", name = "t", descriptor = "I")
    public static int field2537;

    @OriginalMember(owner = "client!la", name = "u", descriptor = "I")
    public static int field2538;

    @OriginalMember(owner = "client!la", name = "A", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!la", name = "E", descriptor = "[[[I")
    public static int[][][] field2548;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(I)Ljava/lang/String;", line = 5)
    public static final String method1124(int arg0) {
        field2532++;
        String var1;
        if (class81.field1199 == 1 && class168.field2565 < 2) {
            var1 = class82.field1217 + class299.field4641 + class86.field1299 + " ->";
        } else if (class120.field1841 && class168.field2565 < 2) {
            var1 = class227.field3638 + class299.field4641 + class302.field4663 + " ->";
        } else if (class86.field1301 && class294.field4534[81] && class168.field2565 > 2) {
            var1 = class234.method1597(0, class168.field2565 - 2);
        } else {
            var1 = class234.method1597(0, class168.field2565 - 1);
        }
        if (class168.field2565 > 2) {
            var1 = var1 + "<col=ffffff> / " + (class168.field2565 - 2) + class15.field157;
        }
        if (arg0 != 0) {
            method1129(-65, -119);
        }
        return var1;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V", line = 48)
    public static final void method1125(byte arg0) {
        field2537++;
        if (arg0 < -60) {
            class220.field3493.method1298((byte) 110);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "([I[BLw;I)Z", line = 61)
    public final boolean method1126(int[] arg0, byte[] arg1, class210 arg2, int arg3) {
        field2544++;
        int var5 = arg3;
        boolean var6 = true;
        class73 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg1 == null || arg1[var8] != 0) {
                int var9 = this.field2540[var8];
                if (var9 != 0) {
                    if (var5 != var9) {
                        var5 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg2.method1404(var9 >> 2, (byte) 122, arg0);
                        } else {
                            var7 = arg2.method1409(var9 >> 2, true, arg0);
                        }
                        if (var7 == null) {
                            var6 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field2543[var8] = var7;
                        this.field2540[var8] = 0;
                    }
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "(I)V", line = 114)
    public static void method1127(int arg0) {
        field2548 = (int[][][]) null;
        int var1 = 17 / ((31 - arg0) / 32);
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(B)V", line = 125)
    public final void method1128(byte arg0) {
        field2533++;
        if (arg0 < 39) {
            field2548 = (int[][][]) ((int[][][]) null);
        }
        this.field2540 = null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II)I", line = 152)
    public static final int method1129(int arg0, int arg1) {
        if (arg0 != -19650) {
            method1127(73);
        }
        field2536++;
        class345 var2 = class205.method1378(arg1, -29934);
        int var3 = var2.field5356;
        int var4 = var2.field5348;
        int var5 = var2.field5355;
        int var6 = class219.field3483[var5 - var4];
        return class156.field2442[var3] >> var4 & var6;
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "()V", line = 170)
    public class165() {
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "([B)V", line = 173)
    public class165(byte[] arg0) {
        this.field2539 = new byte[128];
        this.field2543 = new class73[128];
        this.field2542 = new byte[128];
        this.field2540 = new int[128];
        this.field2547 = new byte[128];
        this.field2546 = new short[128];
        int var2 = 0;
        this.field2531 = new class109[128];
        class303 var3 = new class303(arg0);
        while (var3.field4716[var3.field4679 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method2001(-3);
        }
        var2++;
        var3.field4679++;
        int var6 = var3.field4679;
        var3.field4679 += var2;
        int var7;
        for (var7 = 0; var3.field4716[var3.field4679 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method2001(-3);
        }
        var7++;
        int var10 = 0;
        var3.field4679++;
        int var11 = var3.field4679;
        var3.field4679 += var7;
        while (var3.field4716[var3.field4679 + var10] != 0) {
            var10++;
        }
        byte[] var12 = new byte[var10];
        for (int var13 = 0; var13 < var10; var13++) {
            var12[var13] = var3.method2001(-3);
        }
        var10++;
        var3.field4679++;
        byte[] var14 = new byte[var10];
        int var15;
        if (var10 <= 1) {
            var15 = var10;
        } else {
            int var16 = 1;
            var14[1] = 1;
            var15 = 2;
            for (int var17 = 2; var17 < var10; var17++) {
                int var18 = var3.method2043((byte) -106);
                if (var18 == 0) {
                    var16 = var15++;
                } else {
                    if (var16 >= var18) {
                        var18--;
                    }
                    var16 = var18;
                }
                var14[var17] = (byte) var16;
            }
        }
        class109[] var19 = new class109[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class109 var21 = var19[var20] = new class109();
            int var22 = var3.method2043((byte) -119);
            if (var22 > 0) {
                var21.field1690 = new byte[var22 * 2];
            }
            int var23 = var3.method2043((byte) -104);
            if (var23 > 0) {
                var21.field1686 = new byte[var23 * 2 + 2];
                var21.field1686[1] = 64;
            }
        }
        int var24 = var3.method2043((byte) -119);
        byte[] var25 = var24 > 0 ? new byte[var24 * 2] : null;
        int var26 = var3.method2043((byte) -122);
        byte[] var27 = var26 <= 0 ? null : new byte[var26 * 2];
        int var28;
        for (var28 = 0; var3.field4716[var3.field4679 + var28] != 0; var28++) {
        }
        byte[] var29 = new byte[var28];
        for (int var30 = 0; var30 < var28; var30++) {
            var29[var30] = var3.method2001(-3);
        }
        var3.field4679++;
        var28++;
        int var31 = 0;
        for (int var32 = 0; var32 < 128; var32++) {
            var31 += var3.method2043((byte) -126);
            this.field2546[var32] = (short) var31;
        }
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            var33 += var3.method2043((byte) -121);
            this.field2546[var34] = (short) (this.field2546[var34] + (var33 << 8));
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (var35 == 0) {
                if (var36 >= var29.length) {
                    var35 = -1;
                } else {
                    var35 = var29[var36++];
                }
                var37 = var3.method2017((byte) -11);
            }
            var35--;
            this.field2546[var38] = (short) (this.field2546[var38] + (class311.method2135(var37 - 1, 2) << 14));
            this.field2540[var38] = var37;
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field2540[var42] != 0) {
                if (var40 == 0) {
                    var41 = var3.field4716[var6++] - 1;
                    if (var4.length <= var39) {
                        var40 = -1;
                    } else {
                        var40 = var4[var39++];
                    }
                }
                this.field2547[var42] = (byte) var41;
                var40--;
            }
        }
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field2540[var46] != 0) {
                if (var43 == 0) {
                    var45 = var3.field4716[var11++] + 16 << 2;
                    if (var8.length > var44) {
                        var43 = var8[var44++];
                    } else {
                        var43 = -1;
                    }
                }
                var43--;
                this.field2539[var46] = (byte) var45;
            }
        }
        class109 var47 = null;
        int var48 = 0;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (this.field2540[var50] != 0) {
                if (var49 == 0) {
                    var47 = var19[var14[var48]];
                    if (var48 >= var12.length) {
                        var49 = -1;
                    } else {
                        var49 = var12[var48++];
                    }
                }
                var49--;
                this.field2531[var50] = var47;
            }
        }
        int var51 = 0;
        int var52 = 0;
        int var53 = 0;
        for (int var54 = 0; var54 < 128; var54++) {
            if (var53 == 0) {
                if (var51 >= var29.length) {
                    var53 = -1;
                } else {
                    var53 = var29[var51++];
                }
                if (this.field2540[var54] > 0) {
                    var52 = var3.method2043((byte) -117) + 1;
                }
            }
            this.field2542[var54] = (byte) var52;
            var53--;
        }
        this.field2541 = var3.method2043((byte) -113) + 1;
        for (int var55 = 0; var55 < var15; var55++) {
            class109 var56 = var19[var55];
            if (var56.field1690 != null) {
                for (int var57 = 1; var57 < var56.field1690.length; var57 += 2) {
                    var56.field1690[var57] = var3.method2001(-3);
                }
            }
            if (var56.field1686 != null) {
                for (int var58 = 3; var58 < (var56.field1686.length - 2); var58 += 2) {
                    var56.field1686[var58] = var3.method2001(-3);
                }
            }
        }
        if (var25 != null) {
            for (int var59 = 1; var59 < var25.length; var59 += 2) {
                var25[var59] = var3.method2001(-3);
            }
        }
        if (var27 != null) {
            for (int var60 = 1; var60 < var27.length; var60 += 2) {
                var27[var60] = var3.method2001(-3);
            }
        }
        for (int var61 = 0; var61 < var15; var61++) {
            class109 var62 = var19[var61];
            if (var62.field1686 != null) {
                int var63 = 0;
                for (int var64 = 2; var64 < var62.field1686.length; var64 += 2) {
                    var63 = var3.method2043((byte) -117) + var63 + 1;
                    var62.field1686[var64] = (byte) var63;
                }
            }
        }
        for (int var65 = 0; var65 < var15; var65++) {
            class109 var66 = var19[var65];
            if (var66.field1690 != null) {
                int var67 = 0;
                for (int var68 = 2; var68 < var66.field1690.length; var68 += 2) {
                    var67 = var67 + var3.method2043((byte) -128) + 1;
                    var66.field1690[var68] = (byte) var67;
                }
            }
        }
        if (var25 != null) {
            int var69 = var3.method2043((byte) -115);
            var25[0] = (byte) var69;
            for (int var70 = 2; var70 < var25.length; var70 += 2) {
                var69 = var3.method2043((byte) -124) + (var69 + 1);
                var25[var70] = (byte) var69;
            }
            byte var71 = var25[1];
            byte var72 = var25[0];
            for (int var73 = 0; var73 < var72; var73++) {
                this.field2542[var73] = (byte) (this.field2542[var73] * var71 + 32 >> 6);
            }
            int var74 = 2;
            while (var25.length > var74) {
                byte var75 = var25[var74 + 1];
                byte var76 = var25[var74];
                int var77 = (var76 - var72) / 2 + (var76 - var72) * var71;
                var74 += 2;
                for (int var78 = var72; var78 < var76; var78++) {
                    int var79 = class289.method1888(var76 - var72, (byte) -47, var77);
                    this.field2542[var78] = (byte) (this.field2542[var78] * var79 + 32 >> 6);
                    var77 += var75 - var71;
                }
                var71 = var75;
                var72 = var76;
            }
            Object var80 = null;
            for (int var81 = var72; var81 < 128; var81++) {
                this.field2542[var81] = (byte) (this.field2542[var81] * var71 + 32 >> 6);
            }
        }
        if (var27 != null) {
            int var82 = var3.method2043((byte) -122);
            var27[0] = (byte) var82;
            for (int var83 = 2; var83 < var27.length; var83 += 2) {
                var82 = var3.method2043((byte) -126) + (var82 + 1);
                var27[var83] = (byte) var82;
            }
            byte var84 = var27[0];
            int var85 = var27[1] << 1;
            for (int var86 = 0; var86 < var84; var86++) {
                int var87 = (this.field2539[var86] & 0xFF) + var85;
                if (var87 < 0) {
                    var87 = 0;
                }
                if (var87 > 128) {
                    var87 = 128;
                }
                this.field2539[var86] = (byte) var87;
            }
            int var88 = 2;
            while (var27.length > var88) {
                byte var89 = var27[var88];
                int var90 = var27[var88 + 1] << 1;
                var88 += 2;
                int var91 = (var89 - var84) / 2 + (var89 - var84) * var85;
                for (int var92 = var84; var92 < var89; var92++) {
                    int var93 = class289.method1888(var89 - var84, (byte) -47, var91);
                    var91 += var90 - var85;
                    int var94 = (this.field2539[var92] & 0xFF) + var93;
                    if (var94 < 0) {
                        var94 = 0;
                    }
                    if (var94 > 128) {
                        var94 = 128;
                    }
                    this.field2539[var92] = (byte) var94;
                }
                var84 = var89;
                var85 = var90;
            }
            Object var95 = null;
            for (int var96 = var84; var96 < 128; var96++) {
                int var97 = (this.field2539[var96] & 0xFF) + var85;
                if (var97 < 0) {
                    var97 = 0;
                }
                if (var97 > 128) {
                    var97 = 128;
                }
                this.field2539[var96] = (byte) var97;
            }
        }
        for (int var98 = 0; var98 < var15; var98++) {
            var19[var98].field1688 = var3.method2043((byte) -117);
        }
        for (int var99 = 0; var99 < var15; var99++) {
            class109 var100 = var19[var99];
            if (var100.field1690 != null) {
                var100.field1678 = var3.method2043((byte) -114);
            }
            if (var100.field1686 != null) {
                var100.field1680 = var3.method2043((byte) -106);
            }
            if (var100.field1688 > 0) {
                var100.field1681 = var3.method2043((byte) -114);
            }
        }
        for (int var101 = 0; var101 < var15; var101++) {
            var19[var101].field1684 = var3.method2043((byte) -119);
        }
        for (int var102 = 0; var102 < var15; var102++) {
            class109 var103 = var19[var102];
            if (var103.field1684 > 0) {
                var103.field1689 = var3.method2043((byte) -119);
            }
        }
        for (int var104 = 0; var104 < var15; var104++) {
            class109 var105 = var19[var104];
            if (var105.field1689 > 0) {
                var105.field1683 = var3.method2043((byte) -122);
            }
        }
    }
}
