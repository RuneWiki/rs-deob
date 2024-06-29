import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class19 extends class20 {

    @OriginalMember(owner = "client!cd", name = "K", descriptor = "[Lve;")
    public class151[] field348;

    @OriginalMember(owner = "client!cd", name = "I", descriptor = "[B")
    public byte[] field346;

    @OriginalMember(owner = "client!cd", name = "F", descriptor = "[Lu;")
    public class139[] field343;

    @OriginalMember(owner = "client!cd", name = "W", descriptor = "[I")
    private int[] field360;

    @OriginalMember(owner = "client!cd", name = "G", descriptor = "[B")
    public byte[] field344;

    @OriginalMember(owner = "client!cd", name = "N", descriptor = "[S")
    public short[] field351;

    @OriginalMember(owner = "client!cd", name = "P", descriptor = "[B")
    public byte[] field353;

    @OriginalMember(owner = "client!cd", name = "U", descriptor = "I")
    public int field358;

    @OriginalMember(owner = "client!cd", name = "B", descriptor = "[[I")
    public static int[][] field339 = new int[5][5000];

    @OriginalMember(owner = "client!cd", name = "S", descriptor = "I")
    public static int field356 = 0;

    @OriginalMember(owner = "client!cd", name = "R", descriptor = "Lsc;")
    public static class128 field355 = class129.method1017(false, "Angreifen");

    @OriginalMember(owner = "client!cd", name = "L", descriptor = "I")
    public static int field349 = 0;

    @OriginalMember(owner = "client!cd", name = "Q", descriptor = "Lsc;")
    private static class128 field354 = class129.method1017(false, "To create a new account you need to");

    @OriginalMember(owner = "client!cd", name = "O", descriptor = "Lsc;")
    public static class128 field352 = field354;

    @OriginalMember(owner = "client!cd", name = "Y", descriptor = "Lsc;")
    private static class128 field362 = class129.method1017(false, "Examine");

    @OriginalMember(owner = "client!cd", name = "T", descriptor = "Lsc;")
    public static class128 field357 = field362;

    @OriginalMember(owner = "client!cd", name = "J", descriptor = "Z")
    public static boolean field347 = false;

    @OriginalMember(owner = "client!cd", name = "C", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!cd", name = "D", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "client!cd", name = "E", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!cd", name = "H", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!cd", name = "M", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!cd", name = "V", descriptor = "I")
    public static int field359;

    @OriginalMember(owner = "client!cd", name = "Z", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "client!cd", name = "X", descriptor = "[I")
    public static int[] field361;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZZI)I")
    public static final int method166(boolean arg0, boolean arg1, int arg2) {
        int var3 = 59 / ((-arg2 - 45) / 39);
        field342++;
        int var4 = 0;
        if (arg0) {
            var4 += class20.field375 + class99.field2297;
        }
        if (arg1) {
            var4 += class127.field2877 + class117.field2642;
        }
        return var4;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "([ILp;B[B)Z")
    public final boolean method167(int[] arg0, class104 arg1, byte arg2, byte[] arg3) {
        field363++;
        boolean var5 = true;
        int var6 = 0;
        class139 var7 = null;
        int var8 = 0;
        if (arg2 != -67) {
            field356 = 111;
        }
        while (var8 < 128) {
            if (arg3 == null || arg3[var8] != 0) {
                int var9 = this.field360[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg1.method775(arg0, (byte) 109, var9 >> 2);
                        } else {
                            var7 = arg1.method781(arg0, (byte) 29, var9 >> 2);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field343[var8] = var7;
                        this.field360[var8] = 0;
                    }
                }
            }
            var8++;
        }
        return var5;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)V")
    public final void method168(int arg0) {
        this.field360 = null;
        field350++;
        if (arg0 != 128) {
            method169((byte) 94, 48, 124, 86, 5);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(BIIII)V")
    public static final void method169(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = 0; var5 < class117.field2657; var5++) {
            if (arg1 < class35.field652[var5] + class2.field16[var5] && class35.field652[var5] < arg1 + arg2 && class18.field336[var5] + class122.field2772[var5] > arg4 && class122.field2772[var5] < arg3 + arg4) {
                class153.field3517[var5] = true;
            }
        }
        field359++;
        if (arg0 != -58) {
            method170(95);
        }
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(I)V")
    public static void method170(int arg0) {
        field355 = null;
        field357 = null;
        field352 = null;
        field339 = null;
        field362 = null;
        field361 = null;
        field354 = null;
        if (arg0 <= 22) {
            method169((byte) -33, 62, -30, -111, 21);
        }
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "()V")
    public class19() {
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "([B)V")
    public class19(byte[] arg0) {
        this.field348 = new class151[128];
        this.field346 = new byte[128];
        this.field343 = new class139[128];
        this.field360 = new int[128];
        this.field344 = new byte[128];
        int var2 = 0;
        this.field351 = new short[128];
        this.field353 = new byte[128];
        class86 var3 = new class86(arg0);
        while (var3.field1920[var3.field1924 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method667(-1);
        }
        var2++;
        int var6 = 0;
        var3.field1924++;
        int var7 = var3.field1924;
        var3.field1924 += var2;
        while (var3.field1920[var3.field1924 + var6] != 0) {
            var6++;
        }
        byte[] var8 = new byte[var6];
        for (int var9 = 0; var9 < var6; var9++) {
            var8[var9] = var3.method667(-1);
        }
        var3.field1924++;
        var6++;
        int var10 = 0;
        int var11 = var3.field1924;
        var3.field1924 += var6;
        while (var3.field1920[var3.field1924 + var10] != 0) {
            var10++;
        }
        byte[] var12 = new byte[var10];
        for (int var13 = 0; var13 < var10; var13++) {
            var12[var13] = var3.method667(-1);
        }
        var10++;
        var3.field1924++;
        byte[] var14 = new byte[var10];
        int var15;
        if (var10 > 1) {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;
            for (int var17 = 2; var17 < var10; var17++) {
                int var18 = var3.method646(-15447);
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
        } else {
            var15 = var10;
        }
        class151[] var19 = new class151[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class151 var103 = var19[var20] = new class151();
            int var104 = var3.method646(-15447);
            if (var104 > 0) {
                var103.field3485 = new byte[var104 * 2];
            }
            int var105 = var3.method646(-15447);
            if (var105 > 0) {
                var103.field3466 = new byte[var105 * 2 + 2];
                var103.field3466[1] = 64;
            }
        }
        int var21 = var3.method646(-15447);
        byte[] var22 = var21 > 0 ? new byte[var21 * 2] : null;
        int var23 = var3.method646(-15447);
        byte[] var24 = var23 <= 0 ? null : new byte[var23 * 2];
        int var25;
        for (var25 = 0; var3.field1920[var3.field1924 + var25] != 0; var25++) {
        }
        byte[] var26 = new byte[var25];
        for (int var27 = 0; var27 < var25; var27++) {
            var26[var27] = var3.method667(-1);
        }
        var25++;
        var3.field1924++;
        int var28 = 0;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var3.method646(-15447);
            this.field351[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var3.method646(-15447);
            this.field351[var31] = (short) (this.field351[var31] + (var30 << 8));
        }
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        for (int var35 = 0; var35 < 128; var35++) {
            if (var32 == 0) {
                if (var26.length <= var33) {
                    var32 = -1;
                } else {
                    var32 = var26[var33++];
                }
                var34 = var3.method625((byte) -120);
            }
            this.field351[var35] = (short) (this.field351[var35] + (class25.method224(var34 - 1, 2) << 14));
            var32--;
            this.field360[var35] = var34;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field360[var39] != 0) {
                if (var37 == 0) {
                    if (var4.length <= var36) {
                        var37 = -1;
                    } else {
                        var37 = var4[var36++];
                    }
                    var38 = var3.field1920[var7++] - 1;
                }
                this.field346[var39] = (byte) var38;
                var37--;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field360[var43] != 0) {
                if (var40 == 0) {
                    if (var8.length > var41) {
                        var40 = var8[var41++];
                    } else {
                        var40 = -1;
                    }
                    var42 = var3.field1920[var11++] + 16 << 2;
                }
                var40--;
                this.field353[var43] = (byte) var42;
            }
        }
        class151 var44 = null;
        int var45 = 0;
        int var46 = 0;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field360[var47] != 0) {
                if (var45 == 0) {
                    var44 = var19[var14[var46]];
                    if (var46 < var12.length) {
                        var45 = var12[var46++];
                    } else {
                        var45 = -1;
                    }
                }
                this.field348[var47] = var44;
                var45--;
            }
        }
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        for (int var51 = 0; var51 < 128; var51++) {
            if (var49 == 0) {
                if (var48 >= var26.length) {
                    var49 = -1;
                } else {
                    var49 = var26[var48++];
                }
                if (this.field360[var51] > 0) {
                    var50 = var3.method646(-15447) + 1;
                }
            }
            this.field344[var51] = (byte) var50;
            var49--;
        }
        this.field358 = var3.method646(-15447) + 1;
        for (int var52 = 0; var52 < var15; var52++) {
            class151 var100 = var19[var52];
            if (var100.field3485 != null) {
                for (int var101 = 1; var101 < var100.field3485.length; var101 += 2) {
                    var100.field3485[var101] = var3.method667(-1);
                }
            }
            if (var100.field3466 != null) {
                for (int var102 = 3; var102 < var100.field3466.length - 2; var102 += 2) {
                    var100.field3466[var102] = var3.method667(-1);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var3.method667(-1);
            }
        }
        if (var24 != null) {
            for (int var54 = 1; var54 < var24.length; var54 += 2) {
                var24[var54] = var3.method667(-1);
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class151 var97 = var19[var55];
            if (var97.field3466 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field3466.length; var99 += 2) {
                    var98 += var3.method646(-15447) + 1;
                    var97.field3466[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var15; var56++) {
            class151 var94 = var19[var56];
            if (var94.field3485 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field3485.length; var96 += 2) {
                    var95 += var3.method646(-15447) + 1;
                    var94.field3485[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var3.method646(-15447);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 = var57 + var3.method646(-15447) + 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[0];
            byte var60 = var22[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field344[var61] = (byte) (this.field344[var61] * var60 + 32 >> 6);
            }
            for (int var62 = 2; var62 < var22.length; var62 += 2) {
                byte var65 = var22[var62 + 1];
                byte var66 = var22[var62];
                int var67 = (var66 - var59) / 2 + (var66 - var59) * var60;
                for (int var68 = var59; var68 < var66; var68++) {
                    int var69 = class87.method682(var66 - var59, -14969, var67);
                    this.field344[var68] = (byte) (this.field344[var68] * var69 + 32 >> 6);
                    var67 += var65 - var60;
                }
                var60 = var65;
                var59 = var66;
            }
            for (int var63 = var59; var63 < 128; var63++) {
                this.field344[var63] = (byte) (this.field344[var63] * var60 + 32 >> 6);
            }
            Object var64 = null;
        }
        if (var24 != null) {
            int var70 = var3.method646(-15447);
            var24[0] = (byte) var70;
            for (int var71 = 2; var71 < var24.length; var71 += 2) {
                var70 += var3.method646(-15447) + 1;
                var24[var71] = (byte) var70;
            }
            int var72 = var24[1] << 1;
            byte var73 = var24[0];
            for (int var74 = 0; var74 < var73; var74++) {
                int var85 = (this.field353[var74] & 0xFF) + var72;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field353[var74] = (byte) var85;
            }
            for (int var75 = 2; var75 < var24.length; var75 += 2) {
                byte var79 = var24[var75];
                int var80 = (var79 - var73) / 2 + (var79 - var73) * var72;
                int var81 = var24[var75 + 1] << 1;
                for (int var82 = var73; var82 < var79; var82++) {
                    int var83 = class87.method682(var79 - var73, -14969, var80);
                    int var84 = (this.field353[var82] & 0xFF) + var83;
                    var80 += var81 - var72;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    this.field353[var82] = (byte) var84;
                }
                var73 = var79;
                var72 = var81;
            }
            Object var76 = null;
            for (int var77 = var73; var77 < 128; var77++) {
                int var78 = (this.field353[var77] & 0xFF) + var72;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field353[var77] = (byte) var78;
            }
        }
        for (int var86 = 0; var86 < var15; var86++) {
            var19[var86].field3480 = var3.method646(-15447);
        }
        for (int var87 = 0; var87 < var15; var87++) {
            class151 var93 = var19[var87];
            if (var93.field3485 != null) {
                var93.field3459 = var3.method646(-15447);
            }
            if (var93.field3466 != null) {
                var93.field3463 = var3.method646(-15447);
            }
            if (var93.field3480 > 0) {
                var93.field3472 = var3.method646(-15447);
            }
        }
        for (int var88 = 0; var88 < var15; var88++) {
            var19[var88].field3467 = var3.method646(-15447);
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class151 var92 = var19[var89];
            if (var92.field3467 > 0) {
                var92.field3470 = var3.method646(-15447);
            }
        }
        for (int var90 = 0; var90 < var15; var90++) {
            class151 var91 = var19[var90];
            if (var91.field3470 > 0) {
                var91.field3474 = var3.method646(-15447);
            }
        }
    }
}
