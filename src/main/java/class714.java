import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class714 extends class577 {

    @OriginalMember(owner = "client!vm", name = "m", descriptor = "[S")
    public short[] field9893;

    @OriginalMember(owner = "client!vm", name = "n", descriptor = "[B")
    public byte[] field9894;

    @OriginalMember(owner = "client!vm", name = "w", descriptor = "[I")
    private int[] field9903;

    @OriginalMember(owner = "client!vm", name = "z", descriptor = "[B")
    public byte[] field9906;

    @OriginalMember(owner = "client!vm", name = "q", descriptor = "[Ldga;")
    public class218[] field9897;

    @OriginalMember(owner = "client!vm", name = "p", descriptor = "[B")
    public byte[] field9896;

    @OriginalMember(owner = "client!vm", name = "v", descriptor = "[Lvu;")
    public class356[] field9902;

    @OriginalMember(owner = "client!vm", name = "A", descriptor = "I")
    public int field9907;

    @OriginalMember(owner = "client!vm", name = "r", descriptor = "I")
    public static int field9898 = -1;

    @OriginalMember(owner = "client!vm", name = "x", descriptor = "Ljava/lang/String;")
    public static String field9904 = null;

    @OriginalMember(owner = "client!vm", name = "s", descriptor = "Lde;")
    public static class556 field9899 = new class556();

    @OriginalMember(owner = "client!vm", name = "B", descriptor = "Lbu;")
    public static class21 field9908 = new class21(65, 6);

    @OriginalMember(owner = "client!vm", name = "l", descriptor = "I")
    public static int field9892;

    @OriginalMember(owner = "client!vm", name = "o", descriptor = "I")
    public static int field9895;

    @OriginalMember(owner = "client!vm", name = "t", descriptor = "I")
    public static int field9900;

    @OriginalMember(owner = "client!vm", name = "y", descriptor = "I")
    public static int field9905;

    @OriginalMember(owner = "client!vm", name = "u", descriptor = "J")
    public static long field9901;

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "(B)V")
    public static void method4010(byte arg0) {
        if (arg0 < 74) {
            field9899 = null;
        }
        field9904 = null;
        field9908 = null;
        field9899 = null;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)V")
    public static final void method4011(int arg0) {
        field9905++;
        class472.field6621 = 0;
        int var1 = class110.field1640.method2986(-20802);
        int var2 = class110.field1640.method2938((byte) -67);
        int var3 = class110.field1640.method2974((byte) -36);
        boolean var4 = class110.field1640.method2964((byte) 47) == 1;
        class489.method2915((byte) -75);
        class766.method4236(4, var1);
        int var5 = (class15.field293 - class110.field1640.field7042) / 16;
        class779.field10692 = new int[var5][4];
        for (int var6 = 0; var6 < var5; var6++) {
            for (int var10 = 0; var10 < 4; var10++) {
                class779.field10692[var6][var10] = class110.field1640.method2976(-128);
            }
        }
        client.field4492 = new byte[var5][];
        class8.field79 = new byte[var5][];
        class300.field4333 = new byte[var5][];
        class490.field6955 = new int[var5];
        class506.field7191 = null;
        class314.field4472 = null;
        client.field4500 = new byte[var5][];
        class325.field4552 = new int[var5];
        class459.field6422 = new int[var5];
        class551.field7919 = new int[var5];
        class148.field2139 = new int[var5];
        int var7 = 0;
        for (int var8 = (var2 - (class768.field10571 >> 4)) / 8; var8 <= (var2 + (class768.field10571 >> 4)) / 8; var8++) {
            for (int var9 = (var3 - (class350.field4898 >> 4)) / 8; var9 <= ((var3 + (class350.field4898 >> 4)) / 8); var9++) {
                class551.field7919[var7] = (var8 << 8) + var9;
                class325.field4552[var7] = class168.field2640.method4356(102, "m" + var8 + "_" + var9);
                class459.field6422[var7] = class168.field2640.method4356(class587.method3425(arg0, 79), "l" + var8 + "_" + var9);
                class148.field2139[var7] = class168.field2640.method4356(arg0 + 73, "um" + var8 + "_" + var9);
                class490.field6955[var7] = class168.field2640.method4356(12, "ul" + var8 + "_" + var9);
                var7++;
            }
        }
        class417.method2537(var4, var2, arg0, false, var3);
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Z[ILgm;[B)Z")
    public final boolean method4012(boolean arg0, int[] arg1, class133 arg2, byte[] arg3) {
        field9892++;
        boolean var5 = true;
        int var6 = 0;
        class218 var7 = null;
        if (arg0) {
            field9898 = -96;
        }
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg3 == null || arg3[var8] != 0) {
                int var9 = this.field9903[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg2.method989(var9 >> 2, arg1, -124);
                        } else {
                            var7 = arg2.method985(-15117, var9 >> 2, arg1);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field9897[var8] = var7;
                        this.field9903[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(I)V")
    public final void method4013(int arg0) {
        this.field9903 = null;
        if (arg0 != 32) {
            method4010((byte) -120);
        }
        field9900++;
    }

    @OriginalMember(owner = "client!vm", name = "<init>", descriptor = "()V")
    public class714() {
    }

    @OriginalMember(owner = "client!vm", name = "<init>", descriptor = "([B)V")
    public class714(byte[] arg0) {
        this.field9893 = new short[128];
        this.field9894 = new byte[128];
        this.field9903 = new int[128];
        this.field9906 = new byte[128];
        this.field9897 = new class218[128];
        this.field9896 = new byte[128];
        this.field9902 = new class356[128];
        class494 var2 = new class494(arg0);
        int var3;
        for (var3 = 0; var2.field7050[var2.field7042 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method2943((byte) 16);
        }
        var2.field7042++;
        var3++;
        int var6 = var2.field7042;
        var2.field7042 += var3;
        int var7;
        for (var7 = 0; var2.field7050[var2.field7042 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method2943((byte) 16);
        }
        var7++;
        var2.field7042++;
        int var10 = var2.field7042;
        var2.field7042 += var7;
        int var11;
        for (var11 = 0; var2.field7050[var2.field7042 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method2943((byte) 16);
        }
        var2.field7042++;
        var11++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 > 1) {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var2.method2964((byte) 92);
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
        class356[] var19 = new class356[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class356 var103 = var19[var20] = new class356();
            int var104 = var2.method2964((byte) 87);
            if (var104 > 0) {
                var103.field5010 = new byte[var104 * 2];
            }
            int var105 = var2.method2964((byte) 66);
            if (var105 > 0) {
                var103.field5017 = new byte[var105 * 2 + 2];
                var103.field5017[1] = 64;
            }
        }
        int var21 = var2.method2964((byte) 63);
        byte[] var22 = var21 <= 0 ? null : new byte[var21 * 2];
        int var23 = var2.method2964((byte) 59);
        byte[] var24 = var23 > 0 ? new byte[var23 * 2] : null;
        int var25;
        for (var25 = 0; var2.field7050[var2.field7042 + var25] != 0; var25++) {
        }
        byte[] var26 = new byte[var25];
        for (int var27 = 0; var27 < var25; var27++) {
            var26[var27] = var2.method2943((byte) 16);
        }
        var2.field7042++;
        var25++;
        int var28 = 0;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var2.method2964((byte) 63);
            this.field9893[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var2.method2964((byte) 96);
            this.field9893[var31] = (short) (this.field9893[var31] + (var30 << 8));
        }
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        for (int var35 = 0; var35 < 128; var35++) {
            if (var32 == 0) {
                if (var33 >= var26.length) {
                    var32 = -1;
                } else {
                    var32 = var26[var33++];
                }
                var34 = var2.method2987(true);
            }
            this.field9893[var35] = (short) (this.field9893[var35] + (class702.method3977(2, var34 - 1) << 14));
            var32--;
            this.field9903[var35] = var34;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field9903[var39] != 0) {
                if (var37 == 0) {
                    var38 = var2.field7050[var6++] - 1;
                    if (var4.length > var36) {
                        var37 = var4[var36++];
                    } else {
                        var37 = -1;
                    }
                }
                this.field9894[var39] = (byte) var38;
                var37--;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field9903[var43] != 0) {
                if (var41 == 0) {
                    if (var8.length <= var40) {
                        var41 = -1;
                    } else {
                        var41 = var8[var40++];
                    }
                    var42 = var2.field7050[var10++] + 16 << 2;
                }
                var41--;
                this.field9906[var43] = (byte) var42;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class356 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field9903[var47] != 0) {
                if (var44 == 0) {
                    var46 = var19[var14[var45]];
                    if (var45 >= var12.length) {
                        var44 = -1;
                    } else {
                        var44 = var12[var45++];
                    }
                }
                this.field9902[var47] = var46;
                var44--;
            }
        }
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        for (int var51 = 0; var51 < 128; var51++) {
            if (var49 == 0) {
                if (var48 < var26.length) {
                    var49 = var26[var48++];
                } else {
                    var49 = -1;
                }
                if (this.field9903[var51] > 0) {
                    var50 = var2.method2964((byte) 104) + 1;
                }
            }
            this.field9896[var51] = (byte) var50;
            var49--;
        }
        this.field9907 = var2.method2964((byte) 113) + 1;
        for (int var52 = 0; var52 < var15; var52++) {
            class356 var100 = var19[var52];
            if (var100.field5010 != null) {
                for (int var101 = 1; var101 < var100.field5010.length; var101 += 2) {
                    var100.field5010[var101] = var2.method2943((byte) 16);
                }
            }
            if (var100.field5017 != null) {
                for (int var102 = 3; var102 < var100.field5017.length - 2; var102 += 2) {
                    var100.field5017[var102] = var2.method2943((byte) 16);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var2.method2943((byte) 16);
            }
        }
        if (var24 != null) {
            for (int var54 = 1; var54 < var24.length; var54 += 2) {
                var24[var54] = var2.method2943((byte) 16);
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class356 var97 = var19[var55];
            if (var97.field5017 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field5017.length; var99 += 2) {
                    var98 += var2.method2964((byte) 76) + 1;
                    var97.field5017[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var15; var56++) {
            class356 var94 = var19[var56];
            if (var94.field5010 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field5010.length; var96 += 2) {
                    var95 += var2.method2964((byte) 83) + 1;
                    var94.field5010[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var2.method2964((byte) 99);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 = var57 + var2.method2964((byte) 122) + 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[0];
            byte var60 = var22[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field9896[var61] = (byte) (this.field9896[var61] * var60 + 32 >> 6);
            }
            int var62 = 2;
            while (var22.length > var62) {
                byte var65 = var22[var62];
                byte var66 = var22[var62 + 1];
                int var67 = (var65 - var59) * var60 + ((var65 - var59) / 2);
                for (int var68 = var59; var68 < var65; var68++) {
                    int var69 = class305.method1974(64, var67, var65 - var59);
                    this.field9896[var68] = (byte) (this.field9896[var68] * var69 + 32 >> 6);
                    var67 += var66 - var60;
                }
                var62 += 2;
                var59 = var65;
                var60 = var66;
            }
            Object var63 = null;
            for (int var64 = var59; var64 < 128; var64++) {
                this.field9896[var64] = (byte) (this.field9896[var64] * var60 + 32 >> 6);
            }
        }
        if (var24 != null) {
            int var70 = var2.method2964((byte) 40);
            var24[0] = (byte) var70;
            for (int var71 = 2; var71 < var24.length; var71 += 2) {
                var70 += var2.method2964((byte) 79) + 1;
                var24[var71] = (byte) var70;
            }
            byte var72 = var24[0];
            int var73 = var24[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field9906[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field9906[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var75 < var24.length) {
                byte var79 = var24[var75];
                int var80 = var24[var75 + 1] << 1;
                int var81 = (var79 - var72) * var73 + ((var79 - var72) / 2);
                for (int var82 = var72; var82 < var79; var82++) {
                    int var83 = class305.method1974(64, var81, var79 - var72);
                    int var84 = (this.field9906[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    var81 += var80 - var73;
                    this.field9906[var82] = (byte) var84;
                }
                var75 += 2;
                var72 = var79;
                var73 = var80;
            }
            for (int var76 = var72; var76 < 128; var76++) {
                int var78 = (this.field9906[var76] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field9906[var76] = (byte) var78;
            }
            Object var77 = null;
        }
        for (int var86 = 0; var86 < var15; var86++) {
            var19[var86].field5016 = var2.method2964((byte) 50);
        }
        for (int var87 = 0; var87 < var15; var87++) {
            class356 var93 = var19[var87];
            if (var93.field5010 != null) {
                var93.field5011 = var2.method2964((byte) 111);
            }
            if (var93.field5017 != null) {
                var93.field5012 = var2.method2964((byte) 72);
            }
            if (var93.field5016 > 0) {
                var93.field5018 = var2.method2964((byte) 53);
            }
        }
        for (int var88 = 0; var88 < var15; var88++) {
            var19[var88].field5008 = var2.method2964((byte) 63);
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class356 var92 = var19[var89];
            if (var92.field5008 > 0) {
                var92.field5019 = var2.method2964((byte) 49);
            }
        }
        for (int var90 = 0; var90 < var15; var90++) {
            class356 var91 = var19[var90];
            if (var91.field5019 > 0) {
                var91.field5007 = var2.method2964((byte) 40);
            }
        }
    }
}
