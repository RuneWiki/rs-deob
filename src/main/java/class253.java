import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class253 extends class30 {

    @OriginalMember(owner = "client!fd", name = "x", descriptor = "[B")
    public byte[] field4342;

    @OriginalMember(owner = "client!fd", name = "v", descriptor = "[Lbe;")
    public class25[] field4340;

    @OriginalMember(owner = "client!fd", name = "y", descriptor = "[B")
    public byte[] field4343;

    @OriginalMember(owner = "client!fd", name = "B", descriptor = "[Loh;")
    public class261[] field4346;

    @OriginalMember(owner = "client!fd", name = "K", descriptor = "[S")
    public short[] field4354;

    @OriginalMember(owner = "client!fd", name = "z", descriptor = "[B")
    public byte[] field4344;

    @OriginalMember(owner = "client!fd", name = "A", descriptor = "[I")
    private int[] field4345;

    @OriginalMember(owner = "client!fd", name = "G", descriptor = "I")
    public int field4350;

    @OriginalMember(owner = "client!fd", name = "w", descriptor = "J")
    public static volatile long field4341 = 0L;

    @OriginalMember(owner = "client!fd", name = "u", descriptor = "[I")
    public static int[] field4339 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 67, 68, 69, 70, 71, 72, 75, 79, 80, 81, 82, 87, 88, 89, 90, 77, 96, 98, 99, 100, 101, 102, 250, 251, 109, 110, 111, 112, 117, 252, 167, 126, 127, 128, 129, 130, 131, 132, 135, 139, 140, 141, 142, 147, 148, 149, 150, 137, 156, 158, 159, 160, 161, 162, 253, 254, 170, 171, 172, 173, 178, 255, 179 };

    @OriginalMember(owner = "client!fd", name = "F", descriptor = "Lie;")
    public static class117 field4349 = new class117(50);

    @OriginalMember(owner = "client!fd", name = "M", descriptor = "I")
    public static int field4356 = 0;

    @OriginalMember(owner = "client!fd", name = "C", descriptor = "I")
    public static int field4347;

    @OriginalMember(owner = "client!fd", name = "E", descriptor = "I")
    public static int field4348;

    @OriginalMember(owner = "client!fd", name = "H", descriptor = "I")
    public static int field4351;

    @OriginalMember(owner = "client!fd", name = "I", descriptor = "I")
    public static int field4352;

    @OriginalMember(owner = "client!fd", name = "L", descriptor = "[Lia;")
    public static class257[] field4355;

    @OriginalMember(owner = "client!fd", name = "J", descriptor = "[[B")
    public static byte[][] field4353;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "(I)V")
    public final void method1650(int arg0) {
        field4351++;
        if (arg0 != -18550) {
            this.method1653((int[]) null, (byte) 21, (byte[]) null, (class191) null);
        }
        this.field4345 = null;
    }

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "(I)V")
    public static void method1651(int arg0) {
        field4339 = null;
        field4349 = null;
        field4353 = null;
        field4355 = null;
        if (arg0 != -1) {
            method1654(109, true, true, false, -79);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(III)V")
    public static final void method1652(int arg0, int arg1, int arg2) {
        field4347++;
        if (class31.method258(arg1, 0)) {
            class221.method1454(arg2, class28.field539[arg1], arg0 ^ 0xFFFFC1FE);
            if (arg0 != -15970) {
                field4356 = 79;
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "([IB[BLpi;)Z")
    public final boolean method1653(int[] arg0, byte arg1, byte[] arg2, class191 arg3) {
        boolean var5 = true;
        int var6 = 0;
        field4352++;
        if (arg1 < 80) {
            return false;
        }
        class261 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg2 == null || arg2[var8] != 0) {
                int var9 = this.field4345[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg3.method1297(var9 >> 2, 1, arg0);
                        } else {
                            var7 = arg3.method1291(arg0, var9 >> 2, false);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field4346[var8] = var7;
                        this.field4345[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IZZZI)Lvb;")
    public static final class226 method1654(int arg0, boolean arg1, boolean arg2, boolean arg3, int arg4) {
        field4348++;
        if (arg0 != 1000000) {
            method1654(-27, true, true, true, -80);
        }
        class229 var5 = null;
        if (class172.field2947 != null) {
            var5 = new class229(arg4, class172.field2947, class184.field3200[arg4], 1000000);
        }
        return new class226(var5, class30.field578, arg4, arg3, arg2, arg1);
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "()V")
    public class253() {
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "([B)V")
    public class253(byte[] arg0) {
        this.field4342 = new byte[128];
        this.field4340 = new class25[128];
        this.field4343 = new byte[128];
        this.field4346 = new class261[128];
        this.field4354 = new short[128];
        this.field4344 = new byte[128];
        int var2 = 0;
        this.field4345 = new int[128];
        class152 var3 = new class152(arg0);
        while (var3.field2638[var3.field2677 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method1060((byte) -58);
        }
        var3.field2677++;
        var2++;
        int var6 = var3.field2677;
        var3.field2677 += var2;
        int var7;
        for (var7 = 0; var3.field2638[var3.field2677 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method1060((byte) -58);
        }
        var3.field2677++;
        var7++;
        int var10 = var3.field2677;
        int var11 = 0;
        var3.field2677 += var7;
        while (var3.field2638[var3.field2677 + var11] != 0) {
            var11++;
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var3.method1060((byte) -58);
        }
        var3.field2677++;
        var11++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 > 1) {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var3.method1051((byte) -119);
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
        class25[] var19 = new class25[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class25 var103 = var19[var20] = new class25();
            int var104 = var3.method1051((byte) 95);
            if (var104 > 0) {
                var103.field489 = new byte[var104 * 2];
            }
            int var105 = var3.method1051((byte) 121);
            if (var105 > 0) {
                var103.field496 = new byte[var105 * 2 + 2];
                var103.field496[1] = 64;
            }
        }
        int var21 = var3.method1051((byte) 97);
        byte[] var22 = var21 <= 0 ? null : new byte[var21 * 2];
        int var23 = var3.method1051((byte) -68);
        byte[] var24 = var23 > 0 ? new byte[var23 * 2] : null;
        int var25;
        for (var25 = 0; var3.field2638[var3.field2677 + var25] != 0; var25++) {
        }
        byte[] var26 = new byte[var25];
        for (int var27 = 0; var27 < var25; var27++) {
            var26[var27] = var3.method1060((byte) -58);
        }
        var25++;
        var3.field2677++;
        int var28 = 0;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var3.method1051((byte) -38);
            this.field4354[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var3.method1051((byte) -92);
            this.field4354[var31] = (short) (this.field4354[var31] + (var30 << 8));
        }
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        for (int var35 = 0; var35 < 128; var35++) {
            if (var33 == 0) {
                if (var26.length > var32) {
                    var33 = var26[var32++];
                } else {
                    var33 = -1;
                }
                var34 = var3.method1031(0);
            }
            this.field4354[var35] = (short) (this.field4354[var35] + (class30.method252(2, var34 - 1) << 14));
            this.field4345[var35] = var34;
            var33--;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field4345[var39] != 0) {
                if (var38 == 0) {
                    if (var36 >= var4.length) {
                        var38 = -1;
                    } else {
                        var38 = var4[var36++];
                    }
                    var37 = var3.field2638[var6++] - 1;
                }
                var38--;
                this.field4343[var39] = (byte) var37;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field4345[var43] != 0) {
                if (var41 == 0) {
                    var40 = var3.field2638[var10++] + 16 << 2;
                    if (var8.length > var42) {
                        var41 = var8[var42++];
                    } else {
                        var41 = -1;
                    }
                }
                var41--;
                this.field4344[var43] = (byte) var40;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class25 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field4345[var47] != 0) {
                if (var44 == 0) {
                    var46 = var19[var14[var45]];
                    if (var45 >= var12.length) {
                        var44 = -1;
                    } else {
                        var44 = var12[var45++];
                    }
                }
                this.field4340[var47] = var46;
                var44--;
            }
        }
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        for (int var51 = 0; var51 < 128; var51++) {
            if (var49 == 0) {
                if (var26.length > var50) {
                    var49 = var26[var50++];
                } else {
                    var49 = -1;
                }
                if (this.field4345[var51] > 0) {
                    var48 = var3.method1051((byte) 95) + 1;
                }
            }
            this.field4342[var51] = (byte) var48;
            var49--;
        }
        this.field4350 = var3.method1051((byte) -70) + 1;
        for (int var52 = 0; var52 < var15; var52++) {
            class25 var100 = var19[var52];
            if (var100.field489 != null) {
                for (int var101 = 1; var101 < var100.field489.length; var101 += 2) {
                    var100.field489[var101] = var3.method1060((byte) -58);
                }
            }
            if (var100.field496 != null) {
                for (int var102 = 3; var102 < (var100.field496.length - 2); var102 += 2) {
                    var100.field496[var102] = var3.method1060((byte) -58);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var3.method1060((byte) -58);
            }
        }
        if (var24 != null) {
            for (int var54 = 1; var54 < var24.length; var54 += 2) {
                var24[var54] = var3.method1060((byte) -58);
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class25 var97 = var19[var55];
            if (var97.field496 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field496.length; var99 += 2) {
                    var98 = var3.method1051((byte) -121) + var98 + 1;
                    var97.field496[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var15; var56++) {
            class25 var94 = var19[var56];
            if (var94.field489 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field489.length; var96 += 2) {
                    var95 = var95 + var3.method1051((byte) 121) + 1;
                    var94.field489[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var3.method1051((byte) -84);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 += var3.method1051((byte) 92) + 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[1];
            byte var60 = var22[0];
            for (int var61 = 0; var61 < var60; var61++) {
                this.field4342[var61] = (byte) (this.field4342[var61] * var59 + 32 >> 6);
            }
            int var62 = 2;
            while (var22.length > var62) {
                byte var65 = var22[var62];
                int var66 = (var65 - var60) / 2 + (var65 - var60) * var59;
                byte var67 = var22[var62 + 1];
                var62 += 2;
                for (int var68 = var60; var68 < var65; var68++) {
                    int var69 = class21.method184(var66, var65 - var60, (byte) -86);
                    var66 += var67 - var59;
                    this.field4342[var68] = (byte) (this.field4342[var68] * var69 + 32 >> 6);
                }
                var60 = var65;
                var59 = var67;
            }
            for (int var63 = var60; var63 < 128; var63++) {
                this.field4342[var63] = (byte) (this.field4342[var63] * var59 + 32 >> 6);
            }
            Object var64 = null;
        }
        if (var24 != null) {
            int var70 = var3.method1051((byte) -128);
            var24[0] = (byte) var70;
            for (int var71 = 2; var71 < var24.length; var71 += 2) {
                var70 -= -var3.method1051((byte) 83) - 1;
                var24[var71] = (byte) var70;
            }
            int var72 = var24[1] << 1;
            byte var73 = var24[0];
            for (int var74 = 0; var74 < var73; var74++) {
                int var85 = (this.field4344[var74] & 0xFF) + var72;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field4344[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var24.length > var75) {
                byte var79 = var24[var75];
                int var80 = var24[var75 + 1] << 1;
                var75 += 2;
                int var81 = (var79 - var73) * var72 + ((var79 - var73) / 2);
                for (int var82 = var73; var82 < var79; var82++) {
                    int var83 = class21.method184(var81, var79 - var73, (byte) -86);
                    var81 += var80 - var72;
                    int var84 = (this.field4344[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    this.field4344[var82] = (byte) var84;
                }
                var72 = var80;
                var73 = var79;
            }
            Object var76 = null;
            for (int var77 = var73; var77 < 128; var77++) {
                int var78 = (this.field4344[var77] & 0xFF) + var72;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field4344[var77] = (byte) var78;
            }
        }
        for (int var86 = 0; var86 < var15; var86++) {
            var19[var86].field492 = var3.method1051((byte) 118);
        }
        for (int var87 = 0; var87 < var15; var87++) {
            class25 var93 = var19[var87];
            if (var93.field489 != null) {
                var93.field478 = var3.method1051((byte) 86);
            }
            if (var93.field496 != null) {
                var93.field480 = var3.method1051((byte) -73);
            }
            if (var93.field492 > 0) {
                var93.field477 = var3.method1051((byte) -60);
            }
        }
        for (int var88 = 0; var88 < var15; var88++) {
            var19[var88].field481 = var3.method1051((byte) 101);
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class25 var92 = var19[var89];
            if (var92.field481 > 0) {
                var92.field491 = var3.method1051((byte) 105);
            }
        }
        for (int var90 = 0; var90 < var15; var90++) {
            class25 var91 = var19[var90];
            if (var91.field491 > 0) {
                var91.field482 = var3.method1051((byte) 106);
            }
        }
    }
}
