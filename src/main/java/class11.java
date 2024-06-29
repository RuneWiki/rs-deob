import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class11 extends class307 {

    @OriginalMember(owner = "client!se", name = "K", descriptor = "[S")
    public short[] field183;

    @OriginalMember(owner = "client!se", name = "J", descriptor = "[Lbj;")
    public class51[] field182;

    @OriginalMember(owner = "client!se", name = "C", descriptor = "[I")
    private int[] field175;

    @OriginalMember(owner = "client!se", name = "I", descriptor = "[Lcd;")
    public class64[] field181;

    @OriginalMember(owner = "client!se", name = "x", descriptor = "[B")
    public byte[] field170;

    @OriginalMember(owner = "client!se", name = "A", descriptor = "[B")
    public byte[] field173;

    @OriginalMember(owner = "client!se", name = "z", descriptor = "[B")
    public byte[] field172;

    @OriginalMember(owner = "client!se", name = "y", descriptor = "I")
    public int field171;

    @OriginalMember(owner = "client!se", name = "D", descriptor = "[[I")
    public static int[][] field176 = new int[5][5000];

    @OriginalMember(owner = "client!se", name = "B", descriptor = "[I")
    public static int[] field174 = new int[] { 1, 1, 1, 1, 4, 1, 1, 5, 6, 1, 5, 0, 7, 0, 4, 1, 7, 2, 1, 1, 6, 1, 1, 3, 6, 1, 7, 0, 0, 6, 7, 0, 1, 7, 6, 1, 1, 1, 5, 4, 3, 2, 1, 1, 0, 4, 1, 5 };

    @OriginalMember(owner = "client!se", name = "H", descriptor = "Z")
    public static boolean field180 = false;

    @OriginalMember(owner = "client!se", name = "w", descriptor = "I")
    public static int field169;

    @OriginalMember(owner = "client!se", name = "E", descriptor = "I")
    public static int field177;

    @OriginalMember(owner = "client!se", name = "F", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!se", name = "G", descriptor = "I")
    public static int field179;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IZ)V", line = 5)
    public static final void method68(int arg0, boolean arg1) {
        field179++;
        if (arg0 == -17752 && class55.field1074 != arg1) {
            class55.field1074 = arg1;
            class314.method2166(arg0 + 34081);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V", line = 20)
    public static void method69(byte arg0) {
        field176 = (int[][]) null;
        field174 = null;
        if (arg0 <= 0) {
            method72(-92, (class26) null);
        }
    }

    @OriginalMember(owner = "client!se", name = "d", descriptor = "(I)V", line = 40)
    public final void method70(int arg0) {
        this.field175 = null;
        field178++;
        if (arg0 >= -101) {
            this.method73(102, (class250) null, (byte[]) null, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(II)I", line = 76)
    public static int method71(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ILsd;)V", line = 85)
    public static final void method72(int arg0, class26 arg1) {
        field169++;
        for (int var2 = arg0; var2 < class168.field2760; var2++) {
            int var3 = arg1.method195((byte) 120);
            int var4 = arg1.method197(-1);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class159.field2661[var3] != null) {
                class159.field2661[var3].field681 = var4;
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ILik;[B[I)Z", line = 111)
    public final boolean method73(int arg0, class250 arg1, byte[] arg2, int[] arg3) {
        if (arg0 != 15092) {
            method68(104, false);
        }
        field177++;
        int var5 = 0;
        class64 var6 = null;
        boolean var7 = true;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg2 == null || arg2[var8] != 0) {
                int var9 = this.field175[var8];
                if (var9 != 0) {
                    if (var5 != var9) {
                        var5 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var6 = arg1.method1770(arg3, var9 >> 2, arg0 + 15575);
                        } else {
                            var6 = arg1.method1767(var9 >> 2, 116, arg3);
                        }
                        if (var6 == null) {
                            var7 = false;
                        }
                    }
                    if (var6 != null) {
                        this.field181[var8] = var6;
                        this.field175[var8] = 0;
                    }
                }
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "()V", line = 187)
    public class11() {
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "([B)V", line = 189)
    public class11(byte[] arg0) {
        this.field183 = new short[128];
        this.field182 = new class51[128];
        this.field175 = new int[128];
        this.field181 = new class64[128];
        this.field170 = new byte[128];
        this.field173 = new byte[128];
        this.field172 = new byte[128];
        class26 var2 = new class26(arg0);
        int var3;
        for (var3 = 0; var2.field472[var2.field478 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method234(2193);
        }
        var3++;
        var2.field478++;
        int var6 = var2.field478;
        int var7 = 0;
        var2.field478 += var3;
        while (var2.field472[var2.field478 + var7] != 0) {
            var7++;
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method234(2193);
        }
        var7++;
        var2.field478++;
        int var10 = var2.field478;
        int var11 = 0;
        var2.field478 += var7;
        while (var2.field472[var2.field478 + var11] != 0) {
            var11++;
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method234(2193);
        }
        var11++;
        var2.field478++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 <= 1) {
            var15 = var11;
        } else {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var2.method226(255);
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
        class51[] var19 = new class51[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class51 var21 = var19[var20] = new class51();
            int var22 = var2.method226(255);
            if (var22 > 0) {
                var21.field980 = new byte[var22 * 2];
            }
            int var23 = var2.method226(255);
            if (var23 > 0) {
                var21.field985 = new byte[var23 * 2 + 2];
                var21.field985[1] = 64;
            }
        }
        int var24 = var2.method226(255);
        byte[] var25 = var24 <= 0 ? null : new byte[var24 * 2];
        int var26 = var2.method226(255);
        byte[] var27 = var26 > 0 ? new byte[var26 * 2] : null;
        int var28;
        for (var28 = 0; var2.field472[var2.field478 + var28] != 0; var28++) {
        }
        byte[] var29 = new byte[var28];
        for (int var30 = 0; var30 < var28; var30++) {
            var29[var30] = var2.method234(2193);
        }
        var2.field478++;
        var28++;
        int var31 = 0;
        for (int var32 = 0; var32 < 128; var32++) {
            var31 += var2.method226(255);
            this.field183[var32] = (short) var31;
        }
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            var33 += var2.method226(255);
            this.field183[var34] = (short) (this.field183[var34] + (var33 << 8));
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
                var36 = var2.method210((byte) 31);
            }
            this.field183[var38] = (short) (this.field183[var38] + class276.method1923(32768, var36 - 1 << 14));
            this.field175[var38] = var36;
            var35--;
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field175[var42] != 0) {
                if (var39 == 0) {
                    if (var4.length <= var40) {
                        var39 = -1;
                    } else {
                        var39 = var4[var40++];
                    }
                    var41 = var2.field472[var6++] - 1;
                }
                this.field170[var42] = (byte) var41;
                var39--;
            }
        }
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field175[var46] != 0) {
                if (var45 == 0) {
                    var44 = var2.field472[var10++] + 16 << 2;
                    if (var8.length <= var43) {
                        var45 = -1;
                    } else {
                        var45 = var8[var43++];
                    }
                }
                this.field173[var46] = (byte) var44;
                var45--;
            }
        }
        int var47 = 0;
        int var48 = 0;
        class51 var49 = null;
        for (int var50 = 0; var50 < 128; var50++) {
            if (this.field175[var50] != 0) {
                if (var48 == 0) {
                    var49 = var19[var14[var47]];
                    if (var47 < var12.length) {
                        var48 = var12[var47++];
                    } else {
                        var48 = -1;
                    }
                }
                var48--;
                this.field182[var50] = var49;
            }
        }
        int var51 = 0;
        int var52 = 0;
        int var53 = 0;
        for (int var54 = 0; var54 < 128; var54++) {
            if (var51 == 0) {
                if (var29.length <= var52) {
                    var51 = -1;
                } else {
                    var51 = var29[var52++];
                }
                if (this.field175[var54] > 0) {
                    var53 = var2.method226(255) + 1;
                }
            }
            this.field172[var54] = (byte) var53;
            var51--;
        }
        this.field171 = var2.method226(255) + 1;
        for (int var55 = 0; var55 < var15; var55++) {
            class51 var56 = var19[var55];
            if (var56.field980 != null) {
                for (int var57 = 1; var57 < var56.field980.length; var57 += 2) {
                    var56.field980[var57] = var2.method234(2193);
                }
            }
            if (var56.field985 != null) {
                for (int var58 = 3; var58 < var56.field985.length - 2; var58 += 2) {
                    var56.field985[var58] = var2.method234(2193);
                }
            }
        }
        if (var25 != null) {
            for (int var59 = 1; var59 < var25.length; var59 += 2) {
                var25[var59] = var2.method234(2193);
            }
        }
        if (var27 != null) {
            for (int var60 = 1; var60 < var27.length; var60 += 2) {
                var27[var60] = var2.method234(2193);
            }
        }
        for (int var61 = 0; var61 < var15; var61++) {
            class51 var62 = var19[var61];
            if (var62.field985 != null) {
                int var63 = 0;
                for (int var64 = 2; var64 < var62.field985.length; var64 += 2) {
                    var63 = (var63 + var2.method226(255)) + 1;
                    var62.field985[var64] = (byte) var63;
                }
            }
        }
        for (int var65 = 0; var65 < var15; var65++) {
            class51 var66 = var19[var65];
            if (var66.field980 != null) {
                int var67 = 0;
                for (int var68 = 2; var68 < var66.field980.length; var68 += 2) {
                    var67 = var2.method226(255) + (var67 + 1);
                    var66.field980[var68] = (byte) var67;
                }
            }
        }
        if (var25 != null) {
            int var69 = var2.method226(255);
            var25[0] = (byte) var69;
            for (int var70 = 2; var70 < var25.length; var70 += 2) {
                var69 = var2.method226(255) + var69 + 1;
                var25[var70] = (byte) var69;
            }
            byte var71 = var25[0];
            byte var72 = var25[1];
            for (int var73 = 0; var73 < var71; var73++) {
                this.field172[var73] = (byte) (this.field172[var73] * var72 + 32 >> 6);
            }
            int var74 = 2;
            while (var25.length > var74) {
                byte var75 = var25[var74 + 1];
                byte var76 = var25[var74];
                var74 += 2;
                int var77 = (var76 - var71) / 2 + (var76 - var71) * var72;
                for (int var78 = var71; var78 < var76; var78++) {
                    int var79 = class165.method1246(var77, -515141921, var76 - var71);
                    var77 += var75 - var72;
                    this.field172[var78] = (byte) (this.field172[var78] * var79 + 32 >> 6);
                }
                var72 = var75;
                var71 = var76;
            }
            for (int var80 = var71; var80 < 128; var80++) {
                this.field172[var80] = (byte) (this.field172[var80] * var72 + 32 >> 6);
            }
            Object var81 = null;
        }
        if (var27 != null) {
            int var82 = var2.method226(255);
            var27[0] = (byte) var82;
            for (int var83 = 2; var83 < var27.length; var83 += 2) {
                var82 -= -var2.method226(255) - 1;
                var27[var83] = (byte) var82;
            }
            byte var84 = var27[0];
            int var85 = var27[1] << 1;
            for (int var86 = 0; var86 < var84; var86++) {
                int var87 = (this.field173[var86] & 0xFF) + var85;
                if (var87 < 0) {
                    var87 = 0;
                }
                if (var87 > 128) {
                    var87 = 128;
                }
                this.field173[var86] = (byte) var87;
            }
            int var88 = 2;
            while (var27.length > var88) {
                byte var89 = var27[var88];
                int var90 = var27[var88 + 1] << 1;
                int var91 = (var89 - var84) / 2 + (var89 - var84) * var85;
                for (int var92 = var84; var92 < var89; var92++) {
                    int var93 = class165.method1246(var91, -515141921, var89 - var84);
                    int var94 = (this.field173[var92] & 0xFF) + var93;
                    var91 += var90 - var85;
                    if (var94 < 0) {
                        var94 = 0;
                    }
                    if (var94 > 128) {
                        var94 = 128;
                    }
                    this.field173[var92] = (byte) var94;
                }
                var88 += 2;
                var85 = var90;
                var84 = var89;
            }
            Object var95 = null;
            for (int var96 = var84; var96 < 128; var96++) {
                int var97 = (this.field173[var96] & 0xFF) + var85;
                if (var97 < 0) {
                    var97 = 0;
                }
                if (var97 > 128) {
                    var97 = 128;
                }
                this.field173[var96] = (byte) var97;
            }
        }
        for (int var98 = 0; var98 < var15; var98++) {
            var19[var98].field976 = var2.method226(255);
        }
        for (int var99 = 0; var99 < var15; var99++) {
            class51 var100 = var19[var99];
            if (var100.field980 != null) {
                var100.field974 = var2.method226(255);
            }
            if (var100.field985 != null) {
                var100.field991 = var2.method226(255);
            }
            if (var100.field976 > 0) {
                var100.field986 = var2.method226(255);
            }
        }
        for (int var101 = 0; var101 < var15; var101++) {
            var19[var101].field987 = var2.method226(255);
        }
        for (int var102 = 0; var102 < var15; var102++) {
            class51 var103 = var19[var102];
            if (var103.field987 > 0) {
                var103.field977 = var2.method226(255);
            }
        }
        for (int var104 = 0; var104 < var15; var104++) {
            class51 var105 = var19[var104];
            if (var105.field977 > 0) {
                var105.field989 = var2.method226(255);
            }
        }
    }
}
