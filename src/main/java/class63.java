import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class63 extends class207 {

    @OriginalMember(owner = "client!jf", name = "E", descriptor = "[S")
    public short[] field1250;

    @OriginalMember(owner = "client!jf", name = "G", descriptor = "[B")
    public byte[] field1252;

    @OriginalMember(owner = "client!jf", name = "p", descriptor = "[B")
    public byte[] field1235;

    @OriginalMember(owner = "client!jf", name = "n", descriptor = "[Lc;")
    public class104[] field1233;

    @OriginalMember(owner = "client!jf", name = "B", descriptor = "[B")
    public byte[] field1247;

    @OriginalMember(owner = "client!jf", name = "t", descriptor = "[I")
    private int[] field1239;

    @OriginalMember(owner = "client!jf", name = "F", descriptor = "[Lhe;")
    public class19[] field1251;

    @OriginalMember(owner = "client!jf", name = "q", descriptor = "I")
    public int field1236;

    @OriginalMember(owner = "client!jf", name = "s", descriptor = "Ljd;")
    private static class86 field1238 = class122.method868("en", true);

    @OriginalMember(owner = "client!jf", name = "C", descriptor = "Ljd;")
    public static class86 field1248 = class122.method868("Lade Benutzeroberfl-=che )2 ", true);

    @OriginalMember(owner = "client!jf", name = "z", descriptor = "Ljd;")
    private static class86 field1245 = class122.method868(")3en", true);

    @OriginalMember(owner = "client!jf", name = "u", descriptor = "Ljd;")
    private static class86 field1240 = class122.method868("de", true);

    @OriginalMember(owner = "client!jf", name = "w", descriptor = "Ljd;")
    private static class86 field1242 = class122.method868(")3de", true);

    @OriginalMember(owner = "client!jf", name = "r", descriptor = "Ljd;")
    private static class86 field1237 = class122.method868("fr", true);

    @OriginalMember(owner = "client!jf", name = "D", descriptor = "Ljd;")
    private static class86 field1249 = class122.method868(")3fr", true);

    @OriginalMember(owner = "client!jf", name = "y", descriptor = "[Ljd;")
    private static class86[] field1244 = new class86[] { field1245, field1242, field1249 };

    @OriginalMember(owner = "client!jf", name = "o", descriptor = "[Ljd;")
    public static class86[] field1234 = new class86[] { field1238, field1240, field1237 };

    @OriginalMember(owner = "client!jf", name = "v", descriptor = "I")
    public static int field1241;

    @OriginalMember(owner = "client!jf", name = "x", descriptor = "I")
    public static int field1243;

    @OriginalMember(owner = "client!jf", name = "A", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lle;[I[BZ)Z")
    public final boolean method449(class42 arg0, int[] arg1, byte[] arg2, boolean arg3) {
        if (arg3) {
            this.field1252 = null;
        }
        field1241++;
        class19 var5 = null;
        boolean var6 = true;
        int var7 = 0;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg2 == null || arg2[var8] != 0) {
                int var9 = this.field1239[var8];
                if (var9 != 0) {
                    if (var7 != var9) {
                        var7 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var5 = arg0.method343(var9 >> 2, arg1, (byte) -108);
                        } else {
                            var5 = arg0.method340(arg1, var9 >> 2, -91);
                        }
                        if (var5 == null) {
                            var6 = false;
                        }
                    }
                    if (var5 != null) {
                        this.field1251[var8] = var5;
                        this.field1239[var8] = 0;
                    }
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "(I)V")
    public static void method450(int arg0) {
        field1244 = null;
        field1240 = null;
        field1242 = null;
        if (arg0 != 0) {
            return;
        }
        field1249 = null;
        field1238 = null;
        field1248 = null;
        field1237 = null;
        field1245 = null;
        field1234 = null;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Z)V")
    public final void method451(boolean arg0) {
        field1243++;
        if (arg0) {
            field1242 = null;
        }
        this.field1239 = null;
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "()V")
    public class63() {
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "([B)V")
    public class63(byte[] arg0) {
        this.field1250 = new short[128];
        this.field1252 = new byte[128];
        this.field1235 = new byte[128];
        this.field1233 = new class104[128];
        this.field1247 = new byte[128];
        this.field1239 = new int[128];
        this.field1251 = new class19[128];
        int var2 = 0;
        class200 var3 = new class200(arg0);
        while (var3.field3547[var3.field3565 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method1412((byte) 85);
        }
        var2++;
        var3.field3565++;
        int var6 = var3.field3565;
        var3.field3565 += var2;
        int var7;
        for (var7 = 0; var3.field3547[var3.field3565 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method1412((byte) 115);
        }
        var7++;
        var3.field3565++;
        int var10 = 0;
        int var11 = var3.field3565;
        var3.field3565 += var7;
        while (var3.field3547[var3.field3565 + var10] != 0) {
            var10++;
        }
        byte[] var12 = new byte[var10];
        for (int var13 = 0; var13 < var10; var13++) {
            var12[var13] = var3.method1412((byte) 80);
        }
        var10++;
        byte[] var14 = new byte[var10];
        var3.field3565++;
        int var15;
        if (var10 <= 1) {
            var15 = var10;
        } else {
            var15 = 2;
            var14[1] = 1;
            int var16 = 1;
            for (int var17 = 2; var17 < var10; var17++) {
                int var105 = var3.method1408((byte) -18);
                if (var105 == 0) {
                    var16 = var15++;
                } else {
                    if (var105 <= var16) {
                        var105--;
                    }
                    var16 = var105;
                }
                var14[var17] = (byte) var16;
            }
        }
        class104[] var18 = new class104[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class104 var102 = var18[var19] = new class104();
            int var103 = var3.method1408((byte) -56);
            if (var103 > 0) {
                var102.field1987 = new byte[var103 * 2];
            }
            int var104 = var3.method1408((byte) -120);
            if (var104 > 0) {
                var102.field1996 = new byte[var104 * 2 + 2];
                var102.field1996[1] = 64;
            }
        }
        int var20 = var3.method1408((byte) -34);
        byte[] var21 = var20 > 0 ? new byte[var20 * 2] : null;
        int var22 = 0;
        int var23 = var3.method1408((byte) -64);
        while (var3.field3547[var3.field3565 + var22] != 0) {
            var22++;
        }
        byte[] var24 = new byte[var22];
        for (int var25 = 0; var25 < var22; var25++) {
            var24[var25] = var3.method1412((byte) 75);
        }
        byte[] var26 = var23 <= 0 ? null : new byte[var23 * 2];
        var22++;
        var3.field3565++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var3.method1408((byte) -42);
            this.field1250[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var3.method1408((byte) -50);
            this.field1250[var30] = (short) (this.field1250[var30] + (var29 << 8));
        }
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            if (var31 == 0) {
                if (var33 < var24.length) {
                    var31 = var24[var33++];
                } else {
                    var31 = -1;
                }
                var32 = var3.method1387((byte) -43);
            }
            this.field1250[var34] = (short) (this.field1250[var34] + class1.method5(32768, var32 - 1 << 14));
            var31--;
            this.field1239[var34] = var32;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field1239[var38] != 0) {
                if (var37 == 0) {
                    if (var35 >= var4.length) {
                        var37 = -1;
                    } else {
                        var37 = var4[var35++];
                    }
                    var36 = var3.field3547[var6++] - 1;
                }
                var37--;
                this.field1252[var38] = (byte) var36;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field1239[var42] != 0) {
                if (var39 == 0) {
                    if (var8.length <= var41) {
                        var39 = -1;
                    } else {
                        var39 = var8[var41++];
                    }
                    var40 = var3.field3547[var11++] + 16 << 2;
                }
                this.field1247[var42] = (byte) var40;
                var39--;
            }
        }
        int var43 = 0;
        class104 var44 = null;
        int var45 = 0;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field1239[var46] != 0) {
                if (var43 == 0) {
                    var44 = var18[var14[var45]];
                    if (var12.length <= var45) {
                        var43 = -1;
                    } else {
                        var43 = var12[var45++];
                    }
                }
                this.field1233[var46] = var44;
                var43--;
            }
        }
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (var47 == 0) {
                if (var24.length <= var49) {
                    var47 = -1;
                } else {
                    var47 = var24[var49++];
                }
                if (this.field1239[var50] > 0) {
                    var48 = var3.method1408((byte) -56) + 1;
                }
            }
            this.field1235[var50] = (byte) var48;
            var47--;
        }
        this.field1236 = var3.method1408((byte) -113) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class104 var99 = var18[var51];
            if (var99.field1987 != null) {
                for (int var100 = 1; var100 < var99.field1987.length; var100 += 2) {
                    var99.field1987[var100] = var3.method1412((byte) 115);
                }
            }
            if (var99.field1996 != null) {
                for (int var101 = 3; var101 < (var99.field1996.length - 2); var101 += 2) {
                    var99.field1996[var101] = var3.method1412((byte) 83);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var3.method1412((byte) 102);
            }
        }
        if (var26 != null) {
            for (int var53 = 1; var53 < var26.length; var53 += 2) {
                var26[var53] = var3.method1412((byte) 104);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class104 var96 = var18[var54];
            if (var96.field1996 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field1996.length; var98 += 2) {
                    var97 = var97 + var3.method1408((byte) -78) + 1;
                    var96.field1996[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class104 var93 = var18[var55];
            if (var93.field1987 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field1987.length; var95 += 2) {
                    var94 = var3.method1408((byte) -128) + var94 + 1;
                    var93.field1987[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var3.method1408((byte) -128);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 = var3.method1408((byte) -37) + var56 + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[0];
            byte var59 = var21[1];
            for (int var60 = 0; var60 < var58; var60++) {
                this.field1235[var60] = (byte) (this.field1235[var60] * var59 + 32 >> 6);
            }
            int var61 = 2;
            while (var21.length > var61) {
                byte var64 = var21[var61];
                byte var65 = var21[var61 + 1];
                int var66 = (var64 - var58) / 2 + (var64 - var58) * var59;
                var61 += 2;
                for (int var67 = var58; var67 < var64; var67++) {
                    int var68 = class205.method1465(var66, 1687046079, var64 - var58);
                    this.field1235[var67] = (byte) (this.field1235[var67] * var68 + 32 >> 6);
                    var66 += var65 - var59;
                }
                var59 = var65;
                var58 = var64;
            }
            Object var62 = null;
            for (int var63 = var58; var63 < 128; var63++) {
                this.field1235[var63] = (byte) (this.field1235[var63] * var59 + 32 >> 6);
            }
        }
        if (var26 != null) {
            int var69 = var3.method1408((byte) -105);
            var26[0] = (byte) var69;
            for (int var70 = 2; var70 < var26.length; var70 += 2) {
                var69 = var3.method1408((byte) -20) + (var69 + 1);
                var26[var70] = (byte) var69;
            }
            byte var71 = var26[0];
            int var72 = var26[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field1247[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field1247[var73] = (byte) var84;
            }
            int var74 = 2;
            while (var74 < var26.length) {
                byte var78 = var26[var74];
                int var79 = var26[var74 + 1] << 1;
                int var80 = (var78 - var71) / 2 + (var78 - var71) * var72;
                for (int var81 = var71; var81 < var78; var81++) {
                    int var82 = class205.method1465(var80, 1687046079, var78 - var71);
                    var80 += var79 - var72;
                    int var83 = (this.field1247[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    this.field1247[var81] = (byte) var83;
                }
                var74 += 2;
                var71 = var78;
                var72 = var79;
            }
            for (int var75 = var71; var75 < 128; var75++) {
                int var77 = (this.field1247[var75] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field1247[var75] = (byte) var77;
            }
            Object var76 = null;
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field1990 = var3.method1408((byte) -61);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class104 var92 = var18[var86];
            if (var92.field1987 != null) {
                var92.field2000 = var3.method1408((byte) -100);
            }
            if (var92.field1996 != null) {
                var92.field1982 = var3.method1408((byte) -76);
            }
            if (var92.field1990 > 0) {
                var92.field1985 = var3.method1408((byte) -66);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field1986 = var3.method1408((byte) -49);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class104 var91 = var18[var88];
            if (var91.field1986 > 0) {
                var91.field1997 = var3.method1408((byte) -70);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class104 var90 = var18[var89];
            if (var90.field1997 > 0) {
                var90.field1995 = var3.method1408((byte) -94);
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V")
    public static final void method452(byte arg0) {
        class20.field528 = null;
        class69.field1398 = null;
        class159.field2977 = null;
        class60.field1205 = null;
        class241.field4332 = null;
        class239.field4310 = null;
        class116.field2207 = null;
        field1246++;
        class46.field1024 = null;
        class87.field1734 = null;
        class177.field3211 = null;
        class20.field518 = null;
        class265.field4684 = 0;
        class218.field3919.method1739(true);
        class66.field1302 = null;
        class271.field4755 = null;
        class221.field3982 = null;
        class136.field2605 = null;
        class246.field4376 = null;
        class105.field2018 = null;
        class219.field3946 = null;
        class56.field1142 = null;
        if (arg0 <= 52) {
            method452((byte) -109);
        }
        class106.field2030 = null;
        class162.field3035 = null;
    }
}
