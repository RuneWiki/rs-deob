import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class5 extends class88 {

    @OriginalMember(owner = "client!ad", name = "C", descriptor = "[B")
    public byte[] field96;

    @OriginalMember(owner = "client!ad", name = "F", descriptor = "[B")
    public byte[] field99;

    @OriginalMember(owner = "client!ad", name = "T", descriptor = "[Ljb;")
    public class64[] field112;

    @OriginalMember(owner = "client!ad", name = "A", descriptor = "[B")
    public byte[] field94;

    @OriginalMember(owner = "client!ad", name = "H", descriptor = "[I")
    private int[] field101;

    @OriginalMember(owner = "client!ad", name = "I", descriptor = "[Lgf;")
    public class48[] field102;

    @OriginalMember(owner = "client!ad", name = "w", descriptor = "[S")
    public short[] field90;

    @OriginalMember(owner = "client!ad", name = "Q", descriptor = "I")
    public int field109;

    @OriginalMember(owner = "client!ad", name = "z", descriptor = "Ltd;")
    public static class136 field93 = class145.method1172("<col=40ff00>", 45);

    @OriginalMember(owner = "client!ad", name = "M", descriptor = "I")
    public static int field105 = 0;

    @OriginalMember(owner = "client!ad", name = "J", descriptor = "Ltd;")
    private static class136 field103 = class145.method1172("slide:", 45);

    @OriginalMember(owner = "client!ad", name = "O", descriptor = "Ltd;")
    private static class136 field107 = class145.method1172("Click to switch", 45);

    @OriginalMember(owner = "client!ad", name = "R", descriptor = "I")
    public static int field110 = 2;

    @OriginalMember(owner = "client!ad", name = "x", descriptor = "I")
    public static int field91 = -1;

    @OriginalMember(owner = "client!ad", name = "U", descriptor = "I")
    public static int field113 = 0;

    @OriginalMember(owner = "client!ad", name = "K", descriptor = "Ltd;")
    public static class136 field104 = field107;

    @OriginalMember(owner = "client!ad", name = "V", descriptor = "Ltd;")
    public static class136 field114 = field103;

    @OriginalMember(owner = "client!ad", name = "S", descriptor = "Ltd;")
    public static class136 field111 = class145.method1172("null", 45);

    @OriginalMember(owner = "client!ad", name = "W", descriptor = "Ltd;")
    public static class136 field115 = field103;

    @OriginalMember(owner = "client!ad", name = "G", descriptor = "I")
    public static int field100;

    @OriginalMember(owner = "client!ad", name = "N", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!ad", name = "P", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!ad", name = "X", descriptor = "I")
    public static int field116;

    @OriginalMember(owner = "client!ad", name = "v", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!ad", name = "y", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!ad", name = "B", descriptor = "I")
    public static int field95;

    @OriginalMember(owner = "client!ad", name = "D", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!ad", name = "E", descriptor = "I")
    public static int field98;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)V")
    public static final void method28(int arg0) {
        field116++;
        int var1 = 95 % ((arg0 + 35) / 43);
        for (class151 var2 = (class151) class86.field2022.method512(0); var2 != null; var2 = (class151) class86.field2022.method520((byte) 73)) {
            if (class62.field1331 != var2.field3461 || var2.field3447) {
                var2.method674(32);
            } else if (var2.field3469 <= class44.field1013) {
                var2.method1194(class41.field967, false);
                if (var2.field3447) {
                    var2.method674(32);
                } else {
                    class146.field3366.method743(var2.field3461, var2.field3468, var2.field3452, var2.field3446, 60, var2, 0, -1, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "(I)V")
    public static void method29(int arg0) {
        field104 = null;
        field111 = null;
        field93 = null;
        field103 = null;
        field114 = null;
        field115 = null;
        if (arg0 == 0) {
            field107 = null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "([ILfd;B[B)Z")
    public final boolean method30(int[] arg0, class40 arg1, byte arg2, byte[] arg3) {
        field106++;
        boolean var5 = true;
        int var6 = 0;
        class48 var7 = null;
        if (arg2 > -6) {
            method28(-43);
        }
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg3 == null || arg3[var8] != 0) {
                int var9 = this.field101[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg1.method339(arg0, var9 >> 2, -2);
                        } else {
                            var7 = arg1.method337(var9 >> 2, 34, arg0);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field102[var8] = var7;
                        this.field101[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(Z)V")
    public final void method31(boolean arg0) {
        this.field101 = null;
        if (arg0) {
            this.field109 = 92;
        }
        field98++;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(B)V")
    public static final void method32(byte arg0) {
        field92++;
        class153.method1202((byte) -86);
        class31.method254(256);
        class107.method849(108);
        class53.method428(-104);
        class51.method423(0);
        class147.method1183(128);
        class88.method672(32);
        class63.method474((byte) -122);
        class53.method426(2047);
        client.method174(12812);
        class73.method531(false);
        class119.method934(-115);
        ((class2) class103.field2444).method18(false);
        class9.field165.method1165((byte) -73);
        class146.field3370.method653(-2);
        class56.field1278.method653(-2);
        class31.field683.method653(-2);
        class147.field3413.method653(-2);
        class122.field2844.method653(-2);
        class39.field921.method653(-2);
        class121.field2757.method653(-2);
        class143.field3328.method653(-2);
        class108.field2537.method653(-2);
        class133.field3142.method653(-2);
        int var1 = -81 / ((arg0 + 48) / 49);
        class28.field625.method653(-2);
        class47.field1077.method653(-2);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILke;)Z")
    public static final boolean method33(int arg0, class74 arg1) {
        field108++;
        int var2 = arg1.field1630;
        if (var2 == 205) {
            class132.field3120 = 250;
            return true;
        } else if (arg0 < 22) {
            return false;
        } else {
            if (var2 >= 300 && var2 <= 313) {
                int var3 = (var2 - 300) / 2;
                int var4 = var2 & 0x1;
                class133.field3131.method807(var4 == 1, (byte) -113, var3);
            }
            if (var2 >= 314 && var2 <= 323) {
                int var5 = (var2 - 314) / 2;
                int var6 = var2 & 0x1;
                class133.field3131.method796(var6 == 1, var5, -13);
            }
            if (var2 == 324) {
                class133.field3131.method809(false, -1);
            }
            if (var2 == 325) {
                class133.field3131.method809(true, -1);
            }
            if (var2 == 326) {
                field100++;
                class15.field304.method867(123, true);
                class133.field3131.method798(1, class15.field304);
                return true;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "()V")
    public class5() {
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "([B)V")
    public class5(byte[] arg0) {
        this.field96 = new byte[128];
        this.field99 = new byte[128];
        this.field112 = new class64[128];
        this.field94 = new byte[128];
        this.field101 = new int[128];
        this.field102 = new class48[128];
        this.field90 = new short[128];
        int var2 = 0;
        class127 var3 = new class127(arg0);
        while (var3.field2960[var3.field2995 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method996(4);
        }
        var2++;
        var3.field2995++;
        int var6 = 0;
        int var7 = var3.field2995;
        var3.field2995 += var2;
        while (var3.field2960[var3.field2995 + var6] != 0) {
            var6++;
        }
        byte[] var8 = new byte[var6];
        for (int var9 = 0; var9 < var6; var9++) {
            var8[var9] = var3.method996(4);
        }
        var3.field2995++;
        var6++;
        int var10 = var3.field2995;
        var3.field2995 += var6;
        int var11;
        for (var11 = 0; var3.field2960[var3.field2995 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var3.method996(4);
        }
        var11++;
        var3.field2995++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 <= 1) {
            var15 = var11;
        } else {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var105 = var3.method1011(17);
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
        class64[] var18 = new class64[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class64 var102 = var18[var19] = new class64();
            int var103 = var3.method1011(71);
            if (var103 > 0) {
                var102.field1369 = new byte[var103 * 2];
            }
            int var104 = var3.method1011(86);
            if (var104 > 0) {
                var102.field1372 = new byte[var104 * 2 + 2];
                var102.field1372[1] = 64;
            }
        }
        int var20 = var3.method1011(83);
        int var21 = 0;
        byte[] var22 = var20 <= 0 ? null : new byte[var20 * 2];
        int var23 = var3.method1011(123);
        byte[] var24 = var23 > 0 ? new byte[var23 * 2] : null;
        while (var3.field2960[var3.field2995 + var21] != 0) {
            var21++;
        }
        byte[] var25 = new byte[var21];
        for (int var26 = 0; var26 < var21; var26++) {
            var25[var26] = var3.method996(4);
        }
        int var27 = 0;
        var21++;
        var3.field2995++;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var3.method1011(60);
            this.field90[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var3.method1011(57);
            this.field90[var30] = (short) (this.field90[var30] + (var29 << 8));
        }
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            if (var31 == 0) {
                if (var25.length > var32) {
                    var31 = var25[var32++];
                } else {
                    var31 = -1;
                }
                var33 = var3.method1041((byte) 119);
            }
            var31--;
            this.field90[var34] = (short) (this.field90[var34] + (class154.method1207(2, var33 - 1) << 14));
            this.field101[var34] = var33;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field101[var38] != 0) {
                if (var37 == 0) {
                    var36 = var3.field2960[var7++] - 1;
                    if (var4.length > var35) {
                        var37 = var4[var35++];
                    } else {
                        var37 = -1;
                    }
                }
                var37--;
                this.field99[var38] = (byte) var36;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field101[var42] != 0) {
                if (var40 == 0) {
                    if (var41 >= var8.length) {
                        var40 = -1;
                    } else {
                        var40 = var8[var41++];
                    }
                    var39 = var3.field2960[var10++] + 16 << 2;
                }
                this.field94[var42] = (byte) var39;
                var40--;
            }
        }
        int var43 = 0;
        int var44 = 0;
        class64 var45 = null;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field101[var46] != 0) {
                if (var43 == 0) {
                    var45 = var18[var14[var44]];
                    if (var12.length > var44) {
                        var43 = var12[var44++];
                    } else {
                        var43 = -1;
                    }
                }
                this.field112[var46] = var45;
                var43--;
            }
        }
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (var47 == 0) {
                if (var25.length <= var48) {
                    var47 = -1;
                } else {
                    var47 = var25[var48++];
                }
                if (this.field101[var50] > 0) {
                    var49 = var3.method1011(54) + 1;
                }
            }
            var47--;
            this.field96[var50] = (byte) var49;
        }
        this.field109 = var3.method1011(23) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class64 var99 = var18[var51];
            if (var99.field1369 != null) {
                for (int var100 = 1; var100 < var99.field1369.length; var100 += 2) {
                    var99.field1369[var100] = var3.method996(4);
                }
            }
            if (var99.field1372 != null) {
                for (int var101 = 3; var101 < var99.field1372.length - 2; var101 += 2) {
                    var99.field1372[var101] = var3.method996(4);
                }
            }
        }
        if (var22 != null) {
            for (int var52 = 1; var52 < var22.length; var52 += 2) {
                var22[var52] = var3.method996(4);
            }
        }
        if (var24 != null) {
            for (int var53 = 1; var53 < var24.length; var53 += 2) {
                var24[var53] = var3.method996(4);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class64 var96 = var18[var54];
            if (var96.field1372 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field1372.length; var98 += 2) {
                    var97 -= -var3.method1011(35) - 1;
                    var96.field1372[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class64 var93 = var18[var55];
            if (var93.field1369 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field1369.length; var95 += 2) {
                    var94 -= -var3.method1011(126) - 1;
                    var93.field1369[var95] = (byte) var94;
                }
            }
        }
        if (var22 != null) {
            int var56 = var3.method1011(62);
            var22[0] = (byte) var56;
            for (int var57 = 2; var57 < var22.length; var57 += 2) {
                var56 = var3.method1011(90) + var56 + 1;
                var22[var57] = (byte) var56;
            }
            byte var58 = var22[0];
            byte var59 = var22[1];
            for (int var60 = 0; var60 < var58; var60++) {
                this.field96[var60] = (byte) (this.field96[var60] * var59 + 32 >> 6);
            }
            for (int var61 = 2; var61 < var22.length; var61 += 2) {
                byte var64 = var22[var61];
                byte var65 = var22[var61 + 1];
                int var66 = (var64 - var58) / 2 + (var64 - var58) * var59;
                for (int var67 = var58; var67 < var64; var67++) {
                    int var68 = class24.method217(var66, var64 - var58, 0);
                    this.field96[var67] = (byte) (this.field96[var67] * var68 + 32 >> 6);
                    var66 += var65 - var59;
                }
                var58 = var64;
                var59 = var65;
            }
            Object var62 = null;
            for (int var63 = var58; var63 < 128; var63++) {
                this.field96[var63] = (byte) (this.field96[var63] * var59 + 32 >> 6);
            }
        }
        if (var24 != null) {
            int var69 = var3.method1011(108);
            var24[0] = (byte) var69;
            for (int var70 = 2; var70 < var24.length; var70 += 2) {
                var69 = var69 + var3.method1011(39) + 1;
                var24[var70] = (byte) var69;
            }
            int var71 = var24[1] << 1;
            byte var72 = var24[0];
            for (int var73 = 0; var73 < var72; var73++) {
                int var84 = (this.field94[var73] & 0xFF) + var71;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field94[var73] = (byte) var84;
            }
            int var74 = 2;
            while (var24.length > var74) {
                int var78 = var24[var74 + 1] << 1;
                byte var79 = var24[var74];
                int var80 = (var79 - var72) / 2 + (var79 - var72) * var71;
                var74 += 2;
                for (int var81 = var72; var81 < var79; var81++) {
                    int var82 = class24.method217(var80, var79 - var72, 0);
                    int var83 = (this.field94[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    var80 += var78 - var71;
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    this.field94[var81] = (byte) var83;
                }
                var72 = var79;
                var71 = var78;
            }
            for (int var75 = var72; var75 < 128; var75++) {
                int var77 = (this.field94[var75] & 0xFF) + var71;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field94[var75] = (byte) var77;
            }
            Object var76 = null;
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field1361 = var3.method1011(95);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class64 var92 = var18[var86];
            if (var92.field1369 != null) {
                var92.field1392 = var3.method1011(101);
            }
            if (var92.field1372 != null) {
                var92.field1375 = var3.method1011(51);
            }
            if (var92.field1361 > 0) {
                var92.field1373 = var3.method1011(36);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field1391 = var3.method1011(120);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class64 var91 = var18[var88];
            if (var91.field1391 > 0) {
                var91.field1377 = var3.method1011(39);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class64 var90 = var18[var89];
            if (var90.field1377 > 0) {
                var90.field1371 = var3.method1011(120);
            }
        }
        if (class49.field1133) {
        }
    }
}
