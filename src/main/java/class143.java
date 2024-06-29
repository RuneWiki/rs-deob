import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class143 extends class273 {

    @OriginalMember(owner = "client!oc", name = "F", descriptor = "[S")
    public short[] field2218;

    @OriginalMember(owner = "client!oc", name = "G", descriptor = "[I")
    private int[] field2219;

    @OriginalMember(owner = "client!oc", name = "v", descriptor = "[B")
    public byte[] field2208;

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "[Ljf;")
    public class226[] field2200;

    @OriginalMember(owner = "client!oc", name = "q", descriptor = "[B")
    public byte[] field2203;

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "[Lgm;")
    public class292[] field2201;

    @OriginalMember(owner = "client!oc", name = "r", descriptor = "[B")
    public byte[] field2204;

    @OriginalMember(owner = "client!oc", name = "y", descriptor = "I")
    public int field2211;

    @OriginalMember(owner = "client!oc", name = "t", descriptor = "Lwm;")
    private static class152 field2206 = class157.method1048("Loaded title screen", 92);

    @OriginalMember(owner = "client!oc", name = "u", descriptor = "Lwm;")
    private static class152 field2207 = class157.method1048("yellow:", 118);

    @OriginalMember(owner = "client!oc", name = "x", descriptor = "Lwm;")
    public static class152 field2210 = field2207;

    @OriginalMember(owner = "client!oc", name = "s", descriptor = "Lwm;")
    public static class152 field2205 = field2207;

    @OriginalMember(owner = "client!oc", name = "A", descriptor = "Lwm;")
    public static class152 field2213 = field2206;

    @OriginalMember(owner = "client!oc", name = "E", descriptor = "Lwm;")
    public static class152 field2217 = class157.method1048(":", 109);

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "I")
    public static int field2202;

    @OriginalMember(owner = "client!oc", name = "z", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!oc", name = "B", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!oc", name = "D", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!oc", name = "C", descriptor = "[Loe;")
    public static class127[] field2215;

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "[Lbg;")
    public static class203[] field2199;

    @OriginalMember(owner = "client!oc", name = "w", descriptor = "[S")
    public static short[] field2209;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lhi;I)Lak;", line = 19)
    public static final class311 method900(class291 arg0, int arg1) {
        field2216++;
        class311 var2 = new class311(arg0.method2017(true), arg0.method2017(true), arg0.method2021((byte) 74), arg0.method2021((byte) 74), arg0.method1969((byte) -16), arg0.method2011(arg1 - 17) == 1, arg0.method2011(-49));
        int var3 = arg0.method2011(arg1 - 89);
        for (int var4 = arg1; var4 < var3; var4++) {
            var2.field5314.method1214(false, new class31(arg0.method2021((byte) 74), arg0.method2021((byte) 74), arg0.method2021((byte) 74), arg0.method2021((byte) 74)));
        }
        var2.method2156(arg1 + 4095);
        return var2;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IZLr;IIII)Z", line = 46)
    public static final boolean method901(int arg0, boolean arg1, class270 arg2, int arg3, int arg4, int arg5, int arg6) {
        class169 var7 = class216.method1450(arg2.field4617, 34);
        if (arg1) {
            field2207 = (class152) null;
        }
        field2212++;
        if (var7.field2639 == -1) {
            return true;
        }
        int var8;
        if (arg2.field4557) {
            int var9 = arg2.field4607 + arg3;
            var8 = var9 & 0x3;
        } else {
            var8 = 0;
        }
        class300 var10 = var7.method1110(30, var8);
        if (var10 == null) {
            return false;
        }
        int var11 = arg2.field4618;
        int var12 = var10.field3740;
        int var13 = var10.field3743;
        int var14 = arg2.field4562;
        if ((var8 & 0x1) == 1) {
            var11 = arg2.field4562;
            var14 = arg2.field4618;
        }
        if (var7.field2655) {
            var13 = var14 * 4;
            var12 = var11 * 4;
        }
        if (var7.field2647 == 0) {
            var10.method2100(arg6 * 4 + 48, (-arg5 + 104 + -var14) * 4 + 48, var12, var13);
        } else {
            var10.method2101((arg6 * 4) + 48, (-arg5 + 104 + -var14) * 4 + 48, var12, var13, var7.field2647);
        }
        return true;
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(B)V", line = 124)
    public final void method902(byte arg0) {
        this.field2219 = null;
        field2214++;
        if (arg0 > -108) {
            method900((class291) null, 125);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "([ILcg;[BI)Z", line = 169)
    public final boolean method903(int[] arg0, class42 arg1, byte[] arg2, int arg3) {
        field2202++;
        int var5 = 0;
        boolean var6 = true;
        class292 var7 = null;
        if (arg3 < 91) {
            return false;
        }
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg2 == null || arg2[var8] != 0) {
                int var9 = this.field2219[var8];
                if (var9 != 0) {
                    if (var5 != var9) {
                        var5 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg1.method292(arg0, false, var9 >> 2);
                        } else {
                            var7 = arg1.method295(arg0, 0, var9 >> 2);
                        }
                        if (var7 == null) {
                            var6 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field2201[var8] = var7;
                        this.field2219[var8] = 0;
                    }
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(B)V", line = 226)
    public static void method904(byte arg0) {
        field2206 = null;
        field2207 = null;
        field2217 = null;
        field2199 = null;
        field2213 = null;
        field2209 = null;
        field2205 = null;
        field2210 = null;
        int var1 = 46 / ((-arg0 - 52) / 55);
        field2215 = null;
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V", line = 251)
    public class143() {
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "([B)V", line = 253)
    public class143(byte[] arg0) {
        this.field2218 = new short[128];
        this.field2219 = new int[128];
        this.field2208 = new byte[128];
        this.field2200 = new class226[128];
        this.field2203 = new byte[128];
        this.field2201 = new class292[128];
        this.field2204 = new byte[128];
        int var2 = 0;
        class291 var3 = new class291(arg0);
        while (var3.field4950[var3.field4946 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method1962(false);
        }
        var2++;
        var3.field4946++;
        int var6 = 0;
        int var7 = var3.field4946;
        var3.field4946 += var2;
        while (var3.field4950[var3.field4946 + var6] != 0) {
            var6++;
        }
        byte[] var8 = new byte[var6];
        for (int var9 = 0; var9 < var6; var9++) {
            var8[var9] = var3.method1962(false);
        }
        var3.field4946++;
        int var10 = 0;
        var6++;
        int var11 = var3.field4946;
        var3.field4946 += var6;
        while (var3.field4950[var3.field4946 + var10] != 0) {
            var10++;
        }
        byte[] var12 = new byte[var10];
        for (int var13 = 0; var13 < var10; var13++) {
            var12[var13] = var3.method1962(false);
        }
        var10++;
        var3.field4946++;
        byte[] var14 = new byte[var10];
        int var15;
        if (var10 <= 1) {
            var15 = var10;
        } else {
            int var16 = 1;
            var15 = 2;
            var14[1] = 1;
            for (int var17 = 2; var17 < var10; var17++) {
                int var18 = var3.method2011(-26);
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
        class226[] var19 = new class226[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class226 var21 = var19[var20] = new class226();
            int var22 = var3.method2011(-92);
            if (var22 > 0) {
                var21.field3676 = new byte[var22 * 2];
            }
            int var23 = var3.method2011(-50);
            if (var23 > 0) {
                var21.field3669 = new byte[var23 * 2 + 2];
                var21.field3669[1] = 64;
            }
        }
        int var24 = var3.method2011(-92);
        byte[] var25 = var24 <= 0 ? null : new byte[var24 * 2];
        int var26 = 0;
        int var27 = var3.method2011(-105);
        byte[] var28 = var27 > 0 ? new byte[var27 * 2] : null;
        while (var3.field4950[var3.field4946 + var26] != 0) {
            var26++;
        }
        byte[] var29 = new byte[var26];
        for (int var30 = 0; var30 < var26; var30++) {
            var29[var30] = var3.method1962(false);
        }
        var3.field4946++;
        var26++;
        int var31 = 0;
        for (int var32 = 0; var32 < 128; var32++) {
            var31 += var3.method2011(-97);
            this.field2218[var32] = (short) var31;
        }
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            var33 += var3.method2011(-43);
            this.field2218[var34] = (short) (this.field2218[var34] + (var33 << 8));
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (var35 == 0) {
                if (var29.length > var37) {
                    var35 = var29[var37++];
                } else {
                    var35 = -1;
                }
                var36 = var3.method2004(-10352);
            }
            var35--;
            this.field2218[var38] = (short) (this.field2218[var38] + class34.method251(32768, var36 - 1 << 14));
            this.field2219[var38] = var36;
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field2219[var42] != 0) {
                if (var39 == 0) {
                    if (var4.length > var40) {
                        var39 = var4[var40++];
                    } else {
                        var39 = -1;
                    }
                    var41 = var3.field4950[var7++] - 1;
                }
                var39--;
                this.field2208[var42] = (byte) var41;
            }
        }
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field2219[var46] != 0) {
                if (var44 == 0) {
                    var45 = var3.field4950[var11++] + 16 << 2;
                    if (var43 >= var8.length) {
                        var44 = -1;
                    } else {
                        var44 = var8[var43++];
                    }
                }
                var44--;
                this.field2204[var46] = (byte) var45;
            }
        }
        int var47 = 0;
        int var48 = 0;
        class226 var49 = null;
        for (int var50 = 0; var50 < 128; var50++) {
            if (this.field2219[var50] != 0) {
                if (var48 == 0) {
                    var49 = var19[var14[var47]];
                    if (var47 >= var12.length) {
                        var48 = -1;
                    } else {
                        var48 = var12[var47++];
                    }
                }
                this.field2200[var50] = var49;
                var48--;
            }
        }
        int var51 = 0;
        int var52 = 0;
        int var53 = 0;
        for (int var54 = 0; var54 < 128; var54++) {
            if (var51 == 0) {
                if (var29.length <= var52) {
                    var51 = -1;
                } else {
                    var51 = var29[var52++];
                }
                if (this.field2219[var54] > 0) {
                    var53 = var3.method2011(-44) + 1;
                }
            }
            this.field2203[var54] = (byte) var53;
            var51--;
        }
        this.field2211 = var3.method2011(-85) + 1;
        for (int var55 = 0; var55 < var15; var55++) {
            class226 var56 = var19[var55];
            if (var56.field3676 != null) {
                for (int var57 = 1; var57 < var56.field3676.length; var57 += 2) {
                    var56.field3676[var57] = var3.method1962(false);
                }
            }
            if (var56.field3669 != null) {
                for (int var58 = 3; var58 < var56.field3669.length - 2; var58 += 2) {
                    var56.field3669[var58] = var3.method1962(false);
                }
            }
        }
        if (var25 != null) {
            for (int var59 = 1; var59 < var25.length; var59 += 2) {
                var25[var59] = var3.method1962(false);
            }
        }
        if (var28 != null) {
            for (int var60 = 1; var60 < var28.length; var60 += 2) {
                var28[var60] = var3.method1962(false);
            }
        }
        for (int var61 = 0; var61 < var15; var61++) {
            class226 var62 = var19[var61];
            if (var62.field3669 != null) {
                int var63 = 0;
                for (int var64 = 2; var64 < var62.field3669.length; var64 += 2) {
                    var63 = var63 + var3.method2011(-68) + 1;
                    var62.field3669[var64] = (byte) var63;
                }
            }
        }
        for (int var65 = 0; var65 < var15; var65++) {
            class226 var66 = var19[var65];
            if (var66.field3676 != null) {
                int var67 = 0;
                for (int var68 = 2; var68 < var66.field3676.length; var68 += 2) {
                    var67 = var67 + var3.method2011(-84) + 1;
                    var66.field3676[var68] = (byte) var67;
                }
            }
        }
        if (var25 != null) {
            int var69 = var3.method2011(-110);
            var25[0] = (byte) var69;
            for (int var70 = 2; var70 < var25.length; var70 += 2) {
                var69 = var3.method2011(-33) + var69 + 1;
                var25[var70] = (byte) var69;
            }
            byte var71 = var25[0];
            byte var72 = var25[1];
            for (int var73 = 0; var73 < var71; var73++) {
                this.field2203[var73] = (byte) (this.field2203[var73] * var72 + 32 >> 6);
            }
            int var74 = 2;
            while (var25.length > var74) {
                byte var75 = var25[var74];
                byte var76 = var25[var74 + 1];
                var74 += 2;
                int var77 = (var75 - var71) / 2 + (var75 - var71) * var72;
                for (int var78 = var71; var78 < var75; var78++) {
                    int var79 = class164.method1098(var77, var75 - var71, (byte) 70);
                    this.field2203[var78] = (byte) (this.field2203[var78] * var79 + 32 >> 6);
                    var77 += var76 - var72;
                }
                var71 = var75;
                var72 = var76;
            }
            Object var80 = null;
            for (int var81 = var71; var81 < 128; var81++) {
                this.field2203[var81] = (byte) (this.field2203[var81] * var72 + 32 >> 6);
            }
        }
        if (var28 != null) {
            int var82 = var3.method2011(-26);
            var28[0] = (byte) var82;
            for (int var83 = 2; var83 < var28.length; var83 += 2) {
                var82 = (var82 + var3.method2011(-113)) + 1;
                var28[var83] = (byte) var82;
            }
            byte var84 = var28[0];
            int var85 = var28[1] << 1;
            for (int var86 = 0; var86 < var84; var86++) {
                int var87 = (this.field2204[var86] & 0xFF) + var85;
                if (var87 < 0) {
                    var87 = 0;
                }
                if (var87 > 128) {
                    var87 = 128;
                }
                this.field2204[var86] = (byte) var87;
            }
            int var88 = 2;
            while (var88 < var28.length) {
                byte var89 = var28[var88];
                int var90 = var28[var88 + 1] << 1;
                var88 += 2;
                int var91 = (var89 - var84) / 2 + (var89 - var84) * var85;
                for (int var92 = var84; var92 < var89; var92++) {
                    int var93 = class164.method1098(var91, var89 - var84, (byte) -121);
                    int var94 = (this.field2204[var92] & 0xFF) + var93;
                    if (var94 < 0) {
                        var94 = 0;
                    }
                    var91 += var90 - var85;
                    if (var94 > 128) {
                        var94 = 128;
                    }
                    this.field2204[var92] = (byte) var94;
                }
                var84 = var89;
                var85 = var90;
            }
            Object var95 = null;
            for (int var96 = var84; var96 < 128; var96++) {
                int var97 = (this.field2204[var96] & 0xFF) + var85;
                if (var97 < 0) {
                    var97 = 0;
                }
                if (var97 > 128) {
                    var97 = 128;
                }
                this.field2204[var96] = (byte) var97;
            }
        }
        for (int var98 = 0; var98 < var15; var98++) {
            var19[var98].field3670 = var3.method2011(-120);
        }
        for (int var99 = 0; var99 < var15; var99++) {
            class226 var100 = var19[var99];
            if (var100.field3676 != null) {
                var100.field3661 = var3.method2011(-43);
            }
            if (var100.field3669 != null) {
                var100.field3668 = var3.method2011(-107);
            }
            if (var100.field3670 > 0) {
                var100.field3666 = var3.method2011(-123);
            }
        }
        for (int var101 = 0; var101 < var15; var101++) {
            var19[var101].field3673 = var3.method2011(-68);
        }
        for (int var102 = 0; var102 < var15; var102++) {
            class226 var103 = var19[var102];
            if (var103.field3673 > 0) {
                var103.field3663 = var3.method2011(-61);
            }
        }
        for (int var104 = 0; var104 < var15; var104++) {
            class226 var105 = var19[var104];
            if (var105.field3663 > 0) {
                var105.field3662 = var3.method2011(-19);
            }
        }
    }
}
