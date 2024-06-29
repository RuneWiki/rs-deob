import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kia")
public class class94 extends class766 {

    @OriginalMember(owner = "client!kia", name = "n", descriptor = "[S")
    public short[] field1335;

    @OriginalMember(owner = "client!kia", name = "v", descriptor = "[I")
    private int[] field1343;

    @OriginalMember(owner = "client!kia", name = "u", descriptor = "[B")
    public byte[] field1342;

    @OriginalMember(owner = "client!kia", name = "q", descriptor = "[B")
    public byte[] field1338;

    @OriginalMember(owner = "client!kia", name = "y", descriptor = "[B")
    public byte[] field1346;

    @OriginalMember(owner = "client!kia", name = "x", descriptor = "[Lada;")
    public class269[] field1345;

    @OriginalMember(owner = "client!kia", name = "t", descriptor = "[Lud;")
    public class101[] field1341;

    @OriginalMember(owner = "client!kia", name = "o", descriptor = "I")
    public int field1336;

    @OriginalMember(owner = "client!kia", name = "s", descriptor = "Lbn;")
    public static class517 field1340 = new class517("LIVE", "", "", 0);

    @OriginalMember(owner = "client!kia", name = "A", descriptor = "Laq;")
    public static class494 field1348 = new class494(64);

    @OriginalMember(owner = "client!kia", name = "C", descriptor = "Lnea;")
    public static class600 field1350 = new class600(1);

    @OriginalMember(owner = "client!kia", name = "D", descriptor = "I")
    public static int field1351 = 0;

    @OriginalMember(owner = "client!kia", name = "p", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!kia", name = "r", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!kia", name = "w", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!kia", name = "E", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!kia", name = "z", descriptor = "Llga;")
    public static class20 field1347;

    @OriginalMember(owner = "client!kia", name = "B", descriptor = "Ljava/lang/String;")
    public static String field1349;

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "([I[BILria;)Z")
    public final boolean method791(int[] arg0, byte[] arg1, int arg2, class23 arg3) {
        field1344++;
        boolean var5 = true;
        int var6 = 0;
        class101 var7 = null;
        if (arg2 <= 77) {
            method794((byte) -32);
        }
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg1 == null || arg1[var8] != 0) {
                int var9 = this.field1343[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg3.method217(0, var9 >> 2, arg0);
                        } else {
                            var7 = arg3.method214(arg0, var9 >> 2, 27312);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field1341[var8] = var7;
                        this.field1343[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(I)V")
    public final void method792(int arg0) {
        this.field1343 = null;
        if (arg0 == -1) {
            field1339++;
        }
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(B)V")
    public static final void method793(byte arg0) {
        class4.field61.method4249((byte) 82);
        field1337++;
        int var1 = -90 / ((arg0 + 61) / 62);
        class752.field10455.method253((byte) -18);
        class13.field160.method253((byte) -18);
    }

    @OriginalMember(owner = "client!kia", name = "b", descriptor = "(B)V")
    public static void method794(byte arg0) {
        field1349 = null;
        field1347 = null;
        field1350 = null;
        field1348 = null;
        field1340 = null;
        if (arg0 != 67) {
            field1348 = null;
        }
    }

    @OriginalMember(owner = "client!kia", name = "<init>", descriptor = "()V")
    public class94() {
    }

    @OriginalMember(owner = "client!kia", name = "<init>", descriptor = "([B)V")
    public class94(byte[] arg0) {
        this.field1335 = new short[128];
        this.field1343 = new int[128];
        this.field1342 = new byte[128];
        this.field1338 = new byte[128];
        this.field1346 = new byte[128];
        this.field1345 = new class269[128];
        this.field1341 = new class101[128];
        class431 var2 = new class431(arg0);
        int var3;
        for (var3 = 0; var2.field6002[var2.field5983 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method2529(71);
        }
        var2.field5983++;
        var3++;
        int var6 = var2.field5983;
        var2.field5983 += var3;
        int var7;
        for (var7 = 0; var2.field6002[var2.field5983 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method2529(73);
        }
        var7++;
        var2.field5983++;
        int var10 = var2.field5983;
        var2.field5983 += var7;
        int var11;
        for (var11 = 0; var2.field6002[var2.field5983 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method2529(93);
        }
        var11++;
        var2.field5983++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 > 1) {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var2.method2557(14929);
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
            var15 = var11;
        }
        class269[] var19 = new class269[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class269 var103 = var19[var20] = new class269();
            int var104 = var2.method2557(14929);
            if (var104 > 0) {
                var103.field3791 = new byte[var104 * 2];
            }
            int var105 = var2.method2557(14929);
            if (var105 > 0) {
                var103.field3797 = new byte[var105 * 2 + 2];
                var103.field3797[1] = 64;
            }
        }
        int var21 = var2.method2557(14929);
        byte[] var22 = var21 > 0 ? new byte[var21 * 2] : null;
        int var23 = var2.method2557(14929);
        byte[] var24 = var23 > 0 ? new byte[var23 * 2] : null;
        int var25;
        for (var25 = 0; var2.field6002[var2.field5983 + var25] != 0; var25++) {
        }
        byte[] var26 = new byte[var25];
        for (int var27 = 0; var27 < var25; var27++) {
            var26[var27] = var2.method2529(107);
        }
        var25++;
        var2.field5983++;
        int var28 = 0;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var2.method2557(14929);
            this.field1335[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var2.method2557(14929);
            this.field1335[var31] = (short) (this.field1335[var31] + (var30 << 8));
        }
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        for (int var35 = 0; var35 < 128; var35++) {
            if (var32 == 0) {
                if (var33 < var26.length) {
                    var32 = var26[var33++];
                } else {
                    var32 = -1;
                }
                var34 = var2.method2569(127);
            }
            this.field1335[var35] = (short) (this.field1335[var35] + (class194.method1380(var34 - 1, 2) << 14));
            this.field1343[var35] = var34;
            var32--;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field1343[var39] != 0) {
                if (var36 == 0) {
                    var38 = var2.field6002[var6++] - 1;
                    if (var4.length <= var37) {
                        var36 = -1;
                    } else {
                        var36 = var4[var37++];
                    }
                }
                this.field1338[var39] = (byte) var38;
                var36--;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field1343[var43] != 0) {
                if (var41 == 0) {
                    var42 = var2.field6002[var10++] + 16 << 2;
                    if (var8.length <= var40) {
                        var41 = -1;
                    } else {
                        var41 = var8[var40++];
                    }
                }
                var41--;
                this.field1346[var43] = (byte) var42;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class269 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field1343[var47] != 0) {
                if (var45 == 0) {
                    var46 = var19[var14[var44]];
                    if (var44 >= var12.length) {
                        var45 = -1;
                    } else {
                        var45 = var12[var44++];
                    }
                }
                this.field1345[var47] = var46;
                var45--;
            }
        }
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        for (int var51 = 0; var51 < 128; var51++) {
            if (var48 == 0) {
                if (var49 < var26.length) {
                    var48 = var26[var49++];
                } else {
                    var48 = -1;
                }
                if (this.field1343[var51] > 0) {
                    var50 = var2.method2557(14929) + 1;
                }
            }
            var48--;
            this.field1342[var51] = (byte) var50;
        }
        this.field1336 = var2.method2557(14929) + 1;
        for (int var52 = 0; var52 < var15; var52++) {
            class269 var100 = var19[var52];
            if (var100.field3791 != null) {
                for (int var101 = 1; var101 < var100.field3791.length; var101 += 2) {
                    var100.field3791[var101] = var2.method2529(66);
                }
            }
            if (var100.field3797 != null) {
                for (int var102 = 3; var102 < var100.field3797.length - 2; var102 += 2) {
                    var100.field3797[var102] = var2.method2529(55);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var2.method2529(57);
            }
        }
        if (var24 != null) {
            for (int var54 = 1; var54 < var24.length; var54 += 2) {
                var24[var54] = var2.method2529(100);
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class269 var97 = var19[var55];
            if (var97.field3797 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field3797.length; var99 += 2) {
                    var98 = var2.method2557(14929) + var98 + 1;
                    var97.field3797[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var15; var56++) {
            class269 var94 = var19[var56];
            if (var94.field3791 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field3791.length; var96 += 2) {
                    var95 = var95 + var2.method2557(14929) + 1;
                    var94.field3791[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var2.method2557(14929);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 = var57 + var2.method2557(14929) + 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[0];
            byte var60 = var22[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field1342[var61] = (byte) (this.field1342[var61] * var60 + 32 >> 6);
            }
            int var62 = 2;
            while (var62 < var22.length) {
                byte var65 = var22[var62];
                byte var66 = var22[var62 + 1];
                int var67 = (var65 - var59) / 2 + (var65 - var59) * var60;
                for (int var68 = var59; var68 < var65; var68++) {
                    int var69 = class621.method3560(var67, var65 - var59, 13921);
                    this.field1342[var68] = (byte) (this.field1342[var68] * var69 + 32 >> 6);
                    var67 += var66 - var60;
                }
                var59 = var65;
                var62 += 2;
                var60 = var66;
            }
            Object var63 = null;
            for (int var64 = var59; var64 < 128; var64++) {
                this.field1342[var64] = (byte) (this.field1342[var64] * var60 + 32 >> 6);
            }
        }
        if (var24 != null) {
            int var70 = var2.method2557(14929);
            var24[0] = (byte) var70;
            for (int var71 = 2; var71 < var24.length; var71 += 2) {
                var70 = var2.method2557(14929) + var70 + 1;
                var24[var71] = (byte) var70;
            }
            byte var72 = var24[0];
            int var73 = var24[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field1346[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field1346[var74] = (byte) var85;
            }
            for (int var75 = 2; var75 < var24.length; var75 += 2) {
                byte var79 = var24[var75];
                int var80 = var24[var75 + 1] << 1;
                int var81 = (var79 - var72) / 2 + (var79 - var72) * var73;
                for (int var82 = var72; var82 < var79; var82++) {
                    int var83 = class621.method3560(var81, var79 - var72, 13921);
                    int var84 = (this.field1346[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    this.field1346[var82] = (byte) var84;
                    var81 += var80 - var73;
                }
                var72 = var79;
                var73 = var80;
            }
            for (int var76 = var72; var76 < 128; var76++) {
                int var78 = (this.field1346[var76] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field1346[var76] = (byte) var78;
            }
            Object var77 = null;
        }
        for (int var86 = 0; var86 < var15; var86++) {
            var19[var86].field3789 = var2.method2557(14929);
        }
        for (int var87 = 0; var87 < var15; var87++) {
            class269 var93 = var19[var87];
            if (var93.field3791 != null) {
                var93.field3786 = var2.method2557(14929);
            }
            if (var93.field3797 != null) {
                var93.field3788 = var2.method2557(14929);
            }
            if (var93.field3789 > 0) {
                var93.field3790 = var2.method2557(14929);
            }
        }
        for (int var88 = 0; var88 < var15; var88++) {
            var19[var88].field3787 = var2.method2557(14929);
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class269 var92 = var19[var89];
            if (var92.field3787 > 0) {
                var92.field3792 = var2.method2557(14929);
            }
        }
        for (int var90 = 0; var90 < var15; var90++) {
            class269 var91 = var19[var90];
            if (var91.field3792 > 0) {
                var91.field3793 = var2.method2557(14929);
            }
        }
    }
}
