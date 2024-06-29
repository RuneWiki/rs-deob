import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class78 extends class496 {

    @OriginalMember(owner = "client!cb", name = "r", descriptor = "[B")
    public byte[] field907;

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "[B")
    public byte[] field904;

    @OriginalMember(owner = "client!cb", name = "v", descriptor = "[B")
    public byte[] field911;

    @OriginalMember(owner = "client!cb", name = "s", descriptor = "[S")
    public short[] field908;

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "[I")
    private int[] field905;

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "[Lfa;")
    public class482[] field902;

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "[Lmca;")
    public class5[] field906;

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "I")
    public int field900;

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "Lqu;")
    public static class364 field903 = new class364(56, -1);

    @OriginalMember(owner = "client!cb", name = "w", descriptor = "F")
    public static float field912;

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "I")
    public static int field899;

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "I")
    public static int field901;

    @OriginalMember(owner = "client!cb", name = "t", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "client!cb", name = "u", descriptor = "I")
    public static int field910;

    @OriginalMember(owner = "client!cb", name = "x", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)V")
    public static final void method452(byte arg0) {
        class325 var1 = class161.field2155;
        synchronized (class161.field2155) {
            class161.field2155.method2037(true);
            if (arg0 != -109) {
                field903 = null;
            }
        }
        field901++;
        class325 var2 = class19.field173;
        synchronized (class19.field173) {
            class19.field173.method2037(true);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
    public final void method453(int arg0) {
        field899++;
        if (arg0 > 100) {
            this.field905 = null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "()V")
    public static final void method454() {
        if (class387.field5663 != null) {
            for (int var0 = 0; var0 < class387.field5663.length; var0++) {
                for (int var1 = 0; var1 < class331.field4909; var1++) {
                    for (int var2 = 0; var2 < class366.field5271; var2++) {
                        if (class387.field5663[var0][var1][var2] != null) {
                            class387.field5663[var0][var1][var2].method2476(false);
                        }
                        class387.field5663[var0][var1][var2] = null;
                    }
                }
            }
        }
        class387.field5663 = null;
        class562.field8337 = null;
        if (class32.field330 != null) {
            for (int var3 = 0; var3 < class32.field330.length; var3++) {
                for (int var4 = 0; var4 < class331.field4909; var4++) {
                    for (int var5 = 0; var5 < class366.field5271; var5++) {
                        if (class32.field330[var3][var4][var5] != null) {
                            class32.field330[var3][var4][var5].method2476(false);
                        }
                        class32.field330[var3][var4][var5] = null;
                    }
                }
            }
        }
        class32.field330 = null;
        class287.field4219 = null;
        class526.field7777 = null;
        class235.field3455 = null;
        class382.field5585 = 0;
        if (class595.field8777 != null) {
            for (int var6 = 0; var6 < class382.field5585; var6++) {
                class595.field8777[var6] = null;
            }
        }
        if (class135.field1788 != null) {
            for (int var7 = 0; var7 < class516.field7651; var7++) {
                class135.field1788[var7] = null;
            }
            class516.field7651 = 0;
        }
        if (class29.field260 != null) {
            for (int var8 = 0; var8 < class318.field4753; var8++) {
                class29.field260[var8] = null;
            }
            for (int var9 = 0; var9 < class487.field7383; var9++) {
                for (int var10 = 0; var10 < class331.field4909; var10++) {
                    for (int var11 = 0; var11 < class366.field5271; var11++) {
                        class22.field199[var9][var10][var11] = 0L;
                    }
                }
            }
            class318.field4753 = 0;
        }
        class273.field4040 = null;
        class497.method3001((byte) -42);
        class147.field1903.method778((byte) 113);
        class642.field9324 = null;
        class206.field3077 = null;
        class143.field1861 = null;
        class298.field4354 = null;
        class185.field2812 = null;
        class139.field1827 = null;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(CI)Z")
    public static final boolean method455(char arg0, int arg1) {
        field913++;
        int var2 = 0 / ((arg1 - 88) / 37);
        return arg0 >= '0' && arg0 <= '9';
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "([BZLgv;[I)Z")
    public final boolean method456(byte[] arg0, boolean arg1, class300 arg2, int[] arg3) {
        field909++;
        boolean var5 = true;
        int var6 = 0;
        class5 var7 = null;
        if (arg1) {
            method452((byte) -1);
        }
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg0 == null || arg0[var8] != 0) {
                int var9 = this.field905[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg2.method1859(-22055, arg3, var9 >> 2);
                        } else {
                            var7 = arg2.method1858(arg3, var9 >> 2, 1);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field906[var8] = var7;
                        this.field905[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(B)V")
    public static void method457(byte arg0) {
        int var1 = 88 % ((arg0 + 18) / 36);
        field903 = null;
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "()V")
    public class78() {
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "([B)V")
    public class78(byte[] arg0) {
        this.field907 = new byte[128];
        this.field904 = new byte[128];
        this.field911 = new byte[128];
        this.field908 = new short[128];
        this.field905 = new int[128];
        this.field902 = new class482[128];
        this.field906 = new class5[128];
        class428 var2 = new class428(arg0);
        int var3;
        for (var3 = 0; var2.field6162[var2.field6221 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method2570((byte) 57);
        }
        var2.field6221++;
        var3++;
        int var6 = var2.field6221;
        var2.field6221 += var3;
        int var7;
        for (var7 = 0; var2.field6162[var2.field6221 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method2570((byte) 57);
        }
        var7++;
        var2.field6221++;
        int var10 = var2.field6221;
        var2.field6221 += var7;
        int var11;
        for (var11 = 0; var2.field6162[var2.field6221 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method2570((byte) 57);
        }
        var2.field6221++;
        var11++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 > 1) {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var2.method2561((byte) 114);
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
        class482[] var19 = new class482[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class482 var103 = var19[var20] = new class482();
            int var104 = var2.method2561((byte) -100);
            if (var104 > 0) {
                var103.field7316 = new byte[var104 * 2];
            }
            int var105 = var2.method2561((byte) -42);
            if (var105 > 0) {
                var103.field7306 = new byte[var105 * 2 + 2];
                var103.field7306[1] = 64;
            }
        }
        int var21 = var2.method2561((byte) -17);
        byte[] var22 = var21 > 0 ? new byte[var21 * 2] : null;
        int var23 = var2.method2561((byte) -91);
        byte[] var24 = var23 <= 0 ? null : new byte[var23 * 2];
        int var25;
        for (var25 = 0; var2.field6162[var2.field6221 + var25] != 0; var25++) {
        }
        byte[] var26 = new byte[var25];
        for (int var27 = 0; var27 < var25; var27++) {
            var26[var27] = var2.method2570((byte) 57);
        }
        var25++;
        var2.field6221++;
        int var28 = 0;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var2.method2561((byte) 107);
            this.field908[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var2.method2561((byte) 116);
            this.field908[var31] = (short) (this.field908[var31] + (var30 << 8));
        }
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        for (int var35 = 0; var35 < 128; var35++) {
            if (var32 == 0) {
                if (var26.length > var33) {
                    var32 = var26[var33++];
                } else {
                    var32 = -1;
                }
                var34 = var2.method2568(false);
            }
            this.field908[var35] = (short) (this.field908[var35] + (class637.method3693(2, var34 - 1) << 14));
            this.field905[var35] = var34;
            var32--;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field905[var39] != 0) {
                if (var36 == 0) {
                    var38 = var2.field6162[var6++] - 1;
                    if (var4.length > var37) {
                        var36 = var4[var37++];
                    } else {
                        var36 = -1;
                    }
                }
                this.field911[var39] = (byte) var38;
                var36--;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field905[var43] != 0) {
                if (var40 == 0) {
                    if (var41 < var8.length) {
                        var40 = var8[var41++];
                    } else {
                        var40 = -1;
                    }
                    var42 = var2.field6162[var10++] + 16 << 2;
                }
                var40--;
                this.field907[var43] = (byte) var42;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class482 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field905[var47] != 0) {
                if (var45 == 0) {
                    var46 = var19[var14[var44]];
                    if (var44 < var12.length) {
                        var45 = var12[var44++];
                    } else {
                        var45 = -1;
                    }
                }
                var45--;
                this.field902[var47] = var46;
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
                if (this.field905[var51] > 0) {
                    var50 = var2.method2561((byte) -73) + 1;
                }
            }
            var49--;
            this.field904[var51] = (byte) var50;
        }
        this.field900 = var2.method2561((byte) -35) + 1;
        for (int var52 = 0; var52 < var15; var52++) {
            class482 var100 = var19[var52];
            if (var100.field7316 != null) {
                for (int var101 = 1; var101 < var100.field7316.length; var101 += 2) {
                    var100.field7316[var101] = var2.method2570((byte) 57);
                }
            }
            if (var100.field7306 != null) {
                for (int var102 = 3; var102 < var100.field7306.length - 2; var102 += 2) {
                    var100.field7306[var102] = var2.method2570((byte) 57);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var2.method2570((byte) 57);
            }
        }
        if (var24 != null) {
            for (int var54 = 1; var54 < var24.length; var54 += 2) {
                var24[var54] = var2.method2570((byte) 57);
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class482 var97 = var19[var55];
            if (var97.field7306 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field7306.length; var99 += 2) {
                    var98 -= -var2.method2561((byte) 116) - 1;
                    var97.field7306[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var15; var56++) {
            class482 var94 = var19[var56];
            if (var94.field7316 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field7316.length; var96 += 2) {
                    var95 = var2.method2561((byte) -39) + var95 + 1;
                    var94.field7316[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var2.method2561((byte) -58);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 = var57 + var2.method2561((byte) -13) + 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[0];
            byte var60 = var22[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field904[var61] = (byte) (this.field904[var61] * var60 + 32 >> 6);
            }
            for (int var62 = 2; var62 < var22.length; var62 += 2) {
                byte var65 = var22[var62];
                byte var66 = var22[var62 + 1];
                int var67 = (var65 - var59) / 2 + (var65 - var59) * var60;
                for (int var68 = var59; var68 < var65; var68++) {
                    int var69 = class277.method1752(var67, var65 - var59, (byte) -109);
                    var67 += var66 - var60;
                    this.field904[var68] = (byte) (this.field904[var68] * var69 + 32 >> 6);
                }
                var59 = var65;
                var60 = var66;
            }
            for (int var63 = var59; var63 < 128; var63++) {
                this.field904[var63] = (byte) (this.field904[var63] * var60 + 32 >> 6);
            }
            Object var64 = null;
        }
        if (var24 != null) {
            int var70 = var2.method2561((byte) -36);
            var24[0] = (byte) var70;
            for (int var71 = 2; var71 < var24.length; var71 += 2) {
                var70 = var70 + var2.method2561((byte) -66) + 1;
                var24[var71] = (byte) var70;
            }
            byte var72 = var24[0];
            int var73 = var24[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field907[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field907[var74] = (byte) var85;
            }
            for (int var75 = 2; var75 < var24.length; var75 += 2) {
                byte var79 = var24[var75];
                int var80 = var24[var75 + 1] << 1;
                int var81 = (var79 - var72) / 2 + (var79 - var72) * var73;
                for (int var82 = var72; var82 < var79; var82++) {
                    int var83 = class277.method1752(var81, var79 - var72, (byte) -109);
                    int var84 = (this.field907[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    var81 += var80 - var73;
                    this.field907[var82] = (byte) var84;
                }
                var72 = var79;
                var73 = var80;
            }
            Object var76 = null;
            for (int var77 = var72; var77 < 128; var77++) {
                int var78 = (this.field907[var77] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field907[var77] = (byte) var78;
            }
        }
        for (int var86 = 0; var86 < var15; var86++) {
            var19[var86].field7314 = var2.method2561((byte) -54);
        }
        for (int var87 = 0; var87 < var15; var87++) {
            class482 var93 = var19[var87];
            if (var93.field7316 != null) {
                var93.field7307 = var2.method2561((byte) -79);
            }
            if (var93.field7306 != null) {
                var93.field7310 = var2.method2561((byte) -88);
            }
            if (var93.field7314 > 0) {
                var93.field7315 = var2.method2561((byte) 127);
            }
        }
        for (int var88 = 0; var88 < var15; var88++) {
            var19[var88].field7318 = var2.method2561((byte) 115);
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class482 var92 = var19[var89];
            if (var92.field7318 > 0) {
                var92.field7317 = var2.method2561((byte) 108);
            }
        }
        for (int var90 = 0; var90 < var15; var90++) {
            class482 var91 = var19[var90];
            if (var91.field7317 > 0) {
                var91.field7313 = var2.method2561((byte) -86);
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IILcd;IIIILcd;II)V")
    public static final void method458(int arg0, int arg1, class86 arg2, int arg3, int arg4, int arg5, int arg6, class86 arg7, int arg8, int arg9) {
        field898++;
        int var10 = arg2.method503(-1);
        if (var10 == -1) {
            return;
        }
        Object var11 = null;
        class116 var12 = (class116) class120.field1560.method2025((long) var10, 2);
        if (arg6 != 13450) {
            field912 = -0.5082218F;
        }
        if (var12 == null) {
            class610[] var13 = class610.method3547(class371.field5368, var10, 0);
            if (var13 == null) {
                return;
            }
            var12 = class379.field5558.method961(var13[0], true);
            class120.field1560.method2029(false, var12, (long) var10);
        }
        class509.method3039(0, arg9, arg7.field3464, arg0 >> 1, arg4 >> 1, arg7.field3457, arg7.field3463, arg5, arg7.method514(0) * 64, true);
        int var14 = class543.field8117[0] + arg1 - 18;
        int var15 = arg3 / 4 * 18 + var14;
        int var16 = class543.field8117[1] + arg8 - 16 - 54;
        int var17 = arg3 % 4 * 18 + var16;
        var12.method723(var15, var17);
        if (arg2 == arg7) {
            class379.field5558.method1067(18, (byte) -55, -256, 18, var17 - 1, var15 + -1);
        }
        class25 var18 = class2.method6((byte) -48);
        var18.field226 = var15;
        var18.field222 = var15 + 16;
        var18.field223 = var17;
        var18.field224 = var17 + 16;
        var18.field221 = arg2;
        class142.field1855.method770(-65537, var18);
    }
}
