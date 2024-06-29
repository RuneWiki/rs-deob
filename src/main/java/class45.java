import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class45 extends class287 {

    @OriginalMember(owner = "client!lm", name = "N", descriptor = "[B")
    public byte[] field918;

    @OriginalMember(owner = "client!lm", name = "s", descriptor = "[S")
    public short[] field898;

    @OriginalMember(owner = "client!lm", name = "z", descriptor = "[Lck;")
    public class227[] field905;

    @OriginalMember(owner = "client!lm", name = "H", descriptor = "[B")
    public byte[] field912;

    @OriginalMember(owner = "client!lm", name = "M", descriptor = "[I")
    private int[] field917;

    @OriginalMember(owner = "client!lm", name = "w", descriptor = "[Llg;")
    public class116[] field902;

    @OriginalMember(owner = "client!lm", name = "J", descriptor = "[B")
    public byte[] field914;

    @OriginalMember(owner = "client!lm", name = "B", descriptor = "I")
    public int field907;

    @OriginalMember(owner = "client!lm", name = "v", descriptor = "Z")
    public static boolean field901 = false;

    @OriginalMember(owner = "client!lm", name = "G", descriptor = "I")
    public static int field911 = 0;

    @OriginalMember(owner = "client!lm", name = "I", descriptor = "[I")
    public static int[] field913 = new int[100];

    @OriginalMember(owner = "client!lm", name = "D", descriptor = "Z")
    public static boolean field908 = false;

    @OriginalMember(owner = "client!lm", name = "K", descriptor = "I")
    public static int field915 = 0;

    @OriginalMember(owner = "client!lm", name = "u", descriptor = "Z")
    public static boolean field900 = false;

    @OriginalMember(owner = "client!lm", name = "r", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!lm", name = "t", descriptor = "I")
    public static int field899;

    @OriginalMember(owner = "client!lm", name = "x", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "client!lm", name = "y", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "client!lm", name = "A", descriptor = "I")
    public static int field906;

    @OriginalMember(owner = "client!lm", name = "L", descriptor = "I")
    public static int field916;

    @OriginalMember(owner = "client!lm", name = "F", descriptor = "Z")
    public static boolean field910;

    @OriginalMember(owner = "client!lm", name = "E", descriptor = "[I")
    public static int[] field909;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(ILem;)Lmh;", line = 19)
    public static final class128 method302(int arg0, class10 arg1) {
        field897++;
        if (arg0 == class33.method234(-123, client.method1657(arg1))) {
            return null;
        } else if (arg1.field357 == null || arg1.field357.method832(arg0 - 1).method865((byte) -59) == 0) {
            return class3.field57 ? class246.field4194 : null;
        } else {
            return arg1.field357;
        }
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(Z)V", line = 75)
    public static final void method303(boolean arg0) {
        class200.field3508 = new class10[class194.field3357.method2152((byte) -110)][];
        class9.field201 = new boolean[class194.field3357.method2152((byte) -108)];
        if (arg0) {
            field899++;
        }
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(I)V", line = 87)
    public final void method304(int arg0) {
        this.field917 = null;
        field916++;
        int var2 = 20 / ((-arg0 - 72) / 48);
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "([ILph;[BZ)Z", line = 103)
    public final boolean method305(int[] arg0, class72 arg1, byte[] arg2, boolean arg3) {
        field903++;
        boolean var5 = arg3;
        int var6 = 0;
        class227 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg2 == null || arg2[var8] != 0) {
                int var9 = this.field917[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg1.method478(var9 >> 2, true, arg0);
                        } else {
                            var7 = arg1.method479(var9 >> 2, arg0, (byte) 113);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field905[var8] = var7;
                        this.field917[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(B)V", line = 157)
    public static void method306(byte arg0) {
        field913 = null;
        field909 = null;
        if (arg0 < 89) {
            field909 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "()V", line = 174)
    public class45() {
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "([B)V", line = 176)
    public class45(byte[] arg0) {
        this.field918 = new byte[128];
        int var2 = 0;
        this.field898 = new short[128];
        this.field905 = new class227[128];
        this.field912 = new byte[128];
        this.field917 = new int[128];
        this.field902 = new class116[128];
        this.field914 = new byte[128];
        class194 var3 = new class194(arg0);
        while (var3.field3417[var3.field3380 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method1326((byte) 117);
        }
        var2++;
        int var6 = 0;
        var3.field3380++;
        int var7 = var3.field3380;
        var3.field3380 += var2;
        while (var3.field3417[var3.field3380 + var6] != 0) {
            var6++;
        }
        byte[] var8 = new byte[var6];
        for (int var9 = 0; var9 < var6; var9++) {
            var8[var9] = var3.method1326((byte) 106);
        }
        var3.field3380++;
        var6++;
        int var10 = 0;
        int var11 = var3.field3380;
        var3.field3380 += var6;
        while (var3.field3417[var3.field3380 + var10] != 0) {
            var10++;
        }
        byte[] var12 = new byte[var10];
        for (int var13 = 0; var13 < var10; var13++) {
            var12[var13] = var3.method1326((byte) 98);
        }
        var3.field3380++;
        var10++;
        byte[] var14 = new byte[var10];
        int var15;
        if (var10 > 1) {
            var15 = 2;
            var14[1] = 1;
            int var16 = 1;
            for (int var17 = 2; var17 < var10; var17++) {
                int var18 = var3.method1325(7627);
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
        } else {
            var15 = var10;
        }
        class116[] var19 = new class116[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class116 var21 = var19[var20] = new class116();
            int var22 = var3.method1325(7627);
            if (var22 > 0) {
                var21.field1970 = new byte[var22 * 2];
            }
            int var23 = var3.method1325(7627);
            if (var23 > 0) {
                var21.field1966 = new byte[var23 * 2 + 2];
                var21.field1966[1] = 64;
            }
        }
        int var24 = var3.method1325(7627);
        byte[] var25 = var24 <= 0 ? null : new byte[var24 * 2];
        int var26 = var3.method1325(7627);
        int var27 = 0;
        byte[] var28 = var26 > 0 ? new byte[var26 * 2] : null;
        while (var3.field3417[var3.field3380 + var27] != 0) {
            var27++;
        }
        byte[] var29 = new byte[var27];
        for (int var30 = 0; var30 < var27; var30++) {
            var29[var30] = var3.method1326((byte) 122);
        }
        var27++;
        var3.field3380++;
        int var31 = 0;
        for (int var32 = 0; var32 < 128; var32++) {
            var31 += var3.method1325(7627);
            this.field898[var32] = (short) var31;
        }
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            var33 += var3.method1325(7627);
            this.field898[var34] = (short) (this.field898[var34] + (var33 << 8));
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
                var37 = var3.method1336(126);
            }
            var35--;
            this.field898[var38] = (short) (this.field898[var38] + class238.method1622(32768, var37 - 1 << 14));
            this.field917[var38] = var37;
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field917[var42] != 0) {
                if (var39 == 0) {
                    var41 = var3.field3417[var7++] - 1;
                    if (var4.length > var40) {
                        var39 = var4[var40++];
                    } else {
                        var39 = -1;
                    }
                }
                this.field918[var42] = (byte) var41;
                var39--;
            }
        }
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field917[var46] != 0) {
                if (var43 == 0) {
                    if (var44 >= var8.length) {
                        var43 = -1;
                    } else {
                        var43 = var8[var44++];
                    }
                    var45 = var3.field3417[var11++] + 16 << 2;
                }
                this.field914[var46] = (byte) var45;
                var43--;
            }
        }
        int var47 = 0;
        class116 var48 = null;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (this.field917[var50] != 0) {
                if (var49 == 0) {
                    var48 = var19[var14[var47]];
                    if (var47 >= var12.length) {
                        var49 = -1;
                    } else {
                        var49 = var12[var47++];
                    }
                }
                this.field902[var50] = var48;
                var49--;
            }
        }
        int var51 = 0;
        int var52 = 0;
        int var53 = 0;
        for (int var54 = 0; var54 < 128; var54++) {
            if (var53 == 0) {
                if (var29.length <= var51) {
                    var53 = -1;
                } else {
                    var53 = var29[var51++];
                }
                if (this.field917[var54] > 0) {
                    var52 = var3.method1325(7627) + 1;
                }
            }
            this.field912[var54] = (byte) var52;
            var53--;
        }
        this.field907 = var3.method1325(7627) + 1;
        for (int var55 = 0; var55 < var15; var55++) {
            class116 var56 = var19[var55];
            if (var56.field1970 != null) {
                for (int var57 = 1; var57 < var56.field1970.length; var57 += 2) {
                    var56.field1970[var57] = var3.method1326((byte) 91);
                }
            }
            if (var56.field1966 != null) {
                for (int var58 = 3; var58 < (var56.field1966.length - 2); var58 += 2) {
                    var56.field1966[var58] = var3.method1326((byte) 103);
                }
            }
        }
        if (var25 != null) {
            for (int var59 = 1; var59 < var25.length; var59 += 2) {
                var25[var59] = var3.method1326((byte) 121);
            }
        }
        if (var28 != null) {
            for (int var60 = 1; var60 < var28.length; var60 += 2) {
                var28[var60] = var3.method1326((byte) 114);
            }
        }
        for (int var61 = 0; var61 < var15; var61++) {
            class116 var62 = var19[var61];
            if (var62.field1966 != null) {
                int var63 = 0;
                for (int var64 = 2; var64 < var62.field1966.length; var64 += 2) {
                    var63 += var3.method1325(7627) + 1;
                    var62.field1966[var64] = (byte) var63;
                }
            }
        }
        for (int var65 = 0; var65 < var15; var65++) {
            class116 var66 = var19[var65];
            if (var66.field1970 != null) {
                int var67 = 0;
                for (int var68 = 2; var68 < var66.field1970.length; var68 += 2) {
                    var67 = var3.method1325(7627) + var67 + 1;
                    var66.field1970[var68] = (byte) var67;
                }
            }
        }
        if (var25 != null) {
            int var69 = var3.method1325(7627);
            var25[0] = (byte) var69;
            for (int var70 = 2; var70 < var25.length; var70 += 2) {
                var69 = var3.method1325(7627) + var69 + 1;
                var25[var70] = (byte) var69;
            }
            byte var71 = var25[0];
            byte var72 = var25[1];
            for (int var73 = 0; var73 < var71; var73++) {
                this.field912[var73] = (byte) (this.field912[var73] * var72 + 32 >> 6);
            }
            for (int var74 = 2; var74 < var25.length; var74 += 2) {
                byte var75 = var25[var74];
                int var76 = (var75 - var71) / 2 + (var75 - var71) * var72;
                byte var77 = var25[var74 + 1];
                for (int var78 = var71; var78 < var75; var78++) {
                    int var79 = class297.method2037(var76, var75 - var71, -25932);
                    this.field912[var78] = (byte) (this.field912[var78] * var79 + 32 >> 6);
                    var76 += var77 - var72;
                }
                var72 = var77;
                var71 = var75;
            }
            for (int var80 = var71; var80 < 128; var80++) {
                this.field912[var80] = (byte) (this.field912[var80] * var72 + 32 >> 6);
            }
            Object var81 = null;
        }
        if (var28 != null) {
            int var82 = var3.method1325(7627);
            var28[0] = (byte) var82;
            for (int var83 = 2; var83 < var28.length; var83 += 2) {
                var82 -= -var3.method1325(7627) - 1;
                var28[var83] = (byte) var82;
            }
            byte var84 = var28[0];
            int var85 = var28[1] << 1;
            for (int var86 = 0; var86 < var84; var86++) {
                int var87 = (this.field914[var86] & 0xFF) + var85;
                if (var87 < 0) {
                    var87 = 0;
                }
                if (var87 > 128) {
                    var87 = 128;
                }
                this.field914[var86] = (byte) var87;
            }
            int var88 = 2;
            while (var88 < var28.length) {
                byte var89 = var28[var88];
                int var90 = var28[var88 + 1] << 1;
                var88 += 2;
                int var91 = (var89 - var84) / 2 + (var89 - var84) * var85;
                for (int var92 = var84; var92 < var89; var92++) {
                    int var93 = class297.method2037(var91, var89 - var84, -25932);
                    int var94 = (this.field914[var92] & 0xFF) + var93;
                    var91 += var90 - var85;
                    if (var94 < 0) {
                        var94 = 0;
                    }
                    if (var94 > 128) {
                        var94 = 128;
                    }
                    this.field914[var92] = (byte) var94;
                }
                var84 = var89;
                var85 = var90;
            }
            for (int var95 = var84; var95 < 128; var95++) {
                int var96 = (this.field914[var95] & 0xFF) + var85;
                if (var96 < 0) {
                    var96 = 0;
                }
                if (var96 > 128) {
                    var96 = 128;
                }
                this.field914[var95] = (byte) var96;
            }
            Object var97 = null;
        }
        for (int var98 = 0; var98 < var15; var98++) {
            var19[var98].field1958 = var3.method1325(7627);
        }
        for (int var99 = 0; var99 < var15; var99++) {
            class116 var100 = var19[var99];
            if (var100.field1970 != null) {
                var100.field1952 = var3.method1325(7627);
            }
            if (var100.field1966 != null) {
                var100.field1956 = var3.method1325(7627);
            }
            if (var100.field1958 > 0) {
                var100.field1961 = var3.method1325(7627);
            }
        }
        for (int var101 = 0; var101 < var15; var101++) {
            var19[var101].field1968 = var3.method1325(7627);
        }
        for (int var102 = 0; var102 < var15; var102++) {
            class116 var103 = var19[var102];
            if (var103.field1968 > 0) {
                var103.field1971 = var3.method1325(7627);
            }
        }
        for (int var104 = 0; var104 < var15; var104++) {
            class116 var105 = var19[var104];
            if (var105.field1971 > 0) {
                var105.field1960 = var3.method1325(7627);
            }
        }
    }
}
