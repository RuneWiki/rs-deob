import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class191 extends class184 {

    @OriginalMember(owner = "client!ka", name = "I", descriptor = "[B")
    public byte[] field3469;

    @OriginalMember(owner = "client!ka", name = "J", descriptor = "[B")
    public byte[] field3470;

    @OriginalMember(owner = "client!ka", name = "B", descriptor = "[Lgm;")
    public class297[] field3462;

    @OriginalMember(owner = "client!ka", name = "D", descriptor = "[B")
    public byte[] field3464;

    @OriginalMember(owner = "client!ka", name = "A", descriptor = "[I")
    private int[] field3461;

    @OriginalMember(owner = "client!ka", name = "H", descriptor = "[Ltd;")
    public class244[] field3468;

    @OriginalMember(owner = "client!ka", name = "y", descriptor = "[S")
    public short[] field3459;

    @OriginalMember(owner = "client!ka", name = "z", descriptor = "I")
    public int field3460;

    @OriginalMember(owner = "client!ka", name = "w", descriptor = "I")
    public static int field3457 = 0;

    @OriginalMember(owner = "client!ka", name = "v", descriptor = "Lof;")
    public static class242 field3456 = new class242(8);

    @OriginalMember(owner = "client!ka", name = "K", descriptor = "I")
    public static int field3471 = 0;

    @OriginalMember(owner = "client!ka", name = "L", descriptor = "[[S")
    public static short[][] field3472 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!ka", name = "O", descriptor = "Lsf;")
    public static class108 field3475 = class140.method973(255, " loggt sich ein)3");

    @OriginalMember(owner = "client!ka", name = "P", descriptor = "[Z")
    public static boolean[] field3476 = new boolean[5];

    @OriginalMember(owner = "client!ka", name = "x", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!ka", name = "C", descriptor = "I")
    public static int field3463;

    @OriginalMember(owner = "client!ka", name = "E", descriptor = "I")
    public static int field3465;

    @OriginalMember(owner = "client!ka", name = "F", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!ka", name = "G", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!ka", name = "M", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!ka", name = "Q", descriptor = "Lwk;")
    public static class177 field3477;

    @OriginalMember(owner = "client!ka", name = "N", descriptor = "[[S")
    public static short[][] field3474;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIII)V", line = 5)
    public static final void method1353(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3463++;
        if (arg1 <= 35) {
            method1353(44, -114, -111, 27, 19, -62);
        }
        for (int var6 = arg4; var6 <= arg3; var6++) {
            class209.method1452(arg2, class106.field1839[var6], 7, arg0, arg5);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[BLnh;[I)Z", line = 34)
    public final boolean method1354(int arg0, byte[] arg1, class115 arg2, int[] arg3) {
        field3467++;
        boolean var5 = true;
        class244 var6 = null;
        int var7 = 0;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg1 == null || arg1[var8] != 0) {
                int var9 = this.field3461[var8];
                if (var9 != 0) {
                    if (var7 != var9) {
                        var7 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var6 = arg2.method820(false, arg3, var9 >> 2);
                        } else {
                            var6 = arg2.method824(var9 >> 2, arg3, (byte) 124);
                        }
                        if (var6 == null) {
                            var5 = false;
                        }
                    }
                    if (var6 != null) {
                        this.field3468[var8] = var6;
                        this.field3461[var8] = 0;
                    }
                }
            }
        }
        if (arg0 != -13249) {
            this.field3469 = (byte[]) null;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIIZBF)[I", line = 99)
    public static final int[] method1355(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte arg6, float arg7) {
        field3466++;
        class283 var8 = new class283();
        var8.field4964 = arg1;
        var8.field4959 = arg0;
        var8.field4966 = arg2;
        var8.field4951 = (int) (arg7 * 4096.0F);
        if (arg6 <= 112) {
            field3476 = (boolean[]) null;
        }
        var8.field4944 = arg5;
        int[] var9 = new int[arg4];
        var8.field4949 = arg3;
        var8.method116(true);
        class316.method2199(arg4, 1, -32527);
        var8.method2038(var9, 0, (byte) -55);
        return var9;
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(B)V", line = 124)
    public static final void method1356(byte arg0) {
        class121.field2069.method644((byte) 55);
        if (arg0 < 50) {
            method1355(-54, 68, 85, -76, -37, false, (byte) -22, 0.39083263F);
        }
        field3465++;
        class260.field4586.method644((byte) 60);
        class110.field1928.method644((byte) 45);
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(I)V", line = 140)
    public static void method1357(int arg0) {
        field3475 = null;
        field3472 = (short[][]) null;
        if (arg0 != 5904) {
            method1356((byte) -95);
        }
        field3477 = null;
        field3456 = null;
        field3474 = (short[][]) null;
        field3476 = null;
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(Z)V", line = 157)
    public final void method1358(boolean arg0) {
        if (arg0) {
            field3477 = (class177) null;
        }
        this.field3461 = null;
        field3458++;
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(I)Lse;", line = 178)
    public static final class12 method1359(int arg0) {
        field3473++;
        int var1 = class273.field4795[0] * class155.field2780[0];
        byte[] var2 = class94.field1512[0];
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class321.field5494[class162.method1118(255, var2[var4])];
        }
        class12 var5 = new class12(class95.field1519, class197.field3560, class154.field2775[0], class88.field1383[0], class155.field2780[0], class273.field4795[0], var3);
        class15.method100(1);
        if (arg0 != 2) {
            field3477 = (class177) null;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "()V", line = 214)
    public class191() {
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "([B)V", line = 217)
    public class191(byte[] arg0) {
        this.field3469 = new byte[128];
        this.field3470 = new byte[128];
        this.field3462 = new class297[128];
        this.field3464 = new byte[128];
        this.field3461 = new int[128];
        this.field3468 = new class244[128];
        this.field3459 = new short[128];
        int var2 = 0;
        class249 var3 = new class249(arg0);
        while (var3.field4338[var3.field4314 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method1721((byte) 126);
        }
        var3.field4314++;
        int var6 = var3.field4314;
        int var7 = 0;
        var2++;
        var3.field4314 += var2;
        while (var3.field4338[var3.field4314 + var7] != 0) {
            var7++;
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method1721((byte) 51);
        }
        var7++;
        var3.field4314++;
        int var10 = var3.field4314;
        var3.field4314 += var7;
        int var11;
        for (var11 = 0; var3.field4338[var3.field4314 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var3.method1721((byte) 43);
        }
        var3.field4314++;
        var11++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 <= 1) {
            var15 = var11;
        } else {
            var15 = 2;
            var14[1] = 1;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var3.method1731(true);
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
        class297[] var19 = new class297[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class297 var21 = var19[var20] = new class297();
            int var22 = var3.method1731(true);
            if (var22 > 0) {
                var21.field5181 = new byte[var22 * 2];
            }
            int var23 = var3.method1731(true);
            if (var23 > 0) {
                var21.field5177 = new byte[var23 * 2 + 2];
                var21.field5177[1] = 64;
            }
        }
        int var24 = var3.method1731(true);
        byte[] var25 = var24 > 0 ? new byte[var24 * 2] : null;
        int var26 = var3.method1731(true);
        byte[] var27 = var26 <= 0 ? null : new byte[var26 * 2];
        int var28;
        for (var28 = 0; var3.field4338[var3.field4314 + var28] != 0; var28++) {
        }
        byte[] var29 = new byte[var28];
        for (int var30 = 0; var30 < var28; var30++) {
            var29[var30] = var3.method1721((byte) 105);
        }
        var3.field4314++;
        int var31 = 0;
        var28++;
        for (int var32 = 0; var32 < 128; var32++) {
            var31 += var3.method1731(true);
            this.field3459[var32] = (short) var31;
        }
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            var33 += var3.method1731(true);
            this.field3459[var34] = (short) (this.field3459[var34] + (var33 << 8));
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (var35 == 0) {
                if (var29.length > var36) {
                    var35 = var29[var36++];
                } else {
                    var35 = -1;
                }
                var37 = var3.method1727(true);
            }
            this.field3459[var38] = (short) (this.field3459[var38] + class162.method1118(var37 - 1 << 14, 32768));
            this.field3461[var38] = var37;
            var35--;
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field3461[var42] != 0) {
                if (var40 == 0) {
                    var41 = var3.field4338[var6++] - 1;
                    if (var4.length > var39) {
                        var40 = var4[var39++];
                    } else {
                        var40 = -1;
                    }
                }
                this.field3470[var42] = (byte) var41;
                var40--;
            }
        }
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field3461[var46] != 0) {
                if (var44 == 0) {
                    var45 = var3.field4338[var10++] + 16 << 2;
                    if (var43 >= var8.length) {
                        var44 = -1;
                    } else {
                        var44 = var8[var43++];
                    }
                }
                this.field3469[var46] = (byte) var45;
                var44--;
            }
        }
        int var47 = 0;
        int var48 = 0;
        class297 var49 = null;
        for (int var50 = 0; var50 < 128; var50++) {
            if (this.field3461[var50] != 0) {
                if (var47 == 0) {
                    var49 = var19[var14[var48]];
                    if (var12.length > var48) {
                        var47 = var12[var48++];
                    } else {
                        var47 = -1;
                    }
                }
                var47--;
                this.field3462[var50] = var49;
            }
        }
        int var51 = 0;
        int var52 = 0;
        int var53 = 0;
        for (int var54 = 0; var54 < 128; var54++) {
            if (var53 == 0) {
                if (var51 >= var29.length) {
                    var53 = -1;
                } else {
                    var53 = var29[var51++];
                }
                if (this.field3461[var54] > 0) {
                    var52 = var3.method1731(true) + 1;
                }
            }
            this.field3464[var54] = (byte) var52;
            var53--;
        }
        this.field3460 = var3.method1731(true) + 1;
        for (int var55 = 0; var55 < var15; var55++) {
            class297 var56 = var19[var55];
            if (var56.field5181 != null) {
                for (int var57 = 1; var57 < var56.field5181.length; var57 += 2) {
                    var56.field5181[var57] = var3.method1721((byte) 60);
                }
            }
            if (var56.field5177 != null) {
                for (int var58 = 3; var58 < var56.field5177.length - 2; var58 += 2) {
                    var56.field5177[var58] = var3.method1721((byte) 69);
                }
            }
        }
        if (var25 != null) {
            for (int var59 = 1; var59 < var25.length; var59 += 2) {
                var25[var59] = var3.method1721((byte) 125);
            }
        }
        if (var27 != null) {
            for (int var60 = 1; var60 < var27.length; var60 += 2) {
                var27[var60] = var3.method1721((byte) 44);
            }
        }
        for (int var61 = 0; var61 < var15; var61++) {
            class297 var62 = var19[var61];
            if (var62.field5177 != null) {
                int var63 = 0;
                for (int var64 = 2; var64 < var62.field5177.length; var64 += 2) {
                    var63 += var3.method1731(true) + 1;
                    var62.field5177[var64] = (byte) var63;
                }
            }
        }
        for (int var65 = 0; var65 < var15; var65++) {
            class297 var66 = var19[var65];
            if (var66.field5181 != null) {
                int var67 = 0;
                for (int var68 = 2; var68 < var66.field5181.length; var68 += 2) {
                    var67 = var67 + var3.method1731(true) + 1;
                    var66.field5181[var68] = (byte) var67;
                }
            }
        }
        if (var25 != null) {
            int var69 = var3.method1731(true);
            var25[0] = (byte) var69;
            for (int var70 = 2; var70 < var25.length; var70 += 2) {
                var69 = var3.method1731(true) + var69 + 1;
                var25[var70] = (byte) var69;
            }
            byte var71 = var25[0];
            byte var72 = var25[1];
            for (int var73 = 0; var73 < var71; var73++) {
                this.field3464[var73] = (byte) (this.field3464[var73] * var72 + 32 >> 6);
            }
            int var74 = 2;
            while (var25.length > var74) {
                byte var75 = var25[var74];
                int var76 = (var75 - var71) * var72 + ((var75 - var71) / 2);
                byte var77 = var25[var74 + 1];
                for (int var78 = var71; var78 < var75; var78++) {
                    int var79 = class247.method1700(var75 - var71, (byte) 99, var76);
                    var76 += var77 - var72;
                    this.field3464[var78] = (byte) (this.field3464[var78] * var79 + 32 >> 6);
                }
                var74 += 2;
                var71 = var75;
                var72 = var77;
            }
            for (int var80 = var71; var80 < 128; var80++) {
                this.field3464[var80] = (byte) (this.field3464[var80] * var72 + 32 >> 6);
            }
            Object var81 = null;
        }
        if (var27 != null) {
            int var82 = var3.method1731(true);
            var27[0] = (byte) var82;
            for (int var83 = 2; var83 < var27.length; var83 += 2) {
                var82 = var82 + var3.method1731(true) + 1;
                var27[var83] = (byte) var82;
            }
            int var84 = var27[1] << 1;
            byte var85 = var27[0];
            for (int var86 = 0; var86 < var85; var86++) {
                int var87 = (this.field3469[var86] & 0xFF) + var84;
                if (var87 < 0) {
                    var87 = 0;
                }
                if (var87 > 128) {
                    var87 = 128;
                }
                this.field3469[var86] = (byte) var87;
            }
            int var88 = 2;
            while (var27.length > var88) {
                byte var89 = var27[var88];
                int var90 = var27[var88 + 1] << 1;
                var88 += 2;
                int var91 = (var89 - var85) / 2 + (var89 - var85) * var84;
                for (int var92 = var85; var92 < var89; var92++) {
                    int var93 = class247.method1700(var89 - var85, (byte) 58, var91);
                    int var94 = (this.field3469[var92] & 0xFF) + var93;
                    if (var94 < 0) {
                        var94 = 0;
                    }
                    var91 += var90 - var84;
                    if (var94 > 128) {
                        var94 = 128;
                    }
                    this.field3469[var92] = (byte) var94;
                }
                var85 = var89;
                var84 = var90;
            }
            Object var95 = null;
            for (int var96 = var85; var96 < 128; var96++) {
                int var97 = (this.field3469[var96] & 0xFF) + var84;
                if (var97 < 0) {
                    var97 = 0;
                }
                if (var97 > 128) {
                    var97 = 128;
                }
                this.field3469[var96] = (byte) var97;
            }
        }
        for (int var98 = 0; var98 < var15; var98++) {
            var19[var98].field5175 = var3.method1731(true);
        }
        for (int var99 = 0; var99 < var15; var99++) {
            class297 var100 = var19[var99];
            if (var100.field5181 != null) {
                var100.field5182 = var3.method1731(true);
            }
            if (var100.field5177 != null) {
                var100.field5179 = var3.method1731(true);
            }
            if (var100.field5175 > 0) {
                var100.field5171 = var3.method1731(true);
            }
        }
        for (int var101 = 0; var101 < var15; var101++) {
            var19[var101].field5178 = var3.method1731(true);
        }
        for (int var102 = 0; var102 < var15; var102++) {
            class297 var103 = var19[var102];
            if (var103.field5178 > 0) {
                var103.field5173 = var3.method1731(true);
            }
        }
        for (int var104 = 0; var104 < var15; var104++) {
            class297 var105 = var19[var104];
            if (var105.field5173 > 0) {
                var105.field5170 = var3.method1731(true);
            }
        }
    }
}
