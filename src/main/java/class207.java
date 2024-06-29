import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class207 extends class59 {

    @OriginalMember(owner = "client!pi", name = "A", descriptor = "[B")
    public byte[] field3346;

    @OriginalMember(owner = "client!pi", name = "v", descriptor = "[Lig;")
    public class145[] field3341;

    @OriginalMember(owner = "client!pi", name = "B", descriptor = "[I")
    private int[] field3347;

    @OriginalMember(owner = "client!pi", name = "w", descriptor = "[S")
    public short[] field3342;

    @OriginalMember(owner = "client!pi", name = "E", descriptor = "[B")
    public byte[] field3350;

    @OriginalMember(owner = "client!pi", name = "x", descriptor = "[B")
    public byte[] field3343;

    @OriginalMember(owner = "client!pi", name = "y", descriptor = "[Lgi;")
    public class291[] field3344;

    @OriginalMember(owner = "client!pi", name = "G", descriptor = "I")
    public int field3352;

    @OriginalMember(owner = "client!pi", name = "C", descriptor = "Lok;")
    public static class41 field3348 = class137.method956(":clan:", 45);

    @OriginalMember(owner = "client!pi", name = "N", descriptor = "Z")
    public static boolean field3359 = true;

    @OriginalMember(owner = "client!pi", name = "z", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!pi", name = "D", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!pi", name = "F", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!pi", name = "H", descriptor = "I")
    public static int field3353;

    @OriginalMember(owner = "client!pi", name = "J", descriptor = "I")
    public static int field3355;

    @OriginalMember(owner = "client!pi", name = "L", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!pi", name = "M", descriptor = "I")
    public static int field3358;

    @OriginalMember(owner = "client!pi", name = "O", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!pi", name = "P", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!pi", name = "I", descriptor = "[I")
    public static int[] field3354;

    @OriginalMember(owner = "client!pi", name = "K", descriptor = "[[[Lnh;")
    public static class308[][][] field3356;

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(Llb;I)Lbl;", line = 6)
    public static final class146 method1461(class112 arg0, int arg1) {
        int var2 = 49 % ((16 - arg1) / 38);
        class146 var3 = new class146();
        field3358++;
        var3.field2226 = arg0.method759((byte) -124);
        var3.field2223 = class195.method1397((byte) -63, var3.field2226);
        return var3;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IZIII[BI[Lue;III)V", line = 20)
    public static final void method1462(int arg0, boolean arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, class223[] arg7, int arg8, int arg9, int arg10) {
        if (!arg1) {
            for (int var11 = 0; var11 < 8; var11++) {
                for (int var12 = 0; var12 < 8; var12++) {
                    if ((arg3 + var11) > 0 && arg3 + var11 < 103 && arg9 + var12 > 0 && (arg9 + var12) < 103) {
                        arg7[arg4].field3570[arg3 + var11][arg9 + var12] = class217.method1563(arg7[arg4].field3570[arg3 + var11][arg9 + var12], -16777217);
                    }
                }
            }
        }
        field3351++;
        byte var13;
        if (arg1) {
            var13 = 1;
        } else {
            var13 = 4;
        }
        if (arg0 >= -114) {
            method1463(-76);
        }
        class112 var14 = new class112(arg5);
        for (int var15 = 0; var15 < var13; var15++) {
            for (int var16 = 0; var16 < 64; var16++) {
                for (int var17 = 0; var17 < 64; var17++) {
                    if (arg2 == var15 && var16 >= arg6 && (arg6 + 8) > var16 && var17 >= arg8 && var17 < (arg8 + 8)) {
                        class315.method2180(0, class133.method929(var17 & 0x7, true, arg10, var16 & 0x7) + arg9, 0, arg10, arg4, var14, class245.method1752(arg10, 327997104, var17 & 0x7, var16 & 0x7) + arg3, arg1, -8932);
                    } else {
                        class315.method2180(0, -1, 0, 0, 0, var14, -1, arg1, -8932);
                    }
                }
            }
        }
        if (!class166.field2625 || arg1) {
            return;
        }
        class284 var18 = null;
        while (true) {
            while (var14.field1640 < var14.field1607.length) {
                int var19 = var14.method792(2);
                if (var19 == 0) {
                    var18 = new class284(var14);
                } else if (var19 == 1) {
                    int var20 = var14.method792(2);
                    if (var20 > 0) {
                        for (int var21 = 0; var21 < var20; var21++) {
                            class297 var22 = new class297(var14);
                            int var23 = var22.field4803 >> 7;
                            int var24 = var22.field4808 >> 7;
                            if (var22.field4813 == arg2 && arg6 <= var23 && (arg6 + 8) > var23 && var24 >= arg8 && var24 < (arg8 + 8)) {
                                int var25 = (arg3 << 7) + class244.method1744(var22.field4803 & 0x3FF, var22.field4808 & 0x3FF, arg10, 7364);
                                int var26 = class234.method1686(var22.field4808 & 0x3FF, -3, arg10, var22.field4803 & 0x3FF) + (arg9 << 7);
                                var22.field4803 = var25;
                                var22.field4808 = var26;
                                int var27 = var22.field4803 >> 7;
                                int var28 = var22.field4808 >> 7;
                                if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104) {
                                    var22.field4795 = class278.field4548[var22.field4813][var27][var28] - var22.field4795;
                                    class179.method1279(var22);
                                }
                            }
                        }
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
            if (var18 == null) {
                var18 = new class284();
            }
            class129.field1932[arg3 >> 3][arg9 >> 3] = var18;
            break;
        }
    }

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "(I)V", line = 176)
    public static void method1463(int arg0) {
        field3348 = null;
        field3356 = (class308[][][]) null;
        field3354 = null;
        int var1 = -88 / ((arg0 + 80) / 43);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(BLmh;)V", line = 198)
    public static final void method1464(byte arg0, class65 arg1) {
        if (arg0 >= 65) {
            field3349++;
            class212.field3408 = arg1;
        }
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "()V", line = 215)
    public class207() {
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lmh;I)V", line = 225)
    public static final void method1465(class65 arg0, int arg1) {
        field3345++;
        if (arg1 == 32) {
            class245.field3929 = arg0.method476(class88.field1297, (byte) 12);
            class165.field2609 = arg0.method476(class304.field5069, (byte) -10);
        }
    }

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "(B)V", line = 238)
    public final void method1466(byte arg0) {
        this.field3347 = null;
        field3361++;
        if (arg0 != 1) {
            field3353 = -69;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "([BLsb;[IB)Z", line = 253)
    public final boolean method1467(byte[] arg0, class133 arg1, int[] arg2, byte arg3) {
        if (arg3 != 19) {
            return true;
        }
        boolean var5 = true;
        field3357++;
        class291 var6 = null;
        int var7 = 0;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg0 == null || arg0[var8] != 0) {
                int var9 = this.field3347[var8];
                if (var9 != 0) {
                    if (var7 != var9) {
                        var7 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var6 = arg1.method937(arg3 + 16630, arg2, var9 >> 2);
                        } else {
                            var6 = arg1.method936(var9 >> 2, (byte) 110, arg2);
                        }
                        if (var6 == null) {
                            var5 = false;
                        }
                    }
                    if (var6 != null) {
                        this.field3344[var8] = var6;
                        this.field3347[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "([B)V", line = 313)
    public class207(byte[] arg0) {
        this.field3346 = new byte[128];
        this.field3341 = new class145[128];
        this.field3347 = new int[128];
        this.field3342 = new short[128];
        int var2 = 0;
        this.field3350 = new byte[128];
        this.field3343 = new byte[128];
        this.field3344 = new class291[128];
        class112 var3 = new class112(arg0);
        while (var3.field1607[var3.field1640 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method785((byte) -99);
        }
        var3.field1640++;
        var2++;
        int var6 = 0;
        int var7 = var3.field1640;
        var3.field1640 += var2;
        while (var3.field1607[var3.field1640 + var6] != 0) {
            var6++;
        }
        byte[] var8 = new byte[var6];
        for (int var9 = 0; var9 < var6; var9++) {
            var8[var9] = var3.method785((byte) -97);
        }
        var3.field1640++;
        var6++;
        int var10 = 0;
        int var11 = var3.field1640;
        var3.field1640 += var6;
        while (var3.field1607[var3.field1640 + var10] != 0) {
            var10++;
        }
        byte[] var12 = new byte[var10];
        for (int var13 = 0; var13 < var10; var13++) {
            var12[var13] = var3.method785((byte) -116);
        }
        var10++;
        var3.field1640++;
        byte[] var14 = new byte[var10];
        int var15;
        if (var10 > 1) {
            var15 = 2;
            var14[1] = 1;
            int var16 = 1;
            for (int var17 = 2; var17 < var10; var17++) {
                int var18 = var3.method792(2);
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
        class145[] var19 = new class145[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class145 var21 = var19[var20] = new class145();
            int var22 = var3.method792(2);
            if (var22 > 0) {
                var21.field2212 = new byte[var22 * 2];
            }
            int var23 = var3.method792(2);
            if (var23 > 0) {
                var21.field2213 = new byte[var23 * 2 + 2];
                var21.field2213[1] = 64;
            }
        }
        int var24 = var3.method792(2);
        int var25 = 0;
        byte[] var26 = var24 > 0 ? new byte[var24 * 2] : null;
        int var27 = var3.method792(2);
        byte[] var28 = var27 > 0 ? new byte[var27 * 2] : null;
        while (var3.field1607[var3.field1640 + var25] != 0) {
            var25++;
        }
        byte[] var29 = new byte[var25];
        for (int var30 = 0; var30 < var25; var30++) {
            var29[var30] = var3.method785((byte) -99);
        }
        int var31 = 0;
        var3.field1640++;
        var25++;
        for (int var32 = 0; var32 < 128; var32++) {
            var31 += var3.method792(2);
            this.field3342[var32] = (short) var31;
        }
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            var33 += var3.method792(2);
            this.field3342[var34] = (short) (this.field3342[var34] + (var33 << 8));
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (var35 == 0) {
                if (var29.length <= var36) {
                    var35 = -1;
                } else {
                    var35 = var29[var36++];
                }
                var37 = var3.method772((byte) -86);
            }
            this.field3342[var38] = (short) (this.field3342[var38] + (class217.method1563(var37 - 1, 2) << 14));
            var35--;
            this.field3347[var38] = var37;
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field3347[var42] != 0) {
                if (var40 == 0) {
                    var41 = var3.field1607[var7++] - 1;
                    if (var39 >= var4.length) {
                        var40 = -1;
                    } else {
                        var40 = var4[var39++];
                    }
                }
                var40--;
                this.field3346[var42] = (byte) var41;
            }
        }
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field3347[var46] != 0) {
                if (var43 == 0) {
                    if (var44 < var8.length) {
                        var43 = var8[var44++];
                    } else {
                        var43 = -1;
                    }
                    var45 = var3.field1607[var11++] + 16 << 2;
                }
                this.field3350[var46] = (byte) var45;
                var43--;
            }
        }
        int var47 = 0;
        class145 var48 = null;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (this.field3347[var50] != 0) {
                if (var47 == 0) {
                    var48 = var19[var14[var49]];
                    if (var12.length > var49) {
                        var47 = var12[var49++];
                    } else {
                        var47 = -1;
                    }
                }
                this.field3341[var50] = var48;
                var47--;
            }
        }
        int var51 = 0;
        int var52 = 0;
        int var53 = 0;
        for (int var54 = 0; var54 < 128; var54++) {
            if (var51 == 0) {
                if (var53 >= var29.length) {
                    var51 = -1;
                } else {
                    var51 = var29[var53++];
                }
                if (this.field3347[var54] > 0) {
                    var52 = var3.method792(2) + 1;
                }
            }
            var51--;
            this.field3343[var54] = (byte) var52;
        }
        this.field3352 = var3.method792(2) + 1;
        for (int var55 = 0; var55 < var15; var55++) {
            class145 var56 = var19[var55];
            if (var56.field2212 != null) {
                for (int var57 = 1; var57 < var56.field2212.length; var57 += 2) {
                    var56.field2212[var57] = var3.method785((byte) -102);
                }
            }
            if (var56.field2213 != null) {
                for (int var58 = 3; var58 < var56.field2213.length - 2; var58 += 2) {
                    var56.field2213[var58] = var3.method785((byte) -119);
                }
            }
        }
        if (var26 != null) {
            for (int var59 = 1; var59 < var26.length; var59 += 2) {
                var26[var59] = var3.method785((byte) -127);
            }
        }
        if (var28 != null) {
            for (int var60 = 1; var60 < var28.length; var60 += 2) {
                var28[var60] = var3.method785((byte) -108);
            }
        }
        for (int var61 = 0; var61 < var15; var61++) {
            class145 var62 = var19[var61];
            if (var62.field2213 != null) {
                int var63 = 0;
                for (int var64 = 2; var64 < var62.field2213.length; var64 += 2) {
                    var63 += var3.method792(2) + 1;
                    var62.field2213[var64] = (byte) var63;
                }
            }
        }
        for (int var65 = 0; var65 < var15; var65++) {
            class145 var66 = var19[var65];
            if (var66.field2212 != null) {
                int var67 = 0;
                for (int var68 = 2; var68 < var66.field2212.length; var68 += 2) {
                    var67 = (var67 + var3.method792(2)) + 1;
                    var66.field2212[var68] = (byte) var67;
                }
            }
        }
        if (var26 != null) {
            int var69 = var3.method792(2);
            var26[0] = (byte) var69;
            for (int var70 = 2; var70 < var26.length; var70 += 2) {
                var69 = var69 + var3.method792(2) + 1;
                var26[var70] = (byte) var69;
            }
            byte var71 = var26[1];
            byte var72 = var26[0];
            for (int var73 = 0; var73 < var72; var73++) {
                this.field3343[var73] = (byte) (this.field3343[var73] * var71 + 32 >> 6);
            }
            int var74 = 2;
            while (var26.length > var74) {
                byte var75 = var26[var74];
                byte var76 = var26[var74 + 1];
                int var77 = (var75 - var72) * var71 + ((var75 - var72) / 2);
                var74 += 2;
                for (int var78 = var72; var78 < var75; var78++) {
                    int var79 = class62.method433(var77, var75 - var72, 1059323807);
                    var77 += var76 - var71;
                    this.field3343[var78] = (byte) (this.field3343[var78] * var79 + 32 >> 6);
                }
                var72 = var75;
                var71 = var76;
            }
            Object var80 = null;
            for (int var81 = var72; var81 < 128; var81++) {
                this.field3343[var81] = (byte) (this.field3343[var81] * var71 + 32 >> 6);
            }
        }
        if (var28 != null) {
            int var82 = var3.method792(2);
            var28[0] = (byte) var82;
            for (int var83 = 2; var83 < var28.length; var83 += 2) {
                var82 = var82 + var3.method792(2) + 1;
                var28[var83] = (byte) var82;
            }
            byte var84 = var28[0];
            int var85 = var28[1] << 1;
            for (int var86 = 0; var86 < var84; var86++) {
                int var87 = (this.field3350[var86] & 0xFF) + var85;
                if (var87 < 0) {
                    var87 = 0;
                }
                if (var87 > 128) {
                    var87 = 128;
                }
                this.field3350[var86] = (byte) var87;
            }
            int var88 = 2;
            while (var28.length > var88) {
                int var89 = var28[var88 + 1] << 1;
                byte var90 = var28[var88];
                var88 += 2;
                int var91 = (var90 - var84) / 2 + (var90 - var84) * var85;
                for (int var92 = var84; var92 < var90; var92++) {
                    int var93 = class62.method433(var91, var90 - var84, 1059323807);
                    var91 += var89 - var85;
                    int var94 = (this.field3350[var92] & 0xFF) + var93;
                    if (var94 < 0) {
                        var94 = 0;
                    }
                    if (var94 > 128) {
                        var94 = 128;
                    }
                    this.field3350[var92] = (byte) var94;
                }
                var85 = var89;
                var84 = var90;
            }
            for (int var95 = var84; var95 < 128; var95++) {
                int var96 = (this.field3350[var95] & 0xFF) + var85;
                if (var96 < 0) {
                    var96 = 0;
                }
                if (var96 > 128) {
                    var96 = 128;
                }
                this.field3350[var95] = (byte) var96;
            }
            Object var97 = null;
        }
        for (int var98 = 0; var98 < var15; var98++) {
            var19[var98].field2204 = var3.method792(2);
        }
        for (int var99 = 0; var99 < var15; var99++) {
            class145 var100 = var19[var99];
            if (var100.field2212 != null) {
                var100.field2205 = var3.method792(2);
            }
            if (var100.field2213 != null) {
                var100.field2203 = var3.method792(2);
            }
            if (var100.field2204 > 0) {
                var100.field2202 = var3.method792(2);
            }
        }
        for (int var101 = 0; var101 < var15; var101++) {
            var19[var101].field2215 = var3.method792(2);
        }
        for (int var102 = 0; var102 < var15; var102++) {
            class145 var103 = var19[var102];
            if (var103.field2215 > 0) {
                var103.field2206 = var3.method792(2);
            }
        }
        for (int var104 = 0; var104 < var15; var104++) {
            class145 var105 = var19[var104];
            if (var105.field2206 > 0) {
                var105.field2216 = var3.method792(2);
            }
        }
    }
}
