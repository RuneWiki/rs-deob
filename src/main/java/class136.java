import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class136 extends class202 {

    @OriginalMember(owner = "client!kg", name = "D", descriptor = "[I")
    private int[] field2253;

    @OriginalMember(owner = "client!kg", name = "x", descriptor = "[Lcf;")
    public class93[] field2247;

    @OriginalMember(owner = "client!kg", name = "y", descriptor = "[Llh;")
    public class288[] field2248;

    @OriginalMember(owner = "client!kg", name = "r", descriptor = "[B")
    public byte[] field2241;

    @OriginalMember(owner = "client!kg", name = "s", descriptor = "[B")
    public byte[] field2242;

    @OriginalMember(owner = "client!kg", name = "n", descriptor = "[B")
    public byte[] field2237;

    @OriginalMember(owner = "client!kg", name = "u", descriptor = "[S")
    public short[] field2244;

    @OriginalMember(owner = "client!kg", name = "m", descriptor = "I")
    public int field2236;

    @OriginalMember(owner = "client!kg", name = "q", descriptor = "Ljava/lang/String;")
    public static String field2240 = " is already on your ignore list.";

    @OriginalMember(owner = "client!kg", name = "v", descriptor = "I")
    public static int field2245 = 0;

    @OriginalMember(owner = "client!kg", name = "C", descriptor = "I")
    public static int field2252 = 2;

    @OriginalMember(owner = "client!kg", name = "w", descriptor = "Laf;")
    public static class68 field2246 = new class68(64);

    @OriginalMember(owner = "client!kg", name = "k", descriptor = "I")
    public static int field2234;

    @OriginalMember(owner = "client!kg", name = "o", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!kg", name = "p", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!kg", name = "t", descriptor = "I")
    public static int field2243;

    @OriginalMember(owner = "client!kg", name = "z", descriptor = "I")
    public static int field2249;

    @OriginalMember(owner = "client!kg", name = "B", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!kg", name = "E", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!kg", name = "F", descriptor = "I")
    public static int field2255;

    @OriginalMember(owner = "client!kg", name = "l", descriptor = "Lqh;")
    public static class201 field2235;

    @OriginalMember(owner = "client!kg", name = "A", descriptor = "[[Lf;")
    public static class36[][] field2250;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "([BLpf;[IB)Z")
    public final boolean method955(byte[] arg0, class287 arg1, int[] arg2, byte arg3) {
        field2243++;
        if (arg3 != 65) {
            return true;
        }
        int var5 = 0;
        boolean var6 = true;
        class93 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg0 == null || arg0[var8] != 0) {
                int var9 = this.field2253[var8];
                if (var9 != 0) {
                    if (var5 != var9) {
                        var5 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg1.method1924(var9 >> 2, (byte) -36, arg2);
                        } else {
                            var7 = arg1.method1926(-74, var9 >> 2, arg2);
                        }
                        if (var7 == null) {
                            var6 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field2247[var8] = var7;
                        this.field2253[var8] = 0;
                    }
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(II)V")
    public static final void method956(int arg0, int arg1) {
        if (arg1 >= -120) {
            field2246 = null;
        }
        field2255++;
        if (!class228.method1606(-1, arg0)) {
            return;
        }
        class36[] var2 = field2250[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class36 var4 = var2[var3];
            if (var4 != null) {
                var4.field689 = 1;
                var4.field635 = 0;
                var4.field683 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "(I)V")
    public final void method957(int arg0) {
        field2234++;
        if (arg0 == 0) {
            this.field2253 = null;
        }
    }

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "(II)Lph;")
    public static final class78 method958(int arg0, int arg1) {
        field2251++;
        if (arg0 != 17771) {
            method958(-56, 50);
        }
        return class142.field2301 && class263.field4206 <= arg1 && class125.field2021 >= arg1 ? class48.field863[arg1 - class263.field4206] : null;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIIIII)I")
    public static final int method959(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg4 & arg0) == 1) {
            int var7 = arg3;
            arg3 = arg5;
            arg5 = var7;
        }
        int var8 = arg2 & 0x3;
        field2249++;
        if (var8 == 0) {
            return arg6;
        } else if (var8 == 1) {
            return arg1;
        } else if (var8 == 2) {
            return 1 + 7 - arg3 - arg6;
        } else {
            return 7 + 1 - arg5 - arg1;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IB)I")
    public static final int method960(int arg0, byte arg1) {
        field2239++;
        if (arg0 < 0) {
            return 0;
        }
        if (arg1 < 78) {
            method956(-8, -109);
        }
        class239 var2 = (class239) class214.field3502.method1400((long) arg0, true);
        if (var2 == null) {
            return class105.method759(true, arg0).field3919;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < var2.field3880.length; var4++) {
            if (var2.field3880[var4] == -1) {
                var3++;
            }
        }
        return var3 + (class105.method759(true, arg0).field3919 - var2.field3880.length);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)V")
    public static void method961(byte arg0) {
        if (arg0 <= 98) {
            method959(98, 88, -24, -112, -80, 102, 83);
        }
        field2240 = null;
        field2246 = null;
        field2235 = null;
        field2250 = null;
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "()V")
    public class136() {
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "([B)V")
    public class136(byte[] arg0) {
        this.field2253 = new int[128];
        this.field2247 = new class93[128];
        this.field2248 = new class288[128];
        this.field2241 = new byte[128];
        this.field2242 = new byte[128];
        this.field2237 = new byte[128];
        this.field2244 = new short[128];
        int var2 = 0;
        class221 var3 = new class221(arg0);
        while (var3.field3653[var3.field3655 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method1535((byte) -89);
        }
        var2++;
        var3.field3655++;
        int var6 = var3.field3655;
        var3.field3655 += var2;
        int var7;
        for (var7 = 0; var3.field3653[var3.field3655 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method1535((byte) -122);
        }
        var3.field3655++;
        int var10 = var3.field3655;
        int var11 = 0;
        var7++;
        var3.field3655 += var7;
        while (var3.field3653[var3.field3655 + var11] != 0) {
            var11++;
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var3.method1535((byte) -116);
        }
        var11++;
        byte[] var14 = new byte[var11];
        var3.field3655++;
        int var15;
        if (var11 <= 1) {
            var15 = var11;
        } else {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var105 = var3.method1517((byte) -96);
                if (var105 == 0) {
                    var16 = var15++;
                } else {
                    if (var16 >= var105) {
                        var105--;
                    }
                    var16 = var105;
                }
                var14[var17] = (byte) var16;
            }
        }
        class288[] var18 = new class288[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class288 var102 = var18[var19] = new class288();
            int var103 = var3.method1517((byte) -96);
            if (var103 > 0) {
                var102.field4552 = new byte[var103 * 2];
            }
            int var104 = var3.method1517((byte) -96);
            if (var104 > 0) {
                var102.field4550 = new byte[var104 * 2 + 2];
                var102.field4550[1] = 64;
            }
        }
        int var20 = var3.method1517((byte) -96);
        byte[] var21 = var20 > 0 ? new byte[var20 * 2] : null;
        int var22 = var3.method1517((byte) -96);
        int var23;
        for (var23 = 0; var3.field3653[var3.field3655 + var23] != 0; var23++) {
        }
        byte[] var24 = new byte[var23];
        for (int var25 = 0; var25 < var23; var25++) {
            var24[var25] = var3.method1535((byte) -119);
        }
        var23++;
        byte[] var26 = var22 <= 0 ? null : new byte[var22 * 2];
        var3.field3655++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var3.method1517((byte) -96);
            this.field2244[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var3.method1517((byte) -96);
            this.field2244[var30] = (short) (this.field2244[var30] + (var29 << 8));
        }
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            if (var32 == 0) {
                if (var24.length <= var31) {
                    var32 = -1;
                } else {
                    var32 = var24[var31++];
                }
                var33 = var3.method1558(44);
            }
            this.field2244[var34] = (short) (this.field2244[var34] + class202.method1393(var33 - 1 << 14, 32768));
            this.field2253[var34] = var33;
            var32--;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field2253[var38] != 0) {
                if (var35 == 0) {
                    var37 = var3.field3653[var6++] - 1;
                    if (var4.length > var36) {
                        var35 = var4[var36++];
                    } else {
                        var35 = -1;
                    }
                }
                var35--;
                this.field2237[var38] = (byte) var37;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field2253[var42] != 0) {
                if (var40 == 0) {
                    var41 = var3.field3653[var10++] + 16 << 2;
                    if (var8.length > var39) {
                        var40 = var8[var39++];
                    } else {
                        var40 = -1;
                    }
                }
                this.field2241[var42] = (byte) var41;
                var40--;
            }
        }
        int var43 = 0;
        class288 var44 = null;
        int var45 = 0;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field2253[var46] != 0) {
                if (var45 == 0) {
                    var44 = var18[var14[var43]];
                    if (var43 < var12.length) {
                        var45 = var12[var43++];
                    } else {
                        var45 = -1;
                    }
                }
                this.field2248[var46] = var44;
                var45--;
            }
        }
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (var49 == 0) {
                if (var24.length <= var47) {
                    var49 = -1;
                } else {
                    var49 = var24[var47++];
                }
                if (this.field2253[var50] > 0) {
                    var48 = var3.method1517((byte) -96) + 1;
                }
            }
            var49--;
            this.field2242[var50] = (byte) var48;
        }
        this.field2236 = var3.method1517((byte) -96) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class288 var99 = var18[var51];
            if (var99.field4552 != null) {
                for (int var100 = 1; var100 < var99.field4552.length; var100 += 2) {
                    var99.field4552[var100] = var3.method1535((byte) -96);
                }
            }
            if (var99.field4550 != null) {
                for (int var101 = 3; var101 < var99.field4550.length - 2; var101 += 2) {
                    var99.field4550[var101] = var3.method1535((byte) -94);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var3.method1535((byte) -58);
            }
        }
        if (var26 != null) {
            for (int var53 = 1; var53 < var26.length; var53 += 2) {
                var26[var53] = var3.method1535((byte) -85);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class288 var96 = var18[var54];
            if (var96.field4550 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field4550.length; var98 += 2) {
                    var97 = var97 + var3.method1517((byte) -96) + 1;
                    var96.field4550[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class288 var93 = var18[var55];
            if (var93.field4552 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field4552.length; var95 += 2) {
                    var94 = var94 + var3.method1517((byte) -96) + 1;
                    var93.field4552[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var3.method1517((byte) -96);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 = var56 + var3.method1517((byte) -96) + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[0];
            byte var59 = var21[1];
            for (int var60 = 0; var60 < var58; var60++) {
                this.field2242[var60] = (byte) (this.field2242[var60] * var59 + 32 >> 6);
            }
            int var61 = 2;
            while (var21.length > var61) {
                byte var64 = var21[var61 + 1];
                byte var65 = var21[var61];
                var61 += 2;
                int var66 = (var65 - var58) / 2 + (var65 - var58) * var59;
                for (int var67 = var58; var67 < var65; var67++) {
                    int var68 = class277.method1867(true, var66, var65 - var58);
                    this.field2242[var67] = (byte) (this.field2242[var67] * var68 + 32 >> 6);
                    var66 += var64 - var59;
                }
                var58 = var65;
                var59 = var64;
            }
            for (int var62 = var58; var62 < 128; var62++) {
                this.field2242[var62] = (byte) (this.field2242[var62] * var59 + 32 >> 6);
            }
            Object var63 = null;
        }
        if (var26 != null) {
            int var69 = var3.method1517((byte) -96);
            var26[0] = (byte) var69;
            for (int var70 = 2; var70 < var26.length; var70 += 2) {
                var69 = var3.method1517((byte) -96) + var69 + 1;
                var26[var70] = (byte) var69;
            }
            byte var71 = var26[0];
            int var72 = var26[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field2241[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field2241[var73] = (byte) var84;
            }
            int var74 = 2;
            while (var26.length > var74) {
                int var78 = var26[var74 + 1] << 1;
                byte var79 = var26[var74];
                int var80 = (var79 - var71) / 2 + (var79 - var71) * var72;
                for (int var81 = var71; var81 < var79; var81++) {
                    int var82 = class277.method1867(true, var80, var79 - var71);
                    var80 += var78 - var72;
                    int var83 = (this.field2241[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    this.field2241[var81] = (byte) var83;
                }
                var74 += 2;
                var71 = var79;
                var72 = var78;
            }
            for (int var75 = var71; var75 < 128; var75++) {
                int var77 = (this.field2241[var75] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field2241[var75] = (byte) var77;
            }
            Object var76 = null;
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field4555 = var3.method1517((byte) -96);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class288 var92 = var18[var86];
            if (var92.field4552 != null) {
                var92.field4548 = var3.method1517((byte) -96);
            }
            if (var92.field4550 != null) {
                var92.field4547 = var3.method1517((byte) -96);
            }
            if (var92.field4555 > 0) {
                var92.field4556 = var3.method1517((byte) -96);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field4554 = var3.method1517((byte) -96);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class288 var91 = var18[var88];
            if (var91.field4554 > 0) {
                var91.field4553 = var3.method1517((byte) -96);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class288 var90 = var18[var89];
            if (var90.field4553 > 0) {
                var90.field4549 = var3.method1517((byte) -96);
            }
        }
    }
}
