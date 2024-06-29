import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class100 extends class183 {

    @OriginalMember(owner = "client!b", name = "v", descriptor = "[I")
    private int[] field1373;

    @OriginalMember(owner = "client!b", name = "m", descriptor = "[S")
    public short[] field1364;

    @OriginalMember(owner = "client!b", name = "w", descriptor = "[B")
    public byte[] field1374;

    @OriginalMember(owner = "client!b", name = "s", descriptor = "[Ljf;")
    public class47[] field1370;

    @OriginalMember(owner = "client!b", name = "F", descriptor = "[B")
    public byte[] field1382;

    @OriginalMember(owner = "client!b", name = "A", descriptor = "[B")
    public byte[] field1378;

    @OriginalMember(owner = "client!b", name = "x", descriptor = "[Lcc;")
    public class87[] field1375;

    @OriginalMember(owner = "client!b", name = "H", descriptor = "I")
    public int field1384;

    @OriginalMember(owner = "client!b", name = "t", descriptor = "Ljava/lang/String;")
    public static String field1371 = "Discard";

    @OriginalMember(owner = "client!b", name = "B", descriptor = "I")
    public static int field1379 = 0;

    @OriginalMember(owner = "client!b", name = "D", descriptor = "Z")
    public static boolean field1380 = false;

    @OriginalMember(owner = "client!b", name = "y", descriptor = "[I")
    public static int[] field1376 = new int[5];

    @OriginalMember(owner = "client!b", name = "I", descriptor = "J")
    public static long field1385 = 0L;

    @OriginalMember(owner = "client!b", name = "u", descriptor = "[I")
    public static int[] field1372 = new int[2];

    @OriginalMember(owner = "client!b", name = "o", descriptor = "I")
    public static int field1366;

    @OriginalMember(owner = "client!b", name = "p", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!b", name = "q", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!b", name = "r", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!b", name = "z", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!b", name = "E", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!b", name = "G", descriptor = "Lkm;")
    public static class133 field1383;

    @OriginalMember(owner = "client!b", name = "n", descriptor = "[I")
    public static int[] field1365;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IB)Log;", line = 20)
    public static final class157 method729(int arg0, byte arg1) {
        field1368++;
        class157 var2 = (class157) class162.field2232.method716((long) arg0, false);
        if (arg1 > -52) {
            field1376 = (int[]) null;
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class237.field3369.method955(class121.method880(arg0, 17626), class211.method1484(arg0, -16255), -21853);
        class157 var4 = new class157();
        if (var3 != null) {
            var4.method1133(-1, new class316(var3));
        }
        class162.field2232.method721((long) arg0, var4, 0);
        return var4;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ILti;)V", line = 50)
    public static final void method730(int arg0, class211 arg1) {
        class128.field1760 = arg1;
        if (arg0 != -9574) {
            method733(-43, 3);
        }
        field1377++;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I[B[ILnc;)Z", line = 63)
    public final boolean method731(int arg0, byte[] arg1, int[] arg2, class161 arg3) {
        field1369++;
        boolean var5 = true;
        int var6 = 0;
        class87 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg1 == null || arg1[var8] != 0) {
                int var9 = this.field1373[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg3.method1162(arg2, var9 >> 2, (byte) -23);
                        } else {
                            var7 = arg3.method1158(var9 >> 2, arg2, (byte) -92);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field1375[var8] = var7;
                        this.field1373[var8] = 0;
                    }
                }
            }
        }
        if (arg0 < 59) {
            return true;
        } else {
            return var5;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V", line = 121)
    public static final void method732(int arg0) {
        field1381++;
        if (arg0 >= 109 && class198.field2822 == 5) {
            class198.field2822 = 6;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(II)V", line = 137)
    public static final void method733(int arg0, int arg1) {
        field1366++;
        class306.field4589.method720(arg0, 1088);
        if (arg1 != 0) {
            field1380 = false;
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(I)V", line = 150)
    public static void method734(int arg0) {
        field1376 = null;
        if (arg0 != 0) {
            method734(93);
        }
        field1383 = null;
        field1365 = null;
        field1372 = null;
        field1371 = null;
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "()V", line = 176)
    public class100() {
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "([B)V", line = 186)
    public class100(byte[] arg0) {
        this.field1373 = new int[128];
        this.field1364 = new short[128];
        this.field1374 = new byte[128];
        this.field1370 = new class47[128];
        this.field1382 = new byte[128];
        this.field1378 = new byte[128];
        int var2 = 0;
        this.field1375 = new class87[128];
        class316 var3 = new class316(arg0);
        while (var3.field4798[var3.field4777 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method2192(3);
        }
        var2++;
        var3.field4777++;
        int var6 = var3.field4777;
        var3.field4777 += var2;
        int var7;
        for (var7 = 0; var3.field4798[var3.field4777 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method2192(3);
        }
        var3.field4777++;
        var7++;
        int var10 = 0;
        int var11 = var3.field4777;
        var3.field4777 += var7;
        while (var3.field4798[var3.field4777 + var10] != 0) {
            var10++;
        }
        byte[] var12 = new byte[var10];
        for (int var13 = 0; var13 < var10; var13++) {
            var12[var13] = var3.method2192(3);
        }
        var10++;
        var3.field4777++;
        byte[] var14 = new byte[var10];
        int var15;
        if (var10 <= 1) {
            var15 = var10;
        } else {
            int var16 = 1;
            var14[1] = 1;
            var15 = 2;
            for (int var17 = 2; var17 < var10; var17++) {
                int var18 = var3.method2219(16448);
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
        class47[] var19 = new class47[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class47 var21 = var19[var20] = new class47();
            int var22 = var3.method2219(16448);
            if (var22 > 0) {
                var21.field573 = new byte[var22 * 2];
            }
            int var23 = var3.method2219(16448);
            if (var23 > 0) {
                var21.field586 = new byte[var23 * 2 + 2];
                var21.field586[1] = 64;
            }
        }
        int var24 = var3.method2219(16448);
        byte[] var25 = var24 > 0 ? new byte[var24 * 2] : null;
        int var26 = var3.method2219(16448);
        byte[] var27 = var26 <= 0 ? null : new byte[var26 * 2];
        int var28;
        for (var28 = 0; var3.field4798[var3.field4777 + var28] != 0; var28++) {
        }
        byte[] var29 = new byte[var28];
        for (int var30 = 0; var30 < var28; var30++) {
            var29[var30] = var3.method2192(3);
        }
        var28++;
        var3.field4777++;
        int var31 = 0;
        for (int var32 = 0; var32 < 128; var32++) {
            var31 += var3.method2219(16448);
            this.field1364[var32] = (short) var31;
        }
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            var33 += var3.method2219(16448);
            this.field1364[var34] = (short) (this.field1364[var34] + (var33 << 8));
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (var35 == 0) {
                if (var29.length <= var37) {
                    var35 = -1;
                } else {
                    var35 = var29[var37++];
                }
                var36 = var3.method2179(false);
            }
            this.field1364[var38] = (short) (this.field1364[var38] + (class47.method303(2, var36 - 1) << 14));
            this.field1373[var38] = var36;
            var35--;
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field1373[var42] != 0) {
                if (var40 == 0) {
                    if (var39 >= var4.length) {
                        var40 = -1;
                    } else {
                        var40 = var4[var39++];
                    }
                    var41 = var3.field4798[var6++] - 1;
                }
                var40--;
                this.field1378[var42] = (byte) var41;
            }
        }
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field1373[var46] != 0) {
                if (var43 == 0) {
                    var44 = var3.field4798[var11++] + 16 << 2;
                    if (var45 < var8.length) {
                        var43 = var8[var45++];
                    } else {
                        var43 = -1;
                    }
                }
                var43--;
                this.field1382[var46] = (byte) var44;
            }
        }
        int var47 = 0;
        int var48 = 0;
        class47 var49 = null;
        for (int var50 = 0; var50 < 128; var50++) {
            if (this.field1373[var50] != 0) {
                if (var48 == 0) {
                    var49 = var19[var14[var47]];
                    if (var12.length <= var47) {
                        var48 = -1;
                    } else {
                        var48 = var12[var47++];
                    }
                }
                var48--;
                this.field1370[var50] = var49;
            }
        }
        int var51 = 0;
        int var52 = 0;
        int var53 = 0;
        for (int var54 = 0; var54 < 128; var54++) {
            if (var52 == 0) {
                if (var51 >= var29.length) {
                    var52 = -1;
                } else {
                    var52 = var29[var51++];
                }
                if (this.field1373[var54] > 0) {
                    var53 = var3.method2219(16448) + 1;
                }
            }
            this.field1374[var54] = (byte) var53;
            var52--;
        }
        this.field1384 = var3.method2219(16448) + 1;
        for (int var55 = 0; var55 < var15; var55++) {
            class47 var56 = var19[var55];
            if (var56.field573 != null) {
                for (int var57 = 1; var57 < var56.field573.length; var57 += 2) {
                    var56.field573[var57] = var3.method2192(3);
                }
            }
            if (var56.field586 != null) {
                for (int var58 = 3; var58 < var56.field586.length - 2; var58 += 2) {
                    var56.field586[var58] = var3.method2192(3);
                }
            }
        }
        if (var25 != null) {
            for (int var59 = 1; var59 < var25.length; var59 += 2) {
                var25[var59] = var3.method2192(3);
            }
        }
        if (var27 != null) {
            for (int var60 = 1; var60 < var27.length; var60 += 2) {
                var27[var60] = var3.method2192(3);
            }
        }
        for (int var61 = 0; var61 < var15; var61++) {
            class47 var62 = var19[var61];
            if (var62.field586 != null) {
                int var63 = 0;
                for (int var64 = 2; var64 < var62.field586.length; var64 += 2) {
                    var63 = var63 + var3.method2219(16448) + 1;
                    var62.field586[var64] = (byte) var63;
                }
            }
        }
        for (int var65 = 0; var65 < var15; var65++) {
            class47 var66 = var19[var65];
            if (var66.field573 != null) {
                int var67 = 0;
                for (int var68 = 2; var68 < var66.field573.length; var68 += 2) {
                    var67 = var3.method2219(16448) + var67 + 1;
                    var66.field573[var68] = (byte) var67;
                }
            }
        }
        if (var25 != null) {
            int var69 = var3.method2219(16448);
            var25[0] = (byte) var69;
            for (int var70 = 2; var70 < var25.length; var70 += 2) {
                var69 += var3.method2219(16448) + 1;
                var25[var70] = (byte) var69;
            }
            byte var71 = var25[0];
            byte var72 = var25[1];
            for (int var73 = 0; var73 < var71; var73++) {
                this.field1374[var73] = (byte) (this.field1374[var73] * var72 + 32 >> 6);
            }
            int var74 = 2;
            while (var25.length > var74) {
                byte var75 = var25[var74];
                byte var76 = var25[var74 + 1];
                int var77 = (var75 - var71) / 2 + (var75 - var71) * var72;
                var74 += 2;
                for (int var78 = var71; var78 < var75; var78++) {
                    int var79 = class43.method268((byte) 91, var75 - var71, var77);
                    this.field1374[var78] = (byte) (this.field1374[var78] * var79 + 32 >> 6);
                    var77 += var76 - var72;
                }
                var72 = var76;
                var71 = var75;
            }
            Object var80 = null;
            for (int var81 = var71; var81 < 128; var81++) {
                this.field1374[var81] = (byte) (this.field1374[var81] * var72 + 32 >> 6);
            }
        }
        if (var27 != null) {
            int var82 = var3.method2219(16448);
            var27[0] = (byte) var82;
            for (int var83 = 2; var83 < var27.length; var83 += 2) {
                var82 = var82 + var3.method2219(16448) + 1;
                var27[var83] = (byte) var82;
            }
            byte var84 = var27[0];
            int var85 = var27[1] << 1;
            for (int var86 = 0; var86 < var84; var86++) {
                int var87 = (this.field1382[var86] & 0xFF) + var85;
                if (var87 < 0) {
                    var87 = 0;
                }
                if (var87 > 128) {
                    var87 = 128;
                }
                this.field1382[var86] = (byte) var87;
            }
            int var88 = 2;
            while (var27.length > var88) {
                byte var89 = var27[var88];
                int var90 = var27[var88 + 1] << 1;
                var88 += 2;
                int var91 = (var89 - var84) / 2 + (var89 - var84) * var85;
                for (int var92 = var84; var92 < var89; var92++) {
                    int var93 = class43.method268((byte) 94, var89 - var84, var91);
                    var91 += var90 - var85;
                    int var94 = (this.field1382[var92] & 0xFF) + var93;
                    if (var94 < 0) {
                        var94 = 0;
                    }
                    if (var94 > 128) {
                        var94 = 128;
                    }
                    this.field1382[var92] = (byte) var94;
                }
                var84 = var89;
                var85 = var90;
            }
            for (int var95 = var84; var95 < 128; var95++) {
                int var96 = (this.field1382[var95] & 0xFF) + var85;
                if (var96 < 0) {
                    var96 = 0;
                }
                if (var96 > 128) {
                    var96 = 128;
                }
                this.field1382[var95] = (byte) var96;
            }
            Object var97 = null;
        }
        for (int var98 = 0; var98 < var15; var98++) {
            var19[var98].field574 = var3.method2219(16448);
        }
        for (int var99 = 0; var99 < var15; var99++) {
            class47 var100 = var19[var99];
            if (var100.field573 != null) {
                var100.field581 = var3.method2219(16448);
            }
            if (var100.field586 != null) {
                var100.field578 = var3.method2219(16448);
            }
            if (var100.field574 > 0) {
                var100.field583 = var3.method2219(16448);
            }
        }
        for (int var101 = 0; var101 < var15; var101++) {
            var19[var101].field576 = var3.method2219(16448);
        }
        for (int var102 = 0; var102 < var15; var102++) {
            class47 var103 = var19[var102];
            if (var103.field576 > 0) {
                var103.field584 = var3.method2219(16448);
            }
        }
        for (int var104 = 0; var104 < var15; var104++) {
            class47 var105 = var19[var104];
            if (var105.field584 > 0) {
                var105.field582 = var3.method2219(16448);
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(I)V", line = 830)
    public final void method735(int arg0) {
        field1367++;
        this.field1373 = null;
        if (arg0 != 2) {
            field1371 = (String) null;
        }
    }
}
