import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class252 extends class188 {

    @OriginalMember(owner = "client!nj", name = "l", descriptor = "[B")
    public byte[] field3984;

    @OriginalMember(owner = "client!nj", name = "m", descriptor = "[B")
    public byte[] field3985;

    @OriginalMember(owner = "client!nj", name = "C", descriptor = "[S")
    public short[] field4000;

    @OriginalMember(owner = "client!nj", name = "o", descriptor = "[I")
    private int[] field3987;

    @OriginalMember(owner = "client!nj", name = "w", descriptor = "[Ltc;")
    public class48[] field3995;

    @OriginalMember(owner = "client!nj", name = "s", descriptor = "[B")
    public byte[] field3991;

    @OriginalMember(owner = "client!nj", name = "p", descriptor = "[Lfn;")
    public class37[] field3988;

    @OriginalMember(owner = "client!nj", name = "t", descriptor = "I")
    public int field3992;

    @OriginalMember(owner = "client!nj", name = "n", descriptor = "Lvh;")
    public static class62 field3986 = new class62(2);

    @OriginalMember(owner = "client!nj", name = "y", descriptor = "[Ljava/lang/String;")
    public static String[] field3997 = new String[1000];

    @OriginalMember(owner = "client!nj", name = "z", descriptor = "[Ljava/lang/String;")
    public static String[] field3998 = new String[100];

    @OriginalMember(owner = "client!nj", name = "A", descriptor = "Lvh;")
    public static class62 field3999 = new class62(50);

    @OriginalMember(owner = "client!nj", name = "k", descriptor = "I")
    public static int field3983;

    @OriginalMember(owner = "client!nj", name = "q", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "client!nj", name = "r", descriptor = "I")
    public static int field3990;

    @OriginalMember(owner = "client!nj", name = "u", descriptor = "I")
    public static int field3993;

    @OriginalMember(owner = "client!nj", name = "v", descriptor = "I")
    public static int field3994;

    @OriginalMember(owner = "client!nj", name = "x", descriptor = "I")
    public static int field3996;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ZLfg;B)V", line = 8)
    public static final void method1785(boolean arg0, class240 arg1, byte arg2) {
        if (class272.field4317 || arg0) {
            int var3 = class95.field1307;
            int var4 = var3 * 956 / 503;
            class43.field475.method19((class165.field2546 - var4) / 2, 0, var4, var3);
            class86.field1135.method1089(class165.field2546 / 2 - class86.field1135.field2366 / 2, 18);
        }
        field3990++;
        arg1.method1691(class199.field3024 == 1 ? class263.field4174 : class70.field878, class165.field2546 / 2, class95.field1307 / 2 - 26, 16777215, -1);
        if (arg2 != 126) {
            field3986 = (class62) null;
        }
        int var5 = class95.field1307 / 2 - 18;
        if (class272.field4317) {
            class239.method1665(class165.field2546 / 2 - 152, var5, 304, 34, 9179409);
            class239.method1665(class165.field2546 / 2 - 151, var5 + 1, 302, 32, 0);
            class239.method1659(class165.field2546 / 2 - 150, var5 + 2, class101.field1370 * 3, 30, 9179409);
            class239.method1659(class165.field2546 / 2 - (150 - class101.field1370 * 3), var5 + 2, 300 - (class101.field1370 * 3), 30, 0);
        } else {
            class343.method2369(class165.field2546 / 2 - 152, var5, 304, 34, 9179409);
            class343.method2369(class165.field2546 / 2 - 151, var5 + 1, 302, 32, 0);
            class343.method2352(class165.field2546 / 2 - 150, var5 + 2, class101.field1370 * 3, 30, 9179409);
            class343.method2352(class165.field2546 / 2 + (class101.field1370 * 3) - 150, var5 + 2, 300 - class101.field1370 * 3, 30, 0);
        }
        arg1.method1691(class65.field778, class165.field2546 / 2, class95.field1307 / 2 + 4, 16777215, -1);
    }

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "(I)V", line = 60)
    public final void method1786(int arg0) {
        this.field3987 = null;
        field3989++;
        if (arg0 != 2) {
            method1789(108);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lfi;I[I[B)Z", line = 73)
    public final boolean method1787(class289 arg0, int arg1, int[] arg2, byte[] arg3) {
        boolean var5 = true;
        int var6 = 0;
        field3983++;
        if (arg1 != -4796) {
            method1788(9);
        }
        class37 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg3 == null || arg3[var8] != 0) {
                int var9 = this.field3987[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg0.method2070(var9 >> 2, (byte) -82, arg2);
                        } else {
                            var7 = arg0.method2069(arg2, var9 >> 2, 0);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field3988[var8] = var7;
                        this.field3987[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "(I)V", line = 130)
    public static final void method1788(int arg0) {
        field3993++;
        if (class22.field249.toLowerCase().indexOf("microsoft") == -1) {
            class16.field196[45] = 26;
            class16.field196[92] = 74;
            class16.field196[59] = 57;
            class16.field196[91] = 42;
            class16.field196[61] = 27;
            class16.field196[44] = 71;
            if (class22.field264 == null) {
                class16.field196[192] = 58;
                class16.field196[222] = 59;
            } else {
                class16.field196[520] = 59;
                class16.field196[222] = 58;
                class16.field196[192] = 28;
            }
            class16.field196[93] = 43;
            class16.field196[47] = 73;
            class16.field196[46] = 72;
        } else {
            class16.field196[188] = 71;
            class16.field196[223] = 28;
            class16.field196[186] = 57;
            class16.field196[222] = 59;
            class16.field196[189] = 26;
            class16.field196[220] = 74;
            class16.field196[219] = 42;
            class16.field196[190] = 72;
            class16.field196[192] = 58;
            class16.field196[191] = 73;
            class16.field196[221] = 43;
            class16.field196[187] = 27;
        }
        if (arg0 != 191) {
            method1789(13);
        }
    }

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "(I)V", line = 181)
    public static void method1789(int arg0) {
        field3998 = null;
        int var1 = -100 / ((arg0 - 55) / 53);
        field3997 = null;
        field3986 = null;
        field3999 = null;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "([[FII[[F[[FI[IILh;[[ILcj;)V", line = 194)
    public static final void method1790(float[][] arg0, int arg1, int arg2, float[][] arg3, float[][] arg4, int arg5, int[] arg6, int arg7, class244 arg8, int[][] arg9, class350 arg10) {
        field3996++;
        int[] var11 = new int[arg6.length / 2];
        for (int var12 = 0; var12 < var11.length; var12++) {
            int var13 = arg6[var12 + var12];
            int var14 = arg6[var12 + var12 + 1];
            if (arg7 == 1) {
                int var16 = var13;
                var13 = var14;
                var14 = 128 - var16;
            } else if (arg7 == 2) {
                var14 = 128 - var14;
                var13 = 128 - var13;
            } else if (arg7 == 3) {
                int var15 = var13;
                var13 = 128 - var14;
                var14 = var15;
            }
            float var17;
            float var18;
            float var19;
            if (var13 == 0 && var14 == 0) {
                var17 = arg3[arg2][arg1];
                var18 = arg4[arg2][arg1];
                var19 = arg0[arg2][arg1];
            } else if (var13 == 128 && var14 == 0) {
                var17 = arg3[arg2 + 1][arg1];
                var19 = arg0[arg2 + 1][arg1];
                var18 = arg4[arg2 + 1][arg1];
            } else if (var13 == 128 && var14 == 128) {
                var18 = arg4[arg2 + 1][arg1 + 1];
                var19 = arg0[arg2 + 1][arg1 + 1];
                var17 = arg3[arg2 + 1][arg1 + 1];
            } else if (var13 == 0 && var14 == 128) {
                var18 = arg4[arg2][arg1 + 1];
                var19 = arg0[arg2][arg1 + 1];
                var17 = arg3[arg2][arg1 + 1];
            } else {
                float var20 = arg0[arg2][arg1];
                float var21 = arg4[arg2][arg1];
                float var22 = arg3[arg2][arg1];
                float var23 = (float) var13 / 128.0F;
                float var24 = (arg3[arg2 + 1][arg1] - var22) * var23 + var22;
                float var25 = (arg0[arg2 + 1][arg1] - var20) * var23 + var20;
                float var26 = (float) var14 / 128.0F;
                float var27 = arg3[arg2][arg1 + 1];
                float var28 = arg0[arg2][arg1 + 1];
                float var29 = (arg0[arg2 + 1][arg1 + 1] - var28) * var23 + var28;
                var19 = (var29 - var25) * var26 + var25;
                float var30 = (arg3[arg2 + 1][arg1 + 1] - var27) * var23 + var27;
                float var31 = (arg4[arg2 + 1][arg1] - var21) * var23 + var21;
                var17 = (var30 - var24) * var26 + var24;
                float var32 = arg4[arg2][arg1 + 1];
                float var33 = (arg4[arg2 + 1][arg1 + 1] - var32) * var23 + var32;
                var18 = (var33 - var31) * var26 + var31;
            }
            int var34 = (arg2 << 7) + var13;
            int var35 = (arg1 << 7) + var14;
            int var36 = class178.method1231(arg2, arg1, (byte) -92, var13, arg9, var14);
            var11[var12] = arg10.method2429(arg8, var34, var36, var35, var18, var17, var19);
        }
        arg10.method2431(var11);
        if (arg5 != -497) {
            field3986 = (class62) null;
        }
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "()V", line = 317)
    public class252() {
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "([B)V", line = 319)
    public class252(byte[] arg0) {
        this.field3984 = new byte[128];
        this.field3985 = new byte[128];
        this.field4000 = new short[128];
        int var2 = 0;
        this.field3987 = new int[128];
        this.field3995 = new class48[128];
        this.field3991 = new byte[128];
        this.field3988 = new class37[128];
        class143 var3 = new class143(arg0);
        while (var3.field2260[var3.field2295 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method1028(79030408);
        }
        var3.field2295++;
        var2++;
        int var6 = var3.field2295;
        var3.field2295 += var2;
        int var7;
        for (var7 = 0; var3.field2260[var3.field2295 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method1028(79030408);
        }
        var7++;
        var3.field2295++;
        int var10 = var3.field2295;
        var3.field2295 += var7;
        int var11;
        for (var11 = 0; var3.field2260[var3.field2295 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var3.method1028(79030408);
        }
        var11++;
        var3.field2295++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 > 1) {
            var15 = 2;
            var14[1] = 1;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var3.method1043(true);
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
            var15 = var11;
        }
        class48[] var19 = new class48[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class48 var21 = var19[var20] = new class48();
            int var22 = var3.method1043(true);
            if (var22 > 0) {
                var21.field546 = new byte[var22 * 2];
            }
            int var23 = var3.method1043(true);
            if (var23 > 0) {
                var21.field545 = new byte[var23 * 2 + 2];
                var21.field545[1] = 64;
            }
        }
        int var24 = var3.method1043(true);
        byte[] var25 = var24 <= 0 ? null : new byte[var24 * 2];
        int var26 = var3.method1043(true);
        byte[] var27 = var26 > 0 ? new byte[var26 * 2] : null;
        int var28;
        for (var28 = 0; var3.field2260[var3.field2295 + var28] != 0; var28++) {
        }
        byte[] var29 = new byte[var28];
        for (int var30 = 0; var30 < var28; var30++) {
            var29[var30] = var3.method1028(79030408);
        }
        var28++;
        var3.field2295++;
        int var31 = 0;
        for (int var32 = 0; var32 < 128; var32++) {
            var31 += var3.method1043(true);
            this.field4000[var32] = (short) var31;
        }
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            var33 += var3.method1043(true);
            this.field4000[var34] = (short) (this.field4000[var34] + (var33 << 8));
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (var37 == 0) {
                if (var29.length > var35) {
                    var37 = var29[var35++];
                } else {
                    var37 = -1;
                }
                var36 = var3.method1015(true);
            }
            this.field4000[var38] = (short) (this.field4000[var38] + class261.method1840(32768, var36 - 1 << 14));
            var37--;
            this.field3987[var38] = var36;
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field3987[var42] != 0) {
                if (var39 == 0) {
                    var41 = var3.field2260[var6++] - 1;
                    if (var4.length > var40) {
                        var39 = var4[var40++];
                    } else {
                        var39 = -1;
                    }
                }
                var39--;
                this.field3984[var42] = (byte) var41;
            }
        }
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field3987[var46] != 0) {
                if (var45 == 0) {
                    var44 = var3.field2260[var10++] + 16 << 2;
                    if (var8.length <= var43) {
                        var45 = -1;
                    } else {
                        var45 = var8[var43++];
                    }
                }
                var45--;
                this.field3985[var46] = (byte) var44;
            }
        }
        int var47 = 0;
        int var48 = 0;
        class48 var49 = null;
        for (int var50 = 0; var50 < 128; var50++) {
            if (this.field3987[var50] != 0) {
                if (var47 == 0) {
                    var49 = var19[var14[var48]];
                    if (var12.length > var48) {
                        var47 = var12[var48++];
                    } else {
                        var47 = -1;
                    }
                }
                this.field3995[var50] = var49;
                var47--;
            }
        }
        int var51 = 0;
        int var52 = 0;
        int var53 = 0;
        for (int var54 = 0; var54 < 128; var54++) {
            if (var51 == 0) {
                if (var53 < var29.length) {
                    var51 = var29[var53++];
                } else {
                    var51 = -1;
                }
                if (this.field3987[var54] > 0) {
                    var52 = var3.method1043(true) + 1;
                }
            }
            this.field3991[var54] = (byte) var52;
            var51--;
        }
        this.field3992 = var3.method1043(true) + 1;
        for (int var55 = 0; var55 < var15; var55++) {
            class48 var56 = var19[var55];
            if (var56.field546 != null) {
                for (int var57 = 1; var57 < var56.field546.length; var57 += 2) {
                    var56.field546[var57] = var3.method1028(79030408);
                }
            }
            if (var56.field545 != null) {
                for (int var58 = 3; var58 < var56.field545.length - 2; var58 += 2) {
                    var56.field545[var58] = var3.method1028(79030408);
                }
            }
        }
        if (var25 != null) {
            for (int var59 = 1; var59 < var25.length; var59 += 2) {
                var25[var59] = var3.method1028(79030408);
            }
        }
        if (var27 != null) {
            for (int var60 = 1; var60 < var27.length; var60 += 2) {
                var27[var60] = var3.method1028(79030408);
            }
        }
        for (int var61 = 0; var61 < var15; var61++) {
            class48 var62 = var19[var61];
            if (var62.field545 != null) {
                int var63 = 0;
                for (int var64 = 2; var64 < var62.field545.length; var64 += 2) {
                    var63 -= -var3.method1043(true) - 1;
                    var62.field545[var64] = (byte) var63;
                }
            }
        }
        for (int var65 = 0; var65 < var15; var65++) {
            class48 var66 = var19[var65];
            if (var66.field546 != null) {
                int var67 = 0;
                for (int var68 = 2; var68 < var66.field546.length; var68 += 2) {
                    var67 = var3.method1043(true) + var67 + 1;
                    var66.field546[var68] = (byte) var67;
                }
            }
        }
        if (var25 != null) {
            int var69 = var3.method1043(true);
            var25[0] = (byte) var69;
            for (int var70 = 2; var70 < var25.length; var70 += 2) {
                var69 = var69 + var3.method1043(true) + 1;
                var25[var70] = (byte) var69;
            }
            byte var71 = var25[0];
            byte var72 = var25[1];
            for (int var73 = 0; var73 < var71; var73++) {
                this.field3991[var73] = (byte) (this.field3991[var73] * var72 + 32 >> 6);
            }
            int var74 = 2;
            while (var25.length > var74) {
                byte var75 = var25[var74 + 1];
                byte var76 = var25[var74];
                int var77 = (var76 - var71) * var72 + ((var76 - var71) / 2);
                for (int var78 = var71; var78 < var76; var78++) {
                    int var79 = class79.method517(false, var76 - var71, var77);
                    var77 += var75 - var72;
                    this.field3991[var78] = (byte) (this.field3991[var78] * var79 + 32 >> 6);
                }
                var74 += 2;
                var71 = var76;
                var72 = var75;
            }
            Object var80 = null;
            for (int var81 = var71; var81 < 128; var81++) {
                this.field3991[var81] = (byte) (this.field3991[var81] * var72 + 32 >> 6);
            }
        }
        if (var27 != null) {
            int var82 = var3.method1043(true);
            var27[0] = (byte) var82;
            for (int var83 = 2; var83 < var27.length; var83 += 2) {
                var82 -= -var3.method1043(true) - 1;
                var27[var83] = (byte) var82;
            }
            byte var84 = var27[0];
            int var85 = var27[1] << 1;
            for (int var86 = 0; var86 < var84; var86++) {
                int var87 = (this.field3985[var86] & 0xFF) + var85;
                if (var87 < 0) {
                    var87 = 0;
                }
                if (var87 > 128) {
                    var87 = 128;
                }
                this.field3985[var86] = (byte) var87;
            }
            int var88 = 2;
            while (var88 < var27.length) {
                int var89 = var27[var88 + 1] << 1;
                byte var90 = var27[var88];
                int var91 = (var90 - var84) / 2 + (var90 - var84) * var85;
                for (int var92 = var84; var92 < var90; var92++) {
                    int var93 = class79.method517(false, var90 - var84, var91);
                    var91 += var89 - var85;
                    int var94 = (this.field3985[var92] & 0xFF) + var93;
                    if (var94 < 0) {
                        var94 = 0;
                    }
                    if (var94 > 128) {
                        var94 = 128;
                    }
                    this.field3985[var92] = (byte) var94;
                }
                var84 = var90;
                var88 += 2;
                var85 = var89;
            }
            Object var95 = null;
            for (int var96 = var84; var96 < 128; var96++) {
                int var97 = (this.field3985[var96] & 0xFF) + var85;
                if (var97 < 0) {
                    var97 = 0;
                }
                if (var97 > 128) {
                    var97 = 128;
                }
                this.field3985[var96] = (byte) var97;
            }
        }
        for (int var98 = 0; var98 < var15; var98++) {
            var19[var98].field549 = var3.method1043(true);
        }
        for (int var99 = 0; var99 < var15; var99++) {
            class48 var100 = var19[var99];
            if (var100.field546 != null) {
                var100.field543 = var3.method1043(true);
            }
            if (var100.field545 != null) {
                var100.field544 = var3.method1043(true);
            }
            if (var100.field549 > 0) {
                var100.field540 = var3.method1043(true);
            }
        }
        for (int var101 = 0; var101 < var15; var101++) {
            var19[var101].field548 = var3.method1043(true);
        }
        for (int var102 = 0; var102 < var15; var102++) {
            class48 var103 = var19[var102];
            if (var103.field548 > 0) {
                var103.field541 = var3.method1043(true);
            }
        }
        for (int var104 = 0; var104 < var15; var104++) {
            class48 var105 = var19[var104];
            if (var105.field541 > 0) {
                var105.field542 = var3.method1043(true);
            }
        }
    }
}
