import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class68 extends class314 {

    @OriginalMember(owner = "client!ri", name = "q", descriptor = "[Ltc;")
    public class40[] field1340;

    @OriginalMember(owner = "client!ri", name = "y", descriptor = "[B")
    public byte[] field1348;

    @OriginalMember(owner = "client!ri", name = "x", descriptor = "[B")
    public byte[] field1347;

    @OriginalMember(owner = "client!ri", name = "o", descriptor = "[S")
    public short[] field1338;

    @OriginalMember(owner = "client!ri", name = "w", descriptor = "[I")
    private int[] field1346;

    @OriginalMember(owner = "client!ri", name = "m", descriptor = "[Lf;")
    public class244[] field1336;

    @OriginalMember(owner = "client!ri", name = "v", descriptor = "[B")
    public byte[] field1345;

    @OriginalMember(owner = "client!ri", name = "A", descriptor = "I")
    public int field1350;

    @OriginalMember(owner = "client!ri", name = "n", descriptor = "Lud;")
    private static class279 field1337 = class130.method1024("M", 255);

    @OriginalMember(owner = "client!ri", name = "p", descriptor = "Lud;")
    public static class279 field1339 = field1337;

    @OriginalMember(owner = "client!ri", name = "l", descriptor = "Z")
    public static boolean field1335 = true;

    @OriginalMember(owner = "client!ri", name = "t", descriptor = "Lud;")
    public static class279 field1343 = field1337;

    @OriginalMember(owner = "client!ri", name = "z", descriptor = "Lud;")
    public static class279 field1349 = class130.method1024("Liste des mises -9 jour charg-Be", 255);

    @OriginalMember(owner = "client!ri", name = "B", descriptor = "Lud;")
    public static class279 field1351 = class130.method1024("::tween", 255);

    @OriginalMember(owner = "client!ri", name = "r", descriptor = "I")
    public static int field1341;

    @OriginalMember(owner = "client!ri", name = "s", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!ri", name = "u", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!ri", name = "k", descriptor = "[Lud;")
    public static class279[] field1334;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(BI)V", line = 7)
    public static final void method597(byte arg0, int arg1) {
        class238.field4171.method1339(arg1, 19326);
        if (arg0 == 47) {
            class153.field2771.method1339(arg1, 19326);
            class119.field2141.method1339(arg1, arg0 ^ 0x4B51);
            class231.field4040.method1339(arg1, 19326);
            field1344++;
        }
    }

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "(B)V", line = 26)
    public final void method598(byte arg0) {
        if (arg0 != -20) {
            this.method600((class131) null, true, (byte[]) null, (int[]) null);
        }
        field1341++;
        this.field1346 = null;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V", line = 74)
    public static void method599(int arg0) {
        field1339 = null;
        if (arg0 <= 70) {
            field1334 = (class279[]) null;
        }
        field1337 = null;
        field1343 = null;
        field1334 = null;
        field1351 = null;
        field1349 = null;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lcl;Z[B[I)Z", line = 98)
    public final boolean method600(class131 arg0, boolean arg1, byte[] arg2, int[] arg3) {
        boolean var5 = arg1;
        field1342++;
        int var6 = 0;
        class40 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg2 == null || arg2[var8] != 0) {
                int var9 = this.field1346[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg0.method1029(arg3, var9 >> 2, 0);
                        } else {
                            var7 = arg0.method1035(var9 >> 2, true, arg3);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field1340[var8] = var7;
                        this.field1346[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "()V", line = 148)
    public class68() {
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "([B)V", line = 150)
    public class68(byte[] arg0) {
        this.field1340 = new class40[128];
        this.field1348 = new byte[128];
        int var2 = 0;
        this.field1347 = new byte[128];
        this.field1338 = new short[128];
        this.field1346 = new int[128];
        this.field1336 = new class244[128];
        this.field1345 = new byte[128];
        class53 var3 = new class53(arg0);
        while (var3.field1168[var3.field1142 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method494(false);
        }
        int var6 = 0;
        var3.field1142++;
        var2++;
        int var7 = var3.field1142;
        var3.field1142 += var2;
        while (var3.field1168[var3.field1142 + var6] != 0) {
            var6++;
        }
        byte[] var8 = new byte[var6];
        for (int var9 = 0; var9 < var6; var9++) {
            var8[var9] = var3.method494(false);
        }
        var6++;
        var3.field1142++;
        int var10 = 0;
        int var11 = var3.field1142;
        var3.field1142 += var6;
        while (var3.field1168[var3.field1142 + var10] != 0) {
            var10++;
        }
        byte[] var12 = new byte[var10];
        for (int var13 = 0; var13 < var10; var13++) {
            var12[var13] = var3.method494(false);
        }
        var10++;
        var3.field1142++;
        byte[] var14 = new byte[var10];
        int var15;
        if (var10 <= 1) {
            var15 = var10;
        } else {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;
            for (int var17 = 2; var17 < var10; var17++) {
                int var18 = var3.method483(-106);
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
        class244[] var19 = new class244[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class244 var21 = var19[var20] = new class244();
            int var22 = var3.method483(-107);
            if (var22 > 0) {
                var21.field4334 = new byte[var22 * 2];
            }
            int var23 = var3.method483(-115);
            if (var23 > 0) {
                var21.field4345 = new byte[var23 * 2 + 2];
                var21.field4345[1] = 64;
            }
        }
        int var24 = var3.method483(-102);
        byte[] var25 = var24 <= 0 ? null : new byte[var24 * 2];
        int var26 = var3.method483(-101);
        byte[] var27 = var26 <= 0 ? null : new byte[var26 * 2];
        int var28;
        for (var28 = 0; var3.field1168[var3.field1142 + var28] != 0; var28++) {
        }
        byte[] var29 = new byte[var28];
        for (int var30 = 0; var30 < var28; var30++) {
            var29[var30] = var3.method494(false);
        }
        var28++;
        var3.field1142++;
        int var31 = 0;
        for (int var32 = 0; var32 < 128; var32++) {
            var31 += var3.method483(-127);
            this.field1338[var32] = (short) var31;
        }
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            var33 += var3.method483(-102);
            this.field1338[var34] = (short) (this.field1338[var34] + (var33 << 8));
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
                var36 = var3.method454(65);
            }
            this.field1338[var38] = (short) (this.field1338[var38] + class52.method442(32768, var36 - 1 << 14));
            this.field1346[var38] = var36;
            var35--;
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field1346[var42] != 0) {
                if (var39 == 0) {
                    var41 = var3.field1168[var7++] - 1;
                    if (var4.length > var40) {
                        var39 = var4[var40++];
                    } else {
                        var39 = -1;
                    }
                }
                var39--;
                this.field1345[var42] = (byte) var41;
            }
        }
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field1346[var46] != 0) {
                if (var44 == 0) {
                    if (var8.length <= var43) {
                        var44 = -1;
                    } else {
                        var44 = var8[var43++];
                    }
                    var45 = var3.field1168[var11++] + 16 << 2;
                }
                this.field1347[var46] = (byte) var45;
                var44--;
            }
        }
        int var47 = 0;
        class244 var48 = null;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (this.field1346[var50] != 0) {
                if (var47 == 0) {
                    var48 = var19[var14[var49]];
                    if (var12.length <= var49) {
                        var47 = -1;
                    } else {
                        var47 = var12[var49++];
                    }
                }
                this.field1336[var50] = var48;
                var47--;
            }
        }
        int var51 = 0;
        int var52 = 0;
        int var53 = 0;
        for (int var54 = 0; var54 < 128; var54++) {
            if (var52 == 0) {
                if (var29.length <= var51) {
                    var52 = -1;
                } else {
                    var52 = var29[var51++];
                }
                if (this.field1346[var54] > 0) {
                    var53 = var3.method483(-123) + 1;
                }
            }
            this.field1348[var54] = (byte) var53;
            var52--;
        }
        this.field1350 = var3.method483(-118) + 1;
        for (int var55 = 0; var55 < var15; var55++) {
            class244 var56 = var19[var55];
            if (var56.field4334 != null) {
                for (int var57 = 1; var57 < var56.field4334.length; var57 += 2) {
                    var56.field4334[var57] = var3.method494(false);
                }
            }
            if (var56.field4345 != null) {
                for (int var58 = 3; var58 < var56.field4345.length - 2; var58 += 2) {
                    var56.field4345[var58] = var3.method494(false);
                }
            }
        }
        if (var25 != null) {
            for (int var59 = 1; var59 < var25.length; var59 += 2) {
                var25[var59] = var3.method494(false);
            }
        }
        if (var27 != null) {
            for (int var60 = 1; var60 < var27.length; var60 += 2) {
                var27[var60] = var3.method494(false);
            }
        }
        for (int var61 = 0; var61 < var15; var61++) {
            class244 var62 = var19[var61];
            if (var62.field4345 != null) {
                int var63 = 0;
                for (int var64 = 2; var64 < var62.field4345.length; var64 += 2) {
                    var63 = var63 + var3.method483(-120) + 1;
                    var62.field4345[var64] = (byte) var63;
                }
            }
        }
        for (int var65 = 0; var65 < var15; var65++) {
            class244 var66 = var19[var65];
            if (var66.field4334 != null) {
                int var67 = 0;
                for (int var68 = 2; var68 < var66.field4334.length; var68 += 2) {
                    var67 = var67 + var3.method483(-124) + 1;
                    var66.field4334[var68] = (byte) var67;
                }
            }
        }
        if (var25 != null) {
            int var69 = var3.method483(-127);
            var25[0] = (byte) var69;
            for (int var70 = 2; var70 < var25.length; var70 += 2) {
                var69 = var3.method483(-117) + var69 + 1;
                var25[var70] = (byte) var69;
            }
            byte var71 = var25[0];
            byte var72 = var25[1];
            for (int var73 = 0; var73 < var71; var73++) {
                this.field1348[var73] = (byte) (this.field1348[var73] * var72 + 32 >> 6);
            }
            int var74 = 2;
            while (var74 < var25.length) {
                byte var75 = var25[var74 + 1];
                byte var76 = var25[var74];
                var74 += 2;
                int var77 = (var76 - var71) * var72 + ((var76 - var71) / 2);
                for (int var78 = var71; var78 < var76; var78++) {
                    int var79 = class297.method2102((byte) -123, var77, var76 - var71);
                    this.field1348[var78] = (byte) (this.field1348[var78] * var79 + 32 >> 6);
                    var77 += var75 - var72;
                }
                var71 = var76;
                var72 = var75;
            }
            Object var80 = null;
            for (int var81 = var71; var81 < 128; var81++) {
                this.field1348[var81] = (byte) (this.field1348[var81] * var72 + 32 >> 6);
            }
        }
        if (var27 != null) {
            int var82 = var3.method483(-124);
            var27[0] = (byte) var82;
            for (int var83 = 2; var83 < var27.length; var83 += 2) {
                var82 = var82 + var3.method483(-115) + 1;
                var27[var83] = (byte) var82;
            }
            byte var84 = var27[0];
            int var85 = var27[1] << 1;
            for (int var86 = 0; var86 < var84; var86++) {
                int var87 = (this.field1347[var86] & 0xFF) + var85;
                if (var87 < 0) {
                    var87 = 0;
                }
                if (var87 > 128) {
                    var87 = 128;
                }
                this.field1347[var86] = (byte) var87;
            }
            int var88 = 2;
            while (var88 < var27.length) {
                int var89 = var27[var88 + 1] << 1;
                byte var90 = var27[var88];
                int var91 = (var90 - var84) / 2 + (var90 - var84) * var85;
                for (int var92 = var84; var92 < var90; var92++) {
                    int var93 = class297.method2102((byte) -86, var91, var90 - var84);
                    var91 += var89 - var85;
                    int var94 = (this.field1347[var92] & 0xFF) + var93;
                    if (var94 < 0) {
                        var94 = 0;
                    }
                    if (var94 > 128) {
                        var94 = 128;
                    }
                    this.field1347[var92] = (byte) var94;
                }
                var84 = var90;
                var88 += 2;
                var85 = var89;
            }
            Object var95 = null;
            for (int var96 = var84; var96 < 128; var96++) {
                int var97 = (this.field1347[var96] & 0xFF) + var85;
                if (var97 < 0) {
                    var97 = 0;
                }
                if (var97 > 128) {
                    var97 = 128;
                }
                this.field1347[var96] = (byte) var97;
            }
        }
        for (int var98 = 0; var98 < var15; var98++) {
            var19[var98].field4337 = var3.method483(-113);
        }
        for (int var99 = 0; var99 < var15; var99++) {
            class244 var100 = var19[var99];
            if (var100.field4334 != null) {
                var100.field4336 = var3.method483(-111);
            }
            if (var100.field4345 != null) {
                var100.field4340 = var3.method483(-113);
            }
            if (var100.field4337 > 0) {
                var100.field4330 = var3.method483(-111);
            }
        }
        for (int var101 = 0; var101 < var15; var101++) {
            var19[var101].field4346 = var3.method483(-111);
        }
        for (int var102 = 0; var102 < var15; var102++) {
            class244 var103 = var19[var102];
            if (var103.field4346 > 0) {
                var103.field4335 = var3.method483(-122);
            }
        }
        for (int var104 = 0; var104 < var15; var104++) {
            class244 var105 = var19[var104];
            if (var105.field4335 > 0) {
                var105.field4339 = var3.method483(-120);
            }
        }
        if (class80.field1557) {
        }
    }
}
