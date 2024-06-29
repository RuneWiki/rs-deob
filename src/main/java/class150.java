import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class150 extends class68 {

    @OriginalMember(owner = "client!bc", name = "C", descriptor = "[S")
    public short[] field2752;

    @OriginalMember(owner = "client!bc", name = "x", descriptor = "[Lpf;")
    public class249[] field2747;

    @OriginalMember(owner = "client!bc", name = "z", descriptor = "[B")
    public byte[] field2749;

    @OriginalMember(owner = "client!bc", name = "w", descriptor = "[Loj;")
    public class156[] field2746;

    @OriginalMember(owner = "client!bc", name = "r", descriptor = "[B")
    public byte[] field2741;

    @OriginalMember(owner = "client!bc", name = "t", descriptor = "[I")
    private int[] field2743;

    @OriginalMember(owner = "client!bc", name = "A", descriptor = "[B")
    public byte[] field2750;

    @OriginalMember(owner = "client!bc", name = "F", descriptor = "I")
    public int field2754;

    @OriginalMember(owner = "client!bc", name = "u", descriptor = "Lce;")
    public static class126 field2744 = class206.method1445(-7923, "n");

    @OriginalMember(owner = "client!bc", name = "H", descriptor = "I")
    public static int field2756 = 0;

    @OriginalMember(owner = "client!bc", name = "v", descriptor = "I")
    public static int field2745;

    @OriginalMember(owner = "client!bc", name = "y", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "client!bc", name = "B", descriptor = "I")
    public static int field2751;

    @OriginalMember(owner = "client!bc", name = "D", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!bc", name = "G", descriptor = "I")
    public static int field2755;

    @OriginalMember(owner = "client!bc", name = "s", descriptor = "Lwd;")
    public static class112 field2742;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)V", line = 24)
    public final void method1117(int arg0) {
        this.field2743 = null;
        field2755++;
        if (arg0 != 1) {
            this.field2747 = (class249[]) null;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IILcj;I)V", line = 35)
    public static final void method1118(int arg0, int arg1, class301 arg2, int arg3) {
        if (arg0 != -1) {
            return;
        }
        field2748++;
        if (arg2.field2476 == arg3 && arg3 != -1) {
            class294 var4 = class110.method721(-126, arg3);
            int var5 = var4.field4884;
            if (var5 == 1) {
                arg2.field2509 = 0;
                arg2.field2508 = 0;
                arg2.field2449 = arg1;
                arg2.field2484 = 0;
                class241.method1660(arg2.field2509, arg2.field2461, class286.field4744 == arg2, arg2.field2487, var4, (byte) -70);
            }
            if (var5 == 2) {
                arg2.field2508 = 0;
            }
        } else if (arg3 == -1 || arg2.field2476 == -1 || class110.method721(-125, arg3).field4878 >= class110.method721(-124, arg2.field2476).field4878) {
            arg2.field2485 = arg2.field2489;
            arg2.field2484 = 0;
            arg2.field2449 = arg1;
            arg2.field2476 = arg3;
            arg2.field2509 = 0;
            arg2.field2508 = 0;
            if (arg2.field2476 != -1) {
                class241.method1660(arg2.field2509, arg2.field2461, class286.field4744 == arg2, arg2.field2487, class110.method721(-124, arg2.field2476), (byte) -124);
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(I)V", line = 84)
    public static void method1119(int arg0) {
        if (arg0 != 21290) {
            field2751 = 9;
        }
        field2742 = null;
        field2744 = null;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lsk;[I[BI)Z", line = 97)
    public final boolean method1120(class269 arg0, int[] arg1, byte[] arg2, int arg3) {
        field2753++;
        boolean var5 = true;
        int var6 = 0;
        if (arg3 >= -20) {
            return false;
        }
        class156 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg2 == null || arg2[var8] != 0) {
                int var9 = this.field2743[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg0.method1813(arg1, var9 >> 2, -68);
                        } else {
                            var7 = arg0.method1811(arg1, var9 >> 2, (byte) -31);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field2746[var8] = var7;
                        this.field2743[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(II)I", line = 161)
    public static final int method1121(int arg0, int arg1) {
        field2745++;
        if (arg1 != -7634) {
            method1119(-51);
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "()V", line = 171)
    public class150() {
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "([B)V", line = 174)
    public class150(byte[] arg0) {
        this.field2752 = new short[128];
        this.field2747 = new class249[128];
        this.field2749 = new byte[128];
        this.field2746 = new class156[128];
        this.field2741 = new byte[128];
        this.field2743 = new int[128];
        int var2 = 0;
        this.field2750 = new byte[128];
        class134 var3 = new class134(arg0);
        while (var3.field2282[var3.field2299 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method977(19773);
        }
        var2++;
        int var6 = 0;
        var3.field2299++;
        int var7 = var3.field2299;
        var3.field2299 += var2;
        while (var3.field2282[var3.field2299 + var6] != 0) {
            var6++;
        }
        byte[] var8 = new byte[var6];
        for (int var9 = 0; var9 < var6; var9++) {
            var8[var9] = var3.method977(19773);
        }
        var3.field2299++;
        int var10 = var3.field2299;
        int var11 = 0;
        var6++;
        var3.field2299 += var6;
        while (var3.field2282[var3.field2299 + var11] != 0) {
            var11++;
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var3.method977(19773);
        }
        var3.field2299++;
        var11++;
        byte[] var14 = new byte[var11];
        int var16;
        if (var11 > 1) {
            var14[1] = 1;
            int var15 = 1;
            var16 = 2;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var3.method948(-123);
                if (var18 == 0) {
                    var15 = var16++;
                } else {
                    if (var18 <= var15) {
                        var18--;
                    }
                    var15 = var18;
                }
                var14[var17] = (byte) var15;
            }
        } else {
            var16 = var11;
        }
        class249[] var19 = new class249[var16];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class249 var21 = var19[var20] = new class249();
            int var22 = var3.method948(-127);
            if (var22 > 0) {
                var21.field4163 = new byte[var22 * 2];
            }
            int var23 = var3.method948(-128);
            if (var23 > 0) {
                var21.field4169 = new byte[var23 * 2 + 2];
                var21.field4169[1] = 64;
            }
        }
        int var24 = var3.method948(-121);
        byte[] var25 = var24 > 0 ? new byte[var24 * 2] : null;
        int var26 = var3.method948(-123);
        byte[] var27 = var26 <= 0 ? null : new byte[var26 * 2];
        int var28;
        for (var28 = 0; var3.field2282[var3.field2299 + var28] != 0; var28++) {
        }
        byte[] var29 = new byte[var28];
        for (int var30 = 0; var30 < var28; var30++) {
            var29[var30] = var3.method977(19773);
        }
        var28++;
        var3.field2299++;
        int var31 = 0;
        for (int var32 = 0; var32 < 128; var32++) {
            var31 += var3.method948(-122);
            this.field2752[var32] = (short) var31;
        }
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            var33 += var3.method948(-125);
            this.field2752[var34] = (short) (this.field2752[var34] + (var33 << 8));
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (var37 == 0) {
                if (var36 >= var29.length) {
                    var37 = -1;
                } else {
                    var37 = var29[var36++];
                }
                var35 = var3.method958(255);
            }
            this.field2752[var38] = (short) (this.field2752[var38] + class47.method289(var35 - 1 << 14, 32768));
            var37--;
            this.field2743[var38] = var35;
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field2743[var42] != 0) {
                if (var39 == 0) {
                    var41 = var3.field2282[var7++] - 1;
                    if (var4.length <= var40) {
                        var39 = -1;
                    } else {
                        var39 = var4[var40++];
                    }
                }
                this.field2741[var42] = (byte) var41;
                var39--;
            }
        }
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field2743[var46] != 0) {
                if (var44 == 0) {
                    var45 = var3.field2282[var10++] + 16 << 2;
                    if (var43 >= var8.length) {
                        var44 = -1;
                    } else {
                        var44 = var8[var43++];
                    }
                }
                var44--;
                this.field2749[var46] = (byte) var45;
            }
        }
        int var47 = 0;
        int var48 = 0;
        class249 var49 = null;
        for (int var50 = 0; var50 < 128; var50++) {
            if (this.field2743[var50] != 0) {
                if (var48 == 0) {
                    var49 = var19[var14[var47]];
                    if (var12.length <= var47) {
                        var48 = -1;
                    } else {
                        var48 = var12[var47++];
                    }
                }
                var48--;
                this.field2747[var50] = var49;
            }
        }
        int var51 = 0;
        int var52 = 0;
        int var53 = 0;
        for (int var54 = 0; var54 < 128; var54++) {
            if (var51 == 0) {
                if (var29.length > var52) {
                    var51 = var29[var52++];
                } else {
                    var51 = -1;
                }
                if (this.field2743[var54] > 0) {
                    var53 = var3.method948(-126) + 1;
                }
            }
            var51--;
            this.field2750[var54] = (byte) var53;
        }
        this.field2754 = var3.method948(-128) + 1;
        for (int var55 = 0; var55 < var16; var55++) {
            class249 var56 = var19[var55];
            if (var56.field4163 != null) {
                for (int var57 = 1; var57 < var56.field4163.length; var57 += 2) {
                    var56.field4163[var57] = var3.method977(19773);
                }
            }
            if (var56.field4169 != null) {
                for (int var58 = 3; var58 < (var56.field4169.length - 2); var58 += 2) {
                    var56.field4169[var58] = var3.method977(19773);
                }
            }
        }
        if (var25 != null) {
            for (int var59 = 1; var59 < var25.length; var59 += 2) {
                var25[var59] = var3.method977(19773);
            }
        }
        if (var27 != null) {
            for (int var60 = 1; var60 < var27.length; var60 += 2) {
                var27[var60] = var3.method977(19773);
            }
        }
        for (int var61 = 0; var61 < var16; var61++) {
            class249 var62 = var19[var61];
            if (var62.field4169 != null) {
                int var63 = 0;
                for (int var64 = 2; var64 < var62.field4169.length; var64 += 2) {
                    var63 = var63 + var3.method948(-126) + 1;
                    var62.field4169[var64] = (byte) var63;
                }
            }
        }
        for (int var65 = 0; var65 < var16; var65++) {
            class249 var66 = var19[var65];
            if (var66.field4163 != null) {
                int var67 = 0;
                for (int var68 = 2; var68 < var66.field4163.length; var68 += 2) {
                    var67 = var67 + var3.method948(-125) + 1;
                    var66.field4163[var68] = (byte) var67;
                }
            }
        }
        if (var25 != null) {
            int var69 = var3.method948(-123);
            var25[0] = (byte) var69;
            for (int var70 = 2; var70 < var25.length; var70 += 2) {
                var69 = var3.method948(-125) + var69 + 1;
                var25[var70] = (byte) var69;
            }
            byte var71 = var25[0];
            byte var72 = var25[1];
            for (int var73 = 0; var73 < var71; var73++) {
                this.field2750[var73] = (byte) (this.field2750[var73] * var72 + 32 >> 6);
            }
            int var74 = 2;
            while (var74 < var25.length) {
                byte var75 = var25[var74 + 1];
                byte var76 = var25[var74];
                var74 += 2;
                int var77 = (var76 - var71) / 2 + (var76 - var71) * var72;
                for (int var78 = var71; var78 < var76; var78++) {
                    int var79 = class153.method1139(var77, false, var76 - var71);
                    this.field2750[var78] = (byte) (this.field2750[var78] * var79 + 32 >> 6);
                    var77 += var75 - var72;
                }
                var72 = var75;
                var71 = var76;
            }
            for (int var80 = var71; var80 < 128; var80++) {
                this.field2750[var80] = (byte) (this.field2750[var80] * var72 + 32 >> 6);
            }
            Object var81 = null;
        }
        if (var27 != null) {
            int var82 = var3.method948(-124);
            var27[0] = (byte) var82;
            for (int var83 = 2; var83 < var27.length; var83 += 2) {
                var82 = var3.method948(-122) + var82 + 1;
                var27[var83] = (byte) var82;
            }
            byte var84 = var27[0];
            int var85 = var27[1] << 1;
            for (int var86 = 0; var86 < var84; var86++) {
                int var87 = (this.field2749[var86] & 0xFF) + var85;
                if (var87 < 0) {
                    var87 = 0;
                }
                if (var87 > 128) {
                    var87 = 128;
                }
                this.field2749[var86] = (byte) var87;
            }
            int var88 = 2;
            while (var27.length > var88) {
                byte var89 = var27[var88];
                int var90 = var27[var88 + 1] << 1;
                var88 += 2;
                int var91 = (var89 - var84) * var85 + ((var89 - var84) / 2);
                for (int var92 = var84; var92 < var89; var92++) {
                    int var93 = class153.method1139(var91, false, var89 - var84);
                    int var94 = (this.field2749[var92] & 0xFF) + var93;
                    if (var94 < 0) {
                        var94 = 0;
                    }
                    var91 += var90 - var85;
                    if (var94 > 128) {
                        var94 = 128;
                    }
                    this.field2749[var92] = (byte) var94;
                }
                var85 = var90;
                var84 = var89;
            }
            Object var95 = null;
            for (int var96 = var84; var96 < 128; var96++) {
                int var97 = (this.field2749[var96] & 0xFF) + var85;
                if (var97 < 0) {
                    var97 = 0;
                }
                if (var97 > 128) {
                    var97 = 128;
                }
                this.field2749[var96] = (byte) var97;
            }
        }
        for (int var98 = 0; var98 < var16; var98++) {
            var19[var98].field4173 = var3.method948(-125);
        }
        for (int var99 = 0; var99 < var16; var99++) {
            class249 var100 = var19[var99];
            if (var100.field4163 != null) {
                var100.field4162 = var3.method948(-121);
            }
            if (var100.field4169 != null) {
                var100.field4170 = var3.method948(-127);
            }
            if (var100.field4173 > 0) {
                var100.field4172 = var3.method948(-122);
            }
        }
        for (int var101 = 0; var101 < var16; var101++) {
            var19[var101].field4168 = var3.method948(-126);
        }
        for (int var102 = 0; var102 < var16; var102++) {
            class249 var103 = var19[var102];
            if (var103.field4168 > 0) {
                var103.field4167 = var3.method948(-122);
            }
        }
        for (int var104 = 0; var104 < var16; var104++) {
            class249 var105 = var19[var104];
            if (var105.field4167 > 0) {
                var105.field4178 = var3.method948(-123);
            }
        }
    }
}
